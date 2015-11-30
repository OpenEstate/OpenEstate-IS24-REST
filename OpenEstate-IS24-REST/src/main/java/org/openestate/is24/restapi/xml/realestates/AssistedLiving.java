
package org.openestate.is24.restapi.xml.realestates;

import java.math.BigDecimal;
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


/**
 * Eigenschaften f\u00fcr den Immobilientyp "Seniorenwohnen"
 * 
 * <p>Java class for AssistedLiving complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssistedLiving"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/realestates/1.0}RealEstate"&gt;
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
    extends RealEstate
    implements Cloneable, CopyTo, Equals, ToString
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
    @XmlJavaTypeAdapter(Adapter18 .class)
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
            String theShortDescription;
            theShortDescription = this.getShortDescription();
            strategy.appendField(locator, this, "shortDescription", buffer, theShortDescription);
        }
        {
            PetsAllowedType thePetsAllowed;
            thePetsAllowed = this.getPetsAllowed();
            strategy.appendField(locator, this, "petsAllowed", buffer, thePetsAllowed);
        }
        {
            YesNotApplicableType theTrialLivingPossible;
            theTrialLivingPossible = this.getTrialLivingPossible();
            strategy.appendField(locator, this, "trialLivingPossible", buffer, theTrialLivingPossible);
        }
        {
            MarketingType theMarketingType;
            theMarketingType = this.getMarketingType();
            strategy.appendField(locator, this, "marketingType", buffer, theMarketingType);
        }
        {
            FacilityType theFacilityType;
            theFacilityType = this.getFacilityType();
            strategy.appendField(locator, this, "facilityType", buffer, theFacilityType);
        }
        {
            Price theMinBaseRent;
            theMinBaseRent = this.getMinBaseRent();
            strategy.appendField(locator, this, "minBaseRent", buffer, theMinBaseRent);
        }
        {
            Price theMinPurchasePrice;
            theMinPurchasePrice = this.getMinPurchasePrice();
            strategy.appendField(locator, this, "minPurchasePrice", buffer, theMinPurchasePrice);
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
            BigDecimal theRoomAvailableFrom;
            theRoomAvailableFrom = this.getRoomAvailableFrom();
            strategy.appendField(locator, this, "roomAvailableFrom", buffer, theRoomAvailableFrom);
        }
        {
            BigDecimal theRoomAvailableTo;
            theRoomAvailableTo = this.getRoomAvailableTo();
            strategy.appendField(locator, this, "roomAvailableTo", buffer, theRoomAvailableTo);
        }
        {
            YesNotApplicableType theCookingPossibilty;
            theCookingPossibilty = this.getCookingPossibilty();
            strategy.appendField(locator, this, "cookingPossibilty", buffer, theCookingPossibilty);
        }
        {
            YesNotApplicableType theParkingAvailable;
            theParkingAvailable = this.getParkingAvailable();
            strategy.appendField(locator, this, "parkingAvailable", buffer, theParkingAvailable);
        }
        {
            YesNotApplicableType theCommonRoomsAvailable;
            theCommonRoomsAvailable = this.getCommonRoomsAvailable();
            strategy.appendField(locator, this, "commonRoomsAvailable", buffer, theCommonRoomsAvailable);
        }
        {
            YesNotApplicableType theGardenAvailable;
            theGardenAvailable = this.getGardenAvailable();
            strategy.appendField(locator, this, "gardenAvailable", buffer, theGardenAvailable);
        }
        {
            YesNotApplicableType theFitnessAvailable;
            theFitnessAvailable = this.getFitnessAvailable();
            strategy.appendField(locator, this, "fitnessAvailable", buffer, theFitnessAvailable);
        }
        {
            YesNotApplicableType thePoolAvailable;
            thePoolAvailable = this.getPoolAvailable();
            strategy.appendField(locator, this, "poolAvailable", buffer, thePoolAvailable);
        }
        {
            YesNotApplicableType thePublicTransportationAvailable;
            thePublicTransportationAvailable = this.getPublicTransportationAvailable();
            strategy.appendField(locator, this, "publicTransportationAvailable", buffer, thePublicTransportationAvailable);
        }
        {
            YesNotApplicableType theAmbulantNursingServiceAvailable;
            theAmbulantNursingServiceAvailable = this.getAmbulantNursingServiceAvailable();
            strategy.appendField(locator, this, "ambulantNursingServiceAvailable", buffer, theAmbulantNursingServiceAvailable);
        }
        {
            YesNotApplicableType theEmergencyCallInRoomAvailable;
            theEmergencyCallInRoomAvailable = this.getEmergencyCallInRoomAvailable();
            strategy.appendField(locator, this, "emergencyCallInRoomAvailable", buffer, theEmergencyCallInRoomAvailable);
        }
        {
            YesNotApplicableType theReceptionManned;
            theReceptionManned = this.getReceptionManned();
            strategy.appendField(locator, this, "receptionManned", buffer, theReceptionManned);
        }
        {
            YesNotApplicableType theMedicalAssistanceAvailable;
            theMedicalAssistanceAvailable = this.getMedicalAssistanceAvailable();
            strategy.appendField(locator, this, "medicalAssistanceAvailable", buffer, theMedicalAssistanceAvailable);
        }
        {
            YesNotApplicableType theHomeHelpAvailable;
            theHomeHelpAvailable = this.getHomeHelpAvailable();
            strategy.appendField(locator, this, "homeHelpAvailable", buffer, theHomeHelpAvailable);
        }
        {
            YesNotApplicableType theCounselingAvailable;
            theCounselingAvailable = this.getCounselingAvailable();
            strategy.appendField(locator, this, "counselingAvailable", buffer, theCounselingAvailable);
        }
        {
            YesNotApplicableType theLoansAvailable;
            theLoansAvailable = this.getLoansAvailable();
            strategy.appendField(locator, this, "loansAvailable", buffer, theLoansAvailable);
        }
        {
            BigDecimal theNumberOfRoomsFrom;
            theNumberOfRoomsFrom = this.getNumberOfRoomsFrom();
            strategy.appendField(locator, this, "numberOfRoomsFrom", buffer, theNumberOfRoomsFrom);
        }
        {
            BigDecimal theNumberOfRoomsTo;
            theNumberOfRoomsTo = this.getNumberOfRoomsTo();
            strategy.appendField(locator, this, "numberOfRoomsTo", buffer, theNumberOfRoomsTo);
        }
        {
            EnergyPerformanceCertificate theEnergyCertificate;
            theEnergyCertificate = this.getEnergyCertificate();
            strategy.appendField(locator, this, "energyCertificate", buffer, theEnergyCertificate);
        }
        {
            HeatingTypeEnev2014 theHeatingTypeEnev2014;
            theHeatingTypeEnev2014 = this.getHeatingTypeEnev2014();
            strategy.appendField(locator, this, "heatingTypeEnev2014", buffer, theHeatingTypeEnev2014);
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
            YesNotApplicableType theBarrierFree;
            theBarrierFree = this.getBarrierFree();
            strategy.appendField(locator, this, "barrierFree", buffer, theBarrierFree);
        }
        {
            Long theNumberOfLookedAfterApartments;
            theNumberOfLookedAfterApartments = this.getNumberOfLookedAfterApartments();
            strategy.appendField(locator, this, "numberOfLookedAfterApartments", buffer, theNumberOfLookedAfterApartments);
        }
        {
            Long theNumberOfNursingPlaces;
            theNumberOfNursingPlaces = this.getNumberOfNursingPlaces();
            strategy.appendField(locator, this, "numberOfNursingPlaces", buffer, theNumberOfNursingPlaces);
        }
        {
            BigDecimal theLivingSpaceFrom;
            theLivingSpaceFrom = this.getLivingSpaceFrom();
            strategy.appendField(locator, this, "livingSpaceFrom", buffer, theLivingSpaceFrom);
        }
        {
            BigDecimal theLivingSpaceTo;
            theLivingSpaceTo = this.getLivingSpaceTo();
            strategy.appendField(locator, this, "livingSpaceTo", buffer, theLivingSpaceTo);
        }
        {
            YesNotApplicableType theHandicappedAccessible;
            theHandicappedAccessible = this.getHandicappedAccessible();
            strategy.appendField(locator, this, "handicappedAccessible", buffer, theHandicappedAccessible);
        }
        {
            YesNotApplicableType theGuestApartmentsAvailable;
            theGuestApartmentsAvailable = this.getGuestApartmentsAvailable();
            strategy.appendField(locator, this, "guestApartmentsAvailable", buffer, theGuestApartmentsAvailable);
        }
        {
            YesNotApplicableType theRestaurantAvailable;
            theRestaurantAvailable = this.getRestaurantAvailable();
            strategy.appendField(locator, this, "restaurantAvailable", buffer, theRestaurantAvailable);
        }
        {
            YesNotApplicableType theCookingFacilitiesAvailable;
            theCookingFacilitiesAvailable = this.getCookingFacilitiesAvailable();
            strategy.appendField(locator, this, "cookingFacilitiesAvailable", buffer, theCookingFacilitiesAvailable);
        }
        {
            YesNotApplicableType theOwnFurniturePossible;
            theOwnFurniturePossible = this.getOwnFurniturePossible();
            strategy.appendField(locator, this, "ownFurniturePossible", buffer, theOwnFurniturePossible);
        }
        {
            YesNotApplicableType theCleaningServiceAvailable;
            theCleaningServiceAvailable = this.getCleaningServiceAvailable();
            strategy.appendField(locator, this, "cleaningServiceAvailable", buffer, theCleaningServiceAvailable);
        }
        {
            YesNotApplicableType theShoppingFacilitiesAvailable;
            theShoppingFacilitiesAvailable = this.getShoppingFacilitiesAvailable();
            strategy.appendField(locator, this, "shoppingFacilitiesAvailable", buffer, theShoppingFacilitiesAvailable);
        }
        {
            YesNotApplicableType theSecurity24Hours;
            theSecurity24Hours = this.getSecurity24Hours();
            strategy.appendField(locator, this, "security24Hours", buffer, theSecurity24Hours);
        }
        {
            YesNotApplicableType theCulturalProgramAvailable;
            theCulturalProgramAvailable = this.getCulturalProgramAvailable();
            strategy.appendField(locator, this, "culturalProgramAvailable", buffer, theCulturalProgramAvailable);
        }
        {
            YesNotApplicableType theLeisureActivitiesAvailable;
            theLeisureActivitiesAvailable = this.getLeisureActivitiesAvailable();
            strategy.appendField(locator, this, "leisureActivitiesAvailable", buffer, theLeisureActivitiesAvailable);
        }
        {
            YesNotApplicableType theReligiousOfferingsAvailable;
            theReligiousOfferingsAvailable = this.getReligiousOfferingsAvailable();
            strategy.appendField(locator, this, "religiousOfferingsAvailable", buffer, theReligiousOfferingsAvailable);
        }
        {
            BalconyAvailableType theBalconyAvailable;
            theBalconyAvailable = this.getBalconyAvailable();
            strategy.appendField(locator, this, "balconyAvailable", buffer, theBalconyAvailable);
        }
        {
            Boolean theBranchEntry;
            theBranchEntry = this.isBranchEntry();
            strategy.appendField(locator, this, "branchEntry", buffer, theBranchEntry);
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
        if (draftCopy instanceof AssistedLiving) {
            final AssistedLiving copy = ((AssistedLiving) draftCopy);
            if (this.shortDescription!= null) {
                String sourceShortDescription;
                sourceShortDescription = this.getShortDescription();
                String copyShortDescription = ((String) strategy.copy(LocatorUtils.property(locator, "shortDescription", sourceShortDescription), sourceShortDescription));
                copy.setShortDescription(copyShortDescription);
            } else {
                copy.shortDescription = null;
            }
            if (this.petsAllowed!= null) {
                PetsAllowedType sourcePetsAllowed;
                sourcePetsAllowed = this.getPetsAllowed();
                PetsAllowedType copyPetsAllowed = ((PetsAllowedType) strategy.copy(LocatorUtils.property(locator, "petsAllowed", sourcePetsAllowed), sourcePetsAllowed));
                copy.setPetsAllowed(copyPetsAllowed);
            } else {
                copy.petsAllowed = null;
            }
            if (this.trialLivingPossible!= null) {
                YesNotApplicableType sourceTrialLivingPossible;
                sourceTrialLivingPossible = this.getTrialLivingPossible();
                YesNotApplicableType copyTrialLivingPossible = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "trialLivingPossible", sourceTrialLivingPossible), sourceTrialLivingPossible));
                copy.setTrialLivingPossible(copyTrialLivingPossible);
            } else {
                copy.trialLivingPossible = null;
            }
            if (this.marketingType!= null) {
                MarketingType sourceMarketingType;
                sourceMarketingType = this.getMarketingType();
                MarketingType copyMarketingType = ((MarketingType) strategy.copy(LocatorUtils.property(locator, "marketingType", sourceMarketingType), sourceMarketingType));
                copy.setMarketingType(copyMarketingType);
            } else {
                copy.marketingType = null;
            }
            if (this.facilityType!= null) {
                FacilityType sourceFacilityType;
                sourceFacilityType = this.getFacilityType();
                FacilityType copyFacilityType = ((FacilityType) strategy.copy(LocatorUtils.property(locator, "facilityType", sourceFacilityType), sourceFacilityType));
                copy.setFacilityType(copyFacilityType);
            } else {
                copy.facilityType = null;
            }
            if (this.minBaseRent!= null) {
                Price sourceMinBaseRent;
                sourceMinBaseRent = this.getMinBaseRent();
                Price copyMinBaseRent = ((Price) strategy.copy(LocatorUtils.property(locator, "minBaseRent", sourceMinBaseRent), sourceMinBaseRent));
                copy.setMinBaseRent(copyMinBaseRent);
            } else {
                copy.minBaseRent = null;
            }
            if (this.minPurchasePrice!= null) {
                Price sourceMinPurchasePrice;
                sourceMinPurchasePrice = this.getMinPurchasePrice();
                Price copyMinPurchasePrice = ((Price) strategy.copy(LocatorUtils.property(locator, "minPurchasePrice", sourceMinPurchasePrice), sourceMinPurchasePrice));
                copy.setMinPurchasePrice(copyMinPurchasePrice);
            } else {
                copy.minPurchasePrice = null;
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
            if (this.roomAvailableFrom!= null) {
                BigDecimal sourceRoomAvailableFrom;
                sourceRoomAvailableFrom = this.getRoomAvailableFrom();
                BigDecimal copyRoomAvailableFrom = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "roomAvailableFrom", sourceRoomAvailableFrom), sourceRoomAvailableFrom));
                copy.setRoomAvailableFrom(copyRoomAvailableFrom);
            } else {
                copy.roomAvailableFrom = null;
            }
            if (this.roomAvailableTo!= null) {
                BigDecimal sourceRoomAvailableTo;
                sourceRoomAvailableTo = this.getRoomAvailableTo();
                BigDecimal copyRoomAvailableTo = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "roomAvailableTo", sourceRoomAvailableTo), sourceRoomAvailableTo));
                copy.setRoomAvailableTo(copyRoomAvailableTo);
            } else {
                copy.roomAvailableTo = null;
            }
            if (this.cookingPossibilty!= null) {
                YesNotApplicableType sourceCookingPossibilty;
                sourceCookingPossibilty = this.getCookingPossibilty();
                YesNotApplicableType copyCookingPossibilty = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "cookingPossibilty", sourceCookingPossibilty), sourceCookingPossibilty));
                copy.setCookingPossibilty(copyCookingPossibilty);
            } else {
                copy.cookingPossibilty = null;
            }
            if (this.parkingAvailable!= null) {
                YesNotApplicableType sourceParkingAvailable;
                sourceParkingAvailable = this.getParkingAvailable();
                YesNotApplicableType copyParkingAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "parkingAvailable", sourceParkingAvailable), sourceParkingAvailable));
                copy.setParkingAvailable(copyParkingAvailable);
            } else {
                copy.parkingAvailable = null;
            }
            if (this.commonRoomsAvailable!= null) {
                YesNotApplicableType sourceCommonRoomsAvailable;
                sourceCommonRoomsAvailable = this.getCommonRoomsAvailable();
                YesNotApplicableType copyCommonRoomsAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "commonRoomsAvailable", sourceCommonRoomsAvailable), sourceCommonRoomsAvailable));
                copy.setCommonRoomsAvailable(copyCommonRoomsAvailable);
            } else {
                copy.commonRoomsAvailable = null;
            }
            if (this.gardenAvailable!= null) {
                YesNotApplicableType sourceGardenAvailable;
                sourceGardenAvailable = this.getGardenAvailable();
                YesNotApplicableType copyGardenAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "gardenAvailable", sourceGardenAvailable), sourceGardenAvailable));
                copy.setGardenAvailable(copyGardenAvailable);
            } else {
                copy.gardenAvailable = null;
            }
            if (this.fitnessAvailable!= null) {
                YesNotApplicableType sourceFitnessAvailable;
                sourceFitnessAvailable = this.getFitnessAvailable();
                YesNotApplicableType copyFitnessAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "fitnessAvailable", sourceFitnessAvailable), sourceFitnessAvailable));
                copy.setFitnessAvailable(copyFitnessAvailable);
            } else {
                copy.fitnessAvailable = null;
            }
            if (this.poolAvailable!= null) {
                YesNotApplicableType sourcePoolAvailable;
                sourcePoolAvailable = this.getPoolAvailable();
                YesNotApplicableType copyPoolAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "poolAvailable", sourcePoolAvailable), sourcePoolAvailable));
                copy.setPoolAvailable(copyPoolAvailable);
            } else {
                copy.poolAvailable = null;
            }
            if (this.publicTransportationAvailable!= null) {
                YesNotApplicableType sourcePublicTransportationAvailable;
                sourcePublicTransportationAvailable = this.getPublicTransportationAvailable();
                YesNotApplicableType copyPublicTransportationAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "publicTransportationAvailable", sourcePublicTransportationAvailable), sourcePublicTransportationAvailable));
                copy.setPublicTransportationAvailable(copyPublicTransportationAvailable);
            } else {
                copy.publicTransportationAvailable = null;
            }
            if (this.ambulantNursingServiceAvailable!= null) {
                YesNotApplicableType sourceAmbulantNursingServiceAvailable;
                sourceAmbulantNursingServiceAvailable = this.getAmbulantNursingServiceAvailable();
                YesNotApplicableType copyAmbulantNursingServiceAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "ambulantNursingServiceAvailable", sourceAmbulantNursingServiceAvailable), sourceAmbulantNursingServiceAvailable));
                copy.setAmbulantNursingServiceAvailable(copyAmbulantNursingServiceAvailable);
            } else {
                copy.ambulantNursingServiceAvailable = null;
            }
            if (this.emergencyCallInRoomAvailable!= null) {
                YesNotApplicableType sourceEmergencyCallInRoomAvailable;
                sourceEmergencyCallInRoomAvailable = this.getEmergencyCallInRoomAvailable();
                YesNotApplicableType copyEmergencyCallInRoomAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "emergencyCallInRoomAvailable", sourceEmergencyCallInRoomAvailable), sourceEmergencyCallInRoomAvailable));
                copy.setEmergencyCallInRoomAvailable(copyEmergencyCallInRoomAvailable);
            } else {
                copy.emergencyCallInRoomAvailable = null;
            }
            if (this.receptionManned!= null) {
                YesNotApplicableType sourceReceptionManned;
                sourceReceptionManned = this.getReceptionManned();
                YesNotApplicableType copyReceptionManned = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "receptionManned", sourceReceptionManned), sourceReceptionManned));
                copy.setReceptionManned(copyReceptionManned);
            } else {
                copy.receptionManned = null;
            }
            if (this.medicalAssistanceAvailable!= null) {
                YesNotApplicableType sourceMedicalAssistanceAvailable;
                sourceMedicalAssistanceAvailable = this.getMedicalAssistanceAvailable();
                YesNotApplicableType copyMedicalAssistanceAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "medicalAssistanceAvailable", sourceMedicalAssistanceAvailable), sourceMedicalAssistanceAvailable));
                copy.setMedicalAssistanceAvailable(copyMedicalAssistanceAvailable);
            } else {
                copy.medicalAssistanceAvailable = null;
            }
            if (this.homeHelpAvailable!= null) {
                YesNotApplicableType sourceHomeHelpAvailable;
                sourceHomeHelpAvailable = this.getHomeHelpAvailable();
                YesNotApplicableType copyHomeHelpAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "homeHelpAvailable", sourceHomeHelpAvailable), sourceHomeHelpAvailable));
                copy.setHomeHelpAvailable(copyHomeHelpAvailable);
            } else {
                copy.homeHelpAvailable = null;
            }
            if (this.counselingAvailable!= null) {
                YesNotApplicableType sourceCounselingAvailable;
                sourceCounselingAvailable = this.getCounselingAvailable();
                YesNotApplicableType copyCounselingAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "counselingAvailable", sourceCounselingAvailable), sourceCounselingAvailable));
                copy.setCounselingAvailable(copyCounselingAvailable);
            } else {
                copy.counselingAvailable = null;
            }
            if (this.loansAvailable!= null) {
                YesNotApplicableType sourceLoansAvailable;
                sourceLoansAvailable = this.getLoansAvailable();
                YesNotApplicableType copyLoansAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "loansAvailable", sourceLoansAvailable), sourceLoansAvailable));
                copy.setLoansAvailable(copyLoansAvailable);
            } else {
                copy.loansAvailable = null;
            }
            if (this.numberOfRoomsFrom!= null) {
                BigDecimal sourceNumberOfRoomsFrom;
                sourceNumberOfRoomsFrom = this.getNumberOfRoomsFrom();
                BigDecimal copyNumberOfRoomsFrom = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "numberOfRoomsFrom", sourceNumberOfRoomsFrom), sourceNumberOfRoomsFrom));
                copy.setNumberOfRoomsFrom(copyNumberOfRoomsFrom);
            } else {
                copy.numberOfRoomsFrom = null;
            }
            if (this.numberOfRoomsTo!= null) {
                BigDecimal sourceNumberOfRoomsTo;
                sourceNumberOfRoomsTo = this.getNumberOfRoomsTo();
                BigDecimal copyNumberOfRoomsTo = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "numberOfRoomsTo", sourceNumberOfRoomsTo), sourceNumberOfRoomsTo));
                copy.setNumberOfRoomsTo(copyNumberOfRoomsTo);
            } else {
                copy.numberOfRoomsTo = null;
            }
            if (this.energyCertificate!= null) {
                EnergyPerformanceCertificate sourceEnergyCertificate;
                sourceEnergyCertificate = this.getEnergyCertificate();
                EnergyPerformanceCertificate copyEnergyCertificate = ((EnergyPerformanceCertificate) strategy.copy(LocatorUtils.property(locator, "energyCertificate", sourceEnergyCertificate), sourceEnergyCertificate));
                copy.setEnergyCertificate(copyEnergyCertificate);
            } else {
                copy.energyCertificate = null;
            }
            if (this.heatingTypeEnev2014 != null) {
                HeatingTypeEnev2014 sourceHeatingTypeEnev2014;
                sourceHeatingTypeEnev2014 = this.getHeatingTypeEnev2014();
                HeatingTypeEnev2014 copyHeatingTypeEnev2014 = ((HeatingTypeEnev2014) strategy.copy(LocatorUtils.property(locator, "heatingTypeEnev2014", sourceHeatingTypeEnev2014), sourceHeatingTypeEnev2014));
                copy.setHeatingTypeEnev2014(copyHeatingTypeEnev2014);
            } else {
                copy.heatingTypeEnev2014 = null;
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
            if (this.barrierFree!= null) {
                YesNotApplicableType sourceBarrierFree;
                sourceBarrierFree = this.getBarrierFree();
                YesNotApplicableType copyBarrierFree = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "barrierFree", sourceBarrierFree), sourceBarrierFree));
                copy.setBarrierFree(copyBarrierFree);
            } else {
                copy.barrierFree = null;
            }
            if (this.numberOfLookedAfterApartments!= null) {
                Long sourceNumberOfLookedAfterApartments;
                sourceNumberOfLookedAfterApartments = this.getNumberOfLookedAfterApartments();
                Long copyNumberOfLookedAfterApartments = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfLookedAfterApartments", sourceNumberOfLookedAfterApartments), sourceNumberOfLookedAfterApartments));
                copy.setNumberOfLookedAfterApartments(copyNumberOfLookedAfterApartments);
            } else {
                copy.numberOfLookedAfterApartments = null;
            }
            if (this.numberOfNursingPlaces!= null) {
                Long sourceNumberOfNursingPlaces;
                sourceNumberOfNursingPlaces = this.getNumberOfNursingPlaces();
                Long copyNumberOfNursingPlaces = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfNursingPlaces", sourceNumberOfNursingPlaces), sourceNumberOfNursingPlaces));
                copy.setNumberOfNursingPlaces(copyNumberOfNursingPlaces);
            } else {
                copy.numberOfNursingPlaces = null;
            }
            if (this.livingSpaceFrom!= null) {
                BigDecimal sourceLivingSpaceFrom;
                sourceLivingSpaceFrom = this.getLivingSpaceFrom();
                BigDecimal copyLivingSpaceFrom = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "livingSpaceFrom", sourceLivingSpaceFrom), sourceLivingSpaceFrom));
                copy.setLivingSpaceFrom(copyLivingSpaceFrom);
            } else {
                copy.livingSpaceFrom = null;
            }
            if (this.livingSpaceTo!= null) {
                BigDecimal sourceLivingSpaceTo;
                sourceLivingSpaceTo = this.getLivingSpaceTo();
                BigDecimal copyLivingSpaceTo = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "livingSpaceTo", sourceLivingSpaceTo), sourceLivingSpaceTo));
                copy.setLivingSpaceTo(copyLivingSpaceTo);
            } else {
                copy.livingSpaceTo = null;
            }
            if (this.handicappedAccessible!= null) {
                YesNotApplicableType sourceHandicappedAccessible;
                sourceHandicappedAccessible = this.getHandicappedAccessible();
                YesNotApplicableType copyHandicappedAccessible = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "handicappedAccessible", sourceHandicappedAccessible), sourceHandicappedAccessible));
                copy.setHandicappedAccessible(copyHandicappedAccessible);
            } else {
                copy.handicappedAccessible = null;
            }
            if (this.guestApartmentsAvailable!= null) {
                YesNotApplicableType sourceGuestApartmentsAvailable;
                sourceGuestApartmentsAvailable = this.getGuestApartmentsAvailable();
                YesNotApplicableType copyGuestApartmentsAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "guestApartmentsAvailable", sourceGuestApartmentsAvailable), sourceGuestApartmentsAvailable));
                copy.setGuestApartmentsAvailable(copyGuestApartmentsAvailable);
            } else {
                copy.guestApartmentsAvailable = null;
            }
            if (this.restaurantAvailable!= null) {
                YesNotApplicableType sourceRestaurantAvailable;
                sourceRestaurantAvailable = this.getRestaurantAvailable();
                YesNotApplicableType copyRestaurantAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "restaurantAvailable", sourceRestaurantAvailable), sourceRestaurantAvailable));
                copy.setRestaurantAvailable(copyRestaurantAvailable);
            } else {
                copy.restaurantAvailable = null;
            }
            if (this.cookingFacilitiesAvailable!= null) {
                YesNotApplicableType sourceCookingFacilitiesAvailable;
                sourceCookingFacilitiesAvailable = this.getCookingFacilitiesAvailable();
                YesNotApplicableType copyCookingFacilitiesAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "cookingFacilitiesAvailable", sourceCookingFacilitiesAvailable), sourceCookingFacilitiesAvailable));
                copy.setCookingFacilitiesAvailable(copyCookingFacilitiesAvailable);
            } else {
                copy.cookingFacilitiesAvailable = null;
            }
            if (this.ownFurniturePossible!= null) {
                YesNotApplicableType sourceOwnFurniturePossible;
                sourceOwnFurniturePossible = this.getOwnFurniturePossible();
                YesNotApplicableType copyOwnFurniturePossible = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "ownFurniturePossible", sourceOwnFurniturePossible), sourceOwnFurniturePossible));
                copy.setOwnFurniturePossible(copyOwnFurniturePossible);
            } else {
                copy.ownFurniturePossible = null;
            }
            if (this.cleaningServiceAvailable!= null) {
                YesNotApplicableType sourceCleaningServiceAvailable;
                sourceCleaningServiceAvailable = this.getCleaningServiceAvailable();
                YesNotApplicableType copyCleaningServiceAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "cleaningServiceAvailable", sourceCleaningServiceAvailable), sourceCleaningServiceAvailable));
                copy.setCleaningServiceAvailable(copyCleaningServiceAvailable);
            } else {
                copy.cleaningServiceAvailable = null;
            }
            if (this.shoppingFacilitiesAvailable!= null) {
                YesNotApplicableType sourceShoppingFacilitiesAvailable;
                sourceShoppingFacilitiesAvailable = this.getShoppingFacilitiesAvailable();
                YesNotApplicableType copyShoppingFacilitiesAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "shoppingFacilitiesAvailable", sourceShoppingFacilitiesAvailable), sourceShoppingFacilitiesAvailable));
                copy.setShoppingFacilitiesAvailable(copyShoppingFacilitiesAvailable);
            } else {
                copy.shoppingFacilitiesAvailable = null;
            }
            if (this.security24Hours!= null) {
                YesNotApplicableType sourceSecurity24Hours;
                sourceSecurity24Hours = this.getSecurity24Hours();
                YesNotApplicableType copySecurity24Hours = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "security24Hours", sourceSecurity24Hours), sourceSecurity24Hours));
                copy.setSecurity24Hours(copySecurity24Hours);
            } else {
                copy.security24Hours = null;
            }
            if (this.culturalProgramAvailable!= null) {
                YesNotApplicableType sourceCulturalProgramAvailable;
                sourceCulturalProgramAvailable = this.getCulturalProgramAvailable();
                YesNotApplicableType copyCulturalProgramAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "culturalProgramAvailable", sourceCulturalProgramAvailable), sourceCulturalProgramAvailable));
                copy.setCulturalProgramAvailable(copyCulturalProgramAvailable);
            } else {
                copy.culturalProgramAvailable = null;
            }
            if (this.leisureActivitiesAvailable!= null) {
                YesNotApplicableType sourceLeisureActivitiesAvailable;
                sourceLeisureActivitiesAvailable = this.getLeisureActivitiesAvailable();
                YesNotApplicableType copyLeisureActivitiesAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "leisureActivitiesAvailable", sourceLeisureActivitiesAvailable), sourceLeisureActivitiesAvailable));
                copy.setLeisureActivitiesAvailable(copyLeisureActivitiesAvailable);
            } else {
                copy.leisureActivitiesAvailable = null;
            }
            if (this.religiousOfferingsAvailable!= null) {
                YesNotApplicableType sourceReligiousOfferingsAvailable;
                sourceReligiousOfferingsAvailable = this.getReligiousOfferingsAvailable();
                YesNotApplicableType copyReligiousOfferingsAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "religiousOfferingsAvailable", sourceReligiousOfferingsAvailable), sourceReligiousOfferingsAvailable));
                copy.setReligiousOfferingsAvailable(copyReligiousOfferingsAvailable);
            } else {
                copy.religiousOfferingsAvailable = null;
            }
            if (this.balconyAvailable!= null) {
                BalconyAvailableType sourceBalconyAvailable;
                sourceBalconyAvailable = this.getBalconyAvailable();
                BalconyAvailableType copyBalconyAvailable = ((BalconyAvailableType) strategy.copy(LocatorUtils.property(locator, "balconyAvailable", sourceBalconyAvailable), sourceBalconyAvailable));
                copy.setBalconyAvailable(copyBalconyAvailable);
            } else {
                copy.balconyAvailable = null;
            }
            if (this.branchEntry!= null) {
                Boolean sourceBranchEntry;
                sourceBranchEntry = this.isBranchEntry();
                Boolean copyBranchEntry = ((Boolean) strategy.copy(LocatorUtils.property(locator, "branchEntry", sourceBranchEntry), sourceBranchEntry));
                copy.setBranchEntry(copyBranchEntry);
            } else {
                copy.branchEntry = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new AssistedLiving();
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
        final AssistedLiving that = ((AssistedLiving) object);
        {
            String lhsShortDescription;
            lhsShortDescription = this.getShortDescription();
            String rhsShortDescription;
            rhsShortDescription = that.getShortDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shortDescription", lhsShortDescription), LocatorUtils.property(thatLocator, "shortDescription", rhsShortDescription), lhsShortDescription, rhsShortDescription)) {
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
            YesNotApplicableType lhsTrialLivingPossible;
            lhsTrialLivingPossible = this.getTrialLivingPossible();
            YesNotApplicableType rhsTrialLivingPossible;
            rhsTrialLivingPossible = that.getTrialLivingPossible();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trialLivingPossible", lhsTrialLivingPossible), LocatorUtils.property(thatLocator, "trialLivingPossible", rhsTrialLivingPossible), lhsTrialLivingPossible, rhsTrialLivingPossible)) {
                return false;
            }
        }
        {
            MarketingType lhsMarketingType;
            lhsMarketingType = this.getMarketingType();
            MarketingType rhsMarketingType;
            rhsMarketingType = that.getMarketingType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "marketingType", lhsMarketingType), LocatorUtils.property(thatLocator, "marketingType", rhsMarketingType), lhsMarketingType, rhsMarketingType)) {
                return false;
            }
        }
        {
            FacilityType lhsFacilityType;
            lhsFacilityType = this.getFacilityType();
            FacilityType rhsFacilityType;
            rhsFacilityType = that.getFacilityType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "facilityType", lhsFacilityType), LocatorUtils.property(thatLocator, "facilityType", rhsFacilityType), lhsFacilityType, rhsFacilityType)) {
                return false;
            }
        }
        {
            Price lhsMinBaseRent;
            lhsMinBaseRent = this.getMinBaseRent();
            Price rhsMinBaseRent;
            rhsMinBaseRent = that.getMinBaseRent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minBaseRent", lhsMinBaseRent), LocatorUtils.property(thatLocator, "minBaseRent", rhsMinBaseRent), lhsMinBaseRent, rhsMinBaseRent)) {
                return false;
            }
        }
        {
            Price lhsMinPurchasePrice;
            lhsMinPurchasePrice = this.getMinPurchasePrice();
            Price rhsMinPurchasePrice;
            rhsMinPurchasePrice = that.getMinPurchasePrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minPurchasePrice", lhsMinPurchasePrice), LocatorUtils.property(thatLocator, "minPurchasePrice", rhsMinPurchasePrice), lhsMinPurchasePrice, rhsMinPurchasePrice)) {
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
            BigDecimal lhsRoomAvailableFrom;
            lhsRoomAvailableFrom = this.getRoomAvailableFrom();
            BigDecimal rhsRoomAvailableFrom;
            rhsRoomAvailableFrom = that.getRoomAvailableFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "roomAvailableFrom", lhsRoomAvailableFrom), LocatorUtils.property(thatLocator, "roomAvailableFrom", rhsRoomAvailableFrom), lhsRoomAvailableFrom, rhsRoomAvailableFrom)) {
                return false;
            }
        }
        {
            BigDecimal lhsRoomAvailableTo;
            lhsRoomAvailableTo = this.getRoomAvailableTo();
            BigDecimal rhsRoomAvailableTo;
            rhsRoomAvailableTo = that.getRoomAvailableTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "roomAvailableTo", lhsRoomAvailableTo), LocatorUtils.property(thatLocator, "roomAvailableTo", rhsRoomAvailableTo), lhsRoomAvailableTo, rhsRoomAvailableTo)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCookingPossibilty;
            lhsCookingPossibilty = this.getCookingPossibilty();
            YesNotApplicableType rhsCookingPossibilty;
            rhsCookingPossibilty = that.getCookingPossibilty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cookingPossibilty", lhsCookingPossibilty), LocatorUtils.property(thatLocator, "cookingPossibilty", rhsCookingPossibilty), lhsCookingPossibilty, rhsCookingPossibilty)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsParkingAvailable;
            lhsParkingAvailable = this.getParkingAvailable();
            YesNotApplicableType rhsParkingAvailable;
            rhsParkingAvailable = that.getParkingAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parkingAvailable", lhsParkingAvailable), LocatorUtils.property(thatLocator, "parkingAvailable", rhsParkingAvailable), lhsParkingAvailable, rhsParkingAvailable)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCommonRoomsAvailable;
            lhsCommonRoomsAvailable = this.getCommonRoomsAvailable();
            YesNotApplicableType rhsCommonRoomsAvailable;
            rhsCommonRoomsAvailable = that.getCommonRoomsAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commonRoomsAvailable", lhsCommonRoomsAvailable), LocatorUtils.property(thatLocator, "commonRoomsAvailable", rhsCommonRoomsAvailable), lhsCommonRoomsAvailable, rhsCommonRoomsAvailable)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsGardenAvailable;
            lhsGardenAvailable = this.getGardenAvailable();
            YesNotApplicableType rhsGardenAvailable;
            rhsGardenAvailable = that.getGardenAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gardenAvailable", lhsGardenAvailable), LocatorUtils.property(thatLocator, "gardenAvailable", rhsGardenAvailable), lhsGardenAvailable, rhsGardenAvailable)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsFitnessAvailable;
            lhsFitnessAvailable = this.getFitnessAvailable();
            YesNotApplicableType rhsFitnessAvailable;
            rhsFitnessAvailable = that.getFitnessAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fitnessAvailable", lhsFitnessAvailable), LocatorUtils.property(thatLocator, "fitnessAvailable", rhsFitnessAvailable), lhsFitnessAvailable, rhsFitnessAvailable)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsPoolAvailable;
            lhsPoolAvailable = this.getPoolAvailable();
            YesNotApplicableType rhsPoolAvailable;
            rhsPoolAvailable = that.getPoolAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "poolAvailable", lhsPoolAvailable), LocatorUtils.property(thatLocator, "poolAvailable", rhsPoolAvailable), lhsPoolAvailable, rhsPoolAvailable)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsPublicTransportationAvailable;
            lhsPublicTransportationAvailable = this.getPublicTransportationAvailable();
            YesNotApplicableType rhsPublicTransportationAvailable;
            rhsPublicTransportationAvailable = that.getPublicTransportationAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publicTransportationAvailable", lhsPublicTransportationAvailable), LocatorUtils.property(thatLocator, "publicTransportationAvailable", rhsPublicTransportationAvailable), lhsPublicTransportationAvailable, rhsPublicTransportationAvailable)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsAmbulantNursingServiceAvailable;
            lhsAmbulantNursingServiceAvailable = this.getAmbulantNursingServiceAvailable();
            YesNotApplicableType rhsAmbulantNursingServiceAvailable;
            rhsAmbulantNursingServiceAvailable = that.getAmbulantNursingServiceAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ambulantNursingServiceAvailable", lhsAmbulantNursingServiceAvailable), LocatorUtils.property(thatLocator, "ambulantNursingServiceAvailable", rhsAmbulantNursingServiceAvailable), lhsAmbulantNursingServiceAvailable, rhsAmbulantNursingServiceAvailable)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsEmergencyCallInRoomAvailable;
            lhsEmergencyCallInRoomAvailable = this.getEmergencyCallInRoomAvailable();
            YesNotApplicableType rhsEmergencyCallInRoomAvailable;
            rhsEmergencyCallInRoomAvailable = that.getEmergencyCallInRoomAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emergencyCallInRoomAvailable", lhsEmergencyCallInRoomAvailable), LocatorUtils.property(thatLocator, "emergencyCallInRoomAvailable", rhsEmergencyCallInRoomAvailable), lhsEmergencyCallInRoomAvailable, rhsEmergencyCallInRoomAvailable)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsReceptionManned;
            lhsReceptionManned = this.getReceptionManned();
            YesNotApplicableType rhsReceptionManned;
            rhsReceptionManned = that.getReceptionManned();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "receptionManned", lhsReceptionManned), LocatorUtils.property(thatLocator, "receptionManned", rhsReceptionManned), lhsReceptionManned, rhsReceptionManned)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsMedicalAssistanceAvailable;
            lhsMedicalAssistanceAvailable = this.getMedicalAssistanceAvailable();
            YesNotApplicableType rhsMedicalAssistanceAvailable;
            rhsMedicalAssistanceAvailable = that.getMedicalAssistanceAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "medicalAssistanceAvailable", lhsMedicalAssistanceAvailable), LocatorUtils.property(thatLocator, "medicalAssistanceAvailable", rhsMedicalAssistanceAvailable), lhsMedicalAssistanceAvailable, rhsMedicalAssistanceAvailable)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsHomeHelpAvailable;
            lhsHomeHelpAvailable = this.getHomeHelpAvailable();
            YesNotApplicableType rhsHomeHelpAvailable;
            rhsHomeHelpAvailable = that.getHomeHelpAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "homeHelpAvailable", lhsHomeHelpAvailable), LocatorUtils.property(thatLocator, "homeHelpAvailable", rhsHomeHelpAvailable), lhsHomeHelpAvailable, rhsHomeHelpAvailable)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCounselingAvailable;
            lhsCounselingAvailable = this.getCounselingAvailable();
            YesNotApplicableType rhsCounselingAvailable;
            rhsCounselingAvailable = that.getCounselingAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "counselingAvailable", lhsCounselingAvailable), LocatorUtils.property(thatLocator, "counselingAvailable", rhsCounselingAvailable), lhsCounselingAvailable, rhsCounselingAvailable)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsLoansAvailable;
            lhsLoansAvailable = this.getLoansAvailable();
            YesNotApplicableType rhsLoansAvailable;
            rhsLoansAvailable = that.getLoansAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "loansAvailable", lhsLoansAvailable), LocatorUtils.property(thatLocator, "loansAvailable", rhsLoansAvailable), lhsLoansAvailable, rhsLoansAvailable)) {
                return false;
            }
        }
        {
            BigDecimal lhsNumberOfRoomsFrom;
            lhsNumberOfRoomsFrom = this.getNumberOfRoomsFrom();
            BigDecimal rhsNumberOfRoomsFrom;
            rhsNumberOfRoomsFrom = that.getNumberOfRoomsFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfRoomsFrom", lhsNumberOfRoomsFrom), LocatorUtils.property(thatLocator, "numberOfRoomsFrom", rhsNumberOfRoomsFrom), lhsNumberOfRoomsFrom, rhsNumberOfRoomsFrom)) {
                return false;
            }
        }
        {
            BigDecimal lhsNumberOfRoomsTo;
            lhsNumberOfRoomsTo = this.getNumberOfRoomsTo();
            BigDecimal rhsNumberOfRoomsTo;
            rhsNumberOfRoomsTo = that.getNumberOfRoomsTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfRoomsTo", lhsNumberOfRoomsTo), LocatorUtils.property(thatLocator, "numberOfRoomsTo", rhsNumberOfRoomsTo), lhsNumberOfRoomsTo, rhsNumberOfRoomsTo)) {
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
            HeatingTypeEnev2014 lhsHeatingTypeEnev2014;
            lhsHeatingTypeEnev2014 = this.getHeatingTypeEnev2014();
            HeatingTypeEnev2014 rhsHeatingTypeEnev2014;
            rhsHeatingTypeEnev2014 = that.getHeatingTypeEnev2014();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heatingTypeEnev2014", lhsHeatingTypeEnev2014), LocatorUtils.property(thatLocator, "heatingTypeEnev2014", rhsHeatingTypeEnev2014), lhsHeatingTypeEnev2014, rhsHeatingTypeEnev2014)) {
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
            YesNotApplicableType lhsBarrierFree;
            lhsBarrierFree = this.getBarrierFree();
            YesNotApplicableType rhsBarrierFree;
            rhsBarrierFree = that.getBarrierFree();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "barrierFree", lhsBarrierFree), LocatorUtils.property(thatLocator, "barrierFree", rhsBarrierFree), lhsBarrierFree, rhsBarrierFree)) {
                return false;
            }
        }
        {
            Long lhsNumberOfLookedAfterApartments;
            lhsNumberOfLookedAfterApartments = this.getNumberOfLookedAfterApartments();
            Long rhsNumberOfLookedAfterApartments;
            rhsNumberOfLookedAfterApartments = that.getNumberOfLookedAfterApartments();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfLookedAfterApartments", lhsNumberOfLookedAfterApartments), LocatorUtils.property(thatLocator, "numberOfLookedAfterApartments", rhsNumberOfLookedAfterApartments), lhsNumberOfLookedAfterApartments, rhsNumberOfLookedAfterApartments)) {
                return false;
            }
        }
        {
            Long lhsNumberOfNursingPlaces;
            lhsNumberOfNursingPlaces = this.getNumberOfNursingPlaces();
            Long rhsNumberOfNursingPlaces;
            rhsNumberOfNursingPlaces = that.getNumberOfNursingPlaces();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfNursingPlaces", lhsNumberOfNursingPlaces), LocatorUtils.property(thatLocator, "numberOfNursingPlaces", rhsNumberOfNursingPlaces), lhsNumberOfNursingPlaces, rhsNumberOfNursingPlaces)) {
                return false;
            }
        }
        {
            BigDecimal lhsLivingSpaceFrom;
            lhsLivingSpaceFrom = this.getLivingSpaceFrom();
            BigDecimal rhsLivingSpaceFrom;
            rhsLivingSpaceFrom = that.getLivingSpaceFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "livingSpaceFrom", lhsLivingSpaceFrom), LocatorUtils.property(thatLocator, "livingSpaceFrom", rhsLivingSpaceFrom), lhsLivingSpaceFrom, rhsLivingSpaceFrom)) {
                return false;
            }
        }
        {
            BigDecimal lhsLivingSpaceTo;
            lhsLivingSpaceTo = this.getLivingSpaceTo();
            BigDecimal rhsLivingSpaceTo;
            rhsLivingSpaceTo = that.getLivingSpaceTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "livingSpaceTo", lhsLivingSpaceTo), LocatorUtils.property(thatLocator, "livingSpaceTo", rhsLivingSpaceTo), lhsLivingSpaceTo, rhsLivingSpaceTo)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsHandicappedAccessible;
            lhsHandicappedAccessible = this.getHandicappedAccessible();
            YesNotApplicableType rhsHandicappedAccessible;
            rhsHandicappedAccessible = that.getHandicappedAccessible();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "handicappedAccessible", lhsHandicappedAccessible), LocatorUtils.property(thatLocator, "handicappedAccessible", rhsHandicappedAccessible), lhsHandicappedAccessible, rhsHandicappedAccessible)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsGuestApartmentsAvailable;
            lhsGuestApartmentsAvailable = this.getGuestApartmentsAvailable();
            YesNotApplicableType rhsGuestApartmentsAvailable;
            rhsGuestApartmentsAvailable = that.getGuestApartmentsAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "guestApartmentsAvailable", lhsGuestApartmentsAvailable), LocatorUtils.property(thatLocator, "guestApartmentsAvailable", rhsGuestApartmentsAvailable), lhsGuestApartmentsAvailable, rhsGuestApartmentsAvailable)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsRestaurantAvailable;
            lhsRestaurantAvailable = this.getRestaurantAvailable();
            YesNotApplicableType rhsRestaurantAvailable;
            rhsRestaurantAvailable = that.getRestaurantAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "restaurantAvailable", lhsRestaurantAvailable), LocatorUtils.property(thatLocator, "restaurantAvailable", rhsRestaurantAvailable), lhsRestaurantAvailable, rhsRestaurantAvailable)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCookingFacilitiesAvailable;
            lhsCookingFacilitiesAvailable = this.getCookingFacilitiesAvailable();
            YesNotApplicableType rhsCookingFacilitiesAvailable;
            rhsCookingFacilitiesAvailable = that.getCookingFacilitiesAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cookingFacilitiesAvailable", lhsCookingFacilitiesAvailable), LocatorUtils.property(thatLocator, "cookingFacilitiesAvailable", rhsCookingFacilitiesAvailable), lhsCookingFacilitiesAvailable, rhsCookingFacilitiesAvailable)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsOwnFurniturePossible;
            lhsOwnFurniturePossible = this.getOwnFurniturePossible();
            YesNotApplicableType rhsOwnFurniturePossible;
            rhsOwnFurniturePossible = that.getOwnFurniturePossible();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ownFurniturePossible", lhsOwnFurniturePossible), LocatorUtils.property(thatLocator, "ownFurniturePossible", rhsOwnFurniturePossible), lhsOwnFurniturePossible, rhsOwnFurniturePossible)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCleaningServiceAvailable;
            lhsCleaningServiceAvailable = this.getCleaningServiceAvailable();
            YesNotApplicableType rhsCleaningServiceAvailable;
            rhsCleaningServiceAvailable = that.getCleaningServiceAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cleaningServiceAvailable", lhsCleaningServiceAvailable), LocatorUtils.property(thatLocator, "cleaningServiceAvailable", rhsCleaningServiceAvailable), lhsCleaningServiceAvailable, rhsCleaningServiceAvailable)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsShoppingFacilitiesAvailable;
            lhsShoppingFacilitiesAvailable = this.getShoppingFacilitiesAvailable();
            YesNotApplicableType rhsShoppingFacilitiesAvailable;
            rhsShoppingFacilitiesAvailable = that.getShoppingFacilitiesAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shoppingFacilitiesAvailable", lhsShoppingFacilitiesAvailable), LocatorUtils.property(thatLocator, "shoppingFacilitiesAvailable", rhsShoppingFacilitiesAvailable), lhsShoppingFacilitiesAvailable, rhsShoppingFacilitiesAvailable)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsSecurity24Hours;
            lhsSecurity24Hours = this.getSecurity24Hours();
            YesNotApplicableType rhsSecurity24Hours;
            rhsSecurity24Hours = that.getSecurity24Hours();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "security24Hours", lhsSecurity24Hours), LocatorUtils.property(thatLocator, "security24Hours", rhsSecurity24Hours), lhsSecurity24Hours, rhsSecurity24Hours)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCulturalProgramAvailable;
            lhsCulturalProgramAvailable = this.getCulturalProgramAvailable();
            YesNotApplicableType rhsCulturalProgramAvailable;
            rhsCulturalProgramAvailable = that.getCulturalProgramAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "culturalProgramAvailable", lhsCulturalProgramAvailable), LocatorUtils.property(thatLocator, "culturalProgramAvailable", rhsCulturalProgramAvailable), lhsCulturalProgramAvailable, rhsCulturalProgramAvailable)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsLeisureActivitiesAvailable;
            lhsLeisureActivitiesAvailable = this.getLeisureActivitiesAvailable();
            YesNotApplicableType rhsLeisureActivitiesAvailable;
            rhsLeisureActivitiesAvailable = that.getLeisureActivitiesAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leisureActivitiesAvailable", lhsLeisureActivitiesAvailable), LocatorUtils.property(thatLocator, "leisureActivitiesAvailable", rhsLeisureActivitiesAvailable), lhsLeisureActivitiesAvailable, rhsLeisureActivitiesAvailable)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsReligiousOfferingsAvailable;
            lhsReligiousOfferingsAvailable = this.getReligiousOfferingsAvailable();
            YesNotApplicableType rhsReligiousOfferingsAvailable;
            rhsReligiousOfferingsAvailable = that.getReligiousOfferingsAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "religiousOfferingsAvailable", lhsReligiousOfferingsAvailable), LocatorUtils.property(thatLocator, "religiousOfferingsAvailable", rhsReligiousOfferingsAvailable), lhsReligiousOfferingsAvailable, rhsReligiousOfferingsAvailable)) {
                return false;
            }
        }
        {
            BalconyAvailableType lhsBalconyAvailable;
            lhsBalconyAvailable = this.getBalconyAvailable();
            BalconyAvailableType rhsBalconyAvailable;
            rhsBalconyAvailable = that.getBalconyAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balconyAvailable", lhsBalconyAvailable), LocatorUtils.property(thatLocator, "balconyAvailable", rhsBalconyAvailable), lhsBalconyAvailable, rhsBalconyAvailable)) {
                return false;
            }
        }
        {
            Boolean lhsBranchEntry;
            lhsBranchEntry = this.isBranchEntry();
            Boolean rhsBranchEntry;
            rhsBranchEntry = that.isBranchEntry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "branchEntry", lhsBranchEntry), LocatorUtils.property(thatLocator, "branchEntry", rhsBranchEntry), lhsBranchEntry, rhsBranchEntry)) {
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
