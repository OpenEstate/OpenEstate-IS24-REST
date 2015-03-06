
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItInfrastructureType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItInfrastructureType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="YES"/>
 *     &lt;enumeration value="NO"/>
 *     &lt;enumeration value="BY_APPOINTMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItInfrastructureType")
@XmlEnum
public enum ItInfrastructureType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Ja
     * 
     */
    YES,

    /**
     * Nein
     * 
     */
    NO,

    /**
     * Nach Vereinbarung
     * 
     */
    BY_APPOINTMENT;

    public String value() {
        return name();
    }

    public static ItInfrastructureType fromValue(String v) {
        return valueOf(v);
    }

}
