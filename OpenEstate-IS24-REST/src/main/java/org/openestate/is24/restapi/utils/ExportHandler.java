/*
 * Copyright 2014 OpenEstate.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openestate.is24.restapi.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.xml.bind.JAXBException;
import oauth.signpost.exception.OAuthException;
import org.apache.commons.io.IOExceptionWithCause;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.openestate.is24.restapi.AbstractClient;
import org.openestate.is24.restapi.ImportExport;
import org.openestate.is24.restapi.xml.common.Attachment;
import org.openestate.is24.restapi.xml.common.Attachments;
import org.openestate.is24.restapi.xml.common.Link;
import org.openestate.is24.restapi.xml.common.Message;
import org.openestate.is24.restapi.xml.common.MessageCode;
import org.openestate.is24.restapi.xml.common.Messages;
import org.openestate.is24.restapi.xml.common.PDFDocument;
import org.openestate.is24.restapi.xml.common.Picture;
import org.openestate.is24.restapi.xml.common.PublishChannel;
import org.openestate.is24.restapi.xml.common.PublishChannels;
import org.openestate.is24.restapi.xml.common.PublishObject;
import org.openestate.is24.restapi.xml.common.PublishObjects;
import org.openestate.is24.restapi.xml.common.RealEstateState;
import org.openestate.is24.restapi.xml.common.RealtorContactDetails;
import org.openestate.is24.restapi.xml.common.StreamingVideo;
import org.openestate.is24.restapi.xml.offerlistelement.OfferRealEstateForList;
import org.openestate.is24.restapi.xml.offerlistelement.RealEstateList;
import org.openestate.is24.restapi.xml.realestates.RealEstate;
import org.openestate.is24.restapi.xml.realestates.RealEstates;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Handler for bulk exports.
 * <p>
 * The {@link ExportHandler} is part of the high level API for bulk exports of real
 * estate data.
 * <p>
 * A previously created {@link ExportPool} can be processed with the
 * {@link ExportHandler#export(org.openestate.is24.restapi.AbstractClient, org.openestate.is24.restapi.utils.ExportPool, boolean, boolean)}
 * method. The {@link ExportHandler} will launch the required low level
 * operations of the {@link ImportExport}-API for each pooled object.
 *
 * @since 0.2
 * @author Andreas Rudolph <andy@openindex.de>
 */
public class ExportHandler
{
  private final static Logger LOGGER = LoggerFactory.getLogger( ExportHandler.class );
  private final List<ExportMessage> messages = new ArrayList<ExportMessage>();
  private final List<String> savedContactIds = new ArrayList<String>();
  private final Map<String,Long> duplicatedContactIds = new HashMap<String, Long>();
  private AbstractClient client = null;
  private ExportPool pool = null;
  private long progress = 0;
  private long totalProgress = 0;
  private boolean useNewEnergySourceEnev2014Values = true;

  /**
   * Creates a new {@link ExportHandler}.
   */
  public ExportHandler()
  {
  }

  /**
   * Calback method to track progress during the export process.
   * <p>
   * This method may be overridden by inheriting classes in order to track the
   * progress of the export process.
   *
   * @param value
   * value of additional progress
   */
  protected final void addProgress( long value )
  {
    this.setProgress( this.progress + Math.abs( value ) );
  }

  /**
   * Callback method to check, if a contact should be updated in the export process.
   *
   * @param contact
   * contact person to update
   *
   * @param poolContactId
   * id of the contact person within export pool
   *
   * @return
   * true, if the contact person can be ignored in the export process
   */
  protected boolean canIgnoreContact( RealtorContactDetails contact, String poolContactId )
  {
    return false;
  }

  /**
   * Callback method to check, if a real estate should be updated in the export process.
   *
   * @param object
   * real estate to update
   *
   * @param poolObjectId
   * id of the real estate within export pool
   *
   * @return
   * true, if the real estate can be ignored in the export process
   */
  protected boolean canIgnoreObject( RealEstate object, String poolObjectId )
  {
    return false;
  }

  /**
   * Archivates a real estate object at the Webservice.
   *
   * @param externalObjectId
   * external real estate ID
   *
   * @throws IOException
   * if the operation failed
   */
  protected void doArchiveObject( String externalObjectId ) throws IOException
  {
    try
    {
      // Immobilie ermitteln
      final RealEstate is24Object;
      final Long is24ObjectId;
      try
      {
        is24Object = ImportExport.RealEstateService.getByExternalId(
          this.client, externalObjectId );
        if (is24Object==null)
        {
          this.putObjectMessage(
            externalObjectId, ExportMessage.Code.OBJECT_NOT_FOUND_FOR_ARCHIVING,
            "Property '" + externalObjectId + "' is not available anymore at the Webservice!" );
          return;
        }
        is24ObjectId = is24Object.getId();
      }
      catch (RequestFailedException ex)
      {
        LOGGER.error( "Can't get property '" + externalObjectId + "' from the Webservice!" );
        logMessagesAsError( ex.responseMessages );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
        this.putObjectMessage(
          externalObjectId, ExportMessage.Code.OBJECT_NOT_FOUND_FOR_ARCHIVING, ex.responseMessages );
        return;
      }

      // aktuelle Veröffentlichungen zur Immobilie ermitteln
      PublishObjects is24Publishings = null;
      try
      {
        is24Publishings = ImportExport.PublishService.get(
          this.client, is24ObjectId, 0 );
      }
      catch (RequestFailedException ex)
      {
        LOGGER.error( "Can't get publishings of property '" + externalObjectId + "' (" + is24ObjectId + ") from the Webservice!" );
        logMessagesAsError( ex.responseMessages );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
        this.putObjectMessage(
          externalObjectId, ExportMessage.Code.OBJECT_PUBLISHINGS_NOT_FOUND, ex.responseMessages );
      }

      // keine Veröffentlichungen gefunden
      if (is24Publishings==null)
      {
        this.putObjectMessage(
          externalObjectId, ExportMessage.Code.OBJECT_PUBLISHINGS_NOT_FOUND,
          "Can't get publishings of property '" + externalObjectId + "' (" + is24ObjectId + ") from the Webservice!" );
      }

      // ggf. Veröffentlichungen der Immobilie entfernen
      else
      {
        for (PublishObject publishing : is24Publishings.getPublishObject())
        {
          Long is24ChannelId = publishing.getPublishChannel().getId();
          String publishId = StringUtils.trimToNull( publishing.getId() );
          try
          {
            ImportExport.PublishService.delete(
              this.client, publishId );
          }
          catch (RequestFailedException ex)
          {
            LOGGER.error( "Can't unpublish property '" + externalObjectId + "' (" + is24ObjectId + ") "
              + "in channel '" + publishing.getPublishChannel().getTitle() + "' (" + is24ChannelId +  ") at the Webservice!" );
            logMessagesAsError( ex.responseMessages );
            LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
            this.putObjectMessage(
              externalObjectId, ExportMessage.Code.OBJECT_NOT_UNPUBLISHED, ex.responseMessages );
          }
        }
      }
    }
    catch (JAXBException ex)
    {
      throw new IOExceptionWithCause(
        "Can't read / write XML while communicating with the Webservice!", ex );
    }
    catch (OAuthException ex)
    {
      throw new IOExceptionWithCause(
        "Authorization failed!", ex );
    }
    catch (IOException ex)
    {
      throw new IOExceptionWithCause(
        "Communication failed!", ex );
    }
  }

  /**
   * Downloads an {@link URL} into a {@link File}.
   *
   * @param url
   * URL to download
   *
   * @return
   * downloaded file
   *
   * @throws IOException
   * if the operation failed
   */
  protected File doDownloadFile( URL url ) throws IOException
  {
    if (url==null) return null;
    LOGGER.info( "downloading " + url );
    InputStream input = null;
    OutputStream output = null;
    try
    {
      input = url.openStream();
      File tempFile = File.createTempFile( "is24-export-attachment-", ".bin" );
      tempFile.deleteOnExit();
      output = new FileOutputStream( tempFile );
      IOUtils.copy( input, output );
      output.flush();
      return tempFile;
    }
    finally
    {
      IOUtils.closeQuietly( output );
      IOUtils.closeQuietly( input );
    }
  }

  /**
   * Removes a real estate object from the Webservice.
   *
   * @param externalObjectId
   * external real estate ID
   *
   * @throws IOException
   * if the operation failed
   */
  protected void doRemoveObject( String externalObjectId ) throws IOException
  {
    try
    {
      // Löschung durchführen
      try
      {
        ImportExport.RealEstateService.deleteByExternalId(
          this.client, externalObjectId );
      }
      catch (RequestFailedException ex)
      {
        LOGGER.error( "Can't delete property '" + externalObjectId + "' at the Webservice!" );
        logMessagesAsError( ex.responseMessages );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
        this.putObjectMessage(
          externalObjectId, ExportMessage.Code.OBJECT_NOT_REMOVED, ex.responseMessages );
      }
    }
    catch (JAXBException ex)
    {
      throw new IOExceptionWithCause(
        "Can't read / write XML while communicating with the Webservice!", ex );
    }
    catch (OAuthException ex)
    {
      throw new IOExceptionWithCause(
        "Authorization failed!", ex );
    }
    catch (IOException ex)
    {
      throw new IOExceptionWithCause(
        "Communication failed!", ex );
    }
  }

  /**
   * Returns external ID's of real estates from the Webservice, that were not
   * changed during the current export process.
   *
   * @return
   * external ID's of untouched real estates
   *
   * @throws IOException
   * if the operation failed
   */
  protected String[] doListUntouchedObjects() throws IOException
  {
    try
    {
      final List<String> ids = new ArrayList<String>();

      // Immobilien im Bestand ermitteln
      int page = 1;
      while (true)
      {
        RealEstates is24Objects;
        try
        {
          is24Objects = ImportExport.RealEstateService.getAll(
            this.client, null, null, 0, page, false );
          if (is24Objects==null)
          {
            this.putGeneralMessage(
              ExportMessage.Code.OBJECTS_NOT_FOUND,
              "Can't get available properties from the Webservice!" );
            return new String[]{};
          }
        }
        catch (RequestFailedException ex)
        {
          LOGGER.error( "Can't get available properties from the Webservice!" );
          logMessagesAsError( ex.responseMessages );
          LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
          this.putGeneralMessage(
            ExportMessage.Code.OBJECTS_NOT_FOUND, ex.responseMessages );
          return new String[]{};
        }

        Integer totalPages = is24Objects.getPaging().getNumberOfPages();
        if (totalPages==null) totalPages = 0;

        RealEstateList is24ObjectList = is24Objects.getRealEstateList();
        if (is24ObjectList!=null && !is24ObjectList.getRealEstateElement().isEmpty())
        {
          for (OfferRealEstateForList is24Object : is24ObjectList.getRealEstateElement())
          {
            // Immobilien nur löschen,
            // wenn diese als "aktiv" bei IS24 markiert sind.
            //
            // TODO: Es ist hier nicht ganz klar, aus welchem XML-Element
            // der Immobilien-Status zu ermitteln ist.
            boolean isActive = RealEstateState.ACTIVE.equals( is24Object.getState() )
              || RealEstateState.ACTIVE.equals( is24Object.getRealEstateState() );
            if (!isActive) continue;

            // Immobilien nur zurückliefern,
            // wenn diese beim Exportvorgang nicht verändert wurden.
            String externalId = is24Object.getExternalId();
            if (!this.pool.hasObjectForExport( externalId ))
              ids.add( externalId );
          }
        }
        if (page>=totalPages) break;
        page++;
      }

      return ids.toArray( new String[ids.size()] );
    }
    catch (JAXBException ex)
    {
      throw new IOExceptionWithCause(
        "Can't read / write XML while communicating with the Webservice!", ex );
    }
    catch (OAuthException ex)
    {
      throw new IOExceptionWithCause(
        "Authorization failed!", ex );
    }
    catch (IOException ex)
    {
      throw new IOExceptionWithCause(
        "Communication failed!", ex );
    }
  }

  /**
   * Returns publish channels for the authorized agency.
   *
   * @return
   * publish channels
   *
   * @throws IOException
   * if the operation failed
   */
  protected PublishChannels doLoadPublishChannels() throws IOException
  {
    try
    {
      return ImportExport.PublishChannelService.get( this.client );
    }
    catch (RequestFailedException ex)
    {
      LOGGER.error( "Can't get publish channels from the Webservice!" );
      logMessagesAsError( ex.responseMessages );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      this.putGeneralMessage(
        ExportMessage.Code.PUBLISH_CHANNELS_NOT_FOUND, ex.responseMessages );
      return null;
    }
    catch (JAXBException ex)
    {
      //LOGGER.error( "Can't read / write XML while communicating with the Webservice!" );
      //LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      throw new IOExceptionWithCause(
        "Can't read / write XML while communicating with the Webservice!", ex );
    }
    catch (OAuthException ex)
    {
      //LOGGER.error( "Can't authorize at the Webservice!" );
      //LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      throw new IOExceptionWithCause(
        "Authorization failed!", ex );
    }
    catch (IOException ex)
    {
      //LOGGER.error( "Can't communicate with the Webservice!" );
      //LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      throw new IOExceptionWithCause(
        "Communication failed!", ex );
    }
  }

  /**
   * Saves a contact person to the Webservice.
   *
   * @param contact
   * contact to save
   *
   * @param poolContactId
   * contact ID within export pool
   *
   * @throws IOException
   * if the operation failed
   */
  protected void doUpdateContact( RealtorContactDetails contact, String poolContactId ) throws IOException
  {
    final String externalContactId = contact.getExternalId();
    try
    {
      // prüfen, ob ein Ansprechpartner mit der externen ID bereits im Webservice existiert
      final RealtorContactDetails oldIs24Contact;
      try
      {
        oldIs24Contact = ImportExport.ContactAddressService.getByExternalId(
          this.client, externalContactId );
      }
      catch (RequestFailedException ex)
      {
        LOGGER.error( "Can't get contact person '" + externalContactId + "' from the Webservice!" );
        logMessagesAsError( ex.responseMessages );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
        this.putContactMessage(
          externalContactId, ExportMessage.Code.CONTACT_NOT_FOUND, ex.responseMessages );
        return;
      }

      // neuen Ansprechpartner erstellen
      if (oldIs24Contact==null)
      {
        try
        {
          ImportExport.ContactAddressService.post(
            this.client, contact );
        }
        catch (RequestFailedException ex)
        {
          Resource resource = Resource.getMessageResource( ex.responseMessages );
          if (resource!=null && "duplicated contactDetails".equalsIgnoreCase( resource.type ) && resource.id>0)
          {
            LOGGER.info( "contact '" + externalContactId + "' is already "
              + "available at the Webservice with ID " + resource.id + "." );
            this.duplicatedContactIds.put( externalContactId, resource.id );
          }
          else
          {
            LOGGER.error( "Can't add contact person '" + externalContactId + "' to the Webservice!" );
            logMessagesAsError( ex.responseMessages );
            LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
            this.putContactMessage(
              externalContactId, ExportMessage.Code.CONTACT_NOT_SAVED, ex.responseMessages );
            return;
          }
        }
      }

      // bestehenden Ansprechpartner aktualisieren
      else
      {
        Long is24ContactId = oldIs24Contact.getId();
        contact.setId( is24ContactId );

        try
        {
          ImportExport.ContactAddressService.putByIs24Id(
            this.client, contact, is24ContactId );
        }
        catch (RequestFailedException ex)
        {
          Resource resource = Resource.getMessageResource( ex.responseMessages );
          if (resource!=null && "duplicated contactDetails".equalsIgnoreCase( resource.type ) && resource.id>0)
          {
            LOGGER.info( "contact '" + externalContactId + "' is already "
              + "available at the Webservice with ID " + resource.id + "." );
            this.duplicatedContactIds.put( externalContactId, resource.id );
          }
          else
          {
            LOGGER.error( "Can't update contact person '" + externalContactId + "' at the Webservice!" );
            logMessagesAsError( ex.responseMessages );
            LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
            this.putContactMessage(
              externalContactId, ExportMessage.Code.CONTACT_NOT_SAVED, ex.responseMessages );
          }
          return;
        }
      }

      // ID des Ansprechpartners als erfolgreich exportiert vormerken
      this.savedContactIds.add( externalContactId );
    }
    catch (JAXBException ex)
    {
      throw new IOExceptionWithCause(
        "Can't read / write XML while communicating with the Webservice!", ex );
    }
    catch (OAuthException ex)
    {
      throw new IOExceptionWithCause(
        "Authorization failed!", ex );
    }
    catch (IOException ex)
    {
      throw new IOExceptionWithCause(
        "Communication failed!", ex );
    }
    finally
    {
      // Fortschritt protokollieren
      this.addProgress(
        this.pool.getContactSize( poolContactId, true ) );
    }
  }

  /**
   * Saves a real estate to the Webservice.
   *
   * @param object
   * real estate to save
   *
   * @param is24PublishChannels
   * channels, where the real estate should be published
   *
   * @param poolObjectId
   * real estate ID within export pool
   *
   * @throws IOException
   * if the operation failed
   */
  protected void doUpdateObject( RealEstate object, PublishChannels is24PublishChannels, String poolObjectId ) throws IOException
  {
    final String externalObjectId = object.getExternalId();
    final org.openestate.is24.restapi.xml.common.ObjectFactory commonFactory =
      new org.openestate.is24.restapi.xml.common.ObjectFactory();
    final org.openestate.is24.restapi.xml.realestates.ObjectFactory realEstatesFactory =
      new org.openestate.is24.restapi.xml.realestates.ObjectFactory();
    final org.openestate.is24.restapi.xml.attachmentsorder.ObjectFactory attachmentsorderFactory =
      new org.openestate.is24.restapi.xml.attachmentsorder.ObjectFactory();

    object.setRealEstateState( RealEstateState.ACTIVE );

    String externalContactId = (object.getContact()!=null)?
      StringUtils.trimToNull( object.getContact().getExternalId() ): null;

    // Duplikat des Ansprechpartners verwenden
    if (externalContactId!=null && this.duplicatedContactIds.containsKey( externalContactId ))
    {
      long is24ContactId = this.duplicatedContactIds.get( externalContactId );
      if (object.getContact()==null)
        object.setContact( realEstatesFactory.createRealEstateContact() );
      object.getContact().setId( is24ContactId );
      object.getContact().setExternalId( null );
    }

    // sicherstellen, dass der Ansprechpartner vorher erfolgreich während des Transports exportiert wurde
    else if (externalContactId!=null && !this.savedContactIds.contains( externalContactId ))
    {
      this.putObjectMessage(
        externalObjectId, ExportMessage.Code.OBJECT_WITHOUT_CONTACT,
        "The contact '" + externalContactId + "' was not saved during the export process." );
      object.setContact( null );
    }

    try
    {
      // prüfen, ob eine Immobilie mit der externen ID bereits im Webservice existiert
      RealEstate oldIs24Object;
      try
      {
        oldIs24Object = ImportExport.RealEstateService.getByExternalId(
          this.client, externalObjectId );
      }
      catch (RequestFailedException ex)
      {
        LOGGER.error( "Can't get property '" + externalObjectId + "' from the Webservice!" );
        logMessagesAsError( ex.responseMessages );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
        this.putObjectMessage(
          externalObjectId, ExportMessage.Code.OBJECT_NOT_FOUND, ex.responseMessages );

        // Fortschritt protokollieren
        this.addProgress(
          this.pool.getObjectSize( poolObjectId, true ) );

        return;
      }

      //Messages responseMessages;
      final Long is24ObjectId;

      // Immobilie im Portal löschen,
      // wenn diese bereits im Portal existiert
      // und einer anderen Rubrik zugewiesen ist
      if (oldIs24Object!=null && !oldIs24Object.getClass().getName().equals( object.getClass().getName() ))
      {
        //LOGGER.debug( "RUBRIK GEÄNDERT" );
        //LOGGER.debug( "> für Immobilie #" + oldIs24Object.getId() );
        //LOGGER.debug( "> alte Rubrik " + oldIs24Object.getClass().getName() );
        //LOGGER.debug( "> neue Rubrik " + object.getClass().getName() );
        try
        {
          ImportExport.RealEstateService.deleteByIs24Id(
            this.client, oldIs24Object.getId() );
          oldIs24Object = null;
        }
        catch (RequestFailedException ex)
        {
          LOGGER.error( "Can't delete property '" + externalObjectId + "' (" + oldIs24Object.getId() + ") at the Webservice!" );
          logMessagesAsError( ex.responseMessages );
          LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
          this.putObjectMessage(
            externalObjectId, ExportMessage.Code.OBJECT_NOT_SAVED, ex.responseMessages );

          // Fortschritt protokollieren
          this.addProgress(
            this.pool.getObjectSize( poolObjectId, true ) );

          return;
        }
      }

      // neue Immobilie erstellen
      if (oldIs24Object==null)
      {
        try
        {
          is24ObjectId = ImportExport.RealEstateService.post(
            this.client, object, this.isUseNewEnergySourceEnev2014Values() );
        }
        catch (RequestFailedException ex)
        {
          LOGGER.error( "Can't add property '" + externalObjectId + "' to the Webservice!" );
          logMessagesAsError( ex.responseMessages );
          LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
          this.putObjectMessage(
            externalObjectId, ExportMessage.Code.OBJECT_NOT_SAVED, ex.responseMessages );

          // Fortschritt protokollieren
          this.addProgress(
            this.pool.getObjectSize( poolObjectId, true ) );

          return;
        }
      }

      // bestehende Immobilie aktualisieren
      else
      {
        is24ObjectId = oldIs24Object.getId();
        object.setId( is24ObjectId );

        try
        {
          ImportExport.RealEstateService.putByIs24Id(
            this.client, object, is24ObjectId, this.isUseNewEnergySourceEnev2014Values() );
        }
        catch (RequestFailedException ex)
        {
          LOGGER.error( "Can't update property '" + externalObjectId + "' (" + is24ObjectId + ") at the Webservice!" );
          logMessagesAsError( ex.responseMessages );
          LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
          this.putObjectMessage(
            externalObjectId, ExportMessage.Code.OBJECT_NOT_SAVED, ex.responseMessages );

          // Fortschritt protokollieren
          this.addProgress(
            this.pool.getObjectSize( poolObjectId, true ) );

          return;
        }
      }

      // Fortschritt protokollieren
      this.addProgress(
        this.pool.getObjectSize( poolObjectId, false ) );

      // bestehende Anhänge / Web-Links ermitteln
      boolean ignoreAttachments = false;
      Attachments oldIs24Attachments = null;
      try
      {
        oldIs24Attachments = ImportExport.AttachmentService.getAll(
          this.client, externalObjectId );
      }
      catch (RequestFailedException ex)
      {
        LOGGER.error( "Can't get attachments of property '" + externalObjectId + "' (" + is24ObjectId + ") from the Webservice!" );
        logMessagesAsError( ex.responseMessages );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
        this.putObjectMessage(
          externalObjectId, ExportMessage.Code.OBJECT_WITHOUT_ATTACHMENTS, ex.responseMessages );
        ignoreAttachments = true;
      }

      if (ignoreAttachments)
      {
        // Fortschritt protokollieren
        long totalAttachmentSize = this.pool.getObjectSize( poolObjectId, true )
          - this.pool.getObjectSize( poolObjectId, false );
        this.addProgress( totalAttachmentSize );
      }

      else
      {
        // ggf. bestehende Anhänge / Web-Links entfernen
        if (oldIs24Attachments!=null && !oldIs24Attachments.getAttachment().isEmpty())
        {
          for (Attachment is24Attachment : oldIs24Attachments.getAttachment())
          {
            Long is24AttachmentId = is24Attachment.getId();
            try
            {
              ImportExport.AttachmentService.deleteById(
                this.client, externalObjectId, is24AttachmentId );
            }
            catch (RequestFailedException ex)
            {
              LOGGER.error( "Can't remove attachment (" + is24AttachmentId + ") "
                + "of property '" + externalObjectId + "' (" + is24ObjectId + ") from the Webservice!" );
              logMessagesAsError( ex.responseMessages );
              LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
              this.putObjectMessage(
                externalObjectId, ExportMessage.Code.OBJECT_OLD_ATTACHMENT_NOT_REMOVED, ex.responseMessages );
            }
          }
        }

        // Anhänge aus dem Exportverzeichnis der Immobilie ermitteln
        Map<Integer,Long> attachmentsOrder = new TreeMap<Integer,Long>();
        for (String attachmentId : this.pool.getObjectAttachmentIds( poolObjectId ))
        {
          //LOGGER.debug( "process attachment '" + attachmentId + "' for object '" + poolObjectId + "'" );
          int pos;
          try
          {
            pos = Math.abs( Integer.parseInt( attachmentId ) );
          }
          catch (NumberFormatException ex)
          {
            LOGGER.warn( "Can't read attachment position!" );
            LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
            pos = 999;
          }

          Attachment is24Attachment = this.pool.getObjectAttachment( poolObjectId, attachmentId );
          if (is24Attachment==null)
          {
            LOGGER.error( "Can't read the XML file for attachment!" );
            this.putObjectMessage(
              externalObjectId, ExportMessage.Code.OBJECT_ATTACHMENT_NOT_SAVED,
              "Can't read the XML file for attachment!" );

            // Fortschritt protokollieren
            this.addProgress(
              this.pool.getObjectAttachmentSize( poolObjectId, attachmentId ) );

            continue;
          }

          // Anhang als Web-Link verarbeiten
          if (is24Attachment instanceof Link)
          {
            try
            {
              ImportExport.AttachmentService.post(
                this.client, externalObjectId, is24Attachment, null, null, null );
            }
            catch (RequestFailedException ex)
            {
              LOGGER.error( "Can't add attachment of property '" + externalObjectId + "' (" + is24ObjectId + ") to the Webservice!" );
              logMessagesAsError( ex.responseMessages );
              LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
              this.putObjectMessage(
                externalObjectId, ExportMessage.Code.OBJECT_ATTACHMENT_NOT_SAVED, ex.responseMessages );
            }

            // Fortschritt protokollieren
            this.addProgress(
              this.pool.getObjectAttachmentSize( poolObjectId, attachmentId ) );

            continue;
          }

          // Datei ermitteln
          File attachFile = this.pool.getObjectAttachmentFile( poolObjectId, is24Attachment );

          // ggf. Datei herunterladen, wenn noch nicht im Pool hinterlegt
          if (attachFile==null)
          {
            URL attachUrl = this.pool.getObjectAttachmentURL( poolObjectId, attachmentId );
            if (attachUrl!=null)
            {
              try
              {
                attachFile = doDownloadFile( attachUrl );
              }
              catch (Exception ex)
              {
                LOGGER.warn( "Can't download file from URL: " + attachUrl );
                LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
              }
            }
          }

          if (attachFile==null || !attachFile.isFile())
          {
            LOGGER.error( "Can't find file for attachment!" );
            this.putObjectMessage(
              externalObjectId, ExportMessage.Code.OBJECT_ATTACHMENT_NOT_SAVED,
              "Can't find file for attachment!" );

            // Fortschritt protokollieren
            this.addProgress(
              this.pool.getObjectAttachmentSize( poolObjectId, attachmentId ) );

            continue;
          }
          String attachFileName = attachFile.getName();
          long attachFileSize = attachFile.length();

          // MIME-Type ermitteln
          final String attachFileMimeType;
          if (is24Attachment instanceof PDFDocument)
          {
            attachFileMimeType = "application/pdf";
          }
          else if (is24Attachment instanceof Picture)
          {
            if (attachFileName.toLowerCase().endsWith( ".png" ))
              attachFileMimeType = "image/png";
            else if (attachFileName.toLowerCase().endsWith( ".gif" ))
              attachFileMimeType = "image/gif";
            else
              attachFileMimeType = "image/jpeg";
          }
          //else if (is24Attachment instanceof VideoFile)
          //{
          //  mimeType = "application/octet-stream";
          //}
          else
          {
            //mimeType = "application/octet-stream";
            attachFileMimeType = null;
          }

          InputStream attachFileInput = null;
          try
          {
            attachFileInput = new FileInputStream( attachFile );

            // Video auf separaten Webservice übertragen
            if (is24Attachment instanceof StreamingVideo)
            {
              // Videodatei via UploadService übertragen
              //LOGGER.debug( "UPLOAD STREAMING VIDEO '" + attachFileName + "'" );
              String videoId = ImportExport.VideoUploadService.doVideoUpload(
                this.client, attachFileInput, attachFileName, attachFileSize );

              // Anhang mit ID des übertragenen Videos zum Webservice senden
              //LOGGER.debug( "POST STREAMING VIDEO WITH ID '" + videoId + "'" );
              StreamingVideo streamingVideo = (StreamingVideo) is24Attachment;
              streamingVideo.setVideoId( videoId );
              ImportExport.AttachmentService.post(
                this.client, externalObjectId, streamingVideo, null, null, null );
            }

            // Anhang direkt übertragen
            else
            {
              long is24AttachmentId = ImportExport.AttachmentService.post(
                this.client, externalObjectId, is24Attachment, attachFileInput, attachFileName, attachFileMimeType );
              while (attachmentsOrder.containsKey( pos )) pos++;
              attachmentsOrder.put( pos, is24AttachmentId );
            }
          }
          catch (RequestFailedException ex)
          {
            LOGGER.error( "Can't add attachment of property '" + externalObjectId + "' (" + is24ObjectId + ") to the Webservice!" );
            logMessagesAsError( ex.responseMessages );
            LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
            this.putObjectMessage(
              externalObjectId, ExportMessage.Code.OBJECT_ATTACHMENT_NOT_SAVED, ex.responseMessages );
          }
          finally
          {
            IOUtils.closeQuietly( attachFileInput );

            // Fortschritt protokollieren
            this.addProgress(
              this.pool.getObjectAttachmentSize( poolObjectId, attachmentId ) + attachFileSize );
          }
        }

        // Reihenfolge der Bild-Anhänge explizit setzen
        if (!attachmentsOrder.isEmpty())
        {
          org.openestate.is24.restapi.xml.attachmentsorder.List list =
            attachmentsorderFactory.createList();
          for (Long is24AttachmentId : attachmentsOrder.values())
          {
            list.getAttachmentId().add( is24AttachmentId );
          }
          try
          {
            ImportExport.AttachmentsOrderService.put(
              this.client, externalObjectId, list );
          }
          catch (RequestFailedException ex)
          {
            LOGGER.error( "Can't order attachments of property '" + externalObjectId + "' (" + is24ObjectId + ")!" );
            logMessagesAsError( ex.responseMessages );
            LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
            this.putObjectMessage(
              externalObjectId, ExportMessage.Code.OBJECT_UNORDERED_ATTACHMENTS, ex.responseMessages );
          }
        }
      }

      // derzeitige Veröffentlichungen zur Immobilie ermitteln
      final List<Long> is24PublishedChannels = new ArrayList<Long>();
      try
      {
        PublishObjects is24Publishings = ImportExport.PublishService.get( this.client, is24ObjectId, 0 );
        if (is24Publishings!=null)
        {
          for (PublishObject is24Publishing : is24Publishings.getPublishObject())
          {
            is24PublishedChannels.add( is24Publishing.getPublishChannel().getId() );
          }
        }
      }
      catch (RequestFailedException ex)
      {
        LOGGER.error( "Can't get publishings of property '" + externalObjectId + "' (" + is24ObjectId + ") from the Webservice!" );
        logMessagesAsError( ex.responseMessages );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
        this.putObjectMessage(
          externalObjectId, ExportMessage.Code.OBJECT_PUBLISHINGS_NOT_FOUND, ex.responseMessages );
      }

      if (is24PublishChannels==null)
      {
        this.putObjectMessage(
          externalObjectId, ExportMessage.Code.OBJECT_NOT_PUBLISHED,
          "No channels for publishing found!" );
      }
      else
      {
        // Veröffentlichungen zur Immobilie aktualisieren,
        // wenn diese zu einem Kanal noch nicht gesetzt wurde
        for (PublishChannel is24Channel : is24PublishChannels.getPublishChannel())
        {
          Long is24ChannelId = is24Channel.getId();
          if (is24PublishedChannels.contains( is24ChannelId ))
            continue;

          PublishObject is24Publishing = commonFactory.createPublishObject();
          is24Publishing.setPublishChannel( is24Channel );
          is24Publishing.setRealEstate( commonFactory.createPublishObjectRealEstate() );
          is24Publishing.getRealEstate().setId( is24ObjectId );

          try
          {
            ImportExport.PublishService.post( this.client, is24Publishing );
          }
          catch (RequestFailedException ex)
          {
            LOGGER.error( "Can't publish property '" + externalObjectId + "' (" + is24ObjectId + ") "
              + "in channel '" + is24Channel.getTitle() + "' (" + is24ChannelId +  ")!" );
            logMessagesAsError( ex.responseMessages );
            LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
            this.putObjectMessage(
              externalObjectId, ExportMessage.Code.OBJECT_NOT_PUBLISHED, ex.responseMessages );
          }
        }
      }
    }
    catch (JAXBException ex)
    {
      //LOGGER.error( "Can't read / write XML while communicating with the Webservice!" );
      //LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      throw new IOExceptionWithCause(
        "Can't read / write XML while communicating with the Webservice!", ex );
    }
    catch (OAuthException ex)
    {
      //LOGGER.error( "Can't authorize at the Webservice!" );
      //LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      throw new IOExceptionWithCause(
        "Authorization failed!", ex );
    }
    catch (IOException ex)
    {
      //LOGGER.error( "Can't communicate with the Webservice!" );
      //LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      throw new IOExceptionWithCause(
        "Communication failed!", ex );
    }
  }

  /**
   * Starts the export of an {@link ExportPool}.
   *
   * @param client
   * client, that is used for transfers
   *
   * @param pool
   * pool with exportable data
   *
   * @param archivateUnpublishedObjects
   * archivate old real estates instead of removal
   *
   * @param unpublishUntouchedObjects
   * archivate or remove untouched real estates (means full transfer instead of
   * incremental)
   *
   * @return
   * messages, that occured during the export process
   *
   * @throws IOException
   * if the operation failed
   */
  public ExportMessage[] export( AbstractClient client, ExportPool pool, boolean archivateUnpublishedObjects, boolean unpublishUntouchedObjects ) throws IOException
  {
    this.client = client;
    this.pool = pool;
    this.messages.clear();
    this.savedContactIds.clear();
    this.duplicatedContactIds.clear();

    // init progress
    this.totalProgress = this.pool.getTotalSize();
    this.setProgress( 0 );

    // load available publish channels
    LOGGER.info( "loading publish channels" );
    final PublishChannels publishChannels = doLoadPublishChannels();

    // updating contacts
    LOGGER.info( "updating contacts" );
    String[] ids = this.pool.getContactIds();
    int counter = 0;
    for (String poolContactId : ids)
    {
      counter++;

      // Ansprechpartner ermitteln
      final RealtorContactDetails contact = this.pool.getContact( poolContactId );
      if (contact==null)
      {
        // Fortschritt protokollieren
        this.addProgress(
          this.pool.getContactSize( poolContactId, true ) );

        this.putGeneralMessage(
          ExportMessage.Code.XML_NOT_READABLE,
          "Can't read XML file for contact '" + poolContactId + "'!" );
      }
      else if (this.canIgnoreContact( contact, poolContactId ))
      {
        LOGGER.info( "[" + counter + " / " + ids.length +"] "
          + "ignoring contact '" + contact.getExternalId() + "'" );

        // Fortschritt protokollieren
        this.addProgress(
          this.pool.getContactSize( poolContactId, true ) );
      }
      else
      {
        LOGGER.info( "[" + counter + " / " + ids.length +"] "
          + "updating contact '" + contact.getExternalId() + "'" );
        this.doUpdateContact( contact, poolContactId );
      }
    }

    // updating objects
    LOGGER.info( "updating objects" );
    ids = this.pool.getObjectIds();
    counter = 0;
    for (String poolObjectId : ids)
    {
      counter++;

      // Immobilie  aus ExportPool ermitteln
      RealEstate object = this.pool.getObject( poolObjectId );
      if (object==null)
      {
        // Fortschritt protokollieren
        this.addProgress(
          this.pool.getObjectSize( poolObjectId, true ) );

        this.putGeneralMessage(
          ExportMessage.Code.XML_NOT_READABLE,
          "Can't read XML file for property '" + poolObjectId + "'!" );
      }
      else if (this.canIgnoreObject( object, poolObjectId ))
      {
        LOGGER.info( "[" + counter + " / " + ids.length +"] "
          + "ignoring object '" + object.getExternalId() + "'" );

        // Fortschritt protokollieren
        this.addProgress(
          this.pool.getObjectSize( poolObjectId, true ) );
      }
      else
      {
        LOGGER.info( "[" + counter + " / " + ids.length +"] "
          + "updating object '" + object.getExternalId() + "'" );
        this.doUpdateObject( object, publishChannels, poolObjectId );
      }
    }

    // removing objects
    LOGGER.info( "removing objects" );
    ids = this.pool.getObjectIdsForRemoval();
    counter = 0;
    for (String externalObjectId : ids)
    {
      counter++;
      if (archivateUnpublishedObjects)
      {
        LOGGER.info( "[" + counter + " / " + ids.length +"] "
          + "archiving object '" + externalObjectId + "'" );
        this.doArchiveObject( externalObjectId );
      }
      else
      {
        LOGGER.info( "[" + counter + " / " + ids.length +"] "
          + "removing object '" + externalObjectId + "'" );
        this.doRemoveObject( externalObjectId );
      }
    }

    // removing untouched objects
    if (unpublishUntouchedObjects)
    {
      LOGGER.info( "removing untouched objects" );
      ids = this.doListUntouchedObjects();
      counter = 0;
      for (String externalObjectId : ids)
      {
        counter++;
        if (archivateUnpublishedObjects)
        {
          LOGGER.info( "[" + counter + " / " + ids.length +"] "
            + "archiving untouched object '" + externalObjectId + "'" );
          this.doArchiveObject( externalObjectId );
        }
        else
        {
          LOGGER.info( "[" + counter + " / " + ids.length +"] "
            + "removing untouched object '" + externalObjectId + "'" );
          this.doRemoveObject( externalObjectId );
        }
      }
    }

    return this.getMessages();
  }

  /**
   * Returns the client of the current export process.
   *
   * @return
   * client
   */
  protected final AbstractClient getClient()
  {
    return client;
  }

  /**
   * Returns messages, that occured during the last export process.
   *
   * @return
   * messages
   */
  public final ExportMessage[] getMessages()
  {
    return this.messages.toArray( new ExportMessage[this.messages.size()] );
  }

  /**
   * Returns messages for a certain contact person, that occured during the last
   * export process.
   *
   * @param externalContactId
   * external contact ID
   *
   * @return
   * messages
   */
  public final ExportMessage[] getMessagesForContact( String externalContactId )
  {
    externalContactId = StringUtils.trimToNull( externalContactId );
    if (externalContactId==null) return new ExportMessage[]{};
    List<ExportMessage> msgs = new ArrayList<ExportMessage>();
    for (ExportMessage msg : this.messages)
    {
      if (externalContactId.equals( msg.getContactId() )) msgs.add( msg );
    }
    return msgs.toArray( new ExportMessage[msgs.size()] );
  }

  /**
   * Returns messages for a certain real estate, that occured during the last
   * export process.
   *
   * @param externalObjectId
   * real estate ID
   *
   * @return
   * messages
   */
  public final ExportMessage[] getMessagesForObject( String externalObjectId )
  {
    externalObjectId = StringUtils.trimToNull( externalObjectId );
    if (externalObjectId==null) return new ExportMessage[]{};
    List<ExportMessage> msgs = new ArrayList<ExportMessage>();
    for (ExportMessage msg : this.messages)
    {
      if (externalObjectId.equals( msg.getObjectId() )) msgs.add( msg );
    }
    return msgs.toArray( new ExportMessage[msgs.size()] );
  }

  /**
   * Returns general messages, that occured during the last export process.
   *
   * @return
   * messages
   */
  public final ExportMessage[] getMessagesGeneral()
  {
    List<ExportMessage> msgs = new ArrayList<ExportMessage>();
    for (ExportMessage msg : this.messages)
    {
      if (msg.isGeneral()) msgs.add( msg );
    }
    return msgs.toArray( new ExportMessage[msgs.size()] );
  }

  /**
   * Returns the pool of the current export process.
   *
   * @return
   * pool
   */
  protected final ExportPool getPool()
  {
    return pool;
  }

  /**
   * Returns the progress of the current export process.
   *
   * @return
   * current progress value
   */
  protected final long getProgress()
  {
    return progress;
  }

  /**
   * Returns the total progress of the current export process.
   *
   * @return
   * total progress value
   */
  protected final long getTotalProgress()
  {
    return totalProgress;
  }

  /**
   * Checks, if all values for "energySourceEnev2014" are enabled.
   *
   * @return
   * true, if all values for "energySourceEnev2014" are enabled
   *
   * @see <a href="http://api.immobilienscout24.de/useful/energy-certificate-2014.html">notes about Energy Certificate 2014</a>
   */
  public boolean isUseNewEnergySourceEnev2014Values()
  {
    return useNewEnergySourceEnev2014Values;
  }

  /**
   * Sends {@link Messages} from a Webservice response to the local logger.
   *
   * @param messages
   * messages
   */
  private void logMessagesAsError( Messages messages )
  {
    if (messages==null || messages.getMessage().isEmpty()) return;
    for (Message m : messages.getMessage())
    {
      LOGGER.error( "> " + m.getMessageCode() + " | " + m.getMessage() );
    }
  }

  /**
   * Calback method, that is called after the progress has changed.
   * <p>
   * This method may be overridden by inheriting classes in order to track the
   * progress of the export process.
   *
   * @param progress
   * current progress value
   *
   * @param totalProgress
   * total progress value
   */
  protected void progressUpdated( long progress, long totalProgress )
  {
  }

  /**
   * Registers a message for a contact person.
   *
   * @param externalContactId
   * external contact ID
   *
   * @param code
   * message code
   *
   * @param msg
   * message text
   */
  protected void putContactMessage( String externalContactId, ExportMessage.Code code, String msg )
  {
    this.messages.add( ExportMessage.newContactMessage( externalContactId, code, msg ) );
  }

  /**
   * Registers messages for a contact person.
   *
   * @param externalContactId
   * external contact ID
   *
   * @param code
   * message code
   *
   * @param msgs
   * messages, that were received from the Webservice
   */
  protected void putContactMessage( String externalContactId, ExportMessage.Code code, Messages msgs )
  {
    if (msgs==null) return;
    for (Message message : msgs.getMessage())
    {
      MessageCode is24Code = message.getMessageCode();
      String is24Msg = StringUtils.trimToNull( message.getMessage() );

      String txt = StringUtils.EMPTY;
      if (is24Code!=null) txt += is24Code.value();
      if (is24Msg!=null)
      {
        if (!StringUtils.isBlank( txt )) txt += " | ";
        txt += is24Msg;
      }

      this.putContactMessage( externalContactId, code, txt );
    }
  }

  /**
   * Registers a general message.
   *
   * @param code
   * message code
   *
   * @param msg
   * message text
   */
  protected void putGeneralMessage( ExportMessage.Code code, String msg )
  {
    this.messages.add( ExportMessage.newGeneralMessage( msg, code ) );
  }

  /**
   * Registers general messages.
   *
   * @param code
   * message code
   *
   * @param msgs
   * messages, that were received from the Webservice
   */
  protected void putGeneralMessage( ExportMessage.Code code, Messages msgs )
  {
    if (msgs==null) return;
    for (Message message : msgs.getMessage())
    {
      MessageCode is24Code = message.getMessageCode();
      String is24Msg = StringUtils.trimToNull( message.getMessage() );

      String txt = StringUtils.EMPTY;
      if (is24Code!=null) txt += is24Code.value();
      if (is24Msg!=null)
      {
        if (!StringUtils.isBlank( txt )) txt += " | ";
        txt += is24Msg;
      }

      this.putGeneralMessage( code, txt );
    }
  }

  /**
   * Registers a message for a real estate.
   *
   * @param externalObjectId
   * external real estate ID
   *
   * @param code
   * message code
   *
   * @param msg
   * message text
   */
  protected void putObjectMessage( String externalObjectId, ExportMessage.Code code, String msg )
  {
    this.messages.add( ExportMessage.newObjectMessage( externalObjectId, code, msg ) );
  }

  /**
   * Registers messages for a real estate.
   *
   * @param externalObjectId
   * external real estate ID
   *
   * @param code
   * message code
   *
   * @param msgs
   * messages, that were received from the Webservice
   */
  protected void putObjectMessage( String externalObjectId, ExportMessage.Code code, Messages msgs )
  {
    if (msgs==null) return;
    for (Message message : msgs.getMessage())
    {
      MessageCode is24Code = message.getMessageCode();
      String is24Msg = StringUtils.trimToNull( message.getMessage() );

      String txt = StringUtils.EMPTY;
      if (is24Code!=null) txt += is24Code.value();
      if (is24Msg!=null)
      {
        if (!StringUtils.isBlank( txt )) txt += " | ";
        txt += is24Msg;
      }

      this.putObjectMessage( externalObjectId, code, txt );
    }
  }

  /**
   * Sets the progress of the current export process.
   *
   * @param progress
   * current progress value
   */
  protected final void setProgress( long progress )
  {
    progress = Math.abs( progress );
    this.progress = (progress<=this.totalProgress)?
      progress: this.totalProgress;

    // launch callback function for progress
    progressUpdated( this.progress, this.totalProgress );
  }

  /**
   * Enables / disables all values for "energySourceEnev2014".
   *
   * @param useNewEnergySourceEnev2014Values
   * enabled / disabled
   *
   * @see <a href="http://api.immobilienscout24.de/useful/energy-certificate-2014.html">notes about Energy Certificate 2014</a>
   */
  public void setUseNewEnergySourceEnev2014Values( boolean useNewEnergySourceEnev2014Values )
  {
    this.useNewEnergySourceEnev2014Values = useNewEnergySourceEnev2014Values;
  }
}