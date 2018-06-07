
package org.openestate.is24.restapi.xml.expose;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
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
import org.openestate.is24.restapi.xml.common.CompulsoryAuctionType;
import org.openestate.is24.restapi.xml.common.CountyCourt;
import org.openestate.is24.restapi.xml.common.EnergyPerformanceCertificate;
import org.openestate.is24.restapi.xml.common.EnergySourcesEnev2014;
import org.openestate.is24.restapi.xml.common.HeatingTypeEnev2014;
import org.openestate.is24.restapi.xml.common.Price;
import org.openestate.is24.restapi.xml.common.YesNotApplicableType;
import org.openestate.is24.restapi.xml.realestates.Adapter10;
import org.openestate.is24.restapi.xml.realestates.Adapter6;
import org.openestate.is24.restapi.xml.realestates.Adapter7;
import org.openestate.is24.restapi.xml.realestates.Adapter8;
import org.openestate.is24.restapi.xml.realestates.Adapter9;


/**
 * Eigenschaften f\u00fcr Zwangsversteigerung Objekte.
 * 
 * <p>Java class for CompulsoryAuction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompulsoryAuction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/search/expose/1.0}ExposeRealEstate"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}ExtendedCompulsoryAuctionGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompulsoryAuction", propOrder = {
    "marketValue",
    "lowestBid",
    "recurrenceAppointment",
    "dateOfAuction",
    "lastChangeDate",
    "cancellationDate",
    "recordationDate",
    "area",
    "auctionObjectType",
    "countyCourt",
    "fileReferenceAtCountyCourt",
    "numberOfFolio",
    "splittingAuction",
    "owner",
    "energyCertificate",
    "heatingTypeEnev2014",
    "energySourcesEnev2014",
    "buildingEnergyRatingType",
    "thermalCharacteristic",
    "energyConsumptionContainsWarmWater",
    "constructionYear",
    "constructionYearUnknown"
})
public class CompulsoryAuction
    extends ExposeRealEstate
    implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    protected Price marketValue;
    protected Price lowestBid;
    @XmlElement(defaultValue = "false")
    protected Boolean recurrenceAppointment;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "date")
    protected Calendar dateOfAuction;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "date")
    protected Calendar lastChangeDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "date")
    protected Calendar cancellationDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "date")
    protected Calendar recordationDate;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal area;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CompulsoryAuctionType auctionObjectType;
    protected CountyCourt countyCourt;
    @XmlJavaTypeAdapter(Adapter6 .class)
    protected String fileReferenceAtCountyCourt;
    @XmlJavaTypeAdapter(Adapter7 .class)
    protected String numberOfFolio;
    @XmlElement(defaultValue = "false")
    protected Boolean splittingAuction;
    @XmlJavaTypeAdapter(Adapter8 .class)
    protected String owner;
    protected EnergyPerformanceCertificate energyCertificate;
    @XmlSchemaType(name = "string")
    protected HeatingTypeEnev2014 heatingTypeEnev2014;
    protected EnergySourcesEnev2014 energySourcesEnev2014;
    @XmlSchemaType(name = "string")
    protected BuildingEnergyRatingType buildingEnergyRatingType;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter9 .class)
    protected BigDecimal thermalCharacteristic;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType energyConsumptionContainsWarmWater;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter10 .class)
    protected Integer constructionYear;
    protected Boolean constructionYearUnknown;

    /**
     * Gets the value of the marketValue property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getMarketValue() {
        return marketValue;
    }

    /**
     * Sets the value of the marketValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setMarketValue(Price value) {
        this.marketValue = value;
    }

    /**
     * Gets the value of the lowestBid property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getLowestBid() {
        return lowestBid;
    }

    /**
     * Sets the value of the lowestBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setLowestBid(Price value) {
        this.lowestBid = value;
    }

    /**
     * Gets the value of the recurrenceAppointment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecurrenceAppointment() {
        return recurrenceAppointment;
    }

    /**
     * Sets the value of the recurrenceAppointment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecurrenceAppointment(Boolean value) {
        this.recurrenceAppointment = value;
    }

    /**
     * Gets the value of the dateOfAuction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDateOfAuction() {
        return dateOfAuction;
    }

    /**
     * Sets the value of the dateOfAuction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfAuction(Calendar value) {
        this.dateOfAuction = value;
    }

    /**
     * Gets the value of the lastChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLastChangeDate() {
        return lastChangeDate;
    }

    /**
     * Sets the value of the lastChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastChangeDate(Calendar value) {
        this.lastChangeDate = value;
    }

    /**
     * Gets the value of the cancellationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCancellationDate() {
        return cancellationDate;
    }

    /**
     * Sets the value of the cancellationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationDate(Calendar value) {
        this.cancellationDate = value;
    }

    /**
     * Gets the value of the recordationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getRecordationDate() {
        return recordationDate;
    }

    /**
     * Sets the value of the recordationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordationDate(Calendar value) {
        this.recordationDate = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArea(BigDecimal value) {
        this.area = value;
    }

    /**
     * Gets the value of the auctionObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link CompulsoryAuctionType }
     *     
     */
    public CompulsoryAuctionType getAuctionObjectType() {
        return auctionObjectType;
    }

    /**
     * Sets the value of the auctionObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompulsoryAuctionType }
     *     
     */
    public void setAuctionObjectType(CompulsoryAuctionType value) {
        this.auctionObjectType = value;
    }

    /**
     * Gets the value of the countyCourt property.
     * 
     * @return
     *     possible object is
     *     {@link CountyCourt }
     *     
     */
    public CountyCourt getCountyCourt() {
        return countyCourt;
    }

    /**
     * Sets the value of the countyCourt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountyCourt }
     *     
     */
    public void setCountyCourt(CountyCourt value) {
        this.countyCourt = value;
    }

    /**
     * Gets the value of the fileReferenceAtCountyCourt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileReferenceAtCountyCourt() {
        return fileReferenceAtCountyCourt;
    }

    /**
     * Sets the value of the fileReferenceAtCountyCourt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileReferenceAtCountyCourt(String value) {
        this.fileReferenceAtCountyCourt = value;
    }

    /**
     * Gets the value of the numberOfFolio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfFolio() {
        return numberOfFolio;
    }

    /**
     * Sets the value of the numberOfFolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfFolio(String value) {
        this.numberOfFolio = value;
    }

    /**
     * Gets the value of the splittingAuction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSplittingAuction() {
        return splittingAuction;
    }

    /**
     * Sets the value of the splittingAuction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSplittingAuction(Boolean value) {
        this.splittingAuction = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
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
            Price theMarketValue;
            theMarketValue = this.getMarketValue();
            strategy.appendField(locator, this, "marketValue", buffer, theMarketValue, (this.marketValue!= null));
        }
        {
            Price theLowestBid;
            theLowestBid = this.getLowestBid();
            strategy.appendField(locator, this, "lowestBid", buffer, theLowestBid, (this.lowestBid!= null));
        }
        {
            Boolean theRecurrenceAppointment;
            theRecurrenceAppointment = this.isRecurrenceAppointment();
            strategy.appendField(locator, this, "recurrenceAppointment", buffer, theRecurrenceAppointment, (this.recurrenceAppointment!= null));
        }
        {
            Calendar theDateOfAuction;
            theDateOfAuction = this.getDateOfAuction();
            strategy.appendField(locator, this, "dateOfAuction", buffer, theDateOfAuction, (this.dateOfAuction!= null));
        }
        {
            Calendar theLastChangeDate;
            theLastChangeDate = this.getLastChangeDate();
            strategy.appendField(locator, this, "lastChangeDate", buffer, theLastChangeDate, (this.lastChangeDate!= null));
        }
        {
            Calendar theCancellationDate;
            theCancellationDate = this.getCancellationDate();
            strategy.appendField(locator, this, "cancellationDate", buffer, theCancellationDate, (this.cancellationDate!= null));
        }
        {
            Calendar theRecordationDate;
            theRecordationDate = this.getRecordationDate();
            strategy.appendField(locator, this, "recordationDate", buffer, theRecordationDate, (this.recordationDate!= null));
        }
        {
            BigDecimal theArea;
            theArea = this.getArea();
            strategy.appendField(locator, this, "area", buffer, theArea, (this.area!= null));
        }
        {
            CompulsoryAuctionType theAuctionObjectType;
            theAuctionObjectType = this.getAuctionObjectType();
            strategy.appendField(locator, this, "auctionObjectType", buffer, theAuctionObjectType, (this.auctionObjectType!= null));
        }
        {
            CountyCourt theCountyCourt;
            theCountyCourt = this.getCountyCourt();
            strategy.appendField(locator, this, "countyCourt", buffer, theCountyCourt, (this.countyCourt!= null));
        }
        {
            String theFileReferenceAtCountyCourt;
            theFileReferenceAtCountyCourt = this.getFileReferenceAtCountyCourt();
            strategy.appendField(locator, this, "fileReferenceAtCountyCourt", buffer, theFileReferenceAtCountyCourt, (this.fileReferenceAtCountyCourt!= null));
        }
        {
            String theNumberOfFolio;
            theNumberOfFolio = this.getNumberOfFolio();
            strategy.appendField(locator, this, "numberOfFolio", buffer, theNumberOfFolio, (this.numberOfFolio!= null));
        }
        {
            Boolean theSplittingAuction;
            theSplittingAuction = this.isSplittingAuction();
            strategy.appendField(locator, this, "splittingAuction", buffer, theSplittingAuction, (this.splittingAuction!= null));
        }
        {
            String theOwner;
            theOwner = this.getOwner();
            strategy.appendField(locator, this, "owner", buffer, theOwner, (this.owner!= null));
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
            Integer theConstructionYear;
            theConstructionYear = this.getConstructionYear();
            strategy.appendField(locator, this, "constructionYear", buffer, theConstructionYear, (this.constructionYear!= null));
        }
        {
            Boolean theConstructionYearUnknown;
            theConstructionYearUnknown = this.isConstructionYearUnknown();
            strategy.appendField(locator, this, "constructionYearUnknown", buffer, theConstructionYearUnknown, (this.constructionYearUnknown!= null));
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
        if (draftCopy instanceof CompulsoryAuction) {
            final CompulsoryAuction copy = ((CompulsoryAuction) draftCopy);
            {
                Boolean marketValueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.marketValue!= null));
                if (marketValueShouldBeCopiedAndSet == Boolean.TRUE) {
                    Price sourceMarketValue;
                    sourceMarketValue = this.getMarketValue();
                    Price copyMarketValue = ((Price) strategy.copy(LocatorUtils.property(locator, "marketValue", sourceMarketValue), sourceMarketValue, (this.marketValue!= null)));
                    copy.setMarketValue(copyMarketValue);
                } else {
                    if (marketValueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.marketValue = null;
                    }
                }
            }
            {
                Boolean lowestBidShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lowestBid!= null));
                if (lowestBidShouldBeCopiedAndSet == Boolean.TRUE) {
                    Price sourceLowestBid;
                    sourceLowestBid = this.getLowestBid();
                    Price copyLowestBid = ((Price) strategy.copy(LocatorUtils.property(locator, "lowestBid", sourceLowestBid), sourceLowestBid, (this.lowestBid!= null)));
                    copy.setLowestBid(copyLowestBid);
                } else {
                    if (lowestBidShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lowestBid = null;
                    }
                }
            }
            {
                Boolean recurrenceAppointmentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.recurrenceAppointment!= null));
                if (recurrenceAppointmentShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceRecurrenceAppointment;
                    sourceRecurrenceAppointment = this.isRecurrenceAppointment();
                    Boolean copyRecurrenceAppointment = ((Boolean) strategy.copy(LocatorUtils.property(locator, "recurrenceAppointment", sourceRecurrenceAppointment), sourceRecurrenceAppointment, (this.recurrenceAppointment!= null)));
                    copy.setRecurrenceAppointment(copyRecurrenceAppointment);
                } else {
                    if (recurrenceAppointmentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.recurrenceAppointment = null;
                    }
                }
            }
            {
                Boolean dateOfAuctionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dateOfAuction!= null));
                if (dateOfAuctionShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceDateOfAuction;
                    sourceDateOfAuction = this.getDateOfAuction();
                    Calendar copyDateOfAuction = ((Calendar) strategy.copy(LocatorUtils.property(locator, "dateOfAuction", sourceDateOfAuction), sourceDateOfAuction, (this.dateOfAuction!= null)));
                    copy.setDateOfAuction(copyDateOfAuction);
                } else {
                    if (dateOfAuctionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dateOfAuction = null;
                    }
                }
            }
            {
                Boolean lastChangeDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lastChangeDate!= null));
                if (lastChangeDateShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceLastChangeDate;
                    sourceLastChangeDate = this.getLastChangeDate();
                    Calendar copyLastChangeDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "lastChangeDate", sourceLastChangeDate), sourceLastChangeDate, (this.lastChangeDate!= null)));
                    copy.setLastChangeDate(copyLastChangeDate);
                } else {
                    if (lastChangeDateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lastChangeDate = null;
                    }
                }
            }
            {
                Boolean cancellationDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.cancellationDate!= null));
                if (cancellationDateShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceCancellationDate;
                    sourceCancellationDate = this.getCancellationDate();
                    Calendar copyCancellationDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "cancellationDate", sourceCancellationDate), sourceCancellationDate, (this.cancellationDate!= null)));
                    copy.setCancellationDate(copyCancellationDate);
                } else {
                    if (cancellationDateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cancellationDate = null;
                    }
                }
            }
            {
                Boolean recordationDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.recordationDate!= null));
                if (recordationDateShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceRecordationDate;
                    sourceRecordationDate = this.getRecordationDate();
                    Calendar copyRecordationDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "recordationDate", sourceRecordationDate), sourceRecordationDate, (this.recordationDate!= null)));
                    copy.setRecordationDate(copyRecordationDate);
                } else {
                    if (recordationDateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.recordationDate = null;
                    }
                }
            }
            {
                Boolean areaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.area!= null));
                if (areaShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceArea;
                    sourceArea = this.getArea();
                    BigDecimal copyArea = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "area", sourceArea), sourceArea, (this.area!= null)));
                    copy.setArea(copyArea);
                } else {
                    if (areaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.area = null;
                    }
                }
            }
            {
                Boolean auctionObjectTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.auctionObjectType!= null));
                if (auctionObjectTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    CompulsoryAuctionType sourceAuctionObjectType;
                    sourceAuctionObjectType = this.getAuctionObjectType();
                    CompulsoryAuctionType copyAuctionObjectType = ((CompulsoryAuctionType) strategy.copy(LocatorUtils.property(locator, "auctionObjectType", sourceAuctionObjectType), sourceAuctionObjectType, (this.auctionObjectType!= null)));
                    copy.setAuctionObjectType(copyAuctionObjectType);
                } else {
                    if (auctionObjectTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.auctionObjectType = null;
                    }
                }
            }
            {
                Boolean countyCourtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.countyCourt!= null));
                if (countyCourtShouldBeCopiedAndSet == Boolean.TRUE) {
                    CountyCourt sourceCountyCourt;
                    sourceCountyCourt = this.getCountyCourt();
                    CountyCourt copyCountyCourt = ((CountyCourt) strategy.copy(LocatorUtils.property(locator, "countyCourt", sourceCountyCourt), sourceCountyCourt, (this.countyCourt!= null)));
                    copy.setCountyCourt(copyCountyCourt);
                } else {
                    if (countyCourtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.countyCourt = null;
                    }
                }
            }
            {
                Boolean fileReferenceAtCountyCourtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fileReferenceAtCountyCourt!= null));
                if (fileReferenceAtCountyCourtShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFileReferenceAtCountyCourt;
                    sourceFileReferenceAtCountyCourt = this.getFileReferenceAtCountyCourt();
                    String copyFileReferenceAtCountyCourt = ((String) strategy.copy(LocatorUtils.property(locator, "fileReferenceAtCountyCourt", sourceFileReferenceAtCountyCourt), sourceFileReferenceAtCountyCourt, (this.fileReferenceAtCountyCourt!= null)));
                    copy.setFileReferenceAtCountyCourt(copyFileReferenceAtCountyCourt);
                } else {
                    if (fileReferenceAtCountyCourtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fileReferenceAtCountyCourt = null;
                    }
                }
            }
            {
                Boolean numberOfFolioShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfFolio!= null));
                if (numberOfFolioShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceNumberOfFolio;
                    sourceNumberOfFolio = this.getNumberOfFolio();
                    String copyNumberOfFolio = ((String) strategy.copy(LocatorUtils.property(locator, "numberOfFolio", sourceNumberOfFolio), sourceNumberOfFolio, (this.numberOfFolio!= null)));
                    copy.setNumberOfFolio(copyNumberOfFolio);
                } else {
                    if (numberOfFolioShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfFolio = null;
                    }
                }
            }
            {
                Boolean splittingAuctionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.splittingAuction!= null));
                if (splittingAuctionShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceSplittingAuction;
                    sourceSplittingAuction = this.isSplittingAuction();
                    Boolean copySplittingAuction = ((Boolean) strategy.copy(LocatorUtils.property(locator, "splittingAuction", sourceSplittingAuction), sourceSplittingAuction, (this.splittingAuction!= null)));
                    copy.setSplittingAuction(copySplittingAuction);
                } else {
                    if (splittingAuctionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.splittingAuction = null;
                    }
                }
            }
            {
                Boolean ownerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.owner!= null));
                if (ownerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceOwner;
                    sourceOwner = this.getOwner();
                    String copyOwner = ((String) strategy.copy(LocatorUtils.property(locator, "owner", sourceOwner), sourceOwner, (this.owner!= null)));
                    copy.setOwner(copyOwner);
                } else {
                    if (ownerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.owner = null;
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
                    sourceConstructionYearUnknown = this.isConstructionYearUnknown();
                    Boolean copyConstructionYearUnknown = ((Boolean) strategy.copy(LocatorUtils.property(locator, "constructionYearUnknown", sourceConstructionYearUnknown), sourceConstructionYearUnknown, (this.constructionYearUnknown!= null)));
                    copy.setConstructionYearUnknown(copyConstructionYearUnknown);
                } else {
                    if (constructionYearUnknownShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.constructionYearUnknown = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new CompulsoryAuction();
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
        final CompulsoryAuction that = ((CompulsoryAuction) object);
        {
            Price lhsMarketValue;
            lhsMarketValue = this.getMarketValue();
            Price rhsMarketValue;
            rhsMarketValue = that.getMarketValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "marketValue", lhsMarketValue), LocatorUtils.property(thatLocator, "marketValue", rhsMarketValue), lhsMarketValue, rhsMarketValue, (this.marketValue!= null), (that.marketValue!= null))) {
                return false;
            }
        }
        {
            Price lhsLowestBid;
            lhsLowestBid = this.getLowestBid();
            Price rhsLowestBid;
            rhsLowestBid = that.getLowestBid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lowestBid", lhsLowestBid), LocatorUtils.property(thatLocator, "lowestBid", rhsLowestBid), lhsLowestBid, rhsLowestBid, (this.lowestBid!= null), (that.lowestBid!= null))) {
                return false;
            }
        }
        {
            Boolean lhsRecurrenceAppointment;
            lhsRecurrenceAppointment = this.isRecurrenceAppointment();
            Boolean rhsRecurrenceAppointment;
            rhsRecurrenceAppointment = that.isRecurrenceAppointment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recurrenceAppointment", lhsRecurrenceAppointment), LocatorUtils.property(thatLocator, "recurrenceAppointment", rhsRecurrenceAppointment), lhsRecurrenceAppointment, rhsRecurrenceAppointment, (this.recurrenceAppointment!= null), (that.recurrenceAppointment!= null))) {
                return false;
            }
        }
        {
            Calendar lhsDateOfAuction;
            lhsDateOfAuction = this.getDateOfAuction();
            Calendar rhsDateOfAuction;
            rhsDateOfAuction = that.getDateOfAuction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateOfAuction", lhsDateOfAuction), LocatorUtils.property(thatLocator, "dateOfAuction", rhsDateOfAuction), lhsDateOfAuction, rhsDateOfAuction, (this.dateOfAuction!= null), (that.dateOfAuction!= null))) {
                return false;
            }
        }
        {
            Calendar lhsLastChangeDate;
            lhsLastChangeDate = this.getLastChangeDate();
            Calendar rhsLastChangeDate;
            rhsLastChangeDate = that.getLastChangeDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastChangeDate", lhsLastChangeDate), LocatorUtils.property(thatLocator, "lastChangeDate", rhsLastChangeDate), lhsLastChangeDate, rhsLastChangeDate, (this.lastChangeDate!= null), (that.lastChangeDate!= null))) {
                return false;
            }
        }
        {
            Calendar lhsCancellationDate;
            lhsCancellationDate = this.getCancellationDate();
            Calendar rhsCancellationDate;
            rhsCancellationDate = that.getCancellationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cancellationDate", lhsCancellationDate), LocatorUtils.property(thatLocator, "cancellationDate", rhsCancellationDate), lhsCancellationDate, rhsCancellationDate, (this.cancellationDate!= null), (that.cancellationDate!= null))) {
                return false;
            }
        }
        {
            Calendar lhsRecordationDate;
            lhsRecordationDate = this.getRecordationDate();
            Calendar rhsRecordationDate;
            rhsRecordationDate = that.getRecordationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recordationDate", lhsRecordationDate), LocatorUtils.property(thatLocator, "recordationDate", rhsRecordationDate), lhsRecordationDate, rhsRecordationDate, (this.recordationDate!= null), (that.recordationDate!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsArea;
            lhsArea = this.getArea();
            BigDecimal rhsArea;
            rhsArea = that.getArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "area", lhsArea), LocatorUtils.property(thatLocator, "area", rhsArea), lhsArea, rhsArea, (this.area!= null), (that.area!= null))) {
                return false;
            }
        }
        {
            CompulsoryAuctionType lhsAuctionObjectType;
            lhsAuctionObjectType = this.getAuctionObjectType();
            CompulsoryAuctionType rhsAuctionObjectType;
            rhsAuctionObjectType = that.getAuctionObjectType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "auctionObjectType", lhsAuctionObjectType), LocatorUtils.property(thatLocator, "auctionObjectType", rhsAuctionObjectType), lhsAuctionObjectType, rhsAuctionObjectType, (this.auctionObjectType!= null), (that.auctionObjectType!= null))) {
                return false;
            }
        }
        {
            CountyCourt lhsCountyCourt;
            lhsCountyCourt = this.getCountyCourt();
            CountyCourt rhsCountyCourt;
            rhsCountyCourt = that.getCountyCourt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countyCourt", lhsCountyCourt), LocatorUtils.property(thatLocator, "countyCourt", rhsCountyCourt), lhsCountyCourt, rhsCountyCourt, (this.countyCourt!= null), (that.countyCourt!= null))) {
                return false;
            }
        }
        {
            String lhsFileReferenceAtCountyCourt;
            lhsFileReferenceAtCountyCourt = this.getFileReferenceAtCountyCourt();
            String rhsFileReferenceAtCountyCourt;
            rhsFileReferenceAtCountyCourt = that.getFileReferenceAtCountyCourt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fileReferenceAtCountyCourt", lhsFileReferenceAtCountyCourt), LocatorUtils.property(thatLocator, "fileReferenceAtCountyCourt", rhsFileReferenceAtCountyCourt), lhsFileReferenceAtCountyCourt, rhsFileReferenceAtCountyCourt, (this.fileReferenceAtCountyCourt!= null), (that.fileReferenceAtCountyCourt!= null))) {
                return false;
            }
        }
        {
            String lhsNumberOfFolio;
            lhsNumberOfFolio = this.getNumberOfFolio();
            String rhsNumberOfFolio;
            rhsNumberOfFolio = that.getNumberOfFolio();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfFolio", lhsNumberOfFolio), LocatorUtils.property(thatLocator, "numberOfFolio", rhsNumberOfFolio), lhsNumberOfFolio, rhsNumberOfFolio, (this.numberOfFolio!= null), (that.numberOfFolio!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSplittingAuction;
            lhsSplittingAuction = this.isSplittingAuction();
            Boolean rhsSplittingAuction;
            rhsSplittingAuction = that.isSplittingAuction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "splittingAuction", lhsSplittingAuction), LocatorUtils.property(thatLocator, "splittingAuction", rhsSplittingAuction), lhsSplittingAuction, rhsSplittingAuction, (this.splittingAuction!= null), (that.splittingAuction!= null))) {
                return false;
            }
        }
        {
            String lhsOwner;
            lhsOwner = this.getOwner();
            String rhsOwner;
            rhsOwner = that.getOwner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "owner", lhsOwner), LocatorUtils.property(thatLocator, "owner", rhsOwner), lhsOwner, rhsOwner, (this.owner!= null), (that.owner!= null))) {
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
            lhsConstructionYearUnknown = this.isConstructionYearUnknown();
            Boolean rhsConstructionYearUnknown;
            rhsConstructionYearUnknown = that.isConstructionYearUnknown();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "constructionYearUnknown", lhsConstructionYearUnknown), LocatorUtils.property(thatLocator, "constructionYearUnknown", rhsConstructionYearUnknown), lhsConstructionYearUnknown, rhsConstructionYearUnknown, (this.constructionYearUnknown!= null), (that.constructionYearUnknown!= null))) {
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
