
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShortTermAccommodationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShortTermAccommodationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APARTMENT"/&gt;
 *     &lt;enumeration value="FLAT"/&gt;
 *     &lt;enumeration value="HOUSE"/&gt;
 *     &lt;enumeration value="ROOM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShortTermAccommodationType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
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
