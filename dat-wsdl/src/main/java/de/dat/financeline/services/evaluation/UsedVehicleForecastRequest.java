
package de.dat.financeline.services.evaluation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für usedVehicleForecastRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="usedVehicleForecastRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/Evaluation}newVehicleForecastRequest">
 *       &lt;sequence>
 *         &lt;element name="mileage" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usedVehicleForecastRequest", namespace = "http://sphinx.dat.de/services/Evaluation", propOrder = {
    "mileage",
    "registrationDate"
})
public class UsedVehicleForecastRequest
    extends NewVehicleForecastRequest
{

    @XmlElement(namespace = "")
    protected long mileage;
    @XmlElement(namespace = "", required = true)
    protected Object registrationDate;

    /**
     * Ruft den Wert der mileage-Eigenschaft ab.
     * 
     */
    public long getMileage() {
        return mileage;
    }

    /**
     * Legt den Wert der mileage-Eigenschaft fest.
     * 
     */
    public void setMileage(long value) {
        this.mileage = value;
    }

    /**
     * Ruft den Wert der registrationDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Legt den Wert der registrationDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRegistrationDate(Object value) {
        this.registrationDate = value;
    }

}
