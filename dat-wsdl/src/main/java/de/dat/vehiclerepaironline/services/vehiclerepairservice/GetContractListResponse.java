
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r getContractListResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getContractListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractList" type="{http://sphinx.dat.de/services/VehicleRepairService}datContractListResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getContractListResponse", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "contractList"
})
public class GetContractListResponse {

    @XmlElement(namespace = "")
    protected DatContractListResponse contractList;

    /**
     * Ruft den Wert der contractList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DatContractListResponse }
     *     
     */
    public DatContractListResponse getContractList() {
        return contractList;
    }

    /**
     * Legt den Wert der contractList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DatContractListResponse }
     *     
     */
    public void setContractList(DatContractListResponse value) {
        this.contractList = value;
    }

}
