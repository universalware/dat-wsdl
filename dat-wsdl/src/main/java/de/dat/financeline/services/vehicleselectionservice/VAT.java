
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
 *         &lt;element name="VatType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="VatAtConstructionTime" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatVatAtConstructionTime" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="BaseVatAtConstructionTime" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatBaseVatAtConstructionTime" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="AddOnTaxAtConstructionTime" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="AddOnTaxApplication" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PostTaxDifference" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="VatAtValuationTime" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatVatAtValuationTime" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="VatAtCalculationTime" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="VatAtSalesTime" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatVatAtSalesTime" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="VatAtPurchaseTime" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatVatAtPurchaseTime" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="VATReplacementPartAtCalculationTime" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "VAT")
public class VAT {

    @XmlElement(name = "VatType")
    protected FieldString vatType;
    @XmlElement(name = "VatAtConstructionTime")
    protected FieldDecimal vatAtConstructionTime;
    @XmlElement(name = "DatVatAtConstructionTime")
    protected FieldDecimal datVatAtConstructionTime;
    @XmlElement(name = "BaseVatAtConstructionTime")
    protected FieldDecimal baseVatAtConstructionTime;
    @XmlElement(name = "DatBaseVatAtConstructionTime")
    protected FieldDecimal datBaseVatAtConstructionTime;
    @XmlElement(name = "AddOnTaxAtConstructionTime")
    protected FieldDecimal addOnTaxAtConstructionTime;
    @XmlElement(name = "AddOnTaxApplication")
    protected FieldString addOnTaxApplication;
    @XmlElement(name = "PostTaxDifference")
    protected FieldDecimal postTaxDifference;
    @XmlElement(name = "VatAtValuationTime")
    protected FieldDecimal vatAtValuationTime;
    @XmlElement(name = "DatVatAtValuationTime")
    protected FieldDecimal datVatAtValuationTime;
    @XmlElement(name = "VatAtCalculationTime")
    protected FieldDecimal vatAtCalculationTime;
    @XmlElement(name = "VatAtSalesTime")
    protected FieldDecimal vatAtSalesTime;
    @XmlElement(name = "DatVatAtSalesTime")
    protected FieldDecimal datVatAtSalesTime;
    @XmlElement(name = "VatAtPurchaseTime")
    protected FieldDecimal vatAtPurchaseTime;
    @XmlElement(name = "DatVatAtPurchaseTime")
    protected FieldDecimal datVatAtPurchaseTime;
    @XmlElement(name = "VATReplacementPartAtCalculationTime")
    protected FieldDecimal vatReplacementPartAtCalculationTime;

    /**
     * Ruft den Wert der vatType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getVatType() {
        return vatType;
    }

    /**
     * Legt den Wert der vatType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setVatType(FieldString value) {
        this.vatType = value;
    }

    /**
     * Ruft den Wert der vatAtConstructionTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getVatAtConstructionTime() {
        return vatAtConstructionTime;
    }

    /**
     * Legt den Wert der vatAtConstructionTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setVatAtConstructionTime(FieldDecimal value) {
        this.vatAtConstructionTime = value;
    }

    /**
     * Ruft den Wert der datVatAtConstructionTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatVatAtConstructionTime() {
        return datVatAtConstructionTime;
    }

    /**
     * Legt den Wert der datVatAtConstructionTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatVatAtConstructionTime(FieldDecimal value) {
        this.datVatAtConstructionTime = value;
    }

    /**
     * Ruft den Wert der baseVatAtConstructionTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getBaseVatAtConstructionTime() {
        return baseVatAtConstructionTime;
    }

    /**
     * Legt den Wert der baseVatAtConstructionTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setBaseVatAtConstructionTime(FieldDecimal value) {
        this.baseVatAtConstructionTime = value;
    }

    /**
     * Ruft den Wert der datBaseVatAtConstructionTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatBaseVatAtConstructionTime() {
        return datBaseVatAtConstructionTime;
    }

    /**
     * Legt den Wert der datBaseVatAtConstructionTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatBaseVatAtConstructionTime(FieldDecimal value) {
        this.datBaseVatAtConstructionTime = value;
    }

    /**
     * Ruft den Wert der addOnTaxAtConstructionTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getAddOnTaxAtConstructionTime() {
        return addOnTaxAtConstructionTime;
    }

    /**
     * Legt den Wert der addOnTaxAtConstructionTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setAddOnTaxAtConstructionTime(FieldDecimal value) {
        this.addOnTaxAtConstructionTime = value;
    }

    /**
     * Ruft den Wert der addOnTaxApplication-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getAddOnTaxApplication() {
        return addOnTaxApplication;
    }

    /**
     * Legt den Wert der addOnTaxApplication-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setAddOnTaxApplication(FieldString value) {
        this.addOnTaxApplication = value;
    }

    /**
     * Ruft den Wert der postTaxDifference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPostTaxDifference() {
        return postTaxDifference;
    }

    /**
     * Legt den Wert der postTaxDifference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPostTaxDifference(FieldDecimal value) {
        this.postTaxDifference = value;
    }

    /**
     * Ruft den Wert der vatAtValuationTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getVatAtValuationTime() {
        return vatAtValuationTime;
    }

    /**
     * Legt den Wert der vatAtValuationTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setVatAtValuationTime(FieldDecimal value) {
        this.vatAtValuationTime = value;
    }

    /**
     * Ruft den Wert der datVatAtValuationTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatVatAtValuationTime() {
        return datVatAtValuationTime;
    }

    /**
     * Legt den Wert der datVatAtValuationTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatVatAtValuationTime(FieldDecimal value) {
        this.datVatAtValuationTime = value;
    }

    /**
     * Ruft den Wert der vatAtCalculationTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getVatAtCalculationTime() {
        return vatAtCalculationTime;
    }

    /**
     * Legt den Wert der vatAtCalculationTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setVatAtCalculationTime(FieldDecimal value) {
        this.vatAtCalculationTime = value;
    }

    /**
     * Ruft den Wert der vatAtSalesTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getVatAtSalesTime() {
        return vatAtSalesTime;
    }

    /**
     * Legt den Wert der vatAtSalesTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setVatAtSalesTime(FieldDecimal value) {
        this.vatAtSalesTime = value;
    }

    /**
     * Ruft den Wert der datVatAtSalesTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatVatAtSalesTime() {
        return datVatAtSalesTime;
    }

    /**
     * Legt den Wert der datVatAtSalesTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatVatAtSalesTime(FieldDecimal value) {
        this.datVatAtSalesTime = value;
    }

    /**
     * Ruft den Wert der vatAtPurchaseTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getVatAtPurchaseTime() {
        return vatAtPurchaseTime;
    }

    /**
     * Legt den Wert der vatAtPurchaseTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setVatAtPurchaseTime(FieldDecimal value) {
        this.vatAtPurchaseTime = value;
    }

    /**
     * Ruft den Wert der datVatAtPurchaseTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatVatAtPurchaseTime() {
        return datVatAtPurchaseTime;
    }

    /**
     * Legt den Wert der datVatAtPurchaseTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatVatAtPurchaseTime(FieldDecimal value) {
        this.datVatAtPurchaseTime = value;
    }

    /**
     * Ruft den Wert der vatReplacementPartAtCalculationTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getVATReplacementPartAtCalculationTime() {
        return vatReplacementPartAtCalculationTime;
    }

    /**
     * Legt den Wert der vatReplacementPartAtCalculationTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setVATReplacementPartAtCalculationTime(FieldDecimal value) {
        this.vatReplacementPartAtCalculationTime = value;
    }

}
