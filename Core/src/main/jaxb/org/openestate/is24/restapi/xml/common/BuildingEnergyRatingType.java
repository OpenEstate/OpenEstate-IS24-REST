
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuildingEnergyRatingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BuildingEnergyRatingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_INFORMATION"/&gt;
 *     &lt;enumeration value="ENERGY_REQUIRED"/&gt;
 *     &lt;enumeration value="ENERGY_CONSUMPTION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BuildingEnergyRatingType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
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
