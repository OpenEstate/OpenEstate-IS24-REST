
package org.openestate.is24.restapi.xml.realestates;

import java.math.BigDecimal;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;
import org.openestate.is24.restapi.xml.Adapter1;
import org.openestate.is24.restapi.xml.Adapter3;
import org.openestate.is24.restapi.xml.Adapter5;
import org.openestate.is24.restapi.xml.common.BuildingEnergyRatingType;
import org.openestate.is24.restapi.xml.common.CourtageInfo;
import org.openestate.is24.restapi.xml.common.EnergyPerformanceCertificate;
import org.openestate.is24.restapi.xml.common.EnergySourcesEnev2014;
import org.openestate.is24.restapi.xml.common.FiringTypes;
import org.openestate.is24.restapi.xml.common.FlatMateGenderType;
import org.openestate.is24.restapi.xml.common.HeatingType;
import org.openestate.is24.restapi.xml.common.HeatingTypeEnev2014;
import org.openestate.is24.restapi.xml.common.ParkingSpaceType;
import org.openestate.is24.restapi.xml.common.PetsAllowedType;
import org.openestate.is24.restapi.xml.common.Price;
import org.openestate.is24.restapi.xml.common.RealEstateCondition;
import org.openestate.is24.restapi.xml.common.ShortTermAccommodationType;
import org.openestate.is24.restapi.xml.common.YesNoNotApplicableType;
import org.openestate.is24.restapi.xml.common.YesNotApplicableType;


/**
 * Eigenschaften f\u00fcr den Immobilientyp "Wohnen auf Zeit"
 * 
 * <p>Java class for ShortTermAccommodation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShortTermAccommodation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/realestates/1.0}RealEstate"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}ExtendedShortTermAccommodationGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShortTermAccommodation", propOrder = {
    "baseRent",
    "buildingEnergyRatingType",
    "cellar",
    "condition",
    "deposit",
    "endRentalDate",
    "energyConsumptionContainsWarmWater",
    "firingTypes",
    "energySourcesEnev2014",
    "floor",
    "gender",
    "guestToilet",
    "handicappedAccessible",
    "hasFurniture",
    "heatingType",
    "heatingTypeEnev2014",
    "lift",
    "maxNumberOfPersons",
    "maxRentalTime",
    "minRentalTime",
    "numberOfFloors",
    "numberOfParkingSpaces",
    "parkingSpacePrice",
    "parkingSpaceType",
    "petsAllowed",
    "serviceCharge",
    "thermalCharacteristic",
    "totalRent",
    "constructionYear",
    "constructionYearUnknown",
    "energyCertificate",
    "price",
    "livingSpace",
    "numberOfRooms",
    "startRentalDate",
    "balcony",
    "garden",
    "nonSmoker",
    "shortTermAccomodationType",
    "courtage"
})
public class ShortTermAccommodation
    extends RealEstate
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal baseRent;
    @XmlSchemaType(name = "string")
    protected BuildingEnergyRatingType buildingEnergyRatingType;
    protected Boolean cellar;
    @XmlSchemaType(name = "string")
    protected RealEstateCondition condition;
    protected String deposit;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "date")
    protected Calendar endRentalDate;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType energyConsumptionContainsWarmWater;
    @Deprecated
    protected FiringTypes firingTypes;
    protected EnergySourcesEnev2014 energySourcesEnev2014;
    protected String floor;
    @XmlSchemaType(name = "string")
    protected FlatMateGenderType gender;
    protected Boolean guestToilet;
    protected Boolean handicappedAccessible;
    @XmlSchemaType(name = "string")
    protected YesNoNotApplicableType hasFurniture;
    @XmlSchemaType(name = "string")
    @Deprecated
    protected HeatingType heatingType;
    @XmlSchemaType(name = "string")
    protected HeatingTypeEnev2014 heatingTypeEnev2014;
    protected Boolean lift;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long maxNumberOfPersons;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal maxRentalTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal minRentalTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long numberOfFloors;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long numberOfParkingSpaces;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal parkingSpacePrice;
    @XmlSchemaType(name = "string")
    protected ParkingSpaceType parkingSpaceType;
    @XmlSchemaType(name = "string")
    protected PetsAllowedType petsAllowed;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal serviceCharge;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal thermalCharacteristic;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Deprecated
    protected BigDecimal totalRent;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long constructionYear;
    protected Boolean constructionYearUnknown;
    protected EnergyPerformanceCertificate energyCertificate;
    @XmlElement(required = true)
    protected Price price;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal livingSpace;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal numberOfRooms;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "date")
    protected Calendar startRentalDate;
    protected Boolean balcony;
    protected Boolean garden;
    protected Boolean nonSmoker;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ShortTermAccommodationType shortTermAccomodationType;
    @XmlElement(required = true)
    protected CourtageInfo courtage;

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
     * Gets the value of the cellar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCellar() {
        return cellar;
    }

    /**
     * Sets the value of the cellar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCellar(Boolean value) {
        this.cellar = value;
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
     * Gets the value of the endRentalDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getEndRentalDate() {
        return endRentalDate;
    }

    /**
     * Sets the value of the endRentalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndRentalDate(Calendar value) {
        this.endRentalDate = value;
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
     * Gets the value of the floor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloor() {
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
    public void setFloor(String value) {
        this.floor = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link FlatMateGenderType }
     *     
     */
    public FlatMateGenderType getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlatMateGenderType }
     *     
     */
    public void setGender(FlatMateGenderType value) {
        this.gender = value;
    }

    /**
     * Gets the value of the guestToilet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuestToilet() {
        return guestToilet;
    }

    /**
     * Sets the value of the guestToilet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuestToilet(Boolean value) {
        this.guestToilet = value;
    }

    /**
     * Gets the value of the handicappedAccessible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHandicappedAccessible() {
        return handicappedAccessible;
    }

    /**
     * Sets the value of the handicappedAccessible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHandicappedAccessible(Boolean value) {
        this.handicappedAccessible = value;
    }

    /**
     * Gets the value of the hasFurniture property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoNotApplicableType }
     *     
     */
    public YesNoNotApplicableType getHasFurniture() {
        return hasFurniture;
    }

    /**
     * Sets the value of the hasFurniture property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoNotApplicableType }
     *     
     */
    public void setHasFurniture(YesNoNotApplicableType value) {
        this.hasFurniture = value;
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
     * Gets the value of the maxNumberOfPersons property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getMaxNumberOfPersons() {
        return maxNumberOfPersons;
    }

    /**
     * Sets the value of the maxNumberOfPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxNumberOfPersons(Long value) {
        this.maxNumberOfPersons = value;
    }

    /**
     * Gets the value of the maxRentalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getMaxRentalTime() {
        return maxRentalTime;
    }

    /**
     * Sets the value of the maxRentalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxRentalTime(BigDecimal value) {
        this.maxRentalTime = value;
    }

    /**
     * Gets the value of the minRentalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getMinRentalTime() {
        return minRentalTime;
    }

    /**
     * Sets the value of the minRentalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinRentalTime(BigDecimal value) {
        this.minRentalTime = value;
    }

    /**
     * Gets the value of the numberOfFloors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getNumberOfFloors() {
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
    public void setNumberOfFloors(Long value) {
        this.numberOfFloors = value;
    }

    /**
     * Gets the value of the numberOfParkingSpaces property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getNumberOfParkingSpaces() {
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
    public void setNumberOfParkingSpaces(Long value) {
        this.numberOfParkingSpaces = value;
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
     * Gets the value of the totalRent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Deprecated
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
    @Deprecated
    public void setTotalRent(BigDecimal value) {
        this.totalRent = value;
    }

    /**
     * Gets the value of the constructionYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getConstructionYear() {
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
    public void setConstructionYear(Long value) {
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
     * Gets the value of the startRentalDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getStartRentalDate() {
        return startRentalDate;
    }

    /**
     * Sets the value of the startRentalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartRentalDate(Calendar value) {
        this.startRentalDate = value;
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
     * Gets the value of the nonSmoker property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonSmoker() {
        return nonSmoker;
    }

    /**
     * Sets the value of the nonSmoker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonSmoker(Boolean value) {
        this.nonSmoker = value;
    }

    /**
     * Gets the value of the shortTermAccomodationType property.
     * 
     * @return
     *     possible object is
     *     {@link ShortTermAccommodationType }
     *     
     */
    public ShortTermAccommodationType getShortTermAccomodationType() {
        return shortTermAccomodationType;
    }

    /**
     * Sets the value of the shortTermAccomodationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortTermAccommodationType }
     *     
     */
    public void setShortTermAccomodationType(ShortTermAccommodationType value) {
        this.shortTermAccomodationType = value;
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
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            BigDecimal theBaseRent;
            theBaseRent = this.getBaseRent();
            strategy.appendField(locator, this, "baseRent", buffer, theBaseRent);
        }
        {
            BuildingEnergyRatingType theBuildingEnergyRatingType;
            theBuildingEnergyRatingType = this.getBuildingEnergyRatingType();
            strategy.appendField(locator, this, "buildingEnergyRatingType", buffer, theBuildingEnergyRatingType);
        }
        {
            Boolean theCellar;
            theCellar = this.isCellar();
            strategy.appendField(locator, this, "cellar", buffer, theCellar);
        }
        {
            RealEstateCondition theCondition;
            theCondition = this.getCondition();
            strategy.appendField(locator, this, "condition", buffer, theCondition);
        }
        {
            String theDeposit;
            theDeposit = this.getDeposit();
            strategy.appendField(locator, this, "deposit", buffer, theDeposit);
        }
        {
            Calendar theEndRentalDate;
            theEndRentalDate = this.getEndRentalDate();
            strategy.appendField(locator, this, "endRentalDate", buffer, theEndRentalDate);
        }
        {
            YesNotApplicableType theEnergyConsumptionContainsWarmWater;
            theEnergyConsumptionContainsWarmWater = this.getEnergyConsumptionContainsWarmWater();
            strategy.appendField(locator, this, "energyConsumptionContainsWarmWater", buffer, theEnergyConsumptionContainsWarmWater);
        }
        {
            FiringTypes theFiringTypes;
            theFiringTypes = this.getFiringTypes();
            strategy.appendField(locator, this, "firingTypes", buffer, theFiringTypes);
        }
        {
            EnergySourcesEnev2014 theEnergySourcesEnev2014;
            theEnergySourcesEnev2014 = this.getEnergySourcesEnev2014();
            strategy.appendField(locator, this, "energySourcesEnev2014", buffer, theEnergySourcesEnev2014);
        }
        {
            String theFloor;
            theFloor = this.getFloor();
            strategy.appendField(locator, this, "floor", buffer, theFloor);
        }
        {
            FlatMateGenderType theGender;
            theGender = this.getGender();
            strategy.appendField(locator, this, "gender", buffer, theGender);
        }
        {
            Boolean theGuestToilet;
            theGuestToilet = this.isGuestToilet();
            strategy.appendField(locator, this, "guestToilet", buffer, theGuestToilet);
        }
        {
            Boolean theHandicappedAccessible;
            theHandicappedAccessible = this.isHandicappedAccessible();
            strategy.appendField(locator, this, "handicappedAccessible", buffer, theHandicappedAccessible);
        }
        {
            YesNoNotApplicableType theHasFurniture;
            theHasFurniture = this.getHasFurniture();
            strategy.appendField(locator, this, "hasFurniture", buffer, theHasFurniture);
        }
        {
            HeatingType theHeatingType;
            theHeatingType = this.getHeatingType();
            strategy.appendField(locator, this, "heatingType", buffer, theHeatingType);
        }
        {
            HeatingTypeEnev2014 theHeatingTypeEnev2014;
            theHeatingTypeEnev2014 = this.getHeatingTypeEnev2014();
            strategy.appendField(locator, this, "heatingTypeEnev2014", buffer, theHeatingTypeEnev2014);
        }
        {
            Boolean theLift;
            theLift = this.isLift();
            strategy.appendField(locator, this, "lift", buffer, theLift);
        }
        {
            Long theMaxNumberOfPersons;
            theMaxNumberOfPersons = this.getMaxNumberOfPersons();
            strategy.appendField(locator, this, "maxNumberOfPersons", buffer, theMaxNumberOfPersons);
        }
        {
            BigDecimal theMaxRentalTime;
            theMaxRentalTime = this.getMaxRentalTime();
            strategy.appendField(locator, this, "maxRentalTime", buffer, theMaxRentalTime);
        }
        {
            BigDecimal theMinRentalTime;
            theMinRentalTime = this.getMinRentalTime();
            strategy.appendField(locator, this, "minRentalTime", buffer, theMinRentalTime);
        }
        {
            Long theNumberOfFloors;
            theNumberOfFloors = this.getNumberOfFloors();
            strategy.appendField(locator, this, "numberOfFloors", buffer, theNumberOfFloors);
        }
        {
            Long theNumberOfParkingSpaces;
            theNumberOfParkingSpaces = this.getNumberOfParkingSpaces();
            strategy.appendField(locator, this, "numberOfParkingSpaces", buffer, theNumberOfParkingSpaces);
        }
        {
            BigDecimal theParkingSpacePrice;
            theParkingSpacePrice = this.getParkingSpacePrice();
            strategy.appendField(locator, this, "parkingSpacePrice", buffer, theParkingSpacePrice);
        }
        {
            ParkingSpaceType theParkingSpaceType;
            theParkingSpaceType = this.getParkingSpaceType();
            strategy.appendField(locator, this, "parkingSpaceType", buffer, theParkingSpaceType);
        }
        {
            PetsAllowedType thePetsAllowed;
            thePetsAllowed = this.getPetsAllowed();
            strategy.appendField(locator, this, "petsAllowed", buffer, thePetsAllowed);
        }
        {
            BigDecimal theServiceCharge;
            theServiceCharge = this.getServiceCharge();
            strategy.appendField(locator, this, "serviceCharge", buffer, theServiceCharge);
        }
        {
            BigDecimal theThermalCharacteristic;
            theThermalCharacteristic = this.getThermalCharacteristic();
            strategy.appendField(locator, this, "thermalCharacteristic", buffer, theThermalCharacteristic);
        }
        {
            BigDecimal theTotalRent;
            theTotalRent = this.getTotalRent();
            strategy.appendField(locator, this, "totalRent", buffer, theTotalRent);
        }
        {
            Long theConstructionYear;
            theConstructionYear = this.getConstructionYear();
            strategy.appendField(locator, this, "constructionYear", buffer, theConstructionYear);
        }
        {
            Boolean theConstructionYearUnknown;
            theConstructionYearUnknown = this.isConstructionYearUnknown();
            strategy.appendField(locator, this, "constructionYearUnknown", buffer, theConstructionYearUnknown);
        }
        {
            EnergyPerformanceCertificate theEnergyCertificate;
            theEnergyCertificate = this.getEnergyCertificate();
            strategy.appendField(locator, this, "energyCertificate", buffer, theEnergyCertificate);
        }
        {
            Price thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice);
        }
        {
            BigDecimal theLivingSpace;
            theLivingSpace = this.getLivingSpace();
            strategy.appendField(locator, this, "livingSpace", buffer, theLivingSpace);
        }
        {
            BigDecimal theNumberOfRooms;
            theNumberOfRooms = this.getNumberOfRooms();
            strategy.appendField(locator, this, "numberOfRooms", buffer, theNumberOfRooms);
        }
        {
            Calendar theStartRentalDate;
            theStartRentalDate = this.getStartRentalDate();
            strategy.appendField(locator, this, "startRentalDate", buffer, theStartRentalDate);
        }
        {
            Boolean theBalcony;
            theBalcony = this.isBalcony();
            strategy.appendField(locator, this, "balcony", buffer, theBalcony);
        }
        {
            Boolean theGarden;
            theGarden = this.isGarden();
            strategy.appendField(locator, this, "garden", buffer, theGarden);
        }
        {
            Boolean theNonSmoker;
            theNonSmoker = this.isNonSmoker();
            strategy.appendField(locator, this, "nonSmoker", buffer, theNonSmoker);
        }
        {
            ShortTermAccommodationType theShortTermAccomodationType;
            theShortTermAccomodationType = this.getShortTermAccomodationType();
            strategy.appendField(locator, this, "shortTermAccomodationType", buffer, theShortTermAccomodationType);
        }
        {
            CourtageInfo theCourtage;
            theCourtage = this.getCourtage();
            strategy.appendField(locator, this, "courtage", buffer, theCourtage);
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof ShortTermAccommodation) {
            final ShortTermAccommodation copy = ((ShortTermAccommodation) draftCopy);
            if (this.baseRent!= null) {
                BigDecimal sourceBaseRent;
                sourceBaseRent = this.getBaseRent();
                BigDecimal copyBaseRent = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "baseRent", sourceBaseRent), sourceBaseRent));
                copy.setBaseRent(copyBaseRent);
            } else {
                copy.baseRent = null;
            }
            if (this.buildingEnergyRatingType!= null) {
                BuildingEnergyRatingType sourceBuildingEnergyRatingType;
                sourceBuildingEnergyRatingType = this.getBuildingEnergyRatingType();
                BuildingEnergyRatingType copyBuildingEnergyRatingType = ((BuildingEnergyRatingType) strategy.copy(LocatorUtils.property(locator, "buildingEnergyRatingType", sourceBuildingEnergyRatingType), sourceBuildingEnergyRatingType));
                copy.setBuildingEnergyRatingType(copyBuildingEnergyRatingType);
            } else {
                copy.buildingEnergyRatingType = null;
            }
            if (this.cellar!= null) {
                Boolean sourceCellar;
                sourceCellar = this.isCellar();
                Boolean copyCellar = ((Boolean) strategy.copy(LocatorUtils.property(locator, "cellar", sourceCellar), sourceCellar));
                copy.setCellar(copyCellar);
            } else {
                copy.cellar = null;
            }
            if (this.condition!= null) {
                RealEstateCondition sourceCondition;
                sourceCondition = this.getCondition();
                RealEstateCondition copyCondition = ((RealEstateCondition) strategy.copy(LocatorUtils.property(locator, "condition", sourceCondition), sourceCondition));
                copy.setCondition(copyCondition);
            } else {
                copy.condition = null;
            }
            if (this.deposit!= null) {
                String sourceDeposit;
                sourceDeposit = this.getDeposit();
                String copyDeposit = ((String) strategy.copy(LocatorUtils.property(locator, "deposit", sourceDeposit), sourceDeposit));
                copy.setDeposit(copyDeposit);
            } else {
                copy.deposit = null;
            }
            if (this.endRentalDate!= null) {
                Calendar sourceEndRentalDate;
                sourceEndRentalDate = this.getEndRentalDate();
                Calendar copyEndRentalDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "endRentalDate", sourceEndRentalDate), sourceEndRentalDate));
                copy.setEndRentalDate(copyEndRentalDate);
            } else {
                copy.endRentalDate = null;
            }
            if (this.energyConsumptionContainsWarmWater!= null) {
                YesNotApplicableType sourceEnergyConsumptionContainsWarmWater;
                sourceEnergyConsumptionContainsWarmWater = this.getEnergyConsumptionContainsWarmWater();
                YesNotApplicableType copyEnergyConsumptionContainsWarmWater = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "energyConsumptionContainsWarmWater", sourceEnergyConsumptionContainsWarmWater), sourceEnergyConsumptionContainsWarmWater));
                copy.setEnergyConsumptionContainsWarmWater(copyEnergyConsumptionContainsWarmWater);
            } else {
                copy.energyConsumptionContainsWarmWater = null;
            }
            if (this.firingTypes!= null) {
                FiringTypes sourceFiringTypes;
                sourceFiringTypes = this.getFiringTypes();
                FiringTypes copyFiringTypes = ((FiringTypes) strategy.copy(LocatorUtils.property(locator, "firingTypes", sourceFiringTypes), sourceFiringTypes));
                copy.setFiringTypes(copyFiringTypes);
            } else {
                copy.firingTypes = null;
            }
            if (this.energySourcesEnev2014 != null) {
                EnergySourcesEnev2014 sourceEnergySourcesEnev2014;
                sourceEnergySourcesEnev2014 = this.getEnergySourcesEnev2014();
                EnergySourcesEnev2014 copyEnergySourcesEnev2014 = ((EnergySourcesEnev2014) strategy.copy(LocatorUtils.property(locator, "energySourcesEnev2014", sourceEnergySourcesEnev2014), sourceEnergySourcesEnev2014));
                copy.setEnergySourcesEnev2014(copyEnergySourcesEnev2014);
            } else {
                copy.energySourcesEnev2014 = null;
            }
            if (this.floor!= null) {
                String sourceFloor;
                sourceFloor = this.getFloor();
                String copyFloor = ((String) strategy.copy(LocatorUtils.property(locator, "floor", sourceFloor), sourceFloor));
                copy.setFloor(copyFloor);
            } else {
                copy.floor = null;
            }
            if (this.gender!= null) {
                FlatMateGenderType sourceGender;
                sourceGender = this.getGender();
                FlatMateGenderType copyGender = ((FlatMateGenderType) strategy.copy(LocatorUtils.property(locator, "gender", sourceGender), sourceGender));
                copy.setGender(copyGender);
            } else {
                copy.gender = null;
            }
            if (this.guestToilet!= null) {
                Boolean sourceGuestToilet;
                sourceGuestToilet = this.isGuestToilet();
                Boolean copyGuestToilet = ((Boolean) strategy.copy(LocatorUtils.property(locator, "guestToilet", sourceGuestToilet), sourceGuestToilet));
                copy.setGuestToilet(copyGuestToilet);
            } else {
                copy.guestToilet = null;
            }
            if (this.handicappedAccessible!= null) {
                Boolean sourceHandicappedAccessible;
                sourceHandicappedAccessible = this.isHandicappedAccessible();
                Boolean copyHandicappedAccessible = ((Boolean) strategy.copy(LocatorUtils.property(locator, "handicappedAccessible", sourceHandicappedAccessible), sourceHandicappedAccessible));
                copy.setHandicappedAccessible(copyHandicappedAccessible);
            } else {
                copy.handicappedAccessible = null;
            }
            if (this.hasFurniture!= null) {
                YesNoNotApplicableType sourceHasFurniture;
                sourceHasFurniture = this.getHasFurniture();
                YesNoNotApplicableType copyHasFurniture = ((YesNoNotApplicableType) strategy.copy(LocatorUtils.property(locator, "hasFurniture", sourceHasFurniture), sourceHasFurniture));
                copy.setHasFurniture(copyHasFurniture);
            } else {
                copy.hasFurniture = null;
            }
            if (this.heatingType!= null) {
                HeatingType sourceHeatingType;
                sourceHeatingType = this.getHeatingType();
                HeatingType copyHeatingType = ((HeatingType) strategy.copy(LocatorUtils.property(locator, "heatingType", sourceHeatingType), sourceHeatingType));
                copy.setHeatingType(copyHeatingType);
            } else {
                copy.heatingType = null;
            }
            if (this.heatingTypeEnev2014 != null) {
                HeatingTypeEnev2014 sourceHeatingTypeEnev2014;
                sourceHeatingTypeEnev2014 = this.getHeatingTypeEnev2014();
                HeatingTypeEnev2014 copyHeatingTypeEnev2014 = ((HeatingTypeEnev2014) strategy.copy(LocatorUtils.property(locator, "heatingTypeEnev2014", sourceHeatingTypeEnev2014), sourceHeatingTypeEnev2014));
                copy.setHeatingTypeEnev2014(copyHeatingTypeEnev2014);
            } else {
                copy.heatingTypeEnev2014 = null;
            }
            if (this.lift!= null) {
                Boolean sourceLift;
                sourceLift = this.isLift();
                Boolean copyLift = ((Boolean) strategy.copy(LocatorUtils.property(locator, "lift", sourceLift), sourceLift));
                copy.setLift(copyLift);
            } else {
                copy.lift = null;
            }
            if (this.maxNumberOfPersons!= null) {
                Long sourceMaxNumberOfPersons;
                sourceMaxNumberOfPersons = this.getMaxNumberOfPersons();
                Long copyMaxNumberOfPersons = ((Long) strategy.copy(LocatorUtils.property(locator, "maxNumberOfPersons", sourceMaxNumberOfPersons), sourceMaxNumberOfPersons));
                copy.setMaxNumberOfPersons(copyMaxNumberOfPersons);
            } else {
                copy.maxNumberOfPersons = null;
            }
            if (this.maxRentalTime!= null) {
                BigDecimal sourceMaxRentalTime;
                sourceMaxRentalTime = this.getMaxRentalTime();
                BigDecimal copyMaxRentalTime = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "maxRentalTime", sourceMaxRentalTime), sourceMaxRentalTime));
                copy.setMaxRentalTime(copyMaxRentalTime);
            } else {
                copy.maxRentalTime = null;
            }
            if (this.minRentalTime!= null) {
                BigDecimal sourceMinRentalTime;
                sourceMinRentalTime = this.getMinRentalTime();
                BigDecimal copyMinRentalTime = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "minRentalTime", sourceMinRentalTime), sourceMinRentalTime));
                copy.setMinRentalTime(copyMinRentalTime);
            } else {
                copy.minRentalTime = null;
            }
            if (this.numberOfFloors!= null) {
                Long sourceNumberOfFloors;
                sourceNumberOfFloors = this.getNumberOfFloors();
                Long copyNumberOfFloors = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfFloors", sourceNumberOfFloors), sourceNumberOfFloors));
                copy.setNumberOfFloors(copyNumberOfFloors);
            } else {
                copy.numberOfFloors = null;
            }
            if (this.numberOfParkingSpaces!= null) {
                Long sourceNumberOfParkingSpaces;
                sourceNumberOfParkingSpaces = this.getNumberOfParkingSpaces();
                Long copyNumberOfParkingSpaces = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfParkingSpaces", sourceNumberOfParkingSpaces), sourceNumberOfParkingSpaces));
                copy.setNumberOfParkingSpaces(copyNumberOfParkingSpaces);
            } else {
                copy.numberOfParkingSpaces = null;
            }
            if (this.parkingSpacePrice!= null) {
                BigDecimal sourceParkingSpacePrice;
                sourceParkingSpacePrice = this.getParkingSpacePrice();
                BigDecimal copyParkingSpacePrice = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "parkingSpacePrice", sourceParkingSpacePrice), sourceParkingSpacePrice));
                copy.setParkingSpacePrice(copyParkingSpacePrice);
            } else {
                copy.parkingSpacePrice = null;
            }
            if (this.parkingSpaceType!= null) {
                ParkingSpaceType sourceParkingSpaceType;
                sourceParkingSpaceType = this.getParkingSpaceType();
                ParkingSpaceType copyParkingSpaceType = ((ParkingSpaceType) strategy.copy(LocatorUtils.property(locator, "parkingSpaceType", sourceParkingSpaceType), sourceParkingSpaceType));
                copy.setParkingSpaceType(copyParkingSpaceType);
            } else {
                copy.parkingSpaceType = null;
            }
            if (this.petsAllowed!= null) {
                PetsAllowedType sourcePetsAllowed;
                sourcePetsAllowed = this.getPetsAllowed();
                PetsAllowedType copyPetsAllowed = ((PetsAllowedType) strategy.copy(LocatorUtils.property(locator, "petsAllowed", sourcePetsAllowed), sourcePetsAllowed));
                copy.setPetsAllowed(copyPetsAllowed);
            } else {
                copy.petsAllowed = null;
            }
            if (this.serviceCharge!= null) {
                BigDecimal sourceServiceCharge;
                sourceServiceCharge = this.getServiceCharge();
                BigDecimal copyServiceCharge = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "serviceCharge", sourceServiceCharge), sourceServiceCharge));
                copy.setServiceCharge(copyServiceCharge);
            } else {
                copy.serviceCharge = null;
            }
            if (this.thermalCharacteristic!= null) {
                BigDecimal sourceThermalCharacteristic;
                sourceThermalCharacteristic = this.getThermalCharacteristic();
                BigDecimal copyThermalCharacteristic = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "thermalCharacteristic", sourceThermalCharacteristic), sourceThermalCharacteristic));
                copy.setThermalCharacteristic(copyThermalCharacteristic);
            } else {
                copy.thermalCharacteristic = null;
            }
            if (this.totalRent!= null) {
                BigDecimal sourceTotalRent;
                sourceTotalRent = this.getTotalRent();
                BigDecimal copyTotalRent = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "totalRent", sourceTotalRent), sourceTotalRent));
                copy.setTotalRent(copyTotalRent);
            } else {
                copy.totalRent = null;
            }
            if (this.constructionYear!= null) {
                Long sourceConstructionYear;
                sourceConstructionYear = this.getConstructionYear();
                Long copyConstructionYear = ((Long) strategy.copy(LocatorUtils.property(locator, "constructionYear", sourceConstructionYear), sourceConstructionYear));
                copy.setConstructionYear(copyConstructionYear);
            } else {
                copy.constructionYear = null;
            }
            if (this.constructionYearUnknown!= null) {
                Boolean sourceConstructionYearUnknown;
                sourceConstructionYearUnknown = this.isConstructionYearUnknown();
                Boolean copyConstructionYearUnknown = ((Boolean) strategy.copy(LocatorUtils.property(locator, "constructionYearUnknown", sourceConstructionYearUnknown), sourceConstructionYearUnknown));
                copy.setConstructionYearUnknown(copyConstructionYearUnknown);
            } else {
                copy.constructionYearUnknown = null;
            }
            if (this.energyCertificate!= null) {
                EnergyPerformanceCertificate sourceEnergyCertificate;
                sourceEnergyCertificate = this.getEnergyCertificate();
                EnergyPerformanceCertificate copyEnergyCertificate = ((EnergyPerformanceCertificate) strategy.copy(LocatorUtils.property(locator, "energyCertificate", sourceEnergyCertificate), sourceEnergyCertificate));
                copy.setEnergyCertificate(copyEnergyCertificate);
            } else {
                copy.energyCertificate = null;
            }
            if (this.price!= null) {
                Price sourcePrice;
                sourcePrice = this.getPrice();
                Price copyPrice = ((Price) strategy.copy(LocatorUtils.property(locator, "price", sourcePrice), sourcePrice));
                copy.setPrice(copyPrice);
            } else {
                copy.price = null;
            }
            if (this.livingSpace!= null) {
                BigDecimal sourceLivingSpace;
                sourceLivingSpace = this.getLivingSpace();
                BigDecimal copyLivingSpace = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "livingSpace", sourceLivingSpace), sourceLivingSpace));
                copy.setLivingSpace(copyLivingSpace);
            } else {
                copy.livingSpace = null;
            }
            if (this.numberOfRooms!= null) {
                BigDecimal sourceNumberOfRooms;
                sourceNumberOfRooms = this.getNumberOfRooms();
                BigDecimal copyNumberOfRooms = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "numberOfRooms", sourceNumberOfRooms), sourceNumberOfRooms));
                copy.setNumberOfRooms(copyNumberOfRooms);
            } else {
                copy.numberOfRooms = null;
            }
            if (this.startRentalDate!= null) {
                Calendar sourceStartRentalDate;
                sourceStartRentalDate = this.getStartRentalDate();
                Calendar copyStartRentalDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "startRentalDate", sourceStartRentalDate), sourceStartRentalDate));
                copy.setStartRentalDate(copyStartRentalDate);
            } else {
                copy.startRentalDate = null;
            }
            if (this.balcony!= null) {
                Boolean sourceBalcony;
                sourceBalcony = this.isBalcony();
                Boolean copyBalcony = ((Boolean) strategy.copy(LocatorUtils.property(locator, "balcony", sourceBalcony), sourceBalcony));
                copy.setBalcony(copyBalcony);
            } else {
                copy.balcony = null;
            }
            if (this.garden!= null) {
                Boolean sourceGarden;
                sourceGarden = this.isGarden();
                Boolean copyGarden = ((Boolean) strategy.copy(LocatorUtils.property(locator, "garden", sourceGarden), sourceGarden));
                copy.setGarden(copyGarden);
            } else {
                copy.garden = null;
            }
            if (this.nonSmoker!= null) {
                Boolean sourceNonSmoker;
                sourceNonSmoker = this.isNonSmoker();
                Boolean copyNonSmoker = ((Boolean) strategy.copy(LocatorUtils.property(locator, "nonSmoker", sourceNonSmoker), sourceNonSmoker));
                copy.setNonSmoker(copyNonSmoker);
            } else {
                copy.nonSmoker = null;
            }
            if (this.shortTermAccomodationType!= null) {
                ShortTermAccommodationType sourceShortTermAccomodationType;
                sourceShortTermAccomodationType = this.getShortTermAccomodationType();
                ShortTermAccommodationType copyShortTermAccomodationType = ((ShortTermAccommodationType) strategy.copy(LocatorUtils.property(locator, "shortTermAccomodationType", sourceShortTermAccomodationType), sourceShortTermAccomodationType));
                copy.setShortTermAccomodationType(copyShortTermAccomodationType);
            } else {
                copy.shortTermAccomodationType = null;
            }
            if (this.courtage!= null) {
                CourtageInfo sourceCourtage;
                sourceCourtage = this.getCourtage();
                CourtageInfo copyCourtage = ((CourtageInfo) strategy.copy(LocatorUtils.property(locator, "courtage", sourceCourtage), sourceCourtage));
                copy.setCourtage(copyCourtage);
            } else {
                copy.courtage = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ShortTermAccommodation();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ShortTermAccommodation that = ((ShortTermAccommodation) object);
        {
            BigDecimal lhsBaseRent;
            lhsBaseRent = this.getBaseRent();
            BigDecimal rhsBaseRent;
            rhsBaseRent = that.getBaseRent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baseRent", lhsBaseRent), LocatorUtils.property(thatLocator, "baseRent", rhsBaseRent), lhsBaseRent, rhsBaseRent)) {
                return false;
            }
        }
        {
            BuildingEnergyRatingType lhsBuildingEnergyRatingType;
            lhsBuildingEnergyRatingType = this.getBuildingEnergyRatingType();
            BuildingEnergyRatingType rhsBuildingEnergyRatingType;
            rhsBuildingEnergyRatingType = that.getBuildingEnergyRatingType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buildingEnergyRatingType", lhsBuildingEnergyRatingType), LocatorUtils.property(thatLocator, "buildingEnergyRatingType", rhsBuildingEnergyRatingType), lhsBuildingEnergyRatingType, rhsBuildingEnergyRatingType)) {
                return false;
            }
        }
        {
            Boolean lhsCellar;
            lhsCellar = this.isCellar();
            Boolean rhsCellar;
            rhsCellar = that.isCellar();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cellar", lhsCellar), LocatorUtils.property(thatLocator, "cellar", rhsCellar), lhsCellar, rhsCellar)) {
                return false;
            }
        }
        {
            RealEstateCondition lhsCondition;
            lhsCondition = this.getCondition();
            RealEstateCondition rhsCondition;
            rhsCondition = that.getCondition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "condition", lhsCondition), LocatorUtils.property(thatLocator, "condition", rhsCondition), lhsCondition, rhsCondition)) {
                return false;
            }
        }
        {
            String lhsDeposit;
            lhsDeposit = this.getDeposit();
            String rhsDeposit;
            rhsDeposit = that.getDeposit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deposit", lhsDeposit), LocatorUtils.property(thatLocator, "deposit", rhsDeposit), lhsDeposit, rhsDeposit)) {
                return false;
            }
        }
        {
            Calendar lhsEndRentalDate;
            lhsEndRentalDate = this.getEndRentalDate();
            Calendar rhsEndRentalDate;
            rhsEndRentalDate = that.getEndRentalDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endRentalDate", lhsEndRentalDate), LocatorUtils.property(thatLocator, "endRentalDate", rhsEndRentalDate), lhsEndRentalDate, rhsEndRentalDate)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsEnergyConsumptionContainsWarmWater;
            lhsEnergyConsumptionContainsWarmWater = this.getEnergyConsumptionContainsWarmWater();
            YesNotApplicableType rhsEnergyConsumptionContainsWarmWater;
            rhsEnergyConsumptionContainsWarmWater = that.getEnergyConsumptionContainsWarmWater();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyConsumptionContainsWarmWater", lhsEnergyConsumptionContainsWarmWater), LocatorUtils.property(thatLocator, "energyConsumptionContainsWarmWater", rhsEnergyConsumptionContainsWarmWater), lhsEnergyConsumptionContainsWarmWater, rhsEnergyConsumptionContainsWarmWater)) {
                return false;
            }
        }
        {
            FiringTypes lhsFiringTypes;
            lhsFiringTypes = this.getFiringTypes();
            FiringTypes rhsFiringTypes;
            rhsFiringTypes = that.getFiringTypes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firingTypes", lhsFiringTypes), LocatorUtils.property(thatLocator, "firingTypes", rhsFiringTypes), lhsFiringTypes, rhsFiringTypes)) {
                return false;
            }
        }
        {
            EnergySourcesEnev2014 lhsEnergySourcesEnev2014;
            lhsEnergySourcesEnev2014 = this.getEnergySourcesEnev2014();
            EnergySourcesEnev2014 rhsEnergySourcesEnev2014;
            rhsEnergySourcesEnev2014 = that.getEnergySourcesEnev2014();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energySourcesEnev2014", lhsEnergySourcesEnev2014), LocatorUtils.property(thatLocator, "energySourcesEnev2014", rhsEnergySourcesEnev2014), lhsEnergySourcesEnev2014, rhsEnergySourcesEnev2014)) {
                return false;
            }
        }
        {
            String lhsFloor;
            lhsFloor = this.getFloor();
            String rhsFloor;
            rhsFloor = that.getFloor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "floor", lhsFloor), LocatorUtils.property(thatLocator, "floor", rhsFloor), lhsFloor, rhsFloor)) {
                return false;
            }
        }
        {
            FlatMateGenderType lhsGender;
            lhsGender = this.getGender();
            FlatMateGenderType rhsGender;
            rhsGender = that.getGender();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gender", lhsGender), LocatorUtils.property(thatLocator, "gender", rhsGender), lhsGender, rhsGender)) {
                return false;
            }
        }
        {
            Boolean lhsGuestToilet;
            lhsGuestToilet = this.isGuestToilet();
            Boolean rhsGuestToilet;
            rhsGuestToilet = that.isGuestToilet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "guestToilet", lhsGuestToilet), LocatorUtils.property(thatLocator, "guestToilet", rhsGuestToilet), lhsGuestToilet, rhsGuestToilet)) {
                return false;
            }
        }
        {
            Boolean lhsHandicappedAccessible;
            lhsHandicappedAccessible = this.isHandicappedAccessible();
            Boolean rhsHandicappedAccessible;
            rhsHandicappedAccessible = that.isHandicappedAccessible();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "handicappedAccessible", lhsHandicappedAccessible), LocatorUtils.property(thatLocator, "handicappedAccessible", rhsHandicappedAccessible), lhsHandicappedAccessible, rhsHandicappedAccessible)) {
                return false;
            }
        }
        {
            YesNoNotApplicableType lhsHasFurniture;
            lhsHasFurniture = this.getHasFurniture();
            YesNoNotApplicableType rhsHasFurniture;
            rhsHasFurniture = that.getHasFurniture();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hasFurniture", lhsHasFurniture), LocatorUtils.property(thatLocator, "hasFurniture", rhsHasFurniture), lhsHasFurniture, rhsHasFurniture)) {
                return false;
            }
        }
        {
            HeatingType lhsHeatingType;
            lhsHeatingType = this.getHeatingType();
            HeatingType rhsHeatingType;
            rhsHeatingType = that.getHeatingType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heatingType", lhsHeatingType), LocatorUtils.property(thatLocator, "heatingType", rhsHeatingType), lhsHeatingType, rhsHeatingType)) {
                return false;
            }
        }
        {
            HeatingTypeEnev2014 lhsHeatingTypeEnev2014;
            lhsHeatingTypeEnev2014 = this.getHeatingTypeEnev2014();
            HeatingTypeEnev2014 rhsHeatingTypeEnev2014;
            rhsHeatingTypeEnev2014 = that.getHeatingTypeEnev2014();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heatingTypeEnev2014", lhsHeatingTypeEnev2014), LocatorUtils.property(thatLocator, "heatingTypeEnev2014", rhsHeatingTypeEnev2014), lhsHeatingTypeEnev2014, rhsHeatingTypeEnev2014)) {
                return false;
            }
        }
        {
            Boolean lhsLift;
            lhsLift = this.isLift();
            Boolean rhsLift;
            rhsLift = that.isLift();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lift", lhsLift), LocatorUtils.property(thatLocator, "lift", rhsLift), lhsLift, rhsLift)) {
                return false;
            }
        }
        {
            Long lhsMaxNumberOfPersons;
            lhsMaxNumberOfPersons = this.getMaxNumberOfPersons();
            Long rhsMaxNumberOfPersons;
            rhsMaxNumberOfPersons = that.getMaxNumberOfPersons();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxNumberOfPersons", lhsMaxNumberOfPersons), LocatorUtils.property(thatLocator, "maxNumberOfPersons", rhsMaxNumberOfPersons), lhsMaxNumberOfPersons, rhsMaxNumberOfPersons)) {
                return false;
            }
        }
        {
            BigDecimal lhsMaxRentalTime;
            lhsMaxRentalTime = this.getMaxRentalTime();
            BigDecimal rhsMaxRentalTime;
            rhsMaxRentalTime = that.getMaxRentalTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxRentalTime", lhsMaxRentalTime), LocatorUtils.property(thatLocator, "maxRentalTime", rhsMaxRentalTime), lhsMaxRentalTime, rhsMaxRentalTime)) {
                return false;
            }
        }
        {
            BigDecimal lhsMinRentalTime;
            lhsMinRentalTime = this.getMinRentalTime();
            BigDecimal rhsMinRentalTime;
            rhsMinRentalTime = that.getMinRentalTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minRentalTime", lhsMinRentalTime), LocatorUtils.property(thatLocator, "minRentalTime", rhsMinRentalTime), lhsMinRentalTime, rhsMinRentalTime)) {
                return false;
            }
        }
        {
            Long lhsNumberOfFloors;
            lhsNumberOfFloors = this.getNumberOfFloors();
            Long rhsNumberOfFloors;
            rhsNumberOfFloors = that.getNumberOfFloors();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfFloors", lhsNumberOfFloors), LocatorUtils.property(thatLocator, "numberOfFloors", rhsNumberOfFloors), lhsNumberOfFloors, rhsNumberOfFloors)) {
                return false;
            }
        }
        {
            Long lhsNumberOfParkingSpaces;
            lhsNumberOfParkingSpaces = this.getNumberOfParkingSpaces();
            Long rhsNumberOfParkingSpaces;
            rhsNumberOfParkingSpaces = that.getNumberOfParkingSpaces();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfParkingSpaces", lhsNumberOfParkingSpaces), LocatorUtils.property(thatLocator, "numberOfParkingSpaces", rhsNumberOfParkingSpaces), lhsNumberOfParkingSpaces, rhsNumberOfParkingSpaces)) {
                return false;
            }
        }
        {
            BigDecimal lhsParkingSpacePrice;
            lhsParkingSpacePrice = this.getParkingSpacePrice();
            BigDecimal rhsParkingSpacePrice;
            rhsParkingSpacePrice = that.getParkingSpacePrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parkingSpacePrice", lhsParkingSpacePrice), LocatorUtils.property(thatLocator, "parkingSpacePrice", rhsParkingSpacePrice), lhsParkingSpacePrice, rhsParkingSpacePrice)) {
                return false;
            }
        }
        {
            ParkingSpaceType lhsParkingSpaceType;
            lhsParkingSpaceType = this.getParkingSpaceType();
            ParkingSpaceType rhsParkingSpaceType;
            rhsParkingSpaceType = that.getParkingSpaceType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parkingSpaceType", lhsParkingSpaceType), LocatorUtils.property(thatLocator, "parkingSpaceType", rhsParkingSpaceType), lhsParkingSpaceType, rhsParkingSpaceType)) {
                return false;
            }
        }
        {
            PetsAllowedType lhsPetsAllowed;
            lhsPetsAllowed = this.getPetsAllowed();
            PetsAllowedType rhsPetsAllowed;
            rhsPetsAllowed = that.getPetsAllowed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "petsAllowed", lhsPetsAllowed), LocatorUtils.property(thatLocator, "petsAllowed", rhsPetsAllowed), lhsPetsAllowed, rhsPetsAllowed)) {
                return false;
            }
        }
        {
            BigDecimal lhsServiceCharge;
            lhsServiceCharge = this.getServiceCharge();
            BigDecimal rhsServiceCharge;
            rhsServiceCharge = that.getServiceCharge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceCharge", lhsServiceCharge), LocatorUtils.property(thatLocator, "serviceCharge", rhsServiceCharge), lhsServiceCharge, rhsServiceCharge)) {
                return false;
            }
        }
        {
            BigDecimal lhsThermalCharacteristic;
            lhsThermalCharacteristic = this.getThermalCharacteristic();
            BigDecimal rhsThermalCharacteristic;
            rhsThermalCharacteristic = that.getThermalCharacteristic();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "thermalCharacteristic", lhsThermalCharacteristic), LocatorUtils.property(thatLocator, "thermalCharacteristic", rhsThermalCharacteristic), lhsThermalCharacteristic, rhsThermalCharacteristic)) {
                return false;
            }
        }
        {
            BigDecimal lhsTotalRent;
            lhsTotalRent = this.getTotalRent();
            BigDecimal rhsTotalRent;
            rhsTotalRent = that.getTotalRent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalRent", lhsTotalRent), LocatorUtils.property(thatLocator, "totalRent", rhsTotalRent), lhsTotalRent, rhsTotalRent)) {
                return false;
            }
        }
        {
            Long lhsConstructionYear;
            lhsConstructionYear = this.getConstructionYear();
            Long rhsConstructionYear;
            rhsConstructionYear = that.getConstructionYear();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "constructionYear", lhsConstructionYear), LocatorUtils.property(thatLocator, "constructionYear", rhsConstructionYear), lhsConstructionYear, rhsConstructionYear)) {
                return false;
            }
        }
        {
            Boolean lhsConstructionYearUnknown;
            lhsConstructionYearUnknown = this.isConstructionYearUnknown();
            Boolean rhsConstructionYearUnknown;
            rhsConstructionYearUnknown = that.isConstructionYearUnknown();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "constructionYearUnknown", lhsConstructionYearUnknown), LocatorUtils.property(thatLocator, "constructionYearUnknown", rhsConstructionYearUnknown), lhsConstructionYearUnknown, rhsConstructionYearUnknown)) {
                return false;
            }
        }
        {
            EnergyPerformanceCertificate lhsEnergyCertificate;
            lhsEnergyCertificate = this.getEnergyCertificate();
            EnergyPerformanceCertificate rhsEnergyCertificate;
            rhsEnergyCertificate = that.getEnergyCertificate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyCertificate", lhsEnergyCertificate), LocatorUtils.property(thatLocator, "energyCertificate", rhsEnergyCertificate), lhsEnergyCertificate, rhsEnergyCertificate)) {
                return false;
            }
        }
        {
            Price lhsPrice;
            lhsPrice = this.getPrice();
            Price rhsPrice;
            rhsPrice = that.getPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "price", lhsPrice), LocatorUtils.property(thatLocator, "price", rhsPrice), lhsPrice, rhsPrice)) {
                return false;
            }
        }
        {
            BigDecimal lhsLivingSpace;
            lhsLivingSpace = this.getLivingSpace();
            BigDecimal rhsLivingSpace;
            rhsLivingSpace = that.getLivingSpace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "livingSpace", lhsLivingSpace), LocatorUtils.property(thatLocator, "livingSpace", rhsLivingSpace), lhsLivingSpace, rhsLivingSpace)) {
                return false;
            }
        }
        {
            BigDecimal lhsNumberOfRooms;
            lhsNumberOfRooms = this.getNumberOfRooms();
            BigDecimal rhsNumberOfRooms;
            rhsNumberOfRooms = that.getNumberOfRooms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfRooms", lhsNumberOfRooms), LocatorUtils.property(thatLocator, "numberOfRooms", rhsNumberOfRooms), lhsNumberOfRooms, rhsNumberOfRooms)) {
                return false;
            }
        }
        {
            Calendar lhsStartRentalDate;
            lhsStartRentalDate = this.getStartRentalDate();
            Calendar rhsStartRentalDate;
            rhsStartRentalDate = that.getStartRentalDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startRentalDate", lhsStartRentalDate), LocatorUtils.property(thatLocator, "startRentalDate", rhsStartRentalDate), lhsStartRentalDate, rhsStartRentalDate)) {
                return false;
            }
        }
        {
            Boolean lhsBalcony;
            lhsBalcony = this.isBalcony();
            Boolean rhsBalcony;
            rhsBalcony = that.isBalcony();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balcony", lhsBalcony), LocatorUtils.property(thatLocator, "balcony", rhsBalcony), lhsBalcony, rhsBalcony)) {
                return false;
            }
        }
        {
            Boolean lhsGarden;
            lhsGarden = this.isGarden();
            Boolean rhsGarden;
            rhsGarden = that.isGarden();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "garden", lhsGarden), LocatorUtils.property(thatLocator, "garden", rhsGarden), lhsGarden, rhsGarden)) {
                return false;
            }
        }
        {
            Boolean lhsNonSmoker;
            lhsNonSmoker = this.isNonSmoker();
            Boolean rhsNonSmoker;
            rhsNonSmoker = that.isNonSmoker();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nonSmoker", lhsNonSmoker), LocatorUtils.property(thatLocator, "nonSmoker", rhsNonSmoker), lhsNonSmoker, rhsNonSmoker)) {
                return false;
            }
        }
        {
            ShortTermAccommodationType lhsShortTermAccomodationType;
            lhsShortTermAccomodationType = this.getShortTermAccomodationType();
            ShortTermAccommodationType rhsShortTermAccomodationType;
            rhsShortTermAccomodationType = that.getShortTermAccomodationType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shortTermAccomodationType", lhsShortTermAccomodationType), LocatorUtils.property(thatLocator, "shortTermAccomodationType", rhsShortTermAccomodationType), lhsShortTermAccomodationType, rhsShortTermAccomodationType)) {
                return false;
            }
        }
        {
            CourtageInfo lhsCourtage;
            lhsCourtage = this.getCourtage();
            CourtageInfo rhsCourtage;
            rhsCourtage = that.getCourtage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "courtage", lhsCourtage), LocatorUtils.property(thatLocator, "courtage", rhsCourtage), lhsCourtage, rhsCourtage)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
