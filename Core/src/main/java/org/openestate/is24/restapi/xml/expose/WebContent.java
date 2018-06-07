
package org.openestate.is24.restapi.xml.expose;

import java.io.Serializable;
import java.net.URI;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
import org.openestate.is24.restapi.xml.Adapter4;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reportAFraudURL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI"&gt;
 *               &lt;maxLength value="300"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="exposePrintUrl" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI"&gt;
 *               &lt;maxLength value="300"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reportAFraudURL",
    "exposePrintUrl"
})
@XmlRootElement(name = "webContent")
public class WebContent implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected URI reportAFraudURL;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected URI exposePrintUrl;

    /**
     * Gets the value of the reportAFraudURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public URI getReportAFraudURL() {
        return reportAFraudURL;
    }

    /**
     * Sets the value of the reportAFraudURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportAFraudURL(URI value) {
        this.reportAFraudURL = value;
    }

    /**
     * Gets the value of the exposePrintUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public URI getExposePrintUrl() {
        return exposePrintUrl;
    }

    /**
     * Sets the value of the exposePrintUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExposePrintUrl(URI value) {
        this.exposePrintUrl = value;
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
            URI theReportAFraudURL;
            theReportAFraudURL = this.getReportAFraudURL();
            strategy.appendField(locator, this, "reportAFraudURL", buffer, theReportAFraudURL, (this.reportAFraudURL!= null));
        }
        {
            URI theExposePrintUrl;
            theExposePrintUrl = this.getExposePrintUrl();
            strategy.appendField(locator, this, "exposePrintUrl", buffer, theExposePrintUrl, (this.exposePrintUrl!= null));
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
        if (draftCopy instanceof WebContent) {
            final WebContent copy = ((WebContent) draftCopy);
            {
                Boolean reportAFraudURLShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.reportAFraudURL!= null));
                if (reportAFraudURLShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceReportAFraudURL;
                    sourceReportAFraudURL = this.getReportAFraudURL();
                    URI copyReportAFraudURL = ((URI) strategy.copy(LocatorUtils.property(locator, "reportAFraudURL", sourceReportAFraudURL), sourceReportAFraudURL, (this.reportAFraudURL!= null)));
                    copy.setReportAFraudURL(copyReportAFraudURL);
                } else {
                    if (reportAFraudURLShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.reportAFraudURL = null;
                    }
                }
            }
            {
                Boolean exposePrintUrlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.exposePrintUrl!= null));
                if (exposePrintUrlShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceExposePrintUrl;
                    sourceExposePrintUrl = this.getExposePrintUrl();
                    URI copyExposePrintUrl = ((URI) strategy.copy(LocatorUtils.property(locator, "exposePrintUrl", sourceExposePrintUrl), sourceExposePrintUrl, (this.exposePrintUrl!= null)));
                    copy.setExposePrintUrl(copyExposePrintUrl);
                } else {
                    if (exposePrintUrlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.exposePrintUrl = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new WebContent();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final WebContent that = ((WebContent) object);
        {
            URI lhsReportAFraudURL;
            lhsReportAFraudURL = this.getReportAFraudURL();
            URI rhsReportAFraudURL;
            rhsReportAFraudURL = that.getReportAFraudURL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reportAFraudURL", lhsReportAFraudURL), LocatorUtils.property(thatLocator, "reportAFraudURL", rhsReportAFraudURL), lhsReportAFraudURL, rhsReportAFraudURL, (this.reportAFraudURL!= null), (that.reportAFraudURL!= null))) {
                return false;
            }
        }
        {
            URI lhsExposePrintUrl;
            lhsExposePrintUrl = this.getExposePrintUrl();
            URI rhsExposePrintUrl;
            rhsExposePrintUrl = that.getExposePrintUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exposePrintUrl", lhsExposePrintUrl), LocatorUtils.property(thatLocator, "exposePrintUrl", rhsExposePrintUrl), lhsExposePrintUrl, rhsExposePrintUrl, (this.exposePrintUrl!= null), (that.exposePrintUrl!= null))) {
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
