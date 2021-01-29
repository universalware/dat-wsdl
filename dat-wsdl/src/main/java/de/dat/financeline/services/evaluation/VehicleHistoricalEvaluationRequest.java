
package de.dat.financeline.services.evaluation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für vehicleHistoricalEvaluationRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="vehicleHistoricalEvaluationRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/Evaluation}vehicleEvaluationRequest">
 *       &lt;sequence>
 *         &lt;element name="evaluationDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleHistoricalEvaluationRequest", namespace = "http://sphinx.dat.de/services/Evaluation", propOrder = {
    "evaluationDate"
})
public class VehicleHistoricalEvaluationRequest
    extends VehicleEvaluationRequest
{

    @XmlElement(namespace = "", required = true)
    protected Object evaluationDate;

    /**
     * Ruft den Wert der evaluationDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEvaluationDate() {
        return evaluationDate;
    }

    /**
     * Legt den Wert der evaluationDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEvaluationDate(Object value) {
        this.evaluationDate = value;
    }

}
