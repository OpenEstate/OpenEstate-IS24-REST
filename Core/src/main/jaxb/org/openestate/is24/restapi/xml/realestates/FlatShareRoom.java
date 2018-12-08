
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
import org.openestate.is24.restapi.xml.Adapter5;
import org.openestate.is24.restapi.xml.common.Adapter7;
import org.openestate.is24.restapi.xml.common.ApartmentType;
import org.openestate.is24.restapi.xml.common.BuildingEnergyRatingType;
import org.openestate.is24.restapi.xml.common.CourtageInfo;
import org.openestate.is24.restapi.xml.common.EnergyPerformanceCertificate;
import org.openestate.is24.restapi.xml.common.EnergySourcesEnev2014;
import org.openestate.is24.restapi.xml.common.FlatMateGenderType;
import org.openestate.is24.restapi.xml.common.FlooringType;
import org.openestate.is24.restapi.xml.common.HeatingType;
import org.openestate.is24.restapi.xml.common.HeatingTypeEnev2014;
import org.openestate.is24.restapi.xml.common.InternetConnectionType;
import org.openestate.is24.restapi.xml.common.ParkingSituationType;
import org.openestate.is24.restapi.xml.common.PetsAllowedType;
import org.openestate.is24.restapi.xml.common.RentScopeType;
import org.openestate.is24.restapi.xml.common.SmokingAllowedType;
import org.openestate.is24.restapi.xml.common.TelephoneConnectionType;
import org.openestate.is24.restapi.xml.common.TvConnectionType;
import org.openestate.is24.restapi.xml.common.YesNoNotApplicableType;
import org.openestate.is24.restapi.xml.common.YesNotApplicableType;


/**
 * Eigenschaften f\u00fcr den Immobilientyp "WG-Zimmer"
 * 
 * <p>Java class for FlatShareRoom complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlatShareRoom"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/realestates/1.0}RealEstate"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}ExtendedFlatShareRoomGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlatShareRoom", propOrder = {
    "roomSize",
    "flooringType",
    "numberOfRooms",
    "apartmentType",
    "cellar",
    "heatingType",
    "heatingTypeEnev2014",
    "barrierFree",
    "courtage",
    "energyCertificate",
    "energySourcesEnev2014",
    "buildingEnergyRatingType",
    "thermalCharacteristic",
    "energyConsumptionContainsWarmWater",
    "constructionYear",
    "constructionYearUnknown",
    "baseRent",
    "totalRent",
    "serviceCharge",
    "deposit",
    "heatingCosts",
    "heatingCostsInServiceCharge",
    "calculatedTotalRent",
    "calculatedTotalRentScope",
    "freeFrom",
    "freeUntil",
    "minimumTermOfLease",
    "totalSpace",
    "numberOfMaleFlatMates",
    "numberOfFemaleFlatMates",
    "ageOfFlatMatesFrom",
    "ageOfFlatMatesTo",
    "ageOfRequestedFrom",
    "ageOfRequestedTo",
    "numberOfRequestedFlatMates",
    "floor",
    "numberOfFloors",
    "numberOfBathRooms",
    "balcony",
    "garden",
    "lift",
    "oven",
    "refrigerator",
    "stove",
    "dishwasher",
    "washingMachine",
    "bathHasWc",
    "bathHasShower",
    "bathHasTub",
    "guestToilet",
    "petsAllowed",
    "internetConnection",
    "smokingAllowed",
    "requestedGender",
    "furnishing",
    "tvConnection",
    "telephoneConnection",
    "parkingSituation",
    "flatShareSize"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
public class FlatShareRoom
    extends RealEstate
    implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal roomSize;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected FlooringType flooringType;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal numberOfRooms;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected ApartmentType apartmentType;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected YesNotApplicableType cellar;
    @XmlSchemaType(name = "string")
    @Deprecated
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected HeatingType heatingType;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected HeatingTypeEnev2014 heatingTypeEnev2014;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected YesNotApplicableType barrierFree;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected CourtageInfo courtage;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected EnergyPerformanceCertificate energyCertificate;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected EnergySourcesEnev2014 energySourcesEnev2014;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected BuildingEnergyRatingType buildingEnergyRatingType;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.realestates.Adapter1 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal thermalCharacteristic;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected YesNotApplicableType energyConsumptionContainsWarmWater;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.realestates.Adapter2 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Integer constructionYear;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean constructionYearUnknown;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal baseRent;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal totalRent;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal serviceCharge;
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.common.Adapter2 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected String deposit;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal heatingCosts;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected YesNoNotApplicableType heatingCostsInServiceCharge;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal calculatedTotalRent;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected RentScopeType calculatedTotalRentScope;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.Adapter3 .class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Calendar freeFrom;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.Adapter3 .class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Calendar freeUntil;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Long minimumTermOfLease;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal totalSpace;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Long numberOfMaleFlatMates;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Long numberOfFemaleFlatMates;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Long ageOfFlatMatesFrom;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Long ageOfFlatMatesTo;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Long ageOfRequestedFrom;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Long ageOfRequestedTo;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Long numberOfRequestedFlatMates;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.realestates.Adapter3 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Integer floor;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Long numberOfFloors;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Long numberOfBathRooms;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected YesNotApplicableType balcony;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected YesNotApplicableType garden;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected YesNotApplicableType lift;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected YesNotApplicableType oven;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected YesNotApplicableType refrigerator;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected YesNotApplicableType stove;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected YesNotApplicableType dishwasher;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected YesNotApplicableType washingMachine;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected YesNotApplicableType bathHasWc;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected YesNotApplicableType bathHasShower;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected YesNotApplicableType bathHasTub;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected YesNotApplicableType guestToilet;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected PetsAllowedType petsAllowed;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected InternetConnectionType internetConnection;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected SmokingAllowedType smokingAllowed;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected FlatMateGenderType requestedGender;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected YesNoNotApplicableType furnishing;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected TvConnectionType tvConnection;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected TelephoneConnectionType telephoneConnection;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected ParkingSituationType parkingSituation;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Integer flatShareSize;

    /**
     * Gets the value of the roomSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public BigDecimal getRoomSize() {
        return roomSize;
    }

    /**
     * Sets the value of the roomSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setRoomSize(BigDecimal value) {
        this.roomSize = value;
    }

    /**
     * Gets the value of the flooringType property.
     * 
     * @return
     *     possible object is
     *     {@link FlooringType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public FlooringType getFlooringType() {
        return flooringType;
    }

    /**
     * Sets the value of the flooringType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlooringType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setFlooringType(FlooringType value) {
        this.flooringType = value;
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
     * Gets the value of the apartmentType property.
     * 
     * @return
     *     possible object is
     *     {@link ApartmentType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setApartmentType(ApartmentType value) {
        this.apartmentType = value;
    }

    /**
     * Gets the value of the cellar property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setCellar(YesNotApplicableType value) {
        this.cellar = value;
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
     * Gets the value of the barrierFree property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public YesNotApplicableType getBarrierFree() {
        return barrierFree;
    }

    /**
     * Sets the value of the barrierFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setBarrierFree(YesNotApplicableType value) {
        this.barrierFree = value;
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
     * Gets the value of the constructionYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
     * Gets the value of the totalRent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
     * Gets the value of the heatingCosts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setHeatingCostsInServiceCharge(YesNoNotApplicableType value) {
        this.heatingCostsInServiceCharge = value;
    }

    /**
     * Gets the value of the calculatedTotalRent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public BigDecimal getCalculatedTotalRent() {
        return calculatedTotalRent;
    }

    /**
     * Sets the value of the calculatedTotalRent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setCalculatedTotalRent(BigDecimal value) {
        this.calculatedTotalRent = value;
    }

    /**
     * Gets the value of the calculatedTotalRentScope property.
     * 
     * @return
     *     possible object is
     *     {@link RentScopeType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public RentScopeType getCalculatedTotalRentScope() {
        return calculatedTotalRentScope;
    }

    /**
     * Sets the value of the calculatedTotalRentScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link RentScopeType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setCalculatedTotalRentScope(RentScopeType value) {
        this.calculatedTotalRentScope = value;
    }

    /**
     * Gets the value of the freeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Calendar getFreeFrom() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setFreeFrom(Calendar value) {
        this.freeFrom = value;
    }

    /**
     * Gets the value of the freeUntil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Calendar getFreeUntil() {
        return freeUntil;
    }

    /**
     * Sets the value of the freeUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setFreeUntil(Calendar value) {
        this.freeUntil = value;
    }

    /**
     * Gets the value of the minimumTermOfLease property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Long getMinimumTermOfLease() {
        return minimumTermOfLease;
    }

    /**
     * Sets the value of the minimumTermOfLease property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setMinimumTermOfLease(Long value) {
        this.minimumTermOfLease = value;
    }

    /**
     * Gets the value of the totalSpace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public BigDecimal getTotalSpace() {
        return totalSpace;
    }

    /**
     * Sets the value of the totalSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setTotalSpace(BigDecimal value) {
        this.totalSpace = value;
    }

    /**
     * Gets the value of the numberOfMaleFlatMates property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Long getNumberOfMaleFlatMates() {
        return numberOfMaleFlatMates;
    }

    /**
     * Sets the value of the numberOfMaleFlatMates property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setNumberOfMaleFlatMates(Long value) {
        this.numberOfMaleFlatMates = value;
    }

    /**
     * Gets the value of the numberOfFemaleFlatMates property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Long getNumberOfFemaleFlatMates() {
        return numberOfFemaleFlatMates;
    }

    /**
     * Sets the value of the numberOfFemaleFlatMates property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setNumberOfFemaleFlatMates(Long value) {
        this.numberOfFemaleFlatMates = value;
    }

    /**
     * Gets the value of the ageOfFlatMatesFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Long getAgeOfFlatMatesFrom() {
        return ageOfFlatMatesFrom;
    }

    /**
     * Sets the value of the ageOfFlatMatesFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setAgeOfFlatMatesFrom(Long value) {
        this.ageOfFlatMatesFrom = value;
    }

    /**
     * Gets the value of the ageOfFlatMatesTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Long getAgeOfFlatMatesTo() {
        return ageOfFlatMatesTo;
    }

    /**
     * Sets the value of the ageOfFlatMatesTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setAgeOfFlatMatesTo(Long value) {
        this.ageOfFlatMatesTo = value;
    }

    /**
     * Gets the value of the ageOfRequestedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Long getAgeOfRequestedFrom() {
        return ageOfRequestedFrom;
    }

    /**
     * Sets the value of the ageOfRequestedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setAgeOfRequestedFrom(Long value) {
        this.ageOfRequestedFrom = value;
    }

    /**
     * Gets the value of the ageOfRequestedTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Long getAgeOfRequestedTo() {
        return ageOfRequestedTo;
    }

    /**
     * Sets the value of the ageOfRequestedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setAgeOfRequestedTo(Long value) {
        this.ageOfRequestedTo = value;
    }

    /**
     * Gets the value of the numberOfRequestedFlatMates property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Long getNumberOfRequestedFlatMates() {
        return numberOfRequestedFlatMates;
    }

    /**
     * Sets the value of the numberOfRequestedFlatMates property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setNumberOfRequestedFlatMates(Long value) {
        this.numberOfRequestedFlatMates = value;
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setFloor(Integer value) {
        this.floor = value;
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
     * Gets the value of the numberOfBathRooms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Long getNumberOfBathRooms() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setNumberOfBathRooms(Long value) {
        this.numberOfBathRooms = value;
    }

    /**
     * Gets the value of the balcony property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public YesNotApplicableType getBalcony() {
        return balcony;
    }

    /**
     * Sets the value of the balcony property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setBalcony(YesNotApplicableType value) {
        this.balcony = value;
    }

    /**
     * Gets the value of the garden property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public YesNotApplicableType getGarden() {
        return garden;
    }

    /**
     * Sets the value of the garden property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setGarden(YesNotApplicableType value) {
        this.garden = value;
    }

    /**
     * Gets the value of the lift property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public YesNotApplicableType getLift() {
        return lift;
    }

    /**
     * Sets the value of the lift property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setLift(YesNotApplicableType value) {
        this.lift = value;
    }

    /**
     * Gets the value of the oven property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public YesNotApplicableType getOven() {
        return oven;
    }

    /**
     * Sets the value of the oven property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setOven(YesNotApplicableType value) {
        this.oven = value;
    }

    /**
     * Gets the value of the refrigerator property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public YesNotApplicableType getRefrigerator() {
        return refrigerator;
    }

    /**
     * Sets the value of the refrigerator property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setRefrigerator(YesNotApplicableType value) {
        this.refrigerator = value;
    }

    /**
     * Gets the value of the stove property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public YesNotApplicableType getStove() {
        return stove;
    }

    /**
     * Sets the value of the stove property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setStove(YesNotApplicableType value) {
        this.stove = value;
    }

    /**
     * Gets the value of the dishwasher property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public YesNotApplicableType getDishwasher() {
        return dishwasher;
    }

    /**
     * Sets the value of the dishwasher property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setDishwasher(YesNotApplicableType value) {
        this.dishwasher = value;
    }

    /**
     * Gets the value of the washingMachine property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public YesNotApplicableType getWashingMachine() {
        return washingMachine;
    }

    /**
     * Sets the value of the washingMachine property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setWashingMachine(YesNotApplicableType value) {
        this.washingMachine = value;
    }

    /**
     * Gets the value of the bathHasWc property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public YesNotApplicableType getBathHasWc() {
        return bathHasWc;
    }

    /**
     * Sets the value of the bathHasWc property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setBathHasWc(YesNotApplicableType value) {
        this.bathHasWc = value;
    }

    /**
     * Gets the value of the bathHasShower property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public YesNotApplicableType getBathHasShower() {
        return bathHasShower;
    }

    /**
     * Sets the value of the bathHasShower property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setBathHasShower(YesNotApplicableType value) {
        this.bathHasShower = value;
    }

    /**
     * Gets the value of the bathHasTub property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public YesNotApplicableType getBathHasTub() {
        return bathHasTub;
    }

    /**
     * Sets the value of the bathHasTub property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setBathHasTub(YesNotApplicableType value) {
        this.bathHasTub = value;
    }

    /**
     * Gets the value of the guestToilet property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setGuestToilet(YesNotApplicableType value) {
        this.guestToilet = value;
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
     * Gets the value of the internetConnection property.
     * 
     * @return
     *     possible object is
     *     {@link InternetConnectionType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public InternetConnectionType getInternetConnection() {
        return internetConnection;
    }

    /**
     * Sets the value of the internetConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternetConnectionType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setInternetConnection(InternetConnectionType value) {
        this.internetConnection = value;
    }

    /**
     * Gets the value of the smokingAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link SmokingAllowedType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public SmokingAllowedType getSmokingAllowed() {
        return smokingAllowed;
    }

    /**
     * Sets the value of the smokingAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmokingAllowedType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setSmokingAllowed(SmokingAllowedType value) {
        this.smokingAllowed = value;
    }

    /**
     * Gets the value of the requestedGender property.
     * 
     * @return
     *     possible object is
     *     {@link FlatMateGenderType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public FlatMateGenderType getRequestedGender() {
        return requestedGender;
    }

    /**
     * Sets the value of the requestedGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlatMateGenderType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setRequestedGender(FlatMateGenderType value) {
        this.requestedGender = value;
    }

    /**
     * Gets the value of the furnishing property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public YesNoNotApplicableType getFurnishing() {
        return furnishing;
    }

    /**
     * Sets the value of the furnishing property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setFurnishing(YesNoNotApplicableType value) {
        this.furnishing = value;
    }

    /**
     * Gets the value of the tvConnection property.
     * 
     * @return
     *     possible object is
     *     {@link TvConnectionType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public TvConnectionType getTvConnection() {
        return tvConnection;
    }

    /**
     * Sets the value of the tvConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TvConnectionType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setTvConnection(TvConnectionType value) {
        this.tvConnection = value;
    }

    /**
     * Gets the value of the telephoneConnection property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneConnectionType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public TelephoneConnectionType getTelephoneConnection() {
        return telephoneConnection;
    }

    /**
     * Sets the value of the telephoneConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneConnectionType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setTelephoneConnection(TelephoneConnectionType value) {
        this.telephoneConnection = value;
    }

    /**
     * Gets the value of the parkingSituation property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingSituationType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public ParkingSituationType getParkingSituation() {
        return parkingSituation;
    }

    /**
     * Sets the value of the parkingSituation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingSituationType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setParkingSituation(ParkingSituationType value) {
        this.parkingSituation = value;
    }

    /**
     * Gets the value of the flatShareSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Integer getFlatShareSize() {
        return flatShareSize;
    }

    /**
     * Sets the value of the flatShareSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setFlatShareSize(Integer value) {
        this.flatShareSize = value;
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
            BigDecimal theRoomSize;
            theRoomSize = this.getRoomSize();
            strategy.appendField(locator, this, "roomSize", buffer, theRoomSize, (this.roomSize!= null));
        }
        {
            FlooringType theFlooringType;
            theFlooringType = this.getFlooringType();
            strategy.appendField(locator, this, "flooringType", buffer, theFlooringType, (this.flooringType!= null));
        }
        {
            BigDecimal theNumberOfRooms;
            theNumberOfRooms = this.getNumberOfRooms();
            strategy.appendField(locator, this, "numberOfRooms", buffer, theNumberOfRooms, (this.numberOfRooms!= null));
        }
        {
            ApartmentType theApartmentType;
            theApartmentType = this.getApartmentType();
            strategy.appendField(locator, this, "apartmentType", buffer, theApartmentType, (this.apartmentType!= null));
        }
        {
            YesNotApplicableType theCellar;
            theCellar = this.getCellar();
            strategy.appendField(locator, this, "cellar", buffer, theCellar, (this.cellar!= null));
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
            YesNotApplicableType theBarrierFree;
            theBarrierFree = this.getBarrierFree();
            strategy.appendField(locator, this, "barrierFree", buffer, theBarrierFree, (this.barrierFree!= null));
        }
        {
            CourtageInfo theCourtage;
            theCourtage = this.getCourtage();
            strategy.appendField(locator, this, "courtage", buffer, theCourtage, (this.courtage!= null));
        }
        {
            EnergyPerformanceCertificate theEnergyCertificate;
            theEnergyCertificate = this.getEnergyCertificate();
            strategy.appendField(locator, this, "energyCertificate", buffer, theEnergyCertificate, (this.energyCertificate!= null));
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
            Integer theConstructionYear;
            theConstructionYear = this.getConstructionYear();
            strategy.appendField(locator, this, "constructionYear", buffer, theConstructionYear, (this.constructionYear!= null));
        }
        {
            Boolean theConstructionYearUnknown;
            theConstructionYearUnknown = this.getConstructionYearUnknown();
            strategy.appendField(locator, this, "constructionYearUnknown", buffer, theConstructionYearUnknown, (this.constructionYearUnknown!= null));
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
            BigDecimal theCalculatedTotalRent;
            theCalculatedTotalRent = this.getCalculatedTotalRent();
            strategy.appendField(locator, this, "calculatedTotalRent", buffer, theCalculatedTotalRent, (this.calculatedTotalRent!= null));
        }
        {
            RentScopeType theCalculatedTotalRentScope;
            theCalculatedTotalRentScope = this.getCalculatedTotalRentScope();
            strategy.appendField(locator, this, "calculatedTotalRentScope", buffer, theCalculatedTotalRentScope, (this.calculatedTotalRentScope!= null));
        }
        {
            Calendar theFreeFrom;
            theFreeFrom = this.getFreeFrom();
            strategy.appendField(locator, this, "freeFrom", buffer, theFreeFrom, (this.freeFrom!= null));
        }
        {
            Calendar theFreeUntil;
            theFreeUntil = this.getFreeUntil();
            strategy.appendField(locator, this, "freeUntil", buffer, theFreeUntil, (this.freeUntil!= null));
        }
        {
            Long theMinimumTermOfLease;
            theMinimumTermOfLease = this.getMinimumTermOfLease();
            strategy.appendField(locator, this, "minimumTermOfLease", buffer, theMinimumTermOfLease, (this.minimumTermOfLease!= null));
        }
        {
            BigDecimal theTotalSpace;
            theTotalSpace = this.getTotalSpace();
            strategy.appendField(locator, this, "totalSpace", buffer, theTotalSpace, (this.totalSpace!= null));
        }
        {
            Long theNumberOfMaleFlatMates;
            theNumberOfMaleFlatMates = this.getNumberOfMaleFlatMates();
            strategy.appendField(locator, this, "numberOfMaleFlatMates", buffer, theNumberOfMaleFlatMates, (this.numberOfMaleFlatMates!= null));
        }
        {
            Long theNumberOfFemaleFlatMates;
            theNumberOfFemaleFlatMates = this.getNumberOfFemaleFlatMates();
            strategy.appendField(locator, this, "numberOfFemaleFlatMates", buffer, theNumberOfFemaleFlatMates, (this.numberOfFemaleFlatMates!= null));
        }
        {
            Long theAgeOfFlatMatesFrom;
            theAgeOfFlatMatesFrom = this.getAgeOfFlatMatesFrom();
            strategy.appendField(locator, this, "ageOfFlatMatesFrom", buffer, theAgeOfFlatMatesFrom, (this.ageOfFlatMatesFrom!= null));
        }
        {
            Long theAgeOfFlatMatesTo;
            theAgeOfFlatMatesTo = this.getAgeOfFlatMatesTo();
            strategy.appendField(locator, this, "ageOfFlatMatesTo", buffer, theAgeOfFlatMatesTo, (this.ageOfFlatMatesTo!= null));
        }
        {
            Long theAgeOfRequestedFrom;
            theAgeOfRequestedFrom = this.getAgeOfRequestedFrom();
            strategy.appendField(locator, this, "ageOfRequestedFrom", buffer, theAgeOfRequestedFrom, (this.ageOfRequestedFrom!= null));
        }
        {
            Long theAgeOfRequestedTo;
            theAgeOfRequestedTo = this.getAgeOfRequestedTo();
            strategy.appendField(locator, this, "ageOfRequestedTo", buffer, theAgeOfRequestedTo, (this.ageOfRequestedTo!= null));
        }
        {
            Long theNumberOfRequestedFlatMates;
            theNumberOfRequestedFlatMates = this.getNumberOfRequestedFlatMates();
            strategy.appendField(locator, this, "numberOfRequestedFlatMates", buffer, theNumberOfRequestedFlatMates, (this.numberOfRequestedFlatMates!= null));
        }
        {
            Integer theFloor;
            theFloor = this.getFloor();
            strategy.appendField(locator, this, "floor", buffer, theFloor, (this.floor!= null));
        }
        {
            Long theNumberOfFloors;
            theNumberOfFloors = this.getNumberOfFloors();
            strategy.appendField(locator, this, "numberOfFloors", buffer, theNumberOfFloors, (this.numberOfFloors!= null));
        }
        {
            Long theNumberOfBathRooms;
            theNumberOfBathRooms = this.getNumberOfBathRooms();
            strategy.appendField(locator, this, "numberOfBathRooms", buffer, theNumberOfBathRooms, (this.numberOfBathRooms!= null));
        }
        {
            YesNotApplicableType theBalcony;
            theBalcony = this.getBalcony();
            strategy.appendField(locator, this, "balcony", buffer, theBalcony, (this.balcony!= null));
        }
        {
            YesNotApplicableType theGarden;
            theGarden = this.getGarden();
            strategy.appendField(locator, this, "garden", buffer, theGarden, (this.garden!= null));
        }
        {
            YesNotApplicableType theLift;
            theLift = this.getLift();
            strategy.appendField(locator, this, "lift", buffer, theLift, (this.lift!= null));
        }
        {
            YesNotApplicableType theOven;
            theOven = this.getOven();
            strategy.appendField(locator, this, "oven", buffer, theOven, (this.oven!= null));
        }
        {
            YesNotApplicableType theRefrigerator;
            theRefrigerator = this.getRefrigerator();
            strategy.appendField(locator, this, "refrigerator", buffer, theRefrigerator, (this.refrigerator!= null));
        }
        {
            YesNotApplicableType theStove;
            theStove = this.getStove();
            strategy.appendField(locator, this, "stove", buffer, theStove, (this.stove!= null));
        }
        {
            YesNotApplicableType theDishwasher;
            theDishwasher = this.getDishwasher();
            strategy.appendField(locator, this, "dishwasher", buffer, theDishwasher, (this.dishwasher!= null));
        }
        {
            YesNotApplicableType theWashingMachine;
            theWashingMachine = this.getWashingMachine();
            strategy.appendField(locator, this, "washingMachine", buffer, theWashingMachine, (this.washingMachine!= null));
        }
        {
            YesNotApplicableType theBathHasWc;
            theBathHasWc = this.getBathHasWc();
            strategy.appendField(locator, this, "bathHasWc", buffer, theBathHasWc, (this.bathHasWc!= null));
        }
        {
            YesNotApplicableType theBathHasShower;
            theBathHasShower = this.getBathHasShower();
            strategy.appendField(locator, this, "bathHasShower", buffer, theBathHasShower, (this.bathHasShower!= null));
        }
        {
            YesNotApplicableType theBathHasTub;
            theBathHasTub = this.getBathHasTub();
            strategy.appendField(locator, this, "bathHasTub", buffer, theBathHasTub, (this.bathHasTub!= null));
        }
        {
            YesNotApplicableType theGuestToilet;
            theGuestToilet = this.getGuestToilet();
            strategy.appendField(locator, this, "guestToilet", buffer, theGuestToilet, (this.guestToilet!= null));
        }
        {
            PetsAllowedType thePetsAllowed;
            thePetsAllowed = this.getPetsAllowed();
            strategy.appendField(locator, this, "petsAllowed", buffer, thePetsAllowed, (this.petsAllowed!= null));
        }
        {
            InternetConnectionType theInternetConnection;
            theInternetConnection = this.getInternetConnection();
            strategy.appendField(locator, this, "internetConnection", buffer, theInternetConnection, (this.internetConnection!= null));
        }
        {
            SmokingAllowedType theSmokingAllowed;
            theSmokingAllowed = this.getSmokingAllowed();
            strategy.appendField(locator, this, "smokingAllowed", buffer, theSmokingAllowed, (this.smokingAllowed!= null));
        }
        {
            FlatMateGenderType theRequestedGender;
            theRequestedGender = this.getRequestedGender();
            strategy.appendField(locator, this, "requestedGender", buffer, theRequestedGender, (this.requestedGender!= null));
        }
        {
            YesNoNotApplicableType theFurnishing;
            theFurnishing = this.getFurnishing();
            strategy.appendField(locator, this, "furnishing", buffer, theFurnishing, (this.furnishing!= null));
        }
        {
            TvConnectionType theTvConnection;
            theTvConnection = this.getTvConnection();
            strategy.appendField(locator, this, "tvConnection", buffer, theTvConnection, (this.tvConnection!= null));
        }
        {
            TelephoneConnectionType theTelephoneConnection;
            theTelephoneConnection = this.getTelephoneConnection();
            strategy.appendField(locator, this, "telephoneConnection", buffer, theTelephoneConnection, (this.telephoneConnection!= null));
        }
        {
            ParkingSituationType theParkingSituation;
            theParkingSituation = this.getParkingSituation();
            strategy.appendField(locator, this, "parkingSituation", buffer, theParkingSituation, (this.parkingSituation!= null));
        }
        {
            Integer theFlatShareSize;
            theFlatShareSize = this.getFlatShareSize();
            strategy.appendField(locator, this, "flatShareSize", buffer, theFlatShareSize, (this.flatShareSize!= null));
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
        if (draftCopy instanceof FlatShareRoom) {
            final FlatShareRoom copy = ((FlatShareRoom) draftCopy);
            {
                Boolean roomSizeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.roomSize!= null));
                if (roomSizeShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceRoomSize;
                    sourceRoomSize = this.getRoomSize();
                    BigDecimal copyRoomSize = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "roomSize", sourceRoomSize), sourceRoomSize, (this.roomSize!= null)));
                    copy.setRoomSize(copyRoomSize);
                } else {
                    if (roomSizeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.roomSize = null;
                    }
                }
            }
            {
                Boolean flooringTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.flooringType!= null));
                if (flooringTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    FlooringType sourceFlooringType;
                    sourceFlooringType = this.getFlooringType();
                    FlooringType copyFlooringType = ((FlooringType) strategy.copy(LocatorUtils.property(locator, "flooringType", sourceFlooringType), sourceFlooringType, (this.flooringType!= null)));
                    copy.setFlooringType(copyFlooringType);
                } else {
                    if (flooringTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.flooringType = null;
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
                Boolean barrierFreeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.barrierFree!= null));
                if (barrierFreeShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceBarrierFree;
                    sourceBarrierFree = this.getBarrierFree();
                    YesNotApplicableType copyBarrierFree = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "barrierFree", sourceBarrierFree), sourceBarrierFree, (this.barrierFree!= null)));
                    copy.setBarrierFree(copyBarrierFree);
                } else {
                    if (barrierFreeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.barrierFree = null;
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
                Boolean calculatedTotalRentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.calculatedTotalRent!= null));
                if (calculatedTotalRentShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceCalculatedTotalRent;
                    sourceCalculatedTotalRent = this.getCalculatedTotalRent();
                    BigDecimal copyCalculatedTotalRent = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "calculatedTotalRent", sourceCalculatedTotalRent), sourceCalculatedTotalRent, (this.calculatedTotalRent!= null)));
                    copy.setCalculatedTotalRent(copyCalculatedTotalRent);
                } else {
                    if (calculatedTotalRentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.calculatedTotalRent = null;
                    }
                }
            }
            {
                Boolean calculatedTotalRentScopeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.calculatedTotalRentScope!= null));
                if (calculatedTotalRentScopeShouldBeCopiedAndSet == Boolean.TRUE) {
                    RentScopeType sourceCalculatedTotalRentScope;
                    sourceCalculatedTotalRentScope = this.getCalculatedTotalRentScope();
                    RentScopeType copyCalculatedTotalRentScope = ((RentScopeType) strategy.copy(LocatorUtils.property(locator, "calculatedTotalRentScope", sourceCalculatedTotalRentScope), sourceCalculatedTotalRentScope, (this.calculatedTotalRentScope!= null)));
                    copy.setCalculatedTotalRentScope(copyCalculatedTotalRentScope);
                } else {
                    if (calculatedTotalRentScopeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.calculatedTotalRentScope = null;
                    }
                }
            }
            {
                Boolean freeFromShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.freeFrom!= null));
                if (freeFromShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceFreeFrom;
                    sourceFreeFrom = this.getFreeFrom();
                    Calendar copyFreeFrom = ((Calendar) strategy.copy(LocatorUtils.property(locator, "freeFrom", sourceFreeFrom), sourceFreeFrom, (this.freeFrom!= null)));
                    copy.setFreeFrom(copyFreeFrom);
                } else {
                    if (freeFromShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.freeFrom = null;
                    }
                }
            }
            {
                Boolean freeUntilShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.freeUntil!= null));
                if (freeUntilShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceFreeUntil;
                    sourceFreeUntil = this.getFreeUntil();
                    Calendar copyFreeUntil = ((Calendar) strategy.copy(LocatorUtils.property(locator, "freeUntil", sourceFreeUntil), sourceFreeUntil, (this.freeUntil!= null)));
                    copy.setFreeUntil(copyFreeUntil);
                } else {
                    if (freeUntilShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.freeUntil = null;
                    }
                }
            }
            {
                Boolean minimumTermOfLeaseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.minimumTermOfLease!= null));
                if (minimumTermOfLeaseShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceMinimumTermOfLease;
                    sourceMinimumTermOfLease = this.getMinimumTermOfLease();
                    Long copyMinimumTermOfLease = ((Long) strategy.copy(LocatorUtils.property(locator, "minimumTermOfLease", sourceMinimumTermOfLease), sourceMinimumTermOfLease, (this.minimumTermOfLease!= null)));
                    copy.setMinimumTermOfLease(copyMinimumTermOfLease);
                } else {
                    if (minimumTermOfLeaseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.minimumTermOfLease = null;
                    }
                }
            }
            {
                Boolean totalSpaceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.totalSpace!= null));
                if (totalSpaceShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceTotalSpace;
                    sourceTotalSpace = this.getTotalSpace();
                    BigDecimal copyTotalSpace = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "totalSpace", sourceTotalSpace), sourceTotalSpace, (this.totalSpace!= null)));
                    copy.setTotalSpace(copyTotalSpace);
                } else {
                    if (totalSpaceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.totalSpace = null;
                    }
                }
            }
            {
                Boolean numberOfMaleFlatMatesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfMaleFlatMates!= null));
                if (numberOfMaleFlatMatesShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceNumberOfMaleFlatMates;
                    sourceNumberOfMaleFlatMates = this.getNumberOfMaleFlatMates();
                    Long copyNumberOfMaleFlatMates = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfMaleFlatMates", sourceNumberOfMaleFlatMates), sourceNumberOfMaleFlatMates, (this.numberOfMaleFlatMates!= null)));
                    copy.setNumberOfMaleFlatMates(copyNumberOfMaleFlatMates);
                } else {
                    if (numberOfMaleFlatMatesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfMaleFlatMates = null;
                    }
                }
            }
            {
                Boolean numberOfFemaleFlatMatesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfFemaleFlatMates!= null));
                if (numberOfFemaleFlatMatesShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceNumberOfFemaleFlatMates;
                    sourceNumberOfFemaleFlatMates = this.getNumberOfFemaleFlatMates();
                    Long copyNumberOfFemaleFlatMates = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfFemaleFlatMates", sourceNumberOfFemaleFlatMates), sourceNumberOfFemaleFlatMates, (this.numberOfFemaleFlatMates!= null)));
                    copy.setNumberOfFemaleFlatMates(copyNumberOfFemaleFlatMates);
                } else {
                    if (numberOfFemaleFlatMatesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfFemaleFlatMates = null;
                    }
                }
            }
            {
                Boolean ageOfFlatMatesFromShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ageOfFlatMatesFrom!= null));
                if (ageOfFlatMatesFromShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceAgeOfFlatMatesFrom;
                    sourceAgeOfFlatMatesFrom = this.getAgeOfFlatMatesFrom();
                    Long copyAgeOfFlatMatesFrom = ((Long) strategy.copy(LocatorUtils.property(locator, "ageOfFlatMatesFrom", sourceAgeOfFlatMatesFrom), sourceAgeOfFlatMatesFrom, (this.ageOfFlatMatesFrom!= null)));
                    copy.setAgeOfFlatMatesFrom(copyAgeOfFlatMatesFrom);
                } else {
                    if (ageOfFlatMatesFromShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ageOfFlatMatesFrom = null;
                    }
                }
            }
            {
                Boolean ageOfFlatMatesToShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ageOfFlatMatesTo!= null));
                if (ageOfFlatMatesToShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceAgeOfFlatMatesTo;
                    sourceAgeOfFlatMatesTo = this.getAgeOfFlatMatesTo();
                    Long copyAgeOfFlatMatesTo = ((Long) strategy.copy(LocatorUtils.property(locator, "ageOfFlatMatesTo", sourceAgeOfFlatMatesTo), sourceAgeOfFlatMatesTo, (this.ageOfFlatMatesTo!= null)));
                    copy.setAgeOfFlatMatesTo(copyAgeOfFlatMatesTo);
                } else {
                    if (ageOfFlatMatesToShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ageOfFlatMatesTo = null;
                    }
                }
            }
            {
                Boolean ageOfRequestedFromShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ageOfRequestedFrom!= null));
                if (ageOfRequestedFromShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceAgeOfRequestedFrom;
                    sourceAgeOfRequestedFrom = this.getAgeOfRequestedFrom();
                    Long copyAgeOfRequestedFrom = ((Long) strategy.copy(LocatorUtils.property(locator, "ageOfRequestedFrom", sourceAgeOfRequestedFrom), sourceAgeOfRequestedFrom, (this.ageOfRequestedFrom!= null)));
                    copy.setAgeOfRequestedFrom(copyAgeOfRequestedFrom);
                } else {
                    if (ageOfRequestedFromShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ageOfRequestedFrom = null;
                    }
                }
            }
            {
                Boolean ageOfRequestedToShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ageOfRequestedTo!= null));
                if (ageOfRequestedToShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceAgeOfRequestedTo;
                    sourceAgeOfRequestedTo = this.getAgeOfRequestedTo();
                    Long copyAgeOfRequestedTo = ((Long) strategy.copy(LocatorUtils.property(locator, "ageOfRequestedTo", sourceAgeOfRequestedTo), sourceAgeOfRequestedTo, (this.ageOfRequestedTo!= null)));
                    copy.setAgeOfRequestedTo(copyAgeOfRequestedTo);
                } else {
                    if (ageOfRequestedToShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ageOfRequestedTo = null;
                    }
                }
            }
            {
                Boolean numberOfRequestedFlatMatesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfRequestedFlatMates!= null));
                if (numberOfRequestedFlatMatesShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceNumberOfRequestedFlatMates;
                    sourceNumberOfRequestedFlatMates = this.getNumberOfRequestedFlatMates();
                    Long copyNumberOfRequestedFlatMates = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfRequestedFlatMates", sourceNumberOfRequestedFlatMates), sourceNumberOfRequestedFlatMates, (this.numberOfRequestedFlatMates!= null)));
                    copy.setNumberOfRequestedFlatMates(copyNumberOfRequestedFlatMates);
                } else {
                    if (numberOfRequestedFlatMatesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfRequestedFlatMates = null;
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
                Boolean numberOfBathRoomsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfBathRooms!= null));
                if (numberOfBathRoomsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceNumberOfBathRooms;
                    sourceNumberOfBathRooms = this.getNumberOfBathRooms();
                    Long copyNumberOfBathRooms = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfBathRooms", sourceNumberOfBathRooms), sourceNumberOfBathRooms, (this.numberOfBathRooms!= null)));
                    copy.setNumberOfBathRooms(copyNumberOfBathRooms);
                } else {
                    if (numberOfBathRoomsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfBathRooms = null;
                    }
                }
            }
            {
                Boolean balconyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.balcony!= null));
                if (balconyShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceBalcony;
                    sourceBalcony = this.getBalcony();
                    YesNotApplicableType copyBalcony = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "balcony", sourceBalcony), sourceBalcony, (this.balcony!= null)));
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
                    YesNotApplicableType sourceGarden;
                    sourceGarden = this.getGarden();
                    YesNotApplicableType copyGarden = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "garden", sourceGarden), sourceGarden, (this.garden!= null)));
                    copy.setGarden(copyGarden);
                } else {
                    if (gardenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.garden = null;
                    }
                }
            }
            {
                Boolean liftShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lift!= null));
                if (liftShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceLift;
                    sourceLift = this.getLift();
                    YesNotApplicableType copyLift = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "lift", sourceLift), sourceLift, (this.lift!= null)));
                    copy.setLift(copyLift);
                } else {
                    if (liftShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lift = null;
                    }
                }
            }
            {
                Boolean ovenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.oven!= null));
                if (ovenShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceOven;
                    sourceOven = this.getOven();
                    YesNotApplicableType copyOven = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "oven", sourceOven), sourceOven, (this.oven!= null)));
                    copy.setOven(copyOven);
                } else {
                    if (ovenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.oven = null;
                    }
                }
            }
            {
                Boolean refrigeratorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.refrigerator!= null));
                if (refrigeratorShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceRefrigerator;
                    sourceRefrigerator = this.getRefrigerator();
                    YesNotApplicableType copyRefrigerator = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "refrigerator", sourceRefrigerator), sourceRefrigerator, (this.refrigerator!= null)));
                    copy.setRefrigerator(copyRefrigerator);
                } else {
                    if (refrigeratorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.refrigerator = null;
                    }
                }
            }
            {
                Boolean stoveShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.stove!= null));
                if (stoveShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceStove;
                    sourceStove = this.getStove();
                    YesNotApplicableType copyStove = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "stove", sourceStove), sourceStove, (this.stove!= null)));
                    copy.setStove(copyStove);
                } else {
                    if (stoveShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stove = null;
                    }
                }
            }
            {
                Boolean dishwasherShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dishwasher!= null));
                if (dishwasherShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceDishwasher;
                    sourceDishwasher = this.getDishwasher();
                    YesNotApplicableType copyDishwasher = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "dishwasher", sourceDishwasher), sourceDishwasher, (this.dishwasher!= null)));
                    copy.setDishwasher(copyDishwasher);
                } else {
                    if (dishwasherShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dishwasher = null;
                    }
                }
            }
            {
                Boolean washingMachineShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.washingMachine!= null));
                if (washingMachineShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceWashingMachine;
                    sourceWashingMachine = this.getWashingMachine();
                    YesNotApplicableType copyWashingMachine = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "washingMachine", sourceWashingMachine), sourceWashingMachine, (this.washingMachine!= null)));
                    copy.setWashingMachine(copyWashingMachine);
                } else {
                    if (washingMachineShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.washingMachine = null;
                    }
                }
            }
            {
                Boolean bathHasWcShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bathHasWc!= null));
                if (bathHasWcShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceBathHasWc;
                    sourceBathHasWc = this.getBathHasWc();
                    YesNotApplicableType copyBathHasWc = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "bathHasWc", sourceBathHasWc), sourceBathHasWc, (this.bathHasWc!= null)));
                    copy.setBathHasWc(copyBathHasWc);
                } else {
                    if (bathHasWcShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bathHasWc = null;
                    }
                }
            }
            {
                Boolean bathHasShowerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bathHasShower!= null));
                if (bathHasShowerShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceBathHasShower;
                    sourceBathHasShower = this.getBathHasShower();
                    YesNotApplicableType copyBathHasShower = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "bathHasShower", sourceBathHasShower), sourceBathHasShower, (this.bathHasShower!= null)));
                    copy.setBathHasShower(copyBathHasShower);
                } else {
                    if (bathHasShowerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bathHasShower = null;
                    }
                }
            }
            {
                Boolean bathHasTubShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bathHasTub!= null));
                if (bathHasTubShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceBathHasTub;
                    sourceBathHasTub = this.getBathHasTub();
                    YesNotApplicableType copyBathHasTub = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "bathHasTub", sourceBathHasTub), sourceBathHasTub, (this.bathHasTub!= null)));
                    copy.setBathHasTub(copyBathHasTub);
                } else {
                    if (bathHasTubShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bathHasTub = null;
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
                Boolean internetConnectionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.internetConnection!= null));
                if (internetConnectionShouldBeCopiedAndSet == Boolean.TRUE) {
                    InternetConnectionType sourceInternetConnection;
                    sourceInternetConnection = this.getInternetConnection();
                    InternetConnectionType copyInternetConnection = ((InternetConnectionType) strategy.copy(LocatorUtils.property(locator, "internetConnection", sourceInternetConnection), sourceInternetConnection, (this.internetConnection!= null)));
                    copy.setInternetConnection(copyInternetConnection);
                } else {
                    if (internetConnectionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.internetConnection = null;
                    }
                }
            }
            {
                Boolean smokingAllowedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.smokingAllowed!= null));
                if (smokingAllowedShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmokingAllowedType sourceSmokingAllowed;
                    sourceSmokingAllowed = this.getSmokingAllowed();
                    SmokingAllowedType copySmokingAllowed = ((SmokingAllowedType) strategy.copy(LocatorUtils.property(locator, "smokingAllowed", sourceSmokingAllowed), sourceSmokingAllowed, (this.smokingAllowed!= null)));
                    copy.setSmokingAllowed(copySmokingAllowed);
                } else {
                    if (smokingAllowedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.smokingAllowed = null;
                    }
                }
            }
            {
                Boolean requestedGenderShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.requestedGender!= null));
                if (requestedGenderShouldBeCopiedAndSet == Boolean.TRUE) {
                    FlatMateGenderType sourceRequestedGender;
                    sourceRequestedGender = this.getRequestedGender();
                    FlatMateGenderType copyRequestedGender = ((FlatMateGenderType) strategy.copy(LocatorUtils.property(locator, "requestedGender", sourceRequestedGender), sourceRequestedGender, (this.requestedGender!= null)));
                    copy.setRequestedGender(copyRequestedGender);
                } else {
                    if (requestedGenderShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.requestedGender = null;
                    }
                }
            }
            {
                Boolean furnishingShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.furnishing!= null));
                if (furnishingShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNoNotApplicableType sourceFurnishing;
                    sourceFurnishing = this.getFurnishing();
                    YesNoNotApplicableType copyFurnishing = ((YesNoNotApplicableType) strategy.copy(LocatorUtils.property(locator, "furnishing", sourceFurnishing), sourceFurnishing, (this.furnishing!= null)));
                    copy.setFurnishing(copyFurnishing);
                } else {
                    if (furnishingShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.furnishing = null;
                    }
                }
            }
            {
                Boolean tvConnectionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tvConnection!= null));
                if (tvConnectionShouldBeCopiedAndSet == Boolean.TRUE) {
                    TvConnectionType sourceTvConnection;
                    sourceTvConnection = this.getTvConnection();
                    TvConnectionType copyTvConnection = ((TvConnectionType) strategy.copy(LocatorUtils.property(locator, "tvConnection", sourceTvConnection), sourceTvConnection, (this.tvConnection!= null)));
                    copy.setTvConnection(copyTvConnection);
                } else {
                    if (tvConnectionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tvConnection = null;
                    }
                }
            }
            {
                Boolean telephoneConnectionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.telephoneConnection!= null));
                if (telephoneConnectionShouldBeCopiedAndSet == Boolean.TRUE) {
                    TelephoneConnectionType sourceTelephoneConnection;
                    sourceTelephoneConnection = this.getTelephoneConnection();
                    TelephoneConnectionType copyTelephoneConnection = ((TelephoneConnectionType) strategy.copy(LocatorUtils.property(locator, "telephoneConnection", sourceTelephoneConnection), sourceTelephoneConnection, (this.telephoneConnection!= null)));
                    copy.setTelephoneConnection(copyTelephoneConnection);
                } else {
                    if (telephoneConnectionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.telephoneConnection = null;
                    }
                }
            }
            {
                Boolean parkingSituationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parkingSituation!= null));
                if (parkingSituationShouldBeCopiedAndSet == Boolean.TRUE) {
                    ParkingSituationType sourceParkingSituation;
                    sourceParkingSituation = this.getParkingSituation();
                    ParkingSituationType copyParkingSituation = ((ParkingSituationType) strategy.copy(LocatorUtils.property(locator, "parkingSituation", sourceParkingSituation), sourceParkingSituation, (this.parkingSituation!= null)));
                    copy.setParkingSituation(copyParkingSituation);
                } else {
                    if (parkingSituationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.parkingSituation = null;
                    }
                }
            }
            {
                Boolean flatShareSizeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.flatShareSize!= null));
                if (flatShareSizeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceFlatShareSize;
                    sourceFlatShareSize = this.getFlatShareSize();
                    Integer copyFlatShareSize = ((Integer) strategy.copy(LocatorUtils.property(locator, "flatShareSize", sourceFlatShareSize), sourceFlatShareSize, (this.flatShareSize!= null)));
                    copy.setFlatShareSize(copyFlatShareSize);
                } else {
                    if (flatShareSizeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.flatShareSize = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new FlatShareRoom();
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
        final FlatShareRoom that = ((FlatShareRoom) object);
        {
            BigDecimal lhsRoomSize;
            lhsRoomSize = this.getRoomSize();
            BigDecimal rhsRoomSize;
            rhsRoomSize = that.getRoomSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "roomSize", lhsRoomSize), LocatorUtils.property(thatLocator, "roomSize", rhsRoomSize), lhsRoomSize, rhsRoomSize, (this.roomSize!= null), (that.roomSize!= null))) {
                return false;
            }
        }
        {
            FlooringType lhsFlooringType;
            lhsFlooringType = this.getFlooringType();
            FlooringType rhsFlooringType;
            rhsFlooringType = that.getFlooringType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flooringType", lhsFlooringType), LocatorUtils.property(thatLocator, "flooringType", rhsFlooringType), lhsFlooringType, rhsFlooringType, (this.flooringType!= null), (that.flooringType!= null))) {
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
            ApartmentType lhsApartmentType;
            lhsApartmentType = this.getApartmentType();
            ApartmentType rhsApartmentType;
            rhsApartmentType = that.getApartmentType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "apartmentType", lhsApartmentType), LocatorUtils.property(thatLocator, "apartmentType", rhsApartmentType), lhsApartmentType, rhsApartmentType, (this.apartmentType!= null), (that.apartmentType!= null))) {
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
            YesNotApplicableType lhsBarrierFree;
            lhsBarrierFree = this.getBarrierFree();
            YesNotApplicableType rhsBarrierFree;
            rhsBarrierFree = that.getBarrierFree();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "barrierFree", lhsBarrierFree), LocatorUtils.property(thatLocator, "barrierFree", rhsBarrierFree), lhsBarrierFree, rhsBarrierFree, (this.barrierFree!= null), (that.barrierFree!= null))) {
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
            lhsConstructionYearUnknown = this.getConstructionYearUnknown();
            Boolean rhsConstructionYearUnknown;
            rhsConstructionYearUnknown = that.getConstructionYearUnknown();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "constructionYearUnknown", lhsConstructionYearUnknown), LocatorUtils.property(thatLocator, "constructionYearUnknown", rhsConstructionYearUnknown), lhsConstructionYearUnknown, rhsConstructionYearUnknown, (this.constructionYearUnknown!= null), (that.constructionYearUnknown!= null))) {
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
            BigDecimal lhsCalculatedTotalRent;
            lhsCalculatedTotalRent = this.getCalculatedTotalRent();
            BigDecimal rhsCalculatedTotalRent;
            rhsCalculatedTotalRent = that.getCalculatedTotalRent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "calculatedTotalRent", lhsCalculatedTotalRent), LocatorUtils.property(thatLocator, "calculatedTotalRent", rhsCalculatedTotalRent), lhsCalculatedTotalRent, rhsCalculatedTotalRent, (this.calculatedTotalRent!= null), (that.calculatedTotalRent!= null))) {
                return false;
            }
        }
        {
            RentScopeType lhsCalculatedTotalRentScope;
            lhsCalculatedTotalRentScope = this.getCalculatedTotalRentScope();
            RentScopeType rhsCalculatedTotalRentScope;
            rhsCalculatedTotalRentScope = that.getCalculatedTotalRentScope();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "calculatedTotalRentScope", lhsCalculatedTotalRentScope), LocatorUtils.property(thatLocator, "calculatedTotalRentScope", rhsCalculatedTotalRentScope), lhsCalculatedTotalRentScope, rhsCalculatedTotalRentScope, (this.calculatedTotalRentScope!= null), (that.calculatedTotalRentScope!= null))) {
                return false;
            }
        }
        {
            Calendar lhsFreeFrom;
            lhsFreeFrom = this.getFreeFrom();
            Calendar rhsFreeFrom;
            rhsFreeFrom = that.getFreeFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freeFrom", lhsFreeFrom), LocatorUtils.property(thatLocator, "freeFrom", rhsFreeFrom), lhsFreeFrom, rhsFreeFrom, (this.freeFrom!= null), (that.freeFrom!= null))) {
                return false;
            }
        }
        {
            Calendar lhsFreeUntil;
            lhsFreeUntil = this.getFreeUntil();
            Calendar rhsFreeUntil;
            rhsFreeUntil = that.getFreeUntil();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freeUntil", lhsFreeUntil), LocatorUtils.property(thatLocator, "freeUntil", rhsFreeUntil), lhsFreeUntil, rhsFreeUntil, (this.freeUntil!= null), (that.freeUntil!= null))) {
                return false;
            }
        }
        {
            Long lhsMinimumTermOfLease;
            lhsMinimumTermOfLease = this.getMinimumTermOfLease();
            Long rhsMinimumTermOfLease;
            rhsMinimumTermOfLease = that.getMinimumTermOfLease();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumTermOfLease", lhsMinimumTermOfLease), LocatorUtils.property(thatLocator, "minimumTermOfLease", rhsMinimumTermOfLease), lhsMinimumTermOfLease, rhsMinimumTermOfLease, (this.minimumTermOfLease!= null), (that.minimumTermOfLease!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsTotalSpace;
            lhsTotalSpace = this.getTotalSpace();
            BigDecimal rhsTotalSpace;
            rhsTotalSpace = that.getTotalSpace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalSpace", lhsTotalSpace), LocatorUtils.property(thatLocator, "totalSpace", rhsTotalSpace), lhsTotalSpace, rhsTotalSpace, (this.totalSpace!= null), (that.totalSpace!= null))) {
                return false;
            }
        }
        {
            Long lhsNumberOfMaleFlatMates;
            lhsNumberOfMaleFlatMates = this.getNumberOfMaleFlatMates();
            Long rhsNumberOfMaleFlatMates;
            rhsNumberOfMaleFlatMates = that.getNumberOfMaleFlatMates();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfMaleFlatMates", lhsNumberOfMaleFlatMates), LocatorUtils.property(thatLocator, "numberOfMaleFlatMates", rhsNumberOfMaleFlatMates), lhsNumberOfMaleFlatMates, rhsNumberOfMaleFlatMates, (this.numberOfMaleFlatMates!= null), (that.numberOfMaleFlatMates!= null))) {
                return false;
            }
        }
        {
            Long lhsNumberOfFemaleFlatMates;
            lhsNumberOfFemaleFlatMates = this.getNumberOfFemaleFlatMates();
            Long rhsNumberOfFemaleFlatMates;
            rhsNumberOfFemaleFlatMates = that.getNumberOfFemaleFlatMates();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfFemaleFlatMates", lhsNumberOfFemaleFlatMates), LocatorUtils.property(thatLocator, "numberOfFemaleFlatMates", rhsNumberOfFemaleFlatMates), lhsNumberOfFemaleFlatMates, rhsNumberOfFemaleFlatMates, (this.numberOfFemaleFlatMates!= null), (that.numberOfFemaleFlatMates!= null))) {
                return false;
            }
        }
        {
            Long lhsAgeOfFlatMatesFrom;
            lhsAgeOfFlatMatesFrom = this.getAgeOfFlatMatesFrom();
            Long rhsAgeOfFlatMatesFrom;
            rhsAgeOfFlatMatesFrom = that.getAgeOfFlatMatesFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ageOfFlatMatesFrom", lhsAgeOfFlatMatesFrom), LocatorUtils.property(thatLocator, "ageOfFlatMatesFrom", rhsAgeOfFlatMatesFrom), lhsAgeOfFlatMatesFrom, rhsAgeOfFlatMatesFrom, (this.ageOfFlatMatesFrom!= null), (that.ageOfFlatMatesFrom!= null))) {
                return false;
            }
        }
        {
            Long lhsAgeOfFlatMatesTo;
            lhsAgeOfFlatMatesTo = this.getAgeOfFlatMatesTo();
            Long rhsAgeOfFlatMatesTo;
            rhsAgeOfFlatMatesTo = that.getAgeOfFlatMatesTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ageOfFlatMatesTo", lhsAgeOfFlatMatesTo), LocatorUtils.property(thatLocator, "ageOfFlatMatesTo", rhsAgeOfFlatMatesTo), lhsAgeOfFlatMatesTo, rhsAgeOfFlatMatesTo, (this.ageOfFlatMatesTo!= null), (that.ageOfFlatMatesTo!= null))) {
                return false;
            }
        }
        {
            Long lhsAgeOfRequestedFrom;
            lhsAgeOfRequestedFrom = this.getAgeOfRequestedFrom();
            Long rhsAgeOfRequestedFrom;
            rhsAgeOfRequestedFrom = that.getAgeOfRequestedFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ageOfRequestedFrom", lhsAgeOfRequestedFrom), LocatorUtils.property(thatLocator, "ageOfRequestedFrom", rhsAgeOfRequestedFrom), lhsAgeOfRequestedFrom, rhsAgeOfRequestedFrom, (this.ageOfRequestedFrom!= null), (that.ageOfRequestedFrom!= null))) {
                return false;
            }
        }
        {
            Long lhsAgeOfRequestedTo;
            lhsAgeOfRequestedTo = this.getAgeOfRequestedTo();
            Long rhsAgeOfRequestedTo;
            rhsAgeOfRequestedTo = that.getAgeOfRequestedTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ageOfRequestedTo", lhsAgeOfRequestedTo), LocatorUtils.property(thatLocator, "ageOfRequestedTo", rhsAgeOfRequestedTo), lhsAgeOfRequestedTo, rhsAgeOfRequestedTo, (this.ageOfRequestedTo!= null), (that.ageOfRequestedTo!= null))) {
                return false;
            }
        }
        {
            Long lhsNumberOfRequestedFlatMates;
            lhsNumberOfRequestedFlatMates = this.getNumberOfRequestedFlatMates();
            Long rhsNumberOfRequestedFlatMates;
            rhsNumberOfRequestedFlatMates = that.getNumberOfRequestedFlatMates();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfRequestedFlatMates", lhsNumberOfRequestedFlatMates), LocatorUtils.property(thatLocator, "numberOfRequestedFlatMates", rhsNumberOfRequestedFlatMates), lhsNumberOfRequestedFlatMates, rhsNumberOfRequestedFlatMates, (this.numberOfRequestedFlatMates!= null), (that.numberOfRequestedFlatMates!= null))) {
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
            Long lhsNumberOfFloors;
            lhsNumberOfFloors = this.getNumberOfFloors();
            Long rhsNumberOfFloors;
            rhsNumberOfFloors = that.getNumberOfFloors();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfFloors", lhsNumberOfFloors), LocatorUtils.property(thatLocator, "numberOfFloors", rhsNumberOfFloors), lhsNumberOfFloors, rhsNumberOfFloors, (this.numberOfFloors!= null), (that.numberOfFloors!= null))) {
                return false;
            }
        }
        {
            Long lhsNumberOfBathRooms;
            lhsNumberOfBathRooms = this.getNumberOfBathRooms();
            Long rhsNumberOfBathRooms;
            rhsNumberOfBathRooms = that.getNumberOfBathRooms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfBathRooms", lhsNumberOfBathRooms), LocatorUtils.property(thatLocator, "numberOfBathRooms", rhsNumberOfBathRooms), lhsNumberOfBathRooms, rhsNumberOfBathRooms, (this.numberOfBathRooms!= null), (that.numberOfBathRooms!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsBalcony;
            lhsBalcony = this.getBalcony();
            YesNotApplicableType rhsBalcony;
            rhsBalcony = that.getBalcony();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balcony", lhsBalcony), LocatorUtils.property(thatLocator, "balcony", rhsBalcony), lhsBalcony, rhsBalcony, (this.balcony!= null), (that.balcony!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsGarden;
            lhsGarden = this.getGarden();
            YesNotApplicableType rhsGarden;
            rhsGarden = that.getGarden();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "garden", lhsGarden), LocatorUtils.property(thatLocator, "garden", rhsGarden), lhsGarden, rhsGarden, (this.garden!= null), (that.garden!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsLift;
            lhsLift = this.getLift();
            YesNotApplicableType rhsLift;
            rhsLift = that.getLift();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lift", lhsLift), LocatorUtils.property(thatLocator, "lift", rhsLift), lhsLift, rhsLift, (this.lift!= null), (that.lift!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsOven;
            lhsOven = this.getOven();
            YesNotApplicableType rhsOven;
            rhsOven = that.getOven();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oven", lhsOven), LocatorUtils.property(thatLocator, "oven", rhsOven), lhsOven, rhsOven, (this.oven!= null), (that.oven!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsRefrigerator;
            lhsRefrigerator = this.getRefrigerator();
            YesNotApplicableType rhsRefrigerator;
            rhsRefrigerator = that.getRefrigerator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refrigerator", lhsRefrigerator), LocatorUtils.property(thatLocator, "refrigerator", rhsRefrigerator), lhsRefrigerator, rhsRefrigerator, (this.refrigerator!= null), (that.refrigerator!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsStove;
            lhsStove = this.getStove();
            YesNotApplicableType rhsStove;
            rhsStove = that.getStove();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stove", lhsStove), LocatorUtils.property(thatLocator, "stove", rhsStove), lhsStove, rhsStove, (this.stove!= null), (that.stove!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsDishwasher;
            lhsDishwasher = this.getDishwasher();
            YesNotApplicableType rhsDishwasher;
            rhsDishwasher = that.getDishwasher();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dishwasher", lhsDishwasher), LocatorUtils.property(thatLocator, "dishwasher", rhsDishwasher), lhsDishwasher, rhsDishwasher, (this.dishwasher!= null), (that.dishwasher!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsWashingMachine;
            lhsWashingMachine = this.getWashingMachine();
            YesNotApplicableType rhsWashingMachine;
            rhsWashingMachine = that.getWashingMachine();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "washingMachine", lhsWashingMachine), LocatorUtils.property(thatLocator, "washingMachine", rhsWashingMachine), lhsWashingMachine, rhsWashingMachine, (this.washingMachine!= null), (that.washingMachine!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsBathHasWc;
            lhsBathHasWc = this.getBathHasWc();
            YesNotApplicableType rhsBathHasWc;
            rhsBathHasWc = that.getBathHasWc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bathHasWc", lhsBathHasWc), LocatorUtils.property(thatLocator, "bathHasWc", rhsBathHasWc), lhsBathHasWc, rhsBathHasWc, (this.bathHasWc!= null), (that.bathHasWc!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsBathHasShower;
            lhsBathHasShower = this.getBathHasShower();
            YesNotApplicableType rhsBathHasShower;
            rhsBathHasShower = that.getBathHasShower();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bathHasShower", lhsBathHasShower), LocatorUtils.property(thatLocator, "bathHasShower", rhsBathHasShower), lhsBathHasShower, rhsBathHasShower, (this.bathHasShower!= null), (that.bathHasShower!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsBathHasTub;
            lhsBathHasTub = this.getBathHasTub();
            YesNotApplicableType rhsBathHasTub;
            rhsBathHasTub = that.getBathHasTub();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bathHasTub", lhsBathHasTub), LocatorUtils.property(thatLocator, "bathHasTub", rhsBathHasTub), lhsBathHasTub, rhsBathHasTub, (this.bathHasTub!= null), (that.bathHasTub!= null))) {
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
            PetsAllowedType lhsPetsAllowed;
            lhsPetsAllowed = this.getPetsAllowed();
            PetsAllowedType rhsPetsAllowed;
            rhsPetsAllowed = that.getPetsAllowed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "petsAllowed", lhsPetsAllowed), LocatorUtils.property(thatLocator, "petsAllowed", rhsPetsAllowed), lhsPetsAllowed, rhsPetsAllowed, (this.petsAllowed!= null), (that.petsAllowed!= null))) {
                return false;
            }
        }
        {
            InternetConnectionType lhsInternetConnection;
            lhsInternetConnection = this.getInternetConnection();
            InternetConnectionType rhsInternetConnection;
            rhsInternetConnection = that.getInternetConnection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "internetConnection", lhsInternetConnection), LocatorUtils.property(thatLocator, "internetConnection", rhsInternetConnection), lhsInternetConnection, rhsInternetConnection, (this.internetConnection!= null), (that.internetConnection!= null))) {
                return false;
            }
        }
        {
            SmokingAllowedType lhsSmokingAllowed;
            lhsSmokingAllowed = this.getSmokingAllowed();
            SmokingAllowedType rhsSmokingAllowed;
            rhsSmokingAllowed = that.getSmokingAllowed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "smokingAllowed", lhsSmokingAllowed), LocatorUtils.property(thatLocator, "smokingAllowed", rhsSmokingAllowed), lhsSmokingAllowed, rhsSmokingAllowed, (this.smokingAllowed!= null), (that.smokingAllowed!= null))) {
                return false;
            }
        }
        {
            FlatMateGenderType lhsRequestedGender;
            lhsRequestedGender = this.getRequestedGender();
            FlatMateGenderType rhsRequestedGender;
            rhsRequestedGender = that.getRequestedGender();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedGender", lhsRequestedGender), LocatorUtils.property(thatLocator, "requestedGender", rhsRequestedGender), lhsRequestedGender, rhsRequestedGender, (this.requestedGender!= null), (that.requestedGender!= null))) {
                return false;
            }
        }
        {
            YesNoNotApplicableType lhsFurnishing;
            lhsFurnishing = this.getFurnishing();
            YesNoNotApplicableType rhsFurnishing;
            rhsFurnishing = that.getFurnishing();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "furnishing", lhsFurnishing), LocatorUtils.property(thatLocator, "furnishing", rhsFurnishing), lhsFurnishing, rhsFurnishing, (this.furnishing!= null), (that.furnishing!= null))) {
                return false;
            }
        }
        {
            TvConnectionType lhsTvConnection;
            lhsTvConnection = this.getTvConnection();
            TvConnectionType rhsTvConnection;
            rhsTvConnection = that.getTvConnection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tvConnection", lhsTvConnection), LocatorUtils.property(thatLocator, "tvConnection", rhsTvConnection), lhsTvConnection, rhsTvConnection, (this.tvConnection!= null), (that.tvConnection!= null))) {
                return false;
            }
        }
        {
            TelephoneConnectionType lhsTelephoneConnection;
            lhsTelephoneConnection = this.getTelephoneConnection();
            TelephoneConnectionType rhsTelephoneConnection;
            rhsTelephoneConnection = that.getTelephoneConnection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telephoneConnection", lhsTelephoneConnection), LocatorUtils.property(thatLocator, "telephoneConnection", rhsTelephoneConnection), lhsTelephoneConnection, rhsTelephoneConnection, (this.telephoneConnection!= null), (that.telephoneConnection!= null))) {
                return false;
            }
        }
        {
            ParkingSituationType lhsParkingSituation;
            lhsParkingSituation = this.getParkingSituation();
            ParkingSituationType rhsParkingSituation;
            rhsParkingSituation = that.getParkingSituation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parkingSituation", lhsParkingSituation), LocatorUtils.property(thatLocator, "parkingSituation", rhsParkingSituation), lhsParkingSituation, rhsParkingSituation, (this.parkingSituation!= null), (that.parkingSituation!= null))) {
                return false;
            }
        }
        {
            Integer lhsFlatShareSize;
            lhsFlatShareSize = this.getFlatShareSize();
            Integer rhsFlatShareSize;
            rhsFlatShareSize = that.getFlatShareSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flatShareSize", lhsFlatShareSize), LocatorUtils.property(thatLocator, "flatShareSize", rhsFlatShareSize), lhsFlatShareSize, rhsFlatShareSize, (this.flatShareSize!= null), (that.flatShareSize!= null))) {
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
