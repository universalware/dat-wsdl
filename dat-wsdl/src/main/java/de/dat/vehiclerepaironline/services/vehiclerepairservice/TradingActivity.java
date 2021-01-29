
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

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
 *         &lt;element name="State" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}PlanData" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}Purchase" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}PriceCalculation" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}Admission" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}Sale" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}SalesPreparation" minOccurs="0"/>
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
@XmlRootElement(name = "TradingActivity")
public class TradingActivity {

    @XmlElement(name = "State")
    protected FieldString state;
    @XmlElement(name = "PlanData")
    protected PlanData planData;
    @XmlElement(name = "Purchase")
    protected Purchase purchase;
    @XmlElement(name = "PriceCalculation")
    protected PriceCalculation priceCalculation;
    @XmlElement(name = "Admission")
    protected Admission admission;
    @XmlElement(name = "Sale")
    protected Sale sale;
    @XmlElement(name = "SalesPreparation")
    protected SalesPreparation salesPreparation;

    /**
     * Ruft den Wert der state-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getState() {
        return state;
    }

    /**
     * Legt den Wert der state-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setState(FieldString value) {
        this.state = value;
    }

    /**
     * Ruft den Wert der planData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PlanData }
     *     
     */
    public PlanData getPlanData() {
        return planData;
    }

    /**
     * Legt den Wert der planData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanData }
     *     
     */
    public void setPlanData(PlanData value) {
        this.planData = value;
    }

    /**
     * Ruft den Wert der purchase-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Purchase }
     *     
     */
    public Purchase getPurchase() {
        return purchase;
    }

    /**
     * Legt den Wert der purchase-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Purchase }
     *     
     */
    public void setPurchase(Purchase value) {
        this.purchase = value;
    }

    /**
     * Ruft den Wert der priceCalculation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PriceCalculation }
     *     
     */
    public PriceCalculation getPriceCalculation() {
        return priceCalculation;
    }

    /**
     * Legt den Wert der priceCalculation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceCalculation }
     *     
     */
    public void setPriceCalculation(PriceCalculation value) {
        this.priceCalculation = value;
    }

    /**
     * Ruft den Wert der admission-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Admission }
     *     
     */
    public Admission getAdmission() {
        return admission;
    }

    /**
     * Legt den Wert der admission-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Admission }
     *     
     */
    public void setAdmission(Admission value) {
        this.admission = value;
    }

    /**
     * Ruft den Wert der sale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Sale }
     *     
     */
    public Sale getSale() {
        return sale;
    }

    /**
     * Legt den Wert der sale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Sale }
     *     
     */
    public void setSale(Sale value) {
        this.sale = value;
    }

    /**
     * Ruft den Wert der salesPreparation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SalesPreparation }
     *     
     */
    public SalesPreparation getSalesPreparation() {
        return salesPreparation;
    }

    /**
     * Legt den Wert der salesPreparation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesPreparation }
     *     
     */
    public void setSalesPreparation(SalesPreparation value) {
        this.salesPreparation = value;
    }

}
