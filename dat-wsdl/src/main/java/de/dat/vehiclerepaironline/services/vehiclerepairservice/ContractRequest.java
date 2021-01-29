
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für contractRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="contractRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/VehicleRepairService}abstractRequest">
 *       &lt;sequence>
 *         &lt;element name="calculationWages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="calculationWage" type="{http://sphinx.dat.de/services/VehicleRepairService}calculationWage" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="constructionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="constructionTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="contractName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryPrice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="datECode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="equipment" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="externalProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalProviderParams">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="externalProviders">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="value" type="{http://sphinx.dat.de/services/VehicleRepairService}hashMap" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="insuranceCaseDescription" type="{http://sphinx.dat.de/services/VehicleRepairService}insuranceCaseDescription" minOccurs="0"/>
 *         &lt;element name="isCountryCurrency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isDMSCalculation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isPhantomCalculation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isSerialCalculation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="kba" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keepWages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="locale" type="{http://sphinx.dat.de/services/VehicleRepairService}locale" minOccurs="0"/>
 *         &lt;element name="mileageTachometer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nextVehicleInsectionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ownerCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownerCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownerName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownerPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownerStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownerStreetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownerTitel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownerZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paintingColorDescription" type="{http://sphinx.dat.de/services/VehicleRepairService}paintingColorDescription" minOccurs="0"/>
 *         &lt;element name="paintingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="registrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractRequest", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "calculationWages",
    "comment",
    "constructionDate",
    "constructionTime",
    "contractName",
    "countryPrice",
    "datECode",
    "equipment",
    "externalProvider",
    "externalProviderParams",
    "externalProviders",
    "insuranceCaseDescription",
    "isCountryCurrency",
    "isDMSCalculation",
    "isPhantomCalculation",
    "isSerialCalculation",
    "kba",
    "keepWages",
    "locale",
    "mileageTachometer",
    "nextVehicleInsectionDate",
    "ownerCity",
    "ownerCountry",
    "ownerEmail",
    "ownerName",
    "ownerName2",
    "ownerPhone",
    "ownerStreet",
    "ownerStreetNumber",
    "ownerTitel",
    "ownerZIP",
    "paintingColorDescription",
    "paintingMethod",
    "registrationDate",
    "registrationNumber",
    "vin"
})
@XmlSeeAlso({
    ContractRequest106 .class
})
public class ContractRequest
    extends AbstractRequest
{

    @XmlElement(namespace = "")
    protected ContractRequest.CalculationWages calculationWages;
    @XmlElementRef(name = "comment", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElementRef(name = "constructionDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> constructionDate;
    @XmlElementRef(name = "constructionTime", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> constructionTime;
    @XmlElementRef(name = "contractName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractName;
    @XmlElementRef(name = "countryPrice", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> countryPrice;
    @XmlElementRef(name = "datECode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datECode;
    @XmlElement(namespace = "", nillable = true)
    protected List<Long> equipment;
    @XmlElementRef(name = "externalProvider", type = JAXBElement.class, required = false)
    protected JAXBElement<String> externalProvider;
    @XmlElement(namespace = "", required = true)
    protected ContractRequest.ExternalProviderParams externalProviderParams;
    @XmlElement(namespace = "", required = true)
    protected ContractRequest.ExternalProviders externalProviders;
    @XmlElementRef(name = "insuranceCaseDescription", type = JAXBElement.class, required = false)
    protected JAXBElement<InsuranceCaseDescription> insuranceCaseDescription;
    @XmlElementRef(name = "isCountryCurrency", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCountryCurrency;
    @XmlElementRef(name = "isDMSCalculation", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDMSCalculation;
    @XmlElement(namespace = "", defaultValue = "false")
    protected Boolean isPhantomCalculation;
    @XmlElement(namespace = "", defaultValue = "false")
    protected boolean isSerialCalculation;
    @XmlElementRef(name = "kba", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kba;
    @XmlElementRef(name = "keepWages", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> keepWages;
    @XmlElementRef(name = "locale", type = JAXBElement.class, required = false)
    protected JAXBElement<Locale> locale;
    @XmlElementRef(name = "mileageTachometer", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> mileageTachometer;
    @XmlElementRef(name = "nextVehicleInsectionDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> nextVehicleInsectionDate;
    @XmlElementRef(name = "ownerCity", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerCity;
    @XmlElementRef(name = "ownerCountry", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerCountry;
    @XmlElementRef(name = "ownerEmail", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerEmail;
    @XmlElementRef(name = "ownerName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerName;
    @XmlElementRef(name = "ownerName2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerName2;
    @XmlElementRef(name = "ownerPhone", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerPhone;
    @XmlElementRef(name = "ownerStreet", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerStreet;
    @XmlElementRef(name = "ownerStreetNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerStreetNumber;
    @XmlElementRef(name = "ownerTitel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerTitel;
    @XmlElementRef(name = "ownerZIP", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerZIP;
    @XmlElementRef(name = "paintingColorDescription", type = JAXBElement.class, required = false)
    protected JAXBElement<PaintingColorDescription> paintingColorDescription;
    @XmlElementRef(name = "paintingMethod", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paintingMethod;
    @XmlElementRef(name = "registrationDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> registrationDate;
    @XmlElementRef(name = "registrationNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registrationNumber;
    @XmlElementRef(name = "vin", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vin;

    /**
     * Ruft den Wert der calculationWages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContractRequest.CalculationWages }
     *     
     */
    public ContractRequest.CalculationWages getCalculationWages() {
        return calculationWages;
    }

    /**
     * Legt den Wert der calculationWages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractRequest.CalculationWages }
     *     
     */
    public void setCalculationWages(ContractRequest.CalculationWages value) {
        this.calculationWages = value;
    }

    /**
     * Ruft den Wert der comment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComment() {
        return comment;
    }

    /**
     * Legt den Wert der comment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComment(JAXBElement<String> value) {
        this.comment = value;
    }

    /**
     * Ruft den Wert der constructionDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getConstructionDate() {
        return constructionDate;
    }

    /**
     * Legt den Wert der constructionDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setConstructionDate(JAXBElement<XMLGregorianCalendar> value) {
        this.constructionDate = value;
    }

    /**
     * Ruft den Wert der constructionTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConstructionTime() {
        return constructionTime;
    }

    /**
     * Legt den Wert der constructionTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConstructionTime(JAXBElement<Integer> value) {
        this.constructionTime = value;
    }

    /**
     * Ruft den Wert der contractName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractName() {
        return contractName;
    }

    /**
     * Legt den Wert der contractName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractName(JAXBElement<String> value) {
        this.contractName = value;
    }

    /**
     * Ruft den Wert der countryPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCountryPrice() {
        return countryPrice;
    }

    /**
     * Legt den Wert der countryPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCountryPrice(JAXBElement<Integer> value) {
        this.countryPrice = value;
    }

    /**
     * Ruft den Wert der datECode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDatECode() {
        return datECode;
    }

    /**
     * Legt den Wert der datECode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDatECode(JAXBElement<String> value) {
        this.datECode = value;
    }

    /**
     * Gets the value of the equipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getEquipment() {
        if (equipment == null) {
            equipment = new ArrayList<Long>();
        }
        return this.equipment;
    }

    /**
     * Ruft den Wert der externalProvider-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExternalProvider() {
        return externalProvider;
    }

    /**
     * Legt den Wert der externalProvider-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExternalProvider(JAXBElement<String> value) {
        this.externalProvider = value;
    }

    /**
     * Ruft den Wert der externalProviderParams-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContractRequest.ExternalProviderParams }
     *     
     */
    public ContractRequest.ExternalProviderParams getExternalProviderParams() {
        return externalProviderParams;
    }

    /**
     * Legt den Wert der externalProviderParams-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractRequest.ExternalProviderParams }
     *     
     */
    public void setExternalProviderParams(ContractRequest.ExternalProviderParams value) {
        this.externalProviderParams = value;
    }

    /**
     * Ruft den Wert der externalProviders-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContractRequest.ExternalProviders }
     *     
     */
    public ContractRequest.ExternalProviders getExternalProviders() {
        return externalProviders;
    }

    /**
     * Legt den Wert der externalProviders-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractRequest.ExternalProviders }
     *     
     */
    public void setExternalProviders(ContractRequest.ExternalProviders value) {
        this.externalProviders = value;
    }

    /**
     * Ruft den Wert der insuranceCaseDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InsuranceCaseDescription }{@code >}
     *     
     */
    public JAXBElement<InsuranceCaseDescription> getInsuranceCaseDescription() {
        return insuranceCaseDescription;
    }

    /**
     * Legt den Wert der insuranceCaseDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InsuranceCaseDescription }{@code >}
     *     
     */
    public void setInsuranceCaseDescription(JAXBElement<InsuranceCaseDescription> value) {
        this.insuranceCaseDescription = value;
    }

    /**
     * Ruft den Wert der isCountryCurrency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCountryCurrency() {
        return isCountryCurrency;
    }

    /**
     * Legt den Wert der isCountryCurrency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCountryCurrency(JAXBElement<Boolean> value) {
        this.isCountryCurrency = value;
    }

    /**
     * Ruft den Wert der isDMSCalculation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDMSCalculation() {
        return isDMSCalculation;
    }

    /**
     * Legt den Wert der isDMSCalculation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDMSCalculation(JAXBElement<Boolean> value) {
        this.isDMSCalculation = value;
    }

    /**
     * Ruft den Wert der isPhantomCalculation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPhantomCalculation() {
        return isPhantomCalculation;
    }

    /**
     * Legt den Wert der isPhantomCalculation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPhantomCalculation(Boolean value) {
        this.isPhantomCalculation = value;
    }

    /**
     * Ruft den Wert der isSerialCalculation-Eigenschaft ab.
     * 
     */
    public boolean isIsSerialCalculation() {
        return isSerialCalculation;
    }

    /**
     * Legt den Wert der isSerialCalculation-Eigenschaft fest.
     * 
     */
    public void setIsSerialCalculation(boolean value) {
        this.isSerialCalculation = value;
    }

    /**
     * Ruft den Wert der kba-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKba() {
        return kba;
    }

    /**
     * Legt den Wert der kba-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKba(JAXBElement<String> value) {
        this.kba = value;
    }

    /**
     * Ruft den Wert der keepWages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getKeepWages() {
        return keepWages;
    }

    /**
     * Legt den Wert der keepWages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setKeepWages(JAXBElement<Boolean> value) {
        this.keepWages = value;
    }

    /**
     * Ruft den Wert der locale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Locale }{@code >}
     *     
     */
    public JAXBElement<Locale> getLocale() {
        return locale;
    }

    /**
     * Legt den Wert der locale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Locale }{@code >}
     *     
     */
    public void setLocale(JAXBElement<Locale> value) {
        this.locale = value;
    }

    /**
     * Ruft den Wert der mileageTachometer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMileageTachometer() {
        return mileageTachometer;
    }

    /**
     * Legt den Wert der mileageTachometer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMileageTachometer(JAXBElement<Long> value) {
        this.mileageTachometer = value;
    }

    /**
     * Ruft den Wert der nextVehicleInsectionDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getNextVehicleInsectionDate() {
        return nextVehicleInsectionDate;
    }

    /**
     * Legt den Wert der nextVehicleInsectionDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setNextVehicleInsectionDate(JAXBElement<XMLGregorianCalendar> value) {
        this.nextVehicleInsectionDate = value;
    }

    /**
     * Ruft den Wert der ownerCity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerCity() {
        return ownerCity;
    }

    /**
     * Legt den Wert der ownerCity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerCity(JAXBElement<String> value) {
        this.ownerCity = value;
    }

    /**
     * Ruft den Wert der ownerCountry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerCountry() {
        return ownerCountry;
    }

    /**
     * Legt den Wert der ownerCountry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerCountry(JAXBElement<String> value) {
        this.ownerCountry = value;
    }

    /**
     * Ruft den Wert der ownerEmail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerEmail() {
        return ownerEmail;
    }

    /**
     * Legt den Wert der ownerEmail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerEmail(JAXBElement<String> value) {
        this.ownerEmail = value;
    }

    /**
     * Ruft den Wert der ownerName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerName() {
        return ownerName;
    }

    /**
     * Legt den Wert der ownerName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerName(JAXBElement<String> value) {
        this.ownerName = value;
    }

    /**
     * Ruft den Wert der ownerName2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerName2() {
        return ownerName2;
    }

    /**
     * Legt den Wert der ownerName2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerName2(JAXBElement<String> value) {
        this.ownerName2 = value;
    }

    /**
     * Ruft den Wert der ownerPhone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerPhone() {
        return ownerPhone;
    }

    /**
     * Legt den Wert der ownerPhone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerPhone(JAXBElement<String> value) {
        this.ownerPhone = value;
    }

    /**
     * Ruft den Wert der ownerStreet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerStreet() {
        return ownerStreet;
    }

    /**
     * Legt den Wert der ownerStreet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerStreet(JAXBElement<String> value) {
        this.ownerStreet = value;
    }

    /**
     * Ruft den Wert der ownerStreetNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerStreetNumber() {
        return ownerStreetNumber;
    }

    /**
     * Legt den Wert der ownerStreetNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerStreetNumber(JAXBElement<String> value) {
        this.ownerStreetNumber = value;
    }

    /**
     * Ruft den Wert der ownerTitel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerTitel() {
        return ownerTitel;
    }

    /**
     * Legt den Wert der ownerTitel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerTitel(JAXBElement<String> value) {
        this.ownerTitel = value;
    }

    /**
     * Ruft den Wert der ownerZIP-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerZIP() {
        return ownerZIP;
    }

    /**
     * Legt den Wert der ownerZIP-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerZIP(JAXBElement<String> value) {
        this.ownerZIP = value;
    }

    /**
     * Ruft den Wert der paintingColorDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PaintingColorDescription }{@code >}
     *     
     */
    public JAXBElement<PaintingColorDescription> getPaintingColorDescription() {
        return paintingColorDescription;
    }

    /**
     * Legt den Wert der paintingColorDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PaintingColorDescription }{@code >}
     *     
     */
    public void setPaintingColorDescription(JAXBElement<PaintingColorDescription> value) {
        this.paintingColorDescription = value;
    }

    /**
     * Ruft den Wert der paintingMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaintingMethod() {
        return paintingMethod;
    }

    /**
     * Legt den Wert der paintingMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaintingMethod(JAXBElement<String> value) {
        this.paintingMethod = value;
    }

    /**
     * Ruft den Wert der registrationDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Legt den Wert der registrationDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRegistrationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.registrationDate = value;
    }

    /**
     * Ruft den Wert der registrationNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Legt den Wert der registrationNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistrationNumber(JAXBElement<String> value) {
        this.registrationNumber = value;
    }

    /**
     * Ruft den Wert der vin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVin() {
        return vin;
    }

    /**
     * Legt den Wert der vin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVin(JAXBElement<String> value) {
        this.vin = value;
    }


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
     *         &lt;element name="calculationWage" type="{http://sphinx.dat.de/services/VehicleRepairService}calculationWage" maxOccurs="unbounded" minOccurs="0"/>
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
        "calculationWage"
    })
    public static class CalculationWages {

        @XmlElement(namespace = "")
        protected List<CalculationWage2> calculationWage;

        /**
         * Gets the value of the calculationWage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the calculationWage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCalculationWage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CalculationWage2 }
         * 
         * 
         */
        public List<CalculationWage2> getCalculationWage() {
            if (calculationWage == null) {
                calculationWage = new ArrayList<CalculationWage2>();
            }
            return this.calculationWage;
        }

    }


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
     *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "entry"
    })
    public static class ExternalProviderParams {

        @XmlElement(namespace = "")
        protected List<ContractRequest.ExternalProviderParams.Entry> entry;

        /**
         * Gets the value of the entry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContractRequest.ExternalProviderParams.Entry }
         * 
         * 
         */
        public List<ContractRequest.ExternalProviderParams.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<ContractRequest.ExternalProviderParams.Entry>();
            }
            return this.entry;
        }


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
         *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "key",
            "value"
        })
        public static class Entry {

            @XmlElement(namespace = "")
            protected String key;
            @XmlElement(namespace = "")
            protected String value;

            /**
             * Ruft den Wert der key-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKey() {
                return key;
            }

            /**
             * Legt den Wert der key-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKey(String value) {
                this.key = value;
            }

            /**
             * Ruft den Wert der value-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Legt den Wert der value-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }

    }


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
     *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="value" type="{http://sphinx.dat.de/services/VehicleRepairService}hashMap" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "entry"
    })
    public static class ExternalProviders {

        @XmlElement(namespace = "")
        protected List<ContractRequest.ExternalProviders.Entry> entry;

        /**
         * Gets the value of the entry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContractRequest.ExternalProviders.Entry }
         * 
         * 
         */
        public List<ContractRequest.ExternalProviders.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<ContractRequest.ExternalProviders.Entry>();
            }
            return this.entry;
        }


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
         *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="value" type="{http://sphinx.dat.de/services/VehicleRepairService}hashMap" minOccurs="0"/>
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
            "key",
            "value"
        })
        public static class Entry {

            @XmlElement(namespace = "")
            protected String key;
            @XmlElement(namespace = "")
            protected HashMap value;

            /**
             * Ruft den Wert der key-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKey() {
                return key;
            }

            /**
             * Legt den Wert der key-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKey(String value) {
                this.key = value;
            }

            /**
             * Ruft den Wert der value-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link HashMap }
             *     
             */
            public HashMap getValue() {
                return value;
            }

            /**
             * Legt den Wert der value-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link HashMap }
             *     
             */
            public void setValue(HashMap value) {
                this.value = value;
            }

        }

    }

}
