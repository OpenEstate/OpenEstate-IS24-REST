
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RealEstateCondition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RealEstateCondition"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_INFORMATION"/&gt;
 *     &lt;enumeration value="FIRST_TIME_USE"/&gt;
 *     &lt;enumeration value="FIRST_TIME_USE_AFTER_REFURBISHMENT"/&gt;
 *     &lt;enumeration value="MINT_CONDITION"/&gt;
 *     &lt;enumeration value="REFURBISHED"/&gt;
 *     &lt;enumeration value="MODERNIZED"/&gt;
 *     &lt;enumeration value="FULLY_RENOVATED"/&gt;
 *     &lt;enumeration value="WELL_KEPT"/&gt;
 *     &lt;enumeration value="NEED_OF_RENOVATION"/&gt;
 *     &lt;enumeration value="NEGOTIABLE"/&gt;
 *     &lt;enumeration value="RIPE_FOR_DEMOLITION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RealEstateCondition")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
public enum RealEstateCondition {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Erstbezug
     * 
     */
    FIRST_TIME_USE,

    /**
     * Erstbezug nach Sanierung
     * 
     */
    FIRST_TIME_USE_AFTER_REFURBISHMENT,

    /**
     * Neuwertig
     * 
     */
    MINT_CONDITION,

    /**
     * Saniert
     * 
     */
    REFURBISHED,

    /**
     * Modernisiert
     * 
     */
    MODERNIZED,

    /**
     * Vollst\u00e4ndig renoviert
     * 
     */
    FULLY_RENOVATED,

    /**
     * Gepflegt
     * 
     */
    WELL_KEPT,

    /**
     * Renovierungsbed\u00fcrftig
     * 
     */
    NEED_OF_RENOVATION,

    /**
     * Nach Vereinbarung
     * 
     */
    NEGOTIABLE,

    /**
     * Abbruchreif
     * 
     */
    RIPE_FOR_DEMOLITION;

    public String value() {
        return name();
    }

    public static RealEstateCondition fromValue(String v) {
        return valueOf(v);
    }

}
