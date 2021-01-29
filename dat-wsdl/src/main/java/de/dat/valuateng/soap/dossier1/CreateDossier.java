
package de.dat.valuateng.soap.dossier1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r createDossier complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="createDossier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dat.de/vxs}Dossier"/>
 *         &lt;element name="Coverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Save" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createDossier", namespace = "http://www.dat.de/services/Dossier1", propOrder = {
    "dossier",
    "coverage",
    "save"
})
public class CreateDossier {

    @XmlElement(name = "Dossier", namespace = "http://www.dat.de/vxs", required = true)
    protected Dossier dossier;
    @XmlElement(name = "Coverage", namespace = "")
    protected String coverage;
    @XmlElement(name = "Save", namespace = "")
    protected String save;

    /**
     * Ruft den Wert der dossier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Dossier }
     *     
     */
    public Dossier getDossier() {
        return dossier;
    }

    /**
     * Legt den Wert der dossier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Dossier }
     *     
     */
    public void setDossier(Dossier value) {
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

    /**
     * Ruft den Wert der save-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSave() {
        return save;
    }

    /**
     * Legt den Wert der save-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSave(String value) {
        this.save = value;
    }

}
