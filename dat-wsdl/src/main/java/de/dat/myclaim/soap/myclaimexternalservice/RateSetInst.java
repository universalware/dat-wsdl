
package de.dat.myclaim.soap.myclaimexternalservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java-Klasse für rateSetInst complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="rateSetInst">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicableTo" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}contextsInst" minOccurs="0" form="qualified"/>
 *         &lt;element name="EuroLacquerFactor" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}LacquerAzteur">
 *                 &lt;sequence>
 *                   &lt;element name="materialPerPointCost" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="materialPriceCategory" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueInteger" minOccurs="0" form="qualified"/>
 *                   &lt;element name="materialPriceCategoryName" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueString" minOccurs="0" form="qualified"/>
 *                   &lt;element name="materialDescPrint" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
 *                   &lt;element name="materialSurcharge" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="isReducedPreparationTime" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
 *                   &lt;element name="isFrameworkUse" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
 *                   &lt;element name="isSurchargeForWaterBased" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
 *                   &lt;element name="workPositionNumber" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueString" minOccurs="0" form="qualified"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ManufacturerLacquerFactor" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}LacquerCommon">
 *                 &lt;sequence>
 *                   &lt;element name="discountWageBiw" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Discount" minOccurs="0" form="qualified"/>
 *                   &lt;element name="materialManufConstantPrice" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="materialManufSurfacePercent" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
 *                   &lt;element name="materialManufSt1Price" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="materialManufSt2Price" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="materialManufSt3Price" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="materialManufSt4Price" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="materialManufSt5Price" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="discountMaterialBiw" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Discount" minOccurs="0" form="qualified"/>
 *                   &lt;element name="discountWageInclMaterialBiw" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Discount" minOccurs="0" form="qualified"/>
 *                   &lt;element name="isSurchargeForMatt" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AztLacquerFactor" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}LacquerAzteur">
 *                 &lt;sequence>
 *                   &lt;element name="discountWagePercent" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Discount" minOccurs="0" form="qualified"/>
 *                   &lt;element name="threeLayerLacquerMode" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueInteger" minOccurs="0" form="qualified"/>
 *                   &lt;element name="fourLayerLacquerMode" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueInteger" minOccurs="0" form="qualified"/>
 *                   &lt;element name="flatRate" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="colourMixCounter" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueInteger" minOccurs="0" form="qualified"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CesvimapLacquerFactor" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}LacquerSpain">
 *                 &lt;sequence>
 *                   &lt;element name="isScratchResistant" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CzLacquerFactor" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}LacquerSpain">
 *                 &lt;sequence>
 *                   &lt;element name="isMultiColoured" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
 *                   &lt;element name="colourCount" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueInteger" minOccurs="0" form="qualified"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FullyManualLacquerFactor" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}LacquerSpain">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LabourCostFactor" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}discountFactor">
 *                 &lt;sequence>
 *                   &lt;element name="wageSvs1" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="wageSvs2" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="wageSvs3" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="bodyWage1" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="bodyWage2" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="bodyWage3" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="bodyWage4" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="electricWage1" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="electricWage2" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="electricWage3" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="electricWage4" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="mechanicWage1" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="mechanicWage2" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="mechanicWage3" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="mechanicWage4" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="dentWage" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="caravanFrameworkUsed" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SparePartFactor" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}discountFactor">
 *                 &lt;sequence>
 *                   &lt;element name="priceDate" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDate" minOccurs="0" form="qualified"/>
 *                   &lt;element name="increaseDecrease" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
 *                   &lt;element name="bracketSetRentCost" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="bracketSetProcurementCost" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="procurementCost" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="bodyInWhiteProcurementCost" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="smallSparePartFlatRatePrice" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="smallSparePartPercentOfPart" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
 *                   &lt;element name="smallSparePartPercentOfPartBiw" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
 *                   &lt;element name="smallSparePartPercentOfWage" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
 *                   &lt;element name="smallSparePartPercentOfWageBiw" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
 *                   &lt;element name="smallSparePartCalculationModel" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CalculationFactor" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}discountFactor">
 *                 &lt;sequence>
 *                   &lt;element name="isGlassCalculation" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
 *                   &lt;element name="isGlassCalculationWithoutWork" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
 *                   &lt;element name="isSuppressBIWOptimization" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
 *                   &lt;element name="isCustomerRankingPricesCalculation" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
 *                   &lt;element name="selectedLacquerMethod" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueInteger" minOccurs="0" form="qualified"/>
 *                   &lt;element name="processingPrice" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="preDamageTotal" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DomusCalculationFactor" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="extraChargeOnlyMultiLayerPercent" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
 *                   &lt;element name="extraChargeAllLayersPercent" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
 *                   &lt;element name="layerMono" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
 *                   &lt;element name="layerDouble" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
 *                   &lt;element name="layerTriple" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
 *                   &lt;element name="layerAdd15Mono" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
 *                   &lt;element name="layerAdd15Double" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
 *                   &lt;element name="layerAdd15Triple" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
 *                   &lt;element name="discountTotalAmount" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="discountTotalAmountLacquer" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="discountTotalAmountBody" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="discountTotalAmountMechanic" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="discountTotalAmountWork" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="discountTotalAmountConsumbles" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="discountTotalAmountWrokbench" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="WearoutCalculationFactor" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tyresAge" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueInteger" minOccurs="0" form="qualified"/>
 *                   &lt;element name="componentsAge" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueInteger" minOccurs="0" form="qualified"/>
 *                   &lt;element name="componentsMilage" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
 *                   &lt;element name="tyresTreadDepthCurrent" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
 *                   &lt;element name="tyresTreadDepthNew" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
 *                   &lt;element name="tyresTreadDepthLegislation" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GlassCalculationFactor" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="wage" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
 *                   &lt;element name="stoneChip1" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
 *                   &lt;element name="stoneChip2" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
 *                   &lt;element name="stoneChip3" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DiscountRuleFactor" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="input" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueString" minOccurs="0" form="qualified"/>
 *                   &lt;element name="output" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueString" minOccurs="0" form="qualified"/>
 *                   &lt;element name="table" minOccurs="0" form="qualified">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0" form="qualified">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
 *                                     &lt;attribute name="rangeFrom" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="locked" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rateClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="systemId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rateSetInst", namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd", propOrder = {
    "applicableTo",
    "euroLacquerFactor",
    "manufacturerLacquerFactor",
    "aztLacquerFactor",
    "cesvimapLacquerFactor",
    "czLacquerFactor",
    "fullyManualLacquerFactor",
    "labourCostFactor",
    "sparePartFactor",
    "calculationFactor",
    "domusCalculationFactor",
    "wearoutCalculationFactor",
    "glassCalculationFactor",
    "discountRuleFactor"
})
@XmlSeeAlso({
    RateSetDef.class
})
public class RateSetInst {

    protected ContextsInst applicableTo;
    @XmlElement(name = "EuroLacquerFactor")
    protected RateSetInst.EuroLacquerFactor euroLacquerFactor;
    @XmlElement(name = "ManufacturerLacquerFactor")
    protected RateSetInst.ManufacturerLacquerFactor manufacturerLacquerFactor;
    @XmlElement(name = "AztLacquerFactor")
    protected RateSetInst.AztLacquerFactor aztLacquerFactor;
    @XmlElement(name = "CesvimapLacquerFactor")
    protected RateSetInst.CesvimapLacquerFactor cesvimapLacquerFactor;
    @XmlElement(name = "CzLacquerFactor")
    protected RateSetInst.CzLacquerFactor czLacquerFactor;
    @XmlElement(name = "FullyManualLacquerFactor")
    protected RateSetInst.FullyManualLacquerFactor fullyManualLacquerFactor;
    @XmlElement(name = "LabourCostFactor")
    protected RateSetInst.LabourCostFactor labourCostFactor;
    @XmlElement(name = "SparePartFactor")
    protected RateSetInst.SparePartFactor sparePartFactor;
    @XmlElement(name = "CalculationFactor")
    protected RateSetInst.CalculationFactor calculationFactor;
    @XmlElement(name = "DomusCalculationFactor")
    protected RateSetInst.DomusCalculationFactor domusCalculationFactor;
    @XmlElement(name = "WearoutCalculationFactor")
    protected RateSetInst.WearoutCalculationFactor wearoutCalculationFactor;
    @XmlElement(name = "GlassCalculationFactor")
    protected RateSetInst.GlassCalculationFactor glassCalculationFactor;
    @XmlElement(name = "DiscountRuleFactor")
    protected RateSetInst.DiscountRuleFactor discountRuleFactor;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "rateClass")
    protected String rateClass;
    @XmlAttribute(name = "systemId")
    protected Long systemId;

    /**
     * Ruft den Wert der applicableTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContextsInst }
     *     
     */
    public ContextsInst getApplicableTo() {
        return applicableTo;
    }

    /**
     * Legt den Wert der applicableTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextsInst }
     *     
     */
    public void setApplicableTo(ContextsInst value) {
        this.applicableTo = value;
    }

    /**
     * Ruft den Wert der euroLacquerFactor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateSetInst.EuroLacquerFactor }
     *     
     */
    public RateSetInst.EuroLacquerFactor getEuroLacquerFactor() {
        return euroLacquerFactor;
    }

    /**
     * Legt den Wert der euroLacquerFactor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateSetInst.EuroLacquerFactor }
     *     
     */
    public void setEuroLacquerFactor(RateSetInst.EuroLacquerFactor value) {
        this.euroLacquerFactor = value;
    }

    /**
     * Ruft den Wert der manufacturerLacquerFactor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateSetInst.ManufacturerLacquerFactor }
     *     
     */
    public RateSetInst.ManufacturerLacquerFactor getManufacturerLacquerFactor() {
        return manufacturerLacquerFactor;
    }

    /**
     * Legt den Wert der manufacturerLacquerFactor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateSetInst.ManufacturerLacquerFactor }
     *     
     */
    public void setManufacturerLacquerFactor(RateSetInst.ManufacturerLacquerFactor value) {
        this.manufacturerLacquerFactor = value;
    }

    /**
     * Ruft den Wert der aztLacquerFactor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateSetInst.AztLacquerFactor }
     *     
     */
    public RateSetInst.AztLacquerFactor getAztLacquerFactor() {
        return aztLacquerFactor;
    }

    /**
     * Legt den Wert der aztLacquerFactor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateSetInst.AztLacquerFactor }
     *     
     */
    public void setAztLacquerFactor(RateSetInst.AztLacquerFactor value) {
        this.aztLacquerFactor = value;
    }

    /**
     * Ruft den Wert der cesvimapLacquerFactor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateSetInst.CesvimapLacquerFactor }
     *     
     */
    public RateSetInst.CesvimapLacquerFactor getCesvimapLacquerFactor() {
        return cesvimapLacquerFactor;
    }

    /**
     * Legt den Wert der cesvimapLacquerFactor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateSetInst.CesvimapLacquerFactor }
     *     
     */
    public void setCesvimapLacquerFactor(RateSetInst.CesvimapLacquerFactor value) {
        this.cesvimapLacquerFactor = value;
    }

    /**
     * Ruft den Wert der czLacquerFactor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateSetInst.CzLacquerFactor }
     *     
     */
    public RateSetInst.CzLacquerFactor getCzLacquerFactor() {
        return czLacquerFactor;
    }

    /**
     * Legt den Wert der czLacquerFactor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateSetInst.CzLacquerFactor }
     *     
     */
    public void setCzLacquerFactor(RateSetInst.CzLacquerFactor value) {
        this.czLacquerFactor = value;
    }

    /**
     * Ruft den Wert der fullyManualLacquerFactor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateSetInst.FullyManualLacquerFactor }
     *     
     */
    public RateSetInst.FullyManualLacquerFactor getFullyManualLacquerFactor() {
        return fullyManualLacquerFactor;
    }

    /**
     * Legt den Wert der fullyManualLacquerFactor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateSetInst.FullyManualLacquerFactor }
     *     
     */
    public void setFullyManualLacquerFactor(RateSetInst.FullyManualLacquerFactor value) {
        this.fullyManualLacquerFactor = value;
    }

    /**
     * Ruft den Wert der labourCostFactor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateSetInst.LabourCostFactor }
     *     
     */
    public RateSetInst.LabourCostFactor getLabourCostFactor() {
        return labourCostFactor;
    }

    /**
     * Legt den Wert der labourCostFactor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateSetInst.LabourCostFactor }
     *     
     */
    public void setLabourCostFactor(RateSetInst.LabourCostFactor value) {
        this.labourCostFactor = value;
    }

    /**
     * Ruft den Wert der sparePartFactor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateSetInst.SparePartFactor }
     *     
     */
    public RateSetInst.SparePartFactor getSparePartFactor() {
        return sparePartFactor;
    }

    /**
     * Legt den Wert der sparePartFactor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateSetInst.SparePartFactor }
     *     
     */
    public void setSparePartFactor(RateSetInst.SparePartFactor value) {
        this.sparePartFactor = value;
    }

    /**
     * Ruft den Wert der calculationFactor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateSetInst.CalculationFactor }
     *     
     */
    public RateSetInst.CalculationFactor getCalculationFactor() {
        return calculationFactor;
    }

    /**
     * Legt den Wert der calculationFactor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateSetInst.CalculationFactor }
     *     
     */
    public void setCalculationFactor(RateSetInst.CalculationFactor value) {
        this.calculationFactor = value;
    }

    /**
     * Ruft den Wert der domusCalculationFactor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateSetInst.DomusCalculationFactor }
     *     
     */
    public RateSetInst.DomusCalculationFactor getDomusCalculationFactor() {
        return domusCalculationFactor;
    }

    /**
     * Legt den Wert der domusCalculationFactor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateSetInst.DomusCalculationFactor }
     *     
     */
    public void setDomusCalculationFactor(RateSetInst.DomusCalculationFactor value) {
        this.domusCalculationFactor = value;
    }

    /**
     * Ruft den Wert der wearoutCalculationFactor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateSetInst.WearoutCalculationFactor }
     *     
     */
    public RateSetInst.WearoutCalculationFactor getWearoutCalculationFactor() {
        return wearoutCalculationFactor;
    }

    /**
     * Legt den Wert der wearoutCalculationFactor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateSetInst.WearoutCalculationFactor }
     *     
     */
    public void setWearoutCalculationFactor(RateSetInst.WearoutCalculationFactor value) {
        this.wearoutCalculationFactor = value;
    }

    /**
     * Ruft den Wert der glassCalculationFactor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateSetInst.GlassCalculationFactor }
     *     
     */
    public RateSetInst.GlassCalculationFactor getGlassCalculationFactor() {
        return glassCalculationFactor;
    }

    /**
     * Legt den Wert der glassCalculationFactor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateSetInst.GlassCalculationFactor }
     *     
     */
    public void setGlassCalculationFactor(RateSetInst.GlassCalculationFactor value) {
        this.glassCalculationFactor = value;
    }

    /**
     * Ruft den Wert der discountRuleFactor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RateSetInst.DiscountRuleFactor }
     *     
     */
    public RateSetInst.DiscountRuleFactor getDiscountRuleFactor() {
        return discountRuleFactor;
    }

    /**
     * Legt den Wert der discountRuleFactor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RateSetInst.DiscountRuleFactor }
     *     
     */
    public void setDiscountRuleFactor(RateSetInst.DiscountRuleFactor value) {
        this.discountRuleFactor = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der rateClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateClass() {
        return rateClass;
    }

    /**
     * Legt den Wert der rateClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateClass(String value) {
        this.rateClass = value;
    }

    /**
     * Ruft den Wert der systemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSystemId() {
        return systemId;
    }

    /**
     * Legt den Wert der systemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSystemId(Long value) {
        this.systemId = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}LacquerAzteur">
     *       &lt;sequence>
     *         &lt;element name="discountWagePercent" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Discount" minOccurs="0" form="qualified"/>
     *         &lt;element name="threeLayerLacquerMode" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueInteger" minOccurs="0" form="qualified"/>
     *         &lt;element name="fourLayerLacquerMode" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueInteger" minOccurs="0" form="qualified"/>
     *         &lt;element name="flatRate" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="colourMixCounter" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueInteger" minOccurs="0" form="qualified"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "discountWagePercent",
        "threeLayerLacquerMode",
        "fourLayerLacquerMode",
        "flatRate",
        "colourMixCounter"
    })
    public static class AztLacquerFactor
        extends LacquerAzteur
    {

        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Discount2 discountWagePercent;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueInteger threeLayerLacquerMode;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueInteger fourLayerLacquerMode;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price flatRate;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueInteger colourMixCounter;

        /**
         * Ruft den Wert der discountWagePercent-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Discount2 }
         *     
         */
        public Discount2 getDiscountWagePercent() {
            return discountWagePercent;
        }

        /**
         * Legt den Wert der discountWagePercent-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Discount2 }
         *     
         */
        public void setDiscountWagePercent(Discount2 value) {
            this.discountWagePercent = value;
        }

        /**
         * Ruft den Wert der threeLayerLacquerMode-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueInteger }
         *     
         */
        public RateValueInteger getThreeLayerLacquerMode() {
            return threeLayerLacquerMode;
        }

        /**
         * Legt den Wert der threeLayerLacquerMode-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueInteger }
         *     
         */
        public void setThreeLayerLacquerMode(RateValueInteger value) {
            this.threeLayerLacquerMode = value;
        }

        /**
         * Ruft den Wert der fourLayerLacquerMode-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueInteger }
         *     
         */
        public RateValueInteger getFourLayerLacquerMode() {
            return fourLayerLacquerMode;
        }

        /**
         * Legt den Wert der fourLayerLacquerMode-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueInteger }
         *     
         */
        public void setFourLayerLacquerMode(RateValueInteger value) {
            this.fourLayerLacquerMode = value;
        }

        /**
         * Ruft den Wert der flatRate-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getFlatRate() {
            return flatRate;
        }

        /**
         * Legt den Wert der flatRate-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setFlatRate(Price value) {
            this.flatRate = value;
        }

        /**
         * Ruft den Wert der colourMixCounter-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueInteger }
         *     
         */
        public RateValueInteger getColourMixCounter() {
            return colourMixCounter;
        }

        /**
         * Legt den Wert der colourMixCounter-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueInteger }
         *     
         */
        public void setColourMixCounter(RateValueInteger value) {
            this.colourMixCounter = value;
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
     *     &lt;extension base="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}discountFactor">
     *       &lt;sequence>
     *         &lt;element name="isGlassCalculation" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
     *         &lt;element name="isGlassCalculationWithoutWork" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
     *         &lt;element name="isSuppressBIWOptimization" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
     *         &lt;element name="isCustomerRankingPricesCalculation" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
     *         &lt;element name="selectedLacquerMethod" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueInteger" minOccurs="0" form="qualified"/>
     *         &lt;element name="processingPrice" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="preDamageTotal" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "isGlassCalculation",
        "isGlassCalculationWithoutWork",
        "isSuppressBIWOptimization",
        "isCustomerRankingPricesCalculation",
        "selectedLacquerMethod",
        "processingPrice",
        "preDamageTotal"
    })
    public static class CalculationFactor
        extends DiscountFactor
    {

        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueBoolean isGlassCalculation;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueBoolean isGlassCalculationWithoutWork;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueBoolean isSuppressBIWOptimization;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueBoolean isCustomerRankingPricesCalculation;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueInteger selectedLacquerMethod;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price processingPrice;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price preDamageTotal;

        /**
         * Ruft den Wert der isGlassCalculation-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueBoolean }
         *     
         */
        public RateValueBoolean getIsGlassCalculation() {
            return isGlassCalculation;
        }

        /**
         * Legt den Wert der isGlassCalculation-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueBoolean }
         *     
         */
        public void setIsGlassCalculation(RateValueBoolean value) {
            this.isGlassCalculation = value;
        }

        /**
         * Ruft den Wert der isGlassCalculationWithoutWork-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueBoolean }
         *     
         */
        public RateValueBoolean getIsGlassCalculationWithoutWork() {
            return isGlassCalculationWithoutWork;
        }

        /**
         * Legt den Wert der isGlassCalculationWithoutWork-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueBoolean }
         *     
         */
        public void setIsGlassCalculationWithoutWork(RateValueBoolean value) {
            this.isGlassCalculationWithoutWork = value;
        }

        /**
         * Ruft den Wert der isSuppressBIWOptimization-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueBoolean }
         *     
         */
        public RateValueBoolean getIsSuppressBIWOptimization() {
            return isSuppressBIWOptimization;
        }

        /**
         * Legt den Wert der isSuppressBIWOptimization-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueBoolean }
         *     
         */
        public void setIsSuppressBIWOptimization(RateValueBoolean value) {
            this.isSuppressBIWOptimization = value;
        }

        /**
         * Ruft den Wert der isCustomerRankingPricesCalculation-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueBoolean }
         *     
         */
        public RateValueBoolean getIsCustomerRankingPricesCalculation() {
            return isCustomerRankingPricesCalculation;
        }

        /**
         * Legt den Wert der isCustomerRankingPricesCalculation-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueBoolean }
         *     
         */
        public void setIsCustomerRankingPricesCalculation(RateValueBoolean value) {
            this.isCustomerRankingPricesCalculation = value;
        }

        /**
         * Ruft den Wert der selectedLacquerMethod-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueInteger }
         *     
         */
        public RateValueInteger getSelectedLacquerMethod() {
            return selectedLacquerMethod;
        }

        /**
         * Legt den Wert der selectedLacquerMethod-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueInteger }
         *     
         */
        public void setSelectedLacquerMethod(RateValueInteger value) {
            this.selectedLacquerMethod = value;
        }

        /**
         * Ruft den Wert der processingPrice-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getProcessingPrice() {
            return processingPrice;
        }

        /**
         * Legt den Wert der processingPrice-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setProcessingPrice(Price value) {
            this.processingPrice = value;
        }

        /**
         * Ruft den Wert der preDamageTotal-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getPreDamageTotal() {
            return preDamageTotal;
        }

        /**
         * Legt den Wert der preDamageTotal-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setPreDamageTotal(Price value) {
            this.preDamageTotal = value;
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
     *     &lt;extension base="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}LacquerSpain">
     *       &lt;sequence>
     *         &lt;element name="isScratchResistant" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "isScratchResistant"
    })
    public static class CesvimapLacquerFactor
        extends LacquerSpain
    {

        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueBoolean isScratchResistant;

        /**
         * Ruft den Wert der isScratchResistant-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueBoolean }
         *     
         */
        public RateValueBoolean getIsScratchResistant() {
            return isScratchResistant;
        }

        /**
         * Legt den Wert der isScratchResistant-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueBoolean }
         *     
         */
        public void setIsScratchResistant(RateValueBoolean value) {
            this.isScratchResistant = value;
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
     *     &lt;extension base="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}LacquerSpain">
     *       &lt;sequence>
     *         &lt;element name="isMultiColoured" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
     *         &lt;element name="colourCount" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueInteger" minOccurs="0" form="qualified"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "isMultiColoured",
        "colourCount"
    })
    public static class CzLacquerFactor
        extends LacquerSpain
    {

        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueBoolean isMultiColoured;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueInteger colourCount;

        /**
         * Ruft den Wert der isMultiColoured-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueBoolean }
         *     
         */
        public RateValueBoolean getIsMultiColoured() {
            return isMultiColoured;
        }

        /**
         * Legt den Wert der isMultiColoured-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueBoolean }
         *     
         */
        public void setIsMultiColoured(RateValueBoolean value) {
            this.isMultiColoured = value;
        }

        /**
         * Ruft den Wert der colourCount-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueInteger }
         *     
         */
        public RateValueInteger getColourCount() {
            return colourCount;
        }

        /**
         * Legt den Wert der colourCount-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueInteger }
         *     
         */
        public void setColourCount(RateValueInteger value) {
            this.colourCount = value;
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
     *         &lt;element name="input" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueString" minOccurs="0" form="qualified"/>
     *         &lt;element name="output" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueString" minOccurs="0" form="qualified"/>
     *         &lt;element name="table" minOccurs="0" form="qualified">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0" form="qualified">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
     *                           &lt;attribute name="rangeFrom" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="locked" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "input",
        "output",
        "table"
    })
    public static class DiscountRuleFactor {

        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueString input;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueString output;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateSetInst.DiscountRuleFactor.Table table;

        /**
         * Ruft den Wert der input-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueString }
         *     
         */
        public RateValueString getInput() {
            return input;
        }

        /**
         * Legt den Wert der input-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueString }
         *     
         */
        public void setInput(RateValueString value) {
            this.input = value;
        }

        /**
         * Ruft den Wert der output-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueString }
         *     
         */
        public RateValueString getOutput() {
            return output;
        }

        /**
         * Legt den Wert der output-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueString }
         *     
         */
        public void setOutput(RateValueString value) {
            this.output = value;
        }

        /**
         * Ruft den Wert der table-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateSetInst.DiscountRuleFactor.Table }
         *     
         */
        public RateSetInst.DiscountRuleFactor.Table getTable() {
            return table;
        }

        /**
         * Legt den Wert der table-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateSetInst.DiscountRuleFactor.Table }
         *     
         */
        public void setTable(RateSetInst.DiscountRuleFactor.Table value) {
            this.table = value;
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
         *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0" form="qualified">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
         *                 &lt;attribute name="rangeFrom" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="locked" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "entry"
        })
        public static class Table {

            @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
            protected List<RateSetInst.DiscountRuleFactor.Table.Entry> entry;
            @XmlAttribute(name = "locked")
            protected Boolean locked;

            /**
             * Gets the value of the entry property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the entry property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEntry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RateSetInst.DiscountRuleFactor.Table.Entry }
             * 
             * 
             */
            public List<RateSetInst.DiscountRuleFactor.Table.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<RateSetInst.DiscountRuleFactor.Table.Entry>();
                }
                return this.entry;
            }

            /**
             * Ruft den Wert der locked-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isLocked() {
                return locked;
            }

            /**
             * Legt den Wert der locked-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setLocked(Boolean value) {
                this.locked = value;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
             *       &lt;attribute name="rangeFrom" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Entry {

                @XmlValue
                protected double value;
                @XmlAttribute(name = "rangeFrom", required = true)
                protected double rangeFrom;

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 */
                public double getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 */
                public void setValue(double value) {
                    this.value = value;
                }

                /**
                 * Ruft den Wert der rangeFrom-Eigenschaft ab.
                 * 
                 */
                public double getRangeFrom() {
                    return rangeFrom;
                }

                /**
                 * Legt den Wert der rangeFrom-Eigenschaft fest.
                 * 
                 */
                public void setRangeFrom(double value) {
                    this.rangeFrom = value;
                }

            }

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
     *         &lt;element name="extraChargeOnlyMultiLayerPercent" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
     *         &lt;element name="extraChargeAllLayersPercent" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
     *         &lt;element name="layerMono" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
     *         &lt;element name="layerDouble" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
     *         &lt;element name="layerTriple" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
     *         &lt;element name="layerAdd15Mono" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
     *         &lt;element name="layerAdd15Double" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
     *         &lt;element name="layerAdd15Triple" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
     *         &lt;element name="discountTotalAmount" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="discountTotalAmountLacquer" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="discountTotalAmountBody" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="discountTotalAmountMechanic" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="discountTotalAmountWork" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="discountTotalAmountConsumbles" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="discountTotalAmountWrokbench" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
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
        "extraChargeOnlyMultiLayerPercent",
        "extraChargeAllLayersPercent",
        "layerMono",
        "layerDouble",
        "layerTriple",
        "layerAdd15Mono",
        "layerAdd15Double",
        "layerAdd15Triple",
        "discountTotalAmount",
        "discountTotalAmountLacquer",
        "discountTotalAmountBody",
        "discountTotalAmountMechanic",
        "discountTotalAmountWork",
        "discountTotalAmountConsumbles",
        "discountTotalAmountWrokbench"
    })
    public static class DomusCalculationFactor {

        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueDouble extraChargeOnlyMultiLayerPercent;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueDouble extraChargeAllLayersPercent;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueDouble layerMono;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueDouble layerDouble;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueDouble layerTriple;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueDouble layerAdd15Mono;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueDouble layerAdd15Double;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueDouble layerAdd15Triple;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price discountTotalAmount;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price discountTotalAmountLacquer;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price discountTotalAmountBody;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price discountTotalAmountMechanic;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price discountTotalAmountWork;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price discountTotalAmountConsumbles;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price discountTotalAmountWrokbench;

        /**
         * Ruft den Wert der extraChargeOnlyMultiLayerPercent-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueDouble }
         *     
         */
        public RateValueDouble getExtraChargeOnlyMultiLayerPercent() {
            return extraChargeOnlyMultiLayerPercent;
        }

        /**
         * Legt den Wert der extraChargeOnlyMultiLayerPercent-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueDouble }
         *     
         */
        public void setExtraChargeOnlyMultiLayerPercent(RateValueDouble value) {
            this.extraChargeOnlyMultiLayerPercent = value;
        }

        /**
         * Ruft den Wert der extraChargeAllLayersPercent-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueDouble }
         *     
         */
        public RateValueDouble getExtraChargeAllLayersPercent() {
            return extraChargeAllLayersPercent;
        }

        /**
         * Legt den Wert der extraChargeAllLayersPercent-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueDouble }
         *     
         */
        public void setExtraChargeAllLayersPercent(RateValueDouble value) {
            this.extraChargeAllLayersPercent = value;
        }

        /**
         * Ruft den Wert der layerMono-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueDouble }
         *     
         */
        public RateValueDouble getLayerMono() {
            return layerMono;
        }

        /**
         * Legt den Wert der layerMono-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueDouble }
         *     
         */
        public void setLayerMono(RateValueDouble value) {
            this.layerMono = value;
        }

        /**
         * Ruft den Wert der layerDouble-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueDouble }
         *     
         */
        public RateValueDouble getLayerDouble() {
            return layerDouble;
        }

        /**
         * Legt den Wert der layerDouble-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueDouble }
         *     
         */
        public void setLayerDouble(RateValueDouble value) {
            this.layerDouble = value;
        }

        /**
         * Ruft den Wert der layerTriple-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueDouble }
         *     
         */
        public RateValueDouble getLayerTriple() {
            return layerTriple;
        }

        /**
         * Legt den Wert der layerTriple-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueDouble }
         *     
         */
        public void setLayerTriple(RateValueDouble value) {
            this.layerTriple = value;
        }

        /**
         * Ruft den Wert der layerAdd15Mono-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueDouble }
         *     
         */
        public RateValueDouble getLayerAdd15Mono() {
            return layerAdd15Mono;
        }

        /**
         * Legt den Wert der layerAdd15Mono-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueDouble }
         *     
         */
        public void setLayerAdd15Mono(RateValueDouble value) {
            this.layerAdd15Mono = value;
        }

        /**
         * Ruft den Wert der layerAdd15Double-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueDouble }
         *     
         */
        public RateValueDouble getLayerAdd15Double() {
            return layerAdd15Double;
        }

        /**
         * Legt den Wert der layerAdd15Double-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueDouble }
         *     
         */
        public void setLayerAdd15Double(RateValueDouble value) {
            this.layerAdd15Double = value;
        }

        /**
         * Ruft den Wert der layerAdd15Triple-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueDouble }
         *     
         */
        public RateValueDouble getLayerAdd15Triple() {
            return layerAdd15Triple;
        }

        /**
         * Legt den Wert der layerAdd15Triple-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueDouble }
         *     
         */
        public void setLayerAdd15Triple(RateValueDouble value) {
            this.layerAdd15Triple = value;
        }

        /**
         * Ruft den Wert der discountTotalAmount-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getDiscountTotalAmount() {
            return discountTotalAmount;
        }

        /**
         * Legt den Wert der discountTotalAmount-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setDiscountTotalAmount(Price value) {
            this.discountTotalAmount = value;
        }

        /**
         * Ruft den Wert der discountTotalAmountLacquer-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getDiscountTotalAmountLacquer() {
            return discountTotalAmountLacquer;
        }

        /**
         * Legt den Wert der discountTotalAmountLacquer-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setDiscountTotalAmountLacquer(Price value) {
            this.discountTotalAmountLacquer = value;
        }

        /**
         * Ruft den Wert der discountTotalAmountBody-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getDiscountTotalAmountBody() {
            return discountTotalAmountBody;
        }

        /**
         * Legt den Wert der discountTotalAmountBody-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setDiscountTotalAmountBody(Price value) {
            this.discountTotalAmountBody = value;
        }

        /**
         * Ruft den Wert der discountTotalAmountMechanic-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getDiscountTotalAmountMechanic() {
            return discountTotalAmountMechanic;
        }

        /**
         * Legt den Wert der discountTotalAmountMechanic-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setDiscountTotalAmountMechanic(Price value) {
            this.discountTotalAmountMechanic = value;
        }

        /**
         * Ruft den Wert der discountTotalAmountWork-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getDiscountTotalAmountWork() {
            return discountTotalAmountWork;
        }

        /**
         * Legt den Wert der discountTotalAmountWork-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setDiscountTotalAmountWork(Price value) {
            this.discountTotalAmountWork = value;
        }

        /**
         * Ruft den Wert der discountTotalAmountConsumbles-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getDiscountTotalAmountConsumbles() {
            return discountTotalAmountConsumbles;
        }

        /**
         * Legt den Wert der discountTotalAmountConsumbles-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setDiscountTotalAmountConsumbles(Price value) {
            this.discountTotalAmountConsumbles = value;
        }

        /**
         * Ruft den Wert der discountTotalAmountWrokbench-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getDiscountTotalAmountWrokbench() {
            return discountTotalAmountWrokbench;
        }

        /**
         * Legt den Wert der discountTotalAmountWrokbench-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setDiscountTotalAmountWrokbench(Price value) {
            this.discountTotalAmountWrokbench = value;
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
     *     &lt;extension base="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}LacquerAzteur">
     *       &lt;sequence>
     *         &lt;element name="materialPerPointCost" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="materialPriceCategory" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueInteger" minOccurs="0" form="qualified"/>
     *         &lt;element name="materialPriceCategoryName" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueString" minOccurs="0" form="qualified"/>
     *         &lt;element name="materialDescPrint" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
     *         &lt;element name="materialSurcharge" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="isReducedPreparationTime" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
     *         &lt;element name="isFrameworkUse" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
     *         &lt;element name="isSurchargeForWaterBased" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
     *         &lt;element name="workPositionNumber" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueString" minOccurs="0" form="qualified"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "materialPerPointCost",
        "materialPriceCategory",
        "materialPriceCategoryName",
        "materialDescPrint",
        "materialSurcharge",
        "isReducedPreparationTime",
        "isFrameworkUse",
        "isSurchargeForWaterBased",
        "workPositionNumber"
    })
    public static class EuroLacquerFactor
        extends LacquerAzteur
    {

        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price materialPerPointCost;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueInteger materialPriceCategory;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueString materialPriceCategoryName;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueBoolean materialDescPrint;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price materialSurcharge;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueBoolean isReducedPreparationTime;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueBoolean isFrameworkUse;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueBoolean isSurchargeForWaterBased;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueString workPositionNumber;

        /**
         * Ruft den Wert der materialPerPointCost-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getMaterialPerPointCost() {
            return materialPerPointCost;
        }

        /**
         * Legt den Wert der materialPerPointCost-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setMaterialPerPointCost(Price value) {
            this.materialPerPointCost = value;
        }

        /**
         * Ruft den Wert der materialPriceCategory-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueInteger }
         *     
         */
        public RateValueInteger getMaterialPriceCategory() {
            return materialPriceCategory;
        }

        /**
         * Legt den Wert der materialPriceCategory-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueInteger }
         *     
         */
        public void setMaterialPriceCategory(RateValueInteger value) {
            this.materialPriceCategory = value;
        }

        /**
         * Ruft den Wert der materialPriceCategoryName-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueString }
         *     
         */
        public RateValueString getMaterialPriceCategoryName() {
            return materialPriceCategoryName;
        }

        /**
         * Legt den Wert der materialPriceCategoryName-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueString }
         *     
         */
        public void setMaterialPriceCategoryName(RateValueString value) {
            this.materialPriceCategoryName = value;
        }

        /**
         * Ruft den Wert der materialDescPrint-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueBoolean }
         *     
         */
        public RateValueBoolean getMaterialDescPrint() {
            return materialDescPrint;
        }

        /**
         * Legt den Wert der materialDescPrint-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueBoolean }
         *     
         */
        public void setMaterialDescPrint(RateValueBoolean value) {
            this.materialDescPrint = value;
        }

        /**
         * Ruft den Wert der materialSurcharge-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getMaterialSurcharge() {
            return materialSurcharge;
        }

        /**
         * Legt den Wert der materialSurcharge-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setMaterialSurcharge(Price value) {
            this.materialSurcharge = value;
        }

        /**
         * Ruft den Wert der isReducedPreparationTime-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueBoolean }
         *     
         */
        public RateValueBoolean getIsReducedPreparationTime() {
            return isReducedPreparationTime;
        }

        /**
         * Legt den Wert der isReducedPreparationTime-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueBoolean }
         *     
         */
        public void setIsReducedPreparationTime(RateValueBoolean value) {
            this.isReducedPreparationTime = value;
        }

        /**
         * Ruft den Wert der isFrameworkUse-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueBoolean }
         *     
         */
        public RateValueBoolean getIsFrameworkUse() {
            return isFrameworkUse;
        }

        /**
         * Legt den Wert der isFrameworkUse-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueBoolean }
         *     
         */
        public void setIsFrameworkUse(RateValueBoolean value) {
            this.isFrameworkUse = value;
        }

        /**
         * Ruft den Wert der isSurchargeForWaterBased-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueBoolean }
         *     
         */
        public RateValueBoolean getIsSurchargeForWaterBased() {
            return isSurchargeForWaterBased;
        }

        /**
         * Legt den Wert der isSurchargeForWaterBased-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueBoolean }
         *     
         */
        public void setIsSurchargeForWaterBased(RateValueBoolean value) {
            this.isSurchargeForWaterBased = value;
        }

        /**
         * Ruft den Wert der workPositionNumber-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueString }
         *     
         */
        public RateValueString getWorkPositionNumber() {
            return workPositionNumber;
        }

        /**
         * Legt den Wert der workPositionNumber-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueString }
         *     
         */
        public void setWorkPositionNumber(RateValueString value) {
            this.workPositionNumber = value;
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
     *     &lt;extension base="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}LacquerSpain">
     *       &lt;sequence>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FullyManualLacquerFactor
        extends LacquerSpain
    {


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
     *         &lt;element name="wage" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="stoneChip1" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
     *         &lt;element name="stoneChip2" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
     *         &lt;element name="stoneChip3" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
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
        "wage",
        "stoneChip1",
        "stoneChip2",
        "stoneChip3"
    })
    public static class GlassCalculationFactor {

        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price wage;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueDouble stoneChip1;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueDouble stoneChip2;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueDouble stoneChip3;

        /**
         * Ruft den Wert der wage-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getWage() {
            return wage;
        }

        /**
         * Legt den Wert der wage-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setWage(Price value) {
            this.wage = value;
        }

        /**
         * Ruft den Wert der stoneChip1-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueDouble }
         *     
         */
        public RateValueDouble getStoneChip1() {
            return stoneChip1;
        }

        /**
         * Legt den Wert der stoneChip1-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueDouble }
         *     
         */
        public void setStoneChip1(RateValueDouble value) {
            this.stoneChip1 = value;
        }

        /**
         * Ruft den Wert der stoneChip2-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueDouble }
         *     
         */
        public RateValueDouble getStoneChip2() {
            return stoneChip2;
        }

        /**
         * Legt den Wert der stoneChip2-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueDouble }
         *     
         */
        public void setStoneChip2(RateValueDouble value) {
            this.stoneChip2 = value;
        }

        /**
         * Ruft den Wert der stoneChip3-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueDouble }
         *     
         */
        public RateValueDouble getStoneChip3() {
            return stoneChip3;
        }

        /**
         * Legt den Wert der stoneChip3-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueDouble }
         *     
         */
        public void setStoneChip3(RateValueDouble value) {
            this.stoneChip3 = value;
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
     *     &lt;extension base="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}discountFactor">
     *       &lt;sequence>
     *         &lt;element name="wageSvs1" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="wageSvs2" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="wageSvs3" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="bodyWage1" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="bodyWage2" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="bodyWage3" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="bodyWage4" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="electricWage1" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="electricWage2" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="electricWage3" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="electricWage4" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="mechanicWage1" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="mechanicWage2" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="mechanicWage3" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="mechanicWage4" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="dentWage" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="caravanFrameworkUsed" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "wageSvs1",
        "wageSvs2",
        "wageSvs3",
        "bodyWage1",
        "bodyWage2",
        "bodyWage3",
        "bodyWage4",
        "electricWage1",
        "electricWage2",
        "electricWage3",
        "electricWage4",
        "mechanicWage1",
        "mechanicWage2",
        "mechanicWage3",
        "mechanicWage4",
        "dentWage",
        "caravanFrameworkUsed"
    })
    public static class LabourCostFactor
        extends DiscountFactor
    {

        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price wageSvs1;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price wageSvs2;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price wageSvs3;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price bodyWage1;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price bodyWage2;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price bodyWage3;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price bodyWage4;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price electricWage1;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price electricWage2;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price electricWage3;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price electricWage4;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price mechanicWage1;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price mechanicWage2;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price mechanicWage3;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price mechanicWage4;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price dentWage;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueBoolean caravanFrameworkUsed;

        /**
         * Ruft den Wert der wageSvs1-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getWageSvs1() {
            return wageSvs1;
        }

        /**
         * Legt den Wert der wageSvs1-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setWageSvs1(Price value) {
            this.wageSvs1 = value;
        }

        /**
         * Ruft den Wert der wageSvs2-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getWageSvs2() {
            return wageSvs2;
        }

        /**
         * Legt den Wert der wageSvs2-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setWageSvs2(Price value) {
            this.wageSvs2 = value;
        }

        /**
         * Ruft den Wert der wageSvs3-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getWageSvs3() {
            return wageSvs3;
        }

        /**
         * Legt den Wert der wageSvs3-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setWageSvs3(Price value) {
            this.wageSvs3 = value;
        }

        /**
         * Ruft den Wert der bodyWage1-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getBodyWage1() {
            return bodyWage1;
        }

        /**
         * Legt den Wert der bodyWage1-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setBodyWage1(Price value) {
            this.bodyWage1 = value;
        }

        /**
         * Ruft den Wert der bodyWage2-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getBodyWage2() {
            return bodyWage2;
        }

        /**
         * Legt den Wert der bodyWage2-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setBodyWage2(Price value) {
            this.bodyWage2 = value;
        }

        /**
         * Ruft den Wert der bodyWage3-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getBodyWage3() {
            return bodyWage3;
        }

        /**
         * Legt den Wert der bodyWage3-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setBodyWage3(Price value) {
            this.bodyWage3 = value;
        }

        /**
         * Ruft den Wert der bodyWage4-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getBodyWage4() {
            return bodyWage4;
        }

        /**
         * Legt den Wert der bodyWage4-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setBodyWage4(Price value) {
            this.bodyWage4 = value;
        }

        /**
         * Ruft den Wert der electricWage1-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getElectricWage1() {
            return electricWage1;
        }

        /**
         * Legt den Wert der electricWage1-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setElectricWage1(Price value) {
            this.electricWage1 = value;
        }

        /**
         * Ruft den Wert der electricWage2-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getElectricWage2() {
            return electricWage2;
        }

        /**
         * Legt den Wert der electricWage2-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setElectricWage2(Price value) {
            this.electricWage2 = value;
        }

        /**
         * Ruft den Wert der electricWage3-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getElectricWage3() {
            return electricWage3;
        }

        /**
         * Legt den Wert der electricWage3-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setElectricWage3(Price value) {
            this.electricWage3 = value;
        }

        /**
         * Ruft den Wert der electricWage4-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getElectricWage4() {
            return electricWage4;
        }

        /**
         * Legt den Wert der electricWage4-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setElectricWage4(Price value) {
            this.electricWage4 = value;
        }

        /**
         * Ruft den Wert der mechanicWage1-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getMechanicWage1() {
            return mechanicWage1;
        }

        /**
         * Legt den Wert der mechanicWage1-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setMechanicWage1(Price value) {
            this.mechanicWage1 = value;
        }

        /**
         * Ruft den Wert der mechanicWage2-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getMechanicWage2() {
            return mechanicWage2;
        }

        /**
         * Legt den Wert der mechanicWage2-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setMechanicWage2(Price value) {
            this.mechanicWage2 = value;
        }

        /**
         * Ruft den Wert der mechanicWage3-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getMechanicWage3() {
            return mechanicWage3;
        }

        /**
         * Legt den Wert der mechanicWage3-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setMechanicWage3(Price value) {
            this.mechanicWage3 = value;
        }

        /**
         * Ruft den Wert der mechanicWage4-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getMechanicWage4() {
            return mechanicWage4;
        }

        /**
         * Legt den Wert der mechanicWage4-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setMechanicWage4(Price value) {
            this.mechanicWage4 = value;
        }

        /**
         * Ruft den Wert der dentWage-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getDentWage() {
            return dentWage;
        }

        /**
         * Legt den Wert der dentWage-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setDentWage(Price value) {
            this.dentWage = value;
        }

        /**
         * Ruft den Wert der caravanFrameworkUsed-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueBoolean }
         *     
         */
        public RateValueBoolean getCaravanFrameworkUsed() {
            return caravanFrameworkUsed;
        }

        /**
         * Legt den Wert der caravanFrameworkUsed-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueBoolean }
         *     
         */
        public void setCaravanFrameworkUsed(RateValueBoolean value) {
            this.caravanFrameworkUsed = value;
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
     *     &lt;extension base="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}LacquerCommon">
     *       &lt;sequence>
     *         &lt;element name="discountWageBiw" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Discount" minOccurs="0" form="qualified"/>
     *         &lt;element name="materialManufConstantPrice" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="materialManufSurfacePercent" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
     *         &lt;element name="materialManufSt1Price" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="materialManufSt2Price" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="materialManufSt3Price" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="materialManufSt4Price" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="materialManufSt5Price" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="discountMaterialBiw" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Discount" minOccurs="0" form="qualified"/>
     *         &lt;element name="discountWageInclMaterialBiw" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Discount" minOccurs="0" form="qualified"/>
     *         &lt;element name="isSurchargeForMatt" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "discountWageBiw",
        "materialManufConstantPrice",
        "materialManufSurfacePercent",
        "materialManufSt1Price",
        "materialManufSt2Price",
        "materialManufSt3Price",
        "materialManufSt4Price",
        "materialManufSt5Price",
        "discountMaterialBiw",
        "discountWageInclMaterialBiw",
        "isSurchargeForMatt"
    })
    public static class ManufacturerLacquerFactor
        extends LacquerCommon
    {

        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Discount2 discountWageBiw;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price materialManufConstantPrice;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueDouble materialManufSurfacePercent;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price materialManufSt1Price;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price materialManufSt2Price;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price materialManufSt3Price;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price materialManufSt4Price;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price materialManufSt5Price;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Discount2 discountMaterialBiw;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Discount2 discountWageInclMaterialBiw;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueBoolean isSurchargeForMatt;

        /**
         * Ruft den Wert der discountWageBiw-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Discount2 }
         *     
         */
        public Discount2 getDiscountWageBiw() {
            return discountWageBiw;
        }

        /**
         * Legt den Wert der discountWageBiw-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Discount2 }
         *     
         */
        public void setDiscountWageBiw(Discount2 value) {
            this.discountWageBiw = value;
        }

        /**
         * Ruft den Wert der materialManufConstantPrice-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getMaterialManufConstantPrice() {
            return materialManufConstantPrice;
        }

        /**
         * Legt den Wert der materialManufConstantPrice-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setMaterialManufConstantPrice(Price value) {
            this.materialManufConstantPrice = value;
        }

        /**
         * Ruft den Wert der materialManufSurfacePercent-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueDouble }
         *     
         */
        public RateValueDouble getMaterialManufSurfacePercent() {
            return materialManufSurfacePercent;
        }

        /**
         * Legt den Wert der materialManufSurfacePercent-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueDouble }
         *     
         */
        public void setMaterialManufSurfacePercent(RateValueDouble value) {
            this.materialManufSurfacePercent = value;
        }

        /**
         * Ruft den Wert der materialManufSt1Price-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getMaterialManufSt1Price() {
            return materialManufSt1Price;
        }

        /**
         * Legt den Wert der materialManufSt1Price-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setMaterialManufSt1Price(Price value) {
            this.materialManufSt1Price = value;
        }

        /**
         * Ruft den Wert der materialManufSt2Price-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getMaterialManufSt2Price() {
            return materialManufSt2Price;
        }

        /**
         * Legt den Wert der materialManufSt2Price-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setMaterialManufSt2Price(Price value) {
            this.materialManufSt2Price = value;
        }

        /**
         * Ruft den Wert der materialManufSt3Price-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getMaterialManufSt3Price() {
            return materialManufSt3Price;
        }

        /**
         * Legt den Wert der materialManufSt3Price-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setMaterialManufSt3Price(Price value) {
            this.materialManufSt3Price = value;
        }

        /**
         * Ruft den Wert der materialManufSt4Price-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getMaterialManufSt4Price() {
            return materialManufSt4Price;
        }

        /**
         * Legt den Wert der materialManufSt4Price-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setMaterialManufSt4Price(Price value) {
            this.materialManufSt4Price = value;
        }

        /**
         * Ruft den Wert der materialManufSt5Price-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getMaterialManufSt5Price() {
            return materialManufSt5Price;
        }

        /**
         * Legt den Wert der materialManufSt5Price-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setMaterialManufSt5Price(Price value) {
            this.materialManufSt5Price = value;
        }

        /**
         * Ruft den Wert der discountMaterialBiw-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Discount2 }
         *     
         */
        public Discount2 getDiscountMaterialBiw() {
            return discountMaterialBiw;
        }

        /**
         * Legt den Wert der discountMaterialBiw-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Discount2 }
         *     
         */
        public void setDiscountMaterialBiw(Discount2 value) {
            this.discountMaterialBiw = value;
        }

        /**
         * Ruft den Wert der discountWageInclMaterialBiw-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Discount2 }
         *     
         */
        public Discount2 getDiscountWageInclMaterialBiw() {
            return discountWageInclMaterialBiw;
        }

        /**
         * Legt den Wert der discountWageInclMaterialBiw-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Discount2 }
         *     
         */
        public void setDiscountWageInclMaterialBiw(Discount2 value) {
            this.discountWageInclMaterialBiw = value;
        }

        /**
         * Ruft den Wert der isSurchargeForMatt-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueBoolean }
         *     
         */
        public RateValueBoolean getIsSurchargeForMatt() {
            return isSurchargeForMatt;
        }

        /**
         * Legt den Wert der isSurchargeForMatt-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueBoolean }
         *     
         */
        public void setIsSurchargeForMatt(RateValueBoolean value) {
            this.isSurchargeForMatt = value;
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
     *     &lt;extension base="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}discountFactor">
     *       &lt;sequence>
     *         &lt;element name="priceDate" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDate" minOccurs="0" form="qualified"/>
     *         &lt;element name="increaseDecrease" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
     *         &lt;element name="bracketSetRentCost" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="bracketSetProcurementCost" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="procurementCost" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="bodyInWhiteProcurementCost" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="smallSparePartFlatRatePrice" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}Price" minOccurs="0" form="qualified"/>
     *         &lt;element name="smallSparePartPercentOfPart" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
     *         &lt;element name="smallSparePartPercentOfPartBiw" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
     *         &lt;element name="smallSparePartPercentOfWage" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
     *         &lt;element name="smallSparePartPercentOfWageBiw" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
     *         &lt;element name="smallSparePartCalculationModel" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueBoolean" minOccurs="0" form="qualified"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "priceDate",
        "increaseDecrease",
        "bracketSetRentCost",
        "bracketSetProcurementCost",
        "procurementCost",
        "bodyInWhiteProcurementCost",
        "smallSparePartFlatRatePrice",
        "smallSparePartPercentOfPart",
        "smallSparePartPercentOfPartBiw",
        "smallSparePartPercentOfWage",
        "smallSparePartPercentOfWageBiw",
        "smallSparePartCalculationModel"
    })
    public static class SparePartFactor
        extends DiscountFactor
    {

        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueDate priceDate;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueDouble increaseDecrease;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price bracketSetRentCost;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price bracketSetProcurementCost;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price procurementCost;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price bodyInWhiteProcurementCost;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected Price smallSparePartFlatRatePrice;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueDouble smallSparePartPercentOfPart;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueDouble smallSparePartPercentOfPartBiw;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueDouble smallSparePartPercentOfWage;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueDouble smallSparePartPercentOfWageBiw;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueBoolean smallSparePartCalculationModel;

        /**
         * Ruft den Wert der priceDate-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueDate }
         *     
         */
        public RateValueDate getPriceDate() {
            return priceDate;
        }

        /**
         * Legt den Wert der priceDate-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueDate }
         *     
         */
        public void setPriceDate(RateValueDate value) {
            this.priceDate = value;
        }

        /**
         * Ruft den Wert der increaseDecrease-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueDouble }
         *     
         */
        public RateValueDouble getIncreaseDecrease() {
            return increaseDecrease;
        }

        /**
         * Legt den Wert der increaseDecrease-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueDouble }
         *     
         */
        public void setIncreaseDecrease(RateValueDouble value) {
            this.increaseDecrease = value;
        }

        /**
         * Ruft den Wert der bracketSetRentCost-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getBracketSetRentCost() {
            return bracketSetRentCost;
        }

        /**
         * Legt den Wert der bracketSetRentCost-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setBracketSetRentCost(Price value) {
            this.bracketSetRentCost = value;
        }

        /**
         * Ruft den Wert der bracketSetProcurementCost-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getBracketSetProcurementCost() {
            return bracketSetProcurementCost;
        }

        /**
         * Legt den Wert der bracketSetProcurementCost-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setBracketSetProcurementCost(Price value) {
            this.bracketSetProcurementCost = value;
        }

        /**
         * Ruft den Wert der procurementCost-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getProcurementCost() {
            return procurementCost;
        }

        /**
         * Legt den Wert der procurementCost-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setProcurementCost(Price value) {
            this.procurementCost = value;
        }

        /**
         * Ruft den Wert der bodyInWhiteProcurementCost-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getBodyInWhiteProcurementCost() {
            return bodyInWhiteProcurementCost;
        }

        /**
         * Legt den Wert der bodyInWhiteProcurementCost-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setBodyInWhiteProcurementCost(Price value) {
            this.bodyInWhiteProcurementCost = value;
        }

        /**
         * Ruft den Wert der smallSparePartFlatRatePrice-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Price }
         *     
         */
        public Price getSmallSparePartFlatRatePrice() {
            return smallSparePartFlatRatePrice;
        }

        /**
         * Legt den Wert der smallSparePartFlatRatePrice-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Price }
         *     
         */
        public void setSmallSparePartFlatRatePrice(Price value) {
            this.smallSparePartFlatRatePrice = value;
        }

        /**
         * Ruft den Wert der smallSparePartPercentOfPart-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueDouble }
         *     
         */
        public RateValueDouble getSmallSparePartPercentOfPart() {
            return smallSparePartPercentOfPart;
        }

        /**
         * Legt den Wert der smallSparePartPercentOfPart-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueDouble }
         *     
         */
        public void setSmallSparePartPercentOfPart(RateValueDouble value) {
            this.smallSparePartPercentOfPart = value;
        }

        /**
         * Ruft den Wert der smallSparePartPercentOfPartBiw-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueDouble }
         *     
         */
        public RateValueDouble getSmallSparePartPercentOfPartBiw() {
            return smallSparePartPercentOfPartBiw;
        }

        /**
         * Legt den Wert der smallSparePartPercentOfPartBiw-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueDouble }
         *     
         */
        public void setSmallSparePartPercentOfPartBiw(RateValueDouble value) {
            this.smallSparePartPercentOfPartBiw = value;
        }

        /**
         * Ruft den Wert der smallSparePartPercentOfWage-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueDouble }
         *     
         */
        public RateValueDouble getSmallSparePartPercentOfWage() {
            return smallSparePartPercentOfWage;
        }

        /**
         * Legt den Wert der smallSparePartPercentOfWage-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueDouble }
         *     
         */
        public void setSmallSparePartPercentOfWage(RateValueDouble value) {
            this.smallSparePartPercentOfWage = value;
        }

        /**
         * Ruft den Wert der smallSparePartPercentOfWageBiw-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueDouble }
         *     
         */
        public RateValueDouble getSmallSparePartPercentOfWageBiw() {
            return smallSparePartPercentOfWageBiw;
        }

        /**
         * Legt den Wert der smallSparePartPercentOfWageBiw-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueDouble }
         *     
         */
        public void setSmallSparePartPercentOfWageBiw(RateValueDouble value) {
            this.smallSparePartPercentOfWageBiw = value;
        }

        /**
         * Ruft den Wert der smallSparePartCalculationModel-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueBoolean }
         *     
         */
        public RateValueBoolean getSmallSparePartCalculationModel() {
            return smallSparePartCalculationModel;
        }

        /**
         * Legt den Wert der smallSparePartCalculationModel-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueBoolean }
         *     
         */
        public void setSmallSparePartCalculationModel(RateValueBoolean value) {
            this.smallSparePartCalculationModel = value;
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
     *         &lt;element name="tyresAge" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueInteger" minOccurs="0" form="qualified"/>
     *         &lt;element name="componentsAge" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueInteger" minOccurs="0" form="qualified"/>
     *         &lt;element name="componentsMilage" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
     *         &lt;element name="tyresTreadDepthCurrent" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
     *         &lt;element name="tyresTreadDepthNew" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
     *         &lt;element name="tyresTreadDepthLegislation" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateValueDouble" minOccurs="0" form="qualified"/>
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
        "tyresAge",
        "componentsAge",
        "componentsMilage",
        "tyresTreadDepthCurrent",
        "tyresTreadDepthNew",
        "tyresTreadDepthLegislation"
    })
    public static class WearoutCalculationFactor {

        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueInteger tyresAge;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueInteger componentsAge;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueDouble componentsMilage;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueDouble tyresTreadDepthCurrent;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueDouble tyresTreadDepthNew;
        @XmlElement(namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
        protected RateValueDouble tyresTreadDepthLegislation;

        /**
         * Ruft den Wert der tyresAge-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueInteger }
         *     
         */
        public RateValueInteger getTyresAge() {
            return tyresAge;
        }

        /**
         * Legt den Wert der tyresAge-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueInteger }
         *     
         */
        public void setTyresAge(RateValueInteger value) {
            this.tyresAge = value;
        }

        /**
         * Ruft den Wert der componentsAge-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueInteger }
         *     
         */
        public RateValueInteger getComponentsAge() {
            return componentsAge;
        }

        /**
         * Legt den Wert der componentsAge-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueInteger }
         *     
         */
        public void setComponentsAge(RateValueInteger value) {
            this.componentsAge = value;
        }

        /**
         * Ruft den Wert der componentsMilage-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueDouble }
         *     
         */
        public RateValueDouble getComponentsMilage() {
            return componentsMilage;
        }

        /**
         * Legt den Wert der componentsMilage-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueDouble }
         *     
         */
        public void setComponentsMilage(RateValueDouble value) {
            this.componentsMilage = value;
        }

        /**
         * Ruft den Wert der tyresTreadDepthCurrent-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueDouble }
         *     
         */
        public RateValueDouble getTyresTreadDepthCurrent() {
            return tyresTreadDepthCurrent;
        }

        /**
         * Legt den Wert der tyresTreadDepthCurrent-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueDouble }
         *     
         */
        public void setTyresTreadDepthCurrent(RateValueDouble value) {
            this.tyresTreadDepthCurrent = value;
        }

        /**
         * Ruft den Wert der tyresTreadDepthNew-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueDouble }
         *     
         */
        public RateValueDouble getTyresTreadDepthNew() {
            return tyresTreadDepthNew;
        }

        /**
         * Legt den Wert der tyresTreadDepthNew-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueDouble }
         *     
         */
        public void setTyresTreadDepthNew(RateValueDouble value) {
            this.tyresTreadDepthNew = value;
        }

        /**
         * Ruft den Wert der tyresTreadDepthLegislation-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RateValueDouble }
         *     
         */
        public RateValueDouble getTyresTreadDepthLegislation() {
            return tyresTreadDepthLegislation;
        }

        /**
         * Legt den Wert der tyresTreadDepthLegislation-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueDouble }
         *     
         */
        public void setTyresTreadDepthLegislation(RateValueDouble value) {
            this.tyresTreadDepthLegislation = value;
        }

    }

}
