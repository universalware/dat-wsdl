
package de.dat.financeline.services.evaluation;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für condition complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="condition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accidentDamage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correctionFactorPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="decreaseInValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="increaseInValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="numberOfOwners" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ownerCorrectionPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="repairCosts" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tiresMountedValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tiresUnmountedValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "condition", namespace = "http://sphinx.dat.de/services/Evaluation", propOrder = {
    "accidentDamage",
    "correctionFactorPercent",
    "decreaseInValue",
    "increaseInValue",
    "numberOfOwners",
    "ownerCorrectionPercent",
    "repairCosts",
    "tiresMountedValue",
    "tiresUnmountedValue"
})
public class Condition {

    @XmlElementRef(name = "accidentDamage", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accidentDamage;
    @XmlElementRef(name = "correctionFactorPercent", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> correctionFactorPercent;
    @XmlElementRef(name = "decreaseInValue", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> decreaseInValue;
    @XmlElementRef(name = "increaseInValue", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> increaseInValue;
    @XmlElementRef(name = "numberOfOwners", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfOwners;
    @XmlElementRef(name = "ownerCorrectionPercent", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> ownerCorrectionPercent;
    @XmlElementRef(name = "repairCosts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> repairCosts;
    @XmlElementRef(name = "tiresMountedValue", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> tiresMountedValue;
    @XmlElementRef(name = "tiresUnmountedValue", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> tiresUnmountedValue;

    /**
     * Ruft den Wert der accidentDamage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccidentDamage() {
        return accidentDamage;
    }

    /**
     * Legt den Wert der accidentDamage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccidentDamage(JAXBElement<String> value) {
        this.accidentDamage = value;
    }

    /**
     * Ruft den Wert der correctionFactorPercent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCorrectionFactorPercent() {
        return correctionFactorPercent;
    }

    /**
     * Legt den Wert der correctionFactorPercent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCorrectionFactorPercent(JAXBElement<BigDecimal> value) {
        this.correctionFactorPercent = value;
    }

    /**
     * Ruft den Wert der decreaseInValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDecreaseInValue() {
        return decreaseInValue;
    }

    /**
     * Legt den Wert der decreaseInValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDecreaseInValue(JAXBElement<BigDecimal> value) {
        this.decreaseInValue = value;
    }

    /**
     * Ruft den Wert der increaseInValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIncreaseInValue() {
        return increaseInValue;
    }

    /**
     * Legt den Wert der increaseInValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIncreaseInValue(JAXBElement<BigDecimal> value) {
        this.increaseInValue = value;
    }

    /**
     * Ruft den Wert der numberOfOwners-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfOwners() {
        return numberOfOwners;
    }

    /**
     * Legt den Wert der numberOfOwners-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfOwners(JAXBElement<Integer> value) {
        this.numberOfOwners = value;
    }

    /**
     * Ruft den Wert der ownerCorrectionPercent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOwnerCorrectionPercent() {
        return ownerCorrectionPercent;
    }

    /**
     * Legt den Wert der ownerCorrectionPercent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOwnerCorrectionPercent(JAXBElement<BigDecimal> value) {
        this.ownerCorrectionPercent = value;
    }

    /**
     * Ruft den Wert der repairCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRepairCosts() {
        return repairCosts;
    }

    /**
     * Legt den Wert der repairCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRepairCosts(JAXBElement<BigDecimal> value) {
        this.repairCosts = value;
    }

    /**
     * Ruft den Wert der tiresMountedValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTiresMountedValue() {
        return tiresMountedValue;
    }

    /**
     * Legt den Wert der tiresMountedValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTiresMountedValue(JAXBElement<BigDecimal> value) {
        this.tiresMountedValue = value;
    }

    /**
     * Ruft den Wert der tiresUnmountedValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTiresUnmountedValue() {
        return tiresUnmountedValue;
    }

    /**
     * Legt den Wert der tiresUnmountedValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTiresUnmountedValue(JAXBElement<BigDecimal> value) {
        this.tiresUnmountedValue = value;
    }

}
