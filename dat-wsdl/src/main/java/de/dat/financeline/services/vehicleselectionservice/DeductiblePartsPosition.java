
package de.dat.financeline.services.vehicleselectionservice;

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
 *         &lt;element name="DATProcessId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="PartNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="RepairType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Description" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DeductionType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ValueTotal" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="CorrPerc" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ValueTotalCorrected" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "DeductiblePartsPosition")
public class DeductiblePartsPosition {

    @XmlElement(name = "DATProcessId")
    protected FieldInteger datProcessId;
    @XmlElement(name = "PartNumber")
    protected FieldString partNumber;
    @XmlElement(name = "RepairType")
    protected FieldString repairType;
    @XmlElement(name = "Description")
    protected FieldString description;
    @XmlElement(name = "DeductionType")
    protected FieldString deductionType;
    @XmlElement(name = "ValueTotal")
    protected FieldDecimal valueTotal;
    @XmlElement(name = "CorrPerc")
    protected FieldDecimal corrPerc;
    @XmlElement(name = "ValueTotalCorrected")
    protected FieldDecimal valueTotalCorrected;

    /**
     * Ruft den Wert der datProcessId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDATProcessId() {
        return datProcessId;
    }

    /**
     * Legt den Wert der datProcessId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDATProcessId(FieldInteger value) {
        this.datProcessId = value;
    }

    /**
     * Ruft den Wert der partNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPartNumber() {
        return partNumber;
    }

    /**
     * Legt den Wert der partNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPartNumber(FieldString value) {
        this.partNumber = value;
    }

    /**
     * Ruft den Wert der repairType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getRepairType() {
        return repairType;
    }

    /**
     * Legt den Wert der repairType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setRepairType(FieldString value) {
        this.repairType = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDescription(FieldString value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der deductionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDeductionType() {
        return deductionType;
    }

    /**
     * Legt den Wert der deductionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDeductionType(FieldString value) {
        this.deductionType = value;
    }

    /**
     * Ruft den Wert der valueTotal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getValueTotal() {
        return valueTotal;
    }

    /**
     * Legt den Wert der valueTotal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setValueTotal(FieldDecimal value) {
        this.valueTotal = value;
    }

    /**
     * Ruft den Wert der corrPerc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getCorrPerc() {
        return corrPerc;
    }

    /**
     * Legt den Wert der corrPerc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setCorrPerc(FieldDecimal value) {
        this.corrPerc = value;
    }

    /**
     * Ruft den Wert der valueTotalCorrected-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getValueTotalCorrected() {
        return valueTotalCorrected;
    }

    /**
     * Legt den Wert der valueTotalCorrected-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setValueTotalCorrected(FieldDecimal value) {
        this.valueTotalCorrected = value;
    }

}
