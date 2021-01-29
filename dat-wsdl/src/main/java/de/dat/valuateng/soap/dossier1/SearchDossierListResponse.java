
package de.dat.valuateng.soap.dossier1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für searchDossierListResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="searchDossierListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchResultList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SearchResult" type="{http://www.dat.de/services/Dossier1}searchResult" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchDossierListResponse", namespace = "http://www.dat.de/services/Dossier1", propOrder = {
    "searchResultList"
})
public class SearchDossierListResponse {

    @XmlElement(name = "SearchResultList", namespace = "")
    protected SearchDossierListResponse.SearchResultList searchResultList;

    /**
     * Ruft den Wert der searchResultList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SearchDossierListResponse.SearchResultList }
     *     
     */
    public SearchDossierListResponse.SearchResultList getSearchResultList() {
        return searchResultList;
    }

    /**
     * Legt den Wert der searchResultList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDossierListResponse.SearchResultList }
     *     
     */
    public void setSearchResultList(SearchDossierListResponse.SearchResultList value) {
        this.searchResultList = value;
    }


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
     *         &lt;element name="SearchResult" type="{http://www.dat.de/services/Dossier1}searchResult" maxOccurs="unbounded" minOccurs="0"/>
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
        "searchResult"
    })
    public static class SearchResultList {

        @XmlElement(name = "SearchResult", namespace = "")
        protected List<SearchResult> searchResult;

        /**
         * Gets the value of the searchResult property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the searchResult property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSearchResult().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SearchResult }
         * 
         * 
         */
        public List<SearchResult> getSearchResult() {
            if (searchResult == null) {
                searchResult = new ArrayList<SearchResult>();
            }
            return this.searchResult;
        }

    }

}
