
package de.dat.datecodeselection.services.vehicleimagery;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für vehicleImageAspectN.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="vehicleImageAspectN">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="FRONTVIEW"/>
 *     &lt;enumeration value="ANGULARFRONT"/>
 *     &lt;enumeration value="SIDEVIEW"/>
 *     &lt;enumeration value="REARVIEW"/>
 *     &lt;enumeration value="DASHBOARD"/>
 *     &lt;enumeration value="ANGULARREAR"/>
 *     &lt;enumeration value="TRUNK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "vehicleImageAspectN")
@XmlEnum
public enum VehicleImageAspectN {

    ALL,
    FRONTVIEW,
    ANGULARFRONT,
    SIDEVIEW,
    REARVIEW,
    DASHBOARD,
    ANGULARREAR,
    TRUNK;

    public String value() {
        return name();
    }

    public static VehicleImageAspectN fromValue(String v) {
        return valueOf(v);
    }

}
