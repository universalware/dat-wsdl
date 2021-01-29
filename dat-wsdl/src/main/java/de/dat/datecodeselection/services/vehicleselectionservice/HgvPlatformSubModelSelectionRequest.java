
package de.dat.datecodeselection.services.vehicleselectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r hgvPlatformSubModelSelectionRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="hgvPlatformSubModelSelectionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/VehicleSelectionService}hgvPlatformBaseModelSelectionRequest">
 *       &lt;sequence>
 *         &lt;element name="baseModel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hgvPlatformSubModelSelectionRequest", namespace = "http://sphinx.dat.de/services/VehicleSelectionService", propOrder = {
    "baseModel"
})
@XmlSeeAlso({
    HgvPlatformSubModelDataRequest.class
})
public class HgvPlatformSubModelSelectionRequest
    extends HgvPlatformBaseModelSelectionRequest
{

    @XmlElement(namespace = "")
    protected int baseModel;

    /**
     * Ruft den Wert der baseModel-Eigenschaft ab.
     * 
     */
    public int getBaseModel() {
        return baseModel;
    }

    /**
     * Legt den Wert der baseModel-Eigenschaft fest.
     * 
     */
    public void setBaseModel(int value) {
        this.baseModel = value;
    }

}
