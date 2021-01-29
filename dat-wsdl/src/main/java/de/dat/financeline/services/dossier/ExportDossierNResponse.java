
package de.dat.financeline.services.dossier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für exportDossierNResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="exportDossierNResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExportDossier" type="{http://sphinx.dat.de/services/Dossier}ExportDossier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportDossierNResponse", namespace = "http://sphinx.dat.de/services/Dossier", propOrder = {
    "exportDossier"
})
public class ExportDossierNResponse {

    @XmlElement(name = "ExportDossier", namespace = "")
    protected ExportDossier2 exportDossier;

    /**
     * Ruft den Wert der exportDossier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExportDossier2 }
     *     
     */
    public ExportDossier2 getExportDossier() {
        return exportDossier;
    }

    /**
     * Legt den Wert der exportDossier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDossier2 }
     *     
     */
    public void setExportDossier(ExportDossier2 value) {
        this.exportDossier = value;
    }

}
