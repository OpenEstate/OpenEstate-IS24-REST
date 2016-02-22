
package org.openestate.is24.restapi.xml.offeruser;

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
 * <p>Java class for customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contractContactDetails" type="{http://rest.immobilienscout24.de/schema/offer/user/1.0}contractContactDetails" minOccurs="0"/&gt;
 *         &lt;element name="professional" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customer", propOrder = {
    "contractContactDetails",
    "professional"
})
public class Customer implements Cloneable, CopyTo2, Equals2, ToString2
{

    protected ContractContactDetails contractContactDetails;
    protected boolean professional;

    /**
     * Gets the value of the contractContactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ContractContactDetails }
     *     
     */
    public ContractContactDetails getContractContactDetails() {
        return contractContactDetails;
    }

    /**
     * Sets the value of the contractContactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractContactDetails }
     *     
     */
    public void setContractContactDetails(ContractContactDetails value) {
        this.contractContactDetails = value;
    }

    /**
     * Gets the value of the professional property.
     * 
     */
    public boolean isProfessional() {
        return professional;
    }

    /**
     * Sets the value of the professional property.
     * 
     */
    public void setProfessional(boolean value) {
        this.professional = value;
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
            ContractContactDetails theContractContactDetails;
            theContractContactDetails = this.getContractContactDetails();
            strategy.appendField(locator, this, "contractContactDetails", buffer, theContractContactDetails, (this.contractContactDetails!= null));
        }
        {
            boolean theProfessional;
            theProfessional = this.isProfessional();
            strategy.appendField(locator, this, "professional", buffer, theProfessional, true);
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
        if (draftCopy instanceof Customer) {
            final Customer copy = ((Customer) draftCopy);
            {
                Boolean contractContactDetailsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.contractContactDetails!= null));
                if (contractContactDetailsShouldBeCopiedAndSet == Boolean.TRUE) {
                    ContractContactDetails sourceContractContactDetails;
                    sourceContractContactDetails = this.getContractContactDetails();
                    ContractContactDetails copyContractContactDetails = ((ContractContactDetails) strategy.copy(LocatorUtils.property(locator, "contractContactDetails", sourceContractContactDetails), sourceContractContactDetails, (this.contractContactDetails!= null)));
                    copy.setContractContactDetails(copyContractContactDetails);
                } else {
                    if (contractContactDetailsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.contractContactDetails = null;
                    }
                }
            }
            {
                Boolean professionalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (professionalShouldBeCopiedAndSet == Boolean.TRUE) {
                    boolean sourceProfessional;
                    sourceProfessional = this.isProfessional();
                    boolean copyProfessional = strategy.copy(LocatorUtils.property(locator, "professional", sourceProfessional), sourceProfessional, true);
                    copy.setProfessional(copyProfessional);
                } else {
                    if (professionalShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Customer();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Customer that = ((Customer) object);
        {
            ContractContactDetails lhsContractContactDetails;
            lhsContractContactDetails = this.getContractContactDetails();
            ContractContactDetails rhsContractContactDetails;
            rhsContractContactDetails = that.getContractContactDetails();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractContactDetails", lhsContractContactDetails), LocatorUtils.property(thatLocator, "contractContactDetails", rhsContractContactDetails), lhsContractContactDetails, rhsContractContactDetails, (this.contractContactDetails!= null), (that.contractContactDetails!= null))) {
                return false;
            }
        }
        {
            boolean lhsProfessional;
            lhsProfessional = this.isProfessional();
            boolean rhsProfessional;
            rhsProfessional = that.isProfessional();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "professional", lhsProfessional), LocatorUtils.property(thatLocator, "professional", rhsProfessional), lhsProfessional, rhsProfessional, true, true)) {
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
