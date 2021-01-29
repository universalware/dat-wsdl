
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getCalculationResults complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getCalculationResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="locale" type="{http://sphinx.dat.de/services/VehicleRepairService}locale" minOccurs="0"/>
 *         &lt;element name="includeProtocol" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCalculationResults", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "contractID",
    "locale",
    "includeProtocol"
})
public class GetCalculationResults {

    @XmlElement(namespace = "")
    protected long contractID;
    @XmlElement(namespace = "")
    protected Locale locale;
    @XmlElement(namespace = "")
    protected Boolean includeProtocol;

    /**
     * Ruft den Wert der contractID-Eigenschaft ab.
     * 
     */
    public long getContractID() {
        return contractID;
    }

    /**
     * Legt den Wert der contractID-Eigenschaft fest.
     * 
     */
    public void setContractID(long value) {
        this.contractID = value;
    }

    /**
     * Ruft den Wert der locale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Locale }
     *     
     */
    public Locale getLocale() {
        return locale;
    }

    /**
     * Legt den Wert der locale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Locale }
     *     
     */
    public void setLocale(Locale value) {
        this.locale = value;
    }

    /**
     * Ruft den Wert der includeProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeProtocol() {
        return includeProtocol;
    }

    /**
     * Legt den Wert der includeProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeProtocol(Boolean value) {
        this.includeProtocol = value;
    }

}
