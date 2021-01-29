
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für insurance complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="insurance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gdvFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuranceGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuranceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuranceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuranceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insurance", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "gdvFlag",
    "insuranceGroupId",
    "insuranceId",
    "insuranceName",
    "insuranceNumber"
})
public class Insurance {

    @XmlElementRef(name = "gdvFlag", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gdvFlag;
    @XmlElementRef(name = "insuranceGroupId", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insuranceGroupId;
    @XmlElementRef(name = "insuranceId", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insuranceId;
    @XmlElementRef(name = "insuranceName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insuranceName;
    @XmlElementRef(name = "insuranceNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insuranceNumber;

    /**
     * Ruft den Wert der gdvFlag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGdvFlag() {
        return gdvFlag;
    }

    /**
     * Legt den Wert der gdvFlag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGdvFlag(JAXBElement<String> value) {
        this.gdvFlag = value;
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
     * Ruft den Wert der insuranceName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuranceName() {
        return insuranceName;
    }

    /**
     * Legt den Wert der insuranceName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuranceName(JAXBElement<String> value) {
        this.insuranceName = value;
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

}
