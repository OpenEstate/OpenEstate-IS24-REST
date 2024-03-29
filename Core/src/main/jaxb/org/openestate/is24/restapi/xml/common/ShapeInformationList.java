
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
 * <p>Java class for ShapeInformationList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShapeInformationList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shapeInformation" type="{http://rest.immobilienscout24.de/schema/common/1.0}ShapeInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShapeInformationList", propOrder = {
    "shapeInformation"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
public class ShapeInformationList implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected List<ShapeInformation> shapeInformation;

    /**
     * Gets the value of the shapeInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shapeInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShapeInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShapeInformation }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public List<ShapeInformation> getShapeInformation() {
        if (shapeInformation == null) {
            shapeInformation = new ArrayList<ShapeInformation>();
        }
        return this.shapeInformation;
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
            List<ShapeInformation> theShapeInformation;
            theShapeInformation = (((this.shapeInformation!= null)&&(!this.shapeInformation.isEmpty()))?this.getShapeInformation():null);
            strategy.appendField(locator, this, "shapeInformation", buffer, theShapeInformation, ((this.shapeInformation!= null)&&(!this.shapeInformation.isEmpty())));
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
        if (draftCopy instanceof ShapeInformationList) {
            final ShapeInformationList copy = ((ShapeInformationList) draftCopy);
            {
                Boolean shapeInformationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.shapeInformation!= null)&&(!this.shapeInformation.isEmpty())));
                if (shapeInformationShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ShapeInformation> sourceShapeInformation;
                    sourceShapeInformation = (((this.shapeInformation!= null)&&(!this.shapeInformation.isEmpty()))?this.getShapeInformation():null);
                    @SuppressWarnings("unchecked")
                    List<ShapeInformation> copyShapeInformation = ((List<ShapeInformation> ) strategy.copy(LocatorUtils.property(locator, "shapeInformation", sourceShapeInformation), sourceShapeInformation, ((this.shapeInformation!= null)&&(!this.shapeInformation.isEmpty()))));
                    copy.shapeInformation = null;
                    if (copyShapeInformation!= null) {
                        List<ShapeInformation> uniqueShapeInformationl = copy.getShapeInformation();
                        uniqueShapeInformationl.addAll(copyShapeInformation);
                    }
                } else {
                    if (shapeInformationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.shapeInformation = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new ShapeInformationList();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ShapeInformationList that = ((ShapeInformationList) object);
        {
            List<ShapeInformation> lhsShapeInformation;
            lhsShapeInformation = (((this.shapeInformation!= null)&&(!this.shapeInformation.isEmpty()))?this.getShapeInformation():null);
            List<ShapeInformation> rhsShapeInformation;
            rhsShapeInformation = (((that.shapeInformation!= null)&&(!that.shapeInformation.isEmpty()))?that.getShapeInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shapeInformation", lhsShapeInformation), LocatorUtils.property(thatLocator, "shapeInformation", rhsShapeInformation), lhsShapeInformation, rhsShapeInformation, ((this.shapeInformation!= null)&&(!this.shapeInformation.isEmpty())), ((that.shapeInformation!= null)&&(!that.shapeInformation.isEmpty())))) {
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
