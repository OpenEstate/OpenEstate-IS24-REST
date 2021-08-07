
package org.openestate.is24.restapi.xml.realestateproject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * <p>Java class for InteriorCharacteristics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InteriorCharacteristics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="20" minOccurs="3"&gt;
 *         &lt;element name="InteriorCharacteristic"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InteriorCharacteristics", propOrder = {
    "interiorCharacteristic"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
public class InteriorCharacteristics implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "InteriorCharacteristic", required = true)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected List<String> interiorCharacteristic;

    /**
     * Gets the value of the interiorCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interiorCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInteriorCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public List<String> getInteriorCharacteristic() {
        if (interiorCharacteristic == null) {
            interiorCharacteristic = new ArrayList<String>();
        }
        return this.interiorCharacteristic;
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
            List<String> theInteriorCharacteristic;
            theInteriorCharacteristic = (((this.interiorCharacteristic!= null)&&(!this.interiorCharacteristic.isEmpty()))?this.getInteriorCharacteristic():null);
            strategy.appendField(locator, this, "interiorCharacteristic", buffer, theInteriorCharacteristic, ((this.interiorCharacteristic!= null)&&(!this.interiorCharacteristic.isEmpty())));
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
        if (draftCopy instanceof InteriorCharacteristics) {
            final InteriorCharacteristics copy = ((InteriorCharacteristics) draftCopy);
            {
                Boolean interiorCharacteristicShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.interiorCharacteristic!= null)&&(!this.interiorCharacteristic.isEmpty())));
                if (interiorCharacteristicShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<String> sourceInteriorCharacteristic;
                    sourceInteriorCharacteristic = (((this.interiorCharacteristic!= null)&&(!this.interiorCharacteristic.isEmpty()))?this.getInteriorCharacteristic():null);
                    @SuppressWarnings("unchecked")
                    List<String> copyInteriorCharacteristic = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "interiorCharacteristic", sourceInteriorCharacteristic), sourceInteriorCharacteristic, ((this.interiorCharacteristic!= null)&&(!this.interiorCharacteristic.isEmpty()))));
                    copy.interiorCharacteristic = null;
                    if (copyInteriorCharacteristic!= null) {
                        List<String> uniqueInteriorCharacteristicl = copy.getInteriorCharacteristic();
                        uniqueInteriorCharacteristicl.addAll(copyInteriorCharacteristic);
                    }
                } else {
                    if (interiorCharacteristicShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.interiorCharacteristic = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new InteriorCharacteristics();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final InteriorCharacteristics that = ((InteriorCharacteristics) object);
        {
            List<String> lhsInteriorCharacteristic;
            lhsInteriorCharacteristic = (((this.interiorCharacteristic!= null)&&(!this.interiorCharacteristic.isEmpty()))?this.getInteriorCharacteristic():null);
            List<String> rhsInteriorCharacteristic;
            rhsInteriorCharacteristic = (((that.interiorCharacteristic!= null)&&(!that.interiorCharacteristic.isEmpty()))?that.getInteriorCharacteristic():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "interiorCharacteristic", lhsInteriorCharacteristic), LocatorUtils.property(thatLocator, "interiorCharacteristic", rhsInteriorCharacteristic), lhsInteriorCharacteristic, rhsInteriorCharacteristic, ((this.interiorCharacteristic!= null)&&(!this.interiorCharacteristic.isEmpty())), ((that.interiorCharacteristic!= null)&&(!that.interiorCharacteristic.isEmpty())))) {
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
