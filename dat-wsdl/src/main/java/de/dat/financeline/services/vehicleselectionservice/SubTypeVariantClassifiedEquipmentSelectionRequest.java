
package de.dat.financeline.services.vehicleselectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für subTypeVariantClassifiedEquipmentSelectionRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="subTypeVariantClassifiedEquipmentSelectionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/VehicleSelectionService}subTypeVariantEquipmentSelectionRequest">
 *       &lt;sequence>
 *         &lt;element name="classification" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subTypeVariantClassifiedEquipmentSelectionRequest", namespace = "http://sphinx.dat.de/services/VehicleSelectionService", propOrder = {
    "classification"
})
public class SubTypeVariantClassifiedEquipmentSelectionRequest
    extends SubTypeVariantEquipmentSelectionRequest
{

    @XmlElement(namespace = "")
    protected int classification;

    /**
     * Ruft den Wert der classification-Eigenschaft ab.
     * 
     */
    public int getClassification() {
        return classification;
    }

    /**
     * Legt den Wert der classification-Eigenschaft fest.
     * 
     */
    public void setClassification(int value) {
        this.classification = value;
    }

}
