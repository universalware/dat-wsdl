
package de.dat.myclaim.soap.valuationservice;

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
 *         &lt;element name="PurchaseDate" type="{http://www.dat.de/vxs}fieldDateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="PurchasePriceNet" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PurchasePriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TaxationType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="AcceptanceDate" type="{http://www.dat.de/vxs}fieldDateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="AcceptanceDetails" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="MileageExpected" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DeregistrationDate" type="{http://www.dat.de/vxs}fieldDateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="ResidualWarrantyType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ResidualWarrantyUntil" type="{http://www.dat.de/vxs}fieldDateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="ResidualWarrantyValueNet" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ResidualWarrantyValueGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PaymentAgreements" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="OtherAgreements" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ProvisionOn" type="{http://www.dat.de/vxs}fieldDateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="UserId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="AcceptanceType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "Purchase")
public class Purchase {

    @XmlElement(name = "CustomerId")
    protected FieldString10 customerId;
    @XmlElement(name = "BuyerId")
    protected FieldString10 buyerId;
    @XmlElement(name = "VehicleGroup")
    protected FieldString vehicleGroup;
    @XmlElement(name = "PurchaseDate")
    protected FieldDateTime purchaseDate;
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
    @XmlElement(name = "MileageExpected")
    protected FieldInteger mileageExpected;
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
    @XmlElement(name = "ProvisionOn")
    protected FieldDateTime provisionOn;
    @XmlElement(name = "UserId")
    protected FieldInteger userId;
    @XmlElement(name = "AcceptanceType")
    protected FieldString acceptanceType;

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
     * Ruft den Wert der purchaseDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Legt den Wert der purchaseDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setPurchaseDate(FieldDateTime value) {
        this.purchaseDate = value;
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
     * Ruft den Wert der mileageExpected-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getMileageExpected() {
        return mileageExpected;
    }

    /**
     * Legt den Wert der mileageExpected-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setMileageExpected(FieldInteger value) {
        this.mileageExpected = value;
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
     * Ruft den Wert der userId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getUserId() {
        return userId;
    }

    /**
     * Legt den Wert der userId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setUserId(FieldInteger value) {
        this.userId = value;
    }

    /**
     * Ruft den Wert der acceptanceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getAcceptanceType() {
        return acceptanceType;
    }

    /**
     * Legt den Wert der acceptanceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setAcceptanceType(FieldString value) {
        this.acceptanceType = value;
    }

}
