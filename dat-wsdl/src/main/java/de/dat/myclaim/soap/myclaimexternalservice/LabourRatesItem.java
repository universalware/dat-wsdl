
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für labourRatesItem complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="labourRatesItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fixedPrice" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="labourRateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paintingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wageBodyPerHour" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="wageBodyPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="wageElectricPerHour" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="wageElectricPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="wageMechanicPerHour" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="wageMechanicPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="wagePaintAzt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="wagePaintCesvimap" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="wagePaintCz" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="wagePaintEurolak" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="wagePaintManufacturer" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "labourRatesItem", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "customerNumber",
    "fixedPrice",
    "labourRateName",
    "paintingMethod",
    "wageBodyPerHour",
    "wageBodyPerUnit",
    "wageElectricPerHour",
    "wageElectricPerUnit",
    "wageMechanicPerHour",
    "wageMechanicPerUnit",
    "wagePaintAzt",
    "wagePaintCesvimap",
    "wagePaintCz",
    "wagePaintEurolak",
    "wagePaintManufacturer"
})
public class LabourRatesItem {

    @XmlElement(namespace = "")
    protected String customerNumber;
    @XmlElement(namespace = "")
    protected boolean fixedPrice;
    @XmlElement(namespace = "")
    protected String labourRateName;
    @XmlElement(namespace = "")
    protected String paintingMethod;
    @XmlElement(namespace = "")
    protected Double wageBodyPerHour;
    @XmlElement(namespace = "")
    protected Double wageBodyPerUnit;
    @XmlElement(namespace = "")
    protected Double wageElectricPerHour;
    @XmlElement(namespace = "")
    protected Double wageElectricPerUnit;
    @XmlElement(namespace = "")
    protected Double wageMechanicPerHour;
    @XmlElement(namespace = "")
    protected Double wageMechanicPerUnit;
    @XmlElement(namespace = "")
    protected Double wagePaintAzt;
    @XmlElement(namespace = "")
    protected Double wagePaintCesvimap;
    @XmlElement(namespace = "")
    protected Double wagePaintCz;
    @XmlElement(namespace = "")
    protected Double wagePaintEurolak;
    @XmlElement(namespace = "")
    protected Double wagePaintManufacturer;

    /**
     * Ruft den Wert der customerNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Legt den Wert der customerNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

    /**
     * Ruft den Wert der fixedPrice-Eigenschaft ab.
     * 
     */
    public boolean isFixedPrice() {
        return fixedPrice;
    }

    /**
     * Legt den Wert der fixedPrice-Eigenschaft fest.
     * 
     */
    public void setFixedPrice(boolean value) {
        this.fixedPrice = value;
    }

    /**
     * Ruft den Wert der labourRateName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabourRateName() {
        return labourRateName;
    }

    /**
     * Legt den Wert der labourRateName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabourRateName(String value) {
        this.labourRateName = value;
    }

    /**
     * Ruft den Wert der paintingMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaintingMethod() {
        return paintingMethod;
    }

    /**
     * Legt den Wert der paintingMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaintingMethod(String value) {
        this.paintingMethod = value;
    }

    /**
     * Ruft den Wert der wageBodyPerHour-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWageBodyPerHour() {
        return wageBodyPerHour;
    }

    /**
     * Legt den Wert der wageBodyPerHour-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWageBodyPerHour(Double value) {
        this.wageBodyPerHour = value;
    }

    /**
     * Ruft den Wert der wageBodyPerUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWageBodyPerUnit() {
        return wageBodyPerUnit;
    }

    /**
     * Legt den Wert der wageBodyPerUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWageBodyPerUnit(Double value) {
        this.wageBodyPerUnit = value;
    }

    /**
     * Ruft den Wert der wageElectricPerHour-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWageElectricPerHour() {
        return wageElectricPerHour;
    }

    /**
     * Legt den Wert der wageElectricPerHour-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWageElectricPerHour(Double value) {
        this.wageElectricPerHour = value;
    }

    /**
     * Ruft den Wert der wageElectricPerUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWageElectricPerUnit() {
        return wageElectricPerUnit;
    }

    /**
     * Legt den Wert der wageElectricPerUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWageElectricPerUnit(Double value) {
        this.wageElectricPerUnit = value;
    }

    /**
     * Ruft den Wert der wageMechanicPerHour-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWageMechanicPerHour() {
        return wageMechanicPerHour;
    }

    /**
     * Legt den Wert der wageMechanicPerHour-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWageMechanicPerHour(Double value) {
        this.wageMechanicPerHour = value;
    }

    /**
     * Ruft den Wert der wageMechanicPerUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWageMechanicPerUnit() {
        return wageMechanicPerUnit;
    }

    /**
     * Legt den Wert der wageMechanicPerUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWageMechanicPerUnit(Double value) {
        this.wageMechanicPerUnit = value;
    }

    /**
     * Ruft den Wert der wagePaintAzt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWagePaintAzt() {
        return wagePaintAzt;
    }

    /**
     * Legt den Wert der wagePaintAzt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWagePaintAzt(Double value) {
        this.wagePaintAzt = value;
    }

    /**
     * Ruft den Wert der wagePaintCesvimap-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWagePaintCesvimap() {
        return wagePaintCesvimap;
    }

    /**
     * Legt den Wert der wagePaintCesvimap-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWagePaintCesvimap(Double value) {
        this.wagePaintCesvimap = value;
    }

    /**
     * Ruft den Wert der wagePaintCz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWagePaintCz() {
        return wagePaintCz;
    }

    /**
     * Legt den Wert der wagePaintCz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWagePaintCz(Double value) {
        this.wagePaintCz = value;
    }

    /**
     * Ruft den Wert der wagePaintEurolak-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWagePaintEurolak() {
        return wagePaintEurolak;
    }

    /**
     * Legt den Wert der wagePaintEurolak-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWagePaintEurolak(Double value) {
        this.wagePaintEurolak = value;
    }

    /**
     * Ruft den Wert der wagePaintManufacturer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWagePaintManufacturer() {
        return wagePaintManufacturer;
    }

    /**
     * Legt den Wert der wagePaintManufacturer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWagePaintManufacturer(Double value) {
        this.wagePaintManufacturer = value;
    }

}
