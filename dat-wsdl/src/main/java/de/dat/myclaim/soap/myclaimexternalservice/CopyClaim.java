
package de.dat.myclaim.soap.myclaimexternalservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für copyClaim complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="copyClaim">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="claimId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="copySettings" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="referenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="templateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "copyClaim", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "claimId",
    "copySettings",
    "referenceNumber",
    "templateId"
})
public class CopyClaim {

    @XmlElement(namespace = "")
    protected long claimId;
    @XmlElement(namespace = "")
    protected List<String> copySettings;
    @XmlElement(namespace = "")
    protected String referenceNumber;
    @XmlElement(namespace = "")
    protected Long templateId;

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
     * Gets the value of the copySettings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copySettings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopySettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCopySettings() {
        if (copySettings == null) {
            copySettings = new ArrayList<String>();
        }
        return this.copySettings;
    }

    /**
     * Ruft den Wert der referenceNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Legt den Wert der referenceNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

    /**
     * Ruft den Wert der templateId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTemplateId() {
        return templateId;
    }

    /**
     * Legt den Wert der templateId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTemplateId(Long value) {
        this.templateId = value;
    }

}
