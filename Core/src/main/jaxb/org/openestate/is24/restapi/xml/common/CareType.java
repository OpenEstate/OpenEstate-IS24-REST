
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CareType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CareType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STATIONARY_CARE"/&gt;
 *     &lt;enumeration value="DAY_CARE"/&gt;
 *     &lt;enumeration value="SHORT_TERM_CARE"/&gt;
 *     &lt;enumeration value="RESPITE_CARE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CareType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
public enum CareType {


    /**
     * Vollstation\u00e4re Pflege
     *                     
     * 
     */
    STATIONARY_CARE,

    /**
     * Tagespflege
     *                     
     * 
     */
    DAY_CARE,

    /**
     * Kurzzeitpflege
     *                     
     * 
     */
    SHORT_TERM_CARE,

    /**
     * Verhinderungspflege
     *                     
     * 
     */
    RESPITE_CARE;

    public String value() {
        return name();
    }

    public static CareType fromValue(String v) {
        return valueOf(v);
    }

}
