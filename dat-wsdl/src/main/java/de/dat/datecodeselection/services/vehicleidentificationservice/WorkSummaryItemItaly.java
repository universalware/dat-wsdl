
package de.dat.datecodeselection.services.vehicleidentificationservice;

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
 *         &lt;element name="Identifier" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Description" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Hours" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WagePerHour" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TotalWage" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DiscountPerc" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DiscountValue" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TotalWageCorrected" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "WorkSummaryItemItaly")
public class WorkSummaryItemItaly {

    @XmlElement(name = "Identifier")
    protected FieldString identifier;
    @XmlElement(name = "Description")
    protected FieldString description;
    @XmlElement(name = "Hours")
    protected FieldDecimal hours;
    @XmlElement(name = "WagePerHour")
    protected FieldDecimal wagePerHour;
    @XmlElement(name = "TotalWage")
    protected FieldDecimal totalWage;
    @XmlElement(name = "DiscountPerc")
    protected FieldDecimal discountPerc;
    @XmlElement(name = "DiscountValue")
    protected FieldDecimal discountValue;
    @XmlElement(name = "TotalWageCorrected")
    protected FieldDecimal totalWageCorrected;

    /**
     * Ruft den Wert der identifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getIdentifier() {
        return identifier;
    }

    /**
     * Legt den Wert der identifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setIdentifier(FieldString value) {
        this.identifier = value;
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
     * Ruft den Wert der hours-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getHours() {
        return hours;
    }

    /**
     * Legt den Wert der hours-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setHours(FieldDecimal value) {
        this.hours = value;
    }

    /**
     * Ruft den Wert der wagePerHour-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWagePerHour() {
        return wagePerHour;
    }

    /**
     * Legt den Wert der wagePerHour-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWagePerHour(FieldDecimal value) {
        this.wagePerHour = value;
    }

    /**
     * Ruft den Wert der totalWage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTotalWage() {
        return totalWage;
    }

    /**
     * Legt den Wert der totalWage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTotalWage(FieldDecimal value) {
        this.totalWage = value;
    }

    /**
     * Ruft den Wert der discountPerc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDiscountPerc() {
        return discountPerc;
    }

    /**
     * Legt den Wert der discountPerc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDiscountPerc(FieldDecimal value) {
        this.discountPerc = value;
    }

    /**
     * Ruft den Wert der discountValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDiscountValue() {
        return discountValue;
    }

    /**
     * Legt den Wert der discountValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDiscountValue(FieldDecimal value) {
        this.discountValue = value;
    }

    /**
     * Ruft den Wert der totalWageCorrected-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTotalWageCorrected() {
        return totalWageCorrected;
    }

    /**
     * Legt den Wert der totalWageCorrected-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTotalWageCorrected(FieldDecimal value) {
        this.totalWageCorrected = value;
    }

}
