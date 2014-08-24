//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.24 at 03:30:52 PM CEST 
//


package org.openestate.is24.restapi.xml.premiumplacement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.openestate.is24.restapi.xml.common.DateRange;


/**
 * Premiumplacement
 * 
 * <p>Java class for Premiumplacement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Premiumplacement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="servicePeriod" type="{http://rest.immobilienscout24.de/schema/common/1.0}DateRange" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="realestateid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="voucher" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Premiumplacement", propOrder = {
    "servicePeriod"
})
public class Premiumplacement {

    protected DateRange servicePeriod;
    @XmlAttribute(name = "realestateid", required = true)
    protected String realestateid;
    @XmlAttribute(name = "voucher")
    protected String voucher;

    /**
     * Gets the value of the servicePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getServicePeriod() {
        return servicePeriod;
    }

    /**
     * Sets the value of the servicePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setServicePeriod(DateRange value) {
        this.servicePeriod = value;
    }

    /**
     * Gets the value of the realestateid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealestateid() {
        return realestateid;
    }

    /**
     * Sets the value of the realestateid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealestateid(String value) {
        this.realestateid = value;
    }

    /**
     * Gets the value of the voucher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucher() {
        return voucher;
    }

    /**
     * Sets the value of the voucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucher(String value) {
        this.voucher = value;
    }

}