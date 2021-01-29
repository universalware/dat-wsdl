
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SetBlanketCalculationRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SetBlanketCalculationRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dossierId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="labourCosts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lacquerCosts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sparePartsCosts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetBlanketCalculationRequest", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "dossierId",
    "labourCosts",
    "lacquerCosts",
    "sparePartsCosts"
})
public class SetBlanketCalculationRequest {

    @XmlElement(namespace = "")
    protected long dossierId;
    @XmlElementRef(name = "labourCosts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> labourCosts;
    @XmlElementRef(name = "lacquerCosts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lacquerCosts;
    @XmlElementRef(name = "sparePartsCosts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sparePartsCosts;

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
     * Ruft den Wert der labourCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLabourCosts() {
        return labourCosts;
    }

    /**
     * Legt den Wert der labourCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLabourCosts(JAXBElement<String> value) {
        this.labourCosts = value;
    }

    /**
     * Ruft den Wert der lacquerCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLacquerCosts() {
        return lacquerCosts;
    }

    /**
     * Legt den Wert der lacquerCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLacquerCosts(JAXBElement<String> value) {
        this.lacquerCosts = value;
    }

    /**
     * Ruft den Wert der sparePartsCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSparePartsCosts() {
        return sparePartsCosts;
    }

    /**
     * Legt den Wert der sparePartsCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSparePartsCosts(JAXBElement<String> value) {
        this.sparePartsCosts = value;
    }

}
