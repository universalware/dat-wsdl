
package de.dat.vehiclerepaironline.dossierservice;

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
 *         &lt;element ref="{http://www.dat.de/vxs}Dossiers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changeDossier", namespace = "http://sphinx.dat.de/services/DossierWebService", propOrder = {
    "dossiers"
})
public class ChangeDossier {

    @XmlElement(name = "Dossiers", namespace = "http://www.dat.de/vxs")
    protected Dossiers dossiers;

    /**
     * Ruft den Wert der dossiers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Dossiers }
     *     
     */
    public Dossiers getDossiers() {
        return dossiers;
    }

    /**
     * Legt den Wert der dossiers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Dossiers }
     *     
     */
    public void setDossiers(Dossiers value) {
        this.dossiers = value;
    }

}
