
package de.dat.datecodeselection.services.vehicleselectionservice;

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
 *         &lt;element name="Description" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ValueTotal" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManualPosition" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManualAmount" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManualPrice" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="RequiredByProcessId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="IsSpecific" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}IncludedPositions" minOccurs="0"/>
 *         &lt;element name="Extended" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="IncludedInCalculation" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="Length" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Width" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "RiskPosition")
public class RiskPosition {

    @XmlElement(name = "DATProcessId")
    protected FieldInteger datProcessId;
    @XmlElement(name = "Description")
    protected FieldString description;
    @XmlElement(name = "ValueTotal")
    protected FieldDecimal valueTotal;
    @XmlElement(name = "ManualPosition")
    protected FieldBoolean manualPosition;
    @XmlElement(name = "ManualAmount")
    protected FieldBoolean manualAmount;
    @XmlElement(name = "ManualPrice")
    protected FieldBoolean manualPrice;
    @XmlElement(name = "RequiredByProcessId")
    protected FieldInteger requiredByProcessId;
    @XmlElement(name = "IsSpecific")
    protected FieldBoolean isSpecific;
    @XmlElement(name = "IncludedPositions")
    protected IncludedPositions includedPositions;
    @XmlElement(name = "Extended")
    protected FieldBoolean extended;
    @XmlElement(name = "IncludedInCalculation")
    protected FieldBoolean includedInCalculation;
    @XmlElement(name = "Length")
    protected FieldDecimal length;
    @XmlElement(name = "Width")
    protected FieldDecimal width;

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
     * Ruft den Wert der manualPosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getManualPosition() {
        return manualPosition;
    }

    /**
     * Legt den Wert der manualPosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setManualPosition(FieldBoolean value) {
        this.manualPosition = value;
    }

    /**
     * Ruft den Wert der manualAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getManualAmount() {
        return manualAmount;
    }

    /**
     * Legt den Wert der manualAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setManualAmount(FieldBoolean value) {
        this.manualAmount = value;
    }

    /**
     * Ruft den Wert der manualPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getManualPrice() {
        return manualPrice;
    }

    /**
     * Legt den Wert der manualPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setManualPrice(FieldBoolean value) {
        this.manualPrice = value;
    }

    /**
     * Ruft den Wert der requiredByProcessId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getRequiredByProcessId() {
        return requiredByProcessId;
    }

    /**
     * Legt den Wert der requiredByProcessId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setRequiredByProcessId(FieldInteger value) {
        this.requiredByProcessId = value;
    }

    /**
     * Ruft den Wert der isSpecific-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getIsSpecific() {
        return isSpecific;
    }

    /**
     * Legt den Wert der isSpecific-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setIsSpecific(FieldBoolean value) {
        this.isSpecific = value;
    }

    /**
     * Ruft den Wert der includedPositions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IncludedPositions }
     *     
     */
    public IncludedPositions getIncludedPositions() {
        return includedPositions;
    }

    /**
     * Legt den Wert der includedPositions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IncludedPositions }
     *     
     */
    public void setIncludedPositions(IncludedPositions value) {
        this.includedPositions = value;
    }

    /**
     * Ruft den Wert der extended-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getExtended() {
        return extended;
    }

    /**
     * Legt den Wert der extended-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setExtended(FieldBoolean value) {
        this.extended = value;
    }

    /**
     * Ruft den Wert der includedInCalculation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getIncludedInCalculation() {
        return includedInCalculation;
    }

    /**
     * Legt den Wert der includedInCalculation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setIncludedInCalculation(FieldBoolean value) {
        this.includedInCalculation = value;
    }

    /**
     * Ruft den Wert der length-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLength() {
        return length;
    }

    /**
     * Legt den Wert der length-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLength(FieldDecimal value) {
        this.length = value;
    }

    /**
     * Ruft den Wert der width-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWidth() {
        return width;
    }

    /**
     * Legt den Wert der width-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWidth(FieldDecimal value) {
        this.width = value;
    }

}
