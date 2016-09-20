
package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for CountyCourt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountyCourt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="courtNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="name" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountyCourt", propOrder = {

})
public class CountyCourt implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlJavaTypeAdapter(Adapter32 .class)
    protected String courtNumber;
    @XmlJavaTypeAdapter(Adapter33 .class)
    protected String name;

    /**
     * Gets the value of the courtNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourtNumber() {
        return courtNumber;
    }

    /**
     * Sets the value of the courtNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourtNumber(String value) {
        this.courtNumber = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
            String theCourtNumber;
            theCourtNumber = this.getCourtNumber();
            strategy.appendField(locator, this, "courtNumber", buffer, theCourtNumber, (this.courtNumber!= null));
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
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
        if (draftCopy instanceof CountyCourt) {
            final CountyCourt copy = ((CountyCourt) draftCopy);
            {
                Boolean courtNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.courtNumber!= null));
                if (courtNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCourtNumber;
                    sourceCourtNumber = this.getCourtNumber();
                    String copyCourtNumber = ((String) strategy.copy(LocatorUtils.property(locator, "courtNumber", sourceCourtNumber), sourceCourtNumber, (this.courtNumber!= null)));
                    copy.setCourtNumber(copyCourtNumber);
                } else {
                    if (courtNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.courtNumber = null;
                    }
                }
            }
            {
                Boolean nameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.name!= null));
                if (nameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceName;
                    sourceName = this.getName();
                    String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName, (this.name!= null)));
                    copy.setName(copyName);
                } else {
                    if (nameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.name = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new CountyCourt();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CountyCourt that = ((CountyCourt) object);
        {
            String lhsCourtNumber;
            lhsCourtNumber = this.getCourtNumber();
            String rhsCourtNumber;
            rhsCourtNumber = that.getCourtNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "courtNumber", lhsCourtNumber), LocatorUtils.property(thatLocator, "courtNumber", rhsCourtNumber), lhsCourtNumber, rhsCourtNumber, (this.courtNumber!= null), (that.courtNumber!= null))) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
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
