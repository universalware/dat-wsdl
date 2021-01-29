
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für smallPartsBase.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="smallPartsBase">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="flatAmount"/>
 *     &lt;enumeration value="sparePartTotal"/>
 *     &lt;enumeration value="laborTotal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "smallPartsBase", namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
@XmlEnum
public enum SmallPartsBase {

    @XmlEnumValue("flatAmount")
    FLAT_AMOUNT("flatAmount"),
    @XmlEnumValue("sparePartTotal")
    SPARE_PART_TOTAL("sparePartTotal"),
    @XmlEnumValue("laborTotal")
    LABOR_TOTAL("laborTotal");
    private final String value;

    SmallPartsBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SmallPartsBase fromValue(String v) {
        for (SmallPartsBase c: SmallPartsBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
