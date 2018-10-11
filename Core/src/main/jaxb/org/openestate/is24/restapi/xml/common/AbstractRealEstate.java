
package org.openestate.is24.restapi.xml.common;

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
import org.openestate.is24.restapi.xml.realestates.RealEstate;


/**
 * Allgemeine Elemente f\u00fcr alle Immobilienarten im Expose.
 *       
 * 
 * <p>Java class for AbstractRealEstate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractRealEstate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}AbstractRealEstateForList"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="groupNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="2147483647"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="descriptionNote" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="3999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="furnishingNote" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="3999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="locationNote" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="3999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="otherNote" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="3999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="attachments" type="{http://rest.immobilienscout24.de/schema/common/1.0}Attachments" minOccurs="0"/&gt;
 *         &lt;element name="referencePriceServiceCall" type="{http://rest.immobilienscout24.de/schema/common/1.0}uri" minOccurs="0"/&gt;
 *         &lt;element name="referencePriceApiCall" type="{http://rest.immobilienscout24.de/schema/common/1.0}uri" minOccurs="0"/&gt;
 *         &lt;element name="realEstateProjectId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractRealEstate", propOrder = {
    "groupNumber",
    "descriptionNote",
    "furnishingNote",
    "locationNote",
    "otherNote",
    "attachments",
    "referencePriceServiceCall",
    "referencePriceApiCall",
    "realEstateProjectId"
})
@XmlSeeAlso({
    RealEstate.class
})
public abstract class AbstractRealEstate
    extends AbstractRealEstateForList
    implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter16 .class)
    protected Integer groupNumber;
    @XmlJavaTypeAdapter(Adapter17 .class)
    protected String descriptionNote;
    @XmlJavaTypeAdapter(Adapter18 .class)
    protected String furnishingNote;
    @XmlJavaTypeAdapter(Adapter19 .class)
    protected String locationNote;
    @XmlJavaTypeAdapter(Adapter20 .class)
    protected String otherNote;
    protected Attachments attachments;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "anyURI")
    protected URI referencePriceServiceCall;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "anyURI")
    protected URI referencePriceApiCall;
    protected Long realEstateProjectId;

    /**
     * Gets the value of the groupNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getGroupNumber() {
        return groupNumber;
    }

    /**
     * Sets the value of the groupNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupNumber(Integer value) {
        this.groupNumber = value;
    }

    /**
     * Gets the value of the descriptionNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionNote() {
        return descriptionNote;
    }

    /**
     * Sets the value of the descriptionNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionNote(String value) {
        this.descriptionNote = value;
    }

    /**
     * Gets the value of the furnishingNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFurnishingNote() {
        return furnishingNote;
    }

    /**
     * Sets the value of the furnishingNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFurnishingNote(String value) {
        this.furnishingNote = value;
    }

    /**
     * Gets the value of the locationNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationNote() {
        return locationNote;
    }

    /**
     * Sets the value of the locationNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationNote(String value) {
        this.locationNote = value;
    }

    /**
     * Gets the value of the otherNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherNote() {
        return otherNote;
    }

    /**
     * Sets the value of the otherNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherNote(String value) {
        this.otherNote = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link Attachments }
     *     
     */
    public Attachments getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachments }
     *     
     */
    public void setAttachments(Attachments value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the referencePriceServiceCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public URI getReferencePriceServiceCall() {
        return referencePriceServiceCall;
    }

    /**
     * Sets the value of the referencePriceServiceCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencePriceServiceCall(URI value) {
        this.referencePriceServiceCall = value;
    }

    /**
     * Gets the value of the referencePriceApiCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public URI getReferencePriceApiCall() {
        return referencePriceApiCall;
    }

    /**
     * Sets the value of the referencePriceApiCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencePriceApiCall(URI value) {
        this.referencePriceApiCall = value;
    }

    /**
     * Gets the value of the realEstateProjectId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRealEstateProjectId() {
        return realEstateProjectId;
    }

    /**
     * Sets the value of the realEstateProjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRealEstateProjectId(Long value) {
        this.realEstateProjectId = value;
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
            Integer theGroupNumber;
            theGroupNumber = this.getGroupNumber();
            strategy.appendField(locator, this, "groupNumber", buffer, theGroupNumber, (this.groupNumber!= null));
        }
        {
            String theDescriptionNote;
            theDescriptionNote = this.getDescriptionNote();
            strategy.appendField(locator, this, "descriptionNote", buffer, theDescriptionNote, (this.descriptionNote!= null));
        }
        {
            String theFurnishingNote;
            theFurnishingNote = this.getFurnishingNote();
            strategy.appendField(locator, this, "furnishingNote", buffer, theFurnishingNote, (this.furnishingNote!= null));
        }
        {
            String theLocationNote;
            theLocationNote = this.getLocationNote();
            strategy.appendField(locator, this, "locationNote", buffer, theLocationNote, (this.locationNote!= null));
        }
        {
            String theOtherNote;
            theOtherNote = this.getOtherNote();
            strategy.appendField(locator, this, "otherNote", buffer, theOtherNote, (this.otherNote!= null));
        }
        {
            Attachments theAttachments;
            theAttachments = this.getAttachments();
            strategy.appendField(locator, this, "attachments", buffer, theAttachments, (this.attachments!= null));
        }
        {
            URI theReferencePriceServiceCall;
            theReferencePriceServiceCall = this.getReferencePriceServiceCall();
            strategy.appendField(locator, this, "referencePriceServiceCall", buffer, theReferencePriceServiceCall, (this.referencePriceServiceCall!= null));
        }
        {
            URI theReferencePriceApiCall;
            theReferencePriceApiCall = this.getReferencePriceApiCall();
            strategy.appendField(locator, this, "referencePriceApiCall", buffer, theReferencePriceApiCall, (this.referencePriceApiCall!= null));
        }
        {
            Long theRealEstateProjectId;
            theRealEstateProjectId = this.getRealEstateProjectId();
            strategy.appendField(locator, this, "realEstateProjectId", buffer, theRealEstateProjectId, (this.realEstateProjectId!= null));
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
        if (target instanceof AbstractRealEstate) {
            final AbstractRealEstate copy = ((AbstractRealEstate) target);
            {
                Boolean groupNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.groupNumber!= null));
                if (groupNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceGroupNumber;
                    sourceGroupNumber = this.getGroupNumber();
                    Integer copyGroupNumber = ((Integer) strategy.copy(LocatorUtils.property(locator, "groupNumber", sourceGroupNumber), sourceGroupNumber, (this.groupNumber!= null)));
                    copy.setGroupNumber(copyGroupNumber);
                } else {
                    if (groupNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.groupNumber = null;
                    }
                }
            }
            {
                Boolean descriptionNoteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.descriptionNote!= null));
                if (descriptionNoteShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDescriptionNote;
                    sourceDescriptionNote = this.getDescriptionNote();
                    String copyDescriptionNote = ((String) strategy.copy(LocatorUtils.property(locator, "descriptionNote", sourceDescriptionNote), sourceDescriptionNote, (this.descriptionNote!= null)));
                    copy.setDescriptionNote(copyDescriptionNote);
                } else {
                    if (descriptionNoteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.descriptionNote = null;
                    }
                }
            }
            {
                Boolean furnishingNoteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.furnishingNote!= null));
                if (furnishingNoteShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFurnishingNote;
                    sourceFurnishingNote = this.getFurnishingNote();
                    String copyFurnishingNote = ((String) strategy.copy(LocatorUtils.property(locator, "furnishingNote", sourceFurnishingNote), sourceFurnishingNote, (this.furnishingNote!= null)));
                    copy.setFurnishingNote(copyFurnishingNote);
                } else {
                    if (furnishingNoteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.furnishingNote = null;
                    }
                }
            }
            {
                Boolean locationNoteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.locationNote!= null));
                if (locationNoteShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLocationNote;
                    sourceLocationNote = this.getLocationNote();
                    String copyLocationNote = ((String) strategy.copy(LocatorUtils.property(locator, "locationNote", sourceLocationNote), sourceLocationNote, (this.locationNote!= null)));
                    copy.setLocationNote(copyLocationNote);
                } else {
                    if (locationNoteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.locationNote = null;
                    }
                }
            }
            {
                Boolean otherNoteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.otherNote!= null));
                if (otherNoteShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceOtherNote;
                    sourceOtherNote = this.getOtherNote();
                    String copyOtherNote = ((String) strategy.copy(LocatorUtils.property(locator, "otherNote", sourceOtherNote), sourceOtherNote, (this.otherNote!= null)));
                    copy.setOtherNote(copyOtherNote);
                } else {
                    if (otherNoteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.otherNote = null;
                    }
                }
            }
            {
                Boolean attachmentsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.attachments!= null));
                if (attachmentsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Attachments sourceAttachments;
                    sourceAttachments = this.getAttachments();
                    Attachments copyAttachments = ((Attachments) strategy.copy(LocatorUtils.property(locator, "attachments", sourceAttachments), sourceAttachments, (this.attachments!= null)));
                    copy.setAttachments(copyAttachments);
                } else {
                    if (attachmentsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.attachments = null;
                    }
                }
            }
            {
                Boolean referencePriceServiceCallShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.referencePriceServiceCall!= null));
                if (referencePriceServiceCallShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceReferencePriceServiceCall;
                    sourceReferencePriceServiceCall = this.getReferencePriceServiceCall();
                    URI copyReferencePriceServiceCall = ((URI) strategy.copy(LocatorUtils.property(locator, "referencePriceServiceCall", sourceReferencePriceServiceCall), sourceReferencePriceServiceCall, (this.referencePriceServiceCall!= null)));
                    copy.setReferencePriceServiceCall(copyReferencePriceServiceCall);
                } else {
                    if (referencePriceServiceCallShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.referencePriceServiceCall = null;
                    }
                }
            }
            {
                Boolean referencePriceApiCallShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.referencePriceApiCall!= null));
                if (referencePriceApiCallShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceReferencePriceApiCall;
                    sourceReferencePriceApiCall = this.getReferencePriceApiCall();
                    URI copyReferencePriceApiCall = ((URI) strategy.copy(LocatorUtils.property(locator, "referencePriceApiCall", sourceReferencePriceApiCall), sourceReferencePriceApiCall, (this.referencePriceApiCall!= null)));
                    copy.setReferencePriceApiCall(copyReferencePriceApiCall);
                } else {
                    if (referencePriceApiCallShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.referencePriceApiCall = null;
                    }
                }
            }
            {
                Boolean realEstateProjectIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.realEstateProjectId!= null));
                if (realEstateProjectIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceRealEstateProjectId;
                    sourceRealEstateProjectId = this.getRealEstateProjectId();
                    Long copyRealEstateProjectId = ((Long) strategy.copy(LocatorUtils.property(locator, "realEstateProjectId", sourceRealEstateProjectId), sourceRealEstateProjectId, (this.realEstateProjectId!= null)));
                    copy.setRealEstateProjectId(copyRealEstateProjectId);
                } else {
                    if (realEstateProjectIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realEstateProjectId = null;
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
        final AbstractRealEstate that = ((AbstractRealEstate) object);
        {
            Integer lhsGroupNumber;
            lhsGroupNumber = this.getGroupNumber();
            Integer rhsGroupNumber;
            rhsGroupNumber = that.getGroupNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "groupNumber", lhsGroupNumber), LocatorUtils.property(thatLocator, "groupNumber", rhsGroupNumber), lhsGroupNumber, rhsGroupNumber, (this.groupNumber!= null), (that.groupNumber!= null))) {
                return false;
            }
        }
        {
            String lhsDescriptionNote;
            lhsDescriptionNote = this.getDescriptionNote();
            String rhsDescriptionNote;
            rhsDescriptionNote = that.getDescriptionNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "descriptionNote", lhsDescriptionNote), LocatorUtils.property(thatLocator, "descriptionNote", rhsDescriptionNote), lhsDescriptionNote, rhsDescriptionNote, (this.descriptionNote!= null), (that.descriptionNote!= null))) {
                return false;
            }
        }
        {
            String lhsFurnishingNote;
            lhsFurnishingNote = this.getFurnishingNote();
            String rhsFurnishingNote;
            rhsFurnishingNote = that.getFurnishingNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "furnishingNote", lhsFurnishingNote), LocatorUtils.property(thatLocator, "furnishingNote", rhsFurnishingNote), lhsFurnishingNote, rhsFurnishingNote, (this.furnishingNote!= null), (that.furnishingNote!= null))) {
                return false;
            }
        }
        {
            String lhsLocationNote;
            lhsLocationNote = this.getLocationNote();
            String rhsLocationNote;
            rhsLocationNote = that.getLocationNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "locationNote", lhsLocationNote), LocatorUtils.property(thatLocator, "locationNote", rhsLocationNote), lhsLocationNote, rhsLocationNote, (this.locationNote!= null), (that.locationNote!= null))) {
                return false;
            }
        }
        {
            String lhsOtherNote;
            lhsOtherNote = this.getOtherNote();
            String rhsOtherNote;
            rhsOtherNote = that.getOtherNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherNote", lhsOtherNote), LocatorUtils.property(thatLocator, "otherNote", rhsOtherNote), lhsOtherNote, rhsOtherNote, (this.otherNote!= null), (that.otherNote!= null))) {
                return false;
            }
        }
        {
            Attachments lhsAttachments;
            lhsAttachments = this.getAttachments();
            Attachments rhsAttachments;
            rhsAttachments = that.getAttachments();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attachments", lhsAttachments), LocatorUtils.property(thatLocator, "attachments", rhsAttachments), lhsAttachments, rhsAttachments, (this.attachments!= null), (that.attachments!= null))) {
                return false;
            }
        }
        {
            URI lhsReferencePriceServiceCall;
            lhsReferencePriceServiceCall = this.getReferencePriceServiceCall();
            URI rhsReferencePriceServiceCall;
            rhsReferencePriceServiceCall = that.getReferencePriceServiceCall();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referencePriceServiceCall", lhsReferencePriceServiceCall), LocatorUtils.property(thatLocator, "referencePriceServiceCall", rhsReferencePriceServiceCall), lhsReferencePriceServiceCall, rhsReferencePriceServiceCall, (this.referencePriceServiceCall!= null), (that.referencePriceServiceCall!= null))) {
                return false;
            }
        }
        {
            URI lhsReferencePriceApiCall;
            lhsReferencePriceApiCall = this.getReferencePriceApiCall();
            URI rhsReferencePriceApiCall;
            rhsReferencePriceApiCall = that.getReferencePriceApiCall();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referencePriceApiCall", lhsReferencePriceApiCall), LocatorUtils.property(thatLocator, "referencePriceApiCall", rhsReferencePriceApiCall), lhsReferencePriceApiCall, rhsReferencePriceApiCall, (this.referencePriceApiCall!= null), (that.referencePriceApiCall!= null))) {
                return false;
            }
        }
        {
            Long lhsRealEstateProjectId;
            lhsRealEstateProjectId = this.getRealEstateProjectId();
            Long rhsRealEstateProjectId;
            rhsRealEstateProjectId = that.getRealEstateProjectId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realEstateProjectId", lhsRealEstateProjectId), LocatorUtils.property(thatLocator, "realEstateProjectId", rhsRealEstateProjectId), lhsRealEstateProjectId, rhsRealEstateProjectId, (this.realEstateProjectId!= null), (that.realEstateProjectId!= null))) {
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
