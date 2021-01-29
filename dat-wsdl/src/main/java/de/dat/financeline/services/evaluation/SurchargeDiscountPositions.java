
package de.dat.financeline.services.evaluation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r SurchargeDiscountPositions complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SurchargeDiscountPositions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SurchargeDiscountPosition" type="{http://www.dat.de/vxs}SurchargeDiscountPosition" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurchargeDiscountPositions", propOrder = {
    "surchargeDiscountPosition"
})
public class SurchargeDiscountPositions {

    @XmlElement(name = "SurchargeDiscountPosition")
    protected List<SurchargeDiscountPosition> surchargeDiscountPosition;

    /**
     * Gets the value of the surchargeDiscountPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surchargeDiscountPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurchargeDiscountPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurchargeDiscountPosition }
     * 
     * 
     */
    public List<SurchargeDiscountPosition> getSurchargeDiscountPosition() {
        if (surchargeDiscountPosition == null) {
            surchargeDiscountPosition = new ArrayList<SurchargeDiscountPosition>();
        }
        return this.surchargeDiscountPosition;
    }

}
