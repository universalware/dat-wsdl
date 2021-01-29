
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für contractRequest106 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="contractRequest106">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/VehicleRepairService}contractRequest">
 *       &lt;sequence>
 *         &lt;element name="additionalData" type="{http://sphinx.dat.de/services/VehicleRepairService}createContractAdditionalData" minOccurs="0"/>
 *         &lt;element name="damageDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="damageLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="damageNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="damageType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="existingAssignmentDeclaration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="franchiseValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="insuranceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="insuranceType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isFranchise" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isInsuranceCase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="mileageUnit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="opponentCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opponentCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opponentEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opponentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opponentName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opponentPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opponentPreTaxAuthorized" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="opponentRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opponentStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opponentStreetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opponentTitel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opponentZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownerPreTaxAuthorized" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="policyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyholderCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyholderCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyholderEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyholderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyholderName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyholderPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyholderPreTaxAuthorized" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="policyholderStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyholderStreetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyholderTitel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyholderZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractRequest106", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "additionalData",
    "damageDate",
    "damageLocation",
    "damageNumber",
    "damageType",
    "existingAssignmentDeclaration",
    "franchiseValue",
    "insuranceId",
    "insuranceType",
    "isFranchise",
    "isInsuranceCase",
    "mileageUnit",
    "opponentCity",
    "opponentCountry",
    "opponentEmail",
    "opponentName",
    "opponentName2",
    "opponentPhone",
    "opponentPreTaxAuthorized",
    "opponentRegistrationNumber",
    "opponentStreet",
    "opponentStreetNumber",
    "opponentTitel",
    "opponentZIP",
    "ownerPreTaxAuthorized",
    "policyNumber",
    "policyholderCity",
    "policyholderCountry",
    "policyholderEmail",
    "policyholderName",
    "policyholderName2",
    "policyholderPhone",
    "policyholderPreTaxAuthorized",
    "policyholderStreet",
    "policyholderStreetNumber",
    "policyholderTitel",
    "policyholderZIP"
})
public class ContractRequest106
    extends ContractRequest
{

    @XmlElementRef(name = "additionalData", type = JAXBElement.class, required = false)
    protected JAXBElement<CreateContractAdditionalData> additionalData;
    @XmlElementRef(name = "damageDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> damageDate;
    @XmlElementRef(name = "damageLocation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> damageLocation;
    @XmlElementRef(name = "damageNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> damageNumber;
    @XmlElementRef(name = "damageType", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> damageType;
    @XmlElementRef(name = "existingAssignmentDeclaration", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> existingAssignmentDeclaration;
    @XmlElementRef(name = "franchiseValue", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> franchiseValue;
    @XmlElementRef(name = "insuranceId", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> insuranceId;
    @XmlElementRef(name = "insuranceType", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> insuranceType;
    @XmlElementRef(name = "isFranchise", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> isFranchise;
    @XmlElementRef(name = "isInsuranceCase", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isInsuranceCase;
    @XmlElementRef(name = "mileageUnit", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mileageUnit;
    @XmlElementRef(name = "opponentCity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opponentCity;
    @XmlElementRef(name = "opponentCountry", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opponentCountry;
    @XmlElementRef(name = "opponentEmail", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opponentEmail;
    @XmlElementRef(name = "opponentName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opponentName;
    @XmlElementRef(name = "opponentName2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opponentName2;
    @XmlElementRef(name = "opponentPhone", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opponentPhone;
    @XmlElementRef(name = "opponentPreTaxAuthorized", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> opponentPreTaxAuthorized;
    @XmlElementRef(name = "opponentRegistrationNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opponentRegistrationNumber;
    @XmlElementRef(name = "opponentStreet", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opponentStreet;
    @XmlElementRef(name = "opponentStreetNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opponentStreetNumber;
    @XmlElementRef(name = "opponentTitel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opponentTitel;
    @XmlElementRef(name = "opponentZIP", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opponentZIP;
    @XmlElement(namespace = "", defaultValue = "0")
    protected Integer ownerPreTaxAuthorized;
    @XmlElementRef(name = "policyNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyNumber;
    @XmlElementRef(name = "policyholderCity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyholderCity;
    @XmlElementRef(name = "policyholderCountry", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyholderCountry;
    @XmlElementRef(name = "policyholderEmail", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyholderEmail;
    @XmlElementRef(name = "policyholderName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyholderName;
    @XmlElementRef(name = "policyholderName2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyholderName2;
    @XmlElementRef(name = "policyholderPhone", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyholderPhone;
    @XmlElementRef(name = "policyholderPreTaxAuthorized", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> policyholderPreTaxAuthorized;
    @XmlElementRef(name = "policyholderStreet", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyholderStreet;
    @XmlElementRef(name = "policyholderStreetNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyholderStreetNumber;
    @XmlElementRef(name = "policyholderTitel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyholderTitel;
    @XmlElementRef(name = "policyholderZIP", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyholderZIP;

    /**
     * Ruft den Wert der additionalData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreateContractAdditionalData }{@code >}
     *     
     */
    public JAXBElement<CreateContractAdditionalData> getAdditionalData() {
        return additionalData;
    }

    /**
     * Legt den Wert der additionalData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreateContractAdditionalData }{@code >}
     *     
     */
    public void setAdditionalData(JAXBElement<CreateContractAdditionalData> value) {
        this.additionalData = value;
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
     * Ruft den Wert der damageLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDamageLocation() {
        return damageLocation;
    }

    /**
     * Legt den Wert der damageLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDamageLocation(JAXBElement<String> value) {
        this.damageLocation = value;
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
     * Ruft den Wert der existingAssignmentDeclaration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getExistingAssignmentDeclaration() {
        return existingAssignmentDeclaration;
    }

    /**
     * Legt den Wert der existingAssignmentDeclaration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setExistingAssignmentDeclaration(JAXBElement<Integer> value) {
        this.existingAssignmentDeclaration = value;
    }

    /**
     * Ruft den Wert der franchiseValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getFranchiseValue() {
        return franchiseValue;
    }

    /**
     * Legt den Wert der franchiseValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setFranchiseValue(JAXBElement<BigDecimal> value) {
        this.franchiseValue = value;
    }

    /**
     * Ruft den Wert der insuranceId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInsuranceId() {
        return insuranceId;
    }

    /**
     * Legt den Wert der insuranceId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInsuranceId(JAXBElement<Integer> value) {
        this.insuranceId = value;
    }

    /**
     * Ruft den Wert der insuranceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInsuranceType() {
        return insuranceType;
    }

    /**
     * Legt den Wert der insuranceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInsuranceType(JAXBElement<Integer> value) {
        this.insuranceType = value;
    }

    /**
     * Ruft den Wert der isFranchise-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIsFranchise() {
        return isFranchise;
    }

    /**
     * Legt den Wert der isFranchise-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIsFranchise(JAXBElement<Integer> value) {
        this.isFranchise = value;
    }

    /**
     * Ruft den Wert der isInsuranceCase-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsInsuranceCase() {
        return isInsuranceCase;
    }

    /**
     * Legt den Wert der isInsuranceCase-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsInsuranceCase(JAXBElement<Boolean> value) {
        this.isInsuranceCase = value;
    }

    /**
     * Ruft den Wert der mileageUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMileageUnit() {
        return mileageUnit;
    }

    /**
     * Legt den Wert der mileageUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMileageUnit(JAXBElement<Integer> value) {
        this.mileageUnit = value;
    }

    /**
     * Ruft den Wert der opponentCity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpponentCity() {
        return opponentCity;
    }

    /**
     * Legt den Wert der opponentCity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpponentCity(JAXBElement<String> value) {
        this.opponentCity = value;
    }

    /**
     * Ruft den Wert der opponentCountry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpponentCountry() {
        return opponentCountry;
    }

    /**
     * Legt den Wert der opponentCountry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpponentCountry(JAXBElement<String> value) {
        this.opponentCountry = value;
    }

    /**
     * Ruft den Wert der opponentEmail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpponentEmail() {
        return opponentEmail;
    }

    /**
     * Legt den Wert der opponentEmail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpponentEmail(JAXBElement<String> value) {
        this.opponentEmail = value;
    }

    /**
     * Ruft den Wert der opponentName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpponentName() {
        return opponentName;
    }

    /**
     * Legt den Wert der opponentName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpponentName(JAXBElement<String> value) {
        this.opponentName = value;
    }

    /**
     * Ruft den Wert der opponentName2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpponentName2() {
        return opponentName2;
    }

    /**
     * Legt den Wert der opponentName2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpponentName2(JAXBElement<String> value) {
        this.opponentName2 = value;
    }

    /**
     * Ruft den Wert der opponentPhone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpponentPhone() {
        return opponentPhone;
    }

    /**
     * Legt den Wert der opponentPhone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpponentPhone(JAXBElement<String> value) {
        this.opponentPhone = value;
    }

    /**
     * Ruft den Wert der opponentPreTaxAuthorized-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOpponentPreTaxAuthorized() {
        return opponentPreTaxAuthorized;
    }

    /**
     * Legt den Wert der opponentPreTaxAuthorized-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOpponentPreTaxAuthorized(JAXBElement<Integer> value) {
        this.opponentPreTaxAuthorized = value;
    }

    /**
     * Ruft den Wert der opponentRegistrationNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpponentRegistrationNumber() {
        return opponentRegistrationNumber;
    }

    /**
     * Legt den Wert der opponentRegistrationNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpponentRegistrationNumber(JAXBElement<String> value) {
        this.opponentRegistrationNumber = value;
    }

    /**
     * Ruft den Wert der opponentStreet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpponentStreet() {
        return opponentStreet;
    }

    /**
     * Legt den Wert der opponentStreet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpponentStreet(JAXBElement<String> value) {
        this.opponentStreet = value;
    }

    /**
     * Ruft den Wert der opponentStreetNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpponentStreetNumber() {
        return opponentStreetNumber;
    }

    /**
     * Legt den Wert der opponentStreetNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpponentStreetNumber(JAXBElement<String> value) {
        this.opponentStreetNumber = value;
    }

    /**
     * Ruft den Wert der opponentTitel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpponentTitel() {
        return opponentTitel;
    }

    /**
     * Legt den Wert der opponentTitel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpponentTitel(JAXBElement<String> value) {
        this.opponentTitel = value;
    }

    /**
     * Ruft den Wert der opponentZIP-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpponentZIP() {
        return opponentZIP;
    }

    /**
     * Legt den Wert der opponentZIP-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpponentZIP(JAXBElement<String> value) {
        this.opponentZIP = value;
    }

    /**
     * Ruft den Wert der ownerPreTaxAuthorized-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOwnerPreTaxAuthorized() {
        return ownerPreTaxAuthorized;
    }

    /**
     * Legt den Wert der ownerPreTaxAuthorized-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOwnerPreTaxAuthorized(Integer value) {
        this.ownerPreTaxAuthorized = value;
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
     * Ruft den Wert der policyholderCity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyholderCity() {
        return policyholderCity;
    }

    /**
     * Legt den Wert der policyholderCity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyholderCity(JAXBElement<String> value) {
        this.policyholderCity = value;
    }

    /**
     * Ruft den Wert der policyholderCountry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyholderCountry() {
        return policyholderCountry;
    }

    /**
     * Legt den Wert der policyholderCountry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyholderCountry(JAXBElement<String> value) {
        this.policyholderCountry = value;
    }

    /**
     * Ruft den Wert der policyholderEmail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyholderEmail() {
        return policyholderEmail;
    }

    /**
     * Legt den Wert der policyholderEmail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyholderEmail(JAXBElement<String> value) {
        this.policyholderEmail = value;
    }

    /**
     * Ruft den Wert der policyholderName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyholderName() {
        return policyholderName;
    }

    /**
     * Legt den Wert der policyholderName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyholderName(JAXBElement<String> value) {
        this.policyholderName = value;
    }

    /**
     * Ruft den Wert der policyholderName2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyholderName2() {
        return policyholderName2;
    }

    /**
     * Legt den Wert der policyholderName2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyholderName2(JAXBElement<String> value) {
        this.policyholderName2 = value;
    }

    /**
     * Ruft den Wert der policyholderPhone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyholderPhone() {
        return policyholderPhone;
    }

    /**
     * Legt den Wert der policyholderPhone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyholderPhone(JAXBElement<String> value) {
        this.policyholderPhone = value;
    }

    /**
     * Ruft den Wert der policyholderPreTaxAuthorized-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPolicyholderPreTaxAuthorized() {
        return policyholderPreTaxAuthorized;
    }

    /**
     * Legt den Wert der policyholderPreTaxAuthorized-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPolicyholderPreTaxAuthorized(JAXBElement<Integer> value) {
        this.policyholderPreTaxAuthorized = value;
    }

    /**
     * Ruft den Wert der policyholderStreet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyholderStreet() {
        return policyholderStreet;
    }

    /**
     * Legt den Wert der policyholderStreet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyholderStreet(JAXBElement<String> value) {
        this.policyholderStreet = value;
    }

    /**
     * Ruft den Wert der policyholderStreetNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyholderStreetNumber() {
        return policyholderStreetNumber;
    }

    /**
     * Legt den Wert der policyholderStreetNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyholderStreetNumber(JAXBElement<String> value) {
        this.policyholderStreetNumber = value;
    }

    /**
     * Ruft den Wert der policyholderTitel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyholderTitel() {
        return policyholderTitel;
    }

    /**
     * Legt den Wert der policyholderTitel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyholderTitel(JAXBElement<String> value) {
        this.policyholderTitel = value;
    }

    /**
     * Ruft den Wert der policyholderZIP-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyholderZIP() {
        return policyholderZIP;
    }

    /**
     * Legt den Wert der policyholderZIP-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyholderZIP(JAXBElement<String> value) {
        this.policyholderZIP = value;
    }

}
