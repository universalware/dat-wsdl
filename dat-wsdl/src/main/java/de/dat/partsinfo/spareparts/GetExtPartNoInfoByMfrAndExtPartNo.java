
package de.dat.partsinfo.spareparts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getExtPartNoInfoByMfrAndExtPartNo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getExtPartNoInfoByMfrAndExtPartNo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://sphinx.dat.de/services/SpareParts}mfrAndExtPartNoRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getExtPartNoInfoByMfrAndExtPartNo", namespace = "http://sphinx.dat.de/services/SpareParts", propOrder = {
    "request"
})
public class GetExtPartNoInfoByMfrAndExtPartNo {

    @XmlElement(namespace = "")
    protected MfrAndExtPartNoRequest request;

    /**
     * Ruft den Wert der request-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MfrAndExtPartNoRequest }
     *     
     */
    public MfrAndExtPartNoRequest getRequest() {
        return request;
    }

    /**
     * Legt den Wert der request-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MfrAndExtPartNoRequest }
     *     
     */
    public void setRequest(MfrAndExtPartNoRequest value) {
        this.request = value;
    }

}
