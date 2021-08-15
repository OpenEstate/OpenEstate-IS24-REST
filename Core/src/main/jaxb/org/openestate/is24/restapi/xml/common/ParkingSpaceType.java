
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingSpaceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingSpaceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_INFORMATION"/&gt;
 *     &lt;enumeration value="GARAGE"/&gt;
 *     &lt;enumeration value="OUTSIDE"/&gt;
 *     &lt;enumeration value="CARPORT"/&gt;
 *     &lt;enumeration value="DUPLEX"/&gt;
 *     &lt;enumeration value="CAR_PARK"/&gt;
 *     &lt;enumeration value="UNDERGROUND_GARAGE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingSpaceType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
public enum ParkingSpaceType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Garage
     * 
     */
    GARAGE,

    /**
     * Au\u00dfenstellplatz
     * 
     */
    OUTSIDE,

    /**
     * Carport
     * 
     */
    CARPORT,

    /**
     * Duplex
     * 
     */
    DUPLEX,

    /**
     * Parkhaus
     * 
     */
    CAR_PARK,

    /**
     * Tiefgarage
     * 
     */
    UNDERGROUND_GARAGE;

    public String value() {
        return name();
    }

    public static ParkingSpaceType fromValue(String v) {
        return valueOf(v);
    }

}
