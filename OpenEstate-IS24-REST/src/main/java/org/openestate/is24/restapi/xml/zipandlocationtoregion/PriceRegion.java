
package org.openestate.is24.restapi.xml.zipandlocationtoregion;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for priceRegion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="priceRegion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="E"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "priceRegion")
@XmlEnum
public enum PriceRegion {

    A,
    B,
    C,
    D,
    E;

    public String value() {
        return name();
    }

    public static PriceRegion fromValue(String v) {
        return valueOf(v);
    }

}
