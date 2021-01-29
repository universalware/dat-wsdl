
package de.dat.authorizationmanager.soap.customerservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für customerDataExt complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="customerDataExt">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/cs}customerData">
 *       &lt;sequence>
 *         &lt;element name="externalCustomerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerDataExt", propOrder = {
    "externalCustomerID"
})
public class CustomerDataExt
    extends CustomerData
{

    @XmlElement(required = true)
    protected String externalCustomerID;

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
