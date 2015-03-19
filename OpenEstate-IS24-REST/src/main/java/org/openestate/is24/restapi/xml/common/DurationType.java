
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DurationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DurationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DAY"/>
 *     &lt;enumeration value="WEEK"/>
 *     &lt;enumeration value="MONTH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DurationType")
@XmlEnum
public enum DurationType {


    /**
     * mietbar pro Tag
     * 
     */
    DAY,

    /**
     * mietbar pro Woche
     * 
     */
    WEEK,

    /**
     * mietbar pro Monat
     * 
     */
    MONTH;

    public String value() {
        return name();
    }

    public static DurationType fromValue(String v) {
        return valueOf(v);
    }

}
