
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * Definition der Basisfelder einer Adresse.
 * 
 * <p>Java class for Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Address"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="street" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="houseNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="postcode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="city" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="internationalCountryRegion" type="{http://rest.immobilienscout24.de/schema/common/1.0}CountryRegion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "street",
    "houseNumber",
    "postcode",
    "city",
    "internationalCountryRegion"
})
@XmlSeeAlso({
    Wgs84Address.class
})
public class Address
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlJavaTypeAdapter(Adapter36 .class)
    protected String street;
    @XmlJavaTypeAdapter(Adapter37 .class)
    protected String houseNumber;
    @XmlJavaTypeAdapter(Adapter38 .class)
    protected String postcode;
    @XmlJavaTypeAdapter(Adapter39 .class)
    protected String city;
    protected CountryRegion internationalCountryRegion;

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the houseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the value of the houseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumber(String value) {
        this.houseNumber = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the internationalCountryRegion property.
     * 
     * @return
     *     possible object is
     *     {@link CountryRegion }
     *     
     */
    public CountryRegion getInternationalCountryRegion() {
        return internationalCountryRegion;
    }

    /**
     * Sets the value of the internationalCountryRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRegion }
     *     
     */
    public void setInternationalCountryRegion(CountryRegion value) {
        this.internationalCountryRegion = value;
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
            String theStreet;
            theStreet = this.getStreet();
            strategy.appendField(locator, this, "street", buffer, theStreet);
        }
        {
            String theHouseNumber;
            theHouseNumber = this.getHouseNumber();
            strategy.appendField(locator, this, "houseNumber", buffer, theHouseNumber);
        }
        {
            String thePostcode;
            thePostcode = this.getPostcode();
            strategy.appendField(locator, this, "postcode", buffer, thePostcode);
        }
        {
            String theCity;
            theCity = this.getCity();
            strategy.appendField(locator, this, "city", buffer, theCity);
        }
        {
            CountryRegion theInternationalCountryRegion;
            theInternationalCountryRegion = this.getInternationalCountryRegion();
            strategy.appendField(locator, this, "internationalCountryRegion", buffer, theInternationalCountryRegion);
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
        if (draftCopy instanceof Address) {
            final Address copy = ((Address) draftCopy);
            if (this.street!= null) {
                String sourceStreet;
                sourceStreet = this.getStreet();
                String copyStreet = ((String) strategy.copy(LocatorUtils.property(locator, "street", sourceStreet), sourceStreet));
                copy.setStreet(copyStreet);
            } else {
                copy.street = null;
            }
            if (this.houseNumber!= null) {
                String sourceHouseNumber;
                sourceHouseNumber = this.getHouseNumber();
                String copyHouseNumber = ((String) strategy.copy(LocatorUtils.property(locator, "houseNumber", sourceHouseNumber), sourceHouseNumber));
                copy.setHouseNumber(copyHouseNumber);
            } else {
                copy.houseNumber = null;
            }
            if (this.postcode!= null) {
                String sourcePostcode;
                sourcePostcode = this.getPostcode();
                String copyPostcode = ((String) strategy.copy(LocatorUtils.property(locator, "postcode", sourcePostcode), sourcePostcode));
                copy.setPostcode(copyPostcode);
            } else {
                copy.postcode = null;
            }
            if (this.city!= null) {
                String sourceCity;
                sourceCity = this.getCity();
                String copyCity = ((String) strategy.copy(LocatorUtils.property(locator, "city", sourceCity), sourceCity));
                copy.setCity(copyCity);
            } else {
                copy.city = null;
            }
            if (this.internationalCountryRegion!= null) {
                CountryRegion sourceInternationalCountryRegion;
                sourceInternationalCountryRegion = this.getInternationalCountryRegion();
                CountryRegion copyInternationalCountryRegion = ((CountryRegion) strategy.copy(LocatorUtils.property(locator, "internationalCountryRegion", sourceInternationalCountryRegion), sourceInternationalCountryRegion));
                copy.setInternationalCountryRegion(copyInternationalCountryRegion);
            } else {
                copy.internationalCountryRegion = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Address();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Address that = ((Address) object);
        {
            String lhsStreet;
            lhsStreet = this.getStreet();
            String rhsStreet;
            rhsStreet = that.getStreet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "street", lhsStreet), LocatorUtils.property(thatLocator, "street", rhsStreet), lhsStreet, rhsStreet)) {
                return false;
            }
        }
        {
            String lhsHouseNumber;
            lhsHouseNumber = this.getHouseNumber();
            String rhsHouseNumber;
            rhsHouseNumber = that.getHouseNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "houseNumber", lhsHouseNumber), LocatorUtils.property(thatLocator, "houseNumber", rhsHouseNumber), lhsHouseNumber, rhsHouseNumber)) {
                return false;
            }
        }
        {
            String lhsPostcode;
            lhsPostcode = this.getPostcode();
            String rhsPostcode;
            rhsPostcode = that.getPostcode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postcode", lhsPostcode), LocatorUtils.property(thatLocator, "postcode", rhsPostcode), lhsPostcode, rhsPostcode)) {
                return false;
            }
        }
        {
            String lhsCity;
            lhsCity = this.getCity();
            String rhsCity;
            rhsCity = that.getCity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "city", lhsCity), LocatorUtils.property(thatLocator, "city", rhsCity), lhsCity, rhsCity)) {
                return false;
            }
        }
        {
            CountryRegion lhsInternationalCountryRegion;
            lhsInternationalCountryRegion = this.getInternationalCountryRegion();
            CountryRegion rhsInternationalCountryRegion;
            rhsInternationalCountryRegion = that.getInternationalCountryRegion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "internationalCountryRegion", lhsInternationalCountryRegion), LocatorUtils.property(thatLocator, "internationalCountryRegion", rhsInternationalCountryRegion), lhsInternationalCountryRegion, rhsInternationalCountryRegion)) {
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
