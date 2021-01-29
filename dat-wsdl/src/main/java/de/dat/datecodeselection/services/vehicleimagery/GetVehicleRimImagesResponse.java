
package de.dat.datecodeselection.services.vehicleimagery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getVehicleRimImagesResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getVehicleRimImagesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vehicleRimImages" type="{http://sphinx.dat.de/services/VehicleImagery}vehicleRimImagesResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVehicleRimImagesResponse", propOrder = {
    "vehicleRimImages"
})
public class GetVehicleRimImagesResponse {

    protected VehicleRimImagesResponse vehicleRimImages;

    /**
     * Ruft den Wert der vehicleRimImages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRimImagesResponse }
     *     
     */
    public VehicleRimImagesResponse getVehicleRimImages() {
        return vehicleRimImages;
    }

    /**
     * Legt den Wert der vehicleRimImages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRimImagesResponse }
     *     
     */
    public void setVehicleRimImages(VehicleRimImagesResponse value) {
        this.vehicleRimImages = value;
    }

}
