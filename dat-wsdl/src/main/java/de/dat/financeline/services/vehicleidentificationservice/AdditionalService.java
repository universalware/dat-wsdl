
package de.dat.financeline.services.vehicleidentificationservice;

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
 *         &lt;element name="Selected" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="ServiceType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="CostOwner" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Price" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PricePerDay" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="NbDays" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="UsedSince" type="{http://www.dat.de/vxs}fieldDateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="UsedUntil" type="{http://www.dat.de/vxs}fieldDateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="RentalCarGroup" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "AdditionalService")
public class AdditionalService {

    @XmlElement(name = "Selected")
    protected FieldBoolean selected;
    @XmlElement(name = "ServiceType")
    protected FieldString serviceType;
    @XmlElement(name = "CostOwner")
    protected FieldString costOwner;
    @XmlElement(name = "Price")
    protected FieldDecimal price;
    @XmlElement(name = "PricePerDay")
    protected FieldDecimal pricePerDay;
    @XmlElement(name = "NbDays")
    protected FieldDecimal nbDays;
    @XmlElement(name = "UsedSince")
    protected FieldDateTime usedSince;
    @XmlElement(name = "UsedUntil")
    protected FieldDateTime usedUntil;
    @XmlElement(name = "RentalCarGroup")
    protected FieldInteger rentalCarGroup;

    /**
     * Ruft den Wert der selected-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getSelected() {
        return selected;
    }

    /**
     * Legt den Wert der selected-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setSelected(FieldBoolean value) {
        this.selected = value;
    }

    /**
     * Ruft den Wert der serviceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getServiceType() {
        return serviceType;
    }

    /**
     * Legt den Wert der serviceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setServiceType(FieldString value) {
        this.serviceType = value;
    }

    /**
     * Ruft den Wert der costOwner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCostOwner() {
        return costOwner;
    }

    /**
     * Legt den Wert der costOwner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCostOwner(FieldString value) {
        this.costOwner = value;
    }

    /**
     * Ruft den Wert der price-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPrice() {
        return price;
    }

    /**
     * Legt den Wert der price-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPrice(FieldDecimal value) {
        this.price = value;
    }

    /**
     * Ruft den Wert der pricePerDay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPricePerDay() {
        return pricePerDay;
    }

    /**
     * Legt den Wert der pricePerDay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPricePerDay(FieldDecimal value) {
        this.pricePerDay = value;
    }

    /**
     * Ruft den Wert der nbDays-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getNbDays() {
        return nbDays;
    }

    /**
     * Legt den Wert der nbDays-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setNbDays(FieldDecimal value) {
        this.nbDays = value;
    }

    /**
     * Ruft den Wert der usedSince-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getUsedSince() {
        return usedSince;
    }

    /**
     * Legt den Wert der usedSince-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setUsedSince(FieldDateTime value) {
        this.usedSince = value;
    }

    /**
     * Ruft den Wert der usedUntil-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getUsedUntil() {
        return usedUntil;
    }

    /**
     * Legt den Wert der usedUntil-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setUsedUntil(FieldDateTime value) {
        this.usedUntil = value;
    }

    /**
     * Ruft den Wert der rentalCarGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getRentalCarGroup() {
        return rentalCarGroup;
    }

    /**
     * Legt den Wert der rentalCarGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setRentalCarGroup(FieldInteger value) {
        this.rentalCarGroup = value;
    }

}
