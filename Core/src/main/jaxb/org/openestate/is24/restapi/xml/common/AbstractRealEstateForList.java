
package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import java.util.Calendar;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
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
import org.openestate.is24.restapi.xml.offerlistelement.OfferRealEstateForList;


/**
 * Allgemeine Elemente f\u00fcr alle Immobilienarten.
 * 
 * <p>Java class for AbstractRealEstateForList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractRealEstateForList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="externalId" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" minOccurs="0"/&gt;
 *         &lt;element name="title"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lastModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://rest.immobilienscout24.de/schema/common/1.0}Wgs84Address"/&gt;
 *         &lt;element name="apiSearchData" type="{http://rest.immobilienscout24.de/schema/common/1.0}ApiSearchData" minOccurs="0"/&gt;
 *         &lt;element name="realEstateState" type="{http://rest.immobilienscout24.de/schema/common/1.0}RealEstateState" minOccurs="0"/&gt;
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
@XmlType(name = "AbstractRealEstateForList", propOrder = {
    "externalId",
    "title",
    "creationDate",
    "lastModificationDate",
    "address",
    "apiSearchData",
    "realEstateState"
})
@XmlSeeAlso({
    OfferRealEstateForList.class,
    AbstractRealEstate.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
public abstract class AbstractRealEstateForList implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected String externalId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter15 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected String title;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected Calendar creationDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected Calendar lastModificationDate;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected Wgs84Address address;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected ApiSearchData apiSearchData;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected RealEstateState realEstateState;
    @XmlAttribute(name = "id")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected Long id;

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Calendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setCreationDate(Calendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the lastModificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Calendar getLastModificationDate() {
        return lastModificationDate;
    }

    /**
     * Sets the value of the lastModificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setLastModificationDate(Calendar value) {
        this.lastModificationDate = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Wgs84Address }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Wgs84Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wgs84Address }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setAddress(Wgs84Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the apiSearchData property.
     * 
     * @return
     *     possible object is
     *     {@link ApiSearchData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public ApiSearchData getApiSearchData() {
        return apiSearchData;
    }

    /**
     * Sets the value of the apiSearchData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiSearchData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setApiSearchData(ApiSearchData value) {
        this.apiSearchData = value;
    }

    /**
     * Gets the value of the realEstateState property.
     * 
     * @return
     *     possible object is
     *     {@link RealEstateState }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public RealEstateState getRealEstateState() {
        return realEstateState;
    }

    /**
     * Sets the value of the realEstateState property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealEstateState }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setRealEstateState(RealEstateState value) {
        this.realEstateState = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setId(Long value) {
        this.id = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String theExternalId;
            theExternalId = this.getExternalId();
            strategy.appendField(locator, this, "externalId", buffer, theExternalId, (this.externalId!= null));
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle, (this.title!= null));
        }
        {
            Calendar theCreationDate;
            theCreationDate = this.getCreationDate();
            strategy.appendField(locator, this, "creationDate", buffer, theCreationDate, (this.creationDate!= null));
        }
        {
            Calendar theLastModificationDate;
            theLastModificationDate = this.getLastModificationDate();
            strategy.appendField(locator, this, "lastModificationDate", buffer, theLastModificationDate, (this.lastModificationDate!= null));
        }
        {
            Wgs84Address theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress, (this.address!= null));
        }
        {
            ApiSearchData theApiSearchData;
            theApiSearchData = this.getApiSearchData();
            strategy.appendField(locator, this, "apiSearchData", buffer, theApiSearchData, (this.apiSearchData!= null));
        }
        {
            RealEstateState theRealEstateState;
            theRealEstateState = this.getRealEstateState();
            strategy.appendField(locator, this, "realEstateState", buffer, theRealEstateState, (this.realEstateState!= null));
        }
        {
            Long theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        if (target instanceof AbstractRealEstateForList) {
            final AbstractRealEstateForList copy = ((AbstractRealEstateForList) target);
            {
                Boolean externalIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.externalId!= null));
                if (externalIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceExternalId;
                    sourceExternalId = this.getExternalId();
                    String copyExternalId = ((String) strategy.copy(LocatorUtils.property(locator, "externalId", sourceExternalId), sourceExternalId, (this.externalId!= null)));
                    copy.setExternalId(copyExternalId);
                } else {
                    if (externalIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.externalId = null;
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
                Boolean creationDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.creationDate!= null));
                if (creationDateShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceCreationDate;
                    sourceCreationDate = this.getCreationDate();
                    Calendar copyCreationDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "creationDate", sourceCreationDate), sourceCreationDate, (this.creationDate!= null)));
                    copy.setCreationDate(copyCreationDate);
                } else {
                    if (creationDateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.creationDate = null;
                    }
                }
            }
            {
                Boolean lastModificationDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lastModificationDate!= null));
                if (lastModificationDateShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceLastModificationDate;
                    sourceLastModificationDate = this.getLastModificationDate();
                    Calendar copyLastModificationDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "lastModificationDate", sourceLastModificationDate), sourceLastModificationDate, (this.lastModificationDate!= null)));
                    copy.setLastModificationDate(copyLastModificationDate);
                } else {
                    if (lastModificationDateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lastModificationDate = null;
                    }
                }
            }
            {
                Boolean addressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.address!= null));
                if (addressShouldBeCopiedAndSet == Boolean.TRUE) {
                    Wgs84Address sourceAddress;
                    sourceAddress = this.getAddress();
                    Wgs84Address copyAddress = ((Wgs84Address) strategy.copy(LocatorUtils.property(locator, "address", sourceAddress), sourceAddress, (this.address!= null)));
                    copy.setAddress(copyAddress);
                } else {
                    if (addressShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.address = null;
                    }
                }
            }
            {
                Boolean apiSearchDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.apiSearchData!= null));
                if (apiSearchDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    ApiSearchData sourceApiSearchData;
                    sourceApiSearchData = this.getApiSearchData();
                    ApiSearchData copyApiSearchData = ((ApiSearchData) strategy.copy(LocatorUtils.property(locator, "apiSearchData", sourceApiSearchData), sourceApiSearchData, (this.apiSearchData!= null)));
                    copy.setApiSearchData(copyApiSearchData);
                } else {
                    if (apiSearchDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.apiSearchData = null;
                    }
                }
            }
            {
                Boolean realEstateStateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.realEstateState!= null));
                if (realEstateStateShouldBeCopiedAndSet == Boolean.TRUE) {
                    RealEstateState sourceRealEstateState;
                    sourceRealEstateState = this.getRealEstateState();
                    RealEstateState copyRealEstateState = ((RealEstateState) strategy.copy(LocatorUtils.property(locator, "realEstateState", sourceRealEstateState), sourceRealEstateState, (this.realEstateState!= null)));
                    copy.setRealEstateState(copyRealEstateState);
                } else {
                    if (realEstateStateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realEstateState = null;
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
        return target;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AbstractRealEstateForList that = ((AbstractRealEstateForList) object);
        {
            String lhsExternalId;
            lhsExternalId = this.getExternalId();
            String rhsExternalId;
            rhsExternalId = that.getExternalId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "externalId", lhsExternalId), LocatorUtils.property(thatLocator, "externalId", rhsExternalId), lhsExternalId, rhsExternalId, (this.externalId!= null), (that.externalId!= null))) {
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
            Calendar lhsCreationDate;
            lhsCreationDate = this.getCreationDate();
            Calendar rhsCreationDate;
            rhsCreationDate = that.getCreationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "creationDate", lhsCreationDate), LocatorUtils.property(thatLocator, "creationDate", rhsCreationDate), lhsCreationDate, rhsCreationDate, (this.creationDate!= null), (that.creationDate!= null))) {
                return false;
            }
        }
        {
            Calendar lhsLastModificationDate;
            lhsLastModificationDate = this.getLastModificationDate();
            Calendar rhsLastModificationDate;
            rhsLastModificationDate = that.getLastModificationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastModificationDate", lhsLastModificationDate), LocatorUtils.property(thatLocator, "lastModificationDate", rhsLastModificationDate), lhsLastModificationDate, rhsLastModificationDate, (this.lastModificationDate!= null), (that.lastModificationDate!= null))) {
                return false;
            }
        }
        {
            Wgs84Address lhsAddress;
            lhsAddress = this.getAddress();
            Wgs84Address rhsAddress;
            rhsAddress = that.getAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress, (this.address!= null), (that.address!= null))) {
                return false;
            }
        }
        {
            ApiSearchData lhsApiSearchData;
            lhsApiSearchData = this.getApiSearchData();
            ApiSearchData rhsApiSearchData;
            rhsApiSearchData = that.getApiSearchData();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "apiSearchData", lhsApiSearchData), LocatorUtils.property(thatLocator, "apiSearchData", rhsApiSearchData), lhsApiSearchData, rhsApiSearchData, (this.apiSearchData!= null), (that.apiSearchData!= null))) {
                return false;
            }
        }
        {
            RealEstateState lhsRealEstateState;
            lhsRealEstateState = this.getRealEstateState();
            RealEstateState rhsRealEstateState;
            rhsRealEstateState = that.getRealEstateState();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realEstateState", lhsRealEstateState), LocatorUtils.property(thatLocator, "realEstateState", rhsRealEstateState), lhsRealEstateState, rhsRealEstateState, (this.realEstateState!= null), (that.realEstateState!= null))) {
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
