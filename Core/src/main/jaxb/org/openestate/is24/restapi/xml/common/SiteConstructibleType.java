
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteConstructibleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SiteConstructibleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CONSTRUCTIONPLAN"/&gt;
 *     &lt;enumeration value="NEIGHBOURCONSTRUCTION"/&gt;
 *     &lt;enumeration value="EXTERNALAREA"/&gt;
 *     &lt;enumeration value="NO_INFORMATION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SiteConstructibleType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
public enum SiteConstructibleType {


    /**
     * Bebauungsplan
     * 
     */
    CONSTRUCTIONPLAN,

    /**
     * wie Nachbarbebauung
     * 
     */
    NEIGHBOURCONSTRUCTION,

    /**
     * Aussengebiet
     * 
     */
    EXTERNALAREA,

    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION;

    public String value() {
        return name();
    }

    public static SiteConstructibleType fromValue(String v) {
        return valueOf(v);
    }

}
