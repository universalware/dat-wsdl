
package de.dat.datecodeselection.services.vehicleidentificationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getVinByLicencePlateFrance complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getVinByLicencePlateFrance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://sphinx.dat.de/services/VehicleIdentificationService}vinByLicencePlateFranceRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVinByLicencePlateFrance", namespace = "http://sphinx.dat.de/services/VehicleIdentificationService", propOrder = {
    "request"
})
public class GetVinByLicencePlateFrance {

    @XmlElement(namespace = "")
    protected VinByLicencePlateFranceRequest request;

    /**
     * Ruft den Wert der request-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VinByLicencePlateFranceRequest }
     *     
     */
    public VinByLicencePlateFranceRequest getRequest() {
        return request;
    }

    /**
     * Legt den Wert der request-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VinByLicencePlateFranceRequest }
     *     
     */
    public void setRequest(VinByLicencePlateFranceRequest value) {
        this.request = value;
    }

}
