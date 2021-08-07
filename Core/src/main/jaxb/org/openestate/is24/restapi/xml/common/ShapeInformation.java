
package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import javax.annotation.Generated;
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
 * <p>Java class for ShapeInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShapeInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shapeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="geoPath" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoPath"/&gt;
 *         &lt;element name="gacLabel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="seoLabel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="datasets" type="{http://rest.immobilienscout24.de/schema/common/1.0}DatasetList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShapeInformation", propOrder = {
    "shapeId",
    "name",
    "geoPath",
    "gacLabel",
    "seoLabel",
    "type",
    "datasets"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
public class ShapeInformation implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected String shapeId;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected String name;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected GeoPath geoPath;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected String gacLabel;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected String seoLabel;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected String type;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected DatasetList datasets;

    /**
     * Gets the value of the shapeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public String getShapeId() {
        return shapeId;
    }

    /**
     * Sets the value of the shapeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setShapeId(String value) {
        this.shapeId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the geoPath property.
     * 
     * @return
     *     possible object is
     *     {@link GeoPath }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public GeoPath getGeoPath() {
        return geoPath;
    }

    /**
     * Sets the value of the geoPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoPath }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setGeoPath(GeoPath value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the datasets property.
     * 
     * @return
     *     possible object is
     *     {@link DatasetList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public DatasetList getDatasets() {
        return datasets;
    }

    /**
     * Sets the value of the datasets property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatasetList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setDatasets(DatasetList value) {
        this.datasets = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String theShapeId;
            theShapeId = this.getShapeId();
            strategy.appendField(locator, this, "shapeId", buffer, theShapeId, (this.shapeId!= null));
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            GeoPath theGeoPath;
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
            DatasetList theDatasets;
            theDatasets = this.getDatasets();
            strategy.appendField(locator, this, "datasets", buffer, theDatasets, (this.datasets!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof ShapeInformation) {
            final ShapeInformation copy = ((ShapeInformation) draftCopy);
            {
                Boolean shapeIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.shapeId!= null));
                if (shapeIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceShapeId;
                    sourceShapeId = this.getShapeId();
                    String copyShapeId = ((String) strategy.copy(LocatorUtils.property(locator, "shapeId", sourceShapeId), sourceShapeId, (this.shapeId!= null)));
                    copy.setShapeId(copyShapeId);
                } else {
                    if (shapeIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.shapeId = null;
                    }
                }
            }
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
                Boolean geoPathShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.geoPath!= null));
                if (geoPathShouldBeCopiedAndSet == Boolean.TRUE) {
                    GeoPath sourceGeoPath;
                    sourceGeoPath = this.getGeoPath();
                    GeoPath copyGeoPath = ((GeoPath) strategy.copy(LocatorUtils.property(locator, "geoPath", sourceGeoPath), sourceGeoPath, (this.geoPath!= null)));
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
                Boolean datasetsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.datasets!= null));
                if (datasetsShouldBeCopiedAndSet == Boolean.TRUE) {
                    DatasetList sourceDatasets;
                    sourceDatasets = this.getDatasets();
                    DatasetList copyDatasets = ((DatasetList) strategy.copy(LocatorUtils.property(locator, "datasets", sourceDatasets), sourceDatasets, (this.datasets!= null)));
                    copy.setDatasets(copyDatasets);
                } else {
                    if (datasetsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.datasets = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new ShapeInformation();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ShapeInformation that = ((ShapeInformation) object);
        {
            String lhsShapeId;
            lhsShapeId = this.getShapeId();
            String rhsShapeId;
            rhsShapeId = that.getShapeId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shapeId", lhsShapeId), LocatorUtils.property(thatLocator, "shapeId", rhsShapeId), lhsShapeId, rhsShapeId, (this.shapeId!= null), (that.shapeId!= null))) {
                return false;
            }
        }
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
            GeoPath lhsGeoPath;
            lhsGeoPath = this.getGeoPath();
            GeoPath rhsGeoPath;
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
            DatasetList lhsDatasets;
            lhsDatasets = this.getDatasets();
            DatasetList rhsDatasets;
            rhsDatasets = that.getDatasets();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "datasets", lhsDatasets), LocatorUtils.property(thatLocator, "datasets", rhsDatasets), lhsDatasets, rhsDatasets, (this.datasets!= null), (that.datasets!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

}
