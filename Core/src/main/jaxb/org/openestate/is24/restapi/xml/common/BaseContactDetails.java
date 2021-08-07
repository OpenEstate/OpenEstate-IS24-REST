
package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import java.net.URI;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
import org.openestate.is24.restapi.xml.Adapter4;


/**
 * <p>Java class for BaseContactDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseContactDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="email" type="{http://rest.immobilienscout24.de/schema/common/1.0}Email" minOccurs="0"/&gt;
 *         &lt;element name="salutation" type="{http://rest.immobilienscout24.de/schema/common/1.0}SalutationType" minOccurs="0"/&gt;
 *         &lt;element name="firstname" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="lastname" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="faxNumberCountryCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\+[1-9]\d{0,3}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="faxNumberAreaCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d{1,10}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="faxNumberSubscriber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[\d][\d \-]{0,24}[\d]"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="faxNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="(\+[1-9]\d{0,3}) +\d{1,10} +([\d][\d \-]{0,24}[\d])"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="phoneNumberCountryCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\+[1-9]\d{0,3}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="phoneNumberAreaCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d{1,10}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="phoneNumberSubscriber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[\d][\d \-]{0,24}[\d]"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="phoneNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="(\+[1-9]\d{0,3}) +\d{1,10} +([\d][\d \-]{0,24}[\d])"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cellPhoneNumberCountryCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\+[1-9]\d{0,3}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cellPhoneNumberAreaCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d{1,10}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cellPhoneNumberSubscriber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[\d][\d \-]{0,24}[\d]"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cellPhoneNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="(\+[1-9]\d{0,3}) +\d{1,10} +([\d][\d \-]{0,24}[\d])"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="address" type="{http://rest.immobilienscout24.de/schema/common/1.0}Address" minOccurs="0"/&gt;
 *         &lt;element name="countryCode" type="{http://rest.immobilienscout24.de/schema/common/1.0}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="title" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="additionName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="company" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="homepageUrl" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI"&gt;
 *               &lt;maxLength value="300"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="portraitUrl" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI"&gt;
 *               &lt;maxLength value="300"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="position" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
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
@XmlType(name = "BaseContactDetails", propOrder = {
    "email",
    "salutation",
    "firstname",
    "lastname",
    "faxNumberCountryCode",
    "faxNumberAreaCode",
    "faxNumberSubscriber",
    "faxNumber",
    "phoneNumberCountryCode",
    "phoneNumberAreaCode",
    "phoneNumberSubscriber",
    "phoneNumber",
    "cellPhoneNumberCountryCode",
    "cellPhoneNumberAreaCode",
    "cellPhoneNumberSubscriber",
    "cellPhoneNumber",
    "address",
    "countryCode",
    "title",
    "additionName",
    "company",
    "homepageUrl",
    "portraitUrl",
    "position"
})
@XmlSeeAlso({
    MasterDataContactDetailsType.class,
    ContactDetails.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
public class BaseContactDetails implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlJavaTypeAdapter(Adapter5 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected String email;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected SalutationType salutation;
    @XmlJavaTypeAdapter(Adapter40 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected String firstname;
    @XmlJavaTypeAdapter(Adapter41 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected String lastname;
    @XmlJavaTypeAdapter(Adapter42 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected String faxNumberCountryCode;
    @XmlJavaTypeAdapter(Adapter43 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected String faxNumberAreaCode;
    @XmlJavaTypeAdapter(Adapter44 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected String faxNumberSubscriber;
    @XmlJavaTypeAdapter(Adapter45 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected String faxNumber;
    @XmlJavaTypeAdapter(Adapter46 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected String phoneNumberCountryCode;
    @XmlJavaTypeAdapter(Adapter47 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected String phoneNumberAreaCode;
    @XmlJavaTypeAdapter(Adapter48 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected String phoneNumberSubscriber;
    @XmlJavaTypeAdapter(Adapter49 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected String phoneNumber;
    @XmlJavaTypeAdapter(Adapter50 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected String cellPhoneNumberCountryCode;
    @XmlJavaTypeAdapter(Adapter51 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected String cellPhoneNumberAreaCode;
    @XmlJavaTypeAdapter(Adapter52 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected String cellPhoneNumberSubscriber;
    @XmlJavaTypeAdapter(Adapter53 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected String cellPhoneNumber;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected Address address;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected CountryCode countryCode;
    @XmlJavaTypeAdapter(Adapter54 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected String title;
    @XmlJavaTypeAdapter(Adapter55 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected String additionName;
    @XmlJavaTypeAdapter(Adapter56 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected String company;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected URI homepageUrl;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected URI portraitUrl;
    @XmlJavaTypeAdapter(Adapter57 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected String position;

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the salutation property.
     * 
     * @return
     *     possible object is
     *     {@link SalutationType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public SalutationType getSalutation() {
        return salutation;
    }

    /**
     * Sets the value of the salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalutationType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setSalutation(SalutationType value) {
        this.salutation = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the faxNumberCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public String getFaxNumberCountryCode() {
        return faxNumberCountryCode;
    }

    /**
     * Sets the value of the faxNumberCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setFaxNumberCountryCode(String value) {
        this.faxNumberCountryCode = value;
    }

    /**
     * Gets the value of the faxNumberAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public String getFaxNumberAreaCode() {
        return faxNumberAreaCode;
    }

    /**
     * Sets the value of the faxNumberAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setFaxNumberAreaCode(String value) {
        this.faxNumberAreaCode = value;
    }

    /**
     * Gets the value of the faxNumberSubscriber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public String getFaxNumberSubscriber() {
        return faxNumberSubscriber;
    }

    /**
     * Sets the value of the faxNumberSubscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setFaxNumberSubscriber(String value) {
        this.faxNumberSubscriber = value;
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setFaxNumber(String value) {
        this.faxNumber = value;
    }

    /**
     * Gets the value of the phoneNumberCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public String getPhoneNumberCountryCode() {
        return phoneNumberCountryCode;
    }

    /**
     * Sets the value of the phoneNumberCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setPhoneNumberCountryCode(String value) {
        this.phoneNumberCountryCode = value;
    }

    /**
     * Gets the value of the phoneNumberAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public String getPhoneNumberAreaCode() {
        return phoneNumberAreaCode;
    }

    /**
     * Sets the value of the phoneNumberAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setPhoneNumberAreaCode(String value) {
        this.phoneNumberAreaCode = value;
    }

    /**
     * Gets the value of the phoneNumberSubscriber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public String getPhoneNumberSubscriber() {
        return phoneNumberSubscriber;
    }

    /**
     * Sets the value of the phoneNumberSubscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setPhoneNumberSubscriber(String value) {
        this.phoneNumberSubscriber = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the cellPhoneNumberCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public String getCellPhoneNumberCountryCode() {
        return cellPhoneNumberCountryCode;
    }

    /**
     * Sets the value of the cellPhoneNumberCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setCellPhoneNumberCountryCode(String value) {
        this.cellPhoneNumberCountryCode = value;
    }

    /**
     * Gets the value of the cellPhoneNumberAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public String getCellPhoneNumberAreaCode() {
        return cellPhoneNumberAreaCode;
    }

    /**
     * Sets the value of the cellPhoneNumberAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setCellPhoneNumberAreaCode(String value) {
        this.cellPhoneNumberAreaCode = value;
    }

    /**
     * Gets the value of the cellPhoneNumberSubscriber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public String getCellPhoneNumberSubscriber() {
        return cellPhoneNumberSubscriber;
    }

    /**
     * Sets the value of the cellPhoneNumberSubscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setCellPhoneNumberSubscriber(String value) {
        this.cellPhoneNumberSubscriber = value;
    }

    /**
     * Gets the value of the cellPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    /**
     * Sets the value of the cellPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setCellPhoneNumber(String value) {
        this.cellPhoneNumber = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public CountryCode getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setCountryCode(CountryCode value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the additionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public String getAdditionName() {
        return additionName;
    }

    /**
     * Sets the value of the additionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setAdditionName(String value) {
        this.additionName = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the homepageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setHomepageUrl(URI value) {
        this.homepageUrl = value;
    }

    /**
     * Gets the value of the portraitUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public URI getPortraitUrl() {
        return portraitUrl;
    }

    /**
     * Sets the value of the portraitUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setPortraitUrl(URI value) {
        this.portraitUrl = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setPosition(String value) {
        this.position = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String theEmail;
            theEmail = this.getEmail();
            strategy.appendField(locator, this, "email", buffer, theEmail, (this.email!= null));
        }
        {
            SalutationType theSalutation;
            theSalutation = this.getSalutation();
            strategy.appendField(locator, this, "salutation", buffer, theSalutation, (this.salutation!= null));
        }
        {
            String theFirstname;
            theFirstname = this.getFirstname();
            strategy.appendField(locator, this, "firstname", buffer, theFirstname, (this.firstname!= null));
        }
        {
            String theLastname;
            theLastname = this.getLastname();
            strategy.appendField(locator, this, "lastname", buffer, theLastname, (this.lastname!= null));
        }
        {
            String theFaxNumberCountryCode;
            theFaxNumberCountryCode = this.getFaxNumberCountryCode();
            strategy.appendField(locator, this, "faxNumberCountryCode", buffer, theFaxNumberCountryCode, (this.faxNumberCountryCode!= null));
        }
        {
            String theFaxNumberAreaCode;
            theFaxNumberAreaCode = this.getFaxNumberAreaCode();
            strategy.appendField(locator, this, "faxNumberAreaCode", buffer, theFaxNumberAreaCode, (this.faxNumberAreaCode!= null));
        }
        {
            String theFaxNumberSubscriber;
            theFaxNumberSubscriber = this.getFaxNumberSubscriber();
            strategy.appendField(locator, this, "faxNumberSubscriber", buffer, theFaxNumberSubscriber, (this.faxNumberSubscriber!= null));
        }
        {
            String theFaxNumber;
            theFaxNumber = this.getFaxNumber();
            strategy.appendField(locator, this, "faxNumber", buffer, theFaxNumber, (this.faxNumber!= null));
        }
        {
            String thePhoneNumberCountryCode;
            thePhoneNumberCountryCode = this.getPhoneNumberCountryCode();
            strategy.appendField(locator, this, "phoneNumberCountryCode", buffer, thePhoneNumberCountryCode, (this.phoneNumberCountryCode!= null));
        }
        {
            String thePhoneNumberAreaCode;
            thePhoneNumberAreaCode = this.getPhoneNumberAreaCode();
            strategy.appendField(locator, this, "phoneNumberAreaCode", buffer, thePhoneNumberAreaCode, (this.phoneNumberAreaCode!= null));
        }
        {
            String thePhoneNumberSubscriber;
            thePhoneNumberSubscriber = this.getPhoneNumberSubscriber();
            strategy.appendField(locator, this, "phoneNumberSubscriber", buffer, thePhoneNumberSubscriber, (this.phoneNumberSubscriber!= null));
        }
        {
            String thePhoneNumber;
            thePhoneNumber = this.getPhoneNumber();
            strategy.appendField(locator, this, "phoneNumber", buffer, thePhoneNumber, (this.phoneNumber!= null));
        }
        {
            String theCellPhoneNumberCountryCode;
            theCellPhoneNumberCountryCode = this.getCellPhoneNumberCountryCode();
            strategy.appendField(locator, this, "cellPhoneNumberCountryCode", buffer, theCellPhoneNumberCountryCode, (this.cellPhoneNumberCountryCode!= null));
        }
        {
            String theCellPhoneNumberAreaCode;
            theCellPhoneNumberAreaCode = this.getCellPhoneNumberAreaCode();
            strategy.appendField(locator, this, "cellPhoneNumberAreaCode", buffer, theCellPhoneNumberAreaCode, (this.cellPhoneNumberAreaCode!= null));
        }
        {
            String theCellPhoneNumberSubscriber;
            theCellPhoneNumberSubscriber = this.getCellPhoneNumberSubscriber();
            strategy.appendField(locator, this, "cellPhoneNumberSubscriber", buffer, theCellPhoneNumberSubscriber, (this.cellPhoneNumberSubscriber!= null));
        }
        {
            String theCellPhoneNumber;
            theCellPhoneNumber = this.getCellPhoneNumber();
            strategy.appendField(locator, this, "cellPhoneNumber", buffer, theCellPhoneNumber, (this.cellPhoneNumber!= null));
        }
        {
            Address theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress, (this.address!= null));
        }
        {
            CountryCode theCountryCode;
            theCountryCode = this.getCountryCode();
            strategy.appendField(locator, this, "countryCode", buffer, theCountryCode, (this.countryCode!= null));
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle, (this.title!= null));
        }
        {
            String theAdditionName;
            theAdditionName = this.getAdditionName();
            strategy.appendField(locator, this, "additionName", buffer, theAdditionName, (this.additionName!= null));
        }
        {
            String theCompany;
            theCompany = this.getCompany();
            strategy.appendField(locator, this, "company", buffer, theCompany, (this.company!= null));
        }
        {
            URI theHomepageUrl;
            theHomepageUrl = this.getHomepageUrl();
            strategy.appendField(locator, this, "homepageUrl", buffer, theHomepageUrl, (this.homepageUrl!= null));
        }
        {
            URI thePortraitUrl;
            thePortraitUrl = this.getPortraitUrl();
            strategy.appendField(locator, this, "portraitUrl", buffer, thePortraitUrl, (this.portraitUrl!= null));
        }
        {
            String thePosition;
            thePosition = this.getPosition();
            strategy.appendField(locator, this, "position", buffer, thePosition, (this.position!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof BaseContactDetails) {
            final BaseContactDetails copy = ((BaseContactDetails) draftCopy);
            {
                Boolean emailShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.email!= null));
                if (emailShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEmail;
                    sourceEmail = this.getEmail();
                    String copyEmail = ((String) strategy.copy(LocatorUtils.property(locator, "email", sourceEmail), sourceEmail, (this.email!= null)));
                    copy.setEmail(copyEmail);
                } else {
                    if (emailShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.email = null;
                    }
                }
            }
            {
                Boolean salutationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.salutation!= null));
                if (salutationShouldBeCopiedAndSet == Boolean.TRUE) {
                    SalutationType sourceSalutation;
                    sourceSalutation = this.getSalutation();
                    SalutationType copySalutation = ((SalutationType) strategy.copy(LocatorUtils.property(locator, "salutation", sourceSalutation), sourceSalutation, (this.salutation!= null)));
                    copy.setSalutation(copySalutation);
                } else {
                    if (salutationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.salutation = null;
                    }
                }
            }
            {
                Boolean firstnameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.firstname!= null));
                if (firstnameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFirstname;
                    sourceFirstname = this.getFirstname();
                    String copyFirstname = ((String) strategy.copy(LocatorUtils.property(locator, "firstname", sourceFirstname), sourceFirstname, (this.firstname!= null)));
                    copy.setFirstname(copyFirstname);
                } else {
                    if (firstnameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.firstname = null;
                    }
                }
            }
            {
                Boolean lastnameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lastname!= null));
                if (lastnameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLastname;
                    sourceLastname = this.getLastname();
                    String copyLastname = ((String) strategy.copy(LocatorUtils.property(locator, "lastname", sourceLastname), sourceLastname, (this.lastname!= null)));
                    copy.setLastname(copyLastname);
                } else {
                    if (lastnameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lastname = null;
                    }
                }
            }
            {
                Boolean faxNumberCountryCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.faxNumberCountryCode!= null));
                if (faxNumberCountryCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFaxNumberCountryCode;
                    sourceFaxNumberCountryCode = this.getFaxNumberCountryCode();
                    String copyFaxNumberCountryCode = ((String) strategy.copy(LocatorUtils.property(locator, "faxNumberCountryCode", sourceFaxNumberCountryCode), sourceFaxNumberCountryCode, (this.faxNumberCountryCode!= null)));
                    copy.setFaxNumberCountryCode(copyFaxNumberCountryCode);
                } else {
                    if (faxNumberCountryCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.faxNumberCountryCode = null;
                    }
                }
            }
            {
                Boolean faxNumberAreaCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.faxNumberAreaCode!= null));
                if (faxNumberAreaCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFaxNumberAreaCode;
                    sourceFaxNumberAreaCode = this.getFaxNumberAreaCode();
                    String copyFaxNumberAreaCode = ((String) strategy.copy(LocatorUtils.property(locator, "faxNumberAreaCode", sourceFaxNumberAreaCode), sourceFaxNumberAreaCode, (this.faxNumberAreaCode!= null)));
                    copy.setFaxNumberAreaCode(copyFaxNumberAreaCode);
                } else {
                    if (faxNumberAreaCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.faxNumberAreaCode = null;
                    }
                }
            }
            {
                Boolean faxNumberSubscriberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.faxNumberSubscriber!= null));
                if (faxNumberSubscriberShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFaxNumberSubscriber;
                    sourceFaxNumberSubscriber = this.getFaxNumberSubscriber();
                    String copyFaxNumberSubscriber = ((String) strategy.copy(LocatorUtils.property(locator, "faxNumberSubscriber", sourceFaxNumberSubscriber), sourceFaxNumberSubscriber, (this.faxNumberSubscriber!= null)));
                    copy.setFaxNumberSubscriber(copyFaxNumberSubscriber);
                } else {
                    if (faxNumberSubscriberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.faxNumberSubscriber = null;
                    }
                }
            }
            {
                Boolean faxNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.faxNumber!= null));
                if (faxNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFaxNumber;
                    sourceFaxNumber = this.getFaxNumber();
                    String copyFaxNumber = ((String) strategy.copy(LocatorUtils.property(locator, "faxNumber", sourceFaxNumber), sourceFaxNumber, (this.faxNumber!= null)));
                    copy.setFaxNumber(copyFaxNumber);
                } else {
                    if (faxNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.faxNumber = null;
                    }
                }
            }
            {
                Boolean phoneNumberCountryCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.phoneNumberCountryCode!= null));
                if (phoneNumberCountryCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePhoneNumberCountryCode;
                    sourcePhoneNumberCountryCode = this.getPhoneNumberCountryCode();
                    String copyPhoneNumberCountryCode = ((String) strategy.copy(LocatorUtils.property(locator, "phoneNumberCountryCode", sourcePhoneNumberCountryCode), sourcePhoneNumberCountryCode, (this.phoneNumberCountryCode!= null)));
                    copy.setPhoneNumberCountryCode(copyPhoneNumberCountryCode);
                } else {
                    if (phoneNumberCountryCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.phoneNumberCountryCode = null;
                    }
                }
            }
            {
                Boolean phoneNumberAreaCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.phoneNumberAreaCode!= null));
                if (phoneNumberAreaCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePhoneNumberAreaCode;
                    sourcePhoneNumberAreaCode = this.getPhoneNumberAreaCode();
                    String copyPhoneNumberAreaCode = ((String) strategy.copy(LocatorUtils.property(locator, "phoneNumberAreaCode", sourcePhoneNumberAreaCode), sourcePhoneNumberAreaCode, (this.phoneNumberAreaCode!= null)));
                    copy.setPhoneNumberAreaCode(copyPhoneNumberAreaCode);
                } else {
                    if (phoneNumberAreaCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.phoneNumberAreaCode = null;
                    }
                }
            }
            {
                Boolean phoneNumberSubscriberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.phoneNumberSubscriber!= null));
                if (phoneNumberSubscriberShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePhoneNumberSubscriber;
                    sourcePhoneNumberSubscriber = this.getPhoneNumberSubscriber();
                    String copyPhoneNumberSubscriber = ((String) strategy.copy(LocatorUtils.property(locator, "phoneNumberSubscriber", sourcePhoneNumberSubscriber), sourcePhoneNumberSubscriber, (this.phoneNumberSubscriber!= null)));
                    copy.setPhoneNumberSubscriber(copyPhoneNumberSubscriber);
                } else {
                    if (phoneNumberSubscriberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.phoneNumberSubscriber = null;
                    }
                }
            }
            {
                Boolean phoneNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.phoneNumber!= null));
                if (phoneNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePhoneNumber;
                    sourcePhoneNumber = this.getPhoneNumber();
                    String copyPhoneNumber = ((String) strategy.copy(LocatorUtils.property(locator, "phoneNumber", sourcePhoneNumber), sourcePhoneNumber, (this.phoneNumber!= null)));
                    copy.setPhoneNumber(copyPhoneNumber);
                } else {
                    if (phoneNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.phoneNumber = null;
                    }
                }
            }
            {
                Boolean cellPhoneNumberCountryCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.cellPhoneNumberCountryCode!= null));
                if (cellPhoneNumberCountryCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCellPhoneNumberCountryCode;
                    sourceCellPhoneNumberCountryCode = this.getCellPhoneNumberCountryCode();
                    String copyCellPhoneNumberCountryCode = ((String) strategy.copy(LocatorUtils.property(locator, "cellPhoneNumberCountryCode", sourceCellPhoneNumberCountryCode), sourceCellPhoneNumberCountryCode, (this.cellPhoneNumberCountryCode!= null)));
                    copy.setCellPhoneNumberCountryCode(copyCellPhoneNumberCountryCode);
                } else {
                    if (cellPhoneNumberCountryCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cellPhoneNumberCountryCode = null;
                    }
                }
            }
            {
                Boolean cellPhoneNumberAreaCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.cellPhoneNumberAreaCode!= null));
                if (cellPhoneNumberAreaCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCellPhoneNumberAreaCode;
                    sourceCellPhoneNumberAreaCode = this.getCellPhoneNumberAreaCode();
                    String copyCellPhoneNumberAreaCode = ((String) strategy.copy(LocatorUtils.property(locator, "cellPhoneNumberAreaCode", sourceCellPhoneNumberAreaCode), sourceCellPhoneNumberAreaCode, (this.cellPhoneNumberAreaCode!= null)));
                    copy.setCellPhoneNumberAreaCode(copyCellPhoneNumberAreaCode);
                } else {
                    if (cellPhoneNumberAreaCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cellPhoneNumberAreaCode = null;
                    }
                }
            }
            {
                Boolean cellPhoneNumberSubscriberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.cellPhoneNumberSubscriber!= null));
                if (cellPhoneNumberSubscriberShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCellPhoneNumberSubscriber;
                    sourceCellPhoneNumberSubscriber = this.getCellPhoneNumberSubscriber();
                    String copyCellPhoneNumberSubscriber = ((String) strategy.copy(LocatorUtils.property(locator, "cellPhoneNumberSubscriber", sourceCellPhoneNumberSubscriber), sourceCellPhoneNumberSubscriber, (this.cellPhoneNumberSubscriber!= null)));
                    copy.setCellPhoneNumberSubscriber(copyCellPhoneNumberSubscriber);
                } else {
                    if (cellPhoneNumberSubscriberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cellPhoneNumberSubscriber = null;
                    }
                }
            }
            {
                Boolean cellPhoneNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.cellPhoneNumber!= null));
                if (cellPhoneNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCellPhoneNumber;
                    sourceCellPhoneNumber = this.getCellPhoneNumber();
                    String copyCellPhoneNumber = ((String) strategy.copy(LocatorUtils.property(locator, "cellPhoneNumber", sourceCellPhoneNumber), sourceCellPhoneNumber, (this.cellPhoneNumber!= null)));
                    copy.setCellPhoneNumber(copyCellPhoneNumber);
                } else {
                    if (cellPhoneNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cellPhoneNumber = null;
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
                Boolean countryCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.countryCode!= null));
                if (countryCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    CountryCode sourceCountryCode;
                    sourceCountryCode = this.getCountryCode();
                    CountryCode copyCountryCode = ((CountryCode) strategy.copy(LocatorUtils.property(locator, "countryCode", sourceCountryCode), sourceCountryCode, (this.countryCode!= null)));
                    copy.setCountryCode(copyCountryCode);
                } else {
                    if (countryCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.countryCode = null;
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
                Boolean additionNameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.additionName!= null));
                if (additionNameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAdditionName;
                    sourceAdditionName = this.getAdditionName();
                    String copyAdditionName = ((String) strategy.copy(LocatorUtils.property(locator, "additionName", sourceAdditionName), sourceAdditionName, (this.additionName!= null)));
                    copy.setAdditionName(copyAdditionName);
                } else {
                    if (additionNameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.additionName = null;
                    }
                }
            }
            {
                Boolean companyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.company!= null));
                if (companyShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCompany;
                    sourceCompany = this.getCompany();
                    String copyCompany = ((String) strategy.copy(LocatorUtils.property(locator, "company", sourceCompany), sourceCompany, (this.company!= null)));
                    copy.setCompany(copyCompany);
                } else {
                    if (companyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.company = null;
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
                Boolean portraitUrlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.portraitUrl!= null));
                if (portraitUrlShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourcePortraitUrl;
                    sourcePortraitUrl = this.getPortraitUrl();
                    URI copyPortraitUrl = ((URI) strategy.copy(LocatorUtils.property(locator, "portraitUrl", sourcePortraitUrl), sourcePortraitUrl, (this.portraitUrl!= null)));
                    copy.setPortraitUrl(copyPortraitUrl);
                } else {
                    if (portraitUrlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.portraitUrl = null;
                    }
                }
            }
            {
                Boolean positionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.position!= null));
                if (positionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePosition;
                    sourcePosition = this.getPosition();
                    String copyPosition = ((String) strategy.copy(LocatorUtils.property(locator, "position", sourcePosition), sourcePosition, (this.position!= null)));
                    copy.setPosition(copyPosition);
                } else {
                    if (positionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.position = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new BaseContactDetails();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BaseContactDetails that = ((BaseContactDetails) object);
        {
            String lhsEmail;
            lhsEmail = this.getEmail();
            String rhsEmail;
            rhsEmail = that.getEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "email", lhsEmail), LocatorUtils.property(thatLocator, "email", rhsEmail), lhsEmail, rhsEmail, (this.email!= null), (that.email!= null))) {
                return false;
            }
        }
        {
            SalutationType lhsSalutation;
            lhsSalutation = this.getSalutation();
            SalutationType rhsSalutation;
            rhsSalutation = that.getSalutation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salutation", lhsSalutation), LocatorUtils.property(thatLocator, "salutation", rhsSalutation), lhsSalutation, rhsSalutation, (this.salutation!= null), (that.salutation!= null))) {
                return false;
            }
        }
        {
            String lhsFirstname;
            lhsFirstname = this.getFirstname();
            String rhsFirstname;
            rhsFirstname = that.getFirstname();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firstname", lhsFirstname), LocatorUtils.property(thatLocator, "firstname", rhsFirstname), lhsFirstname, rhsFirstname, (this.firstname!= null), (that.firstname!= null))) {
                return false;
            }
        }
        {
            String lhsLastname;
            lhsLastname = this.getLastname();
            String rhsLastname;
            rhsLastname = that.getLastname();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastname", lhsLastname), LocatorUtils.property(thatLocator, "lastname", rhsLastname), lhsLastname, rhsLastname, (this.lastname!= null), (that.lastname!= null))) {
                return false;
            }
        }
        {
            String lhsFaxNumberCountryCode;
            lhsFaxNumberCountryCode = this.getFaxNumberCountryCode();
            String rhsFaxNumberCountryCode;
            rhsFaxNumberCountryCode = that.getFaxNumberCountryCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "faxNumberCountryCode", lhsFaxNumberCountryCode), LocatorUtils.property(thatLocator, "faxNumberCountryCode", rhsFaxNumberCountryCode), lhsFaxNumberCountryCode, rhsFaxNumberCountryCode, (this.faxNumberCountryCode!= null), (that.faxNumberCountryCode!= null))) {
                return false;
            }
        }
        {
            String lhsFaxNumberAreaCode;
            lhsFaxNumberAreaCode = this.getFaxNumberAreaCode();
            String rhsFaxNumberAreaCode;
            rhsFaxNumberAreaCode = that.getFaxNumberAreaCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "faxNumberAreaCode", lhsFaxNumberAreaCode), LocatorUtils.property(thatLocator, "faxNumberAreaCode", rhsFaxNumberAreaCode), lhsFaxNumberAreaCode, rhsFaxNumberAreaCode, (this.faxNumberAreaCode!= null), (that.faxNumberAreaCode!= null))) {
                return false;
            }
        }
        {
            String lhsFaxNumberSubscriber;
            lhsFaxNumberSubscriber = this.getFaxNumberSubscriber();
            String rhsFaxNumberSubscriber;
            rhsFaxNumberSubscriber = that.getFaxNumberSubscriber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "faxNumberSubscriber", lhsFaxNumberSubscriber), LocatorUtils.property(thatLocator, "faxNumberSubscriber", rhsFaxNumberSubscriber), lhsFaxNumberSubscriber, rhsFaxNumberSubscriber, (this.faxNumberSubscriber!= null), (that.faxNumberSubscriber!= null))) {
                return false;
            }
        }
        {
            String lhsFaxNumber;
            lhsFaxNumber = this.getFaxNumber();
            String rhsFaxNumber;
            rhsFaxNumber = that.getFaxNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "faxNumber", lhsFaxNumber), LocatorUtils.property(thatLocator, "faxNumber", rhsFaxNumber), lhsFaxNumber, rhsFaxNumber, (this.faxNumber!= null), (that.faxNumber!= null))) {
                return false;
            }
        }
        {
            String lhsPhoneNumberCountryCode;
            lhsPhoneNumberCountryCode = this.getPhoneNumberCountryCode();
            String rhsPhoneNumberCountryCode;
            rhsPhoneNumberCountryCode = that.getPhoneNumberCountryCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phoneNumberCountryCode", lhsPhoneNumberCountryCode), LocatorUtils.property(thatLocator, "phoneNumberCountryCode", rhsPhoneNumberCountryCode), lhsPhoneNumberCountryCode, rhsPhoneNumberCountryCode, (this.phoneNumberCountryCode!= null), (that.phoneNumberCountryCode!= null))) {
                return false;
            }
        }
        {
            String lhsPhoneNumberAreaCode;
            lhsPhoneNumberAreaCode = this.getPhoneNumberAreaCode();
            String rhsPhoneNumberAreaCode;
            rhsPhoneNumberAreaCode = that.getPhoneNumberAreaCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phoneNumberAreaCode", lhsPhoneNumberAreaCode), LocatorUtils.property(thatLocator, "phoneNumberAreaCode", rhsPhoneNumberAreaCode), lhsPhoneNumberAreaCode, rhsPhoneNumberAreaCode, (this.phoneNumberAreaCode!= null), (that.phoneNumberAreaCode!= null))) {
                return false;
            }
        }
        {
            String lhsPhoneNumberSubscriber;
            lhsPhoneNumberSubscriber = this.getPhoneNumberSubscriber();
            String rhsPhoneNumberSubscriber;
            rhsPhoneNumberSubscriber = that.getPhoneNumberSubscriber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phoneNumberSubscriber", lhsPhoneNumberSubscriber), LocatorUtils.property(thatLocator, "phoneNumberSubscriber", rhsPhoneNumberSubscriber), lhsPhoneNumberSubscriber, rhsPhoneNumberSubscriber, (this.phoneNumberSubscriber!= null), (that.phoneNumberSubscriber!= null))) {
                return false;
            }
        }
        {
            String lhsPhoneNumber;
            lhsPhoneNumber = this.getPhoneNumber();
            String rhsPhoneNumber;
            rhsPhoneNumber = that.getPhoneNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phoneNumber", lhsPhoneNumber), LocatorUtils.property(thatLocator, "phoneNumber", rhsPhoneNumber), lhsPhoneNumber, rhsPhoneNumber, (this.phoneNumber!= null), (that.phoneNumber!= null))) {
                return false;
            }
        }
        {
            String lhsCellPhoneNumberCountryCode;
            lhsCellPhoneNumberCountryCode = this.getCellPhoneNumberCountryCode();
            String rhsCellPhoneNumberCountryCode;
            rhsCellPhoneNumberCountryCode = that.getCellPhoneNumberCountryCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cellPhoneNumberCountryCode", lhsCellPhoneNumberCountryCode), LocatorUtils.property(thatLocator, "cellPhoneNumberCountryCode", rhsCellPhoneNumberCountryCode), lhsCellPhoneNumberCountryCode, rhsCellPhoneNumberCountryCode, (this.cellPhoneNumberCountryCode!= null), (that.cellPhoneNumberCountryCode!= null))) {
                return false;
            }
        }
        {
            String lhsCellPhoneNumberAreaCode;
            lhsCellPhoneNumberAreaCode = this.getCellPhoneNumberAreaCode();
            String rhsCellPhoneNumberAreaCode;
            rhsCellPhoneNumberAreaCode = that.getCellPhoneNumberAreaCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cellPhoneNumberAreaCode", lhsCellPhoneNumberAreaCode), LocatorUtils.property(thatLocator, "cellPhoneNumberAreaCode", rhsCellPhoneNumberAreaCode), lhsCellPhoneNumberAreaCode, rhsCellPhoneNumberAreaCode, (this.cellPhoneNumberAreaCode!= null), (that.cellPhoneNumberAreaCode!= null))) {
                return false;
            }
        }
        {
            String lhsCellPhoneNumberSubscriber;
            lhsCellPhoneNumberSubscriber = this.getCellPhoneNumberSubscriber();
            String rhsCellPhoneNumberSubscriber;
            rhsCellPhoneNumberSubscriber = that.getCellPhoneNumberSubscriber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cellPhoneNumberSubscriber", lhsCellPhoneNumberSubscriber), LocatorUtils.property(thatLocator, "cellPhoneNumberSubscriber", rhsCellPhoneNumberSubscriber), lhsCellPhoneNumberSubscriber, rhsCellPhoneNumberSubscriber, (this.cellPhoneNumberSubscriber!= null), (that.cellPhoneNumberSubscriber!= null))) {
                return false;
            }
        }
        {
            String lhsCellPhoneNumber;
            lhsCellPhoneNumber = this.getCellPhoneNumber();
            String rhsCellPhoneNumber;
            rhsCellPhoneNumber = that.getCellPhoneNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cellPhoneNumber", lhsCellPhoneNumber), LocatorUtils.property(thatLocator, "cellPhoneNumber", rhsCellPhoneNumber), lhsCellPhoneNumber, rhsCellPhoneNumber, (this.cellPhoneNumber!= null), (that.cellPhoneNumber!= null))) {
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
            CountryCode lhsCountryCode;
            lhsCountryCode = this.getCountryCode();
            CountryCode rhsCountryCode;
            rhsCountryCode = that.getCountryCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countryCode", lhsCountryCode), LocatorUtils.property(thatLocator, "countryCode", rhsCountryCode), lhsCountryCode, rhsCountryCode, (this.countryCode!= null), (that.countryCode!= null))) {
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
            String lhsAdditionName;
            lhsAdditionName = this.getAdditionName();
            String rhsAdditionName;
            rhsAdditionName = that.getAdditionName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionName", lhsAdditionName), LocatorUtils.property(thatLocator, "additionName", rhsAdditionName), lhsAdditionName, rhsAdditionName, (this.additionName!= null), (that.additionName!= null))) {
                return false;
            }
        }
        {
            String lhsCompany;
            lhsCompany = this.getCompany();
            String rhsCompany;
            rhsCompany = that.getCompany();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "company", lhsCompany), LocatorUtils.property(thatLocator, "company", rhsCompany), lhsCompany, rhsCompany, (this.company!= null), (that.company!= null))) {
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
            URI lhsPortraitUrl;
            lhsPortraitUrl = this.getPortraitUrl();
            URI rhsPortraitUrl;
            rhsPortraitUrl = that.getPortraitUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "portraitUrl", lhsPortraitUrl), LocatorUtils.property(thatLocator, "portraitUrl", rhsPortraitUrl), lhsPortraitUrl, rhsPortraitUrl, (this.portraitUrl!= null), (that.portraitUrl!= null))) {
                return false;
            }
        }
        {
            String lhsPosition;
            lhsPosition = this.getPosition();
            String rhsPosition;
            rhsPosition = that.getPosition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "position", lhsPosition), LocatorUtils.property(thatLocator, "position", rhsPosition), lhsPosition, rhsPosition, (this.position!= null), (that.position!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

}
