
package de.dat.vehiclerepaironline.dossierservice;

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
 *         &lt;element name="ColorType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatColorType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Color" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatColor" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ColorCodeFromVin" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ColorVariant" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatColorVariant" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatLacquerType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="CushionType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatCushionType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="CushionTypeName" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatCushionTypeName" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="CushionColorType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatCushionColorType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="CushionColor" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatCushionColor" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="EquipmentValue" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="EquipmentValueGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatEquipmentValue" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatEquipmentValueGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="OriginalEquipmentValue" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="OriginalEquipmentValueGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatOriginalEquipmentValue" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatOriginalEquipmentValueGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="EquipmentValueType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="SpecialEditionPackageId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="SpecialEditionPackageName" type="{http://www.dat.de/vxs}fieldString30" minOccurs="0" form="qualified"/>
 *         &lt;element name="SeriesEquipment" type="{http://www.dat.de/vxs}equipSequence" minOccurs="0" form="qualified"/>
 *         &lt;element name="DeselectedSeriesEquipment" type="{http://www.dat.de/vxs}equipSequence" minOccurs="0" form="qualified"/>
 *         &lt;element name="SpecialModelEquipment" type="{http://www.dat.de/vxs}equipSequence" minOccurs="0" form="qualified"/>
 *         &lt;element name="SpecialEquipment" type="{http://www.dat.de/vxs}equipSequence" minOccurs="0" form="qualified"/>
 *         &lt;element name="FreeSpecialEquipment" type="{http://www.dat.de/vxs}equipSequence" minOccurs="0" form="qualified"/>
 *         &lt;element name="AdditionalEquipment" type="{http://www.dat.de/vxs}equipSequence" minOccurs="0" form="qualified"/>
 *         &lt;element name="FlatRateEquipment" type="{http://www.dat.de/vxs}equipSequence" minOccurs="0" form="qualified"/>
 *         &lt;element name="DenialCaseEquipment" type="{http://www.dat.de/vxs}equipSequence" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "Equipment")
public class Equipment {

    @XmlElement(name = "ColorType")
    protected FieldString colorType;
    @XmlElement(name = "DatColorType")
    protected FieldString datColorType;
    @XmlElement(name = "Color")
    protected FieldString color;
    @XmlElement(name = "DatColor")
    protected FieldString datColor;
    @XmlElement(name = "ColorCodeFromVin")
    protected FieldString colorCodeFromVin;
    @XmlElement(name = "ColorVariant")
    protected FieldString colorVariant;
    @XmlElement(name = "DatColorVariant")
    protected FieldString datColorVariant;
    @XmlElement(name = "LacquerType")
    protected FieldString lacquerType;
    @XmlElement(name = "DatLacquerType")
    protected FieldString datLacquerType;
    @XmlElement(name = "CushionType")
    protected FieldString cushionType;
    @XmlElement(name = "DatCushionType")
    protected FieldString datCushionType;
    @XmlElement(name = "CushionTypeName")
    protected FieldString cushionTypeName;
    @XmlElement(name = "DatCushionTypeName")
    protected FieldString datCushionTypeName;
    @XmlElement(name = "CushionColorType")
    protected FieldString cushionColorType;
    @XmlElement(name = "DatCushionColorType")
    protected FieldString datCushionColorType;
    @XmlElement(name = "CushionColor")
    protected FieldString cushionColor;
    @XmlElement(name = "DatCushionColor")
    protected FieldString datCushionColor;
    @XmlElement(name = "EquipmentValue")
    protected FieldDecimal equipmentValue;
    @XmlElement(name = "EquipmentValueGross")
    protected FieldDecimal equipmentValueGross;
    @XmlElement(name = "DatEquipmentValue")
    protected FieldDecimal datEquipmentValue;
    @XmlElement(name = "DatEquipmentValueGross")
    protected FieldDecimal datEquipmentValueGross;
    @XmlElement(name = "OriginalEquipmentValue")
    protected FieldDecimal originalEquipmentValue;
    @XmlElement(name = "OriginalEquipmentValueGross")
    protected FieldDecimal originalEquipmentValueGross;
    @XmlElement(name = "DatOriginalEquipmentValue")
    protected FieldDecimal datOriginalEquipmentValue;
    @XmlElement(name = "DatOriginalEquipmentValueGross")
    protected FieldDecimal datOriginalEquipmentValueGross;
    @XmlElement(name = "EquipmentValueType")
    protected FieldString equipmentValueType;
    @XmlElement(name = "SpecialEditionPackageId")
    protected FieldInteger specialEditionPackageId;
    @XmlElement(name = "SpecialEditionPackageName")
    protected FieldString30 specialEditionPackageName;
    @XmlElement(name = "SeriesEquipment")
    protected EquipSequence seriesEquipment;
    @XmlElement(name = "DeselectedSeriesEquipment")
    protected EquipSequence deselectedSeriesEquipment;
    @XmlElement(name = "SpecialModelEquipment")
    protected EquipSequence specialModelEquipment;
    @XmlElement(name = "SpecialEquipment")
    protected EquipSequence specialEquipment;
    @XmlElement(name = "FreeSpecialEquipment")
    protected EquipSequence freeSpecialEquipment;
    @XmlElement(name = "AdditionalEquipment")
    protected EquipSequence additionalEquipment;
    @XmlElement(name = "FlatRateEquipment")
    protected EquipSequence flatRateEquipment;
    @XmlElement(name = "DenialCaseEquipment")
    protected EquipSequence denialCaseEquipment;

    /**
     * Ruft den Wert der colorType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getColorType() {
        return colorType;
    }

    /**
     * Legt den Wert der colorType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setColorType(FieldString value) {
        this.colorType = value;
    }

    /**
     * Ruft den Wert der datColorType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDatColorType() {
        return datColorType;
    }

    /**
     * Legt den Wert der datColorType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDatColorType(FieldString value) {
        this.datColorType = value;
    }

    /**
     * Ruft den Wert der color-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getColor() {
        return color;
    }

    /**
     * Legt den Wert der color-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setColor(FieldString value) {
        this.color = value;
    }

    /**
     * Ruft den Wert der datColor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDatColor() {
        return datColor;
    }

    /**
     * Legt den Wert der datColor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDatColor(FieldString value) {
        this.datColor = value;
    }

    /**
     * Ruft den Wert der colorCodeFromVin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getColorCodeFromVin() {
        return colorCodeFromVin;
    }

    /**
     * Legt den Wert der colorCodeFromVin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setColorCodeFromVin(FieldString value) {
        this.colorCodeFromVin = value;
    }

    /**
     * Ruft den Wert der colorVariant-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getColorVariant() {
        return colorVariant;
    }

    /**
     * Legt den Wert der colorVariant-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setColorVariant(FieldString value) {
        this.colorVariant = value;
    }

    /**
     * Ruft den Wert der datColorVariant-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDatColorVariant() {
        return datColorVariant;
    }

    /**
     * Legt den Wert der datColorVariant-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDatColorVariant(FieldString value) {
        this.datColorVariant = value;
    }

    /**
     * Ruft den Wert der lacquerType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLacquerType() {
        return lacquerType;
    }

    /**
     * Legt den Wert der lacquerType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLacquerType(FieldString value) {
        this.lacquerType = value;
    }

    /**
     * Ruft den Wert der datLacquerType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDatLacquerType() {
        return datLacquerType;
    }

    /**
     * Legt den Wert der datLacquerType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDatLacquerType(FieldString value) {
        this.datLacquerType = value;
    }

    /**
     * Ruft den Wert der cushionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCushionType() {
        return cushionType;
    }

    /**
     * Legt den Wert der cushionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCushionType(FieldString value) {
        this.cushionType = value;
    }

    /**
     * Ruft den Wert der datCushionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDatCushionType() {
        return datCushionType;
    }

    /**
     * Legt den Wert der datCushionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDatCushionType(FieldString value) {
        this.datCushionType = value;
    }

    /**
     * Ruft den Wert der cushionTypeName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCushionTypeName() {
        return cushionTypeName;
    }

    /**
     * Legt den Wert der cushionTypeName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCushionTypeName(FieldString value) {
        this.cushionTypeName = value;
    }

    /**
     * Ruft den Wert der datCushionTypeName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDatCushionTypeName() {
        return datCushionTypeName;
    }

    /**
     * Legt den Wert der datCushionTypeName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDatCushionTypeName(FieldString value) {
        this.datCushionTypeName = value;
    }

    /**
     * Ruft den Wert der cushionColorType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCushionColorType() {
        return cushionColorType;
    }

    /**
     * Legt den Wert der cushionColorType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCushionColorType(FieldString value) {
        this.cushionColorType = value;
    }

    /**
     * Ruft den Wert der datCushionColorType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDatCushionColorType() {
        return datCushionColorType;
    }

    /**
     * Legt den Wert der datCushionColorType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDatCushionColorType(FieldString value) {
        this.datCushionColorType = value;
    }

    /**
     * Ruft den Wert der cushionColor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCushionColor() {
        return cushionColor;
    }

    /**
     * Legt den Wert der cushionColor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCushionColor(FieldString value) {
        this.cushionColor = value;
    }

    /**
     * Ruft den Wert der datCushionColor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDatCushionColor() {
        return datCushionColor;
    }

    /**
     * Legt den Wert der datCushionColor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDatCushionColor(FieldString value) {
        this.datCushionColor = value;
    }

    /**
     * Ruft den Wert der equipmentValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getEquipmentValue() {
        return equipmentValue;
    }

    /**
     * Legt den Wert der equipmentValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setEquipmentValue(FieldDecimal value) {
        this.equipmentValue = value;
    }

    /**
     * Ruft den Wert der equipmentValueGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getEquipmentValueGross() {
        return equipmentValueGross;
    }

    /**
     * Legt den Wert der equipmentValueGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setEquipmentValueGross(FieldDecimal value) {
        this.equipmentValueGross = value;
    }

    /**
     * Ruft den Wert der datEquipmentValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatEquipmentValue() {
        return datEquipmentValue;
    }

    /**
     * Legt den Wert der datEquipmentValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatEquipmentValue(FieldDecimal value) {
        this.datEquipmentValue = value;
    }

    /**
     * Ruft den Wert der datEquipmentValueGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatEquipmentValueGross() {
        return datEquipmentValueGross;
    }

    /**
     * Legt den Wert der datEquipmentValueGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatEquipmentValueGross(FieldDecimal value) {
        this.datEquipmentValueGross = value;
    }

    /**
     * Ruft den Wert der originalEquipmentValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getOriginalEquipmentValue() {
        return originalEquipmentValue;
    }

    /**
     * Legt den Wert der originalEquipmentValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setOriginalEquipmentValue(FieldDecimal value) {
        this.originalEquipmentValue = value;
    }

    /**
     * Ruft den Wert der originalEquipmentValueGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getOriginalEquipmentValueGross() {
        return originalEquipmentValueGross;
    }

    /**
     * Legt den Wert der originalEquipmentValueGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setOriginalEquipmentValueGross(FieldDecimal value) {
        this.originalEquipmentValueGross = value;
    }

    /**
     * Ruft den Wert der datOriginalEquipmentValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatOriginalEquipmentValue() {
        return datOriginalEquipmentValue;
    }

    /**
     * Legt den Wert der datOriginalEquipmentValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatOriginalEquipmentValue(FieldDecimal value) {
        this.datOriginalEquipmentValue = value;
    }

    /**
     * Ruft den Wert der datOriginalEquipmentValueGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatOriginalEquipmentValueGross() {
        return datOriginalEquipmentValueGross;
    }

    /**
     * Legt den Wert der datOriginalEquipmentValueGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatOriginalEquipmentValueGross(FieldDecimal value) {
        this.datOriginalEquipmentValueGross = value;
    }

    /**
     * Ruft den Wert der equipmentValueType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getEquipmentValueType() {
        return equipmentValueType;
    }

    /**
     * Legt den Wert der equipmentValueType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setEquipmentValueType(FieldString value) {
        this.equipmentValueType = value;
    }

    /**
     * Ruft den Wert der specialEditionPackageId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getSpecialEditionPackageId() {
        return specialEditionPackageId;
    }

    /**
     * Legt den Wert der specialEditionPackageId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setSpecialEditionPackageId(FieldInteger value) {
        this.specialEditionPackageId = value;
    }

    /**
     * Ruft den Wert der specialEditionPackageName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString30 }
     *     
     */
    public FieldString30 getSpecialEditionPackageName() {
        return specialEditionPackageName;
    }

    /**
     * Legt den Wert der specialEditionPackageName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString30 }
     *     
     */
    public void setSpecialEditionPackageName(FieldString30 value) {
        this.specialEditionPackageName = value;
    }

    /**
     * Ruft den Wert der seriesEquipment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EquipSequence }
     *     
     */
    public EquipSequence getSeriesEquipment() {
        return seriesEquipment;
    }

    /**
     * Legt den Wert der seriesEquipment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipSequence }
     *     
     */
    public void setSeriesEquipment(EquipSequence value) {
        this.seriesEquipment = value;
    }

    /**
     * Ruft den Wert der deselectedSeriesEquipment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EquipSequence }
     *     
     */
    public EquipSequence getDeselectedSeriesEquipment() {
        return deselectedSeriesEquipment;
    }

    /**
     * Legt den Wert der deselectedSeriesEquipment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipSequence }
     *     
     */
    public void setDeselectedSeriesEquipment(EquipSequence value) {
        this.deselectedSeriesEquipment = value;
    }

    /**
     * Ruft den Wert der specialModelEquipment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EquipSequence }
     *     
     */
    public EquipSequence getSpecialModelEquipment() {
        return specialModelEquipment;
    }

    /**
     * Legt den Wert der specialModelEquipment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipSequence }
     *     
     */
    public void setSpecialModelEquipment(EquipSequence value) {
        this.specialModelEquipment = value;
    }

    /**
     * Ruft den Wert der specialEquipment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EquipSequence }
     *     
     */
    public EquipSequence getSpecialEquipment() {
        return specialEquipment;
    }

    /**
     * Legt den Wert der specialEquipment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipSequence }
     *     
     */
    public void setSpecialEquipment(EquipSequence value) {
        this.specialEquipment = value;
    }

    /**
     * Ruft den Wert der freeSpecialEquipment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EquipSequence }
     *     
     */
    public EquipSequence getFreeSpecialEquipment() {
        return freeSpecialEquipment;
    }

    /**
     * Legt den Wert der freeSpecialEquipment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipSequence }
     *     
     */
    public void setFreeSpecialEquipment(EquipSequence value) {
        this.freeSpecialEquipment = value;
    }

    /**
     * Ruft den Wert der additionalEquipment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EquipSequence }
     *     
     */
    public EquipSequence getAdditionalEquipment() {
        return additionalEquipment;
    }

    /**
     * Legt den Wert der additionalEquipment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipSequence }
     *     
     */
    public void setAdditionalEquipment(EquipSequence value) {
        this.additionalEquipment = value;
    }

    /**
     * Ruft den Wert der flatRateEquipment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EquipSequence }
     *     
     */
    public EquipSequence getFlatRateEquipment() {
        return flatRateEquipment;
    }

    /**
     * Legt den Wert der flatRateEquipment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipSequence }
     *     
     */
    public void setFlatRateEquipment(EquipSequence value) {
        this.flatRateEquipment = value;
    }

    /**
     * Ruft den Wert der denialCaseEquipment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EquipSequence }
     *     
     */
    public EquipSequence getDenialCaseEquipment() {
        return denialCaseEquipment;
    }

    /**
     * Legt den Wert der denialCaseEquipment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipSequence }
     *     
     */
    public void setDenialCaseEquipment(EquipSequence value) {
        this.denialCaseEquipment = value;
    }

}
