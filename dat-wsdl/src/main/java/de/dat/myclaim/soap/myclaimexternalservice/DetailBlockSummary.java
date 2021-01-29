
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für detailBlockSummary complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="detailBlockSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="Units" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PricePerUnit" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PricePerUnitState" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="FlatPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Discount" type="{http://www.dat.de/vxs}Discount" minOccurs="0" form="qualified"/>
 *         &lt;element name="Price" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Metallic" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detailBlockSummary", propOrder = {

})
public class DetailBlockSummary {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "Units")
    protected FieldDecimal units;
    @XmlElement(name = "PricePerUnit")
    protected FieldDecimal pricePerUnit;
    @XmlElement(name = "PricePerUnitState")
    protected FieldString pricePerUnitState;
    @XmlElement(name = "FlatPrice")
    protected FieldDecimal flatPrice;
    @XmlElement(name = "Discount")
    protected Discount discount;
    @XmlElement(name = "Price")
    protected FieldDecimal price;
    @XmlElement(name = "Metallic")
    protected FieldDecimal metallic;

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der units-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getUnits() {
        return units;
    }

    /**
     * Legt den Wert der units-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setUnits(FieldDecimal value) {
        this.units = value;
    }

    /**
     * Ruft den Wert der pricePerUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPricePerUnit() {
        return pricePerUnit;
    }

    /**
     * Legt den Wert der pricePerUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPricePerUnit(FieldDecimal value) {
        this.pricePerUnit = value;
    }

    /**
     * Ruft den Wert der pricePerUnitState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPricePerUnitState() {
        return pricePerUnitState;
    }

    /**
     * Legt den Wert der pricePerUnitState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPricePerUnitState(FieldString value) {
        this.pricePerUnitState = value;
    }

    /**
     * Ruft den Wert der flatPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getFlatPrice() {
        return flatPrice;
    }

    /**
     * Legt den Wert der flatPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setFlatPrice(FieldDecimal value) {
        this.flatPrice = value;
    }

    /**
     * Ruft den Wert der discount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Discount }
     *     
     */
    public Discount getDiscount() {
        return discount;
    }

    /**
     * Legt den Wert der discount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Discount }
     *     
     */
    public void setDiscount(Discount value) {
        this.discount = value;
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
     * Ruft den Wert der metallic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getMetallic() {
        return metallic;
    }

    /**
     * Legt den Wert der metallic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setMetallic(FieldDecimal value) {
        this.metallic = value;
    }

}
