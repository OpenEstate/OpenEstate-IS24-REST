
package org.openestate.is24.restapi.xml.attachmentsorder;

import java.util.ArrayList;
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


/**
 * <p>Java class for list complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="list"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attachmentId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="30" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "list", propOrder = {
    "attachmentId"
})
public class List
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(type = Long.class)
    protected java.util.List<Long> attachmentId;

    /**
     * Gets the value of the attachmentId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachmentId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public java.util.List<Long> getAttachmentId() {
        if (attachmentId == null) {
            attachmentId = new ArrayList<Long>();
        }
        return this.attachmentId;
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
        {
            java.util.List<Long> theAttachmentId;
            theAttachmentId = (((this.attachmentId!= null)&&(!this.attachmentId.isEmpty()))?this.getAttachmentId():null);
            strategy.appendField(locator, this, "attachmentId", buffer, theAttachmentId);
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
        if (draftCopy instanceof List) {
            final List copy = ((List) draftCopy);
            if ((this.attachmentId!= null)&&(!this.attachmentId.isEmpty())) {
                java.util.List<Long> sourceAttachmentId;
                sourceAttachmentId = (((this.attachmentId!= null)&&(!this.attachmentId.isEmpty()))?this.getAttachmentId():null);
                @SuppressWarnings("unchecked")
                java.util.List<Long> copyAttachmentId = ((java.util.List<Long> ) strategy.copy(LocatorUtils.property(locator, "attachmentId", sourceAttachmentId), sourceAttachmentId));
                copy.attachmentId = null;
                if (copyAttachmentId!= null) {
                    java.util.List<Long> uniqueAttachmentIdl = copy.getAttachmentId();
                    uniqueAttachmentIdl.addAll(copyAttachmentId);
                }
            } else {
                copy.attachmentId = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new List();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof List)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final List that = ((List) object);
        {
            java.util.List<Long> lhsAttachmentId;
            lhsAttachmentId = (((this.attachmentId!= null)&&(!this.attachmentId.isEmpty()))?this.getAttachmentId():null);
            java.util.List<Long> rhsAttachmentId;
            rhsAttachmentId = (((that.attachmentId!= null)&&(!that.attachmentId.isEmpty()))?that.getAttachmentId():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attachmentId", lhsAttachmentId), LocatorUtils.property(thatLocator, "attachmentId", rhsAttachmentId), lhsAttachmentId, rhsAttachmentId)) {
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
