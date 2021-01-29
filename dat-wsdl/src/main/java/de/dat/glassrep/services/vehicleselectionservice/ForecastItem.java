
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
 *         &lt;element name="Row" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="Months" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="MileagePerYear" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="MileageTotal" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="Value" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ValueGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Percentage" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PercentageNet" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PercentageGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Error" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "ForecastItem")
public class ForecastItem {

    @XmlElement(name = "Row")
    protected FieldInteger row;
    @XmlElement(name = "Months")
    protected FieldInteger months;
    @XmlElement(name = "MileagePerYear")
    protected FieldInteger mileagePerYear;
    @XmlElement(name = "MileageTotal")
    protected FieldInteger mileageTotal;
    @XmlElement(name = "Value")
    protected FieldDecimal value;
    @XmlElement(name = "ValueGross")
    protected FieldDecimal valueGross;
    @XmlElement(name = "Percentage")
    protected FieldDecimal percentage;
    @XmlElement(name = "PercentageNet")
    protected FieldDecimal percentageNet;
    @XmlElement(name = "PercentageGross")
    protected FieldDecimal percentageGross;
    @XmlElement(name = "Error")
    protected FieldString error;

    /**
     * Ruft den Wert der row-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getRow() {
        return row;
    }

    /**
     * Legt den Wert der row-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setRow(FieldInteger value) {
        this.row = value;
    }

    /**
     * Ruft den Wert der months-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getMonths() {
        return months;
    }

    /**
     * Legt den Wert der months-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setMonths(FieldInteger value) {
        this.months = value;
    }

    /**
     * Ruft den Wert der mileagePerYear-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getMileagePerYear() {
        return mileagePerYear;
    }

    /**
     * Legt den Wert der mileagePerYear-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setMileagePerYear(FieldInteger value) {
        this.mileagePerYear = value;
    }

    /**
     * Ruft den Wert der mileageTotal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getMileageTotal() {
        return mileageTotal;
    }

    /**
     * Legt den Wert der mileageTotal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setMileageTotal(FieldInteger value) {
        this.mileageTotal = value;
    }

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setValue(FieldDecimal value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der valueGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getValueGross() {
        return valueGross;
    }

    /**
     * Legt den Wert der valueGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setValueGross(FieldDecimal value) {
        this.valueGross = value;
    }

    /**
     * Ruft den Wert der percentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPercentage() {
        return percentage;
    }

    /**
     * Legt den Wert der percentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPercentage(FieldDecimal value) {
        this.percentage = value;
    }

    /**
     * Ruft den Wert der percentageNet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPercentageNet() {
        return percentageNet;
    }

    /**
     * Legt den Wert der percentageNet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPercentageNet(FieldDecimal value) {
        this.percentageNet = value;
    }

    /**
     * Ruft den Wert der percentageGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPercentageGross() {
        return percentageGross;
    }

    /**
     * Legt den Wert der percentageGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPercentageGross(FieldDecimal value) {
        this.percentageGross = value;
    }

    /**
     * Ruft den Wert der error-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getError() {
        return error;
    }

    /**
     * Legt den Wert der error-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setError(FieldString value) {
        this.error = value;
    }

}
