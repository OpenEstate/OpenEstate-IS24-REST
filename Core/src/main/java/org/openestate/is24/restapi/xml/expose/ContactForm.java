
package org.openestate.is24.restapi.xml.expose;

import java.io.Serializable;
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
import org.openestate.is24.restapi.xml.common.Address;
import org.openestate.is24.restapi.xml.common.ContactFormType;
import org.openestate.is24.restapi.xml.common.ContactMailCustomStyle;
import org.openestate.is24.restapi.xml.common.SalutationType;
import org.openestate.is24.restapi.xml.common.YesNotApplicableType;


/**
 * Kontakt Request zum kontaktieren eines Anbieters
 * 
 * <p>Java class for ContactForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactForm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="firstname" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="lastname"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="phoneNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="emailAddress" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}Email"&gt;
 *               &lt;maxLength value="150"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="appointmentRequested" type="{http://rest.immobilienscout24.de/schema/common/1.0}YesNotApplicableType" minOccurs="0"/&gt;
 *         &lt;element name="message" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="address" type="{http://rest.immobilienscout24.de/schema/common/1.0}Address" minOccurs="0"/&gt;
 *         &lt;element name="contactMailCustomStyle" type="{http://rest.immobilienscout24.de/schema/common/1.0}ContactMailCustomStyle" minOccurs="0"/&gt;
 *         &lt;element name="moveInDate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="petsInHousehold" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="numberOfPersons" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="employmentRelationship" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="income" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="salutation" type="{http://rest.immobilienscout24.de/schema/common/1.0}SalutationType" minOccurs="0"/&gt;
 *         &lt;element name="schufaInformationProvided" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="schufaVerificationCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sendProfile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="profileImageUrl" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="privacyPolicyAccepted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="company" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="buyReason" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ownCapital" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hasPreapproval" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="lotAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="numberOfRequiredWorkingPlaces" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="plannedInvestment" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="commercialUsage" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="applicationPackageCompleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://rest.immobilienscout24.de/schema/search/expose/1.0}ContactFormType"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactForm", propOrder = {
    "firstname",
    "lastname",
    "phoneNumber",
    "emailAddress",
    "appointmentRequested",
    "message",
    "address",
    "contactMailCustomStyle",
    "moveInDate",
    "petsInHousehold",
    "numberOfPersons",
    "employmentRelationship",
    "income",
    "salutation",
    "schufaInformationProvided",
    "schufaVerificationCode",
    "sendProfile",
    "profileImageUrl",
    "privacyPolicyAccepted",
    "company",
    "buyReason",
    "ownCapital",
    "hasPreapproval",
    "lotAvailable",
    "numberOfRequiredWorkingPlaces",
    "plannedInvestment",
    "commercialUsage",
    "applicationPackageCompleted"
})
public class ContactForm implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlJavaTypeAdapter(Adapter4 .class)
    protected String firstname;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.expose.Adapter5 .class)
    protected String lastname;
    @XmlJavaTypeAdapter(Adapter6 .class)
    protected String phoneNumber;
    @XmlJavaTypeAdapter(org.openestate.is24.restapi.xml.common.Adapter5 .class)
    protected String emailAddress;
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType appointmentRequested;
    @XmlJavaTypeAdapter(Adapter7 .class)
    protected String message;
    protected Address address;
    protected ContactMailCustomStyle contactMailCustomStyle;
    @XmlJavaTypeAdapter(Adapter8 .class)
    protected String moveInDate;
    @XmlJavaTypeAdapter(Adapter9 .class)
    protected String petsInHousehold;
    @XmlJavaTypeAdapter(Adapter10 .class)
    protected String numberOfPersons;
    @XmlJavaTypeAdapter(Adapter11 .class)
    protected String employmentRelationship;
    @XmlJavaTypeAdapter(Adapter12 .class)
    protected String income;
    @XmlSchemaType(name = "string")
    protected SalutationType salutation;
    protected Boolean schufaInformationProvided;
    @XmlJavaTypeAdapter(Adapter13 .class)
    protected String schufaVerificationCode;
    protected Boolean sendProfile;
    @XmlJavaTypeAdapter(Adapter14 .class)
    protected String profileImageUrl;
    protected Boolean privacyPolicyAccepted;
    @XmlJavaTypeAdapter(Adapter15 .class)
    protected String company;
    @XmlJavaTypeAdapter(Adapter16 .class)
    protected String buyReason;
    @XmlJavaTypeAdapter(Adapter17 .class)
    protected String ownCapital;
    protected Boolean hasPreapproval;
    protected Boolean lotAvailable;
    protected Long numberOfRequiredWorkingPlaces;
    @XmlJavaTypeAdapter(Adapter18 .class)
    protected String plannedInvestment;
    @XmlJavaTypeAdapter(Adapter19 .class)
    protected String commercialUsage;
    protected Boolean applicationPackageCompleted;
    @XmlAttribute(name = "contactFormType")
    protected ContactFormType contactFormType;

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the appointmentRequested property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getAppointmentRequested() {
        return appointmentRequested;
    }

    /**
     * Sets the value of the appointmentRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setAppointmentRequested(YesNotApplicableType value) {
        this.appointmentRequested = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
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
     * Gets the value of the contactMailCustomStyle property.
     * 
     * @return
     *     possible object is
     *     {@link ContactMailCustomStyle }
     *     
     */
    public ContactMailCustomStyle getContactMailCustomStyle() {
        return contactMailCustomStyle;
    }

    /**
     * Sets the value of the contactMailCustomStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMailCustomStyle }
     *     
     */
    public void setContactMailCustomStyle(ContactMailCustomStyle value) {
        this.contactMailCustomStyle = value;
    }

    /**
     * Gets the value of the moveInDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoveInDate() {
        return moveInDate;
    }

    /**
     * Sets the value of the moveInDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoveInDate(String value) {
        this.moveInDate = value;
    }

    /**
     * Gets the value of the petsInHousehold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPetsInHousehold() {
        return petsInHousehold;
    }

    /**
     * Sets the value of the petsInHousehold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPetsInHousehold(String value) {
        this.petsInHousehold = value;
    }

    /**
     * Gets the value of the numberOfPersons property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfPersons() {
        return numberOfPersons;
    }

    /**
     * Sets the value of the numberOfPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfPersons(String value) {
        this.numberOfPersons = value;
    }

    /**
     * Gets the value of the employmentRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmploymentRelationship() {
        return employmentRelationship;
    }

    /**
     * Sets the value of the employmentRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmploymentRelationship(String value) {
        this.employmentRelationship = value;
    }

    /**
     * Gets the value of the income property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncome() {
        return income;
    }

    /**
     * Sets the value of the income property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncome(String value) {
        this.income = value;
    }

    /**
     * Gets the value of the salutation property.
     * 
     * @return
     *     possible object is
     *     {@link SalutationType }
     *     
     */
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
    public void setSalutation(SalutationType value) {
        this.salutation = value;
    }

    /**
     * Gets the value of the schufaInformationProvided property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSchufaInformationProvided() {
        return schufaInformationProvided;
    }

    /**
     * Sets the value of the schufaInformationProvided property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSchufaInformationProvided(Boolean value) {
        this.schufaInformationProvided = value;
    }

    /**
     * Gets the value of the schufaVerificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchufaVerificationCode() {
        return schufaVerificationCode;
    }

    /**
     * Sets the value of the schufaVerificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchufaVerificationCode(String value) {
        this.schufaVerificationCode = value;
    }

    /**
     * Gets the value of the sendProfile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendProfile() {
        return sendProfile;
    }

    /**
     * Sets the value of the sendProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendProfile(Boolean value) {
        this.sendProfile = value;
    }

    /**
     * Gets the value of the profileImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    /**
     * Sets the value of the profileImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileImageUrl(String value) {
        this.profileImageUrl = value;
    }

    /**
     * Gets the value of the privacyPolicyAccepted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrivacyPolicyAccepted() {
        return privacyPolicyAccepted;
    }

    /**
     * Sets the value of the privacyPolicyAccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrivacyPolicyAccepted(Boolean value) {
        this.privacyPolicyAccepted = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the buyReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyReason() {
        return buyReason;
    }

    /**
     * Sets the value of the buyReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyReason(String value) {
        this.buyReason = value;
    }

    /**
     * Gets the value of the ownCapital property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnCapital() {
        return ownCapital;
    }

    /**
     * Sets the value of the ownCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnCapital(String value) {
        this.ownCapital = value;
    }

    /**
     * Gets the value of the hasPreapproval property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPreapproval() {
        return hasPreapproval;
    }

    /**
     * Sets the value of the hasPreapproval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPreapproval(Boolean value) {
        this.hasPreapproval = value;
    }

    /**
     * Gets the value of the lotAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLotAvailable() {
        return lotAvailable;
    }

    /**
     * Sets the value of the lotAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLotAvailable(Boolean value) {
        this.lotAvailable = value;
    }

    /**
     * Gets the value of the numberOfRequiredWorkingPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfRequiredWorkingPlaces() {
        return numberOfRequiredWorkingPlaces;
    }

    /**
     * Sets the value of the numberOfRequiredWorkingPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfRequiredWorkingPlaces(Long value) {
        this.numberOfRequiredWorkingPlaces = value;
    }

    /**
     * Gets the value of the plannedInvestment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlannedInvestment() {
        return plannedInvestment;
    }

    /**
     * Sets the value of the plannedInvestment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlannedInvestment(String value) {
        this.plannedInvestment = value;
    }

    /**
     * Gets the value of the commercialUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialUsage() {
        return commercialUsage;
    }

    /**
     * Sets the value of the commercialUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialUsage(String value) {
        this.commercialUsage = value;
    }

    /**
     * Gets the value of the applicationPackageCompleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplicationPackageCompleted() {
        return applicationPackageCompleted;
    }

    /**
     * Sets the value of the applicationPackageCompleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplicationPackageCompleted(Boolean value) {
        this.applicationPackageCompleted = value;
    }

    /**
     * Gets the value of the contactFormType property.
     * 
     * @return
     *     possible object is
     *     {@link ContactFormType }
     *     
     */
    public ContactFormType getContactFormType() {
        return contactFormType;
    }

    /**
     * Sets the value of the contactFormType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactFormType }
     *     
     */
    public void setContactFormType(ContactFormType value) {
        this.contactFormType = value;
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
            String thePhoneNumber;
            thePhoneNumber = this.getPhoneNumber();
            strategy.appendField(locator, this, "phoneNumber", buffer, thePhoneNumber, (this.phoneNumber!= null));
        }
        {
            String theEmailAddress;
            theEmailAddress = this.getEmailAddress();
            strategy.appendField(locator, this, "emailAddress", buffer, theEmailAddress, (this.emailAddress!= null));
        }
        {
            YesNotApplicableType theAppointmentRequested;
            theAppointmentRequested = this.getAppointmentRequested();
            strategy.appendField(locator, this, "appointmentRequested", buffer, theAppointmentRequested, (this.appointmentRequested!= null));
        }
        {
            String theMessage;
            theMessage = this.getMessage();
            strategy.appendField(locator, this, "message", buffer, theMessage, (this.message!= null));
        }
        {
            Address theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress, (this.address!= null));
        }
        {
            ContactMailCustomStyle theContactMailCustomStyle;
            theContactMailCustomStyle = this.getContactMailCustomStyle();
            strategy.appendField(locator, this, "contactMailCustomStyle", buffer, theContactMailCustomStyle, (this.contactMailCustomStyle!= null));
        }
        {
            String theMoveInDate;
            theMoveInDate = this.getMoveInDate();
            strategy.appendField(locator, this, "moveInDate", buffer, theMoveInDate, (this.moveInDate!= null));
        }
        {
            String thePetsInHousehold;
            thePetsInHousehold = this.getPetsInHousehold();
            strategy.appendField(locator, this, "petsInHousehold", buffer, thePetsInHousehold, (this.petsInHousehold!= null));
        }
        {
            String theNumberOfPersons;
            theNumberOfPersons = this.getNumberOfPersons();
            strategy.appendField(locator, this, "numberOfPersons", buffer, theNumberOfPersons, (this.numberOfPersons!= null));
        }
        {
            String theEmploymentRelationship;
            theEmploymentRelationship = this.getEmploymentRelationship();
            strategy.appendField(locator, this, "employmentRelationship", buffer, theEmploymentRelationship, (this.employmentRelationship!= null));
        }
        {
            String theIncome;
            theIncome = this.getIncome();
            strategy.appendField(locator, this, "income", buffer, theIncome, (this.income!= null));
        }
        {
            SalutationType theSalutation;
            theSalutation = this.getSalutation();
            strategy.appendField(locator, this, "salutation", buffer, theSalutation, (this.salutation!= null));
        }
        {
            Boolean theSchufaInformationProvided;
            theSchufaInformationProvided = this.isSchufaInformationProvided();
            strategy.appendField(locator, this, "schufaInformationProvided", buffer, theSchufaInformationProvided, (this.schufaInformationProvided!= null));
        }
        {
            String theSchufaVerificationCode;
            theSchufaVerificationCode = this.getSchufaVerificationCode();
            strategy.appendField(locator, this, "schufaVerificationCode", buffer, theSchufaVerificationCode, (this.schufaVerificationCode!= null));
        }
        {
            Boolean theSendProfile;
            theSendProfile = this.isSendProfile();
            strategy.appendField(locator, this, "sendProfile", buffer, theSendProfile, (this.sendProfile!= null));
        }
        {
            String theProfileImageUrl;
            theProfileImageUrl = this.getProfileImageUrl();
            strategy.appendField(locator, this, "profileImageUrl", buffer, theProfileImageUrl, (this.profileImageUrl!= null));
        }
        {
            Boolean thePrivacyPolicyAccepted;
            thePrivacyPolicyAccepted = this.isPrivacyPolicyAccepted();
            strategy.appendField(locator, this, "privacyPolicyAccepted", buffer, thePrivacyPolicyAccepted, (this.privacyPolicyAccepted!= null));
        }
        {
            String theCompany;
            theCompany = this.getCompany();
            strategy.appendField(locator, this, "company", buffer, theCompany, (this.company!= null));
        }
        {
            String theBuyReason;
            theBuyReason = this.getBuyReason();
            strategy.appendField(locator, this, "buyReason", buffer, theBuyReason, (this.buyReason!= null));
        }
        {
            String theOwnCapital;
            theOwnCapital = this.getOwnCapital();
            strategy.appendField(locator, this, "ownCapital", buffer, theOwnCapital, (this.ownCapital!= null));
        }
        {
            Boolean theHasPreapproval;
            theHasPreapproval = this.isHasPreapproval();
            strategy.appendField(locator, this, "hasPreapproval", buffer, theHasPreapproval, (this.hasPreapproval!= null));
        }
        {
            Boolean theLotAvailable;
            theLotAvailable = this.isLotAvailable();
            strategy.appendField(locator, this, "lotAvailable", buffer, theLotAvailable, (this.lotAvailable!= null));
        }
        {
            Long theNumberOfRequiredWorkingPlaces;
            theNumberOfRequiredWorkingPlaces = this.getNumberOfRequiredWorkingPlaces();
            strategy.appendField(locator, this, "numberOfRequiredWorkingPlaces", buffer, theNumberOfRequiredWorkingPlaces, (this.numberOfRequiredWorkingPlaces!= null));
        }
        {
            String thePlannedInvestment;
            thePlannedInvestment = this.getPlannedInvestment();
            strategy.appendField(locator, this, "plannedInvestment", buffer, thePlannedInvestment, (this.plannedInvestment!= null));
        }
        {
            String theCommercialUsage;
            theCommercialUsage = this.getCommercialUsage();
            strategy.appendField(locator, this, "commercialUsage", buffer, theCommercialUsage, (this.commercialUsage!= null));
        }
        {
            Boolean theApplicationPackageCompleted;
            theApplicationPackageCompleted = this.isApplicationPackageCompleted();
            strategy.appendField(locator, this, "applicationPackageCompleted", buffer, theApplicationPackageCompleted, (this.applicationPackageCompleted!= null));
        }
        {
            ContactFormType theContactFormType;
            theContactFormType = this.getContactFormType();
            strategy.appendField(locator, this, "contactFormType", buffer, theContactFormType, (this.contactFormType!= null));
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
        if (draftCopy instanceof ContactForm) {
            final ContactForm copy = ((ContactForm) draftCopy);
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
                Boolean emailAddressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.emailAddress!= null));
                if (emailAddressShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEmailAddress;
                    sourceEmailAddress = this.getEmailAddress();
                    String copyEmailAddress = ((String) strategy.copy(LocatorUtils.property(locator, "emailAddress", sourceEmailAddress), sourceEmailAddress, (this.emailAddress!= null)));
                    copy.setEmailAddress(copyEmailAddress);
                } else {
                    if (emailAddressShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.emailAddress = null;
                    }
                }
            }
            {
                Boolean appointmentRequestedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.appointmentRequested!= null));
                if (appointmentRequestedShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceAppointmentRequested;
                    sourceAppointmentRequested = this.getAppointmentRequested();
                    YesNotApplicableType copyAppointmentRequested = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "appointmentRequested", sourceAppointmentRequested), sourceAppointmentRequested, (this.appointmentRequested!= null)));
                    copy.setAppointmentRequested(copyAppointmentRequested);
                } else {
                    if (appointmentRequestedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.appointmentRequested = null;
                    }
                }
            }
            {
                Boolean messageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.message!= null));
                if (messageShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceMessage;
                    sourceMessage = this.getMessage();
                    String copyMessage = ((String) strategy.copy(LocatorUtils.property(locator, "message", sourceMessage), sourceMessage, (this.message!= null)));
                    copy.setMessage(copyMessage);
                } else {
                    if (messageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.message = null;
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
                Boolean contactMailCustomStyleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.contactMailCustomStyle!= null));
                if (contactMailCustomStyleShouldBeCopiedAndSet == Boolean.TRUE) {
                    ContactMailCustomStyle sourceContactMailCustomStyle;
                    sourceContactMailCustomStyle = this.getContactMailCustomStyle();
                    ContactMailCustomStyle copyContactMailCustomStyle = ((ContactMailCustomStyle) strategy.copy(LocatorUtils.property(locator, "contactMailCustomStyle", sourceContactMailCustomStyle), sourceContactMailCustomStyle, (this.contactMailCustomStyle!= null)));
                    copy.setContactMailCustomStyle(copyContactMailCustomStyle);
                } else {
                    if (contactMailCustomStyleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.contactMailCustomStyle = null;
                    }
                }
            }
            {
                Boolean moveInDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.moveInDate!= null));
                if (moveInDateShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceMoveInDate;
                    sourceMoveInDate = this.getMoveInDate();
                    String copyMoveInDate = ((String) strategy.copy(LocatorUtils.property(locator, "moveInDate", sourceMoveInDate), sourceMoveInDate, (this.moveInDate!= null)));
                    copy.setMoveInDate(copyMoveInDate);
                } else {
                    if (moveInDateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.moveInDate = null;
                    }
                }
            }
            {
                Boolean petsInHouseholdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.petsInHousehold!= null));
                if (petsInHouseholdShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePetsInHousehold;
                    sourcePetsInHousehold = this.getPetsInHousehold();
                    String copyPetsInHousehold = ((String) strategy.copy(LocatorUtils.property(locator, "petsInHousehold", sourcePetsInHousehold), sourcePetsInHousehold, (this.petsInHousehold!= null)));
                    copy.setPetsInHousehold(copyPetsInHousehold);
                } else {
                    if (petsInHouseholdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.petsInHousehold = null;
                    }
                }
            }
            {
                Boolean numberOfPersonsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfPersons!= null));
                if (numberOfPersonsShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceNumberOfPersons;
                    sourceNumberOfPersons = this.getNumberOfPersons();
                    String copyNumberOfPersons = ((String) strategy.copy(LocatorUtils.property(locator, "numberOfPersons", sourceNumberOfPersons), sourceNumberOfPersons, (this.numberOfPersons!= null)));
                    copy.setNumberOfPersons(copyNumberOfPersons);
                } else {
                    if (numberOfPersonsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfPersons = null;
                    }
                }
            }
            {
                Boolean employmentRelationshipShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.employmentRelationship!= null));
                if (employmentRelationshipShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEmploymentRelationship;
                    sourceEmploymentRelationship = this.getEmploymentRelationship();
                    String copyEmploymentRelationship = ((String) strategy.copy(LocatorUtils.property(locator, "employmentRelationship", sourceEmploymentRelationship), sourceEmploymentRelationship, (this.employmentRelationship!= null)));
                    copy.setEmploymentRelationship(copyEmploymentRelationship);
                } else {
                    if (employmentRelationshipShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.employmentRelationship = null;
                    }
                }
            }
            {
                Boolean incomeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.income!= null));
                if (incomeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceIncome;
                    sourceIncome = this.getIncome();
                    String copyIncome = ((String) strategy.copy(LocatorUtils.property(locator, "income", sourceIncome), sourceIncome, (this.income!= null)));
                    copy.setIncome(copyIncome);
                } else {
                    if (incomeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.income = null;
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
                Boolean schufaInformationProvidedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.schufaInformationProvided!= null));
                if (schufaInformationProvidedShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceSchufaInformationProvided;
                    sourceSchufaInformationProvided = this.isSchufaInformationProvided();
                    Boolean copySchufaInformationProvided = ((Boolean) strategy.copy(LocatorUtils.property(locator, "schufaInformationProvided", sourceSchufaInformationProvided), sourceSchufaInformationProvided, (this.schufaInformationProvided!= null)));
                    copy.setSchufaInformationProvided(copySchufaInformationProvided);
                } else {
                    if (schufaInformationProvidedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.schufaInformationProvided = null;
                    }
                }
            }
            {
                Boolean schufaVerificationCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.schufaVerificationCode!= null));
                if (schufaVerificationCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSchufaVerificationCode;
                    sourceSchufaVerificationCode = this.getSchufaVerificationCode();
                    String copySchufaVerificationCode = ((String) strategy.copy(LocatorUtils.property(locator, "schufaVerificationCode", sourceSchufaVerificationCode), sourceSchufaVerificationCode, (this.schufaVerificationCode!= null)));
                    copy.setSchufaVerificationCode(copySchufaVerificationCode);
                } else {
                    if (schufaVerificationCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.schufaVerificationCode = null;
                    }
                }
            }
            {
                Boolean sendProfileShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sendProfile!= null));
                if (sendProfileShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceSendProfile;
                    sourceSendProfile = this.isSendProfile();
                    Boolean copySendProfile = ((Boolean) strategy.copy(LocatorUtils.property(locator, "sendProfile", sourceSendProfile), sourceSendProfile, (this.sendProfile!= null)));
                    copy.setSendProfile(copySendProfile);
                } else {
                    if (sendProfileShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sendProfile = null;
                    }
                }
            }
            {
                Boolean profileImageUrlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.profileImageUrl!= null));
                if (profileImageUrlShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceProfileImageUrl;
                    sourceProfileImageUrl = this.getProfileImageUrl();
                    String copyProfileImageUrl = ((String) strategy.copy(LocatorUtils.property(locator, "profileImageUrl", sourceProfileImageUrl), sourceProfileImageUrl, (this.profileImageUrl!= null)));
                    copy.setProfileImageUrl(copyProfileImageUrl);
                } else {
                    if (profileImageUrlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.profileImageUrl = null;
                    }
                }
            }
            {
                Boolean privacyPolicyAcceptedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.privacyPolicyAccepted!= null));
                if (privacyPolicyAcceptedShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourcePrivacyPolicyAccepted;
                    sourcePrivacyPolicyAccepted = this.isPrivacyPolicyAccepted();
                    Boolean copyPrivacyPolicyAccepted = ((Boolean) strategy.copy(LocatorUtils.property(locator, "privacyPolicyAccepted", sourcePrivacyPolicyAccepted), sourcePrivacyPolicyAccepted, (this.privacyPolicyAccepted!= null)));
                    copy.setPrivacyPolicyAccepted(copyPrivacyPolicyAccepted);
                } else {
                    if (privacyPolicyAcceptedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.privacyPolicyAccepted = null;
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
                Boolean buyReasonShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.buyReason!= null));
                if (buyReasonShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBuyReason;
                    sourceBuyReason = this.getBuyReason();
                    String copyBuyReason = ((String) strategy.copy(LocatorUtils.property(locator, "buyReason", sourceBuyReason), sourceBuyReason, (this.buyReason!= null)));
                    copy.setBuyReason(copyBuyReason);
                } else {
                    if (buyReasonShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.buyReason = null;
                    }
                }
            }
            {
                Boolean ownCapitalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ownCapital!= null));
                if (ownCapitalShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceOwnCapital;
                    sourceOwnCapital = this.getOwnCapital();
                    String copyOwnCapital = ((String) strategy.copy(LocatorUtils.property(locator, "ownCapital", sourceOwnCapital), sourceOwnCapital, (this.ownCapital!= null)));
                    copy.setOwnCapital(copyOwnCapital);
                } else {
                    if (ownCapitalShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ownCapital = null;
                    }
                }
            }
            {
                Boolean hasPreapprovalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hasPreapproval!= null));
                if (hasPreapprovalShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceHasPreapproval;
                    sourceHasPreapproval = this.isHasPreapproval();
                    Boolean copyHasPreapproval = ((Boolean) strategy.copy(LocatorUtils.property(locator, "hasPreapproval", sourceHasPreapproval), sourceHasPreapproval, (this.hasPreapproval!= null)));
                    copy.setHasPreapproval(copyHasPreapproval);
                } else {
                    if (hasPreapprovalShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hasPreapproval = null;
                    }
                }
            }
            {
                Boolean lotAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lotAvailable!= null));
                if (lotAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceLotAvailable;
                    sourceLotAvailable = this.isLotAvailable();
                    Boolean copyLotAvailable = ((Boolean) strategy.copy(LocatorUtils.property(locator, "lotAvailable", sourceLotAvailable), sourceLotAvailable, (this.lotAvailable!= null)));
                    copy.setLotAvailable(copyLotAvailable);
                } else {
                    if (lotAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lotAvailable = null;
                    }
                }
            }
            {
                Boolean numberOfRequiredWorkingPlacesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfRequiredWorkingPlaces!= null));
                if (numberOfRequiredWorkingPlacesShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceNumberOfRequiredWorkingPlaces;
                    sourceNumberOfRequiredWorkingPlaces = this.getNumberOfRequiredWorkingPlaces();
                    Long copyNumberOfRequiredWorkingPlaces = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfRequiredWorkingPlaces", sourceNumberOfRequiredWorkingPlaces), sourceNumberOfRequiredWorkingPlaces, (this.numberOfRequiredWorkingPlaces!= null)));
                    copy.setNumberOfRequiredWorkingPlaces(copyNumberOfRequiredWorkingPlaces);
                } else {
                    if (numberOfRequiredWorkingPlacesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfRequiredWorkingPlaces = null;
                    }
                }
            }
            {
                Boolean plannedInvestmentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.plannedInvestment!= null));
                if (plannedInvestmentShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePlannedInvestment;
                    sourcePlannedInvestment = this.getPlannedInvestment();
                    String copyPlannedInvestment = ((String) strategy.copy(LocatorUtils.property(locator, "plannedInvestment", sourcePlannedInvestment), sourcePlannedInvestment, (this.plannedInvestment!= null)));
                    copy.setPlannedInvestment(copyPlannedInvestment);
                } else {
                    if (plannedInvestmentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.plannedInvestment = null;
                    }
                }
            }
            {
                Boolean commercialUsageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.commercialUsage!= null));
                if (commercialUsageShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCommercialUsage;
                    sourceCommercialUsage = this.getCommercialUsage();
                    String copyCommercialUsage = ((String) strategy.copy(LocatorUtils.property(locator, "commercialUsage", sourceCommercialUsage), sourceCommercialUsage, (this.commercialUsage!= null)));
                    copy.setCommercialUsage(copyCommercialUsage);
                } else {
                    if (commercialUsageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.commercialUsage = null;
                    }
                }
            }
            {
                Boolean applicationPackageCompletedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.applicationPackageCompleted!= null));
                if (applicationPackageCompletedShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceApplicationPackageCompleted;
                    sourceApplicationPackageCompleted = this.isApplicationPackageCompleted();
                    Boolean copyApplicationPackageCompleted = ((Boolean) strategy.copy(LocatorUtils.property(locator, "applicationPackageCompleted", sourceApplicationPackageCompleted), sourceApplicationPackageCompleted, (this.applicationPackageCompleted!= null)));
                    copy.setApplicationPackageCompleted(copyApplicationPackageCompleted);
                } else {
                    if (applicationPackageCompletedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.applicationPackageCompleted = null;
                    }
                }
            }
            {
                Boolean contactFormTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.contactFormType!= null));
                if (contactFormTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ContactFormType sourceContactFormType;
                    sourceContactFormType = this.getContactFormType();
                    ContactFormType copyContactFormType = ((ContactFormType) strategy.copy(LocatorUtils.property(locator, "contactFormType", sourceContactFormType), sourceContactFormType, (this.contactFormType!= null)));
                    copy.setContactFormType(copyContactFormType);
                } else {
                    if (contactFormTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.contactFormType = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ContactForm();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ContactForm that = ((ContactForm) object);
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
            String lhsPhoneNumber;
            lhsPhoneNumber = this.getPhoneNumber();
            String rhsPhoneNumber;
            rhsPhoneNumber = that.getPhoneNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phoneNumber", lhsPhoneNumber), LocatorUtils.property(thatLocator, "phoneNumber", rhsPhoneNumber), lhsPhoneNumber, rhsPhoneNumber, (this.phoneNumber!= null), (that.phoneNumber!= null))) {
                return false;
            }
        }
        {
            String lhsEmailAddress;
            lhsEmailAddress = this.getEmailAddress();
            String rhsEmailAddress;
            rhsEmailAddress = that.getEmailAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emailAddress", lhsEmailAddress), LocatorUtils.property(thatLocator, "emailAddress", rhsEmailAddress), lhsEmailAddress, rhsEmailAddress, (this.emailAddress!= null), (that.emailAddress!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsAppointmentRequested;
            lhsAppointmentRequested = this.getAppointmentRequested();
            YesNotApplicableType rhsAppointmentRequested;
            rhsAppointmentRequested = that.getAppointmentRequested();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "appointmentRequested", lhsAppointmentRequested), LocatorUtils.property(thatLocator, "appointmentRequested", rhsAppointmentRequested), lhsAppointmentRequested, rhsAppointmentRequested, (this.appointmentRequested!= null), (that.appointmentRequested!= null))) {
                return false;
            }
        }
        {
            String lhsMessage;
            lhsMessage = this.getMessage();
            String rhsMessage;
            rhsMessage = that.getMessage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "message", lhsMessage), LocatorUtils.property(thatLocator, "message", rhsMessage), lhsMessage, rhsMessage, (this.message!= null), (that.message!= null))) {
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
            ContactMailCustomStyle lhsContactMailCustomStyle;
            lhsContactMailCustomStyle = this.getContactMailCustomStyle();
            ContactMailCustomStyle rhsContactMailCustomStyle;
            rhsContactMailCustomStyle = that.getContactMailCustomStyle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactMailCustomStyle", lhsContactMailCustomStyle), LocatorUtils.property(thatLocator, "contactMailCustomStyle", rhsContactMailCustomStyle), lhsContactMailCustomStyle, rhsContactMailCustomStyle, (this.contactMailCustomStyle!= null), (that.contactMailCustomStyle!= null))) {
                return false;
            }
        }
        {
            String lhsMoveInDate;
            lhsMoveInDate = this.getMoveInDate();
            String rhsMoveInDate;
            rhsMoveInDate = that.getMoveInDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "moveInDate", lhsMoveInDate), LocatorUtils.property(thatLocator, "moveInDate", rhsMoveInDate), lhsMoveInDate, rhsMoveInDate, (this.moveInDate!= null), (that.moveInDate!= null))) {
                return false;
            }
        }
        {
            String lhsPetsInHousehold;
            lhsPetsInHousehold = this.getPetsInHousehold();
            String rhsPetsInHousehold;
            rhsPetsInHousehold = that.getPetsInHousehold();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "petsInHousehold", lhsPetsInHousehold), LocatorUtils.property(thatLocator, "petsInHousehold", rhsPetsInHousehold), lhsPetsInHousehold, rhsPetsInHousehold, (this.petsInHousehold!= null), (that.petsInHousehold!= null))) {
                return false;
            }
        }
        {
            String lhsNumberOfPersons;
            lhsNumberOfPersons = this.getNumberOfPersons();
            String rhsNumberOfPersons;
            rhsNumberOfPersons = that.getNumberOfPersons();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfPersons", lhsNumberOfPersons), LocatorUtils.property(thatLocator, "numberOfPersons", rhsNumberOfPersons), lhsNumberOfPersons, rhsNumberOfPersons, (this.numberOfPersons!= null), (that.numberOfPersons!= null))) {
                return false;
            }
        }
        {
            String lhsEmploymentRelationship;
            lhsEmploymentRelationship = this.getEmploymentRelationship();
            String rhsEmploymentRelationship;
            rhsEmploymentRelationship = that.getEmploymentRelationship();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "employmentRelationship", lhsEmploymentRelationship), LocatorUtils.property(thatLocator, "employmentRelationship", rhsEmploymentRelationship), lhsEmploymentRelationship, rhsEmploymentRelationship, (this.employmentRelationship!= null), (that.employmentRelationship!= null))) {
                return false;
            }
        }
        {
            String lhsIncome;
            lhsIncome = this.getIncome();
            String rhsIncome;
            rhsIncome = that.getIncome();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "income", lhsIncome), LocatorUtils.property(thatLocator, "income", rhsIncome), lhsIncome, rhsIncome, (this.income!= null), (that.income!= null))) {
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
            Boolean lhsSchufaInformationProvided;
            lhsSchufaInformationProvided = this.isSchufaInformationProvided();
            Boolean rhsSchufaInformationProvided;
            rhsSchufaInformationProvided = that.isSchufaInformationProvided();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schufaInformationProvided", lhsSchufaInformationProvided), LocatorUtils.property(thatLocator, "schufaInformationProvided", rhsSchufaInformationProvided), lhsSchufaInformationProvided, rhsSchufaInformationProvided, (this.schufaInformationProvided!= null), (that.schufaInformationProvided!= null))) {
                return false;
            }
        }
        {
            String lhsSchufaVerificationCode;
            lhsSchufaVerificationCode = this.getSchufaVerificationCode();
            String rhsSchufaVerificationCode;
            rhsSchufaVerificationCode = that.getSchufaVerificationCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schufaVerificationCode", lhsSchufaVerificationCode), LocatorUtils.property(thatLocator, "schufaVerificationCode", rhsSchufaVerificationCode), lhsSchufaVerificationCode, rhsSchufaVerificationCode, (this.schufaVerificationCode!= null), (that.schufaVerificationCode!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSendProfile;
            lhsSendProfile = this.isSendProfile();
            Boolean rhsSendProfile;
            rhsSendProfile = that.isSendProfile();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sendProfile", lhsSendProfile), LocatorUtils.property(thatLocator, "sendProfile", rhsSendProfile), lhsSendProfile, rhsSendProfile, (this.sendProfile!= null), (that.sendProfile!= null))) {
                return false;
            }
        }
        {
            String lhsProfileImageUrl;
            lhsProfileImageUrl = this.getProfileImageUrl();
            String rhsProfileImageUrl;
            rhsProfileImageUrl = that.getProfileImageUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "profileImageUrl", lhsProfileImageUrl), LocatorUtils.property(thatLocator, "profileImageUrl", rhsProfileImageUrl), lhsProfileImageUrl, rhsProfileImageUrl, (this.profileImageUrl!= null), (that.profileImageUrl!= null))) {
                return false;
            }
        }
        {
            Boolean lhsPrivacyPolicyAccepted;
            lhsPrivacyPolicyAccepted = this.isPrivacyPolicyAccepted();
            Boolean rhsPrivacyPolicyAccepted;
            rhsPrivacyPolicyAccepted = that.isPrivacyPolicyAccepted();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "privacyPolicyAccepted", lhsPrivacyPolicyAccepted), LocatorUtils.property(thatLocator, "privacyPolicyAccepted", rhsPrivacyPolicyAccepted), lhsPrivacyPolicyAccepted, rhsPrivacyPolicyAccepted, (this.privacyPolicyAccepted!= null), (that.privacyPolicyAccepted!= null))) {
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
            String lhsBuyReason;
            lhsBuyReason = this.getBuyReason();
            String rhsBuyReason;
            rhsBuyReason = that.getBuyReason();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buyReason", lhsBuyReason), LocatorUtils.property(thatLocator, "buyReason", rhsBuyReason), lhsBuyReason, rhsBuyReason, (this.buyReason!= null), (that.buyReason!= null))) {
                return false;
            }
        }
        {
            String lhsOwnCapital;
            lhsOwnCapital = this.getOwnCapital();
            String rhsOwnCapital;
            rhsOwnCapital = that.getOwnCapital();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ownCapital", lhsOwnCapital), LocatorUtils.property(thatLocator, "ownCapital", rhsOwnCapital), lhsOwnCapital, rhsOwnCapital, (this.ownCapital!= null), (that.ownCapital!= null))) {
                return false;
            }
        }
        {
            Boolean lhsHasPreapproval;
            lhsHasPreapproval = this.isHasPreapproval();
            Boolean rhsHasPreapproval;
            rhsHasPreapproval = that.isHasPreapproval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hasPreapproval", lhsHasPreapproval), LocatorUtils.property(thatLocator, "hasPreapproval", rhsHasPreapproval), lhsHasPreapproval, rhsHasPreapproval, (this.hasPreapproval!= null), (that.hasPreapproval!= null))) {
                return false;
            }
        }
        {
            Boolean lhsLotAvailable;
            lhsLotAvailable = this.isLotAvailable();
            Boolean rhsLotAvailable;
            rhsLotAvailable = that.isLotAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotAvailable", lhsLotAvailable), LocatorUtils.property(thatLocator, "lotAvailable", rhsLotAvailable), lhsLotAvailable, rhsLotAvailable, (this.lotAvailable!= null), (that.lotAvailable!= null))) {
                return false;
            }
        }
        {
            Long lhsNumberOfRequiredWorkingPlaces;
            lhsNumberOfRequiredWorkingPlaces = this.getNumberOfRequiredWorkingPlaces();
            Long rhsNumberOfRequiredWorkingPlaces;
            rhsNumberOfRequiredWorkingPlaces = that.getNumberOfRequiredWorkingPlaces();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfRequiredWorkingPlaces", lhsNumberOfRequiredWorkingPlaces), LocatorUtils.property(thatLocator, "numberOfRequiredWorkingPlaces", rhsNumberOfRequiredWorkingPlaces), lhsNumberOfRequiredWorkingPlaces, rhsNumberOfRequiredWorkingPlaces, (this.numberOfRequiredWorkingPlaces!= null), (that.numberOfRequiredWorkingPlaces!= null))) {
                return false;
            }
        }
        {
            String lhsPlannedInvestment;
            lhsPlannedInvestment = this.getPlannedInvestment();
            String rhsPlannedInvestment;
            rhsPlannedInvestment = that.getPlannedInvestment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "plannedInvestment", lhsPlannedInvestment), LocatorUtils.property(thatLocator, "plannedInvestment", rhsPlannedInvestment), lhsPlannedInvestment, rhsPlannedInvestment, (this.plannedInvestment!= null), (that.plannedInvestment!= null))) {
                return false;
            }
        }
        {
            String lhsCommercialUsage;
            lhsCommercialUsage = this.getCommercialUsage();
            String rhsCommercialUsage;
            rhsCommercialUsage = that.getCommercialUsage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commercialUsage", lhsCommercialUsage), LocatorUtils.property(thatLocator, "commercialUsage", rhsCommercialUsage), lhsCommercialUsage, rhsCommercialUsage, (this.commercialUsage!= null), (that.commercialUsage!= null))) {
                return false;
            }
        }
        {
            Boolean lhsApplicationPackageCompleted;
            lhsApplicationPackageCompleted = this.isApplicationPackageCompleted();
            Boolean rhsApplicationPackageCompleted;
            rhsApplicationPackageCompleted = that.isApplicationPackageCompleted();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "applicationPackageCompleted", lhsApplicationPackageCompleted), LocatorUtils.property(thatLocator, "applicationPackageCompleted", rhsApplicationPackageCompleted), lhsApplicationPackageCompleted, rhsApplicationPackageCompleted, (this.applicationPackageCompleted!= null), (that.applicationPackageCompleted!= null))) {
                return false;
            }
        }
        {
            ContactFormType lhsContactFormType;
            lhsContactFormType = this.getContactFormType();
            ContactFormType rhsContactFormType;
            rhsContactFormType = that.getContactFormType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactFormType", lhsContactFormType), LocatorUtils.property(thatLocator, "contactFormType", rhsContactFormType), lhsContactFormType, rhsContactFormType, (this.contactFormType!= null), (that.contactFormType!= null))) {
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
