
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dpnMaterialPosition complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dpnMaterialPosition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="equipment" type="{http://sphinx.dat.de/services/VehicleRepairService}equipment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="materialPosition" type="{http://sphinx.dat.de/services/VehicleRepairService}materialPositionData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dpnMaterialPosition", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "equipment",
    "materialPosition"
})
public class DpnMaterialPosition {

    @XmlElement(namespace = "", nillable = true)
    protected List<Equipment2> equipment;
    @XmlElementRef(name = "materialPosition", type = JAXBElement.class, required = false)
    protected JAXBElement<MaterialPositionData> materialPosition;

    /**
     * Gets the value of the equipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Equipment2 }
     * 
     * 
     */
    public List<Equipment2> getEquipment() {
        if (equipment == null) {
            equipment = new ArrayList<Equipment2>();
        }
        return this.equipment;
    }

    /**
     * Ruft den Wert der materialPosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MaterialPositionData }{@code >}
     *     
     */
    public JAXBElement<MaterialPositionData> getMaterialPosition() {
        return materialPosition;
    }

    /**
     * Legt den Wert der materialPosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MaterialPositionData }{@code >}
     *     
     */
    public void setMaterialPosition(JAXBElement<MaterialPositionData> value) {
        this.materialPosition = value;
    }

}
