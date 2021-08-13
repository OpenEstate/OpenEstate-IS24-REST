
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfficeRentDuration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OfficeRentDuration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WEEKLY"/&gt;
 *     &lt;enumeration value="MONTHLY"/&gt;
 *     &lt;enumeration value="YEARLY"/&gt;
 *     &lt;enumeration value="LONG_TERM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OfficeRentDuration")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
public enum OfficeRentDuration {


    /**
     * wochenweise
     * 
     */
    WEEKLY,

    /**
     * monatsweise
     * 
     */
    MONTHLY,

    /**
     *  1 bis 2 Jahre
     * 
     */
    YEARLY,

    /**
     * langfristig
     * 
     */
    LONG_TERM;

    public String value() {
        return name();
    }

    public static OfficeRentDuration fromValue(String v) {
        return valueOf(v);
    }

}
