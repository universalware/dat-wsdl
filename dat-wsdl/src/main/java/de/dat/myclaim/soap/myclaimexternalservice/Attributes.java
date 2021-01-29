
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für attributes complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="attributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isWithEquipment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isNetto" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isWithNewPrices" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attributes", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "isWithEquipment",
    "isNetto",
    "isWithNewPrices"
})
public class Attributes {

    @XmlElement(namespace = "")
    protected boolean isWithEquipment;
    @XmlElement(namespace = "")
    protected boolean isNetto;
    @XmlElement(namespace = "")
    protected boolean isWithNewPrices;

    /**
     * Ruft den Wert der isWithEquipment-Eigenschaft ab.
     * 
     */
    public boolean isIsWithEquipment() {
        return isWithEquipment;
    }

    /**
     * Legt den Wert der isWithEquipment-Eigenschaft fest.
     * 
     */
    public void setIsWithEquipment(boolean value) {
        this.isWithEquipment = value;
    }

    /**
     * Ruft den Wert der isNetto-Eigenschaft ab.
     * 
     */
    public boolean isIsNetto() {
        return isNetto;
    }

    /**
     * Legt den Wert der isNetto-Eigenschaft fest.
     * 
     */
    public void setIsNetto(boolean value) {
        this.isNetto = value;
    }

    /**
     * Ruft den Wert der isWithNewPrices-Eigenschaft ab.
     * 
     */
    public boolean isIsWithNewPrices() {
        return isWithNewPrices;
    }

    /**
     * Legt den Wert der isWithNewPrices-Eigenschaft fest.
     * 
     */
    public void setIsWithNewPrices(boolean value) {
        this.isWithNewPrices = value;
    }

}
