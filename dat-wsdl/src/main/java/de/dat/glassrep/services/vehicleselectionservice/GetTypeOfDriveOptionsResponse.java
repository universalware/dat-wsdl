
package de.dat.glassrep.services.vehicleselectionservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r getTypeOfDriveOptionsResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getTypeOfDriveOptionsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="typeOfDriveOption" type="{http://sphinx.dat.de/services/VehicleSelectionService}integerStringPair" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTypeOfDriveOptionsResponse", namespace = "http://sphinx.dat.de/services/VehicleSelectionService", propOrder = {
    "typeOfDriveOption"
})
public class GetTypeOfDriveOptionsResponse {

    @XmlElement(namespace = "")
    protected List<IntegerStringPair> typeOfDriveOption;

    /**
     * Gets the value of the typeOfDriveOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeOfDriveOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeOfDriveOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntegerStringPair }
     * 
     * 
     */
    public List<IntegerStringPair> getTypeOfDriveOption() {
        if (typeOfDriveOption == null) {
            typeOfDriveOption = new ArrayList<IntegerStringPair>();
        }
        return this.typeOfDriveOption;
    }

}
