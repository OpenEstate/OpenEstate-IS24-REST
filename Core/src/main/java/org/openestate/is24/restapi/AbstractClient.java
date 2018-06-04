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

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URL;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.OAuthProvider;
import oauth.signpost.basic.DefaultOAuthConsumer;
import oauth.signpost.basic.DefaultOAuthProvider;
import oauth.signpost.exception.OAuthException;
import oauth.signpost.exception.OAuthNotAuthorizedException;
import org.apache.commons.codec.net.URLCodec;
import org.apache.commons.lang3.StringUtils;
import org.openestate.is24.restapi.utils.Authorization;
import org.openestate.is24.restapi.utils.RequestMethod;
import org.openestate.is24.restapi.utils.Response;
import org.openestate.is24.restapi.utils.Verification;
import org.openestate.is24.restapi.utils.XmlUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A basic client for communication with the IS24-Webservice.
 * <p>
 * This is an abstract class, that implements the basic functions for
 * communication with the IS24-Webservice.
 *
 * @since 0.1
 * @author Andreas Rudolph
 */
public abstract class AbstractClient implements Closeable
{
  private final static Logger LOGGER = LoggerFactory.getLogger( AbstractClient.class );

  /**
   * URL, that points to the webservice in live environment.
   */
  public final static String LIVE_API = "https://rest.immobilienscout24.de/restapi";

  /**
   * URL, that points to the webservice in sandbox environment.
   */
  public final static String SANDBOX_API = "https://rest.sandbox-immobilienscout24.de/restapi";

  /**
   * Name of the custom response header by IS24,
   * that contains the Consumer Key of the client.
   *
   * @since 0.2.2
   */
  public final static String RESPONSE_HEADER_API_CLIENT = "L-IS24-ApiClient";

  /**
   * Name of the custom response header by IS24,
   * that contains the IS24 agent ID.
   *
   * @since 0.2.2
   */
  public final static String RESPONSE_HEADER_CAUSER_ID = "L-IS24-CauserId";

  /**
   * Name of the custom response header by IS24,
   * that contains a unique ID of the request, that refers to this response.
   *
   * @since 0.2.2
   */
  public final static String RESPONSE_HEADER_REQUEST_REFNUM = "L-IS24-RequestRefnum";

  /**
   * Name of the custom response header by IS24,
   * that contains the ID of the requested resource.
   *
   * @since 0.2.2
   */
  public final static String RESPONSE_HEADER_RESOURCE_ID = "L-IS24-ResourceId";

  /**
   * Content type for XML requests.
   *
   * @since 0.3.3
   */
  public final static String XML_CONTENT_TYPE = "application/xml";

  /**
   * Content type for JSON requests.
   *
   * @since 0.3.3
   */
  public final static String JSON_CONTENT_TYPE = "application/json";

  private final String apiBaseUrl;
  private final String consumerToken;
  private final String consumerSecret;
  private OAuthConsumer oAuthConsumer = null;
  private OAuthProvider oAuthProvider = null;

  /**
   * Create an instance of {@link AbstractClient}.
   *
   * @param apiBaseUrl
   * base URL of the IS24-Webservice (see {@link AbstractClient#LIVE_API} and
   * {@link AbstractClient#SANDBOX_API})
   *
   * @param consumerToken
   * consumer token, that identifies the application at the IS24-Webservice
   *
   * @param consumerSecret
   * consumer secret, that identifies the application at the IS24-Webservice
   */
  protected AbstractClient( String apiBaseUrl, String consumerToken, String consumerSecret )
  {
    apiBaseUrl = StringUtils.trimToEmpty( apiBaseUrl );
    if (apiBaseUrl.endsWith( "/" )) apiBaseUrl = apiBaseUrl.substring( 0, apiBaseUrl.length()-1 );
    this.apiBaseUrl = apiBaseUrl;
    this.consumerToken = StringUtils.trimToEmpty( consumerToken );
    this.consumerSecret = StringUtils.trimToEmpty( consumerSecret );
  }

  /**
   * Initializes client with access credentials.
   *
   * @param authorization
   * {@link Authorization} object, that contains the credentials for permanent
   * access to the IS24-Webservice
   *
   * @throws OAuthException
   * if intitalization of the authorization failed
   */
  public final void authorize( Authorization authorization ) throws OAuthException
  {
    authorize( authorization.accessToken, authorization.accessTokenSecret );
  }

  /**
   * Initializes client with access credentials.
   *
   * @param accessToken
   * token for permanent access to the IS24-Webservice
   *
   * @param accessSecret
   * secret for permanent access to the IS24-Webservice
   *
   * @throws OAuthException
   * if intitalization of the authorization failed
   */
  public final void authorize( String accessToken, String accessSecret ) throws OAuthException
  {
    this.oAuthConsumer = buildOAuthConsumer( this.consumerToken, this.consumerSecret );
    this.oAuthConsumer.setTokenWithSecret( accessToken, accessSecret );

    this.oAuthProvider = buildOAuthProvider( apiBaseUrl );
    this.oAuthProvider.setOAuth10a( true );
  }

  /**
   * Initializes client after a succesful verification.
   *
   * @param verification
   * {@link Verification} object, that contains the credentials for temporary
   * access to the IS24-Webservice during verification
   *
   * @param verificationCode
   * verification code, that was received after the verification was finished
   *
   * @return
   * {@link Authorization} object, that contains the access credentials for
   * future use
   *
   * @throws OAuthException
   * if intitalization of the authorization failed
   */
  public final Authorization authorizeAfterVerification( Verification verification, String verificationCode ) throws OAuthException
  {
    return authorizeAfterVerification( verification.requestToken, verification.requestTokenSecret, verificationCode );
  }

  /**
   * Initializes client after a succesful verification.
   *
   * @param verificationToken
   * token for temporary access to the IS24-Webservice during verification
   *
   * @param verificationSecret
   * secret for temporary access to the IS24-Webservice during verification
   *
   * @param verificationCode
   * verification code, that was received after the verification was finished
   *
   * @return
   * {@link Authorization} object, that contains the access credentials for
   * future use
   *
   * @throws OAuthException
   * if intitalization of the authorization failed
   */
  public final Authorization authorizeAfterVerification( String verificationToken, String verificationSecret, String verificationCode ) throws OAuthException
  {
    this.oAuthConsumer = buildOAuthConsumer( this.consumerToken, this.consumerSecret );
    this.oAuthConsumer.setTokenWithSecret( verificationToken, verificationSecret );

    this.oAuthProvider = buildOAuthProvider( apiBaseUrl );
    this.oAuthProvider.setOAuth10a( true );

    //LOGGER.debug( "Fetching access token..." );
    this.oAuthProvider.retrieveAccessToken( this.oAuthConsumer, verificationCode );

    //String accessToken = this.oAuthConsumer.getToken();
    //String accessTokenSecret = this.oAuthConsumer.getTokenSecret();
    //LOGGER.debug( "Access token: " + accessToken );
    //LOGGER.debug( "Token secret: " + accessTokenSecret );
    return new Authorization( this.oAuthConsumer.getToken(), this.oAuthConsumer.getTokenSecret() );
  }

  /**
   * Create an {@link OAuthConsumer} object for access credentials.
   * <p>
   * Different implementations of {@link AbstractClient} may create different
   * {@link OAuthConsumer} objects.
   *
   * @param token
   * access or verification token
   *
   * @param secret
   * access or verification secret
   *
   * @return
   * an instance of {@link OAuthConsumer} for the provided credentials
   */
  protected OAuthConsumer buildOAuthConsumer( String token, String secret )
  {
    return new DefaultOAuthConsumer( token, secret );
  }

  /**
   * Create an {@link OAuthProvider} for the IS24-Webservice.
   * <p>
   * Different implementations of {@link AbstractClient} may create different
   * {@link OAuthProvider} objects.
   *
   * @param apiBaseUrl
   * URL of the IS24-Webservice
   *
   * @return
   * an instance of {@link OAuthProvider} for the provided URL
   */
  protected OAuthProvider buildOAuthProvider( String apiBaseUrl )
  {
    return new DefaultOAuthProvider(
      apiBaseUrl + "/security/oauth/request_token",
      apiBaseUrl + "/security/oauth/access_token",
      apiBaseUrl + "/security/oauth/confirm_access" );
  }

  @Override
  public void close() throws IOException
  {
  }

  /**
   * Initiate a verification process.
   *
   * @return
   * an instance of {@link Verification} that contains informations about the
   * initiated verification process
   *
   * @throws OAuthException
   * if initiation failed
   */
  public final Verification fetchVerification() throws OAuthException
  {
    return fetchVerification( null );
  }

  /**
   * Initiate a verification process.
   *
   * @param callbackUrl
   * the URL, where the user is redirected to, after the verification was
   * finished / cancelled
   *
   * @return
   * an instance of {@link Verification} that contains informations about the
   * initiated verification process
   *
   * @throws OAuthException
   * if initiation failed
   */
  public final Verification fetchVerification( String callbackUrl ) throws OAuthException
  {
    OAuthConsumer consumer = buildOAuthConsumer( this.consumerToken, this.consumerSecret );
    OAuthProvider provider = buildOAuthProvider( this.apiBaseUrl );
    String verificationUrl = provider.retrieveRequestToken( consumer, StringUtils.trimToEmpty( callbackUrl ) );
    return new Verification( verificationUrl, consumer.getToken(), consumer.getTokenSecret() );
  }

  /**
   * Return URL of the configured IS24-Webservice.
   *
   * @return
   * URL of the configured IS24-Webservice
   */
  public final String getApiBaseUrl()
  {
    return apiBaseUrl;
  }

  /**
   * Return {@link OAuthConsumer} of the client for the current authorization.
   *
   * @return
   * {@link OAuthConsumer} instance of the client
   *
   * @throws OAuthNotAuthorizedException
   * if the client is not authorized
   */
  public final OAuthConsumer getAuthConsumer() throws OAuthNotAuthorizedException
  {
    if (oAuthConsumer==null) throw new OAuthNotAuthorizedException();
    return oAuthConsumer;
  }

  /**
   * Return {@link OAuthProvider} of the client for the current authorization.
   *
   * @return
   * {@link OAuthProvider} instance of the client
   *
   * @throws OAuthNotAuthorizedException
   * if the client is not authorized
   */
  public final OAuthProvider getAuthProvider() throws OAuthNotAuthorizedException
  {
    if (oAuthProvider==null) throw new OAuthNotAuthorizedException();
    return oAuthProvider;
  }

  /**
   * Return encoding for transferred data.
   * <p>
   * This function always returns {@link XmlUtils#DEFAULT_ENCODING}.
   *
   * @return
   * encoding for transferred data
   */
  public static String getEncoding()
  {
    return XmlUtils.DEFAULT_ENCODING;
  }

  /**
   * Encode a string value for use in an URL according to
   * <a href="http://www.ietf.org/rfc/rfc3986.txt">RFC 3986</a>.
   *
   * @param value
   * the value to encode
   *
   * @return
   * the encoded value
   */
  public static String getUrlEncodedValue( String value )
  {
    try
    {
      return StringUtils.replace(
        new URLCodec().encode( StringUtils.trimToNull( value ), getEncoding() ),
        "+", "%20" );
    }
    catch (UnsupportedEncodingException ex)
    {
      LOGGER.error( "Unsupported encoding!", ex );
      return null;
    }
  }

  /**
   * Send a JSON string to the IS24-Webservice.
   * <p>
   * This function must be implemendet by specific implementations of
   * {@link AbstractClient}.
   *
   * @param url
   * URL of the IS24-Webservice, where the request is sent to
   *
   * @param method
   * HTTP method of the outgoing request
   *
   * @param json
   * JSON string, that is sent to the IS24-Webservice
   *
   * @return
   * response, that was received from the IS24-Webservice
   *
   * @throws IOException
   * if communication with IS24-Webservice failed
   *
   * @throws OAuthException
   * if authorization failed
   *
   * @since 0.3.3
   */
  protected abstract Response sendJsonRequest( URL url, RequestMethod method, String json ) throws IOException, OAuthException;

  /**
   * Send a XML string to the IS24-Webservice.
   * <p>
   * This function must be implemendet by specific implementations of
   * {@link AbstractClient}.
   *
   * @param url
   * URL of the IS24-Webservice, where the request is sent to
   *
   * @param method
   * HTTP method of the outgoing request
   *
   * @param xml
   * XML string, that is sent to the IS24-Webservice
   *
   * @return
   * response, that was received from the IS24-Webservice
   *
   * @throws IOException
   * if communication with IS24-Webservice failed
   *
   * @throws OAuthException
   * if authorization failed
   */
  protected abstract Response sendXmlRequest( URL url, RequestMethod method, String xml ) throws IOException, OAuthException;

  /**
   * Send a XML string together with a file to the IS24-Webservice.
   * <p>
   * This function must be implemendet by specific implementations of
   * {@link AbstractClient}.
   *
   * @param url
   * URL of the IS24-Webservice, where the request is sent to
   *
   * @param method
   * the HTTP method of the outgoing request
   *
   * @param xml
   * the XML string, that is sent to the IS24-Webservice
   *
   * @param input
   * the file content, that is sent to the IS24-Webservice
   *
   * @param fileName
   * the name of the file, that is sent to the IS24-Webservice
   *
   * @param mimeType
   * the MIME-type of the file, that is sent to the IS24-Webservice
   *
   * @return
   * the response, that was received from the IS24-Webservice
   *
   * @throws IOException
   * if communication with IS24-Webservice failed
   *
   * @throws OAuthException
   * if authorization failed
   */
  protected abstract Response sendXmlAttachmentRequest( URL url, RequestMethod method, String xml, InputStream input, String fileName, String mimeType ) throws IOException, OAuthException;

  /**
   * Send a video with an authentication value to the IS24-Webservice.
   * <p>
   * This function must be implemendet by specific implementations of
   * {@link AbstractClient}.
   *
   * @param url
   * URL of the IS24-Webservice, where the request is sent to
   *
   * @param method
   * HTTP method of the outgoing request
   *
   * @param auth
   * authentication value, that is sent to the IS24-Webservice
   *
   * @param input
   * file content, that is sent to the IS24-Webservice
   *
   * @param fileName
   * name of the file, that is sent to the IS24-Webservice
   *
   * @param fileSize
   * size of the file, that is sent to the IS24-Webservice (in bytes)
   *
   * @return
   * response, that was received from the IS24-Webservice
   *
   * @throws IOException
   * if communication with IS24-Webservice failed
   *
   * @throws OAuthException
   * if authorization failed
   */
  protected abstract Response sendVideoUploadRequest( URI url, RequestMethod method, String auth, InputStream input, String fileName, long fileSize ) throws IOException, OAuthException;
}