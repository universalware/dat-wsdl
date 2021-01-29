
package de.dat.financeline.services.vehicleidentificationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LacquerPosition complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LacquerPosition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="DATProcessId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DomusProcessId" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Location" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="LabourPosId" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Description" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Level" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="LevelDescription" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="LevelManufacturer" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Duration" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManualDuration" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="Material" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="MaterialPoints" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ValueTotal" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManualPosition" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="Includes" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="AdditionalDesc" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="AmountDesc" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="CorrPerc" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ValueTotalCorrected" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WageLevel1" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WageLevel2" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WageLevel3" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WageLevel4" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="RequiredByProcessId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="IsSpecific" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}IncludedPositions" minOccurs="0"/>
 *         &lt;element name="AdditionalLacquerNumber" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="EffortDeductionPerc" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="IndicatorAdditionalLacquer" type="{http://www.dat.de/vxs}fieldString2" minOccurs="0" form="qualified"/>
 *         &lt;element name="Finish" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Surface" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Scratches" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PriceOrigin" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="TimeOrigin" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkNumberOrigin" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DATWorkNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerPositionState" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerPositionTimeState" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerPositionMaterialState" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerPositionPriceState" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="MaterialType" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="Length" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Width" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkIndication" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LacquerPosition", propOrder = {

})
public class LacquerPosition {

    @XmlElement(name = "DATProcessId")
    protected FieldInteger datProcessId;
    @XmlElement(name = "DomusProcessId")
    protected FieldString domusProcessId;
    @XmlElement(name = "Location")
    protected FieldString location;
    @XmlElement(name = "LabourPosId")
    protected FieldString labourPosId;
    @XmlElement(name = "Description")
    protected FieldString description;
    @XmlElement(name = "Level")
    protected FieldString level;
    @XmlElement(name = "LevelDescription")
    protected FieldString levelDescription;
    @XmlElement(name = "LevelManufacturer")
    protected FieldString levelManufacturer;
    @XmlElement(name = "Duration")
    protected FieldDecimal duration;
    @XmlElement(name = "ManualDuration")
    protected FieldBoolean manualDuration;
    @XmlElement(name = "Material")
    protected FieldDecimal material;
    @XmlElement(name = "MaterialPoints")
    protected FieldDecimal materialPoints;
    @XmlElement(name = "ValueTotal")
    protected FieldDecimal valueTotal;
    @XmlElement(name = "ManualPosition")
    protected FieldBoolean manualPosition;
    @XmlElement(name = "Includes")
    protected FieldString includes;
    @XmlElement(name = "AdditionalDesc")
    protected FieldString additionalDesc;
    @XmlElement(name = "AmountDesc")
    protected FieldString amountDesc;
    @XmlElement(name = "CorrPerc")
    protected FieldDecimal corrPerc;
    @XmlElement(name = "ValueTotalCorrected")
    protected FieldDecimal valueTotalCorrected;
    @XmlElement(name = "WageLevel1")
    protected FieldDecimal wageLevel1;
    @XmlElement(name = "WageLevel2")
    protected FieldDecimal wageLevel2;
    @XmlElement(name = "WageLevel3")
    protected FieldDecimal wageLevel3;
    @XmlElement(name = "WageLevel4")
    protected FieldDecimal wageLevel4;
    @XmlElement(name = "RequiredByProcessId")
    protected FieldInteger requiredByProcessId;
    @XmlElement(name = "IsSpecific")
    protected FieldBoolean isSpecific;
    @XmlElement(name = "IncludedPositions")
    protected IncludedPositions includedPositions;
    @XmlElement(name = "AdditionalLacquerNumber")
    protected FieldInteger additionalLacquerNumber;
    @XmlElement(name = "EffortDeductionPerc")
    protected FieldDecimal effortDeductionPerc;
    @XmlElement(name = "IndicatorAdditionalLacquer")
    protected FieldString2 indicatorAdditionalLacquer;
    @XmlElement(name = "Finish")
    protected FieldString finish;
    @XmlElement(name = "Surface")
    protected FieldDecimal surface;
    @XmlElement(name = "Scratches")
    protected FieldDecimal scratches;
    @XmlElement(name = "PriceOrigin")
    protected FieldString priceOrigin;
    @XmlElement(name = "TimeOrigin")
    protected FieldString timeOrigin;
    @XmlElement(name = "WorkNumber")
    protected FieldString workNumber;
    @XmlElement(name = "WorkNumberOrigin")
    protected FieldString workNumberOrigin;
    @XmlElement(name = "DATWorkNumber")
    protected FieldString datWorkNumber;
    @XmlElement(name = "LacquerPositionState")
    protected FieldString lacquerPositionState;
    @XmlElement(name = "LacquerPositionTimeState")
    protected FieldString lacquerPositionTimeState;
    @XmlElement(name = "LacquerPositionMaterialState")
    protected FieldString lacquerPositionMaterialState;
    @XmlElement(name = "LacquerPositionPriceState")
    protected FieldString lacquerPositionPriceState;
    @XmlElement(name = "MaterialType")
    protected FieldInteger materialType;
    @XmlElement(name = "Length")
    protected FieldDecimal length;
    @XmlElement(name = "Width")
    protected FieldDecimal width;
    @XmlElement(name = "WorkIndication")
    protected FieldInteger workIndication;

    /**
     * Ruft den Wert der datProcessId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDATProcessId() {
        return datProcessId;
    }

    /**
     * Legt den Wert der datProcessId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDATProcessId(FieldInteger value) {
        this.datProcessId = value;
    }

    /**
     * Ruft den Wert der domusProcessId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDomusProcessId() {
        return domusProcessId;
    }

    /**
     * Legt den Wert der domusProcessId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDomusProcessId(FieldString value) {
        this.domusProcessId = value;
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLocation(FieldString value) {
        this.location = value;
    }

    /**
     * Ruft den Wert der labourPosId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLabourPosId() {
        return labourPosId;
    }

    /**
     * Legt den Wert der labourPosId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLabourPosId(FieldString value) {
        this.labourPosId = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDescription(FieldString value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der level-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLevel() {
        return level;
    }

    /**
     * Legt den Wert der level-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLevel(FieldString value) {
        this.level = value;
    }

    /**
     * Ruft den Wert der levelDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLevelDescription() {
        return levelDescription;
    }

    /**
     * Legt den Wert der levelDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLevelDescription(FieldString value) {
        this.levelDescription = value;
    }

    /**
     * Ruft den Wert der levelManufacturer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLevelManufacturer() {
        return levelManufacturer;
    }

    /**
     * Legt den Wert der levelManufacturer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLevelManufacturer(FieldString value) {
        this.levelManufacturer = value;
    }

    /**
     * Ruft den Wert der duration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDuration() {
        return duration;
    }

    /**
     * Legt den Wert der duration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDuration(FieldDecimal value) {
        this.duration = value;
    }

    /**
     * Ruft den Wert der manualDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getManualDuration() {
        return manualDuration;
    }

    /**
     * Legt den Wert der manualDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setManualDuration(FieldBoolean value) {
        this.manualDuration = value;
    }

    /**
     * Ruft den Wert der material-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getMaterial() {
        return material;
    }

    /**
     * Legt den Wert der material-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setMaterial(FieldDecimal value) {
        this.material = value;
    }

    /**
     * Ruft den Wert der materialPoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getMaterialPoints() {
        return materialPoints;
    }

    /**
     * Legt den Wert der materialPoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setMaterialPoints(FieldDecimal value) {
        this.materialPoints = value;
    }

    /**
     * Ruft den Wert der valueTotal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getValueTotal() {
        return valueTotal;
    }

    /**
     * Legt den Wert der valueTotal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setValueTotal(FieldDecimal value) {
        this.valueTotal = value;
    }

    /**
     * Ruft den Wert der manualPosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getManualPosition() {
        return manualPosition;
    }

    /**
     * Legt den Wert der manualPosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setManualPosition(FieldBoolean value) {
        this.manualPosition = value;
    }

    /**
     * Ruft den Wert der includes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getIncludes() {
        return includes;
    }

    /**
     * Legt den Wert der includes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setIncludes(FieldString value) {
        this.includes = value;
    }

    /**
     * Ruft den Wert der additionalDesc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getAdditionalDesc() {
        return additionalDesc;
    }

    /**
     * Legt den Wert der additionalDesc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setAdditionalDesc(FieldString value) {
        this.additionalDesc = value;
    }

    /**
     * Ruft den Wert der amountDesc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getAmountDesc() {
        return amountDesc;
    }

    /**
     * Legt den Wert der amountDesc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setAmountDesc(FieldString value) {
        this.amountDesc = value;
    }

    /**
     * Ruft den Wert der corrPerc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getCorrPerc() {
        return corrPerc;
    }

    /**
     * Legt den Wert der corrPerc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setCorrPerc(FieldDecimal value) {
        this.corrPerc = value;
    }

    /**
     * Ruft den Wert der valueTotalCorrected-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getValueTotalCorrected() {
        return valueTotalCorrected;
    }

    /**
     * Legt den Wert der valueTotalCorrected-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setValueTotalCorrected(FieldDecimal value) {
        this.valueTotalCorrected = value;
    }

    /**
     * Ruft den Wert der wageLevel1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWageLevel1() {
        return wageLevel1;
    }

    /**
     * Legt den Wert der wageLevel1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWageLevel1(FieldDecimal value) {
        this.wageLevel1 = value;
    }

    /**
     * Ruft den Wert der wageLevel2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWageLevel2() {
        return wageLevel2;
    }

    /**
     * Legt den Wert der wageLevel2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWageLevel2(FieldDecimal value) {
        this.wageLevel2 = value;
    }

    /**
     * Ruft den Wert der wageLevel3-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWageLevel3() {
        return wageLevel3;
    }

    /**
     * Legt den Wert der wageLevel3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWageLevel3(FieldDecimal value) {
        this.wageLevel3 = value;
    }

    /**
     * Ruft den Wert der wageLevel4-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWageLevel4() {
        return wageLevel4;
    }

    /**
     * Legt den Wert der wageLevel4-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWageLevel4(FieldDecimal value) {
        this.wageLevel4 = value;
    }

    /**
     * Ruft den Wert der requiredByProcessId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getRequiredByProcessId() {
        return requiredByProcessId;
    }

    /**
     * Legt den Wert der requiredByProcessId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setRequiredByProcessId(FieldInteger value) {
        this.requiredByProcessId = value;
    }

    /**
     * Ruft den Wert der isSpecific-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getIsSpecific() {
        return isSpecific;
    }

    /**
     * Legt den Wert der isSpecific-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setIsSpecific(FieldBoolean value) {
        this.isSpecific = value;
    }

    /**
     * Ruft den Wert der includedPositions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IncludedPositions }
     *     
     */
    public IncludedPositions getIncludedPositions() {
        return includedPositions;
    }

    /**
     * Legt den Wert der includedPositions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IncludedPositions }
     *     
     */
    public void setIncludedPositions(IncludedPositions value) {
        this.includedPositions = value;
    }

    /**
     * Ruft den Wert der additionalLacquerNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getAdditionalLacquerNumber() {
        return additionalLacquerNumber;
    }

    /**
     * Legt den Wert der additionalLacquerNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setAdditionalLacquerNumber(FieldInteger value) {
        this.additionalLacquerNumber = value;
    }

    /**
     * Ruft den Wert der effortDeductionPerc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getEffortDeductionPerc() {
        return effortDeductionPerc;
    }

    /**
     * Legt den Wert der effortDeductionPerc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setEffortDeductionPerc(FieldDecimal value) {
        this.effortDeductionPerc = value;
    }

    /**
     * Ruft den Wert der indicatorAdditionalLacquer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString2 }
     *     
     */
    public FieldString2 getIndicatorAdditionalLacquer() {
        return indicatorAdditionalLacquer;
    }

    /**
     * Legt den Wert der indicatorAdditionalLacquer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString2 }
     *     
     */
    public void setIndicatorAdditionalLacquer(FieldString2 value) {
        this.indicatorAdditionalLacquer = value;
    }

    /**
     * Ruft den Wert der finish-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getFinish() {
        return finish;
    }

    /**
     * Legt den Wert der finish-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setFinish(FieldString value) {
        this.finish = value;
    }

    /**
     * Ruft den Wert der surface-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSurface() {
        return surface;
    }

    /**
     * Legt den Wert der surface-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSurface(FieldDecimal value) {
        this.surface = value;
    }

    /**
     * Ruft den Wert der scratches-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getScratches() {
        return scratches;
    }

    /**
     * Legt den Wert der scratches-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setScratches(FieldDecimal value) {
        this.scratches = value;
    }

    /**
     * Ruft den Wert der priceOrigin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPriceOrigin() {
        return priceOrigin;
    }

    /**
     * Legt den Wert der priceOrigin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPriceOrigin(FieldString value) {
        this.priceOrigin = value;
    }

    /**
     * Ruft den Wert der timeOrigin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTimeOrigin() {
        return timeOrigin;
    }

    /**
     * Legt den Wert der timeOrigin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTimeOrigin(FieldString value) {
        this.timeOrigin = value;
    }

    /**
     * Ruft den Wert der workNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getWorkNumber() {
        return workNumber;
    }

    /**
     * Legt den Wert der workNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setWorkNumber(FieldString value) {
        this.workNumber = value;
    }

    /**
     * Ruft den Wert der workNumberOrigin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getWorkNumberOrigin() {
        return workNumberOrigin;
    }

    /**
     * Legt den Wert der workNumberOrigin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setWorkNumberOrigin(FieldString value) {
        this.workNumberOrigin = value;
    }

    /**
     * Ruft den Wert der datWorkNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDATWorkNumber() {
        return datWorkNumber;
    }

    /**
     * Legt den Wert der datWorkNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDATWorkNumber(FieldString value) {
        this.datWorkNumber = value;
    }

    /**
     * Ruft den Wert der lacquerPositionState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLacquerPositionState() {
        return lacquerPositionState;
    }

    /**
     * Legt den Wert der lacquerPositionState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLacquerPositionState(FieldString value) {
        this.lacquerPositionState = value;
    }

    /**
     * Ruft den Wert der lacquerPositionTimeState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLacquerPositionTimeState() {
        return lacquerPositionTimeState;
    }

    /**
     * Legt den Wert der lacquerPositionTimeState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLacquerPositionTimeState(FieldString value) {
        this.lacquerPositionTimeState = value;
    }

    /**
     * Ruft den Wert der lacquerPositionMaterialState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLacquerPositionMaterialState() {
        return lacquerPositionMaterialState;
    }

    /**
     * Legt den Wert der lacquerPositionMaterialState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLacquerPositionMaterialState(FieldString value) {
        this.lacquerPositionMaterialState = value;
    }

    /**
     * Ruft den Wert der lacquerPositionPriceState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLacquerPositionPriceState() {
        return lacquerPositionPriceState;
    }

    /**
     * Legt den Wert der lacquerPositionPriceState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLacquerPositionPriceState(FieldString value) {
        this.lacquerPositionPriceState = value;
    }

    /**
     * Ruft den Wert der materialType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getMaterialType() {
        return materialType;
    }

    /**
     * Legt den Wert der materialType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setMaterialType(FieldInteger value) {
        this.materialType = value;
    }

    /**
     * Ruft den Wert der length-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLength() {
        return length;
    }

    /**
     * Legt den Wert der length-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLength(FieldDecimal value) {
        this.length = value;
    }

    /**
     * Ruft den Wert der width-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWidth() {
        return width;
    }

    /**
     * Legt den Wert der width-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWidth(FieldDecimal value) {
        this.width = value;
    }

    /**
     * Ruft den Wert der workIndication-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getWorkIndication() {
        return workIndication;
    }

    /**
     * Legt den Wert der workIndication-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setWorkIndication(FieldInteger value) {
        this.workIndication = value;
    }

}
