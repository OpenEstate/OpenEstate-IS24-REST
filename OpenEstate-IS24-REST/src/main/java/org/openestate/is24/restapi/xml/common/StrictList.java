//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.24 at 03:30:52 PM CEST 
//


package org.openestate.is24.restapi.xml.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paging" type="{http://rest.immobilienscout24.de/schema/common/1.0}Paging" minOccurs="0"/>
 *         &lt;element name="matchCountList" type="{http://rest.immobilienscout24.de/schema/common/1.0}MatchCountList" minOccurs="0"/>
 *         &lt;element name="strictEntry" type="{http://rest.immobilienscout24.de/schema/common/1.0}StrictEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "paging",
    "matchCountList",
    "strictEntry"
})
@XmlRootElement(name = "strictList")
public class StrictList {

    protected Paging paging;
    protected MatchCountList matchCountList;
    protected List<StrictEntry> strictEntry;

    /**
     * Gets the value of the paging property.
     * 
     * @return
     *     possible object is
     *     {@link Paging }
     *     
     */
    public Paging getPaging() {
        return paging;
    }

    /**
     * Sets the value of the paging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paging }
     *     
     */
    public void setPaging(Paging value) {
        this.paging = value;
    }

    /**
     * Gets the value of the matchCountList property.
     * 
     * @return
     *     possible object is
     *     {@link MatchCountList }
     *     
     */
    public MatchCountList getMatchCountList() {
        return matchCountList;
    }

    /**
     * Sets the value of the matchCountList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchCountList }
     *     
     */
    public void setMatchCountList(MatchCountList value) {
        this.matchCountList = value;
    }

    /**
     * Gets the value of the strictEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strictEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrictEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StrictEntry }
     * 
     * 
     */
    public List<StrictEntry> getStrictEntry() {
        if (strictEntry == null) {
            strictEntry = new ArrayList<StrictEntry>();
        }
        return this.strictEntry;
    }

}
