
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
 *         &lt;element name="DATProcessId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="RepairType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Description" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConstructionGroupId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConstructionGroup" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PositionEntryType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="OptimizationHandling" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConstructionType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="SparePartDiscount" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SparePartNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="SparePartNumberOrigin" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="SparePartNumberManufacturer" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="SparePartPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SparePartAmount" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SparePartUsed" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="SparePartSupplyDescription" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkPositionNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkPositionNumberOrigin" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkPositionNumberManufacturer" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkDifficultyLevel" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkTime" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkLevel" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkPriceOrigin" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerLevel" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerLevelId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerLevelBaseId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerPercentage" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerCountSpotRepair" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerScratchProofFinishTime" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerMaterialPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerMaterialPriceOrigin" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerWorkPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerWorkPriceOrigin" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerMaterialUnitsNumber" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="PlasticDamageSpotsEasy" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="PlasticDamageSpotsAverage" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="PlasticDamageSpotsHard" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="OverhaulLocation" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DentsCount" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DentsOver20mmCount" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DentsSize" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DentsPartOrientation" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DentsFlatrate" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DentsCalculationMethod" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DentsWithFinishing" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="DentsWithSetupTime" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="DentsWithAddLightMetals" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="DentsPrePressTime" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DentsOutOfReach" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="IsAdditionalLM" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="PreDamage" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="GlassDamageSpots" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DentNumberLess" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DentNumberMore" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="AlloyLM" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="LargeScale" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="AdhesiveTechnologyScale" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="SetupTime" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="BlockWageFlatPrice" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="AdditionLM" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkCompleted" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="ContainMicroDents" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="NumDents20" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="NumDents30" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="NumDents45" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkTime20" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkTime30" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkTime45" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="HasAluminium" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="IsDomusPart" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="Position" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Apos2" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Apos2MainWork" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConstructionGroupMainType" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConstructionGroupManufacturer" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DVNGroupPositionNumber" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="Measure" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="RepairVector" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="SeqNo" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SparePartDiscountIndicator" type="{http://www.dat.de/vxs}fieldCharacter" minOccurs="0" form="qualified"/>
 *         &lt;element name="WearGroup" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="WearAge" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="WearMileage" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="WearAdditional" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Finishtype" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerDifficulty" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="GrupoPlastico" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="InputSPD" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="InputLP" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="InputSDE" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="InputSDI" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="InputL" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="PiezasPO" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PiezasOP" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Bulge_area" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="Bulge_area_difficulty_factor" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DMSFlag" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PartCodeItaly" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Location" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkTimeItaly" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkLevelItaly" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="NFOPercentage" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PredamageAmount" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PredamagePercentage" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="AdhesiveMethod" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="Length" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Width" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Predefined" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="Manufacturer" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Dimension" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PositionExecutionFlag" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PositionGoodwillPartDescription" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PositionEntryTypeKey" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkIndication" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="WithSparePart" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "RepairPosition")
public class RepairPosition {

    @XmlElement(name = "DATProcessId")
    protected FieldInteger datProcessId;
    @XmlElement(name = "RepairType")
    protected FieldString repairType;
    @XmlElement(name = "Description")
    protected FieldString description;
    @XmlElement(name = "ConstructionGroupId")
    protected FieldInteger constructionGroupId;
    @XmlElement(name = "ConstructionGroup")
    protected FieldString constructionGroup;
    @XmlElement(name = "PositionEntryType")
    protected FieldString positionEntryType;
    @XmlElement(name = "OptimizationHandling")
    protected FieldString optimizationHandling;
    @XmlElement(name = "ConstructionType")
    protected FieldString constructionType;
    @XmlElement(name = "SparePartDiscount")
    protected FieldDecimal sparePartDiscount;
    @XmlElement(name = "SparePartNumber")
    protected FieldString sparePartNumber;
    @XmlElement(name = "SparePartNumberOrigin")
    protected FieldString sparePartNumberOrigin;
    @XmlElement(name = "SparePartNumberManufacturer")
    protected FieldString sparePartNumberManufacturer;
    @XmlElement(name = "SparePartPrice")
    protected FieldDecimal sparePartPrice;
    @XmlElement(name = "SparePartAmount")
    protected FieldDecimal sparePartAmount;
    @XmlElement(name = "SparePartUsed")
    protected FieldBoolean sparePartUsed;
    @XmlElement(name = "SparePartSupplyDescription")
    protected FieldString sparePartSupplyDescription;
    @XmlElement(name = "WorkPositionNumber")
    protected FieldString workPositionNumber;
    @XmlElement(name = "WorkPositionNumberOrigin")
    protected FieldString workPositionNumberOrigin;
    @XmlElement(name = "WorkPositionNumberManufacturer")
    protected FieldString workPositionNumberManufacturer;
    @XmlElement(name = "WorkDifficultyLevel")
    protected FieldInteger workDifficultyLevel;
    @XmlElement(name = "WorkType")
    protected FieldString workType;
    @XmlElement(name = "WorkTime")
    protected FieldDecimal workTime;
    @XmlElement(name = "WorkLevel")
    protected FieldString workLevel;
    @XmlElement(name = "WorkPrice")
    protected FieldDecimal workPrice;
    @XmlElement(name = "WorkPriceOrigin")
    protected FieldString workPriceOrigin;
    @XmlElement(name = "LacquerLevel")
    protected FieldString lacquerLevel;
    @XmlElement(name = "LacquerLevelId")
    protected FieldInteger lacquerLevelId;
    @XmlElement(name = "LacquerLevelBaseId")
    protected FieldInteger lacquerLevelBaseId;
    @XmlElement(name = "LacquerPercentage")
    protected FieldDecimal lacquerPercentage;
    @XmlElement(name = "LacquerCountSpotRepair")
    protected FieldInteger lacquerCountSpotRepair;
    @XmlElement(name = "LacquerScratchProofFinishTime")
    protected FieldDecimal lacquerScratchProofFinishTime;
    @XmlElement(name = "LacquerPrice")
    protected FieldDecimal lacquerPrice;
    @XmlElement(name = "LacquerMaterialPrice")
    protected FieldDecimal lacquerMaterialPrice;
    @XmlElement(name = "LacquerMaterialPriceOrigin")
    protected FieldString lacquerMaterialPriceOrigin;
    @XmlElement(name = "LacquerWorkPrice")
    protected FieldDecimal lacquerWorkPrice;
    @XmlElement(name = "LacquerWorkPriceOrigin")
    protected FieldString lacquerWorkPriceOrigin;
    @XmlElement(name = "LacquerMaterialUnitsNumber")
    protected FieldInteger lacquerMaterialUnitsNumber;
    @XmlElement(name = "PlasticDamageSpotsEasy")
    protected FieldInteger plasticDamageSpotsEasy;
    @XmlElement(name = "PlasticDamageSpotsAverage")
    protected FieldInteger plasticDamageSpotsAverage;
    @XmlElement(name = "PlasticDamageSpotsHard")
    protected FieldInteger plasticDamageSpotsHard;
    @XmlElement(name = "OverhaulLocation")
    protected FieldString overhaulLocation;
    @XmlElement(name = "DentsCount")
    protected FieldInteger dentsCount;
    @XmlElement(name = "DentsOver20mmCount")
    protected FieldInteger dentsOver20MmCount;
    @XmlElement(name = "DentsSize")
    protected FieldInteger dentsSize;
    @XmlElement(name = "DentsPartOrientation")
    protected FieldString dentsPartOrientation;
    @XmlElement(name = "DentsFlatrate")
    protected FieldDecimal dentsFlatrate;
    @XmlElement(name = "DentsCalculationMethod")
    protected FieldString dentsCalculationMethod;
    @XmlElement(name = "DentsWithFinishing")
    protected FieldBoolean dentsWithFinishing;
    @XmlElement(name = "DentsWithSetupTime")
    protected FieldBoolean dentsWithSetupTime;
    @XmlElement(name = "DentsWithAddLightMetals")
    protected FieldBoolean dentsWithAddLightMetals;
    @XmlElement(name = "DentsPrePressTime")
    protected FieldDecimal dentsPrePressTime;
    @XmlElement(name = "DentsOutOfReach")
    protected FieldBoolean dentsOutOfReach;
    @XmlElement(name = "IsAdditionalLM")
    protected FieldBoolean isAdditionalLM;
    @XmlElement(name = "PreDamage")
    protected FieldBoolean preDamage;
    @XmlElement(name = "GlassDamageSpots")
    protected FieldInteger glassDamageSpots;
    @XmlElement(name = "DentNumberLess")
    protected FieldInteger dentNumberLess;
    @XmlElement(name = "DentNumberMore")
    protected FieldInteger dentNumberMore;
    @XmlElement(name = "AlloyLM")
    protected FieldBoolean alloyLM;
    @XmlElement(name = "LargeScale")
    protected FieldBoolean largeScale;
    @XmlElement(name = "AdhesiveTechnologyScale")
    protected FieldBoolean adhesiveTechnologyScale;
    @XmlElement(name = "SetupTime")
    protected FieldInteger setupTime;
    @XmlElement(name = "BlockWageFlatPrice")
    protected FieldInteger blockWageFlatPrice;
    @XmlElement(name = "AdditionLM")
    protected FieldBoolean additionLM;
    @XmlElement(name = "WorkCompleted")
    protected FieldBoolean workCompleted;
    @XmlElement(name = "ContainMicroDents")
    protected FieldBoolean containMicroDents;
    @XmlElement(name = "NumDents20")
    protected FieldInteger numDents20;
    @XmlElement(name = "NumDents30")
    protected FieldInteger numDents30;
    @XmlElement(name = "NumDents45")
    protected FieldInteger numDents45;
    @XmlElement(name = "WorkTime20")
    protected FieldInteger workTime20;
    @XmlElement(name = "WorkTime30")
    protected FieldInteger workTime30;
    @XmlElement(name = "WorkTime45")
    protected FieldInteger workTime45;
    @XmlElement(name = "HasAluminium")
    protected FieldBoolean hasAluminium;
    @XmlElement(name = "IsDomusPart")
    protected FieldBoolean isDomusPart;
    @XmlElement(name = "Position")
    protected FieldString position;
    @XmlElement(name = "Apos2")
    protected FieldString apos2;
    @XmlElement(name = "Apos2MainWork")
    protected FieldString apos2MainWork;
    @XmlElement(name = "ConstructionGroupMainType")
    protected FieldInteger constructionGroupMainType;
    @XmlElement(name = "ConstructionGroupManufacturer")
    protected FieldInteger constructionGroupManufacturer;
    @XmlElement(name = "DVNGroupPositionNumber")
    protected FieldInteger dvnGroupPositionNumber;
    @XmlElement(name = "Measure")
    protected FieldString measure;
    @XmlElement(name = "RepairVector")
    protected FieldString repairVector;
    @XmlElement(name = "SeqNo")
    protected FieldDecimal seqNo;
    @XmlElement(name = "SparePartDiscountIndicator")
    protected FieldCharacter sparePartDiscountIndicator;
    @XmlElement(name = "WearGroup")
    protected FieldString wearGroup;
    @XmlElement(name = "WearAge")
    protected FieldInteger wearAge;
    @XmlElement(name = "WearMileage")
    protected FieldInteger wearMileage;
    @XmlElement(name = "WearAdditional")
    protected FieldDecimal wearAdditional;
    @XmlElement(name = "Finishtype")
    protected FieldString finishtype;
    @XmlElement(name = "LacquerDifficulty")
    protected FieldInteger lacquerDifficulty;
    @XmlElement(name = "GrupoPlastico")
    protected FieldString grupoPlastico;
    @XmlElement(name = "InputSPD")
    protected FieldInteger inputSPD;
    @XmlElement(name = "InputLP")
    protected FieldInteger inputLP;
    @XmlElement(name = "InputSDE")
    protected FieldInteger inputSDE;
    @XmlElement(name = "InputSDI")
    protected FieldInteger inputSDI;
    @XmlElement(name = "InputL")
    protected FieldInteger inputL;
    @XmlElement(name = "PiezasPO")
    protected FieldString piezasPO;
    @XmlElement(name = "PiezasOP")
    protected FieldString piezasOP;
    @XmlElement(name = "Bulge_area")
    protected FieldInteger bulgeArea;
    @XmlElement(name = "Bulge_area_difficulty_factor")
    protected FieldInteger bulgeAreaDifficultyFactor;
    @XmlElement(name = "DMSFlag")
    protected FieldString dmsFlag;
    @XmlElement(name = "PartCodeItaly")
    protected FieldString partCodeItaly;
    @XmlElement(name = "Location")
    protected FieldString location;
    @XmlElement(name = "WorkTimeItaly")
    protected FieldDecimal workTimeItaly;
    @XmlElement(name = "WorkLevelItaly")
    protected FieldString workLevelItaly;
    @XmlElement(name = "NFOPercentage")
    protected FieldDecimal nfoPercentage;
    @XmlElement(name = "PredamageAmount")
    protected FieldDecimal predamageAmount;
    @XmlElement(name = "PredamagePercentage")
    protected FieldDecimal predamagePercentage;
    @XmlElement(name = "AdhesiveMethod")
    protected FieldBoolean adhesiveMethod;
    @XmlElement(name = "Length")
    protected FieldDecimal length;
    @XmlElement(name = "Width")
    protected FieldDecimal width;
    @XmlElement(name = "Predefined")
    protected FieldBoolean predefined;
    @XmlElement(name = "Manufacturer")
    protected FieldString manufacturer;
    @XmlElement(name = "Dimension")
    protected FieldString dimension;
    @XmlElement(name = "PositionExecutionFlag")
    protected FieldString positionExecutionFlag;
    @XmlElement(name = "PositionGoodwillPartDescription")
    protected FieldString positionGoodwillPartDescription;
    @XmlElement(name = "PositionEntryTypeKey")
    protected FieldInteger positionEntryTypeKey;
    @XmlElement(name = "WorkIndication")
    protected FieldInteger workIndication;
    @XmlElement(name = "WithSparePart")
    protected FieldBoolean withSparePart;

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
     * Ruft den Wert der constructionGroupId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getConstructionGroupId() {
        return constructionGroupId;
    }

    /**
     * Legt den Wert der constructionGroupId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setConstructionGroupId(FieldInteger value) {
        this.constructionGroupId = value;
    }

    /**
     * Ruft den Wert der constructionGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getConstructionGroup() {
        return constructionGroup;
    }

    /**
     * Legt den Wert der constructionGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setConstructionGroup(FieldString value) {
        this.constructionGroup = value;
    }

    /**
     * Ruft den Wert der positionEntryType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPositionEntryType() {
        return positionEntryType;
    }

    /**
     * Legt den Wert der positionEntryType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPositionEntryType(FieldString value) {
        this.positionEntryType = value;
    }

    /**
     * Ruft den Wert der optimizationHandling-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getOptimizationHandling() {
        return optimizationHandling;
    }

    /**
     * Legt den Wert der optimizationHandling-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setOptimizationHandling(FieldString value) {
        this.optimizationHandling = value;
    }

    /**
     * Ruft den Wert der constructionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getConstructionType() {
        return constructionType;
    }

    /**
     * Legt den Wert der constructionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setConstructionType(FieldString value) {
        this.constructionType = value;
    }

    /**
     * Ruft den Wert der sparePartDiscount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSparePartDiscount() {
        return sparePartDiscount;
    }

    /**
     * Legt den Wert der sparePartDiscount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSparePartDiscount(FieldDecimal value) {
        this.sparePartDiscount = value;
    }

    /**
     * Ruft den Wert der sparePartNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSparePartNumber() {
        return sparePartNumber;
    }

    /**
     * Legt den Wert der sparePartNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSparePartNumber(FieldString value) {
        this.sparePartNumber = value;
    }

    /**
     * Ruft den Wert der sparePartNumberOrigin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSparePartNumberOrigin() {
        return sparePartNumberOrigin;
    }

    /**
     * Legt den Wert der sparePartNumberOrigin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSparePartNumberOrigin(FieldString value) {
        this.sparePartNumberOrigin = value;
    }

    /**
     * Ruft den Wert der sparePartNumberManufacturer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSparePartNumberManufacturer() {
        return sparePartNumberManufacturer;
    }

    /**
     * Legt den Wert der sparePartNumberManufacturer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSparePartNumberManufacturer(FieldString value) {
        this.sparePartNumberManufacturer = value;
    }

    /**
     * Ruft den Wert der sparePartPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSparePartPrice() {
        return sparePartPrice;
    }

    /**
     * Legt den Wert der sparePartPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSparePartPrice(FieldDecimal value) {
        this.sparePartPrice = value;
    }

    /**
     * Ruft den Wert der sparePartAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSparePartAmount() {
        return sparePartAmount;
    }

    /**
     * Legt den Wert der sparePartAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSparePartAmount(FieldDecimal value) {
        this.sparePartAmount = value;
    }

    /**
     * Ruft den Wert der sparePartUsed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getSparePartUsed() {
        return sparePartUsed;
    }

    /**
     * Legt den Wert der sparePartUsed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setSparePartUsed(FieldBoolean value) {
        this.sparePartUsed = value;
    }

    /**
     * Ruft den Wert der sparePartSupplyDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSparePartSupplyDescription() {
        return sparePartSupplyDescription;
    }

    /**
     * Legt den Wert der sparePartSupplyDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSparePartSupplyDescription(FieldString value) {
        this.sparePartSupplyDescription = value;
    }

    /**
     * Ruft den Wert der workPositionNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getWorkPositionNumber() {
        return workPositionNumber;
    }

    /**
     * Legt den Wert der workPositionNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setWorkPositionNumber(FieldString value) {
        this.workPositionNumber = value;
    }

    /**
     * Ruft den Wert der workPositionNumberOrigin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getWorkPositionNumberOrigin() {
        return workPositionNumberOrigin;
    }

    /**
     * Legt den Wert der workPositionNumberOrigin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setWorkPositionNumberOrigin(FieldString value) {
        this.workPositionNumberOrigin = value;
    }

    /**
     * Ruft den Wert der workPositionNumberManufacturer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getWorkPositionNumberManufacturer() {
        return workPositionNumberManufacturer;
    }

    /**
     * Legt den Wert der workPositionNumberManufacturer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setWorkPositionNumberManufacturer(FieldString value) {
        this.workPositionNumberManufacturer = value;
    }

    /**
     * Ruft den Wert der workDifficultyLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getWorkDifficultyLevel() {
        return workDifficultyLevel;
    }

    /**
     * Legt den Wert der workDifficultyLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setWorkDifficultyLevel(FieldInteger value) {
        this.workDifficultyLevel = value;
    }

    /**
     * Ruft den Wert der workType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getWorkType() {
        return workType;
    }

    /**
     * Legt den Wert der workType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setWorkType(FieldString value) {
        this.workType = value;
    }

    /**
     * Ruft den Wert der workTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWorkTime() {
        return workTime;
    }

    /**
     * Legt den Wert der workTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWorkTime(FieldDecimal value) {
        this.workTime = value;
    }

    /**
     * Ruft den Wert der workLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getWorkLevel() {
        return workLevel;
    }

    /**
     * Legt den Wert der workLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setWorkLevel(FieldString value) {
        this.workLevel = value;
    }

    /**
     * Ruft den Wert der workPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWorkPrice() {
        return workPrice;
    }

    /**
     * Legt den Wert der workPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWorkPrice(FieldDecimal value) {
        this.workPrice = value;
    }

    /**
     * Ruft den Wert der workPriceOrigin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getWorkPriceOrigin() {
        return workPriceOrigin;
    }

    /**
     * Legt den Wert der workPriceOrigin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setWorkPriceOrigin(FieldString value) {
        this.workPriceOrigin = value;
    }

    /**
     * Ruft den Wert der lacquerLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLacquerLevel() {
        return lacquerLevel;
    }

    /**
     * Legt den Wert der lacquerLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLacquerLevel(FieldString value) {
        this.lacquerLevel = value;
    }

    /**
     * Ruft den Wert der lacquerLevelId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLacquerLevelId() {
        return lacquerLevelId;
    }

    /**
     * Legt den Wert der lacquerLevelId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLacquerLevelId(FieldInteger value) {
        this.lacquerLevelId = value;
    }

    /**
     * Ruft den Wert der lacquerLevelBaseId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLacquerLevelBaseId() {
        return lacquerLevelBaseId;
    }

    /**
     * Legt den Wert der lacquerLevelBaseId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLacquerLevelBaseId(FieldInteger value) {
        this.lacquerLevelBaseId = value;
    }

    /**
     * Ruft den Wert der lacquerPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerPercentage() {
        return lacquerPercentage;
    }

    /**
     * Legt den Wert der lacquerPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerPercentage(FieldDecimal value) {
        this.lacquerPercentage = value;
    }

    /**
     * Ruft den Wert der lacquerCountSpotRepair-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLacquerCountSpotRepair() {
        return lacquerCountSpotRepair;
    }

    /**
     * Legt den Wert der lacquerCountSpotRepair-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLacquerCountSpotRepair(FieldInteger value) {
        this.lacquerCountSpotRepair = value;
    }

    /**
     * Ruft den Wert der lacquerScratchProofFinishTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerScratchProofFinishTime() {
        return lacquerScratchProofFinishTime;
    }

    /**
     * Legt den Wert der lacquerScratchProofFinishTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerScratchProofFinishTime(FieldDecimal value) {
        this.lacquerScratchProofFinishTime = value;
    }

    /**
     * Ruft den Wert der lacquerPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerPrice() {
        return lacquerPrice;
    }

    /**
     * Legt den Wert der lacquerPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerPrice(FieldDecimal value) {
        this.lacquerPrice = value;
    }

    /**
     * Ruft den Wert der lacquerMaterialPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerMaterialPrice() {
        return lacquerMaterialPrice;
    }

    /**
     * Legt den Wert der lacquerMaterialPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerMaterialPrice(FieldDecimal value) {
        this.lacquerMaterialPrice = value;
    }

    /**
     * Ruft den Wert der lacquerMaterialPriceOrigin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLacquerMaterialPriceOrigin() {
        return lacquerMaterialPriceOrigin;
    }

    /**
     * Legt den Wert der lacquerMaterialPriceOrigin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLacquerMaterialPriceOrigin(FieldString value) {
        this.lacquerMaterialPriceOrigin = value;
    }

    /**
     * Ruft den Wert der lacquerWorkPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerWorkPrice() {
        return lacquerWorkPrice;
    }

    /**
     * Legt den Wert der lacquerWorkPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerWorkPrice(FieldDecimal value) {
        this.lacquerWorkPrice = value;
    }

    /**
     * Ruft den Wert der lacquerWorkPriceOrigin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLacquerWorkPriceOrigin() {
        return lacquerWorkPriceOrigin;
    }

    /**
     * Legt den Wert der lacquerWorkPriceOrigin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLacquerWorkPriceOrigin(FieldString value) {
        this.lacquerWorkPriceOrigin = value;
    }

    /**
     * Ruft den Wert der lacquerMaterialUnitsNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLacquerMaterialUnitsNumber() {
        return lacquerMaterialUnitsNumber;
    }

    /**
     * Legt den Wert der lacquerMaterialUnitsNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLacquerMaterialUnitsNumber(FieldInteger value) {
        this.lacquerMaterialUnitsNumber = value;
    }

    /**
     * Ruft den Wert der plasticDamageSpotsEasy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getPlasticDamageSpotsEasy() {
        return plasticDamageSpotsEasy;
    }

    /**
     * Legt den Wert der plasticDamageSpotsEasy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setPlasticDamageSpotsEasy(FieldInteger value) {
        this.plasticDamageSpotsEasy = value;
    }

    /**
     * Ruft den Wert der plasticDamageSpotsAverage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getPlasticDamageSpotsAverage() {
        return plasticDamageSpotsAverage;
    }

    /**
     * Legt den Wert der plasticDamageSpotsAverage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setPlasticDamageSpotsAverage(FieldInteger value) {
        this.plasticDamageSpotsAverage = value;
    }

    /**
     * Ruft den Wert der plasticDamageSpotsHard-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getPlasticDamageSpotsHard() {
        return plasticDamageSpotsHard;
    }

    /**
     * Legt den Wert der plasticDamageSpotsHard-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setPlasticDamageSpotsHard(FieldInteger value) {
        this.plasticDamageSpotsHard = value;
    }

    /**
     * Ruft den Wert der overhaulLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getOverhaulLocation() {
        return overhaulLocation;
    }

    /**
     * Legt den Wert der overhaulLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setOverhaulLocation(FieldString value) {
        this.overhaulLocation = value;
    }

    /**
     * Ruft den Wert der dentsCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDentsCount() {
        return dentsCount;
    }

    /**
     * Legt den Wert der dentsCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDentsCount(FieldInteger value) {
        this.dentsCount = value;
    }

    /**
     * Ruft den Wert der dentsOver20MmCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDentsOver20MmCount() {
        return dentsOver20MmCount;
    }

    /**
     * Legt den Wert der dentsOver20MmCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDentsOver20MmCount(FieldInteger value) {
        this.dentsOver20MmCount = value;
    }

    /**
     * Ruft den Wert der dentsSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDentsSize() {
        return dentsSize;
    }

    /**
     * Legt den Wert der dentsSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDentsSize(FieldInteger value) {
        this.dentsSize = value;
    }

    /**
     * Ruft den Wert der dentsPartOrientation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDentsPartOrientation() {
        return dentsPartOrientation;
    }

    /**
     * Legt den Wert der dentsPartOrientation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDentsPartOrientation(FieldString value) {
        this.dentsPartOrientation = value;
    }

    /**
     * Ruft den Wert der dentsFlatrate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDentsFlatrate() {
        return dentsFlatrate;
    }

    /**
     * Legt den Wert der dentsFlatrate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDentsFlatrate(FieldDecimal value) {
        this.dentsFlatrate = value;
    }

    /**
     * Ruft den Wert der dentsCalculationMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDentsCalculationMethod() {
        return dentsCalculationMethod;
    }

    /**
     * Legt den Wert der dentsCalculationMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDentsCalculationMethod(FieldString value) {
        this.dentsCalculationMethod = value;
    }

    /**
     * Ruft den Wert der dentsWithFinishing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getDentsWithFinishing() {
        return dentsWithFinishing;
    }

    /**
     * Legt den Wert der dentsWithFinishing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setDentsWithFinishing(FieldBoolean value) {
        this.dentsWithFinishing = value;
    }

    /**
     * Ruft den Wert der dentsWithSetupTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getDentsWithSetupTime() {
        return dentsWithSetupTime;
    }

    /**
     * Legt den Wert der dentsWithSetupTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setDentsWithSetupTime(FieldBoolean value) {
        this.dentsWithSetupTime = value;
    }

    /**
     * Ruft den Wert der dentsWithAddLightMetals-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getDentsWithAddLightMetals() {
        return dentsWithAddLightMetals;
    }

    /**
     * Legt den Wert der dentsWithAddLightMetals-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setDentsWithAddLightMetals(FieldBoolean value) {
        this.dentsWithAddLightMetals = value;
    }

    /**
     * Ruft den Wert der dentsPrePressTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDentsPrePressTime() {
        return dentsPrePressTime;
    }

    /**
     * Legt den Wert der dentsPrePressTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDentsPrePressTime(FieldDecimal value) {
        this.dentsPrePressTime = value;
    }

    /**
     * Ruft den Wert der dentsOutOfReach-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getDentsOutOfReach() {
        return dentsOutOfReach;
    }

    /**
     * Legt den Wert der dentsOutOfReach-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setDentsOutOfReach(FieldBoolean value) {
        this.dentsOutOfReach = value;
    }

    /**
     * Ruft den Wert der isAdditionalLM-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getIsAdditionalLM() {
        return isAdditionalLM;
    }

    /**
     * Legt den Wert der isAdditionalLM-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setIsAdditionalLM(FieldBoolean value) {
        this.isAdditionalLM = value;
    }

    /**
     * Ruft den Wert der preDamage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getPreDamage() {
        return preDamage;
    }

    /**
     * Legt den Wert der preDamage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setPreDamage(FieldBoolean value) {
        this.preDamage = value;
    }

    /**
     * Ruft den Wert der glassDamageSpots-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getGlassDamageSpots() {
        return glassDamageSpots;
    }

    /**
     * Legt den Wert der glassDamageSpots-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setGlassDamageSpots(FieldInteger value) {
        this.glassDamageSpots = value;
    }

    /**
     * Ruft den Wert der dentNumberLess-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDentNumberLess() {
        return dentNumberLess;
    }

    /**
     * Legt den Wert der dentNumberLess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDentNumberLess(FieldInteger value) {
        this.dentNumberLess = value;
    }

    /**
     * Ruft den Wert der dentNumberMore-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDentNumberMore() {
        return dentNumberMore;
    }

    /**
     * Legt den Wert der dentNumberMore-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDentNumberMore(FieldInteger value) {
        this.dentNumberMore = value;
    }

    /**
     * Ruft den Wert der alloyLM-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getAlloyLM() {
        return alloyLM;
    }

    /**
     * Legt den Wert der alloyLM-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setAlloyLM(FieldBoolean value) {
        this.alloyLM = value;
    }

    /**
     * Ruft den Wert der largeScale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getLargeScale() {
        return largeScale;
    }

    /**
     * Legt den Wert der largeScale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setLargeScale(FieldBoolean value) {
        this.largeScale = value;
    }

    /**
     * Ruft den Wert der adhesiveTechnologyScale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getAdhesiveTechnologyScale() {
        return adhesiveTechnologyScale;
    }

    /**
     * Legt den Wert der adhesiveTechnologyScale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setAdhesiveTechnologyScale(FieldBoolean value) {
        this.adhesiveTechnologyScale = value;
    }

    /**
     * Ruft den Wert der setupTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getSetupTime() {
        return setupTime;
    }

    /**
     * Legt den Wert der setupTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setSetupTime(FieldInteger value) {
        this.setupTime = value;
    }

    /**
     * Ruft den Wert der blockWageFlatPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getBlockWageFlatPrice() {
        return blockWageFlatPrice;
    }

    /**
     * Legt den Wert der blockWageFlatPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setBlockWageFlatPrice(FieldInteger value) {
        this.blockWageFlatPrice = value;
    }

    /**
     * Ruft den Wert der additionLM-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getAdditionLM() {
        return additionLM;
    }

    /**
     * Legt den Wert der additionLM-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setAdditionLM(FieldBoolean value) {
        this.additionLM = value;
    }

    /**
     * Ruft den Wert der workCompleted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getWorkCompleted() {
        return workCompleted;
    }

    /**
     * Legt den Wert der workCompleted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setWorkCompleted(FieldBoolean value) {
        this.workCompleted = value;
    }

    /**
     * Ruft den Wert der containMicroDents-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getContainMicroDents() {
        return containMicroDents;
    }

    /**
     * Legt den Wert der containMicroDents-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setContainMicroDents(FieldBoolean value) {
        this.containMicroDents = value;
    }

    /**
     * Ruft den Wert der numDents20-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getNumDents20() {
        return numDents20;
    }

    /**
     * Legt den Wert der numDents20-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setNumDents20(FieldInteger value) {
        this.numDents20 = value;
    }

    /**
     * Ruft den Wert der numDents30-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getNumDents30() {
        return numDents30;
    }

    /**
     * Legt den Wert der numDents30-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setNumDents30(FieldInteger value) {
        this.numDents30 = value;
    }

    /**
     * Ruft den Wert der numDents45-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getNumDents45() {
        return numDents45;
    }

    /**
     * Legt den Wert der numDents45-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setNumDents45(FieldInteger value) {
        this.numDents45 = value;
    }

    /**
     * Ruft den Wert der workTime20-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getWorkTime20() {
        return workTime20;
    }

    /**
     * Legt den Wert der workTime20-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setWorkTime20(FieldInteger value) {
        this.workTime20 = value;
    }

    /**
     * Ruft den Wert der workTime30-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getWorkTime30() {
        return workTime30;
    }

    /**
     * Legt den Wert der workTime30-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setWorkTime30(FieldInteger value) {
        this.workTime30 = value;
    }

    /**
     * Ruft den Wert der workTime45-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getWorkTime45() {
        return workTime45;
    }

    /**
     * Legt den Wert der workTime45-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setWorkTime45(FieldInteger value) {
        this.workTime45 = value;
    }

    /**
     * Ruft den Wert der hasAluminium-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getHasAluminium() {
        return hasAluminium;
    }

    /**
     * Legt den Wert der hasAluminium-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setHasAluminium(FieldBoolean value) {
        this.hasAluminium = value;
    }

    /**
     * Ruft den Wert der isDomusPart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getIsDomusPart() {
        return isDomusPart;
    }

    /**
     * Legt den Wert der isDomusPart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setIsDomusPart(FieldBoolean value) {
        this.isDomusPart = value;
    }

    /**
     * Ruft den Wert der position-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPosition() {
        return position;
    }

    /**
     * Legt den Wert der position-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPosition(FieldString value) {
        this.position = value;
    }

    /**
     * Ruft den Wert der apos2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getApos2() {
        return apos2;
    }

    /**
     * Legt den Wert der apos2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setApos2(FieldString value) {
        this.apos2 = value;
    }

    /**
     * Ruft den Wert der apos2MainWork-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getApos2MainWork() {
        return apos2MainWork;
    }

    /**
     * Legt den Wert der apos2MainWork-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setApos2MainWork(FieldString value) {
        this.apos2MainWork = value;
    }

    /**
     * Ruft den Wert der constructionGroupMainType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getConstructionGroupMainType() {
        return constructionGroupMainType;
    }

    /**
     * Legt den Wert der constructionGroupMainType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setConstructionGroupMainType(FieldInteger value) {
        this.constructionGroupMainType = value;
    }

    /**
     * Ruft den Wert der constructionGroupManufacturer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getConstructionGroupManufacturer() {
        return constructionGroupManufacturer;
    }

    /**
     * Legt den Wert der constructionGroupManufacturer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setConstructionGroupManufacturer(FieldInteger value) {
        this.constructionGroupManufacturer = value;
    }

    /**
     * Ruft den Wert der dvnGroupPositionNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDVNGroupPositionNumber() {
        return dvnGroupPositionNumber;
    }

    /**
     * Legt den Wert der dvnGroupPositionNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDVNGroupPositionNumber(FieldInteger value) {
        this.dvnGroupPositionNumber = value;
    }

    /**
     * Ruft den Wert der measure-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getMeasure() {
        return measure;
    }

    /**
     * Legt den Wert der measure-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setMeasure(FieldString value) {
        this.measure = value;
    }

    /**
     * Ruft den Wert der repairVector-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getRepairVector() {
        return repairVector;
    }

    /**
     * Legt den Wert der repairVector-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setRepairVector(FieldString value) {
        this.repairVector = value;
    }

    /**
     * Ruft den Wert der seqNo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSeqNo() {
        return seqNo;
    }

    /**
     * Legt den Wert der seqNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSeqNo(FieldDecimal value) {
        this.seqNo = value;
    }

    /**
     * Ruft den Wert der sparePartDiscountIndicator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldCharacter }
     *     
     */
    public FieldCharacter getSparePartDiscountIndicator() {
        return sparePartDiscountIndicator;
    }

    /**
     * Legt den Wert der sparePartDiscountIndicator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldCharacter }
     *     
     */
    public void setSparePartDiscountIndicator(FieldCharacter value) {
        this.sparePartDiscountIndicator = value;
    }

    /**
     * Ruft den Wert der wearGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getWearGroup() {
        return wearGroup;
    }

    /**
     * Legt den Wert der wearGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setWearGroup(FieldString value) {
        this.wearGroup = value;
    }

    /**
     * Ruft den Wert der wearAge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getWearAge() {
        return wearAge;
    }

    /**
     * Legt den Wert der wearAge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setWearAge(FieldInteger value) {
        this.wearAge = value;
    }

    /**
     * Ruft den Wert der wearMileage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getWearMileage() {
        return wearMileage;
    }

    /**
     * Legt den Wert der wearMileage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setWearMileage(FieldInteger value) {
        this.wearMileage = value;
    }

    /**
     * Ruft den Wert der wearAdditional-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWearAdditional() {
        return wearAdditional;
    }

    /**
     * Legt den Wert der wearAdditional-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWearAdditional(FieldDecimal value) {
        this.wearAdditional = value;
    }

    /**
     * Ruft den Wert der finishtype-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getFinishtype() {
        return finishtype;
    }

    /**
     * Legt den Wert der finishtype-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setFinishtype(FieldString value) {
        this.finishtype = value;
    }

    /**
     * Ruft den Wert der lacquerDifficulty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLacquerDifficulty() {
        return lacquerDifficulty;
    }

    /**
     * Legt den Wert der lacquerDifficulty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLacquerDifficulty(FieldInteger value) {
        this.lacquerDifficulty = value;
    }

    /**
     * Ruft den Wert der grupoPlastico-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getGrupoPlastico() {
        return grupoPlastico;
    }

    /**
     * Legt den Wert der grupoPlastico-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setGrupoPlastico(FieldString value) {
        this.grupoPlastico = value;
    }

    /**
     * Ruft den Wert der inputSPD-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getInputSPD() {
        return inputSPD;
    }

    /**
     * Legt den Wert der inputSPD-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setInputSPD(FieldInteger value) {
        this.inputSPD = value;
    }

    /**
     * Ruft den Wert der inputLP-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getInputLP() {
        return inputLP;
    }

    /**
     * Legt den Wert der inputLP-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setInputLP(FieldInteger value) {
        this.inputLP = value;
    }

    /**
     * Ruft den Wert der inputSDE-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getInputSDE() {
        return inputSDE;
    }

    /**
     * Legt den Wert der inputSDE-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setInputSDE(FieldInteger value) {
        this.inputSDE = value;
    }

    /**
     * Ruft den Wert der inputSDI-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getInputSDI() {
        return inputSDI;
    }

    /**
     * Legt den Wert der inputSDI-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setInputSDI(FieldInteger value) {
        this.inputSDI = value;
    }

    /**
     * Ruft den Wert der inputL-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getInputL() {
        return inputL;
    }

    /**
     * Legt den Wert der inputL-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setInputL(FieldInteger value) {
        this.inputL = value;
    }

    /**
     * Ruft den Wert der piezasPO-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPiezasPO() {
        return piezasPO;
    }

    /**
     * Legt den Wert der piezasPO-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPiezasPO(FieldString value) {
        this.piezasPO = value;
    }

    /**
     * Ruft den Wert der piezasOP-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPiezasOP() {
        return piezasOP;
    }

    /**
     * Legt den Wert der piezasOP-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPiezasOP(FieldString value) {
        this.piezasOP = value;
    }

    /**
     * Ruft den Wert der bulgeArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getBulgeArea() {
        return bulgeArea;
    }

    /**
     * Legt den Wert der bulgeArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setBulgeArea(FieldInteger value) {
        this.bulgeArea = value;
    }

    /**
     * Ruft den Wert der bulgeAreaDifficultyFactor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getBulgeAreaDifficultyFactor() {
        return bulgeAreaDifficultyFactor;
    }

    /**
     * Legt den Wert der bulgeAreaDifficultyFactor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setBulgeAreaDifficultyFactor(FieldInteger value) {
        this.bulgeAreaDifficultyFactor = value;
    }

    /**
     * Ruft den Wert der dmsFlag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDMSFlag() {
        return dmsFlag;
    }

    /**
     * Legt den Wert der dmsFlag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDMSFlag(FieldString value) {
        this.dmsFlag = value;
    }

    /**
     * Ruft den Wert der partCodeItaly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPartCodeItaly() {
        return partCodeItaly;
    }

    /**
     * Legt den Wert der partCodeItaly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPartCodeItaly(FieldString value) {
        this.partCodeItaly = value;
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLocation(FieldString value) {
        this.location = value;
    }

    /**
     * Ruft den Wert der workTimeItaly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWorkTimeItaly() {
        return workTimeItaly;
    }

    /**
     * Legt den Wert der workTimeItaly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWorkTimeItaly(FieldDecimal value) {
        this.workTimeItaly = value;
    }

    /**
     * Ruft den Wert der workLevelItaly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getWorkLevelItaly() {
        return workLevelItaly;
    }

    /**
     * Legt den Wert der workLevelItaly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setWorkLevelItaly(FieldString value) {
        this.workLevelItaly = value;
    }

    /**
     * Ruft den Wert der nfoPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getNFOPercentage() {
        return nfoPercentage;
    }

    /**
     * Legt den Wert der nfoPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setNFOPercentage(FieldDecimal value) {
        this.nfoPercentage = value;
    }

    /**
     * Ruft den Wert der predamageAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPredamageAmount() {
        return predamageAmount;
    }

    /**
     * Legt den Wert der predamageAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPredamageAmount(FieldDecimal value) {
        this.predamageAmount = value;
    }

    /**
     * Ruft den Wert der predamagePercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPredamagePercentage() {
        return predamagePercentage;
    }

    /**
     * Legt den Wert der predamagePercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPredamagePercentage(FieldDecimal value) {
        this.predamagePercentage = value;
    }

    /**
     * Ruft den Wert der adhesiveMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getAdhesiveMethod() {
        return adhesiveMethod;
    }

    /**
     * Legt den Wert der adhesiveMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setAdhesiveMethod(FieldBoolean value) {
        this.adhesiveMethod = value;
    }

    /**
     * Ruft den Wert der length-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLength() {
        return length;
    }

    /**
     * Legt den Wert der length-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLength(FieldDecimal value) {
        this.length = value;
    }

    /**
     * Ruft den Wert der width-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWidth() {
        return width;
    }

    /**
     * Legt den Wert der width-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWidth(FieldDecimal value) {
        this.width = value;
    }

    /**
     * Ruft den Wert der predefined-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getPredefined() {
        return predefined;
    }

    /**
     * Legt den Wert der predefined-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setPredefined(FieldBoolean value) {
        this.predefined = value;
    }

    /**
     * Ruft den Wert der manufacturer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getManufacturer() {
        return manufacturer;
    }

    /**
     * Legt den Wert der manufacturer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setManufacturer(FieldString value) {
        this.manufacturer = value;
    }

    /**
     * Ruft den Wert der dimension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDimension() {
        return dimension;
    }

    /**
     * Legt den Wert der dimension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDimension(FieldString value) {
        this.dimension = value;
    }

    /**
     * Ruft den Wert der positionExecutionFlag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPositionExecutionFlag() {
        return positionExecutionFlag;
    }

    /**
     * Legt den Wert der positionExecutionFlag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPositionExecutionFlag(FieldString value) {
        this.positionExecutionFlag = value;
    }

    /**
     * Ruft den Wert der positionGoodwillPartDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPositionGoodwillPartDescription() {
        return positionGoodwillPartDescription;
    }

    /**
     * Legt den Wert der positionGoodwillPartDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPositionGoodwillPartDescription(FieldString value) {
        this.positionGoodwillPartDescription = value;
    }

    /**
     * Ruft den Wert der positionEntryTypeKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getPositionEntryTypeKey() {
        return positionEntryTypeKey;
    }

    /**
     * Legt den Wert der positionEntryTypeKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setPositionEntryTypeKey(FieldInteger value) {
        this.positionEntryTypeKey = value;
    }

    /**
     * Ruft den Wert der workIndication-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getWorkIndication() {
        return workIndication;
    }

    /**
     * Legt den Wert der workIndication-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setWorkIndication(FieldInteger value) {
        this.workIndication = value;
    }

    /**
     * Ruft den Wert der withSparePart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getWithSparePart() {
        return withSparePart;
    }

    /**
     * Legt den Wert der withSparePart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setWithSparePart(FieldBoolean value) {
        this.withSparePart = value;
    }

}
