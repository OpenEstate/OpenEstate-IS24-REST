
package org.openestate.is24.restapi.xml.common;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * Bereich der Fl\u00e4che
 * 
 * <p>Java class for AreaRangeMandatory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AreaRangeMandatory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="minimal" type="{http://rest.immobilienscout24.de/schema/common/1.0}Number8.2Type"/&gt;
 *         &lt;element name="maximal" type="{http://rest.immobilienscout24.de/schema/common/1.0}Number8.2Type"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaRangeMandatory", propOrder = {

})
public class AreaRangeMandatory implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal minimal;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal maximal;

    /**
     * Gets the value of the minimal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getMinimal() {
        return minimal;
    }

    /**
     * Sets the value of the minimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimal(BigDecimal value) {
        this.minimal = value;
    }

    /**
     * Gets the value of the maximal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getMaximal() {
        return maximal;
    }

    /**
     * Sets the value of the maximal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximal(BigDecimal value) {
        this.maximal = value;
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
            BigDecimal theMinimal;
            theMinimal = this.getMinimal();
            strategy.appendField(locator, this, "minimal", buffer, theMinimal, (this.minimal!= null));
        }
        {
            BigDecimal theMaximal;
            theMaximal = this.getMaximal();
            strategy.appendField(locator, this, "maximal", buffer, theMaximal, (this.maximal!= null));
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
        if (draftCopy instanceof AreaRangeMandatory) {
            final AreaRangeMandatory copy = ((AreaRangeMandatory) draftCopy);
            {
                Boolean minimalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.minimal!= null));
                if (minimalShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceMinimal;
                    sourceMinimal = this.getMinimal();
                    BigDecimal copyMinimal = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "minimal", sourceMinimal), sourceMinimal, (this.minimal!= null)));
                    copy.setMinimal(copyMinimal);
                } else {
                    if (minimalShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.minimal = null;
                    }
                }
            }
            {
                Boolean maximalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maximal!= null));
                if (maximalShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceMaximal;
                    sourceMaximal = this.getMaximal();
                    BigDecimal copyMaximal = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "maximal", sourceMaximal), sourceMaximal, (this.maximal!= null)));
                    copy.setMaximal(copyMaximal);
                } else {
                    if (maximalShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maximal = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new AreaRangeMandatory();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AreaRangeMandatory that = ((AreaRangeMandatory) object);
        {
            BigDecimal lhsMinimal;
            lhsMinimal = this.getMinimal();
            BigDecimal rhsMinimal;
            rhsMinimal = that.getMinimal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimal", lhsMinimal), LocatorUtils.property(thatLocator, "minimal", rhsMinimal), lhsMinimal, rhsMinimal, (this.minimal!= null), (that.minimal!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsMaximal;
            lhsMaximal = this.getMaximal();
            BigDecimal rhsMaximal;
            rhsMaximal = that.getMaximal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximal", lhsMaximal), LocatorUtils.property(thatLocator, "maximal", rhsMaximal), lhsMaximal, rhsMaximal, (this.maximal!= null), (that.maximal!= null))) {
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
