
package de.dat.glassrep.services.vehicleselectionservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ForecastType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PriceType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="IncludeVat" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="CurveType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DecreaseType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="StartType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ValueType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="MileageType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ForecastItems" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.dat.de/vxs}ForecastItem" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "Forecast")
public class Forecast {

    @XmlElement(name = "ForecastType")
    protected FieldString forecastType;
    @XmlElement(name = "PriceType")
    protected FieldString priceType;
    @XmlElement(name = "IncludeVat")
    protected FieldBoolean includeVat;
    @XmlElement(name = "CurveType")
    protected FieldString curveType;
    @XmlElement(name = "DecreaseType")
    protected FieldString decreaseType;
    @XmlElement(name = "StartType")
    protected FieldString startType;
    @XmlElement(name = "ValueType")
    protected FieldString valueType;
    @XmlElement(name = "MileageType")
    protected FieldString mileageType;
    @XmlElement(name = "ForecastItems")
    protected Forecast.ForecastItems forecastItems;

    /**
     * Ruft den Wert der forecastType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getForecastType() {
        return forecastType;
    }

    /**
     * Legt den Wert der forecastType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setForecastType(FieldString value) {
        this.forecastType = value;
    }

    /**
     * Ruft den Wert der priceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPriceType() {
        return priceType;
    }

    /**
     * Legt den Wert der priceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPriceType(FieldString value) {
        this.priceType = value;
    }

    /**
     * Ruft den Wert der includeVat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getIncludeVat() {
        return includeVat;
    }

    /**
     * Legt den Wert der includeVat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setIncludeVat(FieldBoolean value) {
        this.includeVat = value;
    }

    /**
     * Ruft den Wert der curveType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCurveType() {
        return curveType;
    }

    /**
     * Legt den Wert der curveType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCurveType(FieldString value) {
        this.curveType = value;
    }

    /**
     * Ruft den Wert der decreaseType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDecreaseType() {
        return decreaseType;
    }

    /**
     * Legt den Wert der decreaseType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDecreaseType(FieldString value) {
        this.decreaseType = value;
    }

    /**
     * Ruft den Wert der startType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getStartType() {
        return startType;
    }

    /**
     * Legt den Wert der startType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setStartType(FieldString value) {
        this.startType = value;
    }

    /**
     * Ruft den Wert der valueType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getValueType() {
        return valueType;
    }

    /**
     * Legt den Wert der valueType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setValueType(FieldString value) {
        this.valueType = value;
    }

    /**
     * Ruft den Wert der mileageType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getMileageType() {
        return mileageType;
    }

    /**
     * Legt den Wert der mileageType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setMileageType(FieldString value) {
        this.mileageType = value;
    }

    /**
     * Ruft den Wert der forecastItems-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Forecast.ForecastItems }
     *     
     */
    public Forecast.ForecastItems getForecastItems() {
        return forecastItems;
    }

    /**
     * Legt den Wert der forecastItems-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Forecast.ForecastItems }
     *     
     */
    public void setForecastItems(Forecast.ForecastItems value) {
        this.forecastItems = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.dat.de/vxs}ForecastItem" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "forecastItem"
    })
    public static class ForecastItems {

        @XmlElement(name = "ForecastItem")
        protected List<ForecastItem> forecastItem;

        /**
         * Gets the value of the forecastItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the forecastItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getForecastItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ForecastItem }
         * 
         * 
         */
        public List<ForecastItem> getForecastItem() {
            if (forecastItem == null) {
                forecastItem = new ArrayList<ForecastItem>();
            }
            return this.forecastItem;
        }

    }

}
