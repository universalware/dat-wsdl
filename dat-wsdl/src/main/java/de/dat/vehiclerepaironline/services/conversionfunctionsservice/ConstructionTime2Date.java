
package de.dat.vehiclerepaironline.services.conversionfunctionsservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für constructionTime2Date complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="constructionTime2Date">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://sphinx.dat.de/services/ConversionFunctionsService}constructionTime2DateSelectionRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "constructionTime2Date", namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", propOrder = {
    "request"
})
public class ConstructionTime2Date {

    @XmlElement(namespace = "")
    protected ConstructionTime2DateSelectionRequest request;

    /**
     * Ruft den Wert der request-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConstructionTime2DateSelectionRequest }
     *     
     */
    public ConstructionTime2DateSelectionRequest getRequest() {
        return request;
    }

    /**
     * Legt den Wert der request-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstructionTime2DateSelectionRequest }
     *     
     */
    public void setRequest(ConstructionTime2DateSelectionRequest value) {
        this.request = value;
    }

}
