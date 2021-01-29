
package de.dat.vehiclerepaironline.services.vehicleidentificationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getVinByOcrResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getVinByOcrResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vin" type="{http://sphinx.dat.de/services/VehicleIdentificationService}vinOcrResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVinByOcrResponse", namespace = "http://sphinx.dat.de/services/VehicleIdentificationService", propOrder = {
    "vin"
})
public class GetVinByOcrResponse {

    @XmlElement(namespace = "")
    protected VinOcrResponse vin;

    /**
     * Ruft den Wert der vin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VinOcrResponse }
     *     
     */
    public VinOcrResponse getVin() {
        return vin;
    }

    /**
     * Legt den Wert der vin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VinOcrResponse }
     *     
     */
    public void setVin(VinOcrResponse value) {
        this.vin = value;
    }

}
