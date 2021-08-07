
package org.openestate.is24.restapi.xml.common;

import java.awt.Color;
import java.io.Serializable;
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
 * <p>Java class for ContactMailCustomStyle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactMailCustomStyle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="header1Color" type="{http://rest.immobilienscout24.de/schema/common/1.0}HexadecimalColorCode" minOccurs="0"/&gt;
 *         &lt;element name="header1FontColor" type="{http://rest.immobilienscout24.de/schema/common/1.0}HexadecimalColorCode" minOccurs="0"/&gt;
 *         &lt;element name="header2Color" type="{http://rest.immobilienscout24.de/schema/common/1.0}HexadecimalColorCode" minOccurs="0"/&gt;
 *         &lt;element name="header2FontColor" type="{http://rest.immobilienscout24.de/schema/common/1.0}HexadecimalColorCode" minOccurs="0"/&gt;
 *         &lt;element name="header3Color" type="{http://rest.immobilienscout24.de/schema/common/1.0}HexadecimalColorCode" minOccurs="0"/&gt;
 *         &lt;element name="header3FontColor" type="{http://rest.immobilienscout24.de/schema/common/1.0}HexadecimalColorCode" minOccurs="0"/&gt;
 *         &lt;element name="identifier" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
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
@XmlType(name = "ContactMailCustomStyle", propOrder = {
    "header1Color",
    "header1FontColor",
    "header2Color",
    "header2FontColor",
    "header3Color",
    "header3FontColor",
    "identifier"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
public class ContactMailCustomStyle implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected Color header1Color;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected Color header1FontColor;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected Color header2Color;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected Color header2FontColor;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected Color header3Color;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected Color header3FontColor;
    @XmlJavaTypeAdapter(Adapter59 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    protected String identifier;

    /**
     * Gets the value of the header1Color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public Color getHeader1Color() {
        return header1Color;
    }

    /**
     * Sets the value of the header1Color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setHeader1Color(Color value) {
        this.header1Color = value;
    }

    /**
     * Gets the value of the header1FontColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public Color getHeader1FontColor() {
        return header1FontColor;
    }

    /**
     * Sets the value of the header1FontColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setHeader1FontColor(Color value) {
        this.header1FontColor = value;
    }

    /**
     * Gets the value of the header2Color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public Color getHeader2Color() {
        return header2Color;
    }

    /**
     * Sets the value of the header2Color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setHeader2Color(Color value) {
        this.header2Color = value;
    }

    /**
     * Gets the value of the header2FontColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public Color getHeader2FontColor() {
        return header2FontColor;
    }

    /**
     * Sets the value of the header2FontColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setHeader2FontColor(Color value) {
        this.header2FontColor = value;
    }

    /**
     * Gets the value of the header3Color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public Color getHeader3Color() {
        return header3Color;
    }

    /**
     * Sets the value of the header3Color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setHeader3Color(Color value) {
        this.header3Color = value;
    }

    /**
     * Gets the value of the header3FontColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public Color getHeader3FontColor() {
        return header3FontColor;
    }

    /**
     * Sets the value of the header3FontColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setHeader3FontColor(Color value) {
        this.header3FontColor = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            Color theHeader1Color;
            theHeader1Color = this.getHeader1Color();
            strategy.appendField(locator, this, "header1Color", buffer, theHeader1Color, (this.header1Color!= null));
        }
        {
            Color theHeader1FontColor;
            theHeader1FontColor = this.getHeader1FontColor();
            strategy.appendField(locator, this, "header1FontColor", buffer, theHeader1FontColor, (this.header1FontColor!= null));
        }
        {
            Color theHeader2Color;
            theHeader2Color = this.getHeader2Color();
            strategy.appendField(locator, this, "header2Color", buffer, theHeader2Color, (this.header2Color!= null));
        }
        {
            Color theHeader2FontColor;
            theHeader2FontColor = this.getHeader2FontColor();
            strategy.appendField(locator, this, "header2FontColor", buffer, theHeader2FontColor, (this.header2FontColor!= null));
        }
        {
            Color theHeader3Color;
            theHeader3Color = this.getHeader3Color();
            strategy.appendField(locator, this, "header3Color", buffer, theHeader3Color, (this.header3Color!= null));
        }
        {
            Color theHeader3FontColor;
            theHeader3FontColor = this.getHeader3FontColor();
            strategy.appendField(locator, this, "header3FontColor", buffer, theHeader3FontColor, (this.header3FontColor!= null));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier, (this.identifier!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof ContactMailCustomStyle) {
            final ContactMailCustomStyle copy = ((ContactMailCustomStyle) draftCopy);
            {
                Boolean header1ColorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.header1Color!= null));
                if (header1ColorShouldBeCopiedAndSet == Boolean.TRUE) {
                    Color sourceHeader1Color;
                    sourceHeader1Color = this.getHeader1Color();
                    Color copyHeader1Color = ((Color) strategy.copy(LocatorUtils.property(locator, "header1Color", sourceHeader1Color), sourceHeader1Color, (this.header1Color!= null)));
                    copy.setHeader1Color(copyHeader1Color);
                } else {
                    if (header1ColorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.header1Color = null;
                    }
                }
            }
            {
                Boolean header1FontColorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.header1FontColor!= null));
                if (header1FontColorShouldBeCopiedAndSet == Boolean.TRUE) {
                    Color sourceHeader1FontColor;
                    sourceHeader1FontColor = this.getHeader1FontColor();
                    Color copyHeader1FontColor = ((Color) strategy.copy(LocatorUtils.property(locator, "header1FontColor", sourceHeader1FontColor), sourceHeader1FontColor, (this.header1FontColor!= null)));
                    copy.setHeader1FontColor(copyHeader1FontColor);
                } else {
                    if (header1FontColorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.header1FontColor = null;
                    }
                }
            }
            {
                Boolean header2ColorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.header2Color!= null));
                if (header2ColorShouldBeCopiedAndSet == Boolean.TRUE) {
                    Color sourceHeader2Color;
                    sourceHeader2Color = this.getHeader2Color();
                    Color copyHeader2Color = ((Color) strategy.copy(LocatorUtils.property(locator, "header2Color", sourceHeader2Color), sourceHeader2Color, (this.header2Color!= null)));
                    copy.setHeader2Color(copyHeader2Color);
                } else {
                    if (header2ColorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.header2Color = null;
                    }
                }
            }
            {
                Boolean header2FontColorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.header2FontColor!= null));
                if (header2FontColorShouldBeCopiedAndSet == Boolean.TRUE) {
                    Color sourceHeader2FontColor;
                    sourceHeader2FontColor = this.getHeader2FontColor();
                    Color copyHeader2FontColor = ((Color) strategy.copy(LocatorUtils.property(locator, "header2FontColor", sourceHeader2FontColor), sourceHeader2FontColor, (this.header2FontColor!= null)));
                    copy.setHeader2FontColor(copyHeader2FontColor);
                } else {
                    if (header2FontColorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.header2FontColor = null;
                    }
                }
            }
            {
                Boolean header3ColorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.header3Color!= null));
                if (header3ColorShouldBeCopiedAndSet == Boolean.TRUE) {
                    Color sourceHeader3Color;
                    sourceHeader3Color = this.getHeader3Color();
                    Color copyHeader3Color = ((Color) strategy.copy(LocatorUtils.property(locator, "header3Color", sourceHeader3Color), sourceHeader3Color, (this.header3Color!= null)));
                    copy.setHeader3Color(copyHeader3Color);
                } else {
                    if (header3ColorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.header3Color = null;
                    }
                }
            }
            {
                Boolean header3FontColorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.header3FontColor!= null));
                if (header3FontColorShouldBeCopiedAndSet == Boolean.TRUE) {
                    Color sourceHeader3FontColor;
                    sourceHeader3FontColor = this.getHeader3FontColor();
                    Color copyHeader3FontColor = ((Color) strategy.copy(LocatorUtils.property(locator, "header3FontColor", sourceHeader3FontColor), sourceHeader3FontColor, (this.header3FontColor!= null)));
                    copy.setHeader3FontColor(copyHeader3FontColor);
                } else {
                    if (header3FontColorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.header3FontColor = null;
                    }
                }
            }
            {
                Boolean identifierShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.identifier!= null));
                if (identifierShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceIdentifier;
                    sourceIdentifier = this.getIdentifier();
                    String copyIdentifier = ((String) strategy.copy(LocatorUtils.property(locator, "identifier", sourceIdentifier), sourceIdentifier, (this.identifier!= null)));
                    copy.setIdentifier(copyIdentifier);
                } else {
                    if (identifierShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.identifier = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new ContactMailCustomStyle();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ContactMailCustomStyle that = ((ContactMailCustomStyle) object);
        {
            Color lhsHeader1Color;
            lhsHeader1Color = this.getHeader1Color();
            Color rhsHeader1Color;
            rhsHeader1Color = that.getHeader1Color();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "header1Color", lhsHeader1Color), LocatorUtils.property(thatLocator, "header1Color", rhsHeader1Color), lhsHeader1Color, rhsHeader1Color, (this.header1Color!= null), (that.header1Color!= null))) {
                return false;
            }
        }
        {
            Color lhsHeader1FontColor;
            lhsHeader1FontColor = this.getHeader1FontColor();
            Color rhsHeader1FontColor;
            rhsHeader1FontColor = that.getHeader1FontColor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "header1FontColor", lhsHeader1FontColor), LocatorUtils.property(thatLocator, "header1FontColor", rhsHeader1FontColor), lhsHeader1FontColor, rhsHeader1FontColor, (this.header1FontColor!= null), (that.header1FontColor!= null))) {
                return false;
            }
        }
        {
            Color lhsHeader2Color;
            lhsHeader2Color = this.getHeader2Color();
            Color rhsHeader2Color;
            rhsHeader2Color = that.getHeader2Color();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "header2Color", lhsHeader2Color), LocatorUtils.property(thatLocator, "header2Color", rhsHeader2Color), lhsHeader2Color, rhsHeader2Color, (this.header2Color!= null), (that.header2Color!= null))) {
                return false;
            }
        }
        {
            Color lhsHeader2FontColor;
            lhsHeader2FontColor = this.getHeader2FontColor();
            Color rhsHeader2FontColor;
            rhsHeader2FontColor = that.getHeader2FontColor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "header2FontColor", lhsHeader2FontColor), LocatorUtils.property(thatLocator, "header2FontColor", rhsHeader2FontColor), lhsHeader2FontColor, rhsHeader2FontColor, (this.header2FontColor!= null), (that.header2FontColor!= null))) {
                return false;
            }
        }
        {
            Color lhsHeader3Color;
            lhsHeader3Color = this.getHeader3Color();
            Color rhsHeader3Color;
            rhsHeader3Color = that.getHeader3Color();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "header3Color", lhsHeader3Color), LocatorUtils.property(thatLocator, "header3Color", rhsHeader3Color), lhsHeader3Color, rhsHeader3Color, (this.header3Color!= null), (that.header3Color!= null))) {
                return false;
            }
        }
        {
            Color lhsHeader3FontColor;
            lhsHeader3FontColor = this.getHeader3FontColor();
            Color rhsHeader3FontColor;
            rhsHeader3FontColor = that.getHeader3FontColor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "header3FontColor", lhsHeader3FontColor), LocatorUtils.property(thatLocator, "header3FontColor", rhsHeader3FontColor), lhsHeader3FontColor, rhsHeader3FontColor, (this.header3FontColor!= null), (that.header3FontColor!= null))) {
                return false;
            }
        }
        {
            String lhsIdentifier;
            lhsIdentifier = this.getIdentifier();
            String rhsIdentifier;
            rhsIdentifier = that.getIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier, (this.identifier!= null), (that.identifier!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:36:25+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

}
