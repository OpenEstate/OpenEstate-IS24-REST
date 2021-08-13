
package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parent" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoPathHierarchyElement"/&gt;
 *         &lt;element name="children" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoPathHierarchyElements"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "parent",
    "children"
})
@XmlRootElement(name = "geoPathHierarchyElementsStatistic")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
public class GeoPathHierarchyElementsStatistic implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected GeoPathHierarchyElement parent;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected GeoPathHierarchyElements children;

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link GeoPathHierarchyElement }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public GeoPathHierarchyElement getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoPathHierarchyElement }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setParent(GeoPathHierarchyElement value) {
        this.parent = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link GeoPathHierarchyElements }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public GeoPathHierarchyElements getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoPathHierarchyElements }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public void setChildren(GeoPathHierarchyElements value) {
        this.children = value;
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
            GeoPathHierarchyElement theParent;
            theParent = this.getParent();
            strategy.appendField(locator, this, "parent", buffer, theParent, (this.parent!= null));
        }
        {
            GeoPathHierarchyElements theChildren;
            theChildren = this.getChildren();
            strategy.appendField(locator, this, "children", buffer, theChildren, (this.children!= null));
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
        if (draftCopy instanceof GeoPathHierarchyElementsStatistic) {
            final GeoPathHierarchyElementsStatistic copy = ((GeoPathHierarchyElementsStatistic) draftCopy);
            {
                Boolean parentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parent!= null));
                if (parentShouldBeCopiedAndSet == Boolean.TRUE) {
                    GeoPathHierarchyElement sourceParent;
                    sourceParent = this.getParent();
                    GeoPathHierarchyElement copyParent = ((GeoPathHierarchyElement) strategy.copy(LocatorUtils.property(locator, "parent", sourceParent), sourceParent, (this.parent!= null)));
                    copy.setParent(copyParent);
                } else {
                    if (parentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.parent = null;
                    }
                }
            }
            {
                Boolean childrenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.children!= null));
                if (childrenShouldBeCopiedAndSet == Boolean.TRUE) {
                    GeoPathHierarchyElements sourceChildren;
                    sourceChildren = this.getChildren();
                    GeoPathHierarchyElements copyChildren = ((GeoPathHierarchyElements) strategy.copy(LocatorUtils.property(locator, "children", sourceChildren), sourceChildren, (this.children!= null)));
                    copy.setChildren(copyChildren);
                } else {
                    if (childrenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.children = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new GeoPathHierarchyElementsStatistic();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GeoPathHierarchyElementsStatistic that = ((GeoPathHierarchyElementsStatistic) object);
        {
            GeoPathHierarchyElement lhsParent;
            lhsParent = this.getParent();
            GeoPathHierarchyElement rhsParent;
            rhsParent = that.getParent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parent", lhsParent), LocatorUtils.property(thatLocator, "parent", rhsParent), lhsParent, rhsParent, (this.parent!= null), (that.parent!= null))) {
                return false;
            }
        }
        {
            GeoPathHierarchyElements lhsChildren;
            lhsChildren = this.getChildren();
            GeoPathHierarchyElements rhsChildren;
            rhsChildren = that.getChildren();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "children", lhsChildren), LocatorUtils.property(thatLocator, "children", rhsChildren), lhsChildren, rhsChildren, (this.children!= null), (that.children!= null))) {
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
