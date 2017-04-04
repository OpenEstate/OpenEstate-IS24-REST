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
package org.openestate.is24.restapi.examples;

import java.io.IOException;
import javax.xml.bind.JAXBException;
import oauth.signpost.exception.OAuthException;
import org.openestate.is24.restapi.AbstractClient;
import org.openestate.is24.restapi.DefaultClient;
import org.openestate.is24.restapi.ImportExport.RealEstateService;
import org.openestate.is24.restapi.utils.RequestFailedException;
import org.openestate.is24.restapi.utils.XmlUtils;
import org.openestate.is24.restapi.xml.realestates.RealEstate;

/**
 * This example illustrates the export of a single real estate from the
 * Webservice.
 *
 * @author Andreas Rudolph <andy@openindex.de>
 */
public class DownloadRealEstateExample
{
  private final static String WEBSERVICE_URL = AbstractClient.LIVE_API;
  private final static String CONSUMER_KEY = "my consumer key";
  private final static String CONSUMER_SECRET = "my consumer secret";
  private final static String ACCESS_KEY = "user's access key";
  private final static String ACCESS_SECRET = "user's access secret";
  private final static long is24ObjectId = 123;
  private final static String externalObjectId = "123";

  /**
   * Main function.
   *
   * @param args
   * command line arguments
   */
  public static void main( String[] args )
  {
    AbstractClient client = new DefaultClient(
      WEBSERVICE_URL, CONSUMER_KEY, CONSUMER_SECRET );

    // authorize at the webservice with the access token
    try
    {
      client.authorize( ACCESS_KEY, ACCESS_SECRET );
    }
    catch (OAuthException ex)
    {
      throw new RuntimeException( "Authorization failed!", ex );
    }

    // get a single real estate object, by the internal ID of IS24
    try
    {
      System.out.println( "------------------" );
      System.out.println( "Get object with IS24-ID " + is24ObjectId );
      RealEstate object = RealEstateService.getByIs24Id( client, is24ObjectId );
      if (object==null)
      {
        System.out.println( "Can't find object for IS24-ID " + is24ObjectId + "!" );
      }
      else
      {
        String xml = XmlUtils.marshal( object, "UTF-8", true );
        System.out.println( "title '" + object.getTitle() +  "'" );
        System.out.println( xml );
      }
    }
    catch (RequestFailedException ex)
    {
      throw new RuntimeException( "Request failed with "
        + "'" + ex.statusMessage+"' (" + ex.statusCode + ")!", ex );
    }
    catch (OAuthException ex)
    {
      throw new RuntimeException( "Authorization failed!", ex );
    }
    catch (JAXBException ex)
    {
      throw new RuntimeException( "XML processing failed!", ex );
    }
    catch (IOException ex)
    {
      throw new RuntimeException( "Communication failed!", ex );
    }

    // get a single real estate object, by the external ID of the user / software
    try
    {
      System.out.println( "------------------" );
      System.out.println( "Get object with external ID " + externalObjectId );
      RealEstate object = RealEstateService.getByExternalId( client, externalObjectId );
      if (object==null)
      {
        System.out.println( "Can't find object for external ID " + externalObjectId + "!" );
      }
      else
      {
        String xml = XmlUtils.marshal( object, "UTF-8", true );
        System.out.println( "title '" + object.getTitle() +  "'" );
        System.out.println( xml );
      }
    }
    catch (RequestFailedException ex)
    {
      throw new RuntimeException( "Request failed with "
        + "'" + ex.statusMessage+"' (" + ex.statusCode + ")!", ex );
    }
    catch (OAuthException ex)
    {
      throw new RuntimeException( "Authorization failed!", ex );
    }
    catch (JAXBException ex)
    {
      throw new RuntimeException( "XML processing failed!", ex );
    }
    catch (IOException ex)
    {
      throw new RuntimeException( "Communication failed!", ex );
    }
  }
}