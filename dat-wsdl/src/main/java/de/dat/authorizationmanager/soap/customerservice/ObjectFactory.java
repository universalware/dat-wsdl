
package de.dat.authorizationmanager.soap.customerservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.dat.authorizationmanager.soap.customerservice package. 
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

    private final static QName _CreateCustomerResponse_QNAME = new QName("http://sphinx.dat.de/cs", "createCustomerResponse");
    private final static QName _GetUser_QNAME = new QName("http://sphinx.dat.de/cs", "getUser");
    private final static QName _CreateCustomer_QNAME = new QName("http://sphinx.dat.de/cs", "createCustomer");
    private final static QName _CreateOrUpdateUserResponse_QNAME = new QName("http://sphinx.dat.de/cs", "createOrUpdateUserResponse");
    private final static QName _GetUserResponse_QNAME = new QName("http://sphinx.dat.de/cs", "getUserResponse");
    private final static QName _DisableCustomerResponse_QNAME = new QName("http://sphinx.dat.de/cs", "disableCustomerResponse");
    private final static QName _DisableCustomer_QNAME = new QName("http://sphinx.dat.de/cs", "disableCustomer");
    private final static QName _CreateOrUpdateUser_QNAME = new QName("http://sphinx.dat.de/cs", "createOrUpdateUser");
    private final static QName _UpdateCustomer_QNAME = new QName("http://sphinx.dat.de/cs", "updateCustomer");
    private final static QName _UpdateCustomerResponse_QNAME = new QName("http://sphinx.dat.de/cs", "updateCustomerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.dat.authorizationmanager.soap.customerservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateOrUpdateUserResponse }
     * 
     */
    public CreateOrUpdateUserResponse createCreateOrUpdateUserResponse() {
        return new CreateOrUpdateUserResponse();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link CreateCustomer }
     * 
     */
    public CreateCustomer createCreateCustomer() {
        return new CreateCustomer();
    }

    /**
     * Create an instance of {@link CreateCustomerResponse }
     * 
     */
    public CreateCustomerResponse createCreateCustomerResponse() {
        return new CreateCustomerResponse();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link UpdateCustomer }
     * 
     */
    public UpdateCustomer createUpdateCustomer() {
        return new UpdateCustomer();
    }

    /**
     * Create an instance of {@link UpdateCustomerResponse }
     * 
     */
    public UpdateCustomerResponse createUpdateCustomerResponse() {
        return new UpdateCustomerResponse();
    }

    /**
     * Create an instance of {@link DisableCustomer }
     * 
     */
    public DisableCustomer createDisableCustomer() {
        return new DisableCustomer();
    }

    /**
     * Create an instance of {@link CreateOrUpdateUser }
     * 
     */
    public CreateOrUpdateUser createCreateOrUpdateUser() {
        return new CreateOrUpdateUser();
    }

    /**
     * Create an instance of {@link DisableCustomerResponse }
     * 
     */
    public DisableCustomerResponse createDisableCustomerResponse() {
        return new DisableCustomerResponse();
    }

    /**
     * Create an instance of {@link UserData }
     * 
     */
    public UserData createUserData() {
        return new UserData();
    }

    /**
     * Create an instance of {@link CustomerData }
     * 
     */
    public CustomerData createCustomerData() {
        return new CustomerData();
    }

    /**
     * Create an instance of {@link CustomerDataExt }
     * 
     */
    public CustomerDataExt createCustomerDataExt() {
        return new CustomerDataExt();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/cs", name = "createCustomerResponse")
    public JAXBElement<CreateCustomerResponse> createCreateCustomerResponse(CreateCustomerResponse value) {
        return new JAXBElement<CreateCustomerResponse>(_CreateCustomerResponse_QNAME, CreateCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/cs", name = "getUser")
    public JAXBElement<GetUser> createGetUser(GetUser value) {
        return new JAXBElement<GetUser>(_GetUser_QNAME, GetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/cs", name = "createCustomer")
    public JAXBElement<CreateCustomer> createCreateCustomer(CreateCustomer value) {
        return new JAXBElement<CreateCustomer>(_CreateCustomer_QNAME, CreateCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrUpdateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/cs", name = "createOrUpdateUserResponse")
    public JAXBElement<CreateOrUpdateUserResponse> createCreateOrUpdateUserResponse(CreateOrUpdateUserResponse value) {
        return new JAXBElement<CreateOrUpdateUserResponse>(_CreateOrUpdateUserResponse_QNAME, CreateOrUpdateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/cs", name = "getUserResponse")
    public JAXBElement<GetUserResponse> createGetUserResponse(GetUserResponse value) {
        return new JAXBElement<GetUserResponse>(_GetUserResponse_QNAME, GetUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisableCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/cs", name = "disableCustomerResponse")
    public JAXBElement<DisableCustomerResponse> createDisableCustomerResponse(DisableCustomerResponse value) {
        return new JAXBElement<DisableCustomerResponse>(_DisableCustomerResponse_QNAME, DisableCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisableCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/cs", name = "disableCustomer")
    public JAXBElement<DisableCustomer> createDisableCustomer(DisableCustomer value) {
        return new JAXBElement<DisableCustomer>(_DisableCustomer_QNAME, DisableCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrUpdateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/cs", name = "createOrUpdateUser")
    public JAXBElement<CreateOrUpdateUser> createCreateOrUpdateUser(CreateOrUpdateUser value) {
        return new JAXBElement<CreateOrUpdateUser>(_CreateOrUpdateUser_QNAME, CreateOrUpdateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/cs", name = "updateCustomer")
    public JAXBElement<UpdateCustomer> createUpdateCustomer(UpdateCustomer value) {
        return new JAXBElement<UpdateCustomer>(_UpdateCustomer_QNAME, UpdateCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/cs", name = "updateCustomerResponse")
    public JAXBElement<UpdateCustomerResponse> createUpdateCustomerResponse(UpdateCustomerResponse value) {
        return new JAXBElement<UpdateCustomerResponse>(_UpdateCustomerResponse_QNAME, UpdateCustomerResponse.class, null, value);
    }

}
