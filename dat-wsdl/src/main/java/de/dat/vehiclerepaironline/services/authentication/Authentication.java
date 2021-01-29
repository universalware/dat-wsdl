
package de.dat.vehiclerepaironline.services.authentication;

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
@WebService(name = "Authentication", targetNamespace = "http://sphinx.dat.de/services/Authentication")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Authentication {


    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "authenticateInterfacePartner", targetNamespace = "http://sphinx.dat.de/services/Authentication", className = "de.dat.vehiclerepaironline.services.authentication.AuthenticateInterfacePartner")
    @ResponseWrapper(localName = "authenticateInterfacePartnerResponse", targetNamespace = "http://sphinx.dat.de/services/Authentication", className = "de.dat.vehiclerepaironline.services.authentication.AuthenticateInterfacePartnerResponse")
    @Action(input = "http://sphinx.dat.de/services/Authentication/Authentication/authenticateInterfacePartnerRequest", output = "http://sphinx.dat.de/services/Authentication/Authentication/authenticateInterfacePartnerResponse")
    public void authenticateInterfacePartner(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns de.dat.vehiclerepaironline.services.authentication.DatCredentials
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "authenticateUser", targetNamespace = "http://sphinx.dat.de/services/Authentication", className = "de.dat.vehiclerepaironline.services.authentication.AuthenticateUser")
    @ResponseWrapper(localName = "authenticateUserResponse", targetNamespace = "http://sphinx.dat.de/services/Authentication", className = "de.dat.vehiclerepaironline.services.authentication.AuthenticateUserResponse")
    @Action(input = "http://sphinx.dat.de/services/Authentication/Authentication/authenticateUserRequest", output = "http://sphinx.dat.de/services/Authentication/Authentication/authenticateUserResponse")
    public DatCredentials authenticateUser(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3);

    /**
     * 
     * @param request
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "doLogin")
    @WebResult(name = "sessionID", targetNamespace = "")
    @RequestWrapper(localName = "doLogin", targetNamespace = "http://sphinx.dat.de/services/Authentication", className = "de.dat.vehiclerepaironline.services.authentication.DoLogin")
    @ResponseWrapper(localName = "doLoginResponse", targetNamespace = "http://sphinx.dat.de/services/Authentication", className = "de.dat.vehiclerepaironline.services.authentication.DoLoginResponse")
    @Action(input = "doLogin", output = "http://sphinx.dat.de/services/Authentication/Authentication/doLoginResponse")
    public String doLogin(
        @WebParam(name = "request", targetNamespace = "")
        DoLoginRequest request);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "getProductVersion")
    @WebResult(name = "productVersion", targetNamespace = "")
    @RequestWrapper(localName = "getProductVersion", targetNamespace = "http://sphinx.dat.de/services/Authentication", className = "de.dat.vehiclerepaironline.services.authentication.GetProductVersion")
    @ResponseWrapper(localName = "getProductVersionResponse", targetNamespace = "http://sphinx.dat.de/services/Authentication", className = "de.dat.vehiclerepaironline.services.authentication.GetProductVersionResponse")
    @Action(input = "getProductVersion", output = "http://sphinx.dat.de/services/Authentication/Authentication/getProductVersionResponse")
    public String getProductVersion();

    /**
     * 
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(action = "doLogout")
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "doLogout", targetNamespace = "http://sphinx.dat.de/services/Authentication", className = "de.dat.vehiclerepaironline.services.authentication.DoLogout")
    @ResponseWrapper(localName = "doLogoutResponse", targetNamespace = "http://sphinx.dat.de/services/Authentication", className = "de.dat.vehiclerepaironline.services.authentication.DoLogoutResponse")
    @Action(input = "doLogout", output = "http://sphinx.dat.de/services/Authentication/Authentication/doLogoutResponse")
    public Boolean doLogout();

    /**
     * 
     * @param request
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "generateToken")
    @WebResult(name = "token", targetNamespace = "")
    @RequestWrapper(localName = "generateToken", targetNamespace = "http://sphinx.dat.de/services/Authentication", className = "de.dat.vehiclerepaironline.services.authentication.GenerateToken")
    @ResponseWrapper(localName = "generateTokenResponse", targetNamespace = "http://sphinx.dat.de/services/Authentication", className = "de.dat.vehiclerepaironline.services.authentication.GenerateTokenResponse")
    @Action(input = "generateToken", output = "http://sphinx.dat.de/services/Authentication/Authentication/generateTokenResponse")
    public String generateToken(
        @WebParam(name = "request", targetNamespace = "")
        GenerateTokenRequest request);

}
