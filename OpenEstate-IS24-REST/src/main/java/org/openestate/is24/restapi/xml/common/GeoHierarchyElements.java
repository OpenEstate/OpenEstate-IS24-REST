//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.03 at 08:04:31 PM CEST 
//


package org.openestate.is24.restapi.xml.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Listenelement f\u00fcr GeoHierarchyElement.
 * 
 * <p>Java class for GeoHierarchyElements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoHierarchyElements">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="geoHierarchyElement" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoHierarchyElement" maxOccurs="30" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoHierarchyElements", propOrder = {
    "geoHierarchyElement"
})
public class GeoHierarchyElements {

    protected List<GeoHierarchyElement> geoHierarchyElement;

    /**
     * Gets the value of the geoHierarchyElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geoHierarchyElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeoHierarchyElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeoHierarchyElement }
     * 
     * 
     */
    public List<GeoHierarchyElement> getGeoHierarchyElement() {
        if (geoHierarchyElement == null) {
            geoHierarchyElement = new ArrayList<GeoHierarchyElement>();
        }
        return this.geoHierarchyElement;
    }

}
