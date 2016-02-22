
package org.openestate.is24.restapi.xml.common;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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


/**
 * Objekt das den Zusammenhang zwischen einer Immobilie und einem
 *         Ver\u00f6ffentlichungskanal beschreibt.
 *       
 * 
 * <p>Java class for PublishObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublishObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="realEstate"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *                 &lt;attribute name="title" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" /&gt;
 *                 &lt;attribute name="firstActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="publishChannel" type="{http://rest.immobilienscout24.de/schema/common/1.0}PublishChannel"/&gt;
 *         &lt;element name="messageCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="0" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="0" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishObject", propOrder = {
    "realEstate",
    "publishChannel"
})
public class PublishObject implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    protected PublishObject.RealEstate realEstate;
    @XmlElement(required = true)
    protected PublishChannel publishChannel;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the realEstate property.
     * 
     * @return
     *     possible object is
     *     {@link PublishObject.RealEstate }
     *     
     */
    public PublishObject.RealEstate getRealEstate() {
        return realEstate;
    }

    /**
     * Sets the value of the realEstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublishObject.RealEstate }
     *     
     */
    public void setRealEstate(PublishObject.RealEstate value) {
        this.realEstate = value;
    }

    /**
     * Gets the value of the publishChannel property.
     * 
     * @return
     *     possible object is
     *     {@link PublishChannel }
     *     
     */
    public PublishChannel getPublishChannel() {
        return publishChannel;
    }

    /**
     * Sets the value of the publishChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublishChannel }
     *     
     */
    public void setPublishChannel(PublishChannel value) {
        this.publishChannel = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
            PublishObject.RealEstate theRealEstate;
            theRealEstate = this.getRealEstate();
            strategy.appendField(locator, this, "realEstate", buffer, theRealEstate, (this.realEstate!= null));
        }
        {
            PublishChannel thePublishChannel;
            thePublishChannel = this.getPublishChannel();
            strategy.appendField(locator, this, "publishChannel", buffer, thePublishChannel, (this.publishChannel!= null));
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
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
        if (draftCopy instanceof PublishObject) {
            final PublishObject copy = ((PublishObject) draftCopy);
            {
                Boolean realEstateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.realEstate!= null));
                if (realEstateShouldBeCopiedAndSet == Boolean.TRUE) {
                    PublishObject.RealEstate sourceRealEstate;
                    sourceRealEstate = this.getRealEstate();
                    PublishObject.RealEstate copyRealEstate = ((PublishObject.RealEstate) strategy.copy(LocatorUtils.property(locator, "realEstate", sourceRealEstate), sourceRealEstate, (this.realEstate!= null)));
                    copy.setRealEstate(copyRealEstate);
                } else {
                    if (realEstateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realEstate = null;
                    }
                }
            }
            {
                Boolean publishChannelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.publishChannel!= null));
                if (publishChannelShouldBeCopiedAndSet == Boolean.TRUE) {
                    PublishChannel sourcePublishChannel;
                    sourcePublishChannel = this.getPublishChannel();
                    PublishChannel copyPublishChannel = ((PublishChannel) strategy.copy(LocatorUtils.property(locator, "publishChannel", sourcePublishChannel), sourcePublishChannel, (this.publishChannel!= null)));
                    copy.setPublishChannel(copyPublishChannel);
                } else {
                    if (publishChannelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.publishChannel = null;
                    }
                }
            }
            {
                Boolean idShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.id!= null));
                if (idShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceId;
                    sourceId = this.getId();
                    String copyId = ((String) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId, (this.id!= null)));
                    copy.setId(copyId);
                } else {
                    if (idShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.id = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new PublishObject();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PublishObject that = ((PublishObject) object);
        {
            PublishObject.RealEstate lhsRealEstate;
            lhsRealEstate = this.getRealEstate();
            PublishObject.RealEstate rhsRealEstate;
            rhsRealEstate = that.getRealEstate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realEstate", lhsRealEstate), LocatorUtils.property(thatLocator, "realEstate", rhsRealEstate), lhsRealEstate, rhsRealEstate, (this.realEstate!= null), (that.realEstate!= null))) {
                return false;
            }
        }
        {
            PublishChannel lhsPublishChannel;
            lhsPublishChannel = this.getPublishChannel();
            PublishChannel rhsPublishChannel;
            rhsPublishChannel = that.getPublishChannel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publishChannel", lhsPublishChannel), LocatorUtils.property(thatLocator, "publishChannel", rhsPublishChannel), lhsPublishChannel, rhsPublishChannel, (this.publishChannel!= null), (that.publishChannel!= null))) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId, (this.id!= null), (that.id!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * Verweis auf eine Immobilie.
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
     *       &lt;attribute name="title" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" /&gt;
     *       &lt;attribute name="firstActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RealEstate implements Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlAttribute(name = "id")
        protected Long id;
        @XmlAttribute(name = "title")
        protected String title;
        @XmlAttribute(name = "firstActivationDate")
        @XmlJavaTypeAdapter(Adapter2 .class)
        @XmlSchemaType(name = "dateTime")
        protected Calendar firstActivationDate;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setId(Long value) {
            this.id = value;
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
         * Gets the value of the firstActivationDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Calendar getFirstActivationDate() {
            return firstActivationDate;
        }

        /**
         * Sets the value of the firstActivationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstActivationDate(Calendar value) {
            this.firstActivationDate = value;
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
                Long theId;
                theId = this.getId();
                strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
            }
            {
                String theTitle;
                theTitle = this.getTitle();
                strategy.appendField(locator, this, "title", buffer, theTitle, (this.title!= null));
            }
            {
                Calendar theFirstActivationDate;
                theFirstActivationDate = this.getFirstActivationDate();
                strategy.appendField(locator, this, "firstActivationDate", buffer, theFirstActivationDate, (this.firstActivationDate!= null));
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
            if (draftCopy instanceof PublishObject.RealEstate) {
                final PublishObject.RealEstate copy = ((PublishObject.RealEstate) draftCopy);
                {
                    Boolean idShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.id!= null));
                    if (idShouldBeCopiedAndSet == Boolean.TRUE) {
                        Long sourceId;
                        sourceId = this.getId();
                        Long copyId = ((Long) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId, (this.id!= null)));
                        copy.setId(copyId);
                    } else {
                        if (idShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.id = null;
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
                {
                    Boolean firstActivationDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.firstActivationDate!= null));
                    if (firstActivationDateShouldBeCopiedAndSet == Boolean.TRUE) {
                        Calendar sourceFirstActivationDate;
                        sourceFirstActivationDate = this.getFirstActivationDate();
                        Calendar copyFirstActivationDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "firstActivationDate", sourceFirstActivationDate), sourceFirstActivationDate, (this.firstActivationDate!= null)));
                        copy.setFirstActivationDate(copyFirstActivationDate);
                    } else {
                        if (firstActivationDateShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.firstActivationDate = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new PublishObject.RealEstate();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final PublishObject.RealEstate that = ((PublishObject.RealEstate) object);
            {
                Long lhsId;
                lhsId = this.getId();
                Long rhsId;
                rhsId = that.getId();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId, (this.id!= null), (that.id!= null))) {
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
            {
                Calendar lhsFirstActivationDate;
                lhsFirstActivationDate = this.getFirstActivationDate();
                Calendar rhsFirstActivationDate;
                rhsFirstActivationDate = that.getFirstActivationDate();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "firstActivationDate", lhsFirstActivationDate), LocatorUtils.property(thatLocator, "firstActivationDate", rhsFirstActivationDate), lhsFirstActivationDate, rhsFirstActivationDate, (this.firstActivationDate!= null), (that.firstActivationDate!= null))) {
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

}
