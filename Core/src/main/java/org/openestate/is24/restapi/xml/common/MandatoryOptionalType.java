
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MandatoryOptionalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MandatoryOptionalType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MANDATORY"/&gt;
 *     &lt;enumeration value="OPTIONAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MandatoryOptionalType")
@XmlEnum
public enum MandatoryOptionalType {


    /**
     * Pflichtfeld
     * 
     */
    MANDATORY,

    /**
     * optionales Feld
     * 
     */
    OPTIONAL;

    public String value() {
        return name();
    }

    public static MandatoryOptionalType fromValue(String v) {
        return valueOf(v);
    }

}