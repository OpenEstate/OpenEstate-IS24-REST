
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommercializationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommercializationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BUY"/>
 *     &lt;enumeration value="RENT"/>
 *     &lt;enumeration value="LEASE"/>
 *     &lt;enumeration value="LEASEHOLD"/>
 *     &lt;enumeration value="COMPULSORY_AUCTION"/>
 *     &lt;enumeration value="RENT_AND_BUY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommercializationType")
@XmlEnum
public enum CommercializationType {


    /**
     * Kauf
     * 
     */
    BUY,

    /**
     * Miete
     * 
     */
    RENT,

    /**
     * Pacht
     * 
     */
    LEASE,

    /**
     * Erbpacht
     * 
     */
    LEASEHOLD,

    /**
     * Zwangsversteigerung
     * 
     */
    COMPULSORY_AUCTION,

    /**
     * Miete und Kauf
     * 
     */
    RENT_AND_BUY;

    public String value() {
        return name();
    }

    public static CommercializationType fromValue(String v) {
        return valueOf(v);
    }

}
