
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingSituationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingSituationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_INFORMATION"/&gt;
 *     &lt;enumeration value="GOOD"/&gt;
 *     &lt;enumeration value="BAD"/&gt;
 *     &lt;enumeration value="RESIDENT_PARKING"/&gt;
 *     &lt;enumeration value="OWN_PARKING_SPACE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingSituationType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
public enum ParkingSituationType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Gut
     * 
     */
    GOOD,

    /**
     * schlecht
     * 
     */
    BAD,

    /**
     * Anwohnerparkplatz verf\u00fcgbar
     * 
     */
    RESIDENT_PARKING,

    /**
     * eigener Parkplatz verf\u00fcgbar
     * 
     */
    OWN_PARKING_SPACE;

    public String value() {
        return name();
    }

    public static ParkingSituationType fromValue(String v) {
        return valueOf(v);
    }

}
