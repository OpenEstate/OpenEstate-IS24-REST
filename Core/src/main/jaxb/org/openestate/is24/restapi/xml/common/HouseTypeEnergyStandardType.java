
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HouseTypeEnergyStandardType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HouseTypeEnergyStandardType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNSPECIFIED"/&gt;
 *     &lt;enumeration value="LOW_ENERGY_40"/&gt;
 *     &lt;enumeration value="LOW_ENERGY_60"/&gt;
 *     &lt;enumeration value="PASSIVE_HOUSE"/&gt;
 *     &lt;enumeration value="ENERGY_EFFICIENT_40"/&gt;
 *     &lt;enumeration value="ENERGY_EFFICIENT_55"/&gt;
 *     &lt;enumeration value="ENERGY_EFFICIENT_70"/&gt;
 *     &lt;enumeration value="LOW_ENERGY_HOUSE"/&gt;
 *     &lt;enumeration value="NULL_ENERGY_HOUSE"/&gt;
 *     &lt;enumeration value="PLUS_ENERGY_HOUSE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HouseTypeEnergyStandardType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
public enum HouseTypeEnergyStandardType {


    /**
     * nicht spezifiziert
     * 
     */
    UNSPECIFIED,

    /**
     * Niedrigenergiehaus KfW 40
     * 
     */
    LOW_ENERGY_40,

    /**
     * Niedriegenergiehaus KfW60
     * 
     */
    LOW_ENERGY_60,

    /**
     * Passivhaus
     * 
     */
    PASSIVE_HOUSE,

    /**
     * KfW-Effizienzhaus 40
     * 
     */
    ENERGY_EFFICIENT_40,

    /**
     * KfW-Effizienzhaus 55
     * 
     */
    ENERGY_EFFICIENT_55,

    /**
     * KfW-Effizienzhaus 70
     * 
     */
    ENERGY_EFFICIENT_70,

    /**
     * Niedrigenergiehaus
     * 
     */
    LOW_ENERGY_HOUSE,

    /**
     * Nullenergiehaus
     * 
     */
    NULL_ENERGY_HOUSE,

    /**
     * Plusenergiehaus
     * 
     */
    PLUS_ENERGY_HOUSE;

    public String value() {
        return name();
    }

    public static HouseTypeEnergyStandardType fromValue(String v) {
        return valueOf(v);
    }

}
