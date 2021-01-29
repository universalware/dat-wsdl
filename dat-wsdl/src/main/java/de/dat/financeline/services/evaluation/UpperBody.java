
package de.dat.financeline.services.evaluation;

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
 *         &lt;element name="UpperBodyType" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="UpperBodyTypeName" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatUpperBodyTypeName" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Manufacturer" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManufacturerName" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatManufacturerName" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="MainModel" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="MainModelName" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatMainModelName" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="SubModel" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="SubModelName" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="InitialRegistration" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="IdentificationNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="UpperBodyColor" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PaintLabelDescription" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="OriginalPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatOriginalPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="OriginalPriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatOriginalPriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="GeneralCondition" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatGeneralCondition" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="BasePrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatBasePrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="BasePriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatBasePriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SalesPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatSalesPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SalesPriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatSalesPriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}TechInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}Equipment" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}CoolingUnit" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}Condition" minOccurs="0"/>
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
@XmlRootElement(name = "UpperBody")
public class UpperBody {

    @XmlElement(name = "UpperBodyType")
    protected FieldInteger upperBodyType;
    @XmlElement(name = "UpperBodyTypeName")
    protected FieldString upperBodyTypeName;
    @XmlElement(name = "DatUpperBodyTypeName")
    protected FieldString datUpperBodyTypeName;
    @XmlElement(name = "Manufacturer")
    protected FieldInteger manufacturer;
    @XmlElement(name = "ManufacturerName")
    protected FieldString manufacturerName;
    @XmlElement(name = "DatManufacturerName")
    protected FieldString datManufacturerName;
    @XmlElement(name = "MainModel")
    protected FieldInteger mainModel;
    @XmlElement(name = "MainModelName")
    protected FieldString mainModelName;
    @XmlElement(name = "DatMainModelName")
    protected FieldString datMainModelName;
    @XmlElement(name = "SubModel")
    protected FieldInteger subModel;
    @XmlElement(name = "SubModelName")
    protected FieldString subModelName;
    @XmlElement(name = "InitialRegistration")
    protected FieldDate initialRegistration;
    @XmlElement(name = "IdentificationNumber")
    protected FieldString identificationNumber;
    @XmlElement(name = "UpperBodyColor")
    protected FieldString upperBodyColor;
    @XmlElement(name = "PaintLabelDescription")
    protected FieldString paintLabelDescription;
    @XmlElement(name = "OriginalPrice")
    protected FieldDecimal originalPrice;
    @XmlElement(name = "DatOriginalPrice")
    protected FieldDecimal datOriginalPrice;
    @XmlElement(name = "OriginalPriceGross")
    protected FieldDecimal originalPriceGross;
    @XmlElement(name = "DatOriginalPriceGross")
    protected FieldDecimal datOriginalPriceGross;
    @XmlElement(name = "GeneralCondition")
    protected FieldDecimal generalCondition;
    @XmlElement(name = "DatGeneralCondition")
    protected FieldDecimal datGeneralCondition;
    @XmlElement(name = "BasePrice")
    protected FieldDecimal basePrice;
    @XmlElement(name = "DatBasePrice")
    protected FieldDecimal datBasePrice;
    @XmlElement(name = "BasePriceGross")
    protected FieldDecimal basePriceGross;
    @XmlElement(name = "DatBasePriceGross")
    protected FieldDecimal datBasePriceGross;
    @XmlElement(name = "SalesPrice")
    protected FieldDecimal salesPrice;
    @XmlElement(name = "DatSalesPrice")
    protected FieldDecimal datSalesPrice;
    @XmlElement(name = "SalesPriceGross")
    protected FieldDecimal salesPriceGross;
    @XmlElement(name = "DatSalesPriceGross")
    protected FieldDecimal datSalesPriceGross;
    @XmlElement(name = "TechInfo")
    protected TechInfo techInfo;
    @XmlElement(name = "Equipment")
    protected Equipment2 equipment;
    @XmlElement(name = "CoolingUnit")
    protected CoolingUnit coolingUnit;
    @XmlElement(name = "Condition")
    protected Condition2 condition;

    /**
     * Ruft den Wert der upperBodyType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getUpperBodyType() {
        return upperBodyType;
    }

    /**
     * Legt den Wert der upperBodyType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setUpperBodyType(FieldInteger value) {
        this.upperBodyType = value;
    }

    /**
     * Ruft den Wert der upperBodyTypeName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getUpperBodyTypeName() {
        return upperBodyTypeName;
    }

    /**
     * Legt den Wert der upperBodyTypeName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setUpperBodyTypeName(FieldString value) {
        this.upperBodyTypeName = value;
    }

    /**
     * Ruft den Wert der datUpperBodyTypeName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDatUpperBodyTypeName() {
        return datUpperBodyTypeName;
    }

    /**
     * Legt den Wert der datUpperBodyTypeName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDatUpperBodyTypeName(FieldString value) {
        this.datUpperBodyTypeName = value;
    }

    /**
     * Ruft den Wert der manufacturer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getManufacturer() {
        return manufacturer;
    }

    /**
     * Legt den Wert der manufacturer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setManufacturer(FieldInteger value) {
        this.manufacturer = value;
    }

    /**
     * Ruft den Wert der manufacturerName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getManufacturerName() {
        return manufacturerName;
    }

    /**
     * Legt den Wert der manufacturerName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setManufacturerName(FieldString value) {
        this.manufacturerName = value;
    }

    /**
     * Ruft den Wert der datManufacturerName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDatManufacturerName() {
        return datManufacturerName;
    }

    /**
     * Legt den Wert der datManufacturerName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDatManufacturerName(FieldString value) {
        this.datManufacturerName = value;
    }

    /**
     * Ruft den Wert der mainModel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getMainModel() {
        return mainModel;
    }

    /**
     * Legt den Wert der mainModel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setMainModel(FieldInteger value) {
        this.mainModel = value;
    }

    /**
     * Ruft den Wert der mainModelName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getMainModelName() {
        return mainModelName;
    }

    /**
     * Legt den Wert der mainModelName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setMainModelName(FieldString value) {
        this.mainModelName = value;
    }

    /**
     * Ruft den Wert der datMainModelName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDatMainModelName() {
        return datMainModelName;
    }

    /**
     * Legt den Wert der datMainModelName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDatMainModelName(FieldString value) {
        this.datMainModelName = value;
    }

    /**
     * Ruft den Wert der subModel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getSubModel() {
        return subModel;
    }

    /**
     * Legt den Wert der subModel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setSubModel(FieldInteger value) {
        this.subModel = value;
    }

    /**
     * Ruft den Wert der subModelName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSubModelName() {
        return subModelName;
    }

    /**
     * Legt den Wert der subModelName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSubModelName(FieldString value) {
        this.subModelName = value;
    }

    /**
     * Ruft den Wert der initialRegistration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getInitialRegistration() {
        return initialRegistration;
    }

    /**
     * Legt den Wert der initialRegistration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setInitialRegistration(FieldDate value) {
        this.initialRegistration = value;
    }

    /**
     * Ruft den Wert der identificationNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getIdentificationNumber() {
        return identificationNumber;
    }

    /**
     * Legt den Wert der identificationNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setIdentificationNumber(FieldString value) {
        this.identificationNumber = value;
    }

    /**
     * Ruft den Wert der upperBodyColor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getUpperBodyColor() {
        return upperBodyColor;
    }

    /**
     * Legt den Wert der upperBodyColor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setUpperBodyColor(FieldString value) {
        this.upperBodyColor = value;
    }

    /**
     * Ruft den Wert der paintLabelDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPaintLabelDescription() {
        return paintLabelDescription;
    }

    /**
     * Legt den Wert der paintLabelDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPaintLabelDescription(FieldString value) {
        this.paintLabelDescription = value;
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
     * Ruft den Wert der datOriginalPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatOriginalPrice() {
        return datOriginalPrice;
    }

    /**
     * Legt den Wert der datOriginalPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatOriginalPrice(FieldDecimal value) {
        this.datOriginalPrice = value;
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
     * Ruft den Wert der datOriginalPriceGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatOriginalPriceGross() {
        return datOriginalPriceGross;
    }

    /**
     * Legt den Wert der datOriginalPriceGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatOriginalPriceGross(FieldDecimal value) {
        this.datOriginalPriceGross = value;
    }

    /**
     * Ruft den Wert der generalCondition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getGeneralCondition() {
        return generalCondition;
    }

    /**
     * Legt den Wert der generalCondition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setGeneralCondition(FieldDecimal value) {
        this.generalCondition = value;
    }

    /**
     * Ruft den Wert der datGeneralCondition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatGeneralCondition() {
        return datGeneralCondition;
    }

    /**
     * Legt den Wert der datGeneralCondition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatGeneralCondition(FieldDecimal value) {
        this.datGeneralCondition = value;
    }

    /**
     * Ruft den Wert der basePrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getBasePrice() {
        return basePrice;
    }

    /**
     * Legt den Wert der basePrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setBasePrice(FieldDecimal value) {
        this.basePrice = value;
    }

    /**
     * Ruft den Wert der datBasePrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatBasePrice() {
        return datBasePrice;
    }

    /**
     * Legt den Wert der datBasePrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatBasePrice(FieldDecimal value) {
        this.datBasePrice = value;
    }

    /**
     * Ruft den Wert der basePriceGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getBasePriceGross() {
        return basePriceGross;
    }

    /**
     * Legt den Wert der basePriceGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setBasePriceGross(FieldDecimal value) {
        this.basePriceGross = value;
    }

    /**
     * Ruft den Wert der datBasePriceGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatBasePriceGross() {
        return datBasePriceGross;
    }

    /**
     * Legt den Wert der datBasePriceGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatBasePriceGross(FieldDecimal value) {
        this.datBasePriceGross = value;
    }

    /**
     * Ruft den Wert der salesPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSalesPrice() {
        return salesPrice;
    }

    /**
     * Legt den Wert der salesPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSalesPrice(FieldDecimal value) {
        this.salesPrice = value;
    }

    /**
     * Ruft den Wert der datSalesPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatSalesPrice() {
        return datSalesPrice;
    }

    /**
     * Legt den Wert der datSalesPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatSalesPrice(FieldDecimal value) {
        this.datSalesPrice = value;
    }

    /**
     * Ruft den Wert der salesPriceGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSalesPriceGross() {
        return salesPriceGross;
    }

    /**
     * Legt den Wert der salesPriceGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSalesPriceGross(FieldDecimal value) {
        this.salesPriceGross = value;
    }

    /**
     * Ruft den Wert der datSalesPriceGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatSalesPriceGross() {
        return datSalesPriceGross;
    }

    /**
     * Legt den Wert der datSalesPriceGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatSalesPriceGross(FieldDecimal value) {
        this.datSalesPriceGross = value;
    }

    /**
     * Ruft den Wert der techInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TechInfo }
     *     
     */
    public TechInfo getTechInfo() {
        return techInfo;
    }

    /**
     * Legt den Wert der techInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TechInfo }
     *     
     */
    public void setTechInfo(TechInfo value) {
        this.techInfo = value;
    }

    /**
     * Ruft den Wert der equipment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Equipment2 }
     *     
     */
    public Equipment2 getEquipment() {
        return equipment;
    }

    /**
     * Legt den Wert der equipment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Equipment2 }
     *     
     */
    public void setEquipment(Equipment2 value) {
        this.equipment = value;
    }

    /**
     * Ruft den Wert der coolingUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CoolingUnit }
     *     
     */
    public CoolingUnit getCoolingUnit() {
        return coolingUnit;
    }

    /**
     * Legt den Wert der coolingUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CoolingUnit }
     *     
     */
    public void setCoolingUnit(CoolingUnit value) {
        this.coolingUnit = value;
    }

    /**
     * Ruft den Wert der condition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Condition2 }
     *     
     */
    public Condition2 getCondition() {
        return condition;
    }

    /**
     * Legt den Wert der condition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Condition2 }
     *     
     */
    public void setCondition(Condition2 value) {
        this.condition = value;
    }

}
