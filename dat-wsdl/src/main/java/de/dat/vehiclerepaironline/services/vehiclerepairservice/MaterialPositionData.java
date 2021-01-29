
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für materialPositionData complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="materialPositionData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="constructionTimeFrom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="constructionTimeTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dpn" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="partNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partNumberOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valuePerUnit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "materialPositionData", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "constructionTimeFrom",
    "constructionTimeTo",
    "description",
    "dpn",
    "partNumber",
    "partNumberOrigin",
    "valuePerUnit"
})
public class MaterialPositionData {

    @XmlElementRef(name = "constructionTimeFrom", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> constructionTimeFrom;
    @XmlElementRef(name = "constructionTimeTo", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> constructionTimeTo;
    @XmlElementRef(name = "description", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "dpn", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> dpn;
    @XmlElementRef(name = "partNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partNumber;
    @XmlElementRef(name = "partNumberOrigin", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partNumberOrigin;
    @XmlElementRef(name = "valuePerUnit", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> valuePerUnit;

    /**
     * Ruft den Wert der constructionTimeFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConstructionTimeFrom() {
        return constructionTimeFrom;
    }

    /**
     * Legt den Wert der constructionTimeFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConstructionTimeFrom(JAXBElement<Integer> value) {
        this.constructionTimeFrom = value;
    }

    /**
     * Ruft den Wert der constructionTimeTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConstructionTimeTo() {
        return constructionTimeTo;
    }

    /**
     * Legt den Wert der constructionTimeTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConstructionTimeTo(JAXBElement<Integer> value) {
        this.constructionTimeTo = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der dpn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDpn() {
        return dpn;
    }

    /**
     * Legt den Wert der dpn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDpn(JAXBElement<Long> value) {
        this.dpn = value;
    }

    /**
     * Ruft den Wert der partNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartNumber() {
        return partNumber;
    }

    /**
     * Legt den Wert der partNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartNumber(JAXBElement<String> value) {
        this.partNumber = value;
    }

    /**
     * Ruft den Wert der partNumberOrigin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartNumberOrigin() {
        return partNumberOrigin;
    }

    /**
     * Legt den Wert der partNumberOrigin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartNumberOrigin(JAXBElement<String> value) {
        this.partNumberOrigin = value;
    }

    /**
     * Ruft den Wert der valuePerUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getValuePerUnit() {
        return valuePerUnit;
    }

    /**
     * Legt den Wert der valuePerUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setValuePerUnit(JAXBElement<BigDecimal> value) {
        this.valuePerUnit = value;
    }

}
