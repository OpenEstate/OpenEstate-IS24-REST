
package org.openestate.is24.restapi.xml.gis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
import org.openestate.is24.restapi.xml.common.Address;
import org.openestate.is24.restapi.xml.common.GeoCodingPrecisionType;
import org.openestate.is24.restapi.xml.common.GeoHierarchy;
import org.openestate.is24.restapi.xml.common.Wgs84Coordinate;


/**
 * Eine Adresse mit zugeh\u00f6riger Geokodierungs-Information.
 * 
 * <p>Java class for GeoCodedAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoCodedAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://rest.immobilienscout24.de/schema/common/1.0}Address"/&gt;
 *         &lt;element name="wgs84Coordinate" type="{http://rest.immobilienscout24.de/schema/common/1.0}Wgs84Coordinate"/&gt;
 *         &lt;element name="geoCodingPrecision" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoCodingPrecisionType"/&gt;
 *         &lt;element name="geoCodingHierarchy" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoHierarchy"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoCodedAddress", propOrder = {
    "address",
    "wgs84Coordinate",
    "geoCodingPrecision",
    "geoCodingHierarchy"
})
public class GeoCodedAddress
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    protected Address address;
    @XmlElement(required = true)
    protected Wgs84Coordinate wgs84Coordinate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected GeoCodingPrecisionType geoCodingPrecision;
    @XmlElement(required = true)
    protected GeoHierarchy geoCodingHierarchy;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the wgs84Coordinate property.
     * 
     * @return
     *     possible object is
     *     {@link Wgs84Coordinate }
     *     
     */
    public Wgs84Coordinate getWgs84Coordinate() {
        return wgs84Coordinate;
    }

    /**
     * Sets the value of the wgs84Coordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wgs84Coordinate }
     *     
     */
    public void setWgs84Coordinate(Wgs84Coordinate value) {
        this.wgs84Coordinate = value;
    }

    /**
     * Gets the value of the geoCodingPrecision property.
     * 
     * @return
     *     possible object is
     *     {@link GeoCodingPrecisionType }
     *     
     */
    public GeoCodingPrecisionType getGeoCodingPrecision() {
        return geoCodingPrecision;
    }

    /**
     * Sets the value of the geoCodingPrecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoCodingPrecisionType }
     *     
     */
    public void setGeoCodingPrecision(GeoCodingPrecisionType value) {
        this.geoCodingPrecision = value;
    }

    /**
     * Gets the value of the geoCodingHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link GeoHierarchy }
     *     
     */
    public GeoHierarchy getGeoCodingHierarchy() {
        return geoCodingHierarchy;
    }

    /**
     * Sets the value of the geoCodingHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoHierarchy }
     *     
     */
    public void setGeoCodingHierarchy(GeoHierarchy value) {
        this.geoCodingHierarchy = value;
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
            Address theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress);
        }
        {
            Wgs84Coordinate theWgs84Coordinate;
            theWgs84Coordinate = this.getWgs84Coordinate();
            strategy.appendField(locator, this, "wgs84Coordinate", buffer, theWgs84Coordinate);
        }
        {
            GeoCodingPrecisionType theGeoCodingPrecision;
            theGeoCodingPrecision = this.getGeoCodingPrecision();
            strategy.appendField(locator, this, "geoCodingPrecision", buffer, theGeoCodingPrecision);
        }
        {
            GeoHierarchy theGeoCodingHierarchy;
            theGeoCodingHierarchy = this.getGeoCodingHierarchy();
            strategy.appendField(locator, this, "geoCodingHierarchy", buffer, theGeoCodingHierarchy);
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
        if (draftCopy instanceof GeoCodedAddress) {
            final GeoCodedAddress copy = ((GeoCodedAddress) draftCopy);
            if (this.address!= null) {
                Address sourceAddress;
                sourceAddress = this.getAddress();
                Address copyAddress = ((Address) strategy.copy(LocatorUtils.property(locator, "address", sourceAddress), sourceAddress));
                copy.setAddress(copyAddress);
            } else {
                copy.address = null;
            }
            if (this.wgs84Coordinate!= null) {
                Wgs84Coordinate sourceWgs84Coordinate;
                sourceWgs84Coordinate = this.getWgs84Coordinate();
                Wgs84Coordinate copyWgs84Coordinate = ((Wgs84Coordinate) strategy.copy(LocatorUtils.property(locator, "wgs84Coordinate", sourceWgs84Coordinate), sourceWgs84Coordinate));
                copy.setWgs84Coordinate(copyWgs84Coordinate);
            } else {
                copy.wgs84Coordinate = null;
            }
            if (this.geoCodingPrecision!= null) {
                GeoCodingPrecisionType sourceGeoCodingPrecision;
                sourceGeoCodingPrecision = this.getGeoCodingPrecision();
                GeoCodingPrecisionType copyGeoCodingPrecision = ((GeoCodingPrecisionType) strategy.copy(LocatorUtils.property(locator, "geoCodingPrecision", sourceGeoCodingPrecision), sourceGeoCodingPrecision));
                copy.setGeoCodingPrecision(copyGeoCodingPrecision);
            } else {
                copy.geoCodingPrecision = null;
            }
            if (this.geoCodingHierarchy!= null) {
                GeoHierarchy sourceGeoCodingHierarchy;
                sourceGeoCodingHierarchy = this.getGeoCodingHierarchy();
                GeoHierarchy copyGeoCodingHierarchy = ((GeoHierarchy) strategy.copy(LocatorUtils.property(locator, "geoCodingHierarchy", sourceGeoCodingHierarchy), sourceGeoCodingHierarchy));
                copy.setGeoCodingHierarchy(copyGeoCodingHierarchy);
            } else {
                copy.geoCodingHierarchy = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new GeoCodedAddress();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GeoCodedAddress that = ((GeoCodedAddress) object);
        {
            Address lhsAddress;
            lhsAddress = this.getAddress();
            Address rhsAddress;
            rhsAddress = that.getAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress)) {
                return false;
            }
        }
        {
            Wgs84Coordinate lhsWgs84Coordinate;
            lhsWgs84Coordinate = this.getWgs84Coordinate();
            Wgs84Coordinate rhsWgs84Coordinate;
            rhsWgs84Coordinate = that.getWgs84Coordinate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wgs84Coordinate", lhsWgs84Coordinate), LocatorUtils.property(thatLocator, "wgs84Coordinate", rhsWgs84Coordinate), lhsWgs84Coordinate, rhsWgs84Coordinate)) {
                return false;
            }
        }
        {
            GeoCodingPrecisionType lhsGeoCodingPrecision;
            lhsGeoCodingPrecision = this.getGeoCodingPrecision();
            GeoCodingPrecisionType rhsGeoCodingPrecision;
            rhsGeoCodingPrecision = that.getGeoCodingPrecision();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geoCodingPrecision", lhsGeoCodingPrecision), LocatorUtils.property(thatLocator, "geoCodingPrecision", rhsGeoCodingPrecision), lhsGeoCodingPrecision, rhsGeoCodingPrecision)) {
                return false;
            }
        }
        {
            GeoHierarchy lhsGeoCodingHierarchy;
            lhsGeoCodingHierarchy = this.getGeoCodingHierarchy();
            GeoHierarchy rhsGeoCodingHierarchy;
            rhsGeoCodingHierarchy = that.getGeoCodingHierarchy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geoCodingHierarchy", lhsGeoCodingHierarchy), LocatorUtils.property(thatLocator, "geoCodingHierarchy", rhsGeoCodingHierarchy), lhsGeoCodingHierarchy, rhsGeoCodingHierarchy)) {
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
