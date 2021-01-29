
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ExportToDocumentRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ExportToDocumentRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dossierID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="exportProduct" type="{http://sphinx.dat.de/services/VehicleRepairService}ExportProduct" minOccurs="0"/>
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locale" type="{http://sphinx.dat.de/services/VehicleRepairService}locale" minOccurs="0"/>
 *         &lt;element name="product" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportToDocumentRequest", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "dossierID",
    "exportProduct",
    "format",
    "locale",
    "product"
})
public class ExportToDocumentRequest {

    @XmlElement(namespace = "")
    protected long dossierID;
    @XmlElementRef(name = "exportProduct", type = JAXBElement.class, required = false)
    protected JAXBElement<ExportProduct> exportProduct;
    @XmlElementRef(name = "format", type = JAXBElement.class, required = false)
    protected JAXBElement<String> format;
    @XmlElementRef(name = "locale", type = JAXBElement.class, required = false)
    protected JAXBElement<Locale> locale;
    @XmlElementRef(name = "product", type = JAXBElement.class, required = false)
    protected JAXBElement<String> product;

    /**
     * Ruft den Wert der dossierID-Eigenschaft ab.
     * 
     */
    public long getDossierID() {
        return dossierID;
    }

    /**
     * Legt den Wert der dossierID-Eigenschaft fest.
     * 
     */
    public void setDossierID(long value) {
        this.dossierID = value;
    }

    /**
     * Ruft den Wert der exportProduct-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExportProduct }{@code >}
     *     
     */
    public JAXBElement<ExportProduct> getExportProduct() {
        return exportProduct;
    }

    /**
     * Legt den Wert der exportProduct-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExportProduct }{@code >}
     *     
     */
    public void setExportProduct(JAXBElement<ExportProduct> value) {
        this.exportProduct = value;
    }

    /**
     * Ruft den Wert der format-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormat() {
        return format;
    }

    /**
     * Legt den Wert der format-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormat(JAXBElement<String> value) {
        this.format = value;
    }

    /**
     * Ruft den Wert der locale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Locale }{@code >}
     *     
     */
    public JAXBElement<Locale> getLocale() {
        return locale;
    }

    /**
     * Legt den Wert der locale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Locale }{@code >}
     *     
     */
    public void setLocale(JAXBElement<Locale> value) {
        this.locale = value;
    }

    /**
     * Ruft den Wert der product-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProduct() {
        return product;
    }

    /**
     * Legt den Wert der product-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProduct(JAXBElement<String> value) {
        this.product = value;
    }

}
