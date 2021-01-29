
package de.dat.partsinfo.spareparts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getExtPartNoInfoByVinAndIntPartNoResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getExtPartNoInfoByVinAndIntPartNoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://sphinx.dat.de/services/SpareParts}sparePartResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getExtPartNoInfoByVinAndIntPartNoResponse", namespace = "http://sphinx.dat.de/services/SpareParts", propOrder = {
    "result"
})
public class GetExtPartNoInfoByVinAndIntPartNoResponse {

    @XmlElement(namespace = "")
    protected SparePartResult result;

    /**
     * Ruft den Wert der result-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SparePartResult }
     *     
     */
    public SparePartResult getResult() {
        return result;
    }

    /**
     * Legt den Wert der result-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SparePartResult }
     *     
     */
    public void setResult(SparePartResult value) {
        this.result = value;
    }

}
