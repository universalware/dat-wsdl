
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
 *         &lt;element name="Type" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Position" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DATProcessId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="PartCodeItaly" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PartNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Amount" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Description" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Location" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkTimeReplace" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkTimeOverhaul" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkTimeMechanic" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkTimeLacquer" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkLevelReplace" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkLevelOverhaul" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkLevelMechanic" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkLevelLacquer" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="FlagValueParts" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ValueParts" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PartDiscountPerc" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PartDiscountValue" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ValuePartsCorrected" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ParentPosition" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "PositionItaly")
public class PositionItaly {

    @XmlElement(name = "Type")
    protected FieldString type;
    @XmlElement(name = "Position")
    protected FieldInteger position;
    @XmlElement(name = "DATProcessId")
    protected FieldInteger datProcessId;
    @XmlElement(name = "PartCodeItaly")
    protected FieldString partCodeItaly;
    @XmlElement(name = "PartNumber")
    protected FieldString partNumber;
    @XmlElement(name = "Amount")
    protected FieldDecimal amount;
    @XmlElement(name = "Description")
    protected FieldString description;
    @XmlElement(name = "Location")
    protected FieldString location;
    @XmlElement(name = "WorkTimeReplace")
    protected FieldDecimal workTimeReplace;
    @XmlElement(name = "WorkTimeOverhaul")
    protected FieldDecimal workTimeOverhaul;
    @XmlElement(name = "WorkTimeMechanic")
    protected FieldDecimal workTimeMechanic;
    @XmlElement(name = "WorkTimeLacquer")
    protected FieldDecimal workTimeLacquer;
    @XmlElement(name = "WorkLevelReplace")
    protected FieldString workLevelReplace;
    @XmlElement(name = "WorkLevelOverhaul")
    protected FieldString workLevelOverhaul;
    @XmlElement(name = "WorkLevelMechanic")
    protected FieldString workLevelMechanic;
    @XmlElement(name = "WorkLevelLacquer")
    protected FieldString workLevelLacquer;
    @XmlElement(name = "FlagValueParts")
    protected FieldString flagValueParts;
    @XmlElement(name = "ValueParts")
    protected FieldDecimal valueParts;
    @XmlElement(name = "PartDiscountPerc")
    protected FieldDecimal partDiscountPerc;
    @XmlElement(name = "PartDiscountValue")
    protected FieldDecimal partDiscountValue;
    @XmlElement(name = "ValuePartsCorrected")
    protected FieldDecimal valuePartsCorrected;
    @XmlElement(name = "ParentPosition")
    protected FieldInteger parentPosition;

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setType(FieldString value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der position-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getPosition() {
        return position;
    }

    /**
     * Legt den Wert der position-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setPosition(FieldInteger value) {
        this.position = value;
    }

    /**
     * Ruft den Wert der datProcessId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDATProcessId() {
        return datProcessId;
    }

    /**
     * Legt den Wert der datProcessId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDATProcessId(FieldInteger value) {
        this.datProcessId = value;
    }

    /**
     * Ruft den Wert der partCodeItaly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPartCodeItaly() {
        return partCodeItaly;
    }

    /**
     * Legt den Wert der partCodeItaly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPartCodeItaly(FieldString value) {
        this.partCodeItaly = value;
    }

    /**
     * Ruft den Wert der partNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPartNumber() {
        return partNumber;
    }

    /**
     * Legt den Wert der partNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPartNumber(FieldString value) {
        this.partNumber = value;
    }

    /**
     * Ruft den Wert der amount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getAmount() {
        return amount;
    }

    /**
     * Legt den Wert der amount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setAmount(FieldDecimal value) {
        this.amount = value;
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
     * Ruft den Wert der workTimeMechanic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWorkTimeMechanic() {
        return workTimeMechanic;
    }

    /**
     * Legt den Wert der workTimeMechanic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWorkTimeMechanic(FieldDecimal value) {
        this.workTimeMechanic = value;
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
     * Ruft den Wert der workLevelReplace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getWorkLevelReplace() {
        return workLevelReplace;
    }

    /**
     * Legt den Wert der workLevelReplace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setWorkLevelReplace(FieldString value) {
        this.workLevelReplace = value;
    }

    /**
     * Ruft den Wert der workLevelOverhaul-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getWorkLevelOverhaul() {
        return workLevelOverhaul;
    }

    /**
     * Legt den Wert der workLevelOverhaul-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setWorkLevelOverhaul(FieldString value) {
        this.workLevelOverhaul = value;
    }

    /**
     * Ruft den Wert der workLevelMechanic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getWorkLevelMechanic() {
        return workLevelMechanic;
    }

    /**
     * Legt den Wert der workLevelMechanic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setWorkLevelMechanic(FieldString value) {
        this.workLevelMechanic = value;
    }

    /**
     * Ruft den Wert der workLevelLacquer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getWorkLevelLacquer() {
        return workLevelLacquer;
    }

    /**
     * Legt den Wert der workLevelLacquer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setWorkLevelLacquer(FieldString value) {
        this.workLevelLacquer = value;
    }

    /**
     * Ruft den Wert der flagValueParts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getFlagValueParts() {
        return flagValueParts;
    }

    /**
     * Legt den Wert der flagValueParts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setFlagValueParts(FieldString value) {
        this.flagValueParts = value;
    }

    /**
     * Ruft den Wert der valueParts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getValueParts() {
        return valueParts;
    }

    /**
     * Legt den Wert der valueParts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setValueParts(FieldDecimal value) {
        this.valueParts = value;
    }

    /**
     * Ruft den Wert der partDiscountPerc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPartDiscountPerc() {
        return partDiscountPerc;
    }

    /**
     * Legt den Wert der partDiscountPerc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPartDiscountPerc(FieldDecimal value) {
        this.partDiscountPerc = value;
    }

    /**
     * Ruft den Wert der partDiscountValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPartDiscountValue() {
        return partDiscountValue;
    }

    /**
     * Legt den Wert der partDiscountValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPartDiscountValue(FieldDecimal value) {
        this.partDiscountValue = value;
    }

    /**
     * Ruft den Wert der valuePartsCorrected-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getValuePartsCorrected() {
        return valuePartsCorrected;
    }

    /**
     * Legt den Wert der valuePartsCorrected-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setValuePartsCorrected(FieldDecimal value) {
        this.valuePartsCorrected = value;
    }

    /**
     * Ruft den Wert der parentPosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getParentPosition() {
        return parentPosition;
    }

    /**
     * Legt den Wert der parentPosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setParentPosition(FieldInteger value) {
        this.parentPosition = value;
    }

}
