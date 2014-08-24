//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.24 at 03:30:52 PM CEST 
//


package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Basistyp f\u00fcr Preise.
 * 
 * <p>Java class for Price complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Price">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="currency" type="{http://rest.immobilienscout24.de/schema/common/1.0}Currency"/>
 *         &lt;element name="marketingType" type="{http://rest.immobilienscout24.de/schema/common/1.0}MarketingType" minOccurs="0"/>
 *         &lt;element name="priceIntervalType" type="{http://rest.immobilienscout24.de/schema/common/1.0}PriceIntervalType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Price", propOrder = {
    "value",
    "currency",
    "marketingType",
    "priceIntervalType"
})
@XmlSeeAlso({
    BudgetPrice.class
})
public class Price {

    protected double value;
    @XmlElement(required = true)
    protected Currency currency;
    protected MarketingType marketingType;
    protected PriceIntervalType priceIntervalType;

    /**
     * Gets the value of the value property.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the marketingType property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingType }
     *     
     */
    public MarketingType getMarketingType() {
        return marketingType;
    }

    /**
     * Sets the value of the marketingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingType }
     *     
     */
    public void setMarketingType(MarketingType value) {
        this.marketingType = value;
    }

    /**
     * Gets the value of the priceIntervalType property.
     * 
     * @return
     *     possible object is
     *     {@link PriceIntervalType }
     *     
     */
    public PriceIntervalType getPriceIntervalType() {
        return priceIntervalType;
    }

    /**
     * Sets the value of the priceIntervalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceIntervalType }
     *     
     */
    public void setPriceIntervalType(PriceIntervalType value) {
        this.priceIntervalType = value;
    }

}
