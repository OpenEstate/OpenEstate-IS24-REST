
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarketingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PURCHASE"/&gt;
 *     &lt;enumeration value="PURCHASE_PER_SQM"/&gt;
 *     &lt;enumeration value="RENT"/&gt;
 *     &lt;enumeration value="RENT_PER_SQM"/&gt;
 *     &lt;enumeration value="LEASE"/&gt;
 *     &lt;enumeration value="LEASEHOLD"/&gt;
 *     &lt;enumeration value="BUDGET_RENT"/&gt;
 *     &lt;enumeration value="RENT_AND_BUY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarketingType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
public enum MarketingType {


    /**
     * Kauf
     * 
     */
    PURCHASE,

    /**
     * Kauf pro Quadratmeter
     * 
     */
    PURCHASE_PER_SQM,

    /**
     * Miete
     * 
     */
    RENT,

    /**
     * Miete pro Quadratmeter
     * 
     */
    RENT_PER_SQM,

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
     * Gesamtmiete aus allen verf\u00fcgbaren Miet-Informationen zum
     *                         Vergleich zu einem gegebenen Monatsbudget
     *                     
     * 
     */
    BUDGET_RENT,

    /**
     * Miete und Kauf
     * 
     */
    RENT_AND_BUY;

    public String value() {
        return name();
    }

    public static MarketingType fromValue(String v) {
        return valueOf(v);
    }

}
