
package de.dat.financeline.services.evaluation;

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
 *         &lt;element name="LiabilityInsuranceTypeClass" type="{http://www.dat.de/vxs}fieldString2" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatLiabilityInsuranceTypeClass" type="{http://www.dat.de/vxs}fieldString2" minOccurs="0" form="qualified"/>
 *         &lt;element name="PartialCascoTypeClass" type="{http://www.dat.de/vxs}fieldString2" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatPartialCascoTypeClass" type="{http://www.dat.de/vxs}fieldString2" minOccurs="0" form="qualified"/>
 *         &lt;element name="ComprCascoTypeClass" type="{http://www.dat.de/vxs}fieldString2" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatComprCascoTypeClass" type="{http://www.dat.de/vxs}fieldString2" minOccurs="0" form="qualified"/>
 *         &lt;element name="TaxationDescription" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="TaxPerYear" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatTaxPerYear" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TaxPer100ccm" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatTaxPer100ccm" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "RunningExpenses")
public class RunningExpenses {

    @XmlElement(name = "LiabilityInsuranceTypeClass")
    protected FieldString2 liabilityInsuranceTypeClass;
    @XmlElement(name = "DatLiabilityInsuranceTypeClass")
    protected FieldString2 datLiabilityInsuranceTypeClass;
    @XmlElement(name = "PartialCascoTypeClass")
    protected FieldString2 partialCascoTypeClass;
    @XmlElement(name = "DatPartialCascoTypeClass")
    protected FieldString2 datPartialCascoTypeClass;
    @XmlElement(name = "ComprCascoTypeClass")
    protected FieldString2 comprCascoTypeClass;
    @XmlElement(name = "DatComprCascoTypeClass")
    protected FieldString2 datComprCascoTypeClass;
    @XmlElement(name = "TaxationDescription")
    protected FieldString taxationDescription;
    @XmlElement(name = "TaxPerYear")
    protected FieldDecimal taxPerYear;
    @XmlElement(name = "DatTaxPerYear")
    protected FieldDecimal datTaxPerYear;
    @XmlElement(name = "TaxPer100ccm")
    protected FieldDecimal taxPer100Ccm;
    @XmlElement(name = "DatTaxPer100ccm")
    protected FieldDecimal datTaxPer100Ccm;

    /**
     * Ruft den Wert der liabilityInsuranceTypeClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString2 }
     *     
     */
    public FieldString2 getLiabilityInsuranceTypeClass() {
        return liabilityInsuranceTypeClass;
    }

    /**
     * Legt den Wert der liabilityInsuranceTypeClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString2 }
     *     
     */
    public void setLiabilityInsuranceTypeClass(FieldString2 value) {
        this.liabilityInsuranceTypeClass = value;
    }

    /**
     * Ruft den Wert der datLiabilityInsuranceTypeClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString2 }
     *     
     */
    public FieldString2 getDatLiabilityInsuranceTypeClass() {
        return datLiabilityInsuranceTypeClass;
    }

    /**
     * Legt den Wert der datLiabilityInsuranceTypeClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString2 }
     *     
     */
    public void setDatLiabilityInsuranceTypeClass(FieldString2 value) {
        this.datLiabilityInsuranceTypeClass = value;
    }

    /**
     * Ruft den Wert der partialCascoTypeClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString2 }
     *     
     */
    public FieldString2 getPartialCascoTypeClass() {
        return partialCascoTypeClass;
    }

    /**
     * Legt den Wert der partialCascoTypeClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString2 }
     *     
     */
    public void setPartialCascoTypeClass(FieldString2 value) {
        this.partialCascoTypeClass = value;
    }

    /**
     * Ruft den Wert der datPartialCascoTypeClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString2 }
     *     
     */
    public FieldString2 getDatPartialCascoTypeClass() {
        return datPartialCascoTypeClass;
    }

    /**
     * Legt den Wert der datPartialCascoTypeClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString2 }
     *     
     */
    public void setDatPartialCascoTypeClass(FieldString2 value) {
        this.datPartialCascoTypeClass = value;
    }

    /**
     * Ruft den Wert der comprCascoTypeClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString2 }
     *     
     */
    public FieldString2 getComprCascoTypeClass() {
        return comprCascoTypeClass;
    }

    /**
     * Legt den Wert der comprCascoTypeClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString2 }
     *     
     */
    public void setComprCascoTypeClass(FieldString2 value) {
        this.comprCascoTypeClass = value;
    }

    /**
     * Ruft den Wert der datComprCascoTypeClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString2 }
     *     
     */
    public FieldString2 getDatComprCascoTypeClass() {
        return datComprCascoTypeClass;
    }

    /**
     * Legt den Wert der datComprCascoTypeClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString2 }
     *     
     */
    public void setDatComprCascoTypeClass(FieldString2 value) {
        this.datComprCascoTypeClass = value;
    }

    /**
     * Ruft den Wert der taxationDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTaxationDescription() {
        return taxationDescription;
    }

    /**
     * Legt den Wert der taxationDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTaxationDescription(FieldString value) {
        this.taxationDescription = value;
    }

    /**
     * Ruft den Wert der taxPerYear-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTaxPerYear() {
        return taxPerYear;
    }

    /**
     * Legt den Wert der taxPerYear-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTaxPerYear(FieldDecimal value) {
        this.taxPerYear = value;
    }

    /**
     * Ruft den Wert der datTaxPerYear-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatTaxPerYear() {
        return datTaxPerYear;
    }

    /**
     * Legt den Wert der datTaxPerYear-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatTaxPerYear(FieldDecimal value) {
        this.datTaxPerYear = value;
    }

    /**
     * Ruft den Wert der taxPer100Ccm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTaxPer100Ccm() {
        return taxPer100Ccm;
    }

    /**
     * Legt den Wert der taxPer100Ccm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTaxPer100Ccm(FieldDecimal value) {
        this.taxPer100Ccm = value;
    }

    /**
     * Ruft den Wert der datTaxPer100Ccm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatTaxPer100Ccm() {
        return datTaxPer100Ccm;
    }

    /**
     * Legt den Wert der datTaxPer100Ccm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatTaxPer100Ccm(FieldDecimal value) {
        this.datTaxPer100Ccm = value;
    }

}
