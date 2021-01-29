
package de.dat.myclaim.soap.vehiclerepairservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getInsurancesResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getInsurancesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="insurances" type="{http://www.dat.eu/myClaim/soap/v2/VehicleRepairService}insuranceResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getInsurancesResponse", namespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", propOrder = {
    "insurances"
})
public class GetInsurancesResponse {

    @XmlElement(namespace = "")
    protected InsuranceResponse insurances;

    /**
     * Ruft den Wert der insurances-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceResponse }
     *     
     */
    public InsuranceResponse getInsurances() {
        return insurances;
    }

    /**
     * Legt den Wert der insurances-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceResponse }
     *     
     */
    public void setInsurances(InsuranceResponse value) {
        this.insurances = value;
    }

}
