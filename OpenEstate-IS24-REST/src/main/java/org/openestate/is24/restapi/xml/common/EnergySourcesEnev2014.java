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
 * wesentliche Energietr\u00e4ger
 * 
 * <p>Java class for EnergySourcesEnev2014 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnergySourcesEnev2014">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="energySourceEnev2014" type="{http://rest.immobilienscout24.de/schema/common/1.0}EnergySourceEnev2014" maxOccurs="20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergySourcesEnev2014", propOrder = {
    "energySourceEnev2014"
})
public class EnergySourcesEnev2014 {

    protected List<EnergySourceEnev2014> energySourceEnev2014;

    /**
     * Gets the value of the energySourceEnev2014 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the energySourceEnev2014 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnergySourceEnev2014().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnergySourceEnev2014 }
     * 
     * 
     */
    public List<EnergySourceEnev2014> getEnergySourceEnev2014() {
        if (energySourceEnev2014 == null) {
            energySourceEnev2014 = new ArrayList<EnergySourceEnev2014>();
        }
        return this.energySourceEnev2014;
    }

}