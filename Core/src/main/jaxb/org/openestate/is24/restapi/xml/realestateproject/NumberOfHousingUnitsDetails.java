
package org.openestate.is24.restapi.xml.realestateproject;

import java.io.Serializable;
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
import org.openestate.is24.restapi.xml.Adapter5;


/**
 * <p>Java class for NumberOfHousingUnitsDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberOfHousingUnitsDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apartmentCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="houseCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="commercialCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfHousingUnitsDetails", propOrder = {
    "apartmentCount",
    "houseCount",
    "commercialCount"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
public class NumberOfHousingUnitsDetails implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected Long apartmentCount;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected Long houseCount;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected Long commercialCount;

    /**
     * Gets the value of the apartmentCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Long getApartmentCount() {
        return apartmentCount;
    }

    /**
     * Sets the value of the apartmentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setApartmentCount(Long value) {
        this.apartmentCount = value;
    }

    /**
     * Gets the value of the houseCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Long getHouseCount() {
        return houseCount;
    }

    /**
     * Sets the value of the houseCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setHouseCount(Long value) {
        this.houseCount = value;
    }

    /**
     * Gets the value of the commercialCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Long getCommercialCount() {
        return commercialCount;
    }

    /**
     * Sets the value of the commercialCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setCommercialCount(Long value) {
        this.commercialCount = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            Long theApartmentCount;
            theApartmentCount = this.getApartmentCount();
            strategy.appendField(locator, this, "apartmentCount", buffer, theApartmentCount, (this.apartmentCount!= null));
        }
        {
            Long theHouseCount;
            theHouseCount = this.getHouseCount();
            strategy.appendField(locator, this, "houseCount", buffer, theHouseCount, (this.houseCount!= null));
        }
        {
            Long theCommercialCount;
            theCommercialCount = this.getCommercialCount();
            strategy.appendField(locator, this, "commercialCount", buffer, theCommercialCount, (this.commercialCount!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof NumberOfHousingUnitsDetails) {
            final NumberOfHousingUnitsDetails copy = ((NumberOfHousingUnitsDetails) draftCopy);
            {
                Boolean apartmentCountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.apartmentCount!= null));
                if (apartmentCountShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceApartmentCount;
                    sourceApartmentCount = this.getApartmentCount();
                    Long copyApartmentCount = ((Long) strategy.copy(LocatorUtils.property(locator, "apartmentCount", sourceApartmentCount), sourceApartmentCount, (this.apartmentCount!= null)));
                    copy.setApartmentCount(copyApartmentCount);
                } else {
                    if (apartmentCountShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.apartmentCount = null;
                    }
                }
            }
            {
                Boolean houseCountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.houseCount!= null));
                if (houseCountShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceHouseCount;
                    sourceHouseCount = this.getHouseCount();
                    Long copyHouseCount = ((Long) strategy.copy(LocatorUtils.property(locator, "houseCount", sourceHouseCount), sourceHouseCount, (this.houseCount!= null)));
                    copy.setHouseCount(copyHouseCount);
                } else {
                    if (houseCountShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.houseCount = null;
                    }
                }
            }
            {
                Boolean commercialCountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.commercialCount!= null));
                if (commercialCountShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceCommercialCount;
                    sourceCommercialCount = this.getCommercialCount();
                    Long copyCommercialCount = ((Long) strategy.copy(LocatorUtils.property(locator, "commercialCount", sourceCommercialCount), sourceCommercialCount, (this.commercialCount!= null)));
                    copy.setCommercialCount(copyCommercialCount);
                } else {
                    if (commercialCountShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.commercialCount = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new NumberOfHousingUnitsDetails();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NumberOfHousingUnitsDetails that = ((NumberOfHousingUnitsDetails) object);
        {
            Long lhsApartmentCount;
            lhsApartmentCount = this.getApartmentCount();
            Long rhsApartmentCount;
            rhsApartmentCount = that.getApartmentCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "apartmentCount", lhsApartmentCount), LocatorUtils.property(thatLocator, "apartmentCount", rhsApartmentCount), lhsApartmentCount, rhsApartmentCount, (this.apartmentCount!= null), (that.apartmentCount!= null))) {
                return false;
            }
        }
        {
            Long lhsHouseCount;
            lhsHouseCount = this.getHouseCount();
            Long rhsHouseCount;
            rhsHouseCount = that.getHouseCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "houseCount", lhsHouseCount), LocatorUtils.property(thatLocator, "houseCount", rhsHouseCount), lhsHouseCount, rhsHouseCount, (this.houseCount!= null), (that.houseCount!= null))) {
                return false;
            }
        }
        {
            Long lhsCommercialCount;
            lhsCommercialCount = this.getCommercialCount();
            Long rhsCommercialCount;
            rhsCommercialCount = that.getCommercialCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commercialCount", lhsCommercialCount), LocatorUtils.property(thatLocator, "commercialCount", rhsCommercialCount), lhsCommercialCount, rhsCommercialCount, (this.commercialCount!= null), (that.commercialCount!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
