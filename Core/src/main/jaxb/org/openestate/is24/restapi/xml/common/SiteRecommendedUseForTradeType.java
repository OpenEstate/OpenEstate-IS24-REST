
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteRecommendedUseForTradeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SiteRecommendedUseForTradeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_INFORMATION"/&gt;
 *     &lt;enumeration value="FARMLAND"/&gt;
 *     &lt;enumeration value="FUTURE_DEVELOPMENT_LAND"/&gt;
 *     &lt;enumeration value="MOORAGE"/&gt;
 *     &lt;enumeration value="OFFICE"/&gt;
 *     &lt;enumeration value="CAMPING"/&gt;
 *     &lt;enumeration value="BIG_STORE"/&gt;
 *     &lt;enumeration value="LITTLE_STORE"/&gt;
 *     &lt;enumeration value="GARAGE"/&gt;
 *     &lt;enumeration value="GARDEN"/&gt;
 *     &lt;enumeration value="GASTRONOMY"/&gt;
 *     &lt;enumeration value="BUSINESS"/&gt;
 *     &lt;enumeration value="HOTEL"/&gt;
 *     &lt;enumeration value="INDUSTRY"/&gt;
 *     &lt;enumeration value="NO_DEVELOPMENT"/&gt;
 *     &lt;enumeration value="SMALL_BUSINESS"/&gt;
 *     &lt;enumeration value="STOCK"/&gt;
 *     &lt;enumeration value="ORCHARD"/&gt;
 *     &lt;enumeration value="CAR_PARK"/&gt;
 *     &lt;enumeration value="PRODUCTION"/&gt;
 *     &lt;enumeration value="PARKING_SPACE"/&gt;
 *     &lt;enumeration value="FORREST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SiteRecommendedUseForTradeType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
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
