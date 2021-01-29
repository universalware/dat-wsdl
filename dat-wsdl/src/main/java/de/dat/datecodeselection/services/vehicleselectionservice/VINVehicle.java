
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
 *       &lt;all>
 *         &lt;element ref="{http://www.dat.de/vxs}VINumber"/>
 *         &lt;element name="ManufacturerCarCode" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManufacturerEngineCode" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManufacturerTransmissionCode" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "VINVehicle")
public class VINVehicle {

    @XmlElement(name = "VINumber", required = true)
    protected VINumber viNumber;
    @XmlElement(name = "ManufacturerCarCode")
    protected FieldString manufacturerCarCode;
    @XmlElement(name = "ManufacturerEngineCode")
    protected FieldString manufacturerEngineCode;
    @XmlElement(name = "ManufacturerTransmissionCode")
    protected FieldString manufacturerTransmissionCode;

    /**
     * Ruft den Wert der viNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VINumber }
     *     
     */
    public VINumber getVINumber() {
        return viNumber;
    }

    /**
     * Legt den Wert der viNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VINumber }
     *     
     */
    public void setVINumber(VINumber value) {
        this.viNumber = value;
    }

    /**
     * Ruft den Wert der manufacturerCarCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getManufacturerCarCode() {
        return manufacturerCarCode;
    }

    /**
     * Legt den Wert der manufacturerCarCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setManufacturerCarCode(FieldString value) {
        this.manufacturerCarCode = value;
    }

    /**
     * Ruft den Wert der manufacturerEngineCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getManufacturerEngineCode() {
        return manufacturerEngineCode;
    }

    /**
     * Legt den Wert der manufacturerEngineCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setManufacturerEngineCode(FieldString value) {
        this.manufacturerEngineCode = value;
    }

    /**
     * Ruft den Wert der manufacturerTransmissionCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getManufacturerTransmissionCode() {
        return manufacturerTransmissionCode;
    }

    /**
     * Legt den Wert der manufacturerTransmissionCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setManufacturerTransmissionCode(FieldString value) {
        this.manufacturerTransmissionCode = value;
    }

}
