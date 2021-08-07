
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialPurposeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpecialPurposeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RESIDENCE"/&gt;
 *     &lt;enumeration value="FARM"/&gt;
 *     &lt;enumeration value="HORSE_FARM"/&gt;
 *     &lt;enumeration value="VINEYARD"/&gt;
 *     &lt;enumeration value="REPAIR_SHOP"/&gt;
 *     &lt;enumeration value="LEISURE_FACILITY"/&gt;
 *     &lt;enumeration value="INDUSTRIAL_AREA"/&gt;
 *     &lt;enumeration value="SPECIAL_ESTATE"/&gt;
 *     &lt;enumeration value="COMMERCIAL_CENTRE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SpecialPurposeType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
public enum SpecialPurposeType {


    /**
     * Anwesen
     * 
     */
    RESIDENCE,

    /**
     * Bauernhof
     * 
     */
    FARM,

    /**
     * Reiterhof
     * 
     */
    HORSE_FARM,

    /**
     * Weingut
     * 
     */
    VINEYARD,

    /**
     * Werkstatt
     * 
     */
    REPAIR_SHOP,

    /**
     * Freizeitanlage
     * 
     */
    LEISURE_FACILITY,

    /**
     * Gewerbefl\u00e4che
     * 
     */
    INDUSTRIAL_AREA,

    /**
     * Spezialobjekt
     * 
     */
    SPECIAL_ESTATE,

    /**
     * Gewerbepark
     * 
     */
    COMMERCIAL_CENTRE;

    public String value() {
        return name();
    }

    public static SpecialPurposeType fromValue(String v) {
        return valueOf(v);
    }

}
