
package org.openestate.is24.restapi.xml.expose;

import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="videoUrlList" type="{http://rest.immobilienscout24.de/schema/search/expose/1.0}videoUrlList" maxOccurs="2"/&gt;
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="teaserUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" minOccurs="0"/&gt;
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
    "videoUrlList",
    "duration",
    "teaserUrl",
    "title"
})
@XmlRootElement(name = "video")
public class Video implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    protected List<VideoUrlList> videoUrlList;
    protected Long duration;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "anyURI")
    protected URL teaserUrl;
    protected String title;

    /**
     * Gets the value of the videoUrlList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoUrlList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoUrlList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoUrlList }
     * 
     * 
     */
    public List<VideoUrlList> getVideoUrlList() {
        if (videoUrlList == null) {
            videoUrlList = new ArrayList<VideoUrlList>();
        }
        return this.videoUrlList;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDuration(Long value) {
        this.duration = value;
    }

    /**
     * Gets the value of the teaserUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public URL getTeaserUrl() {
        return teaserUrl;
    }

    /**
     * Sets the value of the teaserUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeaserUrl(URL value) {
        this.teaserUrl = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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
            List<VideoUrlList> theVideoUrlList;
            theVideoUrlList = (((this.videoUrlList!= null)&&(!this.videoUrlList.isEmpty()))?this.getVideoUrlList():null);
            strategy.appendField(locator, this, "videoUrlList", buffer, theVideoUrlList, ((this.videoUrlList!= null)&&(!this.videoUrlList.isEmpty())));
        }
        {
            Long theDuration;
            theDuration = this.getDuration();
            strategy.appendField(locator, this, "duration", buffer, theDuration, (this.duration!= null));
        }
        {
            URL theTeaserUrl;
            theTeaserUrl = this.getTeaserUrl();
            strategy.appendField(locator, this, "teaserUrl", buffer, theTeaserUrl, (this.teaserUrl!= null));
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle, (this.title!= null));
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
        if (draftCopy instanceof Video) {
            final Video copy = ((Video) draftCopy);
            {
                Boolean videoUrlListShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.videoUrlList!= null)&&(!this.videoUrlList.isEmpty())));
                if (videoUrlListShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<VideoUrlList> sourceVideoUrlList;
                    sourceVideoUrlList = (((this.videoUrlList!= null)&&(!this.videoUrlList.isEmpty()))?this.getVideoUrlList():null);
                    @SuppressWarnings("unchecked")
                    List<VideoUrlList> copyVideoUrlList = ((List<VideoUrlList> ) strategy.copy(LocatorUtils.property(locator, "videoUrlList", sourceVideoUrlList), sourceVideoUrlList, ((this.videoUrlList!= null)&&(!this.videoUrlList.isEmpty()))));
                    copy.videoUrlList = null;
                    if (copyVideoUrlList!= null) {
                        List<VideoUrlList> uniqueVideoUrlListl = copy.getVideoUrlList();
                        uniqueVideoUrlListl.addAll(copyVideoUrlList);
                    }
                } else {
                    if (videoUrlListShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.videoUrlList = null;
                    }
                }
            }
            {
                Boolean durationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.duration!= null));
                if (durationShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceDuration;
                    sourceDuration = this.getDuration();
                    Long copyDuration = ((Long) strategy.copy(LocatorUtils.property(locator, "duration", sourceDuration), sourceDuration, (this.duration!= null)));
                    copy.setDuration(copyDuration);
                } else {
                    if (durationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.duration = null;
                    }
                }
            }
            {
                Boolean teaserUrlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.teaserUrl!= null));
                if (teaserUrlShouldBeCopiedAndSet == Boolean.TRUE) {
                    URL sourceTeaserUrl;
                    sourceTeaserUrl = this.getTeaserUrl();
                    URL copyTeaserUrl = ((URL) strategy.copy(LocatorUtils.property(locator, "teaserUrl", sourceTeaserUrl), sourceTeaserUrl, (this.teaserUrl!= null)));
                    copy.setTeaserUrl(copyTeaserUrl);
                } else {
                    if (teaserUrlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.teaserUrl = null;
                    }
                }
            }
            {
                Boolean titleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.title!= null));
                if (titleShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTitle;
                    sourceTitle = this.getTitle();
                    String copyTitle = ((String) strategy.copy(LocatorUtils.property(locator, "title", sourceTitle), sourceTitle, (this.title!= null)));
                    copy.setTitle(copyTitle);
                } else {
                    if (titleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.title = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Video();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Video that = ((Video) object);
        {
            List<VideoUrlList> lhsVideoUrlList;
            lhsVideoUrlList = (((this.videoUrlList!= null)&&(!this.videoUrlList.isEmpty()))?this.getVideoUrlList():null);
            List<VideoUrlList> rhsVideoUrlList;
            rhsVideoUrlList = (((that.videoUrlList!= null)&&(!that.videoUrlList.isEmpty()))?that.getVideoUrlList():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "videoUrlList", lhsVideoUrlList), LocatorUtils.property(thatLocator, "videoUrlList", rhsVideoUrlList), lhsVideoUrlList, rhsVideoUrlList, ((this.videoUrlList!= null)&&(!this.videoUrlList.isEmpty())), ((that.videoUrlList!= null)&&(!that.videoUrlList.isEmpty())))) {
                return false;
            }
        }
        {
            Long lhsDuration;
            lhsDuration = this.getDuration();
            Long rhsDuration;
            rhsDuration = that.getDuration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "duration", lhsDuration), LocatorUtils.property(thatLocator, "duration", rhsDuration), lhsDuration, rhsDuration, (this.duration!= null), (that.duration!= null))) {
                return false;
            }
        }
        {
            URL lhsTeaserUrl;
            lhsTeaserUrl = this.getTeaserUrl();
            URL rhsTeaserUrl;
            rhsTeaserUrl = that.getTeaserUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "teaserUrl", lhsTeaserUrl), LocatorUtils.property(thatLocator, "teaserUrl", rhsTeaserUrl), lhsTeaserUrl, rhsTeaserUrl, (this.teaserUrl!= null), (that.teaserUrl!= null))) {
                return false;
            }
        }
        {
            String lhsTitle;
            lhsTitle = this.getTitle();
            String rhsTitle;
            rhsTitle = that.getTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "title", lhsTitle), LocatorUtils.property(thatLocator, "title", rhsTitle), lhsTitle, rhsTitle, (this.title!= null), (that.title!= null))) {
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
