
package de.dat.glassrep.services.vehicleselectionservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für basicSelectionRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="basicSelectionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/VehicleSelectionService}abstractSelectionRequest">
 *       &lt;sequence>
 *         &lt;element name="constructionTimeFrom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="constructionTimeTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="restriction" type="{http://sphinx.dat.de/services/VehicleSelectionService}releaseRestriction"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "basicSelectionRequest", namespace = "http://sphinx.dat.de/services/VehicleSelectionService", propOrder = {
    "constructionTimeFrom",
    "constructionTimeTo",
    "restriction"
})
@XmlSeeAlso({
    SubModelByTextSearchSelectionRequest.class,
    HgvPlatformManufacturerSelectionRequest.class,
    PriceFocusSelectionRequest.class,
    ManufacturerSelectionRequest.class
})
public class BasicSelectionRequest
    extends AbstractSelectionRequest
{

    @XmlElementRef(name = "constructionTimeFrom", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> constructionTimeFrom;
    @XmlElementRef(name = "constructionTimeTo", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> constructionTimeTo;
    @XmlElement(namespace = "", required = true)
    @XmlSchemaType(name = "string")
    protected ReleaseRestriction restriction;

    /**
     * Ruft den Wert der constructionTimeFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConstructionTimeFrom() {
        return constructionTimeFrom;
    }

    /**
     * Legt den Wert der constructionTimeFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConstructionTimeFrom(JAXBElement<Integer> value) {
        this.constructionTimeFrom = value;
    }

    /**
     * Ruft den Wert der constructionTimeTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConstructionTimeTo() {
        return constructionTimeTo;
    }

    /**
     * Legt den Wert der constructionTimeTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConstructionTimeTo(JAXBElement<Integer> value) {
        this.constructionTimeTo = value;
    }

    /**
     * Ruft den Wert der restriction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReleaseRestriction }
     *     
     */
    public ReleaseRestriction getRestriction() {
        return restriction;
    }

    /**
     * Legt den Wert der restriction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReleaseRestriction }
     *     
     */
    public void setRestriction(ReleaseRestriction value) {
        this.restriction = value;
    }

}
