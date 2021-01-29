
package de.dat.sparepartrequest.services.spareparts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getExtPartNoInfoByVinAndIntPartNo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getExtPartNoInfoByVinAndIntPartNo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://sphinx.dat.de/services/SpareParts}vinAndIntPartNoRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getExtPartNoInfoByVinAndIntPartNo", namespace = "http://sphinx.dat.de/services/SpareParts", propOrder = {
    "request"
})
public class GetExtPartNoInfoByVinAndIntPartNo {

    @XmlElement(namespace = "")
    protected VinAndIntPartNoRequest request;

    /**
     * Ruft den Wert der request-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VinAndIntPartNoRequest }
     *     
     */
    public VinAndIntPartNoRequest getRequest() {
        return request;
    }

    /**
     * Legt den Wert der request-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VinAndIntPartNoRequest }
     *     
     */
    public void setRequest(VinAndIntPartNoRequest value) {
        this.request = value;
    }

}
