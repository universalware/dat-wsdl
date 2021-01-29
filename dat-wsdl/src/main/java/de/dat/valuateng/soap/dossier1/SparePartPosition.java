
package de.dat.valuateng.soap.dossier1;

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
 *         &lt;element name="DATProcessId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DATProcessIdName" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PartNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PartNumberManufacturer" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Description" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="LastUPE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LastUPEDate" type="{http://www.dat.de/vxs}fieldDateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="SecondtoLastUPE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SecondtoLastUPEDate" type="{http://www.dat.de/vxs}fieldDateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="ThirdtoLastUPE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ThirdtoLastUPEDate" type="{http://www.dat.de/vxs}fieldDateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="FourthtoLastUPE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="FourthtoLastUPEDate" type="{http://www.dat.de/vxs}fieldDateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="EquipmentPositions" type="{http://www.dat.de/vxs}equipSequence" minOccurs="0" form="qualified"/>
 *         &lt;element name="Orderable" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkTimeMin" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkTimeMax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SparePartHistoryPositions" type="{http://www.dat.de/vxs}spHistPositionsSeq" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "SparePartPosition")
public class SparePartPosition {

    @XmlElement(name = "DATProcessId")
    protected FieldInteger datProcessId;
    @XmlElement(name = "DATProcessIdName")
    protected FieldString datProcessIdName;
    @XmlElement(name = "PartNumber")
    protected FieldString partNumber;
    @XmlElement(name = "PartNumberManufacturer")
    protected FieldString partNumberManufacturer;
    @XmlElement(name = "Description")
    protected FieldString description;
    @XmlElement(name = "LastUPE")
    protected BigDecimal lastUPE;
    @XmlElement(name = "LastUPEDate")
    protected FieldDateTime lastUPEDate;
    @XmlElement(name = "SecondtoLastUPE")
    protected BigDecimal secondtoLastUPE;
    @XmlElement(name = "SecondtoLastUPEDate")
    protected FieldDateTime secondtoLastUPEDate;
    @XmlElement(name = "ThirdtoLastUPE")
    protected BigDecimal thirdtoLastUPE;
    @XmlElement(name = "ThirdtoLastUPEDate")
    protected FieldDateTime thirdtoLastUPEDate;
    @XmlElement(name = "FourthtoLastUPE")
    protected BigDecimal fourthtoLastUPE;
    @XmlElement(name = "FourthtoLastUPEDate")
    protected FieldDateTime fourthtoLastUPEDate;
    @XmlElement(name = "EquipmentPositions")
    protected EquipSequence equipmentPositions;
    @XmlElement(name = "Orderable")
    protected FieldBoolean orderable;
    @XmlElement(name = "WorkTimeMin")
    protected BigDecimal workTimeMin;
    @XmlElement(name = "WorkTimeMax")
    protected BigDecimal workTimeMax;
    @XmlElement(name = "SparePartHistoryPositions")
    protected SpHistPositionsSeq sparePartHistoryPositions;

    /**
     * Ruft den Wert der datProcessId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDATProcessId() {
        return datProcessId;
    }

    /**
     * Legt den Wert der datProcessId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDATProcessId(FieldInteger value) {
        this.datProcessId = value;
    }

    /**
     * Ruft den Wert der datProcessIdName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDATProcessIdName() {
        return datProcessIdName;
    }

    /**
     * Legt den Wert der datProcessIdName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDATProcessIdName(FieldString value) {
        this.datProcessIdName = value;
    }

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
     * Ruft den Wert der partNumberManufacturer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPartNumberManufacturer() {
        return partNumberManufacturer;
    }

    /**
     * Legt den Wert der partNumberManufacturer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPartNumberManufacturer(FieldString value) {
        this.partNumberManufacturer = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDescription(FieldString value) {
        this.description = value;
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
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getLastUPEDate() {
        return lastUPEDate;
    }

    /**
     * Legt den Wert der lastUPEDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setLastUPEDate(FieldDateTime value) {
        this.lastUPEDate = value;
    }

    /**
     * Ruft den Wert der secondtoLastUPE-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSecondtoLastUPE() {
        return secondtoLastUPE;
    }

    /**
     * Legt den Wert der secondtoLastUPE-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSecondtoLastUPE(BigDecimal value) {
        this.secondtoLastUPE = value;
    }

    /**
     * Ruft den Wert der secondtoLastUPEDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getSecondtoLastUPEDate() {
        return secondtoLastUPEDate;
    }

    /**
     * Legt den Wert der secondtoLastUPEDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setSecondtoLastUPEDate(FieldDateTime value) {
        this.secondtoLastUPEDate = value;
    }

    /**
     * Ruft den Wert der thirdtoLastUPE-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getThirdtoLastUPE() {
        return thirdtoLastUPE;
    }

    /**
     * Legt den Wert der thirdtoLastUPE-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setThirdtoLastUPE(BigDecimal value) {
        this.thirdtoLastUPE = value;
    }

    /**
     * Ruft den Wert der thirdtoLastUPEDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getThirdtoLastUPEDate() {
        return thirdtoLastUPEDate;
    }

    /**
     * Legt den Wert der thirdtoLastUPEDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setThirdtoLastUPEDate(FieldDateTime value) {
        this.thirdtoLastUPEDate = value;
    }

    /**
     * Ruft den Wert der fourthtoLastUPE-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFourthtoLastUPE() {
        return fourthtoLastUPE;
    }

    /**
     * Legt den Wert der fourthtoLastUPE-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFourthtoLastUPE(BigDecimal value) {
        this.fourthtoLastUPE = value;
    }

    /**
     * Ruft den Wert der fourthtoLastUPEDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getFourthtoLastUPEDate() {
        return fourthtoLastUPEDate;
    }

    /**
     * Legt den Wert der fourthtoLastUPEDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setFourthtoLastUPEDate(FieldDateTime value) {
        this.fourthtoLastUPEDate = value;
    }

    /**
     * Ruft den Wert der equipmentPositions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EquipSequence }
     *     
     */
    public EquipSequence getEquipmentPositions() {
        return equipmentPositions;
    }

    /**
     * Legt den Wert der equipmentPositions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipSequence }
     *     
     */
    public void setEquipmentPositions(EquipSequence value) {
        this.equipmentPositions = value;
    }

    /**
     * Ruft den Wert der orderable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getOrderable() {
        return orderable;
    }

    /**
     * Legt den Wert der orderable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setOrderable(FieldBoolean value) {
        this.orderable = value;
    }

    /**
     * Ruft den Wert der workTimeMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWorkTimeMin() {
        return workTimeMin;
    }

    /**
     * Legt den Wert der workTimeMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWorkTimeMin(BigDecimal value) {
        this.workTimeMin = value;
    }

    /**
     * Ruft den Wert der workTimeMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWorkTimeMax() {
        return workTimeMax;
    }

    /**
     * Legt den Wert der workTimeMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWorkTimeMax(BigDecimal value) {
        this.workTimeMax = value;
    }

    /**
     * Ruft den Wert der sparePartHistoryPositions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SpHistPositionsSeq }
     *     
     */
    public SpHistPositionsSeq getSparePartHistoryPositions() {
        return sparePartHistoryPositions;
    }

    /**
     * Legt den Wert der sparePartHistoryPositions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SpHistPositionsSeq }
     *     
     */
    public void setSparePartHistoryPositions(SpHistPositionsSeq value) {
        this.sparePartHistoryPositions = value;
    }

}
