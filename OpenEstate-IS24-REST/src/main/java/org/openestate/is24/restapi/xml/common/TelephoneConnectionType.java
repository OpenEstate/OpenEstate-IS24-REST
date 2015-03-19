
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelephoneConnectionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TelephoneConnectionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="ANALOG"/>
 *     &lt;enumeration value="ISDN"/>
 *     &lt;enumeration value="NOT_AVAILABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TelephoneConnectionType")
@XmlEnum
public enum TelephoneConnectionType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Analog
     * 
     */
    ANALOG,

    /**
     * ISDN
     * 
     */
    ISDN,

    /**
     * nicht verf\u00fcgbar
     * 
     */
    NOT_AVAILABLE;

    public String value() {
        return name();
    }

    public static TelephoneConnectionType fromValue(String v) {
        return valueOf(v);
    }

}
