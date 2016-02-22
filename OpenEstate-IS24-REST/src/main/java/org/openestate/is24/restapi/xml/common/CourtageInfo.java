
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for CourtageInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CourtageInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="hasCourtage" type="{http://rest.immobilienscout24.de/schema/common/1.0}YesNoNotApplicableType"/&gt;
 *         &lt;element name="courtage" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="courtageNote" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField"&gt;
 *               &lt;maxLength value="1800"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CourtageInfo", propOrder = {

})
public class CourtageInfo implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected YesNoNotApplicableType hasCourtage;
    @XmlJavaTypeAdapter(Adapter32 .class)
    protected String courtage;
    @XmlJavaTypeAdapter(Adapter33 .class)
    protected String courtageNote;

    /**
     * Gets the value of the hasCourtage property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoNotApplicableType }
     *     
     */
    public YesNoNotApplicableType getHasCourtage() {
        return hasCourtage;
    }

    /**
     * Sets the value of the hasCourtage property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoNotApplicableType }
     *     
     */
    public void setHasCourtage(YesNoNotApplicableType value) {
        this.hasCourtage = value;
    }

    /**
     * Gets the value of the courtage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourtage() {
        return courtage;
    }

    /**
     * Sets the value of the courtage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourtage(String value) {
        this.courtage = value;
    }

    /**
     * Gets the value of the courtageNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourtageNote() {
        return courtageNote;
    }

    /**
     * Sets the value of the courtageNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourtageNote(String value) {
        this.courtageNote = value;
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
            YesNoNotApplicableType theHasCourtage;
            theHasCourtage = this.getHasCourtage();
            strategy.appendField(locator, this, "hasCourtage", buffer, theHasCourtage, (this.hasCourtage!= null));
        }
        {
            String theCourtage;
            theCourtage = this.getCourtage();
            strategy.appendField(locator, this, "courtage", buffer, theCourtage, (this.courtage!= null));
        }
        {
            String theCourtageNote;
            theCourtageNote = this.getCourtageNote();
            strategy.appendField(locator, this, "courtageNote", buffer, theCourtageNote, (this.courtageNote!= null));
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
        if (draftCopy instanceof CourtageInfo) {
            final CourtageInfo copy = ((CourtageInfo) draftCopy);
            {
                Boolean hasCourtageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hasCourtage!= null));
                if (hasCourtageShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNoNotApplicableType sourceHasCourtage;
                    sourceHasCourtage = this.getHasCourtage();
                    YesNoNotApplicableType copyHasCourtage = ((YesNoNotApplicableType) strategy.copy(LocatorUtils.property(locator, "hasCourtage", sourceHasCourtage), sourceHasCourtage, (this.hasCourtage!= null)));
                    copy.setHasCourtage(copyHasCourtage);
                } else {
                    if (hasCourtageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hasCourtage = null;
                    }
                }
            }
            {
                Boolean courtageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.courtage!= null));
                if (courtageShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCourtage;
                    sourceCourtage = this.getCourtage();
                    String copyCourtage = ((String) strategy.copy(LocatorUtils.property(locator, "courtage", sourceCourtage), sourceCourtage, (this.courtage!= null)));
                    copy.setCourtage(copyCourtage);
                } else {
                    if (courtageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.courtage = null;
                    }
                }
            }
            {
                Boolean courtageNoteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.courtageNote!= null));
                if (courtageNoteShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCourtageNote;
                    sourceCourtageNote = this.getCourtageNote();
                    String copyCourtageNote = ((String) strategy.copy(LocatorUtils.property(locator, "courtageNote", sourceCourtageNote), sourceCourtageNote, (this.courtageNote!= null)));
                    copy.setCourtageNote(copyCourtageNote);
                } else {
                    if (courtageNoteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.courtageNote = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new CourtageInfo();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CourtageInfo that = ((CourtageInfo) object);
        {
            YesNoNotApplicableType lhsHasCourtage;
            lhsHasCourtage = this.getHasCourtage();
            YesNoNotApplicableType rhsHasCourtage;
            rhsHasCourtage = that.getHasCourtage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hasCourtage", lhsHasCourtage), LocatorUtils.property(thatLocator, "hasCourtage", rhsHasCourtage), lhsHasCourtage, rhsHasCourtage, (this.hasCourtage!= null), (that.hasCourtage!= null))) {
                return false;
            }
        }
        {
            String lhsCourtage;
            lhsCourtage = this.getCourtage();
            String rhsCourtage;
            rhsCourtage = that.getCourtage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "courtage", lhsCourtage), LocatorUtils.property(thatLocator, "courtage", rhsCourtage), lhsCourtage, rhsCourtage, (this.courtage!= null), (that.courtage!= null))) {
                return false;
            }
        }
        {
            String lhsCourtageNote;
            lhsCourtageNote = this.getCourtageNote();
            String rhsCourtageNote;
            rhsCourtageNote = that.getCourtageNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "courtageNote", lhsCourtageNote), LocatorUtils.property(thatLocator, "courtageNote", rhsCourtageNote), lhsCourtageNote, rhsCourtageNote, (this.courtageNote!= null), (that.courtageNote!= null))) {
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
