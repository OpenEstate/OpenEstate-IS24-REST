
package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
import org.openestate.is24.restapi.xml.Adapter5;


/**
 * Enth\u00e4lt die Statistik (d.h. Anzahl der Objekte) f\u00fcr einen
 *                 Immobilientyp.
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
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
public class GeoHierarchyStatistic implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "realEstateType", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected RealEstateType realEstateType;
    @XmlAttribute(name = "count", required = true)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Long count;

    /**
     * Gets the value of the realEstateType property.
     * 
     * @return
     *     possible object is
     *     {@link RealEstateType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setCount(Long value) {
        this.count = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            RealEstateType theRealEstateType;
            theRealEstateType = this.getRealEstateType();
            strategy.appendField(locator, this, "realEstateType", buffer, theRealEstateType, (this.realEstateType!= null));
        }
        {
            Long theCount;
            theCount = this.getCount();
            strategy.appendField(locator, this, "count", buffer, theCount, (this.count!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof GeoHierarchyStatistic) {
            final GeoHierarchyStatistic copy = ((GeoHierarchyStatistic) draftCopy);
            {
                Boolean realEstateTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.realEstateType!= null));
                if (realEstateTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    RealEstateType sourceRealEstateType;
                    sourceRealEstateType = this.getRealEstateType();
                    RealEstateType copyRealEstateType = ((RealEstateType) strategy.copy(LocatorUtils.property(locator, "realEstateType", sourceRealEstateType), sourceRealEstateType, (this.realEstateType!= null)));
                    copy.setRealEstateType(copyRealEstateType);
                } else {
                    if (realEstateTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realEstateType = null;
                    }
                }
            }
            {
                Boolean countShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.count!= null));
                if (countShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceCount;
                    sourceCount = this.getCount();
                    Long copyCount = ((Long) strategy.copy(LocatorUtils.property(locator, "count", sourceCount), sourceCount, (this.count!= null)));
                    copy.setCount(copyCount);
                } else {
                    if (countShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.count = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new GeoHierarchyStatistic();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realEstateType", lhsRealEstateType), LocatorUtils.property(thatLocator, "realEstateType", rhsRealEstateType), lhsRealEstateType, rhsRealEstateType, (this.realEstateType!= null), (that.realEstateType!= null))) {
                return false;
            }
        }
        {
            Long lhsCount;
            lhsCount = this.getCount();
            Long rhsCount;
            rhsCount = that.getCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "count", lhsCount), LocatorUtils.property(thatLocator, "count", rhsCount), lhsCount, rhsCount, (this.count!= null), (that.count!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
