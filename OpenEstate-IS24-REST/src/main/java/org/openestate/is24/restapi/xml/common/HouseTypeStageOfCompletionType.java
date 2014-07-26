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
 * <p>Java class for HouseTypeStageOfCompletionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HouseTypeStageOfCompletionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNSPECIFIED"/>
 *     &lt;enumeration value="CONSTRUCTIONKIT"/>
 *     &lt;enumeration value="UPGRADING"/>
 *     &lt;enumeration value="TURNKEYWITHCELLAR"/>
 *     &lt;enumeration value="TURNKEYWITHOUTFLOORSLAP"/>
 *     &lt;enumeration value="TURNKEYWITHFLOORSLAP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HouseTypeStageOfCompletionType")
@XmlEnum
public enum HouseTypeStageOfCompletionType {


    /**
     * nicht spezifiziert
     * 
     */
    UNSPECIFIED,

    /**
     * Bausatzhaus
     * 
     */
    CONSTRUCTIONKIT,

    /**
     * Ausbauhaus
     * 
     */
    UPGRADING,

    /**
     * Schl\u00fcsselfertig mit Keller
     * 
     */
    TURNKEYWITHCELLAR,

    /**
     * Schl\u00fcsselfertig ohne Bodenplatte
     * 
     */
    TURNKEYWITHOUTFLOORSLAP,

    /**
     * Schl\u00fcsselfertig mit Bodenplatte
     * 
     */
    TURNKEYWITHFLOORSLAP;

    public String value() {
        return name();
    }

    public static HouseTypeStageOfCompletionType fromValue(String v) {
        return valueOf(v);
    }

}