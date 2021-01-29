
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LacquerCommon complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LacquerCommon">
 *   &lt;complexContent>
 *     &lt;extension base="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}LacquerBase">
 *       &lt;sequence>
 *         &lt;element name="addition" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="exemplarySheets" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="calculationType" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="wageMode" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="wageFlatRate" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *         &lt;element name="materialMode" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="wageInclMaterialMode" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="wageInclMaterial" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *         &lt;element name="wageInclMaterialFlatRate" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *         &lt;element name="preparationTimePercent" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
 *         &lt;element name="isSurchargeForSecondColor" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="isLacquerAssemblyWhenRemoved" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="materialFlatRateMode" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="materialFlatRatePercent" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
 *         &lt;element name="materialFlatRateAbsolute" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LacquerCommon", namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd", propOrder = {
    "addition",
    "exemplarySheets",
    "calculationType",
    "wageMode",
    "wageFlatRate",
    "materialMode",
    "wageInclMaterialMode",
    "wageInclMaterial",
    "wageInclMaterialFlatRate",
    "preparationTimePercent",
    "isSurchargeForSecondColor",
    "isLacquerAssemblyWhenRemoved",
    "materialFlatRateMode",
    "materialFlatRatePercent",
    "materialFlatRateAbsolute"
})
@XmlSeeAlso({
    de.dat.myclaim.soap.myclaimexternalservice.RateSetInst.ManufacturerLacquerFactor.class,
    LacquerAzteur.class
})
public class LacquerCommon
    extends LacquerBase
{

    protected RateValueBoolean addition;
    protected RateValueInteger exemplarySheets;
    protected RateValueInteger calculationType;
    protected RateValueInteger wageMode;
    protected Price wageFlatRate;
    protected RateValueInteger materialMode;
    protected RateValueInteger wageInclMaterialMode;
    protected Price wageInclMaterial;
    protected Price wageInclMaterialFlatRate;
    protected RateValueDouble preparationTimePercent;
    protected RateValueBoolean isSurchargeForSecondColor;
    protected RateValueBoolean isLacquerAssemblyWhenRemoved;
    protected RateValueInteger materialFlatRateMode;
    protected RateValueDouble materialFlatRatePercent;
    protected Price materialFlatRateAbsolute;

    /**
     * Ruft den Wert der addition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateValueBoolean }
     *     
     */
    public RateValueBoolean getAddition() {
        return addition;
    }

    /**
     * Legt den Wert der addition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueBoolean }
     *     
     */
    public void setAddition(RateValueBoolean value) {
        this.addition = value;
    }

    /**
     * Ruft den Wert der exemplarySheets-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateValueInteger }
     *     
     */
    public RateValueInteger getExemplarySheets() {
        return exemplarySheets;
    }

    /**
     * Legt den Wert der exemplarySheets-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueInteger }
     *     
     */
    public void setExemplarySheets(RateValueInteger value) {
        this.exemplarySheets = value;
    }

    /**
     * Ruft den Wert der calculationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateValueInteger }
     *     
     */
    public RateValueInteger getCalculationType() {
        return calculationType;
    }

    /**
     * Legt den Wert der calculationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueInteger }
     *     
     */
    public void setCalculationType(RateValueInteger value) {
        this.calculationType = value;
    }

    /**
     * Ruft den Wert der wageMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateValueInteger }
     *     
     */
    public RateValueInteger getWageMode() {
        return wageMode;
    }

    /**
     * Legt den Wert der wageMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueInteger }
     *     
     */
    public void setWageMode(RateValueInteger value) {
        this.wageMode = value;
    }

    /**
     * Ruft den Wert der wageFlatRate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getWageFlatRate() {
        return wageFlatRate;
    }

    /**
     * Legt den Wert der wageFlatRate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setWageFlatRate(Price value) {
        this.wageFlatRate = value;
    }

    /**
     * Ruft den Wert der materialMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateValueInteger }
     *     
     */
    public RateValueInteger getMaterialMode() {
        return materialMode;
    }

    /**
     * Legt den Wert der materialMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueInteger }
     *     
     */
    public void setMaterialMode(RateValueInteger value) {
        this.materialMode = value;
    }

    /**
     * Ruft den Wert der wageInclMaterialMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateValueInteger }
     *     
     */
    public RateValueInteger getWageInclMaterialMode() {
        return wageInclMaterialMode;
    }

    /**
     * Legt den Wert der wageInclMaterialMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueInteger }
     *     
     */
    public void setWageInclMaterialMode(RateValueInteger value) {
        this.wageInclMaterialMode = value;
    }

    /**
     * Ruft den Wert der wageInclMaterial-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getWageInclMaterial() {
        return wageInclMaterial;
    }

    /**
     * Legt den Wert der wageInclMaterial-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setWageInclMaterial(Price value) {
        this.wageInclMaterial = value;
    }

    /**
     * Ruft den Wert der wageInclMaterialFlatRate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getWageInclMaterialFlatRate() {
        return wageInclMaterialFlatRate;
    }

    /**
     * Legt den Wert der wageInclMaterialFlatRate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setWageInclMaterialFlatRate(Price value) {
        this.wageInclMaterialFlatRate = value;
    }

    /**
     * Ruft den Wert der preparationTimePercent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateValueDouble }
     *     
     */
    public RateValueDouble getPreparationTimePercent() {
        return preparationTimePercent;
    }

    /**
     * Legt den Wert der preparationTimePercent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueDouble }
     *     
     */
    public void setPreparationTimePercent(RateValueDouble value) {
        this.preparationTimePercent = value;
    }

    /**
     * Ruft den Wert der isSurchargeForSecondColor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateValueBoolean }
     *     
     */
    public RateValueBoolean getIsSurchargeForSecondColor() {
        return isSurchargeForSecondColor;
    }

    /**
     * Legt den Wert der isSurchargeForSecondColor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueBoolean }
     *     
     */
    public void setIsSurchargeForSecondColor(RateValueBoolean value) {
        this.isSurchargeForSecondColor = value;
    }

    /**
     * Ruft den Wert der isLacquerAssemblyWhenRemoved-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateValueBoolean }
     *     
     */
    public RateValueBoolean getIsLacquerAssemblyWhenRemoved() {
        return isLacquerAssemblyWhenRemoved;
    }

    /**
     * Legt den Wert der isLacquerAssemblyWhenRemoved-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueBoolean }
     *     
     */
    public void setIsLacquerAssemblyWhenRemoved(RateValueBoolean value) {
        this.isLacquerAssemblyWhenRemoved = value;
    }

    /**
     * Ruft den Wert der materialFlatRateMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateValueInteger }
     *     
     */
    public RateValueInteger getMaterialFlatRateMode() {
        return materialFlatRateMode;
    }

    /**
     * Legt den Wert der materialFlatRateMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueInteger }
     *     
     */
    public void setMaterialFlatRateMode(RateValueInteger value) {
        this.materialFlatRateMode = value;
    }

    /**
     * Ruft den Wert der materialFlatRatePercent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateValueDouble }
     *     
     */
    public RateValueDouble getMaterialFlatRatePercent() {
        return materialFlatRatePercent;
    }

    /**
     * Legt den Wert der materialFlatRatePercent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueDouble }
     *     
     */
    public void setMaterialFlatRatePercent(RateValueDouble value) {
        this.materialFlatRatePercent = value;
    }

    /**
     * Ruft den Wert der materialFlatRateAbsolute-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getMaterialFlatRateAbsolute() {
        return materialFlatRateAbsolute;
    }

    /**
     * Legt den Wert der materialFlatRateAbsolute-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setMaterialFlatRateAbsolute(Price value) {
        this.materialFlatRateAbsolute = value;
    }

}
