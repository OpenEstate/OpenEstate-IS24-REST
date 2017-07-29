/*
 * Copyright 2014-2017 OpenEstate.org.
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
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.openestate.is24.restapi.utils.RequestFailedException;
import org.openestate.is24.restapi.utils.RequestMethod;
import org.openestate.is24.restapi.utils.Response;
import org.openestate.is24.restapi.utils.XmlUtils;
import org.openestate.is24.restapi.xml.common.Attachment;
import org.openestate.is24.restapi.xml.common.Attachments;
import org.openestate.is24.restapi.xml.common.Message;
import org.openestate.is24.restapi.xml.common.MessageCode;
import org.openestate.is24.restapi.xml.common.Messages;
import org.openestate.is24.restapi.xml.common.PublishChannels;
import org.openestate.is24.restapi.xml.common.PublishObject;
import org.openestate.is24.restapi.xml.common.PublishObjects;
import org.openestate.is24.restapi.xml.common.RealtorContactDetails;
import org.openestate.is24.restapi.xml.common.RealtorContactDetailsList;
import org.openestate.is24.restapi.xml.realestatecounts.RealEstateCounts;
import org.openestate.is24.restapi.xml.realestates.RealEstate;
import org.openestate.is24.restapi.xml.realestates.RealEstates;
import org.openestate.is24.restapi.xml.videoupload.VideoUploadTicket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Low level methods for the Import-/Export-API.
 * <p>
 * These methods are calling the different Webservices of the Import-/Export-API.
 *
 * @see <a href="http://api.immobilienscout24.de/our-apis/import-export.html">Import-/Export-API</a>
 * @since 0.1
 * @author Andreas Rudolph
 */
public final class ImportExport
{
  private final static Logger LOGGER = LoggerFactory.getLogger( ImportExport.class );

  /**
   * ID for the publishing channel of ImmobilienScout24.
   */
  public final static int PUBLISH_CHANNEL_IS24_ID = 10000;

  /**
   * Name for the publishing channel of ImmobilienScout24.
   */
  public final static String PUBLISH_CHANNEL_IS24_TITLE = "Immobilienscout24";

  /**
   * ID for the publishing channel of the agency website.
   */
  public final static int PUBLISH_CHANNEL_HOMEPAGE_ID = 10001;

  /**
   * Name for the publishing channel of the agency website.
   */
  public final static String PUBLISH_CHANNEL_HOMEPAGE_TITLE = "Homepage";

  /**
   * Maximal number of supported files per real estate.
   */
  public final static int MAXIMAL_FILES_PER_PROPERTY = 30;

  /**
   * Maximal number of supported videos per real estate.
   */
  public final static int MAXIMAL_VIDEOS_PER_PROPERTY = 1;

  private ImportExport()
  {
  }

  /**
   * Low level methods for the Attachment Webservice.
   * <p>
   * The Attachment Webservice is used in the Import-/Export-API to get / add /
   * edit / remove attachments of a real estate object.
   *
   * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments.html">Attachment Webservice</a>
   * @see <a href="http://api.immobilienscout24.de/our-apis/import-export.html">Import-/Export-API</a>
   * @since 0.1
   * @author Andreas Rudolph
   */
  public final static class AttachmentService
  {
    private AttachmentService()
    {
    }

    /**
     * Call the DELETEbyID method of the Attachment Webservice.
     * <p>
     * This method removes the attachment of a real estate object.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param externalRealEstateId
     * user defined ID of the real estate object, for which the attachment is
     * removed
     *
     * @param is24AttachmentId
     * ID of the attachment to remove, that was returned by
     * {@link AttachmentService#post(org.openestate.is24.restapi.AbstractClient, java.lang.String, org.openestate.is24.restapi.xml.common.Attachment, java.io.InputStream, java.lang.String, java.lang.String)}
     *
     * @return
     * response of the Webservice after a successful request
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments/delete-by-id.html">DELETEbyID method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments.html">Attachment Webservice</a>
     */
    public static Messages deleteById( AbstractClient client, String externalRealEstateId, long is24AttachmentId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/realestate"
        + "/ext-" + AbstractClient.getUrlEncodedValue( externalRealEstateId )
        + "/attachment/" + is24AttachmentId;

      // execute request
      return _deleteById( client, url );
    }

    /**
     * Call the DELETEbyID method of the Attachment Webservice.
     * <p>
     * This method removes the attachment of a real estate object.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param is24RealEstateIdId
     * ID of the real estate object, that was returned by
     * {@link RealEstateService#post(org.openestate.is24.restapi.AbstractClient, org.openestate.is24.restapi.xml.realestates.RealEstate)},
     * for which the attachment is removed
     *
     * @param is24AttachmentId
     * ID of the attachment to remove, that was returned by
     * {@link AttachmentService#post(org.openestate.is24.restapi.AbstractClient, long, org.openestate.is24.restapi.xml.common.Attachment, java.io.InputStream, java.lang.String, java.lang.String)}
     *
     * @return
     * response of the Webservice after a successful request
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments/delete-by-id.html">DELETEbyID method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments.html">Attachment Webservice</a>
     */
    public static Messages deleteById( AbstractClient client, long is24RealEstateIdId, long is24AttachmentId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/realestate/" + is24RealEstateIdId
        + "/attachment/" + is24AttachmentId;

      // execute request
      return _deleteById( client, url );
    }

    private static Messages _deleteById( AbstractClient client, String url ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.DELETE, null );

      // parse result from response body after successful execution
      if (response.statusCode==Response.OK)
      {
        //LOGGER.debug( "------------------------------------" );
        //LOGGER.debug( "AttachmentService.deleteById" );
        //LOGGER.debug( url );
        //LOGGER.debug( response.body );
        //LOGGER.debug( "------------------------------------" );
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
     * Call the GETall method of the Attachment Webservice.
     * <p>
     * This method returns the list of attachments for a real estate object.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param externalRealEstateId
     * user defined ID of the real estate object, for which the list of
     * attachments is retrieved
     *
     * @return
     * list of attachments for the requested real estate object
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments/get-all.html">GETall method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments.html">Attachment Webservice</a>
     */
    public static Attachments getAll( AbstractClient client, String externalRealEstateId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/realestate"
        + "/ext-" + AbstractClient.getUrlEncodedValue( externalRealEstateId )
        + "/attachment";

      // execute request
      return _getAll( client, url );
    }

    /**
     * Call the GETall method of the Attachment Webservice.
     * <p>
     * This method returns the list of attachments for a real estate object.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param is24RealEstateIdId
     * ID of the real estate object, that was returned by
     * {@link RealEstateService#post(org.openestate.is24.restapi.AbstractClient, org.openestate.is24.restapi.xml.realestates.RealEstate)},
     * for which the list of attachments is retrieved
     *
     * @return
     * list of attachments for the requested real estate object
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments/get-all.html">GETall method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments.html">Attachment Webservice</a>
     */
    public static Attachments getAll( AbstractClient client, long is24RealEstateIdId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/realestate/" + is24RealEstateIdId
        + "/attachment";

      // execute request
      return _getAll( client, url );
    }

    private static Attachments _getAll( AbstractClient client, String url ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successful execution
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
     * Call the GETbyID method of the Attachment Webservice.
     * <p>
     * This method returns a specific attachment for a real estate object.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param externalRealEstateId
     * user defined ID of the real estate object, for which the attachment is
     * retrieved
     *
     * @param is24AttachmentId
     * ID of the requested attachment, that was returned by
     * {@link AttachmentService#post(org.openestate.is24.restapi.AbstractClient, java.lang.String, org.openestate.is24.restapi.xml.common.Attachment, java.io.InputStream, java.lang.String, java.lang.String)}
     *
     * @return
     * requested attachment
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments/get-by-id.html">GETbyID method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments.html">Attachment Webservice</a>
     */
    public static Attachment getById( AbstractClient client, String externalRealEstateId, long is24AttachmentId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/realestate"
        + "/ext-" + AbstractClient.getUrlEncodedValue( externalRealEstateId )
        + "/attachment/" + is24AttachmentId;

      // execute request
      return _getById( client, url );
    }

    /**
     * Call the GETbyID method of the Attachment Webservice.
     * <p>
     * This method returns a specific attachment for a real estate object.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param externalRealEstateId
     * user defined ID of the real estate object, for which the attachment is
     * retrieved
     *
     * @param externalAttachmentId
     * user defined ID of the attachment to retrieve
     *
     * @return
     * requested attachment
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments/get-by-id.html">GETbyID method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments.html">Attachment Webservice</a>
     * @since 0.2
     */
    public static Attachment getById( AbstractClient client, String externalRealEstateId, String externalAttachmentId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/realestate"
        + "/ext-" + AbstractClient.getUrlEncodedValue( externalRealEstateId )
        + "/attachment?externalId=" + AbstractClient.getUrlEncodedValue( externalAttachmentId );

      // execute request
      return _getById( client, url );
    }

    /**
     * Call the GETbyID method of the Attachment Webservice.
     * <p>
     * This method returns a specific attachment for a real estate object.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param is24RealEstateIdId
     * ID of the real estate object, that was returned by
     * {@link RealEstateService#post(org.openestate.is24.restapi.AbstractClient, org.openestate.is24.restapi.xml.realestates.RealEstate)},
     * for which the attachment is retrieved
     *
     * @param is24AttachmentId
     * ID of the requested attachment, that was returned by
     * {@link AttachmentService#post(org.openestate.is24.restapi.AbstractClient, long, org.openestate.is24.restapi.xml.common.Attachment, java.io.InputStream, java.lang.String, java.lang.String)}
     *
     * @return
     * requested attachment
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments/get-by-id.html">GETbyID method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments.html">Attachment Webservice</a>
     */
    public static Attachment getById( AbstractClient client, long is24RealEstateIdId, long is24AttachmentId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/realestate/" + is24RealEstateIdId
        + "/attachment/" + is24AttachmentId;

      // execute request
      return _getById( client, url );
    }

    /**
     * Call the GETbyID method of the Attachment Webservice.
     * <p>
     * This method returns a specific attachment for a real estate object.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param is24RealEstateIdId
     * ID of the real estate object, that was returned by
     * {@link RealEstateService#post(org.openestate.is24.restapi.AbstractClient, org.openestate.is24.restapi.xml.realestates.RealEstate)},
     * for which the attachment is retrieved
     *
     * @param externalAttachmentId
     * user defined ID of the attachment to retrieve
     *
     * @return
     * requested attachment
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments/get-by-id.html">GETbyID method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments.html">Attachment Webservice</a>
     * @since 0.2
     */
    public static Attachment getById( AbstractClient client, long is24RealEstateIdId, String externalAttachmentId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/realestate/" + is24RealEstateIdId
        + "/attachment?externalId=" + AbstractClient.getUrlEncodedValue( externalAttachmentId );

      // execute request
      return _getById( client, url );
    }

    private static Attachment _getById( AbstractClient client, String url ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successful execution
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
     * Call the POST method of the Attachment Webservice.
     * <p>
     * This method stores a new attachment for a specific real estate object.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param externalRealEstateId
     * user defined ID of the real estate object, for which the attachment is
     * stored
     *
     * @param attachment
     * details about the attachment
     *
     * @param input
     * {@link InputStream} with the file content of the attachment
     *
     * @param fileName
     * file name of the attachment
     *
     * @param mimeType
     * MIME type of the attachment
     *
     * @return
     * internal ID of the attachment, that was generated by the Webservice after
     * successful creation
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments/post.html">POST method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments.html">Attachment Webservice</a>
     */
    public static long post( AbstractClient client, String externalRealEstateId, Attachment attachment, InputStream input, String fileName, String mimeType ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/realestate"
        + "/ext-" + AbstractClient.getUrlEncodedValue( externalRealEstateId )
        + "/attachment";

      // execute request
      return _post( client, url, attachment, input, fileName, mimeType );
    }

    /**
     * Call the POST method of the Attachment Webservice.
     * <p>
     * This method stores a new attachment for a specific real estate object.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param is24RealEstateIdId
     * ID of the real estate object, that was returned by
     * {@link RealEstateService#post(org.openestate.is24.restapi.AbstractClient, org.openestate.is24.restapi.xml.realestates.RealEstate)},
     * for which the attachment is stored
     *
     * @param attachment
     * details about the attachment
     *
     * @param input
     * {@link InputStream} with the file content of the attachment
     *
     * @param fileName
     * file name of the attachment
     *
     * @param mimeType
     * MIME type of the attachment
     *
     * @return
     * internal ID of the attachment, that was generated by the Webservice after
     * successful creation
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments/post.html">POST method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments.html">Attachment Webservice</a>
     */
    public static long post( AbstractClient client, long is24RealEstateIdId, Attachment attachment, InputStream input, String fileName, String mimeType ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/realestate/" + is24RealEstateIdId
        + "/attachment";

      // execute request
      return _post( client, url, attachment, input, fileName, mimeType );
    }

    private static long _post( AbstractClient client, String url, Attachment attachment, InputStream input, String fileName, String mimeType ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // write object into xml
      String xml = XmlUtils.marshal( attachment, AbstractClient.getEncoding() );

      final Response response;

      // send multipart request
      if (input!=null)
        response = client.sendXmlAttachmentRequest( new URL( url ), RequestMethod.POST, xml, input, fileName, mimeType );

      // send singlepart request
      else
        response = client.sendXmlRequest( new URL( url ), RequestMethod.POST, xml );

      // parse result from response body after successful execution
      if (response.statusCode==Response.CREATED)
      {
        //LOGGER.debug( "------------------------------------" );
        //LOGGER.debug( "AttachmentService.post" );
        //LOGGER.debug( url );
        //LOGGER.debug( response.body );
        //LOGGER.debug( "------------------------------------" );
        Messages msgs = (Messages) XmlUtils.unmarshal( response.body );
        if (msgs!=null)
        {
          for (Message msg : msgs.getMessage())
          {
            if (!MessageCode.MESSAGE_RESOURCE_CREATED.equals( msg.getMessageCode() ))
              continue;
            String idValue = StringUtils.trimToNull( msg.getId() );
            if (idValue==null)
              continue;
            try
            {
              return Long.parseLong( idValue );
            }
            catch (NumberFormatException ex)
            {
              LOGGER.warn( "Can't determine ID of the created attachment!" );
              LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
              return 0;
            }
          }
        }
        LOGGER.warn( "Can't determine ID of the created attachment!" );
        return 0;
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
     * Call the PUTbyID method of the Attachment Webservice.
     * <p>
     * This method updates the informations about an attachment for a specific
     * real estate object.
     * <p>
     * This method only updates the metadata of an attachment. If the file
     * content itself has changed, a new POST request must be executed.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param externalRealEstateId
     * user defined ID of the real estate object, for which the attachment is
     * updated
     *
     * @param is24AttachmentId
     * ID of the attachment to update, that was returned by
     * {@link AttachmentService#post(org.openestate.is24.restapi.AbstractClient, java.lang.String, org.openestate.is24.restapi.xml.common.Attachment, java.io.InputStream, java.lang.String, java.lang.String)}
     *
     * @param attachment
     * details about the attachment
     *
     * @return
     * response of the Webservice after a successful request
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments/put-by-id.html">PUTbyID method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments.html">Attachment Webservice</a>
     */
    public static Messages putById( AbstractClient client, String externalRealEstateId, long is24AttachmentId, Attachment attachment ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/realestate"
        + "/ext-" + AbstractClient.getUrlEncodedValue( externalRealEstateId )
        + "/attachment/" + is24AttachmentId;

      // execute request
      return _putById( client, url, attachment );
    }

    /**
     * Call the PUTbyID method of the Attachment Webservice.
     * <p>
     * This method updates the informations about an attachment for a specific
     * real estate object.
     * <p>
     * This method only updates the metadata of an attachment. If the file
     * content itself has changed, a new POST request must be executed.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param is24RealEstateIdId
     * ID of the real estate object, that was returned by
     * {@link RealEstateService#post(org.openestate.is24.restapi.AbstractClient, org.openestate.is24.restapi.xml.realestates.RealEstate)},
     * for which the attachment is updated
     *
     * @param is24AttachmentId
     * ID of the attachment to update, that was returned by
     * {@link AttachmentService#post(org.openestate.is24.restapi.AbstractClient, long, org.openestate.is24.restapi.xml.common.Attachment, java.io.InputStream, java.lang.String, java.lang.String)}
     *
     * @param attachment
     * details about the attachment
     *
     * @return
     * response of the Webservice after a successful request
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments/put-by-id.html">PUTbyID method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments.html">Attachment Webservice</a>
     */
    public static Messages putById( AbstractClient client, long is24RealEstateIdId, long is24AttachmentId, Attachment attachment ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/realestate/" + is24RealEstateIdId
        + "/attachment/" + is24AttachmentId;

      // execute request
      return _putById( client, url, attachment );
    }

    private static Messages _putById( AbstractClient client, String url, Attachment attachment ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // write object into xml
      String xml = XmlUtils.marshal( attachment, AbstractClient.getEncoding() );

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.PUT, xml );

      // parse result from response body after successful execution
      if (response.statusCode==Response.OK)
      {
        //LOGGER.debug( "------------------------------------" );
        //LOGGER.debug( "AttachmentService.putById" );
        //LOGGER.debug( url );
        //LOGGER.debug( response.body );
        //LOGGER.debug( "------------------------------------" );
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
   * Low level methods for the AttachmentsOrder Webservice.
   * <p>
   * The AttachmentsOrder Webservice is used in the Import-/Export-API to set
   * a specific ordering for the attachments of a real estate object.
   *
   * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments.html">Attachment Webservice</a>
   * @see <a href="http://api.immobilienscout24.de/our-apis/import-export.html">Import-/Export-API</a>
   * @since 0.1
   * @author Andreas Rudolph
   */
  public final static class AttachmentsOrderService
  {
    /**
     * Call the GET method of the AttachmentsOrder Webservice.
     * <p>
     * This method returns the attachment ordering for a specific real estate
     * object.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param externalRealEstateId
     * user defined ID of the real estate object, for which the attachment
     * ordering is retrieved
     *
     * @return
     * attachment ordering for the requested real estate object
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments/attachmentsorder-get.html">GET method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments.html">Attachment Webservice</a>
     */
    public static org.openestate.is24.restapi.xml.attachmentsorder.List get( AbstractClient client, String externalRealEstateId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/realestate"
        + "/ext-" + AbstractClient.getUrlEncodedValue( externalRealEstateId )
        + "/attachment/attachmentsorder";

      // execute request
      return _get( client, url );
    }

    /**
     * Call the GET method of the AttachmentsOrder Webservice.
     * <p>
     * This method returns the attachment ordering for a specific real estate
     * object.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param is24RealEstateIdId
     * ID of the real estate object, that was returned by
     * {@link RealEstateService#post(org.openestate.is24.restapi.AbstractClient, org.openestate.is24.restapi.xml.realestates.RealEstate)},
     * for which the attachment ordering is retrieved
     *
     * @return
     * attachment ordering for the requested real estate object
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments/attachmentsorder-get.html">GET method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments.html">Attachment Webservice</a>
     */
    public static org.openestate.is24.restapi.xml.attachmentsorder.List get( AbstractClient client, long is24RealEstateIdId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/realestate/" + is24RealEstateIdId
        + "/attachment/attachmentsorder";

      // execute request
      return _get( client, url );
    }

    private static org.openestate.is24.restapi.xml.attachmentsorder.List _get( AbstractClient client, String url ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successful execution
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
     * Call the PUT method of the AttachmentsOrder Webservice.
     * <p>
     * This method changes the attachment ordering for a specific real estate
     * object.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param externalRealEstateId
     * user defined ID of the real estate object, for which the attachment
     * ordering is changed
     *
     * @param list
     * attachment ordering to set
     *
     * @return
     * response of the Webservice after a successful request
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments/attachmentsorder-put.html">PUT method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments.html">Attachment Webservice</a>
     */
    public static Messages put( AbstractClient client, String externalRealEstateId, org.openestate.is24.restapi.xml.attachmentsorder.List list ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      if (list==null) throw new NullPointerException( "No object was provided for publishing!" );

      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/realestate"
        + "/ext-" + AbstractClient.getUrlEncodedValue( externalRealEstateId )
        + "/attachment/attachmentsorder";

      // execute request
      return _put( client, url, list );
    }

    /**
     * Call the PUT method of the AttachmentsOrder Webservice.
     * <p>
     * This method changes the attachment ordering for a specific real estate
     * object.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param is24RealEstateIdId
     * ID of the real estate object, that was returned by
     * {@link RealEstateService#post(org.openestate.is24.restapi.AbstractClient, org.openestate.is24.restapi.xml.realestates.RealEstate)},
     * for which the attachment ordering is changed
     *
     * @param list
     * attachment ordering to set
     *
     * @return
     * response of the Webservice after a successful request
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments/attachmentsorder-put.html">PUT method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments.html">Attachment Webservice</a>
     */
    public static Messages put( AbstractClient client, long is24RealEstateIdId, org.openestate.is24.restapi.xml.attachmentsorder.List list ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      if (list==null) throw new NullPointerException( "No object was provided for publishing!" );

      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/realestate/" + is24RealEstateIdId
        + "/attachment/attachmentsorder";

      // execute request
      return _put( client, url, list );
    }

    private static Messages _put( AbstractClient client, String url, org.openestate.is24.restapi.xml.attachmentsorder.List list ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // write object into xml
      String xml = XmlUtils.marshal( new org.openestate.is24.restapi.xml.attachmentsorder.ObjectFactory().createAttachmentsorder( list ), AbstractClient.getEncoding() );

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.PUT, xml );

      // parse result from response body after successful execution
      if (response.statusCode==Response.OK)
      {
        //LOGGER.debug( "------------------------------------" );
        //LOGGER.debug( "AttachmentsOrderService.put" );
        //LOGGER.debug( url );
        //LOGGER.debug( response.body );
        //LOGGER.debug( "------------------------------------" );
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
   * Low level methods for the Contact Webservice.
   * <p>
   * The Contact Webservice is used in the Import-/Export-API to get / add /
   * edit / remove contact informations of a real estate object.
   *
   * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/contact.html">Contact Webservice</a>
   * @see <a href="http://api.immobilienscout24.de/our-apis/import-export.html">Import-/Export-API</a>
   * @since 0.1
   * @author Andreas Rudolph
   */
  public final static class ContactAddressService
  {
    private ContactAddressService()
    {
    }

    /**
     * Call the DELETEbyID method of the Contact Webservice.
     * <p>
     * This method removes a contact person.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param externalContactId
     * user defined ID of the contact, for which the contact is removed
     *
     * @return
     * response of the Webservice after a successful request
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/contact/delete.html">DELETE method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/contact.html">Contact Webservice</a>
     * @since 0.2
     */
    public static Messages deleteByExternalId( AbstractClient client, String externalContactId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      return deleteByExternalId( client, externalContactId, null );
    }

    /**
     * Call the DELETEbyID method of the Contact Webservice.
     * <p>
     * This method removes a contact person.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param externalContactId
     * user defined ID of the contact, for which the contact is removed
     *
     * @param assignToExternalContactId
     * user defined ID of another contact, where real estates of the removed
     * contact are assigned to
     *
     * @return
     * response of the Webservice after a successful request
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/contact/delete.html">DELETE method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/contact.html">Contact Webservice</a>
     * @since 0.2
     */
    public static Messages deleteByExternalId( AbstractClient client, String externalContactId, String assignToExternalContactId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/contact"
        + "/ext-" + AbstractClient.getUrlEncodedValue( externalContactId );

      // init URL parameters
      List<String> params = new ArrayList<>();

      assignToExternalContactId = StringUtils.trimToNull( assignToExternalContactId );
      if (assignToExternalContactId!=null) params.add( "assigntocontactid=" + AbstractClient.getUrlEncodedValue( assignToExternalContactId ) );

      // append URL parameters
      if (!params.isEmpty()) url += "?" + StringUtils.join( params, "&" );

      // execute request
      return _delete( client, url );
    }

    /**
     * Call the DELETEbyID method of the Contact Webservice.
     * <p>
     * This method removes a contact person.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param is24ContactId
     * ID of the contact object, that was returned by
     * {@link ContactAddressService#post(org.openestate.is24.restapi.AbstractClient, org.openestate.is24.restapi.xml.common.RealtorContactDetails)},
     * for which the contact is removed
     *
     * @return
     * response of the Webservice after a successful request
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/contact/delete.html">DELETE method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/contact.html">Contact Webservice</a>
     * @since 0.2
     */
    public static Messages deleteByIs24Id( AbstractClient client, long is24ContactId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      return deleteByIs24Id( client, is24ContactId, 0 );
    }

    /**
     * Call the DELETEbyID method of the Contact Webservice.
     * <p>
     * This method removes a contact person.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param is24ContactId
     * ID of the contact object, that was returned by
     * {@link ContactAddressService#post(org.openestate.is24.restapi.AbstractClient, org.openestate.is24.restapi.xml.common.RealtorContactDetails)},
     * for which the contact is removed
     *
     * @param assignToIs24ContactId
     * ID of the contact object, that was returned by
     * {@link ContactAddressService#post(org.openestate.is24.restapi.AbstractClient, org.openestate.is24.restapi.xml.common.RealtorContactDetails)},
     * where real estates of the removed contact are assigned to
     *
     * @return
     * response of the Webservice after a successful request
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/contact/delete.html">DELETE method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/contact.html">Contact Webservice</a>
     * @since 0.2
     */
    public static Messages deleteByIs24Id( AbstractClient client, long is24ContactId, long assignToIs24ContactId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/contact/" + is24ContactId;

      // init URL parameters
      List<String> params = new ArrayList<>();

      if (assignToIs24ContactId>0) params.add( "assigntocontactid=" + assignToIs24ContactId );

      // append URL parameters
      if (!params.isEmpty()) url += "?" + StringUtils.join( params, "&" );

      // execute request
      return _delete( client, url );
    }

    private static Messages _delete( AbstractClient client, String url ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.DELETE, null );

      // parse result from response body after successful execution
      if (response.statusCode==Response.OK)
      {
        //LOGGER.debug( "------------------------------------" );
        //LOGGER.debug( "ContactAddressService.delete" );
        //LOGGER.debug( url );
        //LOGGER.debug( response.body );
        //LOGGER.debug( "------------------------------------" );
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
     * Call the GETall method of the Contact Webservice.
     * <p>
     * This method returns the list of contacts for the agency.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @return
     * list of contacts
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/contact/get-all.html">GETall method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/contact.html">Contact Webservice</a>
     */
    public static RealtorContactDetailsList getAll( AbstractClient client ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/contact";

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successful execution
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
     * Call the GETbyID method of the Contact Webservice.
     * <p>
     * This method returns a specific contact for the agency.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param externalContactId
     * user defined ID of the contact, for which the contact is retrieved
     *
     * @return
     * requested contact
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/contact/get-by-id.html">GETbyID method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/contact.html">Contact Webservice</a>
     */
    public static RealtorContactDetails getByExternalId( AbstractClient client, String externalContactId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/contact"
        + "/ext-" + AbstractClient.getUrlEncodedValue( externalContactId );

      // execute request
      return _get( client, url );
    }

    /**
     * Call the GETbyID method of the Contact Webservice.
     * <p>
     * This method returns a specific contact for the agency.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param is24ContactId
     * ID of the contact object, that was returned by
     * {@link ContactAddressService#post(org.openestate.is24.restapi.AbstractClient, org.openestate.is24.restapi.xml.common.RealtorContactDetails)},
     * for which the contact is retrieved
     *
     * @return
     * requested contact
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/contact/get-by-id.html">GETbyID method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/contact.html">Contact Webservice</a>
     */
    public static RealtorContactDetails getByIs24Id( AbstractClient client, long is24ContactId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/contact/" + is24ContactId;

      // execute request
      return _get( client, url );
    }

    private static RealtorContactDetails _get( AbstractClient client, String url ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successful execution
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
     * Call the POST method of the Contact Webservice.
     * <p>
     * This method stores a new contact for the agency.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param contact
     * contact to set
     *
     * @return
     * internal ID of the contact person, that was generated by the Webservice
     * after successful creation
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/contact/post.html">POST method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/contact.html">Contact Webservice</a>
     */
    public static long post( AbstractClient client, RealtorContactDetails contact ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      if (contact==null) throw new NullPointerException( "No contact was provided!" );

      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/contact";

      // write object into xml
      String xml = XmlUtils.marshal( contact, AbstractClient.getEncoding() );

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.POST, xml );

      // parse result from response body after successful execution
      if (response.statusCode==Response.CREATED)
      {
        //LOGGER.debug( "------------------------------------" );
        //LOGGER.debug( "ContactAddressService.post" );
        //LOGGER.debug( url );
        //LOGGER.debug( response.body );
        //LOGGER.debug( "------------------------------------" );
        Messages msgs = (Messages) XmlUtils.unmarshal( response.body );
        if (msgs!=null)
        {
          for (Message msg : msgs.getMessage())
          {
            if (!MessageCode.MESSAGE_RESOURCE_CREATED.equals( msg.getMessageCode() ))
              continue;
            String idValue = StringUtils.trimToNull( msg.getId() );
            if (idValue==null)
              continue;
            try
            {
              return Long.parseLong( idValue );
            }
            catch (NumberFormatException ex)
            {
              LOGGER.warn( "Can't determine ID of the created contact person!" );
              LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
              return 0;
            }
          }
        }
        LOGGER.warn( "Can't determine ID of the created contact person!" );
        return 0;
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
     * Call the PUTbyID method of the Contact Webservice.
     * <p>
     * This method updates a specific contact for the agency.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param contact
     * contact to set
     *
     * @param externalContactId
     * user defined ID of the contact, for which contact is updated
     *
     * @return
     * response of the Webservice after a successful request
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/contact/put-by-id.html">PUTbyID method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/contact.html">Contact Webservice</a>
     */
    public static Messages putByExternalId( AbstractClient client, RealtorContactDetails contact, String externalContactId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/contact"
        + "/ext-" + AbstractClient.getUrlEncodedValue( externalContactId );

      // execute request
      return _put( client, url, contact );
    }

    /**
     * Call the PUTbyID method of the Contact Webservice.
     * <p>
     * This method updates a specific contact for the agency.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param contact
     * contact to set
     *
     * @param is24ContactId
     * ID of the contact object, that was returned by
     * {@link ContactAddressService#post(org.openestate.is24.restapi.AbstractClient, org.openestate.is24.restapi.xml.common.RealtorContactDetails)},
     * for which the contact is updated
     *
     * @return
     * response of the Webservice after a successful request
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/contact/put-by-id.html">PUTbyID method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/contact.html">Contact Webservice</a>
     */
    public static Messages putByIs24Id( AbstractClient client, RealtorContactDetails contact, long is24ContactId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/contact/" + is24ContactId;

      // execute request
      return _put( client, url, contact );
    }

    private static Messages _put( AbstractClient client, String url, RealtorContactDetails contact ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // write object into xml
      String xml = XmlUtils.marshal( contact, AbstractClient.getEncoding() );

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.PUT, xml );

      // parse result from response body after successful execution
      if (response.statusCode==Response.OK)
      {
        //LOGGER.debug( "------------------------------------" );
        //LOGGER.debug( "ContactAddressService.put" );
        //LOGGER.debug( url );
        //LOGGER.debug( response.body );
        //LOGGER.debug( "------------------------------------" );
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
   * Low level methods for the Publish Webservice.
   * <p>
   * The Publish Webservice is used in the Import-/Export-API to publish /
   * unpublish a real estate object.
   *
   * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/publish.html">Publish Webservice</a>
   * @see <a href="http://api.immobilienscout24.de/our-apis/import-export.html">Import-/Export-API</a>
   * @since 0.1
   * @author Andreas Rudolph
   */
  public final static class PublishService
  {
    private PublishService()
    {
    }

    /**
     * Call the DELETEbyID method of the Publish Webservice.
     * <p>
     * This method removes the attribution of a real estate object to a publish
     * channel.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param is24PublishId
     * the unique publishing ID, that was returned by
     * {@link PublishService#post(org.openestate.is24.restapi.AbstractClient, org.openestate.is24.restapi.xml.common.PublishObject)},
     * for which the publishing is removed
     *
     * @return
     * response of the Webservice after a successful request
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/publish/delete-by-id.html">DELETEbyID method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/publish.html">Publish Webservice</a>
     * @since 0.2
     */
    public static Messages delete( AbstractClient client, String is24PublishId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/publish"
        + "/" + AbstractClient.getUrlEncodedValue( is24PublishId );

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.DELETE, null );

      // parse result from response body after successful execution
      if (response.statusCode==Response.OK)
      {
        //LOGGER.debug( "------------------------------------" );
        //LOGGER.debug( "PublishService.delete" );
        //LOGGER.debug( url );
        //LOGGER.debug( response.body );
        //LOGGER.debug( "------------------------------------" );
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
     * Call the DELETEbyList method of the Publish Webservice.
     * <p>
     * This method removes the attribution of a real estate object to a publish
     * channel.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param is24PublishIds
     * list of unique publishing ID's, that were returned by
     * {@link PublishService#post(org.openestate.is24.restapi.AbstractClient, org.openestate.is24.restapi.xml.common.PublishObject)},
     * for which the publishing are removed
     *
     * @return
     * response of the Webservice after a successful request
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/publish/delete-by-list.html">DELETEbyList method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/publish.html">Publish Webservice</a>
     * @since 0.2
     */
    public static PublishObjects delete( AbstractClient client, String[] is24PublishIds ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/publish"
        + "/list";

      // init URL parameters
      List<String> params = new ArrayList<>();

      List<String> ids = new ArrayList<>();
      if (!ArrayUtils.isEmpty( is24PublishIds ))
      {
        for (String id : is24PublishIds)
        {
          id = StringUtils.trimToNull( id );
          if (id!=null) ids.add( AbstractClient.getUrlEncodedValue( id ) );
        }
      }
      if (ids.isEmpty()) return null;
      params.add( "publishids=" + StringUtils.join( ids, "," ) );

      // append URL parameters
      if (!params.isEmpty()) url += "?" + StringUtils.join( params, "&" );

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.DELETE, null );

      // parse result from response body after successful execution
      if (response.statusCode==Response.OK)
      {
        //LOGGER.debug( "------------------------------------" );
        //LOGGER.debug( "PublishService.delete" );
        //LOGGER.debug( url );
        //LOGGER.debug( response.body );
        //LOGGER.debug( "------------------------------------" );
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
     * Call the GET method of the Publish Webservice.
     * <p>
     * This method returns a list of the publish channels, where a real estate
     * object is published.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param is24RealEstateIdId
     * ID of the real estate object, that was returned by
     * {@link RealEstateService#post(org.openestate.is24.restapi.AbstractClient, org.openestate.is24.restapi.xml.realestates.RealEstate)},
     * for which the publishing are retrieved
     *
     * @param is24PublishChannelId
     * the ID of a certain publish channel (optional, default 0)
     *
     * @return
     * list of publish channels, that the requested real estate object is
     * assigned to
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/publish/get.html">GET method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/publish.html">Publish Webservice</a>
     */
    public static PublishObjects get( AbstractClient client, long is24RealEstateIdId, long is24PublishChannelId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/publish";

      // init URL parameters
      List<String> params = new ArrayList<>();

      if (is24RealEstateIdId>0) params.add( "realestate=" + is24RealEstateIdId );
      if (is24PublishChannelId>0) params.add( "publishchannel=" + is24PublishChannelId );

      // append URL parameters
      if (!params.isEmpty()) url += "?" + StringUtils.join( params, "&" );

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successful execution
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
     * Call the GETbyID method of the Publish Webservice.
     * <p>
     * This method returns a specific publish channel, where a real estate
     * object is published.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param is24PublishId
     * the unique publishing ID, that was returned by
     * {@link PublishService#post(org.openestate.is24.restapi.AbstractClient, org.openestate.is24.restapi.xml.common.PublishObject)},
     * for which the publishing is removed
     *
     * @return
     * requested publishing
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/publish/get-by-id.html">GETbyID method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/publish.html">Publish Webservice</a>
     */
    public static PublishObject getById( AbstractClient client, String is24PublishId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/publish"
        + "/" + AbstractClient.getUrlEncodedValue( is24PublishId );

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successful execution
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
     * Call the POSTbyID method of the Publish Webservice.
     * <p>
     * This method publishes a real estate object into a publish channel.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param publishObject
     * publishing to set
     *
     * @return
     * internal ID of the publishing, that was generated by the Webservice after
     * successful creation
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/publish/post-by-id.html">POSTbyID method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/publish.html">Publish Webservice</a>
     */
    public static String post( AbstractClient client, PublishObject publishObject ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      if (publishObject==null) throw new NullPointerException( "No object was provided for publishing!" );

      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/publish";

      // write object into xml
      String xml = XmlUtils.marshal( publishObject, AbstractClient.getEncoding() );

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.POST, xml );

      // parse result from response body after successful execution
      if (response.statusCode==Response.CREATED)
      {
        //LOGGER.debug( "------------------------------------" );
        //LOGGER.debug( "PublishService.post" );
        //LOGGER.debug( url );
        //LOGGER.debug( response.body );
        //LOGGER.debug( "------------------------------------" );
        Messages msgs = (Messages) XmlUtils.unmarshal( response.body );
        if (msgs!=null)
        {
          for (Message msg : msgs.getMessage())
          {
            if (!MessageCode.MESSAGE_RESOURCE_CREATED.equals( msg.getMessageCode() ))
              continue;
            String idValue = StringUtils.trimToNull( msg.getId() );
            if (idValue!=null)
              return idValue;
          }
        }
        LOGGER.warn( "Can't determine ID of the created publishing!" );
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
     * Call the POST method of the Publish Webservice.
     * <p>
     * This method publishes mulitple real estate objects at once.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param publishObjects
     * publishings to set
     *
     * @return
     * internal ID of the publishing, that was generated by the Webservice after
     * successful creation
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/publish/post.html">POST method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/publish.html">Publish Webservice</a>
     * @since 0.2
     */
    public static PublishObjects post( AbstractClient client, PublishObjects publishObjects ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      if (publishObjects==null) throw new NullPointerException( "No objects were provided for publishing!" );

      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/publish/list";

      // write object into xml
      String xml = XmlUtils.marshal( publishObjects, AbstractClient.getEncoding() );

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.POST, xml );

      // parse result from response body after successful execution
      if (response.statusCode==Response.CREATED)
      {
        //LOGGER.debug( "------------------------------------" );
        //LOGGER.debug( "PublishService.post" );
        //LOGGER.debug( url );
        //LOGGER.debug( response.body );
        //LOGGER.debug( "------------------------------------" );
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
  }

  /**
   * Low level methods for the PublishChannel Webservice.
   * <p>
   * The PublishChannel Webservice is used in the Import-/Export-API to get a
   * list of channels on which a real estate object can be published.
   * <p>
   * By default all users with an active product are allowed to publish in
   * the channels "10000" for www.immobilienscout24.de and "10001" for the
   * customers homepage.
   *
   * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/publish.html">PublishChannel Webservice</a>
   * @see <a href="http://api.immobilienscout24.de/our-apis/import-export.html">Import-/Export-API</a>
   * @since 0.1
   * @author Andreas Rudolph
   */
  public final static class PublishChannelService
  {
    private PublishChannelService()
    {
    }

    /**
     * Call the GET method of the PublishChannel Webservice.
     * <p>
     * This method returns a list of the publish channels, that are usable for
     * the agency.
     * <p>
     * By default all users with an active product are allowed to publish in
     * the channels "10000" for www.immobilienscout24.de and "10001" for the
     * customers homepage.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @return
     * list of supported publish channels
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/publish/channel-get.html">GET method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/publish.html">PublishChannel Webservice</a>
     */
    public static PublishChannels get( AbstractClient client ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/publishchannel";

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successful execution
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
   * Low level methods for the RealEstate Webservice.
   * <p>
   * The RealEstate Webservice is used in the Import-/Export-API to get / add /
   * edit / remove real estate objects.
   *
   * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/realestate.html">RealEstate Webservice</a>
   * @see <a href="http://api.immobilienscout24.de/our-apis/import-export.html">Import-/Export-API</a>
   * @since 0.1
   * @author Andreas Rudolph
   */
  public final static class RealEstateService
  {
    private RealEstateService()
    {
    }

    /**
     * Call the DELETEbyID method of the RealEstate Webservice.
     * <p>
     * This method removes a real estate object.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param externalRealEstateId
     * user defined ID of the real estate object to remove
     *
     * @return
     * response of the Webservice after a successful request
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/realestate/delete-by-id.html">DELETEbyID method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/realestate.html">RealEstate Webservice</a>
     */
    public static Messages deleteByExternalId( AbstractClient client, String externalRealEstateId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/realestate"
        + "/ext-" + AbstractClient.getUrlEncodedValue( externalRealEstateId );

      // execute request
      return _delete( client, url );
    }

    /**
     * Call the DELETEbyID method of the RealEstate Webservice.
     * <p>
     * This method removes a real estate object.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param is24RealEstateId
     * ID of the real estate object to remove, that was returned by
     * {@link RealEstateService#post(org.openestate.is24.restapi.AbstractClient, org.openestate.is24.restapi.xml.realestates.RealEstate)}
     *
     * @return
     * response of the Webservice after a successful request
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/realestate/delete-by-id.html">DELETEbyID method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/realestate.html">RealEstate Webservice</a>
     */
    public static Messages deleteByIs24Id( AbstractClient client, long is24RealEstateId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/realestate/" + is24RealEstateId;

      // execute request
      return _delete( client, url );
    }

    private static Messages _delete( AbstractClient client, String url ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.DELETE, null );

      // parse result from response body after successful execution
      if (response.statusCode==Response.OK)
      {
        //LOGGER.debug( "------------------------------------" );
        //LOGGER.debug( "RealEstateService.delete" );
        //LOGGER.debug( url );
        //LOGGER.debug( response.body );
        //LOGGER.debug( "------------------------------------" );
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
     * Call the GETall method of the RealEstate Webservice.
     * <p>
     * This method returns the list of real estate objects for the agency.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param inPublishChannel
     * the name of the publish channel to look for properties
     *
     * @param notInPublishChannel
     * the name of the publish channel not to look for properties
     *
     * @param pageSize
     * the number of properties per page (from min 1 until max 100, default 20)
     *
     * @param pageNumber
     * the page number to return (starts with 1, default 1)
     *
     * @param archivedObjectsIncluded
     * include archived objects into the result
     *
     * @return
     * list of real estate objects
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/realestate/get-all.html">GETall method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/realestate.html">RealEstate Webservice</a>
     */
    public static RealEstates getAll( AbstractClient client, String inPublishChannel, String notInPublishChannel, int pageSize, int pageNumber, boolean archivedObjectsIncluded ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/realestate";

      // init URL parameters
      List<String> params = new ArrayList<>();

      inPublishChannel = AbstractClient.getUrlEncodedValue( inPublishChannel );
      if (inPublishChannel!=null) params.add( "publishchannel=" + inPublishChannel );

      notInPublishChannel = AbstractClient.getUrlEncodedValue( notInPublishChannel );
      if (inPublishChannel!=null) params.add( "notinpublishchannel=" + notInPublishChannel );

      if (pageSize>=1 && pageSize<=100) params.add( "pagesize=" + pageSize );

      if (pageNumber>1) params.add( "pagenumber=" + pageNumber );

      params.add( "archivedobjectsincluded="+String.valueOf( archivedObjectsIncluded ) );

      // append URL parameters
      if (!params.isEmpty()) url += "?" + StringUtils.join( params, "&" );

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successful execution
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
     * Call the GETbyID method of the RealEstate Webservice.
     * <p>
     * This method returns a specific real estate object.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param externalRealEstateId
     * user defined ID of the real estate object to retrieve
     *
     * @return
     * real estate object
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/realestate/get-by-id.html">GETbyID method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/realestate.html">RealEstate Webservice</a>
     */
    public static RealEstate getByExternalId( AbstractClient client, String externalRealEstateId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/realestate"
        + "/ext-" + AbstractClient.getUrlEncodedValue( externalRealEstateId );

      // execute request
      return _get( client, url );
    }

    /**
     * Call the GETbyID method of the RealEstate Webservice.
     * <p>
     * This method returns a specific real estate object.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param is24RealEstateId
     * ID of the real estate object to retrieve, that was returned by
     * {@link RealEstateService#post(org.openestate.is24.restapi.AbstractClient, org.openestate.is24.restapi.xml.realestates.RealEstate)}
     *
     * @return
     * real estate object
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/realestate/get-by-id.html">GETbyID method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/realestate.html">RealEstate Webservice</a>
     */
    public static RealEstate getByIs24Id( AbstractClient client, long is24RealEstateId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/realestate/" + is24RealEstateId;

      // execute request
      return _get( client, url );
    }

    private static RealEstate _get( AbstractClient client, String url ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successful execution
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
     * Call the POST method of the RealEstate Webservice.
     * <p>
     * This method stores a new real estate object.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param realEstate
     * real estate object to store
     *
     * @return
     * internal ID of the real estate, that was generated by the Webservice
     * after successful creation
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/realestate/post.html">POST method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/realestate.html">RealEstate Webservice</a>
     */
    public static long post( AbstractClient client, RealEstate realEstate ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      return post( client, realEstate, true );
    }

    /**
     * Call the POST method of the RealEstate Webservice.
     * <p>
     * This method stores a new real estate object.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param realEstate
     * real estate object to store
     *
     * @param useNewEnergySourceEnev2014Values
     * tells the Webservice to make use of all values for "energySourceEnev2014"
     * as described <a href="http://api.immobilienscout24.de/useful/energy-certificate-2014.html">here</a>
     * (true by default)
     *
     * @return
     * internal ID of the real estate, that was generated by the Webservice
     * after successful creation
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/realestate/post.html">POST method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/realestate.html">RealEstate Webservice</a>
     * @since 0.2
     */
    public static long post( AbstractClient client, RealEstate realEstate, boolean useNewEnergySourceEnev2014Values ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      if (realEstate==null) throw new NullPointerException( "No property was provided!" );

      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/realestate";

      // init URL parameters
      List<String> params = new ArrayList<>();
      if (useNewEnergySourceEnev2014Values) params.add( "usenewenergysourceenev2014values=true" );

      // append URL parameters
      if (!params.isEmpty()) url += "?" + StringUtils.join( params, "&" );

      // write object into xml
      String xml = XmlUtils.marshal( realEstate, AbstractClient.getEncoding() );

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.POST, xml );

      // parse result from response body after successful execution
      if (response.statusCode==Response.CREATED)
      {
        //LOGGER.debug( "------------------------------------" );
        //LOGGER.debug( "RealEstateService.post" );
        //LOGGER.debug( url );
        //LOGGER.debug( response.body );
        //LOGGER.debug( "------------------------------------" );
        Messages msgs = (Messages) XmlUtils.unmarshal( response.body );
        if (msgs!=null)
        {
          for (Message msg : msgs.getMessage())
          {
            if (!MessageCode.MESSAGE_RESOURCE_CREATED.equals( msg.getMessageCode() ))
              continue;
            String idValue = StringUtils.trimToNull( msg.getId() );
            if (idValue==null)
              continue;
            try
            {
              return Long.parseLong( idValue );
            }
            catch (NumberFormatException ex)
            {
              LOGGER.warn( "Can't determine ID of the created contact person!" );
              LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
              return 0;
            }
          }
        }
        LOGGER.warn( "Can't determine ID of the created contact person!" );
        return 0;
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
     * Call the PUTbyID method of the RealEstate Webservice.
     * <p>
     * This method updates a real estate object.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param realEstate
     * real estate object to update
     *
     * @param externalRealEstateId
     * user defined ID of the real estate object to update
     *
     * @return
     * response of the Webservice after a successful request
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/realestate/put-by-id.html">PUTbyID method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/realestate.html">RealEstate Webservice</a>
     */
    public static Messages putByExternalId( AbstractClient client, RealEstate realEstate, String externalRealEstateId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      return putByExternalId( client, realEstate, externalRealEstateId, true );
    }

    /**
     * Call the PUTbyID method of the RealEstate Webservice.
     * <p>
     * This method updates a real estate object.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param realEstate
     * real estate object to update
     *
     * @param externalRealEstateId
     * user defined ID of the real estate object to update
     *
     * @param useNewEnergySourceEnev2014Values
     * tells the Webservice to make use of all values for "energySourceEnev2014"
     * as described <a href="http://api.immobilienscout24.de/useful/energy-certificate-2014.html">here</a>
     * (true by default)
     *
     * @return
     * response of the Webservice after a successful request
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/realestate/put-by-id.html">PUTbyID method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/realestate.html">RealEstate Webservice</a>
     * @since 0.2
     */
    public static Messages putByExternalId( AbstractClient client, RealEstate realEstate, String externalRealEstateId, boolean useNewEnergySourceEnev2014Values ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/realestate"
        + "/ext-" + AbstractClient.getUrlEncodedValue( externalRealEstateId );

      // init URL parameters
      List<String> params = new ArrayList<>();
      if (useNewEnergySourceEnev2014Values) params.add( "usenewenergysourceenev2014values=true" );

      // append URL parameters
      if (!params.isEmpty()) url += "?" + StringUtils.join( params, "&" );

      // execute request
      return _put( client, url, realEstate );
    }

    /**
     * Call the PUTbyID method of the RealEstate Webservice.
     * <p>
     * This method updates a real estate object.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param realEstate
     * real estate object to update
     *
     * @param is24RealEstateId
     * ID of the real estate object to update, that was returned by
     * {@link RealEstateService#post(org.openestate.is24.restapi.AbstractClient, org.openestate.is24.restapi.xml.realestates.RealEstate)}
     *
     * @return
     * response of the Webservice after a successful request
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/realestate/put-by-id.html">PUTbyID method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/realestate.html">RealEstate Webservice</a>
     */
    public static Messages putByIs24Id( AbstractClient client, RealEstate realEstate, long is24RealEstateId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      return putByIs24Id( client, realEstate, is24RealEstateId, true );
    }

    /**
     * Call the PUTbyID method of the RealEstate Webservice.
     * <p>
     * This method updates a real estate object.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param realEstate
     * real estate object to update
     *
     * @param is24RealEstateId
     * ID of the real estate object to update, that was returned by
     * {@link RealEstateService#post(org.openestate.is24.restapi.AbstractClient, org.openestate.is24.restapi.xml.realestates.RealEstate)}
     *
     * @param useNewEnergySourceEnev2014Values
     * tells the Webservice to make use of all values for "energySourceEnev2014"
     * as described <a href="http://api.immobilienscout24.de/useful/energy-certificate-2014.html">here</a>
     * (true by default)
     *
     * @return
     * response of the Webservice after a successful request
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/realestate/put-by-id.html">PUTbyID method</a>
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/realestate.html">RealEstate Webservice</a>
     * @since 0.2
     */
    public static Messages putByIs24Id( AbstractClient client, RealEstate realEstate, long is24RealEstateId, boolean useNewEnergySourceEnev2014Values ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/realestate/" + is24RealEstateId;

      // init URL parameters
      List<String> params = new ArrayList<>();
      if (useNewEnergySourceEnev2014Values) params.add( "usenewenergysourceenev2014values=true" );

      // append URL parameters
      if (!params.isEmpty()) url += "?" + StringUtils.join( params, "&" );

      // execute request
      return _put( client, url, realEstate );
    }

    private static Messages _put( AbstractClient client, String url, RealEstate realEstate ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // write object into xml
      String xml = XmlUtils.marshal( realEstate, AbstractClient.getEncoding() );

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.PUT, xml );

      // parse result from response body after successful execution
      if (response.statusCode==Response.OK)
      {
        //LOGGER.debug( "------------------------------------" );
        //LOGGER.debug( "RealEstateService.put" );
        //LOGGER.debug( url );
        //LOGGER.debug( response.body );
        //LOGGER.debug( "------------------------------------" );
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
   * Low level methods for the RealEstatesCounts Webservice.
   * <p>
   * The RealEstatesCounts Webservice is used in the Import-/Export-API to get
   * the number of currently exported real estates.
   *
   * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/realestate/realestates-counts.html">RealEstatesCounts Webservice</a>
   * @see <a href="http://api.immobilienscout24.de/our-apis/import-export.html">Import-/Export-API</a>
   * @since 0.2
   * @author Andreas Rudolph
   */
  public final static class RealEstatesCountsService
  {
    /**
     * Call the GET method of the RealEstatesCounts Webservice.
     * <p>
     * This method returns the number of currently exported real estates.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @return
     * summary of exported real estates
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/realestate/realestates-counts.html">RealEstatesCounts Webservice</a>
     */
    public static RealEstateCounts get( AbstractClient client ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/realestatecounts";

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successful execution
      if (response.statusCode==Response.OK)
      {
        return (RealEstateCounts) XmlUtils.unmarshal( response.body );
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
   * Low level methods for the VideoUploadTicket Webservice.
   * <p>
   * The VideoUploadTicket Webservice is used in the Import-/Export-API to
   * obtain a ticket to upload a video and to transfer the video itself.
   *
   * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments/post.html">description for video uploads</a>
   * @see <a href="http://api.immobilienscout24.de/our-apis/import-export.html">Import-/Export-API</a>
   * @since 0.1
   * @author Andreas Rudolph
   */
  public final static class VideoUploadService
  {
    private VideoUploadService()
    {
    }

    /**
     * Upload a video.
     * <p>
     * This helper method obtains an upload ticket and sends the video file
     * to the destination, that is specified in the upload ticket.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param videoInput
     * content of the video file to transfer
     *
     * @param videoFileName
     * name of the video file to transfer
     *
     * @param videoFileSize
     * size of the video file to transfer (in bytes)
     *
     * @return
     * ID of the ticket, that was used to upload the video file
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments/post.html">description for video uploads</a>
     */
    public static String doVideoUpload( AbstractClient client, InputStream videoInput, String videoFileName, long videoFileSize ) throws IOException, OAuthException, JAXBException, RequestFailedException
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
        videoInput,
        videoFileName,
        videoFileSize );

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
     * Call the GET method of the VideoUploadTicket Webservice.
     * <p>
     * This method retrieves a ticket from the Webservice, that is required to
     * upload a new video file.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @return
     * created ticket for the video upload
     *
     * @throws IOException
     * if communication with the Webservice failed
     *
     * @throws OAuthException
     * if authorization failed
     *
     * @throws JAXBException
     * if XML reading / writing failed
     *
     * @throws RequestFailedException
     * if the Webservice did not respond with a success message
     *
     * @see <a href="http://api.immobilienscout24.de/our-apis/import-export/attachments/post.html">description for video uploads</a>
     */
    public static VideoUploadTicket get( AbstractClient client ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/offer/v1.0/user/me/videouploadticket";

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successful execution
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