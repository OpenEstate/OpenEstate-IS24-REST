
package org.openestate.is24.restapi.xml.gis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="geoCodedAddress" type="{http://rest.immobilienscout24.de/schema/platform/gis/1.0}GeoCodedAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "geoCodedAddress"
})
@XmlRootElement(name = "geoCodedAddressList")
public class GeoCodedAddressList
    implements Cloneable, CopyTo, Equals, ToString
{

    protected List<GeoCodedAddress> geoCodedAddress;

    /**
     * Gets the value of the geoCodedAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geoCodedAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeoCodedAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeoCodedAddress }
     * 
     * 
     */
    public List<GeoCodedAddress> getGeoCodedAddress() {
        if (geoCodedAddress == null) {
            geoCodedAddress = new ArrayList<GeoCodedAddress>();
        }
        return this.geoCodedAddress;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            List<GeoCodedAddress> theGeoCodedAddress;
            theGeoCodedAddress = (((this.geoCodedAddress!= null)&&(!this.geoCodedAddress.isEmpty()))?this.getGeoCodedAddress():null);
            strategy.appendField(locator, this, "geoCodedAddress", buffer, theGeoCodedAddress);
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof GeoCodedAddressList) {
            final GeoCodedAddressList copy = ((GeoCodedAddressList) draftCopy);
            if ((this.geoCodedAddress!= null)&&(!this.geoCodedAddress.isEmpty())) {
                List<GeoCodedAddress> sourceGeoCodedAddress;
                sourceGeoCodedAddress = (((this.geoCodedAddress!= null)&&(!this.geoCodedAddress.isEmpty()))?this.getGeoCodedAddress():null);
                @SuppressWarnings("unchecked")
                List<GeoCodedAddress> copyGeoCodedAddress = ((List<GeoCodedAddress> ) strategy.copy(LocatorUtils.property(locator, "geoCodedAddress", sourceGeoCodedAddress), sourceGeoCodedAddress));
                copy.geoCodedAddress = null;
                if (copyGeoCodedAddress!= null) {
                    List<GeoCodedAddress> uniqueGeoCodedAddressl = copy.getGeoCodedAddress();
                    uniqueGeoCodedAddressl.addAll(copyGeoCodedAddress);
                }
            } else {
                copy.geoCodedAddress = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new GeoCodedAddressList();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GeoCodedAddressList that = ((GeoCodedAddressList) object);
        {
            List<GeoCodedAddress> lhsGeoCodedAddress;
            lhsGeoCodedAddress = (((this.geoCodedAddress!= null)&&(!this.geoCodedAddress.isEmpty()))?this.getGeoCodedAddress():null);
            List<GeoCodedAddress> rhsGeoCodedAddress;
            rhsGeoCodedAddress = (((that.geoCodedAddress!= null)&&(!that.geoCodedAddress.isEmpty()))?that.getGeoCodedAddress():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geoCodedAddress", lhsGeoCodedAddress), LocatorUtils.property(thatLocator, "geoCodedAddress", rhsGeoCodedAddress), lhsGeoCodedAddress, rhsGeoCodedAddress)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
