
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

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
 *         &lt;element name="CustomerId" type="{http://www.dat.de/vxs}fieldString10" minOccurs="0" form="qualified"/>
 *         &lt;element name="SellerId" type="{http://www.dat.de/vxs}fieldString10" minOccurs="0" form="qualified"/>
 *         &lt;element name="OrderDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="BusinessType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="VehicleGroup" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="SalesPriceNet" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SalesPriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PurchasingPriceNet" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PurchasingPriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DeliveryDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="MileageVehicle" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="MileageOdometer" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="LicenseNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="RegistrationNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="SalesDetails" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PaymentAgreements" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="OtherAgreements" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="RenewVehicleInspectionDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="ProcedureName" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Vin" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Purchaser" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="AcceptanceDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="Seller" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PaymentType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="SalesType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PayementAgreements" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="RenewMot" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ResidualWarrantyType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ResidualWarrantyUntil" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="ResidualWarrantyValueNet" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ResidualWarrantyValueGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Provider" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="RepaymentTerm" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="StartDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="EndDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="WarrantyNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="WarrantyAmountNet" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WarrantyAmountGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="NextEmissionsTestDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="NextVehicleInspectionDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="RenewEmissionVehicleInspectionCheck" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "Sale")
public class Sale {

    @XmlElement(name = "CustomerId")
    protected FieldString10 customerId;
    @XmlElement(name = "SellerId")
    protected FieldString10 sellerId;
    @XmlElement(name = "OrderDate")
    protected FieldDate orderDate;
    @XmlElement(name = "BusinessType")
    protected FieldString businessType;
    @XmlElement(name = "VehicleGroup")
    protected FieldString vehicleGroup;
    @XmlElement(name = "SalesPriceNet")
    protected FieldDecimal salesPriceNet;
    @XmlElement(name = "SalesPriceGross")
    protected FieldDecimal salesPriceGross;
    @XmlElement(name = "PurchasingPriceNet")
    protected FieldDecimal purchasingPriceNet;
    @XmlElement(name = "PurchasingPriceGross")
    protected FieldDecimal purchasingPriceGross;
    @XmlElement(name = "DeliveryDate")
    protected FieldDate deliveryDate;
    @XmlElement(name = "MileageVehicle")
    protected FieldInteger mileageVehicle;
    @XmlElement(name = "MileageOdometer")
    protected FieldInteger mileageOdometer;
    @XmlElement(name = "LicenseNumber")
    protected FieldString licenseNumber;
    @XmlElement(name = "RegistrationNumber")
    protected FieldString registrationNumber;
    @XmlElement(name = "SalesDetails")
    protected FieldString salesDetails;
    @XmlElement(name = "PaymentAgreements")
    protected FieldString paymentAgreements;
    @XmlElement(name = "OtherAgreements")
    protected FieldString otherAgreements;
    @XmlElement(name = "RenewVehicleInspectionDate")
    protected FieldDate renewVehicleInspectionDate;
    @XmlElement(name = "ProcedureName")
    protected FieldString procedureName;
    @XmlElement(name = "Vin")
    protected FieldString vin;
    @XmlElement(name = "Purchaser")
    protected FieldString purchaser;
    @XmlElement(name = "AcceptanceDate")
    protected FieldDate acceptanceDate;
    @XmlElement(name = "Seller")
    protected FieldString seller;
    @XmlElement(name = "PaymentType")
    protected FieldString paymentType;
    @XmlElement(name = "SalesType")
    protected FieldString salesType;
    @XmlElement(name = "PayementAgreements")
    protected FieldString payementAgreements;
    @XmlElement(name = "RenewMot")
    protected FieldString renewMot;
    @XmlElement(name = "ResidualWarrantyType")
    protected FieldString residualWarrantyType;
    @XmlElement(name = "ResidualWarrantyUntil")
    protected FieldDate residualWarrantyUntil;
    @XmlElement(name = "ResidualWarrantyValueNet")
    protected FieldDecimal residualWarrantyValueNet;
    @XmlElement(name = "ResidualWarrantyValueGross")
    protected FieldDecimal residualWarrantyValueGross;
    @XmlElement(name = "Provider")
    protected FieldString provider;
    @XmlElement(name = "RepaymentTerm")
    protected FieldInteger repaymentTerm;
    @XmlElement(name = "StartDate")
    protected FieldDate startDate;
    @XmlElement(name = "EndDate")
    protected FieldDate endDate;
    @XmlElement(name = "WarrantyNumber")
    protected FieldString warrantyNumber;
    @XmlElement(name = "WarrantyAmountNet")
    protected FieldDecimal warrantyAmountNet;
    @XmlElement(name = "WarrantyAmountGross")
    protected FieldDecimal warrantyAmountGross;
    @XmlElement(name = "NextEmissionsTestDate")
    protected FieldDate nextEmissionsTestDate;
    @XmlElement(name = "NextVehicleInspectionDate")
    protected FieldDate nextVehicleInspectionDate;
    @XmlElement(name = "RenewEmissionVehicleInspectionCheck")
    protected FieldBoolean renewEmissionVehicleInspectionCheck;

    /**
     * Ruft den Wert der customerId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString10 }
     *     
     */
    public FieldString10 getCustomerId() {
        return customerId;
    }

    /**
     * Legt den Wert der customerId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString10 }
     *     
     */
    public void setCustomerId(FieldString10 value) {
        this.customerId = value;
    }

    /**
     * Ruft den Wert der sellerId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString10 }
     *     
     */
    public FieldString10 getSellerId() {
        return sellerId;
    }

    /**
     * Legt den Wert der sellerId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString10 }
     *     
     */
    public void setSellerId(FieldString10 value) {
        this.sellerId = value;
    }

    /**
     * Ruft den Wert der orderDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getOrderDate() {
        return orderDate;
    }

    /**
     * Legt den Wert der orderDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setOrderDate(FieldDate value) {
        this.orderDate = value;
    }

    /**
     * Ruft den Wert der businessType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getBusinessType() {
        return businessType;
    }

    /**
     * Legt den Wert der businessType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setBusinessType(FieldString value) {
        this.businessType = value;
    }

    /**
     * Ruft den Wert der vehicleGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getVehicleGroup() {
        return vehicleGroup;
    }

    /**
     * Legt den Wert der vehicleGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setVehicleGroup(FieldString value) {
        this.vehicleGroup = value;
    }

    /**
     * Ruft den Wert der salesPriceNet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSalesPriceNet() {
        return salesPriceNet;
    }

    /**
     * Legt den Wert der salesPriceNet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSalesPriceNet(FieldDecimal value) {
        this.salesPriceNet = value;
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
     * Ruft den Wert der purchasingPriceNet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPurchasingPriceNet() {
        return purchasingPriceNet;
    }

    /**
     * Legt den Wert der purchasingPriceNet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPurchasingPriceNet(FieldDecimal value) {
        this.purchasingPriceNet = value;
    }

    /**
     * Ruft den Wert der purchasingPriceGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPurchasingPriceGross() {
        return purchasingPriceGross;
    }

    /**
     * Legt den Wert der purchasingPriceGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPurchasingPriceGross(FieldDecimal value) {
        this.purchasingPriceGross = value;
    }

    /**
     * Ruft den Wert der deliveryDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Legt den Wert der deliveryDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setDeliveryDate(FieldDate value) {
        this.deliveryDate = value;
    }

    /**
     * Ruft den Wert der mileageVehicle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getMileageVehicle() {
        return mileageVehicle;
    }

    /**
     * Legt den Wert der mileageVehicle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setMileageVehicle(FieldInteger value) {
        this.mileageVehicle = value;
    }

    /**
     * Ruft den Wert der mileageOdometer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getMileageOdometer() {
        return mileageOdometer;
    }

    /**
     * Legt den Wert der mileageOdometer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setMileageOdometer(FieldInteger value) {
        this.mileageOdometer = value;
    }

    /**
     * Ruft den Wert der licenseNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Legt den Wert der licenseNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLicenseNumber(FieldString value) {
        this.licenseNumber = value;
    }

    /**
     * Ruft den Wert der registrationNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Legt den Wert der registrationNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setRegistrationNumber(FieldString value) {
        this.registrationNumber = value;
    }

    /**
     * Ruft den Wert der salesDetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSalesDetails() {
        return salesDetails;
    }

    /**
     * Legt den Wert der salesDetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSalesDetails(FieldString value) {
        this.salesDetails = value;
    }

    /**
     * Ruft den Wert der paymentAgreements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPaymentAgreements() {
        return paymentAgreements;
    }

    /**
     * Legt den Wert der paymentAgreements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPaymentAgreements(FieldString value) {
        this.paymentAgreements = value;
    }

    /**
     * Ruft den Wert der otherAgreements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getOtherAgreements() {
        return otherAgreements;
    }

    /**
     * Legt den Wert der otherAgreements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setOtherAgreements(FieldString value) {
        this.otherAgreements = value;
    }

    /**
     * Ruft den Wert der renewVehicleInspectionDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getRenewVehicleInspectionDate() {
        return renewVehicleInspectionDate;
    }

    /**
     * Legt den Wert der renewVehicleInspectionDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setRenewVehicleInspectionDate(FieldDate value) {
        this.renewVehicleInspectionDate = value;
    }

    /**
     * Ruft den Wert der procedureName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getProcedureName() {
        return procedureName;
    }

    /**
     * Legt den Wert der procedureName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setProcedureName(FieldString value) {
        this.procedureName = value;
    }

    /**
     * Ruft den Wert der vin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getVin() {
        return vin;
    }

    /**
     * Legt den Wert der vin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setVin(FieldString value) {
        this.vin = value;
    }

    /**
     * Ruft den Wert der purchaser-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPurchaser() {
        return purchaser;
    }

    /**
     * Legt den Wert der purchaser-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPurchaser(FieldString value) {
        this.purchaser = value;
    }

    /**
     * Ruft den Wert der acceptanceDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getAcceptanceDate() {
        return acceptanceDate;
    }

    /**
     * Legt den Wert der acceptanceDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setAcceptanceDate(FieldDate value) {
        this.acceptanceDate = value;
    }

    /**
     * Ruft den Wert der seller-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSeller() {
        return seller;
    }

    /**
     * Legt den Wert der seller-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSeller(FieldString value) {
        this.seller = value;
    }

    /**
     * Ruft den Wert der paymentType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPaymentType() {
        return paymentType;
    }

    /**
     * Legt den Wert der paymentType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPaymentType(FieldString value) {
        this.paymentType = value;
    }

    /**
     * Ruft den Wert der salesType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSalesType() {
        return salesType;
    }

    /**
     * Legt den Wert der salesType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSalesType(FieldString value) {
        this.salesType = value;
    }

    /**
     * Ruft den Wert der payementAgreements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPayementAgreements() {
        return payementAgreements;
    }

    /**
     * Legt den Wert der payementAgreements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPayementAgreements(FieldString value) {
        this.payementAgreements = value;
    }

    /**
     * Ruft den Wert der renewMot-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getRenewMot() {
        return renewMot;
    }

    /**
     * Legt den Wert der renewMot-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setRenewMot(FieldString value) {
        this.renewMot = value;
    }

    /**
     * Ruft den Wert der residualWarrantyType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getResidualWarrantyType() {
        return residualWarrantyType;
    }

    /**
     * Legt den Wert der residualWarrantyType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setResidualWarrantyType(FieldString value) {
        this.residualWarrantyType = value;
    }

    /**
     * Ruft den Wert der residualWarrantyUntil-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getResidualWarrantyUntil() {
        return residualWarrantyUntil;
    }

    /**
     * Legt den Wert der residualWarrantyUntil-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setResidualWarrantyUntil(FieldDate value) {
        this.residualWarrantyUntil = value;
    }

    /**
     * Ruft den Wert der residualWarrantyValueNet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getResidualWarrantyValueNet() {
        return residualWarrantyValueNet;
    }

    /**
     * Legt den Wert der residualWarrantyValueNet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setResidualWarrantyValueNet(FieldDecimal value) {
        this.residualWarrantyValueNet = value;
    }

    /**
     * Ruft den Wert der residualWarrantyValueGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getResidualWarrantyValueGross() {
        return residualWarrantyValueGross;
    }

    /**
     * Legt den Wert der residualWarrantyValueGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setResidualWarrantyValueGross(FieldDecimal value) {
        this.residualWarrantyValueGross = value;
    }

    /**
     * Ruft den Wert der provider-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getProvider() {
        return provider;
    }

    /**
     * Legt den Wert der provider-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setProvider(FieldString value) {
        this.provider = value;
    }

    /**
     * Ruft den Wert der repaymentTerm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getRepaymentTerm() {
        return repaymentTerm;
    }

    /**
     * Legt den Wert der repaymentTerm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setRepaymentTerm(FieldInteger value) {
        this.repaymentTerm = value;
    }

    /**
     * Ruft den Wert der startDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getStartDate() {
        return startDate;
    }

    /**
     * Legt den Wert der startDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setStartDate(FieldDate value) {
        this.startDate = value;
    }

    /**
     * Ruft den Wert der endDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getEndDate() {
        return endDate;
    }

    /**
     * Legt den Wert der endDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setEndDate(FieldDate value) {
        this.endDate = value;
    }

    /**
     * Ruft den Wert der warrantyNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getWarrantyNumber() {
        return warrantyNumber;
    }

    /**
     * Legt den Wert der warrantyNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setWarrantyNumber(FieldString value) {
        this.warrantyNumber = value;
    }

    /**
     * Ruft den Wert der warrantyAmountNet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWarrantyAmountNet() {
        return warrantyAmountNet;
    }

    /**
     * Legt den Wert der warrantyAmountNet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWarrantyAmountNet(FieldDecimal value) {
        this.warrantyAmountNet = value;
    }

    /**
     * Ruft den Wert der warrantyAmountGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWarrantyAmountGross() {
        return warrantyAmountGross;
    }

    /**
     * Legt den Wert der warrantyAmountGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWarrantyAmountGross(FieldDecimal value) {
        this.warrantyAmountGross = value;
    }

    /**
     * Ruft den Wert der nextEmissionsTestDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getNextEmissionsTestDate() {
        return nextEmissionsTestDate;
    }

    /**
     * Legt den Wert der nextEmissionsTestDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setNextEmissionsTestDate(FieldDate value) {
        this.nextEmissionsTestDate = value;
    }

    /**
     * Ruft den Wert der nextVehicleInspectionDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getNextVehicleInspectionDate() {
        return nextVehicleInspectionDate;
    }

    /**
     * Legt den Wert der nextVehicleInspectionDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setNextVehicleInspectionDate(FieldDate value) {
        this.nextVehicleInspectionDate = value;
    }

    /**
     * Ruft den Wert der renewEmissionVehicleInspectionCheck-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getRenewEmissionVehicleInspectionCheck() {
        return renewEmissionVehicleInspectionCheck;
    }

    /**
     * Legt den Wert der renewEmissionVehicleInspectionCheck-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setRenewEmissionVehicleInspectionCheck(FieldBoolean value) {
        this.renewEmissionVehicleInspectionCheck = value;
    }

}
