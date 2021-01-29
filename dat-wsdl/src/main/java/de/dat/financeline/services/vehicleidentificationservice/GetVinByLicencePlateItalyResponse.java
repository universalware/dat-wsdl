
package de.dat.financeline.services.vehicleidentificationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse f�r getVinByLicencePlateItalyResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getVinByLicencePlateItalyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VXS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="vin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="licencePlate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="initialRegistration" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="modelPermissionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="engineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="lastRevisionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                 &lt;/all>
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
@XmlType(name = "getVinByLicencePlateItalyResponse", namespace = "http://sphinx.dat.de/services/VehicleIdentificationService", propOrder = {
    "vxs"
})
public class GetVinByLicencePlateItalyResponse {

    @XmlElement(name = "VXS", namespace = "")
    protected GetVinByLicencePlateItalyResponse.VXS vxs;

    /**
     * Ruft den Wert der vxs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GetVinByLicencePlateItalyResponse.VXS }
     *     
     */
    public GetVinByLicencePlateItalyResponse.VXS getVXS() {
        return vxs;
    }

    /**
     * Legt den Wert der vxs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetVinByLicencePlateItalyResponse.VXS }
     *     
     */
    public void setVXS(GetVinByLicencePlateItalyResponse.VXS value) {
        this.vxs = value;
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
     *       &lt;all>
     *         &lt;element name="vin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="licencePlate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="initialRegistration" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="modelPermissionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="engineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="lastRevisionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
    public static class VXS {

        @XmlElement(namespace = "")
        protected String vin;
        @XmlElement(namespace = "")
        protected String licencePlate;
        @XmlElement(namespace = "")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar initialRegistration;
        @XmlElement(namespace = "")
        protected String modelPermissionNumber;
        @XmlElement(namespace = "")
        protected String engineCode;
        @XmlElement(namespace = "")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastRevisionDate;

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

        /**
         * Ruft den Wert der licencePlate-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicencePlate() {
            return licencePlate;
        }

        /**
         * Legt den Wert der licencePlate-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLicencePlate(String value) {
            this.licencePlate = value;
        }

        /**
         * Ruft den Wert der initialRegistration-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getInitialRegistration() {
            return initialRegistration;
        }

        /**
         * Legt den Wert der initialRegistration-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setInitialRegistration(XMLGregorianCalendar value) {
            this.initialRegistration = value;
        }

        /**
         * Ruft den Wert der modelPermissionNumber-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModelPermissionNumber() {
            return modelPermissionNumber;
        }

        /**
         * Legt den Wert der modelPermissionNumber-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModelPermissionNumber(String value) {
            this.modelPermissionNumber = value;
        }

        /**
         * Ruft den Wert der engineCode-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEngineCode() {
            return engineCode;
        }

        /**
         * Legt den Wert der engineCode-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEngineCode(String value) {
            this.engineCode = value;
        }

        /**
         * Ruft den Wert der lastRevisionDate-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastRevisionDate() {
            return lastRevisionDate;
        }

        /**
         * Legt den Wert der lastRevisionDate-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastRevisionDate(XMLGregorianCalendar value) {
            this.lastRevisionDate = value;
        }

    }

}
