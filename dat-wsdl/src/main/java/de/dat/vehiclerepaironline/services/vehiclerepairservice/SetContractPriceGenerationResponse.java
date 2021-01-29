
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für setContractPriceGenerationResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="setContractPriceGenerationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractStatus" type="{http://sphinx.dat.de/services/VehicleRepairService}changePriceDatesResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setContractPriceGenerationResponse", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "contractStatus"
})
public class SetContractPriceGenerationResponse {

    @XmlElement(namespace = "")
    protected ChangePriceDatesResponse contractStatus;

    /**
     * Ruft den Wert der contractStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ChangePriceDatesResponse }
     *     
     */
    public ChangePriceDatesResponse getContractStatus() {
        return contractStatus;
    }

    /**
     * Legt den Wert der contractStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangePriceDatesResponse }
     *     
     */
    public void setContractStatus(ChangePriceDatesResponse value) {
        this.contractStatus = value;
    }

}
