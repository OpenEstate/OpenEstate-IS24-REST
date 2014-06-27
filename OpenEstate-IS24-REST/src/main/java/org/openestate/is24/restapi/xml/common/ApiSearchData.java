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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Enth\u00e4lt die Informationen f\u00fcr die API Suche einer Immobilie.
 *       
 * 
 * <p>Java class for ApiSearchData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApiSearchData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchField1" type="{http://rest.immobilienscout24.de/schema/common/1.0}searchField" minOccurs="0"/>
 *         &lt;element name="searchField2" type="{http://rest.immobilienscout24.de/schema/common/1.0}searchField" minOccurs="0"/>
 *         &lt;element name="searchField3" type="{http://rest.immobilienscout24.de/schema/common/1.0}searchField" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApiSearchData", propOrder = {
    "searchField1",
    "searchField2",
    "searchField3"
})
public class ApiSearchData {

    @XmlJavaTypeAdapter(Adapter10 .class)
    protected String searchField1;
    @XmlJavaTypeAdapter(Adapter10 .class)
    protected String searchField2;
    @XmlJavaTypeAdapter(Adapter10 .class)
    protected String searchField3;

    /**
     * Gets the value of the searchField1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchField1() {
        return searchField1;
    }

    /**
     * Sets the value of the searchField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchField1(String value) {
        this.searchField1 = value;
    }

    /**
     * Gets the value of the searchField2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchField2() {
        return searchField2;
    }

    /**
     * Sets the value of the searchField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchField2(String value) {
        this.searchField2 = value;
    }

    /**
     * Gets the value of the searchField3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchField3() {
        return searchField3;
    }

    /**
     * Sets the value of the searchField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchField3(String value) {
        this.searchField3 = value;
    }

}
