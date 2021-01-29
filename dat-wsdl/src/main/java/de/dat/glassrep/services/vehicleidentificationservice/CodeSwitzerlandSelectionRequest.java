
package de.dat.glassrep.services.vehicleidentificationservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für codeSwitzerlandSelectionRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="codeSwitzerlandSelectionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="licencePlate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locale" type="{http://sphinx.dat.de/services/VehicleIdentificationService}locale" minOccurs="0"/>
 *         &lt;element name="restriction" type="{http://sphinx.dat.de/services/VehicleIdentificationService}releaseRestriction" minOccurs="0"/>
 *         &lt;element name="typeNoteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "codeSwitzerlandSelectionRequest", namespace = "http://sphinx.dat.de/services/VehicleIdentificationService", propOrder = {
    "baseNumber",
    "licencePlate",
    "locale",
    "restriction",
    "typeNoteNumber"
})
public class CodeSwitzerlandSelectionRequest {

    @XmlElementRef(name = "baseNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> baseNumber;
    @XmlElementRef(name = "licencePlate", type = JAXBElement.class, required = false)
    protected JAXBElement<String> licencePlate;
    @XmlElementRef(name = "locale", type = JAXBElement.class, required = false)
    protected JAXBElement<Locale> locale;
    @XmlElementRef(name = "restriction", type = JAXBElement.class, required = false)
    protected JAXBElement<ReleaseRestriction> restriction;
    @XmlElementRef(name = "typeNoteNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typeNoteNumber;

    /**
     * Ruft den Wert der baseNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBaseNumber() {
        return baseNumber;
    }

    /**
     * Legt den Wert der baseNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBaseNumber(JAXBElement<String> value) {
        this.baseNumber = value;
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
     * Ruft den Wert der restriction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReleaseRestriction }{@code >}
     *     
     */
    public JAXBElement<ReleaseRestriction> getRestriction() {
        return restriction;
    }

    /**
     * Legt den Wert der restriction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReleaseRestriction }{@code >}
     *     
     */
    public void setRestriction(JAXBElement<ReleaseRestriction> value) {
        this.restriction = value;
    }

    /**
     * Ruft den Wert der typeNoteNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTypeNoteNumber() {
        return typeNoteNumber;
    }

    /**
     * Legt den Wert der typeNoteNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTypeNoteNumber(JAXBElement<String> value) {
        this.typeNoteNumber = value;
    }

}
