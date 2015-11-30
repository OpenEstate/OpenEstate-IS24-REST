
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
public class FlatShareRoom
    extends RealEstate
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal roomSize;
    @XmlSchemaType(name = "string")
    protected FlooringType flooringType;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal numberOfRooms;
    @XmlSchemaType(name = "string")
    protected ApartmentType apartmentType;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType cellar;
    @XmlSchemaType(name = "string")
    @Deprecated
    protected HeatingType heatingType;
    @XmlSchemaType(name = "string")
    protected HeatingTypeEnev2014 heatingTypeEnev2014;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType barrierFree;
    @XmlElement(required = true)
    protected CourtageInfo courtage;
    protected EnergyPerformanceCertificate energyCertificate;
    protected EnergySourcesEnev2014 energySourcesEnev2014;
    @XmlSchemaType(name = "string")
    protected BuildingEnergyRatingType buildingEnergyRatingType;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.realestates.Adapter1 .class)
    protected BigDecimal thermalCharacteristic;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType energyConsumptionContainsWarmWater;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.realestates.Adapter2 .class)
    protected Integer constructionYear;
    protected Boolean constructionYearUnknown;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal baseRent;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal totalRent;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal serviceCharge;
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.common.Adapter2 .class)
    protected String deposit;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal heatingCosts;
    @XmlSchemaType(name = "string")
    protected YesNoNotApplicableType heatingCostsInServiceCharge;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.Adapter3 .class)
    @XmlSchemaType(name = "date")
    protected Calendar freeFrom;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.Adapter3 .class)
    @XmlSchemaType(name = "date")
    protected Calendar freeUntil;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long minimumTermOfLease;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal totalSpace;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long numberOfMaleFlatMates;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long numberOfFemaleFlatMates;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long ageOfFlatMatesFrom;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long ageOfFlatMatesTo;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long ageOfRequestedFrom;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long ageOfRequestedTo;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long numberOfRequestedFlatMates;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.realestates.Adapter3 .class)
    protected Integer floor;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long numberOfFloors;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long numberOfBathRooms;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType balcony;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType garden;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType lift;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType oven;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType refrigerator;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType stove;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType dishwasher;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType washingMachine;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType bathHasWc;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType bathHasShower;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType bathHasTub;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType guestToilet;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PetsAllowedType petsAllowed;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected InternetConnectionType internetConnection;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SmokingAllowedType smokingAllowed;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FlatMateGenderType requestedGender;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected YesNoNotApplicableType furnishing;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TvConnectionType tvConnection;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TelephoneConnectionType telephoneConnection;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ParkingSituationType parkingSituation;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "int")
    protected Integer flatShareSize;

    /**
     * Gets the value of the roomSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
     * Gets the value of the barrierFree property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
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
     * Gets the value of the freeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
     * Gets the value of the numberOfBathRooms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
     * Gets the value of the internetConnection property.
     * 
     * @return
     *     possible object is
     *     {@link InternetConnectionType }
     *     
     */
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
    public void setFlatShareSize(Integer value) {
        this.flatShareSize = value;
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
            BigDecimal theRoomSize;
            theRoomSize = this.getRoomSize();
            strategy.appendField(locator, this, "roomSize", buffer, theRoomSize);
        }
        {
            FlooringType theFlooringType;
            theFlooringType = this.getFlooringType();
            strategy.appendField(locator, this, "flooringType", buffer, theFlooringType);
        }
        {
            BigDecimal theNumberOfRooms;
            theNumberOfRooms = this.getNumberOfRooms();
            strategy.appendField(locator, this, "numberOfRooms", buffer, theNumberOfRooms);
        }
        {
            ApartmentType theApartmentType;
            theApartmentType = this.getApartmentType();
            strategy.appendField(locator, this, "apartmentType", buffer, theApartmentType);
        }
        {
            YesNotApplicableType theCellar;
            theCellar = this.getCellar();
            strategy.appendField(locator, this, "cellar", buffer, theCellar);
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
            YesNotApplicableType theBarrierFree;
            theBarrierFree = this.getBarrierFree();
            strategy.appendField(locator, this, "barrierFree", buffer, theBarrierFree);
        }
        {
            CourtageInfo theCourtage;
            theCourtage = this.getCourtage();
            strategy.appendField(locator, this, "courtage", buffer, theCourtage);
        }
        {
            EnergyPerformanceCertificate theEnergyCertificate;
            theEnergyCertificate = this.getEnergyCertificate();
            strategy.appendField(locator, this, "energyCertificate", buffer, theEnergyCertificate);
        }
        {
            EnergySourcesEnev2014 theEnergySourcesEnev2014;
            theEnergySourcesEnev2014 = this.getEnergySourcesEnev2014();
            strategy.appendField(locator, this, "energySourcesEnev2014", buffer, theEnergySourcesEnev2014);
        }
        {
            BuildingEnergyRatingType theBuildingEnergyRatingType;
            theBuildingEnergyRatingType = this.getBuildingEnergyRatingType();
            strategy.appendField(locator, this, "buildingEnergyRatingType", buffer, theBuildingEnergyRatingType);
        }
        {
            BigDecimal theThermalCharacteristic;
            theThermalCharacteristic = this.getThermalCharacteristic();
            strategy.appendField(locator, this, "thermalCharacteristic", buffer, theThermalCharacteristic);
        }
        {
            YesNotApplicableType theEnergyConsumptionContainsWarmWater;
            theEnergyConsumptionContainsWarmWater = this.getEnergyConsumptionContainsWarmWater();
            strategy.appendField(locator, this, "energyConsumptionContainsWarmWater", buffer, theEnergyConsumptionContainsWarmWater);
        }
        {
            Integer theConstructionYear;
            theConstructionYear = this.getConstructionYear();
            strategy.appendField(locator, this, "constructionYear", buffer, theConstructionYear);
        }
        {
            Boolean theConstructionYearUnknown;
            theConstructionYearUnknown = this.isConstructionYearUnknown();
            strategy.appendField(locator, this, "constructionYearUnknown", buffer, theConstructionYearUnknown);
        }
        {
            BigDecimal theBaseRent;
            theBaseRent = this.getBaseRent();
            strategy.appendField(locator, this, "baseRent", buffer, theBaseRent);
        }
        {
            BigDecimal theTotalRent;
            theTotalRent = this.getTotalRent();
            strategy.appendField(locator, this, "totalRent", buffer, theTotalRent);
        }
        {
            BigDecimal theServiceCharge;
            theServiceCharge = this.getServiceCharge();
            strategy.appendField(locator, this, "serviceCharge", buffer, theServiceCharge);
        }
        {
            String theDeposit;
            theDeposit = this.getDeposit();
            strategy.appendField(locator, this, "deposit", buffer, theDeposit);
        }
        {
            BigDecimal theHeatingCosts;
            theHeatingCosts = this.getHeatingCosts();
            strategy.appendField(locator, this, "heatingCosts", buffer, theHeatingCosts);
        }
        {
            YesNoNotApplicableType theHeatingCostsInServiceCharge;
            theHeatingCostsInServiceCharge = this.getHeatingCostsInServiceCharge();
            strategy.appendField(locator, this, "heatingCostsInServiceCharge", buffer, theHeatingCostsInServiceCharge);
        }
        {
            Calendar theFreeFrom;
            theFreeFrom = this.getFreeFrom();
            strategy.appendField(locator, this, "freeFrom", buffer, theFreeFrom);
        }
        {
            Calendar theFreeUntil;
            theFreeUntil = this.getFreeUntil();
            strategy.appendField(locator, this, "freeUntil", buffer, theFreeUntil);
        }
        {
            Long theMinimumTermOfLease;
            theMinimumTermOfLease = this.getMinimumTermOfLease();
            strategy.appendField(locator, this, "minimumTermOfLease", buffer, theMinimumTermOfLease);
        }
        {
            BigDecimal theTotalSpace;
            theTotalSpace = this.getTotalSpace();
            strategy.appendField(locator, this, "totalSpace", buffer, theTotalSpace);
        }
        {
            Long theNumberOfMaleFlatMates;
            theNumberOfMaleFlatMates = this.getNumberOfMaleFlatMates();
            strategy.appendField(locator, this, "numberOfMaleFlatMates", buffer, theNumberOfMaleFlatMates);
        }
        {
            Long theNumberOfFemaleFlatMates;
            theNumberOfFemaleFlatMates = this.getNumberOfFemaleFlatMates();
            strategy.appendField(locator, this, "numberOfFemaleFlatMates", buffer, theNumberOfFemaleFlatMates);
        }
        {
            Long theAgeOfFlatMatesFrom;
            theAgeOfFlatMatesFrom = this.getAgeOfFlatMatesFrom();
            strategy.appendField(locator, this, "ageOfFlatMatesFrom", buffer, theAgeOfFlatMatesFrom);
        }
        {
            Long theAgeOfFlatMatesTo;
            theAgeOfFlatMatesTo = this.getAgeOfFlatMatesTo();
            strategy.appendField(locator, this, "ageOfFlatMatesTo", buffer, theAgeOfFlatMatesTo);
        }
        {
            Long theAgeOfRequestedFrom;
            theAgeOfRequestedFrom = this.getAgeOfRequestedFrom();
            strategy.appendField(locator, this, "ageOfRequestedFrom", buffer, theAgeOfRequestedFrom);
        }
        {
            Long theAgeOfRequestedTo;
            theAgeOfRequestedTo = this.getAgeOfRequestedTo();
            strategy.appendField(locator, this, "ageOfRequestedTo", buffer, theAgeOfRequestedTo);
        }
        {
            Long theNumberOfRequestedFlatMates;
            theNumberOfRequestedFlatMates = this.getNumberOfRequestedFlatMates();
            strategy.appendField(locator, this, "numberOfRequestedFlatMates", buffer, theNumberOfRequestedFlatMates);
        }
        {
            Integer theFloor;
            theFloor = this.getFloor();
            strategy.appendField(locator, this, "floor", buffer, theFloor);
        }
        {
            Long theNumberOfFloors;
            theNumberOfFloors = this.getNumberOfFloors();
            strategy.appendField(locator, this, "numberOfFloors", buffer, theNumberOfFloors);
        }
        {
            Long theNumberOfBathRooms;
            theNumberOfBathRooms = this.getNumberOfBathRooms();
            strategy.appendField(locator, this, "numberOfBathRooms", buffer, theNumberOfBathRooms);
        }
        {
            YesNotApplicableType theBalcony;
            theBalcony = this.getBalcony();
            strategy.appendField(locator, this, "balcony", buffer, theBalcony);
        }
        {
            YesNotApplicableType theGarden;
            theGarden = this.getGarden();
            strategy.appendField(locator, this, "garden", buffer, theGarden);
        }
        {
            YesNotApplicableType theLift;
            theLift = this.getLift();
            strategy.appendField(locator, this, "lift", buffer, theLift);
        }
        {
            YesNotApplicableType theOven;
            theOven = this.getOven();
            strategy.appendField(locator, this, "oven", buffer, theOven);
        }
        {
            YesNotApplicableType theRefrigerator;
            theRefrigerator = this.getRefrigerator();
            strategy.appendField(locator, this, "refrigerator", buffer, theRefrigerator);
        }
        {
            YesNotApplicableType theStove;
            theStove = this.getStove();
            strategy.appendField(locator, this, "stove", buffer, theStove);
        }
        {
            YesNotApplicableType theDishwasher;
            theDishwasher = this.getDishwasher();
            strategy.appendField(locator, this, "dishwasher", buffer, theDishwasher);
        }
        {
            YesNotApplicableType theWashingMachine;
            theWashingMachine = this.getWashingMachine();
            strategy.appendField(locator, this, "washingMachine", buffer, theWashingMachine);
        }
        {
            YesNotApplicableType theBathHasWc;
            theBathHasWc = this.getBathHasWc();
            strategy.appendField(locator, this, "bathHasWc", buffer, theBathHasWc);
        }
        {
            YesNotApplicableType theBathHasShower;
            theBathHasShower = this.getBathHasShower();
            strategy.appendField(locator, this, "bathHasShower", buffer, theBathHasShower);
        }
        {
            YesNotApplicableType theBathHasTub;
            theBathHasTub = this.getBathHasTub();
            strategy.appendField(locator, this, "bathHasTub", buffer, theBathHasTub);
        }
        {
            YesNotApplicableType theGuestToilet;
            theGuestToilet = this.getGuestToilet();
            strategy.appendField(locator, this, "guestToilet", buffer, theGuestToilet);
        }
        {
            PetsAllowedType thePetsAllowed;
            thePetsAllowed = this.getPetsAllowed();
            strategy.appendField(locator, this, "petsAllowed", buffer, thePetsAllowed);
        }
        {
            InternetConnectionType theInternetConnection;
            theInternetConnection = this.getInternetConnection();
            strategy.appendField(locator, this, "internetConnection", buffer, theInternetConnection);
        }
        {
            SmokingAllowedType theSmokingAllowed;
            theSmokingAllowed = this.getSmokingAllowed();
            strategy.appendField(locator, this, "smokingAllowed", buffer, theSmokingAllowed);
        }
        {
            FlatMateGenderType theRequestedGender;
            theRequestedGender = this.getRequestedGender();
            strategy.appendField(locator, this, "requestedGender", buffer, theRequestedGender);
        }
        {
            YesNoNotApplicableType theFurnishing;
            theFurnishing = this.getFurnishing();
            strategy.appendField(locator, this, "furnishing", buffer, theFurnishing);
        }
        {
            TvConnectionType theTvConnection;
            theTvConnection = this.getTvConnection();
            strategy.appendField(locator, this, "tvConnection", buffer, theTvConnection);
        }
        {
            TelephoneConnectionType theTelephoneConnection;
            theTelephoneConnection = this.getTelephoneConnection();
            strategy.appendField(locator, this, "telephoneConnection", buffer, theTelephoneConnection);
        }
        {
            ParkingSituationType theParkingSituation;
            theParkingSituation = this.getParkingSituation();
            strategy.appendField(locator, this, "parkingSituation", buffer, theParkingSituation);
        }
        {
            Integer theFlatShareSize;
            theFlatShareSize = this.getFlatShareSize();
            strategy.appendField(locator, this, "flatShareSize", buffer, theFlatShareSize);
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
        if (draftCopy instanceof FlatShareRoom) {
            final FlatShareRoom copy = ((FlatShareRoom) draftCopy);
            if (this.roomSize!= null) {
                BigDecimal sourceRoomSize;
                sourceRoomSize = this.getRoomSize();
                BigDecimal copyRoomSize = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "roomSize", sourceRoomSize), sourceRoomSize));
                copy.setRoomSize(copyRoomSize);
            } else {
                copy.roomSize = null;
            }
            if (this.flooringType!= null) {
                FlooringType sourceFlooringType;
                sourceFlooringType = this.getFlooringType();
                FlooringType copyFlooringType = ((FlooringType) strategy.copy(LocatorUtils.property(locator, "flooringType", sourceFlooringType), sourceFlooringType));
                copy.setFlooringType(copyFlooringType);
            } else {
                copy.flooringType = null;
            }
            if (this.numberOfRooms!= null) {
                BigDecimal sourceNumberOfRooms;
                sourceNumberOfRooms = this.getNumberOfRooms();
                BigDecimal copyNumberOfRooms = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "numberOfRooms", sourceNumberOfRooms), sourceNumberOfRooms));
                copy.setNumberOfRooms(copyNumberOfRooms);
            } else {
                copy.numberOfRooms = null;
            }
            if (this.apartmentType!= null) {
                ApartmentType sourceApartmentType;
                sourceApartmentType = this.getApartmentType();
                ApartmentType copyApartmentType = ((ApartmentType) strategy.copy(LocatorUtils.property(locator, "apartmentType", sourceApartmentType), sourceApartmentType));
                copy.setApartmentType(copyApartmentType);
            } else {
                copy.apartmentType = null;
            }
            if (this.cellar!= null) {
                YesNotApplicableType sourceCellar;
                sourceCellar = this.getCellar();
                YesNotApplicableType copyCellar = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "cellar", sourceCellar), sourceCellar));
                copy.setCellar(copyCellar);
            } else {
                copy.cellar = null;
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
            if (this.barrierFree!= null) {
                YesNotApplicableType sourceBarrierFree;
                sourceBarrierFree = this.getBarrierFree();
                YesNotApplicableType copyBarrierFree = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "barrierFree", sourceBarrierFree), sourceBarrierFree));
                copy.setBarrierFree(copyBarrierFree);
            } else {
                copy.barrierFree = null;
            }
            if (this.courtage!= null) {
                CourtageInfo sourceCourtage;
                sourceCourtage = this.getCourtage();
                CourtageInfo copyCourtage = ((CourtageInfo) strategy.copy(LocatorUtils.property(locator, "courtage", sourceCourtage), sourceCourtage));
                copy.setCourtage(copyCourtage);
            } else {
                copy.courtage = null;
            }
            if (this.energyCertificate!= null) {
                EnergyPerformanceCertificate sourceEnergyCertificate;
                sourceEnergyCertificate = this.getEnergyCertificate();
                EnergyPerformanceCertificate copyEnergyCertificate = ((EnergyPerformanceCertificate) strategy.copy(LocatorUtils.property(locator, "energyCertificate", sourceEnergyCertificate), sourceEnergyCertificate));
                copy.setEnergyCertificate(copyEnergyCertificate);
            } else {
                copy.energyCertificate = null;
            }
            if (this.energySourcesEnev2014 != null) {
                EnergySourcesEnev2014 sourceEnergySourcesEnev2014;
                sourceEnergySourcesEnev2014 = this.getEnergySourcesEnev2014();
                EnergySourcesEnev2014 copyEnergySourcesEnev2014 = ((EnergySourcesEnev2014) strategy.copy(LocatorUtils.property(locator, "energySourcesEnev2014", sourceEnergySourcesEnev2014), sourceEnergySourcesEnev2014));
                copy.setEnergySourcesEnev2014(copyEnergySourcesEnev2014);
            } else {
                copy.energySourcesEnev2014 = null;
            }
            if (this.buildingEnergyRatingType!= null) {
                BuildingEnergyRatingType sourceBuildingEnergyRatingType;
                sourceBuildingEnergyRatingType = this.getBuildingEnergyRatingType();
                BuildingEnergyRatingType copyBuildingEnergyRatingType = ((BuildingEnergyRatingType) strategy.copy(LocatorUtils.property(locator, "buildingEnergyRatingType", sourceBuildingEnergyRatingType), sourceBuildingEnergyRatingType));
                copy.setBuildingEnergyRatingType(copyBuildingEnergyRatingType);
            } else {
                copy.buildingEnergyRatingType = null;
            }
            if (this.thermalCharacteristic!= null) {
                BigDecimal sourceThermalCharacteristic;
                sourceThermalCharacteristic = this.getThermalCharacteristic();
                BigDecimal copyThermalCharacteristic = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "thermalCharacteristic", sourceThermalCharacteristic), sourceThermalCharacteristic));
                copy.setThermalCharacteristic(copyThermalCharacteristic);
            } else {
                copy.thermalCharacteristic = null;
            }
            if (this.energyConsumptionContainsWarmWater!= null) {
                YesNotApplicableType sourceEnergyConsumptionContainsWarmWater;
                sourceEnergyConsumptionContainsWarmWater = this.getEnergyConsumptionContainsWarmWater();
                YesNotApplicableType copyEnergyConsumptionContainsWarmWater = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "energyConsumptionContainsWarmWater", sourceEnergyConsumptionContainsWarmWater), sourceEnergyConsumptionContainsWarmWater));
                copy.setEnergyConsumptionContainsWarmWater(copyEnergyConsumptionContainsWarmWater);
            } else {
                copy.energyConsumptionContainsWarmWater = null;
            }
            if (this.constructionYear!= null) {
                Integer sourceConstructionYear;
                sourceConstructionYear = this.getConstructionYear();
                Integer copyConstructionYear = ((Integer) strategy.copy(LocatorUtils.property(locator, "constructionYear", sourceConstructionYear), sourceConstructionYear));
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
            if (this.baseRent!= null) {
                BigDecimal sourceBaseRent;
                sourceBaseRent = this.getBaseRent();
                BigDecimal copyBaseRent = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "baseRent", sourceBaseRent), sourceBaseRent));
                copy.setBaseRent(copyBaseRent);
            } else {
                copy.baseRent = null;
            }
            if (this.totalRent!= null) {
                BigDecimal sourceTotalRent;
                sourceTotalRent = this.getTotalRent();
                BigDecimal copyTotalRent = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "totalRent", sourceTotalRent), sourceTotalRent));
                copy.setTotalRent(copyTotalRent);
            } else {
                copy.totalRent = null;
            }
            if (this.serviceCharge!= null) {
                BigDecimal sourceServiceCharge;
                sourceServiceCharge = this.getServiceCharge();
                BigDecimal copyServiceCharge = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "serviceCharge", sourceServiceCharge), sourceServiceCharge));
                copy.setServiceCharge(copyServiceCharge);
            } else {
                copy.serviceCharge = null;
            }
            if (this.deposit!= null) {
                String sourceDeposit;
                sourceDeposit = this.getDeposit();
                String copyDeposit = ((String) strategy.copy(LocatorUtils.property(locator, "deposit", sourceDeposit), sourceDeposit));
                copy.setDeposit(copyDeposit);
            } else {
                copy.deposit = null;
            }
            if (this.heatingCosts!= null) {
                BigDecimal sourceHeatingCosts;
                sourceHeatingCosts = this.getHeatingCosts();
                BigDecimal copyHeatingCosts = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "heatingCosts", sourceHeatingCosts), sourceHeatingCosts));
                copy.setHeatingCosts(copyHeatingCosts);
            } else {
                copy.heatingCosts = null;
            }
            if (this.heatingCostsInServiceCharge!= null) {
                YesNoNotApplicableType sourceHeatingCostsInServiceCharge;
                sourceHeatingCostsInServiceCharge = this.getHeatingCostsInServiceCharge();
                YesNoNotApplicableType copyHeatingCostsInServiceCharge = ((YesNoNotApplicableType) strategy.copy(LocatorUtils.property(locator, "heatingCostsInServiceCharge", sourceHeatingCostsInServiceCharge), sourceHeatingCostsInServiceCharge));
                copy.setHeatingCostsInServiceCharge(copyHeatingCostsInServiceCharge);
            } else {
                copy.heatingCostsInServiceCharge = null;
            }
            if (this.freeFrom!= null) {
                Calendar sourceFreeFrom;
                sourceFreeFrom = this.getFreeFrom();
                Calendar copyFreeFrom = ((Calendar) strategy.copy(LocatorUtils.property(locator, "freeFrom", sourceFreeFrom), sourceFreeFrom));
                copy.setFreeFrom(copyFreeFrom);
            } else {
                copy.freeFrom = null;
            }
            if (this.freeUntil!= null) {
                Calendar sourceFreeUntil;
                sourceFreeUntil = this.getFreeUntil();
                Calendar copyFreeUntil = ((Calendar) strategy.copy(LocatorUtils.property(locator, "freeUntil", sourceFreeUntil), sourceFreeUntil));
                copy.setFreeUntil(copyFreeUntil);
            } else {
                copy.freeUntil = null;
            }
            if (this.minimumTermOfLease!= null) {
                Long sourceMinimumTermOfLease;
                sourceMinimumTermOfLease = this.getMinimumTermOfLease();
                Long copyMinimumTermOfLease = ((Long) strategy.copy(LocatorUtils.property(locator, "minimumTermOfLease", sourceMinimumTermOfLease), sourceMinimumTermOfLease));
                copy.setMinimumTermOfLease(copyMinimumTermOfLease);
            } else {
                copy.minimumTermOfLease = null;
            }
            if (this.totalSpace!= null) {
                BigDecimal sourceTotalSpace;
                sourceTotalSpace = this.getTotalSpace();
                BigDecimal copyTotalSpace = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "totalSpace", sourceTotalSpace), sourceTotalSpace));
                copy.setTotalSpace(copyTotalSpace);
            } else {
                copy.totalSpace = null;
            }
            if (this.numberOfMaleFlatMates!= null) {
                Long sourceNumberOfMaleFlatMates;
                sourceNumberOfMaleFlatMates = this.getNumberOfMaleFlatMates();
                Long copyNumberOfMaleFlatMates = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfMaleFlatMates", sourceNumberOfMaleFlatMates), sourceNumberOfMaleFlatMates));
                copy.setNumberOfMaleFlatMates(copyNumberOfMaleFlatMates);
            } else {
                copy.numberOfMaleFlatMates = null;
            }
            if (this.numberOfFemaleFlatMates!= null) {
                Long sourceNumberOfFemaleFlatMates;
                sourceNumberOfFemaleFlatMates = this.getNumberOfFemaleFlatMates();
                Long copyNumberOfFemaleFlatMates = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfFemaleFlatMates", sourceNumberOfFemaleFlatMates), sourceNumberOfFemaleFlatMates));
                copy.setNumberOfFemaleFlatMates(copyNumberOfFemaleFlatMates);
            } else {
                copy.numberOfFemaleFlatMates = null;
            }
            if (this.ageOfFlatMatesFrom!= null) {
                Long sourceAgeOfFlatMatesFrom;
                sourceAgeOfFlatMatesFrom = this.getAgeOfFlatMatesFrom();
                Long copyAgeOfFlatMatesFrom = ((Long) strategy.copy(LocatorUtils.property(locator, "ageOfFlatMatesFrom", sourceAgeOfFlatMatesFrom), sourceAgeOfFlatMatesFrom));
                copy.setAgeOfFlatMatesFrom(copyAgeOfFlatMatesFrom);
            } else {
                copy.ageOfFlatMatesFrom = null;
            }
            if (this.ageOfFlatMatesTo!= null) {
                Long sourceAgeOfFlatMatesTo;
                sourceAgeOfFlatMatesTo = this.getAgeOfFlatMatesTo();
                Long copyAgeOfFlatMatesTo = ((Long) strategy.copy(LocatorUtils.property(locator, "ageOfFlatMatesTo", sourceAgeOfFlatMatesTo), sourceAgeOfFlatMatesTo));
                copy.setAgeOfFlatMatesTo(copyAgeOfFlatMatesTo);
            } else {
                copy.ageOfFlatMatesTo = null;
            }
            if (this.ageOfRequestedFrom!= null) {
                Long sourceAgeOfRequestedFrom;
                sourceAgeOfRequestedFrom = this.getAgeOfRequestedFrom();
                Long copyAgeOfRequestedFrom = ((Long) strategy.copy(LocatorUtils.property(locator, "ageOfRequestedFrom", sourceAgeOfRequestedFrom), sourceAgeOfRequestedFrom));
                copy.setAgeOfRequestedFrom(copyAgeOfRequestedFrom);
            } else {
                copy.ageOfRequestedFrom = null;
            }
            if (this.ageOfRequestedTo!= null) {
                Long sourceAgeOfRequestedTo;
                sourceAgeOfRequestedTo = this.getAgeOfRequestedTo();
                Long copyAgeOfRequestedTo = ((Long) strategy.copy(LocatorUtils.property(locator, "ageOfRequestedTo", sourceAgeOfRequestedTo), sourceAgeOfRequestedTo));
                copy.setAgeOfRequestedTo(copyAgeOfRequestedTo);
            } else {
                copy.ageOfRequestedTo = null;
            }
            if (this.numberOfRequestedFlatMates!= null) {
                Long sourceNumberOfRequestedFlatMates;
                sourceNumberOfRequestedFlatMates = this.getNumberOfRequestedFlatMates();
                Long copyNumberOfRequestedFlatMates = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfRequestedFlatMates", sourceNumberOfRequestedFlatMates), sourceNumberOfRequestedFlatMates));
                copy.setNumberOfRequestedFlatMates(copyNumberOfRequestedFlatMates);
            } else {
                copy.numberOfRequestedFlatMates = null;
            }
            if (this.floor!= null) {
                Integer sourceFloor;
                sourceFloor = this.getFloor();
                Integer copyFloor = ((Integer) strategy.copy(LocatorUtils.property(locator, "floor", sourceFloor), sourceFloor));
                copy.setFloor(copyFloor);
            } else {
                copy.floor = null;
            }
            if (this.numberOfFloors!= null) {
                Long sourceNumberOfFloors;
                sourceNumberOfFloors = this.getNumberOfFloors();
                Long copyNumberOfFloors = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfFloors", sourceNumberOfFloors), sourceNumberOfFloors));
                copy.setNumberOfFloors(copyNumberOfFloors);
            } else {
                copy.numberOfFloors = null;
            }
            if (this.numberOfBathRooms!= null) {
                Long sourceNumberOfBathRooms;
                sourceNumberOfBathRooms = this.getNumberOfBathRooms();
                Long copyNumberOfBathRooms = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfBathRooms", sourceNumberOfBathRooms), sourceNumberOfBathRooms));
                copy.setNumberOfBathRooms(copyNumberOfBathRooms);
            } else {
                copy.numberOfBathRooms = null;
            }
            if (this.balcony!= null) {
                YesNotApplicableType sourceBalcony;
                sourceBalcony = this.getBalcony();
                YesNotApplicableType copyBalcony = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "balcony", sourceBalcony), sourceBalcony));
                copy.setBalcony(copyBalcony);
            } else {
                copy.balcony = null;
            }
            if (this.garden!= null) {
                YesNotApplicableType sourceGarden;
                sourceGarden = this.getGarden();
                YesNotApplicableType copyGarden = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "garden", sourceGarden), sourceGarden));
                copy.setGarden(copyGarden);
            } else {
                copy.garden = null;
            }
            if (this.lift!= null) {
                YesNotApplicableType sourceLift;
                sourceLift = this.getLift();
                YesNotApplicableType copyLift = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "lift", sourceLift), sourceLift));
                copy.setLift(copyLift);
            } else {
                copy.lift = null;
            }
            if (this.oven!= null) {
                YesNotApplicableType sourceOven;
                sourceOven = this.getOven();
                YesNotApplicableType copyOven = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "oven", sourceOven), sourceOven));
                copy.setOven(copyOven);
            } else {
                copy.oven = null;
            }
            if (this.refrigerator!= null) {
                YesNotApplicableType sourceRefrigerator;
                sourceRefrigerator = this.getRefrigerator();
                YesNotApplicableType copyRefrigerator = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "refrigerator", sourceRefrigerator), sourceRefrigerator));
                copy.setRefrigerator(copyRefrigerator);
            } else {
                copy.refrigerator = null;
            }
            if (this.stove!= null) {
                YesNotApplicableType sourceStove;
                sourceStove = this.getStove();
                YesNotApplicableType copyStove = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "stove", sourceStove), sourceStove));
                copy.setStove(copyStove);
            } else {
                copy.stove = null;
            }
            if (this.dishwasher!= null) {
                YesNotApplicableType sourceDishwasher;
                sourceDishwasher = this.getDishwasher();
                YesNotApplicableType copyDishwasher = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "dishwasher", sourceDishwasher), sourceDishwasher));
                copy.setDishwasher(copyDishwasher);
            } else {
                copy.dishwasher = null;
            }
            if (this.washingMachine!= null) {
                YesNotApplicableType sourceWashingMachine;
                sourceWashingMachine = this.getWashingMachine();
                YesNotApplicableType copyWashingMachine = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "washingMachine", sourceWashingMachine), sourceWashingMachine));
                copy.setWashingMachine(copyWashingMachine);
            } else {
                copy.washingMachine = null;
            }
            if (this.bathHasWc!= null) {
                YesNotApplicableType sourceBathHasWc;
                sourceBathHasWc = this.getBathHasWc();
                YesNotApplicableType copyBathHasWc = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "bathHasWc", sourceBathHasWc), sourceBathHasWc));
                copy.setBathHasWc(copyBathHasWc);
            } else {
                copy.bathHasWc = null;
            }
            if (this.bathHasShower!= null) {
                YesNotApplicableType sourceBathHasShower;
                sourceBathHasShower = this.getBathHasShower();
                YesNotApplicableType copyBathHasShower = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "bathHasShower", sourceBathHasShower), sourceBathHasShower));
                copy.setBathHasShower(copyBathHasShower);
            } else {
                copy.bathHasShower = null;
            }
            if (this.bathHasTub!= null) {
                YesNotApplicableType sourceBathHasTub;
                sourceBathHasTub = this.getBathHasTub();
                YesNotApplicableType copyBathHasTub = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "bathHasTub", sourceBathHasTub), sourceBathHasTub));
                copy.setBathHasTub(copyBathHasTub);
            } else {
                copy.bathHasTub = null;
            }
            if (this.guestToilet!= null) {
                YesNotApplicableType sourceGuestToilet;
                sourceGuestToilet = this.getGuestToilet();
                YesNotApplicableType copyGuestToilet = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "guestToilet", sourceGuestToilet), sourceGuestToilet));
                copy.setGuestToilet(copyGuestToilet);
            } else {
                copy.guestToilet = null;
            }
            if (this.petsAllowed!= null) {
                PetsAllowedType sourcePetsAllowed;
                sourcePetsAllowed = this.getPetsAllowed();
                PetsAllowedType copyPetsAllowed = ((PetsAllowedType) strategy.copy(LocatorUtils.property(locator, "petsAllowed", sourcePetsAllowed), sourcePetsAllowed));
                copy.setPetsAllowed(copyPetsAllowed);
            } else {
                copy.petsAllowed = null;
            }
            if (this.internetConnection!= null) {
                InternetConnectionType sourceInternetConnection;
                sourceInternetConnection = this.getInternetConnection();
                InternetConnectionType copyInternetConnection = ((InternetConnectionType) strategy.copy(LocatorUtils.property(locator, "internetConnection", sourceInternetConnection), sourceInternetConnection));
                copy.setInternetConnection(copyInternetConnection);
            } else {
                copy.internetConnection = null;
            }
            if (this.smokingAllowed!= null) {
                SmokingAllowedType sourceSmokingAllowed;
                sourceSmokingAllowed = this.getSmokingAllowed();
                SmokingAllowedType copySmokingAllowed = ((SmokingAllowedType) strategy.copy(LocatorUtils.property(locator, "smokingAllowed", sourceSmokingAllowed), sourceSmokingAllowed));
                copy.setSmokingAllowed(copySmokingAllowed);
            } else {
                copy.smokingAllowed = null;
            }
            if (this.requestedGender!= null) {
                FlatMateGenderType sourceRequestedGender;
                sourceRequestedGender = this.getRequestedGender();
                FlatMateGenderType copyRequestedGender = ((FlatMateGenderType) strategy.copy(LocatorUtils.property(locator, "requestedGender", sourceRequestedGender), sourceRequestedGender));
                copy.setRequestedGender(copyRequestedGender);
            } else {
                copy.requestedGender = null;
            }
            if (this.furnishing!= null) {
                YesNoNotApplicableType sourceFurnishing;
                sourceFurnishing = this.getFurnishing();
                YesNoNotApplicableType copyFurnishing = ((YesNoNotApplicableType) strategy.copy(LocatorUtils.property(locator, "furnishing", sourceFurnishing), sourceFurnishing));
                copy.setFurnishing(copyFurnishing);
            } else {
                copy.furnishing = null;
            }
            if (this.tvConnection!= null) {
                TvConnectionType sourceTvConnection;
                sourceTvConnection = this.getTvConnection();
                TvConnectionType copyTvConnection = ((TvConnectionType) strategy.copy(LocatorUtils.property(locator, "tvConnection", sourceTvConnection), sourceTvConnection));
                copy.setTvConnection(copyTvConnection);
            } else {
                copy.tvConnection = null;
            }
            if (this.telephoneConnection!= null) {
                TelephoneConnectionType sourceTelephoneConnection;
                sourceTelephoneConnection = this.getTelephoneConnection();
                TelephoneConnectionType copyTelephoneConnection = ((TelephoneConnectionType) strategy.copy(LocatorUtils.property(locator, "telephoneConnection", sourceTelephoneConnection), sourceTelephoneConnection));
                copy.setTelephoneConnection(copyTelephoneConnection);
            } else {
                copy.telephoneConnection = null;
            }
            if (this.parkingSituation!= null) {
                ParkingSituationType sourceParkingSituation;
                sourceParkingSituation = this.getParkingSituation();
                ParkingSituationType copyParkingSituation = ((ParkingSituationType) strategy.copy(LocatorUtils.property(locator, "parkingSituation", sourceParkingSituation), sourceParkingSituation));
                copy.setParkingSituation(copyParkingSituation);
            } else {
                copy.parkingSituation = null;
            }
            if (this.flatShareSize!= null) {
                Integer sourceFlatShareSize;
                sourceFlatShareSize = this.getFlatShareSize();
                Integer copyFlatShareSize = ((Integer) strategy.copy(LocatorUtils.property(locator, "flatShareSize", sourceFlatShareSize), sourceFlatShareSize));
                copy.setFlatShareSize(copyFlatShareSize);
            } else {
                copy.flatShareSize = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new FlatShareRoom();
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
        final FlatShareRoom that = ((FlatShareRoom) object);
        {
            BigDecimal lhsRoomSize;
            lhsRoomSize = this.getRoomSize();
            BigDecimal rhsRoomSize;
            rhsRoomSize = that.getRoomSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "roomSize", lhsRoomSize), LocatorUtils.property(thatLocator, "roomSize", rhsRoomSize), lhsRoomSize, rhsRoomSize)) {
                return false;
            }
        }
        {
            FlooringType lhsFlooringType;
            lhsFlooringType = this.getFlooringType();
            FlooringType rhsFlooringType;
            rhsFlooringType = that.getFlooringType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flooringType", lhsFlooringType), LocatorUtils.property(thatLocator, "flooringType", rhsFlooringType), lhsFlooringType, rhsFlooringType)) {
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
            ApartmentType lhsApartmentType;
            lhsApartmentType = this.getApartmentType();
            ApartmentType rhsApartmentType;
            rhsApartmentType = that.getApartmentType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "apartmentType", lhsApartmentType), LocatorUtils.property(thatLocator, "apartmentType", rhsApartmentType), lhsApartmentType, rhsApartmentType)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCellar;
            lhsCellar = this.getCellar();
            YesNotApplicableType rhsCellar;
            rhsCellar = that.getCellar();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cellar", lhsCellar), LocatorUtils.property(thatLocator, "cellar", rhsCellar), lhsCellar, rhsCellar)) {
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
            YesNotApplicableType lhsBarrierFree;
            lhsBarrierFree = this.getBarrierFree();
            YesNotApplicableType rhsBarrierFree;
            rhsBarrierFree = that.getBarrierFree();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "barrierFree", lhsBarrierFree), LocatorUtils.property(thatLocator, "barrierFree", rhsBarrierFree), lhsBarrierFree, rhsBarrierFree)) {
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
            EnergySourcesEnev2014 lhsEnergySourcesEnev2014;
            lhsEnergySourcesEnev2014 = this.getEnergySourcesEnev2014();
            EnergySourcesEnev2014 rhsEnergySourcesEnev2014;
            rhsEnergySourcesEnev2014 = that.getEnergySourcesEnev2014();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energySourcesEnev2014", lhsEnergySourcesEnev2014), LocatorUtils.property(thatLocator, "energySourcesEnev2014", rhsEnergySourcesEnev2014), lhsEnergySourcesEnev2014, rhsEnergySourcesEnev2014)) {
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
            BigDecimal lhsThermalCharacteristic;
            lhsThermalCharacteristic = this.getThermalCharacteristic();
            BigDecimal rhsThermalCharacteristic;
            rhsThermalCharacteristic = that.getThermalCharacteristic();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "thermalCharacteristic", lhsThermalCharacteristic), LocatorUtils.property(thatLocator, "thermalCharacteristic", rhsThermalCharacteristic), lhsThermalCharacteristic, rhsThermalCharacteristic)) {
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
            Integer lhsConstructionYear;
            lhsConstructionYear = this.getConstructionYear();
            Integer rhsConstructionYear;
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
            BigDecimal lhsBaseRent;
            lhsBaseRent = this.getBaseRent();
            BigDecimal rhsBaseRent;
            rhsBaseRent = that.getBaseRent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baseRent", lhsBaseRent), LocatorUtils.property(thatLocator, "baseRent", rhsBaseRent), lhsBaseRent, rhsBaseRent)) {
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
            BigDecimal lhsServiceCharge;
            lhsServiceCharge = this.getServiceCharge();
            BigDecimal rhsServiceCharge;
            rhsServiceCharge = that.getServiceCharge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceCharge", lhsServiceCharge), LocatorUtils.property(thatLocator, "serviceCharge", rhsServiceCharge), lhsServiceCharge, rhsServiceCharge)) {
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
            BigDecimal lhsHeatingCosts;
            lhsHeatingCosts = this.getHeatingCosts();
            BigDecimal rhsHeatingCosts;
            rhsHeatingCosts = that.getHeatingCosts();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heatingCosts", lhsHeatingCosts), LocatorUtils.property(thatLocator, "heatingCosts", rhsHeatingCosts), lhsHeatingCosts, rhsHeatingCosts)) {
                return false;
            }
        }
        {
            YesNoNotApplicableType lhsHeatingCostsInServiceCharge;
            lhsHeatingCostsInServiceCharge = this.getHeatingCostsInServiceCharge();
            YesNoNotApplicableType rhsHeatingCostsInServiceCharge;
            rhsHeatingCostsInServiceCharge = that.getHeatingCostsInServiceCharge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heatingCostsInServiceCharge", lhsHeatingCostsInServiceCharge), LocatorUtils.property(thatLocator, "heatingCostsInServiceCharge", rhsHeatingCostsInServiceCharge), lhsHeatingCostsInServiceCharge, rhsHeatingCostsInServiceCharge)) {
                return false;
            }
        }
        {
            Calendar lhsFreeFrom;
            lhsFreeFrom = this.getFreeFrom();
            Calendar rhsFreeFrom;
            rhsFreeFrom = that.getFreeFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freeFrom", lhsFreeFrom), LocatorUtils.property(thatLocator, "freeFrom", rhsFreeFrom), lhsFreeFrom, rhsFreeFrom)) {
                return false;
            }
        }
        {
            Calendar lhsFreeUntil;
            lhsFreeUntil = this.getFreeUntil();
            Calendar rhsFreeUntil;
            rhsFreeUntil = that.getFreeUntil();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freeUntil", lhsFreeUntil), LocatorUtils.property(thatLocator, "freeUntil", rhsFreeUntil), lhsFreeUntil, rhsFreeUntil)) {
                return false;
            }
        }
        {
            Long lhsMinimumTermOfLease;
            lhsMinimumTermOfLease = this.getMinimumTermOfLease();
            Long rhsMinimumTermOfLease;
            rhsMinimumTermOfLease = that.getMinimumTermOfLease();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumTermOfLease", lhsMinimumTermOfLease), LocatorUtils.property(thatLocator, "minimumTermOfLease", rhsMinimumTermOfLease), lhsMinimumTermOfLease, rhsMinimumTermOfLease)) {
                return false;
            }
        }
        {
            BigDecimal lhsTotalSpace;
            lhsTotalSpace = this.getTotalSpace();
            BigDecimal rhsTotalSpace;
            rhsTotalSpace = that.getTotalSpace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalSpace", lhsTotalSpace), LocatorUtils.property(thatLocator, "totalSpace", rhsTotalSpace), lhsTotalSpace, rhsTotalSpace)) {
                return false;
            }
        }
        {
            Long lhsNumberOfMaleFlatMates;
            lhsNumberOfMaleFlatMates = this.getNumberOfMaleFlatMates();
            Long rhsNumberOfMaleFlatMates;
            rhsNumberOfMaleFlatMates = that.getNumberOfMaleFlatMates();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfMaleFlatMates", lhsNumberOfMaleFlatMates), LocatorUtils.property(thatLocator, "numberOfMaleFlatMates", rhsNumberOfMaleFlatMates), lhsNumberOfMaleFlatMates, rhsNumberOfMaleFlatMates)) {
                return false;
            }
        }
        {
            Long lhsNumberOfFemaleFlatMates;
            lhsNumberOfFemaleFlatMates = this.getNumberOfFemaleFlatMates();
            Long rhsNumberOfFemaleFlatMates;
            rhsNumberOfFemaleFlatMates = that.getNumberOfFemaleFlatMates();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfFemaleFlatMates", lhsNumberOfFemaleFlatMates), LocatorUtils.property(thatLocator, "numberOfFemaleFlatMates", rhsNumberOfFemaleFlatMates), lhsNumberOfFemaleFlatMates, rhsNumberOfFemaleFlatMates)) {
                return false;
            }
        }
        {
            Long lhsAgeOfFlatMatesFrom;
            lhsAgeOfFlatMatesFrom = this.getAgeOfFlatMatesFrom();
            Long rhsAgeOfFlatMatesFrom;
            rhsAgeOfFlatMatesFrom = that.getAgeOfFlatMatesFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ageOfFlatMatesFrom", lhsAgeOfFlatMatesFrom), LocatorUtils.property(thatLocator, "ageOfFlatMatesFrom", rhsAgeOfFlatMatesFrom), lhsAgeOfFlatMatesFrom, rhsAgeOfFlatMatesFrom)) {
                return false;
            }
        }
        {
            Long lhsAgeOfFlatMatesTo;
            lhsAgeOfFlatMatesTo = this.getAgeOfFlatMatesTo();
            Long rhsAgeOfFlatMatesTo;
            rhsAgeOfFlatMatesTo = that.getAgeOfFlatMatesTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ageOfFlatMatesTo", lhsAgeOfFlatMatesTo), LocatorUtils.property(thatLocator, "ageOfFlatMatesTo", rhsAgeOfFlatMatesTo), lhsAgeOfFlatMatesTo, rhsAgeOfFlatMatesTo)) {
                return false;
            }
        }
        {
            Long lhsAgeOfRequestedFrom;
            lhsAgeOfRequestedFrom = this.getAgeOfRequestedFrom();
            Long rhsAgeOfRequestedFrom;
            rhsAgeOfRequestedFrom = that.getAgeOfRequestedFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ageOfRequestedFrom", lhsAgeOfRequestedFrom), LocatorUtils.property(thatLocator, "ageOfRequestedFrom", rhsAgeOfRequestedFrom), lhsAgeOfRequestedFrom, rhsAgeOfRequestedFrom)) {
                return false;
            }
        }
        {
            Long lhsAgeOfRequestedTo;
            lhsAgeOfRequestedTo = this.getAgeOfRequestedTo();
            Long rhsAgeOfRequestedTo;
            rhsAgeOfRequestedTo = that.getAgeOfRequestedTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ageOfRequestedTo", lhsAgeOfRequestedTo), LocatorUtils.property(thatLocator, "ageOfRequestedTo", rhsAgeOfRequestedTo), lhsAgeOfRequestedTo, rhsAgeOfRequestedTo)) {
                return false;
            }
        }
        {
            Long lhsNumberOfRequestedFlatMates;
            lhsNumberOfRequestedFlatMates = this.getNumberOfRequestedFlatMates();
            Long rhsNumberOfRequestedFlatMates;
            rhsNumberOfRequestedFlatMates = that.getNumberOfRequestedFlatMates();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfRequestedFlatMates", lhsNumberOfRequestedFlatMates), LocatorUtils.property(thatLocator, "numberOfRequestedFlatMates", rhsNumberOfRequestedFlatMates), lhsNumberOfRequestedFlatMates, rhsNumberOfRequestedFlatMates)) {
                return false;
            }
        }
        {
            Integer lhsFloor;
            lhsFloor = this.getFloor();
            Integer rhsFloor;
            rhsFloor = that.getFloor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "floor", lhsFloor), LocatorUtils.property(thatLocator, "floor", rhsFloor), lhsFloor, rhsFloor)) {
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
            Long lhsNumberOfBathRooms;
            lhsNumberOfBathRooms = this.getNumberOfBathRooms();
            Long rhsNumberOfBathRooms;
            rhsNumberOfBathRooms = that.getNumberOfBathRooms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfBathRooms", lhsNumberOfBathRooms), LocatorUtils.property(thatLocator, "numberOfBathRooms", rhsNumberOfBathRooms), lhsNumberOfBathRooms, rhsNumberOfBathRooms)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsBalcony;
            lhsBalcony = this.getBalcony();
            YesNotApplicableType rhsBalcony;
            rhsBalcony = that.getBalcony();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balcony", lhsBalcony), LocatorUtils.property(thatLocator, "balcony", rhsBalcony), lhsBalcony, rhsBalcony)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsGarden;
            lhsGarden = this.getGarden();
            YesNotApplicableType rhsGarden;
            rhsGarden = that.getGarden();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "garden", lhsGarden), LocatorUtils.property(thatLocator, "garden", rhsGarden), lhsGarden, rhsGarden)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsLift;
            lhsLift = this.getLift();
            YesNotApplicableType rhsLift;
            rhsLift = that.getLift();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lift", lhsLift), LocatorUtils.property(thatLocator, "lift", rhsLift), lhsLift, rhsLift)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsOven;
            lhsOven = this.getOven();
            YesNotApplicableType rhsOven;
            rhsOven = that.getOven();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oven", lhsOven), LocatorUtils.property(thatLocator, "oven", rhsOven), lhsOven, rhsOven)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsRefrigerator;
            lhsRefrigerator = this.getRefrigerator();
            YesNotApplicableType rhsRefrigerator;
            rhsRefrigerator = that.getRefrigerator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refrigerator", lhsRefrigerator), LocatorUtils.property(thatLocator, "refrigerator", rhsRefrigerator), lhsRefrigerator, rhsRefrigerator)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsStove;
            lhsStove = this.getStove();
            YesNotApplicableType rhsStove;
            rhsStove = that.getStove();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stove", lhsStove), LocatorUtils.property(thatLocator, "stove", rhsStove), lhsStove, rhsStove)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsDishwasher;
            lhsDishwasher = this.getDishwasher();
            YesNotApplicableType rhsDishwasher;
            rhsDishwasher = that.getDishwasher();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dishwasher", lhsDishwasher), LocatorUtils.property(thatLocator, "dishwasher", rhsDishwasher), lhsDishwasher, rhsDishwasher)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsWashingMachine;
            lhsWashingMachine = this.getWashingMachine();
            YesNotApplicableType rhsWashingMachine;
            rhsWashingMachine = that.getWashingMachine();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "washingMachine", lhsWashingMachine), LocatorUtils.property(thatLocator, "washingMachine", rhsWashingMachine), lhsWashingMachine, rhsWashingMachine)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsBathHasWc;
            lhsBathHasWc = this.getBathHasWc();
            YesNotApplicableType rhsBathHasWc;
            rhsBathHasWc = that.getBathHasWc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bathHasWc", lhsBathHasWc), LocatorUtils.property(thatLocator, "bathHasWc", rhsBathHasWc), lhsBathHasWc, rhsBathHasWc)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsBathHasShower;
            lhsBathHasShower = this.getBathHasShower();
            YesNotApplicableType rhsBathHasShower;
            rhsBathHasShower = that.getBathHasShower();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bathHasShower", lhsBathHasShower), LocatorUtils.property(thatLocator, "bathHasShower", rhsBathHasShower), lhsBathHasShower, rhsBathHasShower)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsBathHasTub;
            lhsBathHasTub = this.getBathHasTub();
            YesNotApplicableType rhsBathHasTub;
            rhsBathHasTub = that.getBathHasTub();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bathHasTub", lhsBathHasTub), LocatorUtils.property(thatLocator, "bathHasTub", rhsBathHasTub), lhsBathHasTub, rhsBathHasTub)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsGuestToilet;
            lhsGuestToilet = this.getGuestToilet();
            YesNotApplicableType rhsGuestToilet;
            rhsGuestToilet = that.getGuestToilet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "guestToilet", lhsGuestToilet), LocatorUtils.property(thatLocator, "guestToilet", rhsGuestToilet), lhsGuestToilet, rhsGuestToilet)) {
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
            InternetConnectionType lhsInternetConnection;
            lhsInternetConnection = this.getInternetConnection();
            InternetConnectionType rhsInternetConnection;
            rhsInternetConnection = that.getInternetConnection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "internetConnection", lhsInternetConnection), LocatorUtils.property(thatLocator, "internetConnection", rhsInternetConnection), lhsInternetConnection, rhsInternetConnection)) {
                return false;
            }
        }
        {
            SmokingAllowedType lhsSmokingAllowed;
            lhsSmokingAllowed = this.getSmokingAllowed();
            SmokingAllowedType rhsSmokingAllowed;
            rhsSmokingAllowed = that.getSmokingAllowed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "smokingAllowed", lhsSmokingAllowed), LocatorUtils.property(thatLocator, "smokingAllowed", rhsSmokingAllowed), lhsSmokingAllowed, rhsSmokingAllowed)) {
                return false;
            }
        }
        {
            FlatMateGenderType lhsRequestedGender;
            lhsRequestedGender = this.getRequestedGender();
            FlatMateGenderType rhsRequestedGender;
            rhsRequestedGender = that.getRequestedGender();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedGender", lhsRequestedGender), LocatorUtils.property(thatLocator, "requestedGender", rhsRequestedGender), lhsRequestedGender, rhsRequestedGender)) {
                return false;
            }
        }
        {
            YesNoNotApplicableType lhsFurnishing;
            lhsFurnishing = this.getFurnishing();
            YesNoNotApplicableType rhsFurnishing;
            rhsFurnishing = that.getFurnishing();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "furnishing", lhsFurnishing), LocatorUtils.property(thatLocator, "furnishing", rhsFurnishing), lhsFurnishing, rhsFurnishing)) {
                return false;
            }
        }
        {
            TvConnectionType lhsTvConnection;
            lhsTvConnection = this.getTvConnection();
            TvConnectionType rhsTvConnection;
            rhsTvConnection = that.getTvConnection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tvConnection", lhsTvConnection), LocatorUtils.property(thatLocator, "tvConnection", rhsTvConnection), lhsTvConnection, rhsTvConnection)) {
                return false;
            }
        }
        {
            TelephoneConnectionType lhsTelephoneConnection;
            lhsTelephoneConnection = this.getTelephoneConnection();
            TelephoneConnectionType rhsTelephoneConnection;
            rhsTelephoneConnection = that.getTelephoneConnection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telephoneConnection", lhsTelephoneConnection), LocatorUtils.property(thatLocator, "telephoneConnection", rhsTelephoneConnection), lhsTelephoneConnection, rhsTelephoneConnection)) {
                return false;
            }
        }
        {
            ParkingSituationType lhsParkingSituation;
            lhsParkingSituation = this.getParkingSituation();
            ParkingSituationType rhsParkingSituation;
            rhsParkingSituation = that.getParkingSituation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parkingSituation", lhsParkingSituation), LocatorUtils.property(thatLocator, "parkingSituation", rhsParkingSituation), lhsParkingSituation, rhsParkingSituation)) {
                return false;
            }
        }
        {
            Integer lhsFlatShareSize;
            lhsFlatShareSize = this.getFlatShareSize();
            Integer rhsFlatShareSize;
            rhsFlatShareSize = that.getFlatShareSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flatShareSize", lhsFlatShareSize), LocatorUtils.property(thatLocator, "flatShareSize", rhsFlatShareSize), lhsFlatShareSize, rhsFlatShareSize)) {
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
