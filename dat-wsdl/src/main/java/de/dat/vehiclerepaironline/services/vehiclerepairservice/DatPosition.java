
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

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
 *         &lt;element name="Country" type="{http://www.dat.de/vxs}fieldString3" minOccurs="0" form="qualified"/>
 *         &lt;element name="Price" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Designation" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PreDamage" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="UsedPart" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DiscountPercentage" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Nfa" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Worktime" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkLevel" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkType" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="SupplementDifficulty" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Location" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="RepairType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="CountLevelS" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="CountLevelM" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="CountLevelL" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="CountLevelGlass" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="FlatRateValue" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SpotCount" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerMaterial" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "DatPosition")
public class DatPosition {

    @XmlElement(name = "Country")
    protected FieldString3 country;
    @XmlElement(name = "Price")
    protected FieldDecimal price;
    @XmlElement(name = "Designation")
    protected FieldString designation;
    @XmlElement(name = "PreDamage")
    protected FieldInteger preDamage;
    @XmlElement(name = "UsedPart")
    protected FieldInteger usedPart;
    @XmlElement(name = "DiscountPercentage")
    protected FieldDecimal discountPercentage;
    @XmlElement(name = "Nfa")
    protected FieldDecimal nfa;
    @XmlElement(name = "Worktime")
    protected FieldDecimal worktime;
    @XmlElement(name = "WorkLevel")
    protected FieldInteger workLevel;
    @XmlElement(name = "WorkType")
    protected FieldInteger workType;
    @XmlElement(name = "SupplementDifficulty")
    protected FieldDecimal supplementDifficulty;
    @XmlElement(name = "Location")
    protected FieldInteger location;
    @XmlElement(name = "RepairType")
    protected FieldString repairType;
    @XmlElement(name = "CountLevelS")
    protected FieldInteger countLevelS;
    @XmlElement(name = "CountLevelM")
    protected FieldInteger countLevelM;
    @XmlElement(name = "CountLevelL")
    protected FieldInteger countLevelL;
    @XmlElement(name = "CountLevelGlass")
    protected FieldInteger countLevelGlass;
    @XmlElement(name = "FlatRateValue")
    protected FieldDecimal flatRateValue;
    @XmlElement(name = "SpotCount")
    protected FieldInteger spotCount;
    @XmlElement(name = "LacquerMaterial")
    protected FieldDecimal lacquerMaterial;

    /**
     * Ruft den Wert der country-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString3 }
     *     
     */
    public FieldString3 getCountry() {
        return country;
    }

    /**
     * Legt den Wert der country-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString3 }
     *     
     */
    public void setCountry(FieldString3 value) {
        this.country = value;
    }

    /**
     * Ruft den Wert der price-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPrice() {
        return price;
    }

    /**
     * Legt den Wert der price-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPrice(FieldDecimal value) {
        this.price = value;
    }

    /**
     * Ruft den Wert der designation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDesignation() {
        return designation;
    }

    /**
     * Legt den Wert der designation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDesignation(FieldString value) {
        this.designation = value;
    }

    /**
     * Ruft den Wert der preDamage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getPreDamage() {
        return preDamage;
    }

    /**
     * Legt den Wert der preDamage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setPreDamage(FieldInteger value) {
        this.preDamage = value;
    }

    /**
     * Ruft den Wert der usedPart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getUsedPart() {
        return usedPart;
    }

    /**
     * Legt den Wert der usedPart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setUsedPart(FieldInteger value) {
        this.usedPart = value;
    }

    /**
     * Ruft den Wert der discountPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDiscountPercentage() {
        return discountPercentage;
    }

    /**
     * Legt den Wert der discountPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDiscountPercentage(FieldDecimal value) {
        this.discountPercentage = value;
    }

    /**
     * Ruft den Wert der nfa-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getNfa() {
        return nfa;
    }

    /**
     * Legt den Wert der nfa-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setNfa(FieldDecimal value) {
        this.nfa = value;
    }

    /**
     * Ruft den Wert der worktime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWorktime() {
        return worktime;
    }

    /**
     * Legt den Wert der worktime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWorktime(FieldDecimal value) {
        this.worktime = value;
    }

    /**
     * Ruft den Wert der workLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getWorkLevel() {
        return workLevel;
    }

    /**
     * Legt den Wert der workLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setWorkLevel(FieldInteger value) {
        this.workLevel = value;
    }

    /**
     * Ruft den Wert der workType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getWorkType() {
        return workType;
    }

    /**
     * Legt den Wert der workType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setWorkType(FieldInteger value) {
        this.workType = value;
    }

    /**
     * Ruft den Wert der supplementDifficulty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSupplementDifficulty() {
        return supplementDifficulty;
    }

    /**
     * Legt den Wert der supplementDifficulty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSupplementDifficulty(FieldDecimal value) {
        this.supplementDifficulty = value;
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLocation(FieldInteger value) {
        this.location = value;
    }

    /**
     * Ruft den Wert der repairType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getRepairType() {
        return repairType;
    }

    /**
     * Legt den Wert der repairType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setRepairType(FieldString value) {
        this.repairType = value;
    }

    /**
     * Ruft den Wert der countLevelS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getCountLevelS() {
        return countLevelS;
    }

    /**
     * Legt den Wert der countLevelS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setCountLevelS(FieldInteger value) {
        this.countLevelS = value;
    }

    /**
     * Ruft den Wert der countLevelM-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getCountLevelM() {
        return countLevelM;
    }

    /**
     * Legt den Wert der countLevelM-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setCountLevelM(FieldInteger value) {
        this.countLevelM = value;
    }

    /**
     * Ruft den Wert der countLevelL-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getCountLevelL() {
        return countLevelL;
    }

    /**
     * Legt den Wert der countLevelL-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setCountLevelL(FieldInteger value) {
        this.countLevelL = value;
    }

    /**
     * Ruft den Wert der countLevelGlass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getCountLevelGlass() {
        return countLevelGlass;
    }

    /**
     * Legt den Wert der countLevelGlass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setCountLevelGlass(FieldInteger value) {
        this.countLevelGlass = value;
    }

    /**
     * Ruft den Wert der flatRateValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getFlatRateValue() {
        return flatRateValue;
    }

    /**
     * Legt den Wert der flatRateValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setFlatRateValue(FieldDecimal value) {
        this.flatRateValue = value;
    }

    /**
     * Ruft den Wert der spotCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getSpotCount() {
        return spotCount;
    }

    /**
     * Legt den Wert der spotCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setSpotCount(FieldInteger value) {
        this.spotCount = value;
    }

    /**
     * Ruft den Wert der lacquerMaterial-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerMaterial() {
        return lacquerMaterial;
    }

    /**
     * Legt den Wert der lacquerMaterial-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerMaterial(FieldDecimal value) {
        this.lacquerMaterial = value;
    }

}
