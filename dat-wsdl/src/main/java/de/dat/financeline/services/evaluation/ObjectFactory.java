
package de.dat.financeline.services.evaluation;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.dat.financeline.services.evaluation package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConstructionPeriodSelectionRequest_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "ConstructionPeriodSelectionRequest");
    private final static QName _GetDataCountriesForVehicleTargetDateEvaluationHistory_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "getDataCountriesForVehicleTargetDateEvaluationHistory");
    private final static QName _GetRegionsOfCountryResponse_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "getRegionsOfCountryResponse");
    private final static QName _GetDataCountriesForVehicleEvaluation_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "getDataCountriesForVehicleEvaluation");
    private final static QName _GetYearMonthsForVehicleTargetDateEvaluationHistoryResponse_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "getYearMonthsForVehicleTargetDateEvaluationHistoryResponse");
    private final static QName _GetVehicleTargetDateEvaluationHistory_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "getVehicleTargetDateEvaluationHistory");
    private final static QName _GetUsedVehicleForecastResponse_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "getUsedVehicleForecastResponse");
    private final static QName _GetDataCountriesForUsedVehicleForecast_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "getDataCountriesForUsedVehicleForecast");
    private final static QName _GetVehicleApproximateValueResponse_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "getVehicleApproximateValueResponse");
    private final static QName _GetYearMonthsForVehicleTargetDateEvaluationHistory_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "getYearMonthsForVehicleTargetDateEvaluationHistory");
    private final static QName _PriceFocusSelectionRequest_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "PriceFocusSelectionRequest");
    private final static QName _GetDataCountriesForUsedVehicleForecastResponse_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "getDataCountriesForUsedVehicleForecastResponse");
    private final static QName _GetReferenceMileageForVehicleResponse_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "getReferenceMileageForVehicleResponse");
    private final static QName _GetVehicleEvaluationResponse_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "getVehicleEvaluationResponse");
    private final static QName _GetVehicleEvaluation_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "getVehicleEvaluation");
    private final static QName _GetDataCountriesForVehicleEvaluationResponse_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "getDataCountriesForVehicleEvaluationResponse");
    private final static QName _GetDataCountriesForVehicleTargetDateEvaluationHistoryResponse_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "getDataCountriesForVehicleTargetDateEvaluationHistoryResponse");
    private final static QName _BaseSelectionRequest_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "BaseSelectionRequest");
    private final static QName _GetUsedVehicleForecast_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "getUsedVehicleForecast");
    private final static QName _AbstractSelectionRequest_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "abstractSelectionRequest");
    private final static QName _GetVehicleTargetDateEvaluationHistoryResponse_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "getVehicleTargetDateEvaluationHistoryResponse");
    private final static QName _YearMonthsForCountryRequest_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "YearMonthsForCountryRequest");
    private final static QName _GetNewVehicleForecastResponse_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "getNewVehicleForecastResponse");
    private final static QName _GetNewVehicleForecast_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "getNewVehicleForecast");
    private final static QName _GetReferenceMileageForVehicle_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "getReferenceMileageForVehicle");
    private final static QName _GetVehicleApproximateValue_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "getVehicleApproximateValue");
    private final static QName _GetDataCountriesForNewVehicleForecast_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "getDataCountriesForNewVehicleForecast");
    private final static QName _GetDataCountriesForNewVehicleForecastResponse_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "getDataCountriesForNewVehicleForecastResponse");
    private final static QName _GetRegionsOfCountry_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "getRegionsOfCountry");
    private final static QName _VehicleSelectionRequest_QNAME = new QName("http://sphinx.dat.de/services/Evaluation", "vehicleSelectionRequest");
    private final static QName _NewVehicleForecastRequestMileageType_QNAME = new QName("", "mileageType");
    private final static QName _AbstractEvaluationRequestExternalId_QNAME = new QName("", "ExternalId");
    private final static QName _VehicleApproximateValueRequestVatType_QNAME = new QName("", "vatType");
    private final static QName _RegionNumber_QNAME = new QName("", "number");
    private final static QName _RegionName_QNAME = new QName("", "name");
    private final static QName _BasicSelectionRequestConstructionTimeFrom_QNAME = new QName("", "constructionTimeFrom");
    private final static QName _BasicSelectionRequestConstructionTimeTo_QNAME = new QName("", "constructionTimeTo");
    private final static QName _ConditionIncreaseInValue_QNAME = new QName("", "increaseInValue");
    private final static QName _ConditionAccidentDamage_QNAME = new QName("", "accidentDamage");
    private final static QName _ConditionTiresUnmountedValue_QNAME = new QName("", "tiresUnmountedValue");
    private final static QName _ConditionOwnerCorrectionPercent_QNAME = new QName("", "ownerCorrectionPercent");
    private final static QName _ConditionRepairCosts_QNAME = new QName("", "repairCosts");
    private final static QName _ConditionNumberOfOwners_QNAME = new QName("", "numberOfOwners");
    private final static QName _ConditionDecreaseInValue_QNAME = new QName("", "decreaseInValue");
    private final static QName _ConditionTiresMountedValue_QNAME = new QName("", "tiresMountedValue");
    private final static QName _ConditionCorrectionFactorPercent_QNAME = new QName("", "correctionFactorPercent");
    private final static QName _VehicleEvaluationRequestCondition_QNAME = new QName("", "condition");
    private final static QName _VehicleEvaluationRequestRegionNo_QNAME = new QName("", "regionNo");
    private final static QName _ForecastItemMileageTotal_QNAME = new QName("", "mileageTotal");
    private final static QName _ForecastItemMileagePerYear_QNAME = new QName("", "mileagePerYear");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.dat.financeline.services.evaluation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Compare }
     * 
     */
    public Compare createCompare() {
        return new Compare();
    }

    /**
     * Create an instance of {@link Parameters }
     * 
     */
    public Parameters createParameters() {
        return new Parameters();
    }

    /**
     * Create an instance of {@link EquipmentPosition2 }
     * 
     */
    public EquipmentPosition2 createEquipmentPosition2() {
        return new EquipmentPosition2();
    }

    /**
     * Create an instance of {@link Tires }
     * 
     */
    public Tires createTires() {
        return new Tires();
    }

    /**
     * Create an instance of {@link MarketplacePreparation }
     * 
     */
    public MarketplacePreparation createMarketplacePreparation() {
        return new MarketplacePreparation();
    }

    /**
     * Create an instance of {@link Forecast }
     * 
     */
    public Forecast createForecast() {
        return new Forecast();
    }

    /**
     * Create an instance of {@link Vehicle }
     * 
     */
    public Vehicle createVehicle() {
        return new Vehicle();
    }

    /**
     * Create an instance of {@link TradingAdditional }
     * 
     */
    public TradingAdditional createTradingAdditional() {
        return new TradingAdditional();
    }

    /**
     * Create an instance of {@link PlanData }
     * 
     */
    public PlanData createPlanData() {
        return new PlanData();
    }

    /**
     * Create an instance of {@link MaterialPosition }
     * 
     */
    public MaterialPosition createMaterialPosition() {
        return new MaterialPosition();
    }

    /**
     * Create an instance of {@link GetNewVehicleForecastResponse }
     * 
     */
    public GetNewVehicleForecastResponse createGetNewVehicleForecastResponse() {
        return new GetNewVehicleForecastResponse();
    }

    /**
     * Create an instance of {@link GetVehicleTargetDateEvaluationHistoryResponse }
     * 
     */
    public GetVehicleTargetDateEvaluationHistoryResponse createGetVehicleTargetDateEvaluationHistoryResponse() {
        return new GetVehicleTargetDateEvaluationHistoryResponse();
    }

    /**
     * Create an instance of {@link GetVehicleApproximateValueResponse }
     * 
     */
    public GetVehicleApproximateValueResponse createGetVehicleApproximateValueResponse() {
        return new GetVehicleApproximateValueResponse();
    }

    /**
     * Create an instance of {@link GetVehicleEvaluationResponse }
     * 
     */
    public GetVehicleEvaluationResponse createGetVehicleEvaluationResponse() {
        return new GetVehicleEvaluationResponse();
    }

    /**
     * Create an instance of {@link GetUsedVehicleForecastResponse }
     * 
     */
    public GetUsedVehicleForecastResponse createGetUsedVehicleForecastResponse() {
        return new GetUsedVehicleForecastResponse();
    }

    /**
     * Create an instance of {@link GetYearMonthsForVehicleTargetDateEvaluationHistoryResponse }
     * 
     */
    public GetYearMonthsForVehicleTargetDateEvaluationHistoryResponse createGetYearMonthsForVehicleTargetDateEvaluationHistoryResponse() {
        return new GetYearMonthsForVehicleTargetDateEvaluationHistoryResponse();
    }

    /**
     * Create an instance of {@link GetVehicleTargetDateEvaluationHistory }
     * 
     */
    public GetVehicleTargetDateEvaluationHistory createGetVehicleTargetDateEvaluationHistory() {
        return new GetVehicleTargetDateEvaluationHistory();
    }

    /**
     * Create an instance of {@link GetDataCountriesForVehicleEvaluation }
     * 
     */
    public GetDataCountriesForVehicleEvaluation createGetDataCountriesForVehicleEvaluation() {
        return new GetDataCountriesForVehicleEvaluation();
    }

    /**
     * Create an instance of {@link GetRegionsOfCountryResponse }
     * 
     */
    public GetRegionsOfCountryResponse createGetRegionsOfCountryResponse() {
        return new GetRegionsOfCountryResponse();
    }

    /**
     * Create an instance of {@link GetDataCountriesForVehicleTargetDateEvaluationHistory }
     * 
     */
    public GetDataCountriesForVehicleTargetDateEvaluationHistory createGetDataCountriesForVehicleTargetDateEvaluationHistory() {
        return new GetDataCountriesForVehicleTargetDateEvaluationHistory();
    }

    /**
     * Create an instance of {@link ConstructionPeriodSelectionRequest }
     * 
     */
    public ConstructionPeriodSelectionRequest createConstructionPeriodSelectionRequest() {
        return new ConstructionPeriodSelectionRequest();
    }

    /**
     * Create an instance of {@link GetReferenceMileageForVehicleResponse }
     * 
     */
    public GetReferenceMileageForVehicleResponse createGetReferenceMileageForVehicleResponse() {
        return new GetReferenceMileageForVehicleResponse();
    }

    /**
     * Create an instance of {@link GetDataCountriesForUsedVehicleForecastResponse }
     * 
     */
    public GetDataCountriesForUsedVehicleForecastResponse createGetDataCountriesForUsedVehicleForecastResponse() {
        return new GetDataCountriesForUsedVehicleForecastResponse();
    }

    /**
     * Create an instance of {@link PriceFocusSelectionRequest }
     * 
     */
    public PriceFocusSelectionRequest createPriceFocusSelectionRequest() {
        return new PriceFocusSelectionRequest();
    }

    /**
     * Create an instance of {@link GetYearMonthsForVehicleTargetDateEvaluationHistory }
     * 
     */
    public GetYearMonthsForVehicleTargetDateEvaluationHistory createGetYearMonthsForVehicleTargetDateEvaluationHistory() {
        return new GetYearMonthsForVehicleTargetDateEvaluationHistory();
    }

    /**
     * Create an instance of {@link GetDataCountriesForUsedVehicleForecast }
     * 
     */
    public GetDataCountriesForUsedVehicleForecast createGetDataCountriesForUsedVehicleForecast() {
        return new GetDataCountriesForUsedVehicleForecast();
    }

    /**
     * Create an instance of {@link AbstractSelectionRequest }
     * 
     */
    public AbstractSelectionRequest createAbstractSelectionRequest() {
        return new AbstractSelectionRequest();
    }

    /**
     * Create an instance of {@link BasicSelectionRequest }
     * 
     */
    public BasicSelectionRequest createBasicSelectionRequest() {
        return new BasicSelectionRequest();
    }

    /**
     * Create an instance of {@link GetUsedVehicleForecast }
     * 
     */
    public GetUsedVehicleForecast createGetUsedVehicleForecast() {
        return new GetUsedVehicleForecast();
    }

    /**
     * Create an instance of {@link GetDataCountriesForVehicleEvaluationResponse }
     * 
     */
    public GetDataCountriesForVehicleEvaluationResponse createGetDataCountriesForVehicleEvaluationResponse() {
        return new GetDataCountriesForVehicleEvaluationResponse();
    }

    /**
     * Create an instance of {@link GetDataCountriesForVehicleTargetDateEvaluationHistoryResponse }
     * 
     */
    public GetDataCountriesForVehicleTargetDateEvaluationHistoryResponse createGetDataCountriesForVehicleTargetDateEvaluationHistoryResponse() {
        return new GetDataCountriesForVehicleTargetDateEvaluationHistoryResponse();
    }

    /**
     * Create an instance of {@link GetVehicleEvaluation }
     * 
     */
    public GetVehicleEvaluation createGetVehicleEvaluation() {
        return new GetVehicleEvaluation();
    }

    /**
     * Create an instance of {@link GetRegionsOfCountry }
     * 
     */
    public GetRegionsOfCountry createGetRegionsOfCountry() {
        return new GetRegionsOfCountry();
    }

    /**
     * Create an instance of {@link VehicleSelectionRequest }
     * 
     */
    public VehicleSelectionRequest createVehicleSelectionRequest() {
        return new VehicleSelectionRequest();
    }

    /**
     * Create an instance of {@link GetDataCountriesForNewVehicleForecast }
     * 
     */
    public GetDataCountriesForNewVehicleForecast createGetDataCountriesForNewVehicleForecast() {
        return new GetDataCountriesForNewVehicleForecast();
    }

    /**
     * Create an instance of {@link GetDataCountriesForNewVehicleForecastResponse }
     * 
     */
    public GetDataCountriesForNewVehicleForecastResponse createGetDataCountriesForNewVehicleForecastResponse() {
        return new GetDataCountriesForNewVehicleForecastResponse();
    }

    /**
     * Create an instance of {@link GetVehicleApproximateValue }
     * 
     */
    public GetVehicleApproximateValue createGetVehicleApproximateValue() {
        return new GetVehicleApproximateValue();
    }

    /**
     * Create an instance of {@link GetReferenceMileageForVehicle }
     * 
     */
    public GetReferenceMileageForVehicle createGetReferenceMileageForVehicle() {
        return new GetReferenceMileageForVehicle();
    }

    /**
     * Create an instance of {@link GetNewVehicleForecast }
     * 
     */
    public GetNewVehicleForecast createGetNewVehicleForecast() {
        return new GetNewVehicleForecast();
    }

    /**
     * Create an instance of {@link YearMonthsForCountryRequest }
     * 
     */
    public YearMonthsForCountryRequest createYearMonthsForCountryRequest() {
        return new YearMonthsForCountryRequest();
    }

    /**
     * Create an instance of {@link EquipmentPosition }
     * 
     */
    public EquipmentPosition createEquipmentPosition() {
        return new EquipmentPosition();
    }

    /**
     * Create an instance of {@link VehicleHistoricalEvaluationRequest }
     * 
     */
    public VehicleHistoricalEvaluationRequest createVehicleHistoricalEvaluationRequest() {
        return new VehicleHistoricalEvaluationRequest();
    }

    /**
     * Create an instance of {@link Locale }
     * 
     */
    public Locale createLocale() {
        return new Locale();
    }

    /**
     * Create an instance of {@link ManualEquipmentDevaluations }
     * 
     */
    public ManualEquipmentDevaluations createManualEquipmentDevaluations() {
        return new ManualEquipmentDevaluations();
    }

    /**
     * Create an instance of {@link UsedVehicleForecastRequest }
     * 
     */
    public UsedVehicleForecastRequest createUsedVehicleForecastRequest() {
        return new UsedVehicleForecastRequest();
    }

    /**
     * Create an instance of {@link NewVehicleForecastRequest }
     * 
     */
    public NewVehicleForecastRequest createNewVehicleForecastRequest() {
        return new NewVehicleForecastRequest();
    }

    /**
     * Create an instance of {@link ForecastItem }
     * 
     */
    public ForecastItem createForecastItem() {
        return new ForecastItem();
    }

    /**
     * Create an instance of {@link ManualEquipmentDevaluation }
     * 
     */
    public ManualEquipmentDevaluation createManualEquipmentDevaluation() {
        return new ManualEquipmentDevaluation();
    }

    /**
     * Create an instance of {@link VehicleEvaluationRequest }
     * 
     */
    public VehicleEvaluationRequest createVehicleEvaluationRequest() {
        return new VehicleEvaluationRequest();
    }

    /**
     * Create an instance of {@link ReferenceMileageForVehicle }
     * 
     */
    public ReferenceMileageForVehicle createReferenceMileageForVehicle() {
        return new ReferenceMileageForVehicle();
    }

    /**
     * Create an instance of {@link Equipment }
     * 
     */
    public Equipment createEquipment() {
        return new Equipment();
    }

    /**
     * Create an instance of {@link de.dat.financeline.services.evaluation.ForecastItems }
     * 
     */
    public de.dat.financeline.services.evaluation.ForecastItems createForecastItems() {
        return new de.dat.financeline.services.evaluation.ForecastItems();
    }

    /**
     * Create an instance of {@link Condition }
     * 
     */
    public Condition createCondition() {
        return new Condition();
    }

    /**
     * Create an instance of {@link Region }
     * 
     */
    public Region createRegion() {
        return new Region();
    }

    /**
     * Create an instance of {@link VehicleApproximateValueRequest }
     * 
     */
    public VehicleApproximateValueRequest createVehicleApproximateValueRequest() {
        return new VehicleApproximateValueRequest();
    }

    /**
     * Create an instance of {@link AdditionalCostsPosition }
     * 
     */
    public AdditionalCostsPosition createAdditionalCostsPosition() {
        return new AdditionalCostsPosition();
    }

    /**
     * Create an instance of {@link FieldInteger }
     * 
     */
    public FieldInteger createFieldInteger() {
        return new FieldInteger();
    }

    /**
     * Create an instance of {@link FieldString }
     * 
     */
    public FieldString createFieldString() {
        return new FieldString();
    }

    /**
     * Create an instance of {@link FieldDecimal }
     * 
     */
    public FieldDecimal createFieldDecimal() {
        return new FieldDecimal();
    }

    /**
     * Create an instance of {@link FieldBoolean }
     * 
     */
    public FieldBoolean createFieldBoolean() {
        return new FieldBoolean();
    }

    /**
     * Create an instance of {@link IncludedPositions }
     * 
     */
    public IncludedPositions createIncludedPositions() {
        return new IncludedPositions();
    }

    /**
     * Create an instance of {@link IncludedPosition }
     * 
     */
    public IncludedPosition createIncludedPosition() {
        return new IncludedPosition();
    }

    /**
     * Create an instance of {@link DamageManagement }
     * 
     */
    public DamageManagement createDamageManagement() {
        return new DamageManagement();
    }

    /**
     * Create an instance of {@link DamageProcess }
     * 
     */
    public DamageProcess createDamageProcess() {
        return new DamageProcess();
    }

    /**
     * Create an instance of {@link FieldDateTime }
     * 
     */
    public FieldDateTime createFieldDateTime() {
        return new FieldDateTime();
    }

    /**
     * Create an instance of {@link DamageDetail }
     * 
     */
    public DamageDetail createDamageDetail() {
        return new DamageDetail();
    }

    /**
     * Create an instance of {@link InvoiceDetail }
     * 
     */
    public InvoiceDetail createInvoiceDetail() {
        return new InvoiceDetail();
    }

    /**
     * Create an instance of {@link TechInfo }
     * 
     */
    public TechInfo createTechInfo() {
        return new TechInfo();
    }

    /**
     * Create an instance of {@link FillingQuantities }
     * 
     */
    public FillingQuantities createFillingQuantities() {
        return new FillingQuantities();
    }

    /**
     * Create an instance of {@link Fluid }
     * 
     */
    public Fluid createFluid() {
        return new Fluid();
    }

    /**
     * Create an instance of {@link Capacity }
     * 
     */
    public Capacity createCapacity() {
        return new Capacity();
    }

    /**
     * Create an instance of {@link Recommendation }
     * 
     */
    public Recommendation createRecommendation() {
        return new Recommendation();
    }

    /**
     * Create an instance of {@link Usage }
     * 
     */
    public Usage createUsage() {
        return new Usage();
    }

    /**
     * Create an instance of {@link Interval }
     * 
     */
    public Interval createInterval() {
        return new Interval();
    }

    /**
     * Create an instance of {@link FieldString1000 }
     * 
     */
    public FieldString1000 createFieldString1000() {
        return new FieldString1000();
    }

    /**
     * Create an instance of {@link FieldString2 }
     * 
     */
    public FieldString2 createFieldString2() {
        return new FieldString2();
    }

    /**
     * Create an instance of {@link FieldString30 }
     * 
     */
    public FieldString30 createFieldString30() {
        return new FieldString30();
    }

    /**
     * Create an instance of {@link FieldString5 }
     * 
     */
    public FieldString5 createFieldString5() {
        return new FieldString5();
    }

    /**
     * Create an instance of {@link EmissionClassN }
     * 
     */
    public EmissionClassN createEmissionClassN() {
        return new EmissionClassN();
    }

    /**
     * Create an instance of {@link EmissionClassItemN }
     * 
     */
    public EmissionClassItemN createEmissionClassItemN() {
        return new EmissionClassItemN();
    }

    /**
     * Create an instance of {@link FieldString10 }
     * 
     */
    public FieldString10 createFieldString10() {
        return new FieldString10();
    }

    /**
     * Create an instance of {@link VINEquipments }
     * 
     */
    public VINEquipments createVINEquipments() {
        return new VINEquipments();
    }

    /**
     * Create an instance of {@link VINEquipment }
     * 
     */
    public VINEquipment createVINEquipment() {
        return new VINEquipment();
    }

    /**
     * Create an instance of {@link TextItem }
     * 
     */
    public TextItem createTextItem() {
        return new TextItem();
    }

    /**
     * Create an instance of {@link BaseSummaryItaly }
     * 
     */
    public BaseSummaryItaly createBaseSummaryItaly() {
        return new BaseSummaryItaly();
    }

    /**
     * Create an instance of {@link CalcResultsHistory }
     * 
     */
    public CalcResultsHistory createCalcResultsHistory() {
        return new CalcResultsHistory();
    }

    /**
     * Create an instance of {@link CalcResult }
     * 
     */
    public CalcResult createCalcResult() {
        return new CalcResult();
    }

    /**
     * Create an instance of {@link VAT }
     * 
     */
    public VAT createVAT() {
        return new VAT();
    }

    /**
     * Create an instance of {@link Image }
     * 
     */
    public Image createImage() {
        return new Image();
    }

    /**
     * Create an instance of {@link FieldBinary }
     * 
     */
    public FieldBinary createFieldBinary() {
        return new FieldBinary();
    }

    /**
     * Create an instance of {@link FieldString4 }
     * 
     */
    public FieldString4 createFieldString4() {
        return new FieldString4();
    }

    /**
     * Create an instance of {@link FieldString8 }
     * 
     */
    public FieldString8 createFieldString8() {
        return new FieldString8();
    }

    /**
     * Create an instance of {@link DiscountPositions }
     * 
     */
    public DiscountPositions createDiscountPositions() {
        return new DiscountPositions();
    }

    /**
     * Create an instance of {@link DiscountPosition }
     * 
     */
    public DiscountPosition createDiscountPosition() {
        return new DiscountPosition();
    }

    /**
     * Create an instance of {@link Axle }
     * 
     */
    public Axle createAxle() {
        return new Axle();
    }

    /**
     * Create an instance of {@link RepairProcess }
     * 
     */
    public RepairProcess createRepairProcess() {
        return new RepairProcess();
    }

    /**
     * Create an instance of {@link EquipmentGroupItem }
     * 
     */
    public EquipmentGroupItem createEquipmentGroupItem() {
        return new EquipmentGroupItem();
    }

    /**
     * Create an instance of {@link EquipmentList }
     * 
     */
    public EquipmentList createEquipmentList() {
        return new EquipmentList();
    }

    /**
     * Create an instance of {@link EquipmentItem }
     * 
     */
    public EquipmentItem createEquipmentItem() {
        return new EquipmentItem();
    }

    /**
     * Create an instance of {@link EquipmentItemN }
     * 
     */
    public EquipmentItemN createEquipmentItemN() {
        return new EquipmentItemN();
    }

    /**
     * Create an instance of {@link Compare.CompareFlatEquipments }
     * 
     */
    public Compare.CompareFlatEquipments createCompareCompareFlatEquipments() {
        return new Compare.CompareFlatEquipments();
    }

    /**
     * Create an instance of {@link Compare.CompareParameters }
     * 
     */
    public Compare.CompareParameters createCompareCompareParameters() {
        return new Compare.CompareParameters();
    }

    /**
     * Create an instance of {@link DomusExtraCharges }
     * 
     */
    public DomusExtraCharges createDomusExtraCharges() {
        return new DomusExtraCharges();
    }

    /**
     * Create an instance of {@link DomusExtraCharge }
     * 
     */
    public DomusExtraCharge createDomusExtraCharge() {
        return new DomusExtraCharge();
    }

    /**
     * Create an instance of {@link RepairPositions }
     * 
     */
    public RepairPositions createRepairPositions() {
        return new RepairPositions();
    }

    /**
     * Create an instance of {@link RepairPosition }
     * 
     */
    public RepairPosition createRepairPosition() {
        return new RepairPosition();
    }

    /**
     * Create an instance of {@link FieldCharacter }
     * 
     */
    public FieldCharacter createFieldCharacter() {
        return new FieldCharacter();
    }

    /**
     * Create an instance of {@link CompareFlatEquipment }
     * 
     */
    public CompareFlatEquipment createCompareFlatEquipment() {
        return new CompareFlatEquipment();
    }

    /**
     * Create an instance of {@link Parameters.ValueInfluencingFactors }
     * 
     */
    public Parameters.ValueInfluencingFactors createParametersValueInfluencingFactors() {
        return new Parameters.ValueInfluencingFactors();
    }

    /**
     * Create an instance of {@link MetaPosition }
     * 
     */
    public MetaPosition createMetaPosition() {
        return new MetaPosition();
    }

    /**
     * Create an instance of {@link PrivatePolicy }
     * 
     */
    public PrivatePolicy createPrivatePolicy() {
        return new PrivatePolicy();
    }

    /**
     * Create an instance of {@link FieldDate }
     * 
     */
    public FieldDate createFieldDate() {
        return new FieldDate();
    }

    /**
     * Create an instance of {@link Images }
     * 
     */
    public Images createImages() {
        return new Images();
    }

    /**
     * Create an instance of {@link FollowUpBusiness }
     * 
     */
    public FollowUpBusiness createFollowUpBusiness() {
        return new FollowUpBusiness();
    }

    /**
     * Create an instance of {@link MaintenancePositions }
     * 
     */
    public MaintenancePositions createMaintenancePositions() {
        return new MaintenancePositions();
    }

    /**
     * Create an instance of {@link MaintenancePosition }
     * 
     */
    public MaintenancePosition createMaintenancePosition() {
        return new MaintenancePosition();
    }

    /**
     * Create an instance of {@link MaterialPositions }
     * 
     */
    public MaterialPositions createMaterialPositions() {
        return new MaterialPositions();
    }

    /**
     * Create an instance of {@link TotalSummaryItaly }
     * 
     */
    public TotalSummaryItaly createTotalSummaryItaly() {
        return new TotalSummaryItaly();
    }

    /**
     * Create an instance of {@link TotalSummaryItemItaly }
     * 
     */
    public TotalSummaryItemItaly createTotalSummaryItemItaly() {
        return new TotalSummaryItemItaly();
    }

    /**
     * Create an instance of {@link EquipmentPosition2 .ContainedEquipmentPositions }
     * 
     */
    public EquipmentPosition2 .ContainedEquipmentPositions createEquipmentPosition2ContainedEquipmentPositions() {
        return new EquipmentPosition2 .ContainedEquipmentPositions();
    }

    /**
     * Create an instance of {@link PositionItaly }
     * 
     */
    public PositionItaly createPositionItaly() {
        return new PositionItaly();
    }

    /**
     * Create an instance of {@link ClientContactAddresses }
     * 
     */
    public ClientContactAddresses createClientContactAddresses() {
        return new ClientContactAddresses();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link SpotRepairPositions }
     * 
     */
    public SpotRepairPositions createSpotRepairPositions() {
        return new SpotRepairPositions();
    }

    /**
     * Create an instance of {@link LacquerPosition }
     * 
     */
    public LacquerPosition createLacquerPosition() {
        return new LacquerPosition();
    }

    /**
     * Create an instance of {@link MaintenanceInterval }
     * 
     */
    public MaintenanceInterval createMaintenanceInterval() {
        return new MaintenanceInterval();
    }

    /**
     * Create an instance of {@link Tires.Axles }
     * 
     */
    public Tires.Axles createTiresAxles() {
        return new Tires.Axles();
    }

    /**
     * Create an instance of {@link LacquerConstant }
     * 
     */
    public LacquerConstant createLacquerConstant() {
        return new LacquerConstant();
    }

    /**
     * Create an instance of {@link AddonList }
     * 
     */
    public AddonList createAddonList() {
        return new AddonList();
    }

    /**
     * Create an instance of {@link Addon }
     * 
     */
    public Addon createAddon() {
        return new Addon();
    }

    /**
     * Create an instance of {@link WorkSummaryItaly }
     * 
     */
    public WorkSummaryItaly createWorkSummaryItaly() {
        return new WorkSummaryItaly();
    }

    /**
     * Create an instance of {@link WorkSummaryItemItaly }
     * 
     */
    public WorkSummaryItemItaly createWorkSummaryItemItaly() {
        return new WorkSummaryItemItaly();
    }

    /**
     * Create an instance of {@link MarketplacePreparation.MarketplaceAreaList }
     * 
     */
    public MarketplacePreparation.MarketplaceAreaList createMarketplacePreparationMarketplaceAreaList() {
        return new MarketplacePreparation.MarketplaceAreaList();
    }

    /**
     * Create an instance of {@link MarketplacePreparation.MarketplaceManufacturerList }
     * 
     */
    public MarketplacePreparation.MarketplaceManufacturerList createMarketplacePreparationMarketplaceManufacturerList() {
        return new MarketplacePreparation.MarketplaceManufacturerList();
    }

    /**
     * Create an instance of {@link MarketplacePreparation.MarketplaceModelGroupList }
     * 
     */
    public MarketplacePreparation.MarketplaceModelGroupList createMarketplacePreparationMarketplaceModelGroupList() {
        return new MarketplacePreparation.MarketplaceModelGroupList();
    }

    /**
     * Create an instance of {@link MarketplacePreparation.MarketplaceModelList }
     * 
     */
    public MarketplacePreparation.MarketplaceModelList createMarketplacePreparationMarketplaceModelList() {
        return new MarketplacePreparation.MarketplaceModelList();
    }

    /**
     * Create an instance of {@link MarketplacePreparation.MarketplaceVehicleSectionList }
     * 
     */
    public MarketplacePreparation.MarketplaceVehicleSectionList createMarketplacePreparationMarketplaceVehicleSectionList() {
        return new MarketplacePreparation.MarketplaceVehicleSectionList();
    }

    /**
     * Create an instance of {@link MarketplacePreparation.MarketplaceTypeLineList }
     * 
     */
    public MarketplacePreparation.MarketplaceTypeLineList createMarketplacePreparationMarketplaceTypeLineList() {
        return new MarketplacePreparation.MarketplaceTypeLineList();
    }

    /**
     * Create an instance of {@link MarketplacePreparation.MarketplaceFuelConsumptionDataList }
     * 
     */
    public MarketplacePreparation.MarketplaceFuelConsumptionDataList createMarketplacePreparationMarketplaceFuelConsumptionDataList() {
        return new MarketplacePreparation.MarketplaceFuelConsumptionDataList();
    }

    /**
     * Create an instance of {@link MarketplacePreparation.MarketplaceFuelAccordingEnVkVList }
     * 
     */
    public MarketplacePreparation.MarketplaceFuelAccordingEnVkVList createMarketplacePreparationMarketplaceFuelAccordingEnVkVList() {
        return new MarketplacePreparation.MarketplaceFuelAccordingEnVkVList();
    }

    /**
     * Create an instance of {@link MarketplacePreparation.MarketplaceColorInteriorFittingsList }
     * 
     */
    public MarketplacePreparation.MarketplaceColorInteriorFittingsList createMarketplacePreparationMarketplaceColorInteriorFittingsList() {
        return new MarketplacePreparation.MarketplaceColorInteriorFittingsList();
    }

    /**
     * Create an instance of {@link MarketplacePreparation.MarketplaceAccidentalDamageList }
     * 
     */
    public MarketplacePreparation.MarketplaceAccidentalDamageList createMarketplacePreparationMarketplaceAccidentalDamageList() {
        return new MarketplacePreparation.MarketplaceAccidentalDamageList();
    }

    /**
     * Create an instance of {@link MarketplacePreparation.MarketplaceWarrantyList }
     * 
     */
    public MarketplacePreparation.MarketplaceWarrantyList createMarketplacePreparationMarketplaceWarrantyList() {
        return new MarketplacePreparation.MarketplaceWarrantyList();
    }

    /**
     * Create an instance of {@link MarketplacePreparation.MarketplaceEquipmentGroupList }
     * 
     */
    public MarketplacePreparation.MarketplaceEquipmentGroupList createMarketplacePreparationMarketplaceEquipmentGroupList() {
        return new MarketplacePreparation.MarketplaceEquipmentGroupList();
    }

    /**
     * Create an instance of {@link MarketplacePreparation.MarketplaceEquipmentGroupListN }
     * 
     */
    public MarketplacePreparation.MarketplaceEquipmentGroupListN createMarketplacePreparationMarketplaceEquipmentGroupListN() {
        return new MarketplacePreparation.MarketplaceEquipmentGroupListN();
    }

    /**
     * Create an instance of {@link MarketplacePreparation.MPConfigIntroTextList }
     * 
     */
    public MarketplacePreparation.MPConfigIntroTextList createMarketplacePreparationMPConfigIntroTextList() {
        return new MarketplacePreparation.MPConfigIntroTextList();
    }

    /**
     * Create an instance of {@link MarketplacePreparation.MPConfigFinalTextList }
     * 
     */
    public MarketplacePreparation.MPConfigFinalTextList createMarketplacePreparationMPConfigFinalTextList() {
        return new MarketplacePreparation.MPConfigFinalTextList();
    }

    /**
     * Create an instance of {@link RegistrationData }
     * 
     */
    public RegistrationData createRegistrationData() {
        return new RegistrationData();
    }

    /**
     * Create an instance of {@link FieldString9 }
     * 
     */
    public FieldString9 createFieldString9() {
        return new FieldString9();
    }

    /**
     * Create an instance of {@link FieldString6 }
     * 
     */
    public FieldString6 createFieldString6() {
        return new FieldString6();
    }

    /**
     * Create an instance of {@link Sale }
     * 
     */
    public Sale createSale() {
        return new Sale();
    }

    /**
     * Create an instance of {@link MaintenanceIntervals }
     * 
     */
    public MaintenanceIntervals createMaintenanceIntervals() {
        return new MaintenanceIntervals();
    }

    /**
     * Create an instance of {@link Valuation }
     * 
     */
    public Valuation createValuation() {
        return new Valuation();
    }

    /**
     * Create an instance of {@link Condition2 }
     * 
     */
    public Condition2 createCondition2() {
        return new Condition2();
    }

    /**
     * Create an instance of {@link Forecasts }
     * 
     */
    public Forecasts createForecasts() {
        return new Forecasts();
    }

    /**
     * Create an instance of {@link Forecast.ForecastItems }
     * 
     */
    public Forecast.ForecastItems createForecastForecastItems() {
        return new Forecast.ForecastItems();
    }

    /**
     * Create an instance of {@link FieldString3 }
     * 
     */
    public FieldString3 createFieldString3() {
        return new FieldString3();
    }

    /**
     * Create an instance of {@link FieldString17 }
     * 
     */
    public FieldString17 createFieldString17() {
        return new FieldString17();
    }

    /**
     * Create an instance of {@link FieldString15 }
     * 
     */
    public FieldString15 createFieldString15() {
        return new FieldString15();
    }

    /**
     * Create an instance of {@link FieldString4000 }
     * 
     */
    public FieldString4000 createFieldString4000() {
        return new FieldString4000();
    }

    /**
     * Create an instance of {@link FieldString80 }
     * 
     */
    public FieldString80 createFieldString80() {
        return new FieldString80();
    }

    /**
     * Create an instance of {@link Vehicle.KbaNumbersN }
     * 
     */
    public Vehicle.KbaNumbersN createVehicleKbaNumbersN() {
        return new Vehicle.KbaNumbersN();
    }

    /**
     * Create an instance of {@link Vehicle.NationalCodeAustria }
     * 
     */
    public Vehicle.NationalCodeAustria createVehicleNationalCodeAustria() {
        return new Vehicle.NationalCodeAustria();
    }

    /**
     * Create an instance of {@link FieldString40 }
     * 
     */
    public FieldString40 createFieldString40() {
        return new FieldString40();
    }

    /**
     * Create an instance of {@link Vehicle.PaintTypes }
     * 
     */
    public Vehicle.PaintTypes createVehiclePaintTypes() {
        return new Vehicle.PaintTypes();
    }

    /**
     * Create an instance of {@link FieldString50 }
     * 
     */
    public FieldString50 createFieldString50() {
        return new FieldString50();
    }

    /**
     * Create an instance of {@link OriginalPriceInfo }
     * 
     */
    public OriginalPriceInfo createOriginalPriceInfo() {
        return new OriginalPriceInfo();
    }

    /**
     * Create an instance of {@link Engine }
     * 
     */
    public Engine createEngine() {
        return new Engine();
    }

    /**
     * Create an instance of {@link Maintenance }
     * 
     */
    public Maintenance createMaintenance() {
        return new Maintenance();
    }

    /**
     * Create an instance of {@link RunningExpenses }
     * 
     */
    public RunningExpenses createRunningExpenses() {
        return new RunningExpenses();
    }

    /**
     * Create an instance of {@link Equipment2 }
     * 
     */
    public Equipment2 createEquipment2() {
        return new Equipment2();
    }

    /**
     * Create an instance of {@link EquipSequence }
     * 
     */
    public EquipSequence createEquipSequence() {
        return new EquipSequence();
    }

    /**
     * Create an instance of {@link VINResult }
     * 
     */
    public VINResult createVINResult() {
        return new VINResult();
    }

    /**
     * Create an instance of {@link VINECodes }
     * 
     */
    public VINECodes createVINECodes() {
        return new VINECodes();
    }

    /**
     * Create an instance of {@link VINECode }
     * 
     */
    public VINECode createVINECode() {
        return new VINECode();
    }

    /**
     * Create an instance of {@link VINContainers }
     * 
     */
    public VINContainers createVINContainers() {
        return new VINContainers();
    }

    /**
     * Create an instance of {@link VINContainer }
     * 
     */
    public VINContainer createVINContainer() {
        return new VINContainer();
    }

    /**
     * Create an instance of {@link VINColors }
     * 
     */
    public VINColors createVINColors() {
        return new VINColors();
    }

    /**
     * Create an instance of {@link VINColor }
     * 
     */
    public VINColor createVINColor() {
        return new VINColor();
    }

    /**
     * Create an instance of {@link VINVehicle }
     * 
     */
    public VINVehicle createVINVehicle() {
        return new VINVehicle();
    }

    /**
     * Create an instance of {@link VINumber }
     * 
     */
    public VINumber createVINumber() {
        return new VINumber();
    }

    /**
     * Create an instance of {@link Vehicle.UpperBodies }
     * 
     */
    public Vehicle.UpperBodies createVehicleUpperBodies() {
        return new Vehicle.UpperBodies();
    }

    /**
     * Create an instance of {@link DomusVehicleData }
     * 
     */
    public DomusVehicleData createDomusVehicleData() {
        return new DomusVehicleData();
    }

    /**
     * Create an instance of {@link VehicleDataItaly }
     * 
     */
    public VehicleDataItaly createVehicleDataItaly() {
        return new VehicleDataItaly();
    }

    /**
     * Create an instance of {@link MetaPositions }
     * 
     */
    public MetaPositions createMetaPositions() {
        return new MetaPositions();
    }

    /**
     * Create an instance of {@link CompareParameter }
     * 
     */
    public CompareParameter createCompareParameter() {
        return new CompareParameter();
    }

    /**
     * Create an instance of {@link EmailAttachments }
     * 
     */
    public EmailAttachments createEmailAttachments() {
        return new EmailAttachments();
    }

    /**
     * Create an instance of {@link ProcessManagement }
     * 
     */
    public ProcessManagement createProcessManagement() {
        return new ProcessManagement();
    }

    /**
     * Create an instance of {@link CustomDataList }
     * 
     */
    public CustomDataList createCustomDataList() {
        return new CustomDataList();
    }

    /**
     * Create an instance of {@link CustomData }
     * 
     */
    public CustomData createCustomData() {
        return new CustomData();
    }

    /**
     * Create an instance of {@link AdditionalInsuranceData }
     * 
     */
    public AdditionalInsuranceData createAdditionalInsuranceData() {
        return new AdditionalInsuranceData();
    }

    /**
     * Create an instance of {@link Email }
     * 
     */
    public Email createEmail() {
        return new Email();
    }

    /**
     * Create an instance of {@link AdditionalService }
     * 
     */
    public AdditionalService createAdditionalService() {
        return new AdditionalService();
    }

    /**
     * Create an instance of {@link TradingAdditional.SalesOfferList }
     * 
     */
    public TradingAdditional.SalesOfferList createTradingAdditionalSalesOfferList() {
        return new TradingAdditional.SalesOfferList();
    }

    /**
     * Create an instance of {@link ForecastItem2 }
     * 
     */
    public ForecastItem2 createForecastItem2() {
        return new ForecastItem2();
    }

    /**
     * Create an instance of {@link SurchargeSetting }
     * 
     */
    public SurchargeSetting createSurchargeSetting() {
        return new SurchargeSetting();
    }

    /**
     * Create an instance of {@link RiskPositions }
     * 
     */
    public RiskPositions createRiskPositions() {
        return new RiskPositions();
    }

    /**
     * Create an instance of {@link RiskPosition }
     * 
     */
    public RiskPosition createRiskPosition() {
        return new RiskPosition();
    }

    /**
     * Create an instance of {@link Dossiers }
     * 
     */
    public Dossiers createDossiers() {
        return new Dossiers();
    }

    /**
     * Create an instance of {@link Dossier }
     * 
     */
    public Dossier createDossier() {
        return new Dossier();
    }

    /**
     * Create an instance of {@link FieldString12 }
     * 
     */
    public FieldString12 createFieldString12() {
        return new FieldString12();
    }

    /**
     * Create an instance of {@link ImageList }
     * 
     */
    public ImageList createImageList() {
        return new ImageList();
    }

    /**
     * Create an instance of {@link TradingData }
     * 
     */
    public TradingData createTradingData() {
        return new TradingData();
    }

    /**
     * Create an instance of {@link Prospects }
     * 
     */
    public Prospects createProspects() {
        return new Prospects();
    }

    /**
     * Create an instance of {@link RepairCalculation }
     * 
     */
    public RepairCalculation createRepairCalculation() {
        return new RepairCalculation();
    }

    /**
     * Create an instance of {@link RepairWages }
     * 
     */
    public RepairWages createRepairWages() {
        return new RepairWages();
    }

    /**
     * Create an instance of {@link RepairParameters }
     * 
     */
    public RepairParameters createRepairParameters() {
        return new RepairParameters();
    }

    /**
     * Create an instance of {@link LacquerAdjustments }
     * 
     */
    public LacquerAdjustments createLacquerAdjustments() {
        return new LacquerAdjustments();
    }

    /**
     * Create an instance of {@link LacquerAdjustment }
     * 
     */
    public LacquerAdjustment createLacquerAdjustment() {
        return new LacquerAdjustment();
    }

    /**
     * Create an instance of {@link ProcedureRelatedParameters }
     * 
     */
    public ProcedureRelatedParameters createProcedureRelatedParameters() {
        return new ProcedureRelatedParameters();
    }

    /**
     * Create an instance of {@link ProcedureRelatedParameter }
     * 
     */
    public ProcedureRelatedParameter createProcedureRelatedParameter() {
        return new ProcedureRelatedParameter();
    }

    /**
     * Create an instance of {@link CalcResultItaly }
     * 
     */
    public CalcResultItaly createCalcResultItaly() {
        return new CalcResultItaly();
    }

    /**
     * Create an instance of {@link DomusCalcResult }
     * 
     */
    public DomusCalcResult createDomusCalcResult() {
        return new DomusCalcResult();
    }

    /**
     * Create an instance of {@link CalculationSummary }
     * 
     */
    public CalculationSummary createCalculationSummary() {
        return new CalculationSummary();
    }

    /**
     * Create an instance of {@link SurchargeSettings }
     * 
     */
    public SurchargeSettings createSurchargeSettings() {
        return new SurchargeSettings();
    }

    /**
     * Create an instance of {@link RepairOrder }
     * 
     */
    public RepairOrder createRepairOrder() {
        return new RepairOrder();
    }

    /**
     * Create an instance of {@link AdditionalData }
     * 
     */
    public AdditionalData createAdditionalData() {
        return new AdditionalData();
    }

    /**
     * Create an instance of {@link CalculationWages }
     * 
     */
    public CalculationWages createCalculationWages() {
        return new CalculationWages();
    }

    /**
     * Create an instance of {@link CalculationWage }
     * 
     */
    public CalculationWage createCalculationWage() {
        return new CalculationWage();
    }

    /**
     * Create an instance of {@link DATProcessIdCommentList }
     * 
     */
    public DATProcessIdCommentList createDATProcessIdCommentList() {
        return new DATProcessIdCommentList();
    }

    /**
     * Create an instance of {@link DATProcessIdComment }
     * 
     */
    public DATProcessIdComment createDATProcessIdComment() {
        return new DATProcessIdComment();
    }

    /**
     * Create an instance of {@link SparePartPositions }
     * 
     */
    public SparePartPositions createSparePartPositions() {
        return new SparePartPositions();
    }

    /**
     * Create an instance of {@link SparePartPosition }
     * 
     */
    public SparePartPosition createSparePartPosition() {
        return new SparePartPosition();
    }

    /**
     * Create an instance of {@link SpHistPositionsSeq }
     * 
     */
    public SpHistPositionsSeq createSpHistPositionsSeq() {
        return new SpHistPositionsSeq();
    }

    /**
     * Create an instance of {@link Comments }
     * 
     */
    public Comments createComments() {
        return new Comments();
    }

    /**
     * Create an instance of {@link Comment }
     * 
     */
    public Comment createComment() {
        return new Comment();
    }

    /**
     * Create an instance of {@link Attachments }
     * 
     */
    public Attachments createAttachments() {
        return new Attachments();
    }

    /**
     * Create an instance of {@link Attachment }
     * 
     */
    public Attachment createAttachment() {
        return new Attachment();
    }

    /**
     * Create an instance of {@link FieldString20 }
     * 
     */
    public FieldString20 createFieldString20() {
        return new FieldString20();
    }

    /**
     * Create an instance of {@link AdditionalVehicles }
     * 
     */
    public AdditionalVehicles createAdditionalVehicles() {
        return new AdditionalVehicles();
    }

    /**
     * Create an instance of {@link AdditionalVehicle }
     * 
     */
    public AdditionalVehicle createAdditionalVehicle() {
        return new AdditionalVehicle();
    }

    /**
     * Create an instance of {@link AdditionalServices }
     * 
     */
    public AdditionalServices createAdditionalServices() {
        return new AdditionalServices();
    }

    /**
     * Create an instance of {@link TradingActivity }
     * 
     */
    public TradingActivity createTradingActivity() {
        return new TradingActivity();
    }

    /**
     * Create an instance of {@link PlanData.ActualRepairCostList }
     * 
     */
    public PlanData.ActualRepairCostList createPlanDataActualRepairCostList() {
        return new PlanData.ActualRepairCostList();
    }

    /**
     * Create an instance of {@link Purchase }
     * 
     */
    public Purchase createPurchase() {
        return new Purchase();
    }

    /**
     * Create an instance of {@link PriceCalculation }
     * 
     */
    public PriceCalculation createPriceCalculation() {
        return new PriceCalculation();
    }

    /**
     * Create an instance of {@link Admission }
     * 
     */
    public Admission createAdmission() {
        return new Admission();
    }

    /**
     * Create an instance of {@link SalesPreparation }
     * 
     */
    public SalesPreparation createSalesPreparation() {
        return new SalesPreparation();
    }

    /**
     * Create an instance of {@link MarketplaceImageList }
     * 
     */
    public MarketplaceImageList createMarketplaceImageList() {
        return new MarketplaceImageList();
    }

    /**
     * Create an instance of {@link ImageReference }
     * 
     */
    public ImageReference createImageReference() {
        return new ImageReference();
    }

    /**
     * Create an instance of {@link DeductionsPositions }
     * 
     */
    public DeductionsPositions createDeductionsPositions() {
        return new DeductionsPositions();
    }

    /**
     * Create an instance of {@link DeductiblePartsPosition }
     * 
     */
    public DeductiblePartsPosition createDeductiblePartsPosition() {
        return new DeductiblePartsPosition();
    }

    /**
     * Create an instance of {@link LacquerSummaryItaly }
     * 
     */
    public LacquerSummaryItaly createLacquerSummaryItaly() {
        return new LacquerSummaryItaly();
    }

    /**
     * Create an instance of {@link LacquerSummaryItemItaly }
     * 
     */
    public LacquerSummaryItemItaly createLacquerSummaryItemItaly() {
        return new LacquerSummaryItemItaly();
    }

    /**
     * Create an instance of {@link DomusLacquerExtraCharges }
     * 
     */
    public DomusLacquerExtraCharges createDomusLacquerExtraCharges() {
        return new DomusLacquerExtraCharges();
    }

    /**
     * Create an instance of {@link DomusLacquerExtraCharge }
     * 
     */
    public DomusLacquerExtraCharge createDomusLacquerExtraCharge() {
        return new DomusLacquerExtraCharge();
    }

    /**
     * Create an instance of {@link DomusAggregates }
     * 
     */
    public DomusAggregates createDomusAggregates() {
        return new DomusAggregates();
    }

    /**
     * Create an instance of {@link DomusAggregate }
     * 
     */
    public DomusAggregate createDomusAggregate() {
        return new DomusAggregate();
    }

    /**
     * Create an instance of {@link DomusAggregateComponents }
     * 
     */
    public DomusAggregateComponents createDomusAggregateComponents() {
        return new DomusAggregateComponents();
    }

    /**
     * Create an instance of {@link DomusAggregateComponent }
     * 
     */
    public DomusAggregateComponent createDomusAggregateComponent() {
        return new DomusAggregateComponent();
    }

    /**
     * Create an instance of {@link PositionsItaly }
     * 
     */
    public PositionsItaly createPositionsItaly() {
        return new PositionsItaly();
    }

    /**
     * Create an instance of {@link SalesOffer }
     * 
     */
    public SalesOffer createSalesOffer() {
        return new SalesOffer();
    }

    /**
     * Create an instance of {@link BlanketCalculation }
     * 
     */
    public BlanketCalculation createBlanketCalculation() {
        return new BlanketCalculation();
    }

    /**
     * Create an instance of {@link SummariesItaly }
     * 
     */
    public SummariesItaly createSummariesItaly() {
        return new SummariesItaly();
    }

    /**
     * Create an instance of {@link ActualRepairCost }
     * 
     */
    public ActualRepairCost createActualRepairCost() {
        return new ActualRepairCost();
    }

    /**
     * Create an instance of {@link CoolingUnit }
     * 
     */
    public CoolingUnit createCoolingUnit() {
        return new CoolingUnit();
    }

    /**
     * Create an instance of {@link MaterialPosition.SparePartSubPositions }
     * 
     */
    public MaterialPosition.SparePartSubPositions createMaterialPositionSparePartSubPositions() {
        return new MaterialPosition.SparePartSubPositions();
    }

    /**
     * Create an instance of {@link LacquerPositions }
     * 
     */
    public LacquerPositions createLacquerPositions() {
        return new LacquerPositions();
    }

    /**
     * Create an instance of {@link DeductiblePartsPositions }
     * 
     */
    public DeductiblePartsPositions createDeductiblePartsPositions() {
        return new DeductiblePartsPositions();
    }

    /**
     * Create an instance of {@link ValueInfluencingFactor }
     * 
     */
    public ValueInfluencingFactor createValueInfluencingFactor() {
        return new ValueInfluencingFactor();
    }

    /**
     * Create an instance of {@link LacquerMaterialGroupSummary }
     * 
     */
    public LacquerMaterialGroupSummary createLacquerMaterialGroupSummary() {
        return new LacquerMaterialGroupSummary();
    }

    /**
     * Create an instance of {@link UpperBody }
     * 
     */
    public UpperBody createUpperBody() {
        return new UpperBody();
    }

    /**
     * Create an instance of {@link SparePartHistoryPosition }
     * 
     */
    public SparePartHistoryPosition createSparePartHistoryPosition() {
        return new SparePartHistoryPosition();
    }

    /**
     * Create an instance of {@link LacquerCostsSummary }
     * 
     */
    public LacquerCostsSummary createLacquerCostsSummary() {
        return new LacquerCostsSummary();
    }

    /**
     * Create an instance of {@link Legend }
     * 
     */
    public Legend createLegend() {
        return new Legend();
    }

    /**
     * Create an instance of {@link CalcPosReference }
     * 
     */
    public CalcPosReference createCalcPosReference() {
        return new CalcPosReference();
    }

    /**
     * Create an instance of {@link RepairProtocol }
     * 
     */
    public RepairProtocol createRepairProtocol() {
        return new RepairProtocol();
    }

    /**
     * Create an instance of {@link LabourPosition }
     * 
     */
    public LabourPosition createLabourPosition() {
        return new LabourPosition();
    }

    /**
     * Create an instance of {@link LabourPositions }
     * 
     */
    public LabourPositions createLabourPositions() {
        return new LabourPositions();
    }

    /**
     * Create an instance of {@link LacquerMaterialSummary }
     * 
     */
    public LacquerMaterialSummary createLacquerMaterialSummary() {
        return new LacquerMaterialSummary();
    }

    /**
     * Create an instance of {@link CalculationProtocol }
     * 
     */
    public CalculationProtocol createCalculationProtocol() {
        return new CalculationProtocol();
    }

    /**
     * Create an instance of {@link Discount }
     * 
     */
    public Discount createDiscount() {
        return new Discount();
    }

    /**
     * Create an instance of {@link SurchargeDiscountPositions }
     * 
     */
    public SurchargeDiscountPositions createSurchargeDiscountPositions() {
        return new SurchargeDiscountPositions();
    }

    /**
     * Create an instance of {@link SurchargeDiscountPosition }
     * 
     */
    public SurchargeDiscountPosition createSurchargeDiscountPosition() {
        return new SurchargeDiscountPosition();
    }

    /**
     * Create an instance of {@link SparePartsCostsSummary }
     * 
     */
    public SparePartsCostsSummary createSparePartsCostsSummary() {
        return new SparePartsCostsSummary();
    }

    /**
     * Create an instance of {@link DetailBlockSummaryWages }
     * 
     */
    public DetailBlockSummaryWages createDetailBlockSummaryWages() {
        return new DetailBlockSummaryWages();
    }

    /**
     * Create an instance of {@link LacquerMaterialGroupSummarySequence }
     * 
     */
    public LacquerMaterialGroupSummarySequence createLacquerMaterialGroupSummarySequence() {
        return new LacquerMaterialGroupSummarySequence();
    }

    /**
     * Create an instance of {@link FieldString100 }
     * 
     */
    public FieldString100 createFieldString100() {
        return new FieldString100();
    }

    /**
     * Create an instance of {@link DeductionsSummary }
     * 
     */
    public DeductionsSummary createDeductionsSummary() {
        return new DeductionsSummary();
    }

    /**
     * Create an instance of {@link DetailBlockSummary }
     * 
     */
    public DetailBlockSummary createDetailBlockSummary() {
        return new DetailBlockSummary();
    }

    /**
     * Create an instance of {@link AuxiliaryCostsSummary }
     * 
     */
    public AuxiliaryCostsSummary createAuxiliaryCostsSummary() {
        return new AuxiliaryCostsSummary();
    }

    /**
     * Create an instance of {@link Legends }
     * 
     */
    public Legends createLegends() {
        return new Legends();
    }

    /**
     * Create an instance of {@link RepairProcessList }
     * 
     */
    public RepairProcessList createRepairProcessList() {
        return new RepairProcessList();
    }

    /**
     * Create an instance of {@link LacquerConstantSequence }
     * 
     */
    public LacquerConstantSequence createLacquerConstantSequence() {
        return new LacquerConstantSequence();
    }

    /**
     * Create an instance of {@link AdditionalCostsPositions }
     * 
     */
    public AdditionalCostsPositions createAdditionalCostsPositions() {
        return new AdditionalCostsPositions();
    }

    /**
     * Create an instance of {@link LabourCostsSummary }
     * 
     */
    public LabourCostsSummary createLabourCostsSummary() {
        return new LabourCostsSummary();
    }

    /**
     * Create an instance of {@link FieldString60 }
     * 
     */
    public FieldString60 createFieldString60() {
        return new FieldString60();
    }

    /**
     * Create an instance of {@link SurchargeDiscountsSummary }
     * 
     */
    public SurchargeDiscountsSummary createSurchargeDiscountsSummary() {
        return new SurchargeDiscountsSummary();
    }

    /**
     * Create an instance of {@link GetNewVehicleForecastResponse.VXS }
     * 
     */
    public GetNewVehicleForecastResponse.VXS createGetNewVehicleForecastResponseVXS() {
        return new GetNewVehicleForecastResponse.VXS();
    }

    /**
     * Create an instance of {@link GetVehicleTargetDateEvaluationHistoryResponse.VXS }
     * 
     */
    public GetVehicleTargetDateEvaluationHistoryResponse.VXS createGetVehicleTargetDateEvaluationHistoryResponseVXS() {
        return new GetVehicleTargetDateEvaluationHistoryResponse.VXS();
    }

    /**
     * Create an instance of {@link GetVehicleApproximateValueResponse.VXS }
     * 
     */
    public GetVehicleApproximateValueResponse.VXS createGetVehicleApproximateValueResponseVXS() {
        return new GetVehicleApproximateValueResponse.VXS();
    }

    /**
     * Create an instance of {@link GetVehicleEvaluationResponse.VXS }
     * 
     */
    public GetVehicleEvaluationResponse.VXS createGetVehicleEvaluationResponseVXS() {
        return new GetVehicleEvaluationResponse.VXS();
    }

    /**
     * Create an instance of {@link GetUsedVehicleForecastResponse.VXS }
     * 
     */
    public GetUsedVehicleForecastResponse.VXS createGetUsedVehicleForecastResponseVXS() {
        return new GetUsedVehicleForecastResponse.VXS();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstructionPeriodSelectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "ConstructionPeriodSelectionRequest")
    public JAXBElement<ConstructionPeriodSelectionRequest> createConstructionPeriodSelectionRequest(ConstructionPeriodSelectionRequest value) {
        return new JAXBElement<ConstructionPeriodSelectionRequest>(_ConstructionPeriodSelectionRequest_QNAME, ConstructionPeriodSelectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataCountriesForVehicleTargetDateEvaluationHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "getDataCountriesForVehicleTargetDateEvaluationHistory")
    public JAXBElement<GetDataCountriesForVehicleTargetDateEvaluationHistory> createGetDataCountriesForVehicleTargetDateEvaluationHistory(GetDataCountriesForVehicleTargetDateEvaluationHistory value) {
        return new JAXBElement<GetDataCountriesForVehicleTargetDateEvaluationHistory>(_GetDataCountriesForVehicleTargetDateEvaluationHistory_QNAME, GetDataCountriesForVehicleTargetDateEvaluationHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRegionsOfCountryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "getRegionsOfCountryResponse")
    public JAXBElement<GetRegionsOfCountryResponse> createGetRegionsOfCountryResponse(GetRegionsOfCountryResponse value) {
        return new JAXBElement<GetRegionsOfCountryResponse>(_GetRegionsOfCountryResponse_QNAME, GetRegionsOfCountryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataCountriesForVehicleEvaluation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "getDataCountriesForVehicleEvaluation")
    public JAXBElement<GetDataCountriesForVehicleEvaluation> createGetDataCountriesForVehicleEvaluation(GetDataCountriesForVehicleEvaluation value) {
        return new JAXBElement<GetDataCountriesForVehicleEvaluation>(_GetDataCountriesForVehicleEvaluation_QNAME, GetDataCountriesForVehicleEvaluation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetYearMonthsForVehicleTargetDateEvaluationHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "getYearMonthsForVehicleTargetDateEvaluationHistoryResponse")
    public JAXBElement<GetYearMonthsForVehicleTargetDateEvaluationHistoryResponse> createGetYearMonthsForVehicleTargetDateEvaluationHistoryResponse(GetYearMonthsForVehicleTargetDateEvaluationHistoryResponse value) {
        return new JAXBElement<GetYearMonthsForVehicleTargetDateEvaluationHistoryResponse>(_GetYearMonthsForVehicleTargetDateEvaluationHistoryResponse_QNAME, GetYearMonthsForVehicleTargetDateEvaluationHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVehicleTargetDateEvaluationHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "getVehicleTargetDateEvaluationHistory")
    public JAXBElement<GetVehicleTargetDateEvaluationHistory> createGetVehicleTargetDateEvaluationHistory(GetVehicleTargetDateEvaluationHistory value) {
        return new JAXBElement<GetVehicleTargetDateEvaluationHistory>(_GetVehicleTargetDateEvaluationHistory_QNAME, GetVehicleTargetDateEvaluationHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsedVehicleForecastResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "getUsedVehicleForecastResponse")
    public JAXBElement<GetUsedVehicleForecastResponse> createGetUsedVehicleForecastResponse(GetUsedVehicleForecastResponse value) {
        return new JAXBElement<GetUsedVehicleForecastResponse>(_GetUsedVehicleForecastResponse_QNAME, GetUsedVehicleForecastResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataCountriesForUsedVehicleForecast }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "getDataCountriesForUsedVehicleForecast")
    public JAXBElement<GetDataCountriesForUsedVehicleForecast> createGetDataCountriesForUsedVehicleForecast(GetDataCountriesForUsedVehicleForecast value) {
        return new JAXBElement<GetDataCountriesForUsedVehicleForecast>(_GetDataCountriesForUsedVehicleForecast_QNAME, GetDataCountriesForUsedVehicleForecast.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVehicleApproximateValueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "getVehicleApproximateValueResponse")
    public JAXBElement<GetVehicleApproximateValueResponse> createGetVehicleApproximateValueResponse(GetVehicleApproximateValueResponse value) {
        return new JAXBElement<GetVehicleApproximateValueResponse>(_GetVehicleApproximateValueResponse_QNAME, GetVehicleApproximateValueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetYearMonthsForVehicleTargetDateEvaluationHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "getYearMonthsForVehicleTargetDateEvaluationHistory")
    public JAXBElement<GetYearMonthsForVehicleTargetDateEvaluationHistory> createGetYearMonthsForVehicleTargetDateEvaluationHistory(GetYearMonthsForVehicleTargetDateEvaluationHistory value) {
        return new JAXBElement<GetYearMonthsForVehicleTargetDateEvaluationHistory>(_GetYearMonthsForVehicleTargetDateEvaluationHistory_QNAME, GetYearMonthsForVehicleTargetDateEvaluationHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceFocusSelectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "PriceFocusSelectionRequest")
    public JAXBElement<PriceFocusSelectionRequest> createPriceFocusSelectionRequest(PriceFocusSelectionRequest value) {
        return new JAXBElement<PriceFocusSelectionRequest>(_PriceFocusSelectionRequest_QNAME, PriceFocusSelectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataCountriesForUsedVehicleForecastResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "getDataCountriesForUsedVehicleForecastResponse")
    public JAXBElement<GetDataCountriesForUsedVehicleForecastResponse> createGetDataCountriesForUsedVehicleForecastResponse(GetDataCountriesForUsedVehicleForecastResponse value) {
        return new JAXBElement<GetDataCountriesForUsedVehicleForecastResponse>(_GetDataCountriesForUsedVehicleForecastResponse_QNAME, GetDataCountriesForUsedVehicleForecastResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReferenceMileageForVehicleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "getReferenceMileageForVehicleResponse")
    public JAXBElement<GetReferenceMileageForVehicleResponse> createGetReferenceMileageForVehicleResponse(GetReferenceMileageForVehicleResponse value) {
        return new JAXBElement<GetReferenceMileageForVehicleResponse>(_GetReferenceMileageForVehicleResponse_QNAME, GetReferenceMileageForVehicleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVehicleEvaluationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "getVehicleEvaluationResponse")
    public JAXBElement<GetVehicleEvaluationResponse> createGetVehicleEvaluationResponse(GetVehicleEvaluationResponse value) {
        return new JAXBElement<GetVehicleEvaluationResponse>(_GetVehicleEvaluationResponse_QNAME, GetVehicleEvaluationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVehicleEvaluation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "getVehicleEvaluation")
    public JAXBElement<GetVehicleEvaluation> createGetVehicleEvaluation(GetVehicleEvaluation value) {
        return new JAXBElement<GetVehicleEvaluation>(_GetVehicleEvaluation_QNAME, GetVehicleEvaluation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataCountriesForVehicleEvaluationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "getDataCountriesForVehicleEvaluationResponse")
    public JAXBElement<GetDataCountriesForVehicleEvaluationResponse> createGetDataCountriesForVehicleEvaluationResponse(GetDataCountriesForVehicleEvaluationResponse value) {
        return new JAXBElement<GetDataCountriesForVehicleEvaluationResponse>(_GetDataCountriesForVehicleEvaluationResponse_QNAME, GetDataCountriesForVehicleEvaluationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataCountriesForVehicleTargetDateEvaluationHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "getDataCountriesForVehicleTargetDateEvaluationHistoryResponse")
    public JAXBElement<GetDataCountriesForVehicleTargetDateEvaluationHistoryResponse> createGetDataCountriesForVehicleTargetDateEvaluationHistoryResponse(GetDataCountriesForVehicleTargetDateEvaluationHistoryResponse value) {
        return new JAXBElement<GetDataCountriesForVehicleTargetDateEvaluationHistoryResponse>(_GetDataCountriesForVehicleTargetDateEvaluationHistoryResponse_QNAME, GetDataCountriesForVehicleTargetDateEvaluationHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasicSelectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "BaseSelectionRequest")
    public JAXBElement<BasicSelectionRequest> createBaseSelectionRequest(BasicSelectionRequest value) {
        return new JAXBElement<BasicSelectionRequest>(_BaseSelectionRequest_QNAME, BasicSelectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsedVehicleForecast }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "getUsedVehicleForecast")
    public JAXBElement<GetUsedVehicleForecast> createGetUsedVehicleForecast(GetUsedVehicleForecast value) {
        return new JAXBElement<GetUsedVehicleForecast>(_GetUsedVehicleForecast_QNAME, GetUsedVehicleForecast.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractSelectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "abstractSelectionRequest")
    public JAXBElement<AbstractSelectionRequest> createAbstractSelectionRequest(AbstractSelectionRequest value) {
        return new JAXBElement<AbstractSelectionRequest>(_AbstractSelectionRequest_QNAME, AbstractSelectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVehicleTargetDateEvaluationHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "getVehicleTargetDateEvaluationHistoryResponse")
    public JAXBElement<GetVehicleTargetDateEvaluationHistoryResponse> createGetVehicleTargetDateEvaluationHistoryResponse(GetVehicleTargetDateEvaluationHistoryResponse value) {
        return new JAXBElement<GetVehicleTargetDateEvaluationHistoryResponse>(_GetVehicleTargetDateEvaluationHistoryResponse_QNAME, GetVehicleTargetDateEvaluationHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearMonthsForCountryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "YearMonthsForCountryRequest")
    public JAXBElement<YearMonthsForCountryRequest> createYearMonthsForCountryRequest(YearMonthsForCountryRequest value) {
        return new JAXBElement<YearMonthsForCountryRequest>(_YearMonthsForCountryRequest_QNAME, YearMonthsForCountryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNewVehicleForecastResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "getNewVehicleForecastResponse")
    public JAXBElement<GetNewVehicleForecastResponse> createGetNewVehicleForecastResponse(GetNewVehicleForecastResponse value) {
        return new JAXBElement<GetNewVehicleForecastResponse>(_GetNewVehicleForecastResponse_QNAME, GetNewVehicleForecastResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNewVehicleForecast }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "getNewVehicleForecast")
    public JAXBElement<GetNewVehicleForecast> createGetNewVehicleForecast(GetNewVehicleForecast value) {
        return new JAXBElement<GetNewVehicleForecast>(_GetNewVehicleForecast_QNAME, GetNewVehicleForecast.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReferenceMileageForVehicle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "getReferenceMileageForVehicle")
    public JAXBElement<GetReferenceMileageForVehicle> createGetReferenceMileageForVehicle(GetReferenceMileageForVehicle value) {
        return new JAXBElement<GetReferenceMileageForVehicle>(_GetReferenceMileageForVehicle_QNAME, GetReferenceMileageForVehicle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVehicleApproximateValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "getVehicleApproximateValue")
    public JAXBElement<GetVehicleApproximateValue> createGetVehicleApproximateValue(GetVehicleApproximateValue value) {
        return new JAXBElement<GetVehicleApproximateValue>(_GetVehicleApproximateValue_QNAME, GetVehicleApproximateValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataCountriesForNewVehicleForecast }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "getDataCountriesForNewVehicleForecast")
    public JAXBElement<GetDataCountriesForNewVehicleForecast> createGetDataCountriesForNewVehicleForecast(GetDataCountriesForNewVehicleForecast value) {
        return new JAXBElement<GetDataCountriesForNewVehicleForecast>(_GetDataCountriesForNewVehicleForecast_QNAME, GetDataCountriesForNewVehicleForecast.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataCountriesForNewVehicleForecastResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "getDataCountriesForNewVehicleForecastResponse")
    public JAXBElement<GetDataCountriesForNewVehicleForecastResponse> createGetDataCountriesForNewVehicleForecastResponse(GetDataCountriesForNewVehicleForecastResponse value) {
        return new JAXBElement<GetDataCountriesForNewVehicleForecastResponse>(_GetDataCountriesForNewVehicleForecastResponse_QNAME, GetDataCountriesForNewVehicleForecastResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRegionsOfCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "getRegionsOfCountry")
    public JAXBElement<GetRegionsOfCountry> createGetRegionsOfCountry(GetRegionsOfCountry value) {
        return new JAXBElement<GetRegionsOfCountry>(_GetRegionsOfCountry_QNAME, GetRegionsOfCountry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleSelectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Evaluation", name = "vehicleSelectionRequest")
    public JAXBElement<VehicleSelectionRequest> createVehicleSelectionRequest(VehicleSelectionRequest value) {
        return new JAXBElement<VehicleSelectionRequest>(_VehicleSelectionRequest_QNAME, VehicleSelectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "mileageType", scope = NewVehicleForecastRequest.class)
    public JAXBElement<String> createNewVehicleForecastRequestMileageType(String value) {
        return new JAXBElement<String>(_NewVehicleForecastRequestMileageType_QNAME, String.class, NewVehicleForecastRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ExternalId", scope = AbstractEvaluationRequest.class)
    public JAXBElement<String> createAbstractEvaluationRequestExternalId(String value) {
        return new JAXBElement<String>(_AbstractEvaluationRequestExternalId_QNAME, String.class, AbstractEvaluationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vatType", scope = VehicleApproximateValueRequest.class)
    public JAXBElement<String> createVehicleApproximateValueRequestVatType(String value) {
        return new JAXBElement<String>(_VehicleApproximateValueRequestVatType_QNAME, String.class, VehicleApproximateValueRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "number", scope = Region.class)
    public JAXBElement<Integer> createRegionNumber(Integer value) {
        return new JAXBElement<Integer>(_RegionNumber_QNAME, Integer.class, Region.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = Region.class)
    public JAXBElement<String> createRegionName(String value) {
        return new JAXBElement<String>(_RegionName_QNAME, String.class, Region.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "constructionTimeFrom", scope = BasicSelectionRequest.class)
    public JAXBElement<Integer> createBasicSelectionRequestConstructionTimeFrom(Integer value) {
        return new JAXBElement<Integer>(_BasicSelectionRequestConstructionTimeFrom_QNAME, Integer.class, BasicSelectionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "constructionTimeTo", scope = BasicSelectionRequest.class)
    public JAXBElement<Integer> createBasicSelectionRequestConstructionTimeTo(Integer value) {
        return new JAXBElement<Integer>(_BasicSelectionRequestConstructionTimeTo_QNAME, Integer.class, BasicSelectionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "increaseInValue", scope = Condition.class)
    public JAXBElement<BigDecimal> createConditionIncreaseInValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ConditionIncreaseInValue_QNAME, BigDecimal.class, Condition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "accidentDamage", scope = Condition.class)
    public JAXBElement<String> createConditionAccidentDamage(String value) {
        return new JAXBElement<String>(_ConditionAccidentDamage_QNAME, String.class, Condition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tiresUnmountedValue", scope = Condition.class)
    public JAXBElement<BigDecimal> createConditionTiresUnmountedValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ConditionTiresUnmountedValue_QNAME, BigDecimal.class, Condition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ownerCorrectionPercent", scope = Condition.class)
    public JAXBElement<BigDecimal> createConditionOwnerCorrectionPercent(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ConditionOwnerCorrectionPercent_QNAME, BigDecimal.class, Condition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "repairCosts", scope = Condition.class)
    public JAXBElement<BigDecimal> createConditionRepairCosts(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ConditionRepairCosts_QNAME, BigDecimal.class, Condition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "numberOfOwners", scope = Condition.class)
    public JAXBElement<Integer> createConditionNumberOfOwners(Integer value) {
        return new JAXBElement<Integer>(_ConditionNumberOfOwners_QNAME, Integer.class, Condition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "decreaseInValue", scope = Condition.class)
    public JAXBElement<BigDecimal> createConditionDecreaseInValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ConditionDecreaseInValue_QNAME, BigDecimal.class, Condition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tiresMountedValue", scope = Condition.class)
    public JAXBElement<BigDecimal> createConditionTiresMountedValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ConditionTiresMountedValue_QNAME, BigDecimal.class, Condition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "correctionFactorPercent", scope = Condition.class)
    public JAXBElement<BigDecimal> createConditionCorrectionFactorPercent(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ConditionCorrectionFactorPercent_QNAME, BigDecimal.class, Condition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Condition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "condition", scope = VehicleEvaluationRequest.class)
    public JAXBElement<Condition> createVehicleEvaluationRequestCondition(Condition value) {
        return new JAXBElement<Condition>(_VehicleEvaluationRequestCondition_QNAME, Condition.class, VehicleEvaluationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vatType", scope = VehicleEvaluationRequest.class)
    public JAXBElement<String> createVehicleEvaluationRequestVatType(String value) {
        return new JAXBElement<String>(_VehicleApproximateValueRequestVatType_QNAME, String.class, VehicleEvaluationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "regionNo", scope = VehicleEvaluationRequest.class)
    public JAXBElement<Integer> createVehicleEvaluationRequestRegionNo(Integer value) {
        return new JAXBElement<Integer>(_VehicleEvaluationRequestRegionNo_QNAME, Integer.class, VehicleEvaluationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "mileageTotal", scope = ForecastItem.class)
    public JAXBElement<Long> createForecastItemMileageTotal(Long value) {
        return new JAXBElement<Long>(_ForecastItemMileageTotal_QNAME, Long.class, ForecastItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "mileagePerYear", scope = ForecastItem.class)
    public JAXBElement<Long> createForecastItemMileagePerYear(Long value) {
        return new JAXBElement<Long>(_ForecastItemMileagePerYear_QNAME, Long.class, ForecastItem.class, value);
    }

}
