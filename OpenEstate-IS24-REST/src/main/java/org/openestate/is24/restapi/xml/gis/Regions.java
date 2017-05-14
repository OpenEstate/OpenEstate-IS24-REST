
package org.openestate.is24.restapi.xml.gis;

import java.io.Serializable;
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
 *         &lt;element name="Region" maxOccurs="unbounded" minOccurs="0"&gt;
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
    "region"
})
@XmlRootElement(name = "regions")
public class Regions implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "Region")
    protected List<Regions.Region> region;

    /**
     * Gets the value of the region property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the region property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Regions.Region }
     * 
     * 
     */
    public List<Regions.Region> getRegion() {
        if (region == null) {
            region = new ArrayList<Regions.Region>();
        }
        return this.region;
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
            List<Regions.Region> theRegion;
            theRegion = (((this.region!= null)&&(!this.region.isEmpty()))?this.getRegion():null);
            strategy.appendField(locator, this, "region", buffer, theRegion, ((this.region!= null)&&(!this.region.isEmpty())));
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
        if (draftCopy instanceof Regions) {
            final Regions copy = ((Regions) draftCopy);
            {
                Boolean regionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.region!= null)&&(!this.region.isEmpty())));
                if (regionShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Regions.Region> sourceRegion;
                    sourceRegion = (((this.region!= null)&&(!this.region.isEmpty()))?this.getRegion():null);
                    @SuppressWarnings("unchecked")
                    List<Regions.Region> copyRegion = ((List<Regions.Region> ) strategy.copy(LocatorUtils.property(locator, "region", sourceRegion), sourceRegion, ((this.region!= null)&&(!this.region.isEmpty()))));
                    copy.region = null;
                    if (copyRegion!= null) {
                        List<Regions.Region> uniqueRegionl = copy.getRegion();
                        uniqueRegionl.addAll(copyRegion);
                    }
                } else {
                    if (regionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.region = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Regions();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Regions that = ((Regions) object);
        {
            List<Regions.Region> lhsRegion;
            lhsRegion = (((this.region!= null)&&(!this.region.isEmpty()))?this.getRegion():null);
            List<Regions.Region> rhsRegion;
            rhsRegion = (((that.region!= null)&&(!that.region.isEmpty()))?that.getRegion():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "region", lhsRegion), LocatorUtils.property(thatLocator, "region", rhsRegion), lhsRegion, rhsRegion, ((this.region!= null)&&(!this.region.isEmpty())), ((that.region!= null)&&(!that.region.isEmpty())))) {
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
    public static class Region implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
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
                URL theHref;
                theHref = this.getHref();
                strategy.appendField(locator, this, "href", buffer, theHref, (this.href!= null));
            }
            {
                Long theId;
                theId = this.getId();
                strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
            }
            {
                String theLabel;
                theLabel = this.getLabel();
                strategy.appendField(locator, this, "label", buffer, theLabel, (this.label!= null));
            }
            {
                Calendar theModification;
                theModification = this.getModification();
                strategy.appendField(locator, this, "modification", buffer, theModification, (this.modification!= null));
            }
            {
                Calendar theCreation;
                theCreation = this.getCreation();
                strategy.appendField(locator, this, "creation", buffer, theCreation, (this.creation!= null));
            }
            {
                Calendar thePublishDate;
                thePublishDate = this.getPublishDate();
                strategy.appendField(locator, this, "publishDate", buffer, thePublishDate, (this.publishDate!= null));
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
            if (draftCopy instanceof Regions.Region) {
                final Regions.Region copy = ((Regions.Region) draftCopy);
                {
                    Boolean hrefShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.href!= null));
                    if (hrefShouldBeCopiedAndSet == Boolean.TRUE) {
                        URL sourceHref;
                        sourceHref = this.getHref();
                        URL copyHref = ((URL) strategy.copy(LocatorUtils.property(locator, "href", sourceHref), sourceHref, (this.href!= null)));
                        copy.setHref(copyHref);
                    } else {
                        if (hrefShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.href = null;
                        }
                    }
                }
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
                    Boolean labelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.label!= null));
                    if (labelShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceLabel;
                        sourceLabel = this.getLabel();
                        String copyLabel = ((String) strategy.copy(LocatorUtils.property(locator, "label", sourceLabel), sourceLabel, (this.label!= null)));
                        copy.setLabel(copyLabel);
                    } else {
                        if (labelShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.label = null;
                        }
                    }
                }
                {
                    Boolean modificationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.modification!= null));
                    if (modificationShouldBeCopiedAndSet == Boolean.TRUE) {
                        Calendar sourceModification;
                        sourceModification = this.getModification();
                        Calendar copyModification = ((Calendar) strategy.copy(LocatorUtils.property(locator, "modification", sourceModification), sourceModification, (this.modification!= null)));
                        copy.setModification(copyModification);
                    } else {
                        if (modificationShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.modification = null;
                        }
                    }
                }
                {
                    Boolean creationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.creation!= null));
                    if (creationShouldBeCopiedAndSet == Boolean.TRUE) {
                        Calendar sourceCreation;
                        sourceCreation = this.getCreation();
                        Calendar copyCreation = ((Calendar) strategy.copy(LocatorUtils.property(locator, "creation", sourceCreation), sourceCreation, (this.creation!= null)));
                        copy.setCreation(copyCreation);
                    } else {
                        if (creationShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.creation = null;
                        }
                    }
                }
                {
                    Boolean publishDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.publishDate!= null));
                    if (publishDateShouldBeCopiedAndSet == Boolean.TRUE) {
                        Calendar sourcePublishDate;
                        sourcePublishDate = this.getPublishDate();
                        Calendar copyPublishDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "publishDate", sourcePublishDate), sourcePublishDate, (this.publishDate!= null)));
                        copy.setPublishDate(copyPublishDate);
                    } else {
                        if (publishDateShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.publishDate = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new Regions.Region();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final Regions.Region that = ((Regions.Region) object);
            {
                URL lhsHref;
                lhsHref = this.getHref();
                URL rhsHref;
                rhsHref = that.getHref();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "href", lhsHref), LocatorUtils.property(thatLocator, "href", rhsHref), lhsHref, rhsHref, (this.href!= null), (that.href!= null))) {
                    return false;
                }
            }
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
                String lhsLabel;
                lhsLabel = this.getLabel();
                String rhsLabel;
                rhsLabel = that.getLabel();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "label", lhsLabel), LocatorUtils.property(thatLocator, "label", rhsLabel), lhsLabel, rhsLabel, (this.label!= null), (that.label!= null))) {
                    return false;
                }
            }
            {
                Calendar lhsModification;
                lhsModification = this.getModification();
                Calendar rhsModification;
                rhsModification = that.getModification();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "modification", lhsModification), LocatorUtils.property(thatLocator, "modification", rhsModification), lhsModification, rhsModification, (this.modification!= null), (that.modification!= null))) {
                    return false;
                }
            }
            {
                Calendar lhsCreation;
                lhsCreation = this.getCreation();
                Calendar rhsCreation;
                rhsCreation = that.getCreation();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "creation", lhsCreation), LocatorUtils.property(thatLocator, "creation", rhsCreation), lhsCreation, rhsCreation, (this.creation!= null), (that.creation!= null))) {
                    return false;
                }
            }
            {
                Calendar lhsPublishDate;
                lhsPublishDate = this.getPublishDate();
                Calendar rhsPublishDate;
                rhsPublishDate = that.getPublishDate();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "publishDate", lhsPublishDate), LocatorUtils.property(thatLocator, "publishDate", rhsPublishDate), lhsPublishDate, rhsPublishDate, (this.publishDate!= null), (that.publishDate!= null))) {
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
