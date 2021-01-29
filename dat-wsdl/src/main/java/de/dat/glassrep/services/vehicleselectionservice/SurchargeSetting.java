
package de.dat.glassrep.services.vehicleselectionservice;

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
 *         &lt;element name="id" type="{http://www.dat.de/vxs}fieldString"/>
 *         &lt;element name="country" type="{http://www.dat.de/vxs}fieldString"/>
 *         &lt;element name="designation" type="{http://www.dat.de/vxs}fieldString"/>
 *         &lt;element name="workingType" type="{http://www.dat.de/vxs}fieldDecimal"/>
 *         &lt;element name="priceSTD" type="{http://www.dat.de/vxs}fieldDecimal"/>
 *         &lt;element name="priceAE" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0"/>
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
@XmlRootElement(name = "SurchargeSetting")
public class SurchargeSetting {

    @XmlElement(namespace = "", required = true)
    protected FieldString id;
    @XmlElement(namespace = "", required = true)
    protected FieldString country;
    @XmlElement(namespace = "", required = true)
    protected FieldString designation;
    @XmlElement(namespace = "", required = true)
    protected FieldDecimal workingType;
    @XmlElement(namespace = "", required = true)
    protected FieldDecimal priceSTD;
    @XmlElement(namespace = "")
    protected FieldDecimal priceAE;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setId(FieldString value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der country-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCountry() {
        return country;
    }

    /**
     * Legt den Wert der country-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCountry(FieldString value) {
        this.country = value;
    }

    /**
     * Ruft den Wert der designation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDesignation() {
        return designation;
    }

    /**
     * Legt den Wert der designation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDesignation(FieldString value) {
        this.designation = value;
    }

    /**
     * Ruft den Wert der workingType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWorkingType() {
        return workingType;
    }

    /**
     * Legt den Wert der workingType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWorkingType(FieldDecimal value) {
        this.workingType = value;
    }

    /**
     * Ruft den Wert der priceSTD-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPriceSTD() {
        return priceSTD;
    }

    /**
     * Legt den Wert der priceSTD-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPriceSTD(FieldDecimal value) {
        this.priceSTD = value;
    }

    /**
     * Ruft den Wert der priceAE-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPriceAE() {
        return priceAE;
    }

    /**
     * Legt den Wert der priceAE-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPriceAE(FieldDecimal value) {
        this.priceAE = value;
    }

}
