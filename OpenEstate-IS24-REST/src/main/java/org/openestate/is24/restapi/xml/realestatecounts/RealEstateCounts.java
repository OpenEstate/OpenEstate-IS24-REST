
package org.openestate.is24.restapi.xml.realestatecounts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
public class RealEstateCounts
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "is24publishedRealEstatesCount")
    protected long is24PublishedRealEstatesCount;
    @XmlElement(name = "is24notPublishedRealEstatesCount")
    protected long is24NotPublishedRealEstatesCount;
    protected Long homepagePublishedRealEstatesCount;
    protected List<RealEstateCounts.MarketPlacePublishedRealEstatesCount> marketPlacePublishedRealEstatesCount;

    /**
     * Gets the value of the is24PublishedRealEstatesCount property.
     * 
     */
    public long getIs24PublishedRealEstatesCount() {
        return is24PublishedRealEstatesCount;
    }

    /**
     * Sets the value of the is24PublishedRealEstatesCount property.
     * 
     */
    public void setIs24PublishedRealEstatesCount(long value) {
        this.is24PublishedRealEstatesCount = value;
    }

    /**
     * Gets the value of the is24NotPublishedRealEstatesCount property.
     * 
     */
    public long getIs24NotPublishedRealEstatesCount() {
        return is24NotPublishedRealEstatesCount;
    }

    /**
     * Sets the value of the is24NotPublishedRealEstatesCount property.
     * 
     */
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
    public List<RealEstateCounts.MarketPlacePublishedRealEstatesCount> getMarketPlacePublishedRealEstatesCount() {
        if (marketPlacePublishedRealEstatesCount == null) {
            marketPlacePublishedRealEstatesCount = new ArrayList<RealEstateCounts.MarketPlacePublishedRealEstatesCount>();
        }
        return this.marketPlacePublishedRealEstatesCount;
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
            long theIs24PublishedRealEstatesCount;
            theIs24PublishedRealEstatesCount = this.getIs24PublishedRealEstatesCount();
            strategy.appendField(locator, this, "is24PublishedRealEstatesCount", buffer, theIs24PublishedRealEstatesCount);
        }
        {
            long theIs24NotPublishedRealEstatesCount;
            theIs24NotPublishedRealEstatesCount = this.getIs24NotPublishedRealEstatesCount();
            strategy.appendField(locator, this, "is24NotPublishedRealEstatesCount", buffer, theIs24NotPublishedRealEstatesCount);
        }
        {
            Long theHomepagePublishedRealEstatesCount;
            theHomepagePublishedRealEstatesCount = this.getHomepagePublishedRealEstatesCount();
            strategy.appendField(locator, this, "homepagePublishedRealEstatesCount", buffer, theHomepagePublishedRealEstatesCount);
        }
        {
            List<RealEstateCounts.MarketPlacePublishedRealEstatesCount> theMarketPlacePublishedRealEstatesCount;
            theMarketPlacePublishedRealEstatesCount = (((this.marketPlacePublishedRealEstatesCount!= null)&&(!this.marketPlacePublishedRealEstatesCount.isEmpty()))?this.getMarketPlacePublishedRealEstatesCount():null);
            strategy.appendField(locator, this, "marketPlacePublishedRealEstatesCount", buffer, theMarketPlacePublishedRealEstatesCount);
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
        if (draftCopy instanceof RealEstateCounts) {
            final RealEstateCounts copy = ((RealEstateCounts) draftCopy);
            {
                long sourceIs24PublishedRealEstatesCount;
                sourceIs24PublishedRealEstatesCount = this.getIs24PublishedRealEstatesCount();
                long copyIs24PublishedRealEstatesCount = strategy.copy(LocatorUtils.property(locator, "is24PublishedRealEstatesCount", sourceIs24PublishedRealEstatesCount), sourceIs24PublishedRealEstatesCount);
                copy.setIs24PublishedRealEstatesCount(copyIs24PublishedRealEstatesCount);
            }
            {
                long sourceIs24NotPublishedRealEstatesCount;
                sourceIs24NotPublishedRealEstatesCount = this.getIs24NotPublishedRealEstatesCount();
                long copyIs24NotPublishedRealEstatesCount = strategy.copy(LocatorUtils.property(locator, "is24NotPublishedRealEstatesCount", sourceIs24NotPublishedRealEstatesCount), sourceIs24NotPublishedRealEstatesCount);
                copy.setIs24NotPublishedRealEstatesCount(copyIs24NotPublishedRealEstatesCount);
            }
            if (this.homepagePublishedRealEstatesCount!= null) {
                Long sourceHomepagePublishedRealEstatesCount;
                sourceHomepagePublishedRealEstatesCount = this.getHomepagePublishedRealEstatesCount();
                Long copyHomepagePublishedRealEstatesCount = ((Long) strategy.copy(LocatorUtils.property(locator, "homepagePublishedRealEstatesCount", sourceHomepagePublishedRealEstatesCount), sourceHomepagePublishedRealEstatesCount));
                copy.setHomepagePublishedRealEstatesCount(copyHomepagePublishedRealEstatesCount);
            } else {
                copy.homepagePublishedRealEstatesCount = null;
            }
            if ((this.marketPlacePublishedRealEstatesCount!= null)&&(!this.marketPlacePublishedRealEstatesCount.isEmpty())) {
                List<RealEstateCounts.MarketPlacePublishedRealEstatesCount> sourceMarketPlacePublishedRealEstatesCount;
                sourceMarketPlacePublishedRealEstatesCount = (((this.marketPlacePublishedRealEstatesCount!= null)&&(!this.marketPlacePublishedRealEstatesCount.isEmpty()))?this.getMarketPlacePublishedRealEstatesCount():null);
                @SuppressWarnings("unchecked")
                List<RealEstateCounts.MarketPlacePublishedRealEstatesCount> copyMarketPlacePublishedRealEstatesCount = ((List<RealEstateCounts.MarketPlacePublishedRealEstatesCount> ) strategy.copy(LocatorUtils.property(locator, "marketPlacePublishedRealEstatesCount", sourceMarketPlacePublishedRealEstatesCount), sourceMarketPlacePublishedRealEstatesCount));
                copy.marketPlacePublishedRealEstatesCount = null;
                if (copyMarketPlacePublishedRealEstatesCount!= null) {
                    List<RealEstateCounts.MarketPlacePublishedRealEstatesCount> uniqueMarketPlacePublishedRealEstatesCountl = copy.getMarketPlacePublishedRealEstatesCount();
                    uniqueMarketPlacePublishedRealEstatesCountl.addAll(copyMarketPlacePublishedRealEstatesCount);
                }
            } else {
                copy.marketPlacePublishedRealEstatesCount = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new RealEstateCounts();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RealEstateCounts)) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "is24PublishedRealEstatesCount", lhsIs24PublishedRealEstatesCount), LocatorUtils.property(thatLocator, "is24PublishedRealEstatesCount", rhsIs24PublishedRealEstatesCount), lhsIs24PublishedRealEstatesCount, rhsIs24PublishedRealEstatesCount)) {
                return false;
            }
        }
        {
            long lhsIs24NotPublishedRealEstatesCount;
            lhsIs24NotPublishedRealEstatesCount = this.getIs24NotPublishedRealEstatesCount();
            long rhsIs24NotPublishedRealEstatesCount;
            rhsIs24NotPublishedRealEstatesCount = that.getIs24NotPublishedRealEstatesCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "is24NotPublishedRealEstatesCount", lhsIs24NotPublishedRealEstatesCount), LocatorUtils.property(thatLocator, "is24NotPublishedRealEstatesCount", rhsIs24NotPublishedRealEstatesCount), lhsIs24NotPublishedRealEstatesCount, rhsIs24NotPublishedRealEstatesCount)) {
                return false;
            }
        }
        {
            Long lhsHomepagePublishedRealEstatesCount;
            lhsHomepagePublishedRealEstatesCount = this.getHomepagePublishedRealEstatesCount();
            Long rhsHomepagePublishedRealEstatesCount;
            rhsHomepagePublishedRealEstatesCount = that.getHomepagePublishedRealEstatesCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "homepagePublishedRealEstatesCount", lhsHomepagePublishedRealEstatesCount), LocatorUtils.property(thatLocator, "homepagePublishedRealEstatesCount", rhsHomepagePublishedRealEstatesCount), lhsHomepagePublishedRealEstatesCount, rhsHomepagePublishedRealEstatesCount)) {
                return false;
            }
        }
        {
            List<RealEstateCounts.MarketPlacePublishedRealEstatesCount> lhsMarketPlacePublishedRealEstatesCount;
            lhsMarketPlacePublishedRealEstatesCount = (((this.marketPlacePublishedRealEstatesCount!= null)&&(!this.marketPlacePublishedRealEstatesCount.isEmpty()))?this.getMarketPlacePublishedRealEstatesCount():null);
            List<RealEstateCounts.MarketPlacePublishedRealEstatesCount> rhsMarketPlacePublishedRealEstatesCount;
            rhsMarketPlacePublishedRealEstatesCount = (((that.marketPlacePublishedRealEstatesCount!= null)&&(!that.marketPlacePublishedRealEstatesCount.isEmpty()))?that.getMarketPlacePublishedRealEstatesCount():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "marketPlacePublishedRealEstatesCount", lhsMarketPlacePublishedRealEstatesCount), LocatorUtils.property(thatLocator, "marketPlacePublishedRealEstatesCount", rhsMarketPlacePublishedRealEstatesCount), lhsMarketPlacePublishedRealEstatesCount, rhsMarketPlacePublishedRealEstatesCount)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
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
    public static class MarketPlacePublishedRealEstatesCount
        implements Cloneable, CopyTo, Equals, ToString
    {

        @XmlValue
        protected long value;
        @XmlAttribute(name = "name", required = true)
        protected String name;

        /**
         * Gets the value of the value property.
         * 
         */
        public long getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
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
        public void setName(String value) {
            this.name = value;
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
                long theValue;
                theValue = this.getValue();
                strategy.appendField(locator, this, "value", buffer, theValue);
            }
            {
                String theName;
                theName = this.getName();
                strategy.appendField(locator, this, "name", buffer, theName);
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
            if (draftCopy instanceof RealEstateCounts.MarketPlacePublishedRealEstatesCount) {
                final RealEstateCounts.MarketPlacePublishedRealEstatesCount copy = ((RealEstateCounts.MarketPlacePublishedRealEstatesCount) draftCopy);
                {
                    long sourceValue;
                    sourceValue = this.getValue();
                    long copyValue = strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue);
                    copy.setValue(copyValue);
                }
                if (this.name!= null) {
                    String sourceName;
                    sourceName = this.getName();
                    String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName));
                    copy.setName(copyName);
                } else {
                    copy.name = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new RealEstateCounts.MarketPlacePublishedRealEstatesCount();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof RealEstateCounts.MarketPlacePublishedRealEstatesCount)) {
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
                if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                    return false;
                }
            }
            {
                String lhsName;
                lhsName = this.getName();
                String rhsName;
                rhsName = that.getName();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
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

}
