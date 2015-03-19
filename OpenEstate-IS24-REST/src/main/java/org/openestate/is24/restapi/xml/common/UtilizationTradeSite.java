
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UtilizationTradeSite.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UtilizationTradeSite">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LEISURE"/>
 *     &lt;enumeration value="AGRICULTURE_FORESTRY"/>
 *     &lt;enumeration value="TRADE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UtilizationTradeSite")
@XmlEnum
public enum UtilizationTradeSite {


    /**
     * Freizeit
     * 
     */
    LEISURE,

    /**
     * Land- / Forstwirtschaft
     * 
     */
    AGRICULTURE_FORESTRY,

    /**
     * Gewerbe
     * 
     */
    TRADE;

    public String value() {
        return name();
    }

    public static UtilizationTradeSite fromValue(String v) {
        return valueOf(v);
    }

}
