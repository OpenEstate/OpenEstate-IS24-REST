
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceIntervalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceIntervalType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DAY"/>
 *     &lt;enumeration value="WEEK"/>
 *     &lt;enumeration value="MONTH"/>
 *     &lt;enumeration value="YEAR"/>
 *     &lt;enumeration value="ONE_TIME_CHARGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PriceIntervalType")
@XmlEnum
public enum PriceIntervalType {


    /**
     * Zahlung pro Tag
     * 
     */
    DAY,

    /**
     * Zahlung pro Woche
     * 
     */
    WEEK,

    /**
     * Zahlung pro Monat
     * 
     */
    MONTH,

    /**
     * Zahlung pro Jahr
     * 
     */
    YEAR,

    /**
     * Einmalzahlung
     * 
     */
    ONE_TIME_CHARGE;

    public String value() {
        return name();
    }

    public static PriceIntervalType fromValue(String v) {
        return valueOf(v);
    }

}
