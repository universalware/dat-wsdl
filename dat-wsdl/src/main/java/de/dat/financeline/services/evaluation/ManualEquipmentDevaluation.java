
package de.dat.financeline.services.evaluation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für manualEquipmentDevaluation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="manualEquipmentDevaluation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="devaluationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="percent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "manualEquipmentDevaluation", namespace = "http://sphinx.dat.de/services/Evaluation", propOrder = {
    "devaluationType",
    "percent"
})
public class ManualEquipmentDevaluation {

    @XmlElement(namespace = "", required = true)
    protected String devaluationType;
    @XmlElement(namespace = "")
    protected int percent;

    /**
     * Ruft den Wert der devaluationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevaluationType() {
        return devaluationType;
    }

    /**
     * Legt den Wert der devaluationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevaluationType(String value) {
        this.devaluationType = value;
    }

    /**
     * Ruft den Wert der percent-Eigenschaft ab.
     * 
     */
    public int getPercent() {
        return percent;
    }

    /**
     * Legt den Wert der percent-Eigenschaft fest.
     * 
     */
    public void setPercent(int value) {
        this.percent = value;
    }

}
