
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
import org.openestate.is24.restapi.xml.Adapter5;


/**
 * Enth\u00e4lt die Statistik (d.h. Anzahl der Objekte) f\u00fcr einen
 *         Immobilientyp.
 *       
 * 
 * <p>Java class for GeoHierarchyStatistic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoHierarchyStatistic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="realEstateType" use="required" type="{http://rest.immobilienscout24.de/schema/common/1.0}RealEstateType" /&gt;
 *       &lt;attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoHierarchyStatistic")
public class GeoHierarchyStatistic
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "realEstateType", required = true)
    protected RealEstateType realEstateType;
    @XmlAttribute(name = "count", required = true)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long count;

    /**
     * Gets the value of the realEstateType property.
     * 
     * @return
     *     possible object is
     *     {@link RealEstateType }
     *     
     */
    public RealEstateType getRealEstateType() {
        return realEstateType;
    }

    /**
     * Sets the value of the realEstateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealEstateType }
     *     
     */
    public void setRealEstateType(RealEstateType value) {
        this.realEstateType = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCount(Long value) {
        this.count = value;
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
            RealEstateType theRealEstateType;
            theRealEstateType = this.getRealEstateType();
            strategy.appendField(locator, this, "realEstateType", buffer, theRealEstateType);
        }
        {
            Long theCount;
            theCount = this.getCount();
            strategy.appendField(locator, this, "count", buffer, theCount);
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
        if (draftCopy instanceof GeoHierarchyStatistic) {
            final GeoHierarchyStatistic copy = ((GeoHierarchyStatistic) draftCopy);
            if (this.realEstateType!= null) {
                RealEstateType sourceRealEstateType;
                sourceRealEstateType = this.getRealEstateType();
                RealEstateType copyRealEstateType = ((RealEstateType) strategy.copy(LocatorUtils.property(locator, "realEstateType", sourceRealEstateType), sourceRealEstateType));
                copy.setRealEstateType(copyRealEstateType);
            } else {
                copy.realEstateType = null;
            }
            if (this.count!= null) {
                Long sourceCount;
                sourceCount = this.getCount();
                Long copyCount = ((Long) strategy.copy(LocatorUtils.property(locator, "count", sourceCount), sourceCount));
                copy.setCount(copyCount);
            } else {
                copy.count = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new GeoHierarchyStatistic();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GeoHierarchyStatistic that = ((GeoHierarchyStatistic) object);
        {
            RealEstateType lhsRealEstateType;
            lhsRealEstateType = this.getRealEstateType();
            RealEstateType rhsRealEstateType;
            rhsRealEstateType = that.getRealEstateType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realEstateType", lhsRealEstateType), LocatorUtils.property(thatLocator, "realEstateType", rhsRealEstateType), lhsRealEstateType, rhsRealEstateType)) {
                return false;
            }
        }
        {
            Long lhsCount;
            lhsCount = this.getCount();
            Long rhsCount;
            rhsCount = that.getCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "count", lhsCount), LocatorUtils.property(thatLocator, "count", rhsCount), lhsCount, rhsCount)) {
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
