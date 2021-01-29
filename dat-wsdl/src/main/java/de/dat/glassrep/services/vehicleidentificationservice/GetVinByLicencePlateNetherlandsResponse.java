
package de.dat.glassrep.services.vehicleidentificationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getVinByLicencePlateNetherlandsResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getVinByLicencePlateNetherlandsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="licencePlateNetherlandsResponse" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="vin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="licencePlate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "getVinByLicencePlateNetherlandsResponse", namespace = "http://sphinx.dat.de/services/VehicleIdentificationService", propOrder = {
    "licencePlateNetherlandsResponse"
})
public class GetVinByLicencePlateNetherlandsResponse {

    @XmlElement(namespace = "")
    protected GetVinByLicencePlateNetherlandsResponse.LicencePlateNetherlandsResponse licencePlateNetherlandsResponse;

    /**
     * Ruft den Wert der licencePlateNetherlandsResponse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GetVinByLicencePlateNetherlandsResponse.LicencePlateNetherlandsResponse }
     *     
     */
    public GetVinByLicencePlateNetherlandsResponse.LicencePlateNetherlandsResponse getLicencePlateNetherlandsResponse() {
        return licencePlateNetherlandsResponse;
    }

    /**
     * Legt den Wert der licencePlateNetherlandsResponse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetVinByLicencePlateNetherlandsResponse.LicencePlateNetherlandsResponse }
     *     
     */
    public void setLicencePlateNetherlandsResponse(GetVinByLicencePlateNetherlandsResponse.LicencePlateNetherlandsResponse value) {
        this.licencePlateNetherlandsResponse = value;
    }


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
     *         &lt;element name="vin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="licencePlate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class LicencePlateNetherlandsResponse {

        @XmlElement(namespace = "")
        protected String vin;
        @XmlElement(namespace = "")
        protected String licencePlate;

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

    }

}
