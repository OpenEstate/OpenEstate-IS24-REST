
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RealEstateCondition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RealEstateCondition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="FIRST_TIME_USE"/>
 *     &lt;enumeration value="FIRST_TIME_USE_AFTER_REFURBISHMENT"/>
 *     &lt;enumeration value="MINT_CONDITION"/>
 *     &lt;enumeration value="REFURBISHED"/>
 *     &lt;enumeration value="MODERNIZED"/>
 *     &lt;enumeration value="FULLY_RENOVATED"/>
 *     &lt;enumeration value="WELL_KEPT"/>
 *     &lt;enumeration value="NEED_OF_RENOVATION"/>
 *     &lt;enumeration value="NEGOTIABLE"/>
 *     &lt;enumeration value="RIPE_FOR_DEMOLITION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RealEstateCondition")
@XmlEnum
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
