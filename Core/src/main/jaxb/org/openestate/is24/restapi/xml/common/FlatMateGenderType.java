
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlatMateGenderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlatMateGenderType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MALE_OR_FEMALE"/&gt;
 *     &lt;enumeration value="MALE"/&gt;
 *     &lt;enumeration value="FEMALE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FlatMateGenderType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
public enum FlatMateGenderType {


    /**
     * M\u00e4nnlich oder weiblich
     * 
     */
    MALE_OR_FEMALE,

    /**
     * M\u00e4nnlich
     * 
     */
    MALE,

    /**
     * Weiblich
     * 
     */
    FEMALE;

    public String value() {
        return name();
    }

    public static FlatMateGenderType fromValue(String v) {
        return valueOf(v);
    }

}
