
package de.dat.datecodeselection.services.vehicleimagery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für vehicleRimImagesRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="vehicleRimImagesRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="constructionTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="container" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datECode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locale" type="{http://sphinx.dat.de/services/VehicleImagery}locale"/>
 *         &lt;element name="releaseRestriction" type="{http://sphinx.dat.de/services/VehicleImagery}releaseRestriction"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleRimImagesRequest", propOrder = {
    "constructionTime",
    "container",
    "datECode",
    "locale",
    "releaseRestriction"
})
public class VehicleRimImagesRequest {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer constructionTime;
    @XmlElement(required = true, nillable = true)
    protected String container;
    @XmlElement(required = true)
    protected String datECode;
    @XmlElement(required = true)
    protected Locale locale;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ReleaseRestriction releaseRestriction;

    /**
     * Ruft den Wert der constructionTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConstructionTime() {
        return constructionTime;
    }

    /**
     * Legt den Wert der constructionTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConstructionTime(Integer value) {
        this.constructionTime = value;
    }

    /**
     * Ruft den Wert der container-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainer() {
        return container;
    }

    /**
     * Legt den Wert der container-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainer(String value) {
        this.container = value;
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
     * Ruft den Wert der locale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Locale }
     *     
     */
    public Locale getLocale() {
        return locale;
    }

    /**
     * Legt den Wert der locale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Locale }
     *     
     */
    public void setLocale(Locale value) {
        this.locale = value;
    }

    /**
     * Ruft den Wert der releaseRestriction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReleaseRestriction }
     *     
     */
    public ReleaseRestriction getReleaseRestriction() {
        return releaseRestriction;
    }

    /**
     * Legt den Wert der releaseRestriction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReleaseRestriction }
     *     
     */
    public void setReleaseRestriction(ReleaseRestriction value) {
        this.releaseRestriction = value;
    }

}
