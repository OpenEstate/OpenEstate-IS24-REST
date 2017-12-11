
package org.openestate.is24.restapi.xml.realestateproject;

import java.io.Serializable;
import java.math.BigDecimal;
import java.net.URI;
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
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "name",
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
public class RealEstateProject implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    protected String name;
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
    protected URI homepageUrl;
    @XmlAttribute(name = "id")
    protected Long id;

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
    public URI getHomepageUrl() {
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
    public void setHomepageUrl(URI value) {
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
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle, (this.title!= null));
        }
        {
            PriceRangeMandatory thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice, (this.price!= null));
        }
        {
            AreaRangeMandatory theSpace;
            theSpace = this.getSpace();
            strategy.appendField(locator, this, "space", buffer, theSpace, (this.space!= null));
        }
        {
            BigDecimal theMinPriceProQm;
            theMinPriceProQm = this.getMinPriceProQm();
            strategy.appendField(locator, this, "minPriceProQm", buffer, theMinPriceProQm, (this.minPriceProQm!= null));
        }
        {
            Long theNumberOfHousingUnit;
            theNumberOfHousingUnit = this.getNumberOfHousingUnit();
            strategy.appendField(locator, this, "numberOfHousingUnit", buffer, theNumberOfHousingUnit, (this.numberOfHousingUnit!= null));
        }
        {
            InteriorQuality theInteriorQuality;
            theInteriorQuality = this.getInteriorQuality();
            strategy.appendField(locator, this, "interiorQuality", buffer, theInteriorQuality, (this.interiorQuality!= null));
        }
        {
            String theFreeFrom;
            theFreeFrom = this.getFreeFrom();
            strategy.appendField(locator, this, "freeFrom", buffer, theFreeFrom, (this.freeFrom!= null));
        }
        {
            Address theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress, (this.address!= null));
        }
        {
            RealEstateProjectEntries theRelaEstateProjectEntries;
            theRelaEstateProjectEntries = this.getRelaEstateProjectEntries();
            strategy.appendField(locator, this, "relaEstateProjectEntries", buffer, theRelaEstateProjectEntries, (this.relaEstateProjectEntries!= null));
        }
        {
            URI theHomepageUrl;
            theHomepageUrl = this.getHomepageUrl();
            strategy.appendField(locator, this, "homepageUrl", buffer, theHomepageUrl, (this.homepageUrl!= null));
        }
        {
            Long theId;
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
        if (draftCopy instanceof RealEstateProject) {
            final RealEstateProject copy = ((RealEstateProject) draftCopy);
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
                Boolean priceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.price!= null));
                if (priceShouldBeCopiedAndSet == Boolean.TRUE) {
                    PriceRangeMandatory sourcePrice;
                    sourcePrice = this.getPrice();
                    PriceRangeMandatory copyPrice = ((PriceRangeMandatory) strategy.copy(LocatorUtils.property(locator, "price", sourcePrice), sourcePrice, (this.price!= null)));
                    copy.setPrice(copyPrice);
                } else {
                    if (priceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.price = null;
                    }
                }
            }
            {
                Boolean spaceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.space!= null));
                if (spaceShouldBeCopiedAndSet == Boolean.TRUE) {
                    AreaRangeMandatory sourceSpace;
                    sourceSpace = this.getSpace();
                    AreaRangeMandatory copySpace = ((AreaRangeMandatory) strategy.copy(LocatorUtils.property(locator, "space", sourceSpace), sourceSpace, (this.space!= null)));
                    copy.setSpace(copySpace);
                } else {
                    if (spaceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.space = null;
                    }
                }
            }
            {
                Boolean minPriceProQmShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.minPriceProQm!= null));
                if (minPriceProQmShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceMinPriceProQm;
                    sourceMinPriceProQm = this.getMinPriceProQm();
                    BigDecimal copyMinPriceProQm = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "minPriceProQm", sourceMinPriceProQm), sourceMinPriceProQm, (this.minPriceProQm!= null)));
                    copy.setMinPriceProQm(copyMinPriceProQm);
                } else {
                    if (minPriceProQmShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.minPriceProQm = null;
                    }
                }
            }
            {
                Boolean numberOfHousingUnitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfHousingUnit!= null));
                if (numberOfHousingUnitShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceNumberOfHousingUnit;
                    sourceNumberOfHousingUnit = this.getNumberOfHousingUnit();
                    Long copyNumberOfHousingUnit = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfHousingUnit", sourceNumberOfHousingUnit), sourceNumberOfHousingUnit, (this.numberOfHousingUnit!= null)));
                    copy.setNumberOfHousingUnit(copyNumberOfHousingUnit);
                } else {
                    if (numberOfHousingUnitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfHousingUnit = null;
                    }
                }
            }
            {
                Boolean interiorQualityShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.interiorQuality!= null));
                if (interiorQualityShouldBeCopiedAndSet == Boolean.TRUE) {
                    InteriorQuality sourceInteriorQuality;
                    sourceInteriorQuality = this.getInteriorQuality();
                    InteriorQuality copyInteriorQuality = ((InteriorQuality) strategy.copy(LocatorUtils.property(locator, "interiorQuality", sourceInteriorQuality), sourceInteriorQuality, (this.interiorQuality!= null)));
                    copy.setInteriorQuality(copyInteriorQuality);
                } else {
                    if (interiorQualityShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.interiorQuality = null;
                    }
                }
            }
            {
                Boolean freeFromShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.freeFrom!= null));
                if (freeFromShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFreeFrom;
                    sourceFreeFrom = this.getFreeFrom();
                    String copyFreeFrom = ((String) strategy.copy(LocatorUtils.property(locator, "freeFrom", sourceFreeFrom), sourceFreeFrom, (this.freeFrom!= null)));
                    copy.setFreeFrom(copyFreeFrom);
                } else {
                    if (freeFromShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.freeFrom = null;
                    }
                }
            }
            {
                Boolean addressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.address!= null));
                if (addressShouldBeCopiedAndSet == Boolean.TRUE) {
                    Address sourceAddress;
                    sourceAddress = this.getAddress();
                    Address copyAddress = ((Address) strategy.copy(LocatorUtils.property(locator, "address", sourceAddress), sourceAddress, (this.address!= null)));
                    copy.setAddress(copyAddress);
                } else {
                    if (addressShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.address = null;
                    }
                }
            }
            {
                Boolean relaEstateProjectEntriesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.relaEstateProjectEntries!= null));
                if (relaEstateProjectEntriesShouldBeCopiedAndSet == Boolean.TRUE) {
                    RealEstateProjectEntries sourceRelaEstateProjectEntries;
                    sourceRelaEstateProjectEntries = this.getRelaEstateProjectEntries();
                    RealEstateProjectEntries copyRelaEstateProjectEntries = ((RealEstateProjectEntries) strategy.copy(LocatorUtils.property(locator, "relaEstateProjectEntries", sourceRelaEstateProjectEntries), sourceRelaEstateProjectEntries, (this.relaEstateProjectEntries!= null)));
                    copy.setRelaEstateProjectEntries(copyRelaEstateProjectEntries);
                } else {
                    if (relaEstateProjectEntriesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.relaEstateProjectEntries = null;
                    }
                }
            }
            {
                Boolean homepageUrlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.homepageUrl!= null));
                if (homepageUrlShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceHomepageUrl;
                    sourceHomepageUrl = this.getHomepageUrl();
                    URI copyHomepageUrl = ((URI) strategy.copy(LocatorUtils.property(locator, "homepageUrl", sourceHomepageUrl), sourceHomepageUrl, (this.homepageUrl!= null)));
                    copy.setHomepageUrl(copyHomepageUrl);
                } else {
                    if (homepageUrlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.homepageUrl = null;
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
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new RealEstateProject();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RealEstateProject that = ((RealEstateProject) object);
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
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
            PriceRangeMandatory lhsPrice;
            lhsPrice = this.getPrice();
            PriceRangeMandatory rhsPrice;
            rhsPrice = that.getPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "price", lhsPrice), LocatorUtils.property(thatLocator, "price", rhsPrice), lhsPrice, rhsPrice, (this.price!= null), (that.price!= null))) {
                return false;
            }
        }
        {
            AreaRangeMandatory lhsSpace;
            lhsSpace = this.getSpace();
            AreaRangeMandatory rhsSpace;
            rhsSpace = that.getSpace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "space", lhsSpace), LocatorUtils.property(thatLocator, "space", rhsSpace), lhsSpace, rhsSpace, (this.space!= null), (that.space!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsMinPriceProQm;
            lhsMinPriceProQm = this.getMinPriceProQm();
            BigDecimal rhsMinPriceProQm;
            rhsMinPriceProQm = that.getMinPriceProQm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minPriceProQm", lhsMinPriceProQm), LocatorUtils.property(thatLocator, "minPriceProQm", rhsMinPriceProQm), lhsMinPriceProQm, rhsMinPriceProQm, (this.minPriceProQm!= null), (that.minPriceProQm!= null))) {
                return false;
            }
        }
        {
            Long lhsNumberOfHousingUnit;
            lhsNumberOfHousingUnit = this.getNumberOfHousingUnit();
            Long rhsNumberOfHousingUnit;
            rhsNumberOfHousingUnit = that.getNumberOfHousingUnit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfHousingUnit", lhsNumberOfHousingUnit), LocatorUtils.property(thatLocator, "numberOfHousingUnit", rhsNumberOfHousingUnit), lhsNumberOfHousingUnit, rhsNumberOfHousingUnit, (this.numberOfHousingUnit!= null), (that.numberOfHousingUnit!= null))) {
                return false;
            }
        }
        {
            InteriorQuality lhsInteriorQuality;
            lhsInteriorQuality = this.getInteriorQuality();
            InteriorQuality rhsInteriorQuality;
            rhsInteriorQuality = that.getInteriorQuality();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "interiorQuality", lhsInteriorQuality), LocatorUtils.property(thatLocator, "interiorQuality", rhsInteriorQuality), lhsInteriorQuality, rhsInteriorQuality, (this.interiorQuality!= null), (that.interiorQuality!= null))) {
                return false;
            }
        }
        {
            String lhsFreeFrom;
            lhsFreeFrom = this.getFreeFrom();
            String rhsFreeFrom;
            rhsFreeFrom = that.getFreeFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freeFrom", lhsFreeFrom), LocatorUtils.property(thatLocator, "freeFrom", rhsFreeFrom), lhsFreeFrom, rhsFreeFrom, (this.freeFrom!= null), (that.freeFrom!= null))) {
                return false;
            }
        }
        {
            Address lhsAddress;
            lhsAddress = this.getAddress();
            Address rhsAddress;
            rhsAddress = that.getAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress, (this.address!= null), (that.address!= null))) {
                return false;
            }
        }
        {
            RealEstateProjectEntries lhsRelaEstateProjectEntries;
            lhsRelaEstateProjectEntries = this.getRelaEstateProjectEntries();
            RealEstateProjectEntries rhsRelaEstateProjectEntries;
            rhsRelaEstateProjectEntries = that.getRelaEstateProjectEntries();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "relaEstateProjectEntries", lhsRelaEstateProjectEntries), LocatorUtils.property(thatLocator, "relaEstateProjectEntries", rhsRelaEstateProjectEntries), lhsRelaEstateProjectEntries, rhsRelaEstateProjectEntries, (this.relaEstateProjectEntries!= null), (that.relaEstateProjectEntries!= null))) {
                return false;
            }
        }
        {
            URI lhsHomepageUrl;
            lhsHomepageUrl = this.getHomepageUrl();
            URI rhsHomepageUrl;
            rhsHomepageUrl = that.getHomepageUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "homepageUrl", lhsHomepageUrl), LocatorUtils.property(thatLocator, "homepageUrl", rhsHomepageUrl), lhsHomepageUrl, rhsHomepageUrl, (this.homepageUrl!= null), (that.homepageUrl!= null))) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
