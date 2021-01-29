
package de.dat.datecodeselection.services.vehicleimagery;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für vehicleImageFormat.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="vehicleImageFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="JPG"/>
 *     &lt;enumeration value="PNG"/>
 *     &lt;enumeration value="GIF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "vehicleImageFormat")
@XmlEnum
public enum VehicleImageFormat {

    JPG,
    PNG,
    GIF;

    public String value() {
        return name();
    }

    public static VehicleImageFormat fromValue(String v) {
        return valueOf(v);
    }

}
