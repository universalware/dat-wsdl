
package de.dat.datecodeselection.services.vehicleselectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für calcResultItaly complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="calcResultItaly">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{http://www.dat.de/vxs}PositionsItaly" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}SummariesItaly" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calcResultItaly", propOrder = {

})
public class CalcResultItaly {

    @XmlElement(name = "PositionsItaly")
    protected PositionsItaly positionsItaly;
    @XmlElement(name = "SummariesItaly")
    protected SummariesItaly summariesItaly;

    /**
     * Ruft den Wert der positionsItaly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PositionsItaly }
     *     
     */
    public PositionsItaly getPositionsItaly() {
        return positionsItaly;
    }

    /**
     * Legt den Wert der positionsItaly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionsItaly }
     *     
     */
    public void setPositionsItaly(PositionsItaly value) {
        this.positionsItaly = value;
    }

    /**
     * Ruft den Wert der summariesItaly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SummariesItaly }
     *     
     */
    public SummariesItaly getSummariesItaly() {
        return summariesItaly;
    }

    /**
     * Legt den Wert der summariesItaly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SummariesItaly }
     *     
     */
    public void setSummariesItaly(SummariesItaly value) {
        this.summariesItaly = value;
    }

}
