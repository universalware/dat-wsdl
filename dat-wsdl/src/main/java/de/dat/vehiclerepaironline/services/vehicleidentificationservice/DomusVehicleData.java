
package de.dat.vehiclerepaironline.services.vehicleidentificationservice;

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
 *         &lt;element name="DomusVehicleType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DomusManufacturer" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DomusBaseModel" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DomusSubModel" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DomusVehicleTypeName" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DomusManufacturerName" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DomusBaseModelName" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DomusSubModelName" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "DomusVehicleData")
public class DomusVehicleData {

    @XmlElement(name = "DomusVehicleType")
    protected FieldString domusVehicleType;
    @XmlElement(name = "DomusManufacturer")
    protected FieldString domusManufacturer;
    @XmlElement(name = "DomusBaseModel")
    protected FieldString domusBaseModel;
    @XmlElement(name = "DomusSubModel")
    protected FieldString domusSubModel;
    @XmlElement(name = "DomusVehicleTypeName")
    protected FieldString domusVehicleTypeName;
    @XmlElement(name = "DomusManufacturerName")
    protected FieldString domusManufacturerName;
    @XmlElement(name = "DomusBaseModelName")
    protected FieldString domusBaseModelName;
    @XmlElement(name = "DomusSubModelName")
    protected FieldString domusSubModelName;

    /**
     * Ruft den Wert der domusVehicleType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDomusVehicleType() {
        return domusVehicleType;
    }

    /**
     * Legt den Wert der domusVehicleType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDomusVehicleType(FieldString value) {
        this.domusVehicleType = value;
    }

    /**
     * Ruft den Wert der domusManufacturer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDomusManufacturer() {
        return domusManufacturer;
    }

    /**
     * Legt den Wert der domusManufacturer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDomusManufacturer(FieldString value) {
        this.domusManufacturer = value;
    }

    /**
     * Ruft den Wert der domusBaseModel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDomusBaseModel() {
        return domusBaseModel;
    }

    /**
     * Legt den Wert der domusBaseModel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDomusBaseModel(FieldString value) {
        this.domusBaseModel = value;
    }

    /**
     * Ruft den Wert der domusSubModel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDomusSubModel() {
        return domusSubModel;
    }

    /**
     * Legt den Wert der domusSubModel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDomusSubModel(FieldString value) {
        this.domusSubModel = value;
    }

    /**
     * Ruft den Wert der domusVehicleTypeName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDomusVehicleTypeName() {
        return domusVehicleTypeName;
    }

    /**
     * Legt den Wert der domusVehicleTypeName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDomusVehicleTypeName(FieldString value) {
        this.domusVehicleTypeName = value;
    }

    /**
     * Ruft den Wert der domusManufacturerName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDomusManufacturerName() {
        return domusManufacturerName;
    }

    /**
     * Legt den Wert der domusManufacturerName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDomusManufacturerName(FieldString value) {
        this.domusManufacturerName = value;
    }

    /**
     * Ruft den Wert der domusBaseModelName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDomusBaseModelName() {
        return domusBaseModelName;
    }

    /**
     * Legt den Wert der domusBaseModelName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDomusBaseModelName(FieldString value) {
        this.domusBaseModelName = value;
    }

    /**
     * Ruft den Wert der domusSubModelName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDomusSubModelName() {
        return domusSubModelName;
    }

    /**
     * Legt den Wert der domusSubModelName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDomusSubModelName(FieldString value) {
        this.domusSubModelName = value;
    }

}
