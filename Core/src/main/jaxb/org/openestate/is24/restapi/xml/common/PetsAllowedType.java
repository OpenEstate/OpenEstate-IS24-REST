
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PetsAllowedType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PetsAllowedType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_INFORMATION"/&gt;
 *     &lt;enumeration value="NEGOTIABLE"/&gt;
 *     &lt;enumeration value="YES"/&gt;
 *     &lt;enumeration value="NO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PetsAllowedType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
public enum PetsAllowedType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Nach Vereinbarung
     * 
     */
    NEGOTIABLE,

    /**
     * Ja
     * 
     */
    YES,

    /**
     * Nein
     * 
     */
    NO;

    public String value() {
        return name();
    }

    public static PetsAllowedType fromValue(String v) {
        return valueOf(v);
    }

}
