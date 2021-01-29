
package de.dat.vehiclerepaironline.services.vehicleselectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{http://www.dat.de/vxs}BaseSummaryItaly" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}LacquerSummaryItaly" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}WorkSummaryItaly" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}TotalSummaryItaly" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "SummariesItaly")
public class SummariesItaly {

    @XmlElement(name = "BaseSummaryItaly")
    protected BaseSummaryItaly baseSummaryItaly;
    @XmlElement(name = "LacquerSummaryItaly")
    protected LacquerSummaryItaly lacquerSummaryItaly;
    @XmlElement(name = "WorkSummaryItaly")
    protected WorkSummaryItaly workSummaryItaly;
    @XmlElement(name = "TotalSummaryItaly")
    protected TotalSummaryItaly totalSummaryItaly;

    /**
     * Ruft den Wert der baseSummaryItaly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BaseSummaryItaly }
     *     
     */
    public BaseSummaryItaly getBaseSummaryItaly() {
        return baseSummaryItaly;
    }

    /**
     * Legt den Wert der baseSummaryItaly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSummaryItaly }
     *     
     */
    public void setBaseSummaryItaly(BaseSummaryItaly value) {
        this.baseSummaryItaly = value;
    }

    /**
     * Ruft den Wert der lacquerSummaryItaly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LacquerSummaryItaly }
     *     
     */
    public LacquerSummaryItaly getLacquerSummaryItaly() {
        return lacquerSummaryItaly;
    }

    /**
     * Legt den Wert der lacquerSummaryItaly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LacquerSummaryItaly }
     *     
     */
    public void setLacquerSummaryItaly(LacquerSummaryItaly value) {
        this.lacquerSummaryItaly = value;
    }

    /**
     * Ruft den Wert der workSummaryItaly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WorkSummaryItaly }
     *     
     */
    public WorkSummaryItaly getWorkSummaryItaly() {
        return workSummaryItaly;
    }

    /**
     * Legt den Wert der workSummaryItaly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkSummaryItaly }
     *     
     */
    public void setWorkSummaryItaly(WorkSummaryItaly value) {
        this.workSummaryItaly = value;
    }

    /**
     * Ruft den Wert der totalSummaryItaly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TotalSummaryItaly }
     *     
     */
    public TotalSummaryItaly getTotalSummaryItaly() {
        return totalSummaryItaly;
    }

    /**
     * Legt den Wert der totalSummaryItaly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalSummaryItaly }
     *     
     */
    public void setTotalSummaryItaly(TotalSummaryItaly value) {
        this.totalSummaryItaly = value;
    }

}
