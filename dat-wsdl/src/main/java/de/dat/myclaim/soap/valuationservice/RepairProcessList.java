
package de.dat.myclaim.soap.valuationservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für repairProcessList complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="repairProcessList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dat.de/vxs}RepairProcess" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "repairProcessList", propOrder = {
    "repairProcess"
})
public class RepairProcessList {

    @XmlElement(name = "RepairProcess")
    protected List<RepairProcess> repairProcess;

    /**
     * Gets the value of the repairProcess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repairProcess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepairProcess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepairProcess }
     * 
     * 
     */
    public List<RepairProcess> getRepairProcess() {
        if (repairProcess == null) {
            repairProcess = new ArrayList<RepairProcess>();
        }
        return this.repairProcess;
    }

}
