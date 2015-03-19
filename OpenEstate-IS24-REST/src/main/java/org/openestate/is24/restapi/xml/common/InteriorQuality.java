
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InteriorQuality.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InteriorQuality">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="LUXURY"/>
 *     &lt;enumeration value="SOPHISTICATED"/>
 *     &lt;enumeration value="NORMAL"/>
 *     &lt;enumeration value="SIMPLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InteriorQuality")
@XmlEnum
public enum InteriorQuality {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Luxus
     * 
     */
    LUXURY,

    /**
     * Gehoben
     * 
     */
    SOPHISTICATED,

    /**
     * Normal
     * 
     */
    NORMAL,

    /**
     * Einfach
     * 
     */
    SIMPLE;

    public String value() {
        return name();
    }

    public static InteriorQuality fromValue(String v) {
        return valueOf(v);
    }

}
