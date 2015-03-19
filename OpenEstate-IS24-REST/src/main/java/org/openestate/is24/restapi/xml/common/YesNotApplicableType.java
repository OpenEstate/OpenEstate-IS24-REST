
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YesNotApplicableType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="YesNotApplicableType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="YES"/>
 *     &lt;enumeration value="NOT_APPLICABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "YesNotApplicableType")
@XmlEnum
public enum YesNotApplicableType {


    /**
     * Ja
     * 
     */
    YES,

    /**
     * keine Angabe
     * 
     */
    NOT_APPLICABLE;

    public String value() {
        return name();
    }

    public static YesNotApplicableType fromValue(String v) {
        return valueOf(v);
    }

}
