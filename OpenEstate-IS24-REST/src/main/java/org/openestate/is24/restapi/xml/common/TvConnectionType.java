
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TvConnectionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TvConnectionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_INFORMATION"/&gt;
 *     &lt;enumeration value="CABLE"/&gt;
 *     &lt;enumeration value="SATELLITE"/&gt;
 *     &lt;enumeration value="CABLE_AND_SATELLITE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TvConnectionType")
@XmlEnum
public enum TvConnectionType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Kabel
     * 
     */
    CABLE,

    /**
     * Satellit
     * 
     */
    SATELLITE,

    /**
     * Kabel und Satellit
     * 
     */
    CABLE_AND_SATELLITE;

    public String value() {
        return name();
    }

    public static TvConnectionType fromValue(String v) {
        return valueOf(v);
    }

}
