
package de.dat.vehiclerepaironline.services.conversionfunctionsservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für constructionTime2DateSelectionRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="constructionTime2DateSelectionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="constructionTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "constructionTime2DateSelectionRequest", namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", propOrder = {
    "constructionTime",
    "sessionID"
})
public class ConstructionTime2DateSelectionRequest {

    @XmlElement(namespace = "")
    protected int constructionTime;
    @XmlElement(namespace = "", required = true)
    protected String sessionID;

    /**
     * Ruft den Wert der constructionTime-Eigenschaft ab.
     * 
     */
    public int getConstructionTime() {
        return constructionTime;
    }

    /**
     * Legt den Wert der constructionTime-Eigenschaft fest.
     * 
     */
    public void setConstructionTime(int value) {
        this.constructionTime = value;
    }

    /**
     * Ruft den Wert der sessionID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Legt den Wert der sessionID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

}
