
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parent" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoHierarchyElement"/>
 *         &lt;element name="children" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoHierarchyElements"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "parent",
    "children"
})
@XmlRootElement(name = "geoHierarchyElementsStatistic")
public class GeoHierarchyElementsStatistic
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    protected GeoHierarchyElement parent;
    @XmlElement(required = true)
    protected GeoHierarchyElements children;

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link GeoHierarchyElement }
     *     
     */
    public GeoHierarchyElement getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoHierarchyElement }
     *     
     */
    public void setParent(GeoHierarchyElement value) {
        this.parent = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link GeoHierarchyElements }
     *     
     */
    public GeoHierarchyElements getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoHierarchyElements }
     *     
     */
    public void setChildren(GeoHierarchyElements value) {
        this.children = value;
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
            GeoHierarchyElement theParent;
            theParent = this.getParent();
            strategy.appendField(locator, this, "parent", buffer, theParent);
        }
        {
            GeoHierarchyElements theChildren;
            theChildren = this.getChildren();
            strategy.appendField(locator, this, "children", buffer, theChildren);
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
        if (draftCopy instanceof GeoHierarchyElementsStatistic) {
            final GeoHierarchyElementsStatistic copy = ((GeoHierarchyElementsStatistic) draftCopy);
            if (this.parent!= null) {
                GeoHierarchyElement sourceParent;
                sourceParent = this.getParent();
                GeoHierarchyElement copyParent = ((GeoHierarchyElement) strategy.copy(LocatorUtils.property(locator, "parent", sourceParent), sourceParent));
                copy.setParent(copyParent);
            } else {
                copy.parent = null;
            }
            if (this.children!= null) {
                GeoHierarchyElements sourceChildren;
                sourceChildren = this.getChildren();
                GeoHierarchyElements copyChildren = ((GeoHierarchyElements) strategy.copy(LocatorUtils.property(locator, "children", sourceChildren), sourceChildren));
                copy.setChildren(copyChildren);
            } else {
                copy.children = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new GeoHierarchyElementsStatistic();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GeoHierarchyElementsStatistic)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GeoHierarchyElementsStatistic that = ((GeoHierarchyElementsStatistic) object);
        {
            GeoHierarchyElement lhsParent;
            lhsParent = this.getParent();
            GeoHierarchyElement rhsParent;
            rhsParent = that.getParent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parent", lhsParent), LocatorUtils.property(thatLocator, "parent", rhsParent), lhsParent, rhsParent)) {
                return false;
            }
        }
        {
            GeoHierarchyElements lhsChildren;
            lhsChildren = this.getChildren();
            GeoHierarchyElements rhsChildren;
            rhsChildren = that.getChildren();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "children", lhsChildren), LocatorUtils.property(thatLocator, "children", rhsChildren), lhsChildren, rhsChildren)) {
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
