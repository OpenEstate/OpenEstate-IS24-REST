
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteDevelopmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SiteDevelopmentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEVELOPED"/&gt;
 *     &lt;enumeration value="DEVELOPED_PARTIALLY"/&gt;
 *     &lt;enumeration value="NOT_DEVELOPED"/&gt;
 *     &lt;enumeration value="NO_INFORMATION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SiteDevelopmentType")
@XmlEnum
public enum SiteDevelopmentType {


    /**
     * Erschlossen
     * 
     */
    DEVELOPED,

    /**
     * Teilerschlossen
     * 
     */
    DEVELOPED_PARTIALLY,

    /**
     * Unerschlossen
     * 
     */
    NOT_DEVELOPED,

    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION;

    public String value() {
        return name();
    }

    public static SiteDevelopmentType fromValue(String v) {
        return valueOf(v);
    }

}
