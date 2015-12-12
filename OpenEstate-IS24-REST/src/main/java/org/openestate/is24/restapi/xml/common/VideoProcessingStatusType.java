
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for videoProcessingStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="videoProcessingStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INCOMING"/&gt;
 *     &lt;enumeration value="PROCESSING"/&gt;
 *     &lt;enumeration value="SUCCESSFUL"/&gt;
 *     &lt;enumeration value="FAILED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "videoProcessingStatusType")
@XmlEnum
public enum VideoProcessingStatusType {


    /**
     * media status is incomming
     * 
     */
    INCOMING,

    /**
     * media status is processing
     * 
     */
    PROCESSING,

    /**
     * media status is successful
     * 
     */
    SUCCESSFUL,

    /**
     * media status is failed
     * 
     */
    FAILED;

    public String value() {
        return name();
    }

    public static VideoProcessingStatusType fromValue(String v) {
        return valueOf(v);
    }

}
