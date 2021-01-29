
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für rateValueDiscount complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="rateValueDiscount">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd>rateValueDouble">
 *       &lt;attribute name="discountType" use="required" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}discountType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rateValueDiscount", namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
public class RateValueDiscount
    extends RateValueDouble
{

    @XmlAttribute(name = "discountType", required = true)
    protected DiscountType discountType;

    /**
     * Ruft den Wert der discountType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DiscountType }
     *     
     */
    public DiscountType getDiscountType() {
        return discountType;
    }

    /**
     * Legt den Wert der discountType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountType }
     *     
     */
    public void setDiscountType(DiscountType value) {
        this.discountType = value;
    }

}
