
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfficeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OfficeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LOFT"/>
 *     &lt;enumeration value="STUDIO"/>
 *     &lt;enumeration value="OFFICE"/>
 *     &lt;enumeration value="OFFICE_FLOOR"/>
 *     &lt;enumeration value="OFFICE_BUILDING"/>
 *     &lt;enumeration value="OFFICE_CENTRE"/>
 *     &lt;enumeration value="OFFICE_STORAGE_BUILDING"/>
 *     &lt;enumeration value="SURGERY"/>
 *     &lt;enumeration value="SURGERY_FLOOR"/>
 *     &lt;enumeration value="SURGERY_BUILDING"/>
 *     &lt;enumeration value="COMMERCIAL_CENTRE"/>
 *     &lt;enumeration value="LIVING_AND_COMMERCIAL_BUILDING"/>
 *     &lt;enumeration value="OFFICE_AND_COMMERCIAL_BUILDING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OfficeType")
@XmlEnum
public enum OfficeType {


    /**
     * Loft
     * 
     */
    LOFT,

    /**
     * Atelier
     * 
     */
    STUDIO,

    /**
     * B\u00fcro
     * 
     */
    OFFICE,

    /**
     * B\u00fcroetage
     * 
     */
    OFFICE_FLOOR,

    /**
     * B\u00fcrohaus
     * 
     */
    OFFICE_BUILDING,

    /**
     * B\u00fcrozentrum
     * 
     */
    OFFICE_CENTRE,

    /**
     * B\u00fcro-/ Lagergeb\u00e4ude
     * 
     */
    OFFICE_STORAGE_BUILDING,

    /**
     * Praxis
     * 
     */
    SURGERY,

    /**
     * Praxisetage
     * 
     */
    SURGERY_FLOOR,

    /**
     * Praxishaus
     * 
     */
    SURGERY_BUILDING,

    /**
     * Gewerbezentrum
     * 
     */
    COMMERCIAL_CENTRE,

    /**
     * Wohn- und Gesch\u00e4ftsgeb\u00e4ude
     * 
     */
    LIVING_AND_COMMERCIAL_BUILDING,

    /**
     * B\u00fcro- und Gesch\u00e4ftsgeb\u00e4ude
     * 
     */
    OFFICE_AND_COMMERCIAL_BUILDING;

    public String value() {
        return name();
    }

    public static OfficeType fromValue(String v) {
        return valueOf(v);
    }

}
