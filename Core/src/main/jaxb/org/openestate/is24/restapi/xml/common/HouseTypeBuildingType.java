
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HouseTypeBuildingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HouseTypeBuildingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_INFORMATION"/&gt;
 *     &lt;enumeration value="BLOCKHOUSE"/&gt;
 *     &lt;enumeration value="BUNGALOW"/&gt;
 *     &lt;enumeration value="SEMI_DETACHED_HOUSE"/&gt;
 *     &lt;enumeration value="ONE_FAMILY_HOUSE"/&gt;
 *     &lt;enumeration value="FAMILY_HOUSE_WITH_LODGER_FLAT"/&gt;
 *     &lt;enumeration value="TUDOR_HOUSE"/&gt;
 *     &lt;enumeration value="WOODEN_HOUSE"/&gt;
 *     &lt;enumeration value="COUNTRY_HOUSE"/&gt;
 *     &lt;enumeration value="APARTMENT_BUILDING"/&gt;
 *     &lt;enumeration value="NON_DETACHED_HOUSE"/&gt;
 *     &lt;enumeration value="CITY_VILLA"/&gt;
 *     &lt;enumeration value="VILLA"/&gt;
 *     &lt;enumeration value="SEMI_DETACHED_HOUSE_PAIR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HouseTypeBuildingType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
public enum HouseTypeBuildingType {


    /**
     * keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Blockhaus
     * 
     */
    BLOCKHOUSE,

    /**
     * Bungalow
     * 
     */
    BUNGALOW,

    /**
     * Doppelhaushaelfte
     * 
     */
    SEMI_DETACHED_HOUSE,

    /**
     * Einfamilienhaus
     * 
     */
    ONE_FAMILY_HOUSE,

    /**
     * Haus mit Einlegerwohnung
     * 
     */
    FAMILY_HOUSE_WITH_LODGER_FLAT,

    /**
     * Haus im Tudorstil
     * 
     */
    TUDOR_HOUSE,

    /**
     * Holzhaus
     * 
     */
    WOODEN_HOUSE,

    /**
     * Landhaus
     * 
     */
    COUNTRY_HOUSE,

    /**
     * Appartment Geb\u00e4ude
     * 
     */
    APARTMENT_BUILDING,

    /**
     * Freistehendes Haus
     * 
     */
    NON_DETACHED_HOUSE,

    /**
     * Stadtvilla
     * 
     */
    CITY_VILLA,

    /**
     * Villa
     * 
     */
    VILLA,

    /**
     * Doppelhaus
     * 
     */
    SEMI_DETACHED_HOUSE_PAIR;

    public String value() {
        return name();
    }

    public static HouseTypeBuildingType fromValue(String v) {
        return valueOf(v);
    }

}
