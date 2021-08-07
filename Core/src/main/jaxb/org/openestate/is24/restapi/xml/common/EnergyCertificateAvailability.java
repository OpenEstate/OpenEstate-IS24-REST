
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnergyCertificateAvailability.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnergyCertificateAvailability"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AVAILABLE"/&gt;
 *     &lt;enumeration value="NOT_AVAILABLE_YET"/&gt;
 *     &lt;enumeration value="NOT_REQUIRED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnergyCertificateAvailability")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
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
