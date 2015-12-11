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

import java.io.IOException;
import javax.xml.bind.JAXBException;
import oauth.signpost.exception.OAuthException;
import org.openestate.is24.restapi.AbstractClient;
import org.openestate.is24.restapi.DefaultClient;
import org.openestate.is24.restapi.GIS;
import org.openestate.is24.restapi.utils.RequestFailedException;
import org.openestate.is24.restapi.utils.XmlUtils;
import org.openestate.is24.restapi.xml.common.City;
import org.openestate.is24.restapi.xml.common.Continent;
import org.openestate.is24.restapi.xml.common.Country;
import org.openestate.is24.restapi.xml.common.Quarter;
import org.openestate.is24.restapi.xml.common.Region;
import org.openestate.is24.restapi.xml.gis.Cities;
import org.openestate.is24.restapi.xml.gis.Continents;
import org.openestate.is24.restapi.xml.gis.Countries;
import org.openestate.is24.restapi.xml.gis.Quarters;
import org.openestate.is24.restapi.xml.gis.Regions;

/**
 * This example illustrates access to the Geo Information Service API.
 *
 * @author Andreas Rudolph <andy@openindex.de>
 */
public class GISExample
{
  private final static String WEBSERVICE_URL = AbstractClient.LIVE_API;
  private final static String CONSUMER_KEY = "my consumer key";
  private final static String CONSUMER_SECRET = "my consumer secret";
  private final static String ACCESS_KEY = "user's access key";
  private final static String ACCESS_SECRET = "user's access secret";
  private final static int EUROPE = GIS.EUROPE;
  private final static int GERMANY = 276;

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

    try
    {
      // grab continents
      System.out.println( "------------------" );
      System.out.println( "Get continents" );
      Continents continents = GIS.ContinentService.getAll( client );
      if (continents==null)
      {
        System.out.println( "Can't find continents!" );
        return;
      }
      String xml = XmlUtils.marshal( continents, "UTF-8", true );
      System.out.println( xml );

      // grab Europe
      final long continentId = EUROPE;
      System.out.println( "------------------" );
      System.out.println( "Get continent #" + continentId );
      Continent continent = GIS.ContinentService.get( client, continentId );
      if (continent==null)
      {
        System.out.println( "Can't find continent!" );
        return;
      }
      xml = XmlUtils.marshal( continent, "UTF-8", true );
      System.out.println( xml );

      // grab countries for Europe
      System.out.println( "------------------" );
      System.out.println( "Get countries for continent #" + continentId );
      Countries countries = GIS.CountryService.getAll( client, continentId );
      if (countries==null)
      {
        System.out.println( "Can't find countries!" );
        return;
      }
      xml = XmlUtils.marshal( countries, "UTF-8", true );
      System.out.println( xml );

      // grab Germany
      final long countryId = GERMANY;
      System.out.println( "------------------" );
      System.out.println( "Get country #" + countryId );
      Country country = GIS.CountryService.get( client, continentId, countryId );
      if (country==null)
      {
        System.out.println( "Can't find country!" );
        return;
      }
      xml = XmlUtils.marshal( country, "UTF-8", true );
      System.out.println( xml );

      // grab regions for Germany
      System.out.println( "------------------" );
      System.out.println( "Get regions for country #" + countryId );
      Regions regions = GIS.RegionService.getAll( client, continentId, countryId );
      if (regions==null)
      {
        System.out.println( "Can't find regions!" );
        return;
      }
      xml = XmlUtils.marshal( regions, "UTF-8", true );
      System.out.println( xml );

      // grab first region
      final long regionId = regions.getRegion().get( 0 ).getId();
      System.out.println( "------------------" );
      System.out.println( "Get region #" + regionId );
      Region region = GIS.RegionService.get( client, continentId, countryId, regionId );
      if (region==null)
      {
        System.out.println( "Can't find region!" );
        return;
      }
      xml = XmlUtils.marshal( region, "UTF-8", true );
      System.out.println( xml );

      // grab cities for first region
      System.out.println( "------------------" );
      System.out.println( "Get cities for region #" + regionId );
      Cities cities = GIS.CityService.getAll( client, continentId, countryId, regionId );
      if (cities==null)
      {
        System.out.println( "Can't find cities!" );
        return;
      }
      xml = XmlUtils.marshal( cities, "UTF-8", true );
      System.out.println( xml );

      // grab first city
      final long cityId = cities.getCity().get( 0 ).getId();
      System.out.println( "------------------" );
      System.out.println( "Get city #" + cityId );
      City city = GIS.CityService.get( client, continentId, countryId, regionId, cityId );
      if (city==null)
      {
        System.out.println( "Can't find city!" );
        return;
      }
      xml = XmlUtils.marshal( city, "UTF-8", true );
      System.out.println( xml );

      // grab quarters for first city
      System.out.println( "------------------" );
      System.out.println( "Get quarters for city #" + cityId );
      Quarters quarters = GIS.QuarterService.getAll( client, continentId, countryId, regionId, cityId );
      if (quarters==null)
      {
        System.out.println( "Can't find quarters!" );
        return;
      }
      xml = XmlUtils.marshal( quarters, "UTF-8", true );
      System.out.println( xml );

      // grab first quarter
      final long quarterId = quarters.getQuarter().get( 0 ).getId();
      System.out.println( "------------------" );
      System.out.println( "Get quarter #" + quarterId );
      Quarter quarter = GIS.QuarterService.get( client, continentId, countryId, regionId, cityId, quarterId );
      if (quarter==null)
      {
        System.out.println( "Can't find quarter!" );
        return;
      }
      xml = XmlUtils.marshal( quarter, "UTF-8", true );
      System.out.println( xml );
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