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
 * <p>Java class for CareType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CareType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STATIONARY_CARE"/>
 *     &lt;enumeration value="DAY_CARE"/>
 *     &lt;enumeration value="SHORT_TERM_CARE"/>
 *     &lt;enumeration value="RESPITE_CARE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CareType")
@XmlEnum
public enum CareType {


    /**
     * Vollstation\u00e4re Pflege
     *           
     * 
     */
    STATIONARY_CARE,

    /**
     * Tagespflege
     *           
     * 
     */
    DAY_CARE,

    /**
     * Kurzzeitpflege
     *           
     * 
     */
    SHORT_TERM_CARE,

    /**
     * Verhinderungspflege
     *           
     * 
     */
    RESPITE_CARE;

    public String value() {
        return name();
    }

    public static CareType fromValue(String v) {
        return valueOf(v);
    }

}
