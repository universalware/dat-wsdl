
package de.dat.valuateng.soap.dossier1;

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
@WebServiceClient(name = "Dossier1", targetNamespace = "http://www.dat.de/services/Dossier1", wsdlLocation = "http://www.dat.de/valuateNG/soap/Dossier1?wsdl")
public class Dossier1_Service
    extends Service
{

    private final static URL DOSSIER1_WSDL_LOCATION;
    private final static WebServiceException DOSSIER1_EXCEPTION;
    private final static QName DOSSIER1_QNAME = new QName("http://www.dat.de/services/Dossier1", "Dossier1");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.dat.de/valuateNG/soap/Dossier1?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DOSSIER1_WSDL_LOCATION = url;
        DOSSIER1_EXCEPTION = e;
    }

    public Dossier1_Service() {
        super(__getWsdlLocation(), DOSSIER1_QNAME);
    }

    public Dossier1_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), DOSSIER1_QNAME, features);
    }

    public Dossier1_Service(URL wsdlLocation) {
        super(wsdlLocation, DOSSIER1_QNAME);
    }

    public Dossier1_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DOSSIER1_QNAME, features);
    }

    public Dossier1_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Dossier1_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Dossier1
     */
    @WebEndpoint(name = "Dossier1")
    public Dossier1 getDossier1() {
        return super.getPort(new QName("http://www.dat.de/services/Dossier1", "Dossier1"), Dossier1.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Dossier1
     */
    @WebEndpoint(name = "Dossier1")
    public Dossier1 getDossier1(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.dat.de/services/Dossier1", "Dossier1"), Dossier1.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DOSSIER1_EXCEPTION!= null) {
            throw DOSSIER1_EXCEPTION;
        }
        return DOSSIER1_WSDL_LOCATION;
    }

}
