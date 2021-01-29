
package de.dat.glassrep.services.vehicleidentificationservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für manufacturerToyota.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="manufacturerToyota">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TOYOTA"/>
 *     &lt;enumeration value="LEXUS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "manufacturerToyota", namespace = "http://sphinx.dat.de/services/VehicleIdentificationService")
@XmlEnum
public enum ManufacturerToyota {

    TOYOTA,
    LEXUS;

    public String value() {
        return name();
    }

    public static ManufacturerToyota fromValue(String v) {
        return valueOf(v);
    }

}
