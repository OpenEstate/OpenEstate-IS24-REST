
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfficeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OfficeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LOFT"/&gt;
 *     &lt;enumeration value="STUDIO"/&gt;
 *     &lt;enumeration value="OFFICE"/&gt;
 *     &lt;enumeration value="OFFICE_FLOOR"/&gt;
 *     &lt;enumeration value="OFFICE_BUILDING"/&gt;
 *     &lt;enumeration value="OFFICE_CENTRE"/&gt;
 *     &lt;enumeration value="OFFICE_STORAGE_BUILDING"/&gt;
 *     &lt;enumeration value="SURGERY"/&gt;
 *     &lt;enumeration value="SURGERY_FLOOR"/&gt;
 *     &lt;enumeration value="SURGERY_BUILDING"/&gt;
 *     &lt;enumeration value="COMMERCIAL_CENTRE"/&gt;
 *     &lt;enumeration value="LIVING_AND_COMMERCIAL_BUILDING"/&gt;
 *     &lt;enumeration value="OFFICE_AND_COMMERCIAL_BUILDING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OfficeType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
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
