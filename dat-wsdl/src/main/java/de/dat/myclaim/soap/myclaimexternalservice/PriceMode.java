
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für priceMode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="priceMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABSOLUTE"/>
 *     &lt;enumeration value="PER_HOUR"/>
 *     &lt;enumeration value="PER_TIME_SYSTEM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "priceMode", namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
@XmlEnum
public enum PriceMode {

    ABSOLUTE,
    PER_HOUR,
    PER_TIME_SYSTEM;

    public String value() {
        return name();
    }

    public static PriceMode fromValue(String v) {
        return valueOf(v);
    }

}
