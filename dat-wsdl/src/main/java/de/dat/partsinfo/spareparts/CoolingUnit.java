
package de.dat.partsinfo.spareparts;

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
 *         &lt;element name="Manufacturer" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManufacturerName" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="MainModel" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="MainModelName" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="InitialRegistration" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="OriginalPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatOriginalPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="OriginalPriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatOriginalPriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="GeneralCondition" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatGeneralCondition" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SalesPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatSalesPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SalesPriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatSalesPriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DriveType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Usage" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="MinRecommendedBodyLength" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatMinRecommendedBodyLength" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="MaxRecommendedBodyLength" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatMaxRecommendedBodyLength" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "CoolingUnit")
public class CoolingUnit {

    @XmlElement(name = "Manufacturer")
    protected FieldInteger manufacturer;
    @XmlElement(name = "ManufacturerName")
    protected FieldString manufacturerName;
    @XmlElement(name = "MainModel")
    protected FieldInteger mainModel;
    @XmlElement(name = "MainModelName")
    protected FieldString mainModelName;
    @XmlElement(name = "InitialRegistration")
    protected FieldDate initialRegistration;
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
    @XmlElement(name = "SalesPrice")
    protected FieldDecimal salesPrice;
    @XmlElement(name = "DatSalesPrice")
    protected FieldDecimal datSalesPrice;
    @XmlElement(name = "SalesPriceGross")
    protected FieldDecimal salesPriceGross;
    @XmlElement(name = "DatSalesPriceGross")
    protected FieldDecimal datSalesPriceGross;
    @XmlElement(name = "DriveType")
    protected FieldString driveType;
    @XmlElement(name = "Usage")
    protected FieldString usage;
    @XmlElement(name = "MinRecommendedBodyLength")
    protected FieldInteger minRecommendedBodyLength;
    @XmlElement(name = "DatMinRecommendedBodyLength")
    protected FieldInteger datMinRecommendedBodyLength;
    @XmlElement(name = "MaxRecommendedBodyLength")
    protected FieldInteger maxRecommendedBodyLength;
    @XmlElement(name = "DatMaxRecommendedBodyLength")
    protected FieldInteger datMaxRecommendedBodyLength;

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
     * Ruft den Wert der driveType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDriveType() {
        return driveType;
    }

    /**
     * Legt den Wert der driveType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDriveType(FieldString value) {
        this.driveType = value;
    }

    /**
     * Ruft den Wert der usage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getUsage() {
        return usage;
    }

    /**
     * Legt den Wert der usage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setUsage(FieldString value) {
        this.usage = value;
    }

    /**
     * Ruft den Wert der minRecommendedBodyLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getMinRecommendedBodyLength() {
        return minRecommendedBodyLength;
    }

    /**
     * Legt den Wert der minRecommendedBodyLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setMinRecommendedBodyLength(FieldInteger value) {
        this.minRecommendedBodyLength = value;
    }

    /**
     * Ruft den Wert der datMinRecommendedBodyLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatMinRecommendedBodyLength() {
        return datMinRecommendedBodyLength;
    }

    /**
     * Legt den Wert der datMinRecommendedBodyLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatMinRecommendedBodyLength(FieldInteger value) {
        this.datMinRecommendedBodyLength = value;
    }

    /**
     * Ruft den Wert der maxRecommendedBodyLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getMaxRecommendedBodyLength() {
        return maxRecommendedBodyLength;
    }

    /**
     * Legt den Wert der maxRecommendedBodyLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setMaxRecommendedBodyLength(FieldInteger value) {
        this.maxRecommendedBodyLength = value;
    }

    /**
     * Ruft den Wert der datMaxRecommendedBodyLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatMaxRecommendedBodyLength() {
        return datMaxRecommendedBodyLength;
    }

    /**
     * Legt den Wert der datMaxRecommendedBodyLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatMaxRecommendedBodyLength(FieldInteger value) {
        this.datMaxRecommendedBodyLength = value;
    }

}
