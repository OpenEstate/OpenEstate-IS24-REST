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

package org.openestate.is24.restapi;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import oauth.signpost.exception.OAuthException;
import org.apache.commons.lang.StringUtils;
import org.openestate.is24.restapi.utils.RequestFailedException;
import org.openestate.is24.restapi.utils.RequestMethod;
import org.openestate.is24.restapi.utils.Response;
import org.openestate.is24.restapi.utils.XmlUtils;
import org.openestate.is24.restapi.xml.common.Attachment;
import org.openestate.is24.restapi.xml.common.Attachments;
import org.openestate.is24.restapi.xml.common.Messages;
import org.openestate.is24.restapi.xml.common.PublishChannels;
import org.openestate.is24.restapi.xml.common.PublishObject;
import org.openestate.is24.restapi.xml.common.PublishObjects;
import org.openestate.is24.restapi.xml.common.RealtorContactDetails;
import org.openestate.is24.restapi.xml.common.RealtorContactDetailsList;
import org.openestate.is24.restapi.xml.realestates.RealEstate;
import org.openestate.is24.restapi.xml.realestates.RealEstates;
import org.openestate.is24.restapi.xml.videoupload.VideoUploadTicket;

/**
 * Client methods for the <a href="http://developerwiki.immobilienscout24.de/wiki/Import-Export-API">Import-/Export-API</a>.
 *
 * @author Andreas Rudolph <andy@openindex.de>
 */
public final class ImportExport
{
  //private final static Logger LOGGER = LoggerFactory.getLogger( ImportExport.class );
  public final static int PUBLISH_CHANNEL_IS24_ID = 10000;
  public final static String PUBLISH_CHANNEL_IS24_TITLE = "Immobilienscout24";
  public final static int PUBLISH_CHANNEL_HOMEPAGE_ID = 10001;
  public final static String PUBLISH_CHANNEL_HOMEPAGE_TITLE = "Homepage";
  public final static int MAXIMAL_FILES_PER_PROPERTY = 30;
  public final static int MAXIMAL_VIDEOS_PER_PROPERTY = 1;

  private ImportExport()
  {
  }

  /**
   * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment">Attachment Webservice</a>,
   * that is part of the <a href="http://developerwiki.immobilienscout24.de/wiki/Import-Export-API">Import-/Export-API</a>.
   *
   * @author Andreas Rudolph <andy@openindex.de>
   */
  public final static class AttachmentService
  {
    private AttachmentService()
    {
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment/DELETEbyID">DELETEBYID method</a>.
     *
     * @param client
     * @param externalId
     * @param attachmentId
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static Messages deleteById( AbstractClient client, String externalId, long attachmentId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/realestate/ext-"+externalId+"/attachment/"+attachmentId;

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.DELETE, null );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.OK)
      {
        return (Messages) XmlUtils.unmarshal( response.body );
      }

      // return null, if the requested object was not found
      else if (response.statusCode==Response.NOT_FOUND)
      {
        return null;
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment/DELETEbyID">DELETEBYID method</a>.
     *
     * @param client
     * @param is24Id
     * @param attachmentId
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static Messages deleteById( AbstractClient client, long is24Id, long attachmentId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/realestate/"+is24Id+"/attachment/"+attachmentId;

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.DELETE, null );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.OK)
      {
        return (Messages) XmlUtils.unmarshal( response.body );
      }

      // return null, if the requested object was not found
      else if (response.statusCode==Response.NOT_FOUND)
      {
        return null;
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment/GETALL">GETALL method</a>.
     *
     * @param client
     * @param externalId
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static Attachments getAll( AbstractClient client, String externalId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/realestate/ext-"+externalId+"/attachment";

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.OK)
      {
        return ((JAXBElement<Attachments>)
          XmlUtils.unmarshal( response.body )).getValue();
      }

      // return null, if the requested object was not found
      else if (response.statusCode==Response.NOT_FOUND)
      {
        return null;
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment/GETALL">GETALL method</a>.
     *
     * @param client
     * @param is24Id
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static Attachments getAll( AbstractClient client, long is24Id ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/realestate/"+is24Id+"/attachment";

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.OK)
      {
        return ((JAXBElement<Attachments>)
          XmlUtils.unmarshal( response.body )).getValue();
      }

      // return null, if the requested object was not found
      else if (response.statusCode==Response.NOT_FOUND)
      {
        return null;
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment/GETbyID">GETBYID method</a>.
     *
     * @param client
     * @param externalId
     * @param attachmentId
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static Attachment getById( AbstractClient client, String externalId, long attachmentId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/realestate/ext-"+externalId+"/attachment/"+attachmentId;

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.OK)
      {
        return ((JAXBElement<Attachment>)
          XmlUtils.unmarshal( response.body )).getValue();
      }

      // return null, if the requested object was not found
      else if (response.statusCode==Response.NOT_FOUND)
      {
        return null;
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment/GETbyID">GETBYID method</a>.
     *
     * @param client
     * @param is24Id
     * @param attachmentId
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static Attachment getById( AbstractClient client, long is24Id, long attachmentId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/realestate/"+is24Id+"/attachment/"+attachmentId;

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.OK)
      {
        return ((JAXBElement<Attachment>)
          XmlUtils.unmarshal( response.body )).getValue();
      }

      // return null, if the requested object was not found
      else if (response.statusCode==Response.NOT_FOUND)
      {
        return null;
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment/POST">POST method</a>.
     *
     * @param client
     * @param externalId
     * @param attachment
     * @param input
     * @param fileName
     * @param mimeType
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static Messages post( AbstractClient client, String externalId, Attachment attachment, InputStream input, String fileName, String mimeType ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/realestate/ext-"+externalId+"/attachment";

      // write object into xml
      String xml = XmlUtils.marshal( attachment, client.getEncoding() );

      final Response response;

      // send multipart request
      if (input!=null)
        response = client.sendXmlAttachmentRequest( new URL( url ), RequestMethod.POST, xml, input, fileName, mimeType );

      // send singlepart request
      else
        response = client.sendXmlRequest( new URL( url ), RequestMethod.POST, xml );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.CREATED)
      {
        return (Messages) XmlUtils.unmarshal( response.body );
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment/POST">POST method</a>.
     *
     * @param client
     * @param is24Id
     * @param attachment
     * @param input
     * @param fileName
     * @param mimeType
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static Messages post( AbstractClient client, long is24Id, Attachment attachment, InputStream input, String fileName, String mimeType ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/realestate/"+is24Id+"/attachment";

      // write object into xml
      String xml = XmlUtils.marshal( attachment, client.getEncoding() );

      // send request
      Response response = client.sendXmlAttachmentRequest( new URL( url ), RequestMethod.POST, xml, input, fileName, mimeType );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.CREATED)
      {
        return (Messages) XmlUtils.unmarshal( response.body );
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment/PUTbyID">PUTBYID method</a>.
     *
     * @param client
     * @param externalId
     * @param attachmentId
     * @param attachment
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static Messages putById( AbstractClient client, String externalId, long attachmentId, Attachment attachment ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/realestate/ext-"+externalId+"/attachment/"+attachmentId;

      // write object into xml
      String xml = XmlUtils.marshal( attachment, client.getEncoding() );

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.PUT, xml );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.OK)
      {
        return (Messages) XmlUtils.unmarshal( response.body );
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment/PUTbyID">PUTBYID method</a>.
     *
     * @param client
     * @param is24Id
     * @param attachmentId
     * @param attachment
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static Messages putById( AbstractClient client, long is24Id, long attachmentId, Attachment attachment ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/realestate/"+is24Id+"/attachment/"+attachmentId;

      // write object into xml
      String xml = XmlUtils.marshal( attachment, client.getEncoding() );

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.PUT, xml );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.OK)
      {
        return (Messages) XmlUtils.unmarshal( response.body );
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }
  }

  /**
   * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment/attachmentsorder">Attachmentsorder Webservice</a>,
   * that is part of the <a href="http://developerwiki.immobilienscout24.de/wiki/Import-Export-API">Import-/Export-API</a>.
   *
   * @author Andreas Rudolph <andy@openindex.de>
   */
  public final static class AttachmentsOrderService
  {
    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment/attachmentsorder/GET">GET method</a>.
     *
     * @param client
     * @param externalId
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static org.openestate.is24.restapi.xml.attachmentsorder.List get( AbstractClient client, String externalId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/realestate/ext-"+externalId+"/attachment/attachmentsorder";

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.OK)
      {
        return ((JAXBElement<org.openestate.is24.restapi.xml.attachmentsorder.List>)
          XmlUtils.unmarshal( response.body )).getValue();
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment/attachmentsorder/GET">GET method</a>.
     *
     * @param client
     * @param is24Id
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static org.openestate.is24.restapi.xml.attachmentsorder.List get( AbstractClient client, long is24Id ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/realestate/"+is24Id+"/attachment/attachmentsorder";

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.OK)
      {
        return ((JAXBElement<org.openestate.is24.restapi.xml.attachmentsorder.List>)
          XmlUtils.unmarshal( response.body )).getValue();
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment/attachmentsorder/PUT">PUT method</a>.
     *
     * @param client
     * @param externalId
     * @param list
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static Messages put( AbstractClient client, String externalId, org.openestate.is24.restapi.xml.attachmentsorder.List list ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      if (list==null) throw new NullPointerException( "No object was provided for publishing!" );

      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/realestate/ext-"+externalId+"/attachment/attachmentsorder";

      // write object into xml
      String xml = XmlUtils.marshal( new org.openestate.is24.restapi.xml.attachmentsorder.ObjectFactory().createAttachmentsorder( list ), client.getEncoding() );

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.PUT, xml );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.OK)
      {
        return (Messages) XmlUtils.unmarshal( response.body );
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment/attachmentsorder/PUT">PUT method</a>.
     *
     * @param client
     * @param is24Id
     * @param list
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static Messages put( AbstractClient client, long is24Id, org.openestate.is24.restapi.xml.attachmentsorder.List list ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      if (list==null) throw new NullPointerException( "No object was provided for publishing!" );

      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/realestate/"+is24Id+"/attachment/attachmentsorder";

      // write object into xml
      String xml = XmlUtils.marshal( new org.openestate.is24.restapi.xml.attachmentsorder.ObjectFactory().createAttachmentsorder( list ), client.getEncoding() );

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.PUT, xml );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.OK)
      {
        return (Messages) XmlUtils.unmarshal( response.body );
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }
  }

  /**
   * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Contact">Contact Address Webservice</a>,
   * that is part of the <a href="http://developerwiki.immobilienscout24.de/wiki/Import-Export-API">Import-/Export-API</a>.
   *
   * @author Andreas Rudolph <andy@openindex.de>
   */
  public final static class ContactAddressService
  {
    private ContactAddressService()
    {
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Contact/GETALL">GETALL method</a>.
     *
     * @param client
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static RealtorContactDetailsList getAll( AbstractClient client ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/contact";

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.OK)
      {
        return (RealtorContactDetailsList) XmlUtils.unmarshal( response.body );
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Contact/GETbyID">GETBYID method</a>.
     *
     * @param client
     * @param externalId
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static RealtorContactDetails getByExternalId( AbstractClient client, String externalId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/contact/ext-"+externalId;

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.OK)
      {
        return ((JAXBElement<RealtorContactDetails>)
          XmlUtils.unmarshal( response.body )).getValue();
      }

      // return null, if the requested object was not found
      else if (response.statusCode==Response.NOT_FOUND)
      {
        return null;
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Contact/GETbyID">GETBYID method</a>.
     *
     * @param client
     * @param is24Id
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static RealtorContactDetails getByIs24Id( AbstractClient client, long is24Id ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/contact/"+is24Id;

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.OK)
      {
        return ((JAXBElement<RealtorContactDetails>)
          XmlUtils.unmarshal( response.body )).getValue();
      }

      // return null, if the requested object was not found
      else if (response.statusCode==Response.NOT_FOUND)
      {
        return null;
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Contact/POST">POST method</a>.
     *
     * @param client
     * @param contact
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static Messages post( AbstractClient client, RealtorContactDetails contact ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      if (contact==null) throw new NullPointerException( "No contact was provided!" );

      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/contact";

      // write object into xml
      String xml = XmlUtils.marshal( contact, client.getEncoding() );

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.POST, xml );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.CREATED)
      {
        return (Messages) XmlUtils.unmarshal( response.body );
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Contact/PUTbyID">PUTBYID method</a>.
     *
     * @param client
     * @param contact
     * @param externalId
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static Messages putByExternalId( AbstractClient client, RealtorContactDetails contact, String externalId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/contact/ext-"+externalId;

      // write object into xml
      String xml = XmlUtils.marshal( contact, client.getEncoding() );

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.PUT, xml );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.OK)
      {
        return (Messages) XmlUtils.unmarshal( response.body );
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Contact/PUTbyID">PUTBYID method</a>.
     *
     * @param client
     * @param contact
     * @param is24Id
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static Messages putByIs24Id( AbstractClient client, RealtorContactDetails contact, long is24Id ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/contact/"+is24Id;

      // write object into xml
      String xml = XmlUtils.marshal( contact, client.getEncoding() );

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.PUT, xml );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.OK)
      {
        return (Messages) XmlUtils.unmarshal( response.body );
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }
  }

  /**
   * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/Publish">Publish Webservice</a>,
   * that is part of the <a href="http://developerwiki.immobilienscout24.de/wiki/Import-Export-API">Import-/Export-API</a>.
   *
   * @author Andreas Rudolph <andy@openindex.de>
   */
  public final static class PublishService
  {
    private PublishService()
    {
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/Publish/DELETEbyID">DELETEBYID method</a>.
     *
     * @param client
     * @param publishId
     *        the unique publish id, generated by Immobilienscout24
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static Messages deleteById( AbstractClient client, String publishId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/publish/"+publishId;

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.DELETE, null );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.OK)
      {
        return (Messages) XmlUtils.unmarshal( response.body );
      }

      // return null, if the requested object was not found
      else if (response.statusCode==Response.NOT_FOUND)
      {
        return null;
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/Publish/GET">GET method</a>.
     *
     * @param client
     * @param is24Id
     *        the immoscout object id of the real estate object
     * @param publishChannelId
     *        the ID of a certain publish channel (optional, default 0)
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static PublishObjects get( AbstractClient client, long is24Id, long publishChannelId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/publish";

      // init URL parameters
      List<String> params = new ArrayList<String>();

      if (is24Id>0) params.add( "realestate=" + is24Id );

      if (publishChannelId>0) params.add( "publishchannel=" + publishChannelId );

      // append URL parameters
      if (!params.isEmpty()) url += "?" + StringUtils.join( params, "&" );

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.OK)
      {
        return (PublishObjects) XmlUtils.unmarshal( response.body );
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/Publish/GETbyID">GETBYID method</a>.
     *
     * @param client
     * @param publishId
     *        the unique publish id, generated by Immobilienscout24
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static PublishObject getById( AbstractClient client, String publishId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/publish/"+publishId;

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.OK)
      {
        return ((JAXBElement<PublishObject>)
          XmlUtils.unmarshal( response.body )).getValue();
      }

      // return null, if the requested object was not found
      else if (response.statusCode==Response.NOT_FOUND)
      {
        return null;
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/Publish/POST">POST method</a>.
     *
     * @param client
     * @param publishObject
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static Messages post( AbstractClient client, PublishObject publishObject ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      if (publishObject==null) throw new NullPointerException( "No object was provided for publishing!" );

      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/publish";

      // write object into xml
      String xml = XmlUtils.marshal( publishObject, client.getEncoding() );

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.POST, xml );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.CREATED)
      {
        return (Messages) XmlUtils.unmarshal( response.body );
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }
  }

  /**
   * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/PublishChannel/GET">PublishChannel Webservice</a>,
   * that is part of the <a href="http://developerwiki.immobilienscout24.de/wiki/Import-Export-API">Import-/Export-API</a>.
   *
   * @author Andreas Rudolph <andy@openindex.de>
   */
  public final static class PublishChannelService
  {
    private PublishChannelService()
    {
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/PublishChannel/GET">GET method</a>.
     *
     * @param client
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static PublishChannels get( AbstractClient client ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/publishchannel";

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.OK)
      {
        return (PublishChannels) XmlUtils.unmarshal( response.body );
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }
  }

  /**
   * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate">RealEstate Webservice</a>,
   * that is part of the <a href="http://developerwiki.immobilienscout24.de/wiki/Import-Export-API">Import-/Export-API</a>.
   *
   * @author Andreas Rudolph <andy@openindex.de>
   */
  public final static class RealEstateService
  {
    private RealEstateService()
    {
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate/DELETEbyID">DELETEbyID method</a>.
     *
     * @param client
     * @param externalId
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static Messages deleteByExternalId( AbstractClient client, String externalId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/realestate/ext-"+externalId;

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.DELETE, null );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.OK)
      {
        return (Messages) XmlUtils.unmarshal( response.body );
      }

      // return null, if the requested object was not found
      else if (response.statusCode==Response.NOT_FOUND)
      {
        return null;
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate/DELETEbyID">DELETEbyID method</a>.
     *
     * @param client
     * @param is24Id
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static Messages deleteByIs24Id( AbstractClient client, long is24Id ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/realestate/"+is24Id;

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.DELETE, null );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.OK)
      {
        return (Messages) XmlUtils.unmarshal( response.body );
      }

      // return null, if the requested object was not found
      else if (response.statusCode==Response.NOT_FOUND)
      {
        return null;
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate/GETALL">GETALL method</a>.
     *
     * @param client
     * @param inPublishChannel
     *        the name of the publish channel to look for properties
     * @param notInPublishChannel
     *        the name of the publish channel not to look for properties
     * @param pageSize
     *        the number of properties per page (from min 1 until max 100, default 20)
     * @param pageNumber
     *        the page number to return (starts with 1, default 1)
     * @param archivedObjectsIncluded
     *        include archived objects into the result
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static RealEstates getAll( AbstractClient client, String inPublishChannel, String notInPublishChannel, int pageSize, int pageNumber, boolean archivedObjectsIncluded ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/realestate";

      // init URL parameters
      List<String> params = new ArrayList<String>();

      inPublishChannel = client.getEncodedParameterValue( inPublishChannel );
      if (inPublishChannel!=null) params.add( "publishchannel=" + inPublishChannel );

      notInPublishChannel = client.getEncodedParameterValue( notInPublishChannel );
      if (inPublishChannel!=null) params.add( "notinpublishchannel=" + notInPublishChannel );

      if (pageSize>=1 && pageSize<=100) params.add( "pagesize=" + pageSize );

      if (pageNumber>1) params.add( "pagenumber=" + pageNumber );

      params.add( "archivedobjectsincluded="+String.valueOf( archivedObjectsIncluded ) );

      // append URL parameters
      if (!params.isEmpty()) url += "?" + StringUtils.join( params, "&" );

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.OK)
      {
        return (RealEstates) XmlUtils.unmarshal( response.body );
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate/GETbyID">GETBYID method</a>.
     *
     * @param client
     * @param externalId
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static RealEstate getByExternalId( AbstractClient client, String externalId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/realestate/ext-"+externalId;

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.OK)
      {
        return ((JAXBElement<RealEstate>)
          XmlUtils.unmarshal( response.body )).getValue();
      }

      // return null, if the requested object was not found
      else if (response.statusCode==Response.NOT_FOUND)
      {
        return null;
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate/GETbyID">GETBYID method</a>.
     *
     * @param client
     * @param is24Id
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static RealEstate getByIs24Id( AbstractClient client, long is24Id ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/realestate/"+is24Id;

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.OK)
      {
        return ((JAXBElement<RealEstate>)
          XmlUtils.unmarshal( response.body )).getValue();
      }

      // return null, if the requested object was not found
      else if (response.statusCode==Response.NOT_FOUND)
      {
        return null;
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate/POST">POST method</a>.
     *
     * @param client
     * @param realEstate
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static Messages post( AbstractClient client, RealEstate realEstate ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      return post( client, realEstate, true );
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate/POST">POST method</a>.
     *
     * @param client
     * @param realEstate
     * @param useNewEnergySourceEnev2014Values
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static Messages post( AbstractClient client, RealEstate realEstate, boolean useNewEnergySourceEnev2014Values ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      if (realEstate==null) throw new NullPointerException( "No property was provided!" );

      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/realestate";

      // init URL parameters
      List<String> params = new ArrayList<String>();
      if (useNewEnergySourceEnev2014Values) params.add( "usenewenergysourceenev2014values=true" );

      // append URL parameters
      if (!params.isEmpty()) url += "?" + StringUtils.join( params, "&" );

      // write object into xml
      String xml = XmlUtils.marshal( realEstate, client.getEncoding() );
      //LOGGER.debug( StringUtils.repeat( "-", 50 ) );
      //LOGGER.debug( xml );
      //LOGGER.debug( StringUtils.repeat( "-", 50 ) );

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.POST, xml );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.CREATED)
      {
        return (Messages) XmlUtils.unmarshal( response.body );
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate/PUTbyID">PUTBYID method</a>.
     *
     * @param client
     * @param realEstate
     * @param externalId
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static Messages putByExternalId( AbstractClient client, RealEstate realEstate, String externalId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      return putByExternalId( client, realEstate, externalId, true );
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate/PUTbyID">PUTBYID method</a>.
     *
     * @param client
     * @param realEstate
     * @param externalId
     * @param useNewEnergySourceEnev2014Values
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static Messages putByExternalId( AbstractClient client, RealEstate realEstate, String externalId, boolean useNewEnergySourceEnev2014Values ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/realestate/ext-"+externalId;

      // init URL parameters
      List<String> params = new ArrayList<String>();
      if (useNewEnergySourceEnev2014Values) params.add( "usenewenergysourceenev2014values=true" );

      // append URL parameters
      if (!params.isEmpty()) url += "?" + StringUtils.join( params, "&" );

      // write object into xml
      String xml = XmlUtils.marshal( realEstate, client.getEncoding() );

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.PUT, xml );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.OK)
      {
        return (Messages) XmlUtils.unmarshal( response.body );
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate/PUTbyID">PUTBYID method</a>.
     *
     * @param client
     * @param realEstate
     * @param is24Id
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static Messages putByIs24Id( AbstractClient client, RealEstate realEstate, long is24Id ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      return putByIs24Id( client, realEstate, is24Id, true );
    }

    /**
     * Calls the <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate/PUTbyID">PUTBYID method</a>.
     *
     * @param client
     * @param realEstate
     * @param is24Id
     * @param useNewEnergySourceEnev2014Values
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static Messages putByIs24Id( AbstractClient client, RealEstate realEstate, long is24Id, boolean useNewEnergySourceEnev2014Values ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/realestate/"+is24Id;

      // init URL parameters
      List<String> params = new ArrayList<String>();
      if (useNewEnergySourceEnev2014Values) params.add( "usenewenergysourceenev2014values=true" );

      // append URL parameters
      if (!params.isEmpty()) url += "?" + StringUtils.join( params, "&" );

      // write object into xml
      String xml = XmlUtils.marshal( realEstate, client.getEncoding() );

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.PUT, xml );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.OK)
      {
        return (Messages) XmlUtils.unmarshal( response.body );
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }
  }

  /**
   * Calls the VideoUploadTicket Webservice as documented in the
   * <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment/POST#Example_for_streaming_video_with_videoId">description for video uploads</a>.
   *
   * @author Andreas Rudolph <andy@openindex.de>
   */
  public final static class VideoUploadService
  {
    private VideoUploadService()
    {
    }

    /**
     * A helper method, that obtains an upload ticket and sends the video file
     * to the specified upload service.
     *
     * @param client
     * @param input
     * @param fileName
     * @param fileSize
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static String doVideoUpload( AbstractClient client, InputStream input, String fileName, long fileSize ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // obtain a ticket for video upload
      VideoUploadTicket ticket = VideoUploadService.get( client );
      if (ticket==null)
        throw new IOException( "No upload ticket was found!" );

      // send video file to the service, that is specified in the ticket
      //LOGGER.debug( "UPLOAD VIDEO (" + fileName + ")" );
      //LOGGER.debug( "> upload url  : " + ticket.getUploadUrl() );
      //LOGGER.debug( "> auth key    : " + ticket.getAuth() );
      //LOGGER.debug( "> video id    : " + ticket.getVideoId() );
      //if (ticket.getValidUntil()!=null)
      //  LOGGER.debug( "> valid until : " + ticket.getValidUntil().getTime() );
      Response response = client.sendVideoUploadRequest(
        ticket.getUploadUrl(),
        RequestMethod.POST,
        ticket.getAuth(),
        input,
        fileName,
        fileSize );

      // return the video-id on successful upload
      if (response.statusCode==Response.OK || response.statusCode==Response.CREATED)
      {
        return ticket.getVideoId();
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }

    /**
     * Calls the GET method as documented in the
     * <a href="http://developerwiki.immobilienscout24.de/wiki/User/Realestate/attachment/POST#Example_for_streaming_video_with_videoId">description for video uploads</a>.
     *
     * @param client
     * @return
     * @throws IOException
     * @throws OAuthException
     * @throws JAXBException
     * @throws RequestFailedException
     */
    public static VideoUploadTicket get( AbstractClient client ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl() + "/api/offer/v1.0/user/me/videouploadticket";

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successfull execution
      if (response.statusCode==Response.OK)
      {
        return ((JAXBElement<VideoUploadTicket>)
          XmlUtils.unmarshal( response.body ) ).getValue();
      }

      // throw an error for any other status codes
      else
      {
        String msg = StringUtils.trimToNull( response.statusMessage );
        if (msg==null) msg = "Request failed!";
        msg += " (" + response.statusCode + ")";
        throw new RequestFailedException( response, msg );
      }
    }
  }
}