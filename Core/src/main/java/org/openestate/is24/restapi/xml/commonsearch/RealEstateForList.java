
package org.openestate.is24.restapi.xml.commonsearch;

import java.io.Serializable;
import java.net.URI;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
import org.openestate.is24.restapi.xml.Adapter4;
import org.openestate.is24.restapi.xml.common.AbstractRealEstateForList;
import org.openestate.is24.restapi.xml.common.Attachment;
import org.openestate.is24.restapi.xml.common.Attachments;
import org.openestate.is24.restapi.xml.common.RealEstateState;


/**
 * Allgemeine Elemente f\u00fcr alle Immobilienarten.
 * 
 * <p>Java class for RealEstateForList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealEstateForList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}AbstractRealEstateForList"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="companyWideCustomerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="state" type="{http://rest.immobilienscout24.de/schema/common/1.0}RealEstateState"/&gt;
 *         &lt;element name="titlePicture" type="{http://rest.immobilienscout24.de/schema/search/common/1.0}SearchPicture"/&gt;
 *         &lt;element name="floorplan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="streamingVideo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="listingType" type="{http://rest.immobilienscout24.de/schema/search/common/1.0}ListingTypes"/&gt;
 *         &lt;element name="showcasePlacementColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="privateOffer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="projectId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="realtorLogo" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="realtorLogoForResultList" type="{http://rest.immobilienscout24.de/schema/common/1.0}Attachment" minOccurs="0"/&gt;
 *         &lt;element name="additionalPictures" type="{http://rest.immobilienscout24.de/schema/common/1.0}Attachments" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealEstateForList", propOrder = {
    "companyWideCustomerId",
    "state",
    "titlePicture",
    "floorplan",
    "streamingVideo",
    "listingType",
    "showcasePlacementColor",
    "privateOffer",
    "projectId",
    "realtorLogo",
    "realtorLogoForResultList",
    "additionalPictures"
})
@XmlSeeAlso({
    ApartmentRent.class,
    HouseRent.class,
    ApartmentBuy.class,
    HouseBuy.class,
    ShortTermAccommodation.class,
    HouseType.class,
    Office.class,
    Store.class,
    Gastronomy.class,
    Industry.class,
    SpecialPurpose.class,
    Investment.class,
    CompulsoryAuction.class,
    LivingBuySite.class,
    LivingRentSite.class,
    TradeSite.class,
    GarageBuy.class,
    GarageRent.class,
    FlatShareRoom.class,
    AssistedLiving.class,
    SeniorCare.class
})
public abstract class RealEstateForList
    extends AbstractRealEstateForList
    implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    protected String companyWideCustomerId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RealEstateState state;
    @XmlElement(required = true)
    protected SearchPicture titlePicture;
    protected Boolean floorplan;
    protected Boolean streamingVideo;
    @XmlElement(required = true, defaultValue = "S")
    @XmlSchemaType(name = "string")
    protected ListingTypes listingType;
    protected String showcasePlacementColor;
    protected Boolean privateOffer;
    protected Long projectId;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "anyURI")
    protected URI realtorLogo;
    protected Attachment realtorLogoForResultList;
    protected Attachments additionalPictures;

    /**
     * Gets the value of the companyWideCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyWideCustomerId() {
        return companyWideCustomerId;
    }

    /**
     * Sets the value of the companyWideCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyWideCustomerId(String value) {
        this.companyWideCustomerId = value;
    }

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
     *     {@link SearchPicture }
     *     
     */
    public SearchPicture getTitlePicture() {
        return titlePicture;
    }

    /**
     * Sets the value of the titlePicture property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchPicture }
     *     
     */
    public void setTitlePicture(SearchPicture value) {
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
     * Gets the value of the streamingVideo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStreamingVideo() {
        return streamingVideo;
    }

    /**
     * Sets the value of the streamingVideo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStreamingVideo(Boolean value) {
        this.streamingVideo = value;
    }

    /**
     * Gets the value of the listingType property.
     * 
     * @return
     *     possible object is
     *     {@link ListingTypes }
     *     
     */
    public ListingTypes getListingType() {
        return listingType;
    }

    /**
     * Sets the value of the listingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingTypes }
     *     
     */
    public void setListingType(ListingTypes value) {
        this.listingType = value;
    }

    /**
     * Gets the value of the showcasePlacementColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowcasePlacementColor() {
        return showcasePlacementColor;
    }

    /**
     * Sets the value of the showcasePlacementColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowcasePlacementColor(String value) {
        this.showcasePlacementColor = value;
    }

    /**
     * Gets the value of the privateOffer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrivateOffer() {
        return privateOffer;
    }

    /**
     * Sets the value of the privateOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrivateOffer(Boolean value) {
        this.privateOffer = value;
    }

    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProjectId(Long value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the realtorLogo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public URI getRealtorLogo() {
        return realtorLogo;
    }

    /**
     * Sets the value of the realtorLogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealtorLogo(URI value) {
        this.realtorLogo = value;
    }

    /**
     * Gets the value of the realtorLogoForResultList property.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getRealtorLogoForResultList() {
        return realtorLogoForResultList;
    }

    /**
     * Sets the value of the realtorLogoForResultList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setRealtorLogoForResultList(Attachment value) {
        this.realtorLogoForResultList = value;
    }

    /**
     * Gets the value of the additionalPictures property.
     * 
     * @return
     *     possible object is
     *     {@link Attachments }
     *     
     */
    public Attachments getAdditionalPictures() {
        return additionalPictures;
    }

    /**
     * Sets the value of the additionalPictures property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachments }
     *     
     */
    public void setAdditionalPictures(Attachments value) {
        this.additionalPictures = value;
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
            String theCompanyWideCustomerId;
            theCompanyWideCustomerId = this.getCompanyWideCustomerId();
            strategy.appendField(locator, this, "companyWideCustomerId", buffer, theCompanyWideCustomerId, (this.companyWideCustomerId!= null));
        }
        {
            RealEstateState theState;
            theState = this.getState();
            strategy.appendField(locator, this, "state", buffer, theState, (this.state!= null));
        }
        {
            SearchPicture theTitlePicture;
            theTitlePicture = this.getTitlePicture();
            strategy.appendField(locator, this, "titlePicture", buffer, theTitlePicture, (this.titlePicture!= null));
        }
        {
            Boolean theFloorplan;
            theFloorplan = this.isFloorplan();
            strategy.appendField(locator, this, "floorplan", buffer, theFloorplan, (this.floorplan!= null));
        }
        {
            Boolean theStreamingVideo;
            theStreamingVideo = this.isStreamingVideo();
            strategy.appendField(locator, this, "streamingVideo", buffer, theStreamingVideo, (this.streamingVideo!= null));
        }
        {
            ListingTypes theListingType;
            theListingType = this.getListingType();
            strategy.appendField(locator, this, "listingType", buffer, theListingType, (this.listingType!= null));
        }
        {
            String theShowcasePlacementColor;
            theShowcasePlacementColor = this.getShowcasePlacementColor();
            strategy.appendField(locator, this, "showcasePlacementColor", buffer, theShowcasePlacementColor, (this.showcasePlacementColor!= null));
        }
        {
            Boolean thePrivateOffer;
            thePrivateOffer = this.isPrivateOffer();
            strategy.appendField(locator, this, "privateOffer", buffer, thePrivateOffer, (this.privateOffer!= null));
        }
        {
            Long theProjectId;
            theProjectId = this.getProjectId();
            strategy.appendField(locator, this, "projectId", buffer, theProjectId, (this.projectId!= null));
        }
        {
            URI theRealtorLogo;
            theRealtorLogo = this.getRealtorLogo();
            strategy.appendField(locator, this, "realtorLogo", buffer, theRealtorLogo, (this.realtorLogo!= null));
        }
        {
            Attachment theRealtorLogoForResultList;
            theRealtorLogoForResultList = this.getRealtorLogoForResultList();
            strategy.appendField(locator, this, "realtorLogoForResultList", buffer, theRealtorLogoForResultList, (this.realtorLogoForResultList!= null));
        }
        {
            Attachments theAdditionalPictures;
            theAdditionalPictures = this.getAdditionalPictures();
            strategy.appendField(locator, this, "additionalPictures", buffer, theAdditionalPictures, (this.additionalPictures!= null));
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
        if (target instanceof RealEstateForList) {
            final RealEstateForList copy = ((RealEstateForList) target);
            {
                Boolean companyWideCustomerIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.companyWideCustomerId!= null));
                if (companyWideCustomerIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCompanyWideCustomerId;
                    sourceCompanyWideCustomerId = this.getCompanyWideCustomerId();
                    String copyCompanyWideCustomerId = ((String) strategy.copy(LocatorUtils.property(locator, "companyWideCustomerId", sourceCompanyWideCustomerId), sourceCompanyWideCustomerId, (this.companyWideCustomerId!= null)));
                    copy.setCompanyWideCustomerId(copyCompanyWideCustomerId);
                } else {
                    if (companyWideCustomerIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.companyWideCustomerId = null;
                    }
                }
            }
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
                    SearchPicture sourceTitlePicture;
                    sourceTitlePicture = this.getTitlePicture();
                    SearchPicture copyTitlePicture = ((SearchPicture) strategy.copy(LocatorUtils.property(locator, "titlePicture", sourceTitlePicture), sourceTitlePicture, (this.titlePicture!= null)));
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
                Boolean streamingVideoShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.streamingVideo!= null));
                if (streamingVideoShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceStreamingVideo;
                    sourceStreamingVideo = this.isStreamingVideo();
                    Boolean copyStreamingVideo = ((Boolean) strategy.copy(LocatorUtils.property(locator, "streamingVideo", sourceStreamingVideo), sourceStreamingVideo, (this.streamingVideo!= null)));
                    copy.setStreamingVideo(copyStreamingVideo);
                } else {
                    if (streamingVideoShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.streamingVideo = null;
                    }
                }
            }
            {
                Boolean listingTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.listingType!= null));
                if (listingTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ListingTypes sourceListingType;
                    sourceListingType = this.getListingType();
                    ListingTypes copyListingType = ((ListingTypes) strategy.copy(LocatorUtils.property(locator, "listingType", sourceListingType), sourceListingType, (this.listingType!= null)));
                    copy.setListingType(copyListingType);
                } else {
                    if (listingTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.listingType = null;
                    }
                }
            }
            {
                Boolean showcasePlacementColorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.showcasePlacementColor!= null));
                if (showcasePlacementColorShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceShowcasePlacementColor;
                    sourceShowcasePlacementColor = this.getShowcasePlacementColor();
                    String copyShowcasePlacementColor = ((String) strategy.copy(LocatorUtils.property(locator, "showcasePlacementColor", sourceShowcasePlacementColor), sourceShowcasePlacementColor, (this.showcasePlacementColor!= null)));
                    copy.setShowcasePlacementColor(copyShowcasePlacementColor);
                } else {
                    if (showcasePlacementColorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.showcasePlacementColor = null;
                    }
                }
            }
            {
                Boolean privateOfferShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.privateOffer!= null));
                if (privateOfferShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourcePrivateOffer;
                    sourcePrivateOffer = this.isPrivateOffer();
                    Boolean copyPrivateOffer = ((Boolean) strategy.copy(LocatorUtils.property(locator, "privateOffer", sourcePrivateOffer), sourcePrivateOffer, (this.privateOffer!= null)));
                    copy.setPrivateOffer(copyPrivateOffer);
                } else {
                    if (privateOfferShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.privateOffer = null;
                    }
                }
            }
            {
                Boolean projectIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.projectId!= null));
                if (projectIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceProjectId;
                    sourceProjectId = this.getProjectId();
                    Long copyProjectId = ((Long) strategy.copy(LocatorUtils.property(locator, "projectId", sourceProjectId), sourceProjectId, (this.projectId!= null)));
                    copy.setProjectId(copyProjectId);
                } else {
                    if (projectIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.projectId = null;
                    }
                }
            }
            {
                Boolean realtorLogoShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.realtorLogo!= null));
                if (realtorLogoShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceRealtorLogo;
                    sourceRealtorLogo = this.getRealtorLogo();
                    URI copyRealtorLogo = ((URI) strategy.copy(LocatorUtils.property(locator, "realtorLogo", sourceRealtorLogo), sourceRealtorLogo, (this.realtorLogo!= null)));
                    copy.setRealtorLogo(copyRealtorLogo);
                } else {
                    if (realtorLogoShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realtorLogo = null;
                    }
                }
            }
            {
                Boolean realtorLogoForResultListShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.realtorLogoForResultList!= null));
                if (realtorLogoForResultListShouldBeCopiedAndSet == Boolean.TRUE) {
                    Attachment sourceRealtorLogoForResultList;
                    sourceRealtorLogoForResultList = this.getRealtorLogoForResultList();
                    Attachment copyRealtorLogoForResultList = ((Attachment) strategy.copy(LocatorUtils.property(locator, "realtorLogoForResultList", sourceRealtorLogoForResultList), sourceRealtorLogoForResultList, (this.realtorLogoForResultList!= null)));
                    copy.setRealtorLogoForResultList(copyRealtorLogoForResultList);
                } else {
                    if (realtorLogoForResultListShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realtorLogoForResultList = null;
                    }
                }
            }
            {
                Boolean additionalPicturesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.additionalPictures!= null));
                if (additionalPicturesShouldBeCopiedAndSet == Boolean.TRUE) {
                    Attachments sourceAdditionalPictures;
                    sourceAdditionalPictures = this.getAdditionalPictures();
                    Attachments copyAdditionalPictures = ((Attachments) strategy.copy(LocatorUtils.property(locator, "additionalPictures", sourceAdditionalPictures), sourceAdditionalPictures, (this.additionalPictures!= null)));
                    copy.setAdditionalPictures(copyAdditionalPictures);
                } else {
                    if (additionalPicturesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.additionalPictures = null;
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
        final RealEstateForList that = ((RealEstateForList) object);
        {
            String lhsCompanyWideCustomerId;
            lhsCompanyWideCustomerId = this.getCompanyWideCustomerId();
            String rhsCompanyWideCustomerId;
            rhsCompanyWideCustomerId = that.getCompanyWideCustomerId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "companyWideCustomerId", lhsCompanyWideCustomerId), LocatorUtils.property(thatLocator, "companyWideCustomerId", rhsCompanyWideCustomerId), lhsCompanyWideCustomerId, rhsCompanyWideCustomerId, (this.companyWideCustomerId!= null), (that.companyWideCustomerId!= null))) {
                return false;
            }
        }
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
            SearchPicture lhsTitlePicture;
            lhsTitlePicture = this.getTitlePicture();
            SearchPicture rhsTitlePicture;
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
            Boolean lhsStreamingVideo;
            lhsStreamingVideo = this.isStreamingVideo();
            Boolean rhsStreamingVideo;
            rhsStreamingVideo = that.isStreamingVideo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "streamingVideo", lhsStreamingVideo), LocatorUtils.property(thatLocator, "streamingVideo", rhsStreamingVideo), lhsStreamingVideo, rhsStreamingVideo, (this.streamingVideo!= null), (that.streamingVideo!= null))) {
                return false;
            }
        }
        {
            ListingTypes lhsListingType;
            lhsListingType = this.getListingType();
            ListingTypes rhsListingType;
            rhsListingType = that.getListingType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listingType", lhsListingType), LocatorUtils.property(thatLocator, "listingType", rhsListingType), lhsListingType, rhsListingType, (this.listingType!= null), (that.listingType!= null))) {
                return false;
            }
        }
        {
            String lhsShowcasePlacementColor;
            lhsShowcasePlacementColor = this.getShowcasePlacementColor();
            String rhsShowcasePlacementColor;
            rhsShowcasePlacementColor = that.getShowcasePlacementColor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "showcasePlacementColor", lhsShowcasePlacementColor), LocatorUtils.property(thatLocator, "showcasePlacementColor", rhsShowcasePlacementColor), lhsShowcasePlacementColor, rhsShowcasePlacementColor, (this.showcasePlacementColor!= null), (that.showcasePlacementColor!= null))) {
                return false;
            }
        }
        {
            Boolean lhsPrivateOffer;
            lhsPrivateOffer = this.isPrivateOffer();
            Boolean rhsPrivateOffer;
            rhsPrivateOffer = that.isPrivateOffer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "privateOffer", lhsPrivateOffer), LocatorUtils.property(thatLocator, "privateOffer", rhsPrivateOffer), lhsPrivateOffer, rhsPrivateOffer, (this.privateOffer!= null), (that.privateOffer!= null))) {
                return false;
            }
        }
        {
            Long lhsProjectId;
            lhsProjectId = this.getProjectId();
            Long rhsProjectId;
            rhsProjectId = that.getProjectId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "projectId", lhsProjectId), LocatorUtils.property(thatLocator, "projectId", rhsProjectId), lhsProjectId, rhsProjectId, (this.projectId!= null), (that.projectId!= null))) {
                return false;
            }
        }
        {
            URI lhsRealtorLogo;
            lhsRealtorLogo = this.getRealtorLogo();
            URI rhsRealtorLogo;
            rhsRealtorLogo = that.getRealtorLogo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realtorLogo", lhsRealtorLogo), LocatorUtils.property(thatLocator, "realtorLogo", rhsRealtorLogo), lhsRealtorLogo, rhsRealtorLogo, (this.realtorLogo!= null), (that.realtorLogo!= null))) {
                return false;
            }
        }
        {
            Attachment lhsRealtorLogoForResultList;
            lhsRealtorLogoForResultList = this.getRealtorLogoForResultList();
            Attachment rhsRealtorLogoForResultList;
            rhsRealtorLogoForResultList = that.getRealtorLogoForResultList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realtorLogoForResultList", lhsRealtorLogoForResultList), LocatorUtils.property(thatLocator, "realtorLogoForResultList", rhsRealtorLogoForResultList), lhsRealtorLogoForResultList, rhsRealtorLogoForResultList, (this.realtorLogoForResultList!= null), (that.realtorLogoForResultList!= null))) {
                return false;
            }
        }
        {
            Attachments lhsAdditionalPictures;
            lhsAdditionalPictures = this.getAdditionalPictures();
            Attachments rhsAdditionalPictures;
            rhsAdditionalPictures = that.getAdditionalPictures();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalPictures", lhsAdditionalPictures), LocatorUtils.property(thatLocator, "additionalPictures", rhsAdditionalPictures), lhsAdditionalPictures, rhsAdditionalPictures, (this.additionalPictures!= null), (that.additionalPictures!= null))) {
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
