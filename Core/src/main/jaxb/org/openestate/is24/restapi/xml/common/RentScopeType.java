
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RentScopeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RentScopeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NET_RENT"/&gt;
 *     &lt;enumeration value="GROSS_RENT"/&gt;
 *     &lt;enumeration value="INCONSISTENT_WARM_RENT"/&gt;
 *     &lt;enumeration value="WARM_RENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RentScopeType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
public enum RentScopeType {


    /**
     * Netto Kaltmiete ohne irgendwelche Betriebskosten
     *                     
     * 
     */
    NET_RENT,

    /**
     * Netto Kaltmiete plus Betriebskosten Kalt
     * 
     */
    GROSS_RENT,

    /**
     * Netto Kaltmiete plus Betriebskosten Kalt und Warm, mit
     *                         Inkonsistenzen
     *                     
     * 
     */
    INCONSISTENT_WARM_RENT,

    /**
     * Netto Kaltmiete plus Betriebskosten Kalt und Warm
     *                     
     * 
     */
    WARM_RENT;

    public String value() {
        return name();
    }

    public static RentScopeType fromValue(String v) {
        return valueOf(v);
    }

}
