
package de.dat.vehiclerepaironline.services.vehicleselectionservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für spHistPositionsSeq complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="spHistPositionsSeq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dat.de/vxs}SparePartHistoryPosition" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "spHistPositionsSeq", propOrder = {
    "sparePartHistoryPosition"
})
public class SpHistPositionsSeq {

    @XmlElement(name = "SparePartHistoryPosition", required = true)
    protected List<SparePartHistoryPosition> sparePartHistoryPosition;

    /**
     * Gets the value of the sparePartHistoryPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sparePartHistoryPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSparePartHistoryPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SparePartHistoryPosition }
     * 
     * 
     */
    public List<SparePartHistoryPosition> getSparePartHistoryPosition() {
        if (sparePartHistoryPosition == null) {
            sparePartHistoryPosition = new ArrayList<SparePartHistoryPosition>();
        }
        return this.sparePartHistoryPosition;
    }

}
