
package de.dat.glassrep.services.dmsgetcontracts;

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
 *         &lt;element name="WageUnitsPerHour" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="Mechanic1" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Mechanic2" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Mechanic3" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Mechanic4" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="CarBody1" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="CarBody2" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="CarBody3" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="CarBody4" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Electric1" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Electric2" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Electric3" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Electric4" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Interior1" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Interior2" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Interior3" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Interior4" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Lacquer" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerWithMaterial" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerFree" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Dents" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Comprehensive1" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Comprehensive2" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Comprehensive3" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Comprehensive4" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "RepairWages")
public class RepairWages {

    @XmlElement(name = "WageUnitsPerHour")
    protected FieldInteger wageUnitsPerHour;
    @XmlElement(name = "Mechanic1")
    protected FieldDecimal mechanic1;
    @XmlElement(name = "Mechanic2")
    protected FieldDecimal mechanic2;
    @XmlElement(name = "Mechanic3")
    protected FieldDecimal mechanic3;
    @XmlElement(name = "Mechanic4")
    protected FieldDecimal mechanic4;
    @XmlElement(name = "CarBody1")
    protected FieldDecimal carBody1;
    @XmlElement(name = "CarBody2")
    protected FieldDecimal carBody2;
    @XmlElement(name = "CarBody3")
    protected FieldDecimal carBody3;
    @XmlElement(name = "CarBody4")
    protected FieldDecimal carBody4;
    @XmlElement(name = "Electric1")
    protected FieldDecimal electric1;
    @XmlElement(name = "Electric2")
    protected FieldDecimal electric2;
    @XmlElement(name = "Electric3")
    protected FieldDecimal electric3;
    @XmlElement(name = "Electric4")
    protected FieldDecimal electric4;
    @XmlElement(name = "Interior1")
    protected FieldDecimal interior1;
    @XmlElement(name = "Interior2")
    protected FieldDecimal interior2;
    @XmlElement(name = "Interior3")
    protected FieldDecimal interior3;
    @XmlElement(name = "Interior4")
    protected FieldDecimal interior4;
    @XmlElement(name = "Lacquer")
    protected FieldDecimal lacquer;
    @XmlElement(name = "LacquerWithMaterial")
    protected FieldDecimal lacquerWithMaterial;
    @XmlElement(name = "LacquerFree")
    protected FieldDecimal lacquerFree;
    @XmlElement(name = "Dents")
    protected FieldDecimal dents;
    @XmlElement(name = "Comprehensive1")
    protected FieldDecimal comprehensive1;
    @XmlElement(name = "Comprehensive2")
    protected FieldDecimal comprehensive2;
    @XmlElement(name = "Comprehensive3")
    protected FieldDecimal comprehensive3;
    @XmlElement(name = "Comprehensive4")
    protected FieldDecimal comprehensive4;

    /**
     * Ruft den Wert der wageUnitsPerHour-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getWageUnitsPerHour() {
        return wageUnitsPerHour;
    }

    /**
     * Legt den Wert der wageUnitsPerHour-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setWageUnitsPerHour(FieldInteger value) {
        this.wageUnitsPerHour = value;
    }

    /**
     * Ruft den Wert der mechanic1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getMechanic1() {
        return mechanic1;
    }

    /**
     * Legt den Wert der mechanic1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setMechanic1(FieldDecimal value) {
        this.mechanic1 = value;
    }

    /**
     * Ruft den Wert der mechanic2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getMechanic2() {
        return mechanic2;
    }

    /**
     * Legt den Wert der mechanic2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setMechanic2(FieldDecimal value) {
        this.mechanic2 = value;
    }

    /**
     * Ruft den Wert der mechanic3-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getMechanic3() {
        return mechanic3;
    }

    /**
     * Legt den Wert der mechanic3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setMechanic3(FieldDecimal value) {
        this.mechanic3 = value;
    }

    /**
     * Ruft den Wert der mechanic4-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getMechanic4() {
        return mechanic4;
    }

    /**
     * Legt den Wert der mechanic4-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setMechanic4(FieldDecimal value) {
        this.mechanic4 = value;
    }

    /**
     * Ruft den Wert der carBody1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getCarBody1() {
        return carBody1;
    }

    /**
     * Legt den Wert der carBody1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setCarBody1(FieldDecimal value) {
        this.carBody1 = value;
    }

    /**
     * Ruft den Wert der carBody2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getCarBody2() {
        return carBody2;
    }

    /**
     * Legt den Wert der carBody2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setCarBody2(FieldDecimal value) {
        this.carBody2 = value;
    }

    /**
     * Ruft den Wert der carBody3-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getCarBody3() {
        return carBody3;
    }

    /**
     * Legt den Wert der carBody3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setCarBody3(FieldDecimal value) {
        this.carBody3 = value;
    }

    /**
     * Ruft den Wert der carBody4-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getCarBody4() {
        return carBody4;
    }

    /**
     * Legt den Wert der carBody4-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setCarBody4(FieldDecimal value) {
        this.carBody4 = value;
    }

    /**
     * Ruft den Wert der electric1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getElectric1() {
        return electric1;
    }

    /**
     * Legt den Wert der electric1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setElectric1(FieldDecimal value) {
        this.electric1 = value;
    }

    /**
     * Ruft den Wert der electric2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getElectric2() {
        return electric2;
    }

    /**
     * Legt den Wert der electric2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setElectric2(FieldDecimal value) {
        this.electric2 = value;
    }

    /**
     * Ruft den Wert der electric3-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getElectric3() {
        return electric3;
    }

    /**
     * Legt den Wert der electric3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setElectric3(FieldDecimal value) {
        this.electric3 = value;
    }

    /**
     * Ruft den Wert der electric4-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getElectric4() {
        return electric4;
    }

    /**
     * Legt den Wert der electric4-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setElectric4(FieldDecimal value) {
        this.electric4 = value;
    }

    /**
     * Ruft den Wert der interior1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getInterior1() {
        return interior1;
    }

    /**
     * Legt den Wert der interior1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setInterior1(FieldDecimal value) {
        this.interior1 = value;
    }

    /**
     * Ruft den Wert der interior2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getInterior2() {
        return interior2;
    }

    /**
     * Legt den Wert der interior2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setInterior2(FieldDecimal value) {
        this.interior2 = value;
    }

    /**
     * Ruft den Wert der interior3-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getInterior3() {
        return interior3;
    }

    /**
     * Legt den Wert der interior3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setInterior3(FieldDecimal value) {
        this.interior3 = value;
    }

    /**
     * Ruft den Wert der interior4-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getInterior4() {
        return interior4;
    }

    /**
     * Legt den Wert der interior4-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setInterior4(FieldDecimal value) {
        this.interior4 = value;
    }

    /**
     * Ruft den Wert der lacquer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquer() {
        return lacquer;
    }

    /**
     * Legt den Wert der lacquer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquer(FieldDecimal value) {
        this.lacquer = value;
    }

    /**
     * Ruft den Wert der lacquerWithMaterial-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerWithMaterial() {
        return lacquerWithMaterial;
    }

    /**
     * Legt den Wert der lacquerWithMaterial-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerWithMaterial(FieldDecimal value) {
        this.lacquerWithMaterial = value;
    }

    /**
     * Ruft den Wert der lacquerFree-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerFree() {
        return lacquerFree;
    }

    /**
     * Legt den Wert der lacquerFree-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerFree(FieldDecimal value) {
        this.lacquerFree = value;
    }

    /**
     * Ruft den Wert der dents-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDents() {
        return dents;
    }

    /**
     * Legt den Wert der dents-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDents(FieldDecimal value) {
        this.dents = value;
    }

    /**
     * Ruft den Wert der comprehensive1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getComprehensive1() {
        return comprehensive1;
    }

    /**
     * Legt den Wert der comprehensive1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setComprehensive1(FieldDecimal value) {
        this.comprehensive1 = value;
    }

    /**
     * Ruft den Wert der comprehensive2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getComprehensive2() {
        return comprehensive2;
    }

    /**
     * Legt den Wert der comprehensive2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setComprehensive2(FieldDecimal value) {
        this.comprehensive2 = value;
    }

    /**
     * Ruft den Wert der comprehensive3-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getComprehensive3() {
        return comprehensive3;
    }

    /**
     * Legt den Wert der comprehensive3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setComprehensive3(FieldDecimal value) {
        this.comprehensive3 = value;
    }

    /**
     * Ruft den Wert der comprehensive4-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getComprehensive4() {
        return comprehensive4;
    }

    /**
     * Legt den Wert der comprehensive4-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setComprehensive4(FieldDecimal value) {
        this.comprehensive4 = value;
    }

}
