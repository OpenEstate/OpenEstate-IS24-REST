
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteRecommendedUseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SiteRecommendedUseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="FUTURE_DEVELOPMENT_LAND"/>
 *     &lt;enumeration value="TWINHOUSE"/>
 *     &lt;enumeration value="SINGLE_FAMILY_HOUSE"/>
 *     &lt;enumeration value="GARAGE"/>
 *     &lt;enumeration value="GARDEN"/>
 *     &lt;enumeration value="NO_DEVELOPMENT"/>
 *     &lt;enumeration value="APARTMENT_BUILDING"/>
 *     &lt;enumeration value="ORCHARD"/>
 *     &lt;enumeration value="TERRACE_HOUSE"/>
 *     &lt;enumeration value="PARKING_SPACE"/>
 *     &lt;enumeration value="VILLA"/>
 *     &lt;enumeration value="FORREST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SiteRecommendedUseType")
@XmlEnum
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
