
package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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


/**
 * <p>Java class for User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactDetails" type="{http://rest.immobilienscout24.de/schema/common/1.0}ContactDetails"/&gt;
 *         &lt;element name="password" type="{http://rest.immobilienscout24.de/schema/common/1.0}Password"/&gt;
 *         &lt;element name="sharedShortlistGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" /&gt;
 *       &lt;attribute name="peid" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
    "contactDetails",
    "password",
    "sharedShortlistGroupId"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
public class User implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected ContactDetails contactDetails;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter6 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected String password;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected Long sharedShortlistGroupId;
    @XmlAttribute(name = "id")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected String id;
    @XmlAttribute(name = "peid")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected Long peid;

    /**
     * Gets the value of the contactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetails }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    /**
     * Sets the value of the contactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetails }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setContactDetails(ContactDetails value) {
        this.contactDetails = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the sharedShortlistGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Long getSharedShortlistGroupId() {
        return sharedShortlistGroupId;
    }

    /**
     * Sets the value of the sharedShortlistGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setSharedShortlistGroupId(Long value) {
        this.sharedShortlistGroupId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the peid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Long getPeid() {
        return peid;
    }

    /**
     * Sets the value of the peid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setPeid(Long value) {
        this.peid = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            ContactDetails theContactDetails;
            theContactDetails = this.getContactDetails();
            strategy.appendField(locator, this, "contactDetails", buffer, theContactDetails, (this.contactDetails!= null));
        }
        {
            String thePassword;
            thePassword = this.getPassword();
            strategy.appendField(locator, this, "password", buffer, thePassword, (this.password!= null));
        }
        {
            Long theSharedShortlistGroupId;
            theSharedShortlistGroupId = this.getSharedShortlistGroupId();
            strategy.appendField(locator, this, "sharedShortlistGroupId", buffer, theSharedShortlistGroupId, (this.sharedShortlistGroupId!= null));
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
        }
        {
            Long thePeid;
            thePeid = this.getPeid();
            strategy.appendField(locator, this, "peid", buffer, thePeid, (this.peid!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof User) {
            final User copy = ((User) draftCopy);
            {
                Boolean contactDetailsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.contactDetails!= null));
                if (contactDetailsShouldBeCopiedAndSet == Boolean.TRUE) {
                    ContactDetails sourceContactDetails;
                    sourceContactDetails = this.getContactDetails();
                    ContactDetails copyContactDetails = ((ContactDetails) strategy.copy(LocatorUtils.property(locator, "contactDetails", sourceContactDetails), sourceContactDetails, (this.contactDetails!= null)));
                    copy.setContactDetails(copyContactDetails);
                } else {
                    if (contactDetailsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.contactDetails = null;
                    }
                }
            }
            {
                Boolean passwordShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.password!= null));
                if (passwordShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePassword;
                    sourcePassword = this.getPassword();
                    String copyPassword = ((String) strategy.copy(LocatorUtils.property(locator, "password", sourcePassword), sourcePassword, (this.password!= null)));
                    copy.setPassword(copyPassword);
                } else {
                    if (passwordShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.password = null;
                    }
                }
            }
            {
                Boolean sharedShortlistGroupIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sharedShortlistGroupId!= null));
                if (sharedShortlistGroupIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceSharedShortlistGroupId;
                    sourceSharedShortlistGroupId = this.getSharedShortlistGroupId();
                    Long copySharedShortlistGroupId = ((Long) strategy.copy(LocatorUtils.property(locator, "sharedShortlistGroupId", sourceSharedShortlistGroupId), sourceSharedShortlistGroupId, (this.sharedShortlistGroupId!= null)));
                    copy.setSharedShortlistGroupId(copySharedShortlistGroupId);
                } else {
                    if (sharedShortlistGroupIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sharedShortlistGroupId = null;
                    }
                }
            }
            {
                Boolean idShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.id!= null));
                if (idShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceId;
                    sourceId = this.getId();
                    String copyId = ((String) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId, (this.id!= null)));
                    copy.setId(copyId);
                } else {
                    if (idShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.id = null;
                    }
                }
            }
            {
                Boolean peidShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.peid!= null));
                if (peidShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourcePeid;
                    sourcePeid = this.getPeid();
                    Long copyPeid = ((Long) strategy.copy(LocatorUtils.property(locator, "peid", sourcePeid), sourcePeid, (this.peid!= null)));
                    copy.setPeid(copyPeid);
                } else {
                    if (peidShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.peid = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new User();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final User that = ((User) object);
        {
            ContactDetails lhsContactDetails;
            lhsContactDetails = this.getContactDetails();
            ContactDetails rhsContactDetails;
            rhsContactDetails = that.getContactDetails();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactDetails", lhsContactDetails), LocatorUtils.property(thatLocator, "contactDetails", rhsContactDetails), lhsContactDetails, rhsContactDetails, (this.contactDetails!= null), (that.contactDetails!= null))) {
                return false;
            }
        }
        {
            String lhsPassword;
            lhsPassword = this.getPassword();
            String rhsPassword;
            rhsPassword = that.getPassword();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "password", lhsPassword), LocatorUtils.property(thatLocator, "password", rhsPassword), lhsPassword, rhsPassword, (this.password!= null), (that.password!= null))) {
                return false;
            }
        }
        {
            Long lhsSharedShortlistGroupId;
            lhsSharedShortlistGroupId = this.getSharedShortlistGroupId();
            Long rhsSharedShortlistGroupId;
            rhsSharedShortlistGroupId = that.getSharedShortlistGroupId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sharedShortlistGroupId", lhsSharedShortlistGroupId), LocatorUtils.property(thatLocator, "sharedShortlistGroupId", rhsSharedShortlistGroupId), lhsSharedShortlistGroupId, rhsSharedShortlistGroupId, (this.sharedShortlistGroupId!= null), (that.sharedShortlistGroupId!= null))) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId, (this.id!= null), (that.id!= null))) {
                return false;
            }
        }
        {
            Long lhsPeid;
            lhsPeid = this.getPeid();
            Long rhsPeid;
            rhsPeid = that.getPeid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "peid", lhsPeid), LocatorUtils.property(thatLocator, "peid", rhsPeid), lhsPeid, rhsPeid, (this.peid!= null), (that.peid!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
