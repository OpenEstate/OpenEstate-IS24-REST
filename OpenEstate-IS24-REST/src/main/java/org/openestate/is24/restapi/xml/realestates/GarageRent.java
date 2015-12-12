
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
import org.openestate.is24.restapi.xml.common.CourtageInfo;
import org.openestate.is24.restapi.xml.common.GarageType;
import org.openestate.is24.restapi.xml.common.Price;
import org.openestate.is24.restapi.xml.common.RealEstateCondition;


/**
 * Eigenschaften f\u00fcr den
 *         Garagen-Miet Immobilientyp
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
public class GarageRent
    extends RealEstate
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    protected Price price;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal usableFloorSpace;
    @XmlElement(required = true)
    protected CourtageInfo courtage;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "date")
    protected Calendar freeFrom;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "date")
    protected Calendar freeUntil;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected GarageType garageType;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter19 .class)
    protected Integer constructionYear;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal lengthGarage;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal widthGarage;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal heightGarage;
    @XmlSchemaType(name = "string")
    protected RealEstateCondition condition;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long lastRefurbishment;

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
     * Gets the value of the garageType property.
     * 
     * @return
     *     possible object is
     *     {@link GarageType }
     *     
     */
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
     * Gets the value of the lengthGarage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
            BigDecimal theUsableFloorSpace;
            theUsableFloorSpace = this.getUsableFloorSpace();
            strategy.appendField(locator, this, "usableFloorSpace", buffer, theUsableFloorSpace);
        }
        {
            CourtageInfo theCourtage;
            theCourtage = this.getCourtage();
            strategy.appendField(locator, this, "courtage", buffer, theCourtage);
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
            GarageType theGarageType;
            theGarageType = this.getGarageType();
            strategy.appendField(locator, this, "garageType", buffer, theGarageType);
        }
        {
            Integer theConstructionYear;
            theConstructionYear = this.getConstructionYear();
            strategy.appendField(locator, this, "constructionYear", buffer, theConstructionYear);
        }
        {
            BigDecimal theLengthGarage;
            theLengthGarage = this.getLengthGarage();
            strategy.appendField(locator, this, "lengthGarage", buffer, theLengthGarage);
        }
        {
            BigDecimal theWidthGarage;
            theWidthGarage = this.getWidthGarage();
            strategy.appendField(locator, this, "widthGarage", buffer, theWidthGarage);
        }
        {
            BigDecimal theHeightGarage;
            theHeightGarage = this.getHeightGarage();
            strategy.appendField(locator, this, "heightGarage", buffer, theHeightGarage);
        }
        {
            RealEstateCondition theCondition;
            theCondition = this.getCondition();
            strategy.appendField(locator, this, "condition", buffer, theCondition);
        }
        {
            Long theLastRefurbishment;
            theLastRefurbishment = this.getLastRefurbishment();
            strategy.appendField(locator, this, "lastRefurbishment", buffer, theLastRefurbishment);
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
        if (draftCopy instanceof GarageRent) {
            final GarageRent copy = ((GarageRent) draftCopy);
            if (this.price!= null) {
                Price sourcePrice;
                sourcePrice = this.getPrice();
                Price copyPrice = ((Price) strategy.copy(LocatorUtils.property(locator, "price", sourcePrice), sourcePrice));
                copy.setPrice(copyPrice);
            } else {
                copy.price = null;
            }
            if (this.usableFloorSpace!= null) {
                BigDecimal sourceUsableFloorSpace;
                sourceUsableFloorSpace = this.getUsableFloorSpace();
                BigDecimal copyUsableFloorSpace = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "usableFloorSpace", sourceUsableFloorSpace), sourceUsableFloorSpace));
                copy.setUsableFloorSpace(copyUsableFloorSpace);
            } else {
                copy.usableFloorSpace = null;
            }
            if (this.courtage!= null) {
                CourtageInfo sourceCourtage;
                sourceCourtage = this.getCourtage();
                CourtageInfo copyCourtage = ((CourtageInfo) strategy.copy(LocatorUtils.property(locator, "courtage", sourceCourtage), sourceCourtage));
                copy.setCourtage(copyCourtage);
            } else {
                copy.courtage = null;
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
            if (this.garageType!= null) {
                GarageType sourceGarageType;
                sourceGarageType = this.getGarageType();
                GarageType copyGarageType = ((GarageType) strategy.copy(LocatorUtils.property(locator, "garageType", sourceGarageType), sourceGarageType));
                copy.setGarageType(copyGarageType);
            } else {
                copy.garageType = null;
            }
            if (this.constructionYear!= null) {
                Integer sourceConstructionYear;
                sourceConstructionYear = this.getConstructionYear();
                Integer copyConstructionYear = ((Integer) strategy.copy(LocatorUtils.property(locator, "constructionYear", sourceConstructionYear), sourceConstructionYear));
                copy.setConstructionYear(copyConstructionYear);
            } else {
                copy.constructionYear = null;
            }
            if (this.lengthGarage!= null) {
                BigDecimal sourceLengthGarage;
                sourceLengthGarage = this.getLengthGarage();
                BigDecimal copyLengthGarage = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "lengthGarage", sourceLengthGarage), sourceLengthGarage));
                copy.setLengthGarage(copyLengthGarage);
            } else {
                copy.lengthGarage = null;
            }
            if (this.widthGarage!= null) {
                BigDecimal sourceWidthGarage;
                sourceWidthGarage = this.getWidthGarage();
                BigDecimal copyWidthGarage = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "widthGarage", sourceWidthGarage), sourceWidthGarage));
                copy.setWidthGarage(copyWidthGarage);
            } else {
                copy.widthGarage = null;
            }
            if (this.heightGarage!= null) {
                BigDecimal sourceHeightGarage;
                sourceHeightGarage = this.getHeightGarage();
                BigDecimal copyHeightGarage = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "heightGarage", sourceHeightGarage), sourceHeightGarage));
                copy.setHeightGarage(copyHeightGarage);
            } else {
                copy.heightGarage = null;
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
                Long sourceLastRefurbishment;
                sourceLastRefurbishment = this.getLastRefurbishment();
                Long copyLastRefurbishment = ((Long) strategy.copy(LocatorUtils.property(locator, "lastRefurbishment", sourceLastRefurbishment), sourceLastRefurbishment));
                copy.setLastRefurbishment(copyLastRefurbishment);
            } else {
                copy.lastRefurbishment = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new GarageRent();
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
        final GarageRent that = ((GarageRent) object);
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
            BigDecimal lhsUsableFloorSpace;
            lhsUsableFloorSpace = this.getUsableFloorSpace();
            BigDecimal rhsUsableFloorSpace;
            rhsUsableFloorSpace = that.getUsableFloorSpace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usableFloorSpace", lhsUsableFloorSpace), LocatorUtils.property(thatLocator, "usableFloorSpace", rhsUsableFloorSpace), lhsUsableFloorSpace, rhsUsableFloorSpace)) {
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
            GarageType lhsGarageType;
            lhsGarageType = this.getGarageType();
            GarageType rhsGarageType;
            rhsGarageType = that.getGarageType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "garageType", lhsGarageType), LocatorUtils.property(thatLocator, "garageType", rhsGarageType), lhsGarageType, rhsGarageType)) {
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
            BigDecimal lhsLengthGarage;
            lhsLengthGarage = this.getLengthGarage();
            BigDecimal rhsLengthGarage;
            rhsLengthGarage = that.getLengthGarage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lengthGarage", lhsLengthGarage), LocatorUtils.property(thatLocator, "lengthGarage", rhsLengthGarage), lhsLengthGarage, rhsLengthGarage)) {
                return false;
            }
        }
        {
            BigDecimal lhsWidthGarage;
            lhsWidthGarage = this.getWidthGarage();
            BigDecimal rhsWidthGarage;
            rhsWidthGarage = that.getWidthGarage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "widthGarage", lhsWidthGarage), LocatorUtils.property(thatLocator, "widthGarage", rhsWidthGarage), lhsWidthGarage, rhsWidthGarage)) {
                return false;
            }
        }
        {
            BigDecimal lhsHeightGarage;
            lhsHeightGarage = this.getHeightGarage();
            BigDecimal rhsHeightGarage;
            rhsHeightGarage = that.getHeightGarage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heightGarage", lhsHeightGarage), LocatorUtils.property(thatLocator, "heightGarage", rhsHeightGarage), lhsHeightGarage, rhsHeightGarage)) {
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
            Long lhsLastRefurbishment;
            lhsLastRefurbishment = this.getLastRefurbishment();
            Long rhsLastRefurbishment;
            rhsLastRefurbishment = that.getLastRefurbishment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastRefurbishment", lhsLastRefurbishment), LocatorUtils.property(thatLocator, "lastRefurbishment", rhsLastRefurbishment), lhsLastRefurbishment, rhsLastRefurbishment)) {
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
