
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
import org.openestate.is24.restapi.xml.Adapter1;
import org.openestate.is24.restapi.xml.Adapter3;
import org.openestate.is24.restapi.xml.Adapter5;
import org.openestate.is24.restapi.xml.common.CourtageInfo;
import org.openestate.is24.restapi.xml.common.GarageType;
import org.openestate.is24.restapi.xml.common.Price;
import org.openestate.is24.restapi.xml.common.RealEstateCondition;


/**
 * Eigenschaften f\u00fcr den
 *                 Garagen-Miet Immobilientyp
 *             
 * 
 * <p>Java class for GarageRent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GarageRent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/realestates/1.0}RealEstate"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}ExtendedGarageRentGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GarageRent", propOrder = {
    "price",
    "usableFloorSpace",
    "courtage",
    "freeFrom",
    "freeUntil",
    "garageType",
    "constructionYear",
    "lengthGarage",
    "widthGarage",
    "heightGarage",
    "condition",
    "lastRefurbishment"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
public class GarageRent
    extends RealEstate
    implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected Price price;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal usableFloorSpace;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected CourtageInfo courtage;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected Calendar freeFrom;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected Calendar freeUntil;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected GarageType garageType;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter22 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected Integer constructionYear;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal lengthGarage;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal widthGarage;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal heightGarage;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected RealEstateCondition condition;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected Long lastRefurbishment;

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setPrice(Price value) {
        this.price = value;
    }

    /**
     * Gets the value of the usableFloorSpace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setUsableFloorSpace(BigDecimal value) {
        this.usableFloorSpace = value;
    }

    /**
     * Gets the value of the courtage property.
     * 
     * @return
     *     possible object is
     *     {@link CourtageInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setCourtage(CourtageInfo value) {
        this.courtage = value;
    }

    /**
     * Gets the value of the freeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setFreeUntil(Calendar value) {
        this.freeUntil = value;
    }

    /**
     * Gets the value of the garageType property.
     * 
     * @return
     *     possible object is
     *     {@link GarageType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public GarageType getGarageType() {
        return garageType;
    }

    /**
     * Sets the value of the garageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GarageType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setGarageType(GarageType value) {
        this.garageType = value;
    }

    /**
     * Gets the value of the constructionYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setConstructionYear(Integer value) {
        this.constructionYear = value;
    }

    /**
     * Gets the value of the lengthGarage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getLengthGarage() {
        return lengthGarage;
    }

    /**
     * Sets the value of the lengthGarage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setLengthGarage(BigDecimal value) {
        this.lengthGarage = value;
    }

    /**
     * Gets the value of the widthGarage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getWidthGarage() {
        return widthGarage;
    }

    /**
     * Sets the value of the widthGarage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setWidthGarage(BigDecimal value) {
        this.widthGarage = value;
    }

    /**
     * Gets the value of the heightGarage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getHeightGarage() {
        return heightGarage;
    }

    /**
     * Sets the value of the heightGarage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setHeightGarage(BigDecimal value) {
        this.heightGarage = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link RealEstateCondition }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setLastRefurbishment(Long value) {
        this.lastRefurbishment = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            Price thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice, (this.price!= null));
        }
        {
            BigDecimal theUsableFloorSpace;
            theUsableFloorSpace = this.getUsableFloorSpace();
            strategy.appendField(locator, this, "usableFloorSpace", buffer, theUsableFloorSpace, (this.usableFloorSpace!= null));
        }
        {
            CourtageInfo theCourtage;
            theCourtage = this.getCourtage();
            strategy.appendField(locator, this, "courtage", buffer, theCourtage, (this.courtage!= null));
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
            GarageType theGarageType;
            theGarageType = this.getGarageType();
            strategy.appendField(locator, this, "garageType", buffer, theGarageType, (this.garageType!= null));
        }
        {
            Integer theConstructionYear;
            theConstructionYear = this.getConstructionYear();
            strategy.appendField(locator, this, "constructionYear", buffer, theConstructionYear, (this.constructionYear!= null));
        }
        {
            BigDecimal theLengthGarage;
            theLengthGarage = this.getLengthGarage();
            strategy.appendField(locator, this, "lengthGarage", buffer, theLengthGarage, (this.lengthGarage!= null));
        }
        {
            BigDecimal theWidthGarage;
            theWidthGarage = this.getWidthGarage();
            strategy.appendField(locator, this, "widthGarage", buffer, theWidthGarage, (this.widthGarage!= null));
        }
        {
            BigDecimal theHeightGarage;
            theHeightGarage = this.getHeightGarage();
            strategy.appendField(locator, this, "heightGarage", buffer, theHeightGarage, (this.heightGarage!= null));
        }
        {
            RealEstateCondition theCondition;
            theCondition = this.getCondition();
            strategy.appendField(locator, this, "condition", buffer, theCondition, (this.condition!= null));
        }
        {
            Long theLastRefurbishment;
            theLastRefurbishment = this.getLastRefurbishment();
            strategy.appendField(locator, this, "lastRefurbishment", buffer, theLastRefurbishment, (this.lastRefurbishment!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof GarageRent) {
            final GarageRent copy = ((GarageRent) draftCopy);
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
                Boolean usableFloorSpaceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.usableFloorSpace!= null));
                if (usableFloorSpaceShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceUsableFloorSpace;
                    sourceUsableFloorSpace = this.getUsableFloorSpace();
                    BigDecimal copyUsableFloorSpace = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "usableFloorSpace", sourceUsableFloorSpace), sourceUsableFloorSpace, (this.usableFloorSpace!= null)));
                    copy.setUsableFloorSpace(copyUsableFloorSpace);
                } else {
                    if (usableFloorSpaceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.usableFloorSpace = null;
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
                Boolean garageTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.garageType!= null));
                if (garageTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    GarageType sourceGarageType;
                    sourceGarageType = this.getGarageType();
                    GarageType copyGarageType = ((GarageType) strategy.copy(LocatorUtils.property(locator, "garageType", sourceGarageType), sourceGarageType, (this.garageType!= null)));
                    copy.setGarageType(copyGarageType);
                } else {
                    if (garageTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.garageType = null;
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
                Boolean lengthGarageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lengthGarage!= null));
                if (lengthGarageShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceLengthGarage;
                    sourceLengthGarage = this.getLengthGarage();
                    BigDecimal copyLengthGarage = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "lengthGarage", sourceLengthGarage), sourceLengthGarage, (this.lengthGarage!= null)));
                    copy.setLengthGarage(copyLengthGarage);
                } else {
                    if (lengthGarageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lengthGarage = null;
                    }
                }
            }
            {
                Boolean widthGarageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.widthGarage!= null));
                if (widthGarageShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceWidthGarage;
                    sourceWidthGarage = this.getWidthGarage();
                    BigDecimal copyWidthGarage = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "widthGarage", sourceWidthGarage), sourceWidthGarage, (this.widthGarage!= null)));
                    copy.setWidthGarage(copyWidthGarage);
                } else {
                    if (widthGarageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.widthGarage = null;
                    }
                }
            }
            {
                Boolean heightGarageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.heightGarage!= null));
                if (heightGarageShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceHeightGarage;
                    sourceHeightGarage = this.getHeightGarage();
                    BigDecimal copyHeightGarage = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "heightGarage", sourceHeightGarage), sourceHeightGarage, (this.heightGarage!= null)));
                    copy.setHeightGarage(copyHeightGarage);
                } else {
                    if (heightGarageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.heightGarage = null;
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
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new GarageRent();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
        final GarageRent that = ((GarageRent) object);
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
            BigDecimal lhsUsableFloorSpace;
            lhsUsableFloorSpace = this.getUsableFloorSpace();
            BigDecimal rhsUsableFloorSpace;
            rhsUsableFloorSpace = that.getUsableFloorSpace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usableFloorSpace", lhsUsableFloorSpace), LocatorUtils.property(thatLocator, "usableFloorSpace", rhsUsableFloorSpace), lhsUsableFloorSpace, rhsUsableFloorSpace, (this.usableFloorSpace!= null), (that.usableFloorSpace!= null))) {
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
            GarageType lhsGarageType;
            lhsGarageType = this.getGarageType();
            GarageType rhsGarageType;
            rhsGarageType = that.getGarageType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "garageType", lhsGarageType), LocatorUtils.property(thatLocator, "garageType", rhsGarageType), lhsGarageType, rhsGarageType, (this.garageType!= null), (that.garageType!= null))) {
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
            BigDecimal lhsLengthGarage;
            lhsLengthGarage = this.getLengthGarage();
            BigDecimal rhsLengthGarage;
            rhsLengthGarage = that.getLengthGarage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lengthGarage", lhsLengthGarage), LocatorUtils.property(thatLocator, "lengthGarage", rhsLengthGarage), lhsLengthGarage, rhsLengthGarage, (this.lengthGarage!= null), (that.lengthGarage!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsWidthGarage;
            lhsWidthGarage = this.getWidthGarage();
            BigDecimal rhsWidthGarage;
            rhsWidthGarage = that.getWidthGarage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "widthGarage", lhsWidthGarage), LocatorUtils.property(thatLocator, "widthGarage", rhsWidthGarage), lhsWidthGarage, rhsWidthGarage, (this.widthGarage!= null), (that.widthGarage!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsHeightGarage;
            lhsHeightGarage = this.getHeightGarage();
            BigDecimal rhsHeightGarage;
            rhsHeightGarage = that.getHeightGarage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heightGarage", lhsHeightGarage), LocatorUtils.property(thatLocator, "heightGarage", rhsHeightGarage), lhsHeightGarage, rhsHeightGarage, (this.heightGarage!= null), (that.heightGarage!= null))) {
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
            Long lhsLastRefurbishment;
            lhsLastRefurbishment = this.getLastRefurbishment();
            Long rhsLastRefurbishment;
            rhsLastRefurbishment = that.getLastRefurbishment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastRefurbishment", lhsLastRefurbishment), LocatorUtils.property(thatLocator, "lastRefurbishment", rhsLastRefurbishment), lhsLastRefurbishment, rhsLastRefurbishment, (this.lastRefurbishment!= null), (that.lastRefurbishment!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

}
