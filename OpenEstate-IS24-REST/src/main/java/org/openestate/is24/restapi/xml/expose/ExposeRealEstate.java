
package org.openestate.is24.restapi.xml.expose;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
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
import org.openestate.is24.restapi.xml.common.AbstractRealEstate;
import org.openestate.is24.restapi.xml.common.Picture;
import org.openestate.is24.restapi.xml.common.RealEstateState;


/**
 * Allgemeine Elemente f\u00fcr alle Immobilienarten im Expose.
 *       
 * 
 * <p>Java class for ExposeRealEstate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExposeRealEstate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}AbstractRealEstate"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="state" type="{http://rest.immobilienscout24.de/schema/common/1.0}RealEstateState"/&gt;
 *         &lt;element name="titlePicture" type="{http://rest.immobilienscout24.de/schema/common/1.0}Picture" minOccurs="0"/&gt;
 *         &lt;element name="floorplan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExposeRealEstate", propOrder = {
    "state",
    "titlePicture",
    "floorplan"
})
@XmlSeeAlso({
    HouseBuy.class,
    HouseRent.class,
    ApartmentRent.class,
    ApartmentBuy.class,
    Office.class,
    Store.class,
    Gastronomy.class,
    Industry.class,
    SpecialPurpose.class,
    ShortTermAccommodation.class,
    HouseType.class,
    TradeSite.class,
    LivingBuySite.class,
    LivingRentSite.class,
    InvestmentProperty.class,
    GarageRent.class,
    GarageBuy.class,
    SeniorCare.class,
    AssistedLiving.class,
    FlatShareRoom.class,
    CompulsoryAuction.class
})
public abstract class ExposeRealEstate
    extends AbstractRealEstate
    implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RealEstateState state;
    protected Picture titlePicture;
    protected Boolean floorplan;

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link RealEstateState }
     *     
     */
    public RealEstateState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealEstateState }
     *     
     */
    public void setState(RealEstateState value) {
        this.state = value;
    }

    /**
     * Gets the value of the titlePicture property.
     * 
     * @return
     *     possible object is
     *     {@link Picture }
     *     
     */
    public Picture getTitlePicture() {
        return titlePicture;
    }

    /**
     * Sets the value of the titlePicture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Picture }
     *     
     */
    public void setTitlePicture(Picture value) {
        this.titlePicture = value;
    }

    /**
     * Gets the value of the floorplan property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFloorplan() {
        return floorplan;
    }

    /**
     * Sets the value of the floorplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFloorplan(Boolean value) {
        this.floorplan = value;
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
            RealEstateState theState;
            theState = this.getState();
            strategy.appendField(locator, this, "state", buffer, theState, (this.state!= null));
        }
        {
            Picture theTitlePicture;
            theTitlePicture = this.getTitlePicture();
            strategy.appendField(locator, this, "titlePicture", buffer, theTitlePicture, (this.titlePicture!= null));
        }
        {
            Boolean theFloorplan;
            theFloorplan = this.isFloorplan();
            strategy.appendField(locator, this, "floorplan", buffer, theFloorplan, (this.floorplan!= null));
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        if (target instanceof ExposeRealEstate) {
            final ExposeRealEstate copy = ((ExposeRealEstate) target);
            {
                Boolean stateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.state!= null));
                if (stateShouldBeCopiedAndSet == Boolean.TRUE) {
                    RealEstateState sourceState;
                    sourceState = this.getState();
                    RealEstateState copyState = ((RealEstateState) strategy.copy(LocatorUtils.property(locator, "state", sourceState), sourceState, (this.state!= null)));
                    copy.setState(copyState);
                } else {
                    if (stateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.state = null;
                    }
                }
            }
            {
                Boolean titlePictureShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.titlePicture!= null));
                if (titlePictureShouldBeCopiedAndSet == Boolean.TRUE) {
                    Picture sourceTitlePicture;
                    sourceTitlePicture = this.getTitlePicture();
                    Picture copyTitlePicture = ((Picture) strategy.copy(LocatorUtils.property(locator, "titlePicture", sourceTitlePicture), sourceTitlePicture, (this.titlePicture!= null)));
                    copy.setTitlePicture(copyTitlePicture);
                } else {
                    if (titlePictureShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.titlePicture = null;
                    }
                }
            }
            {
                Boolean floorplanShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.floorplan!= null));
                if (floorplanShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceFloorplan;
                    sourceFloorplan = this.isFloorplan();
                    Boolean copyFloorplan = ((Boolean) strategy.copy(LocatorUtils.property(locator, "floorplan", sourceFloorplan), sourceFloorplan, (this.floorplan!= null)));
                    copy.setFloorplan(copyFloorplan);
                } else {
                    if (floorplanShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.floorplan = null;
                    }
                }
            }
        }
        return target;
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
        final ExposeRealEstate that = ((ExposeRealEstate) object);
        {
            RealEstateState lhsState;
            lhsState = this.getState();
            RealEstateState rhsState;
            rhsState = that.getState();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "state", lhsState), LocatorUtils.property(thatLocator, "state", rhsState), lhsState, rhsState, (this.state!= null), (that.state!= null))) {
                return false;
            }
        }
        {
            Picture lhsTitlePicture;
            lhsTitlePicture = this.getTitlePicture();
            Picture rhsTitlePicture;
            rhsTitlePicture = that.getTitlePicture();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "titlePicture", lhsTitlePicture), LocatorUtils.property(thatLocator, "titlePicture", rhsTitlePicture), lhsTitlePicture, rhsTitlePicture, (this.titlePicture!= null), (that.titlePicture!= null))) {
                return false;
            }
        }
        {
            Boolean lhsFloorplan;
            lhsFloorplan = this.isFloorplan();
            Boolean rhsFloorplan;
            rhsFloorplan = that.isFloorplan();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "floorplan", lhsFloorplan), LocatorUtils.property(thatLocator, "floorplan", rhsFloorplan), lhsFloorplan, rhsFloorplan, (this.floorplan!= null), (that.floorplan!= null))) {
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
