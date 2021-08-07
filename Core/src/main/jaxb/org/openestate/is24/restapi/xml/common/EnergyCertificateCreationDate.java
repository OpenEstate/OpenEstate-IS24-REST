
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnergyCertificateCreationDate.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnergyCertificateCreationDate"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NOT_APPLICABLE"/&gt;
 *     &lt;enumeration value="BEFORE_01_MAY_2014"/&gt;
 *     &lt;enumeration value="FROM_01_MAY_2014"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnergyCertificateCreationDate")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
public enum EnergyCertificateCreationDate {


    /**
     * keine Angabe
     * 
     */
    NOT_APPLICABLE,

    /**
     * Ausgestellt vor dem 01.05.2014
     * 
     */
    BEFORE_01_MAY_2014,

    /**
     * Ausgestellt ab dem 01.05.2014
     * 
     */
    FROM_01_MAY_2014;

    public String value() {
        return name();
    }

    public static EnergyCertificateCreationDate fromValue(String v) {
        return valueOf(v);
    }

}
