
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für addressKind.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="addressKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="owner"/>
 *     &lt;enumeration value="insurer"/>
 *     &lt;enumeration value="expert"/>
 *     &lt;enumeration value="driver"/>
 *     &lt;enumeration value="repairer"/>
 *     &lt;enumeration value="bodyShop"/>
 *     &lt;enumeration value="paintShop"/>
 *     &lt;enumeration value="inspectionPlace"/>
 *     &lt;enumeration value="opponent"/>
 *     &lt;enumeration value="insurant"/>
 *     &lt;enumeration value="accidentPlace"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "addressKind", namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
@XmlEnum
public enum AddressKind {

    @XmlEnumValue("owner")
    OWNER("owner"),
    @XmlEnumValue("insurer")
    INSURER("insurer"),
    @XmlEnumValue("expert")
    EXPERT("expert"),
    @XmlEnumValue("driver")
    DRIVER("driver"),
    @XmlEnumValue("repairer")
    REPAIRER("repairer"),
    @XmlEnumValue("bodyShop")
    BODY_SHOP("bodyShop"),
    @XmlEnumValue("paintShop")
    PAINT_SHOP("paintShop"),
    @XmlEnumValue("inspectionPlace")
    INSPECTION_PLACE("inspectionPlace"),
    @XmlEnumValue("opponent")
    OPPONENT("opponent"),
    @XmlEnumValue("insurant")
    INSURANT("insurant"),
    @XmlEnumValue("accidentPlace")
    ACCIDENT_PLACE("accidentPlace");
    private final String value;

    AddressKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddressKind fromValue(String v) {
        for (AddressKind c: AddressKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
