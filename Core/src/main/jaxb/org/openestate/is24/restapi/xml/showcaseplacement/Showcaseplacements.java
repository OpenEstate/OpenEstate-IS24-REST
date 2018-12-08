
package org.openestate.is24.restapi.xml.showcaseplacement;

import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
import org.openestate.is24.restapi.xml.Adapter4;


/**
 * Liste von Schaufensterplatzierungen
 * 
 * <p>Java class for Showcaseplacements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Showcaseplacements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="showcaseplacement" type="{http://rest.immobilienscout24.de/schema/offer/showcaseplacement/1.0}Showcaseplacement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}href"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Showcaseplacements", propOrder = {
    "showcaseplacement"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
public class Showcaseplacements implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected List<Showcaseplacement> showcaseplacement;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected URI href;

    /**
     * Gets the value of the showcaseplacement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the showcaseplacement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShowcaseplacement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Showcaseplacement }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public List<Showcaseplacement> getShowcaseplacement() {
        if (showcaseplacement == null) {
            showcaseplacement = new ArrayList<Showcaseplacement>();
        }
        return this.showcaseplacement;
    }

    /**
     * Link zum Element.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public URI getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public void setHref(URI value) {
        this.href = value;
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
            List<Showcaseplacement> theShowcaseplacement;
            theShowcaseplacement = (((this.showcaseplacement!= null)&&(!this.showcaseplacement.isEmpty()))?this.getShowcaseplacement():null);
            strategy.appendField(locator, this, "showcaseplacement", buffer, theShowcaseplacement, ((this.showcaseplacement!= null)&&(!this.showcaseplacement.isEmpty())));
        }
        {
            URI theHref;
            theHref = this.getHref();
            strategy.appendField(locator, this, "href", buffer, theHref, (this.href!= null));
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
        if (draftCopy instanceof Showcaseplacements) {
            final Showcaseplacements copy = ((Showcaseplacements) draftCopy);
            {
                Boolean showcaseplacementShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.showcaseplacement!= null)&&(!this.showcaseplacement.isEmpty())));
                if (showcaseplacementShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Showcaseplacement> sourceShowcaseplacement;
                    sourceShowcaseplacement = (((this.showcaseplacement!= null)&&(!this.showcaseplacement.isEmpty()))?this.getShowcaseplacement():null);
                    @SuppressWarnings("unchecked")
                    List<Showcaseplacement> copyShowcaseplacement = ((List<Showcaseplacement> ) strategy.copy(LocatorUtils.property(locator, "showcaseplacement", sourceShowcaseplacement), sourceShowcaseplacement, ((this.showcaseplacement!= null)&&(!this.showcaseplacement.isEmpty()))));
                    copy.showcaseplacement = null;
                    if (copyShowcaseplacement!= null) {
                        List<Showcaseplacement> uniqueShowcaseplacementl = copy.getShowcaseplacement();
                        uniqueShowcaseplacementl.addAll(copyShowcaseplacement);
                    }
                } else {
                    if (showcaseplacementShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.showcaseplacement = null;
                    }
                }
            }
            {
                Boolean hrefShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.href!= null));
                if (hrefShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceHref;
                    sourceHref = this.getHref();
                    URI copyHref = ((URI) strategy.copy(LocatorUtils.property(locator, "href", sourceHref), sourceHref, (this.href!= null)));
                    copy.setHref(copyHref);
                } else {
                    if (hrefShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.href = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new Showcaseplacements();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Showcaseplacements that = ((Showcaseplacements) object);
        {
            List<Showcaseplacement> lhsShowcaseplacement;
            lhsShowcaseplacement = (((this.showcaseplacement!= null)&&(!this.showcaseplacement.isEmpty()))?this.getShowcaseplacement():null);
            List<Showcaseplacement> rhsShowcaseplacement;
            rhsShowcaseplacement = (((that.showcaseplacement!= null)&&(!that.showcaseplacement.isEmpty()))?that.getShowcaseplacement():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "showcaseplacement", lhsShowcaseplacement), LocatorUtils.property(thatLocator, "showcaseplacement", rhsShowcaseplacement), lhsShowcaseplacement, rhsShowcaseplacement, ((this.showcaseplacement!= null)&&(!this.showcaseplacement.isEmpty())), ((that.showcaseplacement!= null)&&(!that.showcaseplacement.isEmpty())))) {
                return false;
            }
        }
        {
            URI lhsHref;
            lhsHref = this.getHref();
            URI rhsHref;
            rhsHref = that.getHref();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "href", lhsHref), LocatorUtils.property(thatLocator, "href", rhsHref), lhsHref, rhsHref, (this.href!= null), (that.href!= null))) {
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
