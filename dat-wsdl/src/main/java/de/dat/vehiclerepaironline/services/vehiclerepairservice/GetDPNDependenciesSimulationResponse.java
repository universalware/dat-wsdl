
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getDPNDependenciesSimulationResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getDPNDependenciesSimulationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DPNDependenciesResponse" type="{http://sphinx.dat.de/services/VehicleRepairService}dpnDependenciesResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDPNDependenciesSimulationResponse", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "dpnDependenciesResponse"
})
public class GetDPNDependenciesSimulationResponse {

    @XmlElement(name = "DPNDependenciesResponse", namespace = "")
    protected DpnDependenciesResponse dpnDependenciesResponse;

    /**
     * Ruft den Wert der dpnDependenciesResponse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DpnDependenciesResponse }
     *     
     */
    public DpnDependenciesResponse getDPNDependenciesResponse() {
        return dpnDependenciesResponse;
    }

    /**
     * Legt den Wert der dpnDependenciesResponse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DpnDependenciesResponse }
     *     
     */
    public void setDPNDependenciesResponse(DpnDependenciesResponse value) {
        this.dpnDependenciesResponse = value;
    }

}
