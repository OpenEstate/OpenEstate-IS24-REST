//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.24 at 03:30:52 PM CEST 
//


package org.openestate.is24.restapi.xml.offerlistelement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.openestate.is24.restapi.xml.common.CourtageInfo;
import org.openestate.is24.restapi.xml.common.HouseTypeConstructionMethodType;
import org.openestate.is24.restapi.xml.common.Price;


/**
 * Elemente f\u00fcr alle Typenh\u00e4user, wie z.B. Bungalows, Villen oder
 *         Mehrfamilienh\u00e4user
 * 
 * <p>Java class for OfferHouseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferHouseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/listelement/1.0}OfferRealEstateForList">
 *       &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}BaseHouseTypeGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferHouseType", propOrder = {
    "price",
    "livingSpace",
    "totalArea",
    "baseArea",
    "numberOfRooms",
    "courtage",
    "constructionMethod"
})
public class OfferHouseType
    extends OfferRealEstateForList
{

    @XmlElement(required = true)
    protected Price price;
    protected double livingSpace;
    protected Double totalArea;
    protected Double baseArea;
    protected Double numberOfRooms;
    protected CourtageInfo courtage;
    protected HouseTypeConstructionMethodType constructionMethod;

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setPrice(Price value) {
        this.price = value;
    }

    /**
     * Gets the value of the livingSpace property.
     * 
     */
    public double getLivingSpace() {
        return livingSpace;
    }

    /**
     * Sets the value of the livingSpace property.
     * 
     */
    public void setLivingSpace(double value) {
        this.livingSpace = value;
    }

    /**
     * Gets the value of the totalArea property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalArea() {
        return totalArea;
    }

    /**
     * Sets the value of the totalArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalArea(Double value) {
        this.totalArea = value;
    }

    /**
     * Gets the value of the baseArea property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseArea() {
        return baseArea;
    }

    /**
     * Sets the value of the baseArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseArea(Double value) {
        this.baseArea = value;
    }

    /**
     * Gets the value of the numberOfRooms property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumberOfRooms() {
        return numberOfRooms;
    }

    /**
     * Sets the value of the numberOfRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumberOfRooms(Double value) {
        this.numberOfRooms = value;
    }

    /**
     * Gets the value of the courtage property.
     * 
     * @return
     *     possible object is
     *     {@link CourtageInfo }
     *     
     */
    public CourtageInfo getCourtage() {
        return courtage;
    }

    /**
     * Sets the value of the courtage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourtageInfo }
     *     
     */
    public void setCourtage(CourtageInfo value) {
        this.courtage = value;
    }

    /**
     * Gets the value of the constructionMethod property.
     * 
     * @return
     *     possible object is
     *     {@link HouseTypeConstructionMethodType }
     *     
     */
    public HouseTypeConstructionMethodType getConstructionMethod() {
        return constructionMethod;
    }

    /**
     * Sets the value of the constructionMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseTypeConstructionMethodType }
     *     
     */
    public void setConstructionMethod(HouseTypeConstructionMethodType value) {
        this.constructionMethod = value;
    }

}
