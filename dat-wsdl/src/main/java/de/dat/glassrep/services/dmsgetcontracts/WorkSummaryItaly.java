
package de.dat.glassrep.services.dmsgetcontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dat.de/vxs}WorkSummaryItemItaly" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "workSummaryItemItaly"
})
@XmlRootElement(name = "WorkSummaryItaly")
public class WorkSummaryItaly {

    @XmlElement(name = "WorkSummaryItemItaly")
    protected List<WorkSummaryItemItaly> workSummaryItemItaly;

    /**
     * Gets the value of the workSummaryItemItaly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workSummaryItemItaly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkSummaryItemItaly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkSummaryItemItaly }
     * 
     * 
     */
    public List<WorkSummaryItemItaly> getWorkSummaryItemItaly() {
        if (workSummaryItemItaly == null) {
            workSummaryItemItaly = new ArrayList<WorkSummaryItemItaly>();
        }
        return this.workSummaryItemItaly;
    }

}
