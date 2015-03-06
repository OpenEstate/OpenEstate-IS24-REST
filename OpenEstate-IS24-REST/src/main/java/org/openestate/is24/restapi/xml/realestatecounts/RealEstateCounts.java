
package org.openestate.is24.restapi.xml.realestatecounts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="is24publishedRealEstatesCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="is24notPublishedRealEstatesCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "realEstateCounts")
public class RealEstateCounts
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "is24publishedRealEstatesCount")
    protected long is24PublishedRealEstatesCount;
    @XmlElement(name = "is24notPublishedRealEstatesCount")
    protected long is24NotPublishedRealEstatesCount;

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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
