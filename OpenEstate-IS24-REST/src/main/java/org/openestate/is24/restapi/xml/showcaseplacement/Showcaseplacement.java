
package org.openestate.is24.restapi.xml.showcaseplacement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
import org.openestate.is24.restapi.xml.common.DateRange;


/**
 * Schaufensterplatzierung
 * 
 * <p>Java class for Showcaseplacement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Showcaseplacement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="messageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="servicePeriod" type="{http://rest.immobilienscout24.de/schema/common/1.0}DateRange" minOccurs="0"/&gt;
 *         &lt;element name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="realestateid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="voucher" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Showcaseplacement", propOrder = {
    "messageCode",
    "message",
    "servicePeriod",
    "externalId"
})
public class Showcaseplacement
    implements Cloneable, CopyTo, Equals, ToString
{

    protected String messageCode;
    protected String message;
    protected DateRange servicePeriod;
    protected String externalId;
    @XmlAttribute(name = "realestateid", required = true)
    protected String realestateid;
    @XmlAttribute(name = "voucher")
    protected String voucher;

    /**
     * Gets the value of the messageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageCode() {
        return messageCode;
    }

    /**
     * Sets the value of the messageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageCode(String value) {
        this.messageCode = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the servicePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getServicePeriod() {
        return servicePeriod;
    }

    /**
     * Sets the value of the servicePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setServicePeriod(DateRange value) {
        this.servicePeriod = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the realestateid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealestateid() {
        return realestateid;
    }

    /**
     * Sets the value of the realestateid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealestateid(String value) {
        this.realestateid = value;
    }

    /**
     * Gets the value of the voucher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucher() {
        return voucher;
    }

    /**
     * Sets the value of the voucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucher(String value) {
        this.voucher = value;
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
            String theMessageCode;
            theMessageCode = this.getMessageCode();
            strategy.appendField(locator, this, "messageCode", buffer, theMessageCode);
        }
        {
            String theMessage;
            theMessage = this.getMessage();
            strategy.appendField(locator, this, "message", buffer, theMessage);
        }
        {
            DateRange theServicePeriod;
            theServicePeriod = this.getServicePeriod();
            strategy.appendField(locator, this, "servicePeriod", buffer, theServicePeriod);
        }
        {
            String theExternalId;
            theExternalId = this.getExternalId();
            strategy.appendField(locator, this, "externalId", buffer, theExternalId);
        }
        {
            String theRealestateid;
            theRealestateid = this.getRealestateid();
            strategy.appendField(locator, this, "realestateid", buffer, theRealestateid);
        }
        {
            String theVoucher;
            theVoucher = this.getVoucher();
            strategy.appendField(locator, this, "voucher", buffer, theVoucher);
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
        if (draftCopy instanceof Showcaseplacement) {
            final Showcaseplacement copy = ((Showcaseplacement) draftCopy);
            if (this.messageCode!= null) {
                String sourceMessageCode;
                sourceMessageCode = this.getMessageCode();
                String copyMessageCode = ((String) strategy.copy(LocatorUtils.property(locator, "messageCode", sourceMessageCode), sourceMessageCode));
                copy.setMessageCode(copyMessageCode);
            } else {
                copy.messageCode = null;
            }
            if (this.message!= null) {
                String sourceMessage;
                sourceMessage = this.getMessage();
                String copyMessage = ((String) strategy.copy(LocatorUtils.property(locator, "message", sourceMessage), sourceMessage));
                copy.setMessage(copyMessage);
            } else {
                copy.message = null;
            }
            if (this.servicePeriod!= null) {
                DateRange sourceServicePeriod;
                sourceServicePeriod = this.getServicePeriod();
                DateRange copyServicePeriod = ((DateRange) strategy.copy(LocatorUtils.property(locator, "servicePeriod", sourceServicePeriod), sourceServicePeriod));
                copy.setServicePeriod(copyServicePeriod);
            } else {
                copy.servicePeriod = null;
            }
            if (this.externalId!= null) {
                String sourceExternalId;
                sourceExternalId = this.getExternalId();
                String copyExternalId = ((String) strategy.copy(LocatorUtils.property(locator, "externalId", sourceExternalId), sourceExternalId));
                copy.setExternalId(copyExternalId);
            } else {
                copy.externalId = null;
            }
            if (this.realestateid!= null) {
                String sourceRealestateid;
                sourceRealestateid = this.getRealestateid();
                String copyRealestateid = ((String) strategy.copy(LocatorUtils.property(locator, "realestateid", sourceRealestateid), sourceRealestateid));
                copy.setRealestateid(copyRealestateid);
            } else {
                copy.realestateid = null;
            }
            if (this.voucher!= null) {
                String sourceVoucher;
                sourceVoucher = this.getVoucher();
                String copyVoucher = ((String) strategy.copy(LocatorUtils.property(locator, "voucher", sourceVoucher), sourceVoucher));
                copy.setVoucher(copyVoucher);
            } else {
                copy.voucher = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Showcaseplacement();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Showcaseplacement that = ((Showcaseplacement) object);
        {
            String lhsMessageCode;
            lhsMessageCode = this.getMessageCode();
            String rhsMessageCode;
            rhsMessageCode = that.getMessageCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "messageCode", lhsMessageCode), LocatorUtils.property(thatLocator, "messageCode", rhsMessageCode), lhsMessageCode, rhsMessageCode)) {
                return false;
            }
        }
        {
            String lhsMessage;
            lhsMessage = this.getMessage();
            String rhsMessage;
            rhsMessage = that.getMessage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "message", lhsMessage), LocatorUtils.property(thatLocator, "message", rhsMessage), lhsMessage, rhsMessage)) {
                return false;
            }
        }
        {
            DateRange lhsServicePeriod;
            lhsServicePeriod = this.getServicePeriod();
            DateRange rhsServicePeriod;
            rhsServicePeriod = that.getServicePeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "servicePeriod", lhsServicePeriod), LocatorUtils.property(thatLocator, "servicePeriod", rhsServicePeriod), lhsServicePeriod, rhsServicePeriod)) {
                return false;
            }
        }
        {
            String lhsExternalId;
            lhsExternalId = this.getExternalId();
            String rhsExternalId;
            rhsExternalId = that.getExternalId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "externalId", lhsExternalId), LocatorUtils.property(thatLocator, "externalId", rhsExternalId), lhsExternalId, rhsExternalId)) {
                return false;
            }
        }
        {
            String lhsRealestateid;
            lhsRealestateid = this.getRealestateid();
            String rhsRealestateid;
            rhsRealestateid = that.getRealestateid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realestateid", lhsRealestateid), LocatorUtils.property(thatLocator, "realestateid", rhsRealestateid), lhsRealestateid, rhsRealestateid)) {
                return false;
            }
        }
        {
            String lhsVoucher;
            lhsVoucher = this.getVoucher();
            String rhsVoucher;
            rhsVoucher = that.getVoucher();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "voucher", lhsVoucher), LocatorUtils.property(thatLocator, "voucher", rhsVoucher), lhsVoucher, rhsVoucher)) {
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
