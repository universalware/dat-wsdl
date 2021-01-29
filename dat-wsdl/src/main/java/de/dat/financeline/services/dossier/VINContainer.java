
package de.dat.financeline.services.dossier;

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
 *         &lt;element name="Container" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="VehicleTypeKey" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManufacturerKey" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="VehicleMainTypeKey" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="VehicleSubTypeKey" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="VehicleConstructionTime" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "VINContainer")
public class VINContainer {

    @XmlElement(name = "Container")
    protected FieldString container;
    @XmlElement(name = "VehicleTypeKey")
    protected FieldInteger vehicleTypeKey;
    @XmlElement(name = "ManufacturerKey")
    protected FieldInteger manufacturerKey;
    @XmlElement(name = "VehicleMainTypeKey")
    protected FieldInteger vehicleMainTypeKey;
    @XmlElement(name = "VehicleSubTypeKey")
    protected FieldInteger vehicleSubTypeKey;
    @XmlElement(name = "VehicleConstructionTime")
    protected FieldInteger vehicleConstructionTime;

    /**
     * Ruft den Wert der container-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getContainer() {
        return container;
    }

    /**
     * Legt den Wert der container-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setContainer(FieldString value) {
        this.container = value;
    }

    /**
     * Ruft den Wert der vehicleTypeKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getVehicleTypeKey() {
        return vehicleTypeKey;
    }

    /**
     * Legt den Wert der vehicleTypeKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setVehicleTypeKey(FieldInteger value) {
        this.vehicleTypeKey = value;
    }

    /**
     * Ruft den Wert der manufacturerKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getManufacturerKey() {
        return manufacturerKey;
    }

    /**
     * Legt den Wert der manufacturerKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setManufacturerKey(FieldInteger value) {
        this.manufacturerKey = value;
    }

    /**
     * Ruft den Wert der vehicleMainTypeKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getVehicleMainTypeKey() {
        return vehicleMainTypeKey;
    }

    /**
     * Legt den Wert der vehicleMainTypeKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setVehicleMainTypeKey(FieldInteger value) {
        this.vehicleMainTypeKey = value;
    }

    /**
     * Ruft den Wert der vehicleSubTypeKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getVehicleSubTypeKey() {
        return vehicleSubTypeKey;
    }

    /**
     * Legt den Wert der vehicleSubTypeKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setVehicleSubTypeKey(FieldInteger value) {
        this.vehicleSubTypeKey = value;
    }

    /**
     * Ruft den Wert der vehicleConstructionTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getVehicleConstructionTime() {
        return vehicleConstructionTime;
    }

    /**
     * Legt den Wert der vehicleConstructionTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setVehicleConstructionTime(FieldInteger value) {
        this.vehicleConstructionTime = value;
    }

}
