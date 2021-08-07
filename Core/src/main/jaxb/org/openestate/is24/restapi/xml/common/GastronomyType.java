
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GastronomyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GastronomyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BAR_LOUNGE"/&gt;
 *     &lt;enumeration value="CAFE"/&gt;
 *     &lt;enumeration value="CLUB_DISCO"/&gt;
 *     &lt;enumeration value="GUESTS_HOUSE"/&gt;
 *     &lt;enumeration value="TAVERN"/&gt;
 *     &lt;enumeration value="HOTEL"/&gt;
 *     &lt;enumeration value="HOTEL_RESIDENCE"/&gt;
 *     &lt;enumeration value="HOTEL_GARNI"/&gt;
 *     &lt;enumeration value="PENSION"/&gt;
 *     &lt;enumeration value="RESTAURANT"/&gt;
 *     &lt;enumeration value="BUNGALOW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GastronomyType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
public enum GastronomyType {


    /**
     * Barbetrieb/Lounge
     * 
     */
    BAR_LOUNGE,

    /**
     * Cafe
     * 
     */
    CAFE,

    /**
     * Club/Diskothek
     * 
     */
    CLUB_DISCO,

    /**
     * G\u00e4stehaus
     * 
     */
    GUESTS_HOUSE,

    /**
     * Gastst\u00e4tte
     * 
     */
    TAVERN,

    /**
     * Hotel
     * 
     */
    HOTEL,

    /**
     * Hotelanwesen
     * 
     */
    HOTEL_RESIDENCE,

    /**
     * Hotel garni (Ein Hotel, dass nur Fr\u00fchst\u00fcck anbietet /Tageshotel)
     *                     
     * 
     */
    HOTEL_GARNI,

    /**
     * Pension
     * 
     */
    PENSION,

    /**
     * Restaurant
     * 
     */
    RESTAURANT,

    /**
     * Ferienbungalows
     * 
     */
    BUNGALOW;

    public String value() {
        return name();
    }

    public static GastronomyType fromValue(String v) {
        return valueOf(v);
    }

}
