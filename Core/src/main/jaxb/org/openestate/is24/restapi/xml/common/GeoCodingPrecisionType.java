
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeoCodingPrecisionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeoCodingPrecisionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ROOFTOP"/&gt;
 *     &lt;enumeration value="HOUSE_NUMBER"/&gt;
 *     &lt;enumeration value="STREET"/&gt;
 *     &lt;enumeration value="QUARTER"/&gt;
 *     &lt;enumeration value="CITY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GeoCodingPrecisionType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
public enum GeoCodingPrecisionType {


    /**
     * schornsteingenau
     * 
     */
    ROOFTOP,

    /**
     * hausnummerngenau
     * 
     */
    HOUSE_NUMBER,

    /**
     * strassenabschnittsgenau
     * 
     */
    STREET,

    /**
     * PLZ-genau
     * 
     */
    QUARTER,

    /**
     * stadtgenau
     * 
     */
    CITY;

    public String value() {
        return name();
    }

    public static GeoCodingPrecisionType fromValue(String v) {
        return valueOf(v);
    }

}
