
package de.dat.financeline.services.vehicleselectionservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getGrossVehicleWeightOptionsResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getGrossVehicleWeightOptionsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="grossVehicleWeightOption" type="{http://sphinx.dat.de/services/VehicleSelectionService}integerStringPair" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGrossVehicleWeightOptionsResponse", namespace = "http://sphinx.dat.de/services/VehicleSelectionService", propOrder = {
    "grossVehicleWeightOption"
})
public class GetGrossVehicleWeightOptionsResponse {

    @XmlElement(namespace = "")
    protected List<IntegerStringPair> grossVehicleWeightOption;

    /**
     * Gets the value of the grossVehicleWeightOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grossVehicleWeightOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrossVehicleWeightOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntegerStringPair }
     * 
     * 
     */
    public List<IntegerStringPair> getGrossVehicleWeightOption() {
        if (grossVehicleWeightOption == null) {
            grossVehicleWeightOption = new ArrayList<IntegerStringPair>();
        }
        return this.grossVehicleWeightOption;
    }

}
