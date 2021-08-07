
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelephoneConnectionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TelephoneConnectionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_INFORMATION"/&gt;
 *     &lt;enumeration value="ANALOG"/&gt;
 *     &lt;enumeration value="ISDN"/&gt;
 *     &lt;enumeration value="NOT_AVAILABLE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TelephoneConnectionType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
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
