
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
import org.openestate.is24.restapi.xml.common.Adapter2;
import org.openestate.is24.restapi.xml.common.BuildingEnergyRatingType;
import org.openestate.is24.restapi.xml.common.BuildingType;
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


/**
 * Eigenschaften f\u00fcr den
 *         Haus-Miete Immobilientyp
 * 
 * <p>Java class for HouseRent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HouseRent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/realestates/1.0}RealEstate"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}ExtendedHouseRentGroup"/&gt;
 *         &lt;element name="builtInKitchen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HouseRent", propOrder = {
    "price",
    "livingSpace",
    "plotArea",
    "numberOfRooms",
    "energyPerformanceCertificate",
    "courtage",
    "buildingType",
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
    "builtInKitchen"
})
public class HouseRent
    extends RealEstate
    implements Cloneable, CopyTo, Equals, ToString
{

    protected Price price;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal livingSpace;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal plotArea;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter20 .class)
    protected BigDecimal numberOfRooms;
    protected Boolean energyPerformanceCertificate;
    @XmlElement(required = true)
    protected CourtageInfo courtage;
    @XmlElement(required = true, defaultValue = "NO_INFORMATION")
    @XmlSchemaType(name = "string")
    protected BuildingType buildingType;
    protected EnergyPerformanceCertificate energyCertificate;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType cellar;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType handicappedAccessible;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter10 .class)
    protected Integer numberOfParkingSpaces;
    @XmlSchemaType(name = "string")
    protected RealEstateCondition condition;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter11 .class)
    protected Integer lastRefurbishment;
    @XmlSchemaType(name = "string")
    protected InteriorQuality interiorQuality;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    protected Integer constructionYear;
    protected Boolean constructionYearUnknown;
    @XmlJavaTypeAdapter(Adapter13 .class)
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
    @XmlJavaTypeAdapter(Adapter14 .class)
    protected BigDecimal thermalCharacteristic;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType energyConsumptionContainsWarmWater;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter15 .class)
    protected Integer numberOfFloors;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal usableFloorSpace;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter16 .class)
    protected Integer numberOfBedRooms;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter17 .class)
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
    protected Boolean builtInKitchen;

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
     * Gets the value of the plotArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getPlotArea() {
        return plotArea;
    }

    /**
     * Sets the value of the plotArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlotArea(BigDecimal value) {
        this.plotArea = value;
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
     * Gets the value of the buildingType property.
     * 
     * @return
     *     possible object is
     *     {@link BuildingType }
     *     
     */
    public BuildingType getBuildingType() {
        return buildingType;
    }

    /**
     * Sets the value of the buildingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildingType }
     *     
     */
    public void setBuildingType(BuildingType value) {
        this.buildingType = value;
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
            BigDecimal thePlotArea;
            thePlotArea = this.getPlotArea();
            strategy.appendField(locator, this, "plotArea", buffer, thePlotArea);
        }
        {
            BigDecimal theNumberOfRooms;
            theNumberOfRooms = this.getNumberOfRooms();
            strategy.appendField(locator, this, "numberOfRooms", buffer, theNumberOfRooms);
        }
        {
            Boolean theEnergyPerformanceCertificate;
            theEnergyPerformanceCertificate = this.isEnergyPerformanceCertificate();
            strategy.appendField(locator, this, "energyPerformanceCertificate", buffer, theEnergyPerformanceCertificate);
        }
        {
            CourtageInfo theCourtage;
            theCourtage = this.getCourtage();
            strategy.appendField(locator, this, "courtage", buffer, theCourtage);
        }
        {
            BuildingType theBuildingType;
            theBuildingType = this.getBuildingType();
            strategy.appendField(locator, this, "buildingType", buffer, theBuildingType);
        }
        {
            EnergyPerformanceCertificate theEnergyCertificate;
            theEnergyCertificate = this.getEnergyCertificate();
            strategy.appendField(locator, this, "energyCertificate", buffer, theEnergyCertificate);
        }
        {
            YesNotApplicableType theCellar;
            theCellar = this.getCellar();
            strategy.appendField(locator, this, "cellar", buffer, theCellar);
        }
        {
            YesNotApplicableType theHandicappedAccessible;
            theHandicappedAccessible = this.getHandicappedAccessible();
            strategy.appendField(locator, this, "handicappedAccessible", buffer, theHandicappedAccessible);
        }
        {
            Integer theNumberOfParkingSpaces;
            theNumberOfParkingSpaces = this.getNumberOfParkingSpaces();
            strategy.appendField(locator, this, "numberOfParkingSpaces", buffer, theNumberOfParkingSpaces);
        }
        {
            RealEstateCondition theCondition;
            theCondition = this.getCondition();
            strategy.appendField(locator, this, "condition", buffer, theCondition);
        }
        {
            Integer theLastRefurbishment;
            theLastRefurbishment = this.getLastRefurbishment();
            strategy.appendField(locator, this, "lastRefurbishment", buffer, theLastRefurbishment);
        }
        {
            InteriorQuality theInteriorQuality;
            theInteriorQuality = this.getInteriorQuality();
            strategy.appendField(locator, this, "interiorQuality", buffer, theInteriorQuality);
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
            String theFreeFrom;
            theFreeFrom = this.getFreeFrom();
            strategy.appendField(locator, this, "freeFrom", buffer, theFreeFrom);
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
            Integer theNumberOfFloors;
            theNumberOfFloors = this.getNumberOfFloors();
            strategy.appendField(locator, this, "numberOfFloors", buffer, theNumberOfFloors);
        }
        {
            BigDecimal theUsableFloorSpace;
            theUsableFloorSpace = this.getUsableFloorSpace();
            strategy.appendField(locator, this, "usableFloorSpace", buffer, theUsableFloorSpace);
        }
        {
            Integer theNumberOfBedRooms;
            theNumberOfBedRooms = this.getNumberOfBedRooms();
            strategy.appendField(locator, this, "numberOfBedRooms", buffer, theNumberOfBedRooms);
        }
        {
            Integer theNumberOfBathRooms;
            theNumberOfBathRooms = this.getNumberOfBathRooms();
            strategy.appendField(locator, this, "numberOfBathRooms", buffer, theNumberOfBathRooms);
        }
        {
            YesNotApplicableType theGuestToilet;
            theGuestToilet = this.getGuestToilet();
            strategy.appendField(locator, this, "guestToilet", buffer, theGuestToilet);
        }
        {
            ParkingSpaceType theParkingSpaceType;
            theParkingSpaceType = this.getParkingSpaceType();
            strategy.appendField(locator, this, "parkingSpaceType", buffer, theParkingSpaceType);
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
            PetsAllowedType thePetsAllowed;
            thePetsAllowed = this.getPetsAllowed();
            strategy.appendField(locator, this, "petsAllowed", buffer, thePetsAllowed);
        }
        {
            BigDecimal theParkingSpacePrice;
            theParkingSpacePrice = this.getParkingSpacePrice();
            strategy.appendField(locator, this, "parkingSpacePrice", buffer, theParkingSpacePrice);
        }
        {
            YesNotApplicableType theUseAsFlatshareRoom;
            theUseAsFlatshareRoom = this.getUseAsFlatshareRoom();
            strategy.appendField(locator, this, "useAsFlatshareRoom", buffer, theUseAsFlatshareRoom);
        }
        {
            Boolean theBuiltInKitchen;
            theBuiltInKitchen = this.isBuiltInKitchen();
            strategy.appendField(locator, this, "builtInKitchen", buffer, theBuiltInKitchen);
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
        if (draftCopy instanceof HouseRent) {
            final HouseRent copy = ((HouseRent) draftCopy);
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
            if (this.plotArea!= null) {
                BigDecimal sourcePlotArea;
                sourcePlotArea = this.getPlotArea();
                BigDecimal copyPlotArea = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "plotArea", sourcePlotArea), sourcePlotArea));
                copy.setPlotArea(copyPlotArea);
            } else {
                copy.plotArea = null;
            }
            if (this.numberOfRooms!= null) {
                BigDecimal sourceNumberOfRooms;
                sourceNumberOfRooms = this.getNumberOfRooms();
                BigDecimal copyNumberOfRooms = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "numberOfRooms", sourceNumberOfRooms), sourceNumberOfRooms));
                copy.setNumberOfRooms(copyNumberOfRooms);
            } else {
                copy.numberOfRooms = null;
            }
            if (this.energyPerformanceCertificate!= null) {
                Boolean sourceEnergyPerformanceCertificate;
                sourceEnergyPerformanceCertificate = this.isEnergyPerformanceCertificate();
                Boolean copyEnergyPerformanceCertificate = ((Boolean) strategy.copy(LocatorUtils.property(locator, "energyPerformanceCertificate", sourceEnergyPerformanceCertificate), sourceEnergyPerformanceCertificate));
                copy.setEnergyPerformanceCertificate(copyEnergyPerformanceCertificate);
            } else {
                copy.energyPerformanceCertificate = null;
            }
            if (this.courtage!= null) {
                CourtageInfo sourceCourtage;
                sourceCourtage = this.getCourtage();
                CourtageInfo copyCourtage = ((CourtageInfo) strategy.copy(LocatorUtils.property(locator, "courtage", sourceCourtage), sourceCourtage));
                copy.setCourtage(copyCourtage);
            } else {
                copy.courtage = null;
            }
            if (this.buildingType!= null) {
                BuildingType sourceBuildingType;
                sourceBuildingType = this.getBuildingType();
                BuildingType copyBuildingType = ((BuildingType) strategy.copy(LocatorUtils.property(locator, "buildingType", sourceBuildingType), sourceBuildingType));
                copy.setBuildingType(copyBuildingType);
            } else {
                copy.buildingType = null;
            }
            if (this.energyCertificate!= null) {
                EnergyPerformanceCertificate sourceEnergyCertificate;
                sourceEnergyCertificate = this.getEnergyCertificate();
                EnergyPerformanceCertificate copyEnergyCertificate = ((EnergyPerformanceCertificate) strategy.copy(LocatorUtils.property(locator, "energyCertificate", sourceEnergyCertificate), sourceEnergyCertificate));
                copy.setEnergyCertificate(copyEnergyCertificate);
            } else {
                copy.energyCertificate = null;
            }
            if (this.cellar!= null) {
                YesNotApplicableType sourceCellar;
                sourceCellar = this.getCellar();
                YesNotApplicableType copyCellar = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "cellar", sourceCellar), sourceCellar));
                copy.setCellar(copyCellar);
            } else {
                copy.cellar = null;
            }
            if (this.handicappedAccessible!= null) {
                YesNotApplicableType sourceHandicappedAccessible;
                sourceHandicappedAccessible = this.getHandicappedAccessible();
                YesNotApplicableType copyHandicappedAccessible = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "handicappedAccessible", sourceHandicappedAccessible), sourceHandicappedAccessible));
                copy.setHandicappedAccessible(copyHandicappedAccessible);
            } else {
                copy.handicappedAccessible = null;
            }
            if (this.numberOfParkingSpaces!= null) {
                Integer sourceNumberOfParkingSpaces;
                sourceNumberOfParkingSpaces = this.getNumberOfParkingSpaces();
                Integer copyNumberOfParkingSpaces = ((Integer) strategy.copy(LocatorUtils.property(locator, "numberOfParkingSpaces", sourceNumberOfParkingSpaces), sourceNumberOfParkingSpaces));
                copy.setNumberOfParkingSpaces(copyNumberOfParkingSpaces);
            } else {
                copy.numberOfParkingSpaces = null;
            }
            if (this.condition!= null) {
                RealEstateCondition sourceCondition;
                sourceCondition = this.getCondition();
                RealEstateCondition copyCondition = ((RealEstateCondition) strategy.copy(LocatorUtils.property(locator, "condition", sourceCondition), sourceCondition));
                copy.setCondition(copyCondition);
            } else {
                copy.condition = null;
            }
            if (this.lastRefurbishment!= null) {
                Integer sourceLastRefurbishment;
                sourceLastRefurbishment = this.getLastRefurbishment();
                Integer copyLastRefurbishment = ((Integer) strategy.copy(LocatorUtils.property(locator, "lastRefurbishment", sourceLastRefurbishment), sourceLastRefurbishment));
                copy.setLastRefurbishment(copyLastRefurbishment);
            } else {
                copy.lastRefurbishment = null;
            }
            if (this.interiorQuality!= null) {
                InteriorQuality sourceInteriorQuality;
                sourceInteriorQuality = this.getInteriorQuality();
                InteriorQuality copyInteriorQuality = ((InteriorQuality) strategy.copy(LocatorUtils.property(locator, "interiorQuality", sourceInteriorQuality), sourceInteriorQuality));
                copy.setInteriorQuality(copyInteriorQuality);
            } else {
                copy.interiorQuality = null;
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
            if (this.freeFrom!= null) {
                String sourceFreeFrom;
                sourceFreeFrom = this.getFreeFrom();
                String copyFreeFrom = ((String) strategy.copy(LocatorUtils.property(locator, "freeFrom", sourceFreeFrom), sourceFreeFrom));
                copy.setFreeFrom(copyFreeFrom);
            } else {
                copy.freeFrom = null;
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
            if (this.numberOfFloors!= null) {
                Integer sourceNumberOfFloors;
                sourceNumberOfFloors = this.getNumberOfFloors();
                Integer copyNumberOfFloors = ((Integer) strategy.copy(LocatorUtils.property(locator, "numberOfFloors", sourceNumberOfFloors), sourceNumberOfFloors));
                copy.setNumberOfFloors(copyNumberOfFloors);
            } else {
                copy.numberOfFloors = null;
            }
            if (this.usableFloorSpace!= null) {
                BigDecimal sourceUsableFloorSpace;
                sourceUsableFloorSpace = this.getUsableFloorSpace();
                BigDecimal copyUsableFloorSpace = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "usableFloorSpace", sourceUsableFloorSpace), sourceUsableFloorSpace));
                copy.setUsableFloorSpace(copyUsableFloorSpace);
            } else {
                copy.usableFloorSpace = null;
            }
            if (this.numberOfBedRooms!= null) {
                Integer sourceNumberOfBedRooms;
                sourceNumberOfBedRooms = this.getNumberOfBedRooms();
                Integer copyNumberOfBedRooms = ((Integer) strategy.copy(LocatorUtils.property(locator, "numberOfBedRooms", sourceNumberOfBedRooms), sourceNumberOfBedRooms));
                copy.setNumberOfBedRooms(copyNumberOfBedRooms);
            } else {
                copy.numberOfBedRooms = null;
            }
            if (this.numberOfBathRooms!= null) {
                Integer sourceNumberOfBathRooms;
                sourceNumberOfBathRooms = this.getNumberOfBathRooms();
                Integer copyNumberOfBathRooms = ((Integer) strategy.copy(LocatorUtils.property(locator, "numberOfBathRooms", sourceNumberOfBathRooms), sourceNumberOfBathRooms));
                copy.setNumberOfBathRooms(copyNumberOfBathRooms);
            } else {
                copy.numberOfBathRooms = null;
            }
            if (this.guestToilet!= null) {
                YesNotApplicableType sourceGuestToilet;
                sourceGuestToilet = this.getGuestToilet();
                YesNotApplicableType copyGuestToilet = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "guestToilet", sourceGuestToilet), sourceGuestToilet));
                copy.setGuestToilet(copyGuestToilet);
            } else {
                copy.guestToilet = null;
            }
            if (this.parkingSpaceType!= null) {
                ParkingSpaceType sourceParkingSpaceType;
                sourceParkingSpaceType = this.getParkingSpaceType();
                ParkingSpaceType copyParkingSpaceType = ((ParkingSpaceType) strategy.copy(LocatorUtils.property(locator, "parkingSpaceType", sourceParkingSpaceType), sourceParkingSpaceType));
                copy.setParkingSpaceType(copyParkingSpaceType);
            } else {
                copy.parkingSpaceType = null;
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
            if (this.petsAllowed!= null) {
                PetsAllowedType sourcePetsAllowed;
                sourcePetsAllowed = this.getPetsAllowed();
                PetsAllowedType copyPetsAllowed = ((PetsAllowedType) strategy.copy(LocatorUtils.property(locator, "petsAllowed", sourcePetsAllowed), sourcePetsAllowed));
                copy.setPetsAllowed(copyPetsAllowed);
            } else {
                copy.petsAllowed = null;
            }
            if (this.parkingSpacePrice!= null) {
                BigDecimal sourceParkingSpacePrice;
                sourceParkingSpacePrice = this.getParkingSpacePrice();
                BigDecimal copyParkingSpacePrice = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "parkingSpacePrice", sourceParkingSpacePrice), sourceParkingSpacePrice));
                copy.setParkingSpacePrice(copyParkingSpacePrice);
            } else {
                copy.parkingSpacePrice = null;
            }
            if (this.useAsFlatshareRoom!= null) {
                YesNotApplicableType sourceUseAsFlatshareRoom;
                sourceUseAsFlatshareRoom = this.getUseAsFlatshareRoom();
                YesNotApplicableType copyUseAsFlatshareRoom = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "useAsFlatshareRoom", sourceUseAsFlatshareRoom), sourceUseAsFlatshareRoom));
                copy.setUseAsFlatshareRoom(copyUseAsFlatshareRoom);
            } else {
                copy.useAsFlatshareRoom = null;
            }
            if (this.builtInKitchen!= null) {
                Boolean sourceBuiltInKitchen;
                sourceBuiltInKitchen = this.isBuiltInKitchen();
                Boolean copyBuiltInKitchen = ((Boolean) strategy.copy(LocatorUtils.property(locator, "builtInKitchen", sourceBuiltInKitchen), sourceBuiltInKitchen));
                copy.setBuiltInKitchen(copyBuiltInKitchen);
            } else {
                copy.builtInKitchen = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new HouseRent();
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
        final HouseRent that = ((HouseRent) object);
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
            BigDecimal lhsPlotArea;
            lhsPlotArea = this.getPlotArea();
            BigDecimal rhsPlotArea;
            rhsPlotArea = that.getPlotArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "plotArea", lhsPlotArea), LocatorUtils.property(thatLocator, "plotArea", rhsPlotArea), lhsPlotArea, rhsPlotArea)) {
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
            Boolean lhsEnergyPerformanceCertificate;
            lhsEnergyPerformanceCertificate = this.isEnergyPerformanceCertificate();
            Boolean rhsEnergyPerformanceCertificate;
            rhsEnergyPerformanceCertificate = that.isEnergyPerformanceCertificate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyPerformanceCertificate", lhsEnergyPerformanceCertificate), LocatorUtils.property(thatLocator, "energyPerformanceCertificate", rhsEnergyPerformanceCertificate), lhsEnergyPerformanceCertificate, rhsEnergyPerformanceCertificate)) {
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
            BuildingType lhsBuildingType;
            lhsBuildingType = this.getBuildingType();
            BuildingType rhsBuildingType;
            rhsBuildingType = that.getBuildingType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buildingType", lhsBuildingType), LocatorUtils.property(thatLocator, "buildingType", rhsBuildingType), lhsBuildingType, rhsBuildingType)) {
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
            YesNotApplicableType lhsCellar;
            lhsCellar = this.getCellar();
            YesNotApplicableType rhsCellar;
            rhsCellar = that.getCellar();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cellar", lhsCellar), LocatorUtils.property(thatLocator, "cellar", rhsCellar), lhsCellar, rhsCellar)) {
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
            Integer lhsNumberOfParkingSpaces;
            lhsNumberOfParkingSpaces = this.getNumberOfParkingSpaces();
            Integer rhsNumberOfParkingSpaces;
            rhsNumberOfParkingSpaces = that.getNumberOfParkingSpaces();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfParkingSpaces", lhsNumberOfParkingSpaces), LocatorUtils.property(thatLocator, "numberOfParkingSpaces", rhsNumberOfParkingSpaces), lhsNumberOfParkingSpaces, rhsNumberOfParkingSpaces)) {
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
            Integer lhsLastRefurbishment;
            lhsLastRefurbishment = this.getLastRefurbishment();
            Integer rhsLastRefurbishment;
            rhsLastRefurbishment = that.getLastRefurbishment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastRefurbishment", lhsLastRefurbishment), LocatorUtils.property(thatLocator, "lastRefurbishment", rhsLastRefurbishment), lhsLastRefurbishment, rhsLastRefurbishment)) {
                return false;
            }
        }
        {
            InteriorQuality lhsInteriorQuality;
            lhsInteriorQuality = this.getInteriorQuality();
            InteriorQuality rhsInteriorQuality;
            rhsInteriorQuality = that.getInteriorQuality();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "interiorQuality", lhsInteriorQuality), LocatorUtils.property(thatLocator, "interiorQuality", rhsInteriorQuality), lhsInteriorQuality, rhsInteriorQuality)) {
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
            String lhsFreeFrom;
            lhsFreeFrom = this.getFreeFrom();
            String rhsFreeFrom;
            rhsFreeFrom = that.getFreeFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freeFrom", lhsFreeFrom), LocatorUtils.property(thatLocator, "freeFrom", rhsFreeFrom), lhsFreeFrom, rhsFreeFrom)) {
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
            Integer lhsNumberOfFloors;
            lhsNumberOfFloors = this.getNumberOfFloors();
            Integer rhsNumberOfFloors;
            rhsNumberOfFloors = that.getNumberOfFloors();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfFloors", lhsNumberOfFloors), LocatorUtils.property(thatLocator, "numberOfFloors", rhsNumberOfFloors), lhsNumberOfFloors, rhsNumberOfFloors)) {
                return false;
            }
        }
        {
            BigDecimal lhsUsableFloorSpace;
            lhsUsableFloorSpace = this.getUsableFloorSpace();
            BigDecimal rhsUsableFloorSpace;
            rhsUsableFloorSpace = that.getUsableFloorSpace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usableFloorSpace", lhsUsableFloorSpace), LocatorUtils.property(thatLocator, "usableFloorSpace", rhsUsableFloorSpace), lhsUsableFloorSpace, rhsUsableFloorSpace)) {
                return false;
            }
        }
        {
            Integer lhsNumberOfBedRooms;
            lhsNumberOfBedRooms = this.getNumberOfBedRooms();
            Integer rhsNumberOfBedRooms;
            rhsNumberOfBedRooms = that.getNumberOfBedRooms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfBedRooms", lhsNumberOfBedRooms), LocatorUtils.property(thatLocator, "numberOfBedRooms", rhsNumberOfBedRooms), lhsNumberOfBedRooms, rhsNumberOfBedRooms)) {
                return false;
            }
        }
        {
            Integer lhsNumberOfBathRooms;
            lhsNumberOfBathRooms = this.getNumberOfBathRooms();
            Integer rhsNumberOfBathRooms;
            rhsNumberOfBathRooms = that.getNumberOfBathRooms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfBathRooms", lhsNumberOfBathRooms), LocatorUtils.property(thatLocator, "numberOfBathRooms", rhsNumberOfBathRooms), lhsNumberOfBathRooms, rhsNumberOfBathRooms)) {
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
            ParkingSpaceType lhsParkingSpaceType;
            lhsParkingSpaceType = this.getParkingSpaceType();
            ParkingSpaceType rhsParkingSpaceType;
            rhsParkingSpaceType = that.getParkingSpaceType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parkingSpaceType", lhsParkingSpaceType), LocatorUtils.property(thatLocator, "parkingSpaceType", rhsParkingSpaceType), lhsParkingSpaceType, rhsParkingSpaceType)) {
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
            PetsAllowedType lhsPetsAllowed;
            lhsPetsAllowed = this.getPetsAllowed();
            PetsAllowedType rhsPetsAllowed;
            rhsPetsAllowed = that.getPetsAllowed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "petsAllowed", lhsPetsAllowed), LocatorUtils.property(thatLocator, "petsAllowed", rhsPetsAllowed), lhsPetsAllowed, rhsPetsAllowed)) {
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
            YesNotApplicableType lhsUseAsFlatshareRoom;
            lhsUseAsFlatshareRoom = this.getUseAsFlatshareRoom();
            YesNotApplicableType rhsUseAsFlatshareRoom;
            rhsUseAsFlatshareRoom = that.getUseAsFlatshareRoom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useAsFlatshareRoom", lhsUseAsFlatshareRoom), LocatorUtils.property(thatLocator, "useAsFlatshareRoom", rhsUseAsFlatshareRoom), lhsUseAsFlatshareRoom, rhsUseAsFlatshareRoom)) {
                return false;
            }
        }
        {
            Boolean lhsBuiltInKitchen;
            lhsBuiltInKitchen = this.isBuiltInKitchen();
            Boolean rhsBuiltInKitchen;
            rhsBuiltInKitchen = that.isBuiltInKitchen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "builtInKitchen", lhsBuiltInKitchen), LocatorUtils.property(thatLocator, "builtInKitchen", rhsBuiltInKitchen), lhsBuiltInKitchen, rhsBuiltInKitchen)) {
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
