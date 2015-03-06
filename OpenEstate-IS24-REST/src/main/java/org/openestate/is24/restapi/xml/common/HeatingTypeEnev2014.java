
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeatingTypeEnev2014.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HeatingTypeEnev2014">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="SELF_CONTAINED_CENTRAL_HEATING"/>
 *     &lt;enumeration value="STOVE_HEATING"/>
 *     &lt;enumeration value="CENTRAL_HEATING"/>
 *     &lt;enumeration value="COMBINED_HEAT_AND_POWER_PLANT"/>
 *     &lt;enumeration value="ELECTRIC_HEATING"/>
 *     &lt;enumeration value="DISTRICT_HEATING"/>
 *     &lt;enumeration value="FLOOR_HEATING"/>
 *     &lt;enumeration value="GAS_HEATING"/>
 *     &lt;enumeration value="WOOD_PELLET_HEATING"/>
 *     &lt;enumeration value="NIGHT_STORAGE_HEATER"/>
 *     &lt;enumeration value="OIL_HEATING"/>
 *     &lt;enumeration value="SOLAR_HEATING"/>
 *     &lt;enumeration value="HEAT_PUMP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HeatingTypeEnev2014")
@XmlEnum
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
