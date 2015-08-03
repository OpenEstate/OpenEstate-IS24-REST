
package org.openestate.is24.restapi.xml.realestates;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
import org.openestate.is24.restapi.xml.common.CourtageInfo;
import org.openestate.is24.restapi.xml.common.HouseTypeBuildingType;
import org.openestate.is24.restapi.xml.common.HouseTypeConstructionMethodType;
import org.openestate.is24.restapi.xml.common.HouseTypeEnergyStandardType;
import org.openestate.is24.restapi.xml.common.HouseTypeStageOfCompletionType;
import org.openestate.is24.restapi.xml.common.Price;


/**
 * Eigenschaften f\u00fcr den Immobilientyp "Typenh\u00e4user"
 * 
 * <p>Java class for HouseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HouseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/offer/realestates/1.0}RealEstate"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://rest.immobilienscout24.de/schema/common/1.0}ExtendedHouseTypeGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HouseType", propOrder = {
    "price",
    "livingSpace",
    "totalArea",
    "baseArea",
    "numberOfRooms",
    "courtage",
    "constructionMethod",
    "buildingType",
    "stageOfCompletionType",
    "energyStandardType",
    "uValue",
    "typeInformationNote",
    "modelInformationNote",
    "contructionPriceInformationNote",
    "floorInformationNote",
    "roofInformationNote"
})
public class HouseType
    extends RealEstate
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    protected Price price;
    protected double livingSpace;
    protected Double totalArea;
    protected Double baseArea;
    protected Double numberOfRooms;
    protected CourtageInfo courtage;
    @XmlSchemaType(name = "string")
    protected HouseTypeConstructionMethodType constructionMethod;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected HouseTypeBuildingType buildingType;
    @XmlSchemaType(name = "string")
    protected HouseTypeStageOfCompletionType stageOfCompletionType;
    @XmlSchemaType(name = "string")
    protected HouseTypeEnergyStandardType energyStandardType;
    protected Double uValue;
    protected String typeInformationNote;
    protected String modelInformationNote;
    protected String contructionPriceInformationNote;
    protected String floorInformationNote;
    protected String roofInformationNote;

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setPrice(Price value) {
        this.price = value;
    }

    /**
     * Gets the value of the livingSpace property.
     * 
     */
    public double getLivingSpace() {
        return livingSpace;
    }

    /**
     * Sets the value of the livingSpace property.
     * 
     */
    public void setLivingSpace(double value) {
        this.livingSpace = value;
    }

    /**
     * Gets the value of the totalArea property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalArea() {
        return totalArea;
    }

    /**
     * Sets the value of the totalArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalArea(Double value) {
        this.totalArea = value;
    }

    /**
     * Gets the value of the baseArea property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseArea() {
        return baseArea;
    }

    /**
     * Sets the value of the baseArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseArea(Double value) {
        this.baseArea = value;
    }

    /**
     * Gets the value of the numberOfRooms property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumberOfRooms() {
        return numberOfRooms;
    }

    /**
     * Sets the value of the numberOfRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumberOfRooms(Double value) {
        this.numberOfRooms = value;
    }

    /**
     * Gets the value of the courtage property.
     * 
     * @return
     *     possible object is
     *     {@link CourtageInfo }
     *     
     */
    public CourtageInfo getCourtage() {
        return courtage;
    }

    /**
     * Sets the value of the courtage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourtageInfo }
     *     
     */
    public void setCourtage(CourtageInfo value) {
        this.courtage = value;
    }

    /**
     * Gets the value of the constructionMethod property.
     * 
     * @return
     *     possible object is
     *     {@link HouseTypeConstructionMethodType }
     *     
     */
    public HouseTypeConstructionMethodType getConstructionMethod() {
        return constructionMethod;
    }

    /**
     * Sets the value of the constructionMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseTypeConstructionMethodType }
     *     
     */
    public void setConstructionMethod(HouseTypeConstructionMethodType value) {
        this.constructionMethod = value;
    }

    /**
     * Gets the value of the buildingType property.
     * 
     * @return
     *     possible object is
     *     {@link HouseTypeBuildingType }
     *     
     */
    public HouseTypeBuildingType getBuildingType() {
        return buildingType;
    }

    /**
     * Sets the value of the buildingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseTypeBuildingType }
     *     
     */
    public void setBuildingType(HouseTypeBuildingType value) {
        this.buildingType = value;
    }

    /**
     * Gets the value of the stageOfCompletionType property.
     * 
     * @return
     *     possible object is
     *     {@link HouseTypeStageOfCompletionType }
     *     
     */
    public HouseTypeStageOfCompletionType getStageOfCompletionType() {
        return stageOfCompletionType;
    }

    /**
     * Sets the value of the stageOfCompletionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseTypeStageOfCompletionType }
     *     
     */
    public void setStageOfCompletionType(HouseTypeStageOfCompletionType value) {
        this.stageOfCompletionType = value;
    }

    /**
     * Gets the value of the energyStandardType property.
     * 
     * @return
     *     possible object is
     *     {@link HouseTypeEnergyStandardType }
     *     
     */
    public HouseTypeEnergyStandardType getEnergyStandardType() {
        return energyStandardType;
    }

    /**
     * Sets the value of the energyStandardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseTypeEnergyStandardType }
     *     
     */
    public void setEnergyStandardType(HouseTypeEnergyStandardType value) {
        this.energyStandardType = value;
    }

    /**
     * Gets the value of the uValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUValue() {
        return uValue;
    }

    /**
     * Sets the value of the uValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUValue(Double value) {
        this.uValue = value;
    }

    /**
     * Gets the value of the typeInformationNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeInformationNote() {
        return typeInformationNote;
    }

    /**
     * Sets the value of the typeInformationNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeInformationNote(String value) {
        this.typeInformationNote = value;
    }

    /**
     * Gets the value of the modelInformationNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelInformationNote() {
        return modelInformationNote;
    }

    /**
     * Sets the value of the modelInformationNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelInformationNote(String value) {
        this.modelInformationNote = value;
    }

    /**
     * Gets the value of the contructionPriceInformationNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContructionPriceInformationNote() {
        return contructionPriceInformationNote;
    }

    /**
     * Sets the value of the contructionPriceInformationNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContructionPriceInformationNote(String value) {
        this.contructionPriceInformationNote = value;
    }

    /**
     * Gets the value of the floorInformationNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorInformationNote() {
        return floorInformationNote;
    }

    /**
     * Sets the value of the floorInformationNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorInformationNote(String value) {
        this.floorInformationNote = value;
    }

    /**
     * Gets the value of the roofInformationNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoofInformationNote() {
        return roofInformationNote;
    }

    /**
     * Sets the value of the roofInformationNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoofInformationNote(String value) {
        this.roofInformationNote = value;
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
            Price thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice);
        }
        {
            double theLivingSpace;
            theLivingSpace = this.getLivingSpace();
            strategy.appendField(locator, this, "livingSpace", buffer, theLivingSpace);
        }
        {
            Double theTotalArea;
            theTotalArea = this.getTotalArea();
            strategy.appendField(locator, this, "totalArea", buffer, theTotalArea);
        }
        {
            Double theBaseArea;
            theBaseArea = this.getBaseArea();
            strategy.appendField(locator, this, "baseArea", buffer, theBaseArea);
        }
        {
            Double theNumberOfRooms;
            theNumberOfRooms = this.getNumberOfRooms();
            strategy.appendField(locator, this, "numberOfRooms", buffer, theNumberOfRooms);
        }
        {
            CourtageInfo theCourtage;
            theCourtage = this.getCourtage();
            strategy.appendField(locator, this, "courtage", buffer, theCourtage);
        }
        {
            HouseTypeConstructionMethodType theConstructionMethod;
            theConstructionMethod = this.getConstructionMethod();
            strategy.appendField(locator, this, "constructionMethod", buffer, theConstructionMethod);
        }
        {
            HouseTypeBuildingType theBuildingType;
            theBuildingType = this.getBuildingType();
            strategy.appendField(locator, this, "buildingType", buffer, theBuildingType);
        }
        {
            HouseTypeStageOfCompletionType theStageOfCompletionType;
            theStageOfCompletionType = this.getStageOfCompletionType();
            strategy.appendField(locator, this, "stageOfCompletionType", buffer, theStageOfCompletionType);
        }
        {
            HouseTypeEnergyStandardType theEnergyStandardType;
            theEnergyStandardType = this.getEnergyStandardType();
            strategy.appendField(locator, this, "energyStandardType", buffer, theEnergyStandardType);
        }
        {
            Double theUValue;
            theUValue = this.getUValue();
            strategy.appendField(locator, this, "uValue", buffer, theUValue);
        }
        {
            String theTypeInformationNote;
            theTypeInformationNote = this.getTypeInformationNote();
            strategy.appendField(locator, this, "typeInformationNote", buffer, theTypeInformationNote);
        }
        {
            String theModelInformationNote;
            theModelInformationNote = this.getModelInformationNote();
            strategy.appendField(locator, this, "modelInformationNote", buffer, theModelInformationNote);
        }
        {
            String theContructionPriceInformationNote;
            theContructionPriceInformationNote = this.getContructionPriceInformationNote();
            strategy.appendField(locator, this, "contructionPriceInformationNote", buffer, theContructionPriceInformationNote);
        }
        {
            String theFloorInformationNote;
            theFloorInformationNote = this.getFloorInformationNote();
            strategy.appendField(locator, this, "floorInformationNote", buffer, theFloorInformationNote);
        }
        {
            String theRoofInformationNote;
            theRoofInformationNote = this.getRoofInformationNote();
            strategy.appendField(locator, this, "roofInformationNote", buffer, theRoofInformationNote);
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
        if (draftCopy instanceof HouseType) {
            final HouseType copy = ((HouseType) draftCopy);
            if (this.price!= null) {
                Price sourcePrice;
                sourcePrice = this.getPrice();
                Price copyPrice = ((Price) strategy.copy(LocatorUtils.property(locator, "price", sourcePrice), sourcePrice));
                copy.setPrice(copyPrice);
            } else {
                copy.price = null;
            }
            {
                double sourceLivingSpace;
                sourceLivingSpace = this.getLivingSpace();
                double copyLivingSpace = strategy.copy(LocatorUtils.property(locator, "livingSpace", sourceLivingSpace), sourceLivingSpace);
                copy.setLivingSpace(copyLivingSpace);
            }
            if (this.totalArea!= null) {
                Double sourceTotalArea;
                sourceTotalArea = this.getTotalArea();
                Double copyTotalArea = ((Double) strategy.copy(LocatorUtils.property(locator, "totalArea", sourceTotalArea), sourceTotalArea));
                copy.setTotalArea(copyTotalArea);
            } else {
                copy.totalArea = null;
            }
            if (this.baseArea!= null) {
                Double sourceBaseArea;
                sourceBaseArea = this.getBaseArea();
                Double copyBaseArea = ((Double) strategy.copy(LocatorUtils.property(locator, "baseArea", sourceBaseArea), sourceBaseArea));
                copy.setBaseArea(copyBaseArea);
            } else {
                copy.baseArea = null;
            }
            if (this.numberOfRooms!= null) {
                Double sourceNumberOfRooms;
                sourceNumberOfRooms = this.getNumberOfRooms();
                Double copyNumberOfRooms = ((Double) strategy.copy(LocatorUtils.property(locator, "numberOfRooms", sourceNumberOfRooms), sourceNumberOfRooms));
                copy.setNumberOfRooms(copyNumberOfRooms);
            } else {
                copy.numberOfRooms = null;
            }
            if (this.courtage!= null) {
                CourtageInfo sourceCourtage;
                sourceCourtage = this.getCourtage();
                CourtageInfo copyCourtage = ((CourtageInfo) strategy.copy(LocatorUtils.property(locator, "courtage", sourceCourtage), sourceCourtage));
                copy.setCourtage(copyCourtage);
            } else {
                copy.courtage = null;
            }
            if (this.constructionMethod!= null) {
                HouseTypeConstructionMethodType sourceConstructionMethod;
                sourceConstructionMethod = this.getConstructionMethod();
                HouseTypeConstructionMethodType copyConstructionMethod = ((HouseTypeConstructionMethodType) strategy.copy(LocatorUtils.property(locator, "constructionMethod", sourceConstructionMethod), sourceConstructionMethod));
                copy.setConstructionMethod(copyConstructionMethod);
            } else {
                copy.constructionMethod = null;
            }
            if (this.buildingType!= null) {
                HouseTypeBuildingType sourceBuildingType;
                sourceBuildingType = this.getBuildingType();
                HouseTypeBuildingType copyBuildingType = ((HouseTypeBuildingType) strategy.copy(LocatorUtils.property(locator, "buildingType", sourceBuildingType), sourceBuildingType));
                copy.setBuildingType(copyBuildingType);
            } else {
                copy.buildingType = null;
            }
            if (this.stageOfCompletionType!= null) {
                HouseTypeStageOfCompletionType sourceStageOfCompletionType;
                sourceStageOfCompletionType = this.getStageOfCompletionType();
                HouseTypeStageOfCompletionType copyStageOfCompletionType = ((HouseTypeStageOfCompletionType) strategy.copy(LocatorUtils.property(locator, "stageOfCompletionType", sourceStageOfCompletionType), sourceStageOfCompletionType));
                copy.setStageOfCompletionType(copyStageOfCompletionType);
            } else {
                copy.stageOfCompletionType = null;
            }
            if (this.energyStandardType!= null) {
                HouseTypeEnergyStandardType sourceEnergyStandardType;
                sourceEnergyStandardType = this.getEnergyStandardType();
                HouseTypeEnergyStandardType copyEnergyStandardType = ((HouseTypeEnergyStandardType) strategy.copy(LocatorUtils.property(locator, "energyStandardType", sourceEnergyStandardType), sourceEnergyStandardType));
                copy.setEnergyStandardType(copyEnergyStandardType);
            } else {
                copy.energyStandardType = null;
            }
            if (this.uValue!= null) {
                Double sourceUValue;
                sourceUValue = this.getUValue();
                Double copyUValue = ((Double) strategy.copy(LocatorUtils.property(locator, "uValue", sourceUValue), sourceUValue));
                copy.setUValue(copyUValue);
            } else {
                copy.uValue = null;
            }
            if (this.typeInformationNote!= null) {
                String sourceTypeInformationNote;
                sourceTypeInformationNote = this.getTypeInformationNote();
                String copyTypeInformationNote = ((String) strategy.copy(LocatorUtils.property(locator, "typeInformationNote", sourceTypeInformationNote), sourceTypeInformationNote));
                copy.setTypeInformationNote(copyTypeInformationNote);
            } else {
                copy.typeInformationNote = null;
            }
            if (this.modelInformationNote!= null) {
                String sourceModelInformationNote;
                sourceModelInformationNote = this.getModelInformationNote();
                String copyModelInformationNote = ((String) strategy.copy(LocatorUtils.property(locator, "modelInformationNote", sourceModelInformationNote), sourceModelInformationNote));
                copy.setModelInformationNote(copyModelInformationNote);
            } else {
                copy.modelInformationNote = null;
            }
            if (this.contructionPriceInformationNote!= null) {
                String sourceContructionPriceInformationNote;
                sourceContructionPriceInformationNote = this.getContructionPriceInformationNote();
                String copyContructionPriceInformationNote = ((String) strategy.copy(LocatorUtils.property(locator, "contructionPriceInformationNote", sourceContructionPriceInformationNote), sourceContructionPriceInformationNote));
                copy.setContructionPriceInformationNote(copyContructionPriceInformationNote);
            } else {
                copy.contructionPriceInformationNote = null;
            }
            if (this.floorInformationNote!= null) {
                String sourceFloorInformationNote;
                sourceFloorInformationNote = this.getFloorInformationNote();
                String copyFloorInformationNote = ((String) strategy.copy(LocatorUtils.property(locator, "floorInformationNote", sourceFloorInformationNote), sourceFloorInformationNote));
                copy.setFloorInformationNote(copyFloorInformationNote);
            } else {
                copy.floorInformationNote = null;
            }
            if (this.roofInformationNote!= null) {
                String sourceRoofInformationNote;
                sourceRoofInformationNote = this.getRoofInformationNote();
                String copyRoofInformationNote = ((String) strategy.copy(LocatorUtils.property(locator, "roofInformationNote", sourceRoofInformationNote), sourceRoofInformationNote));
                copy.setRoofInformationNote(copyRoofInformationNote);
            } else {
                copy.roofInformationNote = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new HouseType();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof HouseType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final HouseType that = ((HouseType) object);
        {
            Price lhsPrice;
            lhsPrice = this.getPrice();
            Price rhsPrice;
            rhsPrice = that.getPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "price", lhsPrice), LocatorUtils.property(thatLocator, "price", rhsPrice), lhsPrice, rhsPrice)) {
                return false;
            }
        }
        {
            double lhsLivingSpace;
            lhsLivingSpace = this.getLivingSpace();
            double rhsLivingSpace;
            rhsLivingSpace = that.getLivingSpace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "livingSpace", lhsLivingSpace), LocatorUtils.property(thatLocator, "livingSpace", rhsLivingSpace), lhsLivingSpace, rhsLivingSpace)) {
                return false;
            }
        }
        {
            Double lhsTotalArea;
            lhsTotalArea = this.getTotalArea();
            Double rhsTotalArea;
            rhsTotalArea = that.getTotalArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalArea", lhsTotalArea), LocatorUtils.property(thatLocator, "totalArea", rhsTotalArea), lhsTotalArea, rhsTotalArea)) {
                return false;
            }
        }
        {
            Double lhsBaseArea;
            lhsBaseArea = this.getBaseArea();
            Double rhsBaseArea;
            rhsBaseArea = that.getBaseArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baseArea", lhsBaseArea), LocatorUtils.property(thatLocator, "baseArea", rhsBaseArea), lhsBaseArea, rhsBaseArea)) {
                return false;
            }
        }
        {
            Double lhsNumberOfRooms;
            lhsNumberOfRooms = this.getNumberOfRooms();
            Double rhsNumberOfRooms;
            rhsNumberOfRooms = that.getNumberOfRooms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfRooms", lhsNumberOfRooms), LocatorUtils.property(thatLocator, "numberOfRooms", rhsNumberOfRooms), lhsNumberOfRooms, rhsNumberOfRooms)) {
                return false;
            }
        }
        {
            CourtageInfo lhsCourtage;
            lhsCourtage = this.getCourtage();
            CourtageInfo rhsCourtage;
            rhsCourtage = that.getCourtage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "courtage", lhsCourtage), LocatorUtils.property(thatLocator, "courtage", rhsCourtage), lhsCourtage, rhsCourtage)) {
                return false;
            }
        }
        {
            HouseTypeConstructionMethodType lhsConstructionMethod;
            lhsConstructionMethod = this.getConstructionMethod();
            HouseTypeConstructionMethodType rhsConstructionMethod;
            rhsConstructionMethod = that.getConstructionMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "constructionMethod", lhsConstructionMethod), LocatorUtils.property(thatLocator, "constructionMethod", rhsConstructionMethod), lhsConstructionMethod, rhsConstructionMethod)) {
                return false;
            }
        }
        {
            HouseTypeBuildingType lhsBuildingType;
            lhsBuildingType = this.getBuildingType();
            HouseTypeBuildingType rhsBuildingType;
            rhsBuildingType = that.getBuildingType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buildingType", lhsBuildingType), LocatorUtils.property(thatLocator, "buildingType", rhsBuildingType), lhsBuildingType, rhsBuildingType)) {
                return false;
            }
        }
        {
            HouseTypeStageOfCompletionType lhsStageOfCompletionType;
            lhsStageOfCompletionType = this.getStageOfCompletionType();
            HouseTypeStageOfCompletionType rhsStageOfCompletionType;
            rhsStageOfCompletionType = that.getStageOfCompletionType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stageOfCompletionType", lhsStageOfCompletionType), LocatorUtils.property(thatLocator, "stageOfCompletionType", rhsStageOfCompletionType), lhsStageOfCompletionType, rhsStageOfCompletionType)) {
                return false;
            }
        }
        {
            HouseTypeEnergyStandardType lhsEnergyStandardType;
            lhsEnergyStandardType = this.getEnergyStandardType();
            HouseTypeEnergyStandardType rhsEnergyStandardType;
            rhsEnergyStandardType = that.getEnergyStandardType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyStandardType", lhsEnergyStandardType), LocatorUtils.property(thatLocator, "energyStandardType", rhsEnergyStandardType), lhsEnergyStandardType, rhsEnergyStandardType)) {
                return false;
            }
        }
        {
            Double lhsUValue;
            lhsUValue = this.getUValue();
            Double rhsUValue;
            rhsUValue = that.getUValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uValue", lhsUValue), LocatorUtils.property(thatLocator, "uValue", rhsUValue), lhsUValue, rhsUValue)) {
                return false;
            }
        }
        {
            String lhsTypeInformationNote;
            lhsTypeInformationNote = this.getTypeInformationNote();
            String rhsTypeInformationNote;
            rhsTypeInformationNote = that.getTypeInformationNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "typeInformationNote", lhsTypeInformationNote), LocatorUtils.property(thatLocator, "typeInformationNote", rhsTypeInformationNote), lhsTypeInformationNote, rhsTypeInformationNote)) {
                return false;
            }
        }
        {
            String lhsModelInformationNote;
            lhsModelInformationNote = this.getModelInformationNote();
            String rhsModelInformationNote;
            rhsModelInformationNote = that.getModelInformationNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "modelInformationNote", lhsModelInformationNote), LocatorUtils.property(thatLocator, "modelInformationNote", rhsModelInformationNote), lhsModelInformationNote, rhsModelInformationNote)) {
                return false;
            }
        }
        {
            String lhsContructionPriceInformationNote;
            lhsContructionPriceInformationNote = this.getContructionPriceInformationNote();
            String rhsContructionPriceInformationNote;
            rhsContructionPriceInformationNote = that.getContructionPriceInformationNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contructionPriceInformationNote", lhsContructionPriceInformationNote), LocatorUtils.property(thatLocator, "contructionPriceInformationNote", rhsContructionPriceInformationNote), lhsContructionPriceInformationNote, rhsContructionPriceInformationNote)) {
                return false;
            }
        }
        {
            String lhsFloorInformationNote;
            lhsFloorInformationNote = this.getFloorInformationNote();
            String rhsFloorInformationNote;
            rhsFloorInformationNote = that.getFloorInformationNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "floorInformationNote", lhsFloorInformationNote), LocatorUtils.property(thatLocator, "floorInformationNote", rhsFloorInformationNote), lhsFloorInformationNote, rhsFloorInformationNote)) {
                return false;
            }
        }
        {
            String lhsRoofInformationNote;
            lhsRoofInformationNote = this.getRoofInformationNote();
            String rhsRoofInformationNote;
            rhsRoofInformationNote = that.getRoofInformationNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "roofInformationNote", lhsRoofInformationNote), LocatorUtils.property(thatLocator, "roofInformationNote", rhsRoofInformationNote), lhsRoofInformationNote, rhsRoofInformationNote)) {
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
