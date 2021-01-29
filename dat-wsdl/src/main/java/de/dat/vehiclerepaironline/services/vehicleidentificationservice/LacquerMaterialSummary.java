
package de.dat.vehiclerepaironline.services.vehicleidentificationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LacquerMaterialSummary complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LacquerMaterialSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="FlatPercentage" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="FlatAmount" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="MaterialUnit" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Surface" type="{http://www.dat.de/vxs}detailBlockSummary" minOccurs="0" form="qualified"/>
 *         &lt;element name="Overhauling" type="{http://www.dat.de/vxs}detailBlockSummary" minOccurs="0" form="qualified"/>
 *         &lt;element name="Replacement" type="{http://www.dat.de/vxs}detailBlockSummary" minOccurs="0" form="qualified"/>
 *         &lt;element name="SpotRepair" type="{http://www.dat.de/vxs}detailBlockSummary" minOccurs="0" form="qualified"/>
 *         &lt;element name="SpotRepairPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerConstants" type="{http://www.dat.de/vxs}LacquerConstantSequence" minOccurs="0" form="qualified"/>
 *         &lt;element name="MaterialGroups" type="{http://www.dat.de/vxs}LacquerMaterialGroupSummarySequence" minOccurs="0" form="qualified"/>
 *         &lt;element name="DiscountMaterial" type="{http://www.dat.de/vxs}Discount" minOccurs="0" form="qualified"/>
 *         &lt;element name="TotalSum" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DisposalCosts" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SpecialLacquerAward" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LacquerMaterialSummary", propOrder = {

})
public class LacquerMaterialSummary {

    @XmlElement(name = "FlatPercentage")
    protected FieldDecimal flatPercentage;
    @XmlElement(name = "FlatAmount")
    protected FieldDecimal flatAmount;
    @XmlElement(name = "MaterialUnit")
    protected FieldString materialUnit;
    @XmlElement(name = "Surface")
    protected DetailBlockSummary surface;
    @XmlElement(name = "Overhauling")
    protected DetailBlockSummary overhauling;
    @XmlElement(name = "Replacement")
    protected DetailBlockSummary replacement;
    @XmlElement(name = "SpotRepair")
    protected DetailBlockSummary spotRepair;
    @XmlElement(name = "SpotRepairPrice")
    protected FieldDecimal spotRepairPrice;
    @XmlElement(name = "LacquerConstants")
    protected LacquerConstantSequence lacquerConstants;
    @XmlElement(name = "MaterialGroups")
    protected LacquerMaterialGroupSummarySequence materialGroups;
    @XmlElement(name = "DiscountMaterial")
    protected Discount discountMaterial;
    @XmlElement(name = "TotalSum")
    protected FieldDecimal totalSum;
    @XmlElement(name = "DisposalCosts")
    protected FieldDecimal disposalCosts;
    @XmlElement(name = "SpecialLacquerAward")
    protected FieldDecimal specialLacquerAward;

    /**
     * Ruft den Wert der flatPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getFlatPercentage() {
        return flatPercentage;
    }

    /**
     * Legt den Wert der flatPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setFlatPercentage(FieldDecimal value) {
        this.flatPercentage = value;
    }

    /**
     * Ruft den Wert der flatAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getFlatAmount() {
        return flatAmount;
    }

    /**
     * Legt den Wert der flatAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setFlatAmount(FieldDecimal value) {
        this.flatAmount = value;
    }

    /**
     * Ruft den Wert der materialUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getMaterialUnit() {
        return materialUnit;
    }

    /**
     * Legt den Wert der materialUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setMaterialUnit(FieldString value) {
        this.materialUnit = value;
    }

    /**
     * Ruft den Wert der surface-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DetailBlockSummary }
     *     
     */
    public DetailBlockSummary getSurface() {
        return surface;
    }

    /**
     * Legt den Wert der surface-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailBlockSummary }
     *     
     */
    public void setSurface(DetailBlockSummary value) {
        this.surface = value;
    }

    /**
     * Ruft den Wert der overhauling-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DetailBlockSummary }
     *     
     */
    public DetailBlockSummary getOverhauling() {
        return overhauling;
    }

    /**
     * Legt den Wert der overhauling-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailBlockSummary }
     *     
     */
    public void setOverhauling(DetailBlockSummary value) {
        this.overhauling = value;
    }

    /**
     * Ruft den Wert der replacement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DetailBlockSummary }
     *     
     */
    public DetailBlockSummary getReplacement() {
        return replacement;
    }

    /**
     * Legt den Wert der replacement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailBlockSummary }
     *     
     */
    public void setReplacement(DetailBlockSummary value) {
        this.replacement = value;
    }

    /**
     * Ruft den Wert der spotRepair-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DetailBlockSummary }
     *     
     */
    public DetailBlockSummary getSpotRepair() {
        return spotRepair;
    }

    /**
     * Legt den Wert der spotRepair-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailBlockSummary }
     *     
     */
    public void setSpotRepair(DetailBlockSummary value) {
        this.spotRepair = value;
    }

    /**
     * Ruft den Wert der spotRepairPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSpotRepairPrice() {
        return spotRepairPrice;
    }

    /**
     * Legt den Wert der spotRepairPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSpotRepairPrice(FieldDecimal value) {
        this.spotRepairPrice = value;
    }

    /**
     * Ruft den Wert der lacquerConstants-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LacquerConstantSequence }
     *     
     */
    public LacquerConstantSequence getLacquerConstants() {
        return lacquerConstants;
    }

    /**
     * Legt den Wert der lacquerConstants-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LacquerConstantSequence }
     *     
     */
    public void setLacquerConstants(LacquerConstantSequence value) {
        this.lacquerConstants = value;
    }

    /**
     * Ruft den Wert der materialGroups-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LacquerMaterialGroupSummarySequence }
     *     
     */
    public LacquerMaterialGroupSummarySequence getMaterialGroups() {
        return materialGroups;
    }

    /**
     * Legt den Wert der materialGroups-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LacquerMaterialGroupSummarySequence }
     *     
     */
    public void setMaterialGroups(LacquerMaterialGroupSummarySequence value) {
        this.materialGroups = value;
    }

    /**
     * Ruft den Wert der discountMaterial-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Discount }
     *     
     */
    public Discount getDiscountMaterial() {
        return discountMaterial;
    }

    /**
     * Legt den Wert der discountMaterial-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Discount }
     *     
     */
    public void setDiscountMaterial(Discount value) {
        this.discountMaterial = value;
    }

    /**
     * Ruft den Wert der totalSum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTotalSum() {
        return totalSum;
    }

    /**
     * Legt den Wert der totalSum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTotalSum(FieldDecimal value) {
        this.totalSum = value;
    }

    /**
     * Ruft den Wert der disposalCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDisposalCosts() {
        return disposalCosts;
    }

    /**
     * Legt den Wert der disposalCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDisposalCosts(FieldDecimal value) {
        this.disposalCosts = value;
    }

    /**
     * Ruft den Wert der specialLacquerAward-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSpecialLacquerAward() {
        return specialLacquerAward;
    }

    /**
     * Legt den Wert der specialLacquerAward-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSpecialLacquerAward(FieldDecimal value) {
        this.specialLacquerAward = value;
    }

}
