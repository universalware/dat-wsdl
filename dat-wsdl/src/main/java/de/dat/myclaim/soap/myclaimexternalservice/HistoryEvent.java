
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für historyEvent.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="historyEvent">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="statusChange"/>
 *     &lt;enumeration value="comment"/>
 *     &lt;enumeration value="assignedUser"/>
 *     &lt;enumeration value="assignedPartner"/>
 *     &lt;enumeration value="resignedUser"/>
 *     &lt;enumeration value="documentsUploaded"/>
 *     &lt;enumeration value="documentDeleted"/>
 *     &lt;enumeration value="settlementsChosen"/>
 *     &lt;enumeration value="dataEdited"/>
 *     &lt;enumeration value="unAssignedPartner"/>
 *     &lt;enumeration value="GDVSent"/>
 *     &lt;enumeration value="dirtyClaim"/>
 *     &lt;enumeration value="GDVIncoming"/>
 *     &lt;enumeration value="emailSent"/>
 *     &lt;enumeration value="audatexImport"/>
 *     &lt;enumeration value="changedAdditionalCosts"/>
 *     &lt;enumeration value="valuation"/>
 *     &lt;enumeration value="purchaseOffer"/>
 *     &lt;enumeration value="purchase"/>
 *     &lt;enumeration value="admission"/>
 *     &lt;enumeration value="salesOffer"/>
 *     &lt;enumeration value="sales"/>
 *     &lt;enumeration value="reservation"/>
 *     &lt;enumeration value="claimUpdated"/>
 *     &lt;enumeration value="emailRequestAssigned"/>
 *     &lt;enumeration value="GDVGeneral"/>
 *     &lt;enumeration value="valuation_vehicle_changed"/>
 *     &lt;enumeration value="valuation_equipment_changed"/>
 *     &lt;enumeration value="repair_vehicle_changed"/>
 *     &lt;enumeration value="repair_equipment_changed"/>
 *     &lt;enumeration value="assignedPartner_role_REPAIRER"/>
 *     &lt;enumeration value="assignedPartner_role_INSURANCE"/>
 *     &lt;enumeration value="assignedPartner_role_EXPERT"/>
 *     &lt;enumeration value="assignedPartner_role_MANUFACTURER"/>
 *     &lt;enumeration value="assignedPartner_role_GUEST"/>
 *     &lt;enumeration value="assignedPartner_role_LAWYER"/>
 *     &lt;enumeration value="assignedPartner_role_FLEET"/>
 *     &lt;enumeration value="assignedPartner_role_OTHER_PARTNER"/>
 *     &lt;enumeration value="fastTrackCalculated"/>
 *     &lt;enumeration value="repair_calculation"/>
 *     &lt;enumeration value="assignedPartner_role_CG_REPAIRER"/>
 *     &lt;enumeration value="assignedPartner_role_CG_EXPERT"/>
 *     &lt;enumeration value="fastTrackInputChanged"/>
 *     &lt;enumeration value="assignedPartner_role_PAINT_SHOP"/>
 *     &lt;enumeration value="assignedPartner_role_TOWING_SERVICE"/>
 *     &lt;enumeration value="assignedPartner_role_BANK"/>
 *     &lt;enumeration value="assignedPartner_role_LEASING_COMPANY"/>
 *     &lt;enumeration value="infoekspertValuation"/>
 *     &lt;enumeration value="workflowChange"/>
 *     &lt;enumeration value="insuranceDataChanged"/>
 *     &lt;enumeration value="tcoCalculated"/>
 *     &lt;enumeration value="tcoCompareCalculated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "historyEvent", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService")
@XmlEnum
public enum HistoryEvent {

    @XmlEnumValue("statusChange")
    STATUS_CHANGE("statusChange"),
    @XmlEnumValue("comment")
    COMMENT("comment"),
    @XmlEnumValue("assignedUser")
    ASSIGNED_USER("assignedUser"),
    @XmlEnumValue("assignedPartner")
    ASSIGNED_PARTNER("assignedPartner"),
    @XmlEnumValue("resignedUser")
    RESIGNED_USER("resignedUser"),
    @XmlEnumValue("documentsUploaded")
    DOCUMENTS_UPLOADED("documentsUploaded"),
    @XmlEnumValue("documentDeleted")
    DOCUMENT_DELETED("documentDeleted"),
    @XmlEnumValue("settlementsChosen")
    SETTLEMENTS_CHOSEN("settlementsChosen"),
    @XmlEnumValue("dataEdited")
    DATA_EDITED("dataEdited"),
    @XmlEnumValue("unAssignedPartner")
    UN_ASSIGNED_PARTNER("unAssignedPartner"),
    @XmlEnumValue("GDVSent")
    GDV_SENT("GDVSent"),
    @XmlEnumValue("dirtyClaim")
    DIRTY_CLAIM("dirtyClaim"),
    @XmlEnumValue("GDVIncoming")
    GDV_INCOMING("GDVIncoming"),
    @XmlEnumValue("emailSent")
    EMAIL_SENT("emailSent"),
    @XmlEnumValue("audatexImport")
    AUDATEX_IMPORT("audatexImport"),
    @XmlEnumValue("changedAdditionalCosts")
    CHANGED_ADDITIONAL_COSTS("changedAdditionalCosts"),
    @XmlEnumValue("valuation")
    VALUATION("valuation"),
    @XmlEnumValue("purchaseOffer")
    PURCHASE_OFFER("purchaseOffer"),
    @XmlEnumValue("purchase")
    PURCHASE("purchase"),
    @XmlEnumValue("admission")
    ADMISSION("admission"),
    @XmlEnumValue("salesOffer")
    SALES_OFFER("salesOffer"),
    @XmlEnumValue("sales")
    SALES("sales"),
    @XmlEnumValue("reservation")
    RESERVATION("reservation"),
    @XmlEnumValue("claimUpdated")
    CLAIM_UPDATED("claimUpdated"),
    @XmlEnumValue("emailRequestAssigned")
    EMAIL_REQUEST_ASSIGNED("emailRequestAssigned"),
    @XmlEnumValue("GDVGeneral")
    GDV_GENERAL("GDVGeneral"),
    @XmlEnumValue("valuation_vehicle_changed")
    VALUATION_VEHICLE_CHANGED("valuation_vehicle_changed"),
    @XmlEnumValue("valuation_equipment_changed")
    VALUATION_EQUIPMENT_CHANGED("valuation_equipment_changed"),
    @XmlEnumValue("repair_vehicle_changed")
    REPAIR_VEHICLE_CHANGED("repair_vehicle_changed"),
    @XmlEnumValue("repair_equipment_changed")
    REPAIR_EQUIPMENT_CHANGED("repair_equipment_changed"),
    @XmlEnumValue("assignedPartner_role_REPAIRER")
    ASSIGNED_PARTNER_ROLE_REPAIRER("assignedPartner_role_REPAIRER"),
    @XmlEnumValue("assignedPartner_role_INSURANCE")
    ASSIGNED_PARTNER_ROLE_INSURANCE("assignedPartner_role_INSURANCE"),
    @XmlEnumValue("assignedPartner_role_EXPERT")
    ASSIGNED_PARTNER_ROLE_EXPERT("assignedPartner_role_EXPERT"),
    @XmlEnumValue("assignedPartner_role_MANUFACTURER")
    ASSIGNED_PARTNER_ROLE_MANUFACTURER("assignedPartner_role_MANUFACTURER"),
    @XmlEnumValue("assignedPartner_role_GUEST")
    ASSIGNED_PARTNER_ROLE_GUEST("assignedPartner_role_GUEST"),
    @XmlEnumValue("assignedPartner_role_LAWYER")
    ASSIGNED_PARTNER_ROLE_LAWYER("assignedPartner_role_LAWYER"),
    @XmlEnumValue("assignedPartner_role_FLEET")
    ASSIGNED_PARTNER_ROLE_FLEET("assignedPartner_role_FLEET"),
    @XmlEnumValue("assignedPartner_role_OTHER_PARTNER")
    ASSIGNED_PARTNER_ROLE_OTHER_PARTNER("assignedPartner_role_OTHER_PARTNER"),
    @XmlEnumValue("fastTrackCalculated")
    FAST_TRACK_CALCULATED("fastTrackCalculated"),
    @XmlEnumValue("repair_calculation")
    REPAIR_CALCULATION("repair_calculation"),
    @XmlEnumValue("assignedPartner_role_CG_REPAIRER")
    ASSIGNED_PARTNER_ROLE_CG_REPAIRER("assignedPartner_role_CG_REPAIRER"),
    @XmlEnumValue("assignedPartner_role_CG_EXPERT")
    ASSIGNED_PARTNER_ROLE_CG_EXPERT("assignedPartner_role_CG_EXPERT"),
    @XmlEnumValue("fastTrackInputChanged")
    FAST_TRACK_INPUT_CHANGED("fastTrackInputChanged"),
    @XmlEnumValue("assignedPartner_role_PAINT_SHOP")
    ASSIGNED_PARTNER_ROLE_PAINT_SHOP("assignedPartner_role_PAINT_SHOP"),
    @XmlEnumValue("assignedPartner_role_TOWING_SERVICE")
    ASSIGNED_PARTNER_ROLE_TOWING_SERVICE("assignedPartner_role_TOWING_SERVICE"),
    @XmlEnumValue("assignedPartner_role_BANK")
    ASSIGNED_PARTNER_ROLE_BANK("assignedPartner_role_BANK"),
    @XmlEnumValue("assignedPartner_role_LEASING_COMPANY")
    ASSIGNED_PARTNER_ROLE_LEASING_COMPANY("assignedPartner_role_LEASING_COMPANY"),
    @XmlEnumValue("infoekspertValuation")
    INFOEKSPERT_VALUATION("infoekspertValuation"),
    @XmlEnumValue("workflowChange")
    WORKFLOW_CHANGE("workflowChange"),
    @XmlEnumValue("insuranceDataChanged")
    INSURANCE_DATA_CHANGED("insuranceDataChanged"),
    @XmlEnumValue("tcoCalculated")
    TCO_CALCULATED("tcoCalculated"),
    @XmlEnumValue("tcoCompareCalculated")
    TCO_COMPARE_CALCULATED("tcoCompareCalculated");
    private final String value;

    HistoryEvent(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HistoryEvent fromValue(String v) {
        for (HistoryEvent c: HistoryEvent.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
