
package de.dat.datecodeselection.services.conversionfunctionsservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.dat.datecodeselection.services.conversionfunctionsservice package. 
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

    private final static QName _ConstructionTime2DateResponse_QNAME = new QName("http://sphinx.dat.de/services/ConversionFunctionsService", "constructionTime2DateResponse");
    private final static QName _GetExistingEquipmentNResponse_QNAME = new QName("http://sphinx.dat.de/services/ConversionFunctionsService", "getExistingEquipmentNResponse");
    private final static QName _EquipmentFromManufacturerCodeSelectionRequest_QNAME = new QName("http://sphinx.dat.de/services/ConversionFunctionsService", "equipmentFromManufacturerCodeSelectionRequest");
    private final static QName _ValueCode2Description_QNAME = new QName("http://sphinx.dat.de/services/ConversionFunctionsService", "valueCode2Description");
    private final static QName _ConstructionTime2Date_QNAME = new QName("http://sphinx.dat.de/services/ConversionFunctionsService", "constructionTime2Date");
    private final static QName _VehicleSelectionRequest_QNAME = new QName("http://sphinx.dat.de/services/ConversionFunctionsService", "vehicleSelectionRequest");
    private final static QName _PriceFocusSelectionRequest_QNAME = new QName("http://sphinx.dat.de/services/ConversionFunctionsService", "PriceFocusSelectionRequest");
    private final static QName _Date2ConstructionTimeResponse_QNAME = new QName("http://sphinx.dat.de/services/ConversionFunctionsService", "date2ConstructionTimeResponse");
    private final static QName _ValueCode2DescriptionResponse_QNAME = new QName("http://sphinx.dat.de/services/ConversionFunctionsService", "valueCode2DescriptionResponse");
    private final static QName _GetEquipmentFromManufacturerCodeNResponse_QNAME = new QName("http://sphinx.dat.de/services/ConversionFunctionsService", "getEquipmentFromManufacturerCodeNResponse");
    private final static QName _BaseSelectionRequest_QNAME = new QName("http://sphinx.dat.de/services/ConversionFunctionsService", "BaseSelectionRequest");
    private final static QName _ConstructionPeriodSelectionRequest_QNAME = new QName("http://sphinx.dat.de/services/ConversionFunctionsService", "ConstructionPeriodSelectionRequest");
    private final static QName _GetEquipmentFromManufacturerCodeN_QNAME = new QName("http://sphinx.dat.de/services/ConversionFunctionsService", "getEquipmentFromManufacturerCodeN");
    private final static QName _Date2ConstructionTime_QNAME = new QName("http://sphinx.dat.de/services/ConversionFunctionsService", "date2ConstructionTime");
    private final static QName _GetEquipmentGroups_QNAME = new QName("http://sphinx.dat.de/services/ConversionFunctionsService", "getEquipmentGroups");
    private final static QName _GetExistingEquipmentN_QNAME = new QName("http://sphinx.dat.de/services/ConversionFunctionsService", "getExistingEquipmentN");
    private final static QName _GetEquipmentGroupsResponse_QNAME = new QName("http://sphinx.dat.de/services/ConversionFunctionsService", "getEquipmentGroupsResponse");
    private final static QName _GetPossibleEquipmentNResponse_QNAME = new QName("http://sphinx.dat.de/services/ConversionFunctionsService", "getPossibleEquipmentNResponse");
    private final static QName _GetPossibleEquipmentN_QNAME = new QName("http://sphinx.dat.de/services/ConversionFunctionsService", "getPossibleEquipmentN");
    private final static QName _AbstractSelectionRequest_QNAME = new QName("http://sphinx.dat.de/services/ConversionFunctionsService", "abstractSelectionRequest");
    private final static QName _BasicSelectionRequestConstructionTimeFrom_QNAME = new QName("", "constructionTimeFrom");
    private final static QName _BasicSelectionRequestConstructionTimeTo_QNAME = new QName("", "constructionTimeTo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.dat.datecodeselection.services.conversionfunctionsservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EquipmentPosition }
     * 
     */
    public EquipmentPosition createEquipmentPosition() {
        return new EquipmentPosition();
    }

    /**
     * Create an instance of {@link GetPossibleEquipmentNResponse }
     * 
     */
    public GetPossibleEquipmentNResponse createGetPossibleEquipmentNResponse() {
        return new GetPossibleEquipmentNResponse();
    }

    /**
     * Create an instance of {@link AbstractSelectionRequest }
     * 
     */
    public AbstractSelectionRequest createAbstractSelectionRequest() {
        return new AbstractSelectionRequest();
    }

    /**
     * Create an instance of {@link GetPossibleEquipmentN }
     * 
     */
    public GetPossibleEquipmentN createGetPossibleEquipmentN() {
        return new GetPossibleEquipmentN();
    }

    /**
     * Create an instance of {@link BasicSelectionRequest }
     * 
     */
    public BasicSelectionRequest createBasicSelectionRequest() {
        return new BasicSelectionRequest();
    }

    /**
     * Create an instance of {@link GetEquipmentFromManufacturerCodeNResponse }
     * 
     */
    public GetEquipmentFromManufacturerCodeNResponse createGetEquipmentFromManufacturerCodeNResponse() {
        return new GetEquipmentFromManufacturerCodeNResponse();
    }

    /**
     * Create an instance of {@link GetEquipmentGroupsResponse }
     * 
     */
    public GetEquipmentGroupsResponse createGetEquipmentGroupsResponse() {
        return new GetEquipmentGroupsResponse();
    }

    /**
     * Create an instance of {@link Date2ConstructionTime }
     * 
     */
    public Date2ConstructionTime createDate2ConstructionTime() {
        return new Date2ConstructionTime();
    }

    /**
     * Create an instance of {@link GetEquipmentGroups }
     * 
     */
    public GetEquipmentGroups createGetEquipmentGroups() {
        return new GetEquipmentGroups();
    }

    /**
     * Create an instance of {@link GetExistingEquipmentN }
     * 
     */
    public GetExistingEquipmentN createGetExistingEquipmentN() {
        return new GetExistingEquipmentN();
    }

    /**
     * Create an instance of {@link ConstructionPeriodSelectionRequest }
     * 
     */
    public ConstructionPeriodSelectionRequest createConstructionPeriodSelectionRequest() {
        return new ConstructionPeriodSelectionRequest();
    }

    /**
     * Create an instance of {@link GetEquipmentFromManufacturerCodeN }
     * 
     */
    public GetEquipmentFromManufacturerCodeN createGetEquipmentFromManufacturerCodeN() {
        return new GetEquipmentFromManufacturerCodeN();
    }

    /**
     * Create an instance of {@link VehicleSelectionRequest }
     * 
     */
    public VehicleSelectionRequest createVehicleSelectionRequest() {
        return new VehicleSelectionRequest();
    }

    /**
     * Create an instance of {@link ConstructionTime2Date }
     * 
     */
    public ConstructionTime2Date createConstructionTime2Date() {
        return new ConstructionTime2Date();
    }

    /**
     * Create an instance of {@link EquipmentFromManufacturerCodeSelectionRequest }
     * 
     */
    public EquipmentFromManufacturerCodeSelectionRequest createEquipmentFromManufacturerCodeSelectionRequest() {
        return new EquipmentFromManufacturerCodeSelectionRequest();
    }

    /**
     * Create an instance of {@link ValueCode2Description }
     * 
     */
    public ValueCode2Description createValueCode2Description() {
        return new ValueCode2Description();
    }

    /**
     * Create an instance of {@link Date2ConstructionTimeResponse }
     * 
     */
    public Date2ConstructionTimeResponse createDate2ConstructionTimeResponse() {
        return new Date2ConstructionTimeResponse();
    }

    /**
     * Create an instance of {@link ValueCode2DescriptionResponse }
     * 
     */
    public ValueCode2DescriptionResponse createValueCode2DescriptionResponse() {
        return new ValueCode2DescriptionResponse();
    }

    /**
     * Create an instance of {@link PriceFocusSelectionRequest }
     * 
     */
    public PriceFocusSelectionRequest createPriceFocusSelectionRequest() {
        return new PriceFocusSelectionRequest();
    }

    /**
     * Create an instance of {@link ConstructionTime2DateResponse }
     * 
     */
    public ConstructionTime2DateResponse createConstructionTime2DateResponse() {
        return new ConstructionTime2DateResponse();
    }

    /**
     * Create an instance of {@link GetExistingEquipmentNResponse }
     * 
     */
    public GetExistingEquipmentNResponse createGetExistingEquipmentNResponse() {
        return new GetExistingEquipmentNResponse();
    }

    /**
     * Create an instance of {@link ValueCodeDescription }
     * 
     */
    public ValueCodeDescription createValueCodeDescription() {
        return new ValueCodeDescription();
    }

    /**
     * Create an instance of {@link ConstructionTime2DateSelectionRequest }
     * 
     */
    public ConstructionTime2DateSelectionRequest createConstructionTime2DateSelectionRequest() {
        return new ConstructionTime2DateSelectionRequest();
    }

    /**
     * Create an instance of {@link Locale }
     * 
     */
    public Locale createLocale() {
        return new Locale();
    }

    /**
     * Create an instance of {@link StringStringPair }
     * 
     */
    public StringStringPair createStringStringPair() {
        return new StringStringPair();
    }

    /**
     * Create an instance of {@link Date2ConstructionTimeSelectionRequest }
     * 
     */
    public Date2ConstructionTimeSelectionRequest createDate2ConstructionTimeSelectionRequest() {
        return new Date2ConstructionTimeSelectionRequest();
    }

    /**
     * Create an instance of {@link Equipment }
     * 
     */
    public Equipment createEquipment() {
        return new Equipment();
    }

    /**
     * Create an instance of {@link VXS }
     * 
     */
    public VXS createVXS() {
        return new VXS();
    }

    /**
     * Create an instance of {@link FieldString }
     * 
     */
    public FieldString createFieldString() {
        return new FieldString();
    }

    /**
     * Create an instance of {@link FieldDecimal }
     * 
     */
    public FieldDecimal createFieldDecimal() {
        return new FieldDecimal();
    }

    /**
     * Create an instance of {@link FieldInteger }
     * 
     */
    public FieldInteger createFieldInteger() {
        return new FieldInteger();
    }

    /**
     * Create an instance of {@link FieldString30 }
     * 
     */
    public FieldString30 createFieldString30() {
        return new FieldString30();
    }

    /**
     * Create an instance of {@link EquipSequence }
     * 
     */
    public EquipSequence createEquipSequence() {
        return new EquipSequence();
    }

    /**
     * Create an instance of {@link Equipment2 }
     * 
     */
    public Equipment2 createEquipment2() {
        return new Equipment2();
    }

    /**
     * Create an instance of {@link FieldDate }
     * 
     */
    public FieldDate createFieldDate() {
        return new FieldDate();
    }

    /**
     * Create an instance of {@link FieldBoolean }
     * 
     */
    public FieldBoolean createFieldBoolean() {
        return new FieldBoolean();
    }

    /**
     * Create an instance of {@link FieldCharacter }
     * 
     */
    public FieldCharacter createFieldCharacter() {
        return new FieldCharacter();
    }

    /**
     * Create an instance of {@link EquipmentPosition.ContainedEquipmentPositions }
     * 
     */
    public EquipmentPosition.ContainedEquipmentPositions createEquipmentPositionContainedEquipmentPositions() {
        return new EquipmentPosition.ContainedEquipmentPositions();
    }

    /**
     * Create an instance of {@link FieldString17 }
     * 
     */
    public FieldString17 createFieldString17() {
        return new FieldString17();
    }

    /**
     * Create an instance of {@link FieldString1000 }
     * 
     */
    public FieldString1000 createFieldString1000() {
        return new FieldString1000();
    }

    /**
     * Create an instance of {@link FieldString10 }
     * 
     */
    public FieldString10 createFieldString10() {
        return new FieldString10();
    }

    /**
     * Create an instance of {@link FieldString15 }
     * 
     */
    public FieldString15 createFieldString15() {
        return new FieldString15();
    }

    /**
     * Create an instance of {@link FieldString2 }
     * 
     */
    public FieldString2 createFieldString2() {
        return new FieldString2();
    }

    /**
     * Create an instance of {@link FieldString12 }
     * 
     */
    public FieldString12 createFieldString12() {
        return new FieldString12();
    }

    /**
     * Create an instance of {@link FieldString5 }
     * 
     */
    public FieldString5 createFieldString5() {
        return new FieldString5();
    }

    /**
     * Create an instance of {@link FieldString6 }
     * 
     */
    public FieldString6 createFieldString6() {
        return new FieldString6();
    }

    /**
     * Create an instance of {@link FieldString3 }
     * 
     */
    public FieldString3 createFieldString3() {
        return new FieldString3();
    }

    /**
     * Create an instance of {@link FieldString4 }
     * 
     */
    public FieldString4 createFieldString4() {
        return new FieldString4();
    }

    /**
     * Create an instance of {@link FieldString9 }
     * 
     */
    public FieldString9 createFieldString9() {
        return new FieldString9();
    }

    /**
     * Create an instance of {@link FieldString50 }
     * 
     */
    public FieldString50 createFieldString50() {
        return new FieldString50();
    }

    /**
     * Create an instance of {@link FieldString8 }
     * 
     */
    public FieldString8 createFieldString8() {
        return new FieldString8();
    }

    /**
     * Create an instance of {@link FieldString100 }
     * 
     */
    public FieldString100 createFieldString100() {
        return new FieldString100();
    }

    /**
     * Create an instance of {@link FieldString20 }
     * 
     */
    public FieldString20 createFieldString20() {
        return new FieldString20();
    }

    /**
     * Create an instance of {@link FieldString80 }
     * 
     */
    public FieldString80 createFieldString80() {
        return new FieldString80();
    }

    /**
     * Create an instance of {@link FieldString4000 }
     * 
     */
    public FieldString4000 createFieldString4000() {
        return new FieldString4000();
    }

    /**
     * Create an instance of {@link FieldString40 }
     * 
     */
    public FieldString40 createFieldString40() {
        return new FieldString40();
    }

    /**
     * Create an instance of {@link FieldString60 }
     * 
     */
    public FieldString60 createFieldString60() {
        return new FieldString60();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstructionTime2DateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", name = "constructionTime2DateResponse")
    public JAXBElement<ConstructionTime2DateResponse> createConstructionTime2DateResponse(ConstructionTime2DateResponse value) {
        return new JAXBElement<ConstructionTime2DateResponse>(_ConstructionTime2DateResponse_QNAME, ConstructionTime2DateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExistingEquipmentNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", name = "getExistingEquipmentNResponse")
    public JAXBElement<GetExistingEquipmentNResponse> createGetExistingEquipmentNResponse(GetExistingEquipmentNResponse value) {
        return new JAXBElement<GetExistingEquipmentNResponse>(_GetExistingEquipmentNResponse_QNAME, GetExistingEquipmentNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentFromManufacturerCodeSelectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", name = "equipmentFromManufacturerCodeSelectionRequest")
    public JAXBElement<EquipmentFromManufacturerCodeSelectionRequest> createEquipmentFromManufacturerCodeSelectionRequest(EquipmentFromManufacturerCodeSelectionRequest value) {
        return new JAXBElement<EquipmentFromManufacturerCodeSelectionRequest>(_EquipmentFromManufacturerCodeSelectionRequest_QNAME, EquipmentFromManufacturerCodeSelectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueCode2Description }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", name = "valueCode2Description")
    public JAXBElement<ValueCode2Description> createValueCode2Description(ValueCode2Description value) {
        return new JAXBElement<ValueCode2Description>(_ValueCode2Description_QNAME, ValueCode2Description.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstructionTime2Date }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", name = "constructionTime2Date")
    public JAXBElement<ConstructionTime2Date> createConstructionTime2Date(ConstructionTime2Date value) {
        return new JAXBElement<ConstructionTime2Date>(_ConstructionTime2Date_QNAME, ConstructionTime2Date.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleSelectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", name = "vehicleSelectionRequest")
    public JAXBElement<VehicleSelectionRequest> createVehicleSelectionRequest(VehicleSelectionRequest value) {
        return new JAXBElement<VehicleSelectionRequest>(_VehicleSelectionRequest_QNAME, VehicleSelectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceFocusSelectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", name = "PriceFocusSelectionRequest")
    public JAXBElement<PriceFocusSelectionRequest> createPriceFocusSelectionRequest(PriceFocusSelectionRequest value) {
        return new JAXBElement<PriceFocusSelectionRequest>(_PriceFocusSelectionRequest_QNAME, PriceFocusSelectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Date2ConstructionTimeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", name = "date2ConstructionTimeResponse")
    public JAXBElement<Date2ConstructionTimeResponse> createDate2ConstructionTimeResponse(Date2ConstructionTimeResponse value) {
        return new JAXBElement<Date2ConstructionTimeResponse>(_Date2ConstructionTimeResponse_QNAME, Date2ConstructionTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueCode2DescriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", name = "valueCode2DescriptionResponse")
    public JAXBElement<ValueCode2DescriptionResponse> createValueCode2DescriptionResponse(ValueCode2DescriptionResponse value) {
        return new JAXBElement<ValueCode2DescriptionResponse>(_ValueCode2DescriptionResponse_QNAME, ValueCode2DescriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEquipmentFromManufacturerCodeNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", name = "getEquipmentFromManufacturerCodeNResponse")
    public JAXBElement<GetEquipmentFromManufacturerCodeNResponse> createGetEquipmentFromManufacturerCodeNResponse(GetEquipmentFromManufacturerCodeNResponse value) {
        return new JAXBElement<GetEquipmentFromManufacturerCodeNResponse>(_GetEquipmentFromManufacturerCodeNResponse_QNAME, GetEquipmentFromManufacturerCodeNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasicSelectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", name = "BaseSelectionRequest")
    public JAXBElement<BasicSelectionRequest> createBaseSelectionRequest(BasicSelectionRequest value) {
        return new JAXBElement<BasicSelectionRequest>(_BaseSelectionRequest_QNAME, BasicSelectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstructionPeriodSelectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", name = "ConstructionPeriodSelectionRequest")
    public JAXBElement<ConstructionPeriodSelectionRequest> createConstructionPeriodSelectionRequest(ConstructionPeriodSelectionRequest value) {
        return new JAXBElement<ConstructionPeriodSelectionRequest>(_ConstructionPeriodSelectionRequest_QNAME, ConstructionPeriodSelectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEquipmentFromManufacturerCodeN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", name = "getEquipmentFromManufacturerCodeN")
    public JAXBElement<GetEquipmentFromManufacturerCodeN> createGetEquipmentFromManufacturerCodeN(GetEquipmentFromManufacturerCodeN value) {
        return new JAXBElement<GetEquipmentFromManufacturerCodeN>(_GetEquipmentFromManufacturerCodeN_QNAME, GetEquipmentFromManufacturerCodeN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Date2ConstructionTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", name = "date2ConstructionTime")
    public JAXBElement<Date2ConstructionTime> createDate2ConstructionTime(Date2ConstructionTime value) {
        return new JAXBElement<Date2ConstructionTime>(_Date2ConstructionTime_QNAME, Date2ConstructionTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEquipmentGroups }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", name = "getEquipmentGroups")
    public JAXBElement<GetEquipmentGroups> createGetEquipmentGroups(GetEquipmentGroups value) {
        return new JAXBElement<GetEquipmentGroups>(_GetEquipmentGroups_QNAME, GetEquipmentGroups.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExistingEquipmentN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", name = "getExistingEquipmentN")
    public JAXBElement<GetExistingEquipmentN> createGetExistingEquipmentN(GetExistingEquipmentN value) {
        return new JAXBElement<GetExistingEquipmentN>(_GetExistingEquipmentN_QNAME, GetExistingEquipmentN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEquipmentGroupsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", name = "getEquipmentGroupsResponse")
    public JAXBElement<GetEquipmentGroupsResponse> createGetEquipmentGroupsResponse(GetEquipmentGroupsResponse value) {
        return new JAXBElement<GetEquipmentGroupsResponse>(_GetEquipmentGroupsResponse_QNAME, GetEquipmentGroupsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPossibleEquipmentNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", name = "getPossibleEquipmentNResponse")
    public JAXBElement<GetPossibleEquipmentNResponse> createGetPossibleEquipmentNResponse(GetPossibleEquipmentNResponse value) {
        return new JAXBElement<GetPossibleEquipmentNResponse>(_GetPossibleEquipmentNResponse_QNAME, GetPossibleEquipmentNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPossibleEquipmentN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", name = "getPossibleEquipmentN")
    public JAXBElement<GetPossibleEquipmentN> createGetPossibleEquipmentN(GetPossibleEquipmentN value) {
        return new JAXBElement<GetPossibleEquipmentN>(_GetPossibleEquipmentN_QNAME, GetPossibleEquipmentN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractSelectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sphinx.dat.de/services/ConversionFunctionsService", name = "abstractSelectionRequest")
    public JAXBElement<AbstractSelectionRequest> createAbstractSelectionRequest(AbstractSelectionRequest value) {
        return new JAXBElement<AbstractSelectionRequest>(_AbstractSelectionRequest_QNAME, AbstractSelectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "constructionTimeFrom", scope = BasicSelectionRequest.class)
    public JAXBElement<Integer> createBasicSelectionRequestConstructionTimeFrom(Integer value) {
        return new JAXBElement<Integer>(_BasicSelectionRequestConstructionTimeFrom_QNAME, Integer.class, BasicSelectionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "constructionTimeTo", scope = BasicSelectionRequest.class)
    public JAXBElement<Integer> createBasicSelectionRequestConstructionTimeTo(Integer value) {
        return new JAXBElement<Integer>(_BasicSelectionRequestConstructionTimeTo_QNAME, Integer.class, BasicSelectionRequest.class, value);
    }

}
