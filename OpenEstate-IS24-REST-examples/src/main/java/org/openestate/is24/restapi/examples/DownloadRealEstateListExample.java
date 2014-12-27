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
import org.openestate.is24.restapi.ImportExport.RealEstateService;
import org.openestate.is24.restapi.utils.RequestFailedException;
import org.openestate.is24.restapi.utils.XmlUtils;
import org.openestate.is24.restapi.xml.offerlistelement.OfferRealEstateForList;
import org.openestate.is24.restapi.xml.realestates.RealEstates;

/**
 * This example illustrates the export of all real estates, that are available
 * through the Webservice.
 *
 * @author Andreas Rudolph <andy@openindex.de>
 */
public class DownloadRealEstateListExample
{
  final static String WEBSERVICE_URL = AbstractClient.LIVE_API;
  final static String CONSUMER_KEY = "my consumer key";
  final static String CONSUMER_SECRET = "my consumer secret";
  final static String ACCESS_KEY = "user's access key";
  final static String ACCESS_SECRET = "user's access secret";

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

    // get list of real estates for a certain agent
    int page = 0;
    RealEstates result = null;
    do
    {
      page++;
      try
      {
        result = RealEstateService.getAll( client, null, null, 10, page, true );
        for (OfferRealEstateForList object : result.getRealEstateList().getRealEstateElement())
        {
          String xml = XmlUtils.marshal( object, "UTF-8", true );
          System.out.println( "object #" + object.getId() + "" );
          System.out.println( "title '" + object.getTitle() +  "'" );
          System.out.println( xml );
          System.out.println( "------------------" );
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
    while (result.getPaging().getNumberOfPages()>page);
  }
}