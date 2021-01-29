
package de.dat.valuateng.soap.dossier1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für resetDossier2Default complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="resetDossier2Default">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DossierId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
@XmlType(name = "resetDossier2Default", namespace = "http://www.dat.de/services/Dossier1", propOrder = {
    "dossierId",
    "coverage"
})
public class ResetDossier2Default {

    @XmlElement(name = "DossierId", namespace = "")
    protected long dossierId;
    @XmlElement(name = "Coverage", namespace = "")
    protected String coverage;

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
