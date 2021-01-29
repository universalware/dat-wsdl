
package de.dat.datecodeselection.services.vehicleidentificationservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für vinSelectionRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="vinSelectionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/VehicleIdentificationService}abstractSelectionRequest">
 *       &lt;sequence>
 *         &lt;element name="constructionTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="coverage" type="{http://sphinx.dat.de/services/VehicleIdentificationService}vehicleCoverage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="restriction" type="{http://sphinx.dat.de/services/VehicleIdentificationService}releaseRestriction"/>
 *         &lt;element name="vin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vinSelectionRequest", namespace = "http://sphinx.dat.de/services/VehicleIdentificationService", propOrder = {
    "constructionTime",
    "coverage",
    "restriction",
    "vin"
})
public class VinSelectionRequest
    extends AbstractSelectionRequest
{

    @XmlElementRef(name = "constructionTime", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> constructionTime;
    @XmlElement(namespace = "", nillable = true)
    @XmlSchemaType(name = "string")
    protected List<VehicleCoverage> coverage;
    @XmlElement(namespace = "", required = true)
    @XmlSchemaType(name = "string")
    protected ReleaseRestriction restriction;
    @XmlElement(namespace = "", required = true)
    protected String vin;

    /**
     * Ruft den Wert der constructionTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConstructionTime() {
        return constructionTime;
    }

    /**
     * Legt den Wert der constructionTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConstructionTime(JAXBElement<Integer> value) {
        this.constructionTime = value;
    }

    /**
     * Gets the value of the coverage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleCoverage }
     * 
     * 
     */
    public List<VehicleCoverage> getCoverage() {
        if (coverage == null) {
            coverage = new ArrayList<VehicleCoverage>();
        }
        return this.coverage;
    }

    /**
     * Ruft den Wert der restriction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReleaseRestriction }
     *     
     */
    public ReleaseRestriction getRestriction() {
        return restriction;
    }

    /**
     * Legt den Wert der restriction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReleaseRestriction }
     *     
     */
    public void setRestriction(ReleaseRestriction value) {
        this.restriction = value;
    }

    /**
     * Ruft den Wert der vin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVin() {
        return vin;
    }

    /**
     * Legt den Wert der vin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVin(String value) {
        this.vin = value;
    }

}
