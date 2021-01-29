
package de.dat.myclaim.soap.myclaimexternalservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für addMessage complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="addMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="claimId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="recipients" type="{http://www.dat.eu/myClaim/soap/MyClaimExternalService}customerRole" maxOccurs="unbounded"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addMessage", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "claimId",
    "recipients",
    "message"
})
public class AddMessage {

    @XmlElement(namespace = "")
    protected long claimId;
    @XmlElement(namespace = "", required = true)
    @XmlSchemaType(name = "string")
    protected List<CustomerRole> recipients;
    @XmlElement(namespace = "", required = true)
    protected String message;

    /**
     * Ruft den Wert der claimId-Eigenschaft ab.
     * 
     */
    public long getClaimId() {
        return claimId;
    }

    /**
     * Legt den Wert der claimId-Eigenschaft fest.
     * 
     */
    public void setClaimId(long value) {
        this.claimId = value;
    }

    /**
     * Gets the value of the recipients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerRole }
     * 
     * 
     */
    public List<CustomerRole> getRecipients() {
        if (recipients == null) {
            recipients = new ArrayList<CustomerRole>();
        }
        return this.recipients;
    }

    /**
     * Ruft den Wert der message-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Legt den Wert der message-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
