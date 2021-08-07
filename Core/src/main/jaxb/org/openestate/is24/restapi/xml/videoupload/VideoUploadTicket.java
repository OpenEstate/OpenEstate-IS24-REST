
package org.openestate.is24.restapi.xml.videoupload;

import java.io.Serializable;
import java.net.URI;
import java.util.Calendar;
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
import org.openestate.is24.restapi.xml.Adapter2;
import org.openestate.is24.restapi.xml.Adapter4;


/**
 * <p>Java class for VideoUploadTicket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoUploadTicket"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="uploadUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="validUntil" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="videoId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="auth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoUploadTicket", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
public class VideoUploadTicket implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected URI uploadUrl;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected Calendar validUntil;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected String videoId;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected String auth;

    /**
     * Gets the value of the uploadUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public URI getUploadUrl() {
        return uploadUrl;
    }

    /**
     * Sets the value of the uploadUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setUploadUrl(URI value) {
        this.uploadUrl = value;
    }

    /**
     * Gets the value of the validUntil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Calendar getValidUntil() {
        return validUntil;
    }

    /**
     * Sets the value of the validUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setValidUntil(Calendar value) {
        this.validUntil = value;
    }

    /**
     * Gets the value of the videoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public String getVideoId() {
        return videoId;
    }

    /**
     * Sets the value of the videoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setVideoId(String value) {
        this.videoId = value;
    }

    /**
     * Gets the value of the auth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public String getAuth() {
        return auth;
    }

    /**
     * Sets the value of the auth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setAuth(String value) {
        this.auth = value;
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
            URI theUploadUrl;
            theUploadUrl = this.getUploadUrl();
            strategy.appendField(locator, this, "uploadUrl", buffer, theUploadUrl, (this.uploadUrl!= null));
        }
        {
            Calendar theValidUntil;
            theValidUntil = this.getValidUntil();
            strategy.appendField(locator, this, "validUntil", buffer, theValidUntil, (this.validUntil!= null));
        }
        {
            String theVideoId;
            theVideoId = this.getVideoId();
            strategy.appendField(locator, this, "videoId", buffer, theVideoId, (this.videoId!= null));
        }
        {
            String theAuth;
            theAuth = this.getAuth();
            strategy.appendField(locator, this, "auth", buffer, theAuth, (this.auth!= null));
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
        if (draftCopy instanceof VideoUploadTicket) {
            final VideoUploadTicket copy = ((VideoUploadTicket) draftCopy);
            {
                Boolean uploadUrlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.uploadUrl!= null));
                if (uploadUrlShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceUploadUrl;
                    sourceUploadUrl = this.getUploadUrl();
                    URI copyUploadUrl = ((URI) strategy.copy(LocatorUtils.property(locator, "uploadUrl", sourceUploadUrl), sourceUploadUrl, (this.uploadUrl!= null)));
                    copy.setUploadUrl(copyUploadUrl);
                } else {
                    if (uploadUrlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.uploadUrl = null;
                    }
                }
            }
            {
                Boolean validUntilShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.validUntil!= null));
                if (validUntilShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceValidUntil;
                    sourceValidUntil = this.getValidUntil();
                    Calendar copyValidUntil = ((Calendar) strategy.copy(LocatorUtils.property(locator, "validUntil", sourceValidUntil), sourceValidUntil, (this.validUntil!= null)));
                    copy.setValidUntil(copyValidUntil);
                } else {
                    if (validUntilShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.validUntil = null;
                    }
                }
            }
            {
                Boolean videoIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.videoId!= null));
                if (videoIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVideoId;
                    sourceVideoId = this.getVideoId();
                    String copyVideoId = ((String) strategy.copy(LocatorUtils.property(locator, "videoId", sourceVideoId), sourceVideoId, (this.videoId!= null)));
                    copy.setVideoId(copyVideoId);
                } else {
                    if (videoIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.videoId = null;
                    }
                }
            }
            {
                Boolean authShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.auth!= null));
                if (authShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAuth;
                    sourceAuth = this.getAuth();
                    String copyAuth = ((String) strategy.copy(LocatorUtils.property(locator, "auth", sourceAuth), sourceAuth, (this.auth!= null)));
                    copy.setAuth(copyAuth);
                } else {
                    if (authShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.auth = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new VideoUploadTicket();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VideoUploadTicket that = ((VideoUploadTicket) object);
        {
            URI lhsUploadUrl;
            lhsUploadUrl = this.getUploadUrl();
            URI rhsUploadUrl;
            rhsUploadUrl = that.getUploadUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uploadUrl", lhsUploadUrl), LocatorUtils.property(thatLocator, "uploadUrl", rhsUploadUrl), lhsUploadUrl, rhsUploadUrl, (this.uploadUrl!= null), (that.uploadUrl!= null))) {
                return false;
            }
        }
        {
            Calendar lhsValidUntil;
            lhsValidUntil = this.getValidUntil();
            Calendar rhsValidUntil;
            rhsValidUntil = that.getValidUntil();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validUntil", lhsValidUntil), LocatorUtils.property(thatLocator, "validUntil", rhsValidUntil), lhsValidUntil, rhsValidUntil, (this.validUntil!= null), (that.validUntil!= null))) {
                return false;
            }
        }
        {
            String lhsVideoId;
            lhsVideoId = this.getVideoId();
            String rhsVideoId;
            rhsVideoId = that.getVideoId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "videoId", lhsVideoId), LocatorUtils.property(thatLocator, "videoId", rhsVideoId), lhsVideoId, rhsVideoId, (this.videoId!= null), (that.videoId!= null))) {
                return false;
            }
        }
        {
            String lhsAuth;
            lhsAuth = this.getAuth();
            String rhsAuth;
            rhsAuth = that.getAuth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "auth", lhsAuth), LocatorUtils.property(thatLocator, "auth", rhsAuth), lhsAuth, rhsAuth, (this.auth!= null), (that.auth!= null))) {
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
