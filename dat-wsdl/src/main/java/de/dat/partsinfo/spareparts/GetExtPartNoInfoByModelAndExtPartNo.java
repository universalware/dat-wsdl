
package de.dat.partsinfo.spareparts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getExtPartNoInfoByModelAndExtPartNo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getExtPartNoInfoByModelAndExtPartNo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://sphinx.dat.de/services/SpareParts}modelAndExtPartNoRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getExtPartNoInfoByModelAndExtPartNo", namespace = "http://sphinx.dat.de/services/SpareParts", propOrder = {
    "request"
})
public class GetExtPartNoInfoByModelAndExtPartNo {

    @XmlElement(namespace = "")
    protected ModelAndExtPartNoRequest request;

    /**
     * Ruft den Wert der request-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ModelAndExtPartNoRequest }
     *     
     */
    public ModelAndExtPartNoRequest getRequest() {
        return request;
    }

    /**
     * Legt den Wert der request-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelAndExtPartNoRequest }
     *     
     */
    public void setRequest(ModelAndExtPartNoRequest value) {
        this.request = value;
    }

}
