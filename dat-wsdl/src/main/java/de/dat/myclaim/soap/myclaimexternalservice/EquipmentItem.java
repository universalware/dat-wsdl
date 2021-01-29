
package de.dat.myclaim.soap.myclaimexternalservice;

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
 *         &lt;element name="EquipmentId" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="EquipmentDescription" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="EquipmentOrderNumber" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
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
    "equipmentId",
    "equipmentDescription",
    "equipmentOrderNumber"
})
@XmlRootElement(name = "EquipmentItem")
public class EquipmentItem {

    @XmlElement(name = "EquipmentId")
    protected FieldString equipmentId;
    @XmlElement(name = "EquipmentDescription")
    protected FieldInteger equipmentDescription;
    @XmlElement(name = "EquipmentOrderNumber")
    protected FieldInteger equipmentOrderNumber;

    /**
     * Ruft den Wert der equipmentId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getEquipmentId() {
        return equipmentId;
    }

    /**
     * Legt den Wert der equipmentId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setEquipmentId(FieldString value) {
        this.equipmentId = value;
    }

    /**
     * Ruft den Wert der equipmentDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getEquipmentDescription() {
        return equipmentDescription;
    }

    /**
     * Legt den Wert der equipmentDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setEquipmentDescription(FieldInteger value) {
        this.equipmentDescription = value;
    }

    /**
     * Ruft den Wert der equipmentOrderNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getEquipmentOrderNumber() {
        return equipmentOrderNumber;
    }

    /**
     * Legt den Wert der equipmentOrderNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setEquipmentOrderNumber(FieldInteger value) {
        this.equipmentOrderNumber = value;
    }

}
