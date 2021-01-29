
package de.dat.myclaim.soap.vehiclerepairservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für calculateRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="calculateRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="axles" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="billingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculationWages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="calculationWage" type="{http://www.dat.eu/myClaim/soap/v2/VehicleRepairService}calculationWage" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="constructionTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="contructionTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="countryPrice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="datProcessInfo" type="{http://www.dat.eu/myClaim/soap/v2/VehicleRepairService}datProcessInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="datECode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="economicRegion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
 *                             &lt;element name="value" type="{http://www.dat.eu/myClaim/soap/v2/VehicleRepairService}hashMap" minOccurs="0"/>
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
 *         &lt;element name="includeAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="includeComments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="includeProtocol" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="insuranceID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isAlternativeCalculationUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isCountryCurrency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isDMSCalculation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isPhantomCalculation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isSerialCalculation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="locale" type="{http://www.dat.eu/myClaim/soap/v2/VehicleRepairService}locale" minOccurs="0"/>
 *         &lt;element name="paintingColorDescription" type="{http://www.dat.eu/myClaim/soap/v2/VehicleRepairService}paintingColorDescription" minOccurs="0"/>
 *         &lt;element name="paintingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="useTimeUnitsOfManufacturer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculateRequest", namespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", propOrder = {
    "axles",
    "billingId",
    "calculationWages",
    "constructionTime",
    "contructionTime",
    "countryPrice",
    "datProcessInfo",
    "datECode",
    "economicRegion",
    "equipment",
    "externalProvider",
    "externalProviderParams",
    "externalProviders",
    "includeAttachments",
    "includeComments",
    "includeProtocol",
    "insuranceID",
    "isAlternativeCalculationUsed",
    "isCountryCurrency",
    "isDMSCalculation",
    "isPhantomCalculation",
    "isSerialCalculation",
    "locale",
    "paintingColorDescription",
    "paintingMethod",
    "useTimeUnitsOfManufacturer"
})
public class CalculateRequest {

    @XmlElement(namespace = "", nillable = true)
    protected List<Object> axles;
    @XmlElement(namespace = "")
    protected String billingId;
    @XmlElement(namespace = "")
    protected CalculateRequest.CalculationWages calculationWages;
    @XmlElementRef(name = "constructionTime", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> constructionTime;
    @XmlElementRef(name = "contructionTime", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> contructionTime;
    @XmlElementRef(name = "countryPrice", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> countryPrice;
    @XmlElement(namespace = "")
    protected List<DatProcessInfo> datProcessInfo;
    @XmlElement(namespace = "", required = true)
    protected String datECode;
    @XmlElementRef(name = "economicRegion", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> economicRegion;
    @XmlElement(namespace = "", nillable = true)
    protected List<Long> equipment;
    @XmlElementRef(name = "externalProvider", type = JAXBElement.class, required = false)
    protected JAXBElement<String> externalProvider;
    @XmlElement(namespace = "", required = true)
    protected CalculateRequest.ExternalProviderParams externalProviderParams;
    @XmlElement(namespace = "", required = true)
    protected CalculateRequest.ExternalProviders externalProviders;
    @XmlElement(namespace = "", defaultValue = "false")
    protected Boolean includeAttachments;
    @XmlElement(namespace = "", defaultValue = "false")
    protected Boolean includeComments;
    @XmlElementRef(name = "includeProtocol", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> includeProtocol;
    @XmlElementRef(name = "insuranceID", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> insuranceID;
    @XmlElementRef(name = "isAlternativeCalculationUsed", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isAlternativeCalculationUsed;
    @XmlElementRef(name = "isCountryCurrency", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCountryCurrency;
    @XmlElementRef(name = "isDMSCalculation", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDMSCalculation;
    @XmlElementRef(name = "isPhantomCalculation", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isPhantomCalculation;
    @XmlElement(namespace = "", defaultValue = "false")
    protected boolean isSerialCalculation;
    @XmlElementRef(name = "locale", type = JAXBElement.class, required = false)
    protected JAXBElement<Locale> locale;
    @XmlElementRef(name = "paintingColorDescription", type = JAXBElement.class, required = false)
    protected JAXBElement<PaintingColorDescription> paintingColorDescription;
    @XmlElementRef(name = "paintingMethod", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paintingMethod;
    @XmlElementRef(name = "useTimeUnitsOfManufacturer", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> useTimeUnitsOfManufacturer;

    /**
     * Gets the value of the axles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAxles() {
        if (axles == null) {
            axles = new ArrayList<Object>();
        }
        return this.axles;
    }

    /**
     * Ruft den Wert der billingId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingId() {
        return billingId;
    }

    /**
     * Legt den Wert der billingId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingId(String value) {
        this.billingId = value;
    }

    /**
     * Ruft den Wert der calculationWages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalculateRequest.CalculationWages }
     *     
     */
    public CalculateRequest.CalculationWages getCalculationWages() {
        return calculationWages;
    }

    /**
     * Legt den Wert der calculationWages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculateRequest.CalculationWages }
     *     
     */
    public void setCalculationWages(CalculateRequest.CalculationWages value) {
        this.calculationWages = value;
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
     * Ruft den Wert der contructionTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getContructionTime() {
        return contructionTime;
    }

    /**
     * Legt den Wert der contructionTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setContructionTime(JAXBElement<Integer> value) {
        this.contructionTime = value;
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
     * Gets the value of the datProcessInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datProcessInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatProcessInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatProcessInfo }
     * 
     * 
     */
    public List<DatProcessInfo> getDatProcessInfo() {
        if (datProcessInfo == null) {
            datProcessInfo = new ArrayList<DatProcessInfo>();
        }
        return this.datProcessInfo;
    }

    /**
     * Ruft den Wert der datECode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatECode() {
        return datECode;
    }

    /**
     * Legt den Wert der datECode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatECode(String value) {
        this.datECode = value;
    }

    /**
     * Ruft den Wert der economicRegion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEconomicRegion() {
        return economicRegion;
    }

    /**
     * Legt den Wert der economicRegion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEconomicRegion(JAXBElement<Integer> value) {
        this.economicRegion = value;
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
     *     {@link CalculateRequest.ExternalProviderParams }
     *     
     */
    public CalculateRequest.ExternalProviderParams getExternalProviderParams() {
        return externalProviderParams;
    }

    /**
     * Legt den Wert der externalProviderParams-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculateRequest.ExternalProviderParams }
     *     
     */
    public void setExternalProviderParams(CalculateRequest.ExternalProviderParams value) {
        this.externalProviderParams = value;
    }

    /**
     * Ruft den Wert der externalProviders-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalculateRequest.ExternalProviders }
     *     
     */
    public CalculateRequest.ExternalProviders getExternalProviders() {
        return externalProviders;
    }

    /**
     * Legt den Wert der externalProviders-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculateRequest.ExternalProviders }
     *     
     */
    public void setExternalProviders(CalculateRequest.ExternalProviders value) {
        this.externalProviders = value;
    }

    /**
     * Ruft den Wert der includeAttachments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeAttachments() {
        return includeAttachments;
    }

    /**
     * Legt den Wert der includeAttachments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAttachments(Boolean value) {
        this.includeAttachments = value;
    }

    /**
     * Ruft den Wert der includeComments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeComments() {
        return includeComments;
    }

    /**
     * Legt den Wert der includeComments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeComments(Boolean value) {
        this.includeComments = value;
    }

    /**
     * Ruft den Wert der includeProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIncludeProtocol() {
        return includeProtocol;
    }

    /**
     * Legt den Wert der includeProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIncludeProtocol(JAXBElement<Boolean> value) {
        this.includeProtocol = value;
    }

    /**
     * Ruft den Wert der insuranceID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInsuranceID() {
        return insuranceID;
    }

    /**
     * Legt den Wert der insuranceID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInsuranceID(JAXBElement<Long> value) {
        this.insuranceID = value;
    }

    /**
     * Ruft den Wert der isAlternativeCalculationUsed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsAlternativeCalculationUsed() {
        return isAlternativeCalculationUsed;
    }

    /**
     * Legt den Wert der isAlternativeCalculationUsed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsAlternativeCalculationUsed(JAXBElement<Boolean> value) {
        this.isAlternativeCalculationUsed = value;
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
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsPhantomCalculation() {
        return isPhantomCalculation;
    }

    /**
     * Legt den Wert der isPhantomCalculation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsPhantomCalculation(JAXBElement<Boolean> value) {
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
     * Ruft den Wert der useTimeUnitsOfManufacturer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUseTimeUnitsOfManufacturer() {
        return useTimeUnitsOfManufacturer;
    }

    /**
     * Legt den Wert der useTimeUnitsOfManufacturer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUseTimeUnitsOfManufacturer(JAXBElement<Boolean> value) {
        this.useTimeUnitsOfManufacturer = value;
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
     *         &lt;element name="calculationWage" type="{http://www.dat.eu/myClaim/soap/v2/VehicleRepairService}calculationWage" maxOccurs="unbounded" minOccurs="0"/>
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
        protected List<CalculationWage> calculationWage;

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
         * {@link CalculationWage }
         * 
         * 
         */
        public List<CalculationWage> getCalculationWage() {
            if (calculationWage == null) {
                calculationWage = new ArrayList<CalculationWage>();
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
        protected List<CalculateRequest.ExternalProviderParams.Entry> entry;

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
         * {@link CalculateRequest.ExternalProviderParams.Entry }
         * 
         * 
         */
        public List<CalculateRequest.ExternalProviderParams.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<CalculateRequest.ExternalProviderParams.Entry>();
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
     *                   &lt;element name="value" type="{http://www.dat.eu/myClaim/soap/v2/VehicleRepairService}hashMap" minOccurs="0"/>
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
        protected List<CalculateRequest.ExternalProviders.Entry> entry;

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
         * {@link CalculateRequest.ExternalProviders.Entry }
         * 
         * 
         */
        public List<CalculateRequest.ExternalProviders.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<CalculateRequest.ExternalProviders.Entry>();
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
         *         &lt;element name="value" type="{http://www.dat.eu/myClaim/soap/v2/VehicleRepairService}hashMap" minOccurs="0"/>
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
