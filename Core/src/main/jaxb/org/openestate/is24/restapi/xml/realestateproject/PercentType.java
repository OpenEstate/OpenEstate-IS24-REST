
package org.openestate.is24.restapi.xml.realestateproject;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for percentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="percentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *     &lt;enumeration value="0"/&gt;
 *     &lt;enumeration value="10"/&gt;
 *     &lt;enumeration value="20"/&gt;
 *     &lt;enumeration value="30"/&gt;
 *     &lt;enumeration value="40"/&gt;
 *     &lt;enumeration value="50"/&gt;
 *     &lt;enumeration value="60"/&gt;
 *     &lt;enumeration value="70"/&gt;
 *     &lt;enumeration value="80"/&gt;
 *     &lt;enumeration value="90"/&gt;
 *     &lt;enumeration value="100"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "percentType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
public enum PercentType {

    @XmlEnumValue("0")
    ZERO("0"),
    @XmlEnumValue("10")
    TEN("10"),
    @XmlEnumValue("20")
    TWENTY("20"),
    @XmlEnumValue("30")
    THIRTY("30"),
    @XmlEnumValue("40")
    FORTY("40"),
    @XmlEnumValue("50")
    FIFTY("50"),
    @XmlEnumValue("60")
    SIXTY("60"),
    @XmlEnumValue("70")
    SEVENTY("70"),
    @XmlEnumValue("80")
    EIGHTY("80"),
    @XmlEnumValue("90")
    NINETY("90"),
    @XmlEnumValue("100")
    HUNDRED("100");
    private final String value;

    PercentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PercentType fromValue(String v) {
        for (PercentType c: PercentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
