//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.03 at 08:04:31 PM CEST 
//


package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Ein Preis der f\u00fcr Budgets benutzt wird
 * 
 * <p>Java class for BudgetPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BudgetPrice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}Price">
 *       &lt;sequence>
 *         &lt;element name="rentScope" type="{http://rest.immobilienscout24.de/schema/common/1.0}RentScopeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetPrice", propOrder = {
    "rentScope"
})
public class BudgetPrice
    extends Price
{

    protected RentScopeType rentScope;

    /**
     * Gets the value of the rentScope property.
     * 
     * @return
     *     possible object is
     *     {@link RentScopeType }
     *     
     */
    public RentScopeType getRentScope() {
        return rentScope;
    }

    /**
     * Sets the value of the rentScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link RentScopeType }
     *     
     */
    public void setRentScope(RentScopeType value) {
        this.rentScope = value;
    }

}
