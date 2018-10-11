
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalutationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SalutationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FEMALE"/&gt;
 *     &lt;enumeration value="MALE"/&gt;
 *     &lt;enumeration value="COMPANY"/&gt;
 *     &lt;enumeration value="NO_SALUTATION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SalutationType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
public enum SalutationType {


    /**
     * weibliche Anrede
     * 
     */
    FEMALE,

    /**
     * m\u00e4nnnliche Anrede
     * 
     */
    MALE,

    /**
     * Anrede f\u00fcr Firmen
     * 
     */
    COMPANY,

    /**
     * Keine besondere Anrede.
     * 
     */
    NO_SALUTATION;

    public String value() {
        return name();
    }

    public static SalutationType fromValue(String v) {
        return valueOf(v);
    }

}
