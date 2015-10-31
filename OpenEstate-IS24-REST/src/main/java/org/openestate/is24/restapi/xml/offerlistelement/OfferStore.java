
package org.openestate.is24.restapi.xml.offerlistelement;

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
import org.openestate.is24.restapi.xml.common.CommercializationType;
import org.openestate.is24.restapi.xml.common.CourtageInfo;
import org.openestate.is24.restapi.xml.common.Price;


/**
 * Elemente f\u00fcr den Einzelhandel
 * 
 * <p>Java class for OfferStore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferStore"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/listelement/1.0}OfferRealEstateForList"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}BaseStoreGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferStore", propOrder = {
    "commercializationType",
    "price",
    "calculatedPrice",
    "totalFloorSpace",
    "netFloorSpace",
    "minDivisible",
    "courtage"
})
public class OfferStore
    extends OfferRealEstateForList
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CommercializationType commercializationType;
    @XmlElement(required = true)
    protected Price price;
    protected Price calculatedPrice;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal totalFloorSpace;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal netFloorSpace;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal minDivisible;
    @XmlElement(required = true)
    protected CourtageInfo courtage;

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
     * Gets the value of the minDivisible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getMinDivisible() {
        return minDivisible;
    }

    /**
     * Sets the value of the minDivisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinDivisible(BigDecimal value) {
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
            BigDecimal theTotalFloorSpace;
            theTotalFloorSpace = this.getTotalFloorSpace();
            strategy.appendField(locator, this, "totalFloorSpace", buffer, theTotalFloorSpace);
        }
        {
            BigDecimal theNetFloorSpace;
            theNetFloorSpace = this.getNetFloorSpace();
            strategy.appendField(locator, this, "netFloorSpace", buffer, theNetFloorSpace);
        }
        {
            BigDecimal theMinDivisible;
            theMinDivisible = this.getMinDivisible();
            strategy.appendField(locator, this, "minDivisible", buffer, theMinDivisible);
        }
        {
            CourtageInfo theCourtage;
            theCourtage = this.getCourtage();
            strategy.appendField(locator, this, "courtage", buffer, theCourtage);
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
        if (draftCopy instanceof OfferStore) {
            final OfferStore copy = ((OfferStore) draftCopy);
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
                BigDecimal sourceTotalFloorSpace;
                sourceTotalFloorSpace = this.getTotalFloorSpace();
                BigDecimal copyTotalFloorSpace = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "totalFloorSpace", sourceTotalFloorSpace), sourceTotalFloorSpace));
                copy.setTotalFloorSpace(copyTotalFloorSpace);
            } else {
                copy.totalFloorSpace = null;
            }
            if (this.netFloorSpace!= null) {
                BigDecimal sourceNetFloorSpace;
                sourceNetFloorSpace = this.getNetFloorSpace();
                BigDecimal copyNetFloorSpace = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "netFloorSpace", sourceNetFloorSpace), sourceNetFloorSpace));
                copy.setNetFloorSpace(copyNetFloorSpace);
            } else {
                copy.netFloorSpace = null;
            }
            if (this.minDivisible!= null) {
                BigDecimal sourceMinDivisible;
                sourceMinDivisible = this.getMinDivisible();
                BigDecimal copyMinDivisible = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "minDivisible", sourceMinDivisible), sourceMinDivisible));
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
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new OfferStore();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OfferStore)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final OfferStore that = ((OfferStore) object);
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
            BigDecimal lhsTotalFloorSpace;
            lhsTotalFloorSpace = this.getTotalFloorSpace();
            BigDecimal rhsTotalFloorSpace;
            rhsTotalFloorSpace = that.getTotalFloorSpace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalFloorSpace", lhsTotalFloorSpace), LocatorUtils.property(thatLocator, "totalFloorSpace", rhsTotalFloorSpace), lhsTotalFloorSpace, rhsTotalFloorSpace)) {
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
            BigDecimal lhsMinDivisible;
            lhsMinDivisible = this.getMinDivisible();
            BigDecimal rhsMinDivisible;
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
