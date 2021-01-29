
package de.dat.vehiclerepaironline.services.vehicleselectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getSubModelsByTextSearchResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getSubModelsByTextSearchResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subModelsByTextSearch" type="{http://sphinx.dat.de/services/VehicleSelectionService}subModelByTextSearchSelectionResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSubModelsByTextSearchResponse", namespace = "http://sphinx.dat.de/services/VehicleSelectionService", propOrder = {
    "subModelsByTextSearch"
})
public class GetSubModelsByTextSearchResponse {

    @XmlElement(namespace = "")
    protected SubModelByTextSearchSelectionResponse subModelsByTextSearch;

    /**
     * Ruft den Wert der subModelsByTextSearch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SubModelByTextSearchSelectionResponse }
     *     
     */
    public SubModelByTextSearchSelectionResponse getSubModelsByTextSearch() {
        return subModelsByTextSearch;
    }

    /**
     * Legt den Wert der subModelsByTextSearch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SubModelByTextSearchSelectionResponse }
     *     
     */
    public void setSubModelsByTextSearch(SubModelByTextSearchSelectionResponse value) {
        this.subModelsByTextSearch = value;
    }

}
