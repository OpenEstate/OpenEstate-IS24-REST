
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalutationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SalutationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FEMALE"/>
 *     &lt;enumeration value="MALE"/>
 *     &lt;enumeration value="COMPANY"/>
 *     &lt;enumeration value="NO_SALUTATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SalutationType")
@XmlEnum
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
