
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FiringType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FiringType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_INFORMATION"/&gt;
 *     &lt;enumeration value="GEOTHERMAL"/&gt;
 *     &lt;enumeration value="SOLAR_HEATING"/&gt;
 *     &lt;enumeration value="PELLET_HEATING"/&gt;
 *     &lt;enumeration value="GAS"/&gt;
 *     &lt;enumeration value="OIL"/&gt;
 *     &lt;enumeration value="DISTRICT_HEATING"/&gt;
 *     &lt;enumeration value="ELECTRICITY"/&gt;
 *     &lt;enumeration value="COAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FiringType")
@XmlEnum
@Deprecated
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
public enum FiringType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Erdw\u00e4rme
     * 
     */
    GEOTHERMAL,

    /**
     * Solarheizung
     * 
     */
    SOLAR_HEATING,

    /**
     * Pelletheizung
     * 
     */
    PELLET_HEATING,

    /**
     * Gas
     * 
     */
    GAS,

    /**
     * \u00d6l
     * 
     */
    OIL,

    /**
     * Fernw\u00e4rme
     * 
     */
    DISTRICT_HEATING,

    /**
     * Strom
     * 
     */
    ELECTRICITY,

    /**
     * Kohle
     * 
     */
    COAL;

    public String value() {
        return name();
    }

    public static FiringType fromValue(String v) {
        return valueOf(v);
    }

}
