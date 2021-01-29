
package de.dat.myclaim.soap.vehiclerepairservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für changePriceDatesResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="changePriceDatesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateChanged" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="resultDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changePriceDatesResponse", namespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", propOrder = {
    "dateChanged",
    "resultDeleted"
})
public class ChangePriceDatesResponse {

    @XmlElement(namespace = "", required = true, type = Boolean.class, nillable = true)
    protected Boolean dateChanged;
    @XmlElement(namespace = "", required = true, type = Boolean.class, nillable = true)
    protected Boolean resultDeleted;

    /**
     * Ruft den Wert der dateChanged-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDateChanged() {
        return dateChanged;
    }

    /**
     * Legt den Wert der dateChanged-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDateChanged(Boolean value) {
        this.dateChanged = value;
    }

    /**
     * Ruft den Wert der resultDeleted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResultDeleted() {
        return resultDeleted;
    }

    /**
     * Legt den Wert der resultDeleted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResultDeleted(Boolean value) {
        this.resultDeleted = value;
    }

}
