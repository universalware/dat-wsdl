
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
 *         &lt;element ref="{http://www.dat.de/vxs}FillingQuantities" minOccurs="0"/>
 *         &lt;element name="StructureType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="StructureDescription" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="CabineStructureType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="CabineStructureDescription" type="{http://www.dat.de/vxs}fieldString1000" minOccurs="0" form="qualified"/>
 *         &lt;element name="UpperBodyStructureType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="UpperBodyStructureDescription" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="UpperBodyStructureAndVersion" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="CountOfAxles" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatCountOfAxles" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="CountOfDrivedAxles" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatCountOfDrivedAxles" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="WheelBase" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWheelBase" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="WheelBase2" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="AxleLoadFront" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="AxleLoadMiddle" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="AxleLoadBack" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="TonnageClass" type="{http://www.dat.de/vxs}fieldString2" minOccurs="0" form="qualified"/>
 *         &lt;element name="Length" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatLength" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="Width" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWidth" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="Height" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatHeight" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="RoofLoad" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatRoofLoad" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="TrailerLoadBraked" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatTrailerLoadBraked" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="TrailerLoadUnbraked" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatTrailerLoadUnbraked" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="VehicleSeats" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatVehicleSeats" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="VehicleDoors" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatVehicleDoors" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="CountOfAirbags" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatCountOfAirbags" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="Acceleration" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatAcceleration" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SpeedMax" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatSpeedMax" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="PowerHp" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatPowerHp" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="PowerKw" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatPowerKw" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Capacity" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatCapacity" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="Cylinder" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatCylinder" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="CylinderArrangement" type="{http://www.dat.de/vxs}fieldString30" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatCylinderArrangement" type="{http://www.dat.de/vxs}fieldString30" minOccurs="0" form="qualified"/>
 *         &lt;element name="RotationsOnMaxPower" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatRotationsOnMaxPower" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="RotationsOnMaxTorque" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatRotationsOnMaxTorque" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="Torque" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatTorque" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="GearboxType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="NrOfGears" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="OriginalTireSizeAxle1" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="OriginalTireSizeAxle2" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="TankVolume" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatTankVolume" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="TankVolumeAlternative" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatTankVolumeAlternative" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConsumptionInTown" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatConsumptionInTown" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConsumptionOutOfTown" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatConsumptionOutOfTown" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Consumption" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatConsumption" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConsumptionInnerCng" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatConsumptionInnerCng" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConsumptionOuterCng" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatConsumptionOuterCng" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConsumptionMixCng" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatConsumptionMixCng" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConsumptionInnerLpg" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatConsumptionInnerLpg" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConsumptionOuterLpg" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatConsumptionOuterLpg" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConsumptionMixLpg" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatConsumptionMixLpg" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConsumptionInnerH" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatConsumptionInnerH" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConsumptionOuterH" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatConsumptionOuterH" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConsumptionMixH" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatConsumptionMixH" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Co2Emission" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatCo2Emission" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="EmissionClass" type="{http://www.dat.de/vxs}fieldString5" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatEmissionClass" type="{http://www.dat.de/vxs}fieldString5" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}EmissionClassN" minOccurs="0"/>
 *         &lt;element name="Drive" type="{http://www.dat.de/vxs}fieldString1000" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatDrive" type="{http://www.dat.de/vxs}fieldString1000" minOccurs="0" form="qualified"/>
 *         &lt;element name="DriveN" type="{http://www.dat.de/vxs}fieldString1000" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatDriveN" type="{http://www.dat.de/vxs}fieldString1000" minOccurs="0" form="qualified"/>
 *         &lt;element name="DriveCode" type="{http://www.dat.de/vxs}fieldString10" minOccurs="0" form="qualified"/>
 *         &lt;element name="EngineCycle" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatEngineCycle" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="FuelMethod" type="{http://www.dat.de/vxs}fieldString1000" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatFuelMethod" type="{http://www.dat.de/vxs}fieldString1000" minOccurs="0" form="qualified"/>
 *         &lt;element name="FuelMethodCode" type="{http://www.dat.de/vxs}fieldString2" minOccurs="0" form="qualified"/>
 *         &lt;element name="FuelMethodType" type="{http://www.dat.de/vxs}fieldString1000" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatFuelMethodType" type="{http://www.dat.de/vxs}fieldString1000" minOccurs="0" form="qualified"/>
 *         &lt;element name="UnloadedWeight" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatUnloadedWeight" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="PermissableTotalWeight" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatPermissableTotalWeight" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="Payload" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatPayload" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="LoadingLength" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatLoadingLength" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="LoadingWidth" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatLoadingWidth" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="LoadingHeight" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatLoadingHeight" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="LoadingSpace" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatLoadingSpace" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="LoadingSpaceMax" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatLoadingSpaceMax" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="UpperBodyMaterial" type="{http://www.dat.de/vxs}fieldString30" minOccurs="0" form="qualified"/>
 *         &lt;element name="InsuranceTypeClassLiability" type="{http://www.dat.de/vxs}fieldString2" minOccurs="0" form="qualified"/>
 *         &lt;element name="InsuranceTypeClassCascoPartial" type="{http://www.dat.de/vxs}fieldString2" minOccurs="0" form="qualified"/>
 *         &lt;element name="InsuranceTypeClassCascoComplete" type="{http://www.dat.de/vxs}fieldString2" minOccurs="0" form="qualified"/>
 *         &lt;element name="DustBadge" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ProductGroupName" type="{http://www.dat.de/vxs}fieldString1000" minOccurs="0" form="qualified"/>
 *         &lt;element name="EmissionKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="Built" type="{http://www.dat.de/vxs}fieldString30" minOccurs="0" form="qualified"/>
 *         &lt;element name="AllowedLoadCapacity" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="CabinStructureAltDescription" type="{http://www.dat.de/vxs}fieldString30" minOccurs="0" form="qualified"/>
 *         &lt;element name="CushionColorId" type="{http://www.dat.de/vxs}fieldString30" minOccurs="0" form="qualified"/>
 *         &lt;element name="FuelmethodAbbr" type="{http://www.dat.de/vxs}fieldString1000" minOccurs="0" form="qualified"/>
 *         &lt;element name="InsuranceTypeClassCascoCompleteNeu" type="{http://www.dat.de/vxs}fieldString2" minOccurs="0" form="qualified"/>
 *         &lt;element name="InsuranceTypeClassCascoPartialNeu" type="{http://www.dat.de/vxs}fieldString2" minOccurs="0" form="qualified"/>
 *         &lt;element name="InsuranceTypeClassLiabilityNew" type="{http://www.dat.de/vxs}fieldString2" minOccurs="0" form="qualified"/>
 *         &lt;element name="PayloadAlternative" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="PowerKwSae" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SommerSmogBadge" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="StowageMassFormat" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="TokenChangedCapacity" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="TokenTurboEngine" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="TypeOfTaxation" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="TypeSheetNumber" type="{http://www.dat.de/vxs}fieldString10" minOccurs="0" form="qualified"/>
 *         &lt;element name="WhelBaseAlternative" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="SuitableForE10" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatSuitableForE10" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="WeightTotalCombination" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWeightTotalCombination" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="WidthForGarage" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWidthForGarage" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="PowerKwSystem" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatPowerKwSystem" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PowerHpSystem" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatPowerHpSystem" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PowerKwPermanent" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatPowerKwPermanent" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PowerHpPermanent" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatPowerHpPermanent" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PowerKwMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatPowerKwMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PowerHpMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatPowerHpMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PowerKwPermanentSecondary" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatPowerKwPermanentSecondary" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PowerHpPermanentSecondary" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatPowerHpPermanentSecondary" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PowerKwMaxSecondary" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatPowerKwMaxSecondary" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PowerHpMaxSecondary" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatPowerHpMaxSecondary" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="BatteryVoltage" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatBatteryVoltage" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="BatteryCapacity" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatBatteryCapacity" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="BatteryWeight" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatBatteryWeight" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="BatteryConstructionType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatBatteryConstructionType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ChargingCurrentPlugType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatChargingCurrentPlugType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PluginSystem" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatPluginSystem" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="QuickdropSystem" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatQuickdropSystem" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="NormalChargeVoltage" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatNormalChargeVoltage" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="NormalChargeDuration" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatNormalChargeDuration" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="QuickChargeVoltage" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatQuickChargeVoltage" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="QuickChargeDuration" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatQuickChargeDuration" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConsumptionElectricalCurrent" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatConsumptionElectricalCurrent" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="RangeOfElectricMotor" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatRangeOfElectricMotor" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="RangeTotal" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatRangeTotal" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="EnergyEfficiencyClass" type="{http://www.dat.de/vxs}fieldString2" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatEnergyEfficiencyClass" type="{http://www.dat.de/vxs}fieldString2" minOccurs="0" form="qualified"/>
 *         &lt;element name="ModelTypecode" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ModelVariant" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Type" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="TypeVariant" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="EngineType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="SpecialModel" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "TechInfo")
public class TechInfo {

    @XmlElement(name = "FillingQuantities")
    protected FillingQuantities fillingQuantities;
    @XmlElement(name = "StructureType")
    protected FieldString structureType;
    @XmlElement(name = "StructureDescription")
    protected FieldString structureDescription;
    @XmlElement(name = "CabineStructureType")
    protected FieldString cabineStructureType;
    @XmlElement(name = "CabineStructureDescription")
    protected FieldString1000 cabineStructureDescription;
    @XmlElement(name = "UpperBodyStructureType")
    protected FieldString upperBodyStructureType;
    @XmlElement(name = "UpperBodyStructureDescription")
    protected FieldString upperBodyStructureDescription;
    @XmlElement(name = "UpperBodyStructureAndVersion")
    protected FieldString upperBodyStructureAndVersion;
    @XmlElement(name = "CountOfAxles")
    protected FieldInteger countOfAxles;
    @XmlElement(name = "DatCountOfAxles")
    protected FieldInteger datCountOfAxles;
    @XmlElement(name = "CountOfDrivedAxles")
    protected FieldInteger countOfDrivedAxles;
    @XmlElement(name = "DatCountOfDrivedAxles")
    protected FieldInteger datCountOfDrivedAxles;
    @XmlElement(name = "WheelBase")
    protected FieldInteger wheelBase;
    @XmlElement(name = "DatWheelBase")
    protected FieldInteger datWheelBase;
    @XmlElement(name = "WheelBase2")
    protected FieldInteger wheelBase2;
    @XmlElement(name = "AxleLoadFront")
    protected FieldInteger axleLoadFront;
    @XmlElement(name = "AxleLoadMiddle")
    protected FieldInteger axleLoadMiddle;
    @XmlElement(name = "AxleLoadBack")
    protected FieldInteger axleLoadBack;
    @XmlElement(name = "TonnageClass")
    protected FieldString2 tonnageClass;
    @XmlElement(name = "Length")
    protected FieldInteger length;
    @XmlElement(name = "DatLength")
    protected FieldInteger datLength;
    @XmlElement(name = "Width")
    protected FieldInteger width;
    @XmlElement(name = "DatWidth")
    protected FieldInteger datWidth;
    @XmlElement(name = "Height")
    protected FieldInteger height;
    @XmlElement(name = "DatHeight")
    protected FieldInteger datHeight;
    @XmlElement(name = "RoofLoad")
    protected FieldInteger roofLoad;
    @XmlElement(name = "DatRoofLoad")
    protected FieldInteger datRoofLoad;
    @XmlElement(name = "TrailerLoadBraked")
    protected FieldInteger trailerLoadBraked;
    @XmlElement(name = "DatTrailerLoadBraked")
    protected FieldInteger datTrailerLoadBraked;
    @XmlElement(name = "TrailerLoadUnbraked")
    protected FieldInteger trailerLoadUnbraked;
    @XmlElement(name = "DatTrailerLoadUnbraked")
    protected FieldInteger datTrailerLoadUnbraked;
    @XmlElement(name = "VehicleSeats")
    protected FieldInteger vehicleSeats;
    @XmlElement(name = "DatVehicleSeats")
    protected FieldInteger datVehicleSeats;
    @XmlElement(name = "VehicleDoors")
    protected FieldInteger vehicleDoors;
    @XmlElement(name = "DatVehicleDoors")
    protected FieldInteger datVehicleDoors;
    @XmlElement(name = "CountOfAirbags")
    protected FieldInteger countOfAirbags;
    @XmlElement(name = "DatCountOfAirbags")
    protected FieldInteger datCountOfAirbags;
    @XmlElement(name = "Acceleration")
    protected FieldDecimal acceleration;
    @XmlElement(name = "DatAcceleration")
    protected FieldDecimal datAcceleration;
    @XmlElement(name = "SpeedMax")
    protected FieldInteger speedMax;
    @XmlElement(name = "DatSpeedMax")
    protected FieldInteger datSpeedMax;
    @XmlElement(name = "PowerHp")
    protected FieldInteger powerHp;
    @XmlElement(name = "DatPowerHp")
    protected FieldInteger datPowerHp;
    @XmlElement(name = "PowerKw")
    protected FieldDecimal powerKw;
    @XmlElement(name = "DatPowerKw")
    protected FieldDecimal datPowerKw;
    @XmlElement(name = "Capacity")
    protected FieldInteger capacity;
    @XmlElement(name = "DatCapacity")
    protected FieldInteger datCapacity;
    @XmlElement(name = "Cylinder")
    protected FieldInteger cylinder;
    @XmlElement(name = "DatCylinder")
    protected FieldInteger datCylinder;
    @XmlElement(name = "CylinderArrangement")
    protected FieldString30 cylinderArrangement;
    @XmlElement(name = "DatCylinderArrangement")
    protected FieldString30 datCylinderArrangement;
    @XmlElement(name = "RotationsOnMaxPower")
    protected FieldInteger rotationsOnMaxPower;
    @XmlElement(name = "DatRotationsOnMaxPower")
    protected FieldInteger datRotationsOnMaxPower;
    @XmlElement(name = "RotationsOnMaxTorque")
    protected FieldInteger rotationsOnMaxTorque;
    @XmlElement(name = "DatRotationsOnMaxTorque")
    protected FieldInteger datRotationsOnMaxTorque;
    @XmlElement(name = "Torque")
    protected FieldInteger torque;
    @XmlElement(name = "DatTorque")
    protected FieldInteger datTorque;
    @XmlElement(name = "GearboxType")
    protected FieldString gearboxType;
    @XmlElement(name = "NrOfGears")
    protected FieldString nrOfGears;
    @XmlElement(name = "OriginalTireSizeAxle1")
    protected FieldString originalTireSizeAxle1;
    @XmlElement(name = "OriginalTireSizeAxle2")
    protected FieldString originalTireSizeAxle2;
    @XmlElement(name = "TankVolume")
    protected FieldInteger tankVolume;
    @XmlElement(name = "DatTankVolume")
    protected FieldInteger datTankVolume;
    @XmlElement(name = "TankVolumeAlternative")
    protected FieldInteger tankVolumeAlternative;
    @XmlElement(name = "DatTankVolumeAlternative")
    protected FieldInteger datTankVolumeAlternative;
    @XmlElement(name = "ConsumptionInTown")
    protected FieldDecimal consumptionInTown;
    @XmlElement(name = "DatConsumptionInTown")
    protected FieldDecimal datConsumptionInTown;
    @XmlElement(name = "ConsumptionOutOfTown")
    protected FieldDecimal consumptionOutOfTown;
    @XmlElement(name = "DatConsumptionOutOfTown")
    protected FieldDecimal datConsumptionOutOfTown;
    @XmlElement(name = "Consumption")
    protected FieldDecimal consumption;
    @XmlElement(name = "DatConsumption")
    protected FieldDecimal datConsumption;
    @XmlElement(name = "ConsumptionInnerCng")
    protected FieldDecimal consumptionInnerCng;
    @XmlElement(name = "DatConsumptionInnerCng")
    protected FieldDecimal datConsumptionInnerCng;
    @XmlElement(name = "ConsumptionOuterCng")
    protected FieldDecimal consumptionOuterCng;
    @XmlElement(name = "DatConsumptionOuterCng")
    protected FieldDecimal datConsumptionOuterCng;
    @XmlElement(name = "ConsumptionMixCng")
    protected FieldDecimal consumptionMixCng;
    @XmlElement(name = "DatConsumptionMixCng")
    protected FieldDecimal datConsumptionMixCng;
    @XmlElement(name = "ConsumptionInnerLpg")
    protected FieldDecimal consumptionInnerLpg;
    @XmlElement(name = "DatConsumptionInnerLpg")
    protected FieldDecimal datConsumptionInnerLpg;
    @XmlElement(name = "ConsumptionOuterLpg")
    protected FieldDecimal consumptionOuterLpg;
    @XmlElement(name = "DatConsumptionOuterLpg")
    protected FieldDecimal datConsumptionOuterLpg;
    @XmlElement(name = "ConsumptionMixLpg")
    protected FieldDecimal consumptionMixLpg;
    @XmlElement(name = "DatConsumptionMixLpg")
    protected FieldDecimal datConsumptionMixLpg;
    @XmlElement(name = "ConsumptionInnerH")
    protected FieldDecimal consumptionInnerH;
    @XmlElement(name = "DatConsumptionInnerH")
    protected FieldDecimal datConsumptionInnerH;
    @XmlElement(name = "ConsumptionOuterH")
    protected FieldDecimal consumptionOuterH;
    @XmlElement(name = "DatConsumptionOuterH")
    protected FieldDecimal datConsumptionOuterH;
    @XmlElement(name = "ConsumptionMixH")
    protected FieldDecimal consumptionMixH;
    @XmlElement(name = "DatConsumptionMixH")
    protected FieldDecimal datConsumptionMixH;
    @XmlElement(name = "Co2Emission")
    protected FieldDecimal co2Emission;
    @XmlElement(name = "DatCo2Emission")
    protected FieldDecimal datCo2Emission;
    @XmlElement(name = "EmissionClass")
    protected FieldString5 emissionClass;
    @XmlElement(name = "DatEmissionClass")
    protected FieldString5 datEmissionClass;
    @XmlElement(name = "EmissionClassN")
    protected EmissionClassN emissionClassN;
    @XmlElement(name = "Drive")
    protected FieldString1000 drive;
    @XmlElement(name = "DatDrive")
    protected FieldString1000 datDrive;
    @XmlElement(name = "DriveN")
    protected FieldString1000 driveN;
    @XmlElement(name = "DatDriveN")
    protected FieldString1000 datDriveN;
    @XmlElement(name = "DriveCode")
    protected FieldString10 driveCode;
    @XmlElement(name = "EngineCycle")
    protected FieldInteger engineCycle;
    @XmlElement(name = "DatEngineCycle")
    protected FieldInteger datEngineCycle;
    @XmlElement(name = "FuelMethod")
    protected FieldString1000 fuelMethod;
    @XmlElement(name = "DatFuelMethod")
    protected FieldString1000 datFuelMethod;
    @XmlElement(name = "FuelMethodCode")
    protected FieldString2 fuelMethodCode;
    @XmlElement(name = "FuelMethodType")
    protected FieldString1000 fuelMethodType;
    @XmlElement(name = "DatFuelMethodType")
    protected FieldString1000 datFuelMethodType;
    @XmlElement(name = "UnloadedWeight")
    protected FieldInteger unloadedWeight;
    @XmlElement(name = "DatUnloadedWeight")
    protected FieldInteger datUnloadedWeight;
    @XmlElement(name = "PermissableTotalWeight")
    protected FieldInteger permissableTotalWeight;
    @XmlElement(name = "DatPermissableTotalWeight")
    protected FieldInteger datPermissableTotalWeight;
    @XmlElement(name = "Payload")
    protected FieldInteger payload;
    @XmlElement(name = "DatPayload")
    protected FieldInteger datPayload;
    @XmlElement(name = "LoadingLength")
    protected FieldInteger loadingLength;
    @XmlElement(name = "DatLoadingLength")
    protected FieldInteger datLoadingLength;
    @XmlElement(name = "LoadingWidth")
    protected FieldInteger loadingWidth;
    @XmlElement(name = "DatLoadingWidth")
    protected FieldInteger datLoadingWidth;
    @XmlElement(name = "LoadingHeight")
    protected FieldInteger loadingHeight;
    @XmlElement(name = "DatLoadingHeight")
    protected FieldInteger datLoadingHeight;
    @XmlElement(name = "LoadingSpace")
    protected FieldInteger loadingSpace;
    @XmlElement(name = "DatLoadingSpace")
    protected FieldInteger datLoadingSpace;
    @XmlElement(name = "LoadingSpaceMax")
    protected FieldInteger loadingSpaceMax;
    @XmlElement(name = "DatLoadingSpaceMax")
    protected FieldInteger datLoadingSpaceMax;
    @XmlElement(name = "UpperBodyMaterial")
    protected FieldString30 upperBodyMaterial;
    @XmlElement(name = "InsuranceTypeClassLiability")
    protected FieldString2 insuranceTypeClassLiability;
    @XmlElement(name = "InsuranceTypeClassCascoPartial")
    protected FieldString2 insuranceTypeClassCascoPartial;
    @XmlElement(name = "InsuranceTypeClassCascoComplete")
    protected FieldString2 insuranceTypeClassCascoComplete;
    @XmlElement(name = "DustBadge")
    protected FieldString dustBadge;
    @XmlElement(name = "ProductGroupName")
    protected FieldString1000 productGroupName;
    @XmlElement(name = "EmissionKey")
    protected String emissionKey;
    @XmlElement(name = "Built")
    protected FieldString30 built;
    @XmlElement(name = "AllowedLoadCapacity")
    protected FieldInteger allowedLoadCapacity;
    @XmlElement(name = "CabinStructureAltDescription")
    protected FieldString30 cabinStructureAltDescription;
    @XmlElement(name = "CushionColorId")
    protected FieldString30 cushionColorId;
    @XmlElement(name = "FuelmethodAbbr")
    protected FieldString1000 fuelmethodAbbr;
    @XmlElement(name = "InsuranceTypeClassCascoCompleteNeu")
    protected FieldString2 insuranceTypeClassCascoCompleteNeu;
    @XmlElement(name = "InsuranceTypeClassCascoPartialNeu")
    protected FieldString2 insuranceTypeClassCascoPartialNeu;
    @XmlElement(name = "InsuranceTypeClassLiabilityNew")
    protected FieldString2 insuranceTypeClassLiabilityNew;
    @XmlElement(name = "PayloadAlternative")
    protected FieldInteger payloadAlternative;
    @XmlElement(name = "PowerKwSae")
    protected FieldDecimal powerKwSae;
    @XmlElement(name = "SommerSmogBadge")
    protected FieldString sommerSmogBadge;
    @XmlElement(name = "StowageMassFormat")
    protected FieldString stowageMassFormat;
    @XmlElement(name = "TokenChangedCapacity")
    protected FieldString tokenChangedCapacity;
    @XmlElement(name = "TokenTurboEngine")
    protected FieldString tokenTurboEngine;
    @XmlElement(name = "TypeOfTaxation")
    protected FieldString typeOfTaxation;
    @XmlElement(name = "TypeSheetNumber")
    protected FieldString10 typeSheetNumber;
    @XmlElement(name = "WhelBaseAlternative")
    protected FieldInteger whelBaseAlternative;
    @XmlElement(name = "SuitableForE10")
    protected FieldBoolean suitableForE10;
    @XmlElement(name = "DatSuitableForE10")
    protected FieldBoolean datSuitableForE10;
    @XmlElement(name = "WeightTotalCombination")
    protected FieldInteger weightTotalCombination;
    @XmlElement(name = "DatWeightTotalCombination")
    protected FieldInteger datWeightTotalCombination;
    @XmlElement(name = "WidthForGarage")
    protected FieldInteger widthForGarage;
    @XmlElement(name = "DatWidthForGarage")
    protected FieldInteger datWidthForGarage;
    @XmlElement(name = "PowerKwSystem")
    protected FieldDecimal powerKwSystem;
    @XmlElement(name = "DatPowerKwSystem")
    protected FieldDecimal datPowerKwSystem;
    @XmlElement(name = "PowerHpSystem")
    protected FieldDecimal powerHpSystem;
    @XmlElement(name = "DatPowerHpSystem")
    protected FieldDecimal datPowerHpSystem;
    @XmlElement(name = "PowerKwPermanent")
    protected FieldDecimal powerKwPermanent;
    @XmlElement(name = "DatPowerKwPermanent")
    protected FieldDecimal datPowerKwPermanent;
    @XmlElement(name = "PowerHpPermanent")
    protected FieldDecimal powerHpPermanent;
    @XmlElement(name = "DatPowerHpPermanent")
    protected FieldDecimal datPowerHpPermanent;
    @XmlElement(name = "PowerKwMax")
    protected FieldDecimal powerKwMax;
    @XmlElement(name = "DatPowerKwMax")
    protected FieldDecimal datPowerKwMax;
    @XmlElement(name = "PowerHpMax")
    protected FieldDecimal powerHpMax;
    @XmlElement(name = "DatPowerHpMax")
    protected FieldDecimal datPowerHpMax;
    @XmlElement(name = "PowerKwPermanentSecondary")
    protected FieldDecimal powerKwPermanentSecondary;
    @XmlElement(name = "DatPowerKwPermanentSecondary")
    protected FieldDecimal datPowerKwPermanentSecondary;
    @XmlElement(name = "PowerHpPermanentSecondary")
    protected FieldDecimal powerHpPermanentSecondary;
    @XmlElement(name = "DatPowerHpPermanentSecondary")
    protected FieldDecimal datPowerHpPermanentSecondary;
    @XmlElement(name = "PowerKwMaxSecondary")
    protected FieldDecimal powerKwMaxSecondary;
    @XmlElement(name = "DatPowerKwMaxSecondary")
    protected FieldDecimal datPowerKwMaxSecondary;
    @XmlElement(name = "PowerHpMaxSecondary")
    protected FieldDecimal powerHpMaxSecondary;
    @XmlElement(name = "DatPowerHpMaxSecondary")
    protected FieldDecimal datPowerHpMaxSecondary;
    @XmlElement(name = "BatteryVoltage")
    protected FieldDecimal batteryVoltage;
    @XmlElement(name = "DatBatteryVoltage")
    protected FieldDecimal datBatteryVoltage;
    @XmlElement(name = "BatteryCapacity")
    protected FieldDecimal batteryCapacity;
    @XmlElement(name = "DatBatteryCapacity")
    protected FieldDecimal datBatteryCapacity;
    @XmlElement(name = "BatteryWeight")
    protected FieldDecimal batteryWeight;
    @XmlElement(name = "DatBatteryWeight")
    protected FieldDecimal datBatteryWeight;
    @XmlElement(name = "BatteryConstructionType")
    protected FieldString batteryConstructionType;
    @XmlElement(name = "DatBatteryConstructionType")
    protected FieldString datBatteryConstructionType;
    @XmlElement(name = "ChargingCurrentPlugType")
    protected FieldString chargingCurrentPlugType;
    @XmlElement(name = "DatChargingCurrentPlugType")
    protected FieldString datChargingCurrentPlugType;
    @XmlElement(name = "PluginSystem")
    protected FieldBoolean pluginSystem;
    @XmlElement(name = "DatPluginSystem")
    protected FieldBoolean datPluginSystem;
    @XmlElement(name = "QuickdropSystem")
    protected FieldBoolean quickdropSystem;
    @XmlElement(name = "DatQuickdropSystem")
    protected FieldBoolean datQuickdropSystem;
    @XmlElement(name = "NormalChargeVoltage")
    protected FieldInteger normalChargeVoltage;
    @XmlElement(name = "DatNormalChargeVoltage")
    protected FieldInteger datNormalChargeVoltage;
    @XmlElement(name = "NormalChargeDuration")
    protected FieldDecimal normalChargeDuration;
    @XmlElement(name = "DatNormalChargeDuration")
    protected FieldDecimal datNormalChargeDuration;
    @XmlElement(name = "QuickChargeVoltage")
    protected FieldInteger quickChargeVoltage;
    @XmlElement(name = "DatQuickChargeVoltage")
    protected FieldInteger datQuickChargeVoltage;
    @XmlElement(name = "QuickChargeDuration")
    protected FieldDecimal quickChargeDuration;
    @XmlElement(name = "DatQuickChargeDuration")
    protected FieldDecimal datQuickChargeDuration;
    @XmlElement(name = "ConsumptionElectricalCurrent")
    protected FieldDecimal consumptionElectricalCurrent;
    @XmlElement(name = "DatConsumptionElectricalCurrent")
    protected FieldDecimal datConsumptionElectricalCurrent;
    @XmlElement(name = "RangeOfElectricMotor")
    protected FieldInteger rangeOfElectricMotor;
    @XmlElement(name = "DatRangeOfElectricMotor")
    protected FieldInteger datRangeOfElectricMotor;
    @XmlElement(name = "RangeTotal")
    protected FieldInteger rangeTotal;
    @XmlElement(name = "DatRangeTotal")
    protected FieldInteger datRangeTotal;
    @XmlElement(name = "EnergyEfficiencyClass")
    protected FieldString2 energyEfficiencyClass;
    @XmlElement(name = "DatEnergyEfficiencyClass")
    protected FieldString2 datEnergyEfficiencyClass;
    @XmlElement(name = "ModelTypecode")
    protected FieldString modelTypecode;
    @XmlElement(name = "ModelVariant")
    protected FieldString modelVariant;
    @XmlElement(name = "Type")
    protected FieldString type;
    @XmlElement(name = "TypeVariant")
    protected FieldString typeVariant;
    @XmlElement(name = "EngineType")
    protected FieldString engineType;
    @XmlElement(name = "SpecialModel")
    protected FieldString specialModel;

    /**
     * Ruft den Wert der fillingQuantities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FillingQuantities }
     *     
     */
    public FillingQuantities getFillingQuantities() {
        return fillingQuantities;
    }

    /**
     * Legt den Wert der fillingQuantities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FillingQuantities }
     *     
     */
    public void setFillingQuantities(FillingQuantities value) {
        this.fillingQuantities = value;
    }

    /**
     * Ruft den Wert der structureType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getStructureType() {
        return structureType;
    }

    /**
     * Legt den Wert der structureType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setStructureType(FieldString value) {
        this.structureType = value;
    }

    /**
     * Ruft den Wert der structureDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getStructureDescription() {
        return structureDescription;
    }

    /**
     * Legt den Wert der structureDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setStructureDescription(FieldString value) {
        this.structureDescription = value;
    }

    /**
     * Ruft den Wert der cabineStructureType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCabineStructureType() {
        return cabineStructureType;
    }

    /**
     * Legt den Wert der cabineStructureType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCabineStructureType(FieldString value) {
        this.cabineStructureType = value;
    }

    /**
     * Ruft den Wert der cabineStructureDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString1000 }
     *     
     */
    public FieldString1000 getCabineStructureDescription() {
        return cabineStructureDescription;
    }

    /**
     * Legt den Wert der cabineStructureDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString1000 }
     *     
     */
    public void setCabineStructureDescription(FieldString1000 value) {
        this.cabineStructureDescription = value;
    }

    /**
     * Ruft den Wert der upperBodyStructureType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getUpperBodyStructureType() {
        return upperBodyStructureType;
    }

    /**
     * Legt den Wert der upperBodyStructureType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setUpperBodyStructureType(FieldString value) {
        this.upperBodyStructureType = value;
    }

    /**
     * Ruft den Wert der upperBodyStructureDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getUpperBodyStructureDescription() {
        return upperBodyStructureDescription;
    }

    /**
     * Legt den Wert der upperBodyStructureDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setUpperBodyStructureDescription(FieldString value) {
        this.upperBodyStructureDescription = value;
    }

    /**
     * Ruft den Wert der upperBodyStructureAndVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getUpperBodyStructureAndVersion() {
        return upperBodyStructureAndVersion;
    }

    /**
     * Legt den Wert der upperBodyStructureAndVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setUpperBodyStructureAndVersion(FieldString value) {
        this.upperBodyStructureAndVersion = value;
    }

    /**
     * Ruft den Wert der countOfAxles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getCountOfAxles() {
        return countOfAxles;
    }

    /**
     * Legt den Wert der countOfAxles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setCountOfAxles(FieldInteger value) {
        this.countOfAxles = value;
    }

    /**
     * Ruft den Wert der datCountOfAxles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatCountOfAxles() {
        return datCountOfAxles;
    }

    /**
     * Legt den Wert der datCountOfAxles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatCountOfAxles(FieldInteger value) {
        this.datCountOfAxles = value;
    }

    /**
     * Ruft den Wert der countOfDrivedAxles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getCountOfDrivedAxles() {
        return countOfDrivedAxles;
    }

    /**
     * Legt den Wert der countOfDrivedAxles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setCountOfDrivedAxles(FieldInteger value) {
        this.countOfDrivedAxles = value;
    }

    /**
     * Ruft den Wert der datCountOfDrivedAxles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatCountOfDrivedAxles() {
        return datCountOfDrivedAxles;
    }

    /**
     * Legt den Wert der datCountOfDrivedAxles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatCountOfDrivedAxles(FieldInteger value) {
        this.datCountOfDrivedAxles = value;
    }

    /**
     * Ruft den Wert der wheelBase-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getWheelBase() {
        return wheelBase;
    }

    /**
     * Legt den Wert der wheelBase-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setWheelBase(FieldInteger value) {
        this.wheelBase = value;
    }

    /**
     * Ruft den Wert der datWheelBase-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatWheelBase() {
        return datWheelBase;
    }

    /**
     * Legt den Wert der datWheelBase-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatWheelBase(FieldInteger value) {
        this.datWheelBase = value;
    }

    /**
     * Ruft den Wert der wheelBase2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getWheelBase2() {
        return wheelBase2;
    }

    /**
     * Legt den Wert der wheelBase2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setWheelBase2(FieldInteger value) {
        this.wheelBase2 = value;
    }

    /**
     * Ruft den Wert der axleLoadFront-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getAxleLoadFront() {
        return axleLoadFront;
    }

    /**
     * Legt den Wert der axleLoadFront-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setAxleLoadFront(FieldInteger value) {
        this.axleLoadFront = value;
    }

    /**
     * Ruft den Wert der axleLoadMiddle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getAxleLoadMiddle() {
        return axleLoadMiddle;
    }

    /**
     * Legt den Wert der axleLoadMiddle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setAxleLoadMiddle(FieldInteger value) {
        this.axleLoadMiddle = value;
    }

    /**
     * Ruft den Wert der axleLoadBack-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getAxleLoadBack() {
        return axleLoadBack;
    }

    /**
     * Legt den Wert der axleLoadBack-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setAxleLoadBack(FieldInteger value) {
        this.axleLoadBack = value;
    }

    /**
     * Ruft den Wert der tonnageClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString2 }
     *     
     */
    public FieldString2 getTonnageClass() {
        return tonnageClass;
    }

    /**
     * Legt den Wert der tonnageClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString2 }
     *     
     */
    public void setTonnageClass(FieldString2 value) {
        this.tonnageClass = value;
    }

    /**
     * Ruft den Wert der length-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLength() {
        return length;
    }

    /**
     * Legt den Wert der length-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLength(FieldInteger value) {
        this.length = value;
    }

    /**
     * Ruft den Wert der datLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatLength() {
        return datLength;
    }

    /**
     * Legt den Wert der datLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatLength(FieldInteger value) {
        this.datLength = value;
    }

    /**
     * Ruft den Wert der width-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getWidth() {
        return width;
    }

    /**
     * Legt den Wert der width-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setWidth(FieldInteger value) {
        this.width = value;
    }

    /**
     * Ruft den Wert der datWidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatWidth() {
        return datWidth;
    }

    /**
     * Legt den Wert der datWidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatWidth(FieldInteger value) {
        this.datWidth = value;
    }

    /**
     * Ruft den Wert der height-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getHeight() {
        return height;
    }

    /**
     * Legt den Wert der height-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setHeight(FieldInteger value) {
        this.height = value;
    }

    /**
     * Ruft den Wert der datHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatHeight() {
        return datHeight;
    }

    /**
     * Legt den Wert der datHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatHeight(FieldInteger value) {
        this.datHeight = value;
    }

    /**
     * Ruft den Wert der roofLoad-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getRoofLoad() {
        return roofLoad;
    }

    /**
     * Legt den Wert der roofLoad-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setRoofLoad(FieldInteger value) {
        this.roofLoad = value;
    }

    /**
     * Ruft den Wert der datRoofLoad-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatRoofLoad() {
        return datRoofLoad;
    }

    /**
     * Legt den Wert der datRoofLoad-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatRoofLoad(FieldInteger value) {
        this.datRoofLoad = value;
    }

    /**
     * Ruft den Wert der trailerLoadBraked-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getTrailerLoadBraked() {
        return trailerLoadBraked;
    }

    /**
     * Legt den Wert der trailerLoadBraked-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setTrailerLoadBraked(FieldInteger value) {
        this.trailerLoadBraked = value;
    }

    /**
     * Ruft den Wert der datTrailerLoadBraked-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatTrailerLoadBraked() {
        return datTrailerLoadBraked;
    }

    /**
     * Legt den Wert der datTrailerLoadBraked-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatTrailerLoadBraked(FieldInteger value) {
        this.datTrailerLoadBraked = value;
    }

    /**
     * Ruft den Wert der trailerLoadUnbraked-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getTrailerLoadUnbraked() {
        return trailerLoadUnbraked;
    }

    /**
     * Legt den Wert der trailerLoadUnbraked-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setTrailerLoadUnbraked(FieldInteger value) {
        this.trailerLoadUnbraked = value;
    }

    /**
     * Ruft den Wert der datTrailerLoadUnbraked-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatTrailerLoadUnbraked() {
        return datTrailerLoadUnbraked;
    }

    /**
     * Legt den Wert der datTrailerLoadUnbraked-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatTrailerLoadUnbraked(FieldInteger value) {
        this.datTrailerLoadUnbraked = value;
    }

    /**
     * Ruft den Wert der vehicleSeats-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getVehicleSeats() {
        return vehicleSeats;
    }

    /**
     * Legt den Wert der vehicleSeats-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setVehicleSeats(FieldInteger value) {
        this.vehicleSeats = value;
    }

    /**
     * Ruft den Wert der datVehicleSeats-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatVehicleSeats() {
        return datVehicleSeats;
    }

    /**
     * Legt den Wert der datVehicleSeats-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatVehicleSeats(FieldInteger value) {
        this.datVehicleSeats = value;
    }

    /**
     * Ruft den Wert der vehicleDoors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getVehicleDoors() {
        return vehicleDoors;
    }

    /**
     * Legt den Wert der vehicleDoors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setVehicleDoors(FieldInteger value) {
        this.vehicleDoors = value;
    }

    /**
     * Ruft den Wert der datVehicleDoors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatVehicleDoors() {
        return datVehicleDoors;
    }

    /**
     * Legt den Wert der datVehicleDoors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatVehicleDoors(FieldInteger value) {
        this.datVehicleDoors = value;
    }

    /**
     * Ruft den Wert der countOfAirbags-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getCountOfAirbags() {
        return countOfAirbags;
    }

    /**
     * Legt den Wert der countOfAirbags-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setCountOfAirbags(FieldInteger value) {
        this.countOfAirbags = value;
    }

    /**
     * Ruft den Wert der datCountOfAirbags-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatCountOfAirbags() {
        return datCountOfAirbags;
    }

    /**
     * Legt den Wert der datCountOfAirbags-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatCountOfAirbags(FieldInteger value) {
        this.datCountOfAirbags = value;
    }

    /**
     * Ruft den Wert der acceleration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getAcceleration() {
        return acceleration;
    }

    /**
     * Legt den Wert der acceleration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setAcceleration(FieldDecimal value) {
        this.acceleration = value;
    }

    /**
     * Ruft den Wert der datAcceleration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatAcceleration() {
        return datAcceleration;
    }

    /**
     * Legt den Wert der datAcceleration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatAcceleration(FieldDecimal value) {
        this.datAcceleration = value;
    }

    /**
     * Ruft den Wert der speedMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getSpeedMax() {
        return speedMax;
    }

    /**
     * Legt den Wert der speedMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setSpeedMax(FieldInteger value) {
        this.speedMax = value;
    }

    /**
     * Ruft den Wert der datSpeedMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatSpeedMax() {
        return datSpeedMax;
    }

    /**
     * Legt den Wert der datSpeedMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatSpeedMax(FieldInteger value) {
        this.datSpeedMax = value;
    }

    /**
     * Ruft den Wert der powerHp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getPowerHp() {
        return powerHp;
    }

    /**
     * Legt den Wert der powerHp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setPowerHp(FieldInteger value) {
        this.powerHp = value;
    }

    /**
     * Ruft den Wert der datPowerHp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatPowerHp() {
        return datPowerHp;
    }

    /**
     * Legt den Wert der datPowerHp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatPowerHp(FieldInteger value) {
        this.datPowerHp = value;
    }

    /**
     * Ruft den Wert der powerKw-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPowerKw() {
        return powerKw;
    }

    /**
     * Legt den Wert der powerKw-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPowerKw(FieldDecimal value) {
        this.powerKw = value;
    }

    /**
     * Ruft den Wert der datPowerKw-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatPowerKw() {
        return datPowerKw;
    }

    /**
     * Legt den Wert der datPowerKw-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatPowerKw(FieldDecimal value) {
        this.datPowerKw = value;
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
     * Ruft den Wert der cylinder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getCylinder() {
        return cylinder;
    }

    /**
     * Legt den Wert der cylinder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setCylinder(FieldInteger value) {
        this.cylinder = value;
    }

    /**
     * Ruft den Wert der datCylinder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatCylinder() {
        return datCylinder;
    }

    /**
     * Legt den Wert der datCylinder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatCylinder(FieldInteger value) {
        this.datCylinder = value;
    }

    /**
     * Ruft den Wert der cylinderArrangement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString30 }
     *     
     */
    public FieldString30 getCylinderArrangement() {
        return cylinderArrangement;
    }

    /**
     * Legt den Wert der cylinderArrangement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString30 }
     *     
     */
    public void setCylinderArrangement(FieldString30 value) {
        this.cylinderArrangement = value;
    }

    /**
     * Ruft den Wert der datCylinderArrangement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString30 }
     *     
     */
    public FieldString30 getDatCylinderArrangement() {
        return datCylinderArrangement;
    }

    /**
     * Legt den Wert der datCylinderArrangement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString30 }
     *     
     */
    public void setDatCylinderArrangement(FieldString30 value) {
        this.datCylinderArrangement = value;
    }

    /**
     * Ruft den Wert der rotationsOnMaxPower-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getRotationsOnMaxPower() {
        return rotationsOnMaxPower;
    }

    /**
     * Legt den Wert der rotationsOnMaxPower-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setRotationsOnMaxPower(FieldInteger value) {
        this.rotationsOnMaxPower = value;
    }

    /**
     * Ruft den Wert der datRotationsOnMaxPower-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatRotationsOnMaxPower() {
        return datRotationsOnMaxPower;
    }

    /**
     * Legt den Wert der datRotationsOnMaxPower-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatRotationsOnMaxPower(FieldInteger value) {
        this.datRotationsOnMaxPower = value;
    }

    /**
     * Ruft den Wert der rotationsOnMaxTorque-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getRotationsOnMaxTorque() {
        return rotationsOnMaxTorque;
    }

    /**
     * Legt den Wert der rotationsOnMaxTorque-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setRotationsOnMaxTorque(FieldInteger value) {
        this.rotationsOnMaxTorque = value;
    }

    /**
     * Ruft den Wert der datRotationsOnMaxTorque-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatRotationsOnMaxTorque() {
        return datRotationsOnMaxTorque;
    }

    /**
     * Legt den Wert der datRotationsOnMaxTorque-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatRotationsOnMaxTorque(FieldInteger value) {
        this.datRotationsOnMaxTorque = value;
    }

    /**
     * Ruft den Wert der torque-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getTorque() {
        return torque;
    }

    /**
     * Legt den Wert der torque-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setTorque(FieldInteger value) {
        this.torque = value;
    }

    /**
     * Ruft den Wert der datTorque-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatTorque() {
        return datTorque;
    }

    /**
     * Legt den Wert der datTorque-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatTorque(FieldInteger value) {
        this.datTorque = value;
    }

    /**
     * Ruft den Wert der gearboxType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getGearboxType() {
        return gearboxType;
    }

    /**
     * Legt den Wert der gearboxType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setGearboxType(FieldString value) {
        this.gearboxType = value;
    }

    /**
     * Ruft den Wert der nrOfGears-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNrOfGears() {
        return nrOfGears;
    }

    /**
     * Legt den Wert der nrOfGears-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNrOfGears(FieldString value) {
        this.nrOfGears = value;
    }

    /**
     * Ruft den Wert der originalTireSizeAxle1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getOriginalTireSizeAxle1() {
        return originalTireSizeAxle1;
    }

    /**
     * Legt den Wert der originalTireSizeAxle1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setOriginalTireSizeAxle1(FieldString value) {
        this.originalTireSizeAxle1 = value;
    }

    /**
     * Ruft den Wert der originalTireSizeAxle2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getOriginalTireSizeAxle2() {
        return originalTireSizeAxle2;
    }

    /**
     * Legt den Wert der originalTireSizeAxle2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setOriginalTireSizeAxle2(FieldString value) {
        this.originalTireSizeAxle2 = value;
    }

    /**
     * Ruft den Wert der tankVolume-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getTankVolume() {
        return tankVolume;
    }

    /**
     * Legt den Wert der tankVolume-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setTankVolume(FieldInteger value) {
        this.tankVolume = value;
    }

    /**
     * Ruft den Wert der datTankVolume-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatTankVolume() {
        return datTankVolume;
    }

    /**
     * Legt den Wert der datTankVolume-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatTankVolume(FieldInteger value) {
        this.datTankVolume = value;
    }

    /**
     * Ruft den Wert der tankVolumeAlternative-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getTankVolumeAlternative() {
        return tankVolumeAlternative;
    }

    /**
     * Legt den Wert der tankVolumeAlternative-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setTankVolumeAlternative(FieldInteger value) {
        this.tankVolumeAlternative = value;
    }

    /**
     * Ruft den Wert der datTankVolumeAlternative-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatTankVolumeAlternative() {
        return datTankVolumeAlternative;
    }

    /**
     * Legt den Wert der datTankVolumeAlternative-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatTankVolumeAlternative(FieldInteger value) {
        this.datTankVolumeAlternative = value;
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
     * Ruft den Wert der datConsumptionInTown-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatConsumptionInTown() {
        return datConsumptionInTown;
    }

    /**
     * Legt den Wert der datConsumptionInTown-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatConsumptionInTown(FieldDecimal value) {
        this.datConsumptionInTown = value;
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
     * Ruft den Wert der datConsumptionOutOfTown-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatConsumptionOutOfTown() {
        return datConsumptionOutOfTown;
    }

    /**
     * Legt den Wert der datConsumptionOutOfTown-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatConsumptionOutOfTown(FieldDecimal value) {
        this.datConsumptionOutOfTown = value;
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
     * Ruft den Wert der datConsumption-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatConsumption() {
        return datConsumption;
    }

    /**
     * Legt den Wert der datConsumption-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatConsumption(FieldDecimal value) {
        this.datConsumption = value;
    }

    /**
     * Ruft den Wert der consumptionInnerCng-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getConsumptionInnerCng() {
        return consumptionInnerCng;
    }

    /**
     * Legt den Wert der consumptionInnerCng-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setConsumptionInnerCng(FieldDecimal value) {
        this.consumptionInnerCng = value;
    }

    /**
     * Ruft den Wert der datConsumptionInnerCng-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatConsumptionInnerCng() {
        return datConsumptionInnerCng;
    }

    /**
     * Legt den Wert der datConsumptionInnerCng-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatConsumptionInnerCng(FieldDecimal value) {
        this.datConsumptionInnerCng = value;
    }

    /**
     * Ruft den Wert der consumptionOuterCng-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getConsumptionOuterCng() {
        return consumptionOuterCng;
    }

    /**
     * Legt den Wert der consumptionOuterCng-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setConsumptionOuterCng(FieldDecimal value) {
        this.consumptionOuterCng = value;
    }

    /**
     * Ruft den Wert der datConsumptionOuterCng-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatConsumptionOuterCng() {
        return datConsumptionOuterCng;
    }

    /**
     * Legt den Wert der datConsumptionOuterCng-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatConsumptionOuterCng(FieldDecimal value) {
        this.datConsumptionOuterCng = value;
    }

    /**
     * Ruft den Wert der consumptionMixCng-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getConsumptionMixCng() {
        return consumptionMixCng;
    }

    /**
     * Legt den Wert der consumptionMixCng-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setConsumptionMixCng(FieldDecimal value) {
        this.consumptionMixCng = value;
    }

    /**
     * Ruft den Wert der datConsumptionMixCng-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatConsumptionMixCng() {
        return datConsumptionMixCng;
    }

    /**
     * Legt den Wert der datConsumptionMixCng-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatConsumptionMixCng(FieldDecimal value) {
        this.datConsumptionMixCng = value;
    }

    /**
     * Ruft den Wert der consumptionInnerLpg-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getConsumptionInnerLpg() {
        return consumptionInnerLpg;
    }

    /**
     * Legt den Wert der consumptionInnerLpg-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setConsumptionInnerLpg(FieldDecimal value) {
        this.consumptionInnerLpg = value;
    }

    /**
     * Ruft den Wert der datConsumptionInnerLpg-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatConsumptionInnerLpg() {
        return datConsumptionInnerLpg;
    }

    /**
     * Legt den Wert der datConsumptionInnerLpg-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatConsumptionInnerLpg(FieldDecimal value) {
        this.datConsumptionInnerLpg = value;
    }

    /**
     * Ruft den Wert der consumptionOuterLpg-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getConsumptionOuterLpg() {
        return consumptionOuterLpg;
    }

    /**
     * Legt den Wert der consumptionOuterLpg-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setConsumptionOuterLpg(FieldDecimal value) {
        this.consumptionOuterLpg = value;
    }

    /**
     * Ruft den Wert der datConsumptionOuterLpg-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatConsumptionOuterLpg() {
        return datConsumptionOuterLpg;
    }

    /**
     * Legt den Wert der datConsumptionOuterLpg-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatConsumptionOuterLpg(FieldDecimal value) {
        this.datConsumptionOuterLpg = value;
    }

    /**
     * Ruft den Wert der consumptionMixLpg-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getConsumptionMixLpg() {
        return consumptionMixLpg;
    }

    /**
     * Legt den Wert der consumptionMixLpg-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setConsumptionMixLpg(FieldDecimal value) {
        this.consumptionMixLpg = value;
    }

    /**
     * Ruft den Wert der datConsumptionMixLpg-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatConsumptionMixLpg() {
        return datConsumptionMixLpg;
    }

    /**
     * Legt den Wert der datConsumptionMixLpg-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatConsumptionMixLpg(FieldDecimal value) {
        this.datConsumptionMixLpg = value;
    }

    /**
     * Ruft den Wert der consumptionInnerH-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getConsumptionInnerH() {
        return consumptionInnerH;
    }

    /**
     * Legt den Wert der consumptionInnerH-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setConsumptionInnerH(FieldDecimal value) {
        this.consumptionInnerH = value;
    }

    /**
     * Ruft den Wert der datConsumptionInnerH-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatConsumptionInnerH() {
        return datConsumptionInnerH;
    }

    /**
     * Legt den Wert der datConsumptionInnerH-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatConsumptionInnerH(FieldDecimal value) {
        this.datConsumptionInnerH = value;
    }

    /**
     * Ruft den Wert der consumptionOuterH-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getConsumptionOuterH() {
        return consumptionOuterH;
    }

    /**
     * Legt den Wert der consumptionOuterH-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setConsumptionOuterH(FieldDecimal value) {
        this.consumptionOuterH = value;
    }

    /**
     * Ruft den Wert der datConsumptionOuterH-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatConsumptionOuterH() {
        return datConsumptionOuterH;
    }

    /**
     * Legt den Wert der datConsumptionOuterH-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatConsumptionOuterH(FieldDecimal value) {
        this.datConsumptionOuterH = value;
    }

    /**
     * Ruft den Wert der consumptionMixH-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getConsumptionMixH() {
        return consumptionMixH;
    }

    /**
     * Legt den Wert der consumptionMixH-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setConsumptionMixH(FieldDecimal value) {
        this.consumptionMixH = value;
    }

    /**
     * Ruft den Wert der datConsumptionMixH-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatConsumptionMixH() {
        return datConsumptionMixH;
    }

    /**
     * Legt den Wert der datConsumptionMixH-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatConsumptionMixH(FieldDecimal value) {
        this.datConsumptionMixH = value;
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
     * Ruft den Wert der datCo2Emission-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatCo2Emission() {
        return datCo2Emission;
    }

    /**
     * Legt den Wert der datCo2Emission-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatCo2Emission(FieldDecimal value) {
        this.datCo2Emission = value;
    }

    /**
     * Ruft den Wert der emissionClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString5 }
     *     
     */
    public FieldString5 getEmissionClass() {
        return emissionClass;
    }

    /**
     * Legt den Wert der emissionClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString5 }
     *     
     */
    public void setEmissionClass(FieldString5 value) {
        this.emissionClass = value;
    }

    /**
     * Ruft den Wert der datEmissionClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString5 }
     *     
     */
    public FieldString5 getDatEmissionClass() {
        return datEmissionClass;
    }

    /**
     * Legt den Wert der datEmissionClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString5 }
     *     
     */
    public void setDatEmissionClass(FieldString5 value) {
        this.datEmissionClass = value;
    }

    /**
     * Ruft den Wert der emissionClassN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmissionClassN }
     *     
     */
    public EmissionClassN getEmissionClassN() {
        return emissionClassN;
    }

    /**
     * Legt den Wert der emissionClassN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmissionClassN }
     *     
     */
    public void setEmissionClassN(EmissionClassN value) {
        this.emissionClassN = value;
    }

    /**
     * Ruft den Wert der drive-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString1000 }
     *     
     */
    public FieldString1000 getDrive() {
        return drive;
    }

    /**
     * Legt den Wert der drive-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString1000 }
     *     
     */
    public void setDrive(FieldString1000 value) {
        this.drive = value;
    }

    /**
     * Ruft den Wert der datDrive-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString1000 }
     *     
     */
    public FieldString1000 getDatDrive() {
        return datDrive;
    }

    /**
     * Legt den Wert der datDrive-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString1000 }
     *     
     */
    public void setDatDrive(FieldString1000 value) {
        this.datDrive = value;
    }

    /**
     * Ruft den Wert der driveN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString1000 }
     *     
     */
    public FieldString1000 getDriveN() {
        return driveN;
    }

    /**
     * Legt den Wert der driveN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString1000 }
     *     
     */
    public void setDriveN(FieldString1000 value) {
        this.driveN = value;
    }

    /**
     * Ruft den Wert der datDriveN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString1000 }
     *     
     */
    public FieldString1000 getDatDriveN() {
        return datDriveN;
    }

    /**
     * Legt den Wert der datDriveN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString1000 }
     *     
     */
    public void setDatDriveN(FieldString1000 value) {
        this.datDriveN = value;
    }

    /**
     * Ruft den Wert der driveCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString10 }
     *     
     */
    public FieldString10 getDriveCode() {
        return driveCode;
    }

    /**
     * Legt den Wert der driveCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString10 }
     *     
     */
    public void setDriveCode(FieldString10 value) {
        this.driveCode = value;
    }

    /**
     * Ruft den Wert der engineCycle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getEngineCycle() {
        return engineCycle;
    }

    /**
     * Legt den Wert der engineCycle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setEngineCycle(FieldInteger value) {
        this.engineCycle = value;
    }

    /**
     * Ruft den Wert der datEngineCycle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatEngineCycle() {
        return datEngineCycle;
    }

    /**
     * Legt den Wert der datEngineCycle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatEngineCycle(FieldInteger value) {
        this.datEngineCycle = value;
    }

    /**
     * Ruft den Wert der fuelMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString1000 }
     *     
     */
    public FieldString1000 getFuelMethod() {
        return fuelMethod;
    }

    /**
     * Legt den Wert der fuelMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString1000 }
     *     
     */
    public void setFuelMethod(FieldString1000 value) {
        this.fuelMethod = value;
    }

    /**
     * Ruft den Wert der datFuelMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString1000 }
     *     
     */
    public FieldString1000 getDatFuelMethod() {
        return datFuelMethod;
    }

    /**
     * Legt den Wert der datFuelMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString1000 }
     *     
     */
    public void setDatFuelMethod(FieldString1000 value) {
        this.datFuelMethod = value;
    }

    /**
     * Ruft den Wert der fuelMethodCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString2 }
     *     
     */
    public FieldString2 getFuelMethodCode() {
        return fuelMethodCode;
    }

    /**
     * Legt den Wert der fuelMethodCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString2 }
     *     
     */
    public void setFuelMethodCode(FieldString2 value) {
        this.fuelMethodCode = value;
    }

    /**
     * Ruft den Wert der fuelMethodType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString1000 }
     *     
     */
    public FieldString1000 getFuelMethodType() {
        return fuelMethodType;
    }

    /**
     * Legt den Wert der fuelMethodType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString1000 }
     *     
     */
    public void setFuelMethodType(FieldString1000 value) {
        this.fuelMethodType = value;
    }

    /**
     * Ruft den Wert der datFuelMethodType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString1000 }
     *     
     */
    public FieldString1000 getDatFuelMethodType() {
        return datFuelMethodType;
    }

    /**
     * Legt den Wert der datFuelMethodType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString1000 }
     *     
     */
    public void setDatFuelMethodType(FieldString1000 value) {
        this.datFuelMethodType = value;
    }

    /**
     * Ruft den Wert der unloadedWeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getUnloadedWeight() {
        return unloadedWeight;
    }

    /**
     * Legt den Wert der unloadedWeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setUnloadedWeight(FieldInteger value) {
        this.unloadedWeight = value;
    }

    /**
     * Ruft den Wert der datUnloadedWeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatUnloadedWeight() {
        return datUnloadedWeight;
    }

    /**
     * Legt den Wert der datUnloadedWeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatUnloadedWeight(FieldInteger value) {
        this.datUnloadedWeight = value;
    }

    /**
     * Ruft den Wert der permissableTotalWeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getPermissableTotalWeight() {
        return permissableTotalWeight;
    }

    /**
     * Legt den Wert der permissableTotalWeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setPermissableTotalWeight(FieldInteger value) {
        this.permissableTotalWeight = value;
    }

    /**
     * Ruft den Wert der datPermissableTotalWeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatPermissableTotalWeight() {
        return datPermissableTotalWeight;
    }

    /**
     * Legt den Wert der datPermissableTotalWeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatPermissableTotalWeight(FieldInteger value) {
        this.datPermissableTotalWeight = value;
    }

    /**
     * Ruft den Wert der payload-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getPayload() {
        return payload;
    }

    /**
     * Legt den Wert der payload-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setPayload(FieldInteger value) {
        this.payload = value;
    }

    /**
     * Ruft den Wert der datPayload-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatPayload() {
        return datPayload;
    }

    /**
     * Legt den Wert der datPayload-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatPayload(FieldInteger value) {
        this.datPayload = value;
    }

    /**
     * Ruft den Wert der loadingLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLoadingLength() {
        return loadingLength;
    }

    /**
     * Legt den Wert der loadingLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLoadingLength(FieldInteger value) {
        this.loadingLength = value;
    }

    /**
     * Ruft den Wert der datLoadingLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatLoadingLength() {
        return datLoadingLength;
    }

    /**
     * Legt den Wert der datLoadingLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatLoadingLength(FieldInteger value) {
        this.datLoadingLength = value;
    }

    /**
     * Ruft den Wert der loadingWidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLoadingWidth() {
        return loadingWidth;
    }

    /**
     * Legt den Wert der loadingWidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLoadingWidth(FieldInteger value) {
        this.loadingWidth = value;
    }

    /**
     * Ruft den Wert der datLoadingWidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatLoadingWidth() {
        return datLoadingWidth;
    }

    /**
     * Legt den Wert der datLoadingWidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatLoadingWidth(FieldInteger value) {
        this.datLoadingWidth = value;
    }

    /**
     * Ruft den Wert der loadingHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLoadingHeight() {
        return loadingHeight;
    }

    /**
     * Legt den Wert der loadingHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLoadingHeight(FieldInteger value) {
        this.loadingHeight = value;
    }

    /**
     * Ruft den Wert der datLoadingHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatLoadingHeight() {
        return datLoadingHeight;
    }

    /**
     * Legt den Wert der datLoadingHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatLoadingHeight(FieldInteger value) {
        this.datLoadingHeight = value;
    }

    /**
     * Ruft den Wert der loadingSpace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLoadingSpace() {
        return loadingSpace;
    }

    /**
     * Legt den Wert der loadingSpace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLoadingSpace(FieldInteger value) {
        this.loadingSpace = value;
    }

    /**
     * Ruft den Wert der datLoadingSpace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatLoadingSpace() {
        return datLoadingSpace;
    }

    /**
     * Legt den Wert der datLoadingSpace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatLoadingSpace(FieldInteger value) {
        this.datLoadingSpace = value;
    }

    /**
     * Ruft den Wert der loadingSpaceMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLoadingSpaceMax() {
        return loadingSpaceMax;
    }

    /**
     * Legt den Wert der loadingSpaceMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLoadingSpaceMax(FieldInteger value) {
        this.loadingSpaceMax = value;
    }

    /**
     * Ruft den Wert der datLoadingSpaceMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatLoadingSpaceMax() {
        return datLoadingSpaceMax;
    }

    /**
     * Legt den Wert der datLoadingSpaceMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatLoadingSpaceMax(FieldInteger value) {
        this.datLoadingSpaceMax = value;
    }

    /**
     * Ruft den Wert der upperBodyMaterial-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString30 }
     *     
     */
    public FieldString30 getUpperBodyMaterial() {
        return upperBodyMaterial;
    }

    /**
     * Legt den Wert der upperBodyMaterial-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString30 }
     *     
     */
    public void setUpperBodyMaterial(FieldString30 value) {
        this.upperBodyMaterial = value;
    }

    /**
     * Ruft den Wert der insuranceTypeClassLiability-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString2 }
     *     
     */
    public FieldString2 getInsuranceTypeClassLiability() {
        return insuranceTypeClassLiability;
    }

    /**
     * Legt den Wert der insuranceTypeClassLiability-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString2 }
     *     
     */
    public void setInsuranceTypeClassLiability(FieldString2 value) {
        this.insuranceTypeClassLiability = value;
    }

    /**
     * Ruft den Wert der insuranceTypeClassCascoPartial-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString2 }
     *     
     */
    public FieldString2 getInsuranceTypeClassCascoPartial() {
        return insuranceTypeClassCascoPartial;
    }

    /**
     * Legt den Wert der insuranceTypeClassCascoPartial-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString2 }
     *     
     */
    public void setInsuranceTypeClassCascoPartial(FieldString2 value) {
        this.insuranceTypeClassCascoPartial = value;
    }

    /**
     * Ruft den Wert der insuranceTypeClassCascoComplete-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString2 }
     *     
     */
    public FieldString2 getInsuranceTypeClassCascoComplete() {
        return insuranceTypeClassCascoComplete;
    }

    /**
     * Legt den Wert der insuranceTypeClassCascoComplete-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString2 }
     *     
     */
    public void setInsuranceTypeClassCascoComplete(FieldString2 value) {
        this.insuranceTypeClassCascoComplete = value;
    }

    /**
     * Ruft den Wert der dustBadge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDustBadge() {
        return dustBadge;
    }

    /**
     * Legt den Wert der dustBadge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDustBadge(FieldString value) {
        this.dustBadge = value;
    }

    /**
     * Ruft den Wert der productGroupName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString1000 }
     *     
     */
    public FieldString1000 getProductGroupName() {
        return productGroupName;
    }

    /**
     * Legt den Wert der productGroupName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString1000 }
     *     
     */
    public void setProductGroupName(FieldString1000 value) {
        this.productGroupName = value;
    }

    /**
     * Ruft den Wert der emissionKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmissionKey() {
        return emissionKey;
    }

    /**
     * Legt den Wert der emissionKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmissionKey(String value) {
        this.emissionKey = value;
    }

    /**
     * Ruft den Wert der built-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString30 }
     *     
     */
    public FieldString30 getBuilt() {
        return built;
    }

    /**
     * Legt den Wert der built-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString30 }
     *     
     */
    public void setBuilt(FieldString30 value) {
        this.built = value;
    }

    /**
     * Ruft den Wert der allowedLoadCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getAllowedLoadCapacity() {
        return allowedLoadCapacity;
    }

    /**
     * Legt den Wert der allowedLoadCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setAllowedLoadCapacity(FieldInteger value) {
        this.allowedLoadCapacity = value;
    }

    /**
     * Ruft den Wert der cabinStructureAltDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString30 }
     *     
     */
    public FieldString30 getCabinStructureAltDescription() {
        return cabinStructureAltDescription;
    }

    /**
     * Legt den Wert der cabinStructureAltDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString30 }
     *     
     */
    public void setCabinStructureAltDescription(FieldString30 value) {
        this.cabinStructureAltDescription = value;
    }

    /**
     * Ruft den Wert der cushionColorId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString30 }
     *     
     */
    public FieldString30 getCushionColorId() {
        return cushionColorId;
    }

    /**
     * Legt den Wert der cushionColorId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString30 }
     *     
     */
    public void setCushionColorId(FieldString30 value) {
        this.cushionColorId = value;
    }

    /**
     * Ruft den Wert der fuelmethodAbbr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString1000 }
     *     
     */
    public FieldString1000 getFuelmethodAbbr() {
        return fuelmethodAbbr;
    }

    /**
     * Legt den Wert der fuelmethodAbbr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString1000 }
     *     
     */
    public void setFuelmethodAbbr(FieldString1000 value) {
        this.fuelmethodAbbr = value;
    }

    /**
     * Ruft den Wert der insuranceTypeClassCascoCompleteNeu-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString2 }
     *     
     */
    public FieldString2 getInsuranceTypeClassCascoCompleteNeu() {
        return insuranceTypeClassCascoCompleteNeu;
    }

    /**
     * Legt den Wert der insuranceTypeClassCascoCompleteNeu-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString2 }
     *     
     */
    public void setInsuranceTypeClassCascoCompleteNeu(FieldString2 value) {
        this.insuranceTypeClassCascoCompleteNeu = value;
    }

    /**
     * Ruft den Wert der insuranceTypeClassCascoPartialNeu-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString2 }
     *     
     */
    public FieldString2 getInsuranceTypeClassCascoPartialNeu() {
        return insuranceTypeClassCascoPartialNeu;
    }

    /**
     * Legt den Wert der insuranceTypeClassCascoPartialNeu-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString2 }
     *     
     */
    public void setInsuranceTypeClassCascoPartialNeu(FieldString2 value) {
        this.insuranceTypeClassCascoPartialNeu = value;
    }

    /**
     * Ruft den Wert der insuranceTypeClassLiabilityNew-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString2 }
     *     
     */
    public FieldString2 getInsuranceTypeClassLiabilityNew() {
        return insuranceTypeClassLiabilityNew;
    }

    /**
     * Legt den Wert der insuranceTypeClassLiabilityNew-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString2 }
     *     
     */
    public void setInsuranceTypeClassLiabilityNew(FieldString2 value) {
        this.insuranceTypeClassLiabilityNew = value;
    }

    /**
     * Ruft den Wert der payloadAlternative-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getPayloadAlternative() {
        return payloadAlternative;
    }

    /**
     * Legt den Wert der payloadAlternative-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setPayloadAlternative(FieldInteger value) {
        this.payloadAlternative = value;
    }

    /**
     * Ruft den Wert der powerKwSae-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPowerKwSae() {
        return powerKwSae;
    }

    /**
     * Legt den Wert der powerKwSae-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPowerKwSae(FieldDecimal value) {
        this.powerKwSae = value;
    }

    /**
     * Ruft den Wert der sommerSmogBadge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSommerSmogBadge() {
        return sommerSmogBadge;
    }

    /**
     * Legt den Wert der sommerSmogBadge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSommerSmogBadge(FieldString value) {
        this.sommerSmogBadge = value;
    }

    /**
     * Ruft den Wert der stowageMassFormat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getStowageMassFormat() {
        return stowageMassFormat;
    }

    /**
     * Legt den Wert der stowageMassFormat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setStowageMassFormat(FieldString value) {
        this.stowageMassFormat = value;
    }

    /**
     * Ruft den Wert der tokenChangedCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTokenChangedCapacity() {
        return tokenChangedCapacity;
    }

    /**
     * Legt den Wert der tokenChangedCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTokenChangedCapacity(FieldString value) {
        this.tokenChangedCapacity = value;
    }

    /**
     * Ruft den Wert der tokenTurboEngine-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTokenTurboEngine() {
        return tokenTurboEngine;
    }

    /**
     * Legt den Wert der tokenTurboEngine-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTokenTurboEngine(FieldString value) {
        this.tokenTurboEngine = value;
    }

    /**
     * Ruft den Wert der typeOfTaxation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTypeOfTaxation() {
        return typeOfTaxation;
    }

    /**
     * Legt den Wert der typeOfTaxation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTypeOfTaxation(FieldString value) {
        this.typeOfTaxation = value;
    }

    /**
     * Ruft den Wert der typeSheetNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString10 }
     *     
     */
    public FieldString10 getTypeSheetNumber() {
        return typeSheetNumber;
    }

    /**
     * Legt den Wert der typeSheetNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString10 }
     *     
     */
    public void setTypeSheetNumber(FieldString10 value) {
        this.typeSheetNumber = value;
    }

    /**
     * Ruft den Wert der whelBaseAlternative-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getWhelBaseAlternative() {
        return whelBaseAlternative;
    }

    /**
     * Legt den Wert der whelBaseAlternative-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setWhelBaseAlternative(FieldInteger value) {
        this.whelBaseAlternative = value;
    }

    /**
     * Ruft den Wert der suitableForE10-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getSuitableForE10() {
        return suitableForE10;
    }

    /**
     * Legt den Wert der suitableForE10-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setSuitableForE10(FieldBoolean value) {
        this.suitableForE10 = value;
    }

    /**
     * Ruft den Wert der datSuitableForE10-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getDatSuitableForE10() {
        return datSuitableForE10;
    }

    /**
     * Legt den Wert der datSuitableForE10-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setDatSuitableForE10(FieldBoolean value) {
        this.datSuitableForE10 = value;
    }

    /**
     * Ruft den Wert der weightTotalCombination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getWeightTotalCombination() {
        return weightTotalCombination;
    }

    /**
     * Legt den Wert der weightTotalCombination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setWeightTotalCombination(FieldInteger value) {
        this.weightTotalCombination = value;
    }

    /**
     * Ruft den Wert der datWeightTotalCombination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatWeightTotalCombination() {
        return datWeightTotalCombination;
    }

    /**
     * Legt den Wert der datWeightTotalCombination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatWeightTotalCombination(FieldInteger value) {
        this.datWeightTotalCombination = value;
    }

    /**
     * Ruft den Wert der widthForGarage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getWidthForGarage() {
        return widthForGarage;
    }

    /**
     * Legt den Wert der widthForGarage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setWidthForGarage(FieldInteger value) {
        this.widthForGarage = value;
    }

    /**
     * Ruft den Wert der datWidthForGarage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatWidthForGarage() {
        return datWidthForGarage;
    }

    /**
     * Legt den Wert der datWidthForGarage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatWidthForGarage(FieldInteger value) {
        this.datWidthForGarage = value;
    }

    /**
     * Ruft den Wert der powerKwSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPowerKwSystem() {
        return powerKwSystem;
    }

    /**
     * Legt den Wert der powerKwSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPowerKwSystem(FieldDecimal value) {
        this.powerKwSystem = value;
    }

    /**
     * Ruft den Wert der datPowerKwSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatPowerKwSystem() {
        return datPowerKwSystem;
    }

    /**
     * Legt den Wert der datPowerKwSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatPowerKwSystem(FieldDecimal value) {
        this.datPowerKwSystem = value;
    }

    /**
     * Ruft den Wert der powerHpSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPowerHpSystem() {
        return powerHpSystem;
    }

    /**
     * Legt den Wert der powerHpSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPowerHpSystem(FieldDecimal value) {
        this.powerHpSystem = value;
    }

    /**
     * Ruft den Wert der datPowerHpSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatPowerHpSystem() {
        return datPowerHpSystem;
    }

    /**
     * Legt den Wert der datPowerHpSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatPowerHpSystem(FieldDecimal value) {
        this.datPowerHpSystem = value;
    }

    /**
     * Ruft den Wert der powerKwPermanent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPowerKwPermanent() {
        return powerKwPermanent;
    }

    /**
     * Legt den Wert der powerKwPermanent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPowerKwPermanent(FieldDecimal value) {
        this.powerKwPermanent = value;
    }

    /**
     * Ruft den Wert der datPowerKwPermanent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatPowerKwPermanent() {
        return datPowerKwPermanent;
    }

    /**
     * Legt den Wert der datPowerKwPermanent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatPowerKwPermanent(FieldDecimal value) {
        this.datPowerKwPermanent = value;
    }

    /**
     * Ruft den Wert der powerHpPermanent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPowerHpPermanent() {
        return powerHpPermanent;
    }

    /**
     * Legt den Wert der powerHpPermanent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPowerHpPermanent(FieldDecimal value) {
        this.powerHpPermanent = value;
    }

    /**
     * Ruft den Wert der datPowerHpPermanent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatPowerHpPermanent() {
        return datPowerHpPermanent;
    }

    /**
     * Legt den Wert der datPowerHpPermanent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatPowerHpPermanent(FieldDecimal value) {
        this.datPowerHpPermanent = value;
    }

    /**
     * Ruft den Wert der powerKwMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPowerKwMax() {
        return powerKwMax;
    }

    /**
     * Legt den Wert der powerKwMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPowerKwMax(FieldDecimal value) {
        this.powerKwMax = value;
    }

    /**
     * Ruft den Wert der datPowerKwMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatPowerKwMax() {
        return datPowerKwMax;
    }

    /**
     * Legt den Wert der datPowerKwMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatPowerKwMax(FieldDecimal value) {
        this.datPowerKwMax = value;
    }

    /**
     * Ruft den Wert der powerHpMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPowerHpMax() {
        return powerHpMax;
    }

    /**
     * Legt den Wert der powerHpMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPowerHpMax(FieldDecimal value) {
        this.powerHpMax = value;
    }

    /**
     * Ruft den Wert der datPowerHpMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatPowerHpMax() {
        return datPowerHpMax;
    }

    /**
     * Legt den Wert der datPowerHpMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatPowerHpMax(FieldDecimal value) {
        this.datPowerHpMax = value;
    }

    /**
     * Ruft den Wert der powerKwPermanentSecondary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPowerKwPermanentSecondary() {
        return powerKwPermanentSecondary;
    }

    /**
     * Legt den Wert der powerKwPermanentSecondary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPowerKwPermanentSecondary(FieldDecimal value) {
        this.powerKwPermanentSecondary = value;
    }

    /**
     * Ruft den Wert der datPowerKwPermanentSecondary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatPowerKwPermanentSecondary() {
        return datPowerKwPermanentSecondary;
    }

    /**
     * Legt den Wert der datPowerKwPermanentSecondary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatPowerKwPermanentSecondary(FieldDecimal value) {
        this.datPowerKwPermanentSecondary = value;
    }

    /**
     * Ruft den Wert der powerHpPermanentSecondary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPowerHpPermanentSecondary() {
        return powerHpPermanentSecondary;
    }

    /**
     * Legt den Wert der powerHpPermanentSecondary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPowerHpPermanentSecondary(FieldDecimal value) {
        this.powerHpPermanentSecondary = value;
    }

    /**
     * Ruft den Wert der datPowerHpPermanentSecondary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatPowerHpPermanentSecondary() {
        return datPowerHpPermanentSecondary;
    }

    /**
     * Legt den Wert der datPowerHpPermanentSecondary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatPowerHpPermanentSecondary(FieldDecimal value) {
        this.datPowerHpPermanentSecondary = value;
    }

    /**
     * Ruft den Wert der powerKwMaxSecondary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPowerKwMaxSecondary() {
        return powerKwMaxSecondary;
    }

    /**
     * Legt den Wert der powerKwMaxSecondary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPowerKwMaxSecondary(FieldDecimal value) {
        this.powerKwMaxSecondary = value;
    }

    /**
     * Ruft den Wert der datPowerKwMaxSecondary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatPowerKwMaxSecondary() {
        return datPowerKwMaxSecondary;
    }

    /**
     * Legt den Wert der datPowerKwMaxSecondary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatPowerKwMaxSecondary(FieldDecimal value) {
        this.datPowerKwMaxSecondary = value;
    }

    /**
     * Ruft den Wert der powerHpMaxSecondary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPowerHpMaxSecondary() {
        return powerHpMaxSecondary;
    }

    /**
     * Legt den Wert der powerHpMaxSecondary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPowerHpMaxSecondary(FieldDecimal value) {
        this.powerHpMaxSecondary = value;
    }

    /**
     * Ruft den Wert der datPowerHpMaxSecondary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatPowerHpMaxSecondary() {
        return datPowerHpMaxSecondary;
    }

    /**
     * Legt den Wert der datPowerHpMaxSecondary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatPowerHpMaxSecondary(FieldDecimal value) {
        this.datPowerHpMaxSecondary = value;
    }

    /**
     * Ruft den Wert der batteryVoltage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getBatteryVoltage() {
        return batteryVoltage;
    }

    /**
     * Legt den Wert der batteryVoltage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setBatteryVoltage(FieldDecimal value) {
        this.batteryVoltage = value;
    }

    /**
     * Ruft den Wert der datBatteryVoltage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatBatteryVoltage() {
        return datBatteryVoltage;
    }

    /**
     * Legt den Wert der datBatteryVoltage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatBatteryVoltage(FieldDecimal value) {
        this.datBatteryVoltage = value;
    }

    /**
     * Ruft den Wert der batteryCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getBatteryCapacity() {
        return batteryCapacity;
    }

    /**
     * Legt den Wert der batteryCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setBatteryCapacity(FieldDecimal value) {
        this.batteryCapacity = value;
    }

    /**
     * Ruft den Wert der datBatteryCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatBatteryCapacity() {
        return datBatteryCapacity;
    }

    /**
     * Legt den Wert der datBatteryCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatBatteryCapacity(FieldDecimal value) {
        this.datBatteryCapacity = value;
    }

    /**
     * Ruft den Wert der batteryWeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getBatteryWeight() {
        return batteryWeight;
    }

    /**
     * Legt den Wert der batteryWeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setBatteryWeight(FieldDecimal value) {
        this.batteryWeight = value;
    }

    /**
     * Ruft den Wert der datBatteryWeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatBatteryWeight() {
        return datBatteryWeight;
    }

    /**
     * Legt den Wert der datBatteryWeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatBatteryWeight(FieldDecimal value) {
        this.datBatteryWeight = value;
    }

    /**
     * Ruft den Wert der batteryConstructionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getBatteryConstructionType() {
        return batteryConstructionType;
    }

    /**
     * Legt den Wert der batteryConstructionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setBatteryConstructionType(FieldString value) {
        this.batteryConstructionType = value;
    }

    /**
     * Ruft den Wert der datBatteryConstructionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDatBatteryConstructionType() {
        return datBatteryConstructionType;
    }

    /**
     * Legt den Wert der datBatteryConstructionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDatBatteryConstructionType(FieldString value) {
        this.datBatteryConstructionType = value;
    }

    /**
     * Ruft den Wert der chargingCurrentPlugType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getChargingCurrentPlugType() {
        return chargingCurrentPlugType;
    }

    /**
     * Legt den Wert der chargingCurrentPlugType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setChargingCurrentPlugType(FieldString value) {
        this.chargingCurrentPlugType = value;
    }

    /**
     * Ruft den Wert der datChargingCurrentPlugType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDatChargingCurrentPlugType() {
        return datChargingCurrentPlugType;
    }

    /**
     * Legt den Wert der datChargingCurrentPlugType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDatChargingCurrentPlugType(FieldString value) {
        this.datChargingCurrentPlugType = value;
    }

    /**
     * Ruft den Wert der pluginSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getPluginSystem() {
        return pluginSystem;
    }

    /**
     * Legt den Wert der pluginSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setPluginSystem(FieldBoolean value) {
        this.pluginSystem = value;
    }

    /**
     * Ruft den Wert der datPluginSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getDatPluginSystem() {
        return datPluginSystem;
    }

    /**
     * Legt den Wert der datPluginSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setDatPluginSystem(FieldBoolean value) {
        this.datPluginSystem = value;
    }

    /**
     * Ruft den Wert der quickdropSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getQuickdropSystem() {
        return quickdropSystem;
    }

    /**
     * Legt den Wert der quickdropSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setQuickdropSystem(FieldBoolean value) {
        this.quickdropSystem = value;
    }

    /**
     * Ruft den Wert der datQuickdropSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getDatQuickdropSystem() {
        return datQuickdropSystem;
    }

    /**
     * Legt den Wert der datQuickdropSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setDatQuickdropSystem(FieldBoolean value) {
        this.datQuickdropSystem = value;
    }

    /**
     * Ruft den Wert der normalChargeVoltage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getNormalChargeVoltage() {
        return normalChargeVoltage;
    }

    /**
     * Legt den Wert der normalChargeVoltage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setNormalChargeVoltage(FieldInteger value) {
        this.normalChargeVoltage = value;
    }

    /**
     * Ruft den Wert der datNormalChargeVoltage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatNormalChargeVoltage() {
        return datNormalChargeVoltage;
    }

    /**
     * Legt den Wert der datNormalChargeVoltage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatNormalChargeVoltage(FieldInteger value) {
        this.datNormalChargeVoltage = value;
    }

    /**
     * Ruft den Wert der normalChargeDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getNormalChargeDuration() {
        return normalChargeDuration;
    }

    /**
     * Legt den Wert der normalChargeDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setNormalChargeDuration(FieldDecimal value) {
        this.normalChargeDuration = value;
    }

    /**
     * Ruft den Wert der datNormalChargeDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatNormalChargeDuration() {
        return datNormalChargeDuration;
    }

    /**
     * Legt den Wert der datNormalChargeDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatNormalChargeDuration(FieldDecimal value) {
        this.datNormalChargeDuration = value;
    }

    /**
     * Ruft den Wert der quickChargeVoltage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getQuickChargeVoltage() {
        return quickChargeVoltage;
    }

    /**
     * Legt den Wert der quickChargeVoltage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setQuickChargeVoltage(FieldInteger value) {
        this.quickChargeVoltage = value;
    }

    /**
     * Ruft den Wert der datQuickChargeVoltage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatQuickChargeVoltage() {
        return datQuickChargeVoltage;
    }

    /**
     * Legt den Wert der datQuickChargeVoltage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatQuickChargeVoltage(FieldInteger value) {
        this.datQuickChargeVoltage = value;
    }

    /**
     * Ruft den Wert der quickChargeDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getQuickChargeDuration() {
        return quickChargeDuration;
    }

    /**
     * Legt den Wert der quickChargeDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setQuickChargeDuration(FieldDecimal value) {
        this.quickChargeDuration = value;
    }

    /**
     * Ruft den Wert der datQuickChargeDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatQuickChargeDuration() {
        return datQuickChargeDuration;
    }

    /**
     * Legt den Wert der datQuickChargeDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatQuickChargeDuration(FieldDecimal value) {
        this.datQuickChargeDuration = value;
    }

    /**
     * Ruft den Wert der consumptionElectricalCurrent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getConsumptionElectricalCurrent() {
        return consumptionElectricalCurrent;
    }

    /**
     * Legt den Wert der consumptionElectricalCurrent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setConsumptionElectricalCurrent(FieldDecimal value) {
        this.consumptionElectricalCurrent = value;
    }

    /**
     * Ruft den Wert der datConsumptionElectricalCurrent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatConsumptionElectricalCurrent() {
        return datConsumptionElectricalCurrent;
    }

    /**
     * Legt den Wert der datConsumptionElectricalCurrent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatConsumptionElectricalCurrent(FieldDecimal value) {
        this.datConsumptionElectricalCurrent = value;
    }

    /**
     * Ruft den Wert der rangeOfElectricMotor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getRangeOfElectricMotor() {
        return rangeOfElectricMotor;
    }

    /**
     * Legt den Wert der rangeOfElectricMotor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setRangeOfElectricMotor(FieldInteger value) {
        this.rangeOfElectricMotor = value;
    }

    /**
     * Ruft den Wert der datRangeOfElectricMotor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatRangeOfElectricMotor() {
        return datRangeOfElectricMotor;
    }

    /**
     * Legt den Wert der datRangeOfElectricMotor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatRangeOfElectricMotor(FieldInteger value) {
        this.datRangeOfElectricMotor = value;
    }

    /**
     * Ruft den Wert der rangeTotal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getRangeTotal() {
        return rangeTotal;
    }

    /**
     * Legt den Wert der rangeTotal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setRangeTotal(FieldInteger value) {
        this.rangeTotal = value;
    }

    /**
     * Ruft den Wert der datRangeTotal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatRangeTotal() {
        return datRangeTotal;
    }

    /**
     * Legt den Wert der datRangeTotal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatRangeTotal(FieldInteger value) {
        this.datRangeTotal = value;
    }

    /**
     * Ruft den Wert der energyEfficiencyClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString2 }
     *     
     */
    public FieldString2 getEnergyEfficiencyClass() {
        return energyEfficiencyClass;
    }

    /**
     * Legt den Wert der energyEfficiencyClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString2 }
     *     
     */
    public void setEnergyEfficiencyClass(FieldString2 value) {
        this.energyEfficiencyClass = value;
    }

    /**
     * Ruft den Wert der datEnergyEfficiencyClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString2 }
     *     
     */
    public FieldString2 getDatEnergyEfficiencyClass() {
        return datEnergyEfficiencyClass;
    }

    /**
     * Legt den Wert der datEnergyEfficiencyClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString2 }
     *     
     */
    public void setDatEnergyEfficiencyClass(FieldString2 value) {
        this.datEnergyEfficiencyClass = value;
    }

    /**
     * Ruft den Wert der modelTypecode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getModelTypecode() {
        return modelTypecode;
    }

    /**
     * Legt den Wert der modelTypecode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setModelTypecode(FieldString value) {
        this.modelTypecode = value;
    }

    /**
     * Ruft den Wert der modelVariant-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getModelVariant() {
        return modelVariant;
    }

    /**
     * Legt den Wert der modelVariant-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setModelVariant(FieldString value) {
        this.modelVariant = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setType(FieldString value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der typeVariant-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTypeVariant() {
        return typeVariant;
    }

    /**
     * Legt den Wert der typeVariant-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTypeVariant(FieldString value) {
        this.typeVariant = value;
    }

    /**
     * Ruft den Wert der engineType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getEngineType() {
        return engineType;
    }

    /**
     * Legt den Wert der engineType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setEngineType(FieldString value) {
        this.engineType = value;
    }

    /**
     * Ruft den Wert der specialModel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSpecialModel() {
        return specialModel;
    }

    /**
     * Legt den Wert der specialModel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSpecialModel(FieldString value) {
        this.specialModel = value;
    }

}
