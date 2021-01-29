
package de.dat.financeline.services.vehicleselectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für address complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Title" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="TitleEntry" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="CompanyName" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="LastName" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="NameLong" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="FirstName" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Birthday" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="Birthplace" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Country" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ExtCustomerNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="VatEntitled" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="TaxNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="CustomerNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="CustomerType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="CustomerTypeShort" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Addition" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Street" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="StreetNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="StreetZipCode" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="StreetCity" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PoBox" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PoBoxZipCode" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PoBoxCity" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="EMail" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PhoneBusiness" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PhonePersonal" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PhoneMobile" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Fax" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Bank" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="BIC" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="BLZ" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="AccountNo" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="IBAN" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="UsageFlag" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Language" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="MaidenName" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Profession" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}PrivatePolicy" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "address", propOrder = {

})
public class Address {

    @XmlElement(name = "Title")
    protected FieldString title;
    @XmlElement(name = "TitleEntry")
    protected FieldString titleEntry;
    @XmlElement(name = "CompanyName")
    protected FieldString companyName;
    @XmlElement(name = "LastName")
    protected FieldString lastName;
    @XmlElement(name = "NameLong")
    protected FieldString nameLong;
    @XmlElement(name = "FirstName")
    protected FieldString firstName;
    @XmlElement(name = "Birthday")
    protected FieldDate birthday;
    @XmlElement(name = "Birthplace")
    protected FieldString birthplace;
    @XmlElement(name = "Country")
    protected FieldString country;
    @XmlElement(name = "ExtCustomerNumber")
    protected FieldString extCustomerNumber;
    @XmlElement(name = "VatEntitled")
    protected FieldBoolean vatEntitled;
    @XmlElement(name = "TaxNumber")
    protected FieldString taxNumber;
    @XmlElement(name = "CustomerNumber")
    protected FieldString customerNumber;
    @XmlElement(name = "CustomerType")
    protected FieldString customerType;
    @XmlElement(name = "CustomerTypeShort")
    protected FieldString customerTypeShort;
    @XmlElement(name = "Addition")
    protected FieldString addition;
    @XmlElement(name = "Street")
    protected FieldString street;
    @XmlElement(name = "StreetNumber")
    protected FieldString streetNumber;
    @XmlElement(name = "StreetZipCode")
    protected FieldString streetZipCode;
    @XmlElement(name = "StreetCity")
    protected FieldString streetCity;
    @XmlElement(name = "PoBox")
    protected FieldString poBox;
    @XmlElement(name = "PoBoxZipCode")
    protected FieldString poBoxZipCode;
    @XmlElement(name = "PoBoxCity")
    protected FieldString poBoxCity;
    @XmlElement(name = "EMail")
    protected FieldString eMail;
    @XmlElement(name = "PhoneBusiness")
    protected FieldString phoneBusiness;
    @XmlElement(name = "PhonePersonal")
    protected FieldString phonePersonal;
    @XmlElement(name = "PhoneMobile")
    protected FieldString phoneMobile;
    @XmlElement(name = "Fax")
    protected FieldString fax;
    @XmlElement(name = "Bank")
    protected FieldString bank;
    @XmlElement(name = "BIC")
    protected FieldString bic;
    @XmlElement(name = "BLZ")
    protected FieldString blz;
    @XmlElement(name = "AccountNo")
    protected FieldString accountNo;
    @XmlElement(name = "IBAN")
    protected FieldString iban;
    @XmlElement(name = "UsageFlag")
    protected FieldString usageFlag;
    @XmlElement(name = "Language")
    protected FieldString language;
    @XmlElement(name = "MaidenName")
    protected FieldString maidenName;
    @XmlElement(name = "Profession")
    protected FieldString profession;
    @XmlElement(name = "PrivatePolicy")
    protected PrivatePolicy privatePolicy;

    /**
     * Ruft den Wert der title-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTitle() {
        return title;
    }

    /**
     * Legt den Wert der title-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTitle(FieldString value) {
        this.title = value;
    }

    /**
     * Ruft den Wert der titleEntry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTitleEntry() {
        return titleEntry;
    }

    /**
     * Legt den Wert der titleEntry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTitleEntry(FieldString value) {
        this.titleEntry = value;
    }

    /**
     * Ruft den Wert der companyName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCompanyName() {
        return companyName;
    }

    /**
     * Legt den Wert der companyName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCompanyName(FieldString value) {
        this.companyName = value;
    }

    /**
     * Ruft den Wert der lastName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLastName() {
        return lastName;
    }

    /**
     * Legt den Wert der lastName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLastName(FieldString value) {
        this.lastName = value;
    }

    /**
     * Ruft den Wert der nameLong-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNameLong() {
        return nameLong;
    }

    /**
     * Legt den Wert der nameLong-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNameLong(FieldString value) {
        this.nameLong = value;
    }

    /**
     * Ruft den Wert der firstName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getFirstName() {
        return firstName;
    }

    /**
     * Legt den Wert der firstName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setFirstName(FieldString value) {
        this.firstName = value;
    }

    /**
     * Ruft den Wert der birthday-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getBirthday() {
        return birthday;
    }

    /**
     * Legt den Wert der birthday-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setBirthday(FieldDate value) {
        this.birthday = value;
    }

    /**
     * Ruft den Wert der birthplace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getBirthplace() {
        return birthplace;
    }

    /**
     * Legt den Wert der birthplace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setBirthplace(FieldString value) {
        this.birthplace = value;
    }

    /**
     * Ruft den Wert der country-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCountry() {
        return country;
    }

    /**
     * Legt den Wert der country-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCountry(FieldString value) {
        this.country = value;
    }

    /**
     * Ruft den Wert der extCustomerNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getExtCustomerNumber() {
        return extCustomerNumber;
    }

    /**
     * Legt den Wert der extCustomerNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setExtCustomerNumber(FieldString value) {
        this.extCustomerNumber = value;
    }

    /**
     * Ruft den Wert der vatEntitled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getVatEntitled() {
        return vatEntitled;
    }

    /**
     * Legt den Wert der vatEntitled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setVatEntitled(FieldBoolean value) {
        this.vatEntitled = value;
    }

    /**
     * Ruft den Wert der taxNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTaxNumber() {
        return taxNumber;
    }

    /**
     * Legt den Wert der taxNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTaxNumber(FieldString value) {
        this.taxNumber = value;
    }

    /**
     * Ruft den Wert der customerNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Legt den Wert der customerNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCustomerNumber(FieldString value) {
        this.customerNumber = value;
    }

    /**
     * Ruft den Wert der customerType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCustomerType() {
        return customerType;
    }

    /**
     * Legt den Wert der customerType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCustomerType(FieldString value) {
        this.customerType = value;
    }

    /**
     * Ruft den Wert der customerTypeShort-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCustomerTypeShort() {
        return customerTypeShort;
    }

    /**
     * Legt den Wert der customerTypeShort-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCustomerTypeShort(FieldString value) {
        this.customerTypeShort = value;
    }

    /**
     * Ruft den Wert der addition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getAddition() {
        return addition;
    }

    /**
     * Legt den Wert der addition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setAddition(FieldString value) {
        this.addition = value;
    }

    /**
     * Ruft den Wert der street-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getStreet() {
        return street;
    }

    /**
     * Legt den Wert der street-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setStreet(FieldString value) {
        this.street = value;
    }

    /**
     * Ruft den Wert der streetNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getStreetNumber() {
        return streetNumber;
    }

    /**
     * Legt den Wert der streetNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setStreetNumber(FieldString value) {
        this.streetNumber = value;
    }

    /**
     * Ruft den Wert der streetZipCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getStreetZipCode() {
        return streetZipCode;
    }

    /**
     * Legt den Wert der streetZipCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setStreetZipCode(FieldString value) {
        this.streetZipCode = value;
    }

    /**
     * Ruft den Wert der streetCity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getStreetCity() {
        return streetCity;
    }

    /**
     * Legt den Wert der streetCity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setStreetCity(FieldString value) {
        this.streetCity = value;
    }

    /**
     * Ruft den Wert der poBox-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPoBox() {
        return poBox;
    }

    /**
     * Legt den Wert der poBox-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPoBox(FieldString value) {
        this.poBox = value;
    }

    /**
     * Ruft den Wert der poBoxZipCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPoBoxZipCode() {
        return poBoxZipCode;
    }

    /**
     * Legt den Wert der poBoxZipCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPoBoxZipCode(FieldString value) {
        this.poBoxZipCode = value;
    }

    /**
     * Ruft den Wert der poBoxCity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPoBoxCity() {
        return poBoxCity;
    }

    /**
     * Legt den Wert der poBoxCity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPoBoxCity(FieldString value) {
        this.poBoxCity = value;
    }

    /**
     * Ruft den Wert der eMail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getEMail() {
        return eMail;
    }

    /**
     * Legt den Wert der eMail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setEMail(FieldString value) {
        this.eMail = value;
    }

    /**
     * Ruft den Wert der phoneBusiness-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPhoneBusiness() {
        return phoneBusiness;
    }

    /**
     * Legt den Wert der phoneBusiness-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPhoneBusiness(FieldString value) {
        this.phoneBusiness = value;
    }

    /**
     * Ruft den Wert der phonePersonal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPhonePersonal() {
        return phonePersonal;
    }

    /**
     * Legt den Wert der phonePersonal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPhonePersonal(FieldString value) {
        this.phonePersonal = value;
    }

    /**
     * Ruft den Wert der phoneMobile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPhoneMobile() {
        return phoneMobile;
    }

    /**
     * Legt den Wert der phoneMobile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPhoneMobile(FieldString value) {
        this.phoneMobile = value;
    }

    /**
     * Ruft den Wert der fax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getFax() {
        return fax;
    }

    /**
     * Legt den Wert der fax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setFax(FieldString value) {
        this.fax = value;
    }

    /**
     * Ruft den Wert der bank-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getBank() {
        return bank;
    }

    /**
     * Legt den Wert der bank-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setBank(FieldString value) {
        this.bank = value;
    }

    /**
     * Ruft den Wert der bic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getBIC() {
        return bic;
    }

    /**
     * Legt den Wert der bic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setBIC(FieldString value) {
        this.bic = value;
    }

    /**
     * Ruft den Wert der blz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getBLZ() {
        return blz;
    }

    /**
     * Legt den Wert der blz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setBLZ(FieldString value) {
        this.blz = value;
    }

    /**
     * Ruft den Wert der accountNo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getAccountNo() {
        return accountNo;
    }

    /**
     * Legt den Wert der accountNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setAccountNo(FieldString value) {
        this.accountNo = value;
    }

    /**
     * Ruft den Wert der iban-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getIBAN() {
        return iban;
    }

    /**
     * Legt den Wert der iban-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setIBAN(FieldString value) {
        this.iban = value;
    }

    /**
     * Ruft den Wert der usageFlag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getUsageFlag() {
        return usageFlag;
    }

    /**
     * Legt den Wert der usageFlag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setUsageFlag(FieldString value) {
        this.usageFlag = value;
    }

    /**
     * Ruft den Wert der language-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLanguage() {
        return language;
    }

    /**
     * Legt den Wert der language-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLanguage(FieldString value) {
        this.language = value;
    }

    /**
     * Ruft den Wert der maidenName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getMaidenName() {
        return maidenName;
    }

    /**
     * Legt den Wert der maidenName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setMaidenName(FieldString value) {
        this.maidenName = value;
    }

    /**
     * Ruft den Wert der profession-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getProfession() {
        return profession;
    }

    /**
     * Legt den Wert der profession-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setProfession(FieldString value) {
        this.profession = value;
    }

    /**
     * Ruft den Wert der privatePolicy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PrivatePolicy }
     *     
     */
    public PrivatePolicy getPrivatePolicy() {
        return privatePolicy;
    }

    /**
     * Legt den Wert der privatePolicy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivatePolicy }
     *     
     */
    public void setPrivatePolicy(PrivatePolicy value) {
        this.privatePolicy = value;
    }

}
