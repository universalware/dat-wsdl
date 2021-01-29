
package de.dat.glassrep.services.vehicleidentificationservice;

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
 *         &lt;element ref="{http://www.dat.de/vxs}SurchargeSetting" maxOccurs="unbounded" minOccurs="0"/>
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
    "surchargeSetting"
})
@XmlRootElement(name = "SurchargeSettings")
public class SurchargeSettings {

    @XmlElement(name = "SurchargeSetting")
    protected List<SurchargeSetting> surchargeSetting;

    /**
     * Gets the value of the surchargeSetting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surchargeSetting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurchargeSetting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurchargeSetting }
     * 
     * 
     */
    public List<SurchargeSetting> getSurchargeSetting() {
        if (surchargeSetting == null) {
            surchargeSetting = new ArrayList<SurchargeSetting>();
        }
        return this.surchargeSetting;
    }

}
