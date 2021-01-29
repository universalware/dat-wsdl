
package de.dat.glassrep.services.dmscreatecontract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Sign" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConstructionTimeMin" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConstructionTime" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConstructionTimeEdge" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConstructionTimeProd" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}VINContainers" minOccurs="0"/>
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
@XmlRootElement(name = "VINECode")
public class VINECode {

    @XmlElement(name = "Sign")
    protected FieldInteger sign;
    @XmlElement(name = "ConstructionTimeMin")
    protected FieldInteger constructionTimeMin;
    @XmlElement(name = "ConstructionTime")
    protected FieldInteger constructionTime;
    @XmlElement(name = "ConstructionTimeEdge")
    protected FieldInteger constructionTimeEdge;
    @XmlElement(name = "ConstructionTimeProd")
    protected FieldInteger constructionTimeProd;
    @XmlElement(name = "VINContainers")
    protected VINContainers vinContainers;

    /**
     * Ruft den Wert der sign-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getSign() {
        return sign;
    }

    /**
     * Legt den Wert der sign-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setSign(FieldInteger value) {
        this.sign = value;
    }

    /**
     * Ruft den Wert der constructionTimeMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getConstructionTimeMin() {
        return constructionTimeMin;
    }

    /**
     * Legt den Wert der constructionTimeMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setConstructionTimeMin(FieldInteger value) {
        this.constructionTimeMin = value;
    }

    /**
     * Ruft den Wert der constructionTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getConstructionTime() {
        return constructionTime;
    }

    /**
     * Legt den Wert der constructionTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setConstructionTime(FieldInteger value) {
        this.constructionTime = value;
    }

    /**
     * Ruft den Wert der constructionTimeEdge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getConstructionTimeEdge() {
        return constructionTimeEdge;
    }

    /**
     * Legt den Wert der constructionTimeEdge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setConstructionTimeEdge(FieldInteger value) {
        this.constructionTimeEdge = value;
    }

    /**
     * Ruft den Wert der constructionTimeProd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getConstructionTimeProd() {
        return constructionTimeProd;
    }

    /**
     * Legt den Wert der constructionTimeProd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setConstructionTimeProd(FieldInteger value) {
        this.constructionTimeProd = value;
    }

    /**
     * Ruft den Wert der vinContainers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VINContainers }
     *     
     */
    public VINContainers getVINContainers() {
        return vinContainers;
    }

    /**
     * Legt den Wert der vinContainers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VINContainers }
     *     
     */
    public void setVINContainers(VINContainers value) {
        this.vinContainers = value;
    }

}
