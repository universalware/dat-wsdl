
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
 * <p>Java-Klasse für listContracts complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="listContracts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusesId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contractTypes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="networkTypes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partnersToRetrieve" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="openedSince" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="changedSince" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="folder" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pageLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageOffset" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="attributes" type="{http://www.dat.eu/myClaim/soap/MyClaimExternalService}claimAttributes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listContracts", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "statusesId",
    "contractTypes",
    "networkTypes",
    "partnersToRetrieve",
    "openedSince",
    "changedSince",
    "folder",
    "pageLimit",
    "pageOffset",
    "attributes"
})
public class ListContracts {

    @XmlElement(namespace = "", type = Long.class)
    protected List<Long> statusesId;
    @XmlElement(namespace = "")
    protected List<String> contractTypes;
    @XmlElement(namespace = "")
    protected List<String> networkTypes;
    @XmlElement(namespace = "")
    protected List<String> partnersToRetrieve;
    @XmlElement(namespace = "")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar openedSince;
    @XmlElement(namespace = "")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changedSince;
    @XmlElement(namespace = "")
    protected Long folder;
    @XmlElement(namespace = "")
    protected int pageLimit;
    @XmlElement(namespace = "")
    protected int pageOffset;
    @XmlElement(namespace = "")
    protected ClaimAttributes attributes;

    /**
     * Gets the value of the statusesId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusesId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusesId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getStatusesId() {
        if (statusesId == null) {
            statusesId = new ArrayList<Long>();
        }
        return this.statusesId;
    }

    /**
     * Gets the value of the contractTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContractTypes() {
        if (contractTypes == null) {
            contractTypes = new ArrayList<String>();
        }
        return this.contractTypes;
    }

    /**
     * Gets the value of the networkTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networkTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNetworkTypes() {
        if (networkTypes == null) {
            networkTypes = new ArrayList<String>();
        }
        return this.networkTypes;
    }

    /**
     * Gets the value of the partnersToRetrieve property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnersToRetrieve property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnersToRetrieve().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPartnersToRetrieve() {
        if (partnersToRetrieve == null) {
            partnersToRetrieve = new ArrayList<String>();
        }
        return this.partnersToRetrieve;
    }

    /**
     * Ruft den Wert der openedSince-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpenedSince() {
        return openedSince;
    }

    /**
     * Legt den Wert der openedSince-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpenedSince(XMLGregorianCalendar value) {
        this.openedSince = value;
    }

    /**
     * Ruft den Wert der changedSince-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangedSince() {
        return changedSince;
    }

    /**
     * Legt den Wert der changedSince-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangedSince(XMLGregorianCalendar value) {
        this.changedSince = value;
    }

    /**
     * Ruft den Wert der folder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFolder() {
        return folder;
    }

    /**
     * Legt den Wert der folder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFolder(Long value) {
        this.folder = value;
    }

    /**
     * Ruft den Wert der pageLimit-Eigenschaft ab.
     * 
     */
    public int getPageLimit() {
        return pageLimit;
    }

    /**
     * Legt den Wert der pageLimit-Eigenschaft fest.
     * 
     */
    public void setPageLimit(int value) {
        this.pageLimit = value;
    }

    /**
     * Ruft den Wert der pageOffset-Eigenschaft ab.
     * 
     */
    public int getPageOffset() {
        return pageOffset;
    }

    /**
     * Legt den Wert der pageOffset-Eigenschaft fest.
     * 
     */
    public void setPageOffset(int value) {
        this.pageOffset = value;
    }

    /**
     * Ruft den Wert der attributes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClaimAttributes }
     *     
     */
    public ClaimAttributes getAttributes() {
        return attributes;
    }

    /**
     * Legt den Wert der attributes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimAttributes }
     *     
     */
    public void setAttributes(ClaimAttributes value) {
        this.attributes = value;
    }

}
