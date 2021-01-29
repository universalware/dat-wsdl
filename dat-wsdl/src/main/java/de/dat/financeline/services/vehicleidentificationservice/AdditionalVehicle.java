
package de.dat.financeline.services.vehicleidentificationservice;

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
 *         &lt;element name="Name" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Description" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ExternalId" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="IdSD2" type="{http://www.dat.de/vxs}fieldString12" minOccurs="0" form="qualified"/>
 *         &lt;element name="IdSDo" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="IdExtern" type="{http://www.dat.de/vxs}fieldString40" minOccurs="0" form="qualified"/>
 *         &lt;element name="Country" type="{http://www.dat.de/vxs}fieldString3" minOccurs="0" form="qualified"/>
 *         &lt;element name="Language" type="{http://www.dat.de/vxs}fieldString5" minOccurs="0" form="qualified"/>
 *         &lt;element name="Currency" type="{http://www.dat.de/vxs}fieldString3" minOccurs="0" form="qualified"/>
 *         &lt;element name="UsageType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="CDYear" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="CDMonth" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}Vehicle" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}Images" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}VAT" minOccurs="0"/>
 *         &lt;element name="Management" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}TradingData" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}Valuation" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}RepairCalculation" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}RepairOrder" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}SparePartPositions" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}MaintenanceIntervals" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}Comments" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}Attachments" minOccurs="0"/>
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
@XmlRootElement(name = "AdditionalVehicle")
public class AdditionalVehicle {

    @XmlElement(name = "Name")
    protected FieldString name;
    @XmlElement(name = "Description")
    protected FieldString description;
    @XmlElement(name = "ExternalId")
    protected FieldString externalId;
    @XmlElement(name = "IdSD2")
    protected FieldString12 idSD2;
    @XmlElement(name = "IdSDo")
    protected FieldInteger idSDo;
    @XmlElement(name = "IdExtern")
    protected FieldString40 idExtern;
    @XmlElement(name = "Country")
    protected FieldString3 country;
    @XmlElement(name = "Language")
    protected FieldString5 language;
    @XmlElement(name = "Currency")
    protected FieldString3 currency;
    @XmlElement(name = "UsageType")
    protected FieldString usageType;
    @XmlElement(name = "CDYear")
    protected FieldInteger cdYear;
    @XmlElement(name = "CDMonth")
    protected FieldInteger cdMonth;
    @XmlElement(name = "Vehicle")
    protected Vehicle vehicle;
    @XmlElement(name = "Images")
    protected Images images;
    @XmlElement(name = "VAT")
    protected VAT vat;
    @XmlElement(name = "Management")
    protected Object management;
    @XmlElement(name = "TradingData")
    protected TradingData tradingData;
    @XmlElement(name = "Valuation")
    protected Valuation valuation;
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
     * Ruft den Wert der usageType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getUsageType() {
        return usageType;
    }

    /**
     * Legt den Wert der usageType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setUsageType(FieldString value) {
        this.usageType = value;
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

}
