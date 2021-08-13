
package org.openestate.is24.restapi.xml.realtor;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for Realtor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Realtor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessCardActivated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Realtor", propOrder = {
    "customerNumber",
    "businessCardActivated"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
public class Realtor implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected String customerNumber;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected boolean businessCardActivated;

    /**
     * Gets the value of the customerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

    /**
     * Gets the value of the businessCardActivated property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public boolean isBusinessCardActivated() {
        return businessCardActivated;
    }

    /**
     * Sets the value of the businessCardActivated property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setBusinessCardActivated(boolean value) {
        this.businessCardActivated = value;
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
        {
            String theCustomerNumber;
            theCustomerNumber = this.getCustomerNumber();
            strategy.appendField(locator, this, "customerNumber", buffer, theCustomerNumber, (this.customerNumber!= null));
        }
        {
            boolean theBusinessCardActivated;
            theBusinessCardActivated = this.isBusinessCardActivated();
            strategy.appendField(locator, this, "businessCardActivated", buffer, theBusinessCardActivated, true);
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
        if (draftCopy instanceof Realtor) {
            final Realtor copy = ((Realtor) draftCopy);
            {
                Boolean customerNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.customerNumber!= null));
                if (customerNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCustomerNumber;
                    sourceCustomerNumber = this.getCustomerNumber();
                    String copyCustomerNumber = ((String) strategy.copy(LocatorUtils.property(locator, "customerNumber", sourceCustomerNumber), sourceCustomerNumber, (this.customerNumber!= null)));
                    copy.setCustomerNumber(copyCustomerNumber);
                } else {
                    if (customerNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.customerNumber = null;
                    }
                }
            }
            {
                Boolean businessCardActivatedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (businessCardActivatedShouldBeCopiedAndSet == Boolean.TRUE) {
                    boolean sourceBusinessCardActivated;
                    sourceBusinessCardActivated = this.isBusinessCardActivated();
                    boolean copyBusinessCardActivated = strategy.copy(LocatorUtils.property(locator, "businessCardActivated", sourceBusinessCardActivated), sourceBusinessCardActivated, true);
                    copy.setBusinessCardActivated(copyBusinessCardActivated);
                } else {
                    if (businessCardActivatedShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Realtor();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Realtor that = ((Realtor) object);
        {
            String lhsCustomerNumber;
            lhsCustomerNumber = this.getCustomerNumber();
            String rhsCustomerNumber;
            rhsCustomerNumber = that.getCustomerNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customerNumber", lhsCustomerNumber), LocatorUtils.property(thatLocator, "customerNumber", rhsCustomerNumber), lhsCustomerNumber, rhsCustomerNumber, (this.customerNumber!= null), (that.customerNumber!= null))) {
                return false;
            }
        }
        {
            boolean lhsBusinessCardActivated;
            lhsBusinessCardActivated = this.isBusinessCardActivated();
            boolean rhsBusinessCardActivated;
            rhsBusinessCardActivated = that.isBusinessCardActivated();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "businessCardActivated", lhsBusinessCardActivated), LocatorUtils.property(thatLocator, "businessCardActivated", rhsBusinessCardActivated), lhsBusinessCardActivated, rhsBusinessCardActivated, true, true)) {
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
