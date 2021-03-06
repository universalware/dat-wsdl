
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "VehicleRepairService", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface VehicleRepairService {


    /**
     * 
     * @param request
     * @return
     *     returns de.dat.vehiclerepaironline.services.vehiclerepairservice.InsuranceResponse
     */
    @WebMethod(action = "getInsurances")
    @WebResult(name = "insurances", targetNamespace = "")
    @RequestWrapper(localName = "getInsurances", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetInsurances")
    @ResponseWrapper(localName = "getInsurancesResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetInsurancesResponse")
    @Action(input = "getInsurances", output = "http://sphinx.dat.de/services/VehicleRepairService/VehicleRepairService/getInsurancesResponse")
    public InsuranceResponse getInsurances(
        @WebParam(name = "request", targetNamespace = "")
        InsurancesRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns de.dat.vehiclerepaironline.services.vehiclerepairservice.CalculateResponse.CalculationResult
     */
    @WebMethod(action = "calculate")
    @WebResult(name = "calculationResult", targetNamespace = "")
    @RequestWrapper(localName = "calculate", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.Calculate")
    @ResponseWrapper(localName = "calculateResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.CalculateResponse")
    @Action(input = "calculate", output = "http://sphinx.dat.de/services/VehicleRepairService/VehicleRepairService/calculateResponse")
    public de.dat.vehiclerepaironline.services.vehiclerepairservice.CalculateResponse.CalculationResult calculate(
        @WebParam(name = "request", targetNamespace = "")
        CalculateRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns de.dat.vehiclerepaironline.services.vehiclerepairservice.GetContractResponse.ContractResult
     */
    @WebMethod(action = "getContract")
    @WebResult(name = "contractResult", targetNamespace = "")
    @RequestWrapper(localName = "getContract", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetContract")
    @ResponseWrapper(localName = "getContractResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetContractResponse")
    @Action(input = "getContract", output = "http://sphinx.dat.de/services/VehicleRepairService/VehicleRepairService/getContractResponse")
    public de.dat.vehiclerepaironline.services.vehiclerepairservice.GetContractResponse.ContractResult getContract(
        @WebParam(name = "request", targetNamespace = "")
        GetContractRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns java.lang.Long
     */
    @WebMethod(action = "importDossier")
    @WebResult(name = "contract", targetNamespace = "")
    @RequestWrapper(localName = "importDossier", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.ImportDossier")
    @ResponseWrapper(localName = "importDossierResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.ImportDossierResponse")
    @Action(input = "importDossier", output = "http://sphinx.dat.de/services/VehicleRepairService/VehicleRepairService/importDossierResponse")
    public Long importDossier(
        @WebParam(name = "request", targetNamespace = "")
        ImportDossierRequest request);

    /**
     * 
     * @param contractID
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "getLockedInfo")
    @WebResult(name = "lockedInfo", targetNamespace = "")
    @RequestWrapper(localName = "getLockedInfo", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetLockedInfo")
    @ResponseWrapper(localName = "getLockedInfoResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetLockedInfoResponse")
    @Action(input = "getLockedInfo", output = "http://sphinx.dat.de/services/VehicleRepairService/VehicleRepairService/getLockedInfoResponse")
    public String getLockedInfo(
        @WebParam(name = "contractID", targetNamespace = "")
        long contractID);

    /**
     * 
     * @param layout
     * @param product
     * @param printProduct
     * @param format
     * @param dossierID
     * @param locale
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "exportDossierToDocument")
    @WebResult(name = "exportDocument", targetNamespace = "")
    @RequestWrapper(localName = "exportDossierToDocument", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.ExportDossierToDocument")
    @ResponseWrapper(localName = "exportDossierToDocumentResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.ExportDossierToDocumentResponse")
    @Action(input = "exportDossierToDocument", output = "http://sphinx.dat.de/services/VehicleRepairService/VehicleRepairService/exportDossierToDocumentResponse")
    public String exportDossierToDocument(
        @WebParam(name = "dossierID", targetNamespace = "")
        Long dossierID,
        @WebParam(name = "locale", targetNamespace = "")
        Locale locale,
        @WebParam(name = "format", targetNamespace = "")
        String format,
        @WebParam(name = "product", targetNamespace = "")
        String product,
        @WebParam(name = "printProduct", targetNamespace = "")
        String printProduct,
        @WebParam(name = "layout", targetNamespace = "")
        String layout);

    /**
     * 
     * @param locale
     * @param mainType
     * @param vehicleType
     * @param manufacturer
     * @return
     *     returns java.util.List<de.dat.vehiclerepaironline.services.vehiclerepairservice.AssemblyGroup>
     */
    @WebMethod(action = "getAssemblyGroups")
    @WebResult(name = "AssemblyGroup", targetNamespace = "")
    @RequestWrapper(localName = "getAssemblyGroups", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetAssemblyGroups")
    @ResponseWrapper(localName = "getAssemblyGroupsResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetAssemblyGroupsResponse")
    @Action(input = "getAssemblyGroups", output = "http://sphinx.dat.de/services/VehicleRepairService/VehicleRepairService/getAssemblyGroupsResponse")
    public List<AssemblyGroup> getAssemblyGroups(
        @WebParam(name = "locale", targetNamespace = "")
        Locale locale,
        @WebParam(name = "vehicleType", targetNamespace = "")
        int vehicleType,
        @WebParam(name = "manufacturer", targetNamespace = "")
        int manufacturer,
        @WebParam(name = "mainType", targetNamespace = "")
        int mainType);

    /**
     * 
     * @param coverage
     * @param constructionTime
     * @param equipment
     * @param subType
     * @param locale
     * @param mainType
     * @param vehicleType
     * @param manufacturer
     * @return
     *     returns java.util.List<de.dat.vehiclerepaironline.services.vehiclerepairservice.AssemblyGroup>
     */
    @WebMethod(action = "getAssemblyGroupsN")
    @WebResult(name = "AssemblyGroup", targetNamespace = "")
    @RequestWrapper(localName = "getAssemblyGroupsN", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetAssemblyGroupsN")
    @ResponseWrapper(localName = "getAssemblyGroupsNResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetAssemblyGroupsNResponse")
    @Action(input = "getAssemblyGroupsN", output = "http://sphinx.dat.de/services/VehicleRepairService/VehicleRepairService/getAssemblyGroupsNResponse")
    public List<AssemblyGroup> getAssemblyGroupsN(
        @WebParam(name = "locale", targetNamespace = "")
        Locale locale,
        @WebParam(name = "vehicleType", targetNamespace = "")
        int vehicleType,
        @WebParam(name = "manufacturer", targetNamespace = "")
        int manufacturer,
        @WebParam(name = "mainType", targetNamespace = "")
        int mainType,
        @WebParam(name = "subType", targetNamespace = "")
        Integer subType,
        @WebParam(name = "constructionTime", targetNamespace = "")
        Integer constructionTime,
        @WebParam(name = "equipment", targetNamespace = "")
        List<Long> equipment,
        @WebParam(name = "coverage", targetNamespace = "")
        String coverage);

    /**
     * 
     * @param assemblyGroupId
     * @param locale
     * @param mainType
     * @param vehicleType
     * @param manufacturer
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "getAssemblyGroupGraphic")
    @WebResult(name = "SVG", targetNamespace = "")
    @RequestWrapper(localName = "getAssemblyGroupGraphic", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetAssemblyGroupGraphic")
    @ResponseWrapper(localName = "getAssemblyGroupGraphicResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetAssemblyGroupGraphicResponse")
    @Action(input = "getAssemblyGroupGraphic", output = "http://sphinx.dat.de/services/VehicleRepairService/VehicleRepairService/getAssemblyGroupGraphicResponse")
    public String getAssemblyGroupGraphic(
        @WebParam(name = "locale", targetNamespace = "")
        Locale locale,
        @WebParam(name = "vehicleType", targetNamespace = "")
        int vehicleType,
        @WebParam(name = "manufacturer", targetNamespace = "")
        int manufacturer,
        @WebParam(name = "mainType", targetNamespace = "")
        int mainType,
        @WebParam(name = "assemblyGroupId", targetNamespace = "")
        int assemblyGroupId);

    /**
     * 
     * @param request
     * @return
     *     returns java.util.List<java.lang.Long>
     */
    @WebMethod(action = "getValidDATProcesses")
    @WebResult(name = "datProcessId", targetNamespace = "")
    @RequestWrapper(localName = "getValidDATProcesses", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetValidDATProcesses")
    @ResponseWrapper(localName = "getValidDATProcessesResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetValidDATProcessesResponse")
    @Action(input = "getValidDATProcesses", output = "http://sphinx.dat.de/services/VehicleRepairService/VehicleRepairService/getValidDATProcessesResponse")
    public List<Long> getValidDATProcesses(
        @WebParam(name = "request", targetNamespace = "")
        DatProcessesRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns de.dat.vehiclerepaironline.services.vehiclerepairservice.LacquerTypesResponse
     */
    @WebMethod(action = "getLacquerTypeKeys")
    @WebResult(name = "lacquerTypes", targetNamespace = "")
    @RequestWrapper(localName = "getLacquerTypeKeys", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetLacquerTypeKeys")
    @ResponseWrapper(localName = "getLacquerTypeKeysResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetLacquerTypeKeysResponse")
    @Action(input = "getLacquerTypeKeys", output = "http://sphinx.dat.de/services/VehicleRepairService/VehicleRepairService/getLacquerTypeKeysResponse")
    public LacquerTypesResponse getLacquerTypeKeys(
        @WebParam(name = "request", targetNamespace = "")
        LacquerTypesRequest request);

    /**
     * 
     * @param contractID
     * @return
     *     returns de.dat.vehiclerepaironline.services.vehiclerepairservice.PriceDatesResponse
     */
    @WebMethod(action = "getContractPriceGenerations")
    @WebResult(name = "priceDates", targetNamespace = "")
    @RequestWrapper(localName = "getContractPriceGenerations", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetContractPriceGenerations")
    @ResponseWrapper(localName = "getContractPriceGenerationsResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetContractPriceGenerationsResponse")
    @Action(input = "getContractPriceGenerations", output = "http://sphinx.dat.de/services/VehicleRepairService/VehicleRepairService/getContractPriceGenerationsResponse")
    public PriceDatesResponse getContractPriceGenerations(
        @WebParam(name = "contractID", targetNamespace = "")
        long contractID);

    /**
     * 
     * @param generation
     * @param locale
     * @param manufacturer
     * @return
     *     returns de.dat.vehiclerepaironline.services.vehiclerepairservice.PriceDatesResponse
     */
    @WebMethod(action = "getLastPriceGenerationByMfr")
    @WebResult(name = "priceDates", targetNamespace = "")
    @RequestWrapper(localName = "getLastPriceGenerationByMfr", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetLastPriceGenerationByMfr")
    @ResponseWrapper(localName = "getLastPriceGenerationByMfrResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetLastPriceGenerationByMfrResponse")
    @Action(input = "getLastPriceGenerationByMfr", output = "http://sphinx.dat.de/services/VehicleRepairService/VehicleRepairService/getLastPriceGenerationByMfrResponse")
    public PriceDatesResponse getLastPriceGenerationByMfr(
        @WebParam(name = "manufacturer", targetNamespace = "")
        int manufacturer,
        @WebParam(name = "generation", targetNamespace = "")
        Integer generation,
        @WebParam(name = "locale", targetNamespace = "")
        Locale locale);

    /**
     * 
     * @param request
     * @return
     *     returns de.dat.vehiclerepaironline.services.vehiclerepairservice.ChangePriceDatesResponse
     */
    @WebMethod(action = "setContractPriceGeneration")
    @WebResult(name = "contractStatus", targetNamespace = "")
    @RequestWrapper(localName = "setContractPriceGeneration", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.SetContractPriceGeneration")
    @ResponseWrapper(localName = "setContractPriceGenerationResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.SetContractPriceGenerationResponse")
    @Action(input = "setContractPriceGeneration", output = "http://sphinx.dat.de/services/VehicleRepairService/VehicleRepairService/setContractPriceGenerationResponse")
    public ChangePriceDatesResponse setContractPriceGeneration(
        @WebParam(name = "request", targetNamespace = "")
        ChangePriceDatesRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns de.dat.vehiclerepaironline.services.vehiclerepairservice.CalculateContractResponse.CalculationResult
     */
    @WebMethod(action = "calculateContract")
    @WebResult(name = "calculationResult", targetNamespace = "")
    @RequestWrapper(localName = "calculateContract", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.CalculateContract")
    @ResponseWrapper(localName = "calculateContractResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.CalculateContractResponse")
    @Action(input = "calculateContract", output = "http://sphinx.dat.de/services/VehicleRepairService/VehicleRepairService/calculateContractResponse")
    public de.dat.vehiclerepaironline.services.vehiclerepairservice.CalculateContractResponse.CalculationResult calculateContract(
        @WebParam(name = "request", targetNamespace = "")
        CalculateContractRequest request);

    /**
     * 
     * @param includeProtocol
     * @param contractID
     * @param locale
     * @return
     *     returns de.dat.vehiclerepaironline.services.vehiclerepairservice.GetCalculationResultsResponse.CalculationResult
     */
    @WebMethod(action = "getCalculationResults")
    @WebResult(name = "calculationResult", targetNamespace = "")
    @RequestWrapper(localName = "getCalculationResults", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetCalculationResults")
    @ResponseWrapper(localName = "getCalculationResultsResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetCalculationResultsResponse")
    @Action(input = "getCalculationResults", output = "http://sphinx.dat.de/services/VehicleRepairService/VehicleRepairService/getCalculationResultsResponse")
    public de.dat.vehiclerepaironline.services.vehiclerepairservice.GetCalculationResultsResponse.CalculationResult getCalculationResults(
        @WebParam(name = "contractID", targetNamespace = "")
        long contractID,
        @WebParam(name = "locale", targetNamespace = "")
        Locale locale,
        @WebParam(name = "includeProtocol", targetNamespace = "")
        Boolean includeProtocol);

    /**
     * 
     * @param request
     * @return
     *     returns de.dat.vehiclerepaironline.services.vehiclerepairservice.GetMaintenanceIntervalsResponse.Maintenance
     */
    @WebMethod(action = "getMaintenanceIntervals")
    @WebResult(name = "maintenance", targetNamespace = "")
    @RequestWrapper(localName = "getMaintenanceIntervals", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetMaintenanceIntervals")
    @ResponseWrapper(localName = "getMaintenanceIntervalsResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetMaintenanceIntervalsResponse")
    @Action(input = "getMaintenanceIntervals", output = "http://sphinx.dat.de/services/VehicleRepairService/VehicleRepairService/getMaintenanceIntervalsResponse")
    public de.dat.vehiclerepaironline.services.vehiclerepairservice.GetMaintenanceIntervalsResponse.Maintenance getMaintenanceIntervals(
        @WebParam(name = "request", targetNamespace = "")
        MaintenanceRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns java.lang.Long
     */
    @WebMethod(action = "createContract")
    @WebResult(name = "contract", targetNamespace = "")
    @RequestWrapper(localName = "createContract", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.CreateContract")
    @ResponseWrapper(localName = "createContractResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.CreateContractResponse")
    @Action(input = "createContract", output = "http://sphinx.dat.de/services/VehicleRepairService/VehicleRepairService/createContractResponse")
    public Long createContract(
        @WebParam(name = "request", targetNamespace = "")
        ContractRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns java.util.List<de.dat.vehiclerepaironline.services.vehiclerepairservice.DatProcessInfoEquipments>
     */
    @WebMethod(action = "getDVNEquipments")
    @WebResult(name = "dvnEquipmentsResult", targetNamespace = "")
    @RequestWrapper(localName = "getDVNEquipments", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetDVNEquipments")
    @ResponseWrapper(localName = "getDVNEquipmentsResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetDVNEquipmentsResponse")
    @Action(input = "getDVNEquipments", output = "http://sphinx.dat.de/services/VehicleRepairService/VehicleRepairService/getDVNEquipmentsResponse")
    public List<DatProcessInfoEquipments> getDVNEquipments(
        @WebParam(name = "request", targetNamespace = "")
        DatProcessEquipmentsRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns de.dat.vehiclerepaironline.services.vehiclerepairservice.DatContractListResponse
     */
    @WebMethod(action = "getContractList")
    @WebResult(name = "contractList", targetNamespace = "")
    @RequestWrapper(localName = "getContractList", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetContractList")
    @ResponseWrapper(localName = "getContractListResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetContractListResponse")
    @Action(input = "getContractList", output = "http://sphinx.dat.de/services/VehicleRepairService/VehicleRepairService/getContractListResponse")
    public DatContractListResponse getContractList(
        @WebParam(name = "request", targetNamespace = "")
        DATContractListRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns java.lang.Long
     */
    @WebMethod(action = "createContract106")
    @WebResult(name = "contract", targetNamespace = "")
    @RequestWrapper(localName = "createContract106", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.CreateContract106")
    @ResponseWrapper(localName = "createContract106Response", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.CreateContract106Response")
    @Action(input = "createContract106", output = "http://sphinx.dat.de/services/VehicleRepairService/VehicleRepairService/createContract106Response")
    public Long createContract106(
        @WebParam(name = "request", targetNamespace = "")
        ContractRequest106 request);

    /**
     * 
     * @return
     *     returns de.dat.vehiclerepaironline.services.vehiclerepairservice.ExportManualPositionsResponse.ManualPositions
     */
    @WebMethod(action = "exportManualPositions")
    @WebResult(name = "manualPositions", targetNamespace = "")
    @RequestWrapper(localName = "exportManualPositions", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.ExportManualPositions")
    @ResponseWrapper(localName = "exportManualPositionsResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.ExportManualPositionsResponse")
    @Action(input = "exportManualPositions", output = "http://sphinx.dat.de/services/VehicleRepairService/VehicleRepairService/exportManualPositionsResponse")
    public de.dat.vehiclerepaironline.services.vehiclerepairservice.ExportManualPositionsResponse.ManualPositions exportManualPositions();

    /**
     * 
     * @param request
     * @return
     *     returns boolean
     */
    @WebMethod(action = "importManualPositions")
    @WebResult(name = "importSuccessful", targetNamespace = "")
    @RequestWrapper(localName = "importManualPositions", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.ImportManualPositions")
    @ResponseWrapper(localName = "importManualPositionsResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.ImportManualPositionsResponse")
    @Action(input = "importManualPositions", output = "http://sphinx.dat.de/services/VehicleRepairService/VehicleRepairService/importManualPositionsResponse")
    public boolean importManualPositions(
        @WebParam(name = "request", targetNamespace = "")
        de.dat.vehiclerepaironline.services.vehiclerepairservice.ImportManualPositions.Request request);

    /**
     * 
     * @return
     *     returns boolean
     */
    @WebMethod(action = "deleteAllManualPositions")
    @WebResult(name = "deleteSuccessful", targetNamespace = "")
    @RequestWrapper(localName = "deleteAllManualPositions", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.DeleteAllManualPositions")
    @ResponseWrapper(localName = "deleteAllManualPositionsResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.DeleteAllManualPositionsResponse")
    @Action(input = "deleteAllManualPositions", output = "http://sphinx.dat.de/services/VehicleRepairService/VehicleRepairService/deleteAllManualPositionsResponse")
    public boolean deleteAllManualPositions();

    /**
     * 
     * @param request
     * @return
     *     returns de.dat.vehiclerepaironline.services.vehiclerepairservice.SetBlanketClaculationResponse
     */
    @WebMethod(action = "setBlanketCalculation")
    @WebResult(name = "blanketCalculation", targetNamespace = "")
    @RequestWrapper(localName = "setBlanketCalculation", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.SetBlanketCalculation")
    @ResponseWrapper(localName = "setBlanketCalculationResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.SetBlanketCalculationResponse")
    @Action(input = "setBlanketCalculation", output = "http://sphinx.dat.de/services/VehicleRepairService/VehicleRepairService/setBlanketCalculationResponse")
    public SetBlanketClaculationResponse setBlanketCalculation(
        @WebParam(name = "request", targetNamespace = "")
        SetBlanketCalculationRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns de.dat.vehiclerepaironline.services.vehiclerepairservice.DpnDependenciesResponse
     */
    @WebMethod(action = "getDPNDependenciesSimulation")
    @WebResult(name = "DPNDependenciesResponse", targetNamespace = "")
    @RequestWrapper(localName = "getDPNDependenciesSimulation", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetDPNDependenciesSimulation")
    @ResponseWrapper(localName = "getDPNDependenciesSimulationResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetDPNDependenciesSimulationResponse")
    @Action(input = "getDPNDependenciesSimulation", output = "http://sphinx.dat.de/services/VehicleRepairService/VehicleRepairService/getDPNDependenciesSimulationResponse")
    public DpnDependenciesResponse getDPNDependenciesSimulation(
        @WebParam(name = "request", targetNamespace = "")
        DpnDependenciesRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "exportToDocument")
    @WebResult(name = "exportToDocument", targetNamespace = "")
    @RequestWrapper(localName = "exportToDocument", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.ExportToDocument")
    @ResponseWrapper(localName = "exportToDocumentResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.ExportToDocumentResponse")
    @Action(input = "exportToDocument", output = "http://sphinx.dat.de/services/VehicleRepairService/VehicleRepairService/exportToDocumentResponse")
    public String exportToDocument(
        @WebParam(name = "request", targetNamespace = "")
        ExportToDocumentRequest request);

    /**
     * 
     * @param locale
     * @return
     *     returns java.util.List<de.dat.vehiclerepaironline.services.vehiclerepairservice.ExportProduct>
     */
    @WebMethod(action = "getTemplates")
    @WebResult(name = "ExportProduct", targetNamespace = "")
    @RequestWrapper(localName = "getTemplates", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetTemplates")
    @ResponseWrapper(localName = "getTemplatesResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.GetTemplatesResponse")
    @Action(input = "getTemplates", output = "http://sphinx.dat.de/services/VehicleRepairService/VehicleRepairService/getTemplatesResponse")
    public List<ExportProduct> getTemplates(
        @WebParam(name = "locale", targetNamespace = "")
        Locale locale);

    /**
     * 
     * @param locale
     * @return
     *     returns java.util.List<de.dat.vehiclerepaironline.services.vehiclerepairservice.ExportProduct>
     */
    @WebMethod(action = "listTemplates")
    @WebResult(name = "ExportProduct", targetNamespace = "")
    @RequestWrapper(localName = "listTemplates", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.ListTemplates")
    @ResponseWrapper(localName = "listTemplatesResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleRepairService", className = "de.dat.vehiclerepaironline.services.vehiclerepairservice.ListTemplatesResponse")
    @Action(input = "listTemplates", output = "http://sphinx.dat.de/services/VehicleRepairService/VehicleRepairService/listTemplatesResponse")
    public List<ExportProduct> listTemplates(
        @WebParam(name = "locale", targetNamespace = "")
        Locale locale);

}
