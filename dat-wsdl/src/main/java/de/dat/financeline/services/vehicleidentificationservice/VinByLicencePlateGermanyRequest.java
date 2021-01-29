
package de.dat.financeline.services.vehicleidentificationservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für vinByLicencePlateGermanyRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="vinByLicencePlateGermanyRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="insuranceNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="licencePlate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vinByLicencePlateGermanyRequest", namespace = "http://sphinx.dat.de/services/VehicleIdentificationService", propOrder = {
    "insuranceNr",
    "licencePlate",
    "referenceDate"
})
public class VinByLicencePlateGermanyRequest {

    @XmlElementRef(name = "insuranceNr", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insuranceNr;
    @XmlElementRef(name = "licencePlate", type = JAXBElement.class, required = false)
    protected JAXBElement<String> licencePlate;
    @XmlElementRef(name = "referenceDate", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceDate;

    /**
     * Ruft den Wert der insuranceNr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuranceNr() {
        return insuranceNr;
    }

    /**
     * Legt den Wert der insuranceNr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuranceNr(JAXBElement<String> value) {
        this.insuranceNr = value;
    }

    /**
     * Ruft den Wert der licencePlate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLicencePlate() {
        return licencePlate;
    }

    /**
     * Legt den Wert der licencePlate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLicencePlate(JAXBElement<String> value) {
        this.licencePlate = value;
    }

    /**
     * Ruft den Wert der referenceDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceDate() {
        return referenceDate;
    }

    /**
     * Legt den Wert der referenceDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceDate(JAXBElement<String> value) {
        this.referenceDate = value;
    }

}
