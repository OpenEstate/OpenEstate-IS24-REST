/*
 * Copyright 2014 OpenEstate.org.
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

package org.openestate.is24.restapi.xml;

import java.io.IOException;
import java.io.OutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.openestate.is24.restapi.xml.common.Attachment;
import org.openestate.is24.restapi.xml.common.PublishObject;
import org.openestate.is24.restapi.xml.common.RealtorContactDetails;
import org.openestate.is24.restapi.xml.realestates.RealEstate;

/**
 *
 * @since 0.1
 * @deprecated use {@link org.openestate.is24.restapi.utils.XmlUtils} instead
 * @author Andreas Rudolph <andy@openindex.de>
 */
@Deprecated
public final class XmlUtils
{
  private XmlUtils()
  {
  }

  /**
   *
   * @deprecated use {@link org.openestate.is24.restapi.utils.XmlUtils#createMarshaller()} instead
   */
  @Deprecated
  public static Marshaller createMarshaller() throws JAXBException
  {
    return org.openestate.is24.restapi.utils.XmlUtils.createMarshaller();
  }

  /**
   *
   * @deprecated use {@link org.openestate.is24.restapi.utils.XmlUtils#createMarshaller(java.lang.String, boolean)} instead
   */
  @Deprecated
  public static Marshaller createMarshaller( String encoding, boolean prettyPrint ) throws JAXBException
  {
    return org.openestate.is24.restapi.utils.XmlUtils.createMarshaller( encoding, prettyPrint );
  }

  /**
   *
   * @deprecated use {@link org.openestate.is24.restapi.utils.XmlUtils#createUnmarshaller()} instead
   */
  @Deprecated
  public static Unmarshaller createUnmarshaller() throws JAXBException
  {
    return org.openestate.is24.restapi.utils.XmlUtils.createUnmarshaller();
  }

  /**
   *
   * @deprecated use {@link org.openestate.is24.restapi.utils.XmlUtils#getContext()} instead
   */
  @Deprecated
  public synchronized static JAXBContext getContext() throws JAXBException
  {
    return org.openestate.is24.restapi.utils.XmlUtils.getContext();
  }

  /**
   *
   * @deprecated use {@link org.openestate.is24.restapi.utils.XmlUtils#initContext(java.lang.ClassLoader)} instead
   */
  @Deprecated
  public synchronized static void initContext( ClassLoader classloader ) throws JAXBException
  {
    org.openestate.is24.restapi.utils.XmlUtils.initContext( classloader );
  }

  /**
   *
   * @deprecated use {@link org.openestate.is24.restapi.utils.XmlUtils#marshal(java.lang.Object)} instead
   */
  @Deprecated
  public static String marshal( Object object ) throws JAXBException, IOException
  {
    return org.openestate.is24.restapi.utils.XmlUtils.marshal( object );
  }

  /**
   *
   * @deprecated use {@link org.openestate.is24.restapi.utils.XmlUtils#marshal(java.lang.Object, java.lang.String)} instead
   */
  @Deprecated
  public static String marshal( Object object, String encoding ) throws JAXBException, IOException
  {
    return org.openestate.is24.restapi.utils.XmlUtils.marshal( object, encoding );
  }

  /**
   *
   * @deprecated use {@link org.openestate.is24.restapi.utils.XmlUtils#marshal(java.lang.Object, java.lang.String, boolean)} instead
   */
  @Deprecated
  public static String marshal( Object object, String encoding, boolean prettyPrint ) throws JAXBException, IOException
  {
    return org.openestate.is24.restapi.utils.XmlUtils.marshal( object, encoding, prettyPrint );
  }

  /**
   *
   * @deprecated use {@link org.openestate.is24.restapi.utils.XmlUtils#unmarshal(java.lang.String)} instead
   */
  @Deprecated
  public static Object unmarshal( String xml ) throws JAXBException
  {
    return org.openestate.is24.restapi.utils.XmlUtils.unmarshal( xml );
  }

  /**
   *
   * @deprecated use {@link org.openestate.is24.restapi.utils.XmlUtils#writeXml(org.openestate.is24.restapi.xml.common.Attachment, java.io.OutputStream)} instead
   */
  @Deprecated
  public static void writeXml( Attachment attachment, OutputStream output ) throws JAXBException
  {
    org.openestate.is24.restapi.utils.XmlUtils.writeXml( attachment, output );
  }

  /**
   *
   * @deprecated use {@link org.openestate.is24.restapi.utils.XmlUtils#writeXml(org.openestate.is24.restapi.xml.common.Attachment, java.lang.String, java.io.OutputStream)} instead
   */
  @Deprecated
  public static void writeXml( Attachment attachment, String encoding, OutputStream output ) throws JAXBException
  {
    org.openestate.is24.restapi.utils.XmlUtils.writeXml( attachment, encoding, output );
  }

  /**
   *
   * @deprecated use {@link org.openestate.is24.restapi.utils.XmlUtils#writeXml(org.openestate.is24.restapi.xml.common.Attachment, java.lang.String, boolean, java.io.OutputStream)} instead
   */
  @Deprecated
  public static void writeXml( Attachment attachment, String encoding, boolean prettyPrint, OutputStream output ) throws JAXBException
  {
    org.openestate.is24.restapi.utils.XmlUtils.writeXml( attachment, encoding, prettyPrint, output );
  }

  /**
   *
   * @deprecated use {@link org.openestate.is24.restapi.utils.XmlUtils#writeXml(org.openestate.is24.restapi.xml.common.Attachment, javax.xml.bind.Marshaller, java.io.OutputStream)} instead
   */
  @Deprecated
  public static void writeXml( Attachment attachment, Marshaller marshaller, OutputStream output ) throws JAXBException
  {
    org.openestate.is24.restapi.utils.XmlUtils.writeXml( attachment, marshaller, output );
  }

  /**
   *
   * @deprecated use {@link org.openestate.is24.restapi.utils.XmlUtils#writeXml(org.openestate.is24.restapi.xml.common.PublishObject, java.io.OutputStream)} instead
   */
  @Deprecated
  public static void writeXml( PublishObject publishing, OutputStream output ) throws JAXBException
  {
    org.openestate.is24.restapi.utils.XmlUtils.writeXml( publishing, output );
  }

  /**
   *
   * @deprecated use {@link org.openestate.is24.restapi.utils.XmlUtils#writeXml(org.openestate.is24.restapi.xml.common.PublishObject, java.lang.String, java.io.OutputStream)} instead
   */
  @Deprecated
  public static void writeXml( PublishObject publishing, String encoding, OutputStream output ) throws JAXBException
  {
    org.openestate.is24.restapi.utils.XmlUtils.writeXml( publishing, encoding, output );
  }

  /**
   *
   * @deprecated use {@link org.openestate.is24.restapi.utils.XmlUtils#writeXml(org.openestate.is24.restapi.xml.common.PublishObject, java.lang.String, boolean, java.io.OutputStream)} instead
   */
  @Deprecated
  public static void writeXml( PublishObject publishing, String encoding, boolean prettyPrint, OutputStream output ) throws JAXBException
  {
    org.openestate.is24.restapi.utils.XmlUtils.writeXml( publishing, encoding, prettyPrint, output );
  }

  /**
   *
   * @deprecated use {@link org.openestate.is24.restapi.utils.XmlUtils#writeXml(org.openestate.is24.restapi.xml.common.PublishObject, javax.xml.bind.Marshaller, java.io.OutputStream)} instead
   */
  @Deprecated
  public static void writeXml( PublishObject publishing, Marshaller marshaller, OutputStream output ) throws JAXBException
  {
    org.openestate.is24.restapi.utils.XmlUtils.writeXml( publishing, marshaller, output );
  }

  /**
   *
   * @deprecated use {@link org.openestate.is24.restapi.utils.XmlUtils#writeXml(org.openestate.is24.restapi.xml.common.RealtorContactDetails, java.io.OutputStream)} instead
   */
  @Deprecated
  public static void writeXml( RealtorContactDetails contact, OutputStream output ) throws JAXBException
  {
    org.openestate.is24.restapi.utils.XmlUtils.writeXml( contact, output );
  }

  /**
   *
   * @deprecated use {@link org.openestate.is24.restapi.utils.XmlUtils#writeXml(org.openestate.is24.restapi.xml.common.RealtorContactDetails, java.lang.String, java.io.OutputStream)} instead
   */
  @Deprecated
  public static void writeXml( RealtorContactDetails contact, String encoding, OutputStream output ) throws JAXBException
  {
    org.openestate.is24.restapi.utils.XmlUtils.writeXml( contact, encoding, output );
  }

  /**
   *
   * @deprecated use {@link org.openestate.is24.restapi.utils.XmlUtils#writeXml(org.openestate.is24.restapi.xml.common.RealtorContactDetails, java.lang.String, boolean, java.io.OutputStream)} instead
   */
  @Deprecated
  public static void writeXml( RealtorContactDetails contact, String encoding, boolean prettyPrint, OutputStream output ) throws JAXBException
  {
    org.openestate.is24.restapi.utils.XmlUtils.writeXml( contact, encoding, prettyPrint, output );
  }

  /**
   *
   * @deprecated use {@link org.openestate.is24.restapi.utils.XmlUtils#writeXml(org.openestate.is24.restapi.xml.common.RealtorContactDetails, javax.xml.bind.Marshaller, java.io.OutputStream)} instead
   */
  @Deprecated
  public static void writeXml( RealtorContactDetails contact, Marshaller marshaller, OutputStream output ) throws JAXBException
  {
    org.openestate.is24.restapi.utils.XmlUtils.writeXml( contact, marshaller, output );
  }

  /**
   *
   * @deprecated use {@link org.openestate.is24.restapi.utils.XmlUtils#writeXml(org.openestate.is24.restapi.xml.realestates.RealEstate, java.io.OutputStream)} instead
   */
  @Deprecated
  public static void writeXml( RealEstate realEstate, OutputStream output ) throws JAXBException
  {
    org.openestate.is24.restapi.utils.XmlUtils.writeXml( realEstate, output );
  }

  /**
   *
   * @deprecated use {@link org.openestate.is24.restapi.utils.XmlUtils#writeXml(org.openestate.is24.restapi.xml.realestates.RealEstate, java.lang.String, java.io.OutputStream)} instead
   */
  @Deprecated
  public static void writeXml( RealEstate realEstate, String encoding, OutputStream output ) throws JAXBException
  {
    org.openestate.is24.restapi.utils.XmlUtils.writeXml( realEstate, encoding, output );
  }

  /**
   *
   * @deprecated use {@link org.openestate.is24.restapi.utils.XmlUtils#writeXml(org.openestate.is24.restapi.xml.realestates.RealEstate, java.lang.String, boolean, java.io.OutputStream)} instead
   */
  @Deprecated
  public static void writeXml( RealEstate realEstate, String encoding, boolean prettyPrint, OutputStream output ) throws JAXBException
  {
    org.openestate.is24.restapi.utils.XmlUtils.writeXml( realEstate, encoding, prettyPrint, output );
  }

  /**
   *
   * @deprecated use {@link org.openestate.is24.restapi.utils.XmlUtils#writeXml(org.openestate.is24.restapi.xml.realestates.RealEstate, javax.xml.bind.Marshaller, java.io.OutputStream)} instead
   */
  @Deprecated
  public static void writeXml( RealEstate realEstate, Marshaller marshaller, OutputStream output ) throws JAXBException
  {
    org.openestate.is24.restapi.utils.XmlUtils.writeXml( realEstate, marshaller, output );
  }
}