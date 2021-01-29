
package de.dat.financeline.services.evaluation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für newVehicleForecastRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="newVehicleForecastRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/Evaluation}abstractEvaluationRequest">
 *       &lt;sequence>
 *         &lt;element name="curveType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="decreaseType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="forecastItems" type="{http://sphinx.dat.de/services/Evaluation}forecastItems"/>
 *         &lt;element name="includeVat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mileageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regionNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valueType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "newVehicleForecastRequest", namespace = "http://sphinx.dat.de/services/Evaluation", propOrder = {
    "curveType",
    "decreaseType",
    "forecastItems",
    "includeVat",
    "mileageType",
    "priceType",
    "regionNo",
    "valueType"
})
@XmlSeeAlso({
    UsedVehicleForecastRequest.class
})
public class NewVehicleForecastRequest
    extends AbstractEvaluationRequest
{

    @XmlElement(namespace = "", required = true)
    protected String curveType;
    @XmlElement(namespace = "", required = true)
    protected String decreaseType;
    @XmlElement(namespace = "", required = true)
    protected ForecastItems forecastItems;
    @XmlElement(namespace = "", required = true)
    protected String includeVat;
    @XmlElementRef(name = "mileageType", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mileageType;
    @XmlElement(namespace = "", required = true)
    protected String priceType;
    @XmlElement(namespace = "")
    protected Integer regionNo;
    @XmlElement(namespace = "", required = true)
    protected String valueType;

    /**
     * Ruft den Wert der curveType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurveType() {
        return curveType;
    }

    /**
     * Legt den Wert der curveType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurveType(String value) {
        this.curveType = value;
    }

    /**
     * Ruft den Wert der decreaseType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecreaseType() {
        return decreaseType;
    }

    /**
     * Legt den Wert der decreaseType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecreaseType(String value) {
        this.decreaseType = value;
    }

    /**
     * Ruft den Wert der forecastItems-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ForecastItems }
     *     
     */
    public ForecastItems getForecastItems() {
        return forecastItems;
    }

    /**
     * Legt den Wert der forecastItems-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastItems }
     *     
     */
    public void setForecastItems(ForecastItems value) {
        this.forecastItems = value;
    }

    /**
     * Ruft den Wert der includeVat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeVat() {
        return includeVat;
    }

    /**
     * Legt den Wert der includeVat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeVat(String value) {
        this.includeVat = value;
    }

    /**
     * Ruft den Wert der mileageType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMileageType() {
        return mileageType;
    }

    /**
     * Legt den Wert der mileageType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMileageType(JAXBElement<String> value) {
        this.mileageType = value;
    }

    /**
     * Ruft den Wert der priceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceType() {
        return priceType;
    }

    /**
     * Legt den Wert der priceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceType(String value) {
        this.priceType = value;
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

    /**
     * Ruft den Wert der valueType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueType() {
        return valueType;
    }

    /**
     * Legt den Wert der valueType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueType(String value) {
        this.valueType = value;
    }

}
