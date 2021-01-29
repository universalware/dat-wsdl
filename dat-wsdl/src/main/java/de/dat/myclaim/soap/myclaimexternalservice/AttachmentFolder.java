
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für attachmentFolder complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="attachmentFolder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="folderID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="enabledFileExtensions" type="{http://www.dat.eu/myClaim/soap/MyClaimExternalService}enabledFileExtensions" minOccurs="0"/>
 *         &lt;element name="folderIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="folderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isOnlySingleAttachmentEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attachmentFolder", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "folderID",
    "enabledFileExtensions",
    "folderIdentification",
    "folderName",
    "isOnlySingleAttachmentEnabled"
})
public class AttachmentFolder {

    @XmlElement(namespace = "")
    protected Long folderID;
    @XmlElement(namespace = "")
    protected EnabledFileExtensions enabledFileExtensions;
    @XmlElement(namespace = "")
    protected String folderIdentification;
    @XmlElement(namespace = "")
    protected String folderName;
    @XmlElement(namespace = "")
    protected Boolean isOnlySingleAttachmentEnabled;

    /**
     * Ruft den Wert der folderID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFolderID() {
        return folderID;
    }

    /**
     * Legt den Wert der folderID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFolderID(Long value) {
        this.folderID = value;
    }

    /**
     * Ruft den Wert der enabledFileExtensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnabledFileExtensions }
     *     
     */
    public EnabledFileExtensions getEnabledFileExtensions() {
        return enabledFileExtensions;
    }

    /**
     * Legt den Wert der enabledFileExtensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledFileExtensions }
     *     
     */
    public void setEnabledFileExtensions(EnabledFileExtensions value) {
        this.enabledFileExtensions = value;
    }

    /**
     * Ruft den Wert der folderIdentification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderIdentification() {
        return folderIdentification;
    }

    /**
     * Legt den Wert der folderIdentification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderIdentification(String value) {
        this.folderIdentification = value;
    }

    /**
     * Ruft den Wert der folderName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderName() {
        return folderName;
    }

    /**
     * Legt den Wert der folderName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderName(String value) {
        this.folderName = value;
    }

    /**
     * Ruft den Wert der isOnlySingleAttachmentEnabled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOnlySingleAttachmentEnabled() {
        return isOnlySingleAttachmentEnabled;
    }

    /**
     * Legt den Wert der isOnlySingleAttachmentEnabled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOnlySingleAttachmentEnabled(Boolean value) {
        this.isOnlySingleAttachmentEnabled = value;
    }

}
