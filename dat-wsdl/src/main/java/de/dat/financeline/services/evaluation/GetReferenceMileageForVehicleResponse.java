
package de.dat.financeline.services.evaluation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getReferenceMileageForVehicleResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getReferenceMileageForVehicleResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referenceMileageForVehicle" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReferenceMileageForVehicleResponse", namespace = "http://sphinx.dat.de/services/Evaluation", propOrder = {
    "referenceMileageForVehicle"
})
public class GetReferenceMileageForVehicleResponse {

    @XmlElement(namespace = "")
    protected Long referenceMileageForVehicle;

    /**
     * Ruft den Wert der referenceMileageForVehicle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReferenceMileageForVehicle() {
        return referenceMileageForVehicle;
    }

    /**
     * Legt den Wert der referenceMileageForVehicle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReferenceMileageForVehicle(Long value) {
        this.referenceMileageForVehicle = value;
    }

}
