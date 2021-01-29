
package de.dat.valuateng.soap.dossier1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LabourCostsSummary complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LabourCostsSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="AllSum" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Bodywork" type="{http://www.dat.de/vxs}detailBlockSummary" minOccurs="0" form="qualified"/>
 *         &lt;element name="Electric" type="{http://www.dat.de/vxs}detailBlockSummary" minOccurs="0" form="qualified"/>
 *         &lt;element name="Mechanic" type="{http://www.dat.de/vxs}detailBlockSummary" minOccurs="0" form="qualified"/>
 *         &lt;element name="OpelGoodWill" type="{http://www.dat.de/vxs}detailBlockSummary" minOccurs="0" form="qualified"/>
 *         &lt;element name="Dents" type="{http://www.dat.de/vxs}detailBlockSummary" minOccurs="0" form="qualified"/>
 *         &lt;element name="TotalSum" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Discount" type="{http://www.dat.de/vxs}Discount" minOccurs="0" form="qualified"/>
 *         &lt;element name="Wages" type="{http://www.dat.de/vxs}DetailBlockSummaryWages" minOccurs="0" form="qualified"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabourCostsSummary", propOrder = {

})
public class LabourCostsSummary {

    @XmlElement(name = "AllSum")
    protected FieldDecimal allSum;
    @XmlElement(name = "Bodywork")
    protected DetailBlockSummary bodywork;
    @XmlElement(name = "Electric")
    protected DetailBlockSummary electric;
    @XmlElement(name = "Mechanic")
    protected DetailBlockSummary mechanic;
    @XmlElement(name = "OpelGoodWill")
    protected DetailBlockSummary opelGoodWill;
    @XmlElement(name = "Dents")
    protected DetailBlockSummary dents;
    @XmlElement(name = "TotalSum")
    protected FieldDecimal totalSum;
    @XmlElement(name = "Discount")
    protected Discount discount;
    @XmlElement(name = "Wages")
    protected DetailBlockSummaryWages wages;

    /**
     * Ruft den Wert der allSum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getAllSum() {
        return allSum;
    }

    /**
     * Legt den Wert der allSum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setAllSum(FieldDecimal value) {
        this.allSum = value;
    }

    /**
     * Ruft den Wert der bodywork-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DetailBlockSummary }
     *     
     */
    public DetailBlockSummary getBodywork() {
        return bodywork;
    }

    /**
     * Legt den Wert der bodywork-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailBlockSummary }
     *     
     */
    public void setBodywork(DetailBlockSummary value) {
        this.bodywork = value;
    }

    /**
     * Ruft den Wert der electric-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DetailBlockSummary }
     *     
     */
    public DetailBlockSummary getElectric() {
        return electric;
    }

    /**
     * Legt den Wert der electric-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailBlockSummary }
     *     
     */
    public void setElectric(DetailBlockSummary value) {
        this.electric = value;
    }

    /**
     * Ruft den Wert der mechanic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DetailBlockSummary }
     *     
     */
    public DetailBlockSummary getMechanic() {
        return mechanic;
    }

    /**
     * Legt den Wert der mechanic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailBlockSummary }
     *     
     */
    public void setMechanic(DetailBlockSummary value) {
        this.mechanic = value;
    }

    /**
     * Ruft den Wert der opelGoodWill-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DetailBlockSummary }
     *     
     */
    public DetailBlockSummary getOpelGoodWill() {
        return opelGoodWill;
    }

    /**
     * Legt den Wert der opelGoodWill-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailBlockSummary }
     *     
     */
    public void setOpelGoodWill(DetailBlockSummary value) {
        this.opelGoodWill = value;
    }

    /**
     * Ruft den Wert der dents-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DetailBlockSummary }
     *     
     */
    public DetailBlockSummary getDents() {
        return dents;
    }

    /**
     * Legt den Wert der dents-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailBlockSummary }
     *     
     */
    public void setDents(DetailBlockSummary value) {
        this.dents = value;
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
     * Ruft den Wert der wages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DetailBlockSummaryWages }
     *     
     */
    public DetailBlockSummaryWages getWages() {
        return wages;
    }

    /**
     * Legt den Wert der wages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailBlockSummaryWages }
     *     
     */
    public void setWages(DetailBlockSummaryWages value) {
        this.wages = value;
    }

}
