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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Low level methods for the Geo Information Service API.
 * <p>
 * These methods are calling the webservice of the Geo Information Service API.
 *
 * @see <a href="http://api.immobilienscout24.de/our-apis/gis.html">Geo Information Service API</a>
 * @since 0.3
 * @author Andreas Rudolph <andy@openindex.de>
 */
public class GIS
{
  private final static Logger LOGGER = LoggerFactory.getLogger( GIS.class );

  /**
   * IS24 continent ID for Europe.
   */
  public final static int EUROPE = 1;

  /**
   * IS24 continent ID for Asia.
   */
  public final static int ASIA = 2;

  /**
   * IS24 continent ID for Africa.
   */
  public final static int AFRICA = 3;

  /**
   * IS24 continent ID for America.
   */
  public final static int AMERICA = 4;

  /**
   * IS24 continent ID for Australia.
   */
  public final static int AUSTRALIA = 5;

  /**
   * IS24 continent ID for Antarctica.
   */
  public final static int ANTARCTICA = 6;

  private GIS()
  {
  }

  /**
   * Low level methods for the City Webservice.
   * <p>
   * The City Webservice is used in the Geo Information Service API to get
   * informations about available cities.
   *
   * @see <a href="http://api.immobilienscout24.de/our-apis/gis.html">Geo Information Service API</a>
   * @since 0.3
   * @author Andreas Rudolph <andy@openindex.de>
   */
  public final static class CityService
  {
    private CityService()
    {
    }

    /**
     * Call the GET method of the City Webservice.
     * <p>
     * This method returns a specific city.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param is24ContinentId
     * ID of the continent to lookup, that was returned by
     * {@link ContinentService}
     *
     * @param is24CountryId
     * ID of the country to lookup, that was returned by
     * {@link CountryService}
     *
     * @param is24RegionId
     * ID of the region to lookup, that was returned by
     * {@link RegionService}
     *
     * @param is24CityId
     * ID of the city to lookup, that was returned by
     * {@link RegionService#getAll(org.openestate.is24.restapi.AbstractClient, long, long)}
     *
     * @return
     * requested city
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
     * @see <a href="http://api.immobilienscout24.de/our-apis/gis.html">Geo Information Service API</a>
     */
    public static City get( AbstractClient client, long is24ContinentId, long is24CountryId, long is24RegionId, long is24CityId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/gis/v1.0"
        + "/continent/" + is24ContinentId
        + "/country/" + is24CountryId
        + "/region/" + is24RegionId
        + "/city/" + is24CityId;

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successful execution
      if (response.statusCode==Response.OK)
      {
        return ((JAXBElement<City>)
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
     * Call the GETall method of the City Webservice.
     * <p>
     * This method returns the list of available cities for a region.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param is24ContinentId
     * ID of the continent to lookup, that was returned by
     * {@link ContinentService}
     *
     * @param is24CountryId
     * ID of the country to lookup, that was returned by
     * {@link CountryService}
     *
     * @param is24RegionId
     * ID of the region to lookup, that was returned by
     * {@link RegionService}
     *
     * @return
     * list of cities
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
     * @see <a href="http://api.immobilienscout24.de/our-apis/gis.html">Geo Information Service API</a>
     */
    public static Cities getAll( AbstractClient client, long is24ContinentId, long is24CountryId, long is24RegionId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/gis/v1.0"
        + "/continent/" + is24ContinentId
        + "/country/" + is24CountryId
        + "/region/" + is24RegionId
        + "/city";

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successful execution
      if (response.statusCode==Response.OK)
      {
        return (Cities) XmlUtils.unmarshal( response.body );
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
  }

  /**
   * Low level methods for the Continent Webservice.
   * <p>
   * The Continent Webservice is used in the Geo Information Service API to get
   * informations about available continents.
   *
   * @see <a href="http://api.immobilienscout24.de/our-apis/gis.html">Geo Information Service API</a>
   * @since 0.3
   * @author Andreas Rudolph <andy@openindex.de>
   */
  public final static class ContinentService
  {
    private ContinentService()
    {
    }

    /**
     * Call the GET method of the Continent Webservice.
     * <p>
     * This method returns a specific continent.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param is24ContinentId
     * ID of the continent to lookup, that was returned by
     * {@link ContinentService#getAll(org.openestate.is24.restapi.AbstractClient)}
     *
     * @return
     * requested continent
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
     * @see <a href="http://api.immobilienscout24.de/our-apis/gis.html">Geo Information Service API</a>
     */
    public static Continent get( AbstractClient client, long is24ContinentId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/gis/v1.0"
        + "/continent/" + is24ContinentId;

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successful execution
      if (response.statusCode==Response.OK)
      {
        return ((JAXBElement<Continent>)
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
     * Call the GETall method of the Continent Webservice.
     * <p>
     * This method returns the list of available continents.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @return
     * list of continents
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
     * @see <a href="http://api.immobilienscout24.de/our-apis/gis.html">Geo Information Service API</a>
     */
    public static Continents getAll( AbstractClient client ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/gis/v1.0"
        + "/continent";

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successful execution
      if (response.statusCode==Response.OK)
      {
        return (Continents) XmlUtils.unmarshal( response.body );
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
  }

  /**
   * Low level methods for the Country Webservice.
   * <p>
   * The Country Webservice is used in the Geo Information Service API to get
   * informations about available countries.
   *
   * @see <a href="http://api.immobilienscout24.de/our-apis/gis.html">Geo Information Service API</a>
   * @since 0.3
   * @author Andreas Rudolph <andy@openindex.de>
   */
  public final static class CountryService
  {
    private CountryService()
    {
    }

    /**
     * Call the GET method of the Country Webservice.
     * <p>
     * This method returns a specific country.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param is24ContinentId
     * ID of the continent to lookup, that was returned by
     * {@link ContinentService}
     *
     * @param is24CountryId
     * ID of the country to lookup, that was returned by
     * {@link CountryService#getAll(org.openestate.is24.restapi.AbstractClient, long)}
     *
     * @return
     * requested country
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
     * @see <a href="http://api.immobilienscout24.de/our-apis/gis.html">Geo Information Service API</a>
     */
    public static Country get( AbstractClient client, long is24ContinentId, long is24CountryId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/gis/v1.0"
        + "/continent/" + is24ContinentId
        + "/country/" + is24CountryId;

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successful execution
      if (response.statusCode==Response.OK)
      {
        return ((JAXBElement<Country>)
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
     * Call the GETall method of the Country Webservice.
     * <p>
     * This method returns the list of available countries for a continent.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param is24ContinentId
     * ID of the continent to lookup, that was returned by
     * {@link ContinentService}
     *
     * @return
     * list of countries
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
     * @see <a href="http://api.immobilienscout24.de/our-apis/gis.html">Geo Information Service API</a>
     */
    public static Countries getAll( AbstractClient client, long is24ContinentId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/gis/v1.0"
        + "/continent/" + is24ContinentId
        + "/country";

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successful execution
      if (response.statusCode==Response.OK)
      {
        return (Countries) XmlUtils.unmarshal( response.body );
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
  }

  /**
   * Low level methods for the Quarter Webservice.
   * <p>
   * The Quarter Webservice is used in the Geo Information Service API to get
   * informations about available city quarters.
   *
   * @see <a href="http://api.immobilienscout24.de/our-apis/gis.html">Geo Information Service API</a>
   * @since 0.3
   * @author Andreas Rudolph <andy@openindex.de>
   */
  public final static class QuarterService
  {
    private QuarterService()
    {
    }

    /**
     * Call the GET method of the Quarter Webservice.
     * <p>
     * This method returns a specific city quarter.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param is24ContinentId
     * ID of the continent to lookup, that was returned by
     * {@link ContinentService}
     *
     * @param is24CountryId
     * ID of the country to lookup, that was returned by
     * {@link CountryService}
     *
     * @param is24RegionId
     * ID of the region to lookup, that was returned by
     * {@link RegionService}
     *
     * @param is24CityId
     * ID of the city to lookup, that was returned by
     * {@link CityService}
     *
     * @param is24QuarterId
     * ID of the quarter to lookup, that was returned by
     * {@link CityService#getAll(org.openestate.is24.restapi.AbstractClient, long, long, long)}
     *
     * @return
     * requested quarter
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
     * @see <a href="http://api.immobilienscout24.de/our-apis/gis.html">Geo Information Service API</a>
     */
    public static Quarter get( AbstractClient client, long is24ContinentId, long is24CountryId, long is24RegionId, long is24CityId, long is24QuarterId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/gis/v1.0"
        + "/continent/" + is24ContinentId
        + "/country/" + is24CountryId
        + "/region/" + is24RegionId
        + "/city/" + is24CityId
        + "/quarter/" + is24QuarterId;

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successful execution
      if (response.statusCode==Response.OK)
      {
        return ((JAXBElement<Quarter>)
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
     * Call the GETall method of the Quarter Webservice.
     * <p>
     * This method returns the list of available quarters for a city.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param is24ContinentId
     * ID of the continent to lookup, that was returned by
     * {@link ContinentService}
     *
     * @param is24CountryId
     * ID of the country to lookup, that was returned by
     * {@link CountryService}
     *
     * @param is24RegionId
     * ID of the region to lookup, that was returned by
     * {@link RegionService}
     *
     * @param is24CityId
     * ID of the city to lookup, that was returned by
     * {@link CityService}
     *
     * @return
     * list of quarters
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
     * @see <a href="http://api.immobilienscout24.de/our-apis/gis.html">Geo Information Service API</a>
     */
    public static Quarters getAll( AbstractClient client, long is24ContinentId, long is24CountryId, long is24RegionId, long is24CityId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/gis/v1.0"
        + "/continent/" + is24ContinentId
        + "/country/" + is24CountryId
        + "/region/" + is24RegionId
        + "/city/" + is24CityId
        + "/quarter";

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successful execution
      if (response.statusCode==Response.OK)
      {
        return (Quarters) XmlUtils.unmarshal( response.body );
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
  }

  /**
   * Low level methods for the Region Webservice.
   * <p>
   * The Region Webservice is used in the Geo Information Service API to get
   * informations about available regions.
   *
   * @see <a href="http://api.immobilienscout24.de/our-apis/gis.html">Geo Information Service API</a>
   * @since 0.3
   * @author Andreas Rudolph <andy@openindex.de>
   */
  public final static class RegionService
  {
    private RegionService()
    {
    }

    /**
     * Call the GET method of the Region Webservice.
     * <p>
     * This method returns a specific region.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param is24ContinentId
     * ID of the continent to lookup, that was returned by
     * {@link ContinentService}
     *
     * @param is24CountryId
     * ID of the country to lookup, that was returned by
     * {@link CountryService}
     *
     * @param is24RegionId
     * ID of the region to lookup, that was returned by
     * {@link RegionService#getAll(org.openestate.is24.restapi.AbstractClient, long, long)}
     *
     * @return
     * requested region
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
     * @see <a href="http://api.immobilienscout24.de/our-apis/gis.html">Geo Information Service API</a>
     */
    public static Region get( AbstractClient client, long is24ContinentId, long is24CountryId, long is24RegionId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/gis/v1.0"
        + "/continent/" + is24ContinentId
        + "/country/" + is24CountryId
        + "/region/" + is24RegionId;

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successful execution
      if (response.statusCode==Response.OK)
      {
        return ((JAXBElement<Region>)
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
     * Call the GETall method of the Region Webservice.
     * <p>
     * This method returns the list of available regions for a country.
     *
     * @param client
     * {@link AbstractClient}, that is used to communicate with the Webservice
     *
     * @param is24ContinentId
     * ID of the continent to lookup, that was returned by
     * {@link ContinentService}
     *
     * @param is24CountryId
     * ID of the country to lookup, that was returned by
     * {@link CountryService}
     *
     * @return
     * list of regions
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
     * @see <a href="http://api.immobilienscout24.de/our-apis/gis.html">Geo Information Service API</a>
     */
    public static Regions getAll( AbstractClient client, long is24ContinentId, long is24CountryId ) throws IOException, OAuthException, JAXBException, RequestFailedException
    {
      // build request URL
      String url = client.getApiBaseUrl()
        + "/api/gis/v1.0"
        + "/continent/" + is24ContinentId
        + "/country/" + is24CountryId
        + "/region";

      // send request
      Response response = client.sendXmlRequest( new URL( url ), RequestMethod.GET, null );

      // parse result from response body after successful execution
      if (response.statusCode==Response.OK)
      {
        return (Regions) XmlUtils.unmarshal( response.body );
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
  }
}