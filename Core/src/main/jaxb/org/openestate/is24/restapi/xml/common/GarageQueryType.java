
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GarageQueryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GarageQueryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GARAGE"/&gt;
 *     &lt;enumeration value="STREET_PARKING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GarageQueryType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
public enum GarageQueryType {


    /**
     * Garage
     * 
     */
    GARAGE,

    /**
     * Au\u00dfenstellplatz
     * 
     */
    STREET_PARKING;

    public String value() {
        return name();
    }

    public static GarageQueryType fromValue(String v) {
        return valueOf(v);
    }

}
