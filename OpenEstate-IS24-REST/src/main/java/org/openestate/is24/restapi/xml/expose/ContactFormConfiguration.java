
package org.openestate.is24.restapi.xml.expose;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
import org.openestate.is24.restapi.xml.common.MandatoryOptionalType;


/**
 * Definition welche Daten im Kontaktformular angezeigt werden soll.
 * 
 * <p>Java class for ContactFormConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactFormConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="moveInDateField" type="{http://rest.immobilienscout24.de/schema/common/1.0}MandatoryOptionalType" minOccurs="0"/&gt;
 *         &lt;element name="petsInHouseholdField" type="{http://rest.immobilienscout24.de/schema/common/1.0}MandatoryOptionalType" minOccurs="0"/&gt;
 *         &lt;element name="numberOfPersonsField" type="{http://rest.immobilienscout24.de/schema/common/1.0}MandatoryOptionalType" minOccurs="0"/&gt;
 *         &lt;element name="employmentRelationshipField" type="{http://rest.immobilienscout24.de/schema/common/1.0}MandatoryOptionalType" minOccurs="0"/&gt;
 *         &lt;element name="incomeField" type="{http://rest.immobilienscout24.de/schema/common/1.0}MandatoryOptionalType" minOccurs="0"/&gt;
 *         &lt;element name="firstnameField" type="{http://rest.immobilienscout24.de/schema/common/1.0}MandatoryOptionalType" minOccurs="0"/&gt;
 *         &lt;element name="lastnameField" type="{http://rest.immobilienscout24.de/schema/common/1.0}MandatoryOptionalType"/&gt;
 *         &lt;element name="phoneNumberField" type="{http://rest.immobilienscout24.de/schema/common/1.0}MandatoryOptionalType" minOccurs="0"/&gt;
 *         &lt;element name="emailAddressField" type="{http://rest.immobilienscout24.de/schema/common/1.0}MandatoryOptionalType" minOccurs="0"/&gt;
 *         &lt;element name="addressField" type="{http://rest.immobilienscout24.de/schema/common/1.0}MandatoryOptionalType" minOccurs="0"/&gt;
 *         &lt;element name="schufaInformationField" type="{http://rest.immobilienscout24.de/schema/common/1.0}MandatoryOptionalType" minOccurs="0"/&gt;
 *         &lt;element name="buyReasonField" type="{http://rest.immobilienscout24.de/schema/common/1.0}MandatoryOptionalType" minOccurs="0"/&gt;
 *         &lt;element name="ownCapitalField" type="{http://rest.immobilienscout24.de/schema/common/1.0}MandatoryOptionalType" minOccurs="0"/&gt;
 *         &lt;element name="hasPreapprovalField" type="{http://rest.immobilienscout24.de/schema/common/1.0}MandatoryOptionalType" minOccurs="0"/&gt;
 *         &lt;element name="lotAvailableField" type="{http://rest.immobilienscout24.de/schema/common/1.0}MandatoryOptionalType" minOccurs="0"/&gt;
 *         &lt;element name="numberOfRequiredWorkingPlacesField" type="{http://rest.immobilienscout24.de/schema/common/1.0}MandatoryOptionalType" minOccurs="0"/&gt;
 *         &lt;element name="plannedInvestmentField" type="{http://rest.immobilienscout24.de/schema/common/1.0}MandatoryOptionalType" minOccurs="0"/&gt;
 *         &lt;element name="commercialUsageField" type="{http://rest.immobilienscout24.de/schema/common/1.0}MandatoryOptionalType" minOccurs="0"/&gt;
 *         &lt;element name="applicationPackageCompletedField" type="{http://rest.immobilienscout24.de/schema/common/1.0}MandatoryOptionalType" minOccurs="0"/&gt;
 *         &lt;element name="salutationField" type="{http://rest.immobilienscout24.de/schema/common/1.0}MandatoryOptionalType" minOccurs="0"/&gt;
 *         &lt;element name="companyField" type="{http://rest.immobilienscout24.de/schema/common/1.0}MandatoryOptionalType" minOccurs="0"/&gt;
 *         &lt;element name="messageField" type="{http://rest.immobilienscout24.de/schema/common/1.0}MandatoryOptionalType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactFormConfiguration", propOrder = {

})
public class ContactFormConfiguration implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlSchemaType(name = "string")
    protected MandatoryOptionalType moveInDateField;
    @XmlSchemaType(name = "string")
    protected MandatoryOptionalType petsInHouseholdField;
    @XmlSchemaType(name = "string")
    protected MandatoryOptionalType numberOfPersonsField;
    @XmlSchemaType(name = "string")
    protected MandatoryOptionalType employmentRelationshipField;
    @XmlSchemaType(name = "string")
    protected MandatoryOptionalType incomeField;
    @XmlSchemaType(name = "string")
    protected MandatoryOptionalType firstnameField;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MandatoryOptionalType lastnameField;
    @XmlSchemaType(name = "string")
    protected MandatoryOptionalType phoneNumberField;
    @XmlSchemaType(name = "string")
    protected MandatoryOptionalType emailAddressField;
    @XmlSchemaType(name = "string")
    protected MandatoryOptionalType addressField;
    @XmlSchemaType(name = "string")
    protected MandatoryOptionalType schufaInformationField;
    @XmlSchemaType(name = "string")
    protected MandatoryOptionalType buyReasonField;
    @XmlSchemaType(name = "string")
    protected MandatoryOptionalType ownCapitalField;
    @XmlSchemaType(name = "string")
    protected MandatoryOptionalType hasPreapprovalField;
    @XmlSchemaType(name = "string")
    protected MandatoryOptionalType lotAvailableField;
    @XmlSchemaType(name = "string")
    protected MandatoryOptionalType numberOfRequiredWorkingPlacesField;
    @XmlSchemaType(name = "string")
    protected MandatoryOptionalType plannedInvestmentField;
    @XmlSchemaType(name = "string")
    protected MandatoryOptionalType commercialUsageField;
    @XmlSchemaType(name = "string")
    protected MandatoryOptionalType applicationPackageCompletedField;
    @XmlSchemaType(name = "string")
    protected MandatoryOptionalType salutationField;
    @XmlSchemaType(name = "string")
    protected MandatoryOptionalType companyField;
    @XmlSchemaType(name = "string")
    protected MandatoryOptionalType messageField;

    /**
     * Gets the value of the moveInDateField property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public MandatoryOptionalType getMoveInDateField() {
        return moveInDateField;
    }

    /**
     * Sets the value of the moveInDateField property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public void setMoveInDateField(MandatoryOptionalType value) {
        this.moveInDateField = value;
    }

    /**
     * Gets the value of the petsInHouseholdField property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public MandatoryOptionalType getPetsInHouseholdField() {
        return petsInHouseholdField;
    }

    /**
     * Sets the value of the petsInHouseholdField property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public void setPetsInHouseholdField(MandatoryOptionalType value) {
        this.petsInHouseholdField = value;
    }

    /**
     * Gets the value of the numberOfPersonsField property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public MandatoryOptionalType getNumberOfPersonsField() {
        return numberOfPersonsField;
    }

    /**
     * Sets the value of the numberOfPersonsField property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public void setNumberOfPersonsField(MandatoryOptionalType value) {
        this.numberOfPersonsField = value;
    }

    /**
     * Gets the value of the employmentRelationshipField property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public MandatoryOptionalType getEmploymentRelationshipField() {
        return employmentRelationshipField;
    }

    /**
     * Sets the value of the employmentRelationshipField property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public void setEmploymentRelationshipField(MandatoryOptionalType value) {
        this.employmentRelationshipField = value;
    }

    /**
     * Gets the value of the incomeField property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public MandatoryOptionalType getIncomeField() {
        return incomeField;
    }

    /**
     * Sets the value of the incomeField property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public void setIncomeField(MandatoryOptionalType value) {
        this.incomeField = value;
    }

    /**
     * Gets the value of the firstnameField property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public MandatoryOptionalType getFirstnameField() {
        return firstnameField;
    }

    /**
     * Sets the value of the firstnameField property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public void setFirstnameField(MandatoryOptionalType value) {
        this.firstnameField = value;
    }

    /**
     * Gets the value of the lastnameField property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public MandatoryOptionalType getLastnameField() {
        return lastnameField;
    }

    /**
     * Sets the value of the lastnameField property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public void setLastnameField(MandatoryOptionalType value) {
        this.lastnameField = value;
    }

    /**
     * Gets the value of the phoneNumberField property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public MandatoryOptionalType getPhoneNumberField() {
        return phoneNumberField;
    }

    /**
     * Sets the value of the phoneNumberField property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public void setPhoneNumberField(MandatoryOptionalType value) {
        this.phoneNumberField = value;
    }

    /**
     * Gets the value of the emailAddressField property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public MandatoryOptionalType getEmailAddressField() {
        return emailAddressField;
    }

    /**
     * Sets the value of the emailAddressField property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public void setEmailAddressField(MandatoryOptionalType value) {
        this.emailAddressField = value;
    }

    /**
     * Gets the value of the addressField property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public MandatoryOptionalType getAddressField() {
        return addressField;
    }

    /**
     * Sets the value of the addressField property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public void setAddressField(MandatoryOptionalType value) {
        this.addressField = value;
    }

    /**
     * Gets the value of the schufaInformationField property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public MandatoryOptionalType getSchufaInformationField() {
        return schufaInformationField;
    }

    /**
     * Sets the value of the schufaInformationField property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public void setSchufaInformationField(MandatoryOptionalType value) {
        this.schufaInformationField = value;
    }

    /**
     * Gets the value of the buyReasonField property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public MandatoryOptionalType getBuyReasonField() {
        return buyReasonField;
    }

    /**
     * Sets the value of the buyReasonField property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public void setBuyReasonField(MandatoryOptionalType value) {
        this.buyReasonField = value;
    }

    /**
     * Gets the value of the ownCapitalField property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public MandatoryOptionalType getOwnCapitalField() {
        return ownCapitalField;
    }

    /**
     * Sets the value of the ownCapitalField property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public void setOwnCapitalField(MandatoryOptionalType value) {
        this.ownCapitalField = value;
    }

    /**
     * Gets the value of the hasPreapprovalField property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public MandatoryOptionalType getHasPreapprovalField() {
        return hasPreapprovalField;
    }

    /**
     * Sets the value of the hasPreapprovalField property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public void setHasPreapprovalField(MandatoryOptionalType value) {
        this.hasPreapprovalField = value;
    }

    /**
     * Gets the value of the lotAvailableField property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public MandatoryOptionalType getLotAvailableField() {
        return lotAvailableField;
    }

    /**
     * Sets the value of the lotAvailableField property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public void setLotAvailableField(MandatoryOptionalType value) {
        this.lotAvailableField = value;
    }

    /**
     * Gets the value of the numberOfRequiredWorkingPlacesField property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public MandatoryOptionalType getNumberOfRequiredWorkingPlacesField() {
        return numberOfRequiredWorkingPlacesField;
    }

    /**
     * Sets the value of the numberOfRequiredWorkingPlacesField property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public void setNumberOfRequiredWorkingPlacesField(MandatoryOptionalType value) {
        this.numberOfRequiredWorkingPlacesField = value;
    }

    /**
     * Gets the value of the plannedInvestmentField property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public MandatoryOptionalType getPlannedInvestmentField() {
        return plannedInvestmentField;
    }

    /**
     * Sets the value of the plannedInvestmentField property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public void setPlannedInvestmentField(MandatoryOptionalType value) {
        this.plannedInvestmentField = value;
    }

    /**
     * Gets the value of the commercialUsageField property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public MandatoryOptionalType getCommercialUsageField() {
        return commercialUsageField;
    }

    /**
     * Sets the value of the commercialUsageField property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public void setCommercialUsageField(MandatoryOptionalType value) {
        this.commercialUsageField = value;
    }

    /**
     * Gets the value of the applicationPackageCompletedField property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public MandatoryOptionalType getApplicationPackageCompletedField() {
        return applicationPackageCompletedField;
    }

    /**
     * Sets the value of the applicationPackageCompletedField property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public void setApplicationPackageCompletedField(MandatoryOptionalType value) {
        this.applicationPackageCompletedField = value;
    }

    /**
     * Gets the value of the salutationField property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public MandatoryOptionalType getSalutationField() {
        return salutationField;
    }

    /**
     * Sets the value of the salutationField property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public void setSalutationField(MandatoryOptionalType value) {
        this.salutationField = value;
    }

    /**
     * Gets the value of the companyField property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public MandatoryOptionalType getCompanyField() {
        return companyField;
    }

    /**
     * Sets the value of the companyField property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public void setCompanyField(MandatoryOptionalType value) {
        this.companyField = value;
    }

    /**
     * Gets the value of the messageField property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public MandatoryOptionalType getMessageField() {
        return messageField;
    }

    /**
     * Sets the value of the messageField property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryOptionalType }
     *     
     */
    public void setMessageField(MandatoryOptionalType value) {
        this.messageField = value;
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
            MandatoryOptionalType theMoveInDateField;
            theMoveInDateField = this.getMoveInDateField();
            strategy.appendField(locator, this, "moveInDateField", buffer, theMoveInDateField, (this.moveInDateField!= null));
        }
        {
            MandatoryOptionalType thePetsInHouseholdField;
            thePetsInHouseholdField = this.getPetsInHouseholdField();
            strategy.appendField(locator, this, "petsInHouseholdField", buffer, thePetsInHouseholdField, (this.petsInHouseholdField!= null));
        }
        {
            MandatoryOptionalType theNumberOfPersonsField;
            theNumberOfPersonsField = this.getNumberOfPersonsField();
            strategy.appendField(locator, this, "numberOfPersonsField", buffer, theNumberOfPersonsField, (this.numberOfPersonsField!= null));
        }
        {
            MandatoryOptionalType theEmploymentRelationshipField;
            theEmploymentRelationshipField = this.getEmploymentRelationshipField();
            strategy.appendField(locator, this, "employmentRelationshipField", buffer, theEmploymentRelationshipField, (this.employmentRelationshipField!= null));
        }
        {
            MandatoryOptionalType theIncomeField;
            theIncomeField = this.getIncomeField();
            strategy.appendField(locator, this, "incomeField", buffer, theIncomeField, (this.incomeField!= null));
        }
        {
            MandatoryOptionalType theFirstnameField;
            theFirstnameField = this.getFirstnameField();
            strategy.appendField(locator, this, "firstnameField", buffer, theFirstnameField, (this.firstnameField!= null));
        }
        {
            MandatoryOptionalType theLastnameField;
            theLastnameField = this.getLastnameField();
            strategy.appendField(locator, this, "lastnameField", buffer, theLastnameField, (this.lastnameField!= null));
        }
        {
            MandatoryOptionalType thePhoneNumberField;
            thePhoneNumberField = this.getPhoneNumberField();
            strategy.appendField(locator, this, "phoneNumberField", buffer, thePhoneNumberField, (this.phoneNumberField!= null));
        }
        {
            MandatoryOptionalType theEmailAddressField;
            theEmailAddressField = this.getEmailAddressField();
            strategy.appendField(locator, this, "emailAddressField", buffer, theEmailAddressField, (this.emailAddressField!= null));
        }
        {
            MandatoryOptionalType theAddressField;
            theAddressField = this.getAddressField();
            strategy.appendField(locator, this, "addressField", buffer, theAddressField, (this.addressField!= null));
        }
        {
            MandatoryOptionalType theSchufaInformationField;
            theSchufaInformationField = this.getSchufaInformationField();
            strategy.appendField(locator, this, "schufaInformationField", buffer, theSchufaInformationField, (this.schufaInformationField!= null));
        }
        {
            MandatoryOptionalType theBuyReasonField;
            theBuyReasonField = this.getBuyReasonField();
            strategy.appendField(locator, this, "buyReasonField", buffer, theBuyReasonField, (this.buyReasonField!= null));
        }
        {
            MandatoryOptionalType theOwnCapitalField;
            theOwnCapitalField = this.getOwnCapitalField();
            strategy.appendField(locator, this, "ownCapitalField", buffer, theOwnCapitalField, (this.ownCapitalField!= null));
        }
        {
            MandatoryOptionalType theHasPreapprovalField;
            theHasPreapprovalField = this.getHasPreapprovalField();
            strategy.appendField(locator, this, "hasPreapprovalField", buffer, theHasPreapprovalField, (this.hasPreapprovalField!= null));
        }
        {
            MandatoryOptionalType theLotAvailableField;
            theLotAvailableField = this.getLotAvailableField();
            strategy.appendField(locator, this, "lotAvailableField", buffer, theLotAvailableField, (this.lotAvailableField!= null));
        }
        {
            MandatoryOptionalType theNumberOfRequiredWorkingPlacesField;
            theNumberOfRequiredWorkingPlacesField = this.getNumberOfRequiredWorkingPlacesField();
            strategy.appendField(locator, this, "numberOfRequiredWorkingPlacesField", buffer, theNumberOfRequiredWorkingPlacesField, (this.numberOfRequiredWorkingPlacesField!= null));
        }
        {
            MandatoryOptionalType thePlannedInvestmentField;
            thePlannedInvestmentField = this.getPlannedInvestmentField();
            strategy.appendField(locator, this, "plannedInvestmentField", buffer, thePlannedInvestmentField, (this.plannedInvestmentField!= null));
        }
        {
            MandatoryOptionalType theCommercialUsageField;
            theCommercialUsageField = this.getCommercialUsageField();
            strategy.appendField(locator, this, "commercialUsageField", buffer, theCommercialUsageField, (this.commercialUsageField!= null));
        }
        {
            MandatoryOptionalType theApplicationPackageCompletedField;
            theApplicationPackageCompletedField = this.getApplicationPackageCompletedField();
            strategy.appendField(locator, this, "applicationPackageCompletedField", buffer, theApplicationPackageCompletedField, (this.applicationPackageCompletedField!= null));
        }
        {
            MandatoryOptionalType theSalutationField;
            theSalutationField = this.getSalutationField();
            strategy.appendField(locator, this, "salutationField", buffer, theSalutationField, (this.salutationField!= null));
        }
        {
            MandatoryOptionalType theCompanyField;
            theCompanyField = this.getCompanyField();
            strategy.appendField(locator, this, "companyField", buffer, theCompanyField, (this.companyField!= null));
        }
        {
            MandatoryOptionalType theMessageField;
            theMessageField = this.getMessageField();
            strategy.appendField(locator, this, "messageField", buffer, theMessageField, (this.messageField!= null));
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
        if (draftCopy instanceof ContactFormConfiguration) {
            final ContactFormConfiguration copy = ((ContactFormConfiguration) draftCopy);
            {
                Boolean moveInDateFieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.moveInDateField!= null));
                if (moveInDateFieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    MandatoryOptionalType sourceMoveInDateField;
                    sourceMoveInDateField = this.getMoveInDateField();
                    MandatoryOptionalType copyMoveInDateField = ((MandatoryOptionalType) strategy.copy(LocatorUtils.property(locator, "moveInDateField", sourceMoveInDateField), sourceMoveInDateField, (this.moveInDateField!= null)));
                    copy.setMoveInDateField(copyMoveInDateField);
                } else {
                    if (moveInDateFieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.moveInDateField = null;
                    }
                }
            }
            {
                Boolean petsInHouseholdFieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.petsInHouseholdField!= null));
                if (petsInHouseholdFieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    MandatoryOptionalType sourcePetsInHouseholdField;
                    sourcePetsInHouseholdField = this.getPetsInHouseholdField();
                    MandatoryOptionalType copyPetsInHouseholdField = ((MandatoryOptionalType) strategy.copy(LocatorUtils.property(locator, "petsInHouseholdField", sourcePetsInHouseholdField), sourcePetsInHouseholdField, (this.petsInHouseholdField!= null)));
                    copy.setPetsInHouseholdField(copyPetsInHouseholdField);
                } else {
                    if (petsInHouseholdFieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.petsInHouseholdField = null;
                    }
                }
            }
            {
                Boolean numberOfPersonsFieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfPersonsField!= null));
                if (numberOfPersonsFieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    MandatoryOptionalType sourceNumberOfPersonsField;
                    sourceNumberOfPersonsField = this.getNumberOfPersonsField();
                    MandatoryOptionalType copyNumberOfPersonsField = ((MandatoryOptionalType) strategy.copy(LocatorUtils.property(locator, "numberOfPersonsField", sourceNumberOfPersonsField), sourceNumberOfPersonsField, (this.numberOfPersonsField!= null)));
                    copy.setNumberOfPersonsField(copyNumberOfPersonsField);
                } else {
                    if (numberOfPersonsFieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfPersonsField = null;
                    }
                }
            }
            {
                Boolean employmentRelationshipFieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.employmentRelationshipField!= null));
                if (employmentRelationshipFieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    MandatoryOptionalType sourceEmploymentRelationshipField;
                    sourceEmploymentRelationshipField = this.getEmploymentRelationshipField();
                    MandatoryOptionalType copyEmploymentRelationshipField = ((MandatoryOptionalType) strategy.copy(LocatorUtils.property(locator, "employmentRelationshipField", sourceEmploymentRelationshipField), sourceEmploymentRelationshipField, (this.employmentRelationshipField!= null)));
                    copy.setEmploymentRelationshipField(copyEmploymentRelationshipField);
                } else {
                    if (employmentRelationshipFieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.employmentRelationshipField = null;
                    }
                }
            }
            {
                Boolean incomeFieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.incomeField!= null));
                if (incomeFieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    MandatoryOptionalType sourceIncomeField;
                    sourceIncomeField = this.getIncomeField();
                    MandatoryOptionalType copyIncomeField = ((MandatoryOptionalType) strategy.copy(LocatorUtils.property(locator, "incomeField", sourceIncomeField), sourceIncomeField, (this.incomeField!= null)));
                    copy.setIncomeField(copyIncomeField);
                } else {
                    if (incomeFieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.incomeField = null;
                    }
                }
            }
            {
                Boolean firstnameFieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.firstnameField!= null));
                if (firstnameFieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    MandatoryOptionalType sourceFirstnameField;
                    sourceFirstnameField = this.getFirstnameField();
                    MandatoryOptionalType copyFirstnameField = ((MandatoryOptionalType) strategy.copy(LocatorUtils.property(locator, "firstnameField", sourceFirstnameField), sourceFirstnameField, (this.firstnameField!= null)));
                    copy.setFirstnameField(copyFirstnameField);
                } else {
                    if (firstnameFieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.firstnameField = null;
                    }
                }
            }
            {
                Boolean lastnameFieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lastnameField!= null));
                if (lastnameFieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    MandatoryOptionalType sourceLastnameField;
                    sourceLastnameField = this.getLastnameField();
                    MandatoryOptionalType copyLastnameField = ((MandatoryOptionalType) strategy.copy(LocatorUtils.property(locator, "lastnameField", sourceLastnameField), sourceLastnameField, (this.lastnameField!= null)));
                    copy.setLastnameField(copyLastnameField);
                } else {
                    if (lastnameFieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lastnameField = null;
                    }
                }
            }
            {
                Boolean phoneNumberFieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.phoneNumberField!= null));
                if (phoneNumberFieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    MandatoryOptionalType sourcePhoneNumberField;
                    sourcePhoneNumberField = this.getPhoneNumberField();
                    MandatoryOptionalType copyPhoneNumberField = ((MandatoryOptionalType) strategy.copy(LocatorUtils.property(locator, "phoneNumberField", sourcePhoneNumberField), sourcePhoneNumberField, (this.phoneNumberField!= null)));
                    copy.setPhoneNumberField(copyPhoneNumberField);
                } else {
                    if (phoneNumberFieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.phoneNumberField = null;
                    }
                }
            }
            {
                Boolean emailAddressFieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.emailAddressField!= null));
                if (emailAddressFieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    MandatoryOptionalType sourceEmailAddressField;
                    sourceEmailAddressField = this.getEmailAddressField();
                    MandatoryOptionalType copyEmailAddressField = ((MandatoryOptionalType) strategy.copy(LocatorUtils.property(locator, "emailAddressField", sourceEmailAddressField), sourceEmailAddressField, (this.emailAddressField!= null)));
                    copy.setEmailAddressField(copyEmailAddressField);
                } else {
                    if (emailAddressFieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.emailAddressField = null;
                    }
                }
            }
            {
                Boolean addressFieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.addressField!= null));
                if (addressFieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    MandatoryOptionalType sourceAddressField;
                    sourceAddressField = this.getAddressField();
                    MandatoryOptionalType copyAddressField = ((MandatoryOptionalType) strategy.copy(LocatorUtils.property(locator, "addressField", sourceAddressField), sourceAddressField, (this.addressField!= null)));
                    copy.setAddressField(copyAddressField);
                } else {
                    if (addressFieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.addressField = null;
                    }
                }
            }
            {
                Boolean schufaInformationFieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.schufaInformationField!= null));
                if (schufaInformationFieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    MandatoryOptionalType sourceSchufaInformationField;
                    sourceSchufaInformationField = this.getSchufaInformationField();
                    MandatoryOptionalType copySchufaInformationField = ((MandatoryOptionalType) strategy.copy(LocatorUtils.property(locator, "schufaInformationField", sourceSchufaInformationField), sourceSchufaInformationField, (this.schufaInformationField!= null)));
                    copy.setSchufaInformationField(copySchufaInformationField);
                } else {
                    if (schufaInformationFieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.schufaInformationField = null;
                    }
                }
            }
            {
                Boolean buyReasonFieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.buyReasonField!= null));
                if (buyReasonFieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    MandatoryOptionalType sourceBuyReasonField;
                    sourceBuyReasonField = this.getBuyReasonField();
                    MandatoryOptionalType copyBuyReasonField = ((MandatoryOptionalType) strategy.copy(LocatorUtils.property(locator, "buyReasonField", sourceBuyReasonField), sourceBuyReasonField, (this.buyReasonField!= null)));
                    copy.setBuyReasonField(copyBuyReasonField);
                } else {
                    if (buyReasonFieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.buyReasonField = null;
                    }
                }
            }
            {
                Boolean ownCapitalFieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ownCapitalField!= null));
                if (ownCapitalFieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    MandatoryOptionalType sourceOwnCapitalField;
                    sourceOwnCapitalField = this.getOwnCapitalField();
                    MandatoryOptionalType copyOwnCapitalField = ((MandatoryOptionalType) strategy.copy(LocatorUtils.property(locator, "ownCapitalField", sourceOwnCapitalField), sourceOwnCapitalField, (this.ownCapitalField!= null)));
                    copy.setOwnCapitalField(copyOwnCapitalField);
                } else {
                    if (ownCapitalFieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ownCapitalField = null;
                    }
                }
            }
            {
                Boolean hasPreapprovalFieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hasPreapprovalField!= null));
                if (hasPreapprovalFieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    MandatoryOptionalType sourceHasPreapprovalField;
                    sourceHasPreapprovalField = this.getHasPreapprovalField();
                    MandatoryOptionalType copyHasPreapprovalField = ((MandatoryOptionalType) strategy.copy(LocatorUtils.property(locator, "hasPreapprovalField", sourceHasPreapprovalField), sourceHasPreapprovalField, (this.hasPreapprovalField!= null)));
                    copy.setHasPreapprovalField(copyHasPreapprovalField);
                } else {
                    if (hasPreapprovalFieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hasPreapprovalField = null;
                    }
                }
            }
            {
                Boolean lotAvailableFieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lotAvailableField!= null));
                if (lotAvailableFieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    MandatoryOptionalType sourceLotAvailableField;
                    sourceLotAvailableField = this.getLotAvailableField();
                    MandatoryOptionalType copyLotAvailableField = ((MandatoryOptionalType) strategy.copy(LocatorUtils.property(locator, "lotAvailableField", sourceLotAvailableField), sourceLotAvailableField, (this.lotAvailableField!= null)));
                    copy.setLotAvailableField(copyLotAvailableField);
                } else {
                    if (lotAvailableFieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lotAvailableField = null;
                    }
                }
            }
            {
                Boolean numberOfRequiredWorkingPlacesFieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfRequiredWorkingPlacesField!= null));
                if (numberOfRequiredWorkingPlacesFieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    MandatoryOptionalType sourceNumberOfRequiredWorkingPlacesField;
                    sourceNumberOfRequiredWorkingPlacesField = this.getNumberOfRequiredWorkingPlacesField();
                    MandatoryOptionalType copyNumberOfRequiredWorkingPlacesField = ((MandatoryOptionalType) strategy.copy(LocatorUtils.property(locator, "numberOfRequiredWorkingPlacesField", sourceNumberOfRequiredWorkingPlacesField), sourceNumberOfRequiredWorkingPlacesField, (this.numberOfRequiredWorkingPlacesField!= null)));
                    copy.setNumberOfRequiredWorkingPlacesField(copyNumberOfRequiredWorkingPlacesField);
                } else {
                    if (numberOfRequiredWorkingPlacesFieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfRequiredWorkingPlacesField = null;
                    }
                }
            }
            {
                Boolean plannedInvestmentFieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.plannedInvestmentField!= null));
                if (plannedInvestmentFieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    MandatoryOptionalType sourcePlannedInvestmentField;
                    sourcePlannedInvestmentField = this.getPlannedInvestmentField();
                    MandatoryOptionalType copyPlannedInvestmentField = ((MandatoryOptionalType) strategy.copy(LocatorUtils.property(locator, "plannedInvestmentField", sourcePlannedInvestmentField), sourcePlannedInvestmentField, (this.plannedInvestmentField!= null)));
                    copy.setPlannedInvestmentField(copyPlannedInvestmentField);
                } else {
                    if (plannedInvestmentFieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.plannedInvestmentField = null;
                    }
                }
            }
            {
                Boolean commercialUsageFieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.commercialUsageField!= null));
                if (commercialUsageFieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    MandatoryOptionalType sourceCommercialUsageField;
                    sourceCommercialUsageField = this.getCommercialUsageField();
                    MandatoryOptionalType copyCommercialUsageField = ((MandatoryOptionalType) strategy.copy(LocatorUtils.property(locator, "commercialUsageField", sourceCommercialUsageField), sourceCommercialUsageField, (this.commercialUsageField!= null)));
                    copy.setCommercialUsageField(copyCommercialUsageField);
                } else {
                    if (commercialUsageFieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.commercialUsageField = null;
                    }
                }
            }
            {
                Boolean applicationPackageCompletedFieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.applicationPackageCompletedField!= null));
                if (applicationPackageCompletedFieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    MandatoryOptionalType sourceApplicationPackageCompletedField;
                    sourceApplicationPackageCompletedField = this.getApplicationPackageCompletedField();
                    MandatoryOptionalType copyApplicationPackageCompletedField = ((MandatoryOptionalType) strategy.copy(LocatorUtils.property(locator, "applicationPackageCompletedField", sourceApplicationPackageCompletedField), sourceApplicationPackageCompletedField, (this.applicationPackageCompletedField!= null)));
                    copy.setApplicationPackageCompletedField(copyApplicationPackageCompletedField);
                } else {
                    if (applicationPackageCompletedFieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.applicationPackageCompletedField = null;
                    }
                }
            }
            {
                Boolean salutationFieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.salutationField!= null));
                if (salutationFieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    MandatoryOptionalType sourceSalutationField;
                    sourceSalutationField = this.getSalutationField();
                    MandatoryOptionalType copySalutationField = ((MandatoryOptionalType) strategy.copy(LocatorUtils.property(locator, "salutationField", sourceSalutationField), sourceSalutationField, (this.salutationField!= null)));
                    copy.setSalutationField(copySalutationField);
                } else {
                    if (salutationFieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.salutationField = null;
                    }
                }
            }
            {
                Boolean companyFieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.companyField!= null));
                if (companyFieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    MandatoryOptionalType sourceCompanyField;
                    sourceCompanyField = this.getCompanyField();
                    MandatoryOptionalType copyCompanyField = ((MandatoryOptionalType) strategy.copy(LocatorUtils.property(locator, "companyField", sourceCompanyField), sourceCompanyField, (this.companyField!= null)));
                    copy.setCompanyField(copyCompanyField);
                } else {
                    if (companyFieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.companyField = null;
                    }
                }
            }
            {
                Boolean messageFieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.messageField!= null));
                if (messageFieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    MandatoryOptionalType sourceMessageField;
                    sourceMessageField = this.getMessageField();
                    MandatoryOptionalType copyMessageField = ((MandatoryOptionalType) strategy.copy(LocatorUtils.property(locator, "messageField", sourceMessageField), sourceMessageField, (this.messageField!= null)));
                    copy.setMessageField(copyMessageField);
                } else {
                    if (messageFieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.messageField = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ContactFormConfiguration();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ContactFormConfiguration that = ((ContactFormConfiguration) object);
        {
            MandatoryOptionalType lhsMoveInDateField;
            lhsMoveInDateField = this.getMoveInDateField();
            MandatoryOptionalType rhsMoveInDateField;
            rhsMoveInDateField = that.getMoveInDateField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "moveInDateField", lhsMoveInDateField), LocatorUtils.property(thatLocator, "moveInDateField", rhsMoveInDateField), lhsMoveInDateField, rhsMoveInDateField, (this.moveInDateField!= null), (that.moveInDateField!= null))) {
                return false;
            }
        }
        {
            MandatoryOptionalType lhsPetsInHouseholdField;
            lhsPetsInHouseholdField = this.getPetsInHouseholdField();
            MandatoryOptionalType rhsPetsInHouseholdField;
            rhsPetsInHouseholdField = that.getPetsInHouseholdField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "petsInHouseholdField", lhsPetsInHouseholdField), LocatorUtils.property(thatLocator, "petsInHouseholdField", rhsPetsInHouseholdField), lhsPetsInHouseholdField, rhsPetsInHouseholdField, (this.petsInHouseholdField!= null), (that.petsInHouseholdField!= null))) {
                return false;
            }
        }
        {
            MandatoryOptionalType lhsNumberOfPersonsField;
            lhsNumberOfPersonsField = this.getNumberOfPersonsField();
            MandatoryOptionalType rhsNumberOfPersonsField;
            rhsNumberOfPersonsField = that.getNumberOfPersonsField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfPersonsField", lhsNumberOfPersonsField), LocatorUtils.property(thatLocator, "numberOfPersonsField", rhsNumberOfPersonsField), lhsNumberOfPersonsField, rhsNumberOfPersonsField, (this.numberOfPersonsField!= null), (that.numberOfPersonsField!= null))) {
                return false;
            }
        }
        {
            MandatoryOptionalType lhsEmploymentRelationshipField;
            lhsEmploymentRelationshipField = this.getEmploymentRelationshipField();
            MandatoryOptionalType rhsEmploymentRelationshipField;
            rhsEmploymentRelationshipField = that.getEmploymentRelationshipField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "employmentRelationshipField", lhsEmploymentRelationshipField), LocatorUtils.property(thatLocator, "employmentRelationshipField", rhsEmploymentRelationshipField), lhsEmploymentRelationshipField, rhsEmploymentRelationshipField, (this.employmentRelationshipField!= null), (that.employmentRelationshipField!= null))) {
                return false;
            }
        }
        {
            MandatoryOptionalType lhsIncomeField;
            lhsIncomeField = this.getIncomeField();
            MandatoryOptionalType rhsIncomeField;
            rhsIncomeField = that.getIncomeField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "incomeField", lhsIncomeField), LocatorUtils.property(thatLocator, "incomeField", rhsIncomeField), lhsIncomeField, rhsIncomeField, (this.incomeField!= null), (that.incomeField!= null))) {
                return false;
            }
        }
        {
            MandatoryOptionalType lhsFirstnameField;
            lhsFirstnameField = this.getFirstnameField();
            MandatoryOptionalType rhsFirstnameField;
            rhsFirstnameField = that.getFirstnameField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firstnameField", lhsFirstnameField), LocatorUtils.property(thatLocator, "firstnameField", rhsFirstnameField), lhsFirstnameField, rhsFirstnameField, (this.firstnameField!= null), (that.firstnameField!= null))) {
                return false;
            }
        }
        {
            MandatoryOptionalType lhsLastnameField;
            lhsLastnameField = this.getLastnameField();
            MandatoryOptionalType rhsLastnameField;
            rhsLastnameField = that.getLastnameField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastnameField", lhsLastnameField), LocatorUtils.property(thatLocator, "lastnameField", rhsLastnameField), lhsLastnameField, rhsLastnameField, (this.lastnameField!= null), (that.lastnameField!= null))) {
                return false;
            }
        }
        {
            MandatoryOptionalType lhsPhoneNumberField;
            lhsPhoneNumberField = this.getPhoneNumberField();
            MandatoryOptionalType rhsPhoneNumberField;
            rhsPhoneNumberField = that.getPhoneNumberField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phoneNumberField", lhsPhoneNumberField), LocatorUtils.property(thatLocator, "phoneNumberField", rhsPhoneNumberField), lhsPhoneNumberField, rhsPhoneNumberField, (this.phoneNumberField!= null), (that.phoneNumberField!= null))) {
                return false;
            }
        }
        {
            MandatoryOptionalType lhsEmailAddressField;
            lhsEmailAddressField = this.getEmailAddressField();
            MandatoryOptionalType rhsEmailAddressField;
            rhsEmailAddressField = that.getEmailAddressField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emailAddressField", lhsEmailAddressField), LocatorUtils.property(thatLocator, "emailAddressField", rhsEmailAddressField), lhsEmailAddressField, rhsEmailAddressField, (this.emailAddressField!= null), (that.emailAddressField!= null))) {
                return false;
            }
        }
        {
            MandatoryOptionalType lhsAddressField;
            lhsAddressField = this.getAddressField();
            MandatoryOptionalType rhsAddressField;
            rhsAddressField = that.getAddressField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "addressField", lhsAddressField), LocatorUtils.property(thatLocator, "addressField", rhsAddressField), lhsAddressField, rhsAddressField, (this.addressField!= null), (that.addressField!= null))) {
                return false;
            }
        }
        {
            MandatoryOptionalType lhsSchufaInformationField;
            lhsSchufaInformationField = this.getSchufaInformationField();
            MandatoryOptionalType rhsSchufaInformationField;
            rhsSchufaInformationField = that.getSchufaInformationField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schufaInformationField", lhsSchufaInformationField), LocatorUtils.property(thatLocator, "schufaInformationField", rhsSchufaInformationField), lhsSchufaInformationField, rhsSchufaInformationField, (this.schufaInformationField!= null), (that.schufaInformationField!= null))) {
                return false;
            }
        }
        {
            MandatoryOptionalType lhsBuyReasonField;
            lhsBuyReasonField = this.getBuyReasonField();
            MandatoryOptionalType rhsBuyReasonField;
            rhsBuyReasonField = that.getBuyReasonField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buyReasonField", lhsBuyReasonField), LocatorUtils.property(thatLocator, "buyReasonField", rhsBuyReasonField), lhsBuyReasonField, rhsBuyReasonField, (this.buyReasonField!= null), (that.buyReasonField!= null))) {
                return false;
            }
        }
        {
            MandatoryOptionalType lhsOwnCapitalField;
            lhsOwnCapitalField = this.getOwnCapitalField();
            MandatoryOptionalType rhsOwnCapitalField;
            rhsOwnCapitalField = that.getOwnCapitalField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ownCapitalField", lhsOwnCapitalField), LocatorUtils.property(thatLocator, "ownCapitalField", rhsOwnCapitalField), lhsOwnCapitalField, rhsOwnCapitalField, (this.ownCapitalField!= null), (that.ownCapitalField!= null))) {
                return false;
            }
        }
        {
            MandatoryOptionalType lhsHasPreapprovalField;
            lhsHasPreapprovalField = this.getHasPreapprovalField();
            MandatoryOptionalType rhsHasPreapprovalField;
            rhsHasPreapprovalField = that.getHasPreapprovalField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hasPreapprovalField", lhsHasPreapprovalField), LocatorUtils.property(thatLocator, "hasPreapprovalField", rhsHasPreapprovalField), lhsHasPreapprovalField, rhsHasPreapprovalField, (this.hasPreapprovalField!= null), (that.hasPreapprovalField!= null))) {
                return false;
            }
        }
        {
            MandatoryOptionalType lhsLotAvailableField;
            lhsLotAvailableField = this.getLotAvailableField();
            MandatoryOptionalType rhsLotAvailableField;
            rhsLotAvailableField = that.getLotAvailableField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotAvailableField", lhsLotAvailableField), LocatorUtils.property(thatLocator, "lotAvailableField", rhsLotAvailableField), lhsLotAvailableField, rhsLotAvailableField, (this.lotAvailableField!= null), (that.lotAvailableField!= null))) {
                return false;
            }
        }
        {
            MandatoryOptionalType lhsNumberOfRequiredWorkingPlacesField;
            lhsNumberOfRequiredWorkingPlacesField = this.getNumberOfRequiredWorkingPlacesField();
            MandatoryOptionalType rhsNumberOfRequiredWorkingPlacesField;
            rhsNumberOfRequiredWorkingPlacesField = that.getNumberOfRequiredWorkingPlacesField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfRequiredWorkingPlacesField", lhsNumberOfRequiredWorkingPlacesField), LocatorUtils.property(thatLocator, "numberOfRequiredWorkingPlacesField", rhsNumberOfRequiredWorkingPlacesField), lhsNumberOfRequiredWorkingPlacesField, rhsNumberOfRequiredWorkingPlacesField, (this.numberOfRequiredWorkingPlacesField!= null), (that.numberOfRequiredWorkingPlacesField!= null))) {
                return false;
            }
        }
        {
            MandatoryOptionalType lhsPlannedInvestmentField;
            lhsPlannedInvestmentField = this.getPlannedInvestmentField();
            MandatoryOptionalType rhsPlannedInvestmentField;
            rhsPlannedInvestmentField = that.getPlannedInvestmentField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "plannedInvestmentField", lhsPlannedInvestmentField), LocatorUtils.property(thatLocator, "plannedInvestmentField", rhsPlannedInvestmentField), lhsPlannedInvestmentField, rhsPlannedInvestmentField, (this.plannedInvestmentField!= null), (that.plannedInvestmentField!= null))) {
                return false;
            }
        }
        {
            MandatoryOptionalType lhsCommercialUsageField;
            lhsCommercialUsageField = this.getCommercialUsageField();
            MandatoryOptionalType rhsCommercialUsageField;
            rhsCommercialUsageField = that.getCommercialUsageField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commercialUsageField", lhsCommercialUsageField), LocatorUtils.property(thatLocator, "commercialUsageField", rhsCommercialUsageField), lhsCommercialUsageField, rhsCommercialUsageField, (this.commercialUsageField!= null), (that.commercialUsageField!= null))) {
                return false;
            }
        }
        {
            MandatoryOptionalType lhsApplicationPackageCompletedField;
            lhsApplicationPackageCompletedField = this.getApplicationPackageCompletedField();
            MandatoryOptionalType rhsApplicationPackageCompletedField;
            rhsApplicationPackageCompletedField = that.getApplicationPackageCompletedField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "applicationPackageCompletedField", lhsApplicationPackageCompletedField), LocatorUtils.property(thatLocator, "applicationPackageCompletedField", rhsApplicationPackageCompletedField), lhsApplicationPackageCompletedField, rhsApplicationPackageCompletedField, (this.applicationPackageCompletedField!= null), (that.applicationPackageCompletedField!= null))) {
                return false;
            }
        }
        {
            MandatoryOptionalType lhsSalutationField;
            lhsSalutationField = this.getSalutationField();
            MandatoryOptionalType rhsSalutationField;
            rhsSalutationField = that.getSalutationField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salutationField", lhsSalutationField), LocatorUtils.property(thatLocator, "salutationField", rhsSalutationField), lhsSalutationField, rhsSalutationField, (this.salutationField!= null), (that.salutationField!= null))) {
                return false;
            }
        }
        {
            MandatoryOptionalType lhsCompanyField;
            lhsCompanyField = this.getCompanyField();
            MandatoryOptionalType rhsCompanyField;
            rhsCompanyField = that.getCompanyField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "companyField", lhsCompanyField), LocatorUtils.property(thatLocator, "companyField", rhsCompanyField), lhsCompanyField, rhsCompanyField, (this.companyField!= null), (that.companyField!= null))) {
                return false;
            }
        }
        {
            MandatoryOptionalType lhsMessageField;
            lhsMessageField = this.getMessageField();
            MandatoryOptionalType rhsMessageField;
            rhsMessageField = that.getMessageField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "messageField", lhsMessageField), LocatorUtils.property(thatLocator, "messageField", rhsMessageField), lhsMessageField, rhsMessageField, (this.messageField!= null), (that.messageField!= null))) {
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
