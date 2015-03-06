
package org.openestate.is24.restapi.xml.realestatestock;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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


/**
 * <p>Java class for priceRegionRealEstateStock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="priceRegionRealEstateStock">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="priceRegion" type="{http://rest.immobilienscout24.de/schema/offer/realestatestock/1.0}priceRegion"/>
 *         &lt;element name="realestateCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priceRegionRealEstateStock", propOrder = {
    "priceRegion",
    "realestateCount"
})
public class PriceRegionRealEstateStock
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    protected PriceRegion priceRegion;
    @XmlElement(defaultValue = "0")
    protected int realestateCount;

    /**
     * Gets the value of the priceRegion property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRegion }
     *     
     */
    public PriceRegion getPriceRegion() {
        return priceRegion;
    }

    /**
     * Sets the value of the priceRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRegion }
     *     
     */
    public void setPriceRegion(PriceRegion value) {
        this.priceRegion = value;
    }

    /**
     * Gets the value of the realestateCount property.
     * 
     */
    public int getRealestateCount() {
        return realestateCount;
    }

    /**
     * Sets the value of the realestateCount property.
     * 
     */
    public void setRealestateCount(int value) {
        this.realestateCount = value;
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
        {
            PriceRegion thePriceRegion;
            thePriceRegion = this.getPriceRegion();
            strategy.appendField(locator, this, "priceRegion", buffer, thePriceRegion);
        }
        {
            int theRealestateCount;
            theRealestateCount = this.getRealestateCount();
            strategy.appendField(locator, this, "realestateCount", buffer, theRealestateCount);
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
        if (draftCopy instanceof PriceRegionRealEstateStock) {
            final PriceRegionRealEstateStock copy = ((PriceRegionRealEstateStock) draftCopy);
            if (this.priceRegion!= null) {
                PriceRegion sourcePriceRegion;
                sourcePriceRegion = this.getPriceRegion();
                PriceRegion copyPriceRegion = ((PriceRegion) strategy.copy(LocatorUtils.property(locator, "priceRegion", sourcePriceRegion), sourcePriceRegion));
                copy.setPriceRegion(copyPriceRegion);
            } else {
                copy.priceRegion = null;
            }
            {
                int sourceRealestateCount;
                sourceRealestateCount = this.getRealestateCount();
                int copyRealestateCount = strategy.copy(LocatorUtils.property(locator, "realestateCount", sourceRealestateCount), sourceRealestateCount);
                copy.setRealestateCount(copyRealestateCount);
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new PriceRegionRealEstateStock();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PriceRegionRealEstateStock)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PriceRegionRealEstateStock that = ((PriceRegionRealEstateStock) object);
        {
            PriceRegion lhsPriceRegion;
            lhsPriceRegion = this.getPriceRegion();
            PriceRegion rhsPriceRegion;
            rhsPriceRegion = that.getPriceRegion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceRegion", lhsPriceRegion), LocatorUtils.property(thatLocator, "priceRegion", rhsPriceRegion), lhsPriceRegion, rhsPriceRegion)) {
                return false;
            }
        }
        {
            int lhsRealestateCount;
            lhsRealestateCount = this.getRealestateCount();
            int rhsRealestateCount;
            rhsRealestateCount = that.getRealestateCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realestateCount", lhsRealestateCount), LocatorUtils.property(thatLocator, "realestateCount", rhsRealestateCount), lhsRealestateCount, rhsRealestateCount)) {
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
