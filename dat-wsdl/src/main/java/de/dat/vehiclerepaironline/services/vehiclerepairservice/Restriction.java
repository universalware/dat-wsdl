
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für restriction complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="restriction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baseModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="changeDateFrom" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="changeDateTo" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="contractName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createDateFrom" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="createDateTo" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="datEcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="garageContractName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuranceClaim" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="invoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restriction", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "baseModel",
    "calculationStatus",
    "changeDateFrom",
    "changeDateTo",
    "contractId",
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
public class Restriction {

    @XmlElementRef(name = "baseModel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> baseModel;
    @XmlElementRef(name = "calculationStatus", type = JAXBElement.class, required = false)
    protected JAXBElement<String> calculationStatus;
    @XmlElementRef(name = "changeDateFrom", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> changeDateFrom;
    @XmlElementRef(name = "changeDateTo", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> changeDateTo;
    @XmlElementRef(name = "contractId", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> contractId;
    @XmlElementRef(name = "contractName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractName;
    @XmlElementRef(name = "createDateFrom", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> createDateFrom;
    @XmlElementRef(name = "createDateTo", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> createDateTo;
    @XmlElementRef(name = "datEcode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datEcode;
    @XmlElementRef(name = "garageContractName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> garageContractName;
    @XmlElementRef(name = "insuranceClaim", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> insuranceClaim;
    @XmlElementRef(name = "invoiceNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invoiceNumber;
    @XmlElementRef(name = "manufacturer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> manufacturer;
    @XmlElementRef(name = "orderNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderNumber;
    @XmlElementRef(name = "registrationNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registrationNumber;
    @XmlElementRef(name = "subModel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subModel;
    @XmlElementRef(name = "vehicleType", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleType;
    @XmlElementRef(name = "vin", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vin;

    /**
     * Ruft den Wert der baseModel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBaseModel() {
        return baseModel;
    }

    /**
     * Legt den Wert der baseModel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBaseModel(JAXBElement<String> value) {
        this.baseModel = value;
    }

    /**
     * Ruft den Wert der calculationStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalculationStatus() {
        return calculationStatus;
    }

    /**
     * Legt den Wert der calculationStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalculationStatus(JAXBElement<String> value) {
        this.calculationStatus = value;
    }

    /**
     * Ruft den Wert der changeDateFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getChangeDateFrom() {
        return changeDateFrom;
    }

    /**
     * Legt den Wert der changeDateFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setChangeDateFrom(JAXBElement<Object> value) {
        this.changeDateFrom = value;
    }

    /**
     * Ruft den Wert der changeDateTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getChangeDateTo() {
        return changeDateTo;
    }

    /**
     * Legt den Wert der changeDateTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setChangeDateTo(JAXBElement<Object> value) {
        this.changeDateTo = value;
    }

    /**
     * Ruft den Wert der contractId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getContractId() {
        return contractId;
    }

    /**
     * Legt den Wert der contractId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setContractId(JAXBElement<Long> value) {
        this.contractId = value;
    }

    /**
     * Ruft den Wert der contractName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractName() {
        return contractName;
    }

    /**
     * Legt den Wert der contractName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractName(JAXBElement<String> value) {
        this.contractName = value;
    }

    /**
     * Ruft den Wert der createDateFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getCreateDateFrom() {
        return createDateFrom;
    }

    /**
     * Legt den Wert der createDateFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setCreateDateFrom(JAXBElement<Object> value) {
        this.createDateFrom = value;
    }

    /**
     * Ruft den Wert der createDateTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getCreateDateTo() {
        return createDateTo;
    }

    /**
     * Legt den Wert der createDateTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setCreateDateTo(JAXBElement<Object> value) {
        this.createDateTo = value;
    }

    /**
     * Ruft den Wert der datEcode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDatEcode() {
        return datEcode;
    }

    /**
     * Legt den Wert der datEcode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDatEcode(JAXBElement<String> value) {
        this.datEcode = value;
    }

    /**
     * Ruft den Wert der garageContractName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGarageContractName() {
        return garageContractName;
    }

    /**
     * Legt den Wert der garageContractName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGarageContractName(JAXBElement<String> value) {
        this.garageContractName = value;
    }

    /**
     * Ruft den Wert der insuranceClaim-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInsuranceClaim() {
        return insuranceClaim;
    }

    /**
     * Legt den Wert der insuranceClaim-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInsuranceClaim(JAXBElement<Boolean> value) {
        this.insuranceClaim = value;
    }

    /**
     * Ruft den Wert der invoiceNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Legt den Wert der invoiceNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvoiceNumber(JAXBElement<String> value) {
        this.invoiceNumber = value;
    }

    /**
     * Ruft den Wert der manufacturer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManufacturer() {
        return manufacturer;
    }

    /**
     * Legt den Wert der manufacturer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManufacturer(JAXBElement<String> value) {
        this.manufacturer = value;
    }

    /**
     * Ruft den Wert der orderNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderNumber() {
        return orderNumber;
    }

    /**
     * Legt den Wert der orderNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderNumber(JAXBElement<String> value) {
        this.orderNumber = value;
    }

    /**
     * Ruft den Wert der registrationNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Legt den Wert der registrationNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistrationNumber(JAXBElement<String> value) {
        this.registrationNumber = value;
    }

    /**
     * Ruft den Wert der subModel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubModel() {
        return subModel;
    }

    /**
     * Legt den Wert der subModel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubModel(JAXBElement<String> value) {
        this.subModel = value;
    }

    /**
     * Ruft den Wert der vehicleType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVehicleType() {
        return vehicleType;
    }

    /**
     * Legt den Wert der vehicleType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVehicleType(JAXBElement<String> value) {
        this.vehicleType = value;
    }

    /**
     * Ruft den Wert der vin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVin() {
        return vin;
    }

    /**
     * Legt den Wert der vin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVin(JAXBElement<String> value) {
        this.vin = value;
    }

}
