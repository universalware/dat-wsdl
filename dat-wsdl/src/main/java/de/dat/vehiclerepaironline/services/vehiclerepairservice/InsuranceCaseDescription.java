
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für insuranceCaseDescription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="insuranceCaseDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="damageDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="damageNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="damageType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="declarationOfAssignment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="inspectionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="insuranceAgency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuranceGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuranceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuranceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuranceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="repairCoverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retention" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="retentionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insuranceCaseDescription", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "creationDateTime",
    "damageDate",
    "damageNumber",
    "damageType",
    "declarationOfAssignment",
    "inspectionDate",
    "insuranceAgency",
    "insuranceGroupId",
    "insuranceId",
    "insuranceNumber",
    "insuranceType",
    "orderNumber",
    "policyNumber",
    "repairCoverage",
    "retention",
    "retentionAmount"
})
public class InsuranceCaseDescription {

    @XmlElementRef(name = "creationDateTime", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> creationDateTime;
    @XmlElementRef(name = "damageDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> damageDate;
    @XmlElementRef(name = "damageNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> damageNumber;
    @XmlElementRef(name = "damageType", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> damageType;
    @XmlElementRef(name = "declarationOfAssignment", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> declarationOfAssignment;
    @XmlElementRef(name = "inspectionDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> inspectionDate;
    @XmlElementRef(name = "insuranceAgency", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insuranceAgency;
    @XmlElementRef(name = "insuranceGroupId", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insuranceGroupId;
    @XmlElementRef(name = "insuranceId", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insuranceId;
    @XmlElementRef(name = "insuranceNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insuranceNumber;
    @XmlElementRef(name = "insuranceType", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insuranceType;
    @XmlElementRef(name = "orderNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderNumber;
    @XmlElementRef(name = "policyNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyNumber;
    @XmlElementRef(name = "repairCoverage", type = JAXBElement.class, required = false)
    protected JAXBElement<String> repairCoverage;
    @XmlElementRef(name = "retention", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> retention;
    @XmlElementRef(name = "retentionAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> retentionAmount;

    /**
     * Ruft den Wert der creationDateTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Legt den Wert der creationDateTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreationDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.creationDateTime = value;
    }

    /**
     * Ruft den Wert der damageDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDamageDate() {
        return damageDate;
    }

    /**
     * Legt den Wert der damageDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDamageDate(JAXBElement<XMLGregorianCalendar> value) {
        this.damageDate = value;
    }

    /**
     * Ruft den Wert der damageNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDamageNumber() {
        return damageNumber;
    }

    /**
     * Legt den Wert der damageNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDamageNumber(JAXBElement<String> value) {
        this.damageNumber = value;
    }

    /**
     * Ruft den Wert der damageType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDamageType() {
        return damageType;
    }

    /**
     * Legt den Wert der damageType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDamageType(JAXBElement<Integer> value) {
        this.damageType = value;
    }

    /**
     * Ruft den Wert der declarationOfAssignment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDeclarationOfAssignment() {
        return declarationOfAssignment;
    }

    /**
     * Legt den Wert der declarationOfAssignment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDeclarationOfAssignment(JAXBElement<Boolean> value) {
        this.declarationOfAssignment = value;
    }

    /**
     * Ruft den Wert der inspectionDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getInspectionDate() {
        return inspectionDate;
    }

    /**
     * Legt den Wert der inspectionDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setInspectionDate(JAXBElement<XMLGregorianCalendar> value) {
        this.inspectionDate = value;
    }

    /**
     * Ruft den Wert der insuranceAgency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuranceAgency() {
        return insuranceAgency;
    }

    /**
     * Legt den Wert der insuranceAgency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuranceAgency(JAXBElement<String> value) {
        this.insuranceAgency = value;
    }

    /**
     * Ruft den Wert der insuranceGroupId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuranceGroupId() {
        return insuranceGroupId;
    }

    /**
     * Legt den Wert der insuranceGroupId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuranceGroupId(JAXBElement<String> value) {
        this.insuranceGroupId = value;
    }

    /**
     * Ruft den Wert der insuranceId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuranceId() {
        return insuranceId;
    }

    /**
     * Legt den Wert der insuranceId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuranceId(JAXBElement<String> value) {
        this.insuranceId = value;
    }

    /**
     * Ruft den Wert der insuranceNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuranceNumber() {
        return insuranceNumber;
    }

    /**
     * Legt den Wert der insuranceNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuranceNumber(JAXBElement<String> value) {
        this.insuranceNumber = value;
    }

    /**
     * Ruft den Wert der insuranceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuranceType() {
        return insuranceType;
    }

    /**
     * Legt den Wert der insuranceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuranceType(JAXBElement<String> value) {
        this.insuranceType = value;
    }

    /**
     * Ruft den Wert der orderNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderNumber() {
        return orderNumber;
    }

    /**
     * Legt den Wert der orderNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderNumber(JAXBElement<String> value) {
        this.orderNumber = value;
    }

    /**
     * Ruft den Wert der policyNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Legt den Wert der policyNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyNumber(JAXBElement<String> value) {
        this.policyNumber = value;
    }

    /**
     * Ruft den Wert der repairCoverage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRepairCoverage() {
        return repairCoverage;
    }

    /**
     * Legt den Wert der repairCoverage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRepairCoverage(JAXBElement<String> value) {
        this.repairCoverage = value;
    }

    /**
     * Ruft den Wert der retention-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRetention() {
        return retention;
    }

    /**
     * Legt den Wert der retention-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRetention(JAXBElement<Boolean> value) {
        this.retention = value;
    }

    /**
     * Ruft den Wert der retentionAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRetentionAmount() {
        return retentionAmount;
    }

    /**
     * Legt den Wert der retentionAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRetentionAmount(JAXBElement<BigDecimal> value) {
        this.retentionAmount = value;
    }

}
