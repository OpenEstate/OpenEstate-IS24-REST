
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RealEstateState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RealEstateState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="INACTIVE"/>
 *     &lt;enumeration value="TO_BE_DELETED"/>
 *     &lt;enumeration value="DRAFT"/>
 *     &lt;enumeration value="ARCHIVED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RealEstateState")
@XmlEnum
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
