
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnergySourceEnev2014.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnergySourceEnev2014"&gt;
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
 *     &lt;enumeration value="ACID_GAS"/&gt;
 *     &lt;enumeration value="SOUR_GAS"/&gt;
 *     &lt;enumeration value="LIQUID_GAS"/&gt;
 *     &lt;enumeration value="STEAM_DISTRICT_HEATING"/&gt;
 *     &lt;enumeration value="WOOD"/&gt;
 *     &lt;enumeration value="WOOD_CHIPS"/&gt;
 *     &lt;enumeration value="COAL_COKE"/&gt;
 *     &lt;enumeration value="LOCAL_HEATING"/&gt;
 *     &lt;enumeration value="HEAT_SUPPLY"/&gt;
 *     &lt;enumeration value="BIO_ENERGY"/&gt;
 *     &lt;enumeration value="WIND_ENERGY"/&gt;
 *     &lt;enumeration value="HYDRO_ENERGY"/&gt;
 *     &lt;enumeration value="ENVIRONMENTAL_THERMAL_ENERGY"/&gt;
 *     &lt;enumeration value="COMBINED_HEAT_AND_POWER_FOSSIL_FUELS"/&gt;
 *     &lt;enumeration value="COMBINED_HEAT_AND_POWER_RENEWABLE_ENERGY"/&gt;
 *     &lt;enumeration value="COMBINED_HEAT_AND_POWER_REGENERATIVE_ENERGY"/&gt;
 *     &lt;enumeration value="COMBINED_HEAT_AND_POWER_BIO_ENERGY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnergySourceEnev2014")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
public enum EnergySourceEnev2014 {


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
    COAL,

    /**
     * Erdgas leicht
     * 
     */
    ACID_GAS,

    /**
     * Erdgas schwer
     * 
     */
    SOUR_GAS,

    /**
     * Fl\u00fcssiggas
     * 
     */
    LIQUID_GAS,

    /**
     * Fernw\u00e4rme Dampf
     * 
     */
    STEAM_DISTRICT_HEATING,

    /**
     * Holz
     * 
     */
    WOOD,

    /**
     * Holz-Hackschnitzel
     * 
     */
    WOOD_CHIPS,

    /**
     * Kohle/Koks
     * 
     */
    COAL_COKE,

    /**
     * Nahw\u00e4rme
     * 
     */
    LOCAL_HEATING,

    /**
     * W\u00e4rmelieferung
     * 
     */
    HEAT_SUPPLY,

    /**
     * BIO Energie
     * 
     */
    BIO_ENERGY,

    /**
     * Windenergie
     * 
     */
    WIND_ENERGY,

    /**
     * Wasserenergie
     * 
     */
    HYDRO_ENERGY,

    /**
     * Umweltw\u00e4rme
     * 
     */
    ENVIRONMENTAL_THERMAL_ENERGY,

    /**
     * KWK fossil
     * 
     */
    COMBINED_HEAT_AND_POWER_FOSSIL_FUELS,

    /**
     * KWK erneuerbar
     * 
     */
    COMBINED_HEAT_AND_POWER_RENEWABLE_ENERGY,

    /**
     * KWK regenerativ
     * 
     */
    COMBINED_HEAT_AND_POWER_REGENERATIVE_ENERGY,

    /**
     * KWK bio
     * 
     */
    COMBINED_HEAT_AND_POWER_BIO_ENERGY;

    public String value() {
        return name();
    }

    public static EnergySourceEnev2014 fromValue(String v) {
        return valueOf(v);
    }

}
