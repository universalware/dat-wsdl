
package de.dat.glassrep.services.vehicleidentificationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für calcResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="calcResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="MaterialPositions" type="{http://www.dat.de/vxs}MaterialPositions" minOccurs="0" form="qualified"/>
 *         &lt;element name="MaterialPositionsMaintenance" type="{http://www.dat.de/vxs}MaterialPositions" minOccurs="0" form="qualified"/>
 *         &lt;element name="AdditionalCostsPositions" type="{http://www.dat.de/vxs}AdditionalCostsPositions" minOccurs="0" form="qualified"/>
 *         &lt;element name="AdditionalCostsPositionsMaintenance" type="{http://www.dat.de/vxs}AdditionalCostsPositions" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}RiskPositions" minOccurs="0"/>
 *         &lt;element name="LabourPositions" type="{http://www.dat.de/vxs}LabourPositions" minOccurs="0" form="qualified"/>
 *         &lt;element name="LabourPositionsMaintenance" type="{http://www.dat.de/vxs}LabourPositions" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}LacquerPositions" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}DiscountPositions" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}DeductionsPositions" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}DeductiblePartsPositions" minOccurs="0"/>
 *         &lt;element name="PriceDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="RepairCalculationSummary" type="{http://www.dat.de/vxs}CalculationSummary" minOccurs="0" form="qualified"/>
 *         &lt;element name="MaterialProtocol" type="{http://www.dat.de/vxs}repairProtocol" minOccurs="0" form="qualified"/>
 *         &lt;element name="LabourProtocol" type="{http://www.dat.de/vxs}repairProtocol" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerProtocol" type="{http://www.dat.de/vxs}repairProtocol" minOccurs="0" form="qualified"/>
 *         &lt;element name="SurchargesDiscounts" type="{http://www.dat.de/vxs}SurchargeDiscountPositions" minOccurs="0" form="qualified"/>
 *         &lt;element name="CalcProtocol" type="{http://www.dat.de/vxs}CalculationProtocol" minOccurs="0" form="qualified"/>
 *         &lt;element name="Legends" type="{http://www.dat.de/vxs}Legends" minOccurs="0" form="qualified"/>
 *         &lt;element name="CalcType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}BlanketCalculation" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calcResult", propOrder = {

})
public class CalcResult {

    @XmlElement(name = "MaterialPositions")
    protected MaterialPositions materialPositions;
    @XmlElement(name = "MaterialPositionsMaintenance")
    protected MaterialPositions materialPositionsMaintenance;
    @XmlElement(name = "AdditionalCostsPositions")
    protected AdditionalCostsPositions additionalCostsPositions;
    @XmlElement(name = "AdditionalCostsPositionsMaintenance")
    protected AdditionalCostsPositions additionalCostsPositionsMaintenance;
    @XmlElement(name = "RiskPositions")
    protected RiskPositions riskPositions;
    @XmlElement(name = "LabourPositions")
    protected LabourPositions labourPositions;
    @XmlElement(name = "LabourPositionsMaintenance")
    protected LabourPositions labourPositionsMaintenance;
    @XmlElement(name = "LacquerPositions")
    protected LacquerPositions lacquerPositions;
    @XmlElement(name = "DiscountPositions")
    protected DiscountPositions discountPositions;
    @XmlElement(name = "DeductionsPositions")
    protected DeductionsPositions deductionsPositions;
    @XmlElement(name = "DeductiblePartsPositions")
    protected DeductiblePartsPositions deductiblePartsPositions;
    @XmlElement(name = "PriceDate")
    protected FieldDate priceDate;
    @XmlElement(name = "RepairCalculationSummary")
    protected CalculationSummary repairCalculationSummary;
    @XmlElement(name = "MaterialProtocol")
    protected RepairProtocol materialProtocol;
    @XmlElement(name = "LabourProtocol")
    protected RepairProtocol labourProtocol;
    @XmlElement(name = "LacquerProtocol")
    protected RepairProtocol lacquerProtocol;
    @XmlElement(name = "SurchargesDiscounts")
    protected SurchargeDiscountPositions surchargesDiscounts;
    @XmlElement(name = "CalcProtocol")
    protected CalculationProtocol calcProtocol;
    @XmlElement(name = "Legends")
    protected Legends legends;
    @XmlElement(name = "CalcType")
    protected FieldString calcType;
    @XmlElement(name = "BlanketCalculation")
    protected BlanketCalculation blanketCalculation;

    /**
     * Ruft den Wert der materialPositions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MaterialPositions }
     *     
     */
    public MaterialPositions getMaterialPositions() {
        return materialPositions;
    }

    /**
     * Legt den Wert der materialPositions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialPositions }
     *     
     */
    public void setMaterialPositions(MaterialPositions value) {
        this.materialPositions = value;
    }

    /**
     * Ruft den Wert der materialPositionsMaintenance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MaterialPositions }
     *     
     */
    public MaterialPositions getMaterialPositionsMaintenance() {
        return materialPositionsMaintenance;
    }

    /**
     * Legt den Wert der materialPositionsMaintenance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialPositions }
     *     
     */
    public void setMaterialPositionsMaintenance(MaterialPositions value) {
        this.materialPositionsMaintenance = value;
    }

    /**
     * Ruft den Wert der additionalCostsPositions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalCostsPositions }
     *     
     */
    public AdditionalCostsPositions getAdditionalCostsPositions() {
        return additionalCostsPositions;
    }

    /**
     * Legt den Wert der additionalCostsPositions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalCostsPositions }
     *     
     */
    public void setAdditionalCostsPositions(AdditionalCostsPositions value) {
        this.additionalCostsPositions = value;
    }

    /**
     * Ruft den Wert der additionalCostsPositionsMaintenance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalCostsPositions }
     *     
     */
    public AdditionalCostsPositions getAdditionalCostsPositionsMaintenance() {
        return additionalCostsPositionsMaintenance;
    }

    /**
     * Legt den Wert der additionalCostsPositionsMaintenance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalCostsPositions }
     *     
     */
    public void setAdditionalCostsPositionsMaintenance(AdditionalCostsPositions value) {
        this.additionalCostsPositionsMaintenance = value;
    }

    /**
     * Ruft den Wert der riskPositions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RiskPositions }
     *     
     */
    public RiskPositions getRiskPositions() {
        return riskPositions;
    }

    /**
     * Legt den Wert der riskPositions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskPositions }
     *     
     */
    public void setRiskPositions(RiskPositions value) {
        this.riskPositions = value;
    }

    /**
     * Ruft den Wert der labourPositions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LabourPositions }
     *     
     */
    public LabourPositions getLabourPositions() {
        return labourPositions;
    }

    /**
     * Legt den Wert der labourPositions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LabourPositions }
     *     
     */
    public void setLabourPositions(LabourPositions value) {
        this.labourPositions = value;
    }

    /**
     * Ruft den Wert der labourPositionsMaintenance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LabourPositions }
     *     
     */
    public LabourPositions getLabourPositionsMaintenance() {
        return labourPositionsMaintenance;
    }

    /**
     * Legt den Wert der labourPositionsMaintenance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LabourPositions }
     *     
     */
    public void setLabourPositionsMaintenance(LabourPositions value) {
        this.labourPositionsMaintenance = value;
    }

    /**
     * Ruft den Wert der lacquerPositions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LacquerPositions }
     *     
     */
    public LacquerPositions getLacquerPositions() {
        return lacquerPositions;
    }

    /**
     * Legt den Wert der lacquerPositions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LacquerPositions }
     *     
     */
    public void setLacquerPositions(LacquerPositions value) {
        this.lacquerPositions = value;
    }

    /**
     * Ruft den Wert der discountPositions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DiscountPositions }
     *     
     */
    public DiscountPositions getDiscountPositions() {
        return discountPositions;
    }

    /**
     * Legt den Wert der discountPositions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountPositions }
     *     
     */
    public void setDiscountPositions(DiscountPositions value) {
        this.discountPositions = value;
    }

    /**
     * Ruft den Wert der deductionsPositions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeductionsPositions }
     *     
     */
    public DeductionsPositions getDeductionsPositions() {
        return deductionsPositions;
    }

    /**
     * Legt den Wert der deductionsPositions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeductionsPositions }
     *     
     */
    public void setDeductionsPositions(DeductionsPositions value) {
        this.deductionsPositions = value;
    }

    /**
     * Ruft den Wert der deductiblePartsPositions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeductiblePartsPositions }
     *     
     */
    public DeductiblePartsPositions getDeductiblePartsPositions() {
        return deductiblePartsPositions;
    }

    /**
     * Legt den Wert der deductiblePartsPositions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeductiblePartsPositions }
     *     
     */
    public void setDeductiblePartsPositions(DeductiblePartsPositions value) {
        this.deductiblePartsPositions = value;
    }

    /**
     * Ruft den Wert der priceDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getPriceDate() {
        return priceDate;
    }

    /**
     * Legt den Wert der priceDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setPriceDate(FieldDate value) {
        this.priceDate = value;
    }

    /**
     * Ruft den Wert der repairCalculationSummary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalculationSummary }
     *     
     */
    public CalculationSummary getRepairCalculationSummary() {
        return repairCalculationSummary;
    }

    /**
     * Legt den Wert der repairCalculationSummary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationSummary }
     *     
     */
    public void setRepairCalculationSummary(CalculationSummary value) {
        this.repairCalculationSummary = value;
    }

    /**
     * Ruft den Wert der materialProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RepairProtocol }
     *     
     */
    public RepairProtocol getMaterialProtocol() {
        return materialProtocol;
    }

    /**
     * Legt den Wert der materialProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairProtocol }
     *     
     */
    public void setMaterialProtocol(RepairProtocol value) {
        this.materialProtocol = value;
    }

    /**
     * Ruft den Wert der labourProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RepairProtocol }
     *     
     */
    public RepairProtocol getLabourProtocol() {
        return labourProtocol;
    }

    /**
     * Legt den Wert der labourProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairProtocol }
     *     
     */
    public void setLabourProtocol(RepairProtocol value) {
        this.labourProtocol = value;
    }

    /**
     * Ruft den Wert der lacquerProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RepairProtocol }
     *     
     */
    public RepairProtocol getLacquerProtocol() {
        return lacquerProtocol;
    }

    /**
     * Legt den Wert der lacquerProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairProtocol }
     *     
     */
    public void setLacquerProtocol(RepairProtocol value) {
        this.lacquerProtocol = value;
    }

    /**
     * Ruft den Wert der surchargesDiscounts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SurchargeDiscountPositions }
     *     
     */
    public SurchargeDiscountPositions getSurchargesDiscounts() {
        return surchargesDiscounts;
    }

    /**
     * Legt den Wert der surchargesDiscounts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SurchargeDiscountPositions }
     *     
     */
    public void setSurchargesDiscounts(SurchargeDiscountPositions value) {
        this.surchargesDiscounts = value;
    }

    /**
     * Ruft den Wert der calcProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalculationProtocol }
     *     
     */
    public CalculationProtocol getCalcProtocol() {
        return calcProtocol;
    }

    /**
     * Legt den Wert der calcProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationProtocol }
     *     
     */
    public void setCalcProtocol(CalculationProtocol value) {
        this.calcProtocol = value;
    }

    /**
     * Ruft den Wert der legends-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Legends }
     *     
     */
    public Legends getLegends() {
        return legends;
    }

    /**
     * Legt den Wert der legends-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Legends }
     *     
     */
    public void setLegends(Legends value) {
        this.legends = value;
    }

    /**
     * Ruft den Wert der calcType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCalcType() {
        return calcType;
    }

    /**
     * Legt den Wert der calcType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCalcType(FieldString value) {
        this.calcType = value;
    }

    /**
     * Ruft den Wert der blanketCalculation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BlanketCalculation }
     *     
     */
    public BlanketCalculation getBlanketCalculation() {
        return blanketCalculation;
    }

    /**
     * Legt den Wert der blanketCalculation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BlanketCalculation }
     *     
     */
    public void setBlanketCalculation(BlanketCalculation value) {
        this.blanketCalculation = value;
    }

}
