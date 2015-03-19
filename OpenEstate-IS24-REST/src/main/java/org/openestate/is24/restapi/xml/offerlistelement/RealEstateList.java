
package org.openestate.is24.restapi.xml.offerlistelement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
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
 * <p>Java class for realEstateList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="realEstateList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="realEstateElement" type="{http://rest.immobilienscout24.de/schema/offer/listelement/1.0}OfferRealEstateForList" maxOccurs="100" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "realEstateList", propOrder = {
    "realEstateElement"
})
public class RealEstateList
    implements Cloneable, CopyTo, Equals, ToString
{

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
    public List<OfferRealEstateForList> getRealEstateElement() {
        if (realEstateElement == null) {
            realEstateElement = new ArrayList<OfferRealEstateForList>();
        }
        return this.realEstateElement;
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
            List<OfferRealEstateForList> theRealEstateElement;
            theRealEstateElement = (((this.realEstateElement!= null)&&(!this.realEstateElement.isEmpty()))?this.getRealEstateElement():null);
            strategy.appendField(locator, this, "realEstateElement", buffer, theRealEstateElement);
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
        if (draftCopy instanceof RealEstateList) {
            final RealEstateList copy = ((RealEstateList) draftCopy);
            if ((this.realEstateElement!= null)&&(!this.realEstateElement.isEmpty())) {
                List<OfferRealEstateForList> sourceRealEstateElement;
                sourceRealEstateElement = (((this.realEstateElement!= null)&&(!this.realEstateElement.isEmpty()))?this.getRealEstateElement():null);
                @SuppressWarnings("unchecked")
                List<OfferRealEstateForList> copyRealEstateElement = ((List<OfferRealEstateForList> ) strategy.copy(LocatorUtils.property(locator, "realEstateElement", sourceRealEstateElement), sourceRealEstateElement));
                copy.realEstateElement = null;
                if (copyRealEstateElement!= null) {
                    List<OfferRealEstateForList> uniqueRealEstateElementl = copy.getRealEstateElement();
                    uniqueRealEstateElementl.addAll(copyRealEstateElement);
                }
            } else {
                copy.realEstateElement = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new RealEstateList();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RealEstateList)) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realEstateElement", lhsRealEstateElement), LocatorUtils.property(thatLocator, "realEstateElement", rhsRealEstateElement), lhsRealEstateElement, rhsRealEstateElement)) {
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
