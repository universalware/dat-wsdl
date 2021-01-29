
package de.dat.financeline.services.vehicleselectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für hgvPlatformAggregateModelDataRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="hgvPlatformAggregateModelDataRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/VehicleSelectionService}hgvPlatformAggregateModelSelectionRequest">
 *       &lt;sequence>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hgvPlatformAggregateModelDataRequest", namespace = "http://sphinx.dat.de/services/VehicleSelectionService", propOrder = {
    "model"
})
public class HgvPlatformAggregateModelDataRequest
    extends HgvPlatformAggregateModelSelectionRequest
{

    @XmlElement(namespace = "")
    protected int model;

    /**
     * Ruft den Wert der model-Eigenschaft ab.
     * 
     */
    public int getModel() {
        return model;
    }

    /**
     * Legt den Wert der model-Eigenschaft fest.
     * 
     */
    public void setModel(int value) {
        this.model = value;
    }

}
