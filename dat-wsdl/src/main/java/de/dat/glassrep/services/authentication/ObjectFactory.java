
package de.dat.glassrep.services.authentication;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.dat.glassrep.services.authentication package. 
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

    private final static QName _AuthenticateUser_QNAME = new QName("http://sphinx.dat.de/services/Authentication", "authenticateUser");
    private final static QName _AuthenticateInterfacePartner_QNAME = new QName("http://sphinx.dat.de/services/Authentication", "authenticateInterfacePartner");
    private final static QName _DoLoginResponse_QNAME = new QName("http://sphinx.dat.de/services/Authentication", "doLoginResponse");
    private final static QName _DoLogout_QNAME = new QName("http://sphinx.dat.de/services/Authentication", "doLogout");
    private final static QName _GenerateToken_QNAME = new QName("http://sphinx.dat.de/services/Authentication", "generateToken");
    private final static QName _DoLogin_QNAME = new QName("http://sphinx.dat.de/services/Authentication", "doLogin");
    private final static QName _GetProductVersion_QNAME = new QName("http://sphinx.dat.de/services/Authentication", "getProductVersion");
    private final static QName _AuthenticateUserResponse_QNAME = new QName("http://sphinx.dat.de/services/Authentication", "authenticateUserResponse");
    private final static QName _AuthenticateInterfacePartnerResponse_QNAME = new QName("http://sphinx.dat.de/services/Authentication", "authenticateInterfacePartnerResponse");
    private final static QName _GenerateTokenResponse_QNAME = new QName("http://sphinx.dat.de/services/Authentication", "generateTokenResponse");
    private final static QName _GetProductVersionResponse_QNAME = new QName("http://sphinx.dat.de/services/Authentication", "getProductVersionResponse");
    private final static QName _DoLogoutResponse_QNAME = new QName("http://sphinx.dat.de/services/Authentication", "doLogoutResponse");
    private final static QName _GenerateTokenRequestProductVariant_QNAME = new QName("", "productVariant");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.dat.glassrep.services.authentication
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoLogin }
     * 
     */
    public DoLogin createDoLogin() {
        return new DoLogin();
    }

    /**
     * Create an instance of {@link DoLogout }
     * 
     */
    public DoLogout createDoLogout() {
        return new DoLogout();
    }

    /**
     * Create an instance of {@link GenerateToken }
     * 
     */
    public GenerateToken createGenerateToken() {
        return new GenerateToken();
    }

    /**
     * Create an instance of {@link AuthenticateUser }
     * 
     */
    public AuthenticateUser createAuthenticateUser() {
        return new AuthenticateUser();
    }

    /**
     * Create an instance of {@link AuthenticateInterfacePartner }
     * 
     */
    public AuthenticateInterfacePartner createAuthenticateInterfacePartner() {
        return new AuthenticateInterfacePartner();
    }

    /**
     * Create an instance of {@link DoLoginResponse }
     * 
     */
    public DoLoginResponse createDoLoginResponse() {
        return new DoLoginResponse();
    }

    /**
     * Create an instance of {@link GenerateTokenResponse }
     * 
     */
    public GenerateTokenResponse createGenerateTokenResponse() {
        return new GenerateTokenResponse();
    }

    /**
     * Create an instance of {@link GetProductVersionResponse }
     * 
     */
    public GetProductVersionResponse createGetProductVersionResponse() {
        return new GetProductVersionResponse();
    }

    /**
     * Create an instance of {@link DoLogoutResponse }
     * 
     */
    public DoLogoutResponse createDoLogoutResponse() {
        return new DoLogoutResponse();
    }

    /**
     * Create an instance of {@link GetProductVersion }
     * 
     */
    public GetProductVersion createGetProductVersion() {
        return new GetProductVersion();
    }

    /**
     * Create an instance of {@link AuthenticateInterfacePartnerResponse }
     * 
     */
    public AuthenticateInterfacePartnerResponse createAuthenticateInterfacePartnerResponse() {
        return new AuthenticateInterfacePartnerResponse();
    }

    /**
     * Create an instance of {@link AuthenticateUserResponse }
     * 
     */
    public AuthenticateUserResponse createAuthenticateUserResponse() {
        return new AuthenticateUserResponse();
    }

    /**
     * Create an instance of {@link Datrcbkb }
     * 
     */
    public Datrcbkb createDatrcbkb() {
        return new Datrcbkb();
    }

    /**
     * Create an instance of {@link GenerateTokenRequest }
     * 
     */
    public GenerateTokenRequest createGenerateTokenRequest() {
        return new GenerateTokenRequest();
    }

    /**
     * Create an instance of {@link DatCredentials }
     * 
     */
    public DatCredentials createDatCredentials() {
        return new DatCredentials();
    }

    /**
     * Create an instance of {@link Datrcpan }
     * 
     */
    public Datrcpan createDatrcpan() {
        return new Datrcpan();
    }

    /**
     * Create an instance of {@link Datrcpkk }
     * 
     */
    public Datrcpkk createDatrcpkk() {
        return new Datrcpkk();
    }

    /**
     * Create an instance of {@link DoLoginRequest }
     * 
     */
    public DoLoginRequest createDoLoginRequest() {
        return new DoLoginRequest();
    }

    /**
     * Create an instance of {@link Datrcpda }
     * 
     */
    public Datrcpda createDatrcpda() {
        return new Datrcpda();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Authentication", name = "authenticateUser")
    public JAXBElement<AuthenticateUser> createAuthenticateUser(AuthenticateUser value) {
        return new JAXBElement<AuthenticateUser>(_AuthenticateUser_QNAME, AuthenticateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateInterfacePartner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Authentication", name = "authenticateInterfacePartner")
    public JAXBElement<AuthenticateInterfacePartner> createAuthenticateInterfacePartner(AuthenticateInterfacePartner value) {
        return new JAXBElement<AuthenticateInterfacePartner>(_AuthenticateInterfacePartner_QNAME, AuthenticateInterfacePartner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Authentication", name = "doLoginResponse")
    public JAXBElement<DoLoginResponse> createDoLoginResponse(DoLoginResponse value) {
        return new JAXBElement<DoLoginResponse>(_DoLoginResponse_QNAME, DoLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoLogout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Authentication", name = "doLogout")
    public JAXBElement<DoLogout> createDoLogout(DoLogout value) {
        return new JAXBElement<DoLogout>(_DoLogout_QNAME, DoLogout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Authentication", name = "generateToken")
    public JAXBElement<GenerateToken> createGenerateToken(GenerateToken value) {
        return new JAXBElement<GenerateToken>(_GenerateToken_QNAME, GenerateToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Authentication", name = "doLogin")
    public JAXBElement<DoLogin> createDoLogin(DoLogin value) {
        return new JAXBElement<DoLogin>(_DoLogin_QNAME, DoLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Authentication", name = "getProductVersion")
    public JAXBElement<GetProductVersion> createGetProductVersion(GetProductVersion value) {
        return new JAXBElement<GetProductVersion>(_GetProductVersion_QNAME, GetProductVersion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Authentication", name = "authenticateUserResponse")
    public JAXBElement<AuthenticateUserResponse> createAuthenticateUserResponse(AuthenticateUserResponse value) {
        return new JAXBElement<AuthenticateUserResponse>(_AuthenticateUserResponse_QNAME, AuthenticateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateInterfacePartnerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Authentication", name = "authenticateInterfacePartnerResponse")
    public JAXBElement<AuthenticateInterfacePartnerResponse> createAuthenticateInterfacePartnerResponse(AuthenticateInterfacePartnerResponse value) {
        return new JAXBElement<AuthenticateInterfacePartnerResponse>(_AuthenticateInterfacePartnerResponse_QNAME, AuthenticateInterfacePartnerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Authentication", name = "generateTokenResponse")
    public JAXBElement<GenerateTokenResponse> createGenerateTokenResponse(GenerateTokenResponse value) {
        return new JAXBElement<GenerateTokenResponse>(_GenerateTokenResponse_QNAME, GenerateTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductVersionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Authentication", name = "getProductVersionResponse")
    public JAXBElement<GetProductVersionResponse> createGetProductVersionResponse(GetProductVersionResponse value) {
        return new JAXBElement<GetProductVersionResponse>(_GetProductVersionResponse_QNAME, GetProductVersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoLogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/Authentication", name = "doLogoutResponse")
    public JAXBElement<DoLogoutResponse> createDoLogoutResponse(DoLogoutResponse value) {
        return new JAXBElement<DoLogoutResponse>(_DoLogoutResponse_QNAME, DoLogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "productVariant", scope = GenerateTokenRequest.class)
    public JAXBElement<String> createGenerateTokenRequestProductVariant(String value) {
        return new JAXBElement<String>(_GenerateTokenRequestProductVariant_QNAME, String.class, GenerateTokenRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "productVariant", scope = DoLoginRequest.class)
    public JAXBElement<String> createDoLoginRequestProductVariant(String value) {
        return new JAXBElement<String>(_GenerateTokenRequestProductVariant_QNAME, String.class, DoLoginRequest.class, value);
    }

}
