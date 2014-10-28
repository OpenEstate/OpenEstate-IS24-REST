//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.28 at 06:41:17 PM CET 
//


package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HouseTypeBuildingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HouseTypeBuildingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="BLOCKHOUSE"/>
 *     &lt;enumeration value="BUNGALOW"/>
 *     &lt;enumeration value="SEMI_DETACHED_HOUSE"/>
 *     &lt;enumeration value="ONE_FAMILY_HOUSE"/>
 *     &lt;enumeration value="FAMILY_HOUSE_WITH_LODGER_FLAT"/>
 *     &lt;enumeration value="TUDOR_HOUSE"/>
 *     &lt;enumeration value="WOODEN_HOUSE"/>
 *     &lt;enumeration value="COUNTRY_HOUSE"/>
 *     &lt;enumeration value="APARTMENT_BUILDING"/>
 *     &lt;enumeration value="NON_DETACHED_HOUSE"/>
 *     &lt;enumeration value="CITY_VILLA"/>
 *     &lt;enumeration value="VILLA"/>
 *     &lt;enumeration value="SEMI_DETACHED_HOUSE_PAIR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HouseTypeBuildingType")
@XmlEnum
public enum HouseTypeBuildingType {


    /**
     * keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Blockhaus
     * 
     */
    BLOCKHOUSE,

    /**
     * Bungalow
     * 
     */
    BUNGALOW,

    /**
     * Doppelhaushaelfte
     * 
     */
    SEMI_DETACHED_HOUSE,

    /**
     * Einfamilienhaus
     * 
     */
    ONE_FAMILY_HOUSE,

    /**
     * Haus mit Einlegerwohnung
     * 
     */
    FAMILY_HOUSE_WITH_LODGER_FLAT,

    /**
     * Haus im Tudorstil
     * 
     */
    TUDOR_HOUSE,

    /**
     * Holzhaus
     * 
     */
    WOODEN_HOUSE,

    /**
     * Landhaus
     * 
     */
    COUNTRY_HOUSE,

    /**
     * Appartment Geb\u00e4ude
     * 
     */
    APARTMENT_BUILDING,

    /**
     * Freistehendes Haus
     * 
     */
    NON_DETACHED_HOUSE,

    /**
     * Stadtvilla
     * 
     */
    CITY_VILLA,

    /**
     * Villa
     * 
     */
    VILLA,

    /**
     * Doppelhaus
     * 
     */
    SEMI_DETACHED_HOUSE_PAIR;

    public String value() {
        return name();
    }

    public static HouseTypeBuildingType fromValue(String v) {
        return valueOf(v);
    }

}
