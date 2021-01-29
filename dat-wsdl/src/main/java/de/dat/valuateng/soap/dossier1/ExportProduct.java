
package de.dat.valuateng.soap.dossier1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für exportProduct complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="exportProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="bodiesInProtocol" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="equipmentInProtocol" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="indicationOfValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="originalPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="originalPriceInProtocol" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="predictionReport" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="priceType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="productName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="productVariant" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="withBodies" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="withEquipmentList" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportProduct", namespace = "http://www.dat.de/services/Dossier1")
public class ExportProduct {

    @XmlAttribute(name = "bodiesInProtocol")
    protected Boolean bodiesInProtocol;
    @XmlAttribute(name = "equipmentInProtocol")
    protected Boolean equipmentInProtocol;
    @XmlAttribute(name = "indicationOfValue")
    protected String indicationOfValue;
    @XmlAttribute(name = "originalPrice")
    protected Boolean originalPrice;
    @XmlAttribute(name = "originalPriceInProtocol")
    protected Boolean originalPriceInProtocol;
    @XmlAttribute(name = "predictionReport")
    protected Boolean predictionReport;
    @XmlAttribute(name = "priceType")
    protected String priceType;
    @XmlAttribute(name = "productName", required = true)
    protected String productName;
    @XmlAttribute(name = "productVariant")
    protected String productVariant;
    @XmlAttribute(name = "withBodies")
    protected Boolean withBodies;
    @XmlAttribute(name = "withEquipmentList")
    protected Boolean withEquipmentList;

    /**
     * Ruft den Wert der bodiesInProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBodiesInProtocol() {
        return bodiesInProtocol;
    }

    /**
     * Legt den Wert der bodiesInProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBodiesInProtocol(Boolean value) {
        this.bodiesInProtocol = value;
    }

    /**
     * Ruft den Wert der equipmentInProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentInProtocol() {
        return equipmentInProtocol;
    }

    /**
     * Legt den Wert der equipmentInProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentInProtocol(Boolean value) {
        this.equipmentInProtocol = value;
    }

    /**
     * Ruft den Wert der indicationOfValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicationOfValue() {
        return indicationOfValue;
    }

    /**
     * Legt den Wert der indicationOfValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicationOfValue(String value) {
        this.indicationOfValue = value;
    }

    /**
     * Ruft den Wert der originalPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOriginalPrice() {
        return originalPrice;
    }

    /**
     * Legt den Wert der originalPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOriginalPrice(Boolean value) {
        this.originalPrice = value;
    }

    /**
     * Ruft den Wert der originalPriceInProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOriginalPriceInProtocol() {
        return originalPriceInProtocol;
    }

    /**
     * Legt den Wert der originalPriceInProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOriginalPriceInProtocol(Boolean value) {
        this.originalPriceInProtocol = value;
    }

    /**
     * Ruft den Wert der predictionReport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPredictionReport() {
        return predictionReport;
    }

    /**
     * Legt den Wert der predictionReport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPredictionReport(Boolean value) {
        this.predictionReport = value;
    }

    /**
     * Ruft den Wert der priceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceType() {
        return priceType;
    }

    /**
     * Legt den Wert der priceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceType(String value) {
        this.priceType = value;
    }

    /**
     * Ruft den Wert der productName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Legt den Wert der productName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Ruft den Wert der productVariant-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductVariant() {
        return productVariant;
    }

    /**
     * Legt den Wert der productVariant-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductVariant(String value) {
        this.productVariant = value;
    }

    /**
     * Ruft den Wert der withBodies-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithBodies() {
        return withBodies;
    }

    /**
     * Legt den Wert der withBodies-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithBodies(Boolean value) {
        this.withBodies = value;
    }

    /**
     * Ruft den Wert der withEquipmentList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithEquipmentList() {
        return withEquipmentList;
    }

    /**
     * Legt den Wert der withEquipmentList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithEquipmentList(Boolean value) {
        this.withEquipmentList = value;
    }

}
