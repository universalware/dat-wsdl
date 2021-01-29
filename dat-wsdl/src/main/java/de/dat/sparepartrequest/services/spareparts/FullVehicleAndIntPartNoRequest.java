
package de.dat.sparepartrequest.services.spareparts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für fullVehicleAndIntPartNoRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="fullVehicleAndIntPartNoRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/SpareParts}ecodeAndIntPartNoRequest">
 *       &lt;sequence>
 *         &lt;element name="contructionTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="equipment" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fullVehicleAndIntPartNoRequest", namespace = "http://sphinx.dat.de/services/SpareParts", propOrder = {
    "contructionTime",
    "equipment"
})
public class FullVehicleAndIntPartNoRequest
    extends EcodeAndIntPartNoRequest
{

    @XmlElement(namespace = "")
    protected int contructionTime;
    @XmlElement(namespace = "", nillable = true)
    protected List<Long> equipment;

    /**
     * Ruft den Wert der contructionTime-Eigenschaft ab.
     * 
     */
    public int getContructionTime() {
        return contructionTime;
    }

    /**
     * Legt den Wert der contructionTime-Eigenschaft fest.
     * 
     */
    public void setContructionTime(int value) {
        this.contructionTime = value;
    }

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
     * {@link Long }
     * 
     * 
     */
    public List<Long> getEquipment() {
        if (equipment == null) {
            equipment = new ArrayList<Long>();
        }
        return this.equipment;
    }

}
