
package de.dat.financeline.services.dossier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Discount complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Discount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="PriceBeforeDiscount" type="{http://www.dat.de/vxs}fieldDecimal" form="qualified"/>
 *         &lt;element name="DiscountPercentage" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Discount" type="{http://www.dat.de/vxs}fieldDecimal" form="qualified"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Discount", propOrder = {

})
public class Discount {

    @XmlElement(name = "PriceBeforeDiscount", required = true)
    protected FieldDecimal priceBeforeDiscount;
    @XmlElement(name = "DiscountPercentage")
    protected FieldDecimal discountPercentage;
    @XmlElement(name = "Discount", required = true)
    protected FieldDecimal discount;

    /**
     * Ruft den Wert der priceBeforeDiscount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPriceBeforeDiscount() {
        return priceBeforeDiscount;
    }

    /**
     * Legt den Wert der priceBeforeDiscount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPriceBeforeDiscount(FieldDecimal value) {
        this.priceBeforeDiscount = value;
    }

    /**
     * Ruft den Wert der discountPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDiscountPercentage() {
        return discountPercentage;
    }

    /**
     * Legt den Wert der discountPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDiscountPercentage(FieldDecimal value) {
        this.discountPercentage = value;
    }

    /**
     * Ruft den Wert der discount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDiscount() {
        return discount;
    }

    /**
     * Legt den Wert der discount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDiscount(FieldDecimal value) {
        this.discount = value;
    }

}
