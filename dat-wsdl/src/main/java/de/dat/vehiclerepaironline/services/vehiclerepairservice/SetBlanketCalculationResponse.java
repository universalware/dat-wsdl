
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für setBlanketCalculationResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="setBlanketCalculationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="blanketCalculation" type="{http://sphinx.dat.de/services/VehicleRepairService}setBlanketClaculationResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setBlanketCalculationResponse", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "blanketCalculation"
})
public class SetBlanketCalculationResponse {

    @XmlElement(namespace = "")
    protected SetBlanketClaculationResponse blanketCalculation;

    /**
     * Ruft den Wert der blanketCalculation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SetBlanketClaculationResponse }
     *     
     */
    public SetBlanketClaculationResponse getBlanketCalculation() {
        return blanketCalculation;
    }

    /**
     * Legt den Wert der blanketCalculation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SetBlanketClaculationResponse }
     *     
     */
    public void setBlanketCalculation(SetBlanketClaculationResponse value) {
        this.blanketCalculation = value;
    }

}
