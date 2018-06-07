
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoomType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoomType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SINGLE"/&gt;
 *     &lt;enumeration value="SHARED"/&gt;
 *     &lt;enumeration value="SINGLE_AND_SHARED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoomType")
@XmlEnum
public enum RoomType {


    /**
     * Einzelzimmer
     *           
     * 
     */
    SINGLE,

    /**
     * Mehrbettzimmer
     *           
     * 
     */
    SHARED,

    /**
     * Einzel- und Mehrbettzimmer
     *           
     * 
     */
    SINGLE_AND_SHARED;

    public String value() {
        return name();
    }

    public static RoomType fromValue(String v) {
        return valueOf(v);
    }

}