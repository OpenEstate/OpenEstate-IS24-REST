
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RealEstateState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RealEstateState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTIVE"/&gt;
 *     &lt;enumeration value="INACTIVE"/&gt;
 *     &lt;enumeration value="TO_BE_DELETED"/&gt;
 *     &lt;enumeration value="DRAFT"/&gt;
 *     &lt;enumeration value="ARCHIVED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RealEstateState")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
public enum RealEstateState {


    /**
     * Ver\u00f6ffentlichungsstatus ist aktiv.
     * 
     */
    ACTIVE,

    /**
     * Ver\u00f6ffentlichungsstatus ist inaktiv.
     * 
     */
    INACTIVE,

    /**
     * Immobilie wurde gel\u00f6scht.
     * 
     */
    TO_BE_DELETED,

    /**
     * Immobilie ist im Entwurf.
     * 
     */
    DRAFT,

    /**
     * Immobilie ist archiviert.
     * 
     */
    ARCHIVED;

    public String value() {
        return name();
    }

    public static RealEstateState fromValue(String v) {
        return valueOf(v);
    }

}
