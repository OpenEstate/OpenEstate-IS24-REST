//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.03 at 08:04:31 PM CEST 
//


package org.openestate.is24.restapi.xml.common;

import java.net.URL;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.openestate.is24.restapi.xml.Adapter1;
import org.openestate.is24.restapi.xml.Adapter2;


/**
 * Ein Anhang
 * 
 * <p>Java class for Attachment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Attachment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="title" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="checkSum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://rest.immobilienscout24.de/schema/common/1.0}Reference"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Attachment", propOrder = {
    "title",
    "checkSum",
    "externalId"
})
@XmlSeeAlso({
    StreamingVideo.class,
    Picture.class,
    Link.class,
    ExtendedAttachment.class
})
public abstract class Attachment {

    @XmlJavaTypeAdapter(Adapter45 .class)
    protected String title;
    protected String checkSum;
    @XmlJavaTypeAdapter(Adapter46 .class)
    protected String externalId;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anyURI")
    protected URL href;
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
     * Gets the value of the checkSum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckSum() {
        return checkSum;
    }

    /**
     * Sets the value of the checkSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckSum(String value) {
        this.checkSum = value;
    }

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
     * Link zum Element.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public URL getHref() {
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
    public void setHref(URL value) {
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

}