
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
 * Ein gestreamtes Video
 * 
 * <p>Java class for StreamingVideo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StreamingVideo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}Attachment"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="videoId" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" minOccurs="0"/&gt;
 *         &lt;element name="videoInfo" type="{http://rest.immobilienscout24.de/schema/common/1.0}VideoInfo" maxOccurs="0" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreamingVideo", propOrder = {
    "videoId"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
public class StreamingVideo
    extends Attachment
    implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected String videoId;

    /**
     * Gets the value of the videoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setVideoId(String value) {
        this.videoId = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            String theVideoId;
            theVideoId = this.getVideoId();
            strategy.appendField(locator, this, "videoId", buffer, theVideoId, (this.videoId!= null));
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
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof StreamingVideo) {
            final StreamingVideo copy = ((StreamingVideo) draftCopy);
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
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new StreamingVideo();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final StreamingVideo that = ((StreamingVideo) object);
        {
            String lhsVideoId;
            lhsVideoId = this.getVideoId();
            String rhsVideoId;
            rhsVideoId = that.getVideoId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "videoId", lhsVideoId), LocatorUtils.property(thatLocator, "videoId", rhsVideoId), lhsVideoId, rhsVideoId, (this.videoId!= null), (that.videoId!= null))) {
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
