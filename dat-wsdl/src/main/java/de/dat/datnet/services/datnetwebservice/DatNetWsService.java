
package de.dat.datnet.services.datnetwebservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DatNetWsService", targetNamespace = "http://www.dat.de/DAT-NET-Webservice", wsdlLocation = "http://www.dat.de/DatNet/services/DatNetWebService?wsdl")
public class DatNetWsService
    extends Service
{

    private final static URL DATNETWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException DATNETWSSERVICE_EXCEPTION;
    private final static QName DATNETWSSERVICE_QNAME = new QName("http://www.dat.de/DAT-NET-Webservice", "DatNetWsService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.dat.de/DatNet/services/DatNetWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DATNETWSSERVICE_WSDL_LOCATION = url;
        DATNETWSSERVICE_EXCEPTION = e;
    }

    public DatNetWsService() {
        super(__getWsdlLocation(), DATNETWSSERVICE_QNAME);
    }

    public DatNetWsService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DATNETWSSERVICE_QNAME, features);
    }

    public DatNetWsService(URL wsdlLocation) {
        super(wsdlLocation, DATNETWSSERVICE_QNAME);
    }

    public DatNetWsService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DATNETWSSERVICE_QNAME, features);
    }

    public DatNetWsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DatNetWsService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DatNetWs
     */
    @WebEndpoint(name = "DatNetWs")
    public DatNetWs getDatNetWs() {
        return super.getPort(new QName("http://www.dat.de/DAT-NET-Webservice", "DatNetWs"), DatNetWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DatNetWs
     */
    @WebEndpoint(name = "DatNetWs")
    public DatNetWs getDatNetWs(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.dat.de/DAT-NET-Webservice", "DatNetWs"), DatNetWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DATNETWSSERVICE_EXCEPTION!= null) {
            throw DATNETWSSERVICE_EXCEPTION;
        }
        return DATNETWSSERVICE_WSDL_LOCATION;
    }

}