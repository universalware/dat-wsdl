
package de.dat.valuateng.soap.dossier1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="Name" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Description" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="UUID" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ExternalId" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="IdSD2" type="{http://www.dat.de/vxs}fieldString12" minOccurs="0" form="qualified"/>
 *         &lt;element name="IdSDo" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="IdSD3Local" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DossierId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="IdSD3Network" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="IdExtern" type="{http://www.dat.de/vxs}fieldString40" minOccurs="0" form="qualified"/>
 *         &lt;element name="Country" type="{http://www.dat.de/vxs}fieldString3" form="qualified"/>
 *         &lt;element name="Language" type="{http://www.dat.de/vxs}fieldString5" form="qualified"/>
 *         &lt;element name="DataVersion" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="Currency" type="{http://www.dat.de/vxs}fieldString3" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatCustomerId" type="{http://www.dat.de/vxs}fieldString10" minOccurs="0" form="qualified"/>
 *         &lt;element name="MerchandId" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DossierType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DossierOrigin" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="CreateDate" type="{http://www.dat.de/vxs}fieldDateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="CreateUser" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ChangeDate" type="{http://www.dat.de/vxs}fieldDateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="ChangeUser" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="CDYear" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="CDMonth" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatCustomerAddress" type="{http://www.dat.de/vxs}address" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}Vehicle" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}Images" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}ImageList" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}VAT" minOccurs="0"/>
 *         &lt;element name="Management" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}TradingData" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}Valuation" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}Compare" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}RepairCalculation" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}RepairOrder" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}SparePartPositions" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}MaintenanceIntervals" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}Comments" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}Attachments" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}AdditionalVehicles" minOccurs="0"/>
 *         &lt;element name="ChangeUserId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="CreateUserId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="WearCalculation" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="InsuranceClaim" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}AdditionalServices" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}ProcessManagement" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}TradingActivity" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}TradingAdditional" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}MetaPositions" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="overwrite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlRootElement(name = "Dossier")
public class Dossier {

    @XmlElement(name = "Name")
    protected FieldString name;
    @XmlElement(name = "Description")
    protected FieldString description;
    @XmlElement(name = "UUID")
    protected FieldString uuid;
    @XmlElement(name = "ExternalId")
    protected FieldString externalId;
    @XmlElement(name = "IdSD2")
    protected FieldString12 idSD2;
    @XmlElement(name = "IdSDo")
    protected FieldInteger idSDo;
    @XmlElement(name = "IdSD3Local")
    protected FieldInteger idSD3Local;
    @XmlElement(name = "DossierId")
    protected FieldInteger dossierId;
    @XmlElement(name = "IdSD3Network")
    protected FieldInteger idSD3Network;
    @XmlElement(name = "IdExtern")
    protected FieldString40 idExtern;
    @XmlElement(name = "Country", required = true)
    protected FieldString3 country;
    @XmlElement(name = "Language", required = true)
    protected FieldString5 language;
    @XmlElement(name = "DataVersion")
    protected FieldDecimal dataVersion;
    @XmlElement(name = "Currency")
    protected FieldString3 currency;
    @XmlElement(name = "DatCustomerId")
    protected FieldString10 datCustomerId;
    @XmlElement(name = "MerchandId")
    protected FieldDecimal merchandId;
    @XmlElement(name = "DossierType")
    protected FieldString dossierType;
    @XmlElement(name = "DossierOrigin")
    protected FieldString dossierOrigin;
    @XmlElement(name = "CreateDate")
    protected FieldDateTime createDate;
    @XmlElement(name = "CreateUser")
    protected FieldString createUser;
    @XmlElement(name = "ChangeDate")
    protected FieldDateTime changeDate;
    @XmlElement(name = "ChangeUser")
    protected FieldString changeUser;
    @XmlElement(name = "CDYear")
    protected FieldInteger cdYear;
    @XmlElement(name = "CDMonth")
    protected FieldInteger cdMonth;
    @XmlElement(name = "DatCustomerAddress")
    protected Address datCustomerAddress;
    @XmlElement(name = "Vehicle")
    protected Vehicle vehicle;
    @XmlElement(name = "Images")
    protected Images images;
    @XmlElement(name = "ImageList")
    protected ImageList imageList;
    @XmlElement(name = "VAT")
    protected VAT vat;
    @XmlElement(name = "Management")
    protected Object management;
    @XmlElement(name = "TradingData")
    protected TradingData tradingData;
    @XmlElement(name = "Valuation")
    protected Valuation valuation;
    @XmlElement(name = "Compare")
    protected Compare compare;
    @XmlElement(name = "RepairCalculation")
    protected RepairCalculation repairCalculation;
    @XmlElement(name = "RepairOrder")
    protected RepairOrder repairOrder;
    @XmlElement(name = "SparePartPositions")
    protected SparePartPositions sparePartPositions;
    @XmlElement(name = "MaintenanceIntervals")
    protected MaintenanceIntervals maintenanceIntervals;
    @XmlElement(name = "Comments")
    protected Comments comments;
    @XmlElement(name = "Attachments")
    protected Attachments attachments;
    @XmlElement(name = "AdditionalVehicles")
    protected AdditionalVehicles additionalVehicles;
    @XmlElement(name = "ChangeUserId")
    protected FieldInteger changeUserId;
    @XmlElement(name = "CreateUserId")
    protected FieldInteger createUserId;
    @XmlElement(name = "WearCalculation")
    protected FieldBoolean wearCalculation;
    @XmlElement(name = "InsuranceClaim")
    protected FieldBoolean insuranceClaim;
    @XmlElement(name = "AdditionalServices")
    protected AdditionalServices additionalServices;
    @XmlElement(name = "ProcessManagement")
    protected ProcessManagement processManagement;
    @XmlElement(name = "TradingActivity")
    protected TradingActivity tradingActivity;
    @XmlElement(name = "TradingAdditional")
    protected TradingAdditional tradingAdditional;
    @XmlElement(name = "MetaPositions")
    protected MetaPositions metaPositions;
    @XmlAttribute(name = "overwrite")
    protected Boolean overwrite;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setName(FieldString value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDescription(FieldString value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der uuid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getUUID() {
        return uuid;
    }

    /**
     * Legt den Wert der uuid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setUUID(FieldString value) {
        this.uuid = value;
    }

    /**
     * Ruft den Wert der externalId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getExternalId() {
        return externalId;
    }

    /**
     * Legt den Wert der externalId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setExternalId(FieldString value) {
        this.externalId = value;
    }

    /**
     * Ruft den Wert der idSD2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString12 }
     *     
     */
    public FieldString12 getIdSD2() {
        return idSD2;
    }

    /**
     * Legt den Wert der idSD2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString12 }
     *     
     */
    public void setIdSD2(FieldString12 value) {
        this.idSD2 = value;
    }

    /**
     * Ruft den Wert der idSDo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getIdSDo() {
        return idSDo;
    }

    /**
     * Legt den Wert der idSDo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setIdSDo(FieldInteger value) {
        this.idSDo = value;
    }

    /**
     * Ruft den Wert der idSD3Local-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getIdSD3Local() {
        return idSD3Local;
    }

    /**
     * Legt den Wert der idSD3Local-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setIdSD3Local(FieldInteger value) {
        this.idSD3Local = value;
    }

    /**
     * Ruft den Wert der dossierId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDossierId() {
        return dossierId;
    }

    /**
     * Legt den Wert der dossierId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDossierId(FieldInteger value) {
        this.dossierId = value;
    }

    /**
     * Ruft den Wert der idSD3Network-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getIdSD3Network() {
        return idSD3Network;
    }

    /**
     * Legt den Wert der idSD3Network-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setIdSD3Network(FieldInteger value) {
        this.idSD3Network = value;
    }

    /**
     * Ruft den Wert der idExtern-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString40 }
     *     
     */
    public FieldString40 getIdExtern() {
        return idExtern;
    }

    /**
     * Legt den Wert der idExtern-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString40 }
     *     
     */
    public void setIdExtern(FieldString40 value) {
        this.idExtern = value;
    }

    /**
     * Ruft den Wert der country-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString3 }
     *     
     */
    public FieldString3 getCountry() {
        return country;
    }

    /**
     * Legt den Wert der country-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString3 }
     *     
     */
    public void setCountry(FieldString3 value) {
        this.country = value;
    }

    /**
     * Ruft den Wert der language-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString5 }
     *     
     */
    public FieldString5 getLanguage() {
        return language;
    }

    /**
     * Legt den Wert der language-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString5 }
     *     
     */
    public void setLanguage(FieldString5 value) {
        this.language = value;
    }

    /**
     * Ruft den Wert der dataVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDataVersion() {
        return dataVersion;
    }

    /**
     * Legt den Wert der dataVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDataVersion(FieldDecimal value) {
        this.dataVersion = value;
    }

    /**
     * Ruft den Wert der currency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString3 }
     *     
     */
    public FieldString3 getCurrency() {
        return currency;
    }

    /**
     * Legt den Wert der currency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString3 }
     *     
     */
    public void setCurrency(FieldString3 value) {
        this.currency = value;
    }

    /**
     * Ruft den Wert der datCustomerId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString10 }
     *     
     */
    public FieldString10 getDatCustomerId() {
        return datCustomerId;
    }

    /**
     * Legt den Wert der datCustomerId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString10 }
     *     
     */
    public void setDatCustomerId(FieldString10 value) {
        this.datCustomerId = value;
    }

    /**
     * Ruft den Wert der merchandId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getMerchandId() {
        return merchandId;
    }

    /**
     * Legt den Wert der merchandId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setMerchandId(FieldDecimal value) {
        this.merchandId = value;
    }

    /**
     * Ruft den Wert der dossierType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDossierType() {
        return dossierType;
    }

    /**
     * Legt den Wert der dossierType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDossierType(FieldString value) {
        this.dossierType = value;
    }

    /**
     * Ruft den Wert der dossierOrigin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDossierOrigin() {
        return dossierOrigin;
    }

    /**
     * Legt den Wert der dossierOrigin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDossierOrigin(FieldString value) {
        this.dossierOrigin = value;
    }

    /**
     * Ruft den Wert der createDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getCreateDate() {
        return createDate;
    }

    /**
     * Legt den Wert der createDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setCreateDate(FieldDateTime value) {
        this.createDate = value;
    }

    /**
     * Ruft den Wert der createUser-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCreateUser() {
        return createUser;
    }

    /**
     * Legt den Wert der createUser-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCreateUser(FieldString value) {
        this.createUser = value;
    }

    /**
     * Ruft den Wert der changeDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getChangeDate() {
        return changeDate;
    }

    /**
     * Legt den Wert der changeDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setChangeDate(FieldDateTime value) {
        this.changeDate = value;
    }

    /**
     * Ruft den Wert der changeUser-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getChangeUser() {
        return changeUser;
    }

    /**
     * Legt den Wert der changeUser-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setChangeUser(FieldString value) {
        this.changeUser = value;
    }

    /**
     * Ruft den Wert der cdYear-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getCDYear() {
        return cdYear;
    }

    /**
     * Legt den Wert der cdYear-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setCDYear(FieldInteger value) {
        this.cdYear = value;
    }

    /**
     * Ruft den Wert der cdMonth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getCDMonth() {
        return cdMonth;
    }

    /**
     * Legt den Wert der cdMonth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setCDMonth(FieldInteger value) {
        this.cdMonth = value;
    }

    /**
     * Ruft den Wert der datCustomerAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getDatCustomerAddress() {
        return datCustomerAddress;
    }

    /**
     * Legt den Wert der datCustomerAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setDatCustomerAddress(Address value) {
        this.datCustomerAddress = value;
    }

    /**
     * Ruft den Wert der vehicle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle }
     *     
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Legt den Wert der vehicle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle }
     *     
     */
    public void setVehicle(Vehicle value) {
        this.vehicle = value;
    }

    /**
     * Ruft den Wert der images-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Images }
     *     
     */
    public Images getImages() {
        return images;
    }

    /**
     * Legt den Wert der images-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Images }
     *     
     */
    public void setImages(Images value) {
        this.images = value;
    }

    /**
     * Ruft den Wert der imageList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ImageList }
     *     
     */
    public ImageList getImageList() {
        return imageList;
    }

    /**
     * Legt den Wert der imageList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageList }
     *     
     */
    public void setImageList(ImageList value) {
        this.imageList = value;
    }

    /**
     * Ruft den Wert der vat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VAT }
     *     
     */
    public VAT getVAT() {
        return vat;
    }

    /**
     * Legt den Wert der vat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VAT }
     *     
     */
    public void setVAT(VAT value) {
        this.vat = value;
    }

    /**
     * Ruft den Wert der management-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getManagement() {
        return management;
    }

    /**
     * Legt den Wert der management-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setManagement(Object value) {
        this.management = value;
    }

    /**
     * Ruft den Wert der tradingData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TradingData }
     *     
     */
    public TradingData getTradingData() {
        return tradingData;
    }

    /**
     * Legt den Wert der tradingData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingData }
     *     
     */
    public void setTradingData(TradingData value) {
        this.tradingData = value;
    }

    /**
     * Ruft den Wert der valuation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Valuation }
     *     
     */
    public Valuation getValuation() {
        return valuation;
    }

    /**
     * Legt den Wert der valuation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Valuation }
     *     
     */
    public void setValuation(Valuation value) {
        this.valuation = value;
    }

    /**
     * Ruft den Wert der compare-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Compare }
     *     
     */
    public Compare getCompare() {
        return compare;
    }

    /**
     * Legt den Wert der compare-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Compare }
     *     
     */
    public void setCompare(Compare value) {
        this.compare = value;
    }

    /**
     * Ruft den Wert der repairCalculation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RepairCalculation }
     *     
     */
    public RepairCalculation getRepairCalculation() {
        return repairCalculation;
    }

    /**
     * Legt den Wert der repairCalculation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairCalculation }
     *     
     */
    public void setRepairCalculation(RepairCalculation value) {
        this.repairCalculation = value;
    }

    /**
     * Ruft den Wert der repairOrder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RepairOrder }
     *     
     */
    public RepairOrder getRepairOrder() {
        return repairOrder;
    }

    /**
     * Legt den Wert der repairOrder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairOrder }
     *     
     */
    public void setRepairOrder(RepairOrder value) {
        this.repairOrder = value;
    }

    /**
     * Ruft den Wert der sparePartPositions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SparePartPositions }
     *     
     */
    public SparePartPositions getSparePartPositions() {
        return sparePartPositions;
    }

    /**
     * Legt den Wert der sparePartPositions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SparePartPositions }
     *     
     */
    public void setSparePartPositions(SparePartPositions value) {
        this.sparePartPositions = value;
    }

    /**
     * Ruft den Wert der maintenanceIntervals-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceIntervals }
     *     
     */
    public MaintenanceIntervals getMaintenanceIntervals() {
        return maintenanceIntervals;
    }

    /**
     * Legt den Wert der maintenanceIntervals-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceIntervals }
     *     
     */
    public void setMaintenanceIntervals(MaintenanceIntervals value) {
        this.maintenanceIntervals = value;
    }

    /**
     * Ruft den Wert der comments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Comments }
     *     
     */
    public Comments getComments() {
        return comments;
    }

    /**
     * Legt den Wert der comments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Comments }
     *     
     */
    public void setComments(Comments value) {
        this.comments = value;
    }

    /**
     * Ruft den Wert der attachments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Attachments }
     *     
     */
    public Attachments getAttachments() {
        return attachments;
    }

    /**
     * Legt den Wert der attachments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachments }
     *     
     */
    public void setAttachments(Attachments value) {
        this.attachments = value;
    }

    /**
     * Ruft den Wert der additionalVehicles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalVehicles }
     *     
     */
    public AdditionalVehicles getAdditionalVehicles() {
        return additionalVehicles;
    }

    /**
     * Legt den Wert der additionalVehicles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalVehicles }
     *     
     */
    public void setAdditionalVehicles(AdditionalVehicles value) {
        this.additionalVehicles = value;
    }

    /**
     * Ruft den Wert der changeUserId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getChangeUserId() {
        return changeUserId;
    }

    /**
     * Legt den Wert der changeUserId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setChangeUserId(FieldInteger value) {
        this.changeUserId = value;
    }

    /**
     * Ruft den Wert der createUserId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getCreateUserId() {
        return createUserId;
    }

    /**
     * Legt den Wert der createUserId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setCreateUserId(FieldInteger value) {
        this.createUserId = value;
    }

    /**
     * Ruft den Wert der wearCalculation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getWearCalculation() {
        return wearCalculation;
    }

    /**
     * Legt den Wert der wearCalculation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setWearCalculation(FieldBoolean value) {
        this.wearCalculation = value;
    }

    /**
     * Ruft den Wert der insuranceClaim-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getInsuranceClaim() {
        return insuranceClaim;
    }

    /**
     * Legt den Wert der insuranceClaim-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setInsuranceClaim(FieldBoolean value) {
        this.insuranceClaim = value;
    }

    /**
     * Ruft den Wert der additionalServices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalServices }
     *     
     */
    public AdditionalServices getAdditionalServices() {
        return additionalServices;
    }

    /**
     * Legt den Wert der additionalServices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalServices }
     *     
     */
    public void setAdditionalServices(AdditionalServices value) {
        this.additionalServices = value;
    }

    /**
     * Ruft den Wert der processManagement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProcessManagement }
     *     
     */
    public ProcessManagement getProcessManagement() {
        return processManagement;
    }

    /**
     * Legt den Wert der processManagement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessManagement }
     *     
     */
    public void setProcessManagement(ProcessManagement value) {
        this.processManagement = value;
    }

    /**
     * Ruft den Wert der tradingActivity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TradingActivity }
     *     
     */
    public TradingActivity getTradingActivity() {
        return tradingActivity;
    }

    /**
     * Legt den Wert der tradingActivity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingActivity }
     *     
     */
    public void setTradingActivity(TradingActivity value) {
        this.tradingActivity = value;
    }

    /**
     * Ruft den Wert der tradingAdditional-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TradingAdditional }
     *     
     */
    public TradingAdditional getTradingAdditional() {
        return tradingAdditional;
    }

    /**
     * Legt den Wert der tradingAdditional-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingAdditional }
     *     
     */
    public void setTradingAdditional(TradingAdditional value) {
        this.tradingAdditional = value;
    }

    /**
     * Ruft den Wert der metaPositions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetaPositions }
     *     
     */
    public MetaPositions getMetaPositions() {
        return metaPositions;
    }

    /**
     * Legt den Wert der metaPositions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaPositions }
     *     
     */
    public void setMetaPositions(MetaPositions value) {
        this.metaPositions = value;
    }

    /**
     * Ruft den Wert der overwrite-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverwrite() {
        return overwrite;
    }

    /**
     * Legt den Wert der overwrite-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverwrite(Boolean value) {
        this.overwrite = value;
    }

}
