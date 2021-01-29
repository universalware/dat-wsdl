
package de.dat.financeline.services.dossier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für exportDossier complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="exportDossier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DossierId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Locale" type="{http://sphinx.dat.de/services/Dossier}locale"/>
 *         &lt;element name="Format" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExportProduct" type="{http://sphinx.dat.de/services/Dossier}exportProduct"/>
 *         &lt;element name="ExportProductAddOns" type="{http://sphinx.dat.de/services/Dossier}exportProductAddOns" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportDossier", namespace = "http://sphinx.dat.de/services/Dossier", propOrder = {
    "dossierId",
    "locale",
    "format",
    "exportProduct",
    "exportProductAddOns"
})
public class ExportDossier {

    @XmlElement(name = "DossierId", namespace = "")
    protected long dossierId;
    @XmlElement(name = "Locale", namespace = "", required = true)
    protected Locale locale;
    @XmlElement(name = "Format", namespace = "", required = true)
    protected String format;
    @XmlElement(name = "ExportProduct", namespace = "", required = true)
    protected ExportProduct exportProduct;
    @XmlElement(name = "ExportProductAddOns", namespace = "")
    protected ExportProductAddOns exportProductAddOns;

    /**
     * Ruft den Wert der dossierId-Eigenschaft ab.
     * 
     */
    public long getDossierId() {
        return dossierId;
    }

    /**
     * Legt den Wert der dossierId-Eigenschaft fest.
     * 
     */
    public void setDossierId(long value) {
        this.dossierId = value;
    }

    /**
     * Ruft den Wert der locale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Locale }
     *     
     */
    public Locale getLocale() {
        return locale;
    }

    /**
     * Legt den Wert der locale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Locale }
     *     
     */
    public void setLocale(Locale value) {
        this.locale = value;
    }

    /**
     * Ruft den Wert der format-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Legt den Wert der format-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Ruft den Wert der exportProduct-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExportProduct }
     *     
     */
    public ExportProduct getExportProduct() {
        return exportProduct;
    }

    /**
     * Legt den Wert der exportProduct-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportProduct }
     *     
     */
    public void setExportProduct(ExportProduct value) {
        this.exportProduct = value;
    }

    /**
     * Ruft den Wert der exportProductAddOns-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExportProductAddOns }
     *     
     */
    public ExportProductAddOns getExportProductAddOns() {
        return exportProductAddOns;
    }

    /**
     * Legt den Wert der exportProductAddOns-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportProductAddOns }
     *     
     */
    public void setExportProductAddOns(ExportProductAddOns value) {
        this.exportProductAddOns = value;
    }

}
