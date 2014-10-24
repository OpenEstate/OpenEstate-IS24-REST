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

package org.openestate.is24.restapi.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import oauth.signpost.exception.OAuthException;
import org.openestate.is24.restapi.AbstractClient;
import org.openestate.is24.restapi.DefaultClient;
import org.openestate.is24.restapi.utils.Authorization;
import org.openestate.is24.restapi.utils.Verification;

/**
 *
 * @author Andreas Rudolph <andy@openindex.de>
 */
public class VerificationExample
{
  final static String WEBSERVICE_URL = AbstractClient.LIVE_API;
  final static String CONSUMER_KEY = "my consumer key";
  final static String CONSUMER_SECRET = "my consumer secret";
  final static String CALLBACK_URL = "http://mywebsite.com/is24-callback.php";

  public static void main( String[] args )
  {
    AbstractClient client = new DefaultClient(
      WEBSERVICE_URL, CONSUMER_KEY, CONSUMER_SECRET );

    // request a verification from the webservice
    Verification v = null;
    try
    {
      v = client.fetchVerification( CALLBACK_URL );
    }
    catch (OAuthException ex)
    {
      throw new RuntimeException( "Can't fetch verification!", ex );
    }
    System.out.println( "Visit the following URL to verify access to an agency account at IS24:" );
    System.out.println( v.verificationUrl );

    // read verification code from command line
    String verificationCode = null;
    System.out.println("Please enter your verification code: ");
    try
    {
      BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
      verificationCode = bufferRead.readLine();
    }
    catch(IOException ex)
    {
      throw new RuntimeException( "Can't read verification code!", ex );
    }

    // fetch access tokens and authorize at the webservice
    Authorization a = null;
    try
    {
      a = client.authorizeAfterVerification( v, verificationCode );
    }
    catch (OAuthException ex)
    {
      throw new RuntimeException( "Can't fetch authorization!", ex );
    }
    System.out.println( "The access token was created." );
    System.out.println( "token  : " + a.accessToken );
    System.out.println( "secret : " + a.accessTokenSecret );

    // from now on the webservice is accessible for the client
  }
}