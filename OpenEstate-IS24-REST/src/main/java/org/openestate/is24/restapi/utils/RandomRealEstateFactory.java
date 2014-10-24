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

package org.openestate.is24.restapi.utils;

import com.thedeanda.lorem.Lorem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.RandomUtils;
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
import org.openestate.is24.restapi.xml.common.RoomType;
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
 *
 * @author Andreas Rudolph <andy@openindex.de>
 */
public class RandomRealEstateFactory
{
  private final static Logger LOGGER = LoggerFactory.getLogger( RandomRealEstateFactory.class );
  private final org.openestate.is24.restapi.xml.common.ObjectFactory commonFactory =
    new org.openestate.is24.restapi.xml.common.ObjectFactory();
  private final org.openestate.is24.restapi.xml.realestates.ObjectFactory realEstatesFactory =
    new org.openestate.is24.restapi.xml.realestates.ObjectFactory();

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

  public RealEstate createRandomObject()
  {
    return createRandomObject( null );
  }

  public RealEstate createRandomObject( Type type )
  {
    if (type==null) type = getRandomObjectType();
    RealEstate realEstate = type.create();
    init( realEstate );
    return realEstate;
  }

  public Wgs84Address createRandomObjectAddress()
  {
    Wgs84Address address = commonFactory.createWgs84Address();
    initAddress( address );
    return address;
  }

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

  public Price getDefaultPrice()
  {
    Price price = commonFactory.createPrice();
    price.setCurrency( Currency.EUR );
    return price;
  }

  public static AirConditioningType getRandomAirConditioningType()
  {
    return (AirConditioningType) getRandomValue( AirConditioningType.values() );
  }

  public static ApartmentType getRandomApartmentType()
  {
    return (ApartmentType) getRandomValue( ApartmentType.values() );
  }

  public static BalconyAvailableType getRandomBalconyAvailableType()
  {
    return (BalconyAvailableType) getRandomValue( BalconyAvailableType.values() );
  }

  public static boolean getRandomBoolean()
  {
    return RandomUtils.nextBoolean();
  }

  public static BuildingType getRandomBuildingType()
  {
    return (BuildingType) getRandomValue( BuildingType.values() );
  }

  public static Calendar getRandomCalendar()
  {
    return getRandomCalendar( 1990, 2015 );
  }

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

  public static CareLevelExpose getRandomCareLevel()
  {
    return (CareLevelExpose) getRandomValue( CareLevelExpose.values() );
  }

  public static CompulsoryAuctionType getRandomCompulsoryAuctionType()
  {
    return (CompulsoryAuctionType) getRandomValue( CompulsoryAuctionType.values() );
  }

  public static ConstructionPhaseType getRandomConstructionPhaseType()
  {
    return (ConstructionPhaseType) getRandomValue( ConstructionPhaseType.values() );
  }

  public static Date getRandomDate()
  {
    return getRandomCalendar().getTime();
  }

  public static Date getRandomDate( int minYear, int maxYear )
  {
    return getRandomCalendar( minYear, maxYear ).getTime();
  }

  public static double getRandomDouble( int max )
  {
    return getRandomDouble( 0, max );
  }

  public static double getRandomDouble( int min, int max )
  {
    if (min>max)
    {
      throw new IllegalArgumentException(
        "Minimum value is bigger than maximum value!" );
    }
    if (min==max)
    {
      return (double) min;
    }
    return (RandomUtils.nextDouble() * (max - min)) + min;
  }

  public static EnergyEfficiencyClass getRandomEnergyEfficiencyClass()
  {
    return (EnergyEfficiencyClass) getRandomValue( EnergyEfficiencyClass.values() );
  }

  public static FacilityType getRandomFacilityType()
  {
    return (FacilityType) getRandomValue( FacilityType.values() );
  }

  public static FlatMateGenderType getRandomFlatMateGenderType()
  {
    return (FlatMateGenderType) getRandomValue( FlatMateGenderType.values() );
  }

  public static FlooringType getRandomFlooringType()
  {
    return (FlooringType) getRandomValue( FlooringType.values() );
  }

  public static GarageType getRandomGarageType()
  {
    return (GarageType) getRandomValue( GarageType.values() );
  }

  public static GastronomyType getRandomGastronomyType()
  {
    return (GastronomyType) getRandomValue( GastronomyType.values() );
  }

  public static HeatingTypeEnev2014 getRandomHeatingTypeEnev2014()
  {
    return (HeatingTypeEnev2014) getRandomValue( HeatingTypeEnev2014.values() );
  }

  public static HouseTypeBuildingType getRandomHouseTypeBuildingType()
  {
    return (HouseTypeBuildingType) getRandomValue( HouseTypeBuildingType.values() );
  }

  public static HouseTypeConstructionMethodType getRandomHouseTypeConstructionMethodType()
  {
    return (HouseTypeConstructionMethodType) getRandomValue( HouseTypeConstructionMethodType.values() );
  }

  public static HouseTypeEnergyStandardType getRandomHouseTypeEnergyStandardType()
  {
    return (HouseTypeEnergyStandardType) getRandomValue( HouseTypeEnergyStandardType.values() );
  }

  public static HouseTypeStageOfCompletionType getRandomHouseTypeStageOfCompletionType()
  {
    return (HouseTypeStageOfCompletionType) getRandomValue( HouseTypeStageOfCompletionType.values() );
  }

  public static IndustryType getRandomIndustryType()
  {
    return (IndustryType) getRandomValue( IndustryType.values() );
  }

  public static int getRandomInt( int max )
  {
    return getRandomInt( 0, max );
  }

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
    int value = RandomUtils.nextInt( max - min ) + 1;
    return max - value;
  }

  public static InteriorQuality getRandomInteriorQuality()
  {
    return (InteriorQuality) getRandomValue( InteriorQuality.values() );
  }

  public static InternetConnectionType getRandomInternetConnectionType()
  {
    return (InternetConnectionType) getRandomValue( InternetConnectionType.values() );
  }

  public static InvestmentType getRandomInvestmentType()
  {
    return (InvestmentType) getRandomValue( InvestmentType.values() );
  }

  public static ItInfrastructureType getRandomItInfrastructureType()
  {
    return (ItInfrastructureType) getRandomValue( ItInfrastructureType.values() );
  }

  public static LocationClassificationType getRandomLocationClassificationType()
  {
    return (LocationClassificationType) getRandomValue( LocationClassificationType.values() );
  }

  public static Type getRandomObjectType()
  {
    return (Type) getRandomValue( Type.values() );
  }

  public static OfficeType getRandomOfficeType()
  {
    return (OfficeType) getRandomValue( OfficeType.values() );
  }

  public static ParkingSituationType getRandomParkingSituationType()
  {
    return (ParkingSituationType) getRandomValue( ParkingSituationType.values() );
  }

  public static ParkingSpaceType getRandomParkingSpaceType()
  {
    return (ParkingSpaceType) getRandomValue( ParkingSpaceType.values() );
  }

  public static PetsAllowedType getRandomPetsAllowedType()
  {
    return (PetsAllowedType) getRandomValue( PetsAllowedType.values() );
  }

  public static RealEstateCondition getRandomRealEstateCondition()
  {
    return (RealEstateCondition) getRandomValue( RealEstateCondition.values() );
  }

  public static RoomType getRandomRoomType()
  {
    return (RoomType) getRandomValue( RoomType.values() );
  }

  public static ShortTermAccommodationType getRandomShortTermAccommodationType()
  {
    return (ShortTermAccommodationType) getRandomValue( ShortTermAccommodationType.values() );
  }

  public static SiteConstructibleType getRandomSiteConstructibleType()
  {
    return (SiteConstructibleType) getRandomValue( SiteConstructibleType.values() );
  }

  public static SiteDevelopmentType getRandomSiteDevelopmentType()
  {
    return (SiteDevelopmentType) getRandomValue( SiteDevelopmentType.values() );
  }

  public static SmokingAllowedType getRandomSmokingAllowedType()
  {
    return (SmokingAllowedType) getRandomValue( SmokingAllowedType.values() );
  }

  public static SpecialPurposeType getRandomSpecialPurposeType()
  {
    return (SpecialPurposeType) getRandomValue( SpecialPurposeType.values() );
  }

  public static StoreType getRandomStoreType()
  {
    return (StoreType) getRandomValue( StoreType.values() );
  }

  public static SupplyType getRandomSupplyType()
  {
    return (SupplyType) getRandomValue( SupplyType.values() );
  }

  public static TelephoneConnectionType getRandomTelephoneConnectionType()
  {
    return (TelephoneConnectionType) getRandomValue( TelephoneConnectionType.values() );
  }

  public static TvConnectionType getRandomTvConnectionType()
  {
    return (TvConnectionType) getRandomValue( TvConnectionType.values() );
  }

  public static UtilizationTradeSite getRandomUtilizationTradeSite()
  {
    return (UtilizationTradeSite) getRandomValue( UtilizationTradeSite.values() );
  }

  public static YesNoNotApplicableType getRandomYesNo()
  {
    return (getRandomBoolean())?
      YesNoNotApplicableType.YES: YesNoNotApplicableType.NO;
  }

  public static YesNoNotApplicableType getRandomYesNoNotApplicableType()
  {
    return (YesNoNotApplicableType) getRandomValue( YesNoNotApplicableType.values() );
  }

  public static YesNotApplicableType getRandomYesNotApplicableType()
  {
    return (YesNotApplicableType) getRandomValue( YesNotApplicableType.values() );
  }

  public static Object getRandomValue( Object[] values )
  {
    return (!ArrayUtils.isEmpty( values ))?
      values[RandomUtils.nextInt( values.length )]: null;
  }

  public void init( RealEstate realEstate )
  {
    realEstate.setAddress( createRandomObjectAddress() );
    //realEstate.setApiSearchData( value );
    //realEstate.setAttachments( value );
    //realEstate.setCreationDate( value );
    realEstate.setDescriptionNote( StringUtils.abbreviate( Lorem.getParagraphs( 2, 10 ), 2000 ) );
    realEstate.setExternalId( String.valueOf( getRandomInt( 1000 ) ) );
    realEstate.setFurnishingNote( StringUtils.abbreviate( Lorem.getParagraphs( 2, 10 ), 2000 ) );
    realEstate.setGroupNumber( getRandomInt( 100 ) );
    //realEstate.setId( value );
    realEstate.setLastModificationDate( Calendar.getInstance() );
    realEstate.setLocationNote( StringUtils.abbreviate( Lorem.getParagraphs( 2, 10 ), 2000 ) );
    realEstate.setOtherNote( StringUtils.abbreviate( Lorem.getParagraphs( 2, 10 ), 2000 ) );
    //realEstate.setPublishChannels( value );
    //realEstate.setRealEstateProjectId( value );
    realEstate.setRealEstateState( RealEstateState.ACTIVE );
    //realEstate.setReferencePriceApiCall( value );
    //realEstate.setReferencePriceServiceCall( value );
    realEstate.setShowAddress( getRandomBoolean() );
    realEstate.setTitle( StringUtils.abbreviate( Lorem.getTitle( 3, 15 ), 100 ) );

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

  protected void initAddress( Address address )
  {
    address.setCity( "Berlin" );
    address.setHouseNumber( String.valueOf( getRandomInt( 1, 1000 ) ) );
    //address.setInternationalCountryRegion( value );
    address.setPostcode( "13125" );
    address.setStreet( "Beispielstraße" );
  }

  protected void initAddress( Wgs84Address address )
  {
    initAddress( (Address) address );

    address.setPreciseHouseNumber( getRandomBoolean() );
    address.setQuarter( Lorem.getWords( 1, 3 ) );

    address.setDescription( commonFactory.createWgs84AddressDescription() );
    address.getDescription().setText( StringUtils.abbreviate( Lorem.getWords( 1, 15 ), 1000 ) );

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
    realEstate.setFreeFrom( StringUtils.abbreviate( Lorem.getWords( 1, 10 ), 50 ) );
    realEstate.setGarden( getRandomBoolean() );
    realEstate.setGuestToilet( getRandomYesNotApplicableType() );
    realEstate.setHandicappedAccessible( getRandomYesNotApplicableType() );
    realEstate.setHeatingTypeEnev2014( getRandomHeatingTypeEnev2014() );
    realEstate.setInteriorQuality( getRandomInteriorQuality() );
    realEstate.setLastRefurbishment( getRandomInt( 1990, 2014 ) );
    realEstate.setLift( getRandomBoolean() );
    realEstate.setListed( getRandomYesNotApplicableType() );
    realEstate.setLivingSpace( getRandomDouble( 20, 300 ) );
    realEstate.setNumberOfBathRooms( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfBedRooms( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfFloors( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfParkingSpaces( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfRooms( getRandomInt( 1, 10 ) );
    realEstate.setParkingSpacePrice( getRandomDouble( 30, 300 ) );
    realEstate.setParkingSpaceType( getRandomParkingSpaceType() );
    realEstate.setRentalIncome( getRandomDouble( 9999, 9999999 ) );
    realEstate.setRented( getRandomYesNotApplicableType() );
    realEstate.setServiceCharge( getRandomDouble( 50, 500 ) );
    realEstate.setSummerResidencePractical( getRandomYesNotApplicableType() );
    realEstate.setUsableFloorSpace( getRandomDouble( 20, 300 ) );

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
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( Lorem.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( Lorem.getParagraphs( 2, 10 ), 1000 ) );
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
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
    }

    // energy certificate for habitation by demand
    else
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_REQUIRED );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
    }

    // pricing
    realEstate.setPrice( getDefaultPrice() );
    realEstate.getPrice().setMarketingType( MarketingType.PURCHASE );
    realEstate.getPrice().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
    realEstate.getPrice().setValue( getRandomDouble( 10000, 9999999 ) );
  }

  protected void initRealEstate( ApartmentRent realEstate )
  {
    realEstate.setApartmentType( getRandomApartmentType() );
    realEstate.setBalcony( getRandomBoolean() );
    realEstate.setBaseRent( getRandomDouble( 200, 2500 ) );
    realEstate.setBuiltInKitchen( getRandomBoolean() );
    realEstate.setCellar( getRandomYesNotApplicableType() );
    realEstate.setCertificateOfEligibilityNeeded( getRandomBoolean() );
    realEstate.setCondition( getRandomRealEstateCondition() );
    realEstate.setDeposit( StringUtils.abbreviate( Lorem.getWords( 1, 10 ), 50 ) );
    realEstate.setEnergySourcesEnev2014( createRandomEnergySourcesEnev2014() );
    realEstate.setFloor( getRandomInt( 5 ) );
    realEstate.setFreeFrom( StringUtils.abbreviate( Lorem.getWords( 1, 10 ), 50 ) );
    realEstate.setGarden( getRandomBoolean() );
    realEstate.setGuestToilet( getRandomYesNotApplicableType() );
    realEstate.setHandicappedAccessible( getRandomYesNotApplicableType() );
    realEstate.setHeatingCosts( getRandomDouble( 100, 500 ) );
    realEstate.setHeatingCostsInServiceCharge( getRandomYesNo() );
    realEstate.setHeatingTypeEnev2014( getRandomHeatingTypeEnev2014() );
    realEstate.setInteriorQuality( getRandomInteriorQuality() );
    realEstate.setLastRefurbishment( getRandomInt( 1990, 2014 ) );
    realEstate.setLift( getRandomBoolean() );
    realEstate.setLivingSpace( getRandomDouble( 20, 300 ) );
    realEstate.setNumberOfBathRooms( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfBedRooms( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfFloors( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfParkingSpaces( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfRooms( getRandomInt( 1, 10 ) );
    realEstate.setParkingSpacePrice( getRandomDouble( 30, 300 ) );
    realEstate.setParkingSpaceType( getRandomParkingSpaceType() );
    realEstate.setPetsAllowed( getRandomPetsAllowedType() );
    realEstate.setServiceCharge( getRandomDouble( 50, 500 ) );
    realEstate.setTotalRent( getRandomDouble( 500, 3000 ) );
    realEstate.setUsableFloorSpace( getRandomDouble( 20, 300 ) );
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
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( Lorem.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( Lorem.getParagraphs( 2, 10 ), 1000 ) );
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
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
    }

    // energy certificate for habitation by demand
    else
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_REQUIRED );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
    }

    // pricing
    realEstate.setPrice( getDefaultPrice() );
    realEstate.getPrice().setMarketingType( MarketingType.RENT );
    realEstate.getPrice().setPriceIntervalType( PriceIntervalType.MONTH );
    realEstate.getPrice().setValue( getRandomDouble( 200, 9999 ) );
  }

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
    realEstate.setLivingSpaceFrom( getRandomDouble( 20, 50 ) );
    realEstate.setLivingSpaceTo( getRandomDouble( 50, 150 ) );
    realEstate.setLoansAvailable( getRandomYesNotApplicableType() );
    realEstate.setMedicalAssistanceAvailable( getRandomYesNotApplicableType() );
    realEstate.setNumberOfLookedAfterApartments( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfNursingPlaces( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfRoomsFrom( (double) getRandomInt( 1, 2 ) );
    realEstate.setNumberOfRoomsTo( (double) getRandomInt( 3, 5 ) );
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
    realEstate.setShortDescription( StringUtils.abbreviate( Lorem.getWords( 3, 15 ), 200 ) );
    realEstate.setTrialLivingPossible( getRandomYesNotApplicableType() );

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
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
    }

    // energy certificate for habitation by demand
    else
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_REQUIRED );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
    }

    // pricing for rent
    if (getRandomBoolean())
    {
      realEstate.setMarketingType( MarketingType.RENT );
      realEstate.setMinBaseRent( getDefaultPrice() );
      realEstate.getMinBaseRent().setMarketingType( MarketingType.RENT );
      realEstate.getMinBaseRent().setPriceIntervalType( PriceIntervalType.MONTH );
      realEstate.getMinBaseRent().setValue( getRandomDouble( 500, 5000 ) );
    }

    // pricing for purchase
    else
    {
      realEstate.setMarketingType( MarketingType.PURCHASE );
      realEstate.setMinPurchasePrice( getDefaultPrice() );
      realEstate.getMinPurchasePrice().setMarketingType( MarketingType.PURCHASE );
      realEstate.getMinPurchasePrice().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
      realEstate.getMinPurchasePrice().setValue( getRandomDouble( 50000, 999999 ) );
    }
  }

  protected void initRealEstate( CompulsoryAuction realEstate )
  {
    realEstate.setArea( getRandomDouble( 50, 500 ) );
    realEstate.setAuctionObjectType( getRandomCompulsoryAuctionType() );
    realEstate.setCancellationDate( getRandomCalendar() );
    realEstate.setDateOfAuction( getRandomCalendar() );
    realEstate.setEnergySourcesEnev2014( createRandomEnergySourcesEnev2014() );
    realEstate.setFileReferenceAtCountyCourt( RandomStringUtils.randomAlphanumeric( 8 ) );
    realEstate.setHeatingTypeEnev2014( getRandomHeatingTypeEnev2014() );
    realEstate.setLastChangeDate( getRandomCalendar() );
    realEstate.setNumberOfFolio( String.valueOf( getRandomInt( 1, 10 ) ) );
    realEstate.setOwner( Lorem.getName() );
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
    realEstate.getCountyCourt().setName( Lorem.getWords( 3 ) );

    // energy certificate for habitation and business
    realEstate.setEnergyCertificate( commonFactory.createEnergyPerformanceCertificate() );

    // energy certificate for habitation and business by consumption
    if (getRandomBoolean())
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_CONSUMPTION );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.getEnergyCertificate().setElectricityConsumption( getRandomDouble( 10, 250 ) );
        realEstate.getEnergyCertificate().setHeatingConsumption( getRandomDouble( 10, 250 ) );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
        realEstate.setEnergyConsumptionContainsWarmWater( getRandomYesNotApplicableType() );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyConsumptionElectricity( getRandomDouble( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyConsumptionHeating( getRandomDouble( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
    }

    // energy certificate for habitation and business by demand
    else
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_REQUIRED );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setThermalCharacteristicElectricity( getRandomDouble( 10, 250 ) );
        realEstate.getEnergyCertificate().setThermalCharacteristicHeating( getRandomDouble( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
    }

    // pricing / lowest bid
    realEstate.setLowestBid( getDefaultPrice() );
    realEstate.getLowestBid().setMarketingType( MarketingType.PURCHASE );
    realEstate.getLowestBid().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
    realEstate.getLowestBid().setValue( getRandomDouble( 10000, 250000 ) );

    // pricing / market value
    realEstate.setMarketValue( getDefaultPrice() );
    realEstate.getMarketValue().setMarketingType( MarketingType.PURCHASE );
    realEstate.getMarketValue().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
    realEstate.getMarketValue().setValue( getRandomDouble( 50000, 500000 ) );
  }

  protected void initRealEstate( FlatShareRoom realEstate )
  {
    realEstate.setAgeOfFlatMatesFrom( getRandomInt( 16, 30 ) );
    realEstate.setAgeOfFlatMatesTo( getRandomInt( 30, 50 ) );
    realEstate.setAgeOfRequestedFrom( getRandomInt( 16, 30 ) );
    realEstate.setAgeOfRequestedTo( getRandomInt( 30, 50 ) );
    realEstate.setApartmentType( getRandomApartmentType() );
    realEstate.setBalcony( getRandomYesNotApplicableType() );
    realEstate.setBarrierFree( getRandomYesNotApplicableType() );
    realEstate.setBaseRent( getRandomDouble( 200, 1000 ) );
    realEstate.setBathHasShower( getRandomYesNotApplicableType() );
    realEstate.setBathHasTub( getRandomYesNotApplicableType() );
    realEstate.setBathHasWc( getRandomYesNotApplicableType() );
    realEstate.setCellar( getRandomYesNotApplicableType() );
    realEstate.setDeposit( StringUtils.abbreviate( Lorem.getWords( 1, 10 ), 50 ) );
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
    realEstate.setHeatingCosts( getRandomDouble( 100, 500 ) );
    realEstate.setHeatingCostsInServiceCharge( getRandomYesNo() );
    realEstate.setHeatingTypeEnev2014( getRandomHeatingTypeEnev2014() );
    realEstate.setInternetConnection( getRandomInternetConnectionType() );
    realEstate.setLift( getRandomYesNotApplicableType() );
    realEstate.setMinimumTermOfLease( getRandomInt( 1, 12 ) );
    realEstate.setNumberOfBathRooms( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfFemaleFlatMates( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfFloors( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfMaleFlatMates( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfRequestedFlatMates( getRandomInt( 1, 10 )  );
    realEstate.setNumberOfRooms( (double) getRandomInt( 1, 10 ) );
    realEstate.setOven( getRandomYesNotApplicableType() );
    realEstate.setParkingSituation( getRandomParkingSituationType() );
    realEstate.setPetsAllowed( getRandomPetsAllowedType() );
    realEstate.setRefrigerator( getRandomYesNotApplicableType() );
    realEstate.setRequestedGender( getRandomFlatMateGenderType() );
    realEstate.setRoomSize( getRandomDouble( 4, 20 ) );
    realEstate.setServiceCharge( getRandomDouble( 50, 500 ) );
    realEstate.setSmokingAllowed( getRandomSmokingAllowedType() );
    realEstate.setStove( getRandomYesNotApplicableType() );
    realEstate.setTelephoneConnection( getRandomTelephoneConnectionType() );
    realEstate.setTotalRent( getRandomDouble( 500, 3000 ) );
    realEstate.setTotalSpace( getRandomDouble( 40, 250 ) );
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
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( Lorem.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( Lorem.getParagraphs( 2, 10 ), 1000 ) );
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
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
    }

    // energy certificate for habitation by demand
    else
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_REQUIRED );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
    }
  }

  protected void initRealEstate( GarageBuy realEstate )
  {
    realEstate.setCondition( getRandomRealEstateCondition() );
    realEstate.setConstructionYear( getRandomInt( 1900, 1980 ) );
    realEstate.setGarageType( getRandomGarageType() );
    realEstate.setHeightGarage( getRandomDouble( 1, 3 ) );
    realEstate.setLastRefurbishment( getRandomInt( 1990, 2014 ) );
    realEstate.setLengthGarage( getRandomDouble( 3, 6 ) );
    realEstate.setUsableFloorSpace( getRandomDouble( 5, 50 ) );
    realEstate.setWidthGarage( getRandomDouble( 3, 6 ) );

    // courtage
    realEstate.setCourtage( commonFactory.createCourtageInfo() );
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( Lorem.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( Lorem.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.getCourtage().setHasCourtage( YesNoNotApplicableType.YES );

    // pricing
    realEstate.setPrice( getDefaultPrice() );
    realEstate.getPrice().setMarketingType( MarketingType.PURCHASE );
    realEstate.getPrice().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
    realEstate.getPrice().setValue( getRandomDouble( 1000, 9999 ) );
  }

  protected void initRealEstate( GarageRent realEstate )
  {
    realEstate.setCondition( getRandomRealEstateCondition() );
    realEstate.setConstructionYear( getRandomInt( 1900, 1980 ) );
    realEstate.setFreeFrom( getRandomCalendar() );
    realEstate.setFreeUntil( getRandomCalendar() );
    realEstate.setGarageType( getRandomGarageType() );
    realEstate.setHeightGarage( getRandomDouble( 1, 3 ) );
    realEstate.setLastRefurbishment( getRandomInt( 1990, 2014 ) );
    realEstate.setLengthGarage( getRandomDouble( 3, 6 ) );
    realEstate.setUsableFloorSpace( getRandomDouble( 5, 50 ) );
    realEstate.setWidthGarage( getRandomDouble( 3, 6 ) );

    // courtage
    realEstate.setCourtage( commonFactory.createCourtageInfo() );
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( Lorem.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( Lorem.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.getCourtage().setHasCourtage( YesNoNotApplicableType.YES );

    // pricing
    realEstate.setPrice( getDefaultPrice() );
    realEstate.getPrice().setMarketingType( MarketingType.RENT );
    realEstate.getPrice().setPriceIntervalType( PriceIntervalType.MONTH );
    realEstate.getPrice().setValue( getRandomDouble( 50, 999 ) );
  }

  protected void initRealEstate( Gastronomy realEstate )
  {
    realEstate.setAdditionalArea( getRandomDouble( 10, 500 ) );
    realEstate.setCellar( getRandomYesNotApplicableType() );
    realEstate.setCondition( getRandomRealEstateCondition() );
    realEstate.setDeposit( StringUtils.abbreviate( Lorem.getWords( 1, 10 ), 50 ) );
    realEstate.setDistanceToAirport( getRandomInt( 5, 50 ) );
    realEstate.setDistanceToFM( getRandomInt( 5, 50 ) );
    realEstate.setDistanceToMRS( getRandomInt( 5, 50 ) );
    realEstate.setDistanceToPT( getRandomInt( 5, 50 ) );
    realEstate.setEnergySourcesEnev2014( createRandomEnergySourcesEnev2014() );
    realEstate.setFreeFrom( StringUtils.abbreviate( Lorem.getWords( 1, 10 ), 50 ) );
    realEstate.setGastronomyType( getRandomGastronomyType() );
    realEstate.setHeatingTypeEnev2014( getRandomHeatingTypeEnev2014() );
    realEstate.setInteriorQuality( getRandomInteriorQuality() );
    realEstate.setLastRefurbishment( getRandomInt( 1990, 2014 ) );
    realEstate.setLift( getRandomYesNotApplicableType() );
    realEstate.setListed( getRandomYesNotApplicableType() );
    realEstate.setMinDivisible( getRandomDouble( 100, 250 ) );
    realEstate.setNetFloorSpace( getRandomDouble( 50, 5000 ) );
    realEstate.setNumberBeds( getRandomInt( 10, 500 ) );
    realEstate.setNumberOfFloors( String.valueOf( getRandomInt( 1, 10 ) ) );
    realEstate.setNumberOfParkingSpaces( getRandomInt( 1, 10 ) );
    realEstate.setNumberSeats( getRandomInt( 50, 500 ) );
    realEstate.setParkingSpacePrice( getRandomDouble( 30, 300 ) );
    realEstate.setTerrace( getRandomYesNotApplicableType() );
    realEstate.setTotalFloorSpace( getRandomDouble( 50, 500 ) );

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
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( Lorem.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( Lorem.getParagraphs( 2, 10 ), 1000 ) );
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
        realEstate.getEnergyCertificate().setElectricityConsumption( getRandomDouble( 10, 250 ) );
        realEstate.getEnergyCertificate().setHeatingConsumption( getRandomDouble( 10, 250 ) );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
        realEstate.setEnergyConsumptionContainsWarmWater( getRandomYesNotApplicableType() );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyConsumptionElectricity( getRandomDouble( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyConsumptionHeating( getRandomDouble( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
    }

    // energy certificate for business by demand
    else
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_REQUIRED );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setThermalCharacteristicElectricity( getRandomDouble( 500, 2500 ) );
        realEstate.getEnergyCertificate().setThermalCharacteristicHeating( getRandomDouble( 500, 2500 ) );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
    }

    // pricing for rent
    if (getRandomBoolean())
    {
      realEstate.setCommercializationType( CommercializationType.RENT );
      realEstate.setPrice( getDefaultPrice() );
      realEstate.getPrice().setMarketingType( MarketingType.RENT );
      realEstate.getPrice().setPriceIntervalType( PriceIntervalType.MONTH );
      realEstate.getPrice().setValue( getRandomDouble( 1000, 50000 ) );
    }

    // pricing for purchase
    else
    {
      realEstate.setCommercializationType( CommercializationType.BUY );
      realEstate.setPrice( getDefaultPrice() );
      realEstate.getPrice().setMarketingType( MarketingType.PURCHASE );
      realEstate.getPrice().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
      realEstate.getPrice().setValue( getRandomDouble( 50000, 9999999 ) );
    }

    // pricing / additional costs
    realEstate.setAdditionalCosts( getDefaultPrice() );
    realEstate.getAdditionalCosts().setPriceIntervalType( PriceIntervalType.MONTH );
    realEstate.getAdditionalCosts().setValue( getRandomDouble( 500, 5000 ) );

    // pricing / calculated price
    //realEstate.setCalculatedPrice( getDefaultPrice() );
    //realEstate.getCalculatedPrice().setValue( value );
  }

  protected void initRealEstate( HouseBuy realEstate )
  {
    realEstate.setBuildingType( getRandomBuildingType() );
    realEstate.setCellar( getRandomYesNotApplicableType() );
    realEstate.setCondition( getRandomRealEstateCondition() );
    realEstate.setConstructionPhase( getRandomConstructionPhaseType() );
    realEstate.setEnergySourcesEnev2014( createRandomEnergySourcesEnev2014() );
    realEstate.setFreeFrom( StringUtils.abbreviate( Lorem.getWords( 1, 10 ), 50 ) );
    realEstate.setGuestToilet( getRandomYesNotApplicableType() );
    realEstate.setHandicappedAccessible( getRandomYesNotApplicableType() );
    realEstate.setHeatingTypeEnev2014( getRandomHeatingTypeEnev2014() );
    realEstate.setInteriorQuality( getRandomInteriorQuality() );
    realEstate.setLastRefurbishment( getRandomInt( 1990, 2014 ) );
    realEstate.setListed( getRandomYesNotApplicableType() );
    realEstate.setLivingSpace( getRandomDouble( 20, 300 ) );
    realEstate.setLodgerFlat( getRandomYesNotApplicableType() );
    realEstate.setNumberOfBathRooms( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfBedRooms( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfFloors( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfParkingSpaces( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfRooms( (double) getRandomInt( 1, 10 ) );
    realEstate.setParkingSpacePrice( getRandomDouble( 30, 300 ) );
    realEstate.setParkingSpaceType( getRandomParkingSpaceType() );
    realEstate.setPlotArea( getRandomDouble( 100, 5000 ) );
    realEstate.setRentalIncome( getRandomDouble( 9999, 9999999 ) );
    realEstate.setRented( getRandomYesNotApplicableType() );
    realEstate.setSummerResidencePractical( getRandomYesNotApplicableType() );
    realEstate.setUsableFloorSpace( getRandomDouble( 20, 300 ) );

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
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( Lorem.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( Lorem.getParagraphs( 2, 10 ), 1000 ) );
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
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
    }

    // energy certificate for habitation by demand
    else
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_REQUIRED );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
    }

    // pricing
    realEstate.setPrice( getDefaultPrice() );
    realEstate.getPrice().setMarketingType( MarketingType.PURCHASE );
    realEstate.getPrice().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
    realEstate.getPrice().setValue( getRandomDouble( 10000, 9999999 ) );
  }

  protected void initRealEstate( HouseRent realEstate )
  {
    realEstate.setBaseRent( getRandomDouble( 500, 5000 ) );
    realEstate.setBuildingType( getRandomBuildingType() );
    realEstate.setBuiltInKitchen( getRandomBoolean() );
    realEstate.setCellar( getRandomYesNotApplicableType() );
    realEstate.setCondition( getRandomRealEstateCondition() );
    realEstate.setDeposit( StringUtils.abbreviate( Lorem.getWords( 1, 10 ), 50 ) );
    realEstate.setEnergySourcesEnev2014( createRandomEnergySourcesEnev2014() );
    realEstate.setFreeFrom( StringUtils.abbreviate( Lorem.getWords( 1, 10 ), 50 ) );
    realEstate.setGuestToilet( getRandomYesNotApplicableType() );
    realEstate.setHandicappedAccessible( getRandomYesNotApplicableType() );
    realEstate.setHeatingCosts( getRandomDouble( 100, 500 ) );
    realEstate.setHeatingCostsInServiceCharge( getRandomYesNo() );
    realEstate.setHeatingTypeEnev2014( getRandomHeatingTypeEnev2014() );
    realEstate.setInteriorQuality( getRandomInteriorQuality() );
    realEstate.setLastRefurbishment( getRandomInt( 1990, 2014 ) );
    realEstate.setLivingSpace( getRandomDouble( 20, 300 ) );
    realEstate.setNumberOfBathRooms( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfBedRooms( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfFloors( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfParkingSpaces( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfRooms( (double) getRandomInt( 1, 10 ) );
    realEstate.setParkingSpacePrice( getRandomDouble( 30, 300 ) );
    realEstate.setParkingSpaceType( getRandomParkingSpaceType() );
    realEstate.setPetsAllowed( getRandomPetsAllowedType() );
    realEstate.setPlotArea( getRandomDouble( 100, 5000 ) );
    realEstate.setServiceCharge( getRandomDouble( 50, 500 ) );
    realEstate.setTotalRent( getRandomDouble( 1000, 5000 ) );
    realEstate.setUsableFloorSpace( getRandomDouble( 20, 300 ) );
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
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( Lorem.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( Lorem.getParagraphs( 2, 10 ), 1000 ) );
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
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
    }

    // energy certificate for habitation by demand
    else
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_REQUIRED );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
    }

    // pricing
    realEstate.setPrice( getDefaultPrice() );
    realEstate.getPrice().setMarketingType( MarketingType.RENT );
    realEstate.getPrice().setPriceIntervalType( PriceIntervalType.MONTH );
    realEstate.getPrice().setValue( getRandomDouble( 250, 9999 ) );
  }

  protected void initRealEstate( HouseType realEstate )
  {
    // Type houses require an <address> element without children or with a
    // single <geoHierarchy> child element. Because we're not randomly generate
    // a <geoHierarchy>, an empty <address> element is created.
    realEstate.setAddress( commonFactory.createWgs84Address() );

    realEstate.setBaseArea( getRandomDouble( 100, 1000 ) );
    realEstate.setBuildingType( getRandomHouseTypeBuildingType() );
    realEstate.setConstructionMethod( getRandomHouseTypeConstructionMethodType() );
    realEstate.setContructionPriceInformationNote( StringUtils.abbreviate( Lorem.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.setEnergyStandardType( getRandomHouseTypeEnergyStandardType() );
    realEstate.setFloorInformationNote( StringUtils.abbreviate( Lorem.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.setLivingSpace( getRandomDouble( 20, 300 ) );
    realEstate.setModelInformationNote( StringUtils.abbreviate( Lorem.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.setNumberOfRooms( (double) getRandomInt( 1, 10 ) );
    realEstate.setRoofInformationNote( StringUtils.abbreviate( Lorem.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.setStageOfCompletionType( getRandomHouseTypeStageOfCompletionType() );
    realEstate.setTotalArea( getRandomDouble( 250, 2500 ) );
    realEstate.setTypeInformationNote( StringUtils.abbreviate( Lorem.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.setUValue( getRandomDouble( 10 ) );

    // courtage
    realEstate.setCourtage( commonFactory.createCourtageInfo() );
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( Lorem.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( Lorem.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.getCourtage().setHasCourtage( YesNoNotApplicableType.YES );

    // pricing
    realEstate.setPrice( getDefaultPrice() );
    realEstate.getPrice().setMarketingType( MarketingType.PURCHASE );
    realEstate.getPrice().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
    realEstate.getPrice().setValue( getRandomDouble( 10000, 9999999 ) );
  }

  protected void initRealEstate( Industry realEstate )
  {
    realEstate.setAdditionalArea( getRandomDouble( 250, 5000 ) );
    realEstate.setAutoLift( getRandomYesNotApplicableType() );
    realEstate.setCondition( getRandomRealEstateCondition() );
    realEstate.setConnectedLoad( getRandomInt( 1, 500 ) );
    realEstate.setCraneRunway( getRandomYesNotApplicableType() );
    realEstate.setCraneRunwayLoad( getRandomDouble( 500, 50000 ) );
    realEstate.setDeposit( StringUtils.abbreviate( Lorem.getWords( 1, 10 ), 50 ) );
    realEstate.setDistanceToAirport( getRandomInt( 5, 50 ) );
    realEstate.setDistanceToFM( getRandomInt( 5, 50 ) );
    realEstate.setDistanceToMRS( getRandomInt( 5, 50 ) );
    realEstate.setDistanceToPT( getRandomInt( 5, 50 ) );
    realEstate.setEnergySourcesEnev2014( createRandomEnergySourcesEnev2014() );
    realEstate.setFloorLoad( getRandomDouble( 500, 50000 ) );
    realEstate.setFlooringType( getRandomFlooringType() );
    realEstate.setFreeFrom( StringUtils.abbreviate( Lorem.getWords( 1, 10 ), 50 ) );
    realEstate.setGoodsLift( getRandomYesNotApplicableType() );
    realEstate.setGoodsLiftLoad( getRandomDouble( 500, 50000 ) );
    realEstate.setHallHeight( getRandomDouble( 3, 15 ) );
    realEstate.setHeatingTypeEnev2014( getRandomHeatingTypeEnev2014() );
    realEstate.setIndustryType( getRandomIndustryType() );
    realEstate.setInteriorQuality( getRandomInteriorQuality() );
    realEstate.setLastRefurbishment( getRandomInt( 1990, 2014 ) );
    realEstate.setLift( getRandomYesNotApplicableType() );
    realEstate.setMinDivisible( getRandomDouble( 500, 2500 ) );
    realEstate.setNetFloorSpace( getRandomDouble( 100, 10000 ) );
    realEstate.setNumberOfFloors( String.valueOf( getRandomInt( 1, 10 ) ) );
    realEstate.setNumberOfParkingSpaces( getRandomInt( 1, 10 ) );
    realEstate.setParkingSpacePrice( getRandomDouble( 30, 300 ) );
    realEstate.setPlotArea( getRandomDouble( 100, 5000 ) );
    realEstate.setRamp( getRandomYesNotApplicableType() );
    realEstate.setTotalFloorSpace( getRandomDouble( 50, 500 ) );

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
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( Lorem.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( Lorem.getParagraphs( 2, 10 ), 1000 ) );
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
        realEstate.getEnergyCertificate().setElectricityConsumption( getRandomDouble( 10, 250 ) );
        realEstate.getEnergyCertificate().setHeatingConsumption( getRandomDouble( 10, 250 ) );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
        realEstate.setEnergyConsumptionContainsWarmWater( getRandomYesNotApplicableType() );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyConsumptionElectricity( getRandomDouble( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyConsumptionHeating( getRandomDouble( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
    }

    // energy certificate for business by demand
    else
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_REQUIRED );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setThermalCharacteristicElectricity( getRandomDouble( 500, 2500 ) );
        realEstate.getEnergyCertificate().setThermalCharacteristicHeating( getRandomDouble( 500, 2500 ) );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
    }

    // pricing for rent
    if (getRandomBoolean())
    {
      realEstate.setCommercializationType( CommercializationType.RENT );
      realEstate.setPrice( getDefaultPrice() );
      realEstate.getPrice().setMarketingType( MarketingType.RENT );
      realEstate.getPrice().setPriceIntervalType( PriceIntervalType.MONTH );
      realEstate.getPrice().setValue( getRandomDouble( 500, 5000 ) );
    }

    // pricing for purchase
    else
    {
      realEstate.setCommercializationType( CommercializationType.BUY );
      realEstate.setPrice( getDefaultPrice() );
      realEstate.getPrice().setMarketingType( MarketingType.PURCHASE );
      realEstate.getPrice().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
      realEstate.getPrice().setValue( getRandomDouble( 50000, 999999 ) );
    }

    // pricing / additional costs
    realEstate.setAdditionalCosts( getDefaultPrice() );
    realEstate.getAdditionalCosts().setPriceIntervalType( PriceIntervalType.MONTH );
    realEstate.getAdditionalCosts().setValue( getRandomDouble( 500, 5000 ) );

    // pricing / calculated price
    //realEstate.setCalculatedPrice( getDefaultPrice() );
    //realEstate.getCalculatedPrice().setValue( value );
  }

  protected void initRealEstate( Investment realEstate )
  {
    realEstate.setAdditionalArea( getRandomDouble( 250, 5000 ) );
    realEstate.setCondition( getRandomRealEstateCondition() );
    realEstate.setConstructionYear( getRandomInt( 1900, 1980 ) );
    realEstate.setDistanceToAirport( getRandomInt( 5, 50 ) );
    realEstate.setDistanceToFM( getRandomInt( 5, 50 ) );
    realEstate.setDistanceToMRS( getRandomInt( 5, 50 ) );
    realEstate.setDistanceToPT( getRandomInt( 5, 50 ) );
    realEstate.setEnergySourcesEnev2014( createRandomEnergySourcesEnev2014() );
    realEstate.setFreeFrom( StringUtils.abbreviate( Lorem.getWords( 1, 10 ), 50 ) );
    realEstate.setHeatingTypeEnev2014( getRandomHeatingTypeEnev2014() );
    realEstate.setIndustrialArea( getRandomDouble( 500, 50000 ) );
    realEstate.setInteriorQuality( getRandomInteriorQuality() );
    realEstate.setInvestmentType( getRandomInvestmentType() );
    realEstate.setLastRefurbishment( getRandomInt( 1990, 2014 ) );
    realEstate.setLift( getRandomYesNotApplicableType() );
    realEstate.setListed( getRandomYesNotApplicableType() );
    realEstate.setLivingSpace( getRandomDouble( 20, 300 ) );
    realEstate.setNetFloorSpace( getRandomDouble( 50, 5000 ) );
    realEstate.setNumberOfFloors( String.valueOf( getRandomInt( 1, 10 ) ) );
    realEstate.setNumberOfParkingSpaces( getRandomInt( 1, 10 ) );
    realEstate.setParkingSpacePrice( getRandomDouble( 30, 300 ) );
    realEstate.setPlotArea( getRandomDouble( 100, 5000 ) );
    realEstate.setPriceMultiplier( getRandomDouble( 1, 50 ) );
    realEstate.setTotalFloorSpace( getRandomDouble( 50, 500 ) );

    // courtage
    realEstate.setCourtage( commonFactory.createCourtageInfo() );
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( Lorem.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( Lorem.getParagraphs( 2, 10 ), 1000 ) );
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
        realEstate.getEnergyCertificate().setElectricityConsumption( getRandomDouble( 10, 250 ) );
        realEstate.getEnergyCertificate().setHeatingConsumption( getRandomDouble( 10, 250 ) );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
        realEstate.setEnergyConsumptionContainsWarmWater( getRandomYesNotApplicableType() );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyConsumptionElectricity( getRandomDouble( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyConsumptionHeating( getRandomDouble( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
    }

    // energy certificate for habitation and business by demand
    else
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_REQUIRED );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setThermalCharacteristicElectricity( getRandomDouble( 500, 2500 ) );
        realEstate.getEnergyCertificate().setThermalCharacteristicHeating( getRandomDouble( 500, 2500 ) );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
    }

    // pricing
    realEstate.setPrice( getDefaultPrice() );
    realEstate.getPrice().setMarketingType( MarketingType.PURCHASE );
    realEstate.getPrice().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
    realEstate.getPrice().setValue( getRandomDouble( 10000, 9999999 ) );

    // pricing / additional costs
    realEstate.setAdditionalCosts( getDefaultPrice() );
    realEstate.getAdditionalCosts().setPriceIntervalType( PriceIntervalType.MONTH );
    realEstate.getAdditionalCosts().setValue( getRandomDouble( 500, 5000 ) );

    // pricing / other costs
    realEstate.setOtherCosts( getDefaultPrice() );
    realEstate.getOtherCosts().setValue( getRandomDouble( 500, 10000 ) );

    // pricing / price per sqm
    realEstate.setPricePerSQM( getDefaultPrice() );
    realEstate.getPricePerSQM().setValue( getRandomDouble( 1, 500 ) );

    // pricing / actual rental income
    realEstate.setRentalIncomeActual( getDefaultPrice() );
    realEstate.getRentalIncomeActual().setPriceIntervalType( PriceIntervalType.YEAR );
    realEstate.getRentalIncomeActual().setValue( getRandomDouble( 50000, 9999999 ) );

    // pricing / target rental income
    realEstate.setRentalIncomeTarget( getDefaultPrice() );
    realEstate.getRentalIncomeTarget().setPriceIntervalType( PriceIntervalType.YEAR );
    realEstate.getRentalIncomeTarget().setValue( getRandomDouble( 50000, 9999999 ) );
  }

  protected void initRealEstate( LivingBuySite realEstate )
  {
    realEstate.setBuildingPermission( getRandomBoolean() );
    realEstate.setDemolition( getRandomBoolean() );
    realEstate.setFreeFrom( StringUtils.abbreviate( Lorem.getWords( 1, 10 ), 50 ) );
    realEstate.setGfz( getRandomDouble( 1, 10 ) );
    realEstate.setGrz( getRandomDouble( 1, 10 ) );
    realEstate.setMinDivisible( getRandomDouble( 500, 2500 ) );
    realEstate.setPlotArea( getRandomDouble( 100, 5000 ) );
    realEstate.setRecommendedUseTypes( createRandomSiteRecommendedUseTypes() );
    realEstate.setShortTermConstructible( getRandomBoolean() );
    realEstate.setSiteConstructibleType( getRandomSiteConstructibleType() );
    realEstate.setSiteDevelopmentType( getRandomSiteDevelopmentType() );
    realEstate.setTenancy( getRandomInt( 100 ) );

    // courtage
    realEstate.setCourtage( commonFactory.createCourtageInfo() );
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( Lorem.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( Lorem.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.getCourtage().setHasCourtage( YesNoNotApplicableType.YES );

    // pricing for purchase
    realEstate.setCommercializationType( CommercializationType.BUY );
    realEstate.setPrice( getDefaultPrice() );
    realEstate.getPrice().setMarketingType( MarketingType.PURCHASE );
    realEstate.getPrice().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
    realEstate.getPrice().setValue( getRandomDouble( 50000, 999999 ) );
  }

  protected void initRealEstate( LivingRentSite realEstate )
  {
    realEstate.setBuildingPermission( getRandomBoolean() );
    realEstate.setDemolition( getRandomBoolean() );
    realEstate.setFreeFrom( StringUtils.abbreviate( Lorem.getWords( 1, 10 ), 50 ) );
    realEstate.setGfz( getRandomDouble( 1, 10 ) );
    realEstate.setGrz( getRandomDouble( 1, 10 ) );
    realEstate.setMinDivisible( getRandomDouble( 500, 2500 ) );
    realEstate.setPlotArea( getRandomDouble( 100, 5000 ) );
    realEstate.setRecommendedUseTypes( createRandomSiteRecommendedUseTypes() );
    realEstate.setShortTermConstructible( getRandomBoolean() );
    realEstate.setSiteConstructibleType( getRandomSiteConstructibleType() );
    realEstate.setSiteDevelopmentType( getRandomSiteDevelopmentType() );
    realEstate.setTenancy( getRandomInt( 100 ) );

    // courtage
    realEstate.setCourtage( commonFactory.createCourtageInfo() );
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( Lorem.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( Lorem.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.getCourtage().setHasCourtage( YesNoNotApplicableType.YES );

    // pricing for leasing
    realEstate.setCommercializationType( CommercializationType.LEASE );
    realEstate.setPrice( getDefaultPrice() );
    realEstate.getPrice().setMarketingType( MarketingType.LEASE );
    realEstate.getPrice().setPriceIntervalType( PriceIntervalType.YEAR );
    realEstate.getPrice().setValue( getRandomDouble( 500, 999999 ) );
  }

  protected void initRealEstate( Office realEstate )
  {
    realEstate.setAdditionalArea( getRandomDouble( 250, 5000 ) );
    realEstate.setAirConditioning( getRandomAirConditioningType() );
    realEstate.setCellar( getRandomYesNotApplicableType() );
    realEstate.setCondition( getRandomRealEstateCondition() );
    realEstate.setDeposit( StringUtils.abbreviate( Lorem.getWords( 1, 10 ), 50 ) );
    realEstate.setDistanceToAirport( getRandomInt( 5, 50 ) );
    realEstate.setDistanceToFM( getRandomInt( 5, 50 ) );
    realEstate.setDistanceToMRS( getRandomInt( 5, 50 ) );
    realEstate.setDistanceToPT( getRandomInt( 5, 50 ) );
    realEstate.setEnergySourcesEnev2014( createRandomEnergySourcesEnev2014() );
    realEstate.setFlooringType( getRandomFlooringType() );
    realEstate.setFreeFrom( StringUtils.abbreviate( Lorem.getWords( 1, 10 ), 50 ) );
    realEstate.setHandicappedAccessible( getRandomYesNotApplicableType() );
    realEstate.setHasCanteen( getRandomYesNotApplicableType() );
    realEstate.setHeatingTypeEnev2014( getRandomHeatingTypeEnev2014() );
    realEstate.setHighVoltage( getRandomYesNotApplicableType() );
    realEstate.setInteriorQuality( getRandomInteriorQuality() );
    realEstate.setKitchenComplete( getRandomYesNotApplicableType() );
    realEstate.setLanCables( getRandomItInfrastructureType() );
    realEstate.setLastRefurbishment( getRandomInt( 1990, 2014 ) );
    realEstate.setLift( getRandomYesNotApplicableType() );
    realEstate.setListed( getRandomYesNotApplicableType() );
    realEstate.setMinDivisible( getRandomDouble( 500, 2500 ) );
    realEstate.setNetFloorSpace( getRandomDouble( 50, 5000 ) );
    realEstate.setNumberOfFloors( String.valueOf( getRandomInt( 1, 10 ) ) );
    realEstate.setNumberOfParkingSpaces( getRandomInt( 1, 10 ) );
    realEstate.setOfficeType( getRandomOfficeType() );
    realEstate.setParkingSpacePrice( getRandomDouble( 30, 300 ) );
    realEstate.setTotalFloorSpace( getRandomDouble( 50, 500 ) );

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
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( Lorem.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( Lorem.getParagraphs( 2, 10 ), 1000 ) );
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
        realEstate.getEnergyCertificate().setElectricityConsumption( getRandomDouble( 10, 250 ) );
        realEstate.getEnergyCertificate().setHeatingConsumption( getRandomDouble( 10, 250 ) );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
        realEstate.setEnergyConsumptionContainsWarmWater( getRandomYesNotApplicableType() );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyConsumptionElectricity( getRandomDouble( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyConsumptionHeating( getRandomDouble( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
    }

    // energy certificate for business by demand
    else
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_REQUIRED );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setThermalCharacteristicElectricity( getRandomDouble( 500, 2500 ) );
        realEstate.getEnergyCertificate().setThermalCharacteristicHeating( getRandomDouble( 500, 2500 ) );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
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
      realEstate.getPrice().setValue( getRandomDouble( 500, 5000 ) );
    }

    // pricing for purchase
    else
    {
      realEstate.setCommercializationType( CommercializationType.BUY );
      realEstate.setPrice( getDefaultPrice() );
      realEstate.getPrice().setMarketingType( MarketingType.PURCHASE );
      realEstate.getPrice().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
      realEstate.getPrice().setValue( getRandomDouble( 50000, 999999 ) );
    }

    // pricing / additional costs
    realEstate.setAdditionalCosts( getDefaultPrice() );
    realEstate.getAdditionalCosts().setPriceIntervalType( PriceIntervalType.MONTH );
    realEstate.getAdditionalCosts().setValue( getRandomDouble( 500, 5000 ) );

    // pricing / calculated price
    //realEstate.setCalculatedPrice( getDefaultPrice() );
    //realEstate.getCalculatedPrice().setValue( value );
  }

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
    realEstate.setLivingSpaceFrom( getRandomDouble( 20, 50 ) );
    realEstate.setLivingSpaceTo( getRandomDouble( 50, 150 ) );
    realEstate.setNumberOfBeds( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfLookedAfterApartments( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfNursingPlaces( getRandomInt( 1, 10 ) );
    realEstate.setOpening( getRandomCalendar() );
    realEstate.setOwnFurniturePossible( getRandomYesNotApplicableType() );
    realEstate.setPetsAllowed( getRandomPetsAllowedType() );
    realEstate.setReligiousOfferingsAvailable( getRandomYesNotApplicableType() );
    realEstate.setRestaurantAvailable( getRandomYesNotApplicableType() );
    realEstate.setRoomType( getRandomRoomType() );
    realEstate.setSecurity24Hours( getRandomYesNotApplicableType() );
    realEstate.setShoppingFacilitiesAvailable( getRandomYesNotApplicableType() );
    realEstate.setShortDescription( StringUtils.abbreviate( Lorem.getWords( 3, 15 ), 200 ) );
    realEstate.setTherapyOfferingsAvailable( getRandomYesNotApplicableType() );
    realEstate.setTrialLivingPossible( getRandomYesNotApplicableType() );

    // care types
    realEstate.setCareTypes( commonFactory.createCareTypes() );
    realEstate.getCareTypes().getCareType().addAll( Arrays.asList( CareType.values() ) );

    // pricing
    realEstate.setPrice( getDefaultPrice() );
    realEstate.getPrice().setMarketingType( MarketingType.RENT );
    realEstate.getPrice().setPriceIntervalType( PriceIntervalType.MONTH );
    realEstate.getPrice().setValue( getRandomDouble( 500, 9999 ) );
  }

  protected void initRealEstate( ShortTermAccommodation realEstate )
  {
    realEstate.setBalcony( getRandomBoolean() );
    realEstate.setBaseRent( getRandomDouble( 200, 1500 ) );
    realEstate.setCellar( getRandomBoolean() );
    realEstate.setCondition( getRandomRealEstateCondition() );
    realEstate.setDeposit( StringUtils.abbreviate( Lorem.getWords( 1, 10 ), 50 ) );
    realEstate.setEndRentalDate( getRandomCalendar() );
    realEstate.setEnergySourcesEnev2014( createRandomEnergySourcesEnev2014() );
    realEstate.setFloor( String.valueOf( getRandomInt( 5 ) ) );
    realEstate.setGarden( getRandomBoolean() );
    realEstate.setGender( getRandomFlatMateGenderType() );
    realEstate.setGuestToilet( getRandomBoolean() );
    realEstate.setHandicappedAccessible( getRandomBoolean() );
    realEstate.setHasFurniture( getRandomYesNoNotApplicableType() );
    realEstate.setHeatingTypeEnev2014( getRandomHeatingTypeEnev2014() );
    realEstate.setLift( getRandomBoolean() );
    realEstate.setLivingSpace( getRandomDouble( 20, 300 ) );
    realEstate.setMaxNumberOfPersons( getRandomInt( 4, 10 ) );
    realEstate.setMaxRentalTime( getRandomDouble( 12, 24 ) );
    realEstate.setMinRentalTime( getRandomDouble( 3, 12 ) );
    realEstate.setNonSmoker( getRandomBoolean() );
    realEstate.setNumberOfFloors( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfParkingSpaces( getRandomInt( 1, 10 ) );
    realEstate.setNumberOfRooms( (double) getRandomInt( 1, 10 ) );
    realEstate.setParkingSpacePrice( getRandomDouble( 30, 300 ) );
    realEstate.setParkingSpaceType( getRandomParkingSpaceType() );
    realEstate.setPetsAllowed( getRandomPetsAllowedType() );
    realEstate.setServiceCharge( getRandomDouble( 50, 500 ) );
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
      realEstate.setConstructionYear( getRandomInt( 1900, 1980 ) );
    }

    // courtage
    realEstate.setCourtage( commonFactory.createCourtageInfo() );
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( Lorem.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( Lorem.getParagraphs( 2, 10 ), 1000 ) );
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
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
    }

    // energy certificate for habitation by demand
    else
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_REQUIRED );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
    }

    // pricing
    realEstate.setPrice( getDefaultPrice() );
    realEstate.getPrice().setMarketingType( MarketingType.RENT );
    realEstate.getPrice().setPriceIntervalType( PriceIntervalType.MONTH );
    realEstate.getPrice().setValue( getRandomDouble( 200, 9999 ) );
  }

  protected void initRealEstate( SpecialPurpose realEstate )
  {
    realEstate.setAdditionalArea( getRandomDouble( 250, 5000 ) );
    realEstate.setBasement( getRandomYesNotApplicableType() );
    realEstate.setCondition( getRandomRealEstateCondition() );
    realEstate.setDeposit( StringUtils.abbreviate( Lorem.getWords( 1, 10 ), 50 ) );
    realEstate.setDistanceToAirport( getRandomInt( 5, 50 ) );
    realEstate.setDistanceToFM( getRandomInt( 5, 50 ) );
    realEstate.setDistanceToMRS( getRandomInt( 5, 50 ) );
    realEstate.setDistanceToPT( getRandomInt( 5, 50 ) );
    realEstate.setEnergySourcesEnev2014( createRandomEnergySourcesEnev2014() );
    realEstate.setFlooringType( getRandomFlooringType() );
    realEstate.setFreeFrom( StringUtils.abbreviate( Lorem.getWords( 1, 10 ), 50 ) );
    realEstate.setHeatingTypeEnev2014( getRandomHeatingTypeEnev2014() );
    realEstate.setInteriorQuality( getRandomInteriorQuality() );
    realEstate.setLastRefurbishment( getRandomInt( 1990, 2014 ) );
    realEstate.setLift( getRandomYesNotApplicableType() );
    realEstate.setListed( getRandomYesNotApplicableType() );
    realEstate.setMinDivisible( getRandomDouble( 500, 2500 ) );
    realEstate.setNetFloorSpace( getRandomDouble( 50, 5000 ) );
    realEstate.setNumberOfFloors( String.valueOf( getRandomInt( 1, 10 ) ) );
    realEstate.setNumberOfParkingSpaces( getRandomInt( 1, 10 ) );
    realEstate.setParkingSpacePrice( getRandomDouble( 30, 300 ) );
    realEstate.setPlotArea( getRandomDouble( 100, 5000 ) );
    realEstate.setSpecialPurposePropertyType( getRandomSpecialPurposeType() );
    realEstate.setTotalFloorSpace( getRandomDouble( 50, 500 ) );

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
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( Lorem.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( Lorem.getParagraphs( 2, 10 ), 1000 ) );
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
        realEstate.getEnergyCertificate().setElectricityConsumption( getRandomDouble( 10, 250 ) );
        realEstate.getEnergyCertificate().setHeatingConsumption( getRandomDouble( 10, 250 ) );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
        realEstate.setEnergyConsumptionContainsWarmWater( getRandomYesNotApplicableType() );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyConsumptionElectricity( getRandomDouble( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyConsumptionHeating( getRandomDouble( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
    }

    // energy certificate for business by demand
    else
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_REQUIRED );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setThermalCharacteristicElectricity( getRandomDouble( 500, 2500 ) );
        realEstate.getEnergyCertificate().setThermalCharacteristicHeating( getRandomDouble( 500, 2500 ) );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
    }

    // pricing for rent
    if (getRandomBoolean())
    {
      realEstate.setCommercializationType( CommercializationType.RENT );
      realEstate.setPrice( getDefaultPrice() );
      realEstate.getPrice().setMarketingType( MarketingType.RENT );
      realEstate.getPrice().setPriceIntervalType( PriceIntervalType.MONTH );
      realEstate.getPrice().setValue( getRandomDouble( 500, 5000 ) );
    }

    // pricing for purchase
    else
    {
      realEstate.setCommercializationType( CommercializationType.BUY );
      realEstate.setPrice( getDefaultPrice() );
      realEstate.getPrice().setMarketingType( MarketingType.PURCHASE );
      realEstate.getPrice().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
      realEstate.getPrice().setValue( getRandomDouble( 50000, 999999 ) );
    }

    // pricing / additional costs
    realEstate.setAdditionalCosts( getDefaultPrice() );
    realEstate.getAdditionalCosts().setPriceIntervalType( PriceIntervalType.MONTH );
    realEstate.getAdditionalCosts().setValue( getRandomDouble( 500, 5000 ) );

    // pricing / calculated price
    //realEstate.setCalculatedPrice( getDefaultPrice() );
    //realEstate.getCalculatedPrice().setValue( value );
  }

  protected void initRealEstate( Store realEstate )
  {
    realEstate.setAdditionalArea( getRandomDouble( 250, 5000 ) );
    realEstate.setCellar( getRandomYesNotApplicableType() );
    realEstate.setCondition( getRandomRealEstateCondition() );
    realEstate.setDeposit( StringUtils.abbreviate( Lorem.getWords( 1, 10 ), 50 ) );
    realEstate.setDistanceToAirport( getRandomInt( 5, 50 ) );
    realEstate.setDistanceToFM( getRandomInt( 5, 50 ) );
    realEstate.setDistanceToMRS( getRandomInt( 5, 50 ) );
    realEstate.setDistanceToPT( getRandomInt( 5, 50 ) );
    realEstate.setEnergySourcesEnev2014( createRandomEnergySourcesEnev2014() );
    realEstate.setFloorLoad( getRandomDouble( 500, 50000 ) );
    realEstate.setFlooringType( getRandomFlooringType() );
    realEstate.setFreeFrom( StringUtils.abbreviate( Lorem.getWords( 1, 10 ), 50 ) );
    realEstate.setGoodsLift( getRandomYesNotApplicableType() );
    realEstate.setGoodsLiftLoad( getRandomDouble( 500, 50000 ) );
    realEstate.setHeatingTypeEnev2014( getRandomHeatingTypeEnev2014() );
    realEstate.setInteriorQuality( getRandomInteriorQuality() );
    realEstate.setLastRefurbishment( getRandomInt( 1990, 2014 ) );
    realEstate.setLift( getRandomYesNotApplicableType() );
    realEstate.setListed( getRandomYesNotApplicableType() );
    realEstate.setLocationClassificationType( getRandomLocationClassificationType() );
    realEstate.setMinDivisible( getRandomDouble( 500, 2500 ) );
    realEstate.setNetFloorSpace( getRandomDouble( 50, 5000 ) );
    realEstate.setNumberOfFloors( String.valueOf( getRandomInt( 1, 10 ) ) );
    realEstate.setNumberOfParkingSpaces( getRandomInt( 1, 10 ) );
    realEstate.setParkingSpacePrice( getRandomDouble( 30, 300 ) );
    realEstate.setRamp( getRandomYesNotApplicableType() );
    realEstate.setShopWindowLength( getRandomDouble( 2, 15 ) );
    realEstate.setStoreType( getRandomStoreType() );
    realEstate.setSupplyType( getRandomSupplyType() );
    realEstate.setTotalFloorSpace( getRandomDouble( 50, 500 ) );

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
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( Lorem.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( Lorem.getParagraphs( 2, 10 ), 1000 ) );
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
        realEstate.getEnergyCertificate().setElectricityConsumption( getRandomDouble( 10, 250 ) );
        realEstate.getEnergyCertificate().setHeatingConsumption( getRandomDouble( 10, 250 ) );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
        realEstate.setEnergyConsumptionContainsWarmWater( getRandomYesNotApplicableType() );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setEnergyConsumptionElectricity( getRandomDouble( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyConsumptionHeating( getRandomDouble( 10, 250 ) );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
    }

    // energy certificate for business by demand
    else
    {
      realEstate.setBuildingEnergyRatingType( BuildingEnergyRatingType.ENERGY_REQUIRED );
      if (getRandomBoolean())
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.BEFORE_01_MAY_2014 );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
      else
      {
        realEstate.getEnergyCertificate().setEnergyCertificateCreationDate( EnergyCertificateCreationDate.FROM_01_MAY_2014 );
        realEstate.getEnergyCertificate().setThermalCharacteristicElectricity( getRandomDouble( 500, 2500 ) );
        realEstate.getEnergyCertificate().setThermalCharacteristicHeating( getRandomDouble( 500, 2500 ) );
        realEstate.getEnergyCertificate().setEnergyEfficiencyClass( getRandomEnergyEfficiencyClass() );
        realEstate.setThermalCharacteristic( getRandomDouble( 20, 500 ) );
      }
    }

    // pricing for rent
    if (getRandomBoolean())
    {
      realEstate.setCommercializationType( CommercializationType.RENT );
      realEstate.setPrice( getDefaultPrice() );
      realEstate.getPrice().setMarketingType( MarketingType.RENT );
      realEstate.getPrice().setPriceIntervalType( PriceIntervalType.MONTH );
      realEstate.getPrice().setValue( getRandomDouble( 500, 5000 ) );
    }

    // pricing for purchase
    else
    {
      realEstate.setCommercializationType( CommercializationType.BUY );
      realEstate.setPrice( getDefaultPrice() );
      realEstate.getPrice().setMarketingType( MarketingType.PURCHASE );
      realEstate.getPrice().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
      realEstate.getPrice().setValue( getRandomDouble( 50000, 999999 ) );
    }

    // pricing / additional costs
    realEstate.setAdditionalCosts( getDefaultPrice() );
    realEstate.getAdditionalCosts().setPriceIntervalType( PriceIntervalType.MONTH );
    realEstate.getAdditionalCosts().setValue( getRandomDouble( 500, 5000 ) );

    // pricing / calculated price
    //realEstate.setCalculatedPrice( getDefaultPrice() );
    //realEstate.getCalculatedPrice().setValue( value );
  }

  protected void initRealEstate( TradeSite realEstate )
  {
    realEstate.setBuildingPermission( getRandomBoolean() );
    realEstate.setDemolition( getRandomBoolean() );
    realEstate.setFreeFrom( StringUtils.abbreviate( Lorem.getWords( 1, 10 ), 50 ) );
    realEstate.setGfz( getRandomDouble( 1, 10 ) );
    realEstate.setGrz( getRandomDouble( 1, 10 ) );
    realEstate.setMinDivisible( getRandomDouble( 500, 2500 ) );
    realEstate.setPlotArea( getRandomDouble( 100, 5000 ) );
    realEstate.setRecommendedUseTypes( createRandomSiteRecommendedUseForTradeTypes() );
    realEstate.setShortTermConstructible( getRandomBoolean() );
    realEstate.setSiteConstructibleType( getRandomSiteConstructibleType() );
    realEstate.setSiteDevelopmentType( getRandomSiteDevelopmentType() );
    realEstate.setTenancy( getRandomInt( 100 ) );
    realEstate.setUtilizationTradeSite( getRandomUtilizationTradeSite() );

    // courtage
    realEstate.setCourtage( commonFactory.createCourtageInfo() );
    realEstate.getCourtage().setCourtage( StringUtils.abbreviate( Lorem.getWords( 1, 5 ), 100 ) );
    realEstate.getCourtage().setCourtageNote( StringUtils.abbreviate( Lorem.getParagraphs( 2, 10 ), 1000 ) );
    realEstate.getCourtage().setHasCourtage( YesNoNotApplicableType.YES );

    // pricing for leasing
    if (getRandomBoolean())
    {
      realEstate.setCommercializationType( CommercializationType.LEASE );
      realEstate.setPrice( getDefaultPrice() );
      realEstate.getPrice().setMarketingType( MarketingType.LEASE );
      realEstate.getPrice().setPriceIntervalType( PriceIntervalType.YEAR );
      realEstate.getPrice().setValue( getRandomDouble( 50000, 999999 ) );
    }

    // pricing for purchase
    else
    {
      realEstate.setCommercializationType( CommercializationType.BUY );
      realEstate.setPrice( getDefaultPrice() );
      realEstate.getPrice().setMarketingType( MarketingType.PURCHASE );
      realEstate.getPrice().setPriceIntervalType( PriceIntervalType.ONE_TIME_CHARGE );
      realEstate.getPrice().setValue( getRandomDouble( 50000, 999999 ) );
    }
  }

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

    public Class getTypeClass()
    {
      return typeClass;
    }
  }
}