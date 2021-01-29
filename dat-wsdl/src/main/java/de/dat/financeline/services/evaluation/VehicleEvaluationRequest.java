
package de.dat.financeline.services.evaluation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für vehicleEvaluationRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="vehicleEvaluationRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/Evaluation}abstractEvaluationRequest">
 *       &lt;sequence>
 *         &lt;element name="condition" type="{http://sphinx.dat.de/services/Evaluation}condition" minOccurs="0"/>
 *         &lt;element name="mileage" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="regionNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *         &lt;element name="vatType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleEvaluationRequest", namespace = "http://sphinx.dat.de/services/Evaluation", propOrder = {
    "condition",
    "mileage",
    "regionNo",
    "registrationDate",
    "vatType"
})
@XmlSeeAlso({
    VehicleHistoricalEvaluationRequest.class
})
public class VehicleEvaluationRequest
    extends AbstractEvaluationRequest
{

    @XmlElementRef(name = "condition", type = JAXBElement.class, required = false)
    protected JAXBElement<Condition> condition;
    @XmlElement(namespace = "")
    protected long mileage;
    @XmlElementRef(name = "regionNo", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> regionNo;
    @XmlElement(namespace = "", required = true)
    protected Object registrationDate;
    @XmlElementRef(name = "vatType", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vatType;

    /**
     * Ruft den Wert der condition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Condition }{@code >}
     *     
     */
    public JAXBElement<Condition> getCondition() {
        return condition;
    }

    /**
     * Legt den Wert der condition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Condition }{@code >}
     *     
     */
    public void setCondition(JAXBElement<Condition> value) {
        this.condition = value;
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
     * Ruft den Wert der regionNo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRegionNo() {
        return regionNo;
    }

    /**
     * Legt den Wert der regionNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRegionNo(JAXBElement<Integer> value) {
        this.regionNo = value;
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

}
