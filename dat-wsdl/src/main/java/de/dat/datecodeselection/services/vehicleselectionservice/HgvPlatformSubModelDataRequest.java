
package de.dat.datecodeselection.services.vehicleselectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für hgvPlatformSubModelDataRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="hgvPlatformSubModelDataRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/VehicleSelectionService}hgvPlatformSubModelSelectionRequest">
 *       &lt;sequence>
 *         &lt;element name="subModel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hgvPlatformSubModelDataRequest", namespace = "http://sphinx.dat.de/services/VehicleSelectionService", propOrder = {
    "subModel"
})
public class HgvPlatformSubModelDataRequest
    extends HgvPlatformSubModelSelectionRequest
{

    @XmlElement(namespace = "")
    protected int subModel;

    /**
     * Ruft den Wert der subModel-Eigenschaft ab.
     * 
     */
    public int getSubModel() {
        return subModel;
    }

    /**
     * Legt den Wert der subModel-Eigenschaft fest.
     * 
     */
    public void setSubModel(int value) {
        this.subModel = value;
    }

}
