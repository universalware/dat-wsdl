
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für customerRole.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="customerRole">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REPAIRER"/>
 *     &lt;enumeration value="INSURANCE"/>
 *     &lt;enumeration value="EXPERT"/>
 *     &lt;enumeration value="MANUFACTURER"/>
 *     &lt;enumeration value="GUEST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "customerRole", namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
@XmlEnum
public enum CustomerRole2 {

    REPAIRER,
    INSURANCE,
    EXPERT,
    MANUFACTURER,
    GUEST;

    public String value() {
        return name();
    }

    public static CustomerRole2 fromValue(String v) {
        return valueOf(v);
    }

}
