
package de.dat.partsinfo.spareparts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für modelInfoMfrAndExtPartNoRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="modelInfoMfrAndExtPartNoRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/SpareParts}abstractCoverageRequest">
 *       &lt;sequence>
 *         &lt;element name="extPartNo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modelInfoMfrAndExtPartNoRequest", namespace = "http://sphinx.dat.de/services/SpareParts", propOrder = {
    "extPartNo",
    "manufacturer"
})
public class ModelInfoMfrAndExtPartNoRequest
    extends AbstractCoverageRequest
{

    @XmlElement(namespace = "", nillable = true)
    protected List<String> extPartNo;
    @XmlElement(namespace = "")
    protected int manufacturer;

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
     * Ruft den Wert der manufacturer-Eigenschaft ab.
     * 
     */
    public int getManufacturer() {
        return manufacturer;
    }

    /**
     * Legt den Wert der manufacturer-Eigenschaft fest.
     * 
     */
    public void setManufacturer(int value) {
        this.manufacturer = value;
    }

}
