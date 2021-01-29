
package de.dat.glassrep.services.vehicleidentificationservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für typecodeSelectionToyotaRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="typecodeSelectionToyotaRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/VehicleIdentificationService}abstractSelectionRequest">
 *       &lt;sequence>
 *         &lt;element name="colorCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="coverage" type="{http://sphinx.dat.de/services/VehicleIdentificationService}vehicleCoverage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="equipmentCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://sphinx.dat.de/services/VehicleIdentificationService}manufacturerToyota"/>
 *         &lt;element name="productionDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *         &lt;element name="restriction" type="{http://sphinx.dat.de/services/VehicleIdentificationService}releaseRestriction"/>
 *         &lt;element name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typecodeSelectionToyotaRequest", namespace = "http://sphinx.dat.de/services/VehicleIdentificationService", propOrder = {
    "colorCode",
    "coverage",
    "equipmentCode",
    "manufacturer",
    "productionDate",
    "restriction",
    "typeCode"
})
public class TypecodeSelectionToyotaRequest
    extends AbstractSelectionRequest
{

    @XmlElement(namespace = "", nillable = true)
    protected List<String> colorCode;
    @XmlElement(namespace = "", nillable = true)
    @XmlSchemaType(name = "string")
    protected List<VehicleCoverage> coverage;
    @XmlElement(namespace = "", nillable = true)
    protected List<String> equipmentCode;
    @XmlElement(namespace = "", required = true)
    @XmlSchemaType(name = "string")
    protected ManufacturerToyota manufacturer;
    @XmlElement(namespace = "", required = true)
    protected Object productionDate;
    @XmlElement(namespace = "", required = true)
    @XmlSchemaType(name = "string")
    protected ReleaseRestriction restriction;
    @XmlElement(namespace = "", required = true)
    protected String typeCode;

    /**
     * Gets the value of the colorCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colorCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColorCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getColorCode() {
        if (colorCode == null) {
            colorCode = new ArrayList<String>();
        }
        return this.colorCode;
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
     * Gets the value of the equipmentCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEquipmentCode() {
        if (equipmentCode == null) {
            equipmentCode = new ArrayList<String>();
        }
        return this.equipmentCode;
    }

    /**
     * Ruft den Wert der manufacturer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturerToyota }
     *     
     */
    public ManufacturerToyota getManufacturer() {
        return manufacturer;
    }

    /**
     * Legt den Wert der manufacturer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturerToyota }
     *     
     */
    public void setManufacturer(ManufacturerToyota value) {
        this.manufacturer = value;
    }

    /**
     * Ruft den Wert der productionDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProductionDate() {
        return productionDate;
    }

    /**
     * Legt den Wert der productionDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProductionDate(Object value) {
        this.productionDate = value;
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
     * Ruft den Wert der typeCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Legt den Wert der typeCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

}
