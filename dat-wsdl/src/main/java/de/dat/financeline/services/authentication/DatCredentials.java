
package de.dat.financeline.services.authentication;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für datCredentials complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="datCredentials">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authType" type="{http://sphinx.dat.de/services/Authentication}authenticationMethod" minOccurs="0"/>
 *         &lt;element name="authorizationErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorizationErrorReason" type="{http://sphinx.dat.de/services/Authentication}authorizationErrorCode" minOccurs="0"/>
 *         &lt;element name="customerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datrcbkb" type="{http://sphinx.dat.de/services/Authentication}datrcbkb" minOccurs="0"/>
 *         &lt;element name="freeProduct" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="httpMethod" type="{http://sphinx.dat.de/services/Authentication}httpMethodEnum" minOccurs="0"/>
 *         &lt;element name="interfacePartnerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interfacePartnerType" type="{http://sphinx.dat.de/services/Authentication}interfaceType" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datCredentials", propOrder = {
    "authType",
    "authorizationErrorMessage",
    "authorizationErrorReason",
    "customerNumber",
    "datrcbkb",
    "freeProduct",
    "httpMethod",
    "interfacePartnerNumber",
    "interfacePartnerType",
    "password",
    "userAgent",
    "username"
})
public class DatCredentials {

    @XmlSchemaType(name = "string")
    protected AuthenticationMethod authType;
    protected String authorizationErrorMessage;
    @XmlSchemaType(name = "string")
    protected AuthorizationErrorCode authorizationErrorReason;
    protected String customerNumber;
    protected Datrcbkb datrcbkb;
    protected boolean freeProduct;
    @XmlSchemaType(name = "string")
    protected HttpMethodEnum httpMethod;
    protected String interfacePartnerNumber;
    @XmlSchemaType(name = "string")
    protected InterfaceType interfacePartnerType;
    protected String password;
    protected String userAgent;
    protected String username;

    /**
     * Ruft den Wert der authType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationMethod }
     *     
     */
    public AuthenticationMethod getAuthType() {
        return authType;
    }

    /**
     * Legt den Wert der authType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationMethod }
     *     
     */
    public void setAuthType(AuthenticationMethod value) {
        this.authType = value;
    }

    /**
     * Ruft den Wert der authorizationErrorMessage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationErrorMessage() {
        return authorizationErrorMessage;
    }

    /**
     * Legt den Wert der authorizationErrorMessage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationErrorMessage(String value) {
        this.authorizationErrorMessage = value;
    }

    /**
     * Ruft den Wert der authorizationErrorReason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationErrorCode }
     *     
     */
    public AuthorizationErrorCode getAuthorizationErrorReason() {
        return authorizationErrorReason;
    }

    /**
     * Legt den Wert der authorizationErrorReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationErrorCode }
     *     
     */
    public void setAuthorizationErrorReason(AuthorizationErrorCode value) {
        this.authorizationErrorReason = value;
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
     * Ruft den Wert der datrcbkb-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Datrcbkb }
     *     
     */
    public Datrcbkb getDatrcbkb() {
        return datrcbkb;
    }

    /**
     * Legt den Wert der datrcbkb-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Datrcbkb }
     *     
     */
    public void setDatrcbkb(Datrcbkb value) {
        this.datrcbkb = value;
    }

    /**
     * Ruft den Wert der freeProduct-Eigenschaft ab.
     * 
     */
    public boolean isFreeProduct() {
        return freeProduct;
    }

    /**
     * Legt den Wert der freeProduct-Eigenschaft fest.
     * 
     */
    public void setFreeProduct(boolean value) {
        this.freeProduct = value;
    }

    /**
     * Ruft den Wert der httpMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HttpMethodEnum }
     *     
     */
    public HttpMethodEnum getHttpMethod() {
        return httpMethod;
    }

    /**
     * Legt den Wert der httpMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HttpMethodEnum }
     *     
     */
    public void setHttpMethod(HttpMethodEnum value) {
        this.httpMethod = value;
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
     * Ruft den Wert der interfacePartnerType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceType }
     *     
     */
    public InterfaceType getInterfacePartnerType() {
        return interfacePartnerType;
    }

    /**
     * Legt den Wert der interfacePartnerType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceType }
     *     
     */
    public void setInterfacePartnerType(InterfaceType value) {
        this.interfacePartnerType = value;
    }

    /**
     * Ruft den Wert der password-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Legt den Wert der password-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Ruft den Wert der userAgent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * Legt den Wert der userAgent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAgent(String value) {
        this.userAgent = value;
    }

    /**
     * Ruft den Wert der username-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Legt den Wert der username-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

}
