
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeoCodingPrecisionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeoCodingPrecisionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ROOFTOP"/>
 *     &lt;enumeration value="HOUSE_NUMBER"/>
 *     &lt;enumeration value="STREET"/>
 *     &lt;enumeration value="QUARTER"/>
 *     &lt;enumeration value="CITY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GeoCodingPrecisionType")
@XmlEnum
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
