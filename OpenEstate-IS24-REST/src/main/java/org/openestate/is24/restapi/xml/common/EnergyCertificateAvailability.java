
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnergyCertificateAvailability.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnergyCertificateAvailability">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AVAILABLE"/>
 *     &lt;enumeration value="NOT_AVAILABLE_YET"/>
 *     &lt;enumeration value="NOT_REQUIRED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnergyCertificateAvailability")
@XmlEnum
public enum EnergyCertificateAvailability {


    /**
     * vorhanden
     * 
     */
    AVAILABLE,

    /**
     * noch nicht vorhanden
     * 
     */
    NOT_AVAILABLE_YET,

    /**
     * nicht notwendig
     * 
     */
    NOT_REQUIRED;

    public String value() {
        return name();
    }

    public static EnergyCertificateAvailability fromValue(String v) {
        return valueOf(v);
    }

}
