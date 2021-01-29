
package de.dat.glassrep.services.vehicleselectionservice;

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
 *         &lt;element name="GroupKey" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Type" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="CalculationType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Fixed" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="CostCalculationType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="IntervalInMonths" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="Name" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="AmountFixed" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="AmountPerc" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="AmountPercMinValue" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="AmountPercMaxValue" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ModificationType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "ValueInfluencingFactor")
public class ValueInfluencingFactor {

    @XmlElement(name = "GroupKey")
    protected FieldString groupKey;
    @XmlElement(name = "Type")
    protected FieldString type;
    @XmlElement(name = "CalculationType")
    protected FieldString calculationType;
    @XmlElement(name = "Fixed")
    protected FieldBoolean fixed;
    @XmlElement(name = "CostCalculationType")
    protected FieldString costCalculationType;
    @XmlElement(name = "IntervalInMonths")
    protected FieldInteger intervalInMonths;
    @XmlElement(name = "Name")
    protected FieldString name;
    @XmlElement(name = "AmountFixed")
    protected FieldDecimal amountFixed;
    @XmlElement(name = "AmountPerc")
    protected FieldDecimal amountPerc;
    @XmlElement(name = "AmountPercMinValue")
    protected FieldDecimal amountPercMinValue;
    @XmlElement(name = "AmountPercMaxValue")
    protected FieldDecimal amountPercMaxValue;
    @XmlElement(name = "ModificationType")
    protected FieldString modificationType;

    /**
     * Ruft den Wert der groupKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getGroupKey() {
        return groupKey;
    }

    /**
     * Legt den Wert der groupKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setGroupKey(FieldString value) {
        this.groupKey = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setType(FieldString value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der calculationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCalculationType() {
        return calculationType;
    }

    /**
     * Legt den Wert der calculationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCalculationType(FieldString value) {
        this.calculationType = value;
    }

    /**
     * Ruft den Wert der fixed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getFixed() {
        return fixed;
    }

    /**
     * Legt den Wert der fixed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setFixed(FieldBoolean value) {
        this.fixed = value;
    }

    /**
     * Ruft den Wert der costCalculationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCostCalculationType() {
        return costCalculationType;
    }

    /**
     * Legt den Wert der costCalculationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCostCalculationType(FieldString value) {
        this.costCalculationType = value;
    }

    /**
     * Ruft den Wert der intervalInMonths-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getIntervalInMonths() {
        return intervalInMonths;
    }

    /**
     * Legt den Wert der intervalInMonths-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setIntervalInMonths(FieldInteger value) {
        this.intervalInMonths = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setName(FieldString value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der amountFixed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getAmountFixed() {
        return amountFixed;
    }

    /**
     * Legt den Wert der amountFixed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setAmountFixed(FieldDecimal value) {
        this.amountFixed = value;
    }

    /**
     * Ruft den Wert der amountPerc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getAmountPerc() {
        return amountPerc;
    }

    /**
     * Legt den Wert der amountPerc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setAmountPerc(FieldDecimal value) {
        this.amountPerc = value;
    }

    /**
     * Ruft den Wert der amountPercMinValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getAmountPercMinValue() {
        return amountPercMinValue;
    }

    /**
     * Legt den Wert der amountPercMinValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setAmountPercMinValue(FieldDecimal value) {
        this.amountPercMinValue = value;
    }

    /**
     * Ruft den Wert der amountPercMaxValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getAmountPercMaxValue() {
        return amountPercMaxValue;
    }

    /**
     * Legt den Wert der amountPercMaxValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setAmountPercMaxValue(FieldDecimal value) {
        this.amountPercMaxValue = value;
    }

    /**
     * Ruft den Wert der modificationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getModificationType() {
        return modificationType;
    }

    /**
     * Legt den Wert der modificationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setModificationType(FieldString value) {
        this.modificationType = value;
    }

}
