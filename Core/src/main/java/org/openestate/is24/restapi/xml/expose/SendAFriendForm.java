
package org.openestate.is24.restapi.xml.expose;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
import org.openestate.is24.restapi.xml.common.Adapter5;


/**
 * Formular zur Weiterleitung an weitere Interessierte
 * 
 * <p>Java class for SendAFriendForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendAFriendForm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recipientName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="recipientEmail"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}Email"&gt;
 *               &lt;maxLength value="150"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="senderName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="senderEmail"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}Email"&gt;
 *               &lt;maxLength value="150"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="comment" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendAFriendForm", propOrder = {
    "recipientName",
    "recipientEmail",
    "senderName",
    "senderEmail",
    "comment"
})
public class SendAFriendForm implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String recipientName;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter5 .class)
    protected String recipientEmail;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected String senderName;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter5 .class)
    protected String senderEmail;
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected String comment;

    /**
     * Gets the value of the recipientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientName() {
        return recipientName;
    }

    /**
     * Sets the value of the recipientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientName(String value) {
        this.recipientName = value;
    }

    /**
     * Gets the value of the recipientEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientEmail() {
        return recipientEmail;
    }

    /**
     * Sets the value of the recipientEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientEmail(String value) {
        this.recipientEmail = value;
    }

    /**
     * Gets the value of the senderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * Sets the value of the senderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderName(String value) {
        this.senderName = value;
    }

    /**
     * Gets the value of the senderEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderEmail() {
        return senderEmail;
    }

    /**
     * Sets the value of the senderEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderEmail(String value) {
        this.senderEmail = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
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
            String theRecipientName;
            theRecipientName = this.getRecipientName();
            strategy.appendField(locator, this, "recipientName", buffer, theRecipientName, (this.recipientName!= null));
        }
        {
            String theRecipientEmail;
            theRecipientEmail = this.getRecipientEmail();
            strategy.appendField(locator, this, "recipientEmail", buffer, theRecipientEmail, (this.recipientEmail!= null));
        }
        {
            String theSenderName;
            theSenderName = this.getSenderName();
            strategy.appendField(locator, this, "senderName", buffer, theSenderName, (this.senderName!= null));
        }
        {
            String theSenderEmail;
            theSenderEmail = this.getSenderEmail();
            strategy.appendField(locator, this, "senderEmail", buffer, theSenderEmail, (this.senderEmail!= null));
        }
        {
            String theComment;
            theComment = this.getComment();
            strategy.appendField(locator, this, "comment", buffer, theComment, (this.comment!= null));
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
        if (draftCopy instanceof SendAFriendForm) {
            final SendAFriendForm copy = ((SendAFriendForm) draftCopy);
            {
                Boolean recipientNameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.recipientName!= null));
                if (recipientNameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceRecipientName;
                    sourceRecipientName = this.getRecipientName();
                    String copyRecipientName = ((String) strategy.copy(LocatorUtils.property(locator, "recipientName", sourceRecipientName), sourceRecipientName, (this.recipientName!= null)));
                    copy.setRecipientName(copyRecipientName);
                } else {
                    if (recipientNameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.recipientName = null;
                    }
                }
            }
            {
                Boolean recipientEmailShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.recipientEmail!= null));
                if (recipientEmailShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceRecipientEmail;
                    sourceRecipientEmail = this.getRecipientEmail();
                    String copyRecipientEmail = ((String) strategy.copy(LocatorUtils.property(locator, "recipientEmail", sourceRecipientEmail), sourceRecipientEmail, (this.recipientEmail!= null)));
                    copy.setRecipientEmail(copyRecipientEmail);
                } else {
                    if (recipientEmailShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.recipientEmail = null;
                    }
                }
            }
            {
                Boolean senderNameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.senderName!= null));
                if (senderNameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSenderName;
                    sourceSenderName = this.getSenderName();
                    String copySenderName = ((String) strategy.copy(LocatorUtils.property(locator, "senderName", sourceSenderName), sourceSenderName, (this.senderName!= null)));
                    copy.setSenderName(copySenderName);
                } else {
                    if (senderNameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.senderName = null;
                    }
                }
            }
            {
                Boolean senderEmailShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.senderEmail!= null));
                if (senderEmailShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSenderEmail;
                    sourceSenderEmail = this.getSenderEmail();
                    String copySenderEmail = ((String) strategy.copy(LocatorUtils.property(locator, "senderEmail", sourceSenderEmail), sourceSenderEmail, (this.senderEmail!= null)));
                    copy.setSenderEmail(copySenderEmail);
                } else {
                    if (senderEmailShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.senderEmail = null;
                    }
                }
            }
            {
                Boolean commentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.comment!= null));
                if (commentShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceComment;
                    sourceComment = this.getComment();
                    String copyComment = ((String) strategy.copy(LocatorUtils.property(locator, "comment", sourceComment), sourceComment, (this.comment!= null)));
                    copy.setComment(copyComment);
                } else {
                    if (commentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.comment = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new SendAFriendForm();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SendAFriendForm that = ((SendAFriendForm) object);
        {
            String lhsRecipientName;
            lhsRecipientName = this.getRecipientName();
            String rhsRecipientName;
            rhsRecipientName = that.getRecipientName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recipientName", lhsRecipientName), LocatorUtils.property(thatLocator, "recipientName", rhsRecipientName), lhsRecipientName, rhsRecipientName, (this.recipientName!= null), (that.recipientName!= null))) {
                return false;
            }
        }
        {
            String lhsRecipientEmail;
            lhsRecipientEmail = this.getRecipientEmail();
            String rhsRecipientEmail;
            rhsRecipientEmail = that.getRecipientEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recipientEmail", lhsRecipientEmail), LocatorUtils.property(thatLocator, "recipientEmail", rhsRecipientEmail), lhsRecipientEmail, rhsRecipientEmail, (this.recipientEmail!= null), (that.recipientEmail!= null))) {
                return false;
            }
        }
        {
            String lhsSenderName;
            lhsSenderName = this.getSenderName();
            String rhsSenderName;
            rhsSenderName = that.getSenderName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "senderName", lhsSenderName), LocatorUtils.property(thatLocator, "senderName", rhsSenderName), lhsSenderName, rhsSenderName, (this.senderName!= null), (that.senderName!= null))) {
                return false;
            }
        }
        {
            String lhsSenderEmail;
            lhsSenderEmail = this.getSenderEmail();
            String rhsSenderEmail;
            rhsSenderEmail = that.getSenderEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "senderEmail", lhsSenderEmail), LocatorUtils.property(thatLocator, "senderEmail", rhsSenderEmail), lhsSenderEmail, rhsSenderEmail, (this.senderEmail!= null), (that.senderEmail!= null))) {
                return false;
            }
        }
        {
            String lhsComment;
            lhsComment = this.getComment();
            String rhsComment;
            rhsComment = that.getComment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "comment", lhsComment), LocatorUtils.property(thatLocator, "comment", rhsComment), lhsComment, rhsComment, (this.comment!= null), (that.comment!= null))) {
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
