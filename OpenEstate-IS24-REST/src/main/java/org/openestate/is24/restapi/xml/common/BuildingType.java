
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuildingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BuildingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="SINGLE_FAMILY_HOUSE"/>
 *     &lt;enumeration value="MID_TERRACE_HOUSE"/>
 *     &lt;enumeration value="END_TERRACE_HOUSE"/>
 *     &lt;enumeration value="MULTI_FAMILY_HOUSE"/>
 *     &lt;enumeration value="BUNGALOW"/>
 *     &lt;enumeration value="FARMHOUSE"/>
 *     &lt;enumeration value="SEMIDETACHED_HOUSE"/>
 *     &lt;enumeration value="VILLA"/>
 *     &lt;enumeration value="CASTLE_MANOR_HOUSE"/>
 *     &lt;enumeration value="SPECIAL_REAL_ESTATE"/>
 *     &lt;enumeration value="TERRACE_HOUSE"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BuildingType")
@XmlEnum
public enum BuildingType {


    /**
     * Keine Angabe (wird zusammen mit OTHER verwendet)
     *           
     * 
     */
    @Deprecated
    NO_INFORMATION,

    /**
     * Einfamilienhaus (freistehend)
     * 
     */
    SINGLE_FAMILY_HOUSE,

    /**
     * Reihenmittelhaus
     * 
     */
    MID_TERRACE_HOUSE,

    /**
     * Reiheneckhaus
     * 
     */
    END_TERRACE_HOUSE,

    /**
     * Mehrfamilienhaus
     * 
     */
    MULTI_FAMILY_HOUSE,

    /**
     * Bungalow
     * 
     */
    BUNGALOW,

    /**
     * Bauernhaus
     * 
     */
    FARMHOUSE,

    /**
     * Doppelhaush\u00e4lfte
     * 
     */
    SEMIDETACHED_HOUSE,

    /**
     * Villa
     * 
     */
    VILLA,

    /**
     * Burg/Schloss
     * 
     */
    CASTLE_MANOR_HOUSE,

    /**
     * Besondere Immobilie
     * 
     */
    SPECIAL_REAL_ESTATE,

    /**
     * Reihenhaus
     * 
     */
    TERRACE_HOUSE,

    /**
     * Wohnimmobilie (sonstige)
     * 
     */
    OTHER;

    public String value() {
        return name();
    }

    public static BuildingType fromValue(String v) {
        return valueOf(v);
    }

}
