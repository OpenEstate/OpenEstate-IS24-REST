
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
    implements Cloneable, CopyTo, Equals, ToString
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
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
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
            BigDecimal theIndustrialArea;
            theIndustrialArea = this.getIndustrialArea();
            strategy.appendField(locator, this, "industrialArea", buffer, theIndustrialArea);
        }
        {
            BigDecimal thePlotArea;
            thePlotArea = this.getPlotArea();
            strategy.appendField(locator, this, "plotArea", buffer, thePlotArea);
        }
        {
            BigDecimal theNetFloorSpace;
            theNetFloorSpace = this.getNetFloorSpace();
            strategy.appendField(locator, this, "netFloorSpace", buffer, theNetFloorSpace);
        }
        {
            InvestmentType theInvestmentType;
            theInvestmentType = this.getInvestmentType();
            strategy.appendField(locator, this, "investmentType", buffer, theInvestmentType);
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
            BigDecimal theTotalFloorSpace;
            theTotalFloorSpace = this.getTotalFloorSpace();
            strategy.appendField(locator, this, "totalFloorSpace", buffer, theTotalFloorSpace);
        }
        {
            BigDecimal theLivingSpace;
            theLivingSpace = this.getLivingSpace();
            strategy.appendField(locator, this, "livingSpace", buffer, theLivingSpace);
        }
        {
            Price thePricePerSQM;
            thePricePerSQM = this.getPricePerSQM();
            strategy.appendField(locator, this, "pricePerSQM", buffer, thePricePerSQM);
        }
        {
            BigDecimal thePriceMultiplier;
            thePriceMultiplier = this.getPriceMultiplier();
            strategy.appendField(locator, this, "priceMultiplier", buffer, thePriceMultiplier);
        }
        {
            Price theRentalIncomeActual;
            theRentalIncomeActual = this.getRentalIncomeActual();
            strategy.appendField(locator, this, "rentalIncomeActual", buffer, theRentalIncomeActual);
        }
        {
            Price theRentalIncomeTarget;
            theRentalIncomeTarget = this.getRentalIncomeTarget();
            strategy.appendField(locator, this, "rentalIncomeTarget", buffer, theRentalIncomeTarget);
        }
        {
            Price theOtherCosts;
            theOtherCosts = this.getOtherCosts();
            strategy.appendField(locator, this, "otherCosts", buffer, theOtherCosts);
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
            EnergyPerformanceCertificate theEnergyCertificate;
            theEnergyCertificate = this.getEnergyCertificate();
            strategy.appendField(locator, this, "energyCertificate", buffer, theEnergyCertificate);
        }
        {
            Long theDistanceToMRS;
            theDistanceToMRS = this.getDistanceToMRS();
            strategy.appendField(locator, this, "distanceToMRS", buffer, theDistanceToMRS);
        }
        {
            Long theDistanceToFM;
            theDistanceToFM = this.getDistanceToFM();
            strategy.appendField(locator, this, "distanceToFM", buffer, theDistanceToFM);
        }
        {
            Long theDistanceToPT;
            theDistanceToPT = this.getDistanceToPT();
            strategy.appendField(locator, this, "distanceToPT", buffer, theDistanceToPT);
        }
        {
            Long theDistanceToAirport;
            theDistanceToAirport = this.getDistanceToAirport();
            strategy.appendField(locator, this, "distanceToAirport", buffer, theDistanceToAirport);
        }
        {
            RealEstateCondition theCondition;
            theCondition = this.getCondition();
            strategy.appendField(locator, this, "condition", buffer, theCondition);
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
            Long theLastRefurbishment;
            theLastRefurbishment = this.getLastRefurbishment();
            strategy.appendField(locator, this, "lastRefurbishment", buffer, theLastRefurbishment);
        }
        {
            InteriorQuality theInteriorQuality;
            theInteriorQuality = this.getInteriorQuality();
            strategy.appendField(locator, this, "interiorQuality", buffer, theInteriorQuality);
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
            BuildingEnergyRatingType theBuildingEnergyRatingType;
            theBuildingEnergyRatingType = this.getBuildingEnergyRatingType();
            strategy.appendField(locator, this, "buildingEnergyRatingType", buffer, theBuildingEnergyRatingType);
        }
        {
            BigDecimal theAdditionalArea;
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
        if (draftCopy instanceof Investment) {
            final Investment copy = ((Investment) draftCopy);
            if (this.price!= null) {
                Price sourcePrice;
                sourcePrice = this.getPrice();
                Price copyPrice = ((Price) strategy.copy(LocatorUtils.property(locator, "price", sourcePrice), sourcePrice));
                copy.setPrice(copyPrice);
            } else {
                copy.price = null;
            }
            if (this.industrialArea!= null) {
                BigDecimal sourceIndustrialArea;
                sourceIndustrialArea = this.getIndustrialArea();
                BigDecimal copyIndustrialArea = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "industrialArea", sourceIndustrialArea), sourceIndustrialArea));
                copy.setIndustrialArea(copyIndustrialArea);
            } else {
                copy.industrialArea = null;
            }
            if (this.plotArea!= null) {
                BigDecimal sourcePlotArea;
                sourcePlotArea = this.getPlotArea();
                BigDecimal copyPlotArea = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "plotArea", sourcePlotArea), sourcePlotArea));
                copy.setPlotArea(copyPlotArea);
            } else {
                copy.plotArea = null;
            }
            if (this.netFloorSpace!= null) {
                BigDecimal sourceNetFloorSpace;
                sourceNetFloorSpace = this.getNetFloorSpace();
                BigDecimal copyNetFloorSpace = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "netFloorSpace", sourceNetFloorSpace), sourceNetFloorSpace));
                copy.setNetFloorSpace(copyNetFloorSpace);
            } else {
                copy.netFloorSpace = null;
            }
            if (this.investmentType!= null) {
                InvestmentType sourceInvestmentType;
                sourceInvestmentType = this.getInvestmentType();
                InvestmentType copyInvestmentType = ((InvestmentType) strategy.copy(LocatorUtils.property(locator, "investmentType", sourceInvestmentType), sourceInvestmentType));
                copy.setInvestmentType(copyInvestmentType);
            } else {
                copy.investmentType = null;
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
            if (this.totalFloorSpace!= null) {
                BigDecimal sourceTotalFloorSpace;
                sourceTotalFloorSpace = this.getTotalFloorSpace();
                BigDecimal copyTotalFloorSpace = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "totalFloorSpace", sourceTotalFloorSpace), sourceTotalFloorSpace));
                copy.setTotalFloorSpace(copyTotalFloorSpace);
            } else {
                copy.totalFloorSpace = null;
            }
            if (this.livingSpace!= null) {
                BigDecimal sourceLivingSpace;
                sourceLivingSpace = this.getLivingSpace();
                BigDecimal copyLivingSpace = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "livingSpace", sourceLivingSpace), sourceLivingSpace));
                copy.setLivingSpace(copyLivingSpace);
            } else {
                copy.livingSpace = null;
            }
            if (this.pricePerSQM!= null) {
                Price sourcePricePerSQM;
                sourcePricePerSQM = this.getPricePerSQM();
                Price copyPricePerSQM = ((Price) strategy.copy(LocatorUtils.property(locator, "pricePerSQM", sourcePricePerSQM), sourcePricePerSQM));
                copy.setPricePerSQM(copyPricePerSQM);
            } else {
                copy.pricePerSQM = null;
            }
            if (this.priceMultiplier!= null) {
                BigDecimal sourcePriceMultiplier;
                sourcePriceMultiplier = this.getPriceMultiplier();
                BigDecimal copyPriceMultiplier = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "priceMultiplier", sourcePriceMultiplier), sourcePriceMultiplier));
                copy.setPriceMultiplier(copyPriceMultiplier);
            } else {
                copy.priceMultiplier = null;
            }
            if (this.rentalIncomeActual!= null) {
                Price sourceRentalIncomeActual;
                sourceRentalIncomeActual = this.getRentalIncomeActual();
                Price copyRentalIncomeActual = ((Price) strategy.copy(LocatorUtils.property(locator, "rentalIncomeActual", sourceRentalIncomeActual), sourceRentalIncomeActual));
                copy.setRentalIncomeActual(copyRentalIncomeActual);
            } else {
                copy.rentalIncomeActual = null;
            }
            if (this.rentalIncomeTarget!= null) {
                Price sourceRentalIncomeTarget;
                sourceRentalIncomeTarget = this.getRentalIncomeTarget();
                Price copyRentalIncomeTarget = ((Price) strategy.copy(LocatorUtils.property(locator, "rentalIncomeTarget", sourceRentalIncomeTarget), sourceRentalIncomeTarget));
                copy.setRentalIncomeTarget(copyRentalIncomeTarget);
            } else {
                copy.rentalIncomeTarget = null;
            }
            if (this.otherCosts!= null) {
                Price sourceOtherCosts;
                sourceOtherCosts = this.getOtherCosts();
                Price copyOtherCosts = ((Price) strategy.copy(LocatorUtils.property(locator, "otherCosts", sourceOtherCosts), sourceOtherCosts));
                copy.setOtherCosts(copyOtherCosts);
            } else {
                copy.otherCosts = null;
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
            if (this.energyCertificate!= null) {
                EnergyPerformanceCertificate sourceEnergyCertificate;
                sourceEnergyCertificate = this.getEnergyCertificate();
                EnergyPerformanceCertificate copyEnergyCertificate = ((EnergyPerformanceCertificate) strategy.copy(LocatorUtils.property(locator, "energyCertificate", sourceEnergyCertificate), sourceEnergyCertificate));
                copy.setEnergyCertificate(copyEnergyCertificate);
            } else {
                copy.energyCertificate = null;
            }
            if (this.distanceToMRS!= null) {
                Long sourceDistanceToMRS;
                sourceDistanceToMRS = this.getDistanceToMRS();
                Long copyDistanceToMRS = ((Long) strategy.copy(LocatorUtils.property(locator, "distanceToMRS", sourceDistanceToMRS), sourceDistanceToMRS));
                copy.setDistanceToMRS(copyDistanceToMRS);
            } else {
                copy.distanceToMRS = null;
            }
            if (this.distanceToFM!= null) {
                Long sourceDistanceToFM;
                sourceDistanceToFM = this.getDistanceToFM();
                Long copyDistanceToFM = ((Long) strategy.copy(LocatorUtils.property(locator, "distanceToFM", sourceDistanceToFM), sourceDistanceToFM));
                copy.setDistanceToFM(copyDistanceToFM);
            } else {
                copy.distanceToFM = null;
            }
            if (this.distanceToPT!= null) {
                Long sourceDistanceToPT;
                sourceDistanceToPT = this.getDistanceToPT();
                Long copyDistanceToPT = ((Long) strategy.copy(LocatorUtils.property(locator, "distanceToPT", sourceDistanceToPT), sourceDistanceToPT));
                copy.setDistanceToPT(copyDistanceToPT);
            } else {
                copy.distanceToPT = null;
            }
            if (this.distanceToAirport!= null) {
                Long sourceDistanceToAirport;
                sourceDistanceToAirport = this.getDistanceToAirport();
                Long copyDistanceToAirport = ((Long) strategy.copy(LocatorUtils.property(locator, "distanceToAirport", sourceDistanceToAirport), sourceDistanceToAirport));
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
            if (this.lastRefurbishment!= null) {
                Long sourceLastRefurbishment;
                sourceLastRefurbishment = this.getLastRefurbishment();
                Long copyLastRefurbishment = ((Long) strategy.copy(LocatorUtils.property(locator, "lastRefurbishment", sourceLastRefurbishment), sourceLastRefurbishment));
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
            if (this.buildingEnergyRatingType!= null) {
                BuildingEnergyRatingType sourceBuildingEnergyRatingType;
                sourceBuildingEnergyRatingType = this.getBuildingEnergyRatingType();
                BuildingEnergyRatingType copyBuildingEnergyRatingType = ((BuildingEnergyRatingType) strategy.copy(LocatorUtils.property(locator, "buildingEnergyRatingType", sourceBuildingEnergyRatingType), sourceBuildingEnergyRatingType));
                copy.setBuildingEnergyRatingType(copyBuildingEnergyRatingType);
            } else {
                copy.buildingEnergyRatingType = null;
            }
            if (this.additionalArea!= null) {
                BigDecimal sourceAdditionalArea;
                sourceAdditionalArea = this.getAdditionalArea();
                BigDecimal copyAdditionalArea = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "additionalArea", sourceAdditionalArea), sourceAdditionalArea));
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
        return new Investment();
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
        final Investment that = ((Investment) object);
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
            BigDecimal lhsIndustrialArea;
            lhsIndustrialArea = this.getIndustrialArea();
            BigDecimal rhsIndustrialArea;
            rhsIndustrialArea = that.getIndustrialArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "industrialArea", lhsIndustrialArea), LocatorUtils.property(thatLocator, "industrialArea", rhsIndustrialArea), lhsIndustrialArea, rhsIndustrialArea)) {
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
            BigDecimal lhsNetFloorSpace;
            lhsNetFloorSpace = this.getNetFloorSpace();
            BigDecimal rhsNetFloorSpace;
            rhsNetFloorSpace = that.getNetFloorSpace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "netFloorSpace", lhsNetFloorSpace), LocatorUtils.property(thatLocator, "netFloorSpace", rhsNetFloorSpace), lhsNetFloorSpace, rhsNetFloorSpace)) {
                return false;
            }
        }
        {
            InvestmentType lhsInvestmentType;
            lhsInvestmentType = this.getInvestmentType();
            InvestmentType rhsInvestmentType;
            rhsInvestmentType = that.getInvestmentType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "investmentType", lhsInvestmentType), LocatorUtils.property(thatLocator, "investmentType", rhsInvestmentType), lhsInvestmentType, rhsInvestmentType)) {
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
            BigDecimal lhsTotalFloorSpace;
            lhsTotalFloorSpace = this.getTotalFloorSpace();
            BigDecimal rhsTotalFloorSpace;
            rhsTotalFloorSpace = that.getTotalFloorSpace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalFloorSpace", lhsTotalFloorSpace), LocatorUtils.property(thatLocator, "totalFloorSpace", rhsTotalFloorSpace), lhsTotalFloorSpace, rhsTotalFloorSpace)) {
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
            Price lhsPricePerSQM;
            lhsPricePerSQM = this.getPricePerSQM();
            Price rhsPricePerSQM;
            rhsPricePerSQM = that.getPricePerSQM();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pricePerSQM", lhsPricePerSQM), LocatorUtils.property(thatLocator, "pricePerSQM", rhsPricePerSQM), lhsPricePerSQM, rhsPricePerSQM)) {
                return false;
            }
        }
        {
            BigDecimal lhsPriceMultiplier;
            lhsPriceMultiplier = this.getPriceMultiplier();
            BigDecimal rhsPriceMultiplier;
            rhsPriceMultiplier = that.getPriceMultiplier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceMultiplier", lhsPriceMultiplier), LocatorUtils.property(thatLocator, "priceMultiplier", rhsPriceMultiplier), lhsPriceMultiplier, rhsPriceMultiplier)) {
                return false;
            }
        }
        {
            Price lhsRentalIncomeActual;
            lhsRentalIncomeActual = this.getRentalIncomeActual();
            Price rhsRentalIncomeActual;
            rhsRentalIncomeActual = that.getRentalIncomeActual();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rentalIncomeActual", lhsRentalIncomeActual), LocatorUtils.property(thatLocator, "rentalIncomeActual", rhsRentalIncomeActual), lhsRentalIncomeActual, rhsRentalIncomeActual)) {
                return false;
            }
        }
        {
            Price lhsRentalIncomeTarget;
            lhsRentalIncomeTarget = this.getRentalIncomeTarget();
            Price rhsRentalIncomeTarget;
            rhsRentalIncomeTarget = that.getRentalIncomeTarget();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rentalIncomeTarget", lhsRentalIncomeTarget), LocatorUtils.property(thatLocator, "rentalIncomeTarget", rhsRentalIncomeTarget), lhsRentalIncomeTarget, rhsRentalIncomeTarget)) {
                return false;
            }
        }
        {
            Price lhsOtherCosts;
            lhsOtherCosts = this.getOtherCosts();
            Price rhsOtherCosts;
            rhsOtherCosts = that.getOtherCosts();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherCosts", lhsOtherCosts), LocatorUtils.property(thatLocator, "otherCosts", rhsOtherCosts), lhsOtherCosts, rhsOtherCosts)) {
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
            EnergyPerformanceCertificate lhsEnergyCertificate;
            lhsEnergyCertificate = this.getEnergyCertificate();
            EnergyPerformanceCertificate rhsEnergyCertificate;
            rhsEnergyCertificate = that.getEnergyCertificate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyCertificate", lhsEnergyCertificate), LocatorUtils.property(thatLocator, "energyCertificate", rhsEnergyCertificate), lhsEnergyCertificate, rhsEnergyCertificate)) {
                return false;
            }
        }
        {
            Long lhsDistanceToMRS;
            lhsDistanceToMRS = this.getDistanceToMRS();
            Long rhsDistanceToMRS;
            rhsDistanceToMRS = that.getDistanceToMRS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distanceToMRS", lhsDistanceToMRS), LocatorUtils.property(thatLocator, "distanceToMRS", rhsDistanceToMRS), lhsDistanceToMRS, rhsDistanceToMRS)) {
                return false;
            }
        }
        {
            Long lhsDistanceToFM;
            lhsDistanceToFM = this.getDistanceToFM();
            Long rhsDistanceToFM;
            rhsDistanceToFM = that.getDistanceToFM();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distanceToFM", lhsDistanceToFM), LocatorUtils.property(thatLocator, "distanceToFM", rhsDistanceToFM), lhsDistanceToFM, rhsDistanceToFM)) {
                return false;
            }
        }
        {
            Long lhsDistanceToPT;
            lhsDistanceToPT = this.getDistanceToPT();
            Long rhsDistanceToPT;
            rhsDistanceToPT = that.getDistanceToPT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distanceToPT", lhsDistanceToPT), LocatorUtils.property(thatLocator, "distanceToPT", rhsDistanceToPT), lhsDistanceToPT, rhsDistanceToPT)) {
                return false;
            }
        }
        {
            Long lhsDistanceToAirport;
            lhsDistanceToAirport = this.getDistanceToAirport();
            Long rhsDistanceToAirport;
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
            Long lhsLastRefurbishment;
            lhsLastRefurbishment = this.getLastRefurbishment();
            Long rhsLastRefurbishment;
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
            BuildingEnergyRatingType lhsBuildingEnergyRatingType;
            lhsBuildingEnergyRatingType = this.getBuildingEnergyRatingType();
            BuildingEnergyRatingType rhsBuildingEnergyRatingType;
            rhsBuildingEnergyRatingType = that.getBuildingEnergyRatingType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buildingEnergyRatingType", lhsBuildingEnergyRatingType), LocatorUtils.property(thatLocator, "buildingEnergyRatingType", rhsBuildingEnergyRatingType), lhsBuildingEnergyRatingType, rhsBuildingEnergyRatingType)) {
                return false;
            }
        }
        {
            BigDecimal lhsAdditionalArea;
            lhsAdditionalArea = this.getAdditionalArea();
            BigDecimal rhsAdditionalArea;
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
