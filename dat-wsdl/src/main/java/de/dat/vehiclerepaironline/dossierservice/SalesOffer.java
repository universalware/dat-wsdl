
package de.dat.vehiclerepaironline.dossierservice;

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
 *         &lt;element name="SalesOfferNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="OfferDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="ResubmissionDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="GuaranteeDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="OfferedBy" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="RenewMot" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Titles" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Comments" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Agreements" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="NextEmissionsTestDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="NextVehicleInspectionDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="RenewEmissionVehicleInspectionCheck" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "SalesOffer")
public class SalesOffer {

    @XmlElement(name = "SalesPriceNet")
    protected FieldDecimal salesPriceNet;
    @XmlElement(name = "SalesPriceGross")
    protected FieldDecimal salesPriceGross;
    @XmlElement(name = "SalesOfferNumber")
    protected FieldString salesOfferNumber;
    @XmlElement(name = "OfferDate")
    protected FieldDate offerDate;
    @XmlElement(name = "ResubmissionDate")
    protected FieldDate resubmissionDate;
    @XmlElement(name = "GuaranteeDate")
    protected FieldDate guaranteeDate;
    @XmlElement(name = "OfferedBy")
    protected FieldString offeredBy;
    @XmlElement(name = "RenewMot")
    protected FieldString renewMot;
    @XmlElement(name = "Titles")
    protected FieldString titles;
    @XmlElement(name = "Comments")
    protected FieldString comments;
    @XmlElement(name = "Agreements")
    protected FieldString agreements;
    @XmlElement(name = "NextEmissionsTestDate")
    protected FieldDate nextEmissionsTestDate;
    @XmlElement(name = "NextVehicleInspectionDate")
    protected FieldDate nextVehicleInspectionDate;
    @XmlElement(name = "RenewEmissionVehicleInspectionCheck")
    protected FieldBoolean renewEmissionVehicleInspectionCheck;

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
     * Ruft den Wert der salesOfferNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSalesOfferNumber() {
        return salesOfferNumber;
    }

    /**
     * Legt den Wert der salesOfferNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSalesOfferNumber(FieldString value) {
        this.salesOfferNumber = value;
    }

    /**
     * Ruft den Wert der offerDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getOfferDate() {
        return offerDate;
    }

    /**
     * Legt den Wert der offerDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setOfferDate(FieldDate value) {
        this.offerDate = value;
    }

    /**
     * Ruft den Wert der resubmissionDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getResubmissionDate() {
        return resubmissionDate;
    }

    /**
     * Legt den Wert der resubmissionDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setResubmissionDate(FieldDate value) {
        this.resubmissionDate = value;
    }

    /**
     * Ruft den Wert der guaranteeDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getGuaranteeDate() {
        return guaranteeDate;
    }

    /**
     * Legt den Wert der guaranteeDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setGuaranteeDate(FieldDate value) {
        this.guaranteeDate = value;
    }

    /**
     * Ruft den Wert der offeredBy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getOfferedBy() {
        return offeredBy;
    }

    /**
     * Legt den Wert der offeredBy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setOfferedBy(FieldString value) {
        this.offeredBy = value;
    }

    /**
     * Ruft den Wert der renewMot-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getRenewMot() {
        return renewMot;
    }

    /**
     * Legt den Wert der renewMot-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setRenewMot(FieldString value) {
        this.renewMot = value;
    }

    /**
     * Ruft den Wert der titles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTitles() {
        return titles;
    }

    /**
     * Legt den Wert der titles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTitles(FieldString value) {
        this.titles = value;
    }

    /**
     * Ruft den Wert der comments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getComments() {
        return comments;
    }

    /**
     * Legt den Wert der comments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setComments(FieldString value) {
        this.comments = value;
    }

    /**
     * Ruft den Wert der agreements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getAgreements() {
        return agreements;
    }

    /**
     * Legt den Wert der agreements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setAgreements(FieldString value) {
        this.agreements = value;
    }

    /**
     * Ruft den Wert der nextEmissionsTestDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getNextEmissionsTestDate() {
        return nextEmissionsTestDate;
    }

    /**
     * Legt den Wert der nextEmissionsTestDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setNextEmissionsTestDate(FieldDate value) {
        this.nextEmissionsTestDate = value;
    }

    /**
     * Ruft den Wert der nextVehicleInspectionDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getNextVehicleInspectionDate() {
        return nextVehicleInspectionDate;
    }

    /**
     * Legt den Wert der nextVehicleInspectionDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setNextVehicleInspectionDate(FieldDate value) {
        this.nextVehicleInspectionDate = value;
    }

    /**
     * Ruft den Wert der renewEmissionVehicleInspectionCheck-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getRenewEmissionVehicleInspectionCheck() {
        return renewEmissionVehicleInspectionCheck;
    }

    /**
     * Legt den Wert der renewEmissionVehicleInspectionCheck-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setRenewEmissionVehicleInspectionCheck(FieldBoolean value) {
        this.renewEmissionVehicleInspectionCheck = value;
    }

}
