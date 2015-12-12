
package org.openestate.is24.restapi.xml.common;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * Bereich der Zimmeranzahl
 * 
 * <p>Java class for NumberOfRoomsRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberOfRoomsRange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="minimal" type="{http://rest.immobilienscout24.de/schema/common/1.0}NumberOfRoomsType" minOccurs="0"/&gt;
 *         &lt;element name="maximal" type="{http://rest.immobilienscout24.de/schema/common/1.0}NumberOfRoomsType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfRoomsRange", propOrder = {

})
public class NumberOfRoomsRange
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter10 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal minimal;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter10 .class)
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
            BigDecimal theMinimal;
            theMinimal = this.getMinimal();
            strategy.appendField(locator, this, "minimal", buffer, theMinimal);
        }
        {
            BigDecimal theMaximal;
            theMaximal = this.getMaximal();
            strategy.appendField(locator, this, "maximal", buffer, theMaximal);
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
        if (draftCopy instanceof NumberOfRoomsRange) {
            final NumberOfRoomsRange copy = ((NumberOfRoomsRange) draftCopy);
            if (this.minimal!= null) {
                BigDecimal sourceMinimal;
                sourceMinimal = this.getMinimal();
                BigDecimal copyMinimal = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "minimal", sourceMinimal), sourceMinimal));
                copy.setMinimal(copyMinimal);
            } else {
                copy.minimal = null;
            }
            if (this.maximal!= null) {
                BigDecimal sourceMaximal;
                sourceMaximal = this.getMaximal();
                BigDecimal copyMaximal = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "maximal", sourceMaximal), sourceMaximal));
                copy.setMaximal(copyMaximal);
            } else {
                copy.maximal = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new NumberOfRoomsRange();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NumberOfRoomsRange that = ((NumberOfRoomsRange) object);
        {
            BigDecimal lhsMinimal;
            lhsMinimal = this.getMinimal();
            BigDecimal rhsMinimal;
            rhsMinimal = that.getMinimal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimal", lhsMinimal), LocatorUtils.property(thatLocator, "minimal", rhsMinimal), lhsMinimal, rhsMinimal)) {
                return false;
            }
        }
        {
            BigDecimal lhsMaximal;
            lhsMaximal = this.getMaximal();
            BigDecimal rhsMaximal;
            rhsMaximal = that.getMaximal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximal", lhsMaximal), LocatorUtils.property(thatLocator, "maximal", rhsMaximal), lhsMaximal, rhsMaximal)) {
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
