
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactFormType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactFormType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EMAIL"/&gt;
 *     &lt;enumeration value="LONG"/&gt;
 *     &lt;enumeration value="PHONE"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContactFormType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
public enum ContactFormType {


    /**
     * E-Mail-Kontaktformular (Schnellkontakt)
     * 
     */
    EMAIL,

    /**
     * Ausfuehrliches Kontaktformular
     * 
     */
    LONG,

    /**
     * Telefon-Kontaktformular
     * 
     */
    PHONE,

    /**
     * Zeigt an, dass kein Kontaktformular sinnvoll angezeigt werden
     *                         kann, z.B. da der Anbieter zwar Kontaktaufnahme per E-Mail wuenscht, aber selbst keine
     *                         E-Mail-Adresse angegeben hat.
     *                     
     * 
     */
    NONE;

    public String value() {
        return name();
    }

    public static ContactFormType fromValue(String v) {
        return valueOf(v);
    }

}
