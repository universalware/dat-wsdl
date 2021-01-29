
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
 *         &lt;element name="AxleNo" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="TireId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="TireState" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="NrOfTires" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="TireType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="TireTypeTextId" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="TireOriginalPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TireSpeedIndex" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="TireSize" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="TireSafetySystem" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="TireManufacturer" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="TireManufacturerName" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PrintLoadCapacityIdx" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="TireOriginalTreadDepth" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="TireOriginalTreadDepthUser" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="TireOriginalTreadDepthN" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TireOriginalTreadDepthNUser" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TireLoadCapacityIndex" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="TireLoadCapacityIndex2" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="TreadDepthLeftOuterPerc" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TreadDepthLeftInnerPerc" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TreadDepthRightInnerPerc" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TreadDepthRightOuterPerc" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TreadDepthLeftOuterMm" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TreadDepthLeftInnerMm" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TreadDepthRightInnerMm" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TreadDepthRightOuterMm" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManualEntry" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="RetreadedLeftOuter" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="RetreadedLeftInner" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="RetreadedRightInner" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="RetreadedRightOuter" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="TireAveragePriceUser" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TireBrandPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TireBrandPriceUser" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TireManufacturerId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="TireManufacturerTextId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="TireBrandId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="TireBrandName" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="TireBrandTextId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="ProductCodeNumber" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "Axle")
public class Axle {

    @XmlElement(name = "AxleNo")
    protected FieldInteger axleNo;
    @XmlElement(name = "TireId")
    protected FieldInteger tireId;
    @XmlElement(name = "TireState")
    protected FieldString tireState;
    @XmlElement(name = "NrOfTires")
    protected FieldInteger nrOfTires;
    @XmlElement(name = "TireType")
    protected FieldString tireType;
    @XmlElement(name = "TireTypeTextId")
    protected FieldString tireTypeTextId;
    @XmlElement(name = "TireOriginalPrice")
    protected FieldDecimal tireOriginalPrice;
    @XmlElement(name = "TireSpeedIndex")
    protected FieldString tireSpeedIndex;
    @XmlElement(name = "TireSize")
    protected FieldString tireSize;
    @XmlElement(name = "TireSafetySystem")
    protected FieldString tireSafetySystem;
    @XmlElement(name = "TireManufacturer")
    protected FieldInteger tireManufacturer;
    @XmlElement(name = "TireManufacturerName")
    protected FieldString tireManufacturerName;
    @XmlElement(name = "PrintLoadCapacityIdx")
    protected FieldBoolean printLoadCapacityIdx;
    @XmlElement(name = "TireOriginalTreadDepth")
    protected FieldInteger tireOriginalTreadDepth;
    @XmlElement(name = "TireOriginalTreadDepthUser")
    protected FieldInteger tireOriginalTreadDepthUser;
    @XmlElement(name = "TireOriginalTreadDepthN")
    protected FieldDecimal tireOriginalTreadDepthN;
    @XmlElement(name = "TireOriginalTreadDepthNUser")
    protected FieldDecimal tireOriginalTreadDepthNUser;
    @XmlElement(name = "TireLoadCapacityIndex")
    protected FieldInteger tireLoadCapacityIndex;
    @XmlElement(name = "TireLoadCapacityIndex2")
    protected FieldInteger tireLoadCapacityIndex2;
    @XmlElement(name = "TreadDepthLeftOuterPerc")
    protected FieldDecimal treadDepthLeftOuterPerc;
    @XmlElement(name = "TreadDepthLeftInnerPerc")
    protected FieldDecimal treadDepthLeftInnerPerc;
    @XmlElement(name = "TreadDepthRightInnerPerc")
    protected FieldDecimal treadDepthRightInnerPerc;
    @XmlElement(name = "TreadDepthRightOuterPerc")
    protected FieldDecimal treadDepthRightOuterPerc;
    @XmlElement(name = "TreadDepthLeftOuterMm")
    protected FieldDecimal treadDepthLeftOuterMm;
    @XmlElement(name = "TreadDepthLeftInnerMm")
    protected FieldDecimal treadDepthLeftInnerMm;
    @XmlElement(name = "TreadDepthRightInnerMm")
    protected FieldDecimal treadDepthRightInnerMm;
    @XmlElement(name = "TreadDepthRightOuterMm")
    protected FieldDecimal treadDepthRightOuterMm;
    @XmlElement(name = "ManualEntry")
    protected FieldBoolean manualEntry;
    @XmlElement(name = "RetreadedLeftOuter")
    protected FieldBoolean retreadedLeftOuter;
    @XmlElement(name = "RetreadedLeftInner")
    protected FieldBoolean retreadedLeftInner;
    @XmlElement(name = "RetreadedRightInner")
    protected FieldBoolean retreadedRightInner;
    @XmlElement(name = "RetreadedRightOuter")
    protected FieldBoolean retreadedRightOuter;
    @XmlElement(name = "TireAveragePriceUser")
    protected FieldDecimal tireAveragePriceUser;
    @XmlElement(name = "TireBrandPrice")
    protected FieldDecimal tireBrandPrice;
    @XmlElement(name = "TireBrandPriceUser")
    protected FieldDecimal tireBrandPriceUser;
    @XmlElement(name = "TireManufacturerId")
    protected FieldInteger tireManufacturerId;
    @XmlElement(name = "TireManufacturerTextId")
    protected FieldInteger tireManufacturerTextId;
    @XmlElement(name = "TireBrandId")
    protected FieldInteger tireBrandId;
    @XmlElement(name = "TireBrandName")
    protected FieldString tireBrandName;
    @XmlElement(name = "TireBrandTextId")
    protected FieldInteger tireBrandTextId;
    @XmlElement(name = "ProductCodeNumber")
    protected FieldInteger productCodeNumber;

    /**
     * Ruft den Wert der axleNo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getAxleNo() {
        return axleNo;
    }

    /**
     * Legt den Wert der axleNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setAxleNo(FieldInteger value) {
        this.axleNo = value;
    }

    /**
     * Ruft den Wert der tireId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getTireId() {
        return tireId;
    }

    /**
     * Legt den Wert der tireId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setTireId(FieldInteger value) {
        this.tireId = value;
    }

    /**
     * Ruft den Wert der tireState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTireState() {
        return tireState;
    }

    /**
     * Legt den Wert der tireState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTireState(FieldString value) {
        this.tireState = value;
    }

    /**
     * Ruft den Wert der nrOfTires-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getNrOfTires() {
        return nrOfTires;
    }

    /**
     * Legt den Wert der nrOfTires-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setNrOfTires(FieldInteger value) {
        this.nrOfTires = value;
    }

    /**
     * Ruft den Wert der tireType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTireType() {
        return tireType;
    }

    /**
     * Legt den Wert der tireType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTireType(FieldString value) {
        this.tireType = value;
    }

    /**
     * Ruft den Wert der tireTypeTextId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTireTypeTextId() {
        return tireTypeTextId;
    }

    /**
     * Legt den Wert der tireTypeTextId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTireTypeTextId(FieldString value) {
        this.tireTypeTextId = value;
    }

    /**
     * Ruft den Wert der tireOriginalPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTireOriginalPrice() {
        return tireOriginalPrice;
    }

    /**
     * Legt den Wert der tireOriginalPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTireOriginalPrice(FieldDecimal value) {
        this.tireOriginalPrice = value;
    }

    /**
     * Ruft den Wert der tireSpeedIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTireSpeedIndex() {
        return tireSpeedIndex;
    }

    /**
     * Legt den Wert der tireSpeedIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTireSpeedIndex(FieldString value) {
        this.tireSpeedIndex = value;
    }

    /**
     * Ruft den Wert der tireSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTireSize() {
        return tireSize;
    }

    /**
     * Legt den Wert der tireSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTireSize(FieldString value) {
        this.tireSize = value;
    }

    /**
     * Ruft den Wert der tireSafetySystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTireSafetySystem() {
        return tireSafetySystem;
    }

    /**
     * Legt den Wert der tireSafetySystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTireSafetySystem(FieldString value) {
        this.tireSafetySystem = value;
    }

    /**
     * Ruft den Wert der tireManufacturer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getTireManufacturer() {
        return tireManufacturer;
    }

    /**
     * Legt den Wert der tireManufacturer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setTireManufacturer(FieldInteger value) {
        this.tireManufacturer = value;
    }

    /**
     * Ruft den Wert der tireManufacturerName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTireManufacturerName() {
        return tireManufacturerName;
    }

    /**
     * Legt den Wert der tireManufacturerName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTireManufacturerName(FieldString value) {
        this.tireManufacturerName = value;
    }

    /**
     * Ruft den Wert der printLoadCapacityIdx-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getPrintLoadCapacityIdx() {
        return printLoadCapacityIdx;
    }

    /**
     * Legt den Wert der printLoadCapacityIdx-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setPrintLoadCapacityIdx(FieldBoolean value) {
        this.printLoadCapacityIdx = value;
    }

    /**
     * Ruft den Wert der tireOriginalTreadDepth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getTireOriginalTreadDepth() {
        return tireOriginalTreadDepth;
    }

    /**
     * Legt den Wert der tireOriginalTreadDepth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setTireOriginalTreadDepth(FieldInteger value) {
        this.tireOriginalTreadDepth = value;
    }

    /**
     * Ruft den Wert der tireOriginalTreadDepthUser-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getTireOriginalTreadDepthUser() {
        return tireOriginalTreadDepthUser;
    }

    /**
     * Legt den Wert der tireOriginalTreadDepthUser-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setTireOriginalTreadDepthUser(FieldInteger value) {
        this.tireOriginalTreadDepthUser = value;
    }

    /**
     * Ruft den Wert der tireOriginalTreadDepthN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTireOriginalTreadDepthN() {
        return tireOriginalTreadDepthN;
    }

    /**
     * Legt den Wert der tireOriginalTreadDepthN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTireOriginalTreadDepthN(FieldDecimal value) {
        this.tireOriginalTreadDepthN = value;
    }

    /**
     * Ruft den Wert der tireOriginalTreadDepthNUser-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTireOriginalTreadDepthNUser() {
        return tireOriginalTreadDepthNUser;
    }

    /**
     * Legt den Wert der tireOriginalTreadDepthNUser-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTireOriginalTreadDepthNUser(FieldDecimal value) {
        this.tireOriginalTreadDepthNUser = value;
    }

    /**
     * Ruft den Wert der tireLoadCapacityIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getTireLoadCapacityIndex() {
        return tireLoadCapacityIndex;
    }

    /**
     * Legt den Wert der tireLoadCapacityIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setTireLoadCapacityIndex(FieldInteger value) {
        this.tireLoadCapacityIndex = value;
    }

    /**
     * Ruft den Wert der tireLoadCapacityIndex2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getTireLoadCapacityIndex2() {
        return tireLoadCapacityIndex2;
    }

    /**
     * Legt den Wert der tireLoadCapacityIndex2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setTireLoadCapacityIndex2(FieldInteger value) {
        this.tireLoadCapacityIndex2 = value;
    }

    /**
     * Ruft den Wert der treadDepthLeftOuterPerc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTreadDepthLeftOuterPerc() {
        return treadDepthLeftOuterPerc;
    }

    /**
     * Legt den Wert der treadDepthLeftOuterPerc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTreadDepthLeftOuterPerc(FieldDecimal value) {
        this.treadDepthLeftOuterPerc = value;
    }

    /**
     * Ruft den Wert der treadDepthLeftInnerPerc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTreadDepthLeftInnerPerc() {
        return treadDepthLeftInnerPerc;
    }

    /**
     * Legt den Wert der treadDepthLeftInnerPerc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTreadDepthLeftInnerPerc(FieldDecimal value) {
        this.treadDepthLeftInnerPerc = value;
    }

    /**
     * Ruft den Wert der treadDepthRightInnerPerc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTreadDepthRightInnerPerc() {
        return treadDepthRightInnerPerc;
    }

    /**
     * Legt den Wert der treadDepthRightInnerPerc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTreadDepthRightInnerPerc(FieldDecimal value) {
        this.treadDepthRightInnerPerc = value;
    }

    /**
     * Ruft den Wert der treadDepthRightOuterPerc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTreadDepthRightOuterPerc() {
        return treadDepthRightOuterPerc;
    }

    /**
     * Legt den Wert der treadDepthRightOuterPerc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTreadDepthRightOuterPerc(FieldDecimal value) {
        this.treadDepthRightOuterPerc = value;
    }

    /**
     * Ruft den Wert der treadDepthLeftOuterMm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTreadDepthLeftOuterMm() {
        return treadDepthLeftOuterMm;
    }

    /**
     * Legt den Wert der treadDepthLeftOuterMm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTreadDepthLeftOuterMm(FieldDecimal value) {
        this.treadDepthLeftOuterMm = value;
    }

    /**
     * Ruft den Wert der treadDepthLeftInnerMm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTreadDepthLeftInnerMm() {
        return treadDepthLeftInnerMm;
    }

    /**
     * Legt den Wert der treadDepthLeftInnerMm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTreadDepthLeftInnerMm(FieldDecimal value) {
        this.treadDepthLeftInnerMm = value;
    }

    /**
     * Ruft den Wert der treadDepthRightInnerMm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTreadDepthRightInnerMm() {
        return treadDepthRightInnerMm;
    }

    /**
     * Legt den Wert der treadDepthRightInnerMm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTreadDepthRightInnerMm(FieldDecimal value) {
        this.treadDepthRightInnerMm = value;
    }

    /**
     * Ruft den Wert der treadDepthRightOuterMm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTreadDepthRightOuterMm() {
        return treadDepthRightOuterMm;
    }

    /**
     * Legt den Wert der treadDepthRightOuterMm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTreadDepthRightOuterMm(FieldDecimal value) {
        this.treadDepthRightOuterMm = value;
    }

    /**
     * Ruft den Wert der manualEntry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getManualEntry() {
        return manualEntry;
    }

    /**
     * Legt den Wert der manualEntry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setManualEntry(FieldBoolean value) {
        this.manualEntry = value;
    }

    /**
     * Ruft den Wert der retreadedLeftOuter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getRetreadedLeftOuter() {
        return retreadedLeftOuter;
    }

    /**
     * Legt den Wert der retreadedLeftOuter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setRetreadedLeftOuter(FieldBoolean value) {
        this.retreadedLeftOuter = value;
    }

    /**
     * Ruft den Wert der retreadedLeftInner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getRetreadedLeftInner() {
        return retreadedLeftInner;
    }

    /**
     * Legt den Wert der retreadedLeftInner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setRetreadedLeftInner(FieldBoolean value) {
        this.retreadedLeftInner = value;
    }

    /**
     * Ruft den Wert der retreadedRightInner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getRetreadedRightInner() {
        return retreadedRightInner;
    }

    /**
     * Legt den Wert der retreadedRightInner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setRetreadedRightInner(FieldBoolean value) {
        this.retreadedRightInner = value;
    }

    /**
     * Ruft den Wert der retreadedRightOuter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getRetreadedRightOuter() {
        return retreadedRightOuter;
    }

    /**
     * Legt den Wert der retreadedRightOuter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setRetreadedRightOuter(FieldBoolean value) {
        this.retreadedRightOuter = value;
    }

    /**
     * Ruft den Wert der tireAveragePriceUser-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTireAveragePriceUser() {
        return tireAveragePriceUser;
    }

    /**
     * Legt den Wert der tireAveragePriceUser-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTireAveragePriceUser(FieldDecimal value) {
        this.tireAveragePriceUser = value;
    }

    /**
     * Ruft den Wert der tireBrandPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTireBrandPrice() {
        return tireBrandPrice;
    }

    /**
     * Legt den Wert der tireBrandPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTireBrandPrice(FieldDecimal value) {
        this.tireBrandPrice = value;
    }

    /**
     * Ruft den Wert der tireBrandPriceUser-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTireBrandPriceUser() {
        return tireBrandPriceUser;
    }

    /**
     * Legt den Wert der tireBrandPriceUser-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTireBrandPriceUser(FieldDecimal value) {
        this.tireBrandPriceUser = value;
    }

    /**
     * Ruft den Wert der tireManufacturerId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getTireManufacturerId() {
        return tireManufacturerId;
    }

    /**
     * Legt den Wert der tireManufacturerId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setTireManufacturerId(FieldInteger value) {
        this.tireManufacturerId = value;
    }

    /**
     * Ruft den Wert der tireManufacturerTextId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getTireManufacturerTextId() {
        return tireManufacturerTextId;
    }

    /**
     * Legt den Wert der tireManufacturerTextId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setTireManufacturerTextId(FieldInteger value) {
        this.tireManufacturerTextId = value;
    }

    /**
     * Ruft den Wert der tireBrandId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getTireBrandId() {
        return tireBrandId;
    }

    /**
     * Legt den Wert der tireBrandId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setTireBrandId(FieldInteger value) {
        this.tireBrandId = value;
    }

    /**
     * Ruft den Wert der tireBrandName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTireBrandName() {
        return tireBrandName;
    }

    /**
     * Legt den Wert der tireBrandName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTireBrandName(FieldString value) {
        this.tireBrandName = value;
    }

    /**
     * Ruft den Wert der tireBrandTextId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getTireBrandTextId() {
        return tireBrandTextId;
    }

    /**
     * Legt den Wert der tireBrandTextId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setTireBrandTextId(FieldInteger value) {
        this.tireBrandTextId = value;
    }

    /**
     * Ruft den Wert der productCodeNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getProductCodeNumber() {
        return productCodeNumber;
    }

    /**
     * Legt den Wert der productCodeNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setProductCodeNumber(FieldInteger value) {
        this.productCodeNumber = value;
    }

}
