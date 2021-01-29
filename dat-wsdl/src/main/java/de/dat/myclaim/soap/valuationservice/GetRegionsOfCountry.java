
package de.dat.myclaim.soap.valuationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getRegionsOfCountry complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getRegionsOfCountry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://www.dat.eu/myClaim/soap/v2/ValuationService}yearMonthsForCountryRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRegionsOfCountry", namespace = "http://www.dat.eu/myClaim/soap/v2/ValuationService", propOrder = {
    "request"
})
public class GetRegionsOfCountry {

    @XmlElement(namespace = "")
    protected YearMonthsForCountryRequest request;

    /**
     * Ruft den Wert der request-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link YearMonthsForCountryRequest }
     *     
     */
    public YearMonthsForCountryRequest getRequest() {
        return request;
    }

    /**
     * Legt den Wert der request-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link YearMonthsForCountryRequest }
     *     
     */
    public void setRequest(YearMonthsForCountryRequest value) {
        this.request = value;
    }

}
