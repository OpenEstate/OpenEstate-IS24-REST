//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.03 at 08:04:31 PM CEST 
//


package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Erm\u00f6glicht die seitenweise Iteration \u00fcber Daten(1-basiert).
 *       
 * 
 * <p>Java class for Paging complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Paging">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="next" type="{http://rest.immobilienscout24.de/schema/common/1.0}ReferenceLink" minOccurs="0"/>
 *         &lt;element name="previous" type="{http://rest.immobilienscout24.de/schema/common/1.0}ReferenceLink" minOccurs="0"/>
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberOfPages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberOfHits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Paging", propOrder = {
    "next",
    "previous",
    "pageNumber",
    "pageSize",
    "numberOfPages",
    "numberOfHits"
})
public class Paging {

    protected ReferenceLink next;
    protected ReferenceLink previous;
    protected Integer pageNumber;
    protected Integer pageSize;
    protected Integer numberOfPages;
    @XmlElement(defaultValue = "0")
    protected int numberOfHits;

    /**
     * Gets the value of the next property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceLink }
     *     
     */
    public ReferenceLink getNext() {
        return next;
    }

    /**
     * Sets the value of the next property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceLink }
     *     
     */
    public void setNext(ReferenceLink value) {
        this.next = value;
    }

    /**
     * Gets the value of the previous property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceLink }
     *     
     */
    public ReferenceLink getPrevious() {
        return previous;
    }

    /**
     * Sets the value of the previous property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceLink }
     *     
     */
    public void setPrevious(ReferenceLink value) {
        this.previous = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the numberOfPages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * Sets the value of the numberOfPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfPages(Integer value) {
        this.numberOfPages = value;
    }

    /**
     * Gets the value of the numberOfHits property.
     * 
     */
    public int getNumberOfHits() {
        return numberOfHits;
    }

    /**
     * Sets the value of the numberOfHits property.
     * 
     */
    public void setNumberOfHits(int value) {
        this.numberOfHits = value;
    }

}