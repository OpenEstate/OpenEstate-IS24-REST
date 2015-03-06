
package org.openestate.is24.restapi.xml.offerlistelement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
import org.openestate.is24.restapi.xml.common.CourtageInfo;
import org.openestate.is24.restapi.xml.common.Price;


/**
 * Eigenschaften f\u00fcr den Wohnung-Kauf Immobilientyp.
 * 
 * <p>Java class for OfferApartmentBuy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferApartmentBuy">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/listelement/1.0}OfferRealEstateForList">
 *       &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}BaseApartmentBuyGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferApartmentBuy", propOrder = {
    "price",
    "livingSpace",
    "numberOfRooms",
    "energyPerformanceCertificate",
    "builtInKitchen",
    "balcony",
    "certificateOfEligibilityNeeded",
    "garden",
    "courtage"
})
public class OfferApartmentBuy
    extends OfferRealEstateForList
    implements Cloneable, CopyTo, Equals, ToString
{

    protected Price price;
    protected double livingSpace;
    protected double numberOfRooms;
    protected Boolean energyPerformanceCertificate;
    protected Boolean builtInKitchen;
    protected Boolean balcony;
    protected Boolean certificateOfEligibilityNeeded;
    protected Boolean garden;
    @XmlElement(required = true)
    protected CourtageInfo courtage;

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setPrice(Price value) {
        this.price = value;
    }

    /**
     * Gets the value of the livingSpace property.
     * 
     */
    public double getLivingSpace() {
        return livingSpace;
    }

    /**
     * Sets the value of the livingSpace property.
     * 
     */
    public void setLivingSpace(double value) {
        this.livingSpace = value;
    }

    /**
     * Gets the value of the numberOfRooms property.
     * 
     */
    public double getNumberOfRooms() {
        return numberOfRooms;
    }

    /**
     * Sets the value of the numberOfRooms property.
     * 
     */
    public void setNumberOfRooms(double value) {
        this.numberOfRooms = value;
    }

    /**
     * Gets the value of the energyPerformanceCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnergyPerformanceCertificate() {
        return energyPerformanceCertificate;
    }

    /**
     * Sets the value of the energyPerformanceCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnergyPerformanceCertificate(Boolean value) {
        this.energyPerformanceCertificate = value;
    }

    /**
     * Gets the value of the builtInKitchen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuiltInKitchen() {
        return builtInKitchen;
    }

    /**
     * Sets the value of the builtInKitchen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuiltInKitchen(Boolean value) {
        this.builtInKitchen = value;
    }

    /**
     * Gets the value of the balcony property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBalcony() {
        return balcony;
    }

    /**
     * Sets the value of the balcony property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBalcony(Boolean value) {
        this.balcony = value;
    }

    /**
     * Gets the value of the certificateOfEligibilityNeeded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCertificateOfEligibilityNeeded() {
        return certificateOfEligibilityNeeded;
    }

    /**
     * Sets the value of the certificateOfEligibilityNeeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCertificateOfEligibilityNeeded(Boolean value) {
        this.certificateOfEligibilityNeeded = value;
    }

    /**
     * Gets the value of the garden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGarden() {
        return garden;
    }

    /**
     * Sets the value of the garden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGarden(Boolean value) {
        this.garden = value;
    }

    /**
     * Gets the value of the courtage property.
     * 
     * @return
     *     possible object is
     *     {@link CourtageInfo }
     *     
     */
    public CourtageInfo getCourtage() {
        return courtage;
    }

    /**
     * Sets the value of the courtage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourtageInfo }
     *     
     */
    public void setCourtage(CourtageInfo value) {
        this.courtage = value;
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
            Price thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice);
        }
        {
            double theLivingSpace;
            theLivingSpace = this.getLivingSpace();
            strategy.appendField(locator, this, "livingSpace", buffer, theLivingSpace);
        }
        {
            double theNumberOfRooms;
            theNumberOfRooms = this.getNumberOfRooms();
            strategy.appendField(locator, this, "numberOfRooms", buffer, theNumberOfRooms);
        }
        {
            Boolean theEnergyPerformanceCertificate;
            theEnergyPerformanceCertificate = this.isEnergyPerformanceCertificate();
            strategy.appendField(locator, this, "energyPerformanceCertificate", buffer, theEnergyPerformanceCertificate);
        }
        {
            Boolean theBuiltInKitchen;
            theBuiltInKitchen = this.isBuiltInKitchen();
            strategy.appendField(locator, this, "builtInKitchen", buffer, theBuiltInKitchen);
        }
        {
            Boolean theBalcony;
            theBalcony = this.isBalcony();
            strategy.appendField(locator, this, "balcony", buffer, theBalcony);
        }
        {
            Boolean theCertificateOfEligibilityNeeded;
            theCertificateOfEligibilityNeeded = this.isCertificateOfEligibilityNeeded();
            strategy.appendField(locator, this, "certificateOfEligibilityNeeded", buffer, theCertificateOfEligibilityNeeded);
        }
        {
            Boolean theGarden;
            theGarden = this.isGarden();
            strategy.appendField(locator, this, "garden", buffer, theGarden);
        }
        {
            CourtageInfo theCourtage;
            theCourtage = this.getCourtage();
            strategy.appendField(locator, this, "courtage", buffer, theCourtage);
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
        if (draftCopy instanceof OfferApartmentBuy) {
            final OfferApartmentBuy copy = ((OfferApartmentBuy) draftCopy);
            if (this.price!= null) {
                Price sourcePrice;
                sourcePrice = this.getPrice();
                Price copyPrice = ((Price) strategy.copy(LocatorUtils.property(locator, "price", sourcePrice), sourcePrice));
                copy.setPrice(copyPrice);
            } else {
                copy.price = null;
            }
            {
                double sourceLivingSpace;
                sourceLivingSpace = this.getLivingSpace();
                double copyLivingSpace = strategy.copy(LocatorUtils.property(locator, "livingSpace", sourceLivingSpace), sourceLivingSpace);
                copy.setLivingSpace(copyLivingSpace);
            }
            {
                double sourceNumberOfRooms;
                sourceNumberOfRooms = this.getNumberOfRooms();
                double copyNumberOfRooms = strategy.copy(LocatorUtils.property(locator, "numberOfRooms", sourceNumberOfRooms), sourceNumberOfRooms);
                copy.setNumberOfRooms(copyNumberOfRooms);
            }
            if (this.energyPerformanceCertificate!= null) {
                Boolean sourceEnergyPerformanceCertificate;
                sourceEnergyPerformanceCertificate = this.isEnergyPerformanceCertificate();
                Boolean copyEnergyPerformanceCertificate = ((Boolean) strategy.copy(LocatorUtils.property(locator, "energyPerformanceCertificate", sourceEnergyPerformanceCertificate), sourceEnergyPerformanceCertificate));
                copy.setEnergyPerformanceCertificate(copyEnergyPerformanceCertificate);
            } else {
                copy.energyPerformanceCertificate = null;
            }
            if (this.builtInKitchen!= null) {
                Boolean sourceBuiltInKitchen;
                sourceBuiltInKitchen = this.isBuiltInKitchen();
                Boolean copyBuiltInKitchen = ((Boolean) strategy.copy(LocatorUtils.property(locator, "builtInKitchen", sourceBuiltInKitchen), sourceBuiltInKitchen));
                copy.setBuiltInKitchen(copyBuiltInKitchen);
            } else {
                copy.builtInKitchen = null;
            }
            if (this.balcony!= null) {
                Boolean sourceBalcony;
                sourceBalcony = this.isBalcony();
                Boolean copyBalcony = ((Boolean) strategy.copy(LocatorUtils.property(locator, "balcony", sourceBalcony), sourceBalcony));
                copy.setBalcony(copyBalcony);
            } else {
                copy.balcony = null;
            }
            if (this.certificateOfEligibilityNeeded!= null) {
                Boolean sourceCertificateOfEligibilityNeeded;
                sourceCertificateOfEligibilityNeeded = this.isCertificateOfEligibilityNeeded();
                Boolean copyCertificateOfEligibilityNeeded = ((Boolean) strategy.copy(LocatorUtils.property(locator, "certificateOfEligibilityNeeded", sourceCertificateOfEligibilityNeeded), sourceCertificateOfEligibilityNeeded));
                copy.setCertificateOfEligibilityNeeded(copyCertificateOfEligibilityNeeded);
            } else {
                copy.certificateOfEligibilityNeeded = null;
            }
            if (this.garden!= null) {
                Boolean sourceGarden;
                sourceGarden = this.isGarden();
                Boolean copyGarden = ((Boolean) strategy.copy(LocatorUtils.property(locator, "garden", sourceGarden), sourceGarden));
                copy.setGarden(copyGarden);
            } else {
                copy.garden = null;
            }
            if (this.courtage!= null) {
                CourtageInfo sourceCourtage;
                sourceCourtage = this.getCourtage();
                CourtageInfo copyCourtage = ((CourtageInfo) strategy.copy(LocatorUtils.property(locator, "courtage", sourceCourtage), sourceCourtage));
                copy.setCourtage(copyCourtage);
            } else {
                copy.courtage = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new OfferApartmentBuy();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OfferApartmentBuy)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final OfferApartmentBuy that = ((OfferApartmentBuy) object);
        {
            Price lhsPrice;
            lhsPrice = this.getPrice();
            Price rhsPrice;
            rhsPrice = that.getPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "price", lhsPrice), LocatorUtils.property(thatLocator, "price", rhsPrice), lhsPrice, rhsPrice)) {
                return false;
            }
        }
        {
            double lhsLivingSpace;
            lhsLivingSpace = this.getLivingSpace();
            double rhsLivingSpace;
            rhsLivingSpace = that.getLivingSpace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "livingSpace", lhsLivingSpace), LocatorUtils.property(thatLocator, "livingSpace", rhsLivingSpace), lhsLivingSpace, rhsLivingSpace)) {
                return false;
            }
        }
        {
            double lhsNumberOfRooms;
            lhsNumberOfRooms = this.getNumberOfRooms();
            double rhsNumberOfRooms;
            rhsNumberOfRooms = that.getNumberOfRooms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfRooms", lhsNumberOfRooms), LocatorUtils.property(thatLocator, "numberOfRooms", rhsNumberOfRooms), lhsNumberOfRooms, rhsNumberOfRooms)) {
                return false;
            }
        }
        {
            Boolean lhsEnergyPerformanceCertificate;
            lhsEnergyPerformanceCertificate = this.isEnergyPerformanceCertificate();
            Boolean rhsEnergyPerformanceCertificate;
            rhsEnergyPerformanceCertificate = that.isEnergyPerformanceCertificate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyPerformanceCertificate", lhsEnergyPerformanceCertificate), LocatorUtils.property(thatLocator, "energyPerformanceCertificate", rhsEnergyPerformanceCertificate), lhsEnergyPerformanceCertificate, rhsEnergyPerformanceCertificate)) {
                return false;
            }
        }
        {
            Boolean lhsBuiltInKitchen;
            lhsBuiltInKitchen = this.isBuiltInKitchen();
            Boolean rhsBuiltInKitchen;
            rhsBuiltInKitchen = that.isBuiltInKitchen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "builtInKitchen", lhsBuiltInKitchen), LocatorUtils.property(thatLocator, "builtInKitchen", rhsBuiltInKitchen), lhsBuiltInKitchen, rhsBuiltInKitchen)) {
                return false;
            }
        }
        {
            Boolean lhsBalcony;
            lhsBalcony = this.isBalcony();
            Boolean rhsBalcony;
            rhsBalcony = that.isBalcony();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balcony", lhsBalcony), LocatorUtils.property(thatLocator, "balcony", rhsBalcony), lhsBalcony, rhsBalcony)) {
                return false;
            }
        }
        {
            Boolean lhsCertificateOfEligibilityNeeded;
            lhsCertificateOfEligibilityNeeded = this.isCertificateOfEligibilityNeeded();
            Boolean rhsCertificateOfEligibilityNeeded;
            rhsCertificateOfEligibilityNeeded = that.isCertificateOfEligibilityNeeded();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "certificateOfEligibilityNeeded", lhsCertificateOfEligibilityNeeded), LocatorUtils.property(thatLocator, "certificateOfEligibilityNeeded", rhsCertificateOfEligibilityNeeded), lhsCertificateOfEligibilityNeeded, rhsCertificateOfEligibilityNeeded)) {
                return false;
            }
        }
        {
            Boolean lhsGarden;
            lhsGarden = this.isGarden();
            Boolean rhsGarden;
            rhsGarden = that.isGarden();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "garden", lhsGarden), LocatorUtils.property(thatLocator, "garden", rhsGarden), lhsGarden, rhsGarden)) {
                return false;
            }
        }
        {
            CourtageInfo lhsCourtage;
            lhsCourtage = this.getCourtage();
            CourtageInfo rhsCourtage;
            rhsCourtage = that.getCourtage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "courtage", lhsCourtage), LocatorUtils.property(thatLocator, "courtage", rhsCourtage), lhsCourtage, rhsCourtage)) {
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
