
package de.dat.vehiclerepaironline.services.vehicleselectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getConstructionPeriodsNResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getConstructionPeriodsNResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="constructionPeriodN" type="{http://sphinx.dat.de/services/VehicleSelectionService}constructionTimePeriod" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getConstructionPeriodsNResponse", namespace = "http://sphinx.dat.de/services/VehicleSelectionService", propOrder = {
    "constructionPeriodN"
})
public class GetConstructionPeriodsNResponse {

    @XmlElement(namespace = "")
    protected ConstructionTimePeriod constructionPeriodN;

    /**
     * Ruft den Wert der constructionPeriodN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConstructionTimePeriod }
     *     
     */
    public ConstructionTimePeriod getConstructionPeriodN() {
        return constructionPeriodN;
    }

    /**
     * Legt den Wert der constructionPeriodN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstructionTimePeriod }
     *     
     */
    public void setConstructionPeriodN(ConstructionTimePeriod value) {
        this.constructionPeriodN = value;
    }

}
