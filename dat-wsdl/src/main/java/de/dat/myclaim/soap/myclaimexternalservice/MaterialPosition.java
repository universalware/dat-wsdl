
package de.dat.myclaim.soap.myclaimexternalservice;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="DATProcessId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DomusProcessId" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Location" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PartNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PartNumberOrigin" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DATPartNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PartState" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PartPriceState" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PartUnitPriceState" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Description" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Amount" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="AmountState" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ValuePerUnit" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ValueTotal" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManualPosition" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManualAmount" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManualPrice" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="PartNoValidForOrder" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="PartValiditySuspect" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PriceDerived" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="UsedPart" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="LastUPE" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="Includes" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="AdditionalDesc" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="AmountDesc" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="CorrPerc" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ValueTotalCorrected" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="FootNote" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManualPriceRequired" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="IsRepairSet" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="RepairSetProcessId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="RequiredByProcessId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="IsSpecific" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}IncludedPositions" minOccurs="0"/>
 *         &lt;element name="Extended" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="IncludedInCalculation" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="MaterialUnit" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="MaterialUnitAbbr" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="MaterialUnitMultiplier" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="optionalPositionIncluded" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0"/>
 *         &lt;element name="PriceOrigin" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="TimeOrigin" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="SparePartHistoryPositions" type="{http://www.dat.de/vxs}spHistPositionsSeq" minOccurs="0" form="qualified"/>
 *         &lt;element name="PartOrigin" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="spoTmpDescription" type="{http://www.dat.de/vxs}fieldString" minOccurs="0"/>
 *         &lt;element name="spoTmpItemNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0"/>
 *         &lt;element name="spoDatItemNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0"/>
 *         &lt;element name="spoTmpPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0"/>
 *         &lt;element name="spoTmpManualPartNumber" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0"/>
 *         &lt;element name="Length" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Width" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SparePartSubPositions" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.dat.de/vxs}MaterialPosition" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Predefined" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="Manufacturer" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Dimension" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "MaterialPosition")
public class MaterialPosition {

    @XmlElement(name = "DATProcessId")
    protected FieldInteger datProcessId;
    @XmlElement(name = "DomusProcessId")
    protected FieldString domusProcessId;
    @XmlElement(name = "Location")
    protected FieldString location;
    @XmlElement(name = "PartNumber")
    protected FieldString partNumber;
    @XmlElement(name = "PartNumberOrigin")
    protected FieldString partNumberOrigin;
    @XmlElement(name = "DATPartNumber")
    protected FieldString datPartNumber;
    @XmlElement(name = "PartState")
    protected FieldString partState;
    @XmlElement(name = "PartPriceState")
    protected FieldString partPriceState;
    @XmlElement(name = "PartUnitPriceState")
    protected FieldString partUnitPriceState;
    @XmlElement(name = "Description")
    protected FieldString description;
    @XmlElement(name = "Amount")
    protected FieldDecimal amount;
    @XmlElement(name = "AmountState")
    protected FieldString amountState;
    @XmlElement(name = "ValuePerUnit")
    protected FieldDecimal valuePerUnit;
    @XmlElement(name = "ValueTotal")
    protected FieldDecimal valueTotal;
    @XmlElement(name = "ManualPosition")
    protected FieldBoolean manualPosition;
    @XmlElement(name = "ManualAmount")
    protected FieldBoolean manualAmount;
    @XmlElement(name = "ManualPrice")
    protected FieldBoolean manualPrice;
    @XmlElement(name = "PartNoValidForOrder")
    protected FieldBoolean partNoValidForOrder;
    @XmlElement(name = "PartValiditySuspect")
    protected FieldDecimal partValiditySuspect;
    @XmlElement(name = "PriceDerived")
    protected FieldBoolean priceDerived;
    @XmlElement(name = "UsedPart")
    protected FieldBoolean usedPart;
    @XmlElement(name = "LastUPE")
    protected FieldBoolean lastUPE;
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
    @XmlElement(name = "FootNote")
    protected FieldString footNote;
    @XmlElement(name = "ManualPriceRequired")
    protected FieldBoolean manualPriceRequired;
    @XmlElement(name = "IsRepairSet")
    protected FieldBoolean isRepairSet;
    @XmlElement(name = "RepairSetProcessId")
    protected FieldInteger repairSetProcessId;
    @XmlElement(name = "RequiredByProcessId")
    protected FieldInteger requiredByProcessId;
    @XmlElement(name = "IsSpecific")
    protected FieldBoolean isSpecific;
    @XmlElement(name = "IncludedPositions")
    protected IncludedPositions includedPositions;
    @XmlElement(name = "Extended")
    protected FieldBoolean extended;
    @XmlElement(name = "IncludedInCalculation")
    protected FieldBoolean includedInCalculation;
    @XmlElement(name = "MaterialUnit")
    protected FieldString materialUnit;
    @XmlElement(name = "MaterialUnitAbbr")
    protected FieldString materialUnitAbbr;
    @XmlElement(name = "MaterialUnitMultiplier")
    protected FieldDecimal materialUnitMultiplier;
    @XmlElement(namespace = "")
    protected FieldBoolean optionalPositionIncluded;
    @XmlElement(name = "PriceOrigin")
    protected FieldString priceOrigin;
    @XmlElement(name = "TimeOrigin")
    protected FieldString timeOrigin;
    @XmlElement(name = "SparePartHistoryPositions")
    protected SpHistPositionsSeq sparePartHistoryPositions;
    @XmlElement(name = "PartOrigin")
    protected FieldString partOrigin;
    @XmlElement(namespace = "")
    protected FieldString spoTmpDescription;
    @XmlElement(namespace = "")
    protected FieldString spoTmpItemNumber;
    @XmlElement(namespace = "")
    protected FieldString spoDatItemNumber;
    @XmlElement(namespace = "")
    protected FieldDecimal spoTmpPrice;
    @XmlElement(namespace = "")
    protected FieldBoolean spoTmpManualPartNumber;
    @XmlElement(name = "Length")
    protected FieldDecimal length;
    @XmlElement(name = "Width")
    protected FieldDecimal width;
    @XmlElement(name = "SparePartSubPositions", required = true)
    protected MaterialPosition.SparePartSubPositions sparePartSubPositions;
    @XmlElement(name = "Predefined")
    protected FieldBoolean predefined;
    @XmlElement(name = "Manufacturer")
    protected FieldString manufacturer;
    @XmlElement(name = "Dimension")
    protected FieldString dimension;

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
     * Ruft den Wert der partNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPartNumber() {
        return partNumber;
    }

    /**
     * Legt den Wert der partNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPartNumber(FieldString value) {
        this.partNumber = value;
    }

    /**
     * Ruft den Wert der partNumberOrigin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPartNumberOrigin() {
        return partNumberOrigin;
    }

    /**
     * Legt den Wert der partNumberOrigin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPartNumberOrigin(FieldString value) {
        this.partNumberOrigin = value;
    }

    /**
     * Ruft den Wert der datPartNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDATPartNumber() {
        return datPartNumber;
    }

    /**
     * Legt den Wert der datPartNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDATPartNumber(FieldString value) {
        this.datPartNumber = value;
    }

    /**
     * Ruft den Wert der partState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPartState() {
        return partState;
    }

    /**
     * Legt den Wert der partState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPartState(FieldString value) {
        this.partState = value;
    }

    /**
     * Ruft den Wert der partPriceState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPartPriceState() {
        return partPriceState;
    }

    /**
     * Legt den Wert der partPriceState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPartPriceState(FieldString value) {
        this.partPriceState = value;
    }

    /**
     * Ruft den Wert der partUnitPriceState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPartUnitPriceState() {
        return partUnitPriceState;
    }

    /**
     * Legt den Wert der partUnitPriceState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPartUnitPriceState(FieldString value) {
        this.partUnitPriceState = value;
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
     * Ruft den Wert der amount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getAmount() {
        return amount;
    }

    /**
     * Legt den Wert der amount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setAmount(FieldDecimal value) {
        this.amount = value;
    }

    /**
     * Ruft den Wert der amountState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getAmountState() {
        return amountState;
    }

    /**
     * Legt den Wert der amountState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setAmountState(FieldString value) {
        this.amountState = value;
    }

    /**
     * Ruft den Wert der valuePerUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getValuePerUnit() {
        return valuePerUnit;
    }

    /**
     * Legt den Wert der valuePerUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setValuePerUnit(FieldDecimal value) {
        this.valuePerUnit = value;
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
     * Ruft den Wert der manualAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getManualAmount() {
        return manualAmount;
    }

    /**
     * Legt den Wert der manualAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setManualAmount(FieldBoolean value) {
        this.manualAmount = value;
    }

    /**
     * Ruft den Wert der manualPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getManualPrice() {
        return manualPrice;
    }

    /**
     * Legt den Wert der manualPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setManualPrice(FieldBoolean value) {
        this.manualPrice = value;
    }

    /**
     * Ruft den Wert der partNoValidForOrder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getPartNoValidForOrder() {
        return partNoValidForOrder;
    }

    /**
     * Legt den Wert der partNoValidForOrder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setPartNoValidForOrder(FieldBoolean value) {
        this.partNoValidForOrder = value;
    }

    /**
     * Ruft den Wert der partValiditySuspect-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPartValiditySuspect() {
        return partValiditySuspect;
    }

    /**
     * Legt den Wert der partValiditySuspect-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPartValiditySuspect(FieldDecimal value) {
        this.partValiditySuspect = value;
    }

    /**
     * Ruft den Wert der priceDerived-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getPriceDerived() {
        return priceDerived;
    }

    /**
     * Legt den Wert der priceDerived-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setPriceDerived(FieldBoolean value) {
        this.priceDerived = value;
    }

    /**
     * Ruft den Wert der usedPart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getUsedPart() {
        return usedPart;
    }

    /**
     * Legt den Wert der usedPart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setUsedPart(FieldBoolean value) {
        this.usedPart = value;
    }

    /**
     * Ruft den Wert der lastUPE-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getLastUPE() {
        return lastUPE;
    }

    /**
     * Legt den Wert der lastUPE-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setLastUPE(FieldBoolean value) {
        this.lastUPE = value;
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
     * Ruft den Wert der footNote-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getFootNote() {
        return footNote;
    }

    /**
     * Legt den Wert der footNote-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setFootNote(FieldString value) {
        this.footNote = value;
    }

    /**
     * Ruft den Wert der manualPriceRequired-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getManualPriceRequired() {
        return manualPriceRequired;
    }

    /**
     * Legt den Wert der manualPriceRequired-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setManualPriceRequired(FieldBoolean value) {
        this.manualPriceRequired = value;
    }

    /**
     * Ruft den Wert der isRepairSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getIsRepairSet() {
        return isRepairSet;
    }

    /**
     * Legt den Wert der isRepairSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setIsRepairSet(FieldBoolean value) {
        this.isRepairSet = value;
    }

    /**
     * Ruft den Wert der repairSetProcessId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getRepairSetProcessId() {
        return repairSetProcessId;
    }

    /**
     * Legt den Wert der repairSetProcessId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setRepairSetProcessId(FieldInteger value) {
        this.repairSetProcessId = value;
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
     * Ruft den Wert der materialUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getMaterialUnit() {
        return materialUnit;
    }

    /**
     * Legt den Wert der materialUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setMaterialUnit(FieldString value) {
        this.materialUnit = value;
    }

    /**
     * Ruft den Wert der materialUnitAbbr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getMaterialUnitAbbr() {
        return materialUnitAbbr;
    }

    /**
     * Legt den Wert der materialUnitAbbr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setMaterialUnitAbbr(FieldString value) {
        this.materialUnitAbbr = value;
    }

    /**
     * Ruft den Wert der materialUnitMultiplier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getMaterialUnitMultiplier() {
        return materialUnitMultiplier;
    }

    /**
     * Legt den Wert der materialUnitMultiplier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setMaterialUnitMultiplier(FieldDecimal value) {
        this.materialUnitMultiplier = value;
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
     * Ruft den Wert der sparePartHistoryPositions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SpHistPositionsSeq }
     *     
     */
    public SpHistPositionsSeq getSparePartHistoryPositions() {
        return sparePartHistoryPositions;
    }

    /**
     * Legt den Wert der sparePartHistoryPositions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SpHistPositionsSeq }
     *     
     */
    public void setSparePartHistoryPositions(SpHistPositionsSeq value) {
        this.sparePartHistoryPositions = value;
    }

    /**
     * Ruft den Wert der partOrigin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPartOrigin() {
        return partOrigin;
    }

    /**
     * Legt den Wert der partOrigin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPartOrigin(FieldString value) {
        this.partOrigin = value;
    }

    /**
     * Ruft den Wert der spoTmpDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSpoTmpDescription() {
        return spoTmpDescription;
    }

    /**
     * Legt den Wert der spoTmpDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSpoTmpDescription(FieldString value) {
        this.spoTmpDescription = value;
    }

    /**
     * Ruft den Wert der spoTmpItemNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSpoTmpItemNumber() {
        return spoTmpItemNumber;
    }

    /**
     * Legt den Wert der spoTmpItemNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSpoTmpItemNumber(FieldString value) {
        this.spoTmpItemNumber = value;
    }

    /**
     * Ruft den Wert der spoDatItemNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSpoDatItemNumber() {
        return spoDatItemNumber;
    }

    /**
     * Legt den Wert der spoDatItemNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSpoDatItemNumber(FieldString value) {
        this.spoDatItemNumber = value;
    }

    /**
     * Ruft den Wert der spoTmpPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSpoTmpPrice() {
        return spoTmpPrice;
    }

    /**
     * Legt den Wert der spoTmpPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSpoTmpPrice(FieldDecimal value) {
        this.spoTmpPrice = value;
    }

    /**
     * Ruft den Wert der spoTmpManualPartNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getSpoTmpManualPartNumber() {
        return spoTmpManualPartNumber;
    }

    /**
     * Legt den Wert der spoTmpManualPartNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setSpoTmpManualPartNumber(FieldBoolean value) {
        this.spoTmpManualPartNumber = value;
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
     * Ruft den Wert der sparePartSubPositions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MaterialPosition.SparePartSubPositions }
     *     
     */
    public MaterialPosition.SparePartSubPositions getSparePartSubPositions() {
        return sparePartSubPositions;
    }

    /**
     * Legt den Wert der sparePartSubPositions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialPosition.SparePartSubPositions }
     *     
     */
    public void setSparePartSubPositions(MaterialPosition.SparePartSubPositions value) {
        this.sparePartSubPositions = value;
    }

    /**
     * Ruft den Wert der predefined-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getPredefined() {
        return predefined;
    }

    /**
     * Legt den Wert der predefined-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setPredefined(FieldBoolean value) {
        this.predefined = value;
    }

    /**
     * Ruft den Wert der manufacturer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getManufacturer() {
        return manufacturer;
    }

    /**
     * Legt den Wert der manufacturer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setManufacturer(FieldString value) {
        this.manufacturer = value;
    }

    /**
     * Ruft den Wert der dimension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDimension() {
        return dimension;
    }

    /**
     * Legt den Wert der dimension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDimension(FieldString value) {
        this.dimension = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.dat.de/vxs}MaterialPosition" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "materialPosition"
    })
    public static class SparePartSubPositions {

        @XmlElement(name = "MaterialPosition")
        protected List<MaterialPosition> materialPosition;

        /**
         * Gets the value of the materialPosition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the materialPosition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMaterialPosition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MaterialPosition }
         * 
         * 
         */
        public List<MaterialPosition> getMaterialPosition() {
            if (materialPosition == null) {
                materialPosition = new ArrayList<MaterialPosition>();
            }
            return this.materialPosition;
        }

    }

}
