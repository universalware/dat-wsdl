
package de.dat.vehiclerepaironline.services.vehicleselectionservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für releaseRestriction.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="releaseRestriction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="REPAIR"/>
 *     &lt;enumeration value="APPRAISAL"/>
 *     &lt;enumeration value="GLASS"/>
 *     &lt;enumeration value="APPRAISALNEW"/>
 *     &lt;enumeration value="APPRAISALSHORT"/>
 *     &lt;enumeration value="TCO"/>
 *     &lt;enumeration value="APPRAISAL_AND_REPAIR"/>
 *     &lt;enumeration value="TCO_NEW"/>
 *     &lt;enumeration value="CA_DATAENGINEERINGMODE"/>
 *     &lt;enumeration value="VA_DATAENGINEERINGMODE"/>
 *     &lt;enumeration value="COMPREHENSIVE"/>
 *     &lt;enumeration value="APPRAISALNEWFORMER"/>
 *     &lt;enumeration value="REPAIR_OR_REPAIR_INCOMPLETE"/>
 *     &lt;enumeration value="COMPREHENSIVE_OR_REPAIR_INCOMPLETE"/>
 *     &lt;enumeration value="ALL_OR_REPAIR_OR_APPRAISAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "releaseRestriction", namespace = "http://sphinx.dat.de/services/VehicleSelectionService")
@XmlEnum
public enum ReleaseRestriction {

    ALL,
    REPAIR,
    APPRAISAL,
    GLASS,
    APPRAISALNEW,
    APPRAISALSHORT,
    TCO,
    APPRAISAL_AND_REPAIR,
    TCO_NEW,
    CA_DATAENGINEERINGMODE,
    VA_DATAENGINEERINGMODE,
    COMPREHENSIVE,
    APPRAISALNEWFORMER,
    REPAIR_OR_REPAIR_INCOMPLETE,
    COMPREHENSIVE_OR_REPAIR_INCOMPLETE,
    ALL_OR_REPAIR_OR_APPRAISAL;

    public String value() {
        return name();
    }

    public static ReleaseRestriction fromValue(String v) {
        return valueOf(v);
    }

}
