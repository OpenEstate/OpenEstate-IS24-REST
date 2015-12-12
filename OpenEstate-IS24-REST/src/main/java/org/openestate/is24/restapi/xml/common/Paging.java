
package org.openestate.is24.restapi.xml.common;

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
import org.openestate.is24.restapi.xml.Adapter5;


/**
 * Erm\u00f6glicht die seitenweise Iteration \u00fcber Daten(1-basiert).
 *       
 * 
 * <p>Java class for Paging complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Paging"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="next" type="{http://rest.immobilienscout24.de/schema/common/1.0}ReferenceLink" minOccurs="0"/&gt;
 *         &lt;element name="previous" type="{http://rest.immobilienscout24.de/schema/common/1.0}ReferenceLink" minOccurs="0"/&gt;
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numberOfPages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numberOfHits" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Paging", propOrder = {
    "next",
    "previous",
    "pageNumber",
    "pageSize",
    "numberOfPages",
    "numberOfHits"
})
public class Paging
    implements Cloneable, CopyTo, Equals, ToString
{

    protected ReferenceLink next;
    protected ReferenceLink previous;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long pageNumber;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long pageSize;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long numberOfPages;
    @XmlElement(required = true, type = String.class, defaultValue = "0")
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long numberOfHits;

    /**
     * Gets the value of the next property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceLink }
     *     
     */
    public ReferenceLink getNext() {
        return next;
    }

    /**
     * Sets the value of the next property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceLink }
     *     
     */
    public void setNext(ReferenceLink value) {
        this.next = value;
    }

    /**
     * Gets the value of the previous property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceLink }
     *     
     */
    public ReferenceLink getPrevious() {
        return previous;
    }

    /**
     * Sets the value of the previous property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceLink }
     *     
     */
    public void setPrevious(ReferenceLink value) {
        this.previous = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageNumber(Long value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageSize(Long value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the numberOfPages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * Sets the value of the numberOfPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfPages(Long value) {
        this.numberOfPages = value;
    }

    /**
     * Gets the value of the numberOfHits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getNumberOfHits() {
        return numberOfHits;
    }

    /**
     * Sets the value of the numberOfHits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfHits(Long value) {
        this.numberOfHits = value;
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
            ReferenceLink theNext;
            theNext = this.getNext();
            strategy.appendField(locator, this, "next", buffer, theNext);
        }
        {
            ReferenceLink thePrevious;
            thePrevious = this.getPrevious();
            strategy.appendField(locator, this, "previous", buffer, thePrevious);
        }
        {
            Long thePageNumber;
            thePageNumber = this.getPageNumber();
            strategy.appendField(locator, this, "pageNumber", buffer, thePageNumber);
        }
        {
            Long thePageSize;
            thePageSize = this.getPageSize();
            strategy.appendField(locator, this, "pageSize", buffer, thePageSize);
        }
        {
            Long theNumberOfPages;
            theNumberOfPages = this.getNumberOfPages();
            strategy.appendField(locator, this, "numberOfPages", buffer, theNumberOfPages);
        }
        {
            Long theNumberOfHits;
            theNumberOfHits = this.getNumberOfHits();
            strategy.appendField(locator, this, "numberOfHits", buffer, theNumberOfHits);
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
        if (draftCopy instanceof Paging) {
            final Paging copy = ((Paging) draftCopy);
            if (this.next!= null) {
                ReferenceLink sourceNext;
                sourceNext = this.getNext();
                ReferenceLink copyNext = ((ReferenceLink) strategy.copy(LocatorUtils.property(locator, "next", sourceNext), sourceNext));
                copy.setNext(copyNext);
            } else {
                copy.next = null;
            }
            if (this.previous!= null) {
                ReferenceLink sourcePrevious;
                sourcePrevious = this.getPrevious();
                ReferenceLink copyPrevious = ((ReferenceLink) strategy.copy(LocatorUtils.property(locator, "previous", sourcePrevious), sourcePrevious));
                copy.setPrevious(copyPrevious);
            } else {
                copy.previous = null;
            }
            if (this.pageNumber!= null) {
                Long sourcePageNumber;
                sourcePageNumber = this.getPageNumber();
                Long copyPageNumber = ((Long) strategy.copy(LocatorUtils.property(locator, "pageNumber", sourcePageNumber), sourcePageNumber));
                copy.setPageNumber(copyPageNumber);
            } else {
                copy.pageNumber = null;
            }
            if (this.pageSize!= null) {
                Long sourcePageSize;
                sourcePageSize = this.getPageSize();
                Long copyPageSize = ((Long) strategy.copy(LocatorUtils.property(locator, "pageSize", sourcePageSize), sourcePageSize));
                copy.setPageSize(copyPageSize);
            } else {
                copy.pageSize = null;
            }
            if (this.numberOfPages!= null) {
                Long sourceNumberOfPages;
                sourceNumberOfPages = this.getNumberOfPages();
                Long copyNumberOfPages = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfPages", sourceNumberOfPages), sourceNumberOfPages));
                copy.setNumberOfPages(copyNumberOfPages);
            } else {
                copy.numberOfPages = null;
            }
            if (this.numberOfHits!= null) {
                Long sourceNumberOfHits;
                sourceNumberOfHits = this.getNumberOfHits();
                Long copyNumberOfHits = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfHits", sourceNumberOfHits), sourceNumberOfHits));
                copy.setNumberOfHits(copyNumberOfHits);
            } else {
                copy.numberOfHits = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Paging();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Paging that = ((Paging) object);
        {
            ReferenceLink lhsNext;
            lhsNext = this.getNext();
            ReferenceLink rhsNext;
            rhsNext = that.getNext();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "next", lhsNext), LocatorUtils.property(thatLocator, "next", rhsNext), lhsNext, rhsNext)) {
                return false;
            }
        }
        {
            ReferenceLink lhsPrevious;
            lhsPrevious = this.getPrevious();
            ReferenceLink rhsPrevious;
            rhsPrevious = that.getPrevious();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "previous", lhsPrevious), LocatorUtils.property(thatLocator, "previous", rhsPrevious), lhsPrevious, rhsPrevious)) {
                return false;
            }
        }
        {
            Long lhsPageNumber;
            lhsPageNumber = this.getPageNumber();
            Long rhsPageNumber;
            rhsPageNumber = that.getPageNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pageNumber", lhsPageNumber), LocatorUtils.property(thatLocator, "pageNumber", rhsPageNumber), lhsPageNumber, rhsPageNumber)) {
                return false;
            }
        }
        {
            Long lhsPageSize;
            lhsPageSize = this.getPageSize();
            Long rhsPageSize;
            rhsPageSize = that.getPageSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pageSize", lhsPageSize), LocatorUtils.property(thatLocator, "pageSize", rhsPageSize), lhsPageSize, rhsPageSize)) {
                return false;
            }
        }
        {
            Long lhsNumberOfPages;
            lhsNumberOfPages = this.getNumberOfPages();
            Long rhsNumberOfPages;
            rhsNumberOfPages = that.getNumberOfPages();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfPages", lhsNumberOfPages), LocatorUtils.property(thatLocator, "numberOfPages", rhsNumberOfPages), lhsNumberOfPages, rhsNumberOfPages)) {
                return false;
            }
        }
        {
            Long lhsNumberOfHits;
            lhsNumberOfHits = this.getNumberOfHits();
            Long rhsNumberOfHits;
            rhsNumberOfHits = that.getNumberOfHits();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfHits", lhsNumberOfHits), LocatorUtils.property(thatLocator, "numberOfHits", rhsNumberOfHits), lhsNumberOfHits, rhsNumberOfHits)) {
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
