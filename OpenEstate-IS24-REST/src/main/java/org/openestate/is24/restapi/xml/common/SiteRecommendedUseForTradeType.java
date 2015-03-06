
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteRecommendedUseForTradeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SiteRecommendedUseForTradeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="FARMLAND"/>
 *     &lt;enumeration value="FUTURE_DEVELOPMENT_LAND"/>
 *     &lt;enumeration value="MOORAGE"/>
 *     &lt;enumeration value="OFFICE"/>
 *     &lt;enumeration value="CAMPING"/>
 *     &lt;enumeration value="BIG_STORE"/>
 *     &lt;enumeration value="LITTLE_STORE"/>
 *     &lt;enumeration value="GARAGE"/>
 *     &lt;enumeration value="GARDEN"/>
 *     &lt;enumeration value="GASTRONOMY"/>
 *     &lt;enumeration value="BUSINESS"/>
 *     &lt;enumeration value="HOTEL"/>
 *     &lt;enumeration value="INDUSTRY"/>
 *     &lt;enumeration value="NO_DEVELOPMENT"/>
 *     &lt;enumeration value="SMALL_BUSINESS"/>
 *     &lt;enumeration value="STOCK"/>
 *     &lt;enumeration value="ORCHARD"/>
 *     &lt;enumeration value="CAR_PARK"/>
 *     &lt;enumeration value="PRODUCTION"/>
 *     &lt;enumeration value="PARKING_SPACE"/>
 *     &lt;enumeration value="FORREST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SiteRecommendedUseForTradeType")
@XmlEnum
public enum SiteRecommendedUseForTradeType {


    /**
     * keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Ackerland
     * 
     */
    FARMLAND,

    /**
     * Bauerwartungsland
     * 
     */
    FUTURE_DEVELOPMENT_LAND,

    /**
     * Bootsstand
     * 
     */
    MOORAGE,

    /**
     * B\u00fcro
     * 
     */
    OFFICE,

    /**
     * Camping
     * 
     */
    CAMPING,

    /**
     * Einzelhandel - gro\u00df
     * 
     */
    BIG_STORE,

    /**
     * Einzelhandel - klein
     * 
     */
    LITTLE_STORE,

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
     * Gastronomie
     * 
     */
    GASTRONOMY,

    /**
     * Gewerbe
     * 
     */
    BUSINESS,

    /**
     * Hotel
     * 
     */
    HOTEL,

    /**
     * Industrie
     * 
     */
    INDUSTRY,

    /**
     * Keine Bebauung
     * 
     */
    NO_DEVELOPMENT,

    /**
     * Kleingewerbe
     * 
     */
    SMALL_BUSINESS,

    /**
     * Lager
     * 
     */
    STOCK,

    /**
     * Obstpflanzung
     * 
     */
    ORCHARD,

    /**
     * Parkhaus
     * 
     */
    CAR_PARK,

    /**
     * Produktion
     * 
     */
    PRODUCTION,

    /**
     * Stellpl\u00e4tze
     * 
     */
    PARKING_SPACE,

    /**
     * Wald
     * 
     */
    FORREST;

    public String value() {
        return name();
    }

    public static SiteRecommendedUseForTradeType fromValue(String v) {
        return valueOf(v);
    }

}
