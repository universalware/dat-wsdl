
package de.dat.myclaim.soap.valuationservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.dat.myclaim.soap.valuationservice package. 
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

    private final static QName _CreateValuationResponse_QNAME = new QName("http://www.dat.eu/myClaim/soap/v2/ValuationService", "createValuationResponse");
    private final static QName _InternalServiceDataExchange_QNAME = new QName("http://www.dat.eu/myClaim/soap/v2/ValuationService", "internalServiceDataExchange");
    private final static QName _InternalServiceDataExchangeResponse_QNAME = new QName("http://www.dat.eu/myClaim/soap/v2/ValuationService", "internalServiceDataExchangeResponse");
    private final static QName _GetRegionsOfCountryResponse_QNAME = new QName("http://www.dat.eu/myClaim/soap/v2/ValuationService", "getRegionsOfCountryResponse");
    private final static QName _ResetValuation2Default_QNAME = new QName("http://www.dat.eu/myClaim/soap/v2/ValuationService", "resetValuation2default");
    private final static QName _ChangeValuation_QNAME = new QName("http://www.dat.eu/myClaim/soap/v2/ValuationService", "changeValuation");
    private final static QName _ValidationException_QNAME = new QName("http://www.dat.eu/myClaim/soap/v2/ValuationService", "ValidationException");
    private final static QName _DoValuationInMemoryResponse_QNAME = new QName("http://www.dat.eu/myClaim/soap/v2/ValuationService", "doValuationInMemoryResponse");
    private final static QName _AbstractSelectionRequest_QNAME = new QName("http://www.dat.eu/myClaim/soap/v2/ValuationService", "abstractSelectionRequest");
    private final static QName _CreateValuation_QNAME = new QName("http://www.dat.eu/myClaim/soap/v2/ValuationService", "createValuation");
    private final static QName _GetValuationResponse_QNAME = new QName("http://www.dat.eu/myClaim/soap/v2/ValuationService", "getValuationResponse");
    private final static QName _ResetValuation2DefaultResponse_QNAME = new QName("http://www.dat.eu/myClaim/soap/v2/ValuationService", "resetValuation2defaultResponse");
    private final static QName _YearMonthsForCountryRequest_QNAME = new QName("http://www.dat.eu/myClaim/soap/v2/ValuationService", "YearMonthsForCountryRequest");
    private final static QName _ChangeValuationResponse_QNAME = new QName("http://www.dat.eu/myClaim/soap/v2/ValuationService", "changeValuationResponse");
    private final static QName _GetRegionsOfCountry_QNAME = new QName("http://www.dat.eu/myClaim/soap/v2/ValuationService", "getRegionsOfCountry");
    private final static QName _DoValuationInMemory_QNAME = new QName("http://www.dat.eu/myClaim/soap/v2/ValuationService", "doValuationInMemory");
    private final static QName _GetValuation_QNAME = new QName("http://www.dat.eu/myClaim/soap/v2/ValuationService", "getValuation");
    private final static QName _RegionNumber_QNAME = new QName("", "number");
    private final static QName _RegionName_QNAME = new QName("", "name");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.dat.myclaim.soap.valuationservice
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
     * Create an instance of {@link EquipmentPosition }
     * 
     */
    public EquipmentPosition createEquipmentPosition() {
        return new EquipmentPosition();
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
     * Create an instance of {@link CreateValuation }
     * 
     */
    public CreateValuation createCreateValuation() {
        return new CreateValuation();
    }

    /**
     * Create an instance of {@link CreateValuation.TemplateData }
     * 
     */
    public CreateValuation.TemplateData createCreateValuationTemplateData() {
        return new CreateValuation.TemplateData();
    }

    /**
     * Create an instance of {@link ResetValuation2DefaultResponse }
     * 
     */
    public ResetValuation2DefaultResponse createResetValuation2DefaultResponse() {
        return new ResetValuation2DefaultResponse();
    }

    /**
     * Create an instance of {@link GetValuationResponse }
     * 
     */
    public GetValuationResponse createGetValuationResponse() {
        return new GetValuationResponse();
    }

    /**
     * Create an instance of {@link ChangeValuationResponse }
     * 
     */
    public ChangeValuationResponse createChangeValuationResponse() {
        return new ChangeValuationResponse();
    }

    /**
     * Create an instance of {@link CreateValuationResponse }
     * 
     */
    public CreateValuationResponse createCreateValuationResponse() {
        return new CreateValuationResponse();
    }

    /**
     * Create an instance of {@link DoValuationInMemoryResponse }
     * 
     */
    public DoValuationInMemoryResponse createDoValuationInMemoryResponse() {
        return new DoValuationInMemoryResponse();
    }

    /**
     * Create an instance of {@link ChangeValuation }
     * 
     */
    public ChangeValuation createChangeValuation() {
        return new ChangeValuation();
    }

    /**
     * Create an instance of {@link ValidationException }
     * 
     */
    public ValidationException createValidationException() {
        return new ValidationException();
    }

    /**
     * Create an instance of {@link AbstractSelectionRequest }
     * 
     */
    public AbstractSelectionRequest createAbstractSelectionRequest() {
        return new AbstractSelectionRequest();
    }

    /**
     * Create an instance of {@link InternalServiceDataExchange }
     * 
     */
    public InternalServiceDataExchange createInternalServiceDataExchange() {
        return new InternalServiceDataExchange();
    }

    /**
     * Create an instance of {@link InternalServiceDataExchangeResponse }
     * 
     */
    public InternalServiceDataExchangeResponse createInternalServiceDataExchangeResponse() {
        return new InternalServiceDataExchangeResponse();
    }

    /**
     * Create an instance of {@link GetRegionsOfCountryResponse }
     * 
     */
    public GetRegionsOfCountryResponse createGetRegionsOfCountryResponse() {
        return new GetRegionsOfCountryResponse();
    }

    /**
     * Create an instance of {@link ResetValuation2Default }
     * 
     */
    public ResetValuation2Default createResetValuation2Default() {
        return new ResetValuation2Default();
    }

    /**
     * Create an instance of {@link GetRegionsOfCountry }
     * 
     */
    public GetRegionsOfCountry createGetRegionsOfCountry() {
        return new GetRegionsOfCountry();
    }

    /**
     * Create an instance of {@link DoValuationInMemory }
     * 
     */
    public DoValuationInMemory createDoValuationInMemory() {
        return new DoValuationInMemory();
    }

    /**
     * Create an instance of {@link GetValuation }
     * 
     */
    public GetValuation createGetValuation() {
        return new GetValuation();
    }

    /**
     * Create an instance of {@link YearMonthsForCountryRequest }
     * 
     */
    public YearMonthsForCountryRequest createYearMonthsForCountryRequest() {
        return new YearMonthsForCountryRequest();
    }

    /**
     * Create an instance of {@link Locale }
     * 
     */
    public Locale createLocale() {
        return new Locale();
    }

    /**
     * Create an instance of {@link Region }
     * 
     */
    public Region createRegion() {
        return new Region();
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
     * Create an instance of {@link EquipmentPosition.ContainedEquipmentPositions }
     * 
     */
    public EquipmentPosition.ContainedEquipmentPositions createEquipmentPositionContainedEquipmentPositions() {
        return new EquipmentPosition.ContainedEquipmentPositions();
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
     * Create an instance of {@link Condition }
     * 
     */
    public Condition createCondition() {
        return new Condition();
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
     * Create an instance of {@link Equipment }
     * 
     */
    public Equipment createEquipment() {
        return new Equipment();
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
     * Create an instance of {@link ForecastItem }
     * 
     */
    public ForecastItem createForecastItem() {
        return new ForecastItem();
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
     * Create an instance of {@link PriceCalculation }
     * 
     */
    public PriceCalculation createPriceCalculation() {
        return new PriceCalculation();
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
     * Create an instance of {@link AdditionalServices }
     * 
     */
    public AdditionalServices createAdditionalServices() {
        return new AdditionalServices();
    }

    /**
     * Create an instance of {@link ImageList }
     * 
     */
    public ImageList createImageList() {
        return new ImageList();
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
     * Create an instance of {@link CalculationWage }
     * 
     */
    public CalculationWage createCalculationWage() {
        return new CalculationWage();
    }

    /**
     * Create an instance of {@link SalesOffer }
     * 
     */
    public SalesOffer createSalesOffer() {
        return new SalesOffer();
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
     * Create an instance of {@link BlanketCalculation }
     * 
     */
    public BlanketCalculation createBlanketCalculation() {
        return new BlanketCalculation();
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
     * Create an instance of {@link SummariesItaly }
     * 
     */
    public SummariesItaly createSummariesItaly() {
        return new SummariesItaly();
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
     * Create an instance of {@link PlanData.ActualRepairCostList }
     * 
     */
    public PlanData.ActualRepairCostList createPlanDataActualRepairCostList() {
        return new PlanData.ActualRepairCostList();
    }

    /**
     * Create an instance of {@link ActualRepairCost }
     * 
     */
    public ActualRepairCost createActualRepairCost() {
        return new ActualRepairCost();
    }

    /**
     * Create an instance of {@link AdditionalVehicle }
     * 
     */
    public AdditionalVehicle createAdditionalVehicle() {
        return new AdditionalVehicle();
    }

    /**
     * Create an instance of {@link FieldString12 }
     * 
     */
    public FieldString12 createFieldString12() {
        return new FieldString12();
    }

    /**
     * Create an instance of {@link TradingData }
     * 
     */
    public TradingData createTradingData() {
        return new TradingData();
    }

    /**
     * Create an instance of {@link RepairOrder }
     * 
     */
    public RepairOrder createRepairOrder() {
        return new RepairOrder();
    }

    /**
     * Create an instance of {@link SparePartPositions }
     * 
     */
    public SparePartPositions createSparePartPositions() {
        return new SparePartPositions();
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
     * Create an instance of {@link CoolingUnit }
     * 
     */
    public CoolingUnit createCoolingUnit() {
        return new CoolingUnit();
    }

    /**
     * Create an instance of {@link AdditionalVehicles }
     * 
     */
    public AdditionalVehicles createAdditionalVehicles() {
        return new AdditionalVehicles();
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
     * Create an instance of {@link Dossier }
     * 
     */
    public Dossier createDossier() {
        return new Dossier();
    }

    /**
     * Create an instance of {@link TradingActivity }
     * 
     */
    public TradingActivity createTradingActivity() {
        return new TradingActivity();
    }

    /**
     * Create an instance of {@link Purchase }
     * 
     */
    public Purchase createPurchase() {
        return new Purchase();
    }

    /**
     * Create an instance of {@link Admission }
     * 
     */
    public Admission createAdmission() {
        return new Admission();
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
     * Create an instance of {@link CreateValuation.TemplateData.Entry }
     * 
     */
    public CreateValuation.TemplateData.Entry createCreateValuationTemplateDataEntry() {
        return new CreateValuation.TemplateData.Entry();
    }

    /**
     * Create an instance of {@link ResetValuation2DefaultResponse.VXS }
     * 
     */
    public ResetValuation2DefaultResponse.VXS createResetValuation2DefaultResponseVXS() {
        return new ResetValuation2DefaultResponse.VXS();
    }

    /**
     * Create an instance of {@link GetValuationResponse.VXS }
     * 
     */
    public GetValuationResponse.VXS createGetValuationResponseVXS() {
        return new GetValuationResponse.VXS();
    }

    /**
     * Create an instance of {@link ChangeValuationResponse.VXS }
     * 
     */
    public ChangeValuationResponse.VXS createChangeValuationResponseVXS() {
        return new ChangeValuationResponse.VXS();
    }

    /**
     * Create an instance of {@link CreateValuationResponse.VXS }
     * 
     */
    public CreateValuationResponse.VXS createCreateValuationResponseVXS() {
        return new CreateValuationResponse.VXS();
    }

    /**
     * Create an instance of {@link DoValuationInMemoryResponse.VXS }
     * 
     */
    public DoValuationInMemoryResponse.VXS createDoValuationInMemoryResponseVXS() {
        return new DoValuationInMemoryResponse.VXS();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateValuationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dat.eu/myClaim/soap/v2/ValuationService", name = "createValuationResponse")
    public JAXBElement<CreateValuationResponse> createCreateValuationResponse(CreateValuationResponse value) {
        return new JAXBElement<CreateValuationResponse>(_CreateValuationResponse_QNAME, CreateValuationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternalServiceDataExchange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dat.eu/myClaim/soap/v2/ValuationService", name = "internalServiceDataExchange")
    public JAXBElement<InternalServiceDataExchange> createInternalServiceDataExchange(InternalServiceDataExchange value) {
        return new JAXBElement<InternalServiceDataExchange>(_InternalServiceDataExchange_QNAME, InternalServiceDataExchange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternalServiceDataExchangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dat.eu/myClaim/soap/v2/ValuationService", name = "internalServiceDataExchangeResponse")
    public JAXBElement<InternalServiceDataExchangeResponse> createInternalServiceDataExchangeResponse(InternalServiceDataExchangeResponse value) {
        return new JAXBElement<InternalServiceDataExchangeResponse>(_InternalServiceDataExchangeResponse_QNAME, InternalServiceDataExchangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRegionsOfCountryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dat.eu/myClaim/soap/v2/ValuationService", name = "getRegionsOfCountryResponse")
    public JAXBElement<GetRegionsOfCountryResponse> createGetRegionsOfCountryResponse(GetRegionsOfCountryResponse value) {
        return new JAXBElement<GetRegionsOfCountryResponse>(_GetRegionsOfCountryResponse_QNAME, GetRegionsOfCountryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetValuation2Default }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dat.eu/myClaim/soap/v2/ValuationService", name = "resetValuation2default")
    public JAXBElement<ResetValuation2Default> createResetValuation2Default(ResetValuation2Default value) {
        return new JAXBElement<ResetValuation2Default>(_ResetValuation2Default_QNAME, ResetValuation2Default.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeValuation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dat.eu/myClaim/soap/v2/ValuationService", name = "changeValuation")
    public JAXBElement<ChangeValuation> createChangeValuation(ChangeValuation value) {
        return new JAXBElement<ChangeValuation>(_ChangeValuation_QNAME, ChangeValuation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dat.eu/myClaim/soap/v2/ValuationService", name = "ValidationException")
    public JAXBElement<ValidationException> createValidationException(ValidationException value) {
        return new JAXBElement<ValidationException>(_ValidationException_QNAME, ValidationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoValuationInMemoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dat.eu/myClaim/soap/v2/ValuationService", name = "doValuationInMemoryResponse")
    public JAXBElement<DoValuationInMemoryResponse> createDoValuationInMemoryResponse(DoValuationInMemoryResponse value) {
        return new JAXBElement<DoValuationInMemoryResponse>(_DoValuationInMemoryResponse_QNAME, DoValuationInMemoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractSelectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dat.eu/myClaim/soap/v2/ValuationService", name = "abstractSelectionRequest")
    public JAXBElement<AbstractSelectionRequest> createAbstractSelectionRequest(AbstractSelectionRequest value) {
        return new JAXBElement<AbstractSelectionRequest>(_AbstractSelectionRequest_QNAME, AbstractSelectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateValuation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dat.eu/myClaim/soap/v2/ValuationService", name = "createValuation")
    public JAXBElement<CreateValuation> createCreateValuation(CreateValuation value) {
        return new JAXBElement<CreateValuation>(_CreateValuation_QNAME, CreateValuation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValuationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dat.eu/myClaim/soap/v2/ValuationService", name = "getValuationResponse")
    public JAXBElement<GetValuationResponse> createGetValuationResponse(GetValuationResponse value) {
        return new JAXBElement<GetValuationResponse>(_GetValuationResponse_QNAME, GetValuationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetValuation2DefaultResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dat.eu/myClaim/soap/v2/ValuationService", name = "resetValuation2defaultResponse")
    public JAXBElement<ResetValuation2DefaultResponse> createResetValuation2DefaultResponse(ResetValuation2DefaultResponse value) {
        return new JAXBElement<ResetValuation2DefaultResponse>(_ResetValuation2DefaultResponse_QNAME, ResetValuation2DefaultResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearMonthsForCountryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dat.eu/myClaim/soap/v2/ValuationService", name = "YearMonthsForCountryRequest")
    public JAXBElement<YearMonthsForCountryRequest> createYearMonthsForCountryRequest(YearMonthsForCountryRequest value) {
        return new JAXBElement<YearMonthsForCountryRequest>(_YearMonthsForCountryRequest_QNAME, YearMonthsForCountryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeValuationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dat.eu/myClaim/soap/v2/ValuationService", name = "changeValuationResponse")
    public JAXBElement<ChangeValuationResponse> createChangeValuationResponse(ChangeValuationResponse value) {
        return new JAXBElement<ChangeValuationResponse>(_ChangeValuationResponse_QNAME, ChangeValuationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRegionsOfCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dat.eu/myClaim/soap/v2/ValuationService", name = "getRegionsOfCountry")
    public JAXBElement<GetRegionsOfCountry> createGetRegionsOfCountry(GetRegionsOfCountry value) {
        return new JAXBElement<GetRegionsOfCountry>(_GetRegionsOfCountry_QNAME, GetRegionsOfCountry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoValuationInMemory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dat.eu/myClaim/soap/v2/ValuationService", name = "doValuationInMemory")
    public JAXBElement<DoValuationInMemory> createDoValuationInMemory(DoValuationInMemory value) {
        return new JAXBElement<DoValuationInMemory>(_DoValuationInMemory_QNAME, DoValuationInMemory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValuation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dat.eu/myClaim/soap/v2/ValuationService", name = "getValuation")
    public JAXBElement<GetValuation> createGetValuation(GetValuation value) {
        return new JAXBElement<GetValuation>(_GetValuation_QNAME, GetValuation.class, null, value);
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

}
