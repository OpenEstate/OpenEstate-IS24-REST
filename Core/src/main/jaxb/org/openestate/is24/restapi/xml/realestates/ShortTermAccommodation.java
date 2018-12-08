
package org.openestate.is24.restapi.xml.realestates;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import javax.annotation.Generated;
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
import org.openestate.is24.restapi.xml.Adapter3;
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
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
public class ShortTermAccommodation
    extends RealEstate
    implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal baseRent;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected BuildingEnergyRatingType buildingEnergyRatingType;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean cellar;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected RealEstateCondition condition;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected String deposit;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Calendar endRentalDate;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected YesNotApplicableType energyConsumptionContainsWarmWater;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected FiringTypes firingTypes;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected EnergySourcesEnev2014 energySourcesEnev2014;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected String floor;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected FlatMateGenderType gender;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean guestToilet;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean handicappedAccessible;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected YesNoNotApplicableType hasFurniture;
    @XmlSchemaType(name = "string")
    @Deprecated
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected HeatingType heatingType;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected HeatingTypeEnev2014 heatingTypeEnev2014;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean lift;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Long maxNumberOfPersons;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal maxRentalTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal minRentalTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Long numberOfFloors;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Long numberOfParkingSpaces;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal parkingSpacePrice;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected ParkingSpaceType parkingSpaceType;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected PetsAllowedType petsAllowed;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal serviceCharge;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.realestates.Adapter5 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal thermalCharacteristic;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Deprecated
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal totalRent;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Long constructionYear;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean constructionYearUnknown;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected EnergyPerformanceCertificate energyCertificate;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Price price;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal livingSpace;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal numberOfRooms;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Calendar startRentalDate;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean balcony;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean garden;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean nonSmoker;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected ShortTermAccommodationType shortTermAccomodationType;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected CourtageInfo courtage;

    /**
     * Gets the value of the baseRent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getCellar() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getGuestToilet() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getHandicappedAccessible() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getLift() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getConstructionYearUnknown() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getBalcony() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getGarden() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getNonSmoker() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setCourtage(CourtageInfo value) {
        this.courtage = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            BigDecimal theBaseRent;
            theBaseRent = this.getBaseRent();
            strategy.appendField(locator, this, "baseRent", buffer, theBaseRent, (this.baseRent!= null));
        }
        {
            BuildingEnergyRatingType theBuildingEnergyRatingType;
            theBuildingEnergyRatingType = this.getBuildingEnergyRatingType();
            strategy.appendField(locator, this, "buildingEnergyRatingType", buffer, theBuildingEnergyRatingType, (this.buildingEnergyRatingType!= null));
        }
        {
            Boolean theCellar;
            theCellar = this.getCellar();
            strategy.appendField(locator, this, "cellar", buffer, theCellar, (this.cellar!= null));
        }
        {
            RealEstateCondition theCondition;
            theCondition = this.getCondition();
            strategy.appendField(locator, this, "condition", buffer, theCondition, (this.condition!= null));
        }
        {
            String theDeposit;
            theDeposit = this.getDeposit();
            strategy.appendField(locator, this, "deposit", buffer, theDeposit, (this.deposit!= null));
        }
        {
            Calendar theEndRentalDate;
            theEndRentalDate = this.getEndRentalDate();
            strategy.appendField(locator, this, "endRentalDate", buffer, theEndRentalDate, (this.endRentalDate!= null));
        }
        {
            YesNotApplicableType theEnergyConsumptionContainsWarmWater;
            theEnergyConsumptionContainsWarmWater = this.getEnergyConsumptionContainsWarmWater();
            strategy.appendField(locator, this, "energyConsumptionContainsWarmWater", buffer, theEnergyConsumptionContainsWarmWater, (this.energyConsumptionContainsWarmWater!= null));
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
            String theFloor;
            theFloor = this.getFloor();
            strategy.appendField(locator, this, "floor", buffer, theFloor, (this.floor!= null));
        }
        {
            FlatMateGenderType theGender;
            theGender = this.getGender();
            strategy.appendField(locator, this, "gender", buffer, theGender, (this.gender!= null));
        }
        {
            Boolean theGuestToilet;
            theGuestToilet = this.getGuestToilet();
            strategy.appendField(locator, this, "guestToilet", buffer, theGuestToilet, (this.guestToilet!= null));
        }
        {
            Boolean theHandicappedAccessible;
            theHandicappedAccessible = this.getHandicappedAccessible();
            strategy.appendField(locator, this, "handicappedAccessible", buffer, theHandicappedAccessible, (this.handicappedAccessible!= null));
        }
        {
            YesNoNotApplicableType theHasFurniture;
            theHasFurniture = this.getHasFurniture();
            strategy.appendField(locator, this, "hasFurniture", buffer, theHasFurniture, (this.hasFurniture!= null));
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
            Boolean theLift;
            theLift = this.getLift();
            strategy.appendField(locator, this, "lift", buffer, theLift, (this.lift!= null));
        }
        {
            Long theMaxNumberOfPersons;
            theMaxNumberOfPersons = this.getMaxNumberOfPersons();
            strategy.appendField(locator, this, "maxNumberOfPersons", buffer, theMaxNumberOfPersons, (this.maxNumberOfPersons!= null));
        }
        {
            BigDecimal theMaxRentalTime;
            theMaxRentalTime = this.getMaxRentalTime();
            strategy.appendField(locator, this, "maxRentalTime", buffer, theMaxRentalTime, (this.maxRentalTime!= null));
        }
        {
            BigDecimal theMinRentalTime;
            theMinRentalTime = this.getMinRentalTime();
            strategy.appendField(locator, this, "minRentalTime", buffer, theMinRentalTime, (this.minRentalTime!= null));
        }
        {
            Long theNumberOfFloors;
            theNumberOfFloors = this.getNumberOfFloors();
            strategy.appendField(locator, this, "numberOfFloors", buffer, theNumberOfFloors, (this.numberOfFloors!= null));
        }
        {
            Long theNumberOfParkingSpaces;
            theNumberOfParkingSpaces = this.getNumberOfParkingSpaces();
            strategy.appendField(locator, this, "numberOfParkingSpaces", buffer, theNumberOfParkingSpaces, (this.numberOfParkingSpaces!= null));
        }
        {
            BigDecimal theParkingSpacePrice;
            theParkingSpacePrice = this.getParkingSpacePrice();
            strategy.appendField(locator, this, "parkingSpacePrice", buffer, theParkingSpacePrice, (this.parkingSpacePrice!= null));
        }
        {
            ParkingSpaceType theParkingSpaceType;
            theParkingSpaceType = this.getParkingSpaceType();
            strategy.appendField(locator, this, "parkingSpaceType", buffer, theParkingSpaceType, (this.parkingSpaceType!= null));
        }
        {
            PetsAllowedType thePetsAllowed;
            thePetsAllowed = this.getPetsAllowed();
            strategy.appendField(locator, this, "petsAllowed", buffer, thePetsAllowed, (this.petsAllowed!= null));
        }
        {
            BigDecimal theServiceCharge;
            theServiceCharge = this.getServiceCharge();
            strategy.appendField(locator, this, "serviceCharge", buffer, theServiceCharge, (this.serviceCharge!= null));
        }
        {
            BigDecimal theThermalCharacteristic;
            theThermalCharacteristic = this.getThermalCharacteristic();
            strategy.appendField(locator, this, "thermalCharacteristic", buffer, theThermalCharacteristic, (this.thermalCharacteristic!= null));
        }
        {
            BigDecimal theTotalRent;
            theTotalRent = this.getTotalRent();
            strategy.appendField(locator, this, "totalRent", buffer, theTotalRent, (this.totalRent!= null));
        }
        {
            Long theConstructionYear;
            theConstructionYear = this.getConstructionYear();
            strategy.appendField(locator, this, "constructionYear", buffer, theConstructionYear, (this.constructionYear!= null));
        }
        {
            Boolean theConstructionYearUnknown;
            theConstructionYearUnknown = this.getConstructionYearUnknown();
            strategy.appendField(locator, this, "constructionYearUnknown", buffer, theConstructionYearUnknown, (this.constructionYearUnknown!= null));
        }
        {
            EnergyPerformanceCertificate theEnergyCertificate;
            theEnergyCertificate = this.getEnergyCertificate();
            strategy.appendField(locator, this, "energyCertificate", buffer, theEnergyCertificate, (this.energyCertificate!= null));
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
            Calendar theStartRentalDate;
            theStartRentalDate = this.getStartRentalDate();
            strategy.appendField(locator, this, "startRentalDate", buffer, theStartRentalDate, (this.startRentalDate!= null));
        }
        {
            Boolean theBalcony;
            theBalcony = this.getBalcony();
            strategy.appendField(locator, this, "balcony", buffer, theBalcony, (this.balcony!= null));
        }
        {
            Boolean theGarden;
            theGarden = this.getGarden();
            strategy.appendField(locator, this, "garden", buffer, theGarden, (this.garden!= null));
        }
        {
            Boolean theNonSmoker;
            theNonSmoker = this.getNonSmoker();
            strategy.appendField(locator, this, "nonSmoker", buffer, theNonSmoker, (this.nonSmoker!= null));
        }
        {
            ShortTermAccommodationType theShortTermAccomodationType;
            theShortTermAccomodationType = this.getShortTermAccomodationType();
            strategy.appendField(locator, this, "shortTermAccomodationType", buffer, theShortTermAccomodationType, (this.shortTermAccomodationType!= null));
        }
        {
            CourtageInfo theCourtage;
            theCourtage = this.getCourtage();
            strategy.appendField(locator, this, "courtage", buffer, theCourtage, (this.courtage!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof ShortTermAccommodation) {
            final ShortTermAccommodation copy = ((ShortTermAccommodation) draftCopy);
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
                Boolean cellarShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.cellar!= null));
                if (cellarShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceCellar;
                    sourceCellar = this.getCellar();
                    Boolean copyCellar = ((Boolean) strategy.copy(LocatorUtils.property(locator, "cellar", sourceCellar), sourceCellar, (this.cellar!= null)));
                    copy.setCellar(copyCellar);
                } else {
                    if (cellarShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cellar = null;
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
                Boolean endRentalDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.endRentalDate!= null));
                if (endRentalDateShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceEndRentalDate;
                    sourceEndRentalDate = this.getEndRentalDate();
                    Calendar copyEndRentalDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "endRentalDate", sourceEndRentalDate), sourceEndRentalDate, (this.endRentalDate!= null)));
                    copy.setEndRentalDate(copyEndRentalDate);
                } else {
                    if (endRentalDateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.endRentalDate = null;
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
                Boolean floorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.floor!= null));
                if (floorShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFloor;
                    sourceFloor = this.getFloor();
                    String copyFloor = ((String) strategy.copy(LocatorUtils.property(locator, "floor", sourceFloor), sourceFloor, (this.floor!= null)));
                    copy.setFloor(copyFloor);
                } else {
                    if (floorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.floor = null;
                    }
                }
            }
            {
                Boolean genderShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gender!= null));
                if (genderShouldBeCopiedAndSet == Boolean.TRUE) {
                    FlatMateGenderType sourceGender;
                    sourceGender = this.getGender();
                    FlatMateGenderType copyGender = ((FlatMateGenderType) strategy.copy(LocatorUtils.property(locator, "gender", sourceGender), sourceGender, (this.gender!= null)));
                    copy.setGender(copyGender);
                } else {
                    if (genderShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gender = null;
                    }
                }
            }
            {
                Boolean guestToiletShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.guestToilet!= null));
                if (guestToiletShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceGuestToilet;
                    sourceGuestToilet = this.getGuestToilet();
                    Boolean copyGuestToilet = ((Boolean) strategy.copy(LocatorUtils.property(locator, "guestToilet", sourceGuestToilet), sourceGuestToilet, (this.guestToilet!= null)));
                    copy.setGuestToilet(copyGuestToilet);
                } else {
                    if (guestToiletShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.guestToilet = null;
                    }
                }
            }
            {
                Boolean handicappedAccessibleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.handicappedAccessible!= null));
                if (handicappedAccessibleShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceHandicappedAccessible;
                    sourceHandicappedAccessible = this.getHandicappedAccessible();
                    Boolean copyHandicappedAccessible = ((Boolean) strategy.copy(LocatorUtils.property(locator, "handicappedAccessible", sourceHandicappedAccessible), sourceHandicappedAccessible, (this.handicappedAccessible!= null)));
                    copy.setHandicappedAccessible(copyHandicappedAccessible);
                } else {
                    if (handicappedAccessibleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.handicappedAccessible = null;
                    }
                }
            }
            {
                Boolean hasFurnitureShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hasFurniture!= null));
                if (hasFurnitureShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNoNotApplicableType sourceHasFurniture;
                    sourceHasFurniture = this.getHasFurniture();
                    YesNoNotApplicableType copyHasFurniture = ((YesNoNotApplicableType) strategy.copy(LocatorUtils.property(locator, "hasFurniture", sourceHasFurniture), sourceHasFurniture, (this.hasFurniture!= null)));
                    copy.setHasFurniture(copyHasFurniture);
                } else {
                    if (hasFurnitureShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hasFurniture = null;
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
                Boolean liftShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lift!= null));
                if (liftShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceLift;
                    sourceLift = this.getLift();
                    Boolean copyLift = ((Boolean) strategy.copy(LocatorUtils.property(locator, "lift", sourceLift), sourceLift, (this.lift!= null)));
                    copy.setLift(copyLift);
                } else {
                    if (liftShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lift = null;
                    }
                }
            }
            {
                Boolean maxNumberOfPersonsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maxNumberOfPersons!= null));
                if (maxNumberOfPersonsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceMaxNumberOfPersons;
                    sourceMaxNumberOfPersons = this.getMaxNumberOfPersons();
                    Long copyMaxNumberOfPersons = ((Long) strategy.copy(LocatorUtils.property(locator, "maxNumberOfPersons", sourceMaxNumberOfPersons), sourceMaxNumberOfPersons, (this.maxNumberOfPersons!= null)));
                    copy.setMaxNumberOfPersons(copyMaxNumberOfPersons);
                } else {
                    if (maxNumberOfPersonsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maxNumberOfPersons = null;
                    }
                }
            }
            {
                Boolean maxRentalTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maxRentalTime!= null));
                if (maxRentalTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceMaxRentalTime;
                    sourceMaxRentalTime = this.getMaxRentalTime();
                    BigDecimal copyMaxRentalTime = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "maxRentalTime", sourceMaxRentalTime), sourceMaxRentalTime, (this.maxRentalTime!= null)));
                    copy.setMaxRentalTime(copyMaxRentalTime);
                } else {
                    if (maxRentalTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maxRentalTime = null;
                    }
                }
            }
            {
                Boolean minRentalTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.minRentalTime!= null));
                if (minRentalTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceMinRentalTime;
                    sourceMinRentalTime = this.getMinRentalTime();
                    BigDecimal copyMinRentalTime = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "minRentalTime", sourceMinRentalTime), sourceMinRentalTime, (this.minRentalTime!= null)));
                    copy.setMinRentalTime(copyMinRentalTime);
                } else {
                    if (minRentalTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.minRentalTime = null;
                    }
                }
            }
            {
                Boolean numberOfFloorsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfFloors!= null));
                if (numberOfFloorsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceNumberOfFloors;
                    sourceNumberOfFloors = this.getNumberOfFloors();
                    Long copyNumberOfFloors = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfFloors", sourceNumberOfFloors), sourceNumberOfFloors, (this.numberOfFloors!= null)));
                    copy.setNumberOfFloors(copyNumberOfFloors);
                } else {
                    if (numberOfFloorsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfFloors = null;
                    }
                }
            }
            {
                Boolean numberOfParkingSpacesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfParkingSpaces!= null));
                if (numberOfParkingSpacesShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceNumberOfParkingSpaces;
                    sourceNumberOfParkingSpaces = this.getNumberOfParkingSpaces();
                    Long copyNumberOfParkingSpaces = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfParkingSpaces", sourceNumberOfParkingSpaces), sourceNumberOfParkingSpaces, (this.numberOfParkingSpaces!= null)));
                    copy.setNumberOfParkingSpaces(copyNumberOfParkingSpaces);
                } else {
                    if (numberOfParkingSpacesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfParkingSpaces = null;
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
                Boolean constructionYearShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.constructionYear!= null));
                if (constructionYearShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceConstructionYear;
                    sourceConstructionYear = this.getConstructionYear();
                    Long copyConstructionYear = ((Long) strategy.copy(LocatorUtils.property(locator, "constructionYear", sourceConstructionYear), sourceConstructionYear, (this.constructionYear!= null)));
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
                    sourceConstructionYearUnknown = this.getConstructionYearUnknown();
                    Boolean copyConstructionYearUnknown = ((Boolean) strategy.copy(LocatorUtils.property(locator, "constructionYearUnknown", sourceConstructionYearUnknown), sourceConstructionYearUnknown, (this.constructionYearUnknown!= null)));
                    copy.setConstructionYearUnknown(copyConstructionYearUnknown);
                } else {
                    if (constructionYearUnknownShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.constructionYearUnknown = null;
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
                Boolean startRentalDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.startRentalDate!= null));
                if (startRentalDateShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceStartRentalDate;
                    sourceStartRentalDate = this.getStartRentalDate();
                    Calendar copyStartRentalDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "startRentalDate", sourceStartRentalDate), sourceStartRentalDate, (this.startRentalDate!= null)));
                    copy.setStartRentalDate(copyStartRentalDate);
                } else {
                    if (startRentalDateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.startRentalDate = null;
                    }
                }
            }
            {
                Boolean balconyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.balcony!= null));
                if (balconyShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBalcony;
                    sourceBalcony = this.getBalcony();
                    Boolean copyBalcony = ((Boolean) strategy.copy(LocatorUtils.property(locator, "balcony", sourceBalcony), sourceBalcony, (this.balcony!= null)));
                    copy.setBalcony(copyBalcony);
                } else {
                    if (balconyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.balcony = null;
                    }
                }
            }
            {
                Boolean gardenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.garden!= null));
                if (gardenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceGarden;
                    sourceGarden = this.getGarden();
                    Boolean copyGarden = ((Boolean) strategy.copy(LocatorUtils.property(locator, "garden", sourceGarden), sourceGarden, (this.garden!= null)));
                    copy.setGarden(copyGarden);
                } else {
                    if (gardenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.garden = null;
                    }
                }
            }
            {
                Boolean nonSmokerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nonSmoker!= null));
                if (nonSmokerShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceNonSmoker;
                    sourceNonSmoker = this.getNonSmoker();
                    Boolean copyNonSmoker = ((Boolean) strategy.copy(LocatorUtils.property(locator, "nonSmoker", sourceNonSmoker), sourceNonSmoker, (this.nonSmoker!= null)));
                    copy.setNonSmoker(copyNonSmoker);
                } else {
                    if (nonSmokerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nonSmoker = null;
                    }
                }
            }
            {
                Boolean shortTermAccomodationTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.shortTermAccomodationType!= null));
                if (shortTermAccomodationTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ShortTermAccommodationType sourceShortTermAccomodationType;
                    sourceShortTermAccomodationType = this.getShortTermAccomodationType();
                    ShortTermAccommodationType copyShortTermAccomodationType = ((ShortTermAccommodationType) strategy.copy(LocatorUtils.property(locator, "shortTermAccomodationType", sourceShortTermAccomodationType), sourceShortTermAccomodationType, (this.shortTermAccomodationType!= null)));
                    copy.setShortTermAccomodationType(copyShortTermAccomodationType);
                } else {
                    if (shortTermAccomodationTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.shortTermAccomodationType = null;
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new ShortTermAccommodation();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
        final ShortTermAccommodation that = ((ShortTermAccommodation) object);
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
            BuildingEnergyRatingType lhsBuildingEnergyRatingType;
            lhsBuildingEnergyRatingType = this.getBuildingEnergyRatingType();
            BuildingEnergyRatingType rhsBuildingEnergyRatingType;
            rhsBuildingEnergyRatingType = that.getBuildingEnergyRatingType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buildingEnergyRatingType", lhsBuildingEnergyRatingType), LocatorUtils.property(thatLocator, "buildingEnergyRatingType", rhsBuildingEnergyRatingType), lhsBuildingEnergyRatingType, rhsBuildingEnergyRatingType, (this.buildingEnergyRatingType!= null), (that.buildingEnergyRatingType!= null))) {
                return false;
            }
        }
        {
            Boolean lhsCellar;
            lhsCellar = this.getCellar();
            Boolean rhsCellar;
            rhsCellar = that.getCellar();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cellar", lhsCellar), LocatorUtils.property(thatLocator, "cellar", rhsCellar), lhsCellar, rhsCellar, (this.cellar!= null), (that.cellar!= null))) {
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
            String lhsDeposit;
            lhsDeposit = this.getDeposit();
            String rhsDeposit;
            rhsDeposit = that.getDeposit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deposit", lhsDeposit), LocatorUtils.property(thatLocator, "deposit", rhsDeposit), lhsDeposit, rhsDeposit, (this.deposit!= null), (that.deposit!= null))) {
                return false;
            }
        }
        {
            Calendar lhsEndRentalDate;
            lhsEndRentalDate = this.getEndRentalDate();
            Calendar rhsEndRentalDate;
            rhsEndRentalDate = that.getEndRentalDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endRentalDate", lhsEndRentalDate), LocatorUtils.property(thatLocator, "endRentalDate", rhsEndRentalDate), lhsEndRentalDate, rhsEndRentalDate, (this.endRentalDate!= null), (that.endRentalDate!= null))) {
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
            String lhsFloor;
            lhsFloor = this.getFloor();
            String rhsFloor;
            rhsFloor = that.getFloor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "floor", lhsFloor), LocatorUtils.property(thatLocator, "floor", rhsFloor), lhsFloor, rhsFloor, (this.floor!= null), (that.floor!= null))) {
                return false;
            }
        }
        {
            FlatMateGenderType lhsGender;
            lhsGender = this.getGender();
            FlatMateGenderType rhsGender;
            rhsGender = that.getGender();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gender", lhsGender), LocatorUtils.property(thatLocator, "gender", rhsGender), lhsGender, rhsGender, (this.gender!= null), (that.gender!= null))) {
                return false;
            }
        }
        {
            Boolean lhsGuestToilet;
            lhsGuestToilet = this.getGuestToilet();
            Boolean rhsGuestToilet;
            rhsGuestToilet = that.getGuestToilet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "guestToilet", lhsGuestToilet), LocatorUtils.property(thatLocator, "guestToilet", rhsGuestToilet), lhsGuestToilet, rhsGuestToilet, (this.guestToilet!= null), (that.guestToilet!= null))) {
                return false;
            }
        }
        {
            Boolean lhsHandicappedAccessible;
            lhsHandicappedAccessible = this.getHandicappedAccessible();
            Boolean rhsHandicappedAccessible;
            rhsHandicappedAccessible = that.getHandicappedAccessible();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "handicappedAccessible", lhsHandicappedAccessible), LocatorUtils.property(thatLocator, "handicappedAccessible", rhsHandicappedAccessible), lhsHandicappedAccessible, rhsHandicappedAccessible, (this.handicappedAccessible!= null), (that.handicappedAccessible!= null))) {
                return false;
            }
        }
        {
            YesNoNotApplicableType lhsHasFurniture;
            lhsHasFurniture = this.getHasFurniture();
            YesNoNotApplicableType rhsHasFurniture;
            rhsHasFurniture = that.getHasFurniture();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hasFurniture", lhsHasFurniture), LocatorUtils.property(thatLocator, "hasFurniture", rhsHasFurniture), lhsHasFurniture, rhsHasFurniture, (this.hasFurniture!= null), (that.hasFurniture!= null))) {
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
            Boolean lhsLift;
            lhsLift = this.getLift();
            Boolean rhsLift;
            rhsLift = that.getLift();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lift", lhsLift), LocatorUtils.property(thatLocator, "lift", rhsLift), lhsLift, rhsLift, (this.lift!= null), (that.lift!= null))) {
                return false;
            }
        }
        {
            Long lhsMaxNumberOfPersons;
            lhsMaxNumberOfPersons = this.getMaxNumberOfPersons();
            Long rhsMaxNumberOfPersons;
            rhsMaxNumberOfPersons = that.getMaxNumberOfPersons();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxNumberOfPersons", lhsMaxNumberOfPersons), LocatorUtils.property(thatLocator, "maxNumberOfPersons", rhsMaxNumberOfPersons), lhsMaxNumberOfPersons, rhsMaxNumberOfPersons, (this.maxNumberOfPersons!= null), (that.maxNumberOfPersons!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsMaxRentalTime;
            lhsMaxRentalTime = this.getMaxRentalTime();
            BigDecimal rhsMaxRentalTime;
            rhsMaxRentalTime = that.getMaxRentalTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxRentalTime", lhsMaxRentalTime), LocatorUtils.property(thatLocator, "maxRentalTime", rhsMaxRentalTime), lhsMaxRentalTime, rhsMaxRentalTime, (this.maxRentalTime!= null), (that.maxRentalTime!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsMinRentalTime;
            lhsMinRentalTime = this.getMinRentalTime();
            BigDecimal rhsMinRentalTime;
            rhsMinRentalTime = that.getMinRentalTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minRentalTime", lhsMinRentalTime), LocatorUtils.property(thatLocator, "minRentalTime", rhsMinRentalTime), lhsMinRentalTime, rhsMinRentalTime, (this.minRentalTime!= null), (that.minRentalTime!= null))) {
                return false;
            }
        }
        {
            Long lhsNumberOfFloors;
            lhsNumberOfFloors = this.getNumberOfFloors();
            Long rhsNumberOfFloors;
            rhsNumberOfFloors = that.getNumberOfFloors();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfFloors", lhsNumberOfFloors), LocatorUtils.property(thatLocator, "numberOfFloors", rhsNumberOfFloors), lhsNumberOfFloors, rhsNumberOfFloors, (this.numberOfFloors!= null), (that.numberOfFloors!= null))) {
                return false;
            }
        }
        {
            Long lhsNumberOfParkingSpaces;
            lhsNumberOfParkingSpaces = this.getNumberOfParkingSpaces();
            Long rhsNumberOfParkingSpaces;
            rhsNumberOfParkingSpaces = that.getNumberOfParkingSpaces();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfParkingSpaces", lhsNumberOfParkingSpaces), LocatorUtils.property(thatLocator, "numberOfParkingSpaces", rhsNumberOfParkingSpaces), lhsNumberOfParkingSpaces, rhsNumberOfParkingSpaces, (this.numberOfParkingSpaces!= null), (that.numberOfParkingSpaces!= null))) {
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
            ParkingSpaceType lhsParkingSpaceType;
            lhsParkingSpaceType = this.getParkingSpaceType();
            ParkingSpaceType rhsParkingSpaceType;
            rhsParkingSpaceType = that.getParkingSpaceType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parkingSpaceType", lhsParkingSpaceType), LocatorUtils.property(thatLocator, "parkingSpaceType", rhsParkingSpaceType), lhsParkingSpaceType, rhsParkingSpaceType, (this.parkingSpaceType!= null), (that.parkingSpaceType!= null))) {
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
            BigDecimal lhsServiceCharge;
            lhsServiceCharge = this.getServiceCharge();
            BigDecimal rhsServiceCharge;
            rhsServiceCharge = that.getServiceCharge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceCharge", lhsServiceCharge), LocatorUtils.property(thatLocator, "serviceCharge", rhsServiceCharge), lhsServiceCharge, rhsServiceCharge, (this.serviceCharge!= null), (that.serviceCharge!= null))) {
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
            BigDecimal lhsTotalRent;
            lhsTotalRent = this.getTotalRent();
            BigDecimal rhsTotalRent;
            rhsTotalRent = that.getTotalRent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalRent", lhsTotalRent), LocatorUtils.property(thatLocator, "totalRent", rhsTotalRent), lhsTotalRent, rhsTotalRent, (this.totalRent!= null), (that.totalRent!= null))) {
                return false;
            }
        }
        {
            Long lhsConstructionYear;
            lhsConstructionYear = this.getConstructionYear();
            Long rhsConstructionYear;
            rhsConstructionYear = that.getConstructionYear();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "constructionYear", lhsConstructionYear), LocatorUtils.property(thatLocator, "constructionYear", rhsConstructionYear), lhsConstructionYear, rhsConstructionYear, (this.constructionYear!= null), (that.constructionYear!= null))) {
                return false;
            }
        }
        {
            Boolean lhsConstructionYearUnknown;
            lhsConstructionYearUnknown = this.getConstructionYearUnknown();
            Boolean rhsConstructionYearUnknown;
            rhsConstructionYearUnknown = that.getConstructionYearUnknown();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "constructionYearUnknown", lhsConstructionYearUnknown), LocatorUtils.property(thatLocator, "constructionYearUnknown", rhsConstructionYearUnknown), lhsConstructionYearUnknown, rhsConstructionYearUnknown, (this.constructionYearUnknown!= null), (that.constructionYearUnknown!= null))) {
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
            Calendar lhsStartRentalDate;
            lhsStartRentalDate = this.getStartRentalDate();
            Calendar rhsStartRentalDate;
            rhsStartRentalDate = that.getStartRentalDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startRentalDate", lhsStartRentalDate), LocatorUtils.property(thatLocator, "startRentalDate", rhsStartRentalDate), lhsStartRentalDate, rhsStartRentalDate, (this.startRentalDate!= null), (that.startRentalDate!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBalcony;
            lhsBalcony = this.getBalcony();
            Boolean rhsBalcony;
            rhsBalcony = that.getBalcony();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balcony", lhsBalcony), LocatorUtils.property(thatLocator, "balcony", rhsBalcony), lhsBalcony, rhsBalcony, (this.balcony!= null), (that.balcony!= null))) {
                return false;
            }
        }
        {
            Boolean lhsGarden;
            lhsGarden = this.getGarden();
            Boolean rhsGarden;
            rhsGarden = that.getGarden();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "garden", lhsGarden), LocatorUtils.property(thatLocator, "garden", rhsGarden), lhsGarden, rhsGarden, (this.garden!= null), (that.garden!= null))) {
                return false;
            }
        }
        {
            Boolean lhsNonSmoker;
            lhsNonSmoker = this.getNonSmoker();
            Boolean rhsNonSmoker;
            rhsNonSmoker = that.getNonSmoker();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nonSmoker", lhsNonSmoker), LocatorUtils.property(thatLocator, "nonSmoker", rhsNonSmoker), lhsNonSmoker, rhsNonSmoker, (this.nonSmoker!= null), (that.nonSmoker!= null))) {
                return false;
            }
        }
        {
            ShortTermAccommodationType lhsShortTermAccomodationType;
            lhsShortTermAccomodationType = this.getShortTermAccomodationType();
            ShortTermAccommodationType rhsShortTermAccomodationType;
            rhsShortTermAccomodationType = that.getShortTermAccomodationType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shortTermAccomodationType", lhsShortTermAccomodationType), LocatorUtils.property(thatLocator, "shortTermAccomodationType", rhsShortTermAccomodationType), lhsShortTermAccomodationType, rhsShortTermAccomodationType, (this.shortTermAccomodationType!= null), (that.shortTermAccomodationType!= null))) {
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
