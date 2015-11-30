
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * Ein Preis der f\u00fcr Budgets benutzt wird
 * 
 * <p>Java class for BudgetPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BudgetPrice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}Price"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rentScope" type="{http://rest.immobilienscout24.de/schema/common/1.0}RentScopeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetPrice", propOrder = {
    "rentScope"
})
public class BudgetPrice
    extends Price
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlSchemaType(name = "string")
    protected RentScopeType rentScope;

    /**
     * Gets the value of the rentScope property.
     * 
     * @return
     *     possible object is
     *     {@link RentScopeType }
     *     
     */
    public RentScopeType getRentScope() {
        return rentScope;
    }

    /**
     * Sets the value of the rentScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link RentScopeType }
     *     
     */
    public void setRentScope(RentScopeType value) {
        this.rentScope = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            RentScopeType theRentScope;
            theRentScope = this.getRentScope();
            strategy.appendField(locator, this, "rentScope", buffer, theRentScope);
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
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof BudgetPrice) {
            final BudgetPrice copy = ((BudgetPrice) draftCopy);
            if (this.rentScope!= null) {
                RentScopeType sourceRentScope;
                sourceRentScope = this.getRentScope();
                RentScopeType copyRentScope = ((RentScopeType) strategy.copy(LocatorUtils.property(locator, "rentScope", sourceRentScope), sourceRentScope));
                copy.setRentScope(copyRentScope);
            } else {
                copy.rentScope = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new BudgetPrice();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final BudgetPrice that = ((BudgetPrice) object);
        {
            RentScopeType lhsRentScope;
            lhsRentScope = this.getRentScope();
            RentScopeType rhsRentScope;
            rhsRentScope = that.getRentScope();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rentScope", lhsRentScope), LocatorUtils.property(thatLocator, "rentScope", rhsRentScope), lhsRentScope, rhsRentScope)) {
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
