
package org.openestate.is24.restapi.xml.common;

import java.util.ArrayList;
import java.util.List;
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
 * Listenelement f\u00fcr GeoHierarchyElement.
 * 
 * <p>Java class for GeoHierarchyElements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoHierarchyElements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="geoHierarchyElement" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoHierarchyElement" maxOccurs="30" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoHierarchyElements", propOrder = {
    "geoHierarchyElement"
})
public class GeoHierarchyElements implements Cloneable, CopyTo2, Equals2, ToString2
{

    protected List<GeoHierarchyElement> geoHierarchyElement;

    /**
     * Gets the value of the geoHierarchyElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geoHierarchyElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeoHierarchyElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeoHierarchyElement }
     * 
     * 
     */
    public List<GeoHierarchyElement> getGeoHierarchyElement() {
        if (geoHierarchyElement == null) {
            geoHierarchyElement = new ArrayList<GeoHierarchyElement>();
        }
        return this.geoHierarchyElement;
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            List<GeoHierarchyElement> theGeoHierarchyElement;
            theGeoHierarchyElement = (((this.geoHierarchyElement!= null)&&(!this.geoHierarchyElement.isEmpty()))?this.getGeoHierarchyElement():null);
            strategy.appendField(locator, this, "geoHierarchyElement", buffer, theGeoHierarchyElement, ((this.geoHierarchyElement!= null)&&(!this.geoHierarchyElement.isEmpty())));
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof GeoHierarchyElements) {
            final GeoHierarchyElements copy = ((GeoHierarchyElements) draftCopy);
            {
                Boolean geoHierarchyElementShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.geoHierarchyElement!= null)&&(!this.geoHierarchyElement.isEmpty())));
                if (geoHierarchyElementShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<GeoHierarchyElement> sourceGeoHierarchyElement;
                    sourceGeoHierarchyElement = (((this.geoHierarchyElement!= null)&&(!this.geoHierarchyElement.isEmpty()))?this.getGeoHierarchyElement():null);
                    @SuppressWarnings("unchecked")
                    List<GeoHierarchyElement> copyGeoHierarchyElement = ((List<GeoHierarchyElement> ) strategy.copy(LocatorUtils.property(locator, "geoHierarchyElement", sourceGeoHierarchyElement), sourceGeoHierarchyElement, ((this.geoHierarchyElement!= null)&&(!this.geoHierarchyElement.isEmpty()))));
                    copy.geoHierarchyElement = null;
                    if (copyGeoHierarchyElement!= null) {
                        List<GeoHierarchyElement> uniqueGeoHierarchyElementl = copy.getGeoHierarchyElement();
                        uniqueGeoHierarchyElementl.addAll(copyGeoHierarchyElement);
                    }
                } else {
                    if (geoHierarchyElementShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geoHierarchyElement = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new GeoHierarchyElements();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GeoHierarchyElements that = ((GeoHierarchyElements) object);
        {
            List<GeoHierarchyElement> lhsGeoHierarchyElement;
            lhsGeoHierarchyElement = (((this.geoHierarchyElement!= null)&&(!this.geoHierarchyElement.isEmpty()))?this.getGeoHierarchyElement():null);
            List<GeoHierarchyElement> rhsGeoHierarchyElement;
            rhsGeoHierarchyElement = (((that.geoHierarchyElement!= null)&&(!that.geoHierarchyElement.isEmpty()))?that.getGeoHierarchyElement():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geoHierarchyElement", lhsGeoHierarchyElement), LocatorUtils.property(thatLocator, "geoHierarchyElement", rhsGeoHierarchyElement), lhsGeoHierarchyElement, rhsGeoHierarchyElement, ((this.geoHierarchyElement!= null)&&(!this.geoHierarchyElement.isEmpty())), ((that.geoHierarchyElement!= null)&&(!that.geoHierarchyElement.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
