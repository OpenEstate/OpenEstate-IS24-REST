
package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
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
 * Die Kontaktdaten eines Anbieters
 * 
 * <p>Java class for RealtorContactDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealtorContactDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}ContactDetails"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="defaultContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="localPartnerContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="businessCardContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="realEstateReferenceCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="externalId" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" minOccurs="0"/&gt;
 *         &lt;element name="showOnProfilePage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealtorContactDetails", propOrder = {
    "defaultContact",
    "localPartnerContact",
    "businessCardContact",
    "realEstateReferenceCount",
    "externalId",
    "showOnProfilePage"
})
public class RealtorContactDetails
    extends ContactDetails
    implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    protected Boolean defaultContact;
    protected Boolean localPartnerContact;
    protected Boolean businessCardContact;
    protected Long realEstateReferenceCount;
    protected String externalId;
    protected Boolean showOnProfilePage;

    /**
     * Gets the value of the defaultContact property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultContact() {
        return defaultContact;
    }

    /**
     * Sets the value of the defaultContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultContact(Boolean value) {
        this.defaultContact = value;
    }

    /**
     * Gets the value of the localPartnerContact property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalPartnerContact() {
        return localPartnerContact;
    }

    /**
     * Sets the value of the localPartnerContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalPartnerContact(Boolean value) {
        this.localPartnerContact = value;
    }

    /**
     * Gets the value of the businessCardContact property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBusinessCardContact() {
        return businessCardContact;
    }

    /**
     * Sets the value of the businessCardContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBusinessCardContact(Boolean value) {
        this.businessCardContact = value;
    }

    /**
     * Gets the value of the realEstateReferenceCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRealEstateReferenceCount() {
        return realEstateReferenceCount;
    }

    /**
     * Sets the value of the realEstateReferenceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRealEstateReferenceCount(Long value) {
        this.realEstateReferenceCount = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the showOnProfilePage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowOnProfilePage() {
        return showOnProfilePage;
    }

    /**
     * Sets the value of the showOnProfilePage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowOnProfilePage(Boolean value) {
        this.showOnProfilePage = value;
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
            Boolean theDefaultContact;
            theDefaultContact = this.isDefaultContact();
            strategy.appendField(locator, this, "defaultContact", buffer, theDefaultContact, (this.defaultContact!= null));
        }
        {
            Boolean theLocalPartnerContact;
            theLocalPartnerContact = this.isLocalPartnerContact();
            strategy.appendField(locator, this, "localPartnerContact", buffer, theLocalPartnerContact, (this.localPartnerContact!= null));
        }
        {
            Boolean theBusinessCardContact;
            theBusinessCardContact = this.isBusinessCardContact();
            strategy.appendField(locator, this, "businessCardContact", buffer, theBusinessCardContact, (this.businessCardContact!= null));
        }
        {
            Long theRealEstateReferenceCount;
            theRealEstateReferenceCount = this.getRealEstateReferenceCount();
            strategy.appendField(locator, this, "realEstateReferenceCount", buffer, theRealEstateReferenceCount, (this.realEstateReferenceCount!= null));
        }
        {
            String theExternalId;
            theExternalId = this.getExternalId();
            strategy.appendField(locator, this, "externalId", buffer, theExternalId, (this.externalId!= null));
        }
        {
            Boolean theShowOnProfilePage;
            theShowOnProfilePage = this.isShowOnProfilePage();
            strategy.appendField(locator, this, "showOnProfilePage", buffer, theShowOnProfilePage, (this.showOnProfilePage!= null));
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
        if (draftCopy instanceof RealtorContactDetails) {
            final RealtorContactDetails copy = ((RealtorContactDetails) draftCopy);
            {
                Boolean defaultContactShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.defaultContact!= null));
                if (defaultContactShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceDefaultContact;
                    sourceDefaultContact = this.isDefaultContact();
                    Boolean copyDefaultContact = ((Boolean) strategy.copy(LocatorUtils.property(locator, "defaultContact", sourceDefaultContact), sourceDefaultContact, (this.defaultContact!= null)));
                    copy.setDefaultContact(copyDefaultContact);
                } else {
                    if (defaultContactShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.defaultContact = null;
                    }
                }
            }
            {
                Boolean localPartnerContactShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.localPartnerContact!= null));
                if (localPartnerContactShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceLocalPartnerContact;
                    sourceLocalPartnerContact = this.isLocalPartnerContact();
                    Boolean copyLocalPartnerContact = ((Boolean) strategy.copy(LocatorUtils.property(locator, "localPartnerContact", sourceLocalPartnerContact), sourceLocalPartnerContact, (this.localPartnerContact!= null)));
                    copy.setLocalPartnerContact(copyLocalPartnerContact);
                } else {
                    if (localPartnerContactShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.localPartnerContact = null;
                    }
                }
            }
            {
                Boolean businessCardContactShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.businessCardContact!= null));
                if (businessCardContactShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBusinessCardContact;
                    sourceBusinessCardContact = this.isBusinessCardContact();
                    Boolean copyBusinessCardContact = ((Boolean) strategy.copy(LocatorUtils.property(locator, "businessCardContact", sourceBusinessCardContact), sourceBusinessCardContact, (this.businessCardContact!= null)));
                    copy.setBusinessCardContact(copyBusinessCardContact);
                } else {
                    if (businessCardContactShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.businessCardContact = null;
                    }
                }
            }
            {
                Boolean realEstateReferenceCountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.realEstateReferenceCount!= null));
                if (realEstateReferenceCountShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceRealEstateReferenceCount;
                    sourceRealEstateReferenceCount = this.getRealEstateReferenceCount();
                    Long copyRealEstateReferenceCount = ((Long) strategy.copy(LocatorUtils.property(locator, "realEstateReferenceCount", sourceRealEstateReferenceCount), sourceRealEstateReferenceCount, (this.realEstateReferenceCount!= null)));
                    copy.setRealEstateReferenceCount(copyRealEstateReferenceCount);
                } else {
                    if (realEstateReferenceCountShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realEstateReferenceCount = null;
                    }
                }
            }
            {
                Boolean externalIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.externalId!= null));
                if (externalIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceExternalId;
                    sourceExternalId = this.getExternalId();
                    String copyExternalId = ((String) strategy.copy(LocatorUtils.property(locator, "externalId", sourceExternalId), sourceExternalId, (this.externalId!= null)));
                    copy.setExternalId(copyExternalId);
                } else {
                    if (externalIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.externalId = null;
                    }
                }
            }
            {
                Boolean showOnProfilePageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.showOnProfilePage!= null));
                if (showOnProfilePageShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceShowOnProfilePage;
                    sourceShowOnProfilePage = this.isShowOnProfilePage();
                    Boolean copyShowOnProfilePage = ((Boolean) strategy.copy(LocatorUtils.property(locator, "showOnProfilePage", sourceShowOnProfilePage), sourceShowOnProfilePage, (this.showOnProfilePage!= null)));
                    copy.setShowOnProfilePage(copyShowOnProfilePage);
                } else {
                    if (showOnProfilePageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.showOnProfilePage = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new RealtorContactDetails();
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
        final RealtorContactDetails that = ((RealtorContactDetails) object);
        {
            Boolean lhsDefaultContact;
            lhsDefaultContact = this.isDefaultContact();
            Boolean rhsDefaultContact;
            rhsDefaultContact = that.isDefaultContact();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultContact", lhsDefaultContact), LocatorUtils.property(thatLocator, "defaultContact", rhsDefaultContact), lhsDefaultContact, rhsDefaultContact, (this.defaultContact!= null), (that.defaultContact!= null))) {
                return false;
            }
        }
        {
            Boolean lhsLocalPartnerContact;
            lhsLocalPartnerContact = this.isLocalPartnerContact();
            Boolean rhsLocalPartnerContact;
            rhsLocalPartnerContact = that.isLocalPartnerContact();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "localPartnerContact", lhsLocalPartnerContact), LocatorUtils.property(thatLocator, "localPartnerContact", rhsLocalPartnerContact), lhsLocalPartnerContact, rhsLocalPartnerContact, (this.localPartnerContact!= null), (that.localPartnerContact!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBusinessCardContact;
            lhsBusinessCardContact = this.isBusinessCardContact();
            Boolean rhsBusinessCardContact;
            rhsBusinessCardContact = that.isBusinessCardContact();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "businessCardContact", lhsBusinessCardContact), LocatorUtils.property(thatLocator, "businessCardContact", rhsBusinessCardContact), lhsBusinessCardContact, rhsBusinessCardContact, (this.businessCardContact!= null), (that.businessCardContact!= null))) {
                return false;
            }
        }
        {
            Long lhsRealEstateReferenceCount;
            lhsRealEstateReferenceCount = this.getRealEstateReferenceCount();
            Long rhsRealEstateReferenceCount;
            rhsRealEstateReferenceCount = that.getRealEstateReferenceCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realEstateReferenceCount", lhsRealEstateReferenceCount), LocatorUtils.property(thatLocator, "realEstateReferenceCount", rhsRealEstateReferenceCount), lhsRealEstateReferenceCount, rhsRealEstateReferenceCount, (this.realEstateReferenceCount!= null), (that.realEstateReferenceCount!= null))) {
                return false;
            }
        }
        {
            String lhsExternalId;
            lhsExternalId = this.getExternalId();
            String rhsExternalId;
            rhsExternalId = that.getExternalId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "externalId", lhsExternalId), LocatorUtils.property(thatLocator, "externalId", rhsExternalId), lhsExternalId, rhsExternalId, (this.externalId!= null), (that.externalId!= null))) {
                return false;
            }
        }
        {
            Boolean lhsShowOnProfilePage;
            lhsShowOnProfilePage = this.isShowOnProfilePage();
            Boolean rhsShowOnProfilePage;
            rhsShowOnProfilePage = that.isShowOnProfilePage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "showOnProfilePage", lhsShowOnProfilePage), LocatorUtils.property(thatLocator, "showOnProfilePage", rhsShowOnProfilePage), lhsShowOnProfilePage, rhsShowOnProfilePage, (this.showOnProfilePage!= null), (that.showOnProfilePage!= null))) {
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
