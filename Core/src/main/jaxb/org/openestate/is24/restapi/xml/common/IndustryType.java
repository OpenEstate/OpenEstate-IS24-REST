
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndustryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IndustryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SHOWROOM_SPACE"/&gt;
 *     &lt;enumeration value="HALL"/&gt;
 *     &lt;enumeration value="HIGH_LACK_STORAGE"/&gt;
 *     &lt;enumeration value="INDUSTRY_HALL"/&gt;
 *     &lt;enumeration value="INDUSTRY_HALL_WITH_OPEN_AREA"/&gt;
 *     &lt;enumeration value="COLD_STORAGE"/&gt;
 *     &lt;enumeration value="MULTIDECK_CABINET_STORAGE"/&gt;
 *     &lt;enumeration value="STORAGE_WITH_OPEN_AREA"/&gt;
 *     &lt;enumeration value="STORAGE_AREA"/&gt;
 *     &lt;enumeration value="STORAGE_HALL"/&gt;
 *     &lt;enumeration value="SERVICE_AREA"/&gt;
 *     &lt;enumeration value="SHIPPING_STORAGE"/&gt;
 *     &lt;enumeration value="REPAIR_SHOP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IndustryType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
public enum IndustryType {


    /**
     * Ausstellungsfl\u00e4che
     * 
     */
    SHOWROOM_SPACE,

    /**
     * Halle
     * 
     */
    HALL,

    /**
     * Hochregallager
     * 
     */
    HIGH_LACK_STORAGE,

    /**
     * Industriehalle
     * 
     */
    INDUSTRY_HALL,

    /**
     * Industriehalle mit Freifl\u00e4che
     * 
     */
    INDUSTRY_HALL_WITH_OPEN_AREA,

    /**
     * K\u00fchlhaus
     * 
     */
    COLD_STORAGE,

    /**
     * K\u00fchlregallager
     * 
     */
    MULTIDECK_CABINET_STORAGE,

    /**
     * Lager mit Freifl\u00e4che
     * 
     */
    STORAGE_WITH_OPEN_AREA,

    /**
     * Lagerfl\u00e4che
     * 
     */
    STORAGE_AREA,

    /**
     * Lagerhalle
     * 
     */
    STORAGE_HALL,

    /**
     * Servicefl\u00e4che
     * 
     */
    SERVICE_AREA,

    /**
     * Speditionslager
     * 
     */
    SHIPPING_STORAGE,

    /**
     * Werkstatt
     * 
     */
    REPAIR_SHOP;

    public String value() {
        return name();
    }

    public static IndustryType fromValue(String v) {
        return valueOf(v);
    }

}
