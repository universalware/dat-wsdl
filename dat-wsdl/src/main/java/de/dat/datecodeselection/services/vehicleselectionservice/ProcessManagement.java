
package de.dat.datecodeselection.services.vehicleselectionservice;

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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dat.de/vxs}CustomDataList" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}DamageManagement" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}InvoiceDetail" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}AdditionalInsuranceData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "customDataList",
    "damageManagement",
    "invoiceDetail",
    "additionalInsuranceData"
})
@XmlRootElement(name = "ProcessManagement")
public class ProcessManagement {

    @XmlElement(name = "CustomDataList")
    protected CustomDataList customDataList;
    @XmlElement(name = "DamageManagement")
    protected DamageManagement damageManagement;
    @XmlElement(name = "InvoiceDetail")
    protected InvoiceDetail invoiceDetail;
    @XmlElement(name = "AdditionalInsuranceData")
    protected AdditionalInsuranceData additionalInsuranceData;

    /**
     * Ruft den Wert der customDataList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomDataList }
     *     
     */
    public CustomDataList getCustomDataList() {
        return customDataList;
    }

    /**
     * Legt den Wert der customDataList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomDataList }
     *     
     */
    public void setCustomDataList(CustomDataList value) {
        this.customDataList = value;
    }

    /**
     * Ruft den Wert der damageManagement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DamageManagement }
     *     
     */
    public DamageManagement getDamageManagement() {
        return damageManagement;
    }

    /**
     * Legt den Wert der damageManagement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DamageManagement }
     *     
     */
    public void setDamageManagement(DamageManagement value) {
        this.damageManagement = value;
    }

    /**
     * Ruft den Wert der invoiceDetail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetail }
     *     
     */
    public InvoiceDetail getInvoiceDetail() {
        return invoiceDetail;
    }

    /**
     * Legt den Wert der invoiceDetail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetail }
     *     
     */
    public void setInvoiceDetail(InvoiceDetail value) {
        this.invoiceDetail = value;
    }

    /**
     * Ruft den Wert der additionalInsuranceData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInsuranceData }
     *     
     */
    public AdditionalInsuranceData getAdditionalInsuranceData() {
        return additionalInsuranceData;
    }

    /**
     * Legt den Wert der additionalInsuranceData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInsuranceData }
     *     
     */
    public void setAdditionalInsuranceData(AdditionalInsuranceData value) {
        this.additionalInsuranceData = value;
    }

}
