
package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * Adresse erweitert mit WGS84 Geokoordinaten.
 * 
 * Definition der Basisfelder einer Adresse.
 * 
 * <p>Java class for Wgs84Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Wgs84Address"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}Address"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="quarter" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" minOccurs="0"/&gt;
 *         &lt;element name="wgs84Coordinate" type="{http://rest.immobilienscout24.de/schema/common/1.0}Wgs84Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="preciseHouseNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="geoHierarchy" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoHierarchy" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://rest.immobilienscout24.de/schema/common/1.0}Wgs84AddressDescription" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Wgs84Address", propOrder = {
    "quarter",
    "wgs84Coordinate",
    "preciseHouseNumber",
    "geoHierarchy",
    "description"
})
public class Wgs84Address
    extends Address
    implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    protected String quarter;
    protected Wgs84Coordinate wgs84Coordinate;
    protected Boolean preciseHouseNumber;
    protected GeoHierarchy geoHierarchy;
    protected Wgs84AddressDescription description;

    /**
     * Gets the value of the quarter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuarter() {
        return quarter;
    }

    /**
     * Sets the value of the quarter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuarter(String value) {
        this.quarter = value;
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
     * Gets the value of the preciseHouseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreciseHouseNumber() {
        return preciseHouseNumber;
    }

    /**
     * Sets the value of the preciseHouseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreciseHouseNumber(Boolean value) {
        this.preciseHouseNumber = value;
    }

    /**
     * Gets the value of the geoHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link GeoHierarchy }
     *     
     */
    public GeoHierarchy getGeoHierarchy() {
        return geoHierarchy;
    }

    /**
     * Sets the value of the geoHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoHierarchy }
     *     
     */
    public void setGeoHierarchy(GeoHierarchy value) {
        this.geoHierarchy = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Wgs84AddressDescription }
     *     
     */
    public Wgs84AddressDescription getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wgs84AddressDescription }
     *     
     */
    public void setDescription(Wgs84AddressDescription value) {
        this.description = value;
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            String theQuarter;
            theQuarter = this.getQuarter();
            strategy.appendField(locator, this, "quarter", buffer, theQuarter, (this.quarter!= null));
        }
        {
            Wgs84Coordinate theWgs84Coordinate;
            theWgs84Coordinate = this.getWgs84Coordinate();
            strategy.appendField(locator, this, "wgs84Coordinate", buffer, theWgs84Coordinate, (this.wgs84Coordinate!= null));
        }
        {
            Boolean thePreciseHouseNumber;
            thePreciseHouseNumber = this.isPreciseHouseNumber();
            strategy.appendField(locator, this, "preciseHouseNumber", buffer, thePreciseHouseNumber, (this.preciseHouseNumber!= null));
        }
        {
            GeoHierarchy theGeoHierarchy;
            theGeoHierarchy = this.getGeoHierarchy();
            strategy.appendField(locator, this, "geoHierarchy", buffer, theGeoHierarchy, (this.geoHierarchy!= null));
        }
        {
            Wgs84AddressDescription theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof Wgs84Address) {
            final Wgs84Address copy = ((Wgs84Address) draftCopy);
            {
                Boolean quarterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.quarter!= null));
                if (quarterShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceQuarter;
                    sourceQuarter = this.getQuarter();
                    String copyQuarter = ((String) strategy.copy(LocatorUtils.property(locator, "quarter", sourceQuarter), sourceQuarter, (this.quarter!= null)));
                    copy.setQuarter(copyQuarter);
                } else {
                    if (quarterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.quarter = null;
                    }
                }
            }
            {
                Boolean wgs84CoordinateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wgs84Coordinate!= null));
                if (wgs84CoordinateShouldBeCopiedAndSet == Boolean.TRUE) {
                    Wgs84Coordinate sourceWgs84Coordinate;
                    sourceWgs84Coordinate = this.getWgs84Coordinate();
                    Wgs84Coordinate copyWgs84Coordinate = ((Wgs84Coordinate) strategy.copy(LocatorUtils.property(locator, "wgs84Coordinate", sourceWgs84Coordinate), sourceWgs84Coordinate, (this.wgs84Coordinate!= null)));
                    copy.setWgs84Coordinate(copyWgs84Coordinate);
                } else {
                    if (wgs84CoordinateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wgs84Coordinate = null;
                    }
                }
            }
            {
                Boolean preciseHouseNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.preciseHouseNumber!= null));
                if (preciseHouseNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourcePreciseHouseNumber;
                    sourcePreciseHouseNumber = this.isPreciseHouseNumber();
                    Boolean copyPreciseHouseNumber = ((Boolean) strategy.copy(LocatorUtils.property(locator, "preciseHouseNumber", sourcePreciseHouseNumber), sourcePreciseHouseNumber, (this.preciseHouseNumber!= null)));
                    copy.setPreciseHouseNumber(copyPreciseHouseNumber);
                } else {
                    if (preciseHouseNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.preciseHouseNumber = null;
                    }
                }
            }
            {
                Boolean geoHierarchyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.geoHierarchy!= null));
                if (geoHierarchyShouldBeCopiedAndSet == Boolean.TRUE) {
                    GeoHierarchy sourceGeoHierarchy;
                    sourceGeoHierarchy = this.getGeoHierarchy();
                    GeoHierarchy copyGeoHierarchy = ((GeoHierarchy) strategy.copy(LocatorUtils.property(locator, "geoHierarchy", sourceGeoHierarchy), sourceGeoHierarchy, (this.geoHierarchy!= null)));
                    copy.setGeoHierarchy(copyGeoHierarchy);
                } else {
                    if (geoHierarchyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geoHierarchy = null;
                    }
                }
            }
            {
                Boolean descriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.description!= null));
                if (descriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    Wgs84AddressDescription sourceDescription;
                    sourceDescription = this.getDescription();
                    Wgs84AddressDescription copyDescription = ((Wgs84AddressDescription) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription, (this.description!= null)));
                    copy.setDescription(copyDescription);
                } else {
                    if (descriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.description = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Wgs84Address();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Wgs84Address that = ((Wgs84Address) object);
        {
            String lhsQuarter;
            lhsQuarter = this.getQuarter();
            String rhsQuarter;
            rhsQuarter = that.getQuarter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quarter", lhsQuarter), LocatorUtils.property(thatLocator, "quarter", rhsQuarter), lhsQuarter, rhsQuarter, (this.quarter!= null), (that.quarter!= null))) {
                return false;
            }
        }
        {
            Wgs84Coordinate lhsWgs84Coordinate;
            lhsWgs84Coordinate = this.getWgs84Coordinate();
            Wgs84Coordinate rhsWgs84Coordinate;
            rhsWgs84Coordinate = that.getWgs84Coordinate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wgs84Coordinate", lhsWgs84Coordinate), LocatorUtils.property(thatLocator, "wgs84Coordinate", rhsWgs84Coordinate), lhsWgs84Coordinate, rhsWgs84Coordinate, (this.wgs84Coordinate!= null), (that.wgs84Coordinate!= null))) {
                return false;
            }
        }
        {
            Boolean lhsPreciseHouseNumber;
            lhsPreciseHouseNumber = this.isPreciseHouseNumber();
            Boolean rhsPreciseHouseNumber;
            rhsPreciseHouseNumber = that.isPreciseHouseNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preciseHouseNumber", lhsPreciseHouseNumber), LocatorUtils.property(thatLocator, "preciseHouseNumber", rhsPreciseHouseNumber), lhsPreciseHouseNumber, rhsPreciseHouseNumber, (this.preciseHouseNumber!= null), (that.preciseHouseNumber!= null))) {
                return false;
            }
        }
        {
            GeoHierarchy lhsGeoHierarchy;
            lhsGeoHierarchy = this.getGeoHierarchy();
            GeoHierarchy rhsGeoHierarchy;
            rhsGeoHierarchy = that.getGeoHierarchy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geoHierarchy", lhsGeoHierarchy), LocatorUtils.property(thatLocator, "geoHierarchy", rhsGeoHierarchy), lhsGeoHierarchy, rhsGeoHierarchy, (this.geoHierarchy!= null), (that.geoHierarchy!= null))) {
                return false;
            }
        }
        {
            Wgs84AddressDescription lhsDescription;
            lhsDescription = this.getDescription();
            Wgs84AddressDescription rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, (this.description!= null), (that.description!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
