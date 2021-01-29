
package de.dat.datecodeselection.services.conversionfunctionsservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für valueCode2DescriptionResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="valueCode2DescriptionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valueCodeDescription" type="{http://sphinx.dat.de/services/ConversionFunctionsService}valueCodeDescription" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valueCode2DescriptionResponse", namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", propOrder = {
    "valueCodeDescription"
})
public class ValueCode2DescriptionResponse {

    @XmlElement(namespace = "")
    protected ValueCodeDescription valueCodeDescription;

    /**
     * Ruft den Wert der valueCodeDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValueCodeDescription }
     *     
     */
    public ValueCodeDescription getValueCodeDescription() {
        return valueCodeDescription;
    }

    /**
     * Legt den Wert der valueCodeDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueCodeDescription }
     *     
     */
    public void setValueCodeDescription(ValueCodeDescription value) {
        this.valueCodeDescription = value;
    }

}
