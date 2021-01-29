
package de.dat.vehiclerepaironline.services.conversionfunctionsservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für valueCodeDescription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="valueCodeDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ECodeEquipments" type="{http://sphinx.dat.de/services/ConversionFunctionsService}equipment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="baseModelLabeling" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="containerLabeling" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="manufacturerLabeling" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="subModelLabeling" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vehicleTypeLabeling" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valueCodeDescription", namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", propOrder = {
    "eCodeEquipments"
})
public class ValueCodeDescription {

    @XmlElement(name = "ECodeEquipments", namespace = "", nillable = true)
    protected List<Equipment> eCodeEquipments;
    @XmlAttribute(name = "baseModelLabeling", required = true)
    protected String baseModelLabeling;
    @XmlAttribute(name = "containerLabeling", required = true)
    protected String containerLabeling;
    @XmlAttribute(name = "manufacturerLabeling", required = true)
    protected String manufacturerLabeling;
    @XmlAttribute(name = "subModelLabeling", required = true)
    protected String subModelLabeling;
    @XmlAttribute(name = "vehicleTypeLabeling", required = true)
    protected String vehicleTypeLabeling;

    /**
     * Gets the value of the eCodeEquipments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eCodeEquipments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getECodeEquipments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Equipment }
     * 
     * 
     */
    public List<Equipment> getECodeEquipments() {
        if (eCodeEquipments == null) {
            eCodeEquipments = new ArrayList<Equipment>();
        }
        return this.eCodeEquipments;
    }

    /**
     * Ruft den Wert der baseModelLabeling-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseModelLabeling() {
        return baseModelLabeling;
    }

    /**
     * Legt den Wert der baseModelLabeling-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseModelLabeling(String value) {
        this.baseModelLabeling = value;
    }

    /**
     * Ruft den Wert der containerLabeling-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerLabeling() {
        return containerLabeling;
    }

    /**
     * Legt den Wert der containerLabeling-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerLabeling(String value) {
        this.containerLabeling = value;
    }

    /**
     * Ruft den Wert der manufacturerLabeling-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerLabeling() {
        return manufacturerLabeling;
    }

    /**
     * Legt den Wert der manufacturerLabeling-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerLabeling(String value) {
        this.manufacturerLabeling = value;
    }

    /**
     * Ruft den Wert der subModelLabeling-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubModelLabeling() {
        return subModelLabeling;
    }

    /**
     * Legt den Wert der subModelLabeling-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubModelLabeling(String value) {
        this.subModelLabeling = value;
    }

    /**
     * Ruft den Wert der vehicleTypeLabeling-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleTypeLabeling() {
        return vehicleTypeLabeling;
    }

    /**
     * Legt den Wert der vehicleTypeLabeling-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleTypeLabeling(String value) {
        this.vehicleTypeLabeling = value;
    }

}
