
package org.openestate.is24.restapi.xml.gis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
import org.openestate.is24.restapi.xml.Adapter5;


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
 *         &lt;element name="regionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="cityId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="districtId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="neighbourhoodId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="gkz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "regionId",
    "cityId",
    "districtId",
    "postalCode",
    "neighbourhoodId",
    "gkz"
})
@XmlRootElement(name = "geoHierarchyInfo")
public class GeoHierarchyInfo
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long regionId;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long cityId;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected Long districtId;
    protected String postalCode;
    protected Long neighbourhoodId;
    protected String gkz;

    /**
     * Gets the value of the regionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getRegionId() {
        return regionId;
    }

    /**
     * Sets the value of the regionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionId(Long value) {
        this.regionId = value;
    }

    /**
     * Gets the value of the cityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCityId() {
        return cityId;
    }

    /**
     * Sets the value of the cityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityId(Long value) {
        this.cityId = value;
    }

    /**
     * Gets the value of the districtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getDistrictId() {
        return districtId;
    }

    /**
     * Sets the value of the districtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictId(Long value) {
        this.districtId = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the neighbourhoodId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNeighbourhoodId() {
        return neighbourhoodId;
    }

    /**
     * Sets the value of the neighbourhoodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNeighbourhoodId(Long value) {
        this.neighbourhoodId = value;
    }

    /**
     * Gets the value of the gkz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGkz() {
        return gkz;
    }

    /**
     * Sets the value of the gkz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGkz(String value) {
        this.gkz = value;
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
            Long theRegionId;
            theRegionId = this.getRegionId();
            strategy.appendField(locator, this, "regionId", buffer, theRegionId);
        }
        {
            Long theCityId;
            theCityId = this.getCityId();
            strategy.appendField(locator, this, "cityId", buffer, theCityId);
        }
        {
            Long theDistrictId;
            theDistrictId = this.getDistrictId();
            strategy.appendField(locator, this, "districtId", buffer, theDistrictId);
        }
        {
            String thePostalCode;
            thePostalCode = this.getPostalCode();
            strategy.appendField(locator, this, "postalCode", buffer, thePostalCode);
        }
        {
            Long theNeighbourhoodId;
            theNeighbourhoodId = this.getNeighbourhoodId();
            strategy.appendField(locator, this, "neighbourhoodId", buffer, theNeighbourhoodId);
        }
        {
            String theGkz;
            theGkz = this.getGkz();
            strategy.appendField(locator, this, "gkz", buffer, theGkz);
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
        if (draftCopy instanceof GeoHierarchyInfo) {
            final GeoHierarchyInfo copy = ((GeoHierarchyInfo) draftCopy);
            if (this.regionId!= null) {
                Long sourceRegionId;
                sourceRegionId = this.getRegionId();
                Long copyRegionId = ((Long) strategy.copy(LocatorUtils.property(locator, "regionId", sourceRegionId), sourceRegionId));
                copy.setRegionId(copyRegionId);
            } else {
                copy.regionId = null;
            }
            if (this.cityId!= null) {
                Long sourceCityId;
                sourceCityId = this.getCityId();
                Long copyCityId = ((Long) strategy.copy(LocatorUtils.property(locator, "cityId", sourceCityId), sourceCityId));
                copy.setCityId(copyCityId);
            } else {
                copy.cityId = null;
            }
            if (this.districtId!= null) {
                Long sourceDistrictId;
                sourceDistrictId = this.getDistrictId();
                Long copyDistrictId = ((Long) strategy.copy(LocatorUtils.property(locator, "districtId", sourceDistrictId), sourceDistrictId));
                copy.setDistrictId(copyDistrictId);
            } else {
                copy.districtId = null;
            }
            if (this.postalCode!= null) {
                String sourcePostalCode;
                sourcePostalCode = this.getPostalCode();
                String copyPostalCode = ((String) strategy.copy(LocatorUtils.property(locator, "postalCode", sourcePostalCode), sourcePostalCode));
                copy.setPostalCode(copyPostalCode);
            } else {
                copy.postalCode = null;
            }
            if (this.neighbourhoodId!= null) {
                Long sourceNeighbourhoodId;
                sourceNeighbourhoodId = this.getNeighbourhoodId();
                Long copyNeighbourhoodId = ((Long) strategy.copy(LocatorUtils.property(locator, "neighbourhoodId", sourceNeighbourhoodId), sourceNeighbourhoodId));
                copy.setNeighbourhoodId(copyNeighbourhoodId);
            } else {
                copy.neighbourhoodId = null;
            }
            if (this.gkz!= null) {
                String sourceGkz;
                sourceGkz = this.getGkz();
                String copyGkz = ((String) strategy.copy(LocatorUtils.property(locator, "gkz", sourceGkz), sourceGkz));
                copy.setGkz(copyGkz);
            } else {
                copy.gkz = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new GeoHierarchyInfo();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GeoHierarchyInfo that = ((GeoHierarchyInfo) object);
        {
            Long lhsRegionId;
            lhsRegionId = this.getRegionId();
            Long rhsRegionId;
            rhsRegionId = that.getRegionId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "regionId", lhsRegionId), LocatorUtils.property(thatLocator, "regionId", rhsRegionId), lhsRegionId, rhsRegionId)) {
                return false;
            }
        }
        {
            Long lhsCityId;
            lhsCityId = this.getCityId();
            Long rhsCityId;
            rhsCityId = that.getCityId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cityId", lhsCityId), LocatorUtils.property(thatLocator, "cityId", rhsCityId), lhsCityId, rhsCityId)) {
                return false;
            }
        }
        {
            Long lhsDistrictId;
            lhsDistrictId = this.getDistrictId();
            Long rhsDistrictId;
            rhsDistrictId = that.getDistrictId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "districtId", lhsDistrictId), LocatorUtils.property(thatLocator, "districtId", rhsDistrictId), lhsDistrictId, rhsDistrictId)) {
                return false;
            }
        }
        {
            String lhsPostalCode;
            lhsPostalCode = this.getPostalCode();
            String rhsPostalCode;
            rhsPostalCode = that.getPostalCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postalCode", lhsPostalCode), LocatorUtils.property(thatLocator, "postalCode", rhsPostalCode), lhsPostalCode, rhsPostalCode)) {
                return false;
            }
        }
        {
            Long lhsNeighbourhoodId;
            lhsNeighbourhoodId = this.getNeighbourhoodId();
            Long rhsNeighbourhoodId;
            rhsNeighbourhoodId = that.getNeighbourhoodId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "neighbourhoodId", lhsNeighbourhoodId), LocatorUtils.property(thatLocator, "neighbourhoodId", rhsNeighbourhoodId), lhsNeighbourhoodId, rhsNeighbourhoodId)) {
                return false;
            }
        }
        {
            String lhsGkz;
            lhsGkz = this.getGkz();
            String rhsGkz;
            rhsGkz = that.getGkz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gkz", lhsGkz), LocatorUtils.property(thatLocator, "gkz", rhsGkz), lhsGkz, rhsGkz)) {
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
