
package de.dat.myclaim.soap.myclaimexternalservice;

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
 *         &lt;element name="DomusProcessId" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Description" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Location" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkTimeReplace" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkTimeOverhaul" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkTimeLacquer" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkAmountReplace" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkAmountOverhaul" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkAmountLacquer" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ValueTotal" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}DomusAggregateComponents" minOccurs="0"/>
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
@XmlRootElement(name = "DomusAggregate")
public class DomusAggregate {

    @XmlElement(name = "DomusProcessId")
    protected FieldString domusProcessId;
    @XmlElement(name = "Description")
    protected FieldString description;
    @XmlElement(name = "Location")
    protected FieldString location;
    @XmlElement(name = "WorkTimeReplace")
    protected FieldDecimal workTimeReplace;
    @XmlElement(name = "WorkTimeOverhaul")
    protected FieldDecimal workTimeOverhaul;
    @XmlElement(name = "WorkTimeLacquer")
    protected FieldDecimal workTimeLacquer;
    @XmlElement(name = "WorkAmountReplace")
    protected FieldDecimal workAmountReplace;
    @XmlElement(name = "WorkAmountOverhaul")
    protected FieldDecimal workAmountOverhaul;
    @XmlElement(name = "WorkAmountLacquer")
    protected FieldDecimal workAmountLacquer;
    @XmlElement(name = "ValueTotal")
    protected FieldDecimal valueTotal;
    @XmlElement(name = "DomusAggregateComponents")
    protected DomusAggregateComponents domusAggregateComponents;

    /**
     * Ruft den Wert der domusProcessId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDomusProcessId() {
        return domusProcessId;
    }

    /**
     * Legt den Wert der domusProcessId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDomusProcessId(FieldString value) {
        this.domusProcessId = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDescription(FieldString value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLocation(FieldString value) {
        this.location = value;
    }

    /**
     * Ruft den Wert der workTimeReplace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWorkTimeReplace() {
        return workTimeReplace;
    }

    /**
     * Legt den Wert der workTimeReplace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWorkTimeReplace(FieldDecimal value) {
        this.workTimeReplace = value;
    }

    /**
     * Ruft den Wert der workTimeOverhaul-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWorkTimeOverhaul() {
        return workTimeOverhaul;
    }

    /**
     * Legt den Wert der workTimeOverhaul-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWorkTimeOverhaul(FieldDecimal value) {
        this.workTimeOverhaul = value;
    }

    /**
     * Ruft den Wert der workTimeLacquer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWorkTimeLacquer() {
        return workTimeLacquer;
    }

    /**
     * Legt den Wert der workTimeLacquer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWorkTimeLacquer(FieldDecimal value) {
        this.workTimeLacquer = value;
    }

    /**
     * Ruft den Wert der workAmountReplace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWorkAmountReplace() {
        return workAmountReplace;
    }

    /**
     * Legt den Wert der workAmountReplace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWorkAmountReplace(FieldDecimal value) {
        this.workAmountReplace = value;
    }

    /**
     * Ruft den Wert der workAmountOverhaul-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWorkAmountOverhaul() {
        return workAmountOverhaul;
    }

    /**
     * Legt den Wert der workAmountOverhaul-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWorkAmountOverhaul(FieldDecimal value) {
        this.workAmountOverhaul = value;
    }

    /**
     * Ruft den Wert der workAmountLacquer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWorkAmountLacquer() {
        return workAmountLacquer;
    }

    /**
     * Legt den Wert der workAmountLacquer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWorkAmountLacquer(FieldDecimal value) {
        this.workAmountLacquer = value;
    }

    /**
     * Ruft den Wert der valueTotal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getValueTotal() {
        return valueTotal;
    }

    /**
     * Legt den Wert der valueTotal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setValueTotal(FieldDecimal value) {
        this.valueTotal = value;
    }

    /**
     * Ruft den Wert der domusAggregateComponents-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DomusAggregateComponents }
     *     
     */
    public DomusAggregateComponents getDomusAggregateComponents() {
        return domusAggregateComponents;
    }

    /**
     * Legt den Wert der domusAggregateComponents-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DomusAggregateComponents }
     *     
     */
    public void setDomusAggregateComponents(DomusAggregateComponents value) {
        this.domusAggregateComponents = value;
    }

}
