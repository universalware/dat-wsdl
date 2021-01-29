
package de.dat.glassrep.services.dmsgetcontracts;

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
 *         &lt;element name="SalesPriceNet" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SalesPriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PurchasePriceNet" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PurchasePriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="VehicleNewPriceNet" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="VehicleNewPriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LabelPriceNet" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LabelPriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SalesPriceMinimumNet" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SalesPriceMinimumGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ResellerSalesPriceNet" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ResellerSalesPriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="NominalDaysOnLot" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatNominalDaysOnLot" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "PriceCalculation")
public class PriceCalculation {

    @XmlElement(name = "SalesPriceNet")
    protected FieldDecimal salesPriceNet;
    @XmlElement(name = "SalesPriceGross")
    protected FieldDecimal salesPriceGross;
    @XmlElement(name = "PurchasePriceNet")
    protected FieldDecimal purchasePriceNet;
    @XmlElement(name = "PurchasePriceGross")
    protected FieldDecimal purchasePriceGross;
    @XmlElement(name = "VehicleNewPriceNet")
    protected FieldDecimal vehicleNewPriceNet;
    @XmlElement(name = "VehicleNewPriceGross")
    protected FieldDecimal vehicleNewPriceGross;
    @XmlElement(name = "LabelPriceNet")
    protected FieldDecimal labelPriceNet;
    @XmlElement(name = "LabelPriceGross")
    protected FieldDecimal labelPriceGross;
    @XmlElement(name = "SalesPriceMinimumNet")
    protected FieldDecimal salesPriceMinimumNet;
    @XmlElement(name = "SalesPriceMinimumGross")
    protected FieldDecimal salesPriceMinimumGross;
    @XmlElement(name = "ResellerSalesPriceNet")
    protected FieldDecimal resellerSalesPriceNet;
    @XmlElement(name = "ResellerSalesPriceGross")
    protected FieldDecimal resellerSalesPriceGross;
    @XmlElement(name = "NominalDaysOnLot")
    protected FieldDecimal nominalDaysOnLot;
    @XmlElement(name = "DatNominalDaysOnLot")
    protected FieldDecimal datNominalDaysOnLot;

    /**
     * Ruft den Wert der salesPriceNet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSalesPriceNet() {
        return salesPriceNet;
    }

    /**
     * Legt den Wert der salesPriceNet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSalesPriceNet(FieldDecimal value) {
        this.salesPriceNet = value;
    }

    /**
     * Ruft den Wert der salesPriceGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSalesPriceGross() {
        return salesPriceGross;
    }

    /**
     * Legt den Wert der salesPriceGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSalesPriceGross(FieldDecimal value) {
        this.salesPriceGross = value;
    }

    /**
     * Ruft den Wert der purchasePriceNet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPurchasePriceNet() {
        return purchasePriceNet;
    }

    /**
     * Legt den Wert der purchasePriceNet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPurchasePriceNet(FieldDecimal value) {
        this.purchasePriceNet = value;
    }

    /**
     * Ruft den Wert der purchasePriceGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPurchasePriceGross() {
        return purchasePriceGross;
    }

    /**
     * Legt den Wert der purchasePriceGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPurchasePriceGross(FieldDecimal value) {
        this.purchasePriceGross = value;
    }

    /**
     * Ruft den Wert der vehicleNewPriceNet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getVehicleNewPriceNet() {
        return vehicleNewPriceNet;
    }

    /**
     * Legt den Wert der vehicleNewPriceNet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setVehicleNewPriceNet(FieldDecimal value) {
        this.vehicleNewPriceNet = value;
    }

    /**
     * Ruft den Wert der vehicleNewPriceGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getVehicleNewPriceGross() {
        return vehicleNewPriceGross;
    }

    /**
     * Legt den Wert der vehicleNewPriceGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setVehicleNewPriceGross(FieldDecimal value) {
        this.vehicleNewPriceGross = value;
    }

    /**
     * Ruft den Wert der labelPriceNet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLabelPriceNet() {
        return labelPriceNet;
    }

    /**
     * Legt den Wert der labelPriceNet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLabelPriceNet(FieldDecimal value) {
        this.labelPriceNet = value;
    }

    /**
     * Ruft den Wert der labelPriceGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLabelPriceGross() {
        return labelPriceGross;
    }

    /**
     * Legt den Wert der labelPriceGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLabelPriceGross(FieldDecimal value) {
        this.labelPriceGross = value;
    }

    /**
     * Ruft den Wert der salesPriceMinimumNet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSalesPriceMinimumNet() {
        return salesPriceMinimumNet;
    }

    /**
     * Legt den Wert der salesPriceMinimumNet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSalesPriceMinimumNet(FieldDecimal value) {
        this.salesPriceMinimumNet = value;
    }

    /**
     * Ruft den Wert der salesPriceMinimumGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSalesPriceMinimumGross() {
        return salesPriceMinimumGross;
    }

    /**
     * Legt den Wert der salesPriceMinimumGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSalesPriceMinimumGross(FieldDecimal value) {
        this.salesPriceMinimumGross = value;
    }

    /**
     * Ruft den Wert der resellerSalesPriceNet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getResellerSalesPriceNet() {
        return resellerSalesPriceNet;
    }

    /**
     * Legt den Wert der resellerSalesPriceNet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setResellerSalesPriceNet(FieldDecimal value) {
        this.resellerSalesPriceNet = value;
    }

    /**
     * Ruft den Wert der resellerSalesPriceGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getResellerSalesPriceGross() {
        return resellerSalesPriceGross;
    }

    /**
     * Legt den Wert der resellerSalesPriceGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setResellerSalesPriceGross(FieldDecimal value) {
        this.resellerSalesPriceGross = value;
    }

    /**
     * Ruft den Wert der nominalDaysOnLot-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getNominalDaysOnLot() {
        return nominalDaysOnLot;
    }

    /**
     * Legt den Wert der nominalDaysOnLot-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setNominalDaysOnLot(FieldDecimal value) {
        this.nominalDaysOnLot = value;
    }

    /**
     * Ruft den Wert der datNominalDaysOnLot-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatNominalDaysOnLot() {
        return datNominalDaysOnLot;
    }

    /**
     * Legt den Wert der datNominalDaysOnLot-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatNominalDaysOnLot(FieldDecimal value) {
        this.datNominalDaysOnLot = value;
    }

}
