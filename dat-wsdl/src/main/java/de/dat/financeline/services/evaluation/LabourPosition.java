
package de.dat.financeline.services.evaluation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LabourPosition complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LabourPosition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="DATProcessId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="LabourPositionKind" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DomusProcessId" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Location" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="RepairType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="LabourPosId" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Description" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="WageType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManualWageType" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="WageLevel" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="Duration" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManualDuration" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="ValueTotal" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManualPosition" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="Includes" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="AdditionalDesc" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="AmountDesc" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="CorrPerc" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ValueTotalCorrected" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Amount" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="hasRequiredByPosition" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0"/>
 *         &lt;element name="RequiredByPosition" type="{http://www.dat.de/vxs}calcPosReference" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}IncludedPositions" minOccurs="0"/>
 *         &lt;element name="Extended" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="IncludedInCalculation" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="Method" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="HardshipAllowanceInd" type="{http://www.dat.de/vxs}fieldCharacter" minOccurs="0" form="qualified"/>
 *         &lt;element name="optionalPositionIncluded" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0"/>
 *         &lt;element name="LabourPositionState" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="LabourPositionPriceState" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="LabourPositionTimeState" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="size" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0"/>
 *         &lt;element name="PriceOrigin" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="TimeOrigin" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkNumberOrigin" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DATWorkNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Length" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Width" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkIndication" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DentsCalculationMethod" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabourPosition", propOrder = {

})
public class LabourPosition {

    @XmlElement(name = "DATProcessId")
    protected FieldInteger datProcessId;
    @XmlElement(name = "LabourPositionKind")
    protected FieldInteger labourPositionKind;
    @XmlElement(name = "DomusProcessId")
    protected FieldString domusProcessId;
    @XmlElement(name = "Location")
    protected FieldString location;
    @XmlElement(name = "RepairType")
    protected FieldString repairType;
    @XmlElement(name = "LabourPosId")
    protected FieldString labourPosId;
    @XmlElement(name = "Description")
    protected FieldString description;
    @XmlElement(name = "WageType")
    protected FieldString wageType;
    @XmlElement(name = "ManualWageType")
    protected FieldBoolean manualWageType;
    @XmlElement(name = "WageLevel")
    protected FieldInteger wageLevel;
    @XmlElement(name = "Duration")
    protected FieldDecimal duration;
    @XmlElement(name = "ManualDuration")
    protected FieldBoolean manualDuration;
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
    @XmlElement(name = "Amount")
    protected FieldInteger amount;
    @XmlElement(namespace = "")
    protected FieldBoolean hasRequiredByPosition;
    @XmlElement(name = "RequiredByPosition")
    protected CalcPosReference requiredByPosition;
    @XmlElement(name = "IncludedPositions")
    protected IncludedPositions includedPositions;
    @XmlElement(name = "Extended")
    protected FieldBoolean extended;
    @XmlElement(name = "IncludedInCalculation")
    protected FieldBoolean includedInCalculation;
    @XmlElement(name = "Method")
    protected FieldString method;
    @XmlElement(name = "HardshipAllowanceInd")
    protected FieldCharacter hardshipAllowanceInd;
    @XmlElement(namespace = "")
    protected FieldBoolean optionalPositionIncluded;
    @XmlElement(name = "LabourPositionState")
    protected FieldString labourPositionState;
    @XmlElement(name = "LabourPositionPriceState")
    protected FieldString labourPositionPriceState;
    @XmlElement(name = "LabourPositionTimeState")
    protected FieldString labourPositionTimeState;
    @XmlElement(namespace = "")
    protected FieldInteger size;
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
    @XmlElement(name = "Length")
    protected FieldDecimal length;
    @XmlElement(name = "Width")
    protected FieldDecimal width;
    @XmlElement(name = "WorkIndication")
    protected FieldInteger workIndication;
    @XmlElement(name = "DentsCalculationMethod")
    protected FieldString dentsCalculationMethod;

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
     * Ruft den Wert der labourPositionKind-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLabourPositionKind() {
        return labourPositionKind;
    }

    /**
     * Legt den Wert der labourPositionKind-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLabourPositionKind(FieldInteger value) {
        this.labourPositionKind = value;
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
     * Ruft den Wert der repairType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getRepairType() {
        return repairType;
    }

    /**
     * Legt den Wert der repairType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setRepairType(FieldString value) {
        this.repairType = value;
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
     * Ruft den Wert der wageType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getWageType() {
        return wageType;
    }

    /**
     * Legt den Wert der wageType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setWageType(FieldString value) {
        this.wageType = value;
    }

    /**
     * Ruft den Wert der manualWageType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getManualWageType() {
        return manualWageType;
    }

    /**
     * Legt den Wert der manualWageType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setManualWageType(FieldBoolean value) {
        this.manualWageType = value;
    }

    /**
     * Ruft den Wert der wageLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getWageLevel() {
        return wageLevel;
    }

    /**
     * Legt den Wert der wageLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setWageLevel(FieldInteger value) {
        this.wageLevel = value;
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
     * Ruft den Wert der amount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getAmount() {
        return amount;
    }

    /**
     * Legt den Wert der amount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setAmount(FieldInteger value) {
        this.amount = value;
    }

    /**
     * Ruft den Wert der hasRequiredByPosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getHasRequiredByPosition() {
        return hasRequiredByPosition;
    }

    /**
     * Legt den Wert der hasRequiredByPosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setHasRequiredByPosition(FieldBoolean value) {
        this.hasRequiredByPosition = value;
    }

    /**
     * Ruft den Wert der requiredByPosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalcPosReference }
     *     
     */
    public CalcPosReference getRequiredByPosition() {
        return requiredByPosition;
    }

    /**
     * Legt den Wert der requiredByPosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcPosReference }
     *     
     */
    public void setRequiredByPosition(CalcPosReference value) {
        this.requiredByPosition = value;
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
     * Ruft den Wert der extended-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getExtended() {
        return extended;
    }

    /**
     * Legt den Wert der extended-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setExtended(FieldBoolean value) {
        this.extended = value;
    }

    /**
     * Ruft den Wert der includedInCalculation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getIncludedInCalculation() {
        return includedInCalculation;
    }

    /**
     * Legt den Wert der includedInCalculation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setIncludedInCalculation(FieldBoolean value) {
        this.includedInCalculation = value;
    }

    /**
     * Ruft den Wert der method-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getMethod() {
        return method;
    }

    /**
     * Legt den Wert der method-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setMethod(FieldString value) {
        this.method = value;
    }

    /**
     * Ruft den Wert der hardshipAllowanceInd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldCharacter }
     *     
     */
    public FieldCharacter getHardshipAllowanceInd() {
        return hardshipAllowanceInd;
    }

    /**
     * Legt den Wert der hardshipAllowanceInd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldCharacter }
     *     
     */
    public void setHardshipAllowanceInd(FieldCharacter value) {
        this.hardshipAllowanceInd = value;
    }

    /**
     * Ruft den Wert der optionalPositionIncluded-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getOptionalPositionIncluded() {
        return optionalPositionIncluded;
    }

    /**
     * Legt den Wert der optionalPositionIncluded-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setOptionalPositionIncluded(FieldBoolean value) {
        this.optionalPositionIncluded = value;
    }

    /**
     * Ruft den Wert der labourPositionState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLabourPositionState() {
        return labourPositionState;
    }

    /**
     * Legt den Wert der labourPositionState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLabourPositionState(FieldString value) {
        this.labourPositionState = value;
    }

    /**
     * Ruft den Wert der labourPositionPriceState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLabourPositionPriceState() {
        return labourPositionPriceState;
    }

    /**
     * Legt den Wert der labourPositionPriceState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLabourPositionPriceState(FieldString value) {
        this.labourPositionPriceState = value;
    }

    /**
     * Ruft den Wert der labourPositionTimeState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLabourPositionTimeState() {
        return labourPositionTimeState;
    }

    /**
     * Legt den Wert der labourPositionTimeState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLabourPositionTimeState(FieldString value) {
        this.labourPositionTimeState = value;
    }

    /**
     * Ruft den Wert der size-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getSize() {
        return size;
    }

    /**
     * Legt den Wert der size-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setSize(FieldInteger value) {
        this.size = value;
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

    /**
     * Ruft den Wert der dentsCalculationMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDentsCalculationMethod() {
        return dentsCalculationMethod;
    }

    /**
     * Legt den Wert der dentsCalculationMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDentsCalculationMethod(FieldString value) {
        this.dentsCalculationMethod = value;
    }

}
