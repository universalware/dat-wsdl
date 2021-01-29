
package de.dat.vehiclerepaironline.services.vehicleselectionservice;

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
 *       &lt;all>
 *         &lt;element name="VinInterfaceVersion" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}VINECodes" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}VINEquipments" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}VINColors" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}VINVehicle" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "VINResult")
public class VINResult {

    @XmlElement(name = "VinInterfaceVersion")
    protected FieldString vinInterfaceVersion;
    @XmlElement(name = "VINECodes")
    protected VINECodes vineCodes;
    @XmlElement(name = "VINEquipments")
    protected VINEquipments vinEquipments;
    @XmlElement(name = "VINColors")
    protected VINColors vinColors;
    @XmlElement(name = "VINVehicle")
    protected VINVehicle vinVehicle;

    /**
     * Ruft den Wert der vinInterfaceVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getVinInterfaceVersion() {
        return vinInterfaceVersion;
    }

    /**
     * Legt den Wert der vinInterfaceVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setVinInterfaceVersion(FieldString value) {
        this.vinInterfaceVersion = value;
    }

    /**
     * Ruft den Wert der vineCodes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VINECodes }
     *     
     */
    public VINECodes getVINECodes() {
        return vineCodes;
    }

    /**
     * Legt den Wert der vineCodes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VINECodes }
     *     
     */
    public void setVINECodes(VINECodes value) {
        this.vineCodes = value;
    }

    /**
     * Ruft den Wert der vinEquipments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VINEquipments }
     *     
     */
    public VINEquipments getVINEquipments() {
        return vinEquipments;
    }

    /**
     * Legt den Wert der vinEquipments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VINEquipments }
     *     
     */
    public void setVINEquipments(VINEquipments value) {
        this.vinEquipments = value;
    }

    /**
     * Ruft den Wert der vinColors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VINColors }
     *     
     */
    public VINColors getVINColors() {
        return vinColors;
    }

    /**
     * Legt den Wert der vinColors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VINColors }
     *     
     */
    public void setVINColors(VINColors value) {
        this.vinColors = value;
    }

    /**
     * Ruft den Wert der vinVehicle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VINVehicle }
     *     
     */
    public VINVehicle getVINVehicle() {
        return vinVehicle;
    }

    /**
     * Legt den Wert der vinVehicle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VINVehicle }
     *     
     */
    public void setVINVehicle(VINVehicle value) {
        this.vinVehicle = value;
    }

}
