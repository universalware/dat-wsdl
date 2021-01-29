
package de.dat.authorizationmanager.soap.customerservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getUserResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getUserResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loginData" type="{http://sphinx.dat.de/cs}userData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserResponse", propOrder = {
    "loginData"
})
public class GetUserResponse {

    protected UserData loginData;

    /**
     * Ruft den Wert der loginData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserData }
     *     
     */
    public UserData getLoginData() {
        return loginData;
    }

    /**
     * Legt den Wert der loginData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserData }
     *     
     */
    public void setLoginData(UserData value) {
        this.loginData = value;
    }

}
