
package de.dat.financeline.services.evaluation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getVehicleTargetDateEvaluationHistory complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getVehicleTargetDateEvaluationHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://sphinx.dat.de/services/Evaluation}vehicleHistoricalEvaluationRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVehicleTargetDateEvaluationHistory", namespace = "http://sphinx.dat.de/services/Evaluation", propOrder = {
    "request"
})
public class GetVehicleTargetDateEvaluationHistory {

    @XmlElement(namespace = "")
    protected VehicleHistoricalEvaluationRequest request;

    /**
     * Ruft den Wert der request-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleHistoricalEvaluationRequest }
     *     
     */
    public VehicleHistoricalEvaluationRequest getRequest() {
        return request;
    }

    /**
     * Legt den Wert der request-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleHistoricalEvaluationRequest }
     *     
     */
    public void setRequest(VehicleHistoricalEvaluationRequest value) {
        this.request = value;
    }

}
