
package de.dat.authorizationmanager.soap.customerservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für userData complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="userData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userLogin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="externalCustomerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userData", propOrder = {
    "customerNumber",
    "userLogin",
    "userPassword",
    "externalCustomerID"
})
public class UserData {

    @XmlElement(required = true)
    protected String customerNumber;
    @XmlElement(required = true)
    protected String userLogin;
    @XmlElement(required = true)
    protected String userPassword;
    @XmlElement(required = true)
    protected String externalCustomerID;

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
     * Ruft den Wert der userLogin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLogin() {
        return userLogin;
    }

    /**
     * Legt den Wert der userLogin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLogin(String value) {
        this.userLogin = value;
    }

    /**
     * Ruft den Wert der userPassword-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * Legt den Wert der userPassword-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPassword(String value) {
        this.userPassword = value;
    }

    /**
     * Ruft den Wert der externalCustomerID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalCustomerID() {
        return externalCustomerID;
    }

    /**
     * Legt den Wert der externalCustomerID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalCustomerID(String value) {
        this.externalCustomerID = value;
    }

}
