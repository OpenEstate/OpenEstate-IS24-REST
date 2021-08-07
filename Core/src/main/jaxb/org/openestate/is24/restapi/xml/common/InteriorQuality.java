
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InteriorQuality.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InteriorQuality"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_INFORMATION"/&gt;
 *     &lt;enumeration value="LUXURY"/&gt;
 *     &lt;enumeration value="SOPHISTICATED"/&gt;
 *     &lt;enumeration value="NORMAL"/&gt;
 *     &lt;enumeration value="SIMPLE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InteriorQuality")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
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
