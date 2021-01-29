
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für importManualPositionsResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="importManualPositionsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="importSuccessful" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importManualPositionsResponse", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "importSuccessful"
})
public class ImportManualPositionsResponse {

    @XmlElement(namespace = "")
    protected boolean importSuccessful;

    /**
     * Ruft den Wert der importSuccessful-Eigenschaft ab.
     * 
     */
    public boolean isImportSuccessful() {
        return importSuccessful;
    }

    /**
     * Legt den Wert der importSuccessful-Eigenschaft fest.
     * 
     */
    public void setImportSuccessful(boolean value) {
        this.importSuccessful = value;
    }

}
