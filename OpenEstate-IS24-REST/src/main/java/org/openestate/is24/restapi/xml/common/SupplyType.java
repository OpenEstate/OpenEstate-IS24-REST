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
 * <p>Java class for SupplyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SupplyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="DIRECT_APPROACH"/>
 *     &lt;enumeration value="NO_DIRECT_APPROACH"/>
 *     &lt;enumeration value="CAR_APPROACH"/>
 *     &lt;enumeration value="APPROACH_TO_THE_FRONT"/>
 *     &lt;enumeration value="APPROACH_TO_THE_BACK"/>
 *     &lt;enumeration value="FULL_TIME"/>
 *     &lt;enumeration value="FORENOON"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SupplyType")
@XmlEnum
public enum SupplyType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Direkter Zugang
     * 
     */
    DIRECT_APPROACH,

    /**
     * Keine direkte Anfahrt
     * 
     */
    NO_DIRECT_APPROACH,

    /**
     * PKW-Zufahrt
     * 
     */
    CAR_APPROACH,

    /**
     * Anfahrt von vorne
     * 
     */
    APPROACH_TO_THE_FRONT,

    /**
     * Anfahrt von hinten
     * 
     */
    APPROACH_TO_THE_BACK,

    /**
     * Ganzt\u00e4gig
     * 
     */
    FULL_TIME,

    /**
     * Vormittags
     * 
     */
    FORENOON;

    public String value() {
        return name();
    }

    public static SupplyType fromValue(String v) {
        return valueOf(v);
    }

}