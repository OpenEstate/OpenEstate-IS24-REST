
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
import org.openestate.is24.restapi.xml.common.BalconyAvailableType;
import org.openestate.is24.restapi.xml.common.CareLevelExpose;
import org.openestate.is24.restapi.xml.common.CareTypes;
import org.openestate.is24.restapi.xml.common.PetsAllowedType;
import org.openestate.is24.restapi.xml.common.Price;
import org.openestate.is24.restapi.xml.common.RoomType;
import org.openestate.is24.restapi.xml.common.YesNotApplicableType;


/**
 * Eigenschaften f\u00fcr den Immobilientyp Altenpflege
 * 
 * <p>Java class for SeniorCare complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeniorCare"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/realestates/1.0}RealEstate"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}ExtendedSeniorCareGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeniorCare", propOrder = {
    "shortDescription",
    "petsAllowed",
    "trialLivingPossible",
    "careTypes",
    "careLevel",
    "price",
    "numberOfBeds",
    "opening",
    "careOfDementia",
    "careOfArtificialRespiration",
    "careOfComaVigil",
    "careOfStroke",
    "careOfParkinson",
    "careOfAlzheimer",
    "careOfMultipleSclerosis",
    "kitchenAvailable",
    "roomType",
    "therapyOfferingsAvailable",
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
public class SeniorCare
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
    protected CareTypes careTypes;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CareLevelExpose careLevel;
    protected Price price;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long numberOfBeds;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "date")
    protected Calendar opening;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType careOfDementia;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType careOfArtificialRespiration;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType careOfComaVigil;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType careOfStroke;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType careOfParkinson;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType careOfAlzheimer;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType careOfMultipleSclerosis;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType kitchenAvailable;
    @XmlSchemaType(name = "string")
    protected RoomType roomType;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType therapyOfferingsAvailable;
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
     * Gets the value of the careTypes property.
     * 
     * @return
     *     possible object is
     *     {@link CareTypes }
     *     
     */
    public CareTypes getCareTypes() {
        return careTypes;
    }

    /**
     * Sets the value of the careTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CareTypes }
     *     
     */
    public void setCareTypes(CareTypes value) {
        this.careTypes = value;
    }

    /**
     * Gets the value of the careLevel property.
     * 
     * @return
     *     possible object is
     *     {@link CareLevelExpose }
     *     
     */
    public CareLevelExpose getCareLevel() {
        return careLevel;
    }

    /**
     * Sets the value of the careLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CareLevelExpose }
     *     
     */
    public void setCareLevel(CareLevelExpose value) {
        this.careLevel = value;
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
     * Gets the value of the numberOfBeds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getNumberOfBeds() {
        return numberOfBeds;
    }

    /**
     * Sets the value of the numberOfBeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfBeds(Long value) {
        this.numberOfBeds = value;
    }

    /**
     * Gets the value of the opening property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getOpening() {
        return opening;
    }

    /**
     * Sets the value of the opening property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpening(Calendar value) {
        this.opening = value;
    }

    /**
     * Gets the value of the careOfDementia property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCareOfDementia() {
        return careOfDementia;
    }

    /**
     * Sets the value of the careOfDementia property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCareOfDementia(YesNotApplicableType value) {
        this.careOfDementia = value;
    }

    /**
     * Gets the value of the careOfArtificialRespiration property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCareOfArtificialRespiration() {
        return careOfArtificialRespiration;
    }

    /**
     * Sets the value of the careOfArtificialRespiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCareOfArtificialRespiration(YesNotApplicableType value) {
        this.careOfArtificialRespiration = value;
    }

    /**
     * Gets the value of the careOfComaVigil property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCareOfComaVigil() {
        return careOfComaVigil;
    }

    /**
     * Sets the value of the careOfComaVigil property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCareOfComaVigil(YesNotApplicableType value) {
        this.careOfComaVigil = value;
    }

    /**
     * Gets the value of the careOfStroke property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCareOfStroke() {
        return careOfStroke;
    }

    /**
     * Sets the value of the careOfStroke property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCareOfStroke(YesNotApplicableType value) {
        this.careOfStroke = value;
    }

    /**
     * Gets the value of the careOfParkinson property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCareOfParkinson() {
        return careOfParkinson;
    }

    /**
     * Sets the value of the careOfParkinson property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCareOfParkinson(YesNotApplicableType value) {
        this.careOfParkinson = value;
    }

    /**
     * Gets the value of the careOfAlzheimer property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCareOfAlzheimer() {
        return careOfAlzheimer;
    }

    /**
     * Sets the value of the careOfAlzheimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCareOfAlzheimer(YesNotApplicableType value) {
        this.careOfAlzheimer = value;
    }

    /**
     * Gets the value of the careOfMultipleSclerosis property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCareOfMultipleSclerosis() {
        return careOfMultipleSclerosis;
    }

    /**
     * Sets the value of the careOfMultipleSclerosis property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCareOfMultipleSclerosis(YesNotApplicableType value) {
        this.careOfMultipleSclerosis = value;
    }

    /**
     * Gets the value of the kitchenAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getKitchenAvailable() {
        return kitchenAvailable;
    }

    /**
     * Sets the value of the kitchenAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setKitchenAvailable(YesNotApplicableType value) {
        this.kitchenAvailable = value;
    }

    /**
     * Gets the value of the roomType property.
     * 
     * @return
     *     possible object is
     *     {@link RoomType }
     *     
     */
    public RoomType getRoomType() {
        return roomType;
    }

    /**
     * Sets the value of the roomType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomType }
     *     
     */
    public void setRoomType(RoomType value) {
        this.roomType = value;
    }

    /**
     * Gets the value of the therapyOfferingsAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getTherapyOfferingsAvailable() {
        return therapyOfferingsAvailable;
    }

    /**
     * Sets the value of the therapyOfferingsAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setTherapyOfferingsAvailable(YesNotApplicableType value) {
        this.therapyOfferingsAvailable = value;
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
            CareTypes theCareTypes;
            theCareTypes = this.getCareTypes();
            strategy.appendField(locator, this, "careTypes", buffer, theCareTypes);
        }
        {
            CareLevelExpose theCareLevel;
            theCareLevel = this.getCareLevel();
            strategy.appendField(locator, this, "careLevel", buffer, theCareLevel);
        }
        {
            Price thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice);
        }
        {
            Long theNumberOfBeds;
            theNumberOfBeds = this.getNumberOfBeds();
            strategy.appendField(locator, this, "numberOfBeds", buffer, theNumberOfBeds);
        }
        {
            Calendar theOpening;
            theOpening = this.getOpening();
            strategy.appendField(locator, this, "opening", buffer, theOpening);
        }
        {
            YesNotApplicableType theCareOfDementia;
            theCareOfDementia = this.getCareOfDementia();
            strategy.appendField(locator, this, "careOfDementia", buffer, theCareOfDementia);
        }
        {
            YesNotApplicableType theCareOfArtificialRespiration;
            theCareOfArtificialRespiration = this.getCareOfArtificialRespiration();
            strategy.appendField(locator, this, "careOfArtificialRespiration", buffer, theCareOfArtificialRespiration);
        }
        {
            YesNotApplicableType theCareOfComaVigil;
            theCareOfComaVigil = this.getCareOfComaVigil();
            strategy.appendField(locator, this, "careOfComaVigil", buffer, theCareOfComaVigil);
        }
        {
            YesNotApplicableType theCareOfStroke;
            theCareOfStroke = this.getCareOfStroke();
            strategy.appendField(locator, this, "careOfStroke", buffer, theCareOfStroke);
        }
        {
            YesNotApplicableType theCareOfParkinson;
            theCareOfParkinson = this.getCareOfParkinson();
            strategy.appendField(locator, this, "careOfParkinson", buffer, theCareOfParkinson);
        }
        {
            YesNotApplicableType theCareOfAlzheimer;
            theCareOfAlzheimer = this.getCareOfAlzheimer();
            strategy.appendField(locator, this, "careOfAlzheimer", buffer, theCareOfAlzheimer);
        }
        {
            YesNotApplicableType theCareOfMultipleSclerosis;
            theCareOfMultipleSclerosis = this.getCareOfMultipleSclerosis();
            strategy.appendField(locator, this, "careOfMultipleSclerosis", buffer, theCareOfMultipleSclerosis);
        }
        {
            YesNotApplicableType theKitchenAvailable;
            theKitchenAvailable = this.getKitchenAvailable();
            strategy.appendField(locator, this, "kitchenAvailable", buffer, theKitchenAvailable);
        }
        {
            RoomType theRoomType;
            theRoomType = this.getRoomType();
            strategy.appendField(locator, this, "roomType", buffer, theRoomType);
        }
        {
            YesNotApplicableType theTherapyOfferingsAvailable;
            theTherapyOfferingsAvailable = this.getTherapyOfferingsAvailable();
            strategy.appendField(locator, this, "therapyOfferingsAvailable", buffer, theTherapyOfferingsAvailable);
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
        if (draftCopy instanceof SeniorCare) {
            final SeniorCare copy = ((SeniorCare) draftCopy);
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
            if (this.careTypes!= null) {
                CareTypes sourceCareTypes;
                sourceCareTypes = this.getCareTypes();
                CareTypes copyCareTypes = ((CareTypes) strategy.copy(LocatorUtils.property(locator, "careTypes", sourceCareTypes), sourceCareTypes));
                copy.setCareTypes(copyCareTypes);
            } else {
                copy.careTypes = null;
            }
            if (this.careLevel!= null) {
                CareLevelExpose sourceCareLevel;
                sourceCareLevel = this.getCareLevel();
                CareLevelExpose copyCareLevel = ((CareLevelExpose) strategy.copy(LocatorUtils.property(locator, "careLevel", sourceCareLevel), sourceCareLevel));
                copy.setCareLevel(copyCareLevel);
            } else {
                copy.careLevel = null;
            }
            if (this.price!= null) {
                Price sourcePrice;
                sourcePrice = this.getPrice();
                Price copyPrice = ((Price) strategy.copy(LocatorUtils.property(locator, "price", sourcePrice), sourcePrice));
                copy.setPrice(copyPrice);
            } else {
                copy.price = null;
            }
            if (this.numberOfBeds!= null) {
                Long sourceNumberOfBeds;
                sourceNumberOfBeds = this.getNumberOfBeds();
                Long copyNumberOfBeds = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfBeds", sourceNumberOfBeds), sourceNumberOfBeds));
                copy.setNumberOfBeds(copyNumberOfBeds);
            } else {
                copy.numberOfBeds = null;
            }
            if (this.opening!= null) {
                Calendar sourceOpening;
                sourceOpening = this.getOpening();
                Calendar copyOpening = ((Calendar) strategy.copy(LocatorUtils.property(locator, "opening", sourceOpening), sourceOpening));
                copy.setOpening(copyOpening);
            } else {
                copy.opening = null;
            }
            if (this.careOfDementia!= null) {
                YesNotApplicableType sourceCareOfDementia;
                sourceCareOfDementia = this.getCareOfDementia();
                YesNotApplicableType copyCareOfDementia = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "careOfDementia", sourceCareOfDementia), sourceCareOfDementia));
                copy.setCareOfDementia(copyCareOfDementia);
            } else {
                copy.careOfDementia = null;
            }
            if (this.careOfArtificialRespiration!= null) {
                YesNotApplicableType sourceCareOfArtificialRespiration;
                sourceCareOfArtificialRespiration = this.getCareOfArtificialRespiration();
                YesNotApplicableType copyCareOfArtificialRespiration = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "careOfArtificialRespiration", sourceCareOfArtificialRespiration), sourceCareOfArtificialRespiration));
                copy.setCareOfArtificialRespiration(copyCareOfArtificialRespiration);
            } else {
                copy.careOfArtificialRespiration = null;
            }
            if (this.careOfComaVigil!= null) {
                YesNotApplicableType sourceCareOfComaVigil;
                sourceCareOfComaVigil = this.getCareOfComaVigil();
                YesNotApplicableType copyCareOfComaVigil = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "careOfComaVigil", sourceCareOfComaVigil), sourceCareOfComaVigil));
                copy.setCareOfComaVigil(copyCareOfComaVigil);
            } else {
                copy.careOfComaVigil = null;
            }
            if (this.careOfStroke!= null) {
                YesNotApplicableType sourceCareOfStroke;
                sourceCareOfStroke = this.getCareOfStroke();
                YesNotApplicableType copyCareOfStroke = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "careOfStroke", sourceCareOfStroke), sourceCareOfStroke));
                copy.setCareOfStroke(copyCareOfStroke);
            } else {
                copy.careOfStroke = null;
            }
            if (this.careOfParkinson!= null) {
                YesNotApplicableType sourceCareOfParkinson;
                sourceCareOfParkinson = this.getCareOfParkinson();
                YesNotApplicableType copyCareOfParkinson = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "careOfParkinson", sourceCareOfParkinson), sourceCareOfParkinson));
                copy.setCareOfParkinson(copyCareOfParkinson);
            } else {
                copy.careOfParkinson = null;
            }
            if (this.careOfAlzheimer!= null) {
                YesNotApplicableType sourceCareOfAlzheimer;
                sourceCareOfAlzheimer = this.getCareOfAlzheimer();
                YesNotApplicableType copyCareOfAlzheimer = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "careOfAlzheimer", sourceCareOfAlzheimer), sourceCareOfAlzheimer));
                copy.setCareOfAlzheimer(copyCareOfAlzheimer);
            } else {
                copy.careOfAlzheimer = null;
            }
            if (this.careOfMultipleSclerosis!= null) {
                YesNotApplicableType sourceCareOfMultipleSclerosis;
                sourceCareOfMultipleSclerosis = this.getCareOfMultipleSclerosis();
                YesNotApplicableType copyCareOfMultipleSclerosis = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "careOfMultipleSclerosis", sourceCareOfMultipleSclerosis), sourceCareOfMultipleSclerosis));
                copy.setCareOfMultipleSclerosis(copyCareOfMultipleSclerosis);
            } else {
                copy.careOfMultipleSclerosis = null;
            }
            if (this.kitchenAvailable!= null) {
                YesNotApplicableType sourceKitchenAvailable;
                sourceKitchenAvailable = this.getKitchenAvailable();
                YesNotApplicableType copyKitchenAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "kitchenAvailable", sourceKitchenAvailable), sourceKitchenAvailable));
                copy.setKitchenAvailable(copyKitchenAvailable);
            } else {
                copy.kitchenAvailable = null;
            }
            if (this.roomType!= null) {
                RoomType sourceRoomType;
                sourceRoomType = this.getRoomType();
                RoomType copyRoomType = ((RoomType) strategy.copy(LocatorUtils.property(locator, "roomType", sourceRoomType), sourceRoomType));
                copy.setRoomType(copyRoomType);
            } else {
                copy.roomType = null;
            }
            if (this.therapyOfferingsAvailable!= null) {
                YesNotApplicableType sourceTherapyOfferingsAvailable;
                sourceTherapyOfferingsAvailable = this.getTherapyOfferingsAvailable();
                YesNotApplicableType copyTherapyOfferingsAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "therapyOfferingsAvailable", sourceTherapyOfferingsAvailable), sourceTherapyOfferingsAvailable));
                copy.setTherapyOfferingsAvailable(copyTherapyOfferingsAvailable);
            } else {
                copy.therapyOfferingsAvailable = null;
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
        return new SeniorCare();
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
        final SeniorCare that = ((SeniorCare) object);
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
            CareTypes lhsCareTypes;
            lhsCareTypes = this.getCareTypes();
            CareTypes rhsCareTypes;
            rhsCareTypes = that.getCareTypes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "careTypes", lhsCareTypes), LocatorUtils.property(thatLocator, "careTypes", rhsCareTypes), lhsCareTypes, rhsCareTypes)) {
                return false;
            }
        }
        {
            CareLevelExpose lhsCareLevel;
            lhsCareLevel = this.getCareLevel();
            CareLevelExpose rhsCareLevel;
            rhsCareLevel = that.getCareLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "careLevel", lhsCareLevel), LocatorUtils.property(thatLocator, "careLevel", rhsCareLevel), lhsCareLevel, rhsCareLevel)) {
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
            Long lhsNumberOfBeds;
            lhsNumberOfBeds = this.getNumberOfBeds();
            Long rhsNumberOfBeds;
            rhsNumberOfBeds = that.getNumberOfBeds();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfBeds", lhsNumberOfBeds), LocatorUtils.property(thatLocator, "numberOfBeds", rhsNumberOfBeds), lhsNumberOfBeds, rhsNumberOfBeds)) {
                return false;
            }
        }
        {
            Calendar lhsOpening;
            lhsOpening = this.getOpening();
            Calendar rhsOpening;
            rhsOpening = that.getOpening();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "opening", lhsOpening), LocatorUtils.property(thatLocator, "opening", rhsOpening), lhsOpening, rhsOpening)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCareOfDementia;
            lhsCareOfDementia = this.getCareOfDementia();
            YesNotApplicableType rhsCareOfDementia;
            rhsCareOfDementia = that.getCareOfDementia();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "careOfDementia", lhsCareOfDementia), LocatorUtils.property(thatLocator, "careOfDementia", rhsCareOfDementia), lhsCareOfDementia, rhsCareOfDementia)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCareOfArtificialRespiration;
            lhsCareOfArtificialRespiration = this.getCareOfArtificialRespiration();
            YesNotApplicableType rhsCareOfArtificialRespiration;
            rhsCareOfArtificialRespiration = that.getCareOfArtificialRespiration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "careOfArtificialRespiration", lhsCareOfArtificialRespiration), LocatorUtils.property(thatLocator, "careOfArtificialRespiration", rhsCareOfArtificialRespiration), lhsCareOfArtificialRespiration, rhsCareOfArtificialRespiration)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCareOfComaVigil;
            lhsCareOfComaVigil = this.getCareOfComaVigil();
            YesNotApplicableType rhsCareOfComaVigil;
            rhsCareOfComaVigil = that.getCareOfComaVigil();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "careOfComaVigil", lhsCareOfComaVigil), LocatorUtils.property(thatLocator, "careOfComaVigil", rhsCareOfComaVigil), lhsCareOfComaVigil, rhsCareOfComaVigil)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCareOfStroke;
            lhsCareOfStroke = this.getCareOfStroke();
            YesNotApplicableType rhsCareOfStroke;
            rhsCareOfStroke = that.getCareOfStroke();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "careOfStroke", lhsCareOfStroke), LocatorUtils.property(thatLocator, "careOfStroke", rhsCareOfStroke), lhsCareOfStroke, rhsCareOfStroke)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCareOfParkinson;
            lhsCareOfParkinson = this.getCareOfParkinson();
            YesNotApplicableType rhsCareOfParkinson;
            rhsCareOfParkinson = that.getCareOfParkinson();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "careOfParkinson", lhsCareOfParkinson), LocatorUtils.property(thatLocator, "careOfParkinson", rhsCareOfParkinson), lhsCareOfParkinson, rhsCareOfParkinson)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCareOfAlzheimer;
            lhsCareOfAlzheimer = this.getCareOfAlzheimer();
            YesNotApplicableType rhsCareOfAlzheimer;
            rhsCareOfAlzheimer = that.getCareOfAlzheimer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "careOfAlzheimer", lhsCareOfAlzheimer), LocatorUtils.property(thatLocator, "careOfAlzheimer", rhsCareOfAlzheimer), lhsCareOfAlzheimer, rhsCareOfAlzheimer)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCareOfMultipleSclerosis;
            lhsCareOfMultipleSclerosis = this.getCareOfMultipleSclerosis();
            YesNotApplicableType rhsCareOfMultipleSclerosis;
            rhsCareOfMultipleSclerosis = that.getCareOfMultipleSclerosis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "careOfMultipleSclerosis", lhsCareOfMultipleSclerosis), LocatorUtils.property(thatLocator, "careOfMultipleSclerosis", rhsCareOfMultipleSclerosis), lhsCareOfMultipleSclerosis, rhsCareOfMultipleSclerosis)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsKitchenAvailable;
            lhsKitchenAvailable = this.getKitchenAvailable();
            YesNotApplicableType rhsKitchenAvailable;
            rhsKitchenAvailable = that.getKitchenAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kitchenAvailable", lhsKitchenAvailable), LocatorUtils.property(thatLocator, "kitchenAvailable", rhsKitchenAvailable), lhsKitchenAvailable, rhsKitchenAvailable)) {
                return false;
            }
        }
        {
            RoomType lhsRoomType;
            lhsRoomType = this.getRoomType();
            RoomType rhsRoomType;
            rhsRoomType = that.getRoomType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "roomType", lhsRoomType), LocatorUtils.property(thatLocator, "roomType", rhsRoomType), lhsRoomType, rhsRoomType)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsTherapyOfferingsAvailable;
            lhsTherapyOfferingsAvailable = this.getTherapyOfferingsAvailable();
            YesNotApplicableType rhsTherapyOfferingsAvailable;
            rhsTherapyOfferingsAvailable = that.getTherapyOfferingsAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "therapyOfferingsAvailable", lhsTherapyOfferingsAvailable), LocatorUtils.property(thatLocator, "therapyOfferingsAvailable", rhsTherapyOfferingsAvailable), lhsTherapyOfferingsAvailable, rhsTherapyOfferingsAvailable)) {
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
