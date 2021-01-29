
package de.dat.datecodeselection.services.conversionfunctionsservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für equipment complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="equipment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appraisalGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="equipmentClassification" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="equipmentNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="equipmentStandardOrOptional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="equipmentLabeling" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "equipment", namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", propOrder = {
    "appraisalGroup",
    "equipmentClassification",
    "equipmentNumber",
    "equipmentStandardOrOptional",
    "manufacturerCode",
    "price"
})
public class Equipment {

    @XmlElement(namespace = "")
    protected String appraisalGroup;
    @XmlElement(namespace = "")
    protected Integer equipmentClassification;
    @XmlElement(namespace = "")
    protected Integer equipmentNumber;
    @XmlElement(namespace = "")
    protected String equipmentStandardOrOptional;
    @XmlElement(namespace = "")
    protected String manufacturerCode;
    @XmlElement(namespace = "")
    protected Integer price;
    @XmlAttribute(name = "equipmentLabeling", required = true)
    protected String equipmentLabeling;

    /**
     * Ruft den Wert der appraisalGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppraisalGroup() {
        return appraisalGroup;
    }

    /**
     * Legt den Wert der appraisalGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppraisalGroup(String value) {
        this.appraisalGroup = value;
    }

    /**
     * Ruft den Wert der equipmentClassification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEquipmentClassification() {
        return equipmentClassification;
    }

    /**
     * Legt den Wert der equipmentClassification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEquipmentClassification(Integer value) {
        this.equipmentClassification = value;
    }

    /**
     * Ruft den Wert der equipmentNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEquipmentNumber() {
        return equipmentNumber;
    }

    /**
     * Legt den Wert der equipmentNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEquipmentNumber(Integer value) {
        this.equipmentNumber = value;
    }

    /**
     * Ruft den Wert der equipmentStandardOrOptional-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentStandardOrOptional() {
        return equipmentStandardOrOptional;
    }

    /**
     * Legt den Wert der equipmentStandardOrOptional-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentStandardOrOptional(String value) {
        this.equipmentStandardOrOptional = value;
    }

    /**
     * Ruft den Wert der manufacturerCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerCode() {
        return manufacturerCode;
    }

    /**
     * Legt den Wert der manufacturerCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerCode(String value) {
        this.manufacturerCode = value;
    }

    /**
     * Ruft den Wert der price-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * Legt den Wert der price-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrice(Integer value) {
        this.price = value;
    }

    /**
     * Ruft den Wert der equipmentLabeling-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentLabeling() {
        return equipmentLabeling;
    }

    /**
     * Legt den Wert der equipmentLabeling-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentLabeling(String value) {
        this.equipmentLabeling = value;
    }

}
