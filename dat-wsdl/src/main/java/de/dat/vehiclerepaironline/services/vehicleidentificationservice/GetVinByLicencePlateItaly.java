
package de.dat.vehiclerepaironline.services.vehicleidentificationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getVinByLicencePlateItaly complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getVinByLicencePlateItaly">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://sphinx.dat.de/services/VehicleIdentificationService}vinByLicencePlateItalyRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVinByLicencePlateItaly", namespace = "http://sphinx.dat.de/services/VehicleIdentificationService", propOrder = {
    "request"
})
public class GetVinByLicencePlateItaly {

    @XmlElement(namespace = "")
    protected VinByLicencePlateItalyRequest request;

    /**
     * Ruft den Wert der request-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VinByLicencePlateItalyRequest }
     *     
     */
    public VinByLicencePlateItalyRequest getRequest() {
        return request;
    }

    /**
     * Legt den Wert der request-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VinByLicencePlateItalyRequest }
     *     
     */
    public void setRequest(VinByLicencePlateItalyRequest value) {
        this.request = value;
    }

}
