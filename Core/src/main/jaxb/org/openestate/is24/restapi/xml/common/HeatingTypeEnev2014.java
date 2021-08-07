
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeatingTypeEnev2014.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HeatingTypeEnev2014"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_INFORMATION"/&gt;
 *     &lt;enumeration value="SELF_CONTAINED_CENTRAL_HEATING"/&gt;
 *     &lt;enumeration value="STOVE_HEATING"/&gt;
 *     &lt;enumeration value="CENTRAL_HEATING"/&gt;
 *     &lt;enumeration value="COMBINED_HEAT_AND_POWER_PLANT"/&gt;
 *     &lt;enumeration value="ELECTRIC_HEATING"/&gt;
 *     &lt;enumeration value="DISTRICT_HEATING"/&gt;
 *     &lt;enumeration value="FLOOR_HEATING"/&gt;
 *     &lt;enumeration value="GAS_HEATING"/&gt;
 *     &lt;enumeration value="WOOD_PELLET_HEATING"/&gt;
 *     &lt;enumeration value="NIGHT_STORAGE_HEATER"/&gt;
 *     &lt;enumeration value="OIL_HEATING"/&gt;
 *     &lt;enumeration value="SOLAR_HEATING"/&gt;
 *     &lt;enumeration value="HEAT_PUMP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HeatingTypeEnev2014")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
public enum HeatingTypeEnev2014 {


    /**
     * keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Etagenheizung
     * 
     */
    SELF_CONTAINED_CENTRAL_HEATING,

    /**
     * Ofenheizung
     * 
     */
    STOVE_HEATING,

    /**
     * Zentralheizung
     * 
     */
    CENTRAL_HEATING,

    /**
     * Blockheizkraftwerk
     * 
     */
    COMBINED_HEAT_AND_POWER_PLANT,

    /**
     * Elektro-Heizung
     * 
     */
    ELECTRIC_HEATING,

    /**
     * Fernw\u00e4rmedampf
     * 
     */
    DISTRICT_HEATING,

    /**
     * Fu\u00dfbodenheizung
     * 
     */
    FLOOR_HEATING,

    /**
     * Gas-Heizung
     * 
     */
    GAS_HEATING,

    /**
     * Holz-Pelletheizung
     * 
     */
    WOOD_PELLET_HEATING,

    /**
     * Nachtspeicherofen
     * 
     */
    NIGHT_STORAGE_HEATER,

    /**
     * \u00d6lheizung
     * 
     */
    OIL_HEATING,

    /**
     * Solar-Heizung
     * 
     */
    SOLAR_HEATING,

    /**
     * W\u00e4rmepumpe
     * 
     */
    HEAT_PUMP;

    public String value() {
        return name();
    }

    public static HeatingTypeEnev2014 fromValue(String v) {
        return valueOf(v);
    }

}
