
package de.dat.myclaim.soap.vehiclerepairservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getContractRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getContractRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="includeProtocol" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="locale" type="{http://www.dat.eu/myClaim/soap/v2/VehicleRepairService}locale" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getContractRequest", namespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", propOrder = {
    "contractID",
    "includeProtocol",
    "locale"
})
public class GetContractRequest {

    @XmlElement(namespace = "")
    protected long contractID;
    @XmlElementRef(name = "includeProtocol", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> includeProtocol;
    @XmlElementRef(name = "locale", type = JAXBElement.class, required = false)
    protected JAXBElement<Locale> locale;

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
     * Ruft den Wert der includeProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIncludeProtocol() {
        return includeProtocol;
    }

    /**
     * Legt den Wert der includeProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIncludeProtocol(JAXBElement<Boolean> value) {
        this.includeProtocol = value;
    }

    /**
     * Ruft den Wert der locale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Locale }{@code >}
     *     
     */
    public JAXBElement<Locale> getLocale() {
        return locale;
    }

    /**
     * Legt den Wert der locale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Locale }{@code >}
     *     
     */
    public void setLocale(JAXBElement<Locale> value) {
        this.locale = value;
    }

}
