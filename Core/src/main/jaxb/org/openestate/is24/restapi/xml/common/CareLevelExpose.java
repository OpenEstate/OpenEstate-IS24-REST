
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CareLevelExpose.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CareLevelExpose"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CARE_LEVEL_1"/&gt;
 *     &lt;enumeration value="CARE_LEVEL_2"/&gt;
 *     &lt;enumeration value="CARE_LEVEL_3"/&gt;
 *     &lt;enumeration value="CARE_LEVEL_1_AND_2"/&gt;
 *     &lt;enumeration value="CARE_LEVEL_2_AND_3"/&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CareLevelExpose")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
public enum CareLevelExpose {


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
    CARE_LEVEL_3,

    /**
     * Pflegestufen 1 und 2
     *                     
     * 
     */
    CARE_LEVEL_1_AND_2,

    /**
     * Pflegestufen 2 und 3
     *                     
     * 
     */
    CARE_LEVEL_2_AND_3,

    /**
     * Alle Pflegestufen
     *                     
     * 
     */
    ALL;

    public String value() {
        return name();
    }

    public static CareLevelExpose fromValue(String v) {
        return valueOf(v);
    }

}
