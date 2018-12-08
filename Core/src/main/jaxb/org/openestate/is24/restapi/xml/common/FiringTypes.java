
package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * Befeuerungsarten
 * 
 * <p>Java class for FiringTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FiringTypes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="firingType" type="{http://rest.immobilienscout24.de/schema/common/1.0}FiringType" maxOccurs="10" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FiringTypes", propOrder = {
    "firingType"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
public class FiringTypes implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected List<FiringType> firingType;

    /**
     * Gets the value of the firingType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the firingType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFiringType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FiringType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public List<FiringType> getFiringType() {
        if (firingType == null) {
            firingType = new ArrayList<FiringType>();
        }
        return this.firingType;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            List<FiringType> theFiringType;
            theFiringType = (((this.firingType!= null)&&(!this.firingType.isEmpty()))?this.getFiringType():null);
            strategy.appendField(locator, this, "firingType", buffer, theFiringType, ((this.firingType!= null)&&(!this.firingType.isEmpty())));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof FiringTypes) {
            final FiringTypes copy = ((FiringTypes) draftCopy);
            {
                Boolean firingTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.firingType!= null)&&(!this.firingType.isEmpty())));
                if (firingTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<FiringType> sourceFiringType;
                    sourceFiringType = (((this.firingType!= null)&&(!this.firingType.isEmpty()))?this.getFiringType():null);
                    @SuppressWarnings("unchecked")
                    List<FiringType> copyFiringType = ((List<FiringType> ) strategy.copy(LocatorUtils.property(locator, "firingType", sourceFiringType), sourceFiringType, ((this.firingType!= null)&&(!this.firingType.isEmpty()))));
                    copy.firingType = null;
                    if (copyFiringType!= null) {
                        List<FiringType> uniqueFiringTypel = copy.getFiringType();
                        uniqueFiringTypel.addAll(copyFiringType);
                    }
                } else {
                    if (firingTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.firingType = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new FiringTypes();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FiringTypes that = ((FiringTypes) object);
        {
            List<FiringType> lhsFiringType;
            lhsFiringType = (((this.firingType!= null)&&(!this.firingType.isEmpty()))?this.getFiringType():null);
            List<FiringType> rhsFiringType;
            rhsFiringType = (((that.firingType!= null)&&(!that.firingType.isEmpty()))?that.getFiringType():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firingType", lhsFiringType), LocatorUtils.property(thatLocator, "firingType", rhsFiringType), lhsFiringType, rhsFiringType, ((this.firingType!= null)&&(!this.firingType.isEmpty())), ((that.firingType!= null)&&(!that.firingType.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
