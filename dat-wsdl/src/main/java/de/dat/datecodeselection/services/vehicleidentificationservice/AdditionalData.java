
package de.dat.datecodeselection.services.vehicleidentificationservice;

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
 *         &lt;element name="partner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="foreignBrand" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{http://www.dat.de/vxs}CalculationWages"/>
 *         &lt;element ref="{http://www.dat.de/vxs}MetaPositions"/>
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
@XmlRootElement(name = "AdditionalData")
public class AdditionalData {

    @XmlElement(namespace = "", required = true)
    protected String partner;
    @XmlElement(namespace = "")
    protected boolean foreignBrand;
    @XmlElement(name = "CalculationWages", required = true)
    protected CalculationWages calculationWages;
    @XmlElement(name = "MetaPositions", required = true)
    protected MetaPositions metaPositions;

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
     * Ruft den Wert der foreignBrand-Eigenschaft ab.
     * 
     */
    public boolean isForeignBrand() {
        return foreignBrand;
    }

    /**
     * Legt den Wert der foreignBrand-Eigenschaft fest.
     * 
     */
    public void setForeignBrand(boolean value) {
        this.foreignBrand = value;
    }

    /**
     * Ruft den Wert der calculationWages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalculationWages }
     *     
     */
    public CalculationWages getCalculationWages() {
        return calculationWages;
    }

    /**
     * Legt den Wert der calculationWages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationWages }
     *     
     */
    public void setCalculationWages(CalculationWages value) {
        this.calculationWages = value;
    }

    /**
     * Ruft den Wert der metaPositions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetaPositions }
     *     
     */
    public MetaPositions getMetaPositions() {
        return metaPositions;
    }

    /**
     * Legt den Wert der metaPositions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaPositions }
     *     
     */
    public void setMetaPositions(MetaPositions value) {
        this.metaPositions = value;
    }

}
