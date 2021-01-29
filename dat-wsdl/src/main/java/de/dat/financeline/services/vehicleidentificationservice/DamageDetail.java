
package de.dat.financeline.services.vehicleidentificationservice;

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
 *         &lt;element name="TotalLoss" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="TotalLossNet" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="FireDamage" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="RepairDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="qualified"/>
 *         &lt;element name="DamagedGlassType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DamageFrontMiddle" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="DamageFrontRight" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="DamageMiddleRight" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="DamageBehindRight" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="DamageBehindMiddle" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="DamageBehindLeft" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="DamageMiddleLeft" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="DamageFrontLeft" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="DamageAllRound" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="DamageTopAndBottom" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="DamageOnlyTop" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="DamageOnlyBottom" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="EstimatedRepairPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
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
    "totalLoss",
    "totalLossNet",
    "fireDamage",
    "repairDuration",
    "damagedGlassType",
    "damageFrontMiddle",
    "damageFrontRight",
    "damageMiddleRight",
    "damageBehindRight",
    "damageBehindMiddle",
    "damageBehindLeft",
    "damageMiddleLeft",
    "damageFrontLeft",
    "damageAllRound",
    "damageTopAndBottom",
    "damageOnlyTop",
    "damageOnlyBottom",
    "estimatedRepairPrice"
})
@XmlRootElement(name = "DamageDetail")
public class DamageDetail {

    @XmlElement(name = "TotalLoss")
    protected FieldBoolean totalLoss;
    @XmlElement(name = "TotalLossNet")
    protected FieldDecimal totalLossNet;
    @XmlElement(name = "FireDamage")
    protected FieldBoolean fireDamage;
    @XmlElement(name = "RepairDuration")
    protected Integer repairDuration;
    @XmlElement(name = "DamagedGlassType")
    protected FieldString damagedGlassType;
    @XmlElement(name = "DamageFrontMiddle")
    protected FieldBoolean damageFrontMiddle;
    @XmlElement(name = "DamageFrontRight")
    protected FieldBoolean damageFrontRight;
    @XmlElement(name = "DamageMiddleRight")
    protected FieldBoolean damageMiddleRight;
    @XmlElement(name = "DamageBehindRight")
    protected FieldBoolean damageBehindRight;
    @XmlElement(name = "DamageBehindMiddle")
    protected FieldBoolean damageBehindMiddle;
    @XmlElement(name = "DamageBehindLeft")
    protected FieldBoolean damageBehindLeft;
    @XmlElement(name = "DamageMiddleLeft")
    protected FieldBoolean damageMiddleLeft;
    @XmlElement(name = "DamageFrontLeft")
    protected FieldBoolean damageFrontLeft;
    @XmlElement(name = "DamageAllRound")
    protected FieldBoolean damageAllRound;
    @XmlElement(name = "DamageTopAndBottom")
    protected FieldBoolean damageTopAndBottom;
    @XmlElement(name = "DamageOnlyTop")
    protected FieldBoolean damageOnlyTop;
    @XmlElement(name = "DamageOnlyBottom")
    protected FieldBoolean damageOnlyBottom;
    @XmlElement(name = "EstimatedRepairPrice")
    protected FieldDecimal estimatedRepairPrice;

    /**
     * Ruft den Wert der totalLoss-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getTotalLoss() {
        return totalLoss;
    }

    /**
     * Legt den Wert der totalLoss-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setTotalLoss(FieldBoolean value) {
        this.totalLoss = value;
    }

    /**
     * Ruft den Wert der totalLossNet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTotalLossNet() {
        return totalLossNet;
    }

    /**
     * Legt den Wert der totalLossNet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTotalLossNet(FieldDecimal value) {
        this.totalLossNet = value;
    }

    /**
     * Ruft den Wert der fireDamage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getFireDamage() {
        return fireDamage;
    }

    /**
     * Legt den Wert der fireDamage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setFireDamage(FieldBoolean value) {
        this.fireDamage = value;
    }

    /**
     * Ruft den Wert der repairDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepairDuration() {
        return repairDuration;
    }

    /**
     * Legt den Wert der repairDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepairDuration(Integer value) {
        this.repairDuration = value;
    }

    /**
     * Ruft den Wert der damagedGlassType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDamagedGlassType() {
        return damagedGlassType;
    }

    /**
     * Legt den Wert der damagedGlassType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDamagedGlassType(FieldString value) {
        this.damagedGlassType = value;
    }

    /**
     * Ruft den Wert der damageFrontMiddle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getDamageFrontMiddle() {
        return damageFrontMiddle;
    }

    /**
     * Legt den Wert der damageFrontMiddle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setDamageFrontMiddle(FieldBoolean value) {
        this.damageFrontMiddle = value;
    }

    /**
     * Ruft den Wert der damageFrontRight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getDamageFrontRight() {
        return damageFrontRight;
    }

    /**
     * Legt den Wert der damageFrontRight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setDamageFrontRight(FieldBoolean value) {
        this.damageFrontRight = value;
    }

    /**
     * Ruft den Wert der damageMiddleRight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getDamageMiddleRight() {
        return damageMiddleRight;
    }

    /**
     * Legt den Wert der damageMiddleRight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setDamageMiddleRight(FieldBoolean value) {
        this.damageMiddleRight = value;
    }

    /**
     * Ruft den Wert der damageBehindRight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getDamageBehindRight() {
        return damageBehindRight;
    }

    /**
     * Legt den Wert der damageBehindRight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setDamageBehindRight(FieldBoolean value) {
        this.damageBehindRight = value;
    }

    /**
     * Ruft den Wert der damageBehindMiddle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getDamageBehindMiddle() {
        return damageBehindMiddle;
    }

    /**
     * Legt den Wert der damageBehindMiddle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setDamageBehindMiddle(FieldBoolean value) {
        this.damageBehindMiddle = value;
    }

    /**
     * Ruft den Wert der damageBehindLeft-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getDamageBehindLeft() {
        return damageBehindLeft;
    }

    /**
     * Legt den Wert der damageBehindLeft-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setDamageBehindLeft(FieldBoolean value) {
        this.damageBehindLeft = value;
    }

    /**
     * Ruft den Wert der damageMiddleLeft-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getDamageMiddleLeft() {
        return damageMiddleLeft;
    }

    /**
     * Legt den Wert der damageMiddleLeft-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setDamageMiddleLeft(FieldBoolean value) {
        this.damageMiddleLeft = value;
    }

    /**
     * Ruft den Wert der damageFrontLeft-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getDamageFrontLeft() {
        return damageFrontLeft;
    }

    /**
     * Legt den Wert der damageFrontLeft-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setDamageFrontLeft(FieldBoolean value) {
        this.damageFrontLeft = value;
    }

    /**
     * Ruft den Wert der damageAllRound-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getDamageAllRound() {
        return damageAllRound;
    }

    /**
     * Legt den Wert der damageAllRound-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setDamageAllRound(FieldBoolean value) {
        this.damageAllRound = value;
    }

    /**
     * Ruft den Wert der damageTopAndBottom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getDamageTopAndBottom() {
        return damageTopAndBottom;
    }

    /**
     * Legt den Wert der damageTopAndBottom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setDamageTopAndBottom(FieldBoolean value) {
        this.damageTopAndBottom = value;
    }

    /**
     * Ruft den Wert der damageOnlyTop-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getDamageOnlyTop() {
        return damageOnlyTop;
    }

    /**
     * Legt den Wert der damageOnlyTop-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setDamageOnlyTop(FieldBoolean value) {
        this.damageOnlyTop = value;
    }

    /**
     * Ruft den Wert der damageOnlyBottom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getDamageOnlyBottom() {
        return damageOnlyBottom;
    }

    /**
     * Legt den Wert der damageOnlyBottom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setDamageOnlyBottom(FieldBoolean value) {
        this.damageOnlyBottom = value;
    }

    /**
     * Ruft den Wert der estimatedRepairPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getEstimatedRepairPrice() {
        return estimatedRepairPrice;
    }

    /**
     * Legt den Wert der estimatedRepairPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setEstimatedRepairPrice(FieldDecimal value) {
        this.estimatedRepairPrice = value;
    }

}
