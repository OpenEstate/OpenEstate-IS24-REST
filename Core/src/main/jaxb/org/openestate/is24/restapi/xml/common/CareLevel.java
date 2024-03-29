
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CareLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CareLevel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CARE_LEVEL_1"/&gt;
 *     &lt;enumeration value="CARE_LEVEL_2"/&gt;
 *     &lt;enumeration value="CARE_LEVEL_3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CareLevel")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
