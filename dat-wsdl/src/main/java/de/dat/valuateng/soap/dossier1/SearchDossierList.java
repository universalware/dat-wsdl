
package de.dat.valuateng.soap.dossier1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für searchDossierList complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="searchDossierList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchCriterionList" type="{http://www.dat.de/services/Dossier1}searchDossierListRequest" minOccurs="0"/>
 *         &lt;element name="Limit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Coverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchDossierList", namespace = "http://www.dat.de/services/Dossier1", propOrder = {
    "searchCriterionList",
    "limit",
    "coverage"
})
public class SearchDossierList {

    @XmlElement(name = "SearchCriterionList", namespace = "")
    protected SearchDossierListRequest searchCriterionList;
    @XmlElement(name = "Limit", namespace = "")
    protected Integer limit;
    @XmlElement(name = "Coverage", namespace = "")
    protected String coverage;

    /**
     * Ruft den Wert der searchCriterionList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SearchDossierListRequest }
     *     
     */
    public SearchDossierListRequest getSearchCriterionList() {
        return searchCriterionList;
    }

    /**
     * Legt den Wert der searchCriterionList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDossierListRequest }
     *     
     */
    public void setSearchCriterionList(SearchDossierListRequest value) {
        this.searchCriterionList = value;
    }

    /**
     * Ruft den Wert der limit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Legt den Wert der limit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLimit(Integer value) {
        this.limit = value;
    }

    /**
     * Ruft den Wert der coverage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverage() {
        return coverage;
    }

    /**
     * Legt den Wert der coverage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverage(String value) {
        this.coverage = value;
    }

}
