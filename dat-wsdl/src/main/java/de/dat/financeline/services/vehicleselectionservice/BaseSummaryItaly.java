
package de.dat.financeline.services.vehicleselectionservice;

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
 *         &lt;element name="WorkTimeReplace" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkTimeOverhaul" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkTimeMechanic" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkTimeLacquer" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ValueParts" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "BaseSummaryItaly")
public class BaseSummaryItaly {

    @XmlElement(name = "WorkTimeReplace")
    protected FieldDecimal workTimeReplace;
    @XmlElement(name = "WorkTimeOverhaul")
    protected FieldDecimal workTimeOverhaul;
    @XmlElement(name = "WorkTimeMechanic")
    protected FieldDecimal workTimeMechanic;
    @XmlElement(name = "WorkTimeLacquer")
    protected FieldDecimal workTimeLacquer;
    @XmlElement(name = "ValueParts")
    protected FieldDecimal valueParts;

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

}
