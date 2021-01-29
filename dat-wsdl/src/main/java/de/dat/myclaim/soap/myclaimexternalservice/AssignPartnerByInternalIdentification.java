
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r assignPartnerByInternalIdentification complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="assignPartnerByInternalIdentification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="internalIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rolePartner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assignPartnerByInternalIdentification", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "contractId",
    "internalIdentification",
    "rolePartner"
})
public class AssignPartnerByInternalIdentification {

    @XmlElement(namespace = "")
    protected long contractId;
    @XmlElement(namespace = "")
    protected String internalIdentification;
    @XmlElement(namespace = "")
    protected String rolePartner;

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
     * Ruft den Wert der internalIdentification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalIdentification() {
        return internalIdentification;
    }

    /**
     * Legt den Wert der internalIdentification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalIdentification(String value) {
        this.internalIdentification = value;
    }

    /**
     * Ruft den Wert der rolePartner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRolePartner() {
        return rolePartner;
    }

    /**
     * Legt den Wert der rolePartner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRolePartner(String value) {
        this.rolePartner = value;
    }

}
