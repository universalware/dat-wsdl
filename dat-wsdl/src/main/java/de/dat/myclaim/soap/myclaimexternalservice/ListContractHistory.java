
package de.dat.myclaim.soap.myclaimexternalservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für listContractHistory complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="listContractHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="producedFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="historyEvent" type="{http://www.dat.eu/myClaim/soap/MyClaimExternalService}historyEvent" minOccurs="0"/>
 *         &lt;element name="senderRoles" type="{http://www.dat.eu/myClaim/soap/MyClaimExternalService}customerRole" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listContractHistory", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "contractId",
    "producedFrom",
    "historyEvent",
    "senderRoles"
})
public class ListContractHistory {

    @XmlElement(namespace = "")
    protected long contractId;
    @XmlElement(namespace = "")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar producedFrom;
    @XmlElement(namespace = "")
    @XmlSchemaType(name = "string")
    protected HistoryEvent historyEvent;
    @XmlElement(namespace = "")
    @XmlSchemaType(name = "string")
    protected List<CustomerRole> senderRoles;

    /**
     * Ruft den Wert der contractId-Eigenschaft ab.
     * 
     */
    public long getContractId() {
        return contractId;
    }

    /**
     * Legt den Wert der contractId-Eigenschaft fest.
     * 
     */
    public void setContractId(long value) {
        this.contractId = value;
    }

    /**
     * Ruft den Wert der producedFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProducedFrom() {
        return producedFrom;
    }

    /**
     * Legt den Wert der producedFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProducedFrom(XMLGregorianCalendar value) {
        this.producedFrom = value;
    }

    /**
     * Ruft den Wert der historyEvent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HistoryEvent }
     *     
     */
    public HistoryEvent getHistoryEvent() {
        return historyEvent;
    }

    /**
     * Legt den Wert der historyEvent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryEvent }
     *     
     */
    public void setHistoryEvent(HistoryEvent value) {
        this.historyEvent = value;
    }

    /**
     * Gets the value of the senderRoles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the senderRoles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSenderRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerRole }
     * 
     * 
     */
    public List<CustomerRole> getSenderRoles() {
        if (senderRoles == null) {
            senderRoles = new ArrayList<CustomerRole>();
        }
        return this.senderRoles;
    }

}
