
package de.dat.vehiclerepaironline.services.dossier;

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
 *         &lt;element name="OriginalPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatOriginalPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="OriginalPriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatOriginalPriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PrognosisDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="PricelistDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="BasePrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatBasePrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Mileage" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ReferenceMileage" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="MileageCorr" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatMileageCorr" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="InitialRegistrationCorr" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatInitialRegistrationCorr" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DevaluationFactorPerc" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatDevaluationFactorPerc" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="BasePrice2" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatBasePrice2" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="EquipmentSign" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManualEquipmentOriginalPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="EquipmentOriginalPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatEquipmentOriginalPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="EquipmentPercentage" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="EquipmentDecreaseType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="EquipmentDecreaseTypeRemaining" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="EquipmentPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatEquipmentPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="UpperBodiesPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatUpperBodiesPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ValuationCorrection" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatValuationCorrection" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="BasePrice3" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatBasePrice3" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConditionCorrectionPerc" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatConditionCorrectionPerc" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SalesPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SalesPriceRounded" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SalesPricePrognosis" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatSalesPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatSalesPriceRounded" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SalesPriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SalesPriceGrossRounded" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SalesPricePrognosisGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatSalesPriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatSalesPriceGrossRounded" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Margin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="MarginRounded" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatMargin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatMarginRounded" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="MarginGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="MarginGrossRounded" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="MarginPrognosis" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="MarginPrognosisGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatMarginGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatMarginGrossRounded" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PurchasePrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PurchasePriceRounded" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PurchasePricePrognosis" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatPurchasePrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatPurchasePriceRounded" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PurchasePriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PurchasePriceGrossRounded" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PurchasePricePrognosisGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatPurchasePriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatPurchasePriceGrossRounded" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LastValuationDataYear" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="LastValuationDataMonth" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="LastValuationDataMonthSer" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="PrognosisMileageDat" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="PrognosisMileageUser" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="LastValuationDate" type="{http://www.dat.de/vxs}fieldDateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="ExpertsSurveyDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="SurveyorUserId" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Currency" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DefaultPlatformPresent" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="SignMilageUnit" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Obsolete" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ObsoletePrognosis" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DisplayGross" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="DisplayRounded" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="ResultInformation" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DefaultTiresPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatDefaultTiresPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SignDeterminatedDate" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="DeterminatedDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="ContractNo" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ValuationType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ExtendedMileageCorrection" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="ModelYear" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="RegionNo" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="Region" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}Condition"/>
 *         &lt;element ref="{http://www.dat.de/vxs}Parameters"/>
 *         &lt;element ref="{http://www.dat.de/vxs}Forecasts"/>
 *         &lt;element name="CountryFlagAfterSale" type="{http://www.dat.de/vxs}fieldString3" minOccurs="0" form="qualified"/>
 *         &lt;element name="CountryFlagBeforeSale" type="{http://www.dat.de/vxs}fieldString3" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}Vehicle" minOccurs="0"/>
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
@XmlRootElement(name = "Valuation")
public class Valuation {

    @XmlElement(name = "OriginalPrice")
    protected FieldDecimal originalPrice;
    @XmlElement(name = "DatOriginalPrice")
    protected FieldDecimal datOriginalPrice;
    @XmlElement(name = "OriginalPriceGross")
    protected FieldDecimal originalPriceGross;
    @XmlElement(name = "DatOriginalPriceGross")
    protected FieldDecimal datOriginalPriceGross;
    @XmlElement(name = "PrognosisDate")
    protected FieldDate prognosisDate;
    @XmlElement(name = "PricelistDate")
    protected FieldDate pricelistDate;
    @XmlElement(name = "BasePrice")
    protected FieldDecimal basePrice;
    @XmlElement(name = "DatBasePrice")
    protected FieldDecimal datBasePrice;
    @XmlElement(name = "Mileage")
    protected FieldDecimal mileage;
    @XmlElement(name = "ReferenceMileage")
    protected FieldDecimal referenceMileage;
    @XmlElement(name = "MileageCorr")
    protected FieldDecimal mileageCorr;
    @XmlElement(name = "DatMileageCorr")
    protected FieldDecimal datMileageCorr;
    @XmlElement(name = "InitialRegistrationCorr")
    protected FieldDecimal initialRegistrationCorr;
    @XmlElement(name = "DatInitialRegistrationCorr")
    protected FieldDecimal datInitialRegistrationCorr;
    @XmlElement(name = "DevaluationFactorPerc")
    protected FieldDecimal devaluationFactorPerc;
    @XmlElement(name = "DatDevaluationFactorPerc")
    protected FieldDecimal datDevaluationFactorPerc;
    @XmlElement(name = "BasePrice2")
    protected FieldDecimal basePrice2;
    @XmlElement(name = "DatBasePrice2")
    protected FieldDecimal datBasePrice2;
    @XmlElement(name = "EquipmentSign")
    protected FieldString equipmentSign;
    @XmlElement(name = "ManualEquipmentOriginalPrice")
    protected FieldDecimal manualEquipmentOriginalPrice;
    @XmlElement(name = "EquipmentOriginalPrice")
    protected FieldDecimal equipmentOriginalPrice;
    @XmlElement(name = "DatEquipmentOriginalPrice")
    protected FieldDecimal datEquipmentOriginalPrice;
    @XmlElement(name = "EquipmentPercentage")
    protected FieldInteger equipmentPercentage;
    @XmlElement(name = "EquipmentDecreaseType")
    protected FieldString equipmentDecreaseType;
    @XmlElement(name = "EquipmentDecreaseTypeRemaining")
    protected FieldString equipmentDecreaseTypeRemaining;
    @XmlElement(name = "EquipmentPrice")
    protected FieldDecimal equipmentPrice;
    @XmlElement(name = "DatEquipmentPrice")
    protected FieldDecimal datEquipmentPrice;
    @XmlElement(name = "UpperBodiesPrice")
    protected FieldDecimal upperBodiesPrice;
    @XmlElement(name = "DatUpperBodiesPrice")
    protected FieldDecimal datUpperBodiesPrice;
    @XmlElement(name = "ValuationCorrection")
    protected FieldDecimal valuationCorrection;
    @XmlElement(name = "DatValuationCorrection")
    protected FieldDecimal datValuationCorrection;
    @XmlElement(name = "BasePrice3")
    protected FieldDecimal basePrice3;
    @XmlElement(name = "DatBasePrice3")
    protected FieldDecimal datBasePrice3;
    @XmlElement(name = "ConditionCorrectionPerc")
    protected FieldDecimal conditionCorrectionPerc;
    @XmlElement(name = "DatConditionCorrectionPerc")
    protected FieldDecimal datConditionCorrectionPerc;
    @XmlElement(name = "SalesPrice")
    protected FieldDecimal salesPrice;
    @XmlElement(name = "SalesPriceRounded")
    protected FieldDecimal salesPriceRounded;
    @XmlElement(name = "SalesPricePrognosis")
    protected FieldDecimal salesPricePrognosis;
    @XmlElement(name = "DatSalesPrice")
    protected FieldDecimal datSalesPrice;
    @XmlElement(name = "DatSalesPriceRounded")
    protected FieldDecimal datSalesPriceRounded;
    @XmlElement(name = "SalesPriceGross")
    protected FieldDecimal salesPriceGross;
    @XmlElement(name = "SalesPriceGrossRounded")
    protected FieldDecimal salesPriceGrossRounded;
    @XmlElement(name = "SalesPricePrognosisGross")
    protected FieldDecimal salesPricePrognosisGross;
    @XmlElement(name = "DatSalesPriceGross")
    protected FieldDecimal datSalesPriceGross;
    @XmlElement(name = "DatSalesPriceGrossRounded")
    protected FieldDecimal datSalesPriceGrossRounded;
    @XmlElement(name = "Margin")
    protected FieldDecimal margin;
    @XmlElement(name = "MarginRounded")
    protected FieldDecimal marginRounded;
    @XmlElement(name = "DatMargin")
    protected FieldDecimal datMargin;
    @XmlElement(name = "DatMarginRounded")
    protected FieldDecimal datMarginRounded;
    @XmlElement(name = "MarginGross")
    protected FieldDecimal marginGross;
    @XmlElement(name = "MarginGrossRounded")
    protected FieldDecimal marginGrossRounded;
    @XmlElement(name = "MarginPrognosis")
    protected FieldDecimal marginPrognosis;
    @XmlElement(name = "MarginPrognosisGross")
    protected FieldDecimal marginPrognosisGross;
    @XmlElement(name = "DatMarginGross")
    protected FieldDecimal datMarginGross;
    @XmlElement(name = "DatMarginGrossRounded")
    protected FieldDecimal datMarginGrossRounded;
    @XmlElement(name = "PurchasePrice")
    protected FieldDecimal purchasePrice;
    @XmlElement(name = "PurchasePriceRounded")
    protected FieldDecimal purchasePriceRounded;
    @XmlElement(name = "PurchasePricePrognosis")
    protected FieldDecimal purchasePricePrognosis;
    @XmlElement(name = "DatPurchasePrice")
    protected FieldDecimal datPurchasePrice;
    @XmlElement(name = "DatPurchasePriceRounded")
    protected FieldDecimal datPurchasePriceRounded;
    @XmlElement(name = "PurchasePriceGross")
    protected FieldDecimal purchasePriceGross;
    @XmlElement(name = "PurchasePriceGrossRounded")
    protected FieldDecimal purchasePriceGrossRounded;
    @XmlElement(name = "PurchasePricePrognosisGross")
    protected FieldDecimal purchasePricePrognosisGross;
    @XmlElement(name = "DatPurchasePriceGross")
    protected FieldDecimal datPurchasePriceGross;
    @XmlElement(name = "DatPurchasePriceGrossRounded")
    protected FieldDecimal datPurchasePriceGrossRounded;
    @XmlElement(name = "LastValuationDataYear")
    protected FieldInteger lastValuationDataYear;
    @XmlElement(name = "LastValuationDataMonth")
    protected FieldInteger lastValuationDataMonth;
    @XmlElement(name = "LastValuationDataMonthSer")
    protected FieldInteger lastValuationDataMonthSer;
    @XmlElement(name = "PrognosisMileageDat")
    protected FieldInteger prognosisMileageDat;
    @XmlElement(name = "PrognosisMileageUser")
    protected FieldInteger prognosisMileageUser;
    @XmlElement(name = "LastValuationDate")
    protected FieldDateTime lastValuationDate;
    @XmlElement(name = "ExpertsSurveyDate")
    protected FieldDate expertsSurveyDate;
    @XmlElement(name = "SurveyorUserId")
    protected FieldString surveyorUserId;
    @XmlElement(name = "Currency")
    protected FieldString currency;
    @XmlElement(name = "DefaultPlatformPresent")
    protected FieldString defaultPlatformPresent;
    @XmlElement(name = "SignMilageUnit")
    protected FieldString signMilageUnit;
    @XmlElement(name = "Obsolete")
    protected FieldString obsolete;
    @XmlElement(name = "ObsoletePrognosis")
    protected FieldInteger obsoletePrognosis;
    @XmlElement(name = "DisplayGross")
    protected FieldBoolean displayGross;
    @XmlElement(name = "DisplayRounded")
    protected FieldBoolean displayRounded;
    @XmlElement(name = "ResultInformation")
    protected FieldString resultInformation;
    @XmlElement(name = "DefaultTiresPrice")
    protected FieldDecimal defaultTiresPrice;
    @XmlElement(name = "DatDefaultTiresPrice")
    protected FieldDecimal datDefaultTiresPrice;
    @XmlElement(name = "SignDeterminatedDate")
    protected FieldBoolean signDeterminatedDate;
    @XmlElement(name = "DeterminatedDate")
    protected FieldDate determinatedDate;
    @XmlElement(name = "ContractNo")
    protected FieldString contractNo;
    @XmlElement(name = "ValuationType")
    protected FieldString valuationType;
    @XmlElement(name = "ExtendedMileageCorrection")
    protected FieldBoolean extendedMileageCorrection;
    @XmlElement(name = "ModelYear")
    protected FieldInteger modelYear;
    @XmlElement(name = "RegionNo")
    protected FieldInteger regionNo;
    @XmlElement(name = "Region")
    protected FieldString region;
    @XmlElement(name = "Condition", required = true)
    protected Condition condition;
    @XmlElement(name = "Parameters", required = true)
    protected Parameters parameters;
    @XmlElement(name = "Forecasts", required = true)
    protected Forecasts forecasts;
    @XmlElement(name = "CountryFlagAfterSale")
    protected FieldString3 countryFlagAfterSale;
    @XmlElement(name = "CountryFlagBeforeSale")
    protected FieldString3 countryFlagBeforeSale;
    @XmlElement(name = "Vehicle")
    protected Vehicle vehicle;

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
     * Ruft den Wert der prognosisDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getPrognosisDate() {
        return prognosisDate;
    }

    /**
     * Legt den Wert der prognosisDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setPrognosisDate(FieldDate value) {
        this.prognosisDate = value;
    }

    /**
     * Ruft den Wert der pricelistDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getPricelistDate() {
        return pricelistDate;
    }

    /**
     * Legt den Wert der pricelistDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setPricelistDate(FieldDate value) {
        this.pricelistDate = value;
    }

    /**
     * Ruft den Wert der basePrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getBasePrice() {
        return basePrice;
    }

    /**
     * Legt den Wert der basePrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setBasePrice(FieldDecimal value) {
        this.basePrice = value;
    }

    /**
     * Ruft den Wert der datBasePrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatBasePrice() {
        return datBasePrice;
    }

    /**
     * Legt den Wert der datBasePrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatBasePrice(FieldDecimal value) {
        this.datBasePrice = value;
    }

    /**
     * Ruft den Wert der mileage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getMileage() {
        return mileage;
    }

    /**
     * Legt den Wert der mileage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setMileage(FieldDecimal value) {
        this.mileage = value;
    }

    /**
     * Ruft den Wert der referenceMileage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getReferenceMileage() {
        return referenceMileage;
    }

    /**
     * Legt den Wert der referenceMileage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setReferenceMileage(FieldDecimal value) {
        this.referenceMileage = value;
    }

    /**
     * Ruft den Wert der mileageCorr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getMileageCorr() {
        return mileageCorr;
    }

    /**
     * Legt den Wert der mileageCorr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setMileageCorr(FieldDecimal value) {
        this.mileageCorr = value;
    }

    /**
     * Ruft den Wert der datMileageCorr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatMileageCorr() {
        return datMileageCorr;
    }

    /**
     * Legt den Wert der datMileageCorr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatMileageCorr(FieldDecimal value) {
        this.datMileageCorr = value;
    }

    /**
     * Ruft den Wert der initialRegistrationCorr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getInitialRegistrationCorr() {
        return initialRegistrationCorr;
    }

    /**
     * Legt den Wert der initialRegistrationCorr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setInitialRegistrationCorr(FieldDecimal value) {
        this.initialRegistrationCorr = value;
    }

    /**
     * Ruft den Wert der datInitialRegistrationCorr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatInitialRegistrationCorr() {
        return datInitialRegistrationCorr;
    }

    /**
     * Legt den Wert der datInitialRegistrationCorr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatInitialRegistrationCorr(FieldDecimal value) {
        this.datInitialRegistrationCorr = value;
    }

    /**
     * Ruft den Wert der devaluationFactorPerc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDevaluationFactorPerc() {
        return devaluationFactorPerc;
    }

    /**
     * Legt den Wert der devaluationFactorPerc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDevaluationFactorPerc(FieldDecimal value) {
        this.devaluationFactorPerc = value;
    }

    /**
     * Ruft den Wert der datDevaluationFactorPerc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatDevaluationFactorPerc() {
        return datDevaluationFactorPerc;
    }

    /**
     * Legt den Wert der datDevaluationFactorPerc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatDevaluationFactorPerc(FieldDecimal value) {
        this.datDevaluationFactorPerc = value;
    }

    /**
     * Ruft den Wert der basePrice2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getBasePrice2() {
        return basePrice2;
    }

    /**
     * Legt den Wert der basePrice2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setBasePrice2(FieldDecimal value) {
        this.basePrice2 = value;
    }

    /**
     * Ruft den Wert der datBasePrice2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatBasePrice2() {
        return datBasePrice2;
    }

    /**
     * Legt den Wert der datBasePrice2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatBasePrice2(FieldDecimal value) {
        this.datBasePrice2 = value;
    }

    /**
     * Ruft den Wert der equipmentSign-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getEquipmentSign() {
        return equipmentSign;
    }

    /**
     * Legt den Wert der equipmentSign-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setEquipmentSign(FieldString value) {
        this.equipmentSign = value;
    }

    /**
     * Ruft den Wert der manualEquipmentOriginalPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getManualEquipmentOriginalPrice() {
        return manualEquipmentOriginalPrice;
    }

    /**
     * Legt den Wert der manualEquipmentOriginalPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setManualEquipmentOriginalPrice(FieldDecimal value) {
        this.manualEquipmentOriginalPrice = value;
    }

    /**
     * Ruft den Wert der equipmentOriginalPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getEquipmentOriginalPrice() {
        return equipmentOriginalPrice;
    }

    /**
     * Legt den Wert der equipmentOriginalPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setEquipmentOriginalPrice(FieldDecimal value) {
        this.equipmentOriginalPrice = value;
    }

    /**
     * Ruft den Wert der datEquipmentOriginalPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatEquipmentOriginalPrice() {
        return datEquipmentOriginalPrice;
    }

    /**
     * Legt den Wert der datEquipmentOriginalPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatEquipmentOriginalPrice(FieldDecimal value) {
        this.datEquipmentOriginalPrice = value;
    }

    /**
     * Ruft den Wert der equipmentPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getEquipmentPercentage() {
        return equipmentPercentage;
    }

    /**
     * Legt den Wert der equipmentPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setEquipmentPercentage(FieldInteger value) {
        this.equipmentPercentage = value;
    }

    /**
     * Ruft den Wert der equipmentDecreaseType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getEquipmentDecreaseType() {
        return equipmentDecreaseType;
    }

    /**
     * Legt den Wert der equipmentDecreaseType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setEquipmentDecreaseType(FieldString value) {
        this.equipmentDecreaseType = value;
    }

    /**
     * Ruft den Wert der equipmentDecreaseTypeRemaining-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getEquipmentDecreaseTypeRemaining() {
        return equipmentDecreaseTypeRemaining;
    }

    /**
     * Legt den Wert der equipmentDecreaseTypeRemaining-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setEquipmentDecreaseTypeRemaining(FieldString value) {
        this.equipmentDecreaseTypeRemaining = value;
    }

    /**
     * Ruft den Wert der equipmentPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getEquipmentPrice() {
        return equipmentPrice;
    }

    /**
     * Legt den Wert der equipmentPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setEquipmentPrice(FieldDecimal value) {
        this.equipmentPrice = value;
    }

    /**
     * Ruft den Wert der datEquipmentPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatEquipmentPrice() {
        return datEquipmentPrice;
    }

    /**
     * Legt den Wert der datEquipmentPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatEquipmentPrice(FieldDecimal value) {
        this.datEquipmentPrice = value;
    }

    /**
     * Ruft den Wert der upperBodiesPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getUpperBodiesPrice() {
        return upperBodiesPrice;
    }

    /**
     * Legt den Wert der upperBodiesPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setUpperBodiesPrice(FieldDecimal value) {
        this.upperBodiesPrice = value;
    }

    /**
     * Ruft den Wert der datUpperBodiesPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatUpperBodiesPrice() {
        return datUpperBodiesPrice;
    }

    /**
     * Legt den Wert der datUpperBodiesPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatUpperBodiesPrice(FieldDecimal value) {
        this.datUpperBodiesPrice = value;
    }

    /**
     * Ruft den Wert der valuationCorrection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getValuationCorrection() {
        return valuationCorrection;
    }

    /**
     * Legt den Wert der valuationCorrection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setValuationCorrection(FieldDecimal value) {
        this.valuationCorrection = value;
    }

    /**
     * Ruft den Wert der datValuationCorrection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatValuationCorrection() {
        return datValuationCorrection;
    }

    /**
     * Legt den Wert der datValuationCorrection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatValuationCorrection(FieldDecimal value) {
        this.datValuationCorrection = value;
    }

    /**
     * Ruft den Wert der basePrice3-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getBasePrice3() {
        return basePrice3;
    }

    /**
     * Legt den Wert der basePrice3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setBasePrice3(FieldDecimal value) {
        this.basePrice3 = value;
    }

    /**
     * Ruft den Wert der datBasePrice3-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatBasePrice3() {
        return datBasePrice3;
    }

    /**
     * Legt den Wert der datBasePrice3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatBasePrice3(FieldDecimal value) {
        this.datBasePrice3 = value;
    }

    /**
     * Ruft den Wert der conditionCorrectionPerc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getConditionCorrectionPerc() {
        return conditionCorrectionPerc;
    }

    /**
     * Legt den Wert der conditionCorrectionPerc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setConditionCorrectionPerc(FieldDecimal value) {
        this.conditionCorrectionPerc = value;
    }

    /**
     * Ruft den Wert der datConditionCorrectionPerc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatConditionCorrectionPerc() {
        return datConditionCorrectionPerc;
    }

    /**
     * Legt den Wert der datConditionCorrectionPerc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatConditionCorrectionPerc(FieldDecimal value) {
        this.datConditionCorrectionPerc = value;
    }

    /**
     * Ruft den Wert der salesPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSalesPrice() {
        return salesPrice;
    }

    /**
     * Legt den Wert der salesPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSalesPrice(FieldDecimal value) {
        this.salesPrice = value;
    }

    /**
     * Ruft den Wert der salesPriceRounded-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSalesPriceRounded() {
        return salesPriceRounded;
    }

    /**
     * Legt den Wert der salesPriceRounded-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSalesPriceRounded(FieldDecimal value) {
        this.salesPriceRounded = value;
    }

    /**
     * Ruft den Wert der salesPricePrognosis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSalesPricePrognosis() {
        return salesPricePrognosis;
    }

    /**
     * Legt den Wert der salesPricePrognosis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSalesPricePrognosis(FieldDecimal value) {
        this.salesPricePrognosis = value;
    }

    /**
     * Ruft den Wert der datSalesPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatSalesPrice() {
        return datSalesPrice;
    }

    /**
     * Legt den Wert der datSalesPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatSalesPrice(FieldDecimal value) {
        this.datSalesPrice = value;
    }

    /**
     * Ruft den Wert der datSalesPriceRounded-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatSalesPriceRounded() {
        return datSalesPriceRounded;
    }

    /**
     * Legt den Wert der datSalesPriceRounded-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatSalesPriceRounded(FieldDecimal value) {
        this.datSalesPriceRounded = value;
    }

    /**
     * Ruft den Wert der salesPriceGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSalesPriceGross() {
        return salesPriceGross;
    }

    /**
     * Legt den Wert der salesPriceGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSalesPriceGross(FieldDecimal value) {
        this.salesPriceGross = value;
    }

    /**
     * Ruft den Wert der salesPriceGrossRounded-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSalesPriceGrossRounded() {
        return salesPriceGrossRounded;
    }

    /**
     * Legt den Wert der salesPriceGrossRounded-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSalesPriceGrossRounded(FieldDecimal value) {
        this.salesPriceGrossRounded = value;
    }

    /**
     * Ruft den Wert der salesPricePrognosisGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSalesPricePrognosisGross() {
        return salesPricePrognosisGross;
    }

    /**
     * Legt den Wert der salesPricePrognosisGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSalesPricePrognosisGross(FieldDecimal value) {
        this.salesPricePrognosisGross = value;
    }

    /**
     * Ruft den Wert der datSalesPriceGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatSalesPriceGross() {
        return datSalesPriceGross;
    }

    /**
     * Legt den Wert der datSalesPriceGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatSalesPriceGross(FieldDecimal value) {
        this.datSalesPriceGross = value;
    }

    /**
     * Ruft den Wert der datSalesPriceGrossRounded-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatSalesPriceGrossRounded() {
        return datSalesPriceGrossRounded;
    }

    /**
     * Legt den Wert der datSalesPriceGrossRounded-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatSalesPriceGrossRounded(FieldDecimal value) {
        this.datSalesPriceGrossRounded = value;
    }

    /**
     * Ruft den Wert der margin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getMargin() {
        return margin;
    }

    /**
     * Legt den Wert der margin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setMargin(FieldDecimal value) {
        this.margin = value;
    }

    /**
     * Ruft den Wert der marginRounded-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getMarginRounded() {
        return marginRounded;
    }

    /**
     * Legt den Wert der marginRounded-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setMarginRounded(FieldDecimal value) {
        this.marginRounded = value;
    }

    /**
     * Ruft den Wert der datMargin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatMargin() {
        return datMargin;
    }

    /**
     * Legt den Wert der datMargin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatMargin(FieldDecimal value) {
        this.datMargin = value;
    }

    /**
     * Ruft den Wert der datMarginRounded-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatMarginRounded() {
        return datMarginRounded;
    }

    /**
     * Legt den Wert der datMarginRounded-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatMarginRounded(FieldDecimal value) {
        this.datMarginRounded = value;
    }

    /**
     * Ruft den Wert der marginGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getMarginGross() {
        return marginGross;
    }

    /**
     * Legt den Wert der marginGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setMarginGross(FieldDecimal value) {
        this.marginGross = value;
    }

    /**
     * Ruft den Wert der marginGrossRounded-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getMarginGrossRounded() {
        return marginGrossRounded;
    }

    /**
     * Legt den Wert der marginGrossRounded-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setMarginGrossRounded(FieldDecimal value) {
        this.marginGrossRounded = value;
    }

    /**
     * Ruft den Wert der marginPrognosis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getMarginPrognosis() {
        return marginPrognosis;
    }

    /**
     * Legt den Wert der marginPrognosis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setMarginPrognosis(FieldDecimal value) {
        this.marginPrognosis = value;
    }

    /**
     * Ruft den Wert der marginPrognosisGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getMarginPrognosisGross() {
        return marginPrognosisGross;
    }

    /**
     * Legt den Wert der marginPrognosisGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setMarginPrognosisGross(FieldDecimal value) {
        this.marginPrognosisGross = value;
    }

    /**
     * Ruft den Wert der datMarginGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatMarginGross() {
        return datMarginGross;
    }

    /**
     * Legt den Wert der datMarginGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatMarginGross(FieldDecimal value) {
        this.datMarginGross = value;
    }

    /**
     * Ruft den Wert der datMarginGrossRounded-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatMarginGrossRounded() {
        return datMarginGrossRounded;
    }

    /**
     * Legt den Wert der datMarginGrossRounded-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatMarginGrossRounded(FieldDecimal value) {
        this.datMarginGrossRounded = value;
    }

    /**
     * Ruft den Wert der purchasePrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * Legt den Wert der purchasePrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPurchasePrice(FieldDecimal value) {
        this.purchasePrice = value;
    }

    /**
     * Ruft den Wert der purchasePriceRounded-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPurchasePriceRounded() {
        return purchasePriceRounded;
    }

    /**
     * Legt den Wert der purchasePriceRounded-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPurchasePriceRounded(FieldDecimal value) {
        this.purchasePriceRounded = value;
    }

    /**
     * Ruft den Wert der purchasePricePrognosis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPurchasePricePrognosis() {
        return purchasePricePrognosis;
    }

    /**
     * Legt den Wert der purchasePricePrognosis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPurchasePricePrognosis(FieldDecimal value) {
        this.purchasePricePrognosis = value;
    }

    /**
     * Ruft den Wert der datPurchasePrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatPurchasePrice() {
        return datPurchasePrice;
    }

    /**
     * Legt den Wert der datPurchasePrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatPurchasePrice(FieldDecimal value) {
        this.datPurchasePrice = value;
    }

    /**
     * Ruft den Wert der datPurchasePriceRounded-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatPurchasePriceRounded() {
        return datPurchasePriceRounded;
    }

    /**
     * Legt den Wert der datPurchasePriceRounded-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatPurchasePriceRounded(FieldDecimal value) {
        this.datPurchasePriceRounded = value;
    }

    /**
     * Ruft den Wert der purchasePriceGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPurchasePriceGross() {
        return purchasePriceGross;
    }

    /**
     * Legt den Wert der purchasePriceGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPurchasePriceGross(FieldDecimal value) {
        this.purchasePriceGross = value;
    }

    /**
     * Ruft den Wert der purchasePriceGrossRounded-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPurchasePriceGrossRounded() {
        return purchasePriceGrossRounded;
    }

    /**
     * Legt den Wert der purchasePriceGrossRounded-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPurchasePriceGrossRounded(FieldDecimal value) {
        this.purchasePriceGrossRounded = value;
    }

    /**
     * Ruft den Wert der purchasePricePrognosisGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPurchasePricePrognosisGross() {
        return purchasePricePrognosisGross;
    }

    /**
     * Legt den Wert der purchasePricePrognosisGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPurchasePricePrognosisGross(FieldDecimal value) {
        this.purchasePricePrognosisGross = value;
    }

    /**
     * Ruft den Wert der datPurchasePriceGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatPurchasePriceGross() {
        return datPurchasePriceGross;
    }

    /**
     * Legt den Wert der datPurchasePriceGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatPurchasePriceGross(FieldDecimal value) {
        this.datPurchasePriceGross = value;
    }

    /**
     * Ruft den Wert der datPurchasePriceGrossRounded-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatPurchasePriceGrossRounded() {
        return datPurchasePriceGrossRounded;
    }

    /**
     * Legt den Wert der datPurchasePriceGrossRounded-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatPurchasePriceGrossRounded(FieldDecimal value) {
        this.datPurchasePriceGrossRounded = value;
    }

    /**
     * Ruft den Wert der lastValuationDataYear-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLastValuationDataYear() {
        return lastValuationDataYear;
    }

    /**
     * Legt den Wert der lastValuationDataYear-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLastValuationDataYear(FieldInteger value) {
        this.lastValuationDataYear = value;
    }

    /**
     * Ruft den Wert der lastValuationDataMonth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLastValuationDataMonth() {
        return lastValuationDataMonth;
    }

    /**
     * Legt den Wert der lastValuationDataMonth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLastValuationDataMonth(FieldInteger value) {
        this.lastValuationDataMonth = value;
    }

    /**
     * Ruft den Wert der lastValuationDataMonthSer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLastValuationDataMonthSer() {
        return lastValuationDataMonthSer;
    }

    /**
     * Legt den Wert der lastValuationDataMonthSer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLastValuationDataMonthSer(FieldInteger value) {
        this.lastValuationDataMonthSer = value;
    }

    /**
     * Ruft den Wert der prognosisMileageDat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getPrognosisMileageDat() {
        return prognosisMileageDat;
    }

    /**
     * Legt den Wert der prognosisMileageDat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setPrognosisMileageDat(FieldInteger value) {
        this.prognosisMileageDat = value;
    }

    /**
     * Ruft den Wert der prognosisMileageUser-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getPrognosisMileageUser() {
        return prognosisMileageUser;
    }

    /**
     * Legt den Wert der prognosisMileageUser-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setPrognosisMileageUser(FieldInteger value) {
        this.prognosisMileageUser = value;
    }

    /**
     * Ruft den Wert der lastValuationDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getLastValuationDate() {
        return lastValuationDate;
    }

    /**
     * Legt den Wert der lastValuationDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setLastValuationDate(FieldDateTime value) {
        this.lastValuationDate = value;
    }

    /**
     * Ruft den Wert der expertsSurveyDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getExpertsSurveyDate() {
        return expertsSurveyDate;
    }

    /**
     * Legt den Wert der expertsSurveyDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setExpertsSurveyDate(FieldDate value) {
        this.expertsSurveyDate = value;
    }

    /**
     * Ruft den Wert der surveyorUserId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSurveyorUserId() {
        return surveyorUserId;
    }

    /**
     * Legt den Wert der surveyorUserId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSurveyorUserId(FieldString value) {
        this.surveyorUserId = value;
    }

    /**
     * Ruft den Wert der currency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCurrency() {
        return currency;
    }

    /**
     * Legt den Wert der currency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCurrency(FieldString value) {
        this.currency = value;
    }

    /**
     * Ruft den Wert der defaultPlatformPresent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDefaultPlatformPresent() {
        return defaultPlatformPresent;
    }

    /**
     * Legt den Wert der defaultPlatformPresent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDefaultPlatformPresent(FieldString value) {
        this.defaultPlatformPresent = value;
    }

    /**
     * Ruft den Wert der signMilageUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSignMilageUnit() {
        return signMilageUnit;
    }

    /**
     * Legt den Wert der signMilageUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSignMilageUnit(FieldString value) {
        this.signMilageUnit = value;
    }

    /**
     * Ruft den Wert der obsolete-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getObsolete() {
        return obsolete;
    }

    /**
     * Legt den Wert der obsolete-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setObsolete(FieldString value) {
        this.obsolete = value;
    }

    /**
     * Ruft den Wert der obsoletePrognosis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getObsoletePrognosis() {
        return obsoletePrognosis;
    }

    /**
     * Legt den Wert der obsoletePrognosis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setObsoletePrognosis(FieldInteger value) {
        this.obsoletePrognosis = value;
    }

    /**
     * Ruft den Wert der displayGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getDisplayGross() {
        return displayGross;
    }

    /**
     * Legt den Wert der displayGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setDisplayGross(FieldBoolean value) {
        this.displayGross = value;
    }

    /**
     * Ruft den Wert der displayRounded-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getDisplayRounded() {
        return displayRounded;
    }

    /**
     * Legt den Wert der displayRounded-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setDisplayRounded(FieldBoolean value) {
        this.displayRounded = value;
    }

    /**
     * Ruft den Wert der resultInformation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getResultInformation() {
        return resultInformation;
    }

    /**
     * Legt den Wert der resultInformation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setResultInformation(FieldString value) {
        this.resultInformation = value;
    }

    /**
     * Ruft den Wert der defaultTiresPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDefaultTiresPrice() {
        return defaultTiresPrice;
    }

    /**
     * Legt den Wert der defaultTiresPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDefaultTiresPrice(FieldDecimal value) {
        this.defaultTiresPrice = value;
    }

    /**
     * Ruft den Wert der datDefaultTiresPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatDefaultTiresPrice() {
        return datDefaultTiresPrice;
    }

    /**
     * Legt den Wert der datDefaultTiresPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatDefaultTiresPrice(FieldDecimal value) {
        this.datDefaultTiresPrice = value;
    }

    /**
     * Ruft den Wert der signDeterminatedDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getSignDeterminatedDate() {
        return signDeterminatedDate;
    }

    /**
     * Legt den Wert der signDeterminatedDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setSignDeterminatedDate(FieldBoolean value) {
        this.signDeterminatedDate = value;
    }

    /**
     * Ruft den Wert der determinatedDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getDeterminatedDate() {
        return determinatedDate;
    }

    /**
     * Legt den Wert der determinatedDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setDeterminatedDate(FieldDate value) {
        this.determinatedDate = value;
    }

    /**
     * Ruft den Wert der contractNo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getContractNo() {
        return contractNo;
    }

    /**
     * Legt den Wert der contractNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setContractNo(FieldString value) {
        this.contractNo = value;
    }

    /**
     * Ruft den Wert der valuationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getValuationType() {
        return valuationType;
    }

    /**
     * Legt den Wert der valuationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setValuationType(FieldString value) {
        this.valuationType = value;
    }

    /**
     * Ruft den Wert der extendedMileageCorrection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getExtendedMileageCorrection() {
        return extendedMileageCorrection;
    }

    /**
     * Legt den Wert der extendedMileageCorrection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setExtendedMileageCorrection(FieldBoolean value) {
        this.extendedMileageCorrection = value;
    }

    /**
     * Ruft den Wert der modelYear-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getModelYear() {
        return modelYear;
    }

    /**
     * Legt den Wert der modelYear-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setModelYear(FieldInteger value) {
        this.modelYear = value;
    }

    /**
     * Ruft den Wert der regionNo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getRegionNo() {
        return regionNo;
    }

    /**
     * Legt den Wert der regionNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setRegionNo(FieldInteger value) {
        this.regionNo = value;
    }

    /**
     * Ruft den Wert der region-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getRegion() {
        return region;
    }

    /**
     * Legt den Wert der region-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setRegion(FieldString value) {
        this.region = value;
    }

    /**
     * Ruft den Wert der condition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Condition }
     *     
     */
    public Condition getCondition() {
        return condition;
    }

    /**
     * Legt den Wert der condition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Condition }
     *     
     */
    public void setCondition(Condition value) {
        this.condition = value;
    }

    /**
     * Ruft den Wert der parameters-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Parameters }
     *     
     */
    public Parameters getParameters() {
        return parameters;
    }

    /**
     * Legt den Wert der parameters-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Parameters }
     *     
     */
    public void setParameters(Parameters value) {
        this.parameters = value;
    }

    /**
     * Ruft den Wert der forecasts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Forecasts }
     *     
     */
    public Forecasts getForecasts() {
        return forecasts;
    }

    /**
     * Legt den Wert der forecasts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Forecasts }
     *     
     */
    public void setForecasts(Forecasts value) {
        this.forecasts = value;
    }

    /**
     * Ruft den Wert der countryFlagAfterSale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString3 }
     *     
     */
    public FieldString3 getCountryFlagAfterSale() {
        return countryFlagAfterSale;
    }

    /**
     * Legt den Wert der countryFlagAfterSale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString3 }
     *     
     */
    public void setCountryFlagAfterSale(FieldString3 value) {
        this.countryFlagAfterSale = value;
    }

    /**
     * Ruft den Wert der countryFlagBeforeSale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString3 }
     *     
     */
    public FieldString3 getCountryFlagBeforeSale() {
        return countryFlagBeforeSale;
    }

    /**
     * Legt den Wert der countryFlagBeforeSale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString3 }
     *     
     */
    public void setCountryFlagBeforeSale(FieldString3 value) {
        this.countryFlagBeforeSale = value;
    }

    /**
     * Ruft den Wert der vehicle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle }
     *     
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Legt den Wert der vehicle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle }
     *     
     */
    public void setVehicle(Vehicle value) {
        this.vehicle = value;
    }

}
