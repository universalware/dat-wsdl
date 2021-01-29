
package de.dat.financeline.services.dossier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für changeDossier complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="changeDossier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dat.de/vxs}Dossier"/>
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
@XmlType(name = "changeDossier", namespace = "http://sphinx.dat.de/services/Dossier", propOrder = {
    "dossier",
    "coverage"
})
public class ChangeDossier {

    @XmlElement(name = "Dossier", namespace = "http://www.dat.de/vxs", required = true)
    protected Dossier_Type dossier;
    @XmlElement(name = "Coverage", namespace = "")
    protected String coverage;

    /**
     * Ruft den Wert der dossier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Dossier_Type }
     *     
     */
    public Dossier_Type getDossier() {
        return dossier;
    }

    /**
     * Legt den Wert der dossier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Dossier_Type }
     *     
     */
    public void setDossier(Dossier_Type value) {
        this.dossier = value;
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
