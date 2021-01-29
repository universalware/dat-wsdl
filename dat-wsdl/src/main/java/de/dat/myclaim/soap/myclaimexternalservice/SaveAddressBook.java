
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für saveAddressBook complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="saveAddressBook">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressBook" type="{http://www.dat.eu/myClaim/soap/MyClaimExternalService}addressBook"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveAddressBook", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "addressBook"
})
public class SaveAddressBook {

    @XmlElement(namespace = "", required = true)
    protected AddressBook addressBook;

    /**
     * Ruft den Wert der addressBook-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AddressBook }
     *     
     */
    public AddressBook getAddressBook() {
        return addressBook;
    }

    /**
     * Legt den Wert der addressBook-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressBook }
     *     
     */
    public void setAddressBook(AddressBook value) {
        this.addressBook = value;
    }

}
