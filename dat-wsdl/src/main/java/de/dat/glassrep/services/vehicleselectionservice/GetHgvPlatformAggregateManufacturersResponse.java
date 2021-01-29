
package de.dat.glassrep.services.vehicleselectionservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getHgvPlatformAggregateManufacturersResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getHgvPlatformAggregateManufacturersResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hgvPlatformAggregateManufacturer" type="{http://sphinx.dat.de/services/VehicleSelectionService}integerStringPair" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getHgvPlatformAggregateManufacturersResponse", namespace = "http://sphinx.dat.de/services/VehicleSelectionService", propOrder = {
    "hgvPlatformAggregateManufacturer"
})
public class GetHgvPlatformAggregateManufacturersResponse {

    @XmlElement(namespace = "")
    protected List<IntegerStringPair> hgvPlatformAggregateManufacturer;

    /**
     * Gets the value of the hgvPlatformAggregateManufacturer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hgvPlatformAggregateManufacturer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHgvPlatformAggregateManufacturer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntegerStringPair }
     * 
     * 
     */
    public List<IntegerStringPair> getHgvPlatformAggregateManufacturer() {
        if (hgvPlatformAggregateManufacturer == null) {
            hgvPlatformAggregateManufacturer = new ArrayList<IntegerStringPair>();
        }
        return this.hgvPlatformAggregateManufacturer;
    }

}
