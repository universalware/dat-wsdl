
package de.dat.financeline.services.evaluation;

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
 *         &lt;element name="MandatorId" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="International" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="NameMandatory" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConfigurationHidden" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="BaseType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="IncludeVat" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="PriceType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="RasterType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="MilageType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Tracking" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="FlatEquipmentValueFlag" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="FlatEquipmentValueType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="FlatEquipmentValue" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="CountryCode" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="CompareFlatEquipments" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.dat.de/vxs}CompareFlatEquipment" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CompareParameters" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.dat.de/vxs}CompareParameter" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlRootElement(name = "Compare")
public class Compare {

    @XmlElement(name = "MandatorId")
    protected FieldString mandatorId;
    @XmlElement(name = "International")
    protected FieldString international;
    @XmlElement(name = "NameMandatory")
    protected FieldBoolean nameMandatory;
    @XmlElement(name = "ConfigurationHidden")
    protected FieldBoolean configurationHidden;
    @XmlElement(name = "BaseType")
    protected FieldString baseType;
    @XmlElement(name = "IncludeVat")
    protected FieldBoolean includeVat;
    @XmlElement(name = "PriceType")
    protected FieldString priceType;
    @XmlElement(name = "RasterType")
    protected FieldString rasterType;
    @XmlElement(name = "MilageType")
    protected FieldString milageType;
    @XmlElement(name = "Tracking")
    protected FieldString tracking;
    @XmlElement(name = "FlatEquipmentValueFlag")
    protected FieldBoolean flatEquipmentValueFlag;
    @XmlElement(name = "FlatEquipmentValueType")
    protected FieldString flatEquipmentValueType;
    @XmlElement(name = "FlatEquipmentValue")
    protected FieldDecimal flatEquipmentValue;
    @XmlElement(name = "CountryCode")
    protected FieldString countryCode;
    @XmlElement(name = "CompareFlatEquipments", required = true)
    protected Compare.CompareFlatEquipments compareFlatEquipments;
    @XmlElement(name = "CompareParameters", required = true)
    protected Compare.CompareParameters compareParameters;

    /**
     * Ruft den Wert der mandatorId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getMandatorId() {
        return mandatorId;
    }

    /**
     * Legt den Wert der mandatorId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setMandatorId(FieldString value) {
        this.mandatorId = value;
    }

    /**
     * Ruft den Wert der international-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getInternational() {
        return international;
    }

    /**
     * Legt den Wert der international-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setInternational(FieldString value) {
        this.international = value;
    }

    /**
     * Ruft den Wert der nameMandatory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getNameMandatory() {
        return nameMandatory;
    }

    /**
     * Legt den Wert der nameMandatory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setNameMandatory(FieldBoolean value) {
        this.nameMandatory = value;
    }

    /**
     * Ruft den Wert der configurationHidden-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getConfigurationHidden() {
        return configurationHidden;
    }

    /**
     * Legt den Wert der configurationHidden-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setConfigurationHidden(FieldBoolean value) {
        this.configurationHidden = value;
    }

    /**
     * Ruft den Wert der baseType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getBaseType() {
        return baseType;
    }

    /**
     * Legt den Wert der baseType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setBaseType(FieldString value) {
        this.baseType = value;
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
     * Ruft den Wert der rasterType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getRasterType() {
        return rasterType;
    }

    /**
     * Legt den Wert der rasterType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setRasterType(FieldString value) {
        this.rasterType = value;
    }

    /**
     * Ruft den Wert der milageType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getMilageType() {
        return milageType;
    }

    /**
     * Legt den Wert der milageType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setMilageType(FieldString value) {
        this.milageType = value;
    }

    /**
     * Ruft den Wert der tracking-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTracking() {
        return tracking;
    }

    /**
     * Legt den Wert der tracking-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTracking(FieldString value) {
        this.tracking = value;
    }

    /**
     * Ruft den Wert der flatEquipmentValueFlag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getFlatEquipmentValueFlag() {
        return flatEquipmentValueFlag;
    }

    /**
     * Legt den Wert der flatEquipmentValueFlag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setFlatEquipmentValueFlag(FieldBoolean value) {
        this.flatEquipmentValueFlag = value;
    }

    /**
     * Ruft den Wert der flatEquipmentValueType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getFlatEquipmentValueType() {
        return flatEquipmentValueType;
    }

    /**
     * Legt den Wert der flatEquipmentValueType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setFlatEquipmentValueType(FieldString value) {
        this.flatEquipmentValueType = value;
    }

    /**
     * Ruft den Wert der flatEquipmentValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getFlatEquipmentValue() {
        return flatEquipmentValue;
    }

    /**
     * Legt den Wert der flatEquipmentValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setFlatEquipmentValue(FieldDecimal value) {
        this.flatEquipmentValue = value;
    }

    /**
     * Ruft den Wert der countryCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCountryCode() {
        return countryCode;
    }

    /**
     * Legt den Wert der countryCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCountryCode(FieldString value) {
        this.countryCode = value;
    }

    /**
     * Ruft den Wert der compareFlatEquipments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Compare.CompareFlatEquipments }
     *     
     */
    public Compare.CompareFlatEquipments getCompareFlatEquipments() {
        return compareFlatEquipments;
    }

    /**
     * Legt den Wert der compareFlatEquipments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Compare.CompareFlatEquipments }
     *     
     */
    public void setCompareFlatEquipments(Compare.CompareFlatEquipments value) {
        this.compareFlatEquipments = value;
    }

    /**
     * Ruft den Wert der compareParameters-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Compare.CompareParameters }
     *     
     */
    public Compare.CompareParameters getCompareParameters() {
        return compareParameters;
    }

    /**
     * Legt den Wert der compareParameters-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Compare.CompareParameters }
     *     
     */
    public void setCompareParameters(Compare.CompareParameters value) {
        this.compareParameters = value;
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
     *         &lt;element ref="{http://www.dat.de/vxs}CompareFlatEquipment" maxOccurs="unbounded" minOccurs="0"/>
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
        "compareFlatEquipment"
    })
    public static class CompareFlatEquipments {

        @XmlElement(name = "CompareFlatEquipment")
        protected List<CompareFlatEquipment> compareFlatEquipment;

        /**
         * Gets the value of the compareFlatEquipment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the compareFlatEquipment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCompareFlatEquipment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CompareFlatEquipment }
         * 
         * 
         */
        public List<CompareFlatEquipment> getCompareFlatEquipment() {
            if (compareFlatEquipment == null) {
                compareFlatEquipment = new ArrayList<CompareFlatEquipment>();
            }
            return this.compareFlatEquipment;
        }

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
     *         &lt;element ref="{http://www.dat.de/vxs}CompareParameter" maxOccurs="unbounded" minOccurs="0"/>
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
        "compareParameter"
    })
    public static class CompareParameters {

        @XmlElement(name = "CompareParameter")
        protected List<CompareParameter> compareParameter;

        /**
         * Gets the value of the compareParameter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the compareParameter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCompareParameter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CompareParameter }
         * 
         * 
         */
        public List<CompareParameter> getCompareParameter() {
            if (compareParameter == null) {
                compareParameter = new ArrayList<CompareParameter>();
            }
            return this.compareParameter;
        }

    }

}
