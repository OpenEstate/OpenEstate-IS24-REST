
package org.openestate.is24.restapi.xml.common;

import java.math.BigDecimal;
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
 * Kriterien f\u00fcr die Umkreissuche
 * 
 * Generelles Element f\u00fcr die Geo Criterias
 * 
 * <p>Java class for RadiusCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RadiusCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}AbstractGeoCriteria"&gt;
 *       &lt;all&gt;
 *         &lt;element name="wgs84" type="{http://rest.immobilienscout24.de/schema/common/1.0}Wgs84Coordinate"/&gt;
 *         &lt;element name="radiusKm"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minExclusive value="0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="label" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://rest.immobilienscout24.de/schema/common/1.0}Address" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadiusCriteria", propOrder = {
    "wgs84",
    "radiusKm",
    "label",
    "address"
})
public class RadiusCriteria
    extends AbstractGeoCriteria
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    protected Wgs84Coordinate wgs84;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter26 .class)
    protected BigDecimal radiusKm;
    protected String label;
    protected Address address;

    /**
     * Gets the value of the wgs84 property.
     * 
     * @return
     *     possible object is
     *     {@link Wgs84Coordinate }
     *     
     */
    public Wgs84Coordinate getWgs84() {
        return wgs84;
    }

    /**
     * Sets the value of the wgs84 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wgs84Coordinate }
     *     
     */
    public void setWgs84(Wgs84Coordinate value) {
        this.wgs84 = value;
    }

    /**
     * Gets the value of the radiusKm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getRadiusKm() {
        return radiusKm;
    }

    /**
     * Sets the value of the radiusKm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadiusKm(BigDecimal value) {
        this.radiusKm = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            Wgs84Coordinate theWgs84;
            theWgs84 = this.getWgs84();
            strategy.appendField(locator, this, "wgs84", buffer, theWgs84);
        }
        {
            BigDecimal theRadiusKm;
            theRadiusKm = this.getRadiusKm();
            strategy.appendField(locator, this, "radiusKm", buffer, theRadiusKm);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel);
        }
        {
            Address theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress);
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
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof RadiusCriteria) {
            final RadiusCriteria copy = ((RadiusCriteria) draftCopy);
            if (this.wgs84 != null) {
                Wgs84Coordinate sourceWgs84;
                sourceWgs84 = this.getWgs84();
                Wgs84Coordinate copyWgs84 = ((Wgs84Coordinate) strategy.copy(LocatorUtils.property(locator, "wgs84", sourceWgs84), sourceWgs84));
                copy.setWgs84(copyWgs84);
            } else {
                copy.wgs84 = null;
            }
            if (this.radiusKm!= null) {
                BigDecimal sourceRadiusKm;
                sourceRadiusKm = this.getRadiusKm();
                BigDecimal copyRadiusKm = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "radiusKm", sourceRadiusKm), sourceRadiusKm));
                copy.setRadiusKm(copyRadiusKm);
            } else {
                copy.radiusKm = null;
            }
            if (this.label!= null) {
                String sourceLabel;
                sourceLabel = this.getLabel();
                String copyLabel = ((String) strategy.copy(LocatorUtils.property(locator, "label", sourceLabel), sourceLabel));
                copy.setLabel(copyLabel);
            } else {
                copy.label = null;
            }
            if (this.address!= null) {
                Address sourceAddress;
                sourceAddress = this.getAddress();
                Address copyAddress = ((Address) strategy.copy(LocatorUtils.property(locator, "address", sourceAddress), sourceAddress));
                copy.setAddress(copyAddress);
            } else {
                copy.address = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new RadiusCriteria();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RadiusCriteria)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final RadiusCriteria that = ((RadiusCriteria) object);
        {
            Wgs84Coordinate lhsWgs84;
            lhsWgs84 = this.getWgs84();
            Wgs84Coordinate rhsWgs84;
            rhsWgs84 = that.getWgs84();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wgs84", lhsWgs84), LocatorUtils.property(thatLocator, "wgs84", rhsWgs84), lhsWgs84, rhsWgs84)) {
                return false;
            }
        }
        {
            BigDecimal lhsRadiusKm;
            lhsRadiusKm = this.getRadiusKm();
            BigDecimal rhsRadiusKm;
            rhsRadiusKm = that.getRadiusKm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "radiusKm", lhsRadiusKm), LocatorUtils.property(thatLocator, "radiusKm", rhsRadiusKm), lhsRadiusKm, rhsRadiusKm)) {
                return false;
            }
        }
        {
            String lhsLabel;
            lhsLabel = this.getLabel();
            String rhsLabel;
            rhsLabel = that.getLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "label", lhsLabel), LocatorUtils.property(thatLocator, "label", rhsLabel), lhsLabel, rhsLabel)) {
                return false;
            }
        }
        {
            Address lhsAddress;
            lhsAddress = this.getAddress();
            Address rhsAddress;
            rhsAddress = that.getAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress)) {
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
