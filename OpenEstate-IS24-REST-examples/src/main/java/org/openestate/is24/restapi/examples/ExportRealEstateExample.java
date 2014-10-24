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

import java.io.IOException;
import javax.xml.bind.JAXBException;
import oauth.signpost.exception.OAuthException;
import org.openestate.is24.restapi.AbstractClient;
import org.openestate.is24.restapi.DefaultClient;
import org.openestate.is24.restapi.ImportExport;
import org.openestate.is24.restapi.utils.RequestFailedException;
import org.openestate.is24.restapi.xml.XmlUtils;
import org.openestate.is24.restapi.xml.realestates.RealEstate;

/**
 *
 * @author Andreas Rudolph <andy@openindex.de>
 */
public class ExportRealEstateExample
{
  final static String WEBSERVICE_URL = AbstractClient.LIVE_API;
  final static String CONSUMER_KEY = "my consumer key";
  final static String CONSUMER_SECRET = "my consumer secret";
  final static String ACCESS_KEY = "user's access key";
  final static String ACCESS_SECRET = "user's access secret";
  final static long is24ObjectId = 123;
  final static String externalObjectId = "123";

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
      RealEstate object = ImportExport.RealEstateService.getByIs24Id( client, is24ObjectId );
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
      throw new RuntimeException( "Can't get object list!", ex );
    }

    // get a single real estate object, by the external ID of the user / software
    try
    {
      System.out.println( "------------------" );
      System.out.println( "Get object with external ID " + externalObjectId );
      RealEstate object = ImportExport.RealEstateService.getByExternalId( client, externalObjectId );
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