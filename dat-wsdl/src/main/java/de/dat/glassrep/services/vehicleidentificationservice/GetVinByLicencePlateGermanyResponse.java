
package de.dat.glassrep.services.vehicleidentificationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getVinByLicencePlateGermanyResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getVinByLicencePlateGermanyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="licencePlateGermanyResponse" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="vin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="licencePlate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="hsn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="tsn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="manufacturerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ventureCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="comprehensiveInsCompanyNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="comprehensiveCompanyName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="comprehensiveCompanyName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="comprehensiveCompanyName3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="comprehensiveBeginningDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="comprehensiveEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="comprehensivePolicyNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="comprehensiveInternalNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="comprehensiveContractType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="comprehensiveFullDeductible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="comprehensivePartDeductible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assistanceInsCompanyNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assistanceCompanyName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assistanceCompanyName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assistanceCompanyName3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assistanceBeginningDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assistanceEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assistancePolicyNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assistanceInternalNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assistanceContractType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="registrationYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "getVinByLicencePlateGermanyResponse", namespace = "http://sphinx.dat.de/services/VehicleIdentificationService", propOrder = {
    "licencePlateGermanyResponse"
})
public class GetVinByLicencePlateGermanyResponse {

    @XmlElement(namespace = "")
    protected GetVinByLicencePlateGermanyResponse.LicencePlateGermanyResponse licencePlateGermanyResponse;

    /**
     * Ruft den Wert der licencePlateGermanyResponse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GetVinByLicencePlateGermanyResponse.LicencePlateGermanyResponse }
     *     
     */
    public GetVinByLicencePlateGermanyResponse.LicencePlateGermanyResponse getLicencePlateGermanyResponse() {
        return licencePlateGermanyResponse;
    }

    /**
     * Legt den Wert der licencePlateGermanyResponse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetVinByLicencePlateGermanyResponse.LicencePlateGermanyResponse }
     *     
     */
    public void setLicencePlateGermanyResponse(GetVinByLicencePlateGermanyResponse.LicencePlateGermanyResponse value) {
        this.licencePlateGermanyResponse = value;
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
     *         &lt;element name="hsn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="tsn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="manufacturerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ventureCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="comprehensiveInsCompanyNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="comprehensiveCompanyName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="comprehensiveCompanyName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="comprehensiveCompanyName3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="comprehensiveBeginningDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="comprehensiveEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="comprehensivePolicyNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="comprehensiveInternalNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="comprehensiveContractType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="comprehensiveFullDeductible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="comprehensivePartDeductible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assistanceInsCompanyNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assistanceCompanyName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assistanceCompanyName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assistanceCompanyName3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assistanceBeginningDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assistanceEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assistancePolicyNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assistanceInternalNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assistanceContractType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="registrationYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class LicencePlateGermanyResponse {

        @XmlElement(namespace = "")
        protected String vin;
        @XmlElement(namespace = "")
        protected String licencePlate;
        @XmlElement(namespace = "")
        protected String hsn;
        @XmlElement(namespace = "")
        protected String tsn;
        @XmlElement(namespace = "")
        protected String manufacturer;
        @XmlElement(namespace = "")
        protected String manufacturerType;
        @XmlElement(namespace = "")
        protected String ventureCode;
        @XmlElement(namespace = "")
        protected String comprehensiveInsCompanyNr;
        @XmlElement(namespace = "")
        protected String comprehensiveCompanyName1;
        @XmlElement(namespace = "")
        protected String comprehensiveCompanyName2;
        @XmlElement(namespace = "")
        protected String comprehensiveCompanyName3;
        @XmlElement(namespace = "")
        protected String comprehensiveBeginningDate;
        @XmlElement(namespace = "")
        protected String comprehensiveEndDate;
        @XmlElement(namespace = "")
        protected String comprehensivePolicyNr;
        @XmlElement(namespace = "")
        protected String comprehensiveInternalNote;
        @XmlElement(namespace = "")
        protected String comprehensiveContractType;
        @XmlElement(namespace = "")
        protected String comprehensiveFullDeductible;
        @XmlElement(namespace = "")
        protected String comprehensivePartDeductible;
        @XmlElement(namespace = "")
        protected String assistanceInsCompanyNr;
        @XmlElement(namespace = "")
        protected String assistanceCompanyName1;
        @XmlElement(namespace = "")
        protected String assistanceCompanyName2;
        @XmlElement(namespace = "")
        protected String assistanceCompanyName3;
        @XmlElement(namespace = "")
        protected String assistanceBeginningDate;
        @XmlElement(namespace = "")
        protected String assistanceEndDate;
        @XmlElement(namespace = "")
        protected String assistancePolicyNr;
        @XmlElement(namespace = "")
        protected String assistanceInternalNote;
        @XmlElement(namespace = "")
        protected String assistanceContractType;
        @XmlElement(namespace = "")
        protected String registrationYear;

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
         * Ruft den Wert der hsn-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHsn() {
            return hsn;
        }

        /**
         * Legt den Wert der hsn-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHsn(String value) {
            this.hsn = value;
        }

        /**
         * Ruft den Wert der tsn-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTsn() {
            return tsn;
        }

        /**
         * Legt den Wert der tsn-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTsn(String value) {
            this.tsn = value;
        }

        /**
         * Ruft den Wert der manufacturer-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getManufacturer() {
            return manufacturer;
        }

        /**
         * Legt den Wert der manufacturer-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setManufacturer(String value) {
            this.manufacturer = value;
        }

        /**
         * Ruft den Wert der manufacturerType-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getManufacturerType() {
            return manufacturerType;
        }

        /**
         * Legt den Wert der manufacturerType-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setManufacturerType(String value) {
            this.manufacturerType = value;
        }

        /**
         * Ruft den Wert der ventureCode-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVentureCode() {
            return ventureCode;
        }

        /**
         * Legt den Wert der ventureCode-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVentureCode(String value) {
            this.ventureCode = value;
        }

        /**
         * Ruft den Wert der comprehensiveInsCompanyNr-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComprehensiveInsCompanyNr() {
            return comprehensiveInsCompanyNr;
        }

        /**
         * Legt den Wert der comprehensiveInsCompanyNr-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComprehensiveInsCompanyNr(String value) {
            this.comprehensiveInsCompanyNr = value;
        }

        /**
         * Ruft den Wert der comprehensiveCompanyName1-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComprehensiveCompanyName1() {
            return comprehensiveCompanyName1;
        }

        /**
         * Legt den Wert der comprehensiveCompanyName1-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComprehensiveCompanyName1(String value) {
            this.comprehensiveCompanyName1 = value;
        }

        /**
         * Ruft den Wert der comprehensiveCompanyName2-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComprehensiveCompanyName2() {
            return comprehensiveCompanyName2;
        }

        /**
         * Legt den Wert der comprehensiveCompanyName2-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComprehensiveCompanyName2(String value) {
            this.comprehensiveCompanyName2 = value;
        }

        /**
         * Ruft den Wert der comprehensiveCompanyName3-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComprehensiveCompanyName3() {
            return comprehensiveCompanyName3;
        }

        /**
         * Legt den Wert der comprehensiveCompanyName3-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComprehensiveCompanyName3(String value) {
            this.comprehensiveCompanyName3 = value;
        }

        /**
         * Ruft den Wert der comprehensiveBeginningDate-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComprehensiveBeginningDate() {
            return comprehensiveBeginningDate;
        }

        /**
         * Legt den Wert der comprehensiveBeginningDate-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComprehensiveBeginningDate(String value) {
            this.comprehensiveBeginningDate = value;
        }

        /**
         * Ruft den Wert der comprehensiveEndDate-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComprehensiveEndDate() {
            return comprehensiveEndDate;
        }

        /**
         * Legt den Wert der comprehensiveEndDate-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComprehensiveEndDate(String value) {
            this.comprehensiveEndDate = value;
        }

        /**
         * Ruft den Wert der comprehensivePolicyNr-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComprehensivePolicyNr() {
            return comprehensivePolicyNr;
        }

        /**
         * Legt den Wert der comprehensivePolicyNr-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComprehensivePolicyNr(String value) {
            this.comprehensivePolicyNr = value;
        }

        /**
         * Ruft den Wert der comprehensiveInternalNote-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComprehensiveInternalNote() {
            return comprehensiveInternalNote;
        }

        /**
         * Legt den Wert der comprehensiveInternalNote-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComprehensiveInternalNote(String value) {
            this.comprehensiveInternalNote = value;
        }

        /**
         * Ruft den Wert der comprehensiveContractType-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComprehensiveContractType() {
            return comprehensiveContractType;
        }

        /**
         * Legt den Wert der comprehensiveContractType-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComprehensiveContractType(String value) {
            this.comprehensiveContractType = value;
        }

        /**
         * Ruft den Wert der comprehensiveFullDeductible-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComprehensiveFullDeductible() {
            return comprehensiveFullDeductible;
        }

        /**
         * Legt den Wert der comprehensiveFullDeductible-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComprehensiveFullDeductible(String value) {
            this.comprehensiveFullDeductible = value;
        }

        /**
         * Ruft den Wert der comprehensivePartDeductible-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComprehensivePartDeductible() {
            return comprehensivePartDeductible;
        }

        /**
         * Legt den Wert der comprehensivePartDeductible-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComprehensivePartDeductible(String value) {
            this.comprehensivePartDeductible = value;
        }

        /**
         * Ruft den Wert der assistanceInsCompanyNr-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssistanceInsCompanyNr() {
            return assistanceInsCompanyNr;
        }

        /**
         * Legt den Wert der assistanceInsCompanyNr-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssistanceInsCompanyNr(String value) {
            this.assistanceInsCompanyNr = value;
        }

        /**
         * Ruft den Wert der assistanceCompanyName1-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssistanceCompanyName1() {
            return assistanceCompanyName1;
        }

        /**
         * Legt den Wert der assistanceCompanyName1-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssistanceCompanyName1(String value) {
            this.assistanceCompanyName1 = value;
        }

        /**
         * Ruft den Wert der assistanceCompanyName2-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssistanceCompanyName2() {
            return assistanceCompanyName2;
        }

        /**
         * Legt den Wert der assistanceCompanyName2-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssistanceCompanyName2(String value) {
            this.assistanceCompanyName2 = value;
        }

        /**
         * Ruft den Wert der assistanceCompanyName3-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssistanceCompanyName3() {
            return assistanceCompanyName3;
        }

        /**
         * Legt den Wert der assistanceCompanyName3-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssistanceCompanyName3(String value) {
            this.assistanceCompanyName3 = value;
        }

        /**
         * Ruft den Wert der assistanceBeginningDate-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssistanceBeginningDate() {
            return assistanceBeginningDate;
        }

        /**
         * Legt den Wert der assistanceBeginningDate-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssistanceBeginningDate(String value) {
            this.assistanceBeginningDate = value;
        }

        /**
         * Ruft den Wert der assistanceEndDate-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssistanceEndDate() {
            return assistanceEndDate;
        }

        /**
         * Legt den Wert der assistanceEndDate-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssistanceEndDate(String value) {
            this.assistanceEndDate = value;
        }

        /**
         * Ruft den Wert der assistancePolicyNr-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssistancePolicyNr() {
            return assistancePolicyNr;
        }

        /**
         * Legt den Wert der assistancePolicyNr-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssistancePolicyNr(String value) {
            this.assistancePolicyNr = value;
        }

        /**
         * Ruft den Wert der assistanceInternalNote-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssistanceInternalNote() {
            return assistanceInternalNote;
        }

        /**
         * Legt den Wert der assistanceInternalNote-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssistanceInternalNote(String value) {
            this.assistanceInternalNote = value;
        }

        /**
         * Ruft den Wert der assistanceContractType-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssistanceContractType() {
            return assistanceContractType;
        }

        /**
         * Legt den Wert der assistanceContractType-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssistanceContractType(String value) {
            this.assistanceContractType = value;
        }

        /**
         * Ruft den Wert der registrationYear-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegistrationYear() {
            return registrationYear;
        }

        /**
         * Legt den Wert der registrationYear-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegistrationYear(String value) {
            this.registrationYear = value;
        }

    }

}
