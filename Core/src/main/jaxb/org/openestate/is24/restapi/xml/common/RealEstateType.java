
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RealEstateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RealEstateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APARTMENT_RENT"/&gt;
 *     &lt;enumeration value="APARTMENT_BUY"/&gt;
 *     &lt;enumeration value="HOUSE_RENT"/&gt;
 *     &lt;enumeration value="HOUSE_BUY"/&gt;
 *     &lt;enumeration value="GARAGE_RENT"/&gt;
 *     &lt;enumeration value="GARAGE_BUY"/&gt;
 *     &lt;enumeration value="LIVING_RENT_SITE"/&gt;
 *     &lt;enumeration value="LIVING_BUY_SITE"/&gt;
 *     &lt;enumeration value="TRADE_SITE"/&gt;
 *     &lt;enumeration value="HOUSE_TYPE"/&gt;
 *     &lt;enumeration value="FLAT_SHARE_ROOM"/&gt;
 *     &lt;enumeration value="SENIOR_CARE"/&gt;
 *     &lt;enumeration value="ASSISTED_LIVING"/&gt;
 *     &lt;enumeration value="OFFICE"/&gt;
 *     &lt;enumeration value="INDUSTRY"/&gt;
 *     &lt;enumeration value="STORE"/&gt;
 *     &lt;enumeration value="GASTRONOMY"/&gt;
 *     &lt;enumeration value="SPECIAL_PURPOSE"/&gt;
 *     &lt;enumeration value="INVESTMENT"/&gt;
 *     &lt;enumeration value="COMPULSORY_AUCTION"/&gt;
 *     &lt;enumeration value="SHORT_TERM_ACCOMMODATION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RealEstateType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
public enum RealEstateType {


    /**
     * Mietwohnung
     * 
     */
    APARTMENT_RENT,

    /**
     * Wohnung zum Kauf
     * 
     */
    APARTMENT_BUY,

    /**
     * Haus zur Miete
     * 
     */
    HOUSE_RENT,

    /**
     * Haus zum Kauf
     * 
     */
    HOUSE_BUY,

    /**
     * Garage zur Miete
     * 
     */
    GARAGE_RENT,

    /**
     * Garage zum Kauf
     * 
     */
    GARAGE_BUY,

    /**
     * Wohngrundst\u00fcck zur Miete
     * 
     */
    LIVING_RENT_SITE,

    /**
     * Wohngrundst\u00fcck zum Kauf
     * 
     */
    LIVING_BUY_SITE,

    /**
     * Gewerbegrundst\u00fcck
     * 
     */
    TRADE_SITE,

    /**
     * Typenhaus
     * 
     */
    HOUSE_TYPE,

    /**
     * WG-Zimmer
     * 
     */
    FLAT_SHARE_ROOM,

    /**
     * Altenpflege
     * 
     */
    SENIOR_CARE,

    /**
     * Seniorenwohnen
     * 
     */
    ASSISTED_LIVING,

    /**
     * B\u00fcro und Praxis
     * 
     */
    OFFICE,

    /**
     * Halle und Produktion
     * 
     */
    INDUSTRY,

    /**
     * Einzelhandel
     * 
     */
    STORE,

    /**
     * Gastronomie und Hotel
     * 
     */
    GASTRONOMY,

    /**
     * Spezialgewerbe
     * 
     */
    SPECIAL_PURPOSE,

    /**
     * Anlageimmobilie
     * 
     */
    INVESTMENT,

    /**
     * Zwangsversteigerung
     * 
     */
    COMPULSORY_AUCTION,

    /**
     * Wohnen auf Zeit (WAZ)
     * 
     */
    SHORT_TERM_ACCOMMODATION;

    public String value() {
        return name();
    }

    public static RealEstateType fromValue(String v) {
        return valueOf(v);
    }

}
