
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LacquerSpain complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LacquerSpain">
 *   &lt;complexContent>
 *     &lt;extension base="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}LacquerBase">
 *       &lt;sequence>
 *         &lt;element name="isCalculationWithoutConstant" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="isDiscountCombined" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="isDiscountSparePart" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LacquerSpain", namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd", propOrder = {
    "isCalculationWithoutConstant",
    "isDiscountCombined",
    "isDiscountSparePart"
})
@XmlSeeAlso({
    de.dat.myclaim.soap.myclaimexternalservice.RateSetInst.CesvimapLacquerFactor.class,
    de.dat.myclaim.soap.myclaimexternalservice.RateSetInst.CzLacquerFactor.class,
    de.dat.myclaim.soap.myclaimexternalservice.RateSetInst.FullyManualLacquerFactor.class
})
public class LacquerSpain
    extends LacquerBase
{

    protected RateValueBoolean isCalculationWithoutConstant;
    protected RateValueBoolean isDiscountCombined;
    protected RateValueBoolean isDiscountSparePart;

    /**
     * Ruft den Wert der isCalculationWithoutConstant-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateValueBoolean }
     *     
     */
    public RateValueBoolean getIsCalculationWithoutConstant() {
        return isCalculationWithoutConstant;
    }

    /**
     * Legt den Wert der isCalculationWithoutConstant-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueBoolean }
     *     
     */
    public void setIsCalculationWithoutConstant(RateValueBoolean value) {
        this.isCalculationWithoutConstant = value;
    }

    /**
     * Ruft den Wert der isDiscountCombined-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateValueBoolean }
     *     
     */
    public RateValueBoolean getIsDiscountCombined() {
        return isDiscountCombined;
    }

    /**
     * Legt den Wert der isDiscountCombined-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueBoolean }
     *     
     */
    public void setIsDiscountCombined(RateValueBoolean value) {
        this.isDiscountCombined = value;
    }

    /**
     * Ruft den Wert der isDiscountSparePart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateValueBoolean }
     *     
     */
    public RateValueBoolean getIsDiscountSparePart() {
        return isDiscountSparePart;
    }

    /**
     * Legt den Wert der isDiscountSparePart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueBoolean }
     *     
     */
    public void setIsDiscountSparePart(RateValueBoolean value) {
        this.isDiscountSparePart = value;
    }

}
