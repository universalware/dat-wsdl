
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für insuranceType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="insuranceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LIABILITY"/>
 *     &lt;enumeration value="PARTIALLY_COMPREHENSIVE"/>
 *     &lt;enumeration value="FULLY_COMPREHENSIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "insuranceType", namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
@XmlEnum
public enum InsuranceType {

    LIABILITY,
    PARTIALLY_COMPREHENSIVE,
    FULLY_COMPREHENSIVE;

    public String value() {
        return name();
    }

    public static InsuranceType fromValue(String v) {
        return valueOf(v);
    }

}
