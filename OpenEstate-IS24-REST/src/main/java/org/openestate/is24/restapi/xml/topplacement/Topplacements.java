
package org.openestate.is24.restapi.xml.topplacement;

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
import org.openestate.is24.restapi.xml.Adapter4;


/**
 * Liste von Topplacements
 * 
 * <p>Java class for Topplacements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Topplacements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="topplacement" type="{http://rest.immobilienscout24.de/schema/offer/topplacement/1.0}Topplacement" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "Topplacements", propOrder = {
    "topplacement"
})
public class Topplacements
    implements Cloneable, CopyTo, Equals, ToString
{

    protected List<Topplacement> topplacement;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "anyURI")
    protected URL href;

    /**
     * Gets the value of the topplacement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topplacement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopplacement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Topplacement }
     * 
     * 
     */
    public List<Topplacement> getTopplacement() {
        if (topplacement == null) {
            topplacement = new ArrayList<Topplacement>();
        }
        return this.topplacement;
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
            List<Topplacement> theTopplacement;
            theTopplacement = (((this.topplacement!= null)&&(!this.topplacement.isEmpty()))?this.getTopplacement():null);
            strategy.appendField(locator, this, "topplacement", buffer, theTopplacement);
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
        if (draftCopy instanceof Topplacements) {
            final Topplacements copy = ((Topplacements) draftCopy);
            if ((this.topplacement!= null)&&(!this.topplacement.isEmpty())) {
                List<Topplacement> sourceTopplacement;
                sourceTopplacement = (((this.topplacement!= null)&&(!this.topplacement.isEmpty()))?this.getTopplacement():null);
                @SuppressWarnings("unchecked")
                List<Topplacement> copyTopplacement = ((List<Topplacement> ) strategy.copy(LocatorUtils.property(locator, "topplacement", sourceTopplacement), sourceTopplacement));
                copy.topplacement = null;
                if (copyTopplacement!= null) {
                    List<Topplacement> uniqueTopplacementl = copy.getTopplacement();
                    uniqueTopplacementl.addAll(copyTopplacement);
                }
            } else {
                copy.topplacement = null;
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
        return new Topplacements();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Topplacements)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Topplacements that = ((Topplacements) object);
        {
            List<Topplacement> lhsTopplacement;
            lhsTopplacement = (((this.topplacement!= null)&&(!this.topplacement.isEmpty()))?this.getTopplacement():null);
            List<Topplacement> rhsTopplacement;
            rhsTopplacement = (((that.topplacement!= null)&&(!that.topplacement.isEmpty()))?that.getTopplacement():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "topplacement", lhsTopplacement), LocatorUtils.property(thatLocator, "topplacement", rhsTopplacement), lhsTopplacement, rhsTopplacement)) {
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
