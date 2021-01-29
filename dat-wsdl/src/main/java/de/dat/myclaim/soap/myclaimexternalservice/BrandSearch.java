
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für brandSearch complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="brandSearch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brandsSearch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="certified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "brandSearch", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "brandsSearch",
    "certified"
})
public class BrandSearch {

    @XmlElement(namespace = "", required = true)
    protected String brandsSearch;
    @XmlElement(namespace = "")
    protected boolean certified;

    /**
     * Ruft den Wert der brandsSearch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandsSearch() {
        return brandsSearch;
    }

    /**
     * Legt den Wert der brandsSearch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandsSearch(String value) {
        this.brandsSearch = value;
    }

    /**
     * Ruft den Wert der certified-Eigenschaft ab.
     * 
     */
    public boolean isCertified() {
        return certified;
    }

    /**
     * Legt den Wert der certified-Eigenschaft fest.
     * 
     */
    public void setCertified(boolean value) {
        this.certified = value;
    }

}
