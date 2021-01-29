
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getCalculationSummaryByType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getCalculationSummaryByType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="summaryType" type="{http://www.dat.eu/myClaim/soap/MyClaimExternalService}calculationSummaryType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCalculationSummaryByType", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "contractId",
    "summaryType"
})
public class GetCalculationSummaryByType {

    @XmlElement(namespace = "")
    protected long contractId;
    @XmlElement(namespace = "", required = true)
    @XmlSchemaType(name = "string")
    protected CalculationSummaryType summaryType;

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
     * Ruft den Wert der summaryType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalculationSummaryType }
     *     
     */
    public CalculationSummaryType getSummaryType() {
        return summaryType;
    }

    /**
     * Legt den Wert der summaryType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationSummaryType }
     *     
     */
    public void setSummaryType(CalculationSummaryType value) {
        this.summaryType = value;
    }

}
