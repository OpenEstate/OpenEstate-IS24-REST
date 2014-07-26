//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.03 at 08:04:31 PM CEST 
//


package org.openestate.is24.restapi.xml.realestatestock;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for priceRegionRealEstateStock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="priceRegionRealEstateStock">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="priceRegion" type="{http://rest.immobilienscout24.de/schema/offer/realestatestock/1.0}priceRegion"/>
 *         &lt;element name="realestateCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priceRegionRealEstateStock", propOrder = {
    "priceRegion",
    "realestateCount"
})
public class PriceRegionRealEstateStock {

    @XmlElement(required = true)
    protected PriceRegion priceRegion;
    @XmlElement(defaultValue = "0")
    protected int realestateCount;

    /**
     * Gets the value of the priceRegion property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRegion }
     *     
     */
    public PriceRegion getPriceRegion() {
        return priceRegion;
    }

    /**
     * Sets the value of the priceRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRegion }
     *     
     */
    public void setPriceRegion(PriceRegion value) {
        this.priceRegion = value;
    }

    /**
     * Gets the value of the realestateCount property.
     * 
     */
    public int getRealestateCount() {
        return realestateCount;
    }

    /**
     * Sets the value of the realestateCount property.
     * 
     */
    public void setRealestateCount(int value) {
        this.realestateCount = value;
    }

}