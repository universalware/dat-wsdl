
package de.dat.financeline.services.evaluation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für abstractEvaluationRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="abstractEvaluationRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/Evaluation}vehicleSelectionRequest">
 *       &lt;sequence>
 *         &lt;element name="coverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="equipment" type="{http://sphinx.dat.de/services/Evaluation}equipment" minOccurs="0"/>
 *         &lt;element name="extendedMileageCorrection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="save" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractEvaluationRequest", namespace = "http://sphinx.dat.de/services/Evaluation", propOrder = {
    "coverage",
    "equipment",
    "extendedMileageCorrection",
    "externalId",
    "save"
})
@XmlSeeAlso({
    NewVehicleForecastRequest.class,
    VehicleEvaluationRequest.class
})
public abstract class AbstractEvaluationRequest
    extends VehicleSelectionRequest
{

    @XmlElement(namespace = "")
    protected String coverage;
    @XmlElement(namespace = "")
    protected Equipment equipment;
    @XmlElement(namespace = "")
    protected String extendedMileageCorrection;
    @XmlElementRef(name = "ExternalId", type = JAXBElement.class, required = false)
    protected JAXBElement<String> externalId;
    @XmlElement(namespace = "", required = true)
    protected String save;

    /**
     * Ruft den Wert der coverage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverage() {
        return coverage;
    }

    /**
     * Legt den Wert der coverage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverage(String value) {
        this.coverage = value;
    }

    /**
     * Ruft den Wert der equipment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Equipment }
     *     
     */
    public Equipment getEquipment() {
        return equipment;
    }

    /**
     * Legt den Wert der equipment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Equipment }
     *     
     */
    public void setEquipment(Equipment value) {
        this.equipment = value;
    }

    /**
     * Ruft den Wert der extendedMileageCorrection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedMileageCorrection() {
        return extendedMileageCorrection;
    }

    /**
     * Legt den Wert der extendedMileageCorrection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedMileageCorrection(String value) {
        this.extendedMileageCorrection = value;
    }

    /**
     * Ruft den Wert der externalId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExternalId() {
        return externalId;
    }

    /**
     * Legt den Wert der externalId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExternalId(JAXBElement<String> value) {
        this.externalId = value;
    }

    /**
     * Ruft den Wert der save-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSave() {
        return save;
    }

    /**
     * Legt den Wert der save-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSave(String value) {
        this.save = value;
    }

}
