
package de.dat.datecodeselection.services.vehicleselectionservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für constructionTimePeriod complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="constructionTimePeriod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="constructionTimes" type="{http://sphinx.dat.de/services/VehicleSelectionService}constructionTimes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="constructionTimeMax" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="constructionTimeMin" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "constructionTimePeriod", namespace = "http://sphinx.dat.de/services/VehicleSelectionService", propOrder = {
    "constructionTimes"
})
public class ConstructionTimePeriod {

    @XmlElement(namespace = "", nillable = true)
    protected List<ConstructionTimes> constructionTimes;
    @XmlAttribute(name = "constructionTimeMax", required = true)
    protected int constructionTimeMax;
    @XmlAttribute(name = "constructionTimeMin", required = true)
    protected int constructionTimeMin;

    /**
     * Gets the value of the constructionTimes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constructionTimes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstructionTimes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConstructionTimes }
     * 
     * 
     */
    public List<ConstructionTimes> getConstructionTimes() {
        if (constructionTimes == null) {
            constructionTimes = new ArrayList<ConstructionTimes>();
        }
        return this.constructionTimes;
    }

    /**
     * Ruft den Wert der constructionTimeMax-Eigenschaft ab.
     * 
     */
    public int getConstructionTimeMax() {
        return constructionTimeMax;
    }

    /**
     * Legt den Wert der constructionTimeMax-Eigenschaft fest.
     * 
     */
    public void setConstructionTimeMax(int value) {
        this.constructionTimeMax = value;
    }

    /**
     * Ruft den Wert der constructionTimeMin-Eigenschaft ab.
     * 
     */
    public int getConstructionTimeMin() {
        return constructionTimeMin;
    }

    /**
     * Legt den Wert der constructionTimeMin-Eigenschaft fest.
     * 
     */
    public void setConstructionTimeMin(int value) {
        this.constructionTimeMin = value;
    }

}
