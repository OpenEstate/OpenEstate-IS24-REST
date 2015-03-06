
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * Liste der IS24 Geo-Ids.
 * 
 * <p>Java class for GeoInfoNodeCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoInfoNodeCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="continentId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="countryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="regionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="districtId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="label" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoInfoNodeCriteria", propOrder = {

})
public class GeoInfoNodeCriteria
    implements Cloneable, CopyTo, Equals, ToString
{

    protected long continentId;
    protected long countryId;
    protected Long regionId;
    protected Long cityId;
    protected Long districtId;
    protected String label;

    /**
     * Gets the value of the continentId property.
     * 
     */
    public long getContinentId() {
        return continentId;
    }

    /**
     * Sets the value of the continentId property.
     * 
     */
    public void setContinentId(long value) {
        this.continentId = value;
    }

    /**
     * Gets the value of the countryId property.
     * 
     */
    public long getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     */
    public void setCountryId(long value) {
        this.countryId = value;
    }

    /**
     * Gets the value of the regionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
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
     *     {@link Long }
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
     *     {@link Long }
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
     *     {@link Long }
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
     *     {@link Long }
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
     *     {@link Long }
     *     
     */
    public void setDistrictId(Long value) {
        this.districtId = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
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
            long theContinentId;
            theContinentId = this.getContinentId();
            strategy.appendField(locator, this, "continentId", buffer, theContinentId);
        }
        {
            long theCountryId;
            theCountryId = this.getCountryId();
            strategy.appendField(locator, this, "countryId", buffer, theCountryId);
        }
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
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel);
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
        if (draftCopy instanceof GeoInfoNodeCriteria) {
            final GeoInfoNodeCriteria copy = ((GeoInfoNodeCriteria) draftCopy);
            {
                long sourceContinentId;
                sourceContinentId = this.getContinentId();
                long copyContinentId = strategy.copy(LocatorUtils.property(locator, "continentId", sourceContinentId), sourceContinentId);
                copy.setContinentId(copyContinentId);
            }
            {
                long sourceCountryId;
                sourceCountryId = this.getCountryId();
                long copyCountryId = strategy.copy(LocatorUtils.property(locator, "countryId", sourceCountryId), sourceCountryId);
                copy.setCountryId(copyCountryId);
            }
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
            if (this.label!= null) {
                String sourceLabel;
                sourceLabel = this.getLabel();
                String copyLabel = ((String) strategy.copy(LocatorUtils.property(locator, "label", sourceLabel), sourceLabel));
                copy.setLabel(copyLabel);
            } else {
                copy.label = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new GeoInfoNodeCriteria();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GeoInfoNodeCriteria)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GeoInfoNodeCriteria that = ((GeoInfoNodeCriteria) object);
        {
            long lhsContinentId;
            lhsContinentId = this.getContinentId();
            long rhsContinentId;
            rhsContinentId = that.getContinentId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "continentId", lhsContinentId), LocatorUtils.property(thatLocator, "continentId", rhsContinentId), lhsContinentId, rhsContinentId)) {
                return false;
            }
        }
        {
            long lhsCountryId;
            lhsCountryId = this.getCountryId();
            long rhsCountryId;
            rhsCountryId = that.getCountryId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countryId", lhsCountryId), LocatorUtils.property(thatLocator, "countryId", rhsCountryId), lhsCountryId, rhsCountryId)) {
                return false;
            }
        }
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
            String lhsLabel;
            lhsLabel = this.getLabel();
            String rhsLabel;
            rhsLabel = that.getLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "label", lhsLabel), LocatorUtils.property(thatLocator, "label", rhsLabel), lhsLabel, rhsLabel)) {
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
