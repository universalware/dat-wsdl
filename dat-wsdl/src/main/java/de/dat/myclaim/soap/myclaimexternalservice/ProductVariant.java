
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für productVariant.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="productVariant">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="myClaim"/>
 *     &lt;enumeration value="fiOnline"/>
 *     &lt;enumeration value="calculateExpert"/>
 *     &lt;enumeration value="calculateFinish"/>
 *     &lt;enumeration value="calculateItalia"/>
 *     &lt;enumeration value="sd2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "productVariant", namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
@XmlEnum
public enum ProductVariant {

    @XmlEnumValue("myClaim")
    MY_CLAIM("myClaim"),
    @XmlEnumValue("fiOnline")
    FI_ONLINE("fiOnline"),
    @XmlEnumValue("calculateExpert")
    CALCULATE_EXPERT("calculateExpert"),
    @XmlEnumValue("calculateFinish")
    CALCULATE_FINISH("calculateFinish"),
    @XmlEnumValue("calculateItalia")
    CALCULATE_ITALIA("calculateItalia"),
    @XmlEnumValue("sd2")
    SD_2("sd2");
    private final String value;

    ProductVariant(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductVariant fromValue(String v) {
        for (ProductVariant c: ProductVariant.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
