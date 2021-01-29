
package de.dat.vehiclerepaironline.services.dossier;

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
 *         &lt;element name="OriginalPriceNet" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="OriginalPriceVATRate" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="OriginalPriceNoVA" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="OriginalPriceBonus" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="OriginalPriceMalus" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="RegistrationTaxRate" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="RegistrationTax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TransportationCosts" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="OriginalPriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "OriginalPriceInfo")
public class OriginalPriceInfo {

    @XmlElement(name = "OriginalPriceNet")
    protected FieldDecimal originalPriceNet;
    @XmlElement(name = "OriginalPriceVATRate")
    protected FieldDecimal originalPriceVATRate;
    @XmlElement(name = "OriginalPriceNoVA")
    protected FieldDecimal originalPriceNoVA;
    @XmlElement(name = "OriginalPriceBonus")
    protected FieldDecimal originalPriceBonus;
    @XmlElement(name = "OriginalPriceMalus")
    protected FieldDecimal originalPriceMalus;
    @XmlElement(name = "RegistrationTaxRate")
    protected FieldDecimal registrationTaxRate;
    @XmlElement(name = "RegistrationTax")
    protected FieldDecimal registrationTax;
    @XmlElement(name = "TransportationCosts")
    protected FieldDecimal transportationCosts;
    @XmlElement(name = "OriginalPriceGross")
    protected FieldDecimal originalPriceGross;

    /**
     * Ruft den Wert der originalPriceNet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getOriginalPriceNet() {
        return originalPriceNet;
    }

    /**
     * Legt den Wert der originalPriceNet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setOriginalPriceNet(FieldDecimal value) {
        this.originalPriceNet = value;
    }

    /**
     * Ruft den Wert der originalPriceVATRate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getOriginalPriceVATRate() {
        return originalPriceVATRate;
    }

    /**
     * Legt den Wert der originalPriceVATRate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setOriginalPriceVATRate(FieldDecimal value) {
        this.originalPriceVATRate = value;
    }

    /**
     * Ruft den Wert der originalPriceNoVA-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getOriginalPriceNoVA() {
        return originalPriceNoVA;
    }

    /**
     * Legt den Wert der originalPriceNoVA-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setOriginalPriceNoVA(FieldDecimal value) {
        this.originalPriceNoVA = value;
    }

    /**
     * Ruft den Wert der originalPriceBonus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getOriginalPriceBonus() {
        return originalPriceBonus;
    }

    /**
     * Legt den Wert der originalPriceBonus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setOriginalPriceBonus(FieldDecimal value) {
        this.originalPriceBonus = value;
    }

    /**
     * Ruft den Wert der originalPriceMalus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getOriginalPriceMalus() {
        return originalPriceMalus;
    }

    /**
     * Legt den Wert der originalPriceMalus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setOriginalPriceMalus(FieldDecimal value) {
        this.originalPriceMalus = value;
    }

    /**
     * Ruft den Wert der registrationTaxRate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getRegistrationTaxRate() {
        return registrationTaxRate;
    }

    /**
     * Legt den Wert der registrationTaxRate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setRegistrationTaxRate(FieldDecimal value) {
        this.registrationTaxRate = value;
    }

    /**
     * Ruft den Wert der registrationTax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getRegistrationTax() {
        return registrationTax;
    }

    /**
     * Legt den Wert der registrationTax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setRegistrationTax(FieldDecimal value) {
        this.registrationTax = value;
    }

    /**
     * Ruft den Wert der transportationCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTransportationCosts() {
        return transportationCosts;
    }

    /**
     * Legt den Wert der transportationCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTransportationCosts(FieldDecimal value) {
        this.transportationCosts = value;
    }

    /**
     * Ruft den Wert der originalPriceGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getOriginalPriceGross() {
        return originalPriceGross;
    }

    /**
     * Legt den Wert der originalPriceGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setOriginalPriceGross(FieldDecimal value) {
        this.originalPriceGross = value;
    }

}
