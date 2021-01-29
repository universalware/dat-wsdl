
package de.dat.vehiclerepaironline.services.vehicleidentificationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getVehicleIdentificationByNationalCodeAustria complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getVehicleIdentificationByNationalCodeAustria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://sphinx.dat.de/services/VehicleIdentificationService}nationalCodeAustriaSelectionRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVehicleIdentificationByNationalCodeAustria", namespace = "http://sphinx.dat.de/services/VehicleIdentificationService", propOrder = {
    "request"
})
public class GetVehicleIdentificationByNationalCodeAustria {

    @XmlElement(namespace = "")
    protected NationalCodeAustriaSelectionRequest request;

    /**
     * Ruft den Wert der request-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NationalCodeAustriaSelectionRequest }
     *     
     */
    public NationalCodeAustriaSelectionRequest getRequest() {
        return request;
    }

    /**
     * Legt den Wert der request-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalCodeAustriaSelectionRequest }
     *     
     */
    public void setRequest(NationalCodeAustriaSelectionRequest value) {
        this.request = value;
    }

}
