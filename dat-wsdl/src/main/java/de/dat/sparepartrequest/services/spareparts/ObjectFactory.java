
package de.dat.sparepartrequest.services.spareparts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.dat.sparepartrequest.services.spareparts package. 
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

    private final static QName _ModelInfoMfrAndExtPartNoRequest_QNAME = new QName("http://sphinx.dat.de/services/SpareParts", "ModelInfoMfrAndExtPartNoRequest");
    private final static QName _ModelAndExtPartNoRequest_QNAME = new QName("http://sphinx.dat.de/services/SpareParts", "ModelAndExtPartNoRequest");
    private final static QName _AbstractCoverageRequest_QNAME = new QName("http://sphinx.dat.de/services/SpareParts", "abstractCoverageRequest");
    private final static QName _GetExtPartNoInfoByModelAndExtPartNo_QNAME = new QName("http://sphinx.dat.de/services/SpareParts", "getExtPartNoInfoByModelAndExtPartNo");
    private final static QName _GetExtPartNoInfoByVinAndIntPartNo_QNAME = new QName("http://sphinx.dat.de/services/SpareParts", "getExtPartNoInfoByVinAndIntPartNo");
    private final static QName _GetModelInfoByMfrAndExtPartNoResponse_QNAME = new QName("http://sphinx.dat.de/services/SpareParts", "getModelInfoByMfrAndExtPartNoResponse");
    private final static QName _GetExtPartNoInfoByModelAndExtPartNoResponse_QNAME = new QName("http://sphinx.dat.de/services/SpareParts", "getExtPartNoInfoByModelAndExtPartNoResponse");
    private final static QName _GetExtPartNoInfoByVinAndIntPartNoResponse_QNAME = new QName("http://sphinx.dat.de/services/SpareParts", "getExtPartNoInfoByVinAndIntPartNoResponse");
    private final static QName _VinAndIntPartNoRequest_QNAME = new QName("http://sphinx.dat.de/services/SpareParts", "VinAndIntPartNoRequest");
    private final static QName _FullVehicleAndIntPartNoRequest_QNAME = new QName("http://sphinx.dat.de/services/SpareParts", "FullVehicleAndIntPartNoRequest");
    private final static QName _EcodeAndIntPartNoRequest_QNAME = new QName("http://sphinx.dat.de/services/SpareParts", "EcodeAndIntPartNoRequest");
    private final static QName _GetModelInfoByMfrAndExtPartNo_QNAME = new QName("http://sphinx.dat.de/services/SpareParts", "getModelInfoByMfrAndExtPartNo");
    private final static QName _MfrAndExtPartNoRequest_QNAME = new QName("http://sphinx.dat.de/services/SpareParts", "MfrAndExtPartNoRequest");
    private final static QName _GetExtPartNoInfoByFullVehicleAndIntPartNo_QNAME = new QName("http://sphinx.dat.de/services/SpareParts", "getExtPartNoInfoByFullVehicleAndIntPartNo");
    private final static QName _GetExtPartNoInfoByMfrAndExtPartNoResponse_QNAME = new QName("http://sphinx.dat.de/services/SpareParts", "getExtPartNoInfoByMfrAndExtPartNoResponse");
    private final static QName _SparePartResult_QNAME = new QName("http://sphinx.dat.de/services/SpareParts", "sparePartResult");
    private final static QName _GetExtPartNoInfoByMfrAndExtPartNo_QNAME = new QName("http://sphinx.dat.de/services/SpareParts", "getExtPartNoInfoByMfrAndExtPartNo");
    private final static QName _AbstractSelectionRequest_QNAME = new QName("http://sphinx.dat.de/services/SpareParts", "abstractSelectionRequest");
    private final static QName _GetExtPartNoInfoByFullVehicleAndIntPartNoResponse_QNAME = new QName("http://sphinx.dat.de/services/SpareParts", "getExtPartNoInfoByFullVehicleAndIntPartNoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.dat.sparepartrequest.services.spareparts
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
     * Create an instance of {@link GetExtPartNoInfoByMfrAndExtPartNoResponse }
     * 
     */
    public GetExtPartNoInfoByMfrAndExtPartNoResponse createGetExtPartNoInfoByMfrAndExtPartNoResponse() {
        return new GetExtPartNoInfoByMfrAndExtPartNoResponse();
    }

    /**
     * Create an instance of {@link AbstractSelectionRequest }
     * 
     */
    public AbstractSelectionRequest createAbstractSelectionRequest() {
        return new AbstractSelectionRequest();
    }

    /**
     * Create an instance of {@link GetExtPartNoInfoByFullVehicleAndIntPartNoResponse }
     * 
     */
    public GetExtPartNoInfoByFullVehicleAndIntPartNoResponse createGetExtPartNoInfoByFullVehicleAndIntPartNoResponse() {
        return new GetExtPartNoInfoByFullVehicleAndIntPartNoResponse();
    }

    /**
     * Create an instance of {@link SparePartResult }
     * 
     */
    public SparePartResult createSparePartResult() {
        return new SparePartResult();
    }

    /**
     * Create an instance of {@link GetExtPartNoInfoByMfrAndExtPartNo }
     * 
     */
    public GetExtPartNoInfoByMfrAndExtPartNo createGetExtPartNoInfoByMfrAndExtPartNo() {
        return new GetExtPartNoInfoByMfrAndExtPartNo();
    }

    /**
     * Create an instance of {@link FullVehicleAndIntPartNoRequest }
     * 
     */
    public FullVehicleAndIntPartNoRequest createFullVehicleAndIntPartNoRequest() {
        return new FullVehicleAndIntPartNoRequest();
    }

    /**
     * Create an instance of {@link VinAndIntPartNoRequest }
     * 
     */
    public VinAndIntPartNoRequest createVinAndIntPartNoRequest() {
        return new VinAndIntPartNoRequest();
    }

    /**
     * Create an instance of {@link GetExtPartNoInfoByFullVehicleAndIntPartNo }
     * 
     */
    public GetExtPartNoInfoByFullVehicleAndIntPartNo createGetExtPartNoInfoByFullVehicleAndIntPartNo() {
        return new GetExtPartNoInfoByFullVehicleAndIntPartNo();
    }

    /**
     * Create an instance of {@link EcodeAndIntPartNoRequest }
     * 
     */
    public EcodeAndIntPartNoRequest createEcodeAndIntPartNoRequest() {
        return new EcodeAndIntPartNoRequest();
    }

    /**
     * Create an instance of {@link GetModelInfoByMfrAndExtPartNo }
     * 
     */
    public GetModelInfoByMfrAndExtPartNo createGetModelInfoByMfrAndExtPartNo() {
        return new GetModelInfoByMfrAndExtPartNo();
    }

    /**
     * Create an instance of {@link MfrAndExtPartNoRequest }
     * 
     */
    public MfrAndExtPartNoRequest createMfrAndExtPartNoRequest() {
        return new MfrAndExtPartNoRequest();
    }

    /**
     * Create an instance of {@link GetExtPartNoInfoByModelAndExtPartNoResponse }
     * 
     */
    public GetExtPartNoInfoByModelAndExtPartNoResponse createGetExtPartNoInfoByModelAndExtPartNoResponse() {
        return new GetExtPartNoInfoByModelAndExtPartNoResponse();
    }

    /**
     * Create an instance of {@link GetExtPartNoInfoByVinAndIntPartNoResponse }
     * 
     */
    public GetExtPartNoInfoByVinAndIntPartNoResponse createGetExtPartNoInfoByVinAndIntPartNoResponse() {
        return new GetExtPartNoInfoByVinAndIntPartNoResponse();
    }

    /**
     * Create an instance of {@link ModelAndExtPartNoRequest }
     * 
     */
    public ModelAndExtPartNoRequest createModelAndExtPartNoRequest() {
        return new ModelAndExtPartNoRequest();
    }

    /**
     * Create an instance of {@link AbstractCoverageRequest }
     * 
     */
    public AbstractCoverageRequest createAbstractCoverageRequest() {
        return new AbstractCoverageRequest();
    }

    /**
     * Create an instance of {@link ModelInfoMfrAndExtPartNoRequest }
     * 
     */
    public ModelInfoMfrAndExtPartNoRequest createModelInfoMfrAndExtPartNoRequest() {
        return new ModelInfoMfrAndExtPartNoRequest();
    }

    /**
     * Create an instance of {@link GetExtPartNoInfoByModelAndExtPartNo }
     * 
     */
    public GetExtPartNoInfoByModelAndExtPartNo createGetExtPartNoInfoByModelAndExtPartNo() {
        return new GetExtPartNoInfoByModelAndExtPartNo();
    }

    /**
     * Create an instance of {@link GetExtPartNoInfoByVinAndIntPartNo }
     * 
     */
    public GetExtPartNoInfoByVinAndIntPartNo createGetExtPartNoInfoByVinAndIntPartNo() {
        return new GetExtPartNoInfoByVinAndIntPartNo();
    }

    /**
     * Create an instance of {@link GetModelInfoByMfrAndExtPartNoResponse }
     * 
     */
    public GetModelInfoByMfrAndExtPartNoResponse createGetModelInfoByMfrAndExtPartNoResponse() {
        return new GetModelInfoByMfrAndExtPartNoResponse();
    }

    /**
     * Create an instance of {@link Locale }
     * 
     */
    public Locale createLocale() {
        return new Locale();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ModelInfoMfrAndExtPartNoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/SpareParts", name = "ModelInfoMfrAndExtPartNoRequest")
    public JAXBElement<ModelInfoMfrAndExtPartNoRequest> createModelInfoMfrAndExtPartNoRequest(ModelInfoMfrAndExtPartNoRequest value) {
        return new JAXBElement<ModelInfoMfrAndExtPartNoRequest>(_ModelInfoMfrAndExtPartNoRequest_QNAME, ModelInfoMfrAndExtPartNoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModelAndExtPartNoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/SpareParts", name = "ModelAndExtPartNoRequest")
    public JAXBElement<ModelAndExtPartNoRequest> createModelAndExtPartNoRequest(ModelAndExtPartNoRequest value) {
        return new JAXBElement<ModelAndExtPartNoRequest>(_ModelAndExtPartNoRequest_QNAME, ModelAndExtPartNoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractCoverageRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/SpareParts", name = "abstractCoverageRequest")
    public JAXBElement<AbstractCoverageRequest> createAbstractCoverageRequest(AbstractCoverageRequest value) {
        return new JAXBElement<AbstractCoverageRequest>(_AbstractCoverageRequest_QNAME, AbstractCoverageRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExtPartNoInfoByModelAndExtPartNo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/SpareParts", name = "getExtPartNoInfoByModelAndExtPartNo")
    public JAXBElement<GetExtPartNoInfoByModelAndExtPartNo> createGetExtPartNoInfoByModelAndExtPartNo(GetExtPartNoInfoByModelAndExtPartNo value) {
        return new JAXBElement<GetExtPartNoInfoByModelAndExtPartNo>(_GetExtPartNoInfoByModelAndExtPartNo_QNAME, GetExtPartNoInfoByModelAndExtPartNo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExtPartNoInfoByVinAndIntPartNo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/SpareParts", name = "getExtPartNoInfoByVinAndIntPartNo")
    public JAXBElement<GetExtPartNoInfoByVinAndIntPartNo> createGetExtPartNoInfoByVinAndIntPartNo(GetExtPartNoInfoByVinAndIntPartNo value) {
        return new JAXBElement<GetExtPartNoInfoByVinAndIntPartNo>(_GetExtPartNoInfoByVinAndIntPartNo_QNAME, GetExtPartNoInfoByVinAndIntPartNo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModelInfoByMfrAndExtPartNoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/SpareParts", name = "getModelInfoByMfrAndExtPartNoResponse")
    public JAXBElement<GetModelInfoByMfrAndExtPartNoResponse> createGetModelInfoByMfrAndExtPartNoResponse(GetModelInfoByMfrAndExtPartNoResponse value) {
        return new JAXBElement<GetModelInfoByMfrAndExtPartNoResponse>(_GetModelInfoByMfrAndExtPartNoResponse_QNAME, GetModelInfoByMfrAndExtPartNoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExtPartNoInfoByModelAndExtPartNoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/SpareParts", name = "getExtPartNoInfoByModelAndExtPartNoResponse")
    public JAXBElement<GetExtPartNoInfoByModelAndExtPartNoResponse> createGetExtPartNoInfoByModelAndExtPartNoResponse(GetExtPartNoInfoByModelAndExtPartNoResponse value) {
        return new JAXBElement<GetExtPartNoInfoByModelAndExtPartNoResponse>(_GetExtPartNoInfoByModelAndExtPartNoResponse_QNAME, GetExtPartNoInfoByModelAndExtPartNoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExtPartNoInfoByVinAndIntPartNoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/SpareParts", name = "getExtPartNoInfoByVinAndIntPartNoResponse")
    public JAXBElement<GetExtPartNoInfoByVinAndIntPartNoResponse> createGetExtPartNoInfoByVinAndIntPartNoResponse(GetExtPartNoInfoByVinAndIntPartNoResponse value) {
        return new JAXBElement<GetExtPartNoInfoByVinAndIntPartNoResponse>(_GetExtPartNoInfoByVinAndIntPartNoResponse_QNAME, GetExtPartNoInfoByVinAndIntPartNoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VinAndIntPartNoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/SpareParts", name = "VinAndIntPartNoRequest")
    public JAXBElement<VinAndIntPartNoRequest> createVinAndIntPartNoRequest(VinAndIntPartNoRequest value) {
        return new JAXBElement<VinAndIntPartNoRequest>(_VinAndIntPartNoRequest_QNAME, VinAndIntPartNoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FullVehicleAndIntPartNoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/SpareParts", name = "FullVehicleAndIntPartNoRequest")
    public JAXBElement<FullVehicleAndIntPartNoRequest> createFullVehicleAndIntPartNoRequest(FullVehicleAndIntPartNoRequest value) {
        return new JAXBElement<FullVehicleAndIntPartNoRequest>(_FullVehicleAndIntPartNoRequest_QNAME, FullVehicleAndIntPartNoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EcodeAndIntPartNoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/SpareParts", name = "EcodeAndIntPartNoRequest")
    public JAXBElement<EcodeAndIntPartNoRequest> createEcodeAndIntPartNoRequest(EcodeAndIntPartNoRequest value) {
        return new JAXBElement<EcodeAndIntPartNoRequest>(_EcodeAndIntPartNoRequest_QNAME, EcodeAndIntPartNoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModelInfoByMfrAndExtPartNo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/SpareParts", name = "getModelInfoByMfrAndExtPartNo")
    public JAXBElement<GetModelInfoByMfrAndExtPartNo> createGetModelInfoByMfrAndExtPartNo(GetModelInfoByMfrAndExtPartNo value) {
        return new JAXBElement<GetModelInfoByMfrAndExtPartNo>(_GetModelInfoByMfrAndExtPartNo_QNAME, GetModelInfoByMfrAndExtPartNo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MfrAndExtPartNoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/SpareParts", name = "MfrAndExtPartNoRequest")
    public JAXBElement<MfrAndExtPartNoRequest> createMfrAndExtPartNoRequest(MfrAndExtPartNoRequest value) {
        return new JAXBElement<MfrAndExtPartNoRequest>(_MfrAndExtPartNoRequest_QNAME, MfrAndExtPartNoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExtPartNoInfoByFullVehicleAndIntPartNo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/SpareParts", name = "getExtPartNoInfoByFullVehicleAndIntPartNo")
    public JAXBElement<GetExtPartNoInfoByFullVehicleAndIntPartNo> createGetExtPartNoInfoByFullVehicleAndIntPartNo(GetExtPartNoInfoByFullVehicleAndIntPartNo value) {
        return new JAXBElement<GetExtPartNoInfoByFullVehicleAndIntPartNo>(_GetExtPartNoInfoByFullVehicleAndIntPartNo_QNAME, GetExtPartNoInfoByFullVehicleAndIntPartNo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExtPartNoInfoByMfrAndExtPartNoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/SpareParts", name = "getExtPartNoInfoByMfrAndExtPartNoResponse")
    public JAXBElement<GetExtPartNoInfoByMfrAndExtPartNoResponse> createGetExtPartNoInfoByMfrAndExtPartNoResponse(GetExtPartNoInfoByMfrAndExtPartNoResponse value) {
        return new JAXBElement<GetExtPartNoInfoByMfrAndExtPartNoResponse>(_GetExtPartNoInfoByMfrAndExtPartNoResponse_QNAME, GetExtPartNoInfoByMfrAndExtPartNoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SparePartResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/SpareParts", name = "sparePartResult")
    public JAXBElement<SparePartResult> createSparePartResult(SparePartResult value) {
        return new JAXBElement<SparePartResult>(_SparePartResult_QNAME, SparePartResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExtPartNoInfoByMfrAndExtPartNo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/SpareParts", name = "getExtPartNoInfoByMfrAndExtPartNo")
    public JAXBElement<GetExtPartNoInfoByMfrAndExtPartNo> createGetExtPartNoInfoByMfrAndExtPartNo(GetExtPartNoInfoByMfrAndExtPartNo value) {
        return new JAXBElement<GetExtPartNoInfoByMfrAndExtPartNo>(_GetExtPartNoInfoByMfrAndExtPartNo_QNAME, GetExtPartNoInfoByMfrAndExtPartNo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractSelectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/SpareParts", name = "abstractSelectionRequest")
    public JAXBElement<AbstractSelectionRequest> createAbstractSelectionRequest(AbstractSelectionRequest value) {
        return new JAXBElement<AbstractSelectionRequest>(_AbstractSelectionRequest_QNAME, AbstractSelectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExtPartNoInfoByFullVehicleAndIntPartNoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/SpareParts", name = "getExtPartNoInfoByFullVehicleAndIntPartNoResponse")
    public JAXBElement<GetExtPartNoInfoByFullVehicleAndIntPartNoResponse> createGetExtPartNoInfoByFullVehicleAndIntPartNoResponse(GetExtPartNoInfoByFullVehicleAndIntPartNoResponse value) {
        return new JAXBElement<GetExtPartNoInfoByFullVehicleAndIntPartNoResponse>(_GetExtPartNoInfoByFullVehicleAndIntPartNoResponse_QNAME, GetExtPartNoInfoByFullVehicleAndIntPartNoResponse.class, null, value);
    }

}
