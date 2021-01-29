
package de.dat.financeline.services.vehicleidentificationservice;

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
 *         &lt;element name="InstallDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="AgeInMonths" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatAgeInMonths" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="Deselected" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatEquipmentId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManufacturerEquipmentId" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManufacturerDescription" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ValuationControlType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Description" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="LongDescription" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="FootnoteType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="FootnotePerc" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatFootnotePerc" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DecreaseType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatDecreaseType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PercentageOfBasePrice" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="OriginalPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="OriginalPriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="OriginalPriceUser" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatResidualValue" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatResidualValueGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ResidualValue" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ResidualValueGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Amount" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="EquipmentGroup" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="EquipmentType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Category" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManualEntry" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManualAgeEntry" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="EquipmentClass" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConstructionTimeFrom" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="EquipmentOrigin" type="{http://www.dat.de/vxs}fieldCharacter" minOccurs="0" form="qualified"/>
 *         &lt;element name="SeriesEquipmentMissing" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="PackageEquipmentId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="GearBoxType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="NrOfGears" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ContainedEquipmentPositions" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.dat.de/vxs}EquipmentPosition" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DatEquipmentIdReason" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatEquipmentIdReason2" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="EquipmentClassification" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManualDecreaseType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="VersionAccording1" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="VersionAccording2" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="VersionAccording3" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="VersionAccording4" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="VersionAccording5" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "EquipmentPosition")
public class EquipmentPosition {

    @XmlElement(name = "InstallDate")
    protected FieldDate installDate;
    @XmlElement(name = "AgeInMonths")
    protected FieldInteger ageInMonths;
    @XmlElement(name = "DatAgeInMonths")
    protected FieldInteger datAgeInMonths;
    @XmlElement(name = "Deselected")
    protected FieldBoolean deselected;
    @XmlElement(name = "DatEquipmentId")
    protected FieldInteger datEquipmentId;
    @XmlElement(name = "ManufacturerEquipmentId")
    protected FieldString manufacturerEquipmentId;
    @XmlElement(name = "ManufacturerDescription")
    protected FieldString manufacturerDescription;
    @XmlElement(name = "ValuationControlType")
    protected FieldString valuationControlType;
    @XmlElement(name = "Description")
    protected FieldString description;
    @XmlElement(name = "LongDescription")
    protected FieldString longDescription;
    @XmlElement(name = "FootnoteType")
    protected FieldString footnoteType;
    @XmlElement(name = "FootnotePerc")
    protected FieldDecimal footnotePerc;
    @XmlElement(name = "DatFootnotePerc")
    protected FieldDecimal datFootnotePerc;
    @XmlElement(name = "DecreaseType")
    protected FieldString decreaseType;
    @XmlElement(name = "DatDecreaseType")
    protected FieldString datDecreaseType;
    @XmlElement(name = "PercentageOfBasePrice")
    protected FieldInteger percentageOfBasePrice;
    @XmlElement(name = "OriginalPrice")
    protected FieldDecimal originalPrice;
    @XmlElement(name = "OriginalPriceGross")
    protected FieldDecimal originalPriceGross;
    @XmlElement(name = "OriginalPriceUser")
    protected FieldDecimal originalPriceUser;
    @XmlElement(name = "DatResidualValue")
    protected FieldDecimal datResidualValue;
    @XmlElement(name = "DatResidualValueGross")
    protected FieldDecimal datResidualValueGross;
    @XmlElement(name = "ResidualValue")
    protected FieldDecimal residualValue;
    @XmlElement(name = "ResidualValueGross")
    protected FieldDecimal residualValueGross;
    @XmlElement(name = "Amount")
    protected FieldInteger amount;
    @XmlElement(name = "EquipmentGroup")
    protected FieldString equipmentGroup;
    @XmlElement(name = "EquipmentType")
    protected FieldString equipmentType;
    @XmlElement(name = "Category")
    protected FieldString category;
    @XmlElement(name = "ManualEntry")
    protected FieldBoolean manualEntry;
    @XmlElement(name = "ManualAgeEntry")
    protected FieldBoolean manualAgeEntry;
    @XmlElement(name = "EquipmentClass")
    protected FieldInteger equipmentClass;
    @XmlElement(name = "ConstructionTimeFrom")
    protected FieldInteger constructionTimeFrom;
    @XmlElement(name = "EquipmentOrigin")
    protected FieldCharacter equipmentOrigin;
    @XmlElement(name = "SeriesEquipmentMissing")
    protected FieldBoolean seriesEquipmentMissing;
    @XmlElement(name = "PackageEquipmentId")
    protected FieldInteger packageEquipmentId;
    @XmlElement(name = "GearBoxType")
    protected FieldString gearBoxType;
    @XmlElement(name = "NrOfGears")
    protected FieldString nrOfGears;
    @XmlElement(name = "ContainedEquipmentPositions")
    protected EquipmentPosition.ContainedEquipmentPositions containedEquipmentPositions;
    @XmlElement(name = "DatEquipmentIdReason")
    protected FieldInteger datEquipmentIdReason;
    @XmlElement(name = "DatEquipmentIdReason2")
    protected FieldInteger datEquipmentIdReason2;
    @XmlElement(name = "EquipmentClassification")
    protected FieldInteger equipmentClassification;
    @XmlElement(name = "ManualDecreaseType")
    protected FieldString manualDecreaseType;
    @XmlElement(name = "VersionAccording1")
    protected FieldInteger versionAccording1;
    @XmlElement(name = "VersionAccording2")
    protected FieldInteger versionAccording2;
    @XmlElement(name = "VersionAccording3")
    protected FieldInteger versionAccording3;
    @XmlElement(name = "VersionAccording4")
    protected FieldInteger versionAccording4;
    @XmlElement(name = "VersionAccording5")
    protected FieldInteger versionAccording5;

    /**
     * Ruft den Wert der installDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getInstallDate() {
        return installDate;
    }

    /**
     * Legt den Wert der installDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setInstallDate(FieldDate value) {
        this.installDate = value;
    }

    /**
     * Ruft den Wert der ageInMonths-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getAgeInMonths() {
        return ageInMonths;
    }

    /**
     * Legt den Wert der ageInMonths-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setAgeInMonths(FieldInteger value) {
        this.ageInMonths = value;
    }

    /**
     * Ruft den Wert der datAgeInMonths-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatAgeInMonths() {
        return datAgeInMonths;
    }

    /**
     * Legt den Wert der datAgeInMonths-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatAgeInMonths(FieldInteger value) {
        this.datAgeInMonths = value;
    }

    /**
     * Ruft den Wert der deselected-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getDeselected() {
        return deselected;
    }

    /**
     * Legt den Wert der deselected-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setDeselected(FieldBoolean value) {
        this.deselected = value;
    }

    /**
     * Ruft den Wert der datEquipmentId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatEquipmentId() {
        return datEquipmentId;
    }

    /**
     * Legt den Wert der datEquipmentId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatEquipmentId(FieldInteger value) {
        this.datEquipmentId = value;
    }

    /**
     * Ruft den Wert der manufacturerEquipmentId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getManufacturerEquipmentId() {
        return manufacturerEquipmentId;
    }

    /**
     * Legt den Wert der manufacturerEquipmentId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setManufacturerEquipmentId(FieldString value) {
        this.manufacturerEquipmentId = value;
    }

    /**
     * Ruft den Wert der manufacturerDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getManufacturerDescription() {
        return manufacturerDescription;
    }

    /**
     * Legt den Wert der manufacturerDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setManufacturerDescription(FieldString value) {
        this.manufacturerDescription = value;
    }

    /**
     * Ruft den Wert der valuationControlType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getValuationControlType() {
        return valuationControlType;
    }

    /**
     * Legt den Wert der valuationControlType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setValuationControlType(FieldString value) {
        this.valuationControlType = value;
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
     * Ruft den Wert der longDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLongDescription() {
        return longDescription;
    }

    /**
     * Legt den Wert der longDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLongDescription(FieldString value) {
        this.longDescription = value;
    }

    /**
     * Ruft den Wert der footnoteType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getFootnoteType() {
        return footnoteType;
    }

    /**
     * Legt den Wert der footnoteType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setFootnoteType(FieldString value) {
        this.footnoteType = value;
    }

    /**
     * Ruft den Wert der footnotePerc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getFootnotePerc() {
        return footnotePerc;
    }

    /**
     * Legt den Wert der footnotePerc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setFootnotePerc(FieldDecimal value) {
        this.footnotePerc = value;
    }

    /**
     * Ruft den Wert der datFootnotePerc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatFootnotePerc() {
        return datFootnotePerc;
    }

    /**
     * Legt den Wert der datFootnotePerc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatFootnotePerc(FieldDecimal value) {
        this.datFootnotePerc = value;
    }

    /**
     * Ruft den Wert der decreaseType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDecreaseType() {
        return decreaseType;
    }

    /**
     * Legt den Wert der decreaseType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDecreaseType(FieldString value) {
        this.decreaseType = value;
    }

    /**
     * Ruft den Wert der datDecreaseType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDatDecreaseType() {
        return datDecreaseType;
    }

    /**
     * Legt den Wert der datDecreaseType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDatDecreaseType(FieldString value) {
        this.datDecreaseType = value;
    }

    /**
     * Ruft den Wert der percentageOfBasePrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getPercentageOfBasePrice() {
        return percentageOfBasePrice;
    }

    /**
     * Legt den Wert der percentageOfBasePrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setPercentageOfBasePrice(FieldInteger value) {
        this.percentageOfBasePrice = value;
    }

    /**
     * Ruft den Wert der originalPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getOriginalPrice() {
        return originalPrice;
    }

    /**
     * Legt den Wert der originalPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setOriginalPrice(FieldDecimal value) {
        this.originalPrice = value;
    }

    /**
     * Ruft den Wert der originalPriceGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getOriginalPriceGross() {
        return originalPriceGross;
    }

    /**
     * Legt den Wert der originalPriceGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setOriginalPriceGross(FieldDecimal value) {
        this.originalPriceGross = value;
    }

    /**
     * Ruft den Wert der originalPriceUser-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getOriginalPriceUser() {
        return originalPriceUser;
    }

    /**
     * Legt den Wert der originalPriceUser-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setOriginalPriceUser(FieldDecimal value) {
        this.originalPriceUser = value;
    }

    /**
     * Ruft den Wert der datResidualValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatResidualValue() {
        return datResidualValue;
    }

    /**
     * Legt den Wert der datResidualValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatResidualValue(FieldDecimal value) {
        this.datResidualValue = value;
    }

    /**
     * Ruft den Wert der datResidualValueGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatResidualValueGross() {
        return datResidualValueGross;
    }

    /**
     * Legt den Wert der datResidualValueGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatResidualValueGross(FieldDecimal value) {
        this.datResidualValueGross = value;
    }

    /**
     * Ruft den Wert der residualValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getResidualValue() {
        return residualValue;
    }

    /**
     * Legt den Wert der residualValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setResidualValue(FieldDecimal value) {
        this.residualValue = value;
    }

    /**
     * Ruft den Wert der residualValueGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getResidualValueGross() {
        return residualValueGross;
    }

    /**
     * Legt den Wert der residualValueGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setResidualValueGross(FieldDecimal value) {
        this.residualValueGross = value;
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
     * Ruft den Wert der equipmentGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getEquipmentGroup() {
        return equipmentGroup;
    }

    /**
     * Legt den Wert der equipmentGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setEquipmentGroup(FieldString value) {
        this.equipmentGroup = value;
    }

    /**
     * Ruft den Wert der equipmentType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getEquipmentType() {
        return equipmentType;
    }

    /**
     * Legt den Wert der equipmentType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setEquipmentType(FieldString value) {
        this.equipmentType = value;
    }

    /**
     * Ruft den Wert der category-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCategory() {
        return category;
    }

    /**
     * Legt den Wert der category-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCategory(FieldString value) {
        this.category = value;
    }

    /**
     * Ruft den Wert der manualEntry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getManualEntry() {
        return manualEntry;
    }

    /**
     * Legt den Wert der manualEntry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setManualEntry(FieldBoolean value) {
        this.manualEntry = value;
    }

    /**
     * Ruft den Wert der manualAgeEntry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getManualAgeEntry() {
        return manualAgeEntry;
    }

    /**
     * Legt den Wert der manualAgeEntry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setManualAgeEntry(FieldBoolean value) {
        this.manualAgeEntry = value;
    }

    /**
     * Ruft den Wert der equipmentClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getEquipmentClass() {
        return equipmentClass;
    }

    /**
     * Legt den Wert der equipmentClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setEquipmentClass(FieldInteger value) {
        this.equipmentClass = value;
    }

    /**
     * Ruft den Wert der constructionTimeFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getConstructionTimeFrom() {
        return constructionTimeFrom;
    }

    /**
     * Legt den Wert der constructionTimeFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setConstructionTimeFrom(FieldInteger value) {
        this.constructionTimeFrom = value;
    }

    /**
     * Ruft den Wert der equipmentOrigin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldCharacter }
     *     
     */
    public FieldCharacter getEquipmentOrigin() {
        return equipmentOrigin;
    }

    /**
     * Legt den Wert der equipmentOrigin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldCharacter }
     *     
     */
    public void setEquipmentOrigin(FieldCharacter value) {
        this.equipmentOrigin = value;
    }

    /**
     * Ruft den Wert der seriesEquipmentMissing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getSeriesEquipmentMissing() {
        return seriesEquipmentMissing;
    }

    /**
     * Legt den Wert der seriesEquipmentMissing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setSeriesEquipmentMissing(FieldBoolean value) {
        this.seriesEquipmentMissing = value;
    }

    /**
     * Ruft den Wert der packageEquipmentId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getPackageEquipmentId() {
        return packageEquipmentId;
    }

    /**
     * Legt den Wert der packageEquipmentId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setPackageEquipmentId(FieldInteger value) {
        this.packageEquipmentId = value;
    }

    /**
     * Ruft den Wert der gearBoxType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getGearBoxType() {
        return gearBoxType;
    }

    /**
     * Legt den Wert der gearBoxType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setGearBoxType(FieldString value) {
        this.gearBoxType = value;
    }

    /**
     * Ruft den Wert der nrOfGears-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNrOfGears() {
        return nrOfGears;
    }

    /**
     * Legt den Wert der nrOfGears-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNrOfGears(FieldString value) {
        this.nrOfGears = value;
    }

    /**
     * Ruft den Wert der containedEquipmentPositions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentPosition.ContainedEquipmentPositions }
     *     
     */
    public EquipmentPosition.ContainedEquipmentPositions getContainedEquipmentPositions() {
        return containedEquipmentPositions;
    }

    /**
     * Legt den Wert der containedEquipmentPositions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentPosition.ContainedEquipmentPositions }
     *     
     */
    public void setContainedEquipmentPositions(EquipmentPosition.ContainedEquipmentPositions value) {
        this.containedEquipmentPositions = value;
    }

    /**
     * Ruft den Wert der datEquipmentIdReason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatEquipmentIdReason() {
        return datEquipmentIdReason;
    }

    /**
     * Legt den Wert der datEquipmentIdReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatEquipmentIdReason(FieldInteger value) {
        this.datEquipmentIdReason = value;
    }

    /**
     * Ruft den Wert der datEquipmentIdReason2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatEquipmentIdReason2() {
        return datEquipmentIdReason2;
    }

    /**
     * Legt den Wert der datEquipmentIdReason2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatEquipmentIdReason2(FieldInteger value) {
        this.datEquipmentIdReason2 = value;
    }

    /**
     * Ruft den Wert der equipmentClassification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getEquipmentClassification() {
        return equipmentClassification;
    }

    /**
     * Legt den Wert der equipmentClassification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setEquipmentClassification(FieldInteger value) {
        this.equipmentClassification = value;
    }

    /**
     * Ruft den Wert der manualDecreaseType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getManualDecreaseType() {
        return manualDecreaseType;
    }

    /**
     * Legt den Wert der manualDecreaseType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setManualDecreaseType(FieldString value) {
        this.manualDecreaseType = value;
    }

    /**
     * Ruft den Wert der versionAccording1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getVersionAccording1() {
        return versionAccording1;
    }

    /**
     * Legt den Wert der versionAccording1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setVersionAccording1(FieldInteger value) {
        this.versionAccording1 = value;
    }

    /**
     * Ruft den Wert der versionAccording2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getVersionAccording2() {
        return versionAccording2;
    }

    /**
     * Legt den Wert der versionAccording2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setVersionAccording2(FieldInteger value) {
        this.versionAccording2 = value;
    }

    /**
     * Ruft den Wert der versionAccording3-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getVersionAccording3() {
        return versionAccording3;
    }

    /**
     * Legt den Wert der versionAccording3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setVersionAccording3(FieldInteger value) {
        this.versionAccording3 = value;
    }

    /**
     * Ruft den Wert der versionAccording4-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getVersionAccording4() {
        return versionAccording4;
    }

    /**
     * Legt den Wert der versionAccording4-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setVersionAccording4(FieldInteger value) {
        this.versionAccording4 = value;
    }

    /**
     * Ruft den Wert der versionAccording5-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getVersionAccording5() {
        return versionAccording5;
    }

    /**
     * Legt den Wert der versionAccording5-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setVersionAccording5(FieldInteger value) {
        this.versionAccording5 = value;
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
     *         &lt;element ref="{http://www.dat.de/vxs}EquipmentPosition" maxOccurs="unbounded" minOccurs="0"/>
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
        "equipmentPosition"
    })
    public static class ContainedEquipmentPositions {

        @XmlElement(name = "EquipmentPosition")
        protected List<EquipmentPosition> equipmentPosition;

        /**
         * Gets the value of the equipmentPosition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the equipmentPosition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEquipmentPosition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EquipmentPosition }
         * 
         * 
         */
        public List<EquipmentPosition> getEquipmentPosition() {
            if (equipmentPosition == null) {
                equipmentPosition = new ArrayList<EquipmentPosition>();
            }
            return this.equipmentPosition;
        }

    }

}
