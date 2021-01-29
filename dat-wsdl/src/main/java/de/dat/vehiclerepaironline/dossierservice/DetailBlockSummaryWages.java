
package de.dat.vehiclerepaironline.dossierservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DetailBlockSummaryWages complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DetailBlockSummaryWages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Wages" type="{http://www.dat.de/vxs}detailBlockSummary" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailBlockSummaryWages", propOrder = {
    "wages"
})
public class DetailBlockSummaryWages {

    @XmlElement(name = "Wages")
    protected List<DetailBlockSummary> wages;

    /**
     * Gets the value of the wages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailBlockSummary }
     * 
     * 
     */
    public List<DetailBlockSummary> getWages() {
        if (wages == null) {
            wages = new ArrayList<DetailBlockSummary>();
        }
        return this.wages;
    }

}
