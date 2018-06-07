
package org.openestate.is24.restapi.xml.expose;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.CopyStrategy2;
import org.jvnet.jaxb2_commons.lang.CopyTo2;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;
import org.openestate.is24.restapi.xml.Adapter1;
import org.openestate.is24.restapi.xml.common.Adapter2;
import org.openestate.is24.restapi.xml.common.ApartmentType;
import org.openestate.is24.restapi.xml.common.BuildingEnergyRatingType;
import org.openestate.is24.restapi.xml.common.CourtageInfo;
import org.openestate.is24.restapi.xml.common.EnergyPerformanceCertificate;
import org.openestate.is24.restapi.xml.common.EnergySourcesEnev2014;
import org.openestate.is24.restapi.xml.common.FiringTypes;
import org.openestate.is24.restapi.xml.common.HeatingType;
import org.openestate.is24.restapi.xml.common.HeatingTypeEnev2014;
import org.openestate.is24.restapi.xml.common.InteriorQuality;
import org.openestate.is24.restapi.xml.common.ParkingSpaceType;
import org.openestate.is24.restapi.xml.common.PetsAllowedType;
import org.openestate.is24.restapi.xml.common.Price;
import org.openestate.is24.restapi.xml.common.RealEstateCondition;
import org.openestate.is24.restapi.xml.common.YesNoNotApplicableType;
import org.openestate.is24.restapi.xml.common.YesNotApplicableType;
import org.openestate.is24.restapi.xml.realestates.Adapter11;
import org.openestate.is24.restapi.xml.realestates.Adapter12;
import org.openestate.is24.restapi.xml.realestates.Adapter13;
import org.openestate.is24.restapi.xml.realestates.Adapter14;
import org.openestate.is24.restapi.xml.realestates.Adapter15;
import org.openestate.is24.restapi.xml.realestates.Adapter16;
import org.openestate.is24.restapi.xml.realestates.Adapter17;
import org.openestate.is24.restapi.xml.realestates.Adapter18;
import org.openestate.is24.restapi.xml.realestates.Adapter19;


/**
 * Eigenschaften f\u00fcr den Wohnung-Miete Immobilientyp
 * 
 * <p>Java class for ApartmentRent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApartmentRent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/search/expose/1.0}ExposeRealEstate"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}ExtendedApartmentRentGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApartmentRent", propOrder = {
    "apartmentType",
    "floor",
    "lift",
    "assistedLiving",
    "energyCertificate",
    "cellar",
    "handicappedAccessible",
    "numberOfParkingSpaces",
    "condition",
    "lastRefurbishment",
    "interiorQuality",
    "constructionYear",
    "constructionYearUnknown",
    "freeFrom",
    "heatingType",
    "heatingTypeEnev2014",
    "firingTypes",
    "energySourcesEnev2014",
    "buildingEnergyRatingType",
    "thermalCharacteristic",
    "energyConsumptionContainsWarmWater",
    "numberOfFloors",
    "usableFloorSpace",
    "numberOfBedRooms",
    "numberOfBathRooms",
    "guestToilet",
    "parkingSpaceType",
    "baseRent",
    "totalRent",
    "serviceCharge",
    "deposit",
    "heatingCosts",
    "heatingCostsInServiceCharge",
    "petsAllowed",
    "parkingSpacePrice",
    "useAsFlatshareRoom",
    "price",
    "livingSpace",
    "numberOfRooms",
    "energyPerformanceCertificate",
    "builtInKitchen",
    "balcony",
    "certificateOfEligibilityNeeded",
    "garden",
    "courtage"
})
public class ApartmentRent
    extends ExposeRealEstate
    implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlSchemaType(name = "string")
    protected ApartmentType apartmentType;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter11 .class)
    protected Integer floor;
    protected Boolean lift;
    @Deprecated
    protected Boolean assistedLiving;
    protected EnergyPerformanceCertificate energyCertificate;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType cellar;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType handicappedAccessible;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    protected Integer numberOfParkingSpaces;
    @XmlSchemaType(name = "string")
    protected RealEstateCondition condition;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter13 .class)
    protected Integer lastRefurbishment;
    @XmlSchemaType(name = "string")
    protected InteriorQuality interiorQuality;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter14 .class)
    protected Integer constructionYear;
    protected Boolean constructionYearUnknown;
    @XmlJavaTypeAdapter(Adapter15 .class)
    protected String freeFrom;
    @XmlSchemaType(name = "string")
    @Deprecated
    protected HeatingType heatingType;
    @XmlSchemaType(name = "string")
    protected HeatingTypeEnev2014 heatingTypeEnev2014;
    @Deprecated
    protected FiringTypes firingTypes;
    protected EnergySourcesEnev2014 energySourcesEnev2014;
    @XmlSchemaType(name = "string")
    protected BuildingEnergyRatingType buildingEnergyRatingType;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter16 .class)
    protected BigDecimal thermalCharacteristic;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType energyConsumptionContainsWarmWater;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter17 .class)
    protected Integer numberOfFloors;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal usableFloorSpace;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter18 .class)
    protected Integer numberOfBedRooms;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter19 .class)
    protected Integer numberOfBathRooms;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType guestToilet;
    @XmlSchemaType(name = "string")
    protected ParkingSpaceType parkingSpaceType;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal baseRent;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal totalRent;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal serviceCharge;
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected String deposit;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal heatingCosts;
    @XmlSchemaType(name = "string")
    protected YesNoNotApplicableType heatingCostsInServiceCharge;
    @XmlSchemaType(name = "string")
    protected PetsAllowedType petsAllowed;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal parkingSpacePrice;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType useAsFlatshareRoom;
    protected Price price;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal livingSpace;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal numberOfRooms;
    protected Boolean energyPerformanceCertificate;
    protected Boolean builtInKitchen;
    protected Boolean balcony;
    protected Boolean certificateOfEligibilityNeeded;
    protected Boolean garden;
    @XmlElement(required = true)
    protected CourtageInfo courtage;

    /**
     * Gets the value of the apartmentType property.
     * 
     * @return
     *     possible object is
     *     {@link ApartmentType }
     *     
     */
    public ApartmentType getApartmentType() {
        return apartmentType;
    }

    /**
     * Sets the value of the apartmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApartmentType }
     *     
     */
    public void setApartmentType(ApartmentType value) {
        this.apartmentType = value;
    }

    /**
     * Gets the value of the floor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getFloor() {
        return floor;
    }

    /**
     * Sets the value of the floor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloor(Integer value) {
        this.floor = value;
    }

    /**
     * Gets the value of the lift property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLift() {
        return lift;
    }

    /**
     * Sets the value of the lift property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLift(Boolean value) {
        this.lift = value;
    }

    /**
     * Gets the value of the assistedLiving property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Deprecated
    public Boolean isAssistedLiving() {
        return assistedLiving;
    }

    /**
     * Sets the value of the assistedLiving property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Deprecated
    public void setAssistedLiving(Boolean value) {
        this.assistedLiving = value;
    }

    /**
     * Gets the value of the energyCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyPerformanceCertificate }
     *     
     */
    public EnergyPerformanceCertificate getEnergyCertificate() {
        return energyCertificate;
    }

    /**
     * Sets the value of the energyCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyPerformanceCertificate }
     *     
     */
    public void setEnergyCertificate(EnergyPerformanceCertificate value) {
        this.energyCertificate = value;
    }

    /**
     * Gets the value of the cellar property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCellar() {
        return cellar;
    }

    /**
     * Sets the value of the cellar property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCellar(YesNotApplicableType value) {
        this.cellar = value;
    }

    /**
     * Gets the value of the handicappedAccessible property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getHandicappedAccessible() {
        return handicappedAccessible;
    }

    /**
     * Sets the value of the handicappedAccessible property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setHandicappedAccessible(YesNotApplicableType value) {
        this.handicappedAccessible = value;
    }

    /**
     * Gets the value of the numberOfParkingSpaces property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getNumberOfParkingSpaces() {
        return numberOfParkingSpaces;
    }

    /**
     * Sets the value of the numberOfParkingSpaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfParkingSpaces(Integer value) {
        this.numberOfParkingSpaces = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link RealEstateCondition }
     *     
     */
    public RealEstateCondition getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealEstateCondition }
     *     
     */
    public void setCondition(RealEstateCondition value) {
        this.condition = value;
    }

    /**
     * Gets the value of the lastRefurbishment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getLastRefurbishment() {
        return lastRefurbishment;
    }

    /**
     * Sets the value of the lastRefurbishment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastRefurbishment(Integer value) {
        this.lastRefurbishment = value;
    }

    /**
     * Gets the value of the interiorQuality property.
     * 
     * @return
     *     possible object is
     *     {@link InteriorQuality }
     *     
     */
    public InteriorQuality getInteriorQuality() {
        return interiorQuality;
    }

    /**
     * Sets the value of the interiorQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteriorQuality }
     *     
     */
    public void setInteriorQuality(InteriorQuality value) {
        this.interiorQuality = value;
    }

    /**
     * Gets the value of the constructionYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getConstructionYear() {
        return constructionYear;
    }

    /**
     * Sets the value of the constructionYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstructionYear(Integer value) {
        this.constructionYear = value;
    }

    /**
     * Gets the value of the constructionYearUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConstructionYearUnknown() {
        return constructionYearUnknown;
    }

    /**
     * Sets the value of the constructionYearUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConstructionYearUnknown(Boolean value) {
        this.constructionYearUnknown = value;
    }

    /**
     * Gets the value of the freeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeFrom() {
        return freeFrom;
    }

    /**
     * Sets the value of the freeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeFrom(String value) {
        this.freeFrom = value;
    }

    /**
     * Gets the value of the heatingType property.
     * 
     * @return
     *     possible object is
     *     {@link HeatingType }
     *     
     */
    @Deprecated
    public HeatingType getHeatingType() {
        return heatingType;
    }

    /**
     * Sets the value of the heatingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeatingType }
     *     
     */
    @Deprecated
    public void setHeatingType(HeatingType value) {
        this.heatingType = value;
    }

    /**
     * Gets the value of the heatingTypeEnev2014 property.
     * 
     * @return
     *     possible object is
     *     {@link HeatingTypeEnev2014 }
     *     
     */
    public HeatingTypeEnev2014 getHeatingTypeEnev2014() {
        return heatingTypeEnev2014;
    }

    /**
     * Sets the value of the heatingTypeEnev2014 property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeatingTypeEnev2014 }
     *     
     */
    public void setHeatingTypeEnev2014(HeatingTypeEnev2014 value) {
        this.heatingTypeEnev2014 = value;
    }

    /**
     * Gets the value of the firingTypes property.
     * 
     * @return
     *     possible object is
     *     {@link FiringTypes }
     *     
     */
    @Deprecated
    public FiringTypes getFiringTypes() {
        return firingTypes;
    }

    /**
     * Sets the value of the firingTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiringTypes }
     *     
     */
    @Deprecated
    public void setFiringTypes(FiringTypes value) {
        this.firingTypes = value;
    }

    /**
     * Gets the value of the energySourcesEnev2014 property.
     * 
     * @return
     *     possible object is
     *     {@link EnergySourcesEnev2014 }
     *     
     */
    public EnergySourcesEnev2014 getEnergySourcesEnev2014() {
        return energySourcesEnev2014;
    }

    /**
     * Sets the value of the energySourcesEnev2014 property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergySourcesEnev2014 }
     *     
     */
    public void setEnergySourcesEnev2014(EnergySourcesEnev2014 value) {
        this.energySourcesEnev2014 = value;
    }

    /**
     * Gets the value of the buildingEnergyRatingType property.
     * 
     * @return
     *     possible object is
     *     {@link BuildingEnergyRatingType }
     *     
     */
    public BuildingEnergyRatingType getBuildingEnergyRatingType() {
        return buildingEnergyRatingType;
    }

    /**
     * Sets the value of the buildingEnergyRatingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildingEnergyRatingType }
     *     
     */
    public void setBuildingEnergyRatingType(BuildingEnergyRatingType value) {
        this.buildingEnergyRatingType = value;
    }

    /**
     * Gets the value of the thermalCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getThermalCharacteristic() {
        return thermalCharacteristic;
    }

    /**
     * Sets the value of the thermalCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThermalCharacteristic(BigDecimal value) {
        this.thermalCharacteristic = value;
    }

    /**
     * Gets the value of the energyConsumptionContainsWarmWater property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getEnergyConsumptionContainsWarmWater() {
        return energyConsumptionContainsWarmWater;
    }

    /**
     * Sets the value of the energyConsumptionContainsWarmWater property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setEnergyConsumptionContainsWarmWater(YesNotApplicableType value) {
        this.energyConsumptionContainsWarmWater = value;
    }

    /**
     * Gets the value of the numberOfFloors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    /**
     * Sets the value of the numberOfFloors property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfFloors(Integer value) {
        this.numberOfFloors = value;
    }

    /**
     * Gets the value of the usableFloorSpace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getUsableFloorSpace() {
        return usableFloorSpace;
    }

    /**
     * Sets the value of the usableFloorSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsableFloorSpace(BigDecimal value) {
        this.usableFloorSpace = value;
    }

    /**
     * Gets the value of the numberOfBedRooms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getNumberOfBedRooms() {
        return numberOfBedRooms;
    }

    /**
     * Sets the value of the numberOfBedRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfBedRooms(Integer value) {
        this.numberOfBedRooms = value;
    }

    /**
     * Gets the value of the numberOfBathRooms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getNumberOfBathRooms() {
        return numberOfBathRooms;
    }

    /**
     * Sets the value of the numberOfBathRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfBathRooms(Integer value) {
        this.numberOfBathRooms = value;
    }

    /**
     * Gets the value of the guestToilet property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getGuestToilet() {
        return guestToilet;
    }

    /**
     * Sets the value of the guestToilet property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setGuestToilet(YesNotApplicableType value) {
        this.guestToilet = value;
    }

    /**
     * Gets the value of the parkingSpaceType property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingSpaceType }
     *     
     */
    public ParkingSpaceType getParkingSpaceType() {
        return parkingSpaceType;
    }

    /**
     * Sets the value of the parkingSpaceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingSpaceType }
     *     
     */
    public void setParkingSpaceType(ParkingSpaceType value) {
        this.parkingSpaceType = value;
    }

    /**
     * Gets the value of the baseRent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getBaseRent() {
        return baseRent;
    }

    /**
     * Sets the value of the baseRent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseRent(BigDecimal value) {
        this.baseRent = value;
    }

    /**
     * Gets the value of the totalRent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getTotalRent() {
        return totalRent;
    }

    /**
     * Sets the value of the totalRent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalRent(BigDecimal value) {
        this.totalRent = value;
    }

    /**
     * Gets the value of the serviceCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getServiceCharge() {
        return serviceCharge;
    }

    /**
     * Sets the value of the serviceCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCharge(BigDecimal value) {
        this.serviceCharge = value;
    }

    /**
     * Gets the value of the deposit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeposit() {
        return deposit;
    }

    /**
     * Sets the value of the deposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeposit(String value) {
        this.deposit = value;
    }

    /**
     * Gets the value of the heatingCosts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getHeatingCosts() {
        return heatingCosts;
    }

    /**
     * Sets the value of the heatingCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeatingCosts(BigDecimal value) {
        this.heatingCosts = value;
    }

    /**
     * Gets the value of the heatingCostsInServiceCharge property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoNotApplicableType }
     *     
     */
    public YesNoNotApplicableType getHeatingCostsInServiceCharge() {
        return heatingCostsInServiceCharge;
    }

    /**
     * Sets the value of the heatingCostsInServiceCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoNotApplicableType }
     *     
     */
    public void setHeatingCostsInServiceCharge(YesNoNotApplicableType value) {
        this.heatingCostsInServiceCharge = value;
    }

    /**
     * Gets the value of the petsAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link PetsAllowedType }
     *     
     */
    public PetsAllowedType getPetsAllowed() {
        return petsAllowed;
    }

    /**
     * Sets the value of the petsAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PetsAllowedType }
     *     
     */
    public void setPetsAllowed(PetsAllowedType value) {
        this.petsAllowed = value;
    }

    /**
     * Gets the value of the parkingSpacePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getParkingSpacePrice() {
        return parkingSpacePrice;
    }

    /**
     * Sets the value of the parkingSpacePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkingSpacePrice(BigDecimal value) {
        this.parkingSpacePrice = value;
    }

    /**
     * Gets the value of the useAsFlatshareRoom property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getUseAsFlatshareRoom() {
        return useAsFlatshareRoom;
    }

    /**
     * Sets the value of the useAsFlatshareRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setUseAsFlatshareRoom(YesNotApplicableType value) {
        this.useAsFlatshareRoom = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setPrice(Price value) {
        this.price = value;
    }

    /**
     * Gets the value of the livingSpace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getLivingSpace() {
        return livingSpace;
    }

    /**
     * Sets the value of the livingSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLivingSpace(BigDecimal value) {
        this.livingSpace = value;
    }

    /**
     * Gets the value of the numberOfRooms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getNumberOfRooms() {
        return numberOfRooms;
    }

    /**
     * Sets the value of the numberOfRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfRooms(BigDecimal value) {
        this.numberOfRooms = value;
    }

    /**
     * Gets the value of the energyPerformanceCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnergyPerformanceCertificate() {
        return energyPerformanceCertificate;
    }

    /**
     * Sets the value of the energyPerformanceCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnergyPerformanceCertificate(Boolean value) {
        this.energyPerformanceCertificate = value;
    }

    /**
     * Gets the value of the builtInKitchen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuiltInKitchen() {
        return builtInKitchen;
    }

    /**
     * Sets the value of the builtInKitchen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuiltInKitchen(Boolean value) {
        this.builtInKitchen = value;
    }

    /**
     * Gets the value of the balcony property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBalcony() {
        return balcony;
    }

    /**
     * Sets the value of the balcony property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBalcony(Boolean value) {
        this.balcony = value;
    }

    /**
     * Gets the value of the certificateOfEligibilityNeeded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCertificateOfEligibilityNeeded() {
        return certificateOfEligibilityNeeded;
    }

    /**
     * Sets the value of the certificateOfEligibilityNeeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCertificateOfEligibilityNeeded(Boolean value) {
        this.certificateOfEligibilityNeeded = value;
    }

    /**
     * Gets the value of the garden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGarden() {
        return garden;
    }

    /**
     * Sets the value of the garden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGarden(Boolean value) {
        this.garden = value;
    }

    /**
     * Gets the value of the courtage property.
     * 
     * @return
     *     possible object is
     *     {@link CourtageInfo }
     *     
     */
    public CourtageInfo getCourtage() {
        return courtage;
    }

    /**
     * Sets the value of the courtage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourtageInfo }
     *     
     */
    public void setCourtage(CourtageInfo value) {
        this.courtage = value;
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            ApartmentType theApartmentType;
            theApartmentType = this.getApartmentType();
            strategy.appendField(locator, this, "apartmentType", buffer, theApartmentType, (this.apartmentType!= null));
        }
        {
            Integer theFloor;
            theFloor = this.getFloor();
            strategy.appendField(locator, this, "floor", buffer, theFloor, (this.floor!= null));
        }
        {
            Boolean theLift;
            theLift = this.isLift();
            strategy.appendField(locator, this, "lift", buffer, theLift, (this.lift!= null));
        }
        {
            Boolean theAssistedLiving;
            theAssistedLiving = this.isAssistedLiving();
            strategy.appendField(locator, this, "assistedLiving", buffer, theAssistedLiving, (this.assistedLiving!= null));
        }
        {
            EnergyPerformanceCertificate theEnergyCertificate;
            theEnergyCertificate = this.getEnergyCertificate();
            strategy.appendField(locator, this, "energyCertificate", buffer, theEnergyCertificate, (this.energyCertificate!= null));
        }
        {
            YesNotApplicableType theCellar;
            theCellar = this.getCellar();
            strategy.appendField(locator, this, "cellar", buffer, theCellar, (this.cellar!= null));
        }
        {
            YesNotApplicableType theHandicappedAccessible;
            theHandicappedAccessible = this.getHandicappedAccessible();
            strategy.appendField(locator, this, "handicappedAccessible", buffer, theHandicappedAccessible, (this.handicappedAccessible!= null));
        }
        {
            Integer theNumberOfParkingSpaces;
            theNumberOfParkingSpaces = this.getNumberOfParkingSpaces();
            strategy.appendField(locator, this, "numberOfParkingSpaces", buffer, theNumberOfParkingSpaces, (this.numberOfParkingSpaces!= null));
        }
        {
            RealEstateCondition theCondition;
            theCondition = this.getCondition();
            strategy.appendField(locator, this, "condition", buffer, theCondition, (this.condition!= null));
        }
        {
            Integer theLastRefurbishment;
            theLastRefurbishment = this.getLastRefurbishment();
            strategy.appendField(locator, this, "lastRefurbishment", buffer, theLastRefurbishment, (this.lastRefurbishment!= null));
        }
        {
            InteriorQuality theInteriorQuality;
            theInteriorQuality = this.getInteriorQuality();
            strategy.appendField(locator, this, "interiorQuality", buffer, theInteriorQuality, (this.interiorQuality!= null));
        }
        {
            Integer theConstructionYear;
            theConstructionYear = this.getConstructionYear();
            strategy.appendField(locator, this, "constructionYear", buffer, theConstructionYear, (this.constructionYear!= null));
        }
        {
            Boolean theConstructionYearUnknown;
            theConstructionYearUnknown = this.isConstructionYearUnknown();
            strategy.appendField(locator, this, "constructionYearUnknown", buffer, theConstructionYearUnknown, (this.constructionYearUnknown!= null));
        }
        {
            String theFreeFrom;
            theFreeFrom = this.getFreeFrom();
            strategy.appendField(locator, this, "freeFrom", buffer, theFreeFrom, (this.freeFrom!= null));
        }
        {
            HeatingType theHeatingType;
            theHeatingType = this.getHeatingType();
            strategy.appendField(locator, this, "heatingType", buffer, theHeatingType, (this.heatingType!= null));
        }
        {
            HeatingTypeEnev2014 theHeatingTypeEnev2014;
            theHeatingTypeEnev2014 = this.getHeatingTypeEnev2014();
            strategy.appendField(locator, this, "heatingTypeEnev2014", buffer, theHeatingTypeEnev2014, (this.heatingTypeEnev2014 != null));
        }
        {
            FiringTypes theFiringTypes;
            theFiringTypes = this.getFiringTypes();
            strategy.appendField(locator, this, "firingTypes", buffer, theFiringTypes, (this.firingTypes!= null));
        }
        {
            EnergySourcesEnev2014 theEnergySourcesEnev2014;
            theEnergySourcesEnev2014 = this.getEnergySourcesEnev2014();
            strategy.appendField(locator, this, "energySourcesEnev2014", buffer, theEnergySourcesEnev2014, (this.energySourcesEnev2014 != null));
        }
        {
            BuildingEnergyRatingType theBuildingEnergyRatingType;
            theBuildingEnergyRatingType = this.getBuildingEnergyRatingType();
            strategy.appendField(locator, this, "buildingEnergyRatingType", buffer, theBuildingEnergyRatingType, (this.buildingEnergyRatingType!= null));
        }
        {
            BigDecimal theThermalCharacteristic;
            theThermalCharacteristic = this.getThermalCharacteristic();
            strategy.appendField(locator, this, "thermalCharacteristic", buffer, theThermalCharacteristic, (this.thermalCharacteristic!= null));
        }
        {
            YesNotApplicableType theEnergyConsumptionContainsWarmWater;
            theEnergyConsumptionContainsWarmWater = this.getEnergyConsumptionContainsWarmWater();
            strategy.appendField(locator, this, "energyConsumptionContainsWarmWater", buffer, theEnergyConsumptionContainsWarmWater, (this.energyConsumptionContainsWarmWater!= null));
        }
        {
            Integer theNumberOfFloors;
            theNumberOfFloors = this.getNumberOfFloors();
            strategy.appendField(locator, this, "numberOfFloors", buffer, theNumberOfFloors, (this.numberOfFloors!= null));
        }
        {
            BigDecimal theUsableFloorSpace;
            theUsableFloorSpace = this.getUsableFloorSpace();
            strategy.appendField(locator, this, "usableFloorSpace", buffer, theUsableFloorSpace, (this.usableFloorSpace!= null));
        }
        {
            Integer theNumberOfBedRooms;
            theNumberOfBedRooms = this.getNumberOfBedRooms();
            strategy.appendField(locator, this, "numberOfBedRooms", buffer, theNumberOfBedRooms, (this.numberOfBedRooms!= null));
        }
        {
            Integer theNumberOfBathRooms;
            theNumberOfBathRooms = this.getNumberOfBathRooms();
            strategy.appendField(locator, this, "numberOfBathRooms", buffer, theNumberOfBathRooms, (this.numberOfBathRooms!= null));
        }
        {
            YesNotApplicableType theGuestToilet;
            theGuestToilet = this.getGuestToilet();
            strategy.appendField(locator, this, "guestToilet", buffer, theGuestToilet, (this.guestToilet!= null));
        }
        {
            ParkingSpaceType theParkingSpaceType;
            theParkingSpaceType = this.getParkingSpaceType();
            strategy.appendField(locator, this, "parkingSpaceType", buffer, theParkingSpaceType, (this.parkingSpaceType!= null));
        }
        {
            BigDecimal theBaseRent;
            theBaseRent = this.getBaseRent();
            strategy.appendField(locator, this, "baseRent", buffer, theBaseRent, (this.baseRent!= null));
        }
        {
            BigDecimal theTotalRent;
            theTotalRent = this.getTotalRent();
            strategy.appendField(locator, this, "totalRent", buffer, theTotalRent, (this.totalRent!= null));
        }
        {
            BigDecimal theServiceCharge;
            theServiceCharge = this.getServiceCharge();
            strategy.appendField(locator, this, "serviceCharge", buffer, theServiceCharge, (this.serviceCharge!= null));
        }
        {
            String theDeposit;
            theDeposit = this.getDeposit();
            strategy.appendField(locator, this, "deposit", buffer, theDeposit, (this.deposit!= null));
        }
        {
            BigDecimal theHeatingCosts;
            theHeatingCosts = this.getHeatingCosts();
            strategy.appendField(locator, this, "heatingCosts", buffer, theHeatingCosts, (this.heatingCosts!= null));
        }
        {
            YesNoNotApplicableType theHeatingCostsInServiceCharge;
            theHeatingCostsInServiceCharge = this.getHeatingCostsInServiceCharge();
            strategy.appendField(locator, this, "heatingCostsInServiceCharge", buffer, theHeatingCostsInServiceCharge, (this.heatingCostsInServiceCharge!= null));
        }
        {
            PetsAllowedType thePetsAllowed;
            thePetsAllowed = this.getPetsAllowed();
            strategy.appendField(locator, this, "petsAllowed", buffer, thePetsAllowed, (this.petsAllowed!= null));
        }
        {
            BigDecimal theParkingSpacePrice;
            theParkingSpacePrice = this.getParkingSpacePrice();
            strategy.appendField(locator, this, "parkingSpacePrice", buffer, theParkingSpacePrice, (this.parkingSpacePrice!= null));
        }
        {
            YesNotApplicableType theUseAsFlatshareRoom;
            theUseAsFlatshareRoom = this.getUseAsFlatshareRoom();
            strategy.appendField(locator, this, "useAsFlatshareRoom", buffer, theUseAsFlatshareRoom, (this.useAsFlatshareRoom!= null));
        }
        {
            Price thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice, (this.price!= null));
        }
        {
            BigDecimal theLivingSpace;
            theLivingSpace = this.getLivingSpace();
            strategy.appendField(locator, this, "livingSpace", buffer, theLivingSpace, (this.livingSpace!= null));
        }
        {
            BigDecimal theNumberOfRooms;
            theNumberOfRooms = this.getNumberOfRooms();
            strategy.appendField(locator, this, "numberOfRooms", buffer, theNumberOfRooms, (this.numberOfRooms!= null));
        }
        {
            Boolean theEnergyPerformanceCertificate;
            theEnergyPerformanceCertificate = this.isEnergyPerformanceCertificate();
            strategy.appendField(locator, this, "energyPerformanceCertificate", buffer, theEnergyPerformanceCertificate, (this.energyPerformanceCertificate!= null));
        }
        {
            Boolean theBuiltInKitchen;
            theBuiltInKitchen = this.isBuiltInKitchen();
            strategy.appendField(locator, this, "builtInKitchen", buffer, theBuiltInKitchen, (this.builtInKitchen!= null));
        }
        {
            Boolean theBalcony;
            theBalcony = this.isBalcony();
            strategy.appendField(locator, this, "balcony", buffer, theBalcony, (this.balcony!= null));
        }
        {
            Boolean theCertificateOfEligibilityNeeded;
            theCertificateOfEligibilityNeeded = this.isCertificateOfEligibilityNeeded();
            strategy.appendField(locator, this, "certificateOfEligibilityNeeded", buffer, theCertificateOfEligibilityNeeded, (this.certificateOfEligibilityNeeded!= null));
        }
        {
            Boolean theGarden;
            theGarden = this.isGarden();
            strategy.appendField(locator, this, "garden", buffer, theGarden, (this.garden!= null));
        }
        {
            CourtageInfo theCourtage;
            theCourtage = this.getCourtage();
            strategy.appendField(locator, this, "courtage", buffer, theCourtage, (this.courtage!= null));
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof ApartmentRent) {
            final ApartmentRent copy = ((ApartmentRent) draftCopy);
            {
                Boolean apartmentTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.apartmentType!= null));
                if (apartmentTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ApartmentType sourceApartmentType;
                    sourceApartmentType = this.getApartmentType();
                    ApartmentType copyApartmentType = ((ApartmentType) strategy.copy(LocatorUtils.property(locator, "apartmentType", sourceApartmentType), sourceApartmentType, (this.apartmentType!= null)));
                    copy.setApartmentType(copyApartmentType);
                } else {
                    if (apartmentTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.apartmentType = null;
                    }
                }
            }
            {
                Boolean floorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.floor!= null));
                if (floorShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceFloor;
                    sourceFloor = this.getFloor();
                    Integer copyFloor = ((Integer) strategy.copy(LocatorUtils.property(locator, "floor", sourceFloor), sourceFloor, (this.floor!= null)));
                    copy.setFloor(copyFloor);
                } else {
                    if (floorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.floor = null;
                    }
                }
            }
            {
                Boolean liftShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lift!= null));
                if (liftShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceLift;
                    sourceLift = this.isLift();
                    Boolean copyLift = ((Boolean) strategy.copy(LocatorUtils.property(locator, "lift", sourceLift), sourceLift, (this.lift!= null)));
                    copy.setLift(copyLift);
                } else {
                    if (liftShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lift = null;
                    }
                }
            }
            {
                Boolean assistedLivingShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.assistedLiving!= null));
                if (assistedLivingShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceAssistedLiving;
                    sourceAssistedLiving = this.isAssistedLiving();
                    Boolean copyAssistedLiving = ((Boolean) strategy.copy(LocatorUtils.property(locator, "assistedLiving", sourceAssistedLiving), sourceAssistedLiving, (this.assistedLiving!= null)));
                    copy.setAssistedLiving(copyAssistedLiving);
                } else {
                    if (assistedLivingShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.assistedLiving = null;
                    }
                }
            }
            {
                Boolean energyCertificateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energyCertificate!= null));
                if (energyCertificateShouldBeCopiedAndSet == Boolean.TRUE) {
                    EnergyPerformanceCertificate sourceEnergyCertificate;
                    sourceEnergyCertificate = this.getEnergyCertificate();
                    EnergyPerformanceCertificate copyEnergyCertificate = ((EnergyPerformanceCertificate) strategy.copy(LocatorUtils.property(locator, "energyCertificate", sourceEnergyCertificate), sourceEnergyCertificate, (this.energyCertificate!= null)));
                    copy.setEnergyCertificate(copyEnergyCertificate);
                } else {
                    if (energyCertificateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energyCertificate = null;
                    }
                }
            }
            {
                Boolean cellarShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.cellar!= null));
                if (cellarShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceCellar;
                    sourceCellar = this.getCellar();
                    YesNotApplicableType copyCellar = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "cellar", sourceCellar), sourceCellar, (this.cellar!= null)));
                    copy.setCellar(copyCellar);
                } else {
                    if (cellarShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cellar = null;
                    }
                }
            }
            {
                Boolean handicappedAccessibleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.handicappedAccessible!= null));
                if (handicappedAccessibleShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceHandicappedAccessible;
                    sourceHandicappedAccessible = this.getHandicappedAccessible();
                    YesNotApplicableType copyHandicappedAccessible = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "handicappedAccessible", sourceHandicappedAccessible), sourceHandicappedAccessible, (this.handicappedAccessible!= null)));
                    copy.setHandicappedAccessible(copyHandicappedAccessible);
                } else {
                    if (handicappedAccessibleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.handicappedAccessible = null;
                    }
                }
            }
            {
                Boolean numberOfParkingSpacesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfParkingSpaces!= null));
                if (numberOfParkingSpacesShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceNumberOfParkingSpaces;
                    sourceNumberOfParkingSpaces = this.getNumberOfParkingSpaces();
                    Integer copyNumberOfParkingSpaces = ((Integer) strategy.copy(LocatorUtils.property(locator, "numberOfParkingSpaces", sourceNumberOfParkingSpaces), sourceNumberOfParkingSpaces, (this.numberOfParkingSpaces!= null)));
                    copy.setNumberOfParkingSpaces(copyNumberOfParkingSpaces);
                } else {
                    if (numberOfParkingSpacesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfParkingSpaces = null;
                    }
                }
            }
            {
                Boolean conditionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.condition!= null));
                if (conditionShouldBeCopiedAndSet == Boolean.TRUE) {
                    RealEstateCondition sourceCondition;
                    sourceCondition = this.getCondition();
                    RealEstateCondition copyCondition = ((RealEstateCondition) strategy.copy(LocatorUtils.property(locator, "condition", sourceCondition), sourceCondition, (this.condition!= null)));
                    copy.setCondition(copyCondition);
                } else {
                    if (conditionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.condition = null;
                    }
                }
            }
            {
                Boolean lastRefurbishmentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lastRefurbishment!= null));
                if (lastRefurbishmentShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceLastRefurbishment;
                    sourceLastRefurbishment = this.getLastRefurbishment();
                    Integer copyLastRefurbishment = ((Integer) strategy.copy(LocatorUtils.property(locator, "lastRefurbishment", sourceLastRefurbishment), sourceLastRefurbishment, (this.lastRefurbishment!= null)));
                    copy.setLastRefurbishment(copyLastRefurbishment);
                } else {
                    if (lastRefurbishmentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lastRefurbishment = null;
                    }
                }
            }
            {
                Boolean interiorQualityShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.interiorQuality!= null));
                if (interiorQualityShouldBeCopiedAndSet == Boolean.TRUE) {
                    InteriorQuality sourceInteriorQuality;
                    sourceInteriorQuality = this.getInteriorQuality();
                    InteriorQuality copyInteriorQuality = ((InteriorQuality) strategy.copy(LocatorUtils.property(locator, "interiorQuality", sourceInteriorQuality), sourceInteriorQuality, (this.interiorQuality!= null)));
                    copy.setInteriorQuality(copyInteriorQuality);
                } else {
                    if (interiorQualityShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.interiorQuality = null;
                    }
                }
            }
            {
                Boolean constructionYearShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.constructionYear!= null));
                if (constructionYearShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceConstructionYear;
                    sourceConstructionYear = this.getConstructionYear();
                    Integer copyConstructionYear = ((Integer) strategy.copy(LocatorUtils.property(locator, "constructionYear", sourceConstructionYear), sourceConstructionYear, (this.constructionYear!= null)));
                    copy.setConstructionYear(copyConstructionYear);
                } else {
                    if (constructionYearShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.constructionYear = null;
                    }
                }
            }
            {
                Boolean constructionYearUnknownShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.constructionYearUnknown!= null));
                if (constructionYearUnknownShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceConstructionYearUnknown;
                    sourceConstructionYearUnknown = this.isConstructionYearUnknown();
                    Boolean copyConstructionYearUnknown = ((Boolean) strategy.copy(LocatorUtils.property(locator, "constructionYearUnknown", sourceConstructionYearUnknown), sourceConstructionYearUnknown, (this.constructionYearUnknown!= null)));
                    copy.setConstructionYearUnknown(copyConstructionYearUnknown);
                } else {
                    if (constructionYearUnknownShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.constructionYearUnknown = null;
                    }
                }
            }
            {
                Boolean freeFromShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.freeFrom!= null));
                if (freeFromShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFreeFrom;
                    sourceFreeFrom = this.getFreeFrom();
                    String copyFreeFrom = ((String) strategy.copy(LocatorUtils.property(locator, "freeFrom", sourceFreeFrom), sourceFreeFrom, (this.freeFrom!= null)));
                    copy.setFreeFrom(copyFreeFrom);
                } else {
                    if (freeFromShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.freeFrom = null;
                    }
                }
            }
            {
                Boolean heatingTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.heatingType!= null));
                if (heatingTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    HeatingType sourceHeatingType;
                    sourceHeatingType = this.getHeatingType();
                    HeatingType copyHeatingType = ((HeatingType) strategy.copy(LocatorUtils.property(locator, "heatingType", sourceHeatingType), sourceHeatingType, (this.heatingType!= null)));
                    copy.setHeatingType(copyHeatingType);
                } else {
                    if (heatingTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.heatingType = null;
                    }
                }
            }
            {
                Boolean heatingTypeEnev2014ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.heatingTypeEnev2014 != null));
                if (heatingTypeEnev2014ShouldBeCopiedAndSet == Boolean.TRUE) {
                    HeatingTypeEnev2014 sourceHeatingTypeEnev2014;
                    sourceHeatingTypeEnev2014 = this.getHeatingTypeEnev2014();
                    HeatingTypeEnev2014 copyHeatingTypeEnev2014 = ((HeatingTypeEnev2014) strategy.copy(LocatorUtils.property(locator, "heatingTypeEnev2014", sourceHeatingTypeEnev2014), sourceHeatingTypeEnev2014, (this.heatingTypeEnev2014 != null)));
                    copy.setHeatingTypeEnev2014(copyHeatingTypeEnev2014);
                } else {
                    if (heatingTypeEnev2014ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.heatingTypeEnev2014 = null;
                    }
                }
            }
            {
                Boolean firingTypesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.firingTypes!= null));
                if (firingTypesShouldBeCopiedAndSet == Boolean.TRUE) {
                    FiringTypes sourceFiringTypes;
                    sourceFiringTypes = this.getFiringTypes();
                    FiringTypes copyFiringTypes = ((FiringTypes) strategy.copy(LocatorUtils.property(locator, "firingTypes", sourceFiringTypes), sourceFiringTypes, (this.firingTypes!= null)));
                    copy.setFiringTypes(copyFiringTypes);
                } else {
                    if (firingTypesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.firingTypes = null;
                    }
                }
            }
            {
                Boolean energySourcesEnev2014ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energySourcesEnev2014 != null));
                if (energySourcesEnev2014ShouldBeCopiedAndSet == Boolean.TRUE) {
                    EnergySourcesEnev2014 sourceEnergySourcesEnev2014;
                    sourceEnergySourcesEnev2014 = this.getEnergySourcesEnev2014();
                    EnergySourcesEnev2014 copyEnergySourcesEnev2014 = ((EnergySourcesEnev2014) strategy.copy(LocatorUtils.property(locator, "energySourcesEnev2014", sourceEnergySourcesEnev2014), sourceEnergySourcesEnev2014, (this.energySourcesEnev2014 != null)));
                    copy.setEnergySourcesEnev2014(copyEnergySourcesEnev2014);
                } else {
                    if (energySourcesEnev2014ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energySourcesEnev2014 = null;
                    }
                }
            }
            {
                Boolean buildingEnergyRatingTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.buildingEnergyRatingType!= null));
                if (buildingEnergyRatingTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    BuildingEnergyRatingType sourceBuildingEnergyRatingType;
                    sourceBuildingEnergyRatingType = this.getBuildingEnergyRatingType();
                    BuildingEnergyRatingType copyBuildingEnergyRatingType = ((BuildingEnergyRatingType) strategy.copy(LocatorUtils.property(locator, "buildingEnergyRatingType", sourceBuildingEnergyRatingType), sourceBuildingEnergyRatingType, (this.buildingEnergyRatingType!= null)));
                    copy.setBuildingEnergyRatingType(copyBuildingEnergyRatingType);
                } else {
                    if (buildingEnergyRatingTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.buildingEnergyRatingType = null;
                    }
                }
            }
            {
                Boolean thermalCharacteristicShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.thermalCharacteristic!= null));
                if (thermalCharacteristicShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceThermalCharacteristic;
                    sourceThermalCharacteristic = this.getThermalCharacteristic();
                    BigDecimal copyThermalCharacteristic = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "thermalCharacteristic", sourceThermalCharacteristic), sourceThermalCharacteristic, (this.thermalCharacteristic!= null)));
                    copy.setThermalCharacteristic(copyThermalCharacteristic);
                } else {
                    if (thermalCharacteristicShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.thermalCharacteristic = null;
                    }
                }
            }
            {
                Boolean energyConsumptionContainsWarmWaterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energyConsumptionContainsWarmWater!= null));
                if (energyConsumptionContainsWarmWaterShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceEnergyConsumptionContainsWarmWater;
                    sourceEnergyConsumptionContainsWarmWater = this.getEnergyConsumptionContainsWarmWater();
                    YesNotApplicableType copyEnergyConsumptionContainsWarmWater = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "energyConsumptionContainsWarmWater", sourceEnergyConsumptionContainsWarmWater), sourceEnergyConsumptionContainsWarmWater, (this.energyConsumptionContainsWarmWater!= null)));
                    copy.setEnergyConsumptionContainsWarmWater(copyEnergyConsumptionContainsWarmWater);
                } else {
                    if (energyConsumptionContainsWarmWaterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energyConsumptionContainsWarmWater = null;
                    }
                }
            }
            {
                Boolean numberOfFloorsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfFloors!= null));
                if (numberOfFloorsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceNumberOfFloors;
                    sourceNumberOfFloors = this.getNumberOfFloors();
                    Integer copyNumberOfFloors = ((Integer) strategy.copy(LocatorUtils.property(locator, "numberOfFloors", sourceNumberOfFloors), sourceNumberOfFloors, (this.numberOfFloors!= null)));
                    copy.setNumberOfFloors(copyNumberOfFloors);
                } else {
                    if (numberOfFloorsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfFloors = null;
                    }
                }
            }
            {
                Boolean usableFloorSpaceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.usableFloorSpace!= null));
                if (usableFloorSpaceShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceUsableFloorSpace;
                    sourceUsableFloorSpace = this.getUsableFloorSpace();
                    BigDecimal copyUsableFloorSpace = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "usableFloorSpace", sourceUsableFloorSpace), sourceUsableFloorSpace, (this.usableFloorSpace!= null)));
                    copy.setUsableFloorSpace(copyUsableFloorSpace);
                } else {
                    if (usableFloorSpaceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.usableFloorSpace = null;
                    }
                }
            }
            {
                Boolean numberOfBedRoomsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfBedRooms!= null));
                if (numberOfBedRoomsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceNumberOfBedRooms;
                    sourceNumberOfBedRooms = this.getNumberOfBedRooms();
                    Integer copyNumberOfBedRooms = ((Integer) strategy.copy(LocatorUtils.property(locator, "numberOfBedRooms", sourceNumberOfBedRooms), sourceNumberOfBedRooms, (this.numberOfBedRooms!= null)));
                    copy.setNumberOfBedRooms(copyNumberOfBedRooms);
                } else {
                    if (numberOfBedRoomsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfBedRooms = null;
                    }
                }
            }
            {
                Boolean numberOfBathRoomsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfBathRooms!= null));
                if (numberOfBathRoomsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceNumberOfBathRooms;
                    sourceNumberOfBathRooms = this.getNumberOfBathRooms();
                    Integer copyNumberOfBathRooms = ((Integer) strategy.copy(LocatorUtils.property(locator, "numberOfBathRooms", sourceNumberOfBathRooms), sourceNumberOfBathRooms, (this.numberOfBathRooms!= null)));
                    copy.setNumberOfBathRooms(copyNumberOfBathRooms);
                } else {
                    if (numberOfBathRoomsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfBathRooms = null;
                    }
                }
            }
            {
                Boolean guestToiletShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.guestToilet!= null));
                if (guestToiletShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceGuestToilet;
                    sourceGuestToilet = this.getGuestToilet();
                    YesNotApplicableType copyGuestToilet = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "guestToilet", sourceGuestToilet), sourceGuestToilet, (this.guestToilet!= null)));
                    copy.setGuestToilet(copyGuestToilet);
                } else {
                    if (guestToiletShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.guestToilet = null;
                    }
                }
            }
            {
                Boolean parkingSpaceTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parkingSpaceType!= null));
                if (parkingSpaceTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ParkingSpaceType sourceParkingSpaceType;
                    sourceParkingSpaceType = this.getParkingSpaceType();
                    ParkingSpaceType copyParkingSpaceType = ((ParkingSpaceType) strategy.copy(LocatorUtils.property(locator, "parkingSpaceType", sourceParkingSpaceType), sourceParkingSpaceType, (this.parkingSpaceType!= null)));
                    copy.setParkingSpaceType(copyParkingSpaceType);
                } else {
                    if (parkingSpaceTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.parkingSpaceType = null;
                    }
                }
            }
            {
                Boolean baseRentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.baseRent!= null));
                if (baseRentShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceBaseRent;
                    sourceBaseRent = this.getBaseRent();
                    BigDecimal copyBaseRent = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "baseRent", sourceBaseRent), sourceBaseRent, (this.baseRent!= null)));
                    copy.setBaseRent(copyBaseRent);
                } else {
                    if (baseRentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.baseRent = null;
                    }
                }
            }
            {
                Boolean totalRentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.totalRent!= null));
                if (totalRentShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceTotalRent;
                    sourceTotalRent = this.getTotalRent();
                    BigDecimal copyTotalRent = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "totalRent", sourceTotalRent), sourceTotalRent, (this.totalRent!= null)));
                    copy.setTotalRent(copyTotalRent);
                } else {
                    if (totalRentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.totalRent = null;
                    }
                }
            }
            {
                Boolean serviceChargeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.serviceCharge!= null));
                if (serviceChargeShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceServiceCharge;
                    sourceServiceCharge = this.getServiceCharge();
                    BigDecimal copyServiceCharge = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "serviceCharge", sourceServiceCharge), sourceServiceCharge, (this.serviceCharge!= null)));
                    copy.setServiceCharge(copyServiceCharge);
                } else {
                    if (serviceChargeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.serviceCharge = null;
                    }
                }
            }
            {
                Boolean depositShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.deposit!= null));
                if (depositShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDeposit;
                    sourceDeposit = this.getDeposit();
                    String copyDeposit = ((String) strategy.copy(LocatorUtils.property(locator, "deposit", sourceDeposit), sourceDeposit, (this.deposit!= null)));
                    copy.setDeposit(copyDeposit);
                } else {
                    if (depositShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.deposit = null;
                    }
                }
            }
            {
                Boolean heatingCostsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.heatingCosts!= null));
                if (heatingCostsShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceHeatingCosts;
                    sourceHeatingCosts = this.getHeatingCosts();
                    BigDecimal copyHeatingCosts = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "heatingCosts", sourceHeatingCosts), sourceHeatingCosts, (this.heatingCosts!= null)));
                    copy.setHeatingCosts(copyHeatingCosts);
                } else {
                    if (heatingCostsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.heatingCosts = null;
                    }
                }
            }
            {
                Boolean heatingCostsInServiceChargeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.heatingCostsInServiceCharge!= null));
                if (heatingCostsInServiceChargeShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNoNotApplicableType sourceHeatingCostsInServiceCharge;
                    sourceHeatingCostsInServiceCharge = this.getHeatingCostsInServiceCharge();
                    YesNoNotApplicableType copyHeatingCostsInServiceCharge = ((YesNoNotApplicableType) strategy.copy(LocatorUtils.property(locator, "heatingCostsInServiceCharge", sourceHeatingCostsInServiceCharge), sourceHeatingCostsInServiceCharge, (this.heatingCostsInServiceCharge!= null)));
                    copy.setHeatingCostsInServiceCharge(copyHeatingCostsInServiceCharge);
                } else {
                    if (heatingCostsInServiceChargeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.heatingCostsInServiceCharge = null;
                    }
                }
            }
            {
                Boolean petsAllowedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.petsAllowed!= null));
                if (petsAllowedShouldBeCopiedAndSet == Boolean.TRUE) {
                    PetsAllowedType sourcePetsAllowed;
                    sourcePetsAllowed = this.getPetsAllowed();
                    PetsAllowedType copyPetsAllowed = ((PetsAllowedType) strategy.copy(LocatorUtils.property(locator, "petsAllowed", sourcePetsAllowed), sourcePetsAllowed, (this.petsAllowed!= null)));
                    copy.setPetsAllowed(copyPetsAllowed);
                } else {
                    if (petsAllowedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.petsAllowed = null;
                    }
                }
            }
            {
                Boolean parkingSpacePriceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parkingSpacePrice!= null));
                if (parkingSpacePriceShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceParkingSpacePrice;
                    sourceParkingSpacePrice = this.getParkingSpacePrice();
                    BigDecimal copyParkingSpacePrice = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "parkingSpacePrice", sourceParkingSpacePrice), sourceParkingSpacePrice, (this.parkingSpacePrice!= null)));
                    copy.setParkingSpacePrice(copyParkingSpacePrice);
                } else {
                    if (parkingSpacePriceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.parkingSpacePrice = null;
                    }
                }
            }
            {
                Boolean useAsFlatshareRoomShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.useAsFlatshareRoom!= null));
                if (useAsFlatshareRoomShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceUseAsFlatshareRoom;
                    sourceUseAsFlatshareRoom = this.getUseAsFlatshareRoom();
                    YesNotApplicableType copyUseAsFlatshareRoom = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "useAsFlatshareRoom", sourceUseAsFlatshareRoom), sourceUseAsFlatshareRoom, (this.useAsFlatshareRoom!= null)));
                    copy.setUseAsFlatshareRoom(copyUseAsFlatshareRoom);
                } else {
                    if (useAsFlatshareRoomShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.useAsFlatshareRoom = null;
                    }
                }
            }
            {
                Boolean priceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.price!= null));
                if (priceShouldBeCopiedAndSet == Boolean.TRUE) {
                    Price sourcePrice;
                    sourcePrice = this.getPrice();
                    Price copyPrice = ((Price) strategy.copy(LocatorUtils.property(locator, "price", sourcePrice), sourcePrice, (this.price!= null)));
                    copy.setPrice(copyPrice);
                } else {
                    if (priceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.price = null;
                    }
                }
            }
            {
                Boolean livingSpaceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.livingSpace!= null));
                if (livingSpaceShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceLivingSpace;
                    sourceLivingSpace = this.getLivingSpace();
                    BigDecimal copyLivingSpace = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "livingSpace", sourceLivingSpace), sourceLivingSpace, (this.livingSpace!= null)));
                    copy.setLivingSpace(copyLivingSpace);
                } else {
                    if (livingSpaceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.livingSpace = null;
                    }
                }
            }
            {
                Boolean numberOfRoomsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfRooms!= null));
                if (numberOfRoomsShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceNumberOfRooms;
                    sourceNumberOfRooms = this.getNumberOfRooms();
                    BigDecimal copyNumberOfRooms = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "numberOfRooms", sourceNumberOfRooms), sourceNumberOfRooms, (this.numberOfRooms!= null)));
                    copy.setNumberOfRooms(copyNumberOfRooms);
                } else {
                    if (numberOfRoomsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfRooms = null;
                    }
                }
            }
            {
                Boolean energyPerformanceCertificateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energyPerformanceCertificate!= null));
                if (energyPerformanceCertificateShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceEnergyPerformanceCertificate;
                    sourceEnergyPerformanceCertificate = this.isEnergyPerformanceCertificate();
                    Boolean copyEnergyPerformanceCertificate = ((Boolean) strategy.copy(LocatorUtils.property(locator, "energyPerformanceCertificate", sourceEnergyPerformanceCertificate), sourceEnergyPerformanceCertificate, (this.energyPerformanceCertificate!= null)));
                    copy.setEnergyPerformanceCertificate(copyEnergyPerformanceCertificate);
                } else {
                    if (energyPerformanceCertificateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energyPerformanceCertificate = null;
                    }
                }
            }
            {
                Boolean builtInKitchenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.builtInKitchen!= null));
                if (builtInKitchenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBuiltInKitchen;
                    sourceBuiltInKitchen = this.isBuiltInKitchen();
                    Boolean copyBuiltInKitchen = ((Boolean) strategy.copy(LocatorUtils.property(locator, "builtInKitchen", sourceBuiltInKitchen), sourceBuiltInKitchen, (this.builtInKitchen!= null)));
                    copy.setBuiltInKitchen(copyBuiltInKitchen);
                } else {
                    if (builtInKitchenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.builtInKitchen = null;
                    }
                }
            }
            {
                Boolean balconyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.balcony!= null));
                if (balconyShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBalcony;
                    sourceBalcony = this.isBalcony();
                    Boolean copyBalcony = ((Boolean) strategy.copy(LocatorUtils.property(locator, "balcony", sourceBalcony), sourceBalcony, (this.balcony!= null)));
                    copy.setBalcony(copyBalcony);
                } else {
                    if (balconyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.balcony = null;
                    }
                }
            }
            {
                Boolean certificateOfEligibilityNeededShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.certificateOfEligibilityNeeded!= null));
                if (certificateOfEligibilityNeededShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceCertificateOfEligibilityNeeded;
                    sourceCertificateOfEligibilityNeeded = this.isCertificateOfEligibilityNeeded();
                    Boolean copyCertificateOfEligibilityNeeded = ((Boolean) strategy.copy(LocatorUtils.property(locator, "certificateOfEligibilityNeeded", sourceCertificateOfEligibilityNeeded), sourceCertificateOfEligibilityNeeded, (this.certificateOfEligibilityNeeded!= null)));
                    copy.setCertificateOfEligibilityNeeded(copyCertificateOfEligibilityNeeded);
                } else {
                    if (certificateOfEligibilityNeededShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.certificateOfEligibilityNeeded = null;
                    }
                }
            }
            {
                Boolean gardenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.garden!= null));
                if (gardenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceGarden;
                    sourceGarden = this.isGarden();
                    Boolean copyGarden = ((Boolean) strategy.copy(LocatorUtils.property(locator, "garden", sourceGarden), sourceGarden, (this.garden!= null)));
                    copy.setGarden(copyGarden);
                } else {
                    if (gardenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.garden = null;
                    }
                }
            }
            {
                Boolean courtageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.courtage!= null));
                if (courtageShouldBeCopiedAndSet == Boolean.TRUE) {
                    CourtageInfo sourceCourtage;
                    sourceCourtage = this.getCourtage();
                    CourtageInfo copyCourtage = ((CourtageInfo) strategy.copy(LocatorUtils.property(locator, "courtage", sourceCourtage), sourceCourtage, (this.courtage!= null)));
                    copy.setCourtage(copyCourtage);
                } else {
                    if (courtageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.courtage = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ApartmentRent();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ApartmentRent that = ((ApartmentRent) object);
        {
            ApartmentType lhsApartmentType;
            lhsApartmentType = this.getApartmentType();
            ApartmentType rhsApartmentType;
            rhsApartmentType = that.getApartmentType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "apartmentType", lhsApartmentType), LocatorUtils.property(thatLocator, "apartmentType", rhsApartmentType), lhsApartmentType, rhsApartmentType, (this.apartmentType!= null), (that.apartmentType!= null))) {
                return false;
            }
        }
        {
            Integer lhsFloor;
            lhsFloor = this.getFloor();
            Integer rhsFloor;
            rhsFloor = that.getFloor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "floor", lhsFloor), LocatorUtils.property(thatLocator, "floor", rhsFloor), lhsFloor, rhsFloor, (this.floor!= null), (that.floor!= null))) {
                return false;
            }
        }
        {
            Boolean lhsLift;
            lhsLift = this.isLift();
            Boolean rhsLift;
            rhsLift = that.isLift();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lift", lhsLift), LocatorUtils.property(thatLocator, "lift", rhsLift), lhsLift, rhsLift, (this.lift!= null), (that.lift!= null))) {
                return false;
            }
        }
        {
            Boolean lhsAssistedLiving;
            lhsAssistedLiving = this.isAssistedLiving();
            Boolean rhsAssistedLiving;
            rhsAssistedLiving = that.isAssistedLiving();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assistedLiving", lhsAssistedLiving), LocatorUtils.property(thatLocator, "assistedLiving", rhsAssistedLiving), lhsAssistedLiving, rhsAssistedLiving, (this.assistedLiving!= null), (that.assistedLiving!= null))) {
                return false;
            }
        }
        {
            EnergyPerformanceCertificate lhsEnergyCertificate;
            lhsEnergyCertificate = this.getEnergyCertificate();
            EnergyPerformanceCertificate rhsEnergyCertificate;
            rhsEnergyCertificate = that.getEnergyCertificate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyCertificate", lhsEnergyCertificate), LocatorUtils.property(thatLocator, "energyCertificate", rhsEnergyCertificate), lhsEnergyCertificate, rhsEnergyCertificate, (this.energyCertificate!= null), (that.energyCertificate!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCellar;
            lhsCellar = this.getCellar();
            YesNotApplicableType rhsCellar;
            rhsCellar = that.getCellar();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cellar", lhsCellar), LocatorUtils.property(thatLocator, "cellar", rhsCellar), lhsCellar, rhsCellar, (this.cellar!= null), (that.cellar!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsHandicappedAccessible;
            lhsHandicappedAccessible = this.getHandicappedAccessible();
            YesNotApplicableType rhsHandicappedAccessible;
            rhsHandicappedAccessible = that.getHandicappedAccessible();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "handicappedAccessible", lhsHandicappedAccessible), LocatorUtils.property(thatLocator, "handicappedAccessible", rhsHandicappedAccessible), lhsHandicappedAccessible, rhsHandicappedAccessible, (this.handicappedAccessible!= null), (that.handicappedAccessible!= null))) {
                return false;
            }
        }
        {
            Integer lhsNumberOfParkingSpaces;
            lhsNumberOfParkingSpaces = this.getNumberOfParkingSpaces();
            Integer rhsNumberOfParkingSpaces;
            rhsNumberOfParkingSpaces = that.getNumberOfParkingSpaces();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfParkingSpaces", lhsNumberOfParkingSpaces), LocatorUtils.property(thatLocator, "numberOfParkingSpaces", rhsNumberOfParkingSpaces), lhsNumberOfParkingSpaces, rhsNumberOfParkingSpaces, (this.numberOfParkingSpaces!= null), (that.numberOfParkingSpaces!= null))) {
                return false;
            }
        }
        {
            RealEstateCondition lhsCondition;
            lhsCondition = this.getCondition();
            RealEstateCondition rhsCondition;
            rhsCondition = that.getCondition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "condition", lhsCondition), LocatorUtils.property(thatLocator, "condition", rhsCondition), lhsCondition, rhsCondition, (this.condition!= null), (that.condition!= null))) {
                return false;
            }
        }
        {
            Integer lhsLastRefurbishment;
            lhsLastRefurbishment = this.getLastRefurbishment();
            Integer rhsLastRefurbishment;
            rhsLastRefurbishment = that.getLastRefurbishment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastRefurbishment", lhsLastRefurbishment), LocatorUtils.property(thatLocator, "lastRefurbishment", rhsLastRefurbishment), lhsLastRefurbishment, rhsLastRefurbishment, (this.lastRefurbishment!= null), (that.lastRefurbishment!= null))) {
                return false;
            }
        }
        {
            InteriorQuality lhsInteriorQuality;
            lhsInteriorQuality = this.getInteriorQuality();
            InteriorQuality rhsInteriorQuality;
            rhsInteriorQuality = that.getInteriorQuality();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "interiorQuality", lhsInteriorQuality), LocatorUtils.property(thatLocator, "interiorQuality", rhsInteriorQuality), lhsInteriorQuality, rhsInteriorQuality, (this.interiorQuality!= null), (that.interiorQuality!= null))) {
                return false;
            }
        }
        {
            Integer lhsConstructionYear;
            lhsConstructionYear = this.getConstructionYear();
            Integer rhsConstructionYear;
            rhsConstructionYear = that.getConstructionYear();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "constructionYear", lhsConstructionYear), LocatorUtils.property(thatLocator, "constructionYear", rhsConstructionYear), lhsConstructionYear, rhsConstructionYear, (this.constructionYear!= null), (that.constructionYear!= null))) {
                return false;
            }
        }
        {
            Boolean lhsConstructionYearUnknown;
            lhsConstructionYearUnknown = this.isConstructionYearUnknown();
            Boolean rhsConstructionYearUnknown;
            rhsConstructionYearUnknown = that.isConstructionYearUnknown();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "constructionYearUnknown", lhsConstructionYearUnknown), LocatorUtils.property(thatLocator, "constructionYearUnknown", rhsConstructionYearUnknown), lhsConstructionYearUnknown, rhsConstructionYearUnknown, (this.constructionYearUnknown!= null), (that.constructionYearUnknown!= null))) {
                return false;
            }
        }
        {
            String lhsFreeFrom;
            lhsFreeFrom = this.getFreeFrom();
            String rhsFreeFrom;
            rhsFreeFrom = that.getFreeFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freeFrom", lhsFreeFrom), LocatorUtils.property(thatLocator, "freeFrom", rhsFreeFrom), lhsFreeFrom, rhsFreeFrom, (this.freeFrom!= null), (that.freeFrom!= null))) {
                return false;
            }
        }
        {
            HeatingType lhsHeatingType;
            lhsHeatingType = this.getHeatingType();
            HeatingType rhsHeatingType;
            rhsHeatingType = that.getHeatingType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heatingType", lhsHeatingType), LocatorUtils.property(thatLocator, "heatingType", rhsHeatingType), lhsHeatingType, rhsHeatingType, (this.heatingType!= null), (that.heatingType!= null))) {
                return false;
            }
        }
        {
            HeatingTypeEnev2014 lhsHeatingTypeEnev2014;
            lhsHeatingTypeEnev2014 = this.getHeatingTypeEnev2014();
            HeatingTypeEnev2014 rhsHeatingTypeEnev2014;
            rhsHeatingTypeEnev2014 = that.getHeatingTypeEnev2014();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heatingTypeEnev2014", lhsHeatingTypeEnev2014), LocatorUtils.property(thatLocator, "heatingTypeEnev2014", rhsHeatingTypeEnev2014), lhsHeatingTypeEnev2014, rhsHeatingTypeEnev2014, (this.heatingTypeEnev2014 != null), (that.heatingTypeEnev2014 != null))) {
                return false;
            }
        }
        {
            FiringTypes lhsFiringTypes;
            lhsFiringTypes = this.getFiringTypes();
            FiringTypes rhsFiringTypes;
            rhsFiringTypes = that.getFiringTypes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firingTypes", lhsFiringTypes), LocatorUtils.property(thatLocator, "firingTypes", rhsFiringTypes), lhsFiringTypes, rhsFiringTypes, (this.firingTypes!= null), (that.firingTypes!= null))) {
                return false;
            }
        }
        {
            EnergySourcesEnev2014 lhsEnergySourcesEnev2014;
            lhsEnergySourcesEnev2014 = this.getEnergySourcesEnev2014();
            EnergySourcesEnev2014 rhsEnergySourcesEnev2014;
            rhsEnergySourcesEnev2014 = that.getEnergySourcesEnev2014();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energySourcesEnev2014", lhsEnergySourcesEnev2014), LocatorUtils.property(thatLocator, "energySourcesEnev2014", rhsEnergySourcesEnev2014), lhsEnergySourcesEnev2014, rhsEnergySourcesEnev2014, (this.energySourcesEnev2014 != null), (that.energySourcesEnev2014 != null))) {
                return false;
            }
        }
        {
            BuildingEnergyRatingType lhsBuildingEnergyRatingType;
            lhsBuildingEnergyRatingType = this.getBuildingEnergyRatingType();
            BuildingEnergyRatingType rhsBuildingEnergyRatingType;
            rhsBuildingEnergyRatingType = that.getBuildingEnergyRatingType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buildingEnergyRatingType", lhsBuildingEnergyRatingType), LocatorUtils.property(thatLocator, "buildingEnergyRatingType", rhsBuildingEnergyRatingType), lhsBuildingEnergyRatingType, rhsBuildingEnergyRatingType, (this.buildingEnergyRatingType!= null), (that.buildingEnergyRatingType!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsThermalCharacteristic;
            lhsThermalCharacteristic = this.getThermalCharacteristic();
            BigDecimal rhsThermalCharacteristic;
            rhsThermalCharacteristic = that.getThermalCharacteristic();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "thermalCharacteristic", lhsThermalCharacteristic), LocatorUtils.property(thatLocator, "thermalCharacteristic", rhsThermalCharacteristic), lhsThermalCharacteristic, rhsThermalCharacteristic, (this.thermalCharacteristic!= null), (that.thermalCharacteristic!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsEnergyConsumptionContainsWarmWater;
            lhsEnergyConsumptionContainsWarmWater = this.getEnergyConsumptionContainsWarmWater();
            YesNotApplicableType rhsEnergyConsumptionContainsWarmWater;
            rhsEnergyConsumptionContainsWarmWater = that.getEnergyConsumptionContainsWarmWater();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyConsumptionContainsWarmWater", lhsEnergyConsumptionContainsWarmWater), LocatorUtils.property(thatLocator, "energyConsumptionContainsWarmWater", rhsEnergyConsumptionContainsWarmWater), lhsEnergyConsumptionContainsWarmWater, rhsEnergyConsumptionContainsWarmWater, (this.energyConsumptionContainsWarmWater!= null), (that.energyConsumptionContainsWarmWater!= null))) {
                return false;
            }
        }
        {
            Integer lhsNumberOfFloors;
            lhsNumberOfFloors = this.getNumberOfFloors();
            Integer rhsNumberOfFloors;
            rhsNumberOfFloors = that.getNumberOfFloors();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfFloors", lhsNumberOfFloors), LocatorUtils.property(thatLocator, "numberOfFloors", rhsNumberOfFloors), lhsNumberOfFloors, rhsNumberOfFloors, (this.numberOfFloors!= null), (that.numberOfFloors!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsUsableFloorSpace;
            lhsUsableFloorSpace = this.getUsableFloorSpace();
            BigDecimal rhsUsableFloorSpace;
            rhsUsableFloorSpace = that.getUsableFloorSpace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usableFloorSpace", lhsUsableFloorSpace), LocatorUtils.property(thatLocator, "usableFloorSpace", rhsUsableFloorSpace), lhsUsableFloorSpace, rhsUsableFloorSpace, (this.usableFloorSpace!= null), (that.usableFloorSpace!= null))) {
                return false;
            }
        }
        {
            Integer lhsNumberOfBedRooms;
            lhsNumberOfBedRooms = this.getNumberOfBedRooms();
            Integer rhsNumberOfBedRooms;
            rhsNumberOfBedRooms = that.getNumberOfBedRooms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfBedRooms", lhsNumberOfBedRooms), LocatorUtils.property(thatLocator, "numberOfBedRooms", rhsNumberOfBedRooms), lhsNumberOfBedRooms, rhsNumberOfBedRooms, (this.numberOfBedRooms!= null), (that.numberOfBedRooms!= null))) {
                return false;
            }
        }
        {
            Integer lhsNumberOfBathRooms;
            lhsNumberOfBathRooms = this.getNumberOfBathRooms();
            Integer rhsNumberOfBathRooms;
            rhsNumberOfBathRooms = that.getNumberOfBathRooms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfBathRooms", lhsNumberOfBathRooms), LocatorUtils.property(thatLocator, "numberOfBathRooms", rhsNumberOfBathRooms), lhsNumberOfBathRooms, rhsNumberOfBathRooms, (this.numberOfBathRooms!= null), (that.numberOfBathRooms!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsGuestToilet;
            lhsGuestToilet = this.getGuestToilet();
            YesNotApplicableType rhsGuestToilet;
            rhsGuestToilet = that.getGuestToilet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "guestToilet", lhsGuestToilet), LocatorUtils.property(thatLocator, "guestToilet", rhsGuestToilet), lhsGuestToilet, rhsGuestToilet, (this.guestToilet!= null), (that.guestToilet!= null))) {
                return false;
            }
        }
        {
            ParkingSpaceType lhsParkingSpaceType;
            lhsParkingSpaceType = this.getParkingSpaceType();
            ParkingSpaceType rhsParkingSpaceType;
            rhsParkingSpaceType = that.getParkingSpaceType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parkingSpaceType", lhsParkingSpaceType), LocatorUtils.property(thatLocator, "parkingSpaceType", rhsParkingSpaceType), lhsParkingSpaceType, rhsParkingSpaceType, (this.parkingSpaceType!= null), (that.parkingSpaceType!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsBaseRent;
            lhsBaseRent = this.getBaseRent();
            BigDecimal rhsBaseRent;
            rhsBaseRent = that.getBaseRent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baseRent", lhsBaseRent), LocatorUtils.property(thatLocator, "baseRent", rhsBaseRent), lhsBaseRent, rhsBaseRent, (this.baseRent!= null), (that.baseRent!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsTotalRent;
            lhsTotalRent = this.getTotalRent();
            BigDecimal rhsTotalRent;
            rhsTotalRent = that.getTotalRent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalRent", lhsTotalRent), LocatorUtils.property(thatLocator, "totalRent", rhsTotalRent), lhsTotalRent, rhsTotalRent, (this.totalRent!= null), (that.totalRent!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsServiceCharge;
            lhsServiceCharge = this.getServiceCharge();
            BigDecimal rhsServiceCharge;
            rhsServiceCharge = that.getServiceCharge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceCharge", lhsServiceCharge), LocatorUtils.property(thatLocator, "serviceCharge", rhsServiceCharge), lhsServiceCharge, rhsServiceCharge, (this.serviceCharge!= null), (that.serviceCharge!= null))) {
                return false;
            }
        }
        {
            String lhsDeposit;
            lhsDeposit = this.getDeposit();
            String rhsDeposit;
            rhsDeposit = that.getDeposit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deposit", lhsDeposit), LocatorUtils.property(thatLocator, "deposit", rhsDeposit), lhsDeposit, rhsDeposit, (this.deposit!= null), (that.deposit!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsHeatingCosts;
            lhsHeatingCosts = this.getHeatingCosts();
            BigDecimal rhsHeatingCosts;
            rhsHeatingCosts = that.getHeatingCosts();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heatingCosts", lhsHeatingCosts), LocatorUtils.property(thatLocator, "heatingCosts", rhsHeatingCosts), lhsHeatingCosts, rhsHeatingCosts, (this.heatingCosts!= null), (that.heatingCosts!= null))) {
                return false;
            }
        }
        {
            YesNoNotApplicableType lhsHeatingCostsInServiceCharge;
            lhsHeatingCostsInServiceCharge = this.getHeatingCostsInServiceCharge();
            YesNoNotApplicableType rhsHeatingCostsInServiceCharge;
            rhsHeatingCostsInServiceCharge = that.getHeatingCostsInServiceCharge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heatingCostsInServiceCharge", lhsHeatingCostsInServiceCharge), LocatorUtils.property(thatLocator, "heatingCostsInServiceCharge", rhsHeatingCostsInServiceCharge), lhsHeatingCostsInServiceCharge, rhsHeatingCostsInServiceCharge, (this.heatingCostsInServiceCharge!= null), (that.heatingCostsInServiceCharge!= null))) {
                return false;
            }
        }
        {
            PetsAllowedType lhsPetsAllowed;
            lhsPetsAllowed = this.getPetsAllowed();
            PetsAllowedType rhsPetsAllowed;
            rhsPetsAllowed = that.getPetsAllowed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "petsAllowed", lhsPetsAllowed), LocatorUtils.property(thatLocator, "petsAllowed", rhsPetsAllowed), lhsPetsAllowed, rhsPetsAllowed, (this.petsAllowed!= null), (that.petsAllowed!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsParkingSpacePrice;
            lhsParkingSpacePrice = this.getParkingSpacePrice();
            BigDecimal rhsParkingSpacePrice;
            rhsParkingSpacePrice = that.getParkingSpacePrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parkingSpacePrice", lhsParkingSpacePrice), LocatorUtils.property(thatLocator, "parkingSpacePrice", rhsParkingSpacePrice), lhsParkingSpacePrice, rhsParkingSpacePrice, (this.parkingSpacePrice!= null), (that.parkingSpacePrice!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsUseAsFlatshareRoom;
            lhsUseAsFlatshareRoom = this.getUseAsFlatshareRoom();
            YesNotApplicableType rhsUseAsFlatshareRoom;
            rhsUseAsFlatshareRoom = that.getUseAsFlatshareRoom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useAsFlatshareRoom", lhsUseAsFlatshareRoom), LocatorUtils.property(thatLocator, "useAsFlatshareRoom", rhsUseAsFlatshareRoom), lhsUseAsFlatshareRoom, rhsUseAsFlatshareRoom, (this.useAsFlatshareRoom!= null), (that.useAsFlatshareRoom!= null))) {
                return false;
            }
        }
        {
            Price lhsPrice;
            lhsPrice = this.getPrice();
            Price rhsPrice;
            rhsPrice = that.getPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "price", lhsPrice), LocatorUtils.property(thatLocator, "price", rhsPrice), lhsPrice, rhsPrice, (this.price!= null), (that.price!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsLivingSpace;
            lhsLivingSpace = this.getLivingSpace();
            BigDecimal rhsLivingSpace;
            rhsLivingSpace = that.getLivingSpace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "livingSpace", lhsLivingSpace), LocatorUtils.property(thatLocator, "livingSpace", rhsLivingSpace), lhsLivingSpace, rhsLivingSpace, (this.livingSpace!= null), (that.livingSpace!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsNumberOfRooms;
            lhsNumberOfRooms = this.getNumberOfRooms();
            BigDecimal rhsNumberOfRooms;
            rhsNumberOfRooms = that.getNumberOfRooms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfRooms", lhsNumberOfRooms), LocatorUtils.property(thatLocator, "numberOfRooms", rhsNumberOfRooms), lhsNumberOfRooms, rhsNumberOfRooms, (this.numberOfRooms!= null), (that.numberOfRooms!= null))) {
                return false;
            }
        }
        {
            Boolean lhsEnergyPerformanceCertificate;
            lhsEnergyPerformanceCertificate = this.isEnergyPerformanceCertificate();
            Boolean rhsEnergyPerformanceCertificate;
            rhsEnergyPerformanceCertificate = that.isEnergyPerformanceCertificate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyPerformanceCertificate", lhsEnergyPerformanceCertificate), LocatorUtils.property(thatLocator, "energyPerformanceCertificate", rhsEnergyPerformanceCertificate), lhsEnergyPerformanceCertificate, rhsEnergyPerformanceCertificate, (this.energyPerformanceCertificate!= null), (that.energyPerformanceCertificate!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBuiltInKitchen;
            lhsBuiltInKitchen = this.isBuiltInKitchen();
            Boolean rhsBuiltInKitchen;
            rhsBuiltInKitchen = that.isBuiltInKitchen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "builtInKitchen", lhsBuiltInKitchen), LocatorUtils.property(thatLocator, "builtInKitchen", rhsBuiltInKitchen), lhsBuiltInKitchen, rhsBuiltInKitchen, (this.builtInKitchen!= null), (that.builtInKitchen!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBalcony;
            lhsBalcony = this.isBalcony();
            Boolean rhsBalcony;
            rhsBalcony = that.isBalcony();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balcony", lhsBalcony), LocatorUtils.property(thatLocator, "balcony", rhsBalcony), lhsBalcony, rhsBalcony, (this.balcony!= null), (that.balcony!= null))) {
                return false;
            }
        }
        {
            Boolean lhsCertificateOfEligibilityNeeded;
            lhsCertificateOfEligibilityNeeded = this.isCertificateOfEligibilityNeeded();
            Boolean rhsCertificateOfEligibilityNeeded;
            rhsCertificateOfEligibilityNeeded = that.isCertificateOfEligibilityNeeded();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "certificateOfEligibilityNeeded", lhsCertificateOfEligibilityNeeded), LocatorUtils.property(thatLocator, "certificateOfEligibilityNeeded", rhsCertificateOfEligibilityNeeded), lhsCertificateOfEligibilityNeeded, rhsCertificateOfEligibilityNeeded, (this.certificateOfEligibilityNeeded!= null), (that.certificateOfEligibilityNeeded!= null))) {
                return false;
            }
        }
        {
            Boolean lhsGarden;
            lhsGarden = this.isGarden();
            Boolean rhsGarden;
            rhsGarden = that.isGarden();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "garden", lhsGarden), LocatorUtils.property(thatLocator, "garden", rhsGarden), lhsGarden, rhsGarden, (this.garden!= null), (that.garden!= null))) {
                return false;
            }
        }
        {
            CourtageInfo lhsCourtage;
            lhsCourtage = this.getCourtage();
            CourtageInfo rhsCourtage;
            rhsCourtage = that.getCourtage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "courtage", lhsCourtage), LocatorUtils.property(thatLocator, "courtage", rhsCourtage), lhsCourtage, rhsCourtage, (this.courtage!= null), (that.courtage!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
