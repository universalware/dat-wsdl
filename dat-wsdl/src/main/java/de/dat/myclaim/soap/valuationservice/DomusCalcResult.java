
package de.dat.myclaim.soap.valuationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für domusCalcResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="domusCalcResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="calcResult" type="{http://www.dat.de/vxs}calcResult" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}DomusAggregates" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}DomusLacquerExtraCharges" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}DomusExtraCharges" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domusCalcResult", propOrder = {

})
public class DomusCalcResult {

    @XmlElement(namespace = "")
    protected CalcResult calcResult;
    @XmlElement(name = "DomusAggregates")
    protected DomusAggregates domusAggregates;
    @XmlElement(name = "DomusLacquerExtraCharges")
    protected DomusLacquerExtraCharges domusLacquerExtraCharges;
    @XmlElement(name = "DomusExtraCharges")
    protected DomusExtraCharges domusExtraCharges;

    /**
     * Ruft den Wert der calcResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalcResult }
     *     
     */
    public CalcResult getCalcResult() {
        return calcResult;
    }

    /**
     * Legt den Wert der calcResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcResult }
     *     
     */
    public void setCalcResult(CalcResult value) {
        this.calcResult = value;
    }

    /**
     * Ruft den Wert der domusAggregates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DomusAggregates }
     *     
     */
    public DomusAggregates getDomusAggregates() {
        return domusAggregates;
    }

    /**
     * Legt den Wert der domusAggregates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DomusAggregates }
     *     
     */
    public void setDomusAggregates(DomusAggregates value) {
        this.domusAggregates = value;
    }

    /**
     * Ruft den Wert der domusLacquerExtraCharges-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DomusLacquerExtraCharges }
     *     
     */
    public DomusLacquerExtraCharges getDomusLacquerExtraCharges() {
        return domusLacquerExtraCharges;
    }

    /**
     * Legt den Wert der domusLacquerExtraCharges-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DomusLacquerExtraCharges }
     *     
     */
    public void setDomusLacquerExtraCharges(DomusLacquerExtraCharges value) {
        this.domusLacquerExtraCharges = value;
    }

    /**
     * Ruft den Wert der domusExtraCharges-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DomusExtraCharges }
     *     
     */
    public DomusExtraCharges getDomusExtraCharges() {
        return domusExtraCharges;
    }

    /**
     * Legt den Wert der domusExtraCharges-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DomusExtraCharges }
     *     
     */
    public void setDomusExtraCharges(DomusExtraCharges value) {
        this.domusExtraCharges = value;
    }

}
