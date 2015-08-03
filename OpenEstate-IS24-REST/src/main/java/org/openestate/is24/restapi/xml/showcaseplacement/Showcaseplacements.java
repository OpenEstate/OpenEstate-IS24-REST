
package org.openestate.is24.restapi.xml.showcaseplacement;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
import org.openestate.is24.restapi.xml.Adapter3;


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
public class Showcaseplacements
    implements Cloneable, CopyTo, Equals, ToString
{

    protected List<Showcaseplacement> showcaseplacement;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "anyURI")
    protected URL href;

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
    public URL getHref() {
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
    public void setHref(URL value) {
        this.href = value;
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
            List<Showcaseplacement> theShowcaseplacement;
            theShowcaseplacement = (((this.showcaseplacement!= null)&&(!this.showcaseplacement.isEmpty()))?this.getShowcaseplacement():null);
            strategy.appendField(locator, this, "showcaseplacement", buffer, theShowcaseplacement);
        }
        {
            URL theHref;
            theHref = this.getHref();
            strategy.appendField(locator, this, "href", buffer, theHref);
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
        if (draftCopy instanceof Showcaseplacements) {
            final Showcaseplacements copy = ((Showcaseplacements) draftCopy);
            if ((this.showcaseplacement!= null)&&(!this.showcaseplacement.isEmpty())) {
                List<Showcaseplacement> sourceShowcaseplacement;
                sourceShowcaseplacement = (((this.showcaseplacement!= null)&&(!this.showcaseplacement.isEmpty()))?this.getShowcaseplacement():null);
                @SuppressWarnings("unchecked")
                List<Showcaseplacement> copyShowcaseplacement = ((List<Showcaseplacement> ) strategy.copy(LocatorUtils.property(locator, "showcaseplacement", sourceShowcaseplacement), sourceShowcaseplacement));
                copy.showcaseplacement = null;
                if (copyShowcaseplacement!= null) {
                    List<Showcaseplacement> uniqueShowcaseplacementl = copy.getShowcaseplacement();
                    uniqueShowcaseplacementl.addAll(copyShowcaseplacement);
                }
            } else {
                copy.showcaseplacement = null;
            }
            if (this.href!= null) {
                URL sourceHref;
                sourceHref = this.getHref();
                URL copyHref = ((URL) strategy.copy(LocatorUtils.property(locator, "href", sourceHref), sourceHref));
                copy.setHref(copyHref);
            } else {
                copy.href = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Showcaseplacements();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Showcaseplacements)) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "showcaseplacement", lhsShowcaseplacement), LocatorUtils.property(thatLocator, "showcaseplacement", rhsShowcaseplacement), lhsShowcaseplacement, rhsShowcaseplacement)) {
                return false;
            }
        }
        {
            URL lhsHref;
            lhsHref = this.getHref();
            URL rhsHref;
            rhsHref = that.getHref();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "href", lhsHref), LocatorUtils.property(thatLocator, "href", rhsHref), lhsHref, rhsHref)) {
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
