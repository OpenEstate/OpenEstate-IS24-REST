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
package org.openestate.is24.restapi.utils;

import com.thedeanda.lorem.LoremIpsum;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.openestate.is24.restapi.xml.common.Address;
import org.openestate.is24.restapi.xml.common.AirConditioningType;
import org.openestate.is24.restapi.xml.common.ApartmentType;
import org.openestate.is24.restapi.xml.common.BalconyAvailableType;
import org.openestate.is24.restapi.xml.common.BuildingEnergyRatingType;
import org.openestate.is24.restapi.xml.common.BuildingType;
import org.openestate.is24.restapi.xml.common.CareLevelExpose;
import org.openestate.is24.restapi.xml.common.CareType;
import org.openestate.is24.restapi.xml.common.CommercializationType;
import org.openestate.is24.restapi.xml.common.CompulsoryAuctionType;
import org.openestate.is24.restapi.xml.common.ConstructionPhaseType;
import org.openestate.is24.restapi.xml.common.CountryCode;
import org.openestate.is24.restapi.xml.common.Currency;
import org.openestate.is24.restapi.xml.common.EnergyCertificateCreationDate;
import org.openestate.is24.restapi.xml.common.EnergyEfficiencyClass;
import org.openestate.is24.restapi.xml.common.EnergySourceEnev2014;
import org.openestate.is24.restapi.xml.common.EnergySourcesEnev2014;
import org.openestate.is24.restapi.xml.common.FacilityType;
import org.openestate.is24.restapi.xml.common.FlatMateGenderType;
import org.openestate.is24.restapi.xml.common.FlooringType;
import org.openestate.is24.restapi.xml.common.GarageType;
import org.openestate.is24.restapi.xml.common.GastronomyType;
import org.openestate.is24.restapi.xml.common.HeatingTypeEnev2014;
import org.openestate.is24.restapi.xml.common.HouseTypeBuildingType;
import org.openestate.is24.restapi.xml.common.HouseTypeConstructionMethodType;
import org.openestate.is24.restapi.xml.common.HouseTypeEnergyStandardType;
import org.openestate.is24.restapi.xml.common.HouseTypeStageOfCompletionType;
import org.openestate.is24.restapi.xml.common.IndustryType;
import org.openestate.is24.restapi.xml.common.InteriorQuality;
import org.openestate.is24.restapi.xml.common.InternetConnectionType;
import org.openestate.is24.restapi.xml.common.InvestmentType;
import org.openestate.is24.restapi.xml.common.ItInfrastructureType;
import org.openestate.is24.restapi.xml.common.LocationClassificationType;
import org.openestate.is24.restapi.xml.common.MarketingType;
import org.openestate.is24.restapi.xml.common.OfficeRentDuration;
import org.openestate.is24.restapi.xml.common.OfficeType;
import org.openestate.is24.restapi.xml.common.ParkingSituationType;
import org.openestate.is24.restapi.xml.common.ParkingSpaceType;
import org.openestate.is24.restapi.xml.common.PetsAllowedType;
import org.openestate.is24.restapi.xml.common.Price;
import org.openestate.is24.restapi.xml.common.PriceIntervalType;
import org.openestate.is24.restapi.xml.common.RealEstateCondition;
import org.openestate.is24.restapi.xml.common.RealEstateState;
import org.openestate.is24.restapi.xml.common.RealtorContactDetails;
import org.openestate.is24.restapi.xml.common.RoomType;
import org.openestate.is24.restapi.xml.common.SalutationType;
import org.openestate.is24.restapi.xml.common.ShortTermAccommodationType;
import org.openestate.is24.restapi.xml.common.SiteConstructibleType;
import org.openestate.is24.restapi.xml.common.SiteDevelopmentType;
import org.openestate.is24.restapi.xml.common.SiteRecommendedUseForTradeType;
import org.openestate.is24.restapi.xml.common.SiteRecommendedUseForTradeTypes;
import org.openestate.is24.restapi.xml.common.SiteRecommendedUseType;
import org.openestate.is24.restapi.xml.common.SiteRecommendedUseTypes;
import org.openestate.is24.restapi.xml.common.SmokingAllowedType;
import org.openestate.is24.restapi.xml.common.SpecialPurposeType;
import org.openestate.is24.restapi.xml.common.StoreType;
import org.openestate.is24.restapi.xml.common.SupplyType;
import org.openestate.is24.restapi.xml.common.TelephoneConnectionType;
import org.openestate.is24.restapi.xml.common.TvConnectionType;
import org.openestate.is24.restapi.xml.common.UtilizationTradeSite;
import org.openestate.is24.restapi.xml.common.Wgs84Address;
import org.openestate.is24.restapi.xml.common.YesNoNotApplicableType;
import org.openestate.is24.restapi.xml.common.YesNotApplicableType;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Factory for random real estate objects.
 * <p>
 * This class creates random real estate objects according, that match with the
 * specifications of the Webservice.
 *
 * @since 0.2
 * @author Andreas Rudolph <andy@openindex.de>
 */
public class RandomRealEstateFactory
{
  private final static Logger LOGGER = LoggerFactory.getLogger( RandomRealEstateFactory.class );
  private final static LoremIpsum LOREM = LoremIpsum.getInstance();
  private final org.openestate.is24.restapi.xml.common.ObjectFactory commonFactory =
    new org.openestate.is24.restapi.xml.common.ObjectFactory();
  private final org.openestate.is24.restapi.xml.realestates.ObjectFactory realEstatesFactory =
    new org.openestate.is24.restapi.xml.realestates.ObjectFactory();

  /**
   * Create a random {@link Address}.
   *
   * @return
   * randomly filled {@link Wgs84Address} object
   */
  public Address createRandomAddress()
  {
    Address address = commonFactory.createAddress();
    initAddress( address );
    return address;
  }

  /**
   * Create a {@link EnergySourcesEnev2014}, that contains random
   * {@link EnergySourceEnev2014} values.
   *
   * @return
   * randomly filled {@link EnergySourcesEnev2014} object
   */
  public EnergySourcesEnev2014 createRandomEnergySourcesEnev2014()
  {
    EnergySourcesEnev2014 output = commonFactory.createEnergySourcesEnev2014();
    ArrayList<EnergySourceEnev2014> pool = new ArrayList<EnergySourceEnev2014>();
    pool.addAll( Arrays.asList( EnergySourceEnev2014.values() ) );
    int limit = getRandomInt( pool.size() ) + 1;
    int i = 0;
    while (i<limit && !pool.isEmpty())
    {
      int pos = getRandomInt( pool.size() );
      EnergySourceEnev2014 source = pool.remove( pos );
      if (!EnergySourceEnev2014.NO_INFORMATION.equals( source ))
      {
        output.getEnergySourceEnev2014().add( source );
        i++;
      }
      pool.trimToSize();
    }
    return output;
  }

  /**
   * Create a random {@link RealtorContactDetails}.
   *
   * @return
   * randomly filled {@link RealtorContactDetails} object
   */
  public RealtorContactDetails createRandomContact()
  {
    RealtorContactDetails contact = commonFactory.createRealtorContactDetails();
    contact.setAdditionName( StringUtils.abbreviate( LOREM.getWords( 1, 5 ), 30 ) );
    contact.setAddress( createRandomAddress() );
    contact.setBusinessCardContact( false );
    contact.setCellPhoneNumber( "+49 160 123456" );
    contact.setCellPhoneNumberAreaCode( "0160" );
    contact.setCellPhoneNumberCountryCode( "+49" );
    contact.setCellPhoneNumberSubscriber( "123456" );
    contact.setCompany( StringUtils.abbreviate( LOREM.getWords( 1, 15 ), 100 ) );
    contact.setCountryCode( getRandomCountryCode() );
    contact.setDefaultContact( false );
    contact.setEmail( "test@test.org" );
    //contact.setExternalId( null );
    contact.setFaxNumber( "+49 30 123457" );
    contact.setFaxNumberAreaCode( "030" );
    contact.setFaxNumberCountryCode( "+49" );
    contact.setFaxNumberSubscriber( "123457" );
    contact.setFirstname( LOREM.getFirstName() );
    //contact.setId( null );
    contact.setLastname( LOREM.getLastName() );
    contact.setLocalPartnerContact( false );
    contact.setOfficeHours( StringUtils.abbreviate( LOREM.getWords( 1, 50 ), 1000 ) );
    contact.setPhoneNumber( "+49 30 123456" );
    contact.setPhoneNumberAreaCode( "030" );
    contact.setPhoneNumberCountryCode( "+49" );
    contact.setPhoneNumberSubscriber( "123456" );
    contact.setPosition( StringUtils.abbreviate( LOREM.getWords( 1, 15 ), 100 ) );
    //contact.setRealEstateReferenceCount( null );
    contact.setSalutation( getRandomSalutationType() );
    contact.setShowOnProfilePage( false );
    contact.setTitle( StringUtils.abbreviate( LOREM.getWords( 1, 3 ), 15 ) );

    try
    {
      contact.setHomepageUrl( new URL( "http://test.org" ) );
      contact.setPortraitUrl( new URL( "http://test.org/portrait.jpg" ) );
    }
    catch (MalformedURLException ex)
    {
      LOGGER.warn( "Can't write URL!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }

    return contact;
  }

  /**
   * Create a random {@link RealEstate} of a random {@link Type}.
   *
   * @return
   * randomly filled {@link RealEstate} object
   */
  public RealEstate createRandomObject()
  {
    return createRandomObject( null );
  }

  /**
   * Create a random {@link RealEstate} of a specific {@link Type}.
   *
   * @param type
   * type of the real estate object to create
   *
   * @return
   * randomly filled {@link RealEstate} object
   */
  public RealEstate createRandomObject( Type type )
  {
    if (type==null) type = getRandomObjectType();
    RealEstate realEstate = type.create();
    init( realEstate );
    return realEstate;
  }

  /**
   * Create a random {@link Wgs84Address}.
   *
   * @return
   * randomly filled {@link Wgs84Address} object
   */
  public Wgs84Address createRandomObjectAddress()
  {
    Wgs84Address address = commonFactory.createWgs84Address();
    initAddress( address );
    return address;
  }

  /**
   * Create a {@link SiteRecommendedUseForTradeTypes}, that contains random
   * {@link SiteRecommendedUseForTradeType} values.
   *
   * @return
   * randomly filled {@link SiteRecommendedUseForTradeTypes} object
   */
  public SiteRecommendedUseForTradeTypes createRandomSiteRecommendedUseForTradeTypes()
  {
    SiteRecommendedUseForTradeTypes output = commonFactory.createSiteRecommendedUseForTradeTypes();
    ArrayList<SiteRecommendedUseForTradeType> pool = new ArrayList<SiteRecommendedUseForTradeType>();
    pool.addAll( Arrays.asList( SiteRecommendedUseForTradeType.values() ) );
    int limit = getRandomInt( pool.size() ) + 1;
    int i = 0;
    while (i<limit && !pool.isEmpty())
    {
      int pos = getRandomInt( pool.size() );
      SiteRecommendedUseForTradeType use = pool.remove( pos );
      if (!SiteRecommendedUseForTradeType.NO_INFORMATION.equals( use ))
      {
        output.getSiteRecommendedUseForTradeType().add( use );
        i++;
      }
      pool.trimToSize();
    }
    return output;
  }

  /**
   * Create a {@link SiteRecommendedUseTypes}, that contains random
   * {@link SiteRecommendedUseType} values.
   *
   * @return
   * randomly filled {@link SiteRecommendedUseTypes} object
   */
  public SiteRecommendedUseTypes createRandomSiteRecommendedUseTypes()
  {
    SiteRecommendedUseTypes output = commonFactory.createSiteRecommendedUseTypes();
    ArrayList<SiteRecommendedUseType> pool = new ArrayList<SiteRecommendedUseType>();
    pool.addAll( Arrays.asList( SiteRecommendedUseType.values() ) );
    int limit = getRandomInt( pool.size() ) + 1;
    int i = 0;
    while (i<limit && !pool.isEmpty())
    {
      int pos = getRandomInt( pool.size() );
      SiteRecommendedUseType use = pool.remove( pos );
      if (!SiteRecommendedUseType.NO_INFORMATION.equals( use ))
      {
        output.getSiteRecommendedUseType().add( use );
        i++;
      }
      pool.trimToSize();
    }
    return output;
  }

  /**
   * Create the default {@link Price} for randomly created data.
   *
   * @return
   * default{@link Price} object
   */
  public Price getDefaultPrice()
  {
    Price price = commonFactory.createPrice();
    price.setCurrency( Currency.EUR );
    return price;
  }

  /**
   * Create a random {@link AirConditioningType} value.
   *
   * @return
   * random {@link AirConditioningType} value
   */
  public static AirConditioningType getRandomAirConditioningType()
  {
    return (AirConditioningType) getRandomValue( AirConditioningType.values() );
  }

  /**
   * Create a random {@link ApartmentType} value.
   *
   * @return
   * random {@link ApartmentType} value
   */
  public static ApartmentType getRandomApartmentType()
  {
    return (ApartmentType) getRandomValue( ApartmentType.values() );
  }

  /**
   * Create a random {@link BalconyAvailableType} value.
   *
   * @return
   * random {@link BalconyAvailableType} value
   */
  public static BalconyAvailableType getRandomBalconyAvailableType()
  {
    return (BalconyAvailableType) getRandomValue( BalconyAvailableType.values() );
  }

  /**
   * Create a random {@link Boolean} value.
   *
   * @return
   * random {@link Boolean} value
   */
  public static boolean getRandomBoolean()
  {
    return RandomUtils.nextInt( 0, 2 ) == 1;
  }

  /**
   * Create a random {@link BuildingType} value.
   *
   * @return
   * random {@link BuildingType} value
   */
  public static BuildingType getRandomBuildingType()
  {
    return (BuildingType) getRandomValue( BuildingType.values() );
  }

  /**
   * Create a random {@link Calendar} value between 1990 and 2015.
   *
   * @return
   * random {@link Calendar} value
   */
  public static Calendar getRandomCalendar()
  {
    return getRandomCalendar( 1990, 2015 );
  }

  /**
   * Create a random {@link Calendar} value in a specific timeframe.
   *
   * @param minYear
   * minimal calendar year
   *
   * @param maxYear
   * maximal calendar year
   *
   * @return
   * random {@link Calendar} value
   */
  public static Calendar getRandomCalendar( int minYear, int maxYear )
  {
    Calendar cal = Calendar.getInstance();
    cal.set( Calendar.YEAR, getRandomInt( minYear, maxYear) );
    cal.set( Calendar.DAY_OF_YEAR, getRandomInt( 1, 365 ) );
    cal.set( Calendar.HOUR_OF_DAY, getRandomInt( 24 ) );
    cal.set( Calendar.MINUTE, getRandomInt( 60 ) );
    cal.set( Calendar.SECOND, getRandomInt( 60 ) );
    cal.set( Calendar.MILLISECOND, getRandomInt( 1000 ) );
    return cal;
  }

  /**
   * Create a random {@link CareLevelExpose} value.
   *
   * @return
   * random {@link CareLevelExpose} value
   */
  public static CareLevelExpose getRandomCareLevel()
  {
    return (CareLevelExpose) getRandomValue( CareLevelExpose.values() );
  }

  /**
   * Create a random {@link CompulsoryAuctionType} value.
   *
   * @return
   * random {@link CompulsoryAuctionType} value
   */
  public static CompulsoryAuctionType getRandomCompulsoryAuctionType()
  {
    return (CompulsoryAuctionType) getRandomValue( CompulsoryAuctionType.values() );
  }

  /**
   * Create a random {@link ConstructionPhaseType} value.
   *
   * @return
   * random {@link ConstructionPhaseType} value
   */
  public static ConstructionPhaseType getRandomConstructionPhaseType()
  {
    return (ConstructionPhaseType) getRandomValue( ConstructionPhaseType.values() );
  }

  /**
   * Create a random {@link CountryCode} value.
   *
   * @return
   * random {@link CountryCode} value
   */
  public static CountryCode getRandomCountryCode()
  {
    return (CountryCode) getRandomValue( CountryCode.values() );
  }

  /**
   * Create a random {@link Date} value between 1990 and 2015.
   *
   * @return
   * random {@link Date} value
   */
  public static Date getRandomDate()
  {
    return getRandomCalendar().getTime();
  }

  /**
   * Create a random {@link Date} value in a specific timeframe.
   *
   * @param minYear
   * minimal calendar year
   *
   * @param maxYear
   * maximal calendar year
   *
   * @return
   * random {@link Date} value
   */
  public static Date getRandomDate( int minYear, int maxYear )
  {
    return getRandomCalendar( minYear, maxYear ).getTime();
  }

  /**
   * Create a random {@link BigDecimal} value with a specific maximum.
   *
   * @param max
   * maximum value
   *
   * @return
   * random {@link Double} value
   */
  public static BigDecimal getRandomDecimal( long max )
  {
    return getRandomDecimal( BigDecimal.ZERO, BigDecimal.valueOf( max ) );
  }

  /**
   * Create a random {@link BigDecimal} value with a specific maximum.
   *
   * @param max
   * maximum value
   *
   * @return
   * random {@link Double} value
   */
  public static BigDecimal getRandomDecimal( BigDecimal max )
  {
    return getRandomDecimal( BigDecimal.ZERO, max );
  }

  /**
   * Create a random {@link BigDecimal} value within a specific interval.
   *
   * @param min
   * minimum value
   *
   * @param max
   * maximum value
   *
   * @return
   * random {@link Double} value
   */
  public static BigDecimal getRandomDecimal( long min, long max )
  {
    return getRandomDecimal( BigDecimal.valueOf( min ), BigDecimal.valueOf( max ) );
  }

  /**
   * Create a random {@link BigDecimal} value within a specific interval.
   *
   * @param min
   * minimum value
   *
   * @param max
   * maximum value
   *
   * @return
   * random {@link Double} value
   */
  public static BigDecimal getRandomDecimal( BigDecimal min, BigDecimal max )
  {
    if (min.compareTo( max )==1)
    {
      throw new IllegalArgumentException(
        "Minimum value is bigger than maximum value!" );
    }
    if (min.compareTo( max )==0)
    {
      return min;
    }
    return BigDecimal.valueOf( RandomUtils.nextDouble( min.doubleValue(), max.doubleValue() ) );
  }

  /**
   * Create a random {@link EnergyEfficiencyClass} value.
   *
   * @return
   * random {@link EnergyEfficiencyClass} value
   */
  public static EnergyEfficiencyClass getRandomEnergyEfficiencyClass()
  {
    return (EnergyEfficiencyClass) getRandomValue( EnergyEfficiencyClass.values() );
  }

  /**
   * Create a random {@link FacilityType} value.
   *
   * @return
   * random {@link FacilityType} value
   */
  public static FacilityType getRandomFacilityType()
  {
    return (FacilityType) getRandomValue( FacilityType.values() );
  }

  /**
   * Create a random {@link FlatMateGenderType} value.
   *
   * @return
   * random {@link FlatMateGenderType} value
   */
  public static FlatMateGenderType getRandomFlatMateGenderType()
  {
    return (FlatMateGenderType) getRandomValue( FlatMateGenderType.values() );
  }

  /**
   * Create a random {@link FlooringType} value.
   *
   * @return
   * random {@link FlooringType} value
   */
  public static FlooringType getRandomFlooringType()
  {
    return (FlooringType) getRandomValue( FlooringType.values() );
  }

  /**
   * Create a random {@link GarageType} value.
   *
   * @return
   * random {@link GarageType} value
   */
  public static GarageType getRandomGarageType()
  {
    return (GarageType) getRandomValue( GarageType.values() );
  }

  /**
   * Create a random {@link GastronomyType} value.
   *
   * @return
   * random {@link GastronomyType} value
   */
  public static GastronomyType getRandomGastronomyType()
  {
    return (GastronomyType) getRandomValue( GastronomyType.values() );
  }

  /**
   * Create a random {@link HeatingTypeEnev2014} value.
   *
   * @return
   * random {@link HeatingTypeEnev2014} value
   */
  public static HeatingTypeEnev2014 getRandomHeatingTypeEnev2014()
  {
    return (HeatingTypeEnev2014) getRandomValue( HeatingTypeEnev2014.values() );
  }

  /**
   * Create a random {@link HouseTypeBuildingType} value.
   *
   * @return
   * random {@link HouseTypeBuildingType} value
   */
  public static HouseTypeBuildingType getRandomHouseTypeBuildingType()
  {
    return (HouseTypeBuildingType) getRandomValue( HouseTypeBuildingType.values() );
  }

  /**
   * Create a random {@link HouseTypeConstructionMethodType} value.
   *
   * @return
   * random {@link HouseTypeConstructionMethodType} value
   */
  public static HouseTypeConstructionMethodType getRandomHouseTypeConstructionMethodType()
  {
    return (HouseTypeConstructionMethodType) getRandomValue( HouseTypeConstructionMethodType.values() );
  }

  /**
   * Create a random {@link HouseTypeEnergyStandardType} value.
   *
   * @return
   * random {@link HouseTypeEnergyStandardType} value
   */
  public static HouseTypeEnergyStandardType getRandomHouseTypeEnergyStandardType()
  {
    return (HouseTypeEnergyStandardType) getRandomValue( HouseTypeEnergyStandardType.values() );
  }

  /**
   * Create a random {@link HouseTypeStageOfCompletionType} value.
   *
   * @return
   * random {@link HouseTypeStageOfCompletionType} value
   */
  public static HouseTypeStageOfCompletionType getRandomHouseTypeStageOfCompletionType()
  {
    return (HouseTypeStageOfCompletionType) getRandomValue( HouseTypeStageOfCompletionType.values() );
  }

  /**
   * Create a random {@link IndustryType} value.
   *
   * @return
   * random {@link IndustryType} value
   */
  public static IndustryType getRandomIndustryType()
  {
    return (IndustryType) getRandomValue( IndustryType.values() );
  }

  /**
   * Create a random {@link Integer} value with a specific maximum.
   *
   * @param max
   * maximum value
   *
   * @return
   * random {@link Integer} value
   */
  public static int getRandomInt( int max )
  {
    return getRandomInt( 0, max );
  }

  /**
   * Create a random {@link Integer} value within a specific interval.
   *
   * @param min
   * minimum value
   *
   * @param max
   * maximum value
   *
   * @return
   * random {@link Double} value
   */
  public static int getRandomInt( int min, int max )
  {
    if (min>max)
    {
      throw new IllegalArgumentException(
        "Minimum value is bigger than maximum value!" );
    }
    if (min==max)
    {
      return min;
    }
    return RandomUtils.nextInt( min, max );
  }

  /**
   * Create a random {@link Long} value with a specific maximum.
   *
   * @param max
   * maximum value
   *
   * @return
   * random {@link Integer} value
   */
  public static long getRandomLong( long max )
  {
    return getRandomLong( 0, max );
  }

  /**
   * Create a random {@link Long} value within a specific interval.
   *
   * @param min
   * minimum value
   *
   * @param max
   * maximum value
   *
   * @return
   * random {@link Double} value
   */
  public static long getRandomLong( long min, long max )
  {
    if (min>max)
    {
      throw new IllegalArgumentException(
        "Minimum value is bigger than maximum value!" );
    }
    if (min==max)
    {
      return min;
    }
    return RandomUtils.nextLong( min, max );
  }

  /**
   * Create a random {@link InteriorQuality} value.
   *
   * @return
   * random {@link InteriorQuality} value
   */
  public static InteriorQuality getRandomInteriorQuality()
  {
    return (InteriorQuality) getRandomValue( InteriorQuality.values() );
  }

  /**
   * Create a random {@link InternetConnectionType} value.
   *
   * @return
   * random {@link InternetConnectionType} value
   */
  public static InternetConnectionType getRandomInternetConnectionType()
  {
    return (InternetConnectionType) getRandomValue( InternetConnectionType.values() );
  }

  /**
   * Create a random {@link InvestmentType} value.
   *
   * @return
   * random {@link InvestmentType} value
   */
  public static InvestmentType getRandomInvestmentType()
  {
    return (InvestmentType) getRandomValue( InvestmentType.values() );
  }

  /**
   * Create a random {@link ItInfrastructureType} value.
   *
   * @return
   * random {@link ItInfrastructureType} value
   */
  public static ItInfrastructureType getRandomItInfrastructureType()
  {
    return (ItInfrastructureType) getRandomValue( ItInfrastructureType.values() );
  }

  /**
   * Create a random {@link LocationClassificationType} value.
   *
   * @return
   * random {@link LocationClassificationType} value
   */
  public static LocationClassificationType getRandomLocationClassificationType()
  {
    return (LocationClassificationType) getRandomValue( LocationClassificationType.values() );
  }

  /**
   * Create a random {@link Type} value.
   *
   * @return
   * random {@link Type} value
   */
  public static Type getRandomObjectType()
  {
    return (Type) getRandomValue( Type.values() );
  }

  /**
   * Create a random {@link OfficeType} value.
   *
   * @return
   * random {@link OfficeType} value
   */
  public static OfficeType getRandomOfficeType()
  {
    return (OfficeType) getRandomValue( OfficeType.values() );
  }

  /**
   * Create a random {@link ParkingSituationType} value.
   *
   * @return
   * random {@link ParkingSituationType} value
   */
  public static ParkingSituationType getRandomParkingSituationType()
  {
    return (ParkingSituationType) getRandomValue( ParkingSituationType.values() );
  }

  /**
   * Create a random {@link ParkingSpaceType} value.
   *
   * @return
   * random {@link ParkingSpaceType} value
   */
  public static ParkingSpaceType getRandomParkingSpaceType()
  {
    return (ParkingSpaceType) getRandomValue( ParkingSpaceType.values() );
  }

  /**
   * Create a random {@link PetsAllowedType} value.
   *
   * @return
   * random {@link PetsAllowedType} value
   */
  public static PetsAllowedType getRandomPetsAllowedType()
  {
    return (PetsAllowedType) getRandomValue( PetsAllowedType.values() );
  }

  /**
   * Create a random {@link RealEstateCondition} value.
   *
   * @return
   * random {@link RealEstateCondition} value
   */
  public static RealEstateCondition getRandomRealEstateCondition()
  {
    return (RealEstateCondition) getRandomValue( RealEstateCondition.values() );
  }

  /**
   * Create a random {@link SalutationType} value.
   *
   * @return
   * random {@link SalutationType} value
   */
  public static SalutationType getRandomSalutationType()
  {
    return (SalutationType) getRandomValue( SalutationType.values() );
  }

  /**
   * Create a random {@link RoomType} value.
   *
   * @return
   * random {@link RoomType} value
   */
  public static RoomType getRandomRoomType()
  {
    return (RoomType) getRandomValue( RoomType.values() );
  }

  /**
   * Create a random {@link ShortTermAccommodationType} value.
   *
   * @return
   * random {@link ShortTermAccommodationType} value
   */
  public static ShortTermAccommodationType getRandomShortTermAccommodationType()
  {
    return (ShortTermAccommodationType) getRandomValue( ShortTermAccommodationType.values() );
  }

  /**
   * Create a random {@link SiteConstructibleType} value.
   *
   * @return
   * random {@link SiteConstructibleType} value
   */
  public static SiteConstructibleType getRandomSiteConstructibleType()
  {
    return (SiteConstructibleType) getRandomValue( SiteConstructibleType.values() );
  }

  /**
   * Create a random {@link SiteDevelopmentType} value.
   *
   * @return
   * random {@link SiteDevelopmentType} value
   */
  public static SiteDevelopmentType getRandomSiteDevelopmentType()
  {
    return (SiteDevelopmentType) getRandomValue( SiteDevelopmentType.values() );
  }

  /**
   * Create a random {@link SmokingAllowedType} value.
   *
   * @return
   * random {@link SmokingAllowedType} value
   */
  public static SmokingAllowedType getRandomSmokingAllowedType()
  {
    return (SmokingAllowedType) getRandomValue( SmokingAllowedType.values() );
  }

  /**
   * Create a random {@link SpecialPurposeType} value.
   *
   * @return
   * random {@link SpecialPurposeType} value
   */
  public static SpecialPurposeType getRandomSpecialPurposeType()
  {
    return (SpecialPurposeType) getRandomValue( SpecialPurposeType.values() );
  }

  /**
   * Create a random {@link StoreType} value.
   *
   * @return
   * random {@link StoreType} value
   */
  public static StoreType getRandomStoreType()
  {
    return (StoreType) getRandomValue( StoreType.values() );
  }

  /**
   * Create a random {@link SupplyType} value.
   *
   * @return
   * random {@link SupplyType} value
   */
  public static SupplyType getRandomSupplyType()
  {
    return (SupplyType) getRandomValue( SupplyType.values() );
  }

  /**
   * Create a random {@link TelephoneConnectionType} value.
   *
   * @return
   * random {@link TelephoneConnectionType} value
   */
  public static TelephoneConnectionType getRandomTelephoneConnectionType()
  {
    return (TelephoneConnectionType) getRandomValue( TelephoneConnectionType.values() );
  }

  /**
   * Create a random {@link TvConnectionType} value.
   *
   * @return
   * random {@link TvConnectionType} value
   */
  public static TvConnectionType getRandomTvConnectionType()
  {
    return (TvConnectionType) getRandomValue( TvConnectionType.values() );
  }

  /**
   * Create a random {@link UtilizationTradeSite} value.
   *
   * @return
   * random {@link UtilizationTradeSite} value
   */
  public static UtilizationTradeSite getRandomUtilizationTradeSite()
  {
    return (UtilizationTradeSite) getRandomValue( UtilizationTradeSite.values() );
  }

  /**
   * Create a random {@link YesNoNotApplicableType} value without
   * {@link YesNoNotApplicableType#NOT_APPLICABLE}.
   *
   * @return
   * random {@link YesNoNotApplicableType} value
   */
  public static YesNoNotApplicableType getRandomYesNo()
  {
    return (getRandomBoolean())?
      YesNoNotApplicableType.YES: YesNoNotApplicableType.NO;
  }

  /**
   * Create a random {@link YesNoNotApplicableType} value.
   *
   * @return
   * random {@link YesNoNotApplicableType} value
   */
  public static YesNoNotApplicableType getRandomYesNoNotApplicableType()
  {
    return (YesNoNotApplicableType) getRandomValue( YesNoNotApplicableType.values() );
  }

  /**
   * Create a random {@link YesNotApplicableType} value.
   *
   * @return
   * random {@link YesNotApplicableType} value
   */
  public static YesNotApplicableType getRandomYesNotApplicableType()
  {
    return (YesNotApplicableType) getRandomValue( YesNotApplicableType.values() );
  }

  /**
   * Return a random value from an array of values.
   *
   * @param values
   * array of values to lookup
   *
   * @return
   * one of the provided values
   */
  public static Object getRandomValue( Object[] values )
  {
    return (!ArrayUtils.isEmpty( values ))?
      values[RandomUtils.nextInt( 0, values.length )]: null;
  }

  /**
   * Initialize a {@link RealEstate} object with random values.
   *
   * @param realEstate
   * object to initialize
   */
  public void init( RealEstate realEstate )
  {
    realEstate.setAddress( createRandomObjectAddress() );
    //realEstate.setApiSearchData( value );
    //realEstate.setAttachments( value );
    //realEstate.setCreationDate( value );
    realEstate.setDescriptionNote( StringUtils.abbreviate( LOREM.getParagraphs( 2, 10 ), 2000 ) );
    realEstate.setExternalId( String.valueOf( getRandomInt( 1000 ) ) );
    realEstate.setFurnishingNote( StringUtils.abbreviate( LOREM.getParagraphs( 2, 10 ), 2000 ) );
    realEstate.setGroupNumber( getRandomInt( 100 ) );
    //realEstate.setId( value );
    realEstate.setLastModificationDate( Calendar.getInstance() );
    realEstate.setLocationNote( StringUtils.abbreviate( LOREM.getParagraphs( 2, 10 ), 2000 ) );
    realEstate.setOtherNote( StringUtils.abbreviate( LOREM.getParagraphs( 2, 10 ), 2000 ) );
    //realEstate.setPublishChannels( value );
    //realEstate.setRealEstateProjectId( value );
    realEstate.setRealEstateState( RealEstateState.ACTIVE );
    //realEstate.setReferencePriceApiCall( value );
    //realEstate.setReferencePriceServiceCall( value );
    realEstate.setShowAddress( getRandomBoolean() );
    realEstate.setTitle( StringUtils.abbreviate( LOREM.getTitle( 3, 15 ), 100 ) );

    realEstate.setContact( realEstatesFactory.createRealEstateContact() );
    realEstate.getContact().setExternalId( String.valueOf( getRandomInt( 1000 ) ) );

    if (realEstate instanceof ApartmentBuy)
      initRealEstate( (ApartmentBuy) realEstate );
    else if (realEstate instanceof ApartmentRent)
      initRealEstate( (ApartmentRent) realEstate );
    else if (realEstate instanceof AssistedLiving)
      initRealEstate( (AssistedLiving) realEstate );
    else if (realEstate instanceof CompulsoryAuction)
      initRealEstate( (CompulsoryAuction) realEstate );
    else if (realEstate instanceof FlatShareRoom)
      initRealEstate( (FlatShareRoom) realEstate );
    else if (realEstate instanceof GarageBuy)
      initRealEstate( (GarageBuy) realEstate );
    else if (realEstate instanceof GarageRent)
      initRealEstate( (GarageRent) realEstate );
    else if (realEstate instanceof Gastronomy)
      initRealEstate( (Gastronomy) realEstate );
    else if (realEstate instanceof HouseBuy)
      initRealEstate( (HouseBuy) realEstate );
    else if (realEstate instanceof HouseRent)
      initRealEstate( (HouseRent) realEstate );
    else if (realEstate instanceof HouseType)
      initRealEstate( (HouseType) realEstate );
    else if (realEstate instanceof Industry)
      initRealEstate( (Industry) realEstate );
    else if (realEstate instanceof Investment)
      initRealEstate( (Investment) realEstate );
    else if (realEstate instanceof LivingBuySite)
      initRealEstate( (LivingBuySite) realEstate );
    else if (realEstate instanceof LivingRentSite)
      initRealEstate( (LivingRentSite) realEstate );
    else if (realEstate instanceof Office)
      initRealEstate( (Office) realEstate );
    else if (realEstate instanceof SeniorCare)
      initRealEstate( (SeniorCare) realEstate );
    else if (realEstate instanceof ShortTermAccommodation)
      initRealEstate( (ShortTermAccommodation) realEstate );
    else if (realEstate instanceof SpecialPurpose)
      initRealEstate( (SpecialPurpose) realEstate );
    else if (realEstate instanceof Store)
      initRealEstate( (Store) realEstate );
    else if (realEstate instanceof TradeSite)
      initRealEstate( (TradeSite) realEstate );
  }

  /**
   * Initialize an {@link Address} object with random values.
   *
   * @param address
   * object to initialize
   */
  protected void initAddress( Address address )
  {
    address.setCity( "Berlin" );
    address.setHouseNumber( String.valueOf( getRandomInt( 1, 1000 ) ) );
    //address.setInternationalCountryRegion( value );
    address.setPostcode( "13125" );
    address.setStreet( "Beispielstraße" );
  }

  /**
   * Initialize an {@link Wgs84Address} object with random values.
   *
   * @param address
   * object to initialize
   */
  protected void initAddress( Wgs84Address address )
  {
    initAddress( (Address) address );

    address.setPreciseHouseNumber( getRandomBoolean() );
    address.setQuarter( LOREM.getWords( 1, 3 ) );

    address.setDescription( commonFactory.createWgs84AddressDescription() );
    address.getDescription().setText( StringUtils.abbreviate( LOREM.getWords( 1, 15 ), 1000 ) );

    //address.setGeoHierarchy( commonFactory.createGeoHierarchy() );
    //address.getGeoHierarchy().setCity( value );
    //address.getGeoHierarchy().setContinent( value );
    //address.getGeoHierarchy().setCountry( value );
    //address.getGeoHierarchy().setNeighbourhood( value );
    //address.getGeoHierarchy().setQuarter( value );
    //address.getGeoHierarchy().setRegion( value );

    //address.setWgs84Coordinate( commonFactory.createWgs84Coordinate() );
    //address.getWgs84Coordinate().setLatitude( value );
    //address.getWgs84Coordinate().setLongitude( value );
  }

  /**
   * Initialize an {@link ApartmentBuy} object with random values.
   *
   * @param realEstate
   * object to initialize
   */
  protected void initRealEstate( ApartmentBuy realEstate )
  {
    realEstate.setApartmentType( getRandomApartmentType() );
    realEstate.setBalcony( getRandomBoolean() );
    realEstate.setBuiltInKitchen( getRandomBoolean() );
    realEstate.setCellar( getRandomYesNotApplicableType() );
    realEstate.setCertificateOfEligibilityNeeded( getRandomBoolean() );
    realEstate.setCondition( getRandomRealEstateCondition() );
    realEstate.setEnergySourcesEnev2014( createRandomEnergySourcesEnev2014() );
    realEstate.setFloor( getRandomInt( 5 ) );
    realEstate.setFreeFrom( StringUtils.abbreviate( LOREM.getWords( 1, 10 ), 50 ) );
    realEstate.setGarden( getRandomBoolean() );
    realEstate.setGuestToilet( getRandomYesNotApplicableType() );
    realEstate.setHandicappedAccessible( getRandomYesNotApplicableType() );
    realEstate.setHeatingTypeEnev2014( getRandomHeatingTypeEnev2014() );
    realEstate.setInteriorQuality( getRandomInteriorQuality() );
    realEstate.setLastRefurbishment( getRandomInt( 1990, 2014 ) );
    realEstate.setLift( getRandomBoolean() );
    realEstate.setListed( getRandomYesNotApplicableType() );
    realEstate.setLivingSpace( getRandomDecimal( 20, 300 ) );
    realEstate.setNumberOfBathRooms( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfBedRooms( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfFloors( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfParkingSpaces( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfRooms( getRandomDecimal( 1, 10 ) );
    realEstate.setParkingSpacePrice( getRandomDecimal( 30, 300 ) );
    realEstate.setParkingSpaceType( getRandomParkingSpaceType() );
    realEstate.setRentalIncome( getRandomDecimal( 9999, 9999999 ) );
    realEstate.setRented( getRandomYesNotApplicableType() );
    realEstate.setServiceCharge( getRandomDecimal( 50, 500 ) );
    realEstate.setSummerResidencePractical( getRandomYesNotApplicableType() );
    realEstate.setUsableFloorSpace( getRandomDecimal( 20, 300 ) );

    // construction year
    if (getRandomBoolean())
    {
      realEstate.setConstructionYear( null );
      realEstate.setConstructionYearUnknown( true );
    }
    else
    {
      realEstate.setConstructionYear( getRandomInt( 1900, 1960 ) );
    }

    // courtage
    realEstate.setCourtage( commonFactory.createCourtageInfo() );
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( LOREM.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( LOREM.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.getCourtage().setHasCourtage( YesNoNotApplicableType.YES );

    // energy certificate for habitation
    realEstate.setEnergyPerformanceCertificate( true );
    realEstate.setEnergyCertificate( commonFactory.createEnergyPerformanceCertificate() );

    // energy certificate for habitation by consumption
    if (getRandomBoolean())
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_CONSUMPTION );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setEnergyConsumptionContainsWarmWater( getRandomYesNotApplicableType() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
    }

    // energy certificate for habitation by demand
    else
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_REQUIRED );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
    }

    // pricing
    realEstate.setPrice( getDefaultPrice() );
    realEstate.getPrice().setMarketingType( MarketingType.PURCHASE );
    realEstate.getPrice().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
    realEstate.getPrice().setValue( getRandomDecimal( 10000, 9999999 ) );
  }

  /**
   * Initialize an {@link ApartmentRent} object with random values.
   *
   * @param realEstate
   * object to initialize
   */
  protected void initRealEstate( ApartmentRent realEstate )
  {
    realEstate.setApartmentType( getRandomApartmentType() );
    realEstate.setBalcony( getRandomBoolean() );
    realEstate.setBaseRent( getRandomDecimal( 200, 2500 ) );
    realEstate.setBuiltInKitchen( getRandomBoolean() );
    realEstate.setCellar( getRandomYesNotApplicableType() );
    realEstate.setCertificateOfEligibilityNeeded( getRandomBoolean() );
    realEstate.setCondition( getRandomRealEstateCondition() );
    realEstate.setDeposit( StringUtils.abbreviate( LOREM.getWords( 1, 10 ), 50 ) );
    realEstate.setEnergySourcesEnev2014( createRandomEnergySourcesEnev2014() );
    realEstate.setFloor( getRandomInt( 5 ) );
    realEstate.setFreeFrom( StringUtils.abbreviate( LOREM.getWords( 1, 10 ), 50 ) );
    realEstate.setGarden( getRandomBoolean() );
    realEstate.setGuestToilet( getRandomYesNotApplicableType() );
    realEstate.setHandicappedAccessible( getRandomYesNotApplicableType() );
    realEstate.setHeatingCosts( getRandomDecimal( 100, 500 ) );
    realEstate.setHeatingCostsInServiceCharge( getRandomYesNo() );
    realEstate.setHeatingTypeEnev2014( getRandomHeatingTypeEnev2014() );
    realEstate.setInteriorQuality( getRandomInteriorQuality() );
    realEstate.setLastRefurbishment( getRandomInt( 1990, 2014 ) );
    realEstate.setLift( getRandomBoolean() );
    realEstate.setLivingSpace( getRandomDecimal( 20, 300 ) );
    realEstate.setNumberOfBathRooms( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfBedRooms( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfFloors( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfParkingSpaces( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfRooms( getRandomDecimal( 1, 10 ) );
    realEstate.setParkingSpacePrice( getRandomDecimal( 30, 300 ) );
    realEstate.setParkingSpaceType( getRandomParkingSpaceType() );
    realEstate.setPetsAllowed( getRandomPetsAllowedType() );
    realEstate.setServiceCharge( getRandomDecimal( 50, 500 ) );
    realEstate.setTotalRent( getRandomDecimal( 500, 3000 ) );
    realEstate.setUsableFloorSpace( getRandomDecimal( 20, 300 ) );
    realEstate.setUseAsFlatshareRoom( getRandomYesNotApplicableType() );

    // construction year
    if (getRandomBoolean())
    {
      realEstate.setConstructionYear( null );
      realEstate.setConstructionYearUnknown( true );
    }
    else
    {
      realEstate.setConstructionYear( getRandomInt( 1900, 1980 ) );
    }

    // courtage
    realEstate.setCourtage( commonFactory.createCourtageInfo() );
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( LOREM.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( LOREM.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.getCourtage().setHasCourtage( YesNoNotApplicableType.YES );

    // energy certificate for habitation
    realEstate.setEnergyPerformanceCertificate( true );
    realEstate.setEnergyCertificate( commonFactory.createEnergyPerformanceCertificate() );

    // energy certificate for habitation by consumption
    if (getRandomBoolean())
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_CONSUMPTION );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setEnergyConsumptionContainsWarmWater( getRandomYesNotApplicableType() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
    }

    // energy certificate for habitation by demand
    else
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_REQUIRED );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
    }

    // pricing
    realEstate.setPrice( getDefaultPrice() );
    realEstate.getPrice().setMarketingType( MarketingType.RENT );
    realEstate.getPrice().setPriceIntervalType( PriceIntervalType.MONTH );
    realEstate.getPrice().setValue( getRandomDecimal( 200, 9999 ) );
  }

  /**
   * Initialize an {@link AssistedLiving} object with random values.
   *
   * @param realEstate
   * object to initialize
   */
  protected void initRealEstate( AssistedLiving realEstate )
  {
    realEstate.setAmbulantNursingServiceAvailable( getRandomYesNotApplicableType() );
    realEstate.setBalconyAvailable( getRandomBalconyAvailableType() );
    realEstate.setBarrierFree( getRandomYesNotApplicableType() );
    realEstate.setBranchEntry( getRandomBoolean() );
    realEstate.setCleaningServiceAvailable( getRandomYesNotApplicableType() );
    realEstate.setCommonRoomsAvailable( getRandomYesNotApplicableType() );
    realEstate.setCookingFacilitiesAvailable( getRandomYesNotApplicableType() );
    realEstate.setCounselingAvailable( getRandomYesNotApplicableType() );
    realEstate.setCulturalProgramAvailable( getRandomYesNotApplicableType() );
    realEstate.setEmergencyCallInRoomAvailable( getRandomYesNotApplicableType() );
    realEstate.setEnergySourcesEnev2014( createRandomEnergySourcesEnev2014() );
    realEstate.setFacilityType( getRandomFacilityType() );
    realEstate.setFitnessAvailable( getRandomYesNotApplicableType() );
    realEstate.setGardenAvailable( getRandomYesNotApplicableType() );
    realEstate.setGuestApartmentsAvailable( getRandomYesNotApplicableType() );
    realEstate.setHandicappedAccessible( getRandomYesNotApplicableType() );
    realEstate.setHeatingTypeEnev2014( getRandomHeatingTypeEnev2014() );
    realEstate.setHomeHelpAvailable( getRandomYesNotApplicableType() );
    realEstate.setLeisureActivitiesAvailable( getRandomYesNotApplicableType() );
    realEstate.setLivingSpaceFrom( getRandomDecimal( 20, 50 ) );
    realEstate.setLivingSpaceTo( getRandomDecimal( 50, 150 ) );
    realEstate.setLoansAvailable( getRandomYesNotApplicableType() );
    realEstate.setMedicalAssistanceAvailable( getRandomYesNotApplicableType() );
    realEstate.setNumberOfLookedAfterApartments( getRandomLong( 1, 10 ) );
    realEstate.setNumberOfNursingPlaces( getRandomLong( 1, 10 ) );
    realEstate.setNumberOfRoomsFrom( getRandomDecimal( 1, 2 ) );
    realEstate.setNumberOfRoomsTo( getRandomDecimal( 3, 5 ) );
    realEstate.setOwnFurniturePossible( getRandomYesNotApplicableType() );
    realEstate.setParkingAvailable( getRandomYesNotApplicableType() );
    realEstate.setPetsAllowed( getRandomPetsAllowedType() );
    realEstate.setPoolAvailable( getRandomYesNotApplicableType() );
    realEstate.setPublicTransportationAvailable( getRandomYesNotApplicableType() );
    realEstate.setReceptionManned( getRandomYesNotApplicableType() );
    realEstate.setReligiousOfferingsAvailable( getRandomYesNotApplicableType() );
    realEstate.setRestaurantAvailable( getRandomYesNotApplicableType() );
    realEstate.setSecurity24Hours( getRandomYesNotApplicableType() );
    realEstate.setShoppingFacilitiesAvailable( getRandomYesNotApplicableType() );
    realEstate.setShortDescription( StringUtils.abbreviate( LOREM.getWords( 3, 15 ), 200 ) );
    realEstate.setTrialLivingPossible( getRandomYesNotApplicableType() );

    // construction year
    if (getRandomBoolean())
    {
      realEstate.setConstructionYear( null );
      realEstate.setConstructionYearUnknown( true );
    }
    else
    {
      realEstate.setConstructionYear( getRandomLong( 1900, 1980 ) );
    }

    // energy certificate for habitation
    realEstate.setEnergyCertificate( commonFactory.createEnergyPerformanceCertificate() );

    // energy certificate for habitation by consumption
    if (getRandomBoolean())
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_CONSUMPTION );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setEnergyConsumptionContainsWarmWater( getRandomYesNotApplicableType() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
    }

    // energy certificate for habitation by demand
    else
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_REQUIRED );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
    }

    // pricing for rent
    if (getRandomBoolean())
    {
      realEstate.setMarketingType( MarketingType.RENT );
      realEstate.setMinBaseRent( getDefaultPrice() );
      realEstate.getMinBaseRent().setMarketingType( MarketingType.RENT );
      realEstate.getMinBaseRent().setPriceIntervalType( PriceIntervalType.MONTH );
      realEstate.getMinBaseRent().setValue( getRandomDecimal( 500, 5000 ) );
    }

    // pricing for purchase
    else
    {
      realEstate.setMarketingType( MarketingType.PURCHASE );
      realEstate.setMinPurchasePrice( getDefaultPrice() );
      realEstate.getMinPurchasePrice().setMarketingType( MarketingType.PURCHASE );
      realEstate.getMinPurchasePrice().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
      realEstate.getMinPurchasePrice().setValue( getRandomDecimal( 50000, 999999 ) );
    }
  }

  /**
   * Initialize a {@link CompulsoryAuction} object with random values.
   *
   * @param realEstate
   * object to initialize
   */
  protected void initRealEstate( CompulsoryAuction realEstate )
  {
    realEstate.setArea( getRandomDecimal( 50, 500 ) );
    realEstate.setAuctionObjectType( getRandomCompulsoryAuctionType() );
    realEstate.setCancellationDate( getRandomCalendar() );
    realEstate.setDateOfAuction( getRandomCalendar() );
    realEstate.setEnergySourcesEnev2014( createRandomEnergySourcesEnev2014() );
    realEstate.setFileReferenceAtCountyCourt( RandomStringUtils.randomAlphanumeric( 8 ) );
    realEstate.setHeatingTypeEnev2014( getRandomHeatingTypeEnev2014() );
    realEstate.setLastChangeDate( getRandomCalendar() );
    realEstate.setNumberOfFolio( String.valueOf( getRandomInt( 1, 10 ) ) );
    realEstate.setOwner( LOREM.getName() );
    realEstate.setRecordationDate( getRandomCalendar() );
    realEstate.setRecurrenceAppointment( getRandomBoolean() );
    realEstate.setSplittingAuction( getRandomBoolean() );

    // construction year
    if (getRandomBoolean())
    {
      realEstate.setConstructionYear( null );
      realEstate.setConstructionYearUnknown( true );
    }
    else
    {
      realEstate.setConstructionYear( getRandomInt( 1900, 1980 ) );
    }

    // country court
    realEstate.setCountyCourt( commonFactory.createCountyCourt() );
    realEstate.getCountyCourt().setCourtNumber( RandomStringUtils.randomNumeric( 5 ) );
    realEstate.getCountyCourt().setName( LOREM.getWords( 3 ) );

    // energy certificate for habitation and business
    realEstate.setEnergyCertificate( commonFactory.createEnergyPerformanceCertificate() );

    // energy certificate for habitation and business by consumption
    if (getRandomBoolean())
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_CONSUMPTION );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.getEnergyCertificate().setElectricityConsumption( getRandomDecimal( 10, 250 ) );
        realEstate.getEnergyCertificate().setHeatingConsumption( getRandomDecimal( 10, 250 ) );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
        realEstate.setEnergyConsumptionContainsWarmWater( getRandomYesNotApplicableType() );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyConsumptionElectricity( getRandomDecimal( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyConsumptionHeating( getRandomDecimal( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
    }

    // energy certificate for habitation and business by demand
    else
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_REQUIRED );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setThermalCharacteristicElectricity( getRandomDecimal( 10, 250 ) );
        realEstate.getEnergyCertificate().setThermalCharacteristicHeating( getRandomDecimal( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
    }

    // pricing / lowest bid
    realEstate.setLowestBid( getDefaultPrice() );
    realEstate.getLowestBid().setMarketingType( MarketingType.PURCHASE );
    realEstate.getLowestBid().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
    realEstate.getLowestBid().setValue( getRandomDecimal( 10000, 250000 ) );

    // pricing / market value
    realEstate.setMarketValue( getDefaultPrice() );
    realEstate.getMarketValue().setMarketingType( MarketingType.PURCHASE );
    realEstate.getMarketValue().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
    realEstate.getMarketValue().setValue( getRandomDecimal( 50000, 500000 ) );
  }

  /**
   * Initialize a {@link FlatShareRoom} object with random values.
   *
   * @param realEstate
   * object to initialize
   */
  protected void initRealEstate( FlatShareRoom realEstate )
  {
    realEstate.setAgeOfFlatMatesFrom( getRandomLong( 16, 30 ) );
    realEstate.setAgeOfFlatMatesTo( getRandomLong( 30, 50 ) );
    realEstate.setAgeOfRequestedFrom( getRandomLong( 16, 30 ) );
    realEstate.setAgeOfRequestedTo( getRandomLong( 30, 50 ) );
    realEstate.setApartmentType( getRandomApartmentType() );
    realEstate.setBalcony( getRandomYesNotApplicableType() );
    realEstate.setBarrierFree( getRandomYesNotApplicableType() );
    realEstate.setBaseRent( getRandomDecimal( 200, 1000 ) );
    realEstate.setBathHasShower( getRandomYesNotApplicableType() );
    realEstate.setBathHasTub( getRandomYesNotApplicableType() );
    realEstate.setBathHasWc( getRandomYesNotApplicableType() );
    realEstate.setCellar( getRandomYesNotApplicableType() );
    realEstate.setDeposit( StringUtils.abbreviate( LOREM.getWords( 1, 10 ), 50 ) );
    realEstate.setDishwasher( getRandomYesNotApplicableType() );
    realEstate.setEnergySourcesEnev2014( createRandomEnergySourcesEnev2014() );
    realEstate.setFlatShareSize( getRandomInt( 2, 8 ) );
    realEstate.setFloor( getRandomInt( 5 ) );
    realEstate.setFlooringType( getRandomFlooringType() );
    realEstate.setFreeFrom( getRandomCalendar() );
    realEstate.setFreeUntil( getRandomCalendar() );
    realEstate.setFurnishing( getRandomYesNoNotApplicableType() );
    realEstate.setGarden( getRandomYesNotApplicableType() );
    realEstate.setGuestToilet( getRandomYesNotApplicableType() );
    realEstate.setHeatingCosts( getRandomDecimal( 100, 500 ) );
    realEstate.setHeatingCostsInServiceCharge( getRandomYesNo() );
    realEstate.setHeatingTypeEnev2014( getRandomHeatingTypeEnev2014() );
    realEstate.setInternetConnection( getRandomInternetConnectionType() );
    realEstate.setLift( getRandomYesNotApplicableType() );
    realEstate.setMinimumTermOfLease( getRandomLong( 1, 12 ) );
    realEstate.setNumberOfBathRooms( getRandomLong( 1, 10 ) );
    realEstate.setNumberOfFemaleFlatMates( getRandomLong( 1, 10 ) );
    realEstate.setNumberOfFloors( getRandomLong( 1, 10 ) );
    realEstate.setNumberOfMaleFlatMates( getRandomLong( 1, 10 ) );
    realEstate.setNumberOfRequestedFlatMates( getRandomLong( 1, 10 )  );
    realEstate.setNumberOfRooms( getRandomDecimal( 1, 10 ) );
    realEstate.setOven( getRandomYesNotApplicableType() );
    realEstate.setParkingSituation( getRandomParkingSituationType() );
    realEstate.setPetsAllowed( getRandomPetsAllowedType() );
    realEstate.setRefrigerator( getRandomYesNotApplicableType() );
    realEstate.setRequestedGender( getRandomFlatMateGenderType() );
    realEstate.setRoomSize( getRandomDecimal( 4, 20 ) );
    realEstate.setServiceCharge( getRandomDecimal( 50, 500 ) );
    realEstate.setSmokingAllowed( getRandomSmokingAllowedType() );
    realEstate.setStove( getRandomYesNotApplicableType() );
    realEstate.setTelephoneConnection( getRandomTelephoneConnectionType() );
    realEstate.setTotalRent( getRandomDecimal( 500, 3000 ) );
    realEstate.setTotalSpace( getRandomDecimal( 40, 250 ) );
    realEstate.setTvConnection( getRandomTvConnectionType() );
    realEstate.setWashingMachine( getRandomYesNotApplicableType() );

    // construction year
    if (getRandomBoolean())
    {
      realEstate.setConstructionYear( null );
      realEstate.setConstructionYearUnknown( true );
    }
    else
    {
      realEstate.setConstructionYear( getRandomInt( 1900, 1980 ) );
    }

    // courtage
    realEstate.setCourtage( commonFactory.createCourtageInfo() );
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( LOREM.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( LOREM.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.getCourtage().setHasCourtage( YesNoNotApplicableType.YES );

    // energy certificate for habitation
    realEstate.setEnergyCertificate( commonFactory.createEnergyPerformanceCertificate() );

    // energy certificate for habitation by consumption
    if (getRandomBoolean())
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_CONSUMPTION );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setEnergyConsumptionContainsWarmWater( getRandomYesNotApplicableType() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
    }

    // energy certificate for habitation by demand
    else
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_REQUIRED );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
    }
  }

  /**
   * Initialize a {@link GarageBuy} object with random values.
   *
   * @param realEstate
   * object to initialize
   */
  protected void initRealEstate( GarageBuy realEstate )
  {
    realEstate.setCondition( getRandomRealEstateCondition() );
    realEstate.setConstructionYear( getRandomInt( 1900, 1980 ) );
    realEstate.setGarageType( getRandomGarageType() );
    realEstate.setHeightGarage( getRandomDecimal( 1, 3 ) );
    realEstate.setLastRefurbishment( getRandomLong( 1990, 2014 ) );
    realEstate.setLengthGarage( getRandomDecimal( 3, 6 ) );
    realEstate.setUsableFloorSpace( getRandomDecimal( 5, 50 ) );
    realEstate.setWidthGarage( getRandomDecimal( 3, 6 ) );

    // courtage
    realEstate.setCourtage( commonFactory.createCourtageInfo() );
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( LOREM.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( LOREM.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.getCourtage().setHasCourtage( YesNoNotApplicableType.YES );

    // pricing
    realEstate.setPrice( getDefaultPrice() );
    realEstate.getPrice().setMarketingType( MarketingType.PURCHASE );
    realEstate.getPrice().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
    realEstate.getPrice().setValue( getRandomDecimal( 1000, 9999 ) );
  }

  /**
   * Initialize a {@link GarageRent} object with random values.
   *
   * @param realEstate
   * object to initialize
   */
  protected void initRealEstate( GarageRent realEstate )
  {
    realEstate.setCondition( getRandomRealEstateCondition() );
    realEstate.setConstructionYear( getRandomInt( 1900, 1980 ) );
    realEstate.setFreeFrom( getRandomCalendar() );
    realEstate.setFreeUntil( getRandomCalendar() );
    realEstate.setGarageType( getRandomGarageType() );
    realEstate.setHeightGarage( getRandomDecimal( 1, 3 ) );
    realEstate.setLastRefurbishment( getRandomLong( 1990, 2014 ) );
    realEstate.setLengthGarage( getRandomDecimal( 3, 6 ) );
    realEstate.setUsableFloorSpace( getRandomDecimal( 5, 50 ) );
    realEstate.setWidthGarage( getRandomDecimal( 3, 6 ) );

    // courtage
    realEstate.setCourtage( commonFactory.createCourtageInfo() );
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( LOREM.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( LOREM.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.getCourtage().setHasCourtage( YesNoNotApplicableType.YES );

    // pricing
    realEstate.setPrice( getDefaultPrice() );
    realEstate.getPrice().setMarketingType( MarketingType.RENT );
    realEstate.getPrice().setPriceIntervalType( PriceIntervalType.MONTH );
    realEstate.getPrice().setValue( getRandomDecimal( 50, 999 ) );
  }

  /**
   * Initialize a {@link Gastronomy} object with random values.
   *
   * @param realEstate
   * object to initialize
   */
  protected void initRealEstate( Gastronomy realEstate )
  {
    realEstate.setAdditionalArea( getRandomDecimal( 10, 500 ) );
    realEstate.setCellar( getRandomYesNotApplicableType() );
    realEstate.setCondition( getRandomRealEstateCondition() );
    realEstate.setDeposit( StringUtils.abbreviate( LOREM.getWords( 1, 10 ), 50 ) );
    realEstate.setDistanceToAirport( getRandomLong( 5, 50 ) );
    realEstate.setDistanceToFM( getRandomLong( 5, 50 ) );
    realEstate.setDistanceToMRS( getRandomLong( 5, 50 ) );
    realEstate.setDistanceToPT( getRandomLong( 5, 50 ) );
    realEstate.setEnergySourcesEnev2014( createRandomEnergySourcesEnev2014() );
    realEstate.setFreeFrom( StringUtils.abbreviate( LOREM.getWords( 1, 10 ), 50 ) );
    realEstate.setGastronomyType( getRandomGastronomyType() );
    realEstate.setHeatingTypeEnev2014( getRandomHeatingTypeEnev2014() );
    realEstate.setInteriorQuality( getRandomInteriorQuality() );
    realEstate.setLastRefurbishment( getRandomLong( 1990, 2014 ) );
    realEstate.setLift( getRandomYesNotApplicableType() );
    realEstate.setListed( getRandomYesNotApplicableType() );
    realEstate.setMinDivisible( getRandomDecimal( 100, 250 ) );
    realEstate.setNetFloorSpace( getRandomDecimal( 50, 5000 ) );
    realEstate.setNumberBeds( getRandomLong( 10, 500 ) );
    realEstate.setNumberOfFloors( String.valueOf( getRandomInt( 1, 10 ) ) );
    realEstate.setNumberOfParkingSpaces( getRandomLong( 1, 10 ) );
    realEstate.setNumberSeats( getRandomLong( 50, 500 ) );
    realEstate.setParkingSpacePrice( getRandomDecimal( 30, 300 ) );
    realEstate.setTerrace( getRandomYesNotApplicableType() );
    realEstate.setTotalFloorSpace( getRandomDecimal( 50, 500 ) );

    // construction year
    if (getRandomBoolean())
    {
      realEstate.setConstructionYear( null );
      realEstate.setConstructionYearUnknown( true );
    }
    else
    {
      realEstate.setConstructionYear( getRandomLong( 1900, 1980 ) );
    }

    // courtage
    realEstate.setCourtage( commonFactory.createCourtageInfo() );
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( LOREM.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( LOREM.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.getCourtage().setHasCourtage( YesNoNotApplicableType.YES );

    // energy certificate for business
    realEstate.setEnergyCertificate( commonFactory.createEnergyPerformanceCertificate() );

    // energy certificate for business by consumption
    if (getRandomBoolean())
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_CONSUMPTION );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.getEnergyCertificate().setElectricityConsumption( getRandomDecimal( 10, 250 ) );
        realEstate.getEnergyCertificate().setHeatingConsumption( getRandomDecimal( 10, 250 ) );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
        realEstate.setEnergyConsumptionContainsWarmWater( getRandomYesNotApplicableType() );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyConsumptionElectricity( getRandomDecimal( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyConsumptionHeating( getRandomDecimal( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
    }

    // energy certificate for business by demand
    else
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_REQUIRED );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setThermalCharacteristicElectricity( getRandomDecimal( 500, 2500 ) );
        realEstate.getEnergyCertificate().setThermalCharacteristicHeating( getRandomDecimal( 500, 2500 ) );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
    }

    // pricing for rent
    if (getRandomBoolean())
    {
      realEstate.setCommercializationType( CommercializationType.RENT );
      realEstate.setPrice( getDefaultPrice() );
      realEstate.getPrice().setMarketingType( MarketingType.RENT );
      realEstate.getPrice().setPriceIntervalType( PriceIntervalType.MONTH );
      realEstate.getPrice().setValue( getRandomDecimal( 1000, 50000 ) );
    }

    // pricing for purchase
    else
    {
      realEstate.setCommercializationType( CommercializationType.BUY );
      realEstate.setPrice( getDefaultPrice() );
      realEstate.getPrice().setMarketingType( MarketingType.PURCHASE );
      realEstate.getPrice().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
      realEstate.getPrice().setValue( getRandomDecimal( 50000, 9999999 ) );
    }

    // pricing / additional costs
    realEstate.setAdditionalCosts( getDefaultPrice() );
    realEstate.getAdditionalCosts().setPriceIntervalType( PriceIntervalType.MONTH );
    realEstate.getAdditionalCosts().setValue( getRandomDecimal( 500, 5000 ) );

    // pricing / calculated price
    //realEstate.setCalculatedPrice( getDefaultPrice() );
    //realEstate.getCalculatedPrice().setValue( value );
  }

  /**
   * Initialize a {@link HouseBuy} object with random values.
   *
   * @param realEstate
   * object to initialize
   */
  protected void initRealEstate( HouseBuy realEstate )
  {
    realEstate.setBuildingType( getRandomBuildingType() );
    realEstate.setCellar( getRandomYesNotApplicableType() );
    realEstate.setCondition( getRandomRealEstateCondition() );
    realEstate.setConstructionPhase( getRandomConstructionPhaseType() );
    realEstate.setEnergySourcesEnev2014( createRandomEnergySourcesEnev2014() );
    realEstate.setFreeFrom( StringUtils.abbreviate( LOREM.getWords( 1, 10 ), 50 ) );
    realEstate.setGuestToilet( getRandomYesNotApplicableType() );
    realEstate.setHandicappedAccessible( getRandomYesNotApplicableType() );
    realEstate.setHeatingTypeEnev2014( getRandomHeatingTypeEnev2014() );
    realEstate.setInteriorQuality( getRandomInteriorQuality() );
    realEstate.setLastRefurbishment( getRandomInt( 1990, 2014 ) );
    realEstate.setListed( getRandomYesNotApplicableType() );
    realEstate.setLivingSpace( getRandomDecimal( 20, 300 ) );
    realEstate.setLodgerFlat( getRandomYesNotApplicableType() );
    realEstate.setNumberOfBathRooms( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfBedRooms( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfFloors( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfParkingSpaces( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfRooms( getRandomDecimal( 1, 10 ) );
    realEstate.setParkingSpacePrice( getRandomDecimal( 30, 300 ) );
    realEstate.setParkingSpaceType( getRandomParkingSpaceType() );
    realEstate.setPlotArea( getRandomDecimal( 100, 5000 ) );
    realEstate.setRentalIncome( getRandomDecimal( 9999, 9999999 ) );
    realEstate.setRented( getRandomYesNotApplicableType() );
    realEstate.setSummerResidencePractical( getRandomYesNotApplicableType() );
    realEstate.setUsableFloorSpace( getRandomDecimal( 20, 300 ) );

    // construction year
    if (getRandomBoolean())
    {
      realEstate.setConstructionYear( null );
      realEstate.setConstructionYearUnknown( true );
    }
    else
    {
      realEstate.setConstructionYear( getRandomInt( 1900, 1980 ) );
    }

    // courtage
    realEstate.setCourtage( commonFactory.createCourtageInfo() );
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( LOREM.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( LOREM.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.getCourtage().setHasCourtage( YesNoNotApplicableType.YES );

    // energy certificate for habitation
    realEstate.setEnergyPerformanceCertificate( true );
    realEstate.setEnergyCertificate( commonFactory.createEnergyPerformanceCertificate() );

    // energy certificate for habitation by consumption
    if (getRandomBoolean())
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_CONSUMPTION );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setEnergyConsumptionContainsWarmWater( getRandomYesNotApplicableType() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
    }

    // energy certificate for habitation by demand
    else
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_REQUIRED );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
    }

    // pricing
    realEstate.setPrice( getDefaultPrice() );
    realEstate.getPrice().setMarketingType( MarketingType.PURCHASE );
    realEstate.getPrice().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
    realEstate.getPrice().setValue( getRandomDecimal( 10000, 9999999 ) );
  }

  /**
   * Initialize a {@link HouseRent} object with random values.
   *
   * @param realEstate
   * object to initialize
   */
  protected void initRealEstate( HouseRent realEstate )
  {
    realEstate.setBaseRent( getRandomDecimal( 500, 5000 ) );
    realEstate.setBuildingType( getRandomBuildingType() );
    realEstate.setBuiltInKitchen( getRandomBoolean() );
    realEstate.setCellar( getRandomYesNotApplicableType() );
    realEstate.setCondition( getRandomRealEstateCondition() );
    realEstate.setDeposit( StringUtils.abbreviate( LOREM.getWords( 1, 10 ), 50 ) );
    realEstate.setEnergySourcesEnev2014( createRandomEnergySourcesEnev2014() );
    realEstate.setFreeFrom( StringUtils.abbreviate( LOREM.getWords( 1, 10 ), 50 ) );
    realEstate.setGuestToilet( getRandomYesNotApplicableType() );
    realEstate.setHandicappedAccessible( getRandomYesNotApplicableType() );
    realEstate.setHeatingCosts( getRandomDecimal( 100, 500 ) );
    realEstate.setHeatingCostsInServiceCharge( getRandomYesNo() );
    realEstate.setHeatingTypeEnev2014( getRandomHeatingTypeEnev2014() );
    realEstate.setInteriorQuality( getRandomInteriorQuality() );
    realEstate.setLastRefurbishment( getRandomInt( 1990, 2014 ) );
    realEstate.setLivingSpace( getRandomDecimal( 20, 300 ) );
    realEstate.setNumberOfBathRooms( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfBedRooms( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfFloors( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfParkingSpaces( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfRooms( getRandomDecimal( 1, 10 ) );
    realEstate.setParkingSpacePrice( getRandomDecimal( 30, 300 ) );
    realEstate.setParkingSpaceType( getRandomParkingSpaceType() );
    realEstate.setPetsAllowed( getRandomPetsAllowedType() );
    realEstate.setPlotArea( getRandomDecimal( 100, 5000 ) );
    realEstate.setServiceCharge( getRandomDecimal( 50, 500 ) );
    realEstate.setTotalRent( getRandomDecimal( 1000, 5000 ) );
    realEstate.setUsableFloorSpace( getRandomDecimal( 20, 300 ) );
    realEstate.setUseAsFlatshareRoom( getRandomYesNotApplicableType() );

    // construction year
    if (getRandomBoolean())
    {
      realEstate.setConstructionYear( null );
      realEstate.setConstructionYearUnknown( true );
    }
    else
    {
      realEstate.setConstructionYear( getRandomInt( 1900, 1980 ) );
    }

    // courtage
    realEstate.setCourtage( commonFactory.createCourtageInfo() );
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( LOREM.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( LOREM.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.getCourtage().setHasCourtage( YesNoNotApplicableType.YES );

    // energy certificate for habitation
    realEstate.setEnergyPerformanceCertificate( true );
    realEstate.setEnergyCertificate( commonFactory.createEnergyPerformanceCertificate() );

    // energy certificate for habitation by consumption
    if (getRandomBoolean())
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_CONSUMPTION );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setEnergyConsumptionContainsWarmWater( getRandomYesNotApplicableType() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
    }

    // energy certificate for habitation by demand
    else
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_REQUIRED );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
    }

    // pricing
    realEstate.setPrice( getDefaultPrice() );
    realEstate.getPrice().setMarketingType( MarketingType.RENT );
    realEstate.getPrice().setPriceIntervalType( PriceIntervalType.MONTH );
    realEstate.getPrice().setValue( getRandomDecimal( 250, 9999 ) );
  }

  /**
   * Initialize a {@link HouseType} object with random values.
   *
   * @param realEstate
   * object to initialize
   */
  protected void initRealEstate( HouseType realEstate )
  {
    // Type houses require an <address> element without children or with a
    // single <geoHierarchy> child element. Because we're not randomly generate
    // a <geoHierarchy>, an empty <address> element is created.
    realEstate.setAddress( commonFactory.createWgs84Address() );

    realEstate.setBaseArea( getRandomDecimal( 100, 1000 ) );
    realEstate.setBuildingType( getRandomHouseTypeBuildingType() );
    realEstate.setConstructionMethod( getRandomHouseTypeConstructionMethodType() );
    realEstate.setContructionPriceInformationNote( StringUtils.abbreviate( LOREM.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.setEnergyStandardType( getRandomHouseTypeEnergyStandardType() );
    realEstate.setFloorInformationNote( StringUtils.abbreviate( LOREM.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.setLivingSpace( getRandomDecimal( 20, 300 ) );
    realEstate.setModelInformationNote( StringUtils.abbreviate( LOREM.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.setNumberOfRooms( getRandomDecimal( 1, 10 ) );
    realEstate.setRoofInformationNote( StringUtils.abbreviate( LOREM.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.setStageOfCompletionType( getRandomHouseTypeStageOfCompletionType() );
    realEstate.setTotalArea( getRandomDecimal( 250, 2500 ) );
    realEstate.setTypeInformationNote( StringUtils.abbreviate( LOREM.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.setUValue( getRandomDecimal( 10 ) );

    // courtage
    realEstate.setCourtage( commonFactory.createCourtageInfo() );
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( LOREM.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( LOREM.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.getCourtage().setHasCourtage( YesNoNotApplicableType.YES );

    // pricing
    realEstate.setPrice( getDefaultPrice() );
    realEstate.getPrice().setMarketingType( MarketingType.PURCHASE );
    realEstate.getPrice().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
    realEstate.getPrice().setValue( getRandomDecimal( 10000, 9999999 ) );
  }

  /**
   * Initialize an {@link Industry} object with random values.
   *
   * @param realEstate
   * object to initialize
   */
  protected void initRealEstate( Industry realEstate )
  {
    realEstate.setAdditionalArea( getRandomDecimal( 250, 5000 ) );
    realEstate.setAutoLift( getRandomYesNotApplicableType() );
    realEstate.setCondition( getRandomRealEstateCondition() );
    realEstate.setConnectedLoad( getRandomLong( 1, 500 ) );
    realEstate.setCraneRunway( getRandomYesNotApplicableType() );
    realEstate.setCraneRunwayLoad( getRandomDecimal( 500, 50000 ) );
    realEstate.setDeposit( StringUtils.abbreviate( LOREM.getWords( 1, 10 ), 50 ) );
    realEstate.setDistanceToAirport( getRandomLong( 5, 50 ) );
    realEstate.setDistanceToFM( getRandomLong( 5, 50 ) );
    realEstate.setDistanceToMRS( getRandomLong( 5, 50 ) );
    realEstate.setDistanceToPT( getRandomLong( 5, 50 ) );
    realEstate.setEnergySourcesEnev2014( createRandomEnergySourcesEnev2014() );
    realEstate.setFloorLoad( getRandomDecimal( 500, 50000 ) );
    realEstate.setFlooringType( getRandomFlooringType() );
    realEstate.setFreeFrom( StringUtils.abbreviate( LOREM.getWords( 1, 10 ), 50 ) );
    realEstate.setGoodsLift( getRandomYesNotApplicableType() );
    realEstate.setGoodsLiftLoad( getRandomDecimal( 500, 50000 ) );
    realEstate.setHallHeight( getRandomDecimal( 3, 15 ) );
    realEstate.setHeatingTypeEnev2014( getRandomHeatingTypeEnev2014() );
    realEstate.setIndustryType( getRandomIndustryType() );
    realEstate.setInteriorQuality( getRandomInteriorQuality() );
    realEstate.setLastRefurbishment( getRandomLong( 1990, 2014 ) );
    realEstate.setLift( getRandomYesNotApplicableType() );
    realEstate.setMinDivisible( getRandomDecimal( 500, 2500 ) );
    realEstate.setNetFloorSpace( getRandomDecimal( 100, 10000 ) );
    realEstate.setNumberOfFloors( String.valueOf( getRandomInt( 1, 10 ) ) );
    realEstate.setNumberOfParkingSpaces( getRandomLong( 1, 10 ) );
    realEstate.setParkingSpacePrice( getRandomDecimal( 30, 300 ) );
    realEstate.setPlotArea( getRandomDecimal( 100, 5000 ) );
    realEstate.setRamp( getRandomYesNotApplicableType() );
    realEstate.setTotalFloorSpace( getRandomDecimal( 50, 500 ) );

    // construction year
    if (getRandomBoolean())
    {
      realEstate.setConstructionYear( null );
      realEstate.setConstructionYearUnknown( true );
    }
    else
    {
      realEstate.setConstructionYear( getRandomLong( 1900, 1980 ) );
    }

    // courtage
    realEstate.setCourtage( commonFactory.createCourtageInfo() );
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( LOREM.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( LOREM.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.getCourtage().setHasCourtage( YesNoNotApplicableType.YES );

    // energy certificate for business
    realEstate.setEnergyCertificate( commonFactory.createEnergyPerformanceCertificate() );

    // energy certificate for business by consumption
    if (getRandomBoolean())
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_CONSUMPTION );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.getEnergyCertificate().setElectricityConsumption( getRandomDecimal( 10, 250 ) );
        realEstate.getEnergyCertificate().setHeatingConsumption( getRandomDecimal( 10, 250 ) );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
        realEstate.setEnergyConsumptionContainsWarmWater( getRandomYesNotApplicableType() );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyConsumptionElectricity( getRandomDecimal( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyConsumptionHeating( getRandomDecimal( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
    }

    // energy certificate for business by demand
    else
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_REQUIRED );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setThermalCharacteristicElectricity( getRandomDecimal( 500, 2500 ) );
        realEstate.getEnergyCertificate().setThermalCharacteristicHeating( getRandomDecimal( 500, 2500 ) );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
    }

    // pricing for rent
    if (getRandomBoolean())
    {
      realEstate.setCommercializationType( CommercializationType.RENT );
      realEstate.setPrice( getDefaultPrice() );
      realEstate.getPrice().setMarketingType( MarketingType.RENT );
      realEstate.getPrice().setPriceIntervalType( PriceIntervalType.MONTH );
      realEstate.getPrice().setValue( getRandomDecimal( 500, 5000 ) );
    }

    // pricing for purchase
    else
    {
      realEstate.setCommercializationType( CommercializationType.BUY );
      realEstate.setPrice( getDefaultPrice() );
      realEstate.getPrice().setMarketingType( MarketingType.PURCHASE );
      realEstate.getPrice().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
      realEstate.getPrice().setValue( getRandomDecimal( 50000, 999999 ) );
    }

    // pricing / additional costs
    realEstate.setAdditionalCosts( getDefaultPrice() );
    realEstate.getAdditionalCosts().setPriceIntervalType( PriceIntervalType.MONTH );
    realEstate.getAdditionalCosts().setValue( getRandomDecimal( 500, 5000 ) );

    // pricing / calculated price
    //realEstate.setCalculatedPrice( getDefaultPrice() );
    //realEstate.getCalculatedPrice().setValue( value );
  }

  /**
   * Initialize an {@link Investment} object with random values.
   *
   * @param realEstate
   * object to initialize
   */
  protected void initRealEstate( Investment realEstate )
  {
    realEstate.setAdditionalArea( getRandomDecimal( 250, 5000 ) );
    realEstate.setCondition( getRandomRealEstateCondition() );
    realEstate.setConstructionYear( getRandomLong( 1900, 1980 ) );
    realEstate.setDistanceToAirport( getRandomLong( 5, 50 ) );
    realEstate.setDistanceToFM( getRandomLong( 5, 50 ) );
    realEstate.setDistanceToMRS( getRandomLong( 5, 50 ) );
    realEstate.setDistanceToPT( getRandomLong( 5, 50 ) );
    realEstate.setEnergySourcesEnev2014( createRandomEnergySourcesEnev2014() );
    realEstate.setFreeFrom( StringUtils.abbreviate( LOREM.getWords( 1, 10 ), 50 ) );
    realEstate.setHeatingTypeEnev2014( getRandomHeatingTypeEnev2014() );
    realEstate.setIndustrialArea( getRandomDecimal( 500, 50000 ) );
    realEstate.setInteriorQuality( getRandomInteriorQuality() );
    realEstate.setInvestmentType( getRandomInvestmentType() );
    realEstate.setLastRefurbishment( getRandomLong( 1990, 2014 ) );
    realEstate.setLift( getRandomYesNotApplicableType() );
    realEstate.setListed( getRandomYesNotApplicableType() );
    realEstate.setLivingSpace( getRandomDecimal( 20, 300 ) );
    realEstate.setNetFloorSpace( getRandomDecimal( 50, 5000 ) );
    realEstate.setNumberOfFloors( String.valueOf( getRandomInt( 1, 10 ) ) );
    realEstate.setNumberOfParkingSpaces( getRandomLong( 1, 10 ) );
    realEstate.setParkingSpacePrice( getRandomDecimal( 30, 300 ) );
    realEstate.setPlotArea( getRandomDecimal( 100, 5000 ) );
    realEstate.setPriceMultiplier( getRandomDecimal( 1, 50 ) );
    realEstate.setTotalFloorSpace( getRandomDecimal( 50, 500 ) );

    // courtage
    realEstate.setCourtage( commonFactory.createCourtageInfo() );
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( LOREM.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( LOREM.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.getCourtage().setHasCourtage( YesNoNotApplicableType.YES );

    // energy certificate for habitation and business
    realEstate.setEnergyCertificate( commonFactory.createEnergyPerformanceCertificate() );

    // energy certificate for habitation and business by consumption
    if (getRandomBoolean())
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_CONSUMPTION );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.getEnergyCertificate().setElectricityConsumption( getRandomDecimal( 10, 250 ) );
        realEstate.getEnergyCertificate().setHeatingConsumption( getRandomDecimal( 10, 250 ) );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
        realEstate.setEnergyConsumptionContainsWarmWater( getRandomYesNotApplicableType() );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyConsumptionElectricity( getRandomDecimal( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyConsumptionHeating( getRandomDecimal( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
    }

    // energy certificate for habitation and business by demand
    else
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_REQUIRED );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setThermalCharacteristicElectricity( getRandomDecimal( 500, 2500 ) );
        realEstate.getEnergyCertificate().setThermalCharacteristicHeating( getRandomDecimal( 500, 2500 ) );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
    }

    // pricing
    realEstate.setPrice( getDefaultPrice() );
    realEstate.getPrice().setMarketingType( MarketingType.PURCHASE );
    realEstate.getPrice().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
    realEstate.getPrice().setValue( getRandomDecimal( 10000, 9999999 ) );

    // pricing / additional costs
    realEstate.setAdditionalCosts( getDefaultPrice() );
    realEstate.getAdditionalCosts().setPriceIntervalType( PriceIntervalType.MONTH );
    realEstate.getAdditionalCosts().setValue( getRandomDecimal( 500, 5000 ) );

    // pricing / other costs
    realEstate.setOtherCosts( getDefaultPrice() );
    realEstate.getOtherCosts().setValue( getRandomDecimal( 500, 10000 ) );

    // pricing / price per sqm
    realEstate.setPricePerSQM( getDefaultPrice() );
    realEstate.getPricePerSQM().setValue( getRandomDecimal( 1, 500 ) );

    // pricing / actual rental income
    realEstate.setRentalIncomeActual( getDefaultPrice() );
    realEstate.getRentalIncomeActual().setPriceIntervalType( PriceIntervalType.YEAR );
    realEstate.getRentalIncomeActual().setValue( getRandomDecimal( 50000, 9999999 ) );

    // pricing / target rental income
    realEstate.setRentalIncomeTarget( getDefaultPrice() );
    realEstate.getRentalIncomeTarget().setPriceIntervalType( PriceIntervalType.YEAR );
    realEstate.getRentalIncomeTarget().setValue( getRandomDecimal( 50000, 9999999 ) );
  }

  /**
   * Initialize a {@link LivingBuySite} object with random values.
   *
   * @param realEstate
   * object to initialize
   */
  protected void initRealEstate( LivingBuySite realEstate )
  {
    realEstate.setBuildingPermission( getRandomBoolean() );
    realEstate.setDemolition( getRandomBoolean() );
    realEstate.setFreeFrom( StringUtils.abbreviate( LOREM.getWords( 1, 10 ), 50 ) );
    realEstate.setGfz( getRandomDecimal( 1, 10 ) );
    realEstate.setGrz( getRandomDecimal( 1, 10 ) );
    realEstate.setMinDivisible( getRandomDecimal( 500, 2500 ) );
    realEstate.setPlotArea( getRandomDecimal( 100, 5000 ) );
    realEstate.setRecommendedUseTypes( createRandomSiteRecommendedUseTypes() );
    realEstate.setShortTermConstructible( getRandomBoolean() );
    realEstate.setSiteConstructibleType( getRandomSiteConstructibleType() );
    realEstate.setSiteDevelopmentType( getRandomSiteDevelopmentType() );
    realEstate.setTenancy( getRandomLong( 100 ) );

    // courtage
    realEstate.setCourtage( commonFactory.createCourtageInfo() );
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( LOREM.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( LOREM.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.getCourtage().setHasCourtage( YesNoNotApplicableType.YES );

    // pricing for purchase
    realEstate.setCommercializationType( CommercializationType.BUY );
    realEstate.setPrice( getDefaultPrice() );
    realEstate.getPrice().setMarketingType( MarketingType.PURCHASE );
    realEstate.getPrice().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
    realEstate.getPrice().setValue( getRandomDecimal( 50000, 999999 ) );
  }

  /**
   * Initialize a {@link LivingRentSite} object with random values.
   *
   * @param realEstate
   * object to initialize
   */
  protected void initRealEstate( LivingRentSite realEstate )
  {
    realEstate.setBuildingPermission( getRandomBoolean() );
    realEstate.setDemolition( getRandomBoolean() );
    realEstate.setFreeFrom( StringUtils.abbreviate( LOREM.getWords( 1, 10 ), 50 ) );
    realEstate.setGfz( getRandomDecimal( 1, 10 ) );
    realEstate.setGrz( getRandomDecimal( 1, 10 ) );
    realEstate.setMinDivisible( getRandomDecimal( 500, 2500 ) );
    realEstate.setPlotArea( getRandomDecimal( 100, 5000 ) );
    realEstate.setRecommendedUseTypes( createRandomSiteRecommendedUseTypes() );
    realEstate.setShortTermConstructible( getRandomBoolean() );
    realEstate.setSiteConstructibleType( getRandomSiteConstructibleType() );
    realEstate.setSiteDevelopmentType( getRandomSiteDevelopmentType() );
    realEstate.setTenancy( getRandomLong( 100 ) );

    // courtage
    realEstate.setCourtage( commonFactory.createCourtageInfo() );
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( LOREM.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( LOREM.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.getCourtage().setHasCourtage( YesNoNotApplicableType.YES );

    // pricing for leasing
    realEstate.setCommercializationType( CommercializationType.LEASE );
    realEstate.setPrice( getDefaultPrice() );
    realEstate.getPrice().setMarketingType( MarketingType.LEASE );
    realEstate.getPrice().setPriceIntervalType( PriceIntervalType.YEAR );
    realEstate.getPrice().setValue( getRandomDecimal( 500, 999999 ) );
  }

  /**
   * Initialize an {@link Office} object with random values.
   *
   * @param realEstate
   * object to initialize
   */
  protected void initRealEstate( Office realEstate )
  {
    realEstate.setAdditionalArea( getRandomDecimal( 250, 5000 ) );
    realEstate.setAirConditioning( getRandomAirConditioningType() );
    realEstate.setCellar( getRandomYesNotApplicableType() );
    realEstate.setCondition( getRandomRealEstateCondition() );
    realEstate.setDeposit( StringUtils.abbreviate( LOREM.getWords( 1, 10 ), 50 ) );
    realEstate.setDistanceToAirport( getRandomLong( 5, 50 ) );
    realEstate.setDistanceToFM( getRandomLong( 5, 50 ) );
    realEstate.setDistanceToMRS( getRandomLong( 5, 50 ) );
    realEstate.setDistanceToPT( getRandomLong( 5, 50 ) );
    realEstate.setEnergySourcesEnev2014( createRandomEnergySourcesEnev2014() );
    realEstate.setFlooringType( getRandomFlooringType() );
    realEstate.setFreeFrom( StringUtils.abbreviate( LOREM.getWords( 1, 10 ), 50 ) );
    realEstate.setHandicappedAccessible( getRandomYesNotApplicableType() );
    realEstate.setHasCanteen( getRandomYesNotApplicableType() );
    realEstate.setHeatingTypeEnev2014( getRandomHeatingTypeEnev2014() );
    realEstate.setHighVoltage( getRandomYesNotApplicableType() );
    realEstate.setInteriorQuality( getRandomInteriorQuality() );
    realEstate.setKitchenComplete( getRandomYesNotApplicableType() );
    realEstate.setLanCables( getRandomItInfrastructureType() );
    realEstate.setLastRefurbishment( getRandomLong( 1990, 2014 ) );
    realEstate.setLift( getRandomYesNotApplicableType() );
    realEstate.setListed( getRandomYesNotApplicableType() );
    realEstate.setMinDivisible( getRandomDecimal( 500, 2500 ) );
    realEstate.setNetFloorSpace( getRandomDecimal( 50, 5000 ) );
    realEstate.setNumberOfFloors( String.valueOf( getRandomInt( 1, 10 ) ) );
    realEstate.setNumberOfParkingSpaces( getRandomLong( 1, 10 ) );
    realEstate.setOfficeType( getRandomOfficeType() );
    realEstate.setParkingSpacePrice( getRandomDecimal( 30, 300 ) );
    realEstate.setTotalFloorSpace( getRandomDecimal( 50, 500 ) );

    // construction year
    if (getRandomBoolean())
    {
      realEstate.setConstructionYear( null );
      realEstate.setConstructionYearUnknown( true );
    }
    else
    {
      realEstate.setConstructionYear( getRandomLong( 1900, 1980 ) );
    }

    // courtage
    realEstate.setCourtage( commonFactory.createCourtageInfo() );
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( LOREM.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( LOREM.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.getCourtage().setHasCourtage( YesNoNotApplicableType.YES );

    // energy certificate for business
    realEstate.setEnergyCertificate( commonFactory.createEnergyPerformanceCertificate() );

    // energy certificate for business by consumption
    if (getRandomBoolean())
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_CONSUMPTION );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.getEnergyCertificate().setElectricityConsumption( getRandomDecimal( 10, 250 ) );
        realEstate.getEnergyCertificate().setHeatingConsumption( getRandomDecimal( 10, 250 ) );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
        realEstate.setEnergyConsumptionContainsWarmWater( getRandomYesNotApplicableType() );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyConsumptionElectricity( getRandomDecimal( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyConsumptionHeating( getRandomDecimal( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
    }

    // energy certificate for business by demand
    else
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_REQUIRED );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setThermalCharacteristicElectricity( getRandomDecimal( 500, 2500 ) );
        realEstate.getEnergyCertificate().setThermalCharacteristicHeating( getRandomDecimal( 500, 2500 ) );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
    }

    // office rent durations
    realEstate.setOfficeRentDurations( realEstatesFactory.createOfficeOfficeRentDurations() );
    realEstate.getOfficeRentDurations().getOfficeRentDuration().addAll( Arrays.asList( OfficeRentDuration.values() ) );

    // pricing for rent
    if (getRandomBoolean())
    {
      realEstate.setCommercializationType( CommercializationType.RENT );
      realEstate.setPrice( getDefaultPrice() );
      realEstate.getPrice().setMarketingType( MarketingType.RENT );
      realEstate.getPrice().setPriceIntervalType( PriceIntervalType.MONTH );
      realEstate.getPrice().setValue( getRandomDecimal( 500, 5000 ) );
    }

    // pricing for purchase
    else
    {
      realEstate.setCommercializationType( CommercializationType.BUY );
      realEstate.setPrice( getDefaultPrice() );
      realEstate.getPrice().setMarketingType( MarketingType.PURCHASE );
      realEstate.getPrice().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
      realEstate.getPrice().setValue( getRandomDecimal( 50000, 999999 ) );
    }

    // pricing / additional costs
    realEstate.setAdditionalCosts( getDefaultPrice() );
    realEstate.getAdditionalCosts().setPriceIntervalType( PriceIntervalType.MONTH );
    realEstate.getAdditionalCosts().setValue( getRandomDecimal( 500, 5000 ) );

    // pricing / calculated price
    //realEstate.setCalculatedPrice( getDefaultPrice() );
    //realEstate.getCalculatedPrice().setValue( value );
  }

  /**
   * Initialize a {@link SeniorCare} object with random values.
   *
   * @param realEstate
   * object to initialize
   */
  protected void initRealEstate( SeniorCare realEstate )
  {
    realEstate.setBalconyAvailable( getRandomBalconyAvailableType() );
    realEstate.setBarrierFree( getRandomYesNotApplicableType() );
    realEstate.setBranchEntry( getRandomBoolean() );
    realEstate.setCareLevel( getRandomCareLevel() );
    realEstate.setCareOfAlzheimer( getRandomYesNotApplicableType() );
    realEstate.setCareOfArtificialRespiration( getRandomYesNotApplicableType() );
    realEstate.setCareOfComaVigil( getRandomYesNotApplicableType() );
    realEstate.setCareOfDementia( getRandomYesNotApplicableType() );
    realEstate.setCareOfMultipleSclerosis( getRandomYesNotApplicableType() );
    realEstate.setCareOfParkinson( getRandomYesNotApplicableType() );
    realEstate.setCareOfStroke( getRandomYesNotApplicableType() );
    realEstate.setCleaningServiceAvailable( getRandomYesNotApplicableType() );
    realEstate.setCookingFacilitiesAvailable( getRandomYesNotApplicableType() );
    realEstate.setCulturalProgramAvailable( getRandomYesNotApplicableType() );
    realEstate.setGuestApartmentsAvailable( getRandomYesNotApplicableType() );
    realEstate.setHandicappedAccessible( getRandomYesNotApplicableType() );
    realEstate.setKitchenAvailable( getRandomYesNotApplicableType() );
    realEstate.setLeisureActivitiesAvailable( getRandomYesNotApplicableType() );
    realEstate.setLivingSpaceFrom( getRandomDecimal( 20, 50 ) );
    realEstate.setLivingSpaceTo( getRandomDecimal( 50, 150 ) );
    realEstate.setNumberOfBeds( getRandomLong( 1, 10 ) );
    realEstate.setNumberOfLookedAfterApartments( getRandomLong( 1, 10 ) );
    realEstate.setNumberOfNursingPlaces( getRandomLong( 1, 10 ) );
    realEstate.setOpening( getRandomCalendar() );
    realEstate.setOwnFurniturePossible( getRandomYesNotApplicableType() );
    realEstate.setPetsAllowed( getRandomPetsAllowedType() );
    realEstate.setReligiousOfferingsAvailable( getRandomYesNotApplicableType() );
    realEstate.setRestaurantAvailable( getRandomYesNotApplicableType() );
    realEstate.setRoomType( getRandomRoomType() );
    realEstate.setSecurity24Hours( getRandomYesNotApplicableType() );
    realEstate.setShoppingFacilitiesAvailable( getRandomYesNotApplicableType() );
    realEstate.setShortDescription( StringUtils.abbreviate( LOREM.getWords( 3, 15 ), 200 ) );
    realEstate.setTherapyOfferingsAvailable( getRandomYesNotApplicableType() );
    realEstate.setTrialLivingPossible( getRandomYesNotApplicableType() );

    // care types
    realEstate.setCareTypes( commonFactory.createCareTypes() );
    realEstate.getCareTypes().getCareType().addAll( Arrays.asList( CareType.values() ) );

    // pricing
    realEstate.setPrice( getDefaultPrice() );
    realEstate.getPrice().setMarketingType( MarketingType.RENT );
    realEstate.getPrice().setPriceIntervalType( PriceIntervalType.MONTH );
    realEstate.getPrice().setValue( getRandomDecimal( 500, 9999 ) );
  }

  /**
   * Initialize a {@link ShortTermAccommodation} object with random values.
   *
   * @param realEstate
   * object to initialize
   */
  protected void initRealEstate( ShortTermAccommodation realEstate )
  {
    realEstate.setBalcony( getRandomBoolean() );
    realEstate.setBaseRent( getRandomDecimal( 200, 1500 ) );
    realEstate.setCellar( getRandomBoolean() );
    realEstate.setCondition( getRandomRealEstateCondition() );
    realEstate.setDeposit( StringUtils.abbreviate( LOREM.getWords( 1, 10 ), 50 ) );
    realEstate.setEndRentalDate( getRandomCalendar() );
    realEstate.setEnergySourcesEnev2014( createRandomEnergySourcesEnev2014() );
    realEstate.setFloor( String.valueOf( getRandomLong( 5 ) ) );
    realEstate.setGarden( getRandomBoolean() );
    realEstate.setGender( getRandomFlatMateGenderType() );
    realEstate.setGuestToilet( getRandomBoolean() );
    realEstate.setHandicappedAccessible( getRandomBoolean() );
    realEstate.setHasFurniture( getRandomYesNoNotApplicableType() );
    realEstate.setHeatingTypeEnev2014( getRandomHeatingTypeEnev2014() );
    realEstate.setLift( getRandomBoolean() );
    realEstate.setLivingSpace( getRandomDecimal( 20, 300 ) );
    realEstate.setMaxNumberOfPersons( getRandomLong( 4, 10 ) );
    realEstate.setMaxRentalTime( getRandomDecimal( 12, 24 ) );
    realEstate.setMinRentalTime( getRandomDecimal( 3, 12 ) );
    realEstate.setNonSmoker( getRandomBoolean() );
    realEstate.setNumberOfFloors( getRandomLong( 1, 10 ) );
    realEstate.setNumberOfParkingSpaces( getRandomLong( 1, 10 ) );
    realEstate.setNumberOfRooms( getRandomDecimal( 1, 10 ) );
    realEstate.setParkingSpacePrice( getRandomDecimal( 30, 300 ) );
    realEstate.setParkingSpaceType( getRandomParkingSpaceType() );
    realEstate.setPetsAllowed( getRandomPetsAllowedType() );
    realEstate.setServiceCharge( getRandomDecimal( 50, 500 ) );
    realEstate.setShortTermAccomodationType( getRandomShortTermAccommodationType() );
    realEstate.setStartRentalDate( getRandomCalendar() );

    // construction year
    if (getRandomBoolean())
    {
      realEstate.setConstructionYear( null );
      realEstate.setConstructionYearUnknown( true );
    }
    else
    {
      realEstate.setConstructionYear( getRandomLong( 1900, 1980 ) );
    }

    // courtage
    realEstate.setCourtage( commonFactory.createCourtageInfo() );
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( LOREM.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( LOREM.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.getCourtage().setHasCourtage( YesNoNotApplicableType.YES );

    // energy certificate for habitation
    realEstate.setEnergyCertificate( commonFactory.createEnergyPerformanceCertificate() );

    // energy certificate for habitation by consumption
    if (getRandomBoolean())
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_CONSUMPTION );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setEnergyConsumptionContainsWarmWater( getRandomYesNotApplicableType() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
    }

    // energy certificate for habitation by demand
    else
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_REQUIRED );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
    }

    // pricing
    realEstate.setPrice( getDefaultPrice() );
    realEstate.getPrice().setMarketingType( MarketingType.RENT );
    realEstate.getPrice().setPriceIntervalType( PriceIntervalType.MONTH );
    realEstate.getPrice().setValue( getRandomDecimal( 200, 9999 ) );
  }

  /**
   * Initialize a {@link SpecialPurpose} object with random values.
   *
   * @param realEstate
   * object to initialize
   */
  protected void initRealEstate( SpecialPurpose realEstate )
  {
    realEstate.setAdditionalArea( getRandomDecimal( 250, 5000 ) );
    realEstate.setBasement( getRandomYesNotApplicableType() );
    realEstate.setCondition( getRandomRealEstateCondition() );
    realEstate.setDeposit( StringUtils.abbreviate( LOREM.getWords( 1, 10 ), 50 ) );
    realEstate.setDistanceToAirport( getRandomLong( 5, 50 ) );
    realEstate.setDistanceToFM( getRandomLong( 5, 50 ) );
    realEstate.setDistanceToMRS( getRandomLong( 5, 50 ) );
    realEstate.setDistanceToPT( getRandomLong( 5, 50 ) );
    realEstate.setEnergySourcesEnev2014( createRandomEnergySourcesEnev2014() );
    realEstate.setFlooringType( getRandomFlooringType() );
    realEstate.setFreeFrom( StringUtils.abbreviate( LOREM.getWords( 1, 10 ), 50 ) );
    realEstate.setHeatingTypeEnev2014( getRandomHeatingTypeEnev2014() );
    realEstate.setInteriorQuality( getRandomInteriorQuality() );
    realEstate.setLastRefurbishment( getRandomLong( 1990, 2014 ) );
    realEstate.setLift( getRandomYesNotApplicableType() );
    realEstate.setListed( getRandomYesNotApplicableType() );
    realEstate.setMinDivisible( getRandomDecimal( 500, 2500 ) );
    realEstate.setNetFloorSpace( getRandomDecimal( 50, 5000 ) );
    realEstate.setNumberOfFloors( String.valueOf( getRandomInt( 1, 10 ) ) );
    realEstate.setNumberOfParkingSpaces( getRandomLong( 1, 10 ) );
    realEstate.setParkingSpacePrice( getRandomDecimal( 30, 300 ) );
    realEstate.setPlotArea( getRandomDecimal( 100, 5000 ) );
    realEstate.setSpecialPurposePropertyType( getRandomSpecialPurposeType() );
    realEstate.setTotalFloorSpace( getRandomDecimal( 50, 500 ) );

    // construction year
    if (getRandomBoolean())
    {
      realEstate.setConstructionYear( null );
      realEstate.setConstructionYearUnknown( true );
    }
    else
    {
      realEstate.setConstructionYear( getRandomLong( 1900, 1980 ) );
    }

    // courtage
    realEstate.setCourtage( commonFactory.createCourtageInfo() );
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( LOREM.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( LOREM.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.getCourtage().setHasCourtage( YesNoNotApplicableType.YES );

    // energy certificate for business
    realEstate.setEnergyCertificate( commonFactory.createEnergyPerformanceCertificate() );

    // energy certificate for business by consumption
    if (getRandomBoolean())
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_CONSUMPTION );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.getEnergyCertificate().setElectricityConsumption( getRandomDecimal( 10, 250 ) );
        realEstate.getEnergyCertificate().setHeatingConsumption( getRandomDecimal( 10, 250 ) );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
        realEstate.setEnergyConsumptionContainsWarmWater( getRandomYesNotApplicableType() );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyConsumptionElectricity( getRandomDecimal( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyConsumptionHeating( getRandomDecimal( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
    }

    // energy certificate for business by demand
    else
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_REQUIRED );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setThermalCharacteristicElectricity( getRandomDecimal( 500, 2500 ) );
        realEstate.getEnergyCertificate().setThermalCharacteristicHeating( getRandomDecimal( 500, 2500 ) );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
    }

    // pricing for rent
    if (getRandomBoolean())
    {
      realEstate.setCommercializationType( CommercializationType.RENT );
      realEstate.setPrice( getDefaultPrice() );
      realEstate.getPrice().setMarketingType( MarketingType.RENT );
      realEstate.getPrice().setPriceIntervalType( PriceIntervalType.MONTH );
      realEstate.getPrice().setValue( getRandomDecimal( 500, 5000 ) );
    }

    // pricing for purchase
    else
    {
      realEstate.setCommercializationType( CommercializationType.BUY );
      realEstate.setPrice( getDefaultPrice() );
      realEstate.getPrice().setMarketingType( MarketingType.PURCHASE );
      realEstate.getPrice().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
      realEstate.getPrice().setValue( getRandomDecimal( 50000, 999999 ) );
    }

    // pricing / additional costs
    realEstate.setAdditionalCosts( getDefaultPrice() );
    realEstate.getAdditionalCosts().setPriceIntervalType( PriceIntervalType.MONTH );
    realEstate.getAdditionalCosts().setValue( getRandomDecimal( 500, 5000 ) );

    // pricing / calculated price
    //realEstate.setCalculatedPrice( getDefaultPrice() );
    //realEstate.getCalculatedPrice().setValue( value );
  }

  /**
   * Initialize a {@link Store} object with random values.
   *
   * @param realEstate
   * object to initialize
   */
  protected void initRealEstate( Store realEstate )
  {
    realEstate.setAdditionalArea( getRandomDecimal( 250, 5000 ) );
    realEstate.setCellar( getRandomYesNotApplicableType() );
    realEstate.setCondition( getRandomRealEstateCondition() );
    realEstate.setDeposit( StringUtils.abbreviate( LOREM.getWords( 1, 10 ), 50 ) );
    realEstate.setDistanceToAirport( getRandomLong( 5, 50 ) );
    realEstate.setDistanceToFM( getRandomLong( 5, 50 ) );
    realEstate.setDistanceToMRS( getRandomLong( 5, 50 ) );
    realEstate.setDistanceToPT( getRandomLong( 5, 50 ) );
    realEstate.setEnergySourcesEnev2014( createRandomEnergySourcesEnev2014() );
    realEstate.setFloorLoad( getRandomDecimal( 500, 50000 ) );
    realEstate.setFlooringType( getRandomFlooringType() );
    realEstate.setFreeFrom( StringUtils.abbreviate( LOREM.getWords( 1, 10 ), 50 ) );
    realEstate.setGoodsLift( getRandomYesNotApplicableType() );
    realEstate.setGoodsLiftLoad( getRandomDecimal( 500, 50000 ) );
    realEstate.setHeatingTypeEnev2014( getRandomHeatingTypeEnev2014() );
    realEstate.setInteriorQuality( getRandomInteriorQuality() );
    realEstate.setLastRefurbishment( getRandomLong( 1990, 2014 ) );
    realEstate.setLift( getRandomYesNotApplicableType() );
    realEstate.setListed( getRandomYesNotApplicableType() );
    realEstate.setLocationClassificationType( getRandomLocationClassificationType() );
    realEstate.setMinDivisible( getRandomDecimal( 500, 2500 ) );
    realEstate.setNetFloorSpace( getRandomDecimal( 50, 5000 ) );
    realEstate.setNumberOfFloors( String.valueOf( getRandomInt( 1, 10 ) ) );
    realEstate.setNumberOfParkingSpaces( getRandomLong( 1, 10 ) );
    realEstate.setParkingSpacePrice( getRandomDecimal( 30, 300 ) );
    realEstate.setRamp( getRandomYesNotApplicableType() );
    realEstate.setShopWindowLength( getRandomDecimal( 2, 15 ) );
    realEstate.setStoreType( getRandomStoreType() );
    realEstate.setSupplyType( getRandomSupplyType() );
    realEstate.setTotalFloorSpace( getRandomDecimal( 50, 500 ) );

    // construction year
    if (getRandomBoolean())
    {
      realEstate.setConstructionYear( null );
      realEstate.setConstructionYearUnknown( true );
    }
    else
    {
      realEstate.setConstructionYear( getRandomLong( 1900, 1980 ) );
    }

    // courtage
    realEstate.setCourtage( commonFactory.createCourtageInfo() );
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( LOREM.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( LOREM.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.getCourtage().setHasCourtage( YesNoNotApplicableType.YES );

    // energy certificate for business
    realEstate.setEnergyCertificate( commonFactory.createEnergyPerformanceCertificate() );

    // energy certificate for business by consumption
    if (getRandomBoolean())
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_CONSUMPTION );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.getEnergyCertificate().setElectricityConsumption( getRandomDecimal( 10, 250 ) );
        realEstate.getEnergyCertificate().setHeatingConsumption( getRandomDecimal( 10, 250 ) );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
        realEstate.setEnergyConsumptionContainsWarmWater( getRandomYesNotApplicableType() );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyConsumptionElectricity( getRandomDecimal( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyConsumptionHeating( getRandomDecimal( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
    }

    // energy certificate for business by demand
    else
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_REQUIRED );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setThermalCharacteristicElectricity( getRandomDecimal( 500, 2500 ) );
        realEstate.getEnergyCertificate().setThermalCharacteristicHeating( getRandomDecimal( 500, 2500 ) );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDecimal( 20, 500 ) );
      }
    }

    // pricing for rent
    if (getRandomBoolean())
    {
      realEstate.setCommercializationType( CommercializationType.RENT );
      realEstate.setPrice( getDefaultPrice() );
      realEstate.getPrice().setMarketingType( MarketingType.RENT );
      realEstate.getPrice().setPriceIntervalType( PriceIntervalType.MONTH );
      realEstate.getPrice().setValue( getRandomDecimal( 500, 5000 ) );
    }

    // pricing for purchase
    else
    {
      realEstate.setCommercializationType( CommercializationType.BUY );
      realEstate.setPrice( getDefaultPrice() );
      realEstate.getPrice().setMarketingType( MarketingType.PURCHASE );
      realEstate.getPrice().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
      realEstate.getPrice().setValue( getRandomDecimal( 50000, 999999 ) );
    }

    // pricing / additional costs
    realEstate.setAdditionalCosts( getDefaultPrice() );
    realEstate.getAdditionalCosts().setPriceIntervalType( PriceIntervalType.MONTH );
    realEstate.getAdditionalCosts().setValue( getRandomDecimal( 500, 5000 ) );

    // pricing / calculated price
    //realEstate.setCalculatedPrice( getDefaultPrice() );
    //realEstate.getCalculatedPrice().setValue( value );
  }

  /**
   * Initialize a {@link TradeSite} object with random values.
   *
   * @param realEstate
   * object to initialize
   */
  protected void initRealEstate( TradeSite realEstate )
  {
    realEstate.setBuildingPermission( getRandomBoolean() );
    realEstate.setDemolition( getRandomBoolean() );
    realEstate.setFreeFrom( StringUtils.abbreviate( LOREM.getWords( 1, 10 ), 50 ) );
    realEstate.setGfz( getRandomDecimal( 1, 10 ) );
    realEstate.setGrz( getRandomDecimal( 1, 10 ) );
    realEstate.setMinDivisible( getRandomDecimal( 500, 2500 ) );
    realEstate.setPlotArea( getRandomDecimal( 100, 5000 ) );
    realEstate.setRecommendedUseTypes( createRandomSiteRecommendedUseForTradeTypes() );
    realEstate.setShortTermConstructible( getRandomBoolean() );
    realEstate.setSiteConstructibleType( getRandomSiteConstructibleType() );
    realEstate.setSiteDevelopmentType( getRandomSiteDevelopmentType() );
    realEstate.setTenancy( getRandomLong( 100 ) );
    realEstate.setUtilizationTradeSite( getRandomUtilizationTradeSite() );

    // courtage
    realEstate.setCourtage( commonFactory.createCourtageInfo() );
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( LOREM.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( LOREM.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.getCourtage().setHasCourtage( YesNoNotApplicableType.YES );

    // pricing for leasing
    if (getRandomBoolean())
    {
      realEstate.setCommercializationType( CommercializationType.LEASE );
      realEstate.setPrice( getDefaultPrice() );
      realEstate.getPrice().setMarketingType( MarketingType.LEASE );
      realEstate.getPrice().setPriceIntervalType( PriceIntervalType.YEAR );
      realEstate.getPrice().setValue( getRandomDecimal( 50000, 999999 ) );
    }

    // pricing for purchase
    else
    {
      realEstate.setCommercializationType( CommercializationType.BUY );
      realEstate.setPrice( getDefaultPrice() );
      realEstate.getPrice().setMarketingType( MarketingType.PURCHASE );
      realEstate.getPrice().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
      realEstate.getPrice().setValue( getRandomDecimal( 50000, 999999 ) );
    }
  }

  /**
   * Enumeration of real estate types.
   * <p>
   * These real estate types are supported by the
   * {@link RandomRealEstateFactory}.
   */
  public static enum Type {
    APARTMENT_BUY(ApartmentBuy.class),
    APARTMENT_RENT(ApartmentRent.class),
    ASSISTED_LIVING(AssistedLiving.class),
    COMPULSORY_AUCTION(CompulsoryAuction.class),
    FLAT_SHARE_ROOM(FlatShareRoom.class),
    GARAGE_BUY(GarageBuy.class),
    GARAGE_RENT(GarageRent.class),
    GASTRONOMY(Gastronomy.class),
    HOUSE_BUY(HouseBuy.class),
    HOUSE_RENT(HouseRent.class),
    HOUSE_TYPE(HouseType.class),
    INDUSTRY(Industry.class),
    INVESTMENT(Investment.class),
    LIVING_BUY_SITE(LivingBuySite.class),
    LIVING_RENT_SITE(LivingRentSite.class),
    OFFICE(Office.class),
    SENIOR_CARE(SeniorCare.class),
    SHORT_TERM_ACCOMODATION(ShortTermAccommodation.class),
    SPECIAL_PURPOSE(SpecialPurpose.class),
    STORE(Store.class),
    TRADE_SITE(TradeSite.class);

    private final Class typeClass;

    private Type( Class typeClass )
    {
      this.typeClass = typeClass;
    }

    /**
     * Create an empty {@link RealEstate} object of this type.
     *
     * @return
     * empty {@link RealEstate} object
     */
    public RealEstate create()
    {
      try
      {
        return (RealEstate) this.typeClass.newInstance();
      }
      catch (Exception ex)
      {
        LOGGER.error( "Can't create real estate object for " + name() + "!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
        return null;
      }
    }

    /**
     * Return the corresponding JAXB class to create a real estate object of
     * this type.
     *
     * @return
     * JAXB class of this type
     */
    public Class getTypeClass()
    {
      return typeClass;
    }
  }
}