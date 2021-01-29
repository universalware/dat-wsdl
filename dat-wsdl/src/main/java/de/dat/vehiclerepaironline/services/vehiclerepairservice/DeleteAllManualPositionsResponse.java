
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für deleteAllManualPositionsResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="deleteAllManualPositionsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deleteSuccessful" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteAllManualPositionsResponse", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "deleteSuccessful"
})
public class DeleteAllManualPositionsResponse {

    @XmlElement(namespace = "")
    protected boolean deleteSuccessful;

    /**
     * Ruft den Wert der deleteSuccessful-Eigenschaft ab.
     * 
     */
    public boolean isDeleteSuccessful() {
        return deleteSuccessful;
    }

    /**
     * Legt den Wert der deleteSuccessful-Eigenschaft fest.
     * 
     */
    public void setDeleteSuccessful(boolean value) {
        this.deleteSuccessful = value;
    }

}
