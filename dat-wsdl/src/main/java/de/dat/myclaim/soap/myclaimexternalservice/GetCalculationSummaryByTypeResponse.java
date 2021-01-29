
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getCalculationSummaryByTypeResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getCalculationSummaryByTypeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dat.de/vxs}CalculationSummary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCalculationSummaryByTypeResponse", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "calculationSummary"
})
public class GetCalculationSummaryByTypeResponse {

    @XmlElement(name = "CalculationSummary", namespace = "http://www.dat.de/vxs")
    protected CalculationSummary calculationSummary;

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

}
