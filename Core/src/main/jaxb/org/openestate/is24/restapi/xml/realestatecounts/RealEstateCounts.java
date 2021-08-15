
package org.openestate.is24.restapi.xml.realestatecounts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 *         &lt;element name="is24publishedRealEstatesCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="is24notPublishedRealEstatesCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="homepagePublishedRealEstatesCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="marketPlacePublishedRealEstatesCount" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;long"&gt;
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
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
    "is24PublishedRealEstatesCount",
    "is24NotPublishedRealEstatesCount",
    "homepagePublishedRealEstatesCount",
    "marketPlacePublishedRealEstatesCount"
})
@XmlRootElement(name = "realEstateCounts")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
public class RealEstateCounts implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "is24publishedRealEstatesCount")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected long is24PublishedRealEstatesCount;
    @XmlElement(name = "is24notPublishedRealEstatesCount")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected long is24NotPublishedRealEstatesCount;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected Long homepagePublishedRealEstatesCount;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected List<RealEstateCounts.MarketPlacePublishedRealEstatesCount> marketPlacePublishedRealEstatesCount;

    /**
     * Gets the value of the is24PublishedRealEstatesCount property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public long getIs24PublishedRealEstatesCount() {
        return is24PublishedRealEstatesCount;
    }

    /**
     * Sets the value of the is24PublishedRealEstatesCount property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setIs24PublishedRealEstatesCount(long value) {
        this.is24PublishedRealEstatesCount = value;
    }

    /**
     * Gets the value of the is24NotPublishedRealEstatesCount property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public long getIs24NotPublishedRealEstatesCount() {
        return is24NotPublishedRealEstatesCount;
    }

    /**
     * Sets the value of the is24NotPublishedRealEstatesCount property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setIs24NotPublishedRealEstatesCount(long value) {
        this.is24NotPublishedRealEstatesCount = value;
    }

    /**
     * Gets the value of the homepagePublishedRealEstatesCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public Long getHomepagePublishedRealEstatesCount() {
        return homepagePublishedRealEstatesCount;
    }

    /**
     * Sets the value of the homepagePublishedRealEstatesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setHomepagePublishedRealEstatesCount(Long value) {
        this.homepagePublishedRealEstatesCount = value;
    }

    /**
     * Gets the value of the marketPlacePublishedRealEstatesCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketPlacePublishedRealEstatesCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketPlacePublishedRealEstatesCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RealEstateCounts.MarketPlacePublishedRealEstatesCount }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public List<RealEstateCounts.MarketPlacePublishedRealEstatesCount> getMarketPlacePublishedRealEstatesCount() {
        if (marketPlacePublishedRealEstatesCount == null) {
            marketPlacePublishedRealEstatesCount = new ArrayList<RealEstateCounts.MarketPlacePublishedRealEstatesCount>();
        }
        return this.marketPlacePublishedRealEstatesCount;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            long theIs24PublishedRealEstatesCount;
            theIs24PublishedRealEstatesCount = this.getIs24PublishedRealEstatesCount();
            strategy.appendField(locator, this, "is24PublishedRealEstatesCount", buffer, theIs24PublishedRealEstatesCount, true);
        }
        {
            long theIs24NotPublishedRealEstatesCount;
            theIs24NotPublishedRealEstatesCount = this.getIs24NotPublishedRealEstatesCount();
            strategy.appendField(locator, this, "is24NotPublishedRealEstatesCount", buffer, theIs24NotPublishedRealEstatesCount, true);
        }
        {
            Long theHomepagePublishedRealEstatesCount;
            theHomepagePublishedRealEstatesCount = this.getHomepagePublishedRealEstatesCount();
            strategy.appendField(locator, this, "homepagePublishedRealEstatesCount", buffer, theHomepagePublishedRealEstatesCount, (this.homepagePublishedRealEstatesCount!= null));
        }
        {
            List<RealEstateCounts.MarketPlacePublishedRealEstatesCount> theMarketPlacePublishedRealEstatesCount;
            theMarketPlacePublishedRealEstatesCount = (((this.marketPlacePublishedRealEstatesCount!= null)&&(!this.marketPlacePublishedRealEstatesCount.isEmpty()))?this.getMarketPlacePublishedRealEstatesCount():null);
            strategy.appendField(locator, this, "marketPlacePublishedRealEstatesCount", buffer, theMarketPlacePublishedRealEstatesCount, ((this.marketPlacePublishedRealEstatesCount!= null)&&(!this.marketPlacePublishedRealEstatesCount.isEmpty())));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof RealEstateCounts) {
            final RealEstateCounts copy = ((RealEstateCounts) draftCopy);
            {
                Boolean is24PublishedRealEstatesCountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (is24PublishedRealEstatesCountShouldBeCopiedAndSet == Boolean.TRUE) {
                    long sourceIs24PublishedRealEstatesCount;
                    sourceIs24PublishedRealEstatesCount = this.getIs24PublishedRealEstatesCount();
                    long copyIs24PublishedRealEstatesCount = strategy.copy(LocatorUtils.property(locator, "is24PublishedRealEstatesCount", sourceIs24PublishedRealEstatesCount), sourceIs24PublishedRealEstatesCount, true);
                    copy.setIs24PublishedRealEstatesCount(copyIs24PublishedRealEstatesCount);
                } else {
                    if (is24PublishedRealEstatesCountShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean is24NotPublishedRealEstatesCountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (is24NotPublishedRealEstatesCountShouldBeCopiedAndSet == Boolean.TRUE) {
                    long sourceIs24NotPublishedRealEstatesCount;
                    sourceIs24NotPublishedRealEstatesCount = this.getIs24NotPublishedRealEstatesCount();
                    long copyIs24NotPublishedRealEstatesCount = strategy.copy(LocatorUtils.property(locator, "is24NotPublishedRealEstatesCount", sourceIs24NotPublishedRealEstatesCount), sourceIs24NotPublishedRealEstatesCount, true);
                    copy.setIs24NotPublishedRealEstatesCount(copyIs24NotPublishedRealEstatesCount);
                } else {
                    if (is24NotPublishedRealEstatesCountShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean homepagePublishedRealEstatesCountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.homepagePublishedRealEstatesCount!= null));
                if (homepagePublishedRealEstatesCountShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceHomepagePublishedRealEstatesCount;
                    sourceHomepagePublishedRealEstatesCount = this.getHomepagePublishedRealEstatesCount();
                    Long copyHomepagePublishedRealEstatesCount = ((Long) strategy.copy(LocatorUtils.property(locator, "homepagePublishedRealEstatesCount", sourceHomepagePublishedRealEstatesCount), sourceHomepagePublishedRealEstatesCount, (this.homepagePublishedRealEstatesCount!= null)));
                    copy.setHomepagePublishedRealEstatesCount(copyHomepagePublishedRealEstatesCount);
                } else {
                    if (homepagePublishedRealEstatesCountShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.homepagePublishedRealEstatesCount = null;
                    }
                }
            }
            {
                Boolean marketPlacePublishedRealEstatesCountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.marketPlacePublishedRealEstatesCount!= null)&&(!this.marketPlacePublishedRealEstatesCount.isEmpty())));
                if (marketPlacePublishedRealEstatesCountShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<RealEstateCounts.MarketPlacePublishedRealEstatesCount> sourceMarketPlacePublishedRealEstatesCount;
                    sourceMarketPlacePublishedRealEstatesCount = (((this.marketPlacePublishedRealEstatesCount!= null)&&(!this.marketPlacePublishedRealEstatesCount.isEmpty()))?this.getMarketPlacePublishedRealEstatesCount():null);
                    @SuppressWarnings("unchecked")
                    List<RealEstateCounts.MarketPlacePublishedRealEstatesCount> copyMarketPlacePublishedRealEstatesCount = ((List<RealEstateCounts.MarketPlacePublishedRealEstatesCount> ) strategy.copy(LocatorUtils.property(locator, "marketPlacePublishedRealEstatesCount", sourceMarketPlacePublishedRealEstatesCount), sourceMarketPlacePublishedRealEstatesCount, ((this.marketPlacePublishedRealEstatesCount!= null)&&(!this.marketPlacePublishedRealEstatesCount.isEmpty()))));
                    copy.marketPlacePublishedRealEstatesCount = null;
                    if (copyMarketPlacePublishedRealEstatesCount!= null) {
                        List<RealEstateCounts.MarketPlacePublishedRealEstatesCount> uniqueMarketPlacePublishedRealEstatesCountl = copy.getMarketPlacePublishedRealEstatesCount();
                        uniqueMarketPlacePublishedRealEstatesCountl.addAll(copyMarketPlacePublishedRealEstatesCount);
                    }
                } else {
                    if (marketPlacePublishedRealEstatesCountShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.marketPlacePublishedRealEstatesCount = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new RealEstateCounts();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RealEstateCounts that = ((RealEstateCounts) object);
        {
            long lhsIs24PublishedRealEstatesCount;
            lhsIs24PublishedRealEstatesCount = this.getIs24PublishedRealEstatesCount();
            long rhsIs24PublishedRealEstatesCount;
            rhsIs24PublishedRealEstatesCount = that.getIs24PublishedRealEstatesCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "is24PublishedRealEstatesCount", lhsIs24PublishedRealEstatesCount), LocatorUtils.property(thatLocator, "is24PublishedRealEstatesCount", rhsIs24PublishedRealEstatesCount), lhsIs24PublishedRealEstatesCount, rhsIs24PublishedRealEstatesCount, true, true)) {
                return false;
            }
        }
        {
            long lhsIs24NotPublishedRealEstatesCount;
            lhsIs24NotPublishedRealEstatesCount = this.getIs24NotPublishedRealEstatesCount();
            long rhsIs24NotPublishedRealEstatesCount;
            rhsIs24NotPublishedRealEstatesCount = that.getIs24NotPublishedRealEstatesCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "is24NotPublishedRealEstatesCount", lhsIs24NotPublishedRealEstatesCount), LocatorUtils.property(thatLocator, "is24NotPublishedRealEstatesCount", rhsIs24NotPublishedRealEstatesCount), lhsIs24NotPublishedRealEstatesCount, rhsIs24NotPublishedRealEstatesCount, true, true)) {
                return false;
            }
        }
        {
            Long lhsHomepagePublishedRealEstatesCount;
            lhsHomepagePublishedRealEstatesCount = this.getHomepagePublishedRealEstatesCount();
            Long rhsHomepagePublishedRealEstatesCount;
            rhsHomepagePublishedRealEstatesCount = that.getHomepagePublishedRealEstatesCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "homepagePublishedRealEstatesCount", lhsHomepagePublishedRealEstatesCount), LocatorUtils.property(thatLocator, "homepagePublishedRealEstatesCount", rhsHomepagePublishedRealEstatesCount), lhsHomepagePublishedRealEstatesCount, rhsHomepagePublishedRealEstatesCount, (this.homepagePublishedRealEstatesCount!= null), (that.homepagePublishedRealEstatesCount!= null))) {
                return false;
            }
        }
        {
            List<RealEstateCounts.MarketPlacePublishedRealEstatesCount> lhsMarketPlacePublishedRealEstatesCount;
            lhsMarketPlacePublishedRealEstatesCount = (((this.marketPlacePublishedRealEstatesCount!= null)&&(!this.marketPlacePublishedRealEstatesCount.isEmpty()))?this.getMarketPlacePublishedRealEstatesCount():null);
            List<RealEstateCounts.MarketPlacePublishedRealEstatesCount> rhsMarketPlacePublishedRealEstatesCount;
            rhsMarketPlacePublishedRealEstatesCount = (((that.marketPlacePublishedRealEstatesCount!= null)&&(!that.marketPlacePublishedRealEstatesCount.isEmpty()))?that.getMarketPlacePublishedRealEstatesCount():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "marketPlacePublishedRealEstatesCount", lhsMarketPlacePublishedRealEstatesCount), LocatorUtils.property(thatLocator, "marketPlacePublishedRealEstatesCount", rhsMarketPlacePublishedRealEstatesCount), lhsMarketPlacePublishedRealEstatesCount, rhsMarketPlacePublishedRealEstatesCount, ((this.marketPlacePublishedRealEstatesCount!= null)&&(!this.marketPlacePublishedRealEstatesCount.isEmpty())), ((that.marketPlacePublishedRealEstatesCount!= null)&&(!that.marketPlacePublishedRealEstatesCount.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;long"&gt;
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public static class MarketPlacePublishedRealEstatesCount implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlValue
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
        protected long value;
        @XmlAttribute(name = "name", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
        protected String name;

        /**
         * Gets the value of the value property.
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
        public long getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
        public void setValue(long value) {
            this.value = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
        public void setName(String value) {
            this.name = value;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
        public String toString() {
            final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            {
                long theValue;
                theValue = this.getValue();
                strategy.appendField(locator, this, "value", buffer, theValue, true);
            }
            {
                String theName;
                theName = this.getName();
                strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
            }
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
        public Object clone() {
            return copyTo(createNewInstance());
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
        public Object copyTo(Object target) {
            final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
            return copyTo(null, target, strategy);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            if (draftCopy instanceof RealEstateCounts.MarketPlacePublishedRealEstatesCount) {
                final RealEstateCounts.MarketPlacePublishedRealEstatesCount copy = ((RealEstateCounts.MarketPlacePublishedRealEstatesCount) draftCopy);
                {
                    Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                    if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                        long sourceValue;
                        sourceValue = this.getValue();
                        long copyValue = strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, true);
                        copy.setValue(copyValue);
                    } else {
                        if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                        }
                    }
                }
                {
                    Boolean nameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.name!= null));
                    if (nameShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceName;
                        sourceName = this.getName();
                        String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName, (this.name!= null)));
                        copy.setName(copyName);
                    } else {
                        if (nameShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.name = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
        public Object createNewInstance() {
            return new RealEstateCounts.MarketPlacePublishedRealEstatesCount();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final RealEstateCounts.MarketPlacePublishedRealEstatesCount that = ((RealEstateCounts.MarketPlacePublishedRealEstatesCount) object);
            {
                long lhsValue;
                lhsValue = this.getValue();
                long rhsValue;
                rhsValue = that.getValue();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, true, true)) {
                    return false;
                }
            }
            {
                String lhsName;
                lhsName = this.getName();
                String rhsName;
                rhsName = that.getName();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                    return false;
                }
            }
            return true;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
        public boolean equals(Object object) {
            final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
            return equals(null, null, object, strategy);
        }

    }

}
