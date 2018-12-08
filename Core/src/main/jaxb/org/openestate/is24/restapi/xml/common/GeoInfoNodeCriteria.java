
package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import javax.annotation.Generated;
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
 * Liste der IS24 Geo-Ids.
 * 
 * <p>Java class for GeoInfoNodeCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoInfoNodeCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="continentId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="countryId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="regionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="cityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="districtId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoInfoNodeCriteria", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
public class GeoInfoNodeCriteria implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected long continentId;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected long countryId;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Long regionId;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Long cityId;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected Long districtId;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected String label;

    /**
     * Gets the value of the continentId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public long getContinentId() {
        return continentId;
    }

    /**
     * Sets the value of the continentId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setContinentId(long value) {
        this.continentId = value;
    }

    /**
     * Gets the value of the countryId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public long getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setLabel(String value) {
        this.label = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            long theContinentId;
            theContinentId = this.getContinentId();
            strategy.appendField(locator, this, "continentId", buffer, theContinentId, true);
        }
        {
            long theCountryId;
            theCountryId = this.getCountryId();
            strategy.appendField(locator, this, "countryId", buffer, theCountryId, true);
        }
        {
            Long theRegionId;
            theRegionId = this.getRegionId();
            strategy.appendField(locator, this, "regionId", buffer, theRegionId, (this.regionId!= null));
        }
        {
            Long theCityId;
            theCityId = this.getCityId();
            strategy.appendField(locator, this, "cityId", buffer, theCityId, (this.cityId!= null));
        }
        {
            Long theDistrictId;
            theDistrictId = this.getDistrictId();
            strategy.appendField(locator, this, "districtId", buffer, theDistrictId, (this.districtId!= null));
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel, (this.label!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof GeoInfoNodeCriteria) {
            final GeoInfoNodeCriteria copy = ((GeoInfoNodeCriteria) draftCopy);
            {
                Boolean continentIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (continentIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    long sourceContinentId;
                    sourceContinentId = this.getContinentId();
                    long copyContinentId = strategy.copy(LocatorUtils.property(locator, "continentId", sourceContinentId), sourceContinentId, true);
                    copy.setContinentId(copyContinentId);
                } else {
                    if (continentIdShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean countryIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (countryIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    long sourceCountryId;
                    sourceCountryId = this.getCountryId();
                    long copyCountryId = strategy.copy(LocatorUtils.property(locator, "countryId", sourceCountryId), sourceCountryId, true);
                    copy.setCountryId(copyCountryId);
                } else {
                    if (countryIdShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean regionIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.regionId!= null));
                if (regionIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceRegionId;
                    sourceRegionId = this.getRegionId();
                    Long copyRegionId = ((Long) strategy.copy(LocatorUtils.property(locator, "regionId", sourceRegionId), sourceRegionId, (this.regionId!= null)));
                    copy.setRegionId(copyRegionId);
                } else {
                    if (regionIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.regionId = null;
                    }
                }
            }
            {
                Boolean cityIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.cityId!= null));
                if (cityIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceCityId;
                    sourceCityId = this.getCityId();
                    Long copyCityId = ((Long) strategy.copy(LocatorUtils.property(locator, "cityId", sourceCityId), sourceCityId, (this.cityId!= null)));
                    copy.setCityId(copyCityId);
                } else {
                    if (cityIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cityId = null;
                    }
                }
            }
            {
                Boolean districtIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.districtId!= null));
                if (districtIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceDistrictId;
                    sourceDistrictId = this.getDistrictId();
                    Long copyDistrictId = ((Long) strategy.copy(LocatorUtils.property(locator, "districtId", sourceDistrictId), sourceDistrictId, (this.districtId!= null)));
                    copy.setDistrictId(copyDistrictId);
                } else {
                    if (districtIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.districtId = null;
                    }
                }
            }
            {
                Boolean labelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.label!= null));
                if (labelShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLabel;
                    sourceLabel = this.getLabel();
                    String copyLabel = ((String) strategy.copy(LocatorUtils.property(locator, "label", sourceLabel), sourceLabel, (this.label!= null)));
                    copy.setLabel(copyLabel);
                } else {
                    if (labelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.label = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new GeoInfoNodeCriteria();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "continentId", lhsContinentId), LocatorUtils.property(thatLocator, "continentId", rhsContinentId), lhsContinentId, rhsContinentId, true, true)) {
                return false;
            }
        }
        {
            long lhsCountryId;
            lhsCountryId = this.getCountryId();
            long rhsCountryId;
            rhsCountryId = that.getCountryId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countryId", lhsCountryId), LocatorUtils.property(thatLocator, "countryId", rhsCountryId), lhsCountryId, rhsCountryId, true, true)) {
                return false;
            }
        }
        {
            Long lhsRegionId;
            lhsRegionId = this.getRegionId();
            Long rhsRegionId;
            rhsRegionId = that.getRegionId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "regionId", lhsRegionId), LocatorUtils.property(thatLocator, "regionId", rhsRegionId), lhsRegionId, rhsRegionId, (this.regionId!= null), (that.regionId!= null))) {
                return false;
            }
        }
        {
            Long lhsCityId;
            lhsCityId = this.getCityId();
            Long rhsCityId;
            rhsCityId = that.getCityId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cityId", lhsCityId), LocatorUtils.property(thatLocator, "cityId", rhsCityId), lhsCityId, rhsCityId, (this.cityId!= null), (that.cityId!= null))) {
                return false;
            }
        }
        {
            Long lhsDistrictId;
            lhsDistrictId = this.getDistrictId();
            Long rhsDistrictId;
            rhsDistrictId = that.getDistrictId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "districtId", lhsDistrictId), LocatorUtils.property(thatLocator, "districtId", rhsDistrictId), lhsDistrictId, rhsDistrictId, (this.districtId!= null), (that.districtId!= null))) {
                return false;
            }
        }
        {
            String lhsLabel;
            lhsLabel = this.getLabel();
            String rhsLabel;
            rhsLabel = that.getLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "label", lhsLabel), LocatorUtils.property(thatLocator, "label", rhsLabel), lhsLabel, rhsLabel, (this.label!= null), (that.label!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
