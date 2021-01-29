
package de.dat.glassrep.services.conversionfunctionsservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getEquipmentGroupsResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getEquipmentGroupsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="equipmentGroup" type="{http://sphinx.dat.de/services/ConversionFunctionsService}stringStringPair" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEquipmentGroupsResponse", namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", propOrder = {
    "equipmentGroup"
})
public class GetEquipmentGroupsResponse {

    @XmlElement(namespace = "")
    protected List<StringStringPair> equipmentGroup;

    /**
     * Gets the value of the equipmentGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringStringPair }
     * 
     * 
     */
    public List<StringStringPair> getEquipmentGroup() {
        if (equipmentGroup == null) {
            equipmentGroup = new ArrayList<StringStringPair>();
        }
        return this.equipmentGroup;
    }

}
