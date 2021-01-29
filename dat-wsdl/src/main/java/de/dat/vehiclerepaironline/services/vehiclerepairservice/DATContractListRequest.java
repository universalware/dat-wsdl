
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DATContractListRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DATContractListRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="restriction" type="{http://sphinx.dat.de/services/VehicleRepairService}restriction"/>
 *         &lt;element name="settings" type="{http://sphinx.dat.de/services/VehicleRepairService}settings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DATContractListRequest", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "restriction",
    "settings"
})
public class DATContractListRequest {

    @XmlElement(namespace = "", required = true)
    protected Restriction restriction;
    @XmlElement(namespace = "")
    protected Settings settings;

    /**
     * Ruft den Wert der restriction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Restriction }
     *     
     */
    public Restriction getRestriction() {
        return restriction;
    }

    /**
     * Legt den Wert der restriction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Restriction }
     *     
     */
    public void setRestriction(Restriction value) {
        this.restriction = value;
    }

    /**
     * Ruft den Wert der settings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Settings }
     *     
     */
    public Settings getSettings() {
        return settings;
    }

    /**
     * Legt den Wert der settings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Settings }
     *     
     */
    public void setSettings(Settings value) {
        this.settings = value;
    }

}
