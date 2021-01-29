
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für importCalculationSummaryByType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="importCalculationSummaryByType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="summaryType" type="{http://www.dat.eu/myClaim/soap/MyClaimExternalService}calculationSummaryType"/>
 *         &lt;element ref="{http://www.dat.de/vxs}CalculationSummary"/>
 *         &lt;element name="invoiceAttributes" type="{http://www.dat.eu/myClaim/soap/MyClaimExternalService}invoiceAttributes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importCalculationSummaryByType", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "contractId",
    "summaryType",
    "calculationSummary",
    "invoiceAttributes"
})
public class ImportCalculationSummaryByType {

    @XmlElement(namespace = "")
    protected long contractId;
    @XmlElement(namespace = "", required = true)
    @XmlSchemaType(name = "string")
    protected CalculationSummaryType summaryType;
    @XmlElement(name = "CalculationSummary", namespace = "http://www.dat.de/vxs", required = true)
    protected CalculationSummary calculationSummary;
    @XmlElementRef(name = "invoiceAttributes", type = JAXBElement.class, required = false)
    protected JAXBElement<InvoiceAttributes> invoiceAttributes;

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

    /**
     * Ruft den Wert der calculationSummary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalculationSummary }
     *     
     */
    public CalculationSummary getCalculationSummary() {
        return calculationSummary;
    }

    /**
     * Legt den Wert der calculationSummary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationSummary }
     *     
     */
    public void setCalculationSummary(CalculationSummary value) {
        this.calculationSummary = value;
    }

    /**
     * Ruft den Wert der invoiceAttributes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvoiceAttributes }{@code >}
     *     
     */
    public JAXBElement<InvoiceAttributes> getInvoiceAttributes() {
        return invoiceAttributes;
    }

    /**
     * Legt den Wert der invoiceAttributes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvoiceAttributes }{@code >}
     *     
     */
    public void setInvoiceAttributes(JAXBElement<InvoiceAttributes> value) {
        this.invoiceAttributes = value;
    }

}
