
package org.openestate.is24.restapi.xml.realestateproject;

import java.io.Serializable;
import java.math.BigDecimal;
import java.net.URI;
import javax.annotation.Generated;
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
 *               &lt;maxInclusive value="9999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="interiorQuality" type="{http://rest.immobilienscout24.de/schema/common/1.0}InteriorQuality"/&gt;
 *         &lt;element name="freeFrom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="address" type="{http://rest.immobilienscout24.de/schema/common/1.0}Address"/&gt;
 *         &lt;element name="homepageUrl" type="{http://rest.immobilienscout24.de/schema/common/1.0}uri" minOccurs="0"/&gt;
 *         &lt;element name="extProjectUrl" type="{http://rest.immobilienscout24.de/schema/common/1.0}uri" minOccurs="0"/&gt;
 *         &lt;element name="customization" type="{http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0}Customization" minOccurs="0"/&gt;
 *         &lt;element name="enabledContactFormFields" type="{http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0}contactFormFields" minOccurs="0"/&gt;
 *         &lt;element name="referenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="showroom" type="{http://rest.immobilienscout24.de/schema/common/1.0}Address" minOccurs="0"/&gt;
 *         &lt;element name="salesProgress" type="{http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0}percentType" minOccurs="0"/&gt;
 *         &lt;element name="description" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="numberOfHousingUnitsDetails" type="{http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0}NumberOfHousingUnitsDetails" minOccurs="0"/&gt;
 *         &lt;element name="interiorCharacteristics" type="{http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0}InteriorCharacteristics" minOccurs="0"/&gt;
 *         &lt;element name="interiorQualityDescription" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="locationDescription" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2050"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="rooms" type="{http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0}NumberOfRoomsRange" minOccurs="0"/&gt;
 *         &lt;element name="companyName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="contact" type="{http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0}Contact" minOccurs="0"/&gt;
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
    "homepageUrl",
    "extProjectUrl",
    "customization",
    "enabledContactFormFields",
    "referenceNumber",
    "showroom",
    "salesProgress",
    "description",
    "numberOfHousingUnitsDetails",
    "interiorCharacteristics",
    "interiorQualityDescription",
    "locationDescription",
    "rooms",
    "companyName",
    "contact"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
public class RealEstateProject implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected String name;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected String title;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected PriceRangeMandatory price;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected AreaRangeMandatory space;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter13 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal minPriceProQm;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter17 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected Integer numberOfHousingUnit;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected InteriorQuality interiorQuality;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected String freeFrom;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected Address address;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected URI homepageUrl;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected URI extProjectUrl;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected Customization customization;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected ContactFormFields enabledContactFormFields;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected String referenceNumber;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected Address showroom;
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected PercentType salesProgress;
    @XmlJavaTypeAdapter(Adapter18 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected String description;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected NumberOfHousingUnitsDetails numberOfHousingUnitsDetails;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected InteriorCharacteristics interiorCharacteristics;
    @XmlJavaTypeAdapter(Adapter19 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected String interiorQualityDescription;
    @XmlJavaTypeAdapter(Adapter20 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected String locationDescription;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected NumberOfRoomsRange rooms;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter21 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected String companyName;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected Contact contact;
    @XmlAttribute(name = "id")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected Long id;

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

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public Integer getNumberOfHousingUnit() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setNumberOfHousingUnit(Integer value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the homepageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setHomepageUrl(URI value) {
        this.homepageUrl = value;
    }

    /**
     * Gets the value of the extProjectUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public URI getExtProjectUrl() {
        return extProjectUrl;
    }

    /**
     * Sets the value of the extProjectUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setExtProjectUrl(URI value) {
        this.extProjectUrl = value;
    }

    /**
     * Gets the value of the customization property.
     * 
     * @return
     *     possible object is
     *     {@link Customization }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public Customization getCustomization() {
        return customization;
    }

    /**
     * Sets the value of the customization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customization }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setCustomization(Customization value) {
        this.customization = value;
    }

    /**
     * Gets the value of the enabledContactFormFields property.
     * 
     * @return
     *     possible object is
     *     {@link ContactFormFields }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public ContactFormFields getEnabledContactFormFields() {
        return enabledContactFormFields;
    }

    /**
     * Sets the value of the enabledContactFormFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactFormFields }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setEnabledContactFormFields(ContactFormFields value) {
        this.enabledContactFormFields = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

    /**
     * Gets the value of the showroom property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public Address getShowroom() {
        return showroom;
    }

    /**
     * Sets the value of the showroom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setShowroom(Address value) {
        this.showroom = value;
    }

    /**
     * Gets the value of the salesProgress property.
     * 
     * @return
     *     possible object is
     *     {@link PercentType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public PercentType getSalesProgress() {
        return salesProgress;
    }

    /**
     * Sets the value of the salesProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setSalesProgress(PercentType value) {
        this.salesProgress = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the numberOfHousingUnitsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfHousingUnitsDetails }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public NumberOfHousingUnitsDetails getNumberOfHousingUnitsDetails() {
        return numberOfHousingUnitsDetails;
    }

    /**
     * Sets the value of the numberOfHousingUnitsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfHousingUnitsDetails }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setNumberOfHousingUnitsDetails(NumberOfHousingUnitsDetails value) {
        this.numberOfHousingUnitsDetails = value;
    }

    /**
     * Gets the value of the interiorCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link InteriorCharacteristics }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public InteriorCharacteristics getInteriorCharacteristics() {
        return interiorCharacteristics;
    }

    /**
     * Sets the value of the interiorCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteriorCharacteristics }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setInteriorCharacteristics(InteriorCharacteristics value) {
        this.interiorCharacteristics = value;
    }

    /**
     * Gets the value of the interiorQualityDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public String getInteriorQualityDescription() {
        return interiorQualityDescription;
    }

    /**
     * Sets the value of the interiorQualityDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setInteriorQualityDescription(String value) {
        this.interiorQualityDescription = value;
    }

    /**
     * Gets the value of the locationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public String getLocationDescription() {
        return locationDescription;
    }

    /**
     * Sets the value of the locationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setLocationDescription(String value) {
        this.locationDescription = value;
    }

    /**
     * Gets the value of the rooms property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfRoomsRange }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public NumberOfRoomsRange getRooms() {
        return rooms;
    }

    /**
     * Sets the value of the rooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfRoomsRange }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setRooms(NumberOfRoomsRange value) {
        this.rooms = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setContact(Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setId(Long value) {
        this.id = value;
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
            Integer theNumberOfHousingUnit;
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
            URI theHomepageUrl;
            theHomepageUrl = this.getHomepageUrl();
            strategy.appendField(locator, this, "homepageUrl", buffer, theHomepageUrl, (this.homepageUrl!= null));
        }
        {
            URI theExtProjectUrl;
            theExtProjectUrl = this.getExtProjectUrl();
            strategy.appendField(locator, this, "extProjectUrl", buffer, theExtProjectUrl, (this.extProjectUrl!= null));
        }
        {
            Customization theCustomization;
            theCustomization = this.getCustomization();
            strategy.appendField(locator, this, "customization", buffer, theCustomization, (this.customization!= null));
        }
        {
            ContactFormFields theEnabledContactFormFields;
            theEnabledContactFormFields = this.getEnabledContactFormFields();
            strategy.appendField(locator, this, "enabledContactFormFields", buffer, theEnabledContactFormFields, (this.enabledContactFormFields!= null));
        }
        {
            String theReferenceNumber;
            theReferenceNumber = this.getReferenceNumber();
            strategy.appendField(locator, this, "referenceNumber", buffer, theReferenceNumber, (this.referenceNumber!= null));
        }
        {
            Address theShowroom;
            theShowroom = this.getShowroom();
            strategy.appendField(locator, this, "showroom", buffer, theShowroom, (this.showroom!= null));
        }
        {
            PercentType theSalesProgress;
            theSalesProgress = this.getSalesProgress();
            strategy.appendField(locator, this, "salesProgress", buffer, theSalesProgress, (this.salesProgress!= null));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        {
            NumberOfHousingUnitsDetails theNumberOfHousingUnitsDetails;
            theNumberOfHousingUnitsDetails = this.getNumberOfHousingUnitsDetails();
            strategy.appendField(locator, this, "numberOfHousingUnitsDetails", buffer, theNumberOfHousingUnitsDetails, (this.numberOfHousingUnitsDetails!= null));
        }
        {
            InteriorCharacteristics theInteriorCharacteristics;
            theInteriorCharacteristics = this.getInteriorCharacteristics();
            strategy.appendField(locator, this, "interiorCharacteristics", buffer, theInteriorCharacteristics, (this.interiorCharacteristics!= null));
        }
        {
            String theInteriorQualityDescription;
            theInteriorQualityDescription = this.getInteriorQualityDescription();
            strategy.appendField(locator, this, "interiorQualityDescription", buffer, theInteriorQualityDescription, (this.interiorQualityDescription!= null));
        }
        {
            String theLocationDescription;
            theLocationDescription = this.getLocationDescription();
            strategy.appendField(locator, this, "locationDescription", buffer, theLocationDescription, (this.locationDescription!= null));
        }
        {
            NumberOfRoomsRange theRooms;
            theRooms = this.getRooms();
            strategy.appendField(locator, this, "rooms", buffer, theRooms, (this.rooms!= null));
        }
        {
            String theCompanyName;
            theCompanyName = this.getCompanyName();
            strategy.appendField(locator, this, "companyName", buffer, theCompanyName, (this.companyName!= null));
        }
        {
            Contact theContact;
            theContact = this.getContact();
            strategy.appendField(locator, this, "contact", buffer, theContact, (this.contact!= null));
        }
        {
            Long theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
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
                    Integer sourceNumberOfHousingUnit;
                    sourceNumberOfHousingUnit = this.getNumberOfHousingUnit();
                    Integer copyNumberOfHousingUnit = ((Integer) strategy.copy(LocatorUtils.property(locator, "numberOfHousingUnit", sourceNumberOfHousingUnit), sourceNumberOfHousingUnit, (this.numberOfHousingUnit!= null)));
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
                Boolean extProjectUrlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.extProjectUrl!= null));
                if (extProjectUrlShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceExtProjectUrl;
                    sourceExtProjectUrl = this.getExtProjectUrl();
                    URI copyExtProjectUrl = ((URI) strategy.copy(LocatorUtils.property(locator, "extProjectUrl", sourceExtProjectUrl), sourceExtProjectUrl, (this.extProjectUrl!= null)));
                    copy.setExtProjectUrl(copyExtProjectUrl);
                } else {
                    if (extProjectUrlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.extProjectUrl = null;
                    }
                }
            }
            {
                Boolean customizationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.customization!= null));
                if (customizationShouldBeCopiedAndSet == Boolean.TRUE) {
                    Customization sourceCustomization;
                    sourceCustomization = this.getCustomization();
                    Customization copyCustomization = ((Customization) strategy.copy(LocatorUtils.property(locator, "customization", sourceCustomization), sourceCustomization, (this.customization!= null)));
                    copy.setCustomization(copyCustomization);
                } else {
                    if (customizationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.customization = null;
                    }
                }
            }
            {
                Boolean enabledContactFormFieldsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.enabledContactFormFields!= null));
                if (enabledContactFormFieldsShouldBeCopiedAndSet == Boolean.TRUE) {
                    ContactFormFields sourceEnabledContactFormFields;
                    sourceEnabledContactFormFields = this.getEnabledContactFormFields();
                    ContactFormFields copyEnabledContactFormFields = ((ContactFormFields) strategy.copy(LocatorUtils.property(locator, "enabledContactFormFields", sourceEnabledContactFormFields), sourceEnabledContactFormFields, (this.enabledContactFormFields!= null)));
                    copy.setEnabledContactFormFields(copyEnabledContactFormFields);
                } else {
                    if (enabledContactFormFieldsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.enabledContactFormFields = null;
                    }
                }
            }
            {
                Boolean referenceNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.referenceNumber!= null));
                if (referenceNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceReferenceNumber;
                    sourceReferenceNumber = this.getReferenceNumber();
                    String copyReferenceNumber = ((String) strategy.copy(LocatorUtils.property(locator, "referenceNumber", sourceReferenceNumber), sourceReferenceNumber, (this.referenceNumber!= null)));
                    copy.setReferenceNumber(copyReferenceNumber);
                } else {
                    if (referenceNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.referenceNumber = null;
                    }
                }
            }
            {
                Boolean showroomShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.showroom!= null));
                if (showroomShouldBeCopiedAndSet == Boolean.TRUE) {
                    Address sourceShowroom;
                    sourceShowroom = this.getShowroom();
                    Address copyShowroom = ((Address) strategy.copy(LocatorUtils.property(locator, "showroom", sourceShowroom), sourceShowroom, (this.showroom!= null)));
                    copy.setShowroom(copyShowroom);
                } else {
                    if (showroomShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.showroom = null;
                    }
                }
            }
            {
                Boolean salesProgressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.salesProgress!= null));
                if (salesProgressShouldBeCopiedAndSet == Boolean.TRUE) {
                    PercentType sourceSalesProgress;
                    sourceSalesProgress = this.getSalesProgress();
                    PercentType copySalesProgress = ((PercentType) strategy.copy(LocatorUtils.property(locator, "salesProgress", sourceSalesProgress), sourceSalesProgress, (this.salesProgress!= null)));
                    copy.setSalesProgress(copySalesProgress);
                } else {
                    if (salesProgressShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.salesProgress = null;
                    }
                }
            }
            {
                Boolean descriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.description!= null));
                if (descriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDescription;
                    sourceDescription = this.getDescription();
                    String copyDescription = ((String) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription, (this.description!= null)));
                    copy.setDescription(copyDescription);
                } else {
                    if (descriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.description = null;
                    }
                }
            }
            {
                Boolean numberOfHousingUnitsDetailsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfHousingUnitsDetails!= null));
                if (numberOfHousingUnitsDetailsShouldBeCopiedAndSet == Boolean.TRUE) {
                    NumberOfHousingUnitsDetails sourceNumberOfHousingUnitsDetails;
                    sourceNumberOfHousingUnitsDetails = this.getNumberOfHousingUnitsDetails();
                    NumberOfHousingUnitsDetails copyNumberOfHousingUnitsDetails = ((NumberOfHousingUnitsDetails) strategy.copy(LocatorUtils.property(locator, "numberOfHousingUnitsDetails", sourceNumberOfHousingUnitsDetails), sourceNumberOfHousingUnitsDetails, (this.numberOfHousingUnitsDetails!= null)));
                    copy.setNumberOfHousingUnitsDetails(copyNumberOfHousingUnitsDetails);
                } else {
                    if (numberOfHousingUnitsDetailsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfHousingUnitsDetails = null;
                    }
                }
            }
            {
                Boolean interiorCharacteristicsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.interiorCharacteristics!= null));
                if (interiorCharacteristicsShouldBeCopiedAndSet == Boolean.TRUE) {
                    InteriorCharacteristics sourceInteriorCharacteristics;
                    sourceInteriorCharacteristics = this.getInteriorCharacteristics();
                    InteriorCharacteristics copyInteriorCharacteristics = ((InteriorCharacteristics) strategy.copy(LocatorUtils.property(locator, "interiorCharacteristics", sourceInteriorCharacteristics), sourceInteriorCharacteristics, (this.interiorCharacteristics!= null)));
                    copy.setInteriorCharacteristics(copyInteriorCharacteristics);
                } else {
                    if (interiorCharacteristicsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.interiorCharacteristics = null;
                    }
                }
            }
            {
                Boolean interiorQualityDescriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.interiorQualityDescription!= null));
                if (interiorQualityDescriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceInteriorQualityDescription;
                    sourceInteriorQualityDescription = this.getInteriorQualityDescription();
                    String copyInteriorQualityDescription = ((String) strategy.copy(LocatorUtils.property(locator, "interiorQualityDescription", sourceInteriorQualityDescription), sourceInteriorQualityDescription, (this.interiorQualityDescription!= null)));
                    copy.setInteriorQualityDescription(copyInteriorQualityDescription);
                } else {
                    if (interiorQualityDescriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.interiorQualityDescription = null;
                    }
                }
            }
            {
                Boolean locationDescriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.locationDescription!= null));
                if (locationDescriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLocationDescription;
                    sourceLocationDescription = this.getLocationDescription();
                    String copyLocationDescription = ((String) strategy.copy(LocatorUtils.property(locator, "locationDescription", sourceLocationDescription), sourceLocationDescription, (this.locationDescription!= null)));
                    copy.setLocationDescription(copyLocationDescription);
                } else {
                    if (locationDescriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.locationDescription = null;
                    }
                }
            }
            {
                Boolean roomsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rooms!= null));
                if (roomsShouldBeCopiedAndSet == Boolean.TRUE) {
                    NumberOfRoomsRange sourceRooms;
                    sourceRooms = this.getRooms();
                    NumberOfRoomsRange copyRooms = ((NumberOfRoomsRange) strategy.copy(LocatorUtils.property(locator, "rooms", sourceRooms), sourceRooms, (this.rooms!= null)));
                    copy.setRooms(copyRooms);
                } else {
                    if (roomsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.rooms = null;
                    }
                }
            }
            {
                Boolean companyNameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.companyName!= null));
                if (companyNameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCompanyName;
                    sourceCompanyName = this.getCompanyName();
                    String copyCompanyName = ((String) strategy.copy(LocatorUtils.property(locator, "companyName", sourceCompanyName), sourceCompanyName, (this.companyName!= null)));
                    copy.setCompanyName(copyCompanyName);
                } else {
                    if (companyNameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.companyName = null;
                    }
                }
            }
            {
                Boolean contactShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.contact!= null));
                if (contactShouldBeCopiedAndSet == Boolean.TRUE) {
                    Contact sourceContact;
                    sourceContact = this.getContact();
                    Contact copyContact = ((Contact) strategy.copy(LocatorUtils.property(locator, "contact", sourceContact), sourceContact, (this.contact!= null)));
                    copy.setContact(copyContact);
                } else {
                    if (contactShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.contact = null;
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new RealEstateProject();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
            Integer lhsNumberOfHousingUnit;
            lhsNumberOfHousingUnit = this.getNumberOfHousingUnit();
            Integer rhsNumberOfHousingUnit;
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
            URI lhsHomepageUrl;
            lhsHomepageUrl = this.getHomepageUrl();
            URI rhsHomepageUrl;
            rhsHomepageUrl = that.getHomepageUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "homepageUrl", lhsHomepageUrl), LocatorUtils.property(thatLocator, "homepageUrl", rhsHomepageUrl), lhsHomepageUrl, rhsHomepageUrl, (this.homepageUrl!= null), (that.homepageUrl!= null))) {
                return false;
            }
        }
        {
            URI lhsExtProjectUrl;
            lhsExtProjectUrl = this.getExtProjectUrl();
            URI rhsExtProjectUrl;
            rhsExtProjectUrl = that.getExtProjectUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extProjectUrl", lhsExtProjectUrl), LocatorUtils.property(thatLocator, "extProjectUrl", rhsExtProjectUrl), lhsExtProjectUrl, rhsExtProjectUrl, (this.extProjectUrl!= null), (that.extProjectUrl!= null))) {
                return false;
            }
        }
        {
            Customization lhsCustomization;
            lhsCustomization = this.getCustomization();
            Customization rhsCustomization;
            rhsCustomization = that.getCustomization();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customization", lhsCustomization), LocatorUtils.property(thatLocator, "customization", rhsCustomization), lhsCustomization, rhsCustomization, (this.customization!= null), (that.customization!= null))) {
                return false;
            }
        }
        {
            ContactFormFields lhsEnabledContactFormFields;
            lhsEnabledContactFormFields = this.getEnabledContactFormFields();
            ContactFormFields rhsEnabledContactFormFields;
            rhsEnabledContactFormFields = that.getEnabledContactFormFields();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "enabledContactFormFields", lhsEnabledContactFormFields), LocatorUtils.property(thatLocator, "enabledContactFormFields", rhsEnabledContactFormFields), lhsEnabledContactFormFields, rhsEnabledContactFormFields, (this.enabledContactFormFields!= null), (that.enabledContactFormFields!= null))) {
                return false;
            }
        }
        {
            String lhsReferenceNumber;
            lhsReferenceNumber = this.getReferenceNumber();
            String rhsReferenceNumber;
            rhsReferenceNumber = that.getReferenceNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceNumber", lhsReferenceNumber), LocatorUtils.property(thatLocator, "referenceNumber", rhsReferenceNumber), lhsReferenceNumber, rhsReferenceNumber, (this.referenceNumber!= null), (that.referenceNumber!= null))) {
                return false;
            }
        }
        {
            Address lhsShowroom;
            lhsShowroom = this.getShowroom();
            Address rhsShowroom;
            rhsShowroom = that.getShowroom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "showroom", lhsShowroom), LocatorUtils.property(thatLocator, "showroom", rhsShowroom), lhsShowroom, rhsShowroom, (this.showroom!= null), (that.showroom!= null))) {
                return false;
            }
        }
        {
            PercentType lhsSalesProgress;
            lhsSalesProgress = this.getSalesProgress();
            PercentType rhsSalesProgress;
            rhsSalesProgress = that.getSalesProgress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesProgress", lhsSalesProgress), LocatorUtils.property(thatLocator, "salesProgress", rhsSalesProgress), lhsSalesProgress, rhsSalesProgress, (this.salesProgress!= null), (that.salesProgress!= null))) {
                return false;
            }
        }
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, (this.description!= null), (that.description!= null))) {
                return false;
            }
        }
        {
            NumberOfHousingUnitsDetails lhsNumberOfHousingUnitsDetails;
            lhsNumberOfHousingUnitsDetails = this.getNumberOfHousingUnitsDetails();
            NumberOfHousingUnitsDetails rhsNumberOfHousingUnitsDetails;
            rhsNumberOfHousingUnitsDetails = that.getNumberOfHousingUnitsDetails();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfHousingUnitsDetails", lhsNumberOfHousingUnitsDetails), LocatorUtils.property(thatLocator, "numberOfHousingUnitsDetails", rhsNumberOfHousingUnitsDetails), lhsNumberOfHousingUnitsDetails, rhsNumberOfHousingUnitsDetails, (this.numberOfHousingUnitsDetails!= null), (that.numberOfHousingUnitsDetails!= null))) {
                return false;
            }
        }
        {
            InteriorCharacteristics lhsInteriorCharacteristics;
            lhsInteriorCharacteristics = this.getInteriorCharacteristics();
            InteriorCharacteristics rhsInteriorCharacteristics;
            rhsInteriorCharacteristics = that.getInteriorCharacteristics();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "interiorCharacteristics", lhsInteriorCharacteristics), LocatorUtils.property(thatLocator, "interiorCharacteristics", rhsInteriorCharacteristics), lhsInteriorCharacteristics, rhsInteriorCharacteristics, (this.interiorCharacteristics!= null), (that.interiorCharacteristics!= null))) {
                return false;
            }
        }
        {
            String lhsInteriorQualityDescription;
            lhsInteriorQualityDescription = this.getInteriorQualityDescription();
            String rhsInteriorQualityDescription;
            rhsInteriorQualityDescription = that.getInteriorQualityDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "interiorQualityDescription", lhsInteriorQualityDescription), LocatorUtils.property(thatLocator, "interiorQualityDescription", rhsInteriorQualityDescription), lhsInteriorQualityDescription, rhsInteriorQualityDescription, (this.interiorQualityDescription!= null), (that.interiorQualityDescription!= null))) {
                return false;
            }
        }
        {
            String lhsLocationDescription;
            lhsLocationDescription = this.getLocationDescription();
            String rhsLocationDescription;
            rhsLocationDescription = that.getLocationDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "locationDescription", lhsLocationDescription), LocatorUtils.property(thatLocator, "locationDescription", rhsLocationDescription), lhsLocationDescription, rhsLocationDescription, (this.locationDescription!= null), (that.locationDescription!= null))) {
                return false;
            }
        }
        {
            NumberOfRoomsRange lhsRooms;
            lhsRooms = this.getRooms();
            NumberOfRoomsRange rhsRooms;
            rhsRooms = that.getRooms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rooms", lhsRooms), LocatorUtils.property(thatLocator, "rooms", rhsRooms), lhsRooms, rhsRooms, (this.rooms!= null), (that.rooms!= null))) {
                return false;
            }
        }
        {
            String lhsCompanyName;
            lhsCompanyName = this.getCompanyName();
            String rhsCompanyName;
            rhsCompanyName = that.getCompanyName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "companyName", lhsCompanyName), LocatorUtils.property(thatLocator, "companyName", rhsCompanyName), lhsCompanyName, rhsCompanyName, (this.companyName!= null), (that.companyName!= null))) {
                return false;
            }
        }
        {
            Contact lhsContact;
            lhsContact = this.getContact();
            Contact rhsContact;
            rhsContact = that.getContact();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contact", lhsContact), LocatorUtils.property(thatLocator, "contact", rhsContact), lhsContact, rhsContact, (this.contact!= null), (that.contact!= null))) {
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

}
