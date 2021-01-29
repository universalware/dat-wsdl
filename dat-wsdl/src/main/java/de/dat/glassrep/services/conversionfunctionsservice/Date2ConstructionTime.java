
package de.dat.glassrep.services.conversionfunctionsservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für date2ConstructionTime complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="date2ConstructionTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://sphinx.dat.de/services/ConversionFunctionsService}date2ConstructionTimeSelectionRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "date2ConstructionTime", namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", propOrder = {
    "request"
})
public class Date2ConstructionTime {

    @XmlElement(namespace = "")
    protected Date2ConstructionTimeSelectionRequest request;

    /**
     * Ruft den Wert der request-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Date2ConstructionTimeSelectionRequest }
     *     
     */
    public Date2ConstructionTimeSelectionRequest getRequest() {
        return request;
    }

    /**
     * Legt den Wert der request-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Date2ConstructionTimeSelectionRequest }
     *     
     */
    public void setRequest(Date2ConstructionTimeSelectionRequest value) {
        this.request = value;
    }

}
