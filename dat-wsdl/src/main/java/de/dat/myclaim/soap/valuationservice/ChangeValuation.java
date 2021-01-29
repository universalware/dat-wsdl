
package de.dat.myclaim.soap.valuationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für changeValuation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="changeValuation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element ref="{http://www.dat.de/vxs}Dossier" minOccurs="0"/>
 *         &lt;element name="Coverage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changeValuation", namespace = "http://www.dat.eu/myClaim/soap/v2/ValuationService", propOrder = {
    "contractID",
    "dossier",
    "coverage"
})
public class ChangeValuation {

    @XmlElement(namespace = "")
    protected long contractID;
    @XmlElement(name = "Dossier", namespace = "http://www.dat.de/vxs")
    protected Dossier dossier;
    @XmlElement(name = "Coverage", namespace = "", required = true)
    protected String coverage;

    /**
     * Ruft den Wert der contractID-Eigenschaft ab.
     * 
     */
    public long getContractID() {
        return contractID;
    }

    /**
     * Legt den Wert der contractID-Eigenschaft fest.
     * 
     */
    public void setContractID(long value) {
        this.contractID = value;
    }

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

}
