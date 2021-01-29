
package de.dat.datecodeselection.services.vehicleimagery;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.dat.datecodeselection.services.vehicleimagery package. 
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

    private final static QName _VehicleImagesNRequest_QNAME = new QName("http://sphinx.dat.de/services/VehicleImagery", "VehicleImagesNRequest");
    private final static QName _GetVehicleImagesNResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleImagery", "getVehicleImagesNResponse");
    private final static QName _GetVehicleRimImages_QNAME = new QName("http://sphinx.dat.de/services/VehicleImagery", "getVehicleRimImages");
    private final static QName _VehicleRimImagesResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleImagery", "VehicleRimImagesResponse");
    private final static QName _GetVehicleImagesN_QNAME = new QName("http://sphinx.dat.de/services/VehicleImagery", "getVehicleImagesN");
    private final static QName _VehicleRimImagesRequest_QNAME = new QName("http://sphinx.dat.de/services/VehicleImagery", "VehicleRimImagesRequest");
    private final static QName _VehicleImagesNResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleImagery", "VehicleImagesNResponse");
    private final static QName _GetVehicleRimImagesResponse_QNAME = new QName("http://sphinx.dat.de/services/VehicleImagery", "getVehicleRimImagesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.dat.datecodeselection.services.vehicleimagery
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VehicleRimImagesResponse }
     * 
     */
    public VehicleRimImagesResponse createVehicleRimImagesResponse() {
        return new VehicleRimImagesResponse();
    }

    /**
     * Create an instance of {@link VehicleImagesNResponse }
     * 
     */
    public VehicleImagesNResponse createVehicleImagesNResponse() {
        return new VehicleImagesNResponse();
    }

    /**
     * Create an instance of {@link GetVehicleRimImagesResponse }
     * 
     */
    public GetVehicleRimImagesResponse createGetVehicleRimImagesResponse() {
        return new GetVehicleRimImagesResponse();
    }

    /**
     * Create an instance of {@link VehicleRimImage }
     * 
     */
    public VehicleRimImage createVehicleRimImage() {
        return new VehicleRimImage();
    }

    /**
     * Create an instance of {@link VehicleImageN }
     * 
     */
    public VehicleImageN createVehicleImageN() {
        return new VehicleImageN();
    }

    /**
     * Create an instance of {@link VehicleRimImagesRequest }
     * 
     */
    public VehicleRimImagesRequest createVehicleRimImagesRequest() {
        return new VehicleRimImagesRequest();
    }

    /**
     * Create an instance of {@link GetVehicleImagesN }
     * 
     */
    public GetVehicleImagesN createGetVehicleImagesN() {
        return new GetVehicleImagesN();
    }

    /**
     * Create an instance of {@link GetVehicleRimImages }
     * 
     */
    public GetVehicleRimImages createGetVehicleRimImages() {
        return new GetVehicleRimImages();
    }

    /**
     * Create an instance of {@link VehicleImagesNRequest }
     * 
     */
    public VehicleImagesNRequest createVehicleImagesNRequest() {
        return new VehicleImagesNRequest();
    }

    /**
     * Create an instance of {@link GetVehicleImagesNResponse }
     * 
     */
    public GetVehicleImagesNResponse createGetVehicleImagesNResponse() {
        return new GetVehicleImagesNResponse();
    }

    /**
     * Create an instance of {@link Locale }
     * 
     */
    public Locale createLocale() {
        return new Locale();
    }

    /**
     * Create an instance of {@link VehicleRimImagesResponse.RimImages }
     * 
     */
    public VehicleRimImagesResponse.RimImages createVehicleRimImagesResponseRimImages() {
        return new VehicleRimImagesResponse.RimImages();
    }

    /**
     * Create an instance of {@link VehicleImagesNResponse.Images }
     * 
     */
    public VehicleImagesNResponse.Images createVehicleImagesNResponseImages() {
        return new VehicleImagesNResponse.Images();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleImagesNRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleImagery", name = "VehicleImagesNRequest")
    public JAXBElement<VehicleImagesNRequest> createVehicleImagesNRequest(VehicleImagesNRequest value) {
        return new JAXBElement<VehicleImagesNRequest>(_VehicleImagesNRequest_QNAME, VehicleImagesNRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVehicleImagesNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleImagery", name = "getVehicleImagesNResponse")
    public JAXBElement<GetVehicleImagesNResponse> createGetVehicleImagesNResponse(GetVehicleImagesNResponse value) {
        return new JAXBElement<GetVehicleImagesNResponse>(_GetVehicleImagesNResponse_QNAME, GetVehicleImagesNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVehicleRimImages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleImagery", name = "getVehicleRimImages")
    public JAXBElement<GetVehicleRimImages> createGetVehicleRimImages(GetVehicleRimImages value) {
        return new JAXBElement<GetVehicleRimImages>(_GetVehicleRimImages_QNAME, GetVehicleRimImages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleRimImagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleImagery", name = "VehicleRimImagesResponse")
    public JAXBElement<VehicleRimImagesResponse> createVehicleRimImagesResponse(VehicleRimImagesResponse value) {
        return new JAXBElement<VehicleRimImagesResponse>(_VehicleRimImagesResponse_QNAME, VehicleRimImagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVehicleImagesN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleImagery", name = "getVehicleImagesN")
    public JAXBElement<GetVehicleImagesN> createGetVehicleImagesN(GetVehicleImagesN value) {
        return new JAXBElement<GetVehicleImagesN>(_GetVehicleImagesN_QNAME, GetVehicleImagesN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleRimImagesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleImagery", name = "VehicleRimImagesRequest")
    public JAXBElement<VehicleRimImagesRequest> createVehicleRimImagesRequest(VehicleRimImagesRequest value) {
        return new JAXBElement<VehicleRimImagesRequest>(_VehicleRimImagesRequest_QNAME, VehicleRimImagesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleImagesNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleImagery", name = "VehicleImagesNResponse")
    public JAXBElement<VehicleImagesNResponse> createVehicleImagesNResponse(VehicleImagesNResponse value) {
        return new JAXBElement<VehicleImagesNResponse>(_VehicleImagesNResponse_QNAME, VehicleImagesNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVehicleRimImagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/VehicleImagery", name = "getVehicleRimImagesResponse")
    public JAXBElement<GetVehicleRimImagesResponse> createGetVehicleRimImagesResponse(GetVehicleRimImagesResponse value) {
        return new JAXBElement<GetVehicleRimImagesResponse>(_GetVehicleRimImagesResponse_QNAME, GetVehicleRimImagesResponse.class, null, value);
    }

}
