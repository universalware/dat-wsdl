
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r getInsurances complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getInsurances">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://sphinx.dat.de/services/VehicleRepairService}InsurancesRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getInsurances", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "request"
})
public class GetInsurances {

    @XmlElement(namespace = "", required = true)
    protected InsurancesRequest request;

    /**
     * Ruft den Wert der request-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InsurancesRequest }
     *     
     */
    public InsurancesRequest getRequest() {
        return request;
    }

    /**
     * Legt den Wert der request-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InsurancesRequest }
     *     
     */
    public void setRequest(InsurancesRequest value) {
        this.request = value;
    }

}
