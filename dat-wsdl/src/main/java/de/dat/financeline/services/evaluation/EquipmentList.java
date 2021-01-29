
package de.dat.financeline.services.evaluation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dat.de/vxs}EquipmentItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}EquipmentItemN" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "equipmentItem",
    "equipmentItemN"
})
@XmlRootElement(name = "EquipmentList")
public class EquipmentList {

    @XmlElement(name = "EquipmentItem")
    protected List<EquipmentItem> equipmentItem;
    @XmlElement(name = "EquipmentItemN")
    protected List<EquipmentItemN> equipmentItemN;

    /**
     * Gets the value of the equipmentItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentItem }
     * 
     * 
     */
    public List<EquipmentItem> getEquipmentItem() {
        if (equipmentItem == null) {
            equipmentItem = new ArrayList<EquipmentItem>();
        }
        return this.equipmentItem;
    }

    /**
     * Gets the value of the equipmentItemN property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentItemN property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentItemN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentItemN }
     * 
     * 
     */
    public List<EquipmentItemN> getEquipmentItemN() {
        if (equipmentItemN == null) {
            equipmentItemN = new ArrayList<EquipmentItemN>();
        }
        return this.equipmentItemN;
    }

}
