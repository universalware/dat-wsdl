
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für createContractAdditionalData complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="createContractAdditionalData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/VehicleRepairService}abstractRequest">
 *       &lt;sequence>
 *         &lt;element name="calculationWages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="calculationWage" type="{http://sphinx.dat.de/services/VehicleRepairService}createContractCalculationWage" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="foreignBrand" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MetaPositions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MetaPosition" type="{http://sphinx.dat.de/services/VehicleRepairService}createContractMetaPosition" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="partner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sparePartInDecrease" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="wagesChangeable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createContractAdditionalData", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "calculationWages",
    "foreignBrand",
    "metaPositions",
    "partner",
    "sparePartInDecrease",
    "wagesChangeable"
})
public class CreateContractAdditionalData
    extends AbstractRequest
{

    @XmlElement(namespace = "")
    protected CreateContractAdditionalData.CalculationWages calculationWages;
    @XmlElementRef(name = "foreignBrand", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> foreignBrand;
    @XmlElement(name = "MetaPositions", namespace = "")
    protected CreateContractAdditionalData.MetaPositions metaPositions;
    @XmlElement(namespace = "")
    protected String partner;
    @XmlElement(namespace = "")
    protected BigDecimal sparePartInDecrease;
    @XmlElement(namespace = "")
    protected Integer wagesChangeable;

    /**
     * Ruft den Wert der calculationWages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CreateContractAdditionalData.CalculationWages }
     *     
     */
    public CreateContractAdditionalData.CalculationWages getCalculationWages() {
        return calculationWages;
    }

    /**
     * Legt den Wert der calculationWages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateContractAdditionalData.CalculationWages }
     *     
     */
    public void setCalculationWages(CreateContractAdditionalData.CalculationWages value) {
        this.calculationWages = value;
    }

    /**
     * Ruft den Wert der foreignBrand-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getForeignBrand() {
        return foreignBrand;
    }

    /**
     * Legt den Wert der foreignBrand-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setForeignBrand(JAXBElement<Integer> value) {
        this.foreignBrand = value;
    }

    /**
     * Ruft den Wert der metaPositions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CreateContractAdditionalData.MetaPositions }
     *     
     */
    public CreateContractAdditionalData.MetaPositions getMetaPositions() {
        return metaPositions;
    }

    /**
     * Legt den Wert der metaPositions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateContractAdditionalData.MetaPositions }
     *     
     */
    public void setMetaPositions(CreateContractAdditionalData.MetaPositions value) {
        this.metaPositions = value;
    }

    /**
     * Ruft den Wert der partner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartner() {
        return partner;
    }

    /**
     * Legt den Wert der partner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartner(String value) {
        this.partner = value;
    }

    /**
     * Ruft den Wert der sparePartInDecrease-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSparePartInDecrease() {
        return sparePartInDecrease;
    }

    /**
     * Legt den Wert der sparePartInDecrease-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSparePartInDecrease(BigDecimal value) {
        this.sparePartInDecrease = value;
    }

    /**
     * Ruft den Wert der wagesChangeable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWagesChangeable() {
        return wagesChangeable;
    }

    /**
     * Legt den Wert der wagesChangeable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWagesChangeable(Integer value) {
        this.wagesChangeable = value;
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
     *         &lt;element name="calculationWage" type="{http://sphinx.dat.de/services/VehicleRepairService}createContractCalculationWage" maxOccurs="unbounded" minOccurs="0"/>
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
        "calculationWage"
    })
    public static class CalculationWages {

        @XmlElement(namespace = "")
        protected List<CreateContractCalculationWage> calculationWage;

        /**
         * Gets the value of the calculationWage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the calculationWage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCalculationWage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CreateContractCalculationWage }
         * 
         * 
         */
        public List<CreateContractCalculationWage> getCalculationWage() {
            if (calculationWage == null) {
                calculationWage = new ArrayList<CreateContractCalculationWage>();
            }
            return this.calculationWage;
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
     *         &lt;element name="MetaPosition" type="{http://sphinx.dat.de/services/VehicleRepairService}createContractMetaPosition" maxOccurs="unbounded" minOccurs="0"/>
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
        "metaPosition"
    })
    public static class MetaPositions {

        @XmlElement(name = "MetaPosition", namespace = "")
        protected List<CreateContractMetaPosition> metaPosition;

        /**
         * Gets the value of the metaPosition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the metaPosition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMetaPosition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CreateContractMetaPosition }
         * 
         * 
         */
        public List<CreateContractMetaPosition> getMetaPosition() {
            if (metaPosition == null) {
                metaPosition = new ArrayList<CreateContractMetaPosition>();
            }
            return this.metaPosition;
        }

    }

}
