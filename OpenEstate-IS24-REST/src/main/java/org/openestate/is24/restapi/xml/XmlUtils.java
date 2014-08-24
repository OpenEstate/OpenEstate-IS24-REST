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

package org.openestate.is24.restapi.xml;

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
import java.text.NumberFormat;
import java.util.Locale;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.validator.routines.EmailValidator;
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
 *
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
    + ":org.openestate.is24.restapi.xml.videoupload"
    + ":org.openestate.is24.restapi.xml.zipandlocationtoregion";

  private XmlUtils()
  {
  }

  public static Marshaller createMarshaller() throws JAXBException
  {
    return createMarshaller( Charset.defaultCharset().name(), true );
  }

  public static Marshaller createMarshaller( String encoding, boolean prettyPrint ) throws JAXBException
  {
    Marshaller m = getContext().createMarshaller();
    m.setProperty( Marshaller.JAXB_ENCODING, encoding );
    m.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, prettyPrint );
    return m;
  }

  public static Unmarshaller createUnmarshaller() throws JAXBException
  {
    return getContext().createUnmarshaller();
  }

  public synchronized static JAXBContext getContext() throws JAXBException
  {
    if (JAXB==null) initContext( Thread.currentThread().getContextClassLoader() );
    return JAXB;
  }

  public synchronized static void initContext( ClassLoader classloader ) throws JAXBException
  {
    JAXB = JAXBContext.newInstance( JAXB_PACKAGES, classloader );
  }

  public static String marshal( Object object ) throws JAXBException, IOException
  {
    return marshal( object, DEFAULT_ENCODING, true );
  }

  public static String marshal( Object object, String encoding ) throws JAXBException, IOException
  {
    return marshal( object, encoding, true );
  }

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

  public static Color parseColor( String value )
  {
    String val = StringUtils.trimToNull( value );
    if (val==null) return null;
    if (val.startsWith( "#" )) val = val.substring( 1 );
    if (!val.startsWith( "0x" )) val = "0x" + val;
    return Color.decode( val );
  }

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

  public static Double parseDouble8_2( String value )
  {
    return parseDouble( value, 0d, 99999999d, 2 );
  }

  public static Double parseDouble13_2( String value )
  {
    return parseDouble( value, 0d, 9999999999999d, 2 );
  }

  public static Double parseDoublePositive( String value )
  {
    return parseDouble( value, 0.001d, null, 3 );
  }

  public static String parseEmail( String value )
  {
    String val = parseText( value, 5, 300 );
    if (val==null) return null;
    return (EmailValidator.getInstance().isValid( val ))? val: null;
  }

  public static Integer parseFlatShareSearchSize( String value )
  {
    return parseInteger( value, 2, 11 );
  }

  public static Integer parseFloorNr( String value )
  {
    return parseInteger( value, -1, null );
  }

  public static Integer parseGroupNr( String value )
  {
    return parseInteger( value, 0, 2147483647 );
  }

  private static Integer parseInteger( String value, Integer min, Integer max )
  {
    String val = StringUtils.trimToNull( value );
    return (val!=null && StringUtils.isNumeric( val ))?
      Integer.valueOf( val ): null;
  }

  public static Integer parseInteger9Positive( String value )
  {
    return parseInteger( value, 1, 9 );
  }

  public static Integer parseInteger99( String value )
  {
    return parseInteger( value, 0, 99 );
  }

  public static Integer parseInteger999( String value )
  {
    return parseInteger( value, 0, 999 );
  }

  public static Integer parseInteger9999( String value )
  {
    return parseInteger( value, 0, 9999 );
  }

  public static Integer parseInteger9999Positive( String value )
  {
    return parseInteger( value, 1, 9999 );
  }

  public static Integer parseInteger99999( String value )
  {
    return parseInteger( value, 0, 99999 );
  }

  /*public static Integer parseIntegerPositive( String value )
  {
    return parseInteger( value, 0, null );
  }*/

  public static Double parseLatitude( String value )
  {
    return parseDouble( value, -90d, 90d, 10 );
  }

  public static Double parseLongitude( String value )
  {
    return parseDouble( value, -180d, 180d, 10 );
  }

  public static String parseNonEmptyText( String value )
  {
    return parseText( value, 1, null );
  }

  public static String parsePassword( String value )
  {
    return parseText( value, 5, 40 );
  }

  public static String parsePhoneNumber( String value )
  {
    return StringUtils.trimToNull( value );
  }

  public static String parsePhoneNumberAreaCode( String value )
  {
    return StringUtils.trimToNull( value );
  }

  public static String parsePhoneNumberCountryCode( String value )
  {
    return StringUtils.trimToNull( value );
  }

  public static String parsePhoneNumberSubscriber( String value )
  {
    return StringUtils.trimToNull( value );
  }

  public static Double parsePriceMultiplier( String value )
  {
    return parseDouble( value, 0d, 99d, 1 );
  }

  public static Double parseRoomNr( String value )
  {
    return parseDouble( value, 0.5d, 9999d, 2 );
  }

  public static Double parseRoomNrForBaseHouse( String value )
  {
    return parseDouble( value, 0d, 999d, 2 );
  }

  private static String parseText( String value, Integer minLength, Integer maxLength )
  {
    return StringUtils.trimToNull( value );
  }

  public static String parseText16( String value )
  {
    return parseText( value, null, 16 );
  }

  public static String parseText30( String value )
  {
    return parseText( value, null, 30 );
  }

  public static String parseText50( String value )
  {
    return parseText( value, null, 50 );
  }

  public static String parseText100( String value )
  {
    return parseText( value, null, 100 );
  }

  /*public static String parseText500( String value )
  {
    return parseText( value, null, 500 );
  }*/

  public static String parseText1000( String value )
  {
    return parseText( value, null, 1000 );
  }

  public static String parseText1800( String value )
  {
    return parseText( value, null, 1800 );
  }

  public static String parseText2000( String value )
  {
    return parseText( value, null, 2000 );
  }

  public static Double parseThermalCharacteristic( String value )
  {
    return parseDouble( value, 0d, 1999d, 2 );
  }

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

  private static String printDouble( Double value, Double min, Double max, int precision )
  {
    if (value==null)
    {
      throw new IllegalArgumentException(
        "The provided double value " + value + " is invalid!" );
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

  public static String printDouble8_2( Double value )
  {
    return printDouble( value, 0d, 99999999d, 2 );
  }

  public static String printDouble13_2( Double value )
  {
    return printDouble( value, 0d, 9999999999999d, 2 );
  }

  public static String printDoublePositive( Double value )
  {
    return printDouble( value, 0.001d, null, 3 );
  }

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

  public static String printFlatShareSearchSize( Integer value )
  {
    return printInteger( value, 2, 11 );
  }

  public static String printFloorNr( Integer value )
  {
    return printInteger( value, -1, null );
  }

  public static String printGroupNr( Integer value )
  {
    return printInteger( value, 0, 2147483647 );
  }

  private static String printInteger( Integer value, Integer min, Integer max )
  {
    if (value==null)
    {
      throw new IllegalArgumentException(
        "The provided integer value " + value + " is invalid!" );
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

  public static String printInteger9Positive( Integer value )
  {
    return printInteger( value, 1, 9 );
  }

  public static String printInteger99( Integer value )
  {
    return printInteger( value, 0, 99 );
  }

  public static String printInteger999( Integer value )
  {
    return printInteger( value, 0, 999 );
  }

  public static String printInteger9999( Integer value )
  {
    return printInteger( value, 0, 9999 );
  }

  public static String printInteger9999Positive( Integer value )
  {
    return printInteger( value, 1, 9999 );
  }

  public static String printInteger99999( Integer value )
  {
    return printInteger( value, 0, 99999 );
  }

  /*public static String printIntegerPositive( Integer value )
  {
    return printInteger( value, 0, null );
  }*/

  public static String printLatitude( Double value )
  {
    return printDouble( value, -90d, 90d, 10 );
  }

  public static String printLongitude( Double value )
  {
    return printDouble( value, -180d, 180d, 10 );
  }

  public static String printNonEmptyText( String value )
  {
    return printText( value, 1, null );
  }

  public static String printPassword( String value )
  {
    return printText( value, 5, 40 );
  }

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

  public static String printPriceMultiplier( Double value )
  {
    return printDouble( value, 0d, 99d, 1 );
  }

  public static String printRoomNr( Double value )
  {
    return printDouble( value, 0.5d, 9999d, 2 );
  }

  public static String printRoomNrForBaseHouse( Double value )
  {
    return printDouble( value, 0d, 999d, 2 );
  }

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
    return (maxLength!=null)?
      StringUtils.abbreviate( val, maxLength.intValue() ): val;
  }

  public static String printText16( String value )
  {
    return printText( value, null, 16 );
  }

  public static String printText30( String value )
  {
    return printText( value, null, 30 );
  }

  public static String printText50( String value )
  {
    return printText( value, null, 50 );
  }

  public static String printText100( String value )
  {
    return printText( value, null, 100 );
  }

  /*public static String printText500( String value )
  {
    return printText( value, null, 500 );
  }*/

  public static String printText1000( String value )
  {
    return printText( value, null, 1000 );
  }

  public static String printText1800( String value )
  {
    return printText( value, null, 1800 );
  }

  public static String printText2000( String value )
  {
    return printText( value, null, 2000 );
  }

  public static String printThermalCharacteristic( Double value )
  {
    return printDouble( value, 0d, 1999d, 2 );
  }

  public static String printUrl( URL value )
  {
    if (value==null)
    {
      throw new IllegalArgumentException(
        "The provided URL '" + value + "' is invalid!" );
    }
    return value.toString();
  }

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

  public static void writeXml( Attachment attachment, OutputStream output ) throws JAXBException
  {
    writeXml( attachment, DEFAULT_ENCODING, true, output );
  }

  public static void writeXml( Attachment attachment, String encoding, OutputStream output ) throws JAXBException
  {
    writeXml( attachment, encoding, true, output );
  }

  public static void writeXml( Attachment attachment, String encoding, boolean prettyPrint, OutputStream output ) throws JAXBException
  {
    writeXml( attachment, createMarshaller( encoding, prettyPrint ), output );
  }

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

  public static void writeXml( PublishObject publishing, OutputStream output ) throws JAXBException
  {
    writeXml( publishing, DEFAULT_ENCODING, true, output );
  }

  public static void writeXml( PublishObject publishing, String encoding, OutputStream output ) throws JAXBException
  {
    writeXml( publishing, encoding, true, output );
  }

  public static void writeXml( PublishObject publishing, String encoding, boolean prettyPrint, OutputStream output ) throws JAXBException
  {
    writeXml( publishing, createMarshaller( encoding, prettyPrint ), output );
  }

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

  public static void writeXml( RealtorContactDetails contact, OutputStream output ) throws JAXBException
  {
    writeXml( contact, DEFAULT_ENCODING, true, output );
  }

  public static void writeXml( RealtorContactDetails contact, String encoding, OutputStream output ) throws JAXBException
  {
    writeXml( contact, encoding, true, output );
  }

  public static void writeXml( RealtorContactDetails contact, String encoding, boolean prettyPrint, OutputStream output ) throws JAXBException
  {
    writeXml( contact, createMarshaller( encoding, prettyPrint ), output );
  }

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

  public static void writeXml( RealEstate realEstate, OutputStream output ) throws JAXBException
  {
    writeXml( realEstate, DEFAULT_ENCODING, true, output );
  }

  public static void writeXml( RealEstate realEstate, String encoding, OutputStream output ) throws JAXBException
  {
    writeXml( realEstate, encoding, true, output );
  }

  public static void writeXml( RealEstate realEstate, String encoding, boolean prettyPrint, OutputStream output ) throws JAXBException
  {
    writeXml( realEstate, createMarshaller( encoding, prettyPrint ), output );
  }

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