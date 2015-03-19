
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuildingEnergyRatingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BuildingEnergyRatingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="ENERGY_REQUIRED"/>
 *     &lt;enumeration value="ENERGY_CONSUMPTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BuildingEnergyRatingType")
@XmlEnum
public enum BuildingEnergyRatingType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Endenergiebedarf
     * 
     */
    ENERGY_REQUIRED,

    /**
     * Energieverbrauchskennwert
     * 
     */
    ENERGY_CONSUMPTION;

    public String value() {
        return name();
    }

    public static BuildingEnergyRatingType fromValue(String v) {
        return valueOf(v);
    }

}
