
package org.openestate.is24.restapi.xml.realtor;

import java.io.Serializable;
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
public class Realtor implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    protected String customerNumber;
    protected boolean businessCardActivated;

    /**
     * Gets the value of the customerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

    /**
     * Gets the value of the businessCardActivated property.
     * 
     */
    public boolean isBusinessCardActivated() {
        return businessCardActivated;
    }

    /**
     * Sets the value of the businessCardActivated property.
     * 
     */
    public void setBusinessCardActivated(boolean value) {
        this.businessCardActivated = value;
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

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

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

    public Object createNewInstance() {
        return new Realtor();
    }

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

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
