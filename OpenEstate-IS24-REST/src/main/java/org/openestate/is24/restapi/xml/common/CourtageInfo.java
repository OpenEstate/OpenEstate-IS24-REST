
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * <p>Java class for CourtageInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CourtageInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="hasCourtage" type="{http://rest.immobilienscout24.de/schema/common/1.0}YesNoNotApplicableType"/>
 *         &lt;element name="courtage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="courtageNote" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               &lt;maxLength value="1800"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CourtageInfo", propOrder = {

})
public class CourtageInfo
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    protected YesNoNotApplicableType hasCourtage;
    @XmlJavaTypeAdapter(Adapter50 .class)
    protected String courtage;
    @XmlJavaTypeAdapter(Adapter51 .class)
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
            YesNoNotApplicableType theHasCourtage;
            theHasCourtage = this.getHasCourtage();
            strategy.appendField(locator, this, "hasCourtage", buffer, theHasCourtage);
        }
        {
            String theCourtage;
            theCourtage = this.getCourtage();
            strategy.appendField(locator, this, "courtage", buffer, theCourtage);
        }
        {
            String theCourtageNote;
            theCourtageNote = this.getCourtageNote();
            strategy.appendField(locator, this, "courtageNote", buffer, theCourtageNote);
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
        if (draftCopy instanceof CourtageInfo) {
            final CourtageInfo copy = ((CourtageInfo) draftCopy);
            if (this.hasCourtage!= null) {
                YesNoNotApplicableType sourceHasCourtage;
                sourceHasCourtage = this.getHasCourtage();
                YesNoNotApplicableType copyHasCourtage = ((YesNoNotApplicableType) strategy.copy(LocatorUtils.property(locator, "hasCourtage", sourceHasCourtage), sourceHasCourtage));
                copy.setHasCourtage(copyHasCourtage);
            } else {
                copy.hasCourtage = null;
            }
            if (this.courtage!= null) {
                String sourceCourtage;
                sourceCourtage = this.getCourtage();
                String copyCourtage = ((String) strategy.copy(LocatorUtils.property(locator, "courtage", sourceCourtage), sourceCourtage));
                copy.setCourtage(copyCourtage);
            } else {
                copy.courtage = null;
            }
            if (this.courtageNote!= null) {
                String sourceCourtageNote;
                sourceCourtageNote = this.getCourtageNote();
                String copyCourtageNote = ((String) strategy.copy(LocatorUtils.property(locator, "courtageNote", sourceCourtageNote), sourceCourtageNote));
                copy.setCourtageNote(copyCourtageNote);
            } else {
                copy.courtageNote = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new CourtageInfo();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CourtageInfo)) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hasCourtage", lhsHasCourtage), LocatorUtils.property(thatLocator, "hasCourtage", rhsHasCourtage), lhsHasCourtage, rhsHasCourtage)) {
                return false;
            }
        }
        {
            String lhsCourtage;
            lhsCourtage = this.getCourtage();
            String rhsCourtage;
            rhsCourtage = that.getCourtage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "courtage", lhsCourtage), LocatorUtils.property(thatLocator, "courtage", rhsCourtage), lhsCourtage, rhsCourtage)) {
                return false;
            }
        }
        {
            String lhsCourtageNote;
            lhsCourtageNote = this.getCourtageNote();
            String rhsCourtageNote;
            rhsCourtageNote = that.getCourtageNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "courtageNote", lhsCourtageNote), LocatorUtils.property(thatLocator, "courtageNote", rhsCourtageNote), lhsCourtageNote, rhsCourtageNote)) {
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
