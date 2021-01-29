
package de.dat.datecodeselection.services.vehicleselectionservice;

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
 *         &lt;element name="MasterDataGroupId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="GroupDescription" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}EquipmentList" minOccurs="0"/>
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
    "masterDataGroupId",
    "groupDescription",
    "equipmentList"
})
@XmlRootElement(name = "EquipmentGroupItem")
public class EquipmentGroupItem {

    @XmlElement(name = "MasterDataGroupId")
    protected FieldInteger masterDataGroupId;
    @XmlElement(name = "GroupDescription")
    protected FieldString groupDescription;
    @XmlElement(name = "EquipmentList")
    protected EquipmentList equipmentList;

    /**
     * Ruft den Wert der masterDataGroupId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getMasterDataGroupId() {
        return masterDataGroupId;
    }

    /**
     * Legt den Wert der masterDataGroupId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setMasterDataGroupId(FieldInteger value) {
        this.masterDataGroupId = value;
    }

    /**
     * Ruft den Wert der groupDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getGroupDescription() {
        return groupDescription;
    }

    /**
     * Legt den Wert der groupDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setGroupDescription(FieldString value) {
        this.groupDescription = value;
    }

    /**
     * Ruft den Wert der equipmentList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentList }
     *     
     */
    public EquipmentList getEquipmentList() {
        return equipmentList;
    }

    /**
     * Legt den Wert der equipmentList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentList }
     *     
     */
    public void setEquipmentList(EquipmentList value) {
        this.equipmentList = value;
    }

}
