
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvestmentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SINGLE_FAMILY_HOUSE"/&gt;
 *     &lt;enumeration value="MULTI_FAMILY_HOUSE"/&gt;
 *     &lt;enumeration value="FREEHOLD_FLAT"/&gt;
 *     &lt;enumeration value="SHOPPING_CENTRE"/&gt;
 *     &lt;enumeration value="RESTAURANT"/&gt;
 *     &lt;enumeration value="HOTEL"/&gt;
 *     &lt;enumeration value="LEISURE_FACILITY"/&gt;
 *     &lt;enumeration value="COMMERCIAL_UNIT"/&gt;
 *     &lt;enumeration value="OFFICE_BUILDING"/&gt;
 *     &lt;enumeration value="COMMERCIAL_BUILDING"/&gt;
 *     &lt;enumeration value="COMMERCIAL_PROPERTY"/&gt;
 *     &lt;enumeration value="HALL_STORAGE"/&gt;
 *     &lt;enumeration value="INDUSTRIAL_PROPERTY"/&gt;
 *     &lt;enumeration value="SHOP_SALES_FLOOR"/&gt;
 *     &lt;enumeration value="SERVICE_CENTRE"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *     &lt;enumeration value="SUPERMARKET"/&gt;
 *     &lt;enumeration value="LIVING_BUSINESS_HOUSE"/&gt;
 *     &lt;enumeration value="HOUSING_ESTATE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvestmentType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
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
