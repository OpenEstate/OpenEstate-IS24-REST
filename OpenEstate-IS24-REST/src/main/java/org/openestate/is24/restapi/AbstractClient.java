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

import org.openestate.is24.restapi.utils.Verification;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.OAuthProvider;
import oauth.signpost.basic.DefaultOAuthConsumer;
import oauth.signpost.basic.DefaultOAuthProvider;
import oauth.signpost.exception.OAuthException;
import oauth.signpost.exception.OAuthNotAuthorizedException;
import org.apache.commons.lang.StringUtils;
import org.openestate.is24.restapi.utils.Authorization;
import org.openestate.is24.restapi.utils.RequestMethod;
import org.openestate.is24.restapi.utils.Response;
import org.openestate.is24.restapi.xml.XmlUtils;

/**
 *
 * @author Andreas Rudolph <andy@openindex.de>
 */
public abstract class AbstractClient
{
  public final static String GET_METHOD = "GET";
  public final static String POST_METHOD = "POST";
  public final static String PUT_METHOD = "PUT";
  public final static String DELETE_METHOD = "DELETE";

  public final static String LIVE_API = "https://rest.immobilienscout24.de/restapi";
  public final static String SANDBOX_API = "https://rest.sandbox-immobilienscout24.de/restapi";

  private final String apiBaseUrl;
  private final String apiAccessKey;
  private final String apiAccessSecret;
  private OAuthConsumer oAuthConsumer = null;
  private OAuthProvider oAuthProvider = null;

  protected AbstractClient( String apiBaseUrl, String apiAccessKey, String apiAccessSecret )
  {
    apiBaseUrl = StringUtils.trimToEmpty( apiBaseUrl );
    if (apiBaseUrl.endsWith( "/" )) apiBaseUrl = apiBaseUrl.substring( 0, apiBaseUrl.length()-1 );
    this.apiBaseUrl = apiBaseUrl;
    this.apiAccessKey = StringUtils.trimToEmpty( apiAccessKey );
    this.apiAccessSecret = StringUtils.trimToEmpty( apiAccessSecret );
  }

  public final void authorize( Authorization authorization ) throws OAuthException
  {
    authorize( authorization.accessToken, authorization.accessTokenSecret );
  }

  public final void authorize( String accessToken, String accessTokenSecret ) throws OAuthException
  {
    this.oAuthConsumer = buildOAuthConsumer( this.apiAccessKey, this.apiAccessSecret );
    this.oAuthConsumer.setTokenWithSecret( accessToken, accessTokenSecret );

    this.oAuthProvider = buildOAuthProvider( apiBaseUrl );
    this.oAuthProvider.setOAuth10a( true );
  }

  public final Authorization authorizeAfterVerification( Verification verification, String verificationCode ) throws OAuthException
  {
    return authorizeAfterVerification( verification.requestToken, verification.requestTokenSecret, verificationCode );
  }

  public final Authorization authorizeAfterVerification( String requestToken, String requestTokenSecret, String verificationCode ) throws OAuthException
  {
    this.oAuthConsumer = buildOAuthConsumer( this.apiAccessKey, this.apiAccessSecret );
    this.oAuthConsumer.setTokenWithSecret( requestToken, requestTokenSecret );

    this.oAuthProvider = buildOAuthProvider( apiBaseUrl );
    this.oAuthProvider.setOAuth10a( true );

    //System.out.println( "Fetching access token..." );
    this.oAuthProvider.retrieveAccessToken( this.oAuthConsumer, verificationCode );

    //String accessToken = this.oAuthConsumer.getToken();
    //String accessTokenSecret = this.oAuthConsumer.getTokenSecret();
    //System.out.println( "Access token: " + accessToken );
    //System.out.println( "Token secret: " + accessTokenSecret );
    return new Authorization( this.oAuthConsumer.getToken(), this.oAuthConsumer.getTokenSecret() );
  }

  protected OAuthConsumer buildOAuthConsumer( String apiAccessKey, String apiAccessSecret )
  {
    return new DefaultOAuthConsumer( apiAccessKey, apiAccessSecret );
  }

  protected OAuthProvider buildOAuthProvider( String apiBaseUrl )
  {
    return new DefaultOAuthProvider(
      apiBaseUrl + "/security/oauth/request_token",
      apiBaseUrl + "/security/oauth/access_token",
      apiBaseUrl + "/security/oauth/confirm_access" );
  }

  /**
   * Fetch URL for access verification.
   *
   * @return
   * @throws OAuthException
   */
  public final Verification fetchVerification() throws OAuthException
  {
    return fetchVerification( null );
  }

  /**
   * Fetch URL for access verification.
   *
   * @param callbackUrl
   * @return
   * @throws OAuthException
   */
  public final Verification fetchVerification( String callbackUrl ) throws OAuthException
  {
    OAuthConsumer consumer = buildOAuthConsumer( this.apiAccessKey, this.apiAccessSecret );
    OAuthProvider provider = buildOAuthProvider( this.apiBaseUrl );
    String verificationUrl = provider.retrieveRequestToken( consumer, StringUtils.trimToEmpty( callbackUrl ) );
    return new Verification( verificationUrl, consumer.getToken(), consumer.getTokenSecret() );
  }

  public final String getApiBaseUrl()
  {
    return apiBaseUrl;
  }

  public final OAuthConsumer getAuthConsumer() throws OAuthNotAuthorizedException
  {
    if (oAuthConsumer==null) throw new OAuthNotAuthorizedException();
    return oAuthConsumer;
  }

  public final OAuthProvider getAuthProvider() throws OAuthNotAuthorizedException
  {
    if (oAuthProvider==null) throw new OAuthNotAuthorizedException();
    return oAuthProvider;
  }

  public final String getEncodedParameterValue( String value )
  {
    try
    {
      value = StringUtils.trimToNull( value );
      return (value!=null)? URLEncoder.encode( value, getEncoding() ): null;
    }
    catch (UnsupportedEncodingException ex)
    {
      System.out.println( "Unsupported encoding!" );
      ex.printStackTrace( System.out );
      return null;
    }
  }

  public final String getEncoding()
  {
    return XmlUtils.DEFAULT_ENCODING;
  }

  /**
   * Sends XML string to a webservice.
   *
   * @param url
   *        the URL of the webserice
   * @param method
   *        the HTTP method of the outgoing request
   * @param xml
   *        the XML string, that is sent to the webservice
   * @return
   *        the response, that was received from the webservice
   * @throws IOException
   * @throws OAuthException
   */
  protected abstract Response sendXmlRequest( URL url, RequestMethod method, String xml ) throws IOException, OAuthException;

  /**
   * Sends XML string together with a file to a webservice.
   *
   * @param url
   *        the URL of the webserice
   * @param method
   *        the HTTP method of the outgoing request
   * @param xml
   *        the XML string, that is sent to the webservice
   * @param input
   *        the file content, that is sent to the webservice
   * @param fileName
   *        the name of the file, that is sent to the webservice
   * @param mimeType
   *        the MIME-type of the file, that is sent to the webservice
   * @return
   *        the response, that was received from the webservice
   * @throws IOException
   * @throws OAuthException
   */
  protected abstract Response sendXmlAttachmentRequest( URL url, RequestMethod method, String xml, InputStream input, String fileName, String mimeType ) throws IOException, OAuthException;

  /**
   * Sends video with an authentication value to a webservice.
   *
   * @param url
   *        the URL of the webserice
   * @param method
   *        the HTTP method of the outgoing request
   * @param auth
   *        the authentication value, that is sent to the webservice
   * @param input
   *        the file content, that is sent to the webservice
   * @param fileName
   *        the name of the file, that is sent to the webservice
   * @param fileSize
   *        the size of the file, that is sent to the webservice (in bytes)
   * @return
   *        the response, that was received from the webservice
   * @throws IOException
   * @throws OAuthException
   */
  protected abstract Response sendVideoUploadRequest( URL url, RequestMethod method, String auth, InputStream input, String fileName, long fileSize ) throws IOException, OAuthException;
}