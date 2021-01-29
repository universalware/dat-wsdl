
package de.dat.financeline.services.conversionfunctionsservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für equipmentFromManufacturerCodeSelectionRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="equipmentFromManufacturerCodeSelectionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/ConversionFunctionsService}vehicleSelectionRequest">
 *       &lt;sequence>
 *         &lt;element name="manufacturerCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "equipmentFromManufacturerCodeSelectionRequest", namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", propOrder = {
    "manufacturerCodes"
})
public class EquipmentFromManufacturerCodeSelectionRequest
    extends VehicleSelectionRequest
{

    @XmlElement(namespace = "", required = true)
    protected List<String> manufacturerCodes;

    /**
     * Gets the value of the manufacturerCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturerCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturerCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getManufacturerCodes() {
        if (manufacturerCodes == null) {
            manufacturerCodes = new ArrayList<String>();
        }
        return this.manufacturerCodes;
    }

}
