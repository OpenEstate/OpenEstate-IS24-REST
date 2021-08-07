
package org.openestate.is24.restapi.xml.realestateproject;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PictureType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PictureType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COMPANY_LOGO"/&gt;
 *     &lt;enumeration value="PROJECT_LOGO"/&gt;
 *     &lt;enumeration value="IMAGE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PictureType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
public enum PictureType {

    COMPANY_LOGO,
    PROJECT_LOGO,
    IMAGE;

    public String value() {
        return name();
    }

    public static PictureType fromValue(String v) {
        return valueOf(v);
    }

}
