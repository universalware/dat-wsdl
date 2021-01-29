
package de.dat.vehiclerepaironline.services.conversionfunctionsservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getEquipmentGroups complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getEquipmentGroups">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://sphinx.dat.de/services/ConversionFunctionsService}abstractSelectionRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEquipmentGroups", namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", propOrder = {
    "request"
})
public class GetEquipmentGroups {

    @XmlElement(namespace = "")
    protected AbstractSelectionRequest request;

    /**
     * Ruft den Wert der request-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbstractSelectionRequest }
     *     
     */
    public AbstractSelectionRequest getRequest() {
        return request;
    }

    /**
     * Legt den Wert der request-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractSelectionRequest }
     *     
     */
    public void setRequest(AbstractSelectionRequest value) {
        this.request = value;
    }

}
