
package de.dat.datecodeselection.services.vehicleidentificationservice;

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
 *         &lt;element name="Identifier" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Description" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ValueNet" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ValueNetDiscountPerc" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ValueNetDiscountValue" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ValueNetCorrected" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ValueVat" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ValueGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "TotalSummaryItemItaly")
public class TotalSummaryItemItaly {

    @XmlElement(name = "Identifier")
    protected FieldString identifier;
    @XmlElement(name = "Description")
    protected FieldString description;
    @XmlElement(name = "ValueNet")
    protected FieldDecimal valueNet;
    @XmlElement(name = "ValueNetDiscountPerc")
    protected FieldDecimal valueNetDiscountPerc;
    @XmlElement(name = "ValueNetDiscountValue")
    protected FieldDecimal valueNetDiscountValue;
    @XmlElement(name = "ValueNetCorrected")
    protected FieldDecimal valueNetCorrected;
    @XmlElement(name = "ValueVat")
    protected FieldDecimal valueVat;
    @XmlElement(name = "ValueGross")
    protected FieldDecimal valueGross;

    /**
     * Ruft den Wert der identifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getIdentifier() {
        return identifier;
    }

    /**
     * Legt den Wert der identifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setIdentifier(FieldString value) {
        this.identifier = value;
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
     * Ruft den Wert der valueNet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getValueNet() {
        return valueNet;
    }

    /**
     * Legt den Wert der valueNet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setValueNet(FieldDecimal value) {
        this.valueNet = value;
    }

    /**
     * Ruft den Wert der valueNetDiscountPerc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getValueNetDiscountPerc() {
        return valueNetDiscountPerc;
    }

    /**
     * Legt den Wert der valueNetDiscountPerc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setValueNetDiscountPerc(FieldDecimal value) {
        this.valueNetDiscountPerc = value;
    }

    /**
     * Ruft den Wert der valueNetDiscountValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getValueNetDiscountValue() {
        return valueNetDiscountValue;
    }

    /**
     * Legt den Wert der valueNetDiscountValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setValueNetDiscountValue(FieldDecimal value) {
        this.valueNetDiscountValue = value;
    }

    /**
     * Ruft den Wert der valueNetCorrected-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getValueNetCorrected() {
        return valueNetCorrected;
    }

    /**
     * Legt den Wert der valueNetCorrected-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setValueNetCorrected(FieldDecimal value) {
        this.valueNetCorrected = value;
    }

    /**
     * Ruft den Wert der valueVat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getValueVat() {
        return valueVat;
    }

    /**
     * Legt den Wert der valueVat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setValueVat(FieldDecimal value) {
        this.valueVat = value;
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

}
