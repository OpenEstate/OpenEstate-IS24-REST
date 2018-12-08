
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmokingAllowedType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SmokingAllowedType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_INFORMATION"/&gt;
 *     &lt;enumeration value="ALLOWED"/&gt;
 *     &lt;enumeration value="UNWANTED"/&gt;
 *     &lt;enumeration value="OWN_ROOM_ONLY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SmokingAllowedType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
public enum SmokingAllowedType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Erlaubt
     * 
     */
    ALLOWED,

    /**
     * Unerw\u00fcnscht
     * 
     */
    UNWANTED,

    /**
     * Nur im eigenem Zimmer
     * 
     */
    OWN_ROOM_ONLY;

    public String value() {
        return name();
    }

    public static SmokingAllowedType fromValue(String v) {
        return valueOf(v);
    }

}
