//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.06 at 05:03:00 AM CET 
//


package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GarageQueryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GarageQueryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GARAGE"/>
 *     &lt;enumeration value="STREET_PARKING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GarageQueryType")
@XmlEnum
public enum GarageQueryType {


    /**
     * Garage
     * 
     */
    GARAGE,

    /**
     * Au\u00dfenstellplatz
     * 
     */
    STREET_PARKING;

    public String value() {
        return name();
    }

    public static GarageQueryType fromValue(String v) {
        return valueOf(v);
    }

}
