
package de.dat.sparepartrequest.services.spareparts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für mfrAndExtPartNoRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="mfrAndExtPartNoRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/SpareParts}abstractCoverageRequest">
 *       &lt;sequence>
 *         &lt;element name="extPartNo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mfr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mfrAndExtPartNoRequest", namespace = "http://sphinx.dat.de/services/SpareParts", propOrder = {
    "extPartNo",
    "mfr"
})
public class MfrAndExtPartNoRequest
    extends AbstractCoverageRequest
{

    @XmlElement(namespace = "", nillable = true)
    protected List<String> extPartNo;
    @XmlElement(namespace = "")
    protected int mfr;

    /**
     * Gets the value of the extPartNo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extPartNo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtPartNo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExtPartNo() {
        if (extPartNo == null) {
            extPartNo = new ArrayList<String>();
        }
        return this.extPartNo;
    }

    /**
     * Ruft den Wert der mfr-Eigenschaft ab.
     * 
     */
    public int getMfr() {
        return mfr;
    }

    /**
     * Legt den Wert der mfr-Eigenschaft fest.
     * 
     */
    public void setMfr(int value) {
        this.mfr = value;
    }

}
