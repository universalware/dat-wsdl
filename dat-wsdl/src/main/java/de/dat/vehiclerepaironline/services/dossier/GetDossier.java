
package de.dat.vehiclerepaironline.services.dossier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getDossier complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getDossier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DossierId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Coverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDossier", namespace = "http://sphinx.dat.de/services/DossierWebService", propOrder = {
    "dossierId",
    "coverage"
})
public class GetDossier {

    @XmlElement(name = "DossierId", namespace = "")
    protected Long dossierId;
    @XmlElement(name = "Coverage", namespace = "")
    protected String coverage;

    /**
     * Ruft den Wert der dossierId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDossierId() {
        return dossierId;
    }

    /**
     * Legt den Wert der dossierId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDossierId(Long value) {
        this.dossierId = value;
    }

    /**
     * Ruft den Wert der coverage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverage() {
        return coverage;
    }

    /**
     * Legt den Wert der coverage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverage(String value) {
        this.coverage = value;
    }

}
