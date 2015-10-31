
package org.openestate.is24.restapi.xml.videoupload;

import java.net.URL;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
public class VideoUploadTicket
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "anyURI")
    protected URL uploadUrl;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar validUntil;
    @XmlElement(required = true)
    protected String videoId;
    @XmlElement(required = true)
    protected String auth;

    /**
     * Gets the value of the uploadUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public URL getUploadUrl() {
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
    public void setUploadUrl(URL value) {
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
    public void setAuth(String value) {
        this.auth = value;
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
            URL theUploadUrl;
            theUploadUrl = this.getUploadUrl();
            strategy.appendField(locator, this, "uploadUrl", buffer, theUploadUrl);
        }
        {
            Calendar theValidUntil;
            theValidUntil = this.getValidUntil();
            strategy.appendField(locator, this, "validUntil", buffer, theValidUntil);
        }
        {
            String theVideoId;
            theVideoId = this.getVideoId();
            strategy.appendField(locator, this, "videoId", buffer, theVideoId);
        }
        {
            String theAuth;
            theAuth = this.getAuth();
            strategy.appendField(locator, this, "auth", buffer, theAuth);
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
        if (draftCopy instanceof VideoUploadTicket) {
            final VideoUploadTicket copy = ((VideoUploadTicket) draftCopy);
            if (this.uploadUrl!= null) {
                URL sourceUploadUrl;
                sourceUploadUrl = this.getUploadUrl();
                URL copyUploadUrl = ((URL) strategy.copy(LocatorUtils.property(locator, "uploadUrl", sourceUploadUrl), sourceUploadUrl));
                copy.setUploadUrl(copyUploadUrl);
            } else {
                copy.uploadUrl = null;
            }
            if (this.validUntil!= null) {
                Calendar sourceValidUntil;
                sourceValidUntil = this.getValidUntil();
                Calendar copyValidUntil = ((Calendar) strategy.copy(LocatorUtils.property(locator, "validUntil", sourceValidUntil), sourceValidUntil));
                copy.setValidUntil(copyValidUntil);
            } else {
                copy.validUntil = null;
            }
            if (this.videoId!= null) {
                String sourceVideoId;
                sourceVideoId = this.getVideoId();
                String copyVideoId = ((String) strategy.copy(LocatorUtils.property(locator, "videoId", sourceVideoId), sourceVideoId));
                copy.setVideoId(copyVideoId);
            } else {
                copy.videoId = null;
            }
            if (this.auth!= null) {
                String sourceAuth;
                sourceAuth = this.getAuth();
                String copyAuth = ((String) strategy.copy(LocatorUtils.property(locator, "auth", sourceAuth), sourceAuth));
                copy.setAuth(copyAuth);
            } else {
                copy.auth = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new VideoUploadTicket();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof VideoUploadTicket)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VideoUploadTicket that = ((VideoUploadTicket) object);
        {
            URL lhsUploadUrl;
            lhsUploadUrl = this.getUploadUrl();
            URL rhsUploadUrl;
            rhsUploadUrl = that.getUploadUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uploadUrl", lhsUploadUrl), LocatorUtils.property(thatLocator, "uploadUrl", rhsUploadUrl), lhsUploadUrl, rhsUploadUrl)) {
                return false;
            }
        }
        {
            Calendar lhsValidUntil;
            lhsValidUntil = this.getValidUntil();
            Calendar rhsValidUntil;
            rhsValidUntil = that.getValidUntil();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validUntil", lhsValidUntil), LocatorUtils.property(thatLocator, "validUntil", rhsValidUntil), lhsValidUntil, rhsValidUntil)) {
                return false;
            }
        }
        {
            String lhsVideoId;
            lhsVideoId = this.getVideoId();
            String rhsVideoId;
            rhsVideoId = that.getVideoId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "videoId", lhsVideoId), LocatorUtils.property(thatLocator, "videoId", rhsVideoId), lhsVideoId, rhsVideoId)) {
                return false;
            }
        }
        {
            String lhsAuth;
            lhsAuth = this.getAuth();
            String rhsAuth;
            rhsAuth = that.getAuth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "auth", lhsAuth), LocatorUtils.property(thatLocator, "auth", rhsAuth), lhsAuth, rhsAuth)) {
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
