
package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publishChannel" type="{http://rest.immobilienscout24.de/schema/common/1.0}PublishChannel" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "publishChannel"
})
@XmlRootElement(name = "publishChannels")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
public class PublishChannels implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected List<PublishChannel> publishChannel;

    /**
     * Gets the value of the publishChannel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publishChannel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublishChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublishChannel }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public List<PublishChannel> getPublishChannel() {
        if (publishChannel == null) {
            publishChannel = new ArrayList<PublishChannel>();
        }
        return this.publishChannel;
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
            List<PublishChannel> thePublishChannel;
            thePublishChannel = (((this.publishChannel!= null)&&(!this.publishChannel.isEmpty()))?this.getPublishChannel():null);
            strategy.appendField(locator, this, "publishChannel", buffer, thePublishChannel, ((this.publishChannel!= null)&&(!this.publishChannel.isEmpty())));
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
        if (draftCopy instanceof PublishChannels) {
            final PublishChannels copy = ((PublishChannels) draftCopy);
            {
                Boolean publishChannelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.publishChannel!= null)&&(!this.publishChannel.isEmpty())));
                if (publishChannelShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<PublishChannel> sourcePublishChannel;
                    sourcePublishChannel = (((this.publishChannel!= null)&&(!this.publishChannel.isEmpty()))?this.getPublishChannel():null);
                    @SuppressWarnings("unchecked")
                    List<PublishChannel> copyPublishChannel = ((List<PublishChannel> ) strategy.copy(LocatorUtils.property(locator, "publishChannel", sourcePublishChannel), sourcePublishChannel, ((this.publishChannel!= null)&&(!this.publishChannel.isEmpty()))));
                    copy.publishChannel = null;
                    if (copyPublishChannel!= null) {
                        List<PublishChannel> uniquePublishChannell = copy.getPublishChannel();
                        uniquePublishChannell.addAll(copyPublishChannel);
                    }
                } else {
                    if (publishChannelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.publishChannel = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new PublishChannels();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PublishChannels that = ((PublishChannels) object);
        {
            List<PublishChannel> lhsPublishChannel;
            lhsPublishChannel = (((this.publishChannel!= null)&&(!this.publishChannel.isEmpty()))?this.getPublishChannel():null);
            List<PublishChannel> rhsPublishChannel;
            rhsPublishChannel = (((that.publishChannel!= null)&&(!that.publishChannel.isEmpty()))?that.getPublishChannel():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publishChannel", lhsPublishChannel), LocatorUtils.property(thatLocator, "publishChannel", rhsPublishChannel), lhsPublishChannel, rhsPublishChannel, ((this.publishChannel!= null)&&(!this.publishChannel.isEmpty())), ((that.publishChannel!= null)&&(!that.publishChannel.isEmpty())))) {
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
