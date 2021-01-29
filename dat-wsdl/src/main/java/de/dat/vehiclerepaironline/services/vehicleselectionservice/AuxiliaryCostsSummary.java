
package de.dat.vehiclerepaironline.services.vehicleselectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AuxiliaryCostsSummary complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AuxiliaryCostsSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalSum" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuxiliaryCostsSummary", propOrder = {
    "totalSum"
})
public class AuxiliaryCostsSummary {

    @XmlElement(name = "TotalSum")
    protected FieldDecimal totalSum;

    /**
     * Ruft den Wert der totalSum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTotalSum() {
        return totalSum;
    }

    /**
     * Legt den Wert der totalSum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTotalSum(FieldDecimal value) {
        this.totalSum = value;
    }

}
