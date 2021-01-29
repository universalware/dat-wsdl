
package de.dat.financeline.services.evaluation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für referenceMileageForVehicle complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="referenceMileageForVehicle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actualCdYearMonth" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="constructionTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="container" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datECode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "referenceMileageForVehicle", namespace = "http://sphinx.dat.de/services/Evaluation", propOrder = {
    "actualCdYearMonth",
    "constructionTime",
    "container",
    "datECode"
})
public class ReferenceMileageForVehicle {

    @XmlElement(namespace = "")
    protected Long actualCdYearMonth;
    @XmlElement(namespace = "")
    protected Integer constructionTime;
    @XmlElement(namespace = "")
    protected String container;
    @XmlElement(namespace = "")
    protected String datECode;

    /**
     * Ruft den Wert der actualCdYearMonth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActualCdYearMonth() {
        return actualCdYearMonth;
    }

    /**
     * Legt den Wert der actualCdYearMonth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActualCdYearMonth(Long value) {
        this.actualCdYearMonth = value;
    }

    /**
     * Ruft den Wert der constructionTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConstructionTime() {
        return constructionTime;
    }

    /**
     * Legt den Wert der constructionTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConstructionTime(Integer value) {
        this.constructionTime = value;
    }

    /**
     * Ruft den Wert der container-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainer() {
        return container;
    }

    /**
     * Legt den Wert der container-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainer(String value) {
        this.container = value;
    }

    /**
     * Ruft den Wert der datECode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatECode() {
        return datECode;
    }

    /**
     * Legt den Wert der datECode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatECode(String value) {
        this.datECode = value;
    }

}
