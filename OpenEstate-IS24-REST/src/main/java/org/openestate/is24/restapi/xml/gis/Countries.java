
package org.openestate.is24.restapi.xml.gis;

import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Country" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attGroup ref="{http://rest.immobilienscout24.de/schema/common/1.0}Reference"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
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
    "country"
})
@XmlRootElement(name = "countries")
public class Countries
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "Country")
    protected List<Countries.Country> country;

    /**
     * Gets the value of the country property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the country property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Countries.Country }
     * 
     * 
     */
    public List<Countries.Country> getCountry() {
        if (country == null) {
            country = new ArrayList<Countries.Country>();
        }
        return this.country;
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
            List<Countries.Country> theCountry;
            theCountry = (((this.country!= null)&&(!this.country.isEmpty()))?this.getCountry():null);
            strategy.appendField(locator, this, "country", buffer, theCountry);
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
        if (draftCopy instanceof Countries) {
            final Countries copy = ((Countries) draftCopy);
            if ((this.country!= null)&&(!this.country.isEmpty())) {
                List<Countries.Country> sourceCountry;
                sourceCountry = (((this.country!= null)&&(!this.country.isEmpty()))?this.getCountry():null);
                @SuppressWarnings("unchecked")
                List<Countries.Country> copyCountry = ((List<Countries.Country> ) strategy.copy(LocatorUtils.property(locator, "country", sourceCountry), sourceCountry));
                copy.country = null;
                if (copyCountry!= null) {
                    List<Countries.Country> uniqueCountryl = copy.getCountry();
                    uniqueCountryl.addAll(copyCountry);
                }
            } else {
                copy.country = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Countries();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Countries that = ((Countries) object);
        {
            List<Countries.Country> lhsCountry;
            lhsCountry = (((this.country!= null)&&(!this.country.isEmpty()))?this.getCountry():null);
            List<Countries.Country> rhsCountry;
            rhsCountry = (((that.country!= null)&&(!that.country.isEmpty()))?that.getCountry():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "country", lhsCountry), LocatorUtils.property(thatLocator, "country", rhsCountry), lhsCountry, rhsCountry)) {
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
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attGroup ref="{http://rest.immobilienscout24.de/schema/common/1.0}Reference"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Country
        implements Cloneable, CopyTo, Equals, ToString
    {

        @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
        @XmlJavaTypeAdapter(Adapter4 .class)
        @XmlSchemaType(name = "anyURI")
        protected URL href;
        @XmlAttribute(name = "id")
        protected Long id;
        @XmlAttribute(name = "label")
        protected String label;
        @XmlAttribute(name = "modification")
        @XmlJavaTypeAdapter(Adapter2 .class)
        @XmlSchemaType(name = "dateTime")
        protected Calendar modification;
        @XmlAttribute(name = "creation")
        @XmlJavaTypeAdapter(Adapter2 .class)
        @XmlSchemaType(name = "dateTime")
        protected Calendar creation;
        @XmlAttribute(name = "publishDate")
        @XmlJavaTypeAdapter(Adapter2 .class)
        @XmlSchemaType(name = "dateTime")
        protected Calendar publishDate;

        /**
         * Link zum Element.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public URL getHref() {
            return href;
        }

        /**
         * Sets the value of the href property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHref(URL value) {
            this.href = value;
        }

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
         * Gets the value of the label property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLabel() {
            return label;
        }

        /**
         * Sets the value of the label property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLabel(String value) {
            this.label = value;
        }

        /**
         * Gets the value of the modification property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Calendar getModification() {
            return modification;
        }

        /**
         * Sets the value of the modification property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModification(Calendar value) {
            this.modification = value;
        }

        /**
         * Gets the value of the creation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Calendar getCreation() {
            return creation;
        }

        /**
         * Sets the value of the creation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreation(Calendar value) {
            this.creation = value;
        }

        /**
         * Gets the value of the publishDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Calendar getPublishDate() {
            return publishDate;
        }

        /**
         * Sets the value of the publishDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPublishDate(Calendar value) {
            this.publishDate = value;
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
                URL theHref;
                theHref = this.getHref();
                strategy.appendField(locator, this, "href", buffer, theHref);
            }
            {
                Long theId;
                theId = this.getId();
                strategy.appendField(locator, this, "id", buffer, theId);
            }
            {
                String theLabel;
                theLabel = this.getLabel();
                strategy.appendField(locator, this, "label", buffer, theLabel);
            }
            {
                Calendar theModification;
                theModification = this.getModification();
                strategy.appendField(locator, this, "modification", buffer, theModification);
            }
            {
                Calendar theCreation;
                theCreation = this.getCreation();
                strategy.appendField(locator, this, "creation", buffer, theCreation);
            }
            {
                Calendar thePublishDate;
                thePublishDate = this.getPublishDate();
                strategy.appendField(locator, this, "publishDate", buffer, thePublishDate);
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
            if (draftCopy instanceof Countries.Country) {
                final Countries.Country copy = ((Countries.Country) draftCopy);
                if (this.href!= null) {
                    URL sourceHref;
                    sourceHref = this.getHref();
                    URL copyHref = ((URL) strategy.copy(LocatorUtils.property(locator, "href", sourceHref), sourceHref));
                    copy.setHref(copyHref);
                } else {
                    copy.href = null;
                }
                if (this.id!= null) {
                    Long sourceId;
                    sourceId = this.getId();
                    Long copyId = ((Long) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId));
                    copy.setId(copyId);
                } else {
                    copy.id = null;
                }
                if (this.label!= null) {
                    String sourceLabel;
                    sourceLabel = this.getLabel();
                    String copyLabel = ((String) strategy.copy(LocatorUtils.property(locator, "label", sourceLabel), sourceLabel));
                    copy.setLabel(copyLabel);
                } else {
                    copy.label = null;
                }
                if (this.modification!= null) {
                    Calendar sourceModification;
                    sourceModification = this.getModification();
                    Calendar copyModification = ((Calendar) strategy.copy(LocatorUtils.property(locator, "modification", sourceModification), sourceModification));
                    copy.setModification(copyModification);
                } else {
                    copy.modification = null;
                }
                if (this.creation!= null) {
                    Calendar sourceCreation;
                    sourceCreation = this.getCreation();
                    Calendar copyCreation = ((Calendar) strategy.copy(LocatorUtils.property(locator, "creation", sourceCreation), sourceCreation));
                    copy.setCreation(copyCreation);
                } else {
                    copy.creation = null;
                }
                if (this.publishDate!= null) {
                    Calendar sourcePublishDate;
                    sourcePublishDate = this.getPublishDate();
                    Calendar copyPublishDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "publishDate", sourcePublishDate), sourcePublishDate));
                    copy.setPublishDate(copyPublishDate);
                } else {
                    copy.publishDate = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new Countries.Country();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final Countries.Country that = ((Countries.Country) object);
            {
                URL lhsHref;
                lhsHref = this.getHref();
                URL rhsHref;
                rhsHref = that.getHref();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "href", lhsHref), LocatorUtils.property(thatLocator, "href", rhsHref), lhsHref, rhsHref)) {
                    return false;
                }
            }
            {
                Long lhsId;
                lhsId = this.getId();
                Long rhsId;
                rhsId = that.getId();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                    return false;
                }
            }
            {
                String lhsLabel;
                lhsLabel = this.getLabel();
                String rhsLabel;
                rhsLabel = that.getLabel();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "label", lhsLabel), LocatorUtils.property(thatLocator, "label", rhsLabel), lhsLabel, rhsLabel)) {
                    return false;
                }
            }
            {
                Calendar lhsModification;
                lhsModification = this.getModification();
                Calendar rhsModification;
                rhsModification = that.getModification();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "modification", lhsModification), LocatorUtils.property(thatLocator, "modification", rhsModification), lhsModification, rhsModification)) {
                    return false;
                }
            }
            {
                Calendar lhsCreation;
                lhsCreation = this.getCreation();
                Calendar rhsCreation;
                rhsCreation = that.getCreation();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "creation", lhsCreation), LocatorUtils.property(thatLocator, "creation", rhsCreation), lhsCreation, rhsCreation)) {
                    return false;
                }
            }
            {
                Calendar lhsPublishDate;
                lhsPublishDate = this.getPublishDate();
                Calendar rhsPublishDate;
                rhsPublishDate = that.getPublishDate();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "publishDate", lhsPublishDate), LocatorUtils.property(thatLocator, "publishDate", rhsPublishDate), lhsPublishDate, rhsPublishDate)) {
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
