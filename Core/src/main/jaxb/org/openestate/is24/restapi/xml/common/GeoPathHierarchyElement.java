
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
 * Definiert eine form mit allen verf\u00fcgbaren Informationen.
 *             
 * 
 * <p>Java class for GeoPathHierarchyElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoPathHierarchyElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="geoPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gacLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seoLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "GeoPathHierarchyElement", propOrder = {
    "id",
    "geoPath",
    "gacLabel",
    "seoLabel",
    "type",
    "statistics"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
public class GeoPathHierarchyElement implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected String id;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected String geoPath;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected String gacLabel;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected String seoLabel;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected String type;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected GeoHierarchyStatistics statistics;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the geoPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public String getGeoPath() {
        return geoPath;
    }

    /**
     * Sets the value of the geoPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setGeoPath(String value) {
        this.geoPath = value;
    }

    /**
     * Gets the value of the gacLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public String getGacLabel() {
        return gacLabel;
    }

    /**
     * Sets the value of the gacLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setGacLabel(String value) {
        this.gacLabel = value;
    }

    /**
     * Gets the value of the seoLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public String getSeoLabel() {
        return seoLabel;
    }

    /**
     * Sets the value of the seoLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setSeoLabel(String value) {
        this.seoLabel = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the statistics property.
     * 
     * @return
     *     possible object is
     *     {@link GeoHierarchyStatistics }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setStatistics(GeoHierarchyStatistics value) {
        this.statistics = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
        }
        {
            String theGeoPath;
            theGeoPath = this.getGeoPath();
            strategy.appendField(locator, this, "geoPath", buffer, theGeoPath, (this.geoPath!= null));
        }
        {
            String theGacLabel;
            theGacLabel = this.getGacLabel();
            strategy.appendField(locator, this, "gacLabel", buffer, theGacLabel, (this.gacLabel!= null));
        }
        {
            String theSeoLabel;
            theSeoLabel = this.getSeoLabel();
            strategy.appendField(locator, this, "seoLabel", buffer, theSeoLabel, (this.seoLabel!= null));
        }
        {
            String theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType, (this.type!= null));
        }
        {
            GeoHierarchyStatistics theStatistics;
            theStatistics = this.getStatistics();
            strategy.appendField(locator, this, "statistics", buffer, theStatistics, (this.statistics!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof GeoPathHierarchyElement) {
            final GeoPathHierarchyElement copy = ((GeoPathHierarchyElement) draftCopy);
            {
                Boolean idShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.id!= null));
                if (idShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceId;
                    sourceId = this.getId();
                    String copyId = ((String) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId, (this.id!= null)));
                    copy.setId(copyId);
                } else {
                    if (idShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.id = null;
                    }
                }
            }
            {
                Boolean geoPathShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.geoPath!= null));
                if (geoPathShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGeoPath;
                    sourceGeoPath = this.getGeoPath();
                    String copyGeoPath = ((String) strategy.copy(LocatorUtils.property(locator, "geoPath", sourceGeoPath), sourceGeoPath, (this.geoPath!= null)));
                    copy.setGeoPath(copyGeoPath);
                } else {
                    if (geoPathShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geoPath = null;
                    }
                }
            }
            {
                Boolean gacLabelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gacLabel!= null));
                if (gacLabelShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGacLabel;
                    sourceGacLabel = this.getGacLabel();
                    String copyGacLabel = ((String) strategy.copy(LocatorUtils.property(locator, "gacLabel", sourceGacLabel), sourceGacLabel, (this.gacLabel!= null)));
                    copy.setGacLabel(copyGacLabel);
                } else {
                    if (gacLabelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gacLabel = null;
                    }
                }
            }
            {
                Boolean seoLabelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.seoLabel!= null));
                if (seoLabelShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSeoLabel;
                    sourceSeoLabel = this.getSeoLabel();
                    String copySeoLabel = ((String) strategy.copy(LocatorUtils.property(locator, "seoLabel", sourceSeoLabel), sourceSeoLabel, (this.seoLabel!= null)));
                    copy.setSeoLabel(copySeoLabel);
                } else {
                    if (seoLabelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.seoLabel = null;
                    }
                }
            }
            {
                Boolean typeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.type!= null));
                if (typeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceType;
                    sourceType = this.getType();
                    String copyType = ((String) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType, (this.type!= null)));
                    copy.setType(copyType);
                } else {
                    if (typeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.type = null;
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new GeoPathHierarchyElement();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GeoPathHierarchyElement that = ((GeoPathHierarchyElement) object);
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId, (this.id!= null), (that.id!= null))) {
                return false;
            }
        }
        {
            String lhsGeoPath;
            lhsGeoPath = this.getGeoPath();
            String rhsGeoPath;
            rhsGeoPath = that.getGeoPath();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geoPath", lhsGeoPath), LocatorUtils.property(thatLocator, "geoPath", rhsGeoPath), lhsGeoPath, rhsGeoPath, (this.geoPath!= null), (that.geoPath!= null))) {
                return false;
            }
        }
        {
            String lhsGacLabel;
            lhsGacLabel = this.getGacLabel();
            String rhsGacLabel;
            rhsGacLabel = that.getGacLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gacLabel", lhsGacLabel), LocatorUtils.property(thatLocator, "gacLabel", rhsGacLabel), lhsGacLabel, rhsGacLabel, (this.gacLabel!= null), (that.gacLabel!= null))) {
                return false;
            }
        }
        {
            String lhsSeoLabel;
            lhsSeoLabel = this.getSeoLabel();
            String rhsSeoLabel;
            rhsSeoLabel = that.getSeoLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "seoLabel", lhsSeoLabel), LocatorUtils.property(thatLocator, "seoLabel", rhsSeoLabel), lhsSeoLabel, rhsSeoLabel, (this.seoLabel!= null), (that.seoLabel!= null))) {
                return false;
            }
        }
        {
            String lhsType;
            lhsType = this.getType();
            String rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType, (this.type!= null), (that.type!= null))) {
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
