
package org.openestate.is24.restapi.xml.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
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
@Deprecated
public class FiringTypes
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlSchemaType(name = "string")
    @Deprecated
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
    @Deprecated
    public List<FiringType> getFiringType() {
        if (firingType == null) {
            firingType = new ArrayList<FiringType>();
        }
        return this.firingType;
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
            List<FiringType> theFiringType;
            theFiringType = (((this.firingType!= null)&&(!this.firingType.isEmpty()))?this.getFiringType():null);
            strategy.appendField(locator, this, "firingType", buffer, theFiringType);
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
        if (draftCopy instanceof FiringTypes) {
            final FiringTypes copy = ((FiringTypes) draftCopy);
            if ((this.firingType!= null)&&(!this.firingType.isEmpty())) {
                List<FiringType> sourceFiringType;
                sourceFiringType = (((this.firingType!= null)&&(!this.firingType.isEmpty()))?this.getFiringType():null);
                @SuppressWarnings("unchecked")
                List<FiringType> copyFiringType = ((List<FiringType> ) strategy.copy(LocatorUtils.property(locator, "firingType", sourceFiringType), sourceFiringType));
                copy.firingType = null;
                if (copyFiringType!= null) {
                    List<FiringType> uniqueFiringTypel = copy.getFiringType();
                    uniqueFiringTypel.addAll(copyFiringType);
                }
            } else {
                copy.firingType = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new FiringTypes();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firingType", lhsFiringType), LocatorUtils.property(thatLocator, "firingType", rhsFiringType), lhsFiringType, rhsFiringType)) {
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
