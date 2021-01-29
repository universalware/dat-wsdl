
package de.dat.vehiclerepaironline.services.authentication;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r generateTokenRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="generateTokenRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerLogin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="interfacePartnerNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="interfacePartnerSignature" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productVariant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generateTokenRequest", propOrder = {
    "customerLogin",
    "customerNumber",
    "customerPassword",
    "interfacePartnerNumber",
    "interfacePartnerSignature",
    "productVariant"
})
public class GenerateTokenRequest {

    @XmlElement(required = true)
    protected String customerLogin;
    @XmlElement(required = true)
    protected String customerNumber;
    @XmlElement(required = true)
    protected String customerPassword;
    @XmlElement(required = true)
    protected String interfacePartnerNumber;
    @XmlElement(required = true)
    protected String interfacePartnerSignature;
    @XmlElementRef(name = "productVariant", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productVariant;

    /**
     * Ruft den Wert der customerLogin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLogin() {
        return customerLogin;
    }

    /**
     * Legt den Wert der customerLogin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLogin(String value) {
        this.customerLogin = value;
    }

    /**
     * Ruft den Wert der customerNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Legt den Wert der customerNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

    /**
     * Ruft den Wert der customerPassword-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPassword() {
        return customerPassword;
    }

    /**
     * Legt den Wert der customerPassword-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPassword(String value) {
        this.customerPassword = value;
    }

    /**
     * Ruft den Wert der interfacePartnerNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfacePartnerNumber() {
        return interfacePartnerNumber;
    }

    /**
     * Legt den Wert der interfacePartnerNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfacePartnerNumber(String value) {
        this.interfacePartnerNumber = value;
    }

    /**
     * Ruft den Wert der interfacePartnerSignature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfacePartnerSignature() {
        return interfacePartnerSignature;
    }

    /**
     * Legt den Wert der interfacePartnerSignature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfacePartnerSignature(String value) {
        this.interfacePartnerSignature = value;
    }

    /**
     * Ruft den Wert der productVariant-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductVariant() {
        return productVariant;
    }

    /**
     * Legt den Wert der productVariant-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductVariant(JAXBElement<String> value) {
        this.productVariant = value;
    }

}
