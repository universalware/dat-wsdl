
package de.dat.financeline.services.dossier;

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
@WebService(name = "Dossier", targetNamespace = "http://sphinx.dat.de/services/Dossier")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Dossier {


    /**
     * 
     * @param coverage
     * @param dossierId
     * @return
     *     returns de.dat.financeline.services.dossier.GetDossierResponse.VXS
     */
    @WebMethod(action = "getDossier")
    @WebResult(name = "VXS", targetNamespace = "")
    @RequestWrapper(localName = "getDossier", targetNamespace = "http://sphinx.dat.de/services/Dossier", className = "de.dat.financeline.services.dossier.GetDossier")
    @ResponseWrapper(localName = "getDossierResponse", targetNamespace = "http://sphinx.dat.de/services/Dossier", className = "de.dat.financeline.services.dossier.GetDossierResponse")
    @Action(input = "getDossier", output = "http://sphinx.dat.de/services/Dossier/Dossier/getDossierResponse")
    public de.dat.financeline.services.dossier.GetDossierResponse.VXS getDossier(
        @WebParam(name = "DossierId", targetNamespace = "")
        long dossierId,
        @WebParam(name = "Coverage", targetNamespace = "")
        String coverage);

    /**
     * 
     * @param coverage
     * @param limit
     * @param searchCriterionList
     * @return
     *     returns de.dat.financeline.services.dossier.SearchDossierListResponse.SearchResultList
     */
    @WebMethod(action = "searchDossierList")
    @WebResult(name = "SearchResultList", targetNamespace = "")
    @RequestWrapper(localName = "searchDossierList", targetNamespace = "http://sphinx.dat.de/services/Dossier", className = "de.dat.financeline.services.dossier.SearchDossierList")
    @ResponseWrapper(localName = "searchDossierListResponse", targetNamespace = "http://sphinx.dat.de/services/Dossier", className = "de.dat.financeline.services.dossier.SearchDossierListResponse")
    @Action(input = "searchDossierList", output = "http://sphinx.dat.de/services/Dossier/Dossier/searchDossierListResponse")
    public de.dat.financeline.services.dossier.SearchDossierListResponse.SearchResultList searchDossierList(
        @WebParam(name = "SearchCriterionList", targetNamespace = "")
        SearchDossierListRequest searchCriterionList,
        @WebParam(name = "Limit", targetNamespace = "")
        Integer limit,
        @WebParam(name = "Coverage", targetNamespace = "")
        String coverage);

    /**
     * 
     * @param coverage
     * @param dossierId
     * @return
     *     returns de.dat.financeline.services.dossier.ResetDossier2DefaultResponse.VXS
     */
    @WebMethod(action = "resetDossier2Default")
    @WebResult(name = "VXS", targetNamespace = "")
    @RequestWrapper(localName = "resetDossier2Default", targetNamespace = "http://sphinx.dat.de/services/Dossier", className = "de.dat.financeline.services.dossier.ResetDossier2Default")
    @ResponseWrapper(localName = "resetDossier2DefaultResponse", targetNamespace = "http://sphinx.dat.de/services/Dossier", className = "de.dat.financeline.services.dossier.ResetDossier2DefaultResponse")
    @Action(input = "resetDossier2Default", output = "http://sphinx.dat.de/services/Dossier/Dossier/resetDossier2DefaultResponse")
    public de.dat.financeline.services.dossier.ResetDossier2DefaultResponse.VXS resetDossier2Default(
        @WebParam(name = "DossierId", targetNamespace = "")
        long dossierId,
        @WebParam(name = "Coverage", targetNamespace = "")
        String coverage);

    /**
     * 
     * @param arg0
     * @return
     *     returns byte[]
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createExportFormatData", targetNamespace = "http://sphinx.dat.de/services/Dossier", className = "de.dat.financeline.services.dossier.CreateExportFormatData")
    @ResponseWrapper(localName = "createExportFormatDataResponse", targetNamespace = "http://sphinx.dat.de/services/Dossier", className = "de.dat.financeline.services.dossier.CreateExportFormatDataResponse")
    @Action(input = "http://sphinx.dat.de/services/Dossier/Dossier/createExportFormatDataRequest", output = "http://sphinx.dat.de/services/Dossier/Dossier/createExportFormatDataResponse")
    public byte[] createExportFormatData(
        @WebParam(name = "arg0", targetNamespace = "")
        PrintActBean arg0);

    /**
     * 
     * @param coverage
     * @param dossierId
     * @return
     *     returns de.dat.financeline.services.dossier.UpdateDossierResponse.VXS
     */
    @WebMethod(action = "updateDossier")
    @WebResult(name = "VXS", targetNamespace = "")
    @RequestWrapper(localName = "updateDossier", targetNamespace = "http://sphinx.dat.de/services/Dossier", className = "de.dat.financeline.services.dossier.UpdateDossier")
    @ResponseWrapper(localName = "updateDossierResponse", targetNamespace = "http://sphinx.dat.de/services/Dossier", className = "de.dat.financeline.services.dossier.UpdateDossierResponse")
    @Action(input = "updateDossier", output = "http://sphinx.dat.de/services/Dossier/Dossier/updateDossierResponse")
    public de.dat.financeline.services.dossier.UpdateDossierResponse.VXS updateDossier(
        @WebParam(name = "DossierId", targetNamespace = "")
        long dossierId,
        @WebParam(name = "Coverage", targetNamespace = "")
        String coverage);

    /**
     * 
     * @param dossierId
     * @return
     *     returns boolean
     */
    @WebMethod(action = "deleteDossier")
    @WebResult(name = "Success", targetNamespace = "")
    @RequestWrapper(localName = "deleteDossier", targetNamespace = "http://sphinx.dat.de/services/Dossier", className = "de.dat.financeline.services.dossier.DeleteDossier")
    @ResponseWrapper(localName = "deleteDossierResponse", targetNamespace = "http://sphinx.dat.de/services/Dossier", className = "de.dat.financeline.services.dossier.DeleteDossierResponse")
    @Action(input = "deleteDossier", output = "http://sphinx.dat.de/services/Dossier/Dossier/deleteDossierResponse")
    public boolean deleteDossier(
        @WebParam(name = "DossierId", targetNamespace = "")
        long dossierId);

    /**
     * 
     * @param coverage
     * @param dossier
     * @param save
     * @return
     *     returns de.dat.financeline.services.dossier.CreateDossierResponse.VXS
     */
    @WebMethod(action = "createDossier")
    @WebResult(name = "VXS", targetNamespace = "")
    @RequestWrapper(localName = "createDossier", targetNamespace = "http://sphinx.dat.de/services/Dossier", className = "de.dat.financeline.services.dossier.CreateDossier")
    @ResponseWrapper(localName = "createDossierResponse", targetNamespace = "http://sphinx.dat.de/services/Dossier", className = "de.dat.financeline.services.dossier.CreateDossierResponse")
    @Action(input = "createDossier", output = "http://sphinx.dat.de/services/Dossier/Dossier/createDossierResponse")
    public de.dat.financeline.services.dossier.CreateDossierResponse.VXS createDossier(
        @WebParam(name = "Dossier", targetNamespace = "http://www.dat.de/vxs")
        Dossier_Type dossier,
        @WebParam(name = "Coverage", targetNamespace = "")
        String coverage,
        @WebParam(name = "Save", targetNamespace = "")
        String save);

    /**
     * 
     * @param coverage
     * @param dossier
     * @return
     *     returns de.dat.financeline.services.dossier.ChangeDossierResponse.VXS
     */
    @WebMethod(action = "changeDossier")
    @WebResult(name = "VXS", targetNamespace = "")
    @RequestWrapper(localName = "changeDossier", targetNamespace = "http://sphinx.dat.de/services/Dossier", className = "de.dat.financeline.services.dossier.ChangeDossier")
    @ResponseWrapper(localName = "changeDossierResponse", targetNamespace = "http://sphinx.dat.de/services/Dossier", className = "de.dat.financeline.services.dossier.ChangeDossierResponse")
    @Action(input = "changeDossier", output = "http://sphinx.dat.de/services/Dossier/Dossier/changeDossierResponse")
    public de.dat.financeline.services.dossier.ChangeDossierResponse.VXS changeDossier(
        @WebParam(name = "Dossier", targetNamespace = "http://www.dat.de/vxs")
        Dossier_Type dossier,
        @WebParam(name = "Coverage", targetNamespace = "")
        String coverage);

    /**
     * 
     * @param exportProductAddOns
     * @param format
     * @param dossierId
     * @param locale
     * @param exportProduct
     * @param exportCertificateAddOns
     * @return
     *     returns de.dat.financeline.services.dossier.ExportDossier2
     */
    @WebMethod(action = "exportDossierN")
    @WebResult(name = "ExportDossier", targetNamespace = "")
    @RequestWrapper(localName = "exportDossierN", targetNamespace = "http://sphinx.dat.de/services/Dossier", className = "de.dat.financeline.services.dossier.ExportDossierN")
    @ResponseWrapper(localName = "exportDossierNResponse", targetNamespace = "http://sphinx.dat.de/services/Dossier", className = "de.dat.financeline.services.dossier.ExportDossierNResponse")
    @Action(input = "exportDossierN", output = "http://sphinx.dat.de/services/Dossier/Dossier/exportDossierNResponse")
    public ExportDossier2 exportDossierN(
        @WebParam(name = "DossierId", targetNamespace = "")
        long dossierId,
        @WebParam(name = "Locale", targetNamespace = "")
        Locale locale,
        @WebParam(name = "Format", targetNamespace = "")
        String format,
        @WebParam(name = "ExportProduct", targetNamespace = "")
        ExportProduct exportProduct,
        @WebParam(name = "ExportProductAddOns", targetNamespace = "")
        ExportProductAddOns exportProductAddOns,
        @WebParam(name = "ExportCertificateAddOns", targetNamespace = "")
        ExportCertificateAddOns exportCertificateAddOns);

    /**
     * 
     * @param exportProductAddOns
     * @param format
     * @param dossierId
     * @param locale
     * @param exportProduct
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "exportDossier")
    @WebResult(name = "Base64", targetNamespace = "")
    @RequestWrapper(localName = "exportDossier", targetNamespace = "http://sphinx.dat.de/services/Dossier", className = "de.dat.financeline.services.dossier.ExportDossier")
    @ResponseWrapper(localName = "exportDossierResponse", targetNamespace = "http://sphinx.dat.de/services/Dossier", className = "de.dat.financeline.services.dossier.ExportDossierResponse")
    @Action(input = "exportDossier", output = "http://sphinx.dat.de/services/Dossier/Dossier/exportDossierResponse")
    public String exportDossier(
        @WebParam(name = "DossierId", targetNamespace = "")
        long dossierId,
        @WebParam(name = "Locale", targetNamespace = "")
        Locale locale,
        @WebParam(name = "Format", targetNamespace = "")
        String format,
        @WebParam(name = "ExportProduct", targetNamespace = "")
        ExportProduct exportProduct,
        @WebParam(name = "ExportProductAddOns", targetNamespace = "")
        ExportProductAddOns exportProductAddOns);

}