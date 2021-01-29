
package de.dat.myclaim.soap.vehiclerepairservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "VehicleRepairService", targetNamespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface VehicleRepairService {


    /**
     * 
     * @param request
     * @return
     *     returns java.util.List<de.dat.myclaim.soap.vehiclerepairservice.DatProcessInfoEquipments>
     */
    @WebMethod(action = "getDVNEquipments")
    @WebResult(name = "dvnEquipmentsResult", targetNamespace = "")
    @RequestWrapper(localName = "getDVNEquipments", targetNamespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", className = "de.dat.myclaim.soap.vehiclerepairservice.GetDVNEquipments")
    @ResponseWrapper(localName = "getDVNEquipmentsResponse", targetNamespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", className = "de.dat.myclaim.soap.vehiclerepairservice.GetDVNEquipmentsResponse")
    @Action(input = "getDVNEquipments", output = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService/VehicleRepairService/getDVNEquipmentsResponse")
    public List<DatProcessInfoEquipments> getDVNEquipments(
        @WebParam(name = "request", targetNamespace = "")
        DatProcessEquipmentsRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns java.util.List<java.lang.Long>
     */
    @WebMethod(action = "getValidDATProcesses")
    @WebResult(name = "datProcessId", targetNamespace = "")
    @RequestWrapper(localName = "getValidDATProcesses", targetNamespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", className = "de.dat.myclaim.soap.vehiclerepairservice.GetValidDATProcesses")
    @ResponseWrapper(localName = "getValidDATProcessesResponse", targetNamespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", className = "de.dat.myclaim.soap.vehiclerepairservice.GetValidDATProcessesResponse")
    @Action(input = "getValidDATProcesses", output = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService/VehicleRepairService/getValidDATProcessesResponse")
    public List<Long> getValidDATProcesses(
        @WebParam(name = "request", targetNamespace = "")
        DatProcessesRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns de.dat.myclaim.soap.vehiclerepairservice.LacquerTypesResponse
     */
    @WebMethod(action = "getLacquerTypeKeys")
    @WebResult(name = "lacquerTypes", targetNamespace = "")
    @RequestWrapper(localName = "getLacquerTypeKeys", targetNamespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", className = "de.dat.myclaim.soap.vehiclerepairservice.GetLacquerTypeKeys")
    @ResponseWrapper(localName = "getLacquerTypeKeysResponse", targetNamespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", className = "de.dat.myclaim.soap.vehiclerepairservice.GetLacquerTypeKeysResponse")
    @Action(input = "getLacquerTypeKeys", output = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService/VehicleRepairService/getLacquerTypeKeysResponse")
    public LacquerTypesResponse getLacquerTypeKeys(
        @WebParam(name = "request", targetNamespace = "")
        LacquerTypesRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns de.dat.myclaim.soap.vehiclerepairservice.InsuranceResponse
     */
    @WebMethod(action = "getInsurances")
    @WebResult(name = "insurances", targetNamespace = "")
    @RequestWrapper(localName = "getInsurances", targetNamespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", className = "de.dat.myclaim.soap.vehiclerepairservice.GetInsurances")
    @ResponseWrapper(localName = "getInsurancesResponse", targetNamespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", className = "de.dat.myclaim.soap.vehiclerepairservice.GetInsurancesResponse")
    @Action(input = "getInsurances", output = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService/VehicleRepairService/getInsurancesResponse")
    public InsuranceResponse getInsurances(
        @WebParam(name = "request", targetNamespace = "")
        InsurancesRequest request);

    /**
     * 
     * @param contractID
     * @return
     *     returns de.dat.myclaim.soap.vehiclerepairservice.PriceDatesResponse
     */
    @WebMethod(action = "getContractPriceGenerations")
    @WebResult(name = "priceDates", targetNamespace = "")
    @RequestWrapper(localName = "getContractPriceGenerations", targetNamespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", className = "de.dat.myclaim.soap.vehiclerepairservice.GetContractPriceGenerations")
    @ResponseWrapper(localName = "getContractPriceGenerationsResponse", targetNamespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", className = "de.dat.myclaim.soap.vehiclerepairservice.GetContractPriceGenerationsResponse")
    @Action(input = "getContractPriceGenerations", output = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService/VehicleRepairService/getContractPriceGenerationsResponse")
    public PriceDatesResponse getContractPriceGenerations(
        @WebParam(name = "contractID", targetNamespace = "")
        long contractID);

    /**
     * 
     * @param request
     * @return
     *     returns de.dat.myclaim.soap.vehiclerepairservice.ChangePriceDatesResponse
     */
    @WebMethod(action = "setContractPriceGeneration")
    @WebResult(name = "contractStatus", targetNamespace = "")
    @RequestWrapper(localName = "setContractPriceGeneration", targetNamespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", className = "de.dat.myclaim.soap.vehiclerepairservice.SetContractPriceGeneration")
    @ResponseWrapper(localName = "setContractPriceGenerationResponse", targetNamespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", className = "de.dat.myclaim.soap.vehiclerepairservice.SetContractPriceGenerationResponse")
    @Action(input = "setContractPriceGeneration", output = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService/VehicleRepairService/setContractPriceGenerationResponse")
    public ChangePriceDatesResponse setContractPriceGeneration(
        @WebParam(name = "request", targetNamespace = "")
        ChangePriceDatesRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns de.dat.myclaim.soap.vehiclerepairservice.CalculateContractResponse.CalculationResult
     */
    @WebMethod(action = "calculateContract")
    @WebResult(name = "calculationResult", targetNamespace = "")
    @RequestWrapper(localName = "calculateContract", targetNamespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", className = "de.dat.myclaim.soap.vehiclerepairservice.CalculateContract")
    @ResponseWrapper(localName = "calculateContractResponse", targetNamespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", className = "de.dat.myclaim.soap.vehiclerepairservice.CalculateContractResponse")
    @Action(input = "calculateContract", output = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService/VehicleRepairService/calculateContractResponse")
    public de.dat.myclaim.soap.vehiclerepairservice.CalculateContractResponse.CalculationResult calculateContract(
        @WebParam(name = "request", targetNamespace = "")
        CalculateContractRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns de.dat.myclaim.soap.vehiclerepairservice.CalculateResponse.CalculationResult
     */
    @WebMethod(action = "calculate")
    @WebResult(name = "calculationResult", targetNamespace = "")
    @RequestWrapper(localName = "calculate", targetNamespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", className = "de.dat.myclaim.soap.vehiclerepairservice.Calculate")
    @ResponseWrapper(localName = "calculateResponse", targetNamespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", className = "de.dat.myclaim.soap.vehiclerepairservice.CalculateResponse")
    @Action(input = "calculate", output = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService/VehicleRepairService/calculateResponse")
    public de.dat.myclaim.soap.vehiclerepairservice.CalculateResponse.CalculationResult calculate(
        @WebParam(name = "request", targetNamespace = "")
        CalculateRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns de.dat.myclaim.soap.vehiclerepairservice.GetContractResponse.ContractResult
     * @throws SecurityProblemException_Exception
     */
    @WebMethod(action = "getContract")
    @WebResult(name = "contractResult", targetNamespace = "")
    @RequestWrapper(localName = "getContract", targetNamespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", className = "de.dat.myclaim.soap.vehiclerepairservice.GetContract")
    @ResponseWrapper(localName = "getContractResponse", targetNamespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", className = "de.dat.myclaim.soap.vehiclerepairservice.GetContractResponse")
    @Action(input = "getContract", output = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService/VehicleRepairService/getContractResponse", fault = {
        @FaultAction(className = SecurityProblemException_Exception.class, value = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService/VehicleRepairService/getContract/Fault/SecurityProblemException")
    })
    public de.dat.myclaim.soap.vehiclerepairservice.GetContractResponse.ContractResult getContract(
        @WebParam(name = "request", targetNamespace = "")
        GetContractRequest request)
        throws SecurityProblemException_Exception
    ;

    /**
     * 
     * @param request
     * @return
     *     returns de.dat.myclaim.soap.vehiclerepairservice.GetMaintenanceIntervalsResponse.Maintenance
     */
    @WebMethod(action = "getMaintenanceIntervals")
    @WebResult(name = "maintenance", targetNamespace = "")
    @RequestWrapper(localName = "getMaintenanceIntervals", targetNamespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", className = "de.dat.myclaim.soap.vehiclerepairservice.GetMaintenanceIntervals")
    @ResponseWrapper(localName = "getMaintenanceIntervalsResponse", targetNamespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", className = "de.dat.myclaim.soap.vehiclerepairservice.GetMaintenanceIntervalsResponse")
    @Action(input = "getMaintenanceIntervals", output = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService/VehicleRepairService/getMaintenanceIntervalsResponse")
    public de.dat.myclaim.soap.vehiclerepairservice.GetMaintenanceIntervalsResponse.Maintenance getMaintenanceIntervals(
        @WebParam(name = "request", targetNamespace = "")
        MaintenanceRequest request);

    /**
     * 
     * @param locale
     * @param mainType
     * @param vehicleType
     * @param manufacturer
     * @return
     *     returns java.util.List<de.dat.myclaim.soap.vehiclerepairservice.AssemblyGroup>
     */
    @WebMethod(action = "getAssemblyGroups")
    @WebResult(name = "AssemblyGroup", targetNamespace = "")
    @RequestWrapper(localName = "getAssemblyGroups", targetNamespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", className = "de.dat.myclaim.soap.vehiclerepairservice.GetAssemblyGroups")
    @ResponseWrapper(localName = "getAssemblyGroupsResponse", targetNamespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", className = "de.dat.myclaim.soap.vehiclerepairservice.GetAssemblyGroupsResponse")
    @Action(input = "getAssemblyGroups", output = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService/VehicleRepairService/getAssemblyGroupsResponse")
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
    @RequestWrapper(localName = "getAssemblyGroupGraphic", targetNamespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", className = "de.dat.myclaim.soap.vehiclerepairservice.GetAssemblyGroupGraphic")
    @ResponseWrapper(localName = "getAssemblyGroupGraphicResponse", targetNamespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", className = "de.dat.myclaim.soap.vehiclerepairservice.GetAssemblyGroupGraphicResponse")
    @Action(input = "getAssemblyGroupGraphic", output = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService/VehicleRepairService/getAssemblyGroupGraphicResponse")
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
     * @param contractID
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "getLockedInfo")
    @WebResult(name = "lockedInfo", targetNamespace = "")
    @RequestWrapper(localName = "getLockedInfo", targetNamespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", className = "de.dat.myclaim.soap.vehiclerepairservice.GetLockedInfo")
    @ResponseWrapper(localName = "getLockedInfoResponse", targetNamespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", className = "de.dat.myclaim.soap.vehiclerepairservice.GetLockedInfoResponse")
    @Action(input = "getLockedInfo", output = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService/VehicleRepairService/getLockedInfoResponse")
    public String getLockedInfo(
        @WebParam(name = "contractID", targetNamespace = "")
        long contractID);

}