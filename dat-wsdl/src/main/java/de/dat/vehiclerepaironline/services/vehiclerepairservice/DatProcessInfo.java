
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für datProcessInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="datProcessInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionLM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="adhesiveMethod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="adhesiveTechnologyScale" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="alloyLM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="blockWageFlatPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bulgeArea" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bulgeAreaDifficultyFactor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="calculationMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="containMicroDents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="control" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countLevelGlass" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="countLevelL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="countLevelM" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="countLevelS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DMSFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dentNumberLess" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dentNumberMore" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dentsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dentsSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="difficultyAllowance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="domusPart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="datProcessId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="finishType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grupoPlastico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasAluminium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="inputL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="inputLP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="inputSDE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="inputSDI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="inputSPD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="isAdditionLM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isFinishing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isOutOfReach" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isSetupTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isUsedPart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lacquerLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lacquerPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="laquerDifficulty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="largeScale" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="manual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="noScratchTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="numDents20" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numDents30" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numDents45" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="optimization" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="partNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="piezasOP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="piezasPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preDamage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="prePressTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="processName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="repairCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="repairType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="setupTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="suppressed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wearAdditional" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="wearAge" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="wearGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wearMileage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="workCompleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="workLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="workPositionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workTime20" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="workTime30" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="workTime45" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="workType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="worktime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="method" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datProcessInfo", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "additionLM",
    "adhesiveMethod",
    "adhesiveTechnologyScale",
    "alloyLM",
    "amount",
    "blockWageFlatPrice",
    "bulgeArea",
    "bulgeAreaDifficultyFactor",
    "calculationMode",
    "containMicroDents",
    "control",
    "countLevelGlass",
    "countLevelL",
    "countLevelM",
    "countLevelS",
    "dmsFlag",
    "dentNumberLess",
    "dentNumberMore",
    "dentsCount",
    "dentsSize",
    "difficultyAllowance",
    "discount",
    "domusPart",
    "datProcessId",
    "finishType",
    "grupoPlastico",
    "hasAluminium",
    "inputL",
    "inputLP",
    "inputSDE",
    "inputSDI",
    "inputSPD",
    "isAdditionLM",
    "isFinishing",
    "isOutOfReach",
    "isSetupTime",
    "isUsedPart",
    "lacquerLevel",
    "lacquerPercentage",
    "laquerDifficulty",
    "largeScale",
    "length",
    "location",
    "manual",
    "noScratchTime",
    "numDents20",
    "numDents30",
    "numDents45",
    "optimization",
    "partNumber",
    "partPosition",
    "piezasOP",
    "piezasPO",
    "preDamage",
    "prePressTime",
    "price",
    "processName",
    "repairCode",
    "repairType",
    "setupTime",
    "suppressed",
    "time",
    "unit",
    "wearAdditional",
    "wearAge",
    "wearGroup",
    "wearMileage",
    "width",
    "workCompleted",
    "workLevel",
    "workPositionNumber",
    "workTime20",
    "workTime30",
    "workTime45",
    "workType",
    "worktime"
})
public class DatProcessInfo {

    @XmlElement(namespace = "")
    protected Boolean additionLM;
    @XmlElement(namespace = "")
    protected Boolean adhesiveMethod;
    @XmlElement(namespace = "")
    protected Boolean adhesiveTechnologyScale;
    @XmlElement(namespace = "")
    protected Boolean alloyLM;
    @XmlElement(namespace = "")
    protected BigDecimal amount;
    @XmlElement(namespace = "")
    protected BigDecimal blockWageFlatPrice;
    @XmlElement(namespace = "")
    protected Integer bulgeArea;
    @XmlElement(namespace = "")
    protected Integer bulgeAreaDifficultyFactor;
    @XmlElement(namespace = "")
    protected Integer calculationMode;
    @XmlElement(namespace = "")
    protected Boolean containMicroDents;
    @XmlElement(namespace = "")
    protected String control;
    @XmlElement(namespace = "")
    protected Integer countLevelGlass;
    @XmlElement(namespace = "")
    protected Integer countLevelL;
    @XmlElement(namespace = "")
    protected Integer countLevelM;
    @XmlElement(namespace = "")
    protected Integer countLevelS;
    @XmlElement(name = "DMSFlag", namespace = "")
    protected String dmsFlag;
    @XmlElement(namespace = "")
    protected BigDecimal dentNumberLess;
    @XmlElement(namespace = "")
    protected BigDecimal dentNumberMore;
    @XmlElement(namespace = "")
    protected Integer dentsCount;
    @XmlElement(namespace = "")
    protected Integer dentsSize;
    @XmlElement(namespace = "")
    protected BigDecimal difficultyAllowance;
    @XmlElement(namespace = "")
    protected BigDecimal discount;
    @XmlElement(namespace = "")
    protected Boolean domusPart;
    @XmlElement(namespace = "")
    protected long datProcessId;
    @XmlElement(namespace = "")
    protected String finishType;
    @XmlElement(namespace = "")
    protected String grupoPlastico;
    @XmlElement(namespace = "")
    protected Integer hasAluminium;
    @XmlElement(namespace = "")
    protected BigDecimal inputL;
    @XmlElement(namespace = "")
    protected BigDecimal inputLP;
    @XmlElement(namespace = "")
    protected BigDecimal inputSDE;
    @XmlElement(namespace = "")
    protected BigDecimal inputSDI;
    @XmlElement(namespace = "")
    protected BigDecimal inputSPD;
    @XmlElement(namespace = "")
    protected Boolean isAdditionLM;
    @XmlElement(namespace = "")
    protected Boolean isFinishing;
    @XmlElement(namespace = "")
    protected Boolean isOutOfReach;
    @XmlElement(namespace = "")
    protected Boolean isSetupTime;
    @XmlElement(namespace = "")
    protected Boolean isUsedPart;
    @XmlElement(namespace = "")
    protected Integer lacquerLevel;
    @XmlElement(namespace = "")
    protected BigDecimal lacquerPercentage;
    @XmlElement(namespace = "")
    protected Integer laquerDifficulty;
    @XmlElement(namespace = "")
    protected Boolean largeScale;
    @XmlElement(namespace = "")
    protected BigDecimal length;
    @XmlElement(namespace = "")
    protected Integer location;
    @XmlElement(namespace = "")
    protected Boolean manual;
    @XmlElement(namespace = "")
    protected BigDecimal noScratchTime;
    @XmlElement(namespace = "")
    protected Integer numDents20;
    @XmlElement(namespace = "")
    protected Integer numDents30;
    @XmlElement(namespace = "")
    protected Integer numDents45;
    @XmlElement(namespace = "")
    protected Integer optimization;
    @XmlElement(namespace = "")
    protected String partNumber;
    @XmlElement(namespace = "")
    protected String partPosition;
    @XmlElement(namespace = "")
    protected String piezasOP;
    @XmlElement(namespace = "")
    protected String piezasPO;
    @XmlElement(namespace = "")
    protected Boolean preDamage;
    @XmlElement(namespace = "")
    protected BigDecimal prePressTime;
    @XmlElement(namespace = "")
    protected BigDecimal price;
    @XmlElement(namespace = "")
    protected String processName;
    @XmlElement(namespace = "")
    protected String repairCode;
    @XmlElement(namespace = "")
    protected String repairType;
    @XmlElement(namespace = "")
    protected Integer setupTime;
    @XmlElementRef(name = "suppressed", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> suppressed;
    @XmlElement(namespace = "")
    protected BigDecimal time;
    @XmlElement(namespace = "")
    protected String unit;
    @XmlElement(namespace = "")
    protected BigDecimal wearAdditional;
    @XmlElement(namespace = "")
    protected Integer wearAge;
    @XmlElement(namespace = "")
    protected String wearGroup;
    @XmlElement(namespace = "")
    protected Integer wearMileage;
    @XmlElement(namespace = "")
    protected BigDecimal width;
    @XmlElement(namespace = "")
    protected Boolean workCompleted;
    @XmlElement(namespace = "")
    protected Integer workLevel;
    @XmlElement(namespace = "")
    protected String workPositionNumber;
    @XmlElement(namespace = "")
    protected BigDecimal workTime20;
    @XmlElement(namespace = "")
    protected BigDecimal workTime30;
    @XmlElement(namespace = "")
    protected BigDecimal workTime45;
    @XmlElement(namespace = "")
    protected Integer workType;
    @XmlElement(namespace = "")
    protected BigDecimal worktime;
    @XmlAttribute(name = "method")
    protected String method;
    @XmlAttribute(name = "type")
    protected String type;

    /**
     * Ruft den Wert der additionLM-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionLM() {
        return additionLM;
    }

    /**
     * Legt den Wert der additionLM-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionLM(Boolean value) {
        this.additionLM = value;
    }

    /**
     * Ruft den Wert der adhesiveMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdhesiveMethod() {
        return adhesiveMethod;
    }

    /**
     * Legt den Wert der adhesiveMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdhesiveMethod(Boolean value) {
        this.adhesiveMethod = value;
    }

    /**
     * Ruft den Wert der adhesiveTechnologyScale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdhesiveTechnologyScale() {
        return adhesiveTechnologyScale;
    }

    /**
     * Legt den Wert der adhesiveTechnologyScale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdhesiveTechnologyScale(Boolean value) {
        this.adhesiveTechnologyScale = value;
    }

    /**
     * Ruft den Wert der alloyLM-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlloyLM() {
        return alloyLM;
    }

    /**
     * Legt den Wert der alloyLM-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlloyLM(Boolean value) {
        this.alloyLM = value;
    }

    /**
     * Ruft den Wert der amount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Legt den Wert der amount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Ruft den Wert der blockWageFlatPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBlockWageFlatPrice() {
        return blockWageFlatPrice;
    }

    /**
     * Legt den Wert der blockWageFlatPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBlockWageFlatPrice(BigDecimal value) {
        this.blockWageFlatPrice = value;
    }

    /**
     * Ruft den Wert der bulgeArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBulgeArea() {
        return bulgeArea;
    }

    /**
     * Legt den Wert der bulgeArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBulgeArea(Integer value) {
        this.bulgeArea = value;
    }

    /**
     * Ruft den Wert der bulgeAreaDifficultyFactor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBulgeAreaDifficultyFactor() {
        return bulgeAreaDifficultyFactor;
    }

    /**
     * Legt den Wert der bulgeAreaDifficultyFactor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBulgeAreaDifficultyFactor(Integer value) {
        this.bulgeAreaDifficultyFactor = value;
    }

    /**
     * Ruft den Wert der calculationMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCalculationMode() {
        return calculationMode;
    }

    /**
     * Legt den Wert der calculationMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCalculationMode(Integer value) {
        this.calculationMode = value;
    }

    /**
     * Ruft den Wert der containMicroDents-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContainMicroDents() {
        return containMicroDents;
    }

    /**
     * Legt den Wert der containMicroDents-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContainMicroDents(Boolean value) {
        this.containMicroDents = value;
    }

    /**
     * Ruft den Wert der control-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControl() {
        return control;
    }

    /**
     * Legt den Wert der control-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControl(String value) {
        this.control = value;
    }

    /**
     * Ruft den Wert der countLevelGlass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountLevelGlass() {
        return countLevelGlass;
    }

    /**
     * Legt den Wert der countLevelGlass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountLevelGlass(Integer value) {
        this.countLevelGlass = value;
    }

    /**
     * Ruft den Wert der countLevelL-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountLevelL() {
        return countLevelL;
    }

    /**
     * Legt den Wert der countLevelL-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountLevelL(Integer value) {
        this.countLevelL = value;
    }

    /**
     * Ruft den Wert der countLevelM-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountLevelM() {
        return countLevelM;
    }

    /**
     * Legt den Wert der countLevelM-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountLevelM(Integer value) {
        this.countLevelM = value;
    }

    /**
     * Ruft den Wert der countLevelS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountLevelS() {
        return countLevelS;
    }

    /**
     * Legt den Wert der countLevelS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountLevelS(Integer value) {
        this.countLevelS = value;
    }

    /**
     * Ruft den Wert der dmsFlag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDMSFlag() {
        return dmsFlag;
    }

    /**
     * Legt den Wert der dmsFlag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDMSFlag(String value) {
        this.dmsFlag = value;
    }

    /**
     * Ruft den Wert der dentNumberLess-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDentNumberLess() {
        return dentNumberLess;
    }

    /**
     * Legt den Wert der dentNumberLess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDentNumberLess(BigDecimal value) {
        this.dentNumberLess = value;
    }

    /**
     * Ruft den Wert der dentNumberMore-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDentNumberMore() {
        return dentNumberMore;
    }

    /**
     * Legt den Wert der dentNumberMore-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDentNumberMore(BigDecimal value) {
        this.dentNumberMore = value;
    }

    /**
     * Ruft den Wert der dentsCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDentsCount() {
        return dentsCount;
    }

    /**
     * Legt den Wert der dentsCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDentsCount(Integer value) {
        this.dentsCount = value;
    }

    /**
     * Ruft den Wert der dentsSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDentsSize() {
        return dentsSize;
    }

    /**
     * Legt den Wert der dentsSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDentsSize(Integer value) {
        this.dentsSize = value;
    }

    /**
     * Ruft den Wert der difficultyAllowance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDifficultyAllowance() {
        return difficultyAllowance;
    }

    /**
     * Legt den Wert der difficultyAllowance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDifficultyAllowance(BigDecimal value) {
        this.difficultyAllowance = value;
    }

    /**
     * Ruft den Wert der discount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * Legt den Wert der discount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscount(BigDecimal value) {
        this.discount = value;
    }

    /**
     * Ruft den Wert der domusPart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDomusPart() {
        return domusPart;
    }

    /**
     * Legt den Wert der domusPart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDomusPart(Boolean value) {
        this.domusPart = value;
    }

    /**
     * Ruft den Wert der datProcessId-Eigenschaft ab.
     * 
     */
    public long getDatProcessId() {
        return datProcessId;
    }

    /**
     * Legt den Wert der datProcessId-Eigenschaft fest.
     * 
     */
    public void setDatProcessId(long value) {
        this.datProcessId = value;
    }

    /**
     * Ruft den Wert der finishType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinishType() {
        return finishType;
    }

    /**
     * Legt den Wert der finishType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinishType(String value) {
        this.finishType = value;
    }

    /**
     * Ruft den Wert der grupoPlastico-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrupoPlastico() {
        return grupoPlastico;
    }

    /**
     * Legt den Wert der grupoPlastico-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrupoPlastico(String value) {
        this.grupoPlastico = value;
    }

    /**
     * Ruft den Wert der hasAluminium-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHasAluminium() {
        return hasAluminium;
    }

    /**
     * Legt den Wert der hasAluminium-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHasAluminium(Integer value) {
        this.hasAluminium = value;
    }

    /**
     * Ruft den Wert der inputL-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInputL() {
        return inputL;
    }

    /**
     * Legt den Wert der inputL-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInputL(BigDecimal value) {
        this.inputL = value;
    }

    /**
     * Ruft den Wert der inputLP-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInputLP() {
        return inputLP;
    }

    /**
     * Legt den Wert der inputLP-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInputLP(BigDecimal value) {
        this.inputLP = value;
    }

    /**
     * Ruft den Wert der inputSDE-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInputSDE() {
        return inputSDE;
    }

    /**
     * Legt den Wert der inputSDE-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInputSDE(BigDecimal value) {
        this.inputSDE = value;
    }

    /**
     * Ruft den Wert der inputSDI-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInputSDI() {
        return inputSDI;
    }

    /**
     * Legt den Wert der inputSDI-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInputSDI(BigDecimal value) {
        this.inputSDI = value;
    }

    /**
     * Ruft den Wert der inputSPD-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInputSPD() {
        return inputSPD;
    }

    /**
     * Legt den Wert der inputSPD-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInputSPD(BigDecimal value) {
        this.inputSPD = value;
    }

    /**
     * Ruft den Wert der isAdditionLM-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAdditionLM() {
        return isAdditionLM;
    }

    /**
     * Legt den Wert der isAdditionLM-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAdditionLM(Boolean value) {
        this.isAdditionLM = value;
    }

    /**
     * Ruft den Wert der isFinishing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFinishing() {
        return isFinishing;
    }

    /**
     * Legt den Wert der isFinishing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFinishing(Boolean value) {
        this.isFinishing = value;
    }

    /**
     * Ruft den Wert der isOutOfReach-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOutOfReach() {
        return isOutOfReach;
    }

    /**
     * Legt den Wert der isOutOfReach-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOutOfReach(Boolean value) {
        this.isOutOfReach = value;
    }

    /**
     * Ruft den Wert der isSetupTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSetupTime() {
        return isSetupTime;
    }

    /**
     * Legt den Wert der isSetupTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSetupTime(Boolean value) {
        this.isSetupTime = value;
    }

    /**
     * Ruft den Wert der isUsedPart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUsedPart() {
        return isUsedPart;
    }

    /**
     * Legt den Wert der isUsedPart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUsedPart(Boolean value) {
        this.isUsedPart = value;
    }

    /**
     * Ruft den Wert der lacquerLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLacquerLevel() {
        return lacquerLevel;
    }

    /**
     * Legt den Wert der lacquerLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLacquerLevel(Integer value) {
        this.lacquerLevel = value;
    }

    /**
     * Ruft den Wert der lacquerPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLacquerPercentage() {
        return lacquerPercentage;
    }

    /**
     * Legt den Wert der lacquerPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLacquerPercentage(BigDecimal value) {
        this.lacquerPercentage = value;
    }

    /**
     * Ruft den Wert der laquerDifficulty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLaquerDifficulty() {
        return laquerDifficulty;
    }

    /**
     * Legt den Wert der laquerDifficulty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLaquerDifficulty(Integer value) {
        this.laquerDifficulty = value;
    }

    /**
     * Ruft den Wert der largeScale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLargeScale() {
        return largeScale;
    }

    /**
     * Legt den Wert der largeScale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLargeScale(Boolean value) {
        this.largeScale = value;
    }

    /**
     * Ruft den Wert der length-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLength() {
        return length;
    }

    /**
     * Legt den Wert der length-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLength(BigDecimal value) {
        this.length = value;
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocation(Integer value) {
        this.location = value;
    }

    /**
     * Ruft den Wert der manual-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManual() {
        return manual;
    }

    /**
     * Legt den Wert der manual-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManual(Boolean value) {
        this.manual = value;
    }

    /**
     * Ruft den Wert der noScratchTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNoScratchTime() {
        return noScratchTime;
    }

    /**
     * Legt den Wert der noScratchTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNoScratchTime(BigDecimal value) {
        this.noScratchTime = value;
    }

    /**
     * Ruft den Wert der numDents20-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumDents20() {
        return numDents20;
    }

    /**
     * Legt den Wert der numDents20-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumDents20(Integer value) {
        this.numDents20 = value;
    }

    /**
     * Ruft den Wert der numDents30-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumDents30() {
        return numDents30;
    }

    /**
     * Legt den Wert der numDents30-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumDents30(Integer value) {
        this.numDents30 = value;
    }

    /**
     * Ruft den Wert der numDents45-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumDents45() {
        return numDents45;
    }

    /**
     * Legt den Wert der numDents45-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumDents45(Integer value) {
        this.numDents45 = value;
    }

    /**
     * Ruft den Wert der optimization-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOptimization() {
        return optimization;
    }

    /**
     * Legt den Wert der optimization-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOptimization(Integer value) {
        this.optimization = value;
    }

    /**
     * Ruft den Wert der partNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * Legt den Wert der partNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumber(String value) {
        this.partNumber = value;
    }

    /**
     * Ruft den Wert der partPosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartPosition() {
        return partPosition;
    }

    /**
     * Legt den Wert der partPosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartPosition(String value) {
        this.partPosition = value;
    }

    /**
     * Ruft den Wert der piezasOP-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiezasOP() {
        return piezasOP;
    }

    /**
     * Legt den Wert der piezasOP-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiezasOP(String value) {
        this.piezasOP = value;
    }

    /**
     * Ruft den Wert der piezasPO-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiezasPO() {
        return piezasPO;
    }

    /**
     * Legt den Wert der piezasPO-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiezasPO(String value) {
        this.piezasPO = value;
    }

    /**
     * Ruft den Wert der preDamage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreDamage() {
        return preDamage;
    }

    /**
     * Legt den Wert der preDamage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreDamage(Boolean value) {
        this.preDamage = value;
    }

    /**
     * Ruft den Wert der prePressTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrePressTime() {
        return prePressTime;
    }

    /**
     * Legt den Wert der prePressTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrePressTime(BigDecimal value) {
        this.prePressTime = value;
    }

    /**
     * Ruft den Wert der price-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Legt den Wert der price-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Ruft den Wert der processName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessName() {
        return processName;
    }

    /**
     * Legt den Wert der processName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessName(String value) {
        this.processName = value;
    }

    /**
     * Ruft den Wert der repairCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepairCode() {
        return repairCode;
    }

    /**
     * Legt den Wert der repairCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepairCode(String value) {
        this.repairCode = value;
    }

    /**
     * Ruft den Wert der repairType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepairType() {
        return repairType;
    }

    /**
     * Legt den Wert der repairType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepairType(String value) {
        this.repairType = value;
    }

    /**
     * Ruft den Wert der setupTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSetupTime() {
        return setupTime;
    }

    /**
     * Legt den Wert der setupTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSetupTime(Integer value) {
        this.setupTime = value;
    }

    /**
     * Ruft den Wert der suppressed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSuppressed() {
        return suppressed;
    }

    /**
     * Legt den Wert der suppressed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSuppressed(JAXBElement<Boolean> value) {
        this.suppressed = value;
    }

    /**
     * Ruft den Wert der time-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTime() {
        return time;
    }

    /**
     * Legt den Wert der time-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTime(BigDecimal value) {
        this.time = value;
    }

    /**
     * Ruft den Wert der unit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Legt den Wert der unit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Ruft den Wert der wearAdditional-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWearAdditional() {
        return wearAdditional;
    }

    /**
     * Legt den Wert der wearAdditional-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWearAdditional(BigDecimal value) {
        this.wearAdditional = value;
    }

    /**
     * Ruft den Wert der wearAge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWearAge() {
        return wearAge;
    }

    /**
     * Legt den Wert der wearAge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWearAge(Integer value) {
        this.wearAge = value;
    }

    /**
     * Ruft den Wert der wearGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWearGroup() {
        return wearGroup;
    }

    /**
     * Legt den Wert der wearGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWearGroup(String value) {
        this.wearGroup = value;
    }

    /**
     * Ruft den Wert der wearMileage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWearMileage() {
        return wearMileage;
    }

    /**
     * Legt den Wert der wearMileage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWearMileage(Integer value) {
        this.wearMileage = value;
    }

    /**
     * Ruft den Wert der width-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * Legt den Wert der width-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWidth(BigDecimal value) {
        this.width = value;
    }

    /**
     * Ruft den Wert der workCompleted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkCompleted() {
        return workCompleted;
    }

    /**
     * Legt den Wert der workCompleted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkCompleted(Boolean value) {
        this.workCompleted = value;
    }

    /**
     * Ruft den Wert der workLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkLevel() {
        return workLevel;
    }

    /**
     * Legt den Wert der workLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkLevel(Integer value) {
        this.workLevel = value;
    }

    /**
     * Ruft den Wert der workPositionNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPositionNumber() {
        return workPositionNumber;
    }

    /**
     * Legt den Wert der workPositionNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPositionNumber(String value) {
        this.workPositionNumber = value;
    }

    /**
     * Ruft den Wert der workTime20-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWorkTime20() {
        return workTime20;
    }

    /**
     * Legt den Wert der workTime20-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWorkTime20(BigDecimal value) {
        this.workTime20 = value;
    }

    /**
     * Ruft den Wert der workTime30-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWorkTime30() {
        return workTime30;
    }

    /**
     * Legt den Wert der workTime30-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWorkTime30(BigDecimal value) {
        this.workTime30 = value;
    }

    /**
     * Ruft den Wert der workTime45-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWorkTime45() {
        return workTime45;
    }

    /**
     * Legt den Wert der workTime45-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWorkTime45(BigDecimal value) {
        this.workTime45 = value;
    }

    /**
     * Ruft den Wert der workType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkType() {
        return workType;
    }

    /**
     * Legt den Wert der workType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkType(Integer value) {
        this.workType = value;
    }

    /**
     * Ruft den Wert der worktime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWorktime() {
        return worktime;
    }

    /**
     * Legt den Wert der worktime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWorktime(BigDecimal value) {
        this.worktime = value;
    }

    /**
     * Ruft den Wert der method-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
        return method;
    }

    /**
     * Legt den Wert der method-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod(String value) {
        this.method = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
