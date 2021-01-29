
package de.dat.financeline.services.dossier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für exportCertificateAddOns complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="exportCertificateAddOns">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="additionalSheet" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="attachmentDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="certificateBackground" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="comments" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="nrOfAttachments" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="printCoverage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="totalPages" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ePrint" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportCertificateAddOns", namespace = "http://sphinx.dat.de/services/Dossier")
public class ExportCertificateAddOns {

    @XmlAttribute(name = "additionalSheet")
    protected Boolean additionalSheet;
    @XmlAttribute(name = "attachmentDescription")
    protected String attachmentDescription;
    @XmlAttribute(name = "certificateBackground")
    protected String certificateBackground;
    @XmlAttribute(name = "comments")
    protected String comments;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "nrOfAttachments")
    protected String nrOfAttachments;
    @XmlAttribute(name = "printCoverage")
    protected String printCoverage;
    @XmlAttribute(name = "totalPages")
    protected String totalPages;
    @XmlAttribute(name = "ePrint")
    protected Boolean ePrint;

    /**
     * Ruft den Wert der additionalSheet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalSheet() {
        return additionalSheet;
    }

    /**
     * Legt den Wert der additionalSheet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalSheet(Boolean value) {
        this.additionalSheet = value;
    }

    /**
     * Ruft den Wert der attachmentDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentDescription() {
        return attachmentDescription;
    }

    /**
     * Legt den Wert der attachmentDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentDescription(String value) {
        this.attachmentDescription = value;
    }

    /**
     * Ruft den Wert der certificateBackground-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateBackground() {
        return certificateBackground;
    }

    /**
     * Legt den Wert der certificateBackground-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateBackground(String value) {
        this.certificateBackground = value;
    }

    /**
     * Ruft den Wert der comments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Legt den Wert der comments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der nrOfAttachments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrOfAttachments() {
        return nrOfAttachments;
    }

    /**
     * Legt den Wert der nrOfAttachments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrOfAttachments(String value) {
        this.nrOfAttachments = value;
    }

    /**
     * Ruft den Wert der printCoverage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintCoverage() {
        return printCoverage;
    }

    /**
     * Legt den Wert der printCoverage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintCoverage(String value) {
        this.printCoverage = value;
    }

    /**
     * Ruft den Wert der totalPages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPages() {
        return totalPages;
    }

    /**
     * Legt den Wert der totalPages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPages(String value) {
        this.totalPages = value;
    }

    /**
     * Ruft den Wert der ePrint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEPrint() {
        return ePrint;
    }

    /**
     * Legt den Wert der ePrint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEPrint(Boolean value) {
        this.ePrint = value;
    }

}
