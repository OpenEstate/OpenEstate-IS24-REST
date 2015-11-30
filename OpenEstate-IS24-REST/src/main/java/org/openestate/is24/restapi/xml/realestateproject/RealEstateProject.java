
package org.openestate.is24.restapi.xml.realestateproject;

import java.math.BigDecimal;
import java.net.URL;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
import org.openestate.is24.restapi.xml.common.Adapter13;
import org.openestate.is24.restapi.xml.common.Address;
import org.openestate.is24.restapi.xml.common.AreaRangeMandatory;
import org.openestate.is24.restapi.xml.common.InteriorQuality;
import org.openestate.is24.restapi.xml.common.PriceRangeMandatory;


/**
 * realestateproject
 * 
 * <p>Java class for RealEstateProject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealEstateProject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="price" type="{http://rest.immobilienscout24.de/schema/common/1.0}PriceRangeMandatory"/&gt;
 *         &lt;element name="space" type="{http://rest.immobilienscout24.de/schema/common/1.0}AreaRangeMandatory"/&gt;
 *         &lt;element name="minPriceProQm" type="{http://rest.immobilienscout24.de/schema/common/1.0}Number13.2Type" minOccurs="0"/&gt;
 *         &lt;element name="numberOfHousingUnit"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="1000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="interiorQuality" type="{http://rest.immobilienscout24.de/schema/common/1.0}InteriorQuality"/&gt;
 *         &lt;element name="freeFrom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="address" type="{http://rest.immobilienscout24.de/schema/common/1.0}Address"/&gt;
 *         &lt;element name="relaEstateProjectEntries" type="{http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0}RealEstateProjectEntries" minOccurs="0"/&gt;
 *         &lt;element name="homepageUrl" type="{http://rest.immobilienscout24.de/schema/common/1.0}uri" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealEstateProject", propOrder = {
    "title",
    "price",
    "space",
    "minPriceProQm",
    "numberOfHousingUnit",
    "interiorQuality",
    "freeFrom",
    "address",
    "relaEstateProjectEntries",
    "homepageUrl"
})
public class RealEstateProject
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected PriceRangeMandatory price;
    @XmlElement(required = true)
    protected AreaRangeMandatory space;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter13 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal minPriceProQm;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    protected Long numberOfHousingUnit;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected InteriorQuality interiorQuality;
    @XmlElement(required = true)
    protected String freeFrom;
    @XmlElement(required = true)
    protected Address address;
    protected RealEstateProjectEntries relaEstateProjectEntries;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "anyURI")
    protected URL homepageUrl;
    @XmlAttribute(name = "id")
    protected Long id;

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
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRangeMandatory }
     *     
     */
    public PriceRangeMandatory getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRangeMandatory }
     *     
     */
    public void setPrice(PriceRangeMandatory value) {
        this.price = value;
    }

    /**
     * Gets the value of the space property.
     * 
     * @return
     *     possible object is
     *     {@link AreaRangeMandatory }
     *     
     */
    public AreaRangeMandatory getSpace() {
        return space;
    }

    /**
     * Sets the value of the space property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaRangeMandatory }
     *     
     */
    public void setSpace(AreaRangeMandatory value) {
        this.space = value;
    }

    /**
     * Gets the value of the minPriceProQm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getMinPriceProQm() {
        return minPriceProQm;
    }

    /**
     * Sets the value of the minPriceProQm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinPriceProQm(BigDecimal value) {
        this.minPriceProQm = value;
    }

    /**
     * Gets the value of the numberOfHousingUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getNumberOfHousingUnit() {
        return numberOfHousingUnit;
    }

    /**
     * Sets the value of the numberOfHousingUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfHousingUnit(Long value) {
        this.numberOfHousingUnit = value;
    }

    /**
     * Gets the value of the interiorQuality property.
     * 
     * @return
     *     possible object is
     *     {@link InteriorQuality }
     *     
     */
    public InteriorQuality getInteriorQuality() {
        return interiorQuality;
    }

    /**
     * Sets the value of the interiorQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteriorQuality }
     *     
     */
    public void setInteriorQuality(InteriorQuality value) {
        this.interiorQuality = value;
    }

    /**
     * Gets the value of the freeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeFrom() {
        return freeFrom;
    }

    /**
     * Sets the value of the freeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeFrom(String value) {
        this.freeFrom = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the relaEstateProjectEntries property.
     * 
     * @return
     *     possible object is
     *     {@link RealEstateProjectEntries }
     *     
     */
    public RealEstateProjectEntries getRelaEstateProjectEntries() {
        return relaEstateProjectEntries;
    }

    /**
     * Sets the value of the relaEstateProjectEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealEstateProjectEntries }
     *     
     */
    public void setRelaEstateProjectEntries(RealEstateProjectEntries value) {
        this.relaEstateProjectEntries = value;
    }

    /**
     * Gets the value of the homepageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public URL getHomepageUrl() {
        return homepageUrl;
    }

    /**
     * Sets the value of the homepageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomepageUrl(URL value) {
        this.homepageUrl = value;
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
            String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle);
        }
        {
            PriceRangeMandatory thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice);
        }
        {
            AreaRangeMandatory theSpace;
            theSpace = this.getSpace();
            strategy.appendField(locator, this, "space", buffer, theSpace);
        }
        {
            BigDecimal theMinPriceProQm;
            theMinPriceProQm = this.getMinPriceProQm();
            strategy.appendField(locator, this, "minPriceProQm", buffer, theMinPriceProQm);
        }
        {
            Long theNumberOfHousingUnit;
            theNumberOfHousingUnit = this.getNumberOfHousingUnit();
            strategy.appendField(locator, this, "numberOfHousingUnit", buffer, theNumberOfHousingUnit);
        }
        {
            InteriorQuality theInteriorQuality;
            theInteriorQuality = this.getInteriorQuality();
            strategy.appendField(locator, this, "interiorQuality", buffer, theInteriorQuality);
        }
        {
            String theFreeFrom;
            theFreeFrom = this.getFreeFrom();
            strategy.appendField(locator, this, "freeFrom", buffer, theFreeFrom);
        }
        {
            Address theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress);
        }
        {
            RealEstateProjectEntries theRelaEstateProjectEntries;
            theRelaEstateProjectEntries = this.getRelaEstateProjectEntries();
            strategy.appendField(locator, this, "relaEstateProjectEntries", buffer, theRelaEstateProjectEntries);
        }
        {
            URL theHomepageUrl;
            theHomepageUrl = this.getHomepageUrl();
            strategy.appendField(locator, this, "homepageUrl", buffer, theHomepageUrl);
        }
        {
            Long theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
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
        if (draftCopy instanceof RealEstateProject) {
            final RealEstateProject copy = ((RealEstateProject) draftCopy);
            if (this.title!= null) {
                String sourceTitle;
                sourceTitle = this.getTitle();
                String copyTitle = ((String) strategy.copy(LocatorUtils.property(locator, "title", sourceTitle), sourceTitle));
                copy.setTitle(copyTitle);
            } else {
                copy.title = null;
            }
            if (this.price!= null) {
                PriceRangeMandatory sourcePrice;
                sourcePrice = this.getPrice();
                PriceRangeMandatory copyPrice = ((PriceRangeMandatory) strategy.copy(LocatorUtils.property(locator, "price", sourcePrice), sourcePrice));
                copy.setPrice(copyPrice);
            } else {
                copy.price = null;
            }
            if (this.space!= null) {
                AreaRangeMandatory sourceSpace;
                sourceSpace = this.getSpace();
                AreaRangeMandatory copySpace = ((AreaRangeMandatory) strategy.copy(LocatorUtils.property(locator, "space", sourceSpace), sourceSpace));
                copy.setSpace(copySpace);
            } else {
                copy.space = null;
            }
            if (this.minPriceProQm!= null) {
                BigDecimal sourceMinPriceProQm;
                sourceMinPriceProQm = this.getMinPriceProQm();
                BigDecimal copyMinPriceProQm = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "minPriceProQm", sourceMinPriceProQm), sourceMinPriceProQm));
                copy.setMinPriceProQm(copyMinPriceProQm);
            } else {
                copy.minPriceProQm = null;
            }
            if (this.numberOfHousingUnit!= null) {
                Long sourceNumberOfHousingUnit;
                sourceNumberOfHousingUnit = this.getNumberOfHousingUnit();
                Long copyNumberOfHousingUnit = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfHousingUnit", sourceNumberOfHousingUnit), sourceNumberOfHousingUnit));
                copy.setNumberOfHousingUnit(copyNumberOfHousingUnit);
            } else {
                copy.numberOfHousingUnit = null;
            }
            if (this.interiorQuality!= null) {
                InteriorQuality sourceInteriorQuality;
                sourceInteriorQuality = this.getInteriorQuality();
                InteriorQuality copyInteriorQuality = ((InteriorQuality) strategy.copy(LocatorUtils.property(locator, "interiorQuality", sourceInteriorQuality), sourceInteriorQuality));
                copy.setInteriorQuality(copyInteriorQuality);
            } else {
                copy.interiorQuality = null;
            }
            if (this.freeFrom!= null) {
                String sourceFreeFrom;
                sourceFreeFrom = this.getFreeFrom();
                String copyFreeFrom = ((String) strategy.copy(LocatorUtils.property(locator, "freeFrom", sourceFreeFrom), sourceFreeFrom));
                copy.setFreeFrom(copyFreeFrom);
            } else {
                copy.freeFrom = null;
            }
            if (this.address!= null) {
                Address sourceAddress;
                sourceAddress = this.getAddress();
                Address copyAddress = ((Address) strategy.copy(LocatorUtils.property(locator, "address", sourceAddress), sourceAddress));
                copy.setAddress(copyAddress);
            } else {
                copy.address = null;
            }
            if (this.relaEstateProjectEntries!= null) {
                RealEstateProjectEntries sourceRelaEstateProjectEntries;
                sourceRelaEstateProjectEntries = this.getRelaEstateProjectEntries();
                RealEstateProjectEntries copyRelaEstateProjectEntries = ((RealEstateProjectEntries) strategy.copy(LocatorUtils.property(locator, "relaEstateProjectEntries", sourceRelaEstateProjectEntries), sourceRelaEstateProjectEntries));
                copy.setRelaEstateProjectEntries(copyRelaEstateProjectEntries);
            } else {
                copy.relaEstateProjectEntries = null;
            }
            if (this.homepageUrl!= null) {
                URL sourceHomepageUrl;
                sourceHomepageUrl = this.getHomepageUrl();
                URL copyHomepageUrl = ((URL) strategy.copy(LocatorUtils.property(locator, "homepageUrl", sourceHomepageUrl), sourceHomepageUrl));
                copy.setHomepageUrl(copyHomepageUrl);
            } else {
                copy.homepageUrl = null;
            }
            if (this.id!= null) {
                Long sourceId;
                sourceId = this.getId();
                Long copyId = ((Long) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId));
                copy.setId(copyId);
            } else {
                copy.id = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new RealEstateProject();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RealEstateProject that = ((RealEstateProject) object);
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
            PriceRangeMandatory lhsPrice;
            lhsPrice = this.getPrice();
            PriceRangeMandatory rhsPrice;
            rhsPrice = that.getPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "price", lhsPrice), LocatorUtils.property(thatLocator, "price", rhsPrice), lhsPrice, rhsPrice)) {
                return false;
            }
        }
        {
            AreaRangeMandatory lhsSpace;
            lhsSpace = this.getSpace();
            AreaRangeMandatory rhsSpace;
            rhsSpace = that.getSpace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "space", lhsSpace), LocatorUtils.property(thatLocator, "space", rhsSpace), lhsSpace, rhsSpace)) {
                return false;
            }
        }
        {
            BigDecimal lhsMinPriceProQm;
            lhsMinPriceProQm = this.getMinPriceProQm();
            BigDecimal rhsMinPriceProQm;
            rhsMinPriceProQm = that.getMinPriceProQm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minPriceProQm", lhsMinPriceProQm), LocatorUtils.property(thatLocator, "minPriceProQm", rhsMinPriceProQm), lhsMinPriceProQm, rhsMinPriceProQm)) {
                return false;
            }
        }
        {
            Long lhsNumberOfHousingUnit;
            lhsNumberOfHousingUnit = this.getNumberOfHousingUnit();
            Long rhsNumberOfHousingUnit;
            rhsNumberOfHousingUnit = that.getNumberOfHousingUnit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfHousingUnit", lhsNumberOfHousingUnit), LocatorUtils.property(thatLocator, "numberOfHousingUnit", rhsNumberOfHousingUnit), lhsNumberOfHousingUnit, rhsNumberOfHousingUnit)) {
                return false;
            }
        }
        {
            InteriorQuality lhsInteriorQuality;
            lhsInteriorQuality = this.getInteriorQuality();
            InteriorQuality rhsInteriorQuality;
            rhsInteriorQuality = that.getInteriorQuality();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "interiorQuality", lhsInteriorQuality), LocatorUtils.property(thatLocator, "interiorQuality", rhsInteriorQuality), lhsInteriorQuality, rhsInteriorQuality)) {
                return false;
            }
        }
        {
            String lhsFreeFrom;
            lhsFreeFrom = this.getFreeFrom();
            String rhsFreeFrom;
            rhsFreeFrom = that.getFreeFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freeFrom", lhsFreeFrom), LocatorUtils.property(thatLocator, "freeFrom", rhsFreeFrom), lhsFreeFrom, rhsFreeFrom)) {
                return false;
            }
        }
        {
            Address lhsAddress;
            lhsAddress = this.getAddress();
            Address rhsAddress;
            rhsAddress = that.getAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress)) {
                return false;
            }
        }
        {
            RealEstateProjectEntries lhsRelaEstateProjectEntries;
            lhsRelaEstateProjectEntries = this.getRelaEstateProjectEntries();
            RealEstateProjectEntries rhsRelaEstateProjectEntries;
            rhsRelaEstateProjectEntries = that.getRelaEstateProjectEntries();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "relaEstateProjectEntries", lhsRelaEstateProjectEntries), LocatorUtils.property(thatLocator, "relaEstateProjectEntries", rhsRelaEstateProjectEntries), lhsRelaEstateProjectEntries, rhsRelaEstateProjectEntries)) {
                return false;
            }
        }
        {
            URL lhsHomepageUrl;
            lhsHomepageUrl = this.getHomepageUrl();
            URL rhsHomepageUrl;
            rhsHomepageUrl = that.getHomepageUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "homepageUrl", lhsHomepageUrl), LocatorUtils.property(thatLocator, "homepageUrl", rhsHomepageUrl), lhsHomepageUrl, rhsHomepageUrl)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
