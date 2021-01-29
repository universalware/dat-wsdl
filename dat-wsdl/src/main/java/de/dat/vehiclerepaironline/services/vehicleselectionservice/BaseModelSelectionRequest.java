
package de.dat.vehiclerepaironline.services.vehicleselectionservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für baseModelSelectionRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="baseModelSelectionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/VehicleSelectionService}manufacturerSelectionRequest">
 *       &lt;sequence>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="withRepairIncomplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseModelSelectionRequest", namespace = "http://sphinx.dat.de/services/VehicleSelectionService", propOrder = {
    "manufacturer",
    "withRepairIncomplete"
})
@XmlSeeAlso({
    SubModelSelectionRequest.class
})
public class BaseModelSelectionRequest
    extends ManufacturerSelectionRequest
{

    @XmlElement(namespace = "")
    protected int manufacturer;
    @XmlElementRef(name = "withRepairIncomplete", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> withRepairIncomplete;

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
     * Ruft den Wert der withRepairIncomplete-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getWithRepairIncomplete() {
        return withRepairIncomplete;
    }

    /**
     * Legt den Wert der withRepairIncomplete-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setWithRepairIncomplete(JAXBElement<Boolean> value) {
        this.withRepairIncomplete = value;
    }

}
