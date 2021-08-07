
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
 * wesentliche Energietr\u00e4ger
 * 
 * <p>Java class for EnergySourcesEnev2014 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnergySourcesEnev2014"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="energySourceEnev2014" type="{http://rest.immobilienscout24.de/schema/common/1.0}EnergySourceEnev2014" maxOccurs="25" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergySourcesEnev2014", propOrder = {
    "energySourceEnev2014"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
public class EnergySourcesEnev2014 implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected List<EnergySourceEnev2014> energySourceEnev2014;

    /**
     * Gets the value of the energySourceEnev2014 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the energySourceEnev2014 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnergySourceEnev2014().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnergySourceEnev2014 }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public List<EnergySourceEnev2014> getEnergySourceEnev2014() {
        if (energySourceEnev2014 == null) {
            energySourceEnev2014 = new ArrayList<EnergySourceEnev2014>();
        }
        return this.energySourceEnev2014;
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
            List<EnergySourceEnev2014> theEnergySourceEnev2014;
            theEnergySourceEnev2014 = (((this.energySourceEnev2014 != null)&&(!this.energySourceEnev2014 .isEmpty()))?this.getEnergySourceEnev2014():null);
            strategy.appendField(locator, this, "energySourceEnev2014", buffer, theEnergySourceEnev2014, ((this.energySourceEnev2014 != null)&&(!this.energySourceEnev2014 .isEmpty())));
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
        if (draftCopy instanceof EnergySourcesEnev2014) {
            final EnergySourcesEnev2014 copy = ((EnergySourcesEnev2014) draftCopy);
            {
                Boolean energySourceEnev2014ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.energySourceEnev2014 != null)&&(!this.energySourceEnev2014 .isEmpty())));
                if (energySourceEnev2014ShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<EnergySourceEnev2014> sourceEnergySourceEnev2014;
                    sourceEnergySourceEnev2014 = (((this.energySourceEnev2014 != null)&&(!this.energySourceEnev2014 .isEmpty()))?this.getEnergySourceEnev2014():null);
                    @SuppressWarnings("unchecked")
                    List<EnergySourceEnev2014> copyEnergySourceEnev2014 = ((List<EnergySourceEnev2014> ) strategy.copy(LocatorUtils.property(locator, "energySourceEnev2014", sourceEnergySourceEnev2014), sourceEnergySourceEnev2014, ((this.energySourceEnev2014 != null)&&(!this.energySourceEnev2014 .isEmpty()))));
                    copy.energySourceEnev2014 = null;
                    if (copyEnergySourceEnev2014 != null) {
                        List<EnergySourceEnev2014> uniqueEnergySourceEnev2014l = copy.getEnergySourceEnev2014();
                        uniqueEnergySourceEnev2014l.addAll(copyEnergySourceEnev2014);
                    }
                } else {
                    if (energySourceEnev2014ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energySourceEnev2014 = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new EnergySourcesEnev2014();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EnergySourcesEnev2014 that = ((EnergySourcesEnev2014) object);
        {
            List<EnergySourceEnev2014> lhsEnergySourceEnev2014;
            lhsEnergySourceEnev2014 = (((this.energySourceEnev2014 != null)&&(!this.energySourceEnev2014 .isEmpty()))?this.getEnergySourceEnev2014():null);
            List<EnergySourceEnev2014> rhsEnergySourceEnev2014;
            rhsEnergySourceEnev2014 = (((that.energySourceEnev2014 != null)&&(!that.energySourceEnev2014 .isEmpty()))?that.getEnergySourceEnev2014():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energySourceEnev2014", lhsEnergySourceEnev2014), LocatorUtils.property(thatLocator, "energySourceEnev2014", rhsEnergySourceEnev2014), lhsEnergySourceEnev2014, rhsEnergySourceEnev2014, ((this.energySourceEnev2014 != null)&&(!this.energySourceEnev2014 .isEmpty())), ((that.energySourceEnev2014 != null)&&(!that.energySourceEnev2014 .isEmpty())))) {
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
