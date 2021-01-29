
package de.dat.financeline.services.evaluation;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für equipmentPosition complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="equipmentPosition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datEquipmentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="devaluationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="residualValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "equipmentPosition", namespace = "http://sphinx.dat.de/services/Evaluation", propOrder = {
    "datEquipmentId",
    "devaluationType",
    "residualValue"
})
public class EquipmentPosition {

    @XmlElement(namespace = "")
    protected int datEquipmentId;
    @XmlElement(namespace = "")
    protected String devaluationType;
    @XmlElement(namespace = "")
    protected BigDecimal residualValue;

    /**
     * Ruft den Wert der datEquipmentId-Eigenschaft ab.
     * 
     */
    public int getDatEquipmentId() {
        return datEquipmentId;
    }

    /**
     * Legt den Wert der datEquipmentId-Eigenschaft fest.
     * 
     */
    public void setDatEquipmentId(int value) {
        this.datEquipmentId = value;
    }

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
     * Ruft den Wert der residualValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getResidualValue() {
        return residualValue;
    }

    /**
     * Legt den Wert der residualValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setResidualValue(BigDecimal value) {
        this.residualValue = value;
    }

}
