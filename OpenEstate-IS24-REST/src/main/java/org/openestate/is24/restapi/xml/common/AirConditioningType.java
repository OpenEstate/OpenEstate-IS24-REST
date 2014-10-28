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
 * <p>Java class for AirConditioningType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AirConditioningType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="YES"/>
 *     &lt;enumeration value="NO"/>
 *     &lt;enumeration value="BY_APPOINTMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AirConditioningType")
@XmlEnum
public enum AirConditioningType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Ja
     * 
     */
    YES,

    /**
     * Nein
     * 
     */
    NO,

    /**
     * Nach Vereinbarung
     * 
     */
    BY_APPOINTMENT;

    public String value() {
        return name();
    }

    public static AirConditioningType fromValue(String v) {
        return valueOf(v);
    }

}
