
package org.openestate.is24.restapi.xml.common;

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
 * <p>Java class for AutopilotSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutopilotSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="autopilotEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="sendEmailWithAutopilotReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutopilotSettings", propOrder = {
    "autopilotEnabled",
    "sendEmailWithAutopilotReport"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
public class AutopilotSettings implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean autopilotEnabled;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean sendEmailWithAutopilotReport;

    /**
     * Gets the value of the autopilotEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getAutopilotEnabled() {
        return autopilotEnabled;
    }

    /**
     * Sets the value of the autopilotEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setAutopilotEnabled(Boolean value) {
        this.autopilotEnabled = value;
    }

    /**
     * Gets the value of the sendEmailWithAutopilotReport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getSendEmailWithAutopilotReport() {
        return sendEmailWithAutopilotReport;
    }

    /**
     * Sets the value of the sendEmailWithAutopilotReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setSendEmailWithAutopilotReport(Boolean value) {
        this.sendEmailWithAutopilotReport = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            Boolean theAutopilotEnabled;
            theAutopilotEnabled = this.getAutopilotEnabled();
            strategy.appendField(locator, this, "autopilotEnabled", buffer, theAutopilotEnabled, (this.autopilotEnabled!= null));
        }
        {
            Boolean theSendEmailWithAutopilotReport;
            theSendEmailWithAutopilotReport = this.getSendEmailWithAutopilotReport();
            strategy.appendField(locator, this, "sendEmailWithAutopilotReport", buffer, theSendEmailWithAutopilotReport, (this.sendEmailWithAutopilotReport!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof AutopilotSettings) {
            final AutopilotSettings copy = ((AutopilotSettings) draftCopy);
            {
                Boolean autopilotEnabledShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.autopilotEnabled!= null));
                if (autopilotEnabledShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceAutopilotEnabled;
                    sourceAutopilotEnabled = this.getAutopilotEnabled();
                    Boolean copyAutopilotEnabled = ((Boolean) strategy.copy(LocatorUtils.property(locator, "autopilotEnabled", sourceAutopilotEnabled), sourceAutopilotEnabled, (this.autopilotEnabled!= null)));
                    copy.setAutopilotEnabled(copyAutopilotEnabled);
                } else {
                    if (autopilotEnabledShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.autopilotEnabled = null;
                    }
                }
            }
            {
                Boolean sendEmailWithAutopilotReportShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sendEmailWithAutopilotReport!= null));
                if (sendEmailWithAutopilotReportShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceSendEmailWithAutopilotReport;
                    sourceSendEmailWithAutopilotReport = this.getSendEmailWithAutopilotReport();
                    Boolean copySendEmailWithAutopilotReport = ((Boolean) strategy.copy(LocatorUtils.property(locator, "sendEmailWithAutopilotReport", sourceSendEmailWithAutopilotReport), sourceSendEmailWithAutopilotReport, (this.sendEmailWithAutopilotReport!= null)));
                    copy.setSendEmailWithAutopilotReport(copySendEmailWithAutopilotReport);
                } else {
                    if (sendEmailWithAutopilotReportShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sendEmailWithAutopilotReport = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new AutopilotSettings();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AutopilotSettings that = ((AutopilotSettings) object);
        {
            Boolean lhsAutopilotEnabled;
            lhsAutopilotEnabled = this.getAutopilotEnabled();
            Boolean rhsAutopilotEnabled;
            rhsAutopilotEnabled = that.getAutopilotEnabled();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "autopilotEnabled", lhsAutopilotEnabled), LocatorUtils.property(thatLocator, "autopilotEnabled", rhsAutopilotEnabled), lhsAutopilotEnabled, rhsAutopilotEnabled, (this.autopilotEnabled!= null), (that.autopilotEnabled!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSendEmailWithAutopilotReport;
            lhsSendEmailWithAutopilotReport = this.getSendEmailWithAutopilotReport();
            Boolean rhsSendEmailWithAutopilotReport;
            rhsSendEmailWithAutopilotReport = that.getSendEmailWithAutopilotReport();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sendEmailWithAutopilotReport", lhsSendEmailWithAutopilotReport), LocatorUtils.property(thatLocator, "sendEmailWithAutopilotReport", rhsSendEmailWithAutopilotReport), lhsSendEmailWithAutopilotReport, rhsSendEmailWithAutopilotReport, (this.sendEmailWithAutopilotReport!= null), (that.sendEmailWithAutopilotReport!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

}
