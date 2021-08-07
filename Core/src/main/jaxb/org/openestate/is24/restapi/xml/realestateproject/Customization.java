
package org.openestate.is24.restapi.xml.realestateproject;

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
 * <p>Java class for Customization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Customization"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="layoutColor" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="#(([0-9]|[a-f]){3}|([0-9]|[a-f]){6})"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="announcement" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="500"/&gt;
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
@XmlType(name = "Customization", propOrder = {
    "layoutColor",
    "announcement"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
public class Customization implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected Color layoutColor;
    @XmlJavaTypeAdapter(Adapter3 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected String announcement;

    /**
     * Gets the value of the layoutColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Color getLayoutColor() {
        return layoutColor;
    }

    /**
     * Sets the value of the layoutColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setLayoutColor(Color value) {
        this.layoutColor = value;
    }

    /**
     * Gets the value of the announcement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public String getAnnouncement() {
        return announcement;
    }

    /**
     * Sets the value of the announcement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setAnnouncement(String value) {
        this.announcement = value;
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
            Color theLayoutColor;
            theLayoutColor = this.getLayoutColor();
            strategy.appendField(locator, this, "layoutColor", buffer, theLayoutColor, (this.layoutColor!= null));
        }
        {
            String theAnnouncement;
            theAnnouncement = this.getAnnouncement();
            strategy.appendField(locator, this, "announcement", buffer, theAnnouncement, (this.announcement!= null));
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
        if (draftCopy instanceof Customization) {
            final Customization copy = ((Customization) draftCopy);
            {
                Boolean layoutColorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.layoutColor!= null));
                if (layoutColorShouldBeCopiedAndSet == Boolean.TRUE) {
                    Color sourceLayoutColor;
                    sourceLayoutColor = this.getLayoutColor();
                    Color copyLayoutColor = ((Color) strategy.copy(LocatorUtils.property(locator, "layoutColor", sourceLayoutColor), sourceLayoutColor, (this.layoutColor!= null)));
                    copy.setLayoutColor(copyLayoutColor);
                } else {
                    if (layoutColorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.layoutColor = null;
                    }
                }
            }
            {
                Boolean announcementShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.announcement!= null));
                if (announcementShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAnnouncement;
                    sourceAnnouncement = this.getAnnouncement();
                    String copyAnnouncement = ((String) strategy.copy(LocatorUtils.property(locator, "announcement", sourceAnnouncement), sourceAnnouncement, (this.announcement!= null)));
                    copy.setAnnouncement(copyAnnouncement);
                } else {
                    if (announcementShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.announcement = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new Customization();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Customization that = ((Customization) object);
        {
            Color lhsLayoutColor;
            lhsLayoutColor = this.getLayoutColor();
            Color rhsLayoutColor;
            rhsLayoutColor = that.getLayoutColor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "layoutColor", lhsLayoutColor), LocatorUtils.property(thatLocator, "layoutColor", rhsLayoutColor), lhsLayoutColor, rhsLayoutColor, (this.layoutColor!= null), (that.layoutColor!= null))) {
                return false;
            }
        }
        {
            String lhsAnnouncement;
            lhsAnnouncement = this.getAnnouncement();
            String rhsAnnouncement;
            rhsAnnouncement = that.getAnnouncement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "announcement", lhsAnnouncement), LocatorUtils.property(thatLocator, "announcement", rhsAnnouncement), lhsAnnouncement, rhsAnnouncement, (this.announcement!= null), (that.announcement!= null))) {
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
