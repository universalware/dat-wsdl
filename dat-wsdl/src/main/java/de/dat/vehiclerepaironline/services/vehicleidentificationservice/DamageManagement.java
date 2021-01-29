
package de.dat.vehiclerepaironline.services.vehicleidentificationservice;

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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dat.de/vxs}DamageProcess" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}DamageDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "damageProcess",
    "damageDetail"
})
@XmlRootElement(name = "DamageManagement")
public class DamageManagement {

    @XmlElement(name = "DamageProcess")
    protected DamageProcess damageProcess;
    @XmlElement(name = "DamageDetail")
    protected DamageDetail damageDetail;

    /**
     * Ruft den Wert der damageProcess-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DamageProcess }
     *     
     */
    public DamageProcess getDamageProcess() {
        return damageProcess;
    }

    /**
     * Legt den Wert der damageProcess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DamageProcess }
     *     
     */
    public void setDamageProcess(DamageProcess value) {
        this.damageProcess = value;
    }

    /**
     * Ruft den Wert der damageDetail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DamageDetail }
     *     
     */
    public DamageDetail getDamageDetail() {
        return damageDetail;
    }

    /**
     * Legt den Wert der damageDetail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DamageDetail }
     *     
     */
    public void setDamageDetail(DamageDetail value) {
        this.damageDetail = value;
    }

}
