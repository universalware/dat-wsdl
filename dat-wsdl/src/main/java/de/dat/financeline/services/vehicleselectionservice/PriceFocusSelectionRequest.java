
package de.dat.financeline.services.vehicleselectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für priceFocusSelectionRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="priceFocusSelectionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/VehicleSelectionService}basicSelectionRequest">
 *       &lt;sequence>
 *         &lt;element name="datECode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priceFocusSelectionRequest", namespace = "http://sphinx.dat.de/services/VehicleSelectionService", propOrder = {
    "datECode"
})
@XmlSeeAlso({
    ConstructionPeriodSelectionRequest.class
})
public class PriceFocusSelectionRequest
    extends BasicSelectionRequest
{

    @XmlElement(namespace = "", required = true)
    protected String datECode;

    /**
     * Ruft den Wert der datECode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatECode() {
        return datECode;
    }

    /**
     * Legt den Wert der datECode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatECode(String value) {
        this.datECode = value;
    }

}
