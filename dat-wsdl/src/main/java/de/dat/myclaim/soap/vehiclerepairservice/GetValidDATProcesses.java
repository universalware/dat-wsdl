
package de.dat.myclaim.soap.vehiclerepairservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r getValidDATProcesses complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getValidDATProcesses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://www.dat.eu/myClaim/soap/v2/VehicleRepairService}datProcessesRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getValidDATProcesses", namespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", propOrder = {
    "request"
})
public class GetValidDATProcesses {

    @XmlElement(namespace = "")
    protected DatProcessesRequest request;

    /**
     * Ruft den Wert der request-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DatProcessesRequest }
     *     
     */
    public DatProcessesRequest getRequest() {
        return request;
    }

    /**
     * Legt den Wert der request-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DatProcessesRequest }
     *     
     */
    public void setRequest(DatProcessesRequest value) {
        this.request = value;
    }

}
