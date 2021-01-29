
package de.dat.glassrep.services.vehicleidentificationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r constructionPeriodSelectionRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="constructionPeriodSelectionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/VehicleIdentificationService}priceFocusSelectionRequest">
 *       &lt;sequence>
 *         &lt;element name="container" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "constructionPeriodSelectionRequest", namespace = "http://sphinx.dat.de/services/VehicleIdentificationService", propOrder = {
    "container"
})
@XmlSeeAlso({
    VehicleTranslationRequest.class,
    VehicleSelectionRequest.class
})
public class ConstructionPeriodSelectionRequest
    extends PriceFocusSelectionRequest
{

    @XmlElement(namespace = "")
    protected String container;

    /**
     * Ruft den Wert der container-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainer() {
        return container;
    }

    /**
     * Legt den Wert der container-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainer(String value) {
        this.container = value;
    }

}
