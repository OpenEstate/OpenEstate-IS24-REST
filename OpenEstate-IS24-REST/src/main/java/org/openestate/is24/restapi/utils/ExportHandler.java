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
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.xml.bind.JAXBException;
import oauth.signpost.exception.OAuthException;
import org.apache.commons.io.IOExceptionWithCause;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.openestate.is24.restapi.AbstractClient;
import org.openestate.is24.restapi.ImportExport;
import org.openestate.is24.restapi.xml.common.Attachment;
import org.openestate.is24.restapi.xml.common.Attachments;
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
 * ExportHandler.
 *
 * @author Andreas Rudolph <andy@openindex.de>
 */
public class ExportHandler
{
  private final static Logger LOGGER = LoggerFactory.getLogger( ExportHandler.class );
  private final List<ExportMessage> messages = new ArrayList<ExportMessage>();
  private final List<String> updatedContactIds = new ArrayList<String>();
  private final List<String> updatedObjectIds = new ArrayList<String>();
  private AbstractClient client = null;
  private ExportPool pool = null;
  private long progress = 0;
  private long totalProgress = 0;

  public ExportHandler()
  {
  }

  protected final void addProgress( long value )
  {
    this.setProgress( this.progress + Math.abs( value ) );
  }

  protected void doArchiveObject( String externalObjectId ) throws IOException
  {
    try
    {
      // Immobilie ermitteln
      final RealEstate is24Object;
      final Long is24ObjectId;
      final boolean isAlreadyDeleted;
      try
      {
        is24Object = ImportExport.RealEstateService.getByExternalId(
          this.client, externalObjectId );
        if (is24Object==null)
        {
          //transport.addMessageToExportContext(
          //  ResponseCode.IS24_TRANSPORT_CANT_LOOKUP_PROPERTY_FOR_DELETE,
          //  externalObjectId,
          //  "Property '" + externalObjectId + "' is not available anymore at the webservice!",
          //  context );
          this.putObjectMessage(
            externalObjectId, ExportMessage.Code.OBJECT_NOT_FOUND,
            "Property '" + externalObjectId + "' is not available anymore at the webservice!" );
          return;
        }
        isAlreadyDeleted = RealEstateState.TO_BE_DELETED.equals( is24Object.getRealEstateState() );
        if (!isAlreadyDeleted) is24Object.setRealEstateState( RealEstateState.TO_BE_DELETED );
        is24ObjectId = is24Object.getId();
      }
      catch (RequestFailedException ex)
      {
        LOGGER.error( "Can't get property '" + externalObjectId + "' from the webservice!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
        //transport.addMessagesToExportContext(
        //  ResponseCode.IS24_TRANSPORT_CANT_LOOKUP_PROPERTY,
        //  externalObjectId,
        //  ex.responseMessages,
        //  context );
        this.putObjectMessage(
          externalObjectId, ExportMessage.Code.OBJECT_NOT_FOUND, ex.responseMessages );
        return;
      }

      // Archivierung durchführen

      // ggf. den Lösch-Status in Immobilie speichern
      if (!isAlreadyDeleted)
      {
        try
        {
          ImportExport.RealEstateService.putByIs24Id(
            this.client, is24Object, is24ObjectId );
        }
        catch (RequestFailedException ex)
        {
          LOGGER.error( "Can't disable property '" + externalObjectId + "' (" + is24ObjectId + ") at the webservice!" );
          LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
          //transport.addMessagesToExportContext(
          //  ResponseCode.IS24_TRANSPORT_CANT_DISABLE_PROPERTY,
          //  externalObjectId,
          //  ex.responseMessages,
          //  context );
          this.putObjectMessage(
            externalObjectId, ExportMessage.Code.OBJECT_NOT_DISABLED, ex.responseMessages );
        }
      }

      // aktuelle Veröffentlichungen zur Immobilie ermitteln
      PublishObjects is24Publishings = null;
      try
      {
        is24Publishings = ImportExport.PublishService.get(
          this.client, is24ObjectId, 0 );
        if (is24Publishings==null)
        {
          //transport.addMessageToExportContext(
          //  ResponseCode.IS24_TRANSPORT_CANT_LOOKUP_PROPERTY_PUBLISHINGS,
          //  externalObjectId,
          //  "Can't get publishings of property '" + externalObjectId + "' (" + is24ObjectId + ") from the webservice!",
          //  context );
          this.putObjectMessage(
            externalObjectId, ExportMessage.Code.OBJECT_PUBLISHINGS_NOT_FOUND,
            "Can't get publishings of property '" + externalObjectId + "' (" + is24ObjectId + ") from the webservice!" );
        }
      }
      catch (RequestFailedException ex)
      {
        LOGGER.error( "Can't get publishings of property '" + externalObjectId + "' (" + is24ObjectId + ") from the webservice!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
        //transport.addMessagesToExportContext(
        //  ResponseCode.IS24_TRANSPORT_CANT_LOOKUP_PROPERTY_PUBLISHINGS,
        //  externalObjectId,
        //  ex.responseMessages,
        //  context );
        this.putObjectMessage(
          externalObjectId, ExportMessage.Code.OBJECT_PUBLISHINGS_NOT_FOUND, ex.responseMessages );
      }

      // ggf. Veröffentlichungen zur Immobilie aktualisieren
      if (is24Publishings!=null)
      {
        for (PublishObject publishing : is24Publishings.getPublishObject())
        {
          Long is24ChannelId = publishing.getPublishChannel().getId();
          String publishId = StringUtils.trimToNull( publishing.getId() );
          try
          {
            ImportExport.PublishService.deleteById(
              this.client, publishId );
          }
          catch (RequestFailedException ex)
          {
            LOGGER.error( "Can't unpublish property '" + externalObjectId + "' (" + is24ObjectId + ") "
              + "in channel '" + publishing.getPublishChannel().getTitle() + "' (" + is24ChannelId +  ") at the webservice!" );
            LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
            //transport.addMessagesToExportContext(
            //  ResponseCode.IS24_TRANSPORT_CANT_UNPUBLISH_PROPERTY,
            //  externalObjectId,
            //  ex.responseMessages,
            //  context );
            this.putObjectMessage(
              externalObjectId, ExportMessage.Code.OBJECT_NOT_UNPUBLISHED, ex.responseMessages );
          }
        }
      }
    }
    catch (JAXBException ex)
    {
      //LOGGER.error( "Can't read / write XML while communicating with the webservice!" );
      //LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      throw new IOExceptionWithCause(
        "Can't read / write XML while communicating with the webservice!", ex );
    }
    catch (OAuthException ex)
    {
      //LOGGER.error( "Can't authorize at the webservice!" );
      //LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      throw new IOExceptionWithCause(
        "Authorization failed!", ex );
    }
    catch (IOException ex)
    {
      //LOGGER.error( "Can't communicate with the webservice!" );
      //LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      throw new IOExceptionWithCause(
        "Communication failed!", ex );
    }
  }

  protected void doRemoveObject( String externalObjectId ) throws IOException
  {
    try
    {
      // Immobilie ermitteln
      final RealEstate is24Object;
      final Long is24ObjectId;
      final boolean isAlreadyDeleted;
      try
      {
        is24Object = ImportExport.RealEstateService.getByExternalId(
          this.client, externalObjectId );
        if (is24Object==null)
        {
          //transport.addMessageToExportContext(
          //  ResponseCode.IS24_TRANSPORT_CANT_LOOKUP_PROPERTY_FOR_DELETE,
          //  externalObjectId,
          //  "Property '" + externalObjectId + "' is not available anymore at the webservice!",
          //  context );
          this.putObjectMessage(
            externalObjectId, ExportMessage.Code.OBJECT_NOT_FOUND,
            "Property '" + externalObjectId + "' is not available anymore at the webservice!" );
          return;
        }
        isAlreadyDeleted = RealEstateState.TO_BE_DELETED.equals( is24Object.getRealEstateState() );
        if (!isAlreadyDeleted) is24Object.setRealEstateState( RealEstateState.TO_BE_DELETED );
        is24ObjectId = is24Object.getId();
      }
      catch (RequestFailedException ex)
      {
        LOGGER.error( "Can't get property '" + externalObjectId + "' from the webservice!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
        //transport.addMessagesToExportContext(
        //  ResponseCode.IS24_TRANSPORT_CANT_LOOKUP_PROPERTY,
        //  externalObjectId,
        //  ex.responseMessages,
        //  context );
        this.putObjectMessage(
          externalObjectId, ExportMessage.Code.OBJECT_NOT_FOUND, ex.responseMessages );
        return;
      }

      // Löschung durchführen
      try
      {
        ImportExport.RealEstateService.deleteByIs24Id(
          this.client, is24ObjectId );
      }
      catch (RequestFailedException ex)
      {
        LOGGER.error( "Can't delete property '" + externalObjectId + "' (" + is24ObjectId + ") at the webservice!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
        //transport.addMessagesToExportContext(
        //  ResponseCode.IS24_TRANSPORT_CANT_DELETE_PROPERTY,
        //  externalObjectId,
        //  ex.responseMessages,
        //  context );
        this.putObjectMessage(
          externalObjectId, ExportMessage.Code.OBJECT_NOT_REMOVED, ex.responseMessages );
      }
    }
    catch (JAXBException ex)
    {
      //LOGGER.error( "Can't read / write XML while communicating with the webservice!" );
      //LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      throw new IOExceptionWithCause(
        "Can't read / write XML while communicating with the webservice!", ex );
    }
    catch (OAuthException ex)
    {
      //LOGGER.error( "Can't authorize at the webservice!" );
      //LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      throw new IOExceptionWithCause(
        "Authorization failed!", ex );
    }
    catch (IOException ex)
    {
      //LOGGER.error( "Can't communicate with the webservice!" );
      //LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      throw new IOExceptionWithCause(
        "Communication failed!", ex );
    }
  }

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
            //transport.addMessageToExportContext(
            //  ResponseCode.IS24_TRANSPORT_CANT_LOOKUP_PROPERTIES,
            //  "Can't get available properties from the webservice!",
            //  context );
            this.putGeneralMessage(
              ExportMessage.Code.OBJECTS_NOT_FOUND,
              "Can't get available properties from the webservice!" );
            return new String[]{};
          }
        }
        catch (RequestFailedException ex)
        {
          LOGGER.error( "Can't get available properties from the webservice!" );
          LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
          //transport.addMessagesToExportContext(
          //  ResponseCode.IS24_TRANSPORT_CANT_LOOKUP_PROPERTIES,
          //  ex.responseMessages,
          //  context );
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
            if (!this.updatedObjectIds.contains( externalId ))
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
      //LOGGER.error( "Can't read / write XML while communicating with the webservice!" );
      //LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      throw new IOExceptionWithCause(
        "Can't read / write XML while communicating with the webservice!", ex );
    }
    catch (OAuthException ex)
    {
      //LOGGER.error( "Can't authorize at the webservice!" );
      //LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      throw new IOExceptionWithCause(
        "Authorization failed!", ex );
    }
    catch (IOException ex)
    {
      //LOGGER.error( "Can't communicate with the webservice!" );
      //LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      throw new IOExceptionWithCause(
        "Communication failed!", ex );
    }
  }

  protected void doUpdateContact( String externalContactId ) throws IOException
  {
    // Ansprechpartner ermitteln
    final RealtorContactDetails newIs24Contact = this.pool.getContact( externalContactId );
    if (newIs24Contact==null)
    {
      // Fortschritt protokollieren
      this.addProgress(
        this.pool.getContactSize( externalContactId, true ) );

      throw new IOException(
        "Can't read XML file for contact '" + externalContactId + "'!" );
    }
    newIs24Contact.setExternalId( externalContactId );

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
        LOGGER.error( "Can't get contact person '" + externalContactId + "' from the webservice!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
        //transport.addMessagesToExportContext(
        //  ResponseCode.IS24_TRANSPORT_CANT_LOOKUP_CONTACT_PERSON,
        //  ex.responseMessages,
        //  context );
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
            this.client, newIs24Contact );
        }
        catch (RequestFailedException ex)
        {
          LOGGER.error( "Can't add contact person '" + externalContactId + "' to the webservice!" );
          LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
          //transport.addMessagesToExportContext(
          //  ResponseCode.IS24_TRANSPORT_CANT_SAVE_CONTACT_PERSON,
          //  ex.responseMessages,
          //  context );
          this.putContactMessage(
            externalContactId, ExportMessage.Code.CONTACT_NOT_SAVED, ex.responseMessages );
          return;
        }
      }

      // bestehenden Ansprechpartner aktualisieren
      else
      {
        Long is24ContactId = oldIs24Contact.getId();
        newIs24Contact.setId( is24ContactId );

        try
        {
          ImportExport.ContactAddressService.putByIs24Id(
            this.client, newIs24Contact, is24ContactId );
        }
        catch (RequestFailedException ex)
        {
          LOGGER.error( "Can't update contact person '" + externalContactId + "' at the webservice!" );
          LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
          //transport.addMessagesToExportContext(
          //  ResponseCode.IS24_TRANSPORT_CANT_SAVE_CONTACT_PERSON,
          //  ex.responseMessages,
          //  context );
          this.putContactMessage(
            externalContactId, ExportMessage.Code.CONTACT_NOT_SAVED, ex.responseMessages );
          return;
        }
      }

      // ID des Ansprechpartners als erfolgreich exportiert vormerken
      this.updatedContactIds.add( externalContactId );
    }
    catch (JAXBException ex)
    {
      //LOGGER.error( "Can't read / write XML while communicating with the webservice!" );
      //LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      throw new IOExceptionWithCause(
        "Can't read / write XML while communicating with the webservice!", ex );
    }
    catch (OAuthException ex)
    {
      //LOGGER.error( "Can't authorize at the webservice!" );
      //LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      throw new IOExceptionWithCause(
        "Authorization failed!", ex );
    }
    catch (IOException ex)
    {
      //LOGGER.error( "Can't communicate with the webservice!" );
      //LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      throw new IOExceptionWithCause(
        "Communication failed!", ex );
    }
    finally
    {
      // Fortschritt protokollieren
      this.addProgress(
        this.pool.getContactSize( externalContactId, true ) );
    }
  }

  protected void doUpdateObject( String externalObjectId ) throws IOException
  {
    final org.openestate.is24.restapi.xml.common.ObjectFactory commonFactory =
      new org.openestate.is24.restapi.xml.common.ObjectFactory();
    //final org.openestate.is24.restapi.xml.realestates.ObjectFactory realEstatesFactory =
    //  new org.openestate.is24.restapi.xml.realestates.ObjectFactory();
    final org.openestate.is24.restapi.xml.attachmentsorder.ObjectFactory attachmentsorderFactory =
      new org.openestate.is24.restapi.xml.attachmentsorder.ObjectFactory();

    // Immobilie  aus ExportPool ermitteln
    RealEstate newIs24Object = this.pool.getObject( externalObjectId );
    if (newIs24Object==null)
    {
      // Fortschritt protokollieren
      this.addProgress(
        this.pool.getObjectSize( externalObjectId, true ) );

      throw new IOException(
        "Can't read XML file for property '" + externalObjectId + "'!" );
    }
    newIs24Object.setExternalId( externalObjectId );
    newIs24Object.setRealEstateState( RealEstateState.ACTIVE );

    String externalContactId = (newIs24Object.getContact()!=null)?
      StringUtils.trimToNull( newIs24Object.getContact().getExternalId() ): null;

    // sicherstellen, dass der Ansprechpartner vorher erfolgreich während des Transports exportiert wurde
    if (externalContactId!=null && !this.updatedContactIds.contains( externalContactId ))
    {
      //transport.addMessageToExportContext(
      //  ResponseCode.IS24_TRANSPORT_PROPERTY_SENT_WITHOUT_CONTACT_PERSON,
      //  externalObjectId,
      //  "The contact '" + externalContactId + "' was not saved during the export process.",
      //  context );
      this.putObjectMessage(
        externalObjectId, ExportMessage.Code.OBJECT_WITHOUT_CONTACT,
        "The contact '" + externalContactId + "' was not saved during the export process." );
      newIs24Object.setContact( null );
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
        LOGGER.error( "Can't get property '" + externalObjectId + "' from the webservice!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
        //transport.addMessagesToExportContext(
        //  ResponseCode.IS24_TRANSPORT_CANT_LOOKUP_PROPERTY,
        //  externalObjectId,
        //  ex.responseMessages,
        //  context );
        this.putObjectMessage(
          externalObjectId, ExportMessage.Code.OBJECT_NOT_FOUND, ex.responseMessages );

        // Fortschritt protokollieren
        this.addProgress(
          this.pool.getObjectSize( externalObjectId, true ) );

        return;
      }

      //Messages responseMessages;
      final Long is24ObjectId;

      // Immobilie im Portal löschen,
      // wenn diese bereits im Portal existiert
      // und einer anderen Rubrik zugewiesen ist
      if (oldIs24Object!=null && !oldIs24Object.getClass().getName().equals( newIs24Object.getClass().getName() ))
      {
        //LOGGER.debug( "RUBRIK GEÄNDERT" );
        //LOGGER.debug( "> für Immobilie #" + oldIs24Object.getId() );
        //LOGGER.debug( "> alte Rubrik " + oldIs24Object.getClass().getName() );
        //LOGGER.debug( "> neue Rubrik " + newIs24Object.getClass().getName() );
        try
        {
          ImportExport.RealEstateService.deleteByIs24Id(
            this.client, oldIs24Object.getId() );
          oldIs24Object = null;
        }
        catch (RequestFailedException ex)
        {
          LOGGER.error( "Can't delete property '" + externalObjectId + "' (" + oldIs24Object.getId() + ") at the webservice!" );
          LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
          //transport.addMessagesToExportContext(
          //  ResponseCode.IS24_TRANSPORT_CANT_DELETE_PROPERTY,
          //  externalObjectId,
          //  ex.responseMessages,
          //  context );
          this.putObjectMessage(
            externalObjectId, ExportMessage.Code.OBJECT_NOT_REMOVED, ex.responseMessages );

          // Fortschritt protokollieren
          this.addProgress(
            this.pool.getObjectSize( externalObjectId, true ) );

          return;
        }
      }

      // neue Immobilie erstellen
      if (oldIs24Object==null)
      {
        try
        {
          ImportExport.RealEstateService.post(
            this.client, newIs24Object );
        }
        catch (RequestFailedException ex)
        {
          LOGGER.error( "Can't add property '" + externalObjectId + "' to the webservice!" );
          LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
          //transport.addMessagesToExportContext(
          //  ResponseCode.IS24_TRANSPORT_CANT_SAVE_PROPERTY,
          //  externalObjectId,
          //  ex.responseMessages,
          //  context );
          this.putObjectMessage(
            externalObjectId, ExportMessage.Code.OBJECT_NOT_SAVED, ex.responseMessages );

          // Fortschritt protokollieren
          this.addProgress(
            this.pool.getObjectSize( externalObjectId, true ) );

          return;
        }

        try
        {
          newIs24Object = ImportExport.RealEstateService.getByExternalId(
            this.client, externalObjectId );
          if (newIs24Object==null)
          {
            //transport.addMessageToExportContext(
            //  ResponseCode.IS24_TRANSPORT_CANT_LOOKUP_PROPERTY,
            //  externalObjectId,
            //  "Can't get the saved property '" + externalObjectId + "' from the webservice!",
            //  context );
            this.putObjectMessage(
              externalObjectId, ExportMessage.Code.OBJECT_NOT_FOUND,
              "Can't get the saved property '" + externalObjectId + "' from the webservice!" );

            // Fortschritt protokollieren
            this.addProgress(
              this.pool.getObjectSize( externalObjectId, true ) );

            return;
          }
          is24ObjectId = newIs24Object.getId();
        }
        catch (RequestFailedException ex)
        {
          LOGGER.error( "Can't get the saved property '" + externalObjectId + "' from the webservice!" );
          LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
          //transport.addMessagesToExportContext(
          //  ResponseCode.IS24_TRANSPORT_CANT_LOOKUP_PROPERTY,
          //  externalObjectId,
          //  ex.responseMessages,
          //  context );
          this.putObjectMessage(
            externalObjectId, ExportMessage.Code.OBJECT_NOT_FOUND, ex.responseMessages );

          // Fortschritt protokollieren
          this.addProgress(
            this.pool.getObjectSize( externalObjectId, true ) );

          return;
        }
      }

      // bestehende Immobilie aktualisieren
      else
      {
        is24ObjectId = oldIs24Object.getId();
        newIs24Object.setId( is24ObjectId );

        try
        {
          ImportExport.RealEstateService.putByIs24Id(
            this.client, newIs24Object, is24ObjectId );
        }
        catch (RequestFailedException ex)
        {
          LOGGER.error( "Can't update property '" + externalObjectId + "' (" + is24ObjectId + ") at the webservice!" );
          LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
          //transport.addMessagesToExportContext(
          //  ResponseCode.IS24_TRANSPORT_CANT_SAVE_PROPERTY,
          //  externalObjectId,
          //  ex.responseMessages,
          //  context );
          this.putObjectMessage(
            externalObjectId, ExportMessage.Code.OBJECT_NOT_SAVED, ex.responseMessages );

          // Fortschritt protokollieren
          this.addProgress(
            this.pool.getObjectSize( externalObjectId, true ) );

          return;
        }
      }

      // Fortschritt protokollieren
      this.addProgress(
        this.pool.getObjectSize( externalObjectId, false ) );

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
        LOGGER.error( "Can't get attachments of property '" + externalObjectId + "' (" + is24ObjectId + ") from the webservice!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
        //transport.addMessagesToExportContext(
        //  ResponseCode.IS24_TRANSPORT_PROPERTY_SENT_WITHOUT_ATTACHMENTS,
        //  externalObjectId,
        //  ex.responseMessages,
        //  context );
        this.putObjectMessage(
          externalObjectId, ExportMessage.Code.OBJECT_WITHOUT_ATTACHMENTS, ex.responseMessages );
        ignoreAttachments = true;
      }

      if (ignoreAttachments)
      {
        // Fortschritt protokollieren
        long totalAttachmentSize = this.pool.getObjectSize( externalObjectId, true )
          - this.pool.getObjectSize( externalObjectId, false );
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
                + "of property '" + externalObjectId + "' (" + is24ObjectId + ") from the webservice!" );
              LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
              //transport.addMessagesToExportContext(
              //  ResponseCode.IS24_TRANSPORT_CANT_REMOVE_OLD_PROPERTY_ATTACHMENT,
              //  externalObjectId,
              //  ex.responseMessages,
              //  context );
              this.putObjectMessage(
                externalObjectId, ExportMessage.Code.OBJECT_OLD_ATTACHMENT_NOT_REMOVED, ex.responseMessages );
            }
          }
        }

        // Anhänge aus dem Exportverzeichnis der Immobilie ermitteln
        Map<Integer,Long> picturesOrder = new TreeMap<Integer,Long>();
        for (String attachmentId : this.pool.getObjectAttachmentIds( externalObjectId ))
        {
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

          Attachment is24Attachment = this.pool.getObjectAttachment( externalObjectId, attachmentId );
          if (is24Attachment==null)
          {
            LOGGER.error( "Can't read the XML file for attachment!" );
            //transport.addMessageToExportContext(
            //  ResponseCode.IS24_TRANSPORT_CANT_SAVE_PROPERTY_ATTACHMENT,
            //  externalObjectId,
            //  "Can't read the XML file for attachment!",
            //  context );
            this.putObjectMessage(
              externalObjectId, ExportMessage.Code.OBJECT_ATTACHMENT_NOT_SAVED,
              "Can't read the XML file for attachment!" );

            // Fortschritt protokollieren
            this.addProgress(
              this.pool.getObjectAttachmentSize( externalObjectId, attachmentId ) );

            continue;
          }

          // MIME-Type ermitteln
          final String attachFileMimeType;
          if (is24Attachment instanceof PDFDocument)
          {
            attachFileMimeType = "application/pdf";
          }
          //else if (is24Attachment instanceof Picture)
          //{
          //  attachFileMimeType = "image/jpeg";
          //}
          //else if (is24Attachment instanceof VideoFile)
          //{
          //  mimeType = "application/octet-stream";
          //}
          else
          {
            //mimeType = "application/octet-stream";
            attachFileMimeType = null;
          }

          // Datei ermitteln
          File attachFile = this.pool.getObjectAttachmentFile( externalObjectId, is24Attachment );
          if (attachFile==null || !attachFile.isFile())
          {
            LOGGER.error( "Can't find file for attachment!" );
            //transport.addMessageToExportContext(
            //  ResponseCode.IS24_TRANSPORT_CANT_SAVE_PROPERTY_ATTACHMENT,
            //  externalObjectId,
            //  "Can't find file for attachment!",
            //  context );
            this.putObjectMessage(
              externalObjectId, ExportMessage.Code.OBJECT_ATTACHMENT_NOT_SAVED,
              "Can't find file for attachment!" );

            // Fortschritt protokollieren
            this.addProgress(
              this.pool.getObjectAttachmentSize( externalObjectId, attachmentId ) );

            continue;
          }
          String attachFileName = attachFile.getName();
          long attachFileSize = attachFile.length();
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
              Messages responseMessages = ImportExport.AttachmentService.post(
                this.client, externalObjectId, is24Attachment, attachFileInput, attachFileName, attachFileMimeType );

              // ID des gespeicherten Bildes aus Antwort-Meldung ermitteln
              if (is24Attachment instanceof Picture)
              {
                Resource resource = Resource.getCreatedResource( responseMessages );
                if (resource==null)
                {
                  LOGGER.warn( "Can't determine ID of stored attachment for "
                    + "property '" + externalObjectId + "' (" + is24ObjectId + ")!" );
                }
                else
                {
                  while (picturesOrder.containsKey( pos )) pos++;
                  picturesOrder.put( pos, resource.id );
                }
              }
            }
          }
          catch (RequestFailedException ex)
          {
            LOGGER.error( "Can't add attachment of property '" + externalObjectId + "' (" + is24ObjectId + ") to the webservice!" );
            LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
            //transport.addMessagesToExportContext(
            //  ResponseCode.IS24_TRANSPORT_CANT_SAVE_PROPERTY_ATTACHMENT,
            //  externalObjectId,
            //  ex.responseMessages,
            //  context );
            this.putObjectMessage(
              externalObjectId, ExportMessage.Code.OBJECT_ATTACHMENT_NOT_SAVED, ex.responseMessages );
          }
          finally
          {
            IOUtils.closeQuietly( attachFileInput );

            // Fortschritt protokollieren
            this.addProgress(
              this.pool.getObjectAttachmentSize( externalObjectId, attachmentId ) + attachFileSize );
          }
        }

        // Reihenfolge der Bild-Anhänge explizit setzen
        if (!picturesOrder.isEmpty())
        {
          org.openestate.is24.restapi.xml.attachmentsorder.List list =
            attachmentsorderFactory.createList();
          for (Long is24AttachmentId : picturesOrder.values())
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
            LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
            //transport.addMessagesToExportContext(
            //  ResponseCode.IS24_TRANSPORT_CANT_ORDER_PROPERTY_ATTACHMENTS,
            //  externalObjectId,
            //  ex.responseMessages,
            //  context );
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
        LOGGER.error( "Can't get publishings of property '" + externalObjectId + "' (" + is24ObjectId + ") from the webservice!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
        //transport.addMessagesToExportContext(
        //  ResponseCode.IS24_TRANSPORT_CANT_LOOKUP_PROPERTY_PUBLISHINGS,
        //  externalObjectId,
        //  ex.responseMessages,
        //  context );
        this.putObjectMessage(
          externalObjectId, ExportMessage.Code.OBJECT_PUBLISHINGS_NOT_FOUND, ex.responseMessages );
      }

      // Veröffentlichungs-Kanäle ermitteln
      PublishChannels is24Channels = null;
      try
      {
        is24Channels = ImportExport.PublishChannelService.get( this.client );
      }
      catch (RequestFailedException ex)
      {
        LOGGER.error( "Can't get publish channels from the webservice!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
        //transport.addMessagesToExportContext(
        //  ResponseCode.IS24_TRANSPORT_CANT_LOOKUP_PUBLISHING_CHANNELS,
        //  externalObjectId,
        //  ex.responseMessages,
        //  context );
        this.putObjectMessage(
          externalObjectId, ExportMessage.Code.PUBLISH_CHANNELS_NOT_FOUND, ex.responseMessages );
      }

      if (is24Channels==null)
      {
        //transport.addMessageToExportContext(
        //  ResponseCode.IS24_TRANSPORT_PROPERTY_SENT_WITHOUT_PUBLISHING,
        //  externalObjectId,
        //  "No channels for publishing found!",
        //  context );
        this.putObjectMessage(
          externalObjectId, ExportMessage.Code.OBJECT_NOT_PUBLISHED,
          "No channels for publishing found!" );
      }
      else
      {
        // Veröffentlichungen zur Immobilie aktualisieren,
        // wenn diese zu einem Kanal noch nicht gesetzt wurde
        for (PublishChannel is24Channel : is24Channels.getPublishChannel())
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
            LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
            //transport.addMessagesToExportContext(
            //  ResponseCode.IS24_TRANSPORT_PROPERTY_SENT_WITHOUT_PUBLISHING,
            //  externalObjectId,
            //  ex.responseMessages,
            //  context );
            this.putObjectMessage(
              externalObjectId, ExportMessage.Code.OBJECT_NOT_PUBLISHED, ex.responseMessages );
          }
        }
      }
    }
    catch (JAXBException ex)
    {
      //LOGGER.error( "Can't read / write XML while communicating with the webservice!" );
      //LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      throw new IOExceptionWithCause(
        "Can't read / write XML while communicating with the webservice!", ex );
    }
    catch (OAuthException ex)
    {
      //LOGGER.error( "Can't authorize at the webservice!" );
      //LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      throw new IOExceptionWithCause(
        "Authorization failed!", ex );
    }
    catch (IOException ex)
    {
      //LOGGER.error( "Can't communicate with the webservice!" );
      //LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      throw new IOExceptionWithCause(
        "Communication failed!", ex );
    }
  }

  public ExportMessage[] export( AbstractClient client, ExportPool pool, boolean archivateUnpublishedObjects, boolean unpublishUntouchedObjects ) throws IOException
  {
    this.client = client;
    this.pool = pool;
    this.messages.clear();
    this.updatedContactIds.clear();
    this.updatedObjectIds.clear();

    // init progress
    this.totalProgress = this.pool.getTotalSize();

    // updating contacts
    for (String contactId : this.pool.getContactIds())
    {
      LOGGER.debug( "updating contact #" + contactId );
      this.doUpdateContact( contactId );
    }

    // updating objects
    for (String objectId : this.pool.getObjectIds())
    {
      LOGGER.debug( "updating object #" + objectId );
      this.doUpdateObject( objectId );
    }

    // removing objects
    for (String objectId : this.pool.getObjectIds())
    {
      if (archivateUnpublishedObjects)
      {
        LOGGER.debug( "archivating object #" + objectId );
        this.doArchiveObject( objectId );
      }
      else
      {
        LOGGER.debug( "removing object #" + objectId );
        this.doRemoveObject( objectId );
      }
    }

    // removing untouched objects
    if (unpublishUntouchedObjects)
    {
      for (String objectId : this.doListUntouchedObjects())
      {
        if (archivateUnpublishedObjects)
        {
          LOGGER.debug( "archivating untouched object #" + objectId );
          this.doArchiveObject( objectId );
        }
        else
        {
          LOGGER.debug( "removing untouched object #" + objectId );
          this.doRemoveObject( objectId );
        }
      }
    }

    return this.getMessages();
  }

  protected final AbstractClient getClient()
  {
    return client;
  }

  public final ExportMessage[] getMessages()
  {
    return this.messages.toArray( new ExportMessage[this.messages.size()] );
  }

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

  public final ExportMessage[] getMessagesGeneral()
  {
    List<ExportMessage> msgs = new ArrayList<ExportMessage>();
    for (ExportMessage msg : this.messages)
    {
      if (msg.isGeneral()) msgs.add( msg );
    }
    return msgs.toArray( new ExportMessage[msgs.size()] );
  }

  protected final ExportPool getPool()
  {
    return pool;
  }

  protected final long getProgress()
  {
    return progress;
  }

  protected final long getTotalProgress()
  {
    return totalProgress;
  }

  protected void progressUpdated( long progress, long totalProgress )
  {
  }

  protected void putContactMessage( String contactId, ExportMessage.Code code, String msg )
  {
    this.messages.add( ExportMessage.newContactMessage( contactId, code, msg ) );
  }

  protected void putContactMessage( String contactId, ExportMessage.Code code, Messages msgs )
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

      this.putContactMessage( contactId, code, txt );
    }
  }

  protected void putGeneralMessage( ExportMessage.Code code, String msg )
  {
    this.messages.add( ExportMessage.newGeneralMessage( msg, code ) );
  }

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

  protected void putObjectMessage( String objectId, ExportMessage.Code code, String msg )
  {
    this.messages.add( ExportMessage.newObjectMessage( objectId, code, msg ) );
  }

  protected void putObjectMessage( String objectId, ExportMessage.Code code, Messages msgs )
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

      this.putObjectMessage( objectId, code, txt );
    }
  }

  protected final void setProgress( long progress )
  {
    progress = Math.abs( progress );
    this.progress = (progress<=this.totalProgress)?
      progress: this.totalProgress;

    // launch callback function for progress
    progressUpdated( this.progress, this.totalProgress );
  }

  public static enum ErrorCode
  {

  }

  public static enum ErrorLevel
  {
    NOTICE, WARNING, ERROR;
  }
}