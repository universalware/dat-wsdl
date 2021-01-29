
package de.dat.datecodeselection.services.vehicleimagery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getVehicleImagesNResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getVehicleImagesNResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vehicleImagesN" type="{http://sphinx.dat.de/services/VehicleImagery}vehicleImagesNResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVehicleImagesNResponse", propOrder = {
    "vehicleImagesN"
})
public class GetVehicleImagesNResponse {

    protected VehicleImagesNResponse vehicleImagesN;

    /**
     * Ruft den Wert der vehicleImagesN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleImagesNResponse }
     *     
     */
    public VehicleImagesNResponse getVehicleImagesN() {
        return vehicleImagesN;
    }

    /**
     * Legt den Wert der vehicleImagesN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleImagesNResponse }
     *     
     */
    public void setVehicleImagesN(VehicleImagesNResponse value) {
        this.vehicleImagesN = value;
    }

}
