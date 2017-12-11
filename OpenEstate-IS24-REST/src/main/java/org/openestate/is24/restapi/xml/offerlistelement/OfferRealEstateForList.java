
package org.openestate.is24.restapi.xml.offerlistelement;

import java.io.Serializable;
import java.net.URI;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
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
import org.openestate.is24.restapi.xml.Adapter2;
import org.openestate.is24.restapi.xml.Adapter4;
import org.openestate.is24.restapi.xml.common.AbstractRealEstateForList;
import org.openestate.is24.restapi.xml.common.Picture;
import org.openestate.is24.restapi.xml.common.PublishChannels;
import org.openestate.is24.restapi.xml.common.RealEstateState;


/**
 * Allgemeine Elemente f\u00fcr alle Immobilienarten.
 * 
 * <p>Java class for OfferRealEstateForList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferRealEstateForList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}AbstractRealEstateForList"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="state" type="{http://rest.immobilienscout24.de/schema/common/1.0}RealEstateState"/&gt;
 *         &lt;element name="titlePicture" type="{http://rest.immobilienscout24.de/schema/common/1.0}Picture"/&gt;
 *         &lt;element name="floorplan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://rest.immobilienscout24.de/schema/common/1.0}publishChannels" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://rest.immobilienscout24.de/schema/offer/listelement/1.0}Reference"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferRealEstateForList", propOrder = {
    "state",
    "titlePicture",
    "floorplan",
    "publishChannels"
})
@XmlSeeAlso({
    OfferApartmentRent.class,
    OfferHouseRent.class,
    OfferApartmentBuy.class,
    OfferHouseBuy.class,
    OfferShortTermAccommodation.class,
    OfferHouseType.class,
    OfferOffice.class,
    OfferStore.class,
    OfferGastronomy.class,
    OfferIndustry.class,
    OfferSpecialPurpose.class,
    OfferInvestment.class,
    OfferCompulsoryAuction.class,
    OfferLivingBuySite.class,
    OfferLivingRentSite.class,
    OfferTradeSite.class,
    OfferGarageBuy.class,
    OfferGarageRent.class,
    OfferFlatShareRoom.class,
    OfferAssistedLiving.class,
    OfferSeniorCare.class
})
public abstract class OfferRealEstateForList
    extends AbstractRealEstateForList
    implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RealEstateState state;
    @XmlElement(required = true)
    protected Picture titlePicture;
    protected Boolean floorplan;
    @XmlElement(namespace = "http://rest.immobilienscout24.de/schema/common/1.0")
    protected PublishChannels publishChannels;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "anyURI")
    protected URI href;
    @XmlAttribute(name = "modification")
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar modification;
    @XmlAttribute(name = "creation")
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar creation;
    @XmlAttribute(name = "publishDate")
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar publishDate;

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

    /**
     * Gets the value of the publishChannels property.
     * 
     * @return
     *     possible object is
     *     {@link PublishChannels }
     *     
     */
    public PublishChannels getPublishChannels() {
        return publishChannels;
    }

    /**
     * Sets the value of the publishChannels property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublishChannels }
     *     
     */
    public void setPublishChannels(PublishChannels value) {
        this.publishChannels = value;
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

    /**
     * Gets the value of the modification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getModification() {
        return modification;
    }

    /**
     * Sets the value of the modification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModification(Calendar value) {
        this.modification = value;
    }

    /**
     * Gets the value of the creation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCreation() {
        return creation;
    }

    /**
     * Sets the value of the creation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreation(Calendar value) {
        this.creation = value;
    }

    /**
     * Gets the value of the publishDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getPublishDate() {
        return publishDate;
    }

    /**
     * Sets the value of the publishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishDate(Calendar value) {
        this.publishDate = value;
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
        {
            PublishChannels thePublishChannels;
            thePublishChannels = this.getPublishChannels();
            strategy.appendField(locator, this, "publishChannels", buffer, thePublishChannels, (this.publishChannels!= null));
        }
        {
            URI theHref;
            theHref = this.getHref();
            strategy.appendField(locator, this, "href", buffer, theHref, (this.href!= null));
        }
        {
            Calendar theModification;
            theModification = this.getModification();
            strategy.appendField(locator, this, "modification", buffer, theModification, (this.modification!= null));
        }
        {
            Calendar theCreation;
            theCreation = this.getCreation();
            strategy.appendField(locator, this, "creation", buffer, theCreation, (this.creation!= null));
        }
        {
            Calendar thePublishDate;
            thePublishDate = this.getPublishDate();
            strategy.appendField(locator, this, "publishDate", buffer, thePublishDate, (this.publishDate!= null));
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
        if (target instanceof OfferRealEstateForList) {
            final OfferRealEstateForList copy = ((OfferRealEstateForList) target);
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
            {
                Boolean publishChannelsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.publishChannels!= null));
                if (publishChannelsShouldBeCopiedAndSet == Boolean.TRUE) {
                    PublishChannels sourcePublishChannels;
                    sourcePublishChannels = this.getPublishChannels();
                    PublishChannels copyPublishChannels = ((PublishChannels) strategy.copy(LocatorUtils.property(locator, "publishChannels", sourcePublishChannels), sourcePublishChannels, (this.publishChannels!= null)));
                    copy.setPublishChannels(copyPublishChannels);
                } else {
                    if (publishChannelsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.publishChannels = null;
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
            {
                Boolean modificationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.modification!= null));
                if (modificationShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceModification;
                    sourceModification = this.getModification();
                    Calendar copyModification = ((Calendar) strategy.copy(LocatorUtils.property(locator, "modification", sourceModification), sourceModification, (this.modification!= null)));
                    copy.setModification(copyModification);
                } else {
                    if (modificationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.modification = null;
                    }
                }
            }
            {
                Boolean creationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.creation!= null));
                if (creationShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceCreation;
                    sourceCreation = this.getCreation();
                    Calendar copyCreation = ((Calendar) strategy.copy(LocatorUtils.property(locator, "creation", sourceCreation), sourceCreation, (this.creation!= null)));
                    copy.setCreation(copyCreation);
                } else {
                    if (creationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.creation = null;
                    }
                }
            }
            {
                Boolean publishDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.publishDate!= null));
                if (publishDateShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourcePublishDate;
                    sourcePublishDate = this.getPublishDate();
                    Calendar copyPublishDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "publishDate", sourcePublishDate), sourcePublishDate, (this.publishDate!= null)));
                    copy.setPublishDate(copyPublishDate);
                } else {
                    if (publishDateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.publishDate = null;
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
        final OfferRealEstateForList that = ((OfferRealEstateForList) object);
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
        {
            PublishChannels lhsPublishChannels;
            lhsPublishChannels = this.getPublishChannels();
            PublishChannels rhsPublishChannels;
            rhsPublishChannels = that.getPublishChannels();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publishChannels", lhsPublishChannels), LocatorUtils.property(thatLocator, "publishChannels", rhsPublishChannels), lhsPublishChannels, rhsPublishChannels, (this.publishChannels!= null), (that.publishChannels!= null))) {
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
        {
            Calendar lhsModification;
            lhsModification = this.getModification();
            Calendar rhsModification;
            rhsModification = that.getModification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "modification", lhsModification), LocatorUtils.property(thatLocator, "modification", rhsModification), lhsModification, rhsModification, (this.modification!= null), (that.modification!= null))) {
                return false;
            }
        }
        {
            Calendar lhsCreation;
            lhsCreation = this.getCreation();
            Calendar rhsCreation;
            rhsCreation = that.getCreation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "creation", lhsCreation), LocatorUtils.property(thatLocator, "creation", rhsCreation), lhsCreation, rhsCreation, (this.creation!= null), (that.creation!= null))) {
                return false;
            }
        }
        {
            Calendar lhsPublishDate;
            lhsPublishDate = this.getPublishDate();
            Calendar rhsPublishDate;
            rhsPublishDate = that.getPublishDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publishDate", lhsPublishDate), LocatorUtils.property(thatLocator, "publishDate", rhsPublishDate), lhsPublishDate, rhsPublishDate, (this.publishDate!= null), (that.publishDate!= null))) {
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
