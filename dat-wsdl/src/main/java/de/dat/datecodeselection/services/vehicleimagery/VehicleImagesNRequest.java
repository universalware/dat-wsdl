
package de.dat.datecodeselection.services.vehicleimagery;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für vehicleImagesNRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="vehicleImagesNRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aspect" type="{http://sphinx.dat.de/services/VehicleImagery}vehicleImageAspectN" maxOccurs="unbounded"/>
 *         &lt;element name="datECode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imageType" type="{http://sphinx.dat.de/services/VehicleImagery}vehicleImageType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleImagesNRequest", propOrder = {
    "aspect",
    "datECode",
    "imageType"
})
public class VehicleImagesNRequest {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<VehicleImageAspectN> aspect;
    @XmlElement(required = true)
    protected String datECode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<VehicleImageType> imageType;

    /**
     * Gets the value of the aspect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aspect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAspect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleImageAspectN }
     * 
     * 
     */
    public List<VehicleImageAspectN> getAspect() {
        if (aspect == null) {
            aspect = new ArrayList<VehicleImageAspectN>();
        }
        return this.aspect;
    }

    /**
     * Ruft den Wert der datECode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatECode() {
        return datECode;
    }

    /**
     * Legt den Wert der datECode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatECode(String value) {
        this.datECode = value;
    }

    /**
     * Gets the value of the imageType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleImageType }
     * 
     * 
     */
    public List<VehicleImageType> getImageType() {
        if (imageType == null) {
            imageType = new ArrayList<VehicleImageType>();
        }
        return this.imageType;
    }

}
