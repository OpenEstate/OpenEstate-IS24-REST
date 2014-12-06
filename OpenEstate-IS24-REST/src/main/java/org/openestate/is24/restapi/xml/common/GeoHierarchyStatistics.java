//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.06 at 05:03:00 AM CET 
//


package org.openestate.is24.restapi.xml.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * Listenelement f\u00fcr GeoHierarchyStatistic.
 * 
 * <p>Java class for GeoHierarchyStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoHierarchyStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeoHierarchyStatistic" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoHierarchyStatistic" maxOccurs="30" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoHierarchyStatistics", propOrder = {
    "geoHierarchyStatistic"
})
public class GeoHierarchyStatistics
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "GeoHierarchyStatistic")
    protected List<GeoHierarchyStatistic> geoHierarchyStatistic;

    /**
     * Gets the value of the geoHierarchyStatistic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geoHierarchyStatistic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeoHierarchyStatistic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeoHierarchyStatistic }
     * 
     * 
     */
    public List<GeoHierarchyStatistic> getGeoHierarchyStatistic() {
        if (geoHierarchyStatistic == null) {
            geoHierarchyStatistic = new ArrayList<GeoHierarchyStatistic>();
        }
        return this.geoHierarchyStatistic;
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
            List<GeoHierarchyStatistic> theGeoHierarchyStatistic;
            theGeoHierarchyStatistic = (((this.geoHierarchyStatistic!= null)&&(!this.geoHierarchyStatistic.isEmpty()))?this.getGeoHierarchyStatistic():null);
            strategy.appendField(locator, this, "geoHierarchyStatistic", buffer, theGeoHierarchyStatistic);
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
        if (draftCopy instanceof GeoHierarchyStatistics) {
            final GeoHierarchyStatistics copy = ((GeoHierarchyStatistics) draftCopy);
            if ((this.geoHierarchyStatistic!= null)&&(!this.geoHierarchyStatistic.isEmpty())) {
                List<GeoHierarchyStatistic> sourceGeoHierarchyStatistic;
                sourceGeoHierarchyStatistic = (((this.geoHierarchyStatistic!= null)&&(!this.geoHierarchyStatistic.isEmpty()))?this.getGeoHierarchyStatistic():null);
                @SuppressWarnings("unchecked")
                List<GeoHierarchyStatistic> copyGeoHierarchyStatistic = ((List<GeoHierarchyStatistic> ) strategy.copy(LocatorUtils.property(locator, "geoHierarchyStatistic", sourceGeoHierarchyStatistic), sourceGeoHierarchyStatistic));
                copy.geoHierarchyStatistic = null;
                if (copyGeoHierarchyStatistic!= null) {
                    List<GeoHierarchyStatistic> uniqueGeoHierarchyStatisticl = copy.getGeoHierarchyStatistic();
                    uniqueGeoHierarchyStatisticl.addAll(copyGeoHierarchyStatistic);
                }
            } else {
                copy.geoHierarchyStatistic = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new GeoHierarchyStatistics();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GeoHierarchyStatistics)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GeoHierarchyStatistics that = ((GeoHierarchyStatistics) object);
        {
            List<GeoHierarchyStatistic> lhsGeoHierarchyStatistic;
            lhsGeoHierarchyStatistic = (((this.geoHierarchyStatistic!= null)&&(!this.geoHierarchyStatistic.isEmpty()))?this.getGeoHierarchyStatistic():null);
            List<GeoHierarchyStatistic> rhsGeoHierarchyStatistic;
            rhsGeoHierarchyStatistic = (((that.geoHierarchyStatistic!= null)&&(!that.geoHierarchyStatistic.isEmpty()))?that.getGeoHierarchyStatistic():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geoHierarchyStatistic", lhsGeoHierarchyStatistic), LocatorUtils.property(thatLocator, "geoHierarchyStatistic", rhsGeoHierarchyStatistic), lhsGeoHierarchyStatistic, rhsGeoHierarchyStatistic)) {
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
