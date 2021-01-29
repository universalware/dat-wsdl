
package de.dat.datnet.services.datnetwebservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DatNetWs", targetNamespace = "http://www.dat.de/DAT-NET-Webservice")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DatNetWs {


    /**
     * 
     * @param parameters
     * @return
     *     returns de.dat.datnet.services.datnetwebservice.Response
     */
    @WebMethod(action = "http://www.dat.de/DAT-NET-Webservice/Action")
    @WebResult(name = "Response", targetNamespace = "http://www.dat.de/DAT-NET-Webservice", partName = "parameters")
    public Response doAction(
        @WebParam(name = "Request", targetNamespace = "http://www.dat.de/DAT-NET-Webservice", partName = "parameters")
        Request parameters);

}
