/*
 * Copyright 2014-2016 OpenEstate.org.
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
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;
import org.openestate.is24.restapi.xml.common.Attachment;
import org.openestate.is24.restapi.xml.common.RealtorContactDetails;
import org.openestate.is24.restapi.xml.realestates.RealEstate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A pool of exportable real estates, attachments and contacts.
 * <p>
 * The {@link ExportPool} is part of the high level API for bulk exports of real
 * estate data.
 * <p>
 * Multiple real estates and contacts (including attachments) can be collected
 * in the {@link ExportPool}. The corresponding data is stored into a temporary
 * folder on the local harddisk. After the {@link ExportPool} was created and
 * initialized with some data, the bulk export can be started via
 * {@link ExportHandler}.
 *
 * @since 0.2
 * @author Andreas Rudolph <andy@openindex.de>
 */
public class ExportPool
{
  private final static Logger LOGGER = LoggerFactory.getLogger( ExportPool.class );
  private final static String UPDATE = "UPDATE";
  private final static String REMOVE = "REMOVE";
  private final File baseDir;
  private final File contactsDir;
  private final File objectsDir;
  private final Properties settings;

  /**
   * Create an empty {@link ExportPool}.
   * <p>
   * Files are stored into the default temporary directory of the Java runtime
   * environment.
   */
  public ExportPool()
  {
    this( new File( SystemUtils.getJavaIoTmpDir(), "pool-"+System.currentTimeMillis() ) );
  }

  /**
   * Create an empty {@link ExportPool}.
   *
   * @param baseDir
   * directory, where pooled files are stored
   */
  public ExportPool( File baseDir )
  {
    this.baseDir = baseDir;
    this.contactsDir = new File( this.baseDir, "contacts" );
    this.objectsDir = new File( this.baseDir, "objects" );
    this.settings = new Properties();
  }

  /**
   * Clear settings and empty the local directory.
   */
  public void cleanup()
  {
    this.settings.clear();
    FileUtils.deleteQuietly( this.baseDir );
  }

  /**
   * Return directory, where local files are stored.
   *
   * @return
   * directory
   */
  public final File getBaseDir()
  {
    return baseDir;
  }

  /**
   * Return a pooled contact.
   *
   * @param pooledContactId
   * ID of the contact within the pool
   *
   * @return
   * contact
   *
   * @throws IOException
   * if object is not readable from local directory
   */
  public RealtorContactDetails getContact( String pooledContactId ) throws IOException
  {
    if (StringUtils.isBlank( pooledContactId )) return null;

    final File xmlFile = new File( new File( this.contactsDir, pooledContactId ), "contact.xml" );
    if (!xmlFile.isFile()) return null;

    final Unmarshaller unmarshaller;
    try
    {
      unmarshaller = org.openestate.is24.restapi.utils.XmlUtils.createUnmarshaller();
      if (unmarshaller==null)
      {
        throw new IOException(
          "Can't init XML parser for IS24-REST!" );
      }
    }
    catch (JAXBException ex)
    {
      throw new IOException(
        "Can't init XML parser for IS24-REST!", ex );
    }

    try
    {
      JAXBElement<RealtorContactDetails> xml = (JAXBElement<RealtorContactDetails>)
        unmarshaller.unmarshal( xmlFile );
      RealtorContactDetails contact = xml.getValue();
      if (contact==null)
      {
        throw new IOException(
          "Can't read XML file for contact '" + pooledContactId + "'!" );
      }
      return contact;
    }
    catch (JAXBException ex)
    {
      throw new IOException(
        "Can't read XML file for contact '" + pooledContactId + "'!", ex );
    }
  }

  /**
   * Return ID's of pooled contacts.
   *
   * @return
   * contact ID's within the pool
   */
  public String[] getContactIds()
  {
    if (!this.contactsDir.isDirectory()) return new String[]{};
    List<String> ids = new ArrayList<String>();
    File[] files = this.contactsDir.listFiles();
    if (ArrayUtils.isNotEmpty( files ))
    {
      for (File f : files)
      {
        if (f.isDirectory()) ids.add( f.getName() );
      }
    }
    return ids.toArray( new String[ids.size()] );
  }

  /**
   * Return size of a pooled contact.
   *
   * @param pooledContactId
   * ID of the contact within the pool
   *
   * @param completely
   * calculate the complete size (including attachments)
   *
   * @return
   * size in bytes
   */
  public long getContactSize( String pooledContactId, boolean completely )
  {
    if (StringUtils.isBlank( pooledContactId )) return 0;
    File file = new File( this.contactsDir, pooledContactId );
    if (!completely) file = new File( file, "contact.xml" );
    return (file.isFile())? FileUtils.sizeOf( file ): 0;
  }

  /**
   * Return directory, where pooled contacts are stored.
   *
   * @return
   * directory
   */
  public final File getContactsDir()
  {
    return contactsDir;
  }

  /**
   * Return a pooled real estate.
   *
   * @param pooledObjectId
   * ID of the real estate within the pool
   *
   * @return
   * real estate
   *
   * @throws IOException
   * if object is not readable from local directory
   */
  public RealEstate getObject( String pooledObjectId ) throws IOException
  {
    if (StringUtils.isBlank( pooledObjectId )) return null;

    final File xmlFile = new File( new File( this.objectsDir, pooledObjectId ), "object.xml" );
    if (!xmlFile.isFile()) return null;

    final Unmarshaller unmarshaller;
    try
    {
      unmarshaller = org.openestate.is24.restapi.utils.XmlUtils.createUnmarshaller();
      if (unmarshaller==null)
      {
        throw new IOException(
          "Can't init XML parser for IS24-REST!" );
      }
    }
    catch (JAXBException ex)
    {
      throw new IOException(
        "Can't init XML parser for IS24-REST!", ex );
    }

    try
    {
      JAXBElement<RealEstate> xml = (JAXBElement<RealEstate>)
        unmarshaller.unmarshal( xmlFile );
      RealEstate object = xml.getValue();
      if (object==null)
      {
        throw new IOException(
          "Can't read XML file for object '" + pooledObjectId + "'!" );
      }
      return object;
    }
    catch (JAXBException ex)
    {
      throw new IOException(
        "Can't read XML file for object '" + pooledObjectId + "'!", ex );
    }
  }

  /**
   * Return a pooled attachment for a real estate.
   *
   * @param pooledObjectId
   * ID of the real estate within the pool
   *
   * @param attachmentId
   * ID of the attachment
   *
   * @return
   * attachment
   *
   * @throws IOException
   * if object is not readable from local directory
   */
  public Attachment getObjectAttachment( String pooledObjectId, String attachmentId ) throws IOException
  {
    if (StringUtils.isBlank( pooledObjectId ) || StringUtils.isBlank( attachmentId )) return null;

    final File xmlFile = new File( new File( this.objectsDir, pooledObjectId ), "attachment." + attachmentId + ".xml" );
    if (!xmlFile.isFile()) return null;

    final Unmarshaller unmarshaller;
    try
    {
      unmarshaller = org.openestate.is24.restapi.utils.XmlUtils.createUnmarshaller();
      if (unmarshaller==null)
      {
        throw new IOException(
          "Can't init XML parser for IS24-REST!" );
      }
    }
    catch (JAXBException ex)
    {
      throw new IOException(
        "Can't init XML parser for IS24-REST!", ex );
    }

    try
    {
      JAXBElement<Attachment> xml = (JAXBElement<Attachment>)
        unmarshaller.unmarshal( xmlFile );
      Attachment attachment = xml.getValue();
      if (attachment==null)
      {
        throw new IOException(
          "Can't read XML file for object '" + pooledObjectId + "'!" );
      }
      //attachment.setExternalId( pooledObjectId );
      return attachment;
    }
    catch (JAXBException ex)
    {
      throw new IOException(
        "Can't read XML file for object '" + pooledObjectId + "'!", ex );
    }
  }

  /**
   * Return the file of a pooled attachment for a real estate.
   *
   * @param pooledObjectId
   * ID of the real estate within the pool
   *
   * @param attachment
   * attachment to lookup
   *
   * @return
   * file
   */
  public File getObjectAttachmentFile( String pooledObjectId, Attachment attachment )
  {
    return (attachment!=null)?
      getObjectAttachmentFile( pooledObjectId, attachment.getHref() ): null;
  }

  /**
   * Return the file of a pooled attachment for a real estate.
   *
   * @param pooledObjectId
   * ID of the real estate within the pool
   *
   * @param href
   * attachment href
   *
   * @return
   * file
   */
  public File getObjectAttachmentFile( String pooledObjectId, URL href )
  {
    return (href!=null && href.getProtocol().equalsIgnoreCase( "file" ))?
      getObjectAttachmentFile( pooledObjectId, StringUtils.trimToNull( href.getHost() ) ): null;
  }

  /**
   * Return the file of a pooled attachment for a real estate.
   *
   * @param pooledObjectId
   * ID of the real estate within the pool
   *
   * @param name
   * file name
   *
   * @return
   * file
   */
  public File getObjectAttachmentFile( String pooledObjectId, String name )
  {
    if (StringUtils.isBlank( name )) return null;
    final File file = new File( new File( this.objectsDir, pooledObjectId ), name );
    return (file.isFile())? file: null;
  }

  /**
   * Return size of a pooled attachment for a real estate.
   *
   * @param pooledObjectId
   * ID of the real estate within the pool
   *
   * @param attachmentId
   * ID of the attachment
   *
   * @return
   * size in bytes
   */
  public long getObjectAttachmentSize( String pooledObjectId, String attachmentId )
  {
    if (StringUtils.isBlank( pooledObjectId ) || StringUtils.isBlank( attachmentId )) return 0;
    File file = new File( new File( this.objectsDir, pooledObjectId ), "attachment." + attachmentId + ".xml" );
    return (file.isFile())? FileUtils.sizeOf( file ): 0;
  }

  /**
   * Return the URL of a pooled attachment for a real estate.
   *
   * @param attachment
   * attachment to lookup
   *
   * @return
   * file
   */
  public URL getObjectAttachmentURL( Attachment attachment )
  {
    return (attachment!=null)? attachment.getHref(): null;
  }

  /**
   * Return the URL of a pooled attachment for a real estate.
   *
   * @param pooledObjectId
   * ID of the real estate within the pool
   *
   * @param attachmentId
   * ID of the attachment
   *
   * @return
   * file
   *
   * @throws IOException
   * if object is not readable from local directory
   */
  public URL getObjectAttachmentURL( String pooledObjectId, String attachmentId ) throws IOException
  {
    return this.getObjectAttachmentURL( this.getObjectAttachment( pooledObjectId, attachmentId ) );
  }

  /**
   * Return attachment ID's of a pooled real estate.
   *
   * @param pooledObjectId
   * ID of the real estate within the pool
   *
   * @return
   * attachment ID's
   */
  public String[] getObjectAttachmentIds( String pooledObjectId )
  {
    final File objectDir = new File( this.objectsDir, pooledObjectId );
    if (!objectDir.isDirectory()) return new String[]{};
    List<String> ids = new ArrayList<String>();
    File[] files = objectDir.listFiles();
    if (ArrayUtils.isNotEmpty( files ))
    {
      for (File f : files)
      {
        String n = f.getName();
        if (!n.startsWith( "attachment." ) || !n.endsWith(".xml" )) continue;
        String[] parts = StringUtils.split( n, "." );
        if (parts.length==3)
        {
          ids.add( parts[1] );
        }
        else
        {
          LOGGER.warn( "Invalid attachment.xml at '" + f.getAbsolutePath() + "'!" );
        }
      }
    }
    return ids.toArray( new String[ids.size()] );
  }

  /**
   * Return ID's of pooled real estates.
   *
   * @return
   * real estate ID's within the pool
   */
  public String[] getObjectIds()
  {
    if (!this.objectsDir.isDirectory()) return new String[]{};
    List<String> ids = new ArrayList<String>();
    File[] files = this.objectsDir.listFiles();
    if (ArrayUtils.isNotEmpty( files ))
    {
      for (File f : files)
      {
        if (f.isDirectory()) ids.add( f.getName() );
      }
    }
    return ids.toArray( new String[ids.size()] );
  }

  /**
   * Return ID's of real estates, that were pooled for removal.
   *
   * @return
   * real estate ID's
   */
  public String[] getObjectIdsForRemoval()
  {
    List<String> ids = new ArrayList<String>();
    for (Enumeration e=this.settings.propertyNames(); e.hasMoreElements();)
    {
      String key = (String) e.nextElement();
      if (!key.startsWith( "object." )) continue;
      String value = this.settings.getProperty( key );
      if (!REMOVE.equals( value )) continue;
      String[] k = StringUtils.split( key, ".", 2 );
      ids.add( k[1] );
    }
    return ids.toArray( new String[ids.size()] );
  }

  /**
   * Return size of a pooled real estate.
   *
   * @param pooledObjectId
   * ID of the real estate within the pool
   *
   * @param completely
   * calculate the complete size (including attachments)
   *
   * @return
   * size in bytes
   */
  public long getObjectSize( String pooledObjectId, boolean completely )
  {
    if (StringUtils.isBlank( pooledObjectId )) return 0;
    File file = new File( this.objectsDir, pooledObjectId );
    if (!completely) file = new File( file, "object.xml" );
    return (file.isFile())? FileUtils.sizeOf( file ): 0;
  }

  /**
   * Return directory, where pooled real estates are stored.
   *
   * @return
   * directory
   */
  public final File getObjectsDir()
  {
    return objectsDir;
  }

  /**
   * Return a settings from the export pool.
   *
   * @param key
   * setting key
   *
   * @return
   * setting value
   */
  public String getSetting( String key )
  {
    return this.getSetting( key, null );
  }

  /**
   * Return a settings from the export pool.
   *
   * @param key
   * setting key
   *
   * @param defaultValue
   * default value, if the setting is not defined
   *
   * @return
   * setting value or the provided default value
   */
  public String getSetting( String key, String defaultValue )
  {
    return this.settings.getProperty( key, defaultValue );
  }

  /**
   * Return the total size of the local pool directory.
   *
   * @return
   * size in bytes
   */
  public long getTotalSize()
  {
    return (this.baseDir.exists())?
      FileUtils.sizeOf( this.baseDir ): 0;
  }

  /**
   * Check, if a contact was pooled for export.
   *
   * @param pooledContactId
   * ID of the contact within the pool
   *
   * @return
   * true, if the object with the provided ID is already pooled
   */
  public boolean hasContactForExport( String pooledContactId )
  {
    if (StringUtils.isBlank( pooledContactId )) return false;
    final File xmlFile = new File( new File( this.contactsDir, pooledContactId ), "contact.xml" );
    return xmlFile.isFile();
  }

  /**
   * Check, if a real estate was pooled for export.
   *
   * @param externalObjectId
   * real estate ID
   *
   * @return
   * true, if the object with the provided ID is already pooled
   */
  public boolean hasObjectForExport( String externalObjectId )
  {
    if (StringUtils.isBlank( externalObjectId )) return false;
    return UPDATE.equalsIgnoreCase( this.getSetting( "object."+externalObjectId ) );
  }

  /**
   * Check, if a real estate was pooled for removal.
   *
   * @param externalObjectId
   * real estate ID
   *
   * @return
   * true, if the object with the provided ID is already pooled for removal
   */
  public boolean hasObjectForRemoval( String externalObjectId )
  {
    if (StringUtils.isBlank( externalObjectId )) return false;
    return REMOVE.equalsIgnoreCase( this.getSetting( "object."+externalObjectId ) );
  }

  /**
   * Add a contact to export pool.
   *
   * @param contact
   * contact
   *
   * @throws IOException
   * if pooling failed
   */
  public synchronized void putContact( RealtorContactDetails contact ) throws IOException
  {
    if (contact!=null)
      putContact( contact, contact.getExternalId() );
  }

  /**
   * Add a contact to export pool.
   *
   * @param contact
   * contact
   *
   * @param pooledContactId
   * ID of the contact within the pool
   *
   * @throws IOException
   * if pooling failed
   */
  public synchronized void putContact( RealtorContactDetails contact, String pooledContactId ) throws IOException
  {
    if (contact==null) return;
    if (pooledContactId==null) pooledContactId = contact.getExternalId();
    if (StringUtils.isBlank( pooledContactId ))
      throw new IOException( "No pool ID was provided for the object!" );
    if (StringUtils.isBlank( contact.getExternalId() ))
      contact.setExternalId( pooledContactId );

    final File contactDir = new File( this.contactsDir, pooledContactId );
    if (contactDir.exists())
      FileUtils.deleteDirectory( contactDir );
    if (!contactDir.mkdirs())
      throw new IOException( "Can't create folder at '" + contactDir.getAbsolutePath() + "'!" );

    OutputStream output = null;
    try
    {
      output = new FileOutputStream( new File( contactDir, "contact.xml" ) );
      XmlUtils.writeXml( contact, output );
    }
    catch (JAXBException ex)
    {
      throw new IOException( "Can't write XML for contact '" + pooledContactId + "'!", ex );
    }
    finally
    {
      IOUtils.closeQuietly( output );
    }
  }

  /**
   * Add a real estate to export pool.
   *
   * @param object
   * real estate
   *
   * @throws IOException
   * if pooling failed
   */
  public synchronized void putObject( RealEstate object ) throws IOException
  {
    if (object!=null)
      putObject( object, object.getExternalId() );
  }

  /**
   * Add a real estate to export pool.
   *
   * @param object
   * real estate
   *
   * @param pooledObjectId
   * ID of the real estate within the pool
   *
   * @throws IOException
   * if pooling failed
   */
  public synchronized void putObject( RealEstate object, String pooledObjectId ) throws IOException
  {
    if (object==null) return;
    if (pooledObjectId==null) pooledObjectId = object.getExternalId();
    if (StringUtils.isBlank( pooledObjectId ))
      throw new IOException( "No pool ID was provided for the object!" );
    if (StringUtils.isBlank( object.getExternalId() ))
      object.setExternalId( pooledObjectId );

    final File objectDir = new File( this.objectsDir, pooledObjectId );
    if (objectDir.exists())
      FileUtils.deleteDirectory( objectDir );
    if (!objectDir.mkdirs())
      throw new IOException( "Can't create folder at '" + objectDir.getAbsolutePath() + "'!" );

    OutputStream output = null;
    try
    {
      output = new FileOutputStream( new File( objectDir, "object.xml" ) );
      XmlUtils.writeXml( object, output );
      this.putSetting( "object." + object.getExternalId(), UPDATE );
    }
    catch (JAXBException ex)
    {
      throw new IOException( "Can't write XML for object '" + pooledObjectId + "'!", ex );
    }
    finally
    {
      IOUtils.closeQuietly( output );
    }
  }

  /**
   * Add an attachment for a real estate to export pool.
   *
   * @param pooledObjectId
   * ID of the real estate within the pool
   *
   * @param attachment
   * attachment informations
   *
   * @param file
   * attached file
   *
   * @throws IOException
   * if pooling failed
   */
  public synchronized void putObjectAttachedFile( String pooledObjectId, Attachment attachment, File file ) throws IOException
  {
    if (StringUtils.isBlank( pooledObjectId ) || attachment==null || file==null || !file.isFile()) return;

    final File objectDir = new File( this.objectsDir, pooledObjectId );
    if (!objectDir.exists() && !objectDir.mkdirs())
      throw new IOException( "Can't create folder at '" + objectDir.getAbsolutePath() + "'!" );

    int attachmentCount = 0;
    File[] files = objectDir.listFiles();
    if (ArrayUtils.isNotEmpty( files ))
    {
      for (File f : files)
      {
        String n = f.getName();
        if (n.startsWith( "attachment." ) && n.endsWith( ".xml" ))
          attachmentCount++;
      }
    }

    final File destFile = new File( objectDir, file.getName() );
    FileUtils.copyFile( file, destFile );
    attachment.setHref( new URL( "file://" + destFile.getName() ) );

    OutputStream output = null;
    try
    {
      output = new FileOutputStream( new File( objectDir, "attachment."+(attachmentCount+1)+".xml" ) );
      XmlUtils.writeXml( attachment, output );
    }
    catch (JAXBException ex)
    {
      throw new IOException( "Can't write XML for an attachment of object '" + pooledObjectId + "'!", ex );
    }
    finally
    {
      IOUtils.closeQuietly( output );
    }
  }

  /**
   * Add an attachment for a real estate to export pool.
   *
   * @param pooledObjectId
   * ID of the real estate within the pool
   *
   * @param attachment
   * attachment informations
   *
   * @param file
   * URL, that points to the attached file
   *
   * @throws IOException
   * if pooling failed
   */
  public synchronized void putObjectAttachedFile( String pooledObjectId, Attachment attachment, URL file ) throws IOException
  {
    if (StringUtils.isBlank( pooledObjectId ) || attachment==null || file==null) return;

    final File objectDir = new File( this.objectsDir, pooledObjectId );
    if (!objectDir.exists() && !objectDir.mkdirs())
      throw new IOException( "Can't create folder at '" + objectDir.getAbsolutePath() + "'!" );

    int attachmentCount = 0;
    File[] files = objectDir.listFiles();
    if (ArrayUtils.isNotEmpty( files ))
    {
      for (File f : files)
      {
        String n = f.getName();
        if (n.startsWith( "attachment." ) && n.endsWith( ".xml" ))
          attachmentCount++;
      }
    }
    attachment.setHref( file );

    OutputStream output = null;
    try
    {
      output = new FileOutputStream( new File( objectDir, "attachment."+(attachmentCount+1)+".xml" ) );
      XmlUtils.writeXml( attachment, output );
    }
    catch (JAXBException ex)
    {
      throw new IOException( "Can't write XML for an attachment of object '" + pooledObjectId + "'!", ex );
    }
    finally
    {
      IOUtils.closeQuietly( output );
    }
  }

  /**
   * Add an web link for a real estate to export pool.
   *
   * @param pooledObjectId
   * ID of the real estate within the pool
   *
   * @param link
   * web link
   *
   * @throws IOException
   * if pooling failed
   */
  public synchronized void putObjectAttachedLink( String pooledObjectId, Attachment link ) throws IOException
  {
    if (StringUtils.isBlank( pooledObjectId ) || link==null) return;

    final File objectDir = new File( this.objectsDir, pooledObjectId );
    if (!objectDir.exists() && !objectDir.mkdirs())
      throw new IOException( "Can't create folder at '" + objectDir.getAbsolutePath() + "'!" );

    int attachmentCount = 0;
    File[] files = objectDir.listFiles();
    if (ArrayUtils.isNotEmpty( files ))
    {
      for (File f : files)
      {
        String n = f.getName();
        if (n.startsWith( "attachment." ) && n.endsWith( ".xml" ))
          attachmentCount++;
      }
    }

    OutputStream output = null;
    try
    {
      output = new FileOutputStream( new File( objectDir, "attachment."+(attachmentCount+1)+".xml" ) );
      XmlUtils.writeXml( link, output );
    }
    catch (JAXBException ex)
    {
      throw new IOException( "Can't write XML for an attachment of object '" + pooledObjectId + "'!", ex );
    }
    finally
    {
      IOUtils.closeQuietly( output );
    }
  }

  /**
   * Register an real estate object for removal.
   *
   * @param externalObjectId
   * real estate ID
   */
  public synchronized void putObjectForRemoval( String externalObjectId )
  {
    externalObjectId = StringUtils.trimToNull( externalObjectId );
    if (externalObjectId!=null)
      this.putSetting( "object."+externalObjectId, REMOVE );
  }

  /**
   * Put a settings to the export pool.
   *
   * @param key
   * setting key
   *
   * @param value
   * setting value
   */
  public synchronized void putSetting( String key, String value )
  {
    key = StringUtils.trimToNull( key );
    if (key==null) return;
    value = StringUtils.trimToNull( value );
    if (value==null && this.settings.containsKey( key ))
      this.settings.remove( key );
    else if (value!=null)
      this.settings.setProperty( key, value );
  }

  /**
   * Read export pool settings from local directory.
   *
   * @throws IOException
   * if settings are not loadable
   */
  public void readSettings() throws IOException
  {
    this.settings.clear();

    File file = new File( this.baseDir, "settings.xml" );
    if (!file.isFile()) return;

    InputStream input = null;
    try
    {
      input = new FileInputStream( file );
      this.settings.loadFromXML( input );
    }
    finally
    {
      IOUtils.closeQuietly( input );
    }
  }

  /**
   * Write export pool settings to local directory.
   *
   * @throws IOException
   * if settings are not wriable
   */
  public void writeSettings() throws IOException
  {
    if (!this.baseDir.exists() && !this.baseDir.mkdirs())
      throw new IOException( "Can't create folder at '" + this.baseDir.getAbsolutePath() + "'!" );

    File file = new File( this.baseDir, "settings.xml" );
    if (file.exists() && !file.delete())
      throw new IOException( "Can't remove file at '" + file.getAbsolutePath() + "'!" );

    OutputStream output = null;
    try
    {
      output = new FileOutputStream( file );
      this.settings.storeToXML( output, "ExportPool settings", "UTF-8" );
    }
    finally
    {
      IOUtils.closeQuietly( output );
    }
  }
}