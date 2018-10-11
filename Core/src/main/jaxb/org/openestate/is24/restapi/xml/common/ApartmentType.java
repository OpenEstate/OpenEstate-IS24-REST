
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApartmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApartmentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ROOF_STOREY"/&gt;
 *     &lt;enumeration value="LOFT"/&gt;
 *     &lt;enumeration value="MAISONETTE"/&gt;
 *     &lt;enumeration value="PENTHOUSE"/&gt;
 *     &lt;enumeration value="TERRACED_FLAT"/&gt;
 *     &lt;enumeration value="GROUND_FLOOR"/&gt;
 *     &lt;enumeration value="APARTMENT"/&gt;
 *     &lt;enumeration value="RAISED_GROUND_FLOOR"/&gt;
 *     &lt;enumeration value="HALF_BASEMENT"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *     &lt;enumeration value="NO_INFORMATION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ApartmentType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
public enum ApartmentType {


    /**
     * Dachgeschoss
     * 
     */
    ROOF_STOREY,

    /**
     * Loft
     * 
     */
    LOFT,

    /**
     * Maisonette
     * 
     */
    MAISONETTE,

    /**
     * Penthouse
     * 
     */
    PENTHOUSE,

    /**
     * Terrassenwohnung
     * 
     */
    TERRACED_FLAT,

    /**
     * Erdgeschosswohnung
     * 
     */
    GROUND_FLOOR,

    /**
     * Etagenwohnung
     * 
     */
    APARTMENT,

    /**
     * Hochparterre
     * 
     */
    RAISED_GROUND_FLOOR,

    /**
     * Souterrain
     * 
     */
    HALF_BASEMENT,

    /**
     * Sonstige
     * 
     */
    OTHER,

    /**
     * Keine Angabe (wird zusammen mit OTHER verwendet)
     *                     
     * 
     */
    @Deprecated
    NO_INFORMATION;

    public String value() {
        return name();
    }

    public static ApartmentType fromValue(String v) {
        return valueOf(v);
    }

}
