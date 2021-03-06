
package de.dat.financeline.services.vehicleidentificationservice;

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
@WebService(name = "VehicleIdentificationService", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface VehicleIdentificationService {


    /**
     * 
     * @param request
     * @return
     *     returns de.dat.financeline.services.vehicleidentificationservice.GetVehicleIdentificationResponse.VXS
     */
    @WebMethod(action = "getVehicleIdentification")
    @WebResult(name = "VXS", targetNamespace = "")
    @RequestWrapper(localName = "getVehicleIdentification", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.GetVehicleIdentification")
    @ResponseWrapper(localName = "getVehicleIdentificationResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.GetVehicleIdentificationResponse")
    @Action(input = "getVehicleIdentification", output = "http://sphinx.dat.de/services/VehicleIdentificationService/VehicleIdentificationService/getVehicleIdentificationResponse")
    public de.dat.financeline.services.vehicleidentificationservice.GetVehicleIdentificationResponse.VXS getVehicleIdentification(
        @WebParam(name = "request", targetNamespace = "")
        VehicleSelectionRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns de.dat.financeline.services.vehicleidentificationservice.GetVehicleIdentificationByVinResponse.VXS
     */
    @WebMethod(action = "getVehicleIdentificationByVin")
    @WebResult(name = "VXS", targetNamespace = "")
    @RequestWrapper(localName = "getVehicleIdentificationByVin", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.GetVehicleIdentificationByVin")
    @ResponseWrapper(localName = "getVehicleIdentificationByVinResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.GetVehicleIdentificationByVinResponse")
    @Action(input = "getVehicleIdentificationByVin", output = "http://sphinx.dat.de/services/VehicleIdentificationService/VehicleIdentificationService/getVehicleIdentificationByVinResponse")
    public de.dat.financeline.services.vehicleidentificationservice.GetVehicleIdentificationByVinResponse.VXS getVehicleIdentificationByVin(
        @WebParam(name = "request", targetNamespace = "")
        VinSelectionRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns de.dat.financeline.services.vehicleidentificationservice.GetVehicleIdentificationByTypecodeResponse.VXS
     */
    @WebMethod(action = "getVehicleIdentificationByTypecode")
    @WebResult(name = "VXS", targetNamespace = "")
    @RequestWrapper(localName = "getVehicleIdentificationByTypecode", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.GetVehicleIdentificationByTypecode")
    @ResponseWrapper(localName = "getVehicleIdentificationByTypecodeResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.GetVehicleIdentificationByTypecodeResponse")
    @Action(input = "getVehicleIdentificationByTypecode", output = "http://sphinx.dat.de/services/VehicleIdentificationService/VehicleIdentificationService/getVehicleIdentificationByTypecodeResponse")
    public de.dat.financeline.services.vehicleidentificationservice.GetVehicleIdentificationByTypecodeResponse.VXS getVehicleIdentificationByTypecode(
        @WebParam(name = "request", targetNamespace = "")
        TypecodeSelectionRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns de.dat.financeline.services.vehicleidentificationservice.GetVehicleIdentificationByTypecodeToyotaResponse.VXS
     */
    @WebMethod(action = "getVehicleIdentificationByTypecodeToyota")
    @WebResult(name = "VXS", targetNamespace = "")
    @RequestWrapper(localName = "getVehicleIdentificationByTypecodeToyota", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.GetVehicleIdentificationByTypecodeToyota")
    @ResponseWrapper(localName = "getVehicleIdentificationByTypecodeToyotaResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.GetVehicleIdentificationByTypecodeToyotaResponse")
    @Action(input = "getVehicleIdentificationByTypecodeToyota", output = "http://sphinx.dat.de/services/VehicleIdentificationService/VehicleIdentificationService/getVehicleIdentificationByTypecodeToyotaResponse")
    public de.dat.financeline.services.vehicleidentificationservice.GetVehicleIdentificationByTypecodeToyotaResponse.VXS getVehicleIdentificationByTypecodeToyota(
        @WebParam(name = "request", targetNamespace = "")
        TypecodeSelectionToyotaRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns de.dat.financeline.services.vehicleidentificationservice.GetVehicleIdentificationByNationalCodeAustriaResponse.VXS
     */
    @WebMethod(action = "getVehicleIdentificationByNationalCodeAustria")
    @WebResult(name = "VXS", targetNamespace = "")
    @RequestWrapper(localName = "getVehicleIdentificationByNationalCodeAustria", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.GetVehicleIdentificationByNationalCodeAustria")
    @ResponseWrapper(localName = "getVehicleIdentificationByNationalCodeAustriaResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.GetVehicleIdentificationByNationalCodeAustriaResponse")
    @Action(input = "getVehicleIdentificationByNationalCodeAustria", output = "http://sphinx.dat.de/services/VehicleIdentificationService/VehicleIdentificationService/getVehicleIdentificationByNationalCodeAustriaResponse")
    public de.dat.financeline.services.vehicleidentificationservice.GetVehicleIdentificationByNationalCodeAustriaResponse.VXS getVehicleIdentificationByNationalCodeAustria(
        @WebParam(name = "request", targetNamespace = "")
        NationalCodeAustriaSelectionRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns de.dat.financeline.services.vehicleidentificationservice.GetVehicleIdentificationByCodeSwitzerlandResponse.VXS
     */
    @WebMethod(action = "getVehicleIdentificationByCodeSwitzerland")
    @WebResult(name = "VXS", targetNamespace = "")
    @RequestWrapper(localName = "getVehicleIdentificationByCodeSwitzerland", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.GetVehicleIdentificationByCodeSwitzerland")
    @ResponseWrapper(localName = "getVehicleIdentificationByCodeSwitzerlandResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.GetVehicleIdentificationByCodeSwitzerlandResponse")
    @Action(input = "getVehicleIdentificationByCodeSwitzerland", output = "http://sphinx.dat.de/services/VehicleIdentificationService/VehicleIdentificationService/getVehicleIdentificationByCodeSwitzerlandResponse")
    public de.dat.financeline.services.vehicleidentificationservice.GetVehicleIdentificationByCodeSwitzerlandResponse.VXS getVehicleIdentificationByCodeSwitzerland(
        @WebParam(name = "request", targetNamespace = "")
        CodeSwitzerlandSelectionRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns de.dat.financeline.services.vehicleidentificationservice.GetVehicleTranslationResponse.VXS
     */
    @WebMethod(action = "getVehicleTranslation")
    @WebResult(name = "VXS", targetNamespace = "")
    @RequestWrapper(localName = "getVehicleTranslation", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.GetVehicleTranslation")
    @ResponseWrapper(localName = "getVehicleTranslationResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.GetVehicleTranslationResponse")
    @Action(input = "getVehicleTranslation", output = "http://sphinx.dat.de/services/VehicleIdentificationService/VehicleIdentificationService/getVehicleTranslationResponse")
    public de.dat.financeline.services.vehicleidentificationservice.GetVehicleTranslationResponse.VXS getVehicleTranslation(
        @WebParam(name = "request", targetNamespace = "")
        VehicleTranslationRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns de.dat.financeline.services.vehicleidentificationservice.GetVehicleIdentificationByKbaResponse.VXS
     */
    @WebMethod(action = "getVehicleIdentificationByKba")
    @WebResult(name = "VXS", targetNamespace = "")
    @RequestWrapper(localName = "getVehicleIdentificationByKba", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.GetVehicleIdentificationByKba")
    @ResponseWrapper(localName = "getVehicleIdentificationByKbaResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.GetVehicleIdentificationByKbaResponse")
    @Action(input = "getVehicleIdentificationByKba", output = "http://sphinx.dat.de/services/VehicleIdentificationService/VehicleIdentificationService/getVehicleIdentificationByKbaResponse")
    public de.dat.financeline.services.vehicleidentificationservice.GetVehicleIdentificationByKbaResponse.VXS getVehicleIdentificationByKba(
        @WebParam(name = "request", targetNamespace = "")
        KbaSelectionRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns de.dat.financeline.services.vehicleidentificationservice.GetVinByLicencePlateItalyResponse.VXS
     */
    @WebMethod(action = "getVinByLicencePlateItaly")
    @WebResult(name = "VXS", targetNamespace = "")
    @RequestWrapper(localName = "getVinByLicencePlateItaly", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.GetVinByLicencePlateItaly")
    @ResponseWrapper(localName = "getVinByLicencePlateItalyResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.GetVinByLicencePlateItalyResponse")
    @Action(input = "getVinByLicencePlateItaly", output = "http://sphinx.dat.de/services/VehicleIdentificationService/VehicleIdentificationService/getVinByLicencePlateItalyResponse")
    public de.dat.financeline.services.vehicleidentificationservice.GetVinByLicencePlateItalyResponse.VXS getVinByLicencePlateItaly(
        @WebParam(name = "request", targetNamespace = "")
        VinByLicencePlateItalyRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns de.dat.financeline.services.vehicleidentificationservice.GetVinByLicencePlateFranceResponse.VXS
     */
    @WebMethod(action = "getVinByLicencePlateFrance")
    @WebResult(name = "VXS", targetNamespace = "")
    @RequestWrapper(localName = "getVinByLicencePlateFrance", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.GetVinByLicencePlateFrance")
    @ResponseWrapper(localName = "getVinByLicencePlateFranceResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.GetVinByLicencePlateFranceResponse")
    @Action(input = "getVinByLicencePlateFrance", output = "http://sphinx.dat.de/services/VehicleIdentificationService/VehicleIdentificationService/getVinByLicencePlateFranceResponse")
    public de.dat.financeline.services.vehicleidentificationservice.GetVinByLicencePlateFranceResponse.VXS getVinByLicencePlateFrance(
        @WebParam(name = "request", targetNamespace = "")
        VinByLicencePlateFranceRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns de.dat.financeline.services.vehicleidentificationservice.GetVinByLicencePlateGermanyResponse.LicencePlateGermanyResponse
     */
    @WebMethod(action = "getVinByLicencePlateGermany")
    @WebResult(name = "licencePlateGermanyResponse", targetNamespace = "")
    @RequestWrapper(localName = "getVinByLicencePlateGermany", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.GetVinByLicencePlateGermany")
    @ResponseWrapper(localName = "getVinByLicencePlateGermanyResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.GetVinByLicencePlateGermanyResponse")
    @Action(input = "getVinByLicencePlateGermany", output = "http://sphinx.dat.de/services/VehicleIdentificationService/VehicleIdentificationService/getVinByLicencePlateGermanyResponse")
    public de.dat.financeline.services.vehicleidentificationservice.GetVinByLicencePlateGermanyResponse.LicencePlateGermanyResponse getVinByLicencePlateGermany(
        @WebParam(name = "request", targetNamespace = "")
        VinByLicencePlateGermanyRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns de.dat.financeline.services.vehicleidentificationservice.GetVinByLicencePlateNetherlandsResponse.LicencePlateNetherlandsResponse
     */
    @WebMethod(action = "getVinByLicencePlateNetherlands")
    @WebResult(name = "licencePlateNetherlandsResponse", targetNamespace = "")
    @RequestWrapper(localName = "getVinByLicencePlateNetherlands", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.GetVinByLicencePlateNetherlands")
    @ResponseWrapper(localName = "getVinByLicencePlateNetherlandsResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.GetVinByLicencePlateNetherlandsResponse")
    @Action(input = "getVinByLicencePlateNetherlands", output = "http://sphinx.dat.de/services/VehicleIdentificationService/VehicleIdentificationService/getVinByLicencePlateNetherlandsResponse")
    public de.dat.financeline.services.vehicleidentificationservice.GetVinByLicencePlateNetherlandsResponse.LicencePlateNetherlandsResponse getVinByLicencePlateNetherlands(
        @WebParam(name = "request", targetNamespace = "")
        VinByLicencePlateNetherlandsRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns de.dat.financeline.services.vehicleidentificationservice.GetVinByLicencePlateSpainResponse.VinByLicencePlateSpainResponse
     */
    @WebMethod(action = "getVinByLicencePlateSpain")
    @WebResult(name = "VinByLicencePlateSpainResponse", targetNamespace = "")
    @RequestWrapper(localName = "getVinByLicencePlateSpain", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.GetVinByLicencePlateSpain")
    @ResponseWrapper(localName = "getVinByLicencePlateSpainResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.GetVinByLicencePlateSpainResponse")
    @Action(input = "getVinByLicencePlateSpain", output = "http://sphinx.dat.de/services/VehicleIdentificationService/VehicleIdentificationService/getVinByLicencePlateSpainResponse")
    public de.dat.financeline.services.vehicleidentificationservice.GetVinByLicencePlateSpainResponse.VinByLicencePlateSpainResponse getVinByLicencePlateSpain(
        @WebParam(name = "request", targetNamespace = "")
        VinByLicencePlateSpainRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(action = "orderMarkedVin")
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "orderMarkedVin", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.OrderMarkedVin")
    @ResponseWrapper(localName = "orderMarkedVinResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.OrderMarkedVinResponse")
    @Action(input = "orderMarkedVin", output = "http://sphinx.dat.de/services/VehicleIdentificationService/VehicleIdentificationService/orderMarkedVinResponse")
    public Boolean orderMarkedVin(
        @WebParam(name = "request", targetNamespace = "")
        OrderMarkedVinRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns de.dat.financeline.services.vehicleidentificationservice.VinOcrResponse
     */
    @WebMethod(action = "getVinByOcr")
    @WebResult(name = "vin", targetNamespace = "")
    @RequestWrapper(localName = "getVinByOcr", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.GetVinByOcr")
    @ResponseWrapper(localName = "getVinByOcrResponse", targetNamespace = "http://sphinx.dat.de/services/VehicleIdentificationService", className = "de.dat.financeline.services.vehicleidentificationservice.GetVinByOcrResponse")
    @Action(input = "getVinByOcr", output = "http://sphinx.dat.de/services/VehicleIdentificationService/VehicleIdentificationService/getVinByOcrResponse")
    public VinOcrResponse getVinByOcr(
        @WebParam(name = "request", targetNamespace = "")
        VinOcrRequest request);

}
