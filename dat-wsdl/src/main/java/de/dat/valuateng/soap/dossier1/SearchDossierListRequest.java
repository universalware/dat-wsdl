
package de.dat.valuateng.soap.dossier1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r searchDossierListRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="searchDossierListRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.dat.de/services/Dossier1}abstractRequest">
 *       &lt;sequence>
 *         &lt;element name="SearchCriterion" type="{http://www.dat.de/services/Dossier1}searchCriterion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchDossierListRequest", namespace = "http://www.dat.de/services/Dossier1", propOrder = {
    "searchCriterion"
})
public class SearchDossierListRequest
    extends AbstractRequest
{

    @XmlElement(name = "SearchCriterion", namespace = "")
    protected List<SearchCriterion> searchCriterion;

    /**
     * Gets the value of the searchCriterion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchCriterion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchCriterion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchCriterion }
     * 
     * 
     */
    public List<SearchCriterion> getSearchCriterion() {
        if (searchCriterion == null) {
            searchCriterion = new ArrayList<SearchCriterion>();
        }
        return this.searchCriterion;
    }

}
