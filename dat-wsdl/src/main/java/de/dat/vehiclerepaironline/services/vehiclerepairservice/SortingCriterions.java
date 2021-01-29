
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für sortingCriterions complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="sortingCriterions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baseModel" type="{http://sphinx.dat.de/services/VehicleRepairService}orderInfo" minOccurs="0"/>
 *         &lt;element name="changeDateFrom" type="{http://sphinx.dat.de/services/VehicleRepairService}orderInfo" minOccurs="0"/>
 *         &lt;element name="changeDateTo" type="{http://sphinx.dat.de/services/VehicleRepairService}orderInfo" minOccurs="0"/>
 *         &lt;element name="contractName" type="{http://sphinx.dat.de/services/VehicleRepairService}orderInfo" minOccurs="0"/>
 *         &lt;element name="createDateFrom" type="{http://sphinx.dat.de/services/VehicleRepairService}orderInfo" minOccurs="0"/>
 *         &lt;element name="createDateTo" type="{http://sphinx.dat.de/services/VehicleRepairService}orderInfo" minOccurs="0"/>
 *         &lt;element name="datEcode" type="{http://sphinx.dat.de/services/VehicleRepairService}orderInfo" minOccurs="0"/>
 *         &lt;element name="garageContractName" type="{http://sphinx.dat.de/services/VehicleRepairService}orderInfo" minOccurs="0"/>
 *         &lt;element name="insuranceClaim" type="{http://sphinx.dat.de/services/VehicleRepairService}orderInfo" minOccurs="0"/>
 *         &lt;element name="invoiceNumber" type="{http://sphinx.dat.de/services/VehicleRepairService}orderInfo" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://sphinx.dat.de/services/VehicleRepairService}orderInfo" minOccurs="0"/>
 *         &lt;element name="orderNumber" type="{http://sphinx.dat.de/services/VehicleRepairService}orderInfo" minOccurs="0"/>
 *         &lt;element name="registrationNumber" type="{http://sphinx.dat.de/services/VehicleRepairService}orderInfo" minOccurs="0"/>
 *         &lt;element name="subModel" type="{http://sphinx.dat.de/services/VehicleRepairService}orderInfo" minOccurs="0"/>
 *         &lt;element name="vehicleType" type="{http://sphinx.dat.de/services/VehicleRepairService}orderInfo" minOccurs="0"/>
 *         &lt;element name="vin" type="{http://sphinx.dat.de/services/VehicleRepairService}orderInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sortingCriterions", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "baseModel",
    "changeDateFrom",
    "changeDateTo",
    "contractName",
    "createDateFrom",
    "createDateTo",
    "datEcode",
    "garageContractName",
    "insuranceClaim",
    "invoiceNumber",
    "manufacturer",
    "orderNumber",
    "registrationNumber",
    "subModel",
    "vehicleType",
    "vin"
})
public class SortingCriterions {

    @XmlElementRef(name = "baseModel", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderInfo> baseModel;
    @XmlElementRef(name = "changeDateFrom", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderInfo> changeDateFrom;
    @XmlElementRef(name = "changeDateTo", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderInfo> changeDateTo;
    @XmlElementRef(name = "contractName", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderInfo> contractName;
    @XmlElementRef(name = "createDateFrom", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderInfo> createDateFrom;
    @XmlElementRef(name = "createDateTo", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderInfo> createDateTo;
    @XmlElementRef(name = "datEcode", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderInfo> datEcode;
    @XmlElementRef(name = "garageContractName", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderInfo> garageContractName;
    @XmlElementRef(name = "insuranceClaim", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderInfo> insuranceClaim;
    @XmlElementRef(name = "invoiceNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderInfo> invoiceNumber;
    @XmlElementRef(name = "manufacturer", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderInfo> manufacturer;
    @XmlElementRef(name = "orderNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderInfo> orderNumber;
    @XmlElementRef(name = "registrationNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderInfo> registrationNumber;
    @XmlElementRef(name = "subModel", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderInfo> subModel;
    @XmlElementRef(name = "vehicleType", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderInfo> vehicleType;
    @XmlElementRef(name = "vin", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderInfo> vin;

    /**
     * Ruft den Wert der baseModel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public JAXBElement<OrderInfo> getBaseModel() {
        return baseModel;
    }

    /**
     * Legt den Wert der baseModel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public void setBaseModel(JAXBElement<OrderInfo> value) {
        this.baseModel = value;
    }

    /**
     * Ruft den Wert der changeDateFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public JAXBElement<OrderInfo> getChangeDateFrom() {
        return changeDateFrom;
    }

    /**
     * Legt den Wert der changeDateFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public void setChangeDateFrom(JAXBElement<OrderInfo> value) {
        this.changeDateFrom = value;
    }

    /**
     * Ruft den Wert der changeDateTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public JAXBElement<OrderInfo> getChangeDateTo() {
        return changeDateTo;
    }

    /**
     * Legt den Wert der changeDateTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public void setChangeDateTo(JAXBElement<OrderInfo> value) {
        this.changeDateTo = value;
    }

    /**
     * Ruft den Wert der contractName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public JAXBElement<OrderInfo> getContractName() {
        return contractName;
    }

    /**
     * Legt den Wert der contractName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public void setContractName(JAXBElement<OrderInfo> value) {
        this.contractName = value;
    }

    /**
     * Ruft den Wert der createDateFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public JAXBElement<OrderInfo> getCreateDateFrom() {
        return createDateFrom;
    }

    /**
     * Legt den Wert der createDateFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public void setCreateDateFrom(JAXBElement<OrderInfo> value) {
        this.createDateFrom = value;
    }

    /**
     * Ruft den Wert der createDateTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public JAXBElement<OrderInfo> getCreateDateTo() {
        return createDateTo;
    }

    /**
     * Legt den Wert der createDateTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public void setCreateDateTo(JAXBElement<OrderInfo> value) {
        this.createDateTo = value;
    }

    /**
     * Ruft den Wert der datEcode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public JAXBElement<OrderInfo> getDatEcode() {
        return datEcode;
    }

    /**
     * Legt den Wert der datEcode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public void setDatEcode(JAXBElement<OrderInfo> value) {
        this.datEcode = value;
    }

    /**
     * Ruft den Wert der garageContractName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public JAXBElement<OrderInfo> getGarageContractName() {
        return garageContractName;
    }

    /**
     * Legt den Wert der garageContractName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public void setGarageContractName(JAXBElement<OrderInfo> value) {
        this.garageContractName = value;
    }

    /**
     * Ruft den Wert der insuranceClaim-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public JAXBElement<OrderInfo> getInsuranceClaim() {
        return insuranceClaim;
    }

    /**
     * Legt den Wert der insuranceClaim-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public void setInsuranceClaim(JAXBElement<OrderInfo> value) {
        this.insuranceClaim = value;
    }

    /**
     * Ruft den Wert der invoiceNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public JAXBElement<OrderInfo> getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Legt den Wert der invoiceNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public void setInvoiceNumber(JAXBElement<OrderInfo> value) {
        this.invoiceNumber = value;
    }

    /**
     * Ruft den Wert der manufacturer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public JAXBElement<OrderInfo> getManufacturer() {
        return manufacturer;
    }

    /**
     * Legt den Wert der manufacturer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public void setManufacturer(JAXBElement<OrderInfo> value) {
        this.manufacturer = value;
    }

    /**
     * Ruft den Wert der orderNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public JAXBElement<OrderInfo> getOrderNumber() {
        return orderNumber;
    }

    /**
     * Legt den Wert der orderNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public void setOrderNumber(JAXBElement<OrderInfo> value) {
        this.orderNumber = value;
    }

    /**
     * Ruft den Wert der registrationNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public JAXBElement<OrderInfo> getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Legt den Wert der registrationNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public void setRegistrationNumber(JAXBElement<OrderInfo> value) {
        this.registrationNumber = value;
    }

    /**
     * Ruft den Wert der subModel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public JAXBElement<OrderInfo> getSubModel() {
        return subModel;
    }

    /**
     * Legt den Wert der subModel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public void setSubModel(JAXBElement<OrderInfo> value) {
        this.subModel = value;
    }

    /**
     * Ruft den Wert der vehicleType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public JAXBElement<OrderInfo> getVehicleType() {
        return vehicleType;
    }

    /**
     * Legt den Wert der vehicleType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public void setVehicleType(JAXBElement<OrderInfo> value) {
        this.vehicleType = value;
    }

    /**
     * Ruft den Wert der vin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public JAXBElement<OrderInfo> getVin() {
        return vin;
    }

    /**
     * Legt den Wert der vin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}
     *     
     */
    public void setVin(JAXBElement<OrderInfo> value) {
        this.vin = value;
    }

}
