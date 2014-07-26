//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.03 at 08:04:31 PM CEST 
//


package org.openestate.is24.restapi.xml.common;

import java.net.URL;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.openestate.is24.restapi.xml.realestates.RealEstate;
import org.openestate.is24.restapi.xml.Adapter1;


/**
 * Allgemeine Elemente f\u00fcr alle Immobilienarten im Expose.
 *       
 * 
 * <p>Java class for AbstractRealEstate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractRealEstate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}AbstractRealEstateForList">
 *       &lt;sequence>
 *         &lt;element name="groupNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="2147483647"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="descriptionNote" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="furnishingNote" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="locationNote" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="otherNote" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="attachments" type="{http://rest.immobilienscout24.de/schema/common/1.0}Attachments" minOccurs="0"/>
 *         &lt;element name="referencePriceServiceCall" type="{http://rest.immobilienscout24.de/schema/common/1.0}uri" minOccurs="0"/>
 *         &lt;element name="referencePriceApiCall" type="{http://rest.immobilienscout24.de/schema/common/1.0}uri" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractRealEstate", propOrder = {
    "groupNumber",
    "descriptionNote",
    "furnishingNote",
    "locationNote",
    "otherNote",
    "attachments",
    "referencePriceServiceCall",
    "referencePriceApiCall"
})
@XmlSeeAlso({
    RealEstate.class
})
public abstract class AbstractRealEstate
    extends AbstractRealEstateForList
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter15 .class)
    protected Integer groupNumber;
    @XmlJavaTypeAdapter(Adapter16 .class)
    protected String descriptionNote;
    @XmlJavaTypeAdapter(Adapter17 .class)
    protected String furnishingNote;
    @XmlJavaTypeAdapter(Adapter18 .class)
    protected String locationNote;
    @XmlJavaTypeAdapter(Adapter19 .class)
    protected String otherNote;
    protected Attachments attachments;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected URL referencePriceServiceCall;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected URL referencePriceApiCall;

    /**
     * Gets the value of the groupNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getGroupNumber() {
        return groupNumber;
    }

    /**
     * Sets the value of the groupNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupNumber(Integer value) {
        this.groupNumber = value;
    }

    /**
     * Gets the value of the descriptionNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionNote() {
        return descriptionNote;
    }

    /**
     * Sets the value of the descriptionNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionNote(String value) {
        this.descriptionNote = value;
    }

    /**
     * Gets the value of the furnishingNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFurnishingNote() {
        return furnishingNote;
    }

    /**
     * Sets the value of the furnishingNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFurnishingNote(String value) {
        this.furnishingNote = value;
    }

    /**
     * Gets the value of the locationNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationNote() {
        return locationNote;
    }

    /**
     * Sets the value of the locationNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationNote(String value) {
        this.locationNote = value;
    }

    /**
     * Gets the value of the otherNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherNote() {
        return otherNote;
    }

    /**
     * Sets the value of the otherNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherNote(String value) {
        this.otherNote = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link Attachments }
     *     
     */
    public Attachments getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachments }
     *     
     */
    public void setAttachments(Attachments value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the referencePriceServiceCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public URL getReferencePriceServiceCall() {
        return referencePriceServiceCall;
    }

    /**
     * Sets the value of the referencePriceServiceCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencePriceServiceCall(URL value) {
        this.referencePriceServiceCall = value;
    }

    /**
     * Gets the value of the referencePriceApiCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public URL getReferencePriceApiCall() {
        return referencePriceApiCall;
    }

    /**
     * Sets the value of the referencePriceApiCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencePriceApiCall(URL value) {
        this.referencePriceApiCall = value;
    }

}