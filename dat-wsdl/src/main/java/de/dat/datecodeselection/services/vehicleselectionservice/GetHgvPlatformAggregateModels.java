
package de.dat.datecodeselection.services.vehicleselectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r getHgvPlatformAggregateModels complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getHgvPlatformAggregateModels">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://sphinx.dat.de/services/VehicleSelectionService}hgvPlatformAggregateModelSelectionRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getHgvPlatformAggregateModels", namespace = "http://sphinx.dat.de/services/VehicleSelectionService", propOrder = {
    "request"
})
public class GetHgvPlatformAggregateModels {

    @XmlElement(namespace = "")
    protected HgvPlatformAggregateModelSelectionRequest request;

    /**
     * Ruft den Wert der request-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HgvPlatformAggregateModelSelectionRequest }
     *     
     */
    public HgvPlatformAggregateModelSelectionRequest getRequest() {
        return request;
    }

    /**
     * Legt den Wert der request-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HgvPlatformAggregateModelSelectionRequest }
     *     
     */
    public void setRequest(HgvPlatformAggregateModelSelectionRequest value) {
        this.request = value;
    }

}
