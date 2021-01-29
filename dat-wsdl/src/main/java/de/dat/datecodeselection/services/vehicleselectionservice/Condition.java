
package de.dat.datecodeselection.services.vehicleselectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="OwnerCorrectionPerc" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatOwnerCorrectionPerc" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="OwnerCorrectionAmount" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="OwnerCorrectionAmountGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConditionCorrectionFactorPerc" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatConditionCorrectionFactorPerc" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConditionCorrectionAmount" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConditionCorrectionAmountGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="NumberOfOwners" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="AccidentDamage" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="IncreaseInValue" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatIncreaseInValue" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="IncreaseInValueGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatIncreaseInValueGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DecreaseInValue" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatDecreaseInValue" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DecreaseInValueGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatDecreaseInValueGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TiresMountedValue" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatTiresMountedValue" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TiresMountedValueGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatTiresMountedValueGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TiresUnmountedValue" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatTiresUnmountedValue" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TiresUnmountedValueGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatTiresUnmountedValueGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="RepairCosts" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatRepairCosts" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="RepairCostsGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatRepairCostsGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConditionSubTotal1" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConditionSubTotal1Gross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConditionSubTotal2" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConditionSubTotal2Gross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConditionDataAvailable" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="NextGeneralInspection" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="NextExhaustInspection" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="NextServiceDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="LastServiceDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="NextServiceMileage" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="LastServiceMileage" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="RepairCostsInTradeMargin" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConditionComment" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DamageAmount" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "Condition")
public class Condition {

    @XmlElement(name = "OwnerCorrectionPerc")
    protected FieldDecimal ownerCorrectionPerc;
    @XmlElement(name = "DatOwnerCorrectionPerc")
    protected FieldDecimal datOwnerCorrectionPerc;
    @XmlElement(name = "OwnerCorrectionAmount")
    protected FieldDecimal ownerCorrectionAmount;
    @XmlElement(name = "OwnerCorrectionAmountGross")
    protected FieldDecimal ownerCorrectionAmountGross;
    @XmlElement(name = "ConditionCorrectionFactorPerc")
    protected FieldDecimal conditionCorrectionFactorPerc;
    @XmlElement(name = "DatConditionCorrectionFactorPerc")
    protected FieldDecimal datConditionCorrectionFactorPerc;
    @XmlElement(name = "ConditionCorrectionAmount")
    protected FieldDecimal conditionCorrectionAmount;
    @XmlElement(name = "ConditionCorrectionAmountGross")
    protected FieldDecimal conditionCorrectionAmountGross;
    @XmlElement(name = "NumberOfOwners")
    protected FieldInteger numberOfOwners;
    @XmlElement(name = "AccidentDamage")
    protected FieldString accidentDamage;
    @XmlElement(name = "IncreaseInValue")
    protected FieldDecimal increaseInValue;
    @XmlElement(name = "DatIncreaseInValue")
    protected FieldDecimal datIncreaseInValue;
    @XmlElement(name = "IncreaseInValueGross")
    protected FieldDecimal increaseInValueGross;
    @XmlElement(name = "DatIncreaseInValueGross")
    protected FieldDecimal datIncreaseInValueGross;
    @XmlElement(name = "DecreaseInValue")
    protected FieldDecimal decreaseInValue;
    @XmlElement(name = "DatDecreaseInValue")
    protected FieldDecimal datDecreaseInValue;
    @XmlElement(name = "DecreaseInValueGross")
    protected FieldDecimal decreaseInValueGross;
    @XmlElement(name = "DatDecreaseInValueGross")
    protected FieldDecimal datDecreaseInValueGross;
    @XmlElement(name = "TiresMountedValue")
    protected FieldDecimal tiresMountedValue;
    @XmlElement(name = "DatTiresMountedValue")
    protected FieldDecimal datTiresMountedValue;
    @XmlElement(name = "TiresMountedValueGross")
    protected FieldDecimal tiresMountedValueGross;
    @XmlElement(name = "DatTiresMountedValueGross")
    protected FieldDecimal datTiresMountedValueGross;
    @XmlElement(name = "TiresUnmountedValue")
    protected FieldDecimal tiresUnmountedValue;
    @XmlElement(name = "DatTiresUnmountedValue")
    protected FieldDecimal datTiresUnmountedValue;
    @XmlElement(name = "TiresUnmountedValueGross")
    protected FieldDecimal tiresUnmountedValueGross;
    @XmlElement(name = "DatTiresUnmountedValueGross")
    protected FieldDecimal datTiresUnmountedValueGross;
    @XmlElement(name = "RepairCosts")
    protected FieldDecimal repairCosts;
    @XmlElement(name = "DatRepairCosts")
    protected FieldDecimal datRepairCosts;
    @XmlElement(name = "RepairCostsGross")
    protected FieldDecimal repairCostsGross;
    @XmlElement(name = "DatRepairCostsGross")
    protected FieldDecimal datRepairCostsGross;
    @XmlElement(name = "ConditionSubTotal1")
    protected FieldDecimal conditionSubTotal1;
    @XmlElement(name = "ConditionSubTotal1Gross")
    protected FieldDecimal conditionSubTotal1Gross;
    @XmlElement(name = "ConditionSubTotal2")
    protected FieldDecimal conditionSubTotal2;
    @XmlElement(name = "ConditionSubTotal2Gross")
    protected FieldDecimal conditionSubTotal2Gross;
    @XmlElement(name = "ConditionDataAvailable")
    protected FieldBoolean conditionDataAvailable;
    @XmlElement(name = "NextGeneralInspection")
    protected FieldDate nextGeneralInspection;
    @XmlElement(name = "NextExhaustInspection")
    protected FieldDate nextExhaustInspection;
    @XmlElement(name = "NextServiceDate")
    protected FieldDate nextServiceDate;
    @XmlElement(name = "LastServiceDate")
    protected FieldDate lastServiceDate;
    @XmlElement(name = "NextServiceMileage")
    protected FieldInteger nextServiceMileage;
    @XmlElement(name = "LastServiceMileage")
    protected FieldInteger lastServiceMileage;
    @XmlElement(name = "RepairCostsInTradeMargin")
    protected FieldBoolean repairCostsInTradeMargin;
    @XmlElement(name = "ConditionComment")
    protected FieldString conditionComment;
    @XmlElement(name = "DamageAmount")
    protected FieldDecimal damageAmount;

    /**
     * Ruft den Wert der ownerCorrectionPerc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getOwnerCorrectionPerc() {
        return ownerCorrectionPerc;
    }

    /**
     * Legt den Wert der ownerCorrectionPerc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setOwnerCorrectionPerc(FieldDecimal value) {
        this.ownerCorrectionPerc = value;
    }

    /**
     * Ruft den Wert der datOwnerCorrectionPerc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatOwnerCorrectionPerc() {
        return datOwnerCorrectionPerc;
    }

    /**
     * Legt den Wert der datOwnerCorrectionPerc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatOwnerCorrectionPerc(FieldDecimal value) {
        this.datOwnerCorrectionPerc = value;
    }

    /**
     * Ruft den Wert der ownerCorrectionAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getOwnerCorrectionAmount() {
        return ownerCorrectionAmount;
    }

    /**
     * Legt den Wert der ownerCorrectionAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setOwnerCorrectionAmount(FieldDecimal value) {
        this.ownerCorrectionAmount = value;
    }

    /**
     * Ruft den Wert der ownerCorrectionAmountGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getOwnerCorrectionAmountGross() {
        return ownerCorrectionAmountGross;
    }

    /**
     * Legt den Wert der ownerCorrectionAmountGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setOwnerCorrectionAmountGross(FieldDecimal value) {
        this.ownerCorrectionAmountGross = value;
    }

    /**
     * Ruft den Wert der conditionCorrectionFactorPerc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getConditionCorrectionFactorPerc() {
        return conditionCorrectionFactorPerc;
    }

    /**
     * Legt den Wert der conditionCorrectionFactorPerc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setConditionCorrectionFactorPerc(FieldDecimal value) {
        this.conditionCorrectionFactorPerc = value;
    }

    /**
     * Ruft den Wert der datConditionCorrectionFactorPerc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatConditionCorrectionFactorPerc() {
        return datConditionCorrectionFactorPerc;
    }

    /**
     * Legt den Wert der datConditionCorrectionFactorPerc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatConditionCorrectionFactorPerc(FieldDecimal value) {
        this.datConditionCorrectionFactorPerc = value;
    }

    /**
     * Ruft den Wert der conditionCorrectionAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getConditionCorrectionAmount() {
        return conditionCorrectionAmount;
    }

    /**
     * Legt den Wert der conditionCorrectionAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setConditionCorrectionAmount(FieldDecimal value) {
        this.conditionCorrectionAmount = value;
    }

    /**
     * Ruft den Wert der conditionCorrectionAmountGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getConditionCorrectionAmountGross() {
        return conditionCorrectionAmountGross;
    }

    /**
     * Legt den Wert der conditionCorrectionAmountGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setConditionCorrectionAmountGross(FieldDecimal value) {
        this.conditionCorrectionAmountGross = value;
    }

    /**
     * Ruft den Wert der numberOfOwners-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getNumberOfOwners() {
        return numberOfOwners;
    }

    /**
     * Legt den Wert der numberOfOwners-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setNumberOfOwners(FieldInteger value) {
        this.numberOfOwners = value;
    }

    /**
     * Ruft den Wert der accidentDamage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getAccidentDamage() {
        return accidentDamage;
    }

    /**
     * Legt den Wert der accidentDamage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setAccidentDamage(FieldString value) {
        this.accidentDamage = value;
    }

    /**
     * Ruft den Wert der increaseInValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getIncreaseInValue() {
        return increaseInValue;
    }

    /**
     * Legt den Wert der increaseInValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setIncreaseInValue(FieldDecimal value) {
        this.increaseInValue = value;
    }

    /**
     * Ruft den Wert der datIncreaseInValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatIncreaseInValue() {
        return datIncreaseInValue;
    }

    /**
     * Legt den Wert der datIncreaseInValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatIncreaseInValue(FieldDecimal value) {
        this.datIncreaseInValue = value;
    }

    /**
     * Ruft den Wert der increaseInValueGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getIncreaseInValueGross() {
        return increaseInValueGross;
    }

    /**
     * Legt den Wert der increaseInValueGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setIncreaseInValueGross(FieldDecimal value) {
        this.increaseInValueGross = value;
    }

    /**
     * Ruft den Wert der datIncreaseInValueGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatIncreaseInValueGross() {
        return datIncreaseInValueGross;
    }

    /**
     * Legt den Wert der datIncreaseInValueGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatIncreaseInValueGross(FieldDecimal value) {
        this.datIncreaseInValueGross = value;
    }

    /**
     * Ruft den Wert der decreaseInValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDecreaseInValue() {
        return decreaseInValue;
    }

    /**
     * Legt den Wert der decreaseInValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDecreaseInValue(FieldDecimal value) {
        this.decreaseInValue = value;
    }

    /**
     * Ruft den Wert der datDecreaseInValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatDecreaseInValue() {
        return datDecreaseInValue;
    }

    /**
     * Legt den Wert der datDecreaseInValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatDecreaseInValue(FieldDecimal value) {
        this.datDecreaseInValue = value;
    }

    /**
     * Ruft den Wert der decreaseInValueGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDecreaseInValueGross() {
        return decreaseInValueGross;
    }

    /**
     * Legt den Wert der decreaseInValueGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDecreaseInValueGross(FieldDecimal value) {
        this.decreaseInValueGross = value;
    }

    /**
     * Ruft den Wert der datDecreaseInValueGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatDecreaseInValueGross() {
        return datDecreaseInValueGross;
    }

    /**
     * Legt den Wert der datDecreaseInValueGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatDecreaseInValueGross(FieldDecimal value) {
        this.datDecreaseInValueGross = value;
    }

    /**
     * Ruft den Wert der tiresMountedValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTiresMountedValue() {
        return tiresMountedValue;
    }

    /**
     * Legt den Wert der tiresMountedValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTiresMountedValue(FieldDecimal value) {
        this.tiresMountedValue = value;
    }

    /**
     * Ruft den Wert der datTiresMountedValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatTiresMountedValue() {
        return datTiresMountedValue;
    }

    /**
     * Legt den Wert der datTiresMountedValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatTiresMountedValue(FieldDecimal value) {
        this.datTiresMountedValue = value;
    }

    /**
     * Ruft den Wert der tiresMountedValueGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTiresMountedValueGross() {
        return tiresMountedValueGross;
    }

    /**
     * Legt den Wert der tiresMountedValueGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTiresMountedValueGross(FieldDecimal value) {
        this.tiresMountedValueGross = value;
    }

    /**
     * Ruft den Wert der datTiresMountedValueGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatTiresMountedValueGross() {
        return datTiresMountedValueGross;
    }

    /**
     * Legt den Wert der datTiresMountedValueGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatTiresMountedValueGross(FieldDecimal value) {
        this.datTiresMountedValueGross = value;
    }

    /**
     * Ruft den Wert der tiresUnmountedValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTiresUnmountedValue() {
        return tiresUnmountedValue;
    }

    /**
     * Legt den Wert der tiresUnmountedValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTiresUnmountedValue(FieldDecimal value) {
        this.tiresUnmountedValue = value;
    }

    /**
     * Ruft den Wert der datTiresUnmountedValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatTiresUnmountedValue() {
        return datTiresUnmountedValue;
    }

    /**
     * Legt den Wert der datTiresUnmountedValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatTiresUnmountedValue(FieldDecimal value) {
        this.datTiresUnmountedValue = value;
    }

    /**
     * Ruft den Wert der tiresUnmountedValueGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTiresUnmountedValueGross() {
        return tiresUnmountedValueGross;
    }

    /**
     * Legt den Wert der tiresUnmountedValueGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTiresUnmountedValueGross(FieldDecimal value) {
        this.tiresUnmountedValueGross = value;
    }

    /**
     * Ruft den Wert der datTiresUnmountedValueGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatTiresUnmountedValueGross() {
        return datTiresUnmountedValueGross;
    }

    /**
     * Legt den Wert der datTiresUnmountedValueGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatTiresUnmountedValueGross(FieldDecimal value) {
        this.datTiresUnmountedValueGross = value;
    }

    /**
     * Ruft den Wert der repairCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getRepairCosts() {
        return repairCosts;
    }

    /**
     * Legt den Wert der repairCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setRepairCosts(FieldDecimal value) {
        this.repairCosts = value;
    }

    /**
     * Ruft den Wert der datRepairCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatRepairCosts() {
        return datRepairCosts;
    }

    /**
     * Legt den Wert der datRepairCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatRepairCosts(FieldDecimal value) {
        this.datRepairCosts = value;
    }

    /**
     * Ruft den Wert der repairCostsGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getRepairCostsGross() {
        return repairCostsGross;
    }

    /**
     * Legt den Wert der repairCostsGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setRepairCostsGross(FieldDecimal value) {
        this.repairCostsGross = value;
    }

    /**
     * Ruft den Wert der datRepairCostsGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatRepairCostsGross() {
        return datRepairCostsGross;
    }

    /**
     * Legt den Wert der datRepairCostsGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatRepairCostsGross(FieldDecimal value) {
        this.datRepairCostsGross = value;
    }

    /**
     * Ruft den Wert der conditionSubTotal1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getConditionSubTotal1() {
        return conditionSubTotal1;
    }

    /**
     * Legt den Wert der conditionSubTotal1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setConditionSubTotal1(FieldDecimal value) {
        this.conditionSubTotal1 = value;
    }

    /**
     * Ruft den Wert der conditionSubTotal1Gross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getConditionSubTotal1Gross() {
        return conditionSubTotal1Gross;
    }

    /**
     * Legt den Wert der conditionSubTotal1Gross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setConditionSubTotal1Gross(FieldDecimal value) {
        this.conditionSubTotal1Gross = value;
    }

    /**
     * Ruft den Wert der conditionSubTotal2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getConditionSubTotal2() {
        return conditionSubTotal2;
    }

    /**
     * Legt den Wert der conditionSubTotal2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setConditionSubTotal2(FieldDecimal value) {
        this.conditionSubTotal2 = value;
    }

    /**
     * Ruft den Wert der conditionSubTotal2Gross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getConditionSubTotal2Gross() {
        return conditionSubTotal2Gross;
    }

    /**
     * Legt den Wert der conditionSubTotal2Gross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setConditionSubTotal2Gross(FieldDecimal value) {
        this.conditionSubTotal2Gross = value;
    }

    /**
     * Ruft den Wert der conditionDataAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getConditionDataAvailable() {
        return conditionDataAvailable;
    }

    /**
     * Legt den Wert der conditionDataAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setConditionDataAvailable(FieldBoolean value) {
        this.conditionDataAvailable = value;
    }

    /**
     * Ruft den Wert der nextGeneralInspection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getNextGeneralInspection() {
        return nextGeneralInspection;
    }

    /**
     * Legt den Wert der nextGeneralInspection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setNextGeneralInspection(FieldDate value) {
        this.nextGeneralInspection = value;
    }

    /**
     * Ruft den Wert der nextExhaustInspection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getNextExhaustInspection() {
        return nextExhaustInspection;
    }

    /**
     * Legt den Wert der nextExhaustInspection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setNextExhaustInspection(FieldDate value) {
        this.nextExhaustInspection = value;
    }

    /**
     * Ruft den Wert der nextServiceDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getNextServiceDate() {
        return nextServiceDate;
    }

    /**
     * Legt den Wert der nextServiceDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setNextServiceDate(FieldDate value) {
        this.nextServiceDate = value;
    }

    /**
     * Ruft den Wert der lastServiceDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getLastServiceDate() {
        return lastServiceDate;
    }

    /**
     * Legt den Wert der lastServiceDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setLastServiceDate(FieldDate value) {
        this.lastServiceDate = value;
    }

    /**
     * Ruft den Wert der nextServiceMileage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getNextServiceMileage() {
        return nextServiceMileage;
    }

    /**
     * Legt den Wert der nextServiceMileage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setNextServiceMileage(FieldInteger value) {
        this.nextServiceMileage = value;
    }

    /**
     * Ruft den Wert der lastServiceMileage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLastServiceMileage() {
        return lastServiceMileage;
    }

    /**
     * Legt den Wert der lastServiceMileage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLastServiceMileage(FieldInteger value) {
        this.lastServiceMileage = value;
    }

    /**
     * Ruft den Wert der repairCostsInTradeMargin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getRepairCostsInTradeMargin() {
        return repairCostsInTradeMargin;
    }

    /**
     * Legt den Wert der repairCostsInTradeMargin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setRepairCostsInTradeMargin(FieldBoolean value) {
        this.repairCostsInTradeMargin = value;
    }

    /**
     * Ruft den Wert der conditionComment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getConditionComment() {
        return conditionComment;
    }

    /**
     * Legt den Wert der conditionComment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setConditionComment(FieldString value) {
        this.conditionComment = value;
    }

    /**
     * Ruft den Wert der damageAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDamageAmount() {
        return damageAmount;
    }

    /**
     * Legt den Wert der damageAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDamageAmount(FieldDecimal value) {
        this.damageAmount = value;
    }

}
