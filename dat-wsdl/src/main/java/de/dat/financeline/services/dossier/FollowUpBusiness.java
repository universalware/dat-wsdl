
package de.dat.financeline.services.dossier;

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
 *         &lt;element name="FollowUpBusinessType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="BusinessType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="VehicleNo" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="VehicleIdentNo" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="KbaKey" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Details" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "FollowUpBusiness")
public class FollowUpBusiness {

    @XmlElement(name = "FollowUpBusinessType")
    protected FieldString followUpBusinessType;
    @XmlElement(name = "BusinessType")
    protected FieldString businessType;
    @XmlElement(name = "VehicleNo")
    protected FieldString vehicleNo;
    @XmlElement(name = "VehicleIdentNo")
    protected FieldString vehicleIdentNo;
    @XmlElement(name = "KbaKey")
    protected FieldString kbaKey;
    @XmlElement(name = "Details")
    protected FieldString details;

    /**
     * Ruft den Wert der followUpBusinessType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getFollowUpBusinessType() {
        return followUpBusinessType;
    }

    /**
     * Legt den Wert der followUpBusinessType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setFollowUpBusinessType(FieldString value) {
        this.followUpBusinessType = value;
    }

    /**
     * Ruft den Wert der businessType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getBusinessType() {
        return businessType;
    }

    /**
     * Legt den Wert der businessType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setBusinessType(FieldString value) {
        this.businessType = value;
    }

    /**
     * Ruft den Wert der vehicleNo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getVehicleNo() {
        return vehicleNo;
    }

    /**
     * Legt den Wert der vehicleNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setVehicleNo(FieldString value) {
        this.vehicleNo = value;
    }

    /**
     * Ruft den Wert der vehicleIdentNo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getVehicleIdentNo() {
        return vehicleIdentNo;
    }

    /**
     * Legt den Wert der vehicleIdentNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setVehicleIdentNo(FieldString value) {
        this.vehicleIdentNo = value;
    }

    /**
     * Ruft den Wert der kbaKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getKbaKey() {
        return kbaKey;
    }

    /**
     * Legt den Wert der kbaKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setKbaKey(FieldString value) {
        this.kbaKey = value;
    }

    /**
     * Ruft den Wert der details-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDetails() {
        return details;
    }

    /**
     * Legt den Wert der details-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDetails(FieldString value) {
        this.details = value;
    }

}
