
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuildingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BuildingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_INFORMATION"/&gt;
 *     &lt;enumeration value="SINGLE_FAMILY_HOUSE"/&gt;
 *     &lt;enumeration value="MID_TERRACE_HOUSE"/&gt;
 *     &lt;enumeration value="END_TERRACE_HOUSE"/&gt;
 *     &lt;enumeration value="MULTI_FAMILY_HOUSE"/&gt;
 *     &lt;enumeration value="BUNGALOW"/&gt;
 *     &lt;enumeration value="FARMHOUSE"/&gt;
 *     &lt;enumeration value="SEMIDETACHED_HOUSE"/&gt;
 *     &lt;enumeration value="VILLA"/&gt;
 *     &lt;enumeration value="CASTLE_MANOR_HOUSE"/&gt;
 *     &lt;enumeration value="SPECIAL_REAL_ESTATE"/&gt;
 *     &lt;enumeration value="TERRACE_HOUSE"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BuildingType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
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
