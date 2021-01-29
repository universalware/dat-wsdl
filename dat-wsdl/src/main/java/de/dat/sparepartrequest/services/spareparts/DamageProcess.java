
package de.dat.sparepartrequest.services.spareparts;

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
 *       &lt;sequence>
 *         &lt;element name="RepairDeclarationAvailable" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="SecurityAssignmentAvailable" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="RepairIntentDeclared" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="RepairOrderIssued" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="RegulationAlreadyDone" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="RepairAlreadyDone" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="RegulatedByIntermediaries" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="ClaimsManagementDesired" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="FictitiousBillingDesired" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="AgreementsMade" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="AgreementDescription" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="DamageAlreadyVisited" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="InspectionRequired" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="InspectionComment" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="SubstituteVehicleKind" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="VehicleRetrievalRequired" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="VehicleRetrievalDate" type="{http://www.dat.de/vxs}fieldDateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="VehicleRetrievalComment" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ExpertRequired" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="TarifFeature" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="GdvReferenceNumber" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "repairDeclarationAvailable",
    "securityAssignmentAvailable",
    "repairIntentDeclared",
    "repairOrderIssued",
    "regulationAlreadyDone",
    "repairAlreadyDone",
    "regulatedByIntermediaries",
    "claimsManagementDesired",
    "fictitiousBillingDesired",
    "agreementsMade",
    "agreementDescription",
    "damageAlreadyVisited",
    "inspectionRequired",
    "inspectionComment",
    "substituteVehicleKind",
    "vehicleRetrievalRequired",
    "vehicleRetrievalDate",
    "vehicleRetrievalComment",
    "expertRequired",
    "tarifFeature",
    "gdvReferenceNumber"
})
@XmlRootElement(name = "DamageProcess")
public class DamageProcess {

    @XmlElement(name = "RepairDeclarationAvailable")
    protected FieldBoolean repairDeclarationAvailable;
    @XmlElement(name = "SecurityAssignmentAvailable")
    protected FieldBoolean securityAssignmentAvailable;
    @XmlElement(name = "RepairIntentDeclared")
    protected FieldBoolean repairIntentDeclared;
    @XmlElement(name = "RepairOrderIssued")
    protected FieldBoolean repairOrderIssued;
    @XmlElement(name = "RegulationAlreadyDone")
    protected FieldBoolean regulationAlreadyDone;
    @XmlElement(name = "RepairAlreadyDone")
    protected FieldBoolean repairAlreadyDone;
    @XmlElement(name = "RegulatedByIntermediaries")
    protected FieldBoolean regulatedByIntermediaries;
    @XmlElement(name = "ClaimsManagementDesired")
    protected FieldBoolean claimsManagementDesired;
    @XmlElement(name = "FictitiousBillingDesired")
    protected FieldBoolean fictitiousBillingDesired;
    @XmlElement(name = "AgreementsMade")
    protected FieldBoolean agreementsMade;
    @XmlElement(name = "AgreementDescription")
    protected FieldString agreementDescription;
    @XmlElement(name = "DamageAlreadyVisited")
    protected FieldBoolean damageAlreadyVisited;
    @XmlElement(name = "InspectionRequired")
    protected FieldBoolean inspectionRequired;
    @XmlElement(name = "InspectionComment")
    protected FieldString inspectionComment;
    @XmlElement(name = "SubstituteVehicleKind")
    protected FieldString substituteVehicleKind;
    @XmlElement(name = "VehicleRetrievalRequired")
    protected FieldBoolean vehicleRetrievalRequired;
    @XmlElement(name = "VehicleRetrievalDate")
    protected FieldDateTime vehicleRetrievalDate;
    @XmlElement(name = "VehicleRetrievalComment")
    protected FieldString vehicleRetrievalComment;
    @XmlElement(name = "ExpertRequired")
    protected FieldBoolean expertRequired;
    @XmlElement(name = "TarifFeature")
    protected FieldString tarifFeature;
    @XmlElement(name = "GdvReferenceNumber")
    protected FieldString gdvReferenceNumber;

    /**
     * Ruft den Wert der repairDeclarationAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getRepairDeclarationAvailable() {
        return repairDeclarationAvailable;
    }

    /**
     * Legt den Wert der repairDeclarationAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setRepairDeclarationAvailable(FieldBoolean value) {
        this.repairDeclarationAvailable = value;
    }

    /**
     * Ruft den Wert der securityAssignmentAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getSecurityAssignmentAvailable() {
        return securityAssignmentAvailable;
    }

    /**
     * Legt den Wert der securityAssignmentAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setSecurityAssignmentAvailable(FieldBoolean value) {
        this.securityAssignmentAvailable = value;
    }

    /**
     * Ruft den Wert der repairIntentDeclared-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getRepairIntentDeclared() {
        return repairIntentDeclared;
    }

    /**
     * Legt den Wert der repairIntentDeclared-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setRepairIntentDeclared(FieldBoolean value) {
        this.repairIntentDeclared = value;
    }

    /**
     * Ruft den Wert der repairOrderIssued-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getRepairOrderIssued() {
        return repairOrderIssued;
    }

    /**
     * Legt den Wert der repairOrderIssued-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setRepairOrderIssued(FieldBoolean value) {
        this.repairOrderIssued = value;
    }

    /**
     * Ruft den Wert der regulationAlreadyDone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getRegulationAlreadyDone() {
        return regulationAlreadyDone;
    }

    /**
     * Legt den Wert der regulationAlreadyDone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setRegulationAlreadyDone(FieldBoolean value) {
        this.regulationAlreadyDone = value;
    }

    /**
     * Ruft den Wert der repairAlreadyDone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getRepairAlreadyDone() {
        return repairAlreadyDone;
    }

    /**
     * Legt den Wert der repairAlreadyDone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setRepairAlreadyDone(FieldBoolean value) {
        this.repairAlreadyDone = value;
    }

    /**
     * Ruft den Wert der regulatedByIntermediaries-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getRegulatedByIntermediaries() {
        return regulatedByIntermediaries;
    }

    /**
     * Legt den Wert der regulatedByIntermediaries-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setRegulatedByIntermediaries(FieldBoolean value) {
        this.regulatedByIntermediaries = value;
    }

    /**
     * Ruft den Wert der claimsManagementDesired-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getClaimsManagementDesired() {
        return claimsManagementDesired;
    }

    /**
     * Legt den Wert der claimsManagementDesired-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setClaimsManagementDesired(FieldBoolean value) {
        this.claimsManagementDesired = value;
    }

    /**
     * Ruft den Wert der fictitiousBillingDesired-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getFictitiousBillingDesired() {
        return fictitiousBillingDesired;
    }

    /**
     * Legt den Wert der fictitiousBillingDesired-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setFictitiousBillingDesired(FieldBoolean value) {
        this.fictitiousBillingDesired = value;
    }

    /**
     * Ruft den Wert der agreementsMade-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getAgreementsMade() {
        return agreementsMade;
    }

    /**
     * Legt den Wert der agreementsMade-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setAgreementsMade(FieldBoolean value) {
        this.agreementsMade = value;
    }

    /**
     * Ruft den Wert der agreementDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getAgreementDescription() {
        return agreementDescription;
    }

    /**
     * Legt den Wert der agreementDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setAgreementDescription(FieldString value) {
        this.agreementDescription = value;
    }

    /**
     * Ruft den Wert der damageAlreadyVisited-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getDamageAlreadyVisited() {
        return damageAlreadyVisited;
    }

    /**
     * Legt den Wert der damageAlreadyVisited-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setDamageAlreadyVisited(FieldBoolean value) {
        this.damageAlreadyVisited = value;
    }

    /**
     * Ruft den Wert der inspectionRequired-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getInspectionRequired() {
        return inspectionRequired;
    }

    /**
     * Legt den Wert der inspectionRequired-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setInspectionRequired(FieldBoolean value) {
        this.inspectionRequired = value;
    }

    /**
     * Ruft den Wert der inspectionComment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getInspectionComment() {
        return inspectionComment;
    }

    /**
     * Legt den Wert der inspectionComment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setInspectionComment(FieldString value) {
        this.inspectionComment = value;
    }

    /**
     * Ruft den Wert der substituteVehicleKind-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSubstituteVehicleKind() {
        return substituteVehicleKind;
    }

    /**
     * Legt den Wert der substituteVehicleKind-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSubstituteVehicleKind(FieldString value) {
        this.substituteVehicleKind = value;
    }

    /**
     * Ruft den Wert der vehicleRetrievalRequired-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getVehicleRetrievalRequired() {
        return vehicleRetrievalRequired;
    }

    /**
     * Legt den Wert der vehicleRetrievalRequired-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setVehicleRetrievalRequired(FieldBoolean value) {
        this.vehicleRetrievalRequired = value;
    }

    /**
     * Ruft den Wert der vehicleRetrievalDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getVehicleRetrievalDate() {
        return vehicleRetrievalDate;
    }

    /**
     * Legt den Wert der vehicleRetrievalDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setVehicleRetrievalDate(FieldDateTime value) {
        this.vehicleRetrievalDate = value;
    }

    /**
     * Ruft den Wert der vehicleRetrievalComment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getVehicleRetrievalComment() {
        return vehicleRetrievalComment;
    }

    /**
     * Legt den Wert der vehicleRetrievalComment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setVehicleRetrievalComment(FieldString value) {
        this.vehicleRetrievalComment = value;
    }

    /**
     * Ruft den Wert der expertRequired-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getExpertRequired() {
        return expertRequired;
    }

    /**
     * Legt den Wert der expertRequired-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setExpertRequired(FieldBoolean value) {
        this.expertRequired = value;
    }

    /**
     * Ruft den Wert der tarifFeature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTarifFeature() {
        return tarifFeature;
    }

    /**
     * Legt den Wert der tarifFeature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTarifFeature(FieldString value) {
        this.tarifFeature = value;
    }

    /**
     * Ruft den Wert der gdvReferenceNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getGdvReferenceNumber() {
        return gdvReferenceNumber;
    }

    /**
     * Legt den Wert der gdvReferenceNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setGdvReferenceNumber(FieldString value) {
        this.gdvReferenceNumber = value;
    }

}
