
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
 *         &lt;element name="InvoiceDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="InvoiceNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Designation" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ValueNet" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "ActualRepairCost")
public class ActualRepairCost {

    @XmlElement(name = "InvoiceDate")
    protected FieldDate invoiceDate;
    @XmlElement(name = "InvoiceNumber")
    protected FieldString invoiceNumber;
    @XmlElement(name = "Designation")
    protected FieldString designation;
    @XmlElement(name = "ValueNet")
    protected FieldDecimal valueNet;
    @XmlElement(name = "ValueGross")
    protected FieldDecimal valueGross;

    /**
     * Ruft den Wert der invoiceDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Legt den Wert der invoiceDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setInvoiceDate(FieldDate value) {
        this.invoiceDate = value;
    }

    /**
     * Ruft den Wert der invoiceNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Legt den Wert der invoiceNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setInvoiceNumber(FieldString value) {
        this.invoiceNumber = value;
    }

    /**
     * Ruft den Wert der designation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDesignation() {
        return designation;
    }

    /**
     * Legt den Wert der designation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDesignation(FieldString value) {
        this.designation = value;
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
