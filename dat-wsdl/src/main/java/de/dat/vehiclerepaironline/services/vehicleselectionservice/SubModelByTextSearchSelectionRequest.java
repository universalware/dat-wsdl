
package de.dat.vehiclerepaironline.services.vehicleselectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für subModelByTextSearchSelectionRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="subModelByTextSearchSelectionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/VehicleSelectionService}basicSelectionRequest">
 *       &lt;sequence>
 *         &lt;element name="searchText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subModelByTextSearchSelectionRequest", namespace = "http://sphinx.dat.de/services/VehicleSelectionService", propOrder = {
    "searchText"
})
public class SubModelByTextSearchSelectionRequest
    extends BasicSelectionRequest
{

    @XmlElement(namespace = "", required = true)
    protected String searchText;

    /**
     * Ruft den Wert der searchText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchText() {
        return searchText;
    }

    /**
     * Legt den Wert der searchText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchText(String value) {
        this.searchText = value;
    }

}
