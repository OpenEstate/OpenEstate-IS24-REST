
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteRecommendedUseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SiteRecommendedUseType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_INFORMATION"/&gt;
 *     &lt;enumeration value="FUTURE_DEVELOPMENT_LAND"/&gt;
 *     &lt;enumeration value="TWINHOUSE"/&gt;
 *     &lt;enumeration value="SINGLE_FAMILY_HOUSE"/&gt;
 *     &lt;enumeration value="GARAGE"/&gt;
 *     &lt;enumeration value="GARDEN"/&gt;
 *     &lt;enumeration value="NO_DEVELOPMENT"/&gt;
 *     &lt;enumeration value="APARTMENT_BUILDING"/&gt;
 *     &lt;enumeration value="ORCHARD"/&gt;
 *     &lt;enumeration value="TERRACE_HOUSE"/&gt;
 *     &lt;enumeration value="PARKING_SPACE"/&gt;
 *     &lt;enumeration value="VILLA"/&gt;
 *     &lt;enumeration value="FORREST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SiteRecommendedUseType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
public enum SiteRecommendedUseType {


    /**
     * keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Bauerwartungsland
     * 
     */
    FUTURE_DEVELOPMENT_LAND,

    /**
     * Doppelhaush\u00e4lfte
     * 
     */
    TWINHOUSE,

    /**
     * Einfamilienhaus
     * 
     */
    SINGLE_FAMILY_HOUSE,

    /**
     * Garage
     * 
     */
    GARAGE,

    /**
     * Garten
     * 
     */
    GARDEN,

    /**
     * Keine Bebauung
     * 
     */
    NO_DEVELOPMENT,

    /**
     * Mehrfamilienhaus
     * 
     */
    APARTMENT_BUILDING,

    /**
     * Obstpflanzung
     * 
     */
    ORCHARD,

    /**
     * Reihenhaus
     * 
     */
    TERRACE_HOUSE,

    /**
     * Stellpl\u00e4tze
     * 
     */
    PARKING_SPACE,

    /**
     * Villa
     * 
     */
    VILLA,

    /**
     * Wald
     * 
     */
    FORREST;

    public String value() {
        return name();
    }

    public static SiteRecommendedUseType fromValue(String v) {
        return valueOf(v);
    }

}
