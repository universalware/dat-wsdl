
package de.dat.datecodeselection.services.vehicleimagery;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r vehicleImagesNResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="vehicleImagesNResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="images" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="aspect" type="{http://sphinx.dat.de/services/VehicleImagery}vehicleImageAspectN" minOccurs="0"/>
 *                   &lt;element name="imageType" type="{http://sphinx.dat.de/services/VehicleImagery}vehicleImageType" minOccurs="0"/>
 *                   &lt;element name="imageFormat" type="{http://sphinx.dat.de/services/VehicleImagery}vehicleImageFormat" minOccurs="0"/>
 *                   &lt;element name="imageBase64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleImagesNResponse", propOrder = {
    "images"
})
public class VehicleImagesNResponse {

    @XmlElement(nillable = true)
    protected List<VehicleImagesNResponse.Images> images;

    /**
     * Gets the value of the images property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the images property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleImagesNResponse.Images }
     * 
     * 
     */
    public List<VehicleImagesNResponse.Images> getImages() {
        if (images == null) {
            images = new ArrayList<VehicleImagesNResponse.Images>();
        }
        return this.images;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="aspect" type="{http://sphinx.dat.de/services/VehicleImagery}vehicleImageAspectN" minOccurs="0"/>
     *         &lt;element name="imageType" type="{http://sphinx.dat.de/services/VehicleImagery}vehicleImageType" minOccurs="0"/>
     *         &lt;element name="imageFormat" type="{http://sphinx.dat.de/services/VehicleImagery}vehicleImageFormat" minOccurs="0"/>
     *         &lt;element name="imageBase64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "aspect",
        "imageType",
        "imageFormat",
        "imageBase64"
    })
    public static class Images {

        @XmlSchemaType(name = "string")
        protected VehicleImageAspectN aspect;
        @XmlSchemaType(name = "string")
        protected VehicleImageType imageType;
        @XmlSchemaType(name = "string")
        protected VehicleImageFormat imageFormat;
        protected String imageBase64;

        /**
         * Ruft den Wert der aspect-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link VehicleImageAspectN }
         *     
         */
        public VehicleImageAspectN getAspect() {
            return aspect;
        }

        /**
         * Legt den Wert der aspect-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link VehicleImageAspectN }
         *     
         */
        public void setAspect(VehicleImageAspectN value) {
            this.aspect = value;
        }

        /**
         * Ruft den Wert der imageType-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link VehicleImageType }
         *     
         */
        public VehicleImageType getImageType() {
            return imageType;
        }

        /**
         * Legt den Wert der imageType-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link VehicleImageType }
         *     
         */
        public void setImageType(VehicleImageType value) {
            this.imageType = value;
        }

        /**
         * Ruft den Wert der imageFormat-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link VehicleImageFormat }
         *     
         */
        public VehicleImageFormat getImageFormat() {
            return imageFormat;
        }

        /**
         * Legt den Wert der imageFormat-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link VehicleImageFormat }
         *     
         */
        public void setImageFormat(VehicleImageFormat value) {
            this.imageFormat = value;
        }

        /**
         * Ruft den Wert der imageBase64-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImageBase64() {
            return imageBase64;
        }

        /**
         * Legt den Wert der imageBase64-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImageBase64(String value) {
            this.imageBase64 = value;
        }

    }

}
