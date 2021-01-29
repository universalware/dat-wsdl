
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für settings complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="settings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfContractsReturned" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="returnLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sortingCriterions" type="{http://sphinx.dat.de/services/VehicleRepairService}sortingCriterions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "settings", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "numberOfContractsReturned",
    "offset",
    "returnLanguage",
    "sortingCriterions"
})
public class Settings {

    @XmlElementRef(name = "numberOfContractsReturned", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfContractsReturned;
    @XmlElementRef(name = "offset", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> offset;
    @XmlElementRef(name = "returnLanguage", type = JAXBElement.class, required = false)
    protected JAXBElement<String> returnLanguage;
    @XmlElementRef(name = "sortingCriterions", type = JAXBElement.class, required = false)
    protected JAXBElement<SortingCriterions> sortingCriterions;

    /**
     * Ruft den Wert der numberOfContractsReturned-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfContractsReturned() {
        return numberOfContractsReturned;
    }

    /**
     * Legt den Wert der numberOfContractsReturned-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfContractsReturned(JAXBElement<Integer> value) {
        this.numberOfContractsReturned = value;
    }

    /**
     * Ruft den Wert der offset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOffset() {
        return offset;
    }

    /**
     * Legt den Wert der offset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOffset(JAXBElement<Integer> value) {
        this.offset = value;
    }

    /**
     * Ruft den Wert der returnLanguage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReturnLanguage() {
        return returnLanguage;
    }

    /**
     * Legt den Wert der returnLanguage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReturnLanguage(JAXBElement<String> value) {
        this.returnLanguage = value;
    }

    /**
     * Ruft den Wert der sortingCriterions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SortingCriterions }{@code >}
     *     
     */
    public JAXBElement<SortingCriterions> getSortingCriterions() {
        return sortingCriterions;
    }

    /**
     * Legt den Wert der sortingCriterions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SortingCriterions }{@code >}
     *     
     */
    public void setSortingCriterions(JAXBElement<SortingCriterions> value) {
        this.sortingCriterions = value;
    }

}
