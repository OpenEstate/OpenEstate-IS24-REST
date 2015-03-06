
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CareLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CareLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CARE_LEVEL_1"/>
 *     &lt;enumeration value="CARE_LEVEL_2"/>
 *     &lt;enumeration value="CARE_LEVEL_3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CareLevel")
@XmlEnum
public enum CareLevel {


    /**
     * Pflegestufe 1
     *           
     * 
     */
    CARE_LEVEL_1,

    /**
     * Pflegestufe 2
     *           
     * 
     */
    CARE_LEVEL_2,

    /**
     * Pflegestufe 3
     *           
     * 
     */
    CARE_LEVEL_3;

    public String value() {
        return name();
    }

    public static CareLevel fromValue(String v) {
        return valueOf(v);
    }

}
