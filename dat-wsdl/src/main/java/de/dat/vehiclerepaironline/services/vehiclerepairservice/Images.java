
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Description" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DefaultImage" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="Image" type="{http://www.dat.de/vxs}fieldBinary" minOccurs="0" form="qualified"/>
 *         &lt;element name="ForValuation" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="ForRepairCalculation" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="ForMarketplace" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="ListLabelVariable" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ImageType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Origin" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="LastModification" type="{http://www.dat.de/vxs}fieldDateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="AssignedApplication" type="{http://www.dat.de/vxs}fieldString4" minOccurs="0" form="qualified"/>
 *         &lt;element name="BitIndicatorImageAlteration" type="{http://www.dat.de/vxs}fieldString8" minOccurs="0" form="qualified"/>
 *         &lt;element name="ImageNumber" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "Images")
public class Images {

    @XmlElement(name = "Description")
    protected FieldString description;
    @XmlElement(name = "DefaultImage")
    protected FieldBoolean defaultImage;
    @XmlElement(name = "Image")
    protected FieldBinary image;
    @XmlElement(name = "ForValuation")
    protected FieldBoolean forValuation;
    @XmlElement(name = "ForRepairCalculation")
    protected FieldBoolean forRepairCalculation;
    @XmlElement(name = "ForMarketplace")
    protected FieldBoolean forMarketplace;
    @XmlElement(name = "ListLabelVariable")
    protected FieldString listLabelVariable;
    @XmlElement(name = "ImageType")
    protected FieldString imageType;
    @XmlElement(name = "Origin")
    protected FieldString origin;
    @XmlElement(name = "LastModification")
    protected FieldDateTime lastModification;
    @XmlElement(name = "AssignedApplication")
    protected FieldString4 assignedApplication;
    @XmlElement(name = "BitIndicatorImageAlteration")
    protected FieldString8 bitIndicatorImageAlteration;
    @XmlElement(name = "ImageNumber")
    protected FieldInteger imageNumber;

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDescription(FieldString value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der defaultImage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getDefaultImage() {
        return defaultImage;
    }

    /**
     * Legt den Wert der defaultImage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setDefaultImage(FieldBoolean value) {
        this.defaultImage = value;
    }

    /**
     * Ruft den Wert der image-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBinary }
     *     
     */
    public FieldBinary getImage() {
        return image;
    }

    /**
     * Legt den Wert der image-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBinary }
     *     
     */
    public void setImage(FieldBinary value) {
        this.image = value;
    }

    /**
     * Ruft den Wert der forValuation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getForValuation() {
        return forValuation;
    }

    /**
     * Legt den Wert der forValuation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setForValuation(FieldBoolean value) {
        this.forValuation = value;
    }

    /**
     * Ruft den Wert der forRepairCalculation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getForRepairCalculation() {
        return forRepairCalculation;
    }

    /**
     * Legt den Wert der forRepairCalculation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setForRepairCalculation(FieldBoolean value) {
        this.forRepairCalculation = value;
    }

    /**
     * Ruft den Wert der forMarketplace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getForMarketplace() {
        return forMarketplace;
    }

    /**
     * Legt den Wert der forMarketplace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setForMarketplace(FieldBoolean value) {
        this.forMarketplace = value;
    }

    /**
     * Ruft den Wert der listLabelVariable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getListLabelVariable() {
        return listLabelVariable;
    }

    /**
     * Legt den Wert der listLabelVariable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setListLabelVariable(FieldString value) {
        this.listLabelVariable = value;
    }

    /**
     * Ruft den Wert der imageType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getImageType() {
        return imageType;
    }

    /**
     * Legt den Wert der imageType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setImageType(FieldString value) {
        this.imageType = value;
    }

    /**
     * Ruft den Wert der origin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getOrigin() {
        return origin;
    }

    /**
     * Legt den Wert der origin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setOrigin(FieldString value) {
        this.origin = value;
    }

    /**
     * Ruft den Wert der lastModification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getLastModification() {
        return lastModification;
    }

    /**
     * Legt den Wert der lastModification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setLastModification(FieldDateTime value) {
        this.lastModification = value;
    }

    /**
     * Ruft den Wert der assignedApplication-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString4 }
     *     
     */
    public FieldString4 getAssignedApplication() {
        return assignedApplication;
    }

    /**
     * Legt den Wert der assignedApplication-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString4 }
     *     
     */
    public void setAssignedApplication(FieldString4 value) {
        this.assignedApplication = value;
    }

    /**
     * Ruft den Wert der bitIndicatorImageAlteration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString8 }
     *     
     */
    public FieldString8 getBitIndicatorImageAlteration() {
        return bitIndicatorImageAlteration;
    }

    /**
     * Legt den Wert der bitIndicatorImageAlteration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString8 }
     *     
     */
    public void setBitIndicatorImageAlteration(FieldString8 value) {
        this.bitIndicatorImageAlteration = value;
    }

    /**
     * Ruft den Wert der imageNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getImageNumber() {
        return imageNumber;
    }

    /**
     * Legt den Wert der imageNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setImageNumber(FieldInteger value) {
        this.imageNumber = value;
    }

}
