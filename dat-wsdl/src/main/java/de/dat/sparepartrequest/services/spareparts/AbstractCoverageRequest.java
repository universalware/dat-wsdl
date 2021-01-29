
package de.dat.sparepartrequest.services.spareparts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für abstractCoverageRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="abstractCoverageRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/SpareParts}abstractSelectionRequest">
 *       &lt;sequence>
 *         &lt;element name="coverage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractCoverageRequest", namespace = "http://sphinx.dat.de/services/SpareParts", propOrder = {
    "coverage"
})
@XmlSeeAlso({
    VinAndIntPartNoRequest.class,
    EcodeAndIntPartNoRequest.class,
    MfrAndExtPartNoRequest.class,
    ModelAndExtPartNoRequest.class,
    ModelInfoMfrAndExtPartNoRequest.class
})
public class AbstractCoverageRequest
    extends AbstractSelectionRequest
{

    @XmlElement(namespace = "", required = true)
    protected String coverage;

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
