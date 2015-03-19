
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for AutopilotSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutopilotSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autopilotEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sendEmailWithAutopilotReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutopilotSettings", propOrder = {
    "autopilotEnabled",
    "sendEmailWithAutopilotReport"
})
public class AutopilotSettings
    implements Cloneable, CopyTo, Equals, ToString
{

    protected Boolean autopilotEnabled;
    protected Boolean sendEmailWithAutopilotReport;

    /**
     * Gets the value of the autopilotEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutopilotEnabled() {
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
    public Boolean isSendEmailWithAutopilotReport() {
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
    public void setSendEmailWithAutopilotReport(Boolean value) {
        this.sendEmailWithAutopilotReport = value;
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
            Boolean theAutopilotEnabled;
            theAutopilotEnabled = this.isAutopilotEnabled();
            strategy.appendField(locator, this, "autopilotEnabled", buffer, theAutopilotEnabled);
        }
        {
            Boolean theSendEmailWithAutopilotReport;
            theSendEmailWithAutopilotReport = this.isSendEmailWithAutopilotReport();
            strategy.appendField(locator, this, "sendEmailWithAutopilotReport", buffer, theSendEmailWithAutopilotReport);
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
        if (draftCopy instanceof AutopilotSettings) {
            final AutopilotSettings copy = ((AutopilotSettings) draftCopy);
            if (this.autopilotEnabled!= null) {
                Boolean sourceAutopilotEnabled;
                sourceAutopilotEnabled = this.isAutopilotEnabled();
                Boolean copyAutopilotEnabled = ((Boolean) strategy.copy(LocatorUtils.property(locator, "autopilotEnabled", sourceAutopilotEnabled), sourceAutopilotEnabled));
                copy.setAutopilotEnabled(copyAutopilotEnabled);
            } else {
                copy.autopilotEnabled = null;
            }
            if (this.sendEmailWithAutopilotReport!= null) {
                Boolean sourceSendEmailWithAutopilotReport;
                sourceSendEmailWithAutopilotReport = this.isSendEmailWithAutopilotReport();
                Boolean copySendEmailWithAutopilotReport = ((Boolean) strategy.copy(LocatorUtils.property(locator, "sendEmailWithAutopilotReport", sourceSendEmailWithAutopilotReport), sourceSendEmailWithAutopilotReport));
                copy.setSendEmailWithAutopilotReport(copySendEmailWithAutopilotReport);
            } else {
                copy.sendEmailWithAutopilotReport = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new AutopilotSettings();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AutopilotSettings)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AutopilotSettings that = ((AutopilotSettings) object);
        {
            Boolean lhsAutopilotEnabled;
            lhsAutopilotEnabled = this.isAutopilotEnabled();
            Boolean rhsAutopilotEnabled;
            rhsAutopilotEnabled = that.isAutopilotEnabled();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "autopilotEnabled", lhsAutopilotEnabled), LocatorUtils.property(thatLocator, "autopilotEnabled", rhsAutopilotEnabled), lhsAutopilotEnabled, rhsAutopilotEnabled)) {
                return false;
            }
        }
        {
            Boolean lhsSendEmailWithAutopilotReport;
            lhsSendEmailWithAutopilotReport = this.isSendEmailWithAutopilotReport();
            Boolean rhsSendEmailWithAutopilotReport;
            rhsSendEmailWithAutopilotReport = that.isSendEmailWithAutopilotReport();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sendEmailWithAutopilotReport", lhsSendEmailWithAutopilotReport), LocatorUtils.property(thatLocator, "sendEmailWithAutopilotReport", rhsSendEmailWithAutopilotReport), lhsSendEmailWithAutopilotReport, rhsSendEmailWithAutopilotReport)) {
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
