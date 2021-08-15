
package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * Pflegeplatztypen
 * 
 * <p>Java class for CareTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CareTypes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="careType" type="{http://rest.immobilienscout24.de/schema/common/1.0}CareType" maxOccurs="4"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CareTypes", propOrder = {
    "careType"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
public class CareTypes implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected List<CareType> careType;

    /**
     * Gets the value of the careType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the careType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCareType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CareType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public List<CareType> getCareType() {
        if (careType == null) {
            careType = new ArrayList<CareType>();
        }
        return this.careType;
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
            List<CareType> theCareType;
            theCareType = (((this.careType!= null)&&(!this.careType.isEmpty()))?this.getCareType():null);
            strategy.appendField(locator, this, "careType", buffer, theCareType, ((this.careType!= null)&&(!this.careType.isEmpty())));
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
        if (draftCopy instanceof CareTypes) {
            final CareTypes copy = ((CareTypes) draftCopy);
            {
                Boolean careTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.careType!= null)&&(!this.careType.isEmpty())));
                if (careTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CareType> sourceCareType;
                    sourceCareType = (((this.careType!= null)&&(!this.careType.isEmpty()))?this.getCareType():null);
                    @SuppressWarnings("unchecked")
                    List<CareType> copyCareType = ((List<CareType> ) strategy.copy(LocatorUtils.property(locator, "careType", sourceCareType), sourceCareType, ((this.careType!= null)&&(!this.careType.isEmpty()))));
                    copy.careType = null;
                    if (copyCareType!= null) {
                        List<CareType> uniqueCareTypel = copy.getCareType();
                        uniqueCareTypel.addAll(copyCareType);
                    }
                } else {
                    if (careTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.careType = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new CareTypes();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CareTypes that = ((CareTypes) object);
        {
            List<CareType> lhsCareType;
            lhsCareType = (((this.careType!= null)&&(!this.careType.isEmpty()))?this.getCareType():null);
            List<CareType> rhsCareType;
            rhsCareType = (((that.careType!= null)&&(!that.careType.isEmpty()))?that.getCareType():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "careType", lhsCareType), LocatorUtils.property(thatLocator, "careType", rhsCareType), lhsCareType, rhsCareType, ((this.careType!= null)&&(!this.careType.isEmpty())), ((that.careType!= null)&&(!that.careType.isEmpty())))) {
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
