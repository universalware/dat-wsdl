
package de.dat.financeline.services.dossier;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.dat.financeline.services.dossier package. 
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

    private final static QName _SearchDossierList_QNAME = new QName("http://sphinx.dat.de/services/Dossier", "searchDossierList");
    private final static QName _CreateDossier_QNAME = new QName("http://sphinx.dat.de/services/Dossier", "createDossier");
    private final static QName _GetDossier_QNAME = new QName("http://sphinx.dat.de/services/Dossier", "getDossier");
    private final static QName _CreateExportFormatData_QNAME = new QName("http://sphinx.dat.de/services/Dossier", "createExportFormatData");
    private final static QName _DeleteDossier_QNAME = new QName("http://sphinx.dat.de/services/Dossier", "deleteDossier");
    private final static QName _ExportDossier_QNAME = new QName("http://sphinx.dat.de/services/Dossier", "exportDossier");
    private final static QName _ChangeDossierResponse_QNAME = new QName("http://sphinx.dat.de/services/Dossier", "changeDossierResponse");
    private final static QName _GetDossierResponse_QNAME = new QName("http://sphinx.dat.de/services/Dossier", "getDossierResponse");
    private final static QName _ResetDossier2DefaultResponse_QNAME = new QName("http://sphinx.dat.de/services/Dossier", "resetDossier2DefaultResponse");
    private final static QName _ExportDossierResponse_QNAME = new QName("http://sphinx.dat.de/services/Dossier", "exportDossierResponse");
    private final static QName _ChangeDossier_QNAME = new QName("http://sphinx.dat.de/services/Dossier", "changeDossier");
    private final static QName _ExportDossierNResponse_QNAME = new QName("http://sphinx.dat.de/services/Dossier", "exportDossierNResponse");
    private final static QName _UpdateDossierResponse_QNAME = new QName("http://sphinx.dat.de/services/Dossier", "updateDossierResponse");
    private final static QName _ExportDossierN_QNAME = new QName("http://sphinx.dat.de/services/Dossier", "exportDossierN");
    private final static QName _CreateDossierResponse_QNAME = new QName("http://sphinx.dat.de/services/Dossier", "createDossierResponse");
    private final static QName _DeleteDossierResponse_QNAME = new QName("http://sphinx.dat.de/services/Dossier", "deleteDossierResponse");
    private final static QName _CreateExportFormatDataResponse_QNAME = new QName("http://sphinx.dat.de/services/Dossier", "createExportFormatDataResponse");
    private final static QName _UpdateDossier_QNAME = new QName("http://sphinx.dat.de/services/Dossier", "updateDossier");
    private final static QName _ResetDossier2Default_QNAME = new QName("http://sphinx.dat.de/services/Dossier", "resetDossier2Default");
    private final static QName _SearchDossierListResponse_QNAME = new QName("http://sphinx.dat.de/services/Dossier", "searchDossierListResponse");
    private final static QName _CreateExportFormatDataResponseReturn_QNAME = new QName("", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.dat.financeline.services.dossier
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
     * Create an instance of {@link UpdateDossierResponse }
     * 
     */
    public UpdateDossierResponse createUpdateDossierResponse() {
        return new UpdateDossierResponse();
    }

    /**
     * Create an instance of {@link CreateDossierResponse }
     * 
     */
    public CreateDossierResponse createCreateDossierResponse() {
        return new CreateDossierResponse();
    }

    /**
     * Create an instance of {@link SearchDossierListResponse }
     * 
     */
    public SearchDossierListResponse createSearchDossierListResponse() {
        return new SearchDossierListResponse();
    }

    /**
     * Create an instance of {@link ResetDossier2DefaultResponse }
     * 
     */
    public ResetDossier2DefaultResponse createResetDossier2DefaultResponse() {
        return new ResetDossier2DefaultResponse();
    }

    /**
     * Create an instance of {@link GetDossierResponse }
     * 
     */
    public GetDossierResponse createGetDossierResponse() {
        return new GetDossierResponse();
    }

    /**
     * Create an instance of {@link ChangeDossierResponse }
     * 
     */
    public ChangeDossierResponse createChangeDossierResponse() {
        return new ChangeDossierResponse();
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
     * Create an instance of {@link Dossiers }
     * 
     */
    public Dossiers createDossiers() {
        return new Dossiers();
    }

    /**
     * Create an instance of {@link Dossier_Type }
     * 
     */
    public Dossier_Type createDossier_Type() {
        return new Dossier_Type();
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
     * Create an instance of {@link CreateExportFormatData }
     * 
     */
    public CreateExportFormatData createCreateExportFormatData() {
        return new CreateExportFormatData();
    }

    /**
     * Create an instance of {@link CreateDossier }
     * 
     */
    public CreateDossier createCreateDossier() {
        return new CreateDossier();
    }

    /**
     * Create an instance of {@link GetDossier }
     * 
     */
    public GetDossier createGetDossier() {
        return new GetDossier();
    }

    /**
     * Create an instance of {@link SearchDossierList }
     * 
     */
    public SearchDossierList createSearchDossierList() {
        return new SearchDossierList();
    }

    /**
     * Create an instance of {@link ExportDossier }
     * 
     */
    public ExportDossier createExportDossier() {
        return new ExportDossier();
    }

    /**
     * Create an instance of {@link DeleteDossier }
     * 
     */
    public DeleteDossier createDeleteDossier() {
        return new DeleteDossier();
    }

    /**
     * Create an instance of {@link ExportDossierNResponse }
     * 
     */
    public ExportDossierNResponse createExportDossierNResponse() {
        return new ExportDossierNResponse();
    }

    /**
     * Create an instance of {@link ChangeDossier }
     * 
     */
    public ChangeDossier createChangeDossier() {
        return new ChangeDossier();
    }

    /**
     * Create an instance of {@link ExportDossierResponse }
     * 
     */
    public ExportDossierResponse createExportDossierResponse() {
        return new ExportDossierResponse();
    }

    /**
     * Create an instance of {@link ResetDossier2Default }
     * 
     */
    public ResetDossier2Default createResetDossier2Default() {
        return new ResetDossier2Default();
    }

    /**
     * Create an instance of {@link DeleteDossierResponse }
     * 
     */
    public DeleteDossierResponse createDeleteDossierResponse() {
        return new DeleteDossierResponse();
    }

    /**
     * Create an instance of {@link CreateExportFormatDataResponse }
     * 
     */
    public CreateExportFormatDataResponse createCreateExportFormatDataResponse() {
        return new CreateExportFormatDataResponse();
    }

    /**
     * Create an instance of {@link UpdateDossier }
     * 
     */
    public UpdateDossier createUpdateDossier() {
        return new UpdateDossier();
    }

    /**
     * Create an instance of {@link ExportDossierN }
     * 
     */
    public ExportDossierN createExportDossierN() {
        return new ExportDossierN();
    }

    /**
     * Create an instance of {@link SearchResult }
     * 
     */
    public SearchResult createSearchResult() {
        return new SearchResult();
    }

    /**
     * Create an instance of {@link ExportProductAddOns }
     * 
     */
    public ExportProductAddOns createExportProductAddOns() {
        return new ExportProductAddOns();
    }

    /**
     * Create an instance of {@link Locale }
     * 
     */
    public Locale createLocale() {
        return new Locale();
    }

    /**
     * Create an instance of {@link ExportDossier2 }
     * 
     */
    public ExportDossier2 createExportDossier2() {
        return new ExportDossier2();
    }

    /**
     * Create an instance of {@link ExportCertificateAddOns }
     * 
     */
    public ExportCertificateAddOns createExportCertificateAddOns() {
        return new ExportCertificateAddOns();
    }

    /**
     * Create an instance of {@link PrintActBean }
     * 
     */
    public PrintActBean createPrintActBean() {
        return new PrintActBean();
    }

    /**
     * Create an instance of {@link SearchCriterion }
     * 
     */
    public SearchCriterion createSearchCriterion() {
        return new SearchCriterion();
    }

    /**
     * Create an instance of {@link ExportProduct }
     * 
     */
    public ExportProduct createExportProduct() {
        return new ExportProduct();
    }

    /**
     * Create an instance of {@link SearchDossierListRequest }
     * 
     */
    public SearchDossierListRequest createSearchDossierListRequest() {
        return new SearchDossierListRequest();
    }

    /**
     * Create an instance of {@link UpdateDossierResponse.VXS }
     * 
     */
    public UpdateDossierResponse.VXS createUpdateDossierResponseVXS() {
        return new UpdateDossierResponse.VXS();
    }

    /**
     * Create an instance of {@link CreateDossierResponse.VXS }
     * 
     */
    public CreateDossierResponse.VXS createCreateDossierResponseVXS() {
        return new CreateDossierResponse.VXS();
    }

    /**
     * Create an instance of {@link SearchDossierListResponse.SearchResultList }
     * 
     */
    public SearchDossierListResponse.SearchResultList createSearchDossierListResponseSearchResultList() {
        return new SearchDossierListResponse.SearchResultList();
    }

    /**
     * Create an instance of {@link ResetDossier2DefaultResponse.VXS }
     * 
     */
    public ResetDossier2DefaultResponse.VXS createResetDossier2DefaultResponseVXS() {
        return new ResetDossier2DefaultResponse.VXS();
    }

    /**
     * Create an instance of {@link GetDossierResponse.VXS }
     * 
     */
    public GetDossierResponse.VXS createGetDossierResponseVXS() {
        return new GetDossierResponse.VXS();
    }

    /**
     * Create an instance of {@link ChangeDossierResponse.VXS }
     * 
     */
    public ChangeDossierResponse.VXS createChangeDossierResponseVXS() {
        return new ChangeDossierResponse.VXS();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchDossierList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Dossier", name = "searchDossierList")
    public JAXBElement<SearchDossierList> createSearchDossierList(SearchDossierList value) {
        return new JAXBElement<SearchDossierList>(_SearchDossierList_QNAME, SearchDossierList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDossier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Dossier", name = "createDossier")
    public JAXBElement<CreateDossier> createCreateDossier(CreateDossier value) {
        return new JAXBElement<CreateDossier>(_CreateDossier_QNAME, CreateDossier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDossier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Dossier", name = "getDossier")
    public JAXBElement<GetDossier> createGetDossier(GetDossier value) {
        return new JAXBElement<GetDossier>(_GetDossier_QNAME, GetDossier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateExportFormatData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Dossier", name = "createExportFormatData")
    public JAXBElement<CreateExportFormatData> createCreateExportFormatData(CreateExportFormatData value) {
        return new JAXBElement<CreateExportFormatData>(_CreateExportFormatData_QNAME, CreateExportFormatData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDossier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Dossier", name = "deleteDossier")
    public JAXBElement<DeleteDossier> createDeleteDossier(DeleteDossier value) {
        return new JAXBElement<DeleteDossier>(_DeleteDossier_QNAME, DeleteDossier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportDossier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Dossier", name = "exportDossier")
    public JAXBElement<ExportDossier> createExportDossier(ExportDossier value) {
        return new JAXBElement<ExportDossier>(_ExportDossier_QNAME, ExportDossier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeDossierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Dossier", name = "changeDossierResponse")
    public JAXBElement<ChangeDossierResponse> createChangeDossierResponse(ChangeDossierResponse value) {
        return new JAXBElement<ChangeDossierResponse>(_ChangeDossierResponse_QNAME, ChangeDossierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDossierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Dossier", name = "getDossierResponse")
    public JAXBElement<GetDossierResponse> createGetDossierResponse(GetDossierResponse value) {
        return new JAXBElement<GetDossierResponse>(_GetDossierResponse_QNAME, GetDossierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetDossier2DefaultResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Dossier", name = "resetDossier2DefaultResponse")
    public JAXBElement<ResetDossier2DefaultResponse> createResetDossier2DefaultResponse(ResetDossier2DefaultResponse value) {
        return new JAXBElement<ResetDossier2DefaultResponse>(_ResetDossier2DefaultResponse_QNAME, ResetDossier2DefaultResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportDossierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Dossier", name = "exportDossierResponse")
    public JAXBElement<ExportDossierResponse> createExportDossierResponse(ExportDossierResponse value) {
        return new JAXBElement<ExportDossierResponse>(_ExportDossierResponse_QNAME, ExportDossierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeDossier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Dossier", name = "changeDossier")
    public JAXBElement<ChangeDossier> createChangeDossier(ChangeDossier value) {
        return new JAXBElement<ChangeDossier>(_ChangeDossier_QNAME, ChangeDossier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportDossierNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Dossier", name = "exportDossierNResponse")
    public JAXBElement<ExportDossierNResponse> createExportDossierNResponse(ExportDossierNResponse value) {
        return new JAXBElement<ExportDossierNResponse>(_ExportDossierNResponse_QNAME, ExportDossierNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDossierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Dossier", name = "updateDossierResponse")
    public JAXBElement<UpdateDossierResponse> createUpdateDossierResponse(UpdateDossierResponse value) {
        return new JAXBElement<UpdateDossierResponse>(_UpdateDossierResponse_QNAME, UpdateDossierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportDossierN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Dossier", name = "exportDossierN")
    public JAXBElement<ExportDossierN> createExportDossierN(ExportDossierN value) {
        return new JAXBElement<ExportDossierN>(_ExportDossierN_QNAME, ExportDossierN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDossierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Dossier", name = "createDossierResponse")
    public JAXBElement<CreateDossierResponse> createCreateDossierResponse(CreateDossierResponse value) {
        return new JAXBElement<CreateDossierResponse>(_CreateDossierResponse_QNAME, CreateDossierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDossierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Dossier", name = "deleteDossierResponse")
    public JAXBElement<DeleteDossierResponse> createDeleteDossierResponse(DeleteDossierResponse value) {
        return new JAXBElement<DeleteDossierResponse>(_DeleteDossierResponse_QNAME, DeleteDossierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateExportFormatDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Dossier", name = "createExportFormatDataResponse")
    public JAXBElement<CreateExportFormatDataResponse> createCreateExportFormatDataResponse(CreateExportFormatDataResponse value) {
        return new JAXBElement<CreateExportFormatDataResponse>(_CreateExportFormatDataResponse_QNAME, CreateExportFormatDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDossier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Dossier", name = "updateDossier")
    public JAXBElement<UpdateDossier> createUpdateDossier(UpdateDossier value) {
        return new JAXBElement<UpdateDossier>(_UpdateDossier_QNAME, UpdateDossier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetDossier2Default }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Dossier", name = "resetDossier2Default")
    public JAXBElement<ResetDossier2Default> createResetDossier2Default(ResetDossier2Default value) {
        return new JAXBElement<ResetDossier2Default>(_ResetDossier2Default_QNAME, ResetDossier2Default.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchDossierListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Dossier", name = "searchDossierListResponse")
    public JAXBElement<SearchDossierListResponse> createSearchDossierListResponse(SearchDossierListResponse value) {
        return new JAXBElement<SearchDossierListResponse>(_SearchDossierListResponse_QNAME, SearchDossierListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = CreateExportFormatDataResponse.class)
    public JAXBElement<byte[]> createCreateExportFormatDataResponseReturn(byte[] value) {
        return new JAXBElement<byte[]>(_CreateExportFormatDataResponseReturn_QNAME, byte[].class, CreateExportFormatDataResponse.class, ((byte[]) value));
    }

}
