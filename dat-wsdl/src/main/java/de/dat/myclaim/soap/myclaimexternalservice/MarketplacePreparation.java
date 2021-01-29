
package de.dat.myclaim.soap.myclaimexternalservice;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="VehicleNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ExportFlag" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="MarketplaceVehicleType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="MarketplaceAreaList" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AreaItem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MarketplaceManufacturerList" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ManufacturerItem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MarketplaceModelGroupList" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ModelGroupItem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MarketplaceModelList" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ModelItem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MarketplaceVehicleSectionList" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VehicleSelectionItem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MarketplaceTypeLineList" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TypeLineItem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MarketplaceFuelConsumptionDataList" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FuelConsumptionDataItem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MarketplaceFuelAccordingEnVkVList" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FuelAccordingEnVkVItem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MarketplaceColorInteriorFittingsList" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ColorInteriorFittingsItem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GeneralInspection" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="GeneralInspectionNewFlag" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="WithFullServiceHistoryFlag" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="MarketplaceAccidentalDamageList" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AccidentalDamageItem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DescriptionAccidentalDamage" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DealerCarFlag" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="MarketplaceWarrantyList" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="WarrantyItem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EquipmentFormat" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="EquipmentSorting" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="MarketplaceEquipmentGroupList" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.dat.de/vxs}EquipmentGroupItem" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MarketplaceEquipmentGroupListN" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.dat.de/vxs}EquipmentGroupItem" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IntroductionText" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="FinalText" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="MPConfigIntroText" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="MPConfigFinalText" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="MPConfigIntroTextList" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.dat.de/vxs}TextItem" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MPConfigFinalTextList" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.dat.de/vxs}TextItem" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlRootElement(name = "MarketplacePreparation")
public class MarketplacePreparation {

    @XmlElement(name = "VehicleNumber")
    protected FieldString vehicleNumber;
    @XmlElement(name = "ExportFlag")
    protected FieldBoolean exportFlag;
    @XmlElement(name = "MarketplaceVehicleType")
    protected FieldString marketplaceVehicleType;
    @XmlElement(name = "MarketplaceAreaList")
    protected MarketplacePreparation.MarketplaceAreaList marketplaceAreaList;
    @XmlElement(name = "MarketplaceManufacturerList")
    protected MarketplacePreparation.MarketplaceManufacturerList marketplaceManufacturerList;
    @XmlElement(name = "MarketplaceModelGroupList")
    protected MarketplacePreparation.MarketplaceModelGroupList marketplaceModelGroupList;
    @XmlElement(name = "MarketplaceModelList")
    protected MarketplacePreparation.MarketplaceModelList marketplaceModelList;
    @XmlElement(name = "MarketplaceVehicleSectionList")
    protected MarketplacePreparation.MarketplaceVehicleSectionList marketplaceVehicleSectionList;
    @XmlElement(name = "MarketplaceTypeLineList")
    protected MarketplacePreparation.MarketplaceTypeLineList marketplaceTypeLineList;
    @XmlElement(name = "MarketplaceFuelConsumptionDataList")
    protected MarketplacePreparation.MarketplaceFuelConsumptionDataList marketplaceFuelConsumptionDataList;
    @XmlElement(name = "MarketplaceFuelAccordingEnVkVList")
    protected MarketplacePreparation.MarketplaceFuelAccordingEnVkVList marketplaceFuelAccordingEnVkVList;
    @XmlElement(name = "MarketplaceColorInteriorFittingsList")
    protected MarketplacePreparation.MarketplaceColorInteriorFittingsList marketplaceColorInteriorFittingsList;
    @XmlElement(name = "GeneralInspection")
    protected FieldString generalInspection;
    @XmlElement(name = "GeneralInspectionNewFlag")
    protected FieldBoolean generalInspectionNewFlag;
    @XmlElement(name = "WithFullServiceHistoryFlag")
    protected FieldBoolean withFullServiceHistoryFlag;
    @XmlElement(name = "MarketplaceAccidentalDamageList")
    protected MarketplacePreparation.MarketplaceAccidentalDamageList marketplaceAccidentalDamageList;
    @XmlElement(name = "DescriptionAccidentalDamage")
    protected FieldString descriptionAccidentalDamage;
    @XmlElement(name = "DealerCarFlag")
    protected FieldBoolean dealerCarFlag;
    @XmlElement(name = "MarketplaceWarrantyList")
    protected MarketplacePreparation.MarketplaceWarrantyList marketplaceWarrantyList;
    @XmlElement(name = "EquipmentFormat")
    protected FieldString equipmentFormat;
    @XmlElement(name = "EquipmentSorting")
    protected FieldString equipmentSorting;
    @XmlElement(name = "MarketplaceEquipmentGroupList")
    protected MarketplacePreparation.MarketplaceEquipmentGroupList marketplaceEquipmentGroupList;
    @XmlElement(name = "MarketplaceEquipmentGroupListN")
    protected MarketplacePreparation.MarketplaceEquipmentGroupListN marketplaceEquipmentGroupListN;
    @XmlElement(name = "IntroductionText")
    protected FieldString introductionText;
    @XmlElement(name = "FinalText")
    protected FieldString finalText;
    @XmlElement(name = "MPConfigIntroText")
    protected FieldString mpConfigIntroText;
    @XmlElement(name = "MPConfigFinalText")
    protected FieldString mpConfigFinalText;
    @XmlElement(name = "MPConfigIntroTextList")
    protected MarketplacePreparation.MPConfigIntroTextList mpConfigIntroTextList;
    @XmlElement(name = "MPConfigFinalTextList")
    protected MarketplacePreparation.MPConfigFinalTextList mpConfigFinalTextList;

    /**
     * Ruft den Wert der vehicleNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getVehicleNumber() {
        return vehicleNumber;
    }

    /**
     * Legt den Wert der vehicleNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setVehicleNumber(FieldString value) {
        this.vehicleNumber = value;
    }

    /**
     * Ruft den Wert der exportFlag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getExportFlag() {
        return exportFlag;
    }

    /**
     * Legt den Wert der exportFlag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setExportFlag(FieldBoolean value) {
        this.exportFlag = value;
    }

    /**
     * Ruft den Wert der marketplaceVehicleType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getMarketplaceVehicleType() {
        return marketplaceVehicleType;
    }

    /**
     * Legt den Wert der marketplaceVehicleType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setMarketplaceVehicleType(FieldString value) {
        this.marketplaceVehicleType = value;
    }

    /**
     * Ruft den Wert der marketplaceAreaList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MarketplacePreparation.MarketplaceAreaList }
     *     
     */
    public MarketplacePreparation.MarketplaceAreaList getMarketplaceAreaList() {
        return marketplaceAreaList;
    }

    /**
     * Legt den Wert der marketplaceAreaList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketplacePreparation.MarketplaceAreaList }
     *     
     */
    public void setMarketplaceAreaList(MarketplacePreparation.MarketplaceAreaList value) {
        this.marketplaceAreaList = value;
    }

    /**
     * Ruft den Wert der marketplaceManufacturerList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MarketplacePreparation.MarketplaceManufacturerList }
     *     
     */
    public MarketplacePreparation.MarketplaceManufacturerList getMarketplaceManufacturerList() {
        return marketplaceManufacturerList;
    }

    /**
     * Legt den Wert der marketplaceManufacturerList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketplacePreparation.MarketplaceManufacturerList }
     *     
     */
    public void setMarketplaceManufacturerList(MarketplacePreparation.MarketplaceManufacturerList value) {
        this.marketplaceManufacturerList = value;
    }

    /**
     * Ruft den Wert der marketplaceModelGroupList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MarketplacePreparation.MarketplaceModelGroupList }
     *     
     */
    public MarketplacePreparation.MarketplaceModelGroupList getMarketplaceModelGroupList() {
        return marketplaceModelGroupList;
    }

    /**
     * Legt den Wert der marketplaceModelGroupList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketplacePreparation.MarketplaceModelGroupList }
     *     
     */
    public void setMarketplaceModelGroupList(MarketplacePreparation.MarketplaceModelGroupList value) {
        this.marketplaceModelGroupList = value;
    }

    /**
     * Ruft den Wert der marketplaceModelList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MarketplacePreparation.MarketplaceModelList }
     *     
     */
    public MarketplacePreparation.MarketplaceModelList getMarketplaceModelList() {
        return marketplaceModelList;
    }

    /**
     * Legt den Wert der marketplaceModelList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketplacePreparation.MarketplaceModelList }
     *     
     */
    public void setMarketplaceModelList(MarketplacePreparation.MarketplaceModelList value) {
        this.marketplaceModelList = value;
    }

    /**
     * Ruft den Wert der marketplaceVehicleSectionList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MarketplacePreparation.MarketplaceVehicleSectionList }
     *     
     */
    public MarketplacePreparation.MarketplaceVehicleSectionList getMarketplaceVehicleSectionList() {
        return marketplaceVehicleSectionList;
    }

    /**
     * Legt den Wert der marketplaceVehicleSectionList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketplacePreparation.MarketplaceVehicleSectionList }
     *     
     */
    public void setMarketplaceVehicleSectionList(MarketplacePreparation.MarketplaceVehicleSectionList value) {
        this.marketplaceVehicleSectionList = value;
    }

    /**
     * Ruft den Wert der marketplaceTypeLineList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MarketplacePreparation.MarketplaceTypeLineList }
     *     
     */
    public MarketplacePreparation.MarketplaceTypeLineList getMarketplaceTypeLineList() {
        return marketplaceTypeLineList;
    }

    /**
     * Legt den Wert der marketplaceTypeLineList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketplacePreparation.MarketplaceTypeLineList }
     *     
     */
    public void setMarketplaceTypeLineList(MarketplacePreparation.MarketplaceTypeLineList value) {
        this.marketplaceTypeLineList = value;
    }

    /**
     * Ruft den Wert der marketplaceFuelConsumptionDataList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MarketplacePreparation.MarketplaceFuelConsumptionDataList }
     *     
     */
    public MarketplacePreparation.MarketplaceFuelConsumptionDataList getMarketplaceFuelConsumptionDataList() {
        return marketplaceFuelConsumptionDataList;
    }

    /**
     * Legt den Wert der marketplaceFuelConsumptionDataList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketplacePreparation.MarketplaceFuelConsumptionDataList }
     *     
     */
    public void setMarketplaceFuelConsumptionDataList(MarketplacePreparation.MarketplaceFuelConsumptionDataList value) {
        this.marketplaceFuelConsumptionDataList = value;
    }

    /**
     * Ruft den Wert der marketplaceFuelAccordingEnVkVList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MarketplacePreparation.MarketplaceFuelAccordingEnVkVList }
     *     
     */
    public MarketplacePreparation.MarketplaceFuelAccordingEnVkVList getMarketplaceFuelAccordingEnVkVList() {
        return marketplaceFuelAccordingEnVkVList;
    }

    /**
     * Legt den Wert der marketplaceFuelAccordingEnVkVList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketplacePreparation.MarketplaceFuelAccordingEnVkVList }
     *     
     */
    public void setMarketplaceFuelAccordingEnVkVList(MarketplacePreparation.MarketplaceFuelAccordingEnVkVList value) {
        this.marketplaceFuelAccordingEnVkVList = value;
    }

    /**
     * Ruft den Wert der marketplaceColorInteriorFittingsList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MarketplacePreparation.MarketplaceColorInteriorFittingsList }
     *     
     */
    public MarketplacePreparation.MarketplaceColorInteriorFittingsList getMarketplaceColorInteriorFittingsList() {
        return marketplaceColorInteriorFittingsList;
    }

    /**
     * Legt den Wert der marketplaceColorInteriorFittingsList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketplacePreparation.MarketplaceColorInteriorFittingsList }
     *     
     */
    public void setMarketplaceColorInteriorFittingsList(MarketplacePreparation.MarketplaceColorInteriorFittingsList value) {
        this.marketplaceColorInteriorFittingsList = value;
    }

    /**
     * Ruft den Wert der generalInspection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getGeneralInspection() {
        return generalInspection;
    }

    /**
     * Legt den Wert der generalInspection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setGeneralInspection(FieldString value) {
        this.generalInspection = value;
    }

    /**
     * Ruft den Wert der generalInspectionNewFlag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getGeneralInspectionNewFlag() {
        return generalInspectionNewFlag;
    }

    /**
     * Legt den Wert der generalInspectionNewFlag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setGeneralInspectionNewFlag(FieldBoolean value) {
        this.generalInspectionNewFlag = value;
    }

    /**
     * Ruft den Wert der withFullServiceHistoryFlag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getWithFullServiceHistoryFlag() {
        return withFullServiceHistoryFlag;
    }

    /**
     * Legt den Wert der withFullServiceHistoryFlag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setWithFullServiceHistoryFlag(FieldBoolean value) {
        this.withFullServiceHistoryFlag = value;
    }

    /**
     * Ruft den Wert der marketplaceAccidentalDamageList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MarketplacePreparation.MarketplaceAccidentalDamageList }
     *     
     */
    public MarketplacePreparation.MarketplaceAccidentalDamageList getMarketplaceAccidentalDamageList() {
        return marketplaceAccidentalDamageList;
    }

    /**
     * Legt den Wert der marketplaceAccidentalDamageList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketplacePreparation.MarketplaceAccidentalDamageList }
     *     
     */
    public void setMarketplaceAccidentalDamageList(MarketplacePreparation.MarketplaceAccidentalDamageList value) {
        this.marketplaceAccidentalDamageList = value;
    }

    /**
     * Ruft den Wert der descriptionAccidentalDamage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDescriptionAccidentalDamage() {
        return descriptionAccidentalDamage;
    }

    /**
     * Legt den Wert der descriptionAccidentalDamage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDescriptionAccidentalDamage(FieldString value) {
        this.descriptionAccidentalDamage = value;
    }

    /**
     * Ruft den Wert der dealerCarFlag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getDealerCarFlag() {
        return dealerCarFlag;
    }

    /**
     * Legt den Wert der dealerCarFlag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setDealerCarFlag(FieldBoolean value) {
        this.dealerCarFlag = value;
    }

    /**
     * Ruft den Wert der marketplaceWarrantyList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MarketplacePreparation.MarketplaceWarrantyList }
     *     
     */
    public MarketplacePreparation.MarketplaceWarrantyList getMarketplaceWarrantyList() {
        return marketplaceWarrantyList;
    }

    /**
     * Legt den Wert der marketplaceWarrantyList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketplacePreparation.MarketplaceWarrantyList }
     *     
     */
    public void setMarketplaceWarrantyList(MarketplacePreparation.MarketplaceWarrantyList value) {
        this.marketplaceWarrantyList = value;
    }

    /**
     * Ruft den Wert der equipmentFormat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getEquipmentFormat() {
        return equipmentFormat;
    }

    /**
     * Legt den Wert der equipmentFormat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setEquipmentFormat(FieldString value) {
        this.equipmentFormat = value;
    }

    /**
     * Ruft den Wert der equipmentSorting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getEquipmentSorting() {
        return equipmentSorting;
    }

    /**
     * Legt den Wert der equipmentSorting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setEquipmentSorting(FieldString value) {
        this.equipmentSorting = value;
    }

    /**
     * Ruft den Wert der marketplaceEquipmentGroupList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MarketplacePreparation.MarketplaceEquipmentGroupList }
     *     
     */
    public MarketplacePreparation.MarketplaceEquipmentGroupList getMarketplaceEquipmentGroupList() {
        return marketplaceEquipmentGroupList;
    }

    /**
     * Legt den Wert der marketplaceEquipmentGroupList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketplacePreparation.MarketplaceEquipmentGroupList }
     *     
     */
    public void setMarketplaceEquipmentGroupList(MarketplacePreparation.MarketplaceEquipmentGroupList value) {
        this.marketplaceEquipmentGroupList = value;
    }

    /**
     * Ruft den Wert der marketplaceEquipmentGroupListN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MarketplacePreparation.MarketplaceEquipmentGroupListN }
     *     
     */
    public MarketplacePreparation.MarketplaceEquipmentGroupListN getMarketplaceEquipmentGroupListN() {
        return marketplaceEquipmentGroupListN;
    }

    /**
     * Legt den Wert der marketplaceEquipmentGroupListN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketplacePreparation.MarketplaceEquipmentGroupListN }
     *     
     */
    public void setMarketplaceEquipmentGroupListN(MarketplacePreparation.MarketplaceEquipmentGroupListN value) {
        this.marketplaceEquipmentGroupListN = value;
    }

    /**
     * Ruft den Wert der introductionText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getIntroductionText() {
        return introductionText;
    }

    /**
     * Legt den Wert der introductionText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setIntroductionText(FieldString value) {
        this.introductionText = value;
    }

    /**
     * Ruft den Wert der finalText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getFinalText() {
        return finalText;
    }

    /**
     * Legt den Wert der finalText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setFinalText(FieldString value) {
        this.finalText = value;
    }

    /**
     * Ruft den Wert der mpConfigIntroText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getMPConfigIntroText() {
        return mpConfigIntroText;
    }

    /**
     * Legt den Wert der mpConfigIntroText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setMPConfigIntroText(FieldString value) {
        this.mpConfigIntroText = value;
    }

    /**
     * Ruft den Wert der mpConfigFinalText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getMPConfigFinalText() {
        return mpConfigFinalText;
    }

    /**
     * Legt den Wert der mpConfigFinalText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setMPConfigFinalText(FieldString value) {
        this.mpConfigFinalText = value;
    }

    /**
     * Ruft den Wert der mpConfigIntroTextList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MarketplacePreparation.MPConfigIntroTextList }
     *     
     */
    public MarketplacePreparation.MPConfigIntroTextList getMPConfigIntroTextList() {
        return mpConfigIntroTextList;
    }

    /**
     * Legt den Wert der mpConfigIntroTextList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketplacePreparation.MPConfigIntroTextList }
     *     
     */
    public void setMPConfigIntroTextList(MarketplacePreparation.MPConfigIntroTextList value) {
        this.mpConfigIntroTextList = value;
    }

    /**
     * Ruft den Wert der mpConfigFinalTextList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MarketplacePreparation.MPConfigFinalTextList }
     *     
     */
    public MarketplacePreparation.MPConfigFinalTextList getMPConfigFinalTextList() {
        return mpConfigFinalTextList;
    }

    /**
     * Legt den Wert der mpConfigFinalTextList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketplacePreparation.MPConfigFinalTextList }
     *     
     */
    public void setMPConfigFinalTextList(MarketplacePreparation.MPConfigFinalTextList value) {
        this.mpConfigFinalTextList = value;
    }


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
     *         &lt;element ref="{http://www.dat.de/vxs}TextItem" maxOccurs="unbounded" minOccurs="0"/>
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
        "textItem"
    })
    public static class MPConfigFinalTextList {

        @XmlElement(name = "TextItem")
        protected List<TextItem> textItem;

        /**
         * Gets the value of the textItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the textItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTextItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TextItem }
         * 
         * 
         */
        public List<TextItem> getTextItem() {
            if (textItem == null) {
                textItem = new ArrayList<TextItem>();
            }
            return this.textItem;
        }

    }


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
     *         &lt;element ref="{http://www.dat.de/vxs}TextItem" maxOccurs="unbounded" minOccurs="0"/>
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
        "textItem"
    })
    public static class MPConfigIntroTextList {

        @XmlElement(name = "TextItem")
        protected List<TextItem> textItem;

        /**
         * Gets the value of the textItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the textItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTextItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TextItem }
         * 
         * 
         */
        public List<TextItem> getTextItem() {
            if (textItem == null) {
                textItem = new ArrayList<TextItem>();
            }
            return this.textItem;
        }

    }


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
     *         &lt;element name="AccidentalDamageItem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
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
        "accidentalDamageItem"
    })
    public static class MarketplaceAccidentalDamageList {

        @XmlElement(name = "AccidentalDamageItem")
        protected List<String> accidentalDamageItem;

        /**
         * Gets the value of the accidentalDamageItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accidentalDamageItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccidentalDamageItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAccidentalDamageItem() {
            if (accidentalDamageItem == null) {
                accidentalDamageItem = new ArrayList<String>();
            }
            return this.accidentalDamageItem;
        }

    }


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
     *         &lt;element name="AreaItem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
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
        "areaItem"
    })
    public static class MarketplaceAreaList {

        @XmlElement(name = "AreaItem")
        protected List<String> areaItem;

        /**
         * Gets the value of the areaItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the areaItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAreaItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAreaItem() {
            if (areaItem == null) {
                areaItem = new ArrayList<String>();
            }
            return this.areaItem;
        }

    }


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
     *         &lt;element name="ColorInteriorFittingsItem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
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
        "colorInteriorFittingsItem"
    })
    public static class MarketplaceColorInteriorFittingsList {

        @XmlElement(name = "ColorInteriorFittingsItem")
        protected List<String> colorInteriorFittingsItem;

        /**
         * Gets the value of the colorInteriorFittingsItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the colorInteriorFittingsItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getColorInteriorFittingsItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getColorInteriorFittingsItem() {
            if (colorInteriorFittingsItem == null) {
                colorInteriorFittingsItem = new ArrayList<String>();
            }
            return this.colorInteriorFittingsItem;
        }

    }


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
     *         &lt;element ref="{http://www.dat.de/vxs}EquipmentGroupItem" minOccurs="0"/>
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
        "equipmentGroupItem"
    })
    public static class MarketplaceEquipmentGroupList {

        @XmlElement(name = "EquipmentGroupItem")
        protected EquipmentGroupItem equipmentGroupItem;

        /**
         * Ruft den Wert der equipmentGroupItem-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link EquipmentGroupItem }
         *     
         */
        public EquipmentGroupItem getEquipmentGroupItem() {
            return equipmentGroupItem;
        }

        /**
         * Legt den Wert der equipmentGroupItem-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link EquipmentGroupItem }
         *     
         */
        public void setEquipmentGroupItem(EquipmentGroupItem value) {
            this.equipmentGroupItem = value;
        }

    }


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
     *         &lt;element ref="{http://www.dat.de/vxs}EquipmentGroupItem" maxOccurs="unbounded" minOccurs="0"/>
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
        "equipmentGroupItem"
    })
    public static class MarketplaceEquipmentGroupListN {

        @XmlElement(name = "EquipmentGroupItem")
        protected List<EquipmentGroupItem> equipmentGroupItem;

        /**
         * Gets the value of the equipmentGroupItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the equipmentGroupItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEquipmentGroupItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EquipmentGroupItem }
         * 
         * 
         */
        public List<EquipmentGroupItem> getEquipmentGroupItem() {
            if (equipmentGroupItem == null) {
                equipmentGroupItem = new ArrayList<EquipmentGroupItem>();
            }
            return this.equipmentGroupItem;
        }

    }


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
     *         &lt;element name="FuelAccordingEnVkVItem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
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
        "fuelAccordingEnVkVItem"
    })
    public static class MarketplaceFuelAccordingEnVkVList {

        @XmlElement(name = "FuelAccordingEnVkVItem")
        protected List<String> fuelAccordingEnVkVItem;

        /**
         * Gets the value of the fuelAccordingEnVkVItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fuelAccordingEnVkVItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFuelAccordingEnVkVItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFuelAccordingEnVkVItem() {
            if (fuelAccordingEnVkVItem == null) {
                fuelAccordingEnVkVItem = new ArrayList<String>();
            }
            return this.fuelAccordingEnVkVItem;
        }

    }


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
     *         &lt;element name="FuelConsumptionDataItem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
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
        "fuelConsumptionDataItem"
    })
    public static class MarketplaceFuelConsumptionDataList {

        @XmlElement(name = "FuelConsumptionDataItem")
        protected List<String> fuelConsumptionDataItem;

        /**
         * Gets the value of the fuelConsumptionDataItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fuelConsumptionDataItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFuelConsumptionDataItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFuelConsumptionDataItem() {
            if (fuelConsumptionDataItem == null) {
                fuelConsumptionDataItem = new ArrayList<String>();
            }
            return this.fuelConsumptionDataItem;
        }

    }


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
     *         &lt;element name="ManufacturerItem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
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
        "manufacturerItem"
    })
    public static class MarketplaceManufacturerList {

        @XmlElement(name = "ManufacturerItem")
        protected List<String> manufacturerItem;

        /**
         * Gets the value of the manufacturerItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the manufacturerItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getManufacturerItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getManufacturerItem() {
            if (manufacturerItem == null) {
                manufacturerItem = new ArrayList<String>();
            }
            return this.manufacturerItem;
        }

    }


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
     *         &lt;element name="ModelGroupItem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
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
        "modelGroupItem"
    })
    public static class MarketplaceModelGroupList {

        @XmlElement(name = "ModelGroupItem")
        protected List<String> modelGroupItem;

        /**
         * Gets the value of the modelGroupItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modelGroupItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getModelGroupItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getModelGroupItem() {
            if (modelGroupItem == null) {
                modelGroupItem = new ArrayList<String>();
            }
            return this.modelGroupItem;
        }

    }


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
     *         &lt;element name="ModelItem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
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
        "modelItem"
    })
    public static class MarketplaceModelList {

        @XmlElement(name = "ModelItem")
        protected List<String> modelItem;

        /**
         * Gets the value of the modelItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modelItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getModelItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getModelItem() {
            if (modelItem == null) {
                modelItem = new ArrayList<String>();
            }
            return this.modelItem;
        }

    }


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
     *         &lt;element name="TypeLineItem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
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
        "typeLineItem"
    })
    public static class MarketplaceTypeLineList {

        @XmlElement(name = "TypeLineItem")
        protected List<String> typeLineItem;

        /**
         * Gets the value of the typeLineItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the typeLineItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTypeLineItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTypeLineItem() {
            if (typeLineItem == null) {
                typeLineItem = new ArrayList<String>();
            }
            return this.typeLineItem;
        }

    }


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
     *         &lt;element name="VehicleSelectionItem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
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
        "vehicleSelectionItem"
    })
    public static class MarketplaceVehicleSectionList {

        @XmlElement(name = "VehicleSelectionItem")
        protected List<String> vehicleSelectionItem;

        /**
         * Gets the value of the vehicleSelectionItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehicleSelectionItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehicleSelectionItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getVehicleSelectionItem() {
            if (vehicleSelectionItem == null) {
                vehicleSelectionItem = new ArrayList<String>();
            }
            return this.vehicleSelectionItem;
        }

    }


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
     *         &lt;element name="WarrantyItem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
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
        "warrantyItem"
    })
    public static class MarketplaceWarrantyList {

        @XmlElement(name = "WarrantyItem")
        protected List<String> warrantyItem;

        /**
         * Gets the value of the warrantyItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the warrantyItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWarrantyItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getWarrantyItem() {
            if (warrantyItem == null) {
                warrantyItem = new ArrayList<String>();
            }
            return this.warrantyItem;
        }

    }

}
