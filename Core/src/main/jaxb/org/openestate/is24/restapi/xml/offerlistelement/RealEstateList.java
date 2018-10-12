
package org.openestate.is24.restapi.xml.offerlistelement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for realEstateList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="realEstateList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="realEstateElement" type="{http://rest.immobilienscout24.de/schema/offer/listelement/1.0}OfferRealEstateForList" maxOccurs="100" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "realEstateList", propOrder = {
    "realEstateElement"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
public class RealEstateList implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    protected List<OfferRealEstateForList> realEstateElement;

    /**
     * Gets the value of the realEstateElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realEstateElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealEstateElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferRealEstateForList }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public List<OfferRealEstateForList> getRealEstateElement() {
        if (realEstateElement == null) {
            realEstateElement = new ArrayList<OfferRealEstateForList>();
        }
        return this.realEstateElement;
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
            List<OfferRealEstateForList> theRealEstateElement;
            theRealEstateElement = (((this.realEstateElement!= null)&&(!this.realEstateElement.isEmpty()))?this.getRealEstateElement():null);
            strategy.appendField(locator, this, "realEstateElement", buffer, theRealEstateElement, ((this.realEstateElement!= null)&&(!this.realEstateElement.isEmpty())));
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
        if (draftCopy instanceof RealEstateList) {
            final RealEstateList copy = ((RealEstateList) draftCopy);
            {
                Boolean realEstateElementShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.realEstateElement!= null)&&(!this.realEstateElement.isEmpty())));
                if (realEstateElementShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<OfferRealEstateForList> sourceRealEstateElement;
                    sourceRealEstateElement = (((this.realEstateElement!= null)&&(!this.realEstateElement.isEmpty()))?this.getRealEstateElement():null);
                    @SuppressWarnings("unchecked")
                    List<OfferRealEstateForList> copyRealEstateElement = ((List<OfferRealEstateForList> ) strategy.copy(LocatorUtils.property(locator, "realEstateElement", sourceRealEstateElement), sourceRealEstateElement, ((this.realEstateElement!= null)&&(!this.realEstateElement.isEmpty()))));
                    copy.realEstateElement = null;
                    if (copyRealEstateElement!= null) {
                        List<OfferRealEstateForList> uniqueRealEstateElementl = copy.getRealEstateElement();
                        uniqueRealEstateElementl.addAll(copyRealEstateElement);
                    }
                } else {
                    if (realEstateElementShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realEstateElement = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new RealEstateList();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RealEstateList that = ((RealEstateList) object);
        {
            List<OfferRealEstateForList> lhsRealEstateElement;
            lhsRealEstateElement = (((this.realEstateElement!= null)&&(!this.realEstateElement.isEmpty()))?this.getRealEstateElement():null);
            List<OfferRealEstateForList> rhsRealEstateElement;
            rhsRealEstateElement = (((that.realEstateElement!= null)&&(!that.realEstateElement.isEmpty()))?that.getRealEstateElement():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realEstateElement", lhsRealEstateElement), LocatorUtils.property(thatLocator, "realEstateElement", rhsRealEstateElement), lhsRealEstateElement, rhsRealEstateElement, ((this.realEstateElement!= null)&&(!this.realEstateElement.isEmpty())), ((that.realEstateElement!= null)&&(!that.realEstateElement.isEmpty())))) {
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
