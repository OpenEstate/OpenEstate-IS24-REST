
package org.openestate.is24.restapi.xml.expose;

import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
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
import org.openestate.is24.restapi.xml.Adapter2;
import org.openestate.is24.restapi.xml.Adapter4;
import org.openestate.is24.restapi.xml.common.ContactFormType;
import org.openestate.is24.restapi.xml.common.ExposeContactDetails;
import org.openestate.is24.restapi.xml.commonsearch.KeyAndValue;


/**
 * Expose
 * 
 * <p>Java class for Expose complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Expose"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="realEstate" type="{http://rest.immobilienscout24.de/schema/search/expose/1.0}ExposeRealEstate"/&gt;
 *         &lt;element name="contactDetails" type="{http://rest.immobilienscout24.de/schema/common/1.0}ExposeContactDetails"/&gt;
 *         &lt;element name="imprintLink" type="{http://rest.immobilienscout24.de/schema/search/expose/1.0}ImprintLink" minOccurs="0"/&gt;
 *         &lt;element name="cancellationPolicyLink" type="{http://rest.immobilienscout24.de/schema/search/expose/1.0}CancellationPolicyLink" minOccurs="0"/&gt;
 *         &lt;element name="realtorValuationJSONLink" type="{http://rest.immobilienscout24.de/schema/search/expose/1.0}realtorValuationJSONLink" minOccurs="0"/&gt;
 *         &lt;element name="realtorValuationV2JSONLink" type="{http://rest.immobilienscout24.de/schema/search/expose/1.0}realtorValuationJSONLink" minOccurs="0"/&gt;
 *         &lt;element name="realtorValuationV2JSONPLink" type="{http://rest.immobilienscout24.de/schema/search/expose/1.0}realtorValuationJSONPLink" minOccurs="0"/&gt;
 *         &lt;element name="companyWideCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactFormConfiguration" type="{http://rest.immobilienscout24.de/schema/search/expose/1.0}ContactFormConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="propertyDeveloper" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="adLinkForXMLData" type="{http://rest.immobilienscout24.de/schema/search/expose/1.0}SimpleLink" minOccurs="0"/&gt;
 *         &lt;element name="adLinkForJSONP" type="{http://rest.immobilienscout24.de/schema/search/expose/1.0}SimpleLink" minOccurs="0"/&gt;
 *         &lt;element name="exposeAdKeysAndValues" type="{http://rest.immobilienscout24.de/schema/search/common/1.0}keyAndValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="realEstateProjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="realEstateProjectLink" type="{http://rest.immobilienscout24.de/schema/search/expose/1.0}SimpleLink" minOccurs="0"/&gt;
 *         &lt;element name="contactFormLegalDisclaimer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telekomWidgetLink" type="{http://rest.immobilienscout24.de/schema/search/expose/1.0}SimpleLink" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://rest.immobilienscout24.de/schema/common/1.0}Reference"/&gt;
 *       &lt;attGroup ref="{http://rest.immobilienscout24.de/schema/search/expose/1.0}ContactFormType"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Expose", propOrder = {
    "realEstate",
    "contactDetails",
    "imprintLink",
    "cancellationPolicyLink",
    "realtorValuationJSONLink",
    "realtorValuationV2JSONLink",
    "realtorValuationV2JSONPLink",
    "companyWideCustomerId",
    "contactFormConfiguration",
    "propertyDeveloper",
    "adLinkForXMLData",
    "adLinkForJSONP",
    "exposeAdKeysAndValues",
    "realEstateProjectId",
    "realEstateProjectLink",
    "contactFormLegalDisclaimer",
    "telekomWidgetLink"
})
public class Expose implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    protected ExposeRealEstate realEstate;
    @XmlElement(required = true)
    protected ExposeContactDetails contactDetails;
    protected ImprintLink imprintLink;
    protected CancellationPolicyLink cancellationPolicyLink;
    protected RealtorValuationJSONLink realtorValuationJSONLink;
    protected RealtorValuationJSONLink realtorValuationV2JSONLink;
    protected RealtorValuationJSONPLink realtorValuationV2JSONPLink;
    protected String companyWideCustomerId;
    protected ContactFormConfiguration contactFormConfiguration;
    protected Boolean propertyDeveloper;
    protected SimpleLink adLinkForXMLData;
    protected SimpleLink adLinkForJSONP;
    protected List<KeyAndValue> exposeAdKeysAndValues;
    protected String realEstateProjectId;
    protected SimpleLink realEstateProjectLink;
    protected String contactFormLegalDisclaimer;
    protected SimpleLink telekomWidgetLink;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "anyURI")
    protected URI href;
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
    @XmlAttribute(name = "contactFormType")
    protected ContactFormType contactFormType;

    /**
     * Gets the value of the realEstate property.
     * 
     * @return
     *     possible object is
     *     {@link ExposeRealEstate }
     *     
     */
    public ExposeRealEstate getRealEstate() {
        return realEstate;
    }

    /**
     * Sets the value of the realEstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposeRealEstate }
     *     
     */
    public void setRealEstate(ExposeRealEstate value) {
        this.realEstate = value;
    }

    /**
     * Gets the value of the contactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ExposeContactDetails }
     *     
     */
    public ExposeContactDetails getContactDetails() {
        return contactDetails;
    }

    /**
     * Sets the value of the contactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposeContactDetails }
     *     
     */
    public void setContactDetails(ExposeContactDetails value) {
        this.contactDetails = value;
    }

    /**
     * Gets the value of the imprintLink property.
     * 
     * @return
     *     possible object is
     *     {@link ImprintLink }
     *     
     */
    public ImprintLink getImprintLink() {
        return imprintLink;
    }

    /**
     * Sets the value of the imprintLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImprintLink }
     *     
     */
    public void setImprintLink(ImprintLink value) {
        this.imprintLink = value;
    }

    /**
     * Gets the value of the cancellationPolicyLink property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationPolicyLink }
     *     
     */
    public CancellationPolicyLink getCancellationPolicyLink() {
        return cancellationPolicyLink;
    }

    /**
     * Sets the value of the cancellationPolicyLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationPolicyLink }
     *     
     */
    public void setCancellationPolicyLink(CancellationPolicyLink value) {
        this.cancellationPolicyLink = value;
    }

    /**
     * Gets the value of the realtorValuationJSONLink property.
     * 
     * @return
     *     possible object is
     *     {@link RealtorValuationJSONLink }
     *     
     */
    public RealtorValuationJSONLink getRealtorValuationJSONLink() {
        return realtorValuationJSONLink;
    }

    /**
     * Sets the value of the realtorValuationJSONLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealtorValuationJSONLink }
     *     
     */
    public void setRealtorValuationJSONLink(RealtorValuationJSONLink value) {
        this.realtorValuationJSONLink = value;
    }

    /**
     * Gets the value of the realtorValuationV2JSONLink property.
     * 
     * @return
     *     possible object is
     *     {@link RealtorValuationJSONLink }
     *     
     */
    public RealtorValuationJSONLink getRealtorValuationV2JSONLink() {
        return realtorValuationV2JSONLink;
    }

    /**
     * Sets the value of the realtorValuationV2JSONLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealtorValuationJSONLink }
     *     
     */
    public void setRealtorValuationV2JSONLink(RealtorValuationJSONLink value) {
        this.realtorValuationV2JSONLink = value;
    }

    /**
     * Gets the value of the realtorValuationV2JSONPLink property.
     * 
     * @return
     *     possible object is
     *     {@link RealtorValuationJSONPLink }
     *     
     */
    public RealtorValuationJSONPLink getRealtorValuationV2JSONPLink() {
        return realtorValuationV2JSONPLink;
    }

    /**
     * Sets the value of the realtorValuationV2JSONPLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealtorValuationJSONPLink }
     *     
     */
    public void setRealtorValuationV2JSONPLink(RealtorValuationJSONPLink value) {
        this.realtorValuationV2JSONPLink = value;
    }

    /**
     * Gets the value of the companyWideCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyWideCustomerId() {
        return companyWideCustomerId;
    }

    /**
     * Sets the value of the companyWideCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyWideCustomerId(String value) {
        this.companyWideCustomerId = value;
    }

    /**
     * Gets the value of the contactFormConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link ContactFormConfiguration }
     *     
     */
    public ContactFormConfiguration getContactFormConfiguration() {
        return contactFormConfiguration;
    }

    /**
     * Sets the value of the contactFormConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactFormConfiguration }
     *     
     */
    public void setContactFormConfiguration(ContactFormConfiguration value) {
        this.contactFormConfiguration = value;
    }

    /**
     * Gets the value of the propertyDeveloper property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPropertyDeveloper() {
        return propertyDeveloper;
    }

    /**
     * Sets the value of the propertyDeveloper property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPropertyDeveloper(Boolean value) {
        this.propertyDeveloper = value;
    }

    /**
     * Gets the value of the adLinkForXMLData property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleLink }
     *     
     */
    public SimpleLink getAdLinkForXMLData() {
        return adLinkForXMLData;
    }

    /**
     * Sets the value of the adLinkForXMLData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleLink }
     *     
     */
    public void setAdLinkForXMLData(SimpleLink value) {
        this.adLinkForXMLData = value;
    }

    /**
     * Gets the value of the adLinkForJSONP property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleLink }
     *     
     */
    public SimpleLink getAdLinkForJSONP() {
        return adLinkForJSONP;
    }

    /**
     * Sets the value of the adLinkForJSONP property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleLink }
     *     
     */
    public void setAdLinkForJSONP(SimpleLink value) {
        this.adLinkForJSONP = value;
    }

    /**
     * Gets the value of the exposeAdKeysAndValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exposeAdKeysAndValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExposeAdKeysAndValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyAndValue }
     * 
     * 
     */
    public List<KeyAndValue> getExposeAdKeysAndValues() {
        if (exposeAdKeysAndValues == null) {
            exposeAdKeysAndValues = new ArrayList<KeyAndValue>();
        }
        return this.exposeAdKeysAndValues;
    }

    /**
     * Gets the value of the realEstateProjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealEstateProjectId() {
        return realEstateProjectId;
    }

    /**
     * Sets the value of the realEstateProjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealEstateProjectId(String value) {
        this.realEstateProjectId = value;
    }

    /**
     * Gets the value of the realEstateProjectLink property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleLink }
     *     
     */
    public SimpleLink getRealEstateProjectLink() {
        return realEstateProjectLink;
    }

    /**
     * Sets the value of the realEstateProjectLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleLink }
     *     
     */
    public void setRealEstateProjectLink(SimpleLink value) {
        this.realEstateProjectLink = value;
    }

    /**
     * Gets the value of the contactFormLegalDisclaimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFormLegalDisclaimer() {
        return contactFormLegalDisclaimer;
    }

    /**
     * Sets the value of the contactFormLegalDisclaimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFormLegalDisclaimer(String value) {
        this.contactFormLegalDisclaimer = value;
    }

    /**
     * Gets the value of the telekomWidgetLink property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleLink }
     *     
     */
    public SimpleLink getTelekomWidgetLink() {
        return telekomWidgetLink;
    }

    /**
     * Sets the value of the telekomWidgetLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleLink }
     *     
     */
    public void setTelekomWidgetLink(SimpleLink value) {
        this.telekomWidgetLink = value;
    }

    /**
     * Link zum Element.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public URI getHref() {
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
    public void setHref(URI value) {
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
            ExposeRealEstate theRealEstate;
            theRealEstate = this.getRealEstate();
            strategy.appendField(locator, this, "realEstate", buffer, theRealEstate, (this.realEstate!= null));
        }
        {
            ExposeContactDetails theContactDetails;
            theContactDetails = this.getContactDetails();
            strategy.appendField(locator, this, "contactDetails", buffer, theContactDetails, (this.contactDetails!= null));
        }
        {
            ImprintLink theImprintLink;
            theImprintLink = this.getImprintLink();
            strategy.appendField(locator, this, "imprintLink", buffer, theImprintLink, (this.imprintLink!= null));
        }
        {
            CancellationPolicyLink theCancellationPolicyLink;
            theCancellationPolicyLink = this.getCancellationPolicyLink();
            strategy.appendField(locator, this, "cancellationPolicyLink", buffer, theCancellationPolicyLink, (this.cancellationPolicyLink!= null));
        }
        {
            RealtorValuationJSONLink theRealtorValuationJSONLink;
            theRealtorValuationJSONLink = this.getRealtorValuationJSONLink();
            strategy.appendField(locator, this, "realtorValuationJSONLink", buffer, theRealtorValuationJSONLink, (this.realtorValuationJSONLink!= null));
        }
        {
            RealtorValuationJSONLink theRealtorValuationV2JSONLink;
            theRealtorValuationV2JSONLink = this.getRealtorValuationV2JSONLink();
            strategy.appendField(locator, this, "realtorValuationV2JSONLink", buffer, theRealtorValuationV2JSONLink, (this.realtorValuationV2JSONLink!= null));
        }
        {
            RealtorValuationJSONPLink theRealtorValuationV2JSONPLink;
            theRealtorValuationV2JSONPLink = this.getRealtorValuationV2JSONPLink();
            strategy.appendField(locator, this, "realtorValuationV2JSONPLink", buffer, theRealtorValuationV2JSONPLink, (this.realtorValuationV2JSONPLink!= null));
        }
        {
            String theCompanyWideCustomerId;
            theCompanyWideCustomerId = this.getCompanyWideCustomerId();
            strategy.appendField(locator, this, "companyWideCustomerId", buffer, theCompanyWideCustomerId, (this.companyWideCustomerId!= null));
        }
        {
            ContactFormConfiguration theContactFormConfiguration;
            theContactFormConfiguration = this.getContactFormConfiguration();
            strategy.appendField(locator, this, "contactFormConfiguration", buffer, theContactFormConfiguration, (this.contactFormConfiguration!= null));
        }
        {
            Boolean thePropertyDeveloper;
            thePropertyDeveloper = this.isPropertyDeveloper();
            strategy.appendField(locator, this, "propertyDeveloper", buffer, thePropertyDeveloper, (this.propertyDeveloper!= null));
        }
        {
            SimpleLink theAdLinkForXMLData;
            theAdLinkForXMLData = this.getAdLinkForXMLData();
            strategy.appendField(locator, this, "adLinkForXMLData", buffer, theAdLinkForXMLData, (this.adLinkForXMLData!= null));
        }
        {
            SimpleLink theAdLinkForJSONP;
            theAdLinkForJSONP = this.getAdLinkForJSONP();
            strategy.appendField(locator, this, "adLinkForJSONP", buffer, theAdLinkForJSONP, (this.adLinkForJSONP!= null));
        }
        {
            List<KeyAndValue> theExposeAdKeysAndValues;
            theExposeAdKeysAndValues = (((this.exposeAdKeysAndValues!= null)&&(!this.exposeAdKeysAndValues.isEmpty()))?this.getExposeAdKeysAndValues():null);
            strategy.appendField(locator, this, "exposeAdKeysAndValues", buffer, theExposeAdKeysAndValues, ((this.exposeAdKeysAndValues!= null)&&(!this.exposeAdKeysAndValues.isEmpty())));
        }
        {
            String theRealEstateProjectId;
            theRealEstateProjectId = this.getRealEstateProjectId();
            strategy.appendField(locator, this, "realEstateProjectId", buffer, theRealEstateProjectId, (this.realEstateProjectId!= null));
        }
        {
            SimpleLink theRealEstateProjectLink;
            theRealEstateProjectLink = this.getRealEstateProjectLink();
            strategy.appendField(locator, this, "realEstateProjectLink", buffer, theRealEstateProjectLink, (this.realEstateProjectLink!= null));
        }
        {
            String theContactFormLegalDisclaimer;
            theContactFormLegalDisclaimer = this.getContactFormLegalDisclaimer();
            strategy.appendField(locator, this, "contactFormLegalDisclaimer", buffer, theContactFormLegalDisclaimer, (this.contactFormLegalDisclaimer!= null));
        }
        {
            SimpleLink theTelekomWidgetLink;
            theTelekomWidgetLink = this.getTelekomWidgetLink();
            strategy.appendField(locator, this, "telekomWidgetLink", buffer, theTelekomWidgetLink, (this.telekomWidgetLink!= null));
        }
        {
            URI theHref;
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
        if (draftCopy instanceof Expose) {
            final Expose copy = ((Expose) draftCopy);
            {
                Boolean realEstateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.realEstate!= null));
                if (realEstateShouldBeCopiedAndSet == Boolean.TRUE) {
                    ExposeRealEstate sourceRealEstate;
                    sourceRealEstate = this.getRealEstate();
                    ExposeRealEstate copyRealEstate = ((ExposeRealEstate) strategy.copy(LocatorUtils.property(locator, "realEstate", sourceRealEstate), sourceRealEstate, (this.realEstate!= null)));
                    copy.setRealEstate(copyRealEstate);
                } else {
                    if (realEstateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realEstate = null;
                    }
                }
            }
            {
                Boolean contactDetailsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.contactDetails!= null));
                if (contactDetailsShouldBeCopiedAndSet == Boolean.TRUE) {
                    ExposeContactDetails sourceContactDetails;
                    sourceContactDetails = this.getContactDetails();
                    ExposeContactDetails copyContactDetails = ((ExposeContactDetails) strategy.copy(LocatorUtils.property(locator, "contactDetails", sourceContactDetails), sourceContactDetails, (this.contactDetails!= null)));
                    copy.setContactDetails(copyContactDetails);
                } else {
                    if (contactDetailsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.contactDetails = null;
                    }
                }
            }
            {
                Boolean imprintLinkShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.imprintLink!= null));
                if (imprintLinkShouldBeCopiedAndSet == Boolean.TRUE) {
                    ImprintLink sourceImprintLink;
                    sourceImprintLink = this.getImprintLink();
                    ImprintLink copyImprintLink = ((ImprintLink) strategy.copy(LocatorUtils.property(locator, "imprintLink", sourceImprintLink), sourceImprintLink, (this.imprintLink!= null)));
                    copy.setImprintLink(copyImprintLink);
                } else {
                    if (imprintLinkShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.imprintLink = null;
                    }
                }
            }
            {
                Boolean cancellationPolicyLinkShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.cancellationPolicyLink!= null));
                if (cancellationPolicyLinkShouldBeCopiedAndSet == Boolean.TRUE) {
                    CancellationPolicyLink sourceCancellationPolicyLink;
                    sourceCancellationPolicyLink = this.getCancellationPolicyLink();
                    CancellationPolicyLink copyCancellationPolicyLink = ((CancellationPolicyLink) strategy.copy(LocatorUtils.property(locator, "cancellationPolicyLink", sourceCancellationPolicyLink), sourceCancellationPolicyLink, (this.cancellationPolicyLink!= null)));
                    copy.setCancellationPolicyLink(copyCancellationPolicyLink);
                } else {
                    if (cancellationPolicyLinkShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cancellationPolicyLink = null;
                    }
                }
            }
            {
                Boolean realtorValuationJSONLinkShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.realtorValuationJSONLink!= null));
                if (realtorValuationJSONLinkShouldBeCopiedAndSet == Boolean.TRUE) {
                    RealtorValuationJSONLink sourceRealtorValuationJSONLink;
                    sourceRealtorValuationJSONLink = this.getRealtorValuationJSONLink();
                    RealtorValuationJSONLink copyRealtorValuationJSONLink = ((RealtorValuationJSONLink) strategy.copy(LocatorUtils.property(locator, "realtorValuationJSONLink", sourceRealtorValuationJSONLink), sourceRealtorValuationJSONLink, (this.realtorValuationJSONLink!= null)));
                    copy.setRealtorValuationJSONLink(copyRealtorValuationJSONLink);
                } else {
                    if (realtorValuationJSONLinkShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realtorValuationJSONLink = null;
                    }
                }
            }
            {
                Boolean realtorValuationV2JSONLinkShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.realtorValuationV2JSONLink!= null));
                if (realtorValuationV2JSONLinkShouldBeCopiedAndSet == Boolean.TRUE) {
                    RealtorValuationJSONLink sourceRealtorValuationV2JSONLink;
                    sourceRealtorValuationV2JSONLink = this.getRealtorValuationV2JSONLink();
                    RealtorValuationJSONLink copyRealtorValuationV2JSONLink = ((RealtorValuationJSONLink) strategy.copy(LocatorUtils.property(locator, "realtorValuationV2JSONLink", sourceRealtorValuationV2JSONLink), sourceRealtorValuationV2JSONLink, (this.realtorValuationV2JSONLink!= null)));
                    copy.setRealtorValuationV2JSONLink(copyRealtorValuationV2JSONLink);
                } else {
                    if (realtorValuationV2JSONLinkShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realtorValuationV2JSONLink = null;
                    }
                }
            }
            {
                Boolean realtorValuationV2JSONPLinkShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.realtorValuationV2JSONPLink!= null));
                if (realtorValuationV2JSONPLinkShouldBeCopiedAndSet == Boolean.TRUE) {
                    RealtorValuationJSONPLink sourceRealtorValuationV2JSONPLink;
                    sourceRealtorValuationV2JSONPLink = this.getRealtorValuationV2JSONPLink();
                    RealtorValuationJSONPLink copyRealtorValuationV2JSONPLink = ((RealtorValuationJSONPLink) strategy.copy(LocatorUtils.property(locator, "realtorValuationV2JSONPLink", sourceRealtorValuationV2JSONPLink), sourceRealtorValuationV2JSONPLink, (this.realtorValuationV2JSONPLink!= null)));
                    copy.setRealtorValuationV2JSONPLink(copyRealtorValuationV2JSONPLink);
                } else {
                    if (realtorValuationV2JSONPLinkShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realtorValuationV2JSONPLink = null;
                    }
                }
            }
            {
                Boolean companyWideCustomerIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.companyWideCustomerId!= null));
                if (companyWideCustomerIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCompanyWideCustomerId;
                    sourceCompanyWideCustomerId = this.getCompanyWideCustomerId();
                    String copyCompanyWideCustomerId = ((String) strategy.copy(LocatorUtils.property(locator, "companyWideCustomerId", sourceCompanyWideCustomerId), sourceCompanyWideCustomerId, (this.companyWideCustomerId!= null)));
                    copy.setCompanyWideCustomerId(copyCompanyWideCustomerId);
                } else {
                    if (companyWideCustomerIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.companyWideCustomerId = null;
                    }
                }
            }
            {
                Boolean contactFormConfigurationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.contactFormConfiguration!= null));
                if (contactFormConfigurationShouldBeCopiedAndSet == Boolean.TRUE) {
                    ContactFormConfiguration sourceContactFormConfiguration;
                    sourceContactFormConfiguration = this.getContactFormConfiguration();
                    ContactFormConfiguration copyContactFormConfiguration = ((ContactFormConfiguration) strategy.copy(LocatorUtils.property(locator, "contactFormConfiguration", sourceContactFormConfiguration), sourceContactFormConfiguration, (this.contactFormConfiguration!= null)));
                    copy.setContactFormConfiguration(copyContactFormConfiguration);
                } else {
                    if (contactFormConfigurationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.contactFormConfiguration = null;
                    }
                }
            }
            {
                Boolean propertyDeveloperShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.propertyDeveloper!= null));
                if (propertyDeveloperShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourcePropertyDeveloper;
                    sourcePropertyDeveloper = this.isPropertyDeveloper();
                    Boolean copyPropertyDeveloper = ((Boolean) strategy.copy(LocatorUtils.property(locator, "propertyDeveloper", sourcePropertyDeveloper), sourcePropertyDeveloper, (this.propertyDeveloper!= null)));
                    copy.setPropertyDeveloper(copyPropertyDeveloper);
                } else {
                    if (propertyDeveloperShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.propertyDeveloper = null;
                    }
                }
            }
            {
                Boolean adLinkForXMLDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.adLinkForXMLData!= null));
                if (adLinkForXMLDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    SimpleLink sourceAdLinkForXMLData;
                    sourceAdLinkForXMLData = this.getAdLinkForXMLData();
                    SimpleLink copyAdLinkForXMLData = ((SimpleLink) strategy.copy(LocatorUtils.property(locator, "adLinkForXMLData", sourceAdLinkForXMLData), sourceAdLinkForXMLData, (this.adLinkForXMLData!= null)));
                    copy.setAdLinkForXMLData(copyAdLinkForXMLData);
                } else {
                    if (adLinkForXMLDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.adLinkForXMLData = null;
                    }
                }
            }
            {
                Boolean adLinkForJSONPShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.adLinkForJSONP!= null));
                if (adLinkForJSONPShouldBeCopiedAndSet == Boolean.TRUE) {
                    SimpleLink sourceAdLinkForJSONP;
                    sourceAdLinkForJSONP = this.getAdLinkForJSONP();
                    SimpleLink copyAdLinkForJSONP = ((SimpleLink) strategy.copy(LocatorUtils.property(locator, "adLinkForJSONP", sourceAdLinkForJSONP), sourceAdLinkForJSONP, (this.adLinkForJSONP!= null)));
                    copy.setAdLinkForJSONP(copyAdLinkForJSONP);
                } else {
                    if (adLinkForJSONPShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.adLinkForJSONP = null;
                    }
                }
            }
            {
                Boolean exposeAdKeysAndValuesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.exposeAdKeysAndValues!= null)&&(!this.exposeAdKeysAndValues.isEmpty())));
                if (exposeAdKeysAndValuesShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<KeyAndValue> sourceExposeAdKeysAndValues;
                    sourceExposeAdKeysAndValues = (((this.exposeAdKeysAndValues!= null)&&(!this.exposeAdKeysAndValues.isEmpty()))?this.getExposeAdKeysAndValues():null);
                    @SuppressWarnings("unchecked")
                    List<KeyAndValue> copyExposeAdKeysAndValues = ((List<KeyAndValue> ) strategy.copy(LocatorUtils.property(locator, "exposeAdKeysAndValues", sourceExposeAdKeysAndValues), sourceExposeAdKeysAndValues, ((this.exposeAdKeysAndValues!= null)&&(!this.exposeAdKeysAndValues.isEmpty()))));
                    copy.exposeAdKeysAndValues = null;
                    if (copyExposeAdKeysAndValues!= null) {
                        List<KeyAndValue> uniqueExposeAdKeysAndValuesl = copy.getExposeAdKeysAndValues();
                        uniqueExposeAdKeysAndValuesl.addAll(copyExposeAdKeysAndValues);
                    }
                } else {
                    if (exposeAdKeysAndValuesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.exposeAdKeysAndValues = null;
                    }
                }
            }
            {
                Boolean realEstateProjectIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.realEstateProjectId!= null));
                if (realEstateProjectIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceRealEstateProjectId;
                    sourceRealEstateProjectId = this.getRealEstateProjectId();
                    String copyRealEstateProjectId = ((String) strategy.copy(LocatorUtils.property(locator, "realEstateProjectId", sourceRealEstateProjectId), sourceRealEstateProjectId, (this.realEstateProjectId!= null)));
                    copy.setRealEstateProjectId(copyRealEstateProjectId);
                } else {
                    if (realEstateProjectIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realEstateProjectId = null;
                    }
                }
            }
            {
                Boolean realEstateProjectLinkShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.realEstateProjectLink!= null));
                if (realEstateProjectLinkShouldBeCopiedAndSet == Boolean.TRUE) {
                    SimpleLink sourceRealEstateProjectLink;
                    sourceRealEstateProjectLink = this.getRealEstateProjectLink();
                    SimpleLink copyRealEstateProjectLink = ((SimpleLink) strategy.copy(LocatorUtils.property(locator, "realEstateProjectLink", sourceRealEstateProjectLink), sourceRealEstateProjectLink, (this.realEstateProjectLink!= null)));
                    copy.setRealEstateProjectLink(copyRealEstateProjectLink);
                } else {
                    if (realEstateProjectLinkShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realEstateProjectLink = null;
                    }
                }
            }
            {
                Boolean contactFormLegalDisclaimerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.contactFormLegalDisclaimer!= null));
                if (contactFormLegalDisclaimerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceContactFormLegalDisclaimer;
                    sourceContactFormLegalDisclaimer = this.getContactFormLegalDisclaimer();
                    String copyContactFormLegalDisclaimer = ((String) strategy.copy(LocatorUtils.property(locator, "contactFormLegalDisclaimer", sourceContactFormLegalDisclaimer), sourceContactFormLegalDisclaimer, (this.contactFormLegalDisclaimer!= null)));
                    copy.setContactFormLegalDisclaimer(copyContactFormLegalDisclaimer);
                } else {
                    if (contactFormLegalDisclaimerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.contactFormLegalDisclaimer = null;
                    }
                }
            }
            {
                Boolean telekomWidgetLinkShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.telekomWidgetLink!= null));
                if (telekomWidgetLinkShouldBeCopiedAndSet == Boolean.TRUE) {
                    SimpleLink sourceTelekomWidgetLink;
                    sourceTelekomWidgetLink = this.getTelekomWidgetLink();
                    SimpleLink copyTelekomWidgetLink = ((SimpleLink) strategy.copy(LocatorUtils.property(locator, "telekomWidgetLink", sourceTelekomWidgetLink), sourceTelekomWidgetLink, (this.telekomWidgetLink!= null)));
                    copy.setTelekomWidgetLink(copyTelekomWidgetLink);
                } else {
                    if (telekomWidgetLinkShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.telekomWidgetLink = null;
                    }
                }
            }
            {
                Boolean hrefShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.href!= null));
                if (hrefShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceHref;
                    sourceHref = this.getHref();
                    URI copyHref = ((URI) strategy.copy(LocatorUtils.property(locator, "href", sourceHref), sourceHref, (this.href!= null)));
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
        return new Expose();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Expose that = ((Expose) object);
        {
            ExposeRealEstate lhsRealEstate;
            lhsRealEstate = this.getRealEstate();
            ExposeRealEstate rhsRealEstate;
            rhsRealEstate = that.getRealEstate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realEstate", lhsRealEstate), LocatorUtils.property(thatLocator, "realEstate", rhsRealEstate), lhsRealEstate, rhsRealEstate, (this.realEstate!= null), (that.realEstate!= null))) {
                return false;
            }
        }
        {
            ExposeContactDetails lhsContactDetails;
            lhsContactDetails = this.getContactDetails();
            ExposeContactDetails rhsContactDetails;
            rhsContactDetails = that.getContactDetails();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactDetails", lhsContactDetails), LocatorUtils.property(thatLocator, "contactDetails", rhsContactDetails), lhsContactDetails, rhsContactDetails, (this.contactDetails!= null), (that.contactDetails!= null))) {
                return false;
            }
        }
        {
            ImprintLink lhsImprintLink;
            lhsImprintLink = this.getImprintLink();
            ImprintLink rhsImprintLink;
            rhsImprintLink = that.getImprintLink();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "imprintLink", lhsImprintLink), LocatorUtils.property(thatLocator, "imprintLink", rhsImprintLink), lhsImprintLink, rhsImprintLink, (this.imprintLink!= null), (that.imprintLink!= null))) {
                return false;
            }
        }
        {
            CancellationPolicyLink lhsCancellationPolicyLink;
            lhsCancellationPolicyLink = this.getCancellationPolicyLink();
            CancellationPolicyLink rhsCancellationPolicyLink;
            rhsCancellationPolicyLink = that.getCancellationPolicyLink();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cancellationPolicyLink", lhsCancellationPolicyLink), LocatorUtils.property(thatLocator, "cancellationPolicyLink", rhsCancellationPolicyLink), lhsCancellationPolicyLink, rhsCancellationPolicyLink, (this.cancellationPolicyLink!= null), (that.cancellationPolicyLink!= null))) {
                return false;
            }
        }
        {
            RealtorValuationJSONLink lhsRealtorValuationJSONLink;
            lhsRealtorValuationJSONLink = this.getRealtorValuationJSONLink();
            RealtorValuationJSONLink rhsRealtorValuationJSONLink;
            rhsRealtorValuationJSONLink = that.getRealtorValuationJSONLink();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realtorValuationJSONLink", lhsRealtorValuationJSONLink), LocatorUtils.property(thatLocator, "realtorValuationJSONLink", rhsRealtorValuationJSONLink), lhsRealtorValuationJSONLink, rhsRealtorValuationJSONLink, (this.realtorValuationJSONLink!= null), (that.realtorValuationJSONLink!= null))) {
                return false;
            }
        }
        {
            RealtorValuationJSONLink lhsRealtorValuationV2JSONLink;
            lhsRealtorValuationV2JSONLink = this.getRealtorValuationV2JSONLink();
            RealtorValuationJSONLink rhsRealtorValuationV2JSONLink;
            rhsRealtorValuationV2JSONLink = that.getRealtorValuationV2JSONLink();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realtorValuationV2JSONLink", lhsRealtorValuationV2JSONLink), LocatorUtils.property(thatLocator, "realtorValuationV2JSONLink", rhsRealtorValuationV2JSONLink), lhsRealtorValuationV2JSONLink, rhsRealtorValuationV2JSONLink, (this.realtorValuationV2JSONLink!= null), (that.realtorValuationV2JSONLink!= null))) {
                return false;
            }
        }
        {
            RealtorValuationJSONPLink lhsRealtorValuationV2JSONPLink;
            lhsRealtorValuationV2JSONPLink = this.getRealtorValuationV2JSONPLink();
            RealtorValuationJSONPLink rhsRealtorValuationV2JSONPLink;
            rhsRealtorValuationV2JSONPLink = that.getRealtorValuationV2JSONPLink();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realtorValuationV2JSONPLink", lhsRealtorValuationV2JSONPLink), LocatorUtils.property(thatLocator, "realtorValuationV2JSONPLink", rhsRealtorValuationV2JSONPLink), lhsRealtorValuationV2JSONPLink, rhsRealtorValuationV2JSONPLink, (this.realtorValuationV2JSONPLink!= null), (that.realtorValuationV2JSONPLink!= null))) {
                return false;
            }
        }
        {
            String lhsCompanyWideCustomerId;
            lhsCompanyWideCustomerId = this.getCompanyWideCustomerId();
            String rhsCompanyWideCustomerId;
            rhsCompanyWideCustomerId = that.getCompanyWideCustomerId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "companyWideCustomerId", lhsCompanyWideCustomerId), LocatorUtils.property(thatLocator, "companyWideCustomerId", rhsCompanyWideCustomerId), lhsCompanyWideCustomerId, rhsCompanyWideCustomerId, (this.companyWideCustomerId!= null), (that.companyWideCustomerId!= null))) {
                return false;
            }
        }
        {
            ContactFormConfiguration lhsContactFormConfiguration;
            lhsContactFormConfiguration = this.getContactFormConfiguration();
            ContactFormConfiguration rhsContactFormConfiguration;
            rhsContactFormConfiguration = that.getContactFormConfiguration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactFormConfiguration", lhsContactFormConfiguration), LocatorUtils.property(thatLocator, "contactFormConfiguration", rhsContactFormConfiguration), lhsContactFormConfiguration, rhsContactFormConfiguration, (this.contactFormConfiguration!= null), (that.contactFormConfiguration!= null))) {
                return false;
            }
        }
        {
            Boolean lhsPropertyDeveloper;
            lhsPropertyDeveloper = this.isPropertyDeveloper();
            Boolean rhsPropertyDeveloper;
            rhsPropertyDeveloper = that.isPropertyDeveloper();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "propertyDeveloper", lhsPropertyDeveloper), LocatorUtils.property(thatLocator, "propertyDeveloper", rhsPropertyDeveloper), lhsPropertyDeveloper, rhsPropertyDeveloper, (this.propertyDeveloper!= null), (that.propertyDeveloper!= null))) {
                return false;
            }
        }
        {
            SimpleLink lhsAdLinkForXMLData;
            lhsAdLinkForXMLData = this.getAdLinkForXMLData();
            SimpleLink rhsAdLinkForXMLData;
            rhsAdLinkForXMLData = that.getAdLinkForXMLData();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adLinkForXMLData", lhsAdLinkForXMLData), LocatorUtils.property(thatLocator, "adLinkForXMLData", rhsAdLinkForXMLData), lhsAdLinkForXMLData, rhsAdLinkForXMLData, (this.adLinkForXMLData!= null), (that.adLinkForXMLData!= null))) {
                return false;
            }
        }
        {
            SimpleLink lhsAdLinkForJSONP;
            lhsAdLinkForJSONP = this.getAdLinkForJSONP();
            SimpleLink rhsAdLinkForJSONP;
            rhsAdLinkForJSONP = that.getAdLinkForJSONP();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adLinkForJSONP", lhsAdLinkForJSONP), LocatorUtils.property(thatLocator, "adLinkForJSONP", rhsAdLinkForJSONP), lhsAdLinkForJSONP, rhsAdLinkForJSONP, (this.adLinkForJSONP!= null), (that.adLinkForJSONP!= null))) {
                return false;
            }
        }
        {
            List<KeyAndValue> lhsExposeAdKeysAndValues;
            lhsExposeAdKeysAndValues = (((this.exposeAdKeysAndValues!= null)&&(!this.exposeAdKeysAndValues.isEmpty()))?this.getExposeAdKeysAndValues():null);
            List<KeyAndValue> rhsExposeAdKeysAndValues;
            rhsExposeAdKeysAndValues = (((that.exposeAdKeysAndValues!= null)&&(!that.exposeAdKeysAndValues.isEmpty()))?that.getExposeAdKeysAndValues():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exposeAdKeysAndValues", lhsExposeAdKeysAndValues), LocatorUtils.property(thatLocator, "exposeAdKeysAndValues", rhsExposeAdKeysAndValues), lhsExposeAdKeysAndValues, rhsExposeAdKeysAndValues, ((this.exposeAdKeysAndValues!= null)&&(!this.exposeAdKeysAndValues.isEmpty())), ((that.exposeAdKeysAndValues!= null)&&(!that.exposeAdKeysAndValues.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsRealEstateProjectId;
            lhsRealEstateProjectId = this.getRealEstateProjectId();
            String rhsRealEstateProjectId;
            rhsRealEstateProjectId = that.getRealEstateProjectId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realEstateProjectId", lhsRealEstateProjectId), LocatorUtils.property(thatLocator, "realEstateProjectId", rhsRealEstateProjectId), lhsRealEstateProjectId, rhsRealEstateProjectId, (this.realEstateProjectId!= null), (that.realEstateProjectId!= null))) {
                return false;
            }
        }
        {
            SimpleLink lhsRealEstateProjectLink;
            lhsRealEstateProjectLink = this.getRealEstateProjectLink();
            SimpleLink rhsRealEstateProjectLink;
            rhsRealEstateProjectLink = that.getRealEstateProjectLink();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realEstateProjectLink", lhsRealEstateProjectLink), LocatorUtils.property(thatLocator, "realEstateProjectLink", rhsRealEstateProjectLink), lhsRealEstateProjectLink, rhsRealEstateProjectLink, (this.realEstateProjectLink!= null), (that.realEstateProjectLink!= null))) {
                return false;
            }
        }
        {
            String lhsContactFormLegalDisclaimer;
            lhsContactFormLegalDisclaimer = this.getContactFormLegalDisclaimer();
            String rhsContactFormLegalDisclaimer;
            rhsContactFormLegalDisclaimer = that.getContactFormLegalDisclaimer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactFormLegalDisclaimer", lhsContactFormLegalDisclaimer), LocatorUtils.property(thatLocator, "contactFormLegalDisclaimer", rhsContactFormLegalDisclaimer), lhsContactFormLegalDisclaimer, rhsContactFormLegalDisclaimer, (this.contactFormLegalDisclaimer!= null), (that.contactFormLegalDisclaimer!= null))) {
                return false;
            }
        }
        {
            SimpleLink lhsTelekomWidgetLink;
            lhsTelekomWidgetLink = this.getTelekomWidgetLink();
            SimpleLink rhsTelekomWidgetLink;
            rhsTelekomWidgetLink = that.getTelekomWidgetLink();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telekomWidgetLink", lhsTelekomWidgetLink), LocatorUtils.property(thatLocator, "telekomWidgetLink", rhsTelekomWidgetLink), lhsTelekomWidgetLink, rhsTelekomWidgetLink, (this.telekomWidgetLink!= null), (that.telekomWidgetLink!= null))) {
                return false;
            }
        }
        {
            URI lhsHref;
            lhsHref = this.getHref();
            URI rhsHref;
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
