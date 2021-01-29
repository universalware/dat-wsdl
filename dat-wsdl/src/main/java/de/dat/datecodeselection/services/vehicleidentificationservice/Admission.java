
package de.dat.datecodeselection.services.vehicleidentificationservice;

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
 *         &lt;element name="BuyerId" type="{http://www.dat.de/vxs}fieldString10" minOccurs="0" form="qualified"/>
 *         &lt;element name="VehicleGroup" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="AdmissionDate" type="{http://www.dat.de/vxs}fieldDateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="AdmissionPriceNet" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="AdmissionPriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PurchasePriceNet" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PurchasePriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TaxationType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="AcceptanceDate" type="{http://www.dat.de/vxs}fieldDateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="AcceptanceDetails" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="MileageVehicle" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="MileageOdometer" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Location" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DeregistrationDate" type="{http://www.dat.de/vxs}fieldDateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="ResidualWarrantyType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ResidualWarrantyUntil" type="{http://www.dat.de/vxs}fieldDateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="ResidualWarrantyValueNet" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ResidualWarrantyValueGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PaymentAgreements" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="OtherAgreements" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="BusinessType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="AcceptanceInfo" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Buyer" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ProvisionOn" type="{http://www.dat.de/vxs}fieldDateTime" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}FollowUpBusiness" minOccurs="0"/>
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
@XmlRootElement(name = "Admission")
public class Admission {

    @XmlElement(name = "CustomerId")
    protected FieldString10 customerId;
    @XmlElement(name = "BuyerId")
    protected FieldString10 buyerId;
    @XmlElement(name = "VehicleGroup")
    protected FieldString vehicleGroup;
    @XmlElement(name = "AdmissionDate")
    protected FieldDateTime admissionDate;
    @XmlElement(name = "AdmissionPriceNet")
    protected FieldDecimal admissionPriceNet;
    @XmlElement(name = "AdmissionPriceGross")
    protected FieldDecimal admissionPriceGross;
    @XmlElement(name = "PurchasePriceNet")
    protected FieldDecimal purchasePriceNet;
    @XmlElement(name = "PurchasePriceGross")
    protected FieldDecimal purchasePriceGross;
    @XmlElement(name = "TaxationType")
    protected FieldString taxationType;
    @XmlElement(name = "AcceptanceDate")
    protected FieldDateTime acceptanceDate;
    @XmlElement(name = "AcceptanceDetails")
    protected FieldString acceptanceDetails;
    @XmlElement(name = "MileageVehicle")
    protected FieldDecimal mileageVehicle;
    @XmlElement(name = "MileageOdometer")
    protected FieldDecimal mileageOdometer;
    @XmlElement(name = "Location")
    protected FieldString location;
    @XmlElement(name = "DeregistrationDate")
    protected FieldDateTime deregistrationDate;
    @XmlElement(name = "ResidualWarrantyType")
    protected FieldString residualWarrantyType;
    @XmlElement(name = "ResidualWarrantyUntil")
    protected FieldDateTime residualWarrantyUntil;
    @XmlElement(name = "ResidualWarrantyValueNet")
    protected FieldDecimal residualWarrantyValueNet;
    @XmlElement(name = "ResidualWarrantyValueGross")
    protected FieldDecimal residualWarrantyValueGross;
    @XmlElement(name = "PaymentAgreements")
    protected FieldString paymentAgreements;
    @XmlElement(name = "OtherAgreements")
    protected FieldString otherAgreements;
    @XmlElement(name = "BusinessType")
    protected FieldString businessType;
    @XmlElement(name = "AcceptanceInfo")
    protected FieldString acceptanceInfo;
    @XmlElement(name = "Buyer")
    protected FieldString buyer;
    @XmlElement(name = "ProvisionOn")
    protected FieldDateTime provisionOn;
    @XmlElement(name = "FollowUpBusiness")
    protected FollowUpBusiness followUpBusiness;

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
     * Ruft den Wert der buyerId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString10 }
     *     
     */
    public FieldString10 getBuyerId() {
        return buyerId;
    }

    /**
     * Legt den Wert der buyerId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString10 }
     *     
     */
    public void setBuyerId(FieldString10 value) {
        this.buyerId = value;
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
     * Ruft den Wert der admissionDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getAdmissionDate() {
        return admissionDate;
    }

    /**
     * Legt den Wert der admissionDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setAdmissionDate(FieldDateTime value) {
        this.admissionDate = value;
    }

    /**
     * Ruft den Wert der admissionPriceNet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getAdmissionPriceNet() {
        return admissionPriceNet;
    }

    /**
     * Legt den Wert der admissionPriceNet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setAdmissionPriceNet(FieldDecimal value) {
        this.admissionPriceNet = value;
    }

    /**
     * Ruft den Wert der admissionPriceGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getAdmissionPriceGross() {
        return admissionPriceGross;
    }

    /**
     * Legt den Wert der admissionPriceGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setAdmissionPriceGross(FieldDecimal value) {
        this.admissionPriceGross = value;
    }

    /**
     * Ruft den Wert der purchasePriceNet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPurchasePriceNet() {
        return purchasePriceNet;
    }

    /**
     * Legt den Wert der purchasePriceNet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPurchasePriceNet(FieldDecimal value) {
        this.purchasePriceNet = value;
    }

    /**
     * Ruft den Wert der purchasePriceGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPurchasePriceGross() {
        return purchasePriceGross;
    }

    /**
     * Legt den Wert der purchasePriceGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPurchasePriceGross(FieldDecimal value) {
        this.purchasePriceGross = value;
    }

    /**
     * Ruft den Wert der taxationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTaxationType() {
        return taxationType;
    }

    /**
     * Legt den Wert der taxationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTaxationType(FieldString value) {
        this.taxationType = value;
    }

    /**
     * Ruft den Wert der acceptanceDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getAcceptanceDate() {
        return acceptanceDate;
    }

    /**
     * Legt den Wert der acceptanceDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setAcceptanceDate(FieldDateTime value) {
        this.acceptanceDate = value;
    }

    /**
     * Ruft den Wert der acceptanceDetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getAcceptanceDetails() {
        return acceptanceDetails;
    }

    /**
     * Legt den Wert der acceptanceDetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setAcceptanceDetails(FieldString value) {
        this.acceptanceDetails = value;
    }

    /**
     * Ruft den Wert der mileageVehicle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getMileageVehicle() {
        return mileageVehicle;
    }

    /**
     * Legt den Wert der mileageVehicle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setMileageVehicle(FieldDecimal value) {
        this.mileageVehicle = value;
    }

    /**
     * Ruft den Wert der mileageOdometer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getMileageOdometer() {
        return mileageOdometer;
    }

    /**
     * Legt den Wert der mileageOdometer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setMileageOdometer(FieldDecimal value) {
        this.mileageOdometer = value;
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
     * Ruft den Wert der deregistrationDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDeregistrationDate() {
        return deregistrationDate;
    }

    /**
     * Legt den Wert der deregistrationDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDeregistrationDate(FieldDateTime value) {
        this.deregistrationDate = value;
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
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getResidualWarrantyUntil() {
        return residualWarrantyUntil;
    }

    /**
     * Legt den Wert der residualWarrantyUntil-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setResidualWarrantyUntil(FieldDateTime value) {
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
     * Ruft den Wert der acceptanceInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getAcceptanceInfo() {
        return acceptanceInfo;
    }

    /**
     * Legt den Wert der acceptanceInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setAcceptanceInfo(FieldString value) {
        this.acceptanceInfo = value;
    }

    /**
     * Ruft den Wert der buyer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getBuyer() {
        return buyer;
    }

    /**
     * Legt den Wert der buyer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setBuyer(FieldString value) {
        this.buyer = value;
    }

    /**
     * Ruft den Wert der provisionOn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getProvisionOn() {
        return provisionOn;
    }

    /**
     * Legt den Wert der provisionOn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setProvisionOn(FieldDateTime value) {
        this.provisionOn = value;
    }

    /**
     * Ruft den Wert der followUpBusiness-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FollowUpBusiness }
     *     
     */
    public FollowUpBusiness getFollowUpBusiness() {
        return followUpBusiness;
    }

    /**
     * Legt den Wert der followUpBusiness-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FollowUpBusiness }
     *     
     */
    public void setFollowUpBusiness(FollowUpBusiness value) {
        this.followUpBusiness = value;
    }

}
