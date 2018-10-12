
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoreType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StoreType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SHOWROOM_SPACE"/&gt;
 *     &lt;enumeration value="SHOPPING_CENTRE"/&gt;
 *     &lt;enumeration value="FACTORY_OUTLET"/&gt;
 *     &lt;enumeration value="DEPARTMENT_STORE"/&gt;
 *     &lt;enumeration value="KIOSK"/&gt;
 *     &lt;enumeration value="STORE"/&gt;
 *     &lt;enumeration value="SELF_SERVICE_MARKET"/&gt;
 *     &lt;enumeration value="SALES_AREA"/&gt;
 *     &lt;enumeration value="SALES_HALL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StoreType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
public enum StoreType {


    /**
     * Ausstellungsfl\u00e4che
     * 
     */
    SHOWROOM_SPACE,

    /**
     * Einkaufszentrum
     * 
     */
    SHOPPING_CENTRE,

    /**
     * Factory Outlet
     * 
     */
    FACTORY_OUTLET,

    /**
     * Kaufhaus
     * 
     */
    DEPARTMENT_STORE,

    /**
     * Kiosk
     * 
     */
    KIOSK,

    /**
     * Laden
     * 
     */
    STORE,

    /**
     * SB-Markt
     * 
     */
    SELF_SERVICE_MARKET,

    /**
     * Verkaufsfl\u00e4che
     * 
     */
    SALES_AREA,

    /**
     * Verkaufshalle
     * 
     */
    SALES_HALL;

    public String value() {
        return name();
    }

    public static StoreType fromValue(String v) {
        return valueOf(v);
    }

}
