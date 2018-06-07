
package org.openestate.is24.restapi.xml.premiumplacement;

import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
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
 * Liste von Premiumplacements
 * 
 * <p>Java class for Premiumplacements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Premiumplacements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="premiumplacement" type="{http://rest.immobilienscout24.de/schema/offer/premiumplacement/1.0}Premiumplacement" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "Premiumplacements", propOrder = {
    "premiumplacement"
})
public class Premiumplacements implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    protected List<Premiumplacement> premiumplacement;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "anyURI")
    protected URI href;

    /**
     * Gets the value of the premiumplacement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premiumplacement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremiumplacement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Premiumplacement }
     * 
     * 
     */
    public List<Premiumplacement> getPremiumplacement() {
        if (premiumplacement == null) {
            premiumplacement = new ArrayList<Premiumplacement>();
        }
        return this.premiumplacement;
    }

    /**
     * Link zum Element.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public void setHref(URI value) {
        this.href = value;
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
            List<Premiumplacement> thePremiumplacement;
            thePremiumplacement = (((this.premiumplacement!= null)&&(!this.premiumplacement.isEmpty()))?this.getPremiumplacement():null);
            strategy.appendField(locator, this, "premiumplacement", buffer, thePremiumplacement, ((this.premiumplacement!= null)&&(!this.premiumplacement.isEmpty())));
        }
        {
            URI theHref;
            theHref = this.getHref();
            strategy.appendField(locator, this, "href", buffer, theHref, (this.href!= null));
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
        if (draftCopy instanceof Premiumplacements) {
            final Premiumplacements copy = ((Premiumplacements) draftCopy);
            {
                Boolean premiumplacementShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.premiumplacement!= null)&&(!this.premiumplacement.isEmpty())));
                if (premiumplacementShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Premiumplacement> sourcePremiumplacement;
                    sourcePremiumplacement = (((this.premiumplacement!= null)&&(!this.premiumplacement.isEmpty()))?this.getPremiumplacement():null);
                    @SuppressWarnings("unchecked")
                    List<Premiumplacement> copyPremiumplacement = ((List<Premiumplacement> ) strategy.copy(LocatorUtils.property(locator, "premiumplacement", sourcePremiumplacement), sourcePremiumplacement, ((this.premiumplacement!= null)&&(!this.premiumplacement.isEmpty()))));
                    copy.premiumplacement = null;
                    if (copyPremiumplacement!= null) {
                        List<Premiumplacement> uniquePremiumplacementl = copy.getPremiumplacement();
                        uniquePremiumplacementl.addAll(copyPremiumplacement);
                    }
                } else {
                    if (premiumplacementShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.premiumplacement = null;
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

    public Object createNewInstance() {
        return new Premiumplacements();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Premiumplacements that = ((Premiumplacements) object);
        {
            List<Premiumplacement> lhsPremiumplacement;
            lhsPremiumplacement = (((this.premiumplacement!= null)&&(!this.premiumplacement.isEmpty()))?this.getPremiumplacement():null);
            List<Premiumplacement> rhsPremiumplacement;
            rhsPremiumplacement = (((that.premiumplacement!= null)&&(!that.premiumplacement.isEmpty()))?that.getPremiumplacement():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "premiumplacement", lhsPremiumplacement), LocatorUtils.property(thatLocator, "premiumplacement", rhsPremiumplacement), lhsPremiumplacement, rhsPremiumplacement, ((this.premiumplacement!= null)&&(!this.premiumplacement.isEmpty())), ((that.premiumplacement!= null)&&(!that.premiumplacement.isEmpty())))) {
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

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
