
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getAssemblyGroupGraphic complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getAssemblyGroupGraphic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locale" type="{http://sphinx.dat.de/services/VehicleRepairService}locale"/>
 *         &lt;element name="vehicleType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mainType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="assemblyGroupId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAssemblyGroupGraphic", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "locale",
    "vehicleType",
    "manufacturer",
    "mainType",
    "assemblyGroupId"
})
public class GetAssemblyGroupGraphic {

    @XmlElement(namespace = "", required = true)
    protected Locale locale;
    @XmlElement(namespace = "")
    protected int vehicleType;
    @XmlElement(namespace = "")
    protected int manufacturer;
    @XmlElement(namespace = "")
    protected int mainType;
    @XmlElement(namespace = "")
    protected int assemblyGroupId;

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
     * Ruft den Wert der vehicleType-Eigenschaft ab.
     * 
     */
    public int getVehicleType() {
        return vehicleType;
    }

    /**
     * Legt den Wert der vehicleType-Eigenschaft fest.
     * 
     */
    public void setVehicleType(int value) {
        this.vehicleType = value;
    }

    /**
     * Ruft den Wert der manufacturer-Eigenschaft ab.
     * 
     */
    public int getManufacturer() {
        return manufacturer;
    }

    /**
     * Legt den Wert der manufacturer-Eigenschaft fest.
     * 
     */
    public void setManufacturer(int value) {
        this.manufacturer = value;
    }

    /**
     * Ruft den Wert der mainType-Eigenschaft ab.
     * 
     */
    public int getMainType() {
        return mainType;
    }

    /**
     * Legt den Wert der mainType-Eigenschaft fest.
     * 
     */
    public void setMainType(int value) {
        this.mainType = value;
    }

    /**
     * Ruft den Wert der assemblyGroupId-Eigenschaft ab.
     * 
     */
    public int getAssemblyGroupId() {
        return assemblyGroupId;
    }

    /**
     * Legt den Wert der assemblyGroupId-Eigenschaft fest.
     * 
     */
    public void setAssemblyGroupId(int value) {
        this.assemblyGroupId = value;
    }

}
