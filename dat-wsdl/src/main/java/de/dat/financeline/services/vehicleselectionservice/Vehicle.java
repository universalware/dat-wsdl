
package de.dat.financeline.services.vehicleselectionservice;

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
 *         &lt;element name="VehicleIdentNumber" type="{http://www.dat.de/vxs}fieldString17" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatECode" type="{http://www.dat.de/vxs}fieldString15" minOccurs="0" form="qualified"/>
 *         &lt;element name="Container" type="{http://www.dat.de/vxs}fieldString5" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConstructionYear" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatConstructionYear" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConstructionMonth" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConstructionTime" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConstructionTimeFrom" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConstructionTimeTo" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConstructionTimePriceList" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="InitialRegistration" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="RecentRegistration" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="MileageEstimated" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="MileageOdometer" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="MileageAccordingUser" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="MileageComment" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="SalesDescription" type="{http://www.dat.de/vxs}fieldString4000" minOccurs="0" form="qualified"/>
 *         &lt;element name="VehicleTypeName" type="{http://www.dat.de/vxs}fieldString80" minOccurs="0" form="qualified"/>
 *         &lt;element name="VehicleTypeNameN" type="{http://www.dat.de/vxs}fieldString80" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatVehicleTypeNameN" type="{http://www.dat.de/vxs}fieldString80" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManufacturerName" type="{http://www.dat.de/vxs}fieldString80" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatManufacturerName" type="{http://www.dat.de/vxs}fieldString80" minOccurs="0" form="qualified"/>
 *         &lt;element name="BaseModelName" type="{http://www.dat.de/vxs}fieldString80" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatBaseModelName" type="{http://www.dat.de/vxs}fieldString80" minOccurs="0" form="qualified"/>
 *         &lt;element name="SubModelName" type="{http://www.dat.de/vxs}fieldString80" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatSubModelName" type="{http://www.dat.de/vxs}fieldString80" minOccurs="0" form="qualified"/>
 *         &lt;element name="EngineNameManual" type="{http://www.dat.de/vxs}fieldString80" minOccurs="0" form="qualified"/>
 *         &lt;element name="BodyNameManual" type="{http://www.dat.de/vxs}fieldString80" minOccurs="0" form="qualified"/>
 *         &lt;element name="WheelbaseNameManual" type="{http://www.dat.de/vxs}fieldString80" minOccurs="0" form="qualified"/>
 *         &lt;element name="PropulsionNameManual" type="{http://www.dat.de/vxs}fieldString80" minOccurs="0" form="qualified"/>
 *         &lt;element name="DrivingCabNameManual" type="{http://www.dat.de/vxs}fieldString80" minOccurs="0" form="qualified"/>
 *         &lt;element name="TonnageNameManual" type="{http://www.dat.de/vxs}fieldString80" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConstructionNameManual" type="{http://www.dat.de/vxs}fieldString80" minOccurs="0" form="qualified"/>
 *         &lt;element name="SuspensionNameManual" type="{http://www.dat.de/vxs}fieldString80" minOccurs="0" form="qualified"/>
 *         &lt;element name="AxleCountNameManual" type="{http://www.dat.de/vxs}fieldString80" minOccurs="0" form="qualified"/>
 *         &lt;element name="EquipmentLineNameManual" type="{http://www.dat.de/vxs}fieldString80" minOccurs="0" form="qualified"/>
 *         &lt;element name="GearboxNameManual" type="{http://www.dat.de/vxs}fieldString80" minOccurs="0" form="qualified"/>
 *         &lt;element name="ContainerName" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ContainerNameN" type="{http://www.dat.de/vxs}fieldString80" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatContainerNameN" type="{http://www.dat.de/vxs}fieldString80" minOccurs="0" form="qualified"/>
 *         &lt;element name="MainTypeGroupName" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="VehicleType" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="Manufacturer" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="BaseModel" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="AlternativeVehicleType" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="AlternativeManufacturer" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="AlternativeBaseModel" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="SubModel" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="AlternativeSubModel" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="MainTypeGroup" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="IdentificationSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="isDisengaged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="withoutDistinctionEquStandardSpecial" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VinAccuracy" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="VinActive" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="VinEquipmentChanged" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="VinChecksum" type="{http://www.dat.de/vxs}fieldCharacter" minOccurs="0" form="qualified"/>
 *         &lt;element name="ReleaseIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="KbaNumbersN" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="KbaNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NationalCodeAustria" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NationalCodeAustria" type="{http://www.dat.de/vxs}fieldString6" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TypeOfConstruction" type="{http://www.dat.de/vxs}fieldString40" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConstructionYearManual" type="{http://www.dat.de/vxs}fieldString40" minOccurs="0" form="qualified"/>
 *         &lt;element name="ColorScheme" type="{http://www.dat.de/vxs}fieldString3" minOccurs="0" form="qualified"/>
 *         &lt;element name="ColorSchemeManual" type="{http://www.dat.de/vxs}fieldString30" minOccurs="0" form="qualified"/>
 *         &lt;element name="ColorVariant" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PaintTypes" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PaintType" type="{http://www.dat.de/vxs}fieldString2" maxOccurs="unbounded" form="qualified"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GeneralInspectionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="LastRegistration" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManufacturerOrderKey" type="{http://www.dat.de/vxs}fieldString30" minOccurs="0" form="qualified"/>
 *         &lt;element name="MidTermReviewDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="SubModelVariant" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="TokenColorScheme" type="{http://www.dat.de/vxs}fieldString3" minOccurs="0" form="qualified"/>
 *         &lt;element name="VehicleTypeAUFromKba" type="{http://www.dat.de/vxs}fieldString50" minOccurs="0" form="qualified"/>
 *         &lt;element name="VehicleTypeFromKba" type="{http://www.dat.de/vxs}fieldString50" minOccurs="0" form="qualified"/>
 *         &lt;element name="VehicleTypeFromManufacturer" type="{http://www.dat.de/vxs}fieldString50" minOccurs="0" form="qualified"/>
 *         &lt;element name="Colorcode" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="MainTypeSubstitution" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SubTypeSubstitution" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="NextVehicleInspection" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="OriginalPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatOriginalPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="OriginalPriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatOriginalPriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="RentalCarClass" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}RegistrationData" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}OriginalPriceInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}Engine" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}Maintenance" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}RunningExpenses" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}TechInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}Equipment" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}Tires" minOccurs="0"/>
 *         &lt;element name="DATECodeEquipment" type="{http://www.dat.de/vxs}equipSequence" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}VINResult" minOccurs="0"/>
 *         &lt;element name="UpperBodies" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.dat.de/vxs}UpperBody" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.dat.de/vxs}DomusVehicleData" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}VehicleDataItaly" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}MetaPositions" minOccurs="0"/>
 *         &lt;element name="BuildYear" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="OperatingHours" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="MileageInMiles" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="LastVehicleInspection" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="VehicleCondition" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "Vehicle")
public class Vehicle {

    @XmlElement(name = "VehicleIdentNumber")
    protected FieldString17 vehicleIdentNumber;
    @XmlElement(name = "DatECode")
    protected FieldString15 datECode;
    @XmlElement(name = "Container")
    protected FieldString5 container;
    @XmlElement(name = "ConstructionYear")
    protected FieldInteger constructionYear;
    @XmlElement(name = "DatConstructionYear")
    protected FieldInteger datConstructionYear;
    @XmlElement(name = "ConstructionMonth")
    protected FieldInteger constructionMonth;
    @XmlElement(name = "ConstructionTime")
    protected FieldInteger constructionTime;
    @XmlElement(name = "ConstructionTimeFrom")
    protected FieldInteger constructionTimeFrom;
    @XmlElement(name = "ConstructionTimeTo")
    protected FieldInteger constructionTimeTo;
    @XmlElement(name = "ConstructionTimePriceList")
    protected FieldInteger constructionTimePriceList;
    @XmlElement(name = "InitialRegistration")
    protected FieldDate initialRegistration;
    @XmlElement(name = "RecentRegistration")
    protected FieldDate recentRegistration;
    @XmlElement(name = "MileageEstimated")
    protected FieldInteger mileageEstimated;
    @XmlElement(name = "MileageOdometer")
    protected FieldInteger mileageOdometer;
    @XmlElement(name = "MileageAccordingUser")
    protected FieldDecimal mileageAccordingUser;
    @XmlElement(name = "MileageComment")
    protected FieldString mileageComment;
    @XmlElement(name = "SalesDescription")
    protected FieldString4000 salesDescription;
    @XmlElement(name = "VehicleTypeName")
    protected FieldString80 vehicleTypeName;
    @XmlElement(name = "VehicleTypeNameN")
    protected FieldString80 vehicleTypeNameN;
    @XmlElement(name = "DatVehicleTypeNameN")
    protected FieldString80 datVehicleTypeNameN;
    @XmlElement(name = "ManufacturerName")
    protected FieldString80 manufacturerName;
    @XmlElement(name = "DatManufacturerName")
    protected FieldString80 datManufacturerName;
    @XmlElement(name = "BaseModelName")
    protected FieldString80 baseModelName;
    @XmlElement(name = "DatBaseModelName")
    protected FieldString80 datBaseModelName;
    @XmlElement(name = "SubModelName")
    protected FieldString80 subModelName;
    @XmlElement(name = "DatSubModelName")
    protected FieldString80 datSubModelName;
    @XmlElement(name = "EngineNameManual")
    protected FieldString80 engineNameManual;
    @XmlElement(name = "BodyNameManual")
    protected FieldString80 bodyNameManual;
    @XmlElement(name = "WheelbaseNameManual")
    protected FieldString80 wheelbaseNameManual;
    @XmlElement(name = "PropulsionNameManual")
    protected FieldString80 propulsionNameManual;
    @XmlElement(name = "DrivingCabNameManual")
    protected FieldString80 drivingCabNameManual;
    @XmlElement(name = "TonnageNameManual")
    protected FieldString80 tonnageNameManual;
    @XmlElement(name = "ConstructionNameManual")
    protected FieldString80 constructionNameManual;
    @XmlElement(name = "SuspensionNameManual")
    protected FieldString80 suspensionNameManual;
    @XmlElement(name = "AxleCountNameManual")
    protected FieldString80 axleCountNameManual;
    @XmlElement(name = "EquipmentLineNameManual")
    protected FieldString80 equipmentLineNameManual;
    @XmlElement(name = "GearboxNameManual")
    protected FieldString80 gearboxNameManual;
    @XmlElement(name = "ContainerName")
    protected FieldString containerName;
    @XmlElement(name = "ContainerNameN")
    protected FieldString80 containerNameN;
    @XmlElement(name = "DatContainerNameN")
    protected FieldString80 datContainerNameN;
    @XmlElement(name = "MainTypeGroupName")
    protected FieldString mainTypeGroupName;
    @XmlElement(name = "VehicleType")
    protected FieldInteger vehicleType;
    @XmlElement(name = "Manufacturer")
    protected FieldInteger manufacturer;
    @XmlElement(name = "BaseModel")
    protected FieldInteger baseModel;
    @XmlElement(name = "AlternativeVehicleType")
    protected FieldInteger alternativeVehicleType;
    @XmlElement(name = "AlternativeManufacturer")
    protected FieldInteger alternativeManufacturer;
    @XmlElement(name = "AlternativeBaseModel")
    protected FieldInteger alternativeBaseModel;
    @XmlElement(name = "SubModel")
    protected FieldInteger subModel;
    @XmlElement(name = "AlternativeSubModel")
    protected FieldInteger alternativeSubModel;
    @XmlElement(name = "MainTypeGroup")
    protected FieldString mainTypeGroup;
    @XmlElement(name = "IdentificationSource")
    protected String identificationSource;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(namespace = "")
    protected Boolean isDisengaged;
    @XmlElement(namespace = "")
    protected Boolean withoutDistinctionEquStandardSpecial;
    @XmlElement(name = "VinAccuracy")
    protected FieldInteger vinAccuracy;
    @XmlElement(name = "VinActive")
    protected FieldBoolean vinActive;
    @XmlElement(name = "VinEquipmentChanged")
    protected FieldBoolean vinEquipmentChanged;
    @XmlElement(name = "VinChecksum")
    protected FieldCharacter vinChecksum;
    @XmlElement(name = "ReleaseIndicator")
    protected String releaseIndicator;
    @XmlElement(name = "KbaNumbersN")
    protected Vehicle.KbaNumbersN kbaNumbersN;
    @XmlElement(name = "NationalCodeAustria")
    protected Vehicle.NationalCodeAustria nationalCodeAustria;
    @XmlElement(name = "TypeOfConstruction")
    protected FieldString40 typeOfConstruction;
    @XmlElement(name = "ConstructionYearManual")
    protected FieldString40 constructionYearManual;
    @XmlElement(name = "ColorScheme")
    protected FieldString3 colorScheme;
    @XmlElement(name = "ColorSchemeManual")
    protected FieldString30 colorSchemeManual;
    @XmlElement(name = "ColorVariant")
    protected FieldString colorVariant;
    @XmlElement(name = "PaintTypes")
    protected Vehicle.PaintTypes paintTypes;
    @XmlElement(name = "GeneralInspectionDate")
    protected String generalInspectionDate;
    @XmlElement(name = "LastRegistration")
    protected FieldDate lastRegistration;
    @XmlElement(name = "ManufacturerOrderKey")
    protected FieldString30 manufacturerOrderKey;
    @XmlElement(name = "MidTermReviewDate")
    protected FieldDate midTermReviewDate;
    @XmlElement(name = "SubModelVariant")
    protected FieldInteger subModelVariant;
    @XmlElement(name = "TokenColorScheme")
    protected FieldString3 tokenColorScheme;
    @XmlElement(name = "VehicleTypeAUFromKba")
    protected FieldString50 vehicleTypeAUFromKba;
    @XmlElement(name = "VehicleTypeFromKba")
    protected FieldString50 vehicleTypeFromKba;
    @XmlElement(name = "VehicleTypeFromManufacturer")
    protected FieldString50 vehicleTypeFromManufacturer;
    @XmlElement(name = "Colorcode")
    protected FieldInteger colorcode;
    @XmlElement(name = "MainTypeSubstitution")
    protected FieldDecimal mainTypeSubstitution;
    @XmlElement(name = "SubTypeSubstitution")
    protected FieldInteger subTypeSubstitution;
    @XmlElement(name = "NextVehicleInspection")
    protected FieldDate nextVehicleInspection;
    @XmlElement(name = "OriginalPrice")
    protected FieldDecimal originalPrice;
    @XmlElement(name = "DatOriginalPrice")
    protected FieldDecimal datOriginalPrice;
    @XmlElement(name = "OriginalPriceGross")
    protected FieldDecimal originalPriceGross;
    @XmlElement(name = "DatOriginalPriceGross")
    protected FieldDecimal datOriginalPriceGross;
    @XmlElement(name = "RentalCarClass")
    protected FieldInteger rentalCarClass;
    @XmlElement(name = "RegistrationData")
    protected RegistrationData registrationData;
    @XmlElement(name = "OriginalPriceInfo")
    protected OriginalPriceInfo originalPriceInfo;
    @XmlElement(name = "Engine")
    protected Engine engine;
    @XmlElement(name = "Maintenance")
    protected Maintenance maintenance;
    @XmlElement(name = "RunningExpenses")
    protected RunningExpenses runningExpenses;
    @XmlElement(name = "TechInfo")
    protected TechInfo techInfo;
    @XmlElement(name = "Equipment")
    protected Equipment equipment;
    @XmlElement(name = "Tires")
    protected Tires tires;
    @XmlElement(name = "DATECodeEquipment")
    protected EquipSequence dateCodeEquipment;
    @XmlElement(name = "VINResult")
    protected VINResult vinResult;
    @XmlElement(name = "UpperBodies")
    protected Vehicle.UpperBodies upperBodies;
    @XmlElement(name = "DomusVehicleData")
    protected DomusVehicleData domusVehicleData;
    @XmlElement(name = "VehicleDataItaly")
    protected VehicleDataItaly vehicleDataItaly;
    @XmlElement(name = "MetaPositions")
    protected MetaPositions metaPositions;
    @XmlElement(name = "BuildYear")
    protected FieldInteger buildYear;
    @XmlElement(name = "OperatingHours")
    protected FieldInteger operatingHours;
    @XmlElement(name = "MileageInMiles")
    protected FieldInteger mileageInMiles;
    @XmlElement(name = "LastVehicleInspection")
    protected FieldDate lastVehicleInspection;
    @XmlElement(name = "VehicleCondition")
    protected FieldString vehicleCondition;

    /**
     * Ruft den Wert der vehicleIdentNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString17 }
     *     
     */
    public FieldString17 getVehicleIdentNumber() {
        return vehicleIdentNumber;
    }

    /**
     * Legt den Wert der vehicleIdentNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString17 }
     *     
     */
    public void setVehicleIdentNumber(FieldString17 value) {
        this.vehicleIdentNumber = value;
    }

    /**
     * Ruft den Wert der datECode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString15 }
     *     
     */
    public FieldString15 getDatECode() {
        return datECode;
    }

    /**
     * Legt den Wert der datECode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString15 }
     *     
     */
    public void setDatECode(FieldString15 value) {
        this.datECode = value;
    }

    /**
     * Ruft den Wert der container-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString5 }
     *     
     */
    public FieldString5 getContainer() {
        return container;
    }

    /**
     * Legt den Wert der container-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString5 }
     *     
     */
    public void setContainer(FieldString5 value) {
        this.container = value;
    }

    /**
     * Ruft den Wert der constructionYear-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getConstructionYear() {
        return constructionYear;
    }

    /**
     * Legt den Wert der constructionYear-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setConstructionYear(FieldInteger value) {
        this.constructionYear = value;
    }

    /**
     * Ruft den Wert der datConstructionYear-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatConstructionYear() {
        return datConstructionYear;
    }

    /**
     * Legt den Wert der datConstructionYear-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatConstructionYear(FieldInteger value) {
        this.datConstructionYear = value;
    }

    /**
     * Ruft den Wert der constructionMonth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getConstructionMonth() {
        return constructionMonth;
    }

    /**
     * Legt den Wert der constructionMonth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setConstructionMonth(FieldInteger value) {
        this.constructionMonth = value;
    }

    /**
     * Ruft den Wert der constructionTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getConstructionTime() {
        return constructionTime;
    }

    /**
     * Legt den Wert der constructionTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setConstructionTime(FieldInteger value) {
        this.constructionTime = value;
    }

    /**
     * Ruft den Wert der constructionTimeFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getConstructionTimeFrom() {
        return constructionTimeFrom;
    }

    /**
     * Legt den Wert der constructionTimeFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setConstructionTimeFrom(FieldInteger value) {
        this.constructionTimeFrom = value;
    }

    /**
     * Ruft den Wert der constructionTimeTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getConstructionTimeTo() {
        return constructionTimeTo;
    }

    /**
     * Legt den Wert der constructionTimeTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setConstructionTimeTo(FieldInteger value) {
        this.constructionTimeTo = value;
    }

    /**
     * Ruft den Wert der constructionTimePriceList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getConstructionTimePriceList() {
        return constructionTimePriceList;
    }

    /**
     * Legt den Wert der constructionTimePriceList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setConstructionTimePriceList(FieldInteger value) {
        this.constructionTimePriceList = value;
    }

    /**
     * Ruft den Wert der initialRegistration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getInitialRegistration() {
        return initialRegistration;
    }

    /**
     * Legt den Wert der initialRegistration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setInitialRegistration(FieldDate value) {
        this.initialRegistration = value;
    }

    /**
     * Ruft den Wert der recentRegistration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getRecentRegistration() {
        return recentRegistration;
    }

    /**
     * Legt den Wert der recentRegistration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setRecentRegistration(FieldDate value) {
        this.recentRegistration = value;
    }

    /**
     * Ruft den Wert der mileageEstimated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getMileageEstimated() {
        return mileageEstimated;
    }

    /**
     * Legt den Wert der mileageEstimated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setMileageEstimated(FieldInteger value) {
        this.mileageEstimated = value;
    }

    /**
     * Ruft den Wert der mileageOdometer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getMileageOdometer() {
        return mileageOdometer;
    }

    /**
     * Legt den Wert der mileageOdometer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setMileageOdometer(FieldInteger value) {
        this.mileageOdometer = value;
    }

    /**
     * Ruft den Wert der mileageAccordingUser-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getMileageAccordingUser() {
        return mileageAccordingUser;
    }

    /**
     * Legt den Wert der mileageAccordingUser-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setMileageAccordingUser(FieldDecimal value) {
        this.mileageAccordingUser = value;
    }

    /**
     * Ruft den Wert der mileageComment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getMileageComment() {
        return mileageComment;
    }

    /**
     * Legt den Wert der mileageComment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setMileageComment(FieldString value) {
        this.mileageComment = value;
    }

    /**
     * Ruft den Wert der salesDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString4000 }
     *     
     */
    public FieldString4000 getSalesDescription() {
        return salesDescription;
    }

    /**
     * Legt den Wert der salesDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString4000 }
     *     
     */
    public void setSalesDescription(FieldString4000 value) {
        this.salesDescription = value;
    }

    /**
     * Ruft den Wert der vehicleTypeName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString80 }
     *     
     */
    public FieldString80 getVehicleTypeName() {
        return vehicleTypeName;
    }

    /**
     * Legt den Wert der vehicleTypeName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString80 }
     *     
     */
    public void setVehicleTypeName(FieldString80 value) {
        this.vehicleTypeName = value;
    }

    /**
     * Ruft den Wert der vehicleTypeNameN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString80 }
     *     
     */
    public FieldString80 getVehicleTypeNameN() {
        return vehicleTypeNameN;
    }

    /**
     * Legt den Wert der vehicleTypeNameN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString80 }
     *     
     */
    public void setVehicleTypeNameN(FieldString80 value) {
        this.vehicleTypeNameN = value;
    }

    /**
     * Ruft den Wert der datVehicleTypeNameN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString80 }
     *     
     */
    public FieldString80 getDatVehicleTypeNameN() {
        return datVehicleTypeNameN;
    }

    /**
     * Legt den Wert der datVehicleTypeNameN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString80 }
     *     
     */
    public void setDatVehicleTypeNameN(FieldString80 value) {
        this.datVehicleTypeNameN = value;
    }

    /**
     * Ruft den Wert der manufacturerName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString80 }
     *     
     */
    public FieldString80 getManufacturerName() {
        return manufacturerName;
    }

    /**
     * Legt den Wert der manufacturerName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString80 }
     *     
     */
    public void setManufacturerName(FieldString80 value) {
        this.manufacturerName = value;
    }

    /**
     * Ruft den Wert der datManufacturerName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString80 }
     *     
     */
    public FieldString80 getDatManufacturerName() {
        return datManufacturerName;
    }

    /**
     * Legt den Wert der datManufacturerName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString80 }
     *     
     */
    public void setDatManufacturerName(FieldString80 value) {
        this.datManufacturerName = value;
    }

    /**
     * Ruft den Wert der baseModelName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString80 }
     *     
     */
    public FieldString80 getBaseModelName() {
        return baseModelName;
    }

    /**
     * Legt den Wert der baseModelName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString80 }
     *     
     */
    public void setBaseModelName(FieldString80 value) {
        this.baseModelName = value;
    }

    /**
     * Ruft den Wert der datBaseModelName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString80 }
     *     
     */
    public FieldString80 getDatBaseModelName() {
        return datBaseModelName;
    }

    /**
     * Legt den Wert der datBaseModelName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString80 }
     *     
     */
    public void setDatBaseModelName(FieldString80 value) {
        this.datBaseModelName = value;
    }

    /**
     * Ruft den Wert der subModelName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString80 }
     *     
     */
    public FieldString80 getSubModelName() {
        return subModelName;
    }

    /**
     * Legt den Wert der subModelName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString80 }
     *     
     */
    public void setSubModelName(FieldString80 value) {
        this.subModelName = value;
    }

    /**
     * Ruft den Wert der datSubModelName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString80 }
     *     
     */
    public FieldString80 getDatSubModelName() {
        return datSubModelName;
    }

    /**
     * Legt den Wert der datSubModelName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString80 }
     *     
     */
    public void setDatSubModelName(FieldString80 value) {
        this.datSubModelName = value;
    }

    /**
     * Ruft den Wert der engineNameManual-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString80 }
     *     
     */
    public FieldString80 getEngineNameManual() {
        return engineNameManual;
    }

    /**
     * Legt den Wert der engineNameManual-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString80 }
     *     
     */
    public void setEngineNameManual(FieldString80 value) {
        this.engineNameManual = value;
    }

    /**
     * Ruft den Wert der bodyNameManual-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString80 }
     *     
     */
    public FieldString80 getBodyNameManual() {
        return bodyNameManual;
    }

    /**
     * Legt den Wert der bodyNameManual-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString80 }
     *     
     */
    public void setBodyNameManual(FieldString80 value) {
        this.bodyNameManual = value;
    }

    /**
     * Ruft den Wert der wheelbaseNameManual-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString80 }
     *     
     */
    public FieldString80 getWheelbaseNameManual() {
        return wheelbaseNameManual;
    }

    /**
     * Legt den Wert der wheelbaseNameManual-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString80 }
     *     
     */
    public void setWheelbaseNameManual(FieldString80 value) {
        this.wheelbaseNameManual = value;
    }

    /**
     * Ruft den Wert der propulsionNameManual-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString80 }
     *     
     */
    public FieldString80 getPropulsionNameManual() {
        return propulsionNameManual;
    }

    /**
     * Legt den Wert der propulsionNameManual-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString80 }
     *     
     */
    public void setPropulsionNameManual(FieldString80 value) {
        this.propulsionNameManual = value;
    }

    /**
     * Ruft den Wert der drivingCabNameManual-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString80 }
     *     
     */
    public FieldString80 getDrivingCabNameManual() {
        return drivingCabNameManual;
    }

    /**
     * Legt den Wert der drivingCabNameManual-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString80 }
     *     
     */
    public void setDrivingCabNameManual(FieldString80 value) {
        this.drivingCabNameManual = value;
    }

    /**
     * Ruft den Wert der tonnageNameManual-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString80 }
     *     
     */
    public FieldString80 getTonnageNameManual() {
        return tonnageNameManual;
    }

    /**
     * Legt den Wert der tonnageNameManual-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString80 }
     *     
     */
    public void setTonnageNameManual(FieldString80 value) {
        this.tonnageNameManual = value;
    }

    /**
     * Ruft den Wert der constructionNameManual-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString80 }
     *     
     */
    public FieldString80 getConstructionNameManual() {
        return constructionNameManual;
    }

    /**
     * Legt den Wert der constructionNameManual-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString80 }
     *     
     */
    public void setConstructionNameManual(FieldString80 value) {
        this.constructionNameManual = value;
    }

    /**
     * Ruft den Wert der suspensionNameManual-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString80 }
     *     
     */
    public FieldString80 getSuspensionNameManual() {
        return suspensionNameManual;
    }

    /**
     * Legt den Wert der suspensionNameManual-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString80 }
     *     
     */
    public void setSuspensionNameManual(FieldString80 value) {
        this.suspensionNameManual = value;
    }

    /**
     * Ruft den Wert der axleCountNameManual-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString80 }
     *     
     */
    public FieldString80 getAxleCountNameManual() {
        return axleCountNameManual;
    }

    /**
     * Legt den Wert der axleCountNameManual-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString80 }
     *     
     */
    public void setAxleCountNameManual(FieldString80 value) {
        this.axleCountNameManual = value;
    }

    /**
     * Ruft den Wert der equipmentLineNameManual-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString80 }
     *     
     */
    public FieldString80 getEquipmentLineNameManual() {
        return equipmentLineNameManual;
    }

    /**
     * Legt den Wert der equipmentLineNameManual-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString80 }
     *     
     */
    public void setEquipmentLineNameManual(FieldString80 value) {
        this.equipmentLineNameManual = value;
    }

    /**
     * Ruft den Wert der gearboxNameManual-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString80 }
     *     
     */
    public FieldString80 getGearboxNameManual() {
        return gearboxNameManual;
    }

    /**
     * Legt den Wert der gearboxNameManual-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString80 }
     *     
     */
    public void setGearboxNameManual(FieldString80 value) {
        this.gearboxNameManual = value;
    }

    /**
     * Ruft den Wert der containerName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getContainerName() {
        return containerName;
    }

    /**
     * Legt den Wert der containerName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setContainerName(FieldString value) {
        this.containerName = value;
    }

    /**
     * Ruft den Wert der containerNameN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString80 }
     *     
     */
    public FieldString80 getContainerNameN() {
        return containerNameN;
    }

    /**
     * Legt den Wert der containerNameN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString80 }
     *     
     */
    public void setContainerNameN(FieldString80 value) {
        this.containerNameN = value;
    }

    /**
     * Ruft den Wert der datContainerNameN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString80 }
     *     
     */
    public FieldString80 getDatContainerNameN() {
        return datContainerNameN;
    }

    /**
     * Legt den Wert der datContainerNameN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString80 }
     *     
     */
    public void setDatContainerNameN(FieldString80 value) {
        this.datContainerNameN = value;
    }

    /**
     * Ruft den Wert der mainTypeGroupName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getMainTypeGroupName() {
        return mainTypeGroupName;
    }

    /**
     * Legt den Wert der mainTypeGroupName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setMainTypeGroupName(FieldString value) {
        this.mainTypeGroupName = value;
    }

    /**
     * Ruft den Wert der vehicleType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getVehicleType() {
        return vehicleType;
    }

    /**
     * Legt den Wert der vehicleType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setVehicleType(FieldInteger value) {
        this.vehicleType = value;
    }

    /**
     * Ruft den Wert der manufacturer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getManufacturer() {
        return manufacturer;
    }

    /**
     * Legt den Wert der manufacturer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setManufacturer(FieldInteger value) {
        this.manufacturer = value;
    }

    /**
     * Ruft den Wert der baseModel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getBaseModel() {
        return baseModel;
    }

    /**
     * Legt den Wert der baseModel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setBaseModel(FieldInteger value) {
        this.baseModel = value;
    }

    /**
     * Ruft den Wert der alternativeVehicleType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getAlternativeVehicleType() {
        return alternativeVehicleType;
    }

    /**
     * Legt den Wert der alternativeVehicleType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setAlternativeVehicleType(FieldInteger value) {
        this.alternativeVehicleType = value;
    }

    /**
     * Ruft den Wert der alternativeManufacturer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getAlternativeManufacturer() {
        return alternativeManufacturer;
    }

    /**
     * Legt den Wert der alternativeManufacturer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setAlternativeManufacturer(FieldInteger value) {
        this.alternativeManufacturer = value;
    }

    /**
     * Ruft den Wert der alternativeBaseModel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getAlternativeBaseModel() {
        return alternativeBaseModel;
    }

    /**
     * Legt den Wert der alternativeBaseModel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setAlternativeBaseModel(FieldInteger value) {
        this.alternativeBaseModel = value;
    }

    /**
     * Ruft den Wert der subModel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getSubModel() {
        return subModel;
    }

    /**
     * Legt den Wert der subModel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setSubModel(FieldInteger value) {
        this.subModel = value;
    }

    /**
     * Ruft den Wert der alternativeSubModel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getAlternativeSubModel() {
        return alternativeSubModel;
    }

    /**
     * Legt den Wert der alternativeSubModel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setAlternativeSubModel(FieldInteger value) {
        this.alternativeSubModel = value;
    }

    /**
     * Ruft den Wert der mainTypeGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getMainTypeGroup() {
        return mainTypeGroup;
    }

    /**
     * Legt den Wert der mainTypeGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setMainTypeGroup(FieldString value) {
        this.mainTypeGroup = value;
    }

    /**
     * Ruft den Wert der identificationSource-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationSource() {
        return identificationSource;
    }

    /**
     * Legt den Wert der identificationSource-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationSource(String value) {
        this.identificationSource = value;
    }

    /**
     * Ruft den Wert der country-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Legt den Wert der country-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Ruft den Wert der isDisengaged-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDisengaged() {
        return isDisengaged;
    }

    /**
     * Legt den Wert der isDisengaged-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDisengaged(Boolean value) {
        this.isDisengaged = value;
    }

    /**
     * Ruft den Wert der withoutDistinctionEquStandardSpecial-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithoutDistinctionEquStandardSpecial() {
        return withoutDistinctionEquStandardSpecial;
    }

    /**
     * Legt den Wert der withoutDistinctionEquStandardSpecial-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithoutDistinctionEquStandardSpecial(Boolean value) {
        this.withoutDistinctionEquStandardSpecial = value;
    }

    /**
     * Ruft den Wert der vinAccuracy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getVinAccuracy() {
        return vinAccuracy;
    }

    /**
     * Legt den Wert der vinAccuracy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setVinAccuracy(FieldInteger value) {
        this.vinAccuracy = value;
    }

    /**
     * Ruft den Wert der vinActive-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getVinActive() {
        return vinActive;
    }

    /**
     * Legt den Wert der vinActive-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setVinActive(FieldBoolean value) {
        this.vinActive = value;
    }

    /**
     * Ruft den Wert der vinEquipmentChanged-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getVinEquipmentChanged() {
        return vinEquipmentChanged;
    }

    /**
     * Legt den Wert der vinEquipmentChanged-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setVinEquipmentChanged(FieldBoolean value) {
        this.vinEquipmentChanged = value;
    }

    /**
     * Ruft den Wert der vinChecksum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldCharacter }
     *     
     */
    public FieldCharacter getVinChecksum() {
        return vinChecksum;
    }

    /**
     * Legt den Wert der vinChecksum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldCharacter }
     *     
     */
    public void setVinChecksum(FieldCharacter value) {
        this.vinChecksum = value;
    }

    /**
     * Ruft den Wert der releaseIndicator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseIndicator() {
        return releaseIndicator;
    }

    /**
     * Legt den Wert der releaseIndicator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseIndicator(String value) {
        this.releaseIndicator = value;
    }

    /**
     * Ruft den Wert der kbaNumbersN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle.KbaNumbersN }
     *     
     */
    public Vehicle.KbaNumbersN getKbaNumbersN() {
        return kbaNumbersN;
    }

    /**
     * Legt den Wert der kbaNumbersN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle.KbaNumbersN }
     *     
     */
    public void setKbaNumbersN(Vehicle.KbaNumbersN value) {
        this.kbaNumbersN = value;
    }

    /**
     * Ruft den Wert der nationalCodeAustria-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle.NationalCodeAustria }
     *     
     */
    public Vehicle.NationalCodeAustria getNationalCodeAustria() {
        return nationalCodeAustria;
    }

    /**
     * Legt den Wert der nationalCodeAustria-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle.NationalCodeAustria }
     *     
     */
    public void setNationalCodeAustria(Vehicle.NationalCodeAustria value) {
        this.nationalCodeAustria = value;
    }

    /**
     * Ruft den Wert der typeOfConstruction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString40 }
     *     
     */
    public FieldString40 getTypeOfConstruction() {
        return typeOfConstruction;
    }

    /**
     * Legt den Wert der typeOfConstruction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString40 }
     *     
     */
    public void setTypeOfConstruction(FieldString40 value) {
        this.typeOfConstruction = value;
    }

    /**
     * Ruft den Wert der constructionYearManual-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString40 }
     *     
     */
    public FieldString40 getConstructionYearManual() {
        return constructionYearManual;
    }

    /**
     * Legt den Wert der constructionYearManual-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString40 }
     *     
     */
    public void setConstructionYearManual(FieldString40 value) {
        this.constructionYearManual = value;
    }

    /**
     * Ruft den Wert der colorScheme-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString3 }
     *     
     */
    public FieldString3 getColorScheme() {
        return colorScheme;
    }

    /**
     * Legt den Wert der colorScheme-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString3 }
     *     
     */
    public void setColorScheme(FieldString3 value) {
        this.colorScheme = value;
    }

    /**
     * Ruft den Wert der colorSchemeManual-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString30 }
     *     
     */
    public FieldString30 getColorSchemeManual() {
        return colorSchemeManual;
    }

    /**
     * Legt den Wert der colorSchemeManual-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString30 }
     *     
     */
    public void setColorSchemeManual(FieldString30 value) {
        this.colorSchemeManual = value;
    }

    /**
     * Ruft den Wert der colorVariant-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getColorVariant() {
        return colorVariant;
    }

    /**
     * Legt den Wert der colorVariant-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setColorVariant(FieldString value) {
        this.colorVariant = value;
    }

    /**
     * Ruft den Wert der paintTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle.PaintTypes }
     *     
     */
    public Vehicle.PaintTypes getPaintTypes() {
        return paintTypes;
    }

    /**
     * Legt den Wert der paintTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle.PaintTypes }
     *     
     */
    public void setPaintTypes(Vehicle.PaintTypes value) {
        this.paintTypes = value;
    }

    /**
     * Ruft den Wert der generalInspectionDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralInspectionDate() {
        return generalInspectionDate;
    }

    /**
     * Legt den Wert der generalInspectionDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralInspectionDate(String value) {
        this.generalInspectionDate = value;
    }

    /**
     * Ruft den Wert der lastRegistration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getLastRegistration() {
        return lastRegistration;
    }

    /**
     * Legt den Wert der lastRegistration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setLastRegistration(FieldDate value) {
        this.lastRegistration = value;
    }

    /**
     * Ruft den Wert der manufacturerOrderKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString30 }
     *     
     */
    public FieldString30 getManufacturerOrderKey() {
        return manufacturerOrderKey;
    }

    /**
     * Legt den Wert der manufacturerOrderKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString30 }
     *     
     */
    public void setManufacturerOrderKey(FieldString30 value) {
        this.manufacturerOrderKey = value;
    }

    /**
     * Ruft den Wert der midTermReviewDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getMidTermReviewDate() {
        return midTermReviewDate;
    }

    /**
     * Legt den Wert der midTermReviewDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setMidTermReviewDate(FieldDate value) {
        this.midTermReviewDate = value;
    }

    /**
     * Ruft den Wert der subModelVariant-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getSubModelVariant() {
        return subModelVariant;
    }

    /**
     * Legt den Wert der subModelVariant-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setSubModelVariant(FieldInteger value) {
        this.subModelVariant = value;
    }

    /**
     * Ruft den Wert der tokenColorScheme-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString3 }
     *     
     */
    public FieldString3 getTokenColorScheme() {
        return tokenColorScheme;
    }

    /**
     * Legt den Wert der tokenColorScheme-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString3 }
     *     
     */
    public void setTokenColorScheme(FieldString3 value) {
        this.tokenColorScheme = value;
    }

    /**
     * Ruft den Wert der vehicleTypeAUFromKba-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString50 }
     *     
     */
    public FieldString50 getVehicleTypeAUFromKba() {
        return vehicleTypeAUFromKba;
    }

    /**
     * Legt den Wert der vehicleTypeAUFromKba-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString50 }
     *     
     */
    public void setVehicleTypeAUFromKba(FieldString50 value) {
        this.vehicleTypeAUFromKba = value;
    }

    /**
     * Ruft den Wert der vehicleTypeFromKba-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString50 }
     *     
     */
    public FieldString50 getVehicleTypeFromKba() {
        return vehicleTypeFromKba;
    }

    /**
     * Legt den Wert der vehicleTypeFromKba-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString50 }
     *     
     */
    public void setVehicleTypeFromKba(FieldString50 value) {
        this.vehicleTypeFromKba = value;
    }

    /**
     * Ruft den Wert der vehicleTypeFromManufacturer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString50 }
     *     
     */
    public FieldString50 getVehicleTypeFromManufacturer() {
        return vehicleTypeFromManufacturer;
    }

    /**
     * Legt den Wert der vehicleTypeFromManufacturer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString50 }
     *     
     */
    public void setVehicleTypeFromManufacturer(FieldString50 value) {
        this.vehicleTypeFromManufacturer = value;
    }

    /**
     * Ruft den Wert der colorcode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getColorcode() {
        return colorcode;
    }

    /**
     * Legt den Wert der colorcode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setColorcode(FieldInteger value) {
        this.colorcode = value;
    }

    /**
     * Ruft den Wert der mainTypeSubstitution-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getMainTypeSubstitution() {
        return mainTypeSubstitution;
    }

    /**
     * Legt den Wert der mainTypeSubstitution-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setMainTypeSubstitution(FieldDecimal value) {
        this.mainTypeSubstitution = value;
    }

    /**
     * Ruft den Wert der subTypeSubstitution-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getSubTypeSubstitution() {
        return subTypeSubstitution;
    }

    /**
     * Legt den Wert der subTypeSubstitution-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setSubTypeSubstitution(FieldInteger value) {
        this.subTypeSubstitution = value;
    }

    /**
     * Ruft den Wert der nextVehicleInspection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getNextVehicleInspection() {
        return nextVehicleInspection;
    }

    /**
     * Legt den Wert der nextVehicleInspection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setNextVehicleInspection(FieldDate value) {
        this.nextVehicleInspection = value;
    }

    /**
     * Ruft den Wert der originalPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getOriginalPrice() {
        return originalPrice;
    }

    /**
     * Legt den Wert der originalPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setOriginalPrice(FieldDecimal value) {
        this.originalPrice = value;
    }

    /**
     * Ruft den Wert der datOriginalPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatOriginalPrice() {
        return datOriginalPrice;
    }

    /**
     * Legt den Wert der datOriginalPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatOriginalPrice(FieldDecimal value) {
        this.datOriginalPrice = value;
    }

    /**
     * Ruft den Wert der originalPriceGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getOriginalPriceGross() {
        return originalPriceGross;
    }

    /**
     * Legt den Wert der originalPriceGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setOriginalPriceGross(FieldDecimal value) {
        this.originalPriceGross = value;
    }

    /**
     * Ruft den Wert der datOriginalPriceGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatOriginalPriceGross() {
        return datOriginalPriceGross;
    }

    /**
     * Legt den Wert der datOriginalPriceGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatOriginalPriceGross(FieldDecimal value) {
        this.datOriginalPriceGross = value;
    }

    /**
     * Ruft den Wert der rentalCarClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getRentalCarClass() {
        return rentalCarClass;
    }

    /**
     * Legt den Wert der rentalCarClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setRentalCarClass(FieldInteger value) {
        this.rentalCarClass = value;
    }

    /**
     * Ruft den Wert der registrationData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationData }
     *     
     */
    public RegistrationData getRegistrationData() {
        return registrationData;
    }

    /**
     * Legt den Wert der registrationData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationData }
     *     
     */
    public void setRegistrationData(RegistrationData value) {
        this.registrationData = value;
    }

    /**
     * Ruft den Wert der originalPriceInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OriginalPriceInfo }
     *     
     */
    public OriginalPriceInfo getOriginalPriceInfo() {
        return originalPriceInfo;
    }

    /**
     * Legt den Wert der originalPriceInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalPriceInfo }
     *     
     */
    public void setOriginalPriceInfo(OriginalPriceInfo value) {
        this.originalPriceInfo = value;
    }

    /**
     * Ruft den Wert der engine-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Engine }
     *     
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * Legt den Wert der engine-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Engine }
     *     
     */
    public void setEngine(Engine value) {
        this.engine = value;
    }

    /**
     * Ruft den Wert der maintenance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Maintenance }
     *     
     */
    public Maintenance getMaintenance() {
        return maintenance;
    }

    /**
     * Legt den Wert der maintenance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Maintenance }
     *     
     */
    public void setMaintenance(Maintenance value) {
        this.maintenance = value;
    }

    /**
     * Ruft den Wert der runningExpenses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RunningExpenses }
     *     
     */
    public RunningExpenses getRunningExpenses() {
        return runningExpenses;
    }

    /**
     * Legt den Wert der runningExpenses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RunningExpenses }
     *     
     */
    public void setRunningExpenses(RunningExpenses value) {
        this.runningExpenses = value;
    }

    /**
     * Ruft den Wert der techInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TechInfo }
     *     
     */
    public TechInfo getTechInfo() {
        return techInfo;
    }

    /**
     * Legt den Wert der techInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TechInfo }
     *     
     */
    public void setTechInfo(TechInfo value) {
        this.techInfo = value;
    }

    /**
     * Ruft den Wert der equipment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Equipment }
     *     
     */
    public Equipment getEquipment() {
        return equipment;
    }

    /**
     * Legt den Wert der equipment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Equipment }
     *     
     */
    public void setEquipment(Equipment value) {
        this.equipment = value;
    }

    /**
     * Ruft den Wert der tires-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Tires }
     *     
     */
    public Tires getTires() {
        return tires;
    }

    /**
     * Legt den Wert der tires-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Tires }
     *     
     */
    public void setTires(Tires value) {
        this.tires = value;
    }

    /**
     * Ruft den Wert der dateCodeEquipment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EquipSequence }
     *     
     */
    public EquipSequence getDATECodeEquipment() {
        return dateCodeEquipment;
    }

    /**
     * Legt den Wert der dateCodeEquipment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipSequence }
     *     
     */
    public void setDATECodeEquipment(EquipSequence value) {
        this.dateCodeEquipment = value;
    }

    /**
     * Ruft den Wert der vinResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VINResult }
     *     
     */
    public VINResult getVINResult() {
        return vinResult;
    }

    /**
     * Legt den Wert der vinResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VINResult }
     *     
     */
    public void setVINResult(VINResult value) {
        this.vinResult = value;
    }

    /**
     * Ruft den Wert der upperBodies-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle.UpperBodies }
     *     
     */
    public Vehicle.UpperBodies getUpperBodies() {
        return upperBodies;
    }

    /**
     * Legt den Wert der upperBodies-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle.UpperBodies }
     *     
     */
    public void setUpperBodies(Vehicle.UpperBodies value) {
        this.upperBodies = value;
    }

    /**
     * Ruft den Wert der domusVehicleData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DomusVehicleData }
     *     
     */
    public DomusVehicleData getDomusVehicleData() {
        return domusVehicleData;
    }

    /**
     * Legt den Wert der domusVehicleData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DomusVehicleData }
     *     
     */
    public void setDomusVehicleData(DomusVehicleData value) {
        this.domusVehicleData = value;
    }

    /**
     * Ruft den Wert der vehicleDataItaly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleDataItaly }
     *     
     */
    public VehicleDataItaly getVehicleDataItaly() {
        return vehicleDataItaly;
    }

    /**
     * Legt den Wert der vehicleDataItaly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleDataItaly }
     *     
     */
    public void setVehicleDataItaly(VehicleDataItaly value) {
        this.vehicleDataItaly = value;
    }

    /**
     * Ruft den Wert der metaPositions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetaPositions }
     *     
     */
    public MetaPositions getMetaPositions() {
        return metaPositions;
    }

    /**
     * Legt den Wert der metaPositions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaPositions }
     *     
     */
    public void setMetaPositions(MetaPositions value) {
        this.metaPositions = value;
    }

    /**
     * Ruft den Wert der buildYear-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getBuildYear() {
        return buildYear;
    }

    /**
     * Legt den Wert der buildYear-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setBuildYear(FieldInteger value) {
        this.buildYear = value;
    }

    /**
     * Ruft den Wert der operatingHours-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getOperatingHours() {
        return operatingHours;
    }

    /**
     * Legt den Wert der operatingHours-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setOperatingHours(FieldInteger value) {
        this.operatingHours = value;
    }

    /**
     * Ruft den Wert der mileageInMiles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getMileageInMiles() {
        return mileageInMiles;
    }

    /**
     * Legt den Wert der mileageInMiles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setMileageInMiles(FieldInteger value) {
        this.mileageInMiles = value;
    }

    /**
     * Ruft den Wert der lastVehicleInspection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getLastVehicleInspection() {
        return lastVehicleInspection;
    }

    /**
     * Legt den Wert der lastVehicleInspection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setLastVehicleInspection(FieldDate value) {
        this.lastVehicleInspection = value;
    }

    /**
     * Ruft den Wert der vehicleCondition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getVehicleCondition() {
        return vehicleCondition;
    }

    /**
     * Legt den Wert der vehicleCondition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setVehicleCondition(FieldString value) {
        this.vehicleCondition = value;
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
     *         &lt;element name="KbaNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
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
        "kbaNumber"
    })
    public static class KbaNumbersN {

        @XmlElement(name = "KbaNumber")
        protected List<String> kbaNumber;

        /**
         * Gets the value of the kbaNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the kbaNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKbaNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getKbaNumber() {
            if (kbaNumber == null) {
                kbaNumber = new ArrayList<String>();
            }
            return this.kbaNumber;
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
     *         &lt;element name="NationalCodeAustria" type="{http://www.dat.de/vxs}fieldString6" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
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
        "nationalCodeAustria"
    })
    public static class NationalCodeAustria {

        @XmlElement(name = "NationalCodeAustria")
        protected List<FieldString6> nationalCodeAustria;

        /**
         * Gets the value of the nationalCodeAustria property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nationalCodeAustria property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNationalCodeAustria().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FieldString6 }
         * 
         * 
         */
        public List<FieldString6> getNationalCodeAustria() {
            if (nationalCodeAustria == null) {
                nationalCodeAustria = new ArrayList<FieldString6>();
            }
            return this.nationalCodeAustria;
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
     *         &lt;element name="PaintType" type="{http://www.dat.de/vxs}fieldString2" maxOccurs="unbounded" form="qualified"/>
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
        "paintType"
    })
    public static class PaintTypes {

        @XmlElement(name = "PaintType", required = true)
        protected List<FieldString2> paintType;

        /**
         * Gets the value of the paintType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paintType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaintType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FieldString2 }
         * 
         * 
         */
        public List<FieldString2> getPaintType() {
            if (paintType == null) {
                paintType = new ArrayList<FieldString2>();
            }
            return this.paintType;
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
     *         &lt;element ref="{http://www.dat.de/vxs}UpperBody" maxOccurs="unbounded" minOccurs="0"/>
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
        "upperBody"
    })
    public static class UpperBodies {

        @XmlElement(name = "UpperBody")
        protected List<UpperBody> upperBody;

        /**
         * Gets the value of the upperBody property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the upperBody property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUpperBody().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UpperBody }
         * 
         * 
         */
        public List<UpperBody> getUpperBody() {
            if (upperBody == null) {
                upperBody = new ArrayList<UpperBody>();
            }
            return this.upperBody;
        }

    }

}
