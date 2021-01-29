
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getContractPriceGenerationsResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getContractPriceGenerationsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="priceDates" type="{http://sphinx.dat.de/services/VehicleRepairService}PriceDatesResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getContractPriceGenerationsResponse", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "priceDates"
})
public class GetContractPriceGenerationsResponse {

    @XmlElement(namespace = "")
    protected PriceDatesResponse priceDates;

    /**
     * Ruft den Wert der priceDates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PriceDatesResponse }
     *     
     */
    public PriceDatesResponse getPriceDates() {
        return priceDates;
    }

    /**
     * Legt den Wert der priceDates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceDatesResponse }
     *     
     */
    public void setPriceDates(PriceDatesResponse value) {
        this.priceDates = value;
    }

}
