
package de.dat.financeline.services.evaluation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für vehicleApproximateValueRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="vehicleApproximateValueRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/Evaluation}vehicleSelectionRequest">
 *       &lt;sequence>
 *         &lt;element name="vin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kba" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATEquipmentId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="identificationOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exFactoryPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="approximationSign" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *         &lt;element name="mileage" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="manualEquipmentExFactoryPrice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="manualEquipmentDevaluations" type="{http://sphinx.dat.de/services/Evaluation}manualEquipmentDevaluations" minOccurs="0"/>
 *         &lt;element name="coverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vatType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extendedMileageCorrection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regionNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleApproximateValueRequest", namespace = "http://sphinx.dat.de/services/Evaluation", propOrder = {
    "vin",
    "kba",
    "model",
    "datEquipmentId",
    "identificationOrder",
    "exFactoryPrice",
    "approximationSign",
    "registrationDate",
    "mileage",
    "manualEquipmentExFactoryPrice",
    "manualEquipmentDevaluations",
    "coverage",
    "vatType",
    "extendedMileageCorrection",
    "regionNo"
})
public class VehicleApproximateValueRequest
    extends VehicleSelectionRequest
{

    @XmlElement(namespace = "")
    protected String vin;
    @XmlElement(namespace = "")
    protected String kba;
    @XmlElement(namespace = "")
    protected String model;
    @XmlElement(name = "DATEquipmentId", namespace = "", nillable = true)
    protected List<Long> datEquipmentId;
    @XmlElement(namespace = "")
    protected String identificationOrder;
    @XmlElement(namespace = "")
    protected Double exFactoryPrice;
    @XmlElement(namespace = "", required = true)
    protected String approximationSign;
    @XmlElement(namespace = "", required = true)
    protected Object registrationDate;
    @XmlElement(namespace = "")
    protected long mileage;
    @XmlElement(namespace = "")
    protected Integer manualEquipmentExFactoryPrice;
    @XmlElement(namespace = "")
    protected ManualEquipmentDevaluations manualEquipmentDevaluations;
    @XmlElement(namespace = "")
    protected String coverage;
    @XmlElementRef(name = "vatType", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vatType;
    @XmlElement(namespace = "")
    protected String extendedMileageCorrection;
    @XmlElement(namespace = "")
    protected Integer regionNo;

    /**
     * Ruft den Wert der vin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVin() {
        return vin;
    }

    /**
     * Legt den Wert der vin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVin(String value) {
        this.vin = value;
    }

    /**
     * Ruft den Wert der kba-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKba() {
        return kba;
    }

    /**
     * Legt den Wert der kba-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKba(String value) {
        this.kba = value;
    }

    /**
     * Ruft den Wert der model-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Legt den Wert der model-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the datEquipmentId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datEquipmentId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDATEquipmentId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getDATEquipmentId() {
        if (datEquipmentId == null) {
            datEquipmentId = new ArrayList<Long>();
        }
        return this.datEquipmentId;
    }

    /**
     * Ruft den Wert der identificationOrder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationOrder() {
        return identificationOrder;
    }

    /**
     * Legt den Wert der identificationOrder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationOrder(String value) {
        this.identificationOrder = value;
    }

    /**
     * Ruft den Wert der exFactoryPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExFactoryPrice() {
        return exFactoryPrice;
    }

    /**
     * Legt den Wert der exFactoryPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExFactoryPrice(Double value) {
        this.exFactoryPrice = value;
    }

    /**
     * Ruft den Wert der approximationSign-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximationSign() {
        return approximationSign;
    }

    /**
     * Legt den Wert der approximationSign-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximationSign(String value) {
        this.approximationSign = value;
    }

    /**
     * Ruft den Wert der registrationDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Legt den Wert der registrationDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRegistrationDate(Object value) {
        this.registrationDate = value;
    }

    /**
     * Ruft den Wert der mileage-Eigenschaft ab.
     * 
     */
    public long getMileage() {
        return mileage;
    }

    /**
     * Legt den Wert der mileage-Eigenschaft fest.
     * 
     */
    public void setMileage(long value) {
        this.mileage = value;
    }

    /**
     * Ruft den Wert der manualEquipmentExFactoryPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getManualEquipmentExFactoryPrice() {
        return manualEquipmentExFactoryPrice;
    }

    /**
     * Legt den Wert der manualEquipmentExFactoryPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setManualEquipmentExFactoryPrice(Integer value) {
        this.manualEquipmentExFactoryPrice = value;
    }

    /**
     * Ruft den Wert der manualEquipmentDevaluations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ManualEquipmentDevaluations }
     *     
     */
    public ManualEquipmentDevaluations getManualEquipmentDevaluations() {
        return manualEquipmentDevaluations;
    }

    /**
     * Legt den Wert der manualEquipmentDevaluations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ManualEquipmentDevaluations }
     *     
     */
    public void setManualEquipmentDevaluations(ManualEquipmentDevaluations value) {
        this.manualEquipmentDevaluations = value;
    }

    /**
     * Ruft den Wert der coverage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverage() {
        return coverage;
    }

    /**
     * Legt den Wert der coverage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverage(String value) {
        this.coverage = value;
    }

    /**
     * Ruft den Wert der vatType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVatType() {
        return vatType;
    }

    /**
     * Legt den Wert der vatType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVatType(JAXBElement<String> value) {
        this.vatType = value;
    }

    /**
     * Ruft den Wert der extendedMileageCorrection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedMileageCorrection() {
        return extendedMileageCorrection;
    }

    /**
     * Legt den Wert der extendedMileageCorrection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedMileageCorrection(String value) {
        this.extendedMileageCorrection = value;
    }

    /**
     * Ruft den Wert der regionNo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRegionNo() {
        return regionNo;
    }

    /**
     * Legt den Wert der regionNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRegionNo(Integer value) {
        this.regionNo = value;
    }

}
