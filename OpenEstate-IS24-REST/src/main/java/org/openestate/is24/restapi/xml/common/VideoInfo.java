
package org.openestate.is24.restapi.xml.common;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
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
import org.openestate.is24.restapi.xml.Adapter4;
import org.openestate.is24.restapi.xml.Adapter5;


/**
 * streaming video urls von screen9
 * 
 * <p>Java class for VideoInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="videoUrlList" type="{http://rest.immobilienscout24.de/schema/common/1.0}videoUrlList" maxOccurs="2"/&gt;
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="teaserUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" minOccurs="0"/&gt;
 *         &lt;element name="processingProgress" type="{http://rest.immobilienscout24.de/schema/common/1.0}percentType" minOccurs="0"/&gt;
 *         &lt;element name="processingStatus" type="{http://rest.immobilienscout24.de/schema/common/1.0}videoProcessingStatusType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoInfo", propOrder = {
    "videoUrlList",
    "duration",
    "teaserUrl",
    "title",
    "processingProgress",
    "processingStatus"
})
public class VideoInfo
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    protected List<VideoUrlList> videoUrlList;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long duration;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "anyURI")
    protected URL teaserUrl;
    protected String title;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer processingProgress;
    @XmlSchemaType(name = "string")
    protected VideoProcessingStatusType processingStatus;

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
     *     {@link String }
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
     *     {@link String }
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

    /**
     * Gets the value of the processingProgress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getProcessingProgress() {
        return processingProgress;
    }

    /**
     * Sets the value of the processingProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingProgress(Integer value) {
        this.processingProgress = value;
    }

    /**
     * Gets the value of the processingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VideoProcessingStatusType }
     *     
     */
    public VideoProcessingStatusType getProcessingStatus() {
        return processingStatus;
    }

    /**
     * Sets the value of the processingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoProcessingStatusType }
     *     
     */
    public void setProcessingStatus(VideoProcessingStatusType value) {
        this.processingStatus = value;
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
            List<VideoUrlList> theVideoUrlList;
            theVideoUrlList = (((this.videoUrlList!= null)&&(!this.videoUrlList.isEmpty()))?this.getVideoUrlList():null);
            strategy.appendField(locator, this, "videoUrlList", buffer, theVideoUrlList);
        }
        {
            Long theDuration;
            theDuration = this.getDuration();
            strategy.appendField(locator, this, "duration", buffer, theDuration);
        }
        {
            URL theTeaserUrl;
            theTeaserUrl = this.getTeaserUrl();
            strategy.appendField(locator, this, "teaserUrl", buffer, theTeaserUrl);
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle);
        }
        {
            Integer theProcessingProgress;
            theProcessingProgress = this.getProcessingProgress();
            strategy.appendField(locator, this, "processingProgress", buffer, theProcessingProgress);
        }
        {
            VideoProcessingStatusType theProcessingStatus;
            theProcessingStatus = this.getProcessingStatus();
            strategy.appendField(locator, this, "processingStatus", buffer, theProcessingStatus);
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
        if (draftCopy instanceof VideoInfo) {
            final VideoInfo copy = ((VideoInfo) draftCopy);
            if ((this.videoUrlList!= null)&&(!this.videoUrlList.isEmpty())) {
                List<VideoUrlList> sourceVideoUrlList;
                sourceVideoUrlList = (((this.videoUrlList!= null)&&(!this.videoUrlList.isEmpty()))?this.getVideoUrlList():null);
                @SuppressWarnings("unchecked")
                List<VideoUrlList> copyVideoUrlList = ((List<VideoUrlList> ) strategy.copy(LocatorUtils.property(locator, "videoUrlList", sourceVideoUrlList), sourceVideoUrlList));
                copy.videoUrlList = null;
                if (copyVideoUrlList!= null) {
                    List<VideoUrlList> uniqueVideoUrlListl = copy.getVideoUrlList();
                    uniqueVideoUrlListl.addAll(copyVideoUrlList);
                }
            } else {
                copy.videoUrlList = null;
            }
            if (this.duration!= null) {
                Long sourceDuration;
                sourceDuration = this.getDuration();
                Long copyDuration = ((Long) strategy.copy(LocatorUtils.property(locator, "duration", sourceDuration), sourceDuration));
                copy.setDuration(copyDuration);
            } else {
                copy.duration = null;
            }
            if (this.teaserUrl!= null) {
                URL sourceTeaserUrl;
                sourceTeaserUrl = this.getTeaserUrl();
                URL copyTeaserUrl = ((URL) strategy.copy(LocatorUtils.property(locator, "teaserUrl", sourceTeaserUrl), sourceTeaserUrl));
                copy.setTeaserUrl(copyTeaserUrl);
            } else {
                copy.teaserUrl = null;
            }
            if (this.title!= null) {
                String sourceTitle;
                sourceTitle = this.getTitle();
                String copyTitle = ((String) strategy.copy(LocatorUtils.property(locator, "title", sourceTitle), sourceTitle));
                copy.setTitle(copyTitle);
            } else {
                copy.title = null;
            }
            if (this.processingProgress!= null) {
                Integer sourceProcessingProgress;
                sourceProcessingProgress = this.getProcessingProgress();
                Integer copyProcessingProgress = ((Integer) strategy.copy(LocatorUtils.property(locator, "processingProgress", sourceProcessingProgress), sourceProcessingProgress));
                copy.setProcessingProgress(copyProcessingProgress);
            } else {
                copy.processingProgress = null;
            }
            if (this.processingStatus!= null) {
                VideoProcessingStatusType sourceProcessingStatus;
                sourceProcessingStatus = this.getProcessingStatus();
                VideoProcessingStatusType copyProcessingStatus = ((VideoProcessingStatusType) strategy.copy(LocatorUtils.property(locator, "processingStatus", sourceProcessingStatus), sourceProcessingStatus));
                copy.setProcessingStatus(copyProcessingStatus);
            } else {
                copy.processingStatus = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new VideoInfo();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof VideoInfo)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VideoInfo that = ((VideoInfo) object);
        {
            List<VideoUrlList> lhsVideoUrlList;
            lhsVideoUrlList = (((this.videoUrlList!= null)&&(!this.videoUrlList.isEmpty()))?this.getVideoUrlList():null);
            List<VideoUrlList> rhsVideoUrlList;
            rhsVideoUrlList = (((that.videoUrlList!= null)&&(!that.videoUrlList.isEmpty()))?that.getVideoUrlList():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "videoUrlList", lhsVideoUrlList), LocatorUtils.property(thatLocator, "videoUrlList", rhsVideoUrlList), lhsVideoUrlList, rhsVideoUrlList)) {
                return false;
            }
        }
        {
            Long lhsDuration;
            lhsDuration = this.getDuration();
            Long rhsDuration;
            rhsDuration = that.getDuration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "duration", lhsDuration), LocatorUtils.property(thatLocator, "duration", rhsDuration), lhsDuration, rhsDuration)) {
                return false;
            }
        }
        {
            URL lhsTeaserUrl;
            lhsTeaserUrl = this.getTeaserUrl();
            URL rhsTeaserUrl;
            rhsTeaserUrl = that.getTeaserUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "teaserUrl", lhsTeaserUrl), LocatorUtils.property(thatLocator, "teaserUrl", rhsTeaserUrl), lhsTeaserUrl, rhsTeaserUrl)) {
                return false;
            }
        }
        {
            String lhsTitle;
            lhsTitle = this.getTitle();
            String rhsTitle;
            rhsTitle = that.getTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "title", lhsTitle), LocatorUtils.property(thatLocator, "title", rhsTitle), lhsTitle, rhsTitle)) {
                return false;
            }
        }
        {
            Integer lhsProcessingProgress;
            lhsProcessingProgress = this.getProcessingProgress();
            Integer rhsProcessingProgress;
            rhsProcessingProgress = that.getProcessingProgress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processingProgress", lhsProcessingProgress), LocatorUtils.property(thatLocator, "processingProgress", rhsProcessingProgress), lhsProcessingProgress, rhsProcessingProgress)) {
                return false;
            }
        }
        {
            VideoProcessingStatusType lhsProcessingStatus;
            lhsProcessingStatus = this.getProcessingStatus();
            VideoProcessingStatusType rhsProcessingStatus;
            rhsProcessingStatus = that.getProcessingStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processingStatus", lhsProcessingStatus), LocatorUtils.property(thatLocator, "processingStatus", rhsProcessingStatus), lhsProcessingStatus, rhsProcessingStatus)) {
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
