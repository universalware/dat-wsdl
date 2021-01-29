
package de.dat.sparepartrequest.services.spareparts;

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
@WebServiceClient(name = "SpareParts", targetNamespace = "http://sphinx.dat.de/services/SpareParts", wsdlLocation = "http://www.dat.de/SparePartRequest/services/SpareParts?wsdl")
public class SpareParts_Service
    extends Service
{

    private final static URL SPAREPARTS_WSDL_LOCATION;
    private final static WebServiceException SPAREPARTS_EXCEPTION;
    private final static QName SPAREPARTS_QNAME = new QName("http://sphinx.dat.de/services/SpareParts", "SpareParts");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.dat.de/SparePartRequest/services/SpareParts?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SPAREPARTS_WSDL_LOCATION = url;
        SPAREPARTS_EXCEPTION = e;
    }

    public SpareParts_Service() {
        super(__getWsdlLocation(), SPAREPARTS_QNAME);
    }

    public SpareParts_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SPAREPARTS_QNAME, features);
    }

    public SpareParts_Service(URL wsdlLocation) {
        super(wsdlLocation, SPAREPARTS_QNAME);
    }

    public SpareParts_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SPAREPARTS_QNAME, features);
    }

    public SpareParts_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SpareParts_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SpareParts
     */
    @WebEndpoint(name = "SparePartsPortBinding")
    public SpareParts getSparePartsPortBinding() {
        return super.getPort(new QName("http://sphinx.dat.de/services/SpareParts", "SparePartsPortBinding"), SpareParts.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SpareParts
     */
    @WebEndpoint(name = "SparePartsPortBinding")
    public SpareParts getSparePartsPortBinding(WebServiceFeature... features) {
        return super.getPort(new QName("http://sphinx.dat.de/services/SpareParts", "SparePartsPortBinding"), SpareParts.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SPAREPARTS_EXCEPTION!= null) {
            throw SPAREPARTS_EXCEPTION;
        }
        return SPAREPARTS_WSDL_LOCATION;
    }

}