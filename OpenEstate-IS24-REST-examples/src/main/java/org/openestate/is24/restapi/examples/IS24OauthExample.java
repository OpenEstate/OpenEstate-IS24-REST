/*
 * Copyright 2014-2015 OpenEstate.org.
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
package org.openestate.is24.restapi.examples;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.OAuthProvider;
import oauth.signpost.basic.DefaultOAuthConsumer;
import oauth.signpost.basic.DefaultOAuthProvider;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An oAuth example from the Java-Signpost Tutorial by ImmobilienScout24.
 * <p>
 * Some small adjustments were made to the tutorial in order to integrate better
 * into this library.
 *
 * @see <a href="http://api.immobilienscout24.de/useful/tutorials-sdks-plugins/tutorial-java-signpost.html">Java-Signpost Tutorial</a>
 * @since 0.1
 * @author ImmobilienScout24
 * @author Andreas Rudolph <andy@openindex.de>
 */
@SuppressFBWarnings(
  value = {"NP_DEREFERENCE_OF_READLINE_VALUE", "DM_DEFAULT_ENCODING"},
  justification = "Keep example code untouched." )
public class IS24OauthExample
{
  private final static Logger LOGGER = LoggerFactory.getLogger( IS24OauthExample.class );

  /**
   * Main function.
   *
   * @param args
   * command line arguments
   */
  public static void main( String[] args ) throws Exception
  {

    OAuthConsumer consumer =
      new DefaultOAuthConsumer( "testzugang-import-api-maklermanagerKey", "VXyCmVpjR4GQVCVBf33T" );

    OAuthProvider provider =
      new DefaultOAuthProvider( "http://sandbox.immobilienscout24.de/restapi/security/oauth/request_token",
      "http://sandbox.immobilienscout24.de/restapi/security/oauth/access_token",
      "http://sandbox.immobilienscout24.de/restapi/security/oauth/confirm_access" );


    LOGGER.info( "Fetching request token..." );

    String authUrl =
      provider.retrieveRequestToken( consumer, "http://www.google.de" );

    String requestToken = consumer.getToken();
    String requestTokenSecret = consumer.getTokenSecret();

    LOGGER.info( "Request token: "+requestToken );
    LOGGER.info( "Token secret: "+requestTokenSecret );

    LOGGER.info( "Now visit:\n"+authUrl
      +"\n... and grant this app authorization" );
    LOGGER.info( "Enter the verification code and hit ENTER when you're done:" );

    BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
    String verificationCode = br.readLine();

    LOGGER.info( "Fetching access token..." );

    provider.retrieveAccessToken( consumer, verificationCode.trim() );

    String accessToken = consumer.getToken();
    String accessTokenSecret = consumer.getTokenSecret();
    LOGGER.info( "Access token: "+accessToken );
    LOGGER.info( "Token secret: "+accessTokenSecret );

    //LOGGER.debug( "first call" );

    requestObjectApi( consumer );

    //LOGGER.debug( "second call" );

    requestObjectApi( consumer );

    //LOGGER.debug( "third call" );

    OAuthConsumer consumer2 =
      new DefaultOAuthConsumer( "testzugang-import-api-maklermanagerKey", "VXyCmVpjR4GQVCVBf33T" );

    consumer2.setTokenWithSecret( accessToken, accessTokenSecret );

    requestObjectApi( consumer2 );
  }

  private static void requestObjectApi( OAuthConsumer consumer ) throws MalformedURLException, IOException, OAuthMessageSignerException,
    OAuthExpectationFailedException, OAuthCommunicationException, UnsupportedEncodingException
  {

    LOGGER.info( "#################################################################################################" );

    URL url =
      new URL( "http://sandbox.immobilienscout24.de/restapi/api/search/v1.0/searcher/abc" );

    HttpURLConnection apiRequest = (HttpURLConnection) url.openConnection();

    consumer.sign( apiRequest );
    LOGGER.info( "Sending request..." );

    apiRequest.connect();
    LOGGER.info( "Expiration "+apiRequest.getExpiration() );
    LOGGER.info( "Timeout "+apiRequest.getConnectTimeout() );
    LOGGER.info( "URL "+apiRequest.getURL() );
    LOGGER.info( "Method "+apiRequest.getRequestMethod() );

    LOGGER.info( "Response: "+apiRequest.getResponseCode()+" "
      +apiRequest.getResponseMessage() );

    LOGGER.info( "#################################################################################################" );
  }
}