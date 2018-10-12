
package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * Definiert eine Region mit allen verf\u00fcgbaren Informationen.
 *             
 * 
 * <p>Java class for GeoHierarchyElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoHierarchyElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="geoCodeId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="fullGeoCodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statistics" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoHierarchyStatistics" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoHierarchyElement", propOrder = {
    "name",
    "geoCodeId",
    "fullGeoCodeId",
    "statistics"
})
@XmlSeeAlso({
    Continent.class,
    Country.class,
    Region.class,
    City.class,
    Quarter.class,
    Neighbourhood.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
public class GeoHierarchyElement implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected String name;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected long geoCodeId;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected String fullGeoCodeId;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected GeoHierarchyStatistics statistics;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the geoCodeId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public long getGeoCodeId() {
        return geoCodeId;
    }

    /**
     * Sets the value of the geoCodeId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setGeoCodeId(long value) {
        this.geoCodeId = value;
    }

    /**
     * Gets the value of the fullGeoCodeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public String getFullGeoCodeId() {
        return fullGeoCodeId;
    }

    /**
     * Sets the value of the fullGeoCodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setFullGeoCodeId(String value) {
        this.fullGeoCodeId = value;
    }

    /**
     * Gets the value of the statistics property.
     * 
     * @return
     *     possible object is
     *     {@link GeoHierarchyStatistics }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public GeoHierarchyStatistics getStatistics() {
        return statistics;
    }

    /**
     * Sets the value of the statistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoHierarchyStatistics }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setStatistics(GeoHierarchyStatistics value) {
        this.statistics = value;
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
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            long theGeoCodeId;
            theGeoCodeId = this.getGeoCodeId();
            strategy.appendField(locator, this, "geoCodeId", buffer, theGeoCodeId, true);
        }
        {
            String theFullGeoCodeId;
            theFullGeoCodeId = this.getFullGeoCodeId();
            strategy.appendField(locator, this, "fullGeoCodeId", buffer, theFullGeoCodeId, (this.fullGeoCodeId!= null));
        }
        {
            GeoHierarchyStatistics theStatistics;
            theStatistics = this.getStatistics();
            strategy.appendField(locator, this, "statistics", buffer, theStatistics, (this.statistics!= null));
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
        if (draftCopy instanceof GeoHierarchyElement) {
            final GeoHierarchyElement copy = ((GeoHierarchyElement) draftCopy);
            {
                Boolean nameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.name!= null));
                if (nameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceName;
                    sourceName = this.getName();
                    String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName, (this.name!= null)));
                    copy.setName(copyName);
                } else {
                    if (nameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.name = null;
                    }
                }
            }
            {
                Boolean geoCodeIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (geoCodeIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    long sourceGeoCodeId;
                    sourceGeoCodeId = this.getGeoCodeId();
                    long copyGeoCodeId = strategy.copy(LocatorUtils.property(locator, "geoCodeId", sourceGeoCodeId), sourceGeoCodeId, true);
                    copy.setGeoCodeId(copyGeoCodeId);
                } else {
                    if (geoCodeIdShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean fullGeoCodeIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fullGeoCodeId!= null));
                if (fullGeoCodeIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFullGeoCodeId;
                    sourceFullGeoCodeId = this.getFullGeoCodeId();
                    String copyFullGeoCodeId = ((String) strategy.copy(LocatorUtils.property(locator, "fullGeoCodeId", sourceFullGeoCodeId), sourceFullGeoCodeId, (this.fullGeoCodeId!= null)));
                    copy.setFullGeoCodeId(copyFullGeoCodeId);
                } else {
                    if (fullGeoCodeIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fullGeoCodeId = null;
                    }
                }
            }
            {
                Boolean statisticsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.statistics!= null));
                if (statisticsShouldBeCopiedAndSet == Boolean.TRUE) {
                    GeoHierarchyStatistics sourceStatistics;
                    sourceStatistics = this.getStatistics();
                    GeoHierarchyStatistics copyStatistics = ((GeoHierarchyStatistics) strategy.copy(LocatorUtils.property(locator, "statistics", sourceStatistics), sourceStatistics, (this.statistics!= null)));
                    copy.setStatistics(copyStatistics);
                } else {
                    if (statisticsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.statistics = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new GeoHierarchyElement();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GeoHierarchyElement that = ((GeoHierarchyElement) object);
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            long lhsGeoCodeId;
            lhsGeoCodeId = this.getGeoCodeId();
            long rhsGeoCodeId;
            rhsGeoCodeId = that.getGeoCodeId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geoCodeId", lhsGeoCodeId), LocatorUtils.property(thatLocator, "geoCodeId", rhsGeoCodeId), lhsGeoCodeId, rhsGeoCodeId, true, true)) {
                return false;
            }
        }
        {
            String lhsFullGeoCodeId;
            lhsFullGeoCodeId = this.getFullGeoCodeId();
            String rhsFullGeoCodeId;
            rhsFullGeoCodeId = that.getFullGeoCodeId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fullGeoCodeId", lhsFullGeoCodeId), LocatorUtils.property(thatLocator, "fullGeoCodeId", rhsFullGeoCodeId), lhsFullGeoCodeId, rhsFullGeoCodeId, (this.fullGeoCodeId!= null), (that.fullGeoCodeId!= null))) {
                return false;
            }
        }
        {
            GeoHierarchyStatistics lhsStatistics;
            lhsStatistics = this.getStatistics();
            GeoHierarchyStatistics rhsStatistics;
            rhsStatistics = that.getStatistics();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statistics", lhsStatistics), LocatorUtils.property(thatLocator, "statistics", rhsStatistics), lhsStatistics, rhsStatistics, (this.statistics!= null), (that.statistics!= null))) {
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
