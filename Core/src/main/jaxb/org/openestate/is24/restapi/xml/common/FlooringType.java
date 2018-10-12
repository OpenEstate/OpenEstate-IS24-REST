
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlooringType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlooringType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_INFORMATION"/&gt;
 *     &lt;enumeration value="CONCRETE"/&gt;
 *     &lt;enumeration value="EPOXY_RESIN"/&gt;
 *     &lt;enumeration value="TILES"/&gt;
 *     &lt;enumeration value="PLANKS"/&gt;
 *     &lt;enumeration value="LAMINATE"/&gt;
 *     &lt;enumeration value="PARQUET"/&gt;
 *     &lt;enumeration value="PVC"/&gt;
 *     &lt;enumeration value="CARPET"/&gt;
 *     &lt;enumeration value="ANTISTATIC_FLOOR"/&gt;
 *     &lt;enumeration value="OFFICE_CARPET"/&gt;
 *     &lt;enumeration value="STONE"/&gt;
 *     &lt;enumeration value="CUSTOMIZABLE"/&gt;
 *     &lt;enumeration value="WITHOUT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FlooringType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
