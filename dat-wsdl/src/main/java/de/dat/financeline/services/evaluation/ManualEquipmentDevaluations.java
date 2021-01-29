
package de.dat.financeline.services.evaluation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für manualEquipmentDevaluations complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="manualEquipmentDevaluations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="manualEquipmentDevaluation" type="{http://sphinx.dat.de/services/Evaluation}manualEquipmentDevaluation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "manualEquipmentDevaluations", namespace = "http://sphinx.dat.de/services/Evaluation", propOrder = {
    "manualEquipmentDevaluation"
})
public class ManualEquipmentDevaluations {

    @XmlElement(namespace = "")
    protected List<ManualEquipmentDevaluation> manualEquipmentDevaluation;

    /**
     * Gets the value of the manualEquipmentDevaluation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manualEquipmentDevaluation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManualEquipmentDevaluation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManualEquipmentDevaluation }
     * 
     * 
     */
    public List<ManualEquipmentDevaluation> getManualEquipmentDevaluation() {
        if (manualEquipmentDevaluation == null) {
            manualEquipmentDevaluation = new ArrayList<ManualEquipmentDevaluation>();
        }
        return this.manualEquipmentDevaluation;
    }

}
