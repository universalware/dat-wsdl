
package de.dat.myclaim.soap.valuationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CalculationProtocol complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CalculationProtocol">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="AllinDeductionFromTotalInPercent" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="CalculationStatus" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="PrintDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="IndicatorAniaCalculation" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="IndicatorDoubleRequest" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="IndicatorLacquerWaterbased" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LastCalcUserId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="LastCalculationDate" type="{http://www.dat.de/vxs}fieldDateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="LastCalculationUser" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="StatusRepairCostsTakeover" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="TransmissionState" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ProtocolData" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculationProtocol", propOrder = {

})
public class CalculationProtocol {

    @XmlElement(name = "AllinDeductionFromTotalInPercent")
    protected FieldDecimal allinDeductionFromTotalInPercent;
    @XmlElement(name = "CalculationStatus")
    protected FieldInteger calculationStatus;
    @XmlElement(name = "PrintDate")
    protected FieldDate printDate;
    @XmlElement(name = "IndicatorAniaCalculation")
    protected FieldDecimal indicatorAniaCalculation;
    @XmlElement(name = "IndicatorDoubleRequest")
    protected FieldDecimal indicatorDoubleRequest;
    @XmlElement(name = "IndicatorLacquerWaterbased")
    protected FieldDecimal indicatorLacquerWaterbased;
    @XmlElement(name = "LastCalcUserId")
    protected FieldInteger lastCalcUserId;
    @XmlElement(name = "LastCalculationDate")
    protected FieldDateTime lastCalculationDate;
    @XmlElement(name = "LastCalculationUser")
    protected FieldString lastCalculationUser;
    @XmlElement(name = "StatusRepairCostsTakeover")
    protected FieldInteger statusRepairCostsTakeover;
    @XmlElement(name = "TransmissionState")
    protected FieldDecimal transmissionState;
    @XmlElement(name = "ProtocolData")
    protected FieldString protocolData;

    /**
     * Ruft den Wert der allinDeductionFromTotalInPercent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getAllinDeductionFromTotalInPercent() {
        return allinDeductionFromTotalInPercent;
    }

    /**
     * Legt den Wert der allinDeductionFromTotalInPercent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setAllinDeductionFromTotalInPercent(FieldDecimal value) {
        this.allinDeductionFromTotalInPercent = value;
    }

    /**
     * Ruft den Wert der calculationStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getCalculationStatus() {
        return calculationStatus;
    }

    /**
     * Legt den Wert der calculationStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setCalculationStatus(FieldInteger value) {
        this.calculationStatus = value;
    }

    /**
     * Ruft den Wert der printDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getPrintDate() {
        return printDate;
    }

    /**
     * Legt den Wert der printDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setPrintDate(FieldDate value) {
        this.printDate = value;
    }

    /**
     * Ruft den Wert der indicatorAniaCalculation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getIndicatorAniaCalculation() {
        return indicatorAniaCalculation;
    }

    /**
     * Legt den Wert der indicatorAniaCalculation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setIndicatorAniaCalculation(FieldDecimal value) {
        this.indicatorAniaCalculation = value;
    }

    /**
     * Ruft den Wert der indicatorDoubleRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getIndicatorDoubleRequest() {
        return indicatorDoubleRequest;
    }

    /**
     * Legt den Wert der indicatorDoubleRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setIndicatorDoubleRequest(FieldDecimal value) {
        this.indicatorDoubleRequest = value;
    }

    /**
     * Ruft den Wert der indicatorLacquerWaterbased-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getIndicatorLacquerWaterbased() {
        return indicatorLacquerWaterbased;
    }

    /**
     * Legt den Wert der indicatorLacquerWaterbased-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setIndicatorLacquerWaterbased(FieldDecimal value) {
        this.indicatorLacquerWaterbased = value;
    }

    /**
     * Ruft den Wert der lastCalcUserId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLastCalcUserId() {
        return lastCalcUserId;
    }

    /**
     * Legt den Wert der lastCalcUserId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLastCalcUserId(FieldInteger value) {
        this.lastCalcUserId = value;
    }

    /**
     * Ruft den Wert der lastCalculationDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getLastCalculationDate() {
        return lastCalculationDate;
    }

    /**
     * Legt den Wert der lastCalculationDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setLastCalculationDate(FieldDateTime value) {
        this.lastCalculationDate = value;
    }

    /**
     * Ruft den Wert der lastCalculationUser-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLastCalculationUser() {
        return lastCalculationUser;
    }

    /**
     * Legt den Wert der lastCalculationUser-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLastCalculationUser(FieldString value) {
        this.lastCalculationUser = value;
    }

    /**
     * Ruft den Wert der statusRepairCostsTakeover-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getStatusRepairCostsTakeover() {
        return statusRepairCostsTakeover;
    }

    /**
     * Legt den Wert der statusRepairCostsTakeover-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setStatusRepairCostsTakeover(FieldInteger value) {
        this.statusRepairCostsTakeover = value;
    }

    /**
     * Ruft den Wert der transmissionState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTransmissionState() {
        return transmissionState;
    }

    /**
     * Legt den Wert der transmissionState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTransmissionState(FieldDecimal value) {
        this.transmissionState = value;
    }

    /**
     * Ruft den Wert der protocolData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getProtocolData() {
        return protocolData;
    }

    /**
     * Legt den Wert der protocolData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setProtocolData(FieldString value) {
        this.protocolData = value;
    }

}
