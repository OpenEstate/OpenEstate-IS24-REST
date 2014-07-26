//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.03 at 08:04:31 PM CEST 
//


package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HouseTypeEnergyStandardType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HouseTypeEnergyStandardType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNSPECIFIED"/>
 *     &lt;enumeration value="LOW_ENERGY_40"/>
 *     &lt;enumeration value="LOW_ENERGY_60"/>
 *     &lt;enumeration value="PASSIVE_HOUSE"/>
 *     &lt;enumeration value="ENERGY_EFFICIENT_40"/>
 *     &lt;enumeration value="ENERGY_EFFICIENT_55"/>
 *     &lt;enumeration value="ENERGY_EFFICIENT_70"/>
 *     &lt;enumeration value="LOW_ENERGY_HOUSE"/>
 *     &lt;enumeration value="NULL_ENERGY_HOUSE"/>
 *     &lt;enumeration value="PLUS_ENERGY_HOUSE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HouseTypeEnergyStandardType")
@XmlEnum
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