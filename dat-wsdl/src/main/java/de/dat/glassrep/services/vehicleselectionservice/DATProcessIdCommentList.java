
package de.dat.glassrep.services.vehicleselectionservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dat.de/vxs}DATProcessIdComment" maxOccurs="unbounded"/>
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
    "datProcessIdComment"
})
@XmlRootElement(name = "DATProcessIdCommentList")
public class DATProcessIdCommentList {

    @XmlElement(name = "DATProcessIdComment", required = true)
    protected List<DATProcessIdComment> datProcessIdComment;

    /**
     * Gets the value of the datProcessIdComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datProcessIdComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDATProcessIdComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DATProcessIdComment }
     * 
     * 
     */
    public List<DATProcessIdComment> getDATProcessIdComment() {
        if (datProcessIdComment == null) {
            datProcessIdComment = new ArrayList<DATProcessIdComment>();
        }
        return this.datProcessIdComment;
    }

}
