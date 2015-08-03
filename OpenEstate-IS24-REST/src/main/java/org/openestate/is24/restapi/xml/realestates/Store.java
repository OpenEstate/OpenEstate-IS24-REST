
package org.openestate.is24.restapi.xml.realestates;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
import org.openestate.is24.restapi.xml.common.BuildingEnergyRatingType;
import org.openestate.is24.restapi.xml.common.CommercializationType;
import org.openestate.is24.restapi.xml.common.CourtageInfo;
import org.openestate.is24.restapi.xml.common.EnergyPerformanceCertificate;
import org.openestate.is24.restapi.xml.common.EnergySourcesEnev2014;
import org.openestate.is24.restapi.xml.common.FiringTypes;
import org.openestate.is24.restapi.xml.common.FlooringType;
import org.openestate.is24.restapi.xml.common.HeatingType;
import org.openestate.is24.restapi.xml.common.HeatingTypeEnev2014;
import org.openestate.is24.restapi.xml.common.InteriorQuality;
import org.openestate.is24.restapi.xml.common.LocationClassificationType;
import org.openestate.is24.restapi.xml.common.Price;
import org.openestate.is24.restapi.xml.common.RealEstateCondition;
import org.openestate.is24.restapi.xml.common.StoreType;
import org.openestate.is24.restapi.xml.common.SupplyType;
import org.openestate.is24.restapi.xml.common.YesNotApplicableType;


/**
 * Eigenschaften f\u00fcr den Immobilientyp "Einzelhandel"
 * 
 * <p>Java class for Store complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Store"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/realestates/1.0}RealEstate"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}ExtendedStoreGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Store", propOrder = {
    "storeType",
    "locationClassificationType",
    "areaDivisibleFrom",
    "shopWindowLength",
    "listed",
    "lift",
    "goodsLift",
    "goodsLiftLoad",
    "floorLoad",
    "ramp",
    "cellar",
    "supplyType",
    "flooringType",
    "deposit",
    "energyCertificate",
    "commercializationType",
    "price",
    "calculatedPrice",
    "totalFloorSpace",
    "netFloorSpace",
    "minDivisible",
    "courtage",
    "distanceToMRS",
    "distanceToFM",
    "distanceToPT",
    "distanceToAirport",
    "condition",
    "numberOfParkingSpaces",
    "parkingSpacePrice",
    "lastRefurbishment",
    "interiorQuality",
    "constructionYear",
    "constructionYearUnknown",
    "freeFrom",
    "heatingType",
    "heatingTypeEnev2014",
    "firingTypes",
    "energySourcesEnev2014",
    "thermalCharacteristic",
    "energyConsumptionContainsWarmWater",
    "buildingEnergyRatingType",
    "additionalArea",
    "numberOfFloors",
    "additionalCosts"
})
public class Store
    extends RealEstate
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlSchemaType(name = "string")
    protected StoreType storeType;
    @XmlSchemaType(name = "string")
    protected LocationClassificationType locationClassificationType;
    @Deprecated
    protected Double areaDivisibleFrom;
    protected Double shopWindowLength;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType listed;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType lift;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType goodsLift;
    protected Double goodsLiftLoad;
    protected Double floorLoad;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType ramp;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType cellar;
    @XmlSchemaType(name = "string")
    protected SupplyType supplyType;
    @XmlSchemaType(name = "string")
    protected FlooringType flooringType;
    protected String deposit;
    protected EnergyPerformanceCertificate energyCertificate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CommercializationType commercializationType;
    @XmlElement(required = true)
    protected Price price;
    protected Price calculatedPrice;
    protected Double totalFloorSpace;
    protected Double netFloorSpace;
    protected Double minDivisible;
    @XmlElement(required = true)
    protected CourtageInfo courtage;
    protected Integer distanceToMRS;
    protected Integer distanceToFM;
    protected Integer distanceToPT;
    protected Integer distanceToAirport;
    @XmlSchemaType(name = "string")
    protected RealEstateCondition condition;
    protected Integer numberOfParkingSpaces;
    protected Double parkingSpacePrice;
    protected Integer lastRefurbishment;
    @XmlSchemaType(name = "string")
    protected InteriorQuality interiorQuality;
    protected Integer constructionYear;
    protected Boolean constructionYearUnknown;
    protected String freeFrom;
    @XmlSchemaType(name = "string")
    @Deprecated
    protected HeatingType heatingType;
    @XmlSchemaType(name = "string")
    protected HeatingTypeEnev2014 heatingTypeEnev2014;
    @Deprecated
    protected FiringTypes firingTypes;
    protected EnergySourcesEnev2014 energySourcesEnev2014;
    protected Double thermalCharacteristic;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType energyConsumptionContainsWarmWater;
    @XmlSchemaType(name = "string")
    protected BuildingEnergyRatingType buildingEnergyRatingType;
    protected Double additionalArea;
    protected String numberOfFloors;
    protected Price additionalCosts;

    /**
     * Gets the value of the storeType property.
     * 
     * @return
     *     possible object is
     *     {@link StoreType }
     *     
     */
    public StoreType getStoreType() {
        return storeType;
    }

    /**
     * Sets the value of the storeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreType }
     *     
     */
    public void setStoreType(StoreType value) {
        this.storeType = value;
    }

    /**
     * Gets the value of the locationClassificationType property.
     * 
     * @return
     *     possible object is
     *     {@link LocationClassificationType }
     *     
     */
    public LocationClassificationType getLocationClassificationType() {
        return locationClassificationType;
    }

    /**
     * Sets the value of the locationClassificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationClassificationType }
     *     
     */
    public void setLocationClassificationType(LocationClassificationType value) {
        this.locationClassificationType = value;
    }

    /**
     * Gets the value of the areaDivisibleFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    @Deprecated
    public Double getAreaDivisibleFrom() {
        return areaDivisibleFrom;
    }

    /**
     * Sets the value of the areaDivisibleFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    @Deprecated
    public void setAreaDivisibleFrom(Double value) {
        this.areaDivisibleFrom = value;
    }

    /**
     * Gets the value of the shopWindowLength property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShopWindowLength() {
        return shopWindowLength;
    }

    /**
     * Sets the value of the shopWindowLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShopWindowLength(Double value) {
        this.shopWindowLength = value;
    }

    /**
     * Gets the value of the listed property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getListed() {
        return listed;
    }

    /**
     * Sets the value of the listed property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setListed(YesNotApplicableType value) {
        this.listed = value;
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
     * Gets the value of the goodsLift property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getGoodsLift() {
        return goodsLift;
    }

    /**
     * Sets the value of the goodsLift property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setGoodsLift(YesNotApplicableType value) {
        this.goodsLift = value;
    }

    /**
     * Gets the value of the goodsLiftLoad property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGoodsLiftLoad() {
        return goodsLiftLoad;
    }

    /**
     * Sets the value of the goodsLiftLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGoodsLiftLoad(Double value) {
        this.goodsLiftLoad = value;
    }

    /**
     * Gets the value of the floorLoad property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFloorLoad() {
        return floorLoad;
    }

    /**
     * Sets the value of the floorLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFloorLoad(Double value) {
        this.floorLoad = value;
    }

    /**
     * Gets the value of the ramp property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getRamp() {
        return ramp;
    }

    /**
     * Sets the value of the ramp property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setRamp(YesNotApplicableType value) {
        this.ramp = value;
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
     * Gets the value of the supplyType property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyType }
     *     
     */
    public SupplyType getSupplyType() {
        return supplyType;
    }

    /**
     * Sets the value of the supplyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyType }
     *     
     */
    public void setSupplyType(SupplyType value) {
        this.supplyType = value;
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
     * Gets the value of the commercializationType property.
     * 
     * @return
     *     possible object is
     *     {@link CommercializationType }
     *     
     */
    public CommercializationType getCommercializationType() {
        return commercializationType;
    }

    /**
     * Sets the value of the commercializationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercializationType }
     *     
     */
    public void setCommercializationType(CommercializationType value) {
        this.commercializationType = value;
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
     * Gets the value of the calculatedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getCalculatedPrice() {
        return calculatedPrice;
    }

    /**
     * Sets the value of the calculatedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setCalculatedPrice(Price value) {
        this.calculatedPrice = value;
    }

    /**
     * Gets the value of the totalFloorSpace property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalFloorSpace() {
        return totalFloorSpace;
    }

    /**
     * Sets the value of the totalFloorSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalFloorSpace(Double value) {
        this.totalFloorSpace = value;
    }

    /**
     * Gets the value of the netFloorSpace property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNetFloorSpace() {
        return netFloorSpace;
    }

    /**
     * Sets the value of the netFloorSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNetFloorSpace(Double value) {
        this.netFloorSpace = value;
    }

    /**
     * Gets the value of the minDivisible property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinDivisible() {
        return minDivisible;
    }

    /**
     * Sets the value of the minDivisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinDivisible(Double value) {
        this.minDivisible = value;
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
     * Gets the value of the distanceToMRS property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistanceToMRS() {
        return distanceToMRS;
    }

    /**
     * Sets the value of the distanceToMRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistanceToMRS(Integer value) {
        this.distanceToMRS = value;
    }

    /**
     * Gets the value of the distanceToFM property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistanceToFM() {
        return distanceToFM;
    }

    /**
     * Sets the value of the distanceToFM property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistanceToFM(Integer value) {
        this.distanceToFM = value;
    }

    /**
     * Gets the value of the distanceToPT property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistanceToPT() {
        return distanceToPT;
    }

    /**
     * Sets the value of the distanceToPT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistanceToPT(Integer value) {
        this.distanceToPT = value;
    }

    /**
     * Gets the value of the distanceToAirport property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistanceToAirport() {
        return distanceToAirport;
    }

    /**
     * Sets the value of the distanceToAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistanceToAirport(Integer value) {
        this.distanceToAirport = value;
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
     * Gets the value of the numberOfParkingSpaces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
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
     *     {@link Integer }
     *     
     */
    public void setNumberOfParkingSpaces(Integer value) {
        this.numberOfParkingSpaces = value;
    }

    /**
     * Gets the value of the parkingSpacePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getParkingSpacePrice() {
        return parkingSpacePrice;
    }

    /**
     * Sets the value of the parkingSpacePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setParkingSpacePrice(Double value) {
        this.parkingSpacePrice = value;
    }

    /**
     * Gets the value of the lastRefurbishment property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
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
     *     {@link Integer }
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
     *     {@link Integer }
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
     *     {@link Integer }
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
     * Gets the value of the thermalCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getThermalCharacteristic() {
        return thermalCharacteristic;
    }

    /**
     * Sets the value of the thermalCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setThermalCharacteristic(Double value) {
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
     * Gets the value of the additionalArea property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdditionalArea() {
        return additionalArea;
    }

    /**
     * Sets the value of the additionalArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdditionalArea(Double value) {
        this.additionalArea = value;
    }

    /**
     * Gets the value of the numberOfFloors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfFloors() {
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
    public void setNumberOfFloors(String value) {
        this.numberOfFloors = value;
    }

    /**
     * Gets the value of the additionalCosts property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getAdditionalCosts() {
        return additionalCosts;
    }

    /**
     * Sets the value of the additionalCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setAdditionalCosts(Price value) {
        this.additionalCosts = value;
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
            StoreType theStoreType;
            theStoreType = this.getStoreType();
            strategy.appendField(locator, this, "storeType", buffer, theStoreType);
        }
        {
            LocationClassificationType theLocationClassificationType;
            theLocationClassificationType = this.getLocationClassificationType();
            strategy.appendField(locator, this, "locationClassificationType", buffer, theLocationClassificationType);
        }
        {
            Double theAreaDivisibleFrom;
            theAreaDivisibleFrom = this.getAreaDivisibleFrom();
            strategy.appendField(locator, this, "areaDivisibleFrom", buffer, theAreaDivisibleFrom);
        }
        {
            Double theShopWindowLength;
            theShopWindowLength = this.getShopWindowLength();
            strategy.appendField(locator, this, "shopWindowLength", buffer, theShopWindowLength);
        }
        {
            YesNotApplicableType theListed;
            theListed = this.getListed();
            strategy.appendField(locator, this, "listed", buffer, theListed);
        }
        {
            YesNotApplicableType theLift;
            theLift = this.getLift();
            strategy.appendField(locator, this, "lift", buffer, theLift);
        }
        {
            YesNotApplicableType theGoodsLift;
            theGoodsLift = this.getGoodsLift();
            strategy.appendField(locator, this, "goodsLift", buffer, theGoodsLift);
        }
        {
            Double theGoodsLiftLoad;
            theGoodsLiftLoad = this.getGoodsLiftLoad();
            strategy.appendField(locator, this, "goodsLiftLoad", buffer, theGoodsLiftLoad);
        }
        {
            Double theFloorLoad;
            theFloorLoad = this.getFloorLoad();
            strategy.appendField(locator, this, "floorLoad", buffer, theFloorLoad);
        }
        {
            YesNotApplicableType theRamp;
            theRamp = this.getRamp();
            strategy.appendField(locator, this, "ramp", buffer, theRamp);
        }
        {
            YesNotApplicableType theCellar;
            theCellar = this.getCellar();
            strategy.appendField(locator, this, "cellar", buffer, theCellar);
        }
        {
            SupplyType theSupplyType;
            theSupplyType = this.getSupplyType();
            strategy.appendField(locator, this, "supplyType", buffer, theSupplyType);
        }
        {
            FlooringType theFlooringType;
            theFlooringType = this.getFlooringType();
            strategy.appendField(locator, this, "flooringType", buffer, theFlooringType);
        }
        {
            String theDeposit;
            theDeposit = this.getDeposit();
            strategy.appendField(locator, this, "deposit", buffer, theDeposit);
        }
        {
            EnergyPerformanceCertificate theEnergyCertificate;
            theEnergyCertificate = this.getEnergyCertificate();
            strategy.appendField(locator, this, "energyCertificate", buffer, theEnergyCertificate);
        }
        {
            CommercializationType theCommercializationType;
            theCommercializationType = this.getCommercializationType();
            strategy.appendField(locator, this, "commercializationType", buffer, theCommercializationType);
        }
        {
            Price thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice);
        }
        {
            Price theCalculatedPrice;
            theCalculatedPrice = this.getCalculatedPrice();
            strategy.appendField(locator, this, "calculatedPrice", buffer, theCalculatedPrice);
        }
        {
            Double theTotalFloorSpace;
            theTotalFloorSpace = this.getTotalFloorSpace();
            strategy.appendField(locator, this, "totalFloorSpace", buffer, theTotalFloorSpace);
        }
        {
            Double theNetFloorSpace;
            theNetFloorSpace = this.getNetFloorSpace();
            strategy.appendField(locator, this, "netFloorSpace", buffer, theNetFloorSpace);
        }
        {
            Double theMinDivisible;
            theMinDivisible = this.getMinDivisible();
            strategy.appendField(locator, this, "minDivisible", buffer, theMinDivisible);
        }
        {
            CourtageInfo theCourtage;
            theCourtage = this.getCourtage();
            strategy.appendField(locator, this, "courtage", buffer, theCourtage);
        }
        {
            Integer theDistanceToMRS;
            theDistanceToMRS = this.getDistanceToMRS();
            strategy.appendField(locator, this, "distanceToMRS", buffer, theDistanceToMRS);
        }
        {
            Integer theDistanceToFM;
            theDistanceToFM = this.getDistanceToFM();
            strategy.appendField(locator, this, "distanceToFM", buffer, theDistanceToFM);
        }
        {
            Integer theDistanceToPT;
            theDistanceToPT = this.getDistanceToPT();
            strategy.appendField(locator, this, "distanceToPT", buffer, theDistanceToPT);
        }
        {
            Integer theDistanceToAirport;
            theDistanceToAirport = this.getDistanceToAirport();
            strategy.appendField(locator, this, "distanceToAirport", buffer, theDistanceToAirport);
        }
        {
            RealEstateCondition theCondition;
            theCondition = this.getCondition();
            strategy.appendField(locator, this, "condition", buffer, theCondition);
        }
        {
            Integer theNumberOfParkingSpaces;
            theNumberOfParkingSpaces = this.getNumberOfParkingSpaces();
            strategy.appendField(locator, this, "numberOfParkingSpaces", buffer, theNumberOfParkingSpaces);
        }
        {
            Double theParkingSpacePrice;
            theParkingSpacePrice = this.getParkingSpacePrice();
            strategy.appendField(locator, this, "parkingSpacePrice", buffer, theParkingSpacePrice);
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
            Double theThermalCharacteristic;
            theThermalCharacteristic = this.getThermalCharacteristic();
            strategy.appendField(locator, this, "thermalCharacteristic", buffer, theThermalCharacteristic);
        }
        {
            YesNotApplicableType theEnergyConsumptionContainsWarmWater;
            theEnergyConsumptionContainsWarmWater = this.getEnergyConsumptionContainsWarmWater();
            strategy.appendField(locator, this, "energyConsumptionContainsWarmWater", buffer, theEnergyConsumptionContainsWarmWater);
        }
        {
            BuildingEnergyRatingType theBuildingEnergyRatingType;
            theBuildingEnergyRatingType = this.getBuildingEnergyRatingType();
            strategy.appendField(locator, this, "buildingEnergyRatingType", buffer, theBuildingEnergyRatingType);
        }
        {
            Double theAdditionalArea;
            theAdditionalArea = this.getAdditionalArea();
            strategy.appendField(locator, this, "additionalArea", buffer, theAdditionalArea);
        }
        {
            String theNumberOfFloors;
            theNumberOfFloors = this.getNumberOfFloors();
            strategy.appendField(locator, this, "numberOfFloors", buffer, theNumberOfFloors);
        }
        {
            Price theAdditionalCosts;
            theAdditionalCosts = this.getAdditionalCosts();
            strategy.appendField(locator, this, "additionalCosts", buffer, theAdditionalCosts);
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
        if (draftCopy instanceof Store) {
            final Store copy = ((Store) draftCopy);
            if (this.storeType!= null) {
                StoreType sourceStoreType;
                sourceStoreType = this.getStoreType();
                StoreType copyStoreType = ((StoreType) strategy.copy(LocatorUtils.property(locator, "storeType", sourceStoreType), sourceStoreType));
                copy.setStoreType(copyStoreType);
            } else {
                copy.storeType = null;
            }
            if (this.locationClassificationType!= null) {
                LocationClassificationType sourceLocationClassificationType;
                sourceLocationClassificationType = this.getLocationClassificationType();
                LocationClassificationType copyLocationClassificationType = ((LocationClassificationType) strategy.copy(LocatorUtils.property(locator, "locationClassificationType", sourceLocationClassificationType), sourceLocationClassificationType));
                copy.setLocationClassificationType(copyLocationClassificationType);
            } else {
                copy.locationClassificationType = null;
            }
            if (this.areaDivisibleFrom!= null) {
                Double sourceAreaDivisibleFrom;
                sourceAreaDivisibleFrom = this.getAreaDivisibleFrom();
                Double copyAreaDivisibleFrom = ((Double) strategy.copy(LocatorUtils.property(locator, "areaDivisibleFrom", sourceAreaDivisibleFrom), sourceAreaDivisibleFrom));
                copy.setAreaDivisibleFrom(copyAreaDivisibleFrom);
            } else {
                copy.areaDivisibleFrom = null;
            }
            if (this.shopWindowLength!= null) {
                Double sourceShopWindowLength;
                sourceShopWindowLength = this.getShopWindowLength();
                Double copyShopWindowLength = ((Double) strategy.copy(LocatorUtils.property(locator, "shopWindowLength", sourceShopWindowLength), sourceShopWindowLength));
                copy.setShopWindowLength(copyShopWindowLength);
            } else {
                copy.shopWindowLength = null;
            }
            if (this.listed!= null) {
                YesNotApplicableType sourceListed;
                sourceListed = this.getListed();
                YesNotApplicableType copyListed = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "listed", sourceListed), sourceListed));
                copy.setListed(copyListed);
            } else {
                copy.listed = null;
            }
            if (this.lift!= null) {
                YesNotApplicableType sourceLift;
                sourceLift = this.getLift();
                YesNotApplicableType copyLift = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "lift", sourceLift), sourceLift));
                copy.setLift(copyLift);
            } else {
                copy.lift = null;
            }
            if (this.goodsLift!= null) {
                YesNotApplicableType sourceGoodsLift;
                sourceGoodsLift = this.getGoodsLift();
                YesNotApplicableType copyGoodsLift = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "goodsLift", sourceGoodsLift), sourceGoodsLift));
                copy.setGoodsLift(copyGoodsLift);
            } else {
                copy.goodsLift = null;
            }
            if (this.goodsLiftLoad!= null) {
                Double sourceGoodsLiftLoad;
                sourceGoodsLiftLoad = this.getGoodsLiftLoad();
                Double copyGoodsLiftLoad = ((Double) strategy.copy(LocatorUtils.property(locator, "goodsLiftLoad", sourceGoodsLiftLoad), sourceGoodsLiftLoad));
                copy.setGoodsLiftLoad(copyGoodsLiftLoad);
            } else {
                copy.goodsLiftLoad = null;
            }
            if (this.floorLoad!= null) {
                Double sourceFloorLoad;
                sourceFloorLoad = this.getFloorLoad();
                Double copyFloorLoad = ((Double) strategy.copy(LocatorUtils.property(locator, "floorLoad", sourceFloorLoad), sourceFloorLoad));
                copy.setFloorLoad(copyFloorLoad);
            } else {
                copy.floorLoad = null;
            }
            if (this.ramp!= null) {
                YesNotApplicableType sourceRamp;
                sourceRamp = this.getRamp();
                YesNotApplicableType copyRamp = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "ramp", sourceRamp), sourceRamp));
                copy.setRamp(copyRamp);
            } else {
                copy.ramp = null;
            }
            if (this.cellar!= null) {
                YesNotApplicableType sourceCellar;
                sourceCellar = this.getCellar();
                YesNotApplicableType copyCellar = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "cellar", sourceCellar), sourceCellar));
                copy.setCellar(copyCellar);
            } else {
                copy.cellar = null;
            }
            if (this.supplyType!= null) {
                SupplyType sourceSupplyType;
                sourceSupplyType = this.getSupplyType();
                SupplyType copySupplyType = ((SupplyType) strategy.copy(LocatorUtils.property(locator, "supplyType", sourceSupplyType), sourceSupplyType));
                copy.setSupplyType(copySupplyType);
            } else {
                copy.supplyType = null;
            }
            if (this.flooringType!= null) {
                FlooringType sourceFlooringType;
                sourceFlooringType = this.getFlooringType();
                FlooringType copyFlooringType = ((FlooringType) strategy.copy(LocatorUtils.property(locator, "flooringType", sourceFlooringType), sourceFlooringType));
                copy.setFlooringType(copyFlooringType);
            } else {
                copy.flooringType = null;
            }
            if (this.deposit!= null) {
                String sourceDeposit;
                sourceDeposit = this.getDeposit();
                String copyDeposit = ((String) strategy.copy(LocatorUtils.property(locator, "deposit", sourceDeposit), sourceDeposit));
                copy.setDeposit(copyDeposit);
            } else {
                copy.deposit = null;
            }
            if (this.energyCertificate!= null) {
                EnergyPerformanceCertificate sourceEnergyCertificate;
                sourceEnergyCertificate = this.getEnergyCertificate();
                EnergyPerformanceCertificate copyEnergyCertificate = ((EnergyPerformanceCertificate) strategy.copy(LocatorUtils.property(locator, "energyCertificate", sourceEnergyCertificate), sourceEnergyCertificate));
                copy.setEnergyCertificate(copyEnergyCertificate);
            } else {
                copy.energyCertificate = null;
            }
            if (this.commercializationType!= null) {
                CommercializationType sourceCommercializationType;
                sourceCommercializationType = this.getCommercializationType();
                CommercializationType copyCommercializationType = ((CommercializationType) strategy.copy(LocatorUtils.property(locator, "commercializationType", sourceCommercializationType), sourceCommercializationType));
                copy.setCommercializationType(copyCommercializationType);
            } else {
                copy.commercializationType = null;
            }
            if (this.price!= null) {
                Price sourcePrice;
                sourcePrice = this.getPrice();
                Price copyPrice = ((Price) strategy.copy(LocatorUtils.property(locator, "price", sourcePrice), sourcePrice));
                copy.setPrice(copyPrice);
            } else {
                copy.price = null;
            }
            if (this.calculatedPrice!= null) {
                Price sourceCalculatedPrice;
                sourceCalculatedPrice = this.getCalculatedPrice();
                Price copyCalculatedPrice = ((Price) strategy.copy(LocatorUtils.property(locator, "calculatedPrice", sourceCalculatedPrice), sourceCalculatedPrice));
                copy.setCalculatedPrice(copyCalculatedPrice);
            } else {
                copy.calculatedPrice = null;
            }
            if (this.totalFloorSpace!= null) {
                Double sourceTotalFloorSpace;
                sourceTotalFloorSpace = this.getTotalFloorSpace();
                Double copyTotalFloorSpace = ((Double) strategy.copy(LocatorUtils.property(locator, "totalFloorSpace", sourceTotalFloorSpace), sourceTotalFloorSpace));
                copy.setTotalFloorSpace(copyTotalFloorSpace);
            } else {
                copy.totalFloorSpace = null;
            }
            if (this.netFloorSpace!= null) {
                Double sourceNetFloorSpace;
                sourceNetFloorSpace = this.getNetFloorSpace();
                Double copyNetFloorSpace = ((Double) strategy.copy(LocatorUtils.property(locator, "netFloorSpace", sourceNetFloorSpace), sourceNetFloorSpace));
                copy.setNetFloorSpace(copyNetFloorSpace);
            } else {
                copy.netFloorSpace = null;
            }
            if (this.minDivisible!= null) {
                Double sourceMinDivisible;
                sourceMinDivisible = this.getMinDivisible();
                Double copyMinDivisible = ((Double) strategy.copy(LocatorUtils.property(locator, "minDivisible", sourceMinDivisible), sourceMinDivisible));
                copy.setMinDivisible(copyMinDivisible);
            } else {
                copy.minDivisible = null;
            }
            if (this.courtage!= null) {
                CourtageInfo sourceCourtage;
                sourceCourtage = this.getCourtage();
                CourtageInfo copyCourtage = ((CourtageInfo) strategy.copy(LocatorUtils.property(locator, "courtage", sourceCourtage), sourceCourtage));
                copy.setCourtage(copyCourtage);
            } else {
                copy.courtage = null;
            }
            if (this.distanceToMRS!= null) {
                Integer sourceDistanceToMRS;
                sourceDistanceToMRS = this.getDistanceToMRS();
                Integer copyDistanceToMRS = ((Integer) strategy.copy(LocatorUtils.property(locator, "distanceToMRS", sourceDistanceToMRS), sourceDistanceToMRS));
                copy.setDistanceToMRS(copyDistanceToMRS);
            } else {
                copy.distanceToMRS = null;
            }
            if (this.distanceToFM!= null) {
                Integer sourceDistanceToFM;
                sourceDistanceToFM = this.getDistanceToFM();
                Integer copyDistanceToFM = ((Integer) strategy.copy(LocatorUtils.property(locator, "distanceToFM", sourceDistanceToFM), sourceDistanceToFM));
                copy.setDistanceToFM(copyDistanceToFM);
            } else {
                copy.distanceToFM = null;
            }
            if (this.distanceToPT!= null) {
                Integer sourceDistanceToPT;
                sourceDistanceToPT = this.getDistanceToPT();
                Integer copyDistanceToPT = ((Integer) strategy.copy(LocatorUtils.property(locator, "distanceToPT", sourceDistanceToPT), sourceDistanceToPT));
                copy.setDistanceToPT(copyDistanceToPT);
            } else {
                copy.distanceToPT = null;
            }
            if (this.distanceToAirport!= null) {
                Integer sourceDistanceToAirport;
                sourceDistanceToAirport = this.getDistanceToAirport();
                Integer copyDistanceToAirport = ((Integer) strategy.copy(LocatorUtils.property(locator, "distanceToAirport", sourceDistanceToAirport), sourceDistanceToAirport));
                copy.setDistanceToAirport(copyDistanceToAirport);
            } else {
                copy.distanceToAirport = null;
            }
            if (this.condition!= null) {
                RealEstateCondition sourceCondition;
                sourceCondition = this.getCondition();
                RealEstateCondition copyCondition = ((RealEstateCondition) strategy.copy(LocatorUtils.property(locator, "condition", sourceCondition), sourceCondition));
                copy.setCondition(copyCondition);
            } else {
                copy.condition = null;
            }
            if (this.numberOfParkingSpaces!= null) {
                Integer sourceNumberOfParkingSpaces;
                sourceNumberOfParkingSpaces = this.getNumberOfParkingSpaces();
                Integer copyNumberOfParkingSpaces = ((Integer) strategy.copy(LocatorUtils.property(locator, "numberOfParkingSpaces", sourceNumberOfParkingSpaces), sourceNumberOfParkingSpaces));
                copy.setNumberOfParkingSpaces(copyNumberOfParkingSpaces);
            } else {
                copy.numberOfParkingSpaces = null;
            }
            if (this.parkingSpacePrice!= null) {
                Double sourceParkingSpacePrice;
                sourceParkingSpacePrice = this.getParkingSpacePrice();
                Double copyParkingSpacePrice = ((Double) strategy.copy(LocatorUtils.property(locator, "parkingSpacePrice", sourceParkingSpacePrice), sourceParkingSpacePrice));
                copy.setParkingSpacePrice(copyParkingSpacePrice);
            } else {
                copy.parkingSpacePrice = null;
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
            if (this.thermalCharacteristic!= null) {
                Double sourceThermalCharacteristic;
                sourceThermalCharacteristic = this.getThermalCharacteristic();
                Double copyThermalCharacteristic = ((Double) strategy.copy(LocatorUtils.property(locator, "thermalCharacteristic", sourceThermalCharacteristic), sourceThermalCharacteristic));
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
            if (this.buildingEnergyRatingType!= null) {
                BuildingEnergyRatingType sourceBuildingEnergyRatingType;
                sourceBuildingEnergyRatingType = this.getBuildingEnergyRatingType();
                BuildingEnergyRatingType copyBuildingEnergyRatingType = ((BuildingEnergyRatingType) strategy.copy(LocatorUtils.property(locator, "buildingEnergyRatingType", sourceBuildingEnergyRatingType), sourceBuildingEnergyRatingType));
                copy.setBuildingEnergyRatingType(copyBuildingEnergyRatingType);
            } else {
                copy.buildingEnergyRatingType = null;
            }
            if (this.additionalArea!= null) {
                Double sourceAdditionalArea;
                sourceAdditionalArea = this.getAdditionalArea();
                Double copyAdditionalArea = ((Double) strategy.copy(LocatorUtils.property(locator, "additionalArea", sourceAdditionalArea), sourceAdditionalArea));
                copy.setAdditionalArea(copyAdditionalArea);
            } else {
                copy.additionalArea = null;
            }
            if (this.numberOfFloors!= null) {
                String sourceNumberOfFloors;
                sourceNumberOfFloors = this.getNumberOfFloors();
                String copyNumberOfFloors = ((String) strategy.copy(LocatorUtils.property(locator, "numberOfFloors", sourceNumberOfFloors), sourceNumberOfFloors));
                copy.setNumberOfFloors(copyNumberOfFloors);
            } else {
                copy.numberOfFloors = null;
            }
            if (this.additionalCosts!= null) {
                Price sourceAdditionalCosts;
                sourceAdditionalCosts = this.getAdditionalCosts();
                Price copyAdditionalCosts = ((Price) strategy.copy(LocatorUtils.property(locator, "additionalCosts", sourceAdditionalCosts), sourceAdditionalCosts));
                copy.setAdditionalCosts(copyAdditionalCosts);
            } else {
                copy.additionalCosts = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Store();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Store)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Store that = ((Store) object);
        {
            StoreType lhsStoreType;
            lhsStoreType = this.getStoreType();
            StoreType rhsStoreType;
            rhsStoreType = that.getStoreType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "storeType", lhsStoreType), LocatorUtils.property(thatLocator, "storeType", rhsStoreType), lhsStoreType, rhsStoreType)) {
                return false;
            }
        }
        {
            LocationClassificationType lhsLocationClassificationType;
            lhsLocationClassificationType = this.getLocationClassificationType();
            LocationClassificationType rhsLocationClassificationType;
            rhsLocationClassificationType = that.getLocationClassificationType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "locationClassificationType", lhsLocationClassificationType), LocatorUtils.property(thatLocator, "locationClassificationType", rhsLocationClassificationType), lhsLocationClassificationType, rhsLocationClassificationType)) {
                return false;
            }
        }
        {
            Double lhsAreaDivisibleFrom;
            lhsAreaDivisibleFrom = this.getAreaDivisibleFrom();
            Double rhsAreaDivisibleFrom;
            rhsAreaDivisibleFrom = that.getAreaDivisibleFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "areaDivisibleFrom", lhsAreaDivisibleFrom), LocatorUtils.property(thatLocator, "areaDivisibleFrom", rhsAreaDivisibleFrom), lhsAreaDivisibleFrom, rhsAreaDivisibleFrom)) {
                return false;
            }
        }
        {
            Double lhsShopWindowLength;
            lhsShopWindowLength = this.getShopWindowLength();
            Double rhsShopWindowLength;
            rhsShopWindowLength = that.getShopWindowLength();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shopWindowLength", lhsShopWindowLength), LocatorUtils.property(thatLocator, "shopWindowLength", rhsShopWindowLength), lhsShopWindowLength, rhsShopWindowLength)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsListed;
            lhsListed = this.getListed();
            YesNotApplicableType rhsListed;
            rhsListed = that.getListed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listed", lhsListed), LocatorUtils.property(thatLocator, "listed", rhsListed), lhsListed, rhsListed)) {
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
            YesNotApplicableType lhsGoodsLift;
            lhsGoodsLift = this.getGoodsLift();
            YesNotApplicableType rhsGoodsLift;
            rhsGoodsLift = that.getGoodsLift();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "goodsLift", lhsGoodsLift), LocatorUtils.property(thatLocator, "goodsLift", rhsGoodsLift), lhsGoodsLift, rhsGoodsLift)) {
                return false;
            }
        }
        {
            Double lhsGoodsLiftLoad;
            lhsGoodsLiftLoad = this.getGoodsLiftLoad();
            Double rhsGoodsLiftLoad;
            rhsGoodsLiftLoad = that.getGoodsLiftLoad();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "goodsLiftLoad", lhsGoodsLiftLoad), LocatorUtils.property(thatLocator, "goodsLiftLoad", rhsGoodsLiftLoad), lhsGoodsLiftLoad, rhsGoodsLiftLoad)) {
                return false;
            }
        }
        {
            Double lhsFloorLoad;
            lhsFloorLoad = this.getFloorLoad();
            Double rhsFloorLoad;
            rhsFloorLoad = that.getFloorLoad();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "floorLoad", lhsFloorLoad), LocatorUtils.property(thatLocator, "floorLoad", rhsFloorLoad), lhsFloorLoad, rhsFloorLoad)) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsRamp;
            lhsRamp = this.getRamp();
            YesNotApplicableType rhsRamp;
            rhsRamp = that.getRamp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ramp", lhsRamp), LocatorUtils.property(thatLocator, "ramp", rhsRamp), lhsRamp, rhsRamp)) {
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
            SupplyType lhsSupplyType;
            lhsSupplyType = this.getSupplyType();
            SupplyType rhsSupplyType;
            rhsSupplyType = that.getSupplyType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "supplyType", lhsSupplyType), LocatorUtils.property(thatLocator, "supplyType", rhsSupplyType), lhsSupplyType, rhsSupplyType)) {
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
            String lhsDeposit;
            lhsDeposit = this.getDeposit();
            String rhsDeposit;
            rhsDeposit = that.getDeposit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deposit", lhsDeposit), LocatorUtils.property(thatLocator, "deposit", rhsDeposit), lhsDeposit, rhsDeposit)) {
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
            CommercializationType lhsCommercializationType;
            lhsCommercializationType = this.getCommercializationType();
            CommercializationType rhsCommercializationType;
            rhsCommercializationType = that.getCommercializationType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commercializationType", lhsCommercializationType), LocatorUtils.property(thatLocator, "commercializationType", rhsCommercializationType), lhsCommercializationType, rhsCommercializationType)) {
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
            Price lhsCalculatedPrice;
            lhsCalculatedPrice = this.getCalculatedPrice();
            Price rhsCalculatedPrice;
            rhsCalculatedPrice = that.getCalculatedPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "calculatedPrice", lhsCalculatedPrice), LocatorUtils.property(thatLocator, "calculatedPrice", rhsCalculatedPrice), lhsCalculatedPrice, rhsCalculatedPrice)) {
                return false;
            }
        }
        {
            Double lhsTotalFloorSpace;
            lhsTotalFloorSpace = this.getTotalFloorSpace();
            Double rhsTotalFloorSpace;
            rhsTotalFloorSpace = that.getTotalFloorSpace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalFloorSpace", lhsTotalFloorSpace), LocatorUtils.property(thatLocator, "totalFloorSpace", rhsTotalFloorSpace), lhsTotalFloorSpace, rhsTotalFloorSpace)) {
                return false;
            }
        }
        {
            Double lhsNetFloorSpace;
            lhsNetFloorSpace = this.getNetFloorSpace();
            Double rhsNetFloorSpace;
            rhsNetFloorSpace = that.getNetFloorSpace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "netFloorSpace", lhsNetFloorSpace), LocatorUtils.property(thatLocator, "netFloorSpace", rhsNetFloorSpace), lhsNetFloorSpace, rhsNetFloorSpace)) {
                return false;
            }
        }
        {
            Double lhsMinDivisible;
            lhsMinDivisible = this.getMinDivisible();
            Double rhsMinDivisible;
            rhsMinDivisible = that.getMinDivisible();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minDivisible", lhsMinDivisible), LocatorUtils.property(thatLocator, "minDivisible", rhsMinDivisible), lhsMinDivisible, rhsMinDivisible)) {
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
            Integer lhsDistanceToMRS;
            lhsDistanceToMRS = this.getDistanceToMRS();
            Integer rhsDistanceToMRS;
            rhsDistanceToMRS = that.getDistanceToMRS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distanceToMRS", lhsDistanceToMRS), LocatorUtils.property(thatLocator, "distanceToMRS", rhsDistanceToMRS), lhsDistanceToMRS, rhsDistanceToMRS)) {
                return false;
            }
        }
        {
            Integer lhsDistanceToFM;
            lhsDistanceToFM = this.getDistanceToFM();
            Integer rhsDistanceToFM;
            rhsDistanceToFM = that.getDistanceToFM();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distanceToFM", lhsDistanceToFM), LocatorUtils.property(thatLocator, "distanceToFM", rhsDistanceToFM), lhsDistanceToFM, rhsDistanceToFM)) {
                return false;
            }
        }
        {
            Integer lhsDistanceToPT;
            lhsDistanceToPT = this.getDistanceToPT();
            Integer rhsDistanceToPT;
            rhsDistanceToPT = that.getDistanceToPT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distanceToPT", lhsDistanceToPT), LocatorUtils.property(thatLocator, "distanceToPT", rhsDistanceToPT), lhsDistanceToPT, rhsDistanceToPT)) {
                return false;
            }
        }
        {
            Integer lhsDistanceToAirport;
            lhsDistanceToAirport = this.getDistanceToAirport();
            Integer rhsDistanceToAirport;
            rhsDistanceToAirport = that.getDistanceToAirport();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distanceToAirport", lhsDistanceToAirport), LocatorUtils.property(thatLocator, "distanceToAirport", rhsDistanceToAirport), lhsDistanceToAirport, rhsDistanceToAirport)) {
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
            Integer lhsNumberOfParkingSpaces;
            lhsNumberOfParkingSpaces = this.getNumberOfParkingSpaces();
            Integer rhsNumberOfParkingSpaces;
            rhsNumberOfParkingSpaces = that.getNumberOfParkingSpaces();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfParkingSpaces", lhsNumberOfParkingSpaces), LocatorUtils.property(thatLocator, "numberOfParkingSpaces", rhsNumberOfParkingSpaces), lhsNumberOfParkingSpaces, rhsNumberOfParkingSpaces)) {
                return false;
            }
        }
        {
            Double lhsParkingSpacePrice;
            lhsParkingSpacePrice = this.getParkingSpacePrice();
            Double rhsParkingSpacePrice;
            rhsParkingSpacePrice = that.getParkingSpacePrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parkingSpacePrice", lhsParkingSpacePrice), LocatorUtils.property(thatLocator, "parkingSpacePrice", rhsParkingSpacePrice), lhsParkingSpacePrice, rhsParkingSpacePrice)) {
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
            Double lhsThermalCharacteristic;
            lhsThermalCharacteristic = this.getThermalCharacteristic();
            Double rhsThermalCharacteristic;
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
            BuildingEnergyRatingType lhsBuildingEnergyRatingType;
            lhsBuildingEnergyRatingType = this.getBuildingEnergyRatingType();
            BuildingEnergyRatingType rhsBuildingEnergyRatingType;
            rhsBuildingEnergyRatingType = that.getBuildingEnergyRatingType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buildingEnergyRatingType", lhsBuildingEnergyRatingType), LocatorUtils.property(thatLocator, "buildingEnergyRatingType", rhsBuildingEnergyRatingType), lhsBuildingEnergyRatingType, rhsBuildingEnergyRatingType)) {
                return false;
            }
        }
        {
            Double lhsAdditionalArea;
            lhsAdditionalArea = this.getAdditionalArea();
            Double rhsAdditionalArea;
            rhsAdditionalArea = that.getAdditionalArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalArea", lhsAdditionalArea), LocatorUtils.property(thatLocator, "additionalArea", rhsAdditionalArea), lhsAdditionalArea, rhsAdditionalArea)) {
                return false;
            }
        }
        {
            String lhsNumberOfFloors;
            lhsNumberOfFloors = this.getNumberOfFloors();
            String rhsNumberOfFloors;
            rhsNumberOfFloors = that.getNumberOfFloors();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfFloors", lhsNumberOfFloors), LocatorUtils.property(thatLocator, "numberOfFloors", rhsNumberOfFloors), lhsNumberOfFloors, rhsNumberOfFloors)) {
                return false;
            }
        }
        {
            Price lhsAdditionalCosts;
            lhsAdditionalCosts = this.getAdditionalCosts();
            Price rhsAdditionalCosts;
            rhsAdditionalCosts = that.getAdditionalCosts();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalCosts", lhsAdditionalCosts), LocatorUtils.property(thatLocator, "additionalCosts", rhsAdditionalCosts), lhsAdditionalCosts, rhsAdditionalCosts)) {
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
