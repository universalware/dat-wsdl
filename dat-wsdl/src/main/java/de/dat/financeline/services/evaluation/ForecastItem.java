
package de.dat.financeline.services.evaluation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für forecastItem complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="forecastItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ageInMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mileagePerYear" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="mileageTotal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "forecastItem", namespace = "http://sphinx.dat.de/services/Evaluation", propOrder = {
    "ageInMonth",
    "mileagePerYear",
    "mileageTotal"
})
public class ForecastItem {

    @XmlElement(namespace = "")
    protected int ageInMonth;
    @XmlElementRef(name = "mileagePerYear", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> mileagePerYear;
    @XmlElementRef(name = "mileageTotal", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> mileageTotal;

    /**
     * Ruft den Wert der ageInMonth-Eigenschaft ab.
     * 
     */
    public int getAgeInMonth() {
        return ageInMonth;
    }

    /**
     * Legt den Wert der ageInMonth-Eigenschaft fest.
     * 
     */
    public void setAgeInMonth(int value) {
        this.ageInMonth = value;
    }

    /**
     * Ruft den Wert der mileagePerYear-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMileagePerYear() {
        return mileagePerYear;
    }

    /**
     * Legt den Wert der mileagePerYear-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMileagePerYear(JAXBElement<Long> value) {
        this.mileagePerYear = value;
    }

    /**
     * Ruft den Wert der mileageTotal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMileageTotal() {
        return mileageTotal;
    }

    /**
     * Legt den Wert der mileageTotal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMileageTotal(JAXBElement<Long> value) {
        this.mileageTotal = value;
    }

}
