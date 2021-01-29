
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für changePriceDatesRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="changePriceDatesRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="generation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="removeResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changePriceDatesRequest", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "contractId",
    "generation",
    "removeResult"
})
public class ChangePriceDatesRequest {

    @XmlElement(namespace = "")
    protected long contractId;
    @XmlElement(namespace = "")
    protected int generation;
    @XmlElement(namespace = "", required = true, type = Boolean.class, nillable = true)
    protected Boolean removeResult;

    /**
     * Ruft den Wert der contractId-Eigenschaft ab.
     * 
     */
    public long getContractId() {
        return contractId;
    }

    /**
     * Legt den Wert der contractId-Eigenschaft fest.
     * 
     */
    public void setContractId(long value) {
        this.contractId = value;
    }

    /**
     * Ruft den Wert der generation-Eigenschaft ab.
     * 
     */
    public int getGeneration() {
        return generation;
    }

    /**
     * Legt den Wert der generation-Eigenschaft fest.
     * 
     */
    public void setGeneration(int value) {
        this.generation = value;
    }

    /**
     * Ruft den Wert der removeResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoveResult() {
        return removeResult;
    }

    /**
     * Legt den Wert der removeResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoveResult(Boolean value) {
        this.removeResult = value;
    }

}
