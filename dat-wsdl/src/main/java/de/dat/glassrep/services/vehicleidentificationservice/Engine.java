
package de.dat.glassrep.services.vehicleidentificationservice;

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
 *         &lt;element name="EngingeType" type="{http://www.dat.de/vxs}fieldString30" minOccurs="0" form="qualified"/>
 *         &lt;element name="EngineType" type="{http://www.dat.de/vxs}fieldString30" minOccurs="0" form="qualified"/>
 *         &lt;element name="CatalyticConverterType" type="{http://www.dat.de/vxs}fieldString30" minOccurs="0" form="qualified"/>
 *         &lt;element name="GearType" type="{http://www.dat.de/vxs}fieldString2" minOccurs="0" form="qualified"/>
 *         &lt;element name="FuelMethod" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatFuelMethod" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="EnginePowerKw" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatEnginePowerKw" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="EnginePowerHp" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatEnginePowerHp" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="Cylinders" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatCylinders" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="Capacity" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatCapacity" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="PollutionClass" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Consumption" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConsumptionInTown" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConsumptionOutOfTown" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Co2Emission" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DirectInjection" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="EngineClass" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="EnginePowerHpManufacturerInformation" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PowerKwPsManual" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "Engine")
public class Engine {

    @XmlElement(name = "EngingeType")
    protected FieldString30 engingeType;
    @XmlElement(name = "EngineType")
    protected FieldString30 engineType;
    @XmlElement(name = "CatalyticConverterType")
    protected FieldString30 catalyticConverterType;
    @XmlElement(name = "GearType")
    protected FieldString2 gearType;
    @XmlElement(name = "FuelMethod")
    protected FieldString fuelMethod;
    @XmlElement(name = "DatFuelMethod")
    protected FieldString datFuelMethod;
    @XmlElement(name = "EnginePowerKw")
    protected FieldInteger enginePowerKw;
    @XmlElement(name = "DatEnginePowerKw")
    protected FieldInteger datEnginePowerKw;
    @XmlElement(name = "EnginePowerHp")
    protected FieldInteger enginePowerHp;
    @XmlElement(name = "DatEnginePowerHp")
    protected FieldInteger datEnginePowerHp;
    @XmlElement(name = "Cylinders")
    protected FieldInteger cylinders;
    @XmlElement(name = "DatCylinders")
    protected FieldInteger datCylinders;
    @XmlElement(name = "Capacity")
    protected FieldInteger capacity;
    @XmlElement(name = "DatCapacity")
    protected FieldInteger datCapacity;
    @XmlElement(name = "PollutionClass")
    protected FieldString pollutionClass;
    @XmlElement(name = "Consumption")
    protected FieldDecimal consumption;
    @XmlElement(name = "ConsumptionInTown")
    protected FieldDecimal consumptionInTown;
    @XmlElement(name = "ConsumptionOutOfTown")
    protected FieldDecimal consumptionOutOfTown;
    @XmlElement(name = "Co2Emission")
    protected FieldDecimal co2Emission;
    @XmlElement(name = "DirectInjection")
    protected FieldString directInjection;
    @XmlElement(name = "EngineClass")
    protected FieldString engineClass;
    @XmlElement(name = "EnginePowerHpManufacturerInformation")
    protected FieldDecimal enginePowerHpManufacturerInformation;
    @XmlElement(name = "PowerKwPsManual")
    protected FieldString powerKwPsManual;

    /**
     * Ruft den Wert der engingeType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString30 }
     *     
     */
    public FieldString30 getEngingeType() {
        return engingeType;
    }

    /**
     * Legt den Wert der engingeType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString30 }
     *     
     */
    public void setEngingeType(FieldString30 value) {
        this.engingeType = value;
    }

    /**
     * Ruft den Wert der engineType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString30 }
     *     
     */
    public FieldString30 getEngineType() {
        return engineType;
    }

    /**
     * Legt den Wert der engineType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString30 }
     *     
     */
    public void setEngineType(FieldString30 value) {
        this.engineType = value;
    }

    /**
     * Ruft den Wert der catalyticConverterType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString30 }
     *     
     */
    public FieldString30 getCatalyticConverterType() {
        return catalyticConverterType;
    }

    /**
     * Legt den Wert der catalyticConverterType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString30 }
     *     
     */
    public void setCatalyticConverterType(FieldString30 value) {
        this.catalyticConverterType = value;
    }

    /**
     * Ruft den Wert der gearType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString2 }
     *     
     */
    public FieldString2 getGearType() {
        return gearType;
    }

    /**
     * Legt den Wert der gearType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString2 }
     *     
     */
    public void setGearType(FieldString2 value) {
        this.gearType = value;
    }

    /**
     * Ruft den Wert der fuelMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getFuelMethod() {
        return fuelMethod;
    }

    /**
     * Legt den Wert der fuelMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setFuelMethod(FieldString value) {
        this.fuelMethod = value;
    }

    /**
     * Ruft den Wert der datFuelMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDatFuelMethod() {
        return datFuelMethod;
    }

    /**
     * Legt den Wert der datFuelMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDatFuelMethod(FieldString value) {
        this.datFuelMethod = value;
    }

    /**
     * Ruft den Wert der enginePowerKw-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getEnginePowerKw() {
        return enginePowerKw;
    }

    /**
     * Legt den Wert der enginePowerKw-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setEnginePowerKw(FieldInteger value) {
        this.enginePowerKw = value;
    }

    /**
     * Ruft den Wert der datEnginePowerKw-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatEnginePowerKw() {
        return datEnginePowerKw;
    }

    /**
     * Legt den Wert der datEnginePowerKw-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatEnginePowerKw(FieldInteger value) {
        this.datEnginePowerKw = value;
    }

    /**
     * Ruft den Wert der enginePowerHp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getEnginePowerHp() {
        return enginePowerHp;
    }

    /**
     * Legt den Wert der enginePowerHp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setEnginePowerHp(FieldInteger value) {
        this.enginePowerHp = value;
    }

    /**
     * Ruft den Wert der datEnginePowerHp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatEnginePowerHp() {
        return datEnginePowerHp;
    }

    /**
     * Legt den Wert der datEnginePowerHp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatEnginePowerHp(FieldInteger value) {
        this.datEnginePowerHp = value;
    }

    /**
     * Ruft den Wert der cylinders-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getCylinders() {
        return cylinders;
    }

    /**
     * Legt den Wert der cylinders-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setCylinders(FieldInteger value) {
        this.cylinders = value;
    }

    /**
     * Ruft den Wert der datCylinders-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatCylinders() {
        return datCylinders;
    }

    /**
     * Legt den Wert der datCylinders-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatCylinders(FieldInteger value) {
        this.datCylinders = value;
    }

    /**
     * Ruft den Wert der capacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getCapacity() {
        return capacity;
    }

    /**
     * Legt den Wert der capacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setCapacity(FieldInteger value) {
        this.capacity = value;
    }

    /**
     * Ruft den Wert der datCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatCapacity() {
        return datCapacity;
    }

    /**
     * Legt den Wert der datCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatCapacity(FieldInteger value) {
        this.datCapacity = value;
    }

    /**
     * Ruft den Wert der pollutionClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPollutionClass() {
        return pollutionClass;
    }

    /**
     * Legt den Wert der pollutionClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPollutionClass(FieldString value) {
        this.pollutionClass = value;
    }

    /**
     * Ruft den Wert der consumption-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getConsumption() {
        return consumption;
    }

    /**
     * Legt den Wert der consumption-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setConsumption(FieldDecimal value) {
        this.consumption = value;
    }

    /**
     * Ruft den Wert der consumptionInTown-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getConsumptionInTown() {
        return consumptionInTown;
    }

    /**
     * Legt den Wert der consumptionInTown-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setConsumptionInTown(FieldDecimal value) {
        this.consumptionInTown = value;
    }

    /**
     * Ruft den Wert der consumptionOutOfTown-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getConsumptionOutOfTown() {
        return consumptionOutOfTown;
    }

    /**
     * Legt den Wert der consumptionOutOfTown-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setConsumptionOutOfTown(FieldDecimal value) {
        this.consumptionOutOfTown = value;
    }

    /**
     * Ruft den Wert der co2Emission-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getCo2Emission() {
        return co2Emission;
    }

    /**
     * Legt den Wert der co2Emission-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setCo2Emission(FieldDecimal value) {
        this.co2Emission = value;
    }

    /**
     * Ruft den Wert der directInjection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDirectInjection() {
        return directInjection;
    }

    /**
     * Legt den Wert der directInjection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDirectInjection(FieldString value) {
        this.directInjection = value;
    }

    /**
     * Ruft den Wert der engineClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getEngineClass() {
        return engineClass;
    }

    /**
     * Legt den Wert der engineClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setEngineClass(FieldString value) {
        this.engineClass = value;
    }

    /**
     * Ruft den Wert der enginePowerHpManufacturerInformation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getEnginePowerHpManufacturerInformation() {
        return enginePowerHpManufacturerInformation;
    }

    /**
     * Legt den Wert der enginePowerHpManufacturerInformation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setEnginePowerHpManufacturerInformation(FieldDecimal value) {
        this.enginePowerHpManufacturerInformation = value;
    }

    /**
     * Ruft den Wert der powerKwPsManual-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPowerKwPsManual() {
        return powerKwPsManual;
    }

    /**
     * Legt den Wert der powerKwPsManual-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPowerKwPsManual(FieldString value) {
        this.powerKwPsManual = value;
    }

}
