
package de.dat.financeline.services.evaluation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getYearMonthsForVehicleTargetDateEvaluationHistoryResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getYearMonthsForVehicleTargetDateEvaluationHistoryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="yearMonth" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getYearMonthsForVehicleTargetDateEvaluationHistoryResponse", namespace = "http://sphinx.dat.de/services/Evaluation", propOrder = {
    "yearMonth"
})
public class GetYearMonthsForVehicleTargetDateEvaluationHistoryResponse {

    @XmlElement(namespace = "", type = Integer.class)
    protected List<Integer> yearMonth;

    /**
     * Gets the value of the yearMonth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the yearMonth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getYearMonth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getYearMonth() {
        if (yearMonth == null) {
            yearMonth = new ArrayList<Integer>();
        }
        return this.yearMonth;
    }

}
