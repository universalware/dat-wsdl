
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CalculationSummary complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CalculationSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="SparePartsCosts" type="{http://www.dat.de/vxs}SparePartsCostsSummary" minOccurs="0" form="qualified"/>
 *         &lt;element name="AuxiliaryCosts" type="{http://www.dat.de/vxs}AuxiliaryCostsSummary" minOccurs="0" form="qualified"/>
 *         &lt;element name="LabourCosts" type="{http://www.dat.de/vxs}LabourCostsSummary" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerCosts" type="{http://www.dat.de/vxs}LacquerCostsSummary" minOccurs="0" form="qualified"/>
 *         &lt;element name="VATReplacementPart" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SurchargeDiscounts" type="{http://www.dat.de/vxs}SurchargeDiscountsSummary" minOccurs="0" form="qualified"/>
 *         &lt;element name="TotalNetCosts" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TotalVAT" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TotalGrossCosts" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TotalNetDiscount" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TotalVATDiscount" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TotalGrossDiscount" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TotalNetDeductible" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TotalVATDeductible" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TotalGrossDeductible" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TotalNetCorrected" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TotalVATCorrected" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TotalGrossCorrected" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="RetentionTotalNet" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="RetentionTotalGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DiffCommonToOptimizedAmount" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DiffCommonToOptimizedPerc" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DiffToUpe" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="UpeInProcent" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="AmountCustomer" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="AmountInsurance" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SumNet" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SumGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SumSparePartCosts" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SumSmallSparePartCosts" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SumOtherMaterialCosts" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SumMiscellaneousCosts" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SumLabourCosts" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="CalculationDeductionsSummary" type="{http://www.dat.de/vxs}DeductionsSummary" minOccurs="0" form="qualified"/>
 *         &lt;element name="AdditionalCostsFlatAmount" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TotalNetDiscountExpert" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TotalVATDiscountExpert" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TotalGrossDiscountExpert" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}MetaPositions" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculationSummary", propOrder = {

})
public class CalculationSummary {

    @XmlElement(name = "SparePartsCosts")
    protected SparePartsCostsSummary sparePartsCosts;
    @XmlElement(name = "AuxiliaryCosts")
    protected AuxiliaryCostsSummary auxiliaryCosts;
    @XmlElement(name = "LabourCosts")
    protected LabourCostsSummary labourCosts;
    @XmlElement(name = "LacquerCosts")
    protected LacquerCostsSummary lacquerCosts;
    @XmlElement(name = "VATReplacementPart")
    protected FieldDecimal vatReplacementPart;
    @XmlElement(name = "SurchargeDiscounts")
    protected SurchargeDiscountsSummary surchargeDiscounts;
    @XmlElement(name = "TotalNetCosts")
    protected FieldDecimal totalNetCosts;
    @XmlElement(name = "TotalVAT")
    protected FieldDecimal totalVAT;
    @XmlElement(name = "TotalGrossCosts")
    protected FieldDecimal totalGrossCosts;
    @XmlElement(name = "TotalNetDiscount")
    protected FieldDecimal totalNetDiscount;
    @XmlElement(name = "TotalVATDiscount")
    protected FieldDecimal totalVATDiscount;
    @XmlElement(name = "TotalGrossDiscount")
    protected FieldDecimal totalGrossDiscount;
    @XmlElement(name = "TotalNetDeductible")
    protected FieldDecimal totalNetDeductible;
    @XmlElement(name = "TotalVATDeductible")
    protected FieldDecimal totalVATDeductible;
    @XmlElement(name = "TotalGrossDeductible")
    protected FieldDecimal totalGrossDeductible;
    @XmlElement(name = "TotalNetCorrected")
    protected FieldDecimal totalNetCorrected;
    @XmlElement(name = "TotalVATCorrected")
    protected FieldDecimal totalVATCorrected;
    @XmlElement(name = "TotalGrossCorrected")
    protected FieldDecimal totalGrossCorrected;
    @XmlElement(name = "RetentionTotalNet")
    protected FieldDecimal retentionTotalNet;
    @XmlElement(name = "RetentionTotalGross")
    protected FieldDecimal retentionTotalGross;
    @XmlElement(name = "DiffCommonToOptimizedAmount")
    protected FieldDecimal diffCommonToOptimizedAmount;
    @XmlElement(name = "DiffCommonToOptimizedPerc")
    protected FieldDecimal diffCommonToOptimizedPerc;
    @XmlElement(name = "DiffToUpe")
    protected FieldDecimal diffToUpe;
    @XmlElement(name = "UpeInProcent")
    protected FieldDecimal upeInProcent;
    @XmlElement(name = "AmountCustomer")
    protected FieldDecimal amountCustomer;
    @XmlElement(name = "AmountInsurance")
    protected FieldDecimal amountInsurance;
    @XmlElement(name = "SumNet")
    protected FieldDecimal sumNet;
    @XmlElement(name = "SumGross")
    protected FieldDecimal sumGross;
    @XmlElement(name = "SumSparePartCosts")
    protected FieldDecimal sumSparePartCosts;
    @XmlElement(name = "SumSmallSparePartCosts")
    protected FieldDecimal sumSmallSparePartCosts;
    @XmlElement(name = "SumOtherMaterialCosts")
    protected FieldDecimal sumOtherMaterialCosts;
    @XmlElement(name = "SumMiscellaneousCosts")
    protected FieldDecimal sumMiscellaneousCosts;
    @XmlElement(name = "SumLabourCosts")
    protected FieldDecimal sumLabourCosts;
    @XmlElement(name = "CalculationDeductionsSummary")
    protected DeductionsSummary calculationDeductionsSummary;
    @XmlElement(name = "AdditionalCostsFlatAmount")
    protected FieldDecimal additionalCostsFlatAmount;
    @XmlElement(name = "TotalNetDiscountExpert")
    protected FieldDecimal totalNetDiscountExpert;
    @XmlElement(name = "TotalVATDiscountExpert")
    protected FieldDecimal totalVATDiscountExpert;
    @XmlElement(name = "TotalGrossDiscountExpert")
    protected FieldDecimal totalGrossDiscountExpert;
    @XmlElement(name = "MetaPositions")
    protected MetaPositions metaPositions;

    /**
     * Ruft den Wert der sparePartsCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SparePartsCostsSummary }
     *     
     */
    public SparePartsCostsSummary getSparePartsCosts() {
        return sparePartsCosts;
    }

    /**
     * Legt den Wert der sparePartsCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SparePartsCostsSummary }
     *     
     */
    public void setSparePartsCosts(SparePartsCostsSummary value) {
        this.sparePartsCosts = value;
    }

    /**
     * Ruft den Wert der auxiliaryCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AuxiliaryCostsSummary }
     *     
     */
    public AuxiliaryCostsSummary getAuxiliaryCosts() {
        return auxiliaryCosts;
    }

    /**
     * Legt den Wert der auxiliaryCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AuxiliaryCostsSummary }
     *     
     */
    public void setAuxiliaryCosts(AuxiliaryCostsSummary value) {
        this.auxiliaryCosts = value;
    }

    /**
     * Ruft den Wert der labourCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LabourCostsSummary }
     *     
     */
    public LabourCostsSummary getLabourCosts() {
        return labourCosts;
    }

    /**
     * Legt den Wert der labourCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LabourCostsSummary }
     *     
     */
    public void setLabourCosts(LabourCostsSummary value) {
        this.labourCosts = value;
    }

    /**
     * Ruft den Wert der lacquerCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LacquerCostsSummary }
     *     
     */
    public LacquerCostsSummary getLacquerCosts() {
        return lacquerCosts;
    }

    /**
     * Legt den Wert der lacquerCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LacquerCostsSummary }
     *     
     */
    public void setLacquerCosts(LacquerCostsSummary value) {
        this.lacquerCosts = value;
    }

    /**
     * Ruft den Wert der vatReplacementPart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getVATReplacementPart() {
        return vatReplacementPart;
    }

    /**
     * Legt den Wert der vatReplacementPart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setVATReplacementPart(FieldDecimal value) {
        this.vatReplacementPart = value;
    }

    /**
     * Ruft den Wert der surchargeDiscounts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SurchargeDiscountsSummary }
     *     
     */
    public SurchargeDiscountsSummary getSurchargeDiscounts() {
        return surchargeDiscounts;
    }

    /**
     * Legt den Wert der surchargeDiscounts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SurchargeDiscountsSummary }
     *     
     */
    public void setSurchargeDiscounts(SurchargeDiscountsSummary value) {
        this.surchargeDiscounts = value;
    }

    /**
     * Ruft den Wert der totalNetCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTotalNetCosts() {
        return totalNetCosts;
    }

    /**
     * Legt den Wert der totalNetCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTotalNetCosts(FieldDecimal value) {
        this.totalNetCosts = value;
    }

    /**
     * Ruft den Wert der totalVAT-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTotalVAT() {
        return totalVAT;
    }

    /**
     * Legt den Wert der totalVAT-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTotalVAT(FieldDecimal value) {
        this.totalVAT = value;
    }

    /**
     * Ruft den Wert der totalGrossCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTotalGrossCosts() {
        return totalGrossCosts;
    }

    /**
     * Legt den Wert der totalGrossCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTotalGrossCosts(FieldDecimal value) {
        this.totalGrossCosts = value;
    }

    /**
     * Ruft den Wert der totalNetDiscount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTotalNetDiscount() {
        return totalNetDiscount;
    }

    /**
     * Legt den Wert der totalNetDiscount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTotalNetDiscount(FieldDecimal value) {
        this.totalNetDiscount = value;
    }

    /**
     * Ruft den Wert der totalVATDiscount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTotalVATDiscount() {
        return totalVATDiscount;
    }

    /**
     * Legt den Wert der totalVATDiscount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTotalVATDiscount(FieldDecimal value) {
        this.totalVATDiscount = value;
    }

    /**
     * Ruft den Wert der totalGrossDiscount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTotalGrossDiscount() {
        return totalGrossDiscount;
    }

    /**
     * Legt den Wert der totalGrossDiscount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTotalGrossDiscount(FieldDecimal value) {
        this.totalGrossDiscount = value;
    }

    /**
     * Ruft den Wert der totalNetDeductible-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTotalNetDeductible() {
        return totalNetDeductible;
    }

    /**
     * Legt den Wert der totalNetDeductible-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTotalNetDeductible(FieldDecimal value) {
        this.totalNetDeductible = value;
    }

    /**
     * Ruft den Wert der totalVATDeductible-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTotalVATDeductible() {
        return totalVATDeductible;
    }

    /**
     * Legt den Wert der totalVATDeductible-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTotalVATDeductible(FieldDecimal value) {
        this.totalVATDeductible = value;
    }

    /**
     * Ruft den Wert der totalGrossDeductible-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTotalGrossDeductible() {
        return totalGrossDeductible;
    }

    /**
     * Legt den Wert der totalGrossDeductible-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTotalGrossDeductible(FieldDecimal value) {
        this.totalGrossDeductible = value;
    }

    /**
     * Ruft den Wert der totalNetCorrected-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTotalNetCorrected() {
        return totalNetCorrected;
    }

    /**
     * Legt den Wert der totalNetCorrected-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTotalNetCorrected(FieldDecimal value) {
        this.totalNetCorrected = value;
    }

    /**
     * Ruft den Wert der totalVATCorrected-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTotalVATCorrected() {
        return totalVATCorrected;
    }

    /**
     * Legt den Wert der totalVATCorrected-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTotalVATCorrected(FieldDecimal value) {
        this.totalVATCorrected = value;
    }

    /**
     * Ruft den Wert der totalGrossCorrected-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTotalGrossCorrected() {
        return totalGrossCorrected;
    }

    /**
     * Legt den Wert der totalGrossCorrected-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTotalGrossCorrected(FieldDecimal value) {
        this.totalGrossCorrected = value;
    }

    /**
     * Ruft den Wert der retentionTotalNet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getRetentionTotalNet() {
        return retentionTotalNet;
    }

    /**
     * Legt den Wert der retentionTotalNet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setRetentionTotalNet(FieldDecimal value) {
        this.retentionTotalNet = value;
    }

    /**
     * Ruft den Wert der retentionTotalGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getRetentionTotalGross() {
        return retentionTotalGross;
    }

    /**
     * Legt den Wert der retentionTotalGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setRetentionTotalGross(FieldDecimal value) {
        this.retentionTotalGross = value;
    }

    /**
     * Ruft den Wert der diffCommonToOptimizedAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDiffCommonToOptimizedAmount() {
        return diffCommonToOptimizedAmount;
    }

    /**
     * Legt den Wert der diffCommonToOptimizedAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDiffCommonToOptimizedAmount(FieldDecimal value) {
        this.diffCommonToOptimizedAmount = value;
    }

    /**
     * Ruft den Wert der diffCommonToOptimizedPerc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDiffCommonToOptimizedPerc() {
        return diffCommonToOptimizedPerc;
    }

    /**
     * Legt den Wert der diffCommonToOptimizedPerc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDiffCommonToOptimizedPerc(FieldDecimal value) {
        this.diffCommonToOptimizedPerc = value;
    }

    /**
     * Ruft den Wert der diffToUpe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDiffToUpe() {
        return diffToUpe;
    }

    /**
     * Legt den Wert der diffToUpe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDiffToUpe(FieldDecimal value) {
        this.diffToUpe = value;
    }

    /**
     * Ruft den Wert der upeInProcent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getUpeInProcent() {
        return upeInProcent;
    }

    /**
     * Legt den Wert der upeInProcent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setUpeInProcent(FieldDecimal value) {
        this.upeInProcent = value;
    }

    /**
     * Ruft den Wert der amountCustomer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getAmountCustomer() {
        return amountCustomer;
    }

    /**
     * Legt den Wert der amountCustomer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setAmountCustomer(FieldDecimal value) {
        this.amountCustomer = value;
    }

    /**
     * Ruft den Wert der amountInsurance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getAmountInsurance() {
        return amountInsurance;
    }

    /**
     * Legt den Wert der amountInsurance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setAmountInsurance(FieldDecimal value) {
        this.amountInsurance = value;
    }

    /**
     * Ruft den Wert der sumNet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSumNet() {
        return sumNet;
    }

    /**
     * Legt den Wert der sumNet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSumNet(FieldDecimal value) {
        this.sumNet = value;
    }

    /**
     * Ruft den Wert der sumGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSumGross() {
        return sumGross;
    }

    /**
     * Legt den Wert der sumGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSumGross(FieldDecimal value) {
        this.sumGross = value;
    }

    /**
     * Ruft den Wert der sumSparePartCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSumSparePartCosts() {
        return sumSparePartCosts;
    }

    /**
     * Legt den Wert der sumSparePartCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSumSparePartCosts(FieldDecimal value) {
        this.sumSparePartCosts = value;
    }

    /**
     * Ruft den Wert der sumSmallSparePartCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSumSmallSparePartCosts() {
        return sumSmallSparePartCosts;
    }

    /**
     * Legt den Wert der sumSmallSparePartCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSumSmallSparePartCosts(FieldDecimal value) {
        this.sumSmallSparePartCosts = value;
    }

    /**
     * Ruft den Wert der sumOtherMaterialCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSumOtherMaterialCosts() {
        return sumOtherMaterialCosts;
    }

    /**
     * Legt den Wert der sumOtherMaterialCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSumOtherMaterialCosts(FieldDecimal value) {
        this.sumOtherMaterialCosts = value;
    }

    /**
     * Ruft den Wert der sumMiscellaneousCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSumMiscellaneousCosts() {
        return sumMiscellaneousCosts;
    }

    /**
     * Legt den Wert der sumMiscellaneousCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSumMiscellaneousCosts(FieldDecimal value) {
        this.sumMiscellaneousCosts = value;
    }

    /**
     * Ruft den Wert der sumLabourCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSumLabourCosts() {
        return sumLabourCosts;
    }

    /**
     * Legt den Wert der sumLabourCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSumLabourCosts(FieldDecimal value) {
        this.sumLabourCosts = value;
    }

    /**
     * Ruft den Wert der calculationDeductionsSummary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeductionsSummary }
     *     
     */
    public DeductionsSummary getCalculationDeductionsSummary() {
        return calculationDeductionsSummary;
    }

    /**
     * Legt den Wert der calculationDeductionsSummary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeductionsSummary }
     *     
     */
    public void setCalculationDeductionsSummary(DeductionsSummary value) {
        this.calculationDeductionsSummary = value;
    }

    /**
     * Ruft den Wert der additionalCostsFlatAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getAdditionalCostsFlatAmount() {
        return additionalCostsFlatAmount;
    }

    /**
     * Legt den Wert der additionalCostsFlatAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setAdditionalCostsFlatAmount(FieldDecimal value) {
        this.additionalCostsFlatAmount = value;
    }

    /**
     * Ruft den Wert der totalNetDiscountExpert-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTotalNetDiscountExpert() {
        return totalNetDiscountExpert;
    }

    /**
     * Legt den Wert der totalNetDiscountExpert-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTotalNetDiscountExpert(FieldDecimal value) {
        this.totalNetDiscountExpert = value;
    }

    /**
     * Ruft den Wert der totalVATDiscountExpert-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTotalVATDiscountExpert() {
        return totalVATDiscountExpert;
    }

    /**
     * Legt den Wert der totalVATDiscountExpert-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTotalVATDiscountExpert(FieldDecimal value) {
        this.totalVATDiscountExpert = value;
    }

    /**
     * Ruft den Wert der totalGrossDiscountExpert-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTotalGrossDiscountExpert() {
        return totalGrossDiscountExpert;
    }

    /**
     * Legt den Wert der totalGrossDiscountExpert-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTotalGrossDiscountExpert(FieldDecimal value) {
        this.totalGrossDiscountExpert = value;
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

}
