
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SupplyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_INFORMATION"/&gt;
 *     &lt;enumeration value="DIRECT_APPROACH"/&gt;
 *     &lt;enumeration value="NO_DIRECT_APPROACH"/&gt;
 *     &lt;enumeration value="CAR_APPROACH"/&gt;
 *     &lt;enumeration value="APPROACH_TO_THE_FRONT"/&gt;
 *     &lt;enumeration value="APPROACH_TO_THE_BACK"/&gt;
 *     &lt;enumeration value="FULL_TIME"/&gt;
 *     &lt;enumeration value="FORENOON"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SupplyType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
public enum SupplyType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Direkter Zugang
     * 
     */
    DIRECT_APPROACH,

    /**
     * Keine direkte Anfahrt
     * 
     */
    NO_DIRECT_APPROACH,

    /**
     * PKW-Zufahrt
     * 
     */
    CAR_APPROACH,

    /**
     * Anfahrt von vorne
     * 
     */
    APPROACH_TO_THE_FRONT,

    /**
     * Anfahrt von hinten
     * 
     */
    APPROACH_TO_THE_BACK,

    /**
     * Ganzt\u00e4gig
     * 
     */
    FULL_TIME,

    /**
     * Vormittags
     * 
     */
    FORENOON;

    public String value() {
        return name();
    }

    public static SupplyType fromValue(String v) {
        return valueOf(v);
    }

}
