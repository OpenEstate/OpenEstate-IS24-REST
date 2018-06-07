
package org.openestate.is24.restapi.xml.commonsearch;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListingTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListingTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="XL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ListingTypes")
@XmlEnum
public enum ListingTypes {


    /**
     * Listing type: S: The smallest listing.
     * 
     */
    S,

    /**
     * Listing type: M. The second smallest listing.
     * 
     */
    M,

    /**
     * Listing type: L. The second largest listing.
     * 
     */
    L,

    /**
     * Listing type: XL. The largest listing.
     * 
     */
    XL;

    public String value() {
        return name();
    }

    public static ListingTypes fromValue(String v) {
        return valueOf(v);
    }

}
