
package org.openestate.is24.restapi.xml.offerlistelement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
import org.openestate.is24.restapi.xml.common.Price;


/**
 * Zwangsversteigerungsobjekte.
 * 
 * <p>Java class for OfferCompulsoryAuction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferCompulsoryAuction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/listelement/1.0}OfferRealEstateForList"&gt;
 *       &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}BaseCompulsoryAuctionGroup"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferCompulsoryAuction", propOrder = {
    "marketValue",
    "lowestBid",
    "recurrenceAppointment"
})
public class OfferCompulsoryAuction
    extends OfferRealEstateForList
    implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    protected Price marketValue;
    protected Price lowestBid;
    @XmlElement(defaultValue = "false")
    protected Boolean recurrenceAppointment;

    /**
     * Gets the value of the marketValue property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getMarketValue() {
        return marketValue;
    }

    /**
     * Sets the value of the marketValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setMarketValue(Price value) {
        this.marketValue = value;
    }

    /**
     * Gets the value of the lowestBid property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getLowestBid() {
        return lowestBid;
    }

    /**
     * Sets the value of the lowestBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setLowestBid(Price value) {
        this.lowestBid = value;
    }

    /**
     * Gets the value of the recurrenceAppointment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecurrenceAppointment() {
        return recurrenceAppointment;
    }

    /**
     * Sets the value of the recurrenceAppointment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecurrenceAppointment(Boolean value) {
        this.recurrenceAppointment = value;
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
            Price theMarketValue;
            theMarketValue = this.getMarketValue();
            strategy.appendField(locator, this, "marketValue", buffer, theMarketValue, (this.marketValue!= null));
        }
        {
            Price theLowestBid;
            theLowestBid = this.getLowestBid();
            strategy.appendField(locator, this, "lowestBid", buffer, theLowestBid, (this.lowestBid!= null));
        }
        {
            Boolean theRecurrenceAppointment;
            theRecurrenceAppointment = this.isRecurrenceAppointment();
            strategy.appendField(locator, this, "recurrenceAppointment", buffer, theRecurrenceAppointment, (this.recurrenceAppointment!= null));
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
        if (draftCopy instanceof OfferCompulsoryAuction) {
            final OfferCompulsoryAuction copy = ((OfferCompulsoryAuction) draftCopy);
            {
                Boolean marketValueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.marketValue!= null));
                if (marketValueShouldBeCopiedAndSet == Boolean.TRUE) {
                    Price sourceMarketValue;
                    sourceMarketValue = this.getMarketValue();
                    Price copyMarketValue = ((Price) strategy.copy(LocatorUtils.property(locator, "marketValue", sourceMarketValue), sourceMarketValue, (this.marketValue!= null)));
                    copy.setMarketValue(copyMarketValue);
                } else {
                    if (marketValueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.marketValue = null;
                    }
                }
            }
            {
                Boolean lowestBidShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lowestBid!= null));
                if (lowestBidShouldBeCopiedAndSet == Boolean.TRUE) {
                    Price sourceLowestBid;
                    sourceLowestBid = this.getLowestBid();
                    Price copyLowestBid = ((Price) strategy.copy(LocatorUtils.property(locator, "lowestBid", sourceLowestBid), sourceLowestBid, (this.lowestBid!= null)));
                    copy.setLowestBid(copyLowestBid);
                } else {
                    if (lowestBidShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lowestBid = null;
                    }
                }
            }
            {
                Boolean recurrenceAppointmentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.recurrenceAppointment!= null));
                if (recurrenceAppointmentShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceRecurrenceAppointment;
                    sourceRecurrenceAppointment = this.isRecurrenceAppointment();
                    Boolean copyRecurrenceAppointment = ((Boolean) strategy.copy(LocatorUtils.property(locator, "recurrenceAppointment", sourceRecurrenceAppointment), sourceRecurrenceAppointment, (this.recurrenceAppointment!= null)));
                    copy.setRecurrenceAppointment(copyRecurrenceAppointment);
                } else {
                    if (recurrenceAppointmentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.recurrenceAppointment = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new OfferCompulsoryAuction();
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
        final OfferCompulsoryAuction that = ((OfferCompulsoryAuction) object);
        {
            Price lhsMarketValue;
            lhsMarketValue = this.getMarketValue();
            Price rhsMarketValue;
            rhsMarketValue = that.getMarketValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "marketValue", lhsMarketValue), LocatorUtils.property(thatLocator, "marketValue", rhsMarketValue), lhsMarketValue, rhsMarketValue, (this.marketValue!= null), (that.marketValue!= null))) {
                return false;
            }
        }
        {
            Price lhsLowestBid;
            lhsLowestBid = this.getLowestBid();
            Price rhsLowestBid;
            rhsLowestBid = that.getLowestBid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lowestBid", lhsLowestBid), LocatorUtils.property(thatLocator, "lowestBid", rhsLowestBid), lhsLowestBid, rhsLowestBid, (this.lowestBid!= null), (that.lowestBid!= null))) {
                return false;
            }
        }
        {
            Boolean lhsRecurrenceAppointment;
            lhsRecurrenceAppointment = this.isRecurrenceAppointment();
            Boolean rhsRecurrenceAppointment;
            rhsRecurrenceAppointment = that.isRecurrenceAppointment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recurrenceAppointment", lhsRecurrenceAppointment), LocatorUtils.property(thatLocator, "recurrenceAppointment", rhsRecurrenceAppointment), lhsRecurrenceAppointment, rhsRecurrenceAppointment, (this.recurrenceAppointment!= null), (that.recurrenceAppointment!= null))) {
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
