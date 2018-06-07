
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
import org.openestate.is24.restapi.xml.Adapter5;
import org.openestate.is24.restapi.xml.common.Adapter10;
import org.openestate.is24.restapi.xml.common.BalconyAvailableType;
import org.openestate.is24.restapi.xml.common.BuildingEnergyRatingType;
import org.openestate.is24.restapi.xml.common.EnergyPerformanceCertificate;
import org.openestate.is24.restapi.xml.common.EnergySourcesEnev2014;
import org.openestate.is24.restapi.xml.common.FacilityType;
import org.openestate.is24.restapi.xml.common.HeatingTypeEnev2014;
import org.openestate.is24.restapi.xml.common.MarketingType;
import org.openestate.is24.restapi.xml.common.PetsAllowedType;
import org.openestate.is24.restapi.xml.common.Price;
import org.openestate.is24.restapi.xml.common.YesNotApplicableType;
import org.openestate.is24.restapi.xml.realestates.Adapter20;


/**
 * Eigenschaften f\u00fcr Seniorenwohnen Objekte.
 * 
 * <p>Java class for AssistedLiving complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssistedLiving"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/search/expose/1.0}ExposeRealEstate"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}ExtendedAssistedLivingGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssistedLiving", propOrder = {
    "shortDescription",
    "petsAllowed",
    "trialLivingPossible",
    "marketingType",
    "facilityType",
    "minBaseRent",
    "minPurchasePrice",
    "constructionYear",
    "constructionYearUnknown",
    "roomAvailableFrom",
    "roomAvailableTo",
    "cookingPossibilty",
    "parkingAvailable",
    "commonRoomsAvailable",
    "gardenAvailable",
    "fitnessAvailable",
    "poolAvailable",
    "publicTransportationAvailable",
    "ambulantNursingServiceAvailable",
    "emergencyCallInRoomAvailable",
    "receptionManned",
    "medicalAssistanceAvailable",
    "homeHelpAvailable",
    "counselingAvailable",
    "loansAvailable",
    "numberOfRoomsFrom",
    "numberOfRoomsTo",
    "energyCertificate",
    "heatingTypeEnev2014",
    "energySourcesEnev2014",
    "buildingEnergyRatingType",
    "thermalCharacteristic",
    "energyConsumptionContainsWarmWater",
    "barrierFree",
    "numberOfLookedAfterApartments",
    "numberOfNursingPlaces",
    "livingSpaceFrom",
    "livingSpaceTo",
    "handicappedAccessible",
    "guestApartmentsAvailable",
    "restaurantAvailable",
    "cookingFacilitiesAvailable",
    "ownFurniturePossible",
    "cleaningServiceAvailable",
    "shoppingFacilitiesAvailable",
    "security24Hours",
    "culturalProgramAvailable",
    "leisureActivitiesAvailable",
    "religiousOfferingsAvailable",
    "balconyAvailable",
    "branchEntry"
})
public class AssistedLiving
    extends ExposeRealEstate
    implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    protected String shortDescription;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PetsAllowedType petsAllowed;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType trialLivingPossible;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MarketingType marketingType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FacilityType facilityType;
    protected Price minBaseRent;
    protected Price minPurchasePrice;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long constructionYear;
    protected Boolean constructionYearUnknown;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Deprecated
    protected BigDecimal roomAvailableFrom;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Deprecated
    protected BigDecimal roomAvailableTo;
    @XmlSchemaType(name = "string")
    @Deprecated
    protected YesNotApplicableType cookingPossibilty;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType parkingAvailable;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType commonRoomsAvailable;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType gardenAvailable;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType fitnessAvailable;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType poolAvailable;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType publicTransportationAvailable;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType ambulantNursingServiceAvailable;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType emergencyCallInRoomAvailable;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType receptionManned;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType medicalAssistanceAvailable;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType homeHelpAvailable;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType counselingAvailable;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType loansAvailable;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter10 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal numberOfRoomsFrom;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter10 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal numberOfRoomsTo;
    protected EnergyPerformanceCertificate energyCertificate;
    @XmlSchemaType(name = "string")
    protected HeatingTypeEnev2014 heatingTypeEnev2014;
    protected EnergySourcesEnev2014 energySourcesEnev2014;
    @XmlSchemaType(name = "string")
    protected BuildingEnergyRatingType buildingEnergyRatingType;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter20 .class)
    protected BigDecimal thermalCharacteristic;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType energyConsumptionContainsWarmWater;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType barrierFree;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long numberOfLookedAfterApartments;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long numberOfNursingPlaces;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal livingSpaceFrom;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal livingSpaceTo;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType handicappedAccessible;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType guestApartmentsAvailable;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType restaurantAvailable;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType cookingFacilitiesAvailable;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType ownFurniturePossible;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType cleaningServiceAvailable;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType shoppingFacilitiesAvailable;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType security24Hours;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType culturalProgramAvailable;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType leisureActivitiesAvailable;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType religiousOfferingsAvailable;
    @XmlSchemaType(name = "string")
    protected BalconyAvailableType balconyAvailable;
    @XmlElement(defaultValue = "false")
    protected Boolean branchEntry;

    /**
     * Gets the value of the shortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
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
     * Gets the value of the trialLivingPossible property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getTrialLivingPossible() {
        return trialLivingPossible;
    }

    /**
     * Sets the value of the trialLivingPossible property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setTrialLivingPossible(YesNotApplicableType value) {
        this.trialLivingPossible = value;
    }

    /**
     * Gets the value of the marketingType property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingType }
     *     
     */
    public MarketingType getMarketingType() {
        return marketingType;
    }

    /**
     * Sets the value of the marketingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingType }
     *     
     */
    public void setMarketingType(MarketingType value) {
        this.marketingType = value;
    }

    /**
     * Gets the value of the facilityType property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityType }
     *     
     */
    public FacilityType getFacilityType() {
        return facilityType;
    }

    /**
     * Sets the value of the facilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityType }
     *     
     */
    public void setFacilityType(FacilityType value) {
        this.facilityType = value;
    }

    /**
     * Gets the value of the minBaseRent property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getMinBaseRent() {
        return minBaseRent;
    }

    /**
     * Sets the value of the minBaseRent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setMinBaseRent(Price value) {
        this.minBaseRent = value;
    }

    /**
     * Gets the value of the minPurchasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getMinPurchasePrice() {
        return minPurchasePrice;
    }

    /**
     * Sets the value of the minPurchasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setMinPurchasePrice(Price value) {
        this.minPurchasePrice = value;
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
     * Gets the value of the roomAvailableFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Deprecated
    public BigDecimal getRoomAvailableFrom() {
        return roomAvailableFrom;
    }

    /**
     * Sets the value of the roomAvailableFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Deprecated
    public void setRoomAvailableFrom(BigDecimal value) {
        this.roomAvailableFrom = value;
    }

    /**
     * Gets the value of the roomAvailableTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Deprecated
    public BigDecimal getRoomAvailableTo() {
        return roomAvailableTo;
    }

    /**
     * Sets the value of the roomAvailableTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Deprecated
    public void setRoomAvailableTo(BigDecimal value) {
        this.roomAvailableTo = value;
    }

    /**
     * Gets the value of the cookingPossibilty property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Deprecated
    public YesNotApplicableType getCookingPossibilty() {
        return cookingPossibilty;
    }

    /**
     * Sets the value of the cookingPossibilty property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Deprecated
    public void setCookingPossibilty(YesNotApplicableType value) {
        this.cookingPossibilty = value;
    }

    /**
     * Gets the value of the parkingAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getParkingAvailable() {
        return parkingAvailable;
    }

    /**
     * Sets the value of the parkingAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setParkingAvailable(YesNotApplicableType value) {
        this.parkingAvailable = value;
    }

    /**
     * Gets the value of the commonRoomsAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCommonRoomsAvailable() {
        return commonRoomsAvailable;
    }

    /**
     * Sets the value of the commonRoomsAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCommonRoomsAvailable(YesNotApplicableType value) {
        this.commonRoomsAvailable = value;
    }

    /**
     * Gets the value of the gardenAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getGardenAvailable() {
        return gardenAvailable;
    }

    /**
     * Sets the value of the gardenAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setGardenAvailable(YesNotApplicableType value) {
        this.gardenAvailable = value;
    }

    /**
     * Gets the value of the fitnessAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getFitnessAvailable() {
        return fitnessAvailable;
    }

    /**
     * Sets the value of the fitnessAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setFitnessAvailable(YesNotApplicableType value) {
        this.fitnessAvailable = value;
    }

    /**
     * Gets the value of the poolAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getPoolAvailable() {
        return poolAvailable;
    }

    /**
     * Sets the value of the poolAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setPoolAvailable(YesNotApplicableType value) {
        this.poolAvailable = value;
    }

    /**
     * Gets the value of the publicTransportationAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getPublicTransportationAvailable() {
        return publicTransportationAvailable;
    }

    /**
     * Sets the value of the publicTransportationAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setPublicTransportationAvailable(YesNotApplicableType value) {
        this.publicTransportationAvailable = value;
    }

    /**
     * Gets the value of the ambulantNursingServiceAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getAmbulantNursingServiceAvailable() {
        return ambulantNursingServiceAvailable;
    }

    /**
     * Sets the value of the ambulantNursingServiceAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setAmbulantNursingServiceAvailable(YesNotApplicableType value) {
        this.ambulantNursingServiceAvailable = value;
    }

    /**
     * Gets the value of the emergencyCallInRoomAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getEmergencyCallInRoomAvailable() {
        return emergencyCallInRoomAvailable;
    }

    /**
     * Sets the value of the emergencyCallInRoomAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setEmergencyCallInRoomAvailable(YesNotApplicableType value) {
        this.emergencyCallInRoomAvailable = value;
    }

    /**
     * Gets the value of the receptionManned property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getReceptionManned() {
        return receptionManned;
    }

    /**
     * Sets the value of the receptionManned property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setReceptionManned(YesNotApplicableType value) {
        this.receptionManned = value;
    }

    /**
     * Gets the value of the medicalAssistanceAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getMedicalAssistanceAvailable() {
        return medicalAssistanceAvailable;
    }

    /**
     * Sets the value of the medicalAssistanceAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setMedicalAssistanceAvailable(YesNotApplicableType value) {
        this.medicalAssistanceAvailable = value;
    }

    /**
     * Gets the value of the homeHelpAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getHomeHelpAvailable() {
        return homeHelpAvailable;
    }

    /**
     * Sets the value of the homeHelpAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setHomeHelpAvailable(YesNotApplicableType value) {
        this.homeHelpAvailable = value;
    }

    /**
     * Gets the value of the counselingAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCounselingAvailable() {
        return counselingAvailable;
    }

    /**
     * Sets the value of the counselingAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCounselingAvailable(YesNotApplicableType value) {
        this.counselingAvailable = value;
    }

    /**
     * Gets the value of the loansAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getLoansAvailable() {
        return loansAvailable;
    }

    /**
     * Sets the value of the loansAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setLoansAvailable(YesNotApplicableType value) {
        this.loansAvailable = value;
    }

    /**
     * Gets the value of the numberOfRoomsFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getNumberOfRoomsFrom() {
        return numberOfRoomsFrom;
    }

    /**
     * Sets the value of the numberOfRoomsFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfRoomsFrom(BigDecimal value) {
        this.numberOfRoomsFrom = value;
    }

    /**
     * Gets the value of the numberOfRoomsTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getNumberOfRoomsTo() {
        return numberOfRoomsTo;
    }

    /**
     * Sets the value of the numberOfRoomsTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfRoomsTo(BigDecimal value) {
        this.numberOfRoomsTo = value;
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
     * Gets the value of the numberOfLookedAfterApartments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getNumberOfLookedAfterApartments() {
        return numberOfLookedAfterApartments;
    }

    /**
     * Sets the value of the numberOfLookedAfterApartments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfLookedAfterApartments(Long value) {
        this.numberOfLookedAfterApartments = value;
    }

    /**
     * Gets the value of the numberOfNursingPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getNumberOfNursingPlaces() {
        return numberOfNursingPlaces;
    }

    /**
     * Sets the value of the numberOfNursingPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfNursingPlaces(Long value) {
        this.numberOfNursingPlaces = value;
    }

    /**
     * Gets the value of the livingSpaceFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getLivingSpaceFrom() {
        return livingSpaceFrom;
    }

    /**
     * Sets the value of the livingSpaceFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLivingSpaceFrom(BigDecimal value) {
        this.livingSpaceFrom = value;
    }

    /**
     * Gets the value of the livingSpaceTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getLivingSpaceTo() {
        return livingSpaceTo;
    }

    /**
     * Sets the value of the livingSpaceTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLivingSpaceTo(BigDecimal value) {
        this.livingSpaceTo = value;
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
     * Gets the value of the guestApartmentsAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getGuestApartmentsAvailable() {
        return guestApartmentsAvailable;
    }

    /**
     * Sets the value of the guestApartmentsAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setGuestApartmentsAvailable(YesNotApplicableType value) {
        this.guestApartmentsAvailable = value;
    }

    /**
     * Gets the value of the restaurantAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getRestaurantAvailable() {
        return restaurantAvailable;
    }

    /**
     * Sets the value of the restaurantAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setRestaurantAvailable(YesNotApplicableType value) {
        this.restaurantAvailable = value;
    }

    /**
     * Gets the value of the cookingFacilitiesAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCookingFacilitiesAvailable() {
        return cookingFacilitiesAvailable;
    }

    /**
     * Sets the value of the cookingFacilitiesAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCookingFacilitiesAvailable(YesNotApplicableType value) {
        this.cookingFacilitiesAvailable = value;
    }

    /**
     * Gets the value of the ownFurniturePossible property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getOwnFurniturePossible() {
        return ownFurniturePossible;
    }

    /**
     * Sets the value of the ownFurniturePossible property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setOwnFurniturePossible(YesNotApplicableType value) {
        this.ownFurniturePossible = value;
    }

    /**
     * Gets the value of the cleaningServiceAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCleaningServiceAvailable() {
        return cleaningServiceAvailable;
    }

    /**
     * Sets the value of the cleaningServiceAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCleaningServiceAvailable(YesNotApplicableType value) {
        this.cleaningServiceAvailable = value;
    }

    /**
     * Gets the value of the shoppingFacilitiesAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getShoppingFacilitiesAvailable() {
        return shoppingFacilitiesAvailable;
    }

    /**
     * Sets the value of the shoppingFacilitiesAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setShoppingFacilitiesAvailable(YesNotApplicableType value) {
        this.shoppingFacilitiesAvailable = value;
    }

    /**
     * Gets the value of the security24Hours property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getSecurity24Hours() {
        return security24Hours;
    }

    /**
     * Sets the value of the security24Hours property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setSecurity24Hours(YesNotApplicableType value) {
        this.security24Hours = value;
    }

    /**
     * Gets the value of the culturalProgramAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCulturalProgramAvailable() {
        return culturalProgramAvailable;
    }

    /**
     * Sets the value of the culturalProgramAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCulturalProgramAvailable(YesNotApplicableType value) {
        this.culturalProgramAvailable = value;
    }

    /**
     * Gets the value of the leisureActivitiesAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getLeisureActivitiesAvailable() {
        return leisureActivitiesAvailable;
    }

    /**
     * Sets the value of the leisureActivitiesAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setLeisureActivitiesAvailable(YesNotApplicableType value) {
        this.leisureActivitiesAvailable = value;
    }

    /**
     * Gets the value of the religiousOfferingsAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getReligiousOfferingsAvailable() {
        return religiousOfferingsAvailable;
    }

    /**
     * Sets the value of the religiousOfferingsAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setReligiousOfferingsAvailable(YesNotApplicableType value) {
        this.religiousOfferingsAvailable = value;
    }

    /**
     * Gets the value of the balconyAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link BalconyAvailableType }
     *     
     */
    public BalconyAvailableType getBalconyAvailable() {
        return balconyAvailable;
    }

    /**
     * Sets the value of the balconyAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalconyAvailableType }
     *     
     */
    public void setBalconyAvailable(BalconyAvailableType value) {
        this.balconyAvailable = value;
    }

    /**
     * Gets the value of the branchEntry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBranchEntry() {
        return branchEntry;
    }

    /**
     * Sets the value of the branchEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBranchEntry(Boolean value) {
        this.branchEntry = value;
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
            String theShortDescription;
            theShortDescription = this.getShortDescription();
            strategy.appendField(locator, this, "shortDescription", buffer, theShortDescription, (this.shortDescription!= null));
        }
        {
            PetsAllowedType thePetsAllowed;
            thePetsAllowed = this.getPetsAllowed();
            strategy.appendField(locator, this, "petsAllowed", buffer, thePetsAllowed, (this.petsAllowed!= null));
        }
        {
            YesNotApplicableType theTrialLivingPossible;
            theTrialLivingPossible = this.getTrialLivingPossible();
            strategy.appendField(locator, this, "trialLivingPossible", buffer, theTrialLivingPossible, (this.trialLivingPossible!= null));
        }
        {
            MarketingType theMarketingType;
            theMarketingType = this.getMarketingType();
            strategy.appendField(locator, this, "marketingType", buffer, theMarketingType, (this.marketingType!= null));
        }
        {
            FacilityType theFacilityType;
            theFacilityType = this.getFacilityType();
            strategy.appendField(locator, this, "facilityType", buffer, theFacilityType, (this.facilityType!= null));
        }
        {
            Price theMinBaseRent;
            theMinBaseRent = this.getMinBaseRent();
            strategy.appendField(locator, this, "minBaseRent", buffer, theMinBaseRent, (this.minBaseRent!= null));
        }
        {
            Price theMinPurchasePrice;
            theMinPurchasePrice = this.getMinPurchasePrice();
            strategy.appendField(locator, this, "minPurchasePrice", buffer, theMinPurchasePrice, (this.minPurchasePrice!= null));
        }
        {
            Long theConstructionYear;
            theConstructionYear = this.getConstructionYear();
            strategy.appendField(locator, this, "constructionYear", buffer, theConstructionYear, (this.constructionYear!= null));
        }
        {
            Boolean theConstructionYearUnknown;
            theConstructionYearUnknown = this.isConstructionYearUnknown();
            strategy.appendField(locator, this, "constructionYearUnknown", buffer, theConstructionYearUnknown, (this.constructionYearUnknown!= null));
        }
        {
            BigDecimal theRoomAvailableFrom;
            theRoomAvailableFrom = this.getRoomAvailableFrom();
            strategy.appendField(locator, this, "roomAvailableFrom", buffer, theRoomAvailableFrom, (this.roomAvailableFrom!= null));
        }
        {
            BigDecimal theRoomAvailableTo;
            theRoomAvailableTo = this.getRoomAvailableTo();
            strategy.appendField(locator, this, "roomAvailableTo", buffer, theRoomAvailableTo, (this.roomAvailableTo!= null));
        }
        {
            YesNotApplicableType theCookingPossibilty;
            theCookingPossibilty = this.getCookingPossibilty();
            strategy.appendField(locator, this, "cookingPossibilty", buffer, theCookingPossibilty, (this.cookingPossibilty!= null));
        }
        {
            YesNotApplicableType theParkingAvailable;
            theParkingAvailable = this.getParkingAvailable();
            strategy.appendField(locator, this, "parkingAvailable", buffer, theParkingAvailable, (this.parkingAvailable!= null));
        }
        {
            YesNotApplicableType theCommonRoomsAvailable;
            theCommonRoomsAvailable = this.getCommonRoomsAvailable();
            strategy.appendField(locator, this, "commonRoomsAvailable", buffer, theCommonRoomsAvailable, (this.commonRoomsAvailable!= null));
        }
        {
            YesNotApplicableType theGardenAvailable;
            theGardenAvailable = this.getGardenAvailable();
            strategy.appendField(locator, this, "gardenAvailable", buffer, theGardenAvailable, (this.gardenAvailable!= null));
        }
        {
            YesNotApplicableType theFitnessAvailable;
            theFitnessAvailable = this.getFitnessAvailable();
            strategy.appendField(locator, this, "fitnessAvailable", buffer, theFitnessAvailable, (this.fitnessAvailable!= null));
        }
        {
            YesNotApplicableType thePoolAvailable;
            thePoolAvailable = this.getPoolAvailable();
            strategy.appendField(locator, this, "poolAvailable", buffer, thePoolAvailable, (this.poolAvailable!= null));
        }
        {
            YesNotApplicableType thePublicTransportationAvailable;
            thePublicTransportationAvailable = this.getPublicTransportationAvailable();
            strategy.appendField(locator, this, "publicTransportationAvailable", buffer, thePublicTransportationAvailable, (this.publicTransportationAvailable!= null));
        }
        {
            YesNotApplicableType theAmbulantNursingServiceAvailable;
            theAmbulantNursingServiceAvailable = this.getAmbulantNursingServiceAvailable();
            strategy.appendField(locator, this, "ambulantNursingServiceAvailable", buffer, theAmbulantNursingServiceAvailable, (this.ambulantNursingServiceAvailable!= null));
        }
        {
            YesNotApplicableType theEmergencyCallInRoomAvailable;
            theEmergencyCallInRoomAvailable = this.getEmergencyCallInRoomAvailable();
            strategy.appendField(locator, this, "emergencyCallInRoomAvailable", buffer, theEmergencyCallInRoomAvailable, (this.emergencyCallInRoomAvailable!= null));
        }
        {
            YesNotApplicableType theReceptionManned;
            theReceptionManned = this.getReceptionManned();
            strategy.appendField(locator, this, "receptionManned", buffer, theReceptionManned, (this.receptionManned!= null));
        }
        {
            YesNotApplicableType theMedicalAssistanceAvailable;
            theMedicalAssistanceAvailable = this.getMedicalAssistanceAvailable();
            strategy.appendField(locator, this, "medicalAssistanceAvailable", buffer, theMedicalAssistanceAvailable, (this.medicalAssistanceAvailable!= null));
        }
        {
            YesNotApplicableType theHomeHelpAvailable;
            theHomeHelpAvailable = this.getHomeHelpAvailable();
            strategy.appendField(locator, this, "homeHelpAvailable", buffer, theHomeHelpAvailable, (this.homeHelpAvailable!= null));
        }
        {
            YesNotApplicableType theCounselingAvailable;
            theCounselingAvailable = this.getCounselingAvailable();
            strategy.appendField(locator, this, "counselingAvailable", buffer, theCounselingAvailable, (this.counselingAvailable!= null));
        }
        {
            YesNotApplicableType theLoansAvailable;
            theLoansAvailable = this.getLoansAvailable();
            strategy.appendField(locator, this, "loansAvailable", buffer, theLoansAvailable, (this.loansAvailable!= null));
        }
        {
            BigDecimal theNumberOfRoomsFrom;
            theNumberOfRoomsFrom = this.getNumberOfRoomsFrom();
            strategy.appendField(locator, this, "numberOfRoomsFrom", buffer, theNumberOfRoomsFrom, (this.numberOfRoomsFrom!= null));
        }
        {
            BigDecimal theNumberOfRoomsTo;
            theNumberOfRoomsTo = this.getNumberOfRoomsTo();
            strategy.appendField(locator, this, "numberOfRoomsTo", buffer, theNumberOfRoomsTo, (this.numberOfRoomsTo!= null));
        }
        {
            EnergyPerformanceCertificate theEnergyCertificate;
            theEnergyCertificate = this.getEnergyCertificate();
            strategy.appendField(locator, this, "energyCertificate", buffer, theEnergyCertificate, (this.energyCertificate!= null));
        }
        {
            HeatingTypeEnev2014 theHeatingTypeEnev2014;
            theHeatingTypeEnev2014 = this.getHeatingTypeEnev2014();
            strategy.appendField(locator, this, "heatingTypeEnev2014", buffer, theHeatingTypeEnev2014, (this.heatingTypeEnev2014 != null));
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
            YesNotApplicableType theBarrierFree;
            theBarrierFree = this.getBarrierFree();
            strategy.appendField(locator, this, "barrierFree", buffer, theBarrierFree, (this.barrierFree!= null));
        }
        {
            Long theNumberOfLookedAfterApartments;
            theNumberOfLookedAfterApartments = this.getNumberOfLookedAfterApartments();
            strategy.appendField(locator, this, "numberOfLookedAfterApartments", buffer, theNumberOfLookedAfterApartments, (this.numberOfLookedAfterApartments!= null));
        }
        {
            Long theNumberOfNursingPlaces;
            theNumberOfNursingPlaces = this.getNumberOfNursingPlaces();
            strategy.appendField(locator, this, "numberOfNursingPlaces", buffer, theNumberOfNursingPlaces, (this.numberOfNursingPlaces!= null));
        }
        {
            BigDecimal theLivingSpaceFrom;
            theLivingSpaceFrom = this.getLivingSpaceFrom();
            strategy.appendField(locator, this, "livingSpaceFrom", buffer, theLivingSpaceFrom, (this.livingSpaceFrom!= null));
        }
        {
            BigDecimal theLivingSpaceTo;
            theLivingSpaceTo = this.getLivingSpaceTo();
            strategy.appendField(locator, this, "livingSpaceTo", buffer, theLivingSpaceTo, (this.livingSpaceTo!= null));
        }
        {
            YesNotApplicableType theHandicappedAccessible;
            theHandicappedAccessible = this.getHandicappedAccessible();
            strategy.appendField(locator, this, "handicappedAccessible", buffer, theHandicappedAccessible, (this.handicappedAccessible!= null));
        }
        {
            YesNotApplicableType theGuestApartmentsAvailable;
            theGuestApartmentsAvailable = this.getGuestApartmentsAvailable();
            strategy.appendField(locator, this, "guestApartmentsAvailable", buffer, theGuestApartmentsAvailable, (this.guestApartmentsAvailable!= null));
        }
        {
            YesNotApplicableType theRestaurantAvailable;
            theRestaurantAvailable = this.getRestaurantAvailable();
            strategy.appendField(locator, this, "restaurantAvailable", buffer, theRestaurantAvailable, (this.restaurantAvailable!= null));
        }
        {
            YesNotApplicableType theCookingFacilitiesAvailable;
            theCookingFacilitiesAvailable = this.getCookingFacilitiesAvailable();
            strategy.appendField(locator, this, "cookingFacilitiesAvailable", buffer, theCookingFacilitiesAvailable, (this.cookingFacilitiesAvailable!= null));
        }
        {
            YesNotApplicableType theOwnFurniturePossible;
            theOwnFurniturePossible = this.getOwnFurniturePossible();
            strategy.appendField(locator, this, "ownFurniturePossible", buffer, theOwnFurniturePossible, (this.ownFurniturePossible!= null));
        }
        {
            YesNotApplicableType theCleaningServiceAvailable;
            theCleaningServiceAvailable = this.getCleaningServiceAvailable();
            strategy.appendField(locator, this, "cleaningServiceAvailable", buffer, theCleaningServiceAvailable, (this.cleaningServiceAvailable!= null));
        }
        {
            YesNotApplicableType theShoppingFacilitiesAvailable;
            theShoppingFacilitiesAvailable = this.getShoppingFacilitiesAvailable();
            strategy.appendField(locator, this, "shoppingFacilitiesAvailable", buffer, theShoppingFacilitiesAvailable, (this.shoppingFacilitiesAvailable!= null));
        }
        {
            YesNotApplicableType theSecurity24Hours;
            theSecurity24Hours = this.getSecurity24Hours();
            strategy.appendField(locator, this, "security24Hours", buffer, theSecurity24Hours, (this.security24Hours!= null));
        }
        {
            YesNotApplicableType theCulturalProgramAvailable;
            theCulturalProgramAvailable = this.getCulturalProgramAvailable();
            strategy.appendField(locator, this, "culturalProgramAvailable", buffer, theCulturalProgramAvailable, (this.culturalProgramAvailable!= null));
        }
        {
            YesNotApplicableType theLeisureActivitiesAvailable;
            theLeisureActivitiesAvailable = this.getLeisureActivitiesAvailable();
            strategy.appendField(locator, this, "leisureActivitiesAvailable", buffer, theLeisureActivitiesAvailable, (this.leisureActivitiesAvailable!= null));
        }
        {
            YesNotApplicableType theReligiousOfferingsAvailable;
            theReligiousOfferingsAvailable = this.getReligiousOfferingsAvailable();
            strategy.appendField(locator, this, "religiousOfferingsAvailable", buffer, theReligiousOfferingsAvailable, (this.religiousOfferingsAvailable!= null));
        }
        {
            BalconyAvailableType theBalconyAvailable;
            theBalconyAvailable = this.getBalconyAvailable();
            strategy.appendField(locator, this, "balconyAvailable", buffer, theBalconyAvailable, (this.balconyAvailable!= null));
        }
        {
            Boolean theBranchEntry;
            theBranchEntry = this.isBranchEntry();
            strategy.appendField(locator, this, "branchEntry", buffer, theBranchEntry, (this.branchEntry!= null));
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
        if (draftCopy instanceof AssistedLiving) {
            final AssistedLiving copy = ((AssistedLiving) draftCopy);
            {
                Boolean shortDescriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.shortDescription!= null));
                if (shortDescriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceShortDescription;
                    sourceShortDescription = this.getShortDescription();
                    String copyShortDescription = ((String) strategy.copy(LocatorUtils.property(locator, "shortDescription", sourceShortDescription), sourceShortDescription, (this.shortDescription!= null)));
                    copy.setShortDescription(copyShortDescription);
                } else {
                    if (shortDescriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.shortDescription = null;
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
                Boolean trialLivingPossibleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.trialLivingPossible!= null));
                if (trialLivingPossibleShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceTrialLivingPossible;
                    sourceTrialLivingPossible = this.getTrialLivingPossible();
                    YesNotApplicableType copyTrialLivingPossible = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "trialLivingPossible", sourceTrialLivingPossible), sourceTrialLivingPossible, (this.trialLivingPossible!= null)));
                    copy.setTrialLivingPossible(copyTrialLivingPossible);
                } else {
                    if (trialLivingPossibleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.trialLivingPossible = null;
                    }
                }
            }
            {
                Boolean marketingTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.marketingType!= null));
                if (marketingTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    MarketingType sourceMarketingType;
                    sourceMarketingType = this.getMarketingType();
                    MarketingType copyMarketingType = ((MarketingType) strategy.copy(LocatorUtils.property(locator, "marketingType", sourceMarketingType), sourceMarketingType, (this.marketingType!= null)));
                    copy.setMarketingType(copyMarketingType);
                } else {
                    if (marketingTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.marketingType = null;
                    }
                }
            }
            {
                Boolean facilityTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.facilityType!= null));
                if (facilityTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    FacilityType sourceFacilityType;
                    sourceFacilityType = this.getFacilityType();
                    FacilityType copyFacilityType = ((FacilityType) strategy.copy(LocatorUtils.property(locator, "facilityType", sourceFacilityType), sourceFacilityType, (this.facilityType!= null)));
                    copy.setFacilityType(copyFacilityType);
                } else {
                    if (facilityTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.facilityType = null;
                    }
                }
            }
            {
                Boolean minBaseRentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.minBaseRent!= null));
                if (minBaseRentShouldBeCopiedAndSet == Boolean.TRUE) {
                    Price sourceMinBaseRent;
                    sourceMinBaseRent = this.getMinBaseRent();
                    Price copyMinBaseRent = ((Price) strategy.copy(LocatorUtils.property(locator, "minBaseRent", sourceMinBaseRent), sourceMinBaseRent, (this.minBaseRent!= null)));
                    copy.setMinBaseRent(copyMinBaseRent);
                } else {
                    if (minBaseRentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.minBaseRent = null;
                    }
                }
            }
            {
                Boolean minPurchasePriceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.minPurchasePrice!= null));
                if (minPurchasePriceShouldBeCopiedAndSet == Boolean.TRUE) {
                    Price sourceMinPurchasePrice;
                    sourceMinPurchasePrice = this.getMinPurchasePrice();
                    Price copyMinPurchasePrice = ((Price) strategy.copy(LocatorUtils.property(locator, "minPurchasePrice", sourceMinPurchasePrice), sourceMinPurchasePrice, (this.minPurchasePrice!= null)));
                    copy.setMinPurchasePrice(copyMinPurchasePrice);
                } else {
                    if (minPurchasePriceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.minPurchasePrice = null;
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
                Boolean roomAvailableFromShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.roomAvailableFrom!= null));
                if (roomAvailableFromShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceRoomAvailableFrom;
                    sourceRoomAvailableFrom = this.getRoomAvailableFrom();
                    BigDecimal copyRoomAvailableFrom = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "roomAvailableFrom", sourceRoomAvailableFrom), sourceRoomAvailableFrom, (this.roomAvailableFrom!= null)));
                    copy.setRoomAvailableFrom(copyRoomAvailableFrom);
                } else {
                    if (roomAvailableFromShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.roomAvailableFrom = null;
                    }
                }
            }
            {
                Boolean roomAvailableToShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.roomAvailableTo!= null));
                if (roomAvailableToShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceRoomAvailableTo;
                    sourceRoomAvailableTo = this.getRoomAvailableTo();
                    BigDecimal copyRoomAvailableTo = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "roomAvailableTo", sourceRoomAvailableTo), sourceRoomAvailableTo, (this.roomAvailableTo!= null)));
                    copy.setRoomAvailableTo(copyRoomAvailableTo);
                } else {
                    if (roomAvailableToShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.roomAvailableTo = null;
                    }
                }
            }
            {
                Boolean cookingPossibiltyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.cookingPossibilty!= null));
                if (cookingPossibiltyShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceCookingPossibilty;
                    sourceCookingPossibilty = this.getCookingPossibilty();
                    YesNotApplicableType copyCookingPossibilty = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "cookingPossibilty", sourceCookingPossibilty), sourceCookingPossibilty, (this.cookingPossibilty!= null)));
                    copy.setCookingPossibilty(copyCookingPossibilty);
                } else {
                    if (cookingPossibiltyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cookingPossibilty = null;
                    }
                }
            }
            {
                Boolean parkingAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parkingAvailable!= null));
                if (parkingAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceParkingAvailable;
                    sourceParkingAvailable = this.getParkingAvailable();
                    YesNotApplicableType copyParkingAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "parkingAvailable", sourceParkingAvailable), sourceParkingAvailable, (this.parkingAvailable!= null)));
                    copy.setParkingAvailable(copyParkingAvailable);
                } else {
                    if (parkingAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.parkingAvailable = null;
                    }
                }
            }
            {
                Boolean commonRoomsAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.commonRoomsAvailable!= null));
                if (commonRoomsAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceCommonRoomsAvailable;
                    sourceCommonRoomsAvailable = this.getCommonRoomsAvailable();
                    YesNotApplicableType copyCommonRoomsAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "commonRoomsAvailable", sourceCommonRoomsAvailable), sourceCommonRoomsAvailable, (this.commonRoomsAvailable!= null)));
                    copy.setCommonRoomsAvailable(copyCommonRoomsAvailable);
                } else {
                    if (commonRoomsAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.commonRoomsAvailable = null;
                    }
                }
            }
            {
                Boolean gardenAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gardenAvailable!= null));
                if (gardenAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceGardenAvailable;
                    sourceGardenAvailable = this.getGardenAvailable();
                    YesNotApplicableType copyGardenAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "gardenAvailable", sourceGardenAvailable), sourceGardenAvailable, (this.gardenAvailable!= null)));
                    copy.setGardenAvailable(copyGardenAvailable);
                } else {
                    if (gardenAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gardenAvailable = null;
                    }
                }
            }
            {
                Boolean fitnessAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fitnessAvailable!= null));
                if (fitnessAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceFitnessAvailable;
                    sourceFitnessAvailable = this.getFitnessAvailable();
                    YesNotApplicableType copyFitnessAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "fitnessAvailable", sourceFitnessAvailable), sourceFitnessAvailable, (this.fitnessAvailable!= null)));
                    copy.setFitnessAvailable(copyFitnessAvailable);
                } else {
                    if (fitnessAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fitnessAvailable = null;
                    }
                }
            }
            {
                Boolean poolAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.poolAvailable!= null));
                if (poolAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourcePoolAvailable;
                    sourcePoolAvailable = this.getPoolAvailable();
                    YesNotApplicableType copyPoolAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "poolAvailable", sourcePoolAvailable), sourcePoolAvailable, (this.poolAvailable!= null)));
                    copy.setPoolAvailable(copyPoolAvailable);
                } else {
                    if (poolAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.poolAvailable = null;
                    }
                }
            }
            {
                Boolean publicTransportationAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.publicTransportationAvailable!= null));
                if (publicTransportationAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourcePublicTransportationAvailable;
                    sourcePublicTransportationAvailable = this.getPublicTransportationAvailable();
                    YesNotApplicableType copyPublicTransportationAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "publicTransportationAvailable", sourcePublicTransportationAvailable), sourcePublicTransportationAvailable, (this.publicTransportationAvailable!= null)));
                    copy.setPublicTransportationAvailable(copyPublicTransportationAvailable);
                } else {
                    if (publicTransportationAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.publicTransportationAvailable = null;
                    }
                }
            }
            {
                Boolean ambulantNursingServiceAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ambulantNursingServiceAvailable!= null));
                if (ambulantNursingServiceAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceAmbulantNursingServiceAvailable;
                    sourceAmbulantNursingServiceAvailable = this.getAmbulantNursingServiceAvailable();
                    YesNotApplicableType copyAmbulantNursingServiceAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "ambulantNursingServiceAvailable", sourceAmbulantNursingServiceAvailable), sourceAmbulantNursingServiceAvailable, (this.ambulantNursingServiceAvailable!= null)));
                    copy.setAmbulantNursingServiceAvailable(copyAmbulantNursingServiceAvailable);
                } else {
                    if (ambulantNursingServiceAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ambulantNursingServiceAvailable = null;
                    }
                }
            }
            {
                Boolean emergencyCallInRoomAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.emergencyCallInRoomAvailable!= null));
                if (emergencyCallInRoomAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceEmergencyCallInRoomAvailable;
                    sourceEmergencyCallInRoomAvailable = this.getEmergencyCallInRoomAvailable();
                    YesNotApplicableType copyEmergencyCallInRoomAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "emergencyCallInRoomAvailable", sourceEmergencyCallInRoomAvailable), sourceEmergencyCallInRoomAvailable, (this.emergencyCallInRoomAvailable!= null)));
                    copy.setEmergencyCallInRoomAvailable(copyEmergencyCallInRoomAvailable);
                } else {
                    if (emergencyCallInRoomAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.emergencyCallInRoomAvailable = null;
                    }
                }
            }
            {
                Boolean receptionMannedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.receptionManned!= null));
                if (receptionMannedShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceReceptionManned;
                    sourceReceptionManned = this.getReceptionManned();
                    YesNotApplicableType copyReceptionManned = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "receptionManned", sourceReceptionManned), sourceReceptionManned, (this.receptionManned!= null)));
                    copy.setReceptionManned(copyReceptionManned);
                } else {
                    if (receptionMannedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.receptionManned = null;
                    }
                }
            }
            {
                Boolean medicalAssistanceAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.medicalAssistanceAvailable!= null));
                if (medicalAssistanceAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceMedicalAssistanceAvailable;
                    sourceMedicalAssistanceAvailable = this.getMedicalAssistanceAvailable();
                    YesNotApplicableType copyMedicalAssistanceAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "medicalAssistanceAvailable", sourceMedicalAssistanceAvailable), sourceMedicalAssistanceAvailable, (this.medicalAssistanceAvailable!= null)));
                    copy.setMedicalAssistanceAvailable(copyMedicalAssistanceAvailable);
                } else {
                    if (medicalAssistanceAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.medicalAssistanceAvailable = null;
                    }
                }
            }
            {
                Boolean homeHelpAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.homeHelpAvailable!= null));
                if (homeHelpAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceHomeHelpAvailable;
                    sourceHomeHelpAvailable = this.getHomeHelpAvailable();
                    YesNotApplicableType copyHomeHelpAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "homeHelpAvailable", sourceHomeHelpAvailable), sourceHomeHelpAvailable, (this.homeHelpAvailable!= null)));
                    copy.setHomeHelpAvailable(copyHomeHelpAvailable);
                } else {
                    if (homeHelpAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.homeHelpAvailable = null;
                    }
                }
            }
            {
                Boolean counselingAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.counselingAvailable!= null));
                if (counselingAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceCounselingAvailable;
                    sourceCounselingAvailable = this.getCounselingAvailable();
                    YesNotApplicableType copyCounselingAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "counselingAvailable", sourceCounselingAvailable), sourceCounselingAvailable, (this.counselingAvailable!= null)));
                    copy.setCounselingAvailable(copyCounselingAvailable);
                } else {
                    if (counselingAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.counselingAvailable = null;
                    }
                }
            }
            {
                Boolean loansAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.loansAvailable!= null));
                if (loansAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceLoansAvailable;
                    sourceLoansAvailable = this.getLoansAvailable();
                    YesNotApplicableType copyLoansAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "loansAvailable", sourceLoansAvailable), sourceLoansAvailable, (this.loansAvailable!= null)));
                    copy.setLoansAvailable(copyLoansAvailable);
                } else {
                    if (loansAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.loansAvailable = null;
                    }
                }
            }
            {
                Boolean numberOfRoomsFromShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfRoomsFrom!= null));
                if (numberOfRoomsFromShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceNumberOfRoomsFrom;
                    sourceNumberOfRoomsFrom = this.getNumberOfRoomsFrom();
                    BigDecimal copyNumberOfRoomsFrom = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "numberOfRoomsFrom", sourceNumberOfRoomsFrom), sourceNumberOfRoomsFrom, (this.numberOfRoomsFrom!= null)));
                    copy.setNumberOfRoomsFrom(copyNumberOfRoomsFrom);
                } else {
                    if (numberOfRoomsFromShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfRoomsFrom = null;
                    }
                }
            }
            {
                Boolean numberOfRoomsToShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfRoomsTo!= null));
                if (numberOfRoomsToShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceNumberOfRoomsTo;
                    sourceNumberOfRoomsTo = this.getNumberOfRoomsTo();
                    BigDecimal copyNumberOfRoomsTo = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "numberOfRoomsTo", sourceNumberOfRoomsTo), sourceNumberOfRoomsTo, (this.numberOfRoomsTo!= null)));
                    copy.setNumberOfRoomsTo(copyNumberOfRoomsTo);
                } else {
                    if (numberOfRoomsToShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfRoomsTo = null;
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
                Boolean numberOfLookedAfterApartmentsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfLookedAfterApartments!= null));
                if (numberOfLookedAfterApartmentsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceNumberOfLookedAfterApartments;
                    sourceNumberOfLookedAfterApartments = this.getNumberOfLookedAfterApartments();
                    Long copyNumberOfLookedAfterApartments = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfLookedAfterApartments", sourceNumberOfLookedAfterApartments), sourceNumberOfLookedAfterApartments, (this.numberOfLookedAfterApartments!= null)));
                    copy.setNumberOfLookedAfterApartments(copyNumberOfLookedAfterApartments);
                } else {
                    if (numberOfLookedAfterApartmentsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfLookedAfterApartments = null;
                    }
                }
            }
            {
                Boolean numberOfNursingPlacesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfNursingPlaces!= null));
                if (numberOfNursingPlacesShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceNumberOfNursingPlaces;
                    sourceNumberOfNursingPlaces = this.getNumberOfNursingPlaces();
                    Long copyNumberOfNursingPlaces = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfNursingPlaces", sourceNumberOfNursingPlaces), sourceNumberOfNursingPlaces, (this.numberOfNursingPlaces!= null)));
                    copy.setNumberOfNursingPlaces(copyNumberOfNursingPlaces);
                } else {
                    if (numberOfNursingPlacesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfNursingPlaces = null;
                    }
                }
            }
            {
                Boolean livingSpaceFromShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.livingSpaceFrom!= null));
                if (livingSpaceFromShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceLivingSpaceFrom;
                    sourceLivingSpaceFrom = this.getLivingSpaceFrom();
                    BigDecimal copyLivingSpaceFrom = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "livingSpaceFrom", sourceLivingSpaceFrom), sourceLivingSpaceFrom, (this.livingSpaceFrom!= null)));
                    copy.setLivingSpaceFrom(copyLivingSpaceFrom);
                } else {
                    if (livingSpaceFromShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.livingSpaceFrom = null;
                    }
                }
            }
            {
                Boolean livingSpaceToShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.livingSpaceTo!= null));
                if (livingSpaceToShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceLivingSpaceTo;
                    sourceLivingSpaceTo = this.getLivingSpaceTo();
                    BigDecimal copyLivingSpaceTo = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "livingSpaceTo", sourceLivingSpaceTo), sourceLivingSpaceTo, (this.livingSpaceTo!= null)));
                    copy.setLivingSpaceTo(copyLivingSpaceTo);
                } else {
                    if (livingSpaceToShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.livingSpaceTo = null;
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
                Boolean guestApartmentsAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.guestApartmentsAvailable!= null));
                if (guestApartmentsAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceGuestApartmentsAvailable;
                    sourceGuestApartmentsAvailable = this.getGuestApartmentsAvailable();
                    YesNotApplicableType copyGuestApartmentsAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "guestApartmentsAvailable", sourceGuestApartmentsAvailable), sourceGuestApartmentsAvailable, (this.guestApartmentsAvailable!= null)));
                    copy.setGuestApartmentsAvailable(copyGuestApartmentsAvailable);
                } else {
                    if (guestApartmentsAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.guestApartmentsAvailable = null;
                    }
                }
            }
            {
                Boolean restaurantAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.restaurantAvailable!= null));
                if (restaurantAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceRestaurantAvailable;
                    sourceRestaurantAvailable = this.getRestaurantAvailable();
                    YesNotApplicableType copyRestaurantAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "restaurantAvailable", sourceRestaurantAvailable), sourceRestaurantAvailable, (this.restaurantAvailable!= null)));
                    copy.setRestaurantAvailable(copyRestaurantAvailable);
                } else {
                    if (restaurantAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.restaurantAvailable = null;
                    }
                }
            }
            {
                Boolean cookingFacilitiesAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.cookingFacilitiesAvailable!= null));
                if (cookingFacilitiesAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceCookingFacilitiesAvailable;
                    sourceCookingFacilitiesAvailable = this.getCookingFacilitiesAvailable();
                    YesNotApplicableType copyCookingFacilitiesAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "cookingFacilitiesAvailable", sourceCookingFacilitiesAvailable), sourceCookingFacilitiesAvailable, (this.cookingFacilitiesAvailable!= null)));
                    copy.setCookingFacilitiesAvailable(copyCookingFacilitiesAvailable);
                } else {
                    if (cookingFacilitiesAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cookingFacilitiesAvailable = null;
                    }
                }
            }
            {
                Boolean ownFurniturePossibleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ownFurniturePossible!= null));
                if (ownFurniturePossibleShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceOwnFurniturePossible;
                    sourceOwnFurniturePossible = this.getOwnFurniturePossible();
                    YesNotApplicableType copyOwnFurniturePossible = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "ownFurniturePossible", sourceOwnFurniturePossible), sourceOwnFurniturePossible, (this.ownFurniturePossible!= null)));
                    copy.setOwnFurniturePossible(copyOwnFurniturePossible);
                } else {
                    if (ownFurniturePossibleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ownFurniturePossible = null;
                    }
                }
            }
            {
                Boolean cleaningServiceAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.cleaningServiceAvailable!= null));
                if (cleaningServiceAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceCleaningServiceAvailable;
                    sourceCleaningServiceAvailable = this.getCleaningServiceAvailable();
                    YesNotApplicableType copyCleaningServiceAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "cleaningServiceAvailable", sourceCleaningServiceAvailable), sourceCleaningServiceAvailable, (this.cleaningServiceAvailable!= null)));
                    copy.setCleaningServiceAvailable(copyCleaningServiceAvailable);
                } else {
                    if (cleaningServiceAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cleaningServiceAvailable = null;
                    }
                }
            }
            {
                Boolean shoppingFacilitiesAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.shoppingFacilitiesAvailable!= null));
                if (shoppingFacilitiesAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceShoppingFacilitiesAvailable;
                    sourceShoppingFacilitiesAvailable = this.getShoppingFacilitiesAvailable();
                    YesNotApplicableType copyShoppingFacilitiesAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "shoppingFacilitiesAvailable", sourceShoppingFacilitiesAvailable), sourceShoppingFacilitiesAvailable, (this.shoppingFacilitiesAvailable!= null)));
                    copy.setShoppingFacilitiesAvailable(copyShoppingFacilitiesAvailable);
                } else {
                    if (shoppingFacilitiesAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.shoppingFacilitiesAvailable = null;
                    }
                }
            }
            {
                Boolean security24HoursShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.security24Hours!= null));
                if (security24HoursShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceSecurity24Hours;
                    sourceSecurity24Hours = this.getSecurity24Hours();
                    YesNotApplicableType copySecurity24Hours = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "security24Hours", sourceSecurity24Hours), sourceSecurity24Hours, (this.security24Hours!= null)));
                    copy.setSecurity24Hours(copySecurity24Hours);
                } else {
                    if (security24HoursShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.security24Hours = null;
                    }
                }
            }
            {
                Boolean culturalProgramAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.culturalProgramAvailable!= null));
                if (culturalProgramAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceCulturalProgramAvailable;
                    sourceCulturalProgramAvailable = this.getCulturalProgramAvailable();
                    YesNotApplicableType copyCulturalProgramAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "culturalProgramAvailable", sourceCulturalProgramAvailable), sourceCulturalProgramAvailable, (this.culturalProgramAvailable!= null)));
                    copy.setCulturalProgramAvailable(copyCulturalProgramAvailable);
                } else {
                    if (culturalProgramAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.culturalProgramAvailable = null;
                    }
                }
            }
            {
                Boolean leisureActivitiesAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.leisureActivitiesAvailable!= null));
                if (leisureActivitiesAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceLeisureActivitiesAvailable;
                    sourceLeisureActivitiesAvailable = this.getLeisureActivitiesAvailable();
                    YesNotApplicableType copyLeisureActivitiesAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "leisureActivitiesAvailable", sourceLeisureActivitiesAvailable), sourceLeisureActivitiesAvailable, (this.leisureActivitiesAvailable!= null)));
                    copy.setLeisureActivitiesAvailable(copyLeisureActivitiesAvailable);
                } else {
                    if (leisureActivitiesAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.leisureActivitiesAvailable = null;
                    }
                }
            }
            {
                Boolean religiousOfferingsAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.religiousOfferingsAvailable!= null));
                if (religiousOfferingsAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceReligiousOfferingsAvailable;
                    sourceReligiousOfferingsAvailable = this.getReligiousOfferingsAvailable();
                    YesNotApplicableType copyReligiousOfferingsAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "religiousOfferingsAvailable", sourceReligiousOfferingsAvailable), sourceReligiousOfferingsAvailable, (this.religiousOfferingsAvailable!= null)));
                    copy.setReligiousOfferingsAvailable(copyReligiousOfferingsAvailable);
                } else {
                    if (religiousOfferingsAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.religiousOfferingsAvailable = null;
                    }
                }
            }
            {
                Boolean balconyAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.balconyAvailable!= null));
                if (balconyAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    BalconyAvailableType sourceBalconyAvailable;
                    sourceBalconyAvailable = this.getBalconyAvailable();
                    BalconyAvailableType copyBalconyAvailable = ((BalconyAvailableType) strategy.copy(LocatorUtils.property(locator, "balconyAvailable", sourceBalconyAvailable), sourceBalconyAvailable, (this.balconyAvailable!= null)));
                    copy.setBalconyAvailable(copyBalconyAvailable);
                } else {
                    if (balconyAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.balconyAvailable = null;
                    }
                }
            }
            {
                Boolean branchEntryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.branchEntry!= null));
                if (branchEntryShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBranchEntry;
                    sourceBranchEntry = this.isBranchEntry();
                    Boolean copyBranchEntry = ((Boolean) strategy.copy(LocatorUtils.property(locator, "branchEntry", sourceBranchEntry), sourceBranchEntry, (this.branchEntry!= null)));
                    copy.setBranchEntry(copyBranchEntry);
                } else {
                    if (branchEntryShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.branchEntry = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new AssistedLiving();
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
        final AssistedLiving that = ((AssistedLiving) object);
        {
            String lhsShortDescription;
            lhsShortDescription = this.getShortDescription();
            String rhsShortDescription;
            rhsShortDescription = that.getShortDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shortDescription", lhsShortDescription), LocatorUtils.property(thatLocator, "shortDescription", rhsShortDescription), lhsShortDescription, rhsShortDescription, (this.shortDescription!= null), (that.shortDescription!= null))) {
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
            YesNotApplicableType lhsTrialLivingPossible;
            lhsTrialLivingPossible = this.getTrialLivingPossible();
            YesNotApplicableType rhsTrialLivingPossible;
            rhsTrialLivingPossible = that.getTrialLivingPossible();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trialLivingPossible", lhsTrialLivingPossible), LocatorUtils.property(thatLocator, "trialLivingPossible", rhsTrialLivingPossible), lhsTrialLivingPossible, rhsTrialLivingPossible, (this.trialLivingPossible!= null), (that.trialLivingPossible!= null))) {
                return false;
            }
        }
        {
            MarketingType lhsMarketingType;
            lhsMarketingType = this.getMarketingType();
            MarketingType rhsMarketingType;
            rhsMarketingType = that.getMarketingType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "marketingType", lhsMarketingType), LocatorUtils.property(thatLocator, "marketingType", rhsMarketingType), lhsMarketingType, rhsMarketingType, (this.marketingType!= null), (that.marketingType!= null))) {
                return false;
            }
        }
        {
            FacilityType lhsFacilityType;
            lhsFacilityType = this.getFacilityType();
            FacilityType rhsFacilityType;
            rhsFacilityType = that.getFacilityType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "facilityType", lhsFacilityType), LocatorUtils.property(thatLocator, "facilityType", rhsFacilityType), lhsFacilityType, rhsFacilityType, (this.facilityType!= null), (that.facilityType!= null))) {
                return false;
            }
        }
        {
            Price lhsMinBaseRent;
            lhsMinBaseRent = this.getMinBaseRent();
            Price rhsMinBaseRent;
            rhsMinBaseRent = that.getMinBaseRent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minBaseRent", lhsMinBaseRent), LocatorUtils.property(thatLocator, "minBaseRent", rhsMinBaseRent), lhsMinBaseRent, rhsMinBaseRent, (this.minBaseRent!= null), (that.minBaseRent!= null))) {
                return false;
            }
        }
        {
            Price lhsMinPurchasePrice;
            lhsMinPurchasePrice = this.getMinPurchasePrice();
            Price rhsMinPurchasePrice;
            rhsMinPurchasePrice = that.getMinPurchasePrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minPurchasePrice", lhsMinPurchasePrice), LocatorUtils.property(thatLocator, "minPurchasePrice", rhsMinPurchasePrice), lhsMinPurchasePrice, rhsMinPurchasePrice, (this.minPurchasePrice!= null), (that.minPurchasePrice!= null))) {
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
            lhsConstructionYearUnknown = this.isConstructionYearUnknown();
            Boolean rhsConstructionYearUnknown;
            rhsConstructionYearUnknown = that.isConstructionYearUnknown();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "constructionYearUnknown", lhsConstructionYearUnknown), LocatorUtils.property(thatLocator, "constructionYearUnknown", rhsConstructionYearUnknown), lhsConstructionYearUnknown, rhsConstructionYearUnknown, (this.constructionYearUnknown!= null), (that.constructionYearUnknown!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsRoomAvailableFrom;
            lhsRoomAvailableFrom = this.getRoomAvailableFrom();
            BigDecimal rhsRoomAvailableFrom;
            rhsRoomAvailableFrom = that.getRoomAvailableFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "roomAvailableFrom", lhsRoomAvailableFrom), LocatorUtils.property(thatLocator, "roomAvailableFrom", rhsRoomAvailableFrom), lhsRoomAvailableFrom, rhsRoomAvailableFrom, (this.roomAvailableFrom!= null), (that.roomAvailableFrom!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsRoomAvailableTo;
            lhsRoomAvailableTo = this.getRoomAvailableTo();
            BigDecimal rhsRoomAvailableTo;
            rhsRoomAvailableTo = that.getRoomAvailableTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "roomAvailableTo", lhsRoomAvailableTo), LocatorUtils.property(thatLocator, "roomAvailableTo", rhsRoomAvailableTo), lhsRoomAvailableTo, rhsRoomAvailableTo, (this.roomAvailableTo!= null), (that.roomAvailableTo!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCookingPossibilty;
            lhsCookingPossibilty = this.getCookingPossibilty();
            YesNotApplicableType rhsCookingPossibilty;
            rhsCookingPossibilty = that.getCookingPossibilty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cookingPossibilty", lhsCookingPossibilty), LocatorUtils.property(thatLocator, "cookingPossibilty", rhsCookingPossibilty), lhsCookingPossibilty, rhsCookingPossibilty, (this.cookingPossibilty!= null), (that.cookingPossibilty!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsParkingAvailable;
            lhsParkingAvailable = this.getParkingAvailable();
            YesNotApplicableType rhsParkingAvailable;
            rhsParkingAvailable = that.getParkingAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parkingAvailable", lhsParkingAvailable), LocatorUtils.property(thatLocator, "parkingAvailable", rhsParkingAvailable), lhsParkingAvailable, rhsParkingAvailable, (this.parkingAvailable!= null), (that.parkingAvailable!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCommonRoomsAvailable;
            lhsCommonRoomsAvailable = this.getCommonRoomsAvailable();
            YesNotApplicableType rhsCommonRoomsAvailable;
            rhsCommonRoomsAvailable = that.getCommonRoomsAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commonRoomsAvailable", lhsCommonRoomsAvailable), LocatorUtils.property(thatLocator, "commonRoomsAvailable", rhsCommonRoomsAvailable), lhsCommonRoomsAvailable, rhsCommonRoomsAvailable, (this.commonRoomsAvailable!= null), (that.commonRoomsAvailable!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsGardenAvailable;
            lhsGardenAvailable = this.getGardenAvailable();
            YesNotApplicableType rhsGardenAvailable;
            rhsGardenAvailable = that.getGardenAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gardenAvailable", lhsGardenAvailable), LocatorUtils.property(thatLocator, "gardenAvailable", rhsGardenAvailable), lhsGardenAvailable, rhsGardenAvailable, (this.gardenAvailable!= null), (that.gardenAvailable!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsFitnessAvailable;
            lhsFitnessAvailable = this.getFitnessAvailable();
            YesNotApplicableType rhsFitnessAvailable;
            rhsFitnessAvailable = that.getFitnessAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fitnessAvailable", lhsFitnessAvailable), LocatorUtils.property(thatLocator, "fitnessAvailable", rhsFitnessAvailable), lhsFitnessAvailable, rhsFitnessAvailable, (this.fitnessAvailable!= null), (that.fitnessAvailable!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsPoolAvailable;
            lhsPoolAvailable = this.getPoolAvailable();
            YesNotApplicableType rhsPoolAvailable;
            rhsPoolAvailable = that.getPoolAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "poolAvailable", lhsPoolAvailable), LocatorUtils.property(thatLocator, "poolAvailable", rhsPoolAvailable), lhsPoolAvailable, rhsPoolAvailable, (this.poolAvailable!= null), (that.poolAvailable!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsPublicTransportationAvailable;
            lhsPublicTransportationAvailable = this.getPublicTransportationAvailable();
            YesNotApplicableType rhsPublicTransportationAvailable;
            rhsPublicTransportationAvailable = that.getPublicTransportationAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publicTransportationAvailable", lhsPublicTransportationAvailable), LocatorUtils.property(thatLocator, "publicTransportationAvailable", rhsPublicTransportationAvailable), lhsPublicTransportationAvailable, rhsPublicTransportationAvailable, (this.publicTransportationAvailable!= null), (that.publicTransportationAvailable!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsAmbulantNursingServiceAvailable;
            lhsAmbulantNursingServiceAvailable = this.getAmbulantNursingServiceAvailable();
            YesNotApplicableType rhsAmbulantNursingServiceAvailable;
            rhsAmbulantNursingServiceAvailable = that.getAmbulantNursingServiceAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ambulantNursingServiceAvailable", lhsAmbulantNursingServiceAvailable), LocatorUtils.property(thatLocator, "ambulantNursingServiceAvailable", rhsAmbulantNursingServiceAvailable), lhsAmbulantNursingServiceAvailable, rhsAmbulantNursingServiceAvailable, (this.ambulantNursingServiceAvailable!= null), (that.ambulantNursingServiceAvailable!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsEmergencyCallInRoomAvailable;
            lhsEmergencyCallInRoomAvailable = this.getEmergencyCallInRoomAvailable();
            YesNotApplicableType rhsEmergencyCallInRoomAvailable;
            rhsEmergencyCallInRoomAvailable = that.getEmergencyCallInRoomAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emergencyCallInRoomAvailable", lhsEmergencyCallInRoomAvailable), LocatorUtils.property(thatLocator, "emergencyCallInRoomAvailable", rhsEmergencyCallInRoomAvailable), lhsEmergencyCallInRoomAvailable, rhsEmergencyCallInRoomAvailable, (this.emergencyCallInRoomAvailable!= null), (that.emergencyCallInRoomAvailable!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsReceptionManned;
            lhsReceptionManned = this.getReceptionManned();
            YesNotApplicableType rhsReceptionManned;
            rhsReceptionManned = that.getReceptionManned();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "receptionManned", lhsReceptionManned), LocatorUtils.property(thatLocator, "receptionManned", rhsReceptionManned), lhsReceptionManned, rhsReceptionManned, (this.receptionManned!= null), (that.receptionManned!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsMedicalAssistanceAvailable;
            lhsMedicalAssistanceAvailable = this.getMedicalAssistanceAvailable();
            YesNotApplicableType rhsMedicalAssistanceAvailable;
            rhsMedicalAssistanceAvailable = that.getMedicalAssistanceAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "medicalAssistanceAvailable", lhsMedicalAssistanceAvailable), LocatorUtils.property(thatLocator, "medicalAssistanceAvailable", rhsMedicalAssistanceAvailable), lhsMedicalAssistanceAvailable, rhsMedicalAssistanceAvailable, (this.medicalAssistanceAvailable!= null), (that.medicalAssistanceAvailable!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsHomeHelpAvailable;
            lhsHomeHelpAvailable = this.getHomeHelpAvailable();
            YesNotApplicableType rhsHomeHelpAvailable;
            rhsHomeHelpAvailable = that.getHomeHelpAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "homeHelpAvailable", lhsHomeHelpAvailable), LocatorUtils.property(thatLocator, "homeHelpAvailable", rhsHomeHelpAvailable), lhsHomeHelpAvailable, rhsHomeHelpAvailable, (this.homeHelpAvailable!= null), (that.homeHelpAvailable!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCounselingAvailable;
            lhsCounselingAvailable = this.getCounselingAvailable();
            YesNotApplicableType rhsCounselingAvailable;
            rhsCounselingAvailable = that.getCounselingAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "counselingAvailable", lhsCounselingAvailable), LocatorUtils.property(thatLocator, "counselingAvailable", rhsCounselingAvailable), lhsCounselingAvailable, rhsCounselingAvailable, (this.counselingAvailable!= null), (that.counselingAvailable!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsLoansAvailable;
            lhsLoansAvailable = this.getLoansAvailable();
            YesNotApplicableType rhsLoansAvailable;
            rhsLoansAvailable = that.getLoansAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "loansAvailable", lhsLoansAvailable), LocatorUtils.property(thatLocator, "loansAvailable", rhsLoansAvailable), lhsLoansAvailable, rhsLoansAvailable, (this.loansAvailable!= null), (that.loansAvailable!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsNumberOfRoomsFrom;
            lhsNumberOfRoomsFrom = this.getNumberOfRoomsFrom();
            BigDecimal rhsNumberOfRoomsFrom;
            rhsNumberOfRoomsFrom = that.getNumberOfRoomsFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfRoomsFrom", lhsNumberOfRoomsFrom), LocatorUtils.property(thatLocator, "numberOfRoomsFrom", rhsNumberOfRoomsFrom), lhsNumberOfRoomsFrom, rhsNumberOfRoomsFrom, (this.numberOfRoomsFrom!= null), (that.numberOfRoomsFrom!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsNumberOfRoomsTo;
            lhsNumberOfRoomsTo = this.getNumberOfRoomsTo();
            BigDecimal rhsNumberOfRoomsTo;
            rhsNumberOfRoomsTo = that.getNumberOfRoomsTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfRoomsTo", lhsNumberOfRoomsTo), LocatorUtils.property(thatLocator, "numberOfRoomsTo", rhsNumberOfRoomsTo), lhsNumberOfRoomsTo, rhsNumberOfRoomsTo, (this.numberOfRoomsTo!= null), (that.numberOfRoomsTo!= null))) {
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
            HeatingTypeEnev2014 lhsHeatingTypeEnev2014;
            lhsHeatingTypeEnev2014 = this.getHeatingTypeEnev2014();
            HeatingTypeEnev2014 rhsHeatingTypeEnev2014;
            rhsHeatingTypeEnev2014 = that.getHeatingTypeEnev2014();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heatingTypeEnev2014", lhsHeatingTypeEnev2014), LocatorUtils.property(thatLocator, "heatingTypeEnev2014", rhsHeatingTypeEnev2014), lhsHeatingTypeEnev2014, rhsHeatingTypeEnev2014, (this.heatingTypeEnev2014 != null), (that.heatingTypeEnev2014 != null))) {
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
            YesNotApplicableType lhsBarrierFree;
            lhsBarrierFree = this.getBarrierFree();
            YesNotApplicableType rhsBarrierFree;
            rhsBarrierFree = that.getBarrierFree();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "barrierFree", lhsBarrierFree), LocatorUtils.property(thatLocator, "barrierFree", rhsBarrierFree), lhsBarrierFree, rhsBarrierFree, (this.barrierFree!= null), (that.barrierFree!= null))) {
                return false;
            }
        }
        {
            Long lhsNumberOfLookedAfterApartments;
            lhsNumberOfLookedAfterApartments = this.getNumberOfLookedAfterApartments();
            Long rhsNumberOfLookedAfterApartments;
            rhsNumberOfLookedAfterApartments = that.getNumberOfLookedAfterApartments();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfLookedAfterApartments", lhsNumberOfLookedAfterApartments), LocatorUtils.property(thatLocator, "numberOfLookedAfterApartments", rhsNumberOfLookedAfterApartments), lhsNumberOfLookedAfterApartments, rhsNumberOfLookedAfterApartments, (this.numberOfLookedAfterApartments!= null), (that.numberOfLookedAfterApartments!= null))) {
                return false;
            }
        }
        {
            Long lhsNumberOfNursingPlaces;
            lhsNumberOfNursingPlaces = this.getNumberOfNursingPlaces();
            Long rhsNumberOfNursingPlaces;
            rhsNumberOfNursingPlaces = that.getNumberOfNursingPlaces();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfNursingPlaces", lhsNumberOfNursingPlaces), LocatorUtils.property(thatLocator, "numberOfNursingPlaces", rhsNumberOfNursingPlaces), lhsNumberOfNursingPlaces, rhsNumberOfNursingPlaces, (this.numberOfNursingPlaces!= null), (that.numberOfNursingPlaces!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsLivingSpaceFrom;
            lhsLivingSpaceFrom = this.getLivingSpaceFrom();
            BigDecimal rhsLivingSpaceFrom;
            rhsLivingSpaceFrom = that.getLivingSpaceFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "livingSpaceFrom", lhsLivingSpaceFrom), LocatorUtils.property(thatLocator, "livingSpaceFrom", rhsLivingSpaceFrom), lhsLivingSpaceFrom, rhsLivingSpaceFrom, (this.livingSpaceFrom!= null), (that.livingSpaceFrom!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsLivingSpaceTo;
            lhsLivingSpaceTo = this.getLivingSpaceTo();
            BigDecimal rhsLivingSpaceTo;
            rhsLivingSpaceTo = that.getLivingSpaceTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "livingSpaceTo", lhsLivingSpaceTo), LocatorUtils.property(thatLocator, "livingSpaceTo", rhsLivingSpaceTo), lhsLivingSpaceTo, rhsLivingSpaceTo, (this.livingSpaceTo!= null), (that.livingSpaceTo!= null))) {
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
            YesNotApplicableType lhsGuestApartmentsAvailable;
            lhsGuestApartmentsAvailable = this.getGuestApartmentsAvailable();
            YesNotApplicableType rhsGuestApartmentsAvailable;
            rhsGuestApartmentsAvailable = that.getGuestApartmentsAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "guestApartmentsAvailable", lhsGuestApartmentsAvailable), LocatorUtils.property(thatLocator, "guestApartmentsAvailable", rhsGuestApartmentsAvailable), lhsGuestApartmentsAvailable, rhsGuestApartmentsAvailable, (this.guestApartmentsAvailable!= null), (that.guestApartmentsAvailable!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsRestaurantAvailable;
            lhsRestaurantAvailable = this.getRestaurantAvailable();
            YesNotApplicableType rhsRestaurantAvailable;
            rhsRestaurantAvailable = that.getRestaurantAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "restaurantAvailable", lhsRestaurantAvailable), LocatorUtils.property(thatLocator, "restaurantAvailable", rhsRestaurantAvailable), lhsRestaurantAvailable, rhsRestaurantAvailable, (this.restaurantAvailable!= null), (that.restaurantAvailable!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCookingFacilitiesAvailable;
            lhsCookingFacilitiesAvailable = this.getCookingFacilitiesAvailable();
            YesNotApplicableType rhsCookingFacilitiesAvailable;
            rhsCookingFacilitiesAvailable = that.getCookingFacilitiesAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cookingFacilitiesAvailable", lhsCookingFacilitiesAvailable), LocatorUtils.property(thatLocator, "cookingFacilitiesAvailable", rhsCookingFacilitiesAvailable), lhsCookingFacilitiesAvailable, rhsCookingFacilitiesAvailable, (this.cookingFacilitiesAvailable!= null), (that.cookingFacilitiesAvailable!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsOwnFurniturePossible;
            lhsOwnFurniturePossible = this.getOwnFurniturePossible();
            YesNotApplicableType rhsOwnFurniturePossible;
            rhsOwnFurniturePossible = that.getOwnFurniturePossible();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ownFurniturePossible", lhsOwnFurniturePossible), LocatorUtils.property(thatLocator, "ownFurniturePossible", rhsOwnFurniturePossible), lhsOwnFurniturePossible, rhsOwnFurniturePossible, (this.ownFurniturePossible!= null), (that.ownFurniturePossible!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCleaningServiceAvailable;
            lhsCleaningServiceAvailable = this.getCleaningServiceAvailable();
            YesNotApplicableType rhsCleaningServiceAvailable;
            rhsCleaningServiceAvailable = that.getCleaningServiceAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cleaningServiceAvailable", lhsCleaningServiceAvailable), LocatorUtils.property(thatLocator, "cleaningServiceAvailable", rhsCleaningServiceAvailable), lhsCleaningServiceAvailable, rhsCleaningServiceAvailable, (this.cleaningServiceAvailable!= null), (that.cleaningServiceAvailable!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsShoppingFacilitiesAvailable;
            lhsShoppingFacilitiesAvailable = this.getShoppingFacilitiesAvailable();
            YesNotApplicableType rhsShoppingFacilitiesAvailable;
            rhsShoppingFacilitiesAvailable = that.getShoppingFacilitiesAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shoppingFacilitiesAvailable", lhsShoppingFacilitiesAvailable), LocatorUtils.property(thatLocator, "shoppingFacilitiesAvailable", rhsShoppingFacilitiesAvailable), lhsShoppingFacilitiesAvailable, rhsShoppingFacilitiesAvailable, (this.shoppingFacilitiesAvailable!= null), (that.shoppingFacilitiesAvailable!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsSecurity24Hours;
            lhsSecurity24Hours = this.getSecurity24Hours();
            YesNotApplicableType rhsSecurity24Hours;
            rhsSecurity24Hours = that.getSecurity24Hours();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "security24Hours", lhsSecurity24Hours), LocatorUtils.property(thatLocator, "security24Hours", rhsSecurity24Hours), lhsSecurity24Hours, rhsSecurity24Hours, (this.security24Hours!= null), (that.security24Hours!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCulturalProgramAvailable;
            lhsCulturalProgramAvailable = this.getCulturalProgramAvailable();
            YesNotApplicableType rhsCulturalProgramAvailable;
            rhsCulturalProgramAvailable = that.getCulturalProgramAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "culturalProgramAvailable", lhsCulturalProgramAvailable), LocatorUtils.property(thatLocator, "culturalProgramAvailable", rhsCulturalProgramAvailable), lhsCulturalProgramAvailable, rhsCulturalProgramAvailable, (this.culturalProgramAvailable!= null), (that.culturalProgramAvailable!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsLeisureActivitiesAvailable;
            lhsLeisureActivitiesAvailable = this.getLeisureActivitiesAvailable();
            YesNotApplicableType rhsLeisureActivitiesAvailable;
            rhsLeisureActivitiesAvailable = that.getLeisureActivitiesAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leisureActivitiesAvailable", lhsLeisureActivitiesAvailable), LocatorUtils.property(thatLocator, "leisureActivitiesAvailable", rhsLeisureActivitiesAvailable), lhsLeisureActivitiesAvailable, rhsLeisureActivitiesAvailable, (this.leisureActivitiesAvailable!= null), (that.leisureActivitiesAvailable!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsReligiousOfferingsAvailable;
            lhsReligiousOfferingsAvailable = this.getReligiousOfferingsAvailable();
            YesNotApplicableType rhsReligiousOfferingsAvailable;
            rhsReligiousOfferingsAvailable = that.getReligiousOfferingsAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "religiousOfferingsAvailable", lhsReligiousOfferingsAvailable), LocatorUtils.property(thatLocator, "religiousOfferingsAvailable", rhsReligiousOfferingsAvailable), lhsReligiousOfferingsAvailable, rhsReligiousOfferingsAvailable, (this.religiousOfferingsAvailable!= null), (that.religiousOfferingsAvailable!= null))) {
                return false;
            }
        }
        {
            BalconyAvailableType lhsBalconyAvailable;
            lhsBalconyAvailable = this.getBalconyAvailable();
            BalconyAvailableType rhsBalconyAvailable;
            rhsBalconyAvailable = that.getBalconyAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balconyAvailable", lhsBalconyAvailable), LocatorUtils.property(thatLocator, "balconyAvailable", rhsBalconyAvailable), lhsBalconyAvailable, rhsBalconyAvailable, (this.balconyAvailable!= null), (that.balconyAvailable!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBranchEntry;
            lhsBranchEntry = this.isBranchEntry();
            Boolean rhsBranchEntry;
            rhsBranchEntry = that.isBranchEntry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "branchEntry", lhsBranchEntry), LocatorUtils.property(thatLocator, "branchEntry", rhsBranchEntry), lhsBranchEntry, rhsBranchEntry, (this.branchEntry!= null), (that.branchEntry!= null))) {
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
