
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PictureScaleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PictureScaleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SCALE_60x40"/&gt;
 *     &lt;enumeration value="SCALE_60x60"/&gt;
 *     &lt;enumeration value="SCALE_73x73"/&gt;
 *     &lt;enumeration value="SCALE_118x118"/&gt;
 *     &lt;enumeration value="SCALE_155x40"/&gt;
 *     &lt;enumeration value="SCALE_200x200"/&gt;
 *     &lt;enumeration value="SCALE_210x210"/&gt;
 *     &lt;enumeration value="SCALE_300x300"/&gt;
 *     &lt;enumeration value="SCALE_400x300"/&gt;
 *     &lt;enumeration value="SCALE_540x540"/&gt;
 *     &lt;enumeration value="SCALE_1000x1000"/&gt;
 *     &lt;enumeration value="SCALE_AND_CROP"/&gt;
 *     &lt;enumeration value="SCALE"/&gt;
 *     &lt;enumeration value="WHITE_FILLING"/&gt;
 *     &lt;enumeration value="SCALE_MAX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PictureScaleType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
public enum PictureScaleType {


    /**
     * Bildgr\u00f6\u00dfe 60 x 40
     * 
     */
    @XmlEnumValue("SCALE_60x40")
    SCALE_60_X_40("SCALE_60x40"),

    /**
     * Bildgr\u00f6\u00dfe 60 x 60
     * 
     */
    @XmlEnumValue("SCALE_60x60")
    SCALE_60_X_60("SCALE_60x60"),

    /**
     * Bildgr\u00f6\u00dfe 73 x 73
     * 
     */
    @XmlEnumValue("SCALE_73x73")
    SCALE_73_X_73("SCALE_73x73"),

    /**
     * Bildgr\u00f6\u00dfe 118 x 118
     * 
     */
    @XmlEnumValue("SCALE_118x118")
    SCALE_118_X_118("SCALE_118x118"),

    /**
     * Bildgr\u00f6\u00dfe 155 x 40
     * 
     */
    @XmlEnumValue("SCALE_155x40")
    SCALE_155_X_40("SCALE_155x40"),

    /**
     * Bildgr\u00f6\u00dfe 200 x 200
     * 
     */
    @XmlEnumValue("SCALE_200x200")
    SCALE_200_X_200("SCALE_200x200"),

    /**
     * Bildgr\u00f6\u00dfe 210 x 210
     * 
     */
    @XmlEnumValue("SCALE_210x210")
    SCALE_210_X_210("SCALE_210x210"),

    /**
     * Bildgr\u00f6\u00dfe 300 x 300
     * 
     */
    @XmlEnumValue("SCALE_300x300")
    SCALE_300_X_300("SCALE_300x300"),

    /**
     * Bildgr\u00f6\u00dfe 400 x 300
     * 
     */
    @XmlEnumValue("SCALE_400x300")
    SCALE_400_X_300("SCALE_400x300"),

    /**
     * Bildgr\u00f6\u00dfe 540 x 540
     * 
     */
    @XmlEnumValue("SCALE_540x540")
    SCALE_540_X_540("SCALE_540x540"),

    /**
     * Bildgr\u00f6\u00dfe 1000 x 1000
     * 
     */
    @XmlEnumValue("SCALE_1000x1000")
    SCALE_1000_X_1000("SCALE_1000x1000"),

    /**
     * Template f\u00fcr Scaling und Cropping
     * 
     */
    SCALE_AND_CROP("SCALE_AND_CROP"),

    /**
     * Template f\u00fcr Scaling
     * 
     */
    SCALE("SCALE"),

    /**
     * Template f\u00fcr White filling
     * 
     */
    WHITE_FILLING("WHITE_FILLING"),

    /**
     * Bild in h\u00f6chster Aufl\u00f6sung
     * 
     */
    SCALE_MAX("SCALE_MAX");
    private final String value;

    PictureScaleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PictureScaleType fromValue(String v) {
        for (PictureScaleType c: PictureScaleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
