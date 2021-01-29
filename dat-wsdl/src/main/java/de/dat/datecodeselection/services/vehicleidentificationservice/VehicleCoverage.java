
package de.dat.datecodeselection.services.vehicleidentificationservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für vehicleCoverage.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="vehicleCoverage">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="WITH_MANUFACTURER_TEXTS"/>
 *     &lt;enumeration value="WITH_PRICE_LIST_TIME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "vehicleCoverage", namespace = "http://sphinx.dat.de/services/VehicleIdentificationService")
@XmlEnum
public enum VehicleCoverage {

    ALL,
    WITH_MANUFACTURER_TEXTS,
    WITH_PRICE_LIST_TIME;

    public String value() {
        return name();
    }

    public static VehicleCoverage fromValue(String v) {
        return valueOf(v);
    }

}
