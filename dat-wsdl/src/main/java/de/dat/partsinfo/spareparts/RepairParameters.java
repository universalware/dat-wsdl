
package de.dat.partsinfo.spareparts;

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
 *         &lt;element name="SeriesSpecific" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="PhantomCalculation" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="PartsCorrection" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PartsDiscountPercentage" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PartsDiscountAmount" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PartsDiscountPercentageForOpt" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PartsDiscountAmountForOpt" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PartsFlatrate" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConsumablesType" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConsumablesFlatAmount" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConsumablesPercentage" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConsumablesPercentageForOpt" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ProcurementCosts" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ProcurementCostsMaterial" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ProcurementCostsBodyInWhite" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ProcurementCostsAlignmentBrackets" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ProcurementCostsPercentage" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ProcurementCostsPercentageBodyInWhite" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ProcurementCostsMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ProcurementCostsBodyInWhiteMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PriceDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerFremdleistungGlobal" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerMethod" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerTypeId" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerTypeLayers" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerDismountedPrelacquer" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerPlasticMounted" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerWithoutDisassembly" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerWithForcedDisassembly" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerReducedLeadTime" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerWithRack" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerAdditionTwoColor" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerAdditionMattpaint" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerAdjustmentMixingUnit" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerAdjustmentMixingColours" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerAdjustmentExemplarySheets" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerCompleteFlatrate" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerWorkFlatrate" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerMaterialFlatrate" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SpecialLacquerAward" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerMaterialPercentage" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerMaterialIndex" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerMaterialChargePerPoint" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerMaterialPriceCategory" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerMaterialPrintDescr" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerLeadTimeMetal" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerLeadTimePlastic" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerLeadTimePercentage" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerDisposalCosts" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerCoveringPanes" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerCoveringDismountedPlastic" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerMattBlackWindowFrames" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerWageDiscountAmount" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerWageDiscountPercentage" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerWageDiscountAmountForOpt" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerWageDiscountPercentageForOpt" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerMaterialDiscountAmount" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerMaterialDiscountPercentage" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerMaterialDiscountAmountForOpt" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerMaterialDiscountPercentageForOpt" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerCompleteDiscountAmount" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerCompleteDiscountPercentage" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerCompleteDiscountAmountForOpt" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerCompleteDiscountPercentageForOpt" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerPaintWorkDiscountPercentage" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerTimeUnitSystem" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerTimeUnitsPerHour" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="TimeUnitSystem" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="TimeUnitsPerHour" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="TimeUnitsOfManufacturer" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="RepairWageDiscountPercentage" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="RepairWageDiscountAmount" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="RepairWageDiscountPercentageForOpt" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="RepairWageDiscountAmountForOpt" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="RepairWageFlatrate" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LongWorkDescriptions" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="AllIncludedWork" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="FeeAE" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WithDomusCalculation" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="PriceLevel" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerDiscountFactor" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WearBodyAge" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WearBodyCorrosion" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WearTyreMinSize" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WearTyreActualSize" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WearTyreSize" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WearTyreAge" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="WearBatAge" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WearBatTime" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WearPlasticAge" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WearCompAge" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WearCompMileage" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WearCompTypeId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="WearCompTypeDesc" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="CalculationType" type="{http://www.dat.de/vxs}fieldCharacter" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConsumablesOfWagePerc" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConsumablesPercentageSmallPartsForOpt" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="IndicatorDataUsedAsPattern" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="IndicatorIsGlassCalculation" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="IndicatorGlassCalculationWithoutWork" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="IndicatorOptBodyShell" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="IndicatorTimeUnitsInHours" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="IndicatorWarrantyCalculation" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="IndicatorWithoutBodyCavityAndUnderseal" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="LevelOneE" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LevelOneJ" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LevelOneM" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LevelThree" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LevelTwo" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="MaterialConstantPartsIntegrated" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="MaterialConstantPartsRemoved" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="MaterialConstantByAmount" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="MaterialCostsPerUnit1CoatPainting" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ProcurementCostsPercBodyShellForOpt" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="RentingCostsAlignmentBrackets" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SparePartsDisposalCostsPerc" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="CalculationWithoutConstants" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerScratchResistant" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="PearlEffectSurcharge" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ColorCount" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DMSCalculation" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="DMSPaintWPN" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ExternalProvider" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ExternalProviderStatus" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="TotalPredamageAmount" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TotalNFOAmount" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TotalNFOPercent" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TotalValueImprovementAmount" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="AdditionalCostsFlatAmount" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="AdditionalCostsPercent" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DisposalCostsSparePartsPercentage" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}LacquerAdjustments" minOccurs="0"/>
 *         &lt;element name="PartsSurchargeInProtocol" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="PartsSurchargeSeparated" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="AztFourLayerLacquerMode" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="AztThreeLayerLacquerMode" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerWaterBasedPaintSurcharge" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "RepairParameters")
public class RepairParameters {

    @XmlElement(name = "SeriesSpecific")
    protected FieldBoolean seriesSpecific;
    @XmlElement(name = "PhantomCalculation")
    protected FieldBoolean phantomCalculation;
    @XmlElement(name = "PartsCorrection")
    protected FieldDecimal partsCorrection;
    @XmlElement(name = "PartsDiscountPercentage")
    protected FieldDecimal partsDiscountPercentage;
    @XmlElement(name = "PartsDiscountAmount")
    protected FieldDecimal partsDiscountAmount;
    @XmlElement(name = "PartsDiscountPercentageForOpt")
    protected FieldDecimal partsDiscountPercentageForOpt;
    @XmlElement(name = "PartsDiscountAmountForOpt")
    protected FieldDecimal partsDiscountAmountForOpt;
    @XmlElement(name = "PartsFlatrate")
    protected FieldDecimal partsFlatrate;
    @XmlElement(name = "ConsumablesType")
    protected FieldInteger consumablesType;
    @XmlElement(name = "ConsumablesFlatAmount")
    protected FieldDecimal consumablesFlatAmount;
    @XmlElement(name = "ConsumablesPercentage")
    protected FieldDecimal consumablesPercentage;
    @XmlElement(name = "ConsumablesPercentageForOpt")
    protected FieldDecimal consumablesPercentageForOpt;
    @XmlElement(name = "ProcurementCosts")
    protected FieldDecimal procurementCosts;
    @XmlElement(name = "ProcurementCostsMaterial")
    protected FieldDecimal procurementCostsMaterial;
    @XmlElement(name = "ProcurementCostsBodyInWhite")
    protected FieldDecimal procurementCostsBodyInWhite;
    @XmlElement(name = "ProcurementCostsAlignmentBrackets")
    protected FieldDecimal procurementCostsAlignmentBrackets;
    @XmlElement(name = "ProcurementCostsPercentage")
    protected FieldDecimal procurementCostsPercentage;
    @XmlElement(name = "ProcurementCostsPercentageBodyInWhite")
    protected FieldDecimal procurementCostsPercentageBodyInWhite;
    @XmlElement(name = "ProcurementCostsMax")
    protected FieldDecimal procurementCostsMax;
    @XmlElement(name = "ProcurementCostsBodyInWhiteMax")
    protected FieldDecimal procurementCostsBodyInWhiteMax;
    @XmlElement(name = "PriceDate")
    protected FieldDate priceDate;
    @XmlElement(name = "LacquerFremdleistungGlobal")
    protected FieldString lacquerFremdleistungGlobal;
    @XmlElement(name = "LacquerMethod")
    protected FieldString lacquerMethod;
    @XmlElement(name = "LacquerTypeId")
    protected FieldString lacquerTypeId;
    @XmlElement(name = "LacquerType")
    protected FieldString lacquerType;
    @XmlElement(name = "LacquerTypeLayers")
    protected FieldInteger lacquerTypeLayers;
    @XmlElement(name = "LacquerDismountedPrelacquer")
    protected FieldBoolean lacquerDismountedPrelacquer;
    @XmlElement(name = "LacquerPlasticMounted")
    protected FieldBoolean lacquerPlasticMounted;
    @XmlElement(name = "LacquerWithoutDisassembly")
    protected FieldBoolean lacquerWithoutDisassembly;
    @XmlElement(name = "LacquerWithForcedDisassembly")
    protected FieldBoolean lacquerWithForcedDisassembly;
    @XmlElement(name = "LacquerReducedLeadTime")
    protected FieldBoolean lacquerReducedLeadTime;
    @XmlElement(name = "LacquerWithRack")
    protected FieldBoolean lacquerWithRack;
    @XmlElement(name = "LacquerAdditionTwoColor")
    protected FieldBoolean lacquerAdditionTwoColor;
    @XmlElement(name = "LacquerAdditionMattpaint")
    protected FieldBoolean lacquerAdditionMattpaint;
    @XmlElement(name = "LacquerAdjustmentMixingUnit")
    protected FieldBoolean lacquerAdjustmentMixingUnit;
    @XmlElement(name = "LacquerAdjustmentMixingColours")
    protected FieldInteger lacquerAdjustmentMixingColours;
    @XmlElement(name = "LacquerAdjustmentExemplarySheets")
    protected FieldInteger lacquerAdjustmentExemplarySheets;
    @XmlElement(name = "LacquerCompleteFlatrate")
    protected FieldDecimal lacquerCompleteFlatrate;
    @XmlElement(name = "LacquerWorkFlatrate")
    protected FieldDecimal lacquerWorkFlatrate;
    @XmlElement(name = "LacquerMaterialFlatrate")
    protected FieldDecimal lacquerMaterialFlatrate;
    @XmlElement(name = "SpecialLacquerAward")
    protected FieldDecimal specialLacquerAward;
    @XmlElement(name = "LacquerMaterialPercentage")
    protected FieldDecimal lacquerMaterialPercentage;
    @XmlElement(name = "LacquerMaterialIndex")
    protected FieldInteger lacquerMaterialIndex;
    @XmlElement(name = "LacquerMaterialChargePerPoint")
    protected FieldDecimal lacquerMaterialChargePerPoint;
    @XmlElement(name = "LacquerMaterialPriceCategory")
    protected FieldInteger lacquerMaterialPriceCategory;
    @XmlElement(name = "LacquerMaterialPrintDescr")
    protected FieldBoolean lacquerMaterialPrintDescr;
    @XmlElement(name = "LacquerLeadTimeMetal")
    protected FieldDecimal lacquerLeadTimeMetal;
    @XmlElement(name = "LacquerLeadTimePlastic")
    protected FieldDecimal lacquerLeadTimePlastic;
    @XmlElement(name = "LacquerLeadTimePercentage")
    protected FieldDecimal lacquerLeadTimePercentage;
    @XmlElement(name = "LacquerDisposalCosts")
    protected FieldDecimal lacquerDisposalCosts;
    @XmlElement(name = "LacquerCoveringPanes")
    protected FieldInteger lacquerCoveringPanes;
    @XmlElement(name = "LacquerCoveringDismountedPlastic")
    protected FieldInteger lacquerCoveringDismountedPlastic;
    @XmlElement(name = "LacquerMattBlackWindowFrames")
    protected FieldInteger lacquerMattBlackWindowFrames;
    @XmlElement(name = "LacquerWageDiscountAmount")
    protected FieldDecimal lacquerWageDiscountAmount;
    @XmlElement(name = "LacquerWageDiscountPercentage")
    protected FieldDecimal lacquerWageDiscountPercentage;
    @XmlElement(name = "LacquerWageDiscountAmountForOpt")
    protected FieldDecimal lacquerWageDiscountAmountForOpt;
    @XmlElement(name = "LacquerWageDiscountPercentageForOpt")
    protected FieldDecimal lacquerWageDiscountPercentageForOpt;
    @XmlElement(name = "LacquerMaterialDiscountAmount")
    protected FieldDecimal lacquerMaterialDiscountAmount;
    @XmlElement(name = "LacquerMaterialDiscountPercentage")
    protected FieldDecimal lacquerMaterialDiscountPercentage;
    @XmlElement(name = "LacquerMaterialDiscountAmountForOpt")
    protected FieldDecimal lacquerMaterialDiscountAmountForOpt;
    @XmlElement(name = "LacquerMaterialDiscountPercentageForOpt")
    protected FieldDecimal lacquerMaterialDiscountPercentageForOpt;
    @XmlElement(name = "LacquerCompleteDiscountAmount")
    protected FieldDecimal lacquerCompleteDiscountAmount;
    @XmlElement(name = "LacquerCompleteDiscountPercentage")
    protected FieldDecimal lacquerCompleteDiscountPercentage;
    @XmlElement(name = "LacquerCompleteDiscountAmountForOpt")
    protected FieldDecimal lacquerCompleteDiscountAmountForOpt;
    @XmlElement(name = "LacquerCompleteDiscountPercentageForOpt")
    protected FieldDecimal lacquerCompleteDiscountPercentageForOpt;
    @XmlElement(name = "LacquerPaintWorkDiscountPercentage")
    protected FieldDecimal lacquerPaintWorkDiscountPercentage;
    @XmlElement(name = "LacquerTimeUnitSystem")
    protected FieldString lacquerTimeUnitSystem;
    @XmlElement(name = "LacquerTimeUnitsPerHour")
    protected FieldInteger lacquerTimeUnitsPerHour;
    @XmlElement(name = "TimeUnitSystem")
    protected FieldString timeUnitSystem;
    @XmlElement(name = "TimeUnitsPerHour")
    protected FieldInteger timeUnitsPerHour;
    @XmlElement(name = "TimeUnitsOfManufacturer")
    protected FieldBoolean timeUnitsOfManufacturer;
    @XmlElement(name = "RepairWageDiscountPercentage")
    protected FieldDecimal repairWageDiscountPercentage;
    @XmlElement(name = "RepairWageDiscountAmount")
    protected FieldDecimal repairWageDiscountAmount;
    @XmlElement(name = "RepairWageDiscountPercentageForOpt")
    protected FieldDecimal repairWageDiscountPercentageForOpt;
    @XmlElement(name = "RepairWageDiscountAmountForOpt")
    protected FieldDecimal repairWageDiscountAmountForOpt;
    @XmlElement(name = "RepairWageFlatrate")
    protected FieldDecimal repairWageFlatrate;
    @XmlElement(name = "LongWorkDescriptions")
    protected FieldBoolean longWorkDescriptions;
    @XmlElement(name = "AllIncludedWork")
    protected FieldBoolean allIncludedWork;
    @XmlElement(name = "FeeAE")
    protected FieldDecimal feeAE;
    @XmlElement(name = "WithDomusCalculation")
    protected FieldBoolean withDomusCalculation;
    @XmlElement(name = "PriceLevel")
    protected FieldInteger priceLevel;
    @XmlElement(name = "LacquerDiscountFactor")
    protected FieldDecimal lacquerDiscountFactor;
    @XmlElement(name = "WearBodyAge")
    protected FieldDecimal wearBodyAge;
    @XmlElement(name = "WearBodyCorrosion")
    protected FieldDecimal wearBodyCorrosion;
    @XmlElement(name = "WearTyreMinSize")
    protected FieldDecimal wearTyreMinSize;
    @XmlElement(name = "WearTyreActualSize")
    protected FieldDecimal wearTyreActualSize;
    @XmlElement(name = "WearTyreSize")
    protected FieldDecimal wearTyreSize;
    @XmlElement(name = "WearTyreAge")
    protected FieldString wearTyreAge;
    @XmlElement(name = "WearBatAge")
    protected FieldDecimal wearBatAge;
    @XmlElement(name = "WearBatTime")
    protected FieldDecimal wearBatTime;
    @XmlElement(name = "WearPlasticAge")
    protected FieldDecimal wearPlasticAge;
    @XmlElement(name = "WearCompAge")
    protected FieldDecimal wearCompAge;
    @XmlElement(name = "WearCompMileage")
    protected FieldDecimal wearCompMileage;
    @XmlElement(name = "WearCompTypeId")
    protected FieldInteger wearCompTypeId;
    @XmlElement(name = "WearCompTypeDesc")
    protected FieldString wearCompTypeDesc;
    @XmlElement(name = "CalculationType")
    protected FieldCharacter calculationType;
    @XmlElement(name = "ConsumablesOfWagePerc")
    protected FieldDecimal consumablesOfWagePerc;
    @XmlElement(name = "ConsumablesPercentageSmallPartsForOpt")
    protected FieldDecimal consumablesPercentageSmallPartsForOpt;
    @XmlElement(name = "IndicatorDataUsedAsPattern")
    protected FieldBoolean indicatorDataUsedAsPattern;
    @XmlElement(name = "IndicatorIsGlassCalculation")
    protected FieldBoolean indicatorIsGlassCalculation;
    @XmlElement(name = "IndicatorGlassCalculationWithoutWork")
    protected FieldBoolean indicatorGlassCalculationWithoutWork;
    @XmlElement(name = "IndicatorOptBodyShell")
    protected FieldBoolean indicatorOptBodyShell;
    @XmlElement(name = "IndicatorTimeUnitsInHours")
    protected FieldBoolean indicatorTimeUnitsInHours;
    @XmlElement(name = "IndicatorWarrantyCalculation")
    protected FieldBoolean indicatorWarrantyCalculation;
    @XmlElement(name = "IndicatorWithoutBodyCavityAndUnderseal")
    protected FieldBoolean indicatorWithoutBodyCavityAndUnderseal;
    @XmlElement(name = "LevelOneE")
    protected FieldDecimal levelOneE;
    @XmlElement(name = "LevelOneJ")
    protected FieldDecimal levelOneJ;
    @XmlElement(name = "LevelOneM")
    protected FieldDecimal levelOneM;
    @XmlElement(name = "LevelThree")
    protected FieldDecimal levelThree;
    @XmlElement(name = "LevelTwo")
    protected FieldDecimal levelTwo;
    @XmlElement(name = "MaterialConstantPartsIntegrated")
    protected FieldDecimal materialConstantPartsIntegrated;
    @XmlElement(name = "MaterialConstantPartsRemoved")
    protected FieldDecimal materialConstantPartsRemoved;
    @XmlElement(name = "MaterialConstantByAmount")
    protected FieldDecimal materialConstantByAmount;
    @XmlElement(name = "MaterialCostsPerUnit1CoatPainting")
    protected FieldDecimal materialCostsPerUnit1CoatPainting;
    @XmlElement(name = "ProcurementCostsPercBodyShellForOpt")
    protected FieldDecimal procurementCostsPercBodyShellForOpt;
    @XmlElement(name = "RentingCostsAlignmentBrackets")
    protected FieldDecimal rentingCostsAlignmentBrackets;
    @XmlElement(name = "SparePartsDisposalCostsPerc")
    protected FieldDecimal sparePartsDisposalCostsPerc;
    @XmlElement(name = "CalculationWithoutConstants")
    protected FieldBoolean calculationWithoutConstants;
    @XmlElement(name = "LacquerScratchResistant")
    protected FieldBoolean lacquerScratchResistant;
    @XmlElement(name = "PearlEffectSurcharge")
    protected FieldDecimal pearlEffectSurcharge;
    @XmlElement(name = "ColorCount")
    protected FieldInteger colorCount;
    @XmlElement(name = "DMSCalculation")
    protected FieldBoolean dmsCalculation;
    @XmlElement(name = "DMSPaintWPN")
    protected FieldString dmsPaintWPN;
    @XmlElement(name = "ExternalProvider")
    protected FieldString externalProvider;
    @XmlElement(name = "ExternalProviderStatus")
    protected FieldInteger externalProviderStatus;
    @XmlElement(name = "TotalPredamageAmount")
    protected FieldDecimal totalPredamageAmount;
    @XmlElement(name = "TotalNFOAmount")
    protected FieldDecimal totalNFOAmount;
    @XmlElement(name = "TotalNFOPercent")
    protected FieldDecimal totalNFOPercent;
    @XmlElement(name = "TotalValueImprovementAmount")
    protected FieldDecimal totalValueImprovementAmount;
    @XmlElement(name = "AdditionalCostsFlatAmount")
    protected FieldDecimal additionalCostsFlatAmount;
    @XmlElement(name = "AdditionalCostsPercent")
    protected FieldDecimal additionalCostsPercent;
    @XmlElement(name = "DisposalCostsSparePartsPercentage")
    protected FieldDecimal disposalCostsSparePartsPercentage;
    @XmlElement(name = "LacquerAdjustments")
    protected LacquerAdjustments lacquerAdjustments;
    @XmlElement(name = "PartsSurchargeInProtocol")
    protected FieldBoolean partsSurchargeInProtocol;
    @XmlElement(name = "PartsSurchargeSeparated")
    protected FieldBoolean partsSurchargeSeparated;
    @XmlElement(name = "AztFourLayerLacquerMode")
    protected FieldString aztFourLayerLacquerMode;
    @XmlElement(name = "AztThreeLayerLacquerMode")
    protected FieldString aztThreeLayerLacquerMode;
    @XmlElement(name = "LacquerWaterBasedPaintSurcharge")
    protected FieldBoolean lacquerWaterBasedPaintSurcharge;

    /**
     * Ruft den Wert der seriesSpecific-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getSeriesSpecific() {
        return seriesSpecific;
    }

    /**
     * Legt den Wert der seriesSpecific-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setSeriesSpecific(FieldBoolean value) {
        this.seriesSpecific = value;
    }

    /**
     * Ruft den Wert der phantomCalculation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getPhantomCalculation() {
        return phantomCalculation;
    }

    /**
     * Legt den Wert der phantomCalculation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setPhantomCalculation(FieldBoolean value) {
        this.phantomCalculation = value;
    }

    /**
     * Ruft den Wert der partsCorrection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPartsCorrection() {
        return partsCorrection;
    }

    /**
     * Legt den Wert der partsCorrection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPartsCorrection(FieldDecimal value) {
        this.partsCorrection = value;
    }

    /**
     * Ruft den Wert der partsDiscountPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPartsDiscountPercentage() {
        return partsDiscountPercentage;
    }

    /**
     * Legt den Wert der partsDiscountPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPartsDiscountPercentage(FieldDecimal value) {
        this.partsDiscountPercentage = value;
    }

    /**
     * Ruft den Wert der partsDiscountAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPartsDiscountAmount() {
        return partsDiscountAmount;
    }

    /**
     * Legt den Wert der partsDiscountAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPartsDiscountAmount(FieldDecimal value) {
        this.partsDiscountAmount = value;
    }

    /**
     * Ruft den Wert der partsDiscountPercentageForOpt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPartsDiscountPercentageForOpt() {
        return partsDiscountPercentageForOpt;
    }

    /**
     * Legt den Wert der partsDiscountPercentageForOpt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPartsDiscountPercentageForOpt(FieldDecimal value) {
        this.partsDiscountPercentageForOpt = value;
    }

    /**
     * Ruft den Wert der partsDiscountAmountForOpt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPartsDiscountAmountForOpt() {
        return partsDiscountAmountForOpt;
    }

    /**
     * Legt den Wert der partsDiscountAmountForOpt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPartsDiscountAmountForOpt(FieldDecimal value) {
        this.partsDiscountAmountForOpt = value;
    }

    /**
     * Ruft den Wert der partsFlatrate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPartsFlatrate() {
        return partsFlatrate;
    }

    /**
     * Legt den Wert der partsFlatrate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPartsFlatrate(FieldDecimal value) {
        this.partsFlatrate = value;
    }

    /**
     * Ruft den Wert der consumablesType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getConsumablesType() {
        return consumablesType;
    }

    /**
     * Legt den Wert der consumablesType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setConsumablesType(FieldInteger value) {
        this.consumablesType = value;
    }

    /**
     * Ruft den Wert der consumablesFlatAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getConsumablesFlatAmount() {
        return consumablesFlatAmount;
    }

    /**
     * Legt den Wert der consumablesFlatAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setConsumablesFlatAmount(FieldDecimal value) {
        this.consumablesFlatAmount = value;
    }

    /**
     * Ruft den Wert der consumablesPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getConsumablesPercentage() {
        return consumablesPercentage;
    }

    /**
     * Legt den Wert der consumablesPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setConsumablesPercentage(FieldDecimal value) {
        this.consumablesPercentage = value;
    }

    /**
     * Ruft den Wert der consumablesPercentageForOpt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getConsumablesPercentageForOpt() {
        return consumablesPercentageForOpt;
    }

    /**
     * Legt den Wert der consumablesPercentageForOpt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setConsumablesPercentageForOpt(FieldDecimal value) {
        this.consumablesPercentageForOpt = value;
    }

    /**
     * Ruft den Wert der procurementCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getProcurementCosts() {
        return procurementCosts;
    }

    /**
     * Legt den Wert der procurementCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setProcurementCosts(FieldDecimal value) {
        this.procurementCosts = value;
    }

    /**
     * Ruft den Wert der procurementCostsMaterial-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getProcurementCostsMaterial() {
        return procurementCostsMaterial;
    }

    /**
     * Legt den Wert der procurementCostsMaterial-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setProcurementCostsMaterial(FieldDecimal value) {
        this.procurementCostsMaterial = value;
    }

    /**
     * Ruft den Wert der procurementCostsBodyInWhite-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getProcurementCostsBodyInWhite() {
        return procurementCostsBodyInWhite;
    }

    /**
     * Legt den Wert der procurementCostsBodyInWhite-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setProcurementCostsBodyInWhite(FieldDecimal value) {
        this.procurementCostsBodyInWhite = value;
    }

    /**
     * Ruft den Wert der procurementCostsAlignmentBrackets-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getProcurementCostsAlignmentBrackets() {
        return procurementCostsAlignmentBrackets;
    }

    /**
     * Legt den Wert der procurementCostsAlignmentBrackets-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setProcurementCostsAlignmentBrackets(FieldDecimal value) {
        this.procurementCostsAlignmentBrackets = value;
    }

    /**
     * Ruft den Wert der procurementCostsPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getProcurementCostsPercentage() {
        return procurementCostsPercentage;
    }

    /**
     * Legt den Wert der procurementCostsPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setProcurementCostsPercentage(FieldDecimal value) {
        this.procurementCostsPercentage = value;
    }

    /**
     * Ruft den Wert der procurementCostsPercentageBodyInWhite-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getProcurementCostsPercentageBodyInWhite() {
        return procurementCostsPercentageBodyInWhite;
    }

    /**
     * Legt den Wert der procurementCostsPercentageBodyInWhite-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setProcurementCostsPercentageBodyInWhite(FieldDecimal value) {
        this.procurementCostsPercentageBodyInWhite = value;
    }

    /**
     * Ruft den Wert der procurementCostsMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getProcurementCostsMax() {
        return procurementCostsMax;
    }

    /**
     * Legt den Wert der procurementCostsMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setProcurementCostsMax(FieldDecimal value) {
        this.procurementCostsMax = value;
    }

    /**
     * Ruft den Wert der procurementCostsBodyInWhiteMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getProcurementCostsBodyInWhiteMax() {
        return procurementCostsBodyInWhiteMax;
    }

    /**
     * Legt den Wert der procurementCostsBodyInWhiteMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setProcurementCostsBodyInWhiteMax(FieldDecimal value) {
        this.procurementCostsBodyInWhiteMax = value;
    }

    /**
     * Ruft den Wert der priceDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getPriceDate() {
        return priceDate;
    }

    /**
     * Legt den Wert der priceDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setPriceDate(FieldDate value) {
        this.priceDate = value;
    }

    /**
     * Ruft den Wert der lacquerFremdleistungGlobal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLacquerFremdleistungGlobal() {
        return lacquerFremdleistungGlobal;
    }

    /**
     * Legt den Wert der lacquerFremdleistungGlobal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLacquerFremdleistungGlobal(FieldString value) {
        this.lacquerFremdleistungGlobal = value;
    }

    /**
     * Ruft den Wert der lacquerMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLacquerMethod() {
        return lacquerMethod;
    }

    /**
     * Legt den Wert der lacquerMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLacquerMethod(FieldString value) {
        this.lacquerMethod = value;
    }

    /**
     * Ruft den Wert der lacquerTypeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLacquerTypeId() {
        return lacquerTypeId;
    }

    /**
     * Legt den Wert der lacquerTypeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLacquerTypeId(FieldString value) {
        this.lacquerTypeId = value;
    }

    /**
     * Ruft den Wert der lacquerType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLacquerType() {
        return lacquerType;
    }

    /**
     * Legt den Wert der lacquerType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLacquerType(FieldString value) {
        this.lacquerType = value;
    }

    /**
     * Ruft den Wert der lacquerTypeLayers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLacquerTypeLayers() {
        return lacquerTypeLayers;
    }

    /**
     * Legt den Wert der lacquerTypeLayers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLacquerTypeLayers(FieldInteger value) {
        this.lacquerTypeLayers = value;
    }

    /**
     * Ruft den Wert der lacquerDismountedPrelacquer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getLacquerDismountedPrelacquer() {
        return lacquerDismountedPrelacquer;
    }

    /**
     * Legt den Wert der lacquerDismountedPrelacquer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setLacquerDismountedPrelacquer(FieldBoolean value) {
        this.lacquerDismountedPrelacquer = value;
    }

    /**
     * Ruft den Wert der lacquerPlasticMounted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getLacquerPlasticMounted() {
        return lacquerPlasticMounted;
    }

    /**
     * Legt den Wert der lacquerPlasticMounted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setLacquerPlasticMounted(FieldBoolean value) {
        this.lacquerPlasticMounted = value;
    }

    /**
     * Ruft den Wert der lacquerWithoutDisassembly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getLacquerWithoutDisassembly() {
        return lacquerWithoutDisassembly;
    }

    /**
     * Legt den Wert der lacquerWithoutDisassembly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setLacquerWithoutDisassembly(FieldBoolean value) {
        this.lacquerWithoutDisassembly = value;
    }

    /**
     * Ruft den Wert der lacquerWithForcedDisassembly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getLacquerWithForcedDisassembly() {
        return lacquerWithForcedDisassembly;
    }

    /**
     * Legt den Wert der lacquerWithForcedDisassembly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setLacquerWithForcedDisassembly(FieldBoolean value) {
        this.lacquerWithForcedDisassembly = value;
    }

    /**
     * Ruft den Wert der lacquerReducedLeadTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getLacquerReducedLeadTime() {
        return lacquerReducedLeadTime;
    }

    /**
     * Legt den Wert der lacquerReducedLeadTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setLacquerReducedLeadTime(FieldBoolean value) {
        this.lacquerReducedLeadTime = value;
    }

    /**
     * Ruft den Wert der lacquerWithRack-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getLacquerWithRack() {
        return lacquerWithRack;
    }

    /**
     * Legt den Wert der lacquerWithRack-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setLacquerWithRack(FieldBoolean value) {
        this.lacquerWithRack = value;
    }

    /**
     * Ruft den Wert der lacquerAdditionTwoColor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getLacquerAdditionTwoColor() {
        return lacquerAdditionTwoColor;
    }

    /**
     * Legt den Wert der lacquerAdditionTwoColor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setLacquerAdditionTwoColor(FieldBoolean value) {
        this.lacquerAdditionTwoColor = value;
    }

    /**
     * Ruft den Wert der lacquerAdditionMattpaint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getLacquerAdditionMattpaint() {
        return lacquerAdditionMattpaint;
    }

    /**
     * Legt den Wert der lacquerAdditionMattpaint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setLacquerAdditionMattpaint(FieldBoolean value) {
        this.lacquerAdditionMattpaint = value;
    }

    /**
     * Ruft den Wert der lacquerAdjustmentMixingUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getLacquerAdjustmentMixingUnit() {
        return lacquerAdjustmentMixingUnit;
    }

    /**
     * Legt den Wert der lacquerAdjustmentMixingUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setLacquerAdjustmentMixingUnit(FieldBoolean value) {
        this.lacquerAdjustmentMixingUnit = value;
    }

    /**
     * Ruft den Wert der lacquerAdjustmentMixingColours-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLacquerAdjustmentMixingColours() {
        return lacquerAdjustmentMixingColours;
    }

    /**
     * Legt den Wert der lacquerAdjustmentMixingColours-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLacquerAdjustmentMixingColours(FieldInteger value) {
        this.lacquerAdjustmentMixingColours = value;
    }

    /**
     * Ruft den Wert der lacquerAdjustmentExemplarySheets-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLacquerAdjustmentExemplarySheets() {
        return lacquerAdjustmentExemplarySheets;
    }

    /**
     * Legt den Wert der lacquerAdjustmentExemplarySheets-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLacquerAdjustmentExemplarySheets(FieldInteger value) {
        this.lacquerAdjustmentExemplarySheets = value;
    }

    /**
     * Ruft den Wert der lacquerCompleteFlatrate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerCompleteFlatrate() {
        return lacquerCompleteFlatrate;
    }

    /**
     * Legt den Wert der lacquerCompleteFlatrate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerCompleteFlatrate(FieldDecimal value) {
        this.lacquerCompleteFlatrate = value;
    }

    /**
     * Ruft den Wert der lacquerWorkFlatrate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerWorkFlatrate() {
        return lacquerWorkFlatrate;
    }

    /**
     * Legt den Wert der lacquerWorkFlatrate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerWorkFlatrate(FieldDecimal value) {
        this.lacquerWorkFlatrate = value;
    }

    /**
     * Ruft den Wert der lacquerMaterialFlatrate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerMaterialFlatrate() {
        return lacquerMaterialFlatrate;
    }

    /**
     * Legt den Wert der lacquerMaterialFlatrate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerMaterialFlatrate(FieldDecimal value) {
        this.lacquerMaterialFlatrate = value;
    }

    /**
     * Ruft den Wert der specialLacquerAward-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSpecialLacquerAward() {
        return specialLacquerAward;
    }

    /**
     * Legt den Wert der specialLacquerAward-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSpecialLacquerAward(FieldDecimal value) {
        this.specialLacquerAward = value;
    }

    /**
     * Ruft den Wert der lacquerMaterialPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerMaterialPercentage() {
        return lacquerMaterialPercentage;
    }

    /**
     * Legt den Wert der lacquerMaterialPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerMaterialPercentage(FieldDecimal value) {
        this.lacquerMaterialPercentage = value;
    }

    /**
     * Ruft den Wert der lacquerMaterialIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLacquerMaterialIndex() {
        return lacquerMaterialIndex;
    }

    /**
     * Legt den Wert der lacquerMaterialIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLacquerMaterialIndex(FieldInteger value) {
        this.lacquerMaterialIndex = value;
    }

    /**
     * Ruft den Wert der lacquerMaterialChargePerPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerMaterialChargePerPoint() {
        return lacquerMaterialChargePerPoint;
    }

    /**
     * Legt den Wert der lacquerMaterialChargePerPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerMaterialChargePerPoint(FieldDecimal value) {
        this.lacquerMaterialChargePerPoint = value;
    }

    /**
     * Ruft den Wert der lacquerMaterialPriceCategory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLacquerMaterialPriceCategory() {
        return lacquerMaterialPriceCategory;
    }

    /**
     * Legt den Wert der lacquerMaterialPriceCategory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLacquerMaterialPriceCategory(FieldInteger value) {
        this.lacquerMaterialPriceCategory = value;
    }

    /**
     * Ruft den Wert der lacquerMaterialPrintDescr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getLacquerMaterialPrintDescr() {
        return lacquerMaterialPrintDescr;
    }

    /**
     * Legt den Wert der lacquerMaterialPrintDescr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setLacquerMaterialPrintDescr(FieldBoolean value) {
        this.lacquerMaterialPrintDescr = value;
    }

    /**
     * Ruft den Wert der lacquerLeadTimeMetal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerLeadTimeMetal() {
        return lacquerLeadTimeMetal;
    }

    /**
     * Legt den Wert der lacquerLeadTimeMetal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerLeadTimeMetal(FieldDecimal value) {
        this.lacquerLeadTimeMetal = value;
    }

    /**
     * Ruft den Wert der lacquerLeadTimePlastic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerLeadTimePlastic() {
        return lacquerLeadTimePlastic;
    }

    /**
     * Legt den Wert der lacquerLeadTimePlastic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerLeadTimePlastic(FieldDecimal value) {
        this.lacquerLeadTimePlastic = value;
    }

    /**
     * Ruft den Wert der lacquerLeadTimePercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerLeadTimePercentage() {
        return lacquerLeadTimePercentage;
    }

    /**
     * Legt den Wert der lacquerLeadTimePercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerLeadTimePercentage(FieldDecimal value) {
        this.lacquerLeadTimePercentage = value;
    }

    /**
     * Ruft den Wert der lacquerDisposalCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerDisposalCosts() {
        return lacquerDisposalCosts;
    }

    /**
     * Legt den Wert der lacquerDisposalCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerDisposalCosts(FieldDecimal value) {
        this.lacquerDisposalCosts = value;
    }

    /**
     * Ruft den Wert der lacquerCoveringPanes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLacquerCoveringPanes() {
        return lacquerCoveringPanes;
    }

    /**
     * Legt den Wert der lacquerCoveringPanes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLacquerCoveringPanes(FieldInteger value) {
        this.lacquerCoveringPanes = value;
    }

    /**
     * Ruft den Wert der lacquerCoveringDismountedPlastic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLacquerCoveringDismountedPlastic() {
        return lacquerCoveringDismountedPlastic;
    }

    /**
     * Legt den Wert der lacquerCoveringDismountedPlastic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLacquerCoveringDismountedPlastic(FieldInteger value) {
        this.lacquerCoveringDismountedPlastic = value;
    }

    /**
     * Ruft den Wert der lacquerMattBlackWindowFrames-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLacquerMattBlackWindowFrames() {
        return lacquerMattBlackWindowFrames;
    }

    /**
     * Legt den Wert der lacquerMattBlackWindowFrames-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLacquerMattBlackWindowFrames(FieldInteger value) {
        this.lacquerMattBlackWindowFrames = value;
    }

    /**
     * Ruft den Wert der lacquerWageDiscountAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerWageDiscountAmount() {
        return lacquerWageDiscountAmount;
    }

    /**
     * Legt den Wert der lacquerWageDiscountAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerWageDiscountAmount(FieldDecimal value) {
        this.lacquerWageDiscountAmount = value;
    }

    /**
     * Ruft den Wert der lacquerWageDiscountPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerWageDiscountPercentage() {
        return lacquerWageDiscountPercentage;
    }

    /**
     * Legt den Wert der lacquerWageDiscountPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerWageDiscountPercentage(FieldDecimal value) {
        this.lacquerWageDiscountPercentage = value;
    }

    /**
     * Ruft den Wert der lacquerWageDiscountAmountForOpt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerWageDiscountAmountForOpt() {
        return lacquerWageDiscountAmountForOpt;
    }

    /**
     * Legt den Wert der lacquerWageDiscountAmountForOpt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerWageDiscountAmountForOpt(FieldDecimal value) {
        this.lacquerWageDiscountAmountForOpt = value;
    }

    /**
     * Ruft den Wert der lacquerWageDiscountPercentageForOpt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerWageDiscountPercentageForOpt() {
        return lacquerWageDiscountPercentageForOpt;
    }

    /**
     * Legt den Wert der lacquerWageDiscountPercentageForOpt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerWageDiscountPercentageForOpt(FieldDecimal value) {
        this.lacquerWageDiscountPercentageForOpt = value;
    }

    /**
     * Ruft den Wert der lacquerMaterialDiscountAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerMaterialDiscountAmount() {
        return lacquerMaterialDiscountAmount;
    }

    /**
     * Legt den Wert der lacquerMaterialDiscountAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerMaterialDiscountAmount(FieldDecimal value) {
        this.lacquerMaterialDiscountAmount = value;
    }

    /**
     * Ruft den Wert der lacquerMaterialDiscountPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerMaterialDiscountPercentage() {
        return lacquerMaterialDiscountPercentage;
    }

    /**
     * Legt den Wert der lacquerMaterialDiscountPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerMaterialDiscountPercentage(FieldDecimal value) {
        this.lacquerMaterialDiscountPercentage = value;
    }

    /**
     * Ruft den Wert der lacquerMaterialDiscountAmountForOpt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerMaterialDiscountAmountForOpt() {
        return lacquerMaterialDiscountAmountForOpt;
    }

    /**
     * Legt den Wert der lacquerMaterialDiscountAmountForOpt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerMaterialDiscountAmountForOpt(FieldDecimal value) {
        this.lacquerMaterialDiscountAmountForOpt = value;
    }

    /**
     * Ruft den Wert der lacquerMaterialDiscountPercentageForOpt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerMaterialDiscountPercentageForOpt() {
        return lacquerMaterialDiscountPercentageForOpt;
    }

    /**
     * Legt den Wert der lacquerMaterialDiscountPercentageForOpt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerMaterialDiscountPercentageForOpt(FieldDecimal value) {
        this.lacquerMaterialDiscountPercentageForOpt = value;
    }

    /**
     * Ruft den Wert der lacquerCompleteDiscountAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerCompleteDiscountAmount() {
        return lacquerCompleteDiscountAmount;
    }

    /**
     * Legt den Wert der lacquerCompleteDiscountAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerCompleteDiscountAmount(FieldDecimal value) {
        this.lacquerCompleteDiscountAmount = value;
    }

    /**
     * Ruft den Wert der lacquerCompleteDiscountPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerCompleteDiscountPercentage() {
        return lacquerCompleteDiscountPercentage;
    }

    /**
     * Legt den Wert der lacquerCompleteDiscountPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerCompleteDiscountPercentage(FieldDecimal value) {
        this.lacquerCompleteDiscountPercentage = value;
    }

    /**
     * Ruft den Wert der lacquerCompleteDiscountAmountForOpt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerCompleteDiscountAmountForOpt() {
        return lacquerCompleteDiscountAmountForOpt;
    }

    /**
     * Legt den Wert der lacquerCompleteDiscountAmountForOpt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerCompleteDiscountAmountForOpt(FieldDecimal value) {
        this.lacquerCompleteDiscountAmountForOpt = value;
    }

    /**
     * Ruft den Wert der lacquerCompleteDiscountPercentageForOpt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerCompleteDiscountPercentageForOpt() {
        return lacquerCompleteDiscountPercentageForOpt;
    }

    /**
     * Legt den Wert der lacquerCompleteDiscountPercentageForOpt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerCompleteDiscountPercentageForOpt(FieldDecimal value) {
        this.lacquerCompleteDiscountPercentageForOpt = value;
    }

    /**
     * Ruft den Wert der lacquerPaintWorkDiscountPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerPaintWorkDiscountPercentage() {
        return lacquerPaintWorkDiscountPercentage;
    }

    /**
     * Legt den Wert der lacquerPaintWorkDiscountPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerPaintWorkDiscountPercentage(FieldDecimal value) {
        this.lacquerPaintWorkDiscountPercentage = value;
    }

    /**
     * Ruft den Wert der lacquerTimeUnitSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLacquerTimeUnitSystem() {
        return lacquerTimeUnitSystem;
    }

    /**
     * Legt den Wert der lacquerTimeUnitSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLacquerTimeUnitSystem(FieldString value) {
        this.lacquerTimeUnitSystem = value;
    }

    /**
     * Ruft den Wert der lacquerTimeUnitsPerHour-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLacquerTimeUnitsPerHour() {
        return lacquerTimeUnitsPerHour;
    }

    /**
     * Legt den Wert der lacquerTimeUnitsPerHour-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLacquerTimeUnitsPerHour(FieldInteger value) {
        this.lacquerTimeUnitsPerHour = value;
    }

    /**
     * Ruft den Wert der timeUnitSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTimeUnitSystem() {
        return timeUnitSystem;
    }

    /**
     * Legt den Wert der timeUnitSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTimeUnitSystem(FieldString value) {
        this.timeUnitSystem = value;
    }

    /**
     * Ruft den Wert der timeUnitsPerHour-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getTimeUnitsPerHour() {
        return timeUnitsPerHour;
    }

    /**
     * Legt den Wert der timeUnitsPerHour-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setTimeUnitsPerHour(FieldInteger value) {
        this.timeUnitsPerHour = value;
    }

    /**
     * Ruft den Wert der timeUnitsOfManufacturer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getTimeUnitsOfManufacturer() {
        return timeUnitsOfManufacturer;
    }

    /**
     * Legt den Wert der timeUnitsOfManufacturer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setTimeUnitsOfManufacturer(FieldBoolean value) {
        this.timeUnitsOfManufacturer = value;
    }

    /**
     * Ruft den Wert der repairWageDiscountPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getRepairWageDiscountPercentage() {
        return repairWageDiscountPercentage;
    }

    /**
     * Legt den Wert der repairWageDiscountPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setRepairWageDiscountPercentage(FieldDecimal value) {
        this.repairWageDiscountPercentage = value;
    }

    /**
     * Ruft den Wert der repairWageDiscountAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getRepairWageDiscountAmount() {
        return repairWageDiscountAmount;
    }

    /**
     * Legt den Wert der repairWageDiscountAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setRepairWageDiscountAmount(FieldDecimal value) {
        this.repairWageDiscountAmount = value;
    }

    /**
     * Ruft den Wert der repairWageDiscountPercentageForOpt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getRepairWageDiscountPercentageForOpt() {
        return repairWageDiscountPercentageForOpt;
    }

    /**
     * Legt den Wert der repairWageDiscountPercentageForOpt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setRepairWageDiscountPercentageForOpt(FieldDecimal value) {
        this.repairWageDiscountPercentageForOpt = value;
    }

    /**
     * Ruft den Wert der repairWageDiscountAmountForOpt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getRepairWageDiscountAmountForOpt() {
        return repairWageDiscountAmountForOpt;
    }

    /**
     * Legt den Wert der repairWageDiscountAmountForOpt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setRepairWageDiscountAmountForOpt(FieldDecimal value) {
        this.repairWageDiscountAmountForOpt = value;
    }

    /**
     * Ruft den Wert der repairWageFlatrate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getRepairWageFlatrate() {
        return repairWageFlatrate;
    }

    /**
     * Legt den Wert der repairWageFlatrate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setRepairWageFlatrate(FieldDecimal value) {
        this.repairWageFlatrate = value;
    }

    /**
     * Ruft den Wert der longWorkDescriptions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getLongWorkDescriptions() {
        return longWorkDescriptions;
    }

    /**
     * Legt den Wert der longWorkDescriptions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setLongWorkDescriptions(FieldBoolean value) {
        this.longWorkDescriptions = value;
    }

    /**
     * Ruft den Wert der allIncludedWork-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getAllIncludedWork() {
        return allIncludedWork;
    }

    /**
     * Legt den Wert der allIncludedWork-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setAllIncludedWork(FieldBoolean value) {
        this.allIncludedWork = value;
    }

    /**
     * Ruft den Wert der feeAE-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getFeeAE() {
        return feeAE;
    }

    /**
     * Legt den Wert der feeAE-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setFeeAE(FieldDecimal value) {
        this.feeAE = value;
    }

    /**
     * Ruft den Wert der withDomusCalculation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getWithDomusCalculation() {
        return withDomusCalculation;
    }

    /**
     * Legt den Wert der withDomusCalculation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setWithDomusCalculation(FieldBoolean value) {
        this.withDomusCalculation = value;
    }

    /**
     * Ruft den Wert der priceLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getPriceLevel() {
        return priceLevel;
    }

    /**
     * Legt den Wert der priceLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setPriceLevel(FieldInteger value) {
        this.priceLevel = value;
    }

    /**
     * Ruft den Wert der lacquerDiscountFactor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLacquerDiscountFactor() {
        return lacquerDiscountFactor;
    }

    /**
     * Legt den Wert der lacquerDiscountFactor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLacquerDiscountFactor(FieldDecimal value) {
        this.lacquerDiscountFactor = value;
    }

    /**
     * Ruft den Wert der wearBodyAge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWearBodyAge() {
        return wearBodyAge;
    }

    /**
     * Legt den Wert der wearBodyAge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWearBodyAge(FieldDecimal value) {
        this.wearBodyAge = value;
    }

    /**
     * Ruft den Wert der wearBodyCorrosion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWearBodyCorrosion() {
        return wearBodyCorrosion;
    }

    /**
     * Legt den Wert der wearBodyCorrosion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWearBodyCorrosion(FieldDecimal value) {
        this.wearBodyCorrosion = value;
    }

    /**
     * Ruft den Wert der wearTyreMinSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWearTyreMinSize() {
        return wearTyreMinSize;
    }

    /**
     * Legt den Wert der wearTyreMinSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWearTyreMinSize(FieldDecimal value) {
        this.wearTyreMinSize = value;
    }

    /**
     * Ruft den Wert der wearTyreActualSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWearTyreActualSize() {
        return wearTyreActualSize;
    }

    /**
     * Legt den Wert der wearTyreActualSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWearTyreActualSize(FieldDecimal value) {
        this.wearTyreActualSize = value;
    }

    /**
     * Ruft den Wert der wearTyreSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWearTyreSize() {
        return wearTyreSize;
    }

    /**
     * Legt den Wert der wearTyreSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWearTyreSize(FieldDecimal value) {
        this.wearTyreSize = value;
    }

    /**
     * Ruft den Wert der wearTyreAge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getWearTyreAge() {
        return wearTyreAge;
    }

    /**
     * Legt den Wert der wearTyreAge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setWearTyreAge(FieldString value) {
        this.wearTyreAge = value;
    }

    /**
     * Ruft den Wert der wearBatAge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWearBatAge() {
        return wearBatAge;
    }

    /**
     * Legt den Wert der wearBatAge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWearBatAge(FieldDecimal value) {
        this.wearBatAge = value;
    }

    /**
     * Ruft den Wert der wearBatTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWearBatTime() {
        return wearBatTime;
    }

    /**
     * Legt den Wert der wearBatTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWearBatTime(FieldDecimal value) {
        this.wearBatTime = value;
    }

    /**
     * Ruft den Wert der wearPlasticAge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWearPlasticAge() {
        return wearPlasticAge;
    }

    /**
     * Legt den Wert der wearPlasticAge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWearPlasticAge(FieldDecimal value) {
        this.wearPlasticAge = value;
    }

    /**
     * Ruft den Wert der wearCompAge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWearCompAge() {
        return wearCompAge;
    }

    /**
     * Legt den Wert der wearCompAge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWearCompAge(FieldDecimal value) {
        this.wearCompAge = value;
    }

    /**
     * Ruft den Wert der wearCompMileage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWearCompMileage() {
        return wearCompMileage;
    }

    /**
     * Legt den Wert der wearCompMileage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWearCompMileage(FieldDecimal value) {
        this.wearCompMileage = value;
    }

    /**
     * Ruft den Wert der wearCompTypeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getWearCompTypeId() {
        return wearCompTypeId;
    }

    /**
     * Legt den Wert der wearCompTypeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setWearCompTypeId(FieldInteger value) {
        this.wearCompTypeId = value;
    }

    /**
     * Ruft den Wert der wearCompTypeDesc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getWearCompTypeDesc() {
        return wearCompTypeDesc;
    }

    /**
     * Legt den Wert der wearCompTypeDesc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setWearCompTypeDesc(FieldString value) {
        this.wearCompTypeDesc = value;
    }

    /**
     * Ruft den Wert der calculationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldCharacter }
     *     
     */
    public FieldCharacter getCalculationType() {
        return calculationType;
    }

    /**
     * Legt den Wert der calculationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldCharacter }
     *     
     */
    public void setCalculationType(FieldCharacter value) {
        this.calculationType = value;
    }

    /**
     * Ruft den Wert der consumablesOfWagePerc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getConsumablesOfWagePerc() {
        return consumablesOfWagePerc;
    }

    /**
     * Legt den Wert der consumablesOfWagePerc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setConsumablesOfWagePerc(FieldDecimal value) {
        this.consumablesOfWagePerc = value;
    }

    /**
     * Ruft den Wert der consumablesPercentageSmallPartsForOpt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getConsumablesPercentageSmallPartsForOpt() {
        return consumablesPercentageSmallPartsForOpt;
    }

    /**
     * Legt den Wert der consumablesPercentageSmallPartsForOpt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setConsumablesPercentageSmallPartsForOpt(FieldDecimal value) {
        this.consumablesPercentageSmallPartsForOpt = value;
    }

    /**
     * Ruft den Wert der indicatorDataUsedAsPattern-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getIndicatorDataUsedAsPattern() {
        return indicatorDataUsedAsPattern;
    }

    /**
     * Legt den Wert der indicatorDataUsedAsPattern-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setIndicatorDataUsedAsPattern(FieldBoolean value) {
        this.indicatorDataUsedAsPattern = value;
    }

    /**
     * Ruft den Wert der indicatorIsGlassCalculation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getIndicatorIsGlassCalculation() {
        return indicatorIsGlassCalculation;
    }

    /**
     * Legt den Wert der indicatorIsGlassCalculation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setIndicatorIsGlassCalculation(FieldBoolean value) {
        this.indicatorIsGlassCalculation = value;
    }

    /**
     * Ruft den Wert der indicatorGlassCalculationWithoutWork-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getIndicatorGlassCalculationWithoutWork() {
        return indicatorGlassCalculationWithoutWork;
    }

    /**
     * Legt den Wert der indicatorGlassCalculationWithoutWork-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setIndicatorGlassCalculationWithoutWork(FieldBoolean value) {
        this.indicatorGlassCalculationWithoutWork = value;
    }

    /**
     * Ruft den Wert der indicatorOptBodyShell-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getIndicatorOptBodyShell() {
        return indicatorOptBodyShell;
    }

    /**
     * Legt den Wert der indicatorOptBodyShell-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setIndicatorOptBodyShell(FieldBoolean value) {
        this.indicatorOptBodyShell = value;
    }

    /**
     * Ruft den Wert der indicatorTimeUnitsInHours-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getIndicatorTimeUnitsInHours() {
        return indicatorTimeUnitsInHours;
    }

    /**
     * Legt den Wert der indicatorTimeUnitsInHours-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setIndicatorTimeUnitsInHours(FieldBoolean value) {
        this.indicatorTimeUnitsInHours = value;
    }

    /**
     * Ruft den Wert der indicatorWarrantyCalculation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getIndicatorWarrantyCalculation() {
        return indicatorWarrantyCalculation;
    }

    /**
     * Legt den Wert der indicatorWarrantyCalculation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setIndicatorWarrantyCalculation(FieldBoolean value) {
        this.indicatorWarrantyCalculation = value;
    }

    /**
     * Ruft den Wert der indicatorWithoutBodyCavityAndUnderseal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getIndicatorWithoutBodyCavityAndUnderseal() {
        return indicatorWithoutBodyCavityAndUnderseal;
    }

    /**
     * Legt den Wert der indicatorWithoutBodyCavityAndUnderseal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setIndicatorWithoutBodyCavityAndUnderseal(FieldBoolean value) {
        this.indicatorWithoutBodyCavityAndUnderseal = value;
    }

    /**
     * Ruft den Wert der levelOneE-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLevelOneE() {
        return levelOneE;
    }

    /**
     * Legt den Wert der levelOneE-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLevelOneE(FieldDecimal value) {
        this.levelOneE = value;
    }

    /**
     * Ruft den Wert der levelOneJ-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLevelOneJ() {
        return levelOneJ;
    }

    /**
     * Legt den Wert der levelOneJ-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLevelOneJ(FieldDecimal value) {
        this.levelOneJ = value;
    }

    /**
     * Ruft den Wert der levelOneM-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLevelOneM() {
        return levelOneM;
    }

    /**
     * Legt den Wert der levelOneM-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLevelOneM(FieldDecimal value) {
        this.levelOneM = value;
    }

    /**
     * Ruft den Wert der levelThree-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLevelThree() {
        return levelThree;
    }

    /**
     * Legt den Wert der levelThree-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLevelThree(FieldDecimal value) {
        this.levelThree = value;
    }

    /**
     * Ruft den Wert der levelTwo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getLevelTwo() {
        return levelTwo;
    }

    /**
     * Legt den Wert der levelTwo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setLevelTwo(FieldDecimal value) {
        this.levelTwo = value;
    }

    /**
     * Ruft den Wert der materialConstantPartsIntegrated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getMaterialConstantPartsIntegrated() {
        return materialConstantPartsIntegrated;
    }

    /**
     * Legt den Wert der materialConstantPartsIntegrated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setMaterialConstantPartsIntegrated(FieldDecimal value) {
        this.materialConstantPartsIntegrated = value;
    }

    /**
     * Ruft den Wert der materialConstantPartsRemoved-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getMaterialConstantPartsRemoved() {
        return materialConstantPartsRemoved;
    }

    /**
     * Legt den Wert der materialConstantPartsRemoved-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setMaterialConstantPartsRemoved(FieldDecimal value) {
        this.materialConstantPartsRemoved = value;
    }

    /**
     * Ruft den Wert der materialConstantByAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getMaterialConstantByAmount() {
        return materialConstantByAmount;
    }

    /**
     * Legt den Wert der materialConstantByAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setMaterialConstantByAmount(FieldDecimal value) {
        this.materialConstantByAmount = value;
    }

    /**
     * Ruft den Wert der materialCostsPerUnit1CoatPainting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getMaterialCostsPerUnit1CoatPainting() {
        return materialCostsPerUnit1CoatPainting;
    }

    /**
     * Legt den Wert der materialCostsPerUnit1CoatPainting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setMaterialCostsPerUnit1CoatPainting(FieldDecimal value) {
        this.materialCostsPerUnit1CoatPainting = value;
    }

    /**
     * Ruft den Wert der procurementCostsPercBodyShellForOpt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getProcurementCostsPercBodyShellForOpt() {
        return procurementCostsPercBodyShellForOpt;
    }

    /**
     * Legt den Wert der procurementCostsPercBodyShellForOpt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setProcurementCostsPercBodyShellForOpt(FieldDecimal value) {
        this.procurementCostsPercBodyShellForOpt = value;
    }

    /**
     * Ruft den Wert der rentingCostsAlignmentBrackets-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getRentingCostsAlignmentBrackets() {
        return rentingCostsAlignmentBrackets;
    }

    /**
     * Legt den Wert der rentingCostsAlignmentBrackets-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setRentingCostsAlignmentBrackets(FieldDecimal value) {
        this.rentingCostsAlignmentBrackets = value;
    }

    /**
     * Ruft den Wert der sparePartsDisposalCostsPerc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSparePartsDisposalCostsPerc() {
        return sparePartsDisposalCostsPerc;
    }

    /**
     * Legt den Wert der sparePartsDisposalCostsPerc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSparePartsDisposalCostsPerc(FieldDecimal value) {
        this.sparePartsDisposalCostsPerc = value;
    }

    /**
     * Ruft den Wert der calculationWithoutConstants-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getCalculationWithoutConstants() {
        return calculationWithoutConstants;
    }

    /**
     * Legt den Wert der calculationWithoutConstants-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setCalculationWithoutConstants(FieldBoolean value) {
        this.calculationWithoutConstants = value;
    }

    /**
     * Ruft den Wert der lacquerScratchResistant-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getLacquerScratchResistant() {
        return lacquerScratchResistant;
    }

    /**
     * Legt den Wert der lacquerScratchResistant-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setLacquerScratchResistant(FieldBoolean value) {
        this.lacquerScratchResistant = value;
    }

    /**
     * Ruft den Wert der pearlEffectSurcharge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPearlEffectSurcharge() {
        return pearlEffectSurcharge;
    }

    /**
     * Legt den Wert der pearlEffectSurcharge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPearlEffectSurcharge(FieldDecimal value) {
        this.pearlEffectSurcharge = value;
    }

    /**
     * Ruft den Wert der colorCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getColorCount() {
        return colorCount;
    }

    /**
     * Legt den Wert der colorCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setColorCount(FieldInteger value) {
        this.colorCount = value;
    }

    /**
     * Ruft den Wert der dmsCalculation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getDMSCalculation() {
        return dmsCalculation;
    }

    /**
     * Legt den Wert der dmsCalculation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setDMSCalculation(FieldBoolean value) {
        this.dmsCalculation = value;
    }

    /**
     * Ruft den Wert der dmsPaintWPN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDMSPaintWPN() {
        return dmsPaintWPN;
    }

    /**
     * Legt den Wert der dmsPaintWPN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDMSPaintWPN(FieldString value) {
        this.dmsPaintWPN = value;
    }

    /**
     * Ruft den Wert der externalProvider-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getExternalProvider() {
        return externalProvider;
    }

    /**
     * Legt den Wert der externalProvider-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setExternalProvider(FieldString value) {
        this.externalProvider = value;
    }

    /**
     * Ruft den Wert der externalProviderStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getExternalProviderStatus() {
        return externalProviderStatus;
    }

    /**
     * Legt den Wert der externalProviderStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setExternalProviderStatus(FieldInteger value) {
        this.externalProviderStatus = value;
    }

    /**
     * Ruft den Wert der totalPredamageAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTotalPredamageAmount() {
        return totalPredamageAmount;
    }

    /**
     * Legt den Wert der totalPredamageAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTotalPredamageAmount(FieldDecimal value) {
        this.totalPredamageAmount = value;
    }

    /**
     * Ruft den Wert der totalNFOAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTotalNFOAmount() {
        return totalNFOAmount;
    }

    /**
     * Legt den Wert der totalNFOAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTotalNFOAmount(FieldDecimal value) {
        this.totalNFOAmount = value;
    }

    /**
     * Ruft den Wert der totalNFOPercent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTotalNFOPercent() {
        return totalNFOPercent;
    }

    /**
     * Legt den Wert der totalNFOPercent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTotalNFOPercent(FieldDecimal value) {
        this.totalNFOPercent = value;
    }

    /**
     * Ruft den Wert der totalValueImprovementAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTotalValueImprovementAmount() {
        return totalValueImprovementAmount;
    }

    /**
     * Legt den Wert der totalValueImprovementAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTotalValueImprovementAmount(FieldDecimal value) {
        this.totalValueImprovementAmount = value;
    }

    /**
     * Ruft den Wert der additionalCostsFlatAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getAdditionalCostsFlatAmount() {
        return additionalCostsFlatAmount;
    }

    /**
     * Legt den Wert der additionalCostsFlatAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setAdditionalCostsFlatAmount(FieldDecimal value) {
        this.additionalCostsFlatAmount = value;
    }

    /**
     * Ruft den Wert der additionalCostsPercent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getAdditionalCostsPercent() {
        return additionalCostsPercent;
    }

    /**
     * Legt den Wert der additionalCostsPercent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setAdditionalCostsPercent(FieldDecimal value) {
        this.additionalCostsPercent = value;
    }

    /**
     * Ruft den Wert der disposalCostsSparePartsPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDisposalCostsSparePartsPercentage() {
        return disposalCostsSparePartsPercentage;
    }

    /**
     * Legt den Wert der disposalCostsSparePartsPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDisposalCostsSparePartsPercentage(FieldDecimal value) {
        this.disposalCostsSparePartsPercentage = value;
    }

    /**
     * Ruft den Wert der lacquerAdjustments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LacquerAdjustments }
     *     
     */
    public LacquerAdjustments getLacquerAdjustments() {
        return lacquerAdjustments;
    }

    /**
     * Legt den Wert der lacquerAdjustments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LacquerAdjustments }
     *     
     */
    public void setLacquerAdjustments(LacquerAdjustments value) {
        this.lacquerAdjustments = value;
    }

    /**
     * Ruft den Wert der partsSurchargeInProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getPartsSurchargeInProtocol() {
        return partsSurchargeInProtocol;
    }

    /**
     * Legt den Wert der partsSurchargeInProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setPartsSurchargeInProtocol(FieldBoolean value) {
        this.partsSurchargeInProtocol = value;
    }

    /**
     * Ruft den Wert der partsSurchargeSeparated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getPartsSurchargeSeparated() {
        return partsSurchargeSeparated;
    }

    /**
     * Legt den Wert der partsSurchargeSeparated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setPartsSurchargeSeparated(FieldBoolean value) {
        this.partsSurchargeSeparated = value;
    }

    /**
     * Ruft den Wert der aztFourLayerLacquerMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getAztFourLayerLacquerMode() {
        return aztFourLayerLacquerMode;
    }

    /**
     * Legt den Wert der aztFourLayerLacquerMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setAztFourLayerLacquerMode(FieldString value) {
        this.aztFourLayerLacquerMode = value;
    }

    /**
     * Ruft den Wert der aztThreeLayerLacquerMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getAztThreeLayerLacquerMode() {
        return aztThreeLayerLacquerMode;
    }

    /**
     * Legt den Wert der aztThreeLayerLacquerMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setAztThreeLayerLacquerMode(FieldString value) {
        this.aztThreeLayerLacquerMode = value;
    }

    /**
     * Ruft den Wert der lacquerWaterBasedPaintSurcharge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getLacquerWaterBasedPaintSurcharge() {
        return lacquerWaterBasedPaintSurcharge;
    }

    /**
     * Legt den Wert der lacquerWaterBasedPaintSurcharge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setLacquerWaterBasedPaintSurcharge(FieldBoolean value) {
        this.lacquerWaterBasedPaintSurcharge = value;
    }

}
