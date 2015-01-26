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
package org.openestate.is24.restapi.utils;

import java.awt.Color;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.openestate.is24.restapi.utils.validator.EmailValidator;
import org.openestate.is24.restapi.xml.common.Attachment;
import org.openestate.is24.restapi.xml.common.PublishObject;
import org.openestate.is24.restapi.xml.common.RealtorContactDetails;
import org.openestate.is24.restapi.xml.realestates.ApartmentBuy;
import org.openestate.is24.restapi.xml.realestates.ApartmentRent;
import org.openestate.is24.restapi.xml.realestates.AssistedLiving;
import org.openestate.is24.restapi.xml.realestates.CompulsoryAuction;
import org.openestate.is24.restapi.xml.realestates.FlatShareRoom;
import org.openestate.is24.restapi.xml.realestates.GarageBuy;
import org.openestate.is24.restapi.xml.realestates.GarageRent;
import org.openestate.is24.restapi.xml.realestates.Gastronomy;
import org.openestate.is24.restapi.xml.realestates.HouseBuy;
import org.openestate.is24.restapi.xml.realestates.HouseRent;
import org.openestate.is24.restapi.xml.realestates.HouseType;
import org.openestate.is24.restapi.xml.realestates.Industry;
import org.openestate.is24.restapi.xml.realestates.Investment;
import org.openestate.is24.restapi.xml.realestates.LivingBuySite;
import org.openestate.is24.restapi.xml.realestates.LivingRentSite;
import org.openestate.is24.restapi.xml.realestates.Office;
import org.openestate.is24.restapi.xml.realestates.RealEstate;
import org.openestate.is24.restapi.xml.realestates.SeniorCare;
import org.openestate.is24.restapi.xml.realestates.ShortTermAccommodation;
import org.openestate.is24.restapi.xml.realestates.SpecialPurpose;
import org.openestate.is24.restapi.xml.realestates.Store;
import org.openestate.is24.restapi.xml.realestates.TradeSite;

/**
 * XML helper methods.
 *
 * @since 0.2
 * @author Andreas Rudolph <andy@openindex.de>
 */
public final class XmlUtils
{
  //private final static Logger LOGGER = LoggerFactory.getLogger( XmlUtils.class );
  public final static String DEFAULT_ENCODING = "UTF-8";
  private static JAXBContext JAXB = null;
  private final static String JAXB_PACKAGES = ""
    + "org.openestate.is24.restapi.xml.alterationdate"
    + ":org.openestate.is24.restapi.xml.attachmentsorder"
    + ":org.openestate.is24.restapi.xml.bookingoverview"
    + ":org.openestate.is24.restapi.xml.common"
    + ":org.openestate.is24.restapi.xml.offerlistelement"
    + ":org.openestate.is24.restapi.xml.offeruser"
    + ":org.openestate.is24.restapi.xml.premiumplacement"
    + ":org.openestate.is24.restapi.xml.productrecommendation"
    + ":org.openestate.is24.restapi.xml.realestatecounts"
    + ":org.openestate.is24.restapi.xml.realestateproject"
    + ":org.openestate.is24.restapi.xml.realestates"
    + ":org.openestate.is24.restapi.xml.realestatestock"
    + ":org.openestate.is24.restapi.xml.realtor"
    + ":org.openestate.is24.restapi.xml.realtorbadges"
    + ":org.openestate.is24.restapi.xml.showcaseplacement"
    + ":org.openestate.is24.restapi.xml.topplacement"
    + ":org.openestate.is24.restapi.xml.videoupload"
    + ":org.openestate.is24.restapi.xml.zipandlocationtoregion";
  private final static Pattern ANY_TAG_PATTERN = Pattern.compile(
    "<[^<>\\n]*>", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE );
  private final static Pattern BR_TAG_PATTERN = Pattern.compile(
    "<\\s*br[^<>\\n]*>", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE );

  private XmlUtils()
  {
  }

  /**
   * Creates a marshaller for XML generation.
   *
   * @return
   * marshaller
   *
   * @throws JAXBException
   * if the marshaller is not creatable
   */
  public static Marshaller createMarshaller() throws JAXBException
  {
    return createMarshaller( Charset.defaultCharset().name(), true );
  }

  /**
   * Creates a marshaller for XML generation.
   *
   * @param encoding
   * encoding of generated XML output
   *
   * @param prettyPrint
   * enable pretty printing for generated XML output
   *
   * @return
   * marshaller
   *
   * @throws JAXBException
   * if the marshaller is not creatable
   */
  public static Marshaller createMarshaller( String encoding, boolean prettyPrint ) throws JAXBException
  {
    Marshaller m = getContext().createMarshaller();
    m.setProperty( Marshaller.JAXB_ENCODING, encoding );
    m.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, prettyPrint );
    return m;
  }

  /**
   * Creates an unmarshaller for XML parsing.
   *
   * @return
   * unmarshaller
   *
   * @throws JAXBException
   * if the unmarshaller is not creatable
   */
  public static Unmarshaller createUnmarshaller() throws JAXBException
  {
    return getContext().createUnmarshaller();
  }

  /**
   * Returns the JAXB context for XML parsing / generation.
   *
   * @return
   * JAXB context
   *
   * @throws JAXBException
   * if the JAXB context is not initialized properly
   */
  public synchronized static JAXBContext getContext() throws JAXBException
  {
    if (JAXB==null) initContext( Thread.currentThread().getContextClassLoader() );
    return JAXB;
  }

  /**
   * Initialize the JAXB context.
   *
   * @param classloader
   * class loader to access JAXB classes
   *
   * @throws JAXBException
   * if the JAXB context is not initialized properly
   */
  public synchronized static void initContext( ClassLoader classloader ) throws JAXBException
  {
    JAXB = JAXBContext.newInstance( JAXB_PACKAGES, classloader );
  }

  /**
   * Creates a XML string for a JAXB object.
   *
   * @param object
   * JAXB object, that is converted into XML output
   *
   * @return
   * XML output
   *
   * @throws JAXBException
   * if XML can't be written
   *
   * @throws IOException
   * if XML can't be written
   */
  public static String marshal( Object object ) throws JAXBException, IOException
  {
    return marshal( object, DEFAULT_ENCODING, true );
  }

  /**
   * Creates a XML string for a JAXB object.
   *
   * @param object
   * JAXB object, that is converted into XML output
   *
   * @param encoding
   * encoding of generated XML output
   *
   * @return
   * XML output
   *
   * @throws JAXBException
   * if XML can't be written
   *
   * @throws IOException
   * if XML can't be written
   */
  public static String marshal( Object object, String encoding ) throws JAXBException, IOException
  {
    return marshal( object, encoding, true );
  }

  /**
   * Creates a XML string for a JAXB object.
   *
   * @param object
   * JAXB object, that is converted into XML output
   *
   * @param encoding
   * encoding of generated XML output
   *
   * @param prettyPrint
   * enable pretty printing for generated XML output
   *
   * @return
   * XML output
   *
   * @throws JAXBException
   * if XML can't be written
   *
   * @throws IOException
   * if XML can't be written
   */
  public static String marshal( Object object, String encoding, boolean prettyPrint ) throws JAXBException, IOException
  {
    if (object==null) return null;
    ByteArrayOutputStream output = null;
    try
    {
      output = new ByteArrayOutputStream();

      if (object instanceof Attachment)
      {
        writeXml( (Attachment) object, encoding, prettyPrint, output );
      }
      else if (object instanceof PublishObject)
      {
        writeXml( (PublishObject) object, encoding, prettyPrint, output );
      }
      else if (object instanceof RealtorContactDetails)
      {
        writeXml( (RealtorContactDetails) object, encoding, prettyPrint, output );
      }
      else if (object instanceof RealEstate)
      {
        writeXml( (RealEstate) object, encoding, prettyPrint, output );
      }
      else
      {
        createMarshaller( encoding, prettyPrint ).marshal( object, output );
      }

      output.flush();

      return Charset.forName( encoding ).decode( ByteBuffer.wrap( output.toByteArray() ) ).toString();
    }
    finally
    {
      IOUtils.closeQuietly( output );
    }
  }

  /**
   * Reads a {@link Color} value from XML.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value
   */
  public static Color parseColor( String value )
  {
    String val = StringUtils.trimToNull( value );
    if (val==null) return null;
    if (val.startsWith( "#" )) val = val.substring( 1 );
    if (!val.startsWith( "0x" )) val = "0x" + val;
    return Color.decode( val );
  }

  /**
   * Reads a {@link Calendar} value from XML.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value
   */
  public static Calendar parseDate( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    try
    {
      return DatatypeConverter.parseDate( value );
    }
    catch (Exception ex)
    {
      //LOGGER.debug( "Invalid xsd:date value '" + value + "'!" );
      try
      {
        Date date = DateUtils.parseDateStrictly( value,
          new String[]{ "dd.MM.yyyy", "dd.MM.yy", "dd/MM/yyyy", "dd/MM/yy", "dd-MM-yyyy", "dd-MMM-yyyy", "yyyy-MM-dd", "yyyy/MM/dd", "yyyy-D", "MM/yyyy", "MMM yyyy", "MMMMM yyyy", "yyyy" }
        );
        Calendar cal = Calendar.getInstance();
        cal.setTime( date );
        return cal;
      }
      catch (Exception ex2)
      {
        throw new IllegalArgumentException( "Can't parse xsd:date value '"+value+"'!", ex2 );
      }
    }
  }

  /**
   * Reads a {@link Double} value from XML.
   *
   * @param value
   * XML string
   *
   * @param min
   * minimal value
   *
   * @param max
   * maximal value
   *
   * @param precision
   * number of decimal places
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  private static Double parseDouble( String value, Double min, Double max, int precision )
  {
    if (StringUtils.isBlank( value )) return null;
    try
    {
      return Double.valueOf( value );
    }
    catch (NumberFormatException ex)
    {
      return null;
    }
  }

  /**
   * Reads a {@link Double} value from XML
   * with maximal 8 digits and 2 decimal places.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static Double parseDouble8_2( String value )
  {
    return parseDouble( value, 0d, 99999999d, 2 );
  }

  /**
   * Reads a {@link Double} value from XML
   * with maximal 13 digits and 2 decimal places.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static Double parseDouble13_2( String value )
  {
    return parseDouble( value, 0d, 9999999999999d, 2 );
  }

  /**
   * Reads a positive {@link Double} value from XML
   * with maximal 3 decimal places.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static Double parseDoublePositive( String value )
  {
    return parseDouble( value, 0.001d, null, 3 );
  }

  /**
   * Reads an e-mail address from XML.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static String parseEmail( String value )
  {
    String val = parseText( value, 5, 300 );
    if (val==null) return null;
    return (EmailValidator.getInstance().isValid( val ))? val: null;
  }

  /**
   * Reads an {@link Integer} value from XML,
   * that matches the 'FlatShareSearchSize' simple type.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static Integer parseFlatShareSearchSize( String value )
  {
    return parseInteger( value, 2, 11 );
  }

  /**
   * Reads an {@link Integer} value from XML,
   * that matches the type of the 'numberOfFloors' element.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static Integer parseFloorNr( String value )
  {
    return parseInteger( value, -1, null );
  }

  /**
   * Reads an {@link Integer} value from XML,
   * that matches the type of the 'groupNumber' element.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static Integer parseGroupNr( String value )
  {
    return parseInteger( value, 0, 2147483647 );
  }

  /**
   * Reads an {@link Integer} value from XML.
   *
   * @param value
   * XML string
   *
   * @param min
   * minimal value
   *
   * @param max
   * maximal value
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  private static Integer parseInteger( String value, Integer min, Integer max )
  {
    String val = StringUtils.trimToNull( value );
    return (val!=null && StringUtils.isNumeric( val ))?
      Integer.valueOf( val ): null;
  }

  /**
   * Reads a positive {@link Integer} value from XML
   * with maximal 9 digits.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static Integer parseInteger9Positive( String value )
  {
    return parseInteger( value, 1, 9 );
  }

  /**
   * Reads an {@link Integer} value from XML
   * from 0 to 99.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static Integer parseInteger99( String value )
  {
    return parseInteger( value, 0, 99 );
  }

  /**
   * Reads an {@link Integer} value from XML
   * from 0 to 999.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static Integer parseInteger999( String value )
  {
    return parseInteger( value, 0, 999 );
  }

  /**
   * Reads an {@link Integer} value from XML
   * from 0 to 9999.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static Integer parseInteger9999( String value )
  {
    return parseInteger( value, 0, 9999 );
  }

  /**
   * Reads a positive {@link Integer} value from XML
   * up to 9999.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static Integer parseInteger9999Positive( String value )
  {
    return parseInteger( value, 1, 9999 );
  }

  /**
   * Reads an {@link Integer} value from XML
   * from 0 to 99999.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static Integer parseInteger99999( String value )
  {
    return parseInteger( value, 0, 99999 );
  }

  /**
   * Reads a {@link Double} value from XML
   * with a valid latitude range.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static Double parseLatitude( String value )
  {
    return parseDouble( value, -90d, 90d, 10 );
  }

  /**
   * Reads a {@link Double} value from XML
   * with a valid longitude range.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static Double parseLongitude( String value )
  {
    return parseDouble( value, -180d, 180d, 10 );
  }

  /**
   * Reads a {@link String} value from XML
   * with a at least 1 character.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static String parseNonEmptyText( String value )
  {
    return parseText( value, 1, null );
  }

  /**
   * Reads a {@link String} value from XML,
   * that matches the 'Password' simple type.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static String parsePassword( String value )
  {
    return parseText( value, 5, 40 );
  }

  /**
   * Reads a {@link String} value from XML
   * with a valid phone number.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static String parsePhoneNumber( String value )
  {
    return StringUtils.trimToNull( value );
  }

  /**
   * Reads a {@link String} value from XML
   * with a valid phone number area code.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static String parsePhoneNumberAreaCode( String value )
  {
    return StringUtils.trimToNull( value );
  }

  /**
   * Reads a {@link String} value from XML
   * with a valid phone number country code.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static String parsePhoneNumberCountryCode( String value )
  {
    return StringUtils.trimToNull( value );
  }

  /**
   * Reads a {@link String} value from XML
   * with a valid phone number subscriber part.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static String parsePhoneNumberSubscriber( String value )
  {
    return StringUtils.trimToNull( value );
  }

  /**
   * Reads a {@link Double} value from XML,
   * that matches the 'PriceMultiplierType' simple type.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static Double parsePriceMultiplier( String value )
  {
    return parseDouble( value, 0d, 99d, 1 );
  }

  /**
   * Reads a {@link Double} value from XML,
   * that matches the 'NumberOfRoomsType' simple type.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static Double parseRoomNr( String value )
  {
    return parseDouble( value, 0.5d, 9999d, 2 );
  }

  /**
   * Reads a {@link Double} value from XML,
   * that matches the type of the 'numberOfRooms' element in "BaseHouse".
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static Double parseRoomNrForBaseHouse( String value )
  {
    return parseDouble( value, 0d, 999d, 2 );
  }

  /**
   * Reads a {@link String} value from XML.
   *
   * @param value
   * XML string
   *
   * @param minLength
   * minimal length
   *
   * @param maxLength
   * maximal length
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  private static String parseText( String value, Integer minLength, Integer maxLength )
  {
    return StringUtils.trimToNull( value );
  }

  /**
   * Reads a {@link String} value from XML
   * with maximal 15 characters.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static String parseText15( String value )
  {
    return parseText( value, null, 15 );
  }

  /**
   * Reads a {@link String} value from XML
   * with maximal 16 characters.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static String parseText16( String value )
  {
    return parseText( value, null, 16 );
  }

  /**
   * Reads a {@link String} value from XML
   * with maximal 18 characters.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static String parseText18( String value )
  {
    return parseText( value, null, 18 );
  }

  /**
   * Reads a {@link String} value from XML
   * with maximal 20 characters.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static String parseText20( String value )
  {
    return parseText( value, null, 20 );
  }

  /**
   * Reads a {@link String} value from XML
   * with maximal 30 characters.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static String parseText30( String value )
  {
    return parseText( value, null, 30 );
  }

  /**
   * Reads a {@link String} value from XML
   * with maximal 40 characters.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static String parseText40( String value )
  {
    return parseText( value, null, 40 );
  }

  /**
   * Reads a {@link String} value from XML
   * with maximal 50 characters.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static String parseText50( String value )
  {
    return parseText( value, null, 50 );
  }

  /**
   * Reads a {@link String} value from XML
   * with maximal 80 characters.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static String parseText80( String value )
  {
    return parseText( value, null, 80 );
  }

  /**
   * Reads a {@link String} value from XML
   * with maximal 100 characters.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static String parseText100( String value )
  {
    return parseText( value, null, 100 );
  }

  /**
   * Reads a {@link String} value from XML
   * with maximal 1000 characters.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static String parseText1000( String value )
  {
    return parseText( value, null, 1000 );
  }

  /**
   * Reads a {@link String} value from XML
   * with maximal 1800 characters.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static String parseText1800( String value )
  {
    return parseText( value, null, 1800 );
  }

  /**
   * Reads a {@link String} value from XML
   * with maximal 2000 characters.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static String parseText2000( String value )
  {
    return parseText( value, null, 2000 );
  }

  /**
   * Reads a {@link Double} value from XML,
   * that matches the type of the "thermalCharacteristic" element.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static Double parseThermalCharacteristic( String value )
  {
    return parseDouble( value, 0d, 1999d, 2 );
  }

  /**
   * Reads an {@link URL} value from XML.
   *
   * @param value
   * XML string
   *
   * @return
   * parsed value or null, if the value is invalid
   */
  public static URL parseUrl( String value )
  {
    String val = StringUtils.trimToNull( value );
    try
    {
      return (val!=null)? new URL( val ): null;
    }
    catch (MalformedURLException ex)
    {
      throw new IllegalArgumentException( "Can't parse URL '" + value + "'!", ex );
    }
  }

  /**
   * Writes a {@link Color} value into XML output.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printColor( Color value )
  {
    if (value==null)
    {
      throw new IllegalArgumentException(
        "The provided color is invalid!" );
    }

    String r = Integer.toHexString( value.getRed() ).trim();
    if (r.length() == 1) r = "0" + r;
    String g = Integer.toHexString( value.getGreen() ).trim();
    if (g.length() == 1) g = "0" + g;
    String b = Integer.toHexString( value.getBlue() ).trim();
    if (b.length() == 1) b = "0" + b;
    return "#" + r + g + b;
  }

  /**
   * Writes a {@link Calendar} value into XML output.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printDate( Calendar value )
  {
    //return (value!=null)? DatatypeConverter.printDate( value ): null;
    if (value==null) return null;
    DateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd" );
    return formatter.format( value.getTime() );
  }

  /**
   * Writes a {@link Double} value into XML output.
   *
   * @param value
   * value to write
   *
   * @param min
   * minimal value
   *
   * @param max
   * maximal value
   *
   * @param precision
   * number of decimal places
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  private static String printDouble( Double value, Double min, Double max, int precision )
  {
    if (value==null)
    {
      throw new IllegalArgumentException(
        "The provided double value NULL is invalid!" );
    }
    if (min!=null && value.doubleValue()<min.doubleValue())
    {
      throw new IllegalArgumentException(
        "The provided double value " + value + " is too small (minimum is " + min + ")!" );
    }
    if (max!=null && value.doubleValue()>max.doubleValue())
    {
      throw new IllegalArgumentException(
        "The provided double value " + value + " is too high (maximum is " + max + ")!" );
    }

    NumberFormat format = NumberFormat.getInstance( Locale.ENGLISH );
    format.setMaximumFractionDigits( precision );
    format.setMinimumFractionDigits( 0 );
    format.setGroupingUsed( false );
    return format.format( value );
  }

  /**
   * Writes a {@link Double} value into XML output
   * with maximal 8 digits and 2 decimal places.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printDouble8_2( Double value )
  {
    return printDouble( value, 0d, 99999999d, 2 );
  }

  /**
   * Writes a {@link Double} value into XML output
   * with maximal 13 digits and 2 decimal places.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printDouble13_2( Double value )
  {
    return printDouble( value, 0d, 9999999999999d, 2 );
  }

  /**
   * Writes a positive {@link Double} value into XML output
   * with maximal 3 decimal places.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printDoublePositive( Double value )
  {
    return printDouble( value, 0.001d, null, 3 );
  }

  /**
   * Writes an e-mail address into XML output.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printEmail( String value )
  {
    String val = printText( value, 5, 300 );
    if (val==null || !EmailValidator.getInstance().isValid( val ))
    {
      throw new IllegalArgumentException(
        "The provided email '" + value + "' is invalid!" );
    }
    return val;
  }

  /**
   * Writes an {@link Integer} value into XML output,
   * that matches the 'FlatShareSearchSize' simple type.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printFlatShareSearchSize( Integer value )
  {
    return printInteger( value, 2, 11 );
  }

  /**
   * Writes an {@link Integer} value into XML output,
   * that matches the type of the 'numberOfFloors' element.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printFloorNr( Integer value )
  {
    return printInteger( value, -1, null );
  }

  /**
   * Writes an {@link Integer} value into XML output,
   * that matches the type of the 'groupNumber' element.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printGroupNr( Integer value )
  {
    return printInteger( value, 0, 2147483647 );
  }

  /**
   * Writes an {@link Integer} value into XML output.
   *
   * @param value
   * value to write
   *
   * @param min
   * minimal value
   *
   * @param max
   * maximal value
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  private static String printInteger( Integer value, Integer min, Integer max )
  {
    if (value==null)
    {
      throw new IllegalArgumentException(
        "The provided integer value NULL is invalid!" );
    }
    if (min!=null && value.intValue()<min.intValue())
    {
      throw new IllegalArgumentException(
        "The provided integer value " + value + " is too small (minimum is " + min + ")!" );
    }
    if (max!=null && value.intValue()>max.intValue())
    {
      throw new IllegalArgumentException(
        "The provided integer value " + value + " is too high (maximum is " + max + ")!" );
    }
    return value.toString();
  }

  /**
   * Writes a positive {@link Integer} value into XML output
   * with maximal 9 digits.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printInteger9Positive( Integer value )
  {
    return printInteger( value, 1, 9 );
  }

  /**
   * Writes an {@link Integer} value into XML output
   * from 0 to 99.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printInteger99( Integer value )
  {
    return printInteger( value, 0, 99 );
  }

  /**
   * Writes an {@link Integer} value into XML output
   * from 0 to 999.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printInteger999( Integer value )
  {
    return printInteger( value, 0, 999 );
  }

  /**
   * Writes an {@link Integer} value into XML output
   * from 0 to 9999.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printInteger9999( Integer value )
  {
    return printInteger( value, 0, 9999 );
  }

  /**
   * Writes a positive {@link Integer} value into XML output
   * up to 9999.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printInteger9999Positive( Integer value )
  {
    return printInteger( value, 1, 9999 );
  }

  /**
   * Writes an {@link Integer} value into XML output
   * from 0 to 99999.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printInteger99999( Integer value )
  {
    return printInteger( value, 0, 99999 );
  }

  /**
   * Writes a {@link Double} value into XML output
   * with a valid latitude range.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printLatitude( Double value )
  {
    return printDouble( value, -90d, 90d, 10 );
  }

  /**
   * Writes a {@link Double} value into XML output
   * with a valid longitude range.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printLongitude( Double value )
  {
    return printDouble( value, -180d, 180d, 10 );
  }

  /**
   * Writes a {@link String} value into XML output
   * with a at least 1 character.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printNonEmptyText( String value )
  {
    return printText( value, 1, null );
  }

  /**
   * Writes a {@link String} value into XML output,
   * that matches the 'Password' simple type.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printPassword( String value )
  {
    return printText( value, 5, 40 );
  }

  /**
   * Writes a {@link String} value into XML output
   * with a valid phone number.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printPhoneNumber( String value )
  {
    String val = StringUtils.trimToNull( value );

    if (val==null || !val.matches( "(\\+[1-9]\\d{0,3}) +\\d{1,10} +([\\d][\\d \\-]{0,24}[\\d])" ))
    {
      throw new IllegalArgumentException(
        "The provided phone number '" + value + "' is invalid!" );
    }

    return val;
  }

  /**
   * Writes a {@link String} value into XML output
   * with a valid phone number area code.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printPhoneNumberAreaCode( String value )
  {
    String val = StringUtils.trimToNull( value );
    if (val==null || !StringUtils.isNumericSpace( val ))
    {
      throw new IllegalArgumentException(
        "The provided area phone code '" + value + "' is invalid!" );
    }

    val = StringUtils.trimToNull( val.replaceAll( "\\D", "" ) );
    if (val==null || val.length()>10)
    {
      throw new IllegalArgumentException(
        "The provided area phone code '" + value + "' is invalid!" );
    }

    return val;
  }

  /**
   * Writes a {@link String} value into XML output
   * with a valid phone number country code.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printPhoneNumberCountryCode( String value )
  {
    String val = StringUtils.trimToNull( value );

    // ggf. "+"-Zeichen voranstellen
    if (val!=null && !val.startsWith( "+" ))
    {
      // ggf. doppelte führende Nullen entfernen
      if (val.startsWith( "00" )) val = StringUtils.substring( val, 2 );

      val = "+" + val;
    }

    if (val==null || !val.matches( "\\+[1-9]\\d{0,3}" ))
    {
      throw new IllegalArgumentException(
        "The provided country phone code '" + value + "' is invalid!" );
    }

    return val;
  }

  /**
   * Writes a {@link String} value into XML output
   * with a valid phone number subscriber part.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printPhoneNumberSubscriber( String value )
  {
    String val = StringUtils.trimToNull( value );

    if (val!=null)
    {
      // sicherstellen, dass am Anfang und Ende ein numerischer Wert steht
      String firstDigit = StringUtils.substring( val, 0, 1 );
      String lastDigit = StringUtils.substring( val, val.length()-1 );
      if (!StringUtils.isNumeric( firstDigit ) || !StringUtils.isNumeric( lastDigit ))
      {
        throw new IllegalArgumentException(
          "The provided phone subscriber  '" + value + "' is invalid!" );
      }

      // alle nicht numerischen Zeichen durch "-" ersetzen
      val = val.replaceAll( "\\D", "-" );
      while (val.contains( "--" ))
      {
        val = StringUtils.replace( val, "--", "-" );
      }
    }

    if (val==null || !val.matches( "[\\d][\\d \\-]{0,24}[\\d]" ))
    {
      throw new IllegalArgumentException(
        "The provided phone subscriber  '" + value + "' is invalid!" );
    }

    return val;
  }

  /**
   * Writes a {@link Double} value into XML output,
   * that matches the 'PriceMultiplierType' simple type.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printPriceMultiplier( Double value )
  {
    return printDouble( value, 0d, 99d, 1 );
  }

  /**
   * Writes a {@link Double} value into XML output,
   * that matches the 'NumberOfRoomsType' simple type.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printRoomNr( Double value )
  {
    return printDouble( value, 0.5d, 9999d, 2 );
  }

  /**
   * Writes a {@link Double} value into XML output,
   * that matches the type of the 'numberOfRooms' element in "BaseHouse".
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printRoomNrForBaseHouse( Double value )
  {
    return printDouble( value, 0d, 999d, 2 );
  }

  /**
   * Writes a {@link String} value into XML output.
   *
   * @param value
   * XML string
   *
   * @param minLength
   * minimal length
   *
   * @param maxLength
   * maximal length
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  private static String printText( String value, Integer minLength, Integer maxLength )
  {
    String val = StringUtils.trimToNull( value );
    if (val==null)
    {
      throw new IllegalArgumentException(
        "The provided text '" + value + "' is invalid!" );
    }
    if (minLength!=null && val.length()<minLength.intValue())
    {
      throw new IllegalArgumentException(
        "The provided text " + value + " is too short (minimum is " + minLength + ")!" );
    }
    val = StringEscapeUtils.unescapeHtml4( value );

    // replace <br> with line breaks
    Matcher m = BR_TAG_PATTERN.matcher( val );
    val = StringUtils.trimToEmpty( m.replaceAll( SystemUtils.LINE_SEPARATOR ) );

    // strip any other html code
    m = ANY_TAG_PATTERN.matcher( val );
    val = StringUtils.trimToEmpty( m.replaceAll( "" ) );
    val = StringUtils.replace( val, "<", "«" );
    val = StringUtils.replace( val, ">", "»" );

    return (maxLength!=null)?
      StringUtils.abbreviate( val, maxLength.intValue() ): val;
  }

  /**
   * Writes a {@link String} value into XML output
   * with maximal 15 characters.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printText15( String value )
  {
    return printText( value, null, 15 );
  }

  /**
   * Writes a {@link String} value into XML output
   * with maximal 16 characters.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printText16( String value )
  {
    return printText( value, null, 16 );
  }

  /**
   * Writes a {@link String} value into XML output
   * with maximal 18 characters.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printText18( String value )
  {
    return printText( value, null, 18 );
  }

  /**
   * Writes a {@link String} value into XML output
   * with maximal 20 characters.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printText20( String value )
  {
    return printText( value, null, 20 );
  }

  /**
   * Writes a {@link String} value into XML output
   * with maximal 30 characters.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printText30( String value )
  {
    return printText( value, null, 30 );
  }

  /**
   * Writes a {@link String} value into XML output
   * with maximal 40 characters.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printText40( String value )
  {
    return printText( value, null, 40 );
  }

  /**
   * Writes a {@link String} value into XML output
   * with maximal 50 characters.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printText50( String value )
  {
    return printText( value, null, 50 );
  }

  /**
   * Writes a {@link String} value into XML output
   * with maximal 80 characters.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printText80( String value )
  {
    return printText( value, null, 80 );
  }

  /**
   * Writes a {@link String} value into XML output
   * with maximal 100 characters.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printText100( String value )
  {
    return printText( value, null, 100 );
  }

  /**
   * Writes a {@link String} value into XML output
   * with maximal 1000 characters.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printText1000( String value )
  {
    return printText( value, null, 1000 );
  }

  /**
   * Writes a {@link String} value into XML output
   * with maximal 1800 characters.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printText1800( String value )
  {
    return printText( value, null, 1800 );
  }

  /**
   * Writes a {@link String} value into XML output
   * with maximal 2000 characters.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printText2000( String value )
  {
    return printText( value, null, 2000 );
  }

  /**
   * Writes a {@link Double} value into XML output,
   * that matches the type of the "thermalCharacteristic" element.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printThermalCharacteristic( Double value )
  {
    return printDouble( value, 0d, 1999d, 2 );
  }

  /**
   * Writes an {@link URL} value into XML output.
   *
   * @param value
   * value to write
   *
   * @return
   * XML string
   *
   * @throws IllegalArgumentException
   * if a validation error occured
   */
  public static String printUrl( URL value )
  {
    if (value==null)
    {
      throw new IllegalArgumentException(
        "The provided URL NULL is invalid!" );
    }
    return value.toString();
  }

  /**
   * Creates a JAXB object from a XML string.
   *
   * @param xml
   * XML string
   *
   * @return
   * JAXB object
   *
   * @throws JAXBException
   * if XML can't be read
   */
  public static Object unmarshal( String xml ) throws JAXBException
  {
    if (StringUtils.isBlank( xml )) return null;
    Reader reader = null;
    try
    {
      reader = new StringReader( xml );
      return createUnmarshaller().unmarshal( reader );
    }
    finally
    {
      IOUtils.closeQuietly( reader );
    }
  }

  /**
   * Writes an {@link Attachment} as XML into an {@link OutputStream}.
   * <p>
   * The provided object is wrapped into a {@link JAXBElement} before XML
   * creation in order to match the requirements of the schema.
   * <p>
   * This method makes sure, that validation errors do not break XML creation.
   * Invalid entries are not written into XML.
   *
   * @param attachment
   * object to write
   *
   * @param output
   * stream, where the XML is written to
   *
   * @throws JAXBException
   * if an error occured during XML creation
   */
  public static void writeXml( Attachment attachment, OutputStream output ) throws JAXBException
  {
    writeXml( attachment, DEFAULT_ENCODING, true, output );
  }

  /**
   * Writes an {@link Attachment} as XML into an {@link OutputStream}.
   * <p>
   * The provided object is wrapped into a {@link JAXBElement} before XML
   * creation in order to match the requirements of the schema.
   * <p>
   * This method makes sure, that validation errors do not break XML creation.
   * Invalid entries are not written into XML.
   *
   * @param attachment
   * object to write
   *
   * @param encoding
   * encoding of generated XML output
   *
   * @param output
   * stream, where the XML is written to
   *
   * @throws JAXBException
   * if an error occured during XML creation
   */
  public static void writeXml( Attachment attachment, String encoding, OutputStream output ) throws JAXBException
  {
    writeXml( attachment, encoding, true, output );
  }

  /**
   * Writes an {@link Attachment} as XML into an {@link OutputStream}.
   * <p>
   * The provided object is wrapped into a {@link JAXBElement} before XML
   * creation in order to match the requirements of the schema.
   * <p>
   * This method makes sure, that validation errors do not break XML creation.
   * Invalid entries are not written into XML.
   *
   * @param attachment
   * object to write
   *
   * @param encoding
   * encoding of generated XML output
   *
   * @param prettyPrint
   * enable pretty printing for generated XML output
   *
   * @param output
   * stream, where the XML is written to
   *
   * @throws JAXBException
   * if an error occured during XML creation
   */
  public static void writeXml( Attachment attachment, String encoding, boolean prettyPrint, OutputStream output ) throws JAXBException
  {
    writeXml( attachment, createMarshaller( encoding, prettyPrint ), output );
  }

  /**
   * Writes an {@link Attachment} as XML into an {@link OutputStream}.
   * <p>
   * The provided object is wrapped into a {@link JAXBElement} before XML
   * creation in order to match the requirements of the schema.
   * <p>
   * This method makes sure, that validation errors do not break XML creation.
   * Invalid entries are not written into XML.
   *
   * @param attachment
   * object to write
   *
   * @param marshaller
   * marshaller, that is used for XML generation
   *
   * @param output
   * stream, where the XML is written to
   *
   * @throws JAXBException
   * if an error occured during XML creation
   */
  public static void writeXml( Attachment attachment, Marshaller marshaller, OutputStream output ) throws JAXBException
  {
    final org.openestate.is24.restapi.xml.common.ObjectFactory factory =
      new org.openestate.is24.restapi.xml.common.ObjectFactory();

    marshaller.setEventHandler( new ValidationEventHandler()
    {
      @Override
      public boolean handleEvent( ValidationEvent ve )
      {
        return true;
      }
    });

    marshaller.marshal(
      factory.createAttachment( attachment ), output );
  }

  /**
   * Writes a {@link PublishObject} as XML into an {@link OutputStream}.
   * <p>
   * The provided object is wrapped into a {@link JAXBElement} before XML
   * creation in order to match the requirements of the schema.
   * <p>
   * This method makes sure, that validation errors do not break XML creation.
   * Invalid entries are not written into XML.
   *
   * @param publishing
   * object to write
   *
   * @param output
   * stream, where the XML is written to
   *
   * @throws JAXBException
   * if an error occured during XML creation
   */
  public static void writeXml( PublishObject publishing, OutputStream output ) throws JAXBException
  {
    writeXml( publishing, DEFAULT_ENCODING, true, output );
  }

  /**
   * Writes a {@link PublishObject} as XML into an {@link OutputStream}.
   * <p>
   * The provided object is wrapped into a {@link JAXBElement} before XML
   * creation in order to match the requirements of the schema.
   * <p>
   * This method makes sure, that validation errors do not break XML creation.
   * Invalid entries are not written into XML.
   *
   * @param publishing
   * object to write
   *
   * @param encoding
   * encoding of generated XML output
   *
   * @param output
   * stream, where the XML is written to
   *
   * @throws JAXBException
   * if an error occured during XML creation
   */
  public static void writeXml( PublishObject publishing, String encoding, OutputStream output ) throws JAXBException
  {
    writeXml( publishing, encoding, true, output );
  }

  /**
   * Writes a {@link PublishObject} as XML into an {@link OutputStream}.
   * <p>
   * The provided object is wrapped into a {@link JAXBElement} before XML
   * creation in order to match the requirements of the schema.
   * <p>
   * This method makes sure, that validation errors do not break XML creation.
   * Invalid entries are not written into XML.
   *
   * @param publishing
   * object to write
   *
   * @param encoding
   * encoding of generated XML output
   *
   * @param prettyPrint
   * enable pretty printing for generated XML output
   *
   * @param output
   * stream, where the XML is written to
   *
   * @throws JAXBException
   * if an error occured during XML creation
   */
  public static void writeXml( PublishObject publishing, String encoding, boolean prettyPrint, OutputStream output ) throws JAXBException
  {
    writeXml( publishing, createMarshaller( encoding, prettyPrint ), output );
  }

  /**
   * Writes a {@link PublishObject} as XML into an {@link OutputStream}.
   * <p>
   * The provided object is wrapped into a {@link JAXBElement} before XML
   * creation in order to match the requirements of the schema.
   * <p>
   * This method makes sure, that validation errors do not break XML creation.
   * Invalid entries are not written into XML.
   *
   * @param publishing
   * object to write
   *
   * @param marshaller
   * marshaller, that is used for XML generation
   *
   * @param output
   * stream, where the XML is written to
   *
   * @throws JAXBException
   * if an error occured during XML creation
   */
  public static void writeXml( PublishObject publishing, Marshaller marshaller, OutputStream output ) throws JAXBException
  {
    final org.openestate.is24.restapi.xml.common.ObjectFactory factory =
      new org.openestate.is24.restapi.xml.common.ObjectFactory();

    marshaller.setEventHandler( new ValidationEventHandler()
    {
      @Override
      public boolean handleEvent( ValidationEvent ve )
      {
        return true;
      }
    });

    marshaller.marshal(
      factory.createPublishObject( publishing ), output );
  }

  /**
   * Writes a {@link RealtorContactDetails} as XML into an {@link OutputStream}.
   * <p>
   * The provided object is wrapped into a {@link JAXBElement} before XML
   * creation in order to match the requirements of the schema.
   * <p>
   * This method makes sure, that validation errors do not break XML creation.
   * Invalid entries are not written into XML.
   *
   * @param contact
   * object to write
   *
   * @param output
   * stream, where the XML is written to
   *
   * @throws JAXBException
   * if an error occured during XML creation
   */
  public static void writeXml( RealtorContactDetails contact, OutputStream output ) throws JAXBException
  {
    writeXml( contact, DEFAULT_ENCODING, true, output );
  }

  /**
   * Writes a {@link RealtorContactDetails} as XML into an {@link OutputStream}.
   * <p>
   * The provided object is wrapped into a {@link JAXBElement} before XML
   * creation in order to match the requirements of the schema.
   * <p>
   * This method makes sure, that validation errors do not break XML creation.
   * Invalid entries are not written into XML.
   *
   * @param contact
   * object to write
   *
   * @param encoding
   * encoding of generated XML output
   *
   * @param output
   * stream, where the XML is written to
   *
   * @throws JAXBException
   * if an error occured during XML creation
   */
  public static void writeXml( RealtorContactDetails contact, String encoding, OutputStream output ) throws JAXBException
  {
    writeXml( contact, encoding, true, output );
  }

  /**
   * Writes a {@link RealtorContactDetails} as XML into an {@link OutputStream}.
   * <p>
   * The provided object is wrapped into a {@link JAXBElement} before XML
   * creation in order to match the requirements of the schema.
   * <p>
   * This method makes sure, that validation errors do not break XML creation.
   * Invalid entries are not written into XML.
   *
   * @param contact
   * object to write
   *
   * @param encoding
   * encoding of generated XML output
   *
   * @param prettyPrint
   * enable pretty printing for generated XML output
   *
   * @param output
   * stream, where the XML is written to
   *
   * @throws JAXBException
   * if an error occured during XML creation
   */
  public static void writeXml( RealtorContactDetails contact, String encoding, boolean prettyPrint, OutputStream output ) throws JAXBException
  {
    writeXml( contact, createMarshaller( encoding, prettyPrint ), output );
  }

  /**
   * Writes a {@link RealtorContactDetails} as XML into an {@link OutputStream}.
   * <p>
   * The provided object is wrapped into a {@link JAXBElement} before XML
   * creation in order to match the requirements of the schema.
   * <p>
   * This method makes sure, that validation errors do not break XML creation.
   * Invalid entries are not written into XML.
   *
   * @param contact
   * object to write
   *
   * @param marshaller
   * marshaller, that is used for XML generation
   *
   * @param output
   * stream, where the XML is written to
   *
   * @throws JAXBException
   * if an error occured during XML creation
   */
  public static void writeXml( RealtorContactDetails contact, Marshaller marshaller, OutputStream output ) throws JAXBException
  {
    final org.openestate.is24.restapi.xml.common.ObjectFactory factory =
      new org.openestate.is24.restapi.xml.common.ObjectFactory();

    marshaller.setEventHandler( new ValidationEventHandler()
    {
      @Override
      public boolean handleEvent( ValidationEvent ve )
      {
        return true;
      }
    });

    marshaller.marshal(
      factory.createRealtorContactDetail( contact ), output );
  }

  /**
   * Writes a {@link RealEstate} as XML into an {@link OutputStream}.
   * <p>
   * The provided object is wrapped into a {@link JAXBElement} before XML
   * creation in order to match the requirements of the schema.
   * <p>
   * This method makes sure, that validation errors do not break XML creation.
   * Invalid entries are not written into XML.
   *
   * @param realEstate
   * object to write
   *
   * @param output
   * stream, where the XML is written to
   *
   * @throws JAXBException
   * if an error occured during XML creation
   */
  public static void writeXml( RealEstate realEstate, OutputStream output ) throws JAXBException
  {
    writeXml( realEstate, DEFAULT_ENCODING, true, output );
  }

  /**
   * Writes a {@link RealEstate} as XML into an {@link OutputStream}.
   * <p>
   * The provided object is wrapped into a {@link JAXBElement} before XML
   * creation in order to match the requirements of the schema.
   * <p>
   * This method makes sure, that validation errors do not break XML creation.
   * Invalid entries are not written into XML.
   *
   * @param realEstate
   * object to write
   *
   * @param encoding
   * encoding of generated XML output
   *
   * @param output
   * stream, where the XML is written to
   *
   * @throws JAXBException
   * if an error occured during XML creation
   */
  public static void writeXml( RealEstate realEstate, String encoding, OutputStream output ) throws JAXBException
  {
    writeXml( realEstate, encoding, true, output );
  }

  /**
   * Writes a {@link RealEstate} as XML into an {@link OutputStream}.
   * <p>
   * The provided object is wrapped into a {@link JAXBElement} before XML
   * creation in order to match the requirements of the schema.
   * <p>
   * This method makes sure, that validation errors do not break XML creation.
   * Invalid entries are not written into XML.
   *
   * @param realEstate
   * object to write
   *
   * @param encoding
   * encoding of generated XML output
   *
   * @param prettyPrint
   * enable pretty printing for generated XML output
   *
   * @param output
   * stream, where the XML is written to
   *
   * @throws JAXBException
   * if an error occured during XML creation
   */
  public static void writeXml( RealEstate realEstate, String encoding, boolean prettyPrint, OutputStream output ) throws JAXBException
  {
    writeXml( realEstate, createMarshaller( encoding, prettyPrint ), output );
  }

  /**
   * Writes a {@link RealEstate} as XML into an {@link OutputStream}.
   * <p>
   * The provided object is wrapped into a {@link JAXBElement} before XML
   * creation in order to match the requirements of the schema.
   * <p>
   * This method makes sure, that validation errors do not break XML creation.
   * Invalid entries are not written into XML.
   *
   * @param realEstate
   * object to write
   *
   * @param marshaller
   * marshaller, that is used for XML generation
   *
   * @param output
   * stream, where the XML is written to
   *
   * @throws JAXBException
   * if an error occured during XML creation
   */
  public static void writeXml( RealEstate realEstate, Marshaller marshaller, OutputStream output ) throws JAXBException
  {
    final org.openestate.is24.restapi.xml.realestates.ObjectFactory factory =
      new org.openestate.is24.restapi.xml.realestates.ObjectFactory();

    marshaller.setEventHandler( new ValidationEventHandler()
    {
      @Override
      public boolean handleEvent( ValidationEvent ve )
      {
        return true;
      }
    });

    if (realEstate instanceof ApartmentBuy)
    {
      marshaller.marshal(
        factory.createApartmentBuy( (ApartmentBuy) realEstate ), output );
    }
    else if (realEstate instanceof ApartmentRent)
    {
      marshaller.marshal(
        factory.createApartmentRent( (ApartmentRent) realEstate ), output );
    }
    else if (realEstate instanceof AssistedLiving)
    {
      marshaller.marshal(
        factory.createAssistedLiving( (AssistedLiving) realEstate ), output );
    }
    else if (realEstate instanceof CompulsoryAuction)
    {
      marshaller.marshal(
        factory.createCompulsoryAuction( (CompulsoryAuction) realEstate ), output );
    }
    else if (realEstate instanceof FlatShareRoom)
    {
      marshaller.marshal(
        factory.createFlatShareRoom( (FlatShareRoom) realEstate ), output );
    }
    else if (realEstate instanceof GarageBuy)
    {
      marshaller.marshal(
        factory.createGarageBuy( (GarageBuy) realEstate ), output );
    }
    else if (realEstate instanceof GarageRent)
    {
      marshaller.marshal(
        factory.createGarageRent( (GarageRent) realEstate ), output );
    }
    else if (realEstate instanceof Gastronomy)
    {
      marshaller.marshal(
        factory.createGastronomy( (Gastronomy) realEstate ), output );
    }
    else if (realEstate instanceof HouseBuy)
    {
      marshaller.marshal(
        factory.createHouseBuy( (HouseBuy) realEstate ), output );
    }
    else if (realEstate instanceof HouseRent)
    {
      marshaller.marshal(
        factory.createHouseRent( (HouseRent) realEstate ), output );
    }
    else if (realEstate instanceof HouseType)
    {
      marshaller.marshal(
        factory.createHouseType( (HouseType) realEstate ), output );
    }
    else if (realEstate instanceof Industry)
    {
      marshaller.marshal(
        factory.createIndustry( (Industry) realEstate ), output );
    }
    else if (realEstate instanceof Investment)
    {
      marshaller.marshal(
        factory.createInvestment( (Investment) realEstate ), output );
    }
    else if (realEstate instanceof LivingBuySite)
    {
      marshaller.marshal(
        factory.createLivingBuySite( (LivingBuySite) realEstate ), output );
    }
    else if (realEstate instanceof LivingRentSite)
    {
      marshaller.marshal(
        factory.createLivingRentSite( (LivingRentSite) realEstate ), output );
    }
    else if (realEstate instanceof Office)
    {
      marshaller.marshal(
        factory.createOffice( (Office) realEstate ), output );
    }
    else if (realEstate instanceof SeniorCare)
    {
      marshaller.marshal(
        factory.createSeniorCare( (SeniorCare) realEstate ), output );
    }
    else if (realEstate instanceof ShortTermAccommodation)
    {
      marshaller.marshal(
        factory.createShortTermAccommodation( (ShortTermAccommodation) realEstate ), output );
    }
    else if (realEstate instanceof SpecialPurpose)
    {
      marshaller.marshal(
        factory.createSpecialPurpose( (SpecialPurpose) realEstate ), output );
    }
    else if (realEstate instanceof Store)
    {
      marshaller.marshal(
        factory.createStore( (Store) realEstate ), output );
    }
    else if (realEstate instanceof TradeSite)
    {
      marshaller.marshal(
        factory.createTradeSite( (TradeSite) realEstate ), output );
    }
    else
    {
      marshaller.marshal(
        factory.createRealEstate( realEstate ), output );
    }
  }
}