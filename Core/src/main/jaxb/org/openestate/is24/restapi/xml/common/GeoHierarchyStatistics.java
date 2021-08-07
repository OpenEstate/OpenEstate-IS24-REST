
package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * Listenelement f\u00fcr GeoHierarchyStatistic.
 * 
 * <p>Java class for GeoHierarchyStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoHierarchyStatistics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GeoHierarchyStatistic" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoHierarchyStatistic" maxOccurs="30" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoHierarchyStatistics", propOrder = {
    "geoHierarchyStatistic"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
public class GeoHierarchyStatistics implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "GeoHierarchyStatistic")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public List<GeoHierarchyStatistic> getGeoHierarchyStatistic() {
        if (geoHierarchyStatistic == null) {
            geoHierarchyStatistic = new ArrayList<GeoHierarchyStatistic>();
        }
        return this.geoHierarchyStatistic;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            List<GeoHierarchyStatistic> theGeoHierarchyStatistic;
            theGeoHierarchyStatistic = (((this.geoHierarchyStatistic!= null)&&(!this.geoHierarchyStatistic.isEmpty()))?this.getGeoHierarchyStatistic():null);
            strategy.appendField(locator, this, "geoHierarchyStatistic", buffer, theGeoHierarchyStatistic, ((this.geoHierarchyStatistic!= null)&&(!this.geoHierarchyStatistic.isEmpty())));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof GeoHierarchyStatistics) {
            final GeoHierarchyStatistics copy = ((GeoHierarchyStatistics) draftCopy);
            {
                Boolean geoHierarchyStatisticShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.geoHierarchyStatistic!= null)&&(!this.geoHierarchyStatistic.isEmpty())));
                if (geoHierarchyStatisticShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<GeoHierarchyStatistic> sourceGeoHierarchyStatistic;
                    sourceGeoHierarchyStatistic = (((this.geoHierarchyStatistic!= null)&&(!this.geoHierarchyStatistic.isEmpty()))?this.getGeoHierarchyStatistic():null);
                    @SuppressWarnings("unchecked")
                    List<GeoHierarchyStatistic> copyGeoHierarchyStatistic = ((List<GeoHierarchyStatistic> ) strategy.copy(LocatorUtils.property(locator, "geoHierarchyStatistic", sourceGeoHierarchyStatistic), sourceGeoHierarchyStatistic, ((this.geoHierarchyStatistic!= null)&&(!this.geoHierarchyStatistic.isEmpty()))));
                    copy.geoHierarchyStatistic = null;
                    if (copyGeoHierarchyStatistic!= null) {
                        List<GeoHierarchyStatistic> uniqueGeoHierarchyStatisticl = copy.getGeoHierarchyStatistic();
                        uniqueGeoHierarchyStatisticl.addAll(copyGeoHierarchyStatistic);
                    }
                } else {
                    if (geoHierarchyStatisticShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geoHierarchyStatistic = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new GeoHierarchyStatistics();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geoHierarchyStatistic", lhsGeoHierarchyStatistic), LocatorUtils.property(thatLocator, "geoHierarchyStatistic", rhsGeoHierarchyStatistic), lhsGeoHierarchyStatistic, rhsGeoHierarchyStatistic, ((this.geoHierarchyStatistic!= null)&&(!this.geoHierarchyStatistic.isEmpty())), ((that.geoHierarchyStatistic!= null)&&(!that.geoHierarchyStatistic.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

}
