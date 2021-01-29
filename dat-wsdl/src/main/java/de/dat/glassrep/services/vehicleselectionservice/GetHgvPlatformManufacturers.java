
package de.dat.glassrep.services.vehicleselectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getHgvPlatformManufacturers complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getHgvPlatformManufacturers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://sphinx.dat.de/services/VehicleSelectionService}hgvPlatformManufacturerSelectionRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getHgvPlatformManufacturers", namespace = "http://sphinx.dat.de/services/VehicleSelectionService", propOrder = {
    "request"
})
public class GetHgvPlatformManufacturers {

    @XmlElement(namespace = "")
    protected HgvPlatformManufacturerSelectionRequest request;

    /**
     * Ruft den Wert der request-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HgvPlatformManufacturerSelectionRequest }
     *     
     */
    public HgvPlatformManufacturerSelectionRequest getRequest() {
        return request;
    }

    /**
     * Legt den Wert der request-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HgvPlatformManufacturerSelectionRequest }
     *     
     */
    public void setRequest(HgvPlatformManufacturerSelectionRequest value) {
        this.request = value;
    }

}
