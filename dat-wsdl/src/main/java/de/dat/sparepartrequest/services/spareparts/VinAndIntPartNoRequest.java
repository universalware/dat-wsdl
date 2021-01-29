
package de.dat.sparepartrequest.services.spareparts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für vinAndIntPartNoRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="vinAndIntPartNoRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/SpareParts}abstractCoverageRequest">
 *       &lt;sequence>
 *         &lt;element name="intPartNo" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vinAndIntPartNoRequest", namespace = "http://sphinx.dat.de/services/SpareParts", propOrder = {
    "intPartNo",
    "vin"
})
public class VinAndIntPartNoRequest
    extends AbstractCoverageRequest
{

    @XmlElement(namespace = "", nillable = true)
    protected List<Integer> intPartNo;
    @XmlElement(namespace = "")
    protected String vin;

    /**
     * Gets the value of the intPartNo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intPartNo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntPartNo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getIntPartNo() {
        if (intPartNo == null) {
            intPartNo = new ArrayList<Integer>();
        }
        return this.intPartNo;
    }

    /**
     * Ruft den Wert der vin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVin() {
        return vin;
    }

    /**
     * Legt den Wert der vin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVin(String value) {
        this.vin = value;
    }

}
