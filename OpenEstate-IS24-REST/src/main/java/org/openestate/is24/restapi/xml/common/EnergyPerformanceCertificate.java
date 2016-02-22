
package org.openestate.is24.restapi.xml.common;

import java.math.BigDecimal;
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
 * Energieausweis
 * 
 * <p>Java class for EnergyPerformanceCertificate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnergyPerformanceCertificate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="energyCertificateAvailability" type="{http://rest.immobilienscout24.de/schema/common/1.0}EnergyCertificateAvailability" minOccurs="0"/&gt;
 *         &lt;element name="energyCertificateCreationDate" type="{http://rest.immobilienscout24.de/schema/common/1.0}EnergyCertificateCreationDate" minOccurs="0"/&gt;
 *         &lt;element name="energyEfficiencyClass" type="{http://rest.immobilienscout24.de/schema/common/1.0}EnergyEfficiencyClass" minOccurs="0"/&gt;
 *         &lt;element name="electricityConsumption" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="1999.99"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="heatingConsumption" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="1999.99"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="energyConsumptionElectricity" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="1999.99"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="energyConsumptionHeating" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="1999.99"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="thermalCharacteristicElectricity" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="1999.99"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="thermalCharacteristicHeating" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="1999.99"/&gt;
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
@XmlType(name = "EnergyPerformanceCertificate", propOrder = {

})
public class EnergyPerformanceCertificate implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlSchemaType(name = "string")
    protected EnergyCertificateAvailability energyCertificateAvailability;
    @XmlSchemaType(name = "string")
    protected EnergyCertificateCreationDate energyCertificateCreationDate;
    @XmlSchemaType(name = "string")
    protected EnergyEfficiencyClass energyEfficiencyClass;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter21 .class)
    protected BigDecimal electricityConsumption;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter22 .class)
    protected BigDecimal heatingConsumption;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter23 .class)
    protected BigDecimal energyConsumptionElectricity;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter24 .class)
    protected BigDecimal energyConsumptionHeating;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter25 .class)
    protected BigDecimal thermalCharacteristicElectricity;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter26 .class)
    protected BigDecimal thermalCharacteristicHeating;

    /**
     * Gets the value of the energyCertificateAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCertificateAvailability }
     *     
     */
    public EnergyCertificateAvailability getEnergyCertificateAvailability() {
        return energyCertificateAvailability;
    }

    /**
     * Sets the value of the energyCertificateAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCertificateAvailability }
     *     
     */
    public void setEnergyCertificateAvailability(EnergyCertificateAvailability value) {
        this.energyCertificateAvailability = value;
    }

    /**
     * Gets the value of the energyCertificateCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCertificateCreationDate }
     *     
     */
    public EnergyCertificateCreationDate getEnergyCertificateCreationDate() {
        return energyCertificateCreationDate;
    }

    /**
     * Sets the value of the energyCertificateCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCertificateCreationDate }
     *     
     */
    public void setEnergyCertificateCreationDate(EnergyCertificateCreationDate value) {
        this.energyCertificateCreationDate = value;
    }

    /**
     * Gets the value of the energyEfficiencyClass property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyEfficiencyClass }
     *     
     */
    public EnergyEfficiencyClass getEnergyEfficiencyClass() {
        return energyEfficiencyClass;
    }

    /**
     * Sets the value of the energyEfficiencyClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyEfficiencyClass }
     *     
     */
    public void setEnergyEfficiencyClass(EnergyEfficiencyClass value) {
        this.energyEfficiencyClass = value;
    }

    /**
     * Gets the value of the electricityConsumption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getElectricityConsumption() {
        return electricityConsumption;
    }

    /**
     * Sets the value of the electricityConsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectricityConsumption(BigDecimal value) {
        this.electricityConsumption = value;
    }

    /**
     * Gets the value of the heatingConsumption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getHeatingConsumption() {
        return heatingConsumption;
    }

    /**
     * Sets the value of the heatingConsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeatingConsumption(BigDecimal value) {
        this.heatingConsumption = value;
    }

    /**
     * Gets the value of the energyConsumptionElectricity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getEnergyConsumptionElectricity() {
        return energyConsumptionElectricity;
    }

    /**
     * Sets the value of the energyConsumptionElectricity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnergyConsumptionElectricity(BigDecimal value) {
        this.energyConsumptionElectricity = value;
    }

    /**
     * Gets the value of the energyConsumptionHeating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getEnergyConsumptionHeating() {
        return energyConsumptionHeating;
    }

    /**
     * Sets the value of the energyConsumptionHeating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnergyConsumptionHeating(BigDecimal value) {
        this.energyConsumptionHeating = value;
    }

    /**
     * Gets the value of the thermalCharacteristicElectricity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getThermalCharacteristicElectricity() {
        return thermalCharacteristicElectricity;
    }

    /**
     * Sets the value of the thermalCharacteristicElectricity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThermalCharacteristicElectricity(BigDecimal value) {
        this.thermalCharacteristicElectricity = value;
    }

    /**
     * Gets the value of the thermalCharacteristicHeating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getThermalCharacteristicHeating() {
        return thermalCharacteristicHeating;
    }

    /**
     * Sets the value of the thermalCharacteristicHeating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThermalCharacteristicHeating(BigDecimal value) {
        this.thermalCharacteristicHeating = value;
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
            EnergyCertificateAvailability theEnergyCertificateAvailability;
            theEnergyCertificateAvailability = this.getEnergyCertificateAvailability();
            strategy.appendField(locator, this, "energyCertificateAvailability", buffer, theEnergyCertificateAvailability, (this.energyCertificateAvailability!= null));
        }
        {
            EnergyCertificateCreationDate theEnergyCertificateCreationDate;
            theEnergyCertificateCreationDate = this.getEnergyCertificateCreationDate();
            strategy.appendField(locator, this, "energyCertificateCreationDate", buffer, theEnergyCertificateCreationDate, (this.energyCertificateCreationDate!= null));
        }
        {
            EnergyEfficiencyClass theEnergyEfficiencyClass;
            theEnergyEfficiencyClass = this.getEnergyEfficiencyClass();
            strategy.appendField(locator, this, "energyEfficiencyClass", buffer, theEnergyEfficiencyClass, (this.energyEfficiencyClass!= null));
        }
        {
            BigDecimal theElectricityConsumption;
            theElectricityConsumption = this.getElectricityConsumption();
            strategy.appendField(locator, this, "electricityConsumption", buffer, theElectricityConsumption, (this.electricityConsumption!= null));
        }
        {
            BigDecimal theHeatingConsumption;
            theHeatingConsumption = this.getHeatingConsumption();
            strategy.appendField(locator, this, "heatingConsumption", buffer, theHeatingConsumption, (this.heatingConsumption!= null));
        }
        {
            BigDecimal theEnergyConsumptionElectricity;
            theEnergyConsumptionElectricity = this.getEnergyConsumptionElectricity();
            strategy.appendField(locator, this, "energyConsumptionElectricity", buffer, theEnergyConsumptionElectricity, (this.energyConsumptionElectricity!= null));
        }
        {
            BigDecimal theEnergyConsumptionHeating;
            theEnergyConsumptionHeating = this.getEnergyConsumptionHeating();
            strategy.appendField(locator, this, "energyConsumptionHeating", buffer, theEnergyConsumptionHeating, (this.energyConsumptionHeating!= null));
        }
        {
            BigDecimal theThermalCharacteristicElectricity;
            theThermalCharacteristicElectricity = this.getThermalCharacteristicElectricity();
            strategy.appendField(locator, this, "thermalCharacteristicElectricity", buffer, theThermalCharacteristicElectricity, (this.thermalCharacteristicElectricity!= null));
        }
        {
            BigDecimal theThermalCharacteristicHeating;
            theThermalCharacteristicHeating = this.getThermalCharacteristicHeating();
            strategy.appendField(locator, this, "thermalCharacteristicHeating", buffer, theThermalCharacteristicHeating, (this.thermalCharacteristicHeating!= null));
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
        if (draftCopy instanceof EnergyPerformanceCertificate) {
            final EnergyPerformanceCertificate copy = ((EnergyPerformanceCertificate) draftCopy);
            {
                Boolean energyCertificateAvailabilityShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energyCertificateAvailability!= null));
                if (energyCertificateAvailabilityShouldBeCopiedAndSet == Boolean.TRUE) {
                    EnergyCertificateAvailability sourceEnergyCertificateAvailability;
                    sourceEnergyCertificateAvailability = this.getEnergyCertificateAvailability();
                    EnergyCertificateAvailability copyEnergyCertificateAvailability = ((EnergyCertificateAvailability) strategy.copy(LocatorUtils.property(locator, "energyCertificateAvailability", sourceEnergyCertificateAvailability), sourceEnergyCertificateAvailability, (this.energyCertificateAvailability!= null)));
                    copy.setEnergyCertificateAvailability(copyEnergyCertificateAvailability);
                } else {
                    if (energyCertificateAvailabilityShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energyCertificateAvailability = null;
                    }
                }
            }
            {
                Boolean energyCertificateCreationDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energyCertificateCreationDate!= null));
                if (energyCertificateCreationDateShouldBeCopiedAndSet == Boolean.TRUE) {
                    EnergyCertificateCreationDate sourceEnergyCertificateCreationDate;
                    sourceEnergyCertificateCreationDate = this.getEnergyCertificateCreationDate();
                    EnergyCertificateCreationDate copyEnergyCertificateCreationDate = ((EnergyCertificateCreationDate) strategy.copy(LocatorUtils.property(locator, "energyCertificateCreationDate", sourceEnergyCertificateCreationDate), sourceEnergyCertificateCreationDate, (this.energyCertificateCreationDate!= null)));
                    copy.setEnergyCertificateCreationDate(copyEnergyCertificateCreationDate);
                } else {
                    if (energyCertificateCreationDateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energyCertificateCreationDate = null;
                    }
                }
            }
            {
                Boolean energyEfficiencyClassShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energyEfficiencyClass!= null));
                if (energyEfficiencyClassShouldBeCopiedAndSet == Boolean.TRUE) {
                    EnergyEfficiencyClass sourceEnergyEfficiencyClass;
                    sourceEnergyEfficiencyClass = this.getEnergyEfficiencyClass();
                    EnergyEfficiencyClass copyEnergyEfficiencyClass = ((EnergyEfficiencyClass) strategy.copy(LocatorUtils.property(locator, "energyEfficiencyClass", sourceEnergyEfficiencyClass), sourceEnergyEfficiencyClass, (this.energyEfficiencyClass!= null)));
                    copy.setEnergyEfficiencyClass(copyEnergyEfficiencyClass);
                } else {
                    if (energyEfficiencyClassShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energyEfficiencyClass = null;
                    }
                }
            }
            {
                Boolean electricityConsumptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.electricityConsumption!= null));
                if (electricityConsumptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceElectricityConsumption;
                    sourceElectricityConsumption = this.getElectricityConsumption();
                    BigDecimal copyElectricityConsumption = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "electricityConsumption", sourceElectricityConsumption), sourceElectricityConsumption, (this.electricityConsumption!= null)));
                    copy.setElectricityConsumption(copyElectricityConsumption);
                } else {
                    if (electricityConsumptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.electricityConsumption = null;
                    }
                }
            }
            {
                Boolean heatingConsumptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.heatingConsumption!= null));
                if (heatingConsumptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceHeatingConsumption;
                    sourceHeatingConsumption = this.getHeatingConsumption();
                    BigDecimal copyHeatingConsumption = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "heatingConsumption", sourceHeatingConsumption), sourceHeatingConsumption, (this.heatingConsumption!= null)));
                    copy.setHeatingConsumption(copyHeatingConsumption);
                } else {
                    if (heatingConsumptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.heatingConsumption = null;
                    }
                }
            }
            {
                Boolean energyConsumptionElectricityShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energyConsumptionElectricity!= null));
                if (energyConsumptionElectricityShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceEnergyConsumptionElectricity;
                    sourceEnergyConsumptionElectricity = this.getEnergyConsumptionElectricity();
                    BigDecimal copyEnergyConsumptionElectricity = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "energyConsumptionElectricity", sourceEnergyConsumptionElectricity), sourceEnergyConsumptionElectricity, (this.energyConsumptionElectricity!= null)));
                    copy.setEnergyConsumptionElectricity(copyEnergyConsumptionElectricity);
                } else {
                    if (energyConsumptionElectricityShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energyConsumptionElectricity = null;
                    }
                }
            }
            {
                Boolean energyConsumptionHeatingShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energyConsumptionHeating!= null));
                if (energyConsumptionHeatingShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceEnergyConsumptionHeating;
                    sourceEnergyConsumptionHeating = this.getEnergyConsumptionHeating();
                    BigDecimal copyEnergyConsumptionHeating = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "energyConsumptionHeating", sourceEnergyConsumptionHeating), sourceEnergyConsumptionHeating, (this.energyConsumptionHeating!= null)));
                    copy.setEnergyConsumptionHeating(copyEnergyConsumptionHeating);
                } else {
                    if (energyConsumptionHeatingShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energyConsumptionHeating = null;
                    }
                }
            }
            {
                Boolean thermalCharacteristicElectricityShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.thermalCharacteristicElectricity!= null));
                if (thermalCharacteristicElectricityShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceThermalCharacteristicElectricity;
                    sourceThermalCharacteristicElectricity = this.getThermalCharacteristicElectricity();
                    BigDecimal copyThermalCharacteristicElectricity = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "thermalCharacteristicElectricity", sourceThermalCharacteristicElectricity), sourceThermalCharacteristicElectricity, (this.thermalCharacteristicElectricity!= null)));
                    copy.setThermalCharacteristicElectricity(copyThermalCharacteristicElectricity);
                } else {
                    if (thermalCharacteristicElectricityShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.thermalCharacteristicElectricity = null;
                    }
                }
            }
            {
                Boolean thermalCharacteristicHeatingShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.thermalCharacteristicHeating!= null));
                if (thermalCharacteristicHeatingShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceThermalCharacteristicHeating;
                    sourceThermalCharacteristicHeating = this.getThermalCharacteristicHeating();
                    BigDecimal copyThermalCharacteristicHeating = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "thermalCharacteristicHeating", sourceThermalCharacteristicHeating), sourceThermalCharacteristicHeating, (this.thermalCharacteristicHeating!= null)));
                    copy.setThermalCharacteristicHeating(copyThermalCharacteristicHeating);
                } else {
                    if (thermalCharacteristicHeatingShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.thermalCharacteristicHeating = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new EnergyPerformanceCertificate();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EnergyPerformanceCertificate that = ((EnergyPerformanceCertificate) object);
        {
            EnergyCertificateAvailability lhsEnergyCertificateAvailability;
            lhsEnergyCertificateAvailability = this.getEnergyCertificateAvailability();
            EnergyCertificateAvailability rhsEnergyCertificateAvailability;
            rhsEnergyCertificateAvailability = that.getEnergyCertificateAvailability();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyCertificateAvailability", lhsEnergyCertificateAvailability), LocatorUtils.property(thatLocator, "energyCertificateAvailability", rhsEnergyCertificateAvailability), lhsEnergyCertificateAvailability, rhsEnergyCertificateAvailability, (this.energyCertificateAvailability!= null), (that.energyCertificateAvailability!= null))) {
                return false;
            }
        }
        {
            EnergyCertificateCreationDate lhsEnergyCertificateCreationDate;
            lhsEnergyCertificateCreationDate = this.getEnergyCertificateCreationDate();
            EnergyCertificateCreationDate rhsEnergyCertificateCreationDate;
            rhsEnergyCertificateCreationDate = that.getEnergyCertificateCreationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyCertificateCreationDate", lhsEnergyCertificateCreationDate), LocatorUtils.property(thatLocator, "energyCertificateCreationDate", rhsEnergyCertificateCreationDate), lhsEnergyCertificateCreationDate, rhsEnergyCertificateCreationDate, (this.energyCertificateCreationDate!= null), (that.energyCertificateCreationDate!= null))) {
                return false;
            }
        }
        {
            EnergyEfficiencyClass lhsEnergyEfficiencyClass;
            lhsEnergyEfficiencyClass = this.getEnergyEfficiencyClass();
            EnergyEfficiencyClass rhsEnergyEfficiencyClass;
            rhsEnergyEfficiencyClass = that.getEnergyEfficiencyClass();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyEfficiencyClass", lhsEnergyEfficiencyClass), LocatorUtils.property(thatLocator, "energyEfficiencyClass", rhsEnergyEfficiencyClass), lhsEnergyEfficiencyClass, rhsEnergyEfficiencyClass, (this.energyEfficiencyClass!= null), (that.energyEfficiencyClass!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsElectricityConsumption;
            lhsElectricityConsumption = this.getElectricityConsumption();
            BigDecimal rhsElectricityConsumption;
            rhsElectricityConsumption = that.getElectricityConsumption();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "electricityConsumption", lhsElectricityConsumption), LocatorUtils.property(thatLocator, "electricityConsumption", rhsElectricityConsumption), lhsElectricityConsumption, rhsElectricityConsumption, (this.electricityConsumption!= null), (that.electricityConsumption!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsHeatingConsumption;
            lhsHeatingConsumption = this.getHeatingConsumption();
            BigDecimal rhsHeatingConsumption;
            rhsHeatingConsumption = that.getHeatingConsumption();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heatingConsumption", lhsHeatingConsumption), LocatorUtils.property(thatLocator, "heatingConsumption", rhsHeatingConsumption), lhsHeatingConsumption, rhsHeatingConsumption, (this.heatingConsumption!= null), (that.heatingConsumption!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsEnergyConsumptionElectricity;
            lhsEnergyConsumptionElectricity = this.getEnergyConsumptionElectricity();
            BigDecimal rhsEnergyConsumptionElectricity;
            rhsEnergyConsumptionElectricity = that.getEnergyConsumptionElectricity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyConsumptionElectricity", lhsEnergyConsumptionElectricity), LocatorUtils.property(thatLocator, "energyConsumptionElectricity", rhsEnergyConsumptionElectricity), lhsEnergyConsumptionElectricity, rhsEnergyConsumptionElectricity, (this.energyConsumptionElectricity!= null), (that.energyConsumptionElectricity!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsEnergyConsumptionHeating;
            lhsEnergyConsumptionHeating = this.getEnergyConsumptionHeating();
            BigDecimal rhsEnergyConsumptionHeating;
            rhsEnergyConsumptionHeating = that.getEnergyConsumptionHeating();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyConsumptionHeating", lhsEnergyConsumptionHeating), LocatorUtils.property(thatLocator, "energyConsumptionHeating", rhsEnergyConsumptionHeating), lhsEnergyConsumptionHeating, rhsEnergyConsumptionHeating, (this.energyConsumptionHeating!= null), (that.energyConsumptionHeating!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsThermalCharacteristicElectricity;
            lhsThermalCharacteristicElectricity = this.getThermalCharacteristicElectricity();
            BigDecimal rhsThermalCharacteristicElectricity;
            rhsThermalCharacteristicElectricity = that.getThermalCharacteristicElectricity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "thermalCharacteristicElectricity", lhsThermalCharacteristicElectricity), LocatorUtils.property(thatLocator, "thermalCharacteristicElectricity", rhsThermalCharacteristicElectricity), lhsThermalCharacteristicElectricity, rhsThermalCharacteristicElectricity, (this.thermalCharacteristicElectricity!= null), (that.thermalCharacteristicElectricity!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsThermalCharacteristicHeating;
            lhsThermalCharacteristicHeating = this.getThermalCharacteristicHeating();
            BigDecimal rhsThermalCharacteristicHeating;
            rhsThermalCharacteristicHeating = that.getThermalCharacteristicHeating();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "thermalCharacteristicHeating", lhsThermalCharacteristicHeating), LocatorUtils.property(thatLocator, "thermalCharacteristicHeating", rhsThermalCharacteristicHeating), lhsThermalCharacteristicHeating, rhsThermalCharacteristicHeating, (this.thermalCharacteristicHeating!= null), (that.thermalCharacteristicHeating!= null))) {
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
