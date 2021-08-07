
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
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
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
