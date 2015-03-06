
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlooringType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlooringType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="CONCRETE"/>
 *     &lt;enumeration value="EPOXY_RESIN"/>
 *     &lt;enumeration value="TILES"/>
 *     &lt;enumeration value="PLANKS"/>
 *     &lt;enumeration value="LAMINATE"/>
 *     &lt;enumeration value="PARQUET"/>
 *     &lt;enumeration value="PVC"/>
 *     &lt;enumeration value="CARPET"/>
 *     &lt;enumeration value="ANTISTATIC_FLOOR"/>
 *     &lt;enumeration value="OFFICE_CARPET"/>
 *     &lt;enumeration value="STONE"/>
 *     &lt;enumeration value="CUSTOMIZABLE"/>
 *     &lt;enumeration value="WITHOUT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlooringType")
@XmlEnum
public enum FlooringType {


    /**
     * keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Beton
     * 
     */
    CONCRETE,

    /**
     * Epoxydharzboden
     * 
     */
    EPOXY_RESIN,

    /**
     * Fliesen
     * 
     */
    TILES,

    /**
     * Dielen
     * 
     */
    PLANKS,

    /**
     * Laminat
     * 
     */
    LAMINATE,

    /**
     * Parkett
     * 
     */
    PARQUET,

    /**
     * PVC
     * 
     */
    PVC,

    /**
     * Teppichboden
     * 
     */
    CARPET,

    /**
     * antistatischer Teppichboden
     * 
     */
    ANTISTATIC_FLOOR,

    /**
     * stuhlrollenfeste Teppichfliesen
     * 
     */
    OFFICE_CARPET,

    /**
     * Stein
     * 
     */
    STONE,

    /**
     * nach Mieterwunsch
     * 
     */
    CUSTOMIZABLE,

    /**
     * ohne Bodenbelag
     * 
     */
    WITHOUT;

    public String value() {
        return name();
    }

    public static FlooringType fromValue(String v) {
        return valueOf(v);
    }

}
