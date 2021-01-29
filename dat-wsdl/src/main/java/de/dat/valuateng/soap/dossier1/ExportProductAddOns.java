
package de.dat.valuateng.soap.dossier1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für exportProductAddOns complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="exportProductAddOns">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="layout" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="printOption" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="product" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tax" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="valueIndication" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="withEquipmentReport" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="withRepairCosts" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="withRepairCostsDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="withTruckBodies" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="withValueDecrease" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="withValueIncrease" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="withValueIncreaseDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportProductAddOns", namespace = "http://www.dat.de/services/Dossier1")
public class ExportProductAddOns {

    @XmlAttribute(name = "layout")
    protected String layout;
    @XmlAttribute(name = "printOption")
    protected String printOption;
    @XmlAttribute(name = "product")
    protected String product;
    @XmlAttribute(name = "tax")
    protected String tax;
    @XmlAttribute(name = "value")
    protected String value;
    @XmlAttribute(name = "valueIndication")
    protected String valueIndication;
    @XmlAttribute(name = "withEquipmentReport")
    protected Boolean withEquipmentReport;
    @XmlAttribute(name = "withRepairCosts")
    protected Boolean withRepairCosts;
    @XmlAttribute(name = "withRepairCostsDetails")
    protected Boolean withRepairCostsDetails;
    @XmlAttribute(name = "withTruckBodies")
    protected Boolean withTruckBodies;
    @XmlAttribute(name = "withValueDecrease")
    protected Boolean withValueDecrease;
    @XmlAttribute(name = "withValueIncrease")
    protected Boolean withValueIncrease;
    @XmlAttribute(name = "withValueIncreaseDetails")
    protected Boolean withValueIncreaseDetails;

    /**
     * Ruft den Wert der layout-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayout() {
        return layout;
    }

    /**
     * Legt den Wert der layout-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayout(String value) {
        this.layout = value;
    }

    /**
     * Ruft den Wert der printOption-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintOption() {
        return printOption;
    }

    /**
     * Legt den Wert der printOption-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintOption(String value) {
        this.printOption = value;
    }

    /**
     * Ruft den Wert der product-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Legt den Wert der product-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Ruft den Wert der tax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTax() {
        return tax;
    }

    /**
     * Legt den Wert der tax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTax(String value) {
        this.tax = value;
    }

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der valueIndication-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueIndication() {
        return valueIndication;
    }

    /**
     * Legt den Wert der valueIndication-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueIndication(String value) {
        this.valueIndication = value;
    }

    /**
     * Ruft den Wert der withEquipmentReport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithEquipmentReport() {
        return withEquipmentReport;
    }

    /**
     * Legt den Wert der withEquipmentReport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithEquipmentReport(Boolean value) {
        this.withEquipmentReport = value;
    }

    /**
     * Ruft den Wert der withRepairCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithRepairCosts() {
        return withRepairCosts;
    }

    /**
     * Legt den Wert der withRepairCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithRepairCosts(Boolean value) {
        this.withRepairCosts = value;
    }

    /**
     * Ruft den Wert der withRepairCostsDetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithRepairCostsDetails() {
        return withRepairCostsDetails;
    }

    /**
     * Legt den Wert der withRepairCostsDetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithRepairCostsDetails(Boolean value) {
        this.withRepairCostsDetails = value;
    }

    /**
     * Ruft den Wert der withTruckBodies-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithTruckBodies() {
        return withTruckBodies;
    }

    /**
     * Legt den Wert der withTruckBodies-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithTruckBodies(Boolean value) {
        this.withTruckBodies = value;
    }

    /**
     * Ruft den Wert der withValueDecrease-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithValueDecrease() {
        return withValueDecrease;
    }

    /**
     * Legt den Wert der withValueDecrease-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithValueDecrease(Boolean value) {
        this.withValueDecrease = value;
    }

    /**
     * Ruft den Wert der withValueIncrease-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithValueIncrease() {
        return withValueIncrease;
    }

    /**
     * Legt den Wert der withValueIncrease-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithValueIncrease(Boolean value) {
        this.withValueIncrease = value;
    }

    /**
     * Ruft den Wert der withValueIncreaseDetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithValueIncreaseDetails() {
        return withValueIncreaseDetails;
    }

    /**
     * Legt den Wert der withValueIncreaseDetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithValueIncreaseDetails(Boolean value) {
        this.withValueIncreaseDetails = value;
    }

}
