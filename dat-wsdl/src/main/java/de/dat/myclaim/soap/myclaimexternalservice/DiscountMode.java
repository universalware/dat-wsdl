
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für discountMode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="discountMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABSOLUTE"/>
 *     &lt;enumeration value="PERCENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "discountMode", namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
@XmlEnum
public enum DiscountMode {

    ABSOLUTE,
    PERCENT;

    public String value() {
        return name();
    }

    public static DiscountMode fromValue(String v) {
        return valueOf(v);
    }

}
