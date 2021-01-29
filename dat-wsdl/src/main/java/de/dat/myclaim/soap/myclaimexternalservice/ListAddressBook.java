
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für listAddressBook complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="listAddressBook">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filter" type="{http://www.dat.eu/myClaim/soap/MyClaimExternalService}PossibleContactPersons"/>
 *         &lt;element name="pageLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageOffset" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listAddressBook", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "filter",
    "pageLimit",
    "pageOffset"
})
public class ListAddressBook {

    @XmlElement(namespace = "", required = true)
    protected PossibleContactPersons filter;
    @XmlElement(namespace = "")
    protected int pageLimit;
    @XmlElement(namespace = "")
    protected int pageOffset;

    /**
     * Ruft den Wert der filter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PossibleContactPersons }
     *     
     */
    public PossibleContactPersons getFilter() {
        return filter;
    }

    /**
     * Legt den Wert der filter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PossibleContactPersons }
     *     
     */
    public void setFilter(PossibleContactPersons value) {
        this.filter = value;
    }

    /**
     * Ruft den Wert der pageLimit-Eigenschaft ab.
     * 
     */
    public int getPageLimit() {
        return pageLimit;
    }

    /**
     * Legt den Wert der pageLimit-Eigenschaft fest.
     * 
     */
    public void setPageLimit(int value) {
        this.pageLimit = value;
    }

    /**
     * Ruft den Wert der pageOffset-Eigenschaft ab.
     * 
     */
    public int getPageOffset() {
        return pageOffset;
    }

    /**
     * Legt den Wert der pageOffset-Eigenschaft fest.
     * 
     */
    public void setPageOffset(int value) {
        this.pageOffset = value;
    }

}
