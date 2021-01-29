
package de.dat.myclaim.soap.vehiclerepairservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getLacquerTypeKeysResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getLacquerTypeKeysResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lacquerTypes" type="{http://www.dat.eu/myClaim/soap/v2/VehicleRepairService}lacquerTypesResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLacquerTypeKeysResponse", namespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", propOrder = {
    "lacquerTypes"
})
public class GetLacquerTypeKeysResponse {

    @XmlElement(namespace = "")
    protected LacquerTypesResponse lacquerTypes;

    /**
     * Ruft den Wert der lacquerTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LacquerTypesResponse }
     *     
     */
    public LacquerTypesResponse getLacquerTypes() {
        return lacquerTypes;
    }

    /**
     * Legt den Wert der lacquerTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LacquerTypesResponse }
     *     
     */
    public void setLacquerTypes(LacquerTypesResponse value) {
        this.lacquerTypes = value;
    }

}
