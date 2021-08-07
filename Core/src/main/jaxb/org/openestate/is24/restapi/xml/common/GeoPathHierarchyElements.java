
package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * Listenelement f\u00fcr GeoPathHierarchyElement.
 * 
 * <p>Java class for GeoPathHierarchyElements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoPathHierarchyElements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="geoPathHierarchyElement" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoPathHierarchyElement" maxOccurs="100" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoPathHierarchyElements", propOrder = {
    "geoPathHierarchyElement"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
public class GeoPathHierarchyElements implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected List<GeoPathHierarchyElement> geoPathHierarchyElement;

    /**
     * Gets the value of the geoPathHierarchyElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geoPathHierarchyElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeoPathHierarchyElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeoPathHierarchyElement }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public List<GeoPathHierarchyElement> getGeoPathHierarchyElement() {
        if (geoPathHierarchyElement == null) {
            geoPathHierarchyElement = new ArrayList<GeoPathHierarchyElement>();
        }
        return this.geoPathHierarchyElement;
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
            List<GeoPathHierarchyElement> theGeoPathHierarchyElement;
            theGeoPathHierarchyElement = (((this.geoPathHierarchyElement!= null)&&(!this.geoPathHierarchyElement.isEmpty()))?this.getGeoPathHierarchyElement():null);
            strategy.appendField(locator, this, "geoPathHierarchyElement", buffer, theGeoPathHierarchyElement, ((this.geoPathHierarchyElement!= null)&&(!this.geoPathHierarchyElement.isEmpty())));
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
        if (draftCopy instanceof GeoPathHierarchyElements) {
            final GeoPathHierarchyElements copy = ((GeoPathHierarchyElements) draftCopy);
            {
                Boolean geoPathHierarchyElementShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.geoPathHierarchyElement!= null)&&(!this.geoPathHierarchyElement.isEmpty())));
                if (geoPathHierarchyElementShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<GeoPathHierarchyElement> sourceGeoPathHierarchyElement;
                    sourceGeoPathHierarchyElement = (((this.geoPathHierarchyElement!= null)&&(!this.geoPathHierarchyElement.isEmpty()))?this.getGeoPathHierarchyElement():null);
                    @SuppressWarnings("unchecked")
                    List<GeoPathHierarchyElement> copyGeoPathHierarchyElement = ((List<GeoPathHierarchyElement> ) strategy.copy(LocatorUtils.property(locator, "geoPathHierarchyElement", sourceGeoPathHierarchyElement), sourceGeoPathHierarchyElement, ((this.geoPathHierarchyElement!= null)&&(!this.geoPathHierarchyElement.isEmpty()))));
                    copy.geoPathHierarchyElement = null;
                    if (copyGeoPathHierarchyElement!= null) {
                        List<GeoPathHierarchyElement> uniqueGeoPathHierarchyElementl = copy.getGeoPathHierarchyElement();
                        uniqueGeoPathHierarchyElementl.addAll(copyGeoPathHierarchyElement);
                    }
                } else {
                    if (geoPathHierarchyElementShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geoPathHierarchyElement = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new GeoPathHierarchyElements();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GeoPathHierarchyElements that = ((GeoPathHierarchyElements) object);
        {
            List<GeoPathHierarchyElement> lhsGeoPathHierarchyElement;
            lhsGeoPathHierarchyElement = (((this.geoPathHierarchyElement!= null)&&(!this.geoPathHierarchyElement.isEmpty()))?this.getGeoPathHierarchyElement():null);
            List<GeoPathHierarchyElement> rhsGeoPathHierarchyElement;
            rhsGeoPathHierarchyElement = (((that.geoPathHierarchyElement!= null)&&(!that.geoPathHierarchyElement.isEmpty()))?that.getGeoPathHierarchyElement():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geoPathHierarchyElement", lhsGeoPathHierarchyElement), LocatorUtils.property(thatLocator, "geoPathHierarchyElement", rhsGeoPathHierarchyElement), lhsGeoPathHierarchyElement, rhsGeoPathHierarchyElement, ((this.geoPathHierarchyElement!= null)&&(!this.geoPathHierarchyElement.isEmpty())), ((that.geoPathHierarchyElement!= null)&&(!that.geoPathHierarchyElement.isEmpty())))) {
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
