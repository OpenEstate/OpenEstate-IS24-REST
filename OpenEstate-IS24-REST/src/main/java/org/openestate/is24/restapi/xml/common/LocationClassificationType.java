
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationClassificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationClassificationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_INFORMATION"/&gt;
 *     &lt;enumeration value="CLASSIFICATION_A"/&gt;
 *     &lt;enumeration value="CLASSIFICATION_B"/&gt;
 *     &lt;enumeration value="SHOPPING_CENTRE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationClassificationType")
@XmlEnum
public enum LocationClassificationType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * A-Lage
     * 
     */
    CLASSIFICATION_A,

    /**
     * B-Lage
     * 
     */
    CLASSIFICATION_B,

    /**
     * im Schoppingcenter
     * 
     */
    SHOPPING_CENTRE;

    public String value() {
        return name();
    }

    public static LocationClassificationType fromValue(String v) {
        return valueOf(v);
    }

}
