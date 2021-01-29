
package de.dat.glassrep.services.dmsgetcontracts;

import java.math.BigDecimal;
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
 *         &lt;element name="PartNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="LastUPE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LastUPEDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "SparePartHistoryPosition")
public class SparePartHistoryPosition {

    @XmlElement(name = "PartNumber")
    protected FieldString partNumber;
    @XmlElement(name = "LastUPE")
    protected BigDecimal lastUPE;
    @XmlElement(name = "LastUPEDate")
    protected FieldDate lastUPEDate;

    /**
     * Ruft den Wert der partNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPartNumber() {
        return partNumber;
    }

    /**
     * Legt den Wert der partNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPartNumber(FieldString value) {
        this.partNumber = value;
    }

    /**
     * Ruft den Wert der lastUPE-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastUPE() {
        return lastUPE;
    }

    /**
     * Legt den Wert der lastUPE-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastUPE(BigDecimal value) {
        this.lastUPE = value;
    }

    /**
     * Ruft den Wert der lastUPEDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getLastUPEDate() {
        return lastUPEDate;
    }

    /**
     * Legt den Wert der lastUPEDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setLastUPEDate(FieldDate value) {
        this.lastUPEDate = value;
    }

}
