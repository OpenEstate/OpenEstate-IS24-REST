
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InternetConnectionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InternetConnectionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="DSL"/>
 *     &lt;enumeration value="DSL_FLATRATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InternetConnectionType")
@XmlEnum
public enum InternetConnectionType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * DSL
     * 
     */
    DSL,

    /**
     * DSL Flatrate
     * 
     */
    DSL_FLATRATE;

    public String value() {
        return name();
    }

    public static InternetConnectionType fromValue(String v) {
        return valueOf(v);
    }

}
