
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceIntervalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceIntervalType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DAY"/&gt;
 *     &lt;enumeration value="WEEK"/&gt;
 *     &lt;enumeration value="MONTH"/&gt;
 *     &lt;enumeration value="YEAR"/&gt;
 *     &lt;enumeration value="ONE_TIME_CHARGE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PriceIntervalType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
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
