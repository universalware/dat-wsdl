
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.dat.vehiclerepaironline.services.vehiclerepairservice package. 
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

    private final static QName _ExportManualPositions_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "exportManualPositions");
    private final static QName _GetAssemblyGroupsResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getAssemblyGroupsResponse");
    private final static QName _ContractRequest_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "ContractRequest");
    private final static QName _ExportToDocumentResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "exportToDocumentResponse");
    private final static QName _SetContractPriceGeneration_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "setContractPriceGeneration");
    private final static QName _GetDVNEquipmentsResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getDVNEquipmentsResponse");
    private final static QName _GetAssemblyGroupsN_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getAssemblyGroupsN");
    private final static QName _GetContractListResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getContractListResponse");
    private final static QName _GetLockedInfoResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getLockedInfoResponse");
    private final static QName _SetBlanketCalculation_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "setBlanketCalculation");
    private final static QName _GetValidDATProcesses_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getValidDATProcesses");
    private final static QName _DPNDependenciesRequest_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "DPNDependenciesRequest");
    private final static QName _GetLockedInfo_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getLockedInfo");
    private final static QName _ExportToDocument_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "exportToDocument");
    private final static QName _ImportManualPositionsResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "importManualPositionsResponse");
    private final static QName _MaintenanceRequest_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "MaintenanceRequest");
    private final static QName _DeleteAllManualPositions_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "deleteAllManualPositions");
    private final static QName _ChangePriceDatesRequest_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "ChangePriceDatesRequest");
    private final static QName _GetInsurances_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getInsurances");
    private final static QName _DPNDependenciesResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "DPNDependenciesResponse");
    private final static QName _GetTemplatesResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getTemplatesResponse");
    private final static QName _GetAssemblyGroupGraphicResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getAssemblyGroupGraphicResponse");
    private final static QName _CreateContract106Response_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "createContract106Response");
    private final static QName _GetContractPriceGenerations_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getContractPriceGenerations");
    private final static QName _GetInsurancesResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getInsurancesResponse");
    private final static QName _DATContractListResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "DATContractListResponse");
    private final static QName _CalculateResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "calculateResponse");
    private final static QName _GetCalculationResultsResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getCalculationResultsResponse");
    private final static QName _GetAssemblyGroupsNResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getAssemblyGroupsNResponse");
    private final static QName _ImportDossierResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "importDossierResponse");
    private final static QName _SetBlanketClaculationResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "SetBlanketClaculationResponse");
    private final static QName _ListTemplatesResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "listTemplatesResponse");
    private final static QName _ImportManualPositions_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "importManualPositions");
    private final static QName _GetContractRequest_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "GetContractRequest");
    private final static QName _GetCalculationResults_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getCalculationResults");
    private final static QName _SetContractPriceGenerationResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "setContractPriceGenerationResponse");
    private final static QName _GetContractPriceGenerationsResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getContractPriceGenerationsResponse");
    private final static QName _SetBlanketCalculationResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "setBlanketCalculationResponse");
    private final static QName _GetAssemblyGroups_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getAssemblyGroups");
    private final static QName _GetLacquerTypeKeysResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getLacquerTypeKeysResponse");
    private final static QName _GetContractResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getContractResponse");
    private final static QName _GetDVNEquipments_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getDVNEquipments");
    private final static QName _ExportManualPositionsResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "exportManualPositionsResponse");
    private final static QName _ExportDossierToDocumentResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "exportDossierToDocumentResponse");
    private final static QName _DatProcessEquipmentsRequestRequest_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "DatProcessEquipmentsRequestRequest");
    private final static QName _GetValidDATProcessesResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getValidDATProcessesResponse");
    private final static QName _DeleteAllManualPositionsResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "deleteAllManualPositionsResponse");
    private final static QName _GetDPNDependenciesSimulation_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getDPNDependenciesSimulation");
    private final static QName _CalculateContractRequest_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "CalculateContractRequest");
    private final static QName _GetTemplates_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getTemplates");
    private final static QName _GetMaintenanceIntervalsResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getMaintenanceIntervalsResponse");
    private final static QName _ImportDossier_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "importDossier");
    private final static QName _ListTemplates_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "listTemplates");
    private final static QName _ExportDossierToDocument_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "exportDossierToDocument");
    private final static QName _GetContract_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getContract");
    private final static QName _GetLacquerTypeKeys_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getLacquerTypeKeys");
    private final static QName _CalculateContractResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "calculateContractResponse");
    private final static QName _CalculateContract_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "calculateContract");
    private final static QName _CalculateRequest_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "CalculateRequest");
    private final static QName _CreateContract106_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "createContract106");
    private final static QName _Calculate_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "calculate");
    private final static QName _CreateContractResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "createContractResponse");
    private final static QName _GetLastPriceGenerationByMfrResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getLastPriceGenerationByMfrResponse");
    private final static QName _GetAssemblyGroupGraphic_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getAssemblyGroupGraphic");
    private final static QName _GetContractList_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getContractList");
    private final static QName _CreateContract_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "createContract");
    private final static QName _GetLastPriceGenerationByMfr_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getLastPriceGenerationByMfr");
    private final static QName _GetDPNDependenciesSimulationResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getDPNDependenciesSimulationResponse");
    private final static QName _GetMaintenanceIntervals_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "getMaintenanceIntervals");
    private final static QName _LacquerTypesResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleRepairService", "LacquerTypesResponse");
    private final static QName _ImportDossierRequestLocale_QNAME = new QName("", "locale");
    private final static QName _SetBlanketClaculationResponseMessage_QNAME = new QName("", "message");
    private final static QName _SetBlanketCalculationRequestLacquerCosts_QNAME = new QName("", "lacquerCosts");
    private final static QName _SetBlanketCalculationRequestLabourCosts_QNAME = new QName("", "labourCosts");
    private final static QName _SetBlanketCalculationRequestSparePartsCosts_QNAME = new QName("", "sparePartsCosts");
    private final static QName _ExportToDocumentRequestProduct_QNAME = new QName("", "product");
    private final static QName _ExportToDocumentRequestFormat_QNAME = new QName("", "format");
    private final static QName _ExportToDocumentRequestExportProduct_QNAME = new QName("", "exportProduct");
    private final static QName _OrderInfoProirity_QNAME = new QName("", "proirity");
    private final static QName _OrderInfoPriority_QNAME = new QName("", "priority");
    private final static QName _OrderInfoOrder_QNAME = new QName("", "order");
    private final static QName _DatProcessInfoSuppressed_QNAME = new QName("", "suppressed");
    private final static QName _ContractRequestOwnerTitel_QNAME = new QName("", "ownerTitel");
    private final static QName _ContractRequestPaintingColorDescription_QNAME = new QName("", "paintingColorDescription");
    private final static QName _ContractRequestDatECode_QNAME = new QName("", "datECode");
    private final static QName _ContractRequestOwnerZIP_QNAME = new QName("", "ownerZIP");
    private final static QName _ContractRequestOwnerName_QNAME = new QName("", "ownerName");
    private final static QName _ContractRequestOwnerStreetNumber_QNAME = new QName("", "ownerStreetNumber");
    private final static QName _ContractRequestConstructionTime_QNAME = new QName("", "constructionTime");
    private final static QName _ContractRequestRegistrationDate_QNAME = new QName("", "registrationDate");
    private final static QName _ContractRequestOwnerCountry_QNAME = new QName("", "ownerCountry");
    private final static QName _ContractRequestContractName_QNAME = new QName("", "contractName");
    private final static QName _ContractRequestKeepWages_QNAME = new QName("", "keepWages");
    private final static QName _ContractRequestOwnerStreet_QNAME = new QName("", "ownerStreet");
    private final static QName _ContractRequestVin_QNAME = new QName("", "vin");
    private final static QName _ContractRequestNextVehicleInsectionDate_QNAME = new QName("", "nextVehicleInsectionDate");
    private final static QName _ContractRequestOwnerPhone_QNAME = new QName("", "ownerPhone");
    private final static QName _ContractRequestIsCountryCurrency_QNAME = new QName("", "isCountryCurrency");
    private final static QName _ContractRequestCountryPrice_QNAME = new QName("", "countryPrice");
    private final static QName _ContractRequestIsDMSCalculation_QNAME = new QName("", "isDMSCalculation");
    private final static QName _ContractRequestKba_QNAME = new QName("", "kba");
    private final static QName _ContractRequestOwnerName2_QNAME = new QName("", "ownerName2");
    private final static QName _ContractRequestOwnerEmail_QNAME = new QName("", "ownerEmail");
    private final static QName _ContractRequestPaintingMethod_QNAME = new QName("", "paintingMethod");
    private final static QName _ContractRequestInsuranceCaseDescription_QNAME = new QName("", "insuranceCaseDescription");
    private final static QName _ContractRequestExternalProvider_QNAME = new QName("", "externalProvider");
    private final static QName _ContractRequestRegistrationNumber_QNAME = new QName("", "registrationNumber");
    private final static QName _ContractRequestMileageTachometer_QNAME = new QName("", "mileageTachometer");
    private final static QName _ContractRequestComment_QNAME = new QName("", "comment");
    private final static QName _ContractRequestOwnerCity_QNAME = new QName("", "ownerCity");
    private final static QName _ContractRequestConstructionDate_QNAME = new QName("", "constructionDate");
    private final static QName _RestrictionInsuranceClaim_QNAME = new QName("", "insuranceClaim");
    private final static QName _RestrictionBaseModel_QNAME = new QName("", "baseModel");
    private final static QName _RestrictionCreateDateTo_QNAME = new QName("", "createDateTo");
    private final static QName _RestrictionGarageContractName_QNAME = new QName("", "garageContractName");
    private final static QName _RestrictionOrderNumber_QNAME = new QName("", "orderNumber");
    private final static QName _RestrictionDatEcode_QNAME = new QName("", "datEcode");
    private final static QName _RestrictionChangeDateTo_QNAME = new QName("", "changeDateTo");
    private final static QName _RestrictionSubModel_QNAME = new QName("", "subModel");
    private final static QName _RestrictionCreateDateFrom_QNAME = new QName("", "createDateFrom");
    private final static QName _RestrictionChangeDateFrom_QNAME = new QName("", "changeDateFrom");
    private final static QName _RestrictionManufacturer_QNAME = new QName("", "manufacturer");
    private final static QName _RestrictionContractId_QNAME = new QName("", "contractId");
    private final static QName _RestrictionInvoiceNumber_QNAME = new QName("", "invoiceNumber");
    private final static QName _RestrictionCalculationStatus_QNAME = new QName("", "calculationStatus");
    private final static QName _RestrictionVehicleType_QNAME = new QName("", "vehicleType");
    private final static QName _MaterialPositionDataConstructionTimeFrom_QNAME = new QName("", "constructionTimeFrom");
    private final static QName _MaterialPositionDataDpn_QNAME = new QName("", "dpn");
    private final static QName _MaterialPositionDataDescription_QNAME = new QName("", "description");
    private final static QName _MaterialPositionDataPartNumber_QNAME = new QName("", "partNumber");
    private final static QName _MaterialPositionDataPartNumberOrigin_QNAME = new QName("", "partNumberOrigin");
    private final static QName _MaterialPositionDataConstructionTimeTo_QNAME = new QName("", "constructionTimeTo");
    private final static QName _MaterialPositionDataValuePerUnit_QNAME = new QName("", "valuePerUnit");
    private final static QName _LacquerTypeKey_QNAME = new QName("", "key");
    private final static QName _PaintingColorDescriptionCode_QNAME = new QName("", "code");
    private final static QName _PaintingColorDescriptionExpression_QNAME = new QName("", "expression");
    private final static QName _PaintingColorDescriptionName_QNAME = new QName("", "name");
    private final static QName _PaintingColorDescriptionPriceCategory_QNAME = new QName("", "priceCategory");
    private final static QName _PaintingColorDescriptionDatCode_QNAME = new QName("", "datCode");
    private final static QName _PaintingColorDescriptionType_QNAME = new QName("", "type");
    private final static QName _InsuranceInsuranceNumber_QNAME = new QName("", "insuranceNumber");
    private final static QName _InsuranceGdvFlag_QNAME = new QName("", "gdvFlag");
    private final static QName _InsuranceInsuranceGroupId_QNAME = new QName("", "insuranceGroupId");
    private final static QName _InsuranceInsuranceId_QNAME = new QName("", "insuranceId");
    private final static QName _InsuranceInsuranceName_QNAME = new QName("", "insuranceName");
    private final static QName _DatContractListResponseCountOfContractslsFound_QNAME = new QName("", "countOfContractslsFound");
    private final static QName _DatContractListResponseDossiersDatProcessInfos_QNAME = new QName("", "dossiersDatProcessInfos");
    private final static QName _DatContractListResponseCountOfContractssReturned_QNAME = new QName("", "countOfContractssReturned");
    private final static QName _DatContractListResponseDossiers_QNAME = new QName("", "dossiers");
    private final static QName _PriceDateDate_QNAME = new QName("", "date");
    private final static QName _PriceDateGeneration_QNAME = new QName("", "generation");
    private final static QName _DpnMaterialPositionMaterialPosition_QNAME = new QName("", "materialPosition");
    private final static QName _CalculateRequestUseTimeUnitsOfManufacturer_QNAME = new QName("", "useTimeUnitsOfManufacturer");
    private final static QName _CalculateRequestIncludeProtocol_QNAME = new QName("", "includeProtocol");
    private final static QName _CalculateRequestContructionTime_QNAME = new QName("", "contructionTime");
    private final static QName _CalculateRequestEconomicRegion_QNAME = new QName("", "economicRegion");
    private final static QName _CalculateRequestIsAlternativeCalculationUsed_QNAME = new QName("", "isAlternativeCalculationUsed");
    private final static QName _CalculateRequestIsPhantomCalculation_QNAME = new QName("", "isPhantomCalculation");
    private final static QName _CalculateRequestInsuranceID_QNAME = new QName("", "insuranceID");
    private final static QName _InsuranceCaseDescriptionRetentionAmount_QNAME = new QName("", "retentionAmount");
    private final static QName _InsuranceCaseDescriptionRepairCoverage_QNAME = new QName("", "repairCoverage");
    private final static QName _InsuranceCaseDescriptionInsuranceAgency_QNAME = new QName("", "insuranceAgency");
    private final static QName _InsuranceCaseDescriptionPolicyNumber_QNAME = new QName("", "policyNumber");
    private final static QName _InsuranceCaseDescriptionInsuranceType_QNAME = new QName("", "insuranceType");
    private final static QName _InsuranceCaseDescriptionDamageDate_QNAME = new QName("", "damageDate");
    private final static QName _InsuranceCaseDescriptionDeclarationOfAssignment_QNAME = new QName("", "declarationOfAssignment");
    private final static QName _InsuranceCaseDescriptionDamageNumber_QNAME = new QName("", "damageNumber");
    private final static QName _InsuranceCaseDescriptionDamageType_QNAME = new QName("", "damageType");
    private final static QName _InsuranceCaseDescriptionInspectionDate_QNAME = new QName("", "inspectionDate");
    private final static QName _InsuranceCaseDescriptionRetention_QNAME = new QName("", "retention");
    private final static QName _InsuranceCaseDescriptionCreationDateTime_QNAME = new QName("", "creationDateTime");
    private final static QName _ExportProductFileName_QNAME = new QName("", "fileName");
    private final static QName _ExportProductPrintProductName_QNAME = new QName("", "printProductName");
    private final static QName _ExportProductDisplayName_QNAME = new QName("", "displayName");
    private final static QName _ExportProductOrigin_QNAME = new QName("", "origin");
    private final static QName _DossierDatProcessInfosDossierId_QNAME = new QName("", "dossierId");
    private final static QName _ContractRequest106MileageUnit_QNAME = new QName("", "mileageUnit");
    private final static QName _ContractRequest106OpponentStreetNumber_QNAME = new QName("", "opponentStreetNumber");
    private final static QName _ContractRequest106OpponentPreTaxAuthorized_QNAME = new QName("", "opponentPreTaxAuthorized");
    private final static QName _ContractRequest106PolicyholderName_QNAME = new QName("", "policyholderName");
    private final static QName _ContractRequest106DamageLocation_QNAME = new QName("", "damageLocation");
    private final static QName _ContractRequest106PolicyholderZIP_QNAME = new QName("", "policyholderZIP");
    private final static QName _ContractRequest106ExistingAssignmentDeclaration_QNAME = new QName("", "existingAssignmentDeclaration");
    private final static QName _ContractRequest106IsFranchise_QNAME = new QName("", "isFranchise");
    private final static QName _ContractRequest106IsInsuranceCase_QNAME = new QName("", "isInsuranceCase");
    private final static QName _ContractRequest106PolicyholderCity_QNAME = new QName("", "policyholderCity");
    private final static QName _ContractRequest106OpponentCity_QNAME = new QName("", "opponentCity");
    private final static QName _ContractRequest106PolicyholderStreet_QNAME = new QName("", "policyholderStreet");
    private final static QName _ContractRequest106AdditionalData_QNAME = new QName("", "additionalData");
    private final static QName _ContractRequest106FranchiseValue_QNAME = new QName("", "franchiseValue");
    private final static QName _ContractRequest106PolicyholderCountry_QNAME = new QName("", "policyholderCountry");
    private final static QName _ContractRequest106PolicyholderStreetNumber_QNAME = new QName("", "policyholderStreetNumber");
    private final static QName _ContractRequest106OpponentRegistrationNumber_QNAME = new QName("", "opponentRegistrationNumber");
    private final static QName _ContractRequest106OpponentZIP_QNAME = new QName("", "opponentZIP");
    private final static QName _ContractRequest106PolicyholderName2_QNAME = new QName("", "policyholderName2");
    private final static QName _ContractRequest106OpponentName2_QNAME = new QName("", "opponentName2");
    private final static QName _ContractRequest106PolicyholderEmail_QNAME = new QName("", "policyholderEmail");
    private final static QName _ContractRequest106OpponentEmail_QNAME = new QName("", "opponentEmail");
    private final static QName _ContractRequest106OpponentTitel_QNAME = new QName("", "opponentTitel");
    private final static QName _ContractRequest106OpponentPhone_QNAME = new QName("", "opponentPhone");
    private final static QName _ContractRequest106PolicyholderPhone_QNAME = new QName("", "policyholderPhone");
    private final static QName _ContractRequest106PolicyholderTitel_QNAME = new QName("", "policyholderTitel");
    private final static QName _ContractRequest106OpponentCountry_QNAME = new QName("", "opponentCountry");
    private final static QName _ContractRequest106OpponentStreet_QNAME = new QName("", "opponentStreet");
    private final static QName _ContractRequest106PolicyholderPreTaxAuthorized_QNAME = new QName("", "policyholderPreTaxAuthorized");
    private final static QName _ContractRequest106OpponentName_QNAME = new QName("", "opponentName");
    private final static QName _SettingsOffset_QNAME = new QName("", "offset");
    private final static QName _SettingsReturnLanguage_QNAME = new QName("", "returnLanguage");
    private final static QName _SettingsSortingCriterions_QNAME = new QName("", "sortingCriterions");
    private final static QName _SettingsNumberOfContractsReturned_QNAME = new QName("", "numberOfContractsReturned");
    private final static QName _LacquerTypesRequestMainType_QNAME = new QName("", "mainType");
    private final static QName _CreateContractAdditionalDataForeignBrand_QNAME = new QName("", "foreignBrand");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.dat.vehiclerepaironline.services.vehiclerepairservice
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
     * Create an instance of {@link ImportDossierRequest }
     * 
     */
    public ImportDossierRequest createImportDossierRequest() {
        return new ImportDossierRequest();
    }

    /**
     * Create an instance of {@link CreateContractAdditionalData }
     * 
     */
    public CreateContractAdditionalData createCreateContractAdditionalData() {
        return new CreateContractAdditionalData();
    }

    /**
     * Create an instance of {@link ContractRequest }
     * 
     */
    public ContractRequest createContractRequest() {
        return new ContractRequest();
    }

    /**
     * Create an instance of {@link ContractRequest.ExternalProviders }
     * 
     */
    public ContractRequest.ExternalProviders createContractRequestExternalProviders() {
        return new ContractRequest.ExternalProviders();
    }

    /**
     * Create an instance of {@link ContractRequest.ExternalProviderParams }
     * 
     */
    public ContractRequest.ExternalProviderParams createContractRequestExternalProviderParams() {
        return new ContractRequest.ExternalProviderParams();
    }

    /**
     * Create an instance of {@link GetCalculationResultsResponse }
     * 
     */
    public GetCalculationResultsResponse createGetCalculationResultsResponse() {
        return new GetCalculationResultsResponse();
    }

    /**
     * Create an instance of {@link CalculateResponse }
     * 
     */
    public CalculateResponse createCalculateResponse() {
        return new CalculateResponse();
    }

    /**
     * Create an instance of {@link ImportManualPositions }
     * 
     */
    public ImportManualPositions createImportManualPositions() {
        return new ImportManualPositions();
    }

    /**
     * Create an instance of {@link DatContractListResponse }
     * 
     */
    public DatContractListResponse createDatContractListResponse() {
        return new DatContractListResponse();
    }

    /**
     * Create an instance of {@link ExportManualPositionsResponse }
     * 
     */
    public ExportManualPositionsResponse createExportManualPositionsResponse() {
        return new ExportManualPositionsResponse();
    }

    /**
     * Create an instance of {@link GetContractResponse }
     * 
     */
    public GetContractResponse createGetContractResponse() {
        return new GetContractResponse();
    }

    /**
     * Create an instance of {@link GetMaintenanceIntervalsResponse }
     * 
     */
    public GetMaintenanceIntervalsResponse createGetMaintenanceIntervalsResponse() {
        return new GetMaintenanceIntervalsResponse();
    }

    /**
     * Create an instance of {@link CalculateContractResponse }
     * 
     */
    public CalculateContractResponse createCalculateContractResponse() {
        return new CalculateContractResponse();
    }

    /**
     * Create an instance of {@link CalculateRequest }
     * 
     */
    public CalculateRequest createCalculateRequest() {
        return new CalculateRequest();
    }

    /**
     * Create an instance of {@link CalculateRequest.ExternalProviders }
     * 
     */
    public CalculateRequest.ExternalProviders createCalculateRequestExternalProviders() {
        return new CalculateRequest.ExternalProviders();
    }

    /**
     * Create an instance of {@link CalculateRequest.ExternalProviderParams }
     * 
     */
    public CalculateRequest.ExternalProviderParams createCalculateRequestExternalProviderParams() {
        return new CalculateRequest.ExternalProviderParams();
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
     * Create an instance of {@link de.dat.vehiclerepaironline.services.vehiclerepairservice.Maintenance }
     * 
     */
    public de.dat.vehiclerepaironline.services.vehiclerepairservice.Maintenance createMaintenance() {
        return new de.dat.vehiclerepaironline.services.vehiclerepairservice.Maintenance();
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
     * Create an instance of {@link de.dat.vehiclerepaironline.services.vehiclerepairservice.MetaPositions }
     * 
     */
    public de.dat.vehiclerepaironline.services.vehiclerepairservice.MetaPositions createMetaPositions() {
        return new de.dat.vehiclerepaironline.services.vehiclerepairservice.MetaPositions();
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
     * Create an instance of {@link de.dat.vehiclerepaironline.services.vehiclerepairservice.Dossiers }
     * 
     */
    public de.dat.vehiclerepaironline.services.vehiclerepairservice.Dossiers createDossiers() {
        return new de.dat.vehiclerepaironline.services.vehiclerepairservice.Dossiers();
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
     * Create an instance of {@link de.dat.vehiclerepaironline.services.vehiclerepairservice.CalculationWages }
     * 
     */
    public de.dat.vehiclerepaironline.services.vehiclerepairservice.CalculationWages createCalculationWages() {
        return new de.dat.vehiclerepaironline.services.vehiclerepairservice.CalculationWages();
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
     * Create an instance of {@link DatPosition }
     * 
     */
    public DatPosition createDatPosition() {
        return new DatPosition();
    }

    /**
     * Create an instance of {@link DatManPositions }
     * 
     */
    public DatManPositions createDatManPositions() {
        return new DatManPositions();
    }

    /**
     * Create an instance of {@link DatCategory }
     * 
     */
    public DatCategory createDatCategory() {
        return new DatCategory();
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
     * Create an instance of {@link ImportDossier }
     * 
     */
    public ImportDossier createImportDossier() {
        return new ImportDossier();
    }

    /**
     * Create an instance of {@link ListTemplates }
     * 
     */
    public ListTemplates createListTemplates() {
        return new ListTemplates();
    }

    /**
     * Create an instance of {@link CreateContract106 }
     * 
     */
    public CreateContract106 createCreateContract106() {
        return new CreateContract106();
    }

    /**
     * Create an instance of {@link CalculateContract }
     * 
     */
    public CalculateContract createCalculateContract() {
        return new CalculateContract();
    }

    /**
     * Create an instance of {@link ExportDossierToDocument }
     * 
     */
    public ExportDossierToDocument createExportDossierToDocument() {
        return new ExportDossierToDocument();
    }

    /**
     * Create an instance of {@link GetContract }
     * 
     */
    public GetContract createGetContract() {
        return new GetContract();
    }

    /**
     * Create an instance of {@link GetLacquerTypeKeys }
     * 
     */
    public GetLacquerTypeKeys createGetLacquerTypeKeys() {
        return new GetLacquerTypeKeys();
    }

    /**
     * Create an instance of {@link CalculateContractRequest }
     * 
     */
    public CalculateContractRequest createCalculateContractRequest() {
        return new CalculateContractRequest();
    }

    /**
     * Create an instance of {@link GetTemplates }
     * 
     */
    public GetTemplates createGetTemplates() {
        return new GetTemplates();
    }

    /**
     * Create an instance of {@link GetDPNDependenciesSimulationResponse }
     * 
     */
    public GetDPNDependenciesSimulationResponse createGetDPNDependenciesSimulationResponse() {
        return new GetDPNDependenciesSimulationResponse();
    }

    /**
     * Create an instance of {@link GetMaintenanceIntervals }
     * 
     */
    public GetMaintenanceIntervals createGetMaintenanceIntervals() {
        return new GetMaintenanceIntervals();
    }

    /**
     * Create an instance of {@link CreateContractResponse }
     * 
     */
    public CreateContractResponse createCreateContractResponse() {
        return new CreateContractResponse();
    }

    /**
     * Create an instance of {@link GetLastPriceGenerationByMfrResponse }
     * 
     */
    public GetLastPriceGenerationByMfrResponse createGetLastPriceGenerationByMfrResponse() {
        return new GetLastPriceGenerationByMfrResponse();
    }

    /**
     * Create an instance of {@link Calculate }
     * 
     */
    public Calculate createCalculate() {
        return new Calculate();
    }

    /**
     * Create an instance of {@link CreateContract }
     * 
     */
    public CreateContract createCreateContract() {
        return new CreateContract();
    }

    /**
     * Create an instance of {@link GetLastPriceGenerationByMfr }
     * 
     */
    public GetLastPriceGenerationByMfr createGetLastPriceGenerationByMfr() {
        return new GetLastPriceGenerationByMfr();
    }

    /**
     * Create an instance of {@link GetAssemblyGroupGraphic }
     * 
     */
    public GetAssemblyGroupGraphic createGetAssemblyGroupGraphic() {
        return new GetAssemblyGroupGraphic();
    }

    /**
     * Create an instance of {@link GetContractList }
     * 
     */
    public GetContractList createGetContractList() {
        return new GetContractList();
    }

    /**
     * Create an instance of {@link GetAssemblyGroups }
     * 
     */
    public GetAssemblyGroups createGetAssemblyGroups() {
        return new GetAssemblyGroups();
    }

    /**
     * Create an instance of {@link GetLacquerTypeKeysResponse }
     * 
     */
    public GetLacquerTypeKeysResponse createGetLacquerTypeKeysResponse() {
        return new GetLacquerTypeKeysResponse();
    }

    /**
     * Create an instance of {@link SetBlanketCalculationResponse }
     * 
     */
    public SetBlanketCalculationResponse createSetBlanketCalculationResponse() {
        return new SetBlanketCalculationResponse();
    }

    /**
     * Create an instance of {@link GetContractPriceGenerationsResponse }
     * 
     */
    public GetContractPriceGenerationsResponse createGetContractPriceGenerationsResponse() {
        return new GetContractPriceGenerationsResponse();
    }

    /**
     * Create an instance of {@link GetContractRequest }
     * 
     */
    public GetContractRequest createGetContractRequest() {
        return new GetContractRequest();
    }

    /**
     * Create an instance of {@link GetCalculationResults }
     * 
     */
    public GetCalculationResults createGetCalculationResults() {
        return new GetCalculationResults();
    }

    /**
     * Create an instance of {@link SetContractPriceGenerationResponse }
     * 
     */
    public SetContractPriceGenerationResponse createSetContractPriceGenerationResponse() {
        return new SetContractPriceGenerationResponse();
    }

    /**
     * Create an instance of {@link GetDPNDependenciesSimulation }
     * 
     */
    public GetDPNDependenciesSimulation createGetDPNDependenciesSimulation() {
        return new GetDPNDependenciesSimulation();
    }

    /**
     * Create an instance of {@link DeleteAllManualPositionsResponse }
     * 
     */
    public DeleteAllManualPositionsResponse createDeleteAllManualPositionsResponse() {
        return new DeleteAllManualPositionsResponse();
    }

    /**
     * Create an instance of {@link GetValidDATProcessesResponse }
     * 
     */
    public GetValidDATProcessesResponse createGetValidDATProcessesResponse() {
        return new GetValidDATProcessesResponse();
    }

    /**
     * Create an instance of {@link GetDVNEquipments }
     * 
     */
    public GetDVNEquipments createGetDVNEquipments() {
        return new GetDVNEquipments();
    }

    /**
     * Create an instance of {@link DatProcessEquipmentsRequest }
     * 
     */
    public DatProcessEquipmentsRequest createDatProcessEquipmentsRequest() {
        return new DatProcessEquipmentsRequest();
    }

    /**
     * Create an instance of {@link ExportDossierToDocumentResponse }
     * 
     */
    public ExportDossierToDocumentResponse createExportDossierToDocumentResponse() {
        return new ExportDossierToDocumentResponse();
    }

    /**
     * Create an instance of {@link GetContractPriceGenerations }
     * 
     */
    public GetContractPriceGenerations createGetContractPriceGenerations() {
        return new GetContractPriceGenerations();
    }

    /**
     * Create an instance of {@link CreateContract106Response }
     * 
     */
    public CreateContract106Response createCreateContract106Response() {
        return new CreateContract106Response();
    }

    /**
     * Create an instance of {@link GetInsurancesResponse }
     * 
     */
    public GetInsurancesResponse createGetInsurancesResponse() {
        return new GetInsurancesResponse();
    }

    /**
     * Create an instance of {@link GetTemplatesResponse }
     * 
     */
    public GetTemplatesResponse createGetTemplatesResponse() {
        return new GetTemplatesResponse();
    }

    /**
     * Create an instance of {@link GetAssemblyGroupGraphicResponse }
     * 
     */
    public GetAssemblyGroupGraphicResponse createGetAssemblyGroupGraphicResponse() {
        return new GetAssemblyGroupGraphicResponse();
    }

    /**
     * Create an instance of {@link SetBlanketClaculationResponse }
     * 
     */
    public SetBlanketClaculationResponse createSetBlanketClaculationResponse() {
        return new SetBlanketClaculationResponse();
    }

    /**
     * Create an instance of {@link ListTemplatesResponse }
     * 
     */
    public ListTemplatesResponse createListTemplatesResponse() {
        return new ListTemplatesResponse();
    }

    /**
     * Create an instance of {@link GetAssemblyGroupsNResponse }
     * 
     */
    public GetAssemblyGroupsNResponse createGetAssemblyGroupsNResponse() {
        return new GetAssemblyGroupsNResponse();
    }

    /**
     * Create an instance of {@link ImportDossierResponse }
     * 
     */
    public ImportDossierResponse createImportDossierResponse() {
        return new ImportDossierResponse();
    }

    /**
     * Create an instance of {@link GetDVNEquipmentsResponse }
     * 
     */
    public GetDVNEquipmentsResponse createGetDVNEquipmentsResponse() {
        return new GetDVNEquipmentsResponse();
    }

    /**
     * Create an instance of {@link GetValidDATProcesses }
     * 
     */
    public GetValidDATProcesses createGetValidDATProcesses() {
        return new GetValidDATProcesses();
    }

    /**
     * Create an instance of {@link GetContractListResponse }
     * 
     */
    public GetContractListResponse createGetContractListResponse() {
        return new GetContractListResponse();
    }

    /**
     * Create an instance of {@link GetLockedInfoResponse }
     * 
     */
    public GetLockedInfoResponse createGetLockedInfoResponse() {
        return new GetLockedInfoResponse();
    }

    /**
     * Create an instance of {@link SetBlanketCalculation }
     * 
     */
    public SetBlanketCalculation createSetBlanketCalculation() {
        return new SetBlanketCalculation();
    }

    /**
     * Create an instance of {@link GetAssemblyGroupsN }
     * 
     */
    public GetAssemblyGroupsN createGetAssemblyGroupsN() {
        return new GetAssemblyGroupsN();
    }

    /**
     * Create an instance of {@link GetAssemblyGroupsResponse }
     * 
     */
    public GetAssemblyGroupsResponse createGetAssemblyGroupsResponse() {
        return new GetAssemblyGroupsResponse();
    }

    /**
     * Create an instance of {@link ExportManualPositions }
     * 
     */
    public ExportManualPositions createExportManualPositions() {
        return new ExportManualPositions();
    }

    /**
     * Create an instance of {@link ExportToDocumentResponse }
     * 
     */
    public ExportToDocumentResponse createExportToDocumentResponse() {
        return new ExportToDocumentResponse();
    }

    /**
     * Create an instance of {@link SetContractPriceGeneration }
     * 
     */
    public SetContractPriceGeneration createSetContractPriceGeneration() {
        return new SetContractPriceGeneration();
    }

    /**
     * Create an instance of {@link ImportManualPositionsResponse }
     * 
     */
    public ImportManualPositionsResponse createImportManualPositionsResponse() {
        return new ImportManualPositionsResponse();
    }

    /**
     * Create an instance of {@link DpnDependenciesResponse }
     * 
     */
    public DpnDependenciesResponse createDpnDependenciesResponse() {
        return new DpnDependenciesResponse();
    }

    /**
     * Create an instance of {@link GetInsurances }
     * 
     */
    public GetInsurances createGetInsurances() {
        return new GetInsurances();
    }

    /**
     * Create an instance of {@link DeleteAllManualPositions }
     * 
     */
    public DeleteAllManualPositions createDeleteAllManualPositions() {
        return new DeleteAllManualPositions();
    }

    /**
     * Create an instance of {@link MaintenanceRequest }
     * 
     */
    public MaintenanceRequest createMaintenanceRequest() {
        return new MaintenanceRequest();
    }

    /**
     * Create an instance of {@link DpnDependenciesRequest }
     * 
     */
    public DpnDependenciesRequest createDpnDependenciesRequest() {
        return new DpnDependenciesRequest();
    }

    /**
     * Create an instance of {@link GetLockedInfo }
     * 
     */
    public GetLockedInfo createGetLockedInfo() {
        return new GetLockedInfo();
    }

    /**
     * Create an instance of {@link ExportToDocument }
     * 
     */
    public ExportToDocument createExportToDocument() {
        return new ExportToDocument();
    }

    /**
     * Create an instance of {@link ChangePriceDatesResponse }
     * 
     */
    public ChangePriceDatesResponse createChangePriceDatesResponse() {
        return new ChangePriceDatesResponse();
    }

    /**
     * Create an instance of {@link AssemblyGroup }
     * 
     */
    public AssemblyGroup createAssemblyGroup() {
        return new AssemblyGroup();
    }

    /**
     * Create an instance of {@link DATContractListRequest }
     * 
     */
    public DATContractListRequest createDATContractListRequest() {
        return new DATContractListRequest();
    }

    /**
     * Create an instance of {@link ChangePriceDatesRequest }
     * 
     */
    public ChangePriceDatesRequest createChangePriceDatesRequest() {
        return new ChangePriceDatesRequest();
    }

    /**
     * Create an instance of {@link DossiersDatProcessInfos }
     * 
     */
    public DossiersDatProcessInfos createDossiersDatProcessInfos() {
        return new DossiersDatProcessInfos();
    }

    /**
     * Create an instance of {@link LacquerType }
     * 
     */
    public LacquerType createLacquerType() {
        return new LacquerType();
    }

    /**
     * Create an instance of {@link InsuranceResponse }
     * 
     */
    public InsuranceResponse createInsuranceResponse() {
        return new InsuranceResponse();
    }

    /**
     * Create an instance of {@link CreateContractCalculationWage }
     * 
     */
    public CreateContractCalculationWage createCreateContractCalculationWage() {
        return new CreateContractCalculationWage();
    }

    /**
     * Create an instance of {@link Restriction }
     * 
     */
    public Restriction createRestriction() {
        return new Restriction();
    }

    /**
     * Create an instance of {@link LacquerTypesResponse }
     * 
     */
    public LacquerTypesResponse createLacquerTypesResponse() {
        return new LacquerTypesResponse();
    }

    /**
     * Create an instance of {@link ExportToDocumentRequest }
     * 
     */
    public ExportToDocumentRequest createExportToDocumentRequest() {
        return new ExportToDocumentRequest();
    }

    /**
     * Create an instance of {@link DatProcessesRequest }
     * 
     */
    public DatProcessesRequest createDatProcessesRequest() {
        return new DatProcessesRequest();
    }

    /**
     * Create an instance of {@link PriceDatesResponse }
     * 
     */
    public PriceDatesResponse createPriceDatesResponse() {
        return new PriceDatesResponse();
    }

    /**
     * Create an instance of {@link ContractRequest106 }
     * 
     */
    public ContractRequest106 createContractRequest106() {
        return new ContractRequest106();
    }

    /**
     * Create an instance of {@link InsurancesRequest }
     * 
     */
    public InsurancesRequest createInsurancesRequest() {
        return new InsurancesRequest();
    }

    /**
     * Create an instance of {@link DpnMaterialPosition }
     * 
     */
    public DpnMaterialPosition createDpnMaterialPosition() {
        return new DpnMaterialPosition();
    }

    /**
     * Create an instance of {@link Insurance }
     * 
     */
    public Insurance createInsurance() {
        return new Insurance();
    }

    /**
     * Create an instance of {@link DatProcessInfoEquipments }
     * 
     */
    public DatProcessInfoEquipments createDatProcessInfoEquipments() {
        return new DatProcessInfoEquipments();
    }

    /**
     * Create an instance of {@link DatProcessInfo }
     * 
     */
    public DatProcessInfo createDatProcessInfo() {
        return new DatProcessInfo();
    }

    /**
     * Create an instance of {@link SortingCriterions }
     * 
     */
    public SortingCriterions createSortingCriterions() {
        return new SortingCriterions();
    }

    /**
     * Create an instance of {@link MaterialPositionData }
     * 
     */
    public MaterialPositionData createMaterialPositionData() {
        return new MaterialPositionData();
    }

    /**
     * Create an instance of {@link Settings }
     * 
     */
    public Settings createSettings() {
        return new Settings();
    }

    /**
     * Create an instance of {@link Equipment2 }
     * 
     */
    public Equipment2 createEquipment2() {
        return new Equipment2();
    }

    /**
     * Create an instance of {@link ServiceEntry }
     * 
     */
    public ServiceEntry createServiceEntry() {
        return new ServiceEntry();
    }

    /**
     * Create an instance of {@link OrderInfo }
     * 
     */
    public OrderInfo createOrderInfo() {
        return new OrderInfo();
    }

    /**
     * Create an instance of {@link ExportProduct }
     * 
     */
    public ExportProduct createExportProduct() {
        return new ExportProduct();
    }

    /**
     * Create an instance of {@link PaintingColorDescription }
     * 
     */
    public PaintingColorDescription createPaintingColorDescription() {
        return new PaintingColorDescription();
    }

    /**
     * Create an instance of {@link Locale }
     * 
     */
    public Locale createLocale() {
        return new Locale();
    }

    /**
     * Create an instance of {@link CreateContractMetaPosition }
     * 
     */
    public CreateContractMetaPosition createCreateContractMetaPosition() {
        return new CreateContractMetaPosition();
    }

    /**
     * Create an instance of {@link PriceDate }
     * 
     */
    public PriceDate createPriceDate() {
        return new PriceDate();
    }

    /**
     * Create an instance of {@link SetBlanketCalculationRequest }
     * 
     */
    public SetBlanketCalculationRequest createSetBlanketCalculationRequest() {
        return new SetBlanketCalculationRequest();
    }

    /**
     * Create an instance of {@link DossierDatProcessInfos }
     * 
     */
    public DossierDatProcessInfos createDossierDatProcessInfos() {
        return new DossierDatProcessInfos();
    }

    /**
     * Create an instance of {@link InsuranceCaseDescription }
     * 
     */
    public InsuranceCaseDescription createInsuranceCaseDescription() {
        return new InsuranceCaseDescription();
    }

    /**
     * Create an instance of {@link CalculationWage2 }
     * 
     */
    public CalculationWage2 createCalculationWage2() {
        return new CalculationWage2();
    }

    /**
     * Create an instance of {@link LacquerTypesRequest }
     * 
     */
    public LacquerTypesRequest createLacquerTypesRequest() {
        return new LacquerTypesRequest();
    }

    /**
     * Create an instance of {@link HashMap }
     * 
     */
    public HashMap createHashMap() {
        return new HashMap();
    }

    /**
     * Create an instance of {@link ImportDossierRequest.Dossiers }
     * 
     */
    public ImportDossierRequest.Dossiers createImportDossierRequestDossiers() {
        return new ImportDossierRequest.Dossiers();
    }

    /**
     * Create an instance of {@link CreateContractAdditionalData.CalculationWages }
     * 
     */
    public CreateContractAdditionalData.CalculationWages createCreateContractAdditionalDataCalculationWages() {
        return new CreateContractAdditionalData.CalculationWages();
    }

    /**
     * Create an instance of {@link CreateContractAdditionalData.MetaPositions }
     * 
     */
    public CreateContractAdditionalData.MetaPositions createCreateContractAdditionalDataMetaPositions() {
        return new CreateContractAdditionalData.MetaPositions();
    }

    /**
     * Create an instance of {@link ContractRequest.CalculationWages }
     * 
     */
    public ContractRequest.CalculationWages createContractRequestCalculationWages() {
        return new ContractRequest.CalculationWages();
    }

    /**
     * Create an instance of {@link ContractRequest.ExternalProviders.Entry }
     * 
     */
    public ContractRequest.ExternalProviders.Entry createContractRequestExternalProvidersEntry() {
        return new ContractRequest.ExternalProviders.Entry();
    }

    /**
     * Create an instance of {@link ContractRequest.ExternalProviderParams.Entry }
     * 
     */
    public ContractRequest.ExternalProviderParams.Entry createContractRequestExternalProviderParamsEntry() {
        return new ContractRequest.ExternalProviderParams.Entry();
    }

    /**
     * Create an instance of {@link GetCalculationResultsResponse.CalculationResult }
     * 
     */
    public GetCalculationResultsResponse.CalculationResult createGetCalculationResultsResponseCalculationResult() {
        return new GetCalculationResultsResponse.CalculationResult();
    }

    /**
     * Create an instance of {@link CalculateResponse.CalculationResult }
     * 
     */
    public CalculateResponse.CalculationResult createCalculateResponseCalculationResult() {
        return new CalculateResponse.CalculationResult();
    }

    /**
     * Create an instance of {@link ImportManualPositions.Request }
     * 
     */
    public ImportManualPositions.Request createImportManualPositionsRequest() {
        return new ImportManualPositions.Request();
    }

    /**
     * Create an instance of {@link DatContractListResponse.Dossiers }
     * 
     */
    public DatContractListResponse.Dossiers createDatContractListResponseDossiers() {
        return new DatContractListResponse.Dossiers();
    }

    /**
     * Create an instance of {@link ExportManualPositionsResponse.ManualPositions }
     * 
     */
    public ExportManualPositionsResponse.ManualPositions createExportManualPositionsResponseManualPositions() {
        return new ExportManualPositionsResponse.ManualPositions();
    }

    /**
     * Create an instance of {@link GetContractResponse.ContractResult }
     * 
     */
    public GetContractResponse.ContractResult createGetContractResponseContractResult() {
        return new GetContractResponse.ContractResult();
    }

    /**
     * Create an instance of {@link GetMaintenanceIntervalsResponse.Maintenance }
     * 
     */
    public GetMaintenanceIntervalsResponse.Maintenance createGetMaintenanceIntervalsResponseMaintenance() {
        return new GetMaintenanceIntervalsResponse.Maintenance();
    }

    /**
     * Create an instance of {@link CalculateContractResponse.CalculationResult }
     * 
     */
    public CalculateContractResponse.CalculationResult createCalculateContractResponseCalculationResult() {
        return new CalculateContractResponse.CalculationResult();
    }

    /**
     * Create an instance of {@link CalculateRequest.CalculationWages }
     * 
     */
    public CalculateRequest.CalculationWages createCalculateRequestCalculationWages() {
        return new CalculateRequest.CalculationWages();
    }

    /**
     * Create an instance of {@link CalculateRequest.ExternalProviders.Entry }
     * 
     */
    public CalculateRequest.ExternalProviders.Entry createCalculateRequestExternalProvidersEntry() {
        return new CalculateRequest.ExternalProviders.Entry();
    }

    /**
     * Create an instance of {@link CalculateRequest.ExternalProviderParams.Entry }
     * 
     */
    public CalculateRequest.ExternalProviderParams.Entry createCalculateRequestExternalProviderParamsEntry() {
        return new CalculateRequest.ExternalProviderParams.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportManualPositions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "exportManualPositions")
    public JAXBElement<ExportManualPositions> createExportManualPositions(ExportManualPositions value) {
        return new JAXBElement<ExportManualPositions>(_ExportManualPositions_QNAME, ExportManualPositions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssemblyGroupsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getAssemblyGroupsResponse")
    public JAXBElement<GetAssemblyGroupsResponse> createGetAssemblyGroupsResponse(GetAssemblyGroupsResponse value) {
        return new JAXBElement<GetAssemblyGroupsResponse>(_GetAssemblyGroupsResponse_QNAME, GetAssemblyGroupsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "ContractRequest")
    public JAXBElement<ContractRequest> createContractRequest(ContractRequest value) {
        return new JAXBElement<ContractRequest>(_ContractRequest_QNAME, ContractRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportToDocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "exportToDocumentResponse")
    public JAXBElement<ExportToDocumentResponse> createExportToDocumentResponse(ExportToDocumentResponse value) {
        return new JAXBElement<ExportToDocumentResponse>(_ExportToDocumentResponse_QNAME, ExportToDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetContractPriceGeneration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "setContractPriceGeneration")
    public JAXBElement<SetContractPriceGeneration> createSetContractPriceGeneration(SetContractPriceGeneration value) {
        return new JAXBElement<SetContractPriceGeneration>(_SetContractPriceGeneration_QNAME, SetContractPriceGeneration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDVNEquipmentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getDVNEquipmentsResponse")
    public JAXBElement<GetDVNEquipmentsResponse> createGetDVNEquipmentsResponse(GetDVNEquipmentsResponse value) {
        return new JAXBElement<GetDVNEquipmentsResponse>(_GetDVNEquipmentsResponse_QNAME, GetDVNEquipmentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssemblyGroupsN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getAssemblyGroupsN")
    public JAXBElement<GetAssemblyGroupsN> createGetAssemblyGroupsN(GetAssemblyGroupsN value) {
        return new JAXBElement<GetAssemblyGroupsN>(_GetAssemblyGroupsN_QNAME, GetAssemblyGroupsN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContractListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getContractListResponse")
    public JAXBElement<GetContractListResponse> createGetContractListResponse(GetContractListResponse value) {
        return new JAXBElement<GetContractListResponse>(_GetContractListResponse_QNAME, GetContractListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLockedInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getLockedInfoResponse")
    public JAXBElement<GetLockedInfoResponse> createGetLockedInfoResponse(GetLockedInfoResponse value) {
        return new JAXBElement<GetLockedInfoResponse>(_GetLockedInfoResponse_QNAME, GetLockedInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetBlanketCalculation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "setBlanketCalculation")
    public JAXBElement<SetBlanketCalculation> createSetBlanketCalculation(SetBlanketCalculation value) {
        return new JAXBElement<SetBlanketCalculation>(_SetBlanketCalculation_QNAME, SetBlanketCalculation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValidDATProcesses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getValidDATProcesses")
    public JAXBElement<GetValidDATProcesses> createGetValidDATProcesses(GetValidDATProcesses value) {
        return new JAXBElement<GetValidDATProcesses>(_GetValidDATProcesses_QNAME, GetValidDATProcesses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DpnDependenciesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "DPNDependenciesRequest")
    public JAXBElement<DpnDependenciesRequest> createDPNDependenciesRequest(DpnDependenciesRequest value) {
        return new JAXBElement<DpnDependenciesRequest>(_DPNDependenciesRequest_QNAME, DpnDependenciesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLockedInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getLockedInfo")
    public JAXBElement<GetLockedInfo> createGetLockedInfo(GetLockedInfo value) {
        return new JAXBElement<GetLockedInfo>(_GetLockedInfo_QNAME, GetLockedInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportToDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "exportToDocument")
    public JAXBElement<ExportToDocument> createExportToDocument(ExportToDocument value) {
        return new JAXBElement<ExportToDocument>(_ExportToDocument_QNAME, ExportToDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportManualPositionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "importManualPositionsResponse")
    public JAXBElement<ImportManualPositionsResponse> createImportManualPositionsResponse(ImportManualPositionsResponse value) {
        return new JAXBElement<ImportManualPositionsResponse>(_ImportManualPositionsResponse_QNAME, ImportManualPositionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintenanceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "MaintenanceRequest")
    public JAXBElement<MaintenanceRequest> createMaintenanceRequest(MaintenanceRequest value) {
        return new JAXBElement<MaintenanceRequest>(_MaintenanceRequest_QNAME, MaintenanceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAllManualPositions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "deleteAllManualPositions")
    public JAXBElement<DeleteAllManualPositions> createDeleteAllManualPositions(DeleteAllManualPositions value) {
        return new JAXBElement<DeleteAllManualPositions>(_DeleteAllManualPositions_QNAME, DeleteAllManualPositions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "ChangePriceDatesRequest")
    public JAXBElement<Object> createChangePriceDatesRequest(Object value) {
        return new JAXBElement<Object>(_ChangePriceDatesRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInsurances }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getInsurances")
    public JAXBElement<GetInsurances> createGetInsurances(GetInsurances value) {
        return new JAXBElement<GetInsurances>(_GetInsurances_QNAME, GetInsurances.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DpnDependenciesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "DPNDependenciesResponse")
    public JAXBElement<DpnDependenciesResponse> createDPNDependenciesResponse(DpnDependenciesResponse value) {
        return new JAXBElement<DpnDependenciesResponse>(_DPNDependenciesResponse_QNAME, DpnDependenciesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTemplatesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getTemplatesResponse")
    public JAXBElement<GetTemplatesResponse> createGetTemplatesResponse(GetTemplatesResponse value) {
        return new JAXBElement<GetTemplatesResponse>(_GetTemplatesResponse_QNAME, GetTemplatesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssemblyGroupGraphicResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getAssemblyGroupGraphicResponse")
    public JAXBElement<GetAssemblyGroupGraphicResponse> createGetAssemblyGroupGraphicResponse(GetAssemblyGroupGraphicResponse value) {
        return new JAXBElement<GetAssemblyGroupGraphicResponse>(_GetAssemblyGroupGraphicResponse_QNAME, GetAssemblyGroupGraphicResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateContract106Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "createContract106Response")
    public JAXBElement<CreateContract106Response> createCreateContract106Response(CreateContract106Response value) {
        return new JAXBElement<CreateContract106Response>(_CreateContract106Response_QNAME, CreateContract106Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContractPriceGenerations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getContractPriceGenerations")
    public JAXBElement<GetContractPriceGenerations> createGetContractPriceGenerations(GetContractPriceGenerations value) {
        return new JAXBElement<GetContractPriceGenerations>(_GetContractPriceGenerations_QNAME, GetContractPriceGenerations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInsurancesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getInsurancesResponse")
    public JAXBElement<GetInsurancesResponse> createGetInsurancesResponse(GetInsurancesResponse value) {
        return new JAXBElement<GetInsurancesResponse>(_GetInsurancesResponse_QNAME, GetInsurancesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatContractListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "DATContractListResponse")
    public JAXBElement<DatContractListResponse> createDATContractListResponse(DatContractListResponse value) {
        return new JAXBElement<DatContractListResponse>(_DATContractListResponse_QNAME, DatContractListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "calculateResponse")
    public JAXBElement<CalculateResponse> createCalculateResponse(CalculateResponse value) {
        return new JAXBElement<CalculateResponse>(_CalculateResponse_QNAME, CalculateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCalculationResultsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getCalculationResultsResponse")
    public JAXBElement<GetCalculationResultsResponse> createGetCalculationResultsResponse(GetCalculationResultsResponse value) {
        return new JAXBElement<GetCalculationResultsResponse>(_GetCalculationResultsResponse_QNAME, GetCalculationResultsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssemblyGroupsNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getAssemblyGroupsNResponse")
    public JAXBElement<GetAssemblyGroupsNResponse> createGetAssemblyGroupsNResponse(GetAssemblyGroupsNResponse value) {
        return new JAXBElement<GetAssemblyGroupsNResponse>(_GetAssemblyGroupsNResponse_QNAME, GetAssemblyGroupsNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportDossierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "importDossierResponse")
    public JAXBElement<ImportDossierResponse> createImportDossierResponse(ImportDossierResponse value) {
        return new JAXBElement<ImportDossierResponse>(_ImportDossierResponse_QNAME, ImportDossierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetBlanketClaculationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "SetBlanketClaculationResponse")
    public JAXBElement<SetBlanketClaculationResponse> createSetBlanketClaculationResponse(SetBlanketClaculationResponse value) {
        return new JAXBElement<SetBlanketClaculationResponse>(_SetBlanketClaculationResponse_QNAME, SetBlanketClaculationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListTemplatesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "listTemplatesResponse")
    public JAXBElement<ListTemplatesResponse> createListTemplatesResponse(ListTemplatesResponse value) {
        return new JAXBElement<ListTemplatesResponse>(_ListTemplatesResponse_QNAME, ListTemplatesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportManualPositions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "importManualPositions")
    public JAXBElement<ImportManualPositions> createImportManualPositions(ImportManualPositions value) {
        return new JAXBElement<ImportManualPositions>(_ImportManualPositions_QNAME, ImportManualPositions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContractRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "GetContractRequest")
    public JAXBElement<GetContractRequest> createGetContractRequest(GetContractRequest value) {
        return new JAXBElement<GetContractRequest>(_GetContractRequest_QNAME, GetContractRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCalculationResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getCalculationResults")
    public JAXBElement<GetCalculationResults> createGetCalculationResults(GetCalculationResults value) {
        return new JAXBElement<GetCalculationResults>(_GetCalculationResults_QNAME, GetCalculationResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetContractPriceGenerationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "setContractPriceGenerationResponse")
    public JAXBElement<SetContractPriceGenerationResponse> createSetContractPriceGenerationResponse(SetContractPriceGenerationResponse value) {
        return new JAXBElement<SetContractPriceGenerationResponse>(_SetContractPriceGenerationResponse_QNAME, SetContractPriceGenerationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContractPriceGenerationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getContractPriceGenerationsResponse")
    public JAXBElement<GetContractPriceGenerationsResponse> createGetContractPriceGenerationsResponse(GetContractPriceGenerationsResponse value) {
        return new JAXBElement<GetContractPriceGenerationsResponse>(_GetContractPriceGenerationsResponse_QNAME, GetContractPriceGenerationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetBlanketCalculationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "setBlanketCalculationResponse")
    public JAXBElement<SetBlanketCalculationResponse> createSetBlanketCalculationResponse(SetBlanketCalculationResponse value) {
        return new JAXBElement<SetBlanketCalculationResponse>(_SetBlanketCalculationResponse_QNAME, SetBlanketCalculationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssemblyGroups }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getAssemblyGroups")
    public JAXBElement<GetAssemblyGroups> createGetAssemblyGroups(GetAssemblyGroups value) {
        return new JAXBElement<GetAssemblyGroups>(_GetAssemblyGroups_QNAME, GetAssemblyGroups.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLacquerTypeKeysResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getLacquerTypeKeysResponse")
    public JAXBElement<GetLacquerTypeKeysResponse> createGetLacquerTypeKeysResponse(GetLacquerTypeKeysResponse value) {
        return new JAXBElement<GetLacquerTypeKeysResponse>(_GetLacquerTypeKeysResponse_QNAME, GetLacquerTypeKeysResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContractResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getContractResponse")
    public JAXBElement<GetContractResponse> createGetContractResponse(GetContractResponse value) {
        return new JAXBElement<GetContractResponse>(_GetContractResponse_QNAME, GetContractResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDVNEquipments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getDVNEquipments")
    public JAXBElement<GetDVNEquipments> createGetDVNEquipments(GetDVNEquipments value) {
        return new JAXBElement<GetDVNEquipments>(_GetDVNEquipments_QNAME, GetDVNEquipments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportManualPositionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "exportManualPositionsResponse")
    public JAXBElement<ExportManualPositionsResponse> createExportManualPositionsResponse(ExportManualPositionsResponse value) {
        return new JAXBElement<ExportManualPositionsResponse>(_ExportManualPositionsResponse_QNAME, ExportManualPositionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportDossierToDocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "exportDossierToDocumentResponse")
    public JAXBElement<ExportDossierToDocumentResponse> createExportDossierToDocumentResponse(ExportDossierToDocumentResponse value) {
        return new JAXBElement<ExportDossierToDocumentResponse>(_ExportDossierToDocumentResponse_QNAME, ExportDossierToDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatProcessEquipmentsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "DatProcessEquipmentsRequestRequest")
    public JAXBElement<DatProcessEquipmentsRequest> createDatProcessEquipmentsRequestRequest(DatProcessEquipmentsRequest value) {
        return new JAXBElement<DatProcessEquipmentsRequest>(_DatProcessEquipmentsRequestRequest_QNAME, DatProcessEquipmentsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValidDATProcessesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getValidDATProcessesResponse")
    public JAXBElement<GetValidDATProcessesResponse> createGetValidDATProcessesResponse(GetValidDATProcessesResponse value) {
        return new JAXBElement<GetValidDATProcessesResponse>(_GetValidDATProcessesResponse_QNAME, GetValidDATProcessesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAllManualPositionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "deleteAllManualPositionsResponse")
    public JAXBElement<DeleteAllManualPositionsResponse> createDeleteAllManualPositionsResponse(DeleteAllManualPositionsResponse value) {
        return new JAXBElement<DeleteAllManualPositionsResponse>(_DeleteAllManualPositionsResponse_QNAME, DeleteAllManualPositionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDPNDependenciesSimulation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getDPNDependenciesSimulation")
    public JAXBElement<GetDPNDependenciesSimulation> createGetDPNDependenciesSimulation(GetDPNDependenciesSimulation value) {
        return new JAXBElement<GetDPNDependenciesSimulation>(_GetDPNDependenciesSimulation_QNAME, GetDPNDependenciesSimulation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateContractRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "CalculateContractRequest")
    public JAXBElement<CalculateContractRequest> createCalculateContractRequest(CalculateContractRequest value) {
        return new JAXBElement<CalculateContractRequest>(_CalculateContractRequest_QNAME, CalculateContractRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTemplates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getTemplates")
    public JAXBElement<GetTemplates> createGetTemplates(GetTemplates value) {
        return new JAXBElement<GetTemplates>(_GetTemplates_QNAME, GetTemplates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMaintenanceIntervalsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getMaintenanceIntervalsResponse")
    public JAXBElement<GetMaintenanceIntervalsResponse> createGetMaintenanceIntervalsResponse(GetMaintenanceIntervalsResponse value) {
        return new JAXBElement<GetMaintenanceIntervalsResponse>(_GetMaintenanceIntervalsResponse_QNAME, GetMaintenanceIntervalsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportDossier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "importDossier")
    public JAXBElement<ImportDossier> createImportDossier(ImportDossier value) {
        return new JAXBElement<ImportDossier>(_ImportDossier_QNAME, ImportDossier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListTemplates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "listTemplates")
    public JAXBElement<ListTemplates> createListTemplates(ListTemplates value) {
        return new JAXBElement<ListTemplates>(_ListTemplates_QNAME, ListTemplates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportDossierToDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "exportDossierToDocument")
    public JAXBElement<ExportDossierToDocument> createExportDossierToDocument(ExportDossierToDocument value) {
        return new JAXBElement<ExportDossierToDocument>(_ExportDossierToDocument_QNAME, ExportDossierToDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getContract")
    public JAXBElement<GetContract> createGetContract(GetContract value) {
        return new JAXBElement<GetContract>(_GetContract_QNAME, GetContract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLacquerTypeKeys }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getLacquerTypeKeys")
    public JAXBElement<GetLacquerTypeKeys> createGetLacquerTypeKeys(GetLacquerTypeKeys value) {
        return new JAXBElement<GetLacquerTypeKeys>(_GetLacquerTypeKeys_QNAME, GetLacquerTypeKeys.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateContractResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "calculateContractResponse")
    public JAXBElement<CalculateContractResponse> createCalculateContractResponse(CalculateContractResponse value) {
        return new JAXBElement<CalculateContractResponse>(_CalculateContractResponse_QNAME, CalculateContractResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateContract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "calculateContract")
    public JAXBElement<CalculateContract> createCalculateContract(CalculateContract value) {
        return new JAXBElement<CalculateContract>(_CalculateContract_QNAME, CalculateContract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "CalculateRequest")
    public JAXBElement<CalculateRequest> createCalculateRequest(CalculateRequest value) {
        return new JAXBElement<CalculateRequest>(_CalculateRequest_QNAME, CalculateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateContract106 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "createContract106")
    public JAXBElement<CreateContract106> createCreateContract106(CreateContract106 value) {
        return new JAXBElement<CreateContract106>(_CreateContract106_QNAME, CreateContract106 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calculate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "calculate")
    public JAXBElement<Calculate> createCalculate(Calculate value) {
        return new JAXBElement<Calculate>(_Calculate_QNAME, Calculate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateContractResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "createContractResponse")
    public JAXBElement<CreateContractResponse> createCreateContractResponse(CreateContractResponse value) {
        return new JAXBElement<CreateContractResponse>(_CreateContractResponse_QNAME, CreateContractResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastPriceGenerationByMfrResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getLastPriceGenerationByMfrResponse")
    public JAXBElement<GetLastPriceGenerationByMfrResponse> createGetLastPriceGenerationByMfrResponse(GetLastPriceGenerationByMfrResponse value) {
        return new JAXBElement<GetLastPriceGenerationByMfrResponse>(_GetLastPriceGenerationByMfrResponse_QNAME, GetLastPriceGenerationByMfrResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssemblyGroupGraphic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getAssemblyGroupGraphic")
    public JAXBElement<GetAssemblyGroupGraphic> createGetAssemblyGroupGraphic(GetAssemblyGroupGraphic value) {
        return new JAXBElement<GetAssemblyGroupGraphic>(_GetAssemblyGroupGraphic_QNAME, GetAssemblyGroupGraphic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContractList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getContractList")
    public JAXBElement<GetContractList> createGetContractList(GetContractList value) {
        return new JAXBElement<GetContractList>(_GetContractList_QNAME, GetContractList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateContract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "createContract")
    public JAXBElement<CreateContract> createCreateContract(CreateContract value) {
        return new JAXBElement<CreateContract>(_CreateContract_QNAME, CreateContract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastPriceGenerationByMfr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getLastPriceGenerationByMfr")
    public JAXBElement<GetLastPriceGenerationByMfr> createGetLastPriceGenerationByMfr(GetLastPriceGenerationByMfr value) {
        return new JAXBElement<GetLastPriceGenerationByMfr>(_GetLastPriceGenerationByMfr_QNAME, GetLastPriceGenerationByMfr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDPNDependenciesSimulationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getDPNDependenciesSimulationResponse")
    public JAXBElement<GetDPNDependenciesSimulationResponse> createGetDPNDependenciesSimulationResponse(GetDPNDependenciesSimulationResponse value) {
        return new JAXBElement<GetDPNDependenciesSimulationResponse>(_GetDPNDependenciesSimulationResponse_QNAME, GetDPNDependenciesSimulationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMaintenanceIntervals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "getMaintenanceIntervals")
    public JAXBElement<GetMaintenanceIntervals> createGetMaintenanceIntervals(GetMaintenanceIntervals value) {
        return new JAXBElement<GetMaintenanceIntervals>(_GetMaintenanceIntervals_QNAME, GetMaintenanceIntervals.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleRepairService", name = "LacquerTypesResponse")
    public JAXBElement<Object> createLacquerTypesResponse(Object value) {
        return new JAXBElement<Object>(_LacquerTypesResponse_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Locale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "locale", scope = ImportDossierRequest.class)
    public JAXBElement<Locale> createImportDossierRequestLocale(Locale value) {
        return new JAXBElement<Locale>(_ImportDossierRequestLocale_QNAME, Locale.class, ImportDossierRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "message", scope = SetBlanketClaculationResponse.class)
    public JAXBElement<String> createSetBlanketClaculationResponseMessage(String value) {
        return new JAXBElement<String>(_SetBlanketClaculationResponseMessage_QNAME, String.class, SetBlanketClaculationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lacquerCosts", scope = SetBlanketCalculationRequest.class)
    public JAXBElement<String> createSetBlanketCalculationRequestLacquerCosts(String value) {
        return new JAXBElement<String>(_SetBlanketCalculationRequestLacquerCosts_QNAME, String.class, SetBlanketCalculationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "labourCosts", scope = SetBlanketCalculationRequest.class)
    public JAXBElement<String> createSetBlanketCalculationRequestLabourCosts(String value) {
        return new JAXBElement<String>(_SetBlanketCalculationRequestLabourCosts_QNAME, String.class, SetBlanketCalculationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sparePartsCosts", scope = SetBlanketCalculationRequest.class)
    public JAXBElement<String> createSetBlanketCalculationRequestSparePartsCosts(String value) {
        return new JAXBElement<String>(_SetBlanketCalculationRequestSparePartsCosts_QNAME, String.class, SetBlanketCalculationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "product", scope = ExportToDocumentRequest.class)
    public JAXBElement<String> createExportToDocumentRequestProduct(String value) {
        return new JAXBElement<String>(_ExportToDocumentRequestProduct_QNAME, String.class, ExportToDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "format", scope = ExportToDocumentRequest.class)
    public JAXBElement<String> createExportToDocumentRequestFormat(String value) {
        return new JAXBElement<String>(_ExportToDocumentRequestFormat_QNAME, String.class, ExportToDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Locale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "locale", scope = ExportToDocumentRequest.class)
    public JAXBElement<Locale> createExportToDocumentRequestLocale(Locale value) {
        return new JAXBElement<Locale>(_ImportDossierRequestLocale_QNAME, Locale.class, ExportToDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "exportProduct", scope = ExportToDocumentRequest.class)
    public JAXBElement<ExportProduct> createExportToDocumentRequestExportProduct(ExportProduct value) {
        return new JAXBElement<ExportProduct>(_ExportToDocumentRequestExportProduct_QNAME, ExportProduct.class, ExportToDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "proirity", scope = OrderInfo.class)
    public JAXBElement<Integer> createOrderInfoProirity(Integer value) {
        return new JAXBElement<Integer>(_OrderInfoProirity_QNAME, Integer.class, OrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "priority", scope = OrderInfo.class)
    public JAXBElement<Integer> createOrderInfoPriority(Integer value) {
        return new JAXBElement<Integer>(_OrderInfoPriority_QNAME, Integer.class, OrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "order", scope = OrderInfo.class)
    public JAXBElement<String> createOrderInfoOrder(String value) {
        return new JAXBElement<String>(_OrderInfoOrder_QNAME, String.class, OrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "suppressed", scope = DatProcessInfo.class)
    public JAXBElement<Boolean> createDatProcessInfoSuppressed(Boolean value) {
        return new JAXBElement<Boolean>(_DatProcessInfoSuppressed_QNAME, Boolean.class, DatProcessInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ownerTitel", scope = ContractRequest.class)
    public JAXBElement<String> createContractRequestOwnerTitel(String value) {
        return new JAXBElement<String>(_ContractRequestOwnerTitel_QNAME, String.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaintingColorDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "paintingColorDescription", scope = ContractRequest.class)
    public JAXBElement<PaintingColorDescription> createContractRequestPaintingColorDescription(PaintingColorDescription value) {
        return new JAXBElement<PaintingColorDescription>(_ContractRequestPaintingColorDescription_QNAME, PaintingColorDescription.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "datECode", scope = ContractRequest.class)
    public JAXBElement<String> createContractRequestDatECode(String value) {
        return new JAXBElement<String>(_ContractRequestDatECode_QNAME, String.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Locale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "locale", scope = ContractRequest.class)
    public JAXBElement<Locale> createContractRequestLocale(Locale value) {
        return new JAXBElement<Locale>(_ImportDossierRequestLocale_QNAME, Locale.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ownerZIP", scope = ContractRequest.class)
    public JAXBElement<String> createContractRequestOwnerZIP(String value) {
        return new JAXBElement<String>(_ContractRequestOwnerZIP_QNAME, String.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ownerName", scope = ContractRequest.class)
    public JAXBElement<String> createContractRequestOwnerName(String value) {
        return new JAXBElement<String>(_ContractRequestOwnerName_QNAME, String.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ownerStreetNumber", scope = ContractRequest.class)
    public JAXBElement<String> createContractRequestOwnerStreetNumber(String value) {
        return new JAXBElement<String>(_ContractRequestOwnerStreetNumber_QNAME, String.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "constructionTime", scope = ContractRequest.class)
    public JAXBElement<Integer> createContractRequestConstructionTime(Integer value) {
        return new JAXBElement<Integer>(_ContractRequestConstructionTime_QNAME, Integer.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "registrationDate", scope = ContractRequest.class)
    public JAXBElement<XMLGregorianCalendar> createContractRequestRegistrationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContractRequestRegistrationDate_QNAME, XMLGregorianCalendar.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ownerCountry", scope = ContractRequest.class, defaultValue = "DE")
    public JAXBElement<String> createContractRequestOwnerCountry(String value) {
        return new JAXBElement<String>(_ContractRequestOwnerCountry_QNAME, String.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "contractName", scope = ContractRequest.class)
    public JAXBElement<String> createContractRequestContractName(String value) {
        return new JAXBElement<String>(_ContractRequestContractName_QNAME, String.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "keepWages", scope = ContractRequest.class)
    public JAXBElement<Boolean> createContractRequestKeepWages(Boolean value) {
        return new JAXBElement<Boolean>(_ContractRequestKeepWages_QNAME, Boolean.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ownerStreet", scope = ContractRequest.class)
    public JAXBElement<String> createContractRequestOwnerStreet(String value) {
        return new JAXBElement<String>(_ContractRequestOwnerStreet_QNAME, String.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vin", scope = ContractRequest.class)
    public JAXBElement<String> createContractRequestVin(String value) {
        return new JAXBElement<String>(_ContractRequestVin_QNAME, String.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nextVehicleInsectionDate", scope = ContractRequest.class)
    public JAXBElement<XMLGregorianCalendar> createContractRequestNextVehicleInsectionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContractRequestNextVehicleInsectionDate_QNAME, XMLGregorianCalendar.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ownerPhone", scope = ContractRequest.class)
    public JAXBElement<String> createContractRequestOwnerPhone(String value) {
        return new JAXBElement<String>(_ContractRequestOwnerPhone_QNAME, String.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "isCountryCurrency", scope = ContractRequest.class)
    public JAXBElement<Boolean> createContractRequestIsCountryCurrency(Boolean value) {
        return new JAXBElement<Boolean>(_ContractRequestIsCountryCurrency_QNAME, Boolean.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "countryPrice", scope = ContractRequest.class)
    public JAXBElement<Integer> createContractRequestCountryPrice(Integer value) {
        return new JAXBElement<Integer>(_ContractRequestCountryPrice_QNAME, Integer.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "isDMSCalculation", scope = ContractRequest.class)
    public JAXBElement<Boolean> createContractRequestIsDMSCalculation(Boolean value) {
        return new JAXBElement<Boolean>(_ContractRequestIsDMSCalculation_QNAME, Boolean.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "kba", scope = ContractRequest.class)
    public JAXBElement<String> createContractRequestKba(String value) {
        return new JAXBElement<String>(_ContractRequestKba_QNAME, String.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ownerName2", scope = ContractRequest.class)
    public JAXBElement<String> createContractRequestOwnerName2(String value) {
        return new JAXBElement<String>(_ContractRequestOwnerName2_QNAME, String.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ownerEmail", scope = ContractRequest.class)
    public JAXBElement<String> createContractRequestOwnerEmail(String value) {
        return new JAXBElement<String>(_ContractRequestOwnerEmail_QNAME, String.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "paintingMethod", scope = ContractRequest.class)
    public JAXBElement<String> createContractRequestPaintingMethod(String value) {
        return new JAXBElement<String>(_ContractRequestPaintingMethod_QNAME, String.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsuranceCaseDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "insuranceCaseDescription", scope = ContractRequest.class)
    public JAXBElement<InsuranceCaseDescription> createContractRequestInsuranceCaseDescription(InsuranceCaseDescription value) {
        return new JAXBElement<InsuranceCaseDescription>(_ContractRequestInsuranceCaseDescription_QNAME, InsuranceCaseDescription.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "externalProvider", scope = ContractRequest.class)
    public JAXBElement<String> createContractRequestExternalProvider(String value) {
        return new JAXBElement<String>(_ContractRequestExternalProvider_QNAME, String.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "registrationNumber", scope = ContractRequest.class)
    public JAXBElement<String> createContractRequestRegistrationNumber(String value) {
        return new JAXBElement<String>(_ContractRequestRegistrationNumber_QNAME, String.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "mileageTachometer", scope = ContractRequest.class)
    public JAXBElement<Long> createContractRequestMileageTachometer(Long value) {
        return new JAXBElement<Long>(_ContractRequestMileageTachometer_QNAME, Long.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "comment", scope = ContractRequest.class)
    public JAXBElement<String> createContractRequestComment(String value) {
        return new JAXBElement<String>(_ContractRequestComment_QNAME, String.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ownerCity", scope = ContractRequest.class)
    public JAXBElement<String> createContractRequestOwnerCity(String value) {
        return new JAXBElement<String>(_ContractRequestOwnerCity_QNAME, String.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "constructionDate", scope = ContractRequest.class)
    public JAXBElement<XMLGregorianCalendar> createContractRequestConstructionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContractRequestConstructionDate_QNAME, XMLGregorianCalendar.class, ContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "insuranceClaim", scope = Restriction.class)
    public JAXBElement<Boolean> createRestrictionInsuranceClaim(Boolean value) {
        return new JAXBElement<Boolean>(_RestrictionInsuranceClaim_QNAME, Boolean.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "baseModel", scope = Restriction.class)
    public JAXBElement<String> createRestrictionBaseModel(String value) {
        return new JAXBElement<String>(_RestrictionBaseModel_QNAME, String.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "createDateTo", scope = Restriction.class)
    public JAXBElement<Object> createRestrictionCreateDateTo(Object value) {
        return new JAXBElement<Object>(_RestrictionCreateDateTo_QNAME, Object.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "garageContractName", scope = Restriction.class)
    public JAXBElement<String> createRestrictionGarageContractName(String value) {
        return new JAXBElement<String>(_RestrictionGarageContractName_QNAME, String.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "orderNumber", scope = Restriction.class)
    public JAXBElement<String> createRestrictionOrderNumber(String value) {
        return new JAXBElement<String>(_RestrictionOrderNumber_QNAME, String.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "datEcode", scope = Restriction.class)
    public JAXBElement<String> createRestrictionDatEcode(String value) {
        return new JAXBElement<String>(_RestrictionDatEcode_QNAME, String.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "changeDateTo", scope = Restriction.class)
    public JAXBElement<Object> createRestrictionChangeDateTo(Object value) {
        return new JAXBElement<Object>(_RestrictionChangeDateTo_QNAME, Object.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "subModel", scope = Restriction.class)
    public JAXBElement<String> createRestrictionSubModel(String value) {
        return new JAXBElement<String>(_RestrictionSubModel_QNAME, String.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "createDateFrom", scope = Restriction.class)
    public JAXBElement<Object> createRestrictionCreateDateFrom(Object value) {
        return new JAXBElement<Object>(_RestrictionCreateDateFrom_QNAME, Object.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "changeDateFrom", scope = Restriction.class)
    public JAXBElement<Object> createRestrictionChangeDateFrom(Object value) {
        return new JAXBElement<Object>(_RestrictionChangeDateFrom_QNAME, Object.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "manufacturer", scope = Restriction.class)
    public JAXBElement<String> createRestrictionManufacturer(String value) {
        return new JAXBElement<String>(_RestrictionManufacturer_QNAME, String.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "registrationNumber", scope = Restriction.class)
    public JAXBElement<String> createRestrictionRegistrationNumber(String value) {
        return new JAXBElement<String>(_ContractRequestRegistrationNumber_QNAME, String.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "contractId", scope = Restriction.class)
    public JAXBElement<Long> createRestrictionContractId(Long value) {
        return new JAXBElement<Long>(_RestrictionContractId_QNAME, Long.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "invoiceNumber", scope = Restriction.class)
    public JAXBElement<String> createRestrictionInvoiceNumber(String value) {
        return new JAXBElement<String>(_RestrictionInvoiceNumber_QNAME, String.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "calculationStatus", scope = Restriction.class)
    public JAXBElement<String> createRestrictionCalculationStatus(String value) {
        return new JAXBElement<String>(_RestrictionCalculationStatus_QNAME, String.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "contractName", scope = Restriction.class)
    public JAXBElement<String> createRestrictionContractName(String value) {
        return new JAXBElement<String>(_ContractRequestContractName_QNAME, String.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vin", scope = Restriction.class)
    public JAXBElement<String> createRestrictionVin(String value) {
        return new JAXBElement<String>(_ContractRequestVin_QNAME, String.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vehicleType", scope = Restriction.class)
    public JAXBElement<String> createRestrictionVehicleType(String value) {
        return new JAXBElement<String>(_RestrictionVehicleType_QNAME, String.class, Restriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "constructionTimeFrom", scope = MaterialPositionData.class)
    public JAXBElement<Integer> createMaterialPositionDataConstructionTimeFrom(Integer value) {
        return new JAXBElement<Integer>(_MaterialPositionDataConstructionTimeFrom_QNAME, Integer.class, MaterialPositionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dpn", scope = MaterialPositionData.class)
    public JAXBElement<Long> createMaterialPositionDataDpn(Long value) {
        return new JAXBElement<Long>(_MaterialPositionDataDpn_QNAME, Long.class, MaterialPositionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description", scope = MaterialPositionData.class)
    public JAXBElement<String> createMaterialPositionDataDescription(String value) {
        return new JAXBElement<String>(_MaterialPositionDataDescription_QNAME, String.class, MaterialPositionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "partNumber", scope = MaterialPositionData.class)
    public JAXBElement<String> createMaterialPositionDataPartNumber(String value) {
        return new JAXBElement<String>(_MaterialPositionDataPartNumber_QNAME, String.class, MaterialPositionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "partNumberOrigin", scope = MaterialPositionData.class)
    public JAXBElement<String> createMaterialPositionDataPartNumberOrigin(String value) {
        return new JAXBElement<String>(_MaterialPositionDataPartNumberOrigin_QNAME, String.class, MaterialPositionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "constructionTimeTo", scope = MaterialPositionData.class)
    public JAXBElement<Integer> createMaterialPositionDataConstructionTimeTo(Integer value) {
        return new JAXBElement<Integer>(_MaterialPositionDataConstructionTimeTo_QNAME, Integer.class, MaterialPositionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "valuePerUnit", scope = MaterialPositionData.class)
    public JAXBElement<BigDecimal> createMaterialPositionDataValuePerUnit(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MaterialPositionDataValuePerUnit_QNAME, BigDecimal.class, MaterialPositionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description", scope = LacquerType.class)
    public JAXBElement<String> createLacquerTypeDescription(String value) {
        return new JAXBElement<String>(_MaterialPositionDataDescription_QNAME, String.class, LacquerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "key", scope = LacquerType.class)
    public JAXBElement<String> createLacquerTypeKey(String value) {
        return new JAXBElement<String>(_LacquerTypeKey_QNAME, String.class, LacquerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "comment", scope = CalculateContractRequest.class)
    public JAXBElement<String> createCalculateContractRequestComment(String value) {
        return new JAXBElement<String>(_ContractRequestComment_QNAME, String.class, CalculateContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Locale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "locale", scope = CalculateContractRequest.class)
    public JAXBElement<Locale> createCalculateContractRequestLocale(Locale value) {
        return new JAXBElement<Locale>(_ImportDossierRequestLocale_QNAME, Locale.class, CalculateContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "code", scope = PaintingColorDescription.class)
    public JAXBElement<String> createPaintingColorDescriptionCode(String value) {
        return new JAXBElement<String>(_PaintingColorDescriptionCode_QNAME, String.class, PaintingColorDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "expression", scope = PaintingColorDescription.class)
    public JAXBElement<Integer> createPaintingColorDescriptionExpression(Integer value) {
        return new JAXBElement<Integer>(_PaintingColorDescriptionExpression_QNAME, Integer.class, PaintingColorDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = PaintingColorDescription.class)
    public JAXBElement<String> createPaintingColorDescriptionName(String value) {
        return new JAXBElement<String>(_PaintingColorDescriptionName_QNAME, String.class, PaintingColorDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "priceCategory", scope = PaintingColorDescription.class)
    public JAXBElement<String> createPaintingColorDescriptionPriceCategory(String value) {
        return new JAXBElement<String>(_PaintingColorDescriptionPriceCategory_QNAME, String.class, PaintingColorDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "datCode", scope = PaintingColorDescription.class)
    public JAXBElement<Integer> createPaintingColorDescriptionDatCode(Integer value) {
        return new JAXBElement<Integer>(_PaintingColorDescriptionDatCode_QNAME, Integer.class, PaintingColorDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "type", scope = PaintingColorDescription.class)
    public JAXBElement<Integer> createPaintingColorDescriptionType(Integer value) {
        return new JAXBElement<Integer>(_PaintingColorDescriptionType_QNAME, Integer.class, PaintingColorDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "insuranceNumber", scope = Insurance.class)
    public JAXBElement<String> createInsuranceInsuranceNumber(String value) {
        return new JAXBElement<String>(_InsuranceInsuranceNumber_QNAME, String.class, Insurance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "gdvFlag", scope = Insurance.class)
    public JAXBElement<String> createInsuranceGdvFlag(String value) {
        return new JAXBElement<String>(_InsuranceGdvFlag_QNAME, String.class, Insurance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "insuranceGroupId", scope = Insurance.class)
    public JAXBElement<String> createInsuranceInsuranceGroupId(String value) {
        return new JAXBElement<String>(_InsuranceInsuranceGroupId_QNAME, String.class, Insurance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "insuranceId", scope = Insurance.class)
    public JAXBElement<String> createInsuranceInsuranceId(String value) {
        return new JAXBElement<String>(_InsuranceInsuranceId_QNAME, String.class, Insurance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "insuranceName", scope = Insurance.class)
    public JAXBElement<String> createInsuranceInsuranceName(String value) {
        return new JAXBElement<String>(_InsuranceInsuranceName_QNAME, String.class, Insurance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "countOfContractslsFound", scope = DatContractListResponse.class)
    public JAXBElement<Integer> createDatContractListResponseCountOfContractslsFound(Integer value) {
        return new JAXBElement<Integer>(_DatContractListResponseCountOfContractslsFound_QNAME, Integer.class, DatContractListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DossiersDatProcessInfos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dossiersDatProcessInfos", scope = DatContractListResponse.class)
    public JAXBElement<DossiersDatProcessInfos> createDatContractListResponseDossiersDatProcessInfos(DossiersDatProcessInfos value) {
        return new JAXBElement<DossiersDatProcessInfos>(_DatContractListResponseDossiersDatProcessInfos_QNAME, DossiersDatProcessInfos.class, DatContractListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "countOfContractssReturned", scope = DatContractListResponse.class)
    public JAXBElement<Integer> createDatContractListResponseCountOfContractssReturned(Integer value) {
        return new JAXBElement<Integer>(_DatContractListResponseCountOfContractssReturned_QNAME, Integer.class, DatContractListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatContractListResponse.Dossiers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dossiers", scope = DatContractListResponse.class)
    public JAXBElement<DatContractListResponse.Dossiers> createDatContractListResponseDossiers(DatContractListResponse.Dossiers value) {
        return new JAXBElement<DatContractListResponse.Dossiers>(_DatContractListResponseDossiers_QNAME, DatContractListResponse.Dossiers.class, DatContractListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "date", scope = PriceDate.class)
    public JAXBElement<String> createPriceDateDate(String value) {
        return new JAXBElement<String>(_PriceDateDate_QNAME, String.class, PriceDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "generation", scope = PriceDate.class)
    public JAXBElement<Integer> createPriceDateGeneration(Integer value) {
        return new JAXBElement<Integer>(_PriceDateGeneration_QNAME, Integer.class, PriceDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaterialPositionData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "materialPosition", scope = DpnMaterialPosition.class)
    public JAXBElement<MaterialPositionData> createDpnMaterialPositionMaterialPosition(MaterialPositionData value) {
        return new JAXBElement<MaterialPositionData>(_DpnMaterialPositionMaterialPosition_QNAME, MaterialPositionData.class, DpnMaterialPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "constructionTime", scope = DatProcessEquipmentsRequest.class)
    public JAXBElement<Integer> createDatProcessEquipmentsRequestConstructionTime(Integer value) {
        return new JAXBElement<Integer>(_ContractRequestConstructionTime_QNAME, Integer.class, DatProcessEquipmentsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "useTimeUnitsOfManufacturer", scope = CalculateRequest.class)
    public JAXBElement<Boolean> createCalculateRequestUseTimeUnitsOfManufacturer(Boolean value) {
        return new JAXBElement<Boolean>(_CalculateRequestUseTimeUnitsOfManufacturer_QNAME, Boolean.class, CalculateRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "includeProtocol", scope = CalculateRequest.class)
    public JAXBElement<Boolean> createCalculateRequestIncludeProtocol(Boolean value) {
        return new JAXBElement<Boolean>(_CalculateRequestIncludeProtocol_QNAME, Boolean.class, CalculateRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "isCountryCurrency", scope = CalculateRequest.class, defaultValue = "false")
    public JAXBElement<Boolean> createCalculateRequestIsCountryCurrency(Boolean value) {
        return new JAXBElement<Boolean>(_ContractRequestIsCountryCurrency_QNAME, Boolean.class, CalculateRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "countryPrice", scope = CalculateRequest.class, defaultValue = "1")
    public JAXBElement<Integer> createCalculateRequestCountryPrice(Integer value) {
        return new JAXBElement<Integer>(_ContractRequestCountryPrice_QNAME, Integer.class, CalculateRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "contructionTime", scope = CalculateRequest.class)
    public JAXBElement<Integer> createCalculateRequestContructionTime(Integer value) {
        return new JAXBElement<Integer>(_CalculateRequestContructionTime_QNAME, Integer.class, CalculateRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "isDMSCalculation", scope = CalculateRequest.class, defaultValue = "false")
    public JAXBElement<Boolean> createCalculateRequestIsDMSCalculation(Boolean value) {
        return new JAXBElement<Boolean>(_ContractRequestIsDMSCalculation_QNAME, Boolean.class, CalculateRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaintingColorDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "paintingColorDescription", scope = CalculateRequest.class)
    public JAXBElement<PaintingColorDescription> createCalculateRequestPaintingColorDescription(PaintingColorDescription value) {
        return new JAXBElement<PaintingColorDescription>(_ContractRequestPaintingColorDescription_QNAME, PaintingColorDescription.class, CalculateRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Locale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "locale", scope = CalculateRequest.class)
    public JAXBElement<Locale> createCalculateRequestLocale(Locale value) {
        return new JAXBElement<Locale>(_ImportDossierRequestLocale_QNAME, Locale.class, CalculateRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "economicRegion", scope = CalculateRequest.class)
    public JAXBElement<Integer> createCalculateRequestEconomicRegion(Integer value) {
        return new JAXBElement<Integer>(_CalculateRequestEconomicRegion_QNAME, Integer.class, CalculateRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "isAlternativeCalculationUsed", scope = CalculateRequest.class, defaultValue = "false")
    public JAXBElement<Boolean> createCalculateRequestIsAlternativeCalculationUsed(Boolean value) {
        return new JAXBElement<Boolean>(_CalculateRequestIsAlternativeCalculationUsed_QNAME, Boolean.class, CalculateRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "isPhantomCalculation", scope = CalculateRequest.class, defaultValue = "false")
    public JAXBElement<Boolean> createCalculateRequestIsPhantomCalculation(Boolean value) {
        return new JAXBElement<Boolean>(_CalculateRequestIsPhantomCalculation_QNAME, Boolean.class, CalculateRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "paintingMethod", scope = CalculateRequest.class)
    public JAXBElement<String> createCalculateRequestPaintingMethod(String value) {
        return new JAXBElement<String>(_ContractRequestPaintingMethod_QNAME, String.class, CalculateRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "externalProvider", scope = CalculateRequest.class)
    public JAXBElement<String> createCalculateRequestExternalProvider(String value) {
        return new JAXBElement<String>(_ContractRequestExternalProvider_QNAME, String.class, CalculateRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "constructionTime", scope = CalculateRequest.class)
    public JAXBElement<Integer> createCalculateRequestConstructionTime(Integer value) {
        return new JAXBElement<Integer>(_ContractRequestConstructionTime_QNAME, Integer.class, CalculateRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "insuranceID", scope = CalculateRequest.class)
    public JAXBElement<Long> createCalculateRequestInsuranceID(Long value) {
        return new JAXBElement<Long>(_CalculateRequestInsuranceID_QNAME, Long.class, CalculateRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "retentionAmount", scope = InsuranceCaseDescription.class)
    public JAXBElement<BigDecimal> createInsuranceCaseDescriptionRetentionAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InsuranceCaseDescriptionRetentionAmount_QNAME, BigDecimal.class, InsuranceCaseDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "orderNumber", scope = InsuranceCaseDescription.class)
    public JAXBElement<String> createInsuranceCaseDescriptionOrderNumber(String value) {
        return new JAXBElement<String>(_RestrictionOrderNumber_QNAME, String.class, InsuranceCaseDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "repairCoverage", scope = InsuranceCaseDescription.class)
    public JAXBElement<String> createInsuranceCaseDescriptionRepairCoverage(String value) {
        return new JAXBElement<String>(_InsuranceCaseDescriptionRepairCoverage_QNAME, String.class, InsuranceCaseDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "insuranceAgency", scope = InsuranceCaseDescription.class)
    public JAXBElement<String> createInsuranceCaseDescriptionInsuranceAgency(String value) {
        return new JAXBElement<String>(_InsuranceCaseDescriptionInsuranceAgency_QNAME, String.class, InsuranceCaseDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "policyNumber", scope = InsuranceCaseDescription.class)
    public JAXBElement<String> createInsuranceCaseDescriptionPolicyNumber(String value) {
        return new JAXBElement<String>(_InsuranceCaseDescriptionPolicyNumber_QNAME, String.class, InsuranceCaseDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "insuranceType", scope = InsuranceCaseDescription.class)
    public JAXBElement<String> createInsuranceCaseDescriptionInsuranceType(String value) {
        return new JAXBElement<String>(_InsuranceCaseDescriptionInsuranceType_QNAME, String.class, InsuranceCaseDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "damageDate", scope = InsuranceCaseDescription.class)
    public JAXBElement<XMLGregorianCalendar> createInsuranceCaseDescriptionDamageDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InsuranceCaseDescriptionDamageDate_QNAME, XMLGregorianCalendar.class, InsuranceCaseDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "declarationOfAssignment", scope = InsuranceCaseDescription.class)
    public JAXBElement<Boolean> createInsuranceCaseDescriptionDeclarationOfAssignment(Boolean value) {
        return new JAXBElement<Boolean>(_InsuranceCaseDescriptionDeclarationOfAssignment_QNAME, Boolean.class, InsuranceCaseDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "insuranceNumber", scope = InsuranceCaseDescription.class)
    public JAXBElement<String> createInsuranceCaseDescriptionInsuranceNumber(String value) {
        return new JAXBElement<String>(_InsuranceInsuranceNumber_QNAME, String.class, InsuranceCaseDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "damageNumber", scope = InsuranceCaseDescription.class)
    public JAXBElement<String> createInsuranceCaseDescriptionDamageNumber(String value) {
        return new JAXBElement<String>(_InsuranceCaseDescriptionDamageNumber_QNAME, String.class, InsuranceCaseDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "insuranceGroupId", scope = InsuranceCaseDescription.class)
    public JAXBElement<String> createInsuranceCaseDescriptionInsuranceGroupId(String value) {
        return new JAXBElement<String>(_InsuranceInsuranceGroupId_QNAME, String.class, InsuranceCaseDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "insuranceId", scope = InsuranceCaseDescription.class)
    public JAXBElement<String> createInsuranceCaseDescriptionInsuranceId(String value) {
        return new JAXBElement<String>(_InsuranceInsuranceId_QNAME, String.class, InsuranceCaseDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "damageType", scope = InsuranceCaseDescription.class)
    public JAXBElement<Integer> createInsuranceCaseDescriptionDamageType(Integer value) {
        return new JAXBElement<Integer>(_InsuranceCaseDescriptionDamageType_QNAME, Integer.class, InsuranceCaseDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "inspectionDate", scope = InsuranceCaseDescription.class)
    public JAXBElement<XMLGregorianCalendar> createInsuranceCaseDescriptionInspectionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InsuranceCaseDescriptionInspectionDate_QNAME, XMLGregorianCalendar.class, InsuranceCaseDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "retention", scope = InsuranceCaseDescription.class)
    public JAXBElement<Boolean> createInsuranceCaseDescriptionRetention(Boolean value) {
        return new JAXBElement<Boolean>(_InsuranceCaseDescriptionRetention_QNAME, Boolean.class, InsuranceCaseDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "creationDateTime", scope = InsuranceCaseDescription.class)
    public JAXBElement<XMLGregorianCalendar> createInsuranceCaseDescriptionCreationDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InsuranceCaseDescriptionCreationDateTime_QNAME, XMLGregorianCalendar.class, InsuranceCaseDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "constructionTime", scope = MaintenanceRequest.class)
    public JAXBElement<Integer> createMaintenanceRequestConstructionTime(Integer value) {
        return new JAXBElement<Integer>(_ContractRequestConstructionTime_QNAME, Integer.class, MaintenanceRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Locale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "locale", scope = MaintenanceRequest.class)
    public JAXBElement<Locale> createMaintenanceRequestLocale(Locale value) {
        return new JAXBElement<Locale>(_ImportDossierRequestLocale_QNAME, Locale.class, MaintenanceRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "includeProtocol", scope = GetContractRequest.class)
    public JAXBElement<Boolean> createGetContractRequestIncludeProtocol(Boolean value) {
        return new JAXBElement<Boolean>(_CalculateRequestIncludeProtocol_QNAME, Boolean.class, GetContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Locale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "locale", scope = GetContractRequest.class)
    public JAXBElement<Locale> createGetContractRequestLocale(Locale value) {
        return new JAXBElement<Locale>(_ImportDossierRequestLocale_QNAME, Locale.class, GetContractRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fileName", scope = ExportProduct.class)
    public JAXBElement<String> createExportProductFileName(String value) {
        return new JAXBElement<String>(_ExportProductFileName_QNAME, String.class, ExportProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "printProductName", scope = ExportProduct.class)
    public JAXBElement<String> createExportProductPrintProductName(String value) {
        return new JAXBElement<String>(_ExportProductPrintProductName_QNAME, String.class, ExportProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "displayName", scope = ExportProduct.class)
    public JAXBElement<String> createExportProductDisplayName(String value) {
        return new JAXBElement<String>(_ExportProductDisplayName_QNAME, String.class, ExportProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "origin", scope = ExportProduct.class)
    public JAXBElement<String> createExportProductOrigin(String value) {
        return new JAXBElement<String>(_ExportProductOrigin_QNAME, String.class, ExportProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dossierId", scope = DossierDatProcessInfos.class)
    public JAXBElement<Long> createDossierDatProcessInfosDossierId(Long value) {
        return new JAXBElement<Long>(_DossierDatProcessInfosDossierId_QNAME, Long.class, DossierDatProcessInfos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "insuranceClaim", scope = SortingCriterions.class)
    public JAXBElement<OrderInfo> createSortingCriterionsInsuranceClaim(OrderInfo value) {
        return new JAXBElement<OrderInfo>(_RestrictionInsuranceClaim_QNAME, OrderInfo.class, SortingCriterions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "baseModel", scope = SortingCriterions.class)
    public JAXBElement<OrderInfo> createSortingCriterionsBaseModel(OrderInfo value) {
        return new JAXBElement<OrderInfo>(_RestrictionBaseModel_QNAME, OrderInfo.class, SortingCriterions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "createDateTo", scope = SortingCriterions.class)
    public JAXBElement<OrderInfo> createSortingCriterionsCreateDateTo(OrderInfo value) {
        return new JAXBElement<OrderInfo>(_RestrictionCreateDateTo_QNAME, OrderInfo.class, SortingCriterions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "garageContractName", scope = SortingCriterions.class)
    public JAXBElement<OrderInfo> createSortingCriterionsGarageContractName(OrderInfo value) {
        return new JAXBElement<OrderInfo>(_RestrictionGarageContractName_QNAME, OrderInfo.class, SortingCriterions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "orderNumber", scope = SortingCriterions.class)
    public JAXBElement<OrderInfo> createSortingCriterionsOrderNumber(OrderInfo value) {
        return new JAXBElement<OrderInfo>(_RestrictionOrderNumber_QNAME, OrderInfo.class, SortingCriterions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "datEcode", scope = SortingCriterions.class)
    public JAXBElement<OrderInfo> createSortingCriterionsDatEcode(OrderInfo value) {
        return new JAXBElement<OrderInfo>(_RestrictionDatEcode_QNAME, OrderInfo.class, SortingCriterions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "changeDateTo", scope = SortingCriterions.class)
    public JAXBElement<OrderInfo> createSortingCriterionsChangeDateTo(OrderInfo value) {
        return new JAXBElement<OrderInfo>(_RestrictionChangeDateTo_QNAME, OrderInfo.class, SortingCriterions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "subModel", scope = SortingCriterions.class)
    public JAXBElement<OrderInfo> createSortingCriterionsSubModel(OrderInfo value) {
        return new JAXBElement<OrderInfo>(_RestrictionSubModel_QNAME, OrderInfo.class, SortingCriterions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "createDateFrom", scope = SortingCriterions.class)
    public JAXBElement<OrderInfo> createSortingCriterionsCreateDateFrom(OrderInfo value) {
        return new JAXBElement<OrderInfo>(_RestrictionCreateDateFrom_QNAME, OrderInfo.class, SortingCriterions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "changeDateFrom", scope = SortingCriterions.class)
    public JAXBElement<OrderInfo> createSortingCriterionsChangeDateFrom(OrderInfo value) {
        return new JAXBElement<OrderInfo>(_RestrictionChangeDateFrom_QNAME, OrderInfo.class, SortingCriterions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "manufacturer", scope = SortingCriterions.class)
    public JAXBElement<OrderInfo> createSortingCriterionsManufacturer(OrderInfo value) {
        return new JAXBElement<OrderInfo>(_RestrictionManufacturer_QNAME, OrderInfo.class, SortingCriterions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "registrationNumber", scope = SortingCriterions.class)
    public JAXBElement<OrderInfo> createSortingCriterionsRegistrationNumber(OrderInfo value) {
        return new JAXBElement<OrderInfo>(_ContractRequestRegistrationNumber_QNAME, OrderInfo.class, SortingCriterions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "invoiceNumber", scope = SortingCriterions.class)
    public JAXBElement<OrderInfo> createSortingCriterionsInvoiceNumber(OrderInfo value) {
        return new JAXBElement<OrderInfo>(_RestrictionInvoiceNumber_QNAME, OrderInfo.class, SortingCriterions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "contractName", scope = SortingCriterions.class)
    public JAXBElement<OrderInfo> createSortingCriterionsContractName(OrderInfo value) {
        return new JAXBElement<OrderInfo>(_ContractRequestContractName_QNAME, OrderInfo.class, SortingCriterions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vin", scope = SortingCriterions.class)
    public JAXBElement<OrderInfo> createSortingCriterionsVin(OrderInfo value) {
        return new JAXBElement<OrderInfo>(_ContractRequestVin_QNAME, OrderInfo.class, SortingCriterions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vehicleType", scope = SortingCriterions.class)
    public JAXBElement<OrderInfo> createSortingCriterionsVehicleType(OrderInfo value) {
        return new JAXBElement<OrderInfo>(_RestrictionVehicleType_QNAME, OrderInfo.class, SortingCriterions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "mileageUnit", scope = ContractRequest106 .class)
    public JAXBElement<Integer> createContractRequest106MileageUnit(Integer value) {
        return new JAXBElement<Integer>(_ContractRequest106MileageUnit_QNAME, Integer.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "opponentStreetNumber", scope = ContractRequest106 .class)
    public JAXBElement<String> createContractRequest106OpponentStreetNumber(String value) {
        return new JAXBElement<String>(_ContractRequest106OpponentStreetNumber_QNAME, String.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "policyNumber", scope = ContractRequest106 .class)
    public JAXBElement<String> createContractRequest106PolicyNumber(String value) {
        return new JAXBElement<String>(_InsuranceCaseDescriptionPolicyNumber_QNAME, String.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "opponentPreTaxAuthorized", scope = ContractRequest106 .class, defaultValue = "0")
    public JAXBElement<Integer> createContractRequest106OpponentPreTaxAuthorized(Integer value) {
        return new JAXBElement<Integer>(_ContractRequest106OpponentPreTaxAuthorized_QNAME, Integer.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "policyholderName", scope = ContractRequest106 .class)
    public JAXBElement<String> createContractRequest106PolicyholderName(String value) {
        return new JAXBElement<String>(_ContractRequest106PolicyholderName_QNAME, String.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "insuranceType", scope = ContractRequest106 .class)
    public JAXBElement<Integer> createContractRequest106InsuranceType(Integer value) {
        return new JAXBElement<Integer>(_InsuranceCaseDescriptionInsuranceType_QNAME, Integer.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "damageLocation", scope = ContractRequest106 .class)
    public JAXBElement<String> createContractRequest106DamageLocation(String value) {
        return new JAXBElement<String>(_ContractRequest106DamageLocation_QNAME, String.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "policyholderZIP", scope = ContractRequest106 .class)
    public JAXBElement<String> createContractRequest106PolicyholderZIP(String value) {
        return new JAXBElement<String>(_ContractRequest106PolicyholderZIP_QNAME, String.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "existingAssignmentDeclaration", scope = ContractRequest106 .class, defaultValue = "0")
    public JAXBElement<Integer> createContractRequest106ExistingAssignmentDeclaration(Integer value) {
        return new JAXBElement<Integer>(_ContractRequest106ExistingAssignmentDeclaration_QNAME, Integer.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "isFranchise", scope = ContractRequest106 .class, defaultValue = "0")
    public JAXBElement<Integer> createContractRequest106IsFranchise(Integer value) {
        return new JAXBElement<Integer>(_ContractRequest106IsFranchise_QNAME, Integer.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "damageDate", scope = ContractRequest106 .class)
    public JAXBElement<XMLGregorianCalendar> createContractRequest106DamageDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InsuranceCaseDescriptionDamageDate_QNAME, XMLGregorianCalendar.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "isInsuranceCase", scope = ContractRequest106 .class, defaultValue = "false")
    public JAXBElement<Boolean> createContractRequest106IsInsuranceCase(Boolean value) {
        return new JAXBElement<Boolean>(_ContractRequest106IsInsuranceCase_QNAME, Boolean.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "policyholderCity", scope = ContractRequest106 .class)
    public JAXBElement<String> createContractRequest106PolicyholderCity(String value) {
        return new JAXBElement<String>(_ContractRequest106PolicyholderCity_QNAME, String.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "opponentCity", scope = ContractRequest106 .class)
    public JAXBElement<String> createContractRequest106OpponentCity(String value) {
        return new JAXBElement<String>(_ContractRequest106OpponentCity_QNAME, String.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "insuranceId", scope = ContractRequest106 .class)
    public JAXBElement<Integer> createContractRequest106InsuranceId(Integer value) {
        return new JAXBElement<Integer>(_InsuranceInsuranceId_QNAME, Integer.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "policyholderStreet", scope = ContractRequest106 .class)
    public JAXBElement<String> createContractRequest106PolicyholderStreet(String value) {
        return new JAXBElement<String>(_ContractRequest106PolicyholderStreet_QNAME, String.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateContractAdditionalData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "additionalData", scope = ContractRequest106 .class)
    public JAXBElement<CreateContractAdditionalData> createContractRequest106AdditionalData(CreateContractAdditionalData value) {
        return new JAXBElement<CreateContractAdditionalData>(_ContractRequest106AdditionalData_QNAME, CreateContractAdditionalData.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "franchiseValue", scope = ContractRequest106 .class)
    public JAXBElement<BigDecimal> createContractRequest106FranchiseValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ContractRequest106FranchiseValue_QNAME, BigDecimal.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "policyholderCountry", scope = ContractRequest106 .class, defaultValue = "DE")
    public JAXBElement<String> createContractRequest106PolicyholderCountry(String value) {
        return new JAXBElement<String>(_ContractRequest106PolicyholderCountry_QNAME, String.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "policyholderStreetNumber", scope = ContractRequest106 .class)
    public JAXBElement<String> createContractRequest106PolicyholderStreetNumber(String value) {
        return new JAXBElement<String>(_ContractRequest106PolicyholderStreetNumber_QNAME, String.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "opponentRegistrationNumber", scope = ContractRequest106 .class)
    public JAXBElement<String> createContractRequest106OpponentRegistrationNumber(String value) {
        return new JAXBElement<String>(_ContractRequest106OpponentRegistrationNumber_QNAME, String.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "opponentZIP", scope = ContractRequest106 .class)
    public JAXBElement<String> createContractRequest106OpponentZIP(String value) {
        return new JAXBElement<String>(_ContractRequest106OpponentZIP_QNAME, String.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "policyholderName2", scope = ContractRequest106 .class)
    public JAXBElement<String> createContractRequest106PolicyholderName2(String value) {
        return new JAXBElement<String>(_ContractRequest106PolicyholderName2_QNAME, String.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "opponentName2", scope = ContractRequest106 .class)
    public JAXBElement<String> createContractRequest106OpponentName2(String value) {
        return new JAXBElement<String>(_ContractRequest106OpponentName2_QNAME, String.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "damageNumber", scope = ContractRequest106 .class)
    public JAXBElement<String> createContractRequest106DamageNumber(String value) {
        return new JAXBElement<String>(_InsuranceCaseDescriptionDamageNumber_QNAME, String.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "policyholderEmail", scope = ContractRequest106 .class)
    public JAXBElement<String> createContractRequest106PolicyholderEmail(String value) {
        return new JAXBElement<String>(_ContractRequest106PolicyholderEmail_QNAME, String.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "opponentEmail", scope = ContractRequest106 .class)
    public JAXBElement<String> createContractRequest106OpponentEmail(String value) {
        return new JAXBElement<String>(_ContractRequest106OpponentEmail_QNAME, String.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "opponentTitel", scope = ContractRequest106 .class)
    public JAXBElement<String> createContractRequest106OpponentTitel(String value) {
        return new JAXBElement<String>(_ContractRequest106OpponentTitel_QNAME, String.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "opponentPhone", scope = ContractRequest106 .class)
    public JAXBElement<String> createContractRequest106OpponentPhone(String value) {
        return new JAXBElement<String>(_ContractRequest106OpponentPhone_QNAME, String.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "policyholderPhone", scope = ContractRequest106 .class)
    public JAXBElement<String> createContractRequest106PolicyholderPhone(String value) {
        return new JAXBElement<String>(_ContractRequest106PolicyholderPhone_QNAME, String.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "policyholderTitel", scope = ContractRequest106 .class)
    public JAXBElement<String> createContractRequest106PolicyholderTitel(String value) {
        return new JAXBElement<String>(_ContractRequest106PolicyholderTitel_QNAME, String.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "opponentCountry", scope = ContractRequest106 .class, defaultValue = "DE")
    public JAXBElement<String> createContractRequest106OpponentCountry(String value) {
        return new JAXBElement<String>(_ContractRequest106OpponentCountry_QNAME, String.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "opponentStreet", scope = ContractRequest106 .class)
    public JAXBElement<String> createContractRequest106OpponentStreet(String value) {
        return new JAXBElement<String>(_ContractRequest106OpponentStreet_QNAME, String.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "damageType", scope = ContractRequest106 .class)
    public JAXBElement<Integer> createContractRequest106DamageType(Integer value) {
        return new JAXBElement<Integer>(_InsuranceCaseDescriptionDamageType_QNAME, Integer.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "policyholderPreTaxAuthorized", scope = ContractRequest106 .class)
    public JAXBElement<Integer> createContractRequest106PolicyholderPreTaxAuthorized(Integer value) {
        return new JAXBElement<Integer>(_ContractRequest106PolicyholderPreTaxAuthorized_QNAME, Integer.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "opponentName", scope = ContractRequest106 .class)
    public JAXBElement<String> createContractRequest106OpponentName(String value) {
        return new JAXBElement<String>(_ContractRequest106OpponentName_QNAME, String.class, ContractRequest106 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "offset", scope = Settings.class)
    public JAXBElement<Integer> createSettingsOffset(Integer value) {
        return new JAXBElement<Integer>(_SettingsOffset_QNAME, Integer.class, Settings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "returnLanguage", scope = Settings.class)
    public JAXBElement<String> createSettingsReturnLanguage(String value) {
        return new JAXBElement<String>(_SettingsReturnLanguage_QNAME, String.class, Settings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortingCriterions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sortingCriterions", scope = Settings.class)
    public JAXBElement<SortingCriterions> createSettingsSortingCriterions(SortingCriterions value) {
        return new JAXBElement<SortingCriterions>(_SettingsSortingCriterions_QNAME, SortingCriterions.class, Settings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "numberOfContractsReturned", scope = Settings.class)
    public JAXBElement<Integer> createSettingsNumberOfContractsReturned(Integer value) {
        return new JAXBElement<Integer>(_SettingsNumberOfContractsReturned_QNAME, Integer.class, Settings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Locale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "locale", scope = LacquerTypesRequest.class)
    public JAXBElement<Locale> createLacquerTypesRequestLocale(Locale value) {
        return new JAXBElement<Locale>(_ImportDossierRequestLocale_QNAME, Locale.class, LacquerTypesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "mainType", scope = LacquerTypesRequest.class)
    public JAXBElement<Integer> createLacquerTypesRequestMainType(Integer value) {
        return new JAXBElement<Integer>(_LacquerTypesRequestMainType_QNAME, Integer.class, LacquerTypesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vehicleType", scope = LacquerTypesRequest.class)
    public JAXBElement<Integer> createLacquerTypesRequestVehicleType(Integer value) {
        return new JAXBElement<Integer>(_RestrictionVehicleType_QNAME, Integer.class, LacquerTypesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "manufacturer", scope = LacquerTypesRequest.class)
    public JAXBElement<Integer> createLacquerTypesRequestManufacturer(Integer value) {
        return new JAXBElement<Integer>(_RestrictionManufacturer_QNAME, Integer.class, LacquerTypesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "foreignBrand", scope = CreateContractAdditionalData.class)
    public JAXBElement<Integer> createCreateContractAdditionalDataForeignBrand(Integer value) {
        return new JAXBElement<Integer>(_CreateContractAdditionalDataForeignBrand_QNAME, Integer.class, CreateContractAdditionalData.class, value);
    }

}
