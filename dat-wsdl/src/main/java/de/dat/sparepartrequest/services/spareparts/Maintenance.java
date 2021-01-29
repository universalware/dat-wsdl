
package de.dat.sparepartrequest.services.spareparts;

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
 *         &lt;element name="LastServiceKilometer" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="LastServiceDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="NextServiceKilometer" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="NextServiceDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="NextEmissionCheck" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="NextVehicleInspection" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="NextSecurityCheck" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "Maintenance")
public class Maintenance {

    @XmlElement(name = "LastServiceKilometer")
    protected FieldInteger lastServiceKilometer;
    @XmlElement(name = "LastServiceDate")
    protected FieldDate lastServiceDate;
    @XmlElement(name = "NextServiceKilometer")
    protected FieldInteger nextServiceKilometer;
    @XmlElement(name = "NextServiceDate")
    protected FieldDate nextServiceDate;
    @XmlElement(name = "NextEmissionCheck")
    protected FieldDate nextEmissionCheck;
    @XmlElement(name = "NextVehicleInspection")
    protected FieldDate nextVehicleInspection;
    @XmlElement(name = "NextSecurityCheck")
    protected FieldDate nextSecurityCheck;

    /**
     * Ruft den Wert der lastServiceKilometer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLastServiceKilometer() {
        return lastServiceKilometer;
    }

    /**
     * Legt den Wert der lastServiceKilometer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLastServiceKilometer(FieldInteger value) {
        this.lastServiceKilometer = value;
    }

    /**
     * Ruft den Wert der lastServiceDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getLastServiceDate() {
        return lastServiceDate;
    }

    /**
     * Legt den Wert der lastServiceDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setLastServiceDate(FieldDate value) {
        this.lastServiceDate = value;
    }

    /**
     * Ruft den Wert der nextServiceKilometer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getNextServiceKilometer() {
        return nextServiceKilometer;
    }

    /**
     * Legt den Wert der nextServiceKilometer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setNextServiceKilometer(FieldInteger value) {
        this.nextServiceKilometer = value;
    }

    /**
     * Ruft den Wert der nextServiceDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getNextServiceDate() {
        return nextServiceDate;
    }

    /**
     * Legt den Wert der nextServiceDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setNextServiceDate(FieldDate value) {
        this.nextServiceDate = value;
    }

    /**
     * Ruft den Wert der nextEmissionCheck-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getNextEmissionCheck() {
        return nextEmissionCheck;
    }

    /**
     * Legt den Wert der nextEmissionCheck-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setNextEmissionCheck(FieldDate value) {
        this.nextEmissionCheck = value;
    }

    /**
     * Ruft den Wert der nextVehicleInspection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getNextVehicleInspection() {
        return nextVehicleInspection;
    }

    /**
     * Legt den Wert der nextVehicleInspection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setNextVehicleInspection(FieldDate value) {
        this.nextVehicleInspection = value;
    }

    /**
     * Ruft den Wert der nextSecurityCheck-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getNextSecurityCheck() {
        return nextSecurityCheck;
    }

    /**
     * Legt den Wert der nextSecurityCheck-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setNextSecurityCheck(FieldDate value) {
        this.nextSecurityCheck = value;
    }

}
