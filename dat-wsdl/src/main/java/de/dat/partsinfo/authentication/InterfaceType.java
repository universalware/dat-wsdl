
package de.dat.partsinfo.authentication;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für interfaceType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="interfaceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SOAP"/>
 *     &lt;enumeration value="REST"/>
 *     &lt;enumeration value="GUI"/>
 *     &lt;enumeration value="NO_INFO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "interfaceType")
@XmlEnum
public enum InterfaceType {

    SOAP,
    REST,
    GUI,
    NO_INFO;

    public String value() {
        return name();
    }

    public static InterfaceType fromValue(String v) {
        return valueOf(v);
    }

}
