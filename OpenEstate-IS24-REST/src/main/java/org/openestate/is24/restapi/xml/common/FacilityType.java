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
 * <p>Java class for FacilityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FacilityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASSISTED_LIVING"/>
 *     &lt;enumeration value="RESIDENCE"/>
 *     &lt;enumeration value="SENIOR_PARK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FacilityType")
@XmlEnum
public enum FacilityType {


    /**
     * Seniorenwohnen
     * 
     */
    ASSISTED_LIVING,

    /**
     * Residenz
     * 
     */
    RESIDENCE,

    /**
     * Seniorenwohnpark
     * 
     */
    SENIOR_PARK;

    public String value() {
        return name();
    }

    public static FacilityType fromValue(String v) {
        return valueOf(v);
    }

}
