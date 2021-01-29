
package de.dat.financeline.services.vehicleselectionservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LacquerConstantSequence complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LacquerConstantSequence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dat.de/vxs}LacquerConstant" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LacquerConstantSequence", propOrder = {
    "lacquerConstant"
})
public class LacquerConstantSequence {

    @XmlElement(name = "LacquerConstant", required = true)
    protected List<LacquerConstant> lacquerConstant;

    /**
     * Gets the value of the lacquerConstant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lacquerConstant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLacquerConstant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LacquerConstant }
     * 
     * 
     */
    public List<LacquerConstant> getLacquerConstant() {
        if (lacquerConstant == null) {
            lacquerConstant = new ArrayList<LacquerConstant>();
        }
        return this.lacquerConstant;
    }

}
