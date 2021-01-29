
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LacquerAzteur complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LacquerAzteur">
 *   &lt;complexContent>
 *     &lt;extension base="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}LacquerCommon">
 *       &lt;sequence>
 *         &lt;element name="pearlEffectSurchargePercent" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
 *         &lt;element name="materialIndex" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
 *         &lt;element name="materialSpecialLacquer" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *         &lt;element name="preparationTimePlasticPercent" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
 *         &lt;element name="isApplyUndercoatLacquerWhenRemoved" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="isLacquerPlasticWhenFitted" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="disposalCostPercent" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
 *         &lt;element name="maskingWorkGlassCount" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="maskingWorkPlasticCount" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="matBlackWindowFrameCount" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueInteger" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LacquerAzteur", namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd", propOrder = {
    "pearlEffectSurchargePercent",
    "materialIndex",
    "materialSpecialLacquer",
    "preparationTimePlasticPercent",
    "isApplyUndercoatLacquerWhenRemoved",
    "isLacquerPlasticWhenFitted",
    "disposalCostPercent",
    "maskingWorkGlassCount",
    "maskingWorkPlasticCount",
    "matBlackWindowFrameCount"
})
@XmlSeeAlso({
    de.dat.myclaim.soap.myclaimexternalservice.RateSetInst.EuroLacquerFactor.class,
    de.dat.myclaim.soap.myclaimexternalservice.RateSetInst.AztLacquerFactor.class
})
public class LacquerAzteur
    extends LacquerCommon
{

    protected RateValueDouble pearlEffectSurchargePercent;
    protected RateValueDouble materialIndex;
    protected Price materialSpecialLacquer;
    protected RateValueDouble preparationTimePlasticPercent;
    protected RateValueBoolean isApplyUndercoatLacquerWhenRemoved;
    protected RateValueBoolean isLacquerPlasticWhenFitted;
    protected RateValueDouble disposalCostPercent;
    protected RateValueInteger maskingWorkGlassCount;
    protected RateValueInteger maskingWorkPlasticCount;
    protected RateValueInteger matBlackWindowFrameCount;

    /**
     * Ruft den Wert der pearlEffectSurchargePercent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateValueDouble }
     *     
     */
    public RateValueDouble getPearlEffectSurchargePercent() {
        return pearlEffectSurchargePercent;
    }

    /**
     * Legt den Wert der pearlEffectSurchargePercent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueDouble }
     *     
     */
    public void setPearlEffectSurchargePercent(RateValueDouble value) {
        this.pearlEffectSurchargePercent = value;
    }

    /**
     * Ruft den Wert der materialIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateValueDouble }
     *     
     */
    public RateValueDouble getMaterialIndex() {
        return materialIndex;
    }

    /**
     * Legt den Wert der materialIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueDouble }
     *     
     */
    public void setMaterialIndex(RateValueDouble value) {
        this.materialIndex = value;
    }

    /**
     * Ruft den Wert der materialSpecialLacquer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getMaterialSpecialLacquer() {
        return materialSpecialLacquer;
    }

    /**
     * Legt den Wert der materialSpecialLacquer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setMaterialSpecialLacquer(Price value) {
        this.materialSpecialLacquer = value;
    }

    /**
     * Ruft den Wert der preparationTimePlasticPercent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateValueDouble }
     *     
     */
    public RateValueDouble getPreparationTimePlasticPercent() {
        return preparationTimePlasticPercent;
    }

    /**
     * Legt den Wert der preparationTimePlasticPercent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueDouble }
     *     
     */
    public void setPreparationTimePlasticPercent(RateValueDouble value) {
        this.preparationTimePlasticPercent = value;
    }

    /**
     * Ruft den Wert der isApplyUndercoatLacquerWhenRemoved-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateValueBoolean }
     *     
     */
    public RateValueBoolean getIsApplyUndercoatLacquerWhenRemoved() {
        return isApplyUndercoatLacquerWhenRemoved;
    }

    /**
     * Legt den Wert der isApplyUndercoatLacquerWhenRemoved-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueBoolean }
     *     
     */
    public void setIsApplyUndercoatLacquerWhenRemoved(RateValueBoolean value) {
        this.isApplyUndercoatLacquerWhenRemoved = value;
    }

    /**
     * Ruft den Wert der isLacquerPlasticWhenFitted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateValueBoolean }
     *     
     */
    public RateValueBoolean getIsLacquerPlasticWhenFitted() {
        return isLacquerPlasticWhenFitted;
    }

    /**
     * Legt den Wert der isLacquerPlasticWhenFitted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueBoolean }
     *     
     */
    public void setIsLacquerPlasticWhenFitted(RateValueBoolean value) {
        this.isLacquerPlasticWhenFitted = value;
    }

    /**
     * Ruft den Wert der disposalCostPercent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateValueDouble }
     *     
     */
    public RateValueDouble getDisposalCostPercent() {
        return disposalCostPercent;
    }

    /**
     * Legt den Wert der disposalCostPercent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueDouble }
     *     
     */
    public void setDisposalCostPercent(RateValueDouble value) {
        this.disposalCostPercent = value;
    }

    /**
     * Ruft den Wert der maskingWorkGlassCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateValueInteger }
     *     
     */
    public RateValueInteger getMaskingWorkGlassCount() {
        return maskingWorkGlassCount;
    }

    /**
     * Legt den Wert der maskingWorkGlassCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueInteger }
     *     
     */
    public void setMaskingWorkGlassCount(RateValueInteger value) {
        this.maskingWorkGlassCount = value;
    }

    /**
     * Ruft den Wert der maskingWorkPlasticCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateValueInteger }
     *     
     */
    public RateValueInteger getMaskingWorkPlasticCount() {
        return maskingWorkPlasticCount;
    }

    /**
     * Legt den Wert der maskingWorkPlasticCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueInteger }
     *     
     */
    public void setMaskingWorkPlasticCount(RateValueInteger value) {
        this.maskingWorkPlasticCount = value;
    }

    /**
     * Ruft den Wert der matBlackWindowFrameCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateValueInteger }
     *     
     */
    public RateValueInteger getMatBlackWindowFrameCount() {
        return matBlackWindowFrameCount;
    }

    /**
     * Legt den Wert der matBlackWindowFrameCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueInteger }
     *     
     */
    public void setMatBlackWindowFrameCount(RateValueInteger value) {
        this.matBlackWindowFrameCount = value;
    }

}
