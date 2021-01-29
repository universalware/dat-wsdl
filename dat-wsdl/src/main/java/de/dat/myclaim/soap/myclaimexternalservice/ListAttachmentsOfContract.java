
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
 * <p>Java-Klasse für listAttachmentsOfContract complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="listAttachmentsOfContract">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="attachmentTypes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="documentTypes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="newerThan" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listAttachmentsOfContract", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "contractId",
    "attachmentTypes",
    "documentTypes",
    "newerThan"
})
public class ListAttachmentsOfContract {

    @XmlElement(namespace = "")
    protected long contractId;
    @XmlElement(namespace = "", nillable = true)
    protected List<String> attachmentTypes;
    @XmlElement(namespace = "", nillable = true)
    protected List<String> documentTypes;
    @XmlElement(namespace = "")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar newerThan;

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
     * Gets the value of the attachmentTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachmentTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAttachmentTypes() {
        if (attachmentTypes == null) {
            attachmentTypes = new ArrayList<String>();
        }
        return this.attachmentTypes;
    }

    /**
     * Gets the value of the documentTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDocumentTypes() {
        if (documentTypes == null) {
            documentTypes = new ArrayList<String>();
        }
        return this.documentTypes;
    }

    /**
     * Ruft den Wert der newerThan-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNewerThan() {
        return newerThan;
    }

    /**
     * Legt den Wert der newerThan-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNewerThan(XMLGregorianCalendar value) {
        this.newerThan = value;
    }

}
