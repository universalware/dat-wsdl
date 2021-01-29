
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
 *         &lt;element name="VehicleTypeItaly" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManufacturerItaly" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="BaseModelItaly" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="SubModelItaly" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="VehicleTypeNameItaly" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManufacturerNameItaly" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="BaseModelNameItaly" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="SubModelNameItaly" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "VehicleDataItaly")
public class VehicleDataItaly {

    @XmlElement(name = "VehicleTypeItaly")
    protected FieldString vehicleTypeItaly;
    @XmlElement(name = "ManufacturerItaly")
    protected FieldString manufacturerItaly;
    @XmlElement(name = "BaseModelItaly")
    protected FieldString baseModelItaly;
    @XmlElement(name = "SubModelItaly")
    protected FieldString subModelItaly;
    @XmlElement(name = "VehicleTypeNameItaly")
    protected FieldString vehicleTypeNameItaly;
    @XmlElement(name = "ManufacturerNameItaly")
    protected FieldString manufacturerNameItaly;
    @XmlElement(name = "BaseModelNameItaly")
    protected FieldString baseModelNameItaly;
    @XmlElement(name = "SubModelNameItaly")
    protected FieldString subModelNameItaly;

    /**
     * Ruft den Wert der vehicleTypeItaly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getVehicleTypeItaly() {
        return vehicleTypeItaly;
    }

    /**
     * Legt den Wert der vehicleTypeItaly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setVehicleTypeItaly(FieldString value) {
        this.vehicleTypeItaly = value;
    }

    /**
     * Ruft den Wert der manufacturerItaly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getManufacturerItaly() {
        return manufacturerItaly;
    }

    /**
     * Legt den Wert der manufacturerItaly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setManufacturerItaly(FieldString value) {
        this.manufacturerItaly = value;
    }

    /**
     * Ruft den Wert der baseModelItaly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getBaseModelItaly() {
        return baseModelItaly;
    }

    /**
     * Legt den Wert der baseModelItaly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setBaseModelItaly(FieldString value) {
        this.baseModelItaly = value;
    }

    /**
     * Ruft den Wert der subModelItaly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSubModelItaly() {
        return subModelItaly;
    }

    /**
     * Legt den Wert der subModelItaly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSubModelItaly(FieldString value) {
        this.subModelItaly = value;
    }

    /**
     * Ruft den Wert der vehicleTypeNameItaly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getVehicleTypeNameItaly() {
        return vehicleTypeNameItaly;
    }

    /**
     * Legt den Wert der vehicleTypeNameItaly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setVehicleTypeNameItaly(FieldString value) {
        this.vehicleTypeNameItaly = value;
    }

    /**
     * Ruft den Wert der manufacturerNameItaly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getManufacturerNameItaly() {
        return manufacturerNameItaly;
    }

    /**
     * Legt den Wert der manufacturerNameItaly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setManufacturerNameItaly(FieldString value) {
        this.manufacturerNameItaly = value;
    }

    /**
     * Ruft den Wert der baseModelNameItaly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getBaseModelNameItaly() {
        return baseModelNameItaly;
    }

    /**
     * Legt den Wert der baseModelNameItaly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setBaseModelNameItaly(FieldString value) {
        this.baseModelNameItaly = value;
    }

    /**
     * Ruft den Wert der subModelNameItaly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSubModelNameItaly() {
        return subModelNameItaly;
    }

    /**
     * Legt den Wert der subModelNameItaly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSubModelNameItaly(FieldString value) {
        this.subModelNameItaly = value;
    }

}
