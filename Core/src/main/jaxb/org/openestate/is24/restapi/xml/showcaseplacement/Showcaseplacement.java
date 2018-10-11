
package org.openestate.is24.restapi.xml.showcaseplacement;

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
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
public class Showcaseplacement implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
    protected String messageCode;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
    protected String message;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
    protected DateRange servicePeriod;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
    protected String externalId;
    @XmlAttribute(name = "realestateid", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
    protected String realestateid;
    @XmlAttribute(name = "voucher")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
    protected String voucher;

    /**
     * Gets the value of the messageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
    public void setVoucher(String value) {
        this.voucher = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String theMessageCode;
            theMessageCode = this.getMessageCode();
            strategy.appendField(locator, this, "messageCode", buffer, theMessageCode, (this.messageCode!= null));
        }
        {
            String theMessage;
            theMessage = this.getMessage();
            strategy.appendField(locator, this, "message", buffer, theMessage, (this.message!= null));
        }
        {
            DateRange theServicePeriod;
            theServicePeriod = this.getServicePeriod();
            strategy.appendField(locator, this, "servicePeriod", buffer, theServicePeriod, (this.servicePeriod!= null));
        }
        {
            String theExternalId;
            theExternalId = this.getExternalId();
            strategy.appendField(locator, this, "externalId", buffer, theExternalId, (this.externalId!= null));
        }
        {
            String theRealestateid;
            theRealestateid = this.getRealestateid();
            strategy.appendField(locator, this, "realestateid", buffer, theRealestateid, (this.realestateid!= null));
        }
        {
            String theVoucher;
            theVoucher = this.getVoucher();
            strategy.appendField(locator, this, "voucher", buffer, theVoucher, (this.voucher!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Showcaseplacement) {
            final Showcaseplacement copy = ((Showcaseplacement) draftCopy);
            {
                Boolean messageCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.messageCode!= null));
                if (messageCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceMessageCode;
                    sourceMessageCode = this.getMessageCode();
                    String copyMessageCode = ((String) strategy.copy(LocatorUtils.property(locator, "messageCode", sourceMessageCode), sourceMessageCode, (this.messageCode!= null)));
                    copy.setMessageCode(copyMessageCode);
                } else {
                    if (messageCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.messageCode = null;
                    }
                }
            }
            {
                Boolean messageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.message!= null));
                if (messageShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceMessage;
                    sourceMessage = this.getMessage();
                    String copyMessage = ((String) strategy.copy(LocatorUtils.property(locator, "message", sourceMessage), sourceMessage, (this.message!= null)));
                    copy.setMessage(copyMessage);
                } else {
                    if (messageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.message = null;
                    }
                }
            }
            {
                Boolean servicePeriodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.servicePeriod!= null));
                if (servicePeriodShouldBeCopiedAndSet == Boolean.TRUE) {
                    DateRange sourceServicePeriod;
                    sourceServicePeriod = this.getServicePeriod();
                    DateRange copyServicePeriod = ((DateRange) strategy.copy(LocatorUtils.property(locator, "servicePeriod", sourceServicePeriod), sourceServicePeriod, (this.servicePeriod!= null)));
                    copy.setServicePeriod(copyServicePeriod);
                } else {
                    if (servicePeriodShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.servicePeriod = null;
                    }
                }
            }
            {
                Boolean externalIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.externalId!= null));
                if (externalIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceExternalId;
                    sourceExternalId = this.getExternalId();
                    String copyExternalId = ((String) strategy.copy(LocatorUtils.property(locator, "externalId", sourceExternalId), sourceExternalId, (this.externalId!= null)));
                    copy.setExternalId(copyExternalId);
                } else {
                    if (externalIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.externalId = null;
                    }
                }
            }
            {
                Boolean realestateidShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.realestateid!= null));
                if (realestateidShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceRealestateid;
                    sourceRealestateid = this.getRealestateid();
                    String copyRealestateid = ((String) strategy.copy(LocatorUtils.property(locator, "realestateid", sourceRealestateid), sourceRealestateid, (this.realestateid!= null)));
                    copy.setRealestateid(copyRealestateid);
                } else {
                    if (realestateidShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realestateid = null;
                    }
                }
            }
            {
                Boolean voucherShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.voucher!= null));
                if (voucherShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVoucher;
                    sourceVoucher = this.getVoucher();
                    String copyVoucher = ((String) strategy.copy(LocatorUtils.property(locator, "voucher", sourceVoucher), sourceVoucher, (this.voucher!= null)));
                    copy.setVoucher(copyVoucher);
                } else {
                    if (voucherShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.voucher = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new Showcaseplacement();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "messageCode", lhsMessageCode), LocatorUtils.property(thatLocator, "messageCode", rhsMessageCode), lhsMessageCode, rhsMessageCode, (this.messageCode!= null), (that.messageCode!= null))) {
                return false;
            }
        }
        {
            String lhsMessage;
            lhsMessage = this.getMessage();
            String rhsMessage;
            rhsMessage = that.getMessage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "message", lhsMessage), LocatorUtils.property(thatLocator, "message", rhsMessage), lhsMessage, rhsMessage, (this.message!= null), (that.message!= null))) {
                return false;
            }
        }
        {
            DateRange lhsServicePeriod;
            lhsServicePeriod = this.getServicePeriod();
            DateRange rhsServicePeriod;
            rhsServicePeriod = that.getServicePeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "servicePeriod", lhsServicePeriod), LocatorUtils.property(thatLocator, "servicePeriod", rhsServicePeriod), lhsServicePeriod, rhsServicePeriod, (this.servicePeriod!= null), (that.servicePeriod!= null))) {
                return false;
            }
        }
        {
            String lhsExternalId;
            lhsExternalId = this.getExternalId();
            String rhsExternalId;
            rhsExternalId = that.getExternalId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "externalId", lhsExternalId), LocatorUtils.property(thatLocator, "externalId", rhsExternalId), lhsExternalId, rhsExternalId, (this.externalId!= null), (that.externalId!= null))) {
                return false;
            }
        }
        {
            String lhsRealestateid;
            lhsRealestateid = this.getRealestateid();
            String rhsRealestateid;
            rhsRealestateid = that.getRealestateid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realestateid", lhsRealestateid), LocatorUtils.property(thatLocator, "realestateid", rhsRealestateid), lhsRealestateid, rhsRealestateid, (this.realestateid!= null), (that.realestateid!= null))) {
                return false;
            }
        }
        {
            String lhsVoucher;
            lhsVoucher = this.getVoucher();
            String rhsVoucher;
            rhsVoucher = that.getVoucher();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "voucher", lhsVoucher), LocatorUtils.property(thatLocator, "voucher", rhsVoucher), lhsVoucher, rhsVoucher, (this.voucher!= null), (that.voucher!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
