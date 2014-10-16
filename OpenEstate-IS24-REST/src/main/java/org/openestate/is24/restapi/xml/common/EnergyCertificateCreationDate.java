//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.16 at 06:31:37 PM CEST 
//


package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnergyCertificateCreationDate.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnergyCertificateCreationDate">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_APPLICABLE"/>
 *     &lt;enumeration value="BEFORE_01_MAY_2014"/>
 *     &lt;enumeration value="FROM_01_MAY_2014"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnergyCertificateCreationDate")
@XmlEnum
public enum EnergyCertificateCreationDate {


    /**
     * keine Angabe
     * 
     */
    NOT_APPLICABLE,

    /**
     * Ausgestellt vor dem 01.05.2014
     * 
     */
    BEFORE_01_MAY_2014,

    /**
     * Ausgestellt ab dem 01.05.2014
     * 
     */
    FROM_01_MAY_2014;

    public String value() {
        return name();
    }

    public static EnergyCertificateCreationDate fromValue(String v) {
        return valueOf(v);
    }

}
