
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LacquerBase complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LacquerBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueString" minOccurs="0" form="qualified"/>
 *         &lt;element name="wage" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *         &lt;element name="discountWageInclMaterial" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Discount" minOccurs="0" form="qualified"/>
 *         &lt;element name="discountMaterial" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Discount" minOccurs="0" form="qualified"/>
 *         &lt;element name="discountWage" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Discount" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LacquerBase", namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd", propOrder = {
    "type",
    "wage",
    "discountWageInclMaterial",
    "discountMaterial",
    "discountWage"
})
@XmlSeeAlso({
    LacquerSpain.class,
    LacquerCommon.class
})
public class LacquerBase {

    protected RateValueString type;
    protected Price wage;
    protected Discount2 discountWageInclMaterial;
    protected Discount2 discountMaterial;
    protected Discount2 discountWage;

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateValueString }
     *     
     */
    public RateValueString getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueString }
     *     
     */
    public void setType(RateValueString value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der wage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getWage() {
        return wage;
    }

    /**
     * Legt den Wert der wage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setWage(Price value) {
        this.wage = value;
    }

    /**
     * Ruft den Wert der discountWageInclMaterial-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Discount2 }
     *     
     */
    public Discount2 getDiscountWageInclMaterial() {
        return discountWageInclMaterial;
    }

    /**
     * Legt den Wert der discountWageInclMaterial-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Discount2 }
     *     
     */
    public void setDiscountWageInclMaterial(Discount2 value) {
        this.discountWageInclMaterial = value;
    }

    /**
     * Ruft den Wert der discountMaterial-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Discount2 }
     *     
     */
    public Discount2 getDiscountMaterial() {
        return discountMaterial;
    }

    /**
     * Legt den Wert der discountMaterial-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Discount2 }
     *     
     */
    public void setDiscountMaterial(Discount2 value) {
        this.discountMaterial = value;
    }

    /**
     * Ruft den Wert der discountWage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Discount2 }
     *     
     */
    public Discount2 getDiscountWage() {
        return discountWage;
    }

    /**
     * Legt den Wert der discountWage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Discount2 }
     *     
     */
    public void setDiscountWage(Discount2 value) {
        this.discountWage = value;
    }

}
