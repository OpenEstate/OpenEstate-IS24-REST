
package org.openestate.is24.restapi.xml.realestates;

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
import org.openestate.is24.restapi.xml.common.BuildingEnergyRatingType;
import org.openestate.is24.restapi.xml.common.CourtageInfo;
import org.openestate.is24.restapi.xml.common.EnergyPerformanceCertificate;
import org.openestate.is24.restapi.xml.common.EnergySourcesEnev2014;
import org.openestate.is24.restapi.xml.common.FiringTypes;
import org.openestate.is24.restapi.xml.common.HeatingType;
import org.openestate.is24.restapi.xml.common.HeatingTypeEnev2014;
import org.openestate.is24.restapi.xml.common.InteriorQuality;
import org.openestate.is24.restapi.xml.common.InvestmentType;
import org.openestate.is24.restapi.xml.common.Price;
import org.openestate.is24.restapi.xml.common.RealEstateCondition;
import org.openestate.is24.restapi.xml.common.YesNotApplicableType;


/**
 * Eigenschaften f\u00fcr den Immobilientyp "Anlage" (Investment)
 * 
 * <p>Java class for Investment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Investment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/realestates/1.0}RealEstate"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}ExtendedInvestmentGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Investment", propOrder = {
    "price",
    "industrialArea",
    "plotArea",
    "netFloorSpace",
    "investmentType",
    "energyPerformanceCertificate",
    "courtage",
    "totalFloorSpace",
    "livingSpace",
    "pricePerSQM",
    "priceMultiplier",
    "rentalIncomeActual",
    "rentalIncomeTarget",
    "otherCosts",
    "listed",
    "lift",
    "energyCertificate",
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
public class Investment
    extends RealEstate
    implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    protected Price price;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal industrialArea;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal plotArea;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal netFloorSpace;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected InvestmentType investmentType;
    protected Boolean energyPerformanceCertificate;
    @XmlElement(required = true)
    protected CourtageInfo courtage;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal totalFloorSpace;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal livingSpace;
    protected Price pricePerSQM;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal priceMultiplier;
    protected Price rentalIncomeActual;
    protected Price rentalIncomeTarget;
    protected Price otherCosts;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType listed;
    @XmlElement(defaultValue = "NOT_APPLICABLE")
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType lift;
    protected EnergyPerformanceCertificate energyCertificate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long distanceToMRS;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long distanceToFM;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long distanceToPT;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long distanceToAirport;
    @XmlSchemaType(name = "string")
    protected RealEstateCondition condition;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long numberOfParkingSpaces;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal parkingSpacePrice;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long lastRefurbishment;
    @XmlSchemaType(name = "string")
    protected InteriorQuality interiorQuality;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long constructionYear;
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
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected BigDecimal thermalCharacteristic;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType energyConsumptionContainsWarmWater;
    @XmlSchemaType(name = "string")
    protected BuildingEnergyRatingType buildingEnergyRatingType;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal additionalArea;
    protected String numberOfFloors;
    protected Price additionalCosts;

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
     * Gets the value of the industrialArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getIndustrialArea() {
        return industrialArea;
    }

    /**
     * Sets the value of the industrialArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustrialArea(BigDecimal value) {
        this.industrialArea = value;
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
     * Gets the value of the netFloorSpace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getNetFloorSpace() {
        return netFloorSpace;
    }

    /**
     * Sets the value of the netFloorSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetFloorSpace(BigDecimal value) {
        this.netFloorSpace = value;
    }

    /**
     * Gets the value of the investmentType property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentType }
     *     
     */
    public InvestmentType getInvestmentType() {
        return investmentType;
    }

    /**
     * Sets the value of the investmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentType }
     *     
     */
    public void setInvestmentType(InvestmentType value) {
        this.investmentType = value;
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
     * Gets the value of the totalFloorSpace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getTotalFloorSpace() {
        return totalFloorSpace;
    }

    /**
     * Sets the value of the totalFloorSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalFloorSpace(BigDecimal value) {
        this.totalFloorSpace = value;
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
     * Gets the value of the pricePerSQM property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getPricePerSQM() {
        return pricePerSQM;
    }

    /**
     * Sets the value of the pricePerSQM property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setPricePerSQM(Price value) {
        this.pricePerSQM = value;
    }

    /**
     * Gets the value of the priceMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getPriceMultiplier() {
        return priceMultiplier;
    }

    /**
     * Sets the value of the priceMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceMultiplier(BigDecimal value) {
        this.priceMultiplier = value;
    }

    /**
     * Gets the value of the rentalIncomeActual property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getRentalIncomeActual() {
        return rentalIncomeActual;
    }

    /**
     * Sets the value of the rentalIncomeActual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setRentalIncomeActual(Price value) {
        this.rentalIncomeActual = value;
    }

    /**
     * Gets the value of the rentalIncomeTarget property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getRentalIncomeTarget() {
        return rentalIncomeTarget;
    }

    /**
     * Sets the value of the rentalIncomeTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setRentalIncomeTarget(Price value) {
        this.rentalIncomeTarget = value;
    }

    /**
     * Gets the value of the otherCosts property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getOtherCosts() {
        return otherCosts;
    }

    /**
     * Sets the value of the otherCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setOtherCosts(Price value) {
        this.otherCosts = value;
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
     * Gets the value of the distanceToMRS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getDistanceToMRS() {
        return distanceToMRS;
    }

    /**
     * Sets the value of the distanceToMRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceToMRS(Long value) {
        this.distanceToMRS = value;
    }

    /**
     * Gets the value of the distanceToFM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getDistanceToFM() {
        return distanceToFM;
    }

    /**
     * Sets the value of the distanceToFM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceToFM(Long value) {
        this.distanceToFM = value;
    }

    /**
     * Gets the value of the distanceToPT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getDistanceToPT() {
        return distanceToPT;
    }

    /**
     * Sets the value of the distanceToPT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceToPT(Long value) {
        this.distanceToPT = value;
    }

    /**
     * Gets the value of the distanceToAirport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getDistanceToAirport() {
        return distanceToAirport;
    }

    /**
     * Sets the value of the distanceToAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceToAirport(Long value) {
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
     * Gets the value of the lastRefurbishment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getLastRefurbishment() {
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
    public void setLastRefurbishment(Long value) {
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
     *     {@link String }
     *     
     */
    public BigDecimal getAdditionalArea() {
        return additionalArea;
    }

    /**
     * Sets the value of the additionalArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalArea(BigDecimal value) {
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
            Price thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice, (this.price!= null));
        }
        {
            BigDecimal theIndustrialArea;
            theIndustrialArea = this.getIndustrialArea();
            strategy.appendField(locator, this, "industrialArea", buffer, theIndustrialArea, (this.industrialArea!= null));
        }
        {
            BigDecimal thePlotArea;
            thePlotArea = this.getPlotArea();
            strategy.appendField(locator, this, "plotArea", buffer, thePlotArea, (this.plotArea!= null));
        }
        {
            BigDecimal theNetFloorSpace;
            theNetFloorSpace = this.getNetFloorSpace();
            strategy.appendField(locator, this, "netFloorSpace", buffer, theNetFloorSpace, (this.netFloorSpace!= null));
        }
        {
            InvestmentType theInvestmentType;
            theInvestmentType = this.getInvestmentType();
            strategy.appendField(locator, this, "investmentType", buffer, theInvestmentType, (this.investmentType!= null));
        }
        {
            Boolean theEnergyPerformanceCertificate;
            theEnergyPerformanceCertificate = this.isEnergyPerformanceCertificate();
            strategy.appendField(locator, this, "energyPerformanceCertificate", buffer, theEnergyPerformanceCertificate, (this.energyPerformanceCertificate!= null));
        }
        {
            CourtageInfo theCourtage;
            theCourtage = this.getCourtage();
            strategy.appendField(locator, this, "courtage", buffer, theCourtage, (this.courtage!= null));
        }
        {
            BigDecimal theTotalFloorSpace;
            theTotalFloorSpace = this.getTotalFloorSpace();
            strategy.appendField(locator, this, "totalFloorSpace", buffer, theTotalFloorSpace, (this.totalFloorSpace!= null));
        }
        {
            BigDecimal theLivingSpace;
            theLivingSpace = this.getLivingSpace();
            strategy.appendField(locator, this, "livingSpace", buffer, theLivingSpace, (this.livingSpace!= null));
        }
        {
            Price thePricePerSQM;
            thePricePerSQM = this.getPricePerSQM();
            strategy.appendField(locator, this, "pricePerSQM", buffer, thePricePerSQM, (this.pricePerSQM!= null));
        }
        {
            BigDecimal thePriceMultiplier;
            thePriceMultiplier = this.getPriceMultiplier();
            strategy.appendField(locator, this, "priceMultiplier", buffer, thePriceMultiplier, (this.priceMultiplier!= null));
        }
        {
            Price theRentalIncomeActual;
            theRentalIncomeActual = this.getRentalIncomeActual();
            strategy.appendField(locator, this, "rentalIncomeActual", buffer, theRentalIncomeActual, (this.rentalIncomeActual!= null));
        }
        {
            Price theRentalIncomeTarget;
            theRentalIncomeTarget = this.getRentalIncomeTarget();
            strategy.appendField(locator, this, "rentalIncomeTarget", buffer, theRentalIncomeTarget, (this.rentalIncomeTarget!= null));
        }
        {
            Price theOtherCosts;
            theOtherCosts = this.getOtherCosts();
            strategy.appendField(locator, this, "otherCosts", buffer, theOtherCosts, (this.otherCosts!= null));
        }
        {
            YesNotApplicableType theListed;
            theListed = this.getListed();
            strategy.appendField(locator, this, "listed", buffer, theListed, (this.listed!= null));
        }
        {
            YesNotApplicableType theLift;
            theLift = this.getLift();
            strategy.appendField(locator, this, "lift", buffer, theLift, (this.lift!= null));
        }
        {
            EnergyPerformanceCertificate theEnergyCertificate;
            theEnergyCertificate = this.getEnergyCertificate();
            strategy.appendField(locator, this, "energyCertificate", buffer, theEnergyCertificate, (this.energyCertificate!= null));
        }
        {
            Long theDistanceToMRS;
            theDistanceToMRS = this.getDistanceToMRS();
            strategy.appendField(locator, this, "distanceToMRS", buffer, theDistanceToMRS, (this.distanceToMRS!= null));
        }
        {
            Long theDistanceToFM;
            theDistanceToFM = this.getDistanceToFM();
            strategy.appendField(locator, this, "distanceToFM", buffer, theDistanceToFM, (this.distanceToFM!= null));
        }
        {
            Long theDistanceToPT;
            theDistanceToPT = this.getDistanceToPT();
            strategy.appendField(locator, this, "distanceToPT", buffer, theDistanceToPT, (this.distanceToPT!= null));
        }
        {
            Long theDistanceToAirport;
            theDistanceToAirport = this.getDistanceToAirport();
            strategy.appendField(locator, this, "distanceToAirport", buffer, theDistanceToAirport, (this.distanceToAirport!= null));
        }
        {
            RealEstateCondition theCondition;
            theCondition = this.getCondition();
            strategy.appendField(locator, this, "condition", buffer, theCondition, (this.condition!= null));
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
            Long theLastRefurbishment;
            theLastRefurbishment = this.getLastRefurbishment();
            strategy.appendField(locator, this, "lastRefurbishment", buffer, theLastRefurbishment, (this.lastRefurbishment!= null));
        }
        {
            InteriorQuality theInteriorQuality;
            theInteriorQuality = this.getInteriorQuality();
            strategy.appendField(locator, this, "interiorQuality", buffer, theInteriorQuality, (this.interiorQuality!= null));
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
            BuildingEnergyRatingType theBuildingEnergyRatingType;
            theBuildingEnergyRatingType = this.getBuildingEnergyRatingType();
            strategy.appendField(locator, this, "buildingEnergyRatingType", buffer, theBuildingEnergyRatingType, (this.buildingEnergyRatingType!= null));
        }
        {
            BigDecimal theAdditionalArea;
            theAdditionalArea = this.getAdditionalArea();
            strategy.appendField(locator, this, "additionalArea", buffer, theAdditionalArea, (this.additionalArea!= null));
        }
        {
            String theNumberOfFloors;
            theNumberOfFloors = this.getNumberOfFloors();
            strategy.appendField(locator, this, "numberOfFloors", buffer, theNumberOfFloors, (this.numberOfFloors!= null));
        }
        {
            Price theAdditionalCosts;
            theAdditionalCosts = this.getAdditionalCosts();
            strategy.appendField(locator, this, "additionalCosts", buffer, theAdditionalCosts, (this.additionalCosts!= null));
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
        if (draftCopy instanceof Investment) {
            final Investment copy = ((Investment) draftCopy);
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
                Boolean industrialAreaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.industrialArea!= null));
                if (industrialAreaShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceIndustrialArea;
                    sourceIndustrialArea = this.getIndustrialArea();
                    BigDecimal copyIndustrialArea = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "industrialArea", sourceIndustrialArea), sourceIndustrialArea, (this.industrialArea!= null)));
                    copy.setIndustrialArea(copyIndustrialArea);
                } else {
                    if (industrialAreaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.industrialArea = null;
                    }
                }
            }
            {
                Boolean plotAreaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.plotArea!= null));
                if (plotAreaShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourcePlotArea;
                    sourcePlotArea = this.getPlotArea();
                    BigDecimal copyPlotArea = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "plotArea", sourcePlotArea), sourcePlotArea, (this.plotArea!= null)));
                    copy.setPlotArea(copyPlotArea);
                } else {
                    if (plotAreaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.plotArea = null;
                    }
                }
            }
            {
                Boolean netFloorSpaceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.netFloorSpace!= null));
                if (netFloorSpaceShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceNetFloorSpace;
                    sourceNetFloorSpace = this.getNetFloorSpace();
                    BigDecimal copyNetFloorSpace = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "netFloorSpace", sourceNetFloorSpace), sourceNetFloorSpace, (this.netFloorSpace!= null)));
                    copy.setNetFloorSpace(copyNetFloorSpace);
                } else {
                    if (netFloorSpaceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.netFloorSpace = null;
                    }
                }
            }
            {
                Boolean investmentTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.investmentType!= null));
                if (investmentTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    InvestmentType sourceInvestmentType;
                    sourceInvestmentType = this.getInvestmentType();
                    InvestmentType copyInvestmentType = ((InvestmentType) strategy.copy(LocatorUtils.property(locator, "investmentType", sourceInvestmentType), sourceInvestmentType, (this.investmentType!= null)));
                    copy.setInvestmentType(copyInvestmentType);
                } else {
                    if (investmentTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.investmentType = null;
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
                Boolean totalFloorSpaceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.totalFloorSpace!= null));
                if (totalFloorSpaceShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceTotalFloorSpace;
                    sourceTotalFloorSpace = this.getTotalFloorSpace();
                    BigDecimal copyTotalFloorSpace = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "totalFloorSpace", sourceTotalFloorSpace), sourceTotalFloorSpace, (this.totalFloorSpace!= null)));
                    copy.setTotalFloorSpace(copyTotalFloorSpace);
                } else {
                    if (totalFloorSpaceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.totalFloorSpace = null;
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
                Boolean pricePerSQMShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pricePerSQM!= null));
                if (pricePerSQMShouldBeCopiedAndSet == Boolean.TRUE) {
                    Price sourcePricePerSQM;
                    sourcePricePerSQM = this.getPricePerSQM();
                    Price copyPricePerSQM = ((Price) strategy.copy(LocatorUtils.property(locator, "pricePerSQM", sourcePricePerSQM), sourcePricePerSQM, (this.pricePerSQM!= null)));
                    copy.setPricePerSQM(copyPricePerSQM);
                } else {
                    if (pricePerSQMShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pricePerSQM = null;
                    }
                }
            }
            {
                Boolean priceMultiplierShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.priceMultiplier!= null));
                if (priceMultiplierShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourcePriceMultiplier;
                    sourcePriceMultiplier = this.getPriceMultiplier();
                    BigDecimal copyPriceMultiplier = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "priceMultiplier", sourcePriceMultiplier), sourcePriceMultiplier, (this.priceMultiplier!= null)));
                    copy.setPriceMultiplier(copyPriceMultiplier);
                } else {
                    if (priceMultiplierShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.priceMultiplier = null;
                    }
                }
            }
            {
                Boolean rentalIncomeActualShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rentalIncomeActual!= null));
                if (rentalIncomeActualShouldBeCopiedAndSet == Boolean.TRUE) {
                    Price sourceRentalIncomeActual;
                    sourceRentalIncomeActual = this.getRentalIncomeActual();
                    Price copyRentalIncomeActual = ((Price) strategy.copy(LocatorUtils.property(locator, "rentalIncomeActual", sourceRentalIncomeActual), sourceRentalIncomeActual, (this.rentalIncomeActual!= null)));
                    copy.setRentalIncomeActual(copyRentalIncomeActual);
                } else {
                    if (rentalIncomeActualShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.rentalIncomeActual = null;
                    }
                }
            }
            {
                Boolean rentalIncomeTargetShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rentalIncomeTarget!= null));
                if (rentalIncomeTargetShouldBeCopiedAndSet == Boolean.TRUE) {
                    Price sourceRentalIncomeTarget;
                    sourceRentalIncomeTarget = this.getRentalIncomeTarget();
                    Price copyRentalIncomeTarget = ((Price) strategy.copy(LocatorUtils.property(locator, "rentalIncomeTarget", sourceRentalIncomeTarget), sourceRentalIncomeTarget, (this.rentalIncomeTarget!= null)));
                    copy.setRentalIncomeTarget(copyRentalIncomeTarget);
                } else {
                    if (rentalIncomeTargetShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.rentalIncomeTarget = null;
                    }
                }
            }
            {
                Boolean otherCostsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.otherCosts!= null));
                if (otherCostsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Price sourceOtherCosts;
                    sourceOtherCosts = this.getOtherCosts();
                    Price copyOtherCosts = ((Price) strategy.copy(LocatorUtils.property(locator, "otherCosts", sourceOtherCosts), sourceOtherCosts, (this.otherCosts!= null)));
                    copy.setOtherCosts(copyOtherCosts);
                } else {
                    if (otherCostsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.otherCosts = null;
                    }
                }
            }
            {
                Boolean listedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.listed!= null));
                if (listedShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceListed;
                    sourceListed = this.getListed();
                    YesNotApplicableType copyListed = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "listed", sourceListed), sourceListed, (this.listed!= null)));
                    copy.setListed(copyListed);
                } else {
                    if (listedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.listed = null;
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
                Boolean distanceToMRSShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.distanceToMRS!= null));
                if (distanceToMRSShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceDistanceToMRS;
                    sourceDistanceToMRS = this.getDistanceToMRS();
                    Long copyDistanceToMRS = ((Long) strategy.copy(LocatorUtils.property(locator, "distanceToMRS", sourceDistanceToMRS), sourceDistanceToMRS, (this.distanceToMRS!= null)));
                    copy.setDistanceToMRS(copyDistanceToMRS);
                } else {
                    if (distanceToMRSShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.distanceToMRS = null;
                    }
                }
            }
            {
                Boolean distanceToFMShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.distanceToFM!= null));
                if (distanceToFMShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceDistanceToFM;
                    sourceDistanceToFM = this.getDistanceToFM();
                    Long copyDistanceToFM = ((Long) strategy.copy(LocatorUtils.property(locator, "distanceToFM", sourceDistanceToFM), sourceDistanceToFM, (this.distanceToFM!= null)));
                    copy.setDistanceToFM(copyDistanceToFM);
                } else {
                    if (distanceToFMShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.distanceToFM = null;
                    }
                }
            }
            {
                Boolean distanceToPTShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.distanceToPT!= null));
                if (distanceToPTShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceDistanceToPT;
                    sourceDistanceToPT = this.getDistanceToPT();
                    Long copyDistanceToPT = ((Long) strategy.copy(LocatorUtils.property(locator, "distanceToPT", sourceDistanceToPT), sourceDistanceToPT, (this.distanceToPT!= null)));
                    copy.setDistanceToPT(copyDistanceToPT);
                } else {
                    if (distanceToPTShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.distanceToPT = null;
                    }
                }
            }
            {
                Boolean distanceToAirportShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.distanceToAirport!= null));
                if (distanceToAirportShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceDistanceToAirport;
                    sourceDistanceToAirport = this.getDistanceToAirport();
                    Long copyDistanceToAirport = ((Long) strategy.copy(LocatorUtils.property(locator, "distanceToAirport", sourceDistanceToAirport), sourceDistanceToAirport, (this.distanceToAirport!= null)));
                    copy.setDistanceToAirport(copyDistanceToAirport);
                } else {
                    if (distanceToAirportShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.distanceToAirport = null;
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
                Boolean lastRefurbishmentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lastRefurbishment!= null));
                if (lastRefurbishmentShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceLastRefurbishment;
                    sourceLastRefurbishment = this.getLastRefurbishment();
                    Long copyLastRefurbishment = ((Long) strategy.copy(LocatorUtils.property(locator, "lastRefurbishment", sourceLastRefurbishment), sourceLastRefurbishment, (this.lastRefurbishment!= null)));
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
                Boolean additionalAreaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.additionalArea!= null));
                if (additionalAreaShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceAdditionalArea;
                    sourceAdditionalArea = this.getAdditionalArea();
                    BigDecimal copyAdditionalArea = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "additionalArea", sourceAdditionalArea), sourceAdditionalArea, (this.additionalArea!= null)));
                    copy.setAdditionalArea(copyAdditionalArea);
                } else {
                    if (additionalAreaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.additionalArea = null;
                    }
                }
            }
            {
                Boolean numberOfFloorsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfFloors!= null));
                if (numberOfFloorsShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceNumberOfFloors;
                    sourceNumberOfFloors = this.getNumberOfFloors();
                    String copyNumberOfFloors = ((String) strategy.copy(LocatorUtils.property(locator, "numberOfFloors", sourceNumberOfFloors), sourceNumberOfFloors, (this.numberOfFloors!= null)));
                    copy.setNumberOfFloors(copyNumberOfFloors);
                } else {
                    if (numberOfFloorsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfFloors = null;
                    }
                }
            }
            {
                Boolean additionalCostsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.additionalCosts!= null));
                if (additionalCostsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Price sourceAdditionalCosts;
                    sourceAdditionalCosts = this.getAdditionalCosts();
                    Price copyAdditionalCosts = ((Price) strategy.copy(LocatorUtils.property(locator, "additionalCosts", sourceAdditionalCosts), sourceAdditionalCosts, (this.additionalCosts!= null)));
                    copy.setAdditionalCosts(copyAdditionalCosts);
                } else {
                    if (additionalCostsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.additionalCosts = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Investment();
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
        final Investment that = ((Investment) object);
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
            BigDecimal lhsIndustrialArea;
            lhsIndustrialArea = this.getIndustrialArea();
            BigDecimal rhsIndustrialArea;
            rhsIndustrialArea = that.getIndustrialArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "industrialArea", lhsIndustrialArea), LocatorUtils.property(thatLocator, "industrialArea", rhsIndustrialArea), lhsIndustrialArea, rhsIndustrialArea, (this.industrialArea!= null), (that.industrialArea!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsPlotArea;
            lhsPlotArea = this.getPlotArea();
            BigDecimal rhsPlotArea;
            rhsPlotArea = that.getPlotArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "plotArea", lhsPlotArea), LocatorUtils.property(thatLocator, "plotArea", rhsPlotArea), lhsPlotArea, rhsPlotArea, (this.plotArea!= null), (that.plotArea!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsNetFloorSpace;
            lhsNetFloorSpace = this.getNetFloorSpace();
            BigDecimal rhsNetFloorSpace;
            rhsNetFloorSpace = that.getNetFloorSpace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "netFloorSpace", lhsNetFloorSpace), LocatorUtils.property(thatLocator, "netFloorSpace", rhsNetFloorSpace), lhsNetFloorSpace, rhsNetFloorSpace, (this.netFloorSpace!= null), (that.netFloorSpace!= null))) {
                return false;
            }
        }
        {
            InvestmentType lhsInvestmentType;
            lhsInvestmentType = this.getInvestmentType();
            InvestmentType rhsInvestmentType;
            rhsInvestmentType = that.getInvestmentType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "investmentType", lhsInvestmentType), LocatorUtils.property(thatLocator, "investmentType", rhsInvestmentType), lhsInvestmentType, rhsInvestmentType, (this.investmentType!= null), (that.investmentType!= null))) {
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
            CourtageInfo lhsCourtage;
            lhsCourtage = this.getCourtage();
            CourtageInfo rhsCourtage;
            rhsCourtage = that.getCourtage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "courtage", lhsCourtage), LocatorUtils.property(thatLocator, "courtage", rhsCourtage), lhsCourtage, rhsCourtage, (this.courtage!= null), (that.courtage!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsTotalFloorSpace;
            lhsTotalFloorSpace = this.getTotalFloorSpace();
            BigDecimal rhsTotalFloorSpace;
            rhsTotalFloorSpace = that.getTotalFloorSpace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalFloorSpace", lhsTotalFloorSpace), LocatorUtils.property(thatLocator, "totalFloorSpace", rhsTotalFloorSpace), lhsTotalFloorSpace, rhsTotalFloorSpace, (this.totalFloorSpace!= null), (that.totalFloorSpace!= null))) {
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
            Price lhsPricePerSQM;
            lhsPricePerSQM = this.getPricePerSQM();
            Price rhsPricePerSQM;
            rhsPricePerSQM = that.getPricePerSQM();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pricePerSQM", lhsPricePerSQM), LocatorUtils.property(thatLocator, "pricePerSQM", rhsPricePerSQM), lhsPricePerSQM, rhsPricePerSQM, (this.pricePerSQM!= null), (that.pricePerSQM!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsPriceMultiplier;
            lhsPriceMultiplier = this.getPriceMultiplier();
            BigDecimal rhsPriceMultiplier;
            rhsPriceMultiplier = that.getPriceMultiplier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceMultiplier", lhsPriceMultiplier), LocatorUtils.property(thatLocator, "priceMultiplier", rhsPriceMultiplier), lhsPriceMultiplier, rhsPriceMultiplier, (this.priceMultiplier!= null), (that.priceMultiplier!= null))) {
                return false;
            }
        }
        {
            Price lhsRentalIncomeActual;
            lhsRentalIncomeActual = this.getRentalIncomeActual();
            Price rhsRentalIncomeActual;
            rhsRentalIncomeActual = that.getRentalIncomeActual();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rentalIncomeActual", lhsRentalIncomeActual), LocatorUtils.property(thatLocator, "rentalIncomeActual", rhsRentalIncomeActual), lhsRentalIncomeActual, rhsRentalIncomeActual, (this.rentalIncomeActual!= null), (that.rentalIncomeActual!= null))) {
                return false;
            }
        }
        {
            Price lhsRentalIncomeTarget;
            lhsRentalIncomeTarget = this.getRentalIncomeTarget();
            Price rhsRentalIncomeTarget;
            rhsRentalIncomeTarget = that.getRentalIncomeTarget();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rentalIncomeTarget", lhsRentalIncomeTarget), LocatorUtils.property(thatLocator, "rentalIncomeTarget", rhsRentalIncomeTarget), lhsRentalIncomeTarget, rhsRentalIncomeTarget, (this.rentalIncomeTarget!= null), (that.rentalIncomeTarget!= null))) {
                return false;
            }
        }
        {
            Price lhsOtherCosts;
            lhsOtherCosts = this.getOtherCosts();
            Price rhsOtherCosts;
            rhsOtherCosts = that.getOtherCosts();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherCosts", lhsOtherCosts), LocatorUtils.property(thatLocator, "otherCosts", rhsOtherCosts), lhsOtherCosts, rhsOtherCosts, (this.otherCosts!= null), (that.otherCosts!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsListed;
            lhsListed = this.getListed();
            YesNotApplicableType rhsListed;
            rhsListed = that.getListed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listed", lhsListed), LocatorUtils.property(thatLocator, "listed", rhsListed), lhsListed, rhsListed, (this.listed!= null), (that.listed!= null))) {
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
            EnergyPerformanceCertificate lhsEnergyCertificate;
            lhsEnergyCertificate = this.getEnergyCertificate();
            EnergyPerformanceCertificate rhsEnergyCertificate;
            rhsEnergyCertificate = that.getEnergyCertificate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyCertificate", lhsEnergyCertificate), LocatorUtils.property(thatLocator, "energyCertificate", rhsEnergyCertificate), lhsEnergyCertificate, rhsEnergyCertificate, (this.energyCertificate!= null), (that.energyCertificate!= null))) {
                return false;
            }
        }
        {
            Long lhsDistanceToMRS;
            lhsDistanceToMRS = this.getDistanceToMRS();
            Long rhsDistanceToMRS;
            rhsDistanceToMRS = that.getDistanceToMRS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distanceToMRS", lhsDistanceToMRS), LocatorUtils.property(thatLocator, "distanceToMRS", rhsDistanceToMRS), lhsDistanceToMRS, rhsDistanceToMRS, (this.distanceToMRS!= null), (that.distanceToMRS!= null))) {
                return false;
            }
        }
        {
            Long lhsDistanceToFM;
            lhsDistanceToFM = this.getDistanceToFM();
            Long rhsDistanceToFM;
            rhsDistanceToFM = that.getDistanceToFM();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distanceToFM", lhsDistanceToFM), LocatorUtils.property(thatLocator, "distanceToFM", rhsDistanceToFM), lhsDistanceToFM, rhsDistanceToFM, (this.distanceToFM!= null), (that.distanceToFM!= null))) {
                return false;
            }
        }
        {
            Long lhsDistanceToPT;
            lhsDistanceToPT = this.getDistanceToPT();
            Long rhsDistanceToPT;
            rhsDistanceToPT = that.getDistanceToPT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distanceToPT", lhsDistanceToPT), LocatorUtils.property(thatLocator, "distanceToPT", rhsDistanceToPT), lhsDistanceToPT, rhsDistanceToPT, (this.distanceToPT!= null), (that.distanceToPT!= null))) {
                return false;
            }
        }
        {
            Long lhsDistanceToAirport;
            lhsDistanceToAirport = this.getDistanceToAirport();
            Long rhsDistanceToAirport;
            rhsDistanceToAirport = that.getDistanceToAirport();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distanceToAirport", lhsDistanceToAirport), LocatorUtils.property(thatLocator, "distanceToAirport", rhsDistanceToAirport), lhsDistanceToAirport, rhsDistanceToAirport, (this.distanceToAirport!= null), (that.distanceToAirport!= null))) {
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
            Long lhsLastRefurbishment;
            lhsLastRefurbishment = this.getLastRefurbishment();
            Long rhsLastRefurbishment;
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
            BuildingEnergyRatingType lhsBuildingEnergyRatingType;
            lhsBuildingEnergyRatingType = this.getBuildingEnergyRatingType();
            BuildingEnergyRatingType rhsBuildingEnergyRatingType;
            rhsBuildingEnergyRatingType = that.getBuildingEnergyRatingType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buildingEnergyRatingType", lhsBuildingEnergyRatingType), LocatorUtils.property(thatLocator, "buildingEnergyRatingType", rhsBuildingEnergyRatingType), lhsBuildingEnergyRatingType, rhsBuildingEnergyRatingType, (this.buildingEnergyRatingType!= null), (that.buildingEnergyRatingType!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsAdditionalArea;
            lhsAdditionalArea = this.getAdditionalArea();
            BigDecimal rhsAdditionalArea;
            rhsAdditionalArea = that.getAdditionalArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalArea", lhsAdditionalArea), LocatorUtils.property(thatLocator, "additionalArea", rhsAdditionalArea), lhsAdditionalArea, rhsAdditionalArea, (this.additionalArea!= null), (that.additionalArea!= null))) {
                return false;
            }
        }
        {
            String lhsNumberOfFloors;
            lhsNumberOfFloors = this.getNumberOfFloors();
            String rhsNumberOfFloors;
            rhsNumberOfFloors = that.getNumberOfFloors();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfFloors", lhsNumberOfFloors), LocatorUtils.property(thatLocator, "numberOfFloors", rhsNumberOfFloors), lhsNumberOfFloors, rhsNumberOfFloors, (this.numberOfFloors!= null), (that.numberOfFloors!= null))) {
                return false;
            }
        }
        {
            Price lhsAdditionalCosts;
            lhsAdditionalCosts = this.getAdditionalCosts();
            Price rhsAdditionalCosts;
            rhsAdditionalCosts = that.getAdditionalCosts();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalCosts", lhsAdditionalCosts), LocatorUtils.property(thatLocator, "additionalCosts", rhsAdditionalCosts), lhsAdditionalCosts, rhsAdditionalCosts, (this.additionalCosts!= null), (that.additionalCosts!= null))) {
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
