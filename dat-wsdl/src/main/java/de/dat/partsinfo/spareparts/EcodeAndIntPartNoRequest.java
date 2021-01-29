
package de.dat.partsinfo.spareparts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ecodeAndIntPartNoRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ecodeAndIntPartNoRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/SpareParts}abstractCoverageRequest">
 *       &lt;sequence>
 *         &lt;element name="datECode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intPartNo" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ecodeAndIntPartNoRequest", namespace = "http://sphinx.dat.de/services/SpareParts", propOrder = {
    "datECode",
    "intPartNo"
})
@XmlSeeAlso({
    FullVehicleAndIntPartNoRequest.class
})
public class EcodeAndIntPartNoRequest
    extends AbstractCoverageRequest
{

    @XmlElement(namespace = "")
    protected String datECode;
    @XmlElement(namespace = "", nillable = true)
    protected List<Integer> intPartNo;

    /**
     * Ruft den Wert der datECode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatECode() {
        return datECode;
    }

    /**
     * Legt den Wert der datECode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatECode(String value) {
        this.datECode = value;
    }

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

}
