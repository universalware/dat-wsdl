
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
 *         &lt;element name="KbaCode" type="{http://www.dat.de/vxs}fieldString8" minOccurs="0" form="qualified"/>
 *         &lt;element name="KbaStructurePollution" type="{http://www.dat.de/vxs}fieldString30" minOccurs="0" form="qualified"/>
 *         &lt;element name="KbaEngineType" type="{http://www.dat.de/vxs}fieldString2" minOccurs="0" form="qualified"/>
 *         &lt;element name="LicenseNumber" type="{http://www.dat.de/vxs}fieldString30" minOccurs="0" form="qualified"/>
 *         &lt;element name="BaseNumber" type="{http://www.dat.de/vxs}fieldString9" minOccurs="0" form="qualified"/>
 *         &lt;element name="TypeNoteNumber" type="{http://www.dat.de/vxs}fieldString6" minOccurs="0" form="qualified"/>
 *         &lt;element name="NationalCodeAustria" type="{http://www.dat.de/vxs}fieldString6" minOccurs="0" form="qualified"/>
 *         &lt;element name="OpponentLicenseNumber" type="{http://www.dat.de/vxs}fieldString30" minOccurs="0" form="qualified"/>
 *         &lt;element name="LicenseNumberSale" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="RegistrationNumber" type="{http://www.dat.de/vxs}fieldString30" minOccurs="0" form="qualified"/>
 *         &lt;element name="SuspensionDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="CNIT" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="LicenseNumberAccident" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManufacturerName" type="{http://www.dat.de/vxs}fieldString30" minOccurs="0" form="qualified"/>
 *         &lt;element name="MotorIndicator" type="{http://www.dat.de/vxs}fieldString6" minOccurs="0" form="qualified"/>
 *         &lt;element name="RegistrationDocumentNumber" type="{http://www.dat.de/vxs}fieldString30" minOccurs="0" form="qualified"/>
 *         &lt;element name="SeasonalLicensePlateMonthFrom" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="SeasonalLicensePlateMonthTo" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "RegistrationData")
public class RegistrationData {

    @XmlElement(name = "KbaCode")
    protected FieldString8 kbaCode;
    @XmlElement(name = "KbaStructurePollution")
    protected FieldString30 kbaStructurePollution;
    @XmlElement(name = "KbaEngineType")
    protected FieldString2 kbaEngineType;
    @XmlElement(name = "LicenseNumber")
    protected FieldString30 licenseNumber;
    @XmlElement(name = "BaseNumber")
    protected FieldString9 baseNumber;
    @XmlElement(name = "TypeNoteNumber")
    protected FieldString6 typeNoteNumber;
    @XmlElement(name = "NationalCodeAustria")
    protected FieldString6 nationalCodeAustria;
    @XmlElement(name = "OpponentLicenseNumber")
    protected FieldString30 opponentLicenseNumber;
    @XmlElement(name = "LicenseNumberSale")
    protected FieldString licenseNumberSale;
    @XmlElement(name = "RegistrationNumber")
    protected FieldString30 registrationNumber;
    @XmlElement(name = "SuspensionDate")
    protected FieldDate suspensionDate;
    @XmlElement(name = "CNIT")
    protected FieldString cnit;
    @XmlElement(name = "LicenseNumberAccident")
    protected FieldString licenseNumberAccident;
    @XmlElement(name = "ManufacturerName")
    protected FieldString30 manufacturerName;
    @XmlElement(name = "MotorIndicator")
    protected FieldString6 motorIndicator;
    @XmlElement(name = "RegistrationDocumentNumber")
    protected FieldString30 registrationDocumentNumber;
    @XmlElement(name = "SeasonalLicensePlateMonthFrom")
    protected FieldInteger seasonalLicensePlateMonthFrom;
    @XmlElement(name = "SeasonalLicensePlateMonthTo")
    protected FieldInteger seasonalLicensePlateMonthTo;

    /**
     * Ruft den Wert der kbaCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString8 }
     *     
     */
    public FieldString8 getKbaCode() {
        return kbaCode;
    }

    /**
     * Legt den Wert der kbaCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString8 }
     *     
     */
    public void setKbaCode(FieldString8 value) {
        this.kbaCode = value;
    }

    /**
     * Ruft den Wert der kbaStructurePollution-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString30 }
     *     
     */
    public FieldString30 getKbaStructurePollution() {
        return kbaStructurePollution;
    }

    /**
     * Legt den Wert der kbaStructurePollution-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString30 }
     *     
     */
    public void setKbaStructurePollution(FieldString30 value) {
        this.kbaStructurePollution = value;
    }

    /**
     * Ruft den Wert der kbaEngineType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString2 }
     *     
     */
    public FieldString2 getKbaEngineType() {
        return kbaEngineType;
    }

    /**
     * Legt den Wert der kbaEngineType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString2 }
     *     
     */
    public void setKbaEngineType(FieldString2 value) {
        this.kbaEngineType = value;
    }

    /**
     * Ruft den Wert der licenseNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString30 }
     *     
     */
    public FieldString30 getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Legt den Wert der licenseNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString30 }
     *     
     */
    public void setLicenseNumber(FieldString30 value) {
        this.licenseNumber = value;
    }

    /**
     * Ruft den Wert der baseNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString9 }
     *     
     */
    public FieldString9 getBaseNumber() {
        return baseNumber;
    }

    /**
     * Legt den Wert der baseNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString9 }
     *     
     */
    public void setBaseNumber(FieldString9 value) {
        this.baseNumber = value;
    }

    /**
     * Ruft den Wert der typeNoteNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString6 }
     *     
     */
    public FieldString6 getTypeNoteNumber() {
        return typeNoteNumber;
    }

    /**
     * Legt den Wert der typeNoteNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString6 }
     *     
     */
    public void setTypeNoteNumber(FieldString6 value) {
        this.typeNoteNumber = value;
    }

    /**
     * Ruft den Wert der nationalCodeAustria-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString6 }
     *     
     */
    public FieldString6 getNationalCodeAustria() {
        return nationalCodeAustria;
    }

    /**
     * Legt den Wert der nationalCodeAustria-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString6 }
     *     
     */
    public void setNationalCodeAustria(FieldString6 value) {
        this.nationalCodeAustria = value;
    }

    /**
     * Ruft den Wert der opponentLicenseNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString30 }
     *     
     */
    public FieldString30 getOpponentLicenseNumber() {
        return opponentLicenseNumber;
    }

    /**
     * Legt den Wert der opponentLicenseNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString30 }
     *     
     */
    public void setOpponentLicenseNumber(FieldString30 value) {
        this.opponentLicenseNumber = value;
    }

    /**
     * Ruft den Wert der licenseNumberSale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLicenseNumberSale() {
        return licenseNumberSale;
    }

    /**
     * Legt den Wert der licenseNumberSale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLicenseNumberSale(FieldString value) {
        this.licenseNumberSale = value;
    }

    /**
     * Ruft den Wert der registrationNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString30 }
     *     
     */
    public FieldString30 getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Legt den Wert der registrationNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString30 }
     *     
     */
    public void setRegistrationNumber(FieldString30 value) {
        this.registrationNumber = value;
    }

    /**
     * Ruft den Wert der suspensionDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getSuspensionDate() {
        return suspensionDate;
    }

    /**
     * Legt den Wert der suspensionDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setSuspensionDate(FieldDate value) {
        this.suspensionDate = value;
    }

    /**
     * Ruft den Wert der cnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCNIT() {
        return cnit;
    }

    /**
     * Legt den Wert der cnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCNIT(FieldString value) {
        this.cnit = value;
    }

    /**
     * Ruft den Wert der licenseNumberAccident-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLicenseNumberAccident() {
        return licenseNumberAccident;
    }

    /**
     * Legt den Wert der licenseNumberAccident-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLicenseNumberAccident(FieldString value) {
        this.licenseNumberAccident = value;
    }

    /**
     * Ruft den Wert der manufacturerName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString30 }
     *     
     */
    public FieldString30 getManufacturerName() {
        return manufacturerName;
    }

    /**
     * Legt den Wert der manufacturerName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString30 }
     *     
     */
    public void setManufacturerName(FieldString30 value) {
        this.manufacturerName = value;
    }

    /**
     * Ruft den Wert der motorIndicator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString6 }
     *     
     */
    public FieldString6 getMotorIndicator() {
        return motorIndicator;
    }

    /**
     * Legt den Wert der motorIndicator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString6 }
     *     
     */
    public void setMotorIndicator(FieldString6 value) {
        this.motorIndicator = value;
    }

    /**
     * Ruft den Wert der registrationDocumentNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString30 }
     *     
     */
    public FieldString30 getRegistrationDocumentNumber() {
        return registrationDocumentNumber;
    }

    /**
     * Legt den Wert der registrationDocumentNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString30 }
     *     
     */
    public void setRegistrationDocumentNumber(FieldString30 value) {
        this.registrationDocumentNumber = value;
    }

    /**
     * Ruft den Wert der seasonalLicensePlateMonthFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getSeasonalLicensePlateMonthFrom() {
        return seasonalLicensePlateMonthFrom;
    }

    /**
     * Legt den Wert der seasonalLicensePlateMonthFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setSeasonalLicensePlateMonthFrom(FieldInteger value) {
        this.seasonalLicensePlateMonthFrom = value;
    }

    /**
     * Ruft den Wert der seasonalLicensePlateMonthTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getSeasonalLicensePlateMonthTo() {
        return seasonalLicensePlateMonthTo;
    }

    /**
     * Legt den Wert der seasonalLicensePlateMonthTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setSeasonalLicensePlateMonthTo(FieldInteger value) {
        this.seasonalLicensePlateMonthTo = value;
    }

}
