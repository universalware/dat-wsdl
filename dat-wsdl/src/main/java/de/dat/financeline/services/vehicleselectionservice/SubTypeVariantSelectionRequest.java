
package de.dat.financeline.services.vehicleselectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für subTypeVariantSelectionRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="subTypeVariantSelectionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/VehicleSelectionService}subModelSelectionRequest">
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
@XmlType(name = "subTypeVariantSelectionRequest", namespace = "http://sphinx.dat.de/services/VehicleSelectionService", propOrder = {
    "subModel"
})
@XmlSeeAlso({
    SubTypeVariantEquipmentSelectionRequest.class,
    SubTypeVariantNumberSelectionRequest.class
})
public class SubTypeVariantSelectionRequest
    extends SubModelSelectionRequest
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
