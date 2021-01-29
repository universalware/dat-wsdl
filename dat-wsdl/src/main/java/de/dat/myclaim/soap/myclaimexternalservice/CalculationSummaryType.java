
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für calculationSummaryType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="calculationSummaryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXTERNAL"/>
 *     &lt;enumeration value="MANUAL"/>
 *     &lt;enumeration value="INVOICE"/>
 *     &lt;enumeration value="PAYMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "calculationSummaryType", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService")
@XmlEnum
public enum CalculationSummaryType {

    EXTERNAL,
    MANUAL,
    INVOICE,
    PAYMENT;

    public String value() {
        return name();
    }

    public static CalculationSummaryType fromValue(String v) {
        return valueOf(v);
    }

}
