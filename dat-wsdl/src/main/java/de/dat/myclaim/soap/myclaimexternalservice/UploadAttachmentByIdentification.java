
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für uploadAttachmentByIdentification complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="uploadAttachmentByIdentification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="attachmentItem" type="{http://www.dat.eu/myClaim/soap/MyClaimExternalService}attachmentItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadAttachmentByIdentification", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "contractId",
    "attachmentItem"
})
public class UploadAttachmentByIdentification {

    @XmlElement(namespace = "")
    protected long contractId;
    @XmlElement(namespace = "")
    protected AttachmentItem attachmentItem;

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
     * Ruft den Wert der attachmentItem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentItem }
     *     
     */
    public AttachmentItem getAttachmentItem() {
        return attachmentItem;
    }

    /**
     * Legt den Wert der attachmentItem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentItem }
     *     
     */
    public void setAttachmentItem(AttachmentItem value) {
        this.attachmentItem = value;
    }

}
