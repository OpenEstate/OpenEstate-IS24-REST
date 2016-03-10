
package org.openestate.is24.restapi.xml.common;

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
 * <p>Java class for MasterDataContactDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MasterDataContactDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}BaseContactDetails"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="postOfficeBox" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterDataContactDetailsType", propOrder = {
    "postOfficeBox"
})
public class MasterDataContactDetailsType
    extends BaseContactDetails
    implements Cloneable, CopyTo2, Equals2, ToString2
{

    protected Boolean postOfficeBox;

    /**
     * Gets the value of the postOfficeBox property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPostOfficeBox() {
        return postOfficeBox;
    }

    /**
     * Sets the value of the postOfficeBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPostOfficeBox(Boolean value) {
        this.postOfficeBox = value;
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
            Boolean thePostOfficeBox;
            thePostOfficeBox = this.isPostOfficeBox();
            strategy.appendField(locator, this, "postOfficeBox", buffer, thePostOfficeBox, (this.postOfficeBox!= null));
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
        if (draftCopy instanceof MasterDataContactDetailsType) {
            final MasterDataContactDetailsType copy = ((MasterDataContactDetailsType) draftCopy);
            {
                Boolean postOfficeBoxShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.postOfficeBox!= null));
                if (postOfficeBoxShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourcePostOfficeBox;
                    sourcePostOfficeBox = this.isPostOfficeBox();
                    Boolean copyPostOfficeBox = ((Boolean) strategy.copy(LocatorUtils.property(locator, "postOfficeBox", sourcePostOfficeBox), sourcePostOfficeBox, (this.postOfficeBox!= null)));
                    copy.setPostOfficeBox(copyPostOfficeBox);
                } else {
                    if (postOfficeBoxShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.postOfficeBox = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MasterDataContactDetailsType();
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
        final MasterDataContactDetailsType that = ((MasterDataContactDetailsType) object);
        {
            Boolean lhsPostOfficeBox;
            lhsPostOfficeBox = this.isPostOfficeBox();
            Boolean rhsPostOfficeBox;
            rhsPostOfficeBox = that.isPostOfficeBox();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postOfficeBox", lhsPostOfficeBox), LocatorUtils.property(thatLocator, "postOfficeBox", rhsPostOfficeBox), lhsPostOfficeBox, rhsPostOfficeBox, (this.postOfficeBox!= null), (that.postOfficeBox!= null))) {
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
