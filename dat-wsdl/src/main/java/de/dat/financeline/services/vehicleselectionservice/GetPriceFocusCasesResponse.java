
package de.dat.financeline.services.vehicleselectionservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getPriceFocusCasesResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getPriceFocusCasesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="priceFocusCase" type="{http://sphinx.dat.de/services/VehicleSelectionService}stringStringPair" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPriceFocusCasesResponse", namespace = "http://sphinx.dat.de/services/VehicleSelectionService", propOrder = {
    "priceFocusCase"
})
public class GetPriceFocusCasesResponse {

    @XmlElement(namespace = "")
    protected List<StringStringPair> priceFocusCase;

    /**
     * Gets the value of the priceFocusCase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceFocusCase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceFocusCase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringStringPair }
     * 
     * 
     */
    public List<StringStringPair> getPriceFocusCase() {
        if (priceFocusCase == null) {
            priceFocusCase = new ArrayList<StringStringPair>();
        }
        return this.priceFocusCase;
    }

}
