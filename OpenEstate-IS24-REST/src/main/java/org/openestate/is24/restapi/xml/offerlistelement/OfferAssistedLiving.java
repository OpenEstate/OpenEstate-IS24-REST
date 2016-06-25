
package org.openestate.is24.restapi.xml.offerlistelement;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
import org.openestate.is24.restapi.xml.common.FacilityType;
import org.openestate.is24.restapi.xml.common.MarketingType;
import org.openestate.is24.restapi.xml.common.PetsAllowedType;
import org.openestate.is24.restapi.xml.common.YesNotApplicableType;


/**
 * Seniorenwohnen
 * 
 * <p>Java class for OfferAssistedLiving complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferAssistedLiving"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/listelement/1.0}OfferRealEstateForList"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}BaseAssistedLivingGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferAssistedLiving", propOrder = {
    "shortDescription",
    "petsAllowed",
    "trialLivingPossible",
    "cookingPossibilty",
    "marketingType",
    "facilityType",
    "balcony"
})
public class OfferAssistedLiving
    extends OfferRealEstateForList
    implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    protected String shortDescription;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PetsAllowedType petsAllowed;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType trialLivingPossible;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected YesNotApplicableType cookingPossibilty;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MarketingType marketingType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FacilityType facilityType;
    protected boolean balcony;

    /**
     * Gets the value of the shortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

    /**
     * Gets the value of the petsAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link PetsAllowedType }
     *     
     */
    public PetsAllowedType getPetsAllowed() {
        return petsAllowed;
    }

    /**
     * Sets the value of the petsAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PetsAllowedType }
     *     
     */
    public void setPetsAllowed(PetsAllowedType value) {
        this.petsAllowed = value;
    }

    /**
     * Gets the value of the trialLivingPossible property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getTrialLivingPossible() {
        return trialLivingPossible;
    }

    /**
     * Sets the value of the trialLivingPossible property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setTrialLivingPossible(YesNotApplicableType value) {
        this.trialLivingPossible = value;
    }

    /**
     * Gets the value of the cookingPossibilty property.
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    public YesNotApplicableType getCookingPossibilty() {
        return cookingPossibilty;
    }

    /**
     * Sets the value of the cookingPossibilty property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     */
    public void setCookingPossibilty(YesNotApplicableType value) {
        this.cookingPossibilty = value;
    }

    /**
     * Gets the value of the marketingType property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingType }
     *     
     */
    public MarketingType getMarketingType() {
        return marketingType;
    }

    /**
     * Sets the value of the marketingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingType }
     *     
     */
    public void setMarketingType(MarketingType value) {
        this.marketingType = value;
    }

    /**
     * Gets the value of the facilityType property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityType }
     *     
     */
    public FacilityType getFacilityType() {
        return facilityType;
    }

    /**
     * Sets the value of the facilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityType }
     *     
     */
    public void setFacilityType(FacilityType value) {
        this.facilityType = value;
    }

    /**
     * Gets the value of the balcony property.
     * 
     */
    public boolean isBalcony() {
        return balcony;
    }

    /**
     * Sets the value of the balcony property.
     * 
     */
    public void setBalcony(boolean value) {
        this.balcony = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            String theShortDescription;
            theShortDescription = this.getShortDescription();
            strategy.appendField(locator, this, "shortDescription", buffer, theShortDescription, (this.shortDescription!= null));
        }
        {
            PetsAllowedType thePetsAllowed;
            thePetsAllowed = this.getPetsAllowed();
            strategy.appendField(locator, this, "petsAllowed", buffer, thePetsAllowed, (this.petsAllowed!= null));
        }
        {
            YesNotApplicableType theTrialLivingPossible;
            theTrialLivingPossible = this.getTrialLivingPossible();
            strategy.appendField(locator, this, "trialLivingPossible", buffer, theTrialLivingPossible, (this.trialLivingPossible!= null));
        }
        {
            YesNotApplicableType theCookingPossibilty;
            theCookingPossibilty = this.getCookingPossibilty();
            strategy.appendField(locator, this, "cookingPossibilty", buffer, theCookingPossibilty, (this.cookingPossibilty!= null));
        }
        {
            MarketingType theMarketingType;
            theMarketingType = this.getMarketingType();
            strategy.appendField(locator, this, "marketingType", buffer, theMarketingType, (this.marketingType!= null));
        }
        {
            FacilityType theFacilityType;
            theFacilityType = this.getFacilityType();
            strategy.appendField(locator, this, "facilityType", buffer, theFacilityType, (this.facilityType!= null));
        }
        {
            boolean theBalcony;
            theBalcony = this.isBalcony();
            strategy.appendField(locator, this, "balcony", buffer, theBalcony, true);
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
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof OfferAssistedLiving) {
            final OfferAssistedLiving copy = ((OfferAssistedLiving) draftCopy);
            {
                Boolean shortDescriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.shortDescription!= null));
                if (shortDescriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceShortDescription;
                    sourceShortDescription = this.getShortDescription();
                    String copyShortDescription = ((String) strategy.copy(LocatorUtils.property(locator, "shortDescription", sourceShortDescription), sourceShortDescription, (this.shortDescription!= null)));
                    copy.setShortDescription(copyShortDescription);
                } else {
                    if (shortDescriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.shortDescription = null;
                    }
                }
            }
            {
                Boolean petsAllowedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.petsAllowed!= null));
                if (petsAllowedShouldBeCopiedAndSet == Boolean.TRUE) {
                    PetsAllowedType sourcePetsAllowed;
                    sourcePetsAllowed = this.getPetsAllowed();
                    PetsAllowedType copyPetsAllowed = ((PetsAllowedType) strategy.copy(LocatorUtils.property(locator, "petsAllowed", sourcePetsAllowed), sourcePetsAllowed, (this.petsAllowed!= null)));
                    copy.setPetsAllowed(copyPetsAllowed);
                } else {
                    if (petsAllowedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.petsAllowed = null;
                    }
                }
            }
            {
                Boolean trialLivingPossibleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.trialLivingPossible!= null));
                if (trialLivingPossibleShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceTrialLivingPossible;
                    sourceTrialLivingPossible = this.getTrialLivingPossible();
                    YesNotApplicableType copyTrialLivingPossible = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "trialLivingPossible", sourceTrialLivingPossible), sourceTrialLivingPossible, (this.trialLivingPossible!= null)));
                    copy.setTrialLivingPossible(copyTrialLivingPossible);
                } else {
                    if (trialLivingPossibleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.trialLivingPossible = null;
                    }
                }
            }
            {
                Boolean cookingPossibiltyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.cookingPossibilty!= null));
                if (cookingPossibiltyShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceCookingPossibilty;
                    sourceCookingPossibilty = this.getCookingPossibilty();
                    YesNotApplicableType copyCookingPossibilty = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "cookingPossibilty", sourceCookingPossibilty), sourceCookingPossibilty, (this.cookingPossibilty!= null)));
                    copy.setCookingPossibilty(copyCookingPossibilty);
                } else {
                    if (cookingPossibiltyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cookingPossibilty = null;
                    }
                }
            }
            {
                Boolean marketingTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.marketingType!= null));
                if (marketingTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    MarketingType sourceMarketingType;
                    sourceMarketingType = this.getMarketingType();
                    MarketingType copyMarketingType = ((MarketingType) strategy.copy(LocatorUtils.property(locator, "marketingType", sourceMarketingType), sourceMarketingType, (this.marketingType!= null)));
                    copy.setMarketingType(copyMarketingType);
                } else {
                    if (marketingTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.marketingType = null;
                    }
                }
            }
            {
                Boolean facilityTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.facilityType!= null));
                if (facilityTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    FacilityType sourceFacilityType;
                    sourceFacilityType = this.getFacilityType();
                    FacilityType copyFacilityType = ((FacilityType) strategy.copy(LocatorUtils.property(locator, "facilityType", sourceFacilityType), sourceFacilityType, (this.facilityType!= null)));
                    copy.setFacilityType(copyFacilityType);
                } else {
                    if (facilityTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.facilityType = null;
                    }
                }
            }
            {
                Boolean balconyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (balconyShouldBeCopiedAndSet == Boolean.TRUE) {
                    boolean sourceBalcony;
                    sourceBalcony = this.isBalcony();
                    boolean copyBalcony = strategy.copy(LocatorUtils.property(locator, "balcony", sourceBalcony), sourceBalcony, true);
                    copy.setBalcony(copyBalcony);
                } else {
                    if (balconyShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new OfferAssistedLiving();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final OfferAssistedLiving that = ((OfferAssistedLiving) object);
        {
            String lhsShortDescription;
            lhsShortDescription = this.getShortDescription();
            String rhsShortDescription;
            rhsShortDescription = that.getShortDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shortDescription", lhsShortDescription), LocatorUtils.property(thatLocator, "shortDescription", rhsShortDescription), lhsShortDescription, rhsShortDescription, (this.shortDescription!= null), (that.shortDescription!= null))) {
                return false;
            }
        }
        {
            PetsAllowedType lhsPetsAllowed;
            lhsPetsAllowed = this.getPetsAllowed();
            PetsAllowedType rhsPetsAllowed;
            rhsPetsAllowed = that.getPetsAllowed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "petsAllowed", lhsPetsAllowed), LocatorUtils.property(thatLocator, "petsAllowed", rhsPetsAllowed), lhsPetsAllowed, rhsPetsAllowed, (this.petsAllowed!= null), (that.petsAllowed!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsTrialLivingPossible;
            lhsTrialLivingPossible = this.getTrialLivingPossible();
            YesNotApplicableType rhsTrialLivingPossible;
            rhsTrialLivingPossible = that.getTrialLivingPossible();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trialLivingPossible", lhsTrialLivingPossible), LocatorUtils.property(thatLocator, "trialLivingPossible", rhsTrialLivingPossible), lhsTrialLivingPossible, rhsTrialLivingPossible, (this.trialLivingPossible!= null), (that.trialLivingPossible!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCookingPossibilty;
            lhsCookingPossibilty = this.getCookingPossibilty();
            YesNotApplicableType rhsCookingPossibilty;
            rhsCookingPossibilty = that.getCookingPossibilty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cookingPossibilty", lhsCookingPossibilty), LocatorUtils.property(thatLocator, "cookingPossibilty", rhsCookingPossibilty), lhsCookingPossibilty, rhsCookingPossibilty, (this.cookingPossibilty!= null), (that.cookingPossibilty!= null))) {
                return false;
            }
        }
        {
            MarketingType lhsMarketingType;
            lhsMarketingType = this.getMarketingType();
            MarketingType rhsMarketingType;
            rhsMarketingType = that.getMarketingType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "marketingType", lhsMarketingType), LocatorUtils.property(thatLocator, "marketingType", rhsMarketingType), lhsMarketingType, rhsMarketingType, (this.marketingType!= null), (that.marketingType!= null))) {
                return false;
            }
        }
        {
            FacilityType lhsFacilityType;
            lhsFacilityType = this.getFacilityType();
            FacilityType rhsFacilityType;
            rhsFacilityType = that.getFacilityType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "facilityType", lhsFacilityType), LocatorUtils.property(thatLocator, "facilityType", rhsFacilityType), lhsFacilityType, rhsFacilityType, (this.facilityType!= null), (that.facilityType!= null))) {
                return false;
            }
        }
        {
            boolean lhsBalcony;
            lhsBalcony = this.isBalcony();
            boolean rhsBalcony;
            rhsBalcony = that.isBalcony();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balcony", lhsBalcony), LocatorUtils.property(thatLocator, "balcony", rhsBalcony), lhsBalcony, rhsBalcony, true, true)) {
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
