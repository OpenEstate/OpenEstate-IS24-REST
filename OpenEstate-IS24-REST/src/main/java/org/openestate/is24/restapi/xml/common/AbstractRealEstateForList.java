
package org.openestate.is24.restapi.xml.common;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
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
public abstract class AbstractRealEstateForList
    implements Cloneable, CopyTo, Equals, ToString
{

    protected String externalId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter15 .class)
    protected String title;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar creationDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar lastModificationDate;
    @XmlElement(required = true)
    protected Wgs84Address address;
    protected ApiSearchData apiSearchData;
    @XmlSchemaType(name = "string")
    protected RealEstateState realEstateState;
    @XmlAttribute(name = "id")
    protected Long id;

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
            String theExternalId;
            theExternalId = this.getExternalId();
            strategy.appendField(locator, this, "externalId", buffer, theExternalId);
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle);
        }
        {
            Calendar theCreationDate;
            theCreationDate = this.getCreationDate();
            strategy.appendField(locator, this, "creationDate", buffer, theCreationDate);
        }
        {
            Calendar theLastModificationDate;
            theLastModificationDate = this.getLastModificationDate();
            strategy.appendField(locator, this, "lastModificationDate", buffer, theLastModificationDate);
        }
        {
            Wgs84Address theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress);
        }
        {
            ApiSearchData theApiSearchData;
            theApiSearchData = this.getApiSearchData();
            strategy.appendField(locator, this, "apiSearchData", buffer, theApiSearchData);
        }
        {
            RealEstateState theRealEstateState;
            theRealEstateState = this.getRealEstateState();
            strategy.appendField(locator, this, "realEstateState", buffer, theRealEstateState);
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        if (target instanceof AbstractRealEstateForList) {
            final AbstractRealEstateForList copy = ((AbstractRealEstateForList) target);
            if (this.externalId!= null) {
                String sourceExternalId;
                sourceExternalId = this.getExternalId();
                String copyExternalId = ((String) strategy.copy(LocatorUtils.property(locator, "externalId", sourceExternalId), sourceExternalId));
                copy.setExternalId(copyExternalId);
            } else {
                copy.externalId = null;
            }
            if (this.title!= null) {
                String sourceTitle;
                sourceTitle = this.getTitle();
                String copyTitle = ((String) strategy.copy(LocatorUtils.property(locator, "title", sourceTitle), sourceTitle));
                copy.setTitle(copyTitle);
            } else {
                copy.title = null;
            }
            if (this.creationDate!= null) {
                Calendar sourceCreationDate;
                sourceCreationDate = this.getCreationDate();
                Calendar copyCreationDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "creationDate", sourceCreationDate), sourceCreationDate));
                copy.setCreationDate(copyCreationDate);
            } else {
                copy.creationDate = null;
            }
            if (this.lastModificationDate!= null) {
                Calendar sourceLastModificationDate;
                sourceLastModificationDate = this.getLastModificationDate();
                Calendar copyLastModificationDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "lastModificationDate", sourceLastModificationDate), sourceLastModificationDate));
                copy.setLastModificationDate(copyLastModificationDate);
            } else {
                copy.lastModificationDate = null;
            }
            if (this.address!= null) {
                Wgs84Address sourceAddress;
                sourceAddress = this.getAddress();
                Wgs84Address copyAddress = ((Wgs84Address) strategy.copy(LocatorUtils.property(locator, "address", sourceAddress), sourceAddress));
                copy.setAddress(copyAddress);
            } else {
                copy.address = null;
            }
            if (this.apiSearchData!= null) {
                ApiSearchData sourceApiSearchData;
                sourceApiSearchData = this.getApiSearchData();
                ApiSearchData copyApiSearchData = ((ApiSearchData) strategy.copy(LocatorUtils.property(locator, "apiSearchData", sourceApiSearchData), sourceApiSearchData));
                copy.setApiSearchData(copyApiSearchData);
            } else {
                copy.apiSearchData = null;
            }
            if (this.realEstateState!= null) {
                RealEstateState sourceRealEstateState;
                sourceRealEstateState = this.getRealEstateState();
                RealEstateState copyRealEstateState = ((RealEstateState) strategy.copy(LocatorUtils.property(locator, "realEstateState", sourceRealEstateState), sourceRealEstateState));
                copy.setRealEstateState(copyRealEstateState);
            } else {
                copy.realEstateState = null;
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
        return target;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "externalId", lhsExternalId), LocatorUtils.property(thatLocator, "externalId", rhsExternalId), lhsExternalId, rhsExternalId)) {
                return false;
            }
        }
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
            Calendar lhsCreationDate;
            lhsCreationDate = this.getCreationDate();
            Calendar rhsCreationDate;
            rhsCreationDate = that.getCreationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "creationDate", lhsCreationDate), LocatorUtils.property(thatLocator, "creationDate", rhsCreationDate), lhsCreationDate, rhsCreationDate)) {
                return false;
            }
        }
        {
            Calendar lhsLastModificationDate;
            lhsLastModificationDate = this.getLastModificationDate();
            Calendar rhsLastModificationDate;
            rhsLastModificationDate = that.getLastModificationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastModificationDate", lhsLastModificationDate), LocatorUtils.property(thatLocator, "lastModificationDate", rhsLastModificationDate), lhsLastModificationDate, rhsLastModificationDate)) {
                return false;
            }
        }
        {
            Wgs84Address lhsAddress;
            lhsAddress = this.getAddress();
            Wgs84Address rhsAddress;
            rhsAddress = that.getAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress)) {
                return false;
            }
        }
        {
            ApiSearchData lhsApiSearchData;
            lhsApiSearchData = this.getApiSearchData();
            ApiSearchData rhsApiSearchData;
            rhsApiSearchData = that.getApiSearchData();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "apiSearchData", lhsApiSearchData), LocatorUtils.property(thatLocator, "apiSearchData", rhsApiSearchData), lhsApiSearchData, rhsApiSearchData)) {
                return false;
            }
        }
        {
            RealEstateState lhsRealEstateState;
            lhsRealEstateState = this.getRealEstateState();
            RealEstateState rhsRealEstateState;
            rhsRealEstateState = that.getRealEstateState();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realEstateState", lhsRealEstateState), LocatorUtils.property(thatLocator, "realEstateState", rhsRealEstateState), lhsRealEstateState, rhsRealEstateState)) {
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
