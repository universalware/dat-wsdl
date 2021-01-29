
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LacquerTypesRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LacquerTypesRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locale" type="{http://sphinx.dat.de/services/VehicleRepairService}locale" minOccurs="0"/>
 *         &lt;element name="mainType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="paintMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vehicleType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LacquerTypesRequest", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "locale",
    "mainType",
    "manufacturer",
    "paintMethod",
    "vehicleType"
})
public class LacquerTypesRequest {

    @XmlElementRef(name = "locale", type = JAXBElement.class, required = false)
    protected JAXBElement<Locale> locale;
    @XmlElementRef(name = "mainType", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mainType;
    @XmlElementRef(name = "manufacturer", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> manufacturer;
    @XmlElement(namespace = "", required = true)
    protected String paintMethod;
    @XmlElementRef(name = "vehicleType", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> vehicleType;

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

    /**
     * Ruft den Wert der mainType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMainType() {
        return mainType;
    }

    /**
     * Legt den Wert der mainType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMainType(JAXBElement<Integer> value) {
        this.mainType = value;
    }

    /**
     * Ruft den Wert der manufacturer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getManufacturer() {
        return manufacturer;
    }

    /**
     * Legt den Wert der manufacturer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setManufacturer(JAXBElement<Integer> value) {
        this.manufacturer = value;
    }

    /**
     * Ruft den Wert der paintMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaintMethod() {
        return paintMethod;
    }

    /**
     * Legt den Wert der paintMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaintMethod(String value) {
        this.paintMethod = value;
    }

    /**
     * Ruft den Wert der vehicleType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getVehicleType() {
        return vehicleType;
    }

    /**
     * Legt den Wert der vehicleType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setVehicleType(JAXBElement<Integer> value) {
        this.vehicleType = value;
    }

}
