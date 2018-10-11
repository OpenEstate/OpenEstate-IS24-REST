
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommercializationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommercializationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BUY"/&gt;
 *     &lt;enumeration value="RENT"/&gt;
 *     &lt;enumeration value="LEASE"/&gt;
 *     &lt;enumeration value="LEASEHOLD"/&gt;
 *     &lt;enumeration value="COMPULSORY_AUCTION"/&gt;
 *     &lt;enumeration value="RENT_AND_BUY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CommercializationType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
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
