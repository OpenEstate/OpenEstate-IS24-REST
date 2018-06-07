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
package org.openestate.is24.restapi;

import java.io.IOException;
import java.net.URL;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import oauth.signpost.exception.OAuthException;
import org.apache.commons.lang3.StringUtils;
import org.openestate.is24.restapi.utils.RequestFailedException;
import org.openestate.is24.restapi.utils.RequestMethod;
import org.openestate.is24.restapi.utils.Response;
import org.openestate.is24.restapi.utils.XmlUtils;
import org.openestate.is24.restapi.xml.common.Attachment;
import org.openestate.is24.restapi.xml.common.Attachments;
import org.openestate.is24.restapi.xml.common.Imprint;
import org.openestate.is24.restapi.xml.common.RealtorLogo;
import org.openestate.is24.restapi.xml.expose.ContactForm;
import org.openestate.is24.restapi.xml.expose.Expose;
import org.openestate.is24.restapi.xml.expose.SendAFriendForm;
import org.openestate.is24.restapi.xml.expose.VideoUrlList;
import org.openestate.is24.restapi.xml.expose.WebContent;

/**
 * Low level methods for the Expose-API.
 * <p>
 * These methods are calling the different Webservices of the Expose-API.
 *
 * @see <a href="http://api.immobilienscout24.de/our-apis/expose.html">Expose-API</a>
 * @since 0.4
 * @author Andreas Rudolph <andy@openindex.de>
 */
public final class ExposeApi
{
  //private final static Logger LOGGER = LoggerFactory.getLogger( ExposeApi.class );
  public final static int PUBLISH_CHANNEL_IS24_ID = 10000;
  public final static String PUBLISH_CHANNEL_IS24_TITLE = "Immobilienscout24";
  public final static int PUBLISH_CHANNEL_HOMEPAGE_ID = 10001;
  public final static String PUBLISH_CHANNEL_HOMEPAGE_TITLE = "Homepage";

  private ExposeApi()
  {
  }

  /**
   * Call the Attachment/Get method of the Exposé-API.
   * <p>
   * This method returns a specific attachment of a real estate object.
   *
   * @param client
   * {@link AbstractClient}, that is used to communicate with the Webservice
   *
   * @param is24ExposeId
   * ID of the real estate object to retrieve
   *
   * @param is24AttachmentId
   * ID of the attachment to retrieve
   *
   * @return
   * attachment
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
   * @see <a href="http://api.immobilienscout24.de/our-apis/expose/attachment.html">Attachment methods of the Exposé-API</a>
   * @see <a href="http://api.immobilienscout24.de/our-apis/expose.html">Exposé-API</a>
   */
  public static Attachment getAttachment( AbstractClient client, long is24ExposeId, long is24AttachmentId ) throws IOException, OAuthException, JAXBException, RequestFailedException
  {
    // build request URL
    String url = client.getApiBaseUrl()
      + "/api/search/v1.0/expose/" + is24ExposeId
      + "/attachment/" + is24AttachmentId;

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
   * Call the  Attachment/GetList method of the Exposé-API.
   * <p>
   * This method returns the list of attachments for a real estate object.
   *
   * @param client
   * {@link AbstractClient}, that is used to communicate with the Webservice
   *
   * @param is24ExposeId
   * ID of the real estate object to retrieve
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
   * @see <a href="http://api.immobilienscout24.de/our-apis/expose/attachment.html">Attachment methods of the Exposé-API</a>
   * @see <a href="http://api.immobilienscout24.de/our-apis/expose.html">Exposé-API</a>
   */
  public static Attachments getAttachments( AbstractClient client, long is24ExposeId ) throws IOException, OAuthException, JAXBException, RequestFailedException
  {
    // build request URL
    String url = client.getApiBaseUrl()
      + "/api/search/v1.0/expose/" + is24ExposeId
      + "/attachment";

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
   * Call the GET method of the Exposé Webservice.
   * <p>
   * This method returns a specific real estate object.
   *
   * @param client
   * {@link AbstractClient}, that is used to communicate with the Webservice
   *
   * @param is24ExposeId
   * ID of the real estate object to retrieve
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
   * @see <a href="http://api.immobilienscout24.de/our-apis/expose.html">Exposé-API</a>
   */
  public static Expose getExpose( AbstractClient client, long is24ExposeId ) throws IOException, OAuthException, JAXBException, RequestFailedException
  {
    // build request URL
    String url = client.getApiBaseUrl()
      + "/api/search/v1.0/expose/" + is24ExposeId;

    // send request
    Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

    // parse result from response body after successful execution
    if (response.statusCode==Response.OK)
    {
      return ((JAXBElement<Expose>)
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
   * Call the Imprint/GET method of the Exposé-API.
   * <p>
   * This method returns an imprint of a real estate object.
   *
   * @param client
   * {@link AbstractClient}, that is used to communicate with the Webservice
   *
   * @param is24ExposeId
   * ID of the real estate object to retrieve
   *
   * @return
   * imprint
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
   * @see <a href="http://api.immobilienscout24.de/our-apis/expose/imprint.html">Imprint methods of the Exposé-API</a>
   * @see <a href="http://api.immobilienscout24.de/our-apis/expose.html">Exposé-API</a>
   */
  public static Imprint getImprint( AbstractClient client, long is24ExposeId ) throws IOException, OAuthException, JAXBException, RequestFailedException
  {
    // build request URL
    String url = client.getApiBaseUrl()
      + "/api/search/v1.0/expose/" + is24ExposeId
      + "/imprint";

    // send request
    Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

    // parse result from response body after successful execution
    if (response.statusCode==Response.OK)
    {
      return ((JAXBElement<Imprint>)
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
   * Call the Logo/GET method of the Exposé-API.
   * <p>
   * This method returns a realtor logo.
   *
   * @param client
   * {@link AbstractClient}, that is used to communicate with the Webservice
   *
   * @param username
   * The username which the user uses for logging in to immobilienscout24.de.
   *
   * @return
   * logo
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
   * @see <a href="http://api.immobilienscout24.de/our-apis/expose/logo.html">Logo methods of the Exposé-API</a>
   * @see <a href="http://api.immobilienscout24.de/our-apis/expose.html">Exposé-API</a>
   */
  public static RealtorLogo getLogo( AbstractClient client, String username ) throws IOException, OAuthException, JAXBException, RequestFailedException
  {
    // build request URL
    String url = client.getApiBaseUrl()
      + "/api/offer/v1.0/realtor/" + AbstractClient.getUrlEncodedValue( username )
      + "/logo";

    // send request
    Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

    // parse result from response body after successful execution
    if (response.statusCode==Response.OK)
    {
      return ((JAXBElement<RealtorLogo>)
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
   * Call the ExposeVideo/GET method of the Exposé-API.
   * <p>
   * This method returns video data of a real estate object.
   *
   * @param client
   * {@link AbstractClient}, that is used to communicate with the Webservice
   *
   * @param is24ExposeId
   * ID of the real estate object to retrieve
   *
   * @param is24VideoId
   * ID of the video to retrieve
   *
   * @return
   * video data
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
   * @see <a href="http://api.immobilienscout24.de/our-apis/expose/exposevideo.html">Video methods of the Exposé-API</a>
   * @see <a href="http://api.immobilienscout24.de/our-apis/expose.html">Exposé-API</a>
   */
  public static VideoUrlList getVideo( AbstractClient client, long is24ExposeId, long is24VideoId ) throws IOException, OAuthException, JAXBException, RequestFailedException
  {
    // build request URL
    String url = client.getApiBaseUrl()
      + "/api/search/v1.0/expose/" + is24ExposeId
      + "/video/" + is24VideoId;

    // send request
    Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

    // parse result from response body after successful execution
    if (response.statusCode==Response.OK)
    {
      return ((JAXBElement<VideoUrlList>)
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
   * Call the WebContent/GET method of the Exposé-API.
   * <p>
   * This method returns web content data of a real estate object.
   *
   * @param client
   * {@link AbstractClient}, that is used to communicate with the Webservice
   *
   * @param is24ExposeId
   * ID of the real estate object to retrieve
   *
   * @return
   * web content
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
   * @see <a href="http://api.immobilienscout24.de/our-apis/expose/web-content.html">WebContent methods of the Exposé-API</a>
   * @see <a href="http://api.immobilienscout24.de/our-apis/expose.html">Exposé-API</a>
   */
  public static WebContent getWebContent( AbstractClient client, long is24ExposeId ) throws IOException, OAuthException, JAXBException, RequestFailedException
  {
    // build request URL
    String url = client.getApiBaseUrl()
      + "/api/search/v1.0/expose/" + is24ExposeId
      + "/webcontent";

    // send request
    Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

    // parse result from response body after successful execution
    if (response.statusCode==Response.OK)
    {
      return ((JAXBElement<WebContent>)
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
   * Call the Contact/POST method of the Exposé-API.
   * <p>
   * This method sends a contact request to the realtor of a real estate.
   *
   * @param client
   * {@link AbstractClient}, that is used to communicate with the Webservice
   *
   * @param is24ExposeId
   * ID of the real estate object to retrieve
   *
   * @param contactForm
   * contact request
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
   * @see <a href="http://api.immobilienscout24.de/our-apis/expose/contact.html">Contact methods of the Exposé-API</a>
   * @see <a href="http://api.immobilienscout24.de/our-apis/expose.html">Exposé-API</a>
   */
  public static void postContact( AbstractClient client, long is24ExposeId, ContactForm contactForm ) throws IOException, OAuthException, JAXBException, RequestFailedException
  {
    if (contactForm==null) throw new NullPointerException( "No contact form was provided!" );

    // build request URL
    String url = client.getApiBaseUrl()
      + "/api/search/v1.0/expose/" + is24ExposeId
      + "/contact";

    // write object into xml
    String xml = XmlUtils.marshal( contactForm, AbstractClient.getEncoding() );

    // send request
    Response response = client.sendXmlRequest( new URL( url ), RequestMethod.POST, xml );

    // throw an error for any other status code then 200
    if (response.statusCode!=Response.OK)
    {
      String msg = StringUtils.trimToNull( response.statusMessage );
      if (msg==null) msg = "Request failed!";
      msg += " (" + response.statusCode + ")";
      throw new RequestFailedException( response, msg );
    }
  }

  /**
   * Call the SendAFriend/POST method of the Exposé-API.
   * <p>
   * This method sends an e-mail request to an interested person of an real
   * estate.
   *
   * @param client
   * {@link AbstractClient}, that is used to communicate with the Webservice
   *
   * @param is24ExposeId
   * ID of the real estate object to retrieve
   *
   * @param sendAFriendForm
   * send a friend request
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
   * @see <a href="http://api.immobilienscout24.de/our-apis/expose/sendafriend.html">SendAFriend methods of the Exposé-API</a>
   * @see <a href="http://api.immobilienscout24.de/our-apis/expose.html">Exposé-API</a>
   */
  public static void postSendAFriend( AbstractClient client, long is24ExposeId, SendAFriendForm sendAFriendForm ) throws IOException, OAuthException, JAXBException, RequestFailedException
  {
    if (sendAFriendForm==null) throw new NullPointerException( "No send a friend form was provided!" );

    // build request URL
    String url = client.getApiBaseUrl()
      + "/api/search/v1.0/expose/" + is24ExposeId
      + "/sendafriend";

    // write object into xml
    String xml = XmlUtils.marshal( sendAFriendForm, AbstractClient.getEncoding() );

    // send request
    Response response = client.sendXmlRequest( new URL( url ), RequestMethod.POST, xml );

    // throw an error for any other status code then 200
    if (response.statusCode!=Response.OK)
    {
      String msg = StringUtils.trimToNull( response.statusMessage );
      if (msg==null) msg = "Request failed!";
      msg += " (" + response.statusCode + ")";
      throw new RequestFailedException( response, msg );
    }
  }
}