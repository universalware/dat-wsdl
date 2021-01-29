
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getDPNDependenciesSimulation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getDPNDependenciesSimulation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://sphinx.dat.de/services/VehicleRepairService}dpnDependenciesRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDPNDependenciesSimulation", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "request"
})
public class GetDPNDependenciesSimulation {

    @XmlElement(namespace = "")
    protected DpnDependenciesRequest request;

    /**
     * Ruft den Wert der request-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DpnDependenciesRequest }
     *     
     */
    public DpnDependenciesRequest getRequest() {
        return request;
    }

    /**
     * Legt den Wert der request-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DpnDependenciesRequest }
     *     
     */
    public void setRequest(DpnDependenciesRequest value) {
        this.request = value;
    }

}
