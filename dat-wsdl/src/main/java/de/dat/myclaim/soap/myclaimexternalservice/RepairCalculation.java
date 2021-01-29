
package de.dat.myclaim.soap.myclaimexternalservice;

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
 *         &lt;element name="Comment" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ExternalId" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}Vehicle" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}RepairWages" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}RepairParameters" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}ProcedureRelatedParameters" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}RepairPositions" minOccurs="0"/>
 *         &lt;element name="CalcResultToUse" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="CalcEngine" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="CalcSource" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="CalcResultCommon" type="{http://www.dat.de/vxs}calcResult" minOccurs="0" form="qualified"/>
 *         &lt;element name="CalcResultGlass" type="{http://www.dat.de/vxs}calcResult" minOccurs="0" form="qualified"/>
 *         &lt;element name="CalcResultOptimized" type="{http://www.dat.de/vxs}calcResult" minOccurs="0" form="qualified"/>
 *         &lt;element name="CalcResultItaly" type="{http://www.dat.de/vxs}calcResultItaly" minOccurs="0" form="qualified"/>
 *         &lt;element name="CalcResultItalyOptimized" type="{http://www.dat.de/vxs}calcResultItaly" minOccurs="0" form="qualified"/>
 *         &lt;element name="CalcResultItalyGlass" type="{http://www.dat.de/vxs}calcResultItaly" minOccurs="0" form="qualified"/>
 *         &lt;element name="CalcResultDomus" type="{http://www.dat.de/vxs}domusCalcResult" minOccurs="0" form="qualified"/>
 *         &lt;element name="CalcResultDomusOptimized" type="{http://www.dat.de/vxs}domusCalcResult" minOccurs="0" form="qualified"/>
 *         &lt;element name="CalcResultDomusGlass" type="{http://www.dat.de/vxs}domusCalcResult" minOccurs="0" form="qualified"/>
 *         &lt;element name="CalcResultCustomerRanking" type="{http://www.dat.de/vxs}calcResult" minOccurs="0" form="qualified"/>
 *         &lt;element name="CalcResultMaintenance" type="{http://www.dat.de/vxs}calcResult" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}CalcResultsHistory" minOccurs="0"/>
 *         &lt;element name="CalcResultSPO" type="{http://www.dat.de/vxs}calcResult" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}DiscountPositions" minOccurs="0"/>
 *         &lt;element name="CalculationSummary" type="{http://www.dat.de/vxs}CalculationSummary" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}SurchargeSettings" minOccurs="0"/>
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
@XmlRootElement(name = "RepairCalculation")
public class RepairCalculation {

    @XmlElement(name = "Comment")
    protected FieldString comment;
    @XmlElement(name = "ExternalId")
    protected FieldString externalId;
    @XmlElement(name = "Vehicle")
    protected Vehicle vehicle;
    @XmlElement(name = "RepairWages")
    protected RepairWages repairWages;
    @XmlElement(name = "RepairParameters")
    protected RepairParameters repairParameters;
    @XmlElement(name = "ProcedureRelatedParameters")
    protected ProcedureRelatedParameters procedureRelatedParameters;
    @XmlElement(name = "RepairPositions")
    protected RepairPositions repairPositions;
    @XmlElement(name = "CalcResultToUse")
    protected FieldString calcResultToUse;
    @XmlElement(name = "CalcEngine")
    protected FieldString calcEngine;
    @XmlElement(name = "CalcSource")
    protected FieldString calcSource;
    @XmlElement(name = "CalcResultCommon")
    protected CalcResult calcResultCommon;
    @XmlElement(name = "CalcResultGlass")
    protected CalcResult calcResultGlass;
    @XmlElement(name = "CalcResultOptimized")
    protected CalcResult calcResultOptimized;
    @XmlElement(name = "CalcResultItaly")
    protected CalcResultItaly calcResultItaly;
    @XmlElement(name = "CalcResultItalyOptimized")
    protected CalcResultItaly calcResultItalyOptimized;
    @XmlElement(name = "CalcResultItalyGlass")
    protected CalcResultItaly calcResultItalyGlass;
    @XmlElement(name = "CalcResultDomus")
    protected DomusCalcResult calcResultDomus;
    @XmlElement(name = "CalcResultDomusOptimized")
    protected DomusCalcResult calcResultDomusOptimized;
    @XmlElement(name = "CalcResultDomusGlass")
    protected DomusCalcResult calcResultDomusGlass;
    @XmlElement(name = "CalcResultCustomerRanking")
    protected CalcResult calcResultCustomerRanking;
    @XmlElement(name = "CalcResultMaintenance")
    protected CalcResult calcResultMaintenance;
    @XmlElement(name = "CalcResultsHistory")
    protected CalcResultsHistory calcResultsHistory;
    @XmlElement(name = "CalcResultSPO")
    protected CalcResult calcResultSPO;
    @XmlElement(name = "DiscountPositions")
    protected DiscountPositions discountPositions;
    @XmlElement(name = "CalculationSummary")
    protected CalculationSummary calculationSummary;
    @XmlElement(name = "SurchargeSettings")
    protected SurchargeSettings surchargeSettings;

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
     * Ruft den Wert der externalId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getExternalId() {
        return externalId;
    }

    /**
     * Legt den Wert der externalId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setExternalId(FieldString value) {
        this.externalId = value;
    }

    /**
     * Ruft den Wert der vehicle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle }
     *     
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Legt den Wert der vehicle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle }
     *     
     */
    public void setVehicle(Vehicle value) {
        this.vehicle = value;
    }

    /**
     * Ruft den Wert der repairWages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RepairWages }
     *     
     */
    public RepairWages getRepairWages() {
        return repairWages;
    }

    /**
     * Legt den Wert der repairWages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairWages }
     *     
     */
    public void setRepairWages(RepairWages value) {
        this.repairWages = value;
    }

    /**
     * Ruft den Wert der repairParameters-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RepairParameters }
     *     
     */
    public RepairParameters getRepairParameters() {
        return repairParameters;
    }

    /**
     * Legt den Wert der repairParameters-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairParameters }
     *     
     */
    public void setRepairParameters(RepairParameters value) {
        this.repairParameters = value;
    }

    /**
     * Ruft den Wert der procedureRelatedParameters-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProcedureRelatedParameters }
     *     
     */
    public ProcedureRelatedParameters getProcedureRelatedParameters() {
        return procedureRelatedParameters;
    }

    /**
     * Legt den Wert der procedureRelatedParameters-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedureRelatedParameters }
     *     
     */
    public void setProcedureRelatedParameters(ProcedureRelatedParameters value) {
        this.procedureRelatedParameters = value;
    }

    /**
     * Ruft den Wert der repairPositions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RepairPositions }
     *     
     */
    public RepairPositions getRepairPositions() {
        return repairPositions;
    }

    /**
     * Legt den Wert der repairPositions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairPositions }
     *     
     */
    public void setRepairPositions(RepairPositions value) {
        this.repairPositions = value;
    }

    /**
     * Ruft den Wert der calcResultToUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCalcResultToUse() {
        return calcResultToUse;
    }

    /**
     * Legt den Wert der calcResultToUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCalcResultToUse(FieldString value) {
        this.calcResultToUse = value;
    }

    /**
     * Ruft den Wert der calcEngine-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCalcEngine() {
        return calcEngine;
    }

    /**
     * Legt den Wert der calcEngine-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCalcEngine(FieldString value) {
        this.calcEngine = value;
    }

    /**
     * Ruft den Wert der calcSource-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCalcSource() {
        return calcSource;
    }

    /**
     * Legt den Wert der calcSource-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCalcSource(FieldString value) {
        this.calcSource = value;
    }

    /**
     * Ruft den Wert der calcResultCommon-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalcResult }
     *     
     */
    public CalcResult getCalcResultCommon() {
        return calcResultCommon;
    }

    /**
     * Legt den Wert der calcResultCommon-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcResult }
     *     
     */
    public void setCalcResultCommon(CalcResult value) {
        this.calcResultCommon = value;
    }

    /**
     * Ruft den Wert der calcResultGlass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalcResult }
     *     
     */
    public CalcResult getCalcResultGlass() {
        return calcResultGlass;
    }

    /**
     * Legt den Wert der calcResultGlass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcResult }
     *     
     */
    public void setCalcResultGlass(CalcResult value) {
        this.calcResultGlass = value;
    }

    /**
     * Ruft den Wert der calcResultOptimized-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalcResult }
     *     
     */
    public CalcResult getCalcResultOptimized() {
        return calcResultOptimized;
    }

    /**
     * Legt den Wert der calcResultOptimized-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcResult }
     *     
     */
    public void setCalcResultOptimized(CalcResult value) {
        this.calcResultOptimized = value;
    }

    /**
     * Ruft den Wert der calcResultItaly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalcResultItaly }
     *     
     */
    public CalcResultItaly getCalcResultItaly() {
        return calcResultItaly;
    }

    /**
     * Legt den Wert der calcResultItaly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcResultItaly }
     *     
     */
    public void setCalcResultItaly(CalcResultItaly value) {
        this.calcResultItaly = value;
    }

    /**
     * Ruft den Wert der calcResultItalyOptimized-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalcResultItaly }
     *     
     */
    public CalcResultItaly getCalcResultItalyOptimized() {
        return calcResultItalyOptimized;
    }

    /**
     * Legt den Wert der calcResultItalyOptimized-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcResultItaly }
     *     
     */
    public void setCalcResultItalyOptimized(CalcResultItaly value) {
        this.calcResultItalyOptimized = value;
    }

    /**
     * Ruft den Wert der calcResultItalyGlass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalcResultItaly }
     *     
     */
    public CalcResultItaly getCalcResultItalyGlass() {
        return calcResultItalyGlass;
    }

    /**
     * Legt den Wert der calcResultItalyGlass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcResultItaly }
     *     
     */
    public void setCalcResultItalyGlass(CalcResultItaly value) {
        this.calcResultItalyGlass = value;
    }

    /**
     * Ruft den Wert der calcResultDomus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DomusCalcResult }
     *     
     */
    public DomusCalcResult getCalcResultDomus() {
        return calcResultDomus;
    }

    /**
     * Legt den Wert der calcResultDomus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DomusCalcResult }
     *     
     */
    public void setCalcResultDomus(DomusCalcResult value) {
        this.calcResultDomus = value;
    }

    /**
     * Ruft den Wert der calcResultDomusOptimized-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DomusCalcResult }
     *     
     */
    public DomusCalcResult getCalcResultDomusOptimized() {
        return calcResultDomusOptimized;
    }

    /**
     * Legt den Wert der calcResultDomusOptimized-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DomusCalcResult }
     *     
     */
    public void setCalcResultDomusOptimized(DomusCalcResult value) {
        this.calcResultDomusOptimized = value;
    }

    /**
     * Ruft den Wert der calcResultDomusGlass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DomusCalcResult }
     *     
     */
    public DomusCalcResult getCalcResultDomusGlass() {
        return calcResultDomusGlass;
    }

    /**
     * Legt den Wert der calcResultDomusGlass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DomusCalcResult }
     *     
     */
    public void setCalcResultDomusGlass(DomusCalcResult value) {
        this.calcResultDomusGlass = value;
    }

    /**
     * Ruft den Wert der calcResultCustomerRanking-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalcResult }
     *     
     */
    public CalcResult getCalcResultCustomerRanking() {
        return calcResultCustomerRanking;
    }

    /**
     * Legt den Wert der calcResultCustomerRanking-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcResult }
     *     
     */
    public void setCalcResultCustomerRanking(CalcResult value) {
        this.calcResultCustomerRanking = value;
    }

    /**
     * Ruft den Wert der calcResultMaintenance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalcResult }
     *     
     */
    public CalcResult getCalcResultMaintenance() {
        return calcResultMaintenance;
    }

    /**
     * Legt den Wert der calcResultMaintenance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcResult }
     *     
     */
    public void setCalcResultMaintenance(CalcResult value) {
        this.calcResultMaintenance = value;
    }

    /**
     * Ruft den Wert der calcResultsHistory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalcResultsHistory }
     *     
     */
    public CalcResultsHistory getCalcResultsHistory() {
        return calcResultsHistory;
    }

    /**
     * Legt den Wert der calcResultsHistory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcResultsHistory }
     *     
     */
    public void setCalcResultsHistory(CalcResultsHistory value) {
        this.calcResultsHistory = value;
    }

    /**
     * Ruft den Wert der calcResultSPO-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalcResult }
     *     
     */
    public CalcResult getCalcResultSPO() {
        return calcResultSPO;
    }

    /**
     * Legt den Wert der calcResultSPO-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcResult }
     *     
     */
    public void setCalcResultSPO(CalcResult value) {
        this.calcResultSPO = value;
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
     * Ruft den Wert der calculationSummary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalculationSummary }
     *     
     */
    public CalculationSummary getCalculationSummary() {
        return calculationSummary;
    }

    /**
     * Legt den Wert der calculationSummary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationSummary }
     *     
     */
    public void setCalculationSummary(CalculationSummary value) {
        this.calculationSummary = value;
    }

    /**
     * Ruft den Wert der surchargeSettings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SurchargeSettings }
     *     
     */
    public SurchargeSettings getSurchargeSettings() {
        return surchargeSettings;
    }

    /**
     * Legt den Wert der surchargeSettings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SurchargeSettings }
     *     
     */
    public void setSurchargeSettings(SurchargeSettings value) {
        this.surchargeSettings = value;
    }

}
