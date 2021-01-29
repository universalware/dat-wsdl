
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für discountFactor complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="discountFactor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="discount" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Discount" minOccurs="0" form="qualified"/>
 *         &lt;element name="discountBiw" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Discount" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "discountFactor", namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd", propOrder = {
    "discount",
    "discountBiw"
})
@XmlSeeAlso({
    de.dat.myclaim.soap.myclaimexternalservice.RateSetInst.LabourCostFactor.class,
    de.dat.myclaim.soap.myclaimexternalservice.RateSetInst.SparePartFactor.class,
    de.dat.myclaim.soap.myclaimexternalservice.RateSetInst.CalculationFactor.class
})
public class DiscountFactor {

    protected Discount2 discount;
    protected Discount2 discountBiw;

    /**
     * Ruft den Wert der discount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Discount2 }
     *     
     */
    public Discount2 getDiscount() {
        return discount;
    }

    /**
     * Legt den Wert der discount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Discount2 }
     *     
     */
    public void setDiscount(Discount2 value) {
        this.discount = value;
    }

    /**
     * Ruft den Wert der discountBiw-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Discount2 }
     *     
     */
    public Discount2 getDiscountBiw() {
        return discountBiw;
    }

    /**
     * Legt den Wert der discountBiw-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Discount2 }
     *     
     */
    public void setDiscountBiw(Discount2 value) {
        this.discountBiw = value;
    }

}
