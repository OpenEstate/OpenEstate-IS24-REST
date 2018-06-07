
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrueOnlyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrueOnlyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="true"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrueOnlyType")
@XmlEnum
public enum TrueOnlyType {


    /**
     * wahr
     * 
     */
    @XmlEnumValue("true")
    TRUE("true");
    private final String value;

    TrueOnlyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrueOnlyType fromValue(String v) {
        for (TrueOnlyType c: TrueOnlyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}