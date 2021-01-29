
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für discountType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="discountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="total"/>
 *     &lt;enumeration value="percent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "discountType", namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
@XmlEnum
public enum DiscountType {

    @XmlEnumValue("total")
    TOTAL("total"),
    @XmlEnumValue("percent")
    PERCENT("percent");
    private final String value;

    DiscountType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiscountType fromValue(String v) {
        for (DiscountType c: DiscountType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
