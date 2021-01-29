
package de.dat.financeline.services.vehicleselectionservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für constructionTimes complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="constructionTimes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="constructionTimeClassWs" type="{http://sphinx.dat.de/services/VehicleSelectionService}constructionTimeClassWs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="hint" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "constructionTimes", namespace = "http://sphinx.dat.de/services/VehicleSelectionService", propOrder = {
    "constructionTimeClassWs"
})
public class ConstructionTimes {

    @XmlElement(namespace = "", nillable = true)
    protected List<ConstructionTimeClassWs> constructionTimeClassWs;
    @XmlAttribute(name = "hint")
    protected String hint;

    /**
     * Gets the value of the constructionTimeClassWs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constructionTimeClassWs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstructionTimeClassWs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConstructionTimeClassWs }
     * 
     * 
     */
    public List<ConstructionTimeClassWs> getConstructionTimeClassWs() {
        if (constructionTimeClassWs == null) {
            constructionTimeClassWs = new ArrayList<ConstructionTimeClassWs>();
        }
        return this.constructionTimeClassWs;
    }

    /**
     * Ruft den Wert der hint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHint() {
        return hint;
    }

    /**
     * Legt den Wert der hint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHint(String value) {
        this.hint = value;
    }

}
