
package de.dat.financeline.services.conversionfunctionsservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für date2ConstructionTimeResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="date2ConstructionTimeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="constructionTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "date2ConstructionTimeResponse", namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", propOrder = {
    "constructionTime"
})
public class Date2ConstructionTimeResponse {

    @XmlElement(namespace = "")
    protected int constructionTime;

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

}
