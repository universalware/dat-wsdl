
package de.dat.glassrep.services.vehicleselectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für baseModelResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="baseModelResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="alternativeBaseType" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="alternativeManufacturer" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="alternativeVehicleType" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="key" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="repairIncomplete" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseModelResult", namespace = "http://sphinx.dat.de/services/VehicleSelectionService")
public class BaseModelResult {

    @XmlAttribute(name = "alternativeBaseType")
    protected Integer alternativeBaseType;
    @XmlAttribute(name = "alternativeManufacturer")
    protected Integer alternativeManufacturer;
    @XmlAttribute(name = "alternativeVehicleType")
    protected Integer alternativeVehicleType;
    @XmlAttribute(name = "key", required = true)
    protected int key;
    @XmlAttribute(name = "repairIncomplete")
    protected Boolean repairIncomplete;
    @XmlAttribute(name = "value", required = true)
    protected String value;

    /**
     * Ruft den Wert der alternativeBaseType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAlternativeBaseType() {
        return alternativeBaseType;
    }

    /**
     * Legt den Wert der alternativeBaseType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAlternativeBaseType(Integer value) {
        this.alternativeBaseType = value;
    }

    /**
     * Ruft den Wert der alternativeManufacturer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAlternativeManufacturer() {
        return alternativeManufacturer;
    }

    /**
     * Legt den Wert der alternativeManufacturer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAlternativeManufacturer(Integer value) {
        this.alternativeManufacturer = value;
    }

    /**
     * Ruft den Wert der alternativeVehicleType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAlternativeVehicleType() {
        return alternativeVehicleType;
    }

    /**
     * Legt den Wert der alternativeVehicleType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAlternativeVehicleType(Integer value) {
        this.alternativeVehicleType = value;
    }

    /**
     * Ruft den Wert der key-Eigenschaft ab.
     * 
     */
    public int getKey() {
        return key;
    }

    /**
     * Legt den Wert der key-Eigenschaft fest.
     * 
     */
    public void setKey(int value) {
        this.key = value;
    }

    /**
     * Ruft den Wert der repairIncomplete-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRepairIncomplete() {
        return repairIncomplete;
    }

    /**
     * Legt den Wert der repairIncomplete-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepairIncomplete(Boolean value) {
        this.repairIncomplete = value;
    }

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
