
package de.dat.financeline.services.dossier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="LacquerCosts" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LabourCosts" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SparePartsCosts" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Total" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TotalWithVAT" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "BlanketCalculation")
public class BlanketCalculation {

    @XmlElement(name = "LacquerCosts")
    protected FieldDecimal lacquerCosts;
    @XmlElement(name = "LabourCosts")
    protected FieldDecimal labourCosts;
    @XmlElement(name = "SparePartsCosts")
    protected FieldDecimal sparePartsCosts;
    @XmlElement(name = "Total")
    protected FieldDecimal total;
    @XmlElement(name = "TotalWithVAT")
    protected FieldDecimal totalWithVAT;

    /**
     * Ruft den Wert der lacquerCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerCosts() {
        return lacquerCosts;
    }

    /**
     * Legt den Wert der lacquerCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerCosts(FieldDecimal value) {
        this.lacquerCosts = value;
    }

    /**
     * Ruft den Wert der labourCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLabourCosts() {
        return labourCosts;
    }

    /**
     * Legt den Wert der labourCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLabourCosts(FieldDecimal value) {
        this.labourCosts = value;
    }

    /**
     * Ruft den Wert der sparePartsCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSparePartsCosts() {
        return sparePartsCosts;
    }

    /**
     * Legt den Wert der sparePartsCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSparePartsCosts(FieldDecimal value) {
        this.sparePartsCosts = value;
    }

    /**
     * Ruft den Wert der total-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTotal() {
        return total;
    }

    /**
     * Legt den Wert der total-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTotal(FieldDecimal value) {
        this.total = value;
    }

    /**
     * Ruft den Wert der totalWithVAT-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTotalWithVAT() {
        return totalWithVAT;
    }

    /**
     * Legt den Wert der totalWithVAT-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTotalWithVAT(FieldDecimal value) {
        this.totalWithVAT = value;
    }

}
