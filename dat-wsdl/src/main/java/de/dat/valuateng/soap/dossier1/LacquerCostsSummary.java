
package de.dat.valuateng.soap.dossier1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LacquerCostsSummary complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LacquerCostsSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="DiscountTotalFlat" type="{http://www.dat.de/vxs}Discount" minOccurs="0" form="qualified"/>
 *         &lt;element name="TotalFlat" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WageAndMaterial" type="{http://www.dat.de/vxs}detailBlockSummary" minOccurs="0" form="qualified"/>
 *         &lt;element name="Wage" type="{http://www.dat.de/vxs}detailBlockSummary" minOccurs="0" form="qualified"/>
 *         &lt;element name="SpotRepairWage" type="{http://www.dat.de/vxs}detailBlockSummary" minOccurs="0" form="qualified"/>
 *         &lt;element name="Material" type="{http://www.dat.de/vxs}LacquerMaterialSummary" minOccurs="0" form="qualified"/>
 *         &lt;element name="TotalSum" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LacquerCostsSummary", propOrder = {

})
public class LacquerCostsSummary {

    @XmlElement(name = "DiscountTotalFlat")
    protected Discount discountTotalFlat;
    @XmlElement(name = "TotalFlat")
    protected FieldDecimal totalFlat;
    @XmlElement(name = "WageAndMaterial")
    protected DetailBlockSummary wageAndMaterial;
    @XmlElement(name = "Wage")
    protected DetailBlockSummary wage;
    @XmlElement(name = "SpotRepairWage")
    protected DetailBlockSummary spotRepairWage;
    @XmlElement(name = "Material")
    protected LacquerMaterialSummary material;
    @XmlElement(name = "TotalSum")
    protected FieldDecimal totalSum;

    /**
     * Ruft den Wert der discountTotalFlat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Discount }
     *     
     */
    public Discount getDiscountTotalFlat() {
        return discountTotalFlat;
    }

    /**
     * Legt den Wert der discountTotalFlat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Discount }
     *     
     */
    public void setDiscountTotalFlat(Discount value) {
        this.discountTotalFlat = value;
    }

    /**
     * Ruft den Wert der totalFlat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTotalFlat() {
        return totalFlat;
    }

    /**
     * Legt den Wert der totalFlat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTotalFlat(FieldDecimal value) {
        this.totalFlat = value;
    }

    /**
     * Ruft den Wert der wageAndMaterial-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DetailBlockSummary }
     *     
     */
    public DetailBlockSummary getWageAndMaterial() {
        return wageAndMaterial;
    }

    /**
     * Legt den Wert der wageAndMaterial-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailBlockSummary }
     *     
     */
    public void setWageAndMaterial(DetailBlockSummary value) {
        this.wageAndMaterial = value;
    }

    /**
     * Ruft den Wert der wage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DetailBlockSummary }
     *     
     */
    public DetailBlockSummary getWage() {
        return wage;
    }

    /**
     * Legt den Wert der wage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailBlockSummary }
     *     
     */
    public void setWage(DetailBlockSummary value) {
        this.wage = value;
    }

    /**
     * Ruft den Wert der spotRepairWage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DetailBlockSummary }
     *     
     */
    public DetailBlockSummary getSpotRepairWage() {
        return spotRepairWage;
    }

    /**
     * Legt den Wert der spotRepairWage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailBlockSummary }
     *     
     */
    public void setSpotRepairWage(DetailBlockSummary value) {
        this.spotRepairWage = value;
    }

    /**
     * Ruft den Wert der material-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LacquerMaterialSummary }
     *     
     */
    public LacquerMaterialSummary getMaterial() {
        return material;
    }

    /**
     * Legt den Wert der material-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LacquerMaterialSummary }
     *     
     */
    public void setMaterial(LacquerMaterialSummary value) {
        this.material = value;
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

}
