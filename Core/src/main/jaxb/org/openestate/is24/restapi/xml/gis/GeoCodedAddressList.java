
package org.openestate.is24.restapi.xml.gis;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy2;
import org.jvnet.jaxb2_commons.lang.CopyTo2;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
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
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
public class GeoCodedAddressList implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
    public List<GeoCodedAddress> getGeoCodedAddress() {
        if (geoCodedAddress == null) {
            geoCodedAddress = new ArrayList<GeoCodedAddress>();
        }
        return this.geoCodedAddress;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            List<GeoCodedAddress> theGeoCodedAddress;
            theGeoCodedAddress = (((this.geoCodedAddress!= null)&&(!this.geoCodedAddress.isEmpty()))?this.getGeoCodedAddress():null);
            strategy.appendField(locator, this, "geoCodedAddress", buffer, theGeoCodedAddress, ((this.geoCodedAddress!= null)&&(!this.geoCodedAddress.isEmpty())));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof GeoCodedAddressList) {
            final GeoCodedAddressList copy = ((GeoCodedAddressList) draftCopy);
            {
                Boolean geoCodedAddressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.geoCodedAddress!= null)&&(!this.geoCodedAddress.isEmpty())));
                if (geoCodedAddressShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<GeoCodedAddress> sourceGeoCodedAddress;
                    sourceGeoCodedAddress = (((this.geoCodedAddress!= null)&&(!this.geoCodedAddress.isEmpty()))?this.getGeoCodedAddress():null);
                    @SuppressWarnings("unchecked")
                    List<GeoCodedAddress> copyGeoCodedAddress = ((List<GeoCodedAddress> ) strategy.copy(LocatorUtils.property(locator, "geoCodedAddress", sourceGeoCodedAddress), sourceGeoCodedAddress, ((this.geoCodedAddress!= null)&&(!this.geoCodedAddress.isEmpty()))));
                    copy.geoCodedAddress = null;
                    if (copyGeoCodedAddress!= null) {
                        List<GeoCodedAddress> uniqueGeoCodedAddressl = copy.getGeoCodedAddress();
                        uniqueGeoCodedAddressl.addAll(copyGeoCodedAddress);
                    }
                } else {
                    if (geoCodedAddressShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geoCodedAddress = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new GeoCodedAddressList();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geoCodedAddress", lhsGeoCodedAddress), LocatorUtils.property(thatLocator, "geoCodedAddress", rhsGeoCodedAddress), lhsGeoCodedAddress, rhsGeoCodedAddress, ((this.geoCodedAddress!= null)&&(!this.geoCodedAddress.isEmpty())), ((that.geoCodedAddress!= null)&&(!that.geoCodedAddress.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:58:15+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
