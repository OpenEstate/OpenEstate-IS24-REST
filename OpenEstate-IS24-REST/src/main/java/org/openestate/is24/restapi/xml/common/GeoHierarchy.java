
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * Die Geo-Hierarchie-Informationen.
 * 
 * <p>Java class for GeoHierarchy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoHierarchy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="continent" type="{http://rest.immobilienscout24.de/schema/common/1.0}Continent" minOccurs="0"/&gt;
 *         &lt;element name="country" type="{http://rest.immobilienscout24.de/schema/common/1.0}Country"/&gt;
 *         &lt;element name="region" type="{http://rest.immobilienscout24.de/schema/common/1.0}Region"/&gt;
 *         &lt;element name="city" type="{http://rest.immobilienscout24.de/schema/common/1.0}City"/&gt;
 *         &lt;element name="quarter" type="{http://rest.immobilienscout24.de/schema/common/1.0}Quarter"/&gt;
 *         &lt;element name="neighbourhood" type="{http://rest.immobilienscout24.de/schema/common/1.0}Neighbourhood" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoHierarchy", propOrder = {
    "continent",
    "country",
    "region",
    "city",
    "quarter",
    "neighbourhood"
})
public class GeoHierarchy implements Cloneable, CopyTo2, Equals2, ToString2
{

    protected Continent continent;
    @XmlElement(required = true)
    protected Country country;
    @XmlElement(required = true)
    protected Region region;
    @XmlElement(required = true)
    protected City city;
    @XmlElement(required = true)
    protected Quarter quarter;
    protected Neighbourhood neighbourhood;

    /**
     * Gets the value of the continent property.
     * 
     * @return
     *     possible object is
     *     {@link Continent }
     *     
     */
    public Continent getContinent() {
        return continent;
    }

    /**
     * Sets the value of the continent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Continent }
     *     
     */
    public void setContinent(Continent value) {
        this.continent = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link Region }
     *     
     */
    public Region getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link Region }
     *     
     */
    public void setRegion(Region value) {
        this.region = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link City }
     *     
     */
    public City getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link City }
     *     
     */
    public void setCity(City value) {
        this.city = value;
    }

    /**
     * Gets the value of the quarter property.
     * 
     * @return
     *     possible object is
     *     {@link Quarter }
     *     
     */
    public Quarter getQuarter() {
        return quarter;
    }

    /**
     * Sets the value of the quarter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quarter }
     *     
     */
    public void setQuarter(Quarter value) {
        this.quarter = value;
    }

    /**
     * Gets the value of the neighbourhood property.
     * 
     * @return
     *     possible object is
     *     {@link Neighbourhood }
     *     
     */
    public Neighbourhood getNeighbourhood() {
        return neighbourhood;
    }

    /**
     * Sets the value of the neighbourhood property.
     * 
     * @param value
     *     allowed object is
     *     {@link Neighbourhood }
     *     
     */
    public void setNeighbourhood(Neighbourhood value) {
        this.neighbourhood = value;
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
        {
            Continent theContinent;
            theContinent = this.getContinent();
            strategy.appendField(locator, this, "continent", buffer, theContinent, (this.continent!= null));
        }
        {
            Country theCountry;
            theCountry = this.getCountry();
            strategy.appendField(locator, this, "country", buffer, theCountry, (this.country!= null));
        }
        {
            Region theRegion;
            theRegion = this.getRegion();
            strategy.appendField(locator, this, "region", buffer, theRegion, (this.region!= null));
        }
        {
            City theCity;
            theCity = this.getCity();
            strategy.appendField(locator, this, "city", buffer, theCity, (this.city!= null));
        }
        {
            Quarter theQuarter;
            theQuarter = this.getQuarter();
            strategy.appendField(locator, this, "quarter", buffer, theQuarter, (this.quarter!= null));
        }
        {
            Neighbourhood theNeighbourhood;
            theNeighbourhood = this.getNeighbourhood();
            strategy.appendField(locator, this, "neighbourhood", buffer, theNeighbourhood, (this.neighbourhood!= null));
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
        if (draftCopy instanceof GeoHierarchy) {
            final GeoHierarchy copy = ((GeoHierarchy) draftCopy);
            {
                Boolean continentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.continent!= null));
                if (continentShouldBeCopiedAndSet == Boolean.TRUE) {
                    Continent sourceContinent;
                    sourceContinent = this.getContinent();
                    Continent copyContinent = ((Continent) strategy.copy(LocatorUtils.property(locator, "continent", sourceContinent), sourceContinent, (this.continent!= null)));
                    copy.setContinent(copyContinent);
                } else {
                    if (continentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.continent = null;
                    }
                }
            }
            {
                Boolean countryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.country!= null));
                if (countryShouldBeCopiedAndSet == Boolean.TRUE) {
                    Country sourceCountry;
                    sourceCountry = this.getCountry();
                    Country copyCountry = ((Country) strategy.copy(LocatorUtils.property(locator, "country", sourceCountry), sourceCountry, (this.country!= null)));
                    copy.setCountry(copyCountry);
                } else {
                    if (countryShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.country = null;
                    }
                }
            }
            {
                Boolean regionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.region!= null));
                if (regionShouldBeCopiedAndSet == Boolean.TRUE) {
                    Region sourceRegion;
                    sourceRegion = this.getRegion();
                    Region copyRegion = ((Region) strategy.copy(LocatorUtils.property(locator, "region", sourceRegion), sourceRegion, (this.region!= null)));
                    copy.setRegion(copyRegion);
                } else {
                    if (regionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.region = null;
                    }
                }
            }
            {
                Boolean cityShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.city!= null));
                if (cityShouldBeCopiedAndSet == Boolean.TRUE) {
                    City sourceCity;
                    sourceCity = this.getCity();
                    City copyCity = ((City) strategy.copy(LocatorUtils.property(locator, "city", sourceCity), sourceCity, (this.city!= null)));
                    copy.setCity(copyCity);
                } else {
                    if (cityShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.city = null;
                    }
                }
            }
            {
                Boolean quarterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.quarter!= null));
                if (quarterShouldBeCopiedAndSet == Boolean.TRUE) {
                    Quarter sourceQuarter;
                    sourceQuarter = this.getQuarter();
                    Quarter copyQuarter = ((Quarter) strategy.copy(LocatorUtils.property(locator, "quarter", sourceQuarter), sourceQuarter, (this.quarter!= null)));
                    copy.setQuarter(copyQuarter);
                } else {
                    if (quarterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.quarter = null;
                    }
                }
            }
            {
                Boolean neighbourhoodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.neighbourhood!= null));
                if (neighbourhoodShouldBeCopiedAndSet == Boolean.TRUE) {
                    Neighbourhood sourceNeighbourhood;
                    sourceNeighbourhood = this.getNeighbourhood();
                    Neighbourhood copyNeighbourhood = ((Neighbourhood) strategy.copy(LocatorUtils.property(locator, "neighbourhood", sourceNeighbourhood), sourceNeighbourhood, (this.neighbourhood!= null)));
                    copy.setNeighbourhood(copyNeighbourhood);
                } else {
                    if (neighbourhoodShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.neighbourhood = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new GeoHierarchy();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GeoHierarchy that = ((GeoHierarchy) object);
        {
            Continent lhsContinent;
            lhsContinent = this.getContinent();
            Continent rhsContinent;
            rhsContinent = that.getContinent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "continent", lhsContinent), LocatorUtils.property(thatLocator, "continent", rhsContinent), lhsContinent, rhsContinent, (this.continent!= null), (that.continent!= null))) {
                return false;
            }
        }
        {
            Country lhsCountry;
            lhsCountry = this.getCountry();
            Country rhsCountry;
            rhsCountry = that.getCountry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "country", lhsCountry), LocatorUtils.property(thatLocator, "country", rhsCountry), lhsCountry, rhsCountry, (this.country!= null), (that.country!= null))) {
                return false;
            }
        }
        {
            Region lhsRegion;
            lhsRegion = this.getRegion();
            Region rhsRegion;
            rhsRegion = that.getRegion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "region", lhsRegion), LocatorUtils.property(thatLocator, "region", rhsRegion), lhsRegion, rhsRegion, (this.region!= null), (that.region!= null))) {
                return false;
            }
        }
        {
            City lhsCity;
            lhsCity = this.getCity();
            City rhsCity;
            rhsCity = that.getCity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "city", lhsCity), LocatorUtils.property(thatLocator, "city", rhsCity), lhsCity, rhsCity, (this.city!= null), (that.city!= null))) {
                return false;
            }
        }
        {
            Quarter lhsQuarter;
            lhsQuarter = this.getQuarter();
            Quarter rhsQuarter;
            rhsQuarter = that.getQuarter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quarter", lhsQuarter), LocatorUtils.property(thatLocator, "quarter", rhsQuarter), lhsQuarter, rhsQuarter, (this.quarter!= null), (that.quarter!= null))) {
                return false;
            }
        }
        {
            Neighbourhood lhsNeighbourhood;
            lhsNeighbourhood = this.getNeighbourhood();
            Neighbourhood rhsNeighbourhood;
            rhsNeighbourhood = that.getNeighbourhood();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "neighbourhood", lhsNeighbourhood), LocatorUtils.property(thatLocator, "neighbourhood", rhsNeighbourhood), lhsNeighbourhood, rhsNeighbourhood, (this.neighbourhood!= null), (that.neighbourhood!= null))) {
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
