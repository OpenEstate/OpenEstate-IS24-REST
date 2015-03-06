
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvestmentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SINGLE_FAMILY_HOUSE"/>
 *     &lt;enumeration value="MULTI_FAMILY_HOUSE"/>
 *     &lt;enumeration value="FREEHOLD_FLAT"/>
 *     &lt;enumeration value="SHOPPING_CENTRE"/>
 *     &lt;enumeration value="RESTAURANT"/>
 *     &lt;enumeration value="HOTEL"/>
 *     &lt;enumeration value="LEISURE_FACILITY"/>
 *     &lt;enumeration value="COMMERCIAL_UNIT"/>
 *     &lt;enumeration value="OFFICE_BUILDING"/>
 *     &lt;enumeration value="COMMERCIAL_BUILDING"/>
 *     &lt;enumeration value="COMMERCIAL_PROPERTY"/>
 *     &lt;enumeration value="HALL_STORAGE"/>
 *     &lt;enumeration value="INDUSTRIAL_PROPERTY"/>
 *     &lt;enumeration value="SHOP_SALES_FLOOR"/>
 *     &lt;enumeration value="SERVICE_CENTRE"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="SUPERMARKET"/>
 *     &lt;enumeration value="LIVING_BUSINESS_HOUSE"/>
 *     &lt;enumeration value="HOUSING_ESTATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InvestmentType")
@XmlEnum
public enum InvestmentType {


    /**
     * Einfamilienhaus
     * 
     */
    SINGLE_FAMILY_HOUSE,

    /**
     * Mehrfamilienhaus
     * 
     */
    MULTI_FAMILY_HOUSE,

    /**
     * Eigentumswohnung
     * 
     */
    FREEHOLD_FLAT,

    /**
     * Einkaufszentrum
     * 
     */
    SHOPPING_CENTRE,

    /**
     * Gastst\u00e4tte
     * 
     */
    RESTAURANT,

    /**
     * Hotel
     * 
     */
    HOTEL,

    /**
     * Freizeitanlage
     * 
     */
    LEISURE_FACILITY,

    /**
     * Gewerbeeinheit
     * 
     */
    COMMERCIAL_UNIT,

    /**
     * B\u00fcrogeb\u00e4ude
     * 
     */
    OFFICE_BUILDING,

    /**
     * Gesch\u00e4ftshaus
     * 
     */
    COMMERCIAL_BUILDING,

    /**
     * Gewerbeanwesen
     * 
     */
    COMMERCIAL_PROPERTY,

    /**
     * Halle/Lager
     * 
     */
    HALL_STORAGE,

    /**
     * Industrieanwesen
     * 
     */
    INDUSTRIAL_PROPERTY,

    /**
     * Laden/Verkaufsfl\u00e4che
     * 
     */
    SHOP_SALES_FLOOR,

    /**
     * Servicecenter
     * 
     */
    SERVICE_CENTRE,

    /**
     * Sonstige
     * 
     */
    OTHER,

    /**
     * Supermarkt
     * 
     */
    SUPERMARKET,

    /**
     * Wohn-/ Gesch\u00e4ftshaus
     * 
     */
    LIVING_BUSINESS_HOUSE,

    /**
     * Wohnanlage
     * 
     */
    HOUSING_ESTATE;

    public String value() {
        return name();
    }

    public static InvestmentType fromValue(String v) {
        return valueOf(v);
    }

}
