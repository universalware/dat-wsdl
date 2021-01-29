
package de.dat.datecodeselection.services.vehicleselectionservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für subTypeVariantEquipmentSelectionRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="subTypeVariantEquipmentSelectionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/VehicleSelectionService}subTypeVariantSelectionRequest">
 *       &lt;sequence>
 *         &lt;element name="availableOptions" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subTypeVariantEquipmentSelectionRequest", namespace = "http://sphinx.dat.de/services/VehicleSelectionService", propOrder = {
    "availableOptions"
})
@XmlSeeAlso({
    SubTypeVariantClassifiedEquipmentSelectionRequest.class
})
public class SubTypeVariantEquipmentSelectionRequest
    extends SubTypeVariantSelectionRequest
{

    @XmlElement(namespace = "", nillable = true)
    protected List<Integer> availableOptions;

    /**
     * Gets the value of the availableOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getAvailableOptions() {
        if (availableOptions == null) {
            availableOptions = new ArrayList<Integer>();
        }
        return this.availableOptions;
    }

}
