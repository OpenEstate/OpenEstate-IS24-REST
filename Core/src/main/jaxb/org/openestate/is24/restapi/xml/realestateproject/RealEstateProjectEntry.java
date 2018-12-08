
package org.openestate.is24.restapi.xml.realestateproject;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
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


/**
 * Eintrag in Realestate-Project
 * 
 * <p>Java class for RealEstateProjectEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealEstateProjectEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="messageCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="0" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="0" minOccurs="0"/&gt;
 *         &lt;element name="realEstateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="realEstateExternalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealEstateProjectEntry", propOrder = {
    "realEstateId",
    "realEstateExternalId"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
public class RealEstateProjectEntry implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Long realEstateId;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected String realEstateExternalId;
    @XmlAttribute(name = "id")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Long id;

    /**
     * Gets the value of the realEstateId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Long getRealEstateId() {
        return realEstateId;
    }

    /**
     * Sets the value of the realEstateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setRealEstateId(Long value) {
        this.realEstateId = value;
    }

    /**
     * Gets the value of the realEstateExternalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public String getRealEstateExternalId() {
        return realEstateExternalId;
    }

    /**
     * Sets the value of the realEstateExternalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setRealEstateExternalId(String value) {
        this.realEstateExternalId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setId(Long value) {
        this.id = value;
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
            Long theRealEstateId;
            theRealEstateId = this.getRealEstateId();
            strategy.appendField(locator, this, "realEstateId", buffer, theRealEstateId, (this.realEstateId!= null));
        }
        {
            String theRealEstateExternalId;
            theRealEstateExternalId = this.getRealEstateExternalId();
            strategy.appendField(locator, this, "realEstateExternalId", buffer, theRealEstateExternalId, (this.realEstateExternalId!= null));
        }
        {
            Long theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
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
        if (draftCopy instanceof RealEstateProjectEntry) {
            final RealEstateProjectEntry copy = ((RealEstateProjectEntry) draftCopy);
            {
                Boolean realEstateIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.realEstateId!= null));
                if (realEstateIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceRealEstateId;
                    sourceRealEstateId = this.getRealEstateId();
                    Long copyRealEstateId = ((Long) strategy.copy(LocatorUtils.property(locator, "realEstateId", sourceRealEstateId), sourceRealEstateId, (this.realEstateId!= null)));
                    copy.setRealEstateId(copyRealEstateId);
                } else {
                    if (realEstateIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realEstateId = null;
                    }
                }
            }
            {
                Boolean realEstateExternalIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.realEstateExternalId!= null));
                if (realEstateExternalIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceRealEstateExternalId;
                    sourceRealEstateExternalId = this.getRealEstateExternalId();
                    String copyRealEstateExternalId = ((String) strategy.copy(LocatorUtils.property(locator, "realEstateExternalId", sourceRealEstateExternalId), sourceRealEstateExternalId, (this.realEstateExternalId!= null)));
                    copy.setRealEstateExternalId(copyRealEstateExternalId);
                } else {
                    if (realEstateExternalIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realEstateExternalId = null;
                    }
                }
            }
            {
                Boolean idShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.id!= null));
                if (idShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceId;
                    sourceId = this.getId();
                    Long copyId = ((Long) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId, (this.id!= null)));
                    copy.setId(copyId);
                } else {
                    if (idShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.id = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new RealEstateProjectEntry();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RealEstateProjectEntry that = ((RealEstateProjectEntry) object);
        {
            Long lhsRealEstateId;
            lhsRealEstateId = this.getRealEstateId();
            Long rhsRealEstateId;
            rhsRealEstateId = that.getRealEstateId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realEstateId", lhsRealEstateId), LocatorUtils.property(thatLocator, "realEstateId", rhsRealEstateId), lhsRealEstateId, rhsRealEstateId, (this.realEstateId!= null), (that.realEstateId!= null))) {
                return false;
            }
        }
        {
            String lhsRealEstateExternalId;
            lhsRealEstateExternalId = this.getRealEstateExternalId();
            String rhsRealEstateExternalId;
            rhsRealEstateExternalId = that.getRealEstateExternalId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realEstateExternalId", lhsRealEstateExternalId), LocatorUtils.property(thatLocator, "realEstateExternalId", rhsRealEstateExternalId), lhsRealEstateExternalId, rhsRealEstateExternalId, (this.realEstateExternalId!= null), (that.realEstateExternalId!= null))) {
                return false;
            }
        }
        {
            Long lhsId;
            lhsId = this.getId();
            Long rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId, (this.id!= null), (that.id!= null))) {
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
