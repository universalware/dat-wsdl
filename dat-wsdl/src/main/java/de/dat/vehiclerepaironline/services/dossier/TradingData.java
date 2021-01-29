
package de.dat.vehiclerepaironline.services.dossier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="PurchasePriceNet" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PurchasePriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SalesPriceNet" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SalesPriceGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ExportReportState" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="OwnType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ClaimFormId" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="EuVehicle" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="Location" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Owner" type="{http://www.dat.de/vxs}address" minOccurs="0" form="qualified"/>
 *         &lt;element name="PrevOwner" type="{http://www.dat.de/vxs}address" minOccurs="0" form="qualified"/>
 *         &lt;element name="Reservation" type="{http://www.dat.de/vxs}address" minOccurs="0" form="qualified"/>
 *         &lt;element name="Insurance" type="{http://www.dat.de/vxs}address" minOccurs="0" form="qualified"/>
 *         &lt;element name="Insurant" type="{http://www.dat.de/vxs}address" minOccurs="0" form="qualified"/>
 *         &lt;element name="Driver" type="{http://www.dat.de/vxs}address" minOccurs="0" form="qualified"/>
 *         &lt;element name="Garage" type="{http://www.dat.de/vxs}address" minOccurs="0" form="qualified"/>
 *         &lt;element name="Opponent" type="{http://www.dat.de/vxs}address" minOccurs="0" form="qualified"/>
 *         &lt;element name="Expert" type="{http://www.dat.de/vxs}address" minOccurs="0" form="qualified"/>
 *         &lt;element name="Dealership" type="{http://www.dat.de/vxs}address" minOccurs="0" form="qualified"/>
 *         &lt;element name="AccidentPlace" type="{http://www.dat.de/vxs}address" minOccurs="0" form="qualified"/>
 *         &lt;element name="InspectionPlace" type="{http://www.dat.de/vxs}address" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}ClientContactAddresses" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}Prospects" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}AddonList" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "TradingData")
public class TradingData {

    @XmlElement(name = "PurchasePriceNet")
    protected FieldDecimal purchasePriceNet;
    @XmlElement(name = "PurchasePriceGross")
    protected FieldDecimal purchasePriceGross;
    @XmlElement(name = "SalesPriceNet")
    protected FieldDecimal salesPriceNet;
    @XmlElement(name = "SalesPriceGross")
    protected FieldDecimal salesPriceGross;
    @XmlElement(name = "ExportReportState")
    protected FieldString exportReportState;
    @XmlElement(name = "OwnType")
    protected FieldString ownType;
    @XmlElement(name = "ClaimFormId")
    protected FieldString claimFormId;
    @XmlElement(name = "EuVehicle")
    protected FieldBoolean euVehicle;
    @XmlElement(name = "Location")
    protected FieldString location;
    @XmlElement(name = "Owner")
    protected Address owner;
    @XmlElement(name = "PrevOwner")
    protected Address prevOwner;
    @XmlElement(name = "Reservation")
    protected Address reservation;
    @XmlElement(name = "Insurance")
    protected Address insurance;
    @XmlElement(name = "Insurant")
    protected Address insurant;
    @XmlElement(name = "Driver")
    protected Address driver;
    @XmlElement(name = "Garage")
    protected Address garage;
    @XmlElement(name = "Opponent")
    protected Address opponent;
    @XmlElement(name = "Expert")
    protected Address expert;
    @XmlElement(name = "Dealership")
    protected Address dealership;
    @XmlElement(name = "AccidentPlace")
    protected Address accidentPlace;
    @XmlElement(name = "InspectionPlace")
    protected Address inspectionPlace;
    @XmlElement(name = "ClientContactAddresses")
    protected ClientContactAddresses clientContactAddresses;
    @XmlElement(name = "Prospects")
    protected Prospects prospects;
    @XmlElement(name = "AddonList")
    protected AddonList addonList;

    /**
     * Ruft den Wert der purchasePriceNet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPurchasePriceNet() {
        return purchasePriceNet;
    }

    /**
     * Legt den Wert der purchasePriceNet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPurchasePriceNet(FieldDecimal value) {
        this.purchasePriceNet = value;
    }

    /**
     * Ruft den Wert der purchasePriceGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPurchasePriceGross() {
        return purchasePriceGross;
    }

    /**
     * Legt den Wert der purchasePriceGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPurchasePriceGross(FieldDecimal value) {
        this.purchasePriceGross = value;
    }

    /**
     * Ruft den Wert der salesPriceNet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSalesPriceNet() {
        return salesPriceNet;
    }

    /**
     * Legt den Wert der salesPriceNet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSalesPriceNet(FieldDecimal value) {
        this.salesPriceNet = value;
    }

    /**
     * Ruft den Wert der salesPriceGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSalesPriceGross() {
        return salesPriceGross;
    }

    /**
     * Legt den Wert der salesPriceGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSalesPriceGross(FieldDecimal value) {
        this.salesPriceGross = value;
    }

    /**
     * Ruft den Wert der exportReportState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getExportReportState() {
        return exportReportState;
    }

    /**
     * Legt den Wert der exportReportState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setExportReportState(FieldString value) {
        this.exportReportState = value;
    }

    /**
     * Ruft den Wert der ownType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getOwnType() {
        return ownType;
    }

    /**
     * Legt den Wert der ownType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setOwnType(FieldString value) {
        this.ownType = value;
    }

    /**
     * Ruft den Wert der claimFormId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getClaimFormId() {
        return claimFormId;
    }

    /**
     * Legt den Wert der claimFormId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setClaimFormId(FieldString value) {
        this.claimFormId = value;
    }

    /**
     * Ruft den Wert der euVehicle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getEuVehicle() {
        return euVehicle;
    }

    /**
     * Legt den Wert der euVehicle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setEuVehicle(FieldBoolean value) {
        this.euVehicle = value;
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLocation(FieldString value) {
        this.location = value;
    }

    /**
     * Ruft den Wert der owner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getOwner() {
        return owner;
    }

    /**
     * Legt den Wert der owner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setOwner(Address value) {
        this.owner = value;
    }

    /**
     * Ruft den Wert der prevOwner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getPrevOwner() {
        return prevOwner;
    }

    /**
     * Legt den Wert der prevOwner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setPrevOwner(Address value) {
        this.prevOwner = value;
    }

    /**
     * Ruft den Wert der reservation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getReservation() {
        return reservation;
    }

    /**
     * Legt den Wert der reservation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setReservation(Address value) {
        this.reservation = value;
    }

    /**
     * Ruft den Wert der insurance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getInsurance() {
        return insurance;
    }

    /**
     * Legt den Wert der insurance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setInsurance(Address value) {
        this.insurance = value;
    }

    /**
     * Ruft den Wert der insurant-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getInsurant() {
        return insurant;
    }

    /**
     * Legt den Wert der insurant-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setInsurant(Address value) {
        this.insurant = value;
    }

    /**
     * Ruft den Wert der driver-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getDriver() {
        return driver;
    }

    /**
     * Legt den Wert der driver-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setDriver(Address value) {
        this.driver = value;
    }

    /**
     * Ruft den Wert der garage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getGarage() {
        return garage;
    }

    /**
     * Legt den Wert der garage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setGarage(Address value) {
        this.garage = value;
    }

    /**
     * Ruft den Wert der opponent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getOpponent() {
        return opponent;
    }

    /**
     * Legt den Wert der opponent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setOpponent(Address value) {
        this.opponent = value;
    }

    /**
     * Ruft den Wert der expert-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getExpert() {
        return expert;
    }

    /**
     * Legt den Wert der expert-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setExpert(Address value) {
        this.expert = value;
    }

    /**
     * Ruft den Wert der dealership-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getDealership() {
        return dealership;
    }

    /**
     * Legt den Wert der dealership-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setDealership(Address value) {
        this.dealership = value;
    }

    /**
     * Ruft den Wert der accidentPlace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAccidentPlace() {
        return accidentPlace;
    }

    /**
     * Legt den Wert der accidentPlace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAccidentPlace(Address value) {
        this.accidentPlace = value;
    }

    /**
     * Ruft den Wert der inspectionPlace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getInspectionPlace() {
        return inspectionPlace;
    }

    /**
     * Legt den Wert der inspectionPlace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setInspectionPlace(Address value) {
        this.inspectionPlace = value;
    }

    /**
     * Ruft den Wert der clientContactAddresses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClientContactAddresses }
     *     
     */
    public ClientContactAddresses getClientContactAddresses() {
        return clientContactAddresses;
    }

    /**
     * Legt den Wert der clientContactAddresses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientContactAddresses }
     *     
     */
    public void setClientContactAddresses(ClientContactAddresses value) {
        this.clientContactAddresses = value;
    }

    /**
     * Ruft den Wert der prospects-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Prospects }
     *     
     */
    public Prospects getProspects() {
        return prospects;
    }

    /**
     * Legt den Wert der prospects-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Prospects }
     *     
     */
    public void setProspects(Prospects value) {
        this.prospects = value;
    }

    /**
     * Ruft den Wert der addonList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AddonList }
     *     
     */
    public AddonList getAddonList() {
        return addonList;
    }

    /**
     * Legt den Wert der addonList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AddonList }
     *     
     */
    public void setAddonList(AddonList value) {
        this.addonList = value;
    }

}
