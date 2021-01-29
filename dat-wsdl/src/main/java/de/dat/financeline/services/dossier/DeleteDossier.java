
package de.dat.financeline.services.dossier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für deleteDossier complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="deleteDossier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DossierId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteDossier", namespace = "http://sphinx.dat.de/services/Dossier", propOrder = {
    "dossierId"
})
public class DeleteDossier {

    @XmlElement(name = "DossierId", namespace = "")
    protected long dossierId;

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

}
