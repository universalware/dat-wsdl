
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für datProcessInfoEquipments complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="datProcessInfoEquipments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datProcessId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="equipments" type="{http://sphinx.dat.de/services/VehicleRepairService}equipment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datProcessInfoEquipments", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "datProcessId",
    "equipments"
})
public class DatProcessInfoEquipments {

    @XmlElement(namespace = "")
    protected Integer datProcessId;
    @XmlElement(namespace = "")
    protected List<Equipment2> equipments;

    /**
     * Ruft den Wert der datProcessId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatProcessId() {
        return datProcessId;
    }

    /**
     * Legt den Wert der datProcessId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatProcessId(Integer value) {
        this.datProcessId = value;
    }

    /**
     * Gets the value of the equipments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Equipment2 }
     * 
     * 
     */
    public List<Equipment2> getEquipments() {
        if (equipments == null) {
            equipments = new ArrayList<Equipment2>();
        }
        return this.equipments;
    }

}
