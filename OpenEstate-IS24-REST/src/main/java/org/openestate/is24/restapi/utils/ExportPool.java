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
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOExceptionWithCause;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.SystemUtils;
import org.openestate.is24.restapi.xml.common.Attachment;
import org.openestate.is24.restapi.xml.common.RealtorContactDetails;
import org.openestate.is24.restapi.xml.realestates.RealEstate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ExportPool.
*
 * @author Andreas Rudolph <andy@openindex.de>
 */
public class ExportPool
{
  private final static Logger LOGGER = LoggerFactory.getLogger( ExportPool.class );
  //private final static String FULL_TRANSFER = "FullTransfer";
  private final static String UPDATE = "UPDATE";
  private final static String REMOVE = "REMOVE";
  private final File baseDir;
  private final File contactsDir;
  private final File objectsDir;
  private final Properties settings;

  public ExportPool()
  {
    this( new File( SystemUtils.getJavaIoTmpDir(), "pool-"+System.currentTimeMillis() ) );
  }

  public ExportPool( File baseDir )
  {
    this.baseDir = baseDir;
    this.contactsDir = new File( this.baseDir, "contacts" );
    this.objectsDir = new File( this.baseDir, "objects" );
    this.settings = new Properties();
  }

  public void cleanup()
  {
    this.settings.clear();
    FileUtils.deleteQuietly( this.baseDir );
  }

  public final File getBaseDir()
  {
    return baseDir;
  }

  public RealtorContactDetails getContact( String externalContactId ) throws IOException
  {
    if (StringUtils.isBlank( externalContactId )) return null;

    final File xmlFile = new File( new File( this.contactsDir, externalContactId ), "contact.xml" );
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
      throw new IOExceptionWithCause(
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
          "Can't read XML file for contact '" + externalContactId + "'!" );
      }
      contact.setExternalId( externalContactId );
      return contact;
    }
    catch (JAXBException ex)
    {
      throw new IOExceptionWithCause(
        "Can't read XML file for contact '" + externalContactId + "'!", ex );
    }
  }

  public String[] getContactIds()
  {
    if (!this.contactsDir.isDirectory()) return new String[]{};
    List<String> ids = new ArrayList<String>();
    for (File f : this.contactsDir.listFiles())
    {
      if (f.isDirectory()) ids.add( f.getName() );
    }
    return ids.toArray( new String[ids.size()] );
  }

  public long getContactSize( String externalContactId, boolean completely )
  {
    if (StringUtils.isBlank( externalContactId )) return 0;
    File file = new File( this.contactsDir, externalContactId );
    if (!completely) file = new File( file, "contact.xml" );
    return (file.isFile())? FileUtils.sizeOf( file ): 0;
  }

  public final File getContactsDir()
  {
    return contactsDir;
  }

  public RealEstate getObject( String externalObjectId ) throws IOException
  {
    if (StringUtils.isBlank( externalObjectId )) return null;

    final File xmlFile = new File( new File( this.objectsDir, externalObjectId ), "object.xml" );
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
      throw new IOExceptionWithCause(
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
          "Can't read XML file for object '" + externalObjectId + "'!" );
      }
      object.setExternalId( externalObjectId );
      return object;
    }
    catch (JAXBException ex)
    {
      throw new IOExceptionWithCause(
        "Can't read XML file for object '" + externalObjectId + "'!", ex );
    }
  }

  public Attachment getObjectAttachment( String externalObjectId, String attachmentId ) throws IOException
  {
    if (StringUtils.isBlank( externalObjectId ) || StringUtils.isBlank( attachmentId )) return null;

    final File xmlFile = new File( new File( this.objectsDir, externalObjectId ), "attachment." + attachmentId + ".xml" );
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
      throw new IOExceptionWithCause(
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
          "Can't read XML file for object '" + externalObjectId + "'!" );
      }
      attachment.setExternalId( externalObjectId );
      return attachment;
    }
    catch (JAXBException ex)
    {
      throw new IOExceptionWithCause(
        "Can't read XML file for object '" + externalObjectId + "'!", ex );
    }
  }

  public File getObjectAttachmentFile( String externalObjectId, Attachment attachment ) throws IOException
  {
    return (attachment!=null)?
      getObjectAttachmentFile( externalObjectId, attachment.getHref() ): null;
  }

  public File getObjectAttachmentFile( String externalObjectId, URL href ) throws IOException
  {
    return (href!=null && href.getProtocol().equalsIgnoreCase( "file" ))?
      getObjectAttachmentFile( externalObjectId, StringUtils.trimToNull( href.getHost() ) ): null;
  }

  public File getObjectAttachmentFile( String externalObjectId, String name ) throws IOException
  {
    if (StringUtils.isBlank( name )) return null;
    final File file = new File( new File( this.objectsDir, externalObjectId ), name );
    return (file.isFile())? file: null;
  }

  public long getObjectAttachmentSize( String externalObjectId, String attachmentId ) throws IOException
  {
    if (StringUtils.isBlank( externalObjectId ) || StringUtils.isBlank( attachmentId )) return 0;
    File file = new File( new File( this.objectsDir, externalObjectId ), "attachment." + attachmentId + ".xml" );
    return (file.isFile())? FileUtils.sizeOf( file ): 0;
  }

  public URL getObjectAttachmentURL( String externalObjectId, String attachmentId ) throws IOException
  {
    Attachment attachment = this.getObjectAttachment( externalObjectId, attachmentId );
    return (attachment!=null)? attachment.getHref(): null;
  }

  public String[] getObjectAttachmentIds( String externalObjectId )
  {
    final File objectDir = new File( this.objectsDir, externalObjectId );
    if (!objectDir.isDirectory()) return new String[]{};

    List<String> ids = new ArrayList<String>();
    for (File f : objectDir.listFiles())
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
    return ids.toArray( new String[ids.size()] );
  }

  public String[] getObjectIds()
  {
    if (!this.objectsDir.isDirectory()) return new String[]{};
    List<String> ids = new ArrayList<String>();
    for (File f : this.objectsDir.listFiles())
    {
      if (f.isDirectory()) ids.add( f.getName() );
    }
    return ids.toArray( new String[ids.size()] );
  }

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

  public long getObjectSize( String externalObjectId, boolean completely )
  {
    if (StringUtils.isBlank( externalObjectId )) return 0;
    File file = new File( this.objectsDir, externalObjectId );
    if (!completely) file = new File( file, "object.xml" );
    return (file.isFile())? FileUtils.sizeOf( file ): 0;
  }

  public final File getObjectsDir()
  {
    return objectsDir;
  }

  public String getSetting( String key )
  {
    return this.getSetting( key, null );
  }

  public String getSetting( String key, String defaultValue )
  {
    return this.settings.getProperty( key, defaultValue );
  }

  public long getTotalSize()
  {
    return (this.baseDir.exists())?
      FileUtils.sizeOf( this.baseDir ): 0;
  }

  /*public boolean isFullTransfer()
  {
    return "1".equals( this.getSetting( FULL_TRANSFER, "0" ) );
  }*/

  public boolean hasContactForExport( String externalContactId )
  {
    if (StringUtils.isBlank( externalContactId )) return false;
    final File xmlFile = new File( new File( this.contactsDir, externalContactId ), "contact.xml" );
    return xmlFile.isFile();
  }

  public boolean hasObjectForExport( String externalObjectId )
  {
    if (StringUtils.isBlank( externalObjectId )) return false;
    final File xmlFile = new File( new File( this.objectsDir, externalObjectId ), "object.xml" );
    return xmlFile.isFile();
  }

  public boolean hasObjectForRemoval( String externalObjectId )
  {
    if (StringUtils.isBlank( externalObjectId )) return false;
    return REMOVE.equalsIgnoreCase( this.getSetting( "object."+externalObjectId ) );
  }

  public synchronized void putContact( RealtorContactDetails contact ) throws IOException
  {
    if (contact==null) return;

    final File contactDir = new File( this.contactsDir, contact.getExternalId() );
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
      throw new IOExceptionWithCause( "Can't write XML for contact '" + contact.getExternalId() + "'!", ex );
    }
    finally
    {
      IOUtils.closeQuietly( output );
    }
  }

  public synchronized void putObject( RealEstate object ) throws IOException
  {
    if (object==null) return;

    final File objectDir = new File( this.objectsDir, object.getExternalId() );
    if (objectDir.exists())
      FileUtils.deleteDirectory( objectDir );
    if (!objectDir.mkdirs())
      throw new IOException( "Can't create folder at '" + objectDir.getAbsolutePath() + "'!" );

    OutputStream output = null;
    try
    {
      output = new FileOutputStream( new File( objectDir, "object.xml" ) );
      XmlUtils.writeXml( object, output );
      this.putSetting( "object."+object.getExternalId(), UPDATE );
    }
    catch (JAXBException ex)
    {
      throw new IOExceptionWithCause( "Can't write XML for object '" + object.getExternalId() + "'!", ex );
    }
    finally
    {
      IOUtils.closeQuietly( output );
    }
  }

  public synchronized void putObjectAttachedFile( String externalObjectId, Attachment attachment, File file ) throws IOException
  {
    if (StringUtils.isBlank( externalObjectId ) || attachment==null || file==null || !file.isFile()) return;

    final File objectDir = new File( this.objectsDir, externalObjectId );
    if (!objectDir.exists() && !objectDir.mkdirs())
      throw new IOException( "Can't create folder at '" + objectDir.getAbsolutePath() + "'!" );

    int attachmentCount = 0;
    for (File f : objectDir.listFiles())
    {
      String n = f.getName();
      if (n.startsWith( "attachment." ) && n.endsWith( ".xml" ))
        attachmentCount++;
    }

    final File destFile = new File( objectDir, file.getName() );
    FileUtils.copyFile( file, destFile );
    attachment.setHref( new URL( "file://" + file.getName() ) );

    OutputStream output = null;
    try
    {
      output = new FileOutputStream( new File( objectDir, "attachment."+(attachmentCount+1)+".xml" ) );
      XmlUtils.writeXml( attachment, output );
    }
    catch (JAXBException ex)
    {
      throw new IOExceptionWithCause( "Can't write XML for an attachment of object '" + externalObjectId + "'!", ex );
    }
    finally
    {
      IOUtils.closeQuietly( output );
    }
  }

  public synchronized void putObjectAttachedFile( String externalObjectId, Attachment attachment, URL file ) throws IOException
  {
    if (StringUtils.isBlank( externalObjectId ) || attachment==null || file==null) return;

    final File objectDir = new File( this.objectsDir, externalObjectId );
    if (!objectDir.exists() && !objectDir.mkdirs())
      throw new IOException( "Can't create folder at '" + objectDir.getAbsolutePath() + "'!" );

    int attachmentCount = 0;
    for (File f : objectDir.listFiles())
    {
      String n = f.getName();
      if (n.startsWith( "attachment." ) && n.endsWith( ".xml" ))
        attachmentCount++;
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
      throw new IOExceptionWithCause( "Can't write XML for an attachment of object '" + externalObjectId + "'!", ex );
    }
    finally
    {
      IOUtils.closeQuietly( output );
    }
  }

  public synchronized void putObjectAttachedLink( String externalObjectId, Attachment link ) throws IOException
  {
    if (StringUtils.isBlank( externalObjectId ) || link==null) return;

    final File objectDir = new File( this.objectsDir, externalObjectId );
    if (!objectDir.exists() && !objectDir.mkdirs())
      throw new IOException( "Can't create folder at '" + objectDir.getAbsolutePath() + "'!" );

    int attachmentCount = 0;
    for (File f : objectDir.listFiles())
    {
      String n = f.getName();
      if (n.startsWith( "attachment." ) && n.endsWith( ".xml" ))
        attachmentCount++;
    }

    OutputStream output = null;
    try
    {
      output = new FileOutputStream( new File( objectDir, "attachment."+(attachmentCount+1)+".xml" ) );
      XmlUtils.writeXml( link, output );
    }
    catch (JAXBException ex)
    {
      throw new IOExceptionWithCause( "Can't write XML for an attachment of object '" + externalObjectId + "'!", ex );
    }
    finally
    {
      IOUtils.closeQuietly( output );
    }
  }

  public synchronized void putObjectForRemoval( String externalObjectId )
  {
    externalObjectId = StringUtils.trimToNull( externalObjectId) ;
    if (externalObjectId!=null)
      this.putSetting( "object."+externalObjectId, REMOVE );
  }

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

  /*public void setFullTransfer( boolean fullTransfer )
  {
    this.putSetting( FULL_TRANSFER, (fullTransfer)? "1": "0" );
  }*/

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