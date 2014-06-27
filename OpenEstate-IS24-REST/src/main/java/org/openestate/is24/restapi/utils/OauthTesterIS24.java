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

package org.openestate.is24.restapi.utils;

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

/**
 * The oAuth example from <a href="http://developerwiki.immobilienscout24.de/wiki/Java-Signpost_Tutorial#Complete_Example_Code">Java-Signpost Tutorial</a>.
 * @author ImmobilienScout24
 */
@SuppressFBWarnings(
  value = {"NP_DEREFERENCE_OF_READLINE_VALUE", "DM_DEFAULT_ENCODING"},
  justification = "Keep example code untouched." )
public class OauthTesterIS24
{
  public static void main( String[] args ) throws Exception
  {

    OAuthConsumer consumer =
      new DefaultOAuthConsumer( "testzugang-import-api-maklermanagerKey", "VXyCmVpjR4GQVCVBf33T" );

    OAuthProvider provider =
      new DefaultOAuthProvider( "http://sandbox.immobilienscout24.de/restapi/security/oauth/request_token",
      "http://sandbox.immobilienscout24.de/restapi/security/oauth/access_token",
      "http://sandbox.immobilienscout24.de/restapi/security/oauth/confirm_access" );


    System.out.println( "Fetching request token..." );

    String authUrl =
      provider.retrieveRequestToken( consumer, "http://www.google.de" );

    String requestToken = consumer.getToken();
    String requestTokenSecret = consumer.getTokenSecret();

    System.out.println( "Request token: "+requestToken );
    System.out.println( "Token secret: "+requestTokenSecret );

    System.out.println( "Now visit:\n"+authUrl
      +"\n... and grant this app authorization" );
    System.out.println( "Enter the verification code and hit ENTER when you're done:" );

    BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
    String verificationCode = br.readLine();

    System.out.println( "Fetching access token..." );

    provider.retrieveAccessToken( consumer, verificationCode.trim() );

    String accessToken = consumer.getToken();
    String accessTokenSecret = consumer.getTokenSecret();
    System.out.println( "Access token: "+accessToken );
    System.out.println( "Token secret: "+accessTokenSecret );

    System.out.println( "first call" );

    requestObjectApi( consumer );

    System.out.println( "second call" );

    requestObjectApi( consumer );

    System.out.println( "third call" );

    OAuthConsumer consumer2 =
      new DefaultOAuthConsumer( "testzugang-import-api-maklermanagerKey", "VXyCmVpjR4GQVCVBf33T" );

    consumer2.setTokenWithSecret( accessToken, accessTokenSecret );

    requestObjectApi( consumer2 );
  }

  private static void requestObjectApi( OAuthConsumer consumer ) throws MalformedURLException, IOException, OAuthMessageSignerException,
    OAuthExpectationFailedException, OAuthCommunicationException, UnsupportedEncodingException
  {

    System.out.println( "#################################################################################################" );

    URL url =
      new URL( "http://sandbox.immobilienscout24.de/restapi/api/search/v1.0/searcher/abc" );

    HttpURLConnection apiRequest = (HttpURLConnection) url.openConnection();

    consumer.sign( apiRequest );
    System.out.println( "Sending request..." );

    apiRequest.connect();
    System.out.println( "Expiration "+apiRequest.getExpiration() );
    System.out.println( "Timeout "+apiRequest.getConnectTimeout() );
    System.out.println( "URL "+apiRequest.getURL() );
    System.out.println( "Method "+apiRequest.getRequestMethod() );

    System.out.println( "Response: "+apiRequest.getResponseCode()+" "
      +apiRequest.getResponseMessage() );

    System.out.println( "#################################################################################################" );
  }
}