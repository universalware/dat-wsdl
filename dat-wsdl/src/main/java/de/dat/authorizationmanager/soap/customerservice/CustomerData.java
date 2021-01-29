
package de.dat.authorizationmanager.soap.customerservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für customerData complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="customerData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerName1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerName3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerStreet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerStreetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerZip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerData", propOrder = {
    "customerName1",
    "customerName2",
    "customerName3",
    "customerStreet",
    "customerStreetNumber",
    "customerZip",
    "customerCity",
    "customerCountry",
    "customerTel",
    "customerEmail"
})
@XmlSeeAlso({
    CustomerDataExt.class
})
public class CustomerData {

    @XmlElement(required = true)
    protected String customerName1;
    protected String customerName2;
    protected String customerName3;
    @XmlElement(required = true)
    protected String customerStreet;
    protected String customerStreetNumber;
    @XmlElement(required = true)
    protected String customerZip;
    @XmlElement(required = true)
    protected String customerCity;
    @XmlElement(required = true)
    protected String customerCountry;
    protected String customerTel;
    @XmlElement(required = true)
    protected String customerEmail;

    /**
     * Ruft den Wert der customerName1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName1() {
        return customerName1;
    }

    /**
     * Legt den Wert der customerName1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName1(String value) {
        this.customerName1 = value;
    }

    /**
     * Ruft den Wert der customerName2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName2() {
        return customerName2;
    }

    /**
     * Legt den Wert der customerName2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName2(String value) {
        this.customerName2 = value;
    }

    /**
     * Ruft den Wert der customerName3-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName3() {
        return customerName3;
    }

    /**
     * Legt den Wert der customerName3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName3(String value) {
        this.customerName3 = value;
    }

    /**
     * Ruft den Wert der customerStreet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerStreet() {
        return customerStreet;
    }

    /**
     * Legt den Wert der customerStreet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerStreet(String value) {
        this.customerStreet = value;
    }

    /**
     * Ruft den Wert der customerStreetNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerStreetNumber() {
        return customerStreetNumber;
    }

    /**
     * Legt den Wert der customerStreetNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerStreetNumber(String value) {
        this.customerStreetNumber = value;
    }

    /**
     * Ruft den Wert der customerZip-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerZip() {
        return customerZip;
    }

    /**
     * Legt den Wert der customerZip-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerZip(String value) {
        this.customerZip = value;
    }

    /**
     * Ruft den Wert der customerCity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCity() {
        return customerCity;
    }

    /**
     * Legt den Wert der customerCity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCity(String value) {
        this.customerCity = value;
    }

    /**
     * Ruft den Wert der customerCountry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCountry() {
        return customerCountry;
    }

    /**
     * Legt den Wert der customerCountry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCountry(String value) {
        this.customerCountry = value;
    }

    /**
     * Ruft den Wert der customerTel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTel() {
        return customerTel;
    }

    /**
     * Legt den Wert der customerTel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTel(String value) {
        this.customerTel = value;
    }

    /**
     * Ruft den Wert der customerEmail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * Legt den Wert der customerEmail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerEmail(String value) {
        this.customerEmail = value;
    }

}
