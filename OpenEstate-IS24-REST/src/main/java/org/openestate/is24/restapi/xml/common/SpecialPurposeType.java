//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.03 at 08:04:31 PM CEST 
//


package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialPurposeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpecialPurposeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RESIDENCE"/>
 *     &lt;enumeration value="FARM"/>
 *     &lt;enumeration value="HORSE_FARM"/>
 *     &lt;enumeration value="VINEYARD"/>
 *     &lt;enumeration value="REPAIR_SHOP"/>
 *     &lt;enumeration value="LEISURE_FACILITY"/>
 *     &lt;enumeration value="INDUSTRIAL_AREA"/>
 *     &lt;enumeration value="SPECIAL_ESTATE"/>
 *     &lt;enumeration value="COMMERCIAL_CENTRE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpecialPurposeType")
@XmlEnum
public enum SpecialPurposeType {


    /**
     * Anwesen
     * 
     */
    RESIDENCE,

    /**
     * Bauernhof
     * 
     */
    FARM,

    /**
     * Reiterhof
     * 
     */
    HORSE_FARM,

    /**
     * Weingut
     * 
     */
    VINEYARD,

    /**
     * Werkstatt
     * 
     */
    REPAIR_SHOP,

    /**
     * Freizeitanlage
     * 
     */
    LEISURE_FACILITY,

    /**
     * Gewerbefl\u00e4che
     * 
     */
    INDUSTRIAL_AREA,

    /**
     * Spezialobjekt
     * 
     */
    SPECIAL_ESTATE,

    /**
     * Gewerbepark
     * 
     */
    COMMERCIAL_CENTRE;

    public String value() {
        return name();
    }

    public static SpecialPurposeType fromValue(String v) {
        return valueOf(v);
    }

}
