
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für searchForPartners complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="searchForPartners">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="network" type="{http://www.dat.eu/myClaim/soap/MyClaimExternalService}networkType" minOccurs="0"/>
 *         &lt;element name="rolePartner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandsSearchCriteria" type="{http://www.dat.eu/myClaim/soap/MyClaimExternalService}brandSearch" minOccurs="0"/>
 *         &lt;element name="textSearchCriteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.dat.eu/myClaim/soap/MyClaimExternalService}location" minOccurs="0"/>
 *         &lt;element name="distanceCalculationMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchForPartners", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "network",
    "rolePartner",
    "brandsSearchCriteria",
    "textSearchCriteria",
    "location",
    "distanceCalculationMode"
})
public class SearchForPartners {

    @XmlElement(namespace = "")
    @XmlSchemaType(name = "string")
    protected NetworkType network;
    @XmlElement(namespace = "")
    protected String rolePartner;
    @XmlElement(namespace = "")
    protected BrandSearch brandsSearchCriteria;
    @XmlElement(namespace = "")
    protected String textSearchCriteria;
    @XmlElement(namespace = "")
    protected Location location;
    @XmlElement(namespace = "")
    protected String distanceCalculationMode;

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
     * Ruft den Wert der rolePartner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRolePartner() {
        return rolePartner;
    }

    /**
     * Legt den Wert der rolePartner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRolePartner(String value) {
        this.rolePartner = value;
    }

    /**
     * Ruft den Wert der brandsSearchCriteria-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BrandSearch }
     *     
     */
    public BrandSearch getBrandsSearchCriteria() {
        return brandsSearchCriteria;
    }

    /**
     * Legt den Wert der brandsSearchCriteria-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandSearch }
     *     
     */
    public void setBrandsSearchCriteria(BrandSearch value) {
        this.brandsSearchCriteria = value;
    }

    /**
     * Ruft den Wert der textSearchCriteria-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextSearchCriteria() {
        return textSearchCriteria;
    }

    /**
     * Legt den Wert der textSearchCriteria-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextSearchCriteria(String value) {
        this.textSearchCriteria = value;
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Ruft den Wert der distanceCalculationMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanceCalculationMode() {
        return distanceCalculationMode;
    }

    /**
     * Legt den Wert der distanceCalculationMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceCalculationMode(String value) {
        this.distanceCalculationMode = value;
    }

}
