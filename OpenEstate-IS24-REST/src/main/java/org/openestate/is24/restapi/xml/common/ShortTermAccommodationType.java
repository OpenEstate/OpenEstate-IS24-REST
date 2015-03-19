
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShortTermAccommodationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShortTermAccommodationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APARTMENT"/>
 *     &lt;enumeration value="FLAT"/>
 *     &lt;enumeration value="HOUSE"/>
 *     &lt;enumeration value="ROOM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShortTermAccommodationType")
@XmlEnum
public enum ShortTermAccommodationType {


    /**
     * Wohnung und Apartment
     * 
     */
    APARTMENT,

    /**
     * Wohnung
     * 
     */
    FLAT,

    /**
     * Haus
     * 
     */
    HOUSE,

    /**
     * Zimmer
     * 
     */
    ROOM;

    public String value() {
        return name();
    }

    public static ShortTermAccommodationType fromValue(String v) {
        return valueOf(v);
    }

}
