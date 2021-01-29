
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für listInvoiceRates complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="listInvoiceRates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isFiType" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="network" type="{http://www.dat.eu/myClaim/soap/MyClaimExternalService}networkType" minOccurs="0"/>
 *         &lt;element name="insuranceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnerCustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listInvoiceRates", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "isFiType",
    "isoCountryCode",
    "network",
    "insuranceName",
    "brandName",
    "partnerCustomerNumber"
})
public class ListInvoiceRates {

    @XmlElement(namespace = "")
    protected boolean isFiType;
    @XmlElement(namespace = "", required = true)
    protected String isoCountryCode;
    @XmlElement(namespace = "")
    @XmlSchemaType(name = "string")
    protected NetworkType network;
    @XmlElement(namespace = "")
    protected String insuranceName;
    @XmlElement(namespace = "")
    protected String brandName;
    @XmlElement(namespace = "")
    protected String partnerCustomerNumber;

    /**
     * Ruft den Wert der isFiType-Eigenschaft ab.
     * 
     */
    public boolean isIsFiType() {
        return isFiType;
    }

    /**
     * Legt den Wert der isFiType-Eigenschaft fest.
     * 
     */
    public void setIsFiType(boolean value) {
        this.isFiType = value;
    }

    /**
     * Ruft den Wert der isoCountryCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoCountryCode() {
        return isoCountryCode;
    }

    /**
     * Legt den Wert der isoCountryCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoCountryCode(String value) {
        this.isoCountryCode = value;
    }

    /**
     * Ruft den Wert der network-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NetworkType }
     *     
     */
    public NetworkType getNetwork() {
        return network;
    }

    /**
     * Legt den Wert der network-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkType }
     *     
     */
    public void setNetwork(NetworkType value) {
        this.network = value;
    }

    /**
     * Ruft den Wert der insuranceName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceName() {
        return insuranceName;
    }

    /**
     * Legt den Wert der insuranceName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceName(String value) {
        this.insuranceName = value;
    }

    /**
     * Ruft den Wert der brandName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * Legt den Wert der brandName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandName(String value) {
        this.brandName = value;
    }

    /**
     * Ruft den Wert der partnerCustomerNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerCustomerNumber() {
        return partnerCustomerNumber;
    }

    /**
     * Legt den Wert der partnerCustomerNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerCustomerNumber(String value) {
        this.partnerCustomerNumber = value;
    }

}
