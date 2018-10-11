
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HouseTypeConstructionMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HouseTypeConstructionMethodType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNSPECIFIED"/&gt;
 *     &lt;enumeration value="PREFABRICATED"/&gt;
 *     &lt;enumeration value="WOOD_PREFABRICATED"/&gt;
 *     &lt;enumeration value="SOLID"/&gt;
 *     &lt;enumeration value="SOLID_PREFABRICATED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HouseTypeConstructionMethodType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
public enum HouseTypeConstructionMethodType {


    /**
     * nicht spezifiziert
     * 
     */
    UNSPECIFIED,

    /**
     * Fertigteilhaus
     * 
     */
    PREFABRICATED,

    /**
     * Fertigteilhaus aus Holz
     * 
     */
    WOOD_PREFABRICATED,

    /**
     * Massivhaus
     * 
     */
    SOLID,

    /**
     * Fertigteilhaus Massiv
     * 
     */
    SOLID_PREFABRICATED;

    public String value() {
        return name();
    }

    public static HouseTypeConstructionMethodType fromValue(String v) {
        return valueOf(v);
    }

}
