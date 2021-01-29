
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für attachmentItem complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="attachmentItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.dat.eu/myClaim/soap/MyClaimExternalService}soapFile">
 *       &lt;sequence>
 *         &lt;element name="published" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="uploaded" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="documentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="attachmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uploaderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="uploaderCustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uploaderIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uploaderRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uploaderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uploaderUserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="uploaderUserLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uploaderUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attachmentItem", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "published",
    "uploaded",
    "documentType",
    "documentID",
    "attachmentType",
    "uploaderId",
    "uploaderCustomerNumber",
    "uploaderIdentification",
    "uploaderRole",
    "uploaderName",
    "uploaderUserId",
    "uploaderUserLogin",
    "uploaderUserName"
})
public class AttachmentItem
    extends SoapFile
{

    @XmlElement(namespace = "")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar published;
    @XmlElement(namespace = "")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar uploaded;
    @XmlElement(namespace = "")
    protected String documentType;
    @XmlElement(namespace = "")
    protected Long documentID;
    @XmlElement(namespace = "")
    protected String attachmentType;
    @XmlElement(namespace = "")
    protected Long uploaderId;
    @XmlElement(namespace = "")
    protected String uploaderCustomerNumber;
    @XmlElement(namespace = "")
    protected String uploaderIdentification;
    @XmlElement(namespace = "")
    protected String uploaderRole;
    @XmlElement(namespace = "")
    protected String uploaderName;
    @XmlElement(namespace = "")
    protected Long uploaderUserId;
    @XmlElement(namespace = "")
    protected String uploaderUserLogin;
    @XmlElement(namespace = "")
    protected String uploaderUserName;

    /**
     * Ruft den Wert der published-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublished() {
        return published;
    }

    /**
     * Legt den Wert der published-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublished(XMLGregorianCalendar value) {
        this.published = value;
    }

    /**
     * Ruft den Wert der uploaded-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUploaded() {
        return uploaded;
    }

    /**
     * Legt den Wert der uploaded-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUploaded(XMLGregorianCalendar value) {
        this.uploaded = value;
    }

    /**
     * Ruft den Wert der documentType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Legt den Wert der documentType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Ruft den Wert der documentID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDocumentID() {
        return documentID;
    }

    /**
     * Legt den Wert der documentID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDocumentID(Long value) {
        this.documentID = value;
    }

    /**
     * Ruft den Wert der attachmentType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentType() {
        return attachmentType;
    }

    /**
     * Legt den Wert der attachmentType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentType(String value) {
        this.attachmentType = value;
    }

    /**
     * Ruft den Wert der uploaderId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUploaderId() {
        return uploaderId;
    }

    /**
     * Legt den Wert der uploaderId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUploaderId(Long value) {
        this.uploaderId = value;
    }

    /**
     * Ruft den Wert der uploaderCustomerNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploaderCustomerNumber() {
        return uploaderCustomerNumber;
    }

    /**
     * Legt den Wert der uploaderCustomerNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploaderCustomerNumber(String value) {
        this.uploaderCustomerNumber = value;
    }

    /**
     * Ruft den Wert der uploaderIdentification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploaderIdentification() {
        return uploaderIdentification;
    }

    /**
     * Legt den Wert der uploaderIdentification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploaderIdentification(String value) {
        this.uploaderIdentification = value;
    }

    /**
     * Ruft den Wert der uploaderRole-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploaderRole() {
        return uploaderRole;
    }

    /**
     * Legt den Wert der uploaderRole-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploaderRole(String value) {
        this.uploaderRole = value;
    }

    /**
     * Ruft den Wert der uploaderName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploaderName() {
        return uploaderName;
    }

    /**
     * Legt den Wert der uploaderName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploaderName(String value) {
        this.uploaderName = value;
    }

    /**
     * Ruft den Wert der uploaderUserId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUploaderUserId() {
        return uploaderUserId;
    }

    /**
     * Legt den Wert der uploaderUserId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUploaderUserId(Long value) {
        this.uploaderUserId = value;
    }

    /**
     * Ruft den Wert der uploaderUserLogin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploaderUserLogin() {
        return uploaderUserLogin;
    }

    /**
     * Legt den Wert der uploaderUserLogin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploaderUserLogin(String value) {
        this.uploaderUserLogin = value;
    }

    /**
     * Ruft den Wert der uploaderUserName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploaderUserName() {
        return uploaderUserName;
    }

    /**
     * Legt den Wert der uploaderUserName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploaderUserName(String value) {
        this.uploaderUserName = value;
    }

}
