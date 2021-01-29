
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getPrintReport complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getPrintReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="reportIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attributes" type="{http://www.dat.eu/myClaim/soap/MyClaimExternalService}attributes" minOccurs="0"/>
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPrintReport", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "contractId",
    "reportIdentification",
    "attributes",
    "format"
})
public class GetPrintReport {

    @XmlElement(namespace = "")
    protected long contractId;
    @XmlElement(namespace = "")
    protected String reportIdentification;
    @XmlElement(namespace = "")
    protected Attributes attributes;
    @XmlElement(namespace = "")
    protected String format;

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
     * Ruft den Wert der reportIdentification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportIdentification() {
        return reportIdentification;
    }

    /**
     * Legt den Wert der reportIdentification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportIdentification(String value) {
        this.reportIdentification = value;
    }

    /**
     * Ruft den Wert der attributes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Attributes }
     *     
     */
    public Attributes getAttributes() {
        return attributes;
    }

    /**
     * Legt den Wert der attributes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Attributes }
     *     
     */
    public void setAttributes(Attributes value) {
        this.attributes = value;
    }

    /**
     * Ruft den Wert der format-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Legt den Wert der format-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

}
