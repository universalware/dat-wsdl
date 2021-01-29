
package de.dat.vehiclerepaironline.services.dossier;

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
 *       &lt;sequence>
 *         &lt;element name="DamageDate" type="{http://www.dat.de/vxs}fieldDateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="RepairCoverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="OrderNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="InvoiceNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="JobNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DamageNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PolicyNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Retention" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="RetentionAmount" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="BillingCategory" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="InsuranceId" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="InsuranceGroupId" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ServiceProviderId" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="InsuranceType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="LossLocation" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DamageType" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="InspectionDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="DeclarationOfAssignment" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="InsuranceCase" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="CreationDateTime" type="{http://www.dat.de/vxs}fieldDateTime" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}AdditionalData" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}MetaPositions" minOccurs="0"/>
 *         &lt;element name="InsuranceNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="InsuranceAgency" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="TypeOfInsurance" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="InvoiceDate" type="{http://www.dat.de/vxs}fieldDateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="CountryFlagDamageEvent" type="{http://www.dat.de/vxs}fieldString3" minOccurs="0" form="qualified"/>
 *         &lt;element name="InsuranceName" type="{http://www.dat.de/vxs}fieldString40" minOccurs="0" form="qualified"/>
 *         &lt;element name="TokenContributionInInsuranceCase" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Deleted" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="GDVRoutingType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Comment" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}DATProcessIdCommentList" minOccurs="0"/>
 *         &lt;element name="EstimatedRepairTimeInDays" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="ReplacementCar" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="ReplacementCarTimeInDays" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="ReplacementCarCosts" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="OtherCostsDescription" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="OtherCosts" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TowingRecoveryCosts" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="OtherDeductionsDescription" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="OtherDeductions" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
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
    "damageDate",
    "repairCoverage",
    "orderNumber",
    "invoiceNumber",
    "jobNumber",
    "damageNumber",
    "policyNumber",
    "retention",
    "retentionAmount",
    "billingCategory",
    "insuranceId",
    "insuranceGroupId",
    "serviceProviderId",
    "insuranceType",
    "lossLocation",
    "damageType",
    "inspectionDate",
    "declarationOfAssignment",
    "insuranceCase",
    "creationDateTime",
    "additionalData",
    "metaPositions",
    "insuranceNumber",
    "insuranceAgency",
    "typeOfInsurance",
    "invoiceDate",
    "countryFlagDamageEvent",
    "insuranceName",
    "tokenContributionInInsuranceCase",
    "deleted",
    "gdvRoutingType",
    "comment",
    "datProcessIdCommentList",
    "estimatedRepairTimeInDays",
    "replacementCar",
    "replacementCarTimeInDays",
    "replacementCarCosts",
    "otherCostsDescription",
    "otherCosts",
    "towingRecoveryCosts",
    "otherDeductionsDescription",
    "otherDeductions"
})
@XmlRootElement(name = "RepairOrder")
public class RepairOrder {

    @XmlElement(name = "DamageDate")
    protected FieldDateTime damageDate;
    @XmlElement(name = "RepairCoverage")
    protected String repairCoverage;
    @XmlElement(name = "OrderNumber")
    protected FieldString orderNumber;
    @XmlElement(name = "InvoiceNumber")
    protected FieldString invoiceNumber;
    @XmlElement(name = "JobNumber")
    protected FieldString jobNumber;
    @XmlElement(name = "DamageNumber")
    protected FieldString damageNumber;
    @XmlElement(name = "PolicyNumber")
    protected FieldString policyNumber;
    @XmlElement(name = "Retention")
    protected FieldBoolean retention;
    @XmlElement(name = "RetentionAmount")
    protected FieldDecimal retentionAmount;
    @XmlElement(name = "BillingCategory")
    protected FieldDecimal billingCategory;
    @XmlElement(name = "InsuranceId")
    protected FieldString insuranceId;
    @XmlElement(name = "InsuranceGroupId")
    protected FieldString insuranceGroupId;
    @XmlElement(name = "ServiceProviderId")
    protected FieldString serviceProviderId;
    @XmlElement(name = "InsuranceType")
    protected FieldString insuranceType;
    @XmlElement(name = "LossLocation")
    protected FieldString lossLocation;
    @XmlElement(name = "DamageType")
    protected FieldInteger damageType;
    @XmlElement(name = "InspectionDate")
    protected FieldDate inspectionDate;
    @XmlElement(name = "DeclarationOfAssignment")
    protected FieldBoolean declarationOfAssignment;
    @XmlElement(name = "InsuranceCase")
    protected FieldBoolean insuranceCase;
    @XmlElement(name = "CreationDateTime")
    protected FieldDateTime creationDateTime;
    @XmlElement(name = "AdditionalData")
    protected AdditionalData additionalData;
    @XmlElement(name = "MetaPositions")
    protected MetaPositions metaPositions;
    @XmlElement(name = "InsuranceNumber")
    protected FieldString insuranceNumber;
    @XmlElement(name = "InsuranceAgency")
    protected FieldString insuranceAgency;
    @XmlElement(name = "TypeOfInsurance")
    protected FieldInteger typeOfInsurance;
    @XmlElement(name = "InvoiceDate")
    protected FieldDateTime invoiceDate;
    @XmlElement(name = "CountryFlagDamageEvent")
    protected FieldString3 countryFlagDamageEvent;
    @XmlElement(name = "InsuranceName")
    protected FieldString40 insuranceName;
    @XmlElement(name = "TokenContributionInInsuranceCase")
    protected FieldString tokenContributionInInsuranceCase;
    @XmlElement(name = "Deleted")
    protected FieldBoolean deleted;
    @XmlElement(name = "GDVRoutingType")
    protected FieldString gdvRoutingType;
    @XmlElement(name = "Comment")
    protected FieldString comment;
    @XmlElement(name = "DATProcessIdCommentList")
    protected DATProcessIdCommentList datProcessIdCommentList;
    @XmlElement(name = "EstimatedRepairTimeInDays")
    protected FieldInteger estimatedRepairTimeInDays;
    @XmlElement(name = "ReplacementCar")
    protected FieldBoolean replacementCar;
    @XmlElement(name = "ReplacementCarTimeInDays")
    protected FieldInteger replacementCarTimeInDays;
    @XmlElement(name = "ReplacementCarCosts")
    protected FieldDecimal replacementCarCosts;
    @XmlElement(name = "OtherCostsDescription")
    protected FieldString otherCostsDescription;
    @XmlElement(name = "OtherCosts")
    protected FieldDecimal otherCosts;
    @XmlElement(name = "TowingRecoveryCosts")
    protected FieldDecimal towingRecoveryCosts;
    @XmlElement(name = "OtherDeductionsDescription")
    protected FieldString otherDeductionsDescription;
    @XmlElement(name = "OtherDeductions")
    protected FieldDecimal otherDeductions;

    /**
     * Ruft den Wert der damageDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDamageDate() {
        return damageDate;
    }

    /**
     * Legt den Wert der damageDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDamageDate(FieldDateTime value) {
        this.damageDate = value;
    }

    /**
     * Ruft den Wert der repairCoverage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepairCoverage() {
        return repairCoverage;
    }

    /**
     * Legt den Wert der repairCoverage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepairCoverage(String value) {
        this.repairCoverage = value;
    }

    /**
     * Ruft den Wert der orderNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getOrderNumber() {
        return orderNumber;
    }

    /**
     * Legt den Wert der orderNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setOrderNumber(FieldString value) {
        this.orderNumber = value;
    }

    /**
     * Ruft den Wert der invoiceNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Legt den Wert der invoiceNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setInvoiceNumber(FieldString value) {
        this.invoiceNumber = value;
    }

    /**
     * Ruft den Wert der jobNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getJobNumber() {
        return jobNumber;
    }

    /**
     * Legt den Wert der jobNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setJobNumber(FieldString value) {
        this.jobNumber = value;
    }

    /**
     * Ruft den Wert der damageNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDamageNumber() {
        return damageNumber;
    }

    /**
     * Legt den Wert der damageNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDamageNumber(FieldString value) {
        this.damageNumber = value;
    }

    /**
     * Ruft den Wert der policyNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Legt den Wert der policyNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPolicyNumber(FieldString value) {
        this.policyNumber = value;
    }

    /**
     * Ruft den Wert der retention-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getRetention() {
        return retention;
    }

    /**
     * Legt den Wert der retention-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setRetention(FieldBoolean value) {
        this.retention = value;
    }

    /**
     * Ruft den Wert der retentionAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getRetentionAmount() {
        return retentionAmount;
    }

    /**
     * Legt den Wert der retentionAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setRetentionAmount(FieldDecimal value) {
        this.retentionAmount = value;
    }

    /**
     * Ruft den Wert der billingCategory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getBillingCategory() {
        return billingCategory;
    }

    /**
     * Legt den Wert der billingCategory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setBillingCategory(FieldDecimal value) {
        this.billingCategory = value;
    }

    /**
     * Ruft den Wert der insuranceId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getInsuranceId() {
        return insuranceId;
    }

    /**
     * Legt den Wert der insuranceId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setInsuranceId(FieldString value) {
        this.insuranceId = value;
    }

    /**
     * Ruft den Wert der insuranceGroupId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getInsuranceGroupId() {
        return insuranceGroupId;
    }

    /**
     * Legt den Wert der insuranceGroupId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setInsuranceGroupId(FieldString value) {
        this.insuranceGroupId = value;
    }

    /**
     * Ruft den Wert der serviceProviderId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getServiceProviderId() {
        return serviceProviderId;
    }

    /**
     * Legt den Wert der serviceProviderId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setServiceProviderId(FieldString value) {
        this.serviceProviderId = value;
    }

    /**
     * Ruft den Wert der insuranceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getInsuranceType() {
        return insuranceType;
    }

    /**
     * Legt den Wert der insuranceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setInsuranceType(FieldString value) {
        this.insuranceType = value;
    }

    /**
     * Ruft den Wert der lossLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLossLocation() {
        return lossLocation;
    }

    /**
     * Legt den Wert der lossLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLossLocation(FieldString value) {
        this.lossLocation = value;
    }

    /**
     * Ruft den Wert der damageType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDamageType() {
        return damageType;
    }

    /**
     * Legt den Wert der damageType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDamageType(FieldInteger value) {
        this.damageType = value;
    }

    /**
     * Ruft den Wert der inspectionDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getInspectionDate() {
        return inspectionDate;
    }

    /**
     * Legt den Wert der inspectionDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setInspectionDate(FieldDate value) {
        this.inspectionDate = value;
    }

    /**
     * Ruft den Wert der declarationOfAssignment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getDeclarationOfAssignment() {
        return declarationOfAssignment;
    }

    /**
     * Legt den Wert der declarationOfAssignment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setDeclarationOfAssignment(FieldBoolean value) {
        this.declarationOfAssignment = value;
    }

    /**
     * Ruft den Wert der insuranceCase-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getInsuranceCase() {
        return insuranceCase;
    }

    /**
     * Legt den Wert der insuranceCase-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setInsuranceCase(FieldBoolean value) {
        this.insuranceCase = value;
    }

    /**
     * Ruft den Wert der creationDateTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Legt den Wert der creationDateTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setCreationDateTime(FieldDateTime value) {
        this.creationDateTime = value;
    }

    /**
     * Ruft den Wert der additionalData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalData }
     *     
     */
    public AdditionalData getAdditionalData() {
        return additionalData;
    }

    /**
     * Legt den Wert der additionalData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalData }
     *     
     */
    public void setAdditionalData(AdditionalData value) {
        this.additionalData = value;
    }

    /**
     * Ruft den Wert der metaPositions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetaPositions }
     *     
     */
    public MetaPositions getMetaPositions() {
        return metaPositions;
    }

    /**
     * Legt den Wert der metaPositions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaPositions }
     *     
     */
    public void setMetaPositions(MetaPositions value) {
        this.metaPositions = value;
    }

    /**
     * Ruft den Wert der insuranceNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getInsuranceNumber() {
        return insuranceNumber;
    }

    /**
     * Legt den Wert der insuranceNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setInsuranceNumber(FieldString value) {
        this.insuranceNumber = value;
    }

    /**
     * Ruft den Wert der insuranceAgency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getInsuranceAgency() {
        return insuranceAgency;
    }

    /**
     * Legt den Wert der insuranceAgency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setInsuranceAgency(FieldString value) {
        this.insuranceAgency = value;
    }

    /**
     * Ruft den Wert der typeOfInsurance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getTypeOfInsurance() {
        return typeOfInsurance;
    }

    /**
     * Legt den Wert der typeOfInsurance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setTypeOfInsurance(FieldInteger value) {
        this.typeOfInsurance = value;
    }

    /**
     * Ruft den Wert der invoiceDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Legt den Wert der invoiceDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setInvoiceDate(FieldDateTime value) {
        this.invoiceDate = value;
    }

    /**
     * Ruft den Wert der countryFlagDamageEvent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString3 }
     *     
     */
    public FieldString3 getCountryFlagDamageEvent() {
        return countryFlagDamageEvent;
    }

    /**
     * Legt den Wert der countryFlagDamageEvent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString3 }
     *     
     */
    public void setCountryFlagDamageEvent(FieldString3 value) {
        this.countryFlagDamageEvent = value;
    }

    /**
     * Ruft den Wert der insuranceName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString40 }
     *     
     */
    public FieldString40 getInsuranceName() {
        return insuranceName;
    }

    /**
     * Legt den Wert der insuranceName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString40 }
     *     
     */
    public void setInsuranceName(FieldString40 value) {
        this.insuranceName = value;
    }

    /**
     * Ruft den Wert der tokenContributionInInsuranceCase-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTokenContributionInInsuranceCase() {
        return tokenContributionInInsuranceCase;
    }

    /**
     * Legt den Wert der tokenContributionInInsuranceCase-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTokenContributionInInsuranceCase(FieldString value) {
        this.tokenContributionInInsuranceCase = value;
    }

    /**
     * Ruft den Wert der deleted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getDeleted() {
        return deleted;
    }

    /**
     * Legt den Wert der deleted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setDeleted(FieldBoolean value) {
        this.deleted = value;
    }

    /**
     * Ruft den Wert der gdvRoutingType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getGDVRoutingType() {
        return gdvRoutingType;
    }

    /**
     * Legt den Wert der gdvRoutingType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setGDVRoutingType(FieldString value) {
        this.gdvRoutingType = value;
    }

    /**
     * Ruft den Wert der comment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getComment() {
        return comment;
    }

    /**
     * Legt den Wert der comment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setComment(FieldString value) {
        this.comment = value;
    }

    /**
     * Ruft den Wert der datProcessIdCommentList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DATProcessIdCommentList }
     *     
     */
    public DATProcessIdCommentList getDATProcessIdCommentList() {
        return datProcessIdCommentList;
    }

    /**
     * Legt den Wert der datProcessIdCommentList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DATProcessIdCommentList }
     *     
     */
    public void setDATProcessIdCommentList(DATProcessIdCommentList value) {
        this.datProcessIdCommentList = value;
    }

    /**
     * Ruft den Wert der estimatedRepairTimeInDays-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getEstimatedRepairTimeInDays() {
        return estimatedRepairTimeInDays;
    }

    /**
     * Legt den Wert der estimatedRepairTimeInDays-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setEstimatedRepairTimeInDays(FieldInteger value) {
        this.estimatedRepairTimeInDays = value;
    }

    /**
     * Ruft den Wert der replacementCar-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getReplacementCar() {
        return replacementCar;
    }

    /**
     * Legt den Wert der replacementCar-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setReplacementCar(FieldBoolean value) {
        this.replacementCar = value;
    }

    /**
     * Ruft den Wert der replacementCarTimeInDays-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getReplacementCarTimeInDays() {
        return replacementCarTimeInDays;
    }

    /**
     * Legt den Wert der replacementCarTimeInDays-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setReplacementCarTimeInDays(FieldInteger value) {
        this.replacementCarTimeInDays = value;
    }

    /**
     * Ruft den Wert der replacementCarCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getReplacementCarCosts() {
        return replacementCarCosts;
    }

    /**
     * Legt den Wert der replacementCarCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setReplacementCarCosts(FieldDecimal value) {
        this.replacementCarCosts = value;
    }

    /**
     * Ruft den Wert der otherCostsDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getOtherCostsDescription() {
        return otherCostsDescription;
    }

    /**
     * Legt den Wert der otherCostsDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setOtherCostsDescription(FieldString value) {
        this.otherCostsDescription = value;
    }

    /**
     * Ruft den Wert der otherCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getOtherCosts() {
        return otherCosts;
    }

    /**
     * Legt den Wert der otherCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setOtherCosts(FieldDecimal value) {
        this.otherCosts = value;
    }

    /**
     * Ruft den Wert der towingRecoveryCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTowingRecoveryCosts() {
        return towingRecoveryCosts;
    }

    /**
     * Legt den Wert der towingRecoveryCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTowingRecoveryCosts(FieldDecimal value) {
        this.towingRecoveryCosts = value;
    }

    /**
     * Ruft den Wert der otherDeductionsDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getOtherDeductionsDescription() {
        return otherDeductionsDescription;
    }

    /**
     * Legt den Wert der otherDeductionsDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setOtherDeductionsDescription(FieldString value) {
        this.otherDeductionsDescription = value;
    }

    /**
     * Ruft den Wert der otherDeductions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getOtherDeductions() {
        return otherDeductions;
    }

    /**
     * Legt den Wert der otherDeductions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setOtherDeductions(FieldDecimal value) {
        this.otherDeductions = value;
    }

}
