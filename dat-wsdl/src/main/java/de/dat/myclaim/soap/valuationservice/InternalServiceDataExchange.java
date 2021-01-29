
package de.dat.myclaim.soap.valuationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für internalServiceDataExchange complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="internalServiceDataExchange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DossierId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="networkType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "internalServiceDataExchange", namespace = "http://www.dat.eu/myClaim/soap/v2/ValuationService", propOrder = {
    "dossierId",
    "networkType"
})
public class InternalServiceDataExchange {

    @XmlElement(name = "DossierId", namespace = "")
    protected long dossierId;
    @XmlElement(namespace = "", required = true)
    protected String networkType;

    /**
     * Ruft den Wert der dossierId-Eigenschaft ab.
     * 
     */
    public long getDossierId() {
        return dossierId;
    }

    /**
     * Legt den Wert der dossierId-Eigenschaft fest.
     * 
     */
    public void setDossierId(long value) {
        this.dossierId = value;
    }

    /**
     * Ruft den Wert der networkType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkType() {
        return networkType;
    }

    /**
     * Legt den Wert der networkType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkType(String value) {
        this.networkType = value;
    }

}
