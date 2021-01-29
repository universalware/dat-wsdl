
package de.dat.financeline.services.evaluation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für vehicleSelectionRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="vehicleSelectionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/Evaluation}constructionPeriodSelectionRequest">
 *       &lt;sequence>
 *         &lt;element name="constructionTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleSelectionRequest", namespace = "http://sphinx.dat.de/services/Evaluation", propOrder = {
    "constructionTime"
})
@XmlSeeAlso({
    AbstractEvaluationRequest.class,
    VehicleApproximateValueRequest.class
})
public class VehicleSelectionRequest
    extends ConstructionPeriodSelectionRequest
{

    @XmlElement(namespace = "")
    protected int constructionTime;

    /**
     * Ruft den Wert der constructionTime-Eigenschaft ab.
     * 
     */
    public int getConstructionTime() {
        return constructionTime;
    }

    /**
     * Legt den Wert der constructionTime-Eigenschaft fest.
     * 
     */
    public void setConstructionTime(int value) {
        this.constructionTime = value;
    }

}
