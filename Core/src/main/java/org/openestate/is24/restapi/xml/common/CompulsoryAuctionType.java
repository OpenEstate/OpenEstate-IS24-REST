
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompulsoryAuctionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompulsoryAuctionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FREEHOLD_FLAT"/&gt;
 *     &lt;enumeration value="FAMILY_HOUSE"/&gt;
 *     &lt;enumeration value="BUSINESS_AND_YIELD"/&gt;
 *     &lt;enumeration value="LOT"/&gt;
 *     &lt;enumeration value="GARAGE_AND_OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CompulsoryAuctionType")
@XmlEnum
public enum CompulsoryAuctionType {


    /**
     * Eigentumswohnungen
     * 
     */
    FREEHOLD_FLAT,

    /**
     *  1+2 Familienh\u00e4user
     * 
     */
    FAMILY_HOUSE,

    /**
     * Gewerbe + Rendite
     * 
     */
    BUSINESS_AND_YIELD,

    /**
     * Grundst\u00fccke
     * 
     */
    LOT,

    /**
     * Garagen + Sonstiges
     * 
     */
    GARAGE_AND_OTHER;

    public String value() {
        return name();
    }

    public static CompulsoryAuctionType fromValue(String v) {
        return valueOf(v);
    }

}
