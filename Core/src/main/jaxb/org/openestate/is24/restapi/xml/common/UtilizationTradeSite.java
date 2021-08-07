
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UtilizationTradeSite.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UtilizationTradeSite"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LEISURE"/&gt;
 *     &lt;enumeration value="AGRICULTURE_FORESTRY"/&gt;
 *     &lt;enumeration value="TRADE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UtilizationTradeSite")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
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
